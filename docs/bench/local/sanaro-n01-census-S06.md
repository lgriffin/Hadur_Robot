# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.2 | 71 / 350 | 4.04 | 13.2% | 33289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 15.5% | 114 |
| bzdp.Pansy 2.1 | 2.7 | 13.4% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.2% | 58 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 13.2% | 71 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.5% | 26 |
| arthord.NanoSatanMelee Beta | 6.2 | 9.1% | 8 |
| zyx.nano.Ant 1.1 | 7.1 | 8.5% | 8 |
| fm.claire 1.7 | 7.5 | 8.1% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.9 | 6.7% | 14 |
| arthord.MannyPacquiao Beta | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 59.0 | 6 / 35 | 2700 |
| 2 | 1 | 63.1 | 74.3 | 11 / 35 | 4025 |
| 3 | 3 | 58.9 | 65.4 | 6 / 35 | 3588 |
| 4 | 3 | 61.1 | 69.8 | 8 / 35 | 3447 |
| 5 | 2 | 60.1 | 68.9 | 7 / 35 | 3333 |
| 6 | 4 | 57.8 | 62.9 | 5 / 35 | 3274 |
| 7 | 3 | 59.1 | 63.2 | 9 / 35 | 3389 |
| 8 | 2 | 58.2 | 65.1 | 6 / 35 | 3150 |
| 9 | 4 | 58.8 | 65.4 | 6 / 35 | 3258 |
| 10 | 4 | 59.5 | 68.3 | 7 / 35 | 3125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 77% |
| bzdp.Pansy 2.1 | 25 | 72% |
| tvv.nano.Polaris 1.2 | 11 | 36% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| zyx.nano.Ant 1.1 | 4 | 75% |

Hadur died in 280 of 350 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 85 | 30% | 106 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 18% | 76 |
| bzdp.Pansy 2.1 | 47 | 17% | 65 |
| arthord.NanoSatanMelee Beta | 28 | 10% | 29 |
| tvv.nano.Polaris 1.2 | 28 | 10% | 29 |
| fm.claire 1.7 | 15 | 5% | 15 |
| zyx.nano.Ant 1.1 | 13 | 5% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 10 | 4% | 13 |
| arthord.MannyPacquiao Beta | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 65.9 | 48 / 350 | 4.07 | 12.7% | 28840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 14.9% | 86 |
| simonton.nano.MeleeSeed 1.8 | 2.7 | 13.2% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 13.2% | 41 |
| hadur117.nano.SanaroS06 0.1 | 3.3 | 12.7% | 48 |
| DBall.Anarchy 0.1 | 5.0 | 11.0% | 54 |
| fm.mammillarias 1.3 | 6.2 | 9.6% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 9.7% | 44 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.7% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.8 | 60.6 | 3 / 35 | 2472 |
| 2 | 2 | 59.9 | 69.8 | 6 / 35 | 2936 |
| 3 | 4 | 59.2 | 66.0 | 4 / 35 | 2986 |
| 4 | 2 | 60.1 | 65.4 | 8 / 35 | 3603 |
| 5 | 4 | 58.5 | 67.0 | 2 / 35 | 2775 |
| 6 | 3 | 59.2 | 65.4 | 6 / 35 | 2606 |
| 7 | 2 | 61.4 | 72.4 | 6 / 35 | 3132 |
| 8 | 4 | 56.8 | 62.2 | 5 / 35 | 2427 |
| 9 | 4 | 56.4 | 59.7 | 2 / 35 | 2815 |
| 10 | 3 | 61.1 | 70.5 | 6 / 35 | 3088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 77% |
| d414.nano.Quantum 1.0.0 | 26 | 15% |
| simonton.nano.MeleeSeed 1.8 | 23 | 57% |
| DBall.Anarchy 0.1 | 14 | 43% |
| stelo.SoJNanoMelee 1.1 | 11 | 27% |
| sample.MyFirstRobot 1.0 | 4 | 25% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 80 | 26% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 63 | 21% | 86 |
| simonton.nano.MeleeSeed 1.8 | 51 | 17% | 62 |
| stelo.SoJNanoMelee 1.1 | 30 | 10% | 30 |
| DBall.Anarchy 0.1 | 27 | 9% | 33 |
| fm.mammillarias 1.3 | 27 | 9% | 27 |
| mn.nano.perceptual.Impact 1.3.0 | 18 | 6% | 18 |
| sample.MyFirstRobot 1.0 | 6 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 69.8 | 70 / 350 | 3.72 | 14.2% | 40606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.6% | 114 |
| hadur117.nano.SanaroS06 0.1 | 2.1 | 14.2% | 70 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.3% | 40 |
| ahf.NanoAndrew .4 | 4.2 | 11.8% | 49 |
| ratosh.Nobo 0.21 | 4.6 | 11.1% | 18 |
| timmit.nano.TimDog 0.33 | 6.1 | 9.6% | 19 |
| stelo.PatternRobot 1.0 | 7.3 | 7.9% | 24 |
| sample.Crazy 1.0 | 8.1 | 6.3% | 7 |
| repositorio.NanoStep 1.0 | 8.4 | 6.2% | 9 |
| kurios.DOSexe .9a | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 70.8 | 5 / 35 | 3884 |
| 2 | 2 | 62.1 | 70.5 | 8 / 35 | 4205 |
| 3 | 2 | 60.5 | 68.9 | 6 / 35 | 4057 |
| 4 | 2 | 62.9 | 71.7 | 8 / 35 | 4583 |
| 5 | 2 | 60.2 | 67.9 | 8 / 35 | 3583 |
| 6 | 3 | 59.0 | 66.3 | 4 / 35 | 3807 |
| 7 | 2 | 61.5 | 70.5 | 6 / 35 | 4183 |
| 8 | 3 | 60.4 | 67.6 | 6 / 35 | 3951 |
| 9 | 1 | 63.6 | 76.5 | 11 / 35 | 4092 |
| 10 | 2 | 60.8 | 67.0 | 8 / 35 | 4261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 72% |
| d414.nano.Quantum 1.0.0 | 47 | 23% |
| ahf.NanoAndrew .4 | 14 | 21% |
| stelo.PatternRobot 1.0 | 14 | 57% |
| ratosh.Nobo 0.21 | 12 | 50% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| repositorio.NanoStep 1.0 | 3 | 67% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 280 of 350 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 34% | 108 |
| ahf.NanoAndrew .4 | 46 | 16% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 14% | 75 |
| timmit.nano.TimDog 0.33 | 29 | 10% | 34 |
| stelo.PatternRobot 1.0 | 27 | 10% | 34 |
| ratosh.Nobo 0.21 | 27 | 10% | 33 |
| repositorio.NanoStep 1.0 | 8 | 3% | 8 |
| kurios.DOSexe .9a | 5 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.9 | 107 / 350 | 3.08 | 16.0% | 49787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.5% | 137 |
| hadur117.nano.SanaroS06 0.1 | 2.5 | 16.0% | 107 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 15.1% | 48 |
| wompi.Quokka 1.6 | 3.4 | 14.4% | 45 |
| maribo.FollowFire 1 | 6.0 | 7.3% | 0 |
| kurios.DOSexe .9b | 6.9 | 6.7% | 1 |
| jangs.ns51 1.0 | 7.0 | 6.5% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 7.1 | 6.6% | 8 |
| sample.VelociRobot 1.0 | 8.0 | 5.8% | 2 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.5 | 68.3 | 9 / 35 | 4622 |
| 2 | 2 | 66.1 | 81.0 | 14 / 35 | 5107 |
| 3 | 1 | 67.6 | 83.8 | 16 / 35 | 5377 |
| 4 | 4 | 61.5 | 68.9 | 4 / 35 | 4357 |
| 5 | 2 | 64.8 | 74.9 | 12 / 35 | 4948 |
| 6 | 2 | 66.3 | 81.0 | 13 / 35 | 5100 |
| 7 | 2 | 65.1 | 76.5 | 9 / 35 | 5226 |
| 8 | 2 | 65.6 | 77.5 | 8 / 35 | 5341 |
| 9 | 3 | 64.7 | 77.5 | 10 / 35 | 4553 |
| 10 | 3 | 66.3 | 80.0 | 12 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 80 | 84% |
| d414.nano.Quantum 1.0.0 | 62 | 31% |
| wompi.Quokka 1.6 | 29 | 55% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 67% |
| jangs.ns51 1.0 | 2 | 50% |

Hadur died in 243 of 350 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 107 | 44% | 126 |
| wompi.Quokka 1.6 | 54 | 22% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 21% | 123 |
| maribo.FollowFire 1 | 12 | 5% | 12 |
| jangs.ns51 1.0 | 6 | 2% | 8 |
| kurios.DOSexe .9b | 5 | 2% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 2% | 7 |
| sample.VelociRobot 1.0 | 4 | 2% | 6 |
| drd.Dreadknoght 0.9 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 72.1 | 94 / 350 | 3.51 | 14.7% | 44370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.3% | 153 |
| hadur117.nano.SanaroS06 0.1 | 2.5 | 14.7% | 94 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.3% | 40 |
| ntc.Opposite 1.5 | 4.2 | 12.3% | 21 |
| js.PinBall 1.6 | 5.0 | 11.2% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.6 | 10.6% | 10 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.7% | 12 |
| PSW.Relentless 0.1 | 8.5 | 4.4% | 0 |
| sample.Fire 1.0 | 8.7 | 4.2% | 1 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 68.9 | 11 / 35 | 4190 |
| 2 | 2 | 64.9 | 76.8 | 10 / 35 | 4809 |
| 3 | 4 | 61.2 | 68.9 | 8 / 35 | 3903 |
| 4 | 4 | 58.4 | 59.7 | 5 / 35 | 4077 |
| 5 | 2 | 65.1 | 78.4 | 9 / 35 | 4628 |
| 6 | 2 | 64.4 | 73.3 | 14 / 35 | 4683 |
| 7 | 2 | 61.9 | 70.2 | 6 / 35 | 4338 |
| 8 | 2 | 63.0 | 71.1 | 8 / 35 | 4513 |
| 9 | 2 | 63.8 | 72.1 | 11 / 35 | 4485 |
| 10 | 2 | 65.7 | 81.3 | 12 / 35 | 4744 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 65 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 86% |
| sp.Nanos.Ember 1.1 | 16 | 69% |
| ntc.Opposite 1.5 | 9 | 78% |
| js.PinBall 1.6 | 8 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 258 of 350 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 103 | 40% | 125 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 20% | 104 |
| ntc.Opposite 1.5 | 33 | 13% | 36 |
| js.PinBall 1.6 | 29 | 11% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 24 | 9% | 27 |
| sp.Nanos.Ember 1.1 | 11 | 4% | 17 |
| PSW.Relentless 0.1 | 4 | 2% | 4 |
| sample.Fire 1.0 | 1 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 65.6 | 56 / 350 | 4.09 | 12.8% | 32103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.4% | 86 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.6% | 68 |
| radnor.DoctorBob 1.42 | 3.2 | 13.2% | 63 |
| hadur117.nano.SanaroS06 0.1 | 3.7 | 12.8% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.2 | 12.3% | 32 |
| myl.nano.Graviton 1.10 | 5.5 | 10.6% | 42 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 7.6% | 0 |
| stelo.MirrorNano 1.3 | 7.9 | 7.5% | 1 |
| ratosh.Wesco 1.4 | 8.6 | 7.1% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 70.8 | 8 / 35 | 3143 |
| 2 | 4 | 58.5 | 62.9 | 5 / 35 | 3301 |
| 3 | 1 | 61.9 | 72.4 | 8 / 35 | 3492 |
| 4 | 4 | 59.2 | 64.8 | 7 / 35 | 3263 |
| 5 | 5 | 59.2 | 65.1 | 3 / 35 | 3247 |
| 6 | 5 | 57.7 | 64.1 | 1 / 35 | 3068 |
| 7 | 5 | 60.2 | 67.9 | 7 / 35 | 3096 |
| 8 | 3 | 59.7 | 66.3 | 6 / 35 | 3152 |
| 9 | 3 | 59.8 | 64.8 | 7 / 35 | 3518 |
| 10 | 6 | 56.1 | 57.1 | 4 / 35 | 2823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 37% |
| radnor.DoctorBob 1.42 | 27 | 37% |
| kawigi.nano.Lib 1.0 | 22 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 81% |
| myl.nano.Graviton 1.10 | 12 | 25% |
| ratosh.Wesco 1.4 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 294 of 350 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 70 | 24% | 79 |
| radnor.DoctorBob 1.42 | 56 | 19% | 64 |
| d414.nano.Quantum 1.0.0 | 54 | 18% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 13% | 56 |
| myl.nano.Graviton 1.10 | 37 | 13% | 41 |
| stelo.MirrorNano 1.3 | 14 | 5% | 14 |
| ratosh.Wesco 1.4 | 12 | 4% | 15 |
| squidM.TentalceMeleeNano 1.1 | 12 | 4% | 12 |

## Melee bench: F07

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 64.9 | 60 / 350 | 4.16 | 12.8% | 34898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 13.8% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.2% | 63 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 13.3% | 58 |
| hadur117.nano.SanaroS06 0.1 | 3.3 | 12.8% | 60 |
| cb.nano.Insomnia 1.0 | 4.2 | 12.1% | 49 |
| oog.melee.CapuletDroid 1.1 | 5.8 | 11.0% | 27 |
| mz.Cork 0.1 | 6.8 | 10.1% | 12 |
| stelo.UntouchableNano 1.3 | 8.4 | 5.6% | 2 |
| stuff.Vlad 0.1 | 8.6 | 5.3% | 3 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.7 | 64.8 | 7 / 35 | 3344 |
| 2 | 2 | 60.2 | 66.7 | 9 / 35 | 3468 |
| 3 | 4 | 56.4 | 58.1 | 4 / 35 | 3298 |
| 4 | 3 | 58.6 | 64.1 | 5 / 35 | 3603 |
| 5 | 3 | 59.6 | 66.7 | 4 / 35 | 3585 |
| 6 | 5 | 57.8 | 61.9 | 6 / 35 | 3416 |
| 7 | 3 | 58.2 | 63.8 | 5 / 35 | 3479 |
| 8 | 3 | 58.7 | 65.1 | 6 / 35 | 3301 |
| 9 | 2 | 60.9 | 68.6 | 8 / 35 | 3808 |
| 10 | 3 | 59.9 | 68.9 | 6 / 35 | 3596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| d414.nano.Quantum 1.0.0 | 23 | 30% |
| nz.jdc.nano.GridFu 1.0 | 21 | 43% |
| cb.nano.Insomnia 1.0 | 19 | 63% |
| oog.melee.CapuletDroid 1.1 | 11 | 64% |
| mz.Cork 0.1 | 10 | 30% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 290 of 350 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 22% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 20% | 86 |
| nz.jdc.nano.GridFu 1.0 | 42 | 14% | 54 |
| oog.melee.CapuletDroid 1.1 | 41 | 14% | 51 |
| cb.nano.Insomnia 1.0 | 37 | 13% | 30 |
| mz.Cork 0.1 | 29 | 10% | 33 |
| stelo.UntouchableNano 1.3 | 12 | 4% | 11 |
| stuff.Vlad 0.1 | 5 | 2% | 4 |
| sample.TrackFire 1.0 | 4 | 1% | 4 |

## Melee bench: F08

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.5 | 76 / 350 | 3.47 | 14.2% | 37197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 15.7% | 111 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 14.2% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.9% | 51 |
| gh.nano.Grofvuil 0.2 | 3.6 | 13.0% | 53 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.9% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5.9 | 10.3% | 37 |
| baal.nano.N 1.42 | 6.7 | 9.4% | 4 |
| donjezza.Muncho 1.0 | 8.5 | 5.3% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.6% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 71.1 | 8 / 35 | 3652 |
| 2 | 2 | 62.8 | 74.0 | 6 / 35 | 3838 |
| 3 | 3 | 60.2 | 67.6 | 4 / 35 | 3662 |
| 4 | 1 | 64.3 | 78.4 | 9 / 35 | 3891 |
| 5 | 3 | 61.1 | 69.2 | 9 / 35 | 3447 |
| 6 | 2 | 64.5 | 76.2 | 12 / 35 | 4114 |
| 7 | 3 | 60.7 | 67.3 | 5 / 35 | 3795 |
| 8 | 3 | 62.4 | 74.3 | 8 / 35 | 3469 |
| 9 | 2 | 62.1 | 73.3 | 7 / 35 | 3733 |
| 10 | 2 | 61.8 | 73.7 | 8 / 35 | 3596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 74% |
| gh.nano.Grofvuil 0.2 | 18 | 44% |
| djdjdj.NanoSkunk10 1.0 | 13 | 31% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| baal.nano.N 1.42 | 6 | 100% |
| donjezza.Muncho 1.0 | 4 | 25% |

Hadur died in 275 of 350 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 83 | 30% | 105 |
| gh.nano.Grofvuil 0.2 | 53 | 19% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 46 | 17% | 79 |
| djdjdj.NanoSkunk10 1.0 | 34 | 12% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 29 | 11% | 32 |
| baal.nano.N 1.42 | 20 | 7% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 2% | 6 |
| donjezza.Muncho 1.0 | 3 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.8 | 56.3 | 41 / 350 | 4.93 | 11.1% | 26976 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 13.3% | 69 |
| stelo.SoRobotNanoMelee 1.2 | 2.6 | 12.6% | 79 |
| mld.DustBunny 3.8 | 3.7 | 12.0% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.6 | 11.2% | 30 |
| wee.Gem 1.8.4 | 4.7 | 10.8% | 39 |
| hadur117.nano.SanaroS06 0.1 | 5.0 | 11.1% | 41 |
| sheldor.melee.nano.TestMelee 0.1 | 6.1 | 9.9% | 32 |
| tj.zombie1n 1.0.1 | 8.1 | 7.0% | 19 |
| cs.sheldor.Talon 1.1 | 8.6 | 6.5% | 1 |
| step.nanoPri 1.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.0 | 54.3 | 3 / 35 | 2859 |
| 2 | 6 | 53.7 | 54.0 | 5 / 35 | 2830 |
| 3 | 3 | 55.0 | 59.4 | 7 / 35 | 2586 |
| 4 | 3 | 57.7 | 65.1 | 6 / 35 | 2885 |
| 5 | 7 | 50.2 | 47.6 | 2 / 35 | 2758 |
| 6 | 4 | 53.9 | 59.0 | 1 / 35 | 2702 |
| 7 | 7 | 50.4 | 47.6 | 3 / 35 | 2606 |
| 8 | 3 | 55.8 | 61.3 | 4 / 35 | 2591 |
| 9 | 5 | 55.0 | 59.0 | 6 / 35 | 2560 |
| 10 | 6 | 53.4 | 56.2 | 4 / 35 | 2599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 31% |
| d414.nano.Quantum 1.0.0 | 14 | 29% |
| mld.DustBunny 3.8 | 13 | 62% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 42% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 82% |
| wee.Gem 1.8.4 | 11 | 55% |
| tj.zombie1n 1.0.1 | 4 | 75% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 309 of 350 rounds, at a mean tick of 570. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 59 | 19% | 62 |
| mld.DustBunny 3.8 | 54 | 17% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 53 | 17% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 14% | 52 |
| sheldor.melee.nano.TestMelee 0.1 | 32 | 10% | 39 |
| wee.Gem 1.8.4 | 28 | 9% | 35 |
| cs.sheldor.Talon 1.1 | 20 | 6% | 21 |
| tj.zombie1n 1.0.1 | 12 | 4% | 12 |
| step.nanoPri 1.0 | 9 | 3% | 10 |

## Melee bench: F10

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.9 | 79 / 350 | 3.53 | 14.4% | 40471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 16.2% | 99 |
| mld.Infinity 2.2 | 2.1 | 15.0% | 113 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 14.4% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 14.4% | 43 |
| ayk.WallHugger 1.0 | 6.3 | 7.6% | 2 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 7.6% | 2 |
| conscience.Electron 1.3g | 6.6 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 7.1 | 7.2% | 3 |
| donjezza.Jezza 1.0 | 8.5 | 6.1% | 9 |
| sample.RamFire 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 71.7 | 6 / 35 | 4065 |
| 2 | 1 | 64.0 | 77.5 | 10 / 35 | 4261 |
| 3 | 1 | 65.7 | 80.3 | 14 / 35 | 4639 |
| 4 | 3 | 60.9 | 68.6 | 7 / 35 | 3824 |
| 5 | 4 | 60.6 | 68.6 | 7 / 35 | 3929 |
| 6 | 3 | 61.2 | 72.7 | 7 / 35 | 3691 |
| 7 | 4 | 60.9 | 69.5 | 9 / 35 | 3568 |
| 8 | 3 | 61.0 | 67.9 | 7 / 35 | 4198 |
| 9 | 4 | 62.5 | 71.7 | 5 / 35 | 4492 |
| 10 | 4 | 61.1 | 70.2 | 7 / 35 | 3804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 44 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 81% |
| d414.nano.Quantum 1.0.0 | 39 | 36% |
| ayk.WallHugger 1.0 | 6 | 83% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 271 of 350 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 88 | 32% | 122 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 26% | 117 |
| mld.Infinity 2.2 | 60 | 22% | 38 |
| robar.nano.Assertive_Melee 0.2 | 17 | 6% | 24 |
| conscience.Electron 1.3g | 14 | 5% | 16 |
| exauge.GateKeeper 1.1.121g | 10 | 4% | 11 |
| ayk.WallHugger 1.0 | 5 | 2% | 13 |
| donjezza.Jezza 1.0 | 4 | 1% | 6 |
| sample.RamFire 1.0 | 2 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 68.7 | 79 / 350 | 3.82 | 13.8% | 35883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.7% | 107 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 13.8% | 79 |
| oog.melee.Corsair 1.0 | 3.6 | 12.4% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.6 | 12.5% | 37 |
| mz.NanoGod 2.02 | 4.4 | 11.3% | 35 |
| DBall.NUKE 0.1 | 6.3 | 8.7% | 18 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 6 |
| sample.Walls 1.0 | 8.0 | 7.1% | 17 |
| zyx.nano.BacillusComma 1.0 | 8.4 | 6.9% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 66.0 | 10 / 35 | 3655 |
| 2 | 1 | 60.8 | 68.9 | 11 / 35 | 3539 |
| 3 | 2 | 63.3 | 75.9 | 11 / 35 | 3855 |
| 4 | 2 | 60.5 | 68.9 | 8 / 35 | 3631 |
| 5 | 2 | 62.1 | 74.6 | 7 / 35 | 3547 |
| 6 | 4 | 57.8 | 64.8 | 3 / 35 | 3198 |
| 7 | 2 | 60.8 | 67.9 | 10 / 35 | 3824 |
| 8 | 3 | 56.6 | 59.7 | 4 / 35 | 3538 |
| 9 | 3 | 57.9 | 65.7 | 5 / 35 | 3183 |
| 10 | 2 | 63.1 | 74.3 | 10 / 35 | 3913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 42 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 78% |
| oog.melee.Corsair 1.0 | 22 | 55% |
| DBall.NUKE 0.1 | 15 | 47% |
| mz.NanoGod 2.02 | 10 | 80% |
| sample.Walls 1.0 | 8 | 25% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 273 of 350 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 70 | 26% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 17% | 80 |
| oog.melee.Corsair 1.0 | 46 | 17% | 58 |
| mz.NanoGod 2.02 | 41 | 15% | 50 |
| zyx.nano.BacillusComma 1.0 | 21 | 8% | 22 |
| DBall.NUKE 0.1 | 18 | 7% | 24 |
| sample.Walls 1.0 | 12 | 4% | 13 |
| awesomeness.Elite 1.0 | 11 | 4% | 12 |
| stelo.PianistNano 1.2 | 6 | 2% | 6 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.9 | 72 / 350 | 3.89 | 13.5% | 33551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.5% | 96 |
| hadur117.nano.SanaroS06 0.1 | 1.9 | 13.5% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.5% | 36 |
| myl.nano.KomoriNinja 1.1 | 4.1 | 11.5% | 43 |
| sul.Lunar 1.1 | 4.7 | 11.0% | 45 |
| maribo.melee.BMV 0.1 | 7.2 | 8.4% | 5 |
| sample.SpinBot 1.0 | 7.3 | 8.1% | 18 |
| sam.Samspin 1.0 | 7.4 | 7.9% | 16 |
| spinnercat.Omen 1.0 | 7.9 | 7.7% | 11 |
| cvt.Firsty 1.0 | 10.0 | 4.9% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.2 | 61.0 | 5 / 35 | 3021 |
| 2 | 3 | 55.5 | 59.4 | 4 / 35 | 3068 |
| 3 | 1 | 59.3 | 69.8 | 9 / 35 | 3014 |
| 4 | 3 | 57.7 | 63.8 | 4 / 35 | 3426 |
| 5 | 2 | 58.6 | 65.4 | 5 / 35 | 3483 |
| 6 | 1 | 61.2 | 71.1 | 12 / 35 | 3462 |
| 7 | 2 | 58.3 | 64.4 | 8 / 35 | 3269 |
| 8 | 1 | 61.5 | 75.2 | 5 / 35 | 3616 |
| 9 | 1 | 61.0 | 70.8 | 9 / 35 | 3631 |
| 10 | 1 | 62.9 | 77.8 | 11 / 35 | 3561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 34% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 81% |
| sul.Lunar 1.1 | 25 | 40% |
| myl.nano.KomoriNinja 1.1 | 24 | 50% |
| sam.Samspin 1.0 | 6 | 50% |
| spinnercat.Omen 1.0 | 5 | 60% |
| sample.SpinBot 1.0 | 5 | 20% |
| cvt.Firsty 1.0 | 4 | 0% |
| maribo.melee.BMV 0.1 | 2 | 50% |

Hadur died in 279 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 24% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 16% | 73 |
| myl.nano.KomoriNinja 1.1 | 39 | 14% | 51 |
| sul.Lunar 1.1 | 36 | 13% | 47 |
| sam.Samspin 1.0 | 28 | 10% | 29 |
| sample.SpinBot 1.0 | 25 | 9% | 26 |
| maribo.melee.BMV 0.1 | 17 | 6% | 18 |
| spinnercat.Omen 1.0 | 12 | 4% | 13 |
| cvt.Firsty 1.0 | 10 | 4% | 10 |

## Melee bench: F13

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 66.7 | 64 / 350 | 3.99 | 12.9% | 31486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 14.4% | 100 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.8 | 14.2% | 98 |
| hadur117.nano.SanaroS06 0.1 | 3.1 | 12.9% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.4% | 31 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 16 |
| tvv.nano.Polaris 1.2 | 6.7 | 8.6% | 19 |
| arthord.NanoSatanMelee Beta | 7.1 | 8.5% | 7 |
| zyx.nano.Ant 1.1 | 7.6 | 8.0% | 11 |
| amz.NanoClone 1.41 | 8.6 | 7.3% | 6 |
| arthord.MannyPacquiao Beta | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.6 | 74.3 | 11 / 35 | 3430 |
| 2 | 4 | 56.0 | 61.3 | 4 / 35 | 2919 |
| 3 | 4 | 58.6 | 67.6 | 6 / 35 | 3097 |
| 4 | 4 | 57.4 | 62.2 | 6 / 35 | 3196 |
| 5 | 3 | 61.0 | 72.1 | 9 / 35 | 3256 |
| 6 | 4 | 54.7 | 56.5 | 3 / 35 | 3005 |
| 7 | 1 | 61.7 | 74.9 | 10 / 35 | 3447 |
| 8 | 4 | 58.5 | 67.3 | 6 / 35 | 3048 |
| 9 | 3 | 58.7 | 66.0 | 7 / 35 | 3206 |
| 10 | 3 | 56.9 | 65.1 | 2 / 35 | 2882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 34% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 79% |
| davidalves.net.DuelistNanoMelee 1.01 | 29 | 31% |
| mld.Wisdom 1.0 | 9 | 56% |
| zyx.nano.Ant 1.1 | 8 | 75% |
| arthord.NanoSatanMelee Beta | 5 | 80% |
| tvv.nano.Polaris 1.2 | 4 | 25% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 286 of 350 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 69 | 24% | 78 |
| d414.nano.Quantum 1.0.0 | 62 | 22% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 13% | 65 |
| mld.Wisdom 1.0 | 33 | 12% | 40 |
| arthord.NanoSatanMelee Beta | 30 | 10% | 33 |
| amz.NanoClone 1.41 | 22 | 8% | 22 |
| tvv.nano.Polaris 1.2 | 17 | 6% | 17 |
| zyx.nano.Ant 1.1 | 13 | 5% | 16 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |

