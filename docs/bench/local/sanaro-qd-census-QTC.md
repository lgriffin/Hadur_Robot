# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 73.5 | 73 / 420 | 3.38 | 13.6% | 33608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.9% | 148 |
| hadur117.nano.SanaroQTC 0.4 | 2.4 | 13.6% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.7% | 94 |
| bzdp.Pansy 2.1 | 3.8 | 11.8% | 35 |
| tvv.nano.Polaris 1.2 | 5.8 | 9.4% | 34 |
| arthord.NanoSatanMelee Beta | 6.2 | 9.2% | 12 |
| zyx.nano.Ant 1.1 | 7.1 | 8.4% | 7 |
| fm.claire 1.7 | 7.3 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.6 | 6.8% | 13 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 65.1 | 3 / 35 | 2545 |
| 2 | 3 | 58.8 | 72.1 | 4 / 35 | 2470 |
| 3 | 3 | 60.5 | 73.7 | 6 / 35 | 2952 |
| 4 | 2 | 60.7 | 74.9 | 7 / 35 | 2944 |
| 5 | 2 | 59.9 | 69.5 | 4 / 35 | 3484 |
| 6 | 3 | 59.3 | 71.7 | 4 / 35 | 2911 |
| 7 | 3 | 61.1 | 77.1 | 5 / 35 | 2600 |
| 8 | 2 | 61.4 | 77.8 | 9 / 35 | 2753 |
| 9 | 4 | 56.1 | 64.8 | 2 / 35 | 2532 |
| 10 | 1 | 63.5 | 83.2 | 10 / 35 | 3142 |
| 11 | 2 | 61.2 | 77.8 | 7 / 35 | 2624 |
| 12 | 1 | 61.1 | 74.9 | 12 / 35 | 2651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 16% |
| d414.nano.Quantum 1.0.0 | 73 | 21% |
| bzdp.Pansy 2.1 | 28 | 68% |
| arthord.NanoSatanMelee Beta | 12 | 83% |
| tvv.nano.Polaris 1.2 | 11 | 9% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 91% |
| zyx.nano.Ant 1.1 | 8 | 50% |
| fm.claire 1.7 | 3 | 67% |

Hadur died in 348 of 420 rounds, at a mean tick of 1294. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 105 | 30% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 92 | 26% | 106 |
| bzdp.Pansy 2.1 | 40 | 11% | 57 |
| arthord.NanoSatanMelee Beta | 29 | 8% | 36 |
| tvv.nano.Polaris 1.2 | 27 | 8% | 27 |
| fm.claire 1.7 | 24 | 7% | 24 |
| zyx.nano.Ant 1.1 | 22 | 6% | 27 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 17 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |

## Melee bench: F02

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 72.0 | 63 / 420 | 3.52 | 13.0% | 30116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.2% | 104 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.2% | 61 |
| hadur117.nano.SanaroQTC 0.4 | 2.8 | 13.0% | 63 |
| simonton.nano.MeleeSeed 1.8 | 3.9 | 12.1% | 47 |
| DBall.Anarchy 0.1 | 5.1 | 11.0% | 52 |
| stelo.SoJNanoMelee 1.1 | 5.8 | 10.1% | 73 |
| fm.mammillarias 1.3 | 6.4 | 10.0% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.5% | 1 |
| sample.MyFirstRobot 1.0 | 8.9 | 5.8% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 71.4 | 3 / 35 | 2385 |
| 2 | 3 | 58.6 | 71.1 | 6 / 35 | 2590 |
| 3 | 2 | 60.1 | 74.9 | 10 / 35 | 2393 |
| 4 | 4 | 56.7 | 66.3 | 3 / 35 | 2285 |
| 5 | 1 | 59.9 | 77.8 | 9 / 35 | 1986 |
| 6 | 3 | 59.3 | 71.1 | 5 / 35 | 2757 |
| 7 | 4 | 55.6 | 64.8 | 1 / 35 | 2395 |
| 8 | 3 | 59.1 | 70.5 | 6 / 35 | 2840 |
| 9 | 4 | 59.2 | 70.2 | 4 / 35 | 2840 |
| 10 | 2 | 60.5 | 77.8 | 7 / 35 | 2366 |
| 11 | 2 | 58.9 | 73.0 | 4 / 35 | 2694 |
| 12 | 2 | 59.4 | 74.6 | 5 / 35 | 2585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 20% |
| d414.nano.Quantum 1.0.0 | 42 | 19% |
| DBall.Anarchy 0.1 | 36 | 56% |
| stelo.SoJNanoMelee 1.1 | 35 | 23% |
| simonton.nano.MeleeSeed 1.8 | 24 | 58% |
| sample.MyFirstRobot 1.0 | 6 | 17% |
| fm.mammillarias 1.3 | 4 | 75% |

Hadur died in 357 of 420 rounds, at a mean tick of 1289. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 95 | 27% | 106 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 21% | 87 |
| stelo.SoJNanoMelee 1.1 | 58 | 16% | 60 |
| simonton.nano.MeleeSeed 1.8 | 46 | 13% | 59 |
| fm.mammillarias 1.3 | 36 | 10% | 38 |
| DBall.Anarchy 0.1 | 26 | 7% | 46 |
| sample.MyFirstRobot 1.0 | 11 | 3% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 3% | 11 |

## Melee bench: F03

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.8 | 65 / 420 | 3.45 | 13.5% | 38188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.9% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.6% | 86 |
| hadur117.nano.SanaroQTC 0.4 | 2.7 | 13.5% | 65 |
| ahf.NanoAndrew .4 | 3.8 | 12.3% | 59 |
| ratosh.Nobo 0.21 | 5.0 | 11.4% | 11 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.3% | 14 |
| stelo.PatternRobot 1.0 | 7.2 | 7.7% | 26 |
| repositorio.NanoStep 1.0 | 8.4 | 6.0% | 6 |
| sample.Crazy 1.0 | 8.5 | 5.6% | 5 |
| kurios.DOSexe .9a | 9.9 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 71.7 | 5 / 35 | 2899 |
| 2 | 3 | 58.0 | 67.6 | 6 / 35 | 2901 |
| 3 | 4 | 57.9 | 65.7 | 2 / 35 | 3348 |
| 4 | 2 | 61.4 | 75.9 | 9 / 35 | 3069 |
| 5 | 3 | 61.0 | 73.7 | 6 / 35 | 3233 |
| 6 | 3 | 59.9 | 70.2 | 5 / 35 | 3515 |
| 7 | 2 | 61.3 | 76.5 | 7 / 35 | 3218 |
| 8 | 2 | 62.7 | 80.3 | 7 / 35 | 3302 |
| 9 | 2 | 59.8 | 74.0 | 4 / 35 | 3031 |
| 10 | 3 | 60.3 | 74.3 | 5 / 35 | 3178 |
| 11 | 2 | 59.1 | 71.1 | 4 / 35 | 3126 |
| 12 | 2 | 60.0 | 72.7 | 5 / 35 | 3368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 18% |
| ahf.NanoAndrew .4 | 24 | 58% |
| ratosh.Nobo 0.21 | 12 | 83% |
| stelo.PatternRobot 1.0 | 11 | 36% |
| timmit.nano.TimDog 0.33 | 7 | 57% |
| sample.Crazy 1.0 | 7 | 86% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 356 of 420 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 132 | 37% | 147 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 20% | 86 |
| ahf.NanoAndrew .4 | 67 | 19% | 79 |
| stelo.PatternRobot 1.0 | 27 | 8% | 31 |
| ratosh.Nobo 0.21 | 25 | 7% | 35 |
| timmit.nano.TimDog 0.33 | 14 | 4% | 17 |
| kurios.DOSexe .9a | 10 | 3% | 9 |
| sample.Crazy 1.0 | 5 | 1% | 11 |
| repositorio.NanoStep 1.0 | 4 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.6 | 83 / 420 | 2.75 | 15.4% | 51769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.6% | 156 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.4% | 127 |
| hadur117.nano.SanaroQTC 0.4 | 2.8 | 15.4% | 83 |
| wompi.Quokka 1.6 | 3.9 | 13.9% | 36 |
| kurios.DOSexe .9b | 5.9 | 7.1% | 4 |
| maribo.FollowFire 1 | 6.4 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.7 | 6.7% | 4 |
| jangs.ns51 1.0 | 7.2 | 6.4% | 9 |
| sample.VelociRobot 1.0 | 8.8 | 5.5% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 63.3 | 80.6 | 5 / 35 | 3804 |
| 2 | 3 | 64.9 | 83.2 | 9 / 35 | 4158 |
| 3 | 3 | 64.7 | 80.6 | 8 / 35 | 4865 |
| 4 | 2 | 64.3 | 82.2 | 4 / 35 | 4383 |
| 5 | 2 | 64.9 | 85.1 | 10 / 35 | 3886 |
| 6 | 3 | 63.1 | 78.1 | 4 / 35 | 4329 |
| 7 | 3 | 63.8 | 78.7 | 8 / 35 | 4292 |
| 8 | 3 | 63.4 | 74.0 | 7 / 35 | 4387 |
| 9 | 3 | 65.1 | 81.3 | 6 / 35 | 4662 |
| 10 | 2 | 65.6 | 84.1 | 10 / 35 | 4604 |
| 11 | 3 | 63.3 | 79.7 | 7 / 35 | 3882 |
| 12 | 3 | 64.2 | 79.7 | 5 / 35 | 4517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 117 | 20% |
| d414.nano.Quantum 1.0.0 | 93 | 25% |
| wompi.Quokka 1.6 | 38 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 57% |
| jangs.ns51 1.0 | 5 | 20% |
| kurios.DOSexe .9b | 4 | 50% |
| drd.Dreadknoght 0.9 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 337 of 420 rounds, at a mean tick of 1844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 133 | 39% | 164 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 123 | 36% | 150 |
| wompi.Quokka 1.6 | 43 | 13% | 57 |
| jangs.ns51 1.0 | 11 | 3% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 9 | 3% | 13 |
| maribo.FollowFire 1 | 8 | 2% | 7 |
| kurios.DOSexe .9b | 6 | 2% | 8 |
| sample.VelociRobot 1.0 | 3 | 1% | 6 |
| drd.Dreadknoght 0.9 | 1 | 0% | 3 |

## Melee bench: F05

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 77.2 | 66 / 420 | 3.05 | 14.1% | 41694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.3% | 180 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 15.1% | 112 |
| hadur117.nano.SanaroQTC 0.4 | 3.0 | 14.1% | 66 |
| ntc.Opposite 1.5 | 4.1 | 12.2% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.2 | 10.8% | 18 |
| js.PinBall 1.6 | 5.5 | 11.0% | 13 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.0% | 9 |
| PSW.Relentless 0.1 | 8.6 | 4.5% | 0 |
| sample.Fire 1.0 | 8.6 | 4.4% | 3 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 82.2 | 7 / 35 | 2984 |
| 2 | 3 | 61.7 | 77.5 | 4 / 35 | 3221 |
| 3 | 4 | 59.3 | 70.2 | 1 / 35 | 3497 |
| 4 | 3 | 63.3 | 81.0 | 7 / 35 | 3734 |
| 5 | 3 | 63.0 | 78.1 | 6 / 35 | 3743 |
| 6 | 2 | 64.0 | 81.6 | 7 / 35 | 3913 |
| 7 | 2 | 63.9 | 83.5 | 10 / 35 | 3558 |
| 8 | 4 | 61.3 | 72.7 | 5 / 35 | 3597 |
| 9 | 3 | 62.3 | 76.5 | 5 / 35 | 3609 |
| 10 | 4 | 59.6 | 73.3 | 6 / 35 | 2550 |
| 11 | 3 | 62.1 | 76.2 | 4 / 35 | 3805 |
| 12 | 3 | 61.2 | 74.3 | 4 / 35 | 3483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 96 | 17% |
| d414.nano.Quantum 1.0.0 | 93 | 14% |
| ntc.Opposite 1.5 | 15 | 67% |
| js.PinBall 1.6 | 13 | 92% |
| sp.Nanos.Ember 1.1 | 13 | 77% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 50% |
| sample.Fire 1.0 | 2 | 0% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 354 of 420 rounds, at a mean tick of 1583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 145 | 41% | 164 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 102 | 29% | 122 |
| ntc.Opposite 1.5 | 35 | 10% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 34 | 10% | 38 |
| js.PinBall 1.6 | 25 | 7% | 35 |
| sp.Nanos.Ember 1.1 | 6 | 2% | 13 |
| PSW.Relentless 0.1 | 4 | 1% | 4 |
| sample.Fire 1.0 | 3 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 69.0 | 62 / 420 | 3.79 | 12.5% | 30254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.8 | 14.3% | 108 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.1% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 59 |
| radnor.DoctorBob 1.42 | 4.0 | 12.5% | 42 |
| hadur117.nano.SanaroQTC 0.4 | 4.1 | 12.5% | 62 |
| myl.nano.Graviton 1.10 | 5.8 | 10.9% | 41 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.5% | 4 |
| ratosh.Wesco 1.4 | 8.1 | 7.1% | 8 |
| stelo.MirrorNano 1.3 | 8.2 | 7.4% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 71.7 | 5 / 35 | 2345 |
| 2 | 4 | 60.1 | 71.1 | 11 / 35 | 2252 |
| 3 | 6 | 56.5 | 62.2 | 3 / 35 | 2312 |
| 4 | 3 | 58.9 | 68.9 | 4 / 35 | 2630 |
| 5 | 2 | 59.6 | 71.1 | 6 / 35 | 2572 |
| 6 | 5 | 58.1 | 67.9 | 3 / 35 | 2568 |
| 7 | 5 | 58.7 | 67.3 | 5 / 35 | 2657 |
| 8 | 4 | 60.2 | 73.3 | 4 / 35 | 2417 |
| 9 | 5 | 58.8 | 69.2 | 6 / 35 | 2583 |
| 10 | 5 | 58.3 | 66.0 | 5 / 35 | 2550 |
| 11 | 3 | 60.5 | 70.2 | 7 / 35 | 2939 |
| 12 | 4 | 58.3 | 69.2 | 3 / 35 | 2429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 25% |
| kawigi.nano.Lib 1.0 | 43 | 26% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 23% |
| radnor.DoctorBob 1.42 | 23 | 61% |
| myl.nano.Graviton 1.10 | 13 | 77% |
| ratosh.Wesco 1.4 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 359 of 420 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 84 | 23% | 93 |
| d414.nano.Quantum 1.0.0 | 81 | 23% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 62 | 17% | 75 |
| radnor.DoctorBob 1.42 | 54 | 15% | 62 |
| myl.nano.Graviton 1.10 | 36 | 10% | 46 |
| squidM.TentalceMeleeNano 1.1 | 19 | 5% | 20 |
| ratosh.Wesco 1.4 | 14 | 4% | 18 |
| stelo.MirrorNano 1.3 | 9 | 3% | 9 |

## Melee bench: F07

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.1 | 99 / 420 | 3.51 | 13.4% | 35063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.5% | 100 |
| hadur117.nano.SanaroQTC 0.4 | 2.4 | 13.4% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 84 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 12.5% | 44 |
| cb.nano.Insomnia 1.0 | 4.8 | 12.0% | 52 |
| oog.melee.CapuletDroid 1.1 | 6.3 | 10.9% | 21 |
| mz.Cork 0.1 | 6.3 | 10.7% | 21 |
| stuff.Vlad 0.1 | 8.5 | 4.9% | 0 |
| stelo.UntouchableNano 1.3 | 8.6 | 4.9% | 0 |
| sample.TrackFire 1.0 | 9.9 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 76.8 | 12 / 35 | 2949 |
| 2 | 3 | 60.5 | 72.7 | 8 / 35 | 2867 |
| 3 | 3 | 58.1 | 67.6 | 6 / 35 | 2793 |
| 4 | 3 | 58.8 | 66.0 | 8 / 35 | 2937 |
| 5 | 3 | 60.0 | 72.4 | 6 / 35 | 2811 |
| 6 | 4 | 60.0 | 73.0 | 7 / 35 | 2771 |
| 7 | 1 | 61.8 | 75.6 | 11 / 35 | 3033 |
| 8 | 1 | 62.5 | 77.8 | 10 / 35 | 2943 |
| 9 | 4 | 58.9 | 68.3 | 4 / 35 | 2966 |
| 10 | 2 | 59.9 | 70.5 | 8 / 35 | 3116 |
| 11 | 2 | 59.9 | 72.7 | 9 / 35 | 2664 |
| 12 | 2 | 61.2 | 71.7 | 10 / 35 | 3213 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 27% |
| d414.nano.Quantum 1.0.0 | 44 | 18% |
| nz.jdc.nano.GridFu 1.0 | 41 | 83% |
| cb.nano.Insomnia 1.0 | 35 | 74% |
| mz.Cork 0.1 | 15 | 73% |
| oog.melee.CapuletDroid 1.1 | 14 | 43% |
| sample.TrackFire 1.0 | 2 | 50% |

Hadur died in 321 of 420 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 30% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 23% | 105 |
| nz.jdc.nano.GridFu 1.0 | 42 | 13% | 78 |
| cb.nano.Insomnia 1.0 | 38 | 12% | 28 |
| oog.melee.CapuletDroid 1.1 | 35 | 11% | 46 |
| mz.Cork 0.1 | 26 | 8% | 39 |
| stelo.UntouchableNano 1.3 | 4 | 1% | 5 |
| stuff.Vlad 0.1 | 3 | 1% | 4 |
| sample.TrackFire 1.0 | 3 | 1% | 3 |

## Melee bench: F08

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.6 | 100 / 420 | 3.02 | 14.2% | 35476 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.9% | 132 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 14.4% | 92 |
| hadur117.nano.SanaroQTC 0.4 | 2.7 | 14.2% | 100 |
| gh.nano.Grofvuil 0.2 | 3.7 | 12.9% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 10.8% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 10.1% | 26 |
| baal.nano.N 1.42 | 6.9 | 9.0% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.4 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 8.6 | 5.6% | 12 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 76.2 | 8 / 35 | 3129 |
| 2 | 2 | 63.9 | 84.1 | 9 / 35 | 3027 |
| 3 | 3 | 61.4 | 76.5 | 7 / 35 | 2995 |
| 4 | 4 | 60.7 | 72.4 | 7 / 35 | 2782 |
| 5 | 4 | 59.6 | 72.7 | 3 / 35 | 2574 |
| 6 | 3 | 62.6 | 78.7 | 9 / 35 | 2985 |
| 7 | 3 | 61.8 | 77.1 | 6 / 35 | 3143 |
| 8 | 1 | 64.2 | 82.2 | 15 / 35 | 3051 |
| 9 | 2 | 62.9 | 76.2 | 13 / 35 | 2788 |
| 10 | 3 | 61.5 | 74.6 | 6 / 35 | 3311 |
| 11 | 3 | 62.3 | 79.0 | 6 / 35 | 2907 |
| 12 | 1 | 63.0 | 81.3 | 11 / 35 | 2784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 81 | 26% |
| d414.nano.Quantum 1.0.0 | 81 | 25% |
| gh.nano.Grofvuil 0.2 | 37 | 73% |
| djdjdj.NanoSkunk10 1.0 | 23 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 88% |
| donjezza.Muncho 1.0 | 7 | 57% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 320 of 420 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 119 | 37% | 146 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 89 | 28% | 110 |
| dmh.robocode.robot.RedDwarf 0.4 | 30 | 9% | 34 |
| gh.nano.Grofvuil 0.2 | 29 | 9% | 56 |
| djdjdj.NanoSkunk10 1.0 | 22 | 7% | 38 |
| baal.nano.N 1.42 | 13 | 4% | 14 |
| donjezza.Muncho 1.0 | 12 | 4% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |

## Melee bench: F09

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 12 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 64.4 | 76 / 420 | 4.20 | 12.0% | 27860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.3 | 12.8% | 70 |
| mld.DustBunny 3.8 | 3.3 | 12.1% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 11.6% | 60 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.7% | 68 |
| hadur117.nano.SanaroQTC 0.4 | 3.7 | 12.0% | 76 |
| wee.Gem 1.8.4 | 5.7 | 10.6% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 9.9% | 27 |
| tj.zombie1n 1.0.1 | 8.6 | 6.7% | 17 |
| cs.sheldor.Talon 1.1 | 8.8 | 6.8% | 2 |
| step.nanoPri 1.0 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 50.4 | 50.2 | 4 / 35 | 2483 |
| 2 | 1 | 59.0 | 74.6 | 8 / 35 | 2191 |
| 3 | 5 | 55.1 | 63.2 | 5 / 35 | 2149 |
| 4 | 1 | 60.0 | 77.1 | 8 / 35 | 2532 |
| 5 | 6 | 54.7 | 61.3 | 4 / 35 | 2396 |
| 6 | 2 | 58.0 | 70.2 | 6 / 35 | 2281 |
| 7 | 2 | 57.8 | 68.6 | 7 / 35 | 2463 |
| 8 | 3 | 57.4 | 68.3 | 7 / 35 | 2372 |
| 9 | 3 | 54.0 | 58.4 | 9 / 35 | 2341 |
| 10 | 4 | 54.7 | 61.3 | 6 / 35 | 2292 |
| 11 | 5 | 53.9 | 58.4 | 6 / 35 | 2296 |
| 12 | 6 | 54.6 | 61.9 | 6 / 35 | 2064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 37% |
| wee.Gem 1.8.4 | 32 | 69% |
| stelo.SoRobotNanoMelee 1.2 | 30 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 17% |
| mld.DustBunny 3.8 | 28 | 29% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 40% |
| tj.zombie1n 1.0.1 | 6 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 344 of 420 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 19% | 87 |
| mld.DustBunny 3.8 | 60 | 17% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 17% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 57 | 17% | 61 |
| wee.Gem 1.8.4 | 32 | 9% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 9% | 41 |
| cs.sheldor.Talon 1.1 | 15 | 4% | 17 |
| step.nanoPri 1.0 | 14 | 4% | 15 |
| tj.zombie1n 1.0.1 | 11 | 3% | 8 |

## Melee bench: F10

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 78.0 | 96 / 420 | 2.98 | 14.7% | 41138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.7% | 101 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.1% | 99 |
| mld.Infinity 2.2 | 2.8 | 14.7% | 111 |
| hadur117.nano.SanaroQTC 0.4 | 2.8 | 14.7% | 96 |
| robar.nano.Assertive_Melee 0.2 | 6.1 | 7.9% | 1 |
| ayk.WallHugger 1.0 | 6.3 | 7.7% | 6 |
| conscience.Electron 1.3g | 6.9 | 7.3% | 1 |
| exauge.GateKeeper 1.1.121g | 7.3 | 7.2% | 0 |
| donjezza.Jezza 1.0 | 8.5 | 6.0% | 5 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 70.5 | 8 / 35 | 3222 |
| 2 | 3 | 61.5 | 75.2 | 9 / 35 | 3238 |
| 3 | 2 | 64.2 | 81.3 | 10 / 35 | 3647 |
| 4 | 1 | 65.0 | 85.4 | 11 / 35 | 3728 |
| 5 | 3 | 63.7 | 78.1 | 9 / 35 | 3866 |
| 6 | 3 | 62.6 | 77.1 | 7 / 35 | 3620 |
| 7 | 3 | 61.5 | 76.8 | 6 / 35 | 3256 |
| 8 | 2 | 62.9 | 81.3 | 11 / 35 | 3091 |
| 9 | 4 | 60.6 | 73.3 | 4 / 35 | 3276 |
| 10 | 4 | 62.1 | 77.8 | 6 / 35 | 3352 |
| 11 | 2 | 63.8 | 81.0 | 8 / 35 | 3658 |
| 12 | 3 | 62.0 | 78.4 | 7 / 35 | 3184 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 102 | 46% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 24% |
| d414.nano.Quantum 1.0.0 | 55 | 29% |
| ayk.WallHugger 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 4 | 75% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 326 of 420 rounds, at a mean tick of 1744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 31% | 158 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 88 | 27% | 152 |
| mld.Infinity 2.2 | 81 | 25% | 34 |
| robar.nano.Assertive_Melee 0.2 | 20 | 6% | 26 |
| conscience.Electron 1.3g | 12 | 4% | 13 |
| ayk.WallHugger 1.0 | 9 | 3% | 16 |
| donjezza.Jezza 1.0 | 9 | 3% | 13 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 8 |

## Melee bench: F11

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 76.1 | 114 / 420 | 3.15 | 14.3% | 35107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 15.5% | 129 |
| hadur117.nano.SanaroQTC 0.4 | 2.2 | 14.3% | 114 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.5% | 83 |
| oog.melee.Corsair 1.0 | 3.7 | 12.6% | 43 |
| mz.NanoGod 2.02 | 4.7 | 11.4% | 36 |
| DBall.NUKE 0.1 | 6.7 | 7.8% | 6 |
| awesomeness.Elite 1.0 | 7.1 | 7.6% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.6 | 7.1% | 1 |
| sample.Walls 1.0 | 8.7 | 6.2% | 5 |
| stelo.PianistNano 1.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 77.1 | 10 / 35 | 3497 |
| 2 | 2 | 61.3 | 74.0 | 8 / 35 | 3162 |
| 3 | 4 | 59.3 | 70.2 | 5 / 35 | 2859 |
| 4 | 3 | 58.9 | 70.2 | 7 / 35 | 2653 |
| 5 | 3 | 60.2 | 73.3 | 10 / 35 | 2736 |
| 6 | 2 | 60.6 | 74.9 | 8 / 35 | 2661 |
| 7 | 2 | 63.4 | 83.2 | 12 / 35 | 2677 |
| 8 | 2 | 59.5 | 70.5 | 8 / 35 | 2770 |
| 9 | 1 | 63.5 | 81.9 | 13 / 35 | 3129 |
| 10 | 1 | 63.6 | 82.5 | 11 / 35 | 2994 |
| 11 | 4 | 59.7 | 70.8 | 10 / 35 | 2726 |
| 12 | 1 | 64.0 | 84.8 | 12 / 35 | 3243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 24% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 66 | 27% |
| oog.melee.Corsair 1.0 | 38 | 76% |
| DBall.NUKE 0.1 | 27 | 93% |
| mz.NanoGod 2.02 | 23 | 57% |
| sample.Walls 1.0 | 8 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 309 of 420 rounds, at a mean tick of 1178. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 100 | 32% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 80 | 26% | 103 |
| mz.NanoGod 2.02 | 54 | 17% | 70 |
| oog.melee.Corsair 1.0 | 34 | 11% | 62 |
| DBall.NUKE 0.1 | 11 | 4% | 29 |
| zyx.nano.BacillusComma 1.0 | 10 | 3% | 13 |
| awesomeness.Elite 1.0 | 9 | 3% | 10 |
| stelo.PianistNano 1.2 | 6 | 2% | 7 |
| sample.Walls 1.0 | 5 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 69.8 | 57 / 420 | 3.71 | 12.7% | 30110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.9% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 12.7% | 59 |
| hadur117.nano.SanaroQTC 0.4 | 3.0 | 12.7% | 57 |
| myl.nano.KomoriNinja 1.1 | 3.4 | 12.3% | 53 |
| sul.Lunar 1.1 | 4.4 | 11.6% | 63 |
| sam.Samspin 1.0 | 7.2 | 8.1% | 15 |
| spinnercat.Omen 1.0 | 7.3 | 7.8% | 14 |
| maribo.melee.BMV 0.1 | 7.3 | 8.1% | 2 |
| sample.SpinBot 1.0 | 8.3 | 7.3% | 16 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.6 | 74.6 | 3 / 35 | 2237 |
| 2 | 3 | 58.0 | 70.2 | 3 / 35 | 2648 |
| 3 | 2 | 59.2 | 74.0 | 4 / 35 | 2585 |
| 4 | 3 | 58.1 | 70.5 | 5 / 35 | 2485 |
| 5 | 4 | 58.1 | 67.3 | 6 / 35 | 2712 |
| 6 | 3 | 57.9 | 69.2 | 8 / 35 | 2403 |
| 7 | 4 | 56.3 | 66.0 | 2 / 35 | 2586 |
| 8 | 5 | 55.7 | 67.3 | 2 / 35 | 2315 |
| 9 | 2 | 60.6 | 75.2 | 9 / 35 | 2648 |
| 10 | 3 | 56.4 | 66.3 | 2 / 35 | 2511 |
| 11 | 3 | 55.5 | 62.5 | 6 / 35 | 2353 |
| 12 | 2 | 59.9 | 74.9 | 7 / 35 | 2627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 16% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 23% |
| sul.Lunar 1.1 | 42 | 10% |
| myl.nano.KomoriNinja 1.1 | 29 | 66% |
| spinnercat.Omen 1.0 | 9 | 78% |
| sample.SpinBot 1.0 | 6 | 50% |
| cvt.Firsty 1.0 | 3 | 33% |
| sam.Samspin 1.0 | 3 | 33% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 363 of 420 rounds, at a mean tick of 1231. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 105 | 29% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 21% | 85 |
| sul.Lunar 1.1 | 63 | 17% | 70 |
| myl.nano.KomoriNinja 1.1 | 36 | 10% | 54 |
| sam.Samspin 1.0 | 24 | 7% | 23 |
| sample.SpinBot 1.0 | 21 | 6% | 23 |
| maribo.melee.BMV 0.1 | 16 | 4% | 18 |
| spinnercat.Omen 1.0 | 15 | 4% | 19 |
| cvt.Firsty 1.0 | 7 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroQTC 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 69.0 | 51 / 420 | 3.79 | 12.2% | 27864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.7% | 129 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.8 | 14.6% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 71 |
| hadur117.nano.SanaroQTC 0.4 | 3.8 | 12.2% | 51 |
| mld.Wisdom 1.0 | 4.9 | 10.3% | 17 |
| tvv.nano.Polaris 1.2 | 7.1 | 8.4% | 18 |
| zyx.nano.Ant 1.1 | 7.5 | 8.1% | 9 |
| amz.NanoClone 1.41 | 7.6 | 8.1% | 6 |
| arthord.NanoSatanMelee Beta | 7.7 | 8.0% | 7 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.1 | 63.8 | 2 / 35 | 1899 |
| 2 | 4 | 54.8 | 64.8 | 3 / 35 | 2117 |
| 3 | 4 | 58.1 | 71.1 | 4 / 35 | 2303 |
| 4 | 3 | 58.9 | 74.9 | 5 / 35 | 2311 |
| 5 | 5 | 56.7 | 65.1 | 5 / 35 | 2549 |
| 6 | 3 | 59.7 | 74.9 | 9 / 35 | 2453 |
| 7 | 4 | 54.7 | 63.5 | 5 / 35 | 2114 |
| 8 | 4 | 56.2 | 65.7 | 5 / 35 | 2357 |
| 9 | 3 | 58.1 | 70.5 | 4 / 35 | 2304 |
| 10 | 3 | 59.0 | 74.6 | 3 / 35 | 2406 |
| 11 | 4 | 57.7 | 68.3 | 4 / 35 | 2783 |
| 12 | 4 | 57.4 | 71.4 | 2 / 35 | 2268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 23% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 9% |
| davidalves.net.DuelistNanoMelee 1.01 | 52 | 13% |
| tvv.nano.Polaris 1.2 | 12 | 25% |
| zyx.nano.Ant 1.1 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 7 | 86% |
| mld.Wisdom 1.0 | 5 | 80% |
| amz.NanoClone 1.41 | 4 | 100% |
| arthord.MannyPacquiao Beta | 2 | 100% |

Hadur died in 369 of 420 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 95 | 26% | 101 |
| d414.nano.Quantum 1.0.0 | 91 | 25% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 21% | 83 |
| mld.Wisdom 1.0 | 29 | 8% | 36 |
| arthord.NanoSatanMelee Beta | 23 | 6% | 26 |
| amz.NanoClone 1.41 | 20 | 5% | 23 |
| zyx.nano.Ant 1.1 | 17 | 5% | 20 |
| tvv.nano.Polaris 1.2 | 13 | 4% | 16 |
| arthord.MannyPacquiao Beta | 4 | 1% | 4 |

