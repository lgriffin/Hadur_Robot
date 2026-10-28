# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 58.1 | 14 / 105 | 4.77 | 12.0% | 10390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.6% | 37 |
| bzdp.Pansy 2.1 | 2.3 | 13.5% | 11 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.2% | 21 |
| hadur117.nano.SanaroB1000 0.1 | 4.0 | 12.0% | 14 |
| zyx.nano.Ant 1.1 | 6.3 | 9.4% | 2 |
| arthord.NanoSatanMelee Beta | 6.3 | 8.8% | 1 |
| tvv.nano.Polaris 1.2 | 6.7 | 9.0% | 10 |
| fm.claire 1.7 | 7.0 | 8.3% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 6.3% | 5 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.0 | 58.7 | 5 / 35 | 3557 |
| 2 | 4 | 58.2 | 64.1 | 6 / 35 | 3343 |
| 3 | 4 | 54.4 | 51.4 | 3 / 35 | 3490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 29% |
| d414.nano.Quantum 1.0.0 | 5 | 80% |
| bzdp.Pansy 2.1 | 5 | 80% |
| fm.claire 1.7 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 91 of 105 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 25% | 24 |
| bzdp.Pansy 2.1 | 20 | 22% | 24 |
| d414.nano.Quantum 1.0.0 | 14 | 15% | 19 |
| fm.claire 1.7 | 10 | 11% | 10 |
| tvv.nano.Polaris 1.2 | 9 | 10% | 9 |
| arthord.NanoSatanMelee Beta | 5 | 5% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 7 |
| zyx.nano.Ant 1.1 | 3 | 3% | 4 |
| arthord.MannyPacquiao Beta | 3 | 3% | 3 |

## Melee bench: F02

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 72.6 | 23 / 105 | 3.47 | 14.7% | 11318 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 22 |
| hadur117.nano.SanaroB1000 0.1 | 1.7 | 14.7% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 13.2% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 11.6% | 19 |
| DBall.Anarchy 0.1 | 5.3 | 10.3% | 13 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.1% | 15 |
| fm.mammillarias 1.3 | 6.7 | 9.4% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 7.1% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 71.4 | 7 / 35 | 4003 |
| 2 | 2 | 61.8 | 71.4 | 7 / 35 | 3387 |
| 3 | 1 | 63.8 | 74.9 | 9 / 35 | 3928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 88% |
| stelo.SoJNanoMelee 1.1 | 7 | 43% |
| simonton.nano.MeleeSeed 1.8 | 6 | 33% |
| DBall.Anarchy 0.1 | 4 | 25% |

Hadur died in 83 of 105 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 28 | 34% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 20% | 25 |
| simonton.nano.MeleeSeed 1.8 | 15 | 18% | 17 |
| stelo.SoJNanoMelee 1.1 | 8 | 10% | 10 |
| DBall.Anarchy 0.1 | 7 | 8% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 4% | 3 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 56.1 | 10 / 105 | 4.95 | 11.8% | 11554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.6% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.7% | 13 |
| hadur117.nano.SanaroB1000 0.1 | 3.7 | 11.8% | 10 |
| ratosh.Nobo 0.21 | 4.0 | 12.1% | 7 |
| ahf.NanoAndrew .4 | 4.0 | 12.1% | 13 |
| timmit.nano.TimDog 0.33 | 6.0 | 10.0% | 7 |
| stelo.PatternRobot 1.0 | 7.0 | 8.2% | 11 |
| sample.Crazy 1.0 | 8.3 | 6.2% | 4 |
| repositorio.NanoStep 1.0 | 8.7 | 6.2% | 3 |
| kurios.DOSexe .9a | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.3 | 57.8 | 3 / 35 | 3760 |
| 2 | 2 | 59.1 | 61.0 | 5 / 35 | 4294 |
| 3 | 5 | 53.5 | 49.5 | 2 / 35 | 3500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 56% |
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| stelo.PatternRobot 1.0 | 4 | 0% |
| ahf.NanoAndrew .4 | 3 | 0% |
| timmit.nano.TimDog 0.33 | 1 | 0% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 95 of 105 rounds, at a mean tick of 538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 27% | 30 |
| ahf.NanoAndrew .4 | 24 | 25% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 15% | 19 |
| stelo.PatternRobot 1.0 | 12 | 13% | 12 |
| timmit.nano.TimDog 0.33 | 9 | 9% | 9 |
| ratosh.Nobo 0.21 | 5 | 5% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 3 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |

## Melee bench: F04

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 73.5 | 22 / 105 | 3.38 | 15.5% | 15812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.9% | 35 |
| hadur117.nano.SanaroB1000 0.1 | 2.7 | 15.5% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 15.7% | 25 |
| wompi.Quokka 1.6 | 3.3 | 15.0% | 19 |
| maribo.FollowFire 1 | 5.7 | 7.9% | 0 |
| kurios.DOSexe .9b | 6.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.8% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.3 | 6.1% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 5.4% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 72.1 | 6 / 35 | 5231 |
| 2 | 2 | 65.9 | 76.5 | 9 / 35 | 5610 |
| 3 | 3 | 63.7 | 72.1 | 7 / 35 | 4971 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 52% |
| d414.nano.Quantum 1.0.0 | 16 | 44% |
| wompi.Quokka 1.6 | 10 | 40% |

Hadur died in 83 of 105 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 33% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 27% | 31 |
| wompi.Quokka 1.6 | 22 | 27% | 27 |
| sample.MyFirstJuniorRobot 1.0 | 4 | 5% | 4 |
| kurios.DOSexe .9b | 3 | 4% | 3 |
| maribo.FollowFire 1 | 2 | 2% | 2 |
| sample.VelociRobot 1.0 | 2 | 2% | 1 |
| jangs.ns51 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 71.1 | 15 / 105 | 3.60 | 14.7% | 15108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 18.1% | 51 |
| hadur117.nano.SanaroB1000 0.1 | 2.3 | 14.7% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.8% | 22 |
| ntc.Opposite 1.5 | 4.0 | 11.6% | 5 |
| js.PinBall 1.6 | 5.3 | 10.9% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.4% | 4 |
| sp.Nanos.Ember 1.1 | 7.0 | 6.8% | 4 |
| PSW.Relentless 0.1 | 8.3 | 4.7% | 0 |
| sample.Fire 1.0 | 8.7 | 4.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 68.6 | 5 / 35 | 5154 |
| 2 | 2 | 63.4 | 71.7 | 5 / 35 | 4896 |
| 3 | 3 | 63.6 | 73.0 | 5 / 35 | 5058 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 12 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 70% |
| sp.Nanos.Ember 1.1 | 3 | 67% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| js.PinBall 1.6 | 3 | 0% |
| ntc.Opposite 1.5 | 2 | 50% |

Hadur died in 92 of 105 rounds, at a mean tick of 676. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 33% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 25% | 30 |
| js.PinBall 1.6 | 14 | 15% | 15 |
| ntc.Opposite 1.5 | 11 | 12% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 10% | 10 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 3 battles (1.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 60.3 | 10 / 105 | 4.57 | 12.1% | 9928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.5% | 28 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.7% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.6% | 13 |
| radnor.DoctorBob 1.42 | 4.0 | 12.6% | 16 |
| hadur117.nano.SanaroB1000 0.1 | 4.7 | 12.1% | 10 |
| myl.nano.Graviton 1.10 | 5.7 | 11.3% | 15 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.3% | 2 |
| stelo.MirrorNano 1.3 | 8.0 | 7.5% | 2 |
| ratosh.Wesco 1.4 | 8.3 | 7.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.5 | 66.3 | 4 / 35 | 3752 |
| 2 | 5 | 58.1 | 61.0 | 3 / 35 | 3203 |
| 3 | 6 | 54.7 | 53.7 | 3 / 35 | 2973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 50% |
| kawigi.nano.Lib 1.0 | 8 | 38% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 17% |
| radnor.DoctorBob 1.42 | 4 | 25% |
| myl.nano.Graviton 1.10 | 3 | 0% |
| stelo.MirrorNano 1.3 | 1 | 0% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 96 of 105 rounds, at a mean tick of 599. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 22% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 21% | 22 |
| kawigi.nano.Lib 1.0 | 16 | 17% | 19 |
| radnor.DoctorBob 1.42 | 14 | 15% | 14 |
| myl.nano.Graviton 1.10 | 11 | 11% | 11 |
| squidM.TentalceMeleeNano 1.1 | 7 | 7% | 7 |
| ratosh.Wesco 1.4 | 4 | 4% | 4 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |

## Melee bench: F07

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 60.5 | 12 / 105 | 4.55 | 12.7% | 12127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.3 | 14.0% | 25 |
| hadur117.nano.SanaroB1000 0.1 | 2.7 | 12.7% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 13.1% | 19 |
| cb.nano.Insomnia 1.0 | 3.7 | 12.6% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 16 |
| oog.melee.CapuletDroid 1.1 | 5.7 | 11.2% | 12 |
| mz.Cork 0.1 | 7.0 | 10.4% | 2 |
| stuff.Vlad 0.1 | 8.3 | 5.6% | 0 |
| stelo.UntouchableNano 1.3 | 8.7 | 5.3% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.2 | 58.1 | 3 / 35 | 3722 |
| 2 | 2 | 60.7 | 62.9 | 8 / 35 | 4319 |
| 3 | 3 | 58.6 | 60.6 | 1 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 6 | 83% |
| d414.nano.Quantum 1.0.0 | 5 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4 | 100% |
| nz.jdc.nano.GridFu 1.0 | 4 | 25% |
| oog.melee.CapuletDroid 1.1 | 3 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |
| cb.nano.Insomnia 1.0 | 1 | 0% |

Hadur died in 93 of 105 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 21 | 23% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 20 |
| oog.melee.CapuletDroid 1.1 | 15 | 16% | 15 |
| d414.nano.Quantum 1.0.0 | 14 | 15% | 16 |
| cb.nano.Insomnia 1.0 | 12 | 13% | 12 |
| mz.Cork 0.1 | 11 | 12% | 14 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.1 | 18 / 105 | 4.05 | 13.8% | 12996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.4% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.7% | 23 |
| hadur117.nano.SanaroB1000 0.1 | 3.0 | 13.8% | 18 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.5% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 10.3% | 1 |
| baal.nano.N 1.42 | 6.0 | 10.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 9.7% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.5% | 4 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 67.3 | 7 / 35 | 4418 |
| 2 | 3 | 61.0 | 64.8 | 6 / 35 | 4241 |
| 3 | 3 | 61.4 | 66.3 | 5 / 35 | 4337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 15 | 73% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 50% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 88 of 105 rounds, at a mean tick of 609. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 27% | 33 |
| gh.nano.Grofvuil 0.2 | 22 | 25% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 22% | 25 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 7 |
| djdjdj.NanoSkunk10 1.0 | 6 | 7% | 6 |
| baal.nano.N 1.42 | 4 | 5% | 4 |
| donjezza.Muncho 1.0 | 3 | 3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.0 | 51.4 | 11 / 105 | 5.37 | 10.8% | 9471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 12.7% | 16 |
| mld.DustBunny 3.8 | 2.0 | 12.0% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 2.7 | 12.1% | 22 |
| wee.Gem 1.8.4 | 4.3 | 11.4% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 11.0% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5.7 | 10.9% | 8 |
| hadur117.nano.SanaroB1000 0.1 | 5.7 | 10.8% | 11 |
| cs.sheldor.Talon 1.1 | 8.3 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 9.0 | 6.1% | 3 |
| step.nanoPri 1.0 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 51.6 | 48.9 | 3 / 35 | 3012 |
| 2 | 5 | 53.5 | 53.0 | 3 / 35 | 3127 |
| 3 | 5 | 53.9 | 52.4 | 5 / 35 | 3332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4 | 50% |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 67% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 33% |
| wee.Gem 1.8.4 | 3 | 33% |
| tj.zombie1n 1.0.1 | 1 | 0% |
| mld.DustBunny 3.8 | 1 | 100% |

Hadur died in 94 of 105 rounds, at a mean tick of 515. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 17 | 18% | 19 |
| wee.Gem 1.8.4 | 14 | 15% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 14% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 13% | 13 |
| d414.nano.Quantum 1.0.0 | 11 | 12% | 14 |
| cs.sheldor.Talon 1.1 | 11 | 12% | 12 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 11% | 11 |
| step.nanoPri 1.0 | 5 | 5% | 5 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 70.3 | 15 / 105 | 3.68 | 14.4% | 13404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.7% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.6% | 21 |
| hadur117.nano.SanaroB1000 0.1 | 3.0 | 14.4% | 15 |
| mld.Infinity 2.2 | 3.0 | 14.3% | 31 |
| ayk.WallHugger 1.0 | 6.0 | 7.5% | 3 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.5% | 1 |
| robar.nano.Assertive_Melee 0.2 | 6.7 | 8.1% | 1 |
| conscience.Electron 1.3g | 7.0 | 7.5% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 3 |
| sample.RamFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 69.8 | 8 / 35 | 4315 |
| 2 | 4 | 61.6 | 70.8 | 1 / 35 | 4202 |
| 3 | 2 | 62.6 | 70.2 | 6 / 35 | 4887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 12 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 73% |
| d414.nano.Quantum 1.0.0 | 10 | 30% |
| donjezza.Jezza 1.0 | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 37% | 43 |
| d414.nano.Quantum 1.0.0 | 26 | 29% | 32 |
| mld.Infinity 2.2 | 17 | 19% | 9 |
| ayk.WallHugger 1.0 | 6 | 7% | 7 |
| robar.nano.Assertive_Melee 0.2 | 4 | 4% | 6 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 4 |
| conscience.Electron 1.3g | 2 | 2% | 3 |

## Melee bench: F11

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 63.7 | 17 / 105 | 4.27 | 12.8% | 10283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.8% | 23 |
| oog.melee.Corsair 1.0 | 3.0 | 13.2% | 15 |
| hadur117.nano.SanaroB1000 0.1 | 3.3 | 12.8% | 17 |
| mz.NanoGod 2.02 | 4.7 | 11.6% | 14 |
| awesomeness.Elite 1.0 | 6.0 | 8.7% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.8% | 3 |
| DBall.NUKE 0.1 | 8.3 | 6.7% | 1 |
| sample.Walls 1.0 | 8.3 | 6.3% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 65.7 | 4 / 35 | 3232 |
| 2 | 4 | 60.1 | 66.7 | 6 / 35 | 3682 |
| 3 | 3 | 57.1 | 58.7 | 7 / 35 | 3369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 12 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 67% |
| mz.NanoGod 2.02 | 6 | 33% |
| oog.melee.Corsair 1.0 | 5 | 80% |
| awesomeness.Elite 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 0% |

Hadur died in 88 of 105 rounds, at a mean tick of 553. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 24% | 24 |
| mz.NanoGod 2.02 | 19 | 22% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 16% | 18 |
| zyx.nano.BacillusComma 1.0 | 11 | 13% | 12 |
| oog.melee.Corsair 1.0 | 10 | 11% | 15 |
| awesomeness.Elite 1.0 | 8 | 9% | 10 |
| sample.Walls 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 2 | 2% | 2 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 58.7 | 12 / 105 | 4.71 | 12.0% | 10104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.9% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.2% | 10 |
| myl.nano.KomoriNinja 1.1 | 3.0 | 12.6% | 16 |
| hadur117.nano.SanaroB1000 0.1 | 4.0 | 12.0% | 12 |
| sul.Lunar 1.1 | 4.7 | 11.3% | 15 |
| sam.Samspin 1.0 | 6.3 | 8.1% | 7 |
| maribo.melee.BMV 0.1 | 7.3 | 8.3% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 7.4% | 4 |
| sample.SpinBot 1.0 | 8.3 | 7.7% | 8 |
| cvt.Firsty 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 59.7 | 3 / 35 | 3566 |
| 2 | 4 | 58.7 | 62.5 | 5 / 35 | 3669 |
| 3 | 5 | 53.5 | 54.0 | 4 / 35 | 2869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 75% |
| sul.Lunar 1.1 | 7 | 29% |
| myl.nano.KomoriNinja 1.1 | 4 | 50% |
| sample.SpinBot 1.0 | 2 | 0% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 94 of 105 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 27% | 27 |
| myl.nano.KomoriNinja 1.1 | 18 | 19% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 18% | 23 |
| sul.Lunar 1.1 | 12 | 13% | 13 |
| maribo.melee.BMV 0.1 | 8 | 9% | 8 |
| sample.SpinBot 1.0 | 7 | 7% | 7 |
| spinnercat.Omen 1.0 | 3 | 3% | 4 |
| sam.Samspin 1.0 | 3 | 3% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.nano.SanaroB1000 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 60.4 | 15 / 105 | 4.56 | 12.1% | 10218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.3 | 14.3% | 30 |
| d414.nano.Quantum 1.0.0 | 1.7 | 14.4% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 14 |
| hadur117.nano.SanaroB1000 0.1 | 3.7 | 12.1% | 15 |
| mld.Wisdom 1.0 | 5.0 | 11.1% | 7 |
| zyx.nano.Ant 1.1 | 6.7 | 8.7% | 2 |
| amz.NanoClone 1.41 | 7.0 | 8.5% | 1 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.4% | 5 |
| arthord.NanoSatanMelee Beta | 9.0 | 6.9% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.6 | 62.2 | 5 / 35 | 3479 |
| 2 | 4 | 55.9 | 58.1 | 3 / 35 | 3455 |
| 3 | 4 | 56.9 | 61.0 | 7 / 35 | 3284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 55% |
| d414.nano.Quantum 1.0.0 | 7 | 29% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 14% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| amz.NanoClone 1.41 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| mld.Wisdom 1.0 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 92 of 105 rounds, at a mean tick of 560. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 24 | 26% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 18% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 20 |
| zyx.nano.Ant 1.1 | 9 | 10% | 10 |
| amz.NanoClone 1.41 | 8 | 9% | 10 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 7 |
| mld.Wisdom 1.0 | 5 | 5% | 6 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 5 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |
2 death(s) with no robot to name.

