# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 6 battles (34.0 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 83.1 | 34 / 210 | 2.52 | 16.0% | 26527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 143 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.0% | 34 |
| sgp.JollyNinja 3.53 | 3.3 | 12.1% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.2% | 2 |
| mz.MicroGodMelee 1 | 5.2 | 10.1% | 8 |
| lorneswork.Predator 1.0 | 5.7 | 9.9% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 83.2 | 5 / 35 | 4511 |
| 2 | 2 | 65.7 | 85.1 | 9 / 35 | 4400 |
| 3 | 2 | 66.1 | 87.3 | 6 / 35 | 4344 |
| 4 | 2 | 64.3 | 79.4 | 5 / 35 | 4491 |
| 5 | 2 | 65.3 | 82.5 | 3 / 35 | 4674 |
| 6 | 2 | 64.4 | 81.0 | 6 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 6% |
| sgp.JollyNinja 3.53 | 20 | 60% |
| mz.MicroGodMelee 1 | 14 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 60% |
| lorneswork.Predator 1.0 | 3 | 33% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 66% | 127 |
| sgp.JollyNinja 3.53 | 16 | 9% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 18 |
| lorneswork.Predator 1.0 | 12 | 7% | 15 |
| mz.MicroGodMelee 1 | 10 | 6% | 19 |
| adt.Ar2 1.0 | 6 | 3% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 146418 melee ticks, 79014 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 75 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 75 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47296 sent, 42854 reached their opponent, 9390 virtual hits (21.9% of those reached).

## Melee bench: F02

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 6 battles (22.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.8 | 91 / 210 | 2.46 | 17.3% | 25506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.3% | 91 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.3% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.9% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.6% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.1% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6.2 | 8.6% | 5 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 16 |
| sch.Simone 0.3d | 7.8 | 7.1% | 3 |
| stelo.PatternRobot 1.0 | 9.0 | 5.3% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.4 | 17 / 35 | 4327 |
| 2 | 1 | 64.6 | 78.4 | 15 / 35 | 3871 |
| 3 | 1 | 65.5 | 81.0 | 13 / 35 | 4188 |
| 4 | 1 | 67.2 | 85.1 | 17 / 35 | 4391 |
| 5 | 1 | 66.6 | 85.4 | 13 / 35 | 4158 |
| 6 | 1 | 67.6 | 88.3 | 16 / 35 | 4571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 33 | 79% |
| pulsar.PulsarMax 0.8.9 | 29 | 59% |
| com.cohesiva.robocode.ManOwaR 1.0 | 25 | 60% |
| Noran.BitchingElk 0.054 | 20 | 40% |
| sch.Simone 0.3d | 14 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 78% |
| fnc.bandit.Bandit 5.2.0 | 4 | 25% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 29% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 20 | 17% | 49 |
| com.cohesiva.robocode.ManOwaR 1.0 | 18 | 15% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 13% | 23 |
| Noran.BitchingElk 0.054 | 16 | 13% | 23 |
| fnc.bandit.Bandit 5.2.0 | 8 | 7% | 9 |
| sch.Simone 0.3d | 3 | 2% | 11 |
| stelo.PatternRobot 1.0 | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 168579 melee ticks, 41938 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 54 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 60766 sent, 56302 reached their opponent, 10080 virtual hits (17.9% of those reached).

## Melee bench: F03

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 92 over 6 battles (15.3 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.4 | 148 / 210 | 2.05 | 19.2% | 33919 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.2% | 148 |
| radnor.DoctorBob 1.42 | 2.2 | 14.5% | 26 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.2% | 17 |
| vuen.Cake 2.51 | 3.7 | 12.1% | 16 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 2 |
| oa.weak.FlyMk1 0.1 | 6.7 | 7.1% | 0 |
| adt.Ar1 2.1 | 6.8 | 7.1% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.0 | 25 / 35 | 5809 |
| 2 | 1 | 69.2 | 89.2 | 25 / 35 | 5927 |
| 3 | 1 | 68.4 | 85.7 | 24 / 35 | 5171 |
| 4 | 1 | 71.0 | 94.6 | 29 / 35 | 6182 |
| 5 | 1 | 66.6 | 80.3 | 22 / 35 | 4957 |
| 6 | 1 | 68.8 | 87.3 | 23 / 35 | 5873 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 58 | 90% |
| radnor.DoctorBob 1.42 | 51 | 98% |
| kawigi.nano.Lib 1.0 | 44 | 95% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 23 | 37% | 66 |
| kawigi.nano.Lib 1.0 | 15 | 24% | 53 |
| vuen.Cake 2.51 | 9 | 15% | 59 |
| bwbaugh.nano.Tirunculus 0.0.0a | 6 | 10% | 7 |
| urdos.URDOS 1.3 | 4 | 6% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 5% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 7 |
| adt.Ar1 2.1 | 1 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 125733 melee ticks, 38048 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 39 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 39249 sent, 35108 reached their opponent, 9749 virtual hits (27.8% of those reached).

## Melee bench: F04

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 627 over 6 battles (104.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 82.9 | 24 / 210 | 2.54 | 16.0% | 27053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.6% | 161 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.0% | 24 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.9% | 14 |
| TNT.TNT 0.99.1 | 4.0 | 11.3% | 11 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.4% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 89.8 | 8 / 35 | 4727 |
| 2 | 2 | 65.4 | 81.6 | 1 / 35 | 4589 |
| 3 | 2 | 67.1 | 85.1 | 7 / 35 | 4797 |
| 4 | 2 | 64.3 | 78.1 | 3 / 35 | 4366 |
| 5 | 2 | 65.8 | 83.8 | 3 / 35 | 4374 |
| 6 | 2 | 64.6 | 78.7 | 2 / 35 | 4200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 113 | 7% |
| TNT.TNT 0.99.1 | 12 | 50% |
| apc.LeeroyJenkins2 1.0 | 10 | 60% |
| josago.Jorgito 0.16 | 2 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 1254. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 130 | 68% | 139 |
| apc.LeeroyJenkins2 1.0 | 29 | 15% | 35 |
| TNT.TNT 0.99.1 | 12 | 6% | 18 |
| josago.Jorgito 0.16 | 10 | 5% | 11 |
| css.Delitioner 0.11 | 3 | 2% | 4 |
| rampancy.Durandal 2.1d | 1 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 199855 melee ticks, 61363 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 72 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 63183 sent, 58549 reached their opponent, 9272 virtual hits (15.8% of those reached).

## Melee bench: F05

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 532 over 6 battles (88.7 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 76.1 | 25 / 210 | 3.15 | 14.1% | 19326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.0% | 105 |
| justin.DemonicRage 3.4 | 1.7 | 17.3% | 62 |
| hadur2.Hadur 3.17.1aa | 3.3 | 14.1% | 25 |
| wompi.Numbat 2.1 | 3.7 | 13.1% | 13 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 4 |
| ms.Ares 0.19 | 5.5 | 8.8% | 1 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 75.6 | 3 / 35 | 2973 |
| 2 | 3 | 65.2 | 83.2 | 8 / 35 | 3709 |
| 3 | 4 | 60.4 | 68.6 | 3 / 35 | 3298 |
| 4 | 3 | 61.5 | 77.1 | 3 / 35 | 2961 |
| 5 | 4 | 61.5 | 74.6 | 5 / 35 | 3095 |
| 6 | 3 | 62.7 | 77.5 | 3 / 35 | 3290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 33 | 18% |
| cb.fire.Firestarter 2.0f | 30 | 17% |
| wompi.Numbat 2.1 | 10 | 70% |
| axeBots.HataMoto 3.09 | 5 | 60% |
| ms.Ares 0.19 | 4 | 75% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 68 | 36% | 72 |
| cb.fire.Firestarter 2.0f | 59 | 31% | 66 |
| wompi.Numbat 2.1 | 35 | 19% | 40 |
| ms.Ares 0.19 | 8 | 4% | 12 |
| axeBots.HataMoto 3.09 | 6 | 3% | 9 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 154580 melee ticks, 29118 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 56 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 49107 sent, 44408 reached their opponent, 7779 virtual hits (17.5% of those reached).

## Melee bench: F06

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 332 over 6 battles (55.3 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.4 | 120 / 210 | 2.14 | 18.5% | 28337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.5% | 120 |
| jekl.StoneGhost 0.7 | 2.0 | 15.0% | 29 |
| origin.SleepSiphon 1.7b | 3.3 | 13.1% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.6% | 17 |
| mld.Wisdom 1.0 | 4.8 | 10.6% | 2 |
| gg.Wolverine 2.0 | 6.2 | 8.5% | 2 |
| spinnercat.Omen 1.0 | 7.3 | 6.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.5% | 4 |
| DBall.NUKE 0.1 | 8.7 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 23 / 35 | 4750 |
| 2 | 1 | 67.5 | 84.8 | 18 / 35 | 4520 |
| 3 | 1 | 70.2 | 93.0 | 25 / 35 | 4951 |
| 4 | 1 | 68.9 | 88.3 | 22 / 35 | 4795 |
| 5 | 1 | 67.8 | 86.0 | 18 / 35 | 4607 |
| 6 | 1 | 66.9 | 83.5 | 14 / 35 | 4714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 58 | 88% |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 79% |
| origin.SleepSiphon 1.7b | 31 | 65% |
| gg.Wolverine 2.0 | 10 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 6 | 83% |
| spinnercat.Omen 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 26 | 28% | 65 |
| origin.SleepSiphon 1.7b | 25 | 27% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 20% | 42 |
| mld.Wisdom 1.0 | 9 | 10% | 19 |
| gg.Wolverine 2.0 | 4 | 4% | 10 |
| spinnercat.Omen 1.0 | 4 | 4% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 12 |
| DBall.NUKE 0.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 146119 melee ticks, 38513 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 33 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45992 sent, 41632 reached their opponent, 9824 virtual hits (23.6% of those reached).

## Melee bench: F07

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 762 over 6 battles (127.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 92.8 | 120 / 210 | 1.65 | 20.0% | 34353 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.0% | 120 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.0% | 41 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.5% | 10 |
| franzor.Lizt 1.3.1 | 4.7 | 11.0% | 17 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.5 | 15 / 35 | 5508 |
| 2 | 1 | 71.5 | 93.7 | 20 / 35 | 5586 |
| 3 | 1 | 72.6 | 92.4 | 25 / 35 | 6275 |
| 4 | 1 | 72.3 | 94.6 | 23 / 35 | 5931 |
| 5 | 1 | 70.6 | 91.7 | 18 / 35 | 5448 |
| 6 | 1 | 71.4 | 93.7 | 19 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 72 | 78% |
| rsalesc.melee.Monk 0.3.6c | 49 | 37% |
| oog.melee.CapuletDroid 1.1 | 33 | 88% |
| franzor.Lizt 1.3.1 | 28 | 61% |

Hadur died in 96 of 210 rounds, at a mean tick of 1415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 43 | 45% | 76 |
| rtk.Tachikoma 1.0 | 26 | 27% | 89 |
| franzor.Lizt 1.3.1 | 12 | 13% | 2 |
| oog.melee.CapuletDroid 1.1 | 9 | 9% | 40 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 197765 melee ticks, 84481 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 34 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 59754 sent, 55391 reached their opponent, 12001 virtual hits (21.7% of those reached).

## Melee bench: F08

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 339 over 6 battles (56.5 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.8 | 122 / 210 | 2.10 | 18.4% | 25950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 122 |
| tm.Yuugao 1.0 | 2.2 | 13.7% | 30 |
| shrub.Vapour v159 | 3.5 | 12.2% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.0% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.9% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 9.2% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.0% | 9 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.5% | 1 |
| SHAM.WOW 1.4 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.1 | 19 / 35 | 4395 |
| 2 | 1 | 68.4 | 91.4 | 23 / 35 | 4344 |
| 3 | 1 | 66.7 | 83.8 | 20 / 35 | 4276 |
| 4 | 1 | 67.6 | 89.5 | 20 / 35 | 4101 |
| 5 | 1 | 67.9 | 87.0 | 20 / 35 | 4528 |
| 6 | 1 | 68.1 | 89.8 | 20 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 78% |
| shrub.Vapour v159 | 32 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 96% |
| Krabb.sliNk.Garm 0.9u | 23 | 87% |
| m3thos.Eva00 1.1 | 10 | 60% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 57% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 91 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 23 | 25% | 70 |
| shrub.Vapour v159 | 18 | 20% | 40 |
| Krabb.sliNk.Garm 0.9u | 16 | 18% | 39 |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 11% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 10% | 25 |
| m3thos.Eva00 1.1 | 9 | 10% | 13 |
| SHAM.WOW 1.4 | 3 | 3% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153765 melee ticks, 38333 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 57 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51239 sent, 46553 reached their opponent, 8985 virtual hits (19.3% of those reached).

## Melee bench: F09

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 509 over 6 battles (84.8 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 78.0 | 56 / 210 | 2.98 | 15.2% | 19666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.4% | 96 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.2% | 56 |
| kc.micro.Figment 1.0 | 3.0 | 14.1% | 25 |
| yagami.Tidus 0.11 | 4.7 | 10.5% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.4% | 15 |
| mc2.enemy.Original 0.9 | 5.5 | 9.5% | 15 |
| dft.Calliope 5.6 | 7.0 | 8.2% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.3% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 81.6 | 9 / 35 | 3323 |
| 2 | 2 | 62.4 | 74.9 | 9 / 35 | 3190 |
| 3 | 2 | 65.1 | 82.2 | 10 / 35 | 3461 |
| 4 | 2 | 61.7 | 71.7 | 9 / 35 | 3283 |
| 5 | 2 | 63.0 | 78.7 | 8 / 35 | 3069 |
| 6 | 2 | 63.9 | 78.7 | 11 / 35 | 3340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 20% |
| kc.micro.Figment 1.0 | 32 | 81% |
| pedersen.Grishnakh 1.0 | 13 | 54% |
| mc2.enemy.Original 0.9 | 9 | 33% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 4 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 40% | 76 |
| kc.micro.Figment 1.0 | 26 | 16% | 50 |
| mc2.enemy.Original 0.9 | 18 | 11% | 23 |
| yagami.Tidus 0.11 | 14 | 9% | 19 |
| pedersen.Grishnakh 1.0 | 14 | 9% | 17 |
| dft.Calliope 5.6 | 7 | 4% | 12 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 153396 melee ticks, 34472 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 35 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50436 sent, 45936 reached their opponent, 6887 virtual hits (15.0% of those reached).

## Melee bench: F10

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 193 over 6 battles (32.2 per battle, most in one battle 103). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 94.3 | 159 / 210 | 1.51 | 19.9% | 30716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.9% | 159 |
| DTF.Kludgy 1.2b | 2.2 | 14.3% | 22 |
| ejb.Polaris 1.0.1 | 3.2 | 12.8% | 14 |
| ne.Chimera 1.2 | 3.7 | 12.9% | 4 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 5 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.8% | 4 |
| sam.Samspin 1.0 | 8.0 | 5.1% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.1% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 95.6 | 30 / 35 | 5418 |
| 2 | 1 | 69.7 | 94.3 | 23 / 35 | 4983 |
| 3 | 1 | 69.2 | 92.1 | 22 / 35 | 5037 |
| 4 | 1 | 70.7 | 95.2 | 29 / 35 | 5164 |
| 5 | 1 | 70.3 | 94.3 | 27 / 35 | 5034 |
| 6 | 1 | 70.7 | 94.6 | 28 / 35 | 5080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 77% |
| ejb.Polaris 1.0.1 | 47 | 85% |
| ne.Chimera 1.2 | 41 | 95% |
| vStar.RAFzilla 2.15 | 20 | 85% |
| tvv.micro.Antares 1.1.1 | 17 | 94% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |

Hadur died in 52 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 24 | 46% | 69 |
| ejb.Polaris 1.0.1 | 12 | 23% | 54 |
| ne.Chimera 1.2 | 5 | 10% | 42 |
| vStar.RAFzilla 2.15 | 4 | 8% | 21 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 2 |
| donjezza.Muncho 1.0 | 1 | 2% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 150611 melee ticks, 51641 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 95 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 95 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 49261 sent, 44980 reached their opponent, 9117 virtual hits (20.3% of those reached).

## Melee bench: F11

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 324 over 6 battles (54.0 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 77.3 | 65 / 210 | 3.04 | 15.2% | 20356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 16.4% | 66 |
| hadur2.Hadur 3.17.1aa | 1.7 | 15.2% | 65 |
| cx.mini.Nimrod 0.55 | 3.5 | 12.5% | 22 |
| djc.DynaBot 0.1.1 | 3.7 | 11.5% | 20 |
| br2.MobyDickBot 1.6 | 5.3 | 9.4% | 14 |
| rdt199.Warlord 0.73 | 6.3 | 8.5% | 8 |
| uji.YellohFellah 1.0 | 6.5 | 8.3% | 11 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.4% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 77.5 | 12 / 35 | 3269 |
| 2 | 2 | 61.8 | 73.3 | 8 / 35 | 3464 |
| 3 | 1 | 64.5 | 81.6 | 15 / 35 | 3587 |
| 4 | 2 | 60.5 | 73.0 | 7 / 35 | 3029 |
| 5 | 1 | 64.5 | 81.3 | 12 / 35 | 3658 |
| 6 | 2 | 62.9 | 77.1 | 11 / 35 | 3349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 44% |
| djc.DynaBot 0.1.1 | 13 | 92% |
| cx.mini.Nimrod 0.55 | 13 | 54% |
| rdt199.Warlord 0.73 | 12 | 75% |
| uji.YellohFellah 1.0 | 10 | 60% |
| br2.MobyDickBot 1.6 | 10 | 50% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 43% | 86 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 35 |
| djc.DynaBot 0.1.1 | 12 | 8% | 22 |
| rdt199.Warlord 0.73 | 11 | 7% | 19 |
| uji.YellohFellah 1.0 | 9 | 6% | 15 |
| br2.MobyDickBot 1.6 | 8 | 5% | 13 |
| KiraNL.Chupacabra 0.4 | 8 | 5% | 10 |
| stelo.MirrorNano 1.3 | 4 | 3% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 154544 melee ticks, 39713 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50997 sent, 46519 reached their opponent, 6636 virtual hits (14.3% of those reached).

## Melee bench: F12

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 388 over 6 battles (64.7 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.4 | 118 / 210 | 2.13 | 17.7% | 21694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.7% | 118 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.6% | 30 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 27 |
| darkcanuck.Leon 1.01 | 3.2 | 12.4% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 10 |
| jrm.Test0 1.0 | 6.0 | 9.0% | 2 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.7% | 1 |
| jp.Perpy 16.0 | 8.2 | 6.3% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 85.1 | 18 / 35 | 3740 |
| 2 | 1 | 66.8 | 87.9 | 21 / 35 | 3393 |
| 3 | 1 | 69.4 | 92.7 | 24 / 35 | 4207 |
| 4 | 1 | 64.3 | 81.3 | 16 / 35 | 3199 |
| 5 | 1 | 67.0 | 89.5 | 20 / 35 | 3382 |
| 6 | 1 | 67.4 | 87.9 | 19 / 35 | 3773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 73% |
| darkcanuck.Leon 1.01 | 46 | 91% |
| nat.PallasHawk 1.0 | 43 | 67% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jrm.Test0 1.0 | 4 | 75% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 27 | 28% | 53 |
| nat.PallasHawk 1.0 | 23 | 24% | 55 |
| brainfade.melee.Genghis 0.36 | 15 | 16% | 21 |
| darkcanuck.Leon 1.01 | 12 | 13% | 57 |
| jrm.Test0 1.0 | 10 | 11% | 13 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 5 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 137952 melee ticks, 37585 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 59 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46986 sent, 42320 reached their opponent, 7176 virtual hits (17.0% of those reached).

## Melee bench: F13

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 84 over 6 battles (14.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 80.4 | 43 / 210 | 2.76 | 14.9% | 21160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.2 | 17.1% | 47 |
| mn.Combat 3.25.0 | 1.8 | 16.6% | 89 |
| hadur2.Hadur 3.17.1aa | 3.0 | 14.9% | 43 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.9% | 16 |
| shinh.Entangled 0.3 | 4.5 | 12.1% | 14 |
| apc.Colossus2 0.17 | 6.0 | 7.7% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 80.6 | 3 / 35 | 3346 |
| 2 | 3 | 63.7 | 81.3 | 8 / 35 | 3300 |
| 3 | 3 | 65.0 | 84.1 | 10 / 35 | 3573 |
| 4 | 3 | 64.0 | 81.3 | 6 / 35 | 3614 |
| 5 | 3 | 62.9 | 76.5 | 6 / 35 | 3646 |
| 6 | 3 | 63.8 | 78.7 | 10 / 35 | 3681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 43 | 16% |
| ags.Glacier 0.2.11 | 41 | 59% |
| shinh.Entangled 0.3 | 15 | 60% |
| gh.micro.Gruweltje 0.7 | 8 | 25% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 64 | 38% | 72 |
| ags.Glacier 0.2.11 | 59 | 35% | 79 |
| gh.micro.Gruweltje 0.7 | 19 | 11% | 23 |
| shinh.Entangled 0.3 | 15 | 9% | 25 |
| stelo.Wang 1.0 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 150381 melee ticks, 37383 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45163 sent, 40457 reached their opponent, 6813 virtual hits (16.8% of those reached).

## Melee bench: F14

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 130 over 6 battles (21.7 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.5 | 133 / 210 | 1.86 | 18.9% | 29230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.9% | 133 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 30 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 31 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 10.0% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.8% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.2% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.7 | 8.7% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.8% | 7 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.2 | 20 / 35 | 4838 |
| 2 | 1 | 68.4 | 89.2 | 19 / 35 | 4760 |
| 3 | 1 | 69.7 | 90.8 | 23 / 35 | 5232 |
| 4 | 1 | 68.3 | 88.9 | 22 / 35 | 4482 |
| 5 | 1 | 69.7 | 92.1 | 25 / 35 | 5046 |
| 6 | 1 | 69.7 | 91.7 | 24 / 35 | 4872 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 73 | 84% |
| catcat20.shape.Theta 0.018 | 55 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 93% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| pa.Improved 1.0 | 3 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 0% |

Hadur died in 77 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 28 | 36% | 90 |
| catcat20.shape.Theta 0.018 | 24 | 31% | 58 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 8% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 6% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 5% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 5% | 6 |
| pa.Improved 1.0 | 1 | 1% | 3 |

Posture (Hadur's M records, 202 rounds): 144958 melee ticks, 44298 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 41 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 46657 sent, 42392 reached their opponent, 11181 virtual hits (26.4% of those reached).

## Melee bench: F15

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 495 over 6 battles (82.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.7 | 85 / 210 | 2.74 | 16.8% | 25831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 16.8% | 85 |
| kawigi.micro.Shiz 1.1 | 2.5 | 14.4% | 33 |
| emp.Yngwie 1.11 | 3.0 | 13.2% | 54 |
| mld.DustBunny 3.8 | 3.5 | 12.9% | 10 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.5% | 8 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.6% | 19 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 5.2% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 76.5 | 12 / 35 | 3866 |
| 2 | 1 | 67.3 | 83.2 | 15 / 35 | 5089 |
| 3 | 1 | 66.8 | 82.9 | 16 / 35 | 4565 |
| 4 | 1 | 66.3 | 81.6 | 18 / 35 | 4249 |
| 5 | 1 | 66.2 | 82.9 | 15 / 35 | 4287 |
| 6 | 2 | 63.6 | 77.1 | 9 / 35 | 3775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 50 | 52% |
| kawigi.micro.Shiz 1.1 | 24 | 75% |
| mld.DustBunny 3.8 | 16 | 94% |
| kawigi.robot.Girl 1.2 | 13 | 77% |
| cb.nano.Insomnia 1.0 | 10 | 80% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 26% | 66 |
| kawigi.micro.Shiz 1.1 | 25 | 19% | 49 |
| mld.DustBunny 3.8 | 21 | 16% | 37 |
| kawigi.robot.Girl 1.2 | 16 | 12% | 19 |
| cb.nano.Insomnia 1.0 | 16 | 12% | 15 |
| lambdaxy.TBot 0.1 | 5 | 4% | 9 |
| divineomega.TrialBot 0.003 | 4 | 3% | 10 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 162333 melee ticks, 41864 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 42 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54297 sent, 49776 reached their opponent, 8585 virtual hits (17.2% of those reached).

## Melee bench: F16

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 441 over 6 battles (73.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 105 / 210 | 2.25 | 18.4% | 29100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 18.4% | 105 |
| gh.Griezel 0.5.2 | 1.8 | 16.5% | 56 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 4 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.2% | 36 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.8% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.9 | 16 / 35 | 5047 |
| 2 | 1 | 68.9 | 87.0 | 21 / 35 | 4753 |
| 3 | 2 | 66.8 | 80.6 | 13 / 35 | 4741 |
| 4 | 1 | 69.2 | 89.2 | 21 / 35 | 4822 |
| 5 | 1 | 68.2 | 86.7 | 17 / 35 | 4633 |
| 6 | 1 | 68.3 | 84.4 | 17 / 35 | 5104 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 67 | 70% |
| techdude.forest.FlamingForest 1.1 | 36 | 58% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 93% |
| tvv.nano.Polaris 1.2 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 7 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1153. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 39 | 36% | 87 |
| techdude.forest.FlamingForest 1.1 | 22 | 20% | 46 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 19% | 34 |
| bvh.fnr.Fenrir 0.36l | 14 | 13% | 17 |
| asd.Cthulhu 1.3 | 4 | 4% | 5 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 9 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 6 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 185650 melee ticks, 59936 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 48 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 59744 sent, 55287 reached their opponent, 9602 virtual hits (17.4% of those reached).

## Melee bench: F17

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 6 battles (17.2 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.7 | 101 / 210 | 2.20 | 18.3% | 30106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.3% | 101 |
| et.Predator 1.8 | 2.3 | 13.8% | 34 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.0% | 32 |
| cx.BlestPain 1.41 | 3.7 | 12.2% | 31 |
| ahf.NanoAndrew .4 | 5.3 | 10.2% | 4 |
| nic.Nicator 2.4 | 6.0 | 9.8% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 9.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.2 | 20 / 35 | 4959 |
| 2 | 1 | 68.6 | 87.6 | 18 / 35 | 5108 |
| 3 | 1 | 68.2 | 87.6 | 18 / 35 | 4992 |
| 4 | 1 | 67.4 | 83.5 | 12 / 35 | 5065 |
| 5 | 1 | 66.8 | 81.3 | 14 / 35 | 4888 |
| 6 | 1 | 69.4 | 90.8 | 19 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 54 | 63% |
| oog.melee.Mercutio 1.0 | 47 | 70% |
| cx.BlestPain 1.41 | 28 | 43% |
| ahf.NanoAndrew .4 | 12 | 100% |
| nic.Nicator 2.4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |

Hadur died in 109 of 210 rounds, at a mean tick of 1088. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 35 | 32% | 67 |
| cx.BlestPain 1.41 | 27 | 25% | 42 |
| oog.melee.Mercutio 1.0 | 22 | 20% | 49 |
| ahf.NanoAndrew .4 | 12 | 11% | 26 |
| nic.Nicator 2.4 | 5 | 5% | 10 |
| maribo.melee.BMV 0.1 | 5 | 5% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 5 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

Posture (Hadur's M records, 204 rounds): 168330 melee ticks, 55205 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 59 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 56138 sent, 51703 reached their opponent, 11856 virtual hits (22.9% of those reached).

## Melee bench: F18

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 233 over 6 battles (38.8 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.4 | 126 / 210 | 2.05 | 18.6% | 26038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 126 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 29 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 21 |
| uji.DBH 1.1 | 3.8 | 10.9% | 9 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.6% | 7 |
| ratosh.Nobo 0.21 | 6.0 | 8.9% | 3 |
| sigterm.Sigterm 1.0 | 6.3 | 8.6% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.8% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 4.9% | 0 |
| stelo.WangRobot 1.0 | 9.5 | 5.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 91.7 | 22 / 35 | 4424 |
| 2 | 1 | 69.0 | 92.1 | 27 / 35 | 4203 |
| 3 | 1 | 68.5 | 89.8 | 21 / 35 | 4456 |
| 4 | 1 | 68.2 | 87.9 | 23 / 35 | 4322 |
| 5 | 1 | 68.2 | 89.5 | 18 / 35 | 4567 |
| 6 | 1 | 64.8 | 79.0 | 15 / 35 | 4066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 55 | 71% |
| agd.Mooserwirt2 2.7 | 33 | 88% |
| uji.DBH 1.1 | 29 | 79% |
| sigterm.Sigterm 1.0 | 15 | 93% |
| ratosh.Nobo 0.21 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| spinnercat.Robovirus 2.718 | 5 | 40% |
| stelo.WangRobot 1.0 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 33% | 67 |
| agd.Mooserwirt2 2.7 | 16 | 19% | 53 |
| uji.DBH 1.1 | 14 | 16% | 31 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 8% | 19 |
| ratosh.Nobo 0.21 | 7 | 8% | 13 |
| spinnercat.Robovirus 2.718 | 6 | 7% | 6 |
| sigterm.Sigterm 1.0 | 3 | 3% | 14 |
| stelo.WangRobot 1.0 | 3 | 3% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 141903 melee ticks, 44880 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 48407 sent, 43846 reached their opponent, 10086 virtual hits (23.0% of those reached).

## Melee bench: F19

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 6 battles (18.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 97.9 | 191 / 210 | 1.19 | 21.8% | 33774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 21.8% | 191 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 8 |
| mld.Infinity 2.2 | 3.3 | 12.4% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.1% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.7% | 3 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.0% | 3 |
| mbh.Mbh 0.1 | 7.0 | 7.7% | 0 |
| pac.ABC 2.1 | 7.7 | 6.9% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 97.5 | 31 / 35 | 5184 |
| 2 | 1 | 72.9 | 98.1 | 31 / 35 | 5744 |
| 3 | 1 | 73.6 | 100.0 | 35 / 35 | 5846 |
| 4 | 1 | 73.2 | 98.1 | 32 / 35 | 5919 |
| 5 | 1 | 72.5 | 97.5 | 30 / 35 | 5701 |
| 6 | 1 | 72.1 | 96.2 | 32 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 99 | 98% |
| mld.Infinity 2.2 | 40 | 95% |
| krillr.mini.JointStrike 2.0.0 | 21 | 95% |
| erdnis.Rover 0.3 | 16 | 81% |
| pac.ABC 2.1 | 11 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 80% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 6 | 32% | 27 |
| davidalves.net.DuelistMiniMelee 1.2 | 5 | 26% | 75 |
| erdnis.Rover 0.3 | 3 | 16% | 32 |
| patson.PatsonTestBot 1.0 | 3 | 16% | 11 |
| mld.Infinity 2.2 | 2 | 11% | 37 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| pac.ABC 2.1 | 0 | 0% | 6 |

Posture (Hadur's M records, 199 rounds): 131806 melee ticks, 44667 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 80 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 44691 sent, 40482 reached their opponent, 10303 virtual hits (25.5% of those reached).

## Melee bench: F20

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 398 over 6 battles (66.3 per battle, most in one battle 123). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.6 | 134 / 210 | 1.84 | 19.7% | 30935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.7% | 134 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 41 |
| fwb.Nine 1.0.1 | 3.7 | 11.3% | 13 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.6% | 7 |
| catcat20.Rabbit 0.001 | 4.3 | 10.5% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.4% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 22 / 35 | 5014 |
| 2 | 1 | 68.4 | 86.7 | 17 / 35 | 5121 |
| 3 | 1 | 69.5 | 90.2 | 21 / 35 | 5109 |
| 4 | 1 | 71.6 | 95.6 | 29 / 35 | 5696 |
| 5 | 1 | 70.1 | 92.4 | 23 / 35 | 5032 |
| 6 | 1 | 69.2 | 90.8 | 22 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 90 | 76% |
| fwb.Nine 1.0.1 | 28 | 96% |
| catcat20.Rabbit 0.001 | 24 | 79% |
| nz.jdc.nano.GridFu 1.0 | 10 | 90% |
| m3thos.mini.Eva01 0.5.5 | 7 | 86% |
| bayen.nut.Squirrel 1.615 | 5 | 60% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 54% | 96 |
| fwb.Nine 1.0.1 | 12 | 15% | 21 |
| catcat20.Rabbit 0.001 | 10 | 13% | 35 |
| nz.jdc.nano.GridFu 1.0 | 4 | 5% | 19 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 14 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 13 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167291 melee ticks, 54292 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 34 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54766 sent, 50185 reached their opponent, 11962 virtual hits (23.8% of those reached).

## Melee bench: F21

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 671 over 6 battles (111.8 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.8 | 114 / 210 | 1.91 | 19.1% | 30184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.1% | 114 |
| eem.EvBot v4.6.16 | 2.0 | 16.7% | 62 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.2 | 11.5% | 6 |
| eld.Hmm 1.0 | 5.2 | 9.0% | 22 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.2% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 19 / 35 | 4937 |
| 2 | 1 | 70.5 | 93.3 | 22 / 35 | 5341 |
| 3 | 1 | 68.5 | 88.9 | 15 / 35 | 4797 |
| 4 | 1 | 71.1 | 95.2 | 25 / 35 | 5270 |
| 5 | 1 | 67.1 | 82.5 | 17 / 35 | 4699 |
| 6 | 1 | 69.2 | 89.5 | 16 / 35 | 5140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 68% |
| dummy.mini.Scimitar 1.01 | 18 | 78% |
| eld.Hmm 1.0 | 16 | 25% |
| cf.RiO.RiOx 4.2.1 | 15 | 87% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1306. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 45% | 101 |
| dummy.mini.Scimitar 1.01 | 19 | 18% | 42 |
| eld.Hmm 1.0 | 17 | 17% | 29 |
| cf.RiO.RiOx 4.2.1 | 10 | 10% | 27 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 8 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 189705 melee ticks, 77202 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 66 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 56417 sent, 51933 reached their opponent, 9601 virtual hits (18.5% of those reached).

## Melee bench: F22

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 313 over 6 battles (52.2 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.1 | 91 / 210 | 2.07 | 17.8% | 26254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.3 | 17.8% | 91 |
| pe.SandboxDT 2.71m | 1.8 | 16.8% | 69 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.8% | 27 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 5 |
| yk.JahRoslav 1.1 | 6.3 | 7.0% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.5 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 85.1 | 11 / 35 | 4257 |
| 2 | 1 | 67.9 | 87.0 | 18 / 35 | 4362 |
| 3 | 1 | 68.3 | 89.2 | 17 / 35 | 4545 |
| 4 | 2 | 66.7 | 86.7 | 11 / 35 | 3929 |
| 5 | 1 | 69.8 | 91.4 | 22 / 35 | 4870 |
| 6 | 1 | 67.8 | 89.2 | 12 / 35 | 4291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 59 | 42% |
| kvk.HebusLeTroll 0.35 | 42 | 71% |
| jlm.javaDisturbance 0.59 | 32 | 69% |
| yk.JahRoslav 1.1 | 5 | 100% |
| tad.Dalek98 0.98 | 4 | 100% |
| bigpete.Stewie 1.0 | 4 | 75% |
| pbg.NinjaX 1.2 | 2 | 50% |

Hadur died in 122 of 210 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 59 | 48% | 89 |
| kvk.HebusLeTroll 0.35 | 28 | 23% | 49 |
| jlm.javaDisturbance 0.59 | 23 | 19% | 51 |
| bigpete.Stewie 1.0 | 6 | 5% | 9 |
| yk.JahRoslav 1.1 | 2 | 2% | 6 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 170039 melee ticks, 46627 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54340 sent, 49924 reached their opponent, 8505 virtual hits (17.0% of those reached).

## Melee bench: F23

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 6 battles (32.5 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.3 | 164 / 210 | 1.51 | 20.7% | 31984 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 20.7% | 164 |
| pe.SandboxLump 1.52 | 2.2 | 16.7% | 29 |
| cre.Karolos 0.32 | 2.8 | 13.9% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.0 | 9.6% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.3% | 1 |
| sample.Walls 1.0 | 7.7 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.1 | 26 / 35 | 5109 |
| 2 | 1 | 72.0 | 94.0 | 27 / 35 | 5524 |
| 3 | 1 | 72.4 | 95.9 | 30 / 35 | 5354 |
| 4 | 1 | 71.1 | 93.3 | 25 / 35 | 5067 |
| 5 | 1 | 71.2 | 93.7 | 25 / 35 | 5300 |
| 6 | 1 | 73.3 | 98.1 | 31 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 86% |
| cre.Karolos 0.32 | 57 | 93% |
| stelo.RamTrackSurfer 1.2 | 10 | 100% |
| stelo.AreaTargetingBot 1.1 | 9 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 23 | 49% | 99 |
| cre.Karolos 0.32 | 14 | 30% | 56 |
| stelo.AreaTargetingBot 1.1 | 3 | 6% | 19 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 6% | 9 |
| stelo.RamTrackSurfer 1.2 | 2 | 4% | 17 |
| cw.megas.Blade 0.8 | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 133495 melee ticks, 49365 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 145 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 145 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 0.

Targeting waves (209 rounds): 42598 sent, 38075 reached their opponent, 12334 virtual hits (32.4% of those reached).

## Melee bench: F24

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 521 over 6 battles (86.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 75.1 | 47 / 210 | 3.24 | 14.4% | 19281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 2.0 | 14.4% | 47 |
| florent.XSeries.X2 0.12 | 2.0 | 14.5% | 44 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.7% | 42 |
| davidalves.Phoenix 0.54 | 4.2 | 12.9% | 37 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.2% | 30 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 6.6% | 3 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 81.0 | 8 / 35 | 3314 |
| 2 | 3 | 60.4 | 73.0 | 4 / 35 | 3015 |
| 3 | 3 | 58.3 | 67.9 | 6 / 35 | 2627 |
| 4 | 2 | 63.0 | 74.3 | 11 / 35 | 3579 |
| 5 | 2 | 63.2 | 76.2 | 10 / 35 | 3396 |
| 6 | 1 | 62.6 | 78.4 | 8 / 35 | 3350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 27 | 41% |
| florent.XSeries.X2 0.12 | 26 | 46% |
| pedersen.Ugluk 1.1.1 | 18 | 50% |
| davidalves.Phoenix 0.54 | 15 | 33% |
| oog.melee.Corsair 1.0 | 7 | 57% |
| stelo.SoJNanoMelee 1.1 | 6 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 44 | 26% | 53 |
| rz.GlowBlowMelee 1.4 | 39 | 23% | 51 |
| pedersen.Ugluk 1.1.1 | 32 | 19% | 40 |
| davidalves.Phoenix 0.54 | 26 | 15% | 34 |
| oog.melee.Corsair 1.0 | 10 | 6% | 16 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 8 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 5 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 136057 melee ticks, 32008 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 89 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 89 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 46605 sent, 42025 reached their opponent, 8131 virtual hits (19.3% of those reached).

## Melee bench: F25

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 518 over 6 battles (86.3 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.1 | 135 / 210 | 2.25 | 17.9% | 21748 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 135 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 14.1% | 25 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.5% | 6 |
| jdw.Hurricane 1.4 | 3.7 | 12.0% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.7% | 6 |
| ds.Oo 2.2 | 5.8 | 9.0% | 8 |
| awesomeness.Elite 1.0 | 7.5 | 7.4% | 3 |
| adt.Ar2 1.1 | 8.2 | 6.7% | 1 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 22 / 35 | 3749 |
| 2 | 1 | 67.6 | 87.0 | 20 / 35 | 3909 |
| 3 | 1 | 67.0 | 86.0 | 23 / 35 | 3518 |
| 4 | 1 | 66.1 | 84.4 | 19 / 35 | 3406 |
| 5 | 1 | 68.4 | 88.9 | 27 / 35 | 3737 |
| 6 | 1 | 67.2 | 86.0 | 24 / 35 | 3429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 84% |
| voidious.micro.BlitzBat 1.05 | 40 | 98% |
| jdw.Hurricane 1.4 | 30 | 73% |
| ds.Oo 2.2 | 14 | 86% |
| gre.svman4.Morfeas 1.4.1 | 7 | 86% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 22 | 28% | 38 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 24% | 54 |
| voidious.micro.BlitzBat 1.05 | 13 | 16% | 40 |
| gre.svman4.Morfeas 1.4.1 | 6 | 8% | 20 |
| ds.Oo 2.2 | 5 | 6% | 17 |
| adt.Ar2 1.1 | 5 | 6% | 11 |
| awesomeness.Elite 1.0 | 3 | 4% | 11 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 12 |
| amk.ChumbaMini 0.2 | 1 | 1% | 5 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 129045 melee ticks, 31940 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 31 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46630 sent, 42061 reached their opponent, 7410 virtual hits (17.6% of those reached).

## Melee bench: F26

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 122 over 6 battles (20.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.8 | 131 / 210 | 1.82 | 19.4% | 32396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.4% | 131 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 36 |
| shu.nitro.LENIN .T34 | 3.5 | 12.4% | 22 |
| lrem.Spectre 0.4.4 | 3.5 | 11.9% | 12 |
| js.PinBall 1.6 | 5.2 | 10.4% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 93.3 | 25 / 35 | 5243 |
| 2 | 1 | 69.9 | 88.3 | 22 / 35 | 5729 |
| 3 | 1 | 69.5 | 89.8 | 20 / 35 | 5564 |
| 4 | 1 | 70.9 | 93.7 | 25 / 35 | 5404 |
| 5 | 1 | 69.5 | 88.9 | 19 / 35 | 5671 |
| 6 | 1 | 69.2 | 91.1 | 20 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 60 | 63% |
| shu.nitro.LENIN .T34 | 42 | 83% |
| lrem.Spectre 0.4.4 | 37 | 76% |
| js.PinBall 1.6 | 14 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 75% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 34 | 43% | 70 |
| shu.nitro.LENIN .T34 | 16 | 20% | 50 |
| lrem.Spectre 0.4.4 | 14 | 18% | 41 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 13% | 17 |
| gh.mini.GrubbmOne 1.0 | 3 | 4% | 9 |
| js.PinBall 1.6 | 2 | 3% | 16 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 163985 melee ticks, 47742 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 24 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 54482 sent, 50042 reached their opponent, 13437 virtual hits (26.9% of those reached).

## Melee bench: F27

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.0 | 143 / 210 | 2.35 | 18.5% | 26713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 18.5% | 143 |
| mk.Alpha 0.2.1 | 1.8 | 14.6% | 44 |
| EH.Eagle 1.0.6 | 3.3 | 11.3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.8% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 9.1% | 7 |
| wee.Gem 1.8.4 | 6.0 | 8.7% | 5 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.3% | 1 |
| joe.ADinosaur 1.0 | 6.5 | 8.5% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 7.0% | 1 |
| cs.Grudge 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.7 | 50.8 | 9 / 35 | 4489 |
| 2 | 1 | 68.7 | 91.7 | 26 / 35 | 4012 |
| 3 | 1 | 70.7 | 96.5 | 30 / 35 | 4720 |
| 4 | 1 | 69.2 | 89.2 | 25 / 35 | 4702 |
| 5 | 1 | 67.4 | 87.6 | 23 / 35 | 3882 |
| 6 | 1 | 70.9 | 94.3 | 30 / 35 | 4908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 84 | 89% |
| EH.Eagle 1.0.6 | 32 | 97% |
| techdude.kombat.FlamingKombat 1.5 | 14 | 93% |
| wee.Gem 1.8.4 | 11 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 80% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 33% | 87 |
| cs.Grudge 1.0 | 13 | 19% | 13 |
| joe.ADinosaur 1.0 | 8 | 11% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 9% | 12 |
| EH.Eagle 1.0.6 | 5 | 7% | 40 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 7% | 17 |
| throxbot.ThroxBot 0.1 | 4 | 6% | 9 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 6 |
| wee.Gem 1.8.4 | 1 | 1% | 14 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 131451 melee ticks, 35673 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43786 sent, 39369 reached their opponent, 9741 virtual hits (24.7% of those reached).

## Melee bench: F28

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 182 over 6 battles (30.3 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 88.3 | 124 / 210 | 2.05 | 17.9% | 22094 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.9% | 124 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 37 |
| uji.Antique 1.0 | 3.2 | 11.8% | 27 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.9% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.5% | 4 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.4% | 5 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.3% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 6.2% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 1 |
| stelo.Lifestealer 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.3 | 22 / 35 | 3798 |
| 2 | 1 | 67.4 | 89.8 | 21 / 35 | 3761 |
| 3 | 1 | 65.8 | 84.8 | 18 / 35 | 3517 |
| 4 | 1 | 64.7 | 82.9 | 16 / 35 | 3432 |
| 5 | 1 | 68.0 | 91.4 | 23 / 35 | 3867 |
| 6 | 1 | 68.7 | 93.7 | 24 / 35 | 3719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 76% |
| uji.Antique 1.0 | 31 | 94% |
| qohnil.blot.BlotBot 3.61 | 18 | 78% |
| pfvicm.Sobieski 7.2.3b | 12 | 75% |
| ahr.ice.Ice 1.0.2 | 8 | 88% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| stelo.PianistNano 1.2 | 2 | 50% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 31 | 36% | 65 |
| uji.Antique 1.0 | 20 | 23% | 54 |
| pfvicm.Sobieski 7.2.3b | 14 | 16% | 22 |
| qohnil.blot.BlotBot 3.61 | 8 | 9% | 28 |
| ahr.ice.Ice 1.0.2 | 5 | 6% | 18 |
| stelo.PianistNano 1.2 | 3 | 3% | 6 |
| amk.ChumbaWumba 0.3 | 2 | 2% | 8 |
| matt.advanced.Katana 1.0 | 2 | 2% | 7 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 134924 melee ticks, 33745 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 38 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45205 sent, 40782 reached their opponent, 6435 virtual hits (15.8% of those reached).

## Melee bench: F29

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 630 over 6 battles (105.0 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 96 / 210 | 2.16 | 18.1% | 25244 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.1% | 96 |
| deewiant.Anomaly 0.2 | 2.2 | 15.6% | 51 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.7% | 44 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 10 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 7.2 | 6.3% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.4% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 13 / 35 | 4192 |
| 2 | 1 | 67.7 | 85.4 | 18 / 35 | 4086 |
| 3 | 1 | 68.2 | 87.3 | 14 / 35 | 4286 |
| 4 | 1 | 68.9 | 88.6 | 19 / 35 | 4339 |
| 5 | 1 | 68.4 | 88.9 | 17 / 35 | 4255 |
| 6 | 1 | 67.4 | 84.8 | 15 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 69 | 61% |
| zyx.mega.YersiniaPestis 3.1 | 34 | 41% |
| jok.PheonixM 0.1.2 | 18 | 83% |
| myl.micro.Troodon 1.10 | 17 | 82% |
| ap.Frederick 1.1 | 5 | 100% |
| DBall.Anarchy 0.1 | 4 | 75% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1065. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 43% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 30 | 25% | 51 |
| myl.micro.Troodon 1.10 | 16 | 13% | 28 |
| jok.PheonixM 0.1.2 | 12 | 10% | 26 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 4 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 179480 melee ticks, 56494 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 54 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 54 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 58487 sent, 53857 reached their opponent, 9036 virtual hits (16.8% of those reached).

## Melee bench: F30

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 690 over 6 battles (115.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.5 | 33 / 210 | 3.30 | 14.1% | 19485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 2.0 | 14.1% | 33 |
| catcat20.Matcha 0.006 | 2.3 | 13.6% | 52 |
| oog.melee.Capulet 1.2 | 3.2 | 13.3% | 34 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.1% | 23 |
| darkcanuck.B26354 1.06 | 4.0 | 12.8% | 40 |
| intruder.PrairieWolf 2.61 | 6.0 | 9.1% | 16 |
| ntc.Opposite 1.5 | 7.7 | 7.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.3% | 8 |
| tripphippy.Alice 1.1 | 8.2 | 6.9% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 69.5 | 5 / 35 | 3067 |
| 2 | 1 | 62.0 | 74.0 | 7 / 35 | 3434 |
| 3 | 1 | 61.7 | 76.2 | 7 / 35 | 3267 |
| 4 | 3 | 59.8 | 71.1 | 2 / 35 | 3281 |
| 5 | 3 | 60.1 | 73.3 | 2 / 35 | 3121 |
| 6 | 1 | 64.4 | 82.9 | 10 / 35 | 3315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 26 | 38% |
| oog.melee.Capulet 1.2 | 19 | 26% |
| darkcanuck.B26354 1.06 | 19 | 32% |
| stelo.PastFuture 2.3.2 | 15 | 40% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 40% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 3 | 0% |
| ntc.Opposite 1.5 | 2 | 50% |

Hadur died in 183 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 40 | 22% | 51 |
| darkcanuck.B26354 1.06 | 38 | 21% | 45 |
| stelo.PastFuture 2.3.2 | 35 | 19% | 41 |
| oog.melee.Capulet 1.2 | 30 | 16% | 38 |
| intruder.PrairieWolf 2.61 | 11 | 6% | 11 |
| tripphippy.Alice 1.1 | 9 | 5% | 9 |
| ntc.Opposite 1.5 | 7 | 4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 160913 melee ticks, 26036 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52902 sent, 48204 reached their opponent, 8450 virtual hits (17.5% of those reached).

## Melee bench: F31

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 389 over 6 battles (64.8 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.7 | 53 / 210 | 3.10 | 14.7% | 18398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 90 |
| hadur2.Hadur 3.17.1aa | 2.2 | 14.7% | 53 |
| gh.mini.Griezel 0.2 | 2.8 | 13.6% | 44 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.7% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.3% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 5 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.4% | 1 |
| fm.mammillarias 1.3 | 8.2 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.0 | 4.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 79.0 | 11 / 35 | 3332 |
| 2 | 2 | 64.2 | 81.0 | 14 / 35 | 2878 |
| 3 | 2 | 61.2 | 70.5 | 9 / 35 | 3062 |
| 4 | 3 | 61.0 | 74.3 | 2 / 35 | 3013 |
| 5 | 2 | 65.1 | 82.5 | 12 / 35 | 3393 |
| 6 | 2 | 60.4 | 73.0 | 5 / 35 | 2720 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 48 | 52% |
| gh.mini.Griezel 0.2 | 21 | 29% |
| d414.nano.Quantum 1.0.0 | 11 | 73% |
| spinnercat.micro.Tyger 0.1 | 7 | 100% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 2 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 34% | 82 |
| gh.mini.Griezel 0.2 | 42 | 26% | 51 |
| d414.nano.Quantum 1.0.0 | 28 | 18% | 31 |
| spinnercat.micro.Tyger 0.1 | 14 | 9% | 24 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 12 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 7 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 152890 melee ticks, 29618 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 91 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 91 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50610 sent, 45951 reached their opponent, 7886 virtual hits (17.2% of those reached).

## Melee bench: F32

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 420 over 6 battles (70.0 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 86.7 | 116 / 210 | 2.20 | 17.4% | 23008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 17.4% | 116 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.6% | 56 |
| apc.botM 3.0 | 3.3 | 11.5% | 17 |
| vjik.UnViolation 1.1 | 4.5 | 10.0% | 9 |
| lxx.ConceptA 0.8 | 4.8 | 9.9% | 2 |
| bayen.UbaMicro 1.4 | 5.3 | 8.9% | 1 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 1 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 4 |
| conscience.Electron 1.3g | 9.2 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.8% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 86.7 | 21 / 35 | 3786 |
| 2 | 1 | 68.3 | 92.4 | 26 / 35 | 3969 |
| 3 | 2 | 64.6 | 84.4 | 12 / 35 | 3526 |
| 4 | 1 | 65.6 | 83.5 | 20 / 35 | 3896 |
| 5 | 1 | 66.2 | 85.7 | 20 / 35 | 4088 |
| 6 | 1 | 65.7 | 87.3 | 17 / 35 | 3743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 62% |
| apc.botM 3.0 | 30 | 80% |
| vjik.UnViolation 1.1 | 16 | 94% |
| lxx.ConceptA 0.8 | 10 | 90% |
| donjezza.Jezza 1.0 | 7 | 71% |
| yk.JahMicro 1.0 | 6 | 83% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| panzer.Panzer 0.2 | 4 | 75% |

Hadur died in 97 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 44% | 92 |
| apc.botM 3.0 | 15 | 15% | 36 |
| lxx.ConceptA 0.8 | 10 | 10% | 20 |
| bayen.UbaMicro 1.4 | 8 | 8% | 15 |
| vjik.UnViolation 1.1 | 4 | 4% | 23 |
| yk.JahMicro 1.0 | 4 | 4% | 9 |
| donjezza.Jezza 1.0 | 4 | 4% | 6 |
| panzer.Panzer 0.2 | 3 | 3% | 5 |
| conscience.Electron 1.3g | 3 | 3% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 129180 melee ticks, 50562 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 44223 sent, 39613 reached their opponent, 7527 virtual hits (19.0% of those reached).

## Melee bench: F33

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.9 | 110 / 210 | 2.27 | 18.1% | 25847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.1% | 110 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 18 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 17 |
| baal.nano.N 1.42 | 6.5 | 8.5% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.6% | 8 |
| zyx.micro.Ant 1.1 | 8.2 | 6.0% | 0 |
| sanja.First 0.1 | 9.0 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 18 / 35 | 4373 |
| 2 | 1 | 68.9 | 89.8 | 22 / 35 | 4498 |
| 3 | 1 | 67.8 | 86.0 | 18 / 35 | 4246 |
| 4 | 1 | 65.8 | 80.0 | 17 / 35 | 3797 |
| 5 | 1 | 67.2 | 82.9 | 15 / 35 | 4639 |
| 6 | 1 | 68.8 | 89.5 | 20 / 35 | 4294 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 45 | 82% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 38 | 71% |
| gre.svman4.Leonidas 1.3.2 | 21 | 86% |
| labg.Cataclysm 2.05 | 18 | 83% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 33% | 71 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 25 | 25% | 53 |
| gre.svman4.Leonidas 1.3.2 | 17 | 17% | 29 |
| labg.Cataclysm 2.05 | 9 | 9% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 14 |
| baal.nano.N 1.42 | 3 | 3% | 9 |
| zyx.micro.Ant 1.1 | 3 | 3% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 171565 melee ticks, 44765 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 55 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 56035 sent, 51586 reached their opponent, 8225 virtual hits (15.9% of those reached).

## Melee bench: F34

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 424 over 6 battles (70.7 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.0 | 65 / 210 | 2.44 | 16.6% | 25279 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 17.0% | 76 |
| hadur2.Hadur 3.17.1aa | 2.0 | 16.6% | 65 |
| kid.Gladiator .7.2 | 2.3 | 16.0% | 39 |
| tcf.Reach 3 | 4.5 | 11.2% | 9 |
| jcs.Seth 1.8 | 4.5 | 11.4% | 20 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 85.4 | 9 / 35 | 4140 |
| 2 | 1 | 68.3 | 88.6 | 13 / 35 | 4576 |
| 3 | 2 | 66.4 | 83.8 | 13 / 35 | 4040 |
| 4 | 2 | 64.2 | 76.8 | 9 / 35 | 4067 |
| 5 | 3 | 67.0 | 84.1 | 12 / 35 | 4260 |
| 6 | 2 | 66.7 | 85.4 | 9 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 47% |
| kid.Gladiator .7.2 | 39 | 41% |
| jcs.Seth 1.8 | 17 | 35% |
| tcf.Reach 3 | 10 | 80% |
| ratosh.Wesco 1.4 | 2 | 50% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 37% | 91 |
| kid.Gladiator .7.2 | 53 | 36% | 64 |
| jcs.Seth 1.8 | 18 | 12% | 26 |
| tcf.Reach 3 | 11 | 7% | 18 |
| cli.Dancer 1.1 | 3 | 2% | 5 |
| ratosh.Wesco 1.4 | 3 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 173981 melee ticks, 51019 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 39 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54902 sent, 50309 reached their opponent, 8799 virtual hits (17.5% of those reached).

## Melee bench: F35

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 477 over 6 battles (79.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.8 | 29 / 210 | 3.00 | 14.6% | 19812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 141 |
| hadur2.Hadur 3.17.1aa | 2.3 | 14.6% | 29 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.4% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 12.1% | 11 |
| rz.HawkOnFire 0.1 | 4.5 | 11.8% | 4 |
| wit.Chuliath 1.0 | 6.0 | 7.4% | 1 |
| myl.nano.KomoriNinja 1.1 | 7.3 | 6.2% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 82.5 | 7 / 35 | 3525 |
| 2 | 2 | 62.7 | 78.7 | 6 / 35 | 3249 |
| 3 | 2 | 63.3 | 79.4 | 7 / 35 | 3294 |
| 4 | 3 | 60.8 | 73.3 | 2 / 35 | 3029 |
| 5 | 3 | 61.9 | 74.9 | 4 / 35 | 3346 |
| 6 | 2 | 63.2 | 78.1 | 3 / 35 | 3369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 62 | 18% |
| gh.mini.Gruwel 0.9 | 19 | 32% |
| rz.HawkOnFire 0.1 | 9 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 83% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 47% | 100 |
| gh.mini.Gruwel 0.9 | 29 | 16% | 34 |
| rz.HawkOnFire 0.1 | 27 | 15% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 27 | 15% | 30 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 144372 melee ticks, 35976 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 60 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 45759 sent, 41252 reached their opponent, 7088 virtual hits (17.2% of those reached).

## Melee bench: F36

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 6 battles (21.3 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.2 | 135 / 210 | 1.89 | 19.5% | 28903 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.5% | 135 |
| alpha.RainingFire 1.0 | 2.5 | 12.8% | 21 |
| bzdp.Pansy 2.1 | 3.0 | 12.4% | 18 |
| mz.Cork 0.1 | 4.5 | 10.8% | 8 |
| bvh.micro.Freya 0.3 | 4.8 | 10.4% | 11 |
| m3thos.Eva02 0.7.1 | 5.5 | 10.0% | 12 |
| bvh.mini.Fenrir 0.39 | 6.7 | 9.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.1% | 1 |
| dl.BetterWalls 1.0 | 9.2 | 5.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.4 | 21 / 35 | 4438 |
| 2 | 1 | 70.3 | 90.8 | 25 / 35 | 5353 |
| 3 | 1 | 67.9 | 86.0 | 20 / 35 | 4624 |
| 4 | 1 | 70.2 | 93.0 | 25 / 35 | 4695 |
| 5 | 1 | 69.1 | 88.9 | 20 / 35 | 4978 |
| 6 | 1 | 69.7 | 90.8 | 24 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 83% |
| alpha.RainingFire 1.0 | 33 | 82% |
| mz.Cork 0.1 | 30 | 83% |
| bvh.micro.Freya 0.3 | 27 | 78% |
| bvh.mini.Fenrir 0.39 | 14 | 93% |
| m3thos.Eva02 0.7.1 | 13 | 62% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 28% | 47 |
| bzdp.Pansy 2.1 | 13 | 17% | 46 |
| m3thos.Eva02 0.7.1 | 13 | 17% | 27 |
| bvh.micro.Freya 0.3 | 10 | 13% | 31 |
| mz.Cork 0.1 | 8 | 11% | 35 |
| bvh.mini.Fenrir 0.39 | 7 | 9% | 16 |
| dl.BetterWalls 1.0 | 2 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 3 |

Posture (Hadur's M records, 199 rounds): 141730 melee ticks, 42543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 48 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 0.

Targeting waves (199 rounds): 49588 sent, 45371 reached their opponent, 10214 virtual hits (22.5% of those reached).

## Melee bench: F37

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 6 battles (24.0 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.0 | 157 / 210 | 1.99 | 18.9% | 30650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.9% | 157 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.5% | 10 |
| EBBU.Sim2 1.02 | 3.8 | 9.9% | 6 |
| germ.TheMind .2 | 4.3 | 9.9% | 7 |
| agrach.Dalek 1.0 | 5.5 | 9.3% | 13 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.5% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 6.5 | 8.5% | 1 |
| mb.Beast 0.1 | 7.0 | 8.6% | 4 |
| lmk.ACPFinal 0.1 | 7.2 | 8.5% | 2 |
| skm.Ryubot 1.0 | 9.8 | 7.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.9 | 26 / 35 | 5218 |
| 2 | 1 | 66.7 | 87.3 | 25 / 35 | 4697 |
| 3 | 1 | 68.6 | 90.8 | 25 / 35 | 5378 |
| 4 | 1 | 66.4 | 85.7 | 24 / 35 | 4639 |
| 5 | 1 | 68.9 | 90.8 | 28 / 35 | 5524 |
| 6 | 1 | 68.8 | 90.5 | 29 / 35 | 5194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 28 | 100% |
| germ.TheMind .2 | 26 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 25 | 96% |
| EBBU.Sim2 1.02 | 21 | 90% |
| stelo.UntouchableNano 1.3 | 21 | 86% |
| mb.Beast 0.1 | 18 | 100% |
| skm.Ryubot 1.0 | 14 | 100% |
| lmk.ACPFinal 0.1 | 10 | 90% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 67% |

Hadur died in 54 of 210 rounds, at a mean tick of 464. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 26% | 19 |
| agrach.Dalek 1.0 | 8 | 15% | 42 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 15% | 32 |
| stelo.UntouchableNano 1.3 | 7 | 13% | 22 |
| lmk.ACPFinal 0.1 | 5 | 9% | 24 |
| mb.Beast 0.1 | 5 | 9% | 19 |
| germ.TheMind .2 | 4 | 7% | 20 |
| EBBU.Sim2 1.02 | 2 | 4% | 24 |
| skm.Ryubot 1.0 | 1 | 2% | 5 |

Posture (Hadur's M records, 201 rounds): 99743 melee ticks, 24098 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 73 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 33510 sent, 29498 reached their opponent, 9342 virtual hits (31.7% of those reached).

## Melee bench: F38

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 741 over 6 battles (123.5 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.9 | 86 / 210 | 2.63 | 16.3% | 22866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.7% | 78 |
| hadur2.Hadur 3.17.1aa | 1.8 | 16.3% | 86 |
| bvh.mini.Freya 0.55 | 3.0 | 13.1% | 14 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.2% | 17 |
| cs.Wren 1.0 | 4.7 | 10.9% | 6 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.4% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.9% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 77.8 | 13 / 35 | 3812 |
| 2 | 2 | 65.7 | 82.9 | 13 / 35 | 3877 |
| 3 | 2 | 64.8 | 81.3 | 11 / 35 | 3687 |
| 4 | 1 | 66.3 | 84.1 | 15 / 35 | 4043 |
| 5 | 2 | 65.8 | 81.3 | 18 / 35 | 3812 |
| 6 | 2 | 65.7 | 84.1 | 16 / 35 | 3635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 55 | 58% |
| bvh.mini.Freya 0.55 | 25 | 80% |
| bts.mega.Gnarly 1.4 | 23 | 70% |
| cs.Wren 1.0 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 60% |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 51 | 39% | 82 |
| bvh.mini.Freya 0.55 | 21 | 16% | 34 |
| bts.mega.Gnarly 1.4 | 17 | 13% | 32 |
| kdf.KoulDestroyer 1.0 | 16 | 12% | 19 |
| cs.Wren 1.0 | 12 | 9% | 26 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 9 |
| bzdp.BoxCar 2.0 | 2 | 2% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 1% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 142751 melee ticks, 31035 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 41 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 47066 sent, 42349 reached their opponent, 9312 virtual hits (22.0% of those reached).

## Melee bench: F39

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 726 over 6 battles (121.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 80.7 | 73 / 210 | 2.74 | 16.4% | 25575 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.2 | 16.4% | 73 |
| az.Ololobot 0.2.4 | 2.3 | 14.5% | 80 |
| bvh.fry.Freya 0.82 | 2.5 | 14.7% | 13 |
| catcat20.Lambda 0.024 | 4.0 | 11.9% | 28 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.8% | 7 |
| gimp.GimpBot 0.1 | 5.8 | 8.4% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 7.2 | 7.6% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 82.9 | 12 / 35 | 4530 |
| 2 | 1 | 63.7 | 76.8 | 12 / 35 | 4038 |
| 3 | 1 | 65.1 | 79.0 | 12 / 35 | 4580 |
| 4 | 1 | 66.1 | 84.8 | 14 / 35 | 4243 |
| 5 | 2 | 61.9 | 74.0 | 7 / 35 | 3834 |
| 6 | 1 | 66.6 | 86.7 | 16 / 35 | 4350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 58 | 43% |
| catcat20.Lambda 0.024 | 30 | 53% |
| bvh.fry.Freya 0.82 | 29 | 90% |
| winamp32.micro.MicroMacro 1.0 | 5 | 60% |
| gimp.GimpBot 0.1 | 2 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 49 | 34% | 72 |
| bvh.fry.Freya 0.82 | 39 | 27% | 60 |
| catcat20.Lambda 0.024 | 25 | 17% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 6% | 9 |
| winamp32.micro.MicroMacro 1.0 | 8 | 6% | 14 |
| apollokidd.ApolloKidd 0.9 | 5 | 3% | 8 |
| gimp.GimpBot 0.1 | 2 | 1% | 9 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 166394 melee ticks, 51640 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 76 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 76 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53775 sent, 49246 reached their opponent, 9320 virtual hits (18.9% of those reached).

## Melee bench: F40

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 384 over 6 battles (64.0 per battle, most in one battle 122). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.8 | 122 / 210 | 2.10 | 18.6% | 26396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.6% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 31 |
| mz.AntiGrav 1.0 | 3.7 | 11.3% | 13 |
| kano.gamma.KanoGamma 1.8 | 4.0 | 11.8% | 17 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.6% | 10 |
| stelo.Randomness 1.0 | 6.0 | 9.4% | 9 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 4 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.6% | 2 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 4.2% | 2 |
| sample.Corners 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.1 | 20 / 35 | 4250 |
| 2 | 1 | 69.3 | 91.4 | 22 / 35 | 4510 |
| 3 | 1 | 70.4 | 93.0 | 25 / 35 | 4767 |
| 4 | 1 | 67.5 | 86.3 | 18 / 35 | 4295 |
| 5 | 1 | 66.9 | 83.2 | 18 / 35 | 4337 |
| 6 | 1 | 68.4 | 88.6 | 19 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 70% |
| kano.gamma.KanoGamma 1.8 | 27 | 85% |
| mz.AntiGrav 1.0 | 22 | 100% |
| Polkwane.SmashMelee 1.0 | 16 | 75% |
| stelo.Randomness 1.0 | 10 | 60% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 5 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 42% | 69 |
| kano.gamma.KanoGamma 1.8 | 14 | 15% | 45 |
| stelo.Randomness 1.0 | 10 | 11% | 24 |
| Polkwane.SmashMelee 1.0 | 9 | 10% | 15 |
| alpha.BlackIce 1.0 | 7 | 8% | 12 |
| mz.AntiGrav 1.0 | 4 | 4% | 30 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 9 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 153628 melee ticks, 39703 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 114 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 114 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 51251 sent, 46679 reached their opponent, 10309 virtual hits (22.1% of those reached).

## Melee bench: F41

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 199 over 6 battles (33.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.9 | 98 / 210 | 2.09 | 17.5% | 22761 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 17.5% | 98 |
| eem.EvBotNG v12.8 | 2.0 | 16.2% | 68 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 18 |
| ary.Swarm 1.1 | 3.8 | 12.6% | 10 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.6% | 12 |
| shrub.Silver v048 | 6.2 | 8.9% | 3 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.4% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 88.3 | 17 / 35 | 3491 |
| 2 | 1 | 66.7 | 87.6 | 16 / 35 | 3531 |
| 3 | 1 | 68.3 | 90.5 | 16 / 35 | 3925 |
| 4 | 1 | 67.9 | 88.3 | 18 / 35 | 4028 |
| 5 | 1 | 66.3 | 84.4 | 15 / 35 | 3760 |
| 6 | 1 | 67.9 | 88.6 | 16 / 35 | 4026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 78 | 44% |
| lessonz.robocode.Oz 0.5.0 | 34 | 88% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| ary.Swarm 1.1 | 15 | 93% |
| shrub.Silver v048 | 7 | 57% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 60 | 53% | 93 |
| lessonz.robocode.Oz 0.5.0 | 19 | 17% | 36 |
| ary.Swarm 1.1 | 15 | 13% | 27 |
| simonton.nano.MeleeSeed 1.8 | 6 | 5% | 24 |
| shrub.Silver v048 | 5 | 4% | 14 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 157677 melee ticks, 51367 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53253 sent, 48708 reached their opponent, 8023 virtual hits (16.5% of those reached).

## Melee bench: F42

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 490 over 6 battles (81.7 per battle, most in one battle 118). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.4 | 117 / 210 | 2.13 | 18.4% | 28941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.4% | 117 |
| wompi.Wallaby 5.1 | 2.2 | 16.0% | 45 |
| ara.Shera 0.88 | 3.3 | 13.3% | 23 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 20 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 2 |
| dsw.StaticD 1.0 | 6.3 | 6.9% | 3 |
| maribo.IotaCT 1.1 | 7.3 | 6.1% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 17 / 35 | 4925 |
| 2 | 1 | 67.6 | 85.7 | 19 / 35 | 4614 |
| 3 | 1 | 68.1 | 88.6 | 20 / 35 | 4837 |
| 4 | 1 | 68.4 | 87.6 | 18 / 35 | 4811 |
| 5 | 1 | 68.3 | 86.7 | 21 / 35 | 4824 |
| 6 | 1 | 68.9 | 88.9 | 22 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 88 | 88% |
| maribo.mini.MiniQuester 0.1 | 30 | 73% |
| ara.Shera 0.88 | 20 | 60% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 33 | 34% | 50 |
| wompi.Wallaby 5.1 | 26 | 27% | 87 |
| maribo.mini.MiniQuester 0.1 | 20 | 21% | 50 |
| amz.NanoClone 1.41 | 8 | 8% | 10 |
| stelo.MirrorMicro 1.0 | 3 | 3% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| dsw.StaticD 1.0 | 0 | 0% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 166059 melee ticks, 43540 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53506 sent, 49073 reached their opponent, 10335 virtual hits (21.1% of those reached).

## Melee bench: F43

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 473 over 6 battles (78.8 per battle, most in one battle 117). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.1 | 29 / 210 | 2.79 | 15.1% | 20417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 149 |
| hadur2.Hadur 3.17.1aa | 2.0 | 15.1% | 29 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.6% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.6% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.4% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 80.0 | 2 / 35 | 3519 |
| 2 | 2 | 64.7 | 80.6 | 8 / 35 | 3111 |
| 3 | 2 | 65.3 | 81.0 | 6 / 35 | 3510 |
| 4 | 2 | 62.9 | 74.6 | 3 / 35 | 3333 |
| 5 | 2 | 65.1 | 82.5 | 4 / 35 | 3377 |
| 6 | 2 | 65.5 | 81.9 | 6 / 35 | 3567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 82 | 18% |
| brainfade.melee.Dusk 0.44 | 19 | 26% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 40% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 107 | 58% | 122 |
| brainfade.melee.Dusk 0.44 | 37 | 20% | 41 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 19 |
| dummy.micro.Sparrow 2.5 | 13 | 7% | 17 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 6 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 159561 melee ticks, 48647 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 51359 sent, 46710 reached their opponent, 8251 virtual hits (17.7% of those reached).

## Melee bench: F44

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 87 over 6 battles (14.5 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.6 | 129 / 210 | 1.85 | 19.7% | 31165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 19.7% | 129 |
| stelo.Liblix 0.3.1 | 2.0 | 16.0% | 56 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.4% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.3 | 9.8% | 5 |
| jwirde.Gort 2.0 | 4.7 | 9.6% | 3 |
| disan.Chair 2.2.0 | 6.7 | 7.4% | 1 |
| wompi.Quokka 1.6 | 7.0 | 7.7% | 3 |
| stf.PanzerGeneral 0.1 | 7.3 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 1 |
| sample.Crazy 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.2 | 19 / 35 | 4998 |
| 2 | 1 | 68.8 | 88.6 | 21 / 35 | 5016 |
| 3 | 1 | 71.3 | 94.6 | 23 / 35 | 5576 |
| 4 | 1 | 70.4 | 90.5 | 23 / 35 | 5432 |
| 5 | 1 | 70.5 | 91.7 | 22 / 35 | 5359 |
| 6 | 1 | 69.2 | 88.9 | 21 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 88 | 65% |
| tzu.TheArtOfWar 1.2 | 48 | 88% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 75% |
| jwirde.Gort 2.0 | 11 | 100% |
| wompi.Quokka 1.6 | 5 | 80% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 47 | 58% | 104 |
| tzu.TheArtOfWar 1.2 | 14 | 17% | 51 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 12% | 16 |
| wompi.Quokka 1.6 | 4 | 5% | 8 |
| jwirde.Gort 2.0 | 2 | 2% | 17 |
| disan.Chair 2.2.0 | 2 | 2% | 5 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 5 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 206 rounds): 156872 melee ticks, 47892 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 42 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55036 sent, 50651 reached their opponent, 11279 virtual hits (22.3% of those reached).

## Melee bench: F45

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 389 over 6 battles (64.8 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.2 | 85 / 210 | 2.42 | 18.2% | 29188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.17.1aa | 1.0 | 18.2% | 85 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.8% | 98 |
| jje.BagPuss 1.2 | 2.7 | 12.9% | 10 |
| sul.Lunar 1.1 | 4.3 | 10.7% | 4 |
| myl.nano.Graviton 1.10 | 4.5 | 10.6% | 5 |
| hvilela.HVilela 0.9 | 6.7 | 8.8% | 2 |
| fm.claire 1.7 | 7.2 | 8.1% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.6% | 2 |
| wit.Deep7 2.0 | 8.7 | 6.1% | 5 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 16 / 35 | 4789 |
| 2 | 1 | 65.7 | 80.3 | 12 / 35 | 4375 |
| 3 | 1 | 66.1 | 82.9 | 10 / 35 | 4628 |
| 4 | 1 | 68.2 | 85.4 | 13 / 35 | 5208 |
| 5 | 1 | 68.9 | 88.3 | 20 / 35 | 4976 |
| 6 | 1 | 68.4 | 85.7 | 14 / 35 | 5212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 43% |
| jje.BagPuss 1.2 | 18 | 72% |
| sul.Lunar 1.1 | 12 | 100% |
| myl.nano.Graviton 1.10 | 10 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 86% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 3 | 67% |
| wit.Deep7 2.0 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1548. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 50 | 38% | 0 |
| jje.BagPuss 1.2 | 33 | 25% | 73 |
| myl.nano.Graviton 1.10 | 15 | 12% | 34 |
| sul.Lunar 1.1 | 11 | 8% | 54 |
| wit.Deep7 2.0 | 6 | 5% | 11 |
| fm.claire 1.7 | 5 | 4% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 16 |
| hvilela.HVilela 0.9 | 3 | 2% | 8 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 212661 melee ticks, 90439 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 41 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 64384 sent, 59994 reached their opponent, 9684 virtual hits (16.1% of those reached).

## Melee bench: F46

hadur2.Hadur 3.17.1aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 708 over 6 battles (118.0 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 79.8 | 43 / 210 | 2.82 | 15.0% | 21089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 63 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.7% | 86 |
| hadur2.Hadur 3.17.1aa | 2.8 | 15.0% | 43 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 5 |
| cx.Princess 1.0 | 5.3 | 10.0% | 10 |
| sadoner.killer 0.2 | 5.7 | 9.4% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.5% | 1 |
| kurios.DOSexe .9a | 8.5 | 5.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.5 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 82.2 | 10 / 35 | 3502 |
| 2 | 3 | 63.4 | 80.6 | 8 / 35 | 3432 |
| 3 | 3 | 64.2 | 81.6 | 7 / 35 | 3496 |
| 4 | 3 | 62.2 | 76.8 | 4 / 35 | 3340 |
| 5 | 3 | 62.9 | 78.1 | 6 / 35 | 3538 |
| 6 | 3 | 64.1 | 79.4 | 8 / 35 | 3781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 57% |
| rsalesc.melee.Medina 0.4.5 | 34 | 18% |
| cx.Princess 1.0 | 6 | 100% |
| mz.MicroSheep 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 3 | 67% |

Hadur died in 173 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 38% | 94 |
| rsalesc.melee.Medina 0.4.5 | 61 | 35% | 68 |
| mz.MicroSheep 1.0 | 16 | 9% | 18 |
| sadoner.killer 0.2 | 12 | 7% | 13 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| cx.Princess 1.0 | 4 | 2% | 8 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 210 rounds): 155131 melee ticks, 34381 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (210 rounds): longest scan gap while four or more were alive 41 ticks (210 rounds over 8); rounds whose longest gap at any count was over 8: 210; robots dropped as dead without a death event: 0.

Targeting waves (210 rounds): 46758 sent, 42102 reached their opponent, 6830 virtual hits (16.2% of those reached).

