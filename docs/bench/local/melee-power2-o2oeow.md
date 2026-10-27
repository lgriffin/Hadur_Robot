# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 129 over 6 battles (21.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 49 / 210 | 2.27 | 17.4% | 31795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.2 | 19.3% | 136 |
| hadur2.Hadur 3.18o2oeow | 1.8 | 17.4% | 49 |
| sgp.JollyNinja 3.53 | 3.3 | 11.6% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.9% | 2 |
| lorneswork.Predator 1.0 | 5.0 | 10.3% | 2 |
| mz.MicroGodMelee 1 | 5.2 | 10.1% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.1 | 89.5 | 11 / 35 | 5474 |
| 2 | 2 | 67.6 | 85.4 | 8 / 35 | 5349 |
| 3 | 2 | 66.1 | 84.8 | 7 / 35 | 4869 |
| 4 | 1 | 68.7 | 88.9 | 11 / 35 | 5692 |
| 5 | 2 | 66.3 | 83.2 | 5 / 35 | 5116 |
| 6 | 2 | 66.9 | 83.8 | 7 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 14% |
| sgp.JollyNinja 3.53 | 27 | 63% |
| mz.MicroGodMelee 1 | 8 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1147. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 67% | 128 |
| sgp.JollyNinja 3.53 | 24 | 15% | 36 |
| lorneswork.Predator 1.0 | 11 | 7% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 10 |
| mz.MicroGodMelee 1 | 5 | 3% | 13 |
| adt.Ar2 1.0 | 4 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |

Posture (Hadur's M records, 202 rounds): 138234 melee ticks, 90804 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 44480 sent, 39587 reached their opponent, 7870 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 295 over 6 battles (49.2 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.3 | 94 / 210 | 2.59 | 18.1% | 31255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 18.1% | 94 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.5% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.2 | 12.7% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.7% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.5% | 22 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.4% | 5 |
| sch.Simone 0.3d | 7.0 | 7.8% | 7 |
| Noran.BitchingElk 0.054 | 7.3 | 7.8% | 12 |
| stelo.PatternRobot 1.0 | 9.2 | 5.2% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.1 | 16 / 35 | 5464 |
| 2 | 1 | 68.8 | 88.3 | 18 / 35 | 5135 |
| 3 | 1 | 66.0 | 78.4 | 12 / 35 | 5098 |
| 4 | 1 | 64.7 | 75.2 | 15 / 35 | 4784 |
| 5 | 1 | 68.2 | 82.9 | 17 / 35 | 5441 |
| 6 | 1 | 68.3 | 84.1 | 16 / 35 | 5333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 37 | 78% |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 50% |
| Noran.BitchingElk 0.054 | 14 | 64% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| sch.Simone 0.3d | 12 | 75% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 42 | 35% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 20 | 17% | 53 |
| com.cohesiva.robocode.ManOwaR 1.0 | 17 | 14% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 12% | 21 |
| sch.Simone 0.3d | 8 | 7% | 17 |
| Noran.BitchingElk 0.054 | 7 | 6% | 17 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 7 |
| stelo.PatternRobot 1.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 2 | 2% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 158363 melee ticks, 41406 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 52 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 57176 sent, 52480 reached their opponent, 9041 virtual hits (17.2% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 171 over 6 battles (28.5 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.8 | 150 / 210 | 1.74 | 20.3% | 37617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.3% | 150 |
| radnor.DoctorBob 1.42 | 2.2 | 14.6% | 33 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 11 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 16 |
| urdos.URDOS 1.3 | 5.2 | 9.3% | 0 |
| adt.Ar1 2.1 | 5.8 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.4% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.9 | 30 / 35 | 6485 |
| 2 | 1 | 71.8 | 93.3 | 28 / 35 | 6865 |
| 3 | 1 | 70.2 | 91.4 | 24 / 35 | 5966 |
| 4 | 1 | 68.7 | 87.0 | 20 / 35 | 5854 |
| 5 | 1 | 69.9 | 90.8 | 23 / 35 | 6113 |
| 6 | 1 | 70.8 | 93.3 | 25 / 35 | 6334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 63 | 90% |
| vuen.Cake 2.51 | 59 | 88% |
| kawigi.nano.Lib 1.0 | 33 | 91% |
| oa.weak.FlyMk1 0.1 | 8 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 24 | 40% | 70 |
| vuen.Cake 2.51 | 15 | 25% | 65 |
| kawigi.nano.Lib 1.0 | 12 | 20% | 44 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 7% | 4 |
| urdos.URDOS 1.3 | 2 | 3% | 9 |
| adt.Ar1 2.1 | 2 | 3% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 201 rounds): 126807 melee ticks, 36515 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (201 rounds): 38026 sent, 33469 reached their opponent, 8441 virtual hits (25.2% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 435 over 6 battles (72.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.5 | 35 / 210 | 2.30 | 17.6% | 33789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.3% | 159 |
| hadur2.Hadur 3.18o2oeow | 2.0 | 17.6% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.3% | 10 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 6 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 1 |
| tj.zombie1n 1.0.1 | 7.2 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.3 | 5.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.8% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 82.2 | 5 / 35 | 5103 |
| 2 | 2 | 67.9 | 83.5 | 6 / 35 | 5750 |
| 3 | 2 | 68.1 | 86.0 | 4 / 35 | 5613 |
| 4 | 2 | 68.2 | 85.4 | 4 / 35 | 5567 |
| 5 | 2 | 68.5 | 87.3 | 5 / 35 | 5602 |
| 6 | 2 | 69.6 | 88.6 | 11 / 35 | 6154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 117 | 11% |
| TNT.TNT 0.99.1 | 13 | 77% |
| apc.LeeroyJenkins2 1.0 | 8 | 63% |
| josago.Jorgito 0.16 | 5 | 100% |
| css.Delitioner 0.11 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1213. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 69% | 139 |
| apc.LeeroyJenkins2 1.0 | 27 | 15% | 31 |
| TNT.TNT 0.99.1 | 11 | 6% | 22 |
| josago.Jorgito 0.16 | 10 | 6% | 13 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 187982 melee ticks, 65157 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 354 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 128 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 58248 sent, 53373 reached their opponent, 8017 virtual hits (15.0% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 503 over 6 battles (83.8 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.0 | 26 / 210 | 3.25 | 14.5% | 23179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.6% | 115 |
| justin.DemonicRage 3.4 | 2.0 | 17.2% | 59 |
| hadur2.Hadur 3.18o2oeow | 3.0 | 14.5% | 26 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 9 |
| axeBots.HataMoto 3.09 | 5.2 | 8.9% | 1 |
| ms.Ares 0.19 | 5.8 | 8.6% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 6.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 79.0 | 4 / 35 | 4272 |
| 2 | 3 | 61.7 | 71.4 | 5 / 35 | 3503 |
| 3 | 3 | 64.0 | 76.8 | 5 / 35 | 4101 |
| 4 | 3 | 63.8 | 76.8 | 4 / 35 | 4076 |
| 5 | 3 | 63.7 | 75.9 | 6 / 35 | 3875 |
| 6 | 3 | 60.5 | 70.2 | 2 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 33 | 3% |
| justin.DemonicRage 3.4 | 31 | 35% |
| wompi.Numbat 2.1 | 13 | 77% |
| ms.Ares 0.19 | 3 | 100% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 188 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 71 | 38% | 79 |
| cb.fire.Firestarter 2.0f | 60 | 32% | 64 |
| wompi.Numbat 2.1 | 28 | 15% | 37 |
| ms.Ares 0.19 | 11 | 6% | 14 |
| axeBots.HataMoto 3.09 | 7 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146038 melee ticks, 33854 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 61 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45770 sent, 40706 reached their opponent, 6696 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 340 over 6 battles (56.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.4 | 123 / 210 | 2.14 | 19.2% | 32389 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.2% | 123 |
| jekl.StoneGhost 0.7 | 2.0 | 15.0% | 32 |
| origin.SleepSiphon 1.7b | 3.2 | 13.5% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.2% | 10 |
| mld.Wisdom 1.0 | 5.2 | 10.0% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.7% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 7.0 | 6.7% | 4 |
| DBall.NUKE 0.1 | 8.2 | 6.2% | 0 |
| spinnercat.Omen 1.0 | 8.8 | 5.8% | 1 |
| sample.Fire 1.0 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.0 | 22 / 35 | 5417 |
| 2 | 1 | 70.1 | 90.2 | 23 / 35 | 5530 |
| 3 | 1 | 68.7 | 84.4 | 19 / 35 | 5302 |
| 4 | 1 | 68.8 | 86.3 | 19 / 35 | 5204 |
| 5 | 1 | 69.2 | 87.6 | 19 / 35 | 5327 |
| 6 | 1 | 70.2 | 88.6 | 21 / 35 | 5609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 62 | 82% |
| origin.SleepSiphon 1.7b | 40 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 93% |
| gg.Wolverine 2.0 | 6 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 60% |
| mld.Wisdom 1.0 | 4 | 75% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 31 | 34% | 70 |
| origin.SleepSiphon 1.7b | 30 | 33% | 68 |
| mld.Wisdom 1.0 | 11 | 12% | 15 |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 8% | 36 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 9 |
| DBall.NUKE 0.1 | 2 | 2% | 2 |
| gg.Wolverine 2.0 | 1 | 1% | 8 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 147093 melee ticks, 36079 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 39 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45379 sent, 40705 reached their opponent, 8986 virtual hits (22.1% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 522 over 6 battles (87.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.5 | 110 / 210 | 1.67 | 20.6% | 39692 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.6% | 110 |
| rtk.Tachikoma 1.0 | 2.5 | 16.2% | 34 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.9% | 40 |
| franzor.Lizt 1.3.1 | 4.3 | 11.2% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.8% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.9 | 93.3 | 22 / 35 | 6794 |
| 2 | 1 | 72.8 | 93.3 | 19 / 35 | 6764 |
| 3 | 1 | 71.7 | 90.2 | 16 / 35 | 6700 |
| 4 | 1 | 72.6 | 93.7 | 21 / 35 | 6466 |
| 5 | 1 | 71.7 | 92.1 | 15 / 35 | 6470 |
| 6 | 1 | 72.0 | 92.7 | 17 / 35 | 6498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 83 | 71% |
| rsalesc.melee.Monk 0.3.6c | 44 | 27% |
| franzor.Lizt 1.3.1 | 31 | 65% |
| oog.melee.CapuletDroid 1.1 | 25 | 72% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1393. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 41% | 75 |
| rtk.Tachikoma 1.0 | 36 | 35% | 94 |
| franzor.Lizt 1.3.1 | 12 | 12% | 0 |
| oog.melee.CapuletDroid 1.1 | 8 | 8% | 37 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 179267 melee ticks, 89961 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 38 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 54606 sent, 49865 reached their opponent, 10172 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 634 over 6 battles (105.7 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.4 | 134 / 210 | 1.95 | 19.4% | 29970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.4% | 134 |
| tm.Yuugao 1.0 | 2.5 | 13.1% | 37 |
| shrub.Vapour v159 | 3.0 | 12.4% | 19 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.5% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.9% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.4% | 4 |
| m3thos.Eva00 1.1 | 6.3 | 8.7% | 0 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.7% | 0 |
| SHAM.WOW 1.4 | 9.2 | 5.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.8 | 24 / 35 | 5487 |
| 2 | 1 | 69.6 | 91.7 | 22 / 35 | 5186 |
| 3 | 1 | 69.6 | 91.1 | 24 / 35 | 4775 |
| 4 | 1 | 68.4 | 87.9 | 22 / 35 | 4643 |
| 5 | 1 | 68.2 | 85.7 | 18 / 35 | 4925 |
| 6 | 1 | 69.3 | 90.2 | 24 / 35 | 4954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 70% |
| Krabb.sliNk.Garm 0.9u | 40 | 85% |
| shrub.Vapour v159 | 36 | 75% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 94% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 88% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 35% | 79 |
| Krabb.sliNk.Garm 0.9u | 16 | 20% | 38 |
| shrub.Vapour v159 | 12 | 15% | 40 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 10% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 7% | 15 |
| m3thos.Eva00 1.1 | 4 | 5% | 7 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 4 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 144618 melee ticks, 45070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 47591 sent, 42695 reached their opponent, 7563 virtual hits (17.7% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 742 over 6 battles (123.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 72.5 | 52 / 210 | 3.48 | 14.7% | 21752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 16.9% | 96 |
| hadur2.Hadur 3.18o2oeow | 2.2 | 14.7% | 52 |
| kc.micro.Figment 1.0 | 2.8 | 13.7% | 24 |
| yagami.Tidus 0.11 | 4.7 | 10.6% | 5 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.1% | 13 |
| mc2.enemy.Original 0.9 | 5.2 | 10.1% | 16 |
| dft.Calliope 5.6 | 7.0 | 8.2% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.1 | 68.9 | 6 / 35 | 3142 |
| 2 | 2 | 63.2 | 74.0 | 11 / 35 | 3786 |
| 3 | 2 | 61.1 | 68.9 | 8 / 35 | 3702 |
| 4 | 2 | 64.1 | 76.5 | 14 / 35 | 3755 |
| 5 | 2 | 63.1 | 74.3 | 7 / 35 | 3895 |
| 6 | 2 | 61.7 | 72.4 | 6 / 35 | 3472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 37 | 35% |
| kc.micro.Figment 1.0 | 27 | 89% |
| mc2.enemy.Original 0.9 | 9 | 56% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| yagami.Tidus 0.11 | 5 | 80% |
| dft.Calliope 5.6 | 3 | 33% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 35% | 69 |
| kc.micro.Figment 1.0 | 27 | 16% | 52 |
| yagami.Tidus 0.11 | 19 | 12% | 25 |
| mc2.enemy.Original 0.9 | 17 | 10% | 24 |
| pedersen.Grishnakh 1.0 | 16 | 10% | 18 |
| dft.Calliope 5.6 | 8 | 5% | 9 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 4 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 135632 melee ticks, 33764 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 33 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45233 sent, 40482 reached their opponent, 5667 virtual hits (14.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 500 over 6 battles (83.3 per battle, most in one battle 151). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.4 | 158 / 210 | 1.50 | 20.7% | 35295 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.7% | 158 |
| DTF.Kludgy 1.2b | 2.5 | 14.2% | 24 |
| ne.Chimera 1.2 | 3.0 | 12.6% | 7 |
| ejb.Polaris 1.0.1 | 3.5 | 12.3% | 14 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 0 |
| vStar.RAFzilla 2.15 | 5.5 | 10.4% | 7 |
| sam.Samspin 1.0 | 7.5 | 5.6% | 0 |
| kurios.DOSexe .9b | 7.7 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.2 | 4.6% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.6 | 25 / 35 | 6237 |
| 2 | 1 | 70.9 | 94.0 | 27 / 35 | 5611 |
| 3 | 1 | 70.6 | 91.7 | 24 / 35 | 5997 |
| 4 | 1 | 71.5 | 95.2 | 26 / 35 | 5940 |
| 5 | 1 | 71.5 | 95.6 | 29 / 35 | 5881 |
| 6 | 1 | 71.2 | 95.2 | 27 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 57 | 82% |
| ejb.Polaris 1.0.1 | 41 | 88% |
| ne.Chimera 1.2 | 31 | 87% |
| vStar.RAFzilla 2.15 | 23 | 91% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 24 | 44% | 65 |
| ne.Chimera 1.2 | 13 | 24% | 37 |
| ejb.Polaris 1.0.1 | 10 | 18% | 54 |
| vStar.RAFzilla 2.15 | 2 | 4% | 23 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 14 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 147350 melee ticks, 51136 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 47354 sent, 42625 reached their opponent, 8171 virtual hits (19.2% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 462 over 6 battles (77.0 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 77.6 | 54 / 210 | 3.01 | 15.6% | 23315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 16.4% | 75 |
| hadur2.Hadur 3.18o2oeow | 1.8 | 15.6% | 54 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.2% | 19 |
| djc.DynaBot 0.1.1 | 4.2 | 11.0% | 14 |
| rdt199.Warlord 0.73 | 5.3 | 9.7% | 19 |
| br2.MobyDickBot 1.6 | 5.5 | 9.3% | 13 |
| uji.YellohFellah 1.0 | 7.2 | 8.1% | 13 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.6% | 3 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 77.5 | 8 / 35 | 3946 |
| 2 | 1 | 64.0 | 79.7 | 11 / 35 | 3769 |
| 3 | 2 | 62.0 | 74.3 | 7 / 35 | 3733 |
| 4 | 2 | 64.3 | 78.1 | 8 / 35 | 4164 |
| 5 | 2 | 63.7 | 77.1 | 10 / 35 | 3925 |
| 6 | 2 | 63.8 | 79.0 | 10 / 35 | 3778 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 41 | 46% |
| djc.DynaBot 0.1.1 | 17 | 59% |
| uji.YellohFellah 1.0 | 12 | 83% |
| cx.mini.Nimrod 0.55 | 12 | 42% |
| rdt199.Warlord 0.73 | 10 | 40% |
| br2.MobyDickBot 1.6 | 8 | 63% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 61 | 38% | 81 |
| djc.DynaBot 0.1.1 | 25 | 16% | 33 |
| cx.mini.Nimrod 0.55 | 24 | 15% | 29 |
| rdt199.Warlord 0.73 | 19 | 12% | 23 |
| uji.YellohFellah 1.0 | 10 | 6% | 19 |
| br2.MobyDickBot 1.6 | 7 | 4% | 12 |
| KiraNL.Chupacabra 0.4 | 5 | 3% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 151784 melee ticks, 28929 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 55 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 50149 sent, 45290 reached their opponent, 6272 virtual hits (13.8% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 6 battles (80.2 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.3 | 108 / 210 | 2.59 | 17.4% | 24321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 17.4% | 108 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.3% | 28 |
| nat.PallasHawk 1.0 | 3.0 | 12.9% | 26 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 30 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.7% | 13 |
| jrm.Test0 1.0 | 6.0 | 8.9% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.6% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.2% | 0 |
| stuff.Vlad 0.1 | 8.5 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 25 / 35 | 4412 |
| 2 | 1 | 66.4 | 83.8 | 16 / 35 | 4054 |
| 3 | 1 | 63.1 | 74.9 | 12 / 35 | 3680 |
| 4 | 1 | 69.0 | 87.6 | 23 / 35 | 4650 |
| 5 | 1 | 64.7 | 77.5 | 17 / 35 | 3732 |
| 6 | 1 | 64.9 | 80.0 | 15 / 35 | 3793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 40 | 78% |
| bts.wiki.RipCurl 0.9b | 39 | 79% |
| darkcanuck.Leon 1.01 | 34 | 74% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 4 | 75% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jrm.Test0 1.0 | 23 | 22% | 32 |
| darkcanuck.Leon 1.01 | 20 | 19% | 48 |
| nat.PallasHawk 1.0 | 20 | 19% | 45 |
| bts.wiki.RipCurl 0.9b | 18 | 17% | 45 |
| brainfade.melee.Genghis 0.36 | 13 | 12% | 17 |
| stuff.Vlad 0.1 | 4 | 4% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 7 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 123170 melee ticks, 34818 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 42393 sent, 37529 reached their opponent, 6209 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 6 battles (18.0 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.0 | 43 / 210 | 2.80 | 15.6% | 25650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.4% | 85 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 42 |
| hadur2.Hadur 3.18o2oeow | 2.3 | 15.6% | 43 |
| shinh.Entangled 0.3 | 4.0 | 12.5% | 28 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 82.2 | 4 / 35 | 4124 |
| 2 | 2 | 65.8 | 83.8 | 7 / 35 | 4343 |
| 3 | 3 | 64.0 | 76.2 | 6 / 35 | 4426 |
| 4 | 2 | 65.2 | 80.3 | 10 / 35 | 4348 |
| 5 | 2 | 63.5 | 77.1 | 10 / 35 | 3994 |
| 6 | 2 | 65.0 | 80.3 | 6 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 44 | 52% |
| mn.Combat 3.25.0 | 44 | 18% |
| shinh.Entangled 0.3 | 18 | 44% |
| gh.micro.Gruweltje 0.7 | 4 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 65 | 39% | 75 |
| ags.Glacier 0.2.11 | 50 | 30% | 72 |
| shinh.Entangled 0.3 | 26 | 16% | 30 |
| gh.micro.Gruweltje 0.7 | 14 | 8% | 18 |
| apc.Colossus2 0.17 | 6 | 4% | 7 |
| stelo.Wang 1.0 | 3 | 2% | 5 |
| maribo.FollowFire 1 | 3 | 2% | 3 |

Posture (Hadur's M records, 203 rounds): 140624 melee ticks, 38141 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 70 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 41642 sent, 36715 reached their opponent, 5949 virtual hits (16.2% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 164 over 6 battles (27.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.8 | 167 / 210 | 1.47 | 21.1% | 35830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 21.1% | 167 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 11 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.8% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 9.5% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.0% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.0 | 8.0% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.0 | 8.1% | 0 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.3 | 26 / 35 | 5698 |
| 2 | 1 | 71.2 | 93.0 | 25 / 35 | 5822 |
| 3 | 1 | 72.6 | 95.2 | 29 / 35 | 6379 |
| 4 | 1 | 72.4 | 96.5 | 28 / 35 | 6136 |
| 5 | 1 | 72.7 | 98.4 | 32 / 35 | 6015 |
| 6 | 1 | 70.9 | 92.1 | 27 / 35 | 5780 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 97% |
| catcat20.shape.Theta 0.018 | 62 | 74% |
| co.edu.usb.rc.LidisTron 1.0 | 13 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 77% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| Lo_Ian.Gandalf_V4 4.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 19 | 44% | 56 |
| simonton.micro.Sprout 1.1.3 | 13 | 30% | 85 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 9% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 9% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 9 |
| pa.Improved 1.0 | 0 | 0% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 2 |

Posture (Hadur's M records, 199 rounds): 135035 melee ticks, 52902 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 40 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 42919 sent, 38296 reached their opponent, 9264 virtual hits (24.2% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 516 over 6 battles (86.0 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.4 | 96 / 210 | 2.40 | 18.2% | 30820 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 18.2% | 96 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.4% | 15 |
| emp.Yngwie 1.11 | 3.2 | 13.0% | 57 |
| mld.DustBunny 3.8 | 3.3 | 12.9% | 19 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.8% | 6 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.1% | 16 |
| lambdaxy.TBot 0.1 | 7.2 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 5.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.9 | 17 / 35 | 5315 |
| 2 | 1 | 68.8 | 87.3 | 18 / 35 | 5326 |
| 3 | 1 | 68.0 | 84.4 | 19 / 35 | 4986 |
| 4 | 1 | 66.5 | 81.0 | 14 / 35 | 5084 |
| 5 | 1 | 67.7 | 85.7 | 16 / 35 | 5060 |
| 6 | 1 | 67.4 | 85.4 | 12 / 35 | 5049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 45 | 44% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| mld.DustBunny 3.8 | 23 | 87% |
| kawigi.robot.Girl 1.2 | 15 | 73% |
| cb.nano.Insomnia 1.0 | 10 | 90% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 39% | 75 |
| mld.DustBunny 3.8 | 23 | 20% | 45 |
| cb.nano.Insomnia 1.0 | 12 | 10% | 18 |
| kawigi.robot.Girl 1.2 | 11 | 9% | 17 |
| kawigi.micro.Shiz 1.1 | 10 | 9% | 30 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 7 |
| divineomega.TrialBot 0.003 | 4 | 3% | 13 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 159133 melee ticks, 40813 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 54 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 51272 sent, 46633 reached their opponent, 7583 virtual hits (16.3% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 366 over 6 battles (61.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.3 | 102 / 210 | 2.41 | 18.6% | 33249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.2 | 18.6% | 102 |
| gh.Griezel 0.5.2 | 1.8 | 16.3% | 50 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.0% | 36 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.5% | 5 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.0% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.0% | 3 |
| repositorio.NanoStep 1.0 | 9.0 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.0 | 17 / 35 | 5590 |
| 2 | 1 | 69.8 | 88.3 | 19 / 35 | 5744 |
| 3 | 1 | 67.7 | 80.3 | 17 / 35 | 5036 |
| 4 | 1 | 69.3 | 85.7 | 16 / 35 | 5913 |
| 5 | 2 | 66.3 | 78.1 | 14 / 35 | 5135 |
| 6 | 1 | 70.1 | 87.6 | 19 / 35 | 5831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 75% |
| techdude.forest.FlamingForest 1.1 | 30 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 73% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| bvh.fnr.Fenrir 0.36l | 5 | 80% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 38 | 34% | 89 |
| techdude.forest.FlamingForest 1.1 | 19 | 17% | 37 |
| bvh.fnr.Fenrir 0.36l | 18 | 16% | 21 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 15% | 30 |
| stelo.IntrinsicVolatility 1.4 | 7 | 6% | 11 |
| divineomega.DivineBot 1.9.4.5 | 4 | 4% | 9 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 9 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 165615 melee ticks, 55703 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 45 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 45 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 54023 sent, 49326 reached their opponent, 8539 virtual hits (17.3% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 500 over 6 battles (83.3 per battle, most in one battle 152). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.0 | 82 / 210 | 2.62 | 17.9% | 33320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 17.9% | 82 |
| et.Predator 1.8 | 2.7 | 13.0% | 22 |
| cx.BlestPain 1.41 | 3.2 | 13.2% | 52 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.2% | 31 |
| ahf.NanoAndrew .4 | 4.8 | 11.2% | 13 |
| nic.Nicator 2.4 | 6.2 | 9.4% | 5 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.8% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 77.1 | 10 / 35 | 5263 |
| 2 | 1 | 68.3 | 83.2 | 17 / 35 | 5802 |
| 3 | 1 | 67.9 | 84.4 | 14 / 35 | 5333 |
| 4 | 1 | 67.3 | 80.0 | 13 / 35 | 5772 |
| 5 | 1 | 67.3 | 82.2 | 13 / 35 | 5420 |
| 6 | 1 | 68.6 | 84.8 | 15 / 35 | 5730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 79% |
| cx.BlestPain 1.41 | 34 | 24% |
| oog.melee.Mercutio 1.0 | 30 | 63% |
| ahf.NanoAndrew .4 | 13 | 77% |
| nic.Nicator 2.4 | 9 | 89% |
| maribo.melee.BMV 0.1 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 41 | 31% | 50 |
| et.Predator 1.8 | 27 | 20% | 55 |
| ahf.NanoAndrew .4 | 22 | 17% | 34 |
| oog.melee.Mercutio 1.0 | 19 | 14% | 41 |
| maribo.melee.BMV 0.1 | 9 | 7% | 11 |
| nic.Nicator 2.4 | 6 | 5% | 12 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 151492 melee ticks, 55097 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 49 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 51006 sent, 46257 reached their opponent, 10084 virtual hits (21.8% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 814 over 6 battles (135.7 per battle, most in one battle 165). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 136 / 210 | 1.94 | 19.5% | 29768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.5% | 136 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.0% | 30 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.8% | 17 |
| uji.DBH 1.1 | 4.0 | 11.0% | 9 |
| sigterm.Sigterm 1.0 | 5.8 | 8.9% | 6 |
| ratosh.Nobo 0.21 | 6.2 | 8.5% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 7.2 | 7.6% | 2 |
| spinnercat.Robovirus 2.718 | 7.5 | 7.9% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.0 | 5.4% | 1 |
| stelo.WangRobot 1.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.7 | 28 / 35 | 5263 |
| 2 | 1 | 69.1 | 87.6 | 22 / 35 | 4904 |
| 3 | 1 | 68.1 | 86.3 | 21 / 35 | 4810 |
| 4 | 1 | 68.2 | 87.9 | 20 / 35 | 4779 |
| 5 | 1 | 69.5 | 90.8 | 23 / 35 | 4781 |
| 6 | 1 | 69.9 | 92.1 | 22 / 35 | 5231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 80% |
| uji.DBH 1.1 | 30 | 87% |
| sigterm.Sigterm 1.0 | 25 | 92% |
| agd.Mooserwirt2 2.7 | 23 | 74% |
| stelo.WangRobot 1.0 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| ratosh.Nobo 0.21 | 5 | 80% |
| spinnercat.Robovirus 2.718 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 30% | 72 |
| agd.Mooserwirt2 2.7 | 18 | 23% | 44 |
| uji.DBH 1.1 | 9 | 11% | 23 |
| ratosh.Nobo 0.21 | 6 | 8% | 14 |
| sigterm.Sigterm 1.0 | 5 | 6% | 19 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 13 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 8 |
| stelo.WangRobot 1.0 | 2 | 3% | 8 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 136675 melee ticks, 42573 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 121 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 121 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 4.

Targeting waves (204 rounds): 46101 sent, 41250 reached their opponent, 9092 virtual hits (22.0% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 747 over 6 battles (124.5 per battle, most in one battle 153). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 97.2 | 190 / 210 | 1.25 | 22.3% | 37726 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 22.3% | 190 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 10 |
| mld.Infinity 2.2 | 3.2 | 12.1% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.6% | 4 |
| erdnis.Rover 0.3 | 5.0 | 10.1% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.4% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.1 | 97.1 | 34 / 35 | 6831 |
| 2 | 1 | 73.4 | 98.4 | 31 / 35 | 6235 |
| 3 | 1 | 73.3 | 97.8 | 33 / 35 | 6197 |
| 4 | 1 | 72.5 | 95.6 | 29 / 35 | 5940 |
| 5 | 1 | 73.5 | 96.8 | 33 / 35 | 6373 |
| 6 | 1 | 73.1 | 97.5 | 30 / 35 | 6150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 118 | 95% |
| mld.Infinity 2.2 | 25 | 100% |
| krillr.mini.JointStrike 2.0.0 | 23 | 91% |
| erdnis.Rover 0.3 | 12 | 92% |
| pac.ABC 2.1 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 33% | 72 |
| krillr.mini.JointStrike 2.0.0 | 6 | 22% | 40 |
| erdnis.Rover 0.3 | 2 | 7% | 24 |
| mld.Infinity 2.2 | 1 | 4% | 27 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 20 |
| pac.ABC 2.1 | 1 | 4% | 12 |
| pbg.R2D2 1.0 | 1 | 4% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 129562 melee ticks, 45521 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 43165 sent, 38523 reached their opponent, 8953 virtual hits (23.2% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 758 over 6 battles (126.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 89.7 | 136 / 210 | 1.93 | 20.5% | 36427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.5% | 136 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 39 |
| fwb.Nine 1.0.1 | 3.7 | 11.6% | 11 |
| catcat20.Rabbit 0.001 | 4.0 | 11.0% | 21 |
| nz.jdc.nano.GridFu 1.0 | 4.3 | 10.5% | 0 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.2% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 6.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 5.9% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.3 | 23 / 35 | 5848 |
| 2 | 1 | 69.5 | 86.7 | 22 / 35 | 5477 |
| 3 | 1 | 70.5 | 88.6 | 21 / 35 | 5942 |
| 4 | 1 | 72.2 | 92.4 | 23 / 35 | 6683 |
| 5 | 1 | 71.5 | 91.4 | 24 / 35 | 6210 |
| 6 | 1 | 71.6 | 92.7 | 23 / 35 | 6267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 84 | 83% |
| fwb.Nine 1.0.1 | 33 | 88% |
| catcat20.Rabbit 0.001 | 28 | 75% |
| m3thos.mini.Eva01 0.5.5 | 7 | 100% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 54% | 114 |
| fwb.Nine 1.0.1 | 13 | 16% | 22 |
| catcat20.Rabbit 0.001 | 8 | 10% | 35 |
| bayen.nut.Squirrel 1.615 | 6 | 8% | 9 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 4 |
| nz.jdc.nano.GridFu 1.0 | 1 | 1% | 14 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 163002 melee ticks, 50249 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50748 sent, 45874 reached their opponent, 10258 virtual hits (22.4% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 592 over 6 battles (98.7 per battle, most in one battle 228). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.2 | 124 / 210 | 1.79 | 20.3% | 34927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.3% | 124 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 65 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.8% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 3 |
| eld.Hmm 1.0 | 4.8 | 8.8% | 7 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.6% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.1 | 20 / 35 | 5721 |
| 2 | 1 | 72.3 | 94.0 | 24 / 35 | 6514 |
| 3 | 1 | 70.8 | 90.5 | 18 / 35 | 5924 |
| 4 | 1 | 69.4 | 87.9 | 18 / 35 | 5328 |
| 5 | 1 | 71.5 | 91.4 | 22 / 35 | 6152 |
| 6 | 1 | 70.2 | 91.4 | 22 / 35 | 5288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 122 | 70% |
| dummy.mini.Scimitar 1.01 | 23 | 87% |
| cf.RiO.RiOx 4.2.1 | 14 | 100% |
| eld.Hmm 1.0 | 8 | 50% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1208. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 50 | 55% | 118 |
| dummy.mini.Scimitar 1.01 | 23 | 25% | 56 |
| eld.Hmm 1.0 | 7 | 8% | 15 |
| cf.RiO.RiOx 4.2.1 | 3 | 3% | 14 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 179809 melee ticks, 83067 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 81 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 52826 sent, 48110 reached their opponent, 8236 virtual hits (17.1% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 531 over 6 battles (88.5 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.6 | 88 / 210 | 2.20 | 18.2% | 30042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 18.2% | 88 |
| pe.SandboxDT 2.71m | 2.0 | 16.5% | 61 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.2% | 30 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.2% | 24 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 6 |
| tad.Dalek98 0.98 | 7.0 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 7.0% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.1 | 13 / 35 | 4794 |
| 2 | 1 | 68.7 | 88.9 | 16 / 35 | 4944 |
| 3 | 1 | 69.2 | 86.7 | 17 / 35 | 5287 |
| 4 | 1 | 68.5 | 85.7 | 15 / 35 | 5078 |
| 5 | 1 | 68.2 | 83.8 | 13 / 35 | 5190 |
| 6 | 1 | 68.7 | 89.5 | 14 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 63 | 40% |
| jlm.javaDisturbance 0.59 | 39 | 72% |
| kvk.HebusLeTroll 0.35 | 28 | 68% |
| bigpete.Stewie 1.0 | 14 | 86% |
| yk.JahRoslav 1.1 | 4 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 60 | 48% | 90 |
| kvk.HebusLeTroll 0.35 | 31 | 25% | 46 |
| jlm.javaDisturbance 0.59 | 20 | 16% | 43 |
| bigpete.Stewie 1.0 | 6 | 5% | 16 |
| pbg.NinjaX 1.2 | 2 | 2% | 4 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 158429 melee ticks, 47476 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 50837 sent, 46067 reached their opponent, 7208 virtual hits (15.6% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 502 over 6 battles (83.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 93.7 | 160 / 210 | 1.57 | 21.4% | 37793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 21.4% | 160 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 41 |
| cre.Karolos 0.32 | 3.0 | 12.7% | 3 |
| stelo.RamTrackSurfer 1.2 | 4.5 | 9.7% | 2 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.8% | 2 |
| cw.megas.Blade 0.8 | 5.8 | 9.0% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.5% | 1 |
| sample.Walls 1.0 | 8.0 | 7.2% | 1 |
| cli.WasteOfAmmo 1.0 | 9.3 | 2.6% | 0 |
| rrh.Iwillfindyou 2.0 | 9.7 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 92.1 | 26 / 35 | 6606 |
| 2 | 1 | 71.7 | 91.4 | 25 / 35 | 5965 |
| 3 | 1 | 73.4 | 99.0 | 32 / 35 | 6193 |
| 4 | 1 | 72.4 | 91.7 | 26 / 35 | 6156 |
| 5 | 1 | 73.2 | 95.6 | 26 / 35 | 6483 |
| 6 | 1 | 72.1 | 92.1 | 25 / 35 | 6390 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 107 | 79% |
| cre.Karolos 0.32 | 41 | 98% |
| stelo.RamTrackSurfer 1.2 | 17 | 94% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 67% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 29 | 53% | 102 |
| cre.Karolos 0.32 | 11 | 20% | 48 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 9% | 11 |
| cw.megas.Blade 0.8 | 3 | 5% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 23 |
| stelo.AreaTargetingBot 1.1 | 1 | 2% | 11 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 122495 melee ticks, 51044 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 81 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 81 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 38643 sent, 33989 reached their opponent, 10061 virtual hits (29.6% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 460 over 6 battles (76.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.0 | 62 / 210 | 2.89 | 16.1% | 24499 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.2 | 16.1% | 62 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.8% | 44 |
| davidalves.Phoenix 0.54 | 3.2 | 13.5% | 43 |
| florent.XSeries.X2 0.12 | 3.8 | 13.0% | 30 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.1% | 23 |
| oog.melee.Corsair 1.0 | 6.0 | 9.8% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.7 | 6.2% | 5 |
| lunchie.Lunchbox 0.93 | 8.2 | 5.5% | 0 |
| as.FrankTheTank 1.3 | 8.5 | 5.4% | 1 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 81.3 | 9 / 35 | 3953 |
| 2 | 1 | 62.8 | 74.6 | 10 / 35 | 3610 |
| 3 | 2 | 62.5 | 74.6 | 6 / 35 | 3765 |
| 4 | 1 | 63.2 | 74.9 | 10 / 35 | 3870 |
| 5 | 1 | 66.2 | 81.9 | 11 / 35 | 4565 |
| 6 | 1 | 67.8 | 86.7 | 16 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 53% |
| florent.XSeries.X2 0.12 | 26 | 50% |
| davidalves.Phoenix 0.54 | 23 | 39% |
| pedersen.Ugluk 1.1.1 | 18 | 44% |
| oog.melee.Corsair 1.0 | 7 | 100% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 25% | 53 |
| davidalves.Phoenix 0.54 | 34 | 22% | 47 |
| florent.XSeries.X2 0.12 | 30 | 20% | 43 |
| pedersen.Ugluk 1.1.1 | 26 | 17% | 32 |
| oog.melee.Corsair 1.0 | 10 | 7% | 18 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 9 |
| evd.X1 0.01 | 4 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 135999 melee ticks, 31623 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 38 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 45201 sent, 40090 reached their opponent, 6985 virtual hits (17.4% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 329 over 6 battles (54.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.8 | 112 / 210 | 2.46 | 17.7% | 24234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 17.7% | 112 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 19 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.3% | 22 |
| jdw.Hurricane 1.4 | 3.5 | 12.2% | 25 |
| ds.Oo 2.2 | 5.2 | 9.7% | 12 |
| gre.svman4.Morfeas 1.4.1 | 6.2 | 8.7% | 10 |
| awesomeness.Elite 1.0 | 7.7 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.0 | 6.4% | 3 |
| gjr.Cephalosporin 0.1 | 8.2 | 6.5% | 4 |
| amk.ChumbaMini 0.2 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.0 | 18 / 35 | 4049 |
| 2 | 1 | 67.3 | 86.0 | 19 / 35 | 4071 |
| 3 | 1 | 66.0 | 81.3 | 16 / 35 | 4068 |
| 4 | 1 | 66.8 | 86.3 | 20 / 35 | 3960 |
| 5 | 1 | 66.4 | 81.3 | 18 / 35 | 4112 |
| 6 | 1 | 68.0 | 87.6 | 21 / 35 | 3974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 41 | 83% |
| voidious.micro.BlitzBat 1.05 | 39 | 87% |
| jdw.Hurricane 1.4 | 28 | 75% |
| ds.Oo 2.2 | 18 | 72% |
| gre.svman4.Morfeas 1.4.1 | 6 | 33% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 75% |
| amk.ChumbaMini 0.2 | 2 | 50% |

Hadur died in 101 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 22% | 41 |
| jdw.Hurricane 1.4 | 21 | 21% | 36 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 19% | 54 |
| ds.Oo 2.2 | 11 | 11% | 29 |
| gre.svman4.Morfeas 1.4.1 | 6 | 6% | 12 |
| adt.Ar2 1.1 | 6 | 6% | 8 |
| amk.ChumbaMini 0.2 | 6 | 6% | 8 |
| awesomeness.Elite 1.0 | 5 | 5% | 13 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 9 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 126950 melee ticks, 24866 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 378 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 210 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 44750 sent, 39814 reached their opponent, 6688 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.4 | 138 / 210 | 1.69 | 20.8% | 38999 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.8% | 138 |
| ak.Fermat 2.0 | 2.2 | 14.6% | 33 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 10 |
| shu.nitro.LENIN .T34 | 3.7 | 11.9% | 19 |
| js.PinBall 1.6 | 5.2 | 10.1% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.6% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.2% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 89.5 | 21 / 35 | 6136 |
| 2 | 1 | 71.5 | 93.7 | 23 / 35 | 6129 |
| 3 | 1 | 72.0 | 93.0 | 24 / 35 | 6633 |
| 4 | 1 | 72.1 | 92.7 | 23 / 35 | 6806 |
| 5 | 1 | 71.4 | 90.8 | 23 / 35 | 6516 |
| 6 | 1 | 72.6 | 94.6 | 24 / 35 | 6779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 65 | 72% |
| lrem.Spectre 0.4.4 | 41 | 88% |
| shu.nitro.LENIN .T34 | 38 | 84% |
| js.PinBall 1.6 | 12 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| gh.mini.GrubbmOne 1.0 | 2 | 50% |

Hadur died in 73 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 31 | 42% | 65 |
| lrem.Spectre 0.4.4 | 16 | 22% | 47 |
| shu.nitro.LENIN .T34 | 15 | 21% | 55 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 15 |
| js.PinBall 1.6 | 3 | 4% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 206 rounds): 159308 melee ticks, 46149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51307 sent, 46378 reached their opponent, 11513 virtual hits (24.8% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 603 over 6 battles (100.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.8 | 156 / 210 | 1.74 | 20.7% | 33939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.7% | 156 |
| mk.Alpha 0.2.1 | 2.0 | 14.0% | 33 |
| EH.Eagle 1.0.6 | 3.0 | 11.7% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 5.2 | 9.1% | 1 |
| wee.Gem 1.8.4 | 5.3 | 9.0% | 2 |
| throxbot.ThroxBot 0.1 | 5.7 | 8.9% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 6.5 | 8.5% | 4 |
| joe.ADinosaur 1.0 | 8.0 | 7.0% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.5% | 1 |
| cs.Grudge 1.0 | 9.3 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.1 | 24 / 35 | 5411 |
| 2 | 1 | 70.8 | 90.2 | 27 / 35 | 5854 |
| 3 | 1 | 69.6 | 85.1 | 25 / 35 | 5734 |
| 4 | 1 | 72.2 | 95.6 | 27 / 35 | 6087 |
| 5 | 1 | 71.1 | 94.3 | 29 / 35 | 5356 |
| 6 | 1 | 70.8 | 93.7 | 24 / 35 | 5497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 102 | 86% |
| EH.Eagle 1.0.6 | 38 | 92% |
| wee.Gem 1.8.4 | 10 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 5 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 59 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 39% | 98 |
| EH.Eagle 1.0.6 | 7 | 12% | 40 |
| throxbot.ThroxBot 0.1 | 7 | 12% | 13 |
| cs.Grudge 1.0 | 7 | 12% | 8 |
| joe.ADinosaur 1.0 | 4 | 7% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 14 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 3% | 10 |
| wee.Gem 1.8.4 | 1 | 2% | 15 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 133342 melee ticks, 41256 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 90 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 90 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 43076 sent, 38339 reached their opponent, 9081 virtual hits (23.7% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 162 over 6 battles (27.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.7 | 125 / 210 | 2.11 | 18.3% | 24727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 18.3% | 125 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 39 |
| uji.Antique 1.0 | 3.7 | 11.8% | 22 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.7% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 6 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.1% | 2 |
| matt.advanced.Katana 1.0 | 8.5 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.5% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.9 | 20 / 35 | 4361 |
| 2 | 1 | 67.1 | 87.3 | 20 / 35 | 4018 |
| 3 | 1 | 69.3 | 93.0 | 23 / 35 | 4259 |
| 4 | 1 | 67.4 | 86.3 | 20 / 35 | 3977 |
| 5 | 1 | 68.8 | 91.7 | 24 / 35 | 4029 |
| 6 | 1 | 66.8 | 84.8 | 18 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 83% |
| uji.Antique 1.0 | 36 | 83% |
| qohnil.blot.BlotBot 3.61 | 16 | 69% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| ahr.ice.Ice 1.0.2 | 4 | 50% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pfvicm.Sobieski 7.2.3b | 23 | 27% | 31 |
| uji.Antique 1.0 | 22 | 26% | 59 |
| kid.test.NightFox .2 | 20 | 24% | 59 |
| qohnil.blot.BlotBot 3.61 | 7 | 8% | 23 |
| amk.ChumbaWumba 0.3 | 6 | 7% | 10 |
| ahr.ice.Ice 1.0.2 | 4 | 5% | 16 |
| stelo.Lifestealer 1.0 | 2 | 2% | 2 |
| matt.advanced.Katana 1.0 | 1 | 1% | 9 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 127294 melee ticks, 33067 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43023 sent, 38128 reached their opponent, 5445 virtual hits (14.3% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 487 over 6 battles (81.2 per battle, most in one battle 144). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.4 | 91 / 210 | 2.50 | 18.1% | 28158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.2 | 18.1% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.6% | 59 |
| deewiant.Anomaly 0.2 | 2.7 | 14.8% | 42 |
| myl.micro.Troodon 1.10 | 4.0 | 11.9% | 5 |
| jok.PheonixM 0.1.2 | 5.0 | 10.7% | 7 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.4% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.5% | 4 |
| ap.Frederick 1.1 | 8.8 | 4.7% | 2 |
| jangs.ns51 1.0 | 9.3 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 82.9 | 13 / 35 | 4551 |
| 2 | 1 | 68.5 | 84.8 | 16 / 35 | 4858 |
| 3 | 1 | 68.7 | 86.3 | 16 / 35 | 4551 |
| 4 | 1 | 68.2 | 82.9 | 13 / 35 | 4832 |
| 5 | 1 | 68.6 | 84.4 | 18 / 35 | 4669 |
| 6 | 1 | 66.8 | 79.0 | 15 / 35 | 4697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 44 | 70% |
| zyx.mega.YersiniaPestis 3.1 | 40 | 60% |
| myl.micro.Troodon 1.10 | 16 | 94% |
| jok.PheonixM 0.1.2 | 14 | 79% |
| ap.Frederick 1.1 | 6 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 45 | 37% | 81 |
| zyx.mega.YersiniaPestis 3.1 | 44 | 36% | 70 |
| myl.micro.Troodon 1.10 | 18 | 15% | 29 |
| jok.PheonixM 0.1.2 | 7 | 6% | 20 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 4 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 160062 melee ticks, 44511 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 53022 sent, 48175 reached their opponent, 7544 virtual hits (15.7% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 576 over 6 battles (96.0 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 77.2 | 44 / 210 | 3.05 | 15.6% | 25023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.2 | 15.6% | 44 |
| catcat20.Matcha 0.006 | 2.7 | 13.5% | 42 |
| darkcanuck.B26354 1.06 | 3.2 | 13.3% | 52 |
| oog.melee.Capulet 1.2 | 3.8 | 12.4% | 29 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.5% | 18 |
| intruder.PrairieWolf 2.61 | 5.8 | 9.6% | 15 |
| tripphippy.Alice 1.1 | 7.5 | 7.2% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.9% | 9 |
| ntc.Opposite 1.5 | 8.3 | 6.7% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 75.9 | 4 / 35 | 3808 |
| 2 | 1 | 64.6 | 75.9 | 11 / 35 | 4387 |
| 3 | 1 | 64.7 | 79.0 | 9 / 35 | 4110 |
| 4 | 1 | 64.7 | 78.1 | 6 / 35 | 4451 |
| 5 | 1 | 63.5 | 77.5 | 7 / 35 | 4168 |
| 6 | 1 | 63.8 | 77.1 | 7 / 35 | 4099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 36% |
| darkcanuck.B26354 1.06 | 17 | 18% |
| oog.melee.Capulet 1.2 | 16 | 44% |
| stelo.PastFuture 2.3.2 | 15 | 67% |
| intruder.PrairieWolf 2.61 | 14 | 57% |
| tripphippy.Alice 1.1 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 67% |

Hadur died in 171 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 38 | 22% | 47 |
| darkcanuck.B26354 1.06 | 37 | 22% | 45 |
| oog.melee.Capulet 1.2 | 32 | 19% | 36 |
| stelo.PastFuture 2.3.2 | 27 | 16% | 41 |
| intruder.PrairieWolf 2.61 | 15 | 9% | 22 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 6% | 10 |
| tripphippy.Alice 1.1 | 7 | 4% | 8 |
| ntc.Opposite 1.5 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 160335 melee ticks, 26608 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 54 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51291 sent, 46382 reached their opponent, 7717 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 645 over 6 battles (107.5 per battle, most in one battle 137). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.6 | 39 / 210 | 3.29 | 14.6% | 20983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 97 |
| hadur2.Hadur 3.18o2oeow | 2.0 | 14.6% | 39 |
| gh.mini.Griezel 0.2 | 3.0 | 13.6% | 48 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.8% | 13 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.1% | 9 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.8% | 2 |
| fm.mammillarias 1.3 | 8.2 | 6.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.0% | 1 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.4 | 72.1 | 6 / 35 | 3335 |
| 2 | 2 | 62.3 | 74.3 | 7 / 35 | 3427 |
| 3 | 2 | 63.4 | 76.8 | 6 / 35 | 3612 |
| 4 | 2 | 62.9 | 75.2 | 7 / 35 | 3747 |
| 5 | 2 | 61.2 | 74.3 | 6 / 35 | 3028 |
| 6 | 2 | 63.4 | 74.9 | 7 / 35 | 3834 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 31 | 48% |
| gh.mini.Griezel 0.2 | 28 | 39% |
| d414.nano.Quantum 1.0.0 | 11 | 55% |
| spinnercat.micro.Tyger 0.1 | 8 | 50% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 31% | 67 |
| gh.mini.Griezel 0.2 | 43 | 24% | 56 |
| d414.nano.Quantum 1.0.0 | 35 | 20% | 38 |
| spinnercat.micro.Tyger 0.1 | 20 | 11% | 24 |
| timmit.nano.TimDog 0.33 | 6 | 3% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 10 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 145109 melee ticks, 22333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 30 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 3.

Targeting waves (207 rounds): 48001 sent, 42741 reached their opponent, 6856 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 473 over 6 battles (78.8 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.5 | 125 / 210 | 2.04 | 18.6% | 27997 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 18.6% | 125 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.1% | 39 |
| apc.botM 3.0 | 3.0 | 12.3% | 21 |
| lxx.ConceptA 0.8 | 4.2 | 10.8% | 5 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 10 |
| bayen.UbaMicro 1.4 | 5.7 | 8.7% | 4 |
| yk.JahMicro 1.0 | 7.7 | 7.1% | 5 |
| panzer.Panzer 0.2 | 7.7 | 7.0% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.7% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.2 | 21 / 35 | 4863 |
| 2 | 1 | 67.5 | 88.9 | 17 / 35 | 4454 |
| 3 | 1 | 68.8 | 89.8 | 24 / 35 | 4861 |
| 4 | 1 | 69.2 | 93.3 | 24 / 35 | 4672 |
| 5 | 1 | 66.6 | 81.9 | 22 / 35 | 4494 |
| 6 | 1 | 67.0 | 86.7 | 17 / 35 | 4653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 62% |
| apc.botM 3.0 | 40 | 78% |
| vjik.UnViolation 1.1 | 18 | 89% |
| lxx.ConceptA 0.8 | 14 | 86% |
| yk.JahMicro 1.0 | 11 | 82% |
| bayen.UbaMicro 1.4 | 8 | 75% |
| donjezza.Jezza 1.0 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 31 | 34% | 70 |
| apc.botM 3.0 | 18 | 20% | 48 |
| lxx.ConceptA 0.8 | 13 | 14% | 23 |
| bayen.UbaMicro 1.4 | 9 | 10% | 18 |
| vjik.UnViolation 1.1 | 7 | 8% | 26 |
| yk.JahMicro 1.0 | 6 | 7% | 16 |
| donjezza.Jezza 1.0 | 2 | 2% | 3 |
| conscience.Electron 1.3g | 2 | 2% | 3 |
| panzer.Panzer 0.2 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 126641 melee ticks, 49449 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 84 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 84 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 42356 sent, 37559 reached their opponent, 6793 virtual hits (18.1% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 582 over 6 battles (97.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 102 / 210 | 2.47 | 18.2% | 28825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.2 | 18.2% | 102 |
| maribo.Quester 0.3 | 1.8 | 15.7% | 41 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 13.0% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.5% | 16 |
| labg.Cataclysm 2.05 | 4.8 | 10.4% | 20 |
| baal.nano.N 1.42 | 6.3 | 9.1% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.5% | 3 |
| zyx.micro.Ant 1.1 | 8.3 | 5.2% | 2 |
| sanja.First 0.1 | 9.0 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.6 | 17 / 35 | 4944 |
| 2 | 1 | 68.1 | 82.5 | 20 / 35 | 4790 |
| 3 | 2 | 67.0 | 81.6 | 10 / 35 | 4757 |
| 4 | 1 | 68.3 | 84.8 | 16 / 35 | 4841 |
| 5 | 1 | 65.9 | 76.5 | 15 / 35 | 4518 |
| 6 | 1 | 69.9 | 88.9 | 24 / 35 | 4975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 82% |
| gre.svman4.Leonidas 1.3.2 | 22 | 77% |
| labg.Cataclysm 2.05 | 13 | 62% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 80% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 34% | 76 |
| gre.svman4.Leonidas 1.3.2 | 29 | 25% | 41 |
| labg.Cataclysm 2.05 | 14 | 12% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 10% | 35 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 7% | 11 |
| baal.nano.N 1.42 | 4 | 3% | 12 |
| zyx.micro.Ant 1.1 | 3 | 3% | 7 |
| sanja.First 0.1 | 2 | 2% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 164672 melee ticks, 41063 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53503 sent, 48645 reached their opponent, 7197 virtual hits (14.8% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 530 over 6 battles (88.3 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.2 | 77 / 210 | 2.33 | 17.8% | 30385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 17.8% | 77 |
| kid.Gladiator .7.2 | 2.3 | 16.1% | 46 |
| stelo.Spread 0.9 | 2.7 | 16.1% | 59 |
| jcs.Seth 1.8 | 4.3 | 11.7% | 20 |
| tcf.Reach 3 | 4.7 | 10.8% | 7 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.1% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 11 / 35 | 5152 |
| 2 | 1 | 68.4 | 86.7 | 14 / 35 | 4899 |
| 3 | 1 | 69.1 | 85.4 | 16 / 35 | 5416 |
| 4 | 1 | 67.8 | 85.7 | 11 / 35 | 4811 |
| 5 | 1 | 68.5 | 84.4 | 15 / 35 | 5073 |
| 6 | 1 | 67.5 | 83.8 | 10 / 35 | 5034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 61 | 56% |
| stelo.Spread 0.9 | 48 | 60% |
| jcs.Seth 1.8 | 19 | 37% |
| tcf.Reach 3 | 6 | 50% |
| ratosh.Wesco 1.4 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 62 | 45% | 85 |
| stelo.Spread 0.9 | 38 | 28% | 70 |
| jcs.Seth 1.8 | 20 | 15% | 32 |
| tcf.Reach 3 | 8 | 6% | 11 |
| cli.Dancer 1.1 | 3 | 2% | 6 |
| ratosh.Wesco 1.4 | 2 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 169233 melee ticks, 49966 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 40 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 52127 sent, 47323 reached their opponent, 7779 virtual hits (16.4% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 432 over 6 battles (72.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.6 | 46 / 210 | 2.83 | 15.6% | 22738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.8% | 125 |
| hadur2.Hadur 3.18o2oeow | 1.8 | 15.6% | 46 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.9% | 22 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.2% | 13 |
| rz.HawkOnFire 0.1 | 4.5 | 11.8% | 5 |
| wit.Chuliath 1.0 | 6.2 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 1 |
| stelo.MyAgileRobot 0.2 | 8.2 | 5.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.3 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 77.8 | 6 / 35 | 3921 |
| 2 | 2 | 63.4 | 76.5 | 7 / 35 | 3616 |
| 3 | 2 | 63.1 | 76.2 | 8 / 35 | 3749 |
| 4 | 2 | 63.7 | 78.1 | 7 / 35 | 3489 |
| 5 | 2 | 63.9 | 81.0 | 4 / 35 | 3694 |
| 6 | 1 | 67.6 | 88.3 | 14 / 35 | 4269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 65 | 25% |
| gh.mini.Gruwel 0.9 | 18 | 39% |
| rz.HawkOnFire 0.1 | 14 | 93% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 76 | 45% | 95 |
| gh.mini.Gruwel 0.9 | 30 | 18% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 14% | 30 |
| rz.HawkOnFire 0.1 | 21 | 12% | 30 |
| wit.Chuliath 1.0 | 5 | 3% | 7 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 137508 melee ticks, 37615 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 33 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 43288 sent, 38284 reached their opponent, 5907 virtual hits (15.4% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 421 over 6 battles (70.2 per battle, most in one battle 157). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.5 | 137 / 210 | 2.04 | 19.8% | 31665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.8% | 137 |
| alpha.RainingFire 1.0 | 2.7 | 12.5% | 25 |
| bzdp.Pansy 2.1 | 3.0 | 11.8% | 13 |
| mz.Cork 0.1 | 4.3 | 11.2% | 15 |
| bvh.micro.Freya 0.3 | 4.5 | 10.8% | 6 |
| bvh.mini.Fenrir 0.39 | 5.7 | 10.1% | 7 |
| m3thos.Eva02 0.7.1 | 6.8 | 9.1% | 4 |
| dl.BetterWalls 1.0 | 8.3 | 5.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.3 | 21 / 35 | 5058 |
| 2 | 1 | 69.6 | 87.0 | 24 / 35 | 5196 |
| 3 | 1 | 70.9 | 92.4 | 25 / 35 | 5578 |
| 4 | 1 | 68.2 | 83.2 | 20 / 35 | 5118 |
| 5 | 1 | 69.2 | 87.9 | 20 / 35 | 4962 |
| 6 | 1 | 71.2 | 92.1 | 27 / 35 | 5753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 37 | 84% |
| bvh.micro.Freya 0.3 | 32 | 88% |
| alpha.RainingFire 1.0 | 32 | 75% |
| mz.Cork 0.1 | 28 | 89% |
| bvh.mini.Fenrir 0.39 | 17 | 71% |
| m3thos.Eva02 0.7.1 | 11 | 91% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 50% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 28% | 48 |
| bvh.mini.Fenrir 0.39 | 14 | 19% | 18 |
| bzdp.Pansy 2.1 | 13 | 17% | 38 |
| bvh.micro.Freya 0.3 | 12 | 16% | 32 |
| mz.Cork 0.1 | 6 | 8% | 41 |
| m3thos.Eva02 0.7.1 | 4 | 5% | 20 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 5 |
| dl.BetterWalls 1.0 | 1 | 1% | 5 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 139817 melee ticks, 42925 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 73 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 4.

Targeting waves (201 rounds): 48121 sent, 43533 reached their opponent, 9009 virtual hits (20.7% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 6 battles (67.8 per battle, most in one battle 150). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.7 | 155 / 210 | 2.01 | 19.4% | 34179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.4% | 155 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 10.7% | 13 |
| germ.TheMind .2 | 3.8 | 10.0% | 6 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 3 |
| agrach.Dalek 1.0 | 5.5 | 9.0% | 9 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.1% | 8 |
| lmk.ACPFinal 0.1 | 7.3 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.6% | 4 |
| mb.Beast 0.1 | 7.8 | 8.3% | 5 |
| skm.Ryubot 1.0 | 9.8 | 7.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 28 / 35 | 5934 |
| 2 | 1 | 66.2 | 79.7 | 22 / 35 | 5552 |
| 3 | 1 | 69.2 | 91.7 | 26 / 35 | 5853 |
| 4 | 1 | 69.2 | 92.4 | 28 / 35 | 5449 |
| 5 | 1 | 68.8 | 90.2 | 25 / 35 | 5770 |
| 6 | 1 | 68.3 | 88.9 | 26 / 35 | 5621 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 30 | 93% |
| agrach.Dalek 1.0 | 25 | 92% |
| germ.TheMind .2 | 23 | 91% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 86% |
| mb.Beast 0.1 | 22 | 91% |
| EBBU.Sim2 1.02 | 18 | 94% |
| lmk.ACPFinal 0.1 | 16 | 94% |
| skm.Ryubot 1.0 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 57 of 210 rounds, at a mean tick of 469. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 23% | 39 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 16% | 13 |
| lmk.ACPFinal 0.1 | 7 | 12% | 21 |
| germ.TheMind .2 | 6 | 11% | 20 |
| mb.Beast 0.1 | 6 | 11% | 20 |
| stelo.UntouchableNano 1.3 | 5 | 9% | 28 |
| agrach.Dalek 1.0 | 4 | 7% | 39 |
| EBBU.Sim2 1.02 | 3 | 5% | 19 |
| skm.Ryubot 1.0 | 2 | 4% | 7 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 96699 melee ticks, 25878 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 33 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 32182 sent, 27743 reached their opponent, 8011 virtual hits (28.9% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 568 over 6 battles (94.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.9 | 104 / 210 | 2.36 | 17.8% | 27677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.2 | 17.8% | 104 |
| justin.Mallais 14.0 | 1.8 | 16.1% | 57 |
| bvh.mini.Freya 0.55 | 3.3 | 12.6% | 16 |
| bts.mega.Gnarly 1.4 | 4.2 | 11.7% | 18 |
| cs.Wren 1.0 | 5.2 | 9.9% | 4 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.3% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.5 | 6.8% | 3 |
| bzdp.BoxCar 2.0 | 9.5 | 3.9% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.6 | 13 / 35 | 4584 |
| 2 | 1 | 68.8 | 87.3 | 22 / 35 | 4824 |
| 3 | 1 | 67.7 | 83.2 | 16 / 35 | 4925 |
| 4 | 1 | 67.7 | 85.1 | 20 / 35 | 4505 |
| 5 | 2 | 67.1 | 84.8 | 17 / 35 | 4307 |
| 6 | 1 | 67.9 | 87.3 | 16 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 65 | 68% |
| bts.mega.Gnarly 1.4 | 24 | 83% |
| bvh.mini.Freya 0.55 | 17 | 71% |
| cs.Wren 1.0 | 11 | 100% |
| kdf.KoulDestroyer 1.0 | 10 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 37% | 85 |
| bvh.mini.Freya 0.55 | 20 | 18% | 34 |
| bts.mega.Gnarly 1.4 | 16 | 14% | 39 |
| cs.Wren 1.0 | 10 | 9% | 17 |
| kdf.KoulDestroyer 1.0 | 9 | 8% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 5% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 3% | 6 |
| matt.UnderDark3 2.4.34 | 3 | 3% | 5 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 135909 melee ticks, 39100 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 464 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 319 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 45055 sent, 39882 reached their opponent, 8381 virtual hits (21.0% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 749 over 6 battles (124.8 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.9 | 83 / 210 | 2.45 | 17.7% | 30383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 17.7% | 83 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 20 |
| az.Ololobot 0.2.4 | 3.0 | 14.0% | 70 |
| catcat20.Lambda 0.024 | 3.8 | 11.9% | 31 |
| winamp32.micro.MicroMacro 1.0 | 5.3 | 9.0% | 2 |
| gimp.GimpBot 0.1 | 6.3 | 8.0% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 7.6% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 6.8% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.3 | 15 / 35 | 5212 |
| 2 | 1 | 66.6 | 79.0 | 15 / 35 | 5226 |
| 3 | 1 | 67.5 | 83.2 | 13 / 35 | 5477 |
| 4 | 1 | 67.6 | 86.7 | 18 / 35 | 4897 |
| 5 | 1 | 66.3 | 82.5 | 12 / 35 | 4814 |
| 6 | 1 | 66.4 | 83.5 | 10 / 35 | 4757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 43% |
| bvh.fry.Freya 0.82 | 39 | 87% |
| catcat20.Lambda 0.024 | 27 | 48% |
| winamp32.micro.MicroMacro 1.0 | 10 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 67% |
| gimp.GimpBot 0.1 | 2 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 33% | 67 |
| bvh.fry.Freya 0.82 | 42 | 31% | 66 |
| catcat20.Lambda 0.024 | 25 | 19% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 5% | 7 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 1% | 15 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |
| gimp.GimpBot 0.1 | 1 | 1% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 161119 melee ticks, 47719 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 57 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 50286 sent, 45379 reached their opponent, 7779 virtual hits (17.1% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 463 over 6 battles (77.2 per battle, most in one battle 140). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.8 | 120 / 210 | 2.10 | 19.4% | 30925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.4% | 120 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 28 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 13.0% | 30 |
| mz.AntiGrav 1.0 | 3.8 | 12.0% | 11 |
| Polkwane.SmashMelee 1.0 | 5.2 | 10.1% | 6 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 6 |
| stelo.Randomness 1.0 | 6.5 | 8.7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.8% | 0 |
| sample.Corners 1.0 | 9.7 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 90.2 | 24 / 35 | 5716 |
| 2 | 1 | 69.2 | 86.7 | 19 / 35 | 5006 |
| 3 | 1 | 69.7 | 89.5 | 20 / 35 | 4990 |
| 4 | 1 | 69.3 | 87.6 | 18 / 35 | 4988 |
| 5 | 1 | 70.1 | 88.9 | 20 / 35 | 5343 |
| 6 | 1 | 68.6 | 84.1 | 19 / 35 | 4882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 83% |
| kano.gamma.KanoGamma 1.8 | 36 | 72% |
| mz.AntiGrav 1.0 | 25 | 96% |
| Polkwane.SmashMelee 1.0 | 12 | 83% |
| stelo.Randomness 1.0 | 11 | 45% |
| alpha.BlackIce 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 25% | 64 |
| kano.gamma.KanoGamma 1.8 | 21 | 22% | 52 |
| Polkwane.SmashMelee 1.0 | 13 | 14% | 19 |
| mz.AntiGrav 1.0 | 11 | 12% | 34 |
| stelo.Randomness 1.0 | 9 | 9% | 17 |
| alpha.BlackIce 1.0 | 9 | 9% | 12 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 6 |
| sample.Corners 1.0 | 0 | 0% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 150462 melee ticks, 40533 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 87 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 87 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 49792 sent, 44871 reached their opponent, 9284 virtual hits (20.7% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 481 over 6 battles (80.2 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.4 | 91 / 210 | 2.31 | 17.7% | 27083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 17.7% | 91 |
| eem.EvBotNG v12.8 | 2.0 | 15.9% | 73 |
| ary.Swarm 1.1 | 3.3 | 13.3% | 9 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 13.1% | 20 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.6% | 13 |
| shrub.Silver v048 | 6.0 | 8.6% | 2 |
| zyx.nano.Ant 1.1 | 7.2 | 7.3% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.2 | 15 / 35 | 4365 |
| 2 | 1 | 67.0 | 83.5 | 14 / 35 | 4458 |
| 3 | 1 | 68.1 | 88.3 | 16 / 35 | 4436 |
| 4 | 1 | 67.8 | 85.7 | 17 / 35 | 4545 |
| 5 | 1 | 68.0 | 86.0 | 13 / 35 | 4837 |
| 6 | 1 | 67.8 | 86.0 | 16 / 35 | 4442 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 71 | 37% |
| lessonz.robocode.Oz 0.5.0 | 32 | 84% |
| ary.Swarm 1.1 | 28 | 93% |
| simonton.nano.MeleeSeed 1.8 | 12 | 75% |
| shrub.Silver v048 | 3 | 33% |
| stelo.Mirror 1.1 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 61 | 50% | 90 |
| ary.Swarm 1.1 | 23 | 19% | 46 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 22 |
| lessonz.robocode.Oz 0.5.0 | 11 | 9% | 34 |
| shrub.Silver v048 | 6 | 5% | 7 |
| zyx.nano.Ant 1.1 | 3 | 2% | 5 |
| stelo.Mirror 1.1 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 150034 melee ticks, 50359 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49202 sent, 44366 reached their opponent, 7158 virtual hits (16.1% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 269 over 6 battles (44.8 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.2 | 133 / 210 | 1.98 | 19.9% | 35115 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.9% | 133 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 41 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.7% | 17 |
| ara.Shera 0.88 | 4.0 | 12.1% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| dsw.StaticD 1.0 | 6.0 | 7.0% | 3 |
| mme.NikeEnhanced 2.0 | 8.0 | 5.9% | 0 |
| maribo.IotaCT 1.1 | 8.0 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.1 | 19 / 35 | 5550 |
| 2 | 1 | 69.8 | 86.7 | 22 / 35 | 5770 |
| 3 | 1 | 70.2 | 90.8 | 21 / 35 | 5807 |
| 4 | 1 | 71.5 | 92.4 | 26 / 35 | 6064 |
| 5 | 1 | 69.9 | 87.6 | 20 / 35 | 6039 |
| 6 | 1 | 71.0 | 93.3 | 25 / 35 | 5885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 87% |
| maribo.mini.MiniQuester 0.1 | 35 | 91% |
| ara.Shera 0.88 | 20 | 80% |
| dsw.StaticD 1.0 | 5 | 80% |
| maribo.IotaCT 1.1 | 3 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 27 | 34% | 99 |
| ara.Shera 0.88 | 22 | 28% | 42 |
| maribo.mini.MiniQuester 0.1 | 18 | 23% | 50 |
| amz.NanoClone 1.41 | 5 | 6% | 8 |
| dsw.StaticD 1.0 | 2 | 3% | 5 |
| maribo.IotaCT 1.1 | 2 | 3% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 158428 melee ticks, 49989 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 3.

Targeting waves (206 rounds): 50334 sent, 45633 reached their opponent, 8788 virtual hits (19.3% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 714 over 6 battles (119.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 78.1 | 29 / 210 | 2.97 | 15.2% | 23384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 145 |
| hadur2.Hadur 3.18o2oeow | 2.0 | 15.2% | 29 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.4% | 21 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.8% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 4 |
| mz.NanoGod 2.02 | 7.2 | 7.6% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 79.7 | 4 / 35 | 3617 |
| 2 | 2 | 63.0 | 73.3 | 2 / 35 | 3589 |
| 3 | 2 | 65.6 | 79.4 | 4 / 35 | 4045 |
| 4 | 2 | 66.3 | 80.0 | 10 / 35 | 3987 |
| 5 | 2 | 65.2 | 78.4 | 4 / 35 | 4209 |
| 6 | 2 | 64.9 | 77.8 | 5 / 35 | 3937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 71 | 15% |
| brainfade.melee.Dusk 0.44 | 11 | 45% |
| dummy.micro.Sparrow 2.5 | 10 | 90% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |

Hadur died in 189 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 108 | 57% | 123 |
| brainfade.melee.Dusk 0.44 | 26 | 14% | 32 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 7% | 16 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 2 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 149380 melee ticks, 39765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 25 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 2.

Targeting waves (206 rounds): 48350 sent, 43310 reached their opponent, 7283 virtual hits (16.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 239 over 6 battles (39.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.4 | 129 / 210 | 1.96 | 20.1% | 34537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 20.1% | 129 |
| stelo.Liblix 0.3.1 | 2.2 | 15.8% | 54 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.1% | 18 |
| jwirde.Gort 2.0 | 4.5 | 9.7% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.7 | 9.4% | 1 |
| wompi.Quokka 1.6 | 6.5 | 7.5% | 1 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 2 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 20 / 35 | 5567 |
| 2 | 1 | 71.6 | 90.8 | 26 / 35 | 5940 |
| 3 | 1 | 68.8 | 85.1 | 16 / 35 | 5403 |
| 4 | 1 | 69.4 | 86.0 | 18 / 35 | 5676 |
| 5 | 1 | 72.0 | 93.0 | 27 / 35 | 6267 |
| 6 | 1 | 70.9 | 93.0 | 22 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 63% |
| tzu.TheArtOfWar 1.2 | 56 | 86% |
| jwirde.Gort 2.0 | 17 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 90% |
| disan.Chair 2.2.0 | 7 | 86% |
| wompi.Quokka 1.6 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 50 | 61% | 97 |
| tzu.TheArtOfWar 1.2 | 17 | 21% | 63 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 13 |
| jwirde.Gort 2.0 | 4 | 5% | 23 |
| disan.Chair 2.2.0 | 2 | 2% | 6 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 5 |
| wompi.Quokka 1.6 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 150362 melee ticks, 42338 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 27 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 27 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 51079 sent, 46458 reached their opponent, 9797 virtual hits (21.1% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 738 over 6 battles (123.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.8 | 82 / 210 | 2.37 | 19.0% | 33915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18o2oeow | 1.0 | 19.0% | 82 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.0% | 98 |
| jje.BagPuss 1.2 | 2.8 | 12.3% | 10 |
| myl.nano.Graviton 1.10 | 4.7 | 10.2% | 7 |
| sul.Lunar 1.1 | 4.8 | 10.6% | 8 |
| hvilela.HVilela 0.9 | 6.0 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.4% | 3 |
| fm.claire 1.7 | 7.3 | 8.3% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.5% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.9 | 12 / 35 | 5436 |
| 2 | 1 | 68.6 | 83.5 | 14 / 35 | 5773 |
| 3 | 1 | 67.9 | 84.4 | 10 / 35 | 5381 |
| 4 | 1 | 68.2 | 84.8 | 13 / 35 | 5498 |
| 5 | 1 | 68.7 | 84.8 | 15 / 35 | 5660 |
| 6 | 1 | 70.3 | 88.3 | 18 / 35 | 6167 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 40% |
| sul.Lunar 1.1 | 19 | 95% |
| jje.BagPuss 1.2 | 19 | 68% |
| myl.nano.Graviton 1.10 | 10 | 80% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 57% |
| wit.Deep7 2.0 | 5 | 80% |
| fm.claire 1.7 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 1422. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 55 | 41% | 0 |
| jje.BagPuss 1.2 | 27 | 20% | 67 |
| myl.nano.Graviton 1.10 | 12 | 9% | 29 |
| sul.Lunar 1.1 | 11 | 8% | 60 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 20 |
| hvilela.HVilela 0.9 | 5 | 4% | 12 |
| fm.claire 1.7 | 5 | 4% | 11 |
| wit.Deep7 2.0 | 5 | 4% | 5 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 190751 melee ticks, 96681 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 54 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 58745 sent, 53955 reached their opponent, 7987 virtual hits (14.8% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18o2oeow against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 436 over 6 battles (72.7 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.4 | 59 / 210 | 2.49 | 16.6% | 25959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.9% | 63 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.7% | 73 |
| hadur2.Hadur 3.18o2oeow | 2.2 | 16.6% | 59 |
| mz.MicroSheep 1.0 | 4.7 | 10.3% | 7 |
| cx.Princess 1.0 | 4.8 | 9.8% | 8 |
| sadoner.killer 0.2 | 5.7 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.5% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 80.0 | 10 / 35 | 4041 |
| 2 | 1 | 67.8 | 85.4 | 17 / 35 | 4653 |
| 3 | 2 | 66.5 | 82.9 | 7 / 35 | 4689 |
| 4 | 3 | 65.8 | 84.1 | 7 / 35 | 4081 |
| 5 | 1 | 67.4 | 85.1 | 13 / 35 | 4458 |
| 6 | 3 | 65.3 | 83.2 | 5 / 35 | 4037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 57% |
| rsalesc.melee.Medina 0.4.5 | 36 | 36% |
| cx.Princess 1.0 | 9 | 56% |
| mz.MicroSheep 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 41% | 95 |
| rsalesc.melee.Medina 0.4.5 | 59 | 38% | 71 |
| cx.Princess 1.0 | 10 | 6% | 15 |
| arthord.NanoSatanMelee Beta | 8 | 5% | 11 |
| mz.MicroSheep 1.0 | 6 | 4% | 11 |
| sadoner.killer 0.2 | 5 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 150158 melee ticks, 41174 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 39 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 44786 sent, 39837 reached their opponent, 6135 virtual hits (15.4% of those reached).

