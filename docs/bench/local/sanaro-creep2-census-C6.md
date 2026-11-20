# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 73.4 | 37 / 420 | 3.40 | 12.9% | 28926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.4% | 170 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.1 | 14.0% | 98 |
| hadur117.nano.SanaroC6 0.4 | 3.2 | 12.9% | 37 |
| bzdp.Pansy 2.1 | 3.6 | 12.5% | 51 |
| tvv.nano.Polaris 1.2 | 5.8 | 9.3% | 34 |
| arthord.NanoSatanMelee Beta | 6.2 | 9.2% | 6 |
| zyx.nano.Ant 1.1 | 6.3 | 9.1% | 11 |
| fm.claire 1.7 | 7.8 | 7.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.9% | 8 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 75.2 | 2 / 35 | 2346 |
| 2 | 3 | 60.3 | 77.5 | 5 / 35 | 2267 |
| 3 | 4 | 58.9 | 70.8 | 6 / 35 | 2429 |
| 4 | 2 | 60.5 | 76.2 | 3 / 35 | 2698 |
| 5 | 4 | 55.7 | 67.3 | 2 / 35 | 2114 |
| 6 | 4 | 57.7 | 71.7 | 2 / 35 | 2104 |
| 7 | 4 | 57.4 | 68.9 | 1 / 35 | 2623 |
| 8 | 4 | 58.9 | 74.3 | 3 / 35 | 2306 |
| 9 | 3 | 59.7 | 75.2 | 1 / 35 | 2691 |
| 10 | 2 | 59.2 | 73.7 | 3 / 35 | 2680 |
| 11 | 3 | 58.4 | 72.7 | 3 / 35 | 2202 |
| 12 | 2 | 60.5 | 76.8 | 6 / 35 | 2466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 4% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 7% |
| bzdp.Pansy 2.1 | 33 | 33% |
| tvv.nano.Polaris 1.2 | 16 | 25% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 78% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| zyx.nano.Ant 1.1 | 5 | 40% |
| fm.claire 1.7 | 1 | 0% |

Hadur died in 384 of 420 rounds, at a mean tick of 1286. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 128 | 33% | 132 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 97 | 25% | 100 |
| bzdp.Pansy 2.1 | 57 | 15% | 69 |
| arthord.NanoSatanMelee Beta | 29 | 8% | 34 |
| zyx.nano.Ant 1.1 | 23 | 6% | 24 |
| fm.claire 1.7 | 21 | 5% | 23 |
| tvv.nano.Polaris 1.2 | 19 | 5% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 1% | 12 |
| arthord.MannyPacquiao Beta | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 74.1 | 66 / 420 | 3.33 | 12.8% | 24949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 14.9% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 12.9% | 65 |
| hadur117.nano.SanaroC6 0.4 | 3.0 | 12.8% | 66 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 12.3% | 49 |
| fm.mammillarias 1.3 | 5.4 | 10.4% | 12 |
| DBall.Anarchy 0.1 | 5.5 | 10.5% | 45 |
| stelo.SoJNanoMelee 1.1 | 7.1 | 9.0% | 50 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.2% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.5% | 16 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 68.3 | 5 / 35 | 2019 |
| 2 | 3 | 59.7 | 79.4 | 5 / 35 | 2025 |
| 3 | 2 | 60.6 | 79.7 | 8 / 35 | 2135 |
| 4 | 2 | 58.2 | 72.1 | 7 / 35 | 2135 |
| 5 | 4 | 56.8 | 68.9 | 3 / 35 | 2269 |
| 6 | 4 | 58.6 | 74.6 | 7 / 35 | 2126 |
| 7 | 3 | 57.3 | 72.7 | 4 / 35 | 1835 |
| 8 | 3 | 58.3 | 72.1 | 9 / 35 | 2095 |
| 9 | 2 | 58.3 | 74.6 | 5 / 35 | 2140 |
| 10 | 3 | 58.4 | 77.8 | 3 / 35 | 1954 |
| 11 | 3 | 57.6 | 73.3 | 3 / 35 | 2029 |
| 12 | 3 | 59.7 | 76.2 | 7 / 35 | 2187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 15% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 2% |
| DBall.Anarchy 0.1 | 37 | 57% |
| stelo.SoJNanoMelee 1.1 | 26 | 27% |
| simonton.nano.MeleeSeed 1.8 | 22 | 68% |
| fm.mammillarias 1.3 | 14 | 79% |
| sample.MyFirstRobot 1.0 | 9 | 22% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 354 of 420 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 108 | 31% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 22% | 81 |
| stelo.SoJNanoMelee 1.1 | 48 | 14% | 52 |
| fm.mammillarias 1.3 | 41 | 12% | 42 |
| simonton.nano.MeleeSeed 1.8 | 39 | 11% | 54 |
| DBall.Anarchy 0.1 | 23 | 6% | 47 |
| sample.MyFirstRobot 1.0 | 11 | 3% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 1% | 5 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 5 |

## Melee bench: F03

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 73.7 | 49 / 420 | 3.37 | 13.3% | 35631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.0% | 145 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.7% | 84 |
| hadur117.nano.SanaroC6 0.4 | 2.8 | 13.3% | 49 |
| ahf.NanoAndrew .4 | 4.2 | 11.7% | 55 |
| ratosh.Nobo 0.21 | 4.3 | 11.3% | 19 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.4% | 19 |
| stelo.PatternRobot 1.0 | 7.0 | 8.1% | 42 |
| repositorio.NanoStep 1.0 | 8.3 | 6.1% | 5 |
| sample.Crazy 1.0 | 8.7 | 5.7% | 4 |
| kurios.DOSexe .9a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 75.2 | 1 / 35 | 3317 |
| 2 | 3 | 60.2 | 76.5 | 2 / 35 | 2992 |
| 3 | 3 | 59.6 | 75.6 | 5 / 35 | 2698 |
| 4 | 3 | 59.9 | 74.0 | 5 / 35 | 2948 |
| 5 | 2 | 59.1 | 71.7 | 5 / 35 | 2841 |
| 6 | 3 | 61.3 | 76.8 | 5 / 35 | 3180 |
| 7 | 2 | 57.0 | 66.7 | 4 / 35 | 2705 |
| 8 | 4 | 58.6 | 70.2 | 3 / 35 | 2968 |
| 9 | 3 | 60.0 | 74.9 | 6 / 35 | 2975 |
| 10 | 2 | 61.1 | 77.1 | 4 / 35 | 3461 |
| 11 | 3 | 59.3 | 71.1 | 5 / 35 | 3095 |
| 12 | 2 | 58.0 | 74.0 | 4 / 35 | 2451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 66 | 9% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 62 | 10% |
| ahf.NanoAndrew .4 | 25 | 44% |
| stelo.PatternRobot 1.0 | 20 | 25% |
| timmit.nano.TimDog 0.33 | 14 | 79% |
| ratosh.Nobo 0.21 | 12 | 42% |
| repositorio.NanoStep 1.0 | 4 | 75% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 371 of 420 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 118 | 32% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 83 | 22% | 91 |
| ahf.NanoAndrew .4 | 59 | 16% | 72 |
| stelo.PatternRobot 1.0 | 46 | 12% | 51 |
| ratosh.Nobo 0.21 | 36 | 10% | 41 |
| timmit.nano.TimDog 0.33 | 18 | 5% | 25 |
| sample.Crazy 1.0 | 4 | 1% | 7 |
| repositorio.NanoStep 1.0 | 4 | 1% | 7 |
| kurios.DOSexe .9a | 3 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 77.2 | 35 / 420 | 3.05 | 13.8% | 42306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 18.5% | 193 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 16.4% | 120 |
| wompi.Quokka 1.6 | 3.3 | 14.3% | 50 |
| hadur117.nano.SanaroC6 0.4 | 3.7 | 13.8% | 35 |
| kurios.DOSexe .9b | 5.9 | 7.3% | 3 |
| maribo.FollowFire 1 | 6.1 | 7.1% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 7.3 | 6.6% | 11 |
| sample.VelociRobot 1.0 | 8.7 | 5.6% | 1 |
| drd.Dreadknoght 0.9 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 82.2 | 2 / 35 | 3666 |
| 2 | 4 | 61.0 | 78.1 | 2 / 35 | 3247 |
| 3 | 4 | 61.8 | 79.0 | 4 / 35 | 3271 |
| 4 | 4 | 61.4 | 74.9 | 1 / 35 | 3830 |
| 5 | 3 | 61.3 | 75.2 | 1 / 35 | 3644 |
| 6 | 3 | 61.9 | 79.0 | 3 / 35 | 3302 |
| 7 | 4 | 62.1 | 79.0 | 3 / 35 | 3513 |
| 8 | 4 | 60.5 | 73.0 | 4 / 35 | 3592 |
| 9 | 3 | 62.9 | 81.3 | 4 / 35 | 3610 |
| 10 | 4 | 61.7 | 77.8 | 2 / 35 | 3601 |
| 11 | 4 | 60.6 | 72.4 | 3 / 35 | 3671 |
| 12 | 4 | 61.0 | 74.3 | 6 / 35 | 3359 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 92 | 4% |
| d414.nano.Quantum 1.0.0 | 74 | 8% |
| wompi.Quokka 1.6 | 35 | 51% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 29% |
| jangs.ns51 1.0 | 5 | 20% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 386 of 420 rounds, at a mean tick of 1630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 159 | 41% | 165 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 128 | 33% | 135 |
| wompi.Quokka 1.6 | 61 | 16% | 73 |
| sample.MyFirstJuniorRobot 1.0 | 13 | 3% | 14 |
| jangs.ns51 1.0 | 9 | 2% | 10 |
| kurios.DOSexe .9b | 6 | 2% | 11 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| sample.VelociRobot 1.0 | 2 | 1% | 4 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 75.2 | 46 / 420 | 3.23 | 13.3% | 37510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.8% | 193 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 15.0% | 103 |
| hadur117.nano.SanaroC6 0.4 | 3.0 | 13.3% | 46 |
| ntc.Opposite 1.5 | 3.9 | 12.4% | 26 |
| js.PinBall 1.6 | 5.1 | 11.0% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 10.7% | 17 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.7% | 10 |
| PSW.Relentless 0.1 | 8.5 | 4.4% | 0 |
| sample.Fire 1.0 | 8.5 | 4.7% | 6 |
| sample.Target 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 73.0 | 0 / 35 | 2950 |
| 2 | 2 | 62.2 | 78.7 | 7 / 35 | 3117 |
| 3 | 3 | 61.1 | 76.5 | 4 / 35 | 3081 |
| 4 | 3 | 62.1 | 79.4 | 4 / 35 | 3176 |
| 5 | 4 | 58.9 | 72.7 | 2 / 35 | 2824 |
| 6 | 3 | 60.0 | 72.1 | 1 / 35 | 3457 |
| 7 | 2 | 61.5 | 78.7 | 8 / 35 | 2893 |
| 8 | 3 | 60.8 | 75.9 | 6 / 35 | 3077 |
| 9 | 3 | 60.9 | 77.5 | 4 / 35 | 3074 |
| 10 | 3 | 62.2 | 78.7 | 6 / 35 | 3246 |
| 11 | 4 | 59.4 | 68.6 | 3 / 35 | 3548 |
| 12 | 3 | 58.8 | 70.8 | 1 / 35 | 3067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 10% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 4% |
| ntc.Opposite 1.5 | 17 | 71% |
| sp.Nanos.Ember 1.1 | 15 | 73% |
| js.PinBall 1.6 | 11 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 50% |
| sample.Fire 1.0 | 6 | 33% |

Hadur died in 374 of 420 rounds, at a mean tick of 1514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 143 | 38% | 153 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 107 | 29% | 112 |
| ntc.Opposite 1.5 | 55 | 15% | 64 |
| simonton.nano.WeekendObsession_Melee 1.0 | 28 | 7% | 31 |
| js.PinBall 1.6 | 22 | 6% | 29 |
| sp.Nanos.Ember 1.1 | 12 | 3% | 22 |
| sample.Fire 1.0 | 5 | 1% | 7 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 70.8 | 46 / 420 | 3.63 | 12.4% | 26951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.4% | 106 |
| kawigi.nano.Lib 1.0 | 2.6 | 13.7% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 66 |
| radnor.DoctorBob 1.42 | 3.8 | 12.7% | 59 |
| hadur117.nano.SanaroC6 0.4 | 4.1 | 12.4% | 46 |
| myl.nano.Graviton 1.10 | 5.6 | 10.7% | 39 |
| stelo.MirrorNano 1.3 | 7.6 | 7.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.4% | 2 |
| ratosh.Wesco 1.4 | 8.3 | 7.2% | 10 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 75.2 | 2 / 35 | 2425 |
| 2 | 2 | 60.3 | 73.7 | 5 / 35 | 2781 |
| 3 | 4 | 58.9 | 71.1 | 5 / 35 | 2210 |
| 4 | 4 | 58.9 | 72.4 | 3 / 35 | 2298 |
| 5 | 4 | 58.1 | 71.4 | 3 / 35 | 2054 |
| 6 | 5 | 56.2 | 64.4 | 4 / 35 | 1976 |
| 7 | 5 | 56.7 | 66.0 | 1 / 35 | 2243 |
| 8 | 5 | 57.2 | 67.6 | 5 / 35 | 1901 |
| 9 | 4 | 57.7 | 67.6 | 3 / 35 | 2428 |
| 10 | 3 | 60.9 | 78.1 | 6 / 35 | 2180 |
| 11 | 6 | 57.2 | 68.6 | 3 / 35 | 2181 |
| 12 | 4 | 60.1 | 73.7 | 6 / 35 | 2274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 11% |
| kawigi.nano.Lib 1.0 | 39 | 13% |
| d414.nano.Quantum 1.0.0 | 34 | 9% |
| radnor.DoctorBob 1.42 | 27 | 41% |
| myl.nano.Graviton 1.10 | 17 | 65% |
| ratosh.Wesco 1.4 | 6 | 83% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| stelo.MirrorNano 1.3 | 3 | 100% |

Hadur died in 374 of 420 rounds, at a mean tick of 1068. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 22% | 90 |
| kawigi.nano.Lib 1.0 | 82 | 22% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 68 | 18% | 74 |
| radnor.DoctorBob 1.42 | 57 | 15% | 66 |
| myl.nano.Graviton 1.10 | 46 | 12% | 57 |
| ratosh.Wesco 1.4 | 15 | 4% | 19 |
| squidM.TentalceMeleeNano 1.1 | 14 | 4% | 16 |
| stelo.MirrorNano 1.3 | 10 | 3% | 12 |

## Melee bench: F07

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 71.2 | 70 / 420 | 3.59 | 12.6% | 29545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.6% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 83 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.8% | 58 |
| hadur117.nano.SanaroC6 0.4 | 3.6 | 12.6% | 70 |
| cb.nano.Insomnia 1.0 | 4.6 | 12.0% | 54 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 10.8% | 29 |
| mz.Cork 0.1 | 6.3 | 10.4% | 12 |
| stelo.UntouchableNano 1.3 | 8.2 | 5.9% | 4 |
| stuff.Vlad 0.1 | 8.8 | 4.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 67.3 | 4 / 35 | 2356 |
| 2 | 4 | 57.4 | 67.9 | 5 / 35 | 2619 |
| 3 | 2 | 60.7 | 75.6 | 10 / 35 | 2863 |
| 4 | 5 | 57.3 | 66.7 | 4 / 35 | 2675 |
| 5 | 3 | 59.1 | 72.4 | 6 / 35 | 2382 |
| 6 | 4 | 57.6 | 69.5 | 5 / 35 | 2316 |
| 7 | 5 | 56.8 | 68.3 | 4 / 35 | 2270 |
| 8 | 3 | 59.9 | 75.6 | 6 / 35 | 2367 |
| 9 | 4 | 57.0 | 68.6 | 5 / 35 | 2234 |
| 10 | 3 | 59.7 | 74.6 | 6 / 35 | 2575 |
| 11 | 2 | 59.7 | 74.0 | 9 / 35 | 2434 |
| 12 | 4 | 59.8 | 74.6 | 6 / 35 | 2454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 41 | 2% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 5% |
| cb.nano.Insomnia 1.0 | 34 | 71% |
| nz.jdc.nano.GridFu 1.0 | 31 | 45% |
| mz.Cork 0.1 | 18 | 94% |
| oog.melee.CapuletDroid 1.1 | 14 | 71% |
| stelo.UntouchableNano 1.3 | 3 | 67% |

Hadur died in 350 of 420 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 109 | 31% | 118 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 20% | 86 |
| nz.jdc.nano.GridFu 1.0 | 52 | 15% | 78 |
| cb.nano.Insomnia 1.0 | 48 | 14% | 35 |
| oog.melee.CapuletDroid 1.1 | 36 | 10% | 50 |
| mz.Cork 0.1 | 17 | 5% | 35 |
| stelo.UntouchableNano 1.3 | 11 | 3% | 12 |
| sample.TrackFire 1.0 | 5 | 1% | 5 |
| stuff.Vlad 0.1 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 77.9 | 56 / 420 | 2.99 | 13.6% | 31413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 16.0% | 153 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 15.0% | 105 |
| hadur117.nano.SanaroC6 0.4 | 2.9 | 13.6% | 56 |
| gh.nano.Grofvuil 0.2 | 3.8 | 12.6% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 10.7% | 4 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 10.4% | 41 |
| baal.nano.N 1.42 | 6.3 | 9.4% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.4 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 8.6 | 5.4% | 9 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 78.7 | 4 / 35 | 2518 |
| 2 | 3 | 61.0 | 79.0 | 4 / 35 | 2494 |
| 3 | 3 | 59.8 | 74.9 | 2 / 35 | 2616 |
| 4 | 3 | 60.7 | 77.1 | 5 / 35 | 2443 |
| 5 | 2 | 61.3 | 77.5 | 5 / 35 | 2937 |
| 6 | 4 | 60.0 | 75.2 | 4 / 35 | 2387 |
| 7 | 3 | 60.7 | 76.2 | 5 / 35 | 2561 |
| 8 | 2 | 61.6 | 78.7 | 7 / 35 | 2707 |
| 9 | 2 | 63.9 | 83.5 | 9 / 35 | 3000 |
| 10 | 3 | 61.5 | 78.7 | 6 / 35 | 2497 |
| 11 | 4 | 60.5 | 75.9 | 2 / 35 | 2653 |
| 12 | 3 | 61.7 | 79.7 | 3 / 35 | 2600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 82 | 7% |
| d414.nano.Quantum 1.0.0 | 73 | 7% |
| gh.nano.Grofvuil 0.2 | 44 | 50% |
| djdjdj.NanoSkunk10 1.0 | 22 | 50% |
| baal.nano.N 1.42 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| donjezza.Muncho 1.0 | 4 | 50% |

Hadur died in 364 of 420 rounds, at a mean tick of 1473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 136 | 37% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 102 | 28% | 112 |
| gh.nano.Grofvuil 0.2 | 44 | 12% | 67 |
| djdjdj.NanoSkunk10 1.0 | 28 | 8% | 40 |
| dmh.robocode.robot.RedDwarf 0.4 | 28 | 8% | 30 |
| baal.nano.N 1.42 | 18 | 5% | 22 |
| donjezza.Muncho 1.0 | 6 | 2% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 67.4 | 52 / 420 | 3.94 | 12.0% | 24728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.3 | 13.2% | 84 |
| stelo.SoRobotNanoMelee 1.2 | 2.7 | 12.6% | 90 |
| hadur117.nano.SanaroC6 0.4 | 3.5 | 12.0% | 52 |
| mld.DustBunny 3.8 | 3.6 | 11.9% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.1% | 43 |
| wee.Gem 1.8.4 | 5.3 | 10.5% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 10.0% | 36 |
| cs.sheldor.Talon 1.1 | 8.6 | 6.6% | 2 |
| tj.zombie1n 1.0.1 | 8.6 | 6.7% | 9 |
| step.nanoPri 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.4 | 62.9 | 1 / 35 | 1972 |
| 2 | 4 | 57.5 | 71.7 | 6 / 35 | 1907 |
| 3 | 4 | 56.4 | 66.7 | 7 / 35 | 1890 |
| 4 | 4 | 56.6 | 67.0 | 8 / 35 | 2232 |
| 5 | 1 | 56.7 | 69.8 | 6 / 35 | 2054 |
| 6 | 3 | 56.7 | 69.5 | 2 / 35 | 2381 |
| 7 | 4 | 54.0 | 63.5 | 3 / 35 | 1671 |
| 8 | 4 | 55.5 | 66.0 | 5 / 35 | 2026 |
| 9 | 2 | 56.6 | 68.3 | 5 / 35 | 2126 |
| 10 | 5 | 55.2 | 64.4 | 4 / 35 | 2181 |
| 11 | 4 | 55.6 | 66.3 | 1 / 35 | 2177 |
| 12 | 3 | 57.8 | 72.1 | 4 / 35 | 2111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 40 | 38% |
| d414.nano.Quantum 1.0.0 | 38 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 9% |
| wee.Gem 1.8.4 | 23 | 52% |
| mld.DustBunny 3.8 | 17 | 24% |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 38% |
| tj.zombie1n 1.0.1 | 9 | 100% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 368 of 420 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 89 | 24% | 96 |
| stelo.SoRobotNanoMelee 1.2 | 70 | 19% | 73 |
| mld.DustBunny 3.8 | 60 | 16% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 13% | 54 |
| wee.Gem 1.8.4 | 38 | 10% | 54 |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 10% | 41 |
| cs.sheldor.Talon 1.1 | 15 | 4% | 16 |
| step.nanoPri 1.0 | 9 | 2% | 10 |
| tj.zombie1n 1.0.1 | 2 | 1% | 8 |

## Melee bench: F10

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 77.0 | 61 / 420 | 3.07 | 13.9% | 37741 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.5% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.9% | 102 |
| mld.Infinity 2.2 | 3.1 | 14.3% | 94 |
| hadur117.nano.SanaroC6 0.4 | 3.5 | 13.9% | 61 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.9% | 6 |
| ayk.WallHugger 1.0 | 6.4 | 7.8% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.4 | 8.1% | 4 |
| conscience.Electron 1.3g | 7.2 | 7.1% | 0 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 10 |
| sample.RamFire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 80.6 | 4 / 35 | 3185 |
| 2 | 4 | 61.3 | 77.8 | 7 / 35 | 2918 |
| 3 | 2 | 63.6 | 81.9 | 11 / 35 | 3589 |
| 4 | 4 | 60.7 | 74.9 | 3 / 35 | 3383 |
| 5 | 3 | 61.2 | 77.8 | 3 / 35 | 3315 |
| 6 | 4 | 59.9 | 74.6 | 3 / 35 | 2932 |
| 7 | 4 | 60.8 | 75.6 | 6 / 35 | 3135 |
| 8 | 3 | 62.9 | 80.0 | 8 / 35 | 3350 |
| 9 | 4 | 56.6 | 67.3 | 0 / 35 | 2452 |
| 10 | 4 | 62.7 | 83.5 | 6 / 35 | 2930 |
| 11 | 4 | 59.5 | 72.1 | 3 / 35 | 3267 |
| 12 | 3 | 61.8 | 77.8 | 7 / 35 | 3285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 78 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 6% |
| d414.nano.Quantum 1.0.0 | 60 | 0% |
| ayk.WallHugger 1.0 | 9 | 89% |
| donjezza.Jezza 1.0 | 5 | 20% |
| robar.nano.Assertive_Melee 0.2 | 4 | 50% |
| exauge.GateKeeper 1.1.121g | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 359 of 420 rounds, at a mean tick of 1552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 135 | 38% | 158 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 96 | 27% | 135 |
| mld.Infinity 2.2 | 59 | 16% | 29 |
| robar.nano.Assertive_Melee 0.2 | 28 | 8% | 32 |
| conscience.Electron 1.3g | 13 | 4% | 15 |
| ayk.WallHugger 1.0 | 10 | 3% | 23 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 15 |
| donjezza.Jezza 1.0 | 9 | 3% | 13 |

## Melee bench: F11

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 76.9 | 79 / 420 | 3.08 | 13.8% | 31938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 153 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.8% | 97 |
| hadur117.nano.SanaroC6 0.4 | 2.8 | 13.8% | 79 |
| oog.melee.Corsair 1.0 | 3.9 | 12.3% | 37 |
| mz.NanoGod 2.02 | 4.8 | 11.2% | 31 |
| DBall.NUKE 0.1 | 6.8 | 7.5% | 10 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 7.4% | 2 |
| awesomeness.Elite 1.0 | 7.9 | 7.0% | 3 |
| sample.Walls 1.0 | 8.3 | 6.4% | 8 |
| stelo.PianistNano 1.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 76.5 | 7 / 35 | 2794 |
| 2 | 3 | 61.3 | 76.8 | 8 / 35 | 2774 |
| 3 | 3 | 59.5 | 73.7 | 7 / 35 | 2467 |
| 4 | 3 | 58.6 | 73.7 | 3 / 35 | 2456 |
| 5 | 2 | 60.8 | 76.5 | 7 / 35 | 2776 |
| 6 | 2 | 61.0 | 77.5 | 7 / 35 | 2752 |
| 7 | 3 | 61.8 | 81.3 | 4 / 35 | 2470 |
| 8 | 2 | 62.4 | 80.3 | 11 / 35 | 2856 |
| 9 | 3 | 59.9 | 76.2 | 5 / 35 | 2501 |
| 10 | 3 | 60.3 | 75.6 | 8 / 35 | 2770 |
| 11 | 3 | 60.3 | 75.6 | 6 / 35 | 2634 |
| 12 | 3 | 61.2 | 79.0 | 6 / 35 | 2688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 6% |
| d414.nano.Quantum 1.0.0 | 74 | 7% |
| oog.melee.Corsair 1.0 | 31 | 58% |
| mz.NanoGod 2.02 | 28 | 61% |
| DBall.NUKE 0.1 | 18 | 83% |
| sample.Walls 1.0 | 13 | 92% |
| zyx.nano.BacillusComma 1.0 | 6 | 83% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 341 of 420 rounds, at a mean tick of 1444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 118 | 35% | 125 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 88 | 26% | 97 |
| mz.NanoGod 2.02 | 49 | 14% | 69 |
| oog.melee.Corsair 1.0 | 39 | 11% | 57 |
| zyx.nano.BacillusComma 1.0 | 24 | 7% | 26 |
| DBall.NUKE 0.1 | 8 | 2% | 24 |
| awesomeness.Elite 1.0 | 6 | 2% | 8 |
| sample.Walls 1.0 | 5 | 1% | 10 |
| stelo.PianistNano 1.2 | 4 | 1% | 4 |

## Melee bench: F12

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 12 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 70.3 | 46 / 420 | 3.67 | 12.4% | 26351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.1% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 13.6% | 82 |
| hadur117.nano.SanaroC6 0.4 | 3.4 | 12.4% | 46 |
| sul.Lunar 1.1 | 3.8 | 11.6% | 61 |
| myl.nano.KomoriNinja 1.1 | 4.8 | 11.1% | 40 |
| sample.SpinBot 1.0 | 7.1 | 8.3% | 18 |
| sam.Samspin 1.0 | 7.3 | 8.1% | 19 |
| maribo.melee.BMV 0.1 | 7.7 | 7.7% | 4 |
| spinnercat.Omen 1.0 | 8.0 | 7.3% | 11 |
| cvt.Firsty 1.0 | 10.0 | 4.7% | 9 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.3 | 65.7 | 5 / 35 | 2009 |
| 2 | 5 | 54.0 | 62.9 | 2 / 35 | 1991 |
| 3 | 3 | 59.2 | 75.2 | 5 / 35 | 2380 |
| 4 | 3 | 60.4 | 78.4 | 7 / 35 | 2312 |
| 5 | 4 | 54.9 | 64.1 | 3 / 35 | 2273 |
| 6 | 3 | 58.5 | 73.7 | 4 / 35 | 2498 |
| 7 | 3 | 57.6 | 71.4 | 4 / 35 | 2188 |
| 8 | 3 | 57.0 | 70.8 | 4 / 35 | 1904 |
| 9 | 3 | 57.8 | 72.7 | 4 / 35 | 2223 |
| 10 | 4 | 55.4 | 67.0 | 1 / 35 | 2090 |
| 11 | 3 | 57.8 | 71.4 | 3 / 35 | 2295 |
| 12 | 3 | 57.0 | 70.2 | 4 / 35 | 2188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 15% |
| d414.nano.Quantum 1.0.0 | 50 | 4% |
| sul.Lunar 1.1 | 42 | 38% |
| myl.nano.KomoriNinja 1.1 | 15 | 47% |
| sample.SpinBot 1.0 | 10 | 40% |
| spinnercat.Omen 1.0 | 6 | 50% |
| sam.Samspin 1.0 | 6 | 50% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 374 of 420 rounds, at a mean tick of 1224. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 107 | 29% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 90 | 24% | 95 |
| sul.Lunar 1.1 | 45 | 12% | 61 |
| myl.nano.KomoriNinja 1.1 | 35 | 9% | 46 |
| sam.Samspin 1.0 | 30 | 8% | 34 |
| sample.SpinBot 1.0 | 27 | 7% | 28 |
| maribo.melee.BMV 0.1 | 21 | 6% | 22 |
| spinnercat.Omen 1.0 | 10 | 3% | 12 |
| cvt.Firsty 1.0 | 9 | 2% | 10 |

## Melee bench: F13

hadur117.nano.SanaroC6 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 70.4 | 25 / 420 | 3.66 | 11.9% | 24576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.5 | 15.1% | 133 |
| d414.nano.Quantum 1.0.0 | 1.9 | 14.2% | 127 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 85 |
| hadur117.nano.SanaroC6 0.4 | 3.8 | 11.9% | 25 |
| mld.Wisdom 1.0 | 4.9 | 10.5% | 10 |
| arthord.NanoSatanMelee Beta | 6.9 | 8.4% | 9 |
| tvv.nano.Polaris 1.2 | 7.1 | 8.2% | 17 |
| zyx.nano.Ant 1.1 | 7.8 | 7.9% | 11 |
| amz.NanoClone 1.41 | 8.1 | 7.8% | 5 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 70.8 | 3 / 35 | 2007 |
| 2 | 3 | 59.3 | 76.8 | 2 / 35 | 2243 |
| 3 | 4 | 54.8 | 66.3 | 0 / 35 | 1943 |
| 4 | 4 | 56.5 | 71.4 | 1 / 35 | 1920 |
| 5 | 2 | 59.4 | 79.7 | 3 / 35 | 2144 |
| 6 | 4 | 58.8 | 75.6 | 1 / 35 | 2443 |
| 7 | 4 | 56.0 | 67.6 | 1 / 35 | 2159 |
| 8 | 5 | 54.6 | 65.1 | 3 / 35 | 2004 |
| 9 | 4 | 55.3 | 66.7 | 2 / 35 | 1825 |
| 10 | 4 | 55.5 | 69.2 | 2 / 35 | 1781 |
| 11 | 3 | 54.9 | 65.4 | 4 / 35 | 2069 |
| 12 | 4 | 56.8 | 70.2 | 3 / 35 | 2038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 4% |
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 0% |
| d414.nano.Quantum 1.0.0 | 39 | 3% |
| zyx.nano.Ant 1.1 | 8 | 63% |
| tvv.nano.Polaris 1.2 | 8 | 38% |
| mld.Wisdom 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 395 of 420 rounds, at a mean tick of 1220. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 119 | 30% | 122 |
| d414.nano.Quantum 1.0.0 | 98 | 25% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 85 | 22% | 89 |
| mld.Wisdom 1.0 | 27 | 7% | 34 |
| arthord.NanoSatanMelee Beta | 22 | 6% | 24 |
| zyx.nano.Ant 1.1 | 22 | 6% | 23 |
| amz.NanoClone 1.41 | 12 | 3% | 15 |
| tvv.nano.Polaris 1.2 | 9 | 2% | 12 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |

