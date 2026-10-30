# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 477 over 6 battles (79.5 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.3 | 46 / 210 | 2.41 | 17.1% | 31221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.4% | 136 |
| hadur117.Hadur 3.19bb | 2.0 | 17.1% | 46 |
| sgp.JollyNinja 3.53 | 3.5 | 11.6% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.0% | 4 |
| mz.MicroGodMelee 1 | 5.0 | 10.5% | 4 |
| lorneswork.Predator 1.0 | 5.2 | 10.3% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 1 |
| skm.butterfly 1.0 | 9.2 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 87.6 | 7 / 35 | 5224 |
| 2 | 2 | 67.9 | 88.6 | 10 / 35 | 5064 |
| 3 | 2 | 64.6 | 77.8 | 6 / 35 | 4643 |
| 4 | 2 | 67.3 | 85.4 | 6 / 35 | 5410 |
| 5 | 2 | 66.0 | 81.9 | 8 / 35 | 5035 |
| 6 | 2 | 68.1 | 84.4 | 9 / 35 | 5845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 7% |
| sgp.JollyNinja 3.53 | 19 | 79% |
| mz.MicroGodMelee 1 | 12 | 83% |
| lorneswork.Predator 1.0 | 7 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| skm.butterfly 1.0 | 1 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 115 | 69% | 132 |
| sgp.JollyNinja 3.53 | 23 | 14% | 31 |
| lorneswork.Predator 1.0 | 10 | 6% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 10 |
| mz.MicroGodMelee 1 | 4 | 2% | 13 |
| adt.Ar2 1.0 | 4 | 2% | 7 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 138542 melee ticks, 82228 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45084 sent, 40150 reached their opponent, 8034 virtual hits (20.0% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 326 over 6 battles (54.3 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.4 | 86 / 210 | 2.40 | 18.1% | 29995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.1% | 86 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.7% | 31 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.4% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.3% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.5% | 19 |
| Noran.BitchingElk 0.054 | 6.5 | 8.3% | 18 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.0% | 1 |
| sch.Simone 0.3d | 7.2 | 8.1% | 10 |
| stelo.PatternRobot 1.0 | 9.0 | 5.6% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 12 / 35 | 4894 |
| 2 | 1 | 66.7 | 82.2 | 17 / 35 | 4734 |
| 3 | 1 | 67.4 | 85.1 | 11 / 35 | 5089 |
| 4 | 1 | 67.6 | 85.4 | 15 / 35 | 4799 |
| 5 | 1 | 68.3 | 86.0 | 15 / 35 | 5333 |
| 6 | 1 | 68.2 | 86.0 | 16 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 39 | 64% |
| pulsar.PulsarMax 0.8.9 | 38 | 50% |
| sch.Simone 0.3d | 21 | 71% |
| Noran.BitchingElk 0.054 | 18 | 39% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 45% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 29% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 21% | 59 |
| Noran.BitchingElk 0.054 | 14 | 11% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 10% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 12 | 9% | 15 |
| sch.Simone 0.3d | 11 | 9% | 23 |
| fnc.bandit.Bandit 5.2.0 | 9 | 7% | 12 |
| fullsail.SweetTea 1.1 | 2 | 2% | 2 |
| stelo.PatternRobot 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 169359 melee ticks, 45103 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 103 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 103 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 58990 sent, 54258 reached their opponent, 9398 virtual hits (17.3% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 233 over 6 battles (38.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.3 | 154 / 210 | 1.79 | 20.4% | 38544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.4% | 154 |
| radnor.DoctorBob 1.42 | 2.0 | 14.0% | 18 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.6% | 13 |
| vuen.Cake 2.51 | 3.5 | 12.4% | 20 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 3 |
| adt.Ar1 2.1 | 6.0 | 7.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.1 | 26 / 35 | 6573 |
| 2 | 1 | 70.7 | 93.0 | 24 / 35 | 6422 |
| 3 | 1 | 71.8 | 94.9 | 28 / 35 | 6641 |
| 4 | 1 | 69.1 | 85.4 | 23 / 35 | 6186 |
| 5 | 1 | 69.8 | 87.6 | 25 / 35 | 6267 |
| 6 | 1 | 71.5 | 94.6 | 28 / 35 | 6455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 71 | 87% |
| radnor.DoctorBob 1.42 | 51 | 88% |
| kawigi.nano.Lib 1.0 | 37 | 92% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 4 | 75% |
| urdos.URDOS 1.3 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 37% | 63 |
| vuen.Cake 2.51 | 10 | 18% | 69 |
| kawigi.nano.Lib 1.0 | 7 | 12% | 41 |
| urdos.URDOS 1.3 | 7 | 12% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 7% | 4 |
| oa.weak.FlyMk1 0.1 | 2 | 4% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 4 |
| adt.Ar1 2.1 | 2 | 4% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 128921 melee ticks, 43056 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 39621 sent, 34972 reached their opponent, 9102 virtual hits (26.0% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 607 over 6 battles (101.2 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.1 | 28 / 210 | 2.25 | 17.6% | 33419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 158 |
| hadur117.Hadur 3.19bb | 2.0 | 17.6% | 28 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 9 |
| TNT.TNT 0.99.1 | 4.0 | 10.8% | 13 |
| josago.Jorgito 0.16 | 5.2 | 8.6% | 0 |
| css.Delitioner 0.11 | 5.8 | 7.7% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.4% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.0 | 4.2% | 1 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 87.3 | 6 / 35 | 6040 |
| 2 | 2 | 68.3 | 87.0 | 3 / 35 | 5828 |
| 3 | 2 | 68.2 | 86.7 | 3 / 35 | 5581 |
| 4 | 2 | 67.8 | 86.3 | 8 / 35 | 5122 |
| 5 | 2 | 66.8 | 80.6 | 2 / 35 | 5475 |
| 6 | 2 | 68.5 | 88.9 | 6 / 35 | 5373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 9% |
| apc.LeeroyJenkins2 1.0 | 15 | 53% |
| TNT.TNT 0.99.1 | 10 | 40% |
| css.Delitioner 0.11 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 0% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 1327. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 69% | 145 |
| apc.LeeroyJenkins2 1.0 | 26 | 14% | 28 |
| TNT.TNT 0.99.1 | 14 | 7% | 20 |
| josago.Jorgito 0.16 | 9 | 5% | 11 |
| css.Delitioner 0.11 | 2 | 1% | 4 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |
| rampancy.Durandal 2.1d | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 199120 melee ticks, 71505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 60200 sent, 55391 reached their opponent, 8181 virtual hits (14.8% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 505 over 6 battles (84.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.3 | 21 / 210 | 3.13 | 14.5% | 22406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.3% | 107 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 56 |
| hadur117.Hadur 3.19bb | 3.0 | 14.5% | 21 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 19 |
| ms.Ares 0.19 | 5.5 | 9.2% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 6 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.6% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.1 | 70.5 | 2 / 35 | 3501 |
| 2 | 3 | 63.0 | 76.5 | 6 / 35 | 3531 |
| 3 | 3 | 62.7 | 74.9 | 1 / 35 | 3877 |
| 4 | 3 | 64.0 | 79.4 | 4 / 35 | 3740 |
| 5 | 3 | 64.1 | 79.0 | 3 / 35 | 3898 |
| 6 | 3 | 63.7 | 77.5 | 5 / 35 | 3859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 35 | 9% |
| justin.DemonicRage 3.4 | 28 | 25% |
| wompi.Numbat 2.1 | 14 | 50% |
| axeBots.HataMoto 3.09 | 7 | 43% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 38% | 77 |
| justin.DemonicRage 3.4 | 60 | 31% | 68 |
| wompi.Numbat 2.1 | 27 | 14% | 32 |
| axeBots.HataMoto 3.09 | 15 | 8% | 18 |
| ms.Ares 0.19 | 8 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153650 melee ticks, 31575 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 77 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 77 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47330 sent, 42401 reached their opponent, 7027 virtual hits (16.6% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 562 over 6 battles (93.7 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.2 | 129 / 210 | 1.97 | 19.4% | 31393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.4% | 129 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 26 |
| origin.SleepSiphon 1.7b | 3.0 | 13.2% | 30 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.7% | 15 |
| mld.Wisdom 1.0 | 5.3 | 10.3% | 2 |
| gg.Wolverine 2.0 | 5.7 | 9.1% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.8% | 6 |
| DBall.NUKE 0.1 | 8.3 | 5.9% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 23 / 35 | 5438 |
| 2 | 1 | 70.9 | 92.7 | 24 / 35 | 5564 |
| 3 | 1 | 68.1 | 84.8 | 19 / 35 | 5003 |
| 4 | 1 | 69.3 | 88.6 | 20 / 35 | 4978 |
| 5 | 1 | 69.5 | 88.3 | 22 / 35 | 5221 |
| 6 | 1 | 69.5 | 88.9 | 21 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 60 | 87% |
| origin.SleepSiphon 1.7b | 40 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 75% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| DBall.NUKE 0.1 | 5 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 29 | 34% | 63 |
| origin.SleepSiphon 1.7b | 19 | 22% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 20% | 41 |
| mld.Wisdom 1.0 | 8 | 9% | 20 |
| gg.Wolverine 2.0 | 5 | 6% | 13 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 5% | 7 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150064 melee ticks, 46869 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 94 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 94 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 47131 sent, 42250 reached their opponent, 9463 virtual hits (22.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 721 over 6 battles (120.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 92.5 | 109 / 210 | 1.67 | 20.6% | 39349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.6% | 109 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.2% | 54 |
| rtk.Tachikoma 1.0 | 2.8 | 16.0% | 30 |
| franzor.Lizt 1.3.1 | 4.5 | 10.8% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.8% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.1 | 21 / 35 | 6772 |
| 2 | 1 | 72.2 | 94.0 | 18 / 35 | 6424 |
| 3 | 1 | 72.0 | 92.4 | 16 / 35 | 6563 |
| 4 | 1 | 71.6 | 90.2 | 18 / 35 | 6265 |
| 5 | 1 | 72.6 | 94.0 | 21 / 35 | 6442 |
| 6 | 1 | 72.3 | 92.7 | 15 / 35 | 6883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 80 | 69% |
| rsalesc.melee.Monk 0.3.6c | 58 | 22% |
| franzor.Lizt 1.3.1 | 29 | 79% |
| oog.melee.CapuletDroid 1.1 | 21 | 81% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1455. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 49 | 46% | 77 |
| rtk.Tachikoma 1.0 | 36 | 34% | 98 |
| oog.melee.CapuletDroid 1.1 | 8 | 7% | 29 |
| franzor.Lizt 1.3.1 | 7 | 7% | 2 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 188220 melee ticks, 97303 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 55663 sent, 50985 reached their opponent, 10368 virtual hits (20.3% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 600 over 6 battles (100.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.9 | 131 / 210 | 2.00 | 19.4% | 30622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.4% | 131 |
| tm.Yuugao 1.0 | 2.5 | 12.6% | 26 |
| shrub.Vapour v159 | 2.5 | 12.5% | 20 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 11.1% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.2% | 11 |
| m3thos.Eva00 1.1 | 6.3 | 8.4% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.5% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.4% | 1 |
| SHAM.WOW 1.4 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.7 | 28 / 35 | 5805 |
| 2 | 1 | 70.1 | 92.7 | 24 / 35 | 5123 |
| 3 | 1 | 67.9 | 86.7 | 18 / 35 | 5029 |
| 4 | 1 | 66.6 | 82.2 | 17 / 35 | 4625 |
| 5 | 1 | 70.0 | 92.1 | 23 / 35 | 5241 |
| 6 | 1 | 68.0 | 86.0 | 21 / 35 | 4799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 82% |
| shrub.Vapour v159 | 36 | 69% |
| Krabb.sliNk.Garm 0.9u | 33 | 76% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 79% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 100% |
| m3thos.Eva00 1.1 | 5 | 80% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 26% | 71 |
| shrub.Vapour v159 | 19 | 23% | 49 |
| Krabb.sliNk.Garm 0.9u | 17 | 20% | 30 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 13% | 33 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 16 |
| m3thos.Eva00 1.1 | 4 | 5% | 5 |
| SHAM.WOW 1.4 | 1 | 1% | 2 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 2 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 142699 melee ticks, 44786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 64 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 47098 sent, 42450 reached their opponent, 8075 virtual hits (19.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 72.5 | 49 / 210 | 3.47 | 14.6% | 21426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.0% | 94 |
| hadur117.Hadur 3.19bb | 2.3 | 14.6% | 49 |
| kc.micro.Figment 1.0 | 2.7 | 14.4% | 30 |
| pedersen.Grishnakh 1.0 | 4.5 | 11.2% | 21 |
| yagami.Tidus 0.11 | 4.8 | 10.5% | 2 |
| mc2.enemy.Original 0.9 | 5.7 | 9.6% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.0 | 4.9% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 76.2 | 8 / 35 | 3888 |
| 2 | 3 | 59.4 | 65.4 | 5 / 35 | 3186 |
| 3 | 2 | 62.2 | 71.7 | 10 / 35 | 3426 |
| 4 | 2 | 62.3 | 70.8 | 11 / 35 | 3709 |
| 5 | 2 | 64.0 | 77.8 | 9 / 35 | 3623 |
| 6 | 3 | 62.1 | 73.3 | 6 / 35 | 3594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 31% |
| kc.micro.Figment 1.0 | 30 | 93% |
| pedersen.Grishnakh 1.0 | 9 | 22% |
| yagami.Tidus 0.11 | 5 | 80% |
| mc2.enemy.Original 0.9 | 4 | 25% |

Hadur died in 161 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 50 | 31% | 65 |
| mc2.enemy.Original 0.9 | 29 | 18% | 31 |
| kc.micro.Figment 1.0 | 25 | 16% | 52 |
| yagami.Tidus 0.11 | 24 | 15% | 26 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 17 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 4 |

Posture (Hadur's M records, 206 rounds): 141858 melee ticks, 34266 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 31 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47609 sent, 42903 reached their opponent, 6148 virtual hits (14.3% of those reached).

## Melee bench: F10

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 191 over 6 battles (31.8 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.7 | 158 / 210 | 1.57 | 20.3% | 33729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.3% | 158 |
| DTF.Kludgy 1.2b | 2.5 | 13.8% | 19 |
| ne.Chimera 1.2 | 3.0 | 13.2% | 10 |
| ejb.Polaris 1.0.1 | 3.5 | 12.2% | 14 |
| vStar.RAFzilla 2.15 | 5.3 | 10.4% | 7 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 3 |
| kurios.DOSexe .9b | 7.3 | 5.8% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.1 | 27 / 35 | 5865 |
| 2 | 1 | 71.5 | 95.6 | 28 / 35 | 5718 |
| 3 | 1 | 70.3 | 92.7 | 27 / 35 | 5479 |
| 4 | 1 | 70.3 | 93.3 | 25 / 35 | 5450 |
| 5 | 1 | 70.2 | 94.6 | 24 / 35 | 5458 |
| 6 | 1 | 71.1 | 94.0 | 27 / 35 | 5759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 82% |
| ejb.Polaris 1.0.1 | 43 | 84% |
| ne.Chimera 1.2 | 37 | 95% |
| vStar.RAFzilla 2.15 | 23 | 96% |
| tvv.micro.Antares 1.1.1 | 12 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 37% | 68 |
| ejb.Polaris 1.0.1 | 13 | 24% | 54 |
| ne.Chimera 1.2 | 11 | 20% | 40 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 16 |
| vStar.RAFzilla 2.15 | 2 | 4% | 21 |
| donjezza.Muncho 1.0 | 1 | 2% | 0 |
| kurios.DOSexe .9b | 0 | 0% | 8 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 145394 melee ticks, 49112 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 61 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 61 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 47008 sent, 42369 reached their opponent, 8163 virtual hits (19.3% of those reached).

## Melee bench: F11

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 363 over 6 battles (60.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.6 | 73 / 210 | 2.92 | 15.8% | 22292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.2% | 65 |
| hadur117.Hadur 3.19bb | 1.7 | 15.8% | 73 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.6% | 19 |
| djc.DynaBot 0.1.1 | 3.8 | 11.3% | 17 |
| br2.MobyDickBot 1.6 | 5.3 | 9.7% | 19 |
| uji.YellohFellah 1.0 | 6.2 | 8.9% | 9 |
| rdt199.Warlord 0.73 | 6.5 | 8.5% | 9 |
| KiraNL.Chupacabra 0.4 | 8.3 | 6.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 8.8 | 5.5% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 76.5 | 12 / 35 | 3989 |
| 2 | 2 | 63.3 | 78.1 | 8 / 35 | 3698 |
| 3 | 1 | 63.2 | 78.1 | 11 / 35 | 3530 |
| 4 | 2 | 65.6 | 84.4 | 14 / 35 | 3575 |
| 5 | 1 | 64.9 | 80.3 | 14 / 35 | 3945 |
| 6 | 2 | 63.0 | 74.3 | 14 / 35 | 3555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 44 | 48% |
| djc.DynaBot 0.1.1 | 24 | 79% |
| cx.mini.Nimrod 0.55 | 17 | 82% |
| br2.MobyDickBot 1.6 | 13 | 46% |
| uji.YellohFellah 1.0 | 11 | 82% |
| rdt199.Warlord 0.73 | 5 | 60% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 41% | 85 |
| cx.mini.Nimrod 0.55 | 24 | 17% | 34 |
| br2.MobyDickBot 1.6 | 14 | 10% | 21 |
| djc.DynaBot 0.1.1 | 13 | 9% | 26 |
| rdt199.Warlord 0.73 | 12 | 9% | 20 |
| uji.YellohFellah 1.0 | 6 | 4% | 12 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 3% | 4 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 157132 melee ticks, 35166 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 48 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 51273 sent, 46308 reached their opponent, 6412 virtual hits (13.8% of those reached).

## Melee bench: F12

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 373 over 6 battles (62.2 per battle, most in one battle 153). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.9 | 108 / 210 | 2.45 | 17.4% | 23489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 17.4% | 108 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.8% | 34 |
| nat.PallasHawk 1.0 | 3.2 | 13.0% | 26 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 24 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 10 |
| jrm.Test0 1.0 | 6.2 | 8.5% | 5 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.2% | 0 |
| stuff.Vlad 0.1 | 8.5 | 5.9% | 1 |
| jp.Perpy 16.0 | 8.8 | 5.8% | 1 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 80.3 | 15 / 35 | 3751 |
| 2 | 1 | 67.1 | 86.3 | 19 / 35 | 3751 |
| 3 | 1 | 66.8 | 84.8 | 21 / 35 | 3768 |
| 4 | 1 | 65.8 | 79.0 | 17 / 35 | 4147 |
| 5 | 1 | 69.9 | 94.3 | 24 / 35 | 4420 |
| 6 | 1 | 64.2 | 78.4 | 12 / 35 | 3652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 45 | 89% |
| bts.wiki.RipCurl 0.9b | 42 | 79% |
| nat.PallasHawk 1.0 | 29 | 69% |
| brainfade.melee.Genghis 0.36 | 13 | 69% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 33% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 33 | 32% | 58 |
| nat.PallasHawk 1.0 | 25 | 24% | 57 |
| jrm.Test0 1.0 | 14 | 13% | 15 |
| darkcanuck.Leon 1.01 | 10 | 10% | 45 |
| brainfade.melee.Genghis 0.36 | 10 | 10% | 16 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 9 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 129488 melee ticks, 32341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 33 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44241 sent, 39146 reached their opponent, 6575 virtual hits (16.8% of those reached).

## Melee bench: F13

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.7 | 60 / 210 | 2.91 | 15.6% | 25112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.5% | 46 |
| mn.Combat 3.25.0 | 2.0 | 16.1% | 71 |
| hadur117.Hadur 3.19bb | 2.5 | 15.6% | 60 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 20 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 13 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.6% | 0 |
| maribo.FollowFire 1 | 8.2 | 5.1% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.3 | 10 / 35 | 4314 |
| 2 | 1 | 66.6 | 85.1 | 14 / 35 | 4335 |
| 3 | 3 | 65.1 | 80.3 | 12 / 35 | 3980 |
| 4 | 3 | 62.1 | 71.7 | 5 / 35 | 4092 |
| 5 | 3 | 64.3 | 77.1 | 9 / 35 | 4116 |
| 6 | 3 | 64.3 | 76.8 | 10 / 35 | 4275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 49 | 67% |
| mn.Combat 3.25.0 | 38 | 21% |
| shinh.Entangled 0.3 | 14 | 71% |
| gh.micro.Gruweltje 0.7 | 10 | 70% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 50 | 33% | 61 |
| ags.Glacier 0.2.11 | 45 | 30% | 73 |
| gh.micro.Gruweltje 0.7 | 23 | 15% | 34 |
| shinh.Entangled 0.3 | 13 | 9% | 21 |
| stelo.Wang 1.0 | 8 | 5% | 10 |
| maribo.FollowFire 1 | 7 | 5% | 7 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |

Posture (Hadur's M records, 203 rounds): 139922 melee ticks, 40227 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 176 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 176 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 41057 sent, 36039 reached their opponent, 5806 virtual hits (16.1% of those reached).

## Melee bench: F14

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.2 | 149 / 210 | 1.61 | 20.4% | 34261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.4% | 149 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.8% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 4.7 | 9.8% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.6% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.4% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.3% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 8.2% | 1 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.3 | 23 / 35 | 5881 |
| 2 | 1 | 71.0 | 92.1 | 24 / 35 | 6025 |
| 3 | 1 | 71.1 | 94.3 | 25 / 35 | 5861 |
| 4 | 1 | 70.0 | 91.1 | 23 / 35 | 5393 |
| 5 | 1 | 70.6 | 92.7 | 25 / 35 | 5338 |
| 6 | 1 | 71.7 | 95.9 | 29 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 90% |
| catcat20.shape.Theta 0.018 | 64 | 72% |
| co.edu.usb.rc.LidisTron 1.0 | 15 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 57% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 67% |
| pa.Improved 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 24 | 39% | 66 |
| simonton.micro.Sprout 1.1.3 | 18 | 30% | 82 |
| Lo_Ian.Gandalf_V4 4.0 | 9 | 15% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 5% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 7 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 139875 melee ticks, 50720 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 49 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43668 sent, 39150 reached their opponent, 9417 virtual hits (24.1% of those reached).

## Melee bench: F15

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 607 over 6 battles (101.2 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.2 | 103 / 210 | 2.51 | 18.1% | 30233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.1% | 103 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 24 |
| emp.Yngwie 1.11 | 3.2 | 13.3% | 46 |
| mld.DustBunny 3.8 | 3.5 | 13.2% | 16 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.3% | 4 |
| kawigi.robot.Girl 1.2 | 5.8 | 8.7% | 14 |
| lambdaxy.TBot 0.1 | 7.2 | 7.1% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.3 | 16 / 35 | 4998 |
| 2 | 1 | 68.0 | 85.1 | 18 / 35 | 4918 |
| 3 | 1 | 66.5 | 80.0 | 13 / 35 | 4843 |
| 4 | 1 | 68.2 | 83.5 | 17 / 35 | 5386 |
| 5 | 1 | 67.8 | 84.1 | 19 / 35 | 4788 |
| 6 | 1 | 69.0 | 85.4 | 20 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 37 | 59% |
| kawigi.micro.Shiz 1.1 | 33 | 94% |
| mld.DustBunny 3.8 | 33 | 94% |
| kawigi.robot.Girl 1.2 | 12 | 58% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 28% | 57 |
| mld.DustBunny 3.8 | 26 | 23% | 59 |
| kawigi.micro.Shiz 1.1 | 17 | 15% | 35 |
| cb.nano.Insomnia 1.0 | 13 | 12% | 17 |
| kawigi.robot.Girl 1.2 | 9 | 8% | 12 |
| divineomega.TrialBot 0.003 | 4 | 4% | 12 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 8 |
| lambdaxy.TBot 0.1 | 3 | 3% | 9 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 155074 melee ticks, 39949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 41 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 4.

Targeting waves (203 rounds): 52049 sent, 47250 reached their opponent, 7832 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 6 battles (44.5 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.7 | 112 / 210 | 2.20 | 19.3% | 34015 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.3% | 112 |
| gh.Griezel 0.5.2 | 2.2 | 15.3% | 41 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.1% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.5% | 38 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.9% | 2 |
| repositorio.NanoStep 1.0 | 8.8 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 2 |
| asd.Cthulhu 1.3 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 89.2 | 20 / 35 | 6181 |
| 2 | 1 | 67.9 | 82.9 | 16 / 35 | 5229 |
| 3 | 1 | 68.4 | 85.1 | 18 / 35 | 5575 |
| 4 | 1 | 69.3 | 86.3 | 20 / 35 | 5628 |
| 5 | 1 | 69.3 | 84.8 | 16 / 35 | 5822 |
| 6 | 1 | 70.7 | 92.1 | 22 / 35 | 5580 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 65 | 66% |
| techdude.forest.FlamingForest 1.1 | 43 | 65% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 96% |
| bvh.fnr.Fenrir 0.36l | 11 | 73% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| divineomega.DivineBot 1.9.4.5 | 4 | 75% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| stelo.IntrinsicVolatility 1.4 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 30 | 30% | 76 |
| techdude.forest.FlamingForest 1.1 | 22 | 22% | 54 |
| bvh.fnr.Fenrir 0.36l | 18 | 18% | 22 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 17% | 32 |
| asd.Cthulhu 1.3 | 5 | 5% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 8 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 175248 melee ticks, 63379 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 56137 sent, 51454 reached their opponent, 8770 virtual hits (17.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 542 over 6 battles (90.3 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.1 | 94 / 210 | 2.25 | 19.0% | 34835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.0% | 94 |
| et.Predator 1.8 | 2.7 | 13.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.1% | 37 |
| cx.BlestPain 1.41 | 3.5 | 12.2% | 42 |
| ahf.NanoAndrew .4 | 5.0 | 10.4% | 8 |
| maribo.melee.BMV 0.1 | 6.3 | 9.0% | 1 |
| nic.Nicator 2.4 | 6.7 | 8.4% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 6.4% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.7 | 16 / 35 | 5871 |
| 2 | 1 | 69.3 | 88.9 | 18 / 35 | 5585 |
| 3 | 1 | 68.5 | 82.5 | 13 / 35 | 6056 |
| 4 | 1 | 69.4 | 86.7 | 16 / 35 | 5793 |
| 5 | 1 | 69.6 | 87.0 | 18 / 35 | 5980 |
| 6 | 1 | 68.5 | 86.0 | 13 / 35 | 5550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 49 | 63% |
| et.Predator 1.8 | 46 | 72% |
| cx.BlestPain 1.41 | 35 | 29% |
| ahf.NanoAndrew .4 | 11 | 91% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| nic.Nicator 2.4 | 3 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 1091. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 44 | 37% | 60 |
| oog.melee.Mercutio 1.0 | 25 | 21% | 48 |
| et.Predator 1.8 | 24 | 20% | 54 |
| ahf.NanoAndrew .4 | 10 | 8% | 21 |
| maribo.melee.BMV 0.1 | 5 | 4% | 11 |
| nic.Nicator 2.4 | 3 | 3% | 7 |
| tex.Longbot 0.4 | 3 | 3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 165475 melee ticks, 59596 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 70 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 54021 sent, 49290 reached their opponent, 10471 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 631 over 6 battles (105.2 per battle, most in one battle 191). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.4 | 125 / 210 | 2.05 | 19.2% | 29772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.2% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.3% | 27 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.1% | 21 |
| uji.DBH 1.1 | 3.8 | 11.1% | 11 |
| ratosh.Nobo 0.21 | 6.0 | 9.2% | 7 |
| sigterm.Sigterm 1.0 | 6.2 | 8.9% | 10 |
| spinnercat.Robovirus 2.718 | 6.5 | 8.7% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.5% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.0% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.2 | 20 / 35 | 4617 |
| 2 | 1 | 67.4 | 82.5 | 19 / 35 | 4863 |
| 3 | 1 | 69.3 | 88.9 | 21 / 35 | 4926 |
| 4 | 1 | 68.1 | 86.0 | 21 / 35 | 4877 |
| 5 | 1 | 69.8 | 92.1 | 21 / 35 | 5076 |
| 6 | 1 | 69.8 | 91.4 | 23 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 55 | 71% |
| uji.DBH 1.1 | 34 | 88% |
| agd.Mooserwirt2 2.7 | 27 | 81% |
| sigterm.Sigterm 1.0 | 20 | 75% |
| ratosh.Nobo 0.21 | 10 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| spinnercat.Robovirus 2.718 | 6 | 67% |
| stelo.WangRobot 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 30% | 71 |
| agd.Mooserwirt2 2.7 | 14 | 16% | 34 |
| sigterm.Sigterm 1.0 | 13 | 15% | 23 |
| uji.DBH 1.1 | 10 | 11% | 32 |
| ratosh.Nobo 0.21 | 9 | 10% | 17 |
| spinnercat.Robovirus 2.718 | 8 | 9% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 2 |
| stelo.WangRobot 1.0 | 0 | 0% | 4 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 135066 melee ticks, 50554 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 38 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 6.

Targeting waves (207 rounds): 45654 sent, 40803 reached their opponent, 9070 virtual hits (22.2% of those reached).

## Melee bench: F19

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 6 battles (25.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 96.7 | 185 / 210 | 1.30 | 22.1% | 37560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 22.1% | 185 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.5% | 11 |
| mld.Infinity 2.2 | 3.7 | 11.7% | 6 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.3% | 3 |
| erdnis.Rover 0.3 | 4.5 | 10.9% | 4 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.1% | 1 |
| mbh.Mbh 0.1 | 6.8 | 7.8% | 0 |
| pac.ABC 2.1 | 8.2 | 6.4% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.0 | 29 / 35 | 6440 |
| 2 | 1 | 72.3 | 96.2 | 30 / 35 | 5751 |
| 3 | 1 | 73.2 | 96.8 | 31 / 35 | 6463 |
| 4 | 1 | 73.0 | 97.5 | 31 / 35 | 6237 |
| 5 | 1 | 73.0 | 97.8 | 32 / 35 | 5950 |
| 6 | 1 | 74.0 | 98.1 | 32 / 35 | 6719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 99% |
| krillr.mini.JointStrike 2.0.0 | 31 | 97% |
| erdnis.Rover 0.3 | 25 | 88% |
| mld.Infinity 2.2 | 20 | 95% |
| pac.ABC 2.1 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 11 | 44% | 47 |
| erdnis.Rover 0.3 | 5 | 20% | 28 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 16% | 58 |
| mld.Infinity 2.2 | 4 | 16% | 32 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pac.ABC 2.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 198 rounds): 125929 melee ticks, 39949 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 42226 sent, 37712 reached their opponent, 8721 virtual hits (23.1% of those reached).

## Melee bench: F20

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 488 over 6 battles (81.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.6 | 146 / 210 | 1.84 | 20.6% | 35626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.6% | 146 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 32 |
| fwb.Nine 1.0.1 | 3.3 | 11.4% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.6% | 6 |
| catcat20.Rabbit 0.001 | 4.7 | 10.2% | 12 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.7% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.8% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.5% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 88.9 | 23 / 35 | 6000 |
| 2 | 1 | 72.0 | 92.1 | 27 / 35 | 6326 |
| 3 | 1 | 71.2 | 92.4 | 25 / 35 | 5923 |
| 4 | 1 | 72.2 | 94.6 | 27 / 35 | 6365 |
| 5 | 1 | 70.5 | 88.9 | 26 / 35 | 5656 |
| 6 | 1 | 68.8 | 87.0 | 18 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 84% |
| fwb.Nine 1.0.1 | 40 | 95% |
| catcat20.Rabbit 0.001 | 24 | 79% |
| nz.jdc.nano.GridFu 1.0 | 10 | 70% |
| m3thos.mini.Eva01 0.5.5 | 8 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 67% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 32 | 48% | 103 |
| nz.jdc.nano.GridFu 1.0 | 10 | 15% | 27 |
| catcat20.Rabbit 0.001 | 7 | 10% | 34 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 8 |
| fwb.Nine 1.0.1 | 4 | 6% | 7 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 20 |
| djdjdj.NanoSkunk10 1.0 | 3 | 4% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 153966 melee ticks, 52519 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 49797 sent, 45092 reached their opponent, 10235 virtual hits (22.7% of those reached).

## Melee bench: F21

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.1 | 117 / 210 | 1.90 | 19.8% | 33694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.8% | 117 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 71 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 8 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 10 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.5% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 19 / 35 | 5592 |
| 2 | 1 | 69.2 | 89.8 | 17 / 35 | 5040 |
| 3 | 1 | 69.4 | 86.7 | 18 / 35 | 5262 |
| 4 | 1 | 72.0 | 93.7 | 22 / 35 | 6358 |
| 5 | 1 | 70.4 | 89.5 | 21 / 35 | 5743 |
| 6 | 1 | 70.4 | 88.9 | 20 / 35 | 5699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 105 | 60% |
| dummy.mini.Scimitar 1.01 | 28 | 93% |
| cf.RiO.RiOx 4.2.1 | 24 | 88% |
| eld.Hmm 1.0 | 12 | 50% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1224. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 51 | 52% | 99 |
| dummy.mini.Scimitar 1.01 | 16 | 16% | 49 |
| cf.RiO.RiOx 4.2.1 | 13 | 13% | 30 |
| eld.Hmm 1.0 | 7 | 7% | 23 |
| PSW.Relentless 0.1 | 4 | 4% | 4 |
| el.JumpShoot 0.2 | 2 | 2% | 2 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 175385 melee ticks, 80453 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 52301 sent, 47460 reached their opponent, 8019 virtual hits (16.9% of those reached).

## Melee bench: F22

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 344 over 6 battles (57.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.8 | 78 / 210 | 2.19 | 18.0% | 29675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.0% | 78 |
| pe.SandboxDT 2.71m | 2.0 | 16.5% | 69 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.3% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.1% | 1 |
| tad.Dalek98 0.98 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 11 / 35 | 4672 |
| 2 | 1 | 69.7 | 89.8 | 17 / 35 | 5327 |
| 3 | 1 | 69.2 | 88.9 | 13 / 35 | 5347 |
| 4 | 1 | 66.9 | 83.8 | 10 / 35 | 4765 |
| 5 | 1 | 67.0 | 85.4 | 12 / 35 | 4669 |
| 6 | 1 | 69.1 | 88.6 | 15 / 35 | 4895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 64 | 34% |
| kvk.HebusLeTroll 0.35 | 37 | 65% |
| jlm.javaDisturbance 0.59 | 30 | 70% |
| bigpete.Stewie 1.0 | 6 | 100% |
| tad.Dalek98 0.98 | 3 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 1019. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 63 | 47% | 91 |
| kvk.HebusLeTroll 0.35 | 34 | 25% | 51 |
| jlm.javaDisturbance 0.59 | 24 | 18% | 44 |
| bigpete.Stewie 1.0 | 7 | 5% | 15 |
| pbg.NinjaX 1.2 | 2 | 1% | 5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 165338 melee ticks, 48617 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 24 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 52471 sent, 47584 reached their opponent, 7701 virtual hits (16.2% of those reached).

## Melee bench: F23

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 208 over 6 battles (34.7 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 95.3 | 171 / 210 | 1.42 | 21.7% | 36610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 21.7% | 171 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 28 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 5 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.6% | 2 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.5% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.2% | 0 |
| cw.megas.Blade 0.8 | 6.8 | 8.2% | 0 |
| sample.Walls 1.0 | 8.0 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 96.8 | 28 / 35 | 6023 |
| 2 | 1 | 74.0 | 98.1 | 32 / 35 | 6124 |
| 3 | 1 | 73.0 | 94.9 | 28 / 35 | 6265 |
| 4 | 1 | 71.3 | 89.2 | 24 / 35 | 5785 |
| 5 | 1 | 73.2 | 94.6 | 29 / 35 | 6218 |
| 6 | 1 | 73.7 | 98.1 | 30 / 35 | 6195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 112 | 87% |
| cre.Karolos 0.32 | 44 | 98% |
| stelo.RamTrackSurfer 1.2 | 14 | 86% |
| stelo.AreaTargetingBot 1.1 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| sample.Walls 1.0 | 3 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 24 | 60% | 101 |
| cre.Karolos 0.32 | 11 | 28% | 53 |
| stelo.RamTrackSurfer 1.2 | 3 | 8% | 18 |
| cw.megas.Blade 0.8 | 1 | 3% | 8 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 8 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 124668 melee ticks, 51022 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 65 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 38967 sent, 34242 reached their opponent, 10210 virtual hits (29.8% of those reached).

## Melee bench: F24

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 797 over 6 battles (132.8 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 77.2 | 62 / 210 | 3.05 | 15.6% | 23448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.3 | 15.6% | 62 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.2% | 42 |
| davidalves.Phoenix 0.54 | 3.2 | 13.0% | 36 |
| florent.XSeries.X2 0.12 | 3.8 | 13.1% | 39 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.1% | 21 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 6 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 6.8% | 4 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 5.4% | 0 |
| evd.X1 0.01 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 80.0 | 7 / 35 | 3842 |
| 2 | 1 | 65.4 | 80.3 | 13 / 35 | 4150 |
| 3 | 2 | 62.8 | 73.7 | 13 / 35 | 3556 |
| 4 | 1 | 64.4 | 78.4 | 11 / 35 | 4042 |
| 5 | 2 | 63.7 | 75.6 | 11 / 35 | 4023 |
| 6 | 1 | 63.1 | 75.2 | 7 / 35 | 3835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 61% |
| pedersen.Ugluk 1.1.1 | 20 | 60% |
| florent.XSeries.X2 0.12 | 19 | 47% |
| davidalves.Phoenix 0.54 | 17 | 47% |
| oog.melee.Corsair 1.0 | 8 | 75% |
| stelo.SoJNanoMelee 1.1 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 22% | 55 |
| florent.XSeries.X2 0.12 | 34 | 22% | 42 |
| pedersen.Ugluk 1.1.1 | 32 | 21% | 39 |
| davidalves.Phoenix 0.54 | 28 | 18% | 42 |
| oog.melee.Corsair 1.0 | 14 | 9% | 19 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 5 |
| evd.X1 0.01 | 2 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 133820 melee ticks, 32335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45240 sent, 40165 reached their opponent, 7518 virtual hits (18.7% of those reached).

## Melee bench: F25

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 255 over 6 battles (42.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.4 | 120 / 210 | 2.31 | 18.0% | 24087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.0% | 120 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.5% | 26 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.6% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.9% | 23 |
| ds.Oo 2.2 | 5.3 | 10.0% | 11 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 9.1% | 6 |
| awesomeness.Elite 1.0 | 6.8 | 7.7% | 2 |
| adt.Ar2 1.1 | 8.3 | 6.3% | 1 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.4% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 22 / 35 | 4305 |
| 2 | 1 | 66.9 | 83.8 | 20 / 35 | 4125 |
| 3 | 1 | 66.4 | 83.5 | 19 / 35 | 3640 |
| 4 | 1 | 69.1 | 91.4 | 24 / 35 | 4094 |
| 5 | 1 | 68.3 | 87.6 | 20 / 35 | 4261 |
| 6 | 1 | 64.5 | 78.7 | 15 / 35 | 3662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 42 | 83% |
| voidious.micro.BlitzBat 1.05 | 35 | 94% |
| jdw.Hurricane 1.4 | 31 | 68% |
| ds.Oo 2.2 | 16 | 69% |
| gre.svman4.Morfeas 1.4.1 | 13 | 69% |
| awesomeness.Elite 1.0 | 6 | 83% |
| adt.Ar2 1.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 67% |

Hadur died in 91 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 23% | 56 |
| jdw.Hurricane 1.4 | 19 | 21% | 32 |
| ds.Oo 2.2 | 14 | 15% | 28 |
| voidious.micro.BlitzBat 1.05 | 12 | 13% | 41 |
| awesomeness.Elite 1.0 | 8 | 9% | 16 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 15 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 10 |
| adt.Ar2 1.1 | 3 | 3% | 8 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 126178 melee ticks, 29094 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 558 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 500 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 44578 sent, 39896 reached their opponent, 6696 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 824 over 6 battles (137.3 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 90.8 | 138 / 210 | 1.83 | 20.3% | 37062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.3% | 138 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 36 |
| shu.nitro.LENIN .T34 | 3.7 | 11.8% | 14 |
| lrem.Spectre 0.4.4 | 3.7 | 12.2% | 11 |
| js.PinBall 1.6 | 4.7 | 11.2% | 8 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.1% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 7.5% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.7 | 6.9% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 24 / 35 | 6350 |
| 2 | 1 | 71.2 | 90.5 | 25 / 35 | 6134 |
| 3 | 1 | 71.1 | 90.5 | 22 / 35 | 6440 |
| 4 | 1 | 70.6 | 90.5 | 23 / 35 | 5904 |
| 5 | 1 | 70.3 | 88.6 | 21 / 35 | 5924 |
| 6 | 1 | 71.3 | 91.4 | 23 / 35 | 6310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 63 | 68% |
| lrem.Spectre 0.4.4 | 34 | 88% |
| shu.nitro.LENIN .T34 | 32 | 97% |
| js.PinBall 1.6 | 20 | 70% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 31 | 40% | 71 |
| shu.nitro.LENIN .T34 | 13 | 17% | 45 |
| js.PinBall 1.6 | 12 | 15% | 30 |
| lrem.Spectre 0.4.4 | 8 | 10% | 36 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 156759 melee ticks, 47410 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 51243 sent, 46311 reached their opponent, 11491 virtual hits (24.8% of those reached).

## Melee bench: F27

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 703 over 6 battles (117.2 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 80.6 | 136 / 210 | 2.75 | 18.6% | 32080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.3 | 18.6% | 136 |
| mk.Alpha 0.2.1 | 1.7 | 14.7% | 39 |
| EH.Eagle 1.0.6 | 3.3 | 10.9% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 4.8 | 9.8% | 1 |
| wee.Gem 1.8.4 | 5.7 | 9.1% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 9.0% | 9 |
| joe.ADinosaur 1.0 | 7.0 | 7.8% | 4 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.2% | 7 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.7 | 26 / 35 | 5342 |
| 2 | 2 | 58.4 | 52.7 | 10 / 35 | 4592 |
| 3 | 1 | 72.3 | 95.9 | 30 / 35 | 5980 |
| 4 | 2 | 63.1 | 61.9 | 17 / 35 | 5210 |
| 5 | 1 | 71.4 | 92.4 | 28 / 35 | 5801 |
| 6 | 1 | 68.9 | 87.0 | 25 / 35 | 5155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 76 | 86% |
| EH.Eagle 1.0.6 | 29 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 100% |
| throxbot.ThroxBot 0.1 | 11 | 91% |
| joe.ADinosaur 1.0 | 6 | 83% |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 100% |
| wee.Gem 1.8.4 | 5 | 80% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 552. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 25 | 31% | 84 |
| cs.Grudge 1.0 | 19 | 24% | 20 |
| EH.Eagle 1.0.6 | 10 | 13% | 34 |
| joe.ADinosaur 1.0 | 7 | 9% | 15 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 8% | 15 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 17 |
| wee.Gem 1.8.4 | 3 | 4% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 11 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 121100 melee ticks, 35725 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 40596 sent, 35914 reached their opponent, 8723 virtual hits (24.3% of those reached).

## Melee bench: F28

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 503 over 6 battles (83.8 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.9 | 117 / 210 | 2.09 | 18.3% | 25190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.3% | 117 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 40 |
| uji.Antique 1.0 | 3.2 | 12.6% | 31 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.0% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.4% | 8 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.3% | 3 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.0% | 5 |
| matt.advanced.Katana 1.0 | 8.0 | 6.6% | 2 |
| stelo.Lifestealer 1.0 | 9.3 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 90.8 | 22 / 35 | 3914 |
| 2 | 1 | 68.0 | 90.8 | 18 / 35 | 4011 |
| 3 | 1 | 68.1 | 86.7 | 20 / 35 | 4490 |
| 4 | 1 | 64.9 | 79.7 | 15 / 35 | 4067 |
| 5 | 1 | 68.2 | 87.9 | 22 / 35 | 4533 |
| 6 | 1 | 68.3 | 91.4 | 20 / 35 | 4175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 67 | 72% |
| uji.Antique 1.0 | 52 | 77% |
| pfvicm.Sobieski 7.2.3b | 13 | 77% |
| qohnil.blot.BlotBot 3.61 | 11 | 73% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 31% | 64 |
| uji.Antique 1.0 | 24 | 25% | 57 |
| qohnil.blot.BlotBot 3.61 | 12 | 13% | 25 |
| amk.ChumbaWumba 0.3 | 10 | 10% | 15 |
| pfvicm.Sobieski 7.2.3b | 7 | 7% | 20 |
| stelo.PianistNano 1.2 | 4 | 4% | 6 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 15 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 132295 melee ticks, 36625 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 43952 sent, 39186 reached their opponent, 5867 virtual hits (15.0% of those reached).

## Melee bench: F29

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.7 | 88 / 210 | 2.38 | 18.3% | 28494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.3% | 88 |
| deewiant.Anomaly 0.2 | 2.3 | 15.5% | 48 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 15.1% | 53 |
| jok.PheonixM 0.1.2 | 4.5 | 10.8% | 10 |
| myl.micro.Troodon 1.10 | 4.5 | 11.2% | 10 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.1% | 0 |
| ap.Frederick 1.1 | 8.3 | 5.2% | 2 |
| DBall.Anarchy 0.1 | 8.3 | 5.4% | 0 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 16 / 35 | 4817 |
| 2 | 1 | 68.3 | 86.7 | 12 / 35 | 4547 |
| 3 | 1 | 68.1 | 83.8 | 12 / 35 | 4950 |
| 4 | 1 | 67.0 | 81.3 | 14 / 35 | 4605 |
| 5 | 1 | 69.6 | 86.0 | 19 / 35 | 5047 |
| 6 | 1 | 67.7 | 83.5 | 15 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 47% |
| myl.micro.Troodon 1.10 | 20 | 75% |
| ap.Frederick 1.1 | 4 | 75% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| jok.PheonixM 0.1.2 | 4 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 37% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 38 | 30% | 60 |
| myl.micro.Troodon 1.10 | 18 | 14% | 31 |
| jok.PheonixM 0.1.2 | 15 | 12% | 20 |
| DBall.Anarchy 0.1 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 164573 melee ticks, 50946 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 34 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 53121 sent, 48363 reached their opponent, 7562 virtual hits (15.6% of those reached).

## Melee bench: F30

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 781 over 6 battles (130.2 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.2 | 46 / 210 | 3.32 | 14.8% | 23065 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.2 | 14.8% | 46 |
| darkcanuck.B26354 1.06 | 2.8 | 13.5% | 49 |
| catcat20.Matcha 0.006 | 2.8 | 13.9% | 53 |
| oog.melee.Capulet 1.2 | 3.7 | 12.7% | 29 |
| stelo.PastFuture 2.3.2 | 4.5 | 11.7% | 15 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.2% | 9 |
| ntc.Opposite 1.5 | 8.0 | 7.3% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.0% | 7 |
| tripphippy.Alice 1.1 | 8.0 | 7.1% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 72.7 | 10 / 35 | 3867 |
| 2 | 1 | 62.6 | 73.7 | 10 / 35 | 3784 |
| 3 | 1 | 63.2 | 80.3 | 6 / 35 | 3318 |
| 4 | 1 | 64.2 | 78.1 | 9 / 35 | 4094 |
| 5 | 2 | 59.9 | 66.3 | 5 / 35 | 3778 |
| 6 | 1 | 62.9 | 74.3 | 6 / 35 | 4224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 20% |
| darkcanuck.B26354 1.06 | 22 | 41% |
| oog.melee.Capulet 1.2 | 19 | 58% |
| stelo.PastFuture 2.3.2 | 11 | 82% |
| intruder.PrairieWolf 2.61 | 6 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| tripphippy.Alice 1.1 | 5 | 60% |

Hadur died in 170 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 46 | 27% | 50 |
| stelo.PastFuture 2.3.2 | 36 | 21% | 45 |
| darkcanuck.B26354 1.06 | 31 | 18% | 39 |
| oog.melee.Capulet 1.2 | 24 | 14% | 37 |
| tripphippy.Alice 1.1 | 8 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 11 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 12 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 156057 melee ticks, 29240 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 34 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 50967 sent, 45980 reached their opponent, 7717 virtual hits (16.8% of those reached).

## Melee bench: F31

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 596 over 6 battles (99.3 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.7 | 54 / 210 | 3.10 | 15.3% | 22119 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.0% | 86 |
| hadur117.Hadur 3.19bb | 2.0 | 15.3% | 54 |
| gh.mini.Griezel 0.2 | 3.7 | 12.6% | 42 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.8% | 10 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.2% | 10 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.7% | 1 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.1% | 4 |
| fm.mammillarias 1.3 | 8.3 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.3% | 2 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 78.1 | 7 / 35 | 3848 |
| 2 | 2 | 63.6 | 78.7 | 8 / 35 | 3634 |
| 3 | 2 | 62.4 | 73.7 | 7 / 35 | 3585 |
| 4 | 2 | 63.1 | 76.5 | 12 / 35 | 3471 |
| 5 | 2 | 63.5 | 74.9 | 8 / 35 | 3878 |
| 6 | 2 | 64.2 | 78.1 | 12 / 35 | 3703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 41 | 41% |
| gh.mini.Griezel 0.2 | 28 | 36% |
| d414.nano.Quantum 1.0.0 | 16 | 88% |
| spinnercat.micro.Tyger 0.1 | 10 | 70% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 62 | 39% | 77 |
| gh.mini.Griezel 0.2 | 34 | 21% | 47 |
| d414.nano.Quantum 1.0.0 | 22 | 14% | 35 |
| spinnercat.micro.Tyger 0.1 | 16 | 10% | 22 |
| timmit.nano.TimDog 0.33 | 8 | 5% | 11 |
| fm.mammillarias 1.3 | 7 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 146674 melee ticks, 28174 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 42 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47901 sent, 43035 reached their opponent, 7158 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 389 over 6 battles (64.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.8 | 97 / 210 | 2.28 | 17.6% | 26716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 17.6% | 97 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.6% | 51 |
| apc.botM 3.0 | 2.8 | 12.6% | 28 |
| lxx.ConceptA 0.8 | 4.7 | 10.0% | 4 |
| vjik.UnViolation 1.1 | 4.8 | 10.1% | 15 |
| bayen.UbaMicro 1.4 | 5.5 | 9.2% | 2 |
| conscience.Electron 1.3g | 7.8 | 6.8% | 3 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 6 |
| panzer.Panzer 0.2 | 8.2 | 7.1% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.8 | 13 / 35 | 4572 |
| 2 | 1 | 68.4 | 89.8 | 21 / 35 | 4645 |
| 3 | 1 | 67.2 | 86.0 | 21 / 35 | 4485 |
| 4 | 1 | 65.4 | 84.8 | 14 / 35 | 4201 |
| 5 | 1 | 65.6 | 84.1 | 10 / 35 | 4446 |
| 6 | 1 | 66.3 | 85.1 | 18 / 35 | 4367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 47% |
| apc.botM 3.0 | 44 | 70% |
| vjik.UnViolation 1.1 | 14 | 57% |
| lxx.ConceptA 0.8 | 9 | 78% |
| bayen.UbaMicro 1.4 | 9 | 89% |
| yk.JahMicro 1.0 | 7 | 57% |
| donjezza.Jezza 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 33% | 64 |
| apc.botM 3.0 | 24 | 21% | 54 |
| lxx.ConceptA 0.8 | 20 | 17% | 27 |
| vjik.UnViolation 1.1 | 10 | 9% | 25 |
| bayen.UbaMicro 1.4 | 7 | 6% | 15 |
| yk.JahMicro 1.0 | 6 | 5% | 11 |
| conscience.Electron 1.3g | 4 | 3% | 4 |
| panzer.Panzer 0.2 | 3 | 3% | 5 |
| donjezza.Jezza 1.0 | 2 | 2% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 123417 melee ticks, 45441 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 370 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 107 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 41644 sent, 36822 reached their opponent, 6564 virtual hits (17.8% of those reached).

## Melee bench: F33

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 853 over 6 battles (142.2 per battle, most in one battle 154). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.1 | 98 / 210 | 2.52 | 18.0% | 28551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.2 | 18.0% | 98 |
| maribo.Quester 0.3 | 1.8 | 15.6% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 24 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.5% | 16 |
| labg.Cataclysm 2.05 | 4.7 | 11.0% | 21 |
| baal.nano.N 1.42 | 6.2 | 8.7% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.4% | 5 |
| zyx.micro.Ant 1.1 | 8.5 | 5.4% | 0 |
| sanja.First 0.1 | 8.5 | 5.1% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 76.8 | 12 / 35 | 4313 |
| 2 | 1 | 67.1 | 83.5 | 12 / 35 | 4531 |
| 3 | 1 | 68.6 | 84.1 | 20 / 35 | 4854 |
| 4 | 1 | 68.1 | 82.5 | 19 / 35 | 4972 |
| 5 | 1 | 66.3 | 80.3 | 12 / 35 | 4663 |
| 6 | 1 | 70.7 | 91.4 | 23 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 71% |
| gre.svman4.Leonidas 1.3.2 | 28 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 65% |
| labg.Cataclysm 2.05 | 18 | 61% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 33% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 18% | 37 |
| gre.svman4.Leonidas 1.3.2 | 20 | 17% | 38 |
| labg.Cataclysm 2.05 | 18 | 15% | 32 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 7% | 9 |
| baal.nano.N 1.42 | 5 | 4% | 7 |
| zyx.micro.Ant 1.1 | 3 | 3% | 3 |
| sanja.First 0.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 174770 melee ticks, 42559 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 46 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 54943 sent, 50071 reached their opponent, 7393 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 346 over 6 battles (57.7 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.1 | 90 / 210 | 2.07 | 18.6% | 31684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.6% | 90 |
| stelo.Spread 0.9 | 2.5 | 16.3% | 63 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 39 |
| tcf.Reach 3 | 4.5 | 11.0% | 4 |
| jcs.Seth 1.8 | 4.7 | 11.0% | 14 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.RamFire 1.0 | 9.3 | 3.0% | 0 |
| sample.VelociRobot 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 17 / 35 | 5080 |
| 2 | 1 | 68.4 | 85.4 | 11 / 35 | 5222 |
| 3 | 1 | 71.0 | 91.1 | 20 / 35 | 5764 |
| 4 | 1 | 69.2 | 87.9 | 14 / 35 | 5313 |
| 5 | 1 | 68.4 | 87.3 | 10 / 35 | 5172 |
| 6 | 1 | 69.2 | 86.3 | 18 / 35 | 5133 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 70 | 53% |
| kid.Gladiator .7.2 | 58 | 50% |
| jcs.Seth 1.8 | 16 | 69% |
| tcf.Reach 3 | 9 | 89% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1087. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 49 | 40% | 85 |
| kid.Gladiator .7.2 | 49 | 40% | 74 |
| jcs.Seth 1.8 | 11 | 9% | 24 |
| tcf.Reach 3 | 5 | 4% | 16 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| cli.Dancer 1.1 | 2 | 2% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 164459 melee ticks, 62855 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 34 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 51396 sent, 46635 reached their opponent, 8068 virtual hits (17.3% of those reached).

## Melee bench: F35

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 734 over 6 battles (122.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.9 | 32 / 210 | 2.72 | 15.7% | 23666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 147 |
| hadur117.Hadur 3.19bb | 2.0 | 15.7% | 32 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.9% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 11.8% | 7 |
| rz.HawkOnFire 0.1 | 4.8 | 11.2% | 5 |
| wit.Chuliath 1.0 | 6.0 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.8 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 79.7 | 5 / 35 | 4206 |
| 2 | 2 | 65.3 | 83.5 | 8 / 35 | 4023 |
| 3 | 2 | 64.3 | 80.3 | 4 / 35 | 3789 |
| 4 | 2 | 65.9 | 84.1 | 8 / 35 | 3870 |
| 5 | 2 | 63.2 | 76.5 | 4 / 35 | 3797 |
| 6 | 2 | 64.5 | 81.3 | 3 / 35 | 3981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 89 | 13% |
| gh.mini.Gruwel 0.9 | 23 | 43% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 184 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 104 | 57% | 118 |
| gh.mini.Gruwel 0.9 | 28 | 15% | 35 |
| rz.HawkOnFire 0.1 | 18 | 10% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 8% | 21 |
| wit.Chuliath 1.0 | 6 | 3% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 149027 melee ticks, 49638 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 45954 sent, 40920 reached their opponent, 6406 virtual hits (15.7% of those reached).

## Melee bench: F36

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 6 battles (33.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.3 | 150 / 210 | 1.70 | 20.8% | 33577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.8% | 150 |
| bzdp.Pansy 2.1 | 2.8 | 12.1% | 16 |
| alpha.RainingFire 1.0 | 3.0 | 12.1% | 11 |
| mz.Cork 0.1 | 4.3 | 10.8% | 15 |
| bvh.micro.Freya 0.3 | 5.0 | 10.7% | 11 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.7% | 2 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.7% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 5.5% | 0 |
| dl.BetterWalls 1.0 | 9.0 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 92.4 | 27 / 35 | 5818 |
| 2 | 1 | 70.4 | 88.6 | 26 / 35 | 5489 |
| 3 | 1 | 71.7 | 95.6 | 25 / 35 | 5725 |
| 4 | 1 | 71.6 | 93.3 | 27 / 35 | 5645 |
| 5 | 1 | 69.8 | 89.8 | 20 / 35 | 5303 |
| 6 | 1 | 71.4 | 94.0 | 25 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 89% |
| mz.Cork 0.1 | 36 | 81% |
| alpha.RainingFire 1.0 | 35 | 89% |
| bvh.micro.Freya 0.3 | 27 | 81% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| m3thos.Eva02 0.7.1 | 14 | 71% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 19 | 32% | 52 |
| alpha.RainingFire 1.0 | 11 | 18% | 40 |
| bvh.micro.Freya 0.3 | 10 | 17% | 38 |
| mz.Cork 0.1 | 6 | 10% | 32 |
| m3thos.Eva02 0.7.1 | 6 | 10% | 23 |
| bvh.mini.Fenrir 0.39 | 6 | 10% | 15 |
| dl.BetterWalls 1.0 | 1 | 2% | 7 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 1 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 142211 melee ticks, 48157 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 46 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49019 sent, 44501 reached their opponent, 9274 virtual hits (20.8% of those reached).

## Melee bench: F37

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 380 over 6 battles (63.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.3 | 163 / 210 | 2.06 | 19.3% | 34024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.3% | 163 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 11.0% | 12 |
| germ.TheMind .2 | 4.5 | 9.6% | 4 |
| EBBU.Sim2 1.02 | 4.7 | 9.3% | 5 |
| agrach.Dalek 1.0 | 4.8 | 9.3% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.5% | 6 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 7 |
| lmk.ACPFinal 0.1 | 7.7 | 8.4% | 2 |
| skm.Ryubot 1.0 | 8.0 | 8.0% | 1 |
| mb.Beast 0.1 | 8.5 | 8.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.3 | 24 / 35 | 5536 |
| 2 | 1 | 68.7 | 89.8 | 29 / 35 | 5368 |
| 3 | 1 | 67.7 | 86.3 | 27 / 35 | 5477 |
| 4 | 1 | 68.7 | 87.3 | 27 / 35 | 5932 |
| 5 | 1 | 69.2 | 90.2 | 28 / 35 | 5846 |
| 6 | 1 | 68.7 | 87.6 | 28 / 35 | 5865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 32 | 97% |
| agrach.Dalek 1.0 | 28 | 100% |
| germ.TheMind .2 | 25 | 96% |
| stelo.UntouchableNano 1.3 | 23 | 87% |
| EBBU.Sim2 1.02 | 18 | 100% |
| lmk.ACPFinal 0.1 | 16 | 100% |
| mb.Beast 0.1 | 13 | 100% |
| skm.Ryubot 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 0% |

Hadur died in 49 of 210 rounds, at a mean tick of 387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 13 | 27% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 10 | 20% | 41 |
| lmk.ACPFinal 0.1 | 6 | 12% | 28 |
| stelo.UntouchableNano 1.3 | 6 | 12% | 21 |
| mb.Beast 0.1 | 4 | 8% | 19 |
| EBBU.Sim2 1.02 | 3 | 6% | 22 |
| agrach.Dalek 1.0 | 2 | 4% | 38 |
| germ.TheMind .2 | 2 | 4% | 15 |
| skm.Ryubot 1.0 | 1 | 2% | 8 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 92708 melee ticks, 26819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 442 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 311 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 31345 sent, 26806 reached their opponent, 7745 virtual hits (28.9% of those reached).

## Melee bench: F38

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 6 battles (55.3 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.5 | 111 / 210 | 2.12 | 18.4% | 28103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.4% | 111 |
| justin.Mallais 14.0 | 2.0 | 15.7% | 50 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 10 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.8% | 22 |
| cs.Wren 1.0 | 5.2 | 10.2% | 5 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.3% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.9% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.9 | 15 / 35 | 4338 |
| 2 | 1 | 69.1 | 88.3 | 21 / 35 | 4906 |
| 3 | 1 | 67.6 | 86.3 | 17 / 35 | 4447 |
| 4 | 1 | 68.6 | 87.0 | 19 / 35 | 4982 |
| 5 | 1 | 68.7 | 89.2 | 19 / 35 | 4858 |
| 6 | 1 | 68.1 | 86.3 | 20 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 76 | 70% |
| bvh.mini.Freya 0.55 | 27 | 89% |
| bts.mega.Gnarly 1.4 | 23 | 78% |
| cs.Wren 1.0 | 10 | 90% |
| kdf.KoulDestroyer 1.0 | 6 | 33% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 28 | 28% | 73 |
| bts.mega.Gnarly 1.4 | 22 | 22% | 46 |
| bvh.mini.Freya 0.55 | 16 | 16% | 32 |
| cs.Wren 1.0 | 13 | 13% | 29 |
| kdf.KoulDestroyer 1.0 | 11 | 11% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 3 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 137622 melee ticks, 37942 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 50 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 45146 sent, 40173 reached their opponent, 8432 virtual hits (21.0% of those reached).

## Melee bench: F39

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 784 over 6 battles (130.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.7 | 89 / 210 | 2.20 | 18.1% | 29866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.1% | 89 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 18 |
| az.Ololobot 0.2.4 | 3.0 | 13.3% | 65 |
| catcat20.Lambda 0.024 | 4.0 | 11.8% | 33 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 8.4% | 1 |
| gimp.GimpBot 0.1 | 6.7 | 7.7% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.4% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.8 | 10 / 35 | 4960 |
| 2 | 1 | 68.5 | 87.3 | 20 / 35 | 5326 |
| 3 | 1 | 67.9 | 89.2 | 14 / 35 | 4958 |
| 4 | 1 | 67.7 | 89.5 | 15 / 35 | 4965 |
| 5 | 1 | 66.8 | 84.4 | 14 / 35 | 4847 |
| 6 | 1 | 66.8 | 85.1 | 16 / 35 | 4810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 57 | 40% |
| bvh.fry.Freya 0.82 | 42 | 88% |
| catcat20.Lambda 0.024 | 37 | 49% |
| gimp.GimpBot 0.1 | 6 | 83% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 1048. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 45 | 35% | 67 |
| bvh.fry.Freya 0.82 | 35 | 28% | 73 |
| catcat20.Lambda 0.024 | 27 | 21% | 42 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 6 |
| gimp.GimpBot 0.1 | 3 | 2% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 161217 melee ticks, 55464 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 55 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51405 sent, 46631 reached their opponent, 8242 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 608 over 6 battles (101.3 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.7 | 128 / 210 | 2.10 | 19.3% | 30053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.3% | 128 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 15.0% | 35 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 16 |
| mz.AntiGrav 1.0 | 3.7 | 11.7% | 11 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.2% | 9 |
| alpha.BlackIce 1.0 | 6.0 | 9.2% | 4 |
| stelo.Randomness 1.0 | 6.7 | 8.4% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.2% | 1 |
| sample.Corners 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.7 | 25 / 35 | 5235 |
| 2 | 1 | 69.1 | 85.1 | 20 / 35 | 4969 |
| 3 | 1 | 68.4 | 86.3 | 19 / 35 | 4766 |
| 4 | 1 | 69.0 | 85.7 | 20 / 35 | 5024 |
| 5 | 1 | 68.8 | 86.0 | 23 / 35 | 4596 |
| 6 | 1 | 70.4 | 89.5 | 21 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 78% |
| kano.gamma.KanoGamma 1.8 | 38 | 87% |
| mz.AntiGrav 1.0 | 29 | 83% |
| Polkwane.SmashMelee 1.0 | 13 | 92% |
| alpha.BlackIce 1.0 | 8 | 75% |
| stelo.Randomness 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 34% | 66 |
| kano.gamma.KanoGamma 1.8 | 16 | 18% | 54 |
| Polkwane.SmashMelee 1.0 | 12 | 14% | 20 |
| mz.AntiGrav 1.0 | 8 | 9% | 29 |
| alpha.BlackIce 1.0 | 7 | 8% | 15 |
| stelo.Randomness 1.0 | 5 | 6% | 13 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 9 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149129 melee ticks, 39919 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 58 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 49320 sent, 44330 reached their opponent, 9429 virtual hits (21.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 6 battles (53.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.6 | 96 / 210 | 2.21 | 18.0% | 26507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.2 | 18.0% | 96 |
| eem.EvBotNG v12.8 | 1.8 | 16.5% | 79 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.6% | 12 |
| ary.Swarm 1.1 | 3.5 | 12.9% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 4 |
| shrub.Silver v048 | 6.2 | 8.9% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 18 / 35 | 4748 |
| 2 | 1 | 68.9 | 89.5 | 18 / 35 | 4393 |
| 3 | 1 | 68.7 | 87.9 | 20 / 35 | 4321 |
| 4 | 2 | 65.1 | 79.4 | 10 / 35 | 4074 |
| 5 | 1 | 69.1 | 89.2 | 18 / 35 | 4733 |
| 6 | 1 | 67.1 | 85.1 | 12 / 35 | 4238 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 43% |
| lessonz.robocode.Oz 0.5.0 | 33 | 91% |
| ary.Swarm 1.1 | 22 | 86% |
| simonton.nano.MeleeSeed 1.8 | 14 | 86% |
| shrub.Silver v048 | 3 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |

Hadur died in 116 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 56 | 48% | 89 |
| ary.Swarm 1.1 | 23 | 20% | 40 |
| lessonz.robocode.Oz 0.5.0 | 16 | 14% | 39 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 20 |
| shrub.Silver v048 | 4 | 3% | 11 |
| stelo.Mirror 1.1 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 148610 melee ticks, 41424 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 128 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 48944 sent, 44173 reached their opponent, 6858 virtual hits (15.5% of those reached).

## Melee bench: F42

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 614 over 6 battles (102.3 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 127 / 210 | 1.99 | 19.5% | 33484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.5% | 127 |
| wompi.Wallaby 5.1 | 2.2 | 15.1% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.8% | 12 |
| ara.Shera 0.88 | 3.5 | 13.2% | 28 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.0% | 1 |
| maribo.IotaCT 1.1 | 7.0 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 25 / 35 | 5665 |
| 2 | 1 | 69.2 | 88.9 | 19 / 35 | 5471 |
| 3 | 1 | 69.2 | 85.7 | 20 / 35 | 5592 |
| 4 | 1 | 71.0 | 93.0 | 22 / 35 | 5841 |
| 5 | 1 | 68.1 | 83.8 | 21 / 35 | 5198 |
| 6 | 1 | 69.8 | 88.9 | 20 / 35 | 5717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 78 | 83% |
| maribo.mini.MiniQuester 0.1 | 39 | 87% |
| ara.Shera 0.88 | 29 | 62% |
| dsw.StaticD 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 3 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 32 | 35% | 52 |
| wompi.Wallaby 5.1 | 28 | 31% | 89 |
| maribo.mini.MiniQuester 0.1 | 17 | 19% | 43 |
| dsw.StaticD 1.0 | 6 | 7% | 10 |
| amz.NanoClone 1.41 | 2 | 2% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 4 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167424 melee ticks, 43871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 4.

Targeting waves (206 rounds): 52743 sent, 47965 reached their opponent, 9415 virtual hits (19.6% of those reached).

## Melee bench: F43

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 539 over 6 battles (89.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.8 | 29 / 210 | 2.90 | 15.4% | 23515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 146 |
| hadur117.Hadur 3.19bb | 2.0 | 15.4% | 29 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.0% | 29 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.5% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.5% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 76.8 | 4 / 35 | 3910 |
| 2 | 2 | 67.4 | 83.8 | 7 / 35 | 4422 |
| 3 | 2 | 64.2 | 75.9 | 3 / 35 | 3844 |
| 4 | 2 | 66.2 | 80.6 | 6 / 35 | 4048 |
| 5 | 2 | 65.3 | 81.0 | 6 / 35 | 3655 |
| 6 | 2 | 64.0 | 74.9 | 3 / 35 | 3636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 16% |
| brainfade.melee.Dusk 0.44 | 17 | 41% |
| dummy.micro.Sparrow 2.5 | 6 | 67% |
| mz.NanoGod 2.02 | 3 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 116 | 63% | 131 |
| brainfade.melee.Dusk 0.44 | 29 | 16% | 33 |
| dummy.micro.Sparrow 2.5 | 12 | 6% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 13 |
| mz.NanoGod 2.02 | 7 | 4% | 10 |
| jab.DiamondStealer 5 | 3 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 161355 melee ticks, 40966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 49 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 3.

Targeting waves (208 rounds): 51093 sent, 45968 reached their opponent, 7509 virtual hits (16.3% of those reached).

## Melee bench: F44

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 478 over 6 battles (79.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.1 | 132 / 210 | 1.90 | 20.1% | 34037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.1% | 132 |
| stelo.Liblix 0.3.1 | 2.2 | 16.0% | 54 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.7% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.2 | 9.6% | 0 |
| jwirde.Gort 2.0 | 4.8 | 8.9% | 1 |
| wompi.Quokka 1.6 | 6.5 | 7.6% | 1 |
| disan.Chair 2.2.0 | 6.7 | 7.6% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 5.1% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 84.4 | 15 / 35 | 5733 |
| 2 | 1 | 71.5 | 94.0 | 24 / 35 | 5829 |
| 3 | 1 | 69.0 | 84.1 | 21 / 35 | 5487 |
| 4 | 1 | 70.6 | 93.0 | 19 / 35 | 5691 |
| 5 | 1 | 71.5 | 92.1 | 26 / 35 | 5782 |
| 6 | 1 | 70.9 | 92.7 | 27 / 35 | 5515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 84 | 68% |
| tzu.TheArtOfWar 1.2 | 54 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 9 | 100% |
| disan.Chair 2.2.0 | 8 | 100% |
| jwirde.Gort 2.0 | 7 | 100% |
| wompi.Quokka 1.6 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 54% | 107 |
| tzu.TheArtOfWar 1.2 | 16 | 19% | 56 |
| jwirde.Gort 2.0 | 6 | 7% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 15 |
| wompi.Quokka 1.6 | 4 | 5% | 5 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 3 |
| disan.Chair 2.2.0 | 1 | 1% | 6 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152791 melee ticks, 45569 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 58 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 52486 sent, 47748 reached their opponent, 10080 virtual hits (21.1% of those reached).

## Melee bench: F45

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 807 over 6 battles (134.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.5 | 99 / 210 | 2.21 | 19.4% | 33172 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.4% | 99 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.5% | 88 |
| jje.BagPuss 1.2 | 3.0 | 12.2% | 11 |
| myl.nano.Graviton 1.10 | 3.7 | 11.3% | 5 |
| sul.Lunar 1.1 | 5.2 | 9.9% | 5 |
| fm.claire 1.7 | 6.7 | 8.8% | 1 |
| hvilela.HVilela 0.9 | 6.7 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.0% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.6% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.2 | 15 / 35 | 5531 |
| 2 | 1 | 70.2 | 89.5 | 17 / 35 | 5755 |
| 3 | 1 | 69.7 | 90.8 | 19 / 35 | 5288 |
| 4 | 1 | 69.8 | 86.7 | 18 / 35 | 5719 |
| 5 | 1 | 67.8 | 82.5 | 13 / 35 | 5367 |
| 6 | 1 | 67.9 | 80.3 | 17 / 35 | 5512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 46% |
| myl.nano.Graviton 1.10 | 19 | 89% |
| jje.BagPuss 1.2 | 18 | 72% |
| sul.Lunar 1.1 | 17 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1352. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 46 | 39% | 0 |
| jje.BagPuss 1.2 | 27 | 23% | 66 |
| myl.nano.Graviton 1.10 | 16 | 14% | 47 |
| hvilela.HVilela 0.9 | 8 | 7% | 13 |
| sul.Lunar 1.1 | 6 | 5% | 46 |
| fm.claire 1.7 | 3 | 3% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 19 |
| wit.Deep7 2.0 | 2 | 2% | 6 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 182116 melee ticks, 95951 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 58097 sent, 53265 reached their opponent, 7897 virtual hits (14.8% of those reached).

## Melee bench: F46

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 749 over 6 battles (124.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.8 | 56 / 210 | 2.46 | 16.6% | 25820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.4% | 58 |
| hadur117.Hadur 3.19bb | 1.8 | 16.6% | 56 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 15.9% | 74 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 2 |
| cx.Princess 1.0 | 4.5 | 10.5% | 15 |
| sadoner.killer 0.2 | 6.2 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.6 | 11 / 35 | 4251 |
| 2 | 3 | 64.8 | 80.0 | 10 / 35 | 4060 |
| 3 | 2 | 66.2 | 83.8 | 8 / 35 | 4482 |
| 4 | 1 | 67.0 | 84.4 | 13 / 35 | 4420 |
| 5 | 2 | 65.3 | 83.5 | 10 / 35 | 3968 |
| 6 | 2 | 65.7 | 83.5 | 4 / 35 | 4639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 68 | 51% |
| rsalesc.melee.Medina 0.4.5 | 42 | 14% |
| cx.Princess 1.0 | 11 | 55% |
| mz.MicroSheep 1.0 | 8 | 88% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 2 | 50% |

Hadur died in 160 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 58 | 36% | 63 |
| kc.mini.Mirage 0.2 | 56 | 35% | 89 |
| cx.Princess 1.0 | 14 | 9% | 19 |
| mz.MicroSheep 1.0 | 9 | 6% | 20 |
| arthord.NanoSatanMelee Beta | 8 | 5% | 9 |
| sadoner.killer 0.2 | 8 | 5% | 9 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 156111 melee ticks, 49603 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 37 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 45512 sent, 40554 reached their opponent, 6066 virtual hits (15.0% of those reached).

