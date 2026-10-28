# Bench suite: nanomelee-census.txt

## Melee bench: F01

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 68.9 | 62 / 350 | 3.80 | 13.6% | 35413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 16.2% | 142 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 13.6% | 62 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.2% | 53 |
| bzdp.Pansy 2.1 | 3.7 | 12.6% | 45 |
| tvv.nano.Polaris 1.2 | 6.1 | 9.0% | 21 |
| arthord.NanoSatanMelee Beta | 6.3 | 9.0% | 5 |
| zyx.nano.Ant 1.1 | 6.4 | 9.0% | 7 |
| fm.claire 1.7 | 7.2 | 8.4% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.1% | 10 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 76.8 | 8 / 35 | 3965 |
| 2 | 3 | 58.1 | 63.5 | 5 / 35 | 3219 |
| 3 | 2 | 63.5 | 76.8 | 8 / 35 | 3772 |
| 4 | 4 | 58.2 | 66.0 | 2 / 35 | 3133 |
| 5 | 3 | 59.4 | 66.0 | 7 / 35 | 3362 |
| 6 | 2 | 59.4 | 67.9 | 7 / 35 | 3166 |
| 7 | 3 | 59.8 | 67.3 | 4 / 35 | 3799 |
| 8 | 2 | 62.0 | 72.1 | 7 / 35 | 3997 |
| 9 | 2 | 59.7 | 64.8 | 7 / 35 | 3655 |
| 10 | 3 | 60.1 | 67.9 | 7 / 35 | 3345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 46% |
| d414.nano.Quantum 1.0.0 | 38 | 11% |
| bzdp.Pansy 2.1 | 23 | 65% |
| fm.claire 1.7 | 5 | 80% |
| tvv.nano.Polaris 1.2 | 5 | 0% |
| zyx.nano.Ant 1.1 | 5 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| arthord.NanoSatanMelee Beta | 4 | 100% |

Hadur died in 288 of 350 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 102 | 35% | 108 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 20% | 86 |
| bzdp.Pansy 2.1 | 46 | 16% | 62 |
| arthord.NanoSatanMelee Beta | 24 | 8% | 25 |
| zyx.nano.Ant 1.1 | 24 | 8% | 25 |
| fm.claire 1.7 | 16 | 6% | 17 |
| tvv.nano.Polaris 1.2 | 12 | 4% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 2% | 9 |
| arthord.MannyPacquiao Beta | 1 | 0% | 2 |

## Melee bench: F02

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 67.8 | 43 / 350 | 3.89 | 13.0% | 30846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 14.8% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 13.2% | 35 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.0% | 43 |
| simonton.nano.MeleeSeed 1.8 | 3.4 | 12.8% | 47 |
| DBall.Anarchy 0.1 | 4.6 | 11.5% | 63 |
| stelo.SoJNanoMelee 1.1 | 6.2 | 10.0% | 58 |
| fm.mammillarias 1.3 | 6.8 | 9.2% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.1 | 7.5% | 0 |
| sample.MyFirstRobot 1.0 | 8.9 | 6.4% | 5 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 67.0 | 3 / 35 | 2689 |
| 2 | 1 | 61.9 | 74.6 | 7 / 35 | 3302 |
| 3 | 2 | 60.4 | 70.5 | 4 / 35 | 3137 |
| 4 | 4 | 57.8 | 63.8 | 5 / 35 | 2910 |
| 5 | 5 | 56.7 | 60.3 | 3 / 35 | 2636 |
| 6 | 3 | 59.0 | 65.7 | 3 / 35 | 3232 |
| 7 | 3 | 58.4 | 66.7 | 4 / 35 | 2899 |
| 8 | 3 | 59.9 | 68.3 | 3 / 35 | 3326 |
| 9 | 3 | 59.9 | 67.0 | 5 / 35 | 3141 |
| 10 | 2 | 62.2 | 74.6 | 6 / 35 | 3574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 35 | 51% |
| d414.nano.Quantum 1.0.0 | 25 | 12% |
| DBall.Anarchy 0.1 | 25 | 20% |
| simonton.nano.MeleeSeed 1.8 | 19 | 63% |
| stelo.SoJNanoMelee 1.1 | 13 | 23% |
| fm.mammillarias 1.3 | 2 | 50% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 308 of 350 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 91 | 30% | 97 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 60 | 19% | 77 |
| stelo.SoJNanoMelee 1.1 | 40 | 13% | 42 |
| DBall.Anarchy 0.1 | 38 | 12% | 45 |
| simonton.nano.MeleeSeed 1.8 | 36 | 12% | 46 |
| fm.mammillarias 1.3 | 28 | 9% | 28 |
| mn.nano.perceptual.Impact 1.3.0 | 8 | 3% | 7 |
| sample.MyFirstRobot 1.0 | 4 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 3 | 1% | 4 |

## Melee bench: F03

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.3 | 40 / 350 | 4.03 | 13.2% | 38838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 16.2% | 133 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 13.2% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.8 | 13.2% | 43 |
| ahf.NanoAndrew .4 | 3.3 | 12.7% | 61 |
| ratosh.Nobo 0.21 | 5.3 | 10.8% | 17 |
| timmit.nano.TimDog 0.33 | 5.9 | 9.3% | 18 |
| stelo.PatternRobot 1.0 | 6.8 | 8.6% | 26 |
| sample.Crazy 1.0 | 8.4 | 6.0% | 6 |
| repositorio.NanoStep 1.0 | 8.6 | 5.7% | 8 |
| kurios.DOSexe .9a | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 63.5 | 4 / 35 | 3976 |
| 2 | 3 | 59.1 | 67.0 | 5 / 35 | 3623 |
| 3 | 3 | 57.2 | 60.6 | 3 / 35 | 3720 |
| 4 | 4 | 57.4 | 62.5 | 3 / 35 | 3496 |
| 5 | 3 | 58.6 | 64.1 | 3 / 35 | 3797 |
| 6 | 2 | 60.5 | 70.2 | 5 / 35 | 4067 |
| 7 | 1 | 62.4 | 74.0 | 4 / 35 | 4494 |
| 8 | 3 | 58.9 | 63.2 | 4 / 35 | 3999 |
| 9 | 2 | 61.3 | 71.1 | 4 / 35 | 3954 |
| 10 | 3 | 59.4 | 66.7 | 5 / 35 | 3712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 44 | 9% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 35% |
| ahf.NanoAndrew .4 | 18 | 67% |
| stelo.PatternRobot 1.0 | 15 | 47% |
| ratosh.Nobo 0.21 | 7 | 43% |
| timmit.nano.TimDog 0.33 | 5 | 20% |
| repositorio.NanoStep 1.0 | 2 | 50% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 100 | 32% | 103 |
| ahf.NanoAndrew .4 | 55 | 18% | 69 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 14% | 53 |
| ratosh.Nobo 0.21 | 38 | 12% | 41 |
| stelo.PatternRobot 1.0 | 33 | 11% | 37 |
| timmit.nano.TimDog 0.33 | 23 | 7% | 25 |
| sample.Crazy 1.0 | 10 | 3% | 10 |
| repositorio.NanoStep 1.0 | 8 | 3% | 10 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 74.6 | 59 / 350 | 3.29 | 15.2% | 50293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.0 | 17.5% | 151 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.7 | 15.5% | 77 |
| hadur117.nano.SanaroS0 0.1 | 2.7 | 15.2% | 59 |
| wompi.Quokka 1.6 | 3.6 | 14.2% | 48 |
| kurios.DOSexe .9b | 5.8 | 7.3% | 4 |
| maribo.FollowFire 1 | 6.1 | 7.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 7.0 | 6.5% | 4 |
| jangs.ns51 1.0 | 7.6 | 6.4% | 5 |
| sample.VelociRobot 1.0 | 8.5 | 6.0% | 2 |
| drd.Dreadknoght 0.9 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 63.9 | 73.3 | 5 / 35 | 5034 |
| 2 | 2 | 64.4 | 75.2 | 9 / 35 | 5281 |
| 3 | 3 | 61.9 | 70.8 | 4 / 35 | 4494 |
| 4 | 2 | 65.8 | 76.2 | 10 / 35 | 5616 |
| 5 | 2 | 64.4 | 75.9 | 5 / 35 | 5195 |
| 6 | 3 | 61.6 | 69.8 | 3 / 35 | 4894 |
| 7 | 4 | 63.3 | 74.0 | 5 / 35 | 4857 |
| 8 | 2 | 64.8 | 79.4 | 7 / 35 | 5019 |
| 9 | 3 | 63.8 | 75.6 | 4 / 35 | 5082 |
| 10 | 2 | 63.6 | 75.6 | 7 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 72 | 44% |
| d414.nano.Quantum 1.0.0 | 57 | 5% |
| wompi.Quokka 1.6 | 28 | 61% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 33% |
| sample.VelociRobot 1.0 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 293 of 350 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 122 | 42% | 127 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 26% | 110 |
| wompi.Quokka 1.6 | 49 | 17% | 60 |
| maribo.FollowFire 1 | 13 | 4% | 13 |
| jangs.ns51 1.0 | 9 | 3% | 9 |
| kurios.DOSexe .9b | 8 | 3% | 10 |
| sample.MyFirstJuniorRobot 1.0 | 8 | 3% | 10 |
| sample.VelociRobot 1.0 | 6 | 2% | 9 |
| drd.Dreadknoght 0.9 | 2 | 1% | 2 |

## Melee bench: F05

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.6 | 72 / 350 | 3.28 | 14.9% | 44973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.1 | 17.9% | 170 |
| hadur117.nano.SanaroS0 0.1 | 2.4 | 14.9% | 72 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.5 | 14.7% | 54 |
| ntc.Opposite 1.5 | 4.6 | 11.6% | 13 |
| js.PinBall 1.6 | 4.6 | 11.2% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.8 | 10.3% | 9 |
| sp.Nanos.Ember 1.1 | 7.1 | 7.2% | 9 |
| PSW.Relentless 0.1 | 8.4 | 4.4% | 0 |
| sample.Fire 1.0 | 8.7 | 4.5% | 1 |
| sample.Target 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 72.7 | 3 / 35 | 3889 |
| 2 | 2 | 64.8 | 76.2 | 7 / 35 | 4984 |
| 3 | 3 | 63.6 | 73.0 | 7 / 35 | 4539 |
| 4 | 3 | 61.7 | 71.1 | 6 / 35 | 4042 |
| 5 | 2 | 63.8 | 74.3 | 8 / 35 | 4835 |
| 6 | 3 | 62.2 | 74.0 | 5 / 35 | 4001 |
| 7 | 2 | 64.7 | 77.8 | 7 / 35 | 4958 |
| 8 | 2 | 64.6 | 77.1 | 11 / 35 | 4528 |
| 9 | 3 | 62.4 | 71.4 | 6 / 35 | 4374 |
| 10 | 1 | 65.0 | 78.7 | 12 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 71 | 6% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 64 | 58% |
| js.PinBall 1.6 | 14 | 64% |
| sp.Nanos.Ember 1.1 | 11 | 91% |
| ntc.Opposite 1.5 | 8 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |

Hadur died in 279 of 350 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 130 | 47% | 135 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 19% | 93 |
| ntc.Opposite 1.5 | 33 | 12% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 29 | 10% | 31 |
| js.PinBall 1.6 | 23 | 8% | 35 |
| sp.Nanos.Ember 1.1 | 7 | 3% | 14 |
| PSW.Relentless 0.1 | 3 | 1% | 3 |
| sample.Fire 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 63.8 | 37 / 350 | 4.25 | 12.3% | 32059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 1.8 | 14.5% | 94 |
| d414.nano.Quantum 1.0.0 | 2.1 | 14.0% | 82 |
| radnor.DoctorBob 1.42 | 2.9 | 13.5% | 61 |
| hadur117.nano.SanaroS0 0.1 | 4.0 | 12.3% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 4.4 | 12.2% | 33 |
| myl.nano.Graviton 1.10 | 5.8 | 10.5% | 33 |
| squidM.TentalceMeleeNano 1.1 | 7.7 | 7.5% | 2 |
| ratosh.Wesco 1.4 | 8.1 | 7.4% | 7 |
| stelo.MirrorNano 1.3 | 8.2 | 7.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.3 | 64.1 | 8 / 35 | 3395 |
| 2 | 5 | 56.7 | 59.0 | 3 / 35 | 3026 |
| 3 | 3 | 60.2 | 68.3 | 5 / 35 | 3360 |
| 4 | 5 | 57.7 | 62.5 | 3 / 35 | 3128 |
| 5 | 4 | 57.6 | 63.2 | 3 / 35 | 2983 |
| 6 | 4 | 56.7 | 60.3 | 3 / 35 | 2968 |
| 7 | 5 | 57.3 | 60.3 | 3 / 35 | 3325 |
| 8 | 3 | 60.6 | 69.2 | 5 / 35 | 3246 |
| 9 | 3 | 59.6 | 64.8 | 4 / 35 | 3481 |
| 10 | 5 | 59.0 | 66.7 | 0 / 35 | 3147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 31 | 6% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 44% |
| kawigi.nano.Lib 1.0 | 24 | 8% |
| radnor.DoctorBob 1.42 | 20 | 55% |
| myl.nano.Graviton 1.10 | 12 | 42% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 313 of 350 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 77 | 25% | 79 |
| d414.nano.Quantum 1.0.0 | 73 | 23% | 79 |
| radnor.DoctorBob 1.42 | 54 | 17% | 65 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 14% | 55 |
| myl.nano.Graviton 1.10 | 30 | 10% | 33 |
| ratosh.Wesco 1.4 | 14 | 4% | 16 |
| squidM.TentalceMeleeNano 1.1 | 11 | 4% | 12 |
| stelo.MirrorNano 1.3 | 9 | 3% | 11 |

## Melee bench: F07

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 65.5 | 54 / 350 | 4.10 | 12.7% | 34041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 2.0 | 14.2% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.3 | 13.3% | 67 |
| nz.jdc.nano.GridFu 1.0 | 2.7 | 13.3% | 67 |
| hadur117.nano.SanaroS0 0.1 | 3.7 | 12.7% | 54 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.7% | 38 |
| oog.melee.CapuletDroid 1.1 | 5.8 | 10.7% | 26 |
| mz.Cork 0.1 | 6.5 | 10.3% | 20 |
| stelo.UntouchableNano 1.3 | 8.3 | 5.7% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.0% | 1 |
| sample.TrackFire 1.0 | 9.9 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 69.5 | 7 / 35 | 3716 |
| 2 | 5 | 57.6 | 61.9 | 5 / 35 | 3443 |
| 3 | 7 | 54.8 | 57.1 | 3 / 35 | 3101 |
| 4 | 3 | 58.4 | 64.8 | 5 / 35 | 3160 |
| 5 | 3 | 59.2 | 66.0 | 7 / 35 | 3511 |
| 6 | 5 | 56.5 | 61.6 | 3 / 35 | 3208 |
| 7 | 2 | 60.8 | 72.4 | 6 / 35 | 3243 |
| 8 | 3 | 59.8 | 67.9 | 8 / 35 | 3393 |
| 9 | 3 | 60.8 | 68.6 | 6 / 35 | 3818 |
| 10 | 3 | 58.8 | 65.4 | 4 / 35 | 3448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 37% |
| nz.jdc.nano.GridFu 1.0 | 28 | 39% |
| d414.nano.Quantum 1.0.0 | 20 | 5% |
| cb.nano.Insomnia 1.0 | 19 | 79% |
| mz.Cork 0.1 | 13 | 54% |
| oog.melee.CapuletDroid 1.1 | 11 | 73% |
| stelo.UntouchableNano 1.3 | 1 | 100% |

Hadur died in 296 of 350 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 76 | 26% | 95 |
| d414.nano.Quantum 1.0.0 | 73 | 25% | 81 |
| nz.jdc.nano.GridFu 1.0 | 41 | 14% | 51 |
| oog.melee.CapuletDroid 1.1 | 32 | 11% | 43 |
| cb.nano.Insomnia 1.0 | 32 | 11% | 28 |
| mz.Cork 0.1 | 30 | 10% | 39 |
| stelo.UntouchableNano 1.3 | 7 | 2% | 8 |
| sample.TrackFire 1.0 | 3 | 1% | 3 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |

## Melee bench: F08

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.8 | 64 / 350 | 3.45 | 14.3% | 39054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.9% | 119 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2.4 | 14.5% | 62 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 14.3% | 64 |
| gh.nano.Grofvuil 0.2 | 4.0 | 12.3% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.4 | 10.8% | 12 |
| djdjdj.NanoSkunk10 1.0 | 5.7 | 10.2% | 35 |
| baal.nano.N 1.42 | 6.7 | 9.5% | 7 |
| donjezza.Muncho 1.0 | 8.2 | 5.6% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 8.8 | 5.1% | 0 |
| cli.WasteOfAmmo 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.8 | 68.6 | 4 / 35 | 3868 |
| 2 | 2 | 62.7 | 75.6 | 9 / 35 | 3636 |
| 3 | 4 | 59.9 | 65.4 | 5 / 35 | 3743 |
| 4 | 3 | 62.3 | 73.0 | 5 / 35 | 3934 |
| 5 | 3 | 61.5 | 70.8 | 3 / 35 | 3849 |
| 6 | 2 | 64.4 | 78.1 | 11 / 35 | 3862 |
| 7 | 2 | 62.8 | 73.0 | 7 / 35 | 4324 |
| 8 | 1 | 65.1 | 82.5 | 9 / 35 | 4104 |
| 9 | 4 | 61.1 | 70.5 | 6 / 35 | 3466 |
| 10 | 2 | 62.5 | 70.8 | 5 / 35 | 4268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 56 | 54% |
| d414.nano.Quantum 1.0.0 | 48 | 8% |
| djdjdj.NanoSkunk10 1.0 | 22 | 50% |
| gh.nano.Grofvuil 0.2 | 16 | 31% |
| donjezza.Muncho 1.0 | 7 | 29% |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 86% |
| baal.nano.N 1.42 | 7 | 86% |

Hadur died in 287 of 350 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 99 | 34% | 105 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 54 | 19% | 87 |
| gh.nano.Grofvuil 0.2 | 41 | 14% | 46 |
| dmh.robocode.robot.RedDwarf 0.4 | 38 | 13% | 39 |
| djdjdj.NanoSkunk10 1.0 | 27 | 9% | 35 |
| baal.nano.N 1.42 | 14 | 5% | 21 |
| donjezza.Muncho 1.0 | 9 | 3% | 11 |
| bwbaugh.nano.Tirunculus 0.0.0a | 5 | 2% | 5 |

## Melee bench: F09

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.1 | 55.5 | 27 / 350 | 5.00 | 10.8% | 27644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.6 | 13.0% | 56 |
| stelo.SoRobotNanoMelee 1.2 | 3.1 | 12.1% | 68 |
| mld.DustBunny 3.8 | 3.5 | 11.8% | 56 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 11.7% | 30 |
| hadur117.nano.SanaroS0 0.1 | 4.8 | 10.8% | 27 |
| wee.Gem 1.8.4 | 5.3 | 10.7% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 6.3 | 9.7% | 34 |
| tj.zombie1n 1.0.1 | 8.1 | 7.9% | 35 |
| cs.sheldor.Talon 1.1 | 8.9 | 6.8% | 0 |
| step.nanoPri 1.0 | 9.9 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 53.3 | 56.8 | 2 / 35 | 2740 |
| 2 | 6 | 52.6 | 54.6 | 3 / 35 | 2611 |
| 3 | 3 | 55.3 | 60.3 | 3 / 35 | 2950 |
| 4 | 4 | 55.8 | 59.4 | 7 / 35 | 2978 |
| 5 | 3 | 54.5 | 58.1 | 3 / 35 | 3004 |
| 6 | 4 | 54.2 | 57.8 | 3 / 35 | 2818 |
| 7 | 5 | 53.0 | 55.6 | 2 / 35 | 2594 |
| 8 | 6 | 48.8 | 48.6 | 0 / 35 | 2486 |
| 9 | 6 | 50.9 | 49.8 | 2 / 35 | 2823 |
| 10 | 7 | 52.4 | 54.3 | 2 / 35 | 2640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 65% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 0% |
| mld.DustBunny 3.8 | 13 | 23% |
| d414.nano.Quantum 1.0.0 | 12 | 17% |
| wee.Gem 1.8.4 | 11 | 55% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 40% |
| tj.zombie1n 1.0.1 | 3 | 33% |

Hadur died in 324 of 350 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 63 | 19% | 64 |
| stelo.SoRobotNanoMelee 1.2 | 56 | 17% | 57 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 53 | 16% | 65 |
| mld.DustBunny 3.8 | 41 | 13% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 39 | 12% | 41 |
| wee.Gem 1.8.4 | 27 | 8% | 34 |
| cs.sheldor.Talon 1.1 | 22 | 7% | 22 |
| tj.zombie1n 1.0.1 | 16 | 5% | 15 |
| step.nanoPri 1.0 | 7 | 2% | 7 |

## Melee bench: F10

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 72.6 | 57 / 350 | 3.46 | 14.4% | 41859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.5 | 16.8% | 128 |
| hadur117.nano.SanaroS0 0.1 | 2.6 | 14.4% | 57 |
| mld.Infinity 2.2 | 2.9 | 14.3% | 95 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 14.4% | 54 |
| robar.nano.Assertive_Melee 0.2 | 5.7 | 8.1% | 2 |
| ayk.WallHugger 1.0 | 6.6 | 7.4% | 5 |
| conscience.Electron 1.3g | 6.6 | 7.7% | 1 |
| exauge.GateKeeper 1.1.121g | 7.1 | 7.0% | 1 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 7 |
| sample.RamFire 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 80.0 | 9 / 35 | 4691 |
| 2 | 4 | 58.8 | 63.8 | 3 / 35 | 3900 |
| 3 | 3 | 59.9 | 69.2 | 2 / 35 | 3957 |
| 4 | 3 | 62.5 | 72.7 | 6 / 35 | 4473 |
| 5 | 1 | 65.7 | 81.3 | 11 / 35 | 4648 |
| 6 | 3 | 63.0 | 74.3 | 6 / 35 | 4188 |
| 7 | 3 | 61.6 | 73.0 | 3 / 35 | 3969 |
| 8 | 1 | 63.9 | 75.9 | 8 / 35 | 4470 |
| 9 | 3 | 60.7 | 71.7 | 4 / 35 | 3776 |
| 10 | 4 | 58.9 | 64.4 | 5 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 54 | 2% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 55% |
| mld.Infinity 2.2 | 41 | 54% |
| ayk.WallHugger 1.0 | 4 | 100% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| robar.nano.Assertive_Melee 0.2 | 2 | 50% |
| donjezza.Jezza 1.0 | 2 | 50% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 293 of 350 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 118 | 40% | 135 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 71 | 24% | 111 |
| mld.Infinity 2.2 | 39 | 13% | 22 |
| robar.nano.Assertive_Melee 0.2 | 24 | 8% | 26 |
| conscience.Electron 1.3g | 16 | 5% | 18 |
| exauge.GateKeeper 1.1.121g | 12 | 4% | 19 |
| ayk.WallHugger 1.0 | 8 | 3% | 13 |
| donjezza.Jezza 1.0 | 4 | 1% | 5 |
| sample.RamFire 1.0 | 1 | 0% | 1 |

## Melee bench: F11

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 66.5 | 52 / 350 | 4.01 | 13.1% | 34245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.2% | 112 |
| oog.melee.Corsair 1.0 | 2.8 | 13.3% | 69 |
| hadur117.nano.SanaroS0 0.1 | 3.0 | 13.1% | 52 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.1 | 12.8% | 59 |
| mz.NanoGod 2.02 | 4.8 | 11.3% | 34 |
| DBall.NUKE 0.1 | 7.0 | 7.9% | 9 |
| awesomeness.Elite 1.0 | 7.2 | 7.8% | 4 |
| zyx.nano.BacillusComma 1.0 | 7.4 | 7.6% | 2 |
| sample.Walls 1.0 | 8.5 | 6.8% | 8 |
| stelo.PianistNano 1.2 | 9.9 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 67.0 | 3 / 35 | 3310 |
| 2 | 4 | 58.3 | 62.9 | 7 / 35 | 3508 |
| 3 | 3 | 58.4 | 65.1 | 3 / 35 | 3591 |
| 4 | 2 | 59.5 | 66.7 | 7 / 35 | 3482 |
| 5 | 2 | 60.4 | 71.4 | 6 / 35 | 3580 |
| 6 | 2 | 59.3 | 68.9 | 4 / 35 | 3404 |
| 7 | 2 | 59.2 | 67.9 | 7 / 35 | 3356 |
| 8 | 3 | 59.3 | 67.6 | 4 / 35 | 3456 |
| 9 | 5 | 56.8 | 61.3 | 4 / 35 | 3356 |
| 10 | 4 | 59.1 | 66.7 | 7 / 35 | 3202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 48 | 6% |
| oog.melee.Corsair 1.0 | 29 | 52% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 48% |
| DBall.NUKE 0.1 | 9 | 67% |
| sample.Walls 1.0 | 7 | 86% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| awesomeness.Elite 1.0 | 4 | 75% |
| mz.NanoGod 2.02 | 3 | 0% |
| stelo.PianistNano 1.2 | 2 | 100% |

Hadur died in 299 of 350 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 96 | 32% | 100 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 16% | 66 |
| mz.NanoGod 2.02 | 47 | 16% | 49 |
| oog.melee.Corsair 1.0 | 45 | 15% | 64 |
| zyx.nano.BacillusComma 1.0 | 20 | 7% | 21 |
| sample.Walls 1.0 | 18 | 6% | 18 |
| awesomeness.Elite 1.0 | 11 | 4% | 13 |
| DBall.NUKE 0.1 | 8 | 3% | 13 |
| stelo.PianistNano 1.2 | 5 | 2% | 6 |

## Melee bench: F12

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 68.9 | 53 / 350 | 3.80 | 13.4% | 33543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.2 | 15.1% | 117 |
| hadur117.nano.SanaroS0 0.1 | 2.5 | 13.4% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 37 |
| sul.Lunar 1.1 | 3.8 | 11.7% | 46 |
| myl.nano.KomoriNinja 1.1 | 4.2 | 11.6% | 42 |
| sam.Samspin 1.0 | 7.2 | 8.3% | 17 |
| spinnercat.Omen 1.0 | 7.4 | 7.8% | 20 |
| sample.SpinBot 1.0 | 7.5 | 7.8% | 9 |
| maribo.melee.BMV 0.1 | 7.9 | 7.6% | 1 |
| cvt.Firsty 1.0 | 10.0 | 4.1% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 68.3 | 8 / 35 | 3346 |
| 2 | 2 | 60.8 | 72.7 | 7 / 35 | 3258 |
| 3 | 2 | 62.2 | 75.2 | 7 / 35 | 3496 |
| 4 | 3 | 60.2 | 68.9 | 4 / 35 | 3702 |
| 5 | 5 | 56.5 | 62.2 | 4 / 35 | 3036 |
| 6 | 2 | 61.5 | 75.6 | 5 / 35 | 3324 |
| 7 | 2 | 56.9 | 62.2 | 5 / 35 | 3196 |
| 8 | 1 | 61.2 | 71.4 | 7 / 35 | 3691 |
| 9 | 3 | 57.8 | 65.7 | 3 / 35 | 3243 |
| 10 | 2 | 57.8 | 66.3 | 3 / 35 | 3251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| d414.nano.Quantum 1.0.0 | 45 | 9% |
| sul.Lunar 1.1 | 35 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 29 | 48% |
| myl.nano.KomoriNinja 1.1 | 12 | 8% |
| spinnercat.Omen 1.0 | 8 | 38% |
| sam.Samspin 1.0 | 7 | 43% |
| sample.SpinBot 1.0 | 6 | 67% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 298 of 350 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 98 | 33% | 101 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 51 | 17% | 66 |
| myl.nano.KomoriNinja 1.1 | 33 | 11% | 38 |
| sul.Lunar 1.1 | 31 | 10% | 57 |
| sample.SpinBot 1.0 | 24 | 8% | 25 |
| sam.Samspin 1.0 | 23 | 8% | 25 |
| spinnercat.Omen 1.0 | 17 | 6% | 17 |
| maribo.melee.BMV 0.1 | 11 | 4% | 11 |
| cvt.Firsty 1.0 | 10 | 3% | 10 |

## Melee bench: F13

hadur117.nano.SanaroS0 0.1 against 9 opponents at once, 35 rounds per battle, 10 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 10. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 0 over 10 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.0 | 65.4 | 43 / 350 | 4.11 | 12.5% | 32252 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 1.3 | 15.1% | 117 |
| davidalves.net.DuelistNanoMelee 1.01 | 2.0 | 14.1% | 91 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.4 | 12.7% | 57 |
| hadur117.nano.SanaroS0 0.1 | 3.6 | 12.5% | 43 |
| mld.Wisdom 1.0 | 4.7 | 10.9% | 17 |
| arthord.NanoSatanMelee Beta | 7.0 | 8.3% | 10 |
| zyx.nano.Ant 1.1 | 7.1 | 8.0% | 8 |
| tvv.nano.Polaris 1.2 | 7.6 | 7.9% | 5 |
| amz.NanoClone 1.41 | 8.3 | 7.5% | 1 |
| arthord.MannyPacquiao Beta | 10.0 | 2.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.2 | 58.1 | 1 / 35 | 3028 |
| 2 | 2 | 60.2 | 72.1 | 6 / 35 | 3385 |
| 3 | 4 | 58.3 | 63.5 | 6 / 35 | 3522 |
| 4 | 4 | 58.4 | 66.7 | 5 / 35 | 3182 |
| 5 | 3 | 59.6 | 67.9 | 4 / 35 | 3535 |
| 6 | 4 | 56.4 | 61.9 | 4 / 35 | 3033 |
| 7 | 4 | 58.8 | 65.7 | 6 / 35 | 3295 |
| 8 | 4 | 57.0 | 64.8 | 0 / 35 | 2998 |
| 9 | 3 | 59.5 | 68.9 | 6 / 35 | 3320 |
| 10 | 3 | 56.4 | 64.4 | 5 / 35 | 2954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 57 | 39% |
| davidalves.net.DuelistNanoMelee 1.01 | 34 | 12% |
| d414.nano.Quantum 1.0.0 | 32 | 9% |
| mld.Wisdom 1.0 | 7 | 43% |
| arthord.NanoSatanMelee Beta | 7 | 71% |
| amz.NanoClone 1.41 | 3 | 100% |
| zyx.nano.Ant 1.1 | 2 | 50% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 307 of 350 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| d414.nano.Quantum 1.0.0 | 78 | 25% | 86 |
| davidalves.net.DuelistNanoMelee 1.01 | 65 | 21% | 68 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 52 | 17% | 76 |
| mld.Wisdom 1.0 | 44 | 14% | 48 |
| amz.NanoClone 1.41 | 17 | 6% | 19 |
| tvv.nano.Polaris 1.2 | 17 | 6% | 17 |
| zyx.nano.Ant 1.1 | 16 | 5% | 16 |
| arthord.NanoSatanMelee Beta | 15 | 5% | 17 |
| arthord.MannyPacquiao Beta | 3 | 1% | 3 |

