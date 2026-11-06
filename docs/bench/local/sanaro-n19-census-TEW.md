# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 67.2 | 14 / 140 | 3.95 | 11.9% | 9155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.0% | 36 |
| bzdp.Pansy 2.1 | 2.5 | 13.6% | 19 |
| hadur117.nano.SanaroTEW 0.4 | 4.0 | 11.9% | 14 |
| zyx.nano.Ant 1.1 | 5.8 | 9.0% | 4 |
| arthord.NanoSatanMelee Beta | 6.5 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 6.8 | 8.5% | 5 |
| fm.claire 1.7 | 7.0 | 8.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.9% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.7 | 61.3 | 2 / 35 | 2555 |
| 2 | 4 | 56.2 | 67.0 | 2 / 35 | 2326 |
| 3 | 4 | 58.5 | 74.3 | 4 / 35 | 2208 |
| 4 | 4 | 56.7 | 66.3 | 6 / 35 | 2066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 4% |
| d414.nano.Quantum 1.0.0 | 16 | 6% |
| bzdp.Pansy 2.1 | 12 | 67% |
| zyx.nano.Ant 1.1 | 3 | 33% |
| fm.claire 1.7 | 3 | 67% |
| tvv.nano.Polaris 1.2 | 3 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 127 of 140 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 28% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 27% | 35 |
| bzdp.Pansy 2.1 | 22 | 17% | 31 |
| zyx.nano.Ant 1.1 | 11 | 9% | 11 |
| arthord.NanoSatanMelee Beta | 9 | 7% | 9 |
| fm.claire 1.7 | 7 | 6% | 8 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 3 |

## Melee bench: F02

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 65.2 | 13 / 140 | 4.13 | 11.5% | 7979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 40 |
| simonton.nano.MeleeSeed 1.8 | 2.5 | 13.3% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.1% | 17 |
| hadur117.nano.SanaroTEW 0.4 | 4.8 | 11.5% | 13 |
| DBall.Anarchy 0.1 | 5.0 | 11.1% | 20 |
| stelo.SoJNanoMelee 1.1 | 5.3 | 10.9% | 22 |
| fm.mammillarias 1.3 | 7.0 | 9.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.1% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 6.0% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 67.9 | 3 / 35 | 2148 |
| 2 | 4 | 57.1 | 65.7 | 5 / 35 | 2004 |
| 3 | 6 | 55.1 | 63.2 | 4 / 35 | 1709 |
| 4 | 5 | 55.3 | 64.1 | 1 / 35 | 2118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 12 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 0% |
| stelo.SoJNanoMelee 1.1 | 8 | 50% |
| DBall.Anarchy 0.1 | 8 | 50% |
| simonton.nano.MeleeSeed 1.8 | 6 | 67% |
| sample.MyFirstRobot 1.0 | 1 | 0% |

Hadur died in 127 of 140 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 27% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 22% | 29 |
| simonton.nano.MeleeSeed 1.8 | 21 | 17% | 26 |
| fm.mammillarias 1.3 | 16 | 13% | 16 |
| stelo.SoJNanoMelee 1.1 | 13 | 10% | 14 |
| DBall.Anarchy 0.1 | 7 | 6% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 4% | 5 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 2 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 72.8 | 14 / 140 | 3.45 | 13.0% | 11182 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.1% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.0% | 24 |
| hadur117.nano.SanaroTEW 0.4 | 3.3 | 13.0% | 14 |
| ahf.NanoAndrew .4 | 4.0 | 12.6% | 25 |
| ratosh.Nobo 0.21 | 4.5 | 11.8% | 7 |
| timmit.nano.TimDog 0.33 | 6.0 | 8.9% | 4 |
| stelo.PatternRobot 1.0 | 7.5 | 7.2% | 7 |
| repositorio.NanoStep 1.0 | 8.3 | 6.2% | 6 |
| sample.Crazy 1.0 | 8.3 | 6.0% | 3 |
| kurios.DOSexe .9a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.2 | 75.6 | 3 / 35 | 2350 |
| 2 | 3 | 58.6 | 71.4 | 2 / 35 | 2826 |
| 3 | 2 | 60.3 | 75.6 | 5 / 35 | 3099 |
| 4 | 5 | 58.0 | 68.6 | 4 / 35 | 2907 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 4% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 8% |
| ahf.NanoAndrew .4 | 7 | 29% |
| repositorio.NanoStep 1.0 | 6 | 50% |
| sample.Crazy 1.0 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| stelo.PatternRobot 1.0 | 3 | 33% |
| ratosh.Nobo 0.21 | 3 | 33% |

Hadur died in 126 of 140 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 39 | 31% | 41 |
| ahf.NanoAndrew .4 | 25 | 20% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 14% | 19 |
| ratosh.Nobo 0.21 | 15 | 12% | 17 |
| timmit.nano.TimDog 0.33 | 13 | 10% | 15 |
| stelo.PatternRobot 1.0 | 7 | 6% | 7 |
| repositorio.NanoStep 1.0 | 5 | 4% | 9 |
| sample.Crazy 1.0 | 2 | 2% | 3 |
| kurios.DOSexe .9a | 2 | 2% | 2 |

## Melee bench: F04

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 77.0 | 14 / 140 | 3.07 | 14.3% | 16090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.9% | 74 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.4% | 35 |
| hadur117.nano.SanaroTEW 0.4 | 3.3 | 14.3% | 14 |
| wompi.Quokka 1.6 | 3.8 | 13.9% | 10 |
| kurios.DOSexe .9b | 5.5 | 7.7% | 4 |
| maribo.FollowFire 1 | 6.3 | 6.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.8 | 6.4% | 1 |
| jangs.ns51 1.0 | 7.8 | 6.0% | 1 |
| sample.VelociRobot 1.0 | 8.8 | 5.5% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 82.2 | 3 / 35 | 3996 |
| 2 | 4 | 63.4 | 79.0 | 6 / 35 | 3885 |
| 3 | 3 | 62.8 | 75.9 | 3 / 35 | 4425 |
| 4 | 3 | 60.7 | 70.8 | 2 / 35 | 3784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 3% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 0% |
| wompi.Quokka 1.6 | 11 | 73% |
| kurios.DOSexe .9b | 5 | 40% |
| jangs.ns51 1.0 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 126 of 140 rounds, at a mean tick of 1562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 62 | 49% | 66 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 29% | 38 |
| wompi.Quokka 1.6 | 18 | 14% | 22 |
| kurios.DOSexe .9b | 3 | 2% | 6 |
| maribo.FollowFire 1 | 3 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 76.4 | 12 / 140 | 3.12 | 13.6% | 13559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.2% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.7% | 35 |
| hadur117.nano.SanaroTEW 0.4 | 3.3 | 13.6% | 12 |
| ntc.Opposite 1.5 | 4.0 | 12.7% | 13 |
| js.PinBall 1.6 | 4.8 | 11.9% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6.0 | 9.9% | 6 |
| sp.Nanos.Ember 1.1 | 7.3 | 6.9% | 2 |
| PSW.Relentless 0.1 | 8.3 | 4.5% | 0 |
| sample.Fire 1.0 | 8.5 | 4.4% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 77.1 | 4 / 35 | 3284 |
| 2 | 3 | 61.1 | 74.9 | 2 / 35 | 3718 |
| 3 | 4 | 61.0 | 76.2 | 4 / 35 | 3162 |
| 4 | 3 | 61.8 | 77.5 | 2 / 35 | 3395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 6% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 4% |
| js.PinBall 1.6 | 4 | 75% |
| ntc.Opposite 1.5 | 4 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| sp.Nanos.Ember 1.1 | 3 | 67% |

Hadur died in 129 of 140 rounds, at a mean tick of 1369. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 42% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 28% | 37 |
| ntc.Opposite 1.5 | 15 | 12% | 18 |
| js.PinBall 1.6 | 13 | 10% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 6% | 9 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 4 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 67.7 | 16 / 140 | 3.91 | 12.0% | 9204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 14.3% | 32 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 31 |
| radnor.DoctorBob 1.42 | 2.8 | 13.9% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.9% | 20 |
| hadur117.nano.SanaroTEW 0.4 | 4.5 | 12.0% | 16 |
| myl.nano.Graviton 1.10 | 6.0 | 11.0% | 12 |
| ratosh.Wesco 1.4 | 7.5 | 7.0% | 2 |
| stelo.MirrorNano 1.3 | 7.8 | 6.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 6.7% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.8 | 60.6 | 3 / 35 | 2426 |
| 2 | 5 | 57.8 | 67.9 | 4 / 35 | 2232 |
| 3 | 4 | 58.8 | 70.2 | 5 / 35 | 2161 |
| 4 | 4 | 59.3 | 72.1 | 4 / 35 | 2385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 22% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 0% |
| radnor.DoctorBob 1.42 | 11 | 45% |
| kawigi.nano.Lib 1.0 | 9 | 0% |
| myl.nano.Graviton 1.10 | 9 | 78% |

Hadur died in 125 of 140 rounds, at a mean tick of 1020. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 30 | 24% | 31 |
| radnor.DoctorBob 1.42 | 28 | 22% | 32 |
| d414.nano.Quantum 1.0.0 | 28 | 22% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 15% | 19 |
| myl.nano.Graviton 1.10 | 11 | 9% | 18 |
| ratosh.Wesco 1.4 | 6 | 5% | 6 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 74.1 | 26 / 140 | 3.33 | 13.2% | 10386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 14.1% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 32 |
| hadur117.nano.SanaroTEW 0.4 | 3.0 | 13.2% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.9% | 20 |
| cb.nano.Insomnia 1.0 | 4.8 | 12.1% | 15 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 11.0% | 7 |
| mz.Cork 0.1 | 6.8 | 10.1% | 5 |
| stelo.UntouchableNano 1.3 | 8.3 | 5.3% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 79.4 | 6 / 35 | 2807 |
| 2 | 4 | 59.4 | 73.7 | 7 / 35 | 2329 |
| 3 | 1 | 60.0 | 73.3 | 9 / 35 | 2668 |
| 4 | 5 | 58.2 | 70.2 | 4 / 35 | 2582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 6% |
| cb.nano.Insomnia 1.0 | 15 | 80% |
| d414.nano.Quantum 1.0.0 | 14 | 7% |
| nz.jdc.nano.GridFu 1.0 | 10 | 40% |
| oog.melee.CapuletDroid 1.1 | 6 | 67% |
| mz.Cork 0.1 | 6 | 67% |

Hadur died in 114 of 140 rounds, at a mean tick of 1385. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 31% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 28% | 38 |
| cb.nano.Insomnia 1.0 | 15 | 13% | 12 |
| nz.jdc.nano.GridFu 1.0 | 11 | 10% | 17 |
| oog.melee.CapuletDroid 1.1 | 9 | 8% | 17 |
| mz.Cork 0.1 | 9 | 8% | 13 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 2 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 76.8 | 19 / 140 | 3.09 | 13.7% | 11482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.4% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.5% | 31 |
| hadur117.nano.SanaroTEW 0.4 | 3.0 | 13.7% | 19 |
| gh.nano.Grofvuil 0.2 | 3.8 | 12.8% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 9.5% | 7 |
| baal.nano.N 1.42 | 6.5 | 9.7% | 1 |
| donjezza.Muncho 1.0 | 8.3 | 5.7% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 5.2% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 76.8 | 3 / 35 | 3140 |
| 2 | 4 | 58.9 | 71.7 | 4 / 35 | 2529 |
| 3 | 3 | 61.0 | 77.5 | 3 / 35 | 2711 |
| 4 | 2 | 63.6 | 81.3 | 9 / 35 | 3102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 3% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 9% |
| djdjdj.NanoSkunk10 1.0 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 9 | 44% |
| donjezza.Muncho 1.0 | 5 | 0% |
| baal.nano.N 1.42 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 122 of 140 rounds, at a mean tick of 1309. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 37% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 26% | 34 |
| gh.nano.Grofvuil 0.2 | 15 | 12% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 7% | 11 |
| donjezza.Muncho 1.0 | 7 | 6% | 9 |
| baal.nano.N 1.42 | 7 | 6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 6 | 5% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.6 | 63.1 | 15 / 140 | 4.32 | 11.4% | 8538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 13.6% | 32 |
| stelo.SoRobotNanoMelee 1.2 | 2.8 | 12.5% | 22 |
| mld.DustBunny 3.8 | 3.3 | 11.5% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.1% | 15 |
| hadur117.nano.SanaroTEW 0.4 | 4.8 | 11.4% | 15 |
| wee.Gem 1.8.4 | 4.8 | 11.0% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 6.8 | 9.5% | 11 |
| tj.zombie1n 1.0.1 | 8.5 | 7.2% | 7 |
| cs.sheldor.Talon 1.1 | 8.8 | 6.6% | 0 |
| step.nanoPri 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.9 | 60.0 | 5 / 35 | 2132 |
| 2 | 3 | 56.6 | 67.9 | 4 / 35 | 2292 |
| 3 | 6 | 54.7 | 63.8 | 4 / 35 | 2071 |
| 4 | 6 | 53.4 | 60.6 | 2 / 35 | 2043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 16 | 31% |
| wee.Gem 1.8.4 | 10 | 40% |
| d414.nano.Quantum 1.0.0 | 10 | 0% |
| mld.DustBunny 3.8 | 5 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 0% |
| tj.zombie1n 1.0.1 | 3 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 28 | 22% | 32 |
| d414.nano.Quantum 1.0.0 | 26 | 21% | 28 |
| wee.Gem 1.8.4 | 21 | 17% | 24 |
| mld.DustBunny 3.8 | 16 | 13% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 13% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 10% | 14 |
| tj.zombie1n 1.0.1 | 2 | 2% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 74.4 | 15 / 140 | 3.31 | 13.4% | 12288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.3% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.4% | 38 |
| mld.Infinity 2.2 | 2.5 | 15.2% | 39 |
| hadur117.nano.SanaroTEW 0.4 | 4.0 | 13.4% | 15 |
| ayk.WallHugger 1.0 | 5.8 | 8.0% | 2 |
| robar.nano.Assertive_Melee 0.2 | 6.5 | 7.6% | 0 |
| conscience.Electron 1.3g | 7.0 | 7.4% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 6.9% | 0 |
| donjezza.Jezza 1.0 | 8.8 | 6.0% | 3 |
| sample.RamFire 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 61.5 | 76.8 | 5 / 35 | 3148 |
| 2 | 4 | 60.3 | 75.9 | 2 / 35 | 3028 |
| 3 | 4 | 57.9 | 69.2 | 3 / 35 | 2724 |
| 4 | 4 | 61.5 | 75.6 | 5 / 35 | 3388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 0% |
| mld.Infinity 2.2 | 21 | 48% |
| d414.nano.Quantum 1.0.0 | 17 | 0% |
| ayk.WallHugger 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 1601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 32% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 31% | 51 |
| mld.Infinity 2.2 | 26 | 21% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 6% | 9 |
| conscience.Electron 1.3g | 5 | 4% | 6 |
| ayk.WallHugger 1.0 | 4 | 3% | 9 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 77.4 | 30 / 140 | 3.04 | 14.2% | 11092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.8 | 15.5% | 35 |
| hadur117.nano.SanaroTEW 0.4 | 2.5 | 14.2% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.5% | 36 |
| oog.melee.Corsair 1.0 | 3.0 | 13.4% | 23 |
| mz.NanoGod 2.02 | 5.0 | 10.9% | 9 |
| DBall.NUKE 0.1 | 6.3 | 8.3% | 5 |
| awesomeness.Elite 1.0 | 7.8 | 6.7% | 0 |
| sample.Walls 1.0 | 8.0 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 8.0 | 6.7% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 77.5 | 9 / 35 | 2931 |
| 2 | 2 | 61.4 | 77.8 | 10 / 35 | 2712 |
| 3 | 3 | 61.1 | 76.8 | 8 / 35 | 2768 |
| 4 | 3 | 60.7 | 77.5 | 3 / 35 | 2681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 6% |
| d414.nano.Quantum 1.0.0 | 17 | 18% |
| oog.melee.Corsair 1.0 | 16 | 69% |
| DBall.NUKE 0.1 | 9 | 78% |
| mz.NanoGod 2.02 | 6 | 33% |
| sample.Walls 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 110 of 140 rounds, at a mean tick of 1427. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 33% | 38 |
| d414.nano.Quantum 1.0.0 | 31 | 28% | 34 |
| oog.melee.Corsair 1.0 | 14 | 13% | 24 |
| mz.NanoGod 2.02 | 13 | 12% | 16 |
| sample.Walls 1.0 | 4 | 4% | 6 |
| awesomeness.Elite 1.0 | 4 | 4% | 4 |
| DBall.NUKE 0.1 | 3 | 3% | 12 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 4 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 72.4 | 21 / 140 | 3.49 | 12.9% | 9261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.1% | 38 |
| hadur117.nano.SanaroTEW 0.4 | 2.8 | 12.9% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.7% | 23 |
| sul.Lunar 1.1 | 3.5 | 11.8% | 21 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 11.0% | 11 |
| sam.Samspin 1.0 | 6.8 | 8.4% | 9 |
| sample.SpinBot 1.0 | 7.5 | 8.0% | 9 |
| spinnercat.Omen 1.0 | 7.5 | 7.8% | 5 |
| maribo.melee.BMV 0.1 | 8.3 | 7.5% | 1 |
| cvt.Firsty 1.0 | 10.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.3 | 68.3 | 7 / 35 | 2397 |
| 2 | 4 | 55.4 | 67.0 | 2 / 35 | 2211 |
| 3 | 2 | 60.7 | 80.3 | 7 / 35 | 2363 |
| 4 | 2 | 58.8 | 74.0 | 5 / 35 | 2290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 0% |
| sul.Lunar 1.1 | 13 | 38% |
| myl.nano.KomoriNinja 1.1 | 12 | 50% |
| sam.Samspin 1.0 | 5 | 40% |
| sample.SpinBot 1.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 119 of 140 rounds, at a mean tick of 1309. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 29% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 25% | 31 |
| sul.Lunar 1.1 | 15 | 13% | 22 |
| myl.nano.KomoriNinja 1.1 | 12 | 10% | 17 |
| sam.Samspin 1.0 | 9 | 8% | 10 |
| sample.SpinBot 1.0 | 5 | 4% | 8 |
| spinnercat.Omen 1.0 | 5 | 4% | 6 |
| maribo.melee.BMV 0.1 | 5 | 4% | 5 |
| cvt.Firsty 1.0 | 4 | 3% | 4 |

## Melee bench: F13

hadur117.nano.SanaroTEW 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 71.2 | 12 / 140 | 3.59 | 12.0% | 8333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.3% | 55 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.0 | 14.2% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 24 |
| hadur117.nano.SanaroTEW 0.4 | 4.0 | 12.0% | 12 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 6 |
| tvv.nano.Polaris 1.2 | 6.5 | 8.3% | 6 |
| amz.NanoClone 1.41 | 7.0 | 8.2% | 2 |
| zyx.nano.Ant 1.1 | 7.5 | 7.9% | 3 |
| arthord.NanoSatanMelee Beta | 9.0 | 6.8% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.5 | 68.9 | 4 / 35 | 2020 |
| 2 | 4 | 55.2 | 67.3 | 1 / 35 | 1989 |
| 3 | 4 | 58.0 | 76.5 | 3 / 35 | 2172 |
| 4 | 4 | 57.7 | 72.1 | 4 / 35 | 2152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 13% |
| d414.nano.Quantum 1.0.0 | 21 | 5% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 12% |
| amz.NanoClone 1.41 | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| mld.Wisdom 1.0 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 128 of 140 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 38 | 30% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 25% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 25 | 20% | 27 |
| mld.Wisdom 1.0 | 14 | 11% | 16 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 8 |
| zyx.nano.Ant 1.1 | 4 | 3% | 5 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 4 |
| amz.NanoClone 1.41 | 4 | 3% | 4 |

