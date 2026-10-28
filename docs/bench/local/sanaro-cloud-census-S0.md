# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.0 | 64.4 | 16 / 105 | 4.20 | 12.9% | 10596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.9% | 20 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 12.9% | 16 |
| bzdp.Pansy 2.1 | 4.3 | 12.2% | 13 |
| arthord.NanoSatanMelee Beta | 4.7 | 10.9% | 5 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 5 |
| zyx.nano.Ant 1.1 | 7.0 | 8.2% | 1 |
| fm.claire 1.7 | 8.0 | 7.9% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.4% | 4 |
| arthord.MannyPacquiao Beta | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.9 | 59.4 | 4 / 35 | 3381 |
| 2 | 3 | 58.7 | 62.9 | 5 / 35 | 3639 |
| 3 | 2 | 61.5 | 71.1 | 7 / 35 | 3576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 46% |
| bzdp.Pansy 2.1 | 8 | 50% |
| arthord.NanoSatanMelee Beta | 3 | 67% |
| tvv.nano.Polaris 1.2 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 27% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 18% | 24 |
| bzdp.Pansy 2.1 | 12 | 13% | 16 |
| arthord.NanoSatanMelee Beta | 12 | 13% | 14 |
| fm.claire 1.7 | 12 | 13% | 12 |
| zyx.nano.Ant 1.1 | 7 | 8% | 7 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 69.9 | 10 / 105 | 3.70 | 13.2% | 9043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 29 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 13.2% | 10 |
| simonton.nano.MeleeSeed 1.8 | 3.3 | 12.6% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 16 |
| DBall.Anarchy 0.1 | 5.0 | 10.9% | 14 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.9% | 16 |
| fm.mammillarias 1.3 | 6.7 | 9.4% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.8% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.7% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 70.8 | 1 / 35 | 3125 |
| 2 | 3 | 57.6 | 63.2 | 4 / 35 | 2782 |
| 3 | 2 | 61.9 | 75.9 | 5 / 35 | 3136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 7% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 25% |
| stelo.SoJNanoMelee 1.1 | 6 | 17% |
| simonton.nano.MeleeSeed 1.8 | 6 | 83% |
| DBall.Anarchy 0.1 | 4 | 25% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 95 of 105 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 37% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 16% | 18 |
| simonton.nano.MeleeSeed 1.8 | 14 | 15% | 19 |
| fm.mammillarias 1.3 | 9 | 9% | 9 |
| DBall.Anarchy 0.1 | 8 | 8% | 9 |
| stelo.SoJNanoMelee 1.1 | 8 | 8% | 9 |
| sample.MyFirstRobot 1.0 | 3 | 3% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 3% | 3 |

## Melee bench: F03

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 70.6 | 18 / 105 | 3.65 | 14.2% | 12539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.8% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.1% | 24 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 14.2% | 18 |
| ahf.NanoAndrew .4 | 4.0 | 12.0% | 13 |
| ratosh.Nobo 0.21 | 5.0 | 9.8% | 2 |
| timmit.nano.TimDog 0.33 | 6.3 | 8.7% | 2 |
| stelo.PatternRobot 1.0 | 6.7 | 7.5% | 5 |
| repositorio.NanoStep 1.0 | 8.3 | 6.4% | 4 |
| sample.Crazy 1.0 | 8.7 | 5.6% | 2 |
| kurios.DOSexe .9a | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 74.9 | 6 / 35 | 4462 |
| 2 | 2 | 61.3 | 69.8 | 9 / 35 | 4169 |
| 3 | 3 | 59.6 | 67.0 | 3 / 35 | 3908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 43% |
| d414.nano.Quantum 1.0.0 | 8 | 0% |
| ahf.NanoAndrew .4 | 7 | 29% |
| ratosh.Nobo 0.21 | 3 | 67% |
| stelo.PatternRobot 1.0 | 2 | 50% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 0% |

Hadur died in 87 of 105 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 33% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 23% | 29 |
| ahf.NanoAndrew .4 | 14 | 16% | 16 |
| stelo.PatternRobot 1.0 | 9 | 10% | 10 |
| ratosh.Nobo 0.21 | 8 | 9% | 9 |
| kurios.DOSexe .9a | 4 | 5% | 4 |
| timmit.nano.TimDog 0.33 | 3 | 3% | 5 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 79.9 | 25 / 105 | 2.81 | 16.5% | 16352 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.0% | 41 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 16.5% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.8% | 23 |
| wompi.Quokka 1.6 | 4.0 | 14.1% | 13 |
| maribo.FollowFire 1 | 5.7 | 7.3% | 0 |
| sample.VelociRobot 1.0 | 6.7 | 6.5% | 0 |
| jangs.ns51 1.0 | 6.7 | 6.3% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.0 | 6.4% | 1 |
| kurios.DOSexe .9b | 9.0 | 5.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 76.2 | 6 / 35 | 5608 |
| 2 | 1 | 67.4 | 83.2 | 13 / 35 | 5765 |
| 3 | 3 | 65.2 | 80.3 | 6 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 53% |
| d414.nano.Quantum 1.0.0 | 25 | 8% |
| wompi.Quokka 1.6 | 9 | 56% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 1321. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 35 | 44% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 30% | 41 |
| wompi.Quokka 1.6 | 13 | 16% | 16 |
| maribo.FollowFire 1 | 4 | 5% | 4 |
| jangs.ns51 1.0 | 2 | 3% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 73.9 | 16 / 105 | 3.35 | 14.7% | 13697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.4% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.5% | 22 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 14.7% | 16 |
| ntc.Opposite 1.5 | 4.0 | 11.8% | 4 |
| js.PinBall 1.6 | 5.0 | 11.0% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6.0 | 10.3% | 2 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.2% | 5 |
| sample.Fire 1.0 | 8.3 | 5.0% | 1 |
| PSW.Relentless 0.1 | 8.7 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 71.7 | 6 / 35 | 4876 |
| 2 | 2 | 64.1 | 77.1 | 6 / 35 | 4623 |
| 3 | 3 | 62.0 | 72.7 | 4 / 35 | 4198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 50% |
| sp.Nanos.Ember 1.1 | 5 | 60% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| ntc.Opposite 1.5 | 3 | 33% |
| js.PinBall 1.6 | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 41% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 22% | 29 |
| ntc.Opposite 1.5 | 12 | 13% | 12 |
| js.PinBall 1.6 | 9 | 10% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 7% | 9 |
| sp.Nanos.Ember 1.1 | 4 | 4% | 6 |
| sample.Fire 1.0 | 2 | 2% | 2 |

## Melee bench: F06

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 67.4 | 13 / 105 | 3.93 | 12.7% | 8926 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.7 | 13.8% | 21 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.7% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 15 |
| hadur117.nano.SanaroS0 0.1 | 4.0 | 12.7% | 13 |
| radnor.DoctorBob 1.42 | 4.7 | 12.5% | 17 |
| myl.nano.Graviton 1.10 | 5.7 | 11.6% | 15 |
| stelo.MirrorNano 1.3 | 7.7 | 7.3% | 0 |
| ratosh.Wesco 1.4 | 8.0 | 7.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 67.3 | 5 / 35 | 3384 |
| 2 | 3 | 60.5 | 71.1 | 4 / 35 | 3130 |
| 3 | 5 | 57.2 | 63.8 | 4 / 35 | 2412 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 50% |
| radnor.DoctorBob 1.42 | 7 | 29% |
| d414.nano.Quantum 1.0.0 | 7 | 14% |
| myl.nano.Graviton 1.10 | 6 | 33% |
| kawigi.nano.Lib 1.0 | 5 | 20% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 92 of 105 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 24% | 23 |
| kawigi.nano.Lib 1.0 | 20 | 22% | 22 |
| myl.nano.Graviton 1.10 | 18 | 20% | 20 |
| radnor.DoctorBob 1.42 | 16 | 17% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 10% | 15 |
| stelo.MirrorNano 1.3 | 6 | 7% | 6 |
| ratosh.Wesco 1.4 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 70.9 | 23 / 105 | 3.62 | 14.1% | 11385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 13.8% | 23 |
| nz.jdc.nano.GridFu 1.0 | 2.3 | 14.0% | 15 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 14.1% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.8% | 21 |
| cb.nano.Insomnia 1.0 | 4.3 | 12.3% | 11 |
| oog.melee.CapuletDroid 1.1 | 6.3 | 10.0% | 6 |
| mz.Cork 0.1 | 6.7 | 10.3% | 6 |
| stelo.UntouchableNano 1.3 | 8.0 | 5.2% | 0 |
| stuff.Vlad 0.1 | 9.0 | 4.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 69.2 | 6 / 35 | 3722 |
| 2 | 4 | 58.9 | 66.7 | 6 / 35 | 3317 |
| 3 | 1 | 64.5 | 76.8 | 11 / 35 | 4346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 67% |
| cb.nano.Insomnia 1.0 | 10 | 60% |
| d414.nano.Quantum 1.0.0 | 8 | 0% |
| nz.jdc.nano.GridFu 1.0 | 7 | 43% |
| mz.Cork 0.1 | 4 | 75% |
| oog.melee.CapuletDroid 1.1 | 2 | 100% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 82 of 105 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 24% | 32 |
| d414.nano.Quantum 1.0.0 | 20 | 24% | 21 |
| cb.nano.Insomnia 1.0 | 13 | 16% | 8 |
| nz.jdc.nano.GridFu 1.0 | 12 | 15% | 14 |
| mz.Cork 0.1 | 7 | 9% | 13 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 12 |
| stelo.UntouchableNano 1.3 | 3 | 4% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.2 | 18 / 105 | 3.41 | 14.2% | 11304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.2% | 42 |
| hadur117.nano.SanaroS0 0.1 | 2.0 | 14.2% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.0% | 12 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.5% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.6% | 1 |
| djdjdj.NanoSkunk10 1.0 | 6.0 | 10.3% | 11 |
| baal.nano.N 1.42 | 6.7 | 9.3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.0 | 6.3% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 5.0% | 6 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 73.7 | 6 / 35 | 3911 |
| 2 | 3 | 62.1 | 72.7 | 7 / 35 | 3855 |
| 3 | 2 | 61.7 | 73.3 | 5 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 11% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 47% |
| gh.nano.Grofvuil 0.2 | 8 | 50% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| donjezza.Muncho 1.0 | 2 | 50% |
| baal.nano.N 1.42 | 2 | 50% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 0% |

Hadur died in 87 of 105 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 36% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 21% | 26 |
| gh.nano.Grofvuil 0.2 | 10 | 11% | 14 |
| djdjdj.NanoSkunk10 1.0 | 9 | 10% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 7 |
| baal.nano.N 1.42 | 5 | 6% | 6 |
| donjezza.Muncho 1.0 | 4 | 5% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 3% | 3 |

## Melee bench: F09

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 65.9 | 17 / 105 | 4.07 | 12.9% | 8983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 13.3% | 18 |
| hadur117.nano.SanaroS0 0.1 | 2.3 | 12.9% | 17 |
| mld.DustBunny 3.8 | 3.7 | 11.6% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.0 | 12.0% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 11.3% | 5 |
| wee.Gem 1.8.4 | 5.7 | 10.4% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 6.7 | 10.0% | 8 |
| tj.zombie1n 1.0.1 | 8.7 | 6.4% | 7 |
| cs.sheldor.Talon 1.1 | 9.0 | 6.3% | 1 |
| step.nanoPri 1.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 60.5 | 72.4 | 8 / 35 | 3026 |
| 2 | 2 | 57.4 | 64.8 | 5 / 35 | 2949 |
| 3 | 4 | 55.6 | 60.6 | 4 / 35 | 3008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 10 | 20% |
| d414.nano.Quantum 1.0.0 | 6 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 60% |
| mld.DustBunny 3.8 | 5 | 60% |
| tj.zombie1n 1.0.1 | 5 | 20% |
| wee.Gem 1.8.4 | 4 | 75% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 50% |

Hadur died in 88 of 105 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 25 | 28% | 25 |
| d414.nano.Quantum 1.0.0 | 16 | 18% | 19 |
| mld.DustBunny 3.8 | 13 | 15% | 17 |
| wee.Gem 1.8.4 | 10 | 11% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 10% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 8% | 12 |
| tj.zombie1n 1.0.1 | 5 | 6% | 4 |
| step.nanoPri 1.0 | 2 | 2% | 2 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 2 |

## Melee bench: F10

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 74.6 | 18 / 105 | 3.29 | 14.8% | 12891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.2% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.0% | 23 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 14.8% | 18 |
| mld.Infinity 2.2 | 3.3 | 14.4% | 30 |
| robar.nano.Assertive_Melee 0.2 | 6.0 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.9% | 1 |
| conscience.Electron 1.3g | 6.7 | 7.6% | 0 |
| ayk.WallHugger 1.0 | 7.3 | 7.2% | 3 |
| donjezza.Jezza 1.0 | 8.7 | 5.7% | 2 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.8 | 71.7 | 4 / 35 | 4851 |
| 2 | 3 | 61.2 | 71.4 | 5 / 35 | 4057 |
| 3 | 1 | 64.2 | 80.6 | 9 / 35 | 3983 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 23 | 48% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 29% |
| d414.nano.Quantum 1.0.0 | 13 | 8% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 87 of 105 rounds, at a mean tick of 1253. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 31% | 41 |
| d414.nano.Quantum 1.0.0 | 25 | 29% | 36 |
| mld.Infinity 2.2 | 17 | 20% | 5 |
| robar.nano.Assertive_Melee 0.2 | 8 | 9% | 8 |
| conscience.Electron 1.3g | 6 | 7% | 8 |
| ayk.WallHugger 1.0 | 2 | 2% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.9 | 13 / 105 | 3.98 | 13.1% | 10557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.4% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.2% | 21 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.1% | 13 |
| oog.melee.Corsair 1.0 | 3.3 | 12.7% | 12 |
| mz.NanoGod 2.02 | 5.0 | 11.0% | 12 |
| DBall.NUKE 0.1 | 6.0 | 8.5% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 7.2% | 0 |
| awesomeness.Elite 1.0 | 8.3 | 7.0% | 3 |
| sample.Walls 1.0 | 8.7 | 6.3% | 4 |
| stelo.PianistNano 1.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 69.5 | 5 / 35 | 3458 |
| 2 | 3 | 58.9 | 65.4 | 3 / 35 | 3661 |
| 3 | 3 | 58.6 | 65.7 | 5 / 35 | 3438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 13% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 60% |
| oog.melee.Corsair 1.0 | 5 | 60% |
| mz.NanoGod 2.02 | 2 | 50% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 92 of 105 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 35% | 35 |
| mz.NanoGod 2.02 | 20 | 22% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 15% | 20 |
| oog.melee.Corsair 1.0 | 8 | 9% | 11 |
| zyx.nano.BacillusComma 1.0 | 6 | 7% | 6 |
| DBall.NUKE 0.1 | 4 | 4% | 5 |
| awesomeness.Elite 1.0 | 4 | 4% | 4 |
| sample.Walls 1.0 | 3 | 3% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 3 battles (2.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 68.1 | 19 / 105 | 3.87 | 13.5% | 10236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.1% | 42 |
| hadur117.nano.SanaroS0 0.1 | 1.7 | 13.5% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 12.7% | 9 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 10.9% | 8 |
| sul.Lunar 1.1 | 4.7 | 10.7% | 11 |
| sam.Samspin 1.0 | 6.3 | 8.8% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.6% | 1 |
| sample.SpinBot 1.0 | 8.0 | 7.8% | 4 |
| spinnercat.Omen 1.0 | 8.7 | 7.5% | 4 |
| cvt.Firsty 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.4 | 66.3 | 6 / 35 | 3394 |
| 2 | 1 | 60.6 | 72.4 | 7 / 35 | 3440 |
| 3 | 2 | 59.1 | 65.7 | 6 / 35 | 3402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 16 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 67% |
| sul.Lunar 1.1 | 9 | 67% |
| myl.nano.KomoriNinja 1.1 | 4 | 25% |
| sam.Samspin 1.0 | 3 | 33% |
| sample.SpinBot 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 86 of 105 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 32 | 37% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 16% | 22 |
| myl.nano.KomoriNinja 1.1 | 12 | 14% | 13 |
| sample.SpinBot 1.0 | 6 | 7% | 8 |
| maribo.melee.BMV 0.1 | 6 | 7% | 7 |
| sul.Lunar 1.1 | 5 | 6% | 11 |
| sam.Samspin 1.0 | 5 | 6% | 6 |
| spinnercat.Omen 1.0 | 5 | 6% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 67.1 | 15 / 105 | 3.96 | 13.0% | 10278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.7 | 14.4% | 26 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.4% | 31 |
| hadur117.nano.SanaroS0 0.1 | 3.3 | 13.0% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.3% | 13 |
| mld.Wisdom 1.0 | 4.7 | 11.0% | 8 |
| amz.NanoClone 1.41 | 6.3 | 8.6% | 2 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.3% | 6 |
| arthord.NanoSatanMelee Beta | 8.0 | 7.4% | 1 |
| zyx.nano.Ant 1.1 | 8.3 | 7.9% | 3 |
| arthord.MannyPacquiao Beta | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 67.0 | 7 / 35 | 3558 |
| 2 | 3 | 58.7 | 67.3 | 5 / 35 | 3369 |
| 3 | 4 | 58.6 | 67.0 | 3 / 35 | 3351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 20% |
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| zyx.nano.Ant 1.1 | 4 | 50% |
| mld.Wisdom 1.0 | 3 | 67% |
| tvv.nano.Polaris 1.2 | 1 | 0% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 24 | 27% | 24 |
| d414.nano.Quantum 1.0.0 | 21 | 23% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 17% | 23 |
| mld.Wisdom 1.0 | 10 | 11% | 10 |
| amz.NanoClone 1.41 | 7 | 8% | 8 |
| zyx.nano.Ant 1.1 | 7 | 8% | 8 |
| arthord.NanoSatanMelee Beta | 4 | 4% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 4 |

