# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 450 over 6 battles (75.0 per battle, most in one battle 138). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.4 | 63 / 210 | 2.04 | 17.8% | 30868 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 126 |
| hadur2.Hadur 3.18aa | 2.0 | 17.8% | 63 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.4% | 3 |
| sgp.JollyNinja 3.53 | 4.0 | 11.5% | 14 |
| mz.MicroGodMelee 1 | 4.7 | 10.4% | 4 |
| lorneswork.Predator 1.0 | 5.7 | 9.4% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.0% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 87.0 | 12 / 35 | 5062 |
| 2 | 2 | 67.4 | 87.6 | 7 / 35 | 5146 |
| 3 | 2 | 68.2 | 89.8 | 8 / 35 | 5126 |
| 4 | 2 | 67.6 | 86.0 | 12 / 35 | 4921 |
| 5 | 2 | 68.4 | 89.5 | 10 / 35 | 5189 |
| 6 | 2 | 69.1 | 90.5 | 14 / 35 | 5424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 12% |
| mz.MicroGodMelee 1 | 20 | 90% |
| sgp.JollyNinja 3.53 | 16 | 56% |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 79% |
| lorneswork.Predator 1.0 | 6 | 100% |
| adt.Ar2 1.0 | 3 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 1170. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 109 | 72% | 133 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 9% | 22 |
| sgp.JollyNinja 3.53 | 13 | 9% | 17 |
| lorneswork.Predator 1.0 | 5 | 3% | 11 |
| mz.MicroGodMelee 1 | 3 | 2% | 18 |
| adt.Ar2 1.0 | 2 | 1% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 147231 melee ticks, 85983 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 50 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 46874 sent, 42038 reached their opponent, 8812 virtual hits (21.0% of those reached).

## Melee bench: F02

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 303 over 6 battles (50.5 per battle, most in one battle 146). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.1 | 88 / 210 | 2.34 | 18.0% | 29161 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.0% | 88 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.0% | 39 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.2 | 12.7% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 3.3 | 11.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.6% | 25 |
| Noran.BitchingElk 0.054 | 6.5 | 8.7% | 21 |
| sch.Simone 0.3d | 7.2 | 8.1% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.5% | 1 |
| stelo.PatternRobot 1.0 | 8.8 | 5.6% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.4 | 16 / 35 | 4916 |
| 2 | 1 | 67.8 | 86.0 | 16 / 35 | 5094 |
| 3 | 1 | 67.1 | 86.0 | 13 / 35 | 4654 |
| 4 | 1 | 66.1 | 81.0 | 12 / 35 | 4555 |
| 5 | 1 | 68.3 | 87.6 | 14 / 35 | 5314 |
| 6 | 1 | 67.3 | 84.8 | 17 / 35 | 4628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 45% |
| com.cohesiva.robocode.ManOwaR 1.0 | 31 | 61% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 54% |
| Noran.BitchingElk 0.054 | 21 | 38% |
| sch.Simone 0.3d | 15 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 27% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 19% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 17% | 29 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 13% | 32 |
| Noran.BitchingElk 0.054 | 16 | 13% | 24 |
| sch.Simone 0.3d | 6 | 5% | 19 |
| stelo.PatternRobot 1.0 | 3 | 2% | 4 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 4 |
| fullsail.SweetTea 1.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 167108 melee ticks, 45377 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 57 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 60234 sent, 55483 reached their opponent, 10002 virtual hits (18.0% of those reached).

## Melee bench: F03

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 6 battles (23.5 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.5 | 166 / 210 | 1.58 | 21.0% | 39054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 21.0% | 166 |
| radnor.DoctorBob 1.42 | 2.3 | 13.7% | 18 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.0% | 8 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 17 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 0 |
| adt.Ar1 2.1 | 6.0 | 8.0% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.1% | 0 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 95.2 | 27 / 35 | 6752 |
| 2 | 1 | 71.3 | 94.0 | 28 / 35 | 6314 |
| 3 | 1 | 70.7 | 91.4 | 26 / 35 | 6309 |
| 4 | 1 | 70.8 | 93.0 | 29 / 35 | 6147 |
| 5 | 1 | 72.0 | 96.2 | 31 / 35 | 6573 |
| 6 | 1 | 71.2 | 91.4 | 25 / 35 | 6959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 93% |
| radnor.DoctorBob 1.42 | 54 | 87% |
| kawigi.nano.Lib 1.0 | 45 | 96% |
| adt.Ar1 2.1 | 6 | 83% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 22 | 49% | 68 |
| vuen.Cake 2.51 | 8 | 18% | 67 |
| kawigi.nano.Lib 1.0 | 7 | 16% | 44 |
| adt.Ar1 2.1 | 3 | 7% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 4% | 7 |
| urdos.URDOS 1.3 | 1 | 2% | 7 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 199 rounds): 130526 melee ticks, 42960 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 39 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 2.

Targeting waves (199 rounds): 39667 sent, 35180 reached their opponent, 9345 virtual hits (26.6% of those reached).

## Melee bench: F04

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 659 over 6 battles (109.8 per battle, most in one battle 136). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.6 | 28 / 210 | 2.30 | 17.3% | 32449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.1% | 154 |
| hadur2.Hadur 3.18aa | 2.0 | 17.3% | 28 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.7% | 13 |
| TNT.TNT 0.99.1 | 4.2 | 11.0% | 11 |
| josago.Jorgito 0.16 | 4.8 | 9.1% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 7.2 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.6% | 1 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.4 | 6 / 35 | 5473 |
| 2 | 2 | 67.1 | 83.8 | 3 / 35 | 5189 |
| 3 | 2 | 67.0 | 84.4 | 3 / 35 | 5207 |
| 4 | 2 | 68.0 | 86.3 | 5 / 35 | 5370 |
| 5 | 2 | 68.5 | 87.3 | 6 / 35 | 5557 |
| 6 | 2 | 68.4 | 86.0 | 5 / 35 | 5653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 125 | 9% |
| apc.LeeroyJenkins2 1.0 | 15 | 60% |
| TNT.TNT 0.99.1 | 14 | 36% |
| tj.zombie1n 1.0.1 | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 1315. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 131 | 70% | 145 |
| apc.LeeroyJenkins2 1.0 | 24 | 13% | 32 |
| TNT.TNT 0.99.1 | 14 | 7% | 19 |
| josago.Jorgito 0.16 | 7 | 4% | 7 |
| tj.zombie1n 1.0.1 | 2 | 1% | 3 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 198297 melee ticks, 72982 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 61698 sent, 56752 reached their opponent, 8649 virtual hits (15.2% of those reached).

## Melee bench: F05

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 407 over 6 battles (67.8 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 77.5 | 27 / 210 | 3.03 | 14.7% | 21714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 112 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 55 |
| hadur2.Hadur 3.18aa | 3.0 | 14.7% | 27 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 11 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 4 |
| ms.Ares 0.19 | 5.7 | 9.1% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 74.3 | 3 / 35 | 3039 |
| 2 | 3 | 63.4 | 78.4 | 4 / 35 | 3680 |
| 3 | 3 | 63.9 | 78.7 | 5 / 35 | 3828 |
| 4 | 3 | 63.7 | 77.1 | 6 / 35 | 3868 |
| 5 | 3 | 63.0 | 76.5 | 4 / 35 | 3516 |
| 6 | 3 | 64.1 | 79.7 | 5 / 35 | 3783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 36 | 3% |
| justin.DemonicRage 3.4 | 34 | 35% |
| wompi.Numbat 2.1 | 13 | 77% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 2 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 77 | 41% | 82 |
| justin.DemonicRage 3.4 | 67 | 36% | 75 |
| wompi.Numbat 2.1 | 23 | 12% | 31 |
| axeBots.HataMoto 3.09 | 7 | 4% | 10 |
| ms.Ares 0.19 | 6 | 3% | 9 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159362 melee ticks, 33969 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 59 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 59 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 2.

Targeting waves (207 rounds): 49203 sent, 44137 reached their opponent, 7391 virtual hits (16.7% of those reached).

## Melee bench: F06

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 646 over 6 battles (107.7 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.0 | 124 / 210 | 2.08 | 19.0% | 30452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.0% | 124 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 20 |
| origin.SleepSiphon 1.7b | 2.8 | 13.6% | 35 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.2% | 18 |
| mld.Wisdom 1.0 | 4.8 | 10.1% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.8% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.9% | 6 |
| spinnercat.Omen 1.0 | 8.0 | 6.3% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.8% | 1 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 87.6 | 22 / 35 | 5072 |
| 2 | 1 | 68.8 | 88.3 | 20 / 35 | 5134 |
| 3 | 1 | 68.6 | 86.3 | 21 / 35 | 4814 |
| 4 | 1 | 67.6 | 85.7 | 16 / 35 | 4699 |
| 5 | 1 | 69.6 | 89.2 | 22 / 35 | 5226 |
| 6 | 1 | 70.6 | 91.1 | 23 / 35 | 5507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 50 | 88% |
| origin.SleepSiphon 1.7b | 42 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 77% |
| gg.Wolverine 2.0 | 16 | 94% |
| ers.nano.hawk.HawkLA 3.0m | 10 | 40% |
| mld.Wisdom 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 27% | 69 |
| jekl.StoneGhost 0.7 | 22 | 24% | 52 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 18% | 35 |
| mld.Wisdom 1.0 | 12 | 13% | 22 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 8% | 14 |
| gg.Wolverine 2.0 | 3 | 3% | 15 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 150896 melee ticks, 44662 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 32 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 2.

Targeting waves (208 rounds): 47723 sent, 42854 reached their opponent, 9775 virtual hits (22.8% of those reached).

## Melee bench: F07

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 628 over 6 battles (104.7 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 93.5 | 121 / 210 | 1.58 | 20.8% | 38602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.8% | 121 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.7% | 38 |
| rtk.Tachikoma 1.0 | 2.8 | 16.0% | 34 |
| franzor.Lizt 1.3.1 | 4.5 | 10.8% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.5% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 92.7 | 18 / 35 | 6468 |
| 2 | 1 | 71.3 | 91.7 | 14 / 35 | 6357 |
| 3 | 1 | 73.5 | 95.9 | 24 / 35 | 6835 |
| 4 | 1 | 73.1 | 94.6 | 24 / 35 | 6568 |
| 5 | 1 | 72.8 | 95.9 | 25 / 35 | 6124 |
| 6 | 1 | 71.5 | 90.5 | 16 / 35 | 6250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 83 | 66% |
| rsalesc.melee.Monk 0.3.6c | 48 | 29% |
| franzor.Lizt 1.3.1 | 37 | 76% |
| oog.melee.CapuletDroid 1.1 | 22 | 100% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 38 | 40% | 103 |
| rsalesc.melee.Monk 0.3.6c | 36 | 38% | 67 |
| franzor.Lizt 1.3.1 | 10 | 11% | 0 |
| oog.melee.CapuletDroid 1.1 | 5 | 5% | 35 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 189568 melee ticks, 96941 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 57 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 58074 sent, 53310 reached their opponent, 10885 virtual hits (20.4% of those reached).

## Melee bench: F08

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 723 over 6 battles (120.5 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.3 | 121 / 210 | 1.96 | 19.1% | 29383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.1% | 121 |
| tm.Yuugao 1.0 | 2.5 | 13.0% | 31 |
| shrub.Vapour v159 | 2.8 | 12.7% | 27 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.3% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 10.0% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 8.7% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.2% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.5% | 1 |
| SHAM.WOW 1.4 | 9.0 | 5.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.1 | 22 / 35 | 4876 |
| 2 | 1 | 67.9 | 88.3 | 22 / 35 | 4453 |
| 3 | 1 | 68.5 | 87.6 | 20 / 35 | 4977 |
| 4 | 1 | 67.6 | 85.1 | 16 / 35 | 4987 |
| 5 | 1 | 68.7 | 89.8 | 18 / 35 | 4825 |
| 6 | 1 | 70.1 | 94.0 | 23 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 50 | 68% |
| shrub.Vapour v159 | 40 | 68% |
| Krabb.sliNk.Garm 0.9u | 28 | 64% |
| com.spp.robocode.MostlyHarmless 010 | 24 | 92% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 90% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 23 | 24% | 57 |
| shrub.Vapour v159 | 22 | 23% | 53 |
| Krabb.sliNk.Garm 0.9u | 20 | 21% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 11% | 28 |
| m3thos.Eva00 1.1 | 6 | 6% | 12 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 17 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 1 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 151330 melee ticks, 46388 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 49985 sent, 45090 reached their opponent, 8637 virtual hits (19.2% of those reached).

## Melee bench: F09

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 711 over 6 battles (118.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 71.4 | 29 / 210 | 3.57 | 14.0% | 20749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 122 |
| hadur2.Hadur 3.18aa | 2.3 | 14.0% | 29 |
| kc.micro.Figment 1.0 | 2.7 | 13.6% | 18 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.7% | 23 |
| yagami.Tidus 0.11 | 4.5 | 11.0% | 2 |
| mc2.enemy.Original 0.9 | 6.3 | 9.0% | 9 |
| dft.Calliope 5.6 | 6.7 | 8.2% | 7 |
| step.nanoPri 1.0 | 8.8 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.0 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.9 | 67.9 | 4 / 35 | 3424 |
| 2 | 2 | 60.2 | 69.8 | 5 / 35 | 3322 |
| 3 | 3 | 60.3 | 68.9 | 2 / 35 | 3350 |
| 4 | 2 | 63.0 | 74.6 | 8 / 35 | 3658 |
| 5 | 2 | 60.5 | 71.1 | 2 / 35 | 3368 |
| 6 | 2 | 63.6 | 76.2 | 8 / 35 | 3627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 9% |
| kc.micro.Figment 1.0 | 21 | 67% |
| pedersen.Grishnakh 1.0 | 10 | 50% |
| mc2.enemy.Original 0.9 | 7 | 29% |
| dft.Calliope 5.6 | 4 | 75% |
| yagami.Tidus 0.11 | 2 | 50% |

Hadur died in 187 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 72 | 39% | 77 |
| yagami.Tidus 0.11 | 32 | 17% | 33 |
| kc.micro.Figment 1.0 | 27 | 14% | 44 |
| mc2.enemy.Original 0.9 | 19 | 10% | 22 |
| pedersen.Grishnakh 1.0 | 12 | 6% | 12 |
| robar.nano.Assertive_Melee 0.2 | 7 | 4% | 7 |
| dft.Calliope 5.6 | 6 | 3% | 8 |
| step.nanoPri 1.0 | 4 | 2% | 5 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 142345 melee ticks, 35098 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 65 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 48810 sent, 44097 reached their opponent, 6571 virtual hits (14.9% of those reached).

## Melee bench: F10

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 185 over 6 battles (30.8 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 95.6 | 166 / 210 | 1.40 | 20.6% | 33568 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.6% | 166 |
| ne.Chimera 1.2 | 2.5 | 13.4% | 7 |
| DTF.Kludgy 1.2b | 2.5 | 13.5% | 14 |
| ejb.Polaris 1.0.1 | 4.2 | 11.6% | 15 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.6% | 6 |
| vStar.RAFzilla 2.15 | 5.7 | 10.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.2% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.1% | 1 |
| sam.Samspin 1.0 | 8.7 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.2 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 97.1 | 31 / 35 | 5721 |
| 2 | 1 | 70.5 | 94.6 | 24 / 35 | 5462 |
| 3 | 1 | 71.4 | 95.2 | 27 / 35 | 5870 |
| 4 | 1 | 70.6 | 94.3 | 28 / 35 | 5556 |
| 5 | 1 | 70.6 | 96.5 | 26 / 35 | 5199 |
| 6 | 1 | 71.7 | 95.6 | 30 / 35 | 5760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 84% |
| ejb.Polaris 1.0.1 | 41 | 78% |
| ne.Chimera 1.2 | 41 | 95% |
| vStar.RAFzilla 2.15 | 26 | 96% |
| tvv.micro.Antares 1.1.1 | 15 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |
| kurios.DOSexe .9b | 1 | 0% |

Hadur died in 44 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 36% | 60 |
| ejb.Polaris 1.0.1 | 13 | 30% | 58 |
| ne.Chimera 1.2 | 9 | 20% | 41 |
| kurios.DOSexe .9b | 3 | 7% | 11 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 13 |
| vStar.RAFzilla 2.15 | 1 | 2% | 25 |
| sam.Samspin 1.0 | 0 | 0% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 199 rounds): 145057 melee ticks, 51606 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 106 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (199 rounds): longest scan gap while four or more were alive 106 ticks (199 rounds over 8); rounds whose longest gap at any count was over 8: 199; robots dropped as dead without a death event: 5.

Targeting waves (199 rounds): 47483 sent, 42854 reached their opponent, 8516 virtual hits (19.9% of those reached).

## Melee bench: F11

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 233 over 6 battles (38.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.1 | 61 / 210 | 3.06 | 15.5% | 22777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.5 | 15.5% | 61 |
| rz.Aleph 0.34 | 1.5 | 16.1% | 68 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 22 |
| djc.DynaBot 0.1.1 | 4.3 | 10.6% | 11 |
| rdt199.Warlord 0.73 | 5.2 | 9.8% | 18 |
| br2.MobyDickBot 1.6 | 6.0 | 9.0% | 12 |
| uji.YellohFellah 1.0 | 6.5 | 8.7% | 15 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.9% | 2 |
| stelo.MirrorNano 1.3 | 9.5 | 5.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 76.8 | 10 / 35 | 3677 |
| 2 | 2 | 60.0 | 70.2 | 6 / 35 | 3309 |
| 3 | 1 | 67.1 | 81.9 | 19 / 35 | 4373 |
| 4 | 2 | 62.6 | 78.1 | 6 / 35 | 3490 |
| 5 | 2 | 63.1 | 76.5 | 7 / 35 | 3782 |
| 6 | 1 | 65.1 | 79.4 | 13 / 35 | 4146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 45 | 38% |
| uji.YellohFellah 1.0 | 20 | 90% |
| cx.mini.Nimrod 0.55 | 16 | 63% |
| djc.DynaBot 0.1.1 | 10 | 40% |
| br2.MobyDickBot 1.6 | 9 | 89% |
| rdt199.Warlord 0.73 | 8 | 50% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 151 of 210 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 57 | 38% | 76 |
| cx.mini.Nimrod 0.55 | 27 | 18% | 39 |
| djc.DynaBot 0.1.1 | 19 | 13% | 25 |
| rdt199.Warlord 0.73 | 16 | 11% | 25 |
| uji.YellohFellah 1.0 | 9 | 6% | 20 |
| br2.MobyDickBot 1.6 | 7 | 5% | 10 |
| KiraNL.Chupacabra 0.4 | 7 | 5% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 3% | 5 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 158620 melee ticks, 40195 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 57 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 51912 sent, 47041 reached their opponent, 6716 virtual hits (14.3% of those reached).

## Melee bench: F12

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 149 over 6 battles (24.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.7 | 128 / 210 | 2.02 | 18.3% | 23019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.3% | 128 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.8% | 26 |
| nat.PallasHawk 1.0 | 3.2 | 12.5% | 23 |
| darkcanuck.Leon 1.01 | 3.5 | 12.3% | 16 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 13 |
| jrm.Test0 1.0 | 6.0 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.0% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.4% | 2 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.9% | 1 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 86.3 | 20 / 35 | 3375 |
| 2 | 1 | 67.6 | 86.0 | 22 / 35 | 4013 |
| 3 | 1 | 69.1 | 93.0 | 24 / 35 | 3941 |
| 4 | 1 | 66.5 | 87.3 | 19 / 35 | 3515 |
| 5 | 1 | 67.6 | 87.9 | 18 / 35 | 4144 |
| 6 | 1 | 68.8 | 91.4 | 25 / 35 | 4031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 78% |
| nat.PallasHawk 1.0 | 46 | 74% |
| darkcanuck.Leon 1.01 | 38 | 82% |
| brainfade.melee.Genghis 0.36 | 10 | 70% |
| jaybot.bots.Oddball 4.0 | 10 | 90% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 2 | 50% |
| stuff.Vlad 0.1 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 26 | 31% | 61 |
| nat.PallasHawk 1.0 | 17 | 20% | 50 |
| darkcanuck.Leon 1.01 | 10 | 12% | 43 |
| brainfade.melee.Genghis 0.36 | 10 | 12% | 21 |
| jrm.Test0 1.0 | 9 | 11% | 13 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 9 |
| jaybot.bots.Oddball 4.0 | 3 | 4% | 5 |
| jp.Perpy 16.0 | 3 | 4% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

Posture (Hadur's M records, 200 rounds): 129698 melee ticks, 37790 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45031 sent, 40271 reached their opponent, 6831 virtual hits (17.0% of those reached).

## Melee bench: F13

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 330 over 6 battles (55.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 82.1 | 60 / 210 | 2.61 | 15.8% | 23686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.4% | 84 |
| ags.Glacier 0.2.11 | 1.8 | 16.4% | 42 |
| hadur2.Hadur 3.18aa | 2.3 | 15.8% | 60 |
| shinh.Entangled 0.3 | 4.2 | 12.3% | 15 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.5% | 9 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 4.9% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.9 | 79.4 | 8 / 35 | 4130 |
| 2 | 3 | 63.7 | 80.0 | 8 / 35 | 3635 |
| 3 | 2 | 64.9 | 81.3 | 12 / 35 | 3828 |
| 4 | 3 | 64.9 | 84.4 | 7 / 35 | 3823 |
| 5 | 1 | 66.9 | 84.8 | 14 / 35 | 4545 |
| 6 | 2 | 64.8 | 82.9 | 11 / 35 | 3725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 54 | 59% |
| mn.Combat 3.25.0 | 43 | 21% |
| shinh.Entangled 0.3 | 18 | 61% |
| gh.micro.Gruweltje 0.7 | 8 | 63% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 38% | 67 |
| ags.Glacier 0.2.11 | 45 | 30% | 76 |
| shinh.Entangled 0.3 | 28 | 18% | 40 |
| gh.micro.Gruweltje 0.7 | 12 | 8% | 16 |
| stelo.Wang 1.0 | 4 | 3% | 6 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 148864 melee ticks, 44915 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 41 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 3.

Targeting waves (209 rounds): 44542 sent, 39421 reached their opponent, 6800 virtual hits (17.2% of those reached).

## Melee bench: F14

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 170 over 6 battles (28.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.5 | 152 / 210 | 1.58 | 20.4% | 33905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.4% | 152 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.7% | 17 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.4% | 28 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.5% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.5% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.4% | 5 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.7 | 8.6% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.7 | 8.0% | 1 |
| pa.Improved 1.0 | 9.0 | 5.7% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.0 | 26 / 35 | 5425 |
| 2 | 1 | 71.1 | 92.7 | 28 / 35 | 5889 |
| 3 | 1 | 71.9 | 95.2 | 29 / 35 | 5944 |
| 4 | 1 | 71.5 | 94.6 | 25 / 35 | 5807 |
| 5 | 1 | 69.6 | 90.5 | 19 / 35 | 5780 |
| 6 | 1 | 70.0 | 94.3 | 25 / 35 | 5060 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 94% |
| catcat20.shape.Theta 0.018 | 52 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 17 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| pa.Improved 1.0 | 2 | 50% |

Hadur died in 59 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 23 | 39% | 57 |
| simonton.micro.Sprout 1.1.3 | 18 | 31% | 82 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 10% | 24 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 23 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 7% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 10 |
| pa.Improved 1.0 | 1 | 2% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 144758 melee ticks, 50595 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 25 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 45841 sent, 41196 reached their opponent, 10178 virtual hits (24.7% of those reached).

## Melee bench: F15

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 258 over 6 battles (43.0 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.4 | 110 / 210 | 2.31 | 18.3% | 29165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.3% | 110 |
| mld.DustBunny 3.8 | 2.7 | 13.2% | 10 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.7% | 20 |
| emp.Yngwie 1.11 | 3.5 | 12.8% | 47 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.9% | 12 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.5% | 10 |
| lambdaxy.TBot 0.1 | 7.3 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.6% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.7 | 13 / 35 | 4722 |
| 2 | 1 | 69.3 | 87.3 | 23 / 35 | 5128 |
| 3 | 1 | 67.6 | 84.8 | 17 / 35 | 4845 |
| 4 | 1 | 69.5 | 89.8 | 23 / 35 | 4922 |
| 5 | 1 | 67.6 | 85.7 | 15 / 35 | 4812 |
| 6 | 1 | 68.1 | 85.1 | 19 / 35 | 4736 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 67% |
| mld.DustBunny 3.8 | 29 | 93% |
| kawigi.micro.Shiz 1.1 | 28 | 86% |
| cb.nano.Insomnia 1.0 | 16 | 75% |
| kawigi.robot.Girl 1.2 | 13 | 92% |

Hadur died in 102 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 34% | 76 |
| kawigi.micro.Shiz 1.1 | 18 | 18% | 45 |
| cb.nano.Insomnia 1.0 | 18 | 18% | 19 |
| mld.DustBunny 3.8 | 13 | 13% | 44 |
| kawigi.robot.Girl 1.2 | 8 | 8% | 14 |
| divineomega.TrialBot 0.003 | 3 | 3% | 6 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 4 |
| lambdaxy.TBot 0.1 | 2 | 2% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 162860 melee ticks, 44714 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 49 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54747 sent, 49939 reached their opponent, 8307 virtual hits (16.6% of those reached).

## Melee bench: F16

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 762 over 6 battles (127.0 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.6 | 102 / 210 | 2.48 | 18.1% | 30714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.2 | 18.1% | 102 |
| gh.Griezel 0.5.2 | 1.8 | 16.5% | 53 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 31 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.6% | 3 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.8% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 4 |
| repositorio.NanoStep 1.0 | 8.5 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.9 | 17 / 35 | 5189 |
| 2 | 1 | 66.6 | 81.9 | 14 / 35 | 4712 |
| 3 | 1 | 69.3 | 86.0 | 20 / 35 | 5479 |
| 4 | 1 | 70.0 | 88.3 | 22 / 35 | 5538 |
| 5 | 1 | 68.1 | 84.1 | 14 / 35 | 5209 |
| 6 | 2 | 66.2 | 79.4 | 15 / 35 | 4587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 66 | 71% |
| techdude.forest.FlamingForest 1.1 | 35 | 63% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 86% |
| stelo.IntrinsicVolatility 1.4 | 9 | 89% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 50% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 37 | 32% | 90 |
| techdude.forest.FlamingForest 1.1 | 18 | 16% | 35 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 14% | 26 |
| bvh.fnr.Fenrir 0.36l | 15 | 13% | 21 |
| stelo.IntrinsicVolatility 1.4 | 11 | 10% | 16 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 11 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 176046 melee ticks, 58084 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 48 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 57652 sent, 52917 reached their opponent, 9071 virtual hits (17.1% of those reached).

## Melee bench: F17

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 809 over 6 battles (134.8 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.0 | 94 / 210 | 2.44 | 18.4% | 32989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.4% | 94 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.6% | 37 |
| et.Predator 1.8 | 3.2 | 13.5% | 22 |
| cx.BlestPain 1.41 | 3.2 | 13.2% | 46 |
| ahf.NanoAndrew .4 | 5.0 | 10.1% | 6 |
| maribo.melee.BMV 0.1 | 6.5 | 8.8% | 2 |
| nic.Nicator 2.4 | 6.5 | 8.5% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 80.6 | 13 / 35 | 5038 |
| 2 | 1 | 69.8 | 87.9 | 19 / 35 | 5633 |
| 3 | 1 | 69.4 | 87.0 | 20 / 35 | 5652 |
| 4 | 1 | 69.2 | 85.7 | 15 / 35 | 5943 |
| 5 | 1 | 67.6 | 81.3 | 12 / 35 | 5647 |
| 6 | 1 | 67.3 | 81.3 | 15 / 35 | 5076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 51 | 75% |
| et.Predator 1.8 | 44 | 75% |
| cx.BlestPain 1.41 | 41 | 32% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| ahf.NanoAndrew .4 | 3 | 100% |
| nic.Nicator 2.4 | 2 | 100% |
| tex.Longbot 0.4 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 39 | 32% | 57 |
| oog.melee.Mercutio 1.0 | 27 | 22% | 52 |
| et.Predator 1.8 | 23 | 19% | 58 |
| ahf.NanoAndrew .4 | 15 | 12% | 19 |
| maribo.melee.BMV 0.1 | 8 | 7% | 11 |
| nic.Nicator 2.4 | 2 | 2% | 5 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 161253 melee ticks, 61510 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 46 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 54623 sent, 49763 reached their opponent, 10988 virtual hits (22.1% of those reached).

## Melee bench: F18

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 470 over 6 battles (78.3 per battle, most in one battle 147). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.4 | 124 / 210 | 1.86 | 19.5% | 29713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.5% | 124 |
| morbid.MorbidPriest 1.0 | 2.2 | 14.0% | 46 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.3% | 18 |
| uji.DBH 1.1 | 3.8 | 11.1% | 11 |
| sigterm.Sigterm 1.0 | 5.8 | 8.6% | 3 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.4% | 1 |
| ratosh.Nobo 0.21 | 6.3 | 8.2% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 6.7% | 1 |
| stelo.WangRobot 1.0 | 8.8 | 6.2% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.7 | 19 / 35 | 5016 |
| 2 | 1 | 70.2 | 94.3 | 23 / 35 | 4970 |
| 3 | 1 | 68.5 | 86.7 | 21 / 35 | 4851 |
| 4 | 1 | 70.1 | 90.8 | 23 / 35 | 5137 |
| 5 | 1 | 68.6 | 88.3 | 19 / 35 | 4925 |
| 6 | 1 | 68.8 | 90.8 | 19 / 35 | 4814 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 68 | 65% |
| uji.DBH 1.1 | 31 | 84% |
| agd.Mooserwirt2 2.7 | 27 | 70% |
| sigterm.Sigterm 1.0 | 17 | 82% |
| spinnercat.Robovirus 2.718 | 12 | 92% |
| stelo.WangRobot 1.0 | 7 | 43% |
| ratosh.Nobo 0.21 | 4 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 40% | 81 |
| agd.Mooserwirt2 2.7 | 17 | 19% | 38 |
| uji.DBH 1.1 | 12 | 14% | 32 |
| sigterm.Sigterm 1.0 | 5 | 6% | 16 |
| stelo.WangRobot 1.0 | 5 | 6% | 10 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 17 |
| ratosh.Nobo 0.21 | 4 | 5% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 5% | 8 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 143419 melee ticks, 53417 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 53 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 53 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 5.

Targeting waves (207 rounds): 48568 sent, 43634 reached their opponent, 9415 virtual hits (21.6% of those reached).

## Melee bench: F19

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 236 over 6 battles (39.3 per battle, most in one battle 110). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.0 | 95.9 | 185 / 210 | 1.37 | 21.9% | 36974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 21.9% | 185 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 14 |
| mld.Infinity 2.2 | 3.5 | 12.2% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.7 | 12.2% | 4 |
| erdnis.Rover 0.3 | 4.8 | 10.6% | 3 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.1% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 93.0 | 30 / 35 | 6102 |
| 2 | 1 | 73.0 | 97.1 | 33 / 35 | 5841 |
| 3 | 1 | 73.0 | 96.5 | 31 / 35 | 6118 |
| 4 | 1 | 73.3 | 96.2 | 30 / 35 | 6320 |
| 5 | 1 | 73.7 | 97.8 | 31 / 35 | 6585 |
| 6 | 1 | 72.6 | 94.9 | 30 / 35 | 6008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 100 | 97% |
| mld.Infinity 2.2 | 32 | 100% |
| krillr.mini.JointStrike 2.0.0 | 26 | 96% |
| erdnis.Rover 0.3 | 14 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |

Hadur died in 26 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 13 | 50% | 75 |
| krillr.mini.JointStrike 2.0.0 | 5 | 19% | 39 |
| erdnis.Rover 0.3 | 2 | 8% | 24 |
| mld.Infinity 2.2 | 1 | 4% | 31 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 16 |
| mbh.Mbh 0.1 | 1 | 4% | 11 |
| pbg.R2D2 1.0 | 1 | 4% | 7 |
| pac.ABC 2.1 | 1 | 4% | 6 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 200 rounds): 125893 melee ticks, 45312 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 459 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 299 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 2.

Targeting waves (200 rounds): 43420 sent, 38796 reached their opponent, 9325 virtual hits (24.0% of those reached).

## Melee bench: F20

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 527 over 6 battles (87.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.8 | 128 / 210 | 1.83 | 20.2% | 34170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.2% | 128 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 42 |
| fwb.Nine 1.0.1 | 3.5 | 11.5% | 13 |
| catcat20.Rabbit 0.001 | 3.7 | 11.6% | 22 |
| nz.jdc.nano.GridFu 1.0 | 5.0 | 9.6% | 0 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 8.2 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.7 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.0 | 20 / 35 | 5483 |
| 2 | 1 | 70.1 | 88.9 | 19 / 35 | 5987 |
| 3 | 1 | 72.3 | 93.7 | 26 / 35 | 6308 |
| 4 | 1 | 70.3 | 91.4 | 19 / 35 | 5602 |
| 5 | 1 | 71.1 | 95.2 | 26 / 35 | 5404 |
| 6 | 1 | 69.2 | 88.6 | 18 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 74% |
| catcat20.Rabbit 0.001 | 46 | 72% |
| fwb.Nine 1.0.1 | 35 | 86% |
| nz.jdc.nano.GridFu 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 0% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 41 | 47% | 85 |
| fwb.Nine 1.0.1 | 18 | 21% | 29 |
| catcat20.Rabbit 0.001 | 17 | 20% | 51 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 11 |
| nz.jdc.nano.GridFu 1.0 | 2 | 2% | 17 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 170214 melee ticks, 54068 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 31 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 31 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 54007 sent, 49142 reached their opponent, 11277 virtual hits (22.9% of those reached).

## Melee bench: F21

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 714 over 6 battles (119.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.2 | 111 / 210 | 1.80 | 19.9% | 33967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.9% | 111 |
| eem.EvBot v4.6.16 | 2.0 | 16.9% | 69 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 8 |
| eld.Hmm 1.0 | 5.2 | 8.4% | 10 |
| oa.weak.BotherBot 0.1 | 6.3 | 7.4% | 0 |
| fire219.CatBot 1.0 | 6.8 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.7 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.2 | 5.1% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 15 / 35 | 5622 |
| 2 | 1 | 71.4 | 93.3 | 21 / 35 | 5937 |
| 3 | 1 | 70.8 | 92.7 | 22 / 35 | 5602 |
| 4 | 1 | 70.8 | 91.7 | 14 / 35 | 6088 |
| 5 | 1 | 69.5 | 89.5 | 21 / 35 | 5166 |
| 6 | 1 | 70.1 | 89.8 | 18 / 35 | 5552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 110 | 59% |
| cf.RiO.RiOx 4.2.1 | 26 | 85% |
| dummy.mini.Scimitar 1.01 | 23 | 70% |
| eld.Hmm 1.0 | 14 | 36% |
| oa.weak.BotherBot 0.1 | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1310. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 52 | 50% | 101 |
| dummy.mini.Scimitar 1.01 | 21 | 20% | 49 |
| cf.RiO.RiOx 4.2.1 | 11 | 10% | 27 |
| eld.Hmm 1.0 | 11 | 10% | 27 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 186141 melee ticks, 75802 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 47 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 54484 sent, 49778 reached their opponent, 8708 virtual hits (17.5% of those reached).

## Melee bench: F22

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 327 over 6 battles (54.5 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 100 / 210 | 2.00 | 18.6% | 29940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.6% | 100 |
| pe.SandboxDT 2.71m | 2.2 | 16.1% | 59 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.5% | 21 |
| jlm.javaDisturbance 0.59 | 3.7 | 13.4% | 27 |
| bigpete.Stewie 1.0 | 5.0 | 9.9% | 3 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 21 / 35 | 5035 |
| 2 | 1 | 66.9 | 84.4 | 10 / 35 | 4679 |
| 3 | 1 | 69.4 | 88.3 | 18 / 35 | 5093 |
| 4 | 1 | 68.8 | 90.2 | 15 / 35 | 5032 |
| 5 | 1 | 70.3 | 92.1 | 20 / 35 | 5342 |
| 6 | 1 | 68.6 | 87.9 | 16 / 35 | 4759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 61 | 43% |
| jlm.javaDisturbance 0.59 | 48 | 65% |
| kvk.HebusLeTroll 0.35 | 36 | 94% |
| bigpete.Stewie 1.0 | 9 | 78% |
| yk.JahRoslav 1.1 | 2 | 50% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 0% |

Hadur died in 113 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 51 | 45% | 85 |
| jlm.javaDisturbance 0.59 | 29 | 26% | 55 |
| kvk.HebusLeTroll 0.35 | 18 | 16% | 45 |
| bigpete.Stewie 1.0 | 6 | 5% | 16 |
| tad.Dalek98 0.98 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| pbg.NinjaX 1.2 | 2 | 2% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 162849 melee ticks, 48059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 55 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 52394 sent, 47698 reached their opponent, 8025 virtual hits (16.8% of those reached).

## Melee bench: F23

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 663 over 6 battles (110.5 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.4 | 167 / 210 | 1.50 | 21.3% | 35395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 21.3% | 167 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 29 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.0% | 1 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.3% | 1 |
| cw.megas.Blade 0.8 | 6.3 | 8.4% | 0 |
| sample.Walls 1.0 | 7.7 | 7.7% | 2 |
| cli.WasteOfAmmo 1.0 | 9.5 | 2.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.5 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 92.7 | 26 / 35 | 6012 |
| 2 | 1 | 73.1 | 97.1 | 29 / 35 | 6168 |
| 3 | 1 | 72.2 | 94.6 | 29 / 35 | 5635 |
| 4 | 1 | 73.0 | 96.2 | 29 / 35 | 5682 |
| 5 | 1 | 72.3 | 93.3 | 29 / 35 | 5870 |
| 6 | 1 | 71.9 | 92.4 | 25 / 35 | 6028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 102 | 87% |
| cre.Karolos 0.32 | 47 | 96% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| stelo.AreaTargetingBot 1.1 | 7 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 20 | 41% | 106 |
| cre.Karolos 0.32 | 18 | 37% | 58 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 4% | 6 |
| stelo.RamTrackSurfer 1.2 | 1 | 2% | 16 |
| sample.Walls 1.0 | 1 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 1 | 2% | 0 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 123777 melee ticks, 50247 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 56 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 39709 sent, 35056 reached their opponent, 10553 virtual hits (30.1% of those reached).

## Melee bench: F24

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 621 over 6 battles (103.5 per battle, most in one battle 135). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 80.4 | 64 / 210 | 2.77 | 16.0% | 22712 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 16.0% | 64 |
| rz.GlowBlowMelee 1.4 | 2.7 | 14.1% | 49 |
| davidalves.Phoenix 0.54 | 3.5 | 12.7% | 37 |
| florent.XSeries.X2 0.12 | 3.5 | 13.2% | 31 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.6% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.2 | 7.5% | 3 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 5.1% | 1 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 77.1 | 10 / 35 | 3732 |
| 2 | 1 | 63.0 | 76.8 | 8 / 35 | 3689 |
| 3 | 1 | 63.5 | 75.6 | 13 / 35 | 3485 |
| 4 | 1 | 64.1 | 82.5 | 6 / 35 | 3890 |
| 5 | 1 | 65.4 | 82.9 | 11 / 35 | 3831 |
| 6 | 1 | 66.9 | 87.3 | 16 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 41 | 46% |
| davidalves.Phoenix 0.54 | 38 | 47% |
| florent.XSeries.X2 0.12 | 21 | 33% |
| pedersen.Ugluk 1.1.1 | 13 | 54% |
| oog.melee.Corsair 1.0 | 11 | 64% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 25% | 54 |
| davidalves.Phoenix 0.54 | 33 | 21% | 48 |
| florent.XSeries.X2 0.12 | 30 | 19% | 38 |
| pedersen.Ugluk 1.1.1 | 24 | 16% | 28 |
| oog.melee.Corsair 1.0 | 10 | 6% | 21 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 9 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
| as.FrankTheTank 1.3 | 1 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 2 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 139544 melee ticks, 41811 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 1.

Targeting waves (206 rounds): 47483 sent, 42380 reached their opponent, 8110 virtual hits (19.1% of those reached).

## Melee bench: F25

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 472 over 6 battles (78.7 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.2 | 132 / 210 | 2.15 | 18.3% | 23070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.3% | 132 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.4% | 11 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 13 |
| jdw.Hurricane 1.4 | 3.8 | 11.3% | 21 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.4% | 12 |
| ds.Oo 2.2 | 5.7 | 9.4% | 16 |
| awesomeness.Elite 1.0 | 6.8 | 7.4% | 1 |
| adt.Ar2 1.1 | 8.2 | 6.7% | 3 |
| gjr.Cephalosporin 0.1 | 8.8 | 6.2% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.4 | 20 / 35 | 3763 |
| 2 | 1 | 69.1 | 92.1 | 24 / 35 | 4116 |
| 3 | 1 | 66.6 | 83.2 | 20 / 35 | 3721 |
| 4 | 1 | 67.4 | 85.7 | 21 / 35 | 3911 |
| 5 | 1 | 68.7 | 92.1 | 26 / 35 | 3607 |
| 6 | 1 | 67.4 | 86.0 | 21 / 35 | 3952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 92% |
| voidious.micro.BlitzBat 1.05 | 43 | 91% |
| jdw.Hurricane 1.4 | 20 | 85% |
| ds.Oo 2.2 | 17 | 71% |
| gre.svman4.Morfeas 1.4.1 | 11 | 73% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 16 | 20% | 50 |
| ds.Oo 2.2 | 16 | 20% | 31 |
| voidious.micro.BlitzBat 1.05 | 15 | 19% | 44 |
| jdw.Hurricane 1.4 | 14 | 17% | 33 |
| gre.svman4.Morfeas 1.4.1 | 8 | 10% | 22 |
| awesomeness.Elite 1.0 | 5 | 6% | 11 |
| adt.Ar2 1.1 | 3 | 4% | 8 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 127939 melee ticks, 28106 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 26 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 45980 sent, 40982 reached their opponent, 6985 virtual hits (17.0% of those reached).

## Melee bench: F26

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 314 over 6 battles (52.3 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.0 | 132 / 210 | 1.72 | 20.5% | 38107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.5% | 132 |
| ak.Fermat 2.0 | 2.0 | 14.5% | 28 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 21 |
| lrem.Spectre 0.4.4 | 3.7 | 12.3% | 21 |
| js.PinBall 1.6 | 5.0 | 10.3% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 8.8% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.2% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.4 | 23 / 35 | 6125 |
| 2 | 1 | 70.8 | 91.7 | 22 / 35 | 6271 |
| 3 | 1 | 71.3 | 90.8 | 19 / 35 | 6401 |
| 4 | 1 | 71.8 | 93.0 | 24 / 35 | 6515 |
| 5 | 1 | 71.7 | 93.7 | 23 / 35 | 6419 |
| 6 | 1 | 71.0 | 90.2 | 21 / 35 | 6376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 63 | 73% |
| shu.nitro.LENIN .T34 | 43 | 77% |
| lrem.Spectre 0.4.4 | 34 | 85% |
| js.PinBall 1.6 | 13 | 85% |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 33 | 41% | 69 |
| shu.nitro.LENIN .T34 | 17 | 21% | 56 |
| lrem.Spectre 0.4.4 | 12 | 15% | 38 |
| js.PinBall 1.6 | 8 | 10% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 10 |
| gh.mini.GrubbmOne 1.0 | 2 | 3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 9 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162002 melee ticks, 50482 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 53308 sent, 48482 reached their opponent, 12196 virtual hits (25.2% of those reached).

## Melee bench: F27

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 184 over 6 battles (30.7 per battle, most in one battle 107). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 153 / 210 | 2.21 | 19.6% | 31666 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.2 | 19.6% | 153 |
| mk.Alpha 0.2.1 | 1.8 | 14.5% | 35 |
| EH.Eagle 1.0.6 | 3.0 | 11.2% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 4.7 | 9.8% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.5% | 5 |
| wee.Gem 1.8.4 | 6.3 | 8.8% | 7 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.3% | 1 |
| joe.ADinosaur 1.0 | 7.2 | 7.7% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.6% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 56.5 | 46.3 | 11 / 35 | 4415 |
| 2 | 1 | 72.2 | 96.2 | 31 / 35 | 5832 |
| 3 | 1 | 71.6 | 94.0 | 27 / 35 | 5821 |
| 4 | 1 | 70.5 | 92.1 | 27 / 35 | 5414 |
| 5 | 1 | 69.7 | 92.4 | 27 / 35 | 4605 |
| 6 | 1 | 72.1 | 98.1 | 30 / 35 | 5579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 103 | 88% |
| EH.Eagle 1.0.6 | 30 | 97% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| wee.Gem 1.8.4 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 36% | 92 |
| cs.Grudge 1.0 | 11 | 19% | 12 |
| throxbot.ThroxBot 0.1 | 5 | 9% | 18 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 9% | 17 |
| EH.Eagle 1.0.6 | 4 | 7% | 27 |
| joe.ADinosaur 1.0 | 4 | 7% | 10 |
| wee.Gem 1.8.4 | 3 | 5% | 12 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 17 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 130688 melee ticks, 39572 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 57 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 42794 sent, 38070 reached their opponent, 9555 virtual hits (25.1% of those reached).

## Melee bench: F28

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 796 over 6 battles (132.7 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.8 | 133 / 210 | 1.92 | 18.8% | 25039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.8% | 133 |
| kid.test.NightFox .2 | 2.0 | 14.6% | 27 |
| uji.Antique 1.0 | 3.0 | 12.2% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 11.0% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.5% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 4 |
| matt.advanced.Katana 1.0 | 7.8 | 7.0% | 1 |
| stelo.Lifestealer 1.0 | 9.2 | 5.2% | 0 |
| stelo.PianistNano 1.2 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 20 / 35 | 4512 |
| 2 | 1 | 68.2 | 89.2 | 24 / 35 | 4031 |
| 3 | 1 | 66.8 | 87.3 | 19 / 35 | 3742 |
| 4 | 1 | 69.4 | 92.1 | 25 / 35 | 4378 |
| 5 | 1 | 68.0 | 88.9 | 21 / 35 | 4185 |
| 6 | 1 | 69.0 | 91.1 | 24 / 35 | 4191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 84% |
| uji.Antique 1.0 | 47 | 85% |
| qohnil.blot.BlotBot 3.61 | 22 | 73% |
| ahr.ice.Ice 1.0.2 | 6 | 67% |
| amk.ChumbaWumba 0.3 | 5 | 60% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 31% | 60 |
| uji.Antique 1.0 | 18 | 22% | 63 |
| qohnil.blot.BlotBot 3.61 | 12 | 14% | 41 |
| pfvicm.Sobieski 7.2.3b | 10 | 12% | 16 |
| amk.ChumbaWumba 0.3 | 9 | 11% | 13 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 10 |
| matt.advanced.Katana 1.0 | 0 | 0% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 129230 melee ticks, 39543 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 40 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 44806 sent, 40060 reached their opponent, 5999 virtual hits (15.0% of those reached).

## Melee bench: F29

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 790 over 6 battles (131.7 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.0 | 104 / 210 | 2.17 | 18.6% | 27451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.6% | 104 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 51 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.3% | 45 |
| myl.micro.Troodon 1.10 | 4.3 | 11.4% | 4 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.9% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 15 / 35 | 4528 |
| 2 | 1 | 69.7 | 91.7 | 19 / 35 | 4367 |
| 3 | 1 | 68.7 | 86.3 | 17 / 35 | 4544 |
| 4 | 1 | 69.4 | 88.9 | 18 / 35 | 4874 |
| 5 | 1 | 68.6 | 86.0 | 18 / 35 | 4534 |
| 6 | 1 | 68.3 | 84.4 | 17 / 35 | 4604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 55% |
| zyx.mega.YersiniaPestis 3.1 | 48 | 65% |
| jok.PheonixM 0.1.2 | 19 | 84% |
| myl.micro.Troodon 1.10 | 15 | 93% |
| ph.melee.ArcherME 0.3 | 3 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 41% | 80 |
| zyx.mega.YersiniaPestis 3.1 | 41 | 37% | 78 |
| myl.micro.Troodon 1.10 | 9 | 8% | 22 |
| jok.PheonixM 0.1.2 | 8 | 7% | 21 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 167531 melee ticks, 53995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 55212 sent, 50372 reached their opponent, 7980 virtual hits (15.8% of those reached).

## Melee bench: F30

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 725 over 6 battles (120.8 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.4 | 41 / 210 | 3.21 | 14.8% | 22482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.5 | 14.8% | 41 |
| catcat20.Matcha 0.006 | 2.3 | 14.1% | 54 |
| darkcanuck.B26354 1.06 | 2.8 | 13.6% | 50 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.7% | 21 |
| oog.melee.Capulet 1.2 | 4.7 | 12.3% | 28 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.9% | 9 |
| tripphippy.Alice 1.1 | 7.3 | 7.3% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 6.7% | 6 |
| ntc.Opposite 1.5 | 8.2 | 6.8% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 75.2 | 7 / 35 | 3858 |
| 2 | 1 | 63.8 | 77.8 | 8 / 35 | 3997 |
| 3 | 1 | 61.3 | 71.7 | 7 / 35 | 3476 |
| 4 | 4 | 60.2 | 69.8 | 1 / 35 | 3582 |
| 5 | 1 | 65.0 | 81.0 | 9 / 35 | 4129 |
| 6 | 1 | 62.4 | 76.8 | 9 / 35 | 3440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 31% |
| darkcanuck.B26354 1.06 | 24 | 33% |
| stelo.PastFuture 2.3.2 | 13 | 62% |
| oog.melee.Capulet 1.2 | 13 | 31% |
| intruder.PrairieWolf 2.61 | 10 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 50% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 39 | 22% | 50 |
| catcat20.Matcha 0.006 | 37 | 21% | 50 |
| stelo.PastFuture 2.3.2 | 31 | 18% | 34 |
| oog.melee.Capulet 1.2 | 27 | 15% | 33 |
| intruder.PrairieWolf 2.61 | 17 | 10% | 23 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 10 |
| tripphippy.Alice 1.1 | 6 | 3% | 7 |
| ntc.Opposite 1.5 | 2 | 1% | 2 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 163119 melee ticks, 28875 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 49 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 52979 sent, 48067 reached their opponent, 8435 virtual hits (17.5% of those reached).

## Melee bench: F31

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 765 over 6 battles (127.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.4 | 62 / 210 | 2.95 | 15.5% | 21304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 88 |
| hadur2.Hadur 3.18aa | 2.0 | 15.5% | 62 |
| gh.mini.Griezel 0.2 | 3.2 | 13.5% | 42 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.5% | 6 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.9% | 9 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.9% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.8% | 1 |
| fm.mammillarias 1.3 | 8.3 | 5.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 77.5 | 8 / 35 | 3357 |
| 2 | 2 | 63.7 | 76.2 | 10 / 35 | 3585 |
| 3 | 2 | 64.4 | 81.0 | 10 / 35 | 3661 |
| 4 | 2 | 65.2 | 79.0 | 13 / 35 | 3787 |
| 5 | 2 | 63.3 | 77.5 | 11 / 35 | 3305 |
| 6 | 2 | 64.2 | 79.0 | 10 / 35 | 3609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 40 | 50% |
| gh.mini.Griezel 0.2 | 22 | 55% |
| spinnercat.micro.Tyger 0.1 | 14 | 86% |
| d414.nano.Quantum 1.0.0 | 9 | 89% |
| gh.nano.Grofvuil 0.2 | 8 | 88% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 38% | 83 |
| gh.mini.Griezel 0.2 | 32 | 21% | 45 |
| d414.nano.Quantum 1.0.0 | 17 | 11% | 24 |
| spinnercat.micro.Tyger 0.1 | 16 | 10% | 26 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 15 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 8 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 209 rounds): 155664 melee ticks, 27570 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (209 rounds): longest scan gap while four or more were alive 39 ticks (209 rounds over 8); rounds whose longest gap at any count was over 8: 209; robots dropped as dead without a death event: 1.

Targeting waves (209 rounds): 51048 sent, 45911 reached their opponent, 7637 virtual hits (16.6% of those reached).

## Melee bench: F32

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 154 over 6 battles (25.7 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 88.9 | 117 / 210 | 2.00 | 18.3% | 26535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.3% | 117 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 47 |
| apc.botM 3.0 | 3.0 | 12.1% | 18 |
| lxx.ConceptA 0.8 | 4.5 | 10.1% | 8 |
| vjik.UnViolation 1.1 | 4.7 | 10.0% | 7 |
| bayen.UbaMicro 1.4 | 5.8 | 9.2% | 5 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 5 |
| panzer.Panzer 0.2 | 7.5 | 7.4% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.1% | 3 |
| conscience.Electron 1.3g | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 83.5 | 14 / 35 | 4292 |
| 2 | 1 | 67.4 | 88.6 | 21 / 35 | 4534 |
| 3 | 1 | 68.9 | 92.7 | 22 / 35 | 4648 |
| 4 | 1 | 68.0 | 90.5 | 20 / 35 | 4418 |
| 5 | 1 | 67.9 | 90.5 | 21 / 35 | 4290 |
| 6 | 1 | 67.4 | 87.9 | 19 / 35 | 4353 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 59% |
| apc.botM 3.0 | 38 | 74% |
| vjik.UnViolation 1.1 | 15 | 87% |
| lxx.ConceptA 0.8 | 13 | 62% |
| yk.JahMicro 1.0 | 12 | 75% |
| donjezza.Jezza 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 6 | 83% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 35 | 38% | 81 |
| lxx.ConceptA 0.8 | 20 | 22% | 30 |
| apc.botM 3.0 | 15 | 16% | 43 |
| vjik.UnViolation 1.1 | 6 | 6% | 20 |
| bayen.UbaMicro 1.4 | 6 | 6% | 15 |
| yk.JahMicro 1.0 | 5 | 5% | 8 |
| panzer.Panzer 0.2 | 4 | 4% | 7 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| conscience.Electron 1.3g | 1 | 1% | 1 |

Posture (Hadur's M records, 203 rounds): 125158 melee ticks, 47416 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 46 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 43432 sent, 38567 reached their opponent, 7152 virtual hits (18.5% of those reached).

## Melee bench: F33

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 478 over 6 battles (79.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.0 | 103 / 210 | 2.26 | 18.4% | 28087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.2 | 18.4% | 103 |
| maribo.Quester 0.3 | 1.8 | 16.4% | 51 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.2% | 18 |
| labg.Cataclysm 2.05 | 4.8 | 10.5% | 14 |
| baal.nano.N 1.42 | 6.2 | 8.9% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.5% | 3 |
| sanja.First 0.1 | 8.5 | 5.0% | 1 |
| zyx.micro.Ant 1.1 | 8.5 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.0 | 15 / 35 | 4774 |
| 2 | 1 | 69.6 | 89.2 | 22 / 35 | 4692 |
| 3 | 1 | 71.2 | 93.0 | 23 / 35 | 5364 |
| 4 | 1 | 67.3 | 82.2 | 15 / 35 | 4430 |
| 5 | 1 | 66.7 | 81.3 | 15 / 35 | 4465 |
| 6 | 2 | 66.9 | 83.2 | 13 / 35 | 4362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 73% |
| gre.svman4.Leonidas 1.3.2 | 20 | 70% |
| labg.Cataclysm 2.05 | 14 | 79% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 43 | 39% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 23% | 48 |
| gre.svman4.Leonidas 1.3.2 | 18 | 16% | 28 |
| labg.Cataclysm 2.05 | 8 | 7% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 5% | 9 |
| baal.nano.N 1.42 | 5 | 5% | 12 |
| sanja.First 0.1 | 2 | 2% | 4 |
| zyx.micro.Ant 1.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 176083 melee ticks, 45098 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 1136 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 332 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 56962 sent, 52094 reached their opponent, 8001 virtual hits (15.4% of those reached).

## Melee bench: F34

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 623 over 6 battles (103.8 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.8 | 86 / 210 | 2.19 | 18.1% | 30554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 18.1% | 86 |
| stelo.Spread 0.9 | 2.5 | 16.1% | 58 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 43 |
| tcf.Reach 3 | 4.5 | 11.1% | 3 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 23 |
| cli.Dancer 1.1 | 6.0 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 11 / 35 | 4860 |
| 2 | 1 | 68.9 | 85.7 | 15 / 35 | 5447 |
| 3 | 1 | 69.0 | 87.0 | 17 / 35 | 5044 |
| 4 | 1 | 69.8 | 90.2 | 15 / 35 | 5332 |
| 5 | 1 | 67.7 | 85.4 | 14 / 35 | 4764 |
| 6 | 1 | 68.5 | 85.7 | 14 / 35 | 5107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 62 | 53% |
| kid.Gladiator .7.2 | 54 | 59% |
| jcs.Seth 1.8 | 21 | 48% |
| tcf.Reach 3 | 6 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 132 of 210 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 53 | 40% | 83 |
| stelo.Spread 0.9 | 46 | 35% | 81 |
| jcs.Seth 1.8 | 18 | 14% | 30 |
| tcf.Reach 3 | 5 | 4% | 9 |
| cli.Dancer 1.1 | 1 | 1% | 5 |
| ratosh.Wesco 1.4 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 173180 melee ticks, 60234 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 39 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53755 sent, 48880 reached their opponent, 8309 virtual hits (17.0% of those reached).

## Melee bench: F35

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 506 over 6 battles (84.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 81.8 | 39 / 210 | 2.64 | 15.6% | 21125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.1% | 134 |
| hadur2.Hadur 3.18aa | 2.0 | 15.6% | 39 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.7 | 12.3% | 12 |
| gh.mini.Gruwel 0.9 | 3.7 | 12.3% | 20 |
| rz.HawkOnFire 0.1 | 4.7 | 11.9% | 5 |
| wit.Chuliath 1.0 | 6.0 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.0% | 1 |
| myl.nano.KomoriNinja 1.1 | 8.3 | 5.4% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 81.9 | 8 / 35 | 3918 |
| 2 | 2 | 63.4 | 80.0 | 4 / 35 | 3417 |
| 3 | 2 | 64.7 | 82.9 | 6 / 35 | 3522 |
| 4 | 2 | 64.7 | 82.9 | 8 / 35 | 3479 |
| 5 | 2 | 65.1 | 83.2 | 8 / 35 | 3483 |
| 6 | 2 | 63.0 | 80.0 | 5 / 35 | 3306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 83 | 24% |
| gh.mini.Gruwel 0.9 | 18 | 22% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 67% |
| rz.HawkOnFire 0.1 | 9 | 78% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |

Hadur died in 176 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 49% | 107 |
| gh.mini.Gruwel 0.9 | 26 | 15% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 26 | 15% | 28 |
| rz.HawkOnFire 0.1 | 24 | 14% | 35 |
| wit.Chuliath 1.0 | 4 | 2% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 148140 melee ticks, 47128 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46412 sent, 41468 reached their opponent, 6537 virtual hits (15.8% of those reached).

## Melee bench: F36

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 475 over 6 battles (79.2 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.3 | 148 / 210 | 1.87 | 20.1% | 31230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.1% | 148 |
| alpha.RainingFire 1.0 | 2.3 | 12.7% | 21 |
| bzdp.Pansy 2.1 | 3.2 | 12.1% | 11 |
| mz.Cork 0.1 | 4.3 | 11.0% | 12 |
| bvh.micro.Freya 0.3 | 4.5 | 10.6% | 12 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 5.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.3% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 29 / 35 | 5348 |
| 2 | 1 | 70.1 | 90.5 | 23 / 35 | 5515 |
| 3 | 1 | 70.6 | 91.4 | 26 / 35 | 5220 |
| 4 | 1 | 71.0 | 93.0 | 25 / 35 | 5479 |
| 5 | 1 | 68.1 | 82.9 | 21 / 35 | 4935 |
| 6 | 1 | 69.5 | 90.5 | 24 / 35 | 4733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 39 | 92% |
| alpha.RainingFire 1.0 | 39 | 77% |
| mz.Cork 0.1 | 33 | 88% |
| bvh.micro.Freya 0.3 | 27 | 85% |
| bvh.mini.Fenrir 0.39 | 13 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 22 | 33% | 55 |
| mz.Cork 0.1 | 12 | 18% | 38 |
| bzdp.Pansy 2.1 | 10 | 15% | 44 |
| bvh.micro.Freya 0.3 | 6 | 9% | 30 |
| bvh.mini.Fenrir 0.39 | 5 | 8% | 14 |
| m3thos.Eva02 0.7.1 | 4 | 6% | 16 |
| sample.MyFirstRobot 1.0 | 2 | 3% | 6 |
| dl.BetterWalls 1.0 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 145203 melee ticks, 44435 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 46 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 50695 sent, 45872 reached their opponent, 9914 virtual hits (21.6% of those reached).

## Melee bench: F37

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 379 over 6 battles (63.2 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.4 | 167 / 210 | 1.86 | 19.7% | 34041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.7% | 167 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.7 | 10.6% | 4 |
| EBBU.Sim2 1.02 | 3.7 | 9.6% | 4 |
| germ.TheMind .2 | 4.8 | 9.5% | 5 |
| agrach.Dalek 1.0 | 5.2 | 9.2% | 8 |
| stelo.UntouchableNano 1.3 | 5.7 | 8.9% | 9 |
| lmk.ACPFinal 0.1 | 7.3 | 8.3% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 8.3% | 3 |
| mb.Beast 0.1 | 8.2 | 8.0% | 3 |
| skm.Ryubot 1.0 | 8.7 | 7.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.9 | 25 / 35 | 5238 |
| 2 | 1 | 68.0 | 87.3 | 27 / 35 | 5417 |
| 3 | 1 | 69.8 | 94.3 | 28 / 35 | 5581 |
| 4 | 1 | 68.4 | 90.2 | 25 / 35 | 5594 |
| 5 | 1 | 70.1 | 93.7 | 31 / 35 | 5907 |
| 6 | 1 | 70.9 | 95.2 | 31 / 35 | 6304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 28 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 23 | 78% |
| germ.TheMind .2 | 22 | 95% |
| EBBU.Sim2 1.02 | 21 | 100% |
| skm.Ryubot 1.0 | 19 | 100% |
| lmk.ACPFinal 0.1 | 18 | 94% |
| mb.Beast 0.1 | 16 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 45 of 210 rounds, at a mean tick of 413. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 14 | 31% | 20 |
| stelo.UntouchableNano 1.3 | 7 | 16% | 25 |
| lmk.ACPFinal 0.1 | 7 | 16% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 13% | 46 |
| germ.TheMind .2 | 3 | 7% | 19 |
| agrach.Dalek 1.0 | 2 | 4% | 27 |
| mb.Beast 0.1 | 2 | 4% | 16 |
| EBBU.Sim2 1.02 | 1 | 2% | 24 |
| skm.Ryubot 1.0 | 1 | 2% | 6 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 95840 melee ticks, 27726 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 57 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 2.

Targeting waves (203 rounds): 32692 sent, 28319 reached their opponent, 8813 virtual hits (31.1% of those reached).

## Melee bench: F38

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 806 over 6 battles (134.3 per battle, most in one battle 149). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.1 | 105 / 210 | 2.16 | 17.9% | 26558 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 17.9% | 105 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 57 |
| bvh.mini.Freya 0.55 | 3.3 | 12.7% | 11 |
| cs.Wren 1.0 | 4.5 | 10.9% | 11 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.1% | 13 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.6% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.0 | 8.2% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.5 | 6.6% | 5 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.2 | 21 / 35 | 4959 |
| 2 | 1 | 67.5 | 85.1 | 19 / 35 | 4336 |
| 3 | 1 | 66.6 | 87.3 | 17 / 35 | 3847 |
| 4 | 1 | 68.6 | 90.2 | 18 / 35 | 4541 |
| 5 | 1 | 67.7 | 87.0 | 16 / 35 | 4417 |
| 6 | 1 | 66.3 | 83.2 | 14 / 35 | 4458 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 69 | 52% |
| bvh.mini.Freya 0.55 | 28 | 86% |
| bts.mega.Gnarly 1.4 | 24 | 83% |
| cs.Wren 1.0 | 18 | 89% |
| kdf.KoulDestroyer 1.0 | 7 | 71% |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 50% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 37% | 74 |
| cs.Wren 1.0 | 17 | 15% | 33 |
| bts.mega.Gnarly 1.4 | 16 | 14% | 43 |
| bvh.mini.Freya 0.55 | 14 | 13% | 28 |
| kdf.KoulDestroyer 1.0 | 13 | 12% | 19 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 4 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 0 | 0% | 3 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 141169 melee ticks, 41478 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 47 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 46953 sent, 41935 reached their opponent, 8995 virtual hits (21.4% of those reached).

## Melee bench: F39

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 542 over 6 battles (90.3 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.9 | 91 / 210 | 2.36 | 17.8% | 29312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 17.8% | 91 |
| bvh.fry.Freya 0.82 | 2.0 | 14.6% | 17 |
| az.Ololobot 0.2.4 | 3.0 | 13.5% | 61 |
| catcat20.Lambda 0.024 | 4.0 | 11.3% | 31 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 9.1% | 5 |
| gimp.GimpBot 0.1 | 6.2 | 8.3% | 2 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.0% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.7 | 6.9% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.9 | 18 / 35 | 5068 |
| 2 | 1 | 67.5 | 84.1 | 19 / 35 | 5044 |
| 3 | 1 | 68.8 | 89.2 | 16 / 35 | 5276 |
| 4 | 1 | 66.3 | 83.8 | 14 / 35 | 4700 |
| 5 | 1 | 66.8 | 85.4 | 15 / 35 | 4702 |
| 6 | 1 | 64.3 | 77.8 | 9 / 35 | 4522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 56 | 52% |
| bvh.fry.Freya 0.82 | 47 | 89% |
| catcat20.Lambda 0.024 | 22 | 41% |
| winamp32.micro.MicroMacro 1.0 | 8 | 88% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 1 | 0% |
| stelo.SoRobotNanoMelee 1.2 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 36 | 29% | 65 |
| az.Ololobot 0.2.4 | 34 | 27% | 65 |
| catcat20.Lambda 0.024 | 25 | 20% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 6% | 10 |
| apollokidd.ApolloKidd 0.9 | 7 | 6% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 16 |
| gimp.GimpBot 0.1 | 3 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 166724 melee ticks, 47045 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 52724 sent, 47925 reached their opponent, 8488 virtual hits (17.7% of those reached).

## Melee bench: F40

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 776 over 6 battles (129.3 per battle, most in one battle 145). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.1 | 124 / 210 | 2.16 | 19.0% | 29025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.0% | 124 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.4% | 31 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 24 |
| mz.AntiGrav 1.0 | 4.3 | 11.6% | 7 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.9% | 12 |
| alpha.BlackIce 1.0 | 6.2 | 9.0% | 3 |
| stelo.Randomness 1.0 | 6.7 | 8.5% | 10 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.8% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.9% | 0 |
| sample.Corners 1.0 | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 19 / 35 | 4316 |
| 2 | 1 | 69.9 | 91.1 | 22 / 35 | 5188 |
| 3 | 1 | 69.1 | 85.7 | 20 / 35 | 4897 |
| 4 | 1 | 70.2 | 92.4 | 22 / 35 | 4925 |
| 5 | 1 | 69.1 | 86.3 | 23 / 35 | 4873 |
| 6 | 1 | 68.4 | 85.7 | 18 / 35 | 4826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 61 | 80% |
| kano.gamma.KanoGamma 1.8 | 43 | 81% |
| mz.AntiGrav 1.0 | 20 | 85% |
| Polkwane.SmashMelee 1.0 | 12 | 100% |
| alpha.BlackIce 1.0 | 7 | 86% |
| stelo.Randomness 1.0 | 6 | 50% |
| sample.Corners 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 26 | 28% | 57 |
| kano.gamma.KanoGamma 1.8 | 21 | 23% | 60 |
| mz.AntiGrav 1.0 | 12 | 13% | 29 |
| stelo.Randomness 1.0 | 10 | 11% | 22 |
| alpha.BlackIce 1.0 | 9 | 10% | 16 |
| Polkwane.SmashMelee 1.0 | 7 | 8% | 16 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 7 |
| sample.Corners 1.0 | 0 | 0% | 2 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |
7 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 151350 melee ticks, 40263 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 88 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 88 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 50704 sent, 45580 reached their opponent, 9558 virtual hits (21.0% of those reached).

## Melee bench: F41

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 430 over 6 battles (71.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.1 | 94 / 210 | 2.25 | 17.6% | 25517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.2 | 17.6% | 94 |
| eem.EvBotNG v12.8 | 1.8 | 16.3% | 80 |
| ary.Swarm 1.1 | 3.3 | 12.7% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.7% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.4% | 9 |
| shrub.Silver v048 | 5.8 | 9.5% | 4 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.5% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.2% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.1 | 18 / 35 | 4357 |
| 2 | 1 | 67.5 | 85.4 | 18 / 35 | 4252 |
| 3 | 1 | 68.0 | 88.6 | 15 / 35 | 4392 |
| 4 | 1 | 68.3 | 88.3 | 17 / 35 | 4261 |
| 5 | 1 | 66.4 | 84.4 | 13 / 35 | 4062 |
| 6 | 2 | 67.3 | 85.7 | 13 / 35 | 4193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 43% |
| lessonz.robocode.Oz 0.5.0 | 31 | 87% |
| ary.Swarm 1.1 | 18 | 89% |
| simonton.nano.MeleeSeed 1.8 | 12 | 92% |
| shrub.Silver v048 | 4 | 100% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 60 | 49% | 94 |
| lessonz.robocode.Oz 0.5.0 | 19 | 16% | 33 |
| ary.Swarm 1.1 | 18 | 15% | 35 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 26 |
| zyx.nano.Ant 1.1 | 5 | 4% | 6 |
| shrub.Silver v048 | 1 | 1% | 9 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155442 melee ticks, 47247 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 835 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 360 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 51660 sent, 46819 reached their opponent, 7498 virtual hits (16.0% of those reached).

## Melee bench: F42

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 6 battles (26.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 128 / 210 | 1.84 | 19.8% | 33667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 19.8% | 128 |
| wompi.Wallaby 5.1 | 2.2 | 15.4% | 43 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 16 |
| ara.Shera 0.88 | 3.5 | 13.2% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 1 |
| dsw.StaticD 1.0 | 6.3 | 6.9% | 1 |
| maribo.IotaCT 1.1 | 7.5 | 6.3% | 0 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 22 / 35 | 5829 |
| 2 | 1 | 71.1 | 94.9 | 22 / 35 | 5821 |
| 3 | 1 | 70.4 | 91.4 | 21 / 35 | 5835 |
| 4 | 1 | 69.4 | 89.8 | 20 / 35 | 5402 |
| 5 | 1 | 68.8 | 86.7 | 19 / 35 | 5442 |
| 6 | 1 | 69.3 | 87.3 | 24 / 35 | 5338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 85 | 80% |
| maribo.mini.MiniQuester 0.1 | 46 | 80% |
| ara.Shera 0.88 | 28 | 61% |
| dsw.StaticD 1.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 992. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 34 | 41% | 53 |
| wompi.Wallaby 5.1 | 26 | 32% | 90 |
| maribo.mini.MiniQuester 0.1 | 16 | 20% | 52 |
| amz.NanoClone 1.41 | 4 | 5% | 6 |
| dsw.StaticD 1.0 | 1 | 1% | 6 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 204 rounds): 167402 melee ticks, 50289 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 32 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 53113 sent, 48475 reached their opponent, 9829 virtual hits (20.3% of those reached).

## Melee bench: F43

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 503 over 6 battles (83.8 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.5 | 33 / 210 | 2.76 | 15.6% | 22387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 144 |
| hadur2.Hadur 3.18aa | 2.0 | 15.6% | 33 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.8% | 25 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.1% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.7% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 81.9 | 5 / 35 | 3705 |
| 2 | 2 | 65.5 | 79.0 | 6 / 35 | 3827 |
| 3 | 2 | 64.7 | 78.7 | 5 / 35 | 3467 |
| 4 | 2 | 65.0 | 79.4 | 5 / 35 | 3563 |
| 5 | 2 | 66.2 | 81.9 | 5 / 35 | 3967 |
| 6 | 2 | 66.1 | 81.9 | 7 / 35 | 3858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 16% |
| brainfade.melee.Dusk 0.44 | 16 | 56% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |

Hadur died in 181 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 112 | 62% | 123 |
| brainfade.melee.Dusk 0.44 | 36 | 20% | 42 |
| dummy.micro.Sparrow 2.5 | 11 | 6% | 16 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 15 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 5 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 159396 melee ticks, 45600 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 62 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 62 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 51708 sent, 46668 reached their opponent, 7861 virtual hits (16.8% of those reached).

## Melee bench: F44

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 426 over 6 battles (71.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.2 | 128 / 210 | 1.89 | 20.0% | 33235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.0% | 128 |
| stelo.Liblix 0.3.1 | 2.0 | 16.0% | 60 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 17 |
| jwirde.Gort 2.0 | 4.3 | 9.6% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.0% | 0 |
| wompi.Quokka 1.6 | 6.3 | 7.6% | 2 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.0% | 1 |
| disan.Chair 2.2.0 | 7.2 | 7.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 93.0 | 25 / 35 | 6063 |
| 2 | 1 | 71.6 | 93.3 | 25 / 35 | 5697 |
| 3 | 1 | 70.8 | 93.0 | 22 / 35 | 5469 |
| 4 | 1 | 67.8 | 82.9 | 19 / 35 | 5032 |
| 5 | 1 | 70.4 | 91.1 | 19 / 35 | 5613 |
| 6 | 1 | 69.2 | 87.6 | 18 / 35 | 5361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 91 | 57% |
| tzu.TheArtOfWar 1.2 | 56 | 86% |
| jwirde.Gort 2.0 | 10 | 90% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| wompi.Quokka 1.6 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 50 | 59% | 108 |
| tzu.TheArtOfWar 1.2 | 16 | 19% | 60 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 7% | 10 |
| jwirde.Gort 2.0 | 4 | 5% | 13 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 7 |
| disan.Chair 2.2.0 | 1 | 1% | 6 |
| wompi.Quokka 1.6 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 152323 melee ticks, 52011 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 41 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 53060 sent, 48405 reached their opponent, 10403 virtual hits (21.5% of those reached).

## Melee bench: F45

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 613 over 6 battles (102.2 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.6 | 119 / 210 | 1.84 | 20.3% | 34003 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur2.Hadur 3.18aa | 1.0 | 20.3% | 119 |
| jje.BagPuss 1.2 | 2.5 | 12.4% | 7 |
| eem.IWillFireNoBullet v2.8 | 3.2 | 11.6% | 67 |
| sul.Lunar 1.1 | 4.2 | 10.7% | 9 |
| myl.nano.Graviton 1.10 | 4.5 | 10.6% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.6% | 3 |
| fm.claire 1.7 | 7.0 | 8.0% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.0% | 0 |
| wit.Deep7 2.0 | 9.2 | 5.7% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 13 / 35 | 5099 |
| 2 | 1 | 72.1 | 96.2 | 26 / 35 | 6039 |
| 3 | 1 | 70.0 | 89.8 | 21 / 35 | 5720 |
| 4 | 1 | 70.1 | 89.8 | 20 / 35 | 5549 |
| 5 | 1 | 70.6 | 88.9 | 19 / 35 | 6018 |
| 6 | 1 | 70.9 | 93.0 | 20 / 35 | 5578 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 79 | 56% |
| sul.Lunar 1.1 | 28 | 86% |
| jje.BagPuss 1.2 | 26 | 85% |
| myl.nano.Graviton 1.10 | 16 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 34 | 35% | 0 |
| jje.BagPuss 1.2 | 16 | 16% | 65 |
| sul.Lunar 1.1 | 13 | 13% | 51 |
| myl.nano.Graviton 1.10 | 13 | 13% | 48 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 23 |
| fm.claire 1.7 | 6 | 6% | 9 |
| hvilela.HVilela 0.9 | 3 | 3% | 6 |
| wit.Deep7 2.0 | 1 | 1% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 193718 melee ticks, 95177 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 65 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 61202 sent, 56372 reached their opponent, 8650 virtual hits (15.3% of those reached).

## Melee bench: F46

hadur2.Hadur 3.18aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 681 over 6 battles (113.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 80.6 | 48 / 210 | 2.75 | 15.6% | 23237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.2% | 86 |
| kc.mini.Mirage 0.2 | 1.7 | 17.1% | 61 |
| hadur2.Hadur 3.18aa | 3.0 | 15.6% | 48 |
| mz.MicroSheep 1.0 | 4.3 | 10.2% | 4 |
| cx.Princess 1.0 | 4.7 | 10.1% | 11 |
| sadoner.killer 0.2 | 6.0 | 9.1% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.7 | 5.2% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.9 | 81.9 | 11 / 35 | 4285 |
| 2 | 3 | 63.4 | 79.0 | 6 / 35 | 3399 |
| 3 | 3 | 64.9 | 81.6 | 9 / 35 | 4039 |
| 4 | 3 | 65.0 | 80.6 | 10 / 35 | 3922 |
| 5 | 3 | 64.7 | 83.5 | 6 / 35 | 3820 |
| 6 | 3 | 63.4 | 76.8 | 6 / 35 | 3772 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 55 | 56% |
| rsalesc.melee.Medina 0.4.5 | 38 | 29% |
| cx.Princess 1.0 | 5 | 60% |
| mz.MicroSheep 1.0 | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 71 | 42% | 99 |
| rsalesc.melee.Medina 0.4.5 | 63 | 37% | 78 |
| sadoner.killer 0.2 | 11 | 7% | 11 |
| cx.Princess 1.0 | 7 | 4% | 8 |
| mz.MicroSheep 1.0 | 5 | 3% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 4 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156491 melee ticks, 39668 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 58 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45731 sent, 40798 reached their opponent, 6249 virtual hits (15.3% of those reached).

