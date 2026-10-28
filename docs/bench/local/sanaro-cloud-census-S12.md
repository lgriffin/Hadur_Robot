# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 57.9 | 16 / 105 | 4.79 | 11.9% | 9959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.1% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.3% | 19 |
| bzdp.Pansy 2.1 | 2.3 | 13.8% | 30 |
| hadur117.nano.SanaroS12 0.1 | 4.0 | 11.9% | 16 |
| tvv.nano.Polaris 1.2 | 5.0 | 10.1% | 8 |
| arthord.NanoSatanMelee Beta | 6.0 | 9.6% | 2 |
| zyx.nano.Ant 1.1 | 7.3 | 8.2% | 1 |
| fm.claire 1.7 | 7.7 | 8.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.7 | 62.2 | 6 / 35 | 3448 |
| 2 | 4 | 55.8 | 56.2 | 5 / 35 | 3157 |
| 3 | 4 | 55.9 | 55.2 | 5 / 35 | 3354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 33% |
| bzdp.Pansy 2.1 | 10 | 40% |
| d414.nano.Quantum 1.0.0 | 5 | 80% |
| fm.claire 1.7 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 581. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 25 | 28% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 17% | 22 |
| d414.nano.Quantum 1.0.0 | 14 | 16% | 18 |
| tvv.nano.Polaris 1.2 | 9 | 10% | 10 |
| arthord.NanoSatanMelee Beta | 8 | 9% | 8 |
| fm.claire 1.7 | 6 | 7% | 6 |
| zyx.nano.Ant 1.1 | 6 | 7% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 7% | 6 |

## Melee bench: F02

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 63.3 | 6 / 105 | 4.30 | 12.5% | 9632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.8% | 32 |
| simonton.nano.MeleeSeed 1.8 | 3.0 | 12.1% | 15 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 21 |
| hadur117.nano.SanaroS12 0.1 | 3.7 | 12.5% | 6 |
| DBall.Anarchy 0.1 | 4.7 | 11.4% | 18 |
| fm.mammillarias 1.3 | 6.0 | 9.7% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 9.4% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 8.0% | 1 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.7 | 67.3 | 1 / 35 | 2976 |
| 2 | 3 | 59.6 | 66.0 | 2 / 35 | 3651 |
| 3 | 5 | 56.2 | 56.5 | 3 / 35 | 3005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 20% |
| d414.nano.Quantum 1.0.0 | 9 | 33% |
| DBall.Anarchy 0.1 | 6 | 0% |
| simonton.nano.MeleeSeed 1.8 | 5 | 20% |
| stelo.SoJNanoMelee 1.1 | 1 | 0% |

Hadur died in 99 of 105 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 26% | 28 |
| d414.nano.Quantum 1.0.0 | 21 | 21% | 23 |
| simonton.nano.MeleeSeed 1.8 | 14 | 14% | 15 |
| DBall.Anarchy 0.1 | 14 | 14% | 14 |
| fm.mammillarias 1.3 | 11 | 11% | 11 |
| stelo.SoJNanoMelee 1.1 | 8 | 8% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 4% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 59.5 | 11 / 105 | 4.65 | 12.2% | 11205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.8% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.8% | 17 |
| ahf.NanoAndrew .4 | 3.0 | 13.1% | 22 |
| hadur117.nano.SanaroS12 0.1 | 4.3 | 12.2% | 11 |
| ratosh.Nobo 0.21 | 4.7 | 11.8% | 7 |
| timmit.nano.TimDog 0.33 | 6.3 | 8.9% | 3 |
| stelo.PatternRobot 1.0 | 6.7 | 7.4% | 4 |
| sample.Crazy 1.0 | 8.7 | 6.1% | 4 |
| repositorio.NanoStep 1.0 | 9.0 | 6.1% | 1 |
| kurios.DOSexe .9a | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.0 | 58.4 | 3 / 35 | 3802 |
| 2 | 4 | 56.5 | 58.1 | 4 / 35 | 3613 |
| 3 | 4 | 57.9 | 61.9 | 4 / 35 | 3790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 30% |
| d414.nano.Quantum 1.0.0 | 8 | 38% |
| ratosh.Nobo 0.21 | 3 | 33% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| ahf.NanoAndrew .4 | 2 | 0% |
| repositorio.NanoStep 1.0 | 2 | 50% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 94 of 105 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 22% | 22 |
| ahf.NanoAndrew .4 | 21 | 22% | 21 |
| d414.nano.Quantum 1.0.0 | 18 | 19% | 21 |
| ratosh.Nobo 0.21 | 18 | 19% | 20 |
| stelo.PatternRobot 1.0 | 6 | 6% | 7 |
| timmit.nano.TimDog 0.33 | 4 | 4% | 5 |
| repositorio.NanoStep 1.0 | 3 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F04

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 71.1 | 22 / 105 | 3.60 | 15.1% | 14982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.5% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 16.1% | 29 |
| hadur117.nano.SanaroS12 0.1 | 3.0 | 15.1% | 22 |
| wompi.Quokka 1.6 | 4.0 | 14.3% | 9 |
| kurios.DOSexe .9b | 5.3 | 8.1% | 1 |
| maribo.FollowFire 1 | 6.3 | 7.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 6.7 | 6.9% | 2 |
| jangs.ns51 1.0 | 7.7 | 6.5% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 5.4% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.6 | 74.9 | 6 / 35 | 5098 |
| 2 | 3 | 63.3 | 68.9 | 11 / 35 | 4958 |
| 3 | 3 | 62.6 | 69.5 | 5 / 35 | 4926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 19% |
| d414.nano.Quantum 1.0.0 | 13 | 54% |
| wompi.Quokka 1.6 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 83 of 105 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 46% | 43 |
| d414.nano.Quantum 1.0.0 | 20 | 24% | 30 |
| wompi.Quokka 1.6 | 12 | 14% | 14 |
| kurios.DOSexe .9b | 6 | 7% | 9 |
| maribo.FollowFire 1 | 5 | 6% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 67.5 | 17 / 105 | 3.92 | 13.9% | 13261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.2% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 15.1% | 26 |
| hadur117.nano.SanaroS12 0.1 | 2.7 | 13.9% | 17 |
| ntc.Opposite 1.5 | 4.3 | 12.1% | 5 |
| js.PinBall 1.6 | 5.3 | 11.1% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 10.5% | 4 |
| sp.Nanos.Ember 1.1 | 7.0 | 6.9% | 3 |
| sample.Fire 1.0 | 8.3 | 5.3% | 0 |
| PSW.Relentless 0.1 | 8.7 | 4.6% | 0 |
| sample.Target 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 68.9 | 7 / 35 | 4207 |
| 2 | 3 | 61.5 | 67.3 | 5 / 35 | 4660 |
| 3 | 3 | 61.4 | 66.3 | 5 / 35 | 4394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 22% |
| d414.nano.Quantum 1.0.0 | 13 | 62% |
| ntc.Opposite 1.5 | 3 | 100% |
| sp.Nanos.Ember 1.1 | 2 | 50% |
| js.PinBall 1.6 | 2 | 50% |

Hadur died in 88 of 105 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 27% | 30 |
| d414.nano.Quantum 1.0.0 | 20 | 23% | 25 |
| ntc.Opposite 1.5 | 17 | 19% | 20 |
| js.PinBall 1.6 | 14 | 16% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 13% | 11 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 2 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 3 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 59.5 | 13 / 105 | 4.65 | 12.0% | 9923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 13.9% | 16 |
| kawigi.nano.Lib 1.0 | 2.0 | 14.1% | 22 |
| radnor.DoctorBob 1.42 | 3.3 | 13.3% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.4% | 13 |
| hadur117.nano.SanaroS12 0.1 | 4.3 | 12.0% | 13 |
| myl.nano.Graviton 1.10 | 5.3 | 11.1% | 12 |
| stelo.MirrorNano 1.3 | 7.0 | 8.2% | 1 |
| ratosh.Wesco 1.4 | 8.0 | 7.7% | 5 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 6.5% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 55.9 | 56.2 | 2 / 35 | 3131 |
| 2 | 2 | 61.3 | 66.3 | 5 / 35 | 3899 |
| 3 | 5 | 55.7 | 55.9 | 6 / 35 | 2893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 11 | 27% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 43% |
| radnor.DoctorBob 1.42 | 3 | 33% |
| myl.nano.Graviton 1.10 | 2 | 50% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 92 of 105 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 28% | 28 |
| radnor.DoctorBob 1.42 | 21 | 23% | 24 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 18% | 19 |
| d414.nano.Quantum 1.0.0 | 13 | 14% | 17 |
| myl.nano.Graviton 1.10 | 7 | 8% | 7 |
| stelo.MirrorNano 1.3 | 4 | 4% | 5 |
| ratosh.Wesco 1.4 | 2 | 2% | 2 |
| squidM.TentalceMeleeNano 1.1 | 2 | 2% | 2 |

## Melee bench: F07

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 58.0 | 6 / 105 | 4.78 | 11.9% | 11222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 13.7% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 13.9% | 26 |
| cb.nano.Insomnia 1.0 | 2.3 | 13.5% | 23 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 12.4% | 15 |
| hadur117.nano.SanaroS12 0.1 | 5.0 | 11.9% | 6 |
| oog.melee.CapuletDroid 1.1 | 5.3 | 11.7% | 13 |
| mz.Cork 0.1 | 7.0 | 9.8% | 4 |
| stelo.UntouchableNano 1.3 | 8.0 | 5.3% | 0 |
| stuff.Vlad 0.1 | 9.0 | 4.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.0 | 59.7 | 3 / 35 | 3749 |
| 2 | 6 | 55.4 | 54.9 | 1 / 35 | 3474 |
| 3 | 4 | 57.8 | 59.4 | 2 / 35 | 3999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 20% |
| cb.nano.Insomnia 1.0 | 4 | 0% |
| oog.melee.CapuletDroid 1.1 | 3 | 100% |
| d414.nano.Quantum 1.0.0 | 3 | 33% |
| mz.Cork 0.1 | 1 | 100% |
| nz.jdc.nano.GridFu 1.0 | 1 | 0% |

Hadur died in 99 of 105 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 21% | 23 |
| cb.nano.Insomnia 1.0 | 19 | 19% | 13 |
| d414.nano.Quantum 1.0.0 | 18 | 18% | 20 |
| nz.jdc.nano.GridFu 1.0 | 16 | 16% | 17 |
| oog.melee.CapuletDroid 1.1 | 13 | 13% | 19 |
| mz.Cork 0.1 | 8 | 8% | 9 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| stelo.UntouchableNano 1.3 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 67.5 | 11 / 105 | 3.92 | 13.2% | 10845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.4% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.2% | 12 |
| hadur117.nano.SanaroS12 0.1 | 3.3 | 13.2% | 11 |
| gh.nano.Grofvuil 0.2 | 3.7 | 12.6% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 10.9% | 1 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 10.7% | 13 |
| baal.nano.N 1.42 | 7.0 | 9.5% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 5.0% | 2 |
| cli.WasteOfAmmo 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 70.2 | 3 / 35 | 3937 |
| 2 | 4 | 59.1 | 66.0 | 3 / 35 | 3257 |
| 3 | 3 | 60.0 | 66.3 | 5 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 14% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 36% |
| djdjdj.NanoSkunk10 1.0 | 5 | 60% |
| gh.nano.Grofvuil 0.2 | 3 | 0% |
| baal.nano.N 1.42 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 95 of 105 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 36% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 18% | 20 |
| djdjdj.NanoSkunk10 1.0 | 13 | 14% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 12 | 13% | 13 |
| gh.nano.Grofvuil 0.2 | 10 | 11% | 11 |
| baal.nano.N 1.42 | 7 | 7% | 7 |
| donjezza.Muncho 1.0 | 1 | 1% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.7 | 47.5 | 7 / 105 | 5.72 | 9.6% | 8043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 13.8% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 3.0 | 11.8% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 11.7% | 11 |
| mld.DustBunny 3.8 | 3.3 | 11.1% | 6 |
| wee.Gem 1.8.4 | 4.3 | 10.7% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 6.0 | 10.1% | 10 |
| hadur117.nano.SanaroS12 0.1 | 6.7 | 9.6% | 7 |
| tj.zombie1n 1.0.1 | 8.3 | 8.4% | 12 |
| cs.sheldor.Talon 1.1 | 8.7 | 7.2% | 0 |
| step.nanoPri 1.0 | 10.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 51.0 | 49.8 | 2 / 35 | 2775 |
| 2 | 7 | 50.2 | 48.6 | 2 / 35 | 2712 |
| 3 | 7 | 48.1 | 44.1 | 3 / 35 | 2556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 14% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 40% |
| d414.nano.Quantum 1.0.0 | 3 | 100% |
| mld.DustBunny 3.8 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 98 of 105 rounds, at a mean tick of 514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 17 | 17% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 17% | 18 |
| d414.nano.Quantum 1.0.0 | 13 | 13% | 16 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 11% | 11 |
| cs.sheldor.Talon 1.1 | 10 | 10% | 11 |
| wee.Gem 1.8.4 | 10 | 10% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 9% | 9 |
| step.nanoPri 1.0 | 6 | 6% | 6 |
| tj.zombie1n 1.0.1 | 5 | 5% | 4 |

## Melee bench: F10

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.1 | 14 / 105 | 4.05 | 13.5% | 12464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.5% | 23 |
| mld.Infinity 2.2 | 1.7 | 14.8% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 14.2% | 24 |
| hadur117.nano.SanaroS12 0.1 | 3.7 | 13.5% | 14 |
| robar.nano.Assertive_Melee 0.2 | 5.3 | 8.7% | 2 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.8% | 1 |
| conscience.Electron 1.3g | 7.0 | 7.9% | 0 |
| ayk.WallHugger 1.0 | 7.3 | 7.3% | 1 |
| donjezza.Jezza 1.0 | 8.3 | 5.9% | 4 |
| sample.RamFire 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 66.3 | 5 / 35 | 4510 |
| 2 | 4 | 60.5 | 67.9 | 5 / 35 | 4103 |
| 3 | 4 | 58.7 | 64.1 | 4 / 35 | 3851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 44% |
| mld.Infinity 2.2 | 6 | 17% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 91 of 105 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 26 | 29% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 27% | 30 |
| mld.Infinity 2.2 | 17 | 19% | 17 |
| ayk.WallHugger 1.0 | 9 | 10% | 10 |
| conscience.Electron 1.3g | 5 | 5% | 5 |
| robar.nano.Assertive_Melee 0.2 | 3 | 3% | 3 |
| donjezza.Jezza 1.0 | 3 | 3% | 3 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 2 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 61.4 | 10 / 105 | 4.48 | 12.6% | 11350 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.7 | 14.9% | 24 |
| oog.melee.Corsair 1.0 | 3.3 | 12.8% | 21 |
| hadur117.nano.SanaroS12 0.1 | 4.0 | 12.6% | 10 |
| mz.NanoGod 2.02 | 4.7 | 11.6% | 14 |
| awesomeness.Elite 1.0 | 6.7 | 7.9% | 2 |
| zyx.nano.BacillusComma 1.0 | 7.3 | 7.4% | 0 |
| DBall.NUKE 0.1 | 7.7 | 7.0% | 4 |
| sample.Walls 1.0 | 8.3 | 6.5% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 62.5 | 4 / 35 | 3837 |
| 2 | 5 | 56.3 | 58.4 | 2 / 35 | 3652 |
| 3 | 4 | 59.2 | 63.2 | 4 / 35 | 3861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 9% |
| oog.melee.Corsair 1.0 | 7 | 43% |
| d414.nano.Quantum 1.0.0 | 6 | 17% |
| mz.NanoGod 2.02 | 3 | 67% |
| awesomeness.Elite 1.0 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 95 of 105 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 24% | 25 |
| d414.nano.Quantum 1.0.0 | 22 | 23% | 27 |
| mz.NanoGod 2.02 | 19 | 20% | 19 |
| oog.melee.Corsair 1.0 | 13 | 14% | 14 |
| awesomeness.Elite 1.0 | 8 | 8% | 9 |
| zyx.nano.BacillusComma 1.0 | 6 | 6% | 5 |
| DBall.NUKE 0.1 | 4 | 4% | 5 |
| sample.Walls 1.0 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 58.1 | 14 / 105 | 4.77 | 12.1% | 10575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.5% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 12.9% | 13 |
| sul.Lunar 1.1 | 3.3 | 12.1% | 14 |
| hadur117.nano.SanaroS12 0.1 | 3.3 | 12.1% | 14 |
| myl.nano.KomoriNinja 1.1 | 5.0 | 10.7% | 11 |
| maribo.melee.BMV 0.1 | 6.7 | 8.5% | 0 |
| spinnercat.Omen 1.0 | 7.0 | 8.5% | 7 |
| sam.Samspin 1.0 | 7.3 | 8.5% | 3 |
| sample.SpinBot 1.0 | 9.0 | 7.3% | 7 |
| cvt.Firsty 1.0 | 10.0 | 4.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 57.1 | 3 / 35 | 3319 |
| 2 | 2 | 59.0 | 62.5 | 6 / 35 | 3973 |
| 3 | 4 | 54.6 | 54.6 | 5 / 35 | 3283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 43% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 57% |
| sul.Lunar 1.1 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 0% |
| maribo.melee.BMV 0.1 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| sample.SpinBot 1.0 | 1 | 0% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 91 of 105 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 23% | 25 |
| d414.nano.Quantum 1.0.0 | 17 | 19% | 23 |
| sul.Lunar 1.1 | 12 | 13% | 14 |
| maribo.melee.BMV 0.1 | 11 | 12% | 11 |
| myl.nano.KomoriNinja 1.1 | 9 | 10% | 10 |
| spinnercat.Omen 1.0 | 8 | 9% | 8 |
| sam.Samspin 1.0 | 7 | 8% | 8 |
| sample.SpinBot 1.0 | 4 | 4% | 4 |
| cvt.Firsty 1.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.nano.SanaroS12 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.2 | 64.8 | 18 / 105 | 4.17 | 12.7% | 10204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 3.0 | 12.9% | 21 |
| hadur117.nano.SanaroS12 0.1 | 3.0 | 12.7% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.5% | 14 |
| mld.Wisdom 1.0 | 4.7 | 11.3% | 8 |
| amz.NanoClone 1.41 | 7.0 | 8.3% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 8.3% | 4 |
| tvv.nano.Polaris 1.2 | 7.3 | 8.3% | 5 |
| zyx.nano.Ant 1.1 | 8.3 | 7.7% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.4 | 55.2 | 3 / 35 | 3002 |
| 2 | 2 | 58.7 | 64.4 | 7 / 35 | 3719 |
| 3 | 2 | 61.4 | 74.6 | 8 / 35 | 3483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 50% |
| d414.nano.Quantum 1.0.0 | 13 | 54% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 25% |
| arthord.NanoSatanMelee Beta | 3 | 33% |
| amz.NanoClone 1.41 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 0% |
| mld.Wisdom 1.0 | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 25% | 28 |
| mld.Wisdom 1.0 | 14 | 16% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 15% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 11% | 16 |
| amz.NanoClone 1.41 | 10 | 11% | 10 |
| arthord.NanoSatanMelee Beta | 7 | 8% | 8 |
| tvv.nano.Polaris 1.2 | 7 | 8% | 7 |
| zyx.nano.Ant 1.1 | 5 | 6% | 5 |
1 death(s) with no robot to name.

