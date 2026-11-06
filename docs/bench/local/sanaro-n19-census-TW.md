# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 71.0 | 26 / 140 | 3.61 | 13.0% | 10329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.8% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.5% | 30 |
| hadur117.nano.SanaroTW 0.4 | 3.3 | 13.0% | 26 |
| bzdp.Pansy 2.1 | 3.8 | 11.7% | 11 |
| tvv.nano.Polaris 1.2 | 5.3 | 10.0% | 8 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.7% | 0 |
| fm.claire 1.7 | 7.0 | 8.1% | 0 |
| zyx.nano.Ant 1.1 | 7.8 | 8.0% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.6% | 6 |
| arthord.MannyPacquiao Beta | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.7 | 65.7 | 6 / 35 | 2694 |
| 2 | 3 | 61.0 | 76.5 | 8 / 35 | 2522 |
| 3 | 3 | 60.2 | 73.3 | 6 / 35 | 2628 |
| 4 | 4 | 58.3 | 68.3 | 6 / 35 | 2485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 20% |
| bzdp.Pansy 2.1 | 11 | 91% |
| tvv.nano.Polaris 1.2 | 4 | 25% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 114 of 140 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 33% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 26% | 36 |
| bzdp.Pansy 2.1 | 20 | 18% | 31 |
| zyx.nano.Ant 1.1 | 10 | 9% | 10 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 4% | 6 |
| fm.claire 1.7 | 3 | 3% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 72.2 | 25 / 140 | 3.50 | 12.9% | 8301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.9% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.1% | 18 |
| hadur117.nano.SanaroTW 0.4 | 3.3 | 12.9% | 25 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 12.9% | 19 |
| DBall.Anarchy 0.1 | 5.0 | 11.4% | 20 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 9.9% | 24 |
| fm.mammillarias 1.3 | 6.5 | 9.7% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.4% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.7% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 77.1 | 10 / 35 | 2311 |
| 2 | 3 | 59.0 | 73.0 | 6 / 35 | 1902 |
| 3 | 4 | 58.8 | 69.2 | 6 / 35 | 2139 |
| 4 | 4 | 57.7 | 69.5 | 3 / 35 | 1949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 18% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 33% |
| DBall.Anarchy 0.1 | 12 | 42% |
| simonton.nano.MeleeSeed 1.8 | 10 | 80% |
| stelo.SoJNanoMelee 1.1 | 9 | 33% |
| fm.mammillarias 1.3 | 2 | 50% |
| sample.MyFirstRobot 1.0 | 2 | 50% |

Hadur died in 115 of 140 rounds, at a mean tick of 1102. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 25% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 19% | 27 |
| stelo.SoJNanoMelee 1.1 | 21 | 18% | 23 |
| simonton.nano.MeleeSeed 1.8 | 16 | 14% | 22 |
| DBall.Anarchy 0.1 | 12 | 10% | 17 |
| fm.mammillarias 1.3 | 12 | 10% | 12 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 1% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 4 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 71.8 | 24 / 140 | 3.54 | 13.3% | 12110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.1% | 34 |
| hadur117.nano.SanaroTW 0.4 | 3.3 | 13.3% | 24 |
| ahf.NanoAndrew .4 | 4.3 | 11.7% | 12 |
| ratosh.Nobo 0.21 | 4.8 | 11.0% | 3 |
| timmit.nano.TimDog 0.33 | 5.8 | 10.1% | 7 |
| stelo.PatternRobot 1.0 | 7.0 | 7.9% | 6 |
| repositorio.NanoStep 1.0 | 8.3 | 5.8% | 2 |
| sample.Crazy 1.0 | 8.8 | 5.4% | 0 |
| kurios.DOSexe .9a | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 75.9 | 4 / 35 | 3010 |
| 2 | 4 | 57.3 | 65.7 | 5 / 35 | 2916 |
| 3 | 3 | 58.9 | 70.8 | 5 / 35 | 2774 |
| 4 | 3 | 62.0 | 74.9 | 10 / 35 | 3410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 27% |
| d414.nano.Quantum 1.0.0 | 21 | 14% |
| stelo.PatternRobot 1.0 | 6 | 67% |
| ahf.NanoAndrew .4 | 6 | 50% |
| timmit.nano.TimDog 0.33 | 5 | 80% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 116 of 140 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 27% | 38 |
| d414.nano.Quantum 1.0.0 | 30 | 26% | 33 |
| ahf.NanoAndrew .4 | 17 | 15% | 23 |
| ratosh.Nobo 0.21 | 12 | 10% | 12 |
| stelo.PatternRobot 1.0 | 11 | 9% | 12 |
| timmit.nano.TimDog 0.33 | 6 | 5% | 10 |
| kurios.DOSexe .9a | 6 | 5% | 6 |
| repositorio.NanoStep 1.0 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.3 | 29 / 140 | 2.96 | 14.7% | 15664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.9% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.2% | 34 |
| hadur117.nano.SanaroTW 0.4 | 2.8 | 14.7% | 29 |
| wompi.Quokka 1.6 | 4.0 | 14.0% | 12 |
| kurios.DOSexe .9b | 5.0 | 7.7% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 6.8 | 6.7% | 2 |
| maribo.FollowFire 1 | 7.0 | 6.8% | 0 |
| jangs.ns51 1.0 | 7.3 | 6.3% | 2 |
| sample.VelociRobot 1.0 | 9.0 | 5.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 74.3 | 4 / 35 | 3771 |
| 2 | 3 | 64.4 | 84.4 | 8 / 35 | 3672 |
| 3 | 3 | 62.6 | 74.9 | 9 / 35 | 4101 |
| 4 | 2 | 63.6 | 79.4 | 8 / 35 | 4120 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 23% |
| d414.nano.Quantum 1.0.0 | 23 | 17% |
| wompi.Quokka 1.6 | 15 | 87% |
| kurios.DOSexe .9b | 4 | 25% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| sample.VelociRobot 1.0 | 2 | 100% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 111 of 140 rounds, at a mean tick of 1583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 44 | 40% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 30% | 46 |
| wompi.Quokka 1.6 | 17 | 15% | 22 |
| kurios.DOSexe .9b | 5 | 5% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 4% | 7 |
| maribo.FollowFire 1 | 4 | 4% | 4 |
| jangs.ns51 1.0 | 3 | 3% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 75.7 | 18 / 140 | 3.19 | 13.6% | 12785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.9% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.0% | 43 |
| hadur117.nano.SanaroTW 0.4 | 3.0 | 13.6% | 18 |
| ntc.Opposite 1.5 | 4.5 | 11.4% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.7% | 4 |
| js.PinBall 1.6 | 5.5 | 10.7% | 5 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.6% | 4 |
| PSW.Relentless 0.1 | 8.3 | 4.4% | 0 |
| sample.Fire 1.0 | 9.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 74.3 | 4 / 35 | 2990 |
| 2 | 3 | 61.0 | 72.7 | 6 / 35 | 3594 |
| 3 | 3 | 60.7 | 74.6 | 4 / 35 | 3021 |
| 4 | 3 | 62.6 | 81.3 | 4 / 35 | 3180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 6% |
| js.PinBall 1.6 | 4 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 50% |
| sp.Nanos.Ember 1.1 | 3 | 100% |
| ntc.Opposite 1.5 | 3 | 33% |

Hadur died in 123 of 140 rounds, at a mean tick of 1413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 46 | 37% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 30% | 40 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 12% | 15 |
| ntc.Opposite 1.5 | 11 | 9% | 11 |
| js.PinBall 1.6 | 10 | 8% | 13 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 7 |

## Melee bench: F06

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 66.2 | 13 / 140 | 4.04 | 11.9% | 9800 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 13.9% | 35 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.6% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.4% | 22 |
| radnor.DoctorBob 1.42 | 3.8 | 12.8% | 23 |
| hadur117.nano.SanaroTW 0.4 | 4.8 | 11.9% | 13 |
| myl.nano.Graviton 1.10 | 6.0 | 10.3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 7.5 | 8.3% | 3 |
| stelo.MirrorNano 1.3 | 8.0 | 7.6% | 0 |
| ratosh.Wesco 1.4 | 8.5 | 7.4% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 69.2 | 3 / 35 | 2646 |
| 2 | 5 | 58.3 | 70.5 | 2 / 35 | 2238 |
| 3 | 5 | 57.3 | 63.5 | 5 / 35 | 2601 |
| 4 | 5 | 55.5 | 61.6 | 3 / 35 | 2315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 22% |
| d414.nano.Quantum 1.0.0 | 16 | 13% |
| kawigi.nano.Lib 1.0 | 12 | 25% |
| radnor.DoctorBob 1.42 | 5 | 20% |
| myl.nano.Graviton 1.10 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 127 of 140 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 29 | 23% | 32 |
| d414.nano.Quantum 1.0.0 | 27 | 21% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 20% | 30 |
| radnor.DoctorBob 1.42 | 20 | 16% | 20 |
| myl.nano.Graviton 1.10 | 16 | 13% | 18 |
| squidM.TentalceMeleeNano 1.1 | 6 | 5% | 6 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 70.5 | 31 / 140 | 3.66 | 13.0% | 11205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.0% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 27 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 13.1% | 21 |
| hadur117.nano.SanaroTW 0.4 | 3.3 | 13.0% | 31 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.2% | 17 |
| mz.Cork 0.1 | 5.8 | 10.7% | 7 |
| oog.melee.CapuletDroid 1.1 | 7.0 | 10.1% | 4 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.5% | 0 |
| stuff.Vlad 0.1 | 8.8 | 4.9% | 0 |
| sample.TrackFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 67.9 | 7 / 35 | 2602 |
| 2 | 4 | 57.4 | 64.8 | 6 / 35 | 2699 |
| 3 | 4 | 58.9 | 71.4 | 5 / 35 | 2652 |
| 4 | 1 | 62.7 | 77.8 | 13 / 35 | 3252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 26% |
| nz.jdc.nano.GridFu 1.0 | 12 | 67% |
| cb.nano.Insomnia 1.0 | 9 | 56% |
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| oog.melee.CapuletDroid 1.1 | 7 | 86% |
| mz.Cork 0.1 | 6 | 100% |

Hadur died in 109 of 140 rounds, at a mean tick of 1176. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 28% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 25% | 37 |
| cb.nano.Insomnia 1.0 | 15 | 14% | 13 |
| nz.jdc.nano.GridFu 1.0 | 14 | 13% | 22 |
| oog.melee.CapuletDroid 1.1 | 9 | 8% | 15 |
| mz.Cork 0.1 | 9 | 8% | 14 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 1 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 76.5 | 27 / 140 | 3.11 | 13.8% | 11547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.3% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.1% | 29 |
| hadur117.nano.SanaroTW 0.4 | 3.3 | 13.8% | 27 |
| gh.nano.Grofvuil 0.2 | 3.5 | 13.3% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 11.2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.5% | 4 |
| baal.nano.N 1.42 | 6.5 | 9.0% | 1 |
| donjezza.Muncho 1.0 | 8.3 | 5.8% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 5.0% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.6 | 76.2 | 9 / 35 | 2767 |
| 2 | 3 | 61.7 | 76.8 | 6 / 35 | 2944 |
| 3 | 4 | 59.2 | 72.4 | 2 / 35 | 2526 |
| 4 | 2 | 63.4 | 80.6 | 10 / 35 | 3310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 15% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 25% |
| gh.nano.Grofvuil 0.2 | 14 | 64% |
| donjezza.Muncho 1.0 | 5 | 60% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| baal.nano.N 1.42 | 2 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 50% |

Hadur died in 113 of 140 rounds, at a mean tick of 1210. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 34% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 28% | 38 |
| gh.nano.Grofvuil 0.2 | 18 | 16% | 26 |
| baal.nano.N 1.42 | 9 | 8% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 8% | 9 |
| djdjdj.NanoSkunk10 1.0 | 4 | 4% | 8 |
| donjezza.Muncho 1.0 | 3 | 3% | 7 |

## Melee bench: F09

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.6 | 60.5 | 13 / 140 | 4.56 | 11.1% | 9173 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.5 | 13.1% | 25 |
| mld.DustBunny 3.8 | 3.0 | 11.9% | 21 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 12.0% | 25 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.3% | 13 |
| hadur117.nano.SanaroTW 0.4 | 4.8 | 11.1% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 6.8 | 9.3% | 8 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 8.5 | 7.5% | 9 |
| step.nanoPri 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 50.4 | 53.3 | 2 / 35 | 2085 |
| 2 | 7 | 50.0 | 52.7 | 2 / 35 | 2201 |
| 3 | 5 | 54.9 | 63.5 | 3 / 35 | 2317 |
| 4 | 1 | 58.9 | 72.4 | 6 / 35 | 2570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 12 | 33% |
| wee.Gem 1.8.4 | 6 | 50% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 20% |
| d414.nano.Quantum 1.0.0 | 5 | 0% |
| mld.DustBunny 3.8 | 5 | 0% |
| tj.zombie1n 1.0.1 | 4 | 25% |

Hadur died in 128 of 140 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 29 | 23% | 31 |
| d414.nano.Quantum 1.0.0 | 23 | 18% | 23 |
| mld.DustBunny 3.8 | 19 | 15% | 21 |
| wee.Gem 1.8.4 | 17 | 13% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 10% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 9% | 13 |
| tj.zombie1n 1.0.1 | 9 | 7% | 7 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 6 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 75.6 | 20 / 140 | 3.20 | 14.0% | 13474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.5% | 40 |
| mld.Infinity 2.2 | 2.8 | 14.6% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.9% | 33 |
| hadur117.nano.SanaroTW 0.4 | 3.3 | 14.0% | 20 |
| ayk.WallHugger 1.0 | 5.8 | 8.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 7.9% | 2 |
| conscience.Electron 1.3g | 6.5 | 7.5% | 0 |
| exauge.GateKeeper 1.1.121g | 7.3 | 7.2% | 2 |
| donjezza.Jezza 1.0 | 9.0 | 6.2% | 3 |
| sample.RamFire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 81.9 | 6 / 35 | 3552 |
| 2 | 4 | 61.0 | 73.7 | 3 / 35 | 3536 |
| 3 | 3 | 63.5 | 80.0 | 7 / 35 | 3492 |
| 4 | 4 | 57.3 | 66.7 | 4 / 35 | 2894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 26 | 38% |
| d414.nano.Quantum 1.0.0 | 21 | 10% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 19% |
| donjezza.Jezza 1.0 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 120 of 140 rounds, at a mean tick of 1713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 43 | 36% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 26% | 53 |
| mld.Infinity 2.2 | 31 | 26% | 13 |
| robar.nano.Assertive_Melee 0.2 | 5 | 4% | 6 |
| exauge.GateKeeper 1.1.121g | 5 | 4% | 5 |
| ayk.WallHugger 1.0 | 2 | 2% | 5 |
| conscience.Electron 1.3g | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 76.3 | 32 / 140 | 3.13 | 14.1% | 11578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.8% | 37 |
| hadur117.nano.SanaroTW 0.4 | 2.5 | 14.1% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.9% | 37 |
| oog.melee.Corsair 1.0 | 3.5 | 13.3% | 15 |
| mz.NanoGod 2.02 | 5.0 | 11.3% | 14 |
| awesomeness.Elite 1.0 | 6.3 | 8.4% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.0% | 0 |
| DBall.NUKE 0.1 | 7.8 | 7.4% | 1 |
| sample.Walls 1.0 | 8.8 | 5.7% | 3 |
| stelo.PianistNano 1.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 77.8 | 10 / 35 | 2848 |
| 2 | 2 | 61.1 | 74.6 | 6 / 35 | 3128 |
| 3 | 3 | 61.4 | 77.8 | 7 / 35 | 2843 |
| 4 | 3 | 60.5 | 75.2 | 9 / 35 | 2759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 12% |
| d414.nano.Quantum 1.0.0 | 25 | 28% |
| oog.melee.Corsair 1.0 | 18 | 78% |
| mz.NanoGod 2.02 | 5 | 20% |
| DBall.NUKE 0.1 | 5 | 80% |
| sample.Walls 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 108 of 140 rounds, at a mean tick of 1334. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 32% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 30% | 35 |
| mz.NanoGod 2.02 | 15 | 14% | 17 |
| oog.melee.Corsair 1.0 | 13 | 12% | 25 |
| DBall.NUKE 0.1 | 5 | 5% | 10 |
| sample.Walls 1.0 | 3 | 3% | 3 |
| awesomeness.Elite 1.0 | 2 | 2% | 3 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 64.7 | 12 / 140 | 4.18 | 11.7% | 9591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.4% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.0% | 22 |
| myl.nano.KomoriNinja 1.1 | 2.5 | 13.0% | 27 |
| hadur117.nano.SanaroTW 0.4 | 4.3 | 11.7% | 12 |
| sul.Lunar 1.1 | 4.3 | 11.4% | 22 |
| maribo.melee.BMV 0.1 | 7.0 | 8.1% | 3 |
| spinnercat.Omen 1.0 | 7.3 | 7.9% | 8 |
| sam.Samspin 1.0 | 7.3 | 8.0% | 6 |
| sample.SpinBot 1.0 | 8.5 | 7.5% | 3 |
| cvt.Firsty 1.0 | 10.0 | 5.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.8 | 67.9 | 3 / 35 | 2503 |
| 2 | 4 | 54.5 | 60.6 | 3 / 35 | 2551 |
| 3 | 4 | 54.3 | 61.9 | 2 / 35 | 2403 |
| 4 | 5 | 56.3 | 68.3 | 4 / 35 | 2134 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| sul.Lunar 1.1 | 13 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 40% |
| myl.nano.KomoriNinja 1.1 | 6 | 33% |
| cvt.Firsty 1.0 | 2 | 0% |
| sample.SpinBot 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 128 of 140 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 26% | 37 |
| myl.nano.KomoriNinja 1.1 | 26 | 20% | 28 |
| sul.Lunar 1.1 | 26 | 20% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 25 |
| sam.Samspin 1.0 | 6 | 5% | 6 |
| maribo.melee.BMV 0.1 | 5 | 4% | 5 |
| sample.SpinBot 1.0 | 4 | 3% | 5 |
| spinnercat.Omen 1.0 | 4 | 3% | 4 |
| cvt.Firsty 1.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.nano.SanaroTW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 69.4 | 13 / 140 | 3.75 | 12.1% | 9287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.6% | 53 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.8 | 14.6% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 19 |
| hadur117.nano.SanaroTW 0.4 | 3.8 | 12.1% | 13 |
| mld.Wisdom 1.0 | 5.0 | 10.9% | 6 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.9% | 3 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.0% | 4 |
| zyx.nano.Ant 1.1 | 7.8 | 7.7% | 4 |
| amz.NanoClone 1.41 | 7.8 | 7.3% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.2 | 74.0 | 5 / 35 | 2279 |
| 2 | 3 | 57.9 | 70.2 | 3 / 35 | 2544 |
| 3 | 4 | 55.0 | 65.1 | 3 / 35 | 2114 |
| 4 | 4 | 56.4 | 68.6 | 2 / 35 | 2350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 10% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 18% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 7% |
| mld.Wisdom 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 0% |

Hadur died in 129 of 140 rounds, at a mean tick of 1255. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 26% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 33 | 26% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 24 |
| mld.Wisdom 1.0 | 18 | 14% | 22 |
| zyx.nano.Ant 1.1 | 6 | 5% | 6 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 6 |
| arthord.NanoSatanMelee Beta | 5 | 4% | 6 |
| amz.NanoClone 1.41 | 5 | 4% | 5 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |

