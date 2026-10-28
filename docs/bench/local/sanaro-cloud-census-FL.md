# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.4 | 24 / 105 | 3.75 | 13.9% | 10781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 38 |
| hadur117.nano.SanaroFL 0.1 | 2.3 | 13.9% | 24 |
| bzdp.Pansy 2.1 | 3.3 | 12.0% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.2% | 15 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.3% | 4 |
| zyx.nano.Ant 1.1 | 6.3 | 9.0% | 1 |
| tvv.nano.Polaris 1.2 | 6.7 | 9.2% | 8 |
| fm.claire 1.7 | 7.0 | 8.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.8% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.9 | 65.1 | 10 / 35 | 3587 |
| 2 | 2 | 60.4 | 70.5 | 7 / 35 | 3455 |
| 3 | 3 | 62.0 | 72.7 | 7 / 35 | 3739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 58% |
| arthord.NanoSatanMelee Beta | 6 | 83% |
| bzdp.Pansy 2.1 | 6 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 83 of 105 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 34% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 19% | 24 |
| bzdp.Pansy 2.1 | 14 | 17% | 17 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 10 |
| zyx.nano.Ant 1.1 | 7 | 8% | 7 |
| fm.claire 1.7 | 5 | 6% | 5 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 72.7 | 25 / 105 | 3.46 | 14.2% | 9631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.7% | 24 |
| hadur117.nano.SanaroFL 0.1 | 2.3 | 14.2% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 12.1% | 12 |
| DBall.Anarchy 0.1 | 4.7 | 11.0% | 15 |
| fm.mammillarias 1.3 | 6.0 | 9.6% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 9.2% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.0% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 78.1 | 12 / 35 | 3549 |
| 2 | 4 | 57.2 | 63.2 | 5 / 35 | 2746 |
| 3 | 2 | 63.0 | 76.8 | 8 / 35 | 3336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 64% |
| DBall.Anarchy 0.1 | 8 | 50% |
| simonton.nano.MeleeSeed 1.8 | 5 | 80% |
| fm.mammillarias 1.3 | 4 | 100% |
| stelo.SoJNanoMelee 1.1 | 4 | 25% |
| sample.MyFirstRobot 1.0 | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 28% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 20% | 28 |
| simonton.nano.MeleeSeed 1.8 | 14 | 18% | 18 |
| stelo.SoJNanoMelee 1.1 | 11 | 14% | 10 |
| DBall.Anarchy 0.1 | 8 | 10% | 12 |
| fm.mammillarias 1.3 | 4 | 5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 4% | 3 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 3 |

## Melee bench: F03

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 64.2 | 17 / 105 | 4.22 | 12.9% | 11073 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.7 | 14.6% | 18 |
| hadur117.nano.SanaroFL 0.1 | 3.3 | 12.9% | 17 |
| ahf.NanoAndrew .4 | 3.7 | 12.2% | 16 |
| ratosh.Nobo 0.21 | 5.0 | 11.4% | 3 |
| timmit.nano.TimDog 0.33 | 6.0 | 8.6% | 4 |
| stelo.PatternRobot 1.0 | 7.3 | 7.1% | 7 |
| repositorio.NanoStep 1.0 | 8.0 | 6.4% | 5 |
| sample.Crazy 1.0 | 8.7 | 5.8% | 1 |
| kurios.DOSexe .9a | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 63.5 | 4 / 35 | 3151 |
| 2 | 3 | 59.4 | 64.8 | 7 / 35 | 3851 |
| 3 | 3 | 59.2 | 64.4 | 6 / 35 | 4071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 65% |
| d414.nano.Quantum 1.0.0 | 12 | 42% |
| stelo.PatternRobot 1.0 | 2 | 50% |
| ahf.NanoAndrew .4 | 2 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| ratosh.Nobo 0.21 | 1 | 0% |

Hadur died in 88 of 105 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 23% | 29 |
| ahf.NanoAndrew .4 | 19 | 22% | 19 |
| d414.nano.Quantum 1.0.0 | 18 | 20% | 23 |
| ratosh.Nobo 0.21 | 10 | 11% | 11 |
| timmit.nano.TimDog 0.33 | 8 | 9% | 8 |
| repositorio.NanoStep 1.0 | 6 | 7% | 6 |
| kurios.DOSexe .9a | 3 | 3% | 4 |
| stelo.PatternRobot 1.0 | 3 | 3% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F04

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 3 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.3 | 28 / 105 | 2.95 | 16.3% | 15762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.5% | 44 |
| hadur117.nano.SanaroFL 0.1 | 1.7 | 16.3% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 15.0% | 20 |
| wompi.Quokka 1.6 | 4.0 | 14.2% | 10 |
| maribo.FollowFire 1 | 5.7 | 7.4% | 0 |
| kurios.DOSexe .9b | 6.0 | 7.4% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 6.3 | 6.5% | 1 |
| jangs.ns51 1.0 | 8.3 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 8.7 | 5.9% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 80.6 | 8 / 35 | 5179 |
| 2 | 1 | 65.9 | 80.6 | 11 / 35 | 4976 |
| 3 | 2 | 65.1 | 73.7 | 9 / 35 | 5607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 36% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 55% |
| wompi.Quokka 1.6 | 8 | 63% |
| sample.VelociRobot 1.0 | 3 | 67% |
| kurios.DOSexe .9b | 1 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 77 of 105 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 40% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 35% | 40 |
| wompi.Quokka 1.6 | 15 | 19% | 18 |
| kurios.DOSexe .9b | 2 | 3% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.2 | 27 / 105 | 3.50 | 14.7% | 13287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.2% | 20 |
| hadur117.nano.SanaroFL 0.1 | 3.0 | 14.7% | 27 |
| js.PinBall 1.6 | 4.3 | 11.7% | 8 |
| ntc.Opposite 1.5 | 4.7 | 12.3% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6.0 | 10.3% | 4 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.5% | 6 |
| sample.Fire 1.0 | 8.0 | 4.8% | 0 |
| PSW.Relentless 0.1 | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 75.9 | 7 / 35 | 4396 |
| 2 | 3 | 62.5 | 71.4 | 10 / 35 | 4326 |
| 3 | 3 | 62.4 | 69.2 | 10 / 35 | 4565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 68% |
| d414.nano.Quantum 1.0.0 | 15 | 53% |
| ntc.Opposite 1.5 | 4 | 50% |
| sp.Nanos.Ember 1.1 | 4 | 50% |
| js.PinBall 1.6 | 1 | 0% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 0% |

Hadur died in 79 of 105 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 30% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 22% | 32 |
| ntc.Opposite 1.5 | 16 | 20% | 16 |
| js.PinBall 1.6 | 11 | 14% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 8% | 6 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 5 |
| PSW.Relentless 0.1 | 2 | 3% | 2 |

## Melee bench: F06

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 64.9 | 15 / 105 | 4.16 | 12.5% | 8923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.5% | 27 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.4% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 10 |
| radnor.DoctorBob 1.42 | 3.3 | 12.8% | 18 |
| hadur117.nano.SanaroFL 0.1 | 4.7 | 12.5% | 15 |
| myl.nano.Graviton 1.10 | 5.3 | 11.5% | 11 |
| stelo.MirrorNano 1.3 | 7.3 | 7.6% | 2 |
| ratosh.Wesco 1.4 | 8.0 | 7.1% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.8% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 57.4 | 60.6 | 5 / 35 | 2735 |
| 2 | 4 | 59.8 | 68.3 | 5 / 35 | 3072 |
| 3 | 4 | 59.3 | 65.7 | 5 / 35 | 3116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 30% |
| radnor.DoctorBob 1.42 | 8 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 57% |
| kawigi.nano.Lib 1.0 | 6 | 17% |
| myl.nano.Graviton 1.10 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 0% |

Hadur died in 90 of 105 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 26% | 27 |
| kawigi.nano.Lib 1.0 | 23 | 26% | 24 |
| radnor.DoctorBob 1.42 | 12 | 13% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 11% | 14 |
| myl.nano.Graviton 1.10 | 9 | 10% | 11 |
| stelo.MirrorNano 1.3 | 8 | 9% | 9 |
| squidM.TentalceMeleeNano 1.1 | 4 | 4% | 4 |
| ratosh.Wesco 1.4 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 63.5 | 15 / 105 | 4.29 | 12.9% | 11359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.2% | 23 |
| nz.jdc.nano.GridFu 1.0 | 1.7 | 13.5% | 21 |
| hadur117.nano.SanaroFL 0.1 | 3.3 | 12.9% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.3% | 13 |
| cb.nano.Insomnia 1.0 | 4.7 | 12.1% | 19 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 11.3% | 7 |
| mz.Cork 0.1 | 7.0 | 10.1% | 7 |
| stelo.UntouchableNano 1.3 | 8.3 | 5.7% | 0 |
| stuff.Vlad 0.1 | 8.7 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.4 | 56.8 | 1 / 35 | 3723 |
| 2 | 2 | 61.4 | 68.9 | 5 / 35 | 4060 |
| 3 | 3 | 59.5 | 64.8 | 9 / 35 | 3576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 30% |
| nz.jdc.nano.GridFu 1.0 | 8 | 13% |
| cb.nano.Insomnia 1.0 | 7 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 67% |
| oog.melee.CapuletDroid 1.1 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| mz.Cork 0.1 | 1 | 0% |

Hadur died in 90 of 105 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 20 | 22% | 20 |
| d414.nano.Quantum 1.0.0 | 19 | 21% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 18% | 20 |
| cb.nano.Insomnia 1.0 | 11 | 12% | 11 |
| oog.melee.CapuletDroid 1.1 | 10 | 11% | 13 |
| mz.Cork 0.1 | 8 | 9% | 10 |
| stelo.UntouchableNano 1.3 | 4 | 4% | 4 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.4 | 26 / 105 | 3.57 | 14.1% | 11033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.5% | 34 |
| hadur117.nano.SanaroFL 0.1 | 2.3 | 14.1% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.9% | 18 |
| gh.nano.Grofvuil 0.2 | 4.3 | 12.5% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 12.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 10.2% | 11 |
| baal.nano.N 1.42 | 7.0 | 9.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.0 | 6.3% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 5.0% | 1 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 72.7 | 9 / 35 | 3557 |
| 2 | 3 | 61.4 | 68.6 | 9 / 35 | 3748 |
| 3 | 2 | 62.4 | 73.0 | 8 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 67% |
| d414.nano.Quantum 1.0.0 | 15 | 40% |
| gh.nano.Grofvuil 0.2 | 5 | 20% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 50% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 82 of 105 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 28% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 21% | 32 |
| gh.nano.Grofvuil 0.2 | 16 | 20% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 11 | 13% | 11 |
| djdjdj.NanoSkunk10 1.0 | 9 | 11% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 5% | 4 |
| baal.nano.N 1.42 | 2 | 2% | 2 |

## Melee bench: F09

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.5 | 56.2 | 9 / 105 | 4.94 | 11.0% | 7944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 13.8% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 12.0% | 18 |
| mld.DustBunny 3.8 | 3.0 | 11.6% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 11.7% | 13 |
| wee.Gem 1.8.4 | 4.7 | 10.5% | 15 |
| hadur117.nano.SanaroFL 0.1 | 5.3 | 11.0% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 6.7 | 10.3% | 14 |
| tj.zombie1n 1.0.1 | 8.3 | 7.3% | 6 |
| cs.sheldor.Talon 1.1 | 8.7 | 6.8% | 0 |
| step.nanoPri 1.0 | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 52.7 | 56.5 | 2 / 35 | 2428 |
| 2 | 3 | 58.4 | 63.8 | 6 / 35 | 3211 |
| 3 | 7 | 49.5 | 48.3 | 1 / 35 | 2305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 11 | 45% |
| d414.nano.Quantum 1.0.0 | 5 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 0% |
| wee.Gem 1.8.4 | 3 | 0% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 0% |
| mld.DustBunny 3.8 | 1 | 100% |

Hadur died in 96 of 105 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 25% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 18% | 17 |
| mld.DustBunny 3.8 | 12 | 13% | 15 |
| wee.Gem 1.8.4 | 11 | 11% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 10% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 9% | 8 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 7 |
| tj.zombie1n 1.0.1 | 4 | 4% | 4 |
| step.nanoPri 1.0 | 3 | 3% | 3 |

## Melee bench: F10

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 74.3 | 25 / 105 | 3.31 | 15.0% | 12811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.0% | 27 |
| hadur117.nano.SanaroFL 0.1 | 2.0 | 15.0% | 25 |
| mld.Infinity 2.2 | 3.3 | 14.6% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 14.0% | 20 |
| ayk.WallHugger 1.0 | 6.0 | 8.1% | 2 |
| exauge.GateKeeper 1.1.121g | 6.3 | 8.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 7.4% | 1 |
| conscience.Electron 1.3g | 7.0 | 8.0% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.4% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 70.5 | 10 / 35 | 4291 |
| 2 | 2 | 63.0 | 76.8 | 6 / 35 | 4162 |
| 3 | 2 | 64.0 | 75.6 | 9 / 35 | 4358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 28% |
| mld.Infinity 2.2 | 16 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 55% |
| exauge.GateKeeper 1.1.121g | 4 | 75% |
| robar.nano.Assertive_Melee 0.2 | 3 | 67% |
| ayk.WallHugger 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 33% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 26% | 34 |
| mld.Infinity 2.2 | 14 | 18% | 8 |
| exauge.GateKeeper 1.1.121g | 5 | 6% | 7 |
| conscience.Electron 1.3g | 5 | 6% | 6 |
| robar.nano.Assertive_Melee 0.2 | 4 | 5% | 7 |
| ayk.WallHugger 1.0 | 4 | 5% | 6 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 3 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.7 | 20 / 105 | 3.90 | 13.5% | 10470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.9% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.8% | 21 |
| hadur117.nano.SanaroFL 0.1 | 3.0 | 13.5% | 20 |
| mz.NanoGod 2.02 | 4.3 | 12.1% | 11 |
| oog.melee.Corsair 1.0 | 4.7 | 11.9% | 14 |
| DBall.NUKE 0.1 | 7.0 | 7.8% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.7% | 2 |
| awesomeness.Elite 1.0 | 7.7 | 7.5% | 1 |
| sample.Walls 1.0 | 8.0 | 7.0% | 3 |
| stelo.PianistNano 1.2 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 70.5 | 4 / 35 | 3514 |
| 2 | 3 | 59.5 | 65.4 | 9 / 35 | 3437 |
| 3 | 3 | 59.5 | 67.3 | 7 / 35 | 3519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 36% |
| d414.nano.Quantum 1.0.0 | 12 | 42% |
| sample.Walls 1.0 | 7 | 57% |
| oog.melee.Corsair 1.0 | 5 | 100% |
| mz.NanoGod 2.02 | 3 | 0% |
| DBall.NUKE 0.1 | 2 | 50% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 85 of 105 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 26% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 25% | 25 |
| mz.NanoGod 2.02 | 13 | 15% | 15 |
| zyx.nano.BacillusComma 1.0 | 10 | 12% | 11 |
| oog.melee.Corsair 1.0 | 8 | 9% | 13 |
| sample.Walls 1.0 | 4 | 5% | 5 |
| DBall.NUKE 0.1 | 3 | 4% | 3 |
| awesomeness.Elite 1.0 | 3 | 4% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 71.0 | 24 / 105 | 3.61 | 14.0% | 10067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 36 |
| hadur117.nano.SanaroFL 0.1 | 2.3 | 14.0% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.8% | 14 |
| sul.Lunar 1.1 | 3.7 | 12.1% | 14 |
| myl.nano.KomoriNinja 1.1 | 4.7 | 11.4% | 8 |
| spinnercat.Omen 1.0 | 7.3 | 7.6% | 3 |
| maribo.melee.BMV 0.1 | 7.3 | 7.7% | 1 |
| sample.SpinBot 1.0 | 7.3 | 7.0% | 3 |
| sam.Samspin 1.0 | 8.0 | 7.2% | 1 |
| cvt.Firsty 1.0 | 10.0 | 5.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.0 | 72.1 | 10 / 35 | 3128 |
| 2 | 3 | 58.6 | 66.7 | 5 / 35 | 3332 |
| 3 | 2 | 61.8 | 74.3 | 9 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 54% |
| d414.nano.Quantum 1.0.0 | 12 | 42% |
| sul.Lunar 1.1 | 9 | 67% |
| myl.nano.KomoriNinja 1.1 | 6 | 67% |
| sample.SpinBot 1.0 | 2 | 50% |
| spinnercat.Omen 1.0 | 2 | 0% |
| cvt.Firsty 1.0 | 2 | 0% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 82 of 105 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 26% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 20% | 23 |
| myl.nano.KomoriNinja 1.1 | 14 | 17% | 18 |
| sul.Lunar 1.1 | 8 | 10% | 16 |
| spinnercat.Omen 1.0 | 8 | 10% | 8 |
| cvt.Firsty 1.0 | 4 | 5% | 4 |
| sam.Samspin 1.0 | 4 | 5% | 4 |
| maribo.melee.BMV 0.1 | 3 | 4% | 3 |
| sample.SpinBot 1.0 | 3 | 4% | 3 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.nano.SanaroFL 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.0 | 21 / 105 | 4.06 | 13.1% | 10118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.0 | 14.7% | 26 |
| d414.nano.Quantum 1.0.0 | 2.3 | 13.8% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 10 |
| hadur117.nano.SanaroFL 0.1 | 3.3 | 13.1% | 21 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 8 |
| tvv.nano.Polaris 1.2 | 6.7 | 8.4% | 6 |
| arthord.NanoSatanMelee Beta | 7.3 | 8.3% | 3 |
| amz.NanoClone 1.41 | 7.7 | 8.1% | 1 |
| zyx.nano.Ant 1.1 | 8.3 | 7.8% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.8 | 65.7 | 6 / 35 | 3411 |
| 2 | 2 | 60.5 | 68.9 | 9 / 35 | 3394 |
| 3 | 4 | 57.9 | 63.5 | 6 / 35 | 3313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 77% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 36% |
| d414.nano.Quantum 1.0.0 | 8 | 25% |
| mld.Wisdom 1.0 | 4 | 50% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 85 of 105 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 28% | 29 |
| d414.nano.Quantum 1.0.0 | 19 | 22% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 16% | 23 |
| mld.Wisdom 1.0 | 8 | 9% | 11 |
| amz.NanoClone 1.41 | 7 | 8% | 7 |
| tvv.nano.Polaris 1.2 | 5 | 6% | 6 |
| arthord.NanoSatanMelee Beta | 5 | 6% | 5 |
| zyx.nano.Ant 1.1 | 3 | 4% | 3 |

