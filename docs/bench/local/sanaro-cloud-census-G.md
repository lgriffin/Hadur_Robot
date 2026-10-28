# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 65.5 | 16 / 105 | 4.10 | 13.0% | 9956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.2% | 25 |
| hadur117.nano.SanaroG 0.1 | 2.7 | 13.0% | 16 |
| bzdp.Pansy 2.1 | 3.7 | 12.4% | 16 |
| zyx.nano.Ant 1.1 | 5.7 | 9.1% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 5 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.6% | 2 |
| fm.claire 1.7 | 7.3 | 8.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.4% | 5 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.0 | 63.2 | 3 / 35 | 3331 |
| 2 | 2 | 60.7 | 68.6 | 7 / 35 | 3528 |
| 3 | 3 | 57.9 | 64.8 | 6 / 35 | 3097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 33% |
| d414.nano.Quantum 1.0.0 | 12 | 33% |
| tvv.nano.Polaris 1.2 | 4 | 25% |
| bzdp.Pansy 2.1 | 4 | 25% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 26% | 32 |
| d414.nano.Quantum 1.0.0 | 18 | 20% | 22 |
| bzdp.Pansy 2.1 | 12 | 13% | 12 |
| zyx.nano.Ant 1.1 | 11 | 12% | 11 |
| fm.claire 1.7 | 9 | 10% | 9 |
| arthord.NanoSatanMelee Beta | 6 | 7% | 8 |
| tvv.nano.Polaris 1.2 | 5 | 6% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 4 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |

## Melee bench: F02

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.9 | 19 / 105 | 3.62 | 13.6% | 8934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.3 | 13.9% | 20 |
| d414.nano.Quantum 1.0.0 | 2.0 | 13.8% | 18 |
| hadur117.nano.SanaroG 0.1 | 2.7 | 13.6% | 19 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.4% | 17 |
| DBall.Anarchy 0.1 | 5.3 | 10.7% | 14 |
| fm.mammillarias 1.3 | 6.0 | 10.2% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 9.3% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.7% | 0 |
| sample.MyFirstRobot 1.0 | 8.7 | 6.5% | 4 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 68.3 | 7 / 35 | 3205 |
| 2 | 2 | 61.4 | 73.0 | 7 / 35 | 2876 |
| 3 | 3 | 60.1 | 71.4 | 5 / 35 | 2853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 50% |
| stelo.SoJNanoMelee 1.1 | 7 | 57% |
| simonton.nano.MeleeSeed 1.8 | 5 | 80% |
| d414.nano.Quantum 1.0.0 | 4 | 0% |
| DBall.Anarchy 0.1 | 3 | 67% |
| fm.mammillarias 1.3 | 2 | 0% |

Hadur died in 88 of 105 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 26% | 33 |
| d414.nano.Quantum 1.0.0 | 16 | 18% | 16 |
| simonton.nano.MeleeSeed 1.8 | 14 | 16% | 18 |
| DBall.Anarchy 0.1 | 9 | 10% | 11 |
| stelo.SoJNanoMelee 1.1 | 8 | 9% | 11 |
| fm.mammillarias 1.3 | 7 | 8% | 7 |
| sample.MyFirstRobot 1.0 | 5 | 6% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 5% | 4 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.6 | 20 / 105 | 3.91 | 13.5% | 10832 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.0% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.0% | 10 |
| hadur117.nano.SanaroG 0.1 | 2.7 | 13.5% | 20 |
| ahf.NanoAndrew .4 | 3.7 | 12.6% | 17 |
| ratosh.Nobo 0.21 | 5.0 | 11.2% | 2 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.9% | 11 |
| stelo.PatternRobot 1.0 | 7.0 | 7.2% | 2 |
| sample.Crazy 1.0 | 8.3 | 6.3% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 5.9% | 2 |
| kurios.DOSexe .9a | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 67.3 | 7 / 35 | 3307 |
| 2 | 3 | 59.1 | 67.0 | 5 / 35 | 3514 |
| 3 | 2 | 61.2 | 68.6 | 8 / 35 | 4011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 14 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 45% |
| timmit.nano.TimDog 0.33 | 6 | 33% |
| ratosh.Nobo 0.21 | 3 | 67% |
| ahf.NanoAndrew .4 | 3 | 33% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 85 of 105 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 24% | 27 |
| ahf.NanoAndrew .4 | 17 | 20% | 18 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 19% | 21 |
| timmit.nano.TimDog 0.33 | 11 | 13% | 14 |
| ratosh.Nobo 0.21 | 11 | 13% | 12 |
| sample.Crazy 1.0 | 4 | 5% | 6 |
| stelo.PatternRobot 1.0 | 2 | 2% | 3 |
| kurios.DOSexe .9a | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 2 | 2% | 2 |

## Melee bench: F04

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.8 | 26 / 105 | 2.82 | 16.1% | 14535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 17.5% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 16.2% | 26 |
| hadur117.nano.SanaroG 0.1 | 2.3 | 16.1% | 26 |
| wompi.Quokka 1.6 | 4.0 | 13.9% | 14 |
| maribo.FollowFire 1 | 5.7 | 7.5% | 0 |
| kurios.DOSexe .9b | 6.0 | 7.1% | 1 |
| jangs.ns51 1.0 | 7.7 | 6.0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 7.7 | 6.0% | 0 |
| sample.VelociRobot 1.0 | 8.0 | 5.8% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.0 | 77.8 | 8 / 35 | 4723 |
| 2 | 2 | 65.7 | 79.4 | 7 / 35 | 5156 |
| 3 | 2 | 65.9 | 82.2 | 11 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 22 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 38% |
| wompi.Quokka 1.6 | 7 | 43% |
| jangs.ns51 1.0 | 2 | 0% |
| drd.Dreadknoght 0.9 | 1 | 0% |

Hadur died in 80 of 105 rounds, at a mean tick of 1110. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 44% | 44 |
| d414.nano.Quantum 1.0.0 | 27 | 34% | 40 |
| wompi.Quokka 1.6 | 13 | 16% | 15 |
| jangs.ns51 1.0 | 2 | 3% | 2 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| kurios.DOSexe .9b | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.4 | 29 / 105 | 3.21 | 15.3% | 13460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.9% | 41 |
| hadur117.nano.SanaroG 0.1 | 2.0 | 15.3% | 29 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.0% | 16 |
| js.PinBall 1.6 | 4.7 | 11.4% | 6 |
| ntc.Opposite 1.5 | 5.0 | 11.0% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.3 | 10.8% | 7 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.4% | 3 |
| PSW.Relentless 0.1 | 8.0 | 5.9% | 0 |
| sample.Fire 1.0 | 9.0 | 4.5% | 1 |
| sample.Target 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 70.8 | 8 / 35 | 4497 |
| 2 | 2 | 63.2 | 75.9 | 8 / 35 | 4254 |
| 3 | 2 | 65.9 | 79.7 | 13 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 18 | 56% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 61% |
| sp.Nanos.Ember 1.1 | 4 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| js.PinBall 1.6 | 2 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 76 of 105 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 25 | 33% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 24% | 30 |
| js.PinBall 1.6 | 13 | 17% | 13 |
| ntc.Opposite 1.5 | 10 | 13% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 8% | 6 |
| sp.Nanos.Ember 1.1 | 2 | 3% | 5 |
| sample.Fire 1.0 | 2 | 3% | 2 |

## Melee bench: F06

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.1 | 63.3 | 16 / 105 | 4.30 | 12.2% | 8906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.6% | 26 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.6% | 18 |
| radnor.DoctorBob 1.42 | 3.0 | 13.4% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.4% | 7 |
| hadur117.nano.SanaroG 0.1 | 4.7 | 12.2% | 16 |
| myl.nano.Graviton 1.10 | 5.7 | 10.7% | 12 |
| stelo.MirrorNano 1.3 | 7.3 | 7.5% | 0 |
| ratosh.Wesco 1.4 | 8.0 | 7.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 7.1% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 64.8 | 5 / 35 | 3367 |
| 2 | 6 | 55.8 | 58.7 | 3 / 35 | 2683 |
| 3 | 4 | 59.1 | 66.3 | 8 / 35 | 2856 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 40% |
| kawigi.nano.Lib 1.0 | 8 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 8 | 63% |
| myl.nano.Graviton 1.10 | 4 | 75% |
| radnor.DoctorBob 1.42 | 3 | 0% |

Hadur died in 90 of 105 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 22% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 20% | 23 |
| kawigi.nano.Lib 1.0 | 14 | 16% | 18 |
| d414.nano.Quantum 1.0.0 | 14 | 16% | 17 |
| myl.nano.Graviton 1.10 | 12 | 13% | 15 |
| stelo.MirrorNano 1.3 | 6 | 7% | 6 |
| ratosh.Wesco 1.4 | 5 | 6% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.3 | 60.7 | 12 / 105 | 4.53 | 11.9% | 9878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 14.6% | 23 |
| nz.jdc.nano.GridFu 1.0 | 2.0 | 13.7% | 21 |
| cb.nano.Insomnia 1.0 | 3.0 | 12.9% | 16 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 12.5% | 17 |
| hadur117.nano.SanaroG 0.1 | 5.3 | 11.9% | 12 |
| mz.Cork 0.1 | 5.7 | 11.3% | 11 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 10.5% | 5 |
| stuff.Vlad 0.1 | 8.3 | 5.2% | 0 |
| stelo.UntouchableNano 1.3 | 8.7 | 4.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.5 | 64.8 | 7 / 35 | 3400 |
| 2 | 5 | 56.6 | 60.6 | 3 / 35 | 3200 |
| 3 | 7 | 55.9 | 56.8 | 2 / 35 | 3278 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mz.Cork 0.1 | 6 | 83% |
| cb.nano.Insomnia 1.0 | 5 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 40% |
| d414.nano.Quantum 1.0.0 | 3 | 67% |
| nz.jdc.nano.GridFu 1.0 | 3 | 33% |
| stelo.UntouchableNano 1.3 | 1 | 0% |
| oog.melee.CapuletDroid 1.1 | 1 | 0% |

Hadur died in 93 of 105 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 21 | 23% | 25 |
| nz.jdc.nano.GridFu 1.0 | 20 | 22% | 21 |
| cb.nano.Insomnia 1.0 | 17 | 18% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 17 |
| mz.Cork 0.1 | 8 | 9% | 15 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 10 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| sample.TrackFire 1.0 | 2 | 2% | 2 |

## Melee bench: F08

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 65.8 | 19 / 105 | 4.08 | 12.9% | 10468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.6% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.4% | 14 |
| hadur117.nano.SanaroG 0.1 | 3.3 | 12.9% | 19 |
| gh.nano.Grofvuil 0.2 | 3.7 | 12.6% | 8 |
| djdjdj.NanoSkunk10 1.0 | 5.3 | 10.7% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 10.7% | 1 |
| baal.nano.N 1.42 | 7.0 | 9.4% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.3 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 8.7 | 4.9% | 2 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 62.5 | 8 / 35 | 3818 |
| 2 | 3 | 61.3 | 71.4 | 9 / 35 | 3298 |
| 3 | 4 | 58.5 | 63.5 | 2 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 17 | 53% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 62% |
| gh.nano.Grofvuil 0.2 | 4 | 25% |
| djdjdj.NanoSkunk10 1.0 | 3 | 0% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 88 of 105 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 27 | 31% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 24% | 28 |
| gh.nano.Grofvuil 0.2 | 14 | 16% | 15 |
| djdjdj.NanoSkunk10 1.0 | 10 | 11% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 8% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 6% | 5 |
| baal.nano.N 1.42 | 3 | 3% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.0 | 58.7 | 14 / 105 | 4.71 | 11.6% | 8729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 13.1% | 16 |
| mld.DustBunny 3.8 | 3.3 | 11.7% | 13 |
| hadur117.nano.SanaroG 0.1 | 3.7 | 11.6% | 14 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 11.3% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 11.3% | 13 |
| stelo.SoRobotNanoMelee 1.2 | 4.7 | 11.1% | 17 |
| wee.Gem 1.8.4 | 6.3 | 10.5% | 16 |
| cs.sheldor.Talon 1.1 | 8.7 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 8.7 | 6.7% | 4 |
| step.nanoPri 1.0 | 9.7 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.4 | 55.2 | 3 / 35 | 2587 |
| 2 | 4 | 55.5 | 59.7 | 4 / 35 | 2964 |
| 3 | 2 | 57.1 | 61.3 | 7 / 35 | 3178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 11 | 45% |
| mld.DustBunny 3.8 | 6 | 50% |
| wee.Gem 1.8.4 | 5 | 0% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 67% |
| d414.nano.Quantum 1.0.0 | 3 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 100% |

Hadur died in 92 of 105 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 18 |
| wee.Gem 1.8.4 | 15 | 16% | 18 |
| mld.DustBunny 3.8 | 14 | 15% | 18 |
| d414.nano.Quantum 1.0.0 | 14 | 15% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 13% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 12% | 12 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 5 |
| tj.zombie1n 1.0.1 | 4 | 4% | 4 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 68.8 | 19 / 105 | 3.81 | 13.9% | 11788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 15.6% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.3% | 21 |
| mld.Infinity 2.2 | 2.3 | 15.4% | 38 |
| hadur117.nano.SanaroG 0.1 | 4.0 | 13.9% | 19 |
| ayk.WallHugger 1.0 | 5.3 | 8.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 6.3 | 7.2% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.4% | 1 |
| conscience.Electron 1.3g | 7.3 | 7.1% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 5.5% | 2 |
| sample.RamFire 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 62.1 | 71.4 | 8 / 35 | 4132 |
| 2 | 4 | 62.1 | 71.4 | 7 / 35 | 3926 |
| 3 | 4 | 59.0 | 63.5 | 4 / 35 | 3730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 12 | 8% |
| d414.nano.Quantum 1.0.0 | 12 | 75% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 55% |
| ayk.WallHugger 1.0 | 2 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 86 of 105 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 34% | 36 |
| d414.nano.Quantum 1.0.0 | 25 | 29% | 38 |
| mld.Infinity 2.2 | 16 | 19% | 6 |
| robar.nano.Assertive_Melee 0.2 | 5 | 6% | 7 |
| conscience.Electron 1.3g | 5 | 6% | 5 |
| ayk.WallHugger 1.0 | 2 | 2% | 7 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| donjezza.Jezza 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.0 | 59.5 | 16 / 105 | 4.65 | 11.8% | 9053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.5% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.3% | 22 |
| oog.melee.Corsair 1.0 | 3.3 | 13.1% | 16 |
| hadur117.nano.SanaroG 0.1 | 3.7 | 11.8% | 16 |
| mz.NanoGod 2.02 | 4.0 | 11.4% | 9 |
| DBall.NUKE 0.1 | 6.7 | 8.1% | 5 |
| awesomeness.Elite 1.0 | 7.0 | 8.2% | 4 |
| sample.Walls 1.0 | 8.0 | 6.3% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 7.8% | 0 |
| stelo.PianistNano 1.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.9 | 65.1 | 6 / 35 | 2957 |
| 2 | 4 | 56.5 | 61.0 | 5 / 35 | 3044 |
| 3 | 4 | 53.5 | 52.4 | 5 / 35 | 3052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 11 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 9 | 44% |
| oog.melee.Corsair 1.0 | 7 | 57% |
| DBall.NUKE 0.1 | 3 | 67% |
| awesomeness.Elite 1.0 | 1 | 0% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 89 of 105 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 20% | 22 |
| d414.nano.Quantum 1.0.0 | 17 | 19% | 24 |
| mz.NanoGod 2.02 | 16 | 18% | 16 |
| oog.melee.Corsair 1.0 | 13 | 15% | 17 |
| sample.Walls 1.0 | 7 | 8% | 7 |
| awesomeness.Elite 1.0 | 6 | 7% | 6 |
| zyx.nano.BacillusComma 1.0 | 5 | 6% | 5 |
| stelo.PianistNano 1.2 | 5 | 6% | 5 |
| DBall.NUKE 0.1 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 3 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 60.2 | 9 / 105 | 4.58 | 11.7% | 8918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.8% | 24 |
| sul.Lunar 1.1 | 3.3 | 12.4% | 17 |
| hadur117.nano.SanaroG 0.1 | 4.0 | 11.7% | 9 |
| myl.nano.KomoriNinja 1.1 | 4.3 | 10.3% | 8 |
| spinnercat.Omen 1.0 | 7.0 | 8.2% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 0 |
| sam.Samspin 1.0 | 8.0 | 7.4% | 4 |
| sample.SpinBot 1.0 | 8.0 | 7.5% | 4 |
| cvt.Firsty 1.0 | 10.0 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.7 | 55.2 | 0 / 35 | 2750 |
| 2 | 3 | 56.2 | 61.3 | 6 / 35 | 2757 |
| 3 | 4 | 58.0 | 64.1 | 3 / 35 | 3411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 10 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 0% |
| myl.nano.KomoriNinja 1.1 | 3 | 67% |
| sample.SpinBot 1.0 | 2 | 50% |
| sul.Lunar 1.1 | 2 | 0% |
| sam.Samspin 1.0 | 1 | 0% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 96 of 105 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 26% | 25 |
| d414.nano.Quantum 1.0.0 | 14 | 15% | 19 |
| sul.Lunar 1.1 | 14 | 15% | 15 |
| myl.nano.KomoriNinja 1.1 | 10 | 10% | 12 |
| sample.SpinBot 1.0 | 9 | 9% | 9 |
| maribo.melee.BMV 0.1 | 9 | 9% | 9 |
| spinnercat.Omen 1.0 | 8 | 8% | 9 |
| cvt.Firsty 1.0 | 5 | 5% | 5 |
| sam.Samspin 1.0 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.nano.SanaroG 0.1 against 9 opponents at once, 35 rounds per battle, 3 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v180, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 3 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 64.3 | 20 / 105 | 4.21 | 12.4% | 8885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.2% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.3 | 14.0% | 17 |
| hadur117.nano.SanaroG 0.1 | 3.0 | 12.4% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.3 | 11.1% | 14 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 7 |
| tvv.nano.Polaris 1.2 | 6.7 | 9.1% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 8.3% | 3 |
| arthord.NanoSatanMelee Beta | 7.3 | 8.6% | 3 |
| amz.NanoClone 1.41 | 8.3 | 7.5% | 2 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 58.7 | 69.2 | 7 / 35 | 2892 |
| 2 | 4 | 58.7 | 67.0 | 7 / 35 | 2887 |
| 3 | 3 | 55.2 | 56.8 | 6 / 35 | 3106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 13 | 46% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 33% |
| tvv.nano.Polaris 1.2 | 5 | 40% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| mld.Wisdom 1.0 | 2 | 0% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| amz.NanoClone 1.41 | 2 | 50% |

Hadur died in 85 of 105 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Wisdom 1.0 | 17 | 20% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 19% | 22 |
| d414.nano.Quantum 1.0.0 | 12 | 14% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 13% | 13 |
| arthord.NanoSatanMelee Beta | 11 | 13% | 11 |
| amz.NanoClone 1.41 | 7 | 8% | 9 |
| tvv.nano.Polaris 1.2 | 5 | 6% | 6 |
| zyx.nano.Ant 1.1 | 4 | 5% | 6 |
| arthord.MannyPacquiao Beta | 2 | 2% | 2 |

