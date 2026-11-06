# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 70.6 | 17 / 140 | 3.65 | 12.9% | 10719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.6% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.3% | 40 |
| hadur117.nano.SanaroTE2 0.4 | 3.0 | 12.9% | 17 |
| bzdp.Pansy 2.1 | 4.0 | 12.1% | 11 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.9% | 13 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.3% | 5 |
| fm.claire 1.7 | 7.3 | 8.6% | 0 |
| zyx.nano.Ant 1.1 | 7.5 | 8.4% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.1% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 75.2 | 4 / 35 | 2546 |
| 2 | 3 | 58.9 | 69.8 | 4 / 35 | 2680 |
| 3 | 3 | 58.1 | 69.2 | 4 / 35 | 2681 |
| 4 | 3 | 58.2 | 67.9 | 5 / 35 | 2812 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 8% |
| d414.nano.Quantum 1.0.0 | 23 | 9% |
| bzdp.Pansy 2.1 | 9 | 56% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| arthord.NanoSatanMelee Beta | 4 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 123 of 140 rounds, at a mean tick of 1290. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 32% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 25% | 34 |
| bzdp.Pansy 2.1 | 14 | 11% | 19 |
| tvv.nano.Polaris 1.2 | 11 | 9% | 13 |
| arthord.NanoSatanMelee Beta | 9 | 7% | 11 |
| zyx.nano.Ant 1.1 | 8 | 7% | 8 |
| fm.claire 1.7 | 7 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 4 battles (4.3 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 73.5 | 13 / 140 | 3.39 | 12.8% | 8419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 15.0% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.3% | 32 |
| hadur117.nano.SanaroTE2 0.4 | 3.0 | 12.8% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.2% | 11 |
| DBall.Anarchy 0.1 | 5.0 | 11.2% | 19 |
| fm.mammillarias 1.3 | 6.3 | 9.9% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.9% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 75.9 | 4 / 35 | 2095 |
| 2 | 3 | 59.3 | 75.6 | 2 / 35 | 1806 |
| 3 | 3 | 59.5 | 76.2 | 4 / 35 | 2033 |
| 4 | 4 | 58.1 | 66.3 | 3 / 35 | 2485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 4% |
| d414.nano.Quantum 1.0.0 | 15 | 7% |
| stelo.SoJNanoMelee 1.1 | 8 | 38% |
| simonton.nano.MeleeSeed 1.8 | 6 | 67% |
| DBall.Anarchy 0.1 | 6 | 50% |
| sample.MyFirstRobot 1.0 | 5 | 20% |

Hadur died in 127 of 140 rounds, at a mean tick of 1523. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 29% | 42 |
| d414.nano.Quantum 1.0.0 | 36 | 28% | 37 |
| stelo.SoJNanoMelee 1.1 | 16 | 13% | 17 |
| fm.mammillarias 1.3 | 14 | 11% | 14 |
| DBall.Anarchy 0.1 | 9 | 7% | 13 |
| simonton.nano.MeleeSeed 1.8 | 8 | 6% | 8 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 2% | 3 |

## Melee bench: F03

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 73.0 | 16 / 140 | 3.43 | 13.3% | 12273 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.8% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.4% | 21 |
| hadur117.nano.SanaroTE2 0.4 | 2.8 | 13.3% | 16 |
| ahf.NanoAndrew .4 | 4.3 | 11.9% | 15 |
| ratosh.Nobo 0.21 | 4.5 | 11.4% | 6 |
| timmit.nano.TimDog 0.33 | 6.0 | 8.6% | 6 |
| stelo.PatternRobot 1.0 | 7.0 | 7.1% | 9 |
| sample.Crazy 1.0 | 8.8 | 5.8% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 5.9% | 1 |
| kurios.DOSexe .9a | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 75.2 | 4 / 35 | 3043 |
| 2 | 4 | 57.7 | 67.3 | 5 / 35 | 2875 |
| 3 | 3 | 60.6 | 72.7 | 3 / 35 | 3360 |
| 4 | 2 | 60.7 | 76.8 | 4 / 35 | 2995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 7% |
| ahf.NanoAndrew .4 | 10 | 70% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| ratosh.Nobo 0.21 | 3 | 33% |
| sample.Crazy 1.0 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 124 of 140 rounds, at a mean tick of 1049. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 53 | 43% | 57 |
| ahf.NanoAndrew .4 | 21 | 17% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 15% | 18 |
| ratosh.Nobo 0.21 | 11 | 9% | 12 |
| stelo.PatternRobot 1.0 | 9 | 7% | 11 |
| timmit.nano.TimDog 0.33 | 7 | 6% | 8 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 2 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.6 | 19 / 140 | 2.93 | 14.8% | 16744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.8% | 64 |
| hadur117.nano.SanaroTE2 0.4 | 2.5 | 14.8% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 15.6% | 34 |
| wompi.Quokka 1.6 | 4.0 | 13.4% | 13 |
| kurios.DOSexe .9b | 5.8 | 7.5% | 2 |
| maribo.FollowFire 1 | 6.5 | 6.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.8 | 6.8% | 4 |
| jangs.ns51 1.0 | 7.5 | 6.3% | 4 |
| sample.VelociRobot 1.0 | 8.5 | 5.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 75.2 | 4 / 35 | 4003 |
| 2 | 3 | 62.6 | 74.6 | 4 / 35 | 4357 |
| 3 | 2 | 64.9 | 84.4 | 7 / 35 | 4323 |
| 4 | 3 | 63.3 | 80.0 | 4 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 9% |
| d414.nano.Quantum 1.0.0 | 31 | 13% |
| wompi.Quokka 1.6 | 10 | 60% |
| kurios.DOSexe .9b | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 0% |
| jangs.ns51 1.0 | 3 | 67% |

Hadur died in 121 of 140 rounds, at a mean tick of 1648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 53 | 44% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 28% | 37 |
| wompi.Quokka 1.6 | 19 | 16% | 25 |
| sample.MyFirstJuniorRobot 1.0 | 5 | 4% | 5 |
| kurios.DOSexe .9b | 3 | 2% | 7 |
| sample.VelociRobot 1.0 | 3 | 2% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 4 |
| maribo.FollowFire 1 | 2 | 2% | 2 |

## Melee bench: F05

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.7 | 19 / 140 | 3.10 | 14.1% | 14609 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.5% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.1% | 35 |
| hadur117.nano.SanaroTE2 0.4 | 2.8 | 14.1% | 19 |
| js.PinBall 1.6 | 4.5 | 11.0% | 6 |
| ntc.Opposite 1.5 | 5.3 | 11.0% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 10.6% | 3 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.4% | 6 |
| sample.Fire 1.0 | 8.3 | 4.9% | 2 |
| PSW.Relentless 0.1 | 8.8 | 4.1% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 78.1 | 6 / 35 | 3397 |
| 2 | 3 | 61.6 | 74.6 | 1 / 35 | 3871 |
| 3 | 3 | 59.5 | 70.8 | 3 / 35 | 3258 |
| 4 | 2 | 64.8 | 83.2 | 9 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 7% |
| d414.nano.Quantum 1.0.0 | 25 | 16% |
| ntc.Opposite 1.5 | 6 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| sp.Nanos.Ember 1.1 | 3 | 67% |
| js.PinBall 1.6 | 3 | 100% |

Hadur died in 121 of 140 rounds, at a mean tick of 1403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 43% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 27% | 36 |
| ntc.Opposite 1.5 | 12 | 10% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 8% | 13 |
| js.PinBall 1.6 | 8 | 7% | 13 |
| sp.Nanos.Ember 1.1 | 4 | 3% | 7 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 70.5 | 22 / 140 | 3.66 | 12.7% | 9990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 14.3% | 33 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.9% | 31 |
| hadur117.nano.SanaroTE2 0.4 | 3.5 | 12.7% | 22 |
| radnor.DoctorBob 1.42 | 4.0 | 12.4% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 18 |
| myl.nano.Graviton 1.10 | 5.0 | 11.1% | 13 |
| stelo.MirrorNano 1.3 | 7.5 | 7.9% | 0 |
| ratosh.Wesco 1.4 | 8.3 | 7.0% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.1% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.4 | 79.4 | 8 / 35 | 2282 |
| 2 | 5 | 56.3 | 62.5 | 1 / 35 | 2847 |
| 3 | 5 | 58.9 | 68.9 | 5 / 35 | 2437 |
| 4 | 3 | 59.7 | 71.1 | 8 / 35 | 2424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 26% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 14% |
| radnor.DoctorBob 1.42 | 12 | 58% |
| myl.nano.Graviton 1.10 | 9 | 67% |
| kawigi.nano.Lib 1.0 | 8 | 0% |
| squidM.TentalceMeleeNano 1.1 | 2 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 118 of 140 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 22% | 32 |
| kawigi.nano.Lib 1.0 | 25 | 21% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 18% | 24 |
| radnor.DoctorBob 1.42 | 17 | 14% | 23 |
| myl.nano.Graviton 1.10 | 14 | 12% | 19 |
| squidM.TentalceMeleeNano 1.1 | 7 | 6% | 8 |
| ratosh.Wesco 1.4 | 6 | 5% | 6 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |

## Melee bench: F07

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 67.4 | 24 / 140 | 3.94 | 12.4% | 10784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.9% | 33 |
| nz.jdc.nano.GridFu 1.0 | 2.3 | 13.5% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.2% | 26 |
| hadur117.nano.SanaroTE2 0.4 | 3.8 | 12.4% | 24 |
| cb.nano.Insomnia 1.0 | 5.3 | 11.4% | 15 |
| oog.melee.CapuletDroid 1.1 | 5.5 | 11.4% | 14 |
| mz.Cork 0.1 | 7.0 | 10.0% | 2 |
| stuff.Vlad 0.1 | 8.5 | 4.9% | 0 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.1% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 63.5 | 5 / 35 | 2587 |
| 2 | 3 | 59.4 | 70.2 | 7 / 35 | 2741 |
| 3 | 4 | 58.2 | 67.3 | 7 / 35 | 2756 |
| 4 | 4 | 58.5 | 68.6 | 5 / 35 | 2700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 13 | 62% |
| nz.jdc.nano.GridFu 1.0 | 11 | 55% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 0% |
| d414.nano.Quantum 1.0.0 | 10 | 30% |
| oog.melee.CapuletDroid 1.1 | 7 | 100% |

Hadur died in 116 of 140 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 32% | 43 |
| nz.jdc.nano.GridFu 1.0 | 24 | 21% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 20% | 30 |
| cb.nano.Insomnia 1.0 | 15 | 13% | 12 |
| oog.melee.CapuletDroid 1.1 | 9 | 8% | 17 |
| mz.Cork 0.1 | 3 | 3% | 4 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 2 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 73.5 | 18 / 140 | 3.39 | 13.1% | 11087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 16.3% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.7% | 33 |
| gh.nano.Grofvuil 0.2 | 3.0 | 13.2% | 20 |
| hadur117.nano.SanaroTE2 0.4 | 3.5 | 13.1% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 10.6% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 10.0% | 12 |
| baal.nano.N 1.42 | 6.5 | 9.5% | 5 |
| donjezza.Muncho 1.0 | 8.5 | 5.7% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.3% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 69.5 | 4 / 35 | 2662 |
| 2 | 3 | 62.1 | 78.1 | 6 / 35 | 2972 |
| 3 | 3 | 60.8 | 76.5 | 3 / 35 | 2837 |
| 4 | 4 | 59.1 | 69.8 | 5 / 35 | 2616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 7% |
| d414.nano.Quantum 1.0.0 | 27 | 11% |
| gh.nano.Grofvuil 0.2 | 9 | 44% |
| djdjdj.NanoSkunk10 1.0 | 7 | 71% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 122 of 140 rounds, at a mean tick of 1346. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 43 | 35% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 29% | 36 |
| gh.nano.Grofvuil 0.2 | 22 | 18% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 10 | 8% | 12 |
| djdjdj.NanoSkunk10 1.0 | 7 | 6% | 10 |
| baal.nano.N 1.42 | 4 | 3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 64.9 | 20 / 140 | 4.16 | 12.1% | 10111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 12.5% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 2.8 | 12.5% | 29 |
| hadur117.nano.SanaroTE2 0.4 | 3.5 | 12.1% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 11.7% | 20 |
| mld.DustBunny 3.8 | 4.5 | 11.1% | 14 |
| wee.Gem 1.8.4 | 5.5 | 11.1% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 10.4% | 12 |
| tj.zombie1n 1.0.1 | 8.5 | 6.7% | 5 |
| cs.sheldor.Talon 1.1 | 8.5 | 6.6% | 0 |
| step.nanoPri 1.0 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.9 | 65.7 | 5 / 35 | 2607 |
| 2 | 4 | 54.7 | 62.2 | 5 / 35 | 2333 |
| 3 | 1 | 59.2 | 72.1 | 6 / 35 | 2720 |
| 4 | 6 | 54.4 | 59.7 | 4 / 35 | 2451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 0% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 50% |
| wee.Gem 1.8.4 | 8 | 75% |
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| mld.DustBunny 3.8 | 7 | 29% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 100% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 121 of 140 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 21% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 20% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 17% | 22 |
| mld.DustBunny 3.8 | 17 | 14% | 19 |
| wee.Gem 1.8.4 | 10 | 8% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 8% | 16 |
| cs.sheldor.Talon 1.1 | 8 | 7% | 8 |
| tj.zombie1n 1.0.1 | 6 | 5% | 7 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 80.0 | 26 / 140 | 2.80 | 14.7% | 13501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.8% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.7% | 35 |
| hadur117.nano.SanaroTE2 0.4 | 2.8 | 14.7% | 26 |
| mld.Infinity 2.2 | 3.5 | 13.6% | 29 |
| robar.nano.Assertive_Melee 0.2 | 5.5 | 8.2% | 2 |
| ayk.WallHugger 1.0 | 6.5 | 7.7% | 0 |
| conscience.Electron 1.3g | 7.0 | 7.4% | 0 |
| exauge.GateKeeper 1.1.121g | 7.3 | 7.1% | 0 |
| donjezza.Jezza 1.0 | 8.8 | 5.8% | 4 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 84.1 | 10 / 35 | 3393 |
| 2 | 3 | 62.5 | 77.8 | 7 / 35 | 3588 |
| 3 | 3 | 63.2 | 81.0 | 5 / 35 | 3614 |
| 4 | 3 | 60.3 | 77.1 | 4 / 35 | 2906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 30 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 15% |
| d414.nano.Quantum 1.0.0 | 22 | 0% |
| donjezza.Jezza 1.0 | 3 | 33% |
| robar.nano.Assertive_Melee 0.2 | 2 | 0% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 114 of 140 rounds, at a mean tick of 1608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 48 | 42% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 26% | 44 |
| robar.nano.Assertive_Melee 0.2 | 13 | 11% | 14 |
| mld.Infinity 2.2 | 13 | 11% | 8 |
| conscience.Electron 1.3g | 5 | 4% | 8 |
| exauge.GateKeeper 1.1.121g | 3 | 3% | 3 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |

## Melee bench: F11

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 73.2 | 30 / 140 | 3.41 | 13.5% | 11108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.6% | 50 |
| hadur117.nano.SanaroTE2 0.4 | 2.8 | 13.5% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 27 |
| oog.melee.Corsair 1.0 | 3.3 | 13.2% | 19 |
| mz.NanoGod 2.02 | 5.0 | 11.2% | 10 |
| awesomeness.Elite 1.0 | 6.8 | 7.5% | 1 |
| DBall.NUKE 0.1 | 7.0 | 7.2% | 0 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.5% | 1 |
| sample.Walls 1.0 | 9.0 | 6.2% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 71.1 | 3 / 35 | 2814 |
| 2 | 3 | 57.7 | 66.7 | 7 / 35 | 2592 |
| 3 | 2 | 62.4 | 80.3 | 6 / 35 | 3014 |
| 4 | 3 | 61.2 | 74.6 | 14 / 35 | 2688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 5% |
| oog.melee.Corsair 1.0 | 18 | 67% |
| DBall.NUKE 0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| mz.NanoGod 2.02 | 2 | 50% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 110 of 140 rounds, at a mean tick of 1194. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 43 | 39% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 22% | 29 |
| oog.melee.Corsair 1.0 | 15 | 14% | 26 |
| mz.NanoGod 2.02 | 12 | 11% | 15 |
| zyx.nano.BacillusComma 1.0 | 9 | 8% | 9 |
| DBall.NUKE 0.1 | 3 | 3% | 10 |
| awesomeness.Elite 1.0 | 2 | 2% | 2 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 69.6 | 14 / 140 | 3.74 | 12.6% | 10165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.6% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.0% | 32 |
| hadur117.nano.SanaroTE2 0.4 | 3.3 | 12.6% | 14 |
| sul.Lunar 1.1 | 3.5 | 12.3% | 30 |
| myl.nano.KomoriNinja 1.1 | 4.8 | 10.6% | 10 |
| maribo.melee.BMV 0.1 | 7.3 | 8.3% | 1 |
| spinnercat.Omen 1.0 | 7.5 | 7.8% | 3 |
| sample.SpinBot 1.0 | 7.5 | 8.2% | 5 |
| sam.Samspin 1.0 | 7.8 | 7.7% | 4 |
| cvt.Firsty 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 77.5 | 3 / 35 | 2694 |
| 2 | 3 | 57.9 | 71.1 | 2 / 35 | 2445 |
| 3 | 4 | 55.4 | 62.2 | 6 / 35 | 2374 |
| 4 | 3 | 57.4 | 67.6 | 3 / 35 | 2652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 5% |
| d414.nano.Quantum 1.0.0 | 15 | 0% |
| sul.Lunar 1.1 | 13 | 8% |
| myl.nano.KomoriNinja 1.1 | 5 | 80% |
| sam.Samspin 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 1249. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 29% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 25% | 34 |
| sul.Lunar 1.1 | 20 | 16% | 21 |
| sample.SpinBot 1.0 | 14 | 11% | 16 |
| myl.nano.KomoriNinja 1.1 | 10 | 8% | 14 |
| sam.Samspin 1.0 | 6 | 5% | 9 |
| spinnercat.Omen 1.0 | 5 | 4% | 5 |
| cvt.Firsty 1.0 | 2 | 2% | 2 |
| maribo.melee.BMV 0.1 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.nano.SanaroTE2 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 71.4 | 15 / 140 | 3.57 | 12.3% | 8755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 52 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.0 | 14.2% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 21 |
| hadur117.nano.SanaroTE2 0.4 | 3.8 | 12.3% | 15 |
| mld.Wisdom 1.0 | 5.0 | 9.7% | 3 |
| tvv.nano.Polaris 1.2 | 6.5 | 8.7% | 7 |
| amz.NanoClone 1.41 | 7.0 | 8.4% | 3 |
| arthord.NanoSatanMelee Beta | 7.8 | 8.1% | 1 |
| zyx.nano.Ant 1.1 | 8.8 | 7.1% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 71.1 | 4 / 35 | 1984 |
| 2 | 4 | 57.1 | 70.5 | 3 / 35 | 2295 |
| 3 | 4 | 57.5 | 70.8 | 4 / 35 | 2363 |
| 4 | 3 | 57.9 | 73.3 | 4 / 35 | 2113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 10% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 5% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 22% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 2 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |

Hadur died in 125 of 140 rounds, at a mean tick of 1145. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 30% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 27 | 22% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 19% | 26 |
| arthord.NanoSatanMelee Beta | 11 | 9% | 11 |
| amz.NanoClone 1.41 | 9 | 7% | 11 |
| mld.Wisdom 1.0 | 8 | 6% | 11 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 7 |
| zyx.nano.Ant 1.1 | 3 | 2% | 5 |

