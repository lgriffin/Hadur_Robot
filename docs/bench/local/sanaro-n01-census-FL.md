# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.5 | 79 / 350 | 3.93 | 13.6% | 35394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.0% | 135 |
| hadur117.nano.SanaroFL 0.1 | 2.5 | 13.6% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.4% | 50 |
| bzdp.Pansy 2.1 | 3.8 | 12.0% | 36 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.7% | 10 |
| tvv.nano.Polaris 1.2 | 6.4 | 9.0% | 14 |
| fm.claire 1.7 | 6.9 | 8.7% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 8.4% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.3% | 12 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 69.8 | 12 / 35 | 3554 |
| 2 | 3 | 60.5 | 67.9 | 8 / 35 | 3563 |
| 3 | 3 | 60.5 | 68.3 | 8 / 35 | 3566 |
| 4 | 3 | 58.6 | 62.9 | 7 / 35 | 3506 |
| 5 | 2 | 60.0 | 67.0 | 8 / 35 | 3595 |
| 6 | 2 | 61.7 | 70.5 | 8 / 35 | 3801 |
| 7 | 2 | 63.0 | 73.0 | 10 / 35 | 3852 |
| 8 | 3 | 60.1 | 68.3 | 5 / 35 | 3333 |
| 9 | 3 | 57.8 | 62.2 | 5 / 35 | 3351 |
| 10 | 2 | 58.5 | 65.1 | 8 / 35 | 3273 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 81% |
| d414.nano.Quantum 1.0.0 | 42 | 19% |
| bzdp.Pansy 2.1 | 28 | 68% |
| tvv.nano.Polaris 1.2 | 6 | 67% |
| zyx.nano.Ant 1.1 | 4 | 25% |
| fm.claire 1.7 | 3 | 33% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |

Hadur died in 271 of 350 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 100 | 37% | 110 |
| bzdp.Pansy 2.1 | 37 | 14% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 13% | 79 |
| arthord.NanoSatanMelee Beta | 26 | 10% | 28 |
| fm.claire 1.7 | 25 | 9% | 26 |
| zyx.nano.Ant 1.1 | 21 | 8% | 21 |
| tvv.nano.Polaris 1.2 | 14 | 5% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 4% | 12 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |

## Melee bench: F02

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 68.3 | 58 / 350 | 3.86 | 13.2% | 30391 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 14.6% | 81 |
| simonton.nano.MeleeSeed 1.8 | 3.1 | 12.7% | 46 |
| hadur117.nano.SanaroFL 0.1 | 3.1 | 13.2% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.2% | 36 |
| DBall.Anarchy 0.1 | 5.0 | 11.2% | 53 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 9.8% | 57 |
| fm.mammillarias 1.3 | 6.5 | 9.5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 7.9 | 7.9% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.6% | 13 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.6 | 60.6 | 5 / 35 | 3173 |
| 2 | 4 | 59.3 | 64.8 | 6 / 35 | 3061 |
| 3 | 5 | 56.5 | 59.4 | 5 / 35 | 2836 |
| 4 | 2 | 62.2 | 73.7 | 10 / 35 | 3422 |
| 5 | 3 | 59.0 | 67.3 | 4 / 35 | 2850 |
| 6 | 3 | 61.8 | 72.7 | 8 / 35 | 2985 |
| 7 | 3 | 59.4 | 70.5 | 4 / 35 | 2846 |
| 8 | 3 | 59.3 | 70.5 | 6 / 35 | 2565 |
| 9 | 2 | 60.6 | 69.8 | 6 / 35 | 3298 |
| 10 | 2 | 61.6 | 73.3 | 4 / 35 | 3355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 71% |
| d414.nano.Quantum 1.0.0 | 26 | 23% |
| stelo.SoJNanoMelee 1.1 | 16 | 19% |
| simonton.nano.MeleeSeed 1.8 | 15 | 73% |
| DBall.Anarchy 0.1 | 15 | 27% |
| sample.MyFirstRobot 1.0 | 3 | 33% |
| fm.mammillarias 1.3 | 3 | 100% |

Hadur died in 292 of 350 rounds, at a mean tick of 844. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 27% | 89 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 59 | 20% | 90 |
| simonton.nano.MeleeSeed 1.8 | 42 | 14% | 49 |
| stelo.SoJNanoMelee 1.1 | 35 | 12% | 37 |
| DBall.Anarchy 0.1 | 31 | 11% | 36 |
| fm.mammillarias 1.3 | 29 | 10% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 7 | 2% | 10 |

## Melee bench: F03

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 67.8 | 66 / 350 | 3.90 | 13.7% | 39666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.3% | 128 |
| hadur117.nano.SanaroFL 0.1 | 2.5 | 13.7% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.6% | 43 |
| ahf.NanoAndrew .4 | 3.7 | 12.5% | 59 |
| ratosh.Nobo 0.21 | 4.7 | 11.2% | 16 |
| timmit.nano.TimDog 0.33 | 6.1 | 8.9% | 14 |
| stelo.PatternRobot 1.0 | 7.0 | 7.5% | 16 |
| repositorio.NanoStep 1.0 | 8.2 | 6.3% | 4 |
| sample.Crazy 1.0 | 8.7 | 5.7% | 4 |
| kurios.DOSexe .9a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 61.6 | 5 / 35 | 3803 |
| 2 | 2 | 61.4 | 70.5 | 6 / 35 | 3867 |
| 3 | 2 | 60.5 | 69.2 | 7 / 35 | 3783 |
| 4 | 2 | 60.7 | 67.6 | 7 / 35 | 3891 |
| 5 | 3 | 58.0 | 61.0 | 6 / 35 | 3927 |
| 6 | 3 | 62.2 | 72.4 | 7 / 35 | 4155 |
| 7 | 2 | 64.1 | 75.6 | 11 / 35 | 4573 |
| 8 | 2 | 62.4 | 71.7 | 10 / 35 | 4060 |
| 9 | 4 | 57.4 | 60.6 | 4 / 35 | 3689 |
| 10 | 2 | 59.8 | 67.9 | 3 / 35 | 3918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 51 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 75% |
| ahf.NanoAndrew .4 | 12 | 33% |
| ratosh.Nobo 0.21 | 10 | 60% |
| stelo.PatternRobot 1.0 | 8 | 63% |
| timmit.nano.TimDog 0.33 | 6 | 33% |
| repositorio.NanoStep 1.0 | 5 | 40% |
| sample.Crazy 1.0 | 3 | 33% |

Hadur died in 284 of 350 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 29% | 97 |
| ahf.NanoAndrew .4 | 48 | 17% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 15% | 76 |
| ratosh.Nobo 0.21 | 33 | 12% | 37 |
| stelo.PatternRobot 1.0 | 26 | 9% | 30 |
| timmit.nano.TimDog 0.33 | 24 | 8% | 27 |
| repositorio.NanoStep 1.0 | 12 | 4% | 15 |
| kurios.DOSexe .9a | 8 | 3% | 8 |
| sample.Crazy 1.0 | 8 | 3% | 8 |

## Melee bench: F04

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.9 | 91 / 350 | 3.08 | 15.9% | 51252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 18.0% | 164 |
| hadur117.nano.SanaroFL 0.1 | 2.1 | 15.9% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 15.0% | 50 |
| wompi.Quokka 1.6 | 3.7 | 14.2% | 38 |
| maribo.FollowFire 1 | 5.7 | 7.2% | 0 |
| kurios.DOSexe .9b | 5.8 | 7.0% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.3% | 3 |
| jangs.ns51 1.0 | 7.9 | 6.1% | 3 |
| sample.VelociRobot 1.0 | 8.1 | 5.8% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 78.4 | 7 / 35 | 5152 |
| 2 | 2 | 64.5 | 78.1 | 6 / 35 | 4807 |
| 3 | 2 | 64.3 | 74.9 | 6 / 35 | 4923 |
| 4 | 2 | 63.0 | 73.0 | 6 / 35 | 4840 |
| 5 | 2 | 66.1 | 78.1 | 13 / 35 | 5510 |
| 6 | 4 | 62.7 | 69.5 | 8 / 35 | 4879 |
| 7 | 2 | 64.6 | 77.8 | 10 / 35 | 4837 |
| 8 | 1 | 68.0 | 85.4 | 15 / 35 | 5590 |
| 9 | 2 | 65.9 | 79.4 | 10 / 35 | 5281 |
| 10 | 2 | 64.9 | 74.0 | 10 / 35 | 5433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 79 | 76% |
| d414.nano.Quantum 1.0.0 | 67 | 9% |
| wompi.Quokka 1.6 | 35 | 60% |
| kurios.DOSexe .9b | 3 | 67% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 259 of 350 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 130 | 50% | 140 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 55 | 21% | 118 |
| wompi.Quokka 1.6 | 50 | 19% | 60 |
| maribo.FollowFire 1 | 12 | 5% | 12 |
| jangs.ns51 1.0 | 5 | 2% | 5 |
| kurios.DOSexe .9b | 3 | 1% | 7 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 1% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 72.7 | 84 / 350 | 3.45 | 14.7% | 44863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.3% | 158 |
| hadur117.nano.SanaroFL 0.1 | 2.3 | 14.7% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.4% | 42 |
| ntc.Opposite 1.5 | 4.3 | 12.2% | 19 |
| js.PinBall 1.6 | 5.0 | 11.2% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.4% | 13 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.3% | 12 |
| PSW.Relentless 0.1 | 8.4 | 4.8% | 0 |
| sample.Fire 1.0 | 8.8 | 4.2% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 64.1 | 5 / 35 | 4471 |
| 2 | 2 | 64.8 | 80.3 | 11 / 35 | 4425 |
| 3 | 2 | 64.4 | 74.6 | 12 / 35 | 4643 |
| 4 | 3 | 61.6 | 68.3 | 7 / 35 | 4464 |
| 5 | 2 | 64.3 | 74.0 | 12 / 35 | 4422 |
| 6 | 2 | 64.6 | 74.6 | 11 / 35 | 4916 |
| 7 | 2 | 63.5 | 70.8 | 9 / 35 | 4653 |
| 8 | 2 | 62.6 | 74.9 | 5 / 35 | 4261 |
| 9 | 3 | 63.0 | 74.9 | 8 / 35 | 4327 |
| 10 | 2 | 61.6 | 70.8 | 4 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 16% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 63 | 76% |
| ntc.Opposite 1.5 | 13 | 69% |
| js.PinBall 1.6 | 9 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 71% |
| sp.Nanos.Ember 1.1 | 6 | 100% |

Hadur died in 267 of 350 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 114 | 43% | 127 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 19% | 106 |
| ntc.Opposite 1.5 | 37 | 14% | 42 |
| js.PinBall 1.6 | 31 | 12% | 35 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 9% | 27 |
| PSW.Relentless 0.1 | 5 | 2% | 5 |
| sp.Nanos.Ember 1.1 | 3 | 1% | 7 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.1 | 56 / 350 | 3.87 | 13.2% | 32874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.5 | 14.3% | 95 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.0% | 87 |
| hadur117.nano.SanaroFL 0.1 | 3.2 | 13.2% | 56 |
| radnor.DoctorBob 1.42 | 4.0 | 12.7% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.4% | 25 |
| myl.nano.Graviton 1.10 | 6.0 | 10.6% | 30 |
| stelo.MirrorNano 1.3 | 7.4 | 7.6% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.2% | 2 |
| ratosh.Wesco 1.4 | 8.3 | 7.1% | 6 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.5 | 66.0 | 3 / 35 | 3024 |
| 2 | 4 | 59.3 | 64.1 | 5 / 35 | 3353 |
| 3 | 3 | 60.8 | 67.9 | 5 / 35 | 3585 |
| 4 | 3 | 59.5 | 65.7 | 5 / 35 | 3275 |
| 5 | 2 | 62.0 | 69.5 | 10 / 35 | 3558 |
| 6 | 5 | 59.1 | 65.4 | 6 / 35 | 3217 |
| 7 | 1 | 63.1 | 75.2 | 8 / 35 | 3615 |
| 8 | 4 | 59.2 | 67.0 | 4 / 35 | 3075 |
| 9 | 1 | 62.1 | 73.0 | 9 / 35 | 3339 |
| 10 | 4 | 58.1 | 67.0 | 1 / 35 | 2833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 33 | 24% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 76% |
| d414.nano.Quantum 1.0.0 | 23 | 17% |
| radnor.DoctorBob 1.42 | 17 | 65% |
| myl.nano.Graviton 1.10 | 12 | 50% |
| squidM.TentalceMeleeNano 1.1 | 4 | 50% |
| ratosh.Wesco 1.4 | 2 | 50% |
| stelo.MirrorNano 1.3 | 2 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 72 | 24% | 85 |
| d414.nano.Quantum 1.0.0 | 63 | 21% | 70 |
| radnor.DoctorBob 1.42 | 42 | 14% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 14% | 63 |
| myl.nano.Graviton 1.10 | 40 | 14% | 42 |
| stelo.MirrorNano 1.3 | 12 | 4% | 14 |
| squidM.TentalceMeleeNano 1.1 | 12 | 4% | 14 |
| ratosh.Wesco 1.4 | 12 | 4% | 13 |

## Melee bench: F07

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 63.6 | 53 / 350 | 4.27 | 12.6% | 34880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 13.9% | 80 |
| nz.jdc.nano.GridFu 1.0 | 2.4 | 13.6% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.9% | 52 |
| cb.nano.Insomnia 1.0 | 3.6 | 12.6% | 61 |
| hadur117.nano.SanaroFL 0.1 | 3.8 | 12.6% | 53 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 10.7% | 19 |
| mz.Cork 0.1 | 6.8 | 10.3% | 18 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.4% | 0 |
| stuff.Vlad 0.1 | 8.5 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 55.3 | 59.4 | 3 / 35 | 2852 |
| 2 | 3 | 58.6 | 61.9 | 6 / 35 | 3540 |
| 3 | 4 | 56.9 | 60.3 | 3 / 35 | 3621 |
| 4 | 2 | 62.8 | 74.6 | 8 / 35 | 3975 |
| 5 | 4 | 58.3 | 63.5 | 7 / 35 | 3416 |
| 6 | 3 | 59.8 | 66.3 | 5 / 35 | 3754 |
| 7 | 5 | 58.2 | 62.2 | 7 / 35 | 3316 |
| 8 | 5 | 55.4 | 55.6 | 2 / 35 | 3398 |
| 9 | 1 | 60.9 | 71.4 | 9 / 35 | 3428 |
| 10 | 5 | 57.3 | 61.0 | 3 / 35 | 3580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 26 | 62% |
| nz.jdc.nano.GridFu 1.0 | 25 | 28% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 65% |
| d414.nano.Quantum 1.0.0 | 18 | 22% |
| oog.melee.CapuletDroid 1.1 | 8 | 75% |
| mz.Cork 0.1 | 4 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 297 of 350 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 24% | 80 |
| nz.jdc.nano.GridFu 1.0 | 64 | 22% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 16% | 72 |
| cb.nano.Insomnia 1.0 | 44 | 15% | 35 |
| oog.melee.CapuletDroid 1.1 | 35 | 12% | 47 |
| mz.Cork 0.1 | 22 | 7% | 25 |
| stuff.Vlad 0.1 | 5 | 2% | 5 |
| stelo.UntouchableNano 1.3 | 4 | 1% | 4 |
| sample.TrackFire 1.0 | 3 | 1% | 4 |

## Melee bench: F08

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.2 | 69 / 350 | 3.50 | 14.1% | 37602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 15.7% | 114 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.2 | 14.2% | 49 |
| hadur117.nano.SanaroFL 0.1 | 2.7 | 14.1% | 69 |
| gh.nano.Grofvuil 0.2 | 3.7 | 12.7% | 54 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.6 | 10.7% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 10.3% | 37 |
| baal.nano.N 1.42 | 6.5 | 9.7% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.4 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 8.6 | 5.3% | 8 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 79.4 | 6 / 35 | 4306 |
| 2 | 4 | 58.7 | 63.8 | 7 / 35 | 3312 |
| 3 | 2 | 63.6 | 75.6 | 7 / 35 | 4026 |
| 4 | 3 | 61.7 | 71.7 | 5 / 35 | 3644 |
| 5 | 1 | 64.7 | 79.4 | 10 / 35 | 4096 |
| 6 | 2 | 62.4 | 74.3 | 7 / 35 | 3720 |
| 7 | 3 | 58.5 | 64.8 | 5 / 35 | 3351 |
| 8 | 3 | 61.0 | 68.9 | 8 / 35 | 3704 |
| 9 | 3 | 63.3 | 75.9 | 9 / 35 | 3733 |
| 10 | 4 | 60.9 | 68.6 | 5 / 35 | 3710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 70% |
| gh.nano.Grofvuil 0.2 | 24 | 29% |
| djdjdj.NanoSkunk10 1.0 | 17 | 41% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 63% |
| baal.nano.N 1.42 | 4 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |

Hadur died in 282 of 350 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 34% | 111 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 18% | 81 |
| gh.nano.Grofvuil 0.2 | 48 | 17% | 58 |
| dmh.robocode.robot.RedDwarf 0.4 | 36 | 13% | 39 |
| djdjdj.NanoSkunk10 1.0 | 29 | 10% | 35 |
| baal.nano.N 1.42 | 14 | 5% | 17 |
| donjezza.Muncho 1.0 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 1% | 3 |

## Melee bench: F09

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.0 | 56.6 | 50 / 350 | 4.91 | 11.2% | 27190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 13.1% | 63 |
| mld.DustBunny 3.8 | 3.2 | 11.7% | 36 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 12.1% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.1 | 11.2% | 26 |
| hadur117.nano.SanaroFL 0.1 | 4.6 | 11.2% | 50 |
| wee.Gem 1.8.4 | 5.2 | 10.8% | 53 |
| sheldor.melee.nano.TestMelee 0.1 | 5.9 | 10.0% | 31 |
| tj.zombie1n 1.0.1 | 8.3 | 7.5% | 23 |
| cs.sheldor.Talon 1.1 | 8.9 | 6.8% | 1 |
| step.nanoPri 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.7 | 58.1 | 6 / 35 | 2809 |
| 2 | 5 | 53.0 | 54.3 | 5 / 35 | 2686 |
| 3 | 6 | 52.8 | 52.7 | 5 / 35 | 2735 |
| 4 | 6 | 52.7 | 52.7 | 5 / 35 | 2648 |
| 5 | 5 | 53.2 | 55.9 | 3 / 35 | 2650 |
| 6 | 4 | 54.9 | 60.3 | 6 / 35 | 2548 |
| 7 | 2 | 58.8 | 67.0 | 7 / 35 | 3129 |
| 8 | 7 | 51.4 | 50.5 | 3 / 35 | 2518 |
| 9 | 5 | 53.3 | 55.6 | 4 / 35 | 2581 |
| 10 | 2 | 55.0 | 59.0 | 6 / 35 | 2886 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 52% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 94% |
| d414.nano.Quantum 1.0.0 | 15 | 33% |
| wee.Gem 1.8.4 | 12 | 58% |
| mld.DustBunny 3.8 | 9 | 44% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 50% |
| tj.zombie1n 1.0.1 | 6 | 33% |
| cs.sheldor.Talon 1.1 | 1 | 0% |

Hadur died in 300 of 350 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 60 | 20% | 67 |
| stelo.SoRobotNanoMelee 1.2 | 47 | 16% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 15% | 62 |
| mld.DustBunny 3.8 | 36 | 12% | 46 |
| wee.Gem 1.8.4 | 32 | 11% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 29 | 10% | 34 |
| step.nanoPri 1.0 | 18 | 6% | 18 |
| cs.sheldor.Talon 1.1 | 17 | 6% | 17 |
| tj.zombie1n 1.0.1 | 17 | 6% | 16 |

## Melee bench: F10

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.8 | 61 / 350 | 3.54 | 14.3% | 41193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 16.6% | 112 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.7% | 61 |
| mld.Infinity 2.2 | 3.0 | 14.1% | 88 |
| hadur117.nano.SanaroFL 0.1 | 3.4 | 14.3% | 61 |
| conscience.Electron 1.3g | 6.2 | 7.7% | 2 |
| ayk.WallHugger 1.0 | 6.4 | 7.7% | 9 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 2 |
| robar.nano.Assertive_Melee 0.2 | 7.0 | 7.5% | 7 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 8 |
| sample.RamFire 1.0 | 9.9 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.4 | 70.2 | 6 / 35 | 4059 |
| 2 | 4 | 60.4 | 69.8 | 3 / 35 | 3971 |
| 3 | 2 | 63.9 | 76.2 | 8 / 35 | 4651 |
| 4 | 3 | 62.4 | 74.9 | 3 / 35 | 4231 |
| 5 | 4 | 61.0 | 71.7 | 5 / 35 | 3483 |
| 6 | 4 | 62.7 | 72.1 | 7 / 35 | 4325 |
| 7 | 3 | 62.8 | 72.1 | 11 / 35 | 4081 |
| 8 | 4 | 61.2 | 70.5 | 7 / 35 | 3927 |
| 9 | 3 | 62.2 | 72.7 | 8 / 35 | 4293 |
| 10 | 3 | 60.3 | 67.9 | 3 / 35 | 4172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 49 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 69% |
| mld.Infinity 2.2 | 33 | 42% |
| ayk.WallHugger 1.0 | 5 | 40% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 33% |
| robar.nano.Assertive_Melee 0.2 | 3 | 33% |

Hadur died in 289 of 350 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 104 | 36% | 124 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 74 | 26% | 119 |
| mld.Infinity 2.2 | 42 | 15% | 24 |
| robar.nano.Assertive_Melee 0.2 | 29 | 10% | 32 |
| conscience.Electron 1.3g | 15 | 5% | 15 |
| ayk.WallHugger 1.0 | 12 | 4% | 13 |
| exauge.GateKeeper 1.1.121g | 9 | 3% | 15 |
| donjezza.Jezza 1.0 | 3 | 1% | 5 |
| sample.RamFire 1.0 | 1 | 0% | 2 |

## Melee bench: F11

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 65.5 | 69 / 350 | 4.10 | 13.1% | 34063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 111 |
| hadur117.nano.SanaroFL 0.1 | 2.8 | 13.1% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 48 |
| oog.melee.Corsair 1.0 | 3.7 | 12.5% | 53 |
| mz.NanoGod 2.02 | 4.5 | 11.8% | 42 |
| DBall.NUKE 0.1 | 6.6 | 8.1% | 12 |
| awesomeness.Elite 1.0 | 7.1 | 7.7% | 6 |
| zyx.nano.BacillusComma 1.0 | 7.6 | 7.5% | 1 |
| sample.Walls 1.0 | 8.7 | 6.4% | 9 |
| stelo.PianistNano 1.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.0 | 64.4 | 8 / 35 | 3630 |
| 2 | 3 | 57.4 | 60.0 | 7 / 35 | 3469 |
| 3 | 3 | 57.3 | 61.3 | 6 / 35 | 3197 |
| 4 | 2 | 61.1 | 73.0 | 6 / 35 | 3484 |
| 5 | 2 | 60.3 | 68.9 | 8 / 35 | 3574 |
| 6 | 3 | 59.3 | 67.0 | 8 / 35 | 3338 |
| 7 | 5 | 58.1 | 62.2 | 4 / 35 | 3570 |
| 8 | 4 | 57.2 | 61.6 | 6 / 35 | 3082 |
| 9 | 2 | 60.2 | 69.5 | 9 / 35 | 3334 |
| 10 | 2 | 59.4 | 67.3 | 7 / 35 | 3385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 68% |
| d414.nano.Quantum 1.0.0 | 36 | 31% |
| oog.melee.Corsair 1.0 | 16 | 63% |
| mz.NanoGod 2.02 | 13 | 31% |
| DBall.NUKE 0.1 | 12 | 92% |
| sample.Walls 1.0 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 74 | 26% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 19% | 82 |
| mz.NanoGod 2.02 | 52 | 19% | 55 |
| oog.melee.Corsair 1.0 | 43 | 15% | 54 |
| zyx.nano.BacillusComma 1.0 | 22 | 8% | 23 |
| sample.Walls 1.0 | 13 | 5% | 17 |
| awesomeness.Elite 1.0 | 10 | 4% | 11 |
| stelo.PianistNano 1.2 | 7 | 2% | 7 |
| DBall.NUKE 0.1 | 6 | 2% | 16 |

## Melee bench: F12

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 65.0 | 62 / 350 | 4.15 | 12.9% | 32588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.2% | 101 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 12.8% | 41 |
| hadur117.nano.SanaroFL 0.1 | 2.7 | 12.9% | 62 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 12.2% | 43 |
| sul.Lunar 1.1 | 4.3 | 11.7% | 54 |
| sam.Samspin 1.0 | 7.3 | 7.9% | 8 |
| maribo.melee.BMV 0.1 | 7.3 | 8.0% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 16 |
| sample.SpinBot 1.0 | 7.7 | 7.9% | 16 |
| cvt.Firsty 1.0 | 10.0 | 4.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 62.5 | 5 / 35 | 2989 |
| 2 | 1 | 59.5 | 65.4 | 9 / 35 | 3769 |
| 3 | 2 | 59.6 | 67.6 | 9 / 35 | 3412 |
| 4 | 2 | 59.9 | 69.8 | 6 / 35 | 3349 |
| 5 | 3 | 57.8 | 65.7 | 2 / 35 | 3431 |
| 6 | 2 | 57.1 | 63.5 | 8 / 35 | 2894 |
| 7 | 2 | 60.5 | 69.2 | 9 / 35 | 3536 |
| 8 | 3 | 57.9 | 63.5 | 6 / 35 | 3248 |
| 9 | 3 | 57.8 | 65.7 | 4 / 35 | 3081 |
| 10 | 5 | 54.8 | 57.5 | 4 / 35 | 2879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 81% |
| sul.Lunar 1.1 | 28 | 54% |
| d414.nano.Quantum 1.0.0 | 26 | 27% |
| myl.nano.KomoriNinja 1.1 | 9 | 11% |
| sample.SpinBot 1.0 | 7 | 43% |
| spinnercat.Omen 1.0 | 6 | 67% |
| cvt.Firsty 1.0 | 4 | 50% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| sam.Samspin 1.0 | 3 | 67% |

Hadur died in 288 of 350 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 77 | 27% | 83 |
| myl.nano.KomoriNinja 1.1 | 43 | 15% | 46 |
| sul.Lunar 1.1 | 40 | 14% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 14% | 67 |
| sample.SpinBot 1.0 | 28 | 10% | 32 |
| sam.Samspin 1.0 | 22 | 8% | 23 |
| spinnercat.Omen 1.0 | 21 | 7% | 21 |
| maribo.melee.BMV 0.1 | 12 | 4% | 13 |
| cvt.Firsty 1.0 | 6 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 68.0 | 62 / 350 | 3.88 | 13.0% | 31546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.4% | 109 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.9 | 14.5% | 99 |
| hadur117.nano.SanaroFL 0.1 | 3.0 | 13.0% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.7% | 34 |
| mld.Wisdom 1.0 | 5.1 | 10.8% | 18 |
| arthord.NanoSatanMelee Beta | 7.1 | 8.0% | 6 |
| tvv.nano.Polaris 1.2 | 7.2 | 8.0% | 10 |
| zyx.nano.Ant 1.1 | 7.4 | 7.9% | 7 |
| amz.NanoClone 1.41 | 8.1 | 7.5% | 4 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 69.5 | 6 / 35 | 3404 |
| 2 | 3 | 58.9 | 66.0 | 5 / 35 | 3306 |
| 3 | 4 | 58.5 | 67.0 | 5 / 35 | 3118 |
| 4 | 3 | 57.2 | 65.1 | 4 / 35 | 3013 |
| 5 | 4 | 57.3 | 65.4 | 4 / 35 | 3127 |
| 6 | 3 | 59.6 | 71.1 | 7 / 35 | 3084 |
| 7 | 1 | 61.5 | 75.2 | 7 / 35 | 3414 |
| 8 | 5 | 57.5 | 64.8 | 7 / 35 | 2861 |
| 9 | 3 | 58.5 | 67.6 | 7 / 35 | 2932 |
| 10 | 2 | 59.4 | 67.9 | 10 / 35 | 3287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 74% |
| d414.nano.Quantum 1.0.0 | 34 | 12% |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 19% |
| mld.Wisdom 1.0 | 13 | 62% |
| zyx.nano.Ant 1.1 | 8 | 63% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 288 of 350 rounds, at a mean tick of 663. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 88 | 31% | 94 |
| davidalves.net.DuelistNanoMelee 1.01 | 62 | 22% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 17% | 81 |
| mld.Wisdom 1.0 | 33 | 11% | 38 |
| arthord.NanoSatanMelee Beta | 19 | 7% | 24 |
| zyx.nano.Ant 1.1 | 18 | 6% | 21 |
| amz.NanoClone 1.41 | 11 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 8 | 3% | 10 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |

