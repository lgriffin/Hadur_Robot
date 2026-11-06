# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 68.0 | 11 / 140 | 3.88 | 11.9% | 8881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.5% | 60 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.8% | 32 |
| bzdp.Pansy 2.1 | 3.0 | 12.9% | 21 |
| hadur117.nano.SanaroTE 0.4 | 3.8 | 11.9% | 11 |
| arthord.NanoSatanMelee Beta | 5.8 | 9.3% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 9.3% | 10 |
| fm.claire 1.7 | 7.0 | 8.3% | 1 |
| zyx.nano.Ant 1.1 | 7.3 | 8.0% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.3% | 3 |
| arthord.MannyPacquiao Beta | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 67.3 | 2 / 35 | 2200 |
| 2 | 4 | 55.8 | 64.8 | 2 / 35 | 2219 |
| 3 | 3 | 58.4 | 72.7 | 6 / 35 | 2107 |
| 4 | 4 | 56.5 | 67.3 | 1 / 35 | 2355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 0% |
| d414.nano.Quantum 1.0.0 | 16 | 6% |
| bzdp.Pansy 2.1 | 7 | 43% |
| arthord.NanoSatanMelee Beta | 4 | 75% |
| tvv.nano.Polaris 1.2 | 4 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 129 of 140 rounds, at a mean tick of 1155. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 31% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 20% | 28 |
| bzdp.Pansy 2.1 | 19 | 15% | 23 |
| fm.claire 1.7 | 14 | 11% | 15 |
| zyx.nano.Ant 1.1 | 11 | 9% | 12 |
| arthord.NanoSatanMelee Beta | 9 | 7% | 11 |
| tvv.nano.Polaris 1.2 | 9 | 7% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |

## Melee bench: F02

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 71.0 | 14 / 140 | 3.61 | 12.6% | 9007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.9% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 14 |
| hadur117.nano.SanaroTE 0.4 | 3.3 | 12.6% | 14 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 12.4% | 13 |
| stelo.SoJNanoMelee 1.1 | 5.5 | 10.8% | 31 |
| DBall.Anarchy 0.1 | 5.8 | 11.1% | 26 |
| fm.mammillarias 1.3 | 6.5 | 9.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.3% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.7% | 6 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 67.0 | 2 / 35 | 2560 |
| 2 | 4 | 58.6 | 73.7 | 4 / 35 | 1998 |
| 3 | 3 | 59.0 | 71.4 | 5 / 35 | 2242 |
| 4 | 3 | 58.6 | 72.1 | 3 / 35 | 2207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 7% |
| stelo.SoJNanoMelee 1.1 | 13 | 15% |
| d414.nano.Quantum 1.0.0 | 9 | 0% |
| simonton.nano.MeleeSeed 1.8 | 7 | 86% |
| DBall.Anarchy 0.1 | 7 | 43% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.MyFirstRobot 1.0 | 1 | 0% |

Hadur died in 127 of 140 rounds, at a mean tick of 1130. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 24% | 32 |
| stelo.SoJNanoMelee 1.1 | 25 | 20% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 20% | 25 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 20 |
| DBall.Anarchy 0.1 | 13 | 10% | 16 |
| fm.mammillarias 1.3 | 11 | 9% | 12 |
| sample.MyFirstRobot 1.0 | 6 | 5% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 1% | 1 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 68.4 | 11 / 140 | 3.84 | 12.2% | 10633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.0% | 29 |
| ahf.NanoAndrew .4 | 3.5 | 12.3% | 26 |
| hadur117.nano.SanaroTE 0.4 | 4.0 | 12.2% | 11 |
| ratosh.Nobo 0.21 | 4.3 | 11.6% | 5 |
| timmit.nano.TimDog 0.33 | 6.0 | 8.9% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 7.8% | 9 |
| repositorio.NanoStep 1.0 | 8.0 | 6.9% | 3 |
| sample.Crazy 1.0 | 8.8 | 5.9% | 1 |
| kurios.DOSexe .9a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.1 | 65.4 | 1 / 35 | 2421 |
| 2 | 5 | 55.1 | 62.5 | 3 / 35 | 2431 |
| 3 | 4 | 56.3 | 66.7 | 1 / 35 | 2794 |
| 4 | 2 | 61.1 | 79.0 | 6 / 35 | 2987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 0% |
| ahf.NanoAndrew .4 | 8 | 25% |
| stelo.PatternRobot 1.0 | 7 | 43% |
| ratosh.Nobo 0.21 | 4 | 50% |
| sample.Crazy 1.0 | 2 | 50% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 129 of 140 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 28% | 36 |
| ahf.NanoAndrew .4 | 32 | 25% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 19% | 27 |
| ratosh.Nobo 0.21 | 17 | 13% | 17 |
| stelo.PatternRobot 1.0 | 10 | 8% | 14 |
| repositorio.NanoStep 1.0 | 3 | 2% | 5 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 75.0 | 14 / 140 | 3.25 | 13.8% | 15031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.9% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.2% | 42 |
| wompi.Quokka 1.6 | 3.3 | 14.5% | 13 |
| hadur117.nano.SanaroTE 0.4 | 3.8 | 13.8% | 14 |
| maribo.FollowFire 1 | 6.3 | 6.8% | 0 |
| kurios.DOSexe .9b | 6.5 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 6.8 | 6.8% | 3 |
| sample.VelociRobot 1.0 | 7.8 | 5.9% | 0 |
| jangs.ns51 1.0 | 7.8 | 5.8% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.8 | 76.2 | 6 / 35 | 3980 |
| 2 | 4 | 60.7 | 74.3 | 1 / 35 | 3591 |
| 3 | 4 | 60.3 | 70.2 | 4 / 35 | 3532 |
| 4 | 3 | 63.1 | 79.4 | 3 / 35 | 3928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 7% |
| d414.nano.Quantum 1.0.0 | 25 | 8% |
| wompi.Quokka 1.6 | 11 | 55% |
| kurios.DOSexe .9b | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 1470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 51 | 40% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 29% | 39 |
| wompi.Quokka 1.6 | 26 | 21% | 31 |
| sample.MyFirstJuniorRobot 1.0 | 3 | 2% | 4 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| kurios.DOSexe .9b | 2 | 2% | 5 |
| sample.VelociRobot 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 73.7 | 16 / 140 | 3.36 | 13.2% | 12651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.8% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.5% | 21 |
| hadur117.nano.SanaroTE 0.4 | 3.3 | 13.2% | 16 |
| ntc.Opposite 1.5 | 4.5 | 12.4% | 6 |
| js.PinBall 1.6 | 4.5 | 11.6% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 11.0% | 7 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.1% | 4 |
| sample.Fire 1.0 | 8.3 | 4.2% | 1 |
| PSW.Relentless 0.1 | 8.8 | 3.9% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 72.7 | 3 / 35 | 3194 |
| 2 | 4 | 59.6 | 71.1 | 2 / 35 | 3164 |
| 3 | 3 | 62.6 | 79.7 | 6 / 35 | 3138 |
| 4 | 3 | 60.4 | 71.4 | 5 / 35 | 3155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 6% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 8% |
| js.PinBall 1.6 | 12 | 67% |
| ntc.Opposite 1.5 | 3 | 33% |
| sp.Nanos.Ember 1.1 | 3 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |

Hadur died in 124 of 140 rounds, at a mean tick of 1053. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 55 | 44% | 58 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 18% | 25 |
| ntc.Opposite 1.5 | 18 | 15% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 16 | 13% | 18 |
| js.PinBall 1.6 | 12 | 10% | 17 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 3 |

## Melee bench: F06

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 74.1 | 13 / 140 | 3.33 | 12.7% | 8750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 15.0% | 39 |
| kawigi.nano.Lib 1.0 | 2.3 | 13.7% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.8% | 23 |
| hadur117.nano.SanaroTE 0.4 | 3.8 | 12.7% | 13 |
| radnor.DoctorBob 1.42 | 3.8 | 12.8% | 20 |
| myl.nano.Graviton 1.10 | 6.0 | 9.9% | 12 |
| stelo.MirrorNano 1.3 | 7.8 | 7.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.6% | 0 |
| ratosh.Wesco 1.4 | 8.5 | 6.9% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 77.5 | 4 / 35 | 2169 |
| 2 | 4 | 60.9 | 78.1 | 3 / 35 | 2345 |
| 3 | 4 | 58.4 | 71.4 | 3 / 35 | 1999 |
| 4 | 5 | 58.0 | 69.5 | 3 / 35 | 2237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 11% |
| d414.nano.Quantum 1.0.0 | 15 | 0% |
| radnor.DoctorBob 1.42 | 13 | 38% |
| kawigi.nano.Lib 1.0 | 11 | 18% |
| myl.nano.Graviton 1.10 | 5 | 40% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 127 of 140 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 24% | 31 |
| radnor.DoctorBob 1.42 | 29 | 23% | 34 |
| kawigi.nano.Lib 1.0 | 26 | 20% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 19% | 26 |
| myl.nano.Graviton 1.10 | 11 | 9% | 12 |
| squidM.TentalceMeleeNano 1.1 | 3 | 2% | 3 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 68.6 | 23 / 140 | 3.83 | 12.4% | 10448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.0% | 38 |
| nz.jdc.nano.GridFu 1.0 | 2.0 | 13.5% | 21 |
| d414.nano.Quantum 1.0.0 | 3.0 | 13.4% | 29 |
| hadur117.nano.SanaroTE 0.4 | 3.8 | 12.4% | 23 |
| cb.nano.Insomnia 1.0 | 4.3 | 12.0% | 13 |
| mz.Cork 0.1 | 6.5 | 10.5% | 6 |
| oog.melee.CapuletDroid 1.1 | 6.5 | 10.5% | 7 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.4% | 2 |
| stuff.Vlad 0.1 | 8.5 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 66.0 | 5 / 35 | 2673 |
| 2 | 2 | 60.4 | 74.3 | 10 / 35 | 2602 |
| 3 | 5 | 56.1 | 64.1 | 4 / 35 | 2499 |
| 4 | 4 | 58.2 | 69.8 | 4 / 35 | 2674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 7% |
| nz.jdc.nano.GridFu 1.0 | 14 | 50% |
| cb.nano.Insomnia 1.0 | 9 | 67% |
| oog.melee.CapuletDroid 1.1 | 7 | 86% |
| d414.nano.Quantum 1.0.0 | 5 | 0% |
| mz.Cork 0.1 | 4 | 50% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 117 of 140 rounds, at a mean tick of 1263. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 32% | 41 |
| d414.nano.Quantum 1.0.0 | 20 | 17% | 22 |
| nz.jdc.nano.GridFu 1.0 | 17 | 15% | 28 |
| cb.nano.Insomnia 1.0 | 17 | 15% | 15 |
| oog.melee.CapuletDroid 1.1 | 12 | 10% | 18 |
| mz.Cork 0.1 | 11 | 9% | 13 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 75.5 | 15 / 140 | 3.21 | 13.2% | 10799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.3 | 15.7% | 41 |
| d414.nano.Quantum 1.0.0 | 1.8 | 15.3% | 48 |
| hadur117.nano.SanaroTE 0.4 | 3.0 | 13.2% | 15 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.8% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 11.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 10.2% | 15 |
| baal.nano.N 1.42 | 7.0 | 9.5% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.7% | 0 |
| donjezza.Muncho 1.0 | 8.8 | 4.9% | 2 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.9 | 77.8 | 2 / 35 | 2715 |
| 2 | 3 | 59.9 | 74.3 | 5 / 35 | 2600 |
| 3 | 3 | 61.5 | 76.8 | 5 / 35 | 2843 |
| 4 | 3 | 59.5 | 73.0 | 3 / 35 | 2641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 4% |
| d414.nano.Quantum 1.0.0 | 26 | 0% |
| djdjdj.NanoSkunk10 1.0 | 11 | 64% |
| gh.nano.Grofvuil 0.2 | 8 | 38% |
| donjezza.Muncho 1.0 | 3 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 50% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 1512. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 33% | 43 |
| d414.nano.Quantum 1.0.0 | 36 | 29% | 37 |
| gh.nano.Grofvuil 0.2 | 18 | 14% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 10% | 12 |
| djdjdj.NanoSkunk10 1.0 | 10 | 8% | 16 |
| baal.nano.N 1.42 | 4 | 3% | 5 |
| donjezza.Muncho 1.0 | 3 | 2% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.3 | 65.4 | 18 / 140 | 4.11 | 11.7% | 8366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 13.9% | 32 |
| stelo.SoRobotNanoMelee 1.2 | 2.5 | 12.6% | 36 |
| hadur117.nano.SanaroTE 0.4 | 4.3 | 11.7% | 18 |
| mld.DustBunny 3.8 | 4.3 | 11.4% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 11.3% | 13 |
| wee.Gem 1.8.4 | 5.3 | 11.0% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 9.7% | 10 |
| tj.zombie1n 1.0.1 | 8.3 | 6.9% | 2 |
| cs.sheldor.Talon 1.1 | 9.0 | 6.3% | 0 |
| step.nanoPri 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 74.3 | 9 / 35 | 2306 |
| 2 | 5 | 53.8 | 63.2 | 3 / 35 | 1894 |
| 3 | 4 | 54.6 | 63.2 | 2 / 35 | 2253 |
| 4 | 5 | 53.4 | 61.0 | 4 / 35 | 1913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 15 | 27% |
| d414.nano.Quantum 1.0.0 | 9 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 13% |
| wee.Gem 1.8.4 | 6 | 100% |
| mld.DustBunny 3.8 | 5 | 0% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 50% |
| tj.zombie1n 1.0.1 | 3 | 100% |

Hadur died in 122 of 140 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 32 | 26% | 33 |
| d414.nano.Quantum 1.0.0 | 24 | 20% | 27 |
| mld.DustBunny 3.8 | 19 | 16% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% | 21 |
| wee.Gem 1.8.4 | 11 | 9% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 7% | 10 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 78.0 | 28 / 140 | 2.98 | 14.1% | 12045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.9% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.9% | 31 |
| mld.Infinity 2.2 | 3.3 | 14.1% | 25 |
| hadur117.nano.SanaroTE 0.4 | 3.5 | 14.1% | 28 |
| conscience.Electron 1.3g | 5.8 | 7.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 6.8 | 7.5% | 0 |
| ayk.WallHugger 1.0 | 6.8 | 7.3% | 3 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.1% | 0 |
| donjezza.Jezza 1.0 | 8.8 | 6.4% | 2 |
| sample.RamFire 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 77.8 | 6 / 35 | 3109 |
| 2 | 3 | 62.6 | 79.4 | 9 / 35 | 3152 |
| 3 | 4 | 60.5 | 75.6 | 5 / 35 | 2839 |
| 4 | 4 | 61.9 | 79.4 | 8 / 35 | 2945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 27 | 81% |
| d414.nano.Quantum 1.0.0 | 26 | 4% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 0% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| ayk.WallHugger 1.0 | 2 | 50% |
| donjezza.Jezza 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 112 of 140 rounds, at a mean tick of 1460. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 47 | 42% | 55 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 29% | 46 |
| mld.Infinity 2.2 | 12 | 11% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7 | 6% | 8 |
| conscience.Electron 1.3g | 6 | 5% | 8 |
| ayk.WallHugger 1.0 | 6 | 5% | 6 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 74.5 | 34 / 140 | 3.29 | 13.8% | 10906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.9% | 37 |
| hadur117.nano.SanaroTE 0.4 | 2.3 | 13.8% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.8% | 37 |
| oog.melee.Corsair 1.0 | 4.3 | 12.6% | 13 |
| mz.NanoGod 2.02 | 4.5 | 11.7% | 12 |
| DBall.NUKE 0.1 | 6.5 | 8.3% | 1 |
| awesomeness.Elite 1.0 | 7.0 | 7.6% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.5 | 7.1% | 0 |
| sample.Walls 1.0 | 9.0 | 6.2% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.6 | 74.3 | 9 / 35 | 2754 |
| 2 | 2 | 60.8 | 75.2 | 9 / 35 | 2687 |
| 3 | 2 | 62.0 | 80.3 | 8 / 35 | 2873 |
| 4 | 3 | 57.9 | 68.3 | 8 / 35 | 2592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 17% |
| d414.nano.Quantum 1.0.0 | 19 | 16% |
| oog.melee.Corsair 1.0 | 13 | 69% |
| mz.NanoGod 2.02 | 9 | 56% |
| DBall.NUKE 0.1 | 8 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 106 of 140 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 28% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 25% | 30 |
| mz.NanoGod 2.02 | 17 | 16% | 20 |
| oog.melee.Corsair 1.0 | 9 | 8% | 17 |
| zyx.nano.BacillusComma 1.0 | 8 | 8% | 8 |
| awesomeness.Elite 1.0 | 6 | 6% | 9 |
| DBall.NUKE 0.1 | 4 | 4% | 12 |
| sample.Walls 1.0 | 4 | 4% | 5 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 68.7 | 22 / 140 | 3.81 | 12.3% | 8489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.4% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.3% | 26 |
| hadur117.nano.SanaroTE 0.4 | 3.5 | 12.3% | 22 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 11.8% | 14 |
| sul.Lunar 1.1 | 5.3 | 10.8% | 12 |
| sample.SpinBot 1.0 | 6.5 | 8.4% | 7 |
| spinnercat.Omen 1.0 | 7.0 | 8.2% | 8 |
| maribo.melee.BMV 0.1 | 7.3 | 8.1% | 0 |
| sam.Samspin 1.0 | 8.8 | 7.1% | 4 |
| cvt.Firsty 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.0 | 67.6 | 6 / 35 | 1897 |
| 2 | 4 | 57.2 | 69.5 | 6 / 35 | 2101 |
| 3 | 3 | 57.8 | 69.5 | 5 / 35 | 2305 |
| 4 | 4 | 56.6 | 68.3 | 5 / 35 | 2186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 17% |
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| sul.Lunar 1.1 | 9 | 33% |
| sample.SpinBot 1.0 | 9 | 100% |
| myl.nano.KomoriNinja 1.1 | 7 | 43% |
| sam.Samspin 1.0 | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 118 of 140 rounds, at a mean tick of 1126. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 31% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 23% | 31 |
| myl.nano.KomoriNinja 1.1 | 12 | 10% | 17 |
| sul.Lunar 1.1 | 11 | 9% | 15 |
| sample.SpinBot 1.0 | 11 | 9% | 15 |
| sam.Samspin 1.0 | 8 | 7% | 9 |
| maribo.melee.BMV 0.1 | 8 | 7% | 8 |
| spinnercat.Omen 1.0 | 4 | 3% | 5 |
| cvt.Firsty 1.0 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.nano.SanaroTE 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 66.0 | 5 / 140 | 4.06 | 11.1% | 7780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.3 | 15.8% | 51 |
| d414.nano.Quantum 1.0.0 | 2.3 | 14.5% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.8% | 25 |
| hadur117.nano.SanaroTE 0.4 | 4.3 | 11.1% | 5 |
| mld.Wisdom 1.0 | 4.8 | 10.0% | 6 |
| amz.NanoClone 1.41 | 7.3 | 7.8% | 2 |
| zyx.nano.Ant 1.1 | 7.3 | 8.0% | 4 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.1% | 5 |
| arthord.NanoSatanMelee Beta | 8.3 | 7.9% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 73.3 | 1 / 35 | 2034 |
| 2 | 5 | 51.9 | 59.4 | 0 / 35 | 1849 |
| 3 | 4 | 54.2 | 64.4 | 1 / 35 | 1914 |
| 4 | 4 | 55.7 | 66.7 | 3 / 35 | 1983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 0% |
| d414.nano.Quantum 1.0.0 | 12 | 8% |
| tvv.nano.Polaris 1.2 | 4 | 25% |
| zyx.nano.Ant 1.1 | 2 | 0% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 136 of 140 rounds, at a mean tick of 1104. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 24% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 24% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 15% | 23 |
| mld.Wisdom 1.0 | 15 | 11% | 15 |
| zyx.nano.Ant 1.1 | 11 | 8% | 11 |
| amz.NanoClone 1.41 | 10 | 7% | 10 |
| arthord.NanoSatanMelee Beta | 8 | 6% | 8 |
| tvv.nano.Polaris 1.2 | 6 | 4% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

