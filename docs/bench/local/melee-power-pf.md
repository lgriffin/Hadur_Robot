# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 124 over 6 battles (20.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.4 | 54 / 210 | 2.22 | 17.3% | 30289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 141 |
| hadur2.Hadur 3.17.1pf | 2.0 | 17.3% | 54 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 11 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.7% | 1 |
| lorneswork.Predator 1.0 | 5.0 | 9.8% | 1 |
| mz.MicroGodMelee 1 | 5.8 | 9.6% | 1 |
| adt.Ar2 1.0 | 7.0 | 8.0% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 83.8 | 10 / 35 | 4951 |
| 2 | 2 | 66.9 | 84.1 | 6 / 35 | 5227 |
| 3 | 2 | 68.4 | 88.9 | 10 / 35 | 5500 |
| 4 | 2 | 67.7 | 89.5 | 8 / 35 | 5275 |
| 5 | 2 | 68.0 | 88.3 | 11 / 35 | 4896 |
| 6 | 2 | 66.0 | 83.8 | 9 / 35 | 4440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 9% |
| sgp.JollyNinja 3.53 | 18 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 93% |
| mz.MicroGodMelee 1 | 9 | 89% |
| lorneswork.Predator 1.0 | 7 | 86% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 0% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 76% | 135 |
| sgp.JollyNinja 3.53 | 14 | 9% | 28 |
| lorneswork.Predator 1.0 | 11 | 7% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 15 |
| mz.MicroGodMelee 1 | 3 | 2% | 10 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |
| adt.Ar2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 199 rounds): 138787 melee ticks, 78701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 56 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 1.

Targeting waves (199 rounds): 44317 sent, 39685 reached their opponent, 8025 virtual hits (20.2% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.3 | 92 / 210 | 2.59 | 17.4% | 27618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.2 | 17.4% | 92 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.4% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.0% | 33 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.9% | 16 |
| Noran.BitchingElk 0.054 | 6.8 | 8.0% | 13 |
| sch.Simone 0.3d | 7.0 | 7.7% | 5 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.6% | 1 |
| stelo.PatternRobot 1.0 | 9.0 | 5.5% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.0 | 13 / 35 | 4761 |
| 2 | 1 | 69.2 | 89.2 | 22 / 35 | 4698 |
| 3 | 2 | 65.8 | 78.4 | 13 / 35 | 4528 |
| 4 | 1 | 65.8 | 79.7 | 15 / 35 | 4362 |
| 5 | 1 | 66.4 | 82.9 | 13 / 35 | 4771 |
| 6 | 1 | 66.5 | 82.9 | 16 / 35 | 4498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 59% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 56% |
| Noran.BitchingElk 0.054 | 16 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| sch.Simone 0.3d | 5 | 60% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 35% | 71 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 20% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 13% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 13% | 19 |
| Noran.BitchingElk 0.054 | 10 | 8% | 17 |
| sch.Simone 0.3d | 6 | 5% | 8 |
| stelo.PatternRobot 1.0 | 6 | 5% | 7 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 4 |

Posture (Hadur's M records, 200 rounds): 163557 melee ticks, 39376 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 32 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 58324 sent, 53680 reached their opponent, 9045 virtual hits (16.8% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 106 over 6 battles (17.7 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.4 | 158 / 210 | 1.69 | 20.4% | 37219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.4% | 158 |
| radnor.DoctorBob 1.42 | 2.5 | 13.8% | 22 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.2% | 11 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 18 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.1% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.0 | 27 / 35 | 5962 |
| 2 | 1 | 67.8 | 83.5 | 24 / 35 | 5444 |
| 3 | 1 | 71.8 | 94.6 | 28 / 35 | 6674 |
| 4 | 1 | 70.9 | 93.0 | 25 / 35 | 6460 |
| 5 | 1 | 72.1 | 96.2 | 28 / 35 | 6803 |
| 6 | 1 | 70.1 | 93.0 | 26 / 35 | 5876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 55 | 87% |
| radnor.DoctorBob 1.42 | 53 | 98% |
| kawigi.nano.Lib 1.0 | 48 | 94% |
| oa.weak.FlyMk1 0.1 | 9 | 89% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 40% | 68 |
| vuen.Cake 2.51 | 9 | 17% | 53 |
| kawigi.nano.Lib 1.0 | 8 | 15% | 56 |
| urdos.URDOS 1.3 | 5 | 9% | 9 |
| oa.weak.FlyMk1 0.1 | 3 | 6% | 12 |
| adt.Ar1 2.1 | 3 | 6% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 125826 melee ticks, 37733 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 92 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 92 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 38274 sent, 33883 reached their opponent, 8767 virtual hits (25.9% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 294 over 6 battles (49.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.7 | 27 / 210 | 2.47 | 16.8% | 31178 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 167 |
| hadur2.Hadur 3.17.1pf | 2.0 | 16.8% | 27 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 11.1% | 9 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.3 | 87.0 | 7 / 35 | 5414 |
| 2 | 2 | 66.8 | 82.5 | 5 / 35 | 5068 |
| 3 | 2 | 66.7 | 81.9 | 3 / 35 | 5159 |
| 4 | 2 | 67.3 | 83.2 | 4 / 35 | 5457 |
| 5 | 2 | 66.9 | 81.0 | 4 / 35 | 5254 |
| 6 | 2 | 67.2 | 86.3 | 4 / 35 | 4826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 107 | 8% |
| apc.LeeroyJenkins2 1.0 | 16 | 88% |
| TNT.TNT 0.99.1 | 9 | 33% |
| spin.Bugstard 0.012b | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 1239. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 67% | 133 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 36 |
| TNT.TNT 0.99.1 | 20 | 11% | 23 |
| josago.Jorgito 0.16 | 11 | 6% | 11 |
| tj.zombie1n 1.0.1 | 3 | 2% | 4 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 197472 melee ticks, 57088 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 64 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 60119 sent, 55267 reached their opponent, 8068 virtual hits (14.6% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 413 over 6 battles (68.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.2 | 15 / 210 | 3.23 | 14.1% | 21838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.0% | 105 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 67 |
| hadur2.Hadur 3.17.1pf | 3.0 | 14.1% | 15 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 12 |
| ms.Ares 0.19 | 5.5 | 9.7% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.5% | 9 |
| supersample.SuperBoxBot 1.0 | 7.5 | 5.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.9 | 81.0 | 1 / 35 | 3962 |
| 2 | 3 | 61.5 | 72.4 | 1 / 35 | 3667 |
| 3 | 3 | 61.5 | 72.7 | 3 / 35 | 3354 |
| 4 | 3 | 64.2 | 78.4 | 5 / 35 | 4073 |
| 5 | 3 | 61.0 | 70.5 | 3 / 35 | 3508 |
| 6 | 3 | 62.2 | 76.2 | 2 / 35 | 3274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 32 | 13% |
| cb.fire.Firestarter 2.0f | 31 | 6% |
| wompi.Numbat 2.1 | 12 | 67% |
| ms.Ares 0.19 | 2 | 50% |
| axeBots.HataMoto 3.09 | 2 | 0% |

Hadur died in 198 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 67 | 34% | 71 |
| cb.fire.Firestarter 2.0f | 66 | 33% | 69 |
| wompi.Numbat 2.1 | 36 | 18% | 41 |
| axeBots.HataMoto 3.09 | 14 | 7% | 14 |
| ms.Ares 0.19 | 7 | 4% | 10 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 155766 melee ticks, 26856 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 71 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 71 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 48750 sent, 43695 reached their opponent, 7175 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 116 over 6 battles (19.3 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.7 | 123 / 210 | 1.92 | 19.2% | 30236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 19.2% | 123 |
| jekl.StoneGhost 0.7 | 2.2 | 14.6% | 25 |
| origin.SleepSiphon 1.7b | 2.8 | 13.6% | 39 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.1% | 16 |
| mld.Wisdom 1.0 | 4.8 | 10.8% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.9% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.6% | 1 |
| spinnercat.Omen 1.0 | 8.0 | 6.0% | 0 |
| DBall.NUKE 0.1 | 8.7 | 5.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.3 | 20 / 35 | 4991 |
| 2 | 1 | 68.0 | 85.7 | 18 / 35 | 4836 |
| 3 | 1 | 70.1 | 92.4 | 23 / 35 | 4908 |
| 4 | 1 | 69.3 | 90.5 | 18 / 35 | 5206 |
| 5 | 1 | 69.9 | 90.5 | 22 / 35 | 5112 |
| 6 | 1 | 70.0 | 91.1 | 22 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 61 | 64% |
| jekl.StoneGhost 0.7 | 53 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 74% |
| gg.Wolverine 2.0 | 13 | 77% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| mld.Wisdom 1.0 | 5 | 80% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 34 | 39% | 76 |
| jekl.StoneGhost 0.7 | 26 | 30% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 18% | 33 |
| gg.Wolverine 2.0 | 6 | 7% | 9 |
| mld.Wisdom 1.0 | 4 | 5% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 12 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 148687 melee ticks, 46962 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 45920 sent, 41369 reached their opponent, 9305 virtual hits (22.5% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 86 over 6 battles (14.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 93.1 | 111 / 210 | 1.62 | 20.7% | 38891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.7% | 111 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.8% | 41 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 36 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.5% | 8 |
| franzor.Lizt 1.3.1 | 4.7 | 10.8% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.4% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 94.3 | 22 / 35 | 6166 |
| 2 | 1 | 72.3 | 91.4 | 17 / 35 | 6666 |
| 3 | 1 | 72.0 | 92.1 | 17 / 35 | 6495 |
| 4 | 1 | 72.5 | 93.3 | 20 / 35 | 6688 |
| 5 | 1 | 72.6 | 94.6 | 19 / 35 | 6578 |
| 6 | 1 | 72.1 | 92.7 | 16 / 35 | 6298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 83 | 65% |
| rsalesc.melee.Monk 0.3.6c | 48 | 25% |
| franzor.Lizt 1.3.1 | 32 | 69% |
| oog.melee.CapuletDroid 1.1 | 26 | 85% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1457. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 40 | 40% | 93 |
| rsalesc.melee.Monk 0.3.6c | 40 | 40% | 71 |
| franzor.Lizt 1.3.1 | 10 | 10% | 2 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 37 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 188697 melee ticks, 90505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 47 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 55626 sent, 51145 reached their opponent, 10239 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 267 over 6 battles (44.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.5 | 118 / 210 | 2.03 | 18.8% | 28622 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.8% | 118 |
| tm.Yuugao 1.0 | 2.3 | 13.1% | 32 |
| shrub.Vapour v159 | 3.0 | 12.5% | 24 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 10.8% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.7% | 8 |
| m3thos.Eva00 1.1 | 5.7 | 9.1% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.4% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.8% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.9 | 20 / 35 | 4520 |
| 2 | 1 | 69.1 | 89.8 | 24 / 35 | 4951 |
| 3 | 1 | 68.8 | 91.4 | 19 / 35 | 4818 |
| 4 | 1 | 66.8 | 84.4 | 17 / 35 | 4451 |
| 5 | 1 | 67.3 | 87.3 | 16 / 35 | 4730 |
| 6 | 1 | 68.9 | 89.2 | 22 / 35 | 5152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 71% |
| Krabb.sliNk.Garm 0.9u | 30 | 83% |
| shrub.Vapour v159 | 28 | 54% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 80% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 83% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 24% | 57 |
| shrub.Vapour v159 | 21 | 23% | 43 |
| Krabb.sliNk.Garm 0.9u | 20 | 22% | 42 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 15% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 9% | 16 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 7 |
| m3thos.Eva00 1.1 | 2 | 2% | 14 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 151350 melee ticks, 35738 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 62 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49781 sent, 44925 reached their opponent, 8438 virtual hits (18.8% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.8 | 46 / 210 | 3.36 | 14.5% | 20002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.2% | 94 |
| hadur2.Hadur 3.17.1pf | 2.5 | 14.5% | 46 |
| kc.micro.Figment 1.0 | 2.5 | 13.8% | 28 |
| yagami.Tidus 0.11 | 4.5 | 10.9% | 6 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.5% | 18 |
| mc2.enemy.Original 0.9 | 6.0 | 9.5% | 13 |
| dft.Calliope 5.6 | 6.7 | 8.1% | 5 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.1 | 71.4 | 5 / 35 | 3314 |
| 2 | 2 | 62.4 | 75.9 | 8 / 35 | 3238 |
| 3 | 1 | 64.9 | 81.9 | 12 / 35 | 3677 |
| 4 | 3 | 61.5 | 72.1 | 8 / 35 | 3309 |
| 5 | 3 | 62.6 | 75.9 | 7 / 35 | 3369 |
| 6 | 4 | 59.4 | 65.7 | 6 / 35 | 3095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 29% |
| kc.micro.Figment 1.0 | 29 | 62% |
| pedersen.Grishnakh 1.0 | 7 | 29% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| dft.Calliope 5.6 | 6 | 50% |
| yagami.Tidus 0.11 | 6 | 83% |
| rdm.Dueler 0.4x | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 40% | 84 |
| kc.micro.Figment 1.0 | 31 | 19% | 49 |
| mc2.enemy.Original 0.9 | 18 | 11% | 20 |
| yagami.Tidus 0.11 | 16 | 10% | 21 |
| pedersen.Grishnakh 1.0 | 16 | 10% | 17 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| dft.Calliope 5.6 | 4 | 2% | 6 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |

Posture (Hadur's M records, 199 rounds): 138571 melee ticks, 34457 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 34 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 46209 sent, 41668 reached their opponent, 6085 virtual hits (14.6% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 237 over 6 battles (39.5 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.2 | 154 / 210 | 1.61 | 20.0% | 32879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.0% | 154 |
| DTF.Kludgy 1.2b | 2.5 | 14.0% | 24 |
| ejb.Polaris 1.0.1 | 3.2 | 13.2% | 14 |
| ne.Chimera 1.2 | 3.3 | 12.9% | 8 |
| vStar.RAFzilla 2.15 | 5.3 | 10.3% | 5 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.6% | 4 |
| kurios.DOSexe .9b | 7.7 | 5.7% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 22 / 35 | 4981 |
| 2 | 1 | 70.0 | 91.7 | 25 / 35 | 5320 |
| 3 | 1 | 69.7 | 92.7 | 23 / 35 | 5094 |
| 4 | 1 | 71.2 | 94.6 | 27 / 35 | 5674 |
| 5 | 1 | 72.3 | 96.5 | 30 / 35 | 6206 |
| 6 | 1 | 70.5 | 93.0 | 27 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 55 | 87% |
| DTF.Kludgy 1.2b | 48 | 77% |
| ne.Chimera 1.2 | 36 | 92% |
| vStar.RAFzilla 2.15 | 15 | 87% |
| tvv.micro.Antares 1.1.1 | 13 | 85% |
| kurios.DOSexe .9b | 9 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 32% | 52 |
| ejb.Polaris 1.0.1 | 14 | 25% | 65 |
| ne.Chimera 1.2 | 12 | 21% | 40 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 16 |
| vStar.RAFzilla 2.15 | 3 | 5% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 4 |
| sam.Samspin 1.0 | 2 | 4% | 3 |
| kurios.DOSexe .9b | 1 | 2% | 13 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 143885 melee ticks, 52031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 46507 sent, 41963 reached their opponent, 7579 virtual hits (18.1% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 77.3 | 61 / 210 | 3.04 | 15.4% | 21903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.9% | 78 |
| hadur2.Hadur 3.17.1pf | 1.8 | 15.4% | 61 |
| cx.mini.Nimrod 0.55 | 3.5 | 12.5% | 23 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 7 |
| rdt199.Warlord 0.73 | 5.0 | 9.8% | 22 |
| br2.MobyDickBot 1.6 | 6.0 | 9.3% | 9 |
| uji.YellohFellah 1.0 | 6.7 | 8.4% | 9 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 78.4 | 12 / 35 | 4049 |
| 2 | 2 | 63.8 | 81.3 | 8 / 35 | 3521 |
| 3 | 2 | 62.1 | 75.9 | 8 / 35 | 3342 |
| 4 | 2 | 63.1 | 74.9 | 13 / 35 | 3675 |
| 5 | 1 | 64.3 | 79.0 | 11 / 35 | 3861 |
| 6 | 2 | 61.8 | 74.3 | 9 / 35 | 3455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 39 | 56% |
| cx.mini.Nimrod 0.55 | 20 | 50% |
| djc.DynaBot 0.1.1 | 14 | 86% |
| uji.YellohFellah 1.0 | 14 | 86% |
| rdt199.Warlord 0.73 | 12 | 17% |
| br2.MobyDickBot 1.6 | 6 | 33% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 65 | 44% | 88 |
| cx.mini.Nimrod 0.55 | 26 | 17% | 35 |
| rdt199.Warlord 0.73 | 20 | 13% | 23 |
| uji.YellohFellah 1.0 | 10 | 7% | 20 |
| djc.DynaBot 0.1.1 | 8 | 5% | 19 |
| br2.MobyDickBot 1.6 | 8 | 5% | 12 |
| KiraNL.Chupacabra 0.4 | 6 | 4% | 7 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |

Posture (Hadur's M records, 201 rounds): 149136 melee ticks, 28260 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 38 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 48752 sent, 44080 reached their opponent, 6057 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 471 over 6 battles (78.5 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.9 | 106 / 210 | 2.45 | 17.3% | 22874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 17.3% | 106 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.3% | 38 |
| nat.PallasHawk 1.0 | 3.2 | 13.7% | 31 |
| darkcanuck.Leon 1.01 | 3.5 | 12.7% | 27 |
| brainfade.melee.Genghis 0.36 | 5.3 | 9.2% | 5 |
| jrm.Test0 1.0 | 5.7 | 8.4% | 0 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.8% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.5% | 0 |
| stuff.Vlad 0.1 | 8.8 | 5.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 77.8 | 15 / 35 | 3471 |
| 2 | 1 | 67.4 | 86.0 | 20 / 35 | 4164 |
| 3 | 1 | 66.0 | 83.2 | 14 / 35 | 3729 |
| 4 | 1 | 66.9 | 84.8 | 19 / 35 | 4004 |
| 5 | 1 | 67.0 | 88.3 | 19 / 35 | 3615 |
| 6 | 1 | 66.5 | 83.5 | 19 / 35 | 3891 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 42 | 69% |
| nat.PallasHawk 1.0 | 40 | 70% |
| darkcanuck.Leon 1.01 | 35 | 89% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jaybot.bots.Oddball 4.0 | 5 | 60% |
| jrm.Test0 1.0 | 3 | 100% |
| stuff.Vlad 0.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 31 | 29% | 56 |
| darkcanuck.Leon 1.01 | 22 | 21% | 53 |
| nat.PallasHawk 1.0 | 21 | 20% | 50 |
| brainfade.melee.Genghis 0.36 | 9 | 8% | 18 |
| jrm.Test0 1.0 | 7 | 7% | 10 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 9 |
| jaybot.bots.Oddball 4.0 | 6 | 6% | 6 |
| jp.Perpy 16.0 | 2 | 2% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 131329 melee ticks, 32920 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 44892 sent, 40052 reached their opponent, 6758 virtual hits (16.9% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 6 battles (18.0 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.2 | 44 / 210 | 2.88 | 15.1% | 23142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.1% | 54 |
| mn.Combat 3.25.0 | 2.2 | 15.6% | 73 |
| hadur2.Hadur 3.17.1pf | 2.5 | 15.1% | 44 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.7% | 14 |
| shinh.Entangled 0.3 | 4.5 | 12.1% | 25 |
| apc.Colossus2 0.17 | 6.0 | 8.2% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 79.0 | 7 / 35 | 3853 |
| 2 | 3 | 64.2 | 80.3 | 7 / 35 | 3850 |
| 3 | 3 | 63.8 | 78.7 | 8 / 35 | 3981 |
| 4 | 2 | 63.8 | 78.7 | 9 / 35 | 3801 |
| 5 | 1 | 65.5 | 85.4 | 7 / 35 | 4080 |
| 6 | 3 | 61.6 | 72.7 | 6 / 35 | 3577 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 47 | 62% |
| mn.Combat 3.25.0 | 25 | 0% |
| shinh.Entangled 0.3 | 17 | 47% |
| gh.micro.Gruweltje 0.7 | 10 | 40% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 59 | 36% | 88 |
| mn.Combat 3.25.0 | 55 | 33% | 58 |
| shinh.Entangled 0.3 | 22 | 13% | 29 |
| gh.micro.Gruweltje 0.7 | 16 | 10% | 19 |
| maribo.FollowFire 1 | 5 | 3% | 5 |
| stelo.Wang 1.0 | 4 | 2% | 6 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 146554 melee ticks, 31031 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 111 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 111 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 42913 sent, 37932 reached their opponent, 5981 virtual hits (15.8% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 177 over 6 battles (29.5 per battle, most in one battle 36). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.1 | 157 / 210 | 1.53 | 20.7% | 34324 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.7% | 157 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 21 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.8% | 25 |
| Lo_Ian.Gandalf_V4 4.0 | 4.7 | 9.9% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.6% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.1% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.7% | 4 |
| pa.Improved 1.0 | 9.0 | 6.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 28 / 35 | 6048 |
| 2 | 1 | 71.6 | 96.2 | 28 / 35 | 5605 |
| 3 | 1 | 71.9 | 95.6 | 29 / 35 | 5983 |
| 4 | 1 | 71.2 | 93.3 | 26 / 35 | 5773 |
| 5 | 1 | 70.2 | 92.4 | 24 / 35 | 5233 |
| 6 | 1 | 70.5 | 92.7 | 22 / 35 | 5682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 89% |
| catcat20.shape.Theta 0.018 | 45 | 71% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 69% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 45% | 96 |
| catcat20.shape.Theta 0.018 | 18 | 34% | 42 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 13% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 27 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 4 |
| pa.Improved 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 200 rounds): 140759 melee ticks, 48894 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 56 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 44901 sent, 40462 reached their opponent, 9941 virtual hits (24.6% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 231 over 6 battles (38.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.1 | 86 / 210 | 2.79 | 17.0% | 27473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 17.0% | 86 |
| emp.Yngwie 1.11 | 2.7 | 13.8% | 61 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.9% | 24 |
| mld.DustBunny 3.8 | 3.5 | 12.8% | 14 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.7% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.6% | 18 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.1% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.3 | 4.5% | 0 |
| divineomega.TrialBot 0.003 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 77.5 | 15 / 35 | 4614 |
| 2 | 1 | 67.4 | 81.6 | 17 / 35 | 5074 |
| 3 | 1 | 65.6 | 79.7 | 14 / 35 | 4256 |
| 4 | 1 | 66.9 | 82.5 | 15 / 35 | 4484 |
| 5 | 1 | 65.7 | 79.4 | 13 / 35 | 4420 |
| 6 | 1 | 65.7 | 80.0 | 12 / 35 | 4625 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 51 | 57% |
| kawigi.micro.Shiz 1.1 | 32 | 84% |
| mld.DustBunny 3.8 | 14 | 93% |
| kawigi.robot.Girl 1.2 | 12 | 67% |
| cb.nano.Insomnia 1.0 | 6 | 67% |
| divineomega.TrialBot 0.003 | 5 | 80% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 48 | 38% | 85 |
| mld.DustBunny 3.8 | 21 | 17% | 38 |
| kawigi.micro.Shiz 1.1 | 20 | 16% | 34 |
| cb.nano.Insomnia 1.0 | 15 | 12% | 17 |
| kawigi.robot.Girl 1.2 | 9 | 7% | 14 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 7 |
| divineomega.TrialBot 0.003 | 4 | 3% | 11 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 159971 melee ticks, 40532 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 52899 sent, 48169 reached their opponent, 7872 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.0 | 84 / 210 | 2.53 | 18.0% | 31277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.0% | 84 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 61 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.1% | 42 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 5 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.8% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.8% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 4.9% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.9 | 13 / 35 | 5324 |
| 2 | 1 | 67.2 | 82.5 | 15 / 35 | 4882 |
| 3 | 1 | 69.6 | 87.0 | 18 / 35 | 5520 |
| 4 | 1 | 67.9 | 82.5 | 13 / 35 | 5400 |
| 5 | 1 | 67.3 | 82.2 | 11 / 35 | 5170 |
| 6 | 1 | 66.8 | 81.9 | 14 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 80 | 55% |
| techdude.forest.FlamingForest 1.1 | 24 | 46% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 90% |
| bvh.fnr.Fenrir 0.36l | 7 | 57% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 4 | 25% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 1129. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 50 | 40% | 94 |
| techdude.forest.FlamingForest 1.1 | 23 | 18% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 13% | 29 |
| bvh.fnr.Fenrir 0.36l | 13 | 10% | 16 |
| stelo.IntrinsicVolatility 1.4 | 11 | 9% | 14 |
| asd.Cthulhu 1.3 | 6 | 5% | 6 |
| tvv.nano.Polaris 1.2 | 4 | 3% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 202 rounds): 172819 melee ticks, 62979 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 39 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 56095 sent, 51480 reached their opponent, 8485 virtual hits (16.5% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.8 | 96 / 210 | 2.37 | 18.5% | 32887 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.5% | 96 |
| et.Predator 1.8 | 2.8 | 13.3% | 24 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.4% | 40 |
| cx.BlestPain 1.41 | 3.3 | 12.4% | 34 |
| ahf.NanoAndrew .4 | 5.3 | 10.1% | 6 |
| nic.Nicator 2.4 | 6.2 | 9.6% | 7 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.8% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.6 | 18 / 35 | 5374 |
| 2 | 1 | 68.5 | 85.7 | 15 / 35 | 5648 |
| 3 | 1 | 66.9 | 82.2 | 14 / 35 | 5078 |
| 4 | 1 | 68.3 | 84.4 | 17 / 35 | 5399 |
| 5 | 1 | 68.9 | 84.4 | 18 / 35 | 5789 |
| 6 | 1 | 68.5 | 84.1 | 14 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 50 | 76% |
| oog.melee.Mercutio 1.0 | 46 | 74% |
| cx.BlestPain 1.41 | 25 | 36% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| ahf.NanoAndrew .4 | 6 | 83% |
| nic.Nicator 2.4 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1003. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 28 | 24% | 55 |
| et.Predator 1.8 | 28 | 24% | 54 |
| cx.BlestPain 1.41 | 26 | 23% | 40 |
| ahf.NanoAndrew .4 | 15 | 13% | 27 |
| maribo.melee.BMV 0.1 | 11 | 10% | 18 |
| nic.Nicator 2.4 | 5 | 4% | 10 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 205 rounds): 161113 melee ticks, 56894 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53510 sent, 48870 reached their opponent, 10677 virtual hits (21.8% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 277 over 6 battles (46.2 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.5 | 117 / 210 | 2.13 | 18.6% | 28075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.6% | 117 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 36 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.6% | 17 |
| uji.DBH 1.1 | 3.8 | 11.0% | 12 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.9% | 4 |
| sigterm.Sigterm 1.0 | 6.5 | 8.5% | 12 |
| ratosh.Nobo 0.21 | 6.5 | 8.2% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 8.0% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 6.0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.9 | 20 / 35 | 4539 |
| 2 | 1 | 68.5 | 87.9 | 21 / 35 | 4957 |
| 3 | 1 | 67.9 | 89.5 | 20 / 35 | 4375 |
| 4 | 1 | 68.0 | 86.3 | 21 / 35 | 4616 |
| 5 | 1 | 68.7 | 90.5 | 20 / 35 | 4795 |
| 6 | 1 | 66.3 | 82.5 | 15 / 35 | 4793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 54 | 65% |
| agd.Mooserwirt2 2.7 | 27 | 89% |
| sigterm.Sigterm 1.0 | 26 | 69% |
| uji.DBH 1.1 | 22 | 77% |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 89% |
| ratosh.Nobo 0.21 | 7 | 57% |
| stelo.WangRobot 1.0 | 6 | 100% |
| spinnercat.Robovirus 2.718 | 4 | 75% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 33 | 35% | 67 |
| agd.Mooserwirt2 2.7 | 16 | 17% | 37 |
| uji.DBH 1.1 | 13 | 14% | 29 |
| sigterm.Sigterm 1.0 | 12 | 13% | 28 |
| ratosh.Nobo 0.21 | 6 | 6% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 5% | 16 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 4 |
| stelo.WangRobot 1.0 | 1 | 1% | 10 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 138007 melee ticks, 41064 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 96 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46657 sent, 41840 reached their opponent, 8894 virtual hits (21.3% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 97.2 | 181 / 210 | 1.25 | 21.8% | 35464 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 21.8% | 181 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 15 |
| mld.Infinity 2.2 | 3.3 | 12.3% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.4% | 4 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 5 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.7% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 94.9 | 30 / 35 | 5961 |
| 2 | 1 | 73.2 | 97.5 | 31 / 35 | 6301 |
| 3 | 1 | 73.0 | 98.4 | 31 / 35 | 5929 |
| 4 | 1 | 72.3 | 97.5 | 30 / 35 | 5429 |
| 5 | 1 | 73.0 | 98.1 | 31 / 35 | 5961 |
| 6 | 1 | 72.6 | 96.8 | 28 / 35 | 5883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 99 | 91% |
| mld.Infinity 2.2 | 32 | 97% |
| krillr.mini.JointStrike 2.0.0 | 31 | 90% |
| erdnis.Rover 0.3 | 15 | 80% |
| patson.PatsonTestBot 1.0 | 13 | 92% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 18 | 62% | 81 |
| erdnis.Rover 0.3 | 5 | 17% | 32 |
| krillr.mini.JointStrike 2.0.0 | 3 | 10% | 27 |
| patson.PatsonTestBot 1.0 | 2 | 7% | 21 |
| mld.Infinity 2.2 | 1 | 3% | 25 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 5 |

Posture (Hadur's M records, 199 rounds): 131493 melee ticks, 45806 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 43625 sent, 39172 reached their opponent, 9108 virtual hits (23.3% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 111 over 6 battles (18.5 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.0 | 138 / 210 | 1.90 | 20.2% | 34654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.2% | 138 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 37 |
| fwb.Nine 1.0.1 | 3.3 | 12.0% | 11 |
| catcat20.Rabbit 0.001 | 4.3 | 10.7% | 17 |
| nz.jdc.nano.GridFu 1.0 | 4.7 | 10.6% | 3 |
| m3thos.mini.Eva01 0.5.5 | 5.7 | 9.0% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.6% | 3 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 5.9% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.7 | 19 / 35 | 5435 |
| 2 | 1 | 69.5 | 87.3 | 22 / 35 | 5557 |
| 3 | 1 | 70.5 | 90.8 | 22 / 35 | 5782 |
| 4 | 1 | 71.6 | 93.0 | 27 / 35 | 5876 |
| 5 | 1 | 71.3 | 92.7 | 25 / 35 | 5749 |
| 6 | 1 | 71.0 | 89.5 | 23 / 35 | 6255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 75% |
| catcat20.Rabbit 0.001 | 36 | 78% |
| fwb.Nine 1.0.1 | 32 | 100% |
| m3thos.mini.Eva01 0.5.5 | 9 | 100% |
| nz.jdc.nano.GridFu 1.0 | 8 | 88% |
| bayen.nut.Squirrel 1.615 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 49% | 90 |
| catcat20.Rabbit 0.001 | 14 | 19% | 48 |
| fwb.Nine 1.0.1 | 12 | 16% | 21 |
| bayen.nut.Squirrel 1.615 | 5 | 7% | 9 |
| ntc.ControlledChaos 1.1.4 | 3 | 4% | 4 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 18 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 16 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 161441 melee ticks, 48981 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 31 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51213 sent, 46614 reached their opponent, 10403 virtual hits (22.3% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 200 over 6 battles (33.3 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.2 | 103 / 210 | 1.98 | 19.3% | 32852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 19.3% | 103 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 79 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 11 |
| eld.Hmm 1.0 | 5.2 | 8.7% | 13 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.6% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.0 | 5.8% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.7 | 21 / 35 | 5603 |
| 2 | 1 | 70.5 | 91.1 | 18 / 35 | 5903 |
| 3 | 1 | 69.9 | 90.5 | 21 / 35 | 5507 |
| 4 | 1 | 67.6 | 83.5 | 14 / 35 | 5136 |
| 5 | 1 | 69.5 | 85.7 | 14 / 35 | 5781 |
| 6 | 1 | 68.8 | 91.4 | 15 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 108 | 52% |
| cf.RiO.RiOx 4.2.1 | 26 | 85% |
| dummy.mini.Scimitar 1.01 | 19 | 84% |
| eld.Hmm 1.0 | 16 | 44% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1268. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 62 | 56% | 100 |
| eld.Hmm 1.0 | 14 | 13% | 27 |
| dummy.mini.Scimitar 1.01 | 13 | 12% | 38 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 28 |
| oa.weak.BotherBot 0.1 | 3 | 3% | 9 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 184919 melee ticks, 73385 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 58 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52818 sent, 48190 reached their opponent, 8172 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 328 over 6 battles (54.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 90 / 210 | 2.25 | 17.9% | 29258 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.2 | 17.9% | 90 |
| pe.SandboxDT 2.71m | 2.0 | 16.8% | 74 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 25 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 4 |
| yk.JahRoslav 1.1 | 6.2 | 6.9% | 1 |
| tad.Dalek98 0.98 | 7.5 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.9 | 16 / 35 | 4714 |
| 2 | 1 | 68.3 | 86.7 | 17 / 35 | 4994 |
| 3 | 1 | 68.5 | 86.3 | 14 / 35 | 5071 |
| 4 | 2 | 66.5 | 80.6 | 9 / 35 | 4728 |
| 5 | 1 | 69.0 | 88.3 | 15 / 35 | 5019 |
| 6 | 1 | 68.8 | 86.7 | 19 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 51 | 41% |
| kvk.HebusLeTroll 0.35 | 43 | 77% |
| jlm.javaDisturbance 0.59 | 33 | 82% |
| bigpete.Stewie 1.0 | 8 | 75% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 56 | 46% | 85 |
| kvk.HebusLeTroll 0.35 | 31 | 25% | 53 |
| jlm.javaDisturbance 0.59 | 19 | 16% | 47 |
| bigpete.Stewie 1.0 | 10 | 8% | 16 |
| tad.Dalek98 0.98 | 2 | 2% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 162047 melee ticks, 48408 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 55 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51588 sent, 46771 reached their opponent, 7525 virtual hits (16.1% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 319 over 6 battles (53.2 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.1 | 167 / 210 | 1.53 | 21.2% | 35227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 21.2% | 167 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 27 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 9.5% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.2 | 9.3% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.4% | 5 |
| cw.megas.Blade 0.8 | 7.2 | 8.3% | 0 |
| sample.Walls 1.0 | 7.7 | 7.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.1 | 30 / 35 | 5973 |
| 2 | 1 | 72.1 | 93.3 | 25 / 35 | 5873 |
| 3 | 1 | 71.4 | 92.4 | 26 / 35 | 5569 |
| 4 | 1 | 72.2 | 92.7 | 29 / 35 | 5990 |
| 5 | 1 | 72.6 | 94.3 | 29 / 35 | 5786 |
| 6 | 1 | 73.0 | 94.9 | 28 / 35 | 6036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 77 | 92% |
| cre.Karolos 0.32 | 56 | 96% |
| stelo.RamTrackSurfer 1.2 | 16 | 81% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 22 | 49% | 90 |
| cre.Karolos 0.32 | 11 | 24% | 61 |
| stelo.RamTrackSurfer 1.2 | 4 | 9% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 7% | 11 |
| cw.megas.Blade 0.8 | 3 | 7% | 6 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 14 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 126522 melee ticks, 45468 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 32 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 39685 sent, 34975 reached their opponent, 10424 virtual hits (29.8% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 220 over 6 battles (36.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 77.1 | 59 / 210 | 3.06 | 15.2% | 21227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.7 | 15.2% | 59 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.3% | 45 |
| florent.XSeries.X2 0.12 | 2.8 | 13.6% | 38 |
| davidalves.Phoenix 0.54 | 3.2 | 13.5% | 36 |
| pedersen.Ugluk 1.1.1 | 5.3 | 11.4% | 17 |
| oog.melee.Corsair 1.0 | 5.7 | 10.4% | 13 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.5% | 2 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.9% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.2% | 0 |
| evd.X1 0.01 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.8 | 14 / 35 | 4013 |
| 2 | 1 | 62.4 | 75.6 | 8 / 35 | 3463 |
| 3 | 1 | 63.7 | 78.1 | 8 / 35 | 3740 |
| 4 | 3 | 60.4 | 69.8 | 9 / 35 | 3085 |
| 5 | 1 | 65.3 | 82.2 | 14 / 35 | 3711 |
| 6 | 3 | 61.1 | 72.4 | 6 / 35 | 3215 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 53% |
| florent.XSeries.X2 0.12 | 25 | 52% |
| davidalves.Phoenix 0.54 | 20 | 55% |
| pedersen.Ugluk 1.1.1 | 16 | 56% |
| oog.melee.Corsair 1.0 | 13 | 38% |
| stelo.SoJNanoMelee 1.1 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 34 | 22% | 53 |
| rz.GlowBlowMelee 1.4 | 34 | 22% | 49 |
| pedersen.Ugluk 1.1.1 | 29 | 19% | 37 |
| davidalves.Phoenix 0.54 | 22 | 14% | 29 |
| oog.melee.Corsair 1.0 | 17 | 11% | 21 |
| stelo.SoJNanoMelee 1.1 | 8 | 5% | 8 |
| as.FrankTheTank 1.3 | 3 | 2% | 5 |
| evd.X1 0.01 | 3 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 133923 melee ticks, 26335 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 58 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45665 sent, 40643 reached their opponent, 7140 virtual hits (17.6% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 12 other Robocode JVMs running (hadur.bench.MeleeRunner x12), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 247 over 6 battles (41.2 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.0 | 122 / 210 | 2.17 | 18.2% | 23497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.2% | 122 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.7% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.3% | 16 |
| jdw.Hurricane 1.4 | 4.3 | 11.3% | 18 |
| ds.Oo 2.2 | 5.0 | 9.4% | 7 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.8% | 11 |
| awesomeness.Elite 1.0 | 7.7 | 6.8% | 2 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.0% | 4 |
| adt.Ar2 1.1 | 8.2 | 6.9% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.6 | 22 / 35 | 4077 |
| 2 | 1 | 68.0 | 90.2 | 21 / 35 | 3720 |
| 3 | 1 | 65.1 | 82.5 | 14 / 35 | 3545 |
| 4 | 1 | 69.2 | 92.4 | 27 / 35 | 4189 |
| 5 | 1 | 66.4 | 83.5 | 19 / 35 | 3790 |
| 6 | 1 | 67.4 | 85.1 | 19 / 35 | 4176 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 46 | 89% |
| voidious.mini.BrokenSword 2.0.3 | 42 | 76% |
| jdw.Hurricane 1.4 | 27 | 85% |
| ds.Oo 2.2 | 11 | 73% |
| gre.svman4.Morfeas 1.4.1 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 100% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 678. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 30 | 33% | 65 |
| voidious.micro.BlitzBat 1.05 | 18 | 20% | 51 |
| jdw.Hurricane 1.4 | 15 | 17% | 28 |
| ds.Oo 2.2 | 10 | 11% | 20 |
| gre.svman4.Morfeas 1.4.1 | 4 | 4% | 12 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 13 |
| awesomeness.Elite 1.0 | 3 | 3% | 11 |
| adt.Ar2 1.1 | 3 | 3% | 6 |
| amk.ChumbaMini 0.2 | 2 | 2% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 125451 melee ticks, 25525 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 47 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 44619 sent, 40049 reached their opponent, 6616 virtual hits (16.5% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 9 other Robocode JVMs running (hadur.bench.MeleeRunner x9), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 126 over 6 battles (21.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.5 | 133 / 210 | 1.77 | 20.2% | 36894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.2% | 133 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 32 |
| lrem.Spectre 0.4.4 | 3.2 | 12.4% | 19 |
| shu.nitro.LENIN .T34 | 3.8 | 11.9% | 17 |
| js.PinBall 1.6 | 5.2 | 10.5% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.4% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.0% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 94.6 | 25 / 35 | 6409 |
| 2 | 1 | 70.8 | 91.4 | 23 / 35 | 6021 |
| 3 | 1 | 69.1 | 87.0 | 18 / 35 | 5818 |
| 4 | 1 | 72.1 | 94.9 | 25 / 35 | 6167 |
| 5 | 1 | 70.7 | 90.2 | 20 / 35 | 6299 |
| 6 | 1 | 70.9 | 90.8 | 22 / 35 | 6180 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 75% |
| lrem.Spectre 0.4.4 | 47 | 81% |
| shu.nitro.LENIN .T34 | 30 | 87% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| js.PinBall 1.6 | 9 | 78% |
| fullsail.LaxativeTeaTwo 1.0 | 8 | 75% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 30 | 38% | 70 |
| lrem.Spectre 0.4.4 | 20 | 26% | 54 |
| shu.nitro.LENIN .T34 | 9 | 12% | 41 |
| js.PinBall 1.6 | 8 | 10% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 9% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 4% | 11 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 155306 melee ticks, 50701 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 24 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 50718 sent, 46027 reached their opponent, 11576 virtual hits (25.2% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 6 battles (55.2 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.9 | 146 / 210 | 2.27 | 19.1% | 30062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.2 | 19.1% | 146 |
| mk.Alpha 0.2.1 | 1.8 | 14.6% | 37 |
| wee.Gem 1.8.4 | 4.8 | 9.5% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 9.2% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 5.5 | 9.2% | 4 |
| EH.Eagle 1.0.6 | 5.7 | 8.6% | 4 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.5% | 3 |
| joe.ADinosaur 1.0 | 6.8 | 8.4% | 1 |
| caimano.Furia_Ceca 0.22 | 7.5 | 7.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 93.0 | 27 / 35 | 4913 |
| 2 | 1 | 70.7 | 94.0 | 27 / 35 | 5308 |
| 3 | 1 | 71.5 | 96.5 | 29 / 35 | 5405 |
| 4 | 1 | 69.2 | 89.2 | 24 / 35 | 4790 |
| 5 | 1 | 71.2 | 95.6 | 29 / 35 | 5390 |
| 6 | 2 | 56.3 | 47.3 | 10 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 96 | 88% |
| EH.Eagle 1.0.6 | 15 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 100% |
| wee.Gem 1.8.4 | 13 | 85% |
| throxbot.ThroxBot 0.1 | 12 | 92% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 22 | 33% | 88 |
| cs.Grudge 1.0 | 16 | 24% | 17 |
| joe.ADinosaur 1.0 | 6 | 9% | 13 |
| wee.Gem 1.8.4 | 5 | 7% | 18 |
| throxbot.ThroxBot 0.1 | 5 | 7% | 12 |
| EH.Eagle 1.0.6 | 4 | 6% | 21 |
| caimano.Furia_Ceca 0.22 | 4 | 6% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 1 | 1% | 16 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 123233 melee ticks, 38819 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 59 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 40606 sent, 35825 reached their opponent, 8904 virtual hits (24.9% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 210 over 6 battles (35.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.9 | 126 / 210 | 2.09 | 18.1% | 23916 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.1% | 126 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 37 |
| uji.Antique 1.0 | 3.3 | 11.8% | 20 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.8% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.7% | 8 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.3% | 6 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 3 |
| matt.advanced.Katana 1.0 | 8.5 | 6.3% | 4 |
| stelo.PianistNano 1.2 | 9.2 | 5.7% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 87.3 | 22 / 35 | 3715 |
| 2 | 1 | 67.9 | 87.9 | 21 / 35 | 4066 |
| 3 | 1 | 68.8 | 91.1 | 24 / 35 | 4336 |
| 4 | 1 | 68.1 | 89.8 | 23 / 35 | 4031 |
| 5 | 1 | 65.7 | 85.1 | 16 / 35 | 3737 |
| 6 | 1 | 66.9 | 86.0 | 20 / 35 | 4031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 71 | 79% |
| uji.Antique 1.0 | 46 | 85% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| pfvicm.Sobieski 7.2.3b | 11 | 82% |
| amk.ChumbaWumba 0.3 | 4 | 75% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 2 | 50% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 33% | 57 |
| uji.Antique 1.0 | 19 | 22% | 51 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 26 |
| qohnil.blot.BlotBot 3.61 | 8 | 9% | 32 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 15 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 11 |
| matt.advanced.Katana 1.0 | 3 | 3% | 8 |
| stelo.PianistNano 1.2 | 3 | 3% | 7 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 125756 melee ticks, 35026 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 43040 sent, 38364 reached their opponent, 5473 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 135 over 6 battles (22.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.9 | 90 / 210 | 2.45 | 17.9% | 26895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 17.9% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.3% | 56 |
| deewiant.Anomaly 0.2 | 2.7 | 15.0% | 36 |
| myl.micro.Troodon 1.10 | 4.3 | 11.4% | 14 |
| jok.PheonixM 0.1.2 | 4.7 | 11.2% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.9% | 4 |
| ap.Frederick 1.1 | 8.5 | 5.2% | 2 |
| jangs.ns51 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.2 | 14 / 35 | 4375 |
| 2 | 1 | 67.6 | 84.4 | 14 / 35 | 4432 |
| 3 | 1 | 68.3 | 84.8 | 17 / 35 | 4712 |
| 4 | 1 | 68.2 | 86.0 | 15 / 35 | 4617 |
| 5 | 1 | 66.7 | 81.0 | 16 / 35 | 4103 |
| 6 | 1 | 67.9 | 83.8 | 14 / 35 | 4656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 54 | 69% |
| zyx.mega.YersiniaPestis 3.1 | 42 | 60% |
| jok.PheonixM 0.1.2 | 14 | 93% |
| myl.micro.Troodon 1.10 | 10 | 80% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 41% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 37 | 31% | 66 |
| myl.micro.Troodon 1.10 | 17 | 14% | 25 |
| jok.PheonixM 0.1.2 | 13 | 11% | 24 |
| DBall.Anarchy 0.1 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 158258 melee ticks, 41884 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 50 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 52423 sent, 47806 reached their opponent, 7455 virtual hits (15.6% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 139 over 6 battles (23.2 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.1 | 40 / 210 | 3.42 | 14.4% | 22169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 2.0 | 14.4% | 40 |
| catcat20.Matcha 0.006 | 2.2 | 14.3% | 60 |
| darkcanuck.B26354 1.06 | 2.5 | 14.0% | 43 |
| oog.melee.Capulet 1.2 | 4.0 | 12.4% | 30 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.3% | 20 |
| intruder.PrairieWolf 2.61 | 6.2 | 8.9% | 13 |
| ntc.Opposite 1.5 | 7.5 | 7.6% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.0% | 4 |
| tripphippy.Alice 1.1 | 8.5 | 6.8% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 72.4 | 8 / 35 | 3940 |
| 2 | 2 | 62.6 | 75.6 | 9 / 35 | 3451 |
| 3 | 3 | 58.4 | 66.0 | 3 / 35 | 3192 |
| 4 | 1 | 64.6 | 78.1 | 9 / 35 | 4337 |
| 5 | 1 | 62.0 | 74.0 | 7 / 35 | 3746 |
| 6 | 3 | 61.2 | 72.4 | 4 / 35 | 3503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 20 | 65% |
| stelo.PastFuture 2.3.2 | 19 | 53% |
| darkcanuck.B26354 1.06 | 18 | 39% |
| catcat20.Matcha 0.006 | 16 | 13% |
| tripphippy.Alice 1.1 | 6 | 100% |
| intruder.PrairieWolf 2.61 | 6 | 33% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 25% | 53 |
| stelo.PastFuture 2.3.2 | 37 | 22% | 45 |
| catcat20.Matcha 0.006 | 34 | 20% | 37 |
| oog.melee.Capulet 1.2 | 21 | 12% | 34 |
| fowl3628800.LightningBolt 2.6.0 | 13 | 8% | 14 |
| ntc.Opposite 1.5 | 13 | 8% | 13 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 8 |
| tripphippy.Alice 1.1 | 3 | 2% | 6 |

Posture (Hadur's M records, 201 rounds): 149523 melee ticks, 21242 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49079 sent, 44415 reached their opponent, 7517 virtual hits (16.9% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 10 other Robocode JVMs running (hadur.bench.MeleeRunner x10), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 78.3 | 45 / 210 | 2.95 | 15.2% | 20544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.0% | 106 |
| hadur2.Hadur 3.17.1pf | 2.0 | 15.2% | 45 |
| gh.mini.Griezel 0.2 | 3.0 | 13.2% | 37 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.1% | 6 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.7% | 8 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.6% | 4 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.1% | 0 |
| fm.mammillarias 1.3 | 9.0 | 5.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 79.0 | 9 / 35 | 3375 |
| 2 | 2 | 62.1 | 76.8 | 4 / 35 | 3187 |
| 3 | 2 | 62.7 | 78.1 | 8 / 35 | 3211 |
| 4 | 2 | 63.8 | 79.4 | 6 / 35 | 3586 |
| 5 | 2 | 62.9 | 76.5 | 7 / 35 | 3436 |
| 6 | 2 | 64.8 | 80.0 | 11 / 35 | 3749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 44 | 32% |
| gh.mini.Griezel 0.2 | 24 | 42% |
| d414.nano.Quantum 1.0.0 | 10 | 100% |
| spinnercat.micro.Tyger 0.1 | 9 | 67% |
| timmit.nano.TimDog 0.33 | 5 | 60% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 80 | 48% | 92 |
| gh.mini.Griezel 0.2 | 30 | 18% | 43 |
| spinnercat.micro.Tyger 0.1 | 20 | 12% | 25 |
| d414.nano.Quantum 1.0.0 | 14 | 8% | 21 |
| timmit.nano.TimDog 0.33 | 10 | 6% | 13 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |

Posture (Hadur's M records, 199 rounds): 149728 melee ticks, 23872 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 63 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 48732 sent, 43956 reached their opponent, 6929 virtual hits (15.8% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 13 other Robocode JVMs running (hadur.bench.MeleeRunner x13), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 224 over 6 battles (37.3 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 85.0 | 103 / 210 | 2.35 | 17.3% | 25315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 17.3% | 103 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 48 |
| apc.botM 3.0 | 3.3 | 11.9% | 26 |
| vjik.UnViolation 1.1 | 4.3 | 10.5% | 11 |
| lxx.ConceptA 0.8 | 5.0 | 10.1% | 5 |
| bayen.UbaMicro 1.4 | 5.3 | 9.8% | 3 |
| yk.JahMicro 1.0 | 7.7 | 7.2% | 6 |
| panzer.Panzer 0.2 | 7.7 | 6.8% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.6 | 19 / 35 | 4461 |
| 2 | 1 | 64.5 | 81.6 | 15 / 35 | 3841 |
| 3 | 1 | 66.9 | 86.7 | 22 / 35 | 4265 |
| 4 | 1 | 65.7 | 84.4 | 16 / 35 | 4253 |
| 5 | 1 | 66.4 | 87.3 | 16 / 35 | 4260 |
| 6 | 1 | 65.2 | 81.6 | 15 / 35 | 4235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 70 | 63% |
| apc.botM 3.0 | 29 | 76% |
| lxx.ConceptA 0.8 | 12 | 83% |
| yk.JahMicro 1.0 | 10 | 60% |
| vjik.UnViolation 1.1 | 8 | 88% |
| donjezza.Jezza 1.0 | 8 | 63% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| conscience.Electron 1.3g | 1 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 41 | 38% | 87 |
| apc.botM 3.0 | 17 | 16% | 40 |
| lxx.ConceptA 0.8 | 15 | 14% | 24 |
| bayen.UbaMicro 1.4 | 12 | 11% | 19 |
| vjik.UnViolation 1.1 | 10 | 9% | 20 |
| yk.JahMicro 1.0 | 6 | 6% | 10 |
| donjezza.Jezza 1.0 | 3 | 3% | 5 |
| conscience.Electron 1.3g | 3 | 3% | 4 |
| panzer.Panzer 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 124163 melee ticks, 39498 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 37 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 42565 sent, 37780 reached their opponent, 6593 virtual hits (17.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 96 over 6 battles (16.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.8 | 108 / 210 | 2.19 | 18.7% | 28816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.7% | 108 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.3% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.9% | 17 |
| labg.Cataclysm 2.05 | 4.8 | 10.5% | 18 |
| baal.nano.N 1.42 | 6.2 | 8.5% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.6% | 4 |
| zyx.micro.Ant 1.1 | 8.3 | 5.6% | 1 |
| sanja.First 0.1 | 8.7 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.7 | 22 / 35 | 5281 |
| 2 | 1 | 68.5 | 86.7 | 16 / 35 | 4931 |
| 3 | 1 | 67.6 | 86.3 | 14 / 35 | 4549 |
| 4 | 1 | 68.0 | 84.8 | 16 / 35 | 4526 |
| 5 | 1 | 68.8 | 87.9 | 19 / 35 | 4448 |
| 6 | 1 | 68.6 | 83.5 | 21 / 35 | 5081 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 73 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 61% |
| gre.svman4.Leonidas 1.3.2 | 19 | 79% |
| labg.Cataclysm 2.05 | 14 | 43% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 67% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 36 | 35% | 91 |
| gre.svman4.Leonidas 1.3.2 | 25 | 24% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 16% | 36 |
| labg.Cataclysm 2.05 | 12 | 12% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 12% | 16 |
| zyx.micro.Ant 1.1 | 2 | 2% | 4 |
| baal.nano.N 1.42 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 166803 melee ticks, 47652 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 48 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54083 sent, 49343 reached their opponent, 7389 virtual hits (15.0% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 212 over 6 battles (35.3 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.5 | 70 / 210 | 2.40 | 17.3% | 28485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kid.Gladiator .7.2 | 1.5 | 17.5% | 54 |
| hadur2.Hadur 3.17.1pf | 1.7 | 17.3% | 70 |
| stelo.Spread 0.9 | 2.8 | 16.1% | 64 |
| jcs.Seth 1.8 | 4.2 | 11.8% | 22 |
| cli.Dancer 1.1 | 5.3 | 9.8% | 0 |
| tcf.Reach 3 | 5.5 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.3% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 82.2 | 10 / 35 | 4442 |
| 2 | 3 | 64.8 | 77.1 | 7 / 35 | 4548 |
| 3 | 1 | 68.2 | 86.7 | 12 / 35 | 4894 |
| 4 | 2 | 67.7 | 84.8 | 11 / 35 | 4770 |
| 5 | 1 | 68.9 | 88.9 | 16 / 35 | 4704 |
| 6 | 1 | 69.1 | 87.3 | 14 / 35 | 5127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 63 | 56% |
| stelo.Spread 0.9 | 52 | 42% |
| jcs.Seth 1.8 | 14 | 43% |
| cli.Dancer 1.1 | 4 | 100% |
| tcf.Reach 3 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 142 of 210 rounds, at a mean tick of 1024. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 40% | 75 |
| kid.Gladiator .7.2 | 49 | 35% | 81 |
| jcs.Seth 1.8 | 20 | 14% | 29 |
| ratosh.Wesco 1.4 | 7 | 5% | 8 |
| tcf.Reach 3 | 3 | 2% | 6 |
| cli.Dancer 1.1 | 2 | 1% | 8 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 170841 melee ticks, 50560 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 63 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52778 sent, 47999 reached their opponent, 7860 virtual hits (16.4% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 766 over 6 battles (127.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 79.2 | 28 / 210 | 2.87 | 15.1% | 21420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 139 |
| hadur2.Hadur 3.17.1pf | 2.0 | 15.1% | 28 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.6% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.4% | 13 |
| rz.HawkOnFire 0.1 | 4.8 | 11.5% | 6 |
| wit.Chuliath 1.0 | 6.2 | 6.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 5.6% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 83.8 | 5 / 35 | 3590 |
| 2 | 2 | 64.4 | 81.0 | 6 / 35 | 3475 |
| 3 | 2 | 63.7 | 79.0 | 5 / 35 | 3638 |
| 4 | 2 | 64.4 | 80.3 | 6 / 35 | 3587 |
| 5 | 2 | 63.0 | 76.2 | 4 / 35 | 3769 |
| 6 | 2 | 62.1 | 74.9 | 2 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 66 | 12% |
| gh.mini.Gruwel 0.9 | 26 | 35% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 38% |
| rz.HawkOnFire 0.1 | 6 | 67% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 95 | 51% | 104 |
| gh.mini.Gruwel 0.9 | 32 | 17% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 28 | 15% | 33 |
| rz.HawkOnFire 0.1 | 20 | 11% | 27 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 0 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 146465 melee ticks, 43010 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 32 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45347 sent, 40501 reached their opponent, 6285 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 272 over 6 battles (45.3 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.1 | 127 / 210 | 2.16 | 19.2% | 30531 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 19.2% | 127 |
| bzdp.Pansy 2.1 | 2.8 | 12.3% | 17 |
| alpha.RainingFire 1.0 | 3.2 | 11.9% | 20 |
| bvh.micro.Freya 0.3 | 3.8 | 11.5% | 19 |
| mz.Cork 0.1 | 5.0 | 10.6% | 15 |
| bvh.mini.Fenrir 0.39 | 5.3 | 10.3% | 2 |
| m3thos.Eva02 0.7.1 | 6.8 | 9.1% | 7 |
| dl.BetterWalls 1.0 | 8.2 | 5.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.3 | 22 / 35 | 4880 |
| 2 | 1 | 69.4 | 85.7 | 25 / 35 | 5401 |
| 3 | 1 | 68.0 | 85.4 | 19 / 35 | 4797 |
| 4 | 1 | 68.4 | 86.3 | 20 / 35 | 4865 |
| 5 | 1 | 70.5 | 91.7 | 23 / 35 | 5524 |
| 6 | 1 | 68.3 | 86.0 | 18 / 35 | 5064 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 98% |
| mz.Cork 0.1 | 25 | 84% |
| bvh.micro.Freya 0.3 | 25 | 76% |
| bvh.mini.Fenrir 0.39 | 21 | 95% |
| alpha.RainingFire 1.0 | 17 | 76% |
| m3thos.Eva02 0.7.1 | 12 | 58% |
| dl.BetterWalls 1.0 | 3 | 67% |
| sample.MyFirstRobot 1.0 | 2 | 50% |

Hadur died in 84 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 23% | 33 |
| bvh.micro.Freya 0.3 | 18 | 21% | 39 |
| bzdp.Pansy 2.1 | 16 | 19% | 55 |
| mz.Cork 0.1 | 9 | 11% | 32 |
| m3thos.Eva02 0.7.1 | 8 | 10% | 19 |
| bvh.mini.Fenrir 0.39 | 7 | 8% | 20 |
| squidM.TentalceMeleeNano 1.1 | 4 | 5% | 5 |
| dl.BetterWalls 1.0 | 1 | 1% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 143653 melee ticks, 42566 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50150 sent, 45522 reached their opponent, 9525 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.5 | 163 / 210 | 2.04 | 19.3% | 32643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 19.3% | 163 |
| agrach.Dalek 1.0 | 3.7 | 10.2% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 10.1% | 6 |
| germ.TheMind .2 | 3.8 | 10.0% | 6 |
| EBBU.Sim2 1.02 | 4.7 | 9.6% | 1 |
| stelo.UntouchableNano 1.3 | 5.7 | 9.2% | 9 |
| lmk.ACPFinal 0.1 | 7.3 | 8.2% | 5 |
| mb.Beast 0.1 | 7.5 | 8.2% | 6 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.0% | 0 |
| skm.Ryubot 1.0 | 9.5 | 7.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 29 / 35 | 5852 |
| 2 | 1 | 68.5 | 87.3 | 29 / 35 | 5600 |
| 3 | 1 | 66.7 | 86.7 | 24 / 35 | 4805 |
| 4 | 1 | 67.1 | 83.5 | 24 / 35 | 5470 |
| 5 | 1 | 68.2 | 88.6 | 26 / 35 | 5373 |
| 6 | 1 | 69.8 | 93.3 | 31 / 35 | 5543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 34 | 94% |
| stelo.UntouchableNano 1.3 | 28 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 26 | 100% |
| EBBU.Sim2 1.02 | 22 | 95% |
| mb.Beast 0.1 | 20 | 95% |
| germ.TheMind .2 | 17 | 100% |
| skm.Ryubot 1.0 | 11 | 100% |
| lmk.ACPFinal 0.1 | 10 | 90% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 11 | 23% | 15 |
| agrach.Dalek 1.0 | 7 | 15% | 42 |
| mb.Beast 0.1 | 7 | 15% | 26 |
| lmk.ACPFinal 0.1 | 7 | 15% | 22 |
| EBBU.Sim2 1.02 | 6 | 13% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 8% | 25 |
| germ.TheMind .2 | 4 | 8% | 18 |
| stelo.UntouchableNano 1.3 | 2 | 4% | 36 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 94752 melee ticks, 24845 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 70 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 32046 sent, 27745 reached their opponent, 8206 virtual hits (29.6% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.0 | 86 / 210 | 2.44 | 17.1% | 25707 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.2 | 17.1% | 86 |
| justin.Mallais 14.0 | 1.8 | 16.6% | 68 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 12 |
| cs.Wren 1.0 | 4.7 | 10.6% | 11 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.5% | 22 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.2% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.5 | 8.6% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.1% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.6 | 16 / 35 | 3819 |
| 2 | 1 | 67.8 | 86.0 | 17 / 35 | 4635 |
| 3 | 1 | 65.7 | 83.8 | 12 / 35 | 4083 |
| 4 | 1 | 67.8 | 87.6 | 15 / 35 | 4588 |
| 5 | 2 | 64.9 | 79.0 | 10 / 35 | 4202 |
| 6 | 1 | 67.0 | 85.7 | 16 / 35 | 4380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 71 | 62% |
| bvh.mini.Freya 0.55 | 26 | 85% |
| bts.mega.Gnarly 1.4 | 15 | 40% |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 83% |
| kdf.KoulDestroyer 1.0 | 6 | 33% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 50% |
| cs.Wren 1.0 | 4 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 53 | 42% | 91 |
| cs.Wren 1.0 | 20 | 16% | 32 |
| bts.mega.Gnarly 1.4 | 17 | 13% | 28 |
| bvh.mini.Freya 0.55 | 16 | 13% | 26 |
| kdf.KoulDestroyer 1.0 | 11 | 9% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 2% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 137216 melee ticks, 38796 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 82 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45255 sent, 40271 reached their opponent, 8678 virtual hits (21.5% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.4 | 82 / 210 | 2.40 | 17.7% | 29535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 17.7% | 82 |
| bvh.fry.Freya 0.82 | 2.2 | 14.6% | 22 |
| az.Ololobot 0.2.4 | 2.8 | 13.8% | 75 |
| catcat20.Lambda 0.024 | 4.0 | 11.6% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.0 | 8.6% | 3 |
| gimp.GimpBot 0.1 | 6.5 | 7.9% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.3% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.0 | 9 / 35 | 4650 |
| 2 | 1 | 68.1 | 88.9 | 16 / 35 | 5156 |
| 3 | 1 | 67.1 | 86.7 | 11 / 35 | 4907 |
| 4 | 1 | 68.7 | 90.2 | 18 / 35 | 5139 |
| 5 | 1 | 66.4 | 82.2 | 15 / 35 | 4895 |
| 6 | 1 | 65.0 | 77.5 | 13 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 37% |
| catcat20.Lambda 0.024 | 36 | 64% |
| bvh.fry.Freya 0.82 | 35 | 83% |
| gimp.GimpBot 0.1 | 5 | 80% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 50 | 38% | 70 |
| bvh.fry.Freya 0.82 | 35 | 27% | 54 |
| catcat20.Lambda 0.024 | 21 | 16% | 41 |
| winamp32.micro.MicroMacro 1.0 | 6 | 5% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 4 | 3% | 9 |
| gimp.GimpBot 0.1 | 4 | 3% | 9 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 167235 melee ticks, 49924 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 65 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 52169 sent, 47479 reached their opponent, 8525 virtual hits (18.0% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 6 battles (19.8 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.7 | 106 / 210 | 2.20 | 18.5% | 28735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 18.5% | 106 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.5% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.8% | 20 |
| mz.AntiGrav 1.0 | 3.7 | 11.6% | 17 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.4% | 10 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 5 |
| stelo.Randomness 1.0 | 6.3 | 9.2% | 13 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.6% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.1% | 0 |
| sample.Corners 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.3 | 18 / 35 | 4878 |
| 2 | 1 | 69.5 | 88.6 | 19 / 35 | 4980 |
| 3 | 1 | 66.6 | 83.8 | 12 / 35 | 4438 |
| 4 | 1 | 68.4 | 86.3 | 19 / 35 | 4822 |
| 5 | 1 | 70.1 | 89.2 | 22 / 35 | 5088 |
| 6 | 1 | 67.5 | 84.8 | 16 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 69% |
| kano.gamma.KanoGamma 1.8 | 42 | 76% |
| mz.AntiGrav 1.0 | 21 | 81% |
| Polkwane.SmashMelee 1.0 | 18 | 83% |
| stelo.Randomness 1.0 | 9 | 44% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |
| alpha.BlackIce 1.0 | 4 | 50% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 27 | 26% | 51 |
| kano.gamma.KanoGamma 1.8 | 21 | 20% | 55 |
| mz.AntiGrav 1.0 | 21 | 20% | 37 |
| stelo.Randomness 1.0 | 12 | 12% | 22 |
| Polkwane.SmashMelee 1.0 | 10 | 10% | 21 |
| alpha.BlackIce 1.0 | 7 | 7% | 11 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 9 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 202 rounds): 150990 melee ticks, 38457 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 72 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49487 sent, 44719 reached their opponent, 9296 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.0 | 99 / 210 | 2.26 | 17.8% | 25637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 17.8% | 99 |
| eem.EvBotNG v12.8 | 2.0 | 16.0% | 77 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.9% | 15 |
| ary.Swarm 1.1 | 3.7 | 12.6% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.4% | 10 |
| shrub.Silver v048 | 6.0 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 7.2 | 7.2% | 0 |
| stelo.Mirror 1.1 | 8.2 | 5.7% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.3% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.0 | 18 / 35 | 3769 |
| 2 | 1 | 66.9 | 84.8 | 9 / 35 | 4418 |
| 3 | 1 | 68.2 | 87.6 | 17 / 35 | 4229 |
| 4 | 1 | 68.3 | 87.9 | 18 / 35 | 4450 |
| 5 | 1 | 67.6 | 85.1 | 17 / 35 | 4236 |
| 6 | 1 | 68.2 | 84.8 | 20 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 41% |
| lessonz.robocode.Oz 0.5.0 | 35 | 91% |
| simonton.nano.MeleeSeed 1.8 | 21 | 95% |
| ary.Swarm 1.1 | 15 | 93% |
| stelo.Mirror 1.1 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 57 | 50% | 84 |
| lessonz.robocode.Oz 0.5.0 | 19 | 17% | 45 |
| ary.Swarm 1.1 | 19 | 17% | 29 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 33 |
| shrub.Silver v048 | 1 | 1% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| zyx.nano.Ant 1.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 148983 melee ticks, 49056 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 64 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 49670 sent, 44790 reached their opponent, 6905 virtual hits (15.4% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 83 over 6 battles (13.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.1 | 123 / 210 | 1.89 | 19.3% | 32018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 19.3% | 123 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 42 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.5% | 10 |
| ara.Shera 0.88 | 3.8 | 13.0% | 31 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 3 |
| dsw.StaticD 1.0 | 6.2 | 6.8% | 1 |
| maribo.IotaCT 1.1 | 7.3 | 6.2% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.5 | 24 / 35 | 5079 |
| 2 | 1 | 70.5 | 94.0 | 24 / 35 | 5471 |
| 3 | 1 | 70.3 | 91.7 | 24 / 35 | 5596 |
| 4 | 1 | 68.0 | 87.3 | 14 / 35 | 5101 |
| 5 | 1 | 70.3 | 90.5 | 21 / 35 | 5801 |
| 6 | 1 | 68.2 | 86.7 | 16 / 35 | 4970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 91 | 85% |
| maribo.mini.MiniQuester 0.1 | 37 | 89% |
| ara.Shera 0.88 | 24 | 46% |
| dsw.StaticD 1.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 34 | 39% | 51 |
| wompi.Wallaby 5.1 | 29 | 33% | 96 |
| maribo.mini.MiniQuester 0.1 | 15 | 17% | 47 |
| amz.NanoClone 1.41 | 5 | 6% | 6 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 162959 melee ticks, 42407 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 27 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51615 sent, 46986 reached their opponent, 9057 virtual hits (19.3% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 424 over 6 battles (70.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 76.6 | 26 / 210 | 3.10 | 14.7% | 21495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 153 |
| hadur2.Hadur 3.17.1pf | 2.0 | 14.7% | 26 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.2% | 27 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.5% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.2% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.2% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 73.0 | 4 / 35 | 3565 |
| 2 | 2 | 63.2 | 74.3 | 3 / 35 | 3427 |
| 3 | 2 | 63.9 | 77.1 | 3 / 35 | 3427 |
| 4 | 2 | 64.8 | 78.7 | 4 / 35 | 3572 |
| 5 | 2 | 65.5 | 80.0 | 8 / 35 | 3729 |
| 6 | 2 | 64.4 | 76.5 | 4 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 15% |
| brainfade.melee.Dusk 0.44 | 10 | 30% |
| dummy.micro.Sparrow 2.5 | 6 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 101 | 54% | 113 |
| brainfade.melee.Dusk 0.44 | 24 | 13% | 27 |
| dummy.micro.Sparrow 2.5 | 22 | 12% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 10% | 22 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 10 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148249 melee ticks, 38567 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 25 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48250 sent, 43318 reached their opponent, 7344 virtual hits (17.0% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 201 over 6 battles (33.5 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.9 | 135 / 210 | 1.82 | 20.1% | 33066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 20.1% | 135 |
| stelo.Liblix 0.3.1 | 2.2 | 14.7% | 48 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.5 | 9.6% | 0 |
| jwirde.Gort 2.0 | 4.8 | 9.7% | 5 |
| disan.Chair 2.2.0 | 6.5 | 7.7% | 2 |
| wompi.Quokka 1.6 | 6.7 | 7.7% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.2 | 5.1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.4 | 25 / 35 | 5670 |
| 2 | 1 | 70.1 | 92.4 | 23 / 35 | 5292 |
| 3 | 1 | 70.0 | 89.8 | 21 / 35 | 5378 |
| 4 | 1 | 71.9 | 94.6 | 26 / 35 | 6038 |
| 5 | 1 | 70.8 | 93.7 | 24 / 35 | 5370 |
| 6 | 1 | 67.9 | 82.5 | 16 / 35 | 5318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 62% |
| tzu.TheArtOfWar 1.2 | 57 | 93% |
| jwirde.Gort 2.0 | 15 | 87% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| wompi.Quokka 1.6 | 3 | 67% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 46 | 61% | 98 |
| tzu.TheArtOfWar 1.2 | 12 | 16% | 56 |
| jwirde.Gort 2.0 | 9 | 12% | 27 |
| stf.PanzerGeneral 0.1 | 4 | 5% | 8 |
| wompi.Quokka 1.6 | 2 | 3% | 2 |
| disan.Chair 2.2.0 | 1 | 1% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 1% | 8 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 152381 melee ticks, 46747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 41 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 52862 sent, 48264 reached their opponent, 10227 virtual hits (21.2% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 14 other Robocode JVMs running (hadur.bench.MeleeRunner x14), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 782 over 6 battles (130.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.5 | 91 / 210 | 2.13 | 19.3% | 32533 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1pf | 1.0 | 19.3% | 91 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.0% | 93 |
| jje.BagPuss 1.2 | 3.0 | 11.9% | 4 |
| myl.nano.Graviton 1.10 | 4.5 | 10.2% | 4 |
| sul.Lunar 1.1 | 4.8 | 9.9% | 9 |
| fm.claire 1.7 | 6.5 | 8.7% | 1 |
| hvilela.HVilela 0.9 | 6.7 | 8.9% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.0% | 6 |
| wit.Deep7 2.0 | 9.0 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 16 / 35 | 5767 |
| 2 | 1 | 68.1 | 86.3 | 13 / 35 | 5215 |
| 3 | 1 | 69.7 | 89.8 | 18 / 35 | 5449 |
| 4 | 1 | 67.4 | 83.8 | 12 / 35 | 5032 |
| 5 | 1 | 69.0 | 87.0 | 15 / 35 | 5575 |
| 6 | 1 | 69.1 | 86.7 | 17 / 35 | 5495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 85 | 34% |
| jje.BagPuss 1.2 | 19 | 89% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| sul.Lunar 1.1 | 15 | 87% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 63% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 5 | 80% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 57 | 46% | 0 |
| jje.BagPuss 1.2 | 23 | 18% | 71 |
| myl.nano.Graviton 1.10 | 13 | 10% | 42 |
| sul.Lunar 1.1 | 11 | 9% | 47 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 22 |
| fm.claire 1.7 | 4 | 3% | 13 |
| wit.Deep7 2.0 | 3 | 2% | 6 |
| hvilela.HVilela 0.9 | 2 | 2% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 207381 melee ticks, 95467 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 58 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 62522 sent, 57873 reached their opponent, 8500 virtual hits (14.7% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1pf against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 518 over 6 battles (86.3 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.9 | 44 / 210 | 2.81 | 15.4% | 23229 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.6% | 73 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 83 |
| hadur2.Hadur 3.17.1pf | 3.0 | 15.4% | 44 |
| cx.Princess 1.0 | 4.3 | 10.5% | 7 |
| mz.MicroSheep 1.0 | 4.8 | 10.4% | 2 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.0% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 82.2 | 5 / 35 | 4005 |
| 2 | 3 | 64.4 | 79.0 | 9 / 35 | 3823 |
| 3 | 3 | 64.4 | 82.5 | 5 / 35 | 3683 |
| 4 | 3 | 64.8 | 80.3 | 8 / 35 | 4064 |
| 5 | 3 | 62.7 | 74.0 | 8 / 35 | 3800 |
| 6 | 3 | 64.9 | 81.3 | 9 / 35 | 3854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 47 | 55% |
| rsalesc.melee.Medina 0.4.5 | 25 | 24% |
| cx.Princess 1.0 | 10 | 50% |
| mz.MicroSheep 1.0 | 5 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 77 | 45% | 101 |
| rsalesc.melee.Medina 0.4.5 | 50 | 29% | 59 |
| mz.MicroSheep 1.0 | 12 | 7% | 18 |
| cx.Princess 1.0 | 11 | 6% | 13 |
| sadoner.killer 0.2 | 8 | 5% | 10 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 153240 melee ticks, 28698 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 45 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 45206 sent, 40219 reached their opponent, 6101 virtual hits (15.2% of those reached).

