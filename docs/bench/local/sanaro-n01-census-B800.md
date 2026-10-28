# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 63.3 | 58 / 350 | 4.31 | 12.8% | 35074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.3% | 138 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.5% | 50 |
| hadur117.nano.SanaroB800 0.1 | 3.1 | 12.8% | 58 |
| bzdp.Pansy 2.1 | 3.2 | 12.5% | 41 |
| tvv.nano.Polaris 1.2 | 6.1 | 9.1% | 23 |
| arthord.NanoSatanMelee Beta | 6.3 | 9.3% | 12 |
| zyx.nano.Ant 1.1 | 6.7 | 8.8% | 12 |
| fm.claire 1.7 | 6.9 | 8.3% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.4% | 15 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 57.8 | 6 / 35 | 3540 |
| 2 | 2 | 60.1 | 67.3 | 7 / 35 | 3626 |
| 3 | 2 | 59.3 | 65.1 | 9 / 35 | 3467 |
| 4 | 4 | 57.3 | 60.0 | 4 / 35 | 3303 |
| 5 | 4 | 60.1 | 65.7 | 7 / 35 | 3687 |
| 6 | 3 | 59.3 | 66.3 | 3 / 35 | 3417 |
| 7 | 4 | 54.4 | 54.6 | 2 / 35 | 3163 |
| 8 | 3 | 59.6 | 65.4 | 7 / 35 | 3536 |
| 9 | 2 | 61.1 | 68.9 | 6 / 35 | 3873 |
| 10 | 3 | 58.3 | 61.6 | 7 / 35 | 3462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 70% |
| d414.nano.Quantum 1.0.0 | 29 | 14% |
| bzdp.Pansy 2.1 | 15 | 53% |
| arthord.NanoSatanMelee Beta | 11 | 73% |
| tvv.nano.Polaris 1.2 | 8 | 38% |
| fm.claire 1.7 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 33% |
| zyx.nano.Ant 1.1 | 3 | 33% |

Hadur died in 294 of 350 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 90 | 31% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 16% | 74 |
| bzdp.Pansy 2.1 | 47 | 16% | 56 |
| zyx.nano.Ant 1.1 | 31 | 11% | 32 |
| arthord.NanoSatanMelee Beta | 25 | 9% | 28 |
| fm.claire 1.7 | 20 | 7% | 25 |
| tvv.nano.Polaris 1.2 | 20 | 7% | 23 |
| ers.nano.hawk.HawkLA 3.0m | 12 | 4% | 14 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.4 | 49 / 350 | 4.02 | 13.1% | 31783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 99 |
| simonton.nano.MeleeSeed 1.8 | 2.9 | 13.0% | 56 |
| hadur117.nano.SanaroB800 0.1 | 3.2 | 13.1% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.5% | 31 |
| DBall.Anarchy 0.1 | 4.3 | 11.6% | 60 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 9.5% | 39 |
| fm.mammillarias 1.3 | 6.6 | 9.2% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 7.8% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.5% | 11 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 68.9 | 3 / 35 | 3589 |
| 2 | 3 | 60.8 | 70.2 | 6 / 35 | 3082 |
| 3 | 2 | 61.3 | 70.8 | 6 / 35 | 3206 |
| 4 | 3 | 61.0 | 70.8 | 5 / 35 | 3277 |
| 5 | 4 | 58.0 | 61.6 | 4 / 35 | 3123 |
| 6 | 5 | 58.2 | 62.5 | 3 / 35 | 2973 |
| 7 | 3 | 60.6 | 66.3 | 8 / 35 | 3188 |
| 8 | 2 | 61.3 | 71.1 | 8 / 35 | 3222 |
| 9 | 3 | 60.1 | 66.0 | 4 / 35 | 3336 |
| 10 | 5 | 55.4 | 56.2 | 2 / 35 | 2787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 25% |
| simonton.nano.MeleeSeed 1.8 | 24 | 50% |
| DBall.Anarchy 0.1 | 23 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 73% |
| stelo.SoJNanoMelee 1.1 | 12 | 58% |
| sample.MyFirstRobot 1.0 | 3 | 33% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 28% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 19% | 68 |
| simonton.nano.MeleeSeed 1.8 | 45 | 15% | 56 |
| DBall.Anarchy 0.1 | 35 | 12% | 46 |
| stelo.SoJNanoMelee 1.1 | 31 | 10% | 35 |
| fm.mammillarias 1.3 | 27 | 9% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 15 | 5% | 14 |
| sample.MyFirstRobot 1.0 | 7 | 2% | 9 |

## Melee bench: F03

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 64.7 | 55 / 350 | 4.17 | 13.3% | 40628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.1% | 128 |
| hadur117.nano.SanaroB800 0.1 | 2.6 | 13.3% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.5% | 38 |
| ahf.NanoAndrew .4 | 3.9 | 12.2% | 60 |
| ratosh.Nobo 0.21 | 4.6 | 11.3% | 19 |
| timmit.nano.TimDog 0.33 | 5.8 | 9.5% | 12 |
| stelo.PatternRobot 1.0 | 7.3 | 7.4% | 16 |
| repositorio.NanoStep 1.0 | 8.0 | 6.4% | 14 |
| sample.Crazy 1.0 | 8.7 | 5.9% | 8 |
| kurios.DOSexe .9a | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 60.3 | 2 / 35 | 4025 |
| 2 | 2 | 59.8 | 64.8 | 7 / 35 | 4069 |
| 3 | 1 | 63.9 | 76.5 | 9 / 35 | 4454 |
| 4 | 3 | 57.8 | 61.9 | 2 / 35 | 3859 |
| 5 | 3 | 59.2 | 63.5 | 6 / 35 | 3839 |
| 6 | 4 | 58.4 | 60.6 | 4 / 35 | 4011 |
| 7 | 2 | 59.7 | 63.5 | 6 / 35 | 4277 |
| 8 | 2 | 59.1 | 65.7 | 6 / 35 | 3955 |
| 9 | 2 | 61.2 | 67.0 | 10 / 35 | 4115 |
| 10 | 3 | 58.6 | 63.5 | 3 / 35 | 4024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 41 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 76% |
| ahf.NanoAndrew .4 | 16 | 44% |
| ratosh.Nobo 0.21 | 11 | 73% |
| stelo.PatternRobot 1.0 | 7 | 71% |
| repositorio.NanoStep 1.0 | 4 | 0% |
| timmit.nano.TimDog 0.33 | 3 | 33% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 27% | 91 |
| ahf.NanoAndrew .4 | 62 | 21% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 15% | 71 |
| ratosh.Nobo 0.21 | 34 | 11% | 40 |
| stelo.PatternRobot 1.0 | 28 | 9% | 31 |
| timmit.nano.TimDog 0.33 | 25 | 8% | 29 |
| repositorio.NanoStep 1.0 | 11 | 4% | 12 |
| kurios.DOSexe .9a | 6 | 2% | 6 |
| sample.Crazy 1.0 | 4 | 1% | 4 |

## Melee bench: F04

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.6 | 77 / 350 | 3.20 | 15.8% | 52532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.4% | 134 |
| hadur117.nano.SanaroB800 0.1 | 2.3 | 15.8% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 15.0% | 53 |
| wompi.Quokka 1.6 | 3.3 | 14.9% | 69 |
| kurios.DOSexe .9b | 5.9 | 6.9% | 0 |
| maribo.FollowFire 1 | 6.2 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.6 | 6.5% | 9 |
| sample.VelociRobot 1.0 | 7.6 | 6.1% | 3 |
| jangs.ns51 1.0 | 7.7 | 6.1% | 5 |
| drd.Dreadknoght 0.9 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 78.4 | 9 / 35 | 5528 |
| 2 | 4 | 63.2 | 73.0 | 6 / 35 | 4801 |
| 3 | 2 | 66.3 | 79.4 | 10 / 35 | 5265 |
| 4 | 2 | 63.8 | 70.2 | 6 / 35 | 5515 |
| 5 | 3 | 64.1 | 74.9 | 6 / 35 | 5006 |
| 6 | 2 | 65.6 | 79.4 | 7 / 35 | 5204 |
| 7 | 2 | 64.2 | 73.7 | 11 / 35 | 4941 |
| 8 | 2 | 64.0 | 73.3 | 5 / 35 | 5274 |
| 9 | 2 | 65.9 | 77.8 | 12 / 35 | 5591 |
| 10 | 2 | 64.7 | 75.6 | 5 / 35 | 5407 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 61% |
| d414.nano.Quantum 1.0.0 | 57 | 35% |
| wompi.Quokka 1.6 | 27 | 56% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 60% |
| sample.VelociRobot 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 33% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 274 of 350 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 119 | 43% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 66 | 24% | 104 |
| wompi.Quokka 1.6 | 56 | 20% | 66 |
| sample.MyFirstJuniorRobot 1.0 | 9 | 3% | 11 |
| maribo.FollowFire 1 | 6 | 2% | 6 |
| sample.VelociRobot 1.0 | 5 | 2% | 8 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| kurios.DOSexe .9b | 4 | 1% | 6 |
| drd.Dreadknoght 0.9 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 73.4 | 83 / 350 | 3.39 | 15.0% | 46284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.4% | 161 |
| hadur117.nano.SanaroB800 0.1 | 2.1 | 15.0% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.9% | 44 |
| ntc.Opposite 1.5 | 4.1 | 12.3% | 20 |
| js.PinBall 1.6 | 5.0 | 11.1% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 10.3% | 12 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.3% | 4 |
| PSW.Relentless 0.1 | 8.5 | 4.8% | 0 |
| sample.Fire 1.0 | 8.6 | 4.6% | 3 |
| sample.Target 1.0 | 9.9 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.9 | 15 / 35 | 5088 |
| 2 | 2 | 64.2 | 76.8 | 7 / 35 | 4786 |
| 3 | 2 | 65.6 | 77.1 | 11 / 35 | 5008 |
| 4 | 2 | 62.3 | 70.5 | 5 / 35 | 4546 |
| 5 | 2 | 62.4 | 69.8 | 7 / 35 | 4664 |
| 6 | 2 | 63.6 | 74.0 | 11 / 35 | 4455 |
| 7 | 2 | 64.1 | 75.9 | 7 / 35 | 4606 |
| 8 | 3 | 62.6 | 70.2 | 9 / 35 | 4469 |
| 9 | 2 | 62.5 | 70.5 | 7 / 35 | 4676 |
| 10 | 3 | 60.3 | 67.3 | 4 / 35 | 3986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 69% |
| ntc.Opposite 1.5 | 14 | 79% |
| sp.Nanos.Ember 1.1 | 13 | 92% |
| js.PinBall 1.6 | 12 | 33% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 75% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 270 of 350 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 98 | 36% | 121 |
| ntc.Opposite 1.5 | 52 | 19% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 14% | 71 |
| js.PinBall 1.6 | 37 | 14% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 33 | 12% | 41 |
| sp.Nanos.Ember 1.1 | 7 | 3% | 12 |
| PSW.Relentless 0.1 | 4 | 1% | 4 |
| sample.Fire 1.0 | 1 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 64.5 | 43 / 350 | 4.20 | 12.7% | 34353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.7% | 94 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.8% | 77 |
| radnor.DoctorBob 1.42 | 3.5 | 12.8% | 56 |
| hadur117.nano.SanaroB800 0.1 | 3.8 | 12.7% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 32 |
| myl.nano.Graviton 1.10 | 5.9 | 10.5% | 36 |
| ratosh.Wesco 1.4 | 7.8 | 7.6% | 9 |
| stelo.MirrorNano 1.3 | 7.9 | 7.5% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.3% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 66.0 | 5 / 35 | 3664 |
| 2 | 4 | 59.2 | 63.5 | 5 / 35 | 3427 |
| 3 | 4 | 58.9 | 64.1 | 6 / 35 | 3178 |
| 4 | 4 | 59.4 | 64.1 | 4 / 35 | 3662 |
| 5 | 3 | 60.9 | 68.6 | 3 / 35 | 3697 |
| 6 | 5 | 57.8 | 60.0 | 3 / 35 | 3423 |
| 7 | 3 | 60.1 | 68.6 | 3 / 35 | 3494 |
| 8 | 4 | 57.7 | 61.3 | 4 / 35 | 3129 |
| 9 | 5 | 58.4 | 61.6 | 5 / 35 | 3444 |
| 10 | 4 | 59.8 | 67.0 | 5 / 35 | 3235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 23% |
| kawigi.nano.Lib 1.0 | 26 | 19% |
| radnor.DoctorBob 1.42 | 23 | 39% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 71% |
| myl.nano.Graviton 1.10 | 16 | 44% |
| ratosh.Wesco 1.4 | 4 | 25% |

Hadur died in 307 of 350 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 22% | 74 |
| d414.nano.Quantum 1.0.0 | 63 | 21% | 70 |
| radnor.DoctorBob 1.42 | 46 | 15% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 14% | 57 |
| myl.nano.Graviton 1.10 | 37 | 12% | 42 |
| ratosh.Wesco 1.4 | 21 | 7% | 22 |
| stelo.MirrorNano 1.3 | 19 | 6% | 19 |
| squidM.TentalceMeleeNano 1.1 | 11 | 4% | 11 |

## Melee bench: F07

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 64.9 | 50 / 350 | 4.16 | 13.0% | 37578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 14.6% | 85 |
| hadur117.nano.SanaroB800 0.1 | 2.7 | 13.0% | 50 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 13.3% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 53 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.8% | 43 |
| oog.melee.CapuletDroid 1.1 | 6.1 | 10.8% | 27 |
| mz.Cork 0.1 | 6.3 | 10.1% | 14 |
| stelo.UntouchableNano 1.3 | 8.4 | 5.1% | 0 |
| stuff.Vlad 0.1 | 8.6 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.0% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 67.6 | 6 / 35 | 3858 |
| 2 | 3 | 58.7 | 64.1 | 5 / 35 | 3660 |
| 3 | 2 | 59.2 | 63.2 | 6 / 35 | 3842 |
| 4 | 2 | 59.9 | 67.3 | 4 / 35 | 3851 |
| 5 | 4 | 58.5 | 61.6 | 2 / 35 | 3923 |
| 6 | 2 | 61.2 | 69.2 | 6 / 35 | 3781 |
| 7 | 3 | 56.9 | 59.7 | 3 / 35 | 3356 |
| 8 | 4 | 58.2 | 59.7 | 6 / 35 | 3775 |
| 9 | 2 | 61.2 | 70.8 | 6 / 35 | 3849 |
| 10 | 2 | 60.0 | 66.0 | 6 / 35 | 3683 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 27% |
| nz.jdc.nano.GridFu 1.0 | 21 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 76% |
| cb.nano.Insomnia 1.0 | 17 | 71% |
| mz.Cork 0.1 | 9 | 78% |
| oog.melee.CapuletDroid 1.1 | 4 | 50% |

Hadur died in 300 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 29% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 18% | 76 |
| nz.jdc.nano.GridFu 1.0 | 51 | 17% | 56 |
| cb.nano.Insomnia 1.0 | 31 | 10% | 24 |
| mz.Cork 0.1 | 30 | 10% | 39 |
| oog.melee.CapuletDroid 1.1 | 28 | 9% | 34 |
| stuff.Vlad 0.1 | 9 | 3% | 9 |
| stelo.UntouchableNano 1.3 | 7 | 2% | 7 |
| sample.TrackFire 1.0 | 4 | 1% | 4 |

## Melee bench: F08

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 68.3 | 59 / 350 | 3.85 | 13.6% | 37599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.7% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.1% | 55 |
| hadur117.nano.SanaroB800 0.1 | 3.0 | 13.6% | 59 |
| gh.nano.Grofvuil 0.2 | 3.7 | 13.1% | 59 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.1 | 11.3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 10.1% | 36 |
| baal.nano.N 1.42 | 6.5 | 9.8% | 7 |
| donjezza.Muncho 1.0 | 8.5 | 5.5% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 76.8 | 7 / 35 | 4064 |
| 2 | 3 | 61.2 | 68.3 | 6 / 35 | 3852 |
| 3 | 3 | 60.6 | 68.6 | 7 / 35 | 3488 |
| 4 | 1 | 64.5 | 75.9 | 9 / 35 | 4269 |
| 5 | 4 | 59.6 | 65.1 | 3 / 35 | 3604 |
| 6 | 2 | 61.6 | 70.5 | 6 / 35 | 3740 |
| 7 | 4 | 58.5 | 62.2 | 5 / 35 | 3393 |
| 8 | 5 | 56.5 | 57.5 | 0 / 35 | 3490 |
| 9 | 3 | 62.3 | 70.2 | 8 / 35 | 3988 |
| 10 | 3 | 61.3 | 68.3 | 8 / 35 | 3711 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 72% |
| d414.nano.Quantum 1.0.0 | 33 | 21% |
| gh.nano.Grofvuil 0.2 | 12 | 8% |
| djdjdj.NanoSkunk10 1.0 | 11 | 55% |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 73% |
| donjezza.Muncho 1.0 | 3 | 67% |
| baal.nano.N 1.42 | 3 | 67% |

Hadur died in 291 of 350 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 87 | 30% | 95 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 17% | 87 |
| gh.nano.Grofvuil 0.2 | 46 | 16% | 48 |
| dmh.robocode.robot.RedDwarf 0.4 | 40 | 14% | 43 |
| djdjdj.NanoSkunk10 1.0 | 32 | 11% | 40 |
| baal.nano.N 1.42 | 16 | 5% | 17 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 4% | 10 |
| donjezza.Muncho 1.0 | 9 | 3% | 10 |

## Melee bench: F09

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.2 | 54.5 | 33 / 350 | 5.09 | 10.9% | 28518 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 13.5% | 77 |
| stelo.SoRobotNanoMelee 1.2 | 2.4 | 12.5% | 72 |
| mld.DustBunny 3.8 | 3.6 | 11.6% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 11.3% | 28 |
| hadur117.nano.SanaroB800 0.1 | 4.9 | 10.9% | 33 |
| wee.Gem 1.8.4 | 5.6 | 10.4% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 10.0% | 23 |
| cs.sheldor.Talon 1.1 | 8.4 | 7.2% | 3 |
| tj.zombie1n 1.0.1 | 8.5 | 7.2% | 20 |
| step.nanoPri 1.0 | 9.9 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.2 | 53.7 | 4 / 35 | 2860 |
| 2 | 2 | 58.6 | 66.0 | 5 / 35 | 3331 |
| 3 | 6 | 53.1 | 52.7 | 4 / 35 | 3109 |
| 4 | 6 | 51.0 | 49.2 | 4 / 35 | 2808 |
| 5 | 3 | 53.2 | 55.2 | 5 / 35 | 2616 |
| 6 | 5 | 53.2 | 55.2 | 3 / 35 | 2668 |
| 7 | 6 | 49.5 | 46.0 | 2 / 35 | 2765 |
| 8 | 5 | 52.1 | 54.6 | 1 / 35 | 2738 |
| 9 | 5 | 53.8 | 55.6 | 2 / 35 | 2902 |
| 10 | 6 | 53.8 | 56.8 | 3 / 35 | 2721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 37% |
| mld.DustBunny 3.8 | 14 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 73% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 20% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 67% |
| wee.Gem 1.8.4 | 5 | 60% |
| tj.zombie1n 1.0.1 | 2 | 0% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 318 of 350 rounds, at a mean tick of 533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 20% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 60 | 19% | 60 |
| mld.DustBunny 3.8 | 42 | 13% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 12% | 49 |
| sheldor.melee.nano.TestMelee 0.1 | 35 | 11% | 38 |
| wee.Gem 1.8.4 | 23 | 7% | 26 |
| tj.zombie1n 1.0.1 | 20 | 6% | 20 |
| cs.sheldor.Talon 1.1 | 19 | 6% | 21 |
| step.nanoPri 1.0 | 14 | 4% | 15 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.6 | 51 / 350 | 4.00 | 13.4% | 40083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.3% | 112 |
| mld.Infinity 2.2 | 2.2 | 15.2% | 113 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 14.4% | 51 |
| hadur117.nano.SanaroB800 0.1 | 3.8 | 13.4% | 51 |
| robar.nano.Assertive_Melee 0.2 | 5.9 | 8.1% | 5 |
| ayk.WallHugger 1.0 | 6.0 | 8.2% | 5 |
| conscience.Electron 1.3g | 6.8 | 7.4% | 1 |
| exauge.GateKeeper 1.1.121g | 7.4 | 7.1% | 4 |
| donjezza.Jezza 1.0 | 8.9 | 5.9% | 8 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.5 | 7 / 35 | 4129 |
| 2 | 4 | 57.7 | 62.2 | 1 / 35 | 3531 |
| 3 | 4 | 61.3 | 67.6 | 7 / 35 | 4336 |
| 4 | 3 | 60.9 | 68.6 | 7 / 35 | 4104 |
| 5 | 4 | 59.1 | 65.4 | 4 / 35 | 3749 |
| 6 | 4 | 61.2 | 66.3 | 7 / 35 | 4369 |
| 7 | 4 | 61.3 | 67.0 | 7 / 35 | 4348 |
| 8 | 4 | 60.1 | 67.3 | 2 / 35 | 4073 |
| 9 | 4 | 58.0 | 62.9 | 2 / 35 | 3669 |
| 10 | 4 | 60.5 | 68.6 | 7 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 26% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 77% |
| mld.Infinity 2.2 | 23 | 39% |
| ayk.WallHugger 1.0 | 3 | 67% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 34% | 119 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 69 | 23% | 104 |
| mld.Infinity 2.2 | 55 | 18% | 43 |
| robar.nano.Assertive_Melee 0.2 | 21 | 7% | 23 |
| ayk.WallHugger 1.0 | 18 | 6% | 21 |
| conscience.Electron 1.3g | 18 | 6% | 19 |
| donjezza.Jezza 1.0 | 7 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 6 | 2% | 11 |
| sample.RamFire 1.0 | 3 | 1% | 3 |

## Melee bench: F11

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 61.5 | 54 / 350 | 4.46 | 12.5% | 34668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.6% | 105 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.2% | 54 |
| oog.melee.Corsair 1.0 | 3.1 | 13.0% | 63 |
| hadur117.nano.SanaroB800 0.1 | 3.6 | 12.5% | 54 |
| mz.NanoGod 2.02 | 4.6 | 11.5% | 44 |
| awesomeness.Elite 1.0 | 6.9 | 8.2% | 4 |
| DBall.NUKE 0.1 | 7.2 | 7.9% | 10 |
| zyx.nano.BacillusComma 1.0 | 7.4 | 7.3% | 4 |
| sample.Walls 1.0 | 8.5 | 6.6% | 12 |
| stelo.PianistNano 1.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 66.7 | 7 / 35 | 3852 |
| 2 | 4 | 55.0 | 57.8 | 1 / 35 | 3120 |
| 3 | 5 | 56.2 | 58.7 | 4 / 35 | 3113 |
| 4 | 2 | 60.6 | 65.7 | 11 / 35 | 3870 |
| 5 | 3 | 58.5 | 64.4 | 5 / 35 | 3494 |
| 6 | 3 | 59.5 | 65.7 | 8 / 35 | 3624 |
| 7 | 4 | 57.0 | 59.0 | 4 / 35 | 3665 |
| 8 | 3 | 58.1 | 60.6 | 7 / 35 | 3651 |
| 9 | 5 | 52.9 | 53.0 | 3 / 35 | 2935 |
| 10 | 4 | 57.8 | 63.5 | 4 / 35 | 3344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 26% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 70% |
| oog.melee.Corsair 1.0 | 16 | 31% |
| sample.Walls 1.0 | 8 | 38% |
| DBall.NUKE 0.1 | 7 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 60% |
| mz.NanoGod 2.02 | 4 | 50% |
| awesomeness.Elite 1.0 | 4 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 29% | 99 |
| oog.melee.Corsair 1.0 | 50 | 17% | 54 |
| mz.NanoGod 2.02 | 45 | 15% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 15% | 67 |
| awesomeness.Elite 1.0 | 24 | 8% | 25 |
| sample.Walls 1.0 | 17 | 6% | 18 |
| zyx.nano.BacillusComma 1.0 | 16 | 5% | 17 |
| DBall.NUKE 0.1 | 8 | 3% | 10 |
| stelo.PianistNano 1.2 | 8 | 3% | 9 |

## Melee bench: F12

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 62.8 | 51 / 350 | 4.35 | 12.5% | 32929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 14.4% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.1% | 50 |
| hadur117.nano.SanaroB800 0.1 | 3.4 | 12.5% | 51 |
| sul.Lunar 1.1 | 3.4 | 12.1% | 52 |
| myl.nano.KomoriNinja 1.1 | 4.4 | 11.4% | 40 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 4 |
| sam.Samspin 1.0 | 7.1 | 8.1% | 16 |
| sample.SpinBot 1.0 | 7.9 | 7.6% | 17 |
| spinnercat.Omen 1.0 | 7.9 | 7.6% | 14 |
| cvt.Firsty 1.0 | 10.0 | 4.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 65.7 | 6 / 35 | 3496 |
| 2 | 4 | 55.0 | 56.5 | 3 / 35 | 3094 |
| 3 | 5 | 55.8 | 58.7 | 5 / 35 | 3138 |
| 4 | 4 | 57.1 | 61.6 | 4 / 35 | 3297 |
| 5 | 4 | 57.8 | 62.5 | 6 / 35 | 3303 |
| 6 | 4 | 54.7 | 59.0 | 3 / 35 | 2904 |
| 7 | 4 | 58.7 | 65.4 | 8 / 35 | 3304 |
| 8 | 2 | 59.1 | 67.3 | 5 / 35 | 3502 |
| 9 | 2 | 59.3 | 67.3 | 7 / 35 | 3424 |
| 10 | 2 | 57.5 | 63.8 | 4 / 35 | 3467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 36% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 75% |
| sul.Lunar 1.1 | 17 | 53% |
| myl.nano.KomoriNinja 1.1 | 9 | 22% |
| sam.Samspin 1.0 | 7 | 86% |
| sample.SpinBot 1.0 | 5 | 40% |
| cvt.Firsty 1.0 | 4 | 50% |
| spinnercat.Omen 1.0 | 4 | 50% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 300 of 350 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 27% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 18% | 73 |
| sul.Lunar 1.1 | 41 | 14% | 51 |
| myl.nano.KomoriNinja 1.1 | 38 | 13% | 41 |
| sam.Samspin 1.0 | 26 | 9% | 28 |
| sample.SpinBot 1.0 | 21 | 7% | 22 |
| spinnercat.Omen 1.0 | 19 | 6% | 22 |
| maribo.melee.BMV 0.1 | 14 | 5% | 16 |
| cvt.Firsty 1.0 | 7 | 2% | 8 |

## Melee bench: F13

hadur117.nano.SanaroB800 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.3 | 61 / 350 | 4.22 | 12.7% | 33125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.6 | 14.7% | 98 |
| d414.nano.Quantum 1.0.0 | 1.9 | 14.3% | 102 |
| hadur117.nano.SanaroB800 0.1 | 3.1 | 12.7% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.9 | 12.1% | 31 |
| mld.Wisdom 1.0 | 4.7 | 10.9% | 22 |
| amz.NanoClone 1.41 | 6.7 | 8.6% | 13 |
| tvv.nano.Polaris 1.2 | 7.4 | 8.4% | 11 |
| zyx.nano.Ant 1.1 | 7.8 | 7.9% | 6 |
| arthord.NanoSatanMelee Beta | 7.9 | 7.8% | 7 |
| arthord.MannyPacquiao Beta | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 69.5 | 6 / 35 | 3359 |
| 2 | 2 | 61.4 | 71.7 | 7 / 35 | 3529 |
| 3 | 3 | 57.3 | 63.2 | 3 / 35 | 3097 |
| 4 | 3 | 57.8 | 60.6 | 7 / 35 | 3299 |
| 5 | 2 | 59.5 | 65.7 | 9 / 35 | 3562 |
| 6 | 4 | 55.8 | 58.7 | 4 / 35 | 3030 |
| 7 | 2 | 60.9 | 68.9 | 9 / 35 | 3751 |
| 8 | 5 | 53.5 | 52.4 | 4 / 35 | 3014 |
| 9 | 3 | 57.9 | 63.8 | 7 / 35 | 3324 |
| 10 | 4 | 58.7 | 67.9 | 5 / 35 | 3160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 41% |
| d414.nano.Quantum 1.0.0 | 26 | 31% |
| mld.Wisdom 1.0 | 11 | 9% |
| tvv.nano.Polaris 1.2 | 10 | 50% |
| zyx.nano.Ant 1.1 | 6 | 33% |
| amz.NanoClone 1.41 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 4 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 21% | 71 |
| davidalves.net.DuelistNanoMelee 1.01 | 60 | 21% | 69 |
| mld.Wisdom 1.0 | 50 | 17% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 11% | 65 |
| amz.NanoClone 1.41 | 25 | 9% | 27 |
| zyx.nano.Ant 1.1 | 24 | 8% | 26 |
| arthord.NanoSatanMelee Beta | 18 | 6% | 21 |
| tvv.nano.Polaris 1.2 | 17 | 6% | 17 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |

