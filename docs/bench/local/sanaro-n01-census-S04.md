# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 67.2 | 68 / 350 | 3.95 | 13.5% | 34859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.7% | 124 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.5% | 48 |
| hadur117.nano.SanaroS04 0.1 | 3.1 | 13.5% | 68 |
| bzdp.Pansy 2.1 | 3.4 | 12.5% | 55 |
| tvv.nano.Polaris 1.2 | 5.4 | 9.7% | 28 |
| arthord.NanoSatanMelee Beta | 6.4 | 9.1% | 9 |
| zyx.nano.Ant 1.1 | 6.7 | 8.3% | 3 |
| fm.claire 1.7 | 7.7 | 8.0% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 8.8 | 6.4% | 13 |
| arthord.MannyPacquiao Beta | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 65.7 | 3 / 35 | 3163 |
| 2 | 3 | 61.7 | 72.1 | 9 / 35 | 3687 |
| 3 | 2 | 59.8 | 65.4 | 9 / 35 | 3506 |
| 4 | 2 | 62.8 | 75.2 | 8 / 35 | 3800 |
| 5 | 4 | 59.2 | 67.0 | 6 / 35 | 3342 |
| 6 | 4 | 57.3 | 61.9 | 4 / 35 | 3172 |
| 7 | 3 | 60.6 | 67.3 | 9 / 35 | 3529 |
| 8 | 3 | 60.9 | 69.5 | 6 / 35 | 3513 |
| 9 | 3 | 59.4 | 65.1 | 8 / 35 | 3612 |
| 10 | 3 | 58.7 | 63.2 | 6 / 35 | 3535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 74% |
| d414.nano.Quantum 1.0.0 | 38 | 8% |
| bzdp.Pansy 2.1 | 28 | 54% |
| tvv.nano.Polaris 1.2 | 13 | 23% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| fm.claire 1.7 | 3 | 100% |
| zyx.nano.Ant 1.1 | 3 | 67% |

Hadur died in 282 of 350 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 94 | 33% | 98 |
| bzdp.Pansy 2.1 | 64 | 23% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 15% | 79 |
| tvv.nano.Polaris 1.2 | 24 | 9% | 25 |
| arthord.NanoSatanMelee Beta | 23 | 8% | 28 |
| zyx.nano.Ant 1.1 | 14 | 5% | 15 |
| fm.claire 1.7 | 12 | 4% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 3% | 13 |
| arthord.MannyPacquiao Beta | 1 | 0% | 1 |

## Melee bench: F02

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 67.8 | 42 / 350 | 3.90 | 12.9% | 28548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 15.7% | 107 |
| hadur117.nano.SanaroS04 0.1 | 2.9 | 12.9% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.7% | 30 |
| simonton.nano.MeleeSeed 1.8 | 3.4 | 12.8% | 54 |
| DBall.Anarchy 0.1 | 4.7 | 11.5% | 59 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 9.6% | 47 |
| fm.mammillarias 1.3 | 6.8 | 9.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.0 | 6.6% | 10 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.1 | 59.0 | 2 / 35 | 2569 |
| 2 | 2 | 60.0 | 69.2 | 6 / 35 | 2923 |
| 3 | 3 | 61.4 | 72.4 | 5 / 35 | 3240 |
| 4 | 2 | 58.7 | 66.3 | 7 / 35 | 2704 |
| 5 | 2 | 60.6 | 71.4 | 4 / 35 | 2744 |
| 6 | 3 | 59.7 | 68.6 | 7 / 35 | 2787 |
| 7 | 2 | 60.4 | 70.5 | 4 / 35 | 2709 |
| 8 | 4 | 59.3 | 67.6 | 3 / 35 | 3150 |
| 9 | 5 | 56.4 | 60.3 | 1 / 35 | 2640 |
| 10 | 2 | 61.0 | 72.4 | 3 / 35 | 3082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 34 | 12% |
| DBall.Anarchy 0.1 | 22 | 32% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 86% |
| simonton.nano.MeleeSeed 1.8 | 17 | 41% |
| stelo.SoJNanoMelee 1.1 | 17 | 24% |
| fm.mammillarias 1.3 | 3 | 67% |
| sample.MyFirstRobot 1.0 | 2 | 0% |

Hadur died in 308 of 350 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 33% | 107 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 48 | 16% | 69 |
| simonton.nano.MeleeSeed 1.8 | 43 | 14% | 50 |
| stelo.SoJNanoMelee 1.1 | 35 | 11% | 38 |
| DBall.Anarchy 0.1 | 34 | 11% | 40 |
| fm.mammillarias 1.3 | 25 | 8% | 25 |
| sample.MyFirstRobot 1.0 | 10 | 3% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 3% | 9 |
| rrh.Iwillfindyou 2.0 | 2 | 1% | 2 |

## Melee bench: F03

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.3 | 49 / 350 | 4.03 | 13.2% | 37943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.4% | 137 |
| hadur117.nano.SanaroS04 0.1 | 2.8 | 13.2% | 49 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.9 | 13.2% | 36 |
| ahf.NanoAndrew .4 | 3.7 | 12.5% | 62 |
| ratosh.Nobo 0.21 | 4.7 | 11.2% | 14 |
| timmit.nano.TimDog 0.33 | 6.0 | 9.3% | 15 |
| stelo.PatternRobot 1.0 | 7.0 | 7.6% | 21 |
| repositorio.NanoStep 1.0 | 8.3 | 6.0% | 11 |
| sample.Crazy 1.0 | 9.0 | 5.6% | 5 |
| kurios.DOSexe .9a | 9.6 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 68.6 | 5 / 35 | 3754 |
| 2 | 3 | 60.7 | 68.3 | 4 / 35 | 4286 |
| 3 | 4 | 56.8 | 61.6 | 4 / 35 | 3232 |
| 4 | 2 | 61.0 | 71.1 | 10 / 35 | 3675 |
| 5 | 2 | 63.2 | 75.9 | 7 / 35 | 4257 |
| 6 | 3 | 59.2 | 65.7 | 6 / 35 | 3901 |
| 7 | 2 | 58.5 | 64.8 | 4 / 35 | 3625 |
| 8 | 2 | 59.5 | 67.0 | 5 / 35 | 3734 |
| 9 | 5 | 55.6 | 57.5 | 2 / 35 | 3449 |
| 10 | 3 | 58.4 | 62.5 | 2 / 35 | 4030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 52 | 8% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 76% |
| ahf.NanoAndrew .4 | 20 | 35% |
| stelo.PatternRobot 1.0 | 9 | 44% |
| timmit.nano.TimDog 0.33 | 5 | 40% |
| ratosh.Nobo 0.21 | 4 | 75% |
| repositorio.NanoStep 1.0 | 3 | 33% |
| sample.Crazy 1.0 | 2 | 50% |

Hadur died in 301 of 350 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 100 | 33% | 105 |
| ahf.NanoAndrew .4 | 70 | 23% | 78 |
| ratosh.Nobo 0.21 | 36 | 12% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 10% | 55 |
| stelo.PatternRobot 1.0 | 30 | 10% | 34 |
| timmit.nano.TimDog 0.33 | 16 | 5% | 20 |
| repositorio.NanoStep 1.0 | 7 | 2% | 10 |
| sample.Crazy 1.0 | 6 | 2% | 7 |
| kurios.DOSexe .9a | 5 | 2% | 4 |

## Melee bench: F04

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.9 | 87 / 350 | 3.08 | 15.7% | 49615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.5% | 143 |
| hadur117.nano.SanaroS04 0.1 | 2.3 | 15.7% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.3% | 58 |
| wompi.Quokka 1.6 | 3.9 | 14.4% | 47 |
| kurios.DOSexe .9b | 5.5 | 7.6% | 4 |
| maribo.FollowFire 1 | 6.4 | 7.0% | 0 |
| jangs.ns51 1.0 | 7.0 | 6.4% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 7.3 | 6.5% | 7 |
| sample.VelociRobot 1.0 | 8.8 | 5.5% | 1 |
| drd.Dreadknoght 0.9 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 63.7 | 73.7 | 8 / 35 | 4672 |
| 2 | 3 | 64.6 | 76.2 | 9 / 35 | 5118 |
| 3 | 2 | 66.0 | 81.6 | 9 / 35 | 5152 |
| 4 | 2 | 64.7 | 78.7 | 9 / 35 | 4857 |
| 5 | 2 | 63.5 | 74.3 | 7 / 35 | 4706 |
| 6 | 2 | 64.8 | 76.8 | 9 / 35 | 5098 |
| 7 | 2 | 65.0 | 76.5 | 10 / 35 | 5041 |
| 8 | 3 | 63.7 | 71.1 | 9 / 35 | 5061 |
| 9 | 1 | 65.7 | 81.3 | 9 / 35 | 5062 |
| 10 | 2 | 65.0 | 78.4 | 8 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 69 | 17% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 64 | 73% |
| wompi.Quokka 1.6 | 39 | 56% |
| jangs.ns51 1.0 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 263 of 350 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 133 | 51% | 151 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 22% | 105 |
| wompi.Quokka 1.6 | 45 | 17% | 59 |
| maribo.FollowFire 1 | 8 | 3% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 7 | 3% | 8 |
| jangs.ns51 1.0 | 5 | 2% | 7 |
| sample.VelociRobot 1.0 | 4 | 2% | 5 |
| kurios.DOSexe .9b | 3 | 1% | 4 |
| drd.Dreadknoght 0.9 | 1 | 0% | 2 |

## Melee bench: F05

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 75.0 | 96 / 350 | 3.25 | 15.0% | 43948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.1% | 152 |
| hadur117.nano.SanaroS04 0.1 | 2.2 | 15.0% | 96 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 14.4% | 43 |
| ntc.Opposite 1.5 | 4.1 | 12.1% | 19 |
| js.PinBall 1.6 | 5.2 | 10.8% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.7 | 10.4% | 7 |
| sp.Nanos.Ember 1.1 | 7.0 | 7.5% | 7 |
| sample.Fire 1.0 | 8.6 | 4.7% | 1 |
| PSW.Relentless 0.1 | 8.7 | 4.5% | 0 |
| sample.Target 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 79.7 | 11 / 35 | 4418 |
| 2 | 3 | 61.8 | 70.5 | 11 / 35 | 3931 |
| 3 | 1 | 66.6 | 81.0 | 14 / 35 | 4956 |
| 4 | 2 | 62.5 | 72.1 | 8 / 35 | 4201 |
| 5 | 3 | 61.2 | 69.8 | 6 / 35 | 4012 |
| 6 | 2 | 62.8 | 73.3 | 6 / 35 | 4438 |
| 7 | 2 | 64.7 | 79.0 | 11 / 35 | 4481 |
| 8 | 2 | 64.8 | 79.0 | 10 / 35 | 4550 |
| 9 | 2 | 64.1 | 74.3 | 12 / 35 | 4545 |
| 10 | 3 | 62.1 | 71.1 | 7 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 89% |
| d414.nano.Quantum 1.0.0 | 65 | 15% |
| sp.Nanos.Ember 1.1 | 10 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 60% |
| js.PinBall 1.6 | 10 | 30% |
| ntc.Opposite 1.5 | 7 | 71% |

Hadur died in 254 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 105 | 41% | 120 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 20% | 113 |
| ntc.Opposite 1.5 | 45 | 18% | 48 |
| js.PinBall 1.6 | 23 | 9% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 20 | 8% | 26 |
| sp.Nanos.Ember 1.1 | 5 | 2% | 13 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| sample.Fire 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 64.9 | 46 / 350 | 4.16 | 12.6% | 32012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 14.1% | 81 |
| kawigi.nano.Lib 1.0 | 2.1 | 13.9% | 78 |
| radnor.DoctorBob 1.42 | 3.2 | 13.2% | 64 |
| hadur117.nano.SanaroS04 0.1 | 3.8 | 12.6% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.0 | 12.3% | 34 |
| myl.nano.Graviton 1.10 | 6.2 | 10.5% | 35 |
| ratosh.Wesco 1.4 | 7.5 | 7.9% | 8 |
| stelo.MirrorNano 1.3 | 7.7 | 7.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 7.1% | 3 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.1 | 69.5 | 3 / 35 | 3759 |
| 2 | 5 | 57.7 | 61.3 | 4 / 35 | 3251 |
| 3 | 4 | 60.3 | 69.5 | 4 / 35 | 3300 |
| 4 | 5 | 57.7 | 62.5 | 6 / 35 | 2942 |
| 5 | 4 | 57.7 | 61.9 | 5 / 35 | 3080 |
| 6 | 2 | 60.0 | 67.9 | 5 / 35 | 3355 |
| 7 | 6 | 54.1 | 54.3 | 3 / 35 | 2484 |
| 8 | 3 | 59.1 | 65.4 | 4 / 35 | 3219 |
| 9 | 4 | 61.2 | 70.2 | 8 / 35 | 3288 |
| 10 | 4 | 59.9 | 66.0 | 4 / 35 | 3334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 83% |
| kawigi.nano.Lib 1.0 | 28 | 18% |
| d414.nano.Quantum 1.0.0 | 26 | 12% |
| radnor.DoctorBob 1.42 | 23 | 39% |
| myl.nano.Graviton 1.10 | 11 | 36% |
| ratosh.Wesco 1.4 | 1 | 0% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 304 of 350 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 68 | 22% | 74 |
| d414.nano.Quantum 1.0.0 | 64 | 21% | 68 |
| myl.nano.Graviton 1.10 | 54 | 18% | 56 |
| radnor.DoctorBob 1.42 | 43 | 14% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 13% | 65 |
| ratosh.Wesco 1.4 | 15 | 5% | 16 |
| stelo.MirrorNano 1.3 | 12 | 4% | 12 |
| squidM.TentalceMeleeNano 1.1 | 10 | 3% | 11 |

## Melee bench: F07

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.1 | 52 / 350 | 4.05 | 12.8% | 34083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.4 | 14.5% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.8% | 43 |
| hadur117.nano.SanaroS04 0.1 | 3.5 | 12.8% | 52 |
| cb.nano.Insomnia 1.0 | 3.8 | 12.5% | 57 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 12.5% | 57 |
| oog.melee.CapuletDroid 1.1 | 6.0 | 10.9% | 32 |
| mz.Cork 0.1 | 6.1 | 10.8% | 23 |
| stelo.UntouchableNano 1.3 | 8.5 | 5.2% | 4 |
| stuff.Vlad 0.1 | 8.5 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.8 | 60.3 | 3 / 35 | 3269 |
| 2 | 2 | 60.8 | 71.4 | 3 / 35 | 3516 |
| 3 | 5 | 57.8 | 61.9 | 5 / 35 | 3526 |
| 4 | 4 | 57.0 | 60.0 | 5 / 35 | 3215 |
| 5 | 5 | 59.2 | 65.1 | 8 / 35 | 3305 |
| 6 | 2 | 60.4 | 70.2 | 6 / 35 | 3543 |
| 7 | 4 | 58.6 | 66.0 | 4 / 35 | 3431 |
| 8 | 2 | 61.8 | 73.0 | 9 / 35 | 3553 |
| 9 | 4 | 57.4 | 64.1 | 3 / 35 | 3118 |
| 10 | 2 | 60.8 | 69.2 | 6 / 35 | 3607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 30 | 17% |
| cb.nano.Insomnia 1.0 | 30 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 80% |
| nz.jdc.nano.GridFu 1.0 | 20 | 15% |
| oog.melee.CapuletDroid 1.1 | 14 | 43% |
| mz.Cork 0.1 | 3 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 86 | 29% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 18% | 81 |
| nz.jdc.nano.GridFu 1.0 | 47 | 16% | 52 |
| oog.melee.CapuletDroid 1.1 | 39 | 13% | 49 |
| cb.nano.Insomnia 1.0 | 35 | 12% | 24 |
| mz.Cork 0.1 | 25 | 8% | 34 |
| stelo.UntouchableNano 1.3 | 6 | 2% | 7 |
| sample.TrackFire 1.0 | 3 | 1% | 3 |
| stuff.Vlad 0.1 | 3 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 71.2 | 61 / 350 | 3.59 | 13.8% | 36077 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.6% | 116 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 14.3% | 62 |
| hadur117.nano.SanaroS04 0.1 | 2.9 | 13.8% | 61 |
| gh.nano.Grofvuil 0.2 | 3.5 | 12.9% | 50 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 11.2% | 11 |
| djdjdj.NanoSkunk10 1.0 | 5.8 | 10.7% | 42 |
| baal.nano.N 1.42 | 6.9 | 9.2% | 3 |
| donjezza.Muncho 1.0 | 8.5 | 5.3% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.5 | 5.4% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 78.7 | 7 / 35 | 3715 |
| 2 | 3 | 62.0 | 73.7 | 4 / 35 | 3667 |
| 3 | 3 | 61.4 | 71.4 | 7 / 35 | 3369 |
| 4 | 4 | 60.4 | 69.8 | 5 / 35 | 3229 |
| 5 | 3 | 62.1 | 73.3 | 8 / 35 | 3631 |
| 6 | 4 | 59.0 | 67.0 | 2 / 35 | 3360 |
| 7 | 2 | 60.3 | 65.7 | 7 / 35 | 3953 |
| 8 | 4 | 59.4 | 65.7 | 3 / 35 | 3432 |
| 9 | 2 | 62.1 | 73.7 | 8 / 35 | 3694 |
| 10 | 2 | 63.3 | 73.0 | 10 / 35 | 4027 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 48 | 15% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 64% |
| gh.nano.Grofvuil 0.2 | 18 | 44% |
| djdjdj.NanoSkunk10 1.0 | 17 | 53% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| donjezza.Muncho 1.0 | 2 | 50% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 289 of 350 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 106 | 37% | 113 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 19% | 86 |
| gh.nano.Grofvuil 0.2 | 46 | 16% | 53 |
| djdjdj.NanoSkunk10 1.0 | 36 | 12% | 43 |
| dmh.robocode.robot.RedDwarf 0.4 | 27 | 9% | 33 |
| baal.nano.N 1.42 | 11 | 4% | 12 |
| donjezza.Muncho 1.0 | 5 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 1% | 4 |

## Melee bench: F09

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.6 | 60.6 | 47 / 350 | 4.54 | 11.9% | 28922 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.7 | 13.0% | 70 |
| stelo.SoRobotNanoMelee 1.2 | 2.3 | 12.3% | 73 |
| hadur117.nano.SanaroS04 0.1 | 3.4 | 11.9% | 47 |
| mld.DustBunny 3.8 | 3.7 | 11.9% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.8 | 11.1% | 27 |
| wee.Gem 1.8.4 | 5.5 | 10.8% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 6.7 | 9.5% | 25 |
| tj.zombie1n 1.0.1 | 8.5 | 7.1% | 16 |
| cs.sheldor.Talon 1.1 | 8.8 | 7.0% | 0 |
| step.nanoPri 1.0 | 9.6 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 54.2 | 57.8 | 5 / 35 | 2701 |
| 2 | 3 | 56.2 | 59.4 | 6 / 35 | 3195 |
| 3 | 4 | 54.2 | 59.4 | 3 / 35 | 2604 |
| 4 | 1 | 59.7 | 71.1 | 5 / 35 | 3222 |
| 5 | 3 | 57.0 | 63.8 | 6 / 35 | 2822 |
| 6 | 4 | 53.9 | 58.1 | 4 / 35 | 2608 |
| 7 | 3 | 56.2 | 62.2 | 4 / 35 | 2944 |
| 8 | 4 | 53.5 | 56.8 | 3 / 35 | 2737 |
| 9 | 4 | 54.6 | 57.5 | 3 / 35 | 3055 |
| 10 | 4 | 56.7 | 60.3 | 8 / 35 | 3034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.SoRobotNanoMelee 1.2 | 23 | 22% |
| d414.nano.Quantum 1.0.0 | 22 | 14% |
| mld.DustBunny 3.8 | 20 | 60% |
| wee.Gem 1.8.4 | 16 | 50% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 77% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 67% |
| tj.zombie1n 1.0.1 | 5 | 40% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 303 of 350 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 68 | 22% | 72 |
| stelo.SoRobotNanoMelee 1.2 | 54 | 18% | 58 |
| mld.DustBunny 3.8 | 52 | 17% | 66 |
| wee.Gem 1.8.4 | 36 | 12% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 31 | 10% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 10% | 40 |
| cs.sheldor.Talon 1.1 | 15 | 5% | 16 |
| tj.zombie1n 1.0.1 | 12 | 4% | 11 |
| step.nanoPri 1.0 | 5 | 2% | 5 |

## Melee bench: F10

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 73.5 | 75 / 350 | 3.39 | 14.6% | 41076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.0% | 120 |
| hadur117.nano.SanaroS04 0.1 | 2.7 | 14.6% | 75 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 14.3% | 57 |
| mld.Infinity 2.2 | 3.5 | 14.1% | 79 |
| conscience.Electron 1.3g | 6.0 | 7.8% | 1 |
| ayk.WallHugger 1.0 | 6.2 | 7.9% | 6 |
| exauge.GateKeeper 1.1.121g | 6.9 | 7.3% | 5 |
| robar.nano.Assertive_Melee 0.2 | 6.9 | 7.4% | 1 |
| donjezza.Jezza 1.0 | 9.2 | 5.7% | 6 |
| sample.RamFire 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 63.5 | 75.6 | 8 / 35 | 4226 |
| 2 | 3 | 62.1 | 73.0 | 5 / 35 | 4108 |
| 3 | 3 | 61.4 | 70.2 | 5 / 35 | 4189 |
| 4 | 3 | 62.3 | 71.4 | 6 / 35 | 4176 |
| 5 | 2 | 64.0 | 78.7 | 9 / 35 | 3861 |
| 6 | 2 | 63.7 | 76.5 | 11 / 35 | 4234 |
| 7 | 3 | 60.2 | 69.2 | 5 / 35 | 3828 |
| 8 | 3 | 61.7 | 69.5 | 8 / 35 | 4206 |
| 9 | 2 | 62.9 | 76.5 | 9 / 35 | 4076 |
| 10 | 2 | 62.9 | 74.0 | 9 / 35 | 4172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 63% |
| mld.Infinity 2.2 | 50 | 50% |
| d414.nano.Quantum 1.0.0 | 50 | 16% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 33% |
| ayk.WallHugger 1.0 | 2 | 50% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| sample.RamFire 1.0 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 0% |

Hadur died in 275 of 350 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 103 | 37% | 129 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 73 | 27% | 120 |
| mld.Infinity 2.2 | 43 | 16% | 29 |
| robar.nano.Assertive_Melee 0.2 | 19 | 7% | 19 |
| ayk.WallHugger 1.0 | 16 | 6% | 22 |
| exauge.GateKeeper 1.1.121g | 8 | 3% | 13 |
| conscience.Electron 1.3g | 8 | 3% | 9 |
| donjezza.Jezza 1.0 | 5 | 2% | 8 |

## Melee bench: F11

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 66.3 | 71 / 350 | 4.03 | 13.1% | 32996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 15.9% | 119 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.0% | 33 |
| hadur117.nano.SanaroS04 0.1 | 2.7 | 13.1% | 71 |
| oog.melee.Corsair 1.0 | 3.7 | 12.3% | 44 |
| mz.NanoGod 2.02 | 5.0 | 11.2% | 36 |
| DBall.NUKE 0.1 | 6.5 | 8.4% | 28 |
| awesomeness.Elite 1.0 | 7.4 | 7.8% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.7 | 7.4% | 1 |
| sample.Walls 1.0 | 8.3 | 7.0% | 16 |
| stelo.PianistNano 1.2 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.1 | 62.5 | 5 / 35 | 3386 |
| 2 | 2 | 61.2 | 70.8 | 9 / 35 | 3463 |
| 3 | 2 | 61.6 | 70.8 | 11 / 35 | 3565 |
| 4 | 3 | 56.0 | 61.0 | 4 / 35 | 2815 |
| 5 | 2 | 60.5 | 68.9 | 9 / 35 | 3585 |
| 6 | 3 | 59.1 | 64.4 | 9 / 35 | 3358 |
| 7 | 2 | 59.5 | 67.6 | 8 / 35 | 3490 |
| 8 | 2 | 60.7 | 72.4 | 8 / 35 | 3121 |
| 9 | 3 | 58.5 | 64.8 | 4 / 35 | 3437 |
| 10 | 4 | 55.5 | 60.3 | 4 / 35 | 2776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 47 | 85% |
| d414.nano.Quantum 1.0.0 | 30 | 17% |
| oog.melee.Corsair 1.0 | 16 | 44% |
| DBall.NUKE 0.1 | 13 | 46% |
| mz.NanoGod 2.02 | 11 | 45% |
| sample.Walls 1.0 | 9 | 56% |
| awesomeness.Elite 1.0 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 281 of 350 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 92 | 33% | 102 |
| oog.melee.Corsair 1.0 | 41 | 15% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 13% | 76 |
| mz.NanoGod 2.02 | 35 | 12% | 42 |
| zyx.nano.BacillusComma 1.0 | 23 | 8% | 24 |
| DBall.NUKE 0.1 | 19 | 7% | 21 |
| awesomeness.Elite 1.0 | 18 | 6% | 18 |
| sample.Walls 1.0 | 15 | 5% | 18 |
| stelo.PianistNano 1.2 | 1 | 0% | 1 |

## Melee bench: F12

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 63.4 | 58 / 350 | 4.29 | 12.6% | 32163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.6% | 106 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.6 | 13.3% | 46 |
| hadur117.nano.SanaroS04 0.1 | 3.0 | 12.6% | 58 |
| myl.nano.KomoriNinja 1.1 | 3.5 | 12.2% | 47 |
| sul.Lunar 1.1 | 4.6 | 11.1% | 41 |
| maribo.melee.BMV 0.1 | 7.0 | 8.4% | 2 |
| spinnercat.Omen 1.0 | 7.1 | 8.0% | 15 |
| sam.Samspin 1.0 | 7.9 | 8.0% | 13 |
| sample.SpinBot 1.0 | 8.0 | 7.5% | 16 |
| cvt.Firsty 1.0 | 10.0 | 4.4% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 51.8 | 50.2 | 3 / 35 | 2815 |
| 2 | 5 | 53.9 | 55.2 | 5 / 35 | 2980 |
| 3 | 2 | 59.9 | 69.2 | 6 / 35 | 3234 |
| 4 | 1 | 61.6 | 73.3 | 8 / 35 | 3640 |
| 5 | 2 | 59.5 | 69.5 | 8 / 35 | 3214 |
| 6 | 4 | 54.2 | 57.5 | 3 / 35 | 2884 |
| 7 | 3 | 59.0 | 66.0 | 6 / 35 | 3480 |
| 8 | 3 | 55.7 | 58.7 | 6 / 35 | 3195 |
| 9 | 3 | 59.3 | 66.0 | 5 / 35 | 3419 |
| 10 | 2 | 59.7 | 68.6 | 8 / 35 | 3302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 77% |
| d414.nano.Quantum 1.0.0 | 26 | 15% |
| sul.Lunar 1.1 | 19 | 37% |
| myl.nano.KomoriNinja 1.1 | 16 | 44% |
| spinnercat.Omen 1.0 | 8 | 50% |
| sample.SpinBot 1.0 | 4 | 75% |
| cvt.Firsty 1.0 | 3 | 33% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 73 | 25% | 77 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 19% | 88 |
| myl.nano.KomoriNinja 1.1 | 51 | 17% | 59 |
| sul.Lunar 1.1 | 35 | 12% | 42 |
| sample.SpinBot 1.0 | 22 | 8% | 24 |
| spinnercat.Omen 1.0 | 18 | 6% | 19 |
| sam.Samspin 1.0 | 16 | 5% | 17 |
| maribo.melee.BMV 0.1 | 16 | 5% | 16 |
| cvt.Firsty 1.0 | 6 | 2% | 7 |

## Melee bench: F13

hadur117.nano.SanaroS04 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.6 | 67.3 | 61 / 350 | 3.94 | 12.9% | 31367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.9 | 14.3% | 105 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.0 | 14.1% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.6% | 35 |
| hadur117.nano.SanaroS04 0.1 | 3.7 | 12.9% | 61 |
| mld.Wisdom 1.0 | 4.3 | 11.6% | 31 |
| amz.NanoClone 1.41 | 7.1 | 8.3% | 5 |
| tvv.nano.Polaris 1.2 | 7.4 | 8.0% | 11 |
| zyx.nano.Ant 1.1 | 7.6 | 7.7% | 7 |
| arthord.NanoSatanMelee Beta | 7.9 | 7.6% | 11 |
| arthord.MannyPacquiao Beta | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.6 | 70.2 | 5 / 35 | 3045 |
| 2 | 3 | 57.6 | 64.4 | 5 / 35 | 3125 |
| 3 | 5 | 56.6 | 60.6 | 4 / 35 | 3220 |
| 4 | 5 | 57.2 | 64.1 | 4 / 35 | 3027 |
| 5 | 3 | 60.0 | 69.5 | 9 / 35 | 2954 |
| 6 | 4 | 58.2 | 66.3 | 5 / 35 | 2928 |
| 7 | 5 | 56.0 | 61.9 | 6 / 35 | 2919 |
| 8 | 1 | 63.8 | 79.7 | 10 / 35 | 3765 |
| 9 | 3 | 59.5 | 70.2 | 5 / 35 | 3221 |
| 10 | 4 | 58.9 | 66.3 | 8 / 35 | 3163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 74% |
| d414.nano.Quantum 1.0.0 | 40 | 13% |
| davidalves.net.DuelistNanoMelee 1.01 | 28 | 21% |
| mld.Wisdom 1.0 | 12 | 33% |
| tvv.nano.Polaris 1.2 | 8 | 75% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 4 | 75% |

Hadur died in 293 of 350 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 72 | 25% | 79 |
| davidalves.net.DuelistNanoMelee 1.01 | 64 | 22% | 69 |
| mld.Wisdom 1.0 | 47 | 16% | 50 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 15% | 80 |
| arthord.NanoSatanMelee Beta | 18 | 6% | 19 |
| amz.NanoClone 1.41 | 18 | 6% | 18 |
| zyx.nano.Ant 1.1 | 13 | 4% | 17 |
| tvv.nano.Polaris 1.2 | 12 | 4% | 14 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |
1 death(s) with no robot to name.

