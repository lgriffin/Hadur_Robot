# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 70.0 | 14 / 140 | 3.70 | 12.9% | 11288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.1% | 33 |
| hadur117.nano.SanaroMV 0.4 | 3.3 | 12.9% | 14 |
| bzdp.Pansy 2.1 | 3.5 | 12.5% | 18 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.9% | 10 |
| zyx.nano.Ant 1.1 | 6.5 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 8.6% | 4 |
| fm.claire 1.7 | 7.8 | 7.8% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.8% | 6 |
| arthord.MannyPacquiao Beta | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 68.9 | 2 / 35 | 2886 |
| 2 | 2 | 60.2 | 75.6 | 7 / 35 | 2467 |
| 3 | 4 | 57.5 | 66.7 | 2 / 35 | 2950 |
| 4 | 4 | 59.2 | 68.9 | 3 / 35 | 2985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 11% |
| d414.nano.Quantum 1.0.0 | 19 | 0% |
| bzdp.Pansy 2.1 | 10 | 40% |
| tvv.nano.Polaris 1.2 | 9 | 22% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| fm.claire 1.7 | 2 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 1147. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 29% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 25% | 35 |
| bzdp.Pansy 2.1 | 18 | 14% | 22 |
| tvv.nano.Polaris 1.2 | 12 | 10% | 12 |
| arthord.NanoSatanMelee Beta | 8 | 6% | 11 |
| zyx.nano.Ant 1.1 | 8 | 6% | 8 |
| fm.claire 1.7 | 6 | 5% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 7 |

## Melee bench: F02

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 68.6 | 16 / 140 | 3.83 | 12.3% | 9042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.4% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 13.4% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 12.5% | 13 |
| hadur117.nano.SanaroMV 0.4 | 4.0 | 12.3% | 16 |
| DBall.Anarchy 0.1 | 5.0 | 11.0% | 21 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 10.8% | 25 |
| fm.mammillarias 1.3 | 7.0 | 9.5% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.7% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.6% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.1 | 66.7 | 3 / 35 | 2441 |
| 2 | 4 | 56.0 | 64.1 | 4 / 35 | 2079 |
| 3 | 3 | 59.1 | 73.3 | 5 / 35 | 2164 |
| 4 | 4 | 59.2 | 70.2 | 4 / 35 | 2358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 7% |
| DBall.Anarchy 0.1 | 13 | 46% |
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| stelo.SoJNanoMelee 1.1 | 10 | 20% |
| simonton.nano.MeleeSeed 1.8 | 7 | 71% |
| sample.MyFirstRobot 1.0 | 4 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 124 of 140 rounds, at a mean tick of 1155. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 26% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 22% | 29 |
| stelo.SoJNanoMelee 1.1 | 17 | 14% | 17 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 21 |
| DBall.Anarchy 0.1 | 10 | 8% | 16 |
| fm.mammillarias 1.3 | 9 | 7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 7% | 8 |
| sample.MyFirstRobot 1.0 | 5 | 4% | 5 |

## Melee bench: F03

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 73.2 | 17 / 140 | 3.41 | 13.3% | 11885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.6% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.6% | 27 |
| hadur117.nano.SanaroMV 0.4 | 3.0 | 13.3% | 17 |
| ahf.NanoAndrew .4 | 3.3 | 12.2% | 19 |
| ratosh.Nobo 0.21 | 5.0 | 10.8% | 6 |
| timmit.nano.TimDog 0.33 | 6.3 | 9.1% | 7 |
| stelo.PatternRobot 1.0 | 7.3 | 7.6% | 7 |
| sample.Crazy 1.0 | 8.0 | 6.0% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 6.0% | 2 |
| kurios.DOSexe .9a | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 70.8 | 3 / 35 | 2855 |
| 2 | 2 | 59.1 | 70.8 | 2 / 35 | 3173 |
| 3 | 3 | 61.5 | 78.7 | 7 / 35 | 3001 |
| 4 | 3 | 59.3 | 72.4 | 5 / 35 | 2856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 18% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 10% |
| ahf.NanoAndrew .4 | 9 | 33% |
| stelo.PatternRobot 1.0 | 3 | 33% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 124 of 140 rounds, at a mean tick of 1122. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 42 | 34% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 24% | 32 |
| ahf.NanoAndrew .4 | 24 | 19% | 27 |
| timmit.nano.TimDog 0.33 | 12 | 10% | 15 |
| stelo.PatternRobot 1.0 | 8 | 6% | 9 |
| ratosh.Nobo 0.21 | 6 | 5% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.0 | 21 / 140 | 3.16 | 14.3% | 15833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.2% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.5% | 44 |
| hadur117.nano.SanaroMV 0.4 | 3.5 | 14.3% | 21 |
| wompi.Quokka 1.6 | 3.5 | 14.6% | 12 |
| maribo.FollowFire 1 | 5.8 | 7.1% | 0 |
| kurios.DOSexe .9b | 6.3 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.5 | 6.5% | 3 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 5.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 77.1 | 3 / 35 | 3997 |
| 2 | 3 | 64.3 | 78.7 | 11 / 35 | 4140 |
| 3 | 4 | 60.8 | 73.3 | 2 / 35 | 3692 |
| 4 | 4 | 62.7 | 74.9 | 5 / 35 | 4004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 12% |
| d414.nano.Quantum 1.0.0 | 24 | 8% |
| wompi.Quokka 1.6 | 17 | 88% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 119 of 140 rounds, at a mean tick of 1541. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 47 | 39% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 34% | 46 |
| wompi.Quokka 1.6 | 18 | 15% | 21 |
| maribo.FollowFire 1 | 6 | 5% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 3% | 4 |
| jangs.ns51 1.0 | 3 | 3% | 3 |
| kurios.DOSexe .9b | 2 | 2% | 3 |

## Melee bench: F05

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 71.2 | 19 / 140 | 3.59 | 13.2% | 13892 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.5% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.4% | 33 |
| hadur117.nano.SanaroMV 0.4 | 2.8 | 13.2% | 19 |
| ntc.Opposite 1.5 | 4.3 | 12.1% | 5 |
| js.PinBall 1.6 | 5.0 | 11.8% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 10.8% | 6 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.4% | 5 |
| sample.Fire 1.0 | 8.0 | 4.7% | 1 |
| PSW.Relentless 0.1 | 9.0 | 3.9% | 0 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 67.0 | 3 / 35 | 3481 |
| 2 | 3 | 59.4 | 68.6 | 5 / 35 | 3221 |
| 3 | 3 | 59.6 | 67.6 | 4 / 35 | 3442 |
| 4 | 2 | 63.8 | 81.6 | 7 / 35 | 3748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 9% |
| d414.nano.Quantum 1.0.0 | 21 | 5% |
| sp.Nanos.Ember 1.1 | 8 | 88% |
| js.PinBall 1.6 | 5 | 80% |
| ntc.Opposite 1.5 | 3 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |

Hadur died in 121 of 140 rounds, at a mean tick of 1284. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 50 | 41% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 22% | 31 |
| js.PinBall 1.6 | 13 | 11% | 18 |
| ntc.Opposite 1.5 | 13 | 11% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 12 | 10% | 13 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 10 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 67.6 | 13 / 140 | 3.91 | 12.1% | 10109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.3 | 14.7% | 35 |
| d414.nano.Quantum 1.0.0 | 2.8 | 13.9% | 32 |
| radnor.DoctorBob 1.42 | 3.0 | 12.8% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.5% | 16 |
| hadur117.nano.SanaroMV 0.4 | 4.5 | 12.1% | 13 |
| myl.nano.Graviton 1.10 | 6.0 | 11.0% | 11 |
| stelo.MirrorNano 1.3 | 8.0 | 7.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.3% | 5 |
| ratosh.Wesco 1.4 | 8.0 | 7.4% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 67.6 | 1 / 35 | 2507 |
| 2 | 3 | 60.2 | 74.3 | 5 / 35 | 2460 |
| 3 | 5 | 57.2 | 64.4 | 2 / 35 | 2691 |
| 4 | 5 | 57.5 | 64.1 | 5 / 35 | 2451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 15% |
| kawigi.nano.Lib 1.0 | 13 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 18% |
| radnor.DoctorBob 1.42 | 10 | 40% |
| myl.nano.Graviton 1.10 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 127 of 140 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 32 | 25% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 20% | 27 |
| radnor.DoctorBob 1.42 | 24 | 19% | 29 |
| d414.nano.Quantum 1.0.0 | 22 | 17% | 23 |
| myl.nano.Graviton 1.10 | 14 | 11% | 16 |
| ratosh.Wesco 1.4 | 5 | 4% | 8 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.4 | 22 / 140 | 3.94 | 12.3% | 10757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.4% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.3% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 13.5% | 19 |
| hadur117.nano.SanaroMV 0.4 | 4.3 | 12.3% | 22 |
| cb.nano.Insomnia 1.0 | 4.5 | 12.4% | 25 |
| mz.Cork 0.1 | 6.0 | 10.6% | 4 |
| oog.melee.CapuletDroid 1.1 | 6.8 | 10.3% | 11 |
| stelo.UntouchableNano 1.3 | 8.3 | 4.7% | 1 |
| stuff.Vlad 0.1 | 8.8 | 4.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 66.7 | 5 / 35 | 2646 |
| 2 | 5 | 57.8 | 65.7 | 5 / 35 | 2527 |
| 3 | 3 | 59.9 | 72.7 | 7 / 35 | 2613 |
| 4 | 4 | 57.8 | 64.4 | 5 / 35 | 2971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 14 | 64% |
| d414.nano.Quantum 1.0.0 | 12 | 0% |
| cb.nano.Insomnia 1.0 | 10 | 60% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 14% |
| mz.Cork 0.1 | 3 | 100% |
| oog.melee.CapuletDroid 1.1 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 118 of 140 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 28% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 19% | 28 |
| nz.jdc.nano.GridFu 1.0 | 20 | 17% | 33 |
| cb.nano.Insomnia 1.0 | 18 | 15% | 13 |
| oog.melee.CapuletDroid 1.1 | 11 | 9% | 13 |
| mz.Cork 0.1 | 10 | 8% | 14 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 71.2 | 14 / 140 | 3.59 | 12.7% | 11065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.1% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.4% | 35 |
| hadur117.nano.SanaroMV 0.4 | 3.5 | 12.7% | 14 |
| gh.nano.Grofvuil 0.2 | 3.8 | 12.7% | 18 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 10.7% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 11.0% | 4 |
| baal.nano.N 1.42 | 6.8 | 9.3% | 2 |
| donjezza.Muncho 1.0 | 8.5 | 5.2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 71.7 | 2 / 35 | 2852 |
| 2 | 3 | 58.5 | 68.9 | 5 / 35 | 2694 |
| 3 | 4 | 60.5 | 75.9 | 5 / 35 | 2520 |
| 4 | 3 | 59.4 | 68.3 | 2 / 35 | 2999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 19% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 12% |
| gh.nano.Grofvuil 0.2 | 7 | 29% |
| djdjdj.NanoSkunk10 1.0 | 3 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 1258. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 41 | 33% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 31% | 42 |
| gh.nano.Grofvuil 0.2 | 16 | 13% | 19 |
| djdjdj.NanoSkunk10 1.0 | 15 | 12% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 6% | 9 |
| baal.nano.N 1.42 | 4 | 3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 2 |
| donjezza.Muncho 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.9 | 59.9 | 17 / 140 | 4.61 | 11.1% | 8837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 12.8% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 2.5 | 12.6% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 12.5% | 21 |
| mld.DustBunny 3.8 | 3.8 | 11.7% | 17 |
| wee.Gem 1.8.4 | 4.8 | 10.7% | 14 |
| hadur117.nano.SanaroMV 0.4 | 5.3 | 11.1% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 7.0 | 9.8% | 12 |
| cs.sheldor.Talon 1.1 | 8.3 | 6.8% | 1 |
| tj.zombie1n 1.0.1 | 9.0 | 6.3% | 5 |
| step.nanoPri 1.0 | 9.8 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.9 | 60.6 | 3 / 35 | 2356 |
| 2 | 4 | 55.5 | 65.1 | 4 / 35 | 2161 |
| 3 | 6 | 53.5 | 58.1 | 4 / 35 | 2292 |
| 4 | 6 | 52.5 | 55.9 | 6 / 35 | 2028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 12 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 18% |
| d414.nano.Quantum 1.0.0 | 7 | 14% |
| wee.Gem 1.8.4 | 6 | 67% |
| mld.DustBunny 3.8 | 4 | 25% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 50% |
| tj.zombie1n 1.0.1 | 3 | 100% |

Hadur died in 123 of 140 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 27 | 22% | 27 |
| d414.nano.Quantum 1.0.0 | 24 | 20% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 17% | 25 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 12% | 17 |
| mld.DustBunny 3.8 | 14 | 11% | 17 |
| wee.Gem 1.8.4 | 13 | 11% | 18 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 5 |
| step.nanoPri 1.0 | 2 | 2% | 2 |
| tj.zombie1n 1.0.1 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 4 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 79.6 | 26 / 140 | 2.84 | 14.7% | 13753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 40 |
| mld.Infinity 2.2 | 2.8 | 14.6% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.3% | 24 |
| hadur117.nano.SanaroMV 0.4 | 3.3 | 14.7% | 26 |
| robar.nano.Assertive_Melee 0.2 | 5.5 | 8.5% | 3 |
| conscience.Electron 1.3g | 6.5 | 7.5% | 0 |
| ayk.WallHugger 1.0 | 6.8 | 7.4% | 2 |
| exauge.GateKeeper 1.1.121g | 7.3 | 7.0% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 6.3% | 3 |
| sample.RamFire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.6 | 78.4 | 2 / 35 | 3463 |
| 2 | 3 | 62.4 | 78.4 | 10 / 35 | 3185 |
| 3 | 4 | 60.9 | 76.2 | 7 / 35 | 3127 |
| 4 | 2 | 65.2 | 85.4 | 7 / 35 | 3978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 36 | 44% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 13% |
| d414.nano.Quantum 1.0.0 | 23 | 4% |
| donjezza.Jezza 1.0 | 5 | 80% |
| robar.nano.Assertive_Melee 0.2 | 1 | 0% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 114 of 140 rounds, at a mean tick of 1890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 33% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 29% | 55 |
| mld.Infinity 2.2 | 24 | 21% | 6 |
| robar.nano.Assertive_Melee 0.2 | 8 | 7% | 9 |
| conscience.Electron 1.3g | 6 | 5% | 7 |
| donjezza.Jezza 1.0 | 3 | 3% | 8 |
| ayk.WallHugger 1.0 | 2 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 72.4 | 29 / 140 | 3.49 | 13.5% | 11495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.5% | 50 |
| hadur117.nano.SanaroMV 0.4 | 2.3 | 13.5% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.5% | 28 |
| oog.melee.Corsair 1.0 | 4.0 | 12.0% | 10 |
| mz.NanoGod 2.02 | 4.5 | 11.6% | 13 |
| DBall.NUKE 0.1 | 6.3 | 7.8% | 6 |
| awesomeness.Elite 1.0 | 7.0 | 7.6% | 0 |
| sample.Walls 1.0 | 8.0 | 6.6% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.7% | 1 |
| stelo.PianistNano 1.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 75.2 | 8 / 35 | 2807 |
| 2 | 2 | 61.7 | 75.9 | 9 / 35 | 3002 |
| 3 | 2 | 59.1 | 69.8 | 7 / 35 | 2773 |
| 4 | 3 | 58.3 | 68.6 | 5 / 35 | 2913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 32% |
| oog.melee.Corsair 1.0 | 9 | 67% |
| mz.NanoGod 2.02 | 8 | 50% |
| DBall.NUKE 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 111 of 140 rounds, at a mean tick of 1083. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 42 | 38% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 21% | 30 |
| mz.NanoGod 2.02 | 18 | 16% | 22 |
| oog.melee.Corsair 1.0 | 14 | 13% | 20 |
| stelo.PianistNano 1.2 | 6 | 5% | 6 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 4 |
| DBall.NUKE 0.1 | 2 | 2% | 7 |
| awesomeness.Elite 1.0 | 2 | 2% | 2 |
| sample.Walls 1.0 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 66.0 | 19 / 140 | 4.06 | 12.0% | 9509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.3% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.1% | 24 |
| myl.nano.KomoriNinja 1.1 | 3.3 | 11.9% | 12 |
| sul.Lunar 1.1 | 4.0 | 11.6% | 22 |
| hadur117.nano.SanaroMV 0.4 | 4.3 | 12.0% | 19 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 1 |
| sample.SpinBot 1.0 | 7.5 | 7.5% | 5 |
| spinnercat.Omen 1.0 | 7.8 | 7.9% | 4 |
| sam.Samspin 1.0 | 7.8 | 8.1% | 6 |
| cvt.Firsty 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 67.9 | 9 / 35 | 2470 |
| 2 | 4 | 56.1 | 62.2 | 6 / 35 | 2539 |
| 3 | 5 | 55.0 | 65.1 | 1 / 35 | 2206 |
| 4 | 5 | 56.9 | 68.6 | 3 / 35 | 2294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 31% |
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| sul.Lunar 1.1 | 9 | 22% |
| myl.nano.KomoriNinja 1.1 | 6 | 83% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 2 | 50% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 122 of 140 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 37% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 19% | 27 |
| myl.nano.KomoriNinja 1.1 | 16 | 13% | 21 |
| sul.Lunar 1.1 | 13 | 11% | 15 |
| sam.Samspin 1.0 | 10 | 8% | 11 |
| sample.SpinBot 1.0 | 7 | 6% | 7 |
| spinnercat.Omen 1.0 | 3 | 2% | 5 |
| maribo.melee.BMV 0.1 | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 2 | 2% | 3 |

## Melee bench: F13

hadur117.nano.SanaroMV 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 4 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.8 | 66.7 | 9 / 140 | 4.00 | 11.6% | 9183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.3 | 14.9% | 48 |
| d414.nano.Quantum 1.0.0 | 1.8 | 14.7% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 17 |
| hadur117.nano.SanaroMV 0.4 | 4.0 | 11.6% | 9 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 7 |
| amz.NanoClone 1.41 | 6.5 | 8.7% | 3 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.3% | 8 |
| zyx.nano.Ant 1.1 | 7.8 | 7.4% | 1 |
| arthord.NanoSatanMelee Beta | 8.5 | 7.5% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 70.5 | 2 / 35 | 2304 |
| 2 | 4 | 55.6 | 67.3 | 1 / 35 | 2326 |
| 3 | 4 | 54.1 | 62.9 | 2 / 35 | 2120 |
| 4 | 4 | 56.3 | 66.0 | 4 / 35 | 2433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 7% |
| d414.nano.Quantum 1.0.0 | 15 | 7% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 0% |
| tvv.nano.Polaris 1.2 | 4 | 25% |
| mld.Wisdom 1.0 | 3 | 67% |
| amz.NanoClone 1.41 | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 131 of 140 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 26% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 24% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 20% | 29 |
| mld.Wisdom 1.0 | 16 | 12% | 17 |
| amz.NanoClone 1.41 | 7 | 5% | 7 |
| zyx.nano.Ant 1.1 | 6 | 5% | 7 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 6 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

