# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 64.4 | 54 / 350 | 4.20 | 13.0% | 35819 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.1% | 153 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 13.7% | 44 |
| hadur117.nano.SanaroB1000 0.1 | 3.1 | 13.0% | 54 |
| bzdp.Pansy 2.1 | 3.5 | 12.2% | 42 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.6% | 8 |
| tvv.nano.Polaris 1.2 | 5.9 | 9.4% | 23 |
| zyx.nano.Ant 1.1 | 7.1 | 8.3% | 9 |
| fm.claire 1.7 | 7.2 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.5% | 14 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 64.1 | 5 / 35 | 3456 |
| 2 | 2 | 60.9 | 69.2 | 10 / 35 | 3585 |
| 3 | 3 | 58.3 | 63.8 | 3 / 35 | 3496 |
| 4 | 2 | 62.4 | 70.8 | 8 / 35 | 3810 |
| 5 | 4 | 57.6 | 58.4 | 4 / 35 | 3694 |
| 6 | 4 | 58.2 | 62.2 | 6 / 35 | 3565 |
| 7 | 2 | 60.4 | 67.9 | 4 / 35 | 3816 |
| 8 | 3 | 57.7 | 62.2 | 4 / 35 | 3437 |
| 9 | 4 | 57.3 | 60.3 | 5 / 35 | 3258 |
| 10 | 3 | 59.4 | 65.1 | 5 / 35 | 3702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 13% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 74% |
| bzdp.Pansy 2.1 | 20 | 60% |
| arthord.NanoSatanMelee Beta | 9 | 89% |
| tvv.nano.Polaris 1.2 | 6 | 50% |
| fm.claire 1.7 | 4 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 604. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 90 | 30% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 17% | 71 |
| bzdp.Pansy 2.1 | 45 | 15% | 56 |
| arthord.NanoSatanMelee Beta | 28 | 9% | 35 |
| fm.claire 1.7 | 26 | 9% | 28 |
| zyx.nano.Ant 1.1 | 24 | 8% | 26 |
| tvv.nano.Polaris 1.2 | 17 | 6% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 3% | 10 |
| arthord.MannyPacquiao Beta | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 65.9 | 43 / 350 | 4.07 | 13.1% | 33760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.3% | 97 |
| hadur117.nano.SanaroB1000 0.1 | 2.8 | 13.1% | 43 |
| simonton.nano.MeleeSeed 1.8 | 2.8 | 13.2% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.1% | 39 |
| DBall.Anarchy 0.1 | 4.8 | 11.6% | 67 |
| fm.mammillarias 1.3 | 6.4 | 9.5% | 0 |
| stelo.SoJNanoMelee 1.1 | 6.9 | 8.8% | 38 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 7.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.5% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 63.8 | 4 / 35 | 3172 |
| 2 | 2 | 61.4 | 70.2 | 6 / 35 | 3547 |
| 3 | 4 | 58.4 | 60.6 | 3 / 35 | 3210 |
| 4 | 3 | 60.7 | 69.2 | 3 / 35 | 3467 |
| 5 | 3 | 59.1 | 65.1 | 5 / 35 | 3111 |
| 6 | 3 | 60.2 | 66.3 | 5 / 35 | 3289 |
| 7 | 2 | 61.1 | 67.0 | 4 / 35 | 3890 |
| 8 | 4 | 57.8 | 61.9 | 4 / 35 | 2959 |
| 9 | 2 | 61.4 | 68.9 | 5 / 35 | 3738 |
| 10 | 2 | 59.5 | 66.0 | 4 / 35 | 3377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 31% |
| simonton.nano.MeleeSeed 1.8 | 21 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 89% |
| DBall.Anarchy 0.1 | 19 | 21% |
| stelo.SoJNanoMelee 1.1 | 9 | 33% |
| sample.MyFirstRobot 1.0 | 3 | 33% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 27% | 91 |
| simonton.nano.MeleeSeed 1.8 | 62 | 20% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 16% | 69 |
| DBall.Anarchy 0.1 | 35 | 11% | 38 |
| stelo.SoJNanoMelee 1.1 | 35 | 11% | 36 |
| fm.mammillarias 1.3 | 29 | 9% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 3% | 8 |
| sample.MyFirstRobot 1.0 | 7 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 0% | 2 |

## Melee bench: F03

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 65.4 | 48 / 350 | 4.11 | 13.4% | 40784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.5% | 117 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.9% | 48 |
| hadur117.nano.SanaroB1000 0.1 | 2.9 | 13.4% | 48 |
| ahf.NanoAndrew .4 | 3.9 | 12.4% | 64 |
| ratosh.Nobo 0.21 | 4.8 | 11.1% | 17 |
| timmit.nano.TimDog 0.33 | 6.1 | 9.5% | 17 |
| stelo.PatternRobot 1.0 | 7.1 | 7.4% | 25 |
| repositorio.NanoStep 1.0 | 8.2 | 6.3% | 11 |
| sample.Crazy 1.0 | 8.7 | 5.8% | 3 |
| kurios.DOSexe .9a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 70.2 | 4 / 35 | 4180 |
| 2 | 2 | 60.8 | 67.3 | 4 / 35 | 4328 |
| 3 | 2 | 62.5 | 71.1 | 7 / 35 | 4338 |
| 4 | 4 | 59.2 | 65.1 | 4 / 35 | 3997 |
| 5 | 3 | 56.3 | 57.8 | 3 / 35 | 3830 |
| 6 | 5 | 55.2 | 55.9 | 2 / 35 | 3602 |
| 7 | 4 | 58.2 | 63.2 | 5 / 35 | 3645 |
| 8 | 2 | 60.9 | 68.9 | 7 / 35 | 4141 |
| 9 | 3 | 60.7 | 67.3 | 6 / 35 | 4317 |
| 10 | 2 | 61.0 | 67.6 | 6 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 65% |
| d414.nano.Quantum 1.0.0 | 34 | 38% |
| ahf.NanoAndrew .4 | 19 | 16% |
| repositorio.NanoStep 1.0 | 8 | 63% |
| timmit.nano.TimDog 0.33 | 6 | 17% |
| stelo.PatternRobot 1.0 | 5 | 0% |
| ratosh.Nobo 0.21 | 5 | 40% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 303 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 24% | 86 |
| ahf.NanoAndrew .4 | 61 | 20% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 17% | 73 |
| ratosh.Nobo 0.21 | 32 | 11% | 33 |
| timmit.nano.TimDog 0.33 | 31 | 10% | 34 |
| stelo.PatternRobot 1.0 | 22 | 7% | 21 |
| repositorio.NanoStep 1.0 | 14 | 5% | 19 |
| sample.Crazy 1.0 | 9 | 3% | 10 |
| kurios.DOSexe .9a | 9 | 3% | 9 |

## Melee bench: F04

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 73.7 | 63 / 350 | 3.37 | 15.5% | 52471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 17.6% | 163 |
| hadur117.nano.SanaroB1000 0.1 | 2.4 | 15.5% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.4% | 60 |
| wompi.Quokka 1.6 | 3.5 | 14.6% | 56 |
| kurios.DOSexe .9b | 5.7 | 7.1% | 0 |
| maribo.FollowFire 1 | 6.6 | 6.8% | 0 |
| jangs.ns51 1.0 | 6.9 | 6.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.3 | 6.5% | 4 |
| sample.VelociRobot 1.0 | 8.5 | 5.9% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 79.0 | 9 / 35 | 5480 |
| 2 | 4 | 60.6 | 67.6 | 1 / 35 | 4243 |
| 3 | 1 | 66.8 | 75.9 | 12 / 35 | 6215 |
| 4 | 3 | 63.9 | 74.3 | 6 / 35 | 5001 |
| 5 | 2 | 65.4 | 79.4 | 8 / 35 | 5106 |
| 6 | 3 | 63.2 | 69.2 | 4 / 35 | 5202 |
| 7 | 1 | 64.4 | 75.2 | 7 / 35 | 5262 |
| 8 | 2 | 65.6 | 73.7 | 9 / 35 | 5913 |
| 9 | 4 | 62.1 | 68.6 | 4 / 35 | 4981 |
| 10 | 2 | 63.7 | 73.7 | 3 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 9% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 80% |
| wompi.Quokka 1.6 | 32 | 53% |
| jangs.ns51 1.0 | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 287 of 350 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 130 | 45% | 136 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59 | 21% | 98 |
| wompi.Quokka 1.6 | 56 | 20% | 65 |
| sample.MyFirstJuniorRobot 1.0 | 11 | 4% | 13 |
| maribo.FollowFire 1 | 9 | 3% | 9 |
| kurios.DOSexe .9b | 6 | 2% | 9 |
| jangs.ns51 1.0 | 6 | 2% | 7 |
| sample.VelociRobot 1.0 | 5 | 2% | 7 |
| drd.Dreadknoght 0.9 | 5 | 2% | 6 |

## Melee bench: F05

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 70.6 | 66 / 350 | 3.65 | 14.5% | 46376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.4% | 167 |
| hadur117.nano.SanaroB1000 0.1 | 2.4 | 14.5% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 14.1% | 37 |
| ntc.Opposite 1.5 | 4.1 | 12.3% | 18 |
| js.PinBall 1.6 | 5.0 | 11.6% | 34 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.6% | 13 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.5% | 13 |
| sample.Fire 1.0 | 8.4 | 4.6% | 2 |
| PSW.Relentless 0.1 | 8.8 | 4.3% | 0 |
| sample.Target 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.3 | 67.3 | 5 / 35 | 4144 |
| 2 | 2 | 62.8 | 68.3 | 7 / 35 | 4947 |
| 3 | 3 | 62.3 | 69.2 | 6 / 35 | 4535 |
| 4 | 2 | 61.9 | 68.9 | 5 / 35 | 4475 |
| 5 | 2 | 64.8 | 75.2 | 8 / 35 | 5218 |
| 6 | 2 | 64.3 | 75.2 | 9 / 35 | 4928 |
| 7 | 2 | 63.6 | 73.0 | 6 / 35 | 4764 |
| 8 | 3 | 62.0 | 68.3 | 5 / 35 | 4680 |
| 9 | 2 | 62.6 | 71.4 | 7 / 35 | 4307 |
| 10 | 2 | 62.0 | 69.2 | 8 / 35 | 4378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 18% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 47% |
| ntc.Opposite 1.5 | 14 | 50% |
| sp.Nanos.Ember 1.1 | 11 | 64% |
| js.PinBall 1.6 | 9 | 56% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 285 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 109 | 38% | 122 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59 | 21% | 88 |
| ntc.Opposite 1.5 | 35 | 12% | 42 |
| simonton.nano.WeekendObsession_Melee 1.0 | 30 | 11% | 32 |
| js.PinBall 1.6 | 29 | 10% | 36 |
| sp.Nanos.Ember 1.1 | 13 | 5% | 18 |
| PSW.Relentless 0.1 | 8 | 3% | 9 |
| sample.Fire 1.0 | 2 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 60.2 | 44 / 350 | 4.58 | 12.0% | 32602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 13.6% | 74 |
| kawigi.nano.Lib 1.0 | 2.4 | 13.8% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 37 |
| radnor.DoctorBob 1.42 | 3.8 | 12.8% | 61 |
| myl.nano.Graviton 1.10 | 4.4 | 11.9% | 52 |
| hadur117.nano.SanaroB1000 0.1 | 4.7 | 12.0% | 44 |
| squidM.TentalceMeleeNano 1.1 | 7.9 | 7.6% | 6 |
| stelo.MirrorNano 1.3 | 8.0 | 7.3% | 0 |
| ratosh.Wesco 1.4 | 8.1 | 7.3% | 6 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.4 | 58.7 | 6 / 35 | 3214 |
| 2 | 1 | 61.1 | 67.9 | 9 / 35 | 3689 |
| 3 | 6 | 56.2 | 60.6 | 3 / 35 | 2756 |
| 4 | 1 | 62.1 | 70.5 | 8 / 35 | 3871 |
| 5 | 6 | 55.7 | 55.9 | 3 / 35 | 3234 |
| 6 | 6 | 53.8 | 53.3 | 2 / 35 | 2685 |
| 7 | 6 | 56.6 | 59.0 | 3 / 35 | 3039 |
| 8 | 6 | 57.4 | 57.1 | 5 / 35 | 3478 |
| 9 | 5 | 57.0 | 59.0 | 3 / 35 | 3339 |
| 10 | 6 | 57.4 | 59.7 | 2 / 35 | 3297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 35% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 58% |
| radnor.DoctorBob 1.42 | 17 | 41% |
| kawigi.nano.Lib 1.0 | 14 | 43% |
| myl.nano.Graviton 1.10 | 9 | 22% |
| ratosh.Wesco 1.4 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 306 of 350 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 20% | 68 |
| d414.nano.Quantum 1.0.0 | 61 | 20% | 70 |
| radnor.DoctorBob 1.42 | 56 | 18% | 61 |
| myl.nano.Graviton 1.10 | 47 | 15% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 14% | 61 |
| squidM.TentalceMeleeNano 1.1 | 13 | 4% | 13 |
| stelo.MirrorNano 1.3 | 12 | 4% | 14 |
| ratosh.Wesco 1.4 | 12 | 4% | 13 |

## Melee bench: F07

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 61.4 | 47 / 350 | 4.47 | 12.5% | 37603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.5% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 12.8% | 58 |
| nz.jdc.nano.GridFu 1.0 | 3.4 | 12.8% | 57 |
| cb.nano.Insomnia 1.0 | 3.8 | 12.5% | 53 |
| hadur117.nano.SanaroB1000 0.1 | 3.9 | 12.5% | 47 |
| mz.Cork 0.1 | 5.8 | 11.0% | 19 |
| oog.melee.CapuletDroid 1.1 | 6.4 | 10.5% | 28 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.2% | 0 |
| stuff.Vlad 0.1 | 8.5 | 5.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 62.9 | 3 / 35 | 3764 |
| 2 | 2 | 60.5 | 66.0 | 4 / 35 | 3962 |
| 3 | 4 | 57.4 | 59.7 | 4 / 35 | 3706 |
| 4 | 7 | 55.6 | 54.6 | 4 / 35 | 3312 |
| 5 | 4 | 56.9 | 61.6 | 2 / 35 | 3327 |
| 6 | 4 | 59.2 | 62.5 | 8 / 35 | 3494 |
| 7 | 7 | 54.4 | 53.3 | 3 / 35 | 3263 |
| 8 | 2 | 60.1 | 66.7 | 4 / 35 | 4046 |
| 9 | 2 | 60.4 | 63.8 | 7 / 35 | 4424 |
| 10 | 3 | 60.6 | 63.2 | 8 / 35 | 4305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 21 | 48% |
| d414.nano.Quantum 1.0.0 | 17 | 41% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 73% |
| oog.melee.CapuletDroid 1.1 | 10 | 70% |
| mz.Cork 0.1 | 9 | 67% |
| cb.nano.Insomnia 1.0 | 7 | 57% |
| sample.TrackFire 1.0 | 1 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 27% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 58 | 19% | 76 |
| nz.jdc.nano.GridFu 1.0 | 45 | 15% | 51 |
| cb.nano.Insomnia 1.0 | 45 | 15% | 43 |
| oog.melee.CapuletDroid 1.1 | 34 | 11% | 34 |
| mz.Cork 0.1 | 29 | 10% | 37 |
| stelo.UntouchableNano 1.3 | 4 | 1% | 5 |
| sample.TrackFire 1.0 | 4 | 1% | 5 |
| stuff.Vlad 0.1 | 3 | 1% | 3 |

## Melee bench: F08

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 70.5 | 63 / 350 | 3.65 | 14.1% | 40300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.9% | 132 |
| hadur117.nano.SanaroB1000 0.1 | 2.2 | 14.1% | 63 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.8% | 36 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.4% | 48 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.8 | 11.3% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6.2 | 10.2% | 37 |
| baal.nano.N 1.42 | 6.8 | 9.3% | 10 |
| donjezza.Muncho 1.0 | 8.4 | 5.9% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.6 | 5.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.6 | 5 / 35 | 3685 |
| 2 | 1 | 63.7 | 73.7 | 6 / 35 | 4584 |
| 3 | 2 | 61.8 | 70.2 | 8 / 35 | 3980 |
| 4 | 3 | 59.5 | 63.8 | 4 / 35 | 3710 |
| 5 | 4 | 58.8 | 63.8 | 5 / 35 | 3566 |
| 6 | 3 | 61.5 | 69.5 | 5 / 35 | 3854 |
| 7 | 2 | 61.6 | 69.5 | 6 / 35 | 4206 |
| 8 | 1 | 63.0 | 72.4 | 8 / 35 | 4389 |
| 9 | 2 | 63.2 | 74.0 | 10 / 35 | 3941 |
| 10 | 2 | 63.2 | 73.7 | 6 / 35 | 4385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 44 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 83% |
| djdjdj.NanoSkunk10 1.0 | 14 | 57% |
| gh.nano.Grofvuil 0.2 | 9 | 11% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 43% |
| baal.nano.N 1.42 | 7 | 86% |
| donjezza.Muncho 1.0 | 3 | 67% |

Hadur died in 287 of 350 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 99 | 34% | 110 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 17% | 84 |
| dmh.robocode.robot.RedDwarf 0.4 | 39 | 14% | 43 |
| djdjdj.NanoSkunk10 1.0 | 39 | 14% | 42 |
| gh.nano.Grofvuil 0.2 | 38 | 13% | 42 |
| baal.nano.N 1.42 | 14 | 5% | 19 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 4 |
| donjezza.Muncho 1.0 | 4 | 1% | 6 |

## Melee bench: F09

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.5 | 55.3 | 29 / 350 | 5.02 | 11.0% | 29143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 13.4% | 75 |
| mld.DustBunny 3.8 | 3.0 | 11.9% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 3.5 | 11.5% | 62 |
| hadur117.nano.SanaroB1000 0.1 | 4.6 | 11.0% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.9 | 11.0% | 31 |
| wee.Gem 1.8.4 | 5.0 | 10.8% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 10.4% | 42 |
| tj.zombie1n 1.0.1 | 8.5 | 7.3% | 29 |
| cs.sheldor.Talon 1.1 | 8.7 | 7.0% | 3 |
| step.nanoPri 1.0 | 9.8 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 52.6 | 54.3 | 3 / 35 | 2762 |
| 2 | 5 | 52.9 | 53.7 | 3 / 35 | 2806 |
| 3 | 6 | 53.3 | 54.9 | 3 / 35 | 2858 |
| 4 | 7 | 52.0 | 51.7 | 2 / 35 | 2871 |
| 5 | 4 | 55.1 | 57.5 | 4 / 35 | 3207 |
| 6 | 1 | 57.6 | 63.2 | 6 / 35 | 3242 |
| 7 | 4 | 52.4 | 51.4 | 2 / 35 | 3151 |
| 8 | 5 | 53.2 | 55.2 | 3 / 35 | 2537 |
| 9 | 4 | 52.4 | 53.7 | 1 / 35 | 2891 |
| 10 | 6 | 54.0 | 57.5 | 2 / 35 | 2818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 19 | 37% |
| d414.nano.Quantum 1.0.0 | 19 | 32% |
| mld.DustBunny 3.8 | 12 | 42% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 63% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 75% |
| tj.zombie1n 1.0.1 | 4 | 0% |
| wee.Gem 1.8.4 | 4 | 0% |

Hadur died in 322 of 350 rounds, at a mean tick of 555. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 67 | 21% | 75 |
| stelo.SoRobotNanoMelee 1.2 | 54 | 17% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 16% | 56 |
| mld.DustBunny 3.8 | 48 | 15% | 54 |
| wee.Gem 1.8.4 | 33 | 10% | 35 |
| sheldor.melee.nano.TestMelee 0.1 | 24 | 7% | 30 |
| cs.sheldor.Talon 1.1 | 19 | 6% | 19 |
| tj.zombie1n 1.0.1 | 15 | 5% | 13 |
| step.nanoPri 1.0 | 12 | 4% | 12 |

## Melee bench: F10

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 71.0 | 71 / 350 | 3.61 | 14.6% | 43659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.4% | 108 |
| mld.Infinity 2.2 | 2.7 | 14.3% | 99 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.3% | 46 |
| hadur117.nano.SanaroB1000 0.1 | 3.0 | 14.6% | 71 |
| ayk.WallHugger 1.0 | 6.1 | 7.8% | 8 |
| conscience.Electron 1.3g | 6.5 | 7.8% | 1 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 4 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 7.5% | 7 |
| donjezza.Jezza 1.0 | 8.9 | 5.5% | 6 |
| sample.RamFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 65.4 | 4 / 35 | 4271 |
| 2 | 2 | 62.9 | 73.7 | 7 / 35 | 4384 |
| 3 | 4 | 60.6 | 67.6 | 4 / 35 | 3978 |
| 4 | 4 | 60.5 | 67.9 | 8 / 35 | 3561 |
| 5 | 3 | 62.6 | 70.8 | 8 / 35 | 4514 |
| 6 | 4 | 59.7 | 66.3 | 6 / 35 | 3870 |
| 7 | 1 | 64.2 | 74.6 | 11 / 35 | 4822 |
| 8 | 2 | 65.4 | 76.5 | 10 / 35 | 5258 |
| 9 | 4 | 61.6 | 68.3 | 5 / 35 | 4422 |
| 10 | 2 | 64.4 | 78.4 | 8 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 85% |
| d414.nano.Quantum 1.0.0 | 38 | 32% |
| mld.Infinity 2.2 | 30 | 37% |
| ayk.WallHugger 1.0 | 6 | 50% |
| donjezza.Jezza 1.0 | 4 | 25% |
| robar.nano.Assertive_Melee 0.2 | 3 | 33% |
| conscience.Electron 1.3g | 2 | 50% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 107 | 38% | 127 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 70 | 25% | 122 |
| mld.Infinity 2.2 | 49 | 18% | 34 |
| robar.nano.Assertive_Melee 0.2 | 17 | 6% | 17 |
| ayk.WallHugger 1.0 | 15 | 5% | 19 |
| conscience.Electron 1.3g | 11 | 4% | 15 |
| exauge.GateKeeper 1.1.121g | 5 | 2% | 8 |
| donjezza.Jezza 1.0 | 5 | 2% | 7 |

## Melee bench: F11

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.2 | 61.1 | 48 / 350 | 4.50 | 12.3% | 34157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 102 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.6% | 49 |
| oog.melee.Corsair 1.0 | 3.3 | 12.7% | 59 |
| hadur117.nano.SanaroB1000 0.1 | 3.8 | 12.3% | 48 |
| mz.NanoGod 2.02 | 4.4 | 11.5% | 55 |
| DBall.NUKE 0.1 | 6.8 | 8.1% | 16 |
| zyx.nano.BacillusComma 1.0 | 7.1 | 8.0% | 0 |
| awesomeness.Elite 1.0 | 7.3 | 7.8% | 4 |
| sample.Walls 1.0 | 8.8 | 6.8% | 17 |
| stelo.PianistNano 1.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 65.4 | 7 / 35 | 2985 |
| 2 | 2 | 58.3 | 62.2 | 7 / 35 | 3525 |
| 3 | 3 | 58.9 | 62.9 | 7 / 35 | 3618 |
| 4 | 3 | 58.1 | 62.2 | 4 / 35 | 3901 |
| 5 | 5 | 55.0 | 57.5 | 4 / 35 | 3086 |
| 6 | 4 | 56.7 | 61.6 | 4 / 35 | 3342 |
| 7 | 5 | 56.7 | 61.0 | 2 / 35 | 3550 |
| 8 | 4 | 58.3 | 62.9 | 5 / 35 | 3502 |
| 9 | 5 | 54.1 | 53.7 | 2 / 35 | 3408 |
| 10 | 3 | 57.3 | 61.6 | 6 / 35 | 3240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 85% |
| d414.nano.Quantum 1.0.0 | 24 | 29% |
| mz.NanoGod 2.02 | 15 | 40% |
| oog.melee.Corsair 1.0 | 13 | 46% |
| sample.Walls 1.0 | 6 | 0% |
| DBall.NUKE 0.1 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |

Hadur died in 302 of 350 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 26% | 86 |
| mz.NanoGod 2.02 | 58 | 19% | 63 |
| oog.melee.Corsair 1.0 | 50 | 17% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 13% | 62 |
| zyx.nano.BacillusComma 1.0 | 31 | 10% | 33 |
| awesomeness.Elite 1.0 | 15 | 5% | 16 |
| sample.Walls 1.0 | 14 | 5% | 14 |
| DBall.NUKE 0.1 | 8 | 3% | 11 |
| stelo.PianistNano 1.2 | 8 | 3% | 8 |

## Melee bench: F12

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 61.0 | 38 / 350 | 4.51 | 12.3% | 34484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.1% | 117 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 12.7% | 44 |
| hadur117.nano.SanaroB1000 0.1 | 3.0 | 12.3% | 38 |
| myl.nano.KomoriNinja 1.1 | 3.8 | 11.7% | 50 |
| sul.Lunar 1.1 | 5.0 | 10.8% | 39 |
| sam.Samspin 1.0 | 6.9 | 8.5% | 20 |
| maribo.melee.BMV 0.1 | 7.3 | 8.3% | 5 |
| sample.SpinBot 1.0 | 7.7 | 8.1% | 16 |
| spinnercat.Omen 1.0 | 7.8 | 7.8% | 15 |
| cvt.Firsty 1.0 | 10.0 | 4.7% | 7 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 51.6 | 52.4 | 2 / 35 | 2688 |
| 2 | 3 | 56.7 | 59.7 | 5 / 35 | 3492 |
| 3 | 3 | 57.1 | 62.2 | 3 / 35 | 3345 |
| 4 | 2 | 57.1 | 61.0 | 5 / 35 | 3406 |
| 5 | 2 | 59.2 | 68.3 | 4 / 35 | 3326 |
| 6 | 3 | 57.7 | 61.9 | 6 / 35 | 3550 |
| 7 | 3 | 57.3 | 59.7 | 4 / 35 | 3926 |
| 8 | 3 | 59.5 | 67.0 | 1 / 35 | 3901 |
| 9 | 4 | 55.8 | 56.8 | 7 / 35 | 3411 |
| 10 | 3 | 56.3 | 60.6 | 1 / 35 | 3439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 31% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 61% |
| sul.Lunar 1.1 | 15 | 60% |
| myl.nano.KomoriNinja 1.1 | 14 | 21% |
| sample.SpinBot 1.0 | 6 | 67% |
| sam.Samspin 1.0 | 5 | 20% |
| spinnercat.Omen 1.0 | 5 | 0% |
| maribo.melee.BMV 0.1 | 3 | 33% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 312 of 350 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 81 | 26% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 64 | 21% | 78 |
| myl.nano.KomoriNinja 1.1 | 44 | 14% | 48 |
| sul.Lunar 1.1 | 28 | 9% | 37 |
| sample.SpinBot 1.0 | 23 | 7% | 24 |
| maribo.melee.BMV 0.1 | 23 | 7% | 23 |
| spinnercat.Omen 1.0 | 22 | 7% | 23 |
| sam.Samspin 1.0 | 21 | 7% | 22 |
| cvt.Firsty 1.0 | 6 | 2% | 6 |

## Melee bench: F13

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.5 | 68 / 350 | 4.19 | 12.8% | 33470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 14.2% | 107 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.0 | 13.8% | 86 |
| hadur117.nano.SanaroB1000 0.1 | 2.9 | 12.8% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 11.9% | 26 |
| mld.Wisdom 1.0 | 4.7 | 11.2% | 18 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.9% | 17 |
| amz.NanoClone 1.41 | 7.4 | 8.2% | 9 |
| arthord.NanoSatanMelee Beta | 7.9 | 8.0% | 9 |
| zyx.nano.Ant 1.1 | 8.2 | 7.7% | 10 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 68.6 | 8 / 35 | 3553 |
| 2 | 3 | 57.5 | 63.5 | 7 / 35 | 3129 |
| 3 | 3 | 57.2 | 61.6 | 3 / 35 | 3526 |
| 4 | 2 | 61.0 | 70.2 | 10 / 35 | 3579 |
| 5 | 3 | 60.0 | 67.0 | 10 / 35 | 3648 |
| 6 | 2 | 59.2 | 68.3 | 5 / 35 | 3451 |
| 7 | 5 | 52.8 | 54.6 | 4 / 35 | 2633 |
| 8 | 4 | 57.8 | 61.0 | 7 / 35 | 3333 |
| 9 | 3 | 58.6 | 65.4 | 6 / 35 | 3184 |
| 10 | 2 | 58.8 | 65.1 | 8 / 35 | 3434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 37 | 49% |
| d414.nano.Quantum 1.0.0 | 28 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 78% |
| arthord.NanoSatanMelee Beta | 12 | 92% |
| mld.Wisdom 1.0 | 4 | 50% |
| tvv.nano.Polaris 1.2 | 4 | 50% |
| amz.NanoClone 1.41 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 283 of 350 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 24% | 85 |
| davidalves.net.DuelistNanoMelee 1.01 | 58 | 20% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 17% | 64 |
| mld.Wisdom 1.0 | 39 | 14% | 43 |
| amz.NanoClone 1.41 | 19 | 7% | 20 |
| arthord.NanoSatanMelee Beta | 18 | 6% | 27 |
| tvv.nano.Polaris 1.2 | 18 | 6% | 19 |
| zyx.nano.Ant 1.1 | 12 | 4% | 14 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

