# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 64.7 | 49 / 350 | 4.17 | 13.0% | 35193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 140 |
| bzdp.Pansy 2.1 | 3.0 | 12.8% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.1% | 50 |
| hadur117.nano.SanaroS10 0.1 | 3.0 | 13.0% | 49 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.6% | 29 |
| arthord.NanoSatanMelee Beta | 6.6 | 9.2% | 12 |
| zyx.nano.Ant 1.1 | 6.9 | 8.2% | 5 |
| fm.claire 1.7 | 7.0 | 8.7% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.6% | 14 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 61.0 | 4 / 35 | 3136 |
| 2 | 3 | 61.3 | 68.3 | 5 / 35 | 4087 |
| 3 | 2 | 60.2 | 66.7 | 6 / 35 | 3651 |
| 4 | 4 | 58.3 | 63.2 | 3 / 35 | 3488 |
| 5 | 2 | 60.7 | 68.6 | 5 / 35 | 3835 |
| 6 | 3 | 57.7 | 62.9 | 6 / 35 | 3268 |
| 7 | 4 | 57.0 | 61.9 | 2 / 35 | 3313 |
| 8 | 2 | 60.4 | 67.0 | 5 / 35 | 3797 |
| 9 | 4 | 54.6 | 55.6 | 5 / 35 | 3038 |
| 10 | 2 | 61.7 | 72.4 | 8 / 35 | 3580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 41% |
| bzdp.Pansy 2.1 | 27 | 63% |
| tvv.nano.Polaris 1.2 | 5 | 0% |
| zyx.nano.Ant 1.1 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 301 of 350 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 27% | 92 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 62 | 21% | 76 |
| bzdp.Pansy 2.1 | 48 | 16% | 62 |
| tvv.nano.Polaris 1.2 | 27 | 9% | 27 |
| zyx.nano.Ant 1.1 | 25 | 8% | 28 |
| arthord.NanoSatanMelee Beta | 21 | 7% | 26 |
| fm.claire 1.7 | 18 | 6% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 17 | 6% | 18 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.5 | 45 / 350 | 3.93 | 13.0% | 28945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.3% | 91 |
| simonton.nano.MeleeSeed 1.8 | 2.9 | 13.2% | 58 |
| hadur117.nano.SanaroS10 0.1 | 3.0 | 13.0% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 31 |
| DBall.Anarchy 0.1 | 5.2 | 11.0% | 54 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 9.8% | 57 |
| fm.mammillarias 1.3 | 6.5 | 9.6% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.0% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.3% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 68.6 | 5 / 35 | 3038 |
| 2 | 3 | 60.0 | 67.3 | 3 / 35 | 3198 |
| 3 | 3 | 60.3 | 68.9 | 5 / 35 | 2899 |
| 4 | 2 | 60.2 | 70.5 | 4 / 35 | 2768 |
| 5 | 4 | 59.1 | 65.7 | 3 / 35 | 2710 |
| 6 | 3 | 58.8 | 66.3 | 5 / 35 | 2617 |
| 7 | 3 | 59.6 | 67.0 | 5 / 35 | 3078 |
| 8 | 3 | 59.3 | 68.3 | 4 / 35 | 2653 |
| 9 | 2 | 61.8 | 71.1 | 7 / 35 | 3128 |
| 10 | 4 | 57.7 | 61.0 | 4 / 35 | 2856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 46% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 35% |
| simonton.nano.MeleeSeed 1.8 | 18 | 50% |
| stelo.SoJNanoMelee 1.1 | 15 | 33% |
| DBall.Anarchy 0.1 | 11 | 36% |
| sample.MyFirstRobot 1.0 | 6 | 33% |
| fm.mammillarias 1.3 | 2 | 50% |

Hadur died in 305 of 350 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 76 | 25% | 95 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 24% | 82 |
| simonton.nano.MeleeSeed 1.8 | 52 | 17% | 59 |
| stelo.SoJNanoMelee 1.1 | 43 | 14% | 43 |
| fm.mammillarias 1.3 | 27 | 9% | 28 |
| DBall.Anarchy 0.1 | 20 | 7% | 24 |
| sample.MyFirstRobot 1.0 | 8 | 3% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 1 |

## Melee bench: F03

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 64.2 | 46 / 350 | 4.23 | 13.1% | 39001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.1% | 117 |
| hadur117.nano.SanaroS10 0.1 | 2.9 | 13.1% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.1% | 48 |
| ahf.NanoAndrew .4 | 3.4 | 12.4% | 65 |
| ratosh.Nobo 0.21 | 4.8 | 11.0% | 15 |
| timmit.nano.TimDog 0.33 | 5.9 | 9.3% | 22 |
| stelo.PatternRobot 1.0 | 7.2 | 7.8% | 20 |
| repositorio.NanoStep 1.0 | 8.1 | 6.6% | 13 |
| sample.Crazy 1.0 | 8.6 | 6.0% | 5 |
| kurios.DOSexe .9a | 9.9 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 68.3 | 6 / 35 | 4087 |
| 2 | 3 | 57.2 | 61.0 | 3 / 35 | 3721 |
| 3 | 2 | 61.1 | 68.9 | 5 / 35 | 4152 |
| 4 | 5 | 54.7 | 52.7 | 3 / 35 | 3578 |
| 5 | 2 | 60.2 | 65.1 | 6 / 35 | 4241 |
| 6 | 2 | 59.5 | 66.7 | 4 / 35 | 4022 |
| 7 | 4 | 58.1 | 61.3 | 5 / 35 | 3655 |
| 8 | 5 | 54.7 | 56.8 | 1 / 35 | 3332 |
| 9 | 2 | 60.2 | 67.9 | 5 / 35 | 3989 |
| 10 | 2 | 62.1 | 73.0 | 8 / 35 | 4224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 53 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 46% |
| ahf.NanoAndrew .4 | 13 | 23% |
| ratosh.Nobo 0.21 | 7 | 29% |
| timmit.nano.TimDog 0.33 | 4 | 25% |
| repositorio.NanoStep 1.0 | 3 | 33% |
| stelo.PatternRobot 1.0 | 2 | 50% |
| kurios.DOSexe .9a | 1 | 100% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 306 of 350 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 26% | 103 |
| ahf.NanoAndrew .4 | 64 | 21% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 16% | 59 |
| ratosh.Nobo 0.21 | 38 | 12% | 41 |
| timmit.nano.TimDog 0.33 | 30 | 10% | 30 |
| stelo.PatternRobot 1.0 | 22 | 7% | 23 |
| sample.Crazy 1.0 | 10 | 3% | 12 |
| repositorio.NanoStep 1.0 | 8 | 3% | 9 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.3 | 66 / 350 | 3.40 | 15.2% | 50190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 17.4% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.7% | 85 |
| hadur117.nano.SanaroS10 0.1 | 2.7 | 15.2% | 66 |
| wompi.Quokka 1.6 | 3.8 | 14.1% | 38 |
| maribo.FollowFire 1 | 5.8 | 7.4% | 0 |
| kurios.DOSexe .9b | 6.0 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.5% | 10 |
| jangs.ns51 1.0 | 7.5 | 6.4% | 5 |
| sample.VelociRobot 1.0 | 8.3 | 6.0% | 4 |
| drd.Dreadknoght 0.9 | 9.9 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 69.2 | 6 / 35 | 4801 |
| 2 | 2 | 64.5 | 77.1 | 9 / 35 | 4433 |
| 3 | 3 | 65.6 | 78.4 | 5 / 35 | 5524 |
| 4 | 3 | 64.1 | 74.6 | 5 / 35 | 5046 |
| 5 | 4 | 63.1 | 69.8 | 8 / 35 | 4988 |
| 6 | 3 | 64.0 | 73.0 | 4 / 35 | 5242 |
| 7 | 3 | 63.1 | 70.5 | 9 / 35 | 4980 |
| 8 | 2 | 63.9 | 74.0 | 9 / 35 | 5064 |
| 9 | 2 | 64.0 | 74.0 | 6 / 35 | 5117 |
| 10 | 2 | 63.3 | 72.7 | 5 / 35 | 4995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 38% |
| d414.nano.Quantum 1.0.0 | 57 | 35% |
| wompi.Quokka 1.6 | 21 | 52% |
| drd.Dreadknoght 0.9 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 285 of 350 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 94 | 33% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 93 | 33% | 125 |
| wompi.Quokka 1.6 | 56 | 20% | 62 |
| maribo.FollowFire 1 | 15 | 5% | 14 |
| jangs.ns51 1.0 | 8 | 3% | 9 |
| kurios.DOSexe .9b | 8 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 6 | 2% | 10 |
| drd.Dreadknoght 0.9 | 3 | 1% | 3 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F05

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.2 | 71 / 350 | 3.50 | 14.7% | 45020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.7% | 135 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.6% | 72 |
| hadur117.nano.SanaroS10 0.1 | 2.5 | 14.7% | 71 |
| ntc.Opposite 1.5 | 4.4 | 12.1% | 20 |
| js.PinBall 1.6 | 5.0 | 11.1% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.5 | 10.9% | 16 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.3% | 10 |
| sample.Fire 1.0 | 8.1 | 5.0% | 3 |
| PSW.Relentless 0.1 | 8.9 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 78.1 | 12 / 35 | 4875 |
| 2 | 2 | 63.4 | 74.0 | 8 / 35 | 4445 |
| 3 | 3 | 61.5 | 67.9 | 6 / 35 | 4338 |
| 4 | 3 | 64.6 | 75.9 | 7 / 35 | 4831 |
| 5 | 3 | 61.3 | 68.3 | 6 / 35 | 4228 |
| 6 | 2 | 64.5 | 76.8 | 9 / 35 | 4439 |
| 7 | 3 | 60.6 | 64.8 | 5 / 35 | 4359 |
| 8 | 2 | 62.3 | 72.1 | 7 / 35 | 4311 |
| 9 | 4 | 61.6 | 70.2 | 5 / 35 | 4023 |
| 10 | 2 | 64.4 | 74.3 | 6 / 35 | 5171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 40% |
| d414.nano.Quantum 1.0.0 | 60 | 40% |
| ntc.Opposite 1.5 | 18 | 44% |
| js.PinBall 1.6 | 12 | 33% |
| sp.Nanos.Ember 1.1 | 9 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 67% |
| sample.Target 1.0 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 29% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 68 | 24% | 91 |
| ntc.Opposite 1.5 | 43 | 15% | 48 |
| js.PinBall 1.6 | 36 | 13% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 34 | 12% | 38 |
| sp.Nanos.Ember 1.1 | 13 | 5% | 17 |
| sample.Fire 1.0 | 3 | 1% | 4 |
| PSW.Relentless 0.1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 61.9 | 44 / 350 | 4.43 | 12.3% | 32367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.9 | 14.2% | 77 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.5% | 73 |
| radnor.DoctorBob 1.42 | 2.9 | 13.3% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.9 | 12.5% | 45 |
| hadur117.nano.SanaroS10 0.1 | 4.2 | 12.3% | 44 |
| myl.nano.Graviton 1.10 | 5.4 | 11.0% | 35 |
| stelo.MirrorNano 1.3 | 7.5 | 7.7% | 2 |
| ratosh.Wesco 1.4 | 8.1 | 7.3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.5 | 60.6 | 3 / 35 | 3222 |
| 2 | 5 | 56.8 | 61.0 | 2 / 35 | 2933 |
| 3 | 4 | 58.2 | 63.2 | 4 / 35 | 3121 |
| 4 | 6 | 55.4 | 55.2 | 0 / 35 | 3143 |
| 5 | 2 | 61.4 | 68.3 | 11 / 35 | 3304 |
| 6 | 6 | 55.6 | 56.5 | 2 / 35 | 2942 |
| 7 | 3 | 61.1 | 66.7 | 8 / 35 | 3602 |
| 8 | 3 | 60.1 | 65.7 | 3 / 35 | 3672 |
| 9 | 5 | 57.4 | 58.4 | 7 / 35 | 3202 |
| 10 | 3 | 58.5 | 63.2 | 4 / 35 | 3226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 42% |
| kawigi.nano.Lib 1.0 | 21 | 33% |
| radnor.DoctorBob 1.42 | 16 | 31% |
| myl.nano.Graviton 1.10 | 10 | 60% |
| ratosh.Wesco 1.4 | 2 | 0% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 23% | 84 |
| kawigi.nano.Lib 1.0 | 64 | 21% | 73 |
| radnor.DoctorBob 1.42 | 55 | 18% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 12% | 49 |
| myl.nano.Graviton 1.10 | 37 | 12% | 44 |
| ratosh.Wesco 1.4 | 18 | 6% | 18 |
| stelo.MirrorNano 1.3 | 13 | 4% | 14 |
| squidM.TentalceMeleeNano 1.1 | 10 | 3% | 11 |

## Melee bench: F07

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 59.5 | 24 / 350 | 4.64 | 11.7% | 34027 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.1% | 100 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.6% | 74 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.8% | 66 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.7% | 51 |
| hadur117.nano.SanaroS10 0.1 | 4.7 | 11.7% | 24 |
| oog.melee.CapuletDroid 1.1 | 5.6 | 11.0% | 23 |
| mz.Cork 0.1 | 6.4 | 10.1% | 9 |
| stelo.UntouchableNano 1.3 | 8.4 | 5.4% | 2 |
| stuff.Vlad 0.1 | 8.6 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 56.8 | 2 / 35 | 3563 |
| 2 | 4 | 56.3 | 59.4 | 2 / 35 | 3393 |
| 3 | 5 | 56.5 | 60.6 | 3 / 35 | 3226 |
| 4 | 6 | 54.9 | 56.5 | 1 / 35 | 3435 |
| 5 | 4 | 56.6 | 59.0 | 2 / 35 | 3664 |
| 6 | 3 | 56.6 | 61.6 | 3 / 35 | 3285 |
| 7 | 6 | 56.2 | 58.4 | 1 / 35 | 3204 |
| 8 | 5 | 56.7 | 58.1 | 3 / 35 | 3536 |
| 9 | 5 | 57.5 | 60.0 | 3 / 35 | 3505 |
| 10 | 4 | 58.5 | 64.8 | 4 / 35 | 3216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 18% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 47% |
| cb.nano.Insomnia 1.0 | 15 | 47% |
| nz.jdc.nano.GridFu 1.0 | 9 | 22% |
| oog.melee.CapuletDroid 1.1 | 3 | 67% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 326 of 350 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 87 | 27% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 77 | 24% | 88 |
| nz.jdc.nano.GridFu 1.0 | 45 | 14% | 48 |
| cb.nano.Insomnia 1.0 | 45 | 14% | 41 |
| oog.melee.CapuletDroid 1.1 | 37 | 11% | 39 |
| mz.Cork 0.1 | 25 | 8% | 25 |
| stelo.UntouchableNano 1.3 | 6 | 2% | 6 |
| stuff.Vlad 0.1 | 3 | 1% | 4 |
| sample.TrackFire 1.0 | 1 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 67.5 | 46 / 350 | 3.93 | 13.2% | 36444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 15.2% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.9 | 14.6% | 75 |
| hadur117.nano.SanaroS10 0.1 | 3.5 | 13.2% | 46 |
| gh.nano.Grofvuil 0.2 | 3.6 | 13.1% | 57 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.9% | 10 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 10.3% | 38 |
| baal.nano.N 1.42 | 6.7 | 9.5% | 4 |
| donjezza.Muncho 1.0 | 8.2 | 6.0% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.1 | 69.5 | 8 / 35 | 4091 |
| 2 | 5 | 57.2 | 63.5 | 1 / 35 | 3095 |
| 3 | 3 | 61.5 | 71.7 | 7 / 35 | 3531 |
| 4 | 3 | 61.4 | 71.7 | 4 / 35 | 3819 |
| 5 | 2 | 61.6 | 70.8 | 6 / 35 | 3738 |
| 6 | 4 | 59.6 | 66.7 | 4 / 35 | 3312 |
| 7 | 4 | 58.0 | 61.9 | 2 / 35 | 3611 |
| 8 | 3 | 62.4 | 70.8 | 6 / 35 | 4290 |
| 9 | 3 | 61.4 | 71.7 | 6 / 35 | 3406 |
| 10 | 4 | 56.2 | 56.5 | 2 / 35 | 3551 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 39% |
| d414.nano.Quantum 1.0.0 | 35 | 46% |
| gh.nano.Grofvuil 0.2 | 16 | 19% |
| djdjdj.NanoSkunk10 1.0 | 13 | 31% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 40% |
| donjezza.Muncho 1.0 | 3 | 67% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 305 of 350 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 88 | 29% | 106 |
| d414.nano.Quantum 1.0.0 | 67 | 22% | 85 |
| gh.nano.Grofvuil 0.2 | 57 | 19% | 60 |
| dmh.robocode.robot.RedDwarf 0.4 | 33 | 11% | 34 |
| djdjdj.NanoSkunk10 1.0 | 32 | 10% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 11 | 4% | 12 |
| baal.nano.N 1.42 | 10 | 3% | 9 |
| donjezza.Muncho 1.0 | 6 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.7 | 52.6 | 31 / 350 | 5.26 | 10.7% | 28970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 14.1% | 75 |
| mld.DustBunny 3.8 | 2.7 | 12.1% | 46 |
| stelo.SoRobotNanoMelee 1.2 | 3.2 | 11.8% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 11.0% | 31 |
| hadur117.nano.SanaroS10 0.1 | 5.2 | 10.7% | 31 |
| wee.Gem 1.8.4 | 5.2 | 10.9% | 48 |
| sheldor.melee.nano.TestMelee 0.1 | 6.5 | 9.4% | 32 |
| cs.sheldor.Talon 1.1 | 8.4 | 7.3% | 2 |
| tj.zombie1n 1.0.1 | 8.7 | 6.8% | 18 |
| step.nanoPri 1.0 | 9.8 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.6 | 50.5 | 3 / 35 | 2717 |
| 2 | 3 | 55.3 | 57.8 | 6 / 35 | 2988 |
| 3 | 6 | 51.8 | 50.5 | 4 / 35 | 2643 |
| 4 | 4 | 54.4 | 54.6 | 5 / 35 | 3146 |
| 5 | 5 | 52.9 | 53.7 | 2 / 35 | 3138 |
| 6 | 7 | 51.4 | 50.8 | 1 / 35 | 2789 |
| 7 | 6 | 52.2 | 53.0 | 2 / 35 | 2719 |
| 8 | 6 | 51.2 | 48.3 | 1 / 35 | 3159 |
| 9 | 5 | 54.7 | 56.8 | 4 / 35 | 2807 |
| 10 | 5 | 51.5 | 50.5 | 3 / 35 | 2864 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 38% |
| mld.DustBunny 3.8 | 15 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 25% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 50% |
| wee.Gem 1.8.4 | 4 | 75% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 75% |
| tj.zombie1n 1.0.1 | 2 | 0% |

Hadur died in 319 of 350 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 61 | 19% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 15% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 47 | 15% | 48 |
| mld.DustBunny 3.8 | 42 | 13% | 51 |
| cs.sheldor.Talon 1.1 | 35 | 11% | 35 |
| wee.Gem 1.8.4 | 33 | 10% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 30 | 9% | 33 |
| tj.zombie1n 1.0.1 | 15 | 5% | 16 |
| step.nanoPri 1.0 | 8 | 3% | 8 |

## Melee bench: F10

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.2 | 42 / 350 | 3.86 | 13.8% | 42109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.0% | 114 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.9% | 84 |
| hadur117.nano.SanaroS10 0.1 | 3.1 | 13.8% | 42 |
| mld.Infinity 2.2 | 3.3 | 14.1% | 87 |
| ayk.WallHugger 1.0 | 5.9 | 8.1% | 7 |
| conscience.Electron 1.3g | 6.3 | 7.8% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.6% | 3 |
| robar.nano.Assertive_Melee 0.2 | 7.1 | 7.4% | 3 |
| donjezza.Jezza 1.0 | 8.8 | 6.2% | 12 |
| sample.RamFire 1.0 | 9.9 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 70.2 | 6 / 35 | 4353 |
| 2 | 3 | 60.8 | 71.7 | 3 / 35 | 3773 |
| 3 | 4 | 61.4 | 70.8 | 2 / 35 | 4460 |
| 4 | 4 | 58.4 | 61.0 | 3 / 35 | 3988 |
| 5 | 2 | 60.6 | 67.9 | 9 / 35 | 3888 |
| 6 | 3 | 61.2 | 69.8 | 4 / 35 | 4331 |
| 7 | 4 | 61.1 | 67.0 | 3 / 35 | 4223 |
| 8 | 3 | 60.6 | 67.9 | 5 / 35 | 4060 |
| 9 | 3 | 62.2 | 71.4 | 5 / 35 | 4473 |
| 10 | 4 | 60.2 | 64.1 | 2 / 35 | 4560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 39% |
| mld.Infinity 2.2 | 31 | 23% |
| donjezza.Jezza 1.0 | 5 | 40% |
| ayk.WallHugger 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 311 of 350 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 92 | 30% | 115 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 92 | 30% | 111 |
| mld.Infinity 2.2 | 55 | 18% | 39 |
| ayk.WallHugger 1.0 | 17 | 5% | 21 |
| robar.nano.Assertive_Melee 0.2 | 14 | 5% | 17 |
| exauge.GateKeeper 1.1.121g | 14 | 5% | 16 |
| conscience.Electron 1.3g | 14 | 5% | 16 |
| donjezza.Jezza 1.0 | 8 | 3% | 10 |
| sample.RamFire 1.0 | 4 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 61.4 | 47 / 350 | 4.47 | 12.3% | 33869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.9% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.7% | 69 |
| oog.melee.Corsair 1.0 | 3.4 | 12.7% | 55 |
| hadur117.nano.SanaroS10 0.1 | 3.8 | 12.3% | 47 |
| mz.NanoGod 2.02 | 3.9 | 11.8% | 49 |
| awesomeness.Elite 1.0 | 7.1 | 7.8% | 4 |
| DBall.NUKE 0.1 | 7.1 | 7.8% | 12 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 7.6% | 6 |
| sample.Walls 1.0 | 8.1 | 7.2% | 14 |
| stelo.PianistNano 1.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 60.6 | 3 / 35 | 3138 |
| 2 | 2 | 60.1 | 65.1 | 11 / 35 | 3746 |
| 3 | 4 | 57.5 | 62.9 | 3 / 35 | 3434 |
| 4 | 5 | 54.0 | 55.2 | 3 / 35 | 2950 |
| 5 | 5 | 57.2 | 60.6 | 7 / 35 | 3149 |
| 6 | 5 | 54.9 | 55.2 | 2 / 35 | 3355 |
| 7 | 4 | 57.7 | 62.9 | 4 / 35 | 3389 |
| 8 | 5 | 56.6 | 60.0 | 2 / 35 | 3533 |
| 9 | 2 | 59.1 | 67.0 | 6 / 35 | 3353 |
| 10 | 2 | 59.4 | 64.8 | 6 / 35 | 3822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 33% |
| d414.nano.Quantum 1.0.0 | 28 | 43% |
| oog.melee.Corsair 1.0 | 16 | 31% |
| DBall.NUKE 0.1 | 12 | 50% |
| mz.NanoGod 2.02 | 10 | 50% |
| sample.Walls 1.0 | 6 | 67% |
| zyx.nano.BacillusComma 1.0 | 2 | 50% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 23% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 20% | 72 |
| oog.melee.Corsair 1.0 | 53 | 17% | 58 |
| mz.NanoGod 2.02 | 39 | 13% | 43 |
| zyx.nano.BacillusComma 1.0 | 27 | 9% | 30 |
| awesomeness.Elite 1.0 | 21 | 7% | 24 |
| DBall.NUKE 0.1 | 16 | 5% | 21 |
| sample.Walls 1.0 | 11 | 4% | 11 |
| stelo.PianistNano 1.2 | 6 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.7 | 59.1 | 23 / 350 | 4.68 | 11.7% | 31771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.1% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.0% | 62 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.3% | 51 |
| hadur117.nano.SanaroS10 0.1 | 3.9 | 11.7% | 23 |
| sul.Lunar 1.1 | 4.3 | 11.8% | 46 |
| sam.Samspin 1.0 | 7.1 | 8.1% | 17 |
| spinnercat.Omen 1.0 | 7.4 | 8.1% | 19 |
| maribo.melee.BMV 0.1 | 7.5 | 8.1% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.5% | 13 |
| cvt.Firsty 1.0 | 10.0 | 4.3% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.6 | 51.7 | 1 / 35 | 2963 |
| 2 | 5 | 54.9 | 58.7 | 2 / 35 | 3060 |
| 3 | 4 | 57.3 | 62.2 | 2 / 35 | 3308 |
| 4 | 3 | 54.6 | 56.8 | 2 / 35 | 3208 |
| 5 | 5 | 55.4 | 58.7 | 1 / 35 | 3151 |
| 6 | 4 | 55.0 | 58.1 | 2 / 35 | 3117 |
| 7 | 4 | 55.8 | 58.4 | 3 / 35 | 3210 |
| 8 | 4 | 57.0 | 61.3 | 5 / 35 | 3289 |
| 9 | 2 | 57.3 | 62.5 | 4 / 35 | 3129 |
| 10 | 3 | 56.7 | 62.2 | 1 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 26% |
| d414.nano.Quantum 1.0.0 | 23 | 17% |
| myl.nano.KomoriNinja 1.1 | 19 | 32% |
| sul.Lunar 1.1 | 14 | 7% |
| sample.SpinBot 1.0 | 5 | 40% |
| sam.Samspin 1.0 | 5 | 40% |
| spinnercat.Omen 1.0 | 3 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 329 of 350 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 21% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 65 | 20% | 73 |
| myl.nano.KomoriNinja 1.1 | 56 | 17% | 60 |
| sul.Lunar 1.1 | 49 | 15% | 51 |
| sam.Samspin 1.0 | 26 | 8% | 27 |
| spinnercat.Omen 1.0 | 23 | 7% | 23 |
| maribo.melee.BMV 0.1 | 20 | 6% | 22 |
| sample.SpinBot 1.0 | 16 | 5% | 16 |
| cvt.Firsty 1.0 | 4 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 61.7 | 45 / 350 | 4.45 | 12.0% | 31636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.3% | 105 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.2 | 13.7% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 12.7% | 47 |
| hadur117.nano.SanaroS10 0.1 | 3.7 | 12.0% | 45 |
| mld.Wisdom 1.0 | 4.5 | 11.3% | 27 |
| tvv.nano.Polaris 1.2 | 6.5 | 8.9% | 23 |
| zyx.nano.Ant 1.1 | 7.6 | 8.1% | 7 |
| amz.NanoClone 1.41 | 7.7 | 7.9% | 7 |
| arthord.NanoSatanMelee Beta | 8.2 | 7.9% | 13 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.8 | 56.5 | 3 / 35 | 2941 |
| 2 | 3 | 57.2 | 61.6 | 4 / 35 | 3230 |
| 3 | 5 | 54.6 | 58.1 | 4 / 35 | 2883 |
| 4 | 2 | 58.7 | 67.6 | 6 / 35 | 3196 |
| 5 | 5 | 55.8 | 58.4 | 2 / 35 | 3444 |
| 6 | 3 | 57.6 | 63.5 | 6 / 35 | 3286 |
| 7 | 3 | 58.0 | 64.8 | 4 / 35 | 3365 |
| 8 | 5 | 54.3 | 55.6 | 5 / 35 | 3027 |
| 9 | 4 | 57.7 | 62.5 | 6 / 35 | 3148 |
| 10 | 2 | 58.3 | 68.3 | 5 / 35 | 3116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 45% |
| d414.nano.Quantum 1.0.0 | 29 | 41% |
| davidalves.net.DuelistNanoMelee 1.01 | 19 | 47% |
| mld.Wisdom 1.0 | 6 | 33% |
| tvv.nano.Polaris 1.2 | 5 | 0% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 0% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 20% | 77 |
| d414.nano.Quantum 1.0.0 | 58 | 19% | 73 |
| davidalves.net.DuelistNanoMelee 1.01 | 57 | 19% | 63 |
| mld.Wisdom 1.0 | 53 | 17% | 53 |
| amz.NanoClone 1.41 | 22 | 7% | 22 |
| arthord.NanoSatanMelee Beta | 19 | 6% | 22 |
| tvv.nano.Polaris 1.2 | 19 | 6% | 21 |
| zyx.nano.Ant 1.1 | 14 | 5% | 15 |
| arthord.MannyPacquiao Beta | 3 | 1% | 4 |
1 death(s) with no robot to name.

