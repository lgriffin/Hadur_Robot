# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 63.9 | 63 / 350 | 4.25 | 13.0% | 34779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 133 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.8% | 61 |
| hadur117.nano.SanaroS08 0.1 | 3.3 | 13.0% | 63 |
| bzdp.Pansy 2.1 | 3.6 | 11.9% | 38 |
| tvv.nano.Polaris 1.2 | 5.9 | 9.1% | 18 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.1% | 8 |
| zyx.nano.Ant 1.1 | 6.7 | 8.7% | 8 |
| fm.claire 1.7 | 7.2 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.4% | 17 |
| arthord.MannyPacquiao Beta | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 63.8 | 3 / 35 | 3454 |
| 2 | 3 | 60.8 | 68.6 | 10 / 35 | 3431 |
| 3 | 3 | 60.3 | 68.9 | 9 / 35 | 3401 |
| 4 | 3 | 57.2 | 61.0 | 6 / 35 | 3131 |
| 5 | 4 | 57.2 | 60.0 | 3 / 35 | 3187 |
| 6 | 2 | 61.1 | 69.2 | 11 / 35 | 3704 |
| 7 | 4 | 58.2 | 62.2 | 4 / 35 | 3576 |
| 8 | 4 | 55.3 | 55.2 | 2 / 35 | 3465 |
| 9 | 3 | 60.6 | 65.7 | 6 / 35 | 4156 |
| 10 | 4 | 59.3 | 64.1 | 9 / 35 | 3274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 48 | 31% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 68% |
| bzdp.Pansy 2.1 | 18 | 56% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| tvv.nano.Polaris 1.2 | 4 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| fm.claire 1.7 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 291 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 26% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 18% | 80 |
| bzdp.Pansy 2.1 | 47 | 16% | 58 |
| zyx.nano.Ant 1.1 | 33 | 11% | 34 |
| arthord.NanoSatanMelee Beta | 30 | 10% | 31 |
| fm.claire 1.7 | 27 | 9% | 27 |
| tvv.nano.Polaris 1.2 | 18 | 6% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 2% | 6 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 69.9 | 64 / 350 | 3.71 | 13.6% | 30321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.7% | 79 |
| hadur117.nano.SanaroS08 0.1 | 2.7 | 13.6% | 64 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 12.9% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.1% | 42 |
| DBall.Anarchy 0.1 | 4.9 | 10.9% | 52 |
| fm.mammillarias 1.3 | 6.3 | 9.5% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 9.5% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.8% | 7 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 78.1 | 9 / 35 | 3421 |
| 2 | 1 | 62.3 | 74.9 | 7 / 35 | 3134 |
| 3 | 2 | 62.8 | 72.7 | 9 / 35 | 3208 |
| 4 | 1 | 65.0 | 81.0 | 10 / 35 | 3330 |
| 5 | 2 | 62.1 | 75.9 | 7 / 35 | 3245 |
| 6 | 4 | 55.8 | 60.6 | 3 / 35 | 2690 |
| 7 | 2 | 62.9 | 73.3 | 8 / 35 | 3424 |
| 8 | 5 | 56.6 | 59.7 | 4 / 35 | 2582 |
| 9 | 5 | 56.8 | 60.6 | 5 / 35 | 2514 |
| 10 | 4 | 56.9 | 62.5 | 2 / 35 | 2773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 63% |
| d414.nano.Quantum 1.0.0 | 28 | 50% |
| simonton.nano.MeleeSeed 1.8 | 22 | 59% |
| DBall.Anarchy 0.1 | 19 | 32% |
| stelo.SoJNanoMelee 1.1 | 15 | 27% |
| fm.mammillarias 1.3 | 4 | 25% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 287 of 350 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 27% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 17% | 75 |
| simonton.nano.MeleeSeed 1.8 | 48 | 17% | 60 |
| stelo.SoJNanoMelee 1.1 | 40 | 14% | 41 |
| DBall.Anarchy 0.1 | 30 | 10% | 37 |
| fm.mammillarias 1.3 | 22 | 8% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 4% | 13 |
| sample.MyFirstRobot 1.0 | 7 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.7 | 63 / 350 | 4.00 | 13.5% | 38384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.5% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.8% | 50 |
| hadur117.nano.SanaroS08 0.1 | 2.8 | 13.5% | 63 |
| ahf.NanoAndrew .4 | 4.0 | 12.5% | 55 |
| ratosh.Nobo 0.21 | 4.7 | 11.4% | 16 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.2% | 12 |
| stelo.PatternRobot 1.0 | 7.6 | 7.2% | 21 |
| repositorio.NanoStep 1.0 | 7.8 | 6.6% | 14 |
| sample.Crazy 1.0 | 8.7 | 5.7% | 6 |
| kurios.DOSexe .9a | 9.9 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 64.8 | 7 / 35 | 3750 |
| 2 | 2 | 64.5 | 78.7 | 12 / 35 | 4279 |
| 3 | 3 | 58.2 | 61.6 | 6 / 35 | 3842 |
| 4 | 2 | 61.0 | 69.2 | 6 / 35 | 4119 |
| 5 | 3 | 59.3 | 67.3 | 4 / 35 | 3784 |
| 6 | 2 | 59.4 | 68.9 | 3 / 35 | 3869 |
| 7 | 4 | 57.9 | 63.5 | 6 / 35 | 3292 |
| 8 | 2 | 60.2 | 65.4 | 7 / 35 | 3986 |
| 9 | 4 | 59.3 | 65.1 | 6 / 35 | 3745 |
| 10 | 4 | 58.5 | 62.5 | 6 / 35 | 3718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 67% |
| d414.nano.Quantum 1.0.0 | 38 | 32% |
| ahf.NanoAndrew .4 | 17 | 29% |
| ratosh.Nobo 0.21 | 8 | 63% |
| repositorio.NanoStep 1.0 | 8 | 63% |
| timmit.nano.TimDog 0.33 | 8 | 50% |
| stelo.PatternRobot 1.0 | 3 | 0% |
| kurios.DOSexe .9a | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 27% | 92 |
| ahf.NanoAndrew .4 | 66 | 23% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 16% | 76 |
| timmit.nano.TimDog 0.33 | 27 | 9% | 31 |
| ratosh.Nobo 0.21 | 26 | 9% | 33 |
| repositorio.NanoStep 1.0 | 16 | 6% | 21 |
| stelo.PatternRobot 1.0 | 15 | 5% | 15 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| sample.Crazy 1.0 | 5 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 76.7 | 96 / 350 | 3.10 | 16.1% | 52010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 17.4% | 131 |
| hadur117.nano.SanaroS08 0.1 | 2.4 | 16.1% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 15.2% | 59 |
| wompi.Quokka 1.6 | 3.6 | 14.4% | 48 |
| kurios.DOSexe .9b | 5.7 | 7.2% | 3 |
| maribo.FollowFire 1 | 6.4 | 6.9% | 0 |
| sample.VelociRobot 1.0 | 7.4 | 6.5% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.4% | 7 |
| jangs.ns51 1.0 | 8.0 | 6.0% | 3 |
| drd.Dreadknoght 0.9 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 80.0 | 14 / 35 | 5458 |
| 2 | 2 | 67.4 | 83.2 | 9 / 35 | 5683 |
| 3 | 1 | 68.2 | 86.0 | 14 / 35 | 5634 |
| 4 | 2 | 64.3 | 75.2 | 8 / 35 | 4982 |
| 5 | 2 | 65.8 | 77.5 | 12 / 35 | 5225 |
| 6 | 4 | 61.1 | 67.0 | 4 / 35 | 4595 |
| 7 | 2 | 65.9 | 80.6 | 10 / 35 | 5121 |
| 8 | 3 | 63.3 | 69.8 | 9 / 35 | 4725 |
| 9 | 2 | 66.5 | 80.3 | 10 / 35 | 5596 |
| 10 | 4 | 62.3 | 67.0 | 6 / 35 | 4991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 61% |
| wompi.Quokka 1.6 | 28 | 54% |
| sample.VelociRobot 1.0 | 3 | 67% |
| jangs.ns51 1.0 | 3 | 33% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 255 of 350 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 104 | 41% | 142 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 70 | 27% | 113 |
| wompi.Quokka 1.6 | 48 | 19% | 54 |
| maribo.FollowFire 1 | 10 | 4% | 9 |
| kurios.DOSexe .9b | 7 | 3% | 11 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 2% | 8 |
| jangs.ns51 1.0 | 6 | 2% | 7 |
| sample.VelociRobot 1.0 | 3 | 1% | 5 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 70.0 | 76 / 350 | 3.70 | 14.4% | 45399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.7% | 142 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.7% | 57 |
| hadur117.nano.SanaroS08 0.1 | 2.5 | 14.4% | 76 |
| ntc.Opposite 1.5 | 4.2 | 12.1% | 23 |
| js.PinBall 1.6 | 5.1 | 11.3% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.7% | 13 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.6% | 15 |
| sample.Fire 1.0 | 8.4 | 4.6% | 1 |
| PSW.Relentless 0.1 | 8.6 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 64.8 | 7 / 35 | 4430 |
| 2 | 3 | 62.6 | 73.7 | 5 / 35 | 4332 |
| 3 | 3 | 60.3 | 64.4 | 4 / 35 | 4284 |
| 4 | 2 | 64.6 | 75.2 | 11 / 35 | 4796 |
| 5 | 3 | 62.8 | 69.5 | 7 / 35 | 4702 |
| 6 | 2 | 62.2 | 68.3 | 9 / 35 | 4381 |
| 7 | 2 | 63.5 | 74.3 | 9 / 35 | 4708 |
| 8 | 3 | 61.7 | 67.3 | 6 / 35 | 4533 |
| 9 | 2 | 63.7 | 73.0 | 9 / 35 | 4538 |
| 10 | 2 | 63.0 | 69.8 | 9 / 35 | 4695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 77% |
| d414.nano.Quantum 1.0.0 | 44 | 32% |
| sp.Nanos.Ember 1.1 | 12 | 67% |
| ntc.Opposite 1.5 | 10 | 30% |
| js.PinBall 1.6 | 8 | 25% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 274 of 350 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 30% | 101 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 61 | 22% | 103 |
| js.PinBall 1.6 | 47 | 17% | 47 |
| ntc.Opposite 1.5 | 40 | 15% | 45 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 11% | 32 |
| sp.Nanos.Ember 1.1 | 9 | 3% | 16 |
| PSW.Relentless 0.1 | 4 | 1% | 4 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 66.2 | 64 / 350 | 4.05 | 12.9% | 31524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 13.9% | 76 |
| d414.nano.Quantum 1.0.0 | 2.7 | 13.4% | 66 |
| hadur117.nano.SanaroS08 0.1 | 3.3 | 12.9% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.8% | 35 |
| radnor.DoctorBob 1.42 | 4.1 | 12.5% | 57 |
| myl.nano.Graviton 1.10 | 5.5 | 11.0% | 40 |
| stelo.MirrorNano 1.3 | 7.6 | 7.7% | 3 |
| ratosh.Wesco 1.4 | 8.1 | 7.4% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.3% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 68.6 | 9 / 35 | 3442 |
| 2 | 2 | 60.4 | 66.7 | 7 / 35 | 3357 |
| 3 | 4 | 59.1 | 64.8 | 7 / 35 | 3191 |
| 4 | 3 | 59.1 | 67.9 | 6 / 35 | 2786 |
| 5 | 1 | 60.0 | 67.9 | 5 / 35 | 3295 |
| 6 | 1 | 63.9 | 74.3 | 13 / 35 | 3808 |
| 7 | 5 | 56.4 | 58.4 | 5 / 35 | 2897 |
| 8 | 5 | 59.2 | 65.4 | 6 / 35 | 3152 |
| 9 | 4 | 58.8 | 67.0 | 3 / 35 | 2859 |
| 10 | 5 | 56.5 | 60.6 | 3 / 35 | 2737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 33 | 42% |
| d414.nano.Quantum 1.0.0 | 31 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 70% |
| myl.nano.Graviton 1.10 | 15 | 67% |
| radnor.DoctorBob 1.42 | 14 | 57% |
| ratosh.Wesco 1.4 | 4 | 50% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 71 | 25% | 86 |
| radnor.DoctorBob 1.42 | 49 | 17% | 51 |
| d414.nano.Quantum 1.0.0 | 47 | 16% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 14% | 57 |
| myl.nano.Graviton 1.10 | 35 | 12% | 43 |
| ratosh.Wesco 1.4 | 18 | 6% | 23 |
| squidM.TentalceMeleeNano 1.1 | 16 | 6% | 17 |
| stelo.MirrorNano 1.3 | 11 | 4% | 11 |

## Melee bench: F07

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 63.0 | 47 / 350 | 4.33 | 12.5% | 35137 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.2 | 14.0% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.5% | 69 |
| cb.nano.Insomnia 1.0 | 3.5 | 12.7% | 55 |
| hadur117.nano.SanaroS08 0.1 | 3.7 | 12.5% | 47 |
| nz.jdc.nano.GridFu 1.0 | 3.9 | 12.6% | 54 |
| oog.melee.CapuletDroid 1.1 | 5.5 | 11.5% | 33 |
| mz.Cork 0.1 | 6.7 | 10.4% | 16 |
| stelo.UntouchableNano 1.3 | 8.4 | 4.9% | 1 |
| stuff.Vlad 0.1 | 8.6 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.1 | 64.1 | 3 / 35 | 3703 |
| 2 | 3 | 60.3 | 65.7 | 11 / 35 | 3476 |
| 3 | 1 | 60.6 | 67.0 | 6 / 35 | 3808 |
| 4 | 6 | 53.7 | 52.1 | 2 / 35 | 3145 |
| 5 | 2 | 60.3 | 69.5 | 5 / 35 | 3692 |
| 6 | 3 | 59.4 | 66.7 | 4 / 35 | 3729 |
| 7 | 5 | 56.0 | 57.1 | 3 / 35 | 3246 |
| 8 | 5 | 56.9 | 59.4 | 4 / 35 | 3348 |
| 9 | 6 | 57.7 | 62.5 | 2 / 35 | 3441 |
| 10 | 2 | 59.5 | 65.7 | 7 / 35 | 3549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 76% |
| cb.nano.Insomnia 1.0 | 20 | 65% |
| d414.nano.Quantum 1.0.0 | 18 | 28% |
| nz.jdc.nano.GridFu 1.0 | 12 | 33% |
| oog.melee.CapuletDroid 1.1 | 9 | 56% |
| mz.Cork 0.1 | 8 | 50% |

Hadur died in 304 of 350 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 22% | 87 |
| d414.nano.Quantum 1.0.0 | 60 | 20% | 72 |
| nz.jdc.nano.GridFu 1.0 | 49 | 16% | 59 |
| cb.nano.Insomnia 1.0 | 46 | 15% | 37 |
| oog.melee.CapuletDroid 1.1 | 37 | 12% | 46 |
| mz.Cork 0.1 | 32 | 11% | 37 |
| stuff.Vlad 0.1 | 6 | 2% | 6 |
| stelo.UntouchableNano 1.3 | 4 | 1% | 4 |
| sample.TrackFire 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.9 | 64 / 350 | 3.71 | 13.9% | 38416 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.6% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.2% | 57 |
| hadur117.nano.SanaroS08 0.1 | 2.6 | 13.9% | 64 |
| gh.nano.Grofvuil 0.2 | 3.7 | 12.7% | 51 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 10.5% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 10.6% | 41 |
| baal.nano.N 1.42 | 6.7 | 9.6% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.1 | 5.7% | 0 |
| donjezza.Muncho 1.0 | 8.9 | 5.4% | 9 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 68.9 | 7 / 35 | 3711 |
| 2 | 3 | 61.7 | 71.4 | 5 / 35 | 3854 |
| 3 | 2 | 61.6 | 70.2 | 7 / 35 | 3873 |
| 4 | 3 | 61.8 | 68.9 | 8 / 35 | 3951 |
| 5 | 2 | 62.1 | 71.7 | 7 / 35 | 3932 |
| 6 | 2 | 63.0 | 74.0 | 4 / 35 | 4233 |
| 7 | 4 | 59.2 | 64.1 | 5 / 35 | 3494 |
| 8 | 4 | 60.3 | 67.3 | 4 / 35 | 3672 |
| 9 | 1 | 63.4 | 73.3 | 9 / 35 | 4107 |
| 10 | 3 | 61.6 | 69.5 | 8 / 35 | 3589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 60% |
| d414.nano.Quantum 1.0.0 | 36 | 36% |
| djdjdj.NanoSkunk10 1.0 | 16 | 44% |
| gh.nano.Grofvuil 0.2 | 11 | 36% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 57% |
| baal.nano.N 1.42 | 5 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 93 | 32% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 63 | 22% | 94 |
| djdjdj.NanoSkunk10 1.0 | 40 | 14% | 47 |
| gh.nano.Grofvuil 0.2 | 37 | 13% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 25 | 9% | 28 |
| baal.nano.N 1.42 | 20 | 7% | 24 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |
| donjezza.Muncho 1.0 | 3 | 1% | 3 |

## Melee bench: F09

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.9 | 53.7 | 31 / 350 | 5.17 | 10.8% | 28333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.9 | 13.1% | 63 |
| stelo.SoRobotNanoMelee 1.2 | 2.3 | 12.8% | 77 |
| mld.DustBunny 3.8 | 3.1 | 12.3% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 11.4% | 29 |
| hadur117.nano.SanaroS08 0.1 | 4.9 | 10.8% | 31 |
| wee.Gem 1.8.4 | 5.5 | 10.4% | 58 |
| sheldor.melee.nano.TestMelee 0.1 | 5.6 | 10.4% | 27 |
| tj.zombie1n 1.0.1 | 8.4 | 6.8% | 16 |
| cs.sheldor.Talon 1.1 | 8.7 | 6.5% | 1 |
| step.nanoPri 1.0 | 9.9 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.8 | 54.0 | 2 / 35 | 3333 |
| 2 | 7 | 51.4 | 47.9 | 5 / 35 | 2822 |
| 3 | 2 | 56.9 | 64.8 | 6 / 35 | 2706 |
| 4 | 3 | 56.5 | 61.3 | 5 / 35 | 2947 |
| 5 | 5 | 52.3 | 51.7 | 1 / 35 | 2970 |
| 6 | 5 | 55.7 | 59.7 | 1 / 35 | 3144 |
| 7 | 6 | 51.2 | 51.4 | 3 / 35 | 2603 |
| 8 | 7 | 48.1 | 43.2 | 1 / 35 | 2635 |
| 9 | 7 | 46.0 | 40.6 | 2 / 35 | 2369 |
| 10 | 2 | 56.7 | 62.2 | 5 / 35 | 2804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 45% |
| d414.nano.Quantum 1.0.0 | 20 | 35% |
| wee.Gem 1.8.4 | 13 | 23% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 70% |
| mld.DustBunny 3.8 | 9 | 44% |
| cs.sheldor.Talon 1.1 | 1 | 0% |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 319 of 350 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 19% | 72 |
| mld.DustBunny 3.8 | 52 | 16% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 50 | 16% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 13% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 36 | 11% | 38 |
| wee.Gem 1.8.4 | 31 | 10% | 33 |
| cs.sheldor.Talon 1.1 | 22 | 7% | 23 |
| tj.zombie1n 1.0.1 | 15 | 5% | 15 |
| step.nanoPri 1.0 | 12 | 4% | 12 |

## Melee bench: F10

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 70.8 | 69 / 350 | 3.63 | 14.3% | 41271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.2% | 106 |
| mld.Infinity 2.2 | 2.8 | 14.4% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 14.2% | 60 |
| hadur117.nano.SanaroS08 0.1 | 3.2 | 14.3% | 69 |
| robar.nano.Assertive_Melee 0.2 | 5.4 | 8.5% | 4 |
| conscience.Electron 1.3g | 6.7 | 7.7% | 0 |
| ayk.WallHugger 1.0 | 6.8 | 7.4% | 4 |
| exauge.GateKeeper 1.1.121g | 7.3 | 7.1% | 2 |
| donjezza.Jezza 1.0 | 8.8 | 6.3% | 14 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 74.6 | 7 / 35 | 4110 |
| 2 | 2 | 63.1 | 74.0 | 9 / 35 | 4324 |
| 3 | 4 | 59.2 | 66.0 | 4 / 35 | 3844 |
| 4 | 3 | 63.4 | 76.8 | 9 / 35 | 4088 |
| 5 | 4 | 61.5 | 69.8 | 9 / 35 | 3907 |
| 6 | 4 | 59.0 | 64.8 | 4 / 35 | 4145 |
| 7 | 2 | 62.1 | 73.0 | 7 / 35 | 4085 |
| 8 | 3 | 61.6 | 69.5 | 7 / 35 | 4168 |
| 9 | 3 | 63.8 | 73.0 | 9 / 35 | 4622 |
| 10 | 4 | 60.4 | 66.7 | 4 / 35 | 3978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 63% |
| mld.Infinity 2.2 | 37 | 43% |
| donjezza.Jezza 1.0 | 5 | 20% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 34% | 131 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 73 | 26% | 104 |
| mld.Infinity 2.2 | 47 | 17% | 31 |
| robar.nano.Assertive_Melee 0.2 | 20 | 7% | 26 |
| conscience.Electron 1.3g | 16 | 6% | 16 |
| donjezza.Jezza 1.0 | 10 | 4% | 13 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 13 |
| ayk.WallHugger 1.0 | 7 | 2% | 14 |
| sample.RamFire 1.0 | 3 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 65.3 | 68 / 350 | 4.12 | 13.1% | 34184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.1% | 117 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 48 |
| oog.melee.Corsair 1.0 | 3.2 | 12.8% | 55 |
| hadur117.nano.SanaroS08 0.1 | 3.2 | 13.1% | 68 |
| mz.NanoGod 2.02 | 4.7 | 11.0% | 29 |
| DBall.NUKE 0.1 | 7.1 | 7.7% | 11 |
| awesomeness.Elite 1.0 | 7.2 | 7.6% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.6 | 7.5% | 0 |
| sample.Walls 1.0 | 8.2 | 6.8% | 17 |
| stelo.PianistNano 1.2 | 9.9 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 60.3 | 7 / 35 | 2911 |
| 2 | 5 | 55.0 | 55.9 | 4 / 35 | 3154 |
| 3 | 2 | 59.8 | 66.0 | 8 / 35 | 3559 |
| 4 | 4 | 58.3 | 63.5 | 4 / 35 | 3516 |
| 5 | 3 | 59.9 | 67.9 | 7 / 35 | 3361 |
| 6 | 4 | 58.2 | 64.1 | 5 / 35 | 3172 |
| 7 | 1 | 62.9 | 74.3 | 11 / 35 | 3713 |
| 8 | 2 | 62.0 | 74.6 | 8 / 35 | 3618 |
| 9 | 2 | 60.6 | 69.8 | 8 / 35 | 3768 |
| 10 | 5 | 56.3 | 56.8 | 6 / 35 | 3412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 47% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 66% |
| oog.melee.Corsair 1.0 | 15 | 60% |
| DBall.NUKE 0.1 | 8 | 75% |
| sample.Walls 1.0 | 4 | 50% |
| mz.NanoGod 2.02 | 4 | 50% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 282 of 350 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 87 | 31% | 109 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 18% | 77 |
| mz.NanoGod 2.02 | 41 | 15% | 44 |
| oog.melee.Corsair 1.0 | 36 | 13% | 46 |
| zyx.nano.BacillusComma 1.0 | 24 | 9% | 27 |
| DBall.NUKE 0.1 | 16 | 6% | 19 |
| awesomeness.Elite 1.0 | 14 | 5% | 14 |
| sample.Walls 1.0 | 8 | 3% | 9 |
| stelo.PianistNano 1.2 | 4 | 1% | 5 |

## Melee bench: F12

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 60.0 | 40 / 350 | 4.60 | 11.9% | 31638 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.1% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 12.5% | 44 |
| myl.nano.KomoriNinja 1.1 | 3.6 | 11.8% | 41 |
| hadur117.nano.SanaroS08 0.1 | 3.7 | 11.9% | 40 |
| sul.Lunar 1.1 | 4.1 | 11.4% | 47 |
| spinnercat.Omen 1.0 | 6.8 | 8.7% | 19 |
| maribo.melee.BMV 0.1 | 7.2 | 8.4% | 1 |
| sam.Samspin 1.0 | 7.8 | 8.0% | 13 |
| sample.SpinBot 1.0 | 8.1 | 7.7% | 26 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 61.9 | 4 / 35 | 3454 |
| 2 | 4 | 55.7 | 59.0 | 3 / 35 | 3322 |
| 3 | 5 | 53.9 | 54.0 | 4 / 35 | 3020 |
| 4 | 3 | 54.3 | 56.5 | 5 / 35 | 2987 |
| 5 | 4 | 56.1 | 60.0 | 5 / 35 | 3238 |
| 6 | 4 | 56.0 | 60.6 | 1 / 35 | 2926 |
| 7 | 5 | 54.1 | 55.6 | 3 / 35 | 3095 |
| 8 | 4 | 53.1 | 55.6 | 2 / 35 | 2863 |
| 9 | 1 | 61.1 | 72.4 | 8 / 35 | 3332 |
| 10 | 4 | 58.5 | 64.8 | 5 / 35 | 3401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 27% |
| sul.Lunar 1.1 | 21 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 71% |
| myl.nano.KomoriNinja 1.1 | 16 | 31% |
| spinnercat.Omen 1.0 | 7 | 29% |
| sample.SpinBot 1.0 | 5 | 0% |
| sam.Samspin 1.0 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 311 of 350 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 26% | 88 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 19% | 70 |
| myl.nano.KomoriNinja 1.1 | 43 | 14% | 46 |
| sul.Lunar 1.1 | 33 | 11% | 43 |
| spinnercat.Omen 1.0 | 24 | 8% | 25 |
| maribo.melee.BMV 0.1 | 24 | 8% | 24 |
| sam.Samspin 1.0 | 21 | 7% | 23 |
| sample.SpinBot 1.0 | 20 | 6% | 22 |
| cvt.Firsty 1.0 | 8 | 3% | 9 |

## Melee bench: F13

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 65.0 | 71 / 350 | 4.15 | 12.7% | 31902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.3% | 99 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.9 | 14.2% | 82 |
| hadur117.nano.SanaroS08 0.1 | 3.1 | 12.7% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.4% | 32 |
| mld.Wisdom 1.0 | 4.9 | 10.9% | 28 |
| tvv.nano.Polaris 1.2 | 7.2 | 8.4% | 13 |
| amz.NanoClone 1.41 | 7.3 | 8.2% | 11 |
| arthord.NanoSatanMelee Beta | 7.6 | 8.1% | 7 |
| zyx.nano.Ant 1.1 | 7.7 | 7.9% | 7 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 59.4 | 6 / 35 | 3306 |
| 2 | 4 | 56.7 | 60.3 | 7 / 35 | 3045 |
| 3 | 3 | 58.2 | 63.5 | 11 / 35 | 3194 |
| 4 | 2 | 59.8 | 69.8 | 5 / 35 | 3640 |
| 5 | 2 | 59.9 | 70.8 | 7 / 35 | 3319 |
| 6 | 4 | 59.4 | 67.0 | 9 / 35 | 3208 |
| 7 | 3 | 56.8 | 62.5 | 4 / 35 | 3176 |
| 8 | 2 | 61.6 | 74.6 | 11 / 35 | 3186 |
| 9 | 4 | 55.1 | 58.1 | 5 / 35 | 2899 |
| 10 | 4 | 57.6 | 63.8 | 6 / 35 | 2929 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 69% |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 61% |
| mld.Wisdom 1.0 | 5 | 20% |
| arthord.NanoSatanMelee Beta | 4 | 50% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 50% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 279 of 350 rounds, at a mean tick of 594. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 63 | 23% | 79 |
| d414.nano.Quantum 1.0.0 | 58 | 21% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 15% | 70 |
| mld.Wisdom 1.0 | 41 | 15% | 41 |
| amz.NanoClone 1.41 | 28 | 10% | 30 |
| arthord.NanoSatanMelee Beta | 20 | 7% | 20 |
| tvv.nano.Polaris 1.2 | 13 | 5% | 14 |
| zyx.nano.Ant 1.1 | 11 | 4% | 15 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

