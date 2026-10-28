# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 66.7 | 26 / 105 | 4.00 | 13.5% | 10308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 34 |
| hadur117.nano.SanaroS08 0.1 | 2.3 | 13.5% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.5% | 16 |
| bzdp.Pansy 2.1 | 3.3 | 12.8% | 15 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.4% | 6 |
| fm.claire 1.7 | 6.7 | 8.8% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 8.1% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.6% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 75.2 | 11 / 35 | 3539 |
| 2 | 4 | 56.4 | 57.5 | 6 / 35 | 3271 |
| 3 | 2 | 60.0 | 67.3 | 9 / 35 | 3498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 83% |
| d414.nano.Quantum 1.0.0 | 12 | 50% |
| bzdp.Pansy 2.1 | 8 | 63% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 0% |

Hadur died in 79 of 105 rounds, at a mean tick of 574. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 28% | 28 |
| bzdp.Pansy 2.1 | 15 | 19% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 16% | 24 |
| zyx.nano.Ant 1.1 | 8 | 10% | 8 |
| fm.claire 1.7 | 8 | 10% | 8 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 6 |
| tvv.nano.Polaris 1.2 | 3 | 4% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 6 |
| arthord.MannyPacquiao Beta | 2 | 3% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 72.9 | 21 / 105 | 3.44 | 14.3% | 10132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.9% | 29 |
| hadur117.nano.SanaroS08 0.1 | 2.0 | 14.3% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.6% | 14 |
| fm.mammillarias 1.3 | 5.7 | 9.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 9.4% | 12 |
| DBall.Anarchy 0.1 | 6.3 | 9.5% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.4% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.8% | 3 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 74.3 | 6 / 35 | 3398 |
| 2 | 2 | 62.6 | 74.0 | 9 / 35 | 3801 |
| 3 | 3 | 60.7 | 70.5 | 6 / 35 | 2933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 24% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 80% |
| stelo.SoJNanoMelee 1.1 | 6 | 50% |
| DBall.Anarchy 0.1 | 4 | 0% |
| simonton.nano.MeleeSeed 1.8 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 0% |

Hadur died in 84 of 105 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 30% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 23% | 31 |
| simonton.nano.MeleeSeed 1.8 | 13 | 15% | 14 |
| DBall.Anarchy 0.1 | 9 | 11% | 9 |
| stelo.SoJNanoMelee 1.1 | 6 | 7% | 8 |
| fm.mammillarias 1.3 | 6 | 7% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 4% | 3 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.7 | 25 / 105 | 3.82 | 14.0% | 11630 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 14.9% | 31 |
| hadur117.nano.SanaroS08 0.1 | 2.0 | 14.0% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.5% | 11 |
| ahf.NanoAndrew .4 | 3.0 | 12.3% | 18 |
| ratosh.Nobo 0.21 | 5.0 | 11.1% | 2 |
| timmit.nano.TimDog 0.33 | 6.3 | 8.8% | 2 |
| stelo.PatternRobot 1.0 | 6.7 | 8.5% | 10 |
| repositorio.NanoStep 1.0 | 8.3 | 6.1% | 3 |
| sample.Crazy 1.0 | 8.7 | 5.9% | 3 |
| kurios.DOSexe .9a | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 68.6 | 5 / 35 | 3679 |
| 2 | 2 | 59.6 | 64.8 | 8 / 35 | 3875 |
| 3 | 1 | 62.7 | 72.7 | 12 / 35 | 4076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 78% |
| d414.nano.Quantum 1.0.0 | 11 | 45% |
| ahf.NanoAndrew .4 | 8 | 50% |
| stelo.PatternRobot 1.0 | 5 | 20% |
| ratosh.Nobo 0.21 | 2 | 50% |
| repositorio.NanoStep 1.0 | 2 | 0% |
| sample.Crazy 1.0 | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ahf.NanoAndrew .4 | 17 | 21% | 21 |
| d414.nano.Quantum 1.0.0 | 15 | 19% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 18% | 26 |
| stelo.PatternRobot 1.0 | 10 | 13% | 11 |
| ratosh.Nobo 0.21 | 6 | 8% | 8 |
| timmit.nano.TimDog 0.33 | 6 | 8% | 6 |
| kurios.DOSexe .9a | 5 | 6% | 6 |
| repositorio.NanoStep 1.0 | 4 | 5% | 2 |
| sample.Crazy 1.0 | 3 | 4% | 4 |

## Melee bench: F04

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.6 | 35 / 105 | 2.92 | 16.7% | 16018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.2% | 40 |
| hadur117.nano.SanaroS08 0.1 | 1.7 | 16.7% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 15.0% | 12 |
| wompi.Quokka 1.6 | 4.0 | 13.9% | 12 |
| maribo.FollowFire 1 | 6.0 | 7.0% | 0 |
| kurios.DOSexe .9b | 6.3 | 7.1% | 1 |
| sample.VelociRobot 1.0 | 7.3 | 6.4% | 2 |
| jangs.ns51 1.0 | 7.3 | 6.4% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 6.2% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 79.4 | 12 / 35 | 5771 |
| 2 | 2 | 66.7 | 79.7 | 12 / 35 | 5704 |
| 3 | 2 | 64.5 | 76.8 | 11 / 35 | 4543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 85% |
| d414.nano.Quantum 1.0.0 | 25 | 36% |
| wompi.Quokka 1.6 | 4 | 25% |
| sample.VelociRobot 1.0 | 3 | 33% |
| kurios.DOSexe .9b | 2 | 50% |

Hadur died in 70 of 105 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 44% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 21% | 39 |
| wompi.Quokka 1.6 | 13 | 19% | 13 |
| sample.VelociRobot 1.0 | 3 | 4% | 4 |
| maribo.FollowFire 1 | 3 | 4% | 3 |
| kurios.DOSexe .9b | 2 | 3% | 3 |
| jangs.ns51 1.0 | 2 | 3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 73.9 | 29 / 105 | 3.35 | 15.0% | 13360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.3% | 35 |
| hadur117.nano.SanaroS08 0.1 | 2.3 | 15.0% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.5% | 21 |
| ntc.Opposite 1.5 | 4.7 | 12.0% | 6 |
| js.PinBall 1.6 | 5.0 | 10.8% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 10.9% | 4 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.7% | 5 |
| sample.Fire 1.0 | 8.3 | 4.9% | 1 |
| PSW.Relentless 0.1 | 8.7 | 4.5% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 72.1 | 9 / 35 | 4587 |
| 2 | 2 | 64.1 | 75.2 | 11 / 35 | 4544 |
| 3 | 2 | 62.6 | 74.3 | 9 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 69% |
| ntc.Opposite 1.5 | 6 | 67% |
| js.PinBall 1.6 | 3 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 0% |
| sample.Fire 1.0 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 0% |

Hadur died in 76 of 105 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 32% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 29% | 36 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 12% | 9 |
| js.PinBall 1.6 | 7 | 9% | 8 |
| ntc.Opposite 1.5 | 7 | 9% | 7 |
| PSW.Relentless 0.1 | 4 | 5% | 4 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.7 | 17 / 105 | 4.09 | 13.0% | 10052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.3 | 13.9% | 23 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.5% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 13 |
| hadur117.nano.SanaroS08 0.1 | 3.3 | 13.0% | 17 |
| radnor.DoctorBob 1.42 | 4.0 | 12.7% | 18 |
| myl.nano.Graviton 1.10 | 5.7 | 11.5% | 10 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 7.2% | 2 |
| ratosh.Wesco 1.4 | 8.0 | 7.1% | 1 |
| stelo.MirrorNano 1.3 | 8.0 | 7.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 66.7 | 4 / 35 | 3090 |
| 2 | 2 | 60.5 | 65.7 | 7 / 35 | 3676 |
| 3 | 4 | 59.6 | 64.8 | 6 / 35 | 3286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 56% |
| kawigi.nano.Lib 1.0 | 6 | 67% |
| d414.nano.Quantum 1.0.0 | 6 | 50% |
| myl.nano.Graviton 1.10 | 5 | 60% |
| radnor.DoctorBob 1.42 | 5 | 20% |

Hadur died in 88 of 105 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 20% | 21 |
| kawigi.nano.Lib 1.0 | 16 | 18% | 19 |
| radnor.DoctorBob 1.42 | 16 | 18% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 17% | 21 |
| myl.nano.Graviton 1.10 | 11 | 13% | 14 |
| ratosh.Wesco 1.4 | 5 | 6% | 5 |
| stelo.MirrorNano 1.3 | 4 | 5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 3 | 3% | 3 |

## Melee bench: F07

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 63.3 | 15 / 105 | 4.30 | 12.6% | 10694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.7% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.5% | 21 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.4% | 19 |
| hadur117.nano.SanaroS08 0.1 | 4.0 | 12.6% | 15 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.7% | 14 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 10.7% | 6 |
| mz.Cork 0.1 | 7.0 | 10.3% | 4 |
| stelo.UntouchableNano 1.3 | 8.3 | 5.5% | 0 |
| stuff.Vlad 0.1 | 8.7 | 4.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.8 | 58.4 | 5 / 35 | 3365 |
| 2 | 3 | 60.6 | 67.3 | 6 / 35 | 4015 |
| 3 | 4 | 58.2 | 64.1 | 4 / 35 | 3314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| nz.jdc.nano.GridFu 1.0 | 8 | 50% |
| cb.nano.Insomnia 1.0 | 5 | 60% |
| oog.melee.CapuletDroid 1.1 | 4 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 67% |
| mz.Cork 0.1 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 0% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 23% | 25 |
| nz.jdc.nano.GridFu 1.0 | 18 | 20% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 19% | 20 |
| oog.melee.CapuletDroid 1.1 | 11 | 12% | 12 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 10 |
| mz.Cork 0.1 | 9 | 10% | 11 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 3 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 3 battles (2.7 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.1 | 21 / 105 | 3.87 | 13.5% | 10951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 29 |
| hadur117.nano.SanaroS08 0.1 | 2.3 | 13.5% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.7% | 15 |
| gh.nano.Grofvuil 0.2 | 4.3 | 12.4% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 11.9% | 5 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 11.2% | 15 |
| baal.nano.N 1.42 | 7.0 | 9.2% | 0 |
| donjezza.Muncho 1.0 | 8.3 | 6.0% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.7 | 5.5% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.0 | 75.9 | 7 / 35 | 3954 |
| 2 | 3 | 59.3 | 62.9 | 8 / 35 | 3477 |
| 3 | 3 | 60.0 | 65.7 | 6 / 35 | 3520 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 62% |
| d414.nano.Quantum 1.0.0 | 10 | 40% |
| djdjdj.NanoSkunk10 1.0 | 9 | 44% |
| gh.nano.Grofvuil 0.2 | 5 | 40% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 84 of 105 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 24% | 29 |
| dmh.robocode.robot.RedDwarf 0.4 | 18 | 21% | 18 |
| d414.nano.Quantum 1.0.0 | 15 | 18% | 19 |
| djdjdj.NanoSkunk10 1.0 | 13 | 15% | 17 |
| gh.nano.Grofvuil 0.2 | 12 | 14% | 14 |
| baal.nano.N 1.42 | 3 | 4% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 2 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 60.7 | 10 / 105 | 4.53 | 11.9% | 8712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 12.9% | 20 |
| mld.DustBunny 3.8 | 2.3 | 12.3% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 12.4% | 27 |
| hadur117.nano.SanaroS08 0.1 | 3.7 | 11.9% | 10 |
| wee.Gem 1.8.4 | 4.7 | 10.8% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5.3 | 10.8% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 7.0 | 9.4% | 6 |
| cs.sheldor.Talon 1.1 | 8.0 | 7.6% | 2 |
| tj.zombie1n 1.0.1 | 9.3 | 6.8% | 6 |
| step.nanoPri 1.0 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 55.9 | 2 / 35 | 2867 |
| 2 | 3 | 58.0 | 67.0 | 4 / 35 | 2899 |
| 3 | 3 | 55.5 | 59.4 | 4 / 35 | 2946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 9 | 22% |
| wee.Gem 1.8.4 | 4 | 50% |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 67% |
| d414.nano.Quantum 1.0.0 | 3 | 0% |
| tj.zombie1n 1.0.1 | 3 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 67% |
| mld.DustBunny 3.8 | 1 | 100% |

Hadur died in 95 of 105 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 23% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 16% | 18 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 15% | 14 |
| wee.Gem 1.8.4 | 13 | 14% | 16 |
| mld.DustBunny 3.8 | 11 | 12% | 12 |
| cs.sheldor.Talon 1.1 | 9 | 9% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 4% | 7 |
| tj.zombie1n 1.0.1 | 4 | 4% | 3 |
| step.nanoPri 1.0 | 3 | 3% | 4 |

## Melee bench: F10

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 74.2 | 26 / 105 | 3.32 | 15.0% | 12746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.3% | 26 |
| hadur117.nano.SanaroS08 0.1 | 2.3 | 15.0% | 26 |
| mld.Infinity 2.2 | 2.7 | 15.0% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 14.0% | 19 |
| robar.nano.Assertive_Melee 0.2 | 5.0 | 8.5% | 0 |
| ayk.WallHugger 1.0 | 6.7 | 7.5% | 1 |
| conscience.Electron 1.3g | 7.3 | 7.0% | 0 |
| exauge.GateKeeper 1.1.121g | 7.3 | 6.9% | 1 |
| donjezza.Jezza 1.0 | 8.7 | 5.9% | 2 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 74.0 | 6 / 35 | 4130 |
| 2 | 3 | 62.8 | 73.3 | 9 / 35 | 4057 |
| 3 | 2 | 64.3 | 75.2 | 11 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 64% |
| mld.Infinity 2.2 | 11 | 45% |
| robar.nano.Assertive_Melee 0.2 | 3 | 100% |
| donjezza.Jezza 1.0 | 1 | 0% |

Hadur died in 79 of 105 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 34% | 39 |
| d414.nano.Quantum 1.0.0 | 25 | 32% | 38 |
| robar.nano.Assertive_Melee 0.2 | 8 | 10% | 12 |
| mld.Infinity 2.2 | 8 | 10% | 4 |
| conscience.Electron 1.3g | 4 | 5% | 4 |
| donjezza.Jezza 1.0 | 3 | 4% | 3 |
| ayk.WallHugger 1.0 | 2 | 3% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 3% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 67.5 | 19 / 105 | 3.92 | 13.4% | 10247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.5% | 33 |
| hadur117.nano.SanaroS08 0.1 | 2.7 | 13.4% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.6% | 16 |
| mz.NanoGod 2.02 | 4.0 | 11.2% | 13 |
| oog.melee.Corsair 1.0 | 4.3 | 12.1% | 11 |
| DBall.NUKE 0.1 | 7.0 | 7.7% | 6 |
| awesomeness.Elite 1.0 | 7.3 | 8.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.9% | 2 |
| sample.Walls 1.0 | 8.3 | 6.7% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 67.0 | 2 / 35 | 3231 |
| 2 | 3 | 59.0 | 65.1 | 7 / 35 | 3545 |
| 3 | 2 | 61.1 | 70.5 | 10 / 35 | 3471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 73% |
| d414.nano.Quantum 1.0.0 | 9 | 22% |
| mz.NanoGod 2.02 | 5 | 40% |
| oog.melee.Corsair 1.0 | 4 | 50% |
| DBall.NUKE 0.1 | 4 | 75% |
| awesomeness.Elite 1.0 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 0% |

Hadur died in 86 of 105 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 35% | 33 |
| mz.NanoGod 2.02 | 13 | 15% | 14 |
| oog.melee.Corsair 1.0 | 12 | 14% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 13% | 20 |
| DBall.NUKE 0.1 | 6 | 7% | 7 |
| zyx.nano.BacillusComma 1.0 | 6 | 7% | 6 |
| awesomeness.Elite 1.0 | 5 | 6% | 6 |
| sample.Walls 1.0 | 3 | 3% | 3 |

## Melee bench: F12

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.7 | 21 / 105 | 4.18 | 13.0% | 9953 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.0% | 27 |
| hadur117.nano.SanaroS08 0.1 | 2.3 | 13.0% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 12.9% | 11 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 11.7% | 11 |
| sul.Lunar 1.1 | 4.7 | 11.4% | 16 |
| maribo.melee.BMV 0.1 | 7.3 | 8.4% | 2 |
| sam.Samspin 1.0 | 7.3 | 8.5% | 6 |
| spinnercat.Omen 1.0 | 7.7 | 8.1% | 6 |
| sample.SpinBot 1.0 | 7.7 | 7.9% | 6 |
| cvt.Firsty 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.7 | 65.4 | 7 / 35 | 3432 |
| 2 | 4 | 55.9 | 58.7 | 5 / 35 | 3152 |
| 3 | 1 | 60.4 | 69.8 | 9 / 35 | 3369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 9 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 78% |
| sul.Lunar 1.1 | 8 | 88% |
| myl.nano.KomoriNinja 1.1 | 3 | 67% |
| sam.Samspin 1.0 | 3 | 33% |
| sample.SpinBot 1.0 | 2 | 0% |
| spinnercat.Omen 1.0 | 2 | 50% |

Hadur died in 84 of 105 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 26% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 23% | 26 |
| sam.Samspin 1.0 | 10 | 12% | 11 |
| sul.Lunar 1.1 | 9 | 11% | 15 |
| myl.nano.KomoriNinja 1.1 | 7 | 8% | 9 |
| sample.SpinBot 1.0 | 7 | 8% | 8 |
| maribo.melee.BMV 0.1 | 5 | 6% | 5 |
| spinnercat.Omen 1.0 | 4 | 5% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.nano.SanaroS08 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 3 battles (1.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.3 | 27 / 105 | 3.86 | 13.6% | 10392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS08 0.1 | 2.0 | 13.6% | 27 |
| d414.nano.Quantum 1.0.0 | 2.3 | 13.6% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.3 | 13.7% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 13.0% | 8 |
| mld.Wisdom 1.0 | 4.7 | 11.3% | 6 |
| tvv.nano.Polaris 1.2 | 6.3 | 8.7% | 3 |
| zyx.nano.Ant 1.1 | 7.3 | 8.2% | 4 |
| arthord.NanoSatanMelee Beta | 8.0 | 7.5% | 2 |
| amz.NanoClone 1.41 | 8.3 | 7.7% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.9 | 71.1 | 10 / 35 | 3418 |
| 2 | 4 | 57.8 | 61.9 | 6 / 35 | 3420 |
| 3 | 1 | 61.6 | 71.7 | 11 / 35 | 3554 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 75% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 70% |
| d414.nano.Quantum 1.0.0 | 6 | 33% |
| tvv.nano.Polaris 1.2 | 5 | 40% |
| mld.Wisdom 1.0 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |

Hadur died in 79 of 105 rounds, at a mean tick of 647. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 23% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 20% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 19% | 27 |
| mld.Wisdom 1.0 | 10 | 13% | 15 |
| arthord.NanoSatanMelee Beta | 6 | 8% | 8 |
| tvv.nano.Polaris 1.2 | 6 | 8% | 5 |
| amz.NanoClone 1.41 | 5 | 6% | 5 |
| zyx.nano.Ant 1.1 | 3 | 4% | 3 |

