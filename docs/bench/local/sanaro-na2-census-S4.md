# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 71.3 | 72 / 420 | 3.58 | 13.1% | 31126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.8% | 148 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.9% | 90 |
| hadur117.nano.SanaroS4 0.4 | 3.1 | 13.1% | 72 |
| bzdp.Pansy 2.1 | 3.3 | 12.8% | 51 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.4% | 7 |
| tvv.nano.Polaris 1.2 | 5.9 | 9.2% | 27 |
| zyx.nano.Ant 1.1 | 6.9 | 8.4% | 5 |
| fm.claire 1.7 | 7.7 | 7.9% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.4% | 13 |
| arthord.MannyPacquiao Beta | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 65.4 | 3 / 35 | 2432 |
| 2 | 3 | 57.8 | 70.2 | 6 / 35 | 2172 |
| 3 | 4 | 58.4 | 69.5 | 4 / 35 | 2602 |
| 4 | 3 | 60.2 | 73.7 | 7 / 35 | 2683 |
| 5 | 3 | 59.2 | 70.2 | 8 / 35 | 2694 |
| 6 | 3 | 60.2 | 74.0 | 7 / 35 | 2381 |
| 7 | 4 | 57.5 | 65.7 | 4 / 35 | 2596 |
| 8 | 1 | 61.7 | 79.7 | 8 / 35 | 2833 |
| 9 | 5 | 55.4 | 63.2 | 3 / 35 | 2225 |
| 10 | 2 | 62.0 | 79.0 | 9 / 35 | 2768 |
| 11 | 3 | 58.9 | 71.4 | 6 / 35 | 2481 |
| 12 | 2 | 61.2 | 74.0 | 7 / 35 | 3259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 62 | 18% |
| d414.nano.Quantum 1.0.0 | 59 | 19% |
| bzdp.Pansy 2.1 | 42 | 55% |
| tvv.nano.Polaris 1.2 | 14 | 36% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| arthord.MannyPacquiao Beta | 4 | 100% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 349 of 420 rounds, at a mean tick of 1130. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 29% | 113 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 83 | 24% | 101 |
| bzdp.Pansy 2.1 | 61 | 17% | 84 |
| arthord.NanoSatanMelee Beta | 38 | 11% | 44 |
| tvv.nano.Polaris 1.2 | 24 | 7% | 26 |
| zyx.nano.Ant 1.1 | 21 | 6% | 23 |
| fm.claire 1.7 | 15 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 1% | 10 |
| arthord.MannyPacquiao Beta | 1 | 0% | 4 |

## Melee bench: F02

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 70.3 | 68 / 420 | 3.67 | 12.7% | 29495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.7% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.3% | 61 |
| hadur117.nano.SanaroS4 0.4 | 3.1 | 12.7% | 68 |
| simonton.nano.MeleeSeed 1.8 | 3.4 | 12.5% | 49 |
| DBall.Anarchy 0.1 | 5.3 | 10.9% | 54 |
| fm.mammillarias 1.3 | 5.9 | 10.2% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 9.0% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.2% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.4% | 15 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.7 | 68.6 | 4 / 35 | 2696 |
| 2 | 3 | 58.7 | 72.7 | 4 / 35 | 2402 |
| 3 | 3 | 59.5 | 72.4 | 7 / 35 | 2435 |
| 4 | 3 | 60.8 | 75.2 | 10 / 35 | 2478 |
| 5 | 2 | 59.9 | 76.2 | 6 / 35 | 2284 |
| 6 | 4 | 56.7 | 67.9 | 2 / 35 | 2435 |
| 7 | 2 | 59.7 | 73.3 | 8 / 35 | 2531 |
| 8 | 3 | 58.6 | 73.3 | 4 / 35 | 2372 |
| 9 | 3 | 57.6 | 66.3 | 6 / 35 | 2574 |
| 10 | 5 | 53.7 | 59.7 | 2 / 35 | 2436 |
| 11 | 2 | 57.7 | 66.3 | 8 / 35 | 2672 |
| 12 | 3 | 58.5 | 71.4 | 7 / 35 | 2180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 15% |
| d414.nano.Quantum 1.0.0 | 38 | 16% |
| DBall.Anarchy 0.1 | 37 | 62% |
| stelo.SoJNanoMelee 1.1 | 25 | 40% |
| simonton.nano.MeleeSeed 1.8 | 20 | 70% |
| sample.MyFirstRobot 1.0 | 10 | 20% |
| fm.mammillarias 1.3 | 10 | 60% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 353 of 420 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 92 | 26% | 98 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 20% | 82 |
| fm.mammillarias 1.3 | 50 | 14% | 51 |
| simonton.nano.MeleeSeed 1.8 | 43 | 12% | 58 |
| stelo.SoJNanoMelee 1.1 | 42 | 12% | 49 |
| DBall.Anarchy 0.1 | 25 | 7% | 49 |
| mn.nano.perceptual.Impact 1.3.0 | 14 | 4% | 14 |
| sample.MyFirstRobot 1.0 | 13 | 4% | 16 |
| rrh.Iwillfindyou 2.0 | 3 | 1% | 3 |

## Melee bench: F03

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 73.4 | 59 / 420 | 3.40 | 13.7% | 39747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.1% | 138 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.3% | 94 |
| hadur117.nano.SanaroS4 0.4 | 2.7 | 13.7% | 59 |
| ahf.NanoAndrew .4 | 4.2 | 12.0% | 56 |
| ratosh.Nobo 0.21 | 5.1 | 10.7% | 18 |
| timmit.nano.TimDog 0.33 | 5.9 | 9.4% | 15 |
| stelo.PatternRobot 1.0 | 6.9 | 7.8% | 30 |
| sample.Crazy 1.0 | 8.3 | 5.8% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 5.8% | 5 |
| kurios.DOSexe .9a | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 71.4 | 3 / 35 | 3008 |
| 2 | 3 | 60.6 | 74.3 | 6 / 35 | 3264 |
| 3 | 3 | 59.5 | 73.0 | 3 / 35 | 3138 |
| 4 | 3 | 60.9 | 74.3 | 5 / 35 | 3330 |
| 5 | 2 | 60.5 | 74.3 | 4 / 35 | 3335 |
| 6 | 3 | 58.7 | 68.9 | 3 / 35 | 3244 |
| 7 | 3 | 59.2 | 67.0 | 4 / 35 | 3698 |
| 8 | 3 | 59.5 | 69.2 | 6 / 35 | 3243 |
| 9 | 2 | 63.9 | 81.6 | 6 / 35 | 3615 |
| 10 | 3 | 61.7 | 77.1 | 7 / 35 | 3286 |
| 11 | 2 | 62.2 | 76.8 | 7 / 35 | 3484 |
| 12 | 2 | 59.4 | 72.4 | 5 / 35 | 3102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 17% |
| d414.nano.Quantum 1.0.0 | 74 | 14% |
| ahf.NanoAndrew .4 | 22 | 55% |
| stelo.PatternRobot 1.0 | 15 | 33% |
| ratosh.Nobo 0.21 | 13 | 62% |
| timmit.nano.TimDog 0.33 | 6 | 83% |
| sample.Crazy 1.0 | 4 | 75% |
| repositorio.NanoStep 1.0 | 4 | 75% |

Hadur died in 361 of 420 rounds, at a mean tick of 1241. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 113 | 31% | 124 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 91 | 25% | 104 |
| ahf.NanoAndrew .4 | 51 | 14% | 66 |
| stelo.PatternRobot 1.0 | 38 | 11% | 43 |
| ratosh.Nobo 0.21 | 32 | 9% | 40 |
| timmit.nano.TimDog 0.33 | 17 | 5% | 21 |
| repositorio.NanoStep 1.0 | 9 | 2% | 10 |
| sample.Crazy 1.0 | 5 | 1% | 7 |
| kurios.DOSexe .9a | 5 | 1% | 5 |

## Melee bench: F04

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 12 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.9 | 76 / 420 | 2.90 | 15.0% | 50524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 18.1% | 178 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.5% | 126 |
| hadur117.nano.SanaroS4 0.4 | 3.1 | 15.0% | 76 |
| wompi.Quokka 1.6 | 3.8 | 13.6% | 27 |
| kurios.DOSexe .9b | 5.8 | 7.4% | 5 |
| maribo.FollowFire 1 | 6.3 | 6.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.8 | 6.6% | 3 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 4 |
| sample.VelociRobot 1.0 | 8.8 | 5.7% | 1 |
| drd.Dreadknoght 0.9 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 81.6 | 7 / 35 | 4073 |
| 2 | 4 | 62.4 | 76.2 | 6 / 35 | 3875 |
| 3 | 3 | 64.6 | 81.0 | 9 / 35 | 4208 |
| 4 | 4 | 63.3 | 78.4 | 6 / 35 | 4061 |
| 5 | 2 | 64.6 | 83.5 | 7 / 35 | 4411 |
| 6 | 3 | 60.6 | 70.5 | 4 / 35 | 4056 |
| 7 | 3 | 64.7 | 81.0 | 9 / 35 | 4296 |
| 8 | 3 | 61.8 | 70.5 | 4 / 35 | 4181 |
| 9 | 3 | 65.4 | 84.1 | 8 / 35 | 4539 |
| 10 | 3 | 62.2 | 74.9 | 6 / 35 | 4171 |
| 11 | 3 | 64.2 | 83.8 | 5 / 35 | 3969 |
| 12 | 3 | 64.8 | 81.0 | 5 / 35 | 4684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 118 | 14% |
| d414.nano.Quantum 1.0.0 | 99 | 20% |
| wompi.Quokka 1.6 | 37 | 89% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 344 of 420 rounds, at a mean tick of 1938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 142 | 41% | 169 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 133 | 39% | 153 |
| wompi.Quokka 1.6 | 36 | 10% | 57 |
| maribo.FollowFire 1 | 12 | 3% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 2% | 11 |
| kurios.DOSexe .9b | 6 | 2% | 8 |
| jangs.ns51 1.0 | 4 | 1% | 4 |
| sample.VelociRobot 1.0 | 3 | 1% | 6 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 75.4 | 62 / 420 | 3.21 | 14.0% | 43898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.7% | 191 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 15.2% | 103 |
| hadur117.nano.SanaroS4 0.4 | 3.0 | 14.0% | 62 |
| ntc.Opposite 1.5 | 4.7 | 11.7% | 12 |
| js.PinBall 1.6 | 4.8 | 11.5% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.6 | 10.6% | 13 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.3% | 15 |
| sample.Fire 1.0 | 8.2 | 4.6% | 3 |
| PSW.Relentless 0.1 | 8.8 | 4.4% | 0 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 79.7 | 6 / 35 | 3529 |
| 2 | 3 | 61.9 | 74.0 | 6 / 35 | 3913 |
| 3 | 3 | 61.0 | 69.5 | 1 / 35 | 4155 |
| 4 | 3 | 64.2 | 82.5 | 6 / 35 | 3987 |
| 5 | 3 | 61.2 | 72.7 | 5 / 35 | 3715 |
| 6 | 3 | 62.8 | 77.5 | 5 / 35 | 3697 |
| 7 | 3 | 62.7 | 77.1 | 6 / 35 | 3622 |
| 8 | 3 | 61.6 | 73.7 | 6 / 35 | 3466 |
| 9 | 3 | 61.6 | 74.3 | 6 / 35 | 3553 |
| 10 | 3 | 62.7 | 76.5 | 8 / 35 | 3802 |
| 11 | 3 | 61.8 | 78.4 | 5 / 35 | 3172 |
| 12 | 3 | 59.2 | 69.2 | 2 / 35 | 3287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 97 | 12% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 86 | 16% |
| js.PinBall 1.6 | 18 | 78% |
| sp.Nanos.Ember 1.1 | 14 | 64% |
| ntc.Opposite 1.5 | 8 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 75% |
| sample.Fire 1.0 | 2 | 0% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 360 of 420 rounds, at a mean tick of 1476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 140 | 39% | 154 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 96 | 27% | 113 |
| ntc.Opposite 1.5 | 50 | 14% | 54 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 8% | 32 |
| js.PinBall 1.6 | 24 | 7% | 38 |
| sp.Nanos.Ember 1.1 | 10 | 3% | 16 |
| PSW.Relentless 0.1 | 8 | 2% | 8 |
| sample.Fire 1.0 | 4 | 1% | 5 |

## Melee bench: F06

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 69.6 | 42 / 420 | 3.74 | 12.4% | 30005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.4 | 14.4% | 116 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.9% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.6% | 70 |
| radnor.DoctorBob 1.42 | 4.0 | 12.7% | 54 |
| hadur117.nano.SanaroS4 0.4 | 4.0 | 12.4% | 42 |
| myl.nano.Graviton 1.10 | 5.9 | 10.8% | 40 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.6% | 3 |
| ratosh.Wesco 1.4 | 8.1 | 7.2% | 5 |
| stelo.MirrorNano 1.3 | 8.1 | 7.5% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.1 | 60.3 | 3 / 35 | 2287 |
| 2 | 5 | 57.1 | 67.3 | 1 / 35 | 2285 |
| 3 | 4 | 58.4 | 70.2 | 4 / 35 | 2375 |
| 4 | 5 | 57.6 | 67.6 | 1 / 35 | 2534 |
| 5 | 4 | 59.0 | 68.3 | 4 / 35 | 2720 |
| 6 | 3 | 60.4 | 71.7 | 4 / 35 | 2827 |
| 7 | 4 | 60.0 | 73.7 | 6 / 35 | 2197 |
| 8 | 3 | 61.4 | 77.1 | 4 / 35 | 2821 |
| 9 | 4 | 58.2 | 67.9 | 2 / 35 | 2649 |
| 10 | 3 | 58.9 | 70.5 | 6 / 35 | 2437 |
| 11 | 3 | 59.3 | 72.1 | 4 / 35 | 2409 |
| 12 | 5 | 58.3 | 68.6 | 3 / 35 | 2464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 8% |
| kawigi.nano.Lib 1.0 | 44 | 14% |
| d414.nano.Quantum 1.0.0 | 39 | 21% |
| radnor.DoctorBob 1.42 | 24 | 50% |
| myl.nano.Graviton 1.10 | 18 | 50% |
| squidM.TentalceMeleeNano 1.1 | 3 | 33% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 378 of 420 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 102 | 27% | 107 |
| d414.nano.Quantum 1.0.0 | 73 | 19% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 70 | 19% | 76 |
| radnor.DoctorBob 1.42 | 50 | 13% | 57 |
| myl.nano.Graviton 1.10 | 46 | 12% | 54 |
| ratosh.Wesco 1.4 | 14 | 4% | 16 |
| stelo.MirrorNano 1.3 | 14 | 4% | 16 |
| squidM.TentalceMeleeNano 1.1 | 9 | 2% | 12 |

## Melee bench: F07

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 71.1 | 81 / 420 | 3.60 | 13.2% | 35651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.3% | 106 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 84 |
| hadur117.nano.SanaroS4 0.4 | 3.0 | 13.2% | 81 |
| cb.nano.Insomnia 1.0 | 3.9 | 12.6% | 64 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 12.3% | 52 |
| oog.melee.CapuletDroid 1.1 | 6.1 | 10.7% | 19 |
| mz.Cork 0.1 | 6.5 | 10.2% | 12 |
| stuff.Vlad 0.1 | 8.3 | 5.4% | 1 |
| stelo.UntouchableNano 1.3 | 8.7 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 73.7 | 8 / 35 | 3143 |
| 2 | 5 | 57.1 | 63.8 | 5 / 35 | 2716 |
| 3 | 3 | 59.8 | 72.7 | 4 / 35 | 3110 |
| 4 | 2 | 60.0 | 73.0 | 6 / 35 | 2880 |
| 5 | 4 | 58.9 | 69.8 | 7 / 35 | 2679 |
| 6 | 4 | 59.0 | 69.8 | 6 / 35 | 2855 |
| 7 | 4 | 59.9 | 70.8 | 5 / 35 | 3131 |
| 8 | 2 | 61.3 | 79.4 | 4 / 35 | 2815 |
| 9 | 2 | 60.8 | 70.5 | 10 / 35 | 3258 |
| 10 | 2 | 59.7 | 70.2 | 10 / 35 | 3010 |
| 11 | 3 | 59.1 | 68.6 | 7 / 35 | 2956 |
| 12 | 3 | 60.2 | 70.5 | 9 / 35 | 3098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 51 | 65% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 19% |
| d414.nano.Quantum 1.0.0 | 33 | 3% |
| nz.jdc.nano.GridFu 1.0 | 29 | 66% |
| oog.melee.CapuletDroid 1.1 | 16 | 69% |
| mz.Cork 0.1 | 10 | 80% |

Hadur died in 339 of 420 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 91 | 27% | 113 |
| d414.nano.Quantum 1.0.0 | 87 | 26% | 99 |
| cb.nano.Insomnia 1.0 | 46 | 14% | 33 |
| nz.jdc.nano.GridFu 1.0 | 44 | 13% | 73 |
| oog.melee.CapuletDroid 1.1 | 41 | 12% | 58 |
| mz.Cork 0.1 | 18 | 5% | 29 |
| stelo.UntouchableNano 1.3 | 6 | 2% | 6 |
| stuff.Vlad 0.1 | 4 | 1% | 5 |
| sample.TrackFire 1.0 | 2 | 1% | 4 |

## Melee bench: F08

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 74.9 | 76 / 420 | 3.26 | 13.6% | 35355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.4% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.6% | 91 |
| hadur117.nano.SanaroS4 0.4 | 3.0 | 13.6% | 76 |
| gh.nano.Grofvuil 0.2 | 3.7 | 12.9% | 49 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.7% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 10.2% | 36 |
| baal.nano.N 1.42 | 6.8 | 9.2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.8 | 5.2% | 6 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 78.1 | 7 / 35 | 2815 |
| 2 | 2 | 62.6 | 79.7 | 8 / 35 | 3017 |
| 3 | 3 | 61.7 | 77.1 | 6 / 35 | 2837 |
| 4 | 3 | 60.2 | 72.4 | 9 / 35 | 2485 |
| 5 | 3 | 59.7 | 73.0 | 2 / 35 | 2728 |
| 6 | 4 | 58.9 | 67.0 | 6 / 35 | 2772 |
| 7 | 3 | 61.7 | 76.5 | 2 / 35 | 3072 |
| 8 | 3 | 60.9 | 74.0 | 6 / 35 | 2947 |
| 9 | 4 | 60.1 | 72.4 | 7 / 35 | 2553 |
| 10 | 3 | 62.9 | 78.1 | 6 / 35 | 3455 |
| 11 | 4 | 61.5 | 72.1 | 8 / 35 | 3216 |
| 12 | 2 | 63.7 | 78.1 | 9 / 35 | 3458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 20% |
| d414.nano.Quantum 1.0.0 | 68 | 15% |
| djdjdj.NanoSkunk10 1.0 | 29 | 69% |
| gh.nano.Grofvuil 0.2 | 29 | 66% |
| donjezza.Muncho 1.0 | 6 | 83% |
| baal.nano.N 1.42 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 344 of 420 rounds, at a mean tick of 1193. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 123 | 36% | 132 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 97 | 28% | 114 |
| gh.nano.Grofvuil 0.2 | 44 | 13% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 32 | 9% | 34 |
| djdjdj.NanoSkunk10 1.0 | 26 | 8% | 45 |
| baal.nano.N 1.42 | 11 | 3% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9 | 3% | 8 |
| donjezza.Muncho 1.0 | 2 | 1% | 7 |

## Melee bench: F09

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 64.9 | 58 / 420 | 4.16 | 12.0% | 28383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 13.2% | 73 |
| mld.DustBunny 3.8 | 3.1 | 12.3% | 57 |
| hadur117.nano.SanaroS4 0.4 | 3.3 | 12.0% | 58 |
| stelo.SoRobotNanoMelee 1.2 | 3.4 | 11.8% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 11.0% | 45 |
| wee.Gem 1.8.4 | 5.6 | 10.7% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 6.2 | 10.4% | 33 |
| tj.zombie1n 1.0.1 | 8.3 | 6.9% | 23 |
| cs.sheldor.Talon 1.1 | 8.8 | 6.5% | 0 |
| step.nanoPri 1.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 54.3 | 60.0 | 6 / 35 | 2335 |
| 2 | 3 | 56.4 | 65.4 | 5 / 35 | 2402 |
| 3 | 4 | 55.1 | 62.5 | 6 / 35 | 2131 |
| 4 | 2 | 59.4 | 72.4 | 6 / 35 | 2631 |
| 5 | 3 | 57.2 | 67.9 | 4 / 35 | 2494 |
| 6 | 5 | 53.7 | 61.0 | 3 / 35 | 2197 |
| 7 | 2 | 56.6 | 66.3 | 6 / 35 | 2414 |
| 8 | 5 | 53.7 | 59.0 | 5 / 35 | 2258 |
| 9 | 2 | 56.8 | 69.8 | 2 / 35 | 2372 |
| 10 | 3 | 56.2 | 65.4 | 6 / 35 | 2268 |
| 11 | 2 | 57.5 | 67.3 | 4 / 35 | 2730 |
| 12 | 3 | 54.6 | 61.9 | 5 / 35 | 2151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 34 | 41% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% |
| wee.Gem 1.8.4 | 23 | 70% |
| mld.DustBunny 3.8 | 23 | 22% |
| d414.nano.Quantum 1.0.0 | 22 | 23% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 53% |
| tj.zombie1n 1.0.1 | 5 | 40% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 364 of 420 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 64 | 18% | 75 |
| d414.nano.Quantum 1.0.0 | 64 | 18% | 73 |
| stelo.SoRobotNanoMelee 1.2 | 62 | 17% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 16% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 44 | 12% | 52 |
| wee.Gem 1.8.4 | 27 | 7% | 45 |
| cs.sheldor.Talon 1.1 | 18 | 5% | 19 |
| tj.zombie1n 1.0.1 | 15 | 4% | 13 |
| step.nanoPri 1.0 | 10 | 3% | 10 |

## Melee bench: F10

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.7 | 86 / 420 | 3.09 | 14.2% | 39471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.6% | 127 |
| hadur117.nano.SanaroS4 0.4 | 2.9 | 14.2% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 14.7% | 93 |
| mld.Infinity 2.2 | 3.0 | 14.3% | 97 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 7.8% | 4 |
| ayk.WallHugger 1.0 | 6.4 | 7.7% | 4 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 3 |
| conscience.Electron 1.3g | 6.9 | 7.5% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 5 |
| sample.RamFire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 78.1 | 7 / 35 | 3635 |
| 2 | 3 | 62.8 | 78.1 | 7 / 35 | 3455 |
| 3 | 4 | 61.8 | 75.2 | 7 / 35 | 3560 |
| 4 | 4 | 59.4 | 69.5 | 6 / 35 | 2976 |
| 5 | 1 | 64.2 | 85.7 | 11 / 35 | 3360 |
| 6 | 4 | 61.7 | 74.3 | 9 / 35 | 3388 |
| 7 | 2 | 61.4 | 75.2 | 10 / 35 | 3201 |
| 8 | 3 | 60.7 | 74.6 | 5 / 35 | 3287 |
| 9 | 3 | 62.2 | 79.0 | 7 / 35 | 3188 |
| 10 | 3 | 62.8 | 81.6 | 7 / 35 | 2939 |
| 11 | 3 | 59.8 | 72.4 | 3 / 35 | 3257 |
| 12 | 3 | 62.0 | 77.1 | 7 / 35 | 3225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 98 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 15% |
| d414.nano.Quantum 1.0.0 | 58 | 17% |
| robar.nano.Assertive_Melee 0.2 | 4 | 25% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |
| ayk.WallHugger 1.0 | 3 | 67% |
| donjezza.Jezza 1.0 | 2 | 50% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 334 of 420 rounds, at a mean tick of 1418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 129 | 39% | 190 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 96 | 29% | 135 |
| mld.Infinity 2.2 | 65 | 19% | 38 |
| robar.nano.Assertive_Melee 0.2 | 19 | 6% | 23 |
| exauge.GateKeeper 1.1.121g | 8 | 2% | 11 |
| ayk.WallHugger 1.0 | 7 | 2% | 10 |
| conscience.Electron 1.3g | 7 | 2% | 8 |
| donjezza.Jezza 1.0 | 3 | 1% | 4 |

## Melee bench: F11

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 74.0 | 83 / 420 | 3.34 | 13.8% | 36112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.5% | 129 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.8% | 91 |
| hadur117.nano.SanaroS4 0.4 | 2.7 | 13.8% | 83 |
| oog.melee.Corsair 1.0 | 4.2 | 12.2% | 41 |
| mz.NanoGod 2.02 | 4.4 | 11.4% | 49 |
| awesomeness.Elite 1.0 | 7.0 | 7.9% | 7 |
| DBall.NUKE 0.1 | 7.0 | 7.9% | 14 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 6.8% | 1 |
| sample.Walls 1.0 | 8.3 | 6.4% | 5 |
| stelo.PianistNano 1.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 64.1 | 5 / 35 | 3146 |
| 2 | 2 | 61.2 | 74.6 | 7 / 35 | 3250 |
| 3 | 3 | 58.1 | 67.0 | 4 / 35 | 3057 |
| 4 | 2 | 64.3 | 84.8 | 8 / 35 | 3509 |
| 5 | 3 | 60.1 | 75.2 | 7 / 35 | 2655 |
| 6 | 3 | 61.1 | 76.2 | 3 / 35 | 3040 |
| 7 | 2 | 60.5 | 73.3 | 8 / 35 | 2952 |
| 8 | 2 | 61.0 | 75.9 | 8 / 35 | 3084 |
| 9 | 3 | 58.8 | 69.5 | 8 / 35 | 2617 |
| 10 | 2 | 62.3 | 79.4 | 10 / 35 | 2770 |
| 11 | 3 | 60.3 | 74.6 | 6 / 35 | 2993 |
| 12 | 3 | 60.9 | 74.0 | 9 / 35 | 3039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 69 | 19% |
| oog.melee.Corsair 1.0 | 33 | 76% |
| mz.NanoGod 2.02 | 19 | 32% |
| DBall.NUKE 0.1 | 17 | 71% |
| sample.Walls 1.0 | 7 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 4 | 100% |

Hadur died in 337 of 420 rounds, at a mean tick of 1234. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 114 | 34% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 23% | 93 |
| mz.NanoGod 2.02 | 62 | 18% | 70 |
| oog.melee.Corsair 1.0 | 36 | 11% | 61 |
| zyx.nano.BacillusComma 1.0 | 16 | 5% | 16 |
| awesomeness.Elite 1.0 | 12 | 4% | 16 |
| DBall.NUKE 0.1 | 8 | 2% | 22 |
| sample.Walls 1.0 | 8 | 2% | 10 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 70.3 | 56 / 420 | 3.67 | 12.9% | 31372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.2% | 136 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.2% | 63 |
| hadur117.nano.SanaroS4 0.4 | 3.2 | 12.9% | 56 |
| myl.nano.KomoriNinja 1.1 | 3.7 | 12.0% | 45 |
| sul.Lunar 1.1 | 4.4 | 11.9% | 79 |
| maribo.melee.BMV 0.1 | 6.7 | 8.3% | 2 |
| spinnercat.Omen 1.0 | 7.5 | 7.6% | 10 |
| sample.SpinBot 1.0 | 7.8 | 7.6% | 12 |
| sam.Samspin 1.0 | 8.1 | 7.2% | 12 |
| cvt.Firsty 1.0 | 10.0 | 4.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 73.7 | 4 / 35 | 2545 |
| 2 | 4 | 58.9 | 73.0 | 4 / 35 | 2548 |
| 3 | 3 | 58.0 | 68.9 | 5 / 35 | 2578 |
| 4 | 4 | 56.1 | 63.5 | 5 / 35 | 2441 |
| 5 | 2 | 60.3 | 74.3 | 6 / 35 | 2948 |
| 6 | 2 | 56.6 | 66.3 | 4 / 35 | 2628 |
| 7 | 4 | 55.7 | 65.7 | 1 / 35 | 2303 |
| 8 | 3 | 58.7 | 69.5 | 4 / 35 | 2884 |
| 9 | 3 | 58.8 | 70.8 | 5 / 35 | 2680 |
| 10 | 3 | 59.0 | 72.7 | 4 / 35 | 2679 |
| 11 | 2 | 62.0 | 80.6 | 9 / 35 | 2581 |
| 12 | 5 | 56.5 | 65.1 | 5 / 35 | 2557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 64 | 17% |
| sul.Lunar 1.1 | 47 | 13% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 18% |
| myl.nano.KomoriNinja 1.1 | 22 | 59% |
| sample.SpinBot 1.0 | 13 | 69% |
| spinnercat.Omen 1.0 | 8 | 63% |
| sam.Samspin 1.0 | 6 | 17% |
| maribo.melee.BMV 0.1 | 3 | 100% |

Hadur died in 365 of 420 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 104 | 28% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 20% | 82 |
| sul.Lunar 1.1 | 71 | 19% | 78 |
| myl.nano.KomoriNinja 1.1 | 32 | 9% | 44 |
| sample.SpinBot 1.0 | 24 | 7% | 33 |
| spinnercat.Omen 1.0 | 22 | 6% | 24 |
| sam.Samspin 1.0 | 22 | 6% | 22 |
| maribo.melee.BMV 0.1 | 13 | 4% | 17 |
| cvt.Firsty 1.0 | 5 | 1% | 5 |

## Melee bench: F13

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 22 over 12 battles (1.8 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 70.2 | 44 / 420 | 3.68 | 12.4% | 29483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.9% | 140 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.1 | 14.2% | 101 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 12.9% | 77 |
| hadur117.nano.SanaroS4 0.4 | 3.7 | 12.4% | 44 |
| mld.Wisdom 1.0 | 4.9 | 10.6% | 15 |
| tvv.nano.Polaris 1.2 | 6.8 | 8.5% | 21 |
| amz.NanoClone 1.41 | 7.5 | 8.0% | 10 |
| arthord.NanoSatanMelee Beta | 7.8 | 7.6% | 6 |
| zyx.nano.Ant 1.1 | 7.8 | 7.9% | 9 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.4 | 61.9 | 1 / 35 | 2097 |
| 2 | 2 | 62.5 | 80.6 | 8 / 35 | 2893 |
| 3 | 4 | 55.1 | 63.8 | 3 / 35 | 2264 |
| 4 | 3 | 59.6 | 75.6 | 3 / 35 | 2639 |
| 5 | 4 | 57.8 | 70.2 | 5 / 35 | 2245 |
| 6 | 4 | 57.8 | 71.1 | 4 / 35 | 2313 |
| 7 | 5 | 55.0 | 63.2 | 3 / 35 | 2353 |
| 8 | 4 | 58.4 | 73.0 | 3 / 35 | 2670 |
| 9 | 4 | 57.4 | 71.4 | 3 / 35 | 2356 |
| 10 | 3 | 57.8 | 71.4 | 4 / 35 | 2442 |
| 11 | 3 | 59.8 | 74.9 | 3 / 35 | 2884 |
| 12 | 4 | 55.8 | 65.1 | 4 / 35 | 2327 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 14% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 12% |
| davidalves.net.DuelistNanoMelee 1.01 | 41 | 10% |
| tvv.nano.Polaris 1.2 | 14 | 14% |
| mld.Wisdom 1.0 | 13 | 92% |
| zyx.nano.Ant 1.1 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 376 of 420 rounds, at a mean tick of 1260. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 112 | 30% | 120 |
| davidalves.net.DuelistNanoMelee 1.01 | 79 | 21% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 20% | 86 |
| mld.Wisdom 1.0 | 33 | 9% | 44 |
| tvv.nano.Polaris 1.2 | 23 | 6% | 24 |
| amz.NanoClone 1.41 | 21 | 6% | 21 |
| zyx.nano.Ant 1.1 | 19 | 5% | 23 |
| arthord.NanoSatanMelee Beta | 13 | 3% | 18 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

