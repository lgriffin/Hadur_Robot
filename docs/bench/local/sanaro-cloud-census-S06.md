# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 71.0 | 36 / 105 | 3.61 | 14.6% | 10893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.1% | 40 |
| hadur117.nano.SanaroS06 0.1 | 1.7 | 14.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 10 |
| bzdp.Pansy 2.1 | 3.7 | 12.4% | 9 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.4% | 6 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.7% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 8.2% | 0 |
| fm.claire 1.7 | 7.7 | 8.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.3% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 67.9 | 14 / 35 | 3939 |
| 2 | 2 | 61.6 | 71.1 | 8 / 35 | 3414 |
| 3 | 1 | 62.8 | 74.0 | 14 / 35 | 3540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 80% |
| bzdp.Pansy 2.1 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 69 of 105 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 30% | 32 |
| bzdp.Pansy 2.1 | 13 | 19% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 16% | 24 |
| tvv.nano.Polaris 1.2 | 7 | 10% | 7 |
| arthord.NanoSatanMelee Beta | 7 | 10% | 7 |
| fm.claire 1.7 | 5 | 7% | 6 |
| zyx.nano.Ant 1.1 | 3 | 4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 4 |

## Melee bench: F02

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 72.9 | 21 / 105 | 3.44 | 14.1% | 9447 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS06 0.1 | 1.3 | 14.1% | 21 |
| d414.nano.Quantum 1.0.0 | 1.7 | 14.9% | 28 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 12.5% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.8% | 12 |
| DBall.Anarchy 0.1 | 5.3 | 10.5% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 9.3% | 15 |
| fm.mammillarias 1.3 | 6.7 | 9.1% | 0 |
| sample.MyFirstRobot 1.0 | 7.7 | 7.8% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 75.9 | 9 / 35 | 3106 |
| 2 | 1 | 61.8 | 74.6 | 8 / 35 | 3607 |
| 3 | 2 | 59.8 | 68.3 | 4 / 35 | 2734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 36% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 83% |
| DBall.Anarchy 0.1 | 5 | 40% |
| simonton.nano.MeleeSeed 1.8 | 4 | 25% |
| stelo.SoJNanoMelee 1.1 | 3 | 67% |
| sample.MyFirstRobot 1.0 | 3 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 84 of 105 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 26% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 21% | 28 |
| simonton.nano.MeleeSeed 1.8 | 12 | 14% | 13 |
| sample.MyFirstRobot 1.0 | 8 | 10% | 8 |
| stelo.SoJNanoMelee 1.1 | 7 | 8% | 8 |
| fm.mammillarias 1.3 | 7 | 8% | 7 |
| DBall.Anarchy 0.1 | 6 | 7% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 4% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F03

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 71.0 | 26 / 105 | 3.61 | 14.5% | 12542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.1% | 33 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 14.5% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.3% | 12 |
| ahf.NanoAndrew .4 | 3.7 | 13.1% | 21 |
| ratosh.Nobo 0.21 | 5.3 | 9.8% | 2 |
| timmit.nano.TimDog 0.33 | 5.7 | 8.8% | 3 |
| stelo.PatternRobot 1.0 | 7.3 | 7.1% | 1 |
| sample.Crazy 1.0 | 8.3 | 6.4% | 2 |
| repositorio.NanoStep 1.0 | 8.3 | 6.7% | 5 |
| kurios.DOSexe .9a | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 70.5 | 8 / 35 | 4319 |
| 2 | 3 | 61.4 | 68.3 | 9 / 35 | 4192 |
| 3 | 2 | 62.6 | 74.3 | 9 / 35 | 4031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 93% |
| d414.nano.Quantum 1.0.0 | 15 | 33% |
| ahf.NanoAndrew .4 | 8 | 50% |
| sample.Crazy 1.0 | 2 | 50% |
| ratosh.Nobo 0.21 | 2 | 50% |
| repositorio.NanoStep 1.0 | 1 | 0% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 79 of 105 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 23 | 29% | 28 |
| ahf.NanoAndrew .4 | 19 | 24% | 23 |
| ratosh.Nobo 0.21 | 8 | 10% | 8 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 9% | 21 |
| timmit.nano.TimDog 0.33 | 7 | 9% | 8 |
| repositorio.NanoStep 1.0 | 6 | 8% | 6 |
| stelo.PatternRobot 1.0 | 4 | 5% | 6 |
| sample.Crazy 1.0 | 4 | 5% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

## Melee bench: F04

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.9 | 33 / 105 | 2.90 | 16.3% | 15175 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.8% | 45 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 16.3% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.2% | 12 |
| wompi.Quokka 1.6 | 4.0 | 13.3% | 9 |
| kurios.DOSexe .9b | 5.0 | 7.6% | 0 |
| maribo.FollowFire 1 | 7.0 | 6.8% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.3 | 6.6% | 1 |
| sample.VelociRobot 1.0 | 7.7 | 6.4% | 3 |
| jangs.ns51 1.0 | 8.0 | 6.1% | 2 |
| drd.Dreadknoght 0.9 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 81.9 | 12 / 35 | 4825 |
| 2 | 3 | 63.8 | 72.7 | 9 / 35 | 4769 |
| 3 | 2 | 67.1 | 82.2 | 12 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 23% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 92% |
| wompi.Quokka 1.6 | 4 | 75% |
| sample.VelociRobot 1.0 | 1 | 0% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 72 of 105 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 50% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 22% | 38 |
| wompi.Quokka 1.6 | 14 | 19% | 17 |
| maribo.FollowFire 1 | 2 | 3% | 2 |
| sample.VelociRobot 1.0 | 2 | 3% | 2 |
| kurios.DOSexe .9b | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.8 | 34 / 105 | 3.18 | 15.8% | 14511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.7% | 38 |
| hadur117.nano.SanaroS06 0.1 | 1.7 | 15.8% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.1% | 14 |
| ntc.Opposite 1.5 | 4.3 | 11.4% | 4 |
| js.PinBall 1.6 | 5.3 | 11.1% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 11.0% | 6 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.7% | 4 |
| sample.Fire 1.0 | 8.0 | 4.8% | 1 |
| PSW.Relentless 0.1 | 9.3 | 3.9% | 0 |
| sample.Target 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 72.1 | 10 / 35 | 4613 |
| 2 | 2 | 65.5 | 77.5 | 12 / 35 | 4813 |
| 3 | 1 | 65.4 | 77.8 | 12 / 35 | 5085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 88% |
| js.PinBall 1.6 | 4 | 100% |
| ntc.Opposite 1.5 | 4 | 50% |
| sp.Nanos.Ember 1.1 | 4 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 71 of 105 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 37% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 15% | 27 |
| js.PinBall 1.6 | 10 | 14% | 14 |
| ntc.Opposite 1.5 | 10 | 14% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 11% | 9 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 5 |
| PSW.Relentless 0.1 | 2 | 3% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 68.4 | 21 / 105 | 3.85 | 13.5% | 10125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 2.0 | 14.5% | 21 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 25 |
| hadur117.nano.SanaroS06 0.1 | 3.0 | 13.5% | 21 |
| radnor.DoctorBob 1.42 | 3.3 | 13.1% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.7 | 12.0% | 8 |
| myl.nano.Graviton 1.10 | 6.0 | 10.7% | 10 |
| stelo.MirrorNano 1.3 | 7.7 | 7.3% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.9% | 0 |
| ratosh.Wesco 1.4 | 8.3 | 7.2% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.0 | 65.7 | 7 / 35 | 3090 |
| 2 | 5 | 58.0 | 62.5 | 4 / 35 | 2971 |
| 3 | 1 | 64.3 | 76.8 | 10 / 35 | 4064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 11 | 36% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 100% |
| kawigi.nano.Lib 1.0 | 9 | 56% |
| radnor.DoctorBob 1.42 | 4 | 0% |
| myl.nano.Graviton 1.10 | 2 | 0% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 84 of 105 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 24% | 20 |
| kawigi.nano.Lib 1.0 | 19 | 23% | 24 |
| d414.nano.Quantum 1.0.0 | 19 | 23% | 23 |
| myl.nano.Graviton 1.10 | 9 | 11% | 9 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 10% | 19 |
| ratosh.Wesco 1.4 | 4 | 5% | 5 |
| squidM.TentalceMeleeNano 1.1 | 3 | 4% | 3 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 66.5 | 23 / 105 | 4.02 | 13.3% | 10662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.3% | 26 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 13.3% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.9% | 20 |
| cb.nano.Insomnia 1.0 | 4.0 | 12.1% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 11.8% | 13 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 11.1% | 7 |
| mz.Cork 0.1 | 6.7 | 10.7% | 4 |
| stuff.Vlad 0.1 | 8.3 | 5.2% | 0 |
| stelo.UntouchableNano 1.3 | 8.7 | 4.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 62.5 | 3 / 35 | 3403 |
| 2 | 2 | 61.1 | 69.5 | 9 / 35 | 3647 |
| 3 | 2 | 61.3 | 67.3 | 11 / 35 | 3612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 90% |
| d414.nano.Quantum 1.0.0 | 8 | 25% |
| cb.nano.Insomnia 1.0 | 7 | 71% |
| oog.melee.CapuletDroid 1.1 | 5 | 80% |
| nz.jdc.nano.GridFu 1.0 | 5 | 60% |
| stelo.UntouchableNano 1.3 | 1 | 0% |
| mz.Cork 0.1 | 1 | 0% |

Hadur died in 82 of 105 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 24% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 23% | 30 |
| oog.melee.CapuletDroid 1.1 | 12 | 15% | 15 |
| nz.jdc.nano.GridFu 1.0 | 9 | 11% | 12 |
| cb.nano.Insomnia 1.0 | 9 | 11% | 7 |
| mz.Cork 0.1 | 5 | 6% | 6 |
| stelo.UntouchableNano 1.3 | 3 | 4% | 4 |
| sample.TrackFire 1.0 | 3 | 4% | 3 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |

## Melee bench: F08

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 75.3 | 36 / 105 | 3.22 | 15.1% | 11193 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.7% | 34 |
| hadur117.nano.SanaroS06 0.1 | 1.7 | 15.1% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.7% | 7 |
| gh.nano.Grofvuil 0.2 | 4.3 | 11.8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.7 | 11.0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 10.6% | 9 |
| baal.nano.N 1.42 | 7.0 | 9.7% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.2% | 4 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 70.2 | 12 / 35 | 3682 |
| 2 | 2 | 62.2 | 74.6 | 8 / 35 | 3355 |
| 3 | 1 | 66.1 | 81.3 | 16 / 35 | 4156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 95% |
| d414.nano.Quantum 1.0.0 | 16 | 44% |
| djdjdj.NanoSkunk10 1.0 | 6 | 83% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 69 of 105 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 35% | 32 |
| gh.nano.Grofvuil 0.2 | 11 | 16% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 13% | 28 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 13% | 9 |
| baal.nano.N 1.42 | 7 | 10% | 9 |
| djdjdj.NanoSkunk10 1.0 | 5 | 7% | 9 |
| donjezza.Muncho 1.0 | 2 | 3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 2 |

## Melee bench: F09

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.5 | 53.1 | 10 / 105 | 5.22 | 10.6% | 8404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.3 | 12.3% | 17 |
| mld.DustBunny 3.8 | 2.7 | 12.5% | 12 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 22 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.4% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4.3 | 11.5% | 18 |
| hadur117.nano.SanaroS06 0.1 | 5.7 | 10.6% | 10 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6.3 | 10.3% | 5 |
| cs.sheldor.Talon 1.1 | 8.0 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 9.0 | 6.7% | 6 |
| step.nanoPri 1.0 | 10.0 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.5 | 55.2 | 2 / 35 | 2973 |
| 2 | 5 | 54.5 | 57.8 | 6 / 35 | 2757 |
| 3 | 7 | 49.6 | 46.3 | 2 / 35 | 2674 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 7 | 29% |
| wee.Gem 1.8.4 | 6 | 17% |
| mld.DustBunny 3.8 | 4 | 75% |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1 | 100% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |

Hadur died in 95 of 105 rounds, at a mean tick of 548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wee.Gem 1.8.4 | 18 | 19% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 17 | 18% | 17 |
| mld.DustBunny 3.8 | 16 | 17% | 19 |
| d414.nano.Quantum 1.0.0 | 13 | 14% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 13% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 7 | 7% | 7 |
| tj.zombie1n 1.0.1 | 2 | 2% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 3 battles (2.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 76.4 | 27 / 105 | 3.12 | 15.3% | 12838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS06 0.1 | 1.7 | 15.3% | 27 |
| d414.nano.Quantum 1.0.0 | 1.7 | 16.0% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 14.5% | 13 |
| mld.Infinity 2.2 | 3.3 | 13.7% | 28 |
| robar.nano.Assertive_Melee 0.2 | 5.0 | 8.4% | 2 |
| ayk.WallHugger 1.0 | 6.3 | 7.8% | 4 |
| conscience.Electron 1.3g | 7.3 | 7.3% | 0 |
| exauge.GateKeeper 1.1.121g | 7.3 | 7.2% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 80.0 | 14 / 35 | 4490 |
| 2 | 2 | 63.0 | 75.2 | 6 / 35 | 4066 |
| 3 | 2 | 62.7 | 74.0 | 7 / 35 | 4282 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 32% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 89% |
| mld.Infinity 2.2 | 10 | 30% |
| donjezza.Jezza 1.0 | 1 | 0% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 78 of 105 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 38% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 22% | 37 |
| mld.Infinity 2.2 | 14 | 18% | 6 |
| conscience.Electron 1.3g | 5 | 6% | 5 |
| robar.nano.Assertive_Melee 0.2 | 4 | 5% | 5 |
| ayk.WallHugger 1.0 | 4 | 5% | 5 |
| donjezza.Jezza 1.0 | 2 | 3% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 3% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.6 | 21 / 105 | 4.01 | 13.5% | 11010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.9% | 25 |
| oog.melee.Corsair 1.0 | 2.3 | 13.8% | 24 |
| hadur117.nano.SanaroS06 0.1 | 2.7 | 13.5% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.3% | 13 |
| mz.NanoGod 2.02 | 4.7 | 11.7% | 11 |
| DBall.NUKE 0.1 | 6.7 | 7.9% | 4 |
| awesomeness.Elite 1.0 | 7.3 | 7.2% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 7.5% | 2 |
| sample.Walls 1.0 | 8.3 | 7.0% | 4 |
| stelo.PianistNano 1.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.6 | 68.6 | 5 / 35 | 3371 |
| 2 | 3 | 58.8 | 63.8 | 8 / 35 | 3665 |
| 3 | 3 | 60.8 | 67.3 | 8 / 35 | 3974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 21% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 100% |
| oog.melee.Corsair 1.0 | 5 | 40% |
| mz.NanoGod 2.02 | 4 | 25% |
| sample.Walls 1.0 | 2 | 50% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 84 of 105 rounds, at a mean tick of 650. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 31% | 29 |
| mz.NanoGod 2.02 | 18 | 21% | 18 |
| oog.melee.Corsair 1.0 | 16 | 19% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 12% | 24 |
| awesomeness.Elite 1.0 | 4 | 5% | 4 |
| zyx.nano.BacillusComma 1.0 | 4 | 5% | 4 |
| sample.Walls 1.0 | 4 | 5% | 3 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.4 | 25 / 105 | 4.11 | 13.4% | 10537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.6% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.1% | 9 |
| hadur117.nano.SanaroS06 0.1 | 2.7 | 13.4% | 25 |
| myl.nano.KomoriNinja 1.1 | 4.0 | 11.2% | 8 |
| sul.Lunar 1.1 | 4.3 | 11.3% | 16 |
| spinnercat.Omen 1.0 | 6.3 | 8.5% | 4 |
| maribo.melee.BMV 0.1 | 7.0 | 8.0% | 1 |
| sam.Samspin 1.0 | 8.0 | 7.9% | 4 |
| sample.SpinBot 1.0 | 8.7 | 7.0% | 3 |
| cvt.Firsty 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.7 | 60.6 | 4 / 35 | 3255 |
| 2 | 2 | 59.6 | 65.1 | 10 / 35 | 3594 |
| 3 | 2 | 61.3 | 70.5 | 11 / 35 | 3688 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 100% |
| sul.Lunar 1.1 | 11 | 64% |
| d414.nano.Quantum 1.0.0 | 10 | 30% |
| spinnercat.Omen 1.0 | 2 | 0% |
| sam.Samspin 1.0 | 2 | 50% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 80 of 105 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 23% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 20% | 29 |
| sul.Lunar 1.1 | 10 | 13% | 17 |
| spinnercat.Omen 1.0 | 9 | 11% | 9 |
| myl.nano.KomoriNinja 1.1 | 8 | 10% | 10 |
| sam.Samspin 1.0 | 7 | 9% | 7 |
| maribo.melee.BMV 0.1 | 5 | 6% | 5 |
| sample.SpinBot 1.0 | 4 | 5% | 4 |
| cvt.Firsty 1.0 | 3 | 4% | 3 |

## Melee bench: F13

hadur117.nano.SanaroS06 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 66.9 | 25 / 105 | 3.98 | 13.1% | 9479 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.7 | 14.0% | 26 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.5% | 33 |
| hadur117.nano.SanaroS06 0.1 | 2.3 | 13.1% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 11.7% | 5 |
| mld.Wisdom 1.0 | 4.7 | 11.1% | 7 |
| tvv.nano.Polaris 1.2 | 6.7 | 8.6% | 4 |
| arthord.NanoSatanMelee Beta | 7.3 | 8.1% | 3 |
| zyx.nano.Ant 1.1 | 8.0 | 8.0% | 1 |
| amz.NanoClone 1.41 | 8.0 | 8.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.8 | 65.1 | 5 / 35 | 3302 |
| 2 | 3 | 58.7 | 67.3 | 7 / 35 | 2915 |
| 3 | 1 | 59.7 | 68.3 | 13 / 35 | 3262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 94% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 33% |
| d414.nano.Quantum 1.0.0 | 10 | 10% |
| tvv.nano.Polaris 1.2 | 3 | 0% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 0% |
| mld.Wisdom 1.0 | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 608. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 23% | 22 |
| d414.nano.Quantum 1.0.0 | 18 | 23% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 15% | 26 |
| mld.Wisdom 1.0 | 10 | 13% | 13 |
| zyx.nano.Ant 1.1 | 7 | 9% | 8 |
| amz.NanoClone 1.41 | 6 | 8% | 6 |
| arthord.NanoSatanMelee Beta | 4 | 5% | 6 |
| tvv.nano.Polaris 1.2 | 4 | 5% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

