# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 71.5 | 65 / 420 | 3.57 | 13.1% | 31679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.0% | 108 |
| hadur117.nano.SanaroDR 0.4 | 3.1 | 13.1% | 65 |
| bzdp.Pansy 2.1 | 3.6 | 12.5% | 46 |
| tvv.nano.Polaris 1.2 | 6.0 | 9.2% | 35 |
| arthord.NanoSatanMelee Beta | 6.3 | 9.3% | 9 |
| zyx.nano.Ant 1.1 | 6.8 | 8.6% | 6 |
| fm.claire 1.7 | 6.8 | 8.6% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.3% | 12 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 67.9 | 4 / 35 | 2800 |
| 2 | 4 | 55.5 | 62.9 | 4 / 35 | 2332 |
| 3 | 2 | 60.2 | 73.7 | 7 / 35 | 2861 |
| 4 | 2 | 60.7 | 76.5 | 6 / 35 | 2631 |
| 5 | 3 | 60.7 | 78.4 | 5 / 35 | 2593 |
| 6 | 4 | 58.5 | 69.2 | 6 / 35 | 2510 |
| 7 | 3 | 60.2 | 74.0 | 8 / 35 | 2660 |
| 8 | 4 | 57.4 | 68.6 | 3 / 35 | 2528 |
| 9 | 2 | 62.0 | 77.1 | 7 / 35 | 3240 |
| 10 | 3 | 59.7 | 74.6 | 3 / 35 | 2589 |
| 11 | 4 | 56.2 | 65.1 | 7 / 35 | 2207 |
| 12 | 3 | 58.8 | 69.8 | 5 / 35 | 2728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 15% |
| d414.nano.Quantum 1.0.0 | 53 | 15% |
| bzdp.Pansy 2.1 | 29 | 52% |
| tvv.nano.Polaris 1.2 | 19 | 16% |
| arthord.NanoSatanMelee Beta | 16 | 81% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| fm.claire 1.7 | 4 | 75% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 355 of 420 rounds, at a mean tick of 1276. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 102 | 29% | 111 |
| d414.nano.Quantum 1.0.0 | 98 | 28% | 110 |
| bzdp.Pansy 2.1 | 47 | 13% | 64 |
| tvv.nano.Polaris 1.2 | 34 | 10% | 37 |
| arthord.NanoSatanMelee Beta | 26 | 7% | 33 |
| fm.claire 1.7 | 23 | 6% | 27 |
| zyx.nano.Ant 1.1 | 16 | 5% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 2% | 17 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |

## Melee bench: F02

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 73.3 | 63 / 420 | 3.41 | 13.2% | 30068 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.3% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 13.6% | 74 |
| hadur117.nano.SanaroDR 0.4 | 2.6 | 13.2% | 63 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.1% | 40 |
| DBall.Anarchy 0.1 | 5.2 | 11.0% | 63 |
| stelo.SoJNanoMelee 1.1 | 5.9 | 9.8% | 67 |
| fm.mammillarias 1.3 | 6.5 | 9.7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.1% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.3% | 14 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 77.8 | 6 / 35 | 2742 |
| 2 | 3 | 58.6 | 71.1 | 7 / 35 | 2150 |
| 3 | 3 | 58.9 | 72.1 | 4 / 35 | 2577 |
| 4 | 3 | 58.0 | 70.2 | 1 / 35 | 2617 |
| 5 | 1 | 59.8 | 75.9 | 6 / 35 | 2332 |
| 6 | 3 | 60.3 | 76.8 | 9 / 35 | 2218 |
| 7 | 4 | 56.9 | 67.3 | 3 / 35 | 2417 |
| 8 | 3 | 58.0 | 68.6 | 5 / 35 | 2453 |
| 9 | 1 | 62.0 | 79.7 | 8 / 35 | 2921 |
| 10 | 2 | 59.8 | 73.3 | 6 / 35 | 2759 |
| 11 | 3 | 57.8 | 71.4 | 2 / 35 | 2390 |
| 12 | 3 | 59.5 | 74.9 | 6 / 35 | 2492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 9% |
| d414.nano.Quantum 1.0.0 | 44 | 16% |
| DBall.Anarchy 0.1 | 34 | 47% |
| simonton.nano.MeleeSeed 1.8 | 31 | 74% |
| stelo.SoJNanoMelee 1.1 | 29 | 34% |
| sample.MyFirstRobot 1.0 | 6 | 17% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 358 of 420 rounds, at a mean tick of 1372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 96 | 27% | 103 |
| d414.nano.Quantum 1.0.0 | 94 | 26% | 103 |
| stelo.SoJNanoMelee 1.1 | 47 | 13% | 52 |
| simonton.nano.MeleeSeed 1.8 | 33 | 9% | 54 |
| fm.mammillarias 1.3 | 32 | 9% | 33 |
| DBall.Anarchy 0.1 | 30 | 8% | 47 |
| sample.MyFirstRobot 1.0 | 13 | 4% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 11 | 3% | 11 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |

## Melee bench: F03

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.2 | 55 / 420 | 3.59 | 13.3% | 39355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.2% | 153 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.1 | 14.3% | 90 |
| hadur117.nano.SanaroDR 0.4 | 2.9 | 13.3% | 55 |
| ahf.NanoAndrew .4 | 4.1 | 12.0% | 42 |
| ratosh.Nobo 0.21 | 4.8 | 11.0% | 18 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.2% | 17 |
| stelo.PatternRobot 1.0 | 6.9 | 7.9% | 32 |
| sample.Crazy 1.0 | 8.5 | 5.9% | 5 |
| repositorio.NanoStep 1.0 | 8.5 | 5.8% | 8 |
| kurios.DOSexe .9a | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 73.3 | 8 / 35 | 3269 |
| 2 | 3 | 59.2 | 69.5 | 4 / 35 | 3277 |
| 3 | 3 | 60.1 | 71.7 | 2 / 35 | 3552 |
| 4 | 3 | 59.1 | 69.8 | 4 / 35 | 3233 |
| 5 | 3 | 59.8 | 69.5 | 7 / 35 | 3311 |
| 6 | 3 | 59.7 | 69.5 | 7 / 35 | 3442 |
| 7 | 3 | 59.1 | 72.4 | 3 / 35 | 3029 |
| 8 | 3 | 60.3 | 74.3 | 3 / 35 | 3291 |
| 9 | 3 | 59.2 | 71.4 | 2 / 35 | 3147 |
| 10 | 3 | 60.1 | 73.7 | 7 / 35 | 2988 |
| 11 | 3 | 58.6 | 66.7 | 1 / 35 | 3554 |
| 12 | 2 | 60.5 | 73.0 | 7 / 35 | 3262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 70 | 16% |
| ahf.NanoAndrew .4 | 19 | 47% |
| stelo.PatternRobot 1.0 | 16 | 38% |
| timmit.nano.TimDog 0.33 | 8 | 75% |
| ratosh.Nobo 0.21 | 7 | 57% |
| repositorio.NanoStep 1.0 | 5 | 60% |
| sample.Crazy 1.0 | 4 | 75% |

Hadur died in 366 of 420 rounds, at a mean tick of 1165. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 107 | 29% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 85 | 23% | 97 |
| ahf.NanoAndrew .4 | 55 | 15% | 59 |
| stelo.PatternRobot 1.0 | 41 | 11% | 46 |
| ratosh.Nobo 0.21 | 38 | 10% | 45 |
| timmit.nano.TimDog 0.33 | 20 | 5% | 26 |
| repositorio.NanoStep 1.0 | 10 | 3% | 14 |
| kurios.DOSexe .9a | 6 | 2% | 7 |
| sample.Crazy 1.0 | 4 | 1% | 10 |

## Melee bench: F04

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.5 | 62 / 420 | 2.93 | 14.8% | 49363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.9% | 175 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.9% | 123 |
| hadur117.nano.SanaroDR 0.4 | 3.0 | 14.8% | 62 |
| wompi.Quokka 1.6 | 3.7 | 14.2% | 45 |
| kurios.DOSexe .9b | 5.8 | 7.3% | 4 |
| maribo.FollowFire 1 | 6.1 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.1 | 6.4% | 2 |
| jangs.ns51 1.0 | 7.8 | 6.2% | 5 |
| sample.VelociRobot 1.0 | 8.3 | 5.9% | 3 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.9 | 79.7 | 4 / 35 | 3853 |
| 2 | 3 | 64.0 | 79.4 | 7 / 35 | 4354 |
| 3 | 3 | 63.4 | 80.3 | 5 / 35 | 4046 |
| 4 | 3 | 61.6 | 73.0 | 3 / 35 | 4205 |
| 5 | 2 | 64.1 | 81.3 | 5 / 35 | 4265 |
| 6 | 3 | 64.8 | 83.2 | 8 / 35 | 4230 |
| 7 | 4 | 62.2 | 77.8 | 3 / 35 | 3802 |
| 8 | 2 | 64.6 | 81.9 | 6 / 35 | 4286 |
| 9 | 4 | 61.8 | 73.0 | 6 / 35 | 4141 |
| 10 | 3 | 62.6 | 78.4 | 3 / 35 | 4008 |
| 11 | 3 | 64.0 | 81.9 | 10 / 35 | 3979 |
| 12 | 3 | 61.5 | 72.4 | 2 / 35 | 4194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 104 | 11% |
| d414.nano.Quantum 1.0.0 | 89 | 10% |
| wompi.Quokka 1.6 | 47 | 66% |
| sample.MyFirstJuniorRobot 1.0 | 6 | 83% |
| kurios.DOSexe .9b | 4 | 50% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |

Hadur died in 358 of 420 rounds, at a mean tick of 1718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 145 | 41% | 159 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 130 | 36% | 147 |
| wompi.Quokka 1.6 | 51 | 14% | 70 |
| maribo.FollowFire 1 | 13 | 4% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 2% | 13 |
| kurios.DOSexe .9b | 6 | 2% | 9 |
| jangs.ns51 1.0 | 4 | 1% | 5 |
| sample.VelociRobot 1.0 | 2 | 1% | 4 |

## Melee bench: F05

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 77.1 | 65 / 420 | 3.06 | 14.0% | 41363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 17.3% | 174 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.0% | 100 |
| hadur117.nano.SanaroDR 0.4 | 2.8 | 14.0% | 65 |
| ntc.Opposite 1.5 | 4.3 | 12.2% | 26 |
| js.PinBall 1.6 | 5.1 | 11.0% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.6 | 10.9% | 18 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.6% | 19 |
| PSW.Relentless 0.1 | 8.4 | 4.4% | 0 |
| sample.Fire 1.0 | 8.6 | 4.3% | 2 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 80.3 | 5 / 35 | 3471 |
| 2 | 3 | 63.3 | 78.7 | 6 / 35 | 3804 |
| 3 | 2 | 62.8 | 81.3 | 5 / 35 | 3579 |
| 4 | 3 | 60.8 | 72.1 | 4 / 35 | 3829 |
| 5 | 3 | 63.3 | 83.2 | 6 / 35 | 3287 |
| 6 | 3 | 61.6 | 79.0 | 4 / 35 | 2906 |
| 7 | 3 | 61.4 | 71.1 | 6 / 35 | 3510 |
| 8 | 3 | 61.0 | 73.7 | 7 / 35 | 3292 |
| 9 | 3 | 61.5 | 77.1 | 5 / 35 | 3147 |
| 10 | 3 | 61.2 | 74.9 | 2 / 35 | 3538 |
| 11 | 2 | 62.7 | 79.0 | 11 / 35 | 3376 |
| 12 | 3 | 61.5 | 74.9 | 4 / 35 | 3624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 86 | 12% |
| d414.nano.Quantum 1.0.0 | 81 | 10% |
| simonton.nano.WeekendObsession_Melee 1.0 | 19 | 74% |
| js.PinBall 1.6 | 17 | 76% |
| sp.Nanos.Ember 1.1 | 15 | 73% |
| ntc.Opposite 1.5 | 14 | 57% |
| sample.Fire 1.0 | 2 | 50% |

Hadur died in 356 of 420 rounds, at a mean tick of 1542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 136 | 38% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 106 | 30% | 118 |
| simonton.nano.WeekendObsession_Melee 1.0 | 38 | 11% | 45 |
| ntc.Opposite 1.5 | 38 | 11% | 43 |
| js.PinBall 1.6 | 23 | 6% | 36 |
| sp.Nanos.Ember 1.1 | 10 | 3% | 21 |
| sample.Fire 1.0 | 3 | 1% | 5 |
| PSW.Relentless 0.1 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 70.3 | 57 / 420 | 3.67 | 12.7% | 30948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.2 | 14.5% | 107 |
| d414.nano.Quantum 1.0.0 | 2.3 | 13.9% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.6 | 13.0% | 67 |
| hadur117.nano.SanaroDR 0.4 | 3.7 | 12.7% | 57 |
| radnor.DoctorBob 1.42 | 3.9 | 12.6% | 46 |
| myl.nano.Graviton 1.10 | 5.4 | 10.8% | 33 |
| squidM.TentalceMeleeNano 1.1 | 7.9 | 7.2% | 4 |
| stelo.MirrorNano 1.3 | 8.0 | 7.2% | 0 |
| ratosh.Wesco 1.4 | 8.1 | 7.3% | 7 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.8 | 67.0 | 7 / 35 | 2008 |
| 2 | 4 | 58.1 | 70.5 | 2 / 35 | 2418 |
| 3 | 1 | 62.8 | 77.5 | 13 / 35 | 2808 |
| 4 | 4 | 59.9 | 72.1 | 4 / 35 | 2535 |
| 5 | 6 | 56.3 | 61.0 | 3 / 35 | 2531 |
| 6 | 5 | 57.2 | 63.5 | 3 / 35 | 2436 |
| 7 | 3 | 61.7 | 74.9 | 5 / 35 | 2940 |
| 8 | 3 | 59.6 | 70.5 | 6 / 35 | 2864 |
| 9 | 5 | 59.2 | 70.5 | 3 / 35 | 2594 |
| 10 | 1 | 61.4 | 76.5 | 6 / 35 | 2782 |
| 11 | 4 | 57.4 | 65.7 | 1 / 35 | 2520 |
| 12 | 3 | 60.6 | 74.6 | 4 / 35 | 2512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 16% |
| kawigi.nano.Lib 1.0 | 45 | 13% |
| d414.nano.Quantum 1.0.0 | 41 | 27% |
| radnor.DoctorBob 1.42 | 20 | 75% |
| myl.nano.Graviton 1.10 | 15 | 73% |
| ratosh.Wesco 1.4 | 5 | 80% |
| squidM.TentalceMeleeNano 1.1 | 4 | 50% |

Hadur died in 363 of 420 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 105 | 29% | 109 |
| d414.nano.Quantum 1.0.0 | 77 | 21% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 66 | 18% | 77 |
| radnor.DoctorBob 1.42 | 47 | 13% | 63 |
| myl.nano.Graviton 1.10 | 37 | 10% | 47 |
| ratosh.Wesco 1.4 | 15 | 4% | 19 |
| squidM.TentalceMeleeNano 1.1 | 10 | 3% | 11 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |

## Melee bench: F07

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 68.7 | 76 / 420 | 3.82 | 12.7% | 33873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 14.2% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.2% | 85 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 13.1% | 51 |
| hadur117.nano.SanaroDR 0.4 | 3.8 | 12.7% | 76 |
| cb.nano.Insomnia 1.0 | 4.3 | 11.9% | 61 |
| oog.melee.CapuletDroid 1.1 | 6.1 | 10.9% | 29 |
| mz.Cork 0.1 | 6.4 | 10.7% | 23 |
| stuff.Vlad 0.1 | 8.4 | 5.2% | 0 |
| stelo.UntouchableNano 1.3 | 8.6 | 5.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 69.8 | 8 / 35 | 2812 |
| 2 | 4 | 59.6 | 68.9 | 7 / 35 | 2925 |
| 3 | 5 | 58.4 | 66.0 | 7 / 35 | 2885 |
| 4 | 5 | 57.8 | 66.3 | 5 / 35 | 2671 |
| 5 | 5 | 56.4 | 63.8 | 2 / 35 | 2735 |
| 6 | 3 | 59.4 | 69.8 | 7 / 35 | 2913 |
| 7 | 3 | 60.3 | 74.3 | 7 / 35 | 2720 |
| 8 | 3 | 59.1 | 68.9 | 5 / 35 | 3270 |
| 9 | 5 | 57.9 | 66.0 | 8 / 35 | 2520 |
| 10 | 2 | 60.4 | 72.7 | 9 / 35 | 2914 |
| 11 | 2 | 60.3 | 74.0 | 6 / 35 | 2848 |
| 12 | 5 | 56.8 | 63.5 | 5 / 35 | 2660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 15% |
| nz.jdc.nano.GridFu 1.0 | 40 | 78% |
| d414.nano.Quantum 1.0.0 | 34 | 15% |
| cb.nano.Insomnia 1.0 | 30 | 57% |
| oog.melee.CapuletDroid 1.1 | 15 | 53% |
| mz.Cork 0.1 | 10 | 80% |

Hadur died in 344 of 420 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 88 | 26% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 81 | 24% | 102 |
| nz.jdc.nano.GridFu 1.0 | 50 | 15% | 85 |
| cb.nano.Insomnia 1.0 | 49 | 14% | 35 |
| oog.melee.CapuletDroid 1.1 | 41 | 12% | 51 |
| mz.Cork 0.1 | 26 | 8% | 38 |
| stelo.UntouchableNano 1.3 | 4 | 1% | 5 |
| sample.TrackFire 1.0 | 3 | 1% | 3 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 76.1 | 61 / 420 | 3.15 | 13.7% | 35212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.5% | 154 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.6% | 101 |
| hadur117.nano.SanaroDR 0.4 | 2.9 | 13.7% | 61 |
| gh.nano.Grofvuil 0.2 | 3.9 | 12.9% | 49 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 10.1% | 30 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 10.3% | 8 |
| baal.nano.N 1.42 | 6.5 | 9.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.2% | 11 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 77.8 | 5 / 35 | 3111 |
| 2 | 3 | 60.6 | 74.3 | 4 / 35 | 2671 |
| 3 | 4 | 58.8 | 71.1 | 3 / 35 | 2571 |
| 4 | 4 | 58.8 | 72.4 | 2 / 35 | 2427 |
| 5 | 2 | 64.0 | 81.0 | 7 / 35 | 3552 |
| 6 | 3 | 60.0 | 74.9 | 1 / 35 | 2750 |
| 7 | 2 | 62.2 | 76.2 | 7 / 35 | 3076 |
| 8 | 2 | 63.0 | 78.7 | 10 / 35 | 3140 |
| 9 | 3 | 61.5 | 74.0 | 4 / 35 | 3180 |
| 10 | 3 | 62.3 | 75.9 | 6 / 35 | 3403 |
| 11 | 3 | 61.1 | 75.9 | 7 / 35 | 2598 |
| 12 | 3 | 62.4 | 81.3 | 5 / 35 | 2733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 85 | 18% |
| d414.nano.Quantum 1.0.0 | 84 | 13% |
| gh.nano.Grofvuil 0.2 | 29 | 55% |
| djdjdj.NanoSkunk10 1.0 | 17 | 65% |
| donjezza.Muncho 1.0 | 6 | 33% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 50% |
| baal.nano.N 1.42 | 3 | 100% |

Hadur died in 359 of 420 rounds, at a mean tick of 1299. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 127 | 35% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 103 | 29% | 119 |
| gh.nano.Grofvuil 0.2 | 46 | 13% | 62 |
| dmh.robocode.robot.RedDwarf 0.4 | 33 | 9% | 34 |
| djdjdj.NanoSkunk10 1.0 | 30 | 8% | 39 |
| baal.nano.N 1.42 | 9 | 3% | 13 |
| donjezza.Muncho 1.0 | 6 | 2% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 1% | 4 |

## Melee bench: F09

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 63.9 | 59 / 420 | 4.25 | 11.9% | 29394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.1 | 13.0% | 82 |
| stelo.SoRobotNanoMelee 1.2 | 2.2 | 13.0% | 103 |
| mld.DustBunny 3.8 | 3.3 | 11.9% | 50 |
| hadur117.nano.SanaroDR 0.4 | 3.3 | 11.9% | 59 |
| wee.Gem 1.8.4 | 5.3 | 10.7% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5.3 | 10.7% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 6.6 | 9.8% | 23 |
| cs.sheldor.Talon 1.1 | 8.7 | 6.7% | 2 |
| tj.zombie1n 1.0.1 | 8.8 | 6.6% | 18 |
| step.nanoPri 1.0 | 9.6 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.4 | 62.5 | 6 / 35 | 2541 |
| 2 | 3 | 54.6 | 62.2 | 3 / 35 | 2526 |
| 3 | 1 | 59.5 | 72.7 | 7 / 35 | 2507 |
| 4 | 3 | 57.4 | 68.6 | 7 / 35 | 2332 |
| 5 | 3 | 57.7 | 68.3 | 4 / 35 | 2687 |
| 6 | 4 | 53.1 | 58.7 | 4 / 35 | 2157 |
| 7 | 3 | 56.0 | 63.5 | 4 / 35 | 2654 |
| 8 | 6 | 51.1 | 55.2 | 3 / 35 | 2047 |
| 9 | 3 | 56.1 | 61.9 | 8 / 35 | 2393 |
| 10 | 2 | 57.5 | 67.3 | 5 / 35 | 2631 |
| 11 | 5 | 54.2 | 60.3 | 2 / 35 | 2510 |
| 12 | 2 | 56.3 | 65.4 | 6 / 35 | 2409 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 45 | 36% |
| wee.Gem 1.8.4 | 27 | 74% |
| d414.nano.Quantum 1.0.0 | 24 | 21% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 22% |
| mld.DustBunny 3.8 | 20 | 10% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 100% |
| tj.zombie1n 1.0.1 | 5 | 80% |

Hadur died in 361 of 420 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 85 | 24% | 90 |
| d414.nano.Quantum 1.0.0 | 69 | 19% | 79 |
| mld.DustBunny 3.8 | 57 | 16% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 14% | 55 |
| wee.Gem 1.8.4 | 39 | 11% | 63 |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 8% | 36 |
| cs.sheldor.Talon 1.1 | 15 | 4% | 15 |
| tj.zombie1n 1.0.1 | 11 | 3% | 10 |
| step.nanoPri 1.0 | 7 | 2% | 7 |

## Melee bench: F10

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 77.7 | 84 / 420 | 3.01 | 14.5% | 40903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.3% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 14.6% | 95 |
| hadur117.nano.SanaroDR 0.4 | 2.9 | 14.5% | 84 |
| mld.Infinity 2.2 | 3.0 | 14.2% | 95 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 8.2% | 7 |
| conscience.Electron 1.3g | 6.7 | 7.6% | 1 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.4% | 2 |
| ayk.WallHugger 1.0 | 7.1 | 7.3% | 1 |
| donjezza.Jezza 1.0 | 8.5 | 6.2% | 5 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 76.5 | 5 / 35 | 3658 |
| 2 | 4 | 61.2 | 74.9 | 7 / 35 | 3142 |
| 3 | 2 | 64.2 | 83.8 | 9 / 35 | 3633 |
| 4 | 4 | 60.2 | 73.0 | 6 / 35 | 3111 |
| 5 | 3 | 62.8 | 77.1 | 12 / 35 | 3528 |
| 6 | 2 | 63.6 | 81.9 | 7 / 35 | 3632 |
| 7 | 2 | 62.2 | 77.1 | 6 / 35 | 3673 |
| 8 | 3 | 61.1 | 76.8 | 4 / 35 | 3469 |
| 9 | 2 | 62.8 | 80.3 | 8 / 35 | 3277 |
| 10 | 3 | 62.0 | 78.4 | 6 / 35 | 3194 |
| 11 | 3 | 62.5 | 79.4 | 6 / 35 | 3431 |
| 12 | 4 | 60.3 | 72.7 | 8 / 35 | 3155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 98 | 60% |
| d414.nano.Quantum 1.0.0 | 69 | 10% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 66 | 3% |
| donjezza.Jezza 1.0 | 8 | 63% |
| ayk.WallHugger 1.0 | 5 | 100% |
| exauge.GateKeeper 1.1.121g | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 336 of 420 rounds, at a mean tick of 1594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 117 | 35% | 160 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 93 | 28% | 140 |
| mld.Infinity 2.2 | 66 | 20% | 30 |
| robar.nano.Assertive_Melee 0.2 | 26 | 8% | 31 |
| conscience.Electron 1.3g | 12 | 4% | 15 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 15 |
| ayk.WallHugger 1.0 | 8 | 2% | 13 |
| donjezza.Jezza 1.0 | 4 | 1% | 14 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 72.2 | 67 / 420 | 3.50 | 13.4% | 35454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 15.6% | 125 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.2% | 103 |
| hadur117.nano.SanaroDR 0.4 | 3.2 | 13.4% | 67 |
| oog.melee.Corsair 1.0 | 3.6 | 12.6% | 53 |
| mz.NanoGod 2.02 | 4.6 | 11.2% | 44 |
| DBall.NUKE 0.1 | 7.0 | 7.7% | 14 |
| awesomeness.Elite 1.0 | 7.0 | 7.5% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.4% | 4 |
| sample.Walls 1.0 | 8.8 | 6.0% | 5 |
| stelo.PianistNano 1.2 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 68.9 | 4 / 35 | 3027 |
| 2 | 4 | 58.7 | 69.2 | 5 / 35 | 2941 |
| 3 | 3 | 60.6 | 75.6 | 5 / 35 | 2980 |
| 4 | 4 | 58.8 | 70.5 | 4 / 35 | 2762 |
| 5 | 3 | 59.8 | 74.9 | 4 / 35 | 2884 |
| 6 | 2 | 63.0 | 82.2 | 6 / 35 | 3222 |
| 7 | 3 | 59.7 | 68.6 | 7 / 35 | 3130 |
| 8 | 3 | 61.4 | 74.0 | 8 / 35 | 3122 |
| 9 | 3 | 57.1 | 64.8 | 4 / 35 | 2837 |
| 10 | 3 | 60.3 | 74.9 | 7 / 35 | 2646 |
| 11 | 4 | 58.9 | 69.5 | 8 / 35 | 2701 |
| 12 | 2 | 59.9 | 73.3 | 5 / 35 | 3202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 73 | 18% |
| d414.nano.Quantum 1.0.0 | 55 | 18% |
| oog.melee.Corsair 1.0 | 28 | 68% |
| mz.NanoGod 2.02 | 18 | 39% |
| DBall.NUKE 0.1 | 18 | 67% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 353 of 420 rounds, at a mean tick of 1263. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 110 | 31% | 122 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 101 | 29% | 114 |
| mz.NanoGod 2.02 | 57 | 16% | 62 |
| oog.melee.Corsair 1.0 | 33 | 9% | 55 |
| zyx.nano.BacillusComma 1.0 | 17 | 5% | 18 |
| DBall.NUKE 0.1 | 14 | 4% | 28 |
| awesomeness.Elite 1.0 | 10 | 3% | 10 |
| sample.Walls 1.0 | 6 | 2% | 6 |
| stelo.PianistNano 1.2 | 5 | 1% | 5 |

## Melee bench: F12

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 68.5 | 54 / 420 | 3.84 | 12.6% | 31756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 13.3% | 85 |
| hadur117.nano.SanaroDR 0.4 | 3.4 | 12.6% | 54 |
| sul.Lunar 1.1 | 4.2 | 11.5% | 59 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 11.5% | 35 |
| maribo.melee.BMV 0.1 | 7.2 | 8.0% | 1 |
| spinnercat.Omen 1.0 | 7.3 | 7.7% | 19 |
| sam.Samspin 1.0 | 7.3 | 8.0% | 17 |
| sample.SpinBot 1.0 | 8.3 | 7.5% | 14 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 69.2 | 2 / 35 | 2740 |
| 2 | 4 | 57.4 | 68.6 | 3 / 35 | 2574 |
| 3 | 4 | 57.1 | 67.6 | 6 / 35 | 2354 |
| 4 | 5 | 53.7 | 58.7 | 1 / 35 | 2551 |
| 5 | 3 | 59.4 | 70.8 | 7 / 35 | 2813 |
| 6 | 3 | 57.5 | 68.9 | 5 / 35 | 2533 |
| 7 | 4 | 57.2 | 63.8 | 7 / 35 | 2890 |
| 8 | 2 | 62.4 | 80.6 | 8 / 35 | 2938 |
| 9 | 2 | 57.9 | 67.9 | 6 / 35 | 2741 |
| 10 | 3 | 59.9 | 75.6 | 5 / 35 | 2566 |
| 11 | 4 | 55.6 | 65.7 | 2 / 35 | 2443 |
| 12 | 4 | 55.7 | 64.1 | 2 / 35 | 2613 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 12% |
| sul.Lunar 1.1 | 36 | 14% |
| myl.nano.KomoriNinja 1.1 | 20 | 65% |
| sam.Samspin 1.0 | 7 | 43% |
| sample.SpinBot 1.0 | 6 | 83% |
| spinnercat.Omen 1.0 | 4 | 75% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 366 of 420 rounds, at a mean tick of 1262. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 28% | 117 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 94 | 26% | 103 |
| sul.Lunar 1.1 | 53 | 14% | 60 |
| myl.nano.KomoriNinja 1.1 | 39 | 11% | 51 |
| sam.Samspin 1.0 | 23 | 6% | 25 |
| maribo.melee.BMV 0.1 | 19 | 5% | 20 |
| sample.SpinBot 1.0 | 17 | 5% | 19 |
| spinnercat.Omen 1.0 | 12 | 3% | 17 |
| cvt.Firsty 1.0 | 7 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroDR 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 69.6 | 39 / 420 | 3.73 | 12.2% | 28619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.7 | 14.2% | 108 |
| d414.nano.Quantum 1.0.0 | 1.7 | 14.2% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 12.9% | 86 |
| hadur117.nano.SanaroDR 0.4 | 4.0 | 12.2% | 39 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 19 |
| amz.NanoClone 1.41 | 7.0 | 8.8% | 12 |
| tvv.nano.Polaris 1.2 | 7.1 | 8.4% | 19 |
| zyx.nano.Ant 1.1 | 7.3 | 8.3% | 12 |
| arthord.NanoSatanMelee Beta | 8.4 | 7.5% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 68.9 | 2 / 35 | 2337 |
| 2 | 4 | 57.7 | 74.9 | 1 / 35 | 2150 |
| 3 | 4 | 58.6 | 72.4 | 3 / 35 | 2500 |
| 4 | 4 | 57.2 | 68.3 | 2 / 35 | 2550 |
| 5 | 5 | 56.3 | 68.9 | 2 / 35 | 2367 |
| 6 | 4 | 59.6 | 74.3 | 8 / 35 | 2339 |
| 7 | 4 | 56.1 | 68.6 | 2 / 35 | 2283 |
| 8 | 3 | 58.3 | 72.7 | 4 / 35 | 2500 |
| 9 | 4 | 57.4 | 70.2 | 4 / 35 | 2324 |
| 10 | 4 | 55.7 | 68.9 | 3 / 35 | 2147 |
| 11 | 4 | 56.3 | 65.1 | 4 / 35 | 2616 |
| 12 | 4 | 55.2 | 62.5 | 4 / 35 | 2506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 11% |
| davidalves.net.DuelistNanoMelee 1.01 | 47 | 4% |
| d414.nano.Quantum 1.0.0 | 44 | 14% |
| mld.Wisdom 1.0 | 12 | 92% |
| tvv.nano.Polaris 1.2 | 9 | 33% |
| zyx.nano.Ant 1.1 | 7 | 43% |
| amz.NanoClone 1.41 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 382 of 420 rounds, at a mean tick of 1327. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 93 | 24% | 101 |
| davidalves.net.DuelistNanoMelee 1.01 | 90 | 24% | 92 |
| d414.nano.Quantum 1.0.0 | 81 | 21% | 89 |
| mld.Wisdom 1.0 | 31 | 8% | 43 |
| arthord.NanoSatanMelee Beta | 23 | 6% | 26 |
| zyx.nano.Ant 1.1 | 23 | 6% | 25 |
| amz.NanoClone 1.41 | 22 | 6% | 24 |
| tvv.nano.Polaris 1.2 | 17 | 4% | 18 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

