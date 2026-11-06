# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 72.4 | 14 / 140 | 3.49 | 12.7% | 9170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.5% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.4% | 28 |
| bzdp.Pansy 2.1 | 3.3 | 12.6% | 15 |
| hadur117.nano.SanaroTW6 0.4 | 3.3 | 12.7% | 14 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.9% | 14 |
| fm.claire 1.7 | 7.0 | 8.3% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 8.4% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.6% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.9% | 5 |
| arthord.MannyPacquiao Beta | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 73.3 | 2 / 35 | 2018 |
| 2 | 4 | 58.0 | 69.2 | 3 / 35 | 2314 |
| 3 | 2 | 59.8 | 74.6 | 6 / 35 | 2520 |
| 4 | 3 | 58.4 | 72.4 | 3 / 35 | 2318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 14% |
| d414.nano.Quantum 1.0.0 | 17 | 6% |
| bzdp.Pansy 2.1 | 12 | 58% |
| tvv.nano.Polaris 1.2 | 8 | 13% |
| arthord.NanoSatanMelee Beta | 4 | 25% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 1122. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 32% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 24% | 33 |
| bzdp.Pansy 2.1 | 18 | 14% | 24 |
| tvv.nano.Polaris 1.2 | 14 | 11% | 14 |
| arthord.NanoSatanMelee Beta | 9 | 7% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 7 |
| zyx.nano.Ant 1.1 | 5 | 4% | 6 |
| fm.claire 1.7 | 4 | 3% | 5 |

## Melee bench: F02

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 72.2 | 27 / 140 | 3.50 | 12.9% | 7998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.1% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.4% | 18 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 13.1% | 18 |
| hadur117.nano.SanaroTW6 0.4 | 3.5 | 12.9% | 27 |
| DBall.Anarchy 0.1 | 5.0 | 10.6% | 13 |
| fm.mammillarias 1.3 | 6.5 | 9.9% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 9.7% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.8% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 69.5 | 7 / 35 | 1945 |
| 2 | 3 | 61.2 | 78.1 | 6 / 35 | 1923 |
| 3 | 4 | 60.0 | 72.4 | 8 / 35 | 2239 |
| 4 | 4 | 58.1 | 68.9 | 6 / 35 | 1891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 14% |
| d414.nano.Quantum 1.0.0 | 13 | 23% |
| stelo.SoJNanoMelee 1.1 | 12 | 8% |
| simonton.nano.MeleeSeed 1.8 | 12 | 83% |
| DBall.Anarchy 0.1 | 8 | 63% |
| fm.mammillarias 1.3 | 6 | 83% |
| sample.MyFirstRobot 1.0 | 2 | 50% |

Hadur died in 113 of 140 rounds, at a mean tick of 1092. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 27% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 21% | 28 |
| stelo.SoJNanoMelee 1.1 | 19 | 17% | 19 |
| fm.mammillarias 1.3 | 16 | 14% | 17 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 17 |
| DBall.Anarchy 0.1 | 9 | 8% | 15 |
| sample.MyFirstRobot 1.0 | 4 | 4% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 70.6 | 23 / 140 | 3.65 | 12.8% | 10916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.0% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 14.9% | 28 |
| hadur117.nano.SanaroTW6 0.4 | 3.3 | 12.8% | 23 |
| ahf.NanoAndrew .4 | 3.8 | 11.7% | 18 |
| ratosh.Nobo 0.21 | 5.0 | 10.8% | 5 |
| timmit.nano.TimDog 0.33 | 6.0 | 8.7% | 5 |
| stelo.PatternRobot 1.0 | 7.0 | 7.7% | 7 |
| repositorio.NanoStep 1.0 | 8.3 | 6.5% | 3 |
| sample.Crazy 1.0 | 8.8 | 6.2% | 3 |
| kurios.DOSexe .9a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 71.1 | 3 / 35 | 2930 |
| 2 | 4 | 57.5 | 69.2 | 6 / 35 | 2423 |
| 3 | 3 | 59.3 | 71.7 | 7 / 35 | 2782 |
| 4 | 3 | 58.9 | 70.2 | 7 / 35 | 2781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 42% |
| ahf.NanoAndrew .4 | 13 | 38% |
| d414.nano.Quantum 1.0.0 | 13 | 15% |
| timmit.nano.TimDog 0.33 | 4 | 50% |
| sample.Crazy 1.0 | 2 | 50% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| ratosh.Nobo 0.21 | 1 | 0% |

Hadur died in 117 of 140 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 26% | 38 |
| d414.nano.Quantum 1.0.0 | 29 | 25% | 32 |
| ahf.NanoAndrew .4 | 19 | 16% | 24 |
| ratosh.Nobo 0.21 | 14 | 12% | 14 |
| stelo.PatternRobot 1.0 | 11 | 9% | 14 |
| timmit.nano.TimDog 0.33 | 9 | 8% | 11 |
| repositorio.NanoStep 1.0 | 2 | 2% | 3 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 76.5 | 19 / 140 | 3.11 | 13.9% | 14096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 17.6% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.5 | 16.7% | 46 |
| wompi.Quokka 1.6 | 3.3 | 14.2% | 13 |
| hadur117.nano.SanaroTW6 0.4 | 3.8 | 13.9% | 19 |
| kurios.DOSexe .9b | 6.0 | 7.4% | 3 |
| maribo.FollowFire 1 | 6.3 | 6.8% | 0 |
| jangs.ns51 1.0 | 6.8 | 6.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 7.5 | 6.4% | 4 |
| sample.VelociRobot 1.0 | 8.5 | 5.9% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 83.8 | 8 / 35 | 3220 |
| 2 | 4 | 59.4 | 71.4 | 2 / 35 | 3363 |
| 3 | 4 | 60.6 | 72.4 | 3 / 35 | 3825 |
| 4 | 4 | 62.9 | 78.4 | 6 / 35 | 3688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 12% |
| d414.nano.Quantum 1.0.0 | 22 | 18% |
| wompi.Quokka 1.6 | 8 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 25% |
| jangs.ns51 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 0% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 121 of 140 rounds, at a mean tick of 1792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 40% | 56 |
| d414.nano.Quantum 1.0.0 | 45 | 37% | 50 |
| wompi.Quokka 1.6 | 9 | 7% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 6% | 9 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| jangs.ns51 1.0 | 3 | 2% | 4 |
| drd.Dreadknoght 0.9 | 2 | 2% | 2 |
| kurios.DOSexe .9b | 2 | 2% | 2 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 74.5 | 24 / 140 | 3.29 | 13.3% | 12019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.8% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.9% | 23 |
| hadur117.nano.SanaroTW6 0.4 | 2.8 | 13.3% | 24 |
| js.PinBall 1.6 | 4.5 | 11.9% | 12 |
| ntc.Opposite 1.5 | 5.0 | 11.3% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 10.9% | 3 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.7% | 1 |
| PSW.Relentless 0.1 | 8.5 | 4.5% | 0 |
| sample.Fire 1.0 | 8.5 | 4.6% | 2 |
| sample.Target 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 77.1 | 4 / 35 | 3235 |
| 2 | 4 | 57.4 | 66.0 | 3 / 35 | 2616 |
| 3 | 2 | 61.5 | 74.9 | 7 / 35 | 3290 |
| 4 | 2 | 62.1 | 80.0 | 10 / 35 | 2878 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 4% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 23% |
| js.PinBall 1.6 | 7 | 71% |
| sp.Nanos.Ember 1.1 | 5 | 100% |
| ntc.Opposite 1.5 | 5 | 100% |
| sample.Fire 1.0 | 3 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 117 of 140 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 57 | 49% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 26% | 35 |
| ntc.Opposite 1.5 | 9 | 8% | 12 |
| js.PinBall 1.6 | 9 | 8% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 7% | 10 |
| sample.Fire 1.0 | 2 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 68.0 | 19 / 140 | 3.88 | 12.1% | 9005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.0 | 14.6% | 32 |
| d414.nano.Quantum 1.0.0 | 2.8 | 13.5% | 29 |
| radnor.DoctorBob 1.42 | 3.5 | 12.6% | 15 |
| hadur117.nano.SanaroTW6 0.4 | 4.3 | 12.1% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 26 |
| myl.nano.Graviton 1.10 | 5.3 | 11.1% | 15 |
| stelo.MirrorNano 1.3 | 7.8 | 7.9% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.8% | 0 |
| ratosh.Wesco 1.4 | 8.5 | 7.0% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 74.0 | 6 / 35 | 2425 |
| 2 | 3 | 60.4 | 73.7 | 6 / 35 | 2555 |
| 3 | 6 | 57.6 | 67.9 | 5 / 35 | 2017 |
| 4 | 5 | 53.1 | 56.5 | 2 / 35 | 2008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 23% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 0% |
| kawigi.nano.Lib 1.0 | 11 | 45% |
| radnor.DoctorBob 1.42 | 8 | 75% |
| myl.nano.Graviton 1.10 | 4 | 75% |
| stelo.MirrorNano 1.3 | 2 | 50% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 122 of 140 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 24% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 22% | 28 |
| d414.nano.Quantum 1.0.0 | 25 | 20% | 27 |
| radnor.DoctorBob 1.42 | 18 | 15% | 25 |
| myl.nano.Graviton 1.10 | 11 | 9% | 14 |
| ratosh.Wesco 1.4 | 6 | 5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 3 | 2% | 3 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |

## Melee bench: F07

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 67.0 | 33 / 140 | 3.97 | 12.4% | 10154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 14.4% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.5% | 28 |
| nz.jdc.nano.GridFu 1.0 | 2.3 | 13.5% | 23 |
| hadur117.nano.SanaroTW6 0.4 | 4.3 | 12.4% | 33 |
| cb.nano.Insomnia 1.0 | 5.5 | 11.7% | 9 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 11.2% | 9 |
| mz.Cork 0.1 | 6.3 | 10.9% | 5 |
| stuff.Vlad 0.1 | 8.5 | 4.7% | 0 |
| stelo.UntouchableNano 1.3 | 8.5 | 4.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 67.3 | 9 / 35 | 2541 |
| 2 | 4 | 58.9 | 67.6 | 7 / 35 | 2604 |
| 3 | 4 | 58.1 | 67.0 | 9 / 35 | 2694 |
| 4 | 5 | 57.7 | 66.0 | 8 / 35 | 2315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 16 | 94% |
| d414.nano.Quantum 1.0.0 | 12 | 33% |
| nz.jdc.nano.GridFu 1.0 | 9 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 14% |
| oog.melee.CapuletDroid 1.1 | 5 | 80% |
| mz.Cork 0.1 | 3 | 100% |

Hadur died in 107 of 140 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 31% | 39 |
| nz.jdc.nano.GridFu 1.0 | 21 | 20% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 14% | 22 |
| cb.nano.Insomnia 1.0 | 12 | 11% | 11 |
| oog.melee.CapuletDroid 1.1 | 11 | 10% | 19 |
| mz.Cork 0.1 | 10 | 9% | 15 |
| stelo.UntouchableNano 1.3 | 3 | 3% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 75.9 | 20 / 140 | 3.17 | 13.3% | 10313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.5% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.4% | 38 |
| hadur117.nano.SanaroTW6 0.4 | 3.5 | 13.3% | 20 |
| gh.nano.Grofvuil 0.2 | 3.8 | 12.7% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.5% | 10 |
| baal.nano.N 1.42 | 6.5 | 9.5% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.8 | 5.2% | 2 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.7 | 74.3 | 2 / 35 | 2511 |
| 2 | 3 | 60.0 | 74.3 | 5 / 35 | 2508 |
| 3 | 4 | 60.9 | 75.6 | 8 / 35 | 2523 |
| 4 | 3 | 61.7 | 79.4 | 5 / 35 | 2771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 14% |
| d414.nano.Quantum 1.0.0 | 26 | 23% |
| gh.nano.Grofvuil 0.2 | 6 | 17% |
| djdjdj.NanoSkunk10 1.0 | 4 | 50% |
| baal.nano.N 1.42 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |

Hadur died in 120 of 140 rounds, at a mean tick of 1443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 35% | 47 |
| d414.nano.Quantum 1.0.0 | 40 | 33% | 46 |
| gh.nano.Grofvuil 0.2 | 13 | 11% | 14 |
| djdjdj.NanoSkunk10 1.0 | 9 | 8% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 6% | 8 |
| baal.nano.N 1.42 | 4 | 3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 3% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 4 battles (1.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 51.8 | 57.0 | 14 / 140 | 4.87 | 10.3% | 7971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.DustBunny 3.8 | 2.3 | 12.5% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 2.8 | 12.3% | 35 |
| d414.nano.Quantum 1.0.0 | 2.8 | 12.1% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 11.6% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 10.7% | 13 |
| wee.Gem 1.8.4 | 5.5 | 10.8% | 13 |
| hadur117.nano.SanaroTW6 0.4 | 5.8 | 10.3% | 14 |
| tj.zombie1n 1.0.1 | 8.5 | 7.6% | 11 |
| cs.sheldor.Talon 1.1 | 9.0 | 6.4% | 0 |
| step.nanoPri 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.2 | 59.0 | 4 / 35 | 2175 |
| 2 | 7 | 49.1 | 51.7 | 5 / 35 | 1718 |
| 3 | 6 | 52.8 | 59.4 | 2 / 35 | 2087 |
| 4 | 6 | 52.2 | 57.8 | 3 / 35 | 1991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 11 | 27% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 60% |
| wee.Gem 1.8.4 | 5 | 80% |
| d414.nano.Quantum 1.0.0 | 5 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4 | 0% |
| mld.DustBunny 3.8 | 4 | 75% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 23% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 27 | 21% | 29 |
| mld.DustBunny 3.8 | 22 | 17% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 19 |
| wee.Gem 1.8.4 | 10 | 8% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 6% | 11 |
| step.nanoPri 1.0 | 6 | 5% | 6 |
| cs.sheldor.Talon 1.1 | 4 | 3% | 5 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 73.0 | 30 / 140 | 3.43 | 13.3% | 11535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 15.5% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.5% | 37 |
| mld.Infinity 2.2 | 2.5 | 14.5% | 28 |
| hadur117.nano.SanaroTW6 0.4 | 4.0 | 13.3% | 30 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 8.7% | 3 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 2 |
| ayk.WallHugger 1.0 | 6.8 | 7.8% | 1 |
| conscience.Electron 1.3g | 7.0 | 7.6% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.3% | 2 |
| sample.RamFire 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.0 | 74.9 | 12 / 35 | 2921 |
| 2 | 4 | 58.2 | 68.3 | 3 / 35 | 2948 |
| 3 | 4 | 60.3 | 74.0 | 9 / 35 | 2734 |
| 4 | 4 | 60.4 | 74.9 | 6 / 35 | 2932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 26 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 15% |
| d414.nano.Quantum 1.0.0 | 18 | 17% |
| ayk.WallHugger 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 110 of 140 rounds, at a mean tick of 1419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 37% | 56 |
| d414.nano.Quantum 1.0.0 | 28 | 25% | 42 |
| mld.Infinity 2.2 | 19 | 17% | 14 |
| robar.nano.Assertive_Melee 0.2 | 9 | 8% | 11 |
| conscience.Electron 1.3g | 6 | 5% | 6 |
| exauge.GateKeeper 1.1.121g | 4 | 4% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 4 |

## Melee bench: F11

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 71.0 | 28 / 140 | 3.61 | 13.0% | 10361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 43 |
| hadur117.nano.SanaroTW6 0.4 | 3.0 | 13.0% | 28 |
| oog.melee.Corsair 1.0 | 3.0 | 13.2% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.0% | 21 |
| mz.NanoGod 2.02 | 4.5 | 11.6% | 17 |
| DBall.NUKE 0.1 | 6.8 | 8.1% | 8 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.5% | 0 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 2 |
| sample.Walls 1.0 | 8.8 | 6.6% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 72.7 | 6 / 35 | 2813 |
| 2 | 4 | 57.2 | 67.0 | 8 / 35 | 2398 |
| 3 | 3 | 61.0 | 73.3 | 10 / 35 | 2988 |
| 4 | 3 | 57.4 | 71.1 | 4 / 35 | 2162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 20% |
| oog.melee.Corsair 1.0 | 18 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 28% |
| mz.NanoGod 2.02 | 8 | 50% |
| DBall.NUKE 0.1 | 6 | 83% |

Hadur died in 112 of 140 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 30% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 21% | 28 |
| mz.NanoGod 2.02 | 22 | 20% | 25 |
| oog.melee.Corsair 1.0 | 19 | 17% | 30 |
| zyx.nano.BacillusComma 1.0 | 5 | 4% | 5 |
| DBall.NUKE 0.1 | 3 | 3% | 8 |
| awesomeness.Elite 1.0 | 3 | 3% | 3 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| sample.Walls 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 65.2 | 15 / 140 | 4.13 | 11.6% | 8739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.4% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.9% | 20 |
| sul.Lunar 1.1 | 4.3 | 11.6% | 22 |
| hadur117.nano.SanaroTW6 0.4 | 4.5 | 11.6% | 15 |
| maribo.melee.BMV 0.1 | 6.0 | 8.8% | 1 |
| spinnercat.Omen 1.0 | 7.0 | 7.9% | 6 |
| sam.Samspin 1.0 | 8.0 | 7.3% | 2 |
| sample.SpinBot 1.0 | 9.0 | 6.9% | 7 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.3 | 63.2 | 1 / 35 | 2263 |
| 2 | 4 | 56.9 | 67.6 | 7 / 35 | 2219 |
| 3 | 5 | 55.8 | 65.1 | 4 / 35 | 2126 |
| 4 | 5 | 55.4 | 65.1 | 3 / 35 | 2131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 19% |
| d414.nano.Quantum 1.0.0 | 11 | 27% |
| sul.Lunar 1.1 | 9 | 11% |
| myl.nano.KomoriNinja 1.1 | 7 | 71% |
| sample.SpinBot 1.0 | 2 | 0% |
| spinnercat.Omen 1.0 | 2 | 50% |
| cvt.Firsty 1.0 | 1 | 0% |
| sam.Samspin 1.0 | 1 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 1118. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 28% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 20% | 28 |
| myl.nano.KomoriNinja 1.1 | 19 | 15% | 24 |
| sul.Lunar 1.1 | 18 | 14% | 19 |
| spinnercat.Omen 1.0 | 8 | 6% | 9 |
| sample.SpinBot 1.0 | 8 | 6% | 8 |
| maribo.melee.BMV 0.1 | 5 | 4% | 6 |
| sam.Samspin 1.0 | 4 | 3% | 4 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |

## Melee bench: F13

hadur117.nano.SanaroTW6 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 69.5 | 18 / 140 | 3.74 | 11.9% | 8170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.3% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 13.2% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.3 | 12.4% | 27 |
| hadur117.nano.SanaroTW6 0.4 | 4.0 | 11.9% | 18 |
| mld.Wisdom 1.0 | 4.8 | 11.1% | 12 |
| zyx.nano.Ant 1.1 | 6.8 | 8.6% | 2 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.4% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 8.2% | 3 |
| amz.NanoClone 1.41 | 8.8 | 7.7% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 73.7 | 4 / 35 | 2475 |
| 2 | 5 | 54.4 | 66.0 | 3 / 35 | 1869 |
| 3 | 4 | 56.4 | 69.8 | 3 / 35 | 1973 |
| 4 | 3 | 56.1 | 68.6 | 8 / 35 | 1853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 15% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 5% |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 0% |
| arthord.NanoSatanMelee Beta | 6 | 100% |
| mld.Wisdom 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 3 | 67% |
| tvv.nano.Polaris 1.2 | 2 | 50% |

Hadur died in 122 of 140 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 31% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 22% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 15% | 18 |
| mld.Wisdom 1.0 | 15 | 12% | 20 |
| zyx.nano.Ant 1.1 | 11 | 9% | 12 |
| arthord.NanoSatanMelee Beta | 5 | 4% | 8 |
| amz.NanoClone 1.41 | 5 | 4% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

