# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1025 over 6 battles (170.8 per battle, most in one battle 376). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.8 | 37 / 210 | 2.55 | 16.4% | 29845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 144 |
| hadur117.Hadur 3.19aa | 2.0 | 16.4% | 37 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.1% | 2 |
| sgp.JollyNinja 3.53 | 4.5 | 10.6% | 15 |
| lorneswork.Predator 1.0 | 4.8 | 10.1% | 4 |
| mz.MicroGodMelee 1 | 5.0 | 10.4% | 8 |
| adt.Ar2 1.0 | 7.0 | 8.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 78.7 | 4 / 35 | 4902 |
| 2 | 2 | 67.6 | 85.7 | 9 / 35 | 5446 |
| 3 | 2 | 66.2 | 84.4 | 8 / 35 | 4755 |
| 4 | 2 | 65.0 | 81.0 | 4 / 35 | 4614 |
| 5 | 2 | 66.2 | 83.8 | 5 / 35 | 5151 |
| 6 | 2 | 65.7 | 83.2 | 7 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 8% |
| sgp.JollyNinja 3.53 | 19 | 63% |
| mz.MicroGodMelee 1 | 11 | 55% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 86% |
| lorneswork.Predator 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 1 | 0% |

Hadur died in 174 of 210 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 69% | 133 |
| sgp.JollyNinja 3.53 | 12 | 7% | 24 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 6% | 15 |
| mz.MicroGodMelee 1 | 10 | 6% | 14 |
| lorneswork.Predator 1.0 | 10 | 6% | 13 |
| adt.Ar2 1.0 | 5 | 3% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 1 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 187 rounds): 130671 melee ticks, 77871 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (187 rounds): longest scan gap while four or more were alive 65 ticks (187 rounds over 8); rounds whose longest gap at any count was over 8: 187; robots dropped as dead without a death event: 2.

Targeting waves (187 rounds): 41297 sent, 36936 reached their opponent, 7358 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2319 over 6 battles (386.5 per battle, most in one battle 866). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.5 | 93 / 210 | 2.49 | 17.7% | 29003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.7% | 93 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 13.6% | 26 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.3% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.6% | 19 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.4% | 2 |
| Noran.BitchingElk 0.054 | 6.7 | 8.5% | 16 |
| sch.Simone 0.3d | 7.8 | 7.3% | 10 |
| stelo.PatternRobot 1.0 | 9.2 | 5.4% | 4 |
| fullsail.SweetTea 1.1 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.0 | 17 / 35 | 5054 |
| 2 | 1 | 66.0 | 81.3 | 12 / 35 | 4780 |
| 3 | 1 | 68.9 | 87.9 | 18 / 35 | 5340 |
| 4 | 1 | 67.2 | 87.3 | 20 / 35 | 4516 |
| 5 | 1 | 64.7 | 76.2 | 14 / 35 | 4579 |
| 6 | 1 | 66.1 | 82.2 | 12 / 35 | 4734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 68% |
| pulsar.PulsarMax 0.8.9 | 36 | 61% |
| com.cohesiva.robocode.ManOwaR 1.0 | 22 | 55% |
| Noran.BitchingElk 0.054 | 21 | 48% |
| sch.Simone 0.3d | 13 | 62% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 88% |
| fnc.bandit.Bandit 5.2.0 | 5 | 60% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 28 | 24% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 19% | 45 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 15% | 35 |
| Noran.BitchingElk 0.054 | 14 | 12% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 15 |
| sch.Simone 0.3d | 10 | 8% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 10 |
| stelo.PatternRobot 1.0 | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 3 | 3% | 5 |

Posture (Hadur's M records, 183 rounds): 154244 melee ticks, 39854 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (183 rounds): longest scan gap while four or more were alive 88 ticks (183 rounds over 8); rounds whose longest gap at any count was over 8: 183; robots dropped as dead without a death event: 2.

Targeting waves (183 rounds): 53628 sent, 49329 reached their opponent, 8313 virtual hits (16.9% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.3 | 147 / 210 | 1.96 | 19.8% | 37109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.8% | 147 |
| radnor.DoctorBob 1.42 | 2.2 | 13.9% | 17 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.3% | 23 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 20 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.4% | 1 |
| oa.weak.FlyMk1 0.1 | 6.8 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.2 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.4 | 23 / 35 | 6196 |
| 2 | 1 | 68.3 | 87.0 | 20 / 35 | 5671 |
| 3 | 1 | 70.6 | 90.5 | 25 / 35 | 6361 |
| 4 | 1 | 70.1 | 88.9 | 26 / 35 | 6480 |
| 5 | 1 | 70.7 | 92.4 | 26 / 35 | 6300 |
| 6 | 1 | 70.3 | 91.7 | 27 / 35 | 6101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 61 | 87% |
| radnor.DoctorBob 1.42 | 52 | 96% |
| kawigi.nano.Lib 1.0 | 46 | 83% |
| urdos.URDOS 1.3 | 4 | 75% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 26 | 41% | 74 |
| kawigi.nano.Lib 1.0 | 12 | 19% | 40 |
| vuen.Cake 2.51 | 8 | 13% | 56 |
| urdos.URDOS 1.3 | 8 | 13% | 13 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 6% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| adt.Ar1 2.1 | 2 | 3% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 8 |

Posture (Hadur's M records, 201 rounds): 126658 melee ticks, 39947 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 64 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 38209 sent, 33696 reached their opponent, 8564 virtual hits (25.4% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 306 over 6 battles (51.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.7 | 23 / 210 | 2.29 | 17.4% | 33407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.7% | 170 |
| hadur117.Hadur 3.19aa | 2.0 | 17.4% | 23 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 9 |
| josago.Jorgito 0.16 | 5.3 | 9.1% | 1 |
| css.Delitioner 0.11 | 5.8 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.2% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.8 | 87.3 | 3 / 35 | 5836 |
| 2 | 2 | 66.8 | 83.2 | 0 / 35 | 5415 |
| 3 | 2 | 67.7 | 85.7 | 5 / 35 | 5368 |
| 4 | 2 | 68.6 | 88.6 | 6 / 35 | 5578 |
| 5 | 2 | 66.7 | 81.3 | 4 / 35 | 5491 |
| 6 | 2 | 68.9 | 87.9 | 5 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 7% |
| TNT.TNT 0.99.1 | 13 | 38% |
| apc.LeeroyJenkins2 1.0 | 6 | 100% |
| css.Delitioner 0.11 | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 1304. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 76% | 156 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 28 |
| TNT.TNT 0.99.1 | 13 | 7% | 17 |
| josago.Jorgito 0.16 | 6 | 3% | 6 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| css.Delitioner 0.11 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 196440 melee ticks, 73899 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 60558 sent, 55701 reached their opponent, 8601 virtual hits (15.4% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 546 over 6 battles (91.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.6 | 34 / 210 | 3.20 | 14.6% | 22734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.3 | 17.5% | 63 |
| cb.fire.Firestarter 2.0f | 1.7 | 17.1% | 93 |
| hadur117.Hadur 3.19aa | 3.0 | 14.6% | 34 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 11 |
| ms.Ares 0.19 | 5.3 | 9.5% | 3 |
| axeBots.HataMoto 3.09 | 5.7 | 9.3% | 6 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 73.3 | 5 / 35 | 3746 |
| 2 | 3 | 64.5 | 79.0 | 5 / 35 | 4105 |
| 3 | 3 | 62.0 | 73.7 | 5 / 35 | 3625 |
| 4 | 3 | 63.2 | 76.5 | 6 / 35 | 3662 |
| 5 | 3 | 64.2 | 76.5 | 6 / 35 | 4071 |
| 6 | 3 | 62.5 | 74.6 | 7 / 35 | 3525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 33 | 42% |
| cb.fire.Firestarter 2.0f | 27 | 4% |
| wompi.Numbat 2.1 | 17 | 88% |
| axeBots.HataMoto 3.09 | 4 | 25% |
| ms.Ares 0.19 | 2 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 72 | 40% | 87 |
| cb.fire.Firestarter 2.0f | 58 | 32% | 63 |
| wompi.Numbat 2.1 | 23 | 13% | 34 |
| ms.Ares 0.19 | 13 | 7% | 14 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146833 melee ticks, 30844 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 81 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46077 sent, 41039 reached their opponent, 6891 virtual hits (16.8% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1466 over 6 battles (244.3 per battle, most in one battle 334). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.3 | 121 / 210 | 2.68 | 17.8% | 28874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.8% | 121 |
| jekl.StoneGhost 0.7 | 2.2 | 14.7% | 27 |
| origin.SleepSiphon 1.7b | 3.0 | 13.7% | 40 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.1% | 15 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 3 |
| gg.Wolverine 2.0 | 6.3 | 8.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.1% | 4 |
| DBall.NUKE 0.1 | 7.8 | 6.9% | 0 |
| spinnercat.Omen 1.0 | 8.7 | 5.8% | 3 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.6 | 20 / 35 | 4700 |
| 2 | 1 | 67.4 | 80.3 | 18 / 35 | 4959 |
| 3 | 1 | 66.6 | 77.8 | 23 / 35 | 4578 |
| 4 | 1 | 68.5 | 83.8 | 24 / 35 | 5105 |
| 5 | 1 | 67.3 | 81.0 | 19 / 35 | 4643 |
| 6 | 1 | 67.4 | 84.4 | 17 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 86% |
| origin.SleepSiphon 1.7b | 38 | 79% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 91% |
| mld.Wisdom 1.0 | 12 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 70% |
| gg.Wolverine 2.0 | 9 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 24% | 55 |
| jekl.StoneGhost 0.7 | 19 | 20% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 20% | 38 |
| mld.Wisdom 1.0 | 9 | 9% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 7% | 16 |
| sample.Fire 1.0 | 5 | 5% | 4 |
| gg.Wolverine 2.0 | 4 | 4% | 8 |
| DBall.NUKE 0.1 | 2 | 2% | 6 |
| spinnercat.Omen 1.0 | 2 | 2% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 182 rounds): 128468 melee ticks, 39558 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (182 rounds): longest scan gap while four or more were alive 29 ticks (181 rounds over 8); rounds whose longest gap at any count was over 8: 181; robots dropped as dead without a death event: 2.

Targeting waves (182 rounds): 40562 sent, 36286 reached their opponent, 8001 virtual hits (22.0% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 302 over 6 battles (50.3 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 93.5 | 122 / 210 | 1.58 | 21.0% | 39934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 21.0% | 122 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.4% | 36 |
| rtk.Tachikoma 1.0 | 2.7 | 16.1% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 9 |
| franzor.Lizt 1.3.1 | 4.7 | 11.0% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.1% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.4 | 18 / 35 | 6736 |
| 2 | 1 | 73.1 | 95.2 | 22 / 35 | 6599 |
| 3 | 1 | 72.6 | 94.0 | 20 / 35 | 6613 |
| 4 | 1 | 72.8 | 93.7 | 21 / 35 | 6593 |
| 5 | 1 | 73.1 | 94.3 | 23 / 35 | 6677 |
| 6 | 1 | 72.2 | 91.7 | 18 / 35 | 6716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 84 | 75% |
| rsalesc.melee.Monk 0.3.6c | 47 | 43% |
| franzor.Lizt 1.3.1 | 29 | 66% |
| oog.melee.CapuletDroid 1.1 | 19 | 84% |
| lrem.micro.MoggFanatic 0.2 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 36 | 40% | 107 |
| rsalesc.melee.Monk 0.3.6c | 32 | 36% | 67 |
| franzor.Lizt 1.3.1 | 13 | 14% | 0 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 33 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 195056 melee ticks, 84892 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 34 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 57472 sent, 52766 reached their opponent, 10517 virtual hits (19.9% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 613 over 6 battles (102.2 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.5 | 134 / 210 | 1.95 | 19.5% | 30057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.5% | 134 |
| tm.Yuugao 1.0 | 2.7 | 12.7% | 31 |
| shrub.Vapour v159 | 3.2 | 12.1% | 14 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.8% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.0% | 4 |
| m3thos.Eva00 1.1 | 5.8 | 9.1% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 7.8% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.7% | 1 |
| SHAM.WOW 1.4 | 9.2 | 5.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.0 | 28 / 35 | 4992 |
| 2 | 1 | 67.3 | 82.9 | 20 / 35 | 4705 |
| 3 | 1 | 69.5 | 88.9 | 22 / 35 | 5378 |
| 4 | 1 | 69.3 | 91.4 | 22 / 35 | 5055 |
| 5 | 1 | 68.9 | 89.8 | 20 / 35 | 4914 |
| 6 | 1 | 69.7 | 90.8 | 22 / 35 | 5013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 59 | 68% |
| shrub.Vapour v159 | 40 | 85% |
| Krabb.sliNk.Garm 0.9u | 30 | 70% |
| com.spp.robocode.MostlyHarmless 010 | 20 | 100% |
| m3thos.Eva00 1.1 | 10 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 31 | 38% | 71 |
| Krabb.sliNk.Garm 0.9u | 21 | 26% | 39 |
| shrub.Vapour v159 | 14 | 17% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 7% | 27 |
| m3thos.Eva00 1.1 | 4 | 5% | 14 |
| jwst.DAD.DarkAndDarker 1.1 | 0 | 0% | 14 |
| SHAM.WOW 1.4 | 0 | 0% | 6 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 149669 melee ticks, 42423 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 59 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 48944 sent, 44198 reached their opponent, 7934 virtual hits (18.0% of those reached).

## Melee bench: F09

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 436 over 6 battles (72.7 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 74.4 | 52 / 210 | 3.30 | 15.0% | 21698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 106 |
| hadur117.Hadur 3.19aa | 2.3 | 15.0% | 52 |
| kc.micro.Figment 1.0 | 2.7 | 14.2% | 22 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 4 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.4% | 14 |
| mc2.enemy.Original 0.9 | 6.0 | 8.8% | 7 |
| dft.Calliope 5.6 | 6.8 | 8.2% | 5 |
| step.nanoPri 1.0 | 8.0 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 73.7 | 10 / 35 | 3918 |
| 2 | 3 | 60.0 | 68.9 | 4 / 35 | 3224 |
| 3 | 3 | 62.9 | 74.6 | 7 / 35 | 3592 |
| 4 | 2 | 65.7 | 81.6 | 13 / 35 | 3859 |
| 5 | 2 | 62.6 | 74.6 | 9 / 35 | 3260 |
| 6 | 2 | 63.1 | 73.0 | 9 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 44 | 23% |
| kc.micro.Figment 1.0 | 37 | 73% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| yagami.Tidus 0.11 | 7 | 71% |
| dft.Calliope 5.6 | 7 | 57% |
| mc2.enemy.Original 0.9 | 2 | 50% |

Hadur died in 161 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 65 | 40% | 80 |
| kc.micro.Figment 1.0 | 31 | 19% | 55 |
| yagami.Tidus 0.11 | 19 | 12% | 24 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 14 |
| mc2.enemy.Original 0.9 | 12 | 7% | 16 |
| dft.Calliope 5.6 | 8 | 5% | 11 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 143178 melee ticks, 36073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 50 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 47499 sent, 42847 reached their opponent, 6238 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 601 over 6 battles (100.2 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.4 | 160 / 210 | 1.50 | 20.6% | 35117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.6% | 160 |
| DTF.Kludgy 1.2b | 2.5 | 13.9% | 19 |
| ejb.Polaris 1.0.1 | 3.3 | 12.4% | 16 |
| ne.Chimera 1.2 | 3.5 | 13.0% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 2 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.1% | 2 |
| kurios.DOSexe .9b | 7.2 | 5.6% | 1 |
| sam.Samspin 1.0 | 8.5 | 4.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.1 | 27 / 35 | 5401 |
| 2 | 1 | 71.7 | 95.9 | 27 / 35 | 6197 |
| 3 | 1 | 71.6 | 95.9 | 28 / 35 | 5845 |
| 4 | 1 | 70.8 | 93.0 | 27 / 35 | 5646 |
| 5 | 1 | 71.0 | 93.0 | 23 / 35 | 6051 |
| 6 | 1 | 71.6 | 96.5 | 28 / 35 | 5977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 54 | 81% |
| ejb.Polaris 1.0.1 | 54 | 91% |
| ne.Chimera 1.2 | 33 | 88% |
| vStar.RAFzilla 2.15 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 3 | 67% |
| donjezza.Muncho 1.0 | 3 | 67% |

Hadur died in 54 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 31% | 60 |
| ejb.Polaris 1.0.1 | 12 | 22% | 68 |
| ne.Chimera 1.2 | 9 | 17% | 36 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 10 |
| vStar.RAFzilla 2.15 | 3 | 6% | 17 |
| kurios.DOSexe .9b | 3 | 6% | 11 |
| donjezza.Muncho 1.0 | 1 | 2% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 1 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 150415 melee ticks, 53819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 80 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 48404 sent, 43580 reached their opponent, 8265 virtual hits (19.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 348 over 6 battles (58.0 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 78.5 | 49 / 210 | 2.93 | 15.5% | 22688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.6% | 75 |
| hadur117.Hadur 3.19aa | 1.8 | 15.5% | 49 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 21 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 24 |
| rdt199.Warlord 0.73 | 5.3 | 9.6% | 17 |
| br2.MobyDickBot 1.6 | 5.8 | 9.1% | 12 |
| uji.YellohFellah 1.0 | 7.0 | 8.3% | 11 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 77.5 | 4 / 35 | 3699 |
| 2 | 1 | 64.5 | 81.9 | 10 / 35 | 3820 |
| 3 | 2 | 63.5 | 77.1 | 9 / 35 | 3849 |
| 4 | 2 | 63.4 | 78.7 | 7 / 35 | 3787 |
| 5 | 2 | 64.4 | 80.3 | 10 / 35 | 3834 |
| 6 | 2 | 62.3 | 75.6 | 9 / 35 | 3699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 34% |
| djc.DynaBot 0.1.1 | 22 | 41% |
| cx.mini.Nimrod 0.55 | 11 | 45% |
| uji.YellohFellah 1.0 | 11 | 64% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| rdt199.Warlord 0.73 | 4 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 66 | 40% | 85 |
| djc.DynaBot 0.1.1 | 28 | 17% | 37 |
| cx.mini.Nimrod 0.55 | 28 | 17% | 32 |
| rdt199.Warlord 0.73 | 13 | 8% | 19 |
| uji.YellohFellah 1.0 | 9 | 6% | 14 |
| br2.MobyDickBot 1.6 | 6 | 4% | 11 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 4 |
| stelo.MirrorNano 1.3 | 2 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153524 melee ticks, 33616 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50402 sent, 45445 reached their opponent, 6244 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 359 over 6 battles (59.8 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.8 | 117 / 210 | 2.37 | 17.8% | 24417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.8% | 117 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.3% | 36 |
| nat.PallasHawk 1.0 | 3.2 | 13.1% | 26 |
| darkcanuck.Leon 1.01 | 3.2 | 12.8% | 18 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 11 |
| jrm.Test0 1.0 | 5.8 | 8.5% | 0 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.9% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.5% | 1 |
| stuff.Vlad 0.1 | 8.8 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.5 | 18 / 35 | 4077 |
| 2 | 1 | 67.8 | 86.3 | 20 / 35 | 4211 |
| 3 | 1 | 65.6 | 81.0 | 18 / 35 | 3951 |
| 4 | 1 | 67.7 | 86.7 | 19 / 35 | 4130 |
| 5 | 1 | 65.5 | 82.5 | 17 / 35 | 3608 |
| 6 | 1 | 69.2 | 89.5 | 25 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 43 | 81% |
| bts.wiki.RipCurl 0.9b | 38 | 71% |
| nat.PallasHawk 1.0 | 38 | 71% |
| brainfade.melee.Genghis 0.36 | 13 | 85% |
| jaybot.bots.Oddball 4.0 | 8 | 100% |
| stuff.Vlad 0.1 | 4 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 29% | 50 |
| nat.PallasHawk 1.0 | 24 | 25% | 53 |
| darkcanuck.Leon 1.01 | 16 | 16% | 52 |
| brainfade.melee.Genghis 0.36 | 10 | 10% | 21 |
| jrm.Test0 1.0 | 10 | 10% | 13 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 7 |
| jp.Perpy 16.0 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129992 melee ticks, 39646 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 43 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 44802 sent, 39839 reached their opponent, 6563 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 206 over 6 battles (34.3 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 79.9 | 45 / 210 | 2.81 | 15.4% | 24075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.5% | 91 |
| ags.Glacier 0.2.11 | 1.8 | 16.7% | 39 |
| hadur117.Hadur 3.19aa | 2.5 | 15.4% | 45 |
| shinh.Entangled 0.3 | 4.2 | 12.4% | 27 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.2% | 8 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 76.2 | 2 / 35 | 3639 |
| 2 | 3 | 64.2 | 79.4 | 4 / 35 | 3878 |
| 3 | 3 | 62.7 | 74.9 | 9 / 35 | 3777 |
| 4 | 2 | 66.5 | 83.5 | 10 / 35 | 4678 |
| 5 | 2 | 65.1 | 81.9 | 8 / 35 | 4051 |
| 6 | 2 | 65.5 | 83.5 | 12 / 35 | 4052 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 49 | 59% |
| mn.Combat 3.25.0 | 38 | 16% |
| shinh.Entangled 0.3 | 14 | 36% |
| gh.micro.Gruweltje 0.7 | 7 | 57% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 61 | 37% | 86 |
| mn.Combat 3.25.0 | 53 | 32% | 61 |
| shinh.Entangled 0.3 | 26 | 16% | 31 |
| gh.micro.Gruweltje 0.7 | 14 | 8% | 20 |
| maribo.FollowFire 1 | 4 | 2% | 3 |
| stelo.Wang 1.0 | 3 | 2% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153089 melee ticks, 38564 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 43947 sent, 38876 reached their opponent, 6213 virtual hits (16.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 173 over 6 battles (28.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.6 | 156 / 210 | 1.66 | 20.4% | 34295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.4% | 156 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 23 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.5% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.5% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.3% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.3 | 8.2% | 0 |
| pa.Improved 1.0 | 9.0 | 6.2% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.0 | 26 / 35 | 5710 |
| 2 | 1 | 72.2 | 95.9 | 31 / 35 | 5984 |
| 3 | 1 | 70.6 | 91.1 | 25 / 35 | 5828 |
| 4 | 1 | 71.0 | 93.7 | 24 / 35 | 5779 |
| 5 | 1 | 70.4 | 90.5 | 24 / 35 | 5509 |
| 6 | 1 | 70.5 | 91.7 | 26 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 97% |
| catcat20.shape.Theta 0.018 | 47 | 77% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 86% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| pa.Improved 1.0 | 3 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 21 | 39% | 85 |
| catcat20.shape.Theta 0.018 | 19 | 35% | 59 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 11% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 9 |
| pa.Improved 1.0 | 1 | 2% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 138464 melee ticks, 49684 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 3.

Targeting waves (199 rounds): 43706 sent, 39121 reached their opponent, 9449 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 302 over 6 battles (50.3 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.8 | 100 / 210 | 2.46 | 18.2% | 30304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.2% | 100 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 21 |
| mld.DustBunny 3.8 | 3.3 | 12.6% | 11 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 42 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.3% | 14 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.9% | 19 |
| lambdaxy.TBot 0.1 | 7.0 | 7.2% | 1 |
| Grystrion.TrackerWO 1.0 | 8.2 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.0 | 15 / 35 | 5192 |
| 2 | 1 | 66.7 | 80.0 | 15 / 35 | 4921 |
| 3 | 1 | 67.9 | 83.5 | 16 / 35 | 5344 |
| 4 | 1 | 67.8 | 85.1 | 15 / 35 | 4953 |
| 5 | 1 | 68.1 | 87.0 | 17 / 35 | 4739 |
| 6 | 1 | 68.9 | 87.3 | 22 / 35 | 5155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 52% |
| kawigi.micro.Shiz 1.1 | 30 | 87% |
| kawigi.robot.Girl 1.2 | 18 | 83% |
| mld.DustBunny 3.8 | 17 | 88% |
| cb.nano.Insomnia 1.0 | 11 | 82% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| lambdaxy.TBot 0.1 | 4 | 75% |

Hadur died in 111 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 35% | 76 |
| kawigi.micro.Shiz 1.1 | 19 | 17% | 35 |
| mld.DustBunny 3.8 | 15 | 14% | 38 |
| kawigi.robot.Girl 1.2 | 13 | 12% | 19 |
| cb.nano.Insomnia 1.0 | 11 | 10% | 14 |
| divineomega.TrialBot 0.003 | 5 | 5% | 10 |
| lambdaxy.TBot 0.1 | 4 | 4% | 9 |
| Grystrion.TrackerWO 1.0 | 4 | 4% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 159119 melee ticks, 43254 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 58 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51960 sent, 47193 reached their opponent, 7643 virtual hits (16.2% of those reached).

## Melee bench: F16

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 6 battles (45.3 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.1 | 114 / 210 | 2.07 | 19.2% | 32191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.2% | 114 |
| gh.Griezel 0.5.2 | 2.0 | 15.8% | 51 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.3% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.2% | 1 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 90.2 | 21 / 35 | 5589 |
| 2 | 1 | 68.4 | 85.1 | 17 / 35 | 5122 |
| 3 | 1 | 70.7 | 89.5 | 21 / 35 | 5803 |
| 4 | 1 | 69.9 | 91.1 | 19 / 35 | 5243 |
| 5 | 1 | 68.8 | 87.3 | 18 / 35 | 5251 |
| 6 | 1 | 68.3 | 85.4 | 18 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 78 | 68% |
| techdude.forest.FlamingForest 1.1 | 34 | 68% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 83% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 36 | 37% | 79 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 25% | 49 |
| techdude.forest.FlamingForest 1.1 | 14 | 14% | 38 |
| bvh.fnr.Fenrir 0.36l | 13 | 13% | 17 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 12 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 8 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 168321 melee ticks, 60756 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 41 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 54753 sent, 50070 reached their opponent, 8460 virtual hits (16.9% of those reached).

## Melee bench: F17

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 479 over 6 battles (79.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.0 | 99 / 210 | 2.26 | 19.1% | 34982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.1% | 99 |
| et.Predator 1.8 | 2.5 | 13.5% | 23 |
| cx.BlestPain 1.41 | 3.2 | 12.9% | 44 |
| oog.melee.Mercutio 1.0 | 3.3 | 13.0% | 30 |
| ahf.NanoAndrew .4 | 5.2 | 10.4% | 9 |
| nic.Nicator 2.4 | 6.3 | 8.7% | 4 |
| maribo.melee.BMV 0.1 | 6.5 | 8.4% | 0 |
| tex.Longbot 0.4 | 8.2 | 6.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 82.5 | 15 / 35 | 6038 |
| 2 | 1 | 70.0 | 87.3 | 19 / 35 | 5899 |
| 3 | 1 | 68.2 | 83.5 | 18 / 35 | 5309 |
| 4 | 1 | 68.9 | 84.1 | 15 / 35 | 5809 |
| 5 | 1 | 69.9 | 88.9 | 16 / 35 | 6054 |
| 6 | 1 | 69.8 | 89.8 | 16 / 35 | 5873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 51 | 76% |
| oog.melee.Mercutio 1.0 | 43 | 70% |
| cx.BlestPain 1.41 | 42 | 33% |
| ahf.NanoAndrew .4 | 14 | 71% |
| nic.Nicator 2.4 | 4 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1095. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 38 | 33% | 54 |
| et.Predator 1.8 | 24 | 21% | 56 |
| oog.melee.Mercutio 1.0 | 22 | 19% | 51 |
| ahf.NanoAndrew .4 | 16 | 14% | 26 |
| nic.Nicator 2.4 | 4 | 4% | 11 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| maribo.melee.BMV 0.1 | 2 | 2% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 157682 melee ticks, 65605 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 48 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 52150 sent, 47550 reached their opponent, 10060 virtual hits (21.2% of those reached).

## Melee bench: F18

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 498 over 6 battles (83.0 per battle, most in one battle 163). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.6 | 117 / 210 | 2.12 | 18.8% | 29285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.8% | 117 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.7% | 39 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.4% | 19 |
| uji.DBH 1.1 | 3.8 | 11.2% | 13 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.6% | 5 |
| sigterm.Sigterm 1.0 | 5.8 | 9.0% | 9 |
| ratosh.Nobo 0.21 | 7.0 | 7.8% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.5% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.3% | 1 |
| stelo.WangRobot 1.0 | 9.5 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.8 | 21 / 35 | 4647 |
| 2 | 1 | 65.2 | 78.7 | 13 / 35 | 4465 |
| 3 | 1 | 68.5 | 87.6 | 22 / 35 | 4898 |
| 4 | 1 | 67.1 | 86.0 | 15 / 35 | 4629 |
| 5 | 1 | 70.6 | 92.1 | 26 / 35 | 5456 |
| 6 | 1 | 69.7 | 91.1 | 20 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 64% |
| agd.Mooserwirt2 2.7 | 31 | 84% |
| uji.DBH 1.1 | 24 | 75% |
| sigterm.Sigterm 1.0 | 15 | 87% |
| spinnercat.Robovirus 2.718 | 9 | 67% |
| ratosh.Nobo 0.21 | 6 | 100% |
| stelo.WangRobot 1.0 | 6 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 34% | 74 |
| agd.Mooserwirt2 2.7 | 18 | 19% | 46 |
| uji.DBH 1.1 | 12 | 13% | 28 |
| sigterm.Sigterm 1.0 | 10 | 11% | 21 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 6% | 11 |
| ratosh.Nobo 0.21 | 5 | 5% | 10 |
| stelo.WangRobot 1.0 | 3 | 3% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 141457 melee ticks, 46644 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46738 sent, 41809 reached their opponent, 8804 virtual hits (21.1% of those reached).

## Melee bench: F19

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 97.0 | 188 / 210 | 1.27 | 22.2% | 37237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 22.2% | 188 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.2% | 13 |
| mld.Infinity 2.2 | 3.3 | 11.6% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 11.6% | 2 |
| erdnis.Rover 0.3 | 5.2 | 10.4% | 0 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 0 |
| pbg.R2D2 1.0 | 8.3 | 6.0% | 1 |
| pac.ABC 2.1 | 8.3 | 6.4% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 97.1 | 30 / 35 | 5836 |
| 2 | 1 | 73.1 | 97.8 | 33 / 35 | 5776 |
| 3 | 1 | 73.5 | 96.2 | 32 / 35 | 6401 |
| 4 | 1 | 73.1 | 95.9 | 31 / 35 | 6333 |
| 5 | 1 | 73.1 | 97.1 | 30 / 35 | 6523 |
| 6 | 1 | 73.6 | 98.1 | 32 / 35 | 6368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 115 | 95% |
| krillr.mini.JointStrike 2.0.0 | 22 | 95% |
| mld.Infinity 2.2 | 21 | 90% |
| erdnis.Rover 0.3 | 17 | 100% |
| pac.ABC 2.1 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 23 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 11 | 48% | 91 |
| krillr.mini.JointStrike 2.0.0 | 4 | 17% | 34 |
| mld.Infinity 2.2 | 2 | 9% | 19 |
| patson.PatsonTestBot 1.0 | 2 | 9% | 16 |
| erdnis.Rover 0.3 | 1 | 4% | 17 |
| pbg.R2D2 1.0 | 1 | 4% | 14 |
| mbh.Mbh 0.1 | 1 | 4% | 11 |
| pac.ABC 2.1 | 1 | 4% | 6 |

Posture (Hadur's M records, 200 rounds): 127869 melee ticks, 45984 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 40 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 42675 sent, 38137 reached their opponent, 9012 virtual hits (23.6% of those reached).

## Melee bench: F20

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 741 over 6 battles (123.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.7 | 153 / 210 | 1.57 | 21.4% | 37392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 21.4% | 153 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 27 |
| fwb.Nine 1.0.1 | 3.7 | 11.2% | 11 |
| catcat20.Rabbit 0.001 | 3.8 | 11.1% | 19 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.4% | 0 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.6% | 0 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.3% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 5.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.3 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 93.7 | 28 / 35 | 6224 |
| 2 | 1 | 71.1 | 91.4 | 21 / 35 | 6171 |
| 3 | 1 | 73.2 | 96.5 | 28 / 35 | 6948 |
| 4 | 1 | 72.6 | 96.8 | 28 / 35 | 6309 |
| 5 | 1 | 71.3 | 93.3 | 24 / 35 | 5739 |
| 6 | 1 | 70.9 | 90.2 | 24 / 35 | 6001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 89% |
| fwb.Nine 1.0.1 | 42 | 95% |
| catcat20.Rabbit 0.001 | 36 | 69% |
| nz.jdc.nano.GridFu 1.0 | 8 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 25 | 40% | 103 |
| catcat20.Rabbit 0.001 | 14 | 22% | 42 |
| fwb.Nine 1.0.1 | 12 | 19% | 30 |
| nz.jdc.nano.GridFu 1.0 | 3 | 5% | 19 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 2 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 1 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164136 melee ticks, 56797 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 26 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 52059 sent, 47205 reached their opponent, 10656 virtual hits (22.6% of those reached).

## Melee bench: F21

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 694 over 6 battles (115.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.3 | 120 / 210 | 1.88 | 19.8% | 33738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.8% | 120 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 64 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 12 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.6% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.2 | 5.7% | 0 |
| el.JumpShoot 0.2 | 8.5 | 5.9% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.0 | 24 / 35 | 5431 |
| 2 | 1 | 71.3 | 92.4 | 22 / 35 | 6072 |
| 3 | 1 | 69.8 | 89.2 | 20 / 35 | 5523 |
| 4 | 1 | 69.2 | 85.7 | 16 / 35 | 5421 |
| 5 | 1 | 70.5 | 88.9 | 21 / 35 | 5791 |
| 6 | 1 | 69.9 | 91.4 | 17 / 35 | 5500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 117 | 68% |
| dummy.mini.Scimitar 1.01 | 22 | 86% |
| cf.RiO.RiOx 4.2.1 | 16 | 88% |
| eld.Hmm 1.0 | 11 | 36% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1248. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 45% | 105 |
| dummy.mini.Scimitar 1.01 | 20 | 20% | 53 |
| eld.Hmm 1.0 | 12 | 12% | 19 |
| cf.RiO.RiOx 4.2.1 | 9 | 9% | 22 |
| PSW.Relentless 0.1 | 3 | 3% | 2 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 182973 melee ticks, 78852 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 42 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 53636 sent, 48868 reached their opponent, 8581 virtual hits (17.6% of those reached).

## Melee bench: F22

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 536 over 6 battles (89.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.3 | 88 / 210 | 2.23 | 18.0% | 29310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.2 | 18.0% | 88 |
| pe.SandboxDT 2.71m | 1.8 | 16.8% | 74 |
| kvk.HebusLeTroll 0.35 | 3.3 | 14.4% | 26 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.1% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 11.1% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 7.1% | 2 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.5% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.2 | 14 / 35 | 4700 |
| 2 | 2 | 67.4 | 82.5 | 11 / 35 | 4982 |
| 3 | 1 | 68.8 | 88.9 | 14 / 35 | 4933 |
| 4 | 1 | 69.8 | 91.4 | 20 / 35 | 4873 |
| 5 | 1 | 69.5 | 89.2 | 19 / 35 | 5126 |
| 6 | 1 | 66.8 | 82.5 | 10 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 58 | 43% |
| kvk.HebusLeTroll 0.35 | 40 | 63% |
| jlm.javaDisturbance 0.59 | 37 | 81% |
| bigpete.Stewie 1.0 | 6 | 83% |
| yk.JahRoslav 1.1 | 3 | 33% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 64 | 50% | 93 |
| kvk.HebusLeTroll 0.35 | 26 | 20% | 42 |
| jlm.javaDisturbance 0.59 | 20 | 16% | 50 |
| bigpete.Stewie 1.0 | 9 | 7% | 17 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 161769 melee ticks, 48757 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51410 sent, 46640 reached their opponent, 7270 virtual hits (15.6% of those reached).

## Melee bench: F23

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 509 over 6 battles (84.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 94.2 | 164 / 210 | 1.52 | 21.3% | 35602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 21.3% | 164 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 32 |
| cre.Karolos 0.32 | 3.0 | 14.5% | 6 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 9.8% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.2% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.8% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 1 |
| sample.Walls 1.0 | 7.7 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 97.5 | 31 / 35 | 6125 |
| 2 | 1 | 72.5 | 92.4 | 27 / 35 | 5880 |
| 3 | 1 | 72.4 | 94.3 | 28 / 35 | 5662 |
| 4 | 1 | 72.9 | 94.6 | 28 / 35 | 6184 |
| 5 | 1 | 72.4 | 93.0 | 24 / 35 | 5979 |
| 6 | 1 | 72.1 | 93.7 | 26 / 35 | 5772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 87 | 92% |
| cre.Karolos 0.32 | 58 | 97% |
| stelo.RamTrackSurfer 1.2 | 10 | 80% |
| stelo.AreaTargetingBot 1.1 | 10 | 90% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 2 | 50% |

Hadur died in 49 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 20 | 41% | 94 |
| cre.Karolos 0.32 | 13 | 27% | 61 |
| stelo.RamTrackSurfer 1.2 | 5 | 10% | 23 |
| stelo.AreaTargetingBot 1.1 | 5 | 10% | 15 |
| cw.megas.Blade 0.8 | 2 | 4% | 6 |
| sample.Walls 1.0 | 1 | 2% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 128706 melee ticks, 46716 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 63 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 39783 sent, 34979 reached their opponent, 10105 virtual hits (28.9% of those reached).

## Melee bench: F24

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 656 over 6 battles (109.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.5 | 56 / 210 | 2.85 | 15.8% | 23408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.2 | 15.8% | 56 |
| florent.XSeries.X2 0.12 | 3.2 | 12.9% | 37 |
| davidalves.Phoenix 0.54 | 3.2 | 13.6% | 48 |
| rz.GlowBlowMelee 1.4 | 3.3 | 13.7% | 39 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.2% | 13 |
| oog.melee.Corsair 1.0 | 6.0 | 9.7% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 6.4% | 9 |
| lunchie.Lunchbox 0.93 | 8.5 | 5.7% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.2% | 1 |
| evd.X1 0.01 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 79.0 | 7 / 35 | 3700 |
| 2 | 1 | 64.2 | 76.5 | 14 / 35 | 3963 |
| 3 | 1 | 63.6 | 77.5 | 6 / 35 | 3810 |
| 4 | 1 | 66.3 | 83.8 | 13 / 35 | 4361 |
| 5 | 2 | 64.1 | 79.7 | 8 / 35 | 3832 |
| 6 | 1 | 63.8 | 80.3 | 8 / 35 | 3742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 47% |
| davidalves.Phoenix 0.54 | 34 | 35% |
| florent.XSeries.X2 0.12 | 22 | 41% |
| pedersen.Ugluk 1.1.1 | 14 | 71% |
| oog.melee.Corsair 1.0 | 9 | 67% |
| stelo.SoJNanoMelee 1.1 | 2 | 50% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 41 | 25% | 50 |
| rz.GlowBlowMelee 1.4 | 39 | 24% | 55 |
| davidalves.Phoenix 0.54 | 34 | 21% | 43 |
| pedersen.Ugluk 1.1.1 | 24 | 15% | 31 |
| oog.melee.Corsair 1.0 | 9 | 6% | 20 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 140361 melee ticks, 33729 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 46153 sent, 41186 reached their opponent, 7333 virtual hits (17.8% of those reached).

## Melee bench: F25

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 733 over 6 battles (122.2 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.6 | 114 / 210 | 2.48 | 17.5% | 22959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.5% | 114 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.4% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.0% | 16 |
| jdw.Hurricane 1.4 | 4.2 | 11.7% | 26 |
| ds.Oo 2.2 | 5.3 | 9.7% | 11 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.6% | 10 |
| awesomeness.Elite 1.0 | 7.3 | 7.4% | 4 |
| adt.Ar2 1.1 | 7.8 | 6.8% | 2 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.3% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.3 | 18 / 35 | 3859 |
| 2 | 1 | 67.0 | 82.9 | 20 / 35 | 4137 |
| 3 | 1 | 67.5 | 87.6 | 21 / 35 | 3752 |
| 4 | 1 | 67.2 | 87.6 | 20 / 35 | 3727 |
| 5 | 1 | 66.0 | 84.1 | 18 / 35 | 3659 |
| 6 | 1 | 65.0 | 78.1 | 17 / 35 | 3825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 84% |
| voidious.micro.BlitzBat 1.05 | 30 | 90% |
| jdw.Hurricane 1.4 | 21 | 67% |
| ds.Oo 2.2 | 14 | 86% |
| gre.svman4.Morfeas 1.4.1 | 12 | 58% |
| adt.Ar2 1.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 60% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 654. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 27 | 26% | 59 |
| voidious.mini.BrokenSword 2.0.3 | 21 | 20% | 40 |
| jdw.Hurricane 1.4 | 14 | 14% | 33 |
| gre.svman4.Morfeas 1.4.1 | 10 | 10% | 17 |
| ds.Oo 2.2 | 7 | 7% | 23 |
| awesomeness.Elite 1.0 | 7 | 7% | 15 |
| adt.Ar2 1.1 | 6 | 6% | 9 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 128416 melee ticks, 25879 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 379 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 153 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 44351 sent, 39493 reached their opponent, 6654 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 264 over 6 battles (44.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.3 | 142 / 210 | 1.79 | 20.3% | 36604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.3% | 142 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 32 |
| lrem.Spectre 0.4.4 | 3.5 | 12.4% | 19 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 12 |
| js.PinBall 1.6 | 4.8 | 10.7% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.2% | 4 |
| gh.mini.GrubbmOne 1.0 | 7.2 | 8.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.6% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 91.7 | 26 / 35 | 6597 |
| 2 | 1 | 70.4 | 90.2 | 18 / 35 | 5823 |
| 3 | 1 | 71.5 | 92.7 | 29 / 35 | 5890 |
| 4 | 1 | 71.9 | 91.7 | 27 / 35 | 6449 |
| 5 | 1 | 70.4 | 89.5 | 18 / 35 | 6045 |
| 6 | 1 | 71.0 | 91.7 | 24 / 35 | 5800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 72% |
| lrem.Spectre 0.4.4 | 43 | 81% |
| shu.nitro.LENIN .T34 | 34 | 94% |
| js.PinBall 1.6 | 16 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 26 | 37% | 71 |
| shu.nitro.LENIN .T34 | 19 | 27% | 51 |
| lrem.Spectre 0.4.4 | 15 | 21% | 42 |
| js.PinBall 1.6 | 4 | 6% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 6% | 15 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 5 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 160714 melee ticks, 45406 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 24 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 52030 sent, 47070 reached their opponent, 11379 virtual hits (24.2% of those reached).

## Melee bench: F27

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 771 over 6 battles (128.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 80.1 | 139 / 210 | 2.79 | 18.5% | 31727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.3 | 18.5% | 139 |
| mk.Alpha 0.2.1 | 2.0 | 13.8% | 45 |
| EH.Eagle 1.0.6 | 3.2 | 11.1% | 3 |
| wee.Gem 1.8.4 | 5.7 | 9.2% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.5% | 9 |
| throxbot.ThroxBot 0.1 | 6.2 | 8.7% | 2 |
| joe.ADinosaur 1.0 | 6.3 | 8.4% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.1% | 4 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.0% | 0 |
| cs.Grudge 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.6 | 26 / 35 | 5493 |
| 2 | 1 | 70.6 | 93.7 | 28 / 35 | 5421 |
| 3 | 1 | 70.8 | 92.1 | 26 / 35 | 5620 |
| 4 | 2 | 57.4 | 47.0 | 13 / 35 | 4849 |
| 5 | 1 | 72.2 | 97.8 | 32 / 35 | 5626 |
| 6 | 2 | 60.0 | 55.6 | 14 / 35 | 4718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 77 | 83% |
| EH.Eagle 1.0.6 | 27 | 96% |
| throxbot.ThroxBot 0.1 | 16 | 88% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 100% |
| wee.Gem 1.8.4 | 11 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 550. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cs.Grudge 1.0 | 21 | 27% | 23 |
| mk.Alpha 0.2.1 | 18 | 23% | 67 |
| joe.ADinosaur 1.0 | 8 | 10% | 14 |
| throxbot.ThroxBot 0.1 | 6 | 8% | 15 |
| EH.Eagle 1.0.6 | 5 | 6% | 35 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 5% | 18 |
| wee.Gem 1.8.4 | 3 | 4% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 14 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 118371 melee ticks, 35146 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 39852 sent, 35233 reached their opponent, 8539 virtual hits (24.2% of those reached).

## Melee bench: F28

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 570 over 6 battles (95.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.3 | 130 / 210 | 2.06 | 18.4% | 24721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.4% | 130 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 33 |
| uji.Antique 1.0 | 3.7 | 12.1% | 20 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.8% | 7 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.6% | 2 |
| matt.advanced.Katana 1.0 | 8.3 | 6.5% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.4% | 2 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 91.4 | 20 / 35 | 4055 |
| 2 | 1 | 69.2 | 90.5 | 24 / 35 | 4625 |
| 3 | 1 | 67.2 | 86.7 | 20 / 35 | 4072 |
| 4 | 1 | 66.1 | 84.1 | 20 / 35 | 3767 |
| 5 | 1 | 68.5 | 90.5 | 23 / 35 | 4077 |
| 6 | 1 | 67.7 | 86.3 | 23 / 35 | 4125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 66 | 82% |
| uji.Antique 1.0 | 48 | 88% |
| qohnil.blot.BlotBot 3.61 | 17 | 71% |
| pfvicm.Sobieski 7.2.3b | 13 | 92% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| amk.ChumbaWumba 0.3 | 3 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 23 | 26% | 49 |
| pfvicm.Sobieski 7.2.3b | 22 | 25% | 36 |
| uji.Antique 1.0 | 18 | 21% | 67 |
| qohnil.blot.BlotBot 3.61 | 7 | 8% | 29 |
| amk.ChumbaWumba 0.3 | 7 | 8% | 12 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 7 |
| stelo.PianistNano 1.2 | 2 | 2% | 2 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 129839 melee ticks, 36792 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 50 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 44115 sent, 39301 reached their opponent, 5795 virtual hits (14.7% of those reached).

## Melee bench: F29

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 477 over 6 battles (79.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.2 | 102 / 210 | 2.15 | 18.9% | 28777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.9% | 102 |
| deewiant.Anomaly 0.2 | 2.2 | 15.4% | 46 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 15.0% | 51 |
| myl.micro.Troodon 1.10 | 4.3 | 11.3% | 6 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| ap.Frederick 1.1 | 8.8 | 4.9% | 0 |
| jangs.ns51 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.1 | 15 / 35 | 5091 |
| 2 | 1 | 68.5 | 84.4 | 18 / 35 | 4603 |
| 3 | 1 | 69.6 | 87.3 | 19 / 35 | 5039 |
| 4 | 1 | 69.7 | 88.9 | 16 / 35 | 5036 |
| 5 | 1 | 68.7 | 87.9 | 17 / 35 | 4553 |
| 6 | 1 | 69.4 | 89.5 | 17 / 35 | 4455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 68 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 52% |
| jok.PheonixM 0.1.2 | 17 | 88% |
| myl.micro.Troodon 1.10 | 14 | 86% |
| ph.melee.ArcherME 0.3 | 4 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 35% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 39 | 35% | 65 |
| myl.micro.Troodon 1.10 | 18 | 16% | 27 |
| jok.PheonixM 0.1.2 | 9 | 8% | 21 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 169991 melee ticks, 54645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 1160 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 184 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 54262 sent, 49410 reached their opponent, 7635 virtual hits (15.5% of those reached).

## Melee bench: F30

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 803 over 6 battles (133.8 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.9 | 37 / 210 | 3.53 | 14.3% | 22491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.7 | 14.1% | 59 |
| hadur117.Hadur 3.19aa | 2.2 | 14.3% | 37 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 43 |
| oog.melee.Capulet 1.2 | 3.8 | 12.7% | 31 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.4% | 14 |
| intruder.PrairieWolf 2.61 | 6.8 | 8.5% | 10 |
| tripphippy.Alice 1.1 | 7.2 | 7.8% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.4% | 10 |
| ntc.Opposite 1.5 | 8.2 | 6.9% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 71.1 | 7 / 35 | 3936 |
| 2 | 2 | 61.2 | 72.7 | 5 / 35 | 3654 |
| 3 | 1 | 62.1 | 73.7 | 5 / 35 | 3804 |
| 4 | 5 | 59.2 | 66.3 | 3 / 35 | 3573 |
| 5 | 2 | 62.3 | 73.0 | 9 / 35 | 3692 |
| 6 | 1 | 62.7 | 74.3 | 8 / 35 | 3832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 23 | 30% |
| darkcanuck.B26354 1.06 | 21 | 57% |
| oog.melee.Capulet 1.2 | 15 | 27% |
| stelo.PastFuture 2.3.2 | 13 | 62% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 179 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 39 | 22% | 46 |
| catcat20.Matcha 0.006 | 38 | 21% | 43 |
| darkcanuck.B26354 1.06 | 33 | 18% | 44 |
| oog.melee.Capulet 1.2 | 29 | 16% | 34 |
| tripphippy.Alice 1.1 | 12 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 4% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 4% | 10 |
| ntc.Opposite 1.5 | 4 | 2% | 6 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152705 melee ticks, 21402 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49847 sent, 44935 reached their opponent, 7607 virtual hits (16.9% of those reached).

## Melee bench: F31

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 496 over 6 battles (82.7 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.1 | 43 / 210 | 3.24 | 14.9% | 21933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 101 |
| hadur117.Hadur 3.19aa | 2.0 | 14.9% | 43 |
| gh.mini.Griezel 0.2 | 3.0 | 13.8% | 48 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.6% | 7 |
| spinnercat.micro.Tyger 0.1 | 5.0 | 10.5% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.6% | 0 |
| fm.mammillarias 1.3 | 8.8 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.9 | 71.1 | 4 / 35 | 3454 |
| 2 | 2 | 62.8 | 73.0 | 8 / 35 | 3763 |
| 3 | 2 | 65.2 | 82.2 | 10 / 35 | 3894 |
| 4 | 2 | 64.8 | 76.8 | 9 / 35 | 4228 |
| 5 | 2 | 62.7 | 76.2 | 7 / 35 | 3402 |
| 6 | 2 | 61.0 | 71.4 | 5 / 35 | 3192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 39% |
| gh.mini.Griezel 0.2 | 28 | 46% |
| d414.nano.Quantum 1.0.0 | 10 | 60% |
| spinnercat.micro.Tyger 0.1 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 39% | 82 |
| gh.mini.Griezel 0.2 | 42 | 25% | 57 |
| spinnercat.micro.Tyger 0.1 | 19 | 11% | 23 |
| d414.nano.Quantum 1.0.0 | 17 | 10% | 20 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 13 |
| timmit.nano.TimDog 0.33 | 7 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 151030 melee ticks, 28573 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 74 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48856 sent, 43918 reached their opponent, 7211 virtual hits (16.4% of those reached).

## Melee bench: F32

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 303 over 6 battles (50.5 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 91.9 | 127 / 210 | 1.73 | 19.1% | 28197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.1% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.3% | 45 |
| apc.botM 3.0 | 3.0 | 12.2% | 19 |
| vjik.UnViolation 1.1 | 4.7 | 9.5% | 6 |
| lxx.ConceptA 0.8 | 5.2 | 9.4% | 3 |
| bayen.UbaMicro 1.4 | 5.7 | 8.9% | 3 |
| panzer.Panzer 0.2 | 7.2 | 7.6% | 1 |
| yk.JahMicro 1.0 | 8.0 | 7.1% | 3 |
| conscience.Electron 1.3g | 8.5 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.2 | 21 / 35 | 5020 |
| 2 | 1 | 70.1 | 96.2 | 25 / 35 | 4924 |
| 3 | 1 | 68.9 | 93.3 | 22 / 35 | 4516 |
| 4 | 1 | 68.3 | 90.5 | 21 / 35 | 4806 |
| 5 | 1 | 68.6 | 92.4 | 20 / 35 | 4502 |
| 6 | 1 | 67.4 | 88.9 | 18 / 35 | 4429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 61% |
| apc.botM 3.0 | 38 | 76% |
| vjik.UnViolation 1.1 | 17 | 88% |
| lxx.ConceptA 0.8 | 12 | 83% |
| yk.JahMicro 1.0 | 9 | 67% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| donjezza.Jezza 1.0 | 8 | 75% |
| panzer.Panzer 0.2 | 3 | 67% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 39 | 46% | 85 |
| lxx.ConceptA 0.8 | 18 | 21% | 28 |
| apc.botM 3.0 | 14 | 16% | 43 |
| vjik.UnViolation 1.1 | 4 | 5% | 24 |
| bayen.UbaMicro 1.4 | 3 | 4% | 14 |
| yk.JahMicro 1.0 | 2 | 2% | 6 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| conscience.Electron 1.3g | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 129772 melee ticks, 54961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 43354 sent, 38475 reached their opponent, 6823 virtual hits (17.7% of those reached).

## Melee bench: F33

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 299 over 6 battles (49.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.0 | 107 / 210 | 2.44 | 18.1% | 28034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.1% | 107 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.5% | 22 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.2% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 9.2% | 4 |
| baal.nano.N 1.42 | 6.8 | 8.4% | 0 |
| zyx.micro.Ant 1.1 | 8.3 | 5.6% | 0 |
| sanja.First 0.1 | 8.7 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.2 | 16 / 35 | 4574 |
| 2 | 1 | 67.2 | 81.9 | 18 / 35 | 4670 |
| 3 | 1 | 66.4 | 81.6 | 13 / 35 | 4434 |
| 4 | 1 | 70.6 | 91.7 | 23 / 35 | 4955 |
| 5 | 1 | 68.7 | 86.0 | 19 / 35 | 4737 |
| 6 | 1 | 67.1 | 80.3 | 18 / 35 | 4664 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 62 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 87% |
| gre.svman4.Leonidas 1.3.2 | 20 | 70% |
| labg.Cataclysm 2.05 | 14 | 71% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 42 | 40% | 89 |
| gre.svman4.Leonidas 1.3.2 | 21 | 20% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 13% | 40 |
| labg.Cataclysm 2.05 | 11 | 10% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 11 |
| zyx.micro.Ant 1.1 | 4 | 4% | 6 |
| sanja.First 0.1 | 3 | 3% | 3 |
| baal.nano.N 1.42 | 2 | 2% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 165783 melee ticks, 41917 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 53312 sent, 48538 reached their opponent, 7313 virtual hits (15.1% of those reached).

## Melee bench: F34

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 469 over 6 battles (78.2 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.0 | 79 / 210 | 2.17 | 18.1% | 31007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.1% | 79 |
| stelo.Spread 0.9 | 2.5 | 16.0% | 57 |
| kid.Gladiator .7.2 | 2.5 | 16.3% | 51 |
| tcf.Reach 3 | 4.5 | 10.9% | 2 |
| jcs.Seth 1.8 | 4.5 | 11.2% | 18 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 11 / 35 | 4886 |
| 2 | 1 | 70.0 | 89.2 | 18 / 35 | 5464 |
| 3 | 1 | 67.8 | 86.0 | 10 / 35 | 4858 |
| 4 | 1 | 68.2 | 85.4 | 11 / 35 | 5350 |
| 5 | 1 | 69.6 | 90.2 | 15 / 35 | 5214 |
| 6 | 1 | 68.4 | 85.7 | 14 / 35 | 5235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 64 | 52% |
| stelo.Spread 0.9 | 60 | 53% |
| jcs.Seth 1.8 | 17 | 35% |
| tcf.Reach 3 | 4 | 100% |
| cli.Dancer 1.1 | 2 | 50% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 48 | 35% | 80 |
| stelo.Spread 0.9 | 45 | 33% | 72 |
| jcs.Seth 1.8 | 19 | 14% | 28 |
| tcf.Reach 3 | 10 | 7% | 15 |
| ratosh.Wesco 1.4 | 4 | 3% | 7 |
| cli.Dancer 1.1 | 3 | 2% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 168288 melee ticks, 52734 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 34 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 51922 sent, 47158 reached their opponent, 8038 virtual hits (17.0% of those reached).

## Melee bench: F35

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 677 over 6 battles (112.8 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.7 | 25 / 210 | 3.01 | 15.0% | 22615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 154 |
| hadur117.Hadur 3.19aa | 2.0 | 15.0% | 25 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.0% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.2% | 9 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 5 |
| wit.Chuliath 1.0 | 6.5 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.3% | 0 |
| stelo.MyAgileRobot 0.2 | 8.0 | 5.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.5 | 5.3% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 76.5 | 3 / 35 | 3683 |
| 2 | 2 | 62.9 | 75.9 | 4 / 35 | 3862 |
| 3 | 2 | 64.5 | 78.7 | 8 / 35 | 3859 |
| 4 | 2 | 62.2 | 74.6 | 4 / 35 | 3510 |
| 5 | 2 | 64.8 | 81.3 | 3 / 35 | 3882 |
| 6 | 2 | 63.8 | 79.0 | 3 / 35 | 3819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 73 | 16% |
| gh.mini.Gruwel 0.9 | 13 | 31% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 193 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 100 | 52% | 113 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 14% | 35 |
| gh.mini.Gruwel 0.9 | 26 | 13% | 28 |
| rz.HawkOnFire 0.1 | 20 | 10% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 10 | 5% | 10 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 150150 melee ticks, 39006 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 39 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 46363 sent, 41386 reached their opponent, 6458 virtual hits (15.6% of those reached).

## Melee bench: F36

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 341 over 6 battles (56.8 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.4 | 151 / 210 | 1.78 | 20.5% | 32930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.5% | 151 |
| alpha.RainingFire 1.0 | 2.5 | 12.7% | 19 |
| bzdp.Pansy 2.1 | 2.5 | 12.8% | 19 |
| mz.Cork 0.1 | 4.5 | 10.8% | 5 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 11 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 5 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.3% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 5.1% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.2 | 23 / 35 | 5135 |
| 2 | 1 | 71.8 | 93.7 | 26 / 35 | 5940 |
| 3 | 1 | 71.6 | 93.3 | 28 / 35 | 5793 |
| 4 | 1 | 71.2 | 94.0 | 25 / 35 | 5533 |
| 5 | 1 | 69.8 | 87.0 | 24 / 35 | 5372 |
| 6 | 1 | 70.4 | 91.1 | 25 / 35 | 5157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 84% |
| alpha.RainingFire 1.0 | 38 | 79% |
| mz.Cork 0.1 | 31 | 100% |
| bvh.micro.Freya 0.3 | 24 | 83% |
| bvh.mini.Fenrir 0.39 | 12 | 100% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 27% | 43 |
| bzdp.Pansy 2.1 | 14 | 22% | 46 |
| bvh.micro.Freya 0.3 | 10 | 16% | 25 |
| m3thos.Eva02 0.7.1 | 6 | 10% | 23 |
| bvh.mini.Fenrir 0.39 | 6 | 10% | 18 |
| mz.Cork 0.1 | 5 | 8% | 36 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 148573 melee ticks, 44634 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 51 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 50114 sent, 45553 reached their opponent, 9667 virtual hits (21.2% of those reached).

## Melee bench: F37

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 284 over 6 battles (47.3 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.0 | 137 / 210 | 2.44 | 18.4% | 33696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 18.4% | 137 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 11.3% | 10 |
| agrach.Dalek 1.0 | 4.0 | 9.9% | 18 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 4 |
| germ.TheMind .2 | 5.2 | 9.5% | 9 |
| lmk.ACPFinal 0.1 | 6.7 | 8.6% | 10 |
| mn.nano.perceptual.Impact 1.3.0 | 6.7 | 8.5% | 2 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.7% | 10 |
| mb.Beast 0.1 | 8.3 | 8.0% | 6 |
| skm.Ryubot 1.0 | 9.0 | 7.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.8 | 23 / 35 | 5224 |
| 2 | 1 | 65.8 | 80.6 | 19 / 35 | 5468 |
| 3 | 1 | 66.6 | 81.0 | 21 / 35 | 5680 |
| 4 | 1 | 67.3 | 84.4 | 24 / 35 | 5663 |
| 5 | 1 | 69.2 | 91.7 | 27 / 35 | 5733 |
| 6 | 1 | 67.4 | 82.2 | 23 / 35 | 5928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 26 | 100% |
| germ.TheMind .2 | 22 | 95% |
| mb.Beast 0.1 | 20 | 90% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 95% |
| stelo.UntouchableNano 1.3 | 18 | 89% |
| lmk.ACPFinal 0.1 | 16 | 88% |
| skm.Ryubot 1.0 | 13 | 85% |
| EBBU.Sim2 1.02 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 20 | 26% | 31 |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 16% | 35 |
| agrach.Dalek 1.0 | 10 | 13% | 42 |
| lmk.ACPFinal 0.1 | 10 | 13% | 25 |
| stelo.UntouchableNano 1.3 | 10 | 13% | 22 |
| germ.TheMind .2 | 4 | 5% | 20 |
| EBBU.Sim2 1.02 | 3 | 4% | 15 |
| mb.Beast 0.1 | 3 | 4% | 11 |
| skm.Ryubot 1.0 | 2 | 3% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 97024 melee ticks, 25849 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 32444 sent, 27921 reached their opponent, 8147 virtual hits (29.2% of those reached).

## Melee bench: F38

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 256 over 6 battles (42.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.8 | 108 / 210 | 2.10 | 18.4% | 28547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.2 | 18.4% | 108 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 67 |
| bvh.mini.Freya 0.55 | 3.0 | 12.7% | 12 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.1% | 13 |
| cs.Wren 1.0 | 5.2 | 10.4% | 1 |
| kdf.KoulDestroyer 1.0 | 5.7 | 9.4% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 7.9% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.3% | 0 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.5% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 21 / 35 | 5009 |
| 2 | 1 | 68.2 | 86.7 | 18 / 35 | 4633 |
| 3 | 2 | 65.9 | 83.2 | 10 / 35 | 4415 |
| 4 | 1 | 69.1 | 88.6 | 21 / 35 | 4985 |
| 5 | 1 | 68.9 | 90.8 | 20 / 35 | 4672 |
| 6 | 1 | 68.1 | 87.0 | 18 / 35 | 4833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 72 | 61% |
| bts.mega.Gnarly 1.4 | 34 | 65% |
| bvh.mini.Freya 0.55 | 21 | 86% |
| cs.Wren 1.0 | 15 | 93% |
| kdf.KoulDestroyer 1.0 | 9 | 56% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 38 | 37% | 80 |
| bts.mega.Gnarly 1.4 | 23 | 22% | 42 |
| bvh.mini.Freya 0.55 | 20 | 19% | 39 |
| kdf.KoulDestroyer 1.0 | 12 | 12% | 17 |
| cs.Wren 1.0 | 7 | 7% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 138794 melee ticks, 40308 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 38 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 44944 sent, 39934 reached their opponent, 8454 virtual hits (21.2% of those reached).

## Melee bench: F39

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 452 over 6 battles (75.3 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.7 | 89 / 210 | 2.47 | 17.5% | 29430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.5% | 89 |
| bvh.fry.Freya 0.82 | 2.2 | 15.2% | 27 |
| az.Ololobot 0.2.4 | 3.2 | 13.3% | 60 |
| catcat20.Lambda 0.024 | 3.7 | 11.4% | 26 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.5% | 0 |
| gimp.GimpBot 0.1 | 6.7 | 7.8% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.0 | 7.5% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.0% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.6 | 13 / 35 | 4685 |
| 2 | 1 | 66.7 | 82.2 | 15 / 35 | 5020 |
| 3 | 1 | 66.7 | 83.5 | 16 / 35 | 4709 |
| 4 | 1 | 65.5 | 83.5 | 15 / 35 | 4585 |
| 5 | 1 | 68.6 | 87.3 | 21 / 35 | 5300 |
| 6 | 1 | 66.5 | 83.8 | 9 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 54 | 43% |
| bvh.fry.Freya 0.82 | 51 | 84% |
| catcat20.Lambda 0.024 | 19 | 58% |
| stelo.SoRobotNanoMelee 1.2 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 41 | 33% | 66 |
| bvh.fry.Freya 0.82 | 36 | 29% | 71 |
| catcat20.Lambda 0.024 | 26 | 21% | 37 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 12 |
| stelo.SoRobotNanoMelee 1.2 | 5 | 4% | 8 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 2 |
| gimp.GimpBot 0.1 | 1 | 1% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 162518 melee ticks, 45100 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 62 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 4.

Targeting waves (202 rounds): 50863 sent, 46225 reached their opponent, 8212 virtual hits (17.8% of those reached).

## Melee bench: F40

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 685 over 6 battles (114.2 per battle, most in one battle 155). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.9 | 131 / 210 | 2.00 | 19.5% | 30911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.5% | 131 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 35 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.2% | 14 |
| mz.AntiGrav 1.0 | 4.3 | 11.4% | 10 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.6% | 10 |
| alpha.BlackIce 1.0 | 5.8 | 9.3% | 2 |
| stelo.Randomness 1.0 | 6.7 | 8.8% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 2 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.0% | 0 |
| sample.Corners 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.0 | 22 / 35 | 5490 |
| 2 | 1 | 70.7 | 91.7 | 23 / 35 | 5473 |
| 3 | 1 | 69.5 | 86.7 | 23 / 35 | 5145 |
| 4 | 1 | 69.7 | 89.8 | 20 / 35 | 5111 |
| 5 | 1 | 68.8 | 87.3 | 20 / 35 | 4757 |
| 6 | 1 | 68.7 | 85.1 | 23 / 35 | 4935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 63 | 83% |
| kano.gamma.KanoGamma 1.8 | 33 | 82% |
| mz.AntiGrav 1.0 | 26 | 92% |
| Polkwane.SmashMelee 1.0 | 18 | 83% |
| stelo.Randomness 1.0 | 8 | 75% |
| alpha.BlackIce 1.0 | 5 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 0% |

Hadur died in 84 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 30 | 36% | 65 |
| kano.gamma.KanoGamma 1.8 | 16 | 19% | 51 |
| mz.AntiGrav 1.0 | 11 | 13% | 31 |
| Polkwane.SmashMelee 1.0 | 9 | 11% | 22 |
| alpha.BlackIce 1.0 | 6 | 7% | 14 |
| stelo.Randomness 1.0 | 4 | 5% | 17 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 8 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
| sample.Corners 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 148139 melee ticks, 42169 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 50 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 48844 sent, 43898 reached their opponent, 9089 virtual hits (20.7% of those reached).

## Melee bench: F41

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 456 over 6 battles (76.0 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.4 | 93 / 210 | 2.49 | 17.4% | 25915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 17.4% | 93 |
| eem.EvBotNG v12.8 | 2.5 | 14.8% | 75 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.8% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.3% | 14 |
| shrub.Silver v048 | 6.0 | 9.0% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 1 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.1 | 19 / 35 | 4621 |
| 2 | 1 | 65.3 | 77.8 | 11 / 35 | 4164 |
| 3 | 1 | 67.0 | 83.8 | 15 / 35 | 4421 |
| 4 | 1 | 68.3 | 89.5 | 16 / 35 | 4219 |
| 5 | 1 | 66.7 | 84.1 | 16 / 35 | 4128 |
| 6 | 1 | 66.5 | 80.3 | 16 / 35 | 4362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 57 | 46% |
| lessonz.robocode.Oz 0.5.0 | 33 | 91% |
| ary.Swarm 1.1 | 20 | 85% |
| simonton.nano.MeleeSeed 1.8 | 13 | 92% |
| shrub.Silver v048 | 4 | 100% |
| stelo.Mirror 1.1 | 4 | 75% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 819. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 45 | 38% | 68 |
| ary.Swarm 1.1 | 22 | 18% | 41 |
| lessonz.robocode.Oz 0.5.0 | 18 | 15% | 42 |
| simonton.nano.MeleeSeed 1.8 | 18 | 15% | 30 |
| zyx.nano.Ant 1.1 | 4 | 3% | 6 |
| stelo.Mirror 1.1 | 4 | 3% | 5 |
| jsal.Jsalbot 1.0 | 4 | 3% | 5 |
| shrub.Silver v048 | 1 | 1% | 11 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 146453 melee ticks, 34383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 49 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 2.

Targeting waves (201 rounds): 48367 sent, 43658 reached their opponent, 6981 virtual hits (16.0% of those reached).

## Melee bench: F42

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 253 over 6 battles (42.2 per battle, most in one battle 109). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.6 | 135 / 210 | 1.75 | 20.1% | 34820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.1% | 135 |
| wompi.Wallaby 5.1 | 2.0 | 15.9% | 39 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.6% | 15 |
| ara.Shera 0.88 | 3.8 | 12.3% | 16 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 1 |
| dsw.StaticD 1.0 | 6.5 | 6.8% | 3 |
| maribo.IotaCT 1.1 | 7.3 | 6.2% | 1 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.2 | 25 / 35 | 5738 |
| 2 | 1 | 70.0 | 91.7 | 21 / 35 | 5579 |
| 3 | 1 | 70.2 | 89.8 | 20 / 35 | 5849 |
| 4 | 1 | 70.9 | 92.4 | 25 / 35 | 5808 |
| 5 | 1 | 70.5 | 90.2 | 21 / 35 | 5943 |
| 6 | 1 | 70.6 | 90.5 | 23 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 98 | 84% |
| maribo.mini.MiniQuester 0.1 | 33 | 88% |
| ara.Shera 0.88 | 19 | 74% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| maribo.IotaCT 1.1 | 2 | 50% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 51% | 115 |
| maribo.mini.MiniQuester 0.1 | 17 | 22% | 44 |
| ara.Shera 0.88 | 15 | 20% | 37 |
| amz.NanoClone 1.41 | 3 | 4% | 5 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 205 rounds): 165515 melee ticks, 50762 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 52396 sent, 47648 reached their opponent, 9234 virtual hits (19.4% of those reached).

## Melee bench: F43

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 6 battles (54.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.7 | 28 / 210 | 2.92 | 15.4% | 23695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 143 |
| hadur117.Hadur 3.19aa | 2.0 | 15.4% | 28 |
| brainfade.melee.Dusk 0.44 | 3.8 | 12.3% | 23 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 6 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.8% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 80.6 | 7 / 35 | 4165 |
| 2 | 2 | 66.2 | 81.0 | 4 / 35 | 4269 |
| 3 | 2 | 64.2 | 76.8 | 3 / 35 | 3713 |
| 4 | 2 | 65.1 | 78.1 | 4 / 35 | 3909 |
| 5 | 2 | 64.3 | 77.5 | 5 / 35 | 3604 |
| 6 | 2 | 65.5 | 78.1 | 5 / 35 | 4035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 76 | 20% |
| brainfade.melee.Dusk 0.44 | 16 | 31% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 86% |
| dummy.micro.Sparrow 2.5 | 4 | 25% |
| Krabb.akim2.Akim2 1.1b | 3 | 33% |

Hadur died in 184 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 107 | 58% | 122 |
| brainfade.melee.Dusk 0.44 | 25 | 14% | 30 |
| dummy.micro.Sparrow 2.5 | 25 | 14% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 15 |
| mz.NanoGod 2.02 | 5 | 3% | 7 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149842 melee ticks, 45554 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 48286 sent, 43347 reached their opponent, 7319 virtual hits (16.9% of those reached).

## Melee bench: F44

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 545 over 6 battles (90.8 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.3 | 141 / 210 | 1.69 | 20.9% | 35594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 20.9% | 141 |
| stelo.Liblix 0.3.1 | 2.0 | 15.0% | 41 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.7% | 18 |
| jwirde.Gort 2.0 | 4.5 | 9.4% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.6% | 2 |
| wompi.Quokka 1.6 | 6.8 | 7.2% | 2 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 3 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 5.2% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.1 | 23 / 35 | 5668 |
| 2 | 1 | 70.9 | 91.1 | 25 / 35 | 5728 |
| 3 | 1 | 68.9 | 86.7 | 19 / 35 | 5240 |
| 4 | 1 | 72.9 | 96.2 | 25 / 35 | 6457 |
| 5 | 1 | 71.5 | 93.0 | 22 / 35 | 6262 |
| 6 | 1 | 72.6 | 94.9 | 27 / 35 | 6239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 68% |
| tzu.TheArtOfWar 1.2 | 65 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 83% |
| disan.Chair 2.2.0 | 7 | 86% |
| jwirde.Gort 2.0 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 1 | 0% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 49% | 106 |
| tzu.TheArtOfWar 1.2 | 20 | 27% | 59 |
| jwirde.Gort 2.0 | 4 | 5% | 15 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 11 |
| disan.Chair 2.2.0 | 2 | 3% | 6 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 5 |
| wompi.Quokka 1.6 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 150119 melee ticks, 49929 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 51 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51784 sent, 47160 reached their opponent, 9916 virtual hits (21.0% of those reached).

## Melee bench: F45

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 459 over 6 battles (76.5 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.4 | 89 / 210 | 2.22 | 19.2% | 32970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19aa | 1.0 | 19.2% | 89 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.3% | 88 |
| jje.BagPuss 1.2 | 2.8 | 12.1% | 10 |
| myl.nano.Graviton 1.10 | 4.7 | 10.4% | 8 |
| sul.Lunar 1.1 | 4.8 | 10.5% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.7% | 2 |
| fm.claire 1.7 | 6.8 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.5% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.0 | 13 / 35 | 5645 |
| 2 | 1 | 69.8 | 88.3 | 16 / 35 | 5852 |
| 3 | 1 | 68.4 | 87.6 | 12 / 35 | 5135 |
| 4 | 1 | 68.0 | 83.2 | 14 / 35 | 5308 |
| 5 | 1 | 67.4 | 82.2 | 13 / 35 | 5412 |
| 6 | 1 | 70.2 | 90.2 | 21 / 35 | 5618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 41% |
| jje.BagPuss 1.2 | 18 | 72% |
| sul.Lunar 1.1 | 14 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 12 | 92% |
| myl.nano.Graviton 1.10 | 12 | 75% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 2 | 50% |

Hadur died in 124 of 210 rounds, at a mean tick of 1564. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 41% | 0 |
| jje.BagPuss 1.2 | 23 | 19% | 63 |
| myl.nano.Graviton 1.10 | 15 | 12% | 38 |
| sul.Lunar 1.1 | 12 | 10% | 44 |
| fm.claire 1.7 | 8 | 6% | 16 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 24 |
| wit.Deep7 2.0 | 2 | 2% | 13 |
| hvilela.HVilela 0.9 | 2 | 2% | 10 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 205847 melee ticks, 95084 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 61857 sent, 57253 reached their opponent, 8735 virtual hits (15.3% of those reached).

## Melee bench: F46

hadur117.Hadur 3.19aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 386 over 6 battles (64.3 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.8 | 62 / 210 | 2.55 | 16.5% | 25418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.0% | 60 |
| hadur117.Hadur 3.19aa | 2.3 | 16.5% | 62 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.3% | 71 |
| mz.MicroSheep 1.0 | 4.3 | 10.4% | 3 |
| cx.Princess 1.0 | 4.8 | 9.8% | 11 |
| sadoner.killer 0.2 | 6.0 | 9.1% | 3 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.6% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 84.8 | 8 / 35 | 3978 |
| 2 | 3 | 65.2 | 81.6 | 8 / 35 | 4119 |
| 3 | 3 | 65.4 | 80.3 | 8 / 35 | 4311 |
| 4 | 2 | 66.7 | 82.9 | 14 / 35 | 4335 |
| 5 | 2 | 66.3 | 81.9 | 12 / 35 | 4436 |
| 6 | 2 | 66.5 | 85.4 | 12 / 35 | 4239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 64% |
| rsalesc.melee.Medina 0.4.5 | 34 | 26% |
| cx.Princess 1.0 | 10 | 40% |
| mz.MicroSheep 1.0 | 5 | 80% |
| sadoner.killer 0.2 | 2 | 50% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 42% | 103 |
| rsalesc.melee.Medina 0.4.5 | 46 | 30% | 59 |
| sadoner.killer 0.2 | 12 | 8% | 12 |
| cx.Princess 1.0 | 10 | 7% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 8 |
| mz.MicroSheep 1.0 | 5 | 3% | 10 |
| kurios.DOSexe .9a | 2 | 1% | 3 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 152187 melee ticks, 39988 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 44987 sent, 40096 reached their opponent, 6050 virtual hits (15.1% of those reached).

