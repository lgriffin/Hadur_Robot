# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 3 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 64.0 | 15 / 105 | 4.24 | 13.1% | 10948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.4% | 35 |
| hadur117.nano.SanaroS10 0.1 | 3.0 | 13.1% | 15 |
| bzdp.Pansy 2.1 | 3.7 | 12.4% | 12 |
| tvv.nano.Polaris 1.2 | 5.3 | 10.0% | 6 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.1% | 1 |
| zyx.nano.Ant 1.1 | 7.3 | 8.2% | 0 |
| fm.claire 1.7 | 7.3 | 8.2% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.2% | 3 |
| arthord.MannyPacquiao Beta | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 68.3 | 9 / 35 | 3621 |
| 2 | 3 | 59.9 | 66.3 | 4 / 35 | 3788 |
| 3 | 4 | 56.2 | 57.5 | 2 / 35 | 3539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 26% |
| d414.nano.Quantum 1.0.0 | 18 | 50% |
| bzdp.Pansy 2.1 | 3 | 0% |
| tvv.nano.Polaris 1.2 | 2 | 0% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 38% | 39 |
| d414.nano.Quantum 1.0.0 | 16 | 18% | 25 |
| bzdp.Pansy 2.1 | 13 | 14% | 13 |
| fm.claire 1.7 | 8 | 9% | 8 |
| tvv.nano.Polaris 1.2 | 8 | 9% | 8 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 7 |
| zyx.nano.Ant 1.1 | 4 | 4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 0 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 70.3 | 18 / 105 | 3.68 | 13.7% | 9658 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.nano.SanaroS10 0.1 | 2.0 | 13.7% | 18 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.0% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.7% | 11 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 13.0% | 17 |
| DBall.Anarchy 0.1 | 5.7 | 10.9% | 18 |
| fm.mammillarias 1.3 | 6.0 | 9.6% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.3 | 9.7% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.8% | 2 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.2 | 73.0 | 9 / 35 | 3270 |
| 2 | 2 | 60.4 | 68.9 | 5 / 35 | 3246 |
| 3 | 3 | 59.5 | 68.9 | 4 / 35 | 3142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 46% |
| d414.nano.Quantum 1.0.0 | 11 | 45% |
| simonton.nano.MeleeSeed 1.8 | 6 | 50% |
| stelo.SoJNanoMelee 1.1 | 4 | 50% |
| DBall.Anarchy 0.1 | 2 | 50% |
| fm.mammillarias 1.3 | 2 | 50% |
| sample.MyFirstRobot 1.0 | 1 | 0% |

Hadur died in 89 of 105 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 29% | 34 |
| simonton.nano.MeleeSeed 1.8 | 17 | 19% | 20 |
| d414.nano.Quantum 1.0.0 | 14 | 16% | 20 |
| stelo.SoJNanoMelee 1.1 | 11 | 12% | 11 |
| fm.mammillarias 1.3 | 8 | 9% | 8 |
| DBall.Anarchy 0.1 | 8 | 9% | 8 |
| sample.MyFirstRobot 1.0 | 2 | 2% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 68.8 | 13 / 105 | 3.81 | 13.8% | 12104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 40 |
| hadur117.nano.SanaroS10 0.1 | 2.3 | 13.8% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.0% | 21 |
| ahf.NanoAndrew .4 | 3.7 | 12.9% | 15 |
| ratosh.Nobo 0.21 | 5.0 | 11.5% | 6 |
| timmit.nano.TimDog 0.33 | 6.3 | 8.8% | 5 |
| stelo.PatternRobot 1.0 | 6.7 | 7.4% | 3 |
| repositorio.NanoStep 1.0 | 8.0 | 5.7% | 2 |
| sample.Crazy 1.0 | 9.3 | 5.1% | 0 |
| kurios.DOSexe .9a | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 70.2 | 5 / 35 | 4334 |
| 2 | 2 | 59.7 | 65.7 | 3 / 35 | 4123 |
| 3 | 3 | 60.7 | 70.5 | 5 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 36% |
| d414.nano.Quantum 1.0.0 | 13 | 31% |
| ahf.NanoAndrew .4 | 8 | 38% |
| ratosh.Nobo 0.21 | 3 | 33% |

Hadur died in 92 of 105 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 29 | 32% | 33 |
| ahf.NanoAndrew .4 | 20 | 22% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 20% | 23 |
| timmit.nano.TimDog 0.33 | 7 | 8% | 8 |
| ratosh.Nobo 0.21 | 7 | 8% | 6 |
| stelo.PatternRobot 1.0 | 6 | 7% | 7 |
| repositorio.NanoStep 1.0 | 3 | 3% | 3 |
| kurios.DOSexe .9a | 2 | 2% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 75.9 | 24 / 105 | 3.17 | 15.8% | 15537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 16.7% | 38 |
| hadur117.nano.SanaroS10 0.1 | 2.3 | 15.8% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.9% | 28 |
| wompi.Quokka 1.6 | 3.7 | 14.6% | 15 |
| kurios.DOSexe .9b | 5.3 | 7.7% | 1 |
| maribo.FollowFire 1 | 6.0 | 7.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.0 | 6.5% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.2% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 5.4% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 10 / 35 | 5506 |
| 2 | 4 | 63.8 | 72.7 | 5 / 35 | 5174 |
| 3 | 2 | 63.8 | 73.7 | 9 / 35 | 4857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 44% |
| d414.nano.Quantum 1.0.0 | 18 | 44% |
| wompi.Quokka 1.6 | 8 | 50% |
| kurios.DOSexe .9b | 1 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 83 of 105 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 40% | 43 |
| d414.nano.Quantum 1.0.0 | 21 | 25% | 32 |
| wompi.Quokka 1.6 | 17 | 20% | 15 |
| maribo.FollowFire 1 | 4 | 5% | 5 |
| kurios.DOSexe .9b | 2 | 2% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 3 |
| sample.VelociRobot 1.0 | 2 | 2% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.6 | 21 / 105 | 3.20 | 15.4% | 14426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.4% | 40 |
| hadur117.nano.SanaroS10 0.1 | 2.0 | 15.4% | 21 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.8% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 11.7% | 5 |
| ntc.Opposite 1.5 | 4.7 | 11.4% | 5 |
| js.PinBall 1.6 | 5.7 | 10.6% | 5 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.4% | 4 |
| sample.Fire 1.0 | 8.3 | 4.8% | 1 |
| PSW.Relentless 0.1 | 8.7 | 4.2% | 0 |
| sample.Target 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.0 | 8 / 35 | 5115 |
| 2 | 2 | 64.1 | 74.0 | 8 / 35 | 4822 |
| 3 | 3 | 62.1 | 71.7 | 5 / 35 | 4489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 36% |
| d414.nano.Quantum 1.0.0 | 13 | 62% |
| js.PinBall 1.6 | 4 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 33% |
| sp.Nanos.Ember 1.1 | 3 | 33% |
| ntc.Opposite 1.5 | 2 | 0% |

Hadur died in 84 of 105 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 36% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 27% | 31 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 15% | 14 |
| ntc.Opposite 1.5 | 10 | 12% | 10 |
| js.PinBall 1.6 | 4 | 5% | 7 |
| sp.Nanos.Ember 1.1 | 3 | 4% | 3 |
| sample.Fire 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 64.3 | 16 / 105 | 4.21 | 12.7% | 9771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 13.6% | 22 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.7% | 10 |
| hadur117.nano.SanaroS10 0.1 | 4.0 | 12.7% | 16 |
| myl.nano.Graviton 1.10 | 4.3 | 11.9% | 19 |
| kawigi.nano.Lib 1.0 | 5.0 | 12.1% | 15 |
| stelo.MirrorNano 1.3 | 7.7 | 7.7% | 0 |
| ratosh.Wesco 1.4 | 8.0 | 7.5% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 7.3% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 65.4 | 7 / 35 | 3146 |
| 2 | 6 | 57.6 | 61.0 | 3 / 35 | 3179 |
| 3 | 2 | 59.8 | 66.7 | 6 / 35 | 3446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 60% |
| kawigi.nano.Lib 1.0 | 6 | 33% |
| myl.nano.Graviton 1.10 | 6 | 50% |
| radnor.DoctorBob 1.42 | 5 | 40% |
| d414.nano.Quantum 1.0.0 | 4 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 19% | 22 |
| d414.nano.Quantum 1.0.0 | 15 | 17% | 17 |
| radnor.DoctorBob 1.42 | 14 | 16% | 17 |
| myl.nano.Graviton 1.10 | 13 | 15% | 17 |
| kawigi.nano.Lib 1.0 | 13 | 15% | 15 |
| stelo.MirrorNano 1.3 | 7 | 8% | 7 |
| squidM.TentalceMeleeNano 1.1 | 7 | 8% | 6 |
| ratosh.Wesco 1.4 | 3 | 3% | 4 |

## Melee bench: F07

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.7 | 58.6 | 9 / 105 | 4.72 | 11.8% | 10654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.7% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 19 |
| cb.nano.Insomnia 1.0 | 3.7 | 12.2% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 12.2% | 19 |
| hadur117.nano.SanaroS10 0.1 | 4.3 | 11.8% | 9 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 12.1% | 9 |
| mz.Cork 0.1 | 6.7 | 10.1% | 5 |
| stuff.Vlad 0.1 | 8.3 | 5.6% | 0 |
| stelo.UntouchableNano 1.3 | 8.7 | 5.3% | 2 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 52.1 | 47.6 | 1 / 35 | 3122 |
| 2 | 3 | 57.9 | 61.9 | 4 / 35 | 3572 |
| 3 | 3 | 59.9 | 66.3 | 4 / 35 | 3960 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 7 | 43% |
| nz.jdc.nano.GridFu 1.0 | 5 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 60% |
| cb.nano.Insomnia 1.0 | 4 | 0% |
| oog.melee.CapuletDroid 1.1 | 1 | 100% |

Hadur died in 97 of 105 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 24% | 26 |
| d414.nano.Quantum 1.0.0 | 17 | 18% | 20 |
| cb.nano.Insomnia 1.0 | 17 | 18% | 14 |
| nz.jdc.nano.GridFu 1.0 | 15 | 15% | 19 |
| oog.melee.CapuletDroid 1.1 | 13 | 13% | 13 |
| mz.Cork 0.1 | 7 | 7% | 9 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 1 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 71.1 | 13 / 105 | 3.60 | 14.1% | 11767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.8% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.3% | 15 |
| hadur117.nano.SanaroS10 0.1 | 3.0 | 14.1% | 13 |
| gh.nano.Grofvuil 0.2 | 3.3 | 13.6% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 10.1% | 3 |
| baal.nano.N 1.42 | 5.7 | 9.9% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.7 | 9.5% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.6% | 5 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.5 | 5 / 35 | 4006 |
| 2 | 4 | 61.7 | 71.1 | 3 / 35 | 3803 |
| 3 | 2 | 62.6 | 71.7 | 5 / 35 | 3958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 31% |
| gh.nano.Grofvuil 0.2 | 9 | 22% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 33% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 92 of 105 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 29% | 30 |
| gh.nano.Grofvuil 0.2 | 20 | 22% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 21% | 21 |
| djdjdj.NanoSkunk10 1.0 | 9 | 10% | 12 |
| baal.nano.N 1.42 | 9 | 10% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 8 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.3 | 51.9 | 11 / 105 | 5.33 | 10.5% | 8424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mld.DustBunny 3.8 | 1.3 | 13.1% | 17 |
| d414.nano.Quantum 1.0.0 | 1.7 | 13.8% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 3.3 | 11.6% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 11.5% | 9 |
| hadur117.nano.SanaroS10 0.1 | 5.7 | 10.5% | 11 |
| wee.Gem 1.8.4 | 6.3 | 10.1% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 6.7 | 9.0% | 7 |
| tj.zombie1n 1.0.1 | 7.7 | 8.3% | 12 |
| cs.sheldor.Talon 1.1 | 8.7 | 7.0% | 0 |
| step.nanoPri 1.0 | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 53.0 | 54.3 | 6 / 35 | 2588 |
| 2 | 6 | 49.9 | 46.3 | 2 / 35 | 2739 |
| 3 | 5 | 53.8 | 54.9 | 3 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.DustBunny 3.8 | 7 | 71% |
| wee.Gem 1.8.4 | 5 | 40% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 50% |
| d414.nano.Quantum 1.0.0 | 4 | 25% |
| tj.zombie1n 1.0.1 | 2 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1 | 0% |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 100% |

Hadur died in 94 of 105 rounds, at a mean tick of 526. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 17 | 18% | 22 |
| d414.nano.Quantum 1.0.0 | 17 | 18% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 16% | 16 |
| wee.Gem 1.8.4 | 14 | 15% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 11% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 10% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 5 |
| tj.zombie1n 1.0.1 | 5 | 5% | 5 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F10

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.1 | 15 / 105 | 3.60 | 14.4% | 12577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 26 |
| mld.Infinity 2.2 | 2.7 | 14.7% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.5% | 23 |
| hadur117.nano.SanaroS10 0.1 | 3.0 | 14.4% | 15 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 7.9% | 0 |
| conscience.Electron 1.3g | 6.3 | 7.8% | 1 |
| ayk.WallHugger 1.0 | 6.3 | 8.3% | 5 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.4% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.9% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 64.1 | 4 / 35 | 3898 |
| 2 | 3 | 62.7 | 74.6 | 4 / 35 | 4243 |
| 3 | 2 | 63.1 | 74.6 | 7 / 35 | 4436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 44% |
| mld.Infinity 2.2 | 11 | 9% |
| d414.nano.Quantum 1.0.0 | 11 | 27% |
| donjezza.Jezza 1.0 | 2 | 50% |
| ayk.WallHugger 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 31% | 39 |
| d414.nano.Quantum 1.0.0 | 27 | 30% | 35 |
| mld.Infinity 2.2 | 14 | 16% | 4 |
| ayk.WallHugger 1.0 | 8 | 9% | 10 |
| robar.nano.Assertive_Melee 0.2 | 5 | 6% | 6 |
| conscience.Electron 1.3g | 3 | 3% | 4 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |
| sample.RamFire 1.0 | 2 | 2% | 2 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F11

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 63.1 | 15 / 105 | 4.32 | 12.7% | 10375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.1% | 18 |
| hadur117.nano.SanaroS10 0.1 | 3.0 | 12.7% | 15 |
| oog.melee.Corsair 1.0 | 3.0 | 13.5% | 20 |
| mz.NanoGod 2.02 | 5.0 | 10.4% | 11 |
| DBall.NUKE 0.1 | 6.0 | 8.9% | 9 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.8% | 1 |
| awesomeness.Elite 1.0 | 7.7 | 7.3% | 0 |
| sample.Walls 1.0 | 9.0 | 6.1% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.3 | 63.5 | 4 / 35 | 3529 |
| 2 | 2 | 59.3 | 65.4 | 7 / 35 | 3606 |
| 3 | 4 | 57.5 | 60.3 | 4 / 35 | 3240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 12 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 63% |
| oog.melee.Corsair 1.0 | 6 | 50% |
| DBall.NUKE 0.1 | 4 | 25% |
| mz.NanoGod 2.02 | 3 | 33% |
| sample.Walls 1.0 | 1 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 90 of 105 rounds, at a mean tick of 613. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 30% | 29 |
| oog.melee.Corsair 1.0 | 16 | 18% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 14% | 17 |
| DBall.NUKE 0.1 | 13 | 14% | 14 |
| mz.NanoGod 2.02 | 9 | 10% | 10 |
| awesomeness.Elite 1.0 | 4 | 4% | 4 |
| stelo.PianistNano 1.2 | 4 | 4% | 4 |
| sample.Walls 1.0 | 2 | 2% | 4 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.6 | 60.7 | 9 / 105 | 4.53 | 12.1% | 9935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.4% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.1% | 20 |
| hadur117.nano.SanaroS10 0.1 | 3.3 | 12.1% | 9 |
| sul.Lunar 1.1 | 4.0 | 11.4% | 14 |
| myl.nano.KomoriNinja 1.1 | 4.7 | 10.2% | 7 |
| maribo.melee.BMV 0.1 | 7.0 | 8.1% | 0 |
| spinnercat.Omen 1.0 | 7.3 | 8.1% | 6 |
| sam.Samspin 1.0 | 7.7 | 7.8% | 2 |
| sample.SpinBot 1.0 | 8.0 | 7.3% | 4 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.2 | 55.2 | 2 / 35 | 3171 |
| 2 | 3 | 59.1 | 66.7 | 3 / 35 | 3420 |
| 3 | 3 | 56.6 | 60.3 | 4 / 35 | 3344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 11 | 27% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 50% |
| sul.Lunar 1.1 | 7 | 14% |
| spinnercat.Omen 1.0 | 2 | 50% |
| sample.SpinBot 1.0 | 1 | 0% |

Hadur died in 96 of 105 rounds, at a mean tick of 719. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 35% | 38 |
| d414.nano.Quantum 1.0.0 | 25 | 26% | 28 |
| sul.Lunar 1.1 | 13 | 14% | 14 |
| myl.nano.KomoriNinja 1.1 | 9 | 9% | 9 |
| sam.Samspin 1.0 | 7 | 7% | 7 |
| maribo.melee.BMV 0.1 | 4 | 4% | 4 |
| spinnercat.Omen 1.0 | 2 | 2% | 3 |
| sample.SpinBot 1.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.nano.SanaroS10 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 61.9 | 10 / 105 | 4.43 | 11.7% | 8623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.4% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 1.7 | 14.5% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 13 |
| hadur117.nano.SanaroS10 0.1 | 4.3 | 11.7% | 10 |
| mld.Wisdom 1.0 | 4.7 | 10.9% | 4 |
| zyx.nano.Ant 1.1 | 6.7 | 8.5% | 4 |
| tvv.nano.Polaris 1.2 | 6.7 | 8.4% | 4 |
| amz.NanoClone 1.41 | 8.0 | 8.0% | 0 |
| arthord.NanoSatanMelee Beta | 8.7 | 7.1% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.4 | 61.3 | 2 / 35 | 2607 |
| 2 | 4 | 55.6 | 61.3 | 2 / 35 | 3034 |
| 3 | 4 | 57.2 | 63.2 | 6 / 35 | 2982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 11 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 25% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 25% |
| mld.Wisdom 1.0 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 95 of 105 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 24% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 23% | 23 |
| d414.nano.Quantum 1.0.0 | 17 | 18% | 21 |
| mld.Wisdom 1.0 | 11 | 12% | 13 |
| amz.NanoClone 1.41 | 10 | 11% | 10 |
| arthord.NanoSatanMelee Beta | 4 | 4% | 4 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 4 |
| zyx.nano.Ant 1.1 | 4 | 4% | 4 |

