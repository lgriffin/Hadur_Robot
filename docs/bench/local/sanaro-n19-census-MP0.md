# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 62.7 | 14 / 140 | 4.36 | 12.0% | 11838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.6% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 14.2% | 36 |
| bzdp.Pansy 2.1 | 3.8 | 11.9% | 9 |
| hadur117.nano.SanaroMP0 0.4 | 3.8 | 12.0% | 14 |
| arthord.NanoSatanMelee Beta | 6.0 | 10.0% | 10 |
| tvv.nano.Polaris 1.2 | 6.3 | 9.7% | 11 |
| fm.claire 1.7 | 6.5 | 8.8% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 8.2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.7% | 5 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 61.0 | 3 / 35 | 2834 |
| 2 | 3 | 59.0 | 68.9 | 8 / 35 | 2703 |
| 3 | 5 | 54.8 | 56.2 | 1 / 35 | 3327 |
| 4 | 3 | 57.6 | 64.8 | 2 / 35 | 2974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 35% |
| d414.nano.Quantum 1.0.0 | 15 | 13% |
| tvv.nano.Polaris 1.2 | 3 | 0% |
| bzdp.Pansy 2.1 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 126 of 140 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 40 | 32% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 23% | 34 |
| arthord.NanoSatanMelee Beta | 13 | 10% | 16 |
| bzdp.Pansy 2.1 | 11 | 9% | 15 |
| zyx.nano.Ant 1.1 | 10 | 8% | 11 |
| tvv.nano.Polaris 1.2 | 10 | 8% | 10 |
| fm.claire 1.7 | 8 | 6% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 3% | 4 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |

## Melee bench: F02

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 68.7 | 15 / 140 | 3.82 | 12.5% | 9804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.5% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.7% | 20 |
| hadur117.nano.SanaroMP0 0.4 | 3.5 | 12.5% | 15 |
| simonton.nano.MeleeSeed 1.8 | 3.8 | 12.9% | 21 |
| DBall.Anarchy 0.1 | 4.8 | 10.9% | 26 |
| stelo.SoJNanoMelee 1.1 | 6.0 | 9.9% | 22 |
| fm.mammillarias 1.3 | 6.5 | 9.8% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.6% | 0 |
| sample.MyFirstRobot 1.0 | 8.8 | 7.0% | 9 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 67.3 | 3 / 35 | 2635 |
| 2 | 3 | 59.5 | 73.7 | 5 / 35 | 2310 |
| 3 | 5 | 55.0 | 60.0 | 2 / 35 | 2238 |
| 4 | 2 | 60.5 | 73.7 | 5 / 35 | 2621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 21% |
| d414.nano.Quantum 1.0.0 | 12 | 42% |
| stelo.SoJNanoMelee 1.1 | 11 | 18% |
| DBall.Anarchy 0.1 | 8 | 25% |
| sample.MyFirstRobot 1.0 | 4 | 25% |
| simonton.nano.MeleeSeed 1.8 | 3 | 67% |

Hadur died in 125 of 140 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 25% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 25% | 34 |
| simonton.nano.MeleeSeed 1.8 | 17 | 14% | 20 |
| stelo.SoJNanoMelee 1.1 | 14 | 11% | 15 |
| fm.mammillarias 1.3 | 14 | 11% | 14 |
| DBall.Anarchy 0.1 | 10 | 8% | 12 |
| sample.MyFirstRobot 1.0 | 4 | 3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 3% | 4 |

## Melee bench: F03

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 61.8 | 7 / 140 | 4.44 | 12.0% | 13780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.5 | 14.9% | 36 |
| d414.nano.Quantum 1.0.0 | 1.5 | 16.1% | 51 |
| hadur117.nano.SanaroMP0 0.4 | 3.8 | 12.0% | 7 |
| ratosh.Nobo 0.21 | 4.0 | 11.7% | 6 |
| ahf.NanoAndrew .4 | 4.3 | 11.8% | 19 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.6% | 6 |
| stelo.PatternRobot 1.0 | 7.0 | 7.6% | 12 |
| repositorio.NanoStep 1.0 | 8.3 | 6.0% | 3 |
| sample.Crazy 1.0 | 8.8 | 5.8% | 1 |
| kurios.DOSexe .9a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.8 | 64.4 | 2 / 35 | 3277 |
| 2 | 5 | 53.8 | 53.3 | 0 / 35 | 3507 |
| 3 | 3 | 59.1 | 68.9 | 2 / 35 | 3452 |
| 4 | 3 | 56.5 | 60.6 | 3 / 35 | 3544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 20 | 20% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 0% |
| stelo.PatternRobot 1.0 | 4 | 25% |
| ratosh.Nobo 0.21 | 1 | 100% |
| ahf.NanoAndrew .4 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 0% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 133 of 140 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 24% | 32 |
| d414.nano.Quantum 1.0.0 | 30 | 23% | 34 |
| ratosh.Nobo 0.21 | 20 | 15% | 22 |
| ahf.NanoAndrew .4 | 19 | 14% | 19 |
| stelo.PatternRobot 1.0 | 14 | 11% | 15 |
| timmit.nano.TimDog 0.33 | 12 | 9% | 12 |
| repositorio.NanoStep 1.0 | 4 | 3% | 4 |
| kurios.DOSexe .9a | 2 | 2% | 2 |

## Melee bench: F04

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 76.0 | 23 / 140 | 3.16 | 15.2% | 19409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.9% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 16.1% | 38 |
| hadur117.nano.SanaroMP0 0.4 | 3.3 | 15.2% | 23 |
| wompi.Quokka 1.6 | 3.5 | 14.9% | 21 |
| kurios.DOSexe .9b | 5.8 | 6.8% | 0 |
| maribo.FollowFire 1 | 6.0 | 7.1% | 0 |
| jangs.ns51 1.0 | 7.5 | 5.8% | 0 |
| sample.VelociRobot 1.0 | 8.0 | 5.9% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 8.0 | 5.8% | 2 |
| drd.Dreadknoght 0.9 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 64.2 | 77.1 | 2 / 35 | 5027 |
| 2 | 3 | 63.3 | 74.9 | 6 / 35 | 4615 |
| 3 | 4 | 63.6 | 73.0 | 5 / 35 | 4868 |
| 4 | 2 | 65.1 | 78.7 | 10 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 6% |
| d414.nano.Quantum 1.0.0 | 23 | 26% |
| wompi.Quokka 1.6 | 18 | 67% |
| sample.VelociRobot 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 118 of 140 rounds, at a mean tick of 1183. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 35% | 45 |
| d414.nano.Quantum 1.0.0 | 39 | 33% | 49 |
| wompi.Quokka 1.6 | 30 | 25% | 36 |
| kurios.DOSexe .9b | 4 | 3% | 4 |
| sample.VelociRobot 1.0 | 2 | 2% | 3 |
| maribo.FollowFire 1 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 67.5 | 16 / 140 | 3.93 | 12.8% | 14742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.3% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.0 | 15.7% | 36 |
| hadur117.nano.SanaroMP0 0.4 | 3.8 | 12.8% | 16 |
| ntc.Opposite 1.5 | 4.0 | 12.3% | 6 |
| js.PinBall 1.6 | 4.5 | 12.0% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 10.3% | 6 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.2% | 5 |
| sample.Fire 1.0 | 8.0 | 4.7% | 1 |
| PSW.Relentless 0.1 | 9.0 | 4.3% | 0 |
| sample.Target 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.8 | 62.2 | 1 / 35 | 3387 |
| 2 | 3 | 62.2 | 73.3 | 4 / 35 | 4260 |
| 3 | 4 | 60.4 | 68.6 | 5 / 35 | 3638 |
| 4 | 3 | 59.5 | 65.7 | 6 / 35 | 3457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 19 | 5% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 16% |
| ntc.Opposite 1.5 | 6 | 100% |
| js.PinBall 1.6 | 4 | 75% |
| sp.Nanos.Ember 1.1 | 3 | 100% |

Hadur died in 125 of 140 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 42 | 34% | 43 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 30% | 41 |
| simonton.nano.WeekendObsession_Melee 1.0 | 15 | 12% | 18 |
| ntc.Opposite 1.5 | 13 | 10% | 17 |
| js.PinBall 1.6 | 11 | 9% | 15 |
| PSW.Relentless 0.1 | 3 | 2% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.4 | 65.4 | 10 / 140 | 4.11 | 12.3% | 12176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 2.0 | 14.3% | 33 |
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.6% | 23 |
| kawigi.nano.Lib 1.0 | 4.0 | 12.6% | 25 |
| hadur117.nano.SanaroMP0 0.4 | 4.5 | 12.3% | 10 |
| myl.nano.Graviton 1.10 | 6.0 | 10.2% | 11 |
| squidM.TentalceMeleeNano 1.1 | 7.8 | 7.6% | 2 |
| stelo.MirrorNano 1.3 | 8.0 | 7.4% | 0 |
| ratosh.Wesco 1.4 | 8.3 | 6.9% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.8 | 66.0 | 2 / 35 | 3189 |
| 2 | 5 | 57.0 | 62.2 | 1 / 35 | 2999 |
| 3 | 4 | 58.5 | 64.4 | 4 / 35 | 3000 |
| 4 | 4 | 59.3 | 68.9 | 3 / 35 | 2988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 11 | 45% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 10% |
| kawigi.nano.Lib 1.0 | 10 | 10% |
| d414.nano.Quantum 1.0.0 | 8 | 13% |
| myl.nano.Graviton 1.10 | 2 | 100% |

Hadur died in 130 of 140 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 29 | 22% | 34 |
| d414.nano.Quantum 1.0.0 | 26 | 20% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 18% | 27 |
| kawigi.nano.Lib 1.0 | 22 | 17% | 22 |
| myl.nano.Graviton 1.10 | 11 | 8% | 12 |
| stelo.MirrorNano 1.3 | 9 | 7% | 9 |
| squidM.TentalceMeleeNano 1.1 | 5 | 4% | 5 |
| ratosh.Wesco 1.4 | 4 | 3% | 4 |

## Melee bench: F07

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 61.8 | 20 / 140 | 4.44 | 11.9% | 12525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 14.6% | 35 |
| nz.jdc.nano.GridFu 1.0 | 2.0 | 13.9% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.8 | 12.4% | 15 |
| cb.nano.Insomnia 1.0 | 4.0 | 11.9% | 12 |
| hadur117.nano.SanaroMP0 0.4 | 4.5 | 11.9% | 20 |
| mz.Cork 0.1 | 6.3 | 10.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 6.5 | 10.4% | 13 |
| stuff.Vlad 0.1 | 8.3 | 5.4% | 0 |
| stelo.UntouchableNano 1.3 | 8.8 | 5.6% | 2 |
| sample.TrackFire 1.0 | 10.0 | 3.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 58.4 | 3 / 35 | 3263 |
| 2 | 5 | 55.2 | 58.7 | 5 / 35 | 2814 |
| 3 | 4 | 58.1 | 64.4 | 5 / 35 | 3138 |
| 4 | 4 | 58.6 | 65.7 | 7 / 35 | 3310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nz.jdc.nano.GridFu 1.0 | 9 | 67% |
| cb.nano.Insomnia 1.0 | 7 | 86% |
| d414.nano.Quantum 1.0.0 | 7 | 0% |
| oog.melee.CapuletDroid 1.1 | 6 | 33% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 5 | 40% |
| mz.Cork 0.1 | 5 | 60% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 120 of 140 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 37 | 31% | 39 |
| nz.jdc.nano.GridFu 1.0 | 18 | 15% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 14% | 21 |
| cb.nano.Insomnia 1.0 | 15 | 13% | 13 |
| mz.Cork 0.1 | 14 | 12% | 17 |
| oog.melee.CapuletDroid 1.1 | 13 | 11% | 17 |
| stuff.Vlad 0.1 | 4 | 3% | 4 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |
| stelo.UntouchableNano 1.3 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 69.6 | 9 / 140 | 3.74 | 12.9% | 13229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 16.0% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 15.6% | 36 |
| gh.nano.Grofvuil 0.2 | 3.3 | 13.3% | 28 |
| hadur117.nano.SanaroMP0 0.4 | 3.8 | 12.9% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 11.1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.3 | 10.0% | 14 |
| baal.nano.N 1.42 | 6.8 | 9.1% | 1 |
| donjezza.Muncho 1.0 | 8.3 | 5.5% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 4.8% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.6 | 69.5 | 1 / 35 | 3426 |
| 2 | 4 | 59.0 | 68.3 | 2 / 35 | 3042 |
| 3 | 3 | 60.7 | 71.4 | 4 / 35 | 3232 |
| 4 | 4 | 60.2 | 69.2 | 2 / 35 | 3529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 10% |
| d414.nano.Quantum 1.0.0 | 20 | 10% |
| djdjdj.NanoSkunk10 1.0 | 5 | 20% |
| gh.nano.Grofvuil 0.2 | 5 | 20% |
| donjezza.Muncho 1.0 | 4 | 25% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 67% |
| baal.nano.N 1.42 | 1 | 0% |

Hadur died in 131 of 140 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 36 | 27% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 27% | 38 |
| gh.nano.Grofvuil 0.2 | 28 | 21% | 30 |
| djdjdj.NanoSkunk10 1.0 | 13 | 10% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 7% | 10 |
| baal.nano.N 1.42 | 6 | 5% | 6 |
| donjezza.Muncho 1.0 | 3 | 2% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F09

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.9 | 51.5 | 8 / 140 | 5.36 | 9.9% | 9910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 1.3 | 14.5% | 46 |
| d414.nano.Quantum 1.0.0 | 1.8 | 13.2% | 31 |
| wee.Gem 1.8.4 | 4.3 | 10.9% | 17 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.5 | 11.2% | 12 |
| mld.DustBunny 3.8 | 4.8 | 11.1% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 10.3% | 11 |
| hadur117.nano.SanaroMP0 0.4 | 6.3 | 9.9% | 8 |
| cs.sheldor.Talon 1.1 | 8.3 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 8.8 | 6.8% | 5 |
| step.nanoPri 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.6 | 54.3 | 3 / 35 | 2365 |
| 2 | 7 | 49.2 | 47.0 | 1 / 35 | 2389 |
| 3 | 6 | 51.8 | 53.7 | 2 / 35 | 2598 |
| 4 | 7 | 50.9 | 51.1 | 2 / 35 | 2558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 11 | 18% |
| wee.Gem 1.8.4 | 5 | 40% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4 | 25% |
| mld.DustBunny 3.8 | 2 | 0% |
| d414.nano.Quantum 1.0.0 | 2 | 100% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 0% |

Hadur died in 132 of 140 rounds, at a mean tick of 603. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 26 | 20% | 28 |
| d414.nano.Quantum 1.0.0 | 24 | 18% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 14% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 14% | 19 |
| wee.Gem 1.8.4 | 17 | 13% | 19 |
| mld.DustBunny 3.8 | 12 | 9% | 13 |
| cs.sheldor.Talon 1.1 | 8 | 6% | 8 |
| tj.zombie1n 1.0.1 | 4 | 3% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F10

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.3 | 17 / 140 | 3.31 | 14.0% | 14897 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.5 | 16.0% | 48 |
| d414.nano.Quantum 1.0.0 | 2.0 | 15.1% | 31 |
| mld.Infinity 2.2 | 3.0 | 14.5% | 37 |
| hadur117.nano.SanaroMP0 0.4 | 3.5 | 14.0% | 17 |
| robar.nano.Assertive_Melee 0.2 | 5.8 | 8.1% | 2 |
| conscience.Electron 1.3g | 6.5 | 7.8% | 1 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 2 |
| ayk.WallHugger 1.0 | 7.3 | 7.3% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 5.7% | 1 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 73.7 | 6 / 35 | 3880 |
| 2 | 3 | 62.0 | 75.2 | 4 / 35 | 3966 |
| 3 | 4 | 61.6 | 74.6 | 5 / 35 | 3736 |
| 4 | 4 | 60.5 | 73.7 | 2 / 35 | 3315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 10% |
| d414.nano.Quantum 1.0.0 | 12 | 33% |
| mld.Infinity 2.2 | 12 | 25% |
| ayk.WallHugger 1.0 | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| donjezza.Jezza 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |

Hadur died in 123 of 140 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 35% | 48 |
| mld.Infinity 2.2 | 32 | 26% | 33 |
| d414.nano.Quantum 1.0.0 | 28 | 23% | 33 |
| robar.nano.Assertive_Melee 0.2 | 10 | 8% | 11 |
| conscience.Electron 1.3g | 5 | 4% | 5 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 4 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 67.4 | 18 / 140 | 3.94 | 12.8% | 12626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.8% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.5% | 30 |
| hadur117.nano.SanaroMP0 0.4 | 3.5 | 12.8% | 18 |
| oog.melee.Corsair 1.0 | 3.8 | 12.4% | 21 |
| mz.NanoGod 2.02 | 4.3 | 11.7% | 20 |
| awesomeness.Elite 1.0 | 7.0 | 7.7% | 3 |
| zyx.nano.BacillusComma 1.0 | 7.0 | 8.1% | 0 |
| DBall.NUKE 0.1 | 7.8 | 7.3% | 4 |
| sample.Walls 1.0 | 8.3 | 6.5% | 2 |
| stelo.PianistNano 1.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.0 | 63.2 | 4 / 35 | 3059 |
| 2 | 3 | 58.6 | 67.0 | 5 / 35 | 3314 |
| 3 | 2 | 59.3 | 69.8 | 6 / 35 | 3010 |
| 4 | 4 | 59.1 | 69.5 | 3 / 35 | 3243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 32% |
| d414.nano.Quantum 1.0.0 | 11 | 0% |
| oog.melee.Corsair 1.0 | 9 | 11% |
| mz.NanoGod 2.02 | 5 | 40% |
| DBall.NUKE 0.1 | 5 | 80% |
| sample.Walls 1.0 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 122 of 140 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mz.NanoGod 2.02 | 30 | 25% | 31 |
| d414.nano.Quantum 1.0.0 | 29 | 24% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 18% | 29 |
| oog.melee.Corsair 1.0 | 22 | 18% | 22 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 10 |
| awesomeness.Elite 1.0 | 5 | 4% | 7 |
| DBall.NUKE 0.1 | 4 | 3% | 6 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| sample.Walls 1.0 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 4 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 62.5 | 12 / 140 | 4.37 | 11.9% | 11548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.7% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 1.8 | 13.6% | 22 |
| hadur117.nano.SanaroMP0 0.4 | 3.5 | 11.9% | 12 |
| sul.Lunar 1.1 | 4.3 | 11.6% | 26 |
| myl.nano.KomoriNinja 1.1 | 4.5 | 10.9% | 13 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 2 |
| spinnercat.Omen 1.0 | 6.8 | 8.5% | 12 |
| sam.Samspin 1.0 | 7.8 | 8.4% | 4 |
| sample.SpinBot 1.0 | 8.5 | 7.1% | 7 |
| cvt.Firsty 1.0 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 70.5 | 4 / 35 | 3185 |
| 2 | 3 | 56.0 | 61.6 | 3 / 35 | 3008 |
| 3 | 4 | 54.3 | 58.4 | 3 / 35 | 2810 |
| 4 | 4 | 54.1 | 59.7 | 2 / 35 | 2545 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 7% |
| sul.Lunar 1.1 | 13 | 8% |
| d414.nano.Quantum 1.0.0 | 12 | 25% |
| spinnercat.Omen 1.0 | 5 | 80% |
| myl.nano.KomoriNinja 1.1 | 3 | 67% |
| sample.SpinBot 1.0 | 1 | 0% |
| cvt.Firsty 1.0 | 1 | 0% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 129 of 140 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 33 | 26% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 19% | 27 |
| sul.Lunar 1.1 | 20 | 16% | 21 |
| myl.nano.KomoriNinja 1.1 | 13 | 10% | 15 |
| maribo.melee.BMV 0.1 | 10 | 8% | 10 |
| sam.Samspin 1.0 | 8 | 6% | 11 |
| spinnercat.Omen 1.0 | 8 | 6% | 11 |
| sample.SpinBot 1.0 | 8 | 6% | 8 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.nano.SanaroMP0 0.4 against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v242, no other Robocode JVMs running, parallel 3. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 2 over 4 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 66.0 | 13 / 140 | 4.06 | 12.0% | 10970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 1.3 | 14.8% | 40 |
| d414.nano.Quantum 1.0.0 | 2.3 | 14.3% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 13.3% | 26 |
| hadur117.nano.SanaroMP0 0.4 | 4.0 | 12.0% | 13 |
| mld.Wisdom 1.0 | 5.0 | 10.7% | 9 |
| zyx.nano.Ant 1.1 | 7.3 | 8.3% | 2 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.6% | 1 |
| tvv.nano.Polaris 1.2 | 7.8 | 8.0% | 5 |
| amz.NanoClone 1.41 | 7.8 | 7.7% | 3 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.4 | 65.1 | 3 / 35 | 2612 |
| 2 | 4 | 56.0 | 66.0 | 4 / 35 | 2388 |
| 3 | 4 | 55.9 | 62.5 | 1 / 35 | 2837 |
| 4 | 4 | 59.0 | 70.2 | 5 / 35 | 3133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 22% |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 0% |
| d414.nano.Quantum 1.0.0 | 7 | 0% |
| mld.Wisdom 1.0 | 4 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 67% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 128 of 140 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistNanoMelee 1.01 | 32 | 25% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 21% | 30 |
| d414.nano.Quantum 1.0.0 | 21 | 16% | 22 |
| mld.Wisdom 1.0 | 13 | 10% | 17 |
| amz.NanoClone 1.41 | 11 | 9% | 12 |
| zyx.nano.Ant 1.1 | 10 | 8% | 10 |
| arthord.NanoSatanMelee Beta | 8 | 6% | 9 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 8 |

