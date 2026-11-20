# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 71.9 | 66 / 420 | 3.53 | 13.2% | 32652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 14.0% | 97 |
| hadur117.nano.SanaroQT 0.4 | 3.0 | 13.2% | 66 |
| bzdp.Pansy 2.1 | 3.4 | 12.6% | 45 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.6% | 12 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.9% | 28 |
| fm.claire 1.7 | 7.0 | 8.3% | 2 |
| zyx.nano.Ant 1.1 | 7.1 | 8.3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.3% | 13 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 73.7 | 3 / 35 | 2763 |
| 2 | 3 | 60.3 | 74.9 | 6 / 35 | 2785 |
| 3 | 4 | 58.9 | 68.6 | 4 / 35 | 2787 |
| 4 | 3 | 60.2 | 73.7 | 6 / 35 | 2735 |
| 5 | 2 | 57.6 | 64.4 | 6 / 35 | 2839 |
| 6 | 3 | 59.8 | 73.7 | 5 / 35 | 2593 |
| 7 | 3 | 61.7 | 76.8 | 8 / 35 | 2818 |
| 8 | 3 | 57.8 | 67.0 | 6 / 35 | 2670 |
| 9 | 4 | 58.6 | 68.6 | 6 / 35 | 2801 |
| 10 | 2 | 60.6 | 74.6 | 7 / 35 | 2746 |
| 11 | 3 | 61.0 | 77.5 | 3 / 35 | 2821 |
| 12 | 3 | 57.9 | 69.5 | 6 / 35 | 2294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 16% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 26% |
| bzdp.Pansy 2.1 | 27 | 59% |
| tvv.nano.Polaris 1.2 | 14 | 36% |
| arthord.NanoSatanMelee Beta | 10 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| zyx.nano.Ant 1.1 | 4 | 50% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 354 of 420 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 114 | 32% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 93 | 26% | 112 |
| bzdp.Pansy 2.1 | 47 | 13% | 62 |
| arthord.NanoSatanMelee Beta | 31 | 9% | 36 |
| zyx.nano.Ant 1.1 | 20 | 6% | 22 |
| tvv.nano.Polaris 1.2 | 19 | 5% | 23 |
| fm.claire 1.7 | 19 | 5% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 2% | 10 |
| arthord.MannyPacquiao Beta | 4 | 1% | 4 |

## Melee bench: F02

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 75.6 | 80 / 420 | 3.20 | 13.6% | 29760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.6% | 94 |
| hadur117.nano.SanaroQT 0.4 | 2.3 | 13.6% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.4% | 73 |
| simonton.nano.MeleeSeed 1.8 | 3.6 | 12.6% | 52 |
| DBall.Anarchy 0.1 | 5.2 | 10.8% | 50 |
| fm.mammillarias 1.3 | 6.3 | 9.6% | 8 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 9.0% | 54 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.1% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 79.0 | 10 / 35 | 2271 |
| 2 | 3 | 61.7 | 78.1 | 7 / 35 | 2830 |
| 3 | 2 | 59.1 | 71.7 | 5 / 35 | 2842 |
| 4 | 3 | 60.5 | 76.2 | 9 / 35 | 2449 |
| 5 | 2 | 60.0 | 75.2 | 6 / 35 | 2565 |
| 6 | 1 | 61.0 | 79.4 | 8 / 35 | 2085 |
| 7 | 2 | 60.2 | 76.5 | 7 / 35 | 2388 |
| 8 | 3 | 57.0 | 68.6 | 4 / 35 | 2102 |
| 9 | 2 | 61.4 | 78.1 | 10 / 35 | 2482 |
| 10 | 2 | 60.1 | 73.3 | 4 / 35 | 2741 |
| 11 | 2 | 61.0 | 78.7 | 5 / 35 | 2487 |
| 12 | 3 | 59.0 | 72.1 | 5 / 35 | 2518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 20% |
| d414.nano.Quantum 1.0.0 | 50 | 22% |
| DBall.Anarchy 0.1 | 46 | 54% |
| simonton.nano.MeleeSeed 1.8 | 32 | 69% |
| stelo.SoJNanoMelee 1.1 | 26 | 31% |
| sample.MyFirstRobot 1.0 | 4 | 0% |
| fm.mammillarias 1.3 | 4 | 50% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 340 of 420 rounds, at a mean tick of 1371. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 103 | 30% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 85 | 25% | 98 |
| simonton.nano.MeleeSeed 1.8 | 43 | 13% | 60 |
| stelo.SoJNanoMelee 1.1 | 36 | 11% | 41 |
| DBall.Anarchy 0.1 | 31 | 9% | 56 |
| fm.mammillarias 1.3 | 27 | 8% | 27 |
| sample.MyFirstRobot 1.0 | 7 | 2% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F03

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.9 | 77 / 420 | 3.35 | 13.9% | 39733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 132 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.1 | 14.7% | 101 |
| hadur117.nano.SanaroQT 0.4 | 2.7 | 13.9% | 77 |
| ahf.NanoAndrew .4 | 4.3 | 11.6% | 37 |
| ratosh.Nobo 0.21 | 4.7 | 11.0% | 17 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.4% | 14 |
| stelo.PatternRobot 1.0 | 6.8 | 7.9% | 30 |
| repositorio.NanoStep 1.0 | 8.4 | 5.8% | 10 |
| sample.Crazy 1.0 | 8.7 | 5.7% | 2 |
| kurios.DOSexe .9a | 9.9 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 82.9 | 10 / 35 | 3597 |
| 2 | 4 | 59.8 | 70.8 | 6 / 35 | 3197 |
| 3 | 3 | 61.8 | 75.2 | 6 / 35 | 3398 |
| 4 | 3 | 62.0 | 78.7 | 7 / 35 | 3042 |
| 5 | 3 | 59.8 | 71.4 | 5 / 35 | 3301 |
| 6 | 2 | 63.5 | 83.8 | 9 / 35 | 3318 |
| 7 | 3 | 60.1 | 74.0 | 6 / 35 | 2936 |
| 8 | 3 | 58.7 | 69.8 | 4 / 35 | 3130 |
| 9 | 3 | 59.3 | 67.3 | 8 / 35 | 3335 |
| 10 | 3 | 55.9 | 60.0 | 3 / 35 | 3237 |
| 11 | 1 | 63.3 | 79.0 | 8 / 35 | 3944 |
| 12 | 3 | 60.7 | 74.3 | 5 / 35 | 3298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 89 | 21% |
| d414.nano.Quantum 1.0.0 | 69 | 25% |
| ahf.NanoAndrew .4 | 25 | 44% |
| stelo.PatternRobot 1.0 | 15 | 33% |
| timmit.nano.TimDog 0.33 | 14 | 64% |
| ratosh.Nobo 0.21 | 13 | 85% |
| repositorio.NanoStep 1.0 | 4 | 75% |
| sample.Crazy 1.0 | 3 | 67% |

Hadur died in 344 of 420 rounds, at a mean tick of 1330. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 94 | 27% | 112 |
| d414.nano.Quantum 1.0.0 | 91 | 26% | 103 |
| ahf.NanoAndrew .4 | 54 | 16% | 67 |
| stelo.PatternRobot 1.0 | 32 | 9% | 37 |
| ratosh.Nobo 0.21 | 30 | 9% | 39 |
| timmit.nano.TimDog 0.33 | 27 | 8% | 38 |
| kurios.DOSexe .9a | 8 | 2% | 9 |
| repositorio.NanoStep 1.0 | 5 | 1% | 8 |
| sample.Crazy 1.0 | 3 | 1% | 7 |

## Melee bench: F04

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 80.5 | 77 / 420 | 2.75 | 15.4% | 52536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.6% | 163 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 16.1% | 125 |
| hadur117.nano.SanaroQT 0.4 | 2.8 | 15.4% | 77 |
| wompi.Quokka 1.6 | 4.0 | 14.0% | 34 |
| kurios.DOSexe .9b | 6.2 | 7.0% | 5 |
| maribo.FollowFire 1 | 6.2 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.8 | 6.6% | 10 |
| jangs.ns51 1.0 | 7.6 | 6.2% | 3 |
| sample.VelociRobot 1.0 | 8.3 | 5.7% | 0 |
| drd.Dreadknoght 0.9 | 9.9 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.2 | 81.9 | 5 / 35 | 4382 |
| 2 | 3 | 64.7 | 79.7 | 9 / 35 | 4521 |
| 3 | 2 | 65.2 | 82.9 | 11 / 35 | 4368 |
| 4 | 3 | 64.3 | 81.6 | 6 / 35 | 4160 |
| 5 | 3 | 64.7 | 80.3 | 5 / 35 | 4734 |
| 6 | 3 | 64.8 | 81.0 | 4 / 35 | 4747 |
| 7 | 3 | 64.3 | 82.9 | 4 / 35 | 4295 |
| 8 | 3 | 65.3 | 83.2 | 9 / 35 | 4470 |
| 9 | 2 | 63.6 | 79.7 | 5 / 35 | 4351 |
| 10 | 3 | 63.0 | 77.5 | 4 / 35 | 4210 |
| 11 | 2 | 63.3 | 79.7 | 7 / 35 | 4280 |
| 12 | 3 | 62.7 | 76.2 | 8 / 35 | 4018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 115 | 14% |
| d414.nano.Quantum 1.0.0 | 97 | 21% |
| wompi.Quokka 1.6 | 42 | 74% |
| kurios.DOSexe .9b | 8 | 63% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| drd.Dreadknoght 0.9 | 3 | 33% |
| sample.VelociRobot 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 343 of 420 rounds, at a mean tick of 1954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 137 | 40% | 167 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 128 | 37% | 149 |
| wompi.Quokka 1.6 | 37 | 11% | 51 |
| maribo.FollowFire 1 | 12 | 3% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 10 | 3% | 12 |
| kurios.DOSexe .9b | 9 | 3% | 15 |
| jangs.ns51 1.0 | 7 | 2% | 8 |
| drd.Dreadknoght 0.9 | 3 | 1% | 5 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 77.9 | 83 / 420 | 2.99 | 14.4% | 43530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.3% | 172 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 15.0% | 102 |
| hadur117.nano.SanaroQT 0.4 | 2.8 | 14.4% | 83 |
| ntc.Opposite 1.5 | 4.3 | 12.3% | 19 |
| js.PinBall 1.6 | 5.2 | 11.2% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.6 | 10.3% | 10 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.5% | 12 |
| PSW.Relentless 0.1 | 8.6 | 4.3% | 0 |
| sample.Fire 1.0 | 8.6 | 4.5% | 3 |
| sample.Target 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 75.9 | 6 / 35 | 3455 |
| 2 | 2 | 64.4 | 80.3 | 9 / 35 | 3947 |
| 3 | 3 | 63.3 | 81.0 | 10 / 35 | 3510 |
| 4 | 3 | 61.5 | 73.0 | 3 / 35 | 3810 |
| 5 | 3 | 62.7 | 75.6 | 9 / 35 | 3773 |
| 6 | 3 | 60.8 | 77.8 | 4 / 35 | 2816 |
| 7 | 3 | 60.5 | 70.8 | 5 / 35 | 3727 |
| 8 | 3 | 63.6 | 81.0 | 8 / 35 | 3522 |
| 9 | 3 | 62.9 | 79.0 | 7 / 35 | 3376 |
| 10 | 2 | 63.5 | 79.4 | 7 / 35 | 3819 |
| 11 | 3 | 63.9 | 80.6 | 8 / 35 | 3727 |
| 12 | 2 | 63.6 | 80.6 | 7 / 35 | 4048 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 90 | 22% |
| js.PinBall 1.6 | 23 | 74% |
| sp.Nanos.Ember 1.1 | 17 | 76% |
| ntc.Opposite 1.5 | 15 | 47% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 337 of 420 rounds, at a mean tick of 1468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 128 | 38% | 151 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 96 | 28% | 123 |
| ntc.Opposite 1.5 | 44 | 13% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 31 | 9% | 36 |
| js.PinBall 1.6 | 21 | 6% | 34 |
| sp.Nanos.Ember 1.1 | 10 | 3% | 20 |
| PSW.Relentless 0.1 | 6 | 2% | 6 |
| sample.Fire 1.0 | 1 | 0% | 2 |

## Melee bench: F06

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 72.3 | 56 / 420 | 3.50 | 12.9% | 30306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 14.4% | 110 |
| d414.nano.Quantum 1.0.0 | 2.2 | 13.9% | 89 |
| radnor.DoctorBob 1.42 | 3.7 | 13.0% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 60 |
| hadur117.nano.SanaroQT 0.4 | 3.8 | 12.9% | 56 |
| myl.nano.Graviton 1.10 | 5.8 | 10.5% | 26 |
| stelo.MirrorNano 1.3 | 7.4 | 7.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.1% | 2 |
| ratosh.Wesco 1.4 | 8.3 | 7.0% | 8 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 77.1 | 8 / 35 | 2606 |
| 2 | 3 | 61.6 | 74.9 | 7 / 35 | 2713 |
| 3 | 5 | 60.8 | 74.9 | 4 / 35 | 2562 |
| 4 | 5 | 59.2 | 73.3 | 3 / 35 | 2385 |
| 5 | 5 | 57.5 | 65.1 | 4 / 35 | 2455 |
| 6 | 3 | 60.2 | 74.3 | 7 / 35 | 2361 |
| 7 | 2 | 61.9 | 76.2 | 10 / 35 | 2701 |
| 8 | 4 | 58.1 | 67.3 | 2 / 35 | 2576 |
| 9 | 4 | 58.9 | 70.5 | 3 / 35 | 2447 |
| 10 | 4 | 58.7 | 70.5 | 4 / 35 | 2516 |
| 11 | 5 | 58.4 | 69.2 | 2 / 35 | 2393 |
| 12 | 3 | 59.9 | 74.0 | 2 / 35 | 2591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 24% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 30% |
| d414.nano.Quantum 1.0.0 | 43 | 14% |
| myl.nano.Graviton 1.10 | 18 | 72% |
| radnor.DoctorBob 1.42 | 16 | 38% |
| ratosh.Wesco 1.4 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 364 of 420 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 106 | 29% | 117 |
| d414.nano.Quantum 1.0.0 | 78 | 21% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 16% | 76 |
| radnor.DoctorBob 1.42 | 53 | 15% | 59 |
| myl.nano.Graviton 1.10 | 42 | 12% | 53 |
| ratosh.Wesco 1.4 | 11 | 3% | 10 |
| stelo.MirrorNano 1.3 | 10 | 3% | 11 |
| squidM.TentalceMeleeNano 1.1 | 6 | 2% | 8 |

## Melee bench: F07

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 70.8 | 95 / 420 | 3.63 | 13.2% | 34742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.7% | 101 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.0% | 70 |
| hadur117.nano.SanaroQT 0.4 | 3.2 | 13.2% | 95 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.9% | 57 |
| cb.nano.Insomnia 1.0 | 4.3 | 12.1% | 56 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 10.6% | 27 |
| mz.Cork 0.1 | 6.5 | 10.3% | 9 |
| stuff.Vlad 0.1 | 8.5 | 5.2% | 0 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.3% | 4 |
| sample.TrackFire 1.0 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 70.5 | 6 / 35 | 3296 |
| 2 | 3 | 59.4 | 67.6 | 10 / 35 | 3118 |
| 3 | 3 | 58.9 | 69.2 | 9 / 35 | 2662 |
| 4 | 5 | 59.3 | 69.2 | 6 / 35 | 2781 |
| 5 | 1 | 62.1 | 77.5 | 8 / 35 | 3084 |
| 6 | 2 | 61.3 | 73.3 | 10 / 35 | 3173 |
| 7 | 4 | 56.8 | 65.7 | 7 / 35 | 2314 |
| 8 | 3 | 59.7 | 72.4 | 7 / 35 | 2708 |
| 9 | 3 | 61.2 | 73.3 | 8 / 35 | 3169 |
| 10 | 1 | 63.0 | 78.7 | 11 / 35 | 3077 |
| 11 | 6 | 56.7 | 61.6 | 7 / 35 | 2753 |
| 12 | 4 | 58.9 | 70.2 | 6 / 35 | 2607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 43 | 58% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 35% |
| nz.jdc.nano.GridFu 1.0 | 35 | 66% |
| d414.nano.Quantum 1.0.0 | 32 | 22% |
| oog.melee.CapuletDroid 1.1 | 18 | 61% |
| mz.Cork 0.1 | 14 | 93% |
| stelo.UntouchableNano 1.3 | 2 | 50% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 326 of 420 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 90 | 28% | 110 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 22% | 105 |
| nz.jdc.nano.GridFu 1.0 | 54 | 17% | 80 |
| cb.nano.Insomnia 1.0 | 45 | 14% | 30 |
| oog.melee.CapuletDroid 1.1 | 32 | 10% | 49 |
| mz.Cork 0.1 | 18 | 6% | 30 |
| stelo.UntouchableNano 1.3 | 7 | 2% | 7 |
| sample.TrackFire 1.0 | 5 | 2% | 6 |
| stuff.Vlad 0.1 | 3 | 1% | 3 |

## Melee bench: F08

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 12 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 78.2 | 86 / 420 | 2.96 | 14.4% | 38237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 15.3% | 126 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 15.0% | 109 |
| hadur117.nano.SanaroQT 0.4 | 2.5 | 14.4% | 86 |
| gh.nano.Grofvuil 0.2 | 3.9 | 12.6% | 45 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 10.6% | 14 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 10.1% | 29 |
| baal.nano.N 1.42 | 6.6 | 9.3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.5 | 5.6% | 4 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 79.7 | 7 / 35 | 3094 |
| 2 | 3 | 59.7 | 70.5 | 3 / 35 | 2986 |
| 3 | 3 | 60.2 | 69.8 | 6 / 35 | 3307 |
| 4 | 3 | 62.4 | 78.4 | 7 / 35 | 2948 |
| 5 | 3 | 62.0 | 79.4 | 4 / 35 | 3079 |
| 6 | 1 | 64.4 | 82.9 | 8 / 35 | 3639 |
| 7 | 4 | 61.6 | 74.3 | 6 / 35 | 3220 |
| 8 | 1 | 65.1 | 85.7 | 13 / 35 | 3434 |
| 9 | 3 | 61.0 | 74.3 | 6 / 35 | 3041 |
| 10 | 3 | 64.0 | 84.8 | 7 / 35 | 3223 |
| 11 | 3 | 60.7 | 73.0 | 6 / 35 | 3114 |
| 12 | 1 | 64.9 | 85.7 | 13 / 35 | 3152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 104 | 20% |
| d414.nano.Quantum 1.0.0 | 67 | 10% |
| gh.nano.Grofvuil 0.2 | 32 | 69% |
| djdjdj.NanoSkunk10 1.0 | 24 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 78% |
| donjezza.Muncho 1.0 | 7 | 86% |
| baal.nano.N 1.42 | 6 | 83% |

Hadur died in 335 of 420 rounds, at a mean tick of 1448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 115 | 34% | 123 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 114 | 34% | 140 |
| gh.nano.Grofvuil 0.2 | 36 | 11% | 56 |
| dmh.robocode.robot.RedDwarf 0.4 | 29 | 9% | 32 |
| djdjdj.NanoSkunk10 1.0 | 21 | 6% | 38 |
| baal.nano.N 1.42 | 14 | 4% | 19 |
| donjezza.Muncho 1.0 | 3 | 1% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 3 |

## Melee bench: F09

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 69.1 | 78 / 420 | 3.78 | 12.9% | 31224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroQT 0.4 | 2.2 | 12.9% | 78 |
| d414.nano.Quantum 1.0.0 | 2.4 | 12.7% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 2.8 | 12.2% | 87 |
| mld.DustBunny 3.8 | 4.2 | 11.5% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.6 | 11.2% | 41 |
| wee.Gem 1.8.4 | 5.7 | 10.3% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 9.7% | 30 |
| cs.sheldor.Talon 1.1 | 8.4 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 8.5 | 7.1% | 25 |
| step.nanoPri 1.0 | 9.9 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.2 | 69.2 | 7 / 35 | 2705 |
| 2 | 1 | 59.9 | 75.9 | 7 / 35 | 2609 |
| 3 | 3 | 56.2 | 64.8 | 5 / 35 | 2452 |
| 4 | 1 | 59.2 | 72.7 | 6 / 35 | 2887 |
| 5 | 3 | 58.4 | 72.1 | 7 / 35 | 2226 |
| 6 | 6 | 54.4 | 57.5 | 6 / 35 | 2642 |
| 7 | 2 | 57.3 | 68.9 | 6 / 35 | 2334 |
| 8 | 1 | 59.9 | 74.0 | 7 / 35 | 2800 |
| 9 | 2 | 57.7 | 70.5 | 4 / 35 | 2552 |
| 10 | 1 | 58.6 | 68.9 | 7 / 35 | 2886 |
| 11 | 2 | 58.8 | 69.8 | 8 / 35 | 2707 |
| 12 | 3 | 56.9 | 65.4 | 8 / 35 | 2424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 40 | 78% |
| stelo.SoRobotNanoMelee 1.2 | 36 | 53% |
| d414.nano.Quantum 1.0.0 | 29 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 21% |
| mld.DustBunny 3.8 | 19 | 21% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 100% |
| tj.zombie1n 1.0.1 | 4 | 50% |

Hadur died in 342 of 420 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 21% | 83 |
| stelo.SoRobotNanoMelee 1.2 | 70 | 20% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 17% | 69 |
| mld.DustBunny 3.8 | 56 | 16% | 66 |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 9% | 41 |
| wee.Gem 1.8.4 | 20 | 6% | 50 |
| tj.zombie1n 1.0.1 | 17 | 5% | 15 |
| cs.sheldor.Talon 1.1 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 7 | 2% | 7 |

## Melee bench: F10

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 78.0 | 83 / 420 | 2.98 | 14.6% | 42681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 15.9% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 15.0% | 104 |
| mld.Infinity 2.2 | 2.8 | 14.8% | 113 |
| hadur117.nano.SanaroQT 0.4 | 3.1 | 14.6% | 83 |
| robar.nano.Assertive_Melee 0.2 | 5.6 | 8.1% | 4 |
| exauge.GateKeeper 1.1.121g | 6.4 | 7.3% | 2 |
| conscience.Electron 1.3g | 6.8 | 7.4% | 0 |
| ayk.WallHugger 1.0 | 7.4 | 7.0% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 5.9% | 5 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 82.2 | 9 / 35 | 3846 |
| 2 | 4 | 61.0 | 75.2 | 4 / 35 | 3270 |
| 3 | 3 | 64.3 | 80.0 | 11 / 35 | 3671 |
| 4 | 3 | 62.8 | 79.0 | 7 / 35 | 3568 |
| 5 | 4 | 60.0 | 70.8 | 5 / 35 | 3439 |
| 6 | 4 | 59.7 | 72.4 | 7 / 35 | 3079 |
| 7 | 4 | 62.6 | 78.1 | 6 / 35 | 3565 |
| 8 | 2 | 65.0 | 85.1 | 12 / 35 | 3491 |
| 9 | 3 | 62.2 | 77.1 | 6 / 35 | 3620 |
| 10 | 4 | 60.4 | 72.1 | 4 / 35 | 3432 |
| 11 | 2 | 64.4 | 83.8 | 8 / 35 | 3947 |
| 12 | 3 | 63.0 | 79.7 | 4 / 35 | 3753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 87 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 20% |
| d414.nano.Quantum 1.0.0 | 63 | 10% |
| donjezza.Jezza 1.0 | 8 | 63% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 338 of 420 rounds, at a mean tick of 1655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 119 | 35% | 163 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 112 | 33% | 163 |
| mld.Infinity 2.2 | 59 | 17% | 24 |
| robar.nano.Assertive_Melee 0.2 | 20 | 6% | 25 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 13 |
| conscience.Electron 1.3g | 7 | 2% | 9 |
| donjezza.Jezza 1.0 | 6 | 2% | 12 |
| ayk.WallHugger 1.0 | 6 | 2% | 11 |

## Melee bench: F11

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 77.3 | 107 / 420 | 3.05 | 14.6% | 37430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 15.3% | 119 |
| hadur117.nano.SanaroQT 0.4 | 2.3 | 14.6% | 107 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.7% | 89 |
| oog.melee.Corsair 1.0 | 4.0 | 12.5% | 46 |
| mz.NanoGod 2.02 | 4.8 | 11.0% | 34 |
| DBall.NUKE 0.1 | 6.5 | 7.9% | 16 |
| awesomeness.Elite 1.0 | 6.9 | 7.8% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.9 | 6.8% | 1 |
| sample.Walls 1.0 | 8.7 | 6.4% | 5 |
| stelo.PianistNano 1.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 82.5 | 12 / 35 | 3628 |
| 2 | 2 | 60.5 | 74.0 | 8 / 35 | 3019 |
| 3 | 2 | 62.0 | 75.2 | 9 / 35 | 3422 |
| 4 | 2 | 61.5 | 76.2 | 9 / 35 | 3108 |
| 5 | 3 | 59.3 | 72.7 | 5 / 35 | 2766 |
| 6 | 1 | 65.6 | 88.6 | 12 / 35 | 3471 |
| 7 | 5 | 58.6 | 67.9 | 8 / 35 | 2767 |
| 8 | 2 | 64.3 | 81.9 | 14 / 35 | 3117 |
| 9 | 2 | 61.5 | 74.9 | 10 / 35 | 2989 |
| 10 | 3 | 60.0 | 75.6 | 4 / 35 | 2769 |
| 11 | 2 | 61.9 | 76.5 | 8 / 35 | 3240 |
| 12 | 2 | 62.8 | 81.3 | 8 / 35 | 3134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 87 | 31% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 30% |
| oog.melee.Corsair 1.0 | 32 | 63% |
| DBall.NUKE 0.1 | 24 | 83% |
| mz.NanoGod 2.02 | 16 | 44% |
| sample.Walls 1.0 | 7 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 316 of 420 rounds, at a mean tick of 1303. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 111 | 35% | 146 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 88 | 28% | 112 |
| oog.melee.Corsair 1.0 | 40 | 13% | 58 |
| mz.NanoGod 2.02 | 36 | 11% | 46 |
| zyx.nano.BacillusComma 1.0 | 12 | 4% | 13 |
| awesomeness.Elite 1.0 | 11 | 3% | 11 |
| DBall.NUKE 0.1 | 9 | 3% | 26 |
| sample.Walls 1.0 | 5 | 2% | 4 |
| stelo.PianistNano 1.2 | 4 | 1% | 4 |

## Melee bench: F12

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 71.5 | 61 / 420 | 3.57 | 13.2% | 32801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 14.9% | 128 |
| hadur117.nano.SanaroQT 0.4 | 2.3 | 13.2% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.1% | 73 |
| sul.Lunar 1.1 | 4.0 | 11.8% | 80 |
| myl.nano.KomoriNinja 1.1 | 4.6 | 11.0% | 26 |
| maribo.melee.BMV 0.1 | 6.9 | 8.3% | 2 |
| sam.Samspin 1.0 | 7.6 | 7.9% | 17 |
| sample.SpinBot 1.0 | 7.7 | 7.6% | 17 |
| spinnercat.Omen 1.0 | 7.7 | 7.6% | 9 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 69.2 | 3 / 35 | 2574 |
| 2 | 2 | 59.1 | 71.4 | 8 / 35 | 2706 |
| 3 | 1 | 61.4 | 77.5 | 7 / 35 | 3043 |
| 4 | 3 | 57.6 | 66.3 | 3 / 35 | 2751 |
| 5 | 2 | 57.7 | 67.9 | 6 / 35 | 2543 |
| 6 | 2 | 59.9 | 74.0 | 5 / 35 | 2940 |
| 7 | 4 | 54.4 | 61.0 | 3 / 35 | 2652 |
| 8 | 2 | 57.3 | 69.5 | 4 / 35 | 2488 |
| 9 | 2 | 58.8 | 72.4 | 5 / 35 | 2649 |
| 10 | 1 | 62.6 | 79.0 | 9 / 35 | 2997 |
| 11 | 3 | 58.7 | 73.7 | 2 / 35 | 2614 |
| 12 | 2 | 60.8 | 75.6 | 6 / 35 | 2844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 22% |
| d414.nano.Quantum 1.0.0 | 51 | 22% |
| sul.Lunar 1.1 | 38 | 0% |
| myl.nano.KomoriNinja 1.1 | 26 | 73% |
| sample.SpinBot 1.0 | 12 | 50% |
| sam.Samspin 1.0 | 9 | 44% |
| spinnercat.Omen 1.0 | 9 | 78% |
| cvt.Firsty 1.0 | 3 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 360 of 420 rounds, at a mean tick of 1271. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 90 | 25% | 101 |
| d414.nano.Quantum 1.0.0 | 84 | 23% | 98 |
| sul.Lunar 1.1 | 60 | 17% | 65 |
| myl.nano.KomoriNinja 1.1 | 39 | 11% | 59 |
| sample.SpinBot 1.0 | 27 | 8% | 31 |
| sam.Samspin 1.0 | 25 | 7% | 28 |
| spinnercat.Omen 1.0 | 16 | 4% | 18 |
| maribo.melee.BMV 0.1 | 12 | 3% | 13 |
| cvt.Firsty 1.0 | 7 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 72.2 | 56 / 420 | 3.50 | 12.8% | 29887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.3% | 131 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.8 | 14.2% | 113 |
| hadur117.nano.SanaroQT 0.4 | 3.2 | 12.8% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.4% | 61 |
| mld.Wisdom 1.0 | 5.3 | 10.4% | 12 |
| tvv.nano.Polaris 1.2 | 6.8 | 8.6% | 25 |
| zyx.nano.Ant 1.1 | 7.1 | 8.6% | 9 |
| arthord.NanoSatanMelee Beta | 7.7 | 7.9% | 7 |
| amz.NanoClone 1.41 | 8.1 | 7.8% | 6 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 77.1 | 9 / 35 | 2360 |
| 2 | 4 | 58.5 | 71.4 | 3 / 35 | 2659 |
| 3 | 3 | 58.4 | 71.1 | 6 / 35 | 2635 |
| 4 | 2 | 59.4 | 76.5 | 3 / 35 | 2762 |
| 5 | 4 | 57.4 | 67.9 | 3 / 35 | 2678 |
| 6 | 4 | 57.0 | 67.3 | 3 / 35 | 2517 |
| 7 | 4 | 57.1 | 70.8 | 2 / 35 | 2307 |
| 8 | 3 | 59.7 | 74.6 | 7 / 35 | 2417 |
| 9 | 3 | 57.9 | 70.5 | 4 / 35 | 2501 |
| 10 | 3 | 59.2 | 75.2 | 5 / 35 | 2329 |
| 11 | 3 | 59.3 | 74.3 | 5 / 35 | 2394 |
| 12 | 3 | 57.3 | 69.2 | 6 / 35 | 2328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 61 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 20% |
| d414.nano.Quantum 1.0.0 | 54 | 15% |
| zyx.nano.Ant 1.1 | 14 | 57% |
| tvv.nano.Polaris 1.2 | 12 | 17% |
| arthord.NanoSatanMelee Beta | 10 | 100% |
| mld.Wisdom 1.0 | 8 | 100% |
| amz.NanoClone 1.41 | 4 | 75% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 364 of 420 rounds, at a mean tick of 1185. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 105 | 29% | 111 |
| d414.nano.Quantum 1.0.0 | 92 | 25% | 103 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 61 | 17% | 76 |
| mld.Wisdom 1.0 | 25 | 7% | 33 |
| tvv.nano.Polaris 1.2 | 23 | 6% | 24 |
| arthord.NanoSatanMelee Beta | 20 | 5% | 26 |
| zyx.nano.Ant 1.1 | 18 | 5% | 23 |
| amz.NanoClone 1.41 | 18 | 5% | 20 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |

