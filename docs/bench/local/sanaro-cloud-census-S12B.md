# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 59.4 | 18 / 105 | 4.66 | 12.5% | 11094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.8% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.9% | 17 |
| hadur117.nano.SanaroS12B 0.1 | 2.7 | 12.5% | 18 |
| bzdp.Pansy 2.1 | 3.7 | 12.6% | 16 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.4% | 5 |
| arthord.NanoSatanMelee Beta | 5.7 | 9.2% | 4 |
| zyx.nano.Ant 1.1 | 7.3 | 8.1% | 4 |
| fm.claire 1.7 | 7.7 | 8.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 7.1% | 3 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 53.7 | 5 / 35 | 3620 |
| 2 | 3 | 55.7 | 55.9 | 4 / 35 | 3251 |
| 3 | 1 | 62.1 | 68.6 | 9 / 35 | 4223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 12 | 58% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 50% |
| bzdp.Pansy 2.1 | 5 | 60% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 0% |
| fm.claire 1.7 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 87 of 105 rounds, at a mean tick of 505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 30% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 25% | 27 |
| bzdp.Pansy 2.1 | 15 | 17% | 16 |
| tvv.nano.Polaris 1.2 | 7 | 8% | 8 |
| fm.claire 1.7 | 7 | 8% | 7 |
| zyx.nano.Ant 1.1 | 6 | 7% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.4 | 9 / 105 | 3.93 | 13.4% | 10544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.0% | 17 |
| d414.nano.Quantum 1.0.0 | 2.3 | 14.2% | 22 |
| hadur117.nano.SanaroS12B 0.1 | 2.3 | 13.4% | 9 |
| simonton.nano.MeleeSeed 1.8 | 3.7 | 12.4% | 18 |
| DBall.Anarchy 0.1 | 4.7 | 11.2% | 20 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 9.5% | 15 |
| fm.mammillarias 1.3 | 6.7 | 9.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 66.3 | 3 / 35 | 3549 |
| 2 | 2 | 61.4 | 72.7 | 1 / 35 | 3758 |
| 3 | 2 | 59.1 | 63.2 | 5 / 35 | 3237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 9 | 11% |
| DBall.Anarchy 0.1 | 6 | 17% |
| simonton.nano.MeleeSeed 1.8 | 6 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 80% |
| stelo.SoJNanoMelee 1.1 | 2 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 96 of 105 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 26% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 21% | 27 |
| simonton.nano.MeleeSeed 1.8 | 16 | 17% | 16 |
| DBall.Anarchy 0.1 | 13 | 14% | 13 |
| stelo.SoJNanoMelee 1.1 | 10 | 10% | 9 |
| fm.mammillarias 1.3 | 9 | 9% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 59.2 | 5 / 105 | 4.68 | 12.1% | 11717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.8% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.4% | 15 |
| ahf.NanoAndrew .4 | 3.3 | 12.2% | 20 |
| hadur117.nano.SanaroS12B 0.1 | 4.0 | 12.1% | 5 |
| ratosh.Nobo 0.21 | 4.0 | 11.2% | 7 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.6% | 6 |
| repositorio.NanoStep 1.0 | 8.0 | 6.8% | 4 |
| stelo.PatternRobot 1.0 | 8.0 | 6.7% | 4 |
| sample.Crazy 1.0 | 8.7 | 5.9% | 2 |
| kurios.DOSexe .9a | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 62.5 | 1 / 35 | 3843 |
| 2 | 3 | 59.5 | 64.8 | 2 / 35 | 4196 |
| 3 | 5 | 53.3 | 50.2 | 2 / 35 | 3678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 9 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 33% |
| ahf.NanoAndrew .4 | 4 | 25% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| ratosh.Nobo 0.21 | 1 | 0% |

Hadur died in 100 of 105 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 32% | 33 |
| ahf.NanoAndrew .4 | 17 | 17% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 14% | 17 |
| ratosh.Nobo 0.21 | 14 | 14% | 14 |
| timmit.nano.TimDog 0.33 | 12 | 12% | 13 |
| kurios.DOSexe .9a | 4 | 4% | 4 |
| sample.Crazy 1.0 | 3 | 3% | 3 |
| repositorio.NanoStep 1.0 | 2 | 2% | 2 |
| stelo.PatternRobot 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 72.5 | 18 / 105 | 3.48 | 15.1% | 15485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.9% | 48 |
| hadur117.nano.SanaroS12B 0.1 | 2.3 | 15.1% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.4% | 21 |
| wompi.Quokka 1.6 | 4.0 | 13.9% | 14 |
| maribo.FollowFire 1 | 5.0 | 8.2% | 0 |
| kurios.DOSexe .9b | 6.3 | 7.5% | 0 |
| sample.VelociRobot 1.0 | 7.3 | 6.3% | 2 |
| jangs.ns51 1.0 | 8.0 | 5.9% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.3 | 5.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 67.3 | 2 / 35 | 4867 |
| 2 | 2 | 64.3 | 73.0 | 8 / 35 | 5122 |
| 3 | 2 | 65.6 | 77.1 | 8 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 47% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 18% |
| wompi.Quokka 1.6 | 9 | 56% |
| jangs.ns51 1.0 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 88 of 105 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 39% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 31% | 28 |
| wompi.Quokka 1.6 | 14 | 16% | 16 |
| jangs.ns51 1.0 | 4 | 5% | 4 |
| maribo.FollowFire 1 | 4 | 5% | 4 |
| sample.VelociRobot 1.0 | 3 | 3% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 69.8 | 26 / 105 | 3.71 | 15.0% | 15157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.4% | 39 |
| hadur117.nano.SanaroS12B 0.1 | 2.0 | 15.0% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.6% | 22 |
| ntc.Opposite 1.5 | 4.0 | 12.9% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 10.9% | 3 |
| js.PinBall 1.6 | 5.7 | 10.7% | 7 |
| sp.Nanos.Ember 1.1 | 7.0 | 6.6% | 3 |
| PSW.Relentless 0.1 | 8.3 | 4.8% | 0 |
| sample.Fire 1.0 | 8.7 | 4.5% | 1 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 69.2 | 10 / 35 | 5198 |
| 2 | 2 | 62.0 | 66.0 | 7 / 35 | 4821 |
| 3 | 2 | 64.7 | 74.3 | 9 / 35 | 5138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 69% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 50% |
| ntc.Opposite 1.5 | 5 | 80% |
| sp.Nanos.Ember 1.1 | 3 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |
| js.PinBall 1.6 | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 29% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 26% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 14% | 15 |
| ntc.Opposite 1.5 | 11 | 14% | 13 |
| js.PinBall 1.6 | 9 | 11% | 9 |
| PSW.Relentless 0.1 | 3 | 4% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 56.4 | 7 / 105 | 4.92 | 11.3% | 9833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.0 | 15.1% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 8 |
| d414.nano.Quantum 1.0.0 | 3.0 | 13.2% | 19 |
| radnor.DoctorBob 1.42 | 3.0 | 13.2% | 24 |
| hadur117.nano.SanaroS12B 0.1 | 5.3 | 11.3% | 7 |
| myl.nano.Graviton 1.10 | 5.7 | 10.5% | 15 |
| squidM.TentalceMeleeNano 1.1 | 7.3 | 8.1% | 2 |
| ratosh.Wesco 1.4 | 8.0 | 7.9% | 3 |
| stelo.MirrorNano 1.3 | 8.7 | 7.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.1 | 60.0 | 3 / 35 | 3507 |
| 2 | 5 | 56.6 | 55.9 | 3 / 35 | 3308 |
| 3 | 6 | 54.5 | 53.3 | 1 / 35 | 3018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 7 | 0% |
| d414.nano.Quantum 1.0.0 | 5 | 60% |
| radnor.DoctorBob 1.42 | 4 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 2 | 0% |
| myl.nano.Graviton 1.10 | 2 | 0% |

Hadur died in 98 of 105 rounds, at a mean tick of 532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 20 | 20% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 20% | 21 |
| radnor.DoctorBob 1.42 | 20 | 20% | 21 |
| d414.nano.Quantum 1.0.0 | 17 | 17% | 20 |
| myl.nano.Graviton 1.10 | 7 | 7% | 8 |
| ratosh.Wesco 1.4 | 7 | 7% | 7 |
| stelo.MirrorNano 1.3 | 4 | 4% | 4 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 3 |

## Melee bench: F07

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 60.1 | 8 / 105 | 4.59 | 12.7% | 12744 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.9% | 30 |
| nz.jdc.nano.GridFu 1.0 | 1.7 | 14.1% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.1% | 20 |
| hadur117.nano.SanaroS12B 0.1 | 3.7 | 12.7% | 8 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 11.0% | 7 |
| cb.nano.Insomnia 1.0 | 6.0 | 10.4% | 7 |
| mz.Cork 0.1 | 6.3 | 11.0% | 6 |
| stelo.UntouchableNano 1.3 | 8.0 | 5.5% | 2 |
| stuff.Vlad 0.1 | 9.0 | 4.4% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 64.8 | 3 / 35 | 4408 |
| 2 | 4 | 58.3 | 58.1 | 2 / 35 | 4394 |
| 3 | 4 | 57.8 | 57.5 | 3 / 35 | 3942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 8 | 63% |
| nz.jdc.nano.GridFu 1.0 | 5 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4 | 50% |
| mz.Cork 0.1 | 3 | 0% |
| oog.melee.CapuletDroid 1.1 | 2 | 50% |
| cb.nano.Insomnia 1.0 | 1 | 0% |

Hadur died in 97 of 105 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 25 | 26% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 21% | 22 |
| d414.nano.Quantum 1.0.0 | 18 | 19% | 24 |
| mz.Cork 0.1 | 13 | 13% | 14 |
| cb.nano.Insomnia 1.0 | 8 | 8% | 7 |
| oog.melee.CapuletDroid 1.1 | 6 | 6% | 7 |
| stelo.UntouchableNano 1.3 | 3 | 3% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 67.4 | 12 / 105 | 3.93 | 13.6% | 12165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.5% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.6% | 19 |
| hadur117.nano.SanaroS12B 0.1 | 3.0 | 13.6% | 12 |
| gh.nano.Grofvuil 0.2 | 4.0 | 13.0% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 9.7% | 11 |
| baal.nano.N 1.42 | 6.7 | 9.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.8% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.0% | 1 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 67.6 | 2 / 35 | 4086 |
| 2 | 3 | 62.6 | 72.4 | 4 / 35 | 4109 |
| 3 | 3 | 59.7 | 62.2 | 6 / 35 | 3970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 27% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 36% |
| gh.nano.Grofvuil 0.2 | 6 | 50% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 94 of 105 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 32% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 24% | 27 |
| gh.nano.Grofvuil 0.2 | 15 | 16% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 10% | 10 |
| djdjdj.NanoSkunk10 1.0 | 7 | 7% | 8 |
| baal.nano.N 1.42 | 5 | 5% | 6 |
| donjezza.Muncho 1.0 | 3 | 3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.7 | 46.1 | 7 / 105 | 5.85 | 9.6% | 8507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 13.4% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 12.5% | 13 |
| mld.DustBunny 3.8 | 3.3 | 11.9% | 8 |
| wee.Gem 1.8.4 | 3.7 | 10.9% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 11.3% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 9.8% | 9 |
| hadur117.nano.SanaroS12B 0.1 | 6.7 | 9.6% | 7 |
| tj.zombie1n 1.0.1 | 8.3 | 7.7% | 9 |
| cs.sheldor.Talon 1.1 | 8.7 | 7.5% | 1 |
| step.nanoPri 1.0 | 10.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 48.8 | 45.1 | 3 / 35 | 2612 |
| 2 | 7 | 50.5 | 48.3 | 2 / 35 | 2908 |
| 3 | 7 | 49.8 | 45.1 | 2 / 35 | 2987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 6 | 50% |
| d414.nano.Quantum 1.0.0 | 3 | 33% |
| mld.DustBunny 3.8 | 3 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 100% |
| wee.Gem 1.8.4 | 1 | 0% |

Hadur died in 98 of 105 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 20% | 21 |
| d414.nano.Quantum 1.0.0 | 19 | 19% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 12% | 12 |
| mld.DustBunny 3.8 | 11 | 11% | 13 |
| cs.sheldor.Talon 1.1 | 10 | 10% | 10 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 9% | 8 |
| wee.Gem 1.8.4 | 8 | 8% | 10 |
| step.nanoPri 1.0 | 6 | 6% | 6 |
| tj.zombie1n 1.0.1 | 3 | 3% | 3 |

## Melee bench: F10

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 62.3 | 8 / 105 | 4.39 | 12.7% | 11863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.3% | 36 |
| mld.Infinity 2.2 | 1.7 | 15.5% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.7% | 20 |
| hadur117.nano.SanaroS12B 0.1 | 4.0 | 12.7% | 8 |
| ayk.WallHugger 1.0 | 5.3 | 8.4% | 3 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.7% | 1 |
| conscience.Electron 1.3g | 6.7 | 7.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 7.3 | 7.3% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 1 |
| sample.RamFire 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 57.5 | 2 / 35 | 3960 |
| 2 | 4 | 58.1 | 61.3 | 2 / 35 | 3861 |
| 3 | 4 | 60.8 | 68.3 | 4 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 63% |
| mld.Infinity 2.2 | 7 | 14% |

Hadur died in 97 of 105 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 30% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 23% | 28 |
| mld.Infinity 2.2 | 21 | 22% | 14 |
| robar.nano.Assertive_Melee 0.2 | 8 | 8% | 9 |
| conscience.Electron 1.3g | 6 | 6% | 7 |
| exauge.GateKeeper 1.1.121g | 4 | 4% | 6 |
| ayk.WallHugger 1.0 | 4 | 4% | 5 |
| donjezza.Jezza 1.0 | 3 | 3% | 4 |

## Melee bench: F11

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 55.0 | 9 / 105 | 5.05 | 11.5% | 11115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.0% | 23 |
| oog.melee.Corsair 1.0 | 3.3 | 12.3% | 14 |
| mz.NanoGod 2.02 | 3.7 | 11.4% | 10 |
| hadur117.nano.SanaroS12B 0.1 | 4.3 | 11.5% | 9 |
| DBall.NUKE 0.1 | 6.7 | 8.4% | 5 |
| awesomeness.Elite 1.0 | 7.0 | 8.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 8.0% | 1 |
| sample.Walls 1.0 | 8.7 | 6.9% | 4 |
| stelo.PianistNano 1.2 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.0 | 55.9 | 4 / 35 | 3688 |
| 2 | 5 | 51.8 | 47.0 | 0 / 35 | 3453 |
| 3 | 3 | 58.7 | 62.2 | 5 / 35 | 3974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 25% |
| d414.nano.Quantum 1.0.0 | 7 | 29% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| mz.NanoGod 2.02 | 3 | 67% |
| sample.Walls 1.0 | 1 | 0% |
| DBall.NUKE 0.1 | 1 | 0% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 97 of 105 rounds, at a mean tick of 542. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 26% | 25 |
| oog.melee.Corsair 1.0 | 16 | 16% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 16% | 19 |
| mz.NanoGod 2.02 | 16 | 16% | 18 |
| awesomeness.Elite 1.0 | 7 | 7% | 6 |
| DBall.NUKE 0.1 | 6 | 6% | 7 |
| sample.Walls 1.0 | 6 | 6% | 6 |
| zyx.nano.BacillusComma 1.0 | 5 | 5% | 5 |

## Melee bench: F12

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.9 | 53.8 | 11 / 105 | 5.16 | 11.3% | 10280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.3% | 17 |
| sul.Lunar 1.1 | 3.3 | 12.0% | 18 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 10.9% | 11 |
| hadur117.nano.SanaroS12B 0.1 | 4.3 | 11.3% | 11 |
| maribo.melee.BMV 0.1 | 6.7 | 8.8% | 3 |
| sam.Samspin 1.0 | 7.3 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 7.8% | 1 |
| sample.SpinBot 1.0 | 8.3 | 7.5% | 5 |
| cvt.Firsty 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 50.2 | 4 / 35 | 3135 |
| 2 | 4 | 55.8 | 54.9 | 3 / 35 | 3658 |
| 3 | 4 | 55.3 | 56.2 | 4 / 35 | 3487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sul.Lunar 1.1 | 8 | 50% |
| d414.nano.Quantum 1.0.0 | 6 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 33% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 0% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 94 of 105 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 29% | 28 |
| d414.nano.Quantum 1.0.0 | 16 | 17% | 21 |
| sul.Lunar 1.1 | 14 | 15% | 17 |
| myl.nano.KomoriNinja 1.1 | 11 | 12% | 13 |
| maribo.melee.BMV 0.1 | 9 | 10% | 9 |
| sample.SpinBot 1.0 | 6 | 6% | 5 |
| spinnercat.Omen 1.0 | 5 | 5% | 6 |
| sam.Samspin 1.0 | 4 | 4% | 4 |
| cvt.Firsty 1.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.nano.SanaroS12B 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 56.2 | 10 / 105 | 4.94 | 11.5% | 10695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.8% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.5% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 13.0% | 20 |
| hadur117.nano.SanaroS12B 0.1 | 3.7 | 11.5% | 10 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 4 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.7% | 4 |
| zyx.nano.Ant 1.1 | 7.7 | 7.8% | 4 |
| arthord.NanoSatanMelee Beta | 8.0 | 7.9% | 3 |
| amz.NanoClone 1.41 | 8.0 | 7.9% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.6 | 55.9 | 1 / 35 | 3390 |
| 2 | 3 | 58.7 | 61.3 | 6 / 35 | 4012 |
| 3 | 4 | 52.9 | 51.4 | 3 / 35 | 3293 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 36% |
| d414.nano.Quantum 1.0.0 | 4 | 25% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| mld.Wisdom 1.0 | 2 | 50% |
| tvv.nano.Polaris 1.2 | 1 | 0% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 95 of 105 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 20% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 19% | 24 |
| mld.Wisdom 1.0 | 15 | 16% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 15% | 16 |
| amz.NanoClone 1.41 | 8 | 8% | 8 |
| zyx.nano.Ant 1.1 | 7 | 7% | 7 |
| tvv.nano.Polaris 1.2 | 6 | 6% | 6 |
| arthord.NanoSatanMelee Beta | 6 | 6% | 6 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |

