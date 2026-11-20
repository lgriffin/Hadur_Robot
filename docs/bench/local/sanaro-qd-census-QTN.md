# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 70.1 | 51 / 420 | 3.69 | 12.7% | 31141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.7% | 145 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.9% | 107 |
| hadur117.nano.SanaroQTN 0.4 | 3.2 | 12.7% | 51 |
| bzdp.Pansy 2.1 | 3.3 | 12.8% | 53 |
| tvv.nano.Polaris 1.2 | 5.6 | 9.8% | 33 |
| arthord.NanoSatanMelee Beta | 6.1 | 9.2% | 8 |
| zyx.nano.Ant 1.1 | 6.8 | 8.4% | 9 |
| fm.claire 1.7 | 7.8 | 8.0% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.1% | 7 |
| arthord.MannyPacquiao Beta | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 67.9 | 2 / 35 | 2405 |
| 2 | 3 | 57.9 | 65.4 | 4 / 35 | 2809 |
| 3 | 2 | 60.8 | 75.9 | 6 / 35 | 2849 |
| 4 | 4 | 56.8 | 66.3 | 4 / 35 | 2476 |
| 5 | 2 | 59.6 | 72.4 | 5 / 35 | 2787 |
| 6 | 4 | 55.7 | 66.7 | 1 / 35 | 2442 |
| 7 | 3 | 60.4 | 73.0 | 6 / 35 | 2835 |
| 8 | 3 | 58.3 | 69.5 | 6 / 35 | 2527 |
| 9 | 4 | 58.8 | 71.7 | 5 / 35 | 2381 |
| 10 | 3 | 58.3 | 70.5 | 5 / 35 | 2558 |
| 11 | 3 | 58.4 | 70.8 | 4 / 35 | 2442 |
| 12 | 3 | 58.5 | 71.4 | 3 / 35 | 2630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 64 | 8% |
| d414.nano.Quantum 1.0.0 | 61 | 13% |
| bzdp.Pansy 2.1 | 26 | 62% |
| tvv.nano.Polaris 1.2 | 16 | 13% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 89% |
| zyx.nano.Ant 1.1 | 8 | 50% |
| arthord.NanoSatanMelee Beta | 6 | 83% |
| fm.claire 1.7 | 4 | 50% |

Hadur died in 369 of 420 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 101 | 27% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 94 | 25% | 102 |
| bzdp.Pansy 2.1 | 62 | 17% | 80 |
| zyx.nano.Ant 1.1 | 31 | 8% | 34 |
| arthord.NanoSatanMelee Beta | 27 | 7% | 31 |
| tvv.nano.Polaris 1.2 | 27 | 7% | 28 |
| fm.claire 1.7 | 15 | 4% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 2% | 17 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |

## Melee bench: F02

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 71.9 | 57 / 420 | 3.53 | 12.8% | 28913 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 14.9% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.1% | 65 |
| hadur117.nano.SanaroQTN 0.4 | 2.8 | 12.8% | 57 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 12.2% | 41 |
| DBall.Anarchy 0.1 | 5.3 | 10.8% | 46 |
| stelo.SoJNanoMelee 1.1 | 6.1 | 9.6% | 66 |
| fm.mammillarias 1.3 | 6.7 | 9.3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.8% | 25 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.9 | 72.7 | 8 / 35 | 2354 |
| 2 | 2 | 59.1 | 73.0 | 6 / 35 | 2375 |
| 3 | 2 | 59.3 | 75.2 | 6 / 35 | 2184 |
| 4 | 4 | 58.0 | 71.4 | 3 / 35 | 2368 |
| 5 | 2 | 58.8 | 73.7 | 6 / 35 | 2395 |
| 6 | 3 | 57.8 | 70.5 | 5 / 35 | 2283 |
| 7 | 2 | 59.8 | 74.3 | 5 / 35 | 2599 |
| 8 | 3 | 57.9 | 70.2 | 4 / 35 | 2527 |
| 9 | 3 | 58.8 | 71.1 | 3 / 35 | 2681 |
| 10 | 3 | 58.3 | 73.3 | 3 / 35 | 2289 |
| 11 | 4 | 58.6 | 71.1 | 6 / 35 | 2381 |
| 12 | 3 | 56.0 | 66.7 | 2 / 35 | 2477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 16% |
| d414.nano.Quantum 1.0.0 | 42 | 7% |
| DBall.Anarchy 0.1 | 35 | 60% |
| stelo.SoJNanoMelee 1.1 | 33 | 33% |
| simonton.nano.MeleeSeed 1.8 | 15 | 67% |
| fm.mammillarias 1.3 | 6 | 67% |
| sample.MyFirstRobot 1.0 | 5 | 0% |

Hadur died in 364 of 420 rounds, at a mean tick of 1272. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 26% | 107 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 78 | 21% | 91 |
| stelo.SoJNanoMelee 1.1 | 55 | 15% | 58 |
| simonton.nano.MeleeSeed 1.8 | 40 | 11% | 48 |
| DBall.Anarchy 0.1 | 37 | 10% | 57 |
| fm.mammillarias 1.3 | 37 | 10% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 2% | 9 |
| sample.MyFirstRobot 1.0 | 9 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 3 | 1% | 3 |

## Melee bench: F03

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 71.0 | 39 / 420 | 3.61 | 13.1% | 37636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.2% | 168 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.2% | 84 |
| hadur117.nano.SanaroQTN 0.4 | 3.0 | 13.1% | 39 |
| ahf.NanoAndrew .4 | 4.3 | 12.0% | 53 |
| ratosh.Nobo 0.21 | 4.4 | 11.7% | 21 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.3% | 18 |
| stelo.PatternRobot 1.0 | 7.1 | 7.6% | 24 |
| repositorio.NanoStep 1.0 | 8.3 | 6.0% | 7 |
| sample.Crazy 1.0 | 8.7 | 5.6% | 6 |
| kurios.DOSexe .9a | 9.9 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 68.6 | 4 / 35 | 3119 |
| 2 | 4 | 57.2 | 65.7 | 2 / 35 | 2910 |
| 3 | 4 | 57.4 | 66.7 | 1 / 35 | 3210 |
| 4 | 3 | 61.2 | 77.5 | 3 / 35 | 3230 |
| 5 | 3 | 59.4 | 73.0 | 3 / 35 | 3031 |
| 6 | 2 | 60.9 | 75.6 | 3 / 35 | 3359 |
| 7 | 3 | 60.4 | 71.7 | 4 / 35 | 3690 |
| 8 | 3 | 59.2 | 71.4 | 3 / 35 | 3106 |
| 9 | 3 | 58.4 | 68.3 | 2 / 35 | 3264 |
| 10 | 3 | 57.7 | 66.7 | 4 / 35 | 2906 |
| 11 | 3 | 59.3 | 71.4 | 4 / 35 | 2956 |
| 12 | 2 | 60.2 | 75.2 | 6 / 35 | 2855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 64 | 13% |
| ahf.NanoAndrew .4 | 15 | 40% |
| ratosh.Nobo 0.21 | 10 | 40% |
| stelo.PatternRobot 1.0 | 9 | 22% |
| timmit.nano.TimDog 0.33 | 6 | 33% |
| sample.Crazy 1.0 | 6 | 67% |
| repositorio.NanoStep 1.0 | 6 | 67% |

Hadur died in 381 of 420 rounds, at a mean tick of 1178. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 123 | 32% | 128 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 84 | 22% | 93 |
| ahf.NanoAndrew .4 | 58 | 15% | 68 |
| ratosh.Nobo 0.21 | 39 | 10% | 45 |
| stelo.PatternRobot 1.0 | 35 | 9% | 35 |
| timmit.nano.TimDog 0.33 | 25 | 7% | 27 |
| repositorio.NanoStep 1.0 | 7 | 2% | 11 |
| sample.Crazy 1.0 | 6 | 2% | 9 |
| kurios.DOSexe .9a | 4 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 12 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.6 | 51 / 420 | 3.11 | 14.0% | 44161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 18.4% | 180 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.1 | 16.4% | 129 |
| wompi.Quokka 1.6 | 3.3 | 14.2% | 42 |
| hadur117.nano.SanaroQTN 0.4 | 3.5 | 14.0% | 51 |
| kurios.DOSexe .9b | 5.8 | 7.3% | 3 |
| maribo.FollowFire 1 | 6.3 | 7.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.6 | 6.7% | 9 |
| jangs.ns51 1.0 | 7.9 | 6.0% | 4 |
| sample.VelociRobot 1.0 | 8.8 | 5.6% | 1 |
| drd.Dreadknoght 0.9 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.5 | 75.6 | 3 / 35 | 3640 |
| 2 | 3 | 63.5 | 80.6 | 6 / 35 | 3943 |
| 3 | 4 | 59.7 | 72.1 | 4 / 35 | 3303 |
| 4 | 3 | 60.3 | 71.1 | 3 / 35 | 3752 |
| 5 | 4 | 62.3 | 77.8 | 1 / 35 | 3888 |
| 6 | 4 | 63.0 | 80.0 | 6 / 35 | 3639 |
| 7 | 3 | 63.0 | 80.3 | 3 / 35 | 3749 |
| 8 | 4 | 58.2 | 67.9 | 4 / 35 | 3210 |
| 9 | 4 | 61.1 | 74.6 | 3 / 35 | 3352 |
| 10 | 4 | 62.7 | 78.7 | 7 / 35 | 3566 |
| 11 | 2 | 63.4 | 81.6 | 7 / 35 | 3610 |
| 12 | 3 | 63.5 | 78.7 | 4 / 35 | 4509 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 93 | 6% |
| d414.nano.Quantum 1.0.0 | 71 | 6% |
| wompi.Quokka 1.6 | 35 | 80% |
| kurios.DOSexe .9b | 6 | 83% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| jangs.ns51 1.0 | 4 | 75% |
| drd.Dreadknoght 0.9 | 1 | 0% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 370 of 420 rounds, at a mean tick of 1584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 145 | 39% | 154 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 115 | 31% | 130 |
| wompi.Quokka 1.6 | 60 | 16% | 75 |
| maribo.FollowFire 1 | 14 | 4% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 11 | 3% | 16 |
| jangs.ns51 1.0 | 10 | 3% | 10 |
| kurios.DOSexe .9b | 9 | 2% | 14 |
| sample.VelociRobot 1.0 | 4 | 1% | 5 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 77.6 | 62 / 420 | 3.02 | 13.9% | 38732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.3% | 181 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.4% | 111 |
| hadur117.nano.SanaroQTN 0.4 | 3.2 | 13.9% | 62 |
| ntc.Opposite 1.5 | 3.9 | 12.6% | 27 |
| js.PinBall 1.6 | 5.1 | 11.0% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 10.5% | 10 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.4% | 11 |
| sample.Fire 1.0 | 8.3 | 4.5% | 2 |
| PSW.Relentless 0.1 | 8.8 | 4.3% | 0 |
| sample.Target 1.0 | 9.9 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.8 | 76.5 | 3 / 35 | 3095 |
| 2 | 3 | 61.6 | 76.5 | 7 / 35 | 3125 |
| 3 | 3 | 62.8 | 80.6 | 7 / 35 | 3128 |
| 4 | 4 | 58.5 | 68.3 | 2 / 35 | 3068 |
| 5 | 3 | 62.2 | 78.4 | 5 / 35 | 3359 |
| 6 | 3 | 61.5 | 75.2 | 5 / 35 | 3445 |
| 7 | 3 | 61.5 | 78.1 | 5 / 35 | 3093 |
| 8 | 4 | 61.3 | 79.4 | 3 / 35 | 2815 |
| 9 | 3 | 62.2 | 78.7 | 3 / 35 | 3508 |
| 10 | 3 | 62.2 | 79.0 | 7 / 35 | 2988 |
| 11 | 2 | 64.5 | 83.5 | 9 / 35 | 3625 |
| 12 | 3 | 62.1 | 76.5 | 6 / 35 | 3483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 81 | 15% |
| js.PinBall 1.6 | 17 | 71% |
| ntc.Opposite 1.5 | 15 | 53% |
| sp.Nanos.Ember 1.1 | 14 | 57% |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 69% |
| sample.Fire 1.0 | 3 | 67% |

Hadur died in 358 of 420 rounds, at a mean tick of 1429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 143 | 40% | 156 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 101 | 28% | 115 |
| ntc.Opposite 1.5 | 42 | 12% | 47 |
| js.PinBall 1.6 | 30 | 8% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 6% | 31 |
| sp.Nanos.Ember 1.1 | 11 | 3% | 18 |
| PSW.Relentless 0.1 | 6 | 2% | 6 |
| sample.Fire 1.0 | 2 | 1% | 5 |

## Melee bench: F06

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 72.8 | 47 / 420 | 3.45 | 13.2% | 33303 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 13.8% | 97 |
| kawigi.nano.Lib 1.0 | 2.4 | 13.7% | 95 |
| hadur117.nano.SanaroQTN 0.4 | 3.1 | 13.2% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 64 |
| radnor.DoctorBob 1.42 | 3.8 | 12.6% | 53 |
| myl.nano.Graviton 1.10 | 6.2 | 10.3% | 49 |
| ratosh.Wesco 1.4 | 7.8 | 7.7% | 13 |
| squidM.TentalceMeleeNano 1.1 | 7.9 | 7.6% | 2 |
| stelo.MirrorNano 1.3 | 8.1 | 7.6% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.4 | 69.2 | 4 / 35 | 2910 |
| 2 | 3 | 60.4 | 74.3 | 3 / 35 | 2660 |
| 3 | 4 | 60.2 | 73.3 | 5 / 35 | 2845 |
| 4 | 1 | 60.9 | 74.0 | 5 / 35 | 2912 |
| 5 | 4 | 59.5 | 71.1 | 5 / 35 | 2640 |
| 6 | 2 | 59.6 | 70.8 | 5 / 35 | 2863 |
| 7 | 5 | 59.1 | 69.8 | 2 / 35 | 2644 |
| 8 | 3 | 60.7 | 74.9 | 4 / 35 | 2700 |
| 9 | 4 | 59.6 | 72.1 | 2 / 35 | 2582 |
| 10 | 2 | 60.3 | 73.7 | 5 / 35 | 2559 |
| 11 | 3 | 60.3 | 73.0 | 3 / 35 | 3064 |
| 12 | 2 | 61.4 | 76.8 | 4 / 35 | 2924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 19% |
| d414.nano.Quantum 1.0.0 | 47 | 11% |
| kawigi.nano.Lib 1.0 | 43 | 14% |
| radnor.DoctorBob 1.42 | 26 | 54% |
| myl.nano.Graviton 1.10 | 16 | 25% |
| stelo.MirrorNano 1.3 | 3 | 67% |
| ratosh.Wesco 1.4 | 3 | 67% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.SittingDuck 1.0 | 1 | 100% |

Hadur died in 373 of 420 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 22% | 89 |
| kawigi.nano.Lib 1.0 | 82 | 22% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 20% | 84 |
| radnor.DoctorBob 1.42 | 62 | 17% | 74 |
| myl.nano.Graviton 1.10 | 42 | 11% | 48 |
| squidM.TentalceMeleeNano 1.1 | 10 | 3% | 13 |
| stelo.MirrorNano 1.3 | 10 | 3% | 12 |
| ratosh.Wesco 1.4 | 10 | 3% | 11 |

## Melee bench: F07

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 69.3 | 76 / 420 | 3.77 | 12.6% | 31961 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 14.6% | 109 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.2% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.1% | 83 |
| cb.nano.Insomnia 1.0 | 3.8 | 12.4% | 50 |
| hadur117.nano.SanaroQTN 0.4 | 4.3 | 12.6% | 76 |
| oog.melee.CapuletDroid 1.1 | 5.9 | 10.7% | 24 |
| mz.Cork 0.1 | 6.5 | 10.4% | 15 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.0% | 2 |
| stuff.Vlad 0.1 | 8.5 | 5.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.1 | 66.3 | 3 / 35 | 3089 |
| 2 | 4 | 59.8 | 69.2 | 9 / 35 | 2930 |
| 3 | 4 | 59.0 | 73.3 | 5 / 35 | 2220 |
| 4 | 4 | 58.0 | 67.9 | 7 / 35 | 2652 |
| 5 | 4 | 58.6 | 72.7 | 6 / 35 | 2303 |
| 6 | 4 | 59.3 | 69.8 | 10 / 35 | 2440 |
| 7 | 4 | 57.7 | 67.9 | 6 / 35 | 2617 |
| 8 | 3 | 61.0 | 74.9 | 8 / 35 | 3029 |
| 9 | 6 | 56.4 | 63.5 | 4 / 35 | 2448 |
| 10 | 5 | 56.8 | 62.5 | 3 / 35 | 2780 |
| 11 | 5 | 57.4 | 64.4 | 6 / 35 | 2773 |
| 12 | 3 | 61.8 | 78.4 | 9 / 35 | 2680 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 43 | 72% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 10% |
| d414.nano.Quantum 1.0.0 | 30 | 7% |
| nz.jdc.nano.GridFu 1.0 | 29 | 55% |
| oog.melee.CapuletDroid 1.1 | 13 | 92% |
| mz.Cork 0.1 | 11 | 91% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 344 of 420 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 103 | 30% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 66 | 19% | 85 |
| nz.jdc.nano.GridFu 1.0 | 58 | 17% | 81 |
| cb.nano.Insomnia 1.0 | 48 | 14% | 39 |
| oog.melee.CapuletDroid 1.1 | 29 | 8% | 43 |
| mz.Cork 0.1 | 29 | 8% | 41 |
| stelo.UntouchableNano 1.3 | 7 | 2% | 7 |
| sample.TrackFire 1.0 | 3 | 1% | 6 |
| stuff.Vlad 0.1 | 1 | 0% | 2 |

## Melee bench: F08

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 74.5 | 60 / 420 | 3.29 | 13.2% | 32601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.1% | 147 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.4% | 94 |
| hadur117.nano.SanaroQTN 0.4 | 3.3 | 13.2% | 60 |
| gh.nano.Grofvuil 0.2 | 3.3 | 13.0% | 57 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.9% | 10 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 10.2% | 30 |
| baal.nano.N 1.42 | 6.8 | 9.4% | 6 |
| donjezza.Muncho 1.0 | 8.3 | 5.7% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 80.6 | 8 / 35 | 2892 |
| 2 | 3 | 60.8 | 75.2 | 7 / 35 | 2753 |
| 3 | 3 | 59.9 | 72.1 | 6 / 35 | 2779 |
| 4 | 4 | 59.4 | 72.1 | 4 / 35 | 2720 |
| 5 | 4 | 58.5 | 67.3 | 5 / 35 | 2682 |
| 6 | 3 | 61.8 | 77.5 | 6 / 35 | 3078 |
| 7 | 3 | 60.3 | 76.2 | 2 / 35 | 2668 |
| 8 | 3 | 59.4 | 70.8 | 8 / 35 | 2618 |
| 9 | 4 | 60.8 | 77.1 | 6 / 35 | 2536 |
| 10 | 4 | 60.8 | 76.2 | 4 / 35 | 2720 |
| 11 | 3 | 59.1 | 73.0 | 1 / 35 | 2583 |
| 12 | 3 | 60.4 | 76.2 | 3 / 35 | 2572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 4% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 10% |
| gh.nano.Grofvuil 0.2 | 29 | 66% |
| djdjdj.NanoSkunk10 1.0 | 15 | 73% |
| donjezza.Muncho 1.0 | 11 | 36% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 70% |
| baal.nano.N 1.42 | 7 | 100% |

Hadur died in 362 of 420 rounds, at a mean tick of 1244. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 135 | 37% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 92 | 25% | 101 |
| gh.nano.Grofvuil 0.2 | 48 | 13% | 67 |
| dmh.robocode.robot.RedDwarf 0.4 | 34 | 9% | 35 |
| djdjdj.NanoSkunk10 1.0 | 24 | 7% | 35 |
| baal.nano.N 1.42 | 12 | 3% | 22 |
| donjezza.Muncho 1.0 | 10 | 3% | 15 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 64.0 | 44 / 420 | 4.24 | 11.7% | 28351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 13.2% | 83 |
| stelo.SoRobotNanoMelee 1.2 | 2.9 | 12.2% | 81 |
| mld.DustBunny 3.8 | 3.3 | 12.0% | 54 |
| hadur117.nano.SanaroQTN 0.4 | 3.8 | 11.7% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.9 | 11.2% | 44 |
| wee.Gem 1.8.4 | 5.3 | 10.6% | 56 |
| sheldor.melee.nano.TestMelee 0.1 | 5.9 | 10.0% | 36 |
| tj.zombie1n 1.0.1 | 8.5 | 6.9% | 22 |
| cs.sheldor.Talon 1.1 | 8.6 | 6.4% | 0 |
| step.nanoPri 1.0 | 9.9 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.2 | 63.8 | 5 / 35 | 2638 |
| 2 | 1 | 58.9 | 73.3 | 6 / 35 | 2580 |
| 3 | 5 | 53.9 | 60.3 | 3 / 35 | 2279 |
| 4 | 2 | 58.8 | 73.0 | 6 / 35 | 2268 |
| 5 | 6 | 53.5 | 61.0 | 1 / 35 | 2296 |
| 6 | 5 | 54.3 | 62.2 | 2 / 35 | 2277 |
| 7 | 2 | 56.0 | 65.4 | 5 / 35 | 2341 |
| 8 | 3 | 57.2 | 69.5 | 3 / 35 | 2273 |
| 9 | 3 | 55.9 | 63.2 | 6 / 35 | 2398 |
| 10 | 6 | 52.1 | 56.2 | 1 / 35 | 2323 |
| 11 | 6 | 54.4 | 60.6 | 5 / 35 | 2408 |
| 12 | 5 | 53.2 | 60.0 | 1 / 35 | 2270 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 36 | 31% |
| d414.nano.Quantum 1.0.0 | 31 | 16% |
| wee.Gem 1.8.4 | 24 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 13% |
| mld.DustBunny 3.8 | 20 | 25% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 43% |
| tj.zombie1n 1.0.1 | 3 | 67% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 0% |

Hadur died in 376 of 420 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 81 | 22% | 82 |
| d414.nano.Quantum 1.0.0 | 66 | 18% | 72 |
| mld.DustBunny 3.8 | 63 | 17% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 15% | 64 |
| wee.Gem 1.8.4 | 40 | 11% | 53 |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 9% | 41 |
| cs.sheldor.Talon 1.1 | 16 | 4% | 18 |
| step.nanoPri 1.0 | 10 | 3% | 10 |
| tj.zombie1n 1.0.1 | 10 | 3% | 10 |

## Melee bench: F10

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 75.8 | 56 / 420 | 3.18 | 13.8% | 38425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.2% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.2% | 108 |
| mld.Infinity 2.2 | 3.2 | 14.0% | 105 |
| hadur117.nano.SanaroQTN 0.4 | 3.5 | 13.8% | 56 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 8.2% | 6 |
| conscience.Electron 1.3g | 6.7 | 7.6% | 2 |
| ayk.WallHugger 1.0 | 6.8 | 7.5% | 5 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.5% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 6.1% | 19 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.2 | 74.0 | 4 / 35 | 3301 |
| 2 | 4 | 60.1 | 74.6 | 3 / 35 | 2796 |
| 3 | 3 | 61.1 | 75.9 | 6 / 35 | 3358 |
| 4 | 4 | 61.3 | 76.8 | 4 / 35 | 3246 |
| 5 | 4 | 59.5 | 72.7 | 5 / 35 | 2867 |
| 6 | 4 | 59.5 | 73.0 | 3 / 35 | 2909 |
| 7 | 3 | 62.2 | 78.4 | 7 / 35 | 3504 |
| 8 | 3 | 61.1 | 78.4 | 5 / 35 | 3190 |
| 9 | 4 | 59.6 | 70.8 | 7 / 35 | 3171 |
| 10 | 3 | 61.7 | 77.1 | 5 / 35 | 3193 |
| 11 | 3 | 62.3 | 82.2 | 4 / 35 | 3056 |
| 12 | 3 | 61.3 | 75.6 | 3 / 35 | 3834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 11% |
| mld.Infinity 2.2 | 65 | 52% |
| d414.nano.Quantum 1.0.0 | 58 | 12% |
| donjezza.Jezza 1.0 | 9 | 0% |
| ayk.WallHugger 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| robar.nano.Assertive_Melee 0.2 | 2 | 0% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 365 of 420 rounds, at a mean tick of 1502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 132 | 36% | 168 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 97 | 27% | 132 |
| mld.Infinity 2.2 | 56 | 15% | 24 |
| robar.nano.Assertive_Melee 0.2 | 29 | 8% | 33 |
| conscience.Electron 1.3g | 17 | 5% | 19 |
| donjezza.Jezza 1.0 | 14 | 4% | 16 |
| exauge.GateKeeper 1.1.121g | 11 | 3% | 14 |
| ayk.WallHugger 1.0 | 8 | 2% | 14 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 75.2 | 79 / 420 | 3.23 | 13.9% | 35197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.8% | 143 |
| hadur117.nano.SanaroQTN 0.4 | 2.3 | 13.9% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.7% | 91 |
| oog.melee.Corsair 1.0 | 4.0 | 12.6% | 50 |
| mz.NanoGod 2.02 | 4.7 | 11.0% | 35 |
| DBall.NUKE 0.1 | 6.7 | 7.9% | 12 |
| awesomeness.Elite 1.0 | 7.5 | 7.3% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 7.2% | 2 |
| sample.Walls 1.0 | 8.2 | 6.5% | 6 |
| stelo.PianistNano 1.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 74.0 | 4 / 35 | 3050 |
| 2 | 2 | 61.4 | 74.9 | 9 / 35 | 3172 |
| 3 | 3 | 58.7 | 70.8 | 4 / 35 | 2947 |
| 4 | 3 | 60.8 | 75.2 | 5 / 35 | 3080 |
| 5 | 2 | 60.2 | 73.0 | 7 / 35 | 3010 |
| 6 | 3 | 58.9 | 72.4 | 5 / 35 | 2484 |
| 7 | 2 | 59.9 | 73.3 | 7 / 35 | 2811 |
| 8 | 1 | 62.0 | 80.0 | 8 / 35 | 2915 |
| 9 | 3 | 61.1 | 73.7 | 9 / 35 | 3088 |
| 10 | 2 | 61.2 | 78.7 | 6 / 35 | 2972 |
| 11 | 2 | 60.4 | 75.2 | 8 / 35 | 2716 |
| 12 | 2 | 62.6 | 81.0 | 7 / 35 | 2952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 70 | 16% |
| d414.nano.Quantum 1.0.0 | 65 | 8% |
| oog.melee.Corsair 1.0 | 42 | 62% |
| DBall.NUKE 0.1 | 24 | 83% |
| mz.NanoGod 2.02 | 18 | 33% |
| sample.Walls 1.0 | 8 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 342 of 420 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 124 | 36% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 84 | 25% | 97 |
| mz.NanoGod 2.02 | 51 | 15% | 60 |
| oog.melee.Corsair 1.0 | 37 | 11% | 62 |
| awesomeness.Elite 1.0 | 15 | 4% | 17 |
| DBall.NUKE 0.1 | 13 | 4% | 31 |
| zyx.nano.BacillusComma 1.0 | 8 | 2% | 10 |
| sample.Walls 1.0 | 7 | 2% | 7 |
| stelo.PianistNano 1.2 | 3 | 1% | 3 |

## Melee bench: F12

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 69.4 | 38 / 420 | 3.75 | 12.5% | 30144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.0% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.0% | 78 |
| hadur117.nano.SanaroQTN 0.4 | 2.9 | 12.5% | 38 |
| myl.nano.KomoriNinja 1.1 | 4.1 | 11.6% | 40 |
| sul.Lunar 1.1 | 4.2 | 11.4% | 57 |
| sam.Samspin 1.0 | 7.0 | 8.3% | 18 |
| maribo.melee.BMV 0.1 | 7.5 | 8.2% | 3 |
| sample.SpinBot 1.0 | 7.8 | 7.7% | 21 |
| spinnercat.Omen 1.0 | 7.8 | 7.9% | 16 |
| cvt.Firsty 1.0 | 10.0 | 4.3% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 73.7 | 5 / 35 | 2569 |
| 2 | 4 | 56.5 | 68.9 | 4 / 35 | 2183 |
| 3 | 3 | 56.4 | 67.9 | 2 / 35 | 2371 |
| 4 | 2 | 58.0 | 72.1 | 2 / 35 | 2419 |
| 5 | 5 | 54.3 | 61.0 | 2 / 35 | 2342 |
| 6 | 3 | 57.7 | 67.0 | 1 / 35 | 2981 |
| 7 | 1 | 61.8 | 77.1 | 9 / 35 | 3038 |
| 8 | 3 | 56.7 | 68.6 | 2 / 35 | 2287 |
| 9 | 4 | 56.7 | 67.3 | 4 / 35 | 2462 |
| 10 | 3 | 57.4 | 68.6 | 2 / 35 | 2667 |
| 11 | 2 | 57.8 | 72.1 | 3 / 35 | 2377 |
| 12 | 3 | 56.7 | 68.9 | 2 / 35 | 2448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 7% |
| d414.nano.Quantum 1.0.0 | 43 | 0% |
| sul.Lunar 1.1 | 41 | 29% |
| myl.nano.KomoriNinja 1.1 | 14 | 57% |
| sam.Samspin 1.0 | 13 | 46% |
| sample.SpinBot 1.0 | 9 | 33% |
| spinnercat.Omen 1.0 | 5 | 60% |
| cvt.Firsty 1.0 | 4 | 25% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 382 of 420 rounds, at a mean tick of 1192. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 111 | 29% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 21% | 85 |
| sul.Lunar 1.1 | 50 | 13% | 64 |
| myl.nano.KomoriNinja 1.1 | 45 | 12% | 55 |
| sample.SpinBot 1.0 | 26 | 7% | 28 |
| sam.Samspin 1.0 | 23 | 6% | 25 |
| spinnercat.Omen 1.0 | 22 | 6% | 23 |
| maribo.melee.BMV 0.1 | 19 | 5% | 22 |
| cvt.Firsty 1.0 | 7 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroQTN 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 12 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 68.0 | 32 / 420 | 3.88 | 11.9% | 28038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.5 | 14.8% | 118 |
| d414.nano.Quantum 1.0.0 | 1.8 | 14.8% | 145 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 68 |
| hadur117.nano.SanaroQTN 0.4 | 3.8 | 11.9% | 32 |
| mld.Wisdom 1.0 | 4.9 | 10.7% | 16 |
| zyx.nano.Ant 1.1 | 7.1 | 8.3% | 14 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.2% | 13 |
| amz.NanoClone 1.41 | 7.5 | 8.1% | 9 |
| arthord.NanoSatanMelee Beta | 8.1 | 7.7% | 4 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 69.2 | 0 / 35 | 2337 |
| 2 | 4 | 54.8 | 61.9 | 6 / 35 | 2317 |
| 3 | 4 | 55.8 | 66.3 | 1 / 35 | 2356 |
| 4 | 4 | 56.7 | 69.5 | 5 / 35 | 2144 |
| 5 | 4 | 55.3 | 64.1 | 1 / 35 | 2448 |
| 6 | 4 | 55.5 | 66.0 | 2 / 35 | 2163 |
| 7 | 4 | 55.7 | 63.8 | 3 / 35 | 2586 |
| 8 | 3 | 57.4 | 68.9 | 2 / 35 | 2494 |
| 9 | 4 | 58.8 | 73.7 | 3 / 35 | 2462 |
| 10 | 3 | 59.3 | 76.5 | 3 / 35 | 2379 |
| 11 | 4 | 55.9 | 67.0 | 3 / 35 | 2182 |
| 12 | 4 | 56.6 | 69.5 | 3 / 35 | 2170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 4% |
| d414.nano.Quantum 1.0.0 | 43 | 12% |
| davidalves.net.DuelistNanoMelee 1.01 | 42 | 7% |
| tvv.nano.Polaris 1.2 | 9 | 44% |
| mld.Wisdom 1.0 | 8 | 88% |
| zyx.nano.Ant 1.1 | 7 | 43% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 388 of 420 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 100 | 26% | 102 |
| d414.nano.Quantum 1.0.0 | 96 | 25% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 19% | 75 |
| mld.Wisdom 1.0 | 41 | 11% | 50 |
| zyx.nano.Ant 1.1 | 24 | 6% | 27 |
| amz.NanoClone 1.41 | 22 | 6% | 22 |
| arthord.NanoSatanMelee Beta | 17 | 4% | 25 |
| tvv.nano.Polaris 1.2 | 11 | 3% | 12 |
| arthord.MannyPacquiao Beta | 5 | 1% | 5 |

