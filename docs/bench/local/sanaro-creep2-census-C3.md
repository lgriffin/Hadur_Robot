# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 72.6 | 43 / 420 | 3.46 | 12.2% | 21216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.2% | 164 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.1% | 99 |
| bzdp.Pansy 2.1 | 3.1 | 13.0% | 55 |
| hadur117.nano.SanaroC3 0.4 | 3.5 | 12.2% | 43 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.5% | 12 |
| tvv.nano.Polaris 1.2 | 6.2 | 9.2% | 30 |
| zyx.nano.Ant 1.1 | 6.4 | 8.8% | 7 |
| fm.claire 1.7 | 7.7 | 7.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.2% | 8 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 76.8 | 3 / 35 | 2195 |
| 2 | 4 | 58.4 | 74.3 | 3 / 35 | 1826 |
| 3 | 3 | 56.8 | 72.7 | 3 / 35 | 1550 |
| 4 | 3 | 57.6 | 73.3 | 5 / 35 | 1874 |
| 5 | 4 | 55.5 | 68.3 | 5 / 35 | 1520 |
| 6 | 3 | 58.9 | 77.1 | 4 / 35 | 1902 |
| 7 | 4 | 58.2 | 73.0 | 6 / 35 | 1844 |
| 8 | 4 | 55.6 | 68.3 | 5 / 35 | 1612 |
| 9 | 3 | 57.6 | 72.7 | 4 / 35 | 1582 |
| 10 | 3 | 59.0 | 76.5 | 3 / 35 | 1915 |
| 11 | 4 | 55.6 | 69.2 | 2 / 35 | 1642 |
| 12 | 4 | 55.8 | 69.2 | 0 / 35 | 1754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 5% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 9% |
| bzdp.Pansy 2.1 | 35 | 37% |
| tvv.nano.Polaris 1.2 | 15 | 33% |
| arthord.NanoSatanMelee Beta | 12 | 42% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| zyx.nano.Ant 1.1 | 6 | 50% |
| fm.claire 1.7 | 3 | 67% |
| arthord.MannyPacquiao Beta | 2 | 50% |

Hadur died in 377 of 420 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 127 | 34% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 84 | 22% | 88 |
| bzdp.Pansy 2.1 | 73 | 19% | 88 |
| arthord.NanoSatanMelee Beta | 25 | 7% | 29 |
| zyx.nano.Ant 1.1 | 24 | 6% | 28 |
| tvv.nano.Polaris 1.2 | 20 | 5% | 25 |
| fm.claire 1.7 | 16 | 4% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 1% | 11 |
| arthord.MannyPacquiao Beta | 3 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 72.7 | 43 / 420 | 3.45 | 12.1% | 20128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.5% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 12.7% | 54 |
| simonton.nano.MeleeSeed 1.8 | 3.4 | 12.2% | 50 |
| hadur117.nano.SanaroC3 0.4 | 3.6 | 12.1% | 43 |
| DBall.Anarchy 0.1 | 4.9 | 11.0% | 55 |
| fm.mammillarias 1.3 | 5.9 | 9.9% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 9.1% | 60 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.4% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.8% | 19 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 72.7 | 3 / 35 | 1316 |
| 2 | 2 | 59.0 | 78.7 | 6 / 35 | 1733 |
| 3 | 5 | 55.4 | 67.9 | 2 / 35 | 1683 |
| 4 | 4 | 56.1 | 69.2 | 4 / 35 | 2003 |
| 5 | 3 | 58.3 | 73.7 | 4 / 35 | 2062 |
| 6 | 3 | 58.8 | 80.0 | 4 / 35 | 1596 |
| 7 | 4 | 56.4 | 71.4 | 3 / 35 | 1721 |
| 8 | 4 | 55.6 | 67.9 | 4 / 35 | 1839 |
| 9 | 5 | 54.6 | 67.6 | 2 / 35 | 1519 |
| 10 | 3 | 57.0 | 72.7 | 3 / 35 | 1687 |
| 11 | 3 | 55.8 | 72.7 | 1 / 35 | 1495 |
| 12 | 2 | 58.6 | 78.1 | 7 / 35 | 1474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 10% |
| stelo.SoJNanoMelee 1.1 | 29 | 28% |
| DBall.Anarchy 0.1 | 26 | 46% |
| simonton.nano.MeleeSeed 1.8 | 17 | 82% |
| sample.MyFirstRobot 1.0 | 9 | 0% |
| fm.mammillarias 1.3 | 5 | 60% |

Hadur died in 377 of 420 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 127 | 34% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 20% | 80 |
| stelo.SoJNanoMelee 1.1 | 44 | 12% | 47 |
| simonton.nano.MeleeSeed 1.8 | 36 | 10% | 47 |
| fm.mammillarias 1.3 | 34 | 9% | 35 |
| DBall.Anarchy 0.1 | 29 | 8% | 44 |
| sample.MyFirstRobot 1.0 | 19 | 5% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 5 | 1% | 5 |

## Melee bench: F03

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 72.7 | 44 / 420 | 3.46 | 12.5% | 27467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.6% | 163 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.0% | 71 |
| hadur117.nano.SanaroC3 0.4 | 3.6 | 12.5% | 44 |
| ahf.NanoAndrew .4 | 3.8 | 12.4% | 59 |
| ratosh.Nobo 0.21 | 4.6 | 11.1% | 18 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.4% | 16 |
| stelo.PatternRobot 1.0 | 7.1 | 7.9% | 35 |
| repositorio.NanoStep 1.0 | 8.2 | 6.0% | 8 |
| sample.Crazy 1.0 | 8.5 | 5.7% | 6 |
| kurios.DOSexe .9a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 76.5 | 6 / 35 | 2322 |
| 2 | 4 | 56.4 | 68.3 | 2 / 35 | 2288 |
| 3 | 4 | 58.9 | 76.8 | 6 / 35 | 2091 |
| 4 | 2 | 59.6 | 75.9 | 6 / 35 | 2502 |
| 5 | 3 | 57.8 | 72.7 | 2 / 35 | 2333 |
| 6 | 3 | 59.1 | 74.6 | 4 / 35 | 2466 |
| 7 | 4 | 55.9 | 67.3 | 0 / 35 | 2278 |
| 8 | 4 | 57.3 | 71.1 | 3 / 35 | 2397 |
| 9 | 3 | 58.6 | 74.3 | 5 / 35 | 2180 |
| 10 | 4 | 57.9 | 74.3 | 3 / 35 | 2036 |
| 11 | 4 | 58.3 | 73.0 | 6 / 35 | 2126 |
| 12 | 5 | 56.2 | 67.6 | 1 / 35 | 2448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 11% |
| ahf.NanoAndrew .4 | 25 | 36% |
| stelo.PatternRobot 1.0 | 18 | 22% |
| ratosh.Nobo 0.21 | 12 | 58% |
| timmit.nano.TimDog 0.33 | 10 | 90% |
| repositorio.NanoStep 1.0 | 3 | 67% |
| sample.Crazy 1.0 | 3 | 33% |

Hadur died in 377 of 420 rounds, at a mean tick of 1123. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 125 | 33% | 127 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 87 | 23% | 91 |
| ahf.NanoAndrew .4 | 61 | 16% | 70 |
| stelo.PatternRobot 1.0 | 38 | 10% | 43 |
| ratosh.Nobo 0.21 | 34 | 9% | 43 |
| timmit.nano.TimDog 0.33 | 15 | 4% | 24 |
| kurios.DOSexe .9a | 7 | 2% | 7 |
| sample.Crazy 1.0 | 6 | 2% | 8 |
| repositorio.NanoStep 1.0 | 4 | 1% | 7 |

## Melee bench: F04

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 73.8 | 27 / 420 | 3.35 | 12.5% | 32424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.8% | 209 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.1 | 16.2% | 104 |
| wompi.Quokka 1.6 | 3.0 | 14.3% | 56 |
| hadur117.nano.SanaroC3 0.4 | 3.9 | 12.5% | 27 |
| maribo.FollowFire 1 | 5.8 | 7.3% | 0 |
| kurios.DOSexe .9b | 6.6 | 7.2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 6.7 | 7.0% | 14 |
| jangs.ns51 1.0 | 7.3 | 6.5% | 7 |
| sample.VelociRobot 1.0 | 8.7 | 5.9% | 2 |
| drd.Dreadknoght 0.9 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 75.6 | 2 / 35 | 2502 |
| 2 | 4 | 57.1 | 69.8 | 2 / 35 | 2357 |
| 3 | 4 | 57.4 | 69.8 | 1 / 35 | 2770 |
| 4 | 4 | 57.7 | 71.1 | 1 / 35 | 2488 |
| 5 | 4 | 58.5 | 72.1 | 1 / 35 | 2880 |
| 6 | 4 | 59.2 | 78.1 | 0 / 35 | 2598 |
| 7 | 4 | 59.5 | 74.9 | 4 / 35 | 3058 |
| 8 | 4 | 58.0 | 70.2 | 1 / 35 | 2781 |
| 9 | 4 | 59.5 | 74.9 | 4 / 35 | 2655 |
| 10 | 4 | 59.3 | 75.2 | 3 / 35 | 2549 |
| 11 | 3 | 62.5 | 81.3 | 4 / 35 | 3389 |
| 12 | 4 | 58.4 | 73.0 | 4 / 35 | 2397 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 5% |
| d414.nano.Quantum 1.0.0 | 63 | 3% |
| wompi.Quokka 1.6 | 24 | 71% |
| sample.MyFirstJuniorRobot 1.0 | 7 | 14% |
| jangs.ns51 1.0 | 4 | 0% |
| sample.VelociRobot 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 393 of 420 rounds, at a mean tick of 1415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 184 | 47% | 189 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 104 | 26% | 109 |
| wompi.Quokka 1.6 | 55 | 14% | 66 |
| sample.MyFirstJuniorRobot 1.0 | 17 | 4% | 19 |
| maribo.FollowFire 1 | 13 | 3% | 13 |
| jangs.ns51 1.0 | 11 | 3% | 12 |
| kurios.DOSexe .9b | 5 | 1% | 5 |
| sample.VelociRobot 1.0 | 4 | 1% | 6 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 75.6 | 35 / 420 | 3.20 | 12.7% | 29795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.2% | 209 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.3% | 110 |
| hadur117.nano.SanaroC3 0.4 | 3.2 | 12.7% | 35 |
| ntc.Opposite 1.5 | 4.3 | 11.7% | 18 |
| js.PinBall 1.6 | 4.9 | 11.0% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.6% | 8 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.6% | 10 |
| sample.Fire 1.0 | 8.5 | 4.8% | 6 |
| PSW.Relentless 0.1 | 8.7 | 4.5% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 76.8 | 3 / 35 | 2248 |
| 2 | 3 | 59.2 | 73.7 | 0 / 35 | 2576 |
| 3 | 3 | 60.3 | 79.4 | 5 / 35 | 2324 |
| 4 | 4 | 58.2 | 71.1 | 2 / 35 | 2557 |
| 5 | 3 | 58.7 | 72.1 | 3 / 35 | 2625 |
| 6 | 3 | 61.1 | 80.3 | 5 / 35 | 2518 |
| 7 | 3 | 60.0 | 76.2 | 2 / 35 | 2815 |
| 8 | 3 | 58.5 | 74.3 | 3 / 35 | 2414 |
| 9 | 3 | 58.6 | 73.3 | 3 / 35 | 2527 |
| 10 | 4 | 59.9 | 77.8 | 4 / 35 | 2179 |
| 11 | 3 | 60.7 | 78.4 | 5 / 35 | 2672 |
| 12 | 3 | 57.6 | 74.0 | 0 / 35 | 2340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 4% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 3% |
| js.PinBall 1.6 | 16 | 69% |
| sp.Nanos.Ember 1.1 | 13 | 62% |
| ntc.Opposite 1.5 | 13 | 54% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 67% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 385 of 420 rounds, at a mean tick of 1381. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 160 | 42% | 168 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 102 | 26% | 107 |
| ntc.Opposite 1.5 | 41 | 11% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 37 | 10% | 42 |
| js.PinBall 1.6 | 32 | 8% | 42 |
| sp.Nanos.Ember 1.1 | 7 | 2% | 12 |
| sample.Fire 1.0 | 5 | 1% | 5 |
| PSW.Relentless 0.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 69.1 | 31 / 420 | 3.78 | 11.4% | 19759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 14.9% | 117 |
| kawigi.nano.Lib 1.0 | 1.9 | 14.2% | 105 |
| radnor.DoctorBob 1.42 | 3.5 | 12.8% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.2% | 53 |
| hadur117.nano.SanaroC3 0.4 | 4.8 | 11.4% | 31 |
| myl.nano.Graviton 1.10 | 5.2 | 11.2% | 47 |
| ratosh.Wesco 1.4 | 7.8 | 7.4% | 3 |
| stelo.MirrorNano 1.3 | 7.8 | 7.7% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.1% | 5 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 56.1 | 68.6 | 1 / 35 | 1695 |
| 2 | 4 | 60.6 | 80.0 | 4 / 35 | 2040 |
| 3 | 6 | 53.1 | 61.0 | 0 / 35 | 1387 |
| 4 | 5 | 56.2 | 68.3 | 4 / 35 | 1707 |
| 5 | 3 | 58.5 | 73.3 | 4 / 35 | 1788 |
| 6 | 6 | 53.7 | 63.5 | 1 / 35 | 1379 |
| 7 | 6 | 54.5 | 63.5 | 3 / 35 | 1600 |
| 8 | 4 | 56.1 | 68.9 | 2 / 35 | 1491 |
| 9 | 5 | 54.0 | 61.6 | 2 / 35 | 1513 |
| 10 | 5 | 57.9 | 72.4 | 4 / 35 | 1767 |
| 11 | 5 | 58.1 | 74.3 | 2 / 35 | 1771 |
| 12 | 3 | 58.2 | 74.0 | 4 / 35 | 1621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 10% |
| d414.nano.Quantum 1.0.0 | 38 | 0% |
| kawigi.nano.Lib 1.0 | 26 | 8% |
| myl.nano.Graviton 1.10 | 24 | 50% |
| radnor.DoctorBob 1.42 | 20 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 389 of 420 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 95 | 24% | 97 |
| kawigi.nano.Lib 1.0 | 88 | 23% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 68 | 17% | 72 |
| radnor.DoctorBob 1.42 | 62 | 16% | 72 |
| myl.nano.Graviton 1.10 | 43 | 11% | 55 |
| stelo.MirrorNano 1.3 | 13 | 3% | 14 |
| ratosh.Wesco 1.4 | 11 | 3% | 11 |
| squidM.TentalceMeleeNano 1.1 | 9 | 2% | 9 |

## Melee bench: F07

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 71.0 | 75 / 420 | 3.61 | 12.1% | 21829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 14.3% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.2% | 84 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.8% | 67 |
| hadur117.nano.SanaroC3 0.4 | 4.3 | 12.1% | 75 |
| cb.nano.Insomnia 1.0 | 4.3 | 12.0% | 41 |
| oog.melee.CapuletDroid 1.1 | 5.8 | 11.1% | 32 |
| mz.Cork 0.1 | 6.1 | 10.9% | 16 |
| stuff.Vlad 0.1 | 8.4 | 5.2% | 0 |
| stelo.UntouchableNano 1.3 | 8.6 | 5.2% | 3 |
| sample.TrackFire 1.0 | 10.0 | 3.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.5 | 68.6 | 6 / 35 | 1748 |
| 2 | 2 | 60.0 | 76.8 | 10 / 35 | 2072 |
| 3 | 3 | 59.5 | 76.2 | 10 / 35 | 1867 |
| 4 | 4 | 58.5 | 74.9 | 7 / 35 | 1649 |
| 5 | 4 | 58.1 | 73.3 | 6 / 35 | 2030 |
| 6 | 4 | 57.3 | 72.1 | 4 / 35 | 1744 |
| 7 | 6 | 54.2 | 61.9 | 4 / 35 | 1872 |
| 8 | 7 | 55.3 | 66.3 | 4 / 35 | 1730 |
| 9 | 5 | 57.0 | 72.1 | 5 / 35 | 1589 |
| 10 | 2 | 58.9 | 74.6 | 9 / 35 | 2032 |
| 11 | 6 | 54.7 | 62.9 | 5 / 35 | 1782 |
| 12 | 5 | 57.5 | 72.7 | 5 / 35 | 1714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 4% |
| cb.nano.Insomnia 1.0 | 36 | 69% |
| nz.jdc.nano.GridFu 1.0 | 30 | 67% |
| d414.nano.Quantum 1.0.0 | 26 | 0% |
| oog.melee.CapuletDroid 1.1 | 21 | 62% |
| mz.Cork 0.1 | 12 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 67% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 345 of 420 rounds, at a mean tick of 1326. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 91 | 26% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 23% | 96 |
| nz.jdc.nano.GridFu 1.0 | 52 | 15% | 75 |
| cb.nano.Insomnia 1.0 | 51 | 15% | 38 |
| oog.melee.CapuletDroid 1.1 | 32 | 9% | 53 |
| mz.Cork 0.1 | 23 | 7% | 39 |
| stelo.UntouchableNano 1.3 | 9 | 3% | 12 |
| sample.TrackFire 1.0 | 6 | 2% | 7 |
| stuff.Vlad 0.1 | 2 | 1% | 3 |

## Melee bench: F08

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 76.3 | 58 / 420 | 3.13 | 12.9% | 25529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.9% | 171 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.9% | 102 |
| gh.nano.Grofvuil 0.2 | 3.5 | 12.7% | 33 |
| hadur117.nano.SanaroC3 0.4 | 3.6 | 12.9% | 58 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 10.3% | 36 |
| baal.nano.N 1.42 | 6.7 | 9.3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.2% | 11 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 77.8 | 5 / 35 | 1966 |
| 2 | 3 | 60.0 | 76.8 | 7 / 35 | 2106 |
| 3 | 3 | 60.6 | 78.7 | 3 / 35 | 2264 |
| 4 | 3 | 62.0 | 80.3 | 8 / 35 | 2416 |
| 5 | 4 | 60.8 | 79.4 | 6 / 35 | 1876 |
| 6 | 3 | 60.5 | 78.1 | 5 / 35 | 2049 |
| 7 | 3 | 59.6 | 76.8 | 3 / 35 | 2243 |
| 8 | 5 | 58.1 | 71.1 | 4 / 35 | 2046 |
| 9 | 4 | 58.8 | 72.1 | 4 / 35 | 2226 |
| 10 | 4 | 59.2 | 74.6 | 4 / 35 | 2119 |
| 11 | 4 | 60.2 | 77.5 | 5 / 35 | 2060 |
| 12 | 4 | 58.9 | 73.0 | 4 / 35 | 2158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 9% |
| d414.nano.Quantum 1.0.0 | 72 | 1% |
| djdjdj.NanoSkunk10 1.0 | 29 | 69% |
| gh.nano.Grofvuil 0.2 | 25 | 52% |
| donjezza.Muncho 1.0 | 10 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 75% |
| baal.nano.N 1.42 | 6 | 100% |

Hadur died in 363 of 420 rounds, at a mean tick of 1347. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 140 | 39% | 143 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 97 | 27% | 105 |
| gh.nano.Grofvuil 0.2 | 40 | 11% | 54 |
| djdjdj.NanoSkunk10 1.0 | 35 | 10% | 52 |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 7% | 29 |
| baal.nano.N 1.42 | 11 | 3% | 18 |
| donjezza.Muncho 1.0 | 8 | 2% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 67.6 | 46 / 420 | 3.92 | 11.5% | 19561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 13.4% | 90 |
| mld.DustBunny 3.8 | 3.1 | 12.1% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 3.4 | 12.2% | 76 |
| hadur117.nano.SanaroC3 0.4 | 4.3 | 11.5% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.6 | 11.3% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 5.6 | 10.6% | 40 |
| wee.Gem 1.8.4 | 5.6 | 10.6% | 45 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.7% | 0 |
| tj.zombie1n 1.0.1 | 8.7 | 6.4% | 13 |
| step.nanoPri 1.0 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 51.4 | 60.6 | 2 / 35 | 1172 |
| 2 | 4 | 53.6 | 67.3 | 2 / 35 | 1356 |
| 3 | 5 | 54.2 | 65.7 | 5 / 35 | 1595 |
| 4 | 5 | 54.3 | 65.4 | 3 / 35 | 1551 |
| 5 | 3 | 56.8 | 71.4 | 5 / 35 | 1732 |
| 6 | 2 | 57.0 | 72.4 | 5 / 35 | 1821 |
| 7 | 5 | 54.5 | 64.1 | 4 / 35 | 1880 |
| 8 | 5 | 55.3 | 68.3 | 4 / 35 | 1661 |
| 9 | 4 | 55.3 | 68.3 | 5 / 35 | 1659 |
| 10 | 6 | 53.5 | 65.7 | 2 / 35 | 1569 |
| 11 | 3 | 57.0 | 72.1 | 4 / 35 | 1696 |
| 12 | 3 | 56.4 | 69.8 | 5 / 35 | 1869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 29 | 45% |
| wee.Gem 1.8.4 | 29 | 66% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 0% |
| d414.nano.Quantum 1.0.0 | 22 | 0% |
| mld.DustBunny 3.8 | 17 | 6% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 67% |
| tj.zombie1n 1.0.1 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 374 of 420 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 81 | 22% | 82 |
| d414.nano.Quantum 1.0.0 | 78 | 21% | 81 |
| mld.DustBunny 3.8 | 62 | 17% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 14% | 59 |
| sheldor.melee.nano.TestMelee 0.1 | 49 | 13% | 58 |
| wee.Gem 1.8.4 | 27 | 7% | 45 |
| cs.sheldor.Talon 1.1 | 9 | 2% | 13 |
| step.nanoPri 1.0 | 8 | 2% | 8 |
| tj.zombie1n 1.0.1 | 6 | 2% | 8 |

## Melee bench: F10

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 12 battles (0.4 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 74.0 | 52 / 420 | 3.34 | 12.6% | 27088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.9% | 149 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.3% | 95 |
| mld.Infinity 2.2 | 2.5 | 14.7% | 106 |
| hadur117.nano.SanaroC3 0.4 | 4.0 | 12.6% | 52 |
| robar.nano.Assertive_Melee 0.2 | 5.7 | 8.3% | 4 |
| ayk.WallHugger 1.0 | 6.4 | 7.6% | 2 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 1 |
| conscience.Electron 1.3g | 7.4 | 7.1% | 2 |
| donjezza.Jezza 1.0 | 8.7 | 6.3% | 10 |
| sample.RamFire 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 72.7 | 2 / 35 | 2252 |
| 2 | 4 | 55.0 | 64.4 | 5 / 35 | 2091 |
| 3 | 4 | 60.7 | 81.3 | 5 / 35 | 2204 |
| 4 | 4 | 59.4 | 74.6 | 6 / 35 | 2452 |
| 5 | 4 | 55.9 | 66.7 | 1 / 35 | 2086 |
| 6 | 4 | 59.1 | 77.1 | 3 / 35 | 2134 |
| 7 | 4 | 59.3 | 74.9 | 4 / 35 | 2461 |
| 8 | 4 | 56.6 | 69.5 | 4 / 35 | 1986 |
| 9 | 4 | 60.9 | 80.6 | 6 / 35 | 2541 |
| 10 | 4 | 59.3 | 75.2 | 8 / 35 | 2220 |
| 11 | 4 | 58.8 | 74.6 | 4 / 35 | 2280 |
| 12 | 4 | 59.3 | 75.9 | 4 / 35 | 2381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 63 | 8% |
| mld.Infinity 2.2 | 63 | 57% |
| d414.nano.Quantum 1.0.0 | 53 | 4% |
| donjezza.Jezza 1.0 | 4 | 50% |
| ayk.WallHugger 1.0 | 4 | 100% |
| robar.nano.Assertive_Melee 0.2 | 3 | 33% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 368 of 420 rounds, at a mean tick of 1408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 147 | 40% | 171 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 92 | 25% | 136 |
| mld.Infinity 2.2 | 60 | 16% | 31 |
| robar.nano.Assertive_Melee 0.2 | 23 | 6% | 24 |
| conscience.Electron 1.3g | 16 | 4% | 17 |
| exauge.GateKeeper 1.1.121g | 12 | 3% | 18 |
| ayk.WallHugger 1.0 | 11 | 3% | 14 |
| donjezza.Jezza 1.0 | 7 | 2% | 9 |

## Melee bench: F11

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 77.1 | 75 / 420 | 3.06 | 13.2% | 24677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.3% | 164 |
| hadur117.nano.SanaroC3 0.4 | 2.9 | 13.2% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.4% | 85 |
| oog.melee.Corsair 1.0 | 3.4 | 12.6% | 35 |
| mz.NanoGod 2.02 | 4.7 | 11.5% | 39 |
| DBall.NUKE 0.1 | 6.8 | 7.7% | 10 |
| awesomeness.Elite 1.0 | 7.1 | 7.6% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.5% | 1 |
| sample.Walls 1.0 | 8.8 | 6.2% | 6 |
| stelo.PianistNano 1.2 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 82.5 | 6 / 35 | 2081 |
| 2 | 4 | 56.5 | 69.8 | 3 / 35 | 1941 |
| 3 | 2 | 59.2 | 74.6 | 5 / 35 | 2388 |
| 4 | 3 | 59.3 | 76.2 | 8 / 35 | 2060 |
| 5 | 3 | 59.8 | 79.0 | 4 / 35 | 2069 |
| 6 | 5 | 56.4 | 65.4 | 6 / 35 | 2020 |
| 7 | 2 | 61.7 | 85.7 | 9 / 35 | 1956 |
| 8 | 4 | 58.2 | 74.0 | 4 / 35 | 2065 |
| 9 | 2 | 60.6 | 79.7 | 8 / 35 | 2216 |
| 10 | 3 | 60.4 | 81.3 | 5 / 35 | 1802 |
| 11 | 2 | 59.3 | 78.1 | 5 / 35 | 1958 |
| 12 | 3 | 60.6 | 78.7 | 12 / 35 | 2121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 65 | 8% |
| oog.melee.Corsair 1.0 | 42 | 64% |
| DBall.NUKE 0.1 | 22 | 86% |
| mz.NanoGod 2.02 | 20 | 45% |
| awesomeness.Elite 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 347 of 420 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 141 | 41% | 144 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 86 | 25% | 91 |
| mz.NanoGod 2.02 | 50 | 14% | 58 |
| oog.melee.Corsair 1.0 | 42 | 12% | 72 |
| zyx.nano.BacillusComma 1.0 | 12 | 3% | 16 |
| DBall.NUKE 0.1 | 6 | 2% | 25 |
| awesomeness.Elite 1.0 | 4 | 1% | 7 |
| sample.Walls 1.0 | 3 | 1% | 4 |
| stelo.PianistNano 1.2 | 3 | 1% | 3 |

## Melee bench: F12

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 69.9 | 40 / 420 | 3.71 | 11.8% | 21275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.0% | 169 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 12.9% | 62 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.8% | 46 |
| hadur117.nano.SanaroC3 0.4 | 3.5 | 11.8% | 40 |
| sul.Lunar 1.1 | 4.6 | 10.7% | 42 |
| sam.Samspin 1.0 | 7.3 | 8.2% | 18 |
| maribo.melee.BMV 0.1 | 7.3 | 8.1% | 6 |
| sample.SpinBot 1.0 | 7.7 | 7.9% | 17 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 13 |
| cvt.Firsty 1.0 | 10.0 | 4.7% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.7 | 63.5 | 3 / 35 | 1808 |
| 2 | 3 | 55.4 | 70.5 | 2 / 35 | 1570 |
| 3 | 3 | 56.2 | 69.8 | 7 / 35 | 1715 |
| 4 | 3 | 58.6 | 78.1 | 5 / 35 | 1659 |
| 5 | 2 | 57.7 | 74.0 | 7 / 35 | 1901 |
| 6 | 5 | 53.0 | 61.9 | 2 / 35 | 1591 |
| 7 | 3 | 57.7 | 75.2 | 2 / 35 | 2006 |
| 8 | 2 | 57.7 | 75.9 | 2 / 35 | 1915 |
| 9 | 4 | 53.3 | 64.1 | 2 / 35 | 1623 |
| 10 | 4 | 54.5 | 66.3 | 1 / 35 | 1760 |
| 11 | 4 | 56.4 | 70.2 | 4 / 35 | 1862 |
| 12 | 4 | 56.2 | 69.5 | 3 / 35 | 1865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 5% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 12% |
| sul.Lunar 1.1 | 25 | 44% |
| myl.nano.KomoriNinja 1.1 | 20 | 35% |
| sample.SpinBot 1.0 | 9 | 78% |
| spinnercat.Omen 1.0 | 6 | 67% |
| sam.Samspin 1.0 | 6 | 33% |
| cvt.Firsty 1.0 | 3 | 33% |

Hadur died in 380 of 420 rounds, at a mean tick of 1080. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 139 | 37% | 142 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 78 | 21% | 86 |
| myl.nano.KomoriNinja 1.1 | 42 | 11% | 50 |
| sam.Samspin 1.0 | 32 | 8% | 36 |
| sul.Lunar 1.1 | 24 | 6% | 35 |
| sample.SpinBot 1.0 | 21 | 6% | 26 |
| spinnercat.Omen 1.0 | 17 | 4% | 17 |
| maribo.melee.BMV 0.1 | 14 | 4% | 14 |
| cvt.Firsty 1.0 | 13 | 3% | 14 |

## Melee bench: F13

hadur117.nano.SanaroC3 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v726, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 12 battles (0.6 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 68.7 | 27 / 420 | 3.82 | 11.0% | 17150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.8% | 150 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.6 | 14.5% | 113 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.1% | 67 |
| hadur117.nano.SanaroC3 0.4 | 4.3 | 11.0% | 27 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 18 |
| tvv.nano.Polaris 1.2 | 7.0 | 8.5% | 19 |
| amz.NanoClone 1.41 | 7.3 | 8.2% | 5 |
| zyx.nano.Ant 1.1 | 7.7 | 8.2% | 9 |
| arthord.NanoSatanMelee Beta | 7.9 | 7.9% | 10 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.7 | 70.8 | 1 / 35 | 1306 |
| 2 | 5 | 52.1 | 63.2 | 3 / 35 | 1427 |
| 3 | 4 | 58.4 | 77.8 | 5 / 35 | 1433 |
| 4 | 4 | 56.1 | 73.7 | 2 / 35 | 1340 |
| 5 | 4 | 54.2 | 68.3 | 3 / 35 | 1414 |
| 6 | 4 | 54.2 | 67.9 | 3 / 35 | 1371 |
| 7 | 4 | 55.0 | 68.9 | 1 / 35 | 1608 |
| 8 | 4 | 53.4 | 66.3 | 0 / 35 | 1492 |
| 9 | 4 | 52.9 | 65.7 | 1 / 35 | 1457 |
| 10 | 4 | 54.5 | 69.8 | 1 / 35 | 1446 |
| 11 | 5 | 52.0 | 61.3 | 5 / 35 | 1295 |
| 12 | 5 | 55.3 | 70.2 | 2 / 35 | 1561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 6% |
| d414.nano.Quantum 1.0.0 | 51 | 6% |
| davidalves.net.DuelistNanoMelee 1.01 | 40 | 8% |
| tvv.nano.Polaris 1.2 | 11 | 18% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| mld.Wisdom 1.0 | 6 | 50% |
| zyx.nano.Ant 1.1 | 5 | 60% |
| arthord.MannyPacquiao Beta | 2 | 50% |
| amz.NanoClone 1.41 | 2 | 50% |

Hadur died in 393 of 420 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 105 | 27% | 110 |
| davidalves.net.DuelistNanoMelee 1.01 | 88 | 22% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 84 | 21% | 86 |
| mld.Wisdom 1.0 | 36 | 9% | 42 |
| arthord.NanoSatanMelee Beta | 23 | 6% | 28 |
| amz.NanoClone 1.41 | 20 | 5% | 22 |
| zyx.nano.Ant 1.1 | 19 | 5% | 21 |
| tvv.nano.Polaris 1.2 | 17 | 4% | 19 |
| arthord.MannyPacquiao Beta | 1 | 0% | 0 |

