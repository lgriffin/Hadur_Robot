# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.0 | 75 / 350 | 4.06 | 13.2% | 33215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 134 |
| hadur117.nano.SanaroS05 0.1 | 2.7 | 13.2% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.7% | 36 |
| bzdp.Pansy 2.1 | 3.4 | 12.6% | 46 |
| tvv.nano.Polaris 1.2 | 6.0 | 9.5% | 27 |
| arthord.NanoSatanMelee Beta | 6.1 | 9.0% | 6 |
| zyx.nano.Ant 1.1 | 6.6 | 8.7% | 10 |
| fm.claire 1.7 | 7.4 | 8.2% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.6% | 14 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 66.7 | 7 / 35 | 3434 |
| 2 | 3 | 60.0 | 66.3 | 8 / 35 | 3572 |
| 3 | 2 | 63.5 | 75.9 | 14 / 35 | 3696 |
| 4 | 2 | 57.8 | 64.1 | 4 / 35 | 3169 |
| 5 | 2 | 60.4 | 69.8 | 5 / 35 | 3692 |
| 6 | 4 | 57.9 | 62.5 | 8 / 35 | 3173 |
| 7 | 4 | 57.7 | 60.6 | 8 / 35 | 3187 |
| 8 | 2 | 62.5 | 75.9 | 9 / 35 | 3496 |
| 9 | 2 | 57.4 | 62.2 | 8 / 35 | 3030 |
| 10 | 4 | 54.8 | 55.9 | 4 / 35 | 2766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 27% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 90% |
| bzdp.Pansy 2.1 | 14 | 64% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| tvv.nano.Polaris 1.2 | 5 | 40% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 0% |

Hadur died in 275 of 350 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 95 | 35% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 16% | 82 |
| bzdp.Pansy 2.1 | 40 | 15% | 49 |
| arthord.NanoSatanMelee Beta | 28 | 10% | 30 |
| zyx.nano.Ant 1.1 | 22 | 8% | 25 |
| tvv.nano.Polaris 1.2 | 21 | 8% | 22 |
| fm.claire 1.7 | 17 | 6% | 21 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 3% | 12 |
| arthord.MannyPacquiao Beta | 2 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 72.1 | 62 / 350 | 3.51 | 13.9% | 30703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 14.8% | 79 |
| hadur117.nano.SanaroS05 0.1 | 1.9 | 13.9% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.7% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.6 | 12.4% | 50 |
| DBall.Anarchy 0.1 | 4.7 | 11.6% | 66 |
| fm.mammillarias 1.3 | 6.4 | 9.5% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.6 | 9.5% | 51 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.6% | 12 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 72.7 | 7 / 35 | 2964 |
| 2 | 5 | 58.1 | 62.9 | 2 / 35 | 2854 |
| 3 | 1 | 63.8 | 78.7 | 11 / 35 | 3302 |
| 4 | 2 | 60.9 | 71.1 | 7 / 35 | 3084 |
| 5 | 1 | 63.8 | 80.3 | 8 / 35 | 3547 |
| 6 | 1 | 61.5 | 72.4 | 5 / 35 | 2921 |
| 7 | 2 | 59.5 | 67.3 | 4 / 35 | 3023 |
| 8 | 2 | 59.8 | 69.2 | 5 / 35 | 2837 |
| 9 | 2 | 60.9 | 71.1 | 4 / 35 | 3205 |
| 10 | 1 | 61.8 | 74.9 | 9 / 35 | 2966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 32% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 74% |
| simonton.nano.MeleeSeed 1.8 | 24 | 50% |
| stelo.SoJNanoMelee 1.1 | 21 | 43% |
| DBall.Anarchy 0.1 | 20 | 25% |
| sample.MyFirstRobot 1.0 | 5 | 20% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 289 of 350 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 87 | 30% | 102 |
| stelo.SoJNanoMelee 1.1 | 43 | 15% | 44 |
| simonton.nano.MeleeSeed 1.8 | 42 | 15% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 14% | 67 |
| DBall.Anarchy 0.1 | 36 | 12% | 43 |
| fm.mammillarias 1.3 | 24 | 8% | 25 |
| sample.MyFirstRobot 1.0 | 9 | 3% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.2 | 68 / 350 | 3.86 | 13.7% | 38038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 15.4% | 109 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.7% | 47 |
| hadur117.nano.SanaroS05 0.1 | 2.9 | 13.7% | 68 |
| ahf.NanoAndrew .4 | 3.2 | 12.4% | 55 |
| ratosh.Nobo 0.21 | 5.1 | 10.8% | 11 |
| timmit.nano.TimDog 0.33 | 5.9 | 9.5% | 17 |
| stelo.PatternRobot 1.0 | 7.2 | 7.7% | 26 |
| repositorio.NanoStep 1.0 | 8.1 | 6.6% | 13 |
| sample.Crazy 1.0 | 8.8 | 5.7% | 4 |
| kurios.DOSexe .9a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 64.1 | 5 / 35 | 3458 |
| 2 | 1 | 63.6 | 75.9 | 10 / 35 | 4308 |
| 3 | 4 | 61.0 | 70.8 | 6 / 35 | 3616 |
| 4 | 2 | 61.5 | 70.5 | 8 / 35 | 4129 |
| 5 | 4 | 56.6 | 59.0 | 6 / 35 | 3483 |
| 6 | 4 | 56.7 | 61.9 | 3 / 35 | 3484 |
| 7 | 2 | 62.3 | 74.6 | 6 / 35 | 4173 |
| 8 | 2 | 63.9 | 78.4 | 11 / 35 | 4046 |
| 9 | 3 | 59.0 | 64.4 | 7 / 35 | 3831 |
| 10 | 4 | 58.2 | 62.5 | 6 / 35 | 3510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 27% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 81% |
| ahf.NanoAndrew .4 | 25 | 36% |
| timmit.nano.TimDog 0.33 | 11 | 45% |
| repositorio.NanoStep 1.0 | 7 | 43% |
| ratosh.Nobo 0.21 | 7 | 86% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 284 of 350 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 82 | 29% | 93 |
| ahf.NanoAndrew .4 | 61 | 21% | 69 |
| ratosh.Nobo 0.21 | 34 | 12% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 11% | 58 |
| timmit.nano.TimDog 0.33 | 28 | 10% | 35 |
| stelo.PatternRobot 1.0 | 26 | 9% | 27 |
| repositorio.NanoStep 1.0 | 12 | 4% | 16 |
| kurios.DOSexe .9a | 6 | 2% | 7 |
| sample.Crazy 1.0 | 5 | 2% | 5 |

## Melee bench: F04

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 76.7 | 93 / 350 | 3.10 | 15.8% | 50270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 18.2% | 172 |
| hadur117.nano.SanaroS05 0.1 | 2.4 | 15.8% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 14.6% | 30 |
| wompi.Quokka 1.6 | 3.3 | 14.2% | 48 |
| maribo.FollowFire 1 | 6.1 | 7.2% | 0 |
| kurios.DOSexe .9b | 6.2 | 7.0% | 1 |
| jangs.ns51 1.0 | 7.0 | 6.5% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.3% | 4 |
| sample.VelociRobot 1.0 | 8.2 | 5.9% | 2 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.2 | 70.2 | 5 / 35 | 4814 |
| 2 | 1 | 66.6 | 80.6 | 15 / 35 | 5160 |
| 3 | 2 | 68.2 | 85.4 | 13 / 35 | 5609 |
| 4 | 2 | 65.1 | 77.1 | 7 / 35 | 5459 |
| 5 | 2 | 66.0 | 79.4 | 7 / 35 | 5512 |
| 6 | 3 | 62.4 | 69.5 | 10 / 35 | 4578 |
| 7 | 3 | 64.1 | 76.5 | 11 / 35 | 4469 |
| 8 | 2 | 65.3 | 79.4 | 7 / 35 | 5202 |
| 9 | 2 | 65.1 | 79.7 | 12 / 35 | 4647 |
| 10 | 3 | 62.8 | 68.9 | 6 / 35 | 4820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 14% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 82% |
| wompi.Quokka 1.6 | 36 | 58% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 50% |
| kurios.DOSexe .9b | 2 | 100% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 132 | 51% | 150 |
| wompi.Quokka 1.6 | 49 | 19% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 16% | 102 |
| maribo.FollowFire 1 | 11 | 4% | 10 |
| sample.VelociRobot 1.0 | 8 | 3% | 9 |
| jangs.ns51 1.0 | 8 | 3% | 8 |
| kurios.DOSexe .9b | 3 | 1% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 1% | 5 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.8 | 97 / 350 | 3.18 | 15.3% | 45532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.6% | 138 |
| hadur117.nano.SanaroS05 0.1 | 2.0 | 15.3% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.4% | 52 |
| ntc.Opposite 1.5 | 4.2 | 12.3% | 26 |
| js.PinBall 1.6 | 5.4 | 10.8% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.4 | 10.8% | 7 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.4% | 10 |
| sample.Fire 1.0 | 8.3 | 4.7% | 1 |
| PSW.Relentless 0.1 | 8.8 | 4.1% | 0 |
| sample.Target 1.0 | 9.9 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 79.0 | 10 / 35 | 4936 |
| 2 | 2 | 64.0 | 74.3 | 8 / 35 | 4602 |
| 3 | 1 | 63.7 | 75.2 | 11 / 35 | 4495 |
| 4 | 3 | 61.5 | 71.1 | 7 / 35 | 3907 |
| 5 | 2 | 65.2 | 79.0 | 13 / 35 | 4617 |
| 6 | 2 | 63.6 | 72.4 | 9 / 35 | 4683 |
| 7 | 3 | 62.5 | 71.7 | 7 / 35 | 4176 |
| 8 | 1 | 65.1 | 77.1 | 13 / 35 | 4869 |
| 9 | 2 | 63.2 | 74.3 | 9 / 35 | 4332 |
| 10 | 2 | 66.6 | 83.5 | 10 / 35 | 4915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 67 | 85% |
| ntc.Opposite 1.5 | 12 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| js.PinBall 1.6 | 7 | 57% |
| sp.Nanos.Ember 1.1 | 6 | 50% |
| sample.Fire 1.0 | 2 | 50% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 253 of 350 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 104 | 41% | 121 |
| ntc.Opposite 1.5 | 38 | 15% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 15% | 95 |
| simonton.nano.WeekendObsession_Melee 1.0 | 32 | 13% | 37 |
| js.PinBall 1.6 | 23 | 9% | 29 |
| sp.Nanos.Ember 1.1 | 14 | 6% | 19 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| sample.Fire 1.0 | 1 | 0% | 3 |

## Melee bench: F06

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.7 | 53 / 350 | 4.09 | 12.8% | 31957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.3 | 13.6% | 70 |
| d414.nano.Quantum 1.0.0 | 2.5 | 13.6% | 74 |
| radnor.DoctorBob 1.42 | 3.3 | 12.9% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 13.0% | 39 |
| hadur117.nano.SanaroS05 0.1 | 3.7 | 12.8% | 53 |
| myl.nano.Graviton 1.10 | 5.8 | 10.9% | 33 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.8% | 5 |
| ratosh.Wesco 1.4 | 8.2 | 7.6% | 11 |
| stelo.MirrorNano 1.3 | 8.3 | 7.1% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 69.2 | 8 / 35 | 3500 |
| 2 | 5 | 57.9 | 60.3 | 5 / 35 | 3287 |
| 3 | 6 | 55.4 | 55.9 | 2 / 35 | 3148 |
| 4 | 5 | 58.3 | 64.8 | 4 / 35 | 2939 |
| 5 | 1 | 60.8 | 69.5 | 6 / 35 | 3341 |
| 6 | 4 | 59.3 | 66.3 | 4 / 35 | 3171 |
| 7 | 4 | 58.3 | 65.1 | 6 / 35 | 2890 |
| 8 | 5 | 58.5 | 63.5 | 4 / 35 | 3221 |
| 9 | 3 | 60.8 | 69.2 | 6 / 35 | 3236 |
| 10 | 2 | 61.8 | 73.3 | 8 / 35 | 3224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 67% |
| d414.nano.Quantum 1.0.0 | 30 | 23% |
| kawigi.nano.Lib 1.0 | 27 | 33% |
| radnor.DoctorBob 1.42 | 16 | 31% |
| myl.nano.Graviton 1.10 | 12 | 58% |
| ratosh.Wesco 1.4 | 4 | 25% |
| squidM.TentalceMeleeNano 1.1 | 3 | 67% |

Hadur died in 297 of 350 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 23% | 78 |
| d414.nano.Quantum 1.0.0 | 61 | 21% | 66 |
| radnor.DoctorBob 1.42 | 56 | 19% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 15% | 69 |
| myl.nano.Graviton 1.10 | 34 | 11% | 42 |
| squidM.TentalceMeleeNano 1.1 | 16 | 5% | 16 |
| ratosh.Wesco 1.4 | 10 | 3% | 12 |
| stelo.MirrorNano 1.3 | 6 | 2% | 6 |

## Melee bench: F07

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 63.6 | 53 / 350 | 4.28 | 12.5% | 34170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 101 |
| nz.jdc.nano.GridFu 1.0 | 2.8 | 13.1% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.3% | 38 |
| hadur117.nano.SanaroS05 0.1 | 3.6 | 12.5% | 53 |
| cb.nano.Insomnia 1.0 | 4.4 | 11.9% | 41 |
| oog.melee.CapuletDroid 1.1 | 5.9 | 10.7% | 35 |
| mz.Cork 0.1 | 6.5 | 10.4% | 12 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.4% | 2 |
| stuff.Vlad 0.1 | 8.5 | 5.5% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 58.7 | 3 / 35 | 3173 |
| 2 | 3 | 59.0 | 63.2 | 7 / 35 | 3735 |
| 3 | 1 | 62.4 | 74.9 | 11 / 35 | 3633 |
| 4 | 2 | 59.8 | 67.0 | 7 / 35 | 3475 |
| 5 | 4 | 58.2 | 64.8 | 3 / 35 | 3374 |
| 6 | 4 | 58.4 | 63.8 | 7 / 35 | 3509 |
| 7 | 5 | 56.9 | 59.4 | 2 / 35 | 3502 |
| 8 | 4 | 58.3 | 64.4 | 5 / 35 | 3315 |
| 9 | 5 | 54.4 | 56.5 | 3 / 35 | 2966 |
| 10 | 4 | 58.7 | 63.2 | 5 / 35 | 3488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 20% |
| cb.nano.Insomnia 1.0 | 22 | 59% |
| nz.jdc.nano.GridFu 1.0 | 20 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 79% |
| oog.melee.CapuletDroid 1.1 | 10 | 80% |
| mz.Cork 0.1 | 7 | 71% |
| sample.TrackFire 1.0 | 1 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 92 | 31% | 108 |
| nz.jdc.nano.GridFu 1.0 | 52 | 18% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 14% | 57 |
| cb.nano.Insomnia 1.0 | 41 | 14% | 33 |
| oog.melee.CapuletDroid 1.1 | 25 | 8% | 36 |
| mz.Cork 0.1 | 23 | 8% | 29 |
| stuff.Vlad 0.1 | 8 | 3% | 11 |
| stelo.UntouchableNano 1.3 | 8 | 3% | 8 |
| sample.TrackFire 1.0 | 5 | 2% | 5 |

## Melee bench: F08

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 70.6 | 59 / 350 | 3.65 | 13.9% | 38199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.1% | 128 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.1% | 47 |
| hadur117.nano.SanaroS05 0.1 | 2.8 | 13.9% | 59 |
| gh.nano.Grofvuil 0.2 | 3.6 | 12.9% | 58 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.1 | 11.1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.1 | 10.3% | 41 |
| baal.nano.N 1.42 | 6.7 | 9.3% | 6 |
| donjezza.Muncho 1.0 | 8.5 | 5.5% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.1% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 64.8 | 5 / 35 | 3451 |
| 2 | 2 | 62.5 | 74.0 | 7 / 35 | 3704 |
| 3 | 3 | 60.7 | 68.6 | 5 / 35 | 3551 |
| 4 | 3 | 63.0 | 71.7 | 8 / 35 | 4193 |
| 5 | 2 | 61.6 | 71.4 | 5 / 35 | 3907 |
| 6 | 4 | 61.6 | 70.5 | 6 / 35 | 3844 |
| 7 | 3 | 61.8 | 71.1 | 5 / 35 | 3840 |
| 8 | 3 | 62.7 | 72.1 | 4 / 35 | 4194 |
| 9 | 2 | 62.2 | 72.4 | 8 / 35 | 3638 |
| 10 | 2 | 61.8 | 69.5 | 6 / 35 | 3877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 18% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 72% |
| gh.nano.Grofvuil 0.2 | 18 | 22% |
| djdjdj.NanoSkunk10 1.0 | 11 | 45% |
| baal.nano.N 1.42 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |

Hadur died in 291 of 350 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 35% | 111 |
| gh.nano.Grofvuil 0.2 | 61 | 21% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 14% | 75 |
| djdjdj.NanoSkunk10 1.0 | 35 | 12% | 41 |
| dmh.robocode.robot.RedDwarf 0.4 | 28 | 10% | 29 |
| baal.nano.N 1.42 | 15 | 5% | 19 |
| donjezza.Muncho 1.0 | 8 | 3% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 0% | 1 |

## Melee bench: F09

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 59.4 | 47 / 350 | 4.66 | 11.5% | 27389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.4 | 12.6% | 55 |
| mld.DustBunny 3.8 | 3.2 | 12.0% | 37 |
| hadur117.nano.SanaroS05 0.1 | 3.8 | 11.5% | 47 |
| stelo.SoRobotNanoMelee 1.2 | 3.9 | 11.3% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 11.4% | 30 |
| wee.Gem 1.8.4 | 4.2 | 11.4% | 65 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 10.1% | 28 |
| tj.zombie1n 1.0.1 | 8.3 | 7.2% | 20 |
| cs.sheldor.Talon 1.1 | 8.8 | 6.9% | 1 |
| step.nanoPri 1.0 | 9.9 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 56.4 | 62.2 | 6 / 35 | 2998 |
| 2 | 3 | 56.5 | 65.7 | 3 / 35 | 2630 |
| 3 | 4 | 52.3 | 55.2 | 3 / 35 | 2481 |
| 4 | 4 | 53.8 | 57.5 | 4 / 35 | 2643 |
| 5 | 2 | 55.7 | 61.0 | 5 / 35 | 2998 |
| 6 | 6 | 54.9 | 56.2 | 7 / 35 | 2844 |
| 7 | 5 | 54.9 | 58.4 | 5 / 35 | 2801 |
| 8 | 1 | 58.1 | 65.1 | 7 / 35 | 3094 |
| 9 | 6 | 52.4 | 56.5 | 3 / 35 | 2330 |
| 10 | 6 | 52.9 | 55.9 | 4 / 35 | 2570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 19 | 53% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 33% |
| mld.DustBunny 3.8 | 18 | 61% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 87% |
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 43% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 17% | 56 |
| mld.DustBunny 3.8 | 51 | 17% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 48 | 16% | 51 |
| wee.Gem 1.8.4 | 37 | 12% | 47 |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 12% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 11% | 47 |
| cs.sheldor.Talon 1.1 | 22 | 7% | 22 |
| tj.zombie1n 1.0.1 | 13 | 4% | 13 |
| step.nanoPri 1.0 | 11 | 4% | 11 |

## Melee bench: F10

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.3 | 72 / 350 | 3.49 | 14.5% | 41035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 15.6% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.9% | 62 |
| hadur117.nano.SanaroS05 0.1 | 2.8 | 14.5% | 72 |
| mld.Infinity 2.2 | 3.0 | 14.6% | 100 |
| robar.nano.Assertive_Melee 0.2 | 6.1 | 7.9% | 3 |
| conscience.Electron 1.3g | 6.7 | 7.6% | 1 |
| ayk.WallHugger 1.0 | 6.8 | 7.4% | 3 |
| exauge.GateKeeper 1.1.121g | 7.1 | 7.5% | 0 |
| donjezza.Jezza 1.0 | 8.3 | 6.4% | 12 |
| sample.RamFire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.5 | 70.2 | 2 / 35 | 3977 |
| 2 | 4 | 62.0 | 72.1 | 9 / 35 | 3812 |
| 3 | 1 | 64.9 | 78.4 | 8 / 35 | 4865 |
| 4 | 1 | 63.5 | 75.2 | 10 / 35 | 4486 |
| 5 | 4 | 57.1 | 59.0 | 3 / 35 | 3531 |
| 6 | 3 | 62.6 | 73.0 | 9 / 35 | 4070 |
| 7 | 4 | 61.0 | 71.4 | 6 / 35 | 3326 |
| 8 | 4 | 60.8 | 69.5 | 6 / 35 | 3900 |
| 9 | 1 | 63.7 | 75.9 | 9 / 35 | 4539 |
| 10 | 2 | 65.1 | 78.1 | 10 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 79% |
| d414.nano.Quantum 1.0.0 | 39 | 10% |
| mld.Infinity 2.2 | 37 | 57% |
| ayk.WallHugger 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 4 | 50% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 278 of 350 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 97 | 35% | 119 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 75 | 27% | 127 |
| mld.Infinity 2.2 | 40 | 14% | 26 |
| conscience.Electron 1.3g | 22 | 8% | 24 |
| robar.nano.Assertive_Melee 0.2 | 22 | 8% | 23 |
| ayk.WallHugger 1.0 | 8 | 3% | 12 |
| exauge.GateKeeper 1.1.121g | 7 | 3% | 8 |
| donjezza.Jezza 1.0 | 6 | 2% | 10 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 66.9 | 73 / 350 | 3.98 | 13.3% | 33389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.5% | 106 |
| hadur117.nano.SanaroS05 0.1 | 2.7 | 13.3% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 48 |
| oog.melee.Corsair 1.0 | 3.3 | 12.4% | 45 |
| mz.NanoGod 2.02 | 4.7 | 11.5% | 37 |
| awesomeness.Elite 1.0 | 6.8 | 7.9% | 8 |
| DBall.NUKE 0.1 | 7.1 | 8.0% | 16 |
| zyx.nano.BacillusComma 1.0 | 7.9 | 7.5% | 1 |
| sample.Walls 1.0 | 8.2 | 6.7% | 16 |
| stelo.PianistNano 1.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.5 | 65.4 | 7 / 35 | 3268 |
| 2 | 3 | 59.2 | 67.9 | 7 / 35 | 3198 |
| 3 | 3 | 58.9 | 67.0 | 8 / 35 | 3003 |
| 4 | 2 | 57.2 | 61.6 | 6 / 35 | 3319 |
| 5 | 4 | 57.4 | 59.7 | 9 / 35 | 3427 |
| 6 | 2 | 62.8 | 75.9 | 12 / 35 | 3496 |
| 7 | 2 | 60.6 | 70.5 | 6 / 35 | 3442 |
| 8 | 2 | 60.1 | 69.8 | 6 / 35 | 3495 |
| 9 | 5 | 56.0 | 57.8 | 6 / 35 | 3146 |
| 10 | 2 | 61.4 | 73.7 | 6 / 35 | 3595 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 46 | 35% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 66% |
| oog.melee.Corsair 1.0 | 21 | 71% |
| mz.NanoGod 2.02 | 14 | 43% |
| DBall.NUKE 0.1 | 12 | 58% |
| sample.Walls 1.0 | 7 | 57% |
| zyx.nano.BacillusComma 1.0 | 3 | 67% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 279 of 350 rounds, at a mean tick of 664. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 79 | 28% | 95 |
| mz.NanoGod 2.02 | 53 | 19% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 18% | 73 |
| oog.melee.Corsair 1.0 | 31 | 11% | 49 |
| zyx.nano.BacillusComma 1.0 | 20 | 7% | 20 |
| DBall.NUKE 0.1 | 15 | 5% | 21 |
| awesomeness.Elite 1.0 | 14 | 5% | 15 |
| sample.Walls 1.0 | 12 | 4% | 13 |
| stelo.PianistNano 1.2 | 5 | 2% | 5 |

## Melee bench: F12

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 65.3 | 50 / 350 | 4.12 | 12.9% | 32544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 14.8% | 119 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.0% | 44 |
| hadur117.nano.SanaroS05 0.1 | 2.8 | 12.9% | 50 |
| sul.Lunar 1.1 | 4.1 | 11.5% | 52 |
| myl.nano.KomoriNinja 1.1 | 4.4 | 11.2% | 35 |
| sam.Samspin 1.0 | 7.4 | 8.2% | 14 |
| maribo.melee.BMV 0.1 | 7.4 | 8.3% | 4 |
| spinnercat.Omen 1.0 | 7.6 | 7.8% | 17 |
| sample.SpinBot 1.0 | 7.6 | 7.6% | 10 |
| cvt.Firsty 1.0 | 10.0 | 4.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 61.6 | 5 / 35 | 3297 |
| 2 | 3 | 55.2 | 59.4 | 2 / 35 | 2959 |
| 3 | 2 | 58.8 | 66.3 | 6 / 35 | 3317 |
| 4 | 2 | 57.4 | 63.5 | 4 / 35 | 3231 |
| 5 | 3 | 57.5 | 64.1 | 5 / 35 | 3128 |
| 6 | 3 | 59.1 | 67.9 | 6 / 35 | 3263 |
| 7 | 2 | 60.6 | 71.4 | 6 / 35 | 3475 |
| 8 | 5 | 56.3 | 62.9 | 2 / 35 | 3103 |
| 9 | 1 | 60.7 | 69.8 | 10 / 35 | 3604 |
| 10 | 3 | 58.7 | 66.3 | 4 / 35 | 3167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 74% |
| d414.nano.Quantum 1.0.0 | 32 | 16% |
| sul.Lunar 1.1 | 31 | 35% |
| myl.nano.KomoriNinja 1.1 | 7 | 57% |
| sample.SpinBot 1.0 | 6 | 33% |
| cvt.Firsty 1.0 | 3 | 0% |
| spinnercat.Omen 1.0 | 3 | 33% |
| sam.Samspin 1.0 | 3 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 94 | 31% | 98 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 18% | 80 |
| myl.nano.KomoriNinja 1.1 | 33 | 11% | 38 |
| sul.Lunar 1.1 | 32 | 11% | 42 |
| sam.Samspin 1.0 | 24 | 8% | 25 |
| sample.SpinBot 1.0 | 22 | 7% | 22 |
| maribo.melee.BMV 0.1 | 19 | 6% | 19 |
| spinnercat.Omen 1.0 | 15 | 5% | 17 |
| cvt.Firsty 1.0 | 9 | 3% | 9 |

## Melee bench: F13

hadur117.nano.SanaroS05 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 65.1 | 57 / 350 | 4.14 | 12.4% | 29956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.3 | 14.6% | 105 |
| d414.nano.Quantum 1.0.0 | 1.9 | 14.1% | 94 |
| hadur117.nano.SanaroS05 0.1 | 3.4 | 12.4% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.5% | 35 |
| mld.Wisdom 1.0 | 5.1 | 10.3% | 18 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.5% | 17 |
| zyx.nano.Ant 1.1 | 7.4 | 8.4% | 13 |
| arthord.NanoSatanMelee Beta | 7.5 | 8.0% | 6 |
| amz.NanoClone 1.41 | 7.6 | 8.2% | 5 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.5 | 56.5 | 4 / 35 | 2706 |
| 2 | 3 | 57.7 | 64.8 | 7 / 35 | 3088 |
| 3 | 4 | 56.8 | 64.1 | 6 / 35 | 2623 |
| 4 | 3 | 59.7 | 70.8 | 6 / 35 | 3071 |
| 5 | 3 | 58.8 | 66.7 | 5 / 35 | 3336 |
| 6 | 2 | 59.5 | 69.5 | 8 / 35 | 3065 |
| 7 | 4 | 56.6 | 63.5 | 6 / 35 | 2731 |
| 8 | 4 | 56.6 | 62.2 | 6 / 35 | 2975 |
| 9 | 3 | 57.8 | 65.7 | 4 / 35 | 2920 |
| 10 | 3 | 59.3 | 67.3 | 5 / 35 | 3441 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 19% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 81% |
| d414.nano.Quantum 1.0.0 | 33 | 21% |
| mld.Wisdom 1.0 | 8 | 38% |
| zyx.nano.Ant 1.1 | 6 | 67% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 4 | 75% |

Hadur died in 295 of 350 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 72 | 24% | 80 |
| d414.nano.Quantum 1.0.0 | 70 | 24% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 15% | 73 |
| mld.Wisdom 1.0 | 31 | 11% | 35 |
| arthord.NanoSatanMelee Beta | 28 | 9% | 29 |
| zyx.nano.Ant 1.1 | 17 | 6% | 18 |
| tvv.nano.Polaris 1.2 | 15 | 5% | 17 |
| amz.NanoClone 1.41 | 15 | 5% | 15 |
| arthord.MannyPacquiao Beta | 4 | 1% | 4 |

