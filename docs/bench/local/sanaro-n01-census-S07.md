# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 67.9 | 73 / 350 | 3.89 | 13.5% | 33650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.7% | 130 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.7% | 54 |
| hadur117.nano.SanaroS07 0.1 | 2.7 | 13.5% | 73 |
| bzdp.Pansy 2.1 | 3.7 | 12.3% | 36 |
| zyx.nano.Ant 1.1 | 6.2 | 8.9% | 9 |
| tvv.nano.Polaris 1.2 | 6.3 | 9.0% | 23 |
| arthord.NanoSatanMelee Beta | 6.3 | 9.1% | 7 |
| fm.claire 1.7 | 7.3 | 8.3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 8.9 | 6.2% | 13 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 72.1 | 8 / 35 | 3472 |
| 2 | 3 | 58.2 | 64.1 | 5 / 35 | 3339 |
| 3 | 3 | 61.0 | 69.2 | 8 / 35 | 3542 |
| 4 | 2 | 61.8 | 73.3 | 8 / 35 | 3400 |
| 5 | 3 | 59.0 | 62.5 | 9 / 35 | 3329 |
| 6 | 3 | 61.2 | 71.7 | 9 / 35 | 3399 |
| 7 | 2 | 61.8 | 75.2 | 7 / 35 | 3366 |
| 8 | 4 | 56.2 | 58.1 | 4 / 35 | 3224 |
| 9 | 2 | 59.2 | 67.0 | 8 / 35 | 3199 |
| 10 | 3 | 59.5 | 65.7 | 7 / 35 | 3380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 69% |
| d414.nano.Quantum 1.0.0 | 46 | 22% |
| bzdp.Pansy 2.1 | 16 | 75% |
| tvv.nano.Polaris 1.2 | 9 | 33% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 71% |
| arthord.NanoSatanMelee Beta | 6 | 67% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 277 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 31% | 100 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 18% | 84 |
| bzdp.Pansy 2.1 | 44 | 16% | 57 |
| arthord.NanoSatanMelee Beta | 25 | 9% | 29 |
| tvv.nano.Polaris 1.2 | 23 | 8% | 23 |
| zyx.nano.Ant 1.1 | 21 | 8% | 23 |
| fm.claire 1.7 | 14 | 5% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 11 | 4% | 15 |
| arthord.MannyPacquiao Beta | 4 | 1% | 4 |

## Melee bench: F02

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 69.0 | 53 / 350 | 3.79 | 13.4% | 30410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 13.8% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.5% | 42 |
| hadur117.nano.SanaroS07 0.1 | 2.5 | 13.4% | 53 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 12.3% | 44 |
| DBall.Anarchy 0.1 | 4.7 | 11.6% | 60 |
| stelo.SoJNanoMelee 1.1 | 5.9 | 10.3% | 65 |
| fm.mammillarias 1.3 | 6.8 | 9.8% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.8% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.6% | 14 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 66.0 | 4 / 35 | 2793 |
| 2 | 3 | 60.7 | 71.7 | 5 / 35 | 2934 |
| 3 | 3 | 58.9 | 63.8 | 4 / 35 | 3253 |
| 4 | 1 | 63.7 | 79.0 | 10 / 35 | 3052 |
| 5 | 2 | 59.5 | 68.6 | 4 / 35 | 2763 |
| 6 | 3 | 59.8 | 67.9 | 6 / 35 | 2961 |
| 7 | 1 | 61.9 | 72.4 | 7 / 35 | 3197 |
| 8 | 4 | 58.2 | 64.1 | 3 / 35 | 2895 |
| 9 | 2 | 61.2 | 70.5 | 4 / 35 | 3563 |
| 10 | 3 | 59.2 | 66.0 | 6 / 35 | 2999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 81% |
| d414.nano.Quantum 1.0.0 | 25 | 36% |
| DBall.Anarchy 0.1 | 22 | 27% |
| simonton.nano.MeleeSeed 1.8 | 15 | 33% |
| stelo.SoJNanoMelee 1.1 | 14 | 36% |
| fm.mammillarias 1.3 | 4 | 75% |
| sample.MyFirstRobot 1.0 | 3 | 0% |

Hadur died in 297 of 350 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 23% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 18% | 81 |
| simonton.nano.MeleeSeed 1.8 | 46 | 15% | 52 |
| DBall.Anarchy 0.1 | 43 | 14% | 52 |
| stelo.SoJNanoMelee 1.1 | 37 | 12% | 37 |
| fm.mammillarias 1.3 | 32 | 11% | 32 |
| sample.MyFirstRobot 1.0 | 10 | 3% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 2% | 7 |

## Melee bench: F03

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 67.1 | 62 / 350 | 3.96 | 13.5% | 38008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.5% | 109 |
| hadur117.nano.SanaroS07 0.1 | 2.6 | 13.5% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.2% | 39 |
| ahf.NanoAndrew .4 | 4.1 | 12.0% | 52 |
| ratosh.Nobo 0.21 | 4.7 | 11.2% | 19 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.3% | 17 |
| stelo.PatternRobot 1.0 | 6.9 | 8.2% | 37 |
| repositorio.NanoStep 1.0 | 8.1 | 6.6% | 11 |
| sample.Crazy 1.0 | 8.8 | 5.8% | 5 |
| kurios.DOSexe .9a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 73.0 | 6 / 35 | 4088 |
| 2 | 3 | 58.5 | 63.5 | 7 / 35 | 3754 |
| 3 | 2 | 58.9 | 68.3 | 3 / 35 | 3687 |
| 4 | 2 | 62.1 | 70.2 | 11 / 35 | 4106 |
| 5 | 2 | 59.3 | 66.0 | 7 / 35 | 3758 |
| 6 | 2 | 60.5 | 68.3 | 5 / 35 | 4016 |
| 7 | 4 | 57.3 | 60.0 | 7 / 35 | 3575 |
| 8 | 2 | 63.5 | 78.1 | 10 / 35 | 4022 |
| 9 | 3 | 57.8 | 63.8 | 4 / 35 | 3433 |
| 10 | 4 | 56.5 | 60.3 | 2 / 35 | 3569 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 42 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| ahf.NanoAndrew .4 | 24 | 42% |
| stelo.PatternRobot 1.0 | 13 | 46% |
| ratosh.Nobo 0.21 | 5 | 40% |
| repositorio.NanoStep 1.0 | 4 | 25% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 289 of 350 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 25% | 88 |
| ahf.NanoAndrew .4 | 65 | 22% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 16% | 74 |
| stelo.PatternRobot 1.0 | 37 | 13% | 39 |
| ratosh.Nobo 0.21 | 33 | 11% | 38 |
| timmit.nano.TimDog 0.33 | 18 | 6% | 23 |
| repositorio.NanoStep 1.0 | 11 | 4% | 12 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 74.3 | 82 / 350 | 3.31 | 15.3% | 49209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.8% | 145 |
| hadur117.nano.SanaroS07 0.1 | 2.6 | 15.3% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 15.3% | 58 |
| wompi.Quokka 1.6 | 3.6 | 14.2% | 51 |
| kurios.DOSexe .9b | 5.6 | 7.5% | 7 |
| maribo.FollowFire 1 | 6.4 | 7.0% | 0 |
| jangs.ns51 1.0 | 7.5 | 6.2% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 7.6 | 6.4% | 3 |
| sample.VelociRobot 1.0 | 7.9 | 6.1% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 74.0 | 6 / 35 | 4531 |
| 2 | 2 | 64.0 | 73.3 | 8 / 35 | 5114 |
| 3 | 2 | 65.9 | 79.4 | 11 / 35 | 5054 |
| 4 | 4 | 62.4 | 71.7 | 5 / 35 | 4532 |
| 5 | 2 | 65.0 | 73.7 | 11 / 35 | 5397 |
| 6 | 3 | 62.3 | 69.2 | 6 / 35 | 5065 |
| 7 | 3 | 63.6 | 75.6 | 4 / 35 | 4704 |
| 8 | 3 | 63.4 | 73.0 | 10 / 35 | 4687 |
| 9 | 2 | 65.4 | 77.5 | 12 / 35 | 4865 |
| 10 | 2 | 65.2 | 76.2 | 9 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 31% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59 | 71% |
| wompi.Quokka 1.6 | 33 | 55% |
| kurios.DOSexe .9b | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 269 of 350 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 119 | 44% | 144 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 65 | 24% | 112 |
| wompi.Quokka 1.6 | 49 | 18% | 53 |
| maribo.FollowFire 1 | 11 | 4% | 12 |
| kurios.DOSexe .9b | 8 | 3% | 10 |
| jangs.ns51 1.0 | 7 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 1% | 5 |
| sample.VelociRobot 1.0 | 4 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.1 | 104 / 350 | 3.15 | 15.5% | 45680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 16.7% | 133 |
| hadur117.nano.SanaroS07 0.1 | 2.2 | 15.5% | 104 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.2% | 68 |
| ntc.Opposite 1.5 | 4.5 | 11.5% | 11 |
| js.PinBall 1.6 | 5.0 | 11.1% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.5 | 10.6% | 8 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.6% | 9 |
| sample.Fire 1.0 | 8.4 | 4.5% | 2 |
| PSW.Relentless 0.1 | 8.9 | 4.0% | 0 |
| sample.Target 1.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 66.3 | 6 / 35 | 4323 |
| 2 | 3 | 63.4 | 74.0 | 7 / 35 | 4343 |
| 3 | 2 | 64.1 | 74.9 | 11 / 35 | 4601 |
| 4 | 2 | 65.2 | 75.2 | 11 / 35 | 4961 |
| 5 | 1 | 65.6 | 80.0 | 14 / 35 | 4367 |
| 6 | 1 | 66.7 | 82.2 | 14 / 35 | 5249 |
| 7 | 2 | 65.1 | 78.7 | 11 / 35 | 4527 |
| 8 | 2 | 66.5 | 84.1 | 14 / 35 | 4566 |
| 9 | 3 | 63.2 | 73.0 | 11 / 35 | 4287 |
| 10 | 3 | 63.0 | 72.4 | 5 / 35 | 4456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 72% |
| d414.nano.Quantum 1.0.0 | 58 | 36% |
| js.PinBall 1.6 | 14 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 90% |
| ntc.Opposite 1.5 | 9 | 56% |
| sp.Nanos.Ember 1.1 | 7 | 71% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 248 of 350 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 89 | 36% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 23% | 114 |
| js.PinBall 1.6 | 35 | 14% | 43 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 12% | 34 |
| ntc.Opposite 1.5 | 29 | 12% | 33 |
| sp.Nanos.Ember 1.1 | 6 | 2% | 11 |
| sample.Fire 1.0 | 2 | 1% | 3 |
| PSW.Relentless 0.1 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 66.0 | 65 / 350 | 4.06 | 13.1% | 33696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.3% | 83 |
| hadur117.nano.SanaroS07 0.1 | 2.8 | 13.1% | 65 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.0% | 67 |
| radnor.DoctorBob 1.42 | 3.3 | 13.2% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.4 | 12.3% | 33 |
| myl.nano.Graviton 1.10 | 5.9 | 10.6% | 31 |
| ratosh.Wesco 1.4 | 7.7 | 7.7% | 8 |
| stelo.MirrorNano 1.3 | 8.1 | 7.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 7.6% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 72.7 | 8 / 35 | 3798 |
| 2 | 4 | 57.4 | 59.7 | 4 / 35 | 3290 |
| 3 | 1 | 62.6 | 71.7 | 11 / 35 | 3616 |
| 4 | 4 | 58.9 | 66.3 | 3 / 35 | 3258 |
| 5 | 5 | 55.5 | 56.5 | 2 / 35 | 2718 |
| 6 | 3 | 58.9 | 63.5 | 6 / 35 | 3304 |
| 7 | 2 | 61.5 | 68.3 | 10 / 35 | 3431 |
| 8 | 4 | 58.2 | 61.9 | 4 / 35 | 3204 |
| 9 | 1 | 63.3 | 74.0 | 10 / 35 | 3816 |
| 10 | 3 | 59.8 | 65.7 | 7 / 35 | 3261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 85% |
| d414.nano.Quantum 1.0.0 | 32 | 28% |
| kawigi.nano.Lib 1.0 | 22 | 55% |
| radnor.DoctorBob 1.42 | 16 | 25% |
| myl.nano.Graviton 1.10 | 10 | 60% |
| stelo.MirrorNano 1.3 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 286 of 350 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 58 | 20% | 66 |
| kawigi.nano.Lib 1.0 | 55 | 19% | 70 |
| radnor.DoctorBob 1.42 | 54 | 19% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 13% | 66 |
| myl.nano.Graviton 1.10 | 35 | 12% | 40 |
| stelo.MirrorNano 1.3 | 18 | 6% | 20 |
| ratosh.Wesco 1.4 | 17 | 6% | 20 |
| squidM.TentalceMeleeNano 1.1 | 11 | 4% | 12 |

## Melee bench: F07

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 63.6 | 55 / 350 | 4.27 | 12.7% | 35719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.2% | 88 |
| nz.jdc.nano.GridFu 1.0 | 2.9 | 13.0% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.6% | 52 |
| hadur117.nano.SanaroS07 0.1 | 3.7 | 12.7% | 55 |
| cb.nano.Insomnia 1.0 | 3.8 | 12.4% | 51 |
| oog.melee.CapuletDroid 1.1 | 6.1 | 10.9% | 25 |
| mz.Cork 0.1 | 6.3 | 10.3% | 15 |
| stuff.Vlad 0.1 | 8.5 | 5.3% | 2 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.2 | 57.1 | 2 / 35 | 3622 |
| 2 | 6 | 55.6 | 56.2 | 3 / 35 | 3120 |
| 3 | 4 | 58.0 | 61.0 | 9 / 35 | 3330 |
| 4 | 2 | 62.5 | 72.1 | 9 / 35 | 4007 |
| 5 | 5 | 57.5 | 60.6 | 4 / 35 | 3537 |
| 6 | 1 | 63.1 | 72.7 | 9 / 35 | 4327 |
| 7 | 2 | 61.1 | 69.5 | 10 / 35 | 3536 |
| 8 | 5 | 55.4 | 56.8 | 4 / 35 | 3204 |
| 9 | 4 | 58.3 | 66.0 | 3 / 35 | 3278 |
| 10 | 3 | 58.5 | 64.1 | 2 / 35 | 3758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 22 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| d414.nano.Quantum 1.0.0 | 20 | 35% |
| nz.jdc.nano.GridFu 1.0 | 14 | 43% |
| oog.melee.CapuletDroid 1.1 | 8 | 63% |
| mz.Cork 0.1 | 4 | 75% |
| stuff.Vlad 0.1 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 0% |

Hadur died in 295 of 350 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 22% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 61 | 21% | 83 |
| cb.nano.Insomnia 1.0 | 59 | 20% | 51 |
| nz.jdc.nano.GridFu 1.0 | 57 | 19% | 68 |
| oog.melee.CapuletDroid 1.1 | 27 | 9% | 36 |
| mz.Cork 0.1 | 22 | 7% | 28 |
| stuff.Vlad 0.1 | 2 | 1% | 4 |
| stelo.UntouchableNano 1.3 | 1 | 0% | 1 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 69.9 | 69 / 350 | 3.71 | 13.9% | 37831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.7% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 14.1% | 50 |
| hadur117.nano.SanaroS07 0.1 | 2.9 | 13.9% | 69 |
| gh.nano.Grofvuil 0.2 | 3.5 | 13.2% | 67 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.8% | 5 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 10.2% | 32 |
| baal.nano.N 1.42 | 6.7 | 9.6% | 8 |
| donjezza.Muncho 1.0 | 8.5 | 5.3% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 71.1 | 8 / 35 | 3728 |
| 2 | 3 | 61.5 | 67.9 | 9 / 35 | 3828 |
| 3 | 3 | 61.5 | 65.7 | 9 / 35 | 4021 |
| 4 | 4 | 60.2 | 67.6 | 5 / 35 | 3647 |
| 5 | 4 | 60.0 | 68.6 | 5 / 35 | 3500 |
| 6 | 2 | 63.0 | 73.3 | 8 / 35 | 3953 |
| 7 | 3 | 62.8 | 72.4 | 9 / 35 | 3749 |
| 8 | 2 | 61.5 | 70.5 | 7 / 35 | 3880 |
| 9 | 4 | 60.8 | 68.9 | 2 / 35 | 3735 |
| 10 | 2 | 62.3 | 73.3 | 7 / 35 | 3790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 71% |
| d414.nano.Quantum 1.0.0 | 45 | 31% |
| gh.nano.Grofvuil 0.2 | 21 | 24% |
| djdjdj.NanoSkunk10 1.0 | 12 | 50% |
| baal.nano.N 1.42 | 5 | 60% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 92 | 33% | 108 |
| gh.nano.Grofvuil 0.2 | 56 | 20% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 17% | 82 |
| dmh.robocode.robot.RedDwarf 0.4 | 32 | 11% | 33 |
| djdjdj.NanoSkunk10 1.0 | 30 | 11% | 37 |
| baal.nano.N 1.42 | 16 | 6% | 18 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7 | 2% | 7 |
| donjezza.Muncho 1.0 | 2 | 1% | 3 |

## Melee bench: F09

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 55.7 | 35 / 350 | 4.99 | 11.0% | 27627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 13.5% | 68 |
| mld.DustBunny 3.8 | 3.5 | 11.8% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 11.9% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.8% | 64 |
| hadur117.nano.SanaroS07 0.1 | 4.9 | 11.0% | 35 |
| wee.Gem 1.8.4 | 5.1 | 10.8% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 6.1 | 9.9% | 29 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.7% | 1 |
| tj.zombie1n 1.0.1 | 8.6 | 7.0% | 27 |
| step.nanoPri 1.0 | 9.9 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.2 | 56.2 | 5 / 35 | 2868 |
| 2 | 6 | 52.1 | 53.7 | 2 / 35 | 2545 |
| 3 | 5 | 51.6 | 50.8 | 2 / 35 | 2807 |
| 4 | 4 | 56.3 | 61.6 | 4 / 35 | 3009 |
| 5 | 7 | 51.8 | 51.4 | 5 / 35 | 2553 |
| 6 | 5 | 52.9 | 54.0 | 3 / 35 | 2594 |
| 7 | 7 | 53.1 | 53.3 | 3 / 35 | 2858 |
| 8 | 2 | 56.5 | 61.9 | 5 / 35 | 2943 |
| 9 | 3 | 55.0 | 61.3 | 2 / 35 | 2723 |
| 10 | 5 | 52.3 | 52.7 | 4 / 35 | 2727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 22 | 41% |
| d414.nano.Quantum 1.0.0 | 19 | 42% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 46% |
| mld.DustBunny 3.8 | 10 | 50% |
| wee.Gem 1.8.4 | 10 | 30% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 40% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 315 of 350 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 23% | 82 |
| stelo.SoRobotNanoMelee 1.2 | 48 | 15% | 49 |
| wee.Gem 1.8.4 | 44 | 14% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 12% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 37 | 12% | 40 |
| mld.DustBunny 3.8 | 36 | 11% | 44 |
| cs.sheldor.Talon 1.1 | 19 | 6% | 19 |
| tj.zombie1n 1.0.1 | 11 | 3% | 11 |
| step.nanoPri 1.0 | 9 | 3% | 10 |

## Melee bench: F10

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.0 | 77 / 350 | 3.52 | 14.5% | 41098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.1% | 104 |
| hadur117.nano.SanaroS07 0.1 | 2.5 | 14.5% | 77 |
| mld.Infinity 2.2 | 2.9 | 14.8% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 14.1% | 53 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 7.8% | 2 |
| exauge.GateKeeper 1.1.121g | 6.6 | 7.5% | 1 |
| conscience.Electron 1.3g | 6.6 | 7.7% | 2 |
| ayk.WallHugger 1.0 | 6.8 | 7.4% | 5 |
| donjezza.Jezza 1.0 | 8.7 | 6.1% | 5 |
| sample.RamFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 55.6 | 5 / 35 | 3509 |
| 2 | 2 | 63.3 | 74.6 | 7 / 35 | 4556 |
| 3 | 2 | 63.3 | 74.9 | 8 / 35 | 4313 |
| 4 | 2 | 61.6 | 72.1 | 8 / 35 | 3909 |
| 5 | 3 | 63.9 | 76.2 | 6 / 35 | 4354 |
| 6 | 3 | 62.6 | 74.3 | 5 / 35 | 4027 |
| 7 | 2 | 62.6 | 72.4 | 9 / 35 | 4197 |
| 8 | 2 | 64.5 | 78.7 | 8 / 35 | 4500 |
| 9 | 1 | 63.7 | 75.6 | 13 / 35 | 4071 |
| 10 | 4 | 59.6 | 65.7 | 8 / 35 | 3662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 72% |
| mld.Infinity 2.2 | 36 | 47% |
| ayk.WallHugger 1.0 | 4 | 50% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 2 | 50% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 103 | 38% | 139 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 28% | 120 |
| mld.Infinity 2.2 | 44 | 16% | 30 |
| robar.nano.Assertive_Melee 0.2 | 16 | 6% | 19 |
| conscience.Electron 1.3g | 12 | 4% | 12 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 13 |
| ayk.WallHugger 1.0 | 6 | 2% | 10 |
| donjezza.Jezza 1.0 | 5 | 2% | 6 |
| sample.RamFire 1.0 | 1 | 0% | 0 |

## Melee bench: F11

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.7 | 74 / 350 | 3.91 | 13.4% | 34095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.6% | 108 |
| hadur117.nano.SanaroS07 0.1 | 2.7 | 13.4% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.6% | 60 |
| oog.melee.Corsair 1.0 | 3.5 | 12.7% | 52 |
| mz.NanoGod 2.02 | 4.8 | 11.0% | 33 |
| awesomeness.Elite 1.0 | 6.5 | 7.9% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.4 | 7.6% | 0 |
| DBall.NUKE 0.1 | 7.4 | 7.6% | 9 |
| sample.Walls 1.0 | 8.7 | 6.5% | 9 |
| stelo.PianistNano 1.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 65.1 | 9 / 35 | 3350 |
| 2 | 2 | 60.5 | 69.8 | 8 / 35 | 3542 |
| 3 | 4 | 58.4 | 63.8 | 7 / 35 | 3274 |
| 4 | 4 | 57.6 | 61.9 | 7 / 35 | 3218 |
| 5 | 2 | 61.7 | 72.1 | 9 / 35 | 3510 |
| 6 | 1 | 61.6 | 73.3 | 9 / 35 | 3715 |
| 7 | 3 | 58.2 | 62.9 | 6 / 35 | 3504 |
| 8 | 2 | 61.7 | 74.6 | 6 / 35 | 3509 |
| 9 | 3 | 58.7 | 66.3 | 6 / 35 | 3215 |
| 10 | 3 | 59.3 | 67.3 | 7 / 35 | 3258 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 72% |
| d414.nano.Quantum 1.0.0 | 42 | 48% |
| oog.melee.Corsair 1.0 | 16 | 50% |
| mz.NanoGod 2.02 | 7 | 29% |
| DBall.NUKE 0.1 | 6 | 67% |
| sample.Walls 1.0 | 5 | 80% |
| awesomeness.Elite 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 276 of 350 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 61 | 22% | 92 |
| d414.nano.Quantum 1.0.0 | 59 | 21% | 79 |
| oog.melee.Corsair 1.0 | 47 | 17% | 55 |
| mz.NanoGod 2.02 | 43 | 16% | 47 |
| zyx.nano.BacillusComma 1.0 | 22 | 8% | 24 |
| awesomeness.Elite 1.0 | 20 | 7% | 22 |
| DBall.NUKE 0.1 | 12 | 4% | 16 |
| sample.Walls 1.0 | 10 | 4% | 13 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 62.0 | 52 / 350 | 4.42 | 12.3% | 32028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.1% | 109 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 38 |
| hadur117.nano.SanaroS07 0.1 | 3.2 | 12.3% | 52 |
| myl.nano.KomoriNinja 1.1 | 3.6 | 12.0% | 49 |
| sul.Lunar 1.1 | 4.1 | 11.3% | 47 |
| maribo.melee.BMV 0.1 | 7.2 | 8.1% | 1 |
| spinnercat.Omen 1.0 | 7.5 | 7.9% | 12 |
| sam.Samspin 1.0 | 7.6 | 7.8% | 16 |
| sample.SpinBot 1.0 | 7.7 | 7.7% | 15 |
| cvt.Firsty 1.0 | 10.0 | 5.0% | 11 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 62.2 | 6 / 35 | 3288 |
| 2 | 2 | 57.5 | 64.8 | 4 / 35 | 3144 |
| 3 | 2 | 61.0 | 72.1 | 7 / 35 | 3649 |
| 4 | 4 | 57.0 | 62.2 | 6 / 35 | 3114 |
| 5 | 3 | 56.9 | 60.0 | 5 / 35 | 3345 |
| 6 | 3 | 57.4 | 62.9 | 3 / 35 | 3348 |
| 7 | 3 | 58.3 | 66.0 | 4 / 35 | 3239 |
| 8 | 4 | 54.0 | 57.1 | 3 / 35 | 2941 |
| 9 | 5 | 52.1 | 50.2 | 4 / 35 | 2900 |
| 10 | 3 | 57.8 | 62.2 | 10 / 35 | 3060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 28% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 81% |
| sul.Lunar 1.1 | 17 | 59% |
| myl.nano.KomoriNinja 1.1 | 11 | 36% |
| spinnercat.Omen 1.0 | 7 | 14% |
| sample.SpinBot 1.0 | 6 | 67% |
| cvt.Firsty 1.0 | 5 | 40% |
| sam.Samspin 1.0 | 4 | 50% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 298 of 350 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 75 | 25% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 16% | 72 |
| myl.nano.KomoriNinja 1.1 | 44 | 15% | 48 |
| sul.Lunar 1.1 | 29 | 10% | 39 |
| sam.Samspin 1.0 | 25 | 8% | 27 |
| spinnercat.Omen 1.0 | 23 | 8% | 23 |
| maribo.melee.BMV 0.1 | 23 | 8% | 23 |
| sample.SpinBot 1.0 | 19 | 6% | 21 |
| cvt.Firsty 1.0 | 11 | 4% | 12 |

## Melee bench: F13

hadur117.nano.SanaroS07 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 66.3 | 65 / 350 | 4.03 | 12.9% | 32024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 14.3% | 97 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.1 | 13.9% | 86 |
| hadur117.nano.SanaroS07 0.1 | 3.0 | 12.9% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 11.8% | 32 |
| mld.Wisdom 1.0 | 4.8 | 11.4% | 34 |
| tvv.nano.Polaris 1.2 | 6.9 | 8.6% | 14 |
| amz.NanoClone 1.41 | 7.4 | 8.3% | 4 |
| arthord.NanoSatanMelee Beta | 7.6 | 8.2% | 8 |
| zyx.nano.Ant 1.1 | 7.9 | 7.9% | 9 |
| arthord.MannyPacquiao Beta | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 64.8 | 4 / 35 | 3329 |
| 2 | 1 | 59.9 | 68.9 | 9 / 35 | 3412 |
| 3 | 3 | 57.4 | 62.5 | 6 / 35 | 3120 |
| 4 | 3 | 57.7 | 64.1 | 5 / 35 | 3301 |
| 5 | 2 | 59.6 | 68.6 | 7 / 35 | 3397 |
| 6 | 4 | 57.4 | 66.3 | 6 / 35 | 2766 |
| 7 | 3 | 60.5 | 71.7 | 5 / 35 | 3152 |
| 8 | 4 | 57.5 | 61.0 | 8 / 35 | 3070 |
| 9 | 3 | 58.2 | 66.7 | 7 / 35 | 3187 |
| 10 | 3 | 59.8 | 68.3 | 8 / 35 | 3290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 35 | 49% |
| d414.nano.Quantum 1.0.0 | 30 | 37% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 79% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| tvv.nano.Polaris 1.2 | 7 | 43% |
| amz.NanoClone 1.41 | 4 | 75% |
| mld.Wisdom 1.0 | 3 | 33% |
| zyx.nano.Ant 1.1 | 2 | 50% |

Hadur died in 287 of 350 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 20% | 67 |
| davidalves.net.DuelistNanoMelee 1.01 | 54 | 19% | 72 |
| mld.Wisdom 1.0 | 44 | 15% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 14% | 66 |
| tvv.nano.Polaris 1.2 | 29 | 10% | 28 |
| amz.NanoClone 1.41 | 28 | 10% | 30 |
| arthord.NanoSatanMelee Beta | 20 | 7% | 20 |
| zyx.nano.Ant 1.1 | 12 | 4% | 13 |
| arthord.MannyPacquiao Beta | 2 | 1% | 3 |

