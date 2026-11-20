# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 74.1 | 92 / 420 | 3.33 | 13.9% | 35263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.5% | 130 |
| hadur117.nano.SanaroQT 0.4 | 2.1 | 13.9% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.7% | 87 |
| bzdp.Pansy 2.1 | 3.4 | 13.0% | 55 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.5% | 25 |
| arthord.NanoSatanMelee Beta | 6.1 | 9.0% | 9 |
| zyx.nano.Ant 1.1 | 7.1 | 8.3% | 6 |
| fm.claire 1.7 | 7.7 | 7.6% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.6% | 14 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.9 | 70.5 | 6 / 35 | 2737 |
| 2 | 3 | 60.2 | 71.4 | 6 / 35 | 2919 |
| 3 | 2 | 62.5 | 78.7 | 9 / 35 | 2835 |
| 4 | 3 | 61.6 | 75.6 | 8 / 35 | 3147 |
| 5 | 1 | 61.3 | 76.2 | 8 / 35 | 2861 |
| 6 | 2 | 58.2 | 67.6 | 7 / 35 | 2779 |
| 7 | 1 | 61.3 | 76.5 | 6 / 35 | 2954 |
| 8 | 1 | 63.5 | 79.0 | 12 / 35 | 3142 |
| 9 | 4 | 57.9 | 65.1 | 4 / 35 | 2942 |
| 10 | 1 | 60.9 | 74.9 | 10 / 35 | 2757 |
| 11 | 2 | 61.1 | 73.7 | 8 / 35 | 2952 |
| 12 | 2 | 63.4 | 80.3 | 8 / 35 | 3238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 73 | 26% |
| d414.nano.Quantum 1.0.0 | 69 | 26% |
| bzdp.Pansy 2.1 | 45 | 62% |
| tvv.nano.Polaris 1.2 | 14 | 36% |
| ers.nano.hawk.HawkLA 3.0m | 11 | 73% |
| arthord.NanoSatanMelee Beta | 9 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 328 of 420 rounds, at a mean tick of 1254. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 105 | 32% | 125 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 23% | 101 |
| bzdp.Pansy 2.1 | 62 | 19% | 86 |
| zyx.nano.Ant 1.1 | 23 | 7% | 24 |
| arthord.NanoSatanMelee Beta | 20 | 6% | 31 |
| tvv.nano.Polaris 1.2 | 19 | 6% | 21 |
| fm.claire 1.7 | 12 | 4% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 8 | 2% | 17 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 77.0 | 87 / 420 | 3.07 | 14.1% | 32993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 14.6% | 94 |
| hadur117.nano.SanaroQT 0.4 | 2.1 | 14.1% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.4% | 71 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 11.8% | 32 |
| DBall.Anarchy 0.1 | 4.7 | 10.7% | 55 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.3% | 61 |
| fm.mammillarias 1.3 | 6.8 | 9.3% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.4% | 14 |
| rrh.Iwillfindyou 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 82.9 | 9 / 35 | 3075 |
| 2 | 2 | 60.9 | 78.1 | 9 / 35 | 2456 |
| 3 | 2 | 61.1 | 78.4 | 6 / 35 | 2782 |
| 4 | 2 | 62.8 | 81.0 | 9 / 35 | 2877 |
| 5 | 2 | 60.7 | 74.6 | 11 / 35 | 2805 |
| 6 | 3 | 58.8 | 71.4 | 2 / 35 | 2780 |
| 7 | 3 | 60.6 | 76.5 | 8 / 35 | 2637 |
| 8 | 2 | 60.6 | 76.2 | 8 / 35 | 2808 |
| 9 | 2 | 58.9 | 69.8 | 7 / 35 | 2814 |
| 10 | 3 | 61.3 | 78.7 | 5 / 35 | 2775 |
| 11 | 1 | 61.2 | 77.5 | 8 / 35 | 2740 |
| 12 | 2 | 60.4 | 78.4 | 5 / 35 | 2444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 20% |
| DBall.Anarchy 0.1 | 49 | 53% |
| d414.nano.Quantum 1.0.0 | 38 | 16% |
| stelo.SoJNanoMelee 1.1 | 37 | 27% |
| simonton.nano.MeleeSeed 1.8 | 33 | 70% |
| sample.MyFirstRobot 1.0 | 11 | 45% |
| fm.mammillarias 1.3 | 8 | 63% |

Hadur died in 333 of 420 rounds, at a mean tick of 1391. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 26% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 23% | 91 |
| stelo.SoJNanoMelee 1.1 | 50 | 15% | 56 |
| simonton.nano.MeleeSeed 1.8 | 38 | 11% | 57 |
| DBall.Anarchy 0.1 | 36 | 11% | 61 |
| fm.mammillarias 1.3 | 33 | 10% | 35 |
| sample.MyFirstRobot 1.0 | 10 | 3% | 14 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F03

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 71.8 | 66 / 420 | 3.54 | 13.7% | 41647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.3% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.3% | 99 |
| hadur117.nano.SanaroQT 0.4 | 2.8 | 13.7% | 66 |
| ahf.NanoAndrew .4 | 3.8 | 12.4% | 66 |
| ratosh.Nobo 0.21 | 5.0 | 11.1% | 11 |
| timmit.nano.TimDog 0.33 | 6.2 | 9.1% | 15 |
| stelo.PatternRobot 1.0 | 6.8 | 7.8% | 36 |
| repositorio.NanoStep 1.0 | 8.1 | 6.2% | 11 |
| sample.Crazy 1.0 | 8.9 | 5.8% | 5 |
| kurios.DOSexe .9a | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.8 | 77.8 | 6 / 35 | 3340 |
| 2 | 2 | 61.1 | 72.1 | 6 / 35 | 3654 |
| 3 | 3 | 59.2 | 69.2 | 3 / 35 | 3427 |
| 4 | 3 | 61.3 | 76.2 | 4 / 35 | 3536 |
| 5 | 2 | 60.2 | 69.2 | 4 / 35 | 3842 |
| 6 | 2 | 61.3 | 72.7 | 9 / 35 | 3589 |
| 7 | 4 | 58.0 | 66.0 | 3 / 35 | 3347 |
| 8 | 3 | 61.7 | 75.2 | 10 / 35 | 3396 |
| 9 | 3 | 59.1 | 68.6 | 5 / 35 | 3467 |
| 10 | 3 | 58.5 | 69.5 | 4 / 35 | 3006 |
| 11 | 2 | 60.8 | 72.7 | 6 / 35 | 3465 |
| 12 | 3 | 60.8 | 72.4 | 6 / 35 | 3578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 16% |
| d414.nano.Quantum 1.0.0 | 48 | 19% |
| ahf.NanoAndrew .4 | 28 | 64% |
| stelo.PatternRobot 1.0 | 17 | 41% |
| ratosh.Nobo 0.21 | 12 | 83% |
| timmit.nano.TimDog 0.33 | 9 | 44% |
| repositorio.NanoStep 1.0 | 6 | 83% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 355 of 420 rounds, at a mean tick of 1129. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 91 | 26% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 89 | 25% | 104 |
| ahf.NanoAndrew .4 | 53 | 15% | 70 |
| stelo.PatternRobot 1.0 | 43 | 12% | 50 |
| ratosh.Nobo 0.21 | 37 | 10% | 46 |
| timmit.nano.TimDog 0.33 | 26 | 7% | 30 |
| kurios.DOSexe .9a | 7 | 2% | 7 |
| repositorio.NanoStep 1.0 | 6 | 2% | 10 |
| sample.Crazy 1.0 | 3 | 1% | 6 |

## Melee bench: F04

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 79.3 | 87 / 420 | 2.87 | 15.3% | 52060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 17.5% | 150 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.1 | 16.2% | 121 |
| hadur117.nano.SanaroQT 0.4 | 3.0 | 15.3% | 87 |
| wompi.Quokka 1.6 | 3.8 | 14.2% | 49 |
| kurios.DOSexe .9b | 5.6 | 7.3% | 3 |
| maribo.FollowFire 1 | 6.4 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.2 | 6.3% | 4 |
| jangs.ns51 1.0 | 7.3 | 6.3% | 5 |
| sample.VelociRobot 1.0 | 8.6 | 5.6% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 81.6 | 10 / 35 | 4101 |
| 2 | 3 | 65.4 | 82.5 | 11 / 35 | 4310 |
| 3 | 4 | 63.5 | 77.5 | 6 / 35 | 4398 |
| 4 | 4 | 62.6 | 73.7 | 6 / 35 | 4447 |
| 5 | 3 | 61.8 | 72.4 | 5 / 35 | 4339 |
| 6 | 3 | 64.8 | 81.6 | 5 / 35 | 4558 |
| 7 | 3 | 65.3 | 81.9 | 10 / 35 | 4447 |
| 8 | 3 | 64.1 | 79.7 | 7 / 35 | 4524 |
| 9 | 3 | 63.9 | 80.6 | 4 / 35 | 4311 |
| 10 | 3 | 63.7 | 81.0 | 7 / 35 | 3987 |
| 11 | 2 | 62.5 | 75.6 | 9 / 35 | 3998 |
| 12 | 2 | 65.1 | 83.2 | 7 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 110 | 20% |
| d414.nano.Quantum 1.0.0 | 99 | 26% |
| wompi.Quokka 1.6 | 40 | 78% |
| kurios.DOSexe .9b | 6 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| sample.VelociRobot 1.0 | 2 | 50% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 334 of 420 rounds, at a mean tick of 1730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 125 | 37% | 151 |
| d414.nano.Quantum 1.0.0 | 122 | 37% | 163 |
| wompi.Quokka 1.6 | 46 | 14% | 55 |
| maribo.FollowFire 1 | 13 | 4% | 13 |
| jangs.ns51 1.0 | 11 | 3% | 12 |
| kurios.DOSexe .9b | 8 | 2% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 1% | 9 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 76.6 | 72 / 420 | 3.10 | 14.3% | 44697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.8% | 167 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.3% | 109 |
| hadur117.nano.SanaroQT 0.4 | 3.0 | 14.3% | 72 |
| ntc.Opposite 1.5 | 4.1 | 12.5% | 24 |
| js.PinBall 1.6 | 5.3 | 11.0% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.4 | 10.8% | 14 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.3% | 16 |
| PSW.Relentless 0.1 | 8.5 | 4.3% | 0 |
| sample.Fire 1.0 | 8.6 | 4.5% | 1 |
| sample.Target 1.0 | 9.9 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 77.1 | 5 / 35 | 3873 |
| 2 | 3 | 61.9 | 75.6 | 4 / 35 | 3813 |
| 3 | 4 | 62.3 | 76.2 | 5 / 35 | 3750 |
| 4 | 3 | 62.0 | 75.6 | 5 / 35 | 3795 |
| 5 | 2 | 64.3 | 81.0 | 11 / 35 | 3882 |
| 6 | 3 | 62.7 | 77.1 | 6 / 35 | 3916 |
| 7 | 3 | 61.0 | 72.1 | 5 / 35 | 3690 |
| 8 | 4 | 61.0 | 74.9 | 5 / 35 | 3320 |
| 9 | 3 | 62.4 | 76.8 | 7 / 35 | 3725 |
| 10 | 3 | 63.9 | 80.0 | 9 / 35 | 3682 |
| 11 | 2 | 62.8 | 76.5 | 7 / 35 | 3698 |
| 12 | 3 | 61.8 | 76.8 | 3 / 35 | 3553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 98 | 19% |
| d414.nano.Quantum 1.0.0 | 89 | 18% |
| js.PinBall 1.6 | 18 | 67% |
| ntc.Opposite 1.5 | 18 | 72% |
| sp.Nanos.Ember 1.1 | 13 | 62% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 57% |

Hadur died in 350 of 420 rounds, at a mean tick of 1544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 123 | 35% | 141 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 110 | 31% | 131 |
| ntc.Opposite 1.5 | 46 | 13% | 56 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 8% | 33 |
| js.PinBall 1.6 | 28 | 8% | 40 |
| sp.Nanos.Ember 1.1 | 9 | 3% | 14 |
| PSW.Relentless 0.1 | 4 | 1% | 4 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 72.5 | 76 / 420 | 3.47 | 13.3% | 33153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.4 | 13.8% | 80 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.6% | 85 |
| hadur117.nano.SanaroQT 0.4 | 2.6 | 13.3% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.7% | 68 |
| radnor.DoctorBob 1.42 | 3.8 | 12.9% | 60 |
| myl.nano.Graviton 1.10 | 5.9 | 10.5% | 35 |
| squidM.TentalceMeleeNano 1.1 | 7.9 | 7.4% | 4 |
| stelo.MirrorNano 1.3 | 8.0 | 7.5% | 2 |
| ratosh.Wesco 1.4 | 8.1 | 7.5% | 10 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 79.4 | 12 / 35 | 2826 |
| 2 | 2 | 60.1 | 69.8 | 10 / 35 | 2677 |
| 3 | 2 | 61.3 | 76.8 | 8 / 35 | 2629 |
| 4 | 3 | 60.3 | 73.0 | 4 / 35 | 2968 |
| 5 | 2 | 60.7 | 73.7 | 4 / 35 | 2757 |
| 6 | 1 | 62.4 | 76.8 | 6 / 35 | 3141 |
| 7 | 3 | 59.2 | 70.2 | 5 / 35 | 2709 |
| 8 | 2 | 61.7 | 77.5 | 7 / 35 | 2629 |
| 9 | 4 | 59.3 | 68.6 | 7 / 35 | 2634 |
| 10 | 5 | 53.4 | 56.2 | 0 / 35 | 2487 |
| 11 | 2 | 61.3 | 73.7 | 8 / 35 | 2976 |
| 12 | 3 | 60.9 | 74.9 | 5 / 35 | 2720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 22% |
| d414.nano.Quantum 1.0.0 | 46 | 30% |
| kawigi.nano.Lib 1.0 | 42 | 19% |
| radnor.DoctorBob 1.42 | 36 | 61% |
| myl.nano.Graviton 1.10 | 20 | 75% |
| stelo.MirrorNano 1.3 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |

Hadur died in 344 of 420 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 87 | 25% | 98 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 86 | 25% | 99 |
| d414.nano.Quantum 1.0.0 | 64 | 19% | 80 |
| radnor.DoctorBob 1.42 | 53 | 15% | 70 |
| myl.nano.Graviton 1.10 | 22 | 6% | 35 |
| ratosh.Wesco 1.4 | 13 | 4% | 15 |
| stelo.MirrorNano 1.3 | 12 | 3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7 | 2% | 9 |

## Melee bench: F07

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 12 battles (0.1 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 70.8 | 98 / 420 | 3.63 | 13.2% | 35065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.5% | 100 |
| hadur117.nano.SanaroQT 0.4 | 2.5 | 13.2% | 98 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.1% | 79 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.5% | 56 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.7% | 47 |
| oog.melee.CapuletDroid 1.1 | 5.9 | 11.2% | 26 |
| mz.Cork 0.1 | 6.4 | 10.5% | 15 |
| stelo.UntouchableNano 1.3 | 8.3 | 5.3% | 2 |
| stuff.Vlad 0.1 | 8.7 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.1 | 70.5 | 7 / 35 | 2715 |
| 2 | 5 | 56.6 | 61.9 | 6 / 35 | 2699 |
| 3 | 4 | 58.0 | 64.8 | 8 / 35 | 3047 |
| 4 | 3 | 59.2 | 70.5 | 6 / 35 | 2943 |
| 5 | 1 | 61.4 | 75.2 | 9 / 35 | 3043 |
| 6 | 1 | 59.9 | 71.1 | 9 / 35 | 2777 |
| 7 | 4 | 59.3 | 68.3 | 6 / 35 | 3077 |
| 8 | 2 | 60.0 | 70.8 | 10 / 35 | 2916 |
| 9 | 1 | 62.8 | 80.3 | 11 / 35 | 3038 |
| 10 | 3 | 60.5 | 69.2 | 9 / 35 | 3085 |
| 11 | 1 | 59.6 | 70.5 | 10 / 35 | 2782 |
| 12 | 2 | 61.1 | 76.2 | 7 / 35 | 2943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 31% |
| cb.nano.Insomnia 1.0 | 43 | 72% |
| nz.jdc.nano.GridFu 1.0 | 34 | 74% |
| d414.nano.Quantum 1.0.0 | 33 | 15% |
| oog.melee.CapuletDroid 1.1 | 18 | 72% |
| mz.Cork 0.1 | 12 | 83% |

Hadur died in 324 of 420 rounds, at a mean tick of 1168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 93 | 29% | 107 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 22% | 97 |
| cb.nano.Insomnia 1.0 | 53 | 16% | 39 |
| nz.jdc.nano.GridFu 1.0 | 46 | 14% | 80 |
| oog.melee.CapuletDroid 1.1 | 31 | 10% | 54 |
| mz.Cork 0.1 | 16 | 5% | 28 |
| stelo.UntouchableNano 1.3 | 6 | 2% | 8 |
| stuff.Vlad 0.1 | 5 | 2% | 5 |
| sample.TrackFire 1.0 | 1 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 78.2 | 99 / 420 | 2.96 | 14.5% | 38261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 15.3% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.7% | 98 |
| hadur117.nano.SanaroQT 0.4 | 2.3 | 14.5% | 99 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.9% | 47 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 10.7% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 10.2% | 33 |
| baal.nano.N 1.42 | 6.8 | 9.0% | 5 |
| donjezza.Muncho 1.0 | 8.5 | 5.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 81.0 | 10 / 35 | 3435 |
| 2 | 3 | 62.2 | 76.5 | 10 / 35 | 3063 |
| 3 | 3 | 60.5 | 73.3 | 6 / 35 | 2704 |
| 4 | 1 | 65.1 | 85.1 | 12 / 35 | 3358 |
| 5 | 3 | 62.2 | 75.9 | 10 / 35 | 3215 |
| 6 | 2 | 61.8 | 74.3 | 6 / 35 | 3411 |
| 7 | 3 | 62.0 | 77.5 | 9 / 35 | 2915 |
| 8 | 2 | 62.3 | 77.5 | 7 / 35 | 3051 |
| 9 | 2 | 63.8 | 81.9 | 6 / 35 | 3496 |
| 10 | 2 | 62.6 | 78.1 | 9 / 35 | 3046 |
| 11 | 2 | 62.8 | 79.0 | 7 / 35 | 3306 |
| 12 | 3 | 62.8 | 78.7 | 7 / 35 | 3261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 98 | 24% |
| d414.nano.Quantum 1.0.0 | 76 | 30% |
| gh.nano.Grofvuil 0.2 | 31 | 68% |
| djdjdj.NanoSkunk10 1.0 | 28 | 64% |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 70% |
| donjezza.Muncho 1.0 | 5 | 80% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 321 of 420 rounds, at a mean tick of 1468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 119 | 37% | 141 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 110 | 34% | 136 |
| gh.nano.Grofvuil 0.2 | 38 | 12% | 59 |
| djdjdj.NanoSkunk10 1.0 | 19 | 6% | 36 |
| dmh.robocode.robot.RedDwarf 0.4 | 19 | 6% | 25 |
| baal.nano.N 1.42 | 11 | 3% | 13 |
| donjezza.Muncho 1.0 | 3 | 1% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 1% | 2 |

## Melee bench: F09

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 67.0 | 63 / 420 | 3.97 | 12.4% | 29933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.4 | 12.9% | 74 |
| hadur117.nano.SanaroQT 0.4 | 2.8 | 12.4% | 63 |
| mld.DustBunny 3.8 | 3.4 | 11.9% | 52 |
| stelo.SoRobotNanoMelee 1.2 | 3.7 | 12.1% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 11.5% | 57 |
| wee.Gem 1.8.4 | 5.2 | 10.7% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 6.4 | 9.8% | 34 |
| tj.zombie1n 1.0.1 | 8.2 | 7.1% | 22 |
| cs.sheldor.Talon 1.1 | 8.9 | 6.1% | 0 |
| step.nanoPri 1.0 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.1 | 65.4 | 5 / 35 | 2284 |
| 2 | 2 | 58.1 | 70.2 | 5 / 35 | 2803 |
| 3 | 4 | 56.3 | 64.4 | 3 / 35 | 2505 |
| 4 | 3 | 56.7 | 67.6 | 3 / 35 | 2444 |
| 5 | 3 | 58.9 | 70.2 | 10 / 35 | 2355 |
| 6 | 2 | 55.5 | 64.4 | 3 / 35 | 2528 |
| 7 | 3 | 57.0 | 65.1 | 7 / 35 | 2510 |
| 8 | 3 | 57.6 | 70.5 | 3 / 35 | 2360 |
| 9 | 4 | 55.4 | 63.5 | 5 / 35 | 2358 |
| 10 | 2 | 58.2 | 69.2 | 8 / 35 | 2558 |
| 11 | 2 | 58.4 | 69.8 | 7 / 35 | 2591 |
| 12 | 2 | 55.5 | 63.2 | 4 / 35 | 2637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 39 | 51% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 16% |
| d414.nano.Quantum 1.0.0 | 29 | 21% |
| wee.Gem 1.8.4 | 28 | 54% |
| mld.DustBunny 3.8 | 21 | 14% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 73% |
| tj.zombie1n 1.0.1 | 9 | 56% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 361 of 420 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 65 | 18% | 74 |
| d414.nano.Quantum 1.0.0 | 62 | 17% | 74 |
| stelo.SoRobotNanoMelee 1.2 | 62 | 17% | 67 |
| mld.DustBunny 3.8 | 58 | 16% | 68 |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 11% | 47 |
| wee.Gem 1.8.4 | 36 | 10% | 55 |
| tj.zombie1n 1.0.1 | 17 | 5% | 14 |
| cs.sheldor.Talon 1.1 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 8 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 12 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.4 | 93 / 420 | 3.03 | 14.6% | 42262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.4% | 121 |
| hadur117.nano.SanaroQT 0.4 | 2.8 | 14.6% | 93 |
| mld.Infinity 2.2 | 2.8 | 14.7% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 14.3% | 76 |
| robar.nano.Assertive_Melee 0.2 | 6.1 | 7.9% | 2 |
| ayk.WallHugger 1.0 | 6.4 | 7.7% | 2 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 0 |
| conscience.Electron 1.3g | 7.1 | 7.1% | 1 |
| donjezza.Jezza 1.0 | 8.7 | 6.1% | 9 |
| sample.RamFire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 75.9 | 11 / 35 | 3431 |
| 2 | 3 | 62.0 | 77.1 | 5 / 35 | 3433 |
| 3 | 4 | 61.1 | 70.8 | 6 / 35 | 3651 |
| 4 | 2 | 61.3 | 74.3 | 6 / 35 | 3520 |
| 5 | 4 | 61.6 | 75.9 | 5 / 35 | 3409 |
| 6 | 2 | 64.2 | 82.2 | 10 / 35 | 3545 |
| 7 | 3 | 63.2 | 82.2 | 7 / 35 | 3261 |
| 8 | 4 | 60.3 | 73.0 | 6 / 35 | 3295 |
| 9 | 3 | 62.6 | 78.1 | 6 / 35 | 3433 |
| 10 | 1 | 64.9 | 82.2 | 13 / 35 | 3885 |
| 11 | 2 | 63.7 | 79.7 | 9 / 35 | 3723 |
| 12 | 2 | 62.6 | 77.5 | 9 / 35 | 3676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 90 | 52% |
| d414.nano.Quantum 1.0.0 | 70 | 14% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 65 | 26% |
| exauge.GateKeeper 1.1.121g | 7 | 100% |
| ayk.WallHugger 1.0 | 6 | 100% |
| donjezza.Jezza 1.0 | 5 | 60% |
| robar.nano.Assertive_Melee 0.2 | 4 | 50% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 327 of 420 rounds, at a mean tick of 1536. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 126 | 39% | 178 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 89 | 27% | 143 |
| mld.Infinity 2.2 | 65 | 20% | 29 |
| robar.nano.Assertive_Melee 0.2 | 24 | 7% | 30 |
| conscience.Electron 1.3g | 12 | 4% | 14 |
| ayk.WallHugger 1.0 | 5 | 2% | 12 |
| donjezza.Jezza 1.0 | 5 | 2% | 10 |
| exauge.GateKeeper 1.1.121g | 1 | 0% | 4 |

## Melee bench: F11

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 12 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 75.8 | 110 / 420 | 3.18 | 14.3% | 36602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.5% | 120 |
| hadur117.nano.SanaroQT 0.4 | 2.3 | 14.3% | 110 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.5% | 89 |
| oog.melee.Corsair 1.0 | 3.7 | 12.7% | 38 |
| mz.NanoGod 2.02 | 4.8 | 11.3% | 40 |
| DBall.NUKE 0.1 | 6.8 | 7.9% | 12 |
| awesomeness.Elite 1.0 | 6.8 | 7.7% | 5 |
| zyx.nano.BacillusComma 1.0 | 7.6 | 7.0% | 3 |
| sample.Walls 1.0 | 8.8 | 5.8% | 3 |
| stelo.PianistNano 1.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 81.3 | 12 / 35 | 3672 |
| 2 | 4 | 60.4 | 70.5 | 9 / 35 | 2985 |
| 3 | 2 | 63.2 | 79.4 | 11 / 35 | 3227 |
| 4 | 2 | 63.4 | 80.0 | 11 / 35 | 3260 |
| 5 | 3 | 61.1 | 74.9 | 7 / 35 | 2949 |
| 6 | 2 | 62.6 | 81.0 | 10 / 35 | 2922 |
| 7 | 2 | 60.1 | 72.7 | 10 / 35 | 2833 |
| 8 | 2 | 62.6 | 79.4 | 11 / 35 | 3085 |
| 9 | 2 | 59.9 | 73.3 | 7 / 35 | 2838 |
| 10 | 2 | 61.4 | 75.6 | 7 / 35 | 3087 |
| 11 | 3 | 59.4 | 70.2 | 6 / 35 | 2912 |
| 12 | 2 | 59.9 | 71.4 | 9 / 35 | 2832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 34% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 25% |
| oog.melee.Corsair 1.0 | 44 | 82% |
| mz.NanoGod 2.02 | 27 | 48% |
| DBall.NUKE 0.1 | 13 | 92% |
| awesomeness.Elite 1.0 | 5 | 60% |
| sample.Walls 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 312 of 420 rounds, at a mean tick of 1146. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 98 | 31% | 125 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 85 | 27% | 107 |
| mz.NanoGod 2.02 | 50 | 16% | 65 |
| oog.melee.Corsair 1.0 | 38 | 12% | 72 |
| zyx.nano.BacillusComma 1.0 | 14 | 4% | 15 |
| DBall.NUKE 0.1 | 11 | 4% | 18 |
| awesomeness.Elite 1.0 | 11 | 4% | 13 |
| sample.Walls 1.0 | 3 | 1% | 3 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 12 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 71.1 | 71 / 420 | 3.60 | 13.3% | 33308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.4% | 103 |
| hadur117.nano.SanaroQT 0.4 | 2.3 | 13.3% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.0% | 67 |
| sul.Lunar 1.1 | 3.8 | 12.0% | 83 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 11.8% | 44 |
| maribo.melee.BMV 0.1 | 7.0 | 8.1% | 2 |
| spinnercat.Omen 1.0 | 7.3 | 7.8% | 14 |
| sam.Samspin 1.0 | 7.4 | 7.8% | 19 |
| sample.SpinBot 1.0 | 8.3 | 7.3% | 8 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 10 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.4 | 70.2 | 4 / 35 | 2871 |
| 2 | 2 | 58.5 | 68.6 | 6 / 35 | 2868 |
| 3 | 2 | 58.5 | 72.4 | 2 / 35 | 2767 |
| 4 | 2 | 59.1 | 70.5 | 6 / 35 | 3007 |
| 5 | 2 | 62.0 | 79.4 | 8 / 35 | 2801 |
| 6 | 2 | 59.7 | 72.7 | 7 / 35 | 2753 |
| 7 | 3 | 57.9 | 69.2 | 8 / 35 | 2527 |
| 8 | 2 | 60.8 | 75.6 | 6 / 35 | 2784 |
| 9 | 3 | 57.3 | 68.3 | 5 / 35 | 2420 |
| 10 | 1 | 61.0 | 74.6 | 8 / 35 | 3006 |
| 11 | 4 | 56.5 | 61.3 | 5 / 35 | 2949 |
| 12 | 3 | 58.3 | 70.2 | 6 / 35 | 2555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 24% |
| d414.nano.Quantum 1.0.0 | 50 | 16% |
| sul.Lunar 1.1 | 49 | 22% |
| myl.nano.KomoriNinja 1.1 | 26 | 77% |
| sam.Samspin 1.0 | 9 | 44% |
| spinnercat.Omen 1.0 | 7 | 100% |
| sample.SpinBot 1.0 | 7 | 29% |
| cvt.Firsty 1.0 | 6 | 33% |
| maribo.melee.BMV 0.1 | 3 | 100% |

Hadur died in 350 of 420 rounds, at a mean tick of 1278. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 24% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 81 | 23% | 97 |
| sul.Lunar 1.1 | 64 | 18% | 78 |
| myl.nano.KomoriNinja 1.1 | 44 | 13% | 63 |
| sam.Samspin 1.0 | 19 | 5% | 21 |
| sample.SpinBot 1.0 | 18 | 5% | 19 |
| maribo.melee.BMV 0.1 | 17 | 5% | 21 |
| spinnercat.Omen 1.0 | 13 | 4% | 17 |
| cvt.Firsty 1.0 | 9 | 3% | 10 |

## Melee bench: F13

hadur117.nano.SanaroQT 0.4 against 9 opponents at once, 35 rounds per battle, 12 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.30GHz, 4 logical cores, Linux 6.18.44-fc-v653, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 12 battles (0.8 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 69.4 | 47 / 420 | 3.75 | 12.4% | 30717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.5 | 14.7% | 131 |
| d414.nano.Quantum 1.0.0 | 2.2 | 14.3% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.6% | 65 |
| hadur117.nano.SanaroQT 0.4 | 3.6 | 12.4% | 47 |
| mld.Wisdom 1.0 | 4.6 | 11.0% | 17 |
| tvv.nano.Polaris 1.2 | 6.6 | 8.5% | 20 |
| arthord.NanoSatanMelee Beta | 7.6 | 7.8% | 7 |
| zyx.nano.Ant 1.1 | 7.7 | 7.8% | 7 |
| amz.NanoClone 1.41 | 8.2 | 7.8% | 11 |
| arthord.MannyPacquiao Beta | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 66.0 | 6 / 35 | 2285 |
| 2 | 4 | 54.7 | 63.2 | 1 / 35 | 2528 |
| 3 | 4 | 57.0 | 67.0 | 2 / 35 | 2693 |
| 4 | 5 | 58.8 | 71.4 | 5 / 35 | 2434 |
| 5 | 2 | 60.0 | 75.2 | 8 / 35 | 2425 |
| 6 | 4 | 59.4 | 73.3 | 5 / 35 | 2925 |
| 7 | 3 | 59.0 | 73.3 | 5 / 35 | 2532 |
| 8 | 2 | 60.4 | 75.2 | 3 / 35 | 3305 |
| 9 | 4 | 54.2 | 62.9 | 3 / 35 | 2221 |
| 10 | 3 | 60.4 | 75.2 | 3 / 35 | 2891 |
| 11 | 3 | 58.3 | 70.8 | 4 / 35 | 2689 |
| 12 | 5 | 52.6 | 59.4 | 2 / 35 | 1789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 61 | 21% |
| davidalves.net.DuelistNanoMelee 1.01 | 50 | 6% |
| d414.nano.Quantum 1.0.0 | 44 | 16% |
| mld.Wisdom 1.0 | 12 | 83% |
| tvv.nano.Polaris 1.2 | 9 | 11% |
| arthord.NanoSatanMelee Beta | 8 | 88% |
| amz.NanoClone 1.41 | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 67% |

Hadur died in 373 of 420 rounds, at a mean tick of 1132. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 96 | 26% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 84 | 23% | 97 |
| d414.nano.Quantum 1.0.0 | 81 | 22% | 90 |
| mld.Wisdom 1.0 | 34 | 9% | 44 |
| zyx.nano.Ant 1.1 | 21 | 6% | 23 |
| arthord.NanoSatanMelee Beta | 20 | 5% | 23 |
| tvv.nano.Polaris 1.2 | 20 | 5% | 22 |
| amz.NanoClone 1.41 | 15 | 4% | 17 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

