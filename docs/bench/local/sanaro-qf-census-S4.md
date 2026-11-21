# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 12 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 71.6 | 56 / 420 | 3.55 | 13.1% | 32847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.6% | 146 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.6% | 93 |
| hadur117.nano.SanaroS4 0.4 | 3.0 | 13.1% | 56 |
| bzdp.Pansy 2.1 | 3.3 | 12.6% | 48 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.7% | 42 |
| arthord.NanoSatanMelee Beta | 6.3 | 9.1% | 10 |
| fm.claire 1.7 | 7.0 | 8.3% | 2 |
| zyx.nano.Ant 1.1 | 7.2 | 8.5% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.3% | 15 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.8 | 71.7 | 1 / 35 | 2804 |
| 2 | 4 | 55.8 | 62.5 | 6 / 35 | 2434 |
| 3 | 3 | 62.6 | 76.8 | 8 / 35 | 3109 |
| 4 | 3 | 58.5 | 73.0 | 2 / 35 | 2566 |
| 5 | 3 | 59.9 | 73.7 | 3 / 35 | 2910 |
| 6 | 2 | 59.8 | 72.1 | 7 / 35 | 2767 |
| 7 | 2 | 58.8 | 71.7 | 5 / 35 | 2566 |
| 8 | 3 | 60.9 | 74.6 | 7 / 35 | 3277 |
| 9 | 3 | 60.1 | 74.6 | 4 / 35 | 2859 |
| 10 | 2 | 60.1 | 73.0 | 6 / 35 | 2828 |
| 11 | 4 | 56.8 | 68.6 | 3 / 35 | 2334 |
| 12 | 4 | 57.6 | 67.3 | 4 / 35 | 2393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 13% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 63 | 21% |
| bzdp.Pansy 2.1 | 33 | 58% |
| tvv.nano.Polaris 1.2 | 19 | 5% |
| arthord.NanoSatanMelee Beta | 7 | 86% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 50% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 365 of 420 rounds, at a mean tick of 1172. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 119 | 33% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 89 | 24% | 104 |
| bzdp.Pansy 2.1 | 57 | 16% | 75 |
| tvv.nano.Polaris 1.2 | 29 | 8% | 27 |
| arthord.NanoSatanMelee Beta | 24 | 7% | 27 |
| zyx.nano.Ant 1.1 | 22 | 6% | 27 |
| fm.claire 1.7 | 17 | 5% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 8 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 73.3 | 63 / 420 | 3.40 | 13.2% | 31110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 14.9% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.5% | 70 |
| hadur117.nano.SanaroS4 0.4 | 2.7 | 13.2% | 63 |
| simonton.nano.MeleeSeed 1.8 | 4.1 | 12.0% | 45 |
| DBall.Anarchy 0.1 | 5.1 | 10.4% | 54 |
| fm.mammillarias 1.3 | 5.9 | 9.9% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.9% | 61 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.5% | 1 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.3% | 16 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 76.2 | 10 / 35 | 2239 |
| 2 | 4 | 57.7 | 70.2 | 4 / 35 | 2335 |
| 3 | 2 | 60.3 | 76.2 | 5 / 35 | 2867 |
| 4 | 3 | 59.4 | 69.8 | 8 / 35 | 2749 |
| 5 | 2 | 60.0 | 75.6 | 5 / 35 | 2678 |
| 6 | 2 | 60.0 | 75.6 | 4 / 35 | 2862 |
| 7 | 3 | 59.5 | 74.3 | 6 / 35 | 2405 |
| 8 | 3 | 58.0 | 70.5 | 5 / 35 | 2564 |
| 9 | 2 | 60.4 | 75.9 | 5 / 35 | 2863 |
| 10 | 3 | 59.2 | 74.3 | 5 / 35 | 2373 |
| 11 | 3 | 59.3 | 73.3 | 5 / 35 | 2790 |
| 12 | 3 | 56.3 | 67.6 | 1 / 35 | 2385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 11% |
| d414.nano.Quantum 1.0.0 | 48 | 21% |
| DBall.Anarchy 0.1 | 37 | 57% |
| stelo.SoJNanoMelee 1.1 | 29 | 24% |
| simonton.nano.MeleeSeed 1.8 | 19 | 74% |
| sample.MyFirstRobot 1.0 | 7 | 29% |
| fm.mammillarias 1.3 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 0% |

Hadur died in 359 of 420 rounds, at a mean tick of 1314. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 106 | 30% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 83 | 23% | 89 |
| stelo.SoJNanoMelee 1.1 | 40 | 11% | 42 |
| simonton.nano.MeleeSeed 1.8 | 36 | 10% | 50 |
| fm.mammillarias 1.3 | 35 | 10% | 36 |
| DBall.Anarchy 0.1 | 33 | 9% | 54 |
| sample.MyFirstRobot 1.0 | 12 | 3% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 10 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 4 | 1% | 5 |

## Melee bench: F03

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.3 | 63 / 420 | 3.58 | 13.3% | 38504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.0% | 137 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.4% | 94 |
| hadur117.nano.SanaroS4 0.4 | 2.8 | 13.3% | 63 |
| ahf.NanoAndrew .4 | 4.2 | 11.7% | 41 |
| ratosh.Nobo 0.21 | 5.0 | 11.0% | 18 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 16 |
| stelo.PatternRobot 1.0 | 7.0 | 8.1% | 34 |
| repositorio.NanoStep 1.0 | 8.3 | 6.0% | 11 |
| sample.Crazy 1.0 | 8.6 | 5.7% | 6 |
| kurios.DOSexe .9a | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 67.3 | 6 / 35 | 3008 |
| 2 | 3 | 58.1 | 70.2 | 5 / 35 | 2619 |
| 3 | 2 | 60.6 | 74.9 | 4 / 35 | 3154 |
| 4 | 2 | 62.7 | 79.0 | 5 / 35 | 3727 |
| 5 | 3 | 59.1 | 67.9 | 4 / 35 | 3436 |
| 6 | 3 | 60.6 | 74.0 | 5 / 35 | 3248 |
| 7 | 2 | 60.4 | 71.1 | 11 / 35 | 3020 |
| 8 | 3 | 60.3 | 73.3 | 3 / 35 | 3322 |
| 9 | 2 | 60.7 | 73.0 | 8 / 35 | 3205 |
| 10 | 3 | 60.2 | 71.7 | 4 / 35 | 3426 |
| 11 | 4 | 57.3 | 65.7 | 4 / 35 | 2953 |
| 12 | 3 | 58.6 | 67.3 | 4 / 35 | 3386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 14% |
| d414.nano.Quantum 1.0.0 | 65 | 18% |
| ahf.NanoAndrew .4 | 21 | 62% |
| ratosh.Nobo 0.21 | 14 | 57% |
| stelo.PatternRobot 1.0 | 13 | 31% |
| repositorio.NanoStep 1.0 | 11 | 82% |
| timmit.nano.TimDog 0.33 | 5 | 80% |
| sample.Crazy 1.0 | 4 | 50% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 358 of 420 rounds, at a mean tick of 1253. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 117 | 33% | 129 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 95 | 27% | 104 |
| ahf.NanoAndrew .4 | 50 | 14% | 62 |
| stelo.PatternRobot 1.0 | 38 | 11% | 43 |
| ratosh.Nobo 0.21 | 23 | 6% | 29 |
| timmit.nano.TimDog 0.33 | 20 | 6% | 26 |
| repositorio.NanoStep 1.0 | 8 | 2% | 16 |
| kurios.DOSexe .9a | 5 | 1% | 6 |
| sample.Crazy 1.0 | 2 | 1% | 5 |

## Melee bench: F04

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.3 | 70 / 420 | 2.77 | 15.2% | 50575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.4% | 161 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 16.4% | 127 |
| hadur117.nano.SanaroS4 0.4 | 2.9 | 15.2% | 70 |
| wompi.Quokka 1.6 | 4.0 | 14.2% | 47 |
| kurios.DOSexe .9b | 5.6 | 7.3% | 3 |
| maribo.FollowFire 1 | 5.8 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.2 | 6.5% | 7 |
| jangs.ns51 1.0 | 7.9 | 5.9% | 3 |
| sample.VelociRobot 1.0 | 8.8 | 5.6% | 2 |
| drd.Dreadknoght 0.9 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 79.0 | 7 / 35 | 4270 |
| 2 | 3 | 64.3 | 84.1 | 7 / 35 | 3851 |
| 3 | 3 | 63.1 | 76.5 | 7 / 35 | 4109 |
| 4 | 3 | 63.5 | 79.4 | 7 / 35 | 4093 |
| 5 | 3 | 65.2 | 83.2 | 6 / 35 | 4425 |
| 6 | 3 | 64.0 | 82.2 | 6 / 35 | 3972 |
| 7 | 3 | 64.3 | 82.9 | 2 / 35 | 4409 |
| 8 | 3 | 62.7 | 74.9 | 2 / 35 | 4493 |
| 9 | 2 | 64.8 | 83.2 | 8 / 35 | 4447 |
| 10 | 3 | 63.7 | 78.7 | 6 / 35 | 4278 |
| 11 | 3 | 63.3 | 78.4 | 8 / 35 | 4118 |
| 12 | 3 | 63.4 | 81.0 | 4 / 35 | 4110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 122 | 19% |
| d414.nano.Quantum 1.0.0 | 86 | 16% |
| wompi.Quokka 1.6 | 42 | 69% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 40% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.VelociRobot 1.0 | 2 | 0% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 350 of 420 rounds, at a mean tick of 1813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 152 | 43% | 176 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 119 | 34% | 146 |
| wompi.Quokka 1.6 | 45 | 13% | 56 |
| maribo.FollowFire 1 | 10 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 8 | 2% | 10 |
| kurios.DOSexe .9b | 6 | 2% | 10 |
| jangs.ns51 1.0 | 4 | 1% | 5 |
| sample.VelociRobot 1.0 | 3 | 1% | 4 |
| drd.Dreadknoght 0.9 | 3 | 1% | 3 |

## Melee bench: F05

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.9 | 53 / 420 | 3.26 | 13.8% | 42655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 17.3% | 177 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 15.3% | 119 |
| hadur117.nano.SanaroS4 0.4 | 2.8 | 13.8% | 53 |
| ntc.Opposite 1.5 | 4.2 | 12.2% | 25 |
| js.PinBall 1.6 | 5.1 | 11.1% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.6% | 12 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.6% | 9 |
| sample.Fire 1.0 | 8.3 | 4.6% | 2 |
| PSW.Relentless 0.1 | 8.7 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 72.1 | 3 / 35 | 3598 |
| 2 | 3 | 63.4 | 80.6 | 7 / 35 | 3497 |
| 3 | 3 | 60.8 | 73.7 | 2 / 35 | 3473 |
| 4 | 3 | 60.4 | 72.1 | 3 / 35 | 3318 |
| 5 | 2 | 62.8 | 77.5 | 7 / 35 | 3843 |
| 6 | 2 | 62.6 | 80.6 | 6 / 35 | 3634 |
| 7 | 3 | 57.8 | 65.1 | 3 / 35 | 3104 |
| 8 | 2 | 62.5 | 79.4 | 5 / 35 | 3575 |
| 9 | 3 | 62.0 | 76.2 | 2 / 35 | 3786 |
| 10 | 2 | 62.7 | 74.0 | 8 / 35 | 4048 |
| 11 | 3 | 62.6 | 78.1 | 5 / 35 | 3616 |
| 12 | 4 | 59.0 | 69.2 | 2 / 35 | 3163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 93 | 12% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 92 | 9% |
| sp.Nanos.Ember 1.1 | 19 | 68% |
| ntc.Opposite 1.5 | 14 | 43% |
| js.PinBall 1.6 | 9 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 367 of 420 rounds, at a mean tick of 1516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 139 | 38% | 153 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 107 | 29% | 116 |
| ntc.Opposite 1.5 | 43 | 12% | 46 |
| simonton.nano.WeekendObsession_Melee 1.0 | 35 | 10% | 40 |
| js.PinBall 1.6 | 27 | 7% | 34 |
| sp.Nanos.Ember 1.1 | 10 | 3% | 22 |
| PSW.Relentless 0.1 | 4 | 1% | 4 |
| sample.Fire 1.0 | 2 | 1% | 5 |

## Melee bench: F06

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.4 | 49 / 420 | 3.93 | 12.3% | 31075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.6% | 108 |
| kawigi.nano.Lib 1.0 | 2.4 | 13.7% | 88 |
| radnor.DoctorBob 1.42 | 3.2 | 13.1% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 13.0% | 53 |
| hadur117.nano.SanaroS4 0.4 | 4.3 | 12.3% | 49 |
| myl.nano.Graviton 1.10 | 6.2 | 10.1% | 42 |
| ratosh.Wesco 1.4 | 7.8 | 7.4% | 9 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.6% | 3 |
| stelo.MirrorNano 1.3 | 8.2 | 7.2% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.3 | 64.8 | 4 / 35 | 2369 |
| 2 | 4 | 58.7 | 69.2 | 3 / 35 | 2556 |
| 3 | 5 | 56.7 | 61.0 | 3 / 35 | 2802 |
| 4 | 5 | 57.4 | 66.3 | 4 / 35 | 2340 |
| 5 | 4 | 58.4 | 70.5 | 3 / 35 | 2276 |
| 6 | 5 | 57.1 | 63.2 | 4 / 35 | 2513 |
| 7 | 3 | 59.7 | 74.0 | 2 / 35 | 2769 |
| 8 | 6 | 56.3 | 62.5 | 4 / 35 | 2337 |
| 9 | 3 | 60.5 | 72.1 | 7 / 35 | 2830 |
| 10 | 4 | 60.2 | 70.2 | 8 / 35 | 2684 |
| 11 | 4 | 60.1 | 70.8 | 4 / 35 | 3063 |
| 12 | 4 | 57.3 | 64.4 | 3 / 35 | 2536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 44 | 18% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 18% |
| kawigi.nano.Lib 1.0 | 33 | 30% |
| radnor.DoctorBob 1.42 | 25 | 48% |
| myl.nano.Graviton 1.10 | 10 | 80% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 373 of 420 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 23% | 96 |
| kawigi.nano.Lib 1.0 | 82 | 22% | 88 |
| radnor.DoctorBob 1.42 | 65 | 17% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 63 | 17% | 73 |
| myl.nano.Graviton 1.10 | 38 | 10% | 44 |
| stelo.MirrorNano 1.3 | 17 | 5% | 18 |
| ratosh.Wesco 1.4 | 15 | 4% | 16 |
| squidM.TentalceMeleeNano 1.1 | 8 | 2% | 9 |

## Melee bench: F07

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 70.6 | 89 / 420 | 3.65 | 13.1% | 34564 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 99 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.3% | 66 |
| hadur117.nano.SanaroS4 0.4 | 2.8 | 13.1% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.2% | 79 |
| cb.nano.Insomnia 1.0 | 4.7 | 12.1% | 43 |
| oog.melee.CapuletDroid 1.1 | 6.1 | 10.7% | 28 |
| mz.Cork 0.1 | 6.5 | 10.3% | 15 |
| stelo.UntouchableNano 1.3 | 8.2 | 5.5% | 1 |
| stuff.Vlad 0.1 | 8.8 | 4.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 70.8 | 7 / 35 | 2779 |
| 2 | 1 | 60.8 | 74.6 | 6 / 35 | 3178 |
| 3 | 5 | 56.7 | 64.4 | 4 / 35 | 2518 |
| 4 | 1 | 62.6 | 76.5 | 10 / 35 | 3074 |
| 5 | 2 | 61.4 | 70.5 | 12 / 35 | 3337 |
| 6 | 3 | 59.0 | 67.3 | 7 / 35 | 3107 |
| 7 | 3 | 59.2 | 70.5 | 5 / 35 | 2709 |
| 8 | 4 | 57.7 | 67.6 | 5 / 35 | 2620 |
| 9 | 1 | 61.9 | 77.8 | 13 / 35 | 2843 |
| 10 | 4 | 58.7 | 69.8 | 5 / 35 | 2790 |
| 11 | 5 | 57.6 | 64.8 | 5 / 35 | 2718 |
| 12 | 2 | 60.1 | 72.1 | 10 / 35 | 2891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 45 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 26% |
| nz.jdc.nano.GridFu 1.0 | 39 | 67% |
| d414.nano.Quantum 1.0.0 | 29 | 7% |
| oog.melee.CapuletDroid 1.1 | 16 | 50% |
| mz.Cork 0.1 | 8 | 75% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 331 of 420 rounds, at a mean tick of 1213. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 26% | 103 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 23% | 101 |
| nz.jdc.nano.GridFu 1.0 | 50 | 15% | 81 |
| cb.nano.Insomnia 1.0 | 47 | 14% | 38 |
| oog.melee.CapuletDroid 1.1 | 37 | 11% | 48 |
| mz.Cork 0.1 | 19 | 6% | 30 |
| stelo.UntouchableNano 1.3 | 8 | 2% | 9 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |
| sample.TrackFire 1.0 | 2 | 1% | 3 |

## Melee bench: F08

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.7 | 72 / 420 | 3.10 | 13.9% | 36195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 14.9% | 107 |
| hadur117.nano.SanaroS4 0.4 | 3.1 | 13.9% | 72 |
| gh.nano.Grofvuil 0.2 | 3.8 | 12.9% | 53 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.8% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 10.2% | 26 |
| baal.nano.N 1.42 | 6.7 | 9.5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.8 | 5.0% | 7 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 76.2 | 8 / 35 | 3101 |
| 2 | 4 | 60.4 | 71.1 | 5 / 35 | 3179 |
| 3 | 3 | 61.3 | 72.1 | 7 / 35 | 3532 |
| 4 | 3 | 62.1 | 77.1 | 4 / 35 | 3341 |
| 5 | 2 | 61.5 | 77.1 | 8 / 35 | 2635 |
| 6 | 4 | 62.1 | 77.5 | 7 / 35 | 2936 |
| 7 | 4 | 60.1 | 76.2 | 1 / 35 | 2459 |
| 8 | 3 | 61.2 | 75.6 | 4 / 35 | 2758 |
| 9 | 3 | 63.1 | 80.3 | 8 / 35 | 2973 |
| 10 | 3 | 63.1 | 80.6 | 8 / 35 | 3108 |
| 11 | 2 | 62.7 | 80.3 | 7 / 35 | 3172 |
| 12 | 3 | 61.6 | 76.2 | 5 / 35 | 3001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 88 | 16% |
| d414.nano.Quantum 1.0.0 | 67 | 13% |
| gh.nano.Grofvuil 0.2 | 36 | 47% |
| djdjdj.NanoSkunk10 1.0 | 30 | 77% |
| baal.nano.N 1.42 | 7 | 43% |
| donjezza.Muncho 1.0 | 6 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 50% |

Hadur died in 348 of 420 rounds, at a mean tick of 1478. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 115 | 33% | 126 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 103 | 30% | 116 |
| gh.nano.Grofvuil 0.2 | 43 | 12% | 61 |
| djdjdj.NanoSkunk10 1.0 | 26 | 7% | 48 |
| dmh.robocode.robot.RedDwarf 0.4 | 26 | 7% | 26 |
| baal.nano.N 1.42 | 23 | 7% | 26 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8 | 2% | 8 |
| donjezza.Muncho 1.0 | 4 | 1% | 8 |

## Melee bench: F09

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 64.2 | 62 / 420 | 4.22 | 11.9% | 28396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.3 | 12.7% | 69 |
| mld.DustBunny 3.8 | 2.7 | 12.4% | 54 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 12.1% | 73 |
| hadur117.nano.SanaroS4 0.4 | 3.7 | 11.9% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 11.2% | 53 |
| wee.Gem 1.8.4 | 5.6 | 10.7% | 59 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 9.9% | 28 |
| tj.zombie1n 1.0.1 | 8.4 | 7.1% | 20 |
| cs.sheldor.Talon 1.1 | 8.7 | 6.9% | 2 |
| step.nanoPri 1.0 | 9.9 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.8 | 62.5 | 4 / 35 | 2462 |
| 2 | 5 | 54.3 | 62.2 | 2 / 35 | 2232 |
| 3 | 4 | 57.3 | 66.7 | 6 / 35 | 2527 |
| 4 | 1 | 59.6 | 71.7 | 8 / 35 | 2685 |
| 5 | 1 | 58.9 | 71.7 | 9 / 35 | 2509 |
| 6 | 6 | 51.5 | 55.2 | 1 / 35 | 2237 |
| 7 | 2 | 58.0 | 68.9 | 8 / 35 | 2681 |
| 8 | 6 | 51.6 | 55.9 | 3 / 35 | 2043 |
| 9 | 7 | 50.3 | 52.1 | 3 / 35 | 2029 |
| 10 | 3 | 56.2 | 66.3 | 8 / 35 | 2059 |
| 11 | 3 | 56.1 | 66.0 | 5 / 35 | 2196 |
| 12 | 2 | 58.6 | 70.8 | 5 / 35 | 2736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 31 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 13% |
| wee.Gem 1.8.4 | 29 | 52% |
| d414.nano.Quantum 1.0.0 | 23 | 9% |
| mld.DustBunny 3.8 | 22 | 27% |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 75% |
| tj.zombie1n 1.0.1 | 10 | 80% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 360 of 420 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 19% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 65 | 18% | 70 |
| mld.DustBunny 3.8 | 62 | 17% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 15% | 61 |
| wee.Gem 1.8.4 | 41 | 11% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 8% | 41 |
| tj.zombie1n 1.0.1 | 19 | 5% | 16 |
| cs.sheldor.Talon 1.1 | 18 | 5% | 21 |
| step.nanoPri 1.0 | 6 | 2% | 6 |

## Melee bench: F10

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.4 | 74 / 420 | 3.21 | 14.1% | 41019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.0% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.8% | 101 |
| mld.Infinity 2.2 | 2.9 | 14.6% | 108 |
| hadur117.nano.SanaroS4 0.4 | 3.3 | 14.1% | 74 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 7.9% | 1 |
| conscience.Electron 1.3g | 6.5 | 7.8% | 3 |
| ayk.WallHugger 1.0 | 6.8 | 7.5% | 5 |
| exauge.GateKeeper 1.1.121g | 7.1 | 7.5% | 5 |
| donjezza.Jezza 1.0 | 8.4 | 6.0% | 11 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 81.0 | 6 / 35 | 3961 |
| 2 | 4 | 61.7 | 76.2 | 2 / 35 | 3695 |
| 3 | 3 | 61.6 | 76.5 | 5 / 35 | 3416 |
| 4 | 2 | 62.5 | 77.5 | 11 / 35 | 3493 |
| 5 | 4 | 60.8 | 71.7 | 5 / 35 | 3708 |
| 6 | 4 | 61.2 | 75.9 | 5 / 35 | 3450 |
| 7 | 4 | 60.5 | 74.9 | 4 / 35 | 3022 |
| 8 | 3 | 60.1 | 70.8 | 6 / 35 | 3415 |
| 9 | 3 | 61.6 | 75.6 | 9 / 35 | 3280 |
| 10 | 2 | 63.5 | 81.0 | 7 / 35 | 3641 |
| 11 | 4 | 61.2 | 75.6 | 10 / 35 | 2868 |
| 12 | 4 | 58.4 | 68.6 | 4 / 35 | 3070 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 81 | 52% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 80 | 11% |
| d414.nano.Quantum 1.0.0 | 52 | 23% |
| donjezza.Jezza 1.0 | 8 | 38% |
| ayk.WallHugger 1.0 | 7 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 346 of 420 rounds, at a mean tick of 1632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 116 | 34% | 153 |
| d414.nano.Quantum 1.0.0 | 98 | 28% | 145 |
| mld.Infinity 2.2 | 68 | 20% | 40 |
| robar.nano.Assertive_Melee 0.2 | 20 | 6% | 22 |
| exauge.GateKeeper 1.1.121g | 12 | 3% | 12 |
| conscience.Electron 1.3g | 11 | 3% | 16 |
| donjezza.Jezza 1.0 | 11 | 3% | 15 |
| ayk.WallHugger 1.0 | 7 | 2% | 15 |
| sample.RamFire 1.0 | 3 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 71.9 | 80 / 420 | 3.53 | 13.5% | 35744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.0% | 127 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.9% | 97 |
| hadur117.nano.SanaroS4 0.4 | 3.1 | 13.5% | 80 |
| oog.melee.Corsair 1.0 | 3.7 | 12.5% | 49 |
| mz.NanoGod 2.02 | 4.8 | 11.2% | 36 |
| DBall.NUKE 0.1 | 6.3 | 8.2% | 18 |
| awesomeness.Elite 1.0 | 7.2 | 7.5% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 7.0% | 3 |
| sample.Walls 1.0 | 8.8 | 5.9% | 6 |
| stelo.PianistNano 1.2 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 79.7 | 8 / 35 | 3230 |
| 2 | 3 | 58.9 | 71.4 | 4 / 35 | 2911 |
| 3 | 2 | 61.1 | 74.9 | 7 / 35 | 2945 |
| 4 | 5 | 55.9 | 63.5 | 6 / 35 | 2562 |
| 5 | 2 | 63.5 | 79.4 | 7 / 35 | 3690 |
| 6 | 2 | 60.3 | 71.7 | 7 / 35 | 3140 |
| 7 | 4 | 60.0 | 71.1 | 8 / 35 | 3029 |
| 8 | 4 | 58.6 | 68.6 | 7 / 35 | 2674 |
| 9 | 3 | 59.5 | 69.8 | 7 / 35 | 3008 |
| 10 | 4 | 57.8 | 66.7 | 7 / 35 | 2907 |
| 11 | 3 | 60.2 | 74.6 | 4 / 35 | 2745 |
| 12 | 3 | 59.8 | 70.8 | 8 / 35 | 2903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 68 | 24% |
| d414.nano.Quantum 1.0.0 | 64 | 16% |
| oog.melee.Corsair 1.0 | 31 | 71% |
| mz.NanoGod 2.02 | 21 | 43% |
| DBall.NUKE 0.1 | 21 | 76% |
| sample.Walls 1.0 | 5 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 340 of 420 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 108 | 32% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 83 | 24% | 102 |
| mz.NanoGod 2.02 | 55 | 16% | 61 |
| oog.melee.Corsair 1.0 | 37 | 11% | 58 |
| zyx.nano.BacillusComma 1.0 | 21 | 6% | 23 |
| DBall.NUKE 0.1 | 12 | 4% | 25 |
| awesomeness.Elite 1.0 | 12 | 4% | 13 |
| stelo.PianistNano 1.2 | 8 | 2% | 9 |
| sample.Walls 1.0 | 4 | 1% | 6 |

## Melee bench: F12

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 71.2 | 48 / 420 | 3.59 | 12.9% | 30665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 82 |
| hadur117.nano.SanaroS4 0.4 | 2.8 | 12.9% | 48 |
| sul.Lunar 1.1 | 4.0 | 11.8% | 71 |
| myl.nano.KomoriNinja 1.1 | 4.5 | 11.1% | 37 |
| sam.Samspin 1.0 | 6.7 | 8.6% | 15 |
| maribo.melee.BMV 0.1 | 7.6 | 7.9% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.8% | 16 |
| spinnercat.Omen 1.0 | 7.9 | 7.5% | 10 |
| cvt.Firsty 1.0 | 10.0 | 4.0% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 69.2 | 3 / 35 | 2732 |
| 2 | 3 | 58.7 | 71.7 | 6 / 35 | 2460 |
| 3 | 4 | 57.1 | 69.5 | 3 / 35 | 2154 |
| 4 | 2 | 60.3 | 75.2 | 2 / 35 | 3077 |
| 5 | 2 | 59.4 | 74.0 | 4 / 35 | 2564 |
| 6 | 3 | 55.9 | 65.7 | 3 / 35 | 2520 |
| 7 | 3 | 59.3 | 74.9 | 4 / 35 | 2554 |
| 8 | 3 | 58.1 | 72.1 | 3 / 35 | 2334 |
| 9 | 3 | 57.0 | 68.3 | 4 / 35 | 2351 |
| 10 | 2 | 60.0 | 74.0 | 6 / 35 | 2705 |
| 11 | 2 | 59.0 | 70.2 | 7 / 35 | 2655 |
| 12 | 3 | 57.8 | 69.8 | 3 / 35 | 2559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 15% |
| d414.nano.Quantum 1.0.0 | 51 | 18% |
| sul.Lunar 1.1 | 40 | 10% |
| myl.nano.KomoriNinja 1.1 | 14 | 64% |
| sample.SpinBot 1.0 | 9 | 67% |
| spinnercat.Omen 1.0 | 9 | 67% |
| sam.Samspin 1.0 | 6 | 50% |
| cvt.Firsty 1.0 | 4 | 50% |
| maribo.melee.BMV 0.1 | 2 | 50% |

Hadur died in 373 of 420 rounds, at a mean tick of 1264. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 110 | 29% | 122 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 82 | 22% | 92 |
| sul.Lunar 1.1 | 54 | 14% | 58 |
| myl.nano.KomoriNinja 1.1 | 37 | 10% | 47 |
| sample.SpinBot 1.0 | 25 | 7% | 30 |
| sam.Samspin 1.0 | 24 | 6% | 27 |
| maribo.melee.BMV 0.1 | 24 | 6% | 24 |
| spinnercat.Omen 1.0 | 14 | 4% | 14 |
| cvt.Firsty 1.0 | 3 | 1% | 6 |

## Melee bench: F13

hadur117.nano.SanaroS4 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 68.9 | 39 / 420 | 3.80 | 12.1% | 28127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.7 | 14.6% | 102 |
| d414.nano.Quantum 1.0.0 | 1.9 | 14.4% | 134 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 85 |
| hadur117.nano.SanaroS4 0.4 | 3.8 | 12.1% | 39 |
| mld.Wisdom 1.0 | 4.9 | 10.2% | 16 |
| amz.NanoClone 1.41 | 7.4 | 8.3% | 11 |
| zyx.nano.Ant 1.1 | 7.4 | 8.1% | 7 |
| tvv.nano.Polaris 1.2 | 7.4 | 8.2% | 16 |
| arthord.NanoSatanMelee Beta | 7.8 | 7.8% | 10 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 66.3 | 3 / 35 | 2380 |
| 2 | 4 | 57.9 | 72.1 | 3 / 35 | 2381 |
| 3 | 4 | 53.8 | 62.2 | 1 / 35 | 2019 |
| 4 | 4 | 59.9 | 78.7 | 4 / 35 | 2329 |
| 5 | 3 | 58.5 | 72.7 | 6 / 35 | 2473 |
| 6 | 5 | 54.2 | 62.9 | 1 / 35 | 2188 |
| 7 | 4 | 55.8 | 65.4 | 3 / 35 | 2317 |
| 8 | 3 | 57.4 | 69.2 | 4 / 35 | 2569 |
| 9 | 4 | 57.9 | 70.8 | 3 / 35 | 2356 |
| 10 | 4 | 58.4 | 72.7 | 3 / 35 | 2390 |
| 11 | 3 | 57.5 | 68.9 | 5 / 35 | 2545 |
| 12 | 4 | 55.8 | 65.4 | 3 / 35 | 2180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 16% |
| d414.nano.Quantum 1.0.0 | 46 | 9% |
| davidalves.net.DuelistNanoMelee 1.01 | 43 | 0% |
| tvv.nano.Polaris 1.2 | 10 | 30% |
| amz.NanoClone 1.41 | 8 | 88% |
| mld.Wisdom 1.0 | 7 | 100% |
| zyx.nano.Ant 1.1 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 3 | 67% |

Hadur died in 382 of 420 rounds, at a mean tick of 1219. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 95 | 25% | 111 |
| d414.nano.Quantum 1.0.0 | 87 | 23% | 93 |
| davidalves.net.DuelistNanoMelee 1.01 | 80 | 21% | 80 |
| mld.Wisdom 1.0 | 30 | 8% | 37 |
| zyx.nano.Ant 1.1 | 30 | 8% | 33 |
| amz.NanoClone 1.41 | 23 | 6% | 25 |
| arthord.NanoSatanMelee Beta | 17 | 4% | 19 |
| tvv.nano.Polaris 1.2 | 16 | 4% | 18 |
| arthord.MannyPacquiao Beta | 4 | 1% | 4 |

