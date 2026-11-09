# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 72.2 | 29 / 140 | 3.50 | 13.4% | 10728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.3% | 53 |
| hadur117.nano.SanaroMP 0.4 | 2.8 | 13.4% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.5% | 26 |
| bzdp.Pansy 2.1 | 3.5 | 12.4% | 12 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.7% | 12 |
| zyx.nano.Ant 1.1 | 6.5 | 9.4% | 4 |
| arthord.NanoSatanMelee Beta | 6.8 | 9.0% | 3 |
| fm.claire 1.7 | 7.5 | 7.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.9% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 75.6 | 11 / 35 | 2796 |
| 2 | 4 | 57.8 | 66.0 | 5 / 35 | 2629 |
| 3 | 3 | 59.9 | 71.1 | 8 / 35 | 2664 |
| 4 | 2 | 60.5 | 76.2 | 5 / 35 | 2639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 27% |
| bzdp.Pansy 2.1 | 11 | 55% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 111 of 140 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 41 | 37% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 25% | 34 |
| bzdp.Pansy 2.1 | 24 | 22% | 31 |
| tvv.nano.Polaris 1.2 | 8 | 7% | 7 |
| arthord.NanoSatanMelee Beta | 3 | 3% | 4 |
| fm.claire 1.7 | 3 | 3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 5 |
| zyx.nano.Ant 1.1 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 73.8 | 29 / 140 | 3.36 | 13.6% | 10102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.9% | 33 |
| hadur117.nano.SanaroMP 0.4 | 2.3 | 13.6% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.5% | 23 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.9% | 12 |
| fm.mammillarias 1.3 | 5.5 | 10.3% | 2 |
| DBall.Anarchy 0.1 | 5.5 | 10.4% | 15 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 9.0% | 19 |
| sample.MyFirstRobot 1.0 | 8.3 | 7.6% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 71.4 | 5 / 35 | 2394 |
| 2 | 3 | 61.3 | 74.0 | 7 / 35 | 2915 |
| 3 | 2 | 60.2 | 72.4 | 9 / 35 | 2354 |
| 4 | 1 | 61.5 | 77.5 | 8 / 35 | 2439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 28% |
| d414.nano.Quantum 1.0.0 | 16 | 44% |
| DBall.Anarchy 0.1 | 11 | 55% |
| stelo.SoJNanoMelee 1.1 | 11 | 27% |
| simonton.nano.MeleeSeed 1.8 | 7 | 86% |
| fm.mammillarias 1.3 | 3 | 33% |
| sample.MyFirstRobot 1.0 | 2 | 50% |

Hadur died in 111 of 140 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 27% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 23% | 32 |
| stelo.SoJNanoMelee 1.1 | 15 | 14% | 16 |
| fm.mammillarias 1.3 | 14 | 13% | 14 |
| simonton.nano.MeleeSeed 1.8 | 13 | 12% | 19 |
| DBall.Anarchy 0.1 | 9 | 8% | 16 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 2% | 2 |

## Melee bench: F03

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 74.4 | 29 / 140 | 3.30 | 14.0% | 13302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.3% | 41 |
| hadur117.nano.SanaroMP 0.4 | 2.8 | 14.0% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.7% | 24 |
| ahf.NanoAndrew .4 | 3.3 | 12.4% | 16 |
| ratosh.Nobo 0.21 | 5.0 | 11.3% | 6 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.6% | 8 |
| stelo.PatternRobot 1.0 | 7.0 | 7.4% | 9 |
| sample.Crazy 1.0 | 8.3 | 5.6% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.1% | 5 |
| kurios.DOSexe .9a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 72.1 | 13 / 35 | 3167 |
| 2 | 3 | 61.9 | 77.1 | 6 / 35 | 3459 |
| 3 | 2 | 62.8 | 79.4 | 5 / 35 | 3613 |
| 4 | 4 | 58.5 | 69.2 | 5 / 35 | 3063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 19% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 23% |
| ahf.NanoAndrew .4 | 9 | 89% |
| stelo.PatternRobot 1.0 | 4 | 50% |
| ratosh.Nobo 0.21 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| repositorio.NanoStep 1.0 | 2 | 50% |
| kurios.DOSexe .9a | 1 | 100% |

Hadur died in 111 of 140 rounds, at a mean tick of 1395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 35% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 25% | 33 |
| stelo.PatternRobot 1.0 | 16 | 14% | 18 |
| ahf.NanoAndrew .4 | 11 | 10% | 18 |
| ratosh.Nobo 0.21 | 8 | 7% | 11 |
| timmit.nano.TimDog 0.33 | 6 | 5% | 11 |
| repositorio.NanoStep 1.0 | 3 | 3% | 4 |
| kurios.DOSexe .9a | 0 | 0% | 2 |

## Melee bench: F04

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.7 | 36 / 140 | 3.01 | 15.1% | 16984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.9% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.2% | 29 |
| hadur117.nano.SanaroMP 0.4 | 3.0 | 15.1% | 36 |
| wompi.Quokka 1.6 | 4.0 | 13.6% | 12 |
| kurios.DOSexe .9b | 5.5 | 7.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 6.5 | 6.6% | 4 |
| maribo.FollowFire 1 | 7.3 | 6.6% | 0 |
| jangs.ns51 1.0 | 7.8 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 8.0 | 5.9% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 76.5 | 9 / 35 | 4231 |
| 2 | 3 | 64.0 | 78.4 | 10 / 35 | 4079 |
| 3 | 3 | 62.6 | 71.1 | 7 / 35 | 4676 |
| 4 | 3 | 65.0 | 84.8 | 10 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 21% |
| d414.nano.Quantum 1.0.0 | 28 | 29% |
| wompi.Quokka 1.6 | 14 | 100% |
| sample.VelociRobot 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 33% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 104 of 140 rounds, at a mean tick of 1497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 43% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 35% | 48 |
| wompi.Quokka 1.6 | 10 | 10% | 15 |
| maribo.FollowFire 1 | 4 | 4% | 3 |
| kurios.DOSexe .9b | 3 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 5 |
| sample.VelociRobot 1.0 | 2 | 2% | 4 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 75.6 | 25 / 140 | 3.19 | 14.1% | 14430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.1% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.8% | 38 |
| hadur117.nano.SanaroMP 0.4 | 3.0 | 14.1% | 25 |
| ntc.Opposite 1.5 | 4.3 | 11.8% | 3 |
| js.PinBall 1.6 | 5.3 | 11.1% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.5 | 10.6% | 3 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.8% | 4 |
| sample.Fire 1.0 | 8.0 | 4.6% | 1 |
| PSW.Relentless 0.1 | 9.0 | 4.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 72.4 | 7 / 35 | 3648 |
| 2 | 3 | 63.2 | 77.8 | 7 / 35 | 3741 |
| 3 | 3 | 61.0 | 74.9 | 5 / 35 | 3229 |
| 4 | 3 | 62.5 | 77.5 | 6 / 35 | 3812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 26% |
| sp.Nanos.Ember 1.1 | 6 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| ntc.Opposite 1.5 | 3 | 67% |
| js.PinBall 1.6 | 2 | 100% |

Hadur died in 116 of 140 rounds, at a mean tick of 1397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 34% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 29% | 42 |
| ntc.Opposite 1.5 | 14 | 12% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 9% | 13 |
| js.PinBall 1.6 | 10 | 9% | 11 |
| sp.Nanos.Ember 1.1 | 5 | 4% | 9 |
| sample.Fire 1.0 | 2 | 2% | 2 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 69.4 | 16 / 140 | 3.75 | 12.8% | 11294 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.7% | 32 |
| d414.nano.Quantum 1.0.0 | 2.3 | 13.6% | 36 |
| radnor.DoctorBob 1.42 | 3.0 | 13.1% | 21 |
| hadur117.nano.SanaroMP 0.4 | 3.3 | 12.8% | 16 |
| kawigi.nano.Lib 1.0 | 4.3 | 12.8% | 18 |
| myl.nano.Graviton 1.10 | 6.0 | 11.2% | 13 |
| ratosh.Wesco 1.4 | 7.8 | 7.8% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.1% | 2 |
| stelo.MirrorNano 1.3 | 8.3 | 7.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 69.2 | 1 / 35 | 2957 |
| 2 | 3 | 60.8 | 72.7 | 8 / 35 | 2629 |
| 3 | 5 | 57.7 | 64.4 | 2 / 35 | 2817 |
| 4 | 1 | 60.0 | 71.4 | 5 / 35 | 2891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 9% |
| d414.nano.Quantum 1.0.0 | 17 | 24% |
| myl.nano.Graviton 1.10 | 8 | 75% |
| radnor.DoctorBob 1.42 | 6 | 33% |
| kawigi.nano.Lib 1.0 | 6 | 33% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 125 of 140 rounds, at a mean tick of 1275. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 26% | 32 |
| d414.nano.Quantum 1.0.0 | 27 | 22% | 31 |
| kawigi.nano.Lib 1.0 | 20 | 16% | 23 |
| radnor.DoctorBob 1.42 | 19 | 15% | 22 |
| myl.nano.Graviton 1.10 | 13 | 10% | 18 |
| stelo.MirrorNano 1.3 | 8 | 6% | 8 |
| squidM.TentalceMeleeNano 1.1 | 3 | 2% | 3 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |

## Melee bench: F07

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 66.6 | 23 / 140 | 4.01 | 12.4% | 11603 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.3% | 28 |
| d414.nano.Quantum 1.0.0 | 2.5 | 14.7% | 43 |
| hadur117.nano.SanaroMP 0.4 | 3.3 | 12.4% | 23 |
| cb.nano.Insomnia 1.0 | 3.3 | 12.3% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 12.9% | 17 |
| mz.Cork 0.1 | 6.3 | 10.4% | 4 |
| oog.melee.CapuletDroid 1.1 | 6.8 | 10.2% | 7 |
| stelo.UntouchableNano 1.3 | 8.3 | 5.5% | 0 |
| stuff.Vlad 0.1 | 8.8 | 4.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 64.8 | 2 / 35 | 2725 |
| 2 | 1 | 59.4 | 69.8 | 9 / 35 | 2800 |
| 3 | 3 | 59.4 | 67.9 | 7 / 35 | 3175 |
| 4 | 5 | 57.0 | 63.8 | 5 / 35 | 2903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 12 | 17% |
| nz.jdc.nano.GridFu 1.0 | 10 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 20% |
| oog.melee.CapuletDroid 1.1 | 8 | 50% |
| cb.nano.Insomnia 1.0 | 8 | 63% |
| mz.Cork 0.1 | 5 | 100% |

Hadur died in 117 of 140 rounds, at a mean tick of 1203. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 26% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 21% | 33 |
| cb.nano.Insomnia 1.0 | 21 | 18% | 18 |
| oog.melee.CapuletDroid 1.1 | 16 | 14% | 22 |
| nz.jdc.nano.GridFu 1.0 | 12 | 10% | 15 |
| mz.Cork 0.1 | 6 | 5% | 10 |
| stelo.UntouchableNano 1.3 | 5 | 4% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 77.6 | 32 / 140 | 3.01 | 14.4% | 12322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.0% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.3% | 27 |
| hadur117.nano.SanaroMP 0.4 | 2.8 | 14.4% | 32 |
| gh.nano.Grofvuil 0.2 | 3.8 | 12.7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.7% | 9 |
| baal.nano.N 1.42 | 6.8 | 9.3% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.0 | 5.9% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 5.1% | 6 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 77.5 | 8 / 35 | 2901 |
| 2 | 3 | 63.0 | 78.4 | 7 / 35 | 3212 |
| 3 | 2 | 62.9 | 77.1 | 10 / 35 | 3256 |
| 4 | 3 | 61.8 | 77.5 | 7 / 35 | 2953 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 26% |
| d414.nano.Quantum 1.0.0 | 26 | 15% |
| gh.nano.Grofvuil 0.2 | 11 | 73% |
| djdjdj.NanoSkunk10 1.0 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| donjezza.Muncho 1.0 | 3 | 33% |
| baal.nano.N 1.42 | 1 | 0% |

Hadur died in 108 of 140 rounds, at a mean tick of 1305. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 36% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 30% | 41 |
| gh.nano.Grofvuil 0.2 | 13 | 12% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 8% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5 | 5% | 10 |
| donjezza.Muncho 1.0 | 5 | 5% | 7 |
| baal.nano.N 1.42 | 3 | 3% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 2 |

## Melee bench: F09

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 60.7 | 26 / 140 | 4.54 | 11.6% | 9972 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 1.8 | 12.9% | 32 |
| mld.DustBunny 3.8 | 3.5 | 11.9% | 16 |
| wee.Gem 1.8.4 | 3.5 | 12.0% | 27 |
| d414.nano.Quantum 1.0.0 | 3.8 | 12.1% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 11.1% | 9 |
| hadur117.nano.SanaroMP 0.4 | 4.8 | 11.6% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 6.5 | 9.5% | 9 |
| tj.zombie1n 1.0.1 | 8.5 | 6.9% | 4 |
| cs.sheldor.Talon 1.1 | 8.8 | 6.4% | 0 |
| step.nanoPri 1.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.3 | 60.0 | 7 / 35 | 2178 |
| 2 | 4 | 56.6 | 63.8 | 8 / 35 | 2458 |
| 3 | 5 | 54.9 | 60.6 | 7 / 35 | 2558 |
| 4 | 5 | 54.2 | 58.4 | 4 / 35 | 2778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wee.Gem 1.8.4 | 11 | 73% |
| d414.nano.Quantum 1.0.0 | 11 | 36% |
| stelo.SoRobotNanoMelee 1.2 | 8 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 71% |
| mld.DustBunny 3.8 | 7 | 29% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 40% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 114 of 140 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 20% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 15% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 14% | 21 |
| wee.Gem 1.8.4 | 15 | 13% | 23 |
| mld.DustBunny 3.8 | 15 | 13% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 11% | 15 |
| tj.zombie1n 1.0.1 | 5 | 4% | 5 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 5 |
| step.nanoPri 1.0 | 5 | 4% | 5 |

## Melee bench: F10

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 76.4 | 36 / 140 | 3.12 | 14.2% | 12665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.4% | 47 |
| mld.Infinity 2.2 | 2.3 | 15.2% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.4% | 20 |
| hadur117.nano.SanaroMP 0.4 | 3.5 | 14.2% | 36 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 8.0% | 0 |
| conscience.Electron 1.3g | 6.3 | 7.5% | 0 |
| ayk.WallHugger 1.0 | 6.8 | 7.3% | 0 |
| exauge.GateKeeper 1.1.121g | 7.5 | 7.1% | 1 |
| donjezza.Jezza 1.0 | 8.8 | 6.3% | 5 |
| sample.RamFire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 77.8 | 11 / 35 | 3041 |
| 2 | 3 | 62.5 | 79.4 | 10 / 35 | 3234 |
| 3 | 4 | 62.8 | 78.1 | 8 / 35 | 3300 |
| 4 | 4 | 59.4 | 70.5 | 7 / 35 | 3090 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 36 | 61% |
| d414.nano.Quantum 1.0.0 | 20 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 50% |
| donjezza.Jezza 1.0 | 4 | 50% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 104 of 140 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 41 | 39% | 58 |
| mld.Infinity 2.2 | 29 | 28% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 18% | 44 |
| robar.nano.Assertive_Melee 0.2 | 6 | 6% | 8 |
| ayk.WallHugger 1.0 | 5 | 5% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
| conscience.Electron 1.3g | 1 | 1% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 74.4 | 34 / 140 | 3.30 | 14.1% | 12212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.0% | 38 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 34 |
| hadur117.nano.SanaroMP 0.4 | 2.5 | 14.1% | 34 |
| oog.melee.Corsair 1.0 | 4.0 | 12.5% | 16 |
| mz.NanoGod 2.02 | 4.8 | 10.9% | 13 |
| DBall.NUKE 0.1 | 6.0 | 8.6% | 3 |
| awesomeness.Elite 1.0 | 7.5 | 7.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 7.2% | 0 |
| sample.Walls 1.0 | 8.5 | 6.1% | 1 |
| stelo.PianistNano 1.2 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.3 | 73.0 | 8 / 35 | 2923 |
| 2 | 4 | 60.2 | 71.4 | 8 / 35 | 3012 |
| 3 | 2 | 62.1 | 77.5 | 9 / 35 | 3044 |
| 4 | 1 | 61.6 | 75.9 | 9 / 35 | 3233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 21% |
| d414.nano.Quantum 1.0.0 | 19 | 21% |
| oog.melee.Corsair 1.0 | 15 | 93% |
| DBall.NUKE 0.1 | 8 | 75% |
| mz.NanoGod 2.02 | 5 | 60% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 107 of 140 rounds, at a mean tick of 1216. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 35% | 44 |
| d414.nano.Quantum 1.0.0 | 29 | 27% | 33 |
| mz.NanoGod 2.02 | 17 | 16% | 19 |
| oog.melee.Corsair 1.0 | 8 | 7% | 22 |
| zyx.nano.BacillusComma 1.0 | 8 | 7% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 6 |
| DBall.NUKE 0.1 | 2 | 2% | 7 |
| sample.Walls 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.7 | 69.3 | 20 / 140 | 3.76 | 12.7% | 10350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.2% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.2% | 30 |
| hadur117.nano.SanaroMP 0.4 | 3.3 | 12.7% | 20 |
| sul.Lunar 1.1 | 3.5 | 12.6% | 27 |
| myl.nano.KomoriNinja 1.1 | 4.5 | 11.3% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 8.3% | 1 |
| sam.Samspin 1.0 | 7.3 | 8.2% | 2 |
| spinnercat.Omen 1.0 | 7.8 | 8.1% | 6 |
| sample.SpinBot 1.0 | 8.3 | 7.1% | 6 |
| cvt.Firsty 1.0 | 10.0 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 74.3 | 5 / 35 | 2857 |
| 2 | 2 | 60.2 | 75.9 | 8 / 35 | 2456 |
| 3 | 5 | 56.8 | 65.7 | 5 / 35 | 2631 |
| 4 | 4 | 53.9 | 61.3 | 2 / 35 | 2406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 24 | 29% |
| d414.nano.Quantum 1.0.0 | 15 | 27% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 0% |
| spinnercat.Omen 1.0 | 6 | 83% |
| myl.nano.KomoriNinja 1.1 | 5 | 60% |
| sam.Samspin 1.0 | 3 | 33% |
| sample.SpinBot 1.0 | 2 | 0% |

Hadur died in 120 of 140 rounds, at a mean tick of 1125. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 26% | 31 |
| d414.nano.Quantum 1.0.0 | 28 | 23% | 32 |
| sul.Lunar 1.1 | 20 | 17% | 27 |
| sam.Samspin 1.0 | 10 | 8% | 11 |
| maribo.melee.BMV 0.1 | 10 | 8% | 10 |
| myl.nano.KomoriNinja 1.1 | 9 | 8% | 14 |
| spinnercat.Omen 1.0 | 5 | 4% | 8 |
| sample.SpinBot 1.0 | 5 | 4% | 5 |
| cvt.Firsty 1.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.nano.SanaroMP 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 69.7 | 23 / 140 | 3.73 | 12.4% | 9409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.5 | 14.6% | 41 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.9% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.1% | 28 |
| hadur117.nano.SanaroMP 0.4 | 3.5 | 12.4% | 23 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 5 |
| zyx.nano.Ant 1.1 | 6.8 | 8.6% | 3 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.2% | 1 |
| amz.NanoClone 1.41 | 8.0 | 7.9% | 4 |
| tvv.nano.Polaris 1.2 | 8.3 | 7.9% | 4 |
| arthord.MannyPacquiao Beta | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 63.5 | 4 / 35 | 2293 |
| 2 | 4 | 58.2 | 67.9 | 10 / 35 | 2343 |
| 3 | 4 | 56.1 | 67.9 | 2 / 35 | 2215 |
| 4 | 2 | 60.8 | 79.4 | 7 / 35 | 2558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 21% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 20% |
| d414.nano.Quantum 1.0.0 | 10 | 30% |
| mld.Wisdom 1.0 | 4 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| amz.NanoClone 1.41 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 118 of 140 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 30% | 42 |
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 20% | 26 |
| d414.nano.Quantum 1.0.0 | 21 | 18% | 24 |
| mld.Wisdom 1.0 | 13 | 11% | 17 |
| zyx.nano.Ant 1.1 | 11 | 9% | 12 |
| arthord.NanoSatanMelee Beta | 6 | 5% | 9 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 5 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

