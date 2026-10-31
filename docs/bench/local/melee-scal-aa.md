# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 134 over 6 battles (22.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.0 | 51 / 210 | 2.17 | 17.5% | 31048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 136 |
| hadur117.Hadur 3.20aa | 2.0 | 17.5% | 51 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.7 | 11.3% | 5 |
| sgp.JollyNinja 3.53 | 4.3 | 11.0% | 16 |
| lorneswork.Predator 1.0 | 4.8 | 10.1% | 2 |
| mz.MicroGodMelee 1 | 5.2 | 10.1% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 87.3 | 8 / 35 | 5136 |
| 2 | 2 | 68.2 | 87.6 | 10 / 35 | 5409 |
| 3 | 2 | 68.1 | 89.8 | 8 / 35 | 5090 |
| 4 | 2 | 68.3 | 88.6 | 11 / 35 | 5117 |
| 5 | 2 | 66.8 | 83.5 | 8 / 35 | 5266 |
| 6 | 2 | 66.8 | 85.4 | 6 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 9% |
| sgp.JollyNinja 3.53 | 17 | 76% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 91% |
| mz.MicroGodMelee 1 | 9 | 100% |
| lorneswork.Predator 1.0 | 5 | 80% |
| adt.Ar2 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 77% | 141 |
| sgp.JollyNinja 3.53 | 14 | 9% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 8% | 21 |
| lorneswork.Predator 1.0 | 5 | 3% | 9 |
| mz.MicroGodMelee 1 | 4 | 3% | 14 |
| adt.Ar2 1.0 | 0 | 0% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 198 rounds): 137075 melee ticks, 88533 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 72 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43553 sent, 38817 reached their opponent, 7719 virtual hits (19.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 186 over 6 battles (31.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.7 | 93 / 210 | 2.29 | 18.4% | 30008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.4% | 93 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 46 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 28 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.3 | 10.3% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.6% | 1 |
| Noran.BitchingElk 0.054 | 6.3 | 8.3% | 17 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.0% | 3 |
| sch.Simone 0.3d | 7.7 | 7.3% | 6 |
| stelo.PatternRobot 1.0 | 9.0 | 5.5% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.7 | 13 / 35 | 4721 |
| 2 | 1 | 68.9 | 89.2 | 18 / 35 | 4988 |
| 3 | 1 | 67.9 | 83.8 | 16 / 35 | 5157 |
| 4 | 1 | 67.8 | 85.1 | 14 / 35 | 4927 |
| 5 | 1 | 67.2 | 82.5 | 14 / 35 | 5152 |
| 6 | 1 | 69.1 | 87.6 | 18 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 49 | 41% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 79% |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 62% |
| sch.Simone 0.3d | 15 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 92% |
| Noran.BitchingElk 0.054 | 13 | 46% |
| fnc.bandit.Bandit 5.2.0 | 2 | 0% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 43 | 36% | 65 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 19 | 16% | 50 |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 12% | 26 |
| Noran.BitchingElk 0.054 | 11 | 9% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 18 |
| sch.Simone 0.3d | 8 | 7% | 16 |
| fnc.bandit.Bandit 5.2.0 | 7 | 6% | 10 |
| stelo.PatternRobot 1.0 | 6 | 5% | 6 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 168712 melee ticks, 47315 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 73 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 59950 sent, 55220 reached their opponent, 9490 virtual hits (17.2% of those reached).

## Melee bench: F03

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 140 over 6 battles (23.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.5 | 167 / 210 | 1.67 | 20.8% | 38587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.8% | 167 |
| radnor.DoctorBob 1.42 | 2.3 | 13.3% | 14 |
| vuen.Cake 2.51 | 3.3 | 12.5% | 13 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.6% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 1 |
| adt.Ar1 2.1 | 6.2 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 90.5 | 29 / 35 | 6746 |
| 2 | 1 | 70.6 | 91.7 | 26 / 35 | 6039 |
| 3 | 1 | 71.1 | 93.0 | 30 / 35 | 6415 |
| 4 | 1 | 72.1 | 95.9 | 28 / 35 | 6733 |
| 5 | 1 | 71.2 | 94.6 | 27 / 35 | 6733 |
| 6 | 1 | 69.8 | 89.5 | 27 / 35 | 5921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 91% |
| radnor.DoctorBob 1.42 | 52 | 96% |
| kawigi.nano.Lib 1.0 | 41 | 98% |
| urdos.URDOS 1.3 | 8 | 88% |
| adt.Ar1 2.1 | 7 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 16 | 36% | 58 |
| vuen.Cake 2.51 | 9 | 20% | 63 |
| urdos.URDOS 1.3 | 9 | 20% | 16 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 9% | 4 |
| kawigi.nano.Lib 1.0 | 2 | 5% | 39 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 5% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 5% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 8 |
| adt.Ar1 2.1 | 0 | 0% | 7 |

Posture (Hadur's M records, 198 rounds): 123755 melee ticks, 40183 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 69 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 32 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 1.

Targeting waves (198 rounds): 37387 sent, 32713 reached their opponent, 8488 virtual hits (25.9% of those reached).

## Melee bench: F04

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 393 over 6 battles (65.5 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.3 | 33 / 210 | 2.23 | 17.5% | 32811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.5% | 160 |
| hadur117.Hadur 3.20aa | 2.0 | 17.5% | 33 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.5% | 6 |
| TNT.TNT 0.99.1 | 4.5 | 10.2% | 11 |
| josago.Jorgito 0.16 | 4.5 | 10.1% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.5 | 5.6% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 3.8% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 84.4 | 4 / 35 | 5271 |
| 2 | 2 | 67.5 | 85.1 | 4 / 35 | 5260 |
| 3 | 2 | 68.2 | 86.7 | 6 / 35 | 5447 |
| 4 | 2 | 68.3 | 87.3 | 7 / 35 | 5260 |
| 5 | 2 | 68.7 | 87.3 | 7 / 35 | 5662 |
| 6 | 2 | 68.9 | 87.3 | 5 / 35 | 5911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 128 | 6% |
| apc.LeeroyJenkins2 1.0 | 18 | 94% |
| TNT.TNT 0.99.1 | 12 | 33% |
| josago.Jorgito 0.16 | 3 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 1313. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 77% | 153 |
| TNT.TNT 0.99.1 | 13 | 7% | 17 |
| apc.LeeroyJenkins2 1.0 | 12 | 7% | 25 |
| josago.Jorgito 0.16 | 7 | 4% | 9 |
| rampancy.Durandal 2.1d | 4 | 2% | 4 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 188786 melee ticks, 79742 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 92 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 92 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 59277 sent, 54210 reached their opponent, 8167 virtual hits (15.1% of those reached).

## Melee bench: F05

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 424 over 6 battles (70.7 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 79.6 | 44 / 210 | 2.83 | 15.4% | 23203 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 17.6% | 93 |
| justin.DemonicRage 3.4 | 1.8 | 16.6% | 54 |
| hadur117.Hadur 3.20aa | 3.0 | 15.4% | 44 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 14 |
| ms.Ares 0.19 | 5.3 | 9.3% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 9.2% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 5.4% | 0 |
| supersample.SuperBoxBot 1.0 | 8.0 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 80.3 | 5 / 35 | 3960 |
| 2 | 3 | 64.1 | 79.0 | 5 / 35 | 3807 |
| 3 | 3 | 64.6 | 79.7 | 8 / 35 | 3980 |
| 4 | 3 | 64.5 | 79.7 | 9 / 35 | 3776 |
| 5 | 3 | 65.5 | 82.5 | 10 / 35 | 3967 |
| 6 | 3 | 63.4 | 76.5 | 7 / 35 | 3713 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 45 | 44% |
| cb.fire.Firestarter 2.0f | 34 | 9% |
| wompi.Numbat 2.1 | 18 | 72% |
| axeBots.HataMoto 3.09 | 5 | 100% |
| ms.Ares 0.19 | 2 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 68 | 40% | 85 |
| cb.fire.Firestarter 2.0f | 55 | 32% | 60 |
| wompi.Numbat 2.1 | 25 | 15% | 34 |
| axeBots.HataMoto 3.09 | 10 | 6% | 17 |
| ms.Ares 0.19 | 5 | 3% | 7 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 155534 melee ticks, 38528 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 72 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 72 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 47607 sent, 42579 reached their opponent, 6953 virtual hits (16.3% of those reached).

## Melee bench: F06

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 536 over 6 battles (89.3 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.5 | 149 / 210 | 1.68 | 20.3% | 32120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.3% | 149 |
| jekl.StoneGhost 0.7 | 2.0 | 14.5% | 13 |
| origin.SleepSiphon 1.7b | 3.0 | 13.3% | 36 |
| mld.Wisdom 1.0 | 4.3 | 10.8% | 1 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.7 | 10.9% | 9 |
| gg.Wolverine 2.0 | 6.0 | 8.9% | 1 |
| DBall.NUKE 0.1 | 7.7 | 6.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.1% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 5.7% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.3 | 26 / 35 | 5553 |
| 2 | 1 | 70.7 | 91.1 | 25 / 35 | 5492 |
| 3 | 1 | 71.1 | 92.4 | 24 / 35 | 5674 |
| 4 | 1 | 70.5 | 95.2 | 23 / 35 | 4932 |
| 5 | 1 | 71.5 | 94.9 | 28 / 35 | 5431 |
| 6 | 1 | 69.4 | 87.9 | 23 / 35 | 5038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 62 | 92% |
| origin.SleepSiphon 1.7b | 49 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 91% |
| gg.Wolverine 2.0 | 13 | 92% |
| mld.Wisdom 1.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 42% | 70 |
| jekl.StoneGhost 0.7 | 18 | 27% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 9% | 32 |
| gg.Wolverine 2.0 | 4 | 6% | 15 |
| mld.Wisdom 1.0 | 3 | 4% | 18 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 4% | 15 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
| sample.Fire 1.0 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 148642 melee ticks, 49654 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 30 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 30 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 46041 sent, 41269 reached their opponent, 9308 virtual hits (22.6% of those reached).

## Melee bench: F07

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 189 over 6 battles (31.5 per battle, most in one battle 124). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.2 | 119 / 210 | 1.70 | 20.7% | 39206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.7% | 119 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.9% | 39 |
| rtk.Tachikoma 1.0 | 2.8 | 15.9% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.2% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 10.9% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.5% | 1 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.1% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 94.0 | 24 / 35 | 7335 |
| 2 | 1 | 72.6 | 93.7 | 21 / 35 | 6622 |
| 3 | 1 | 70.9 | 88.3 | 14 / 35 | 6116 |
| 4 | 1 | 70.8 | 90.2 | 14 / 35 | 6000 |
| 5 | 1 | 72.9 | 92.4 | 24 / 35 | 6599 |
| 6 | 1 | 73.2 | 94.9 | 22 / 35 | 6534 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 78 | 76% |
| rsalesc.melee.Monk 0.3.6c | 51 | 39% |
| franzor.Lizt 1.3.1 | 29 | 59% |
| oog.melee.CapuletDroid 1.1 | 27 | 81% |
| lrem.micro.MoggFanatic 0.2 | 2 | 50% |

Hadur died in 92 of 210 rounds, at a mean tick of 1576. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 41% | 78 |
| rtk.Tachikoma 1.0 | 29 | 32% | 87 |
| franzor.Lizt 1.3.1 | 13 | 14% | 0 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 34 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 6 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 188363 melee ticks, 101939 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 33 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55983 sent, 51190 reached their opponent, 10329 virtual hits (20.2% of those reached).

## Melee bench: F08

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 630 over 6 battles (105.0 per battle, most in one battle 148). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.4 | 138 / 210 | 1.78 | 19.7% | 29515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.7% | 138 |
| shrub.Vapour v159 | 2.5 | 13.0% | 24 |
| tm.Yuugao 1.0 | 2.8 | 12.7% | 23 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.8% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.9% | 9 |
| m3thos.Eva00 1.1 | 5.8 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.0% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.3% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 23 / 35 | 4989 |
| 2 | 1 | 68.3 | 87.3 | 19 / 35 | 4982 |
| 3 | 1 | 69.6 | 92.7 | 24 / 35 | 4710 |
| 4 | 1 | 67.6 | 85.1 | 19 / 35 | 4545 |
| 5 | 1 | 71.4 | 97.1 | 27 / 35 | 5222 |
| 6 | 1 | 70.7 | 94.6 | 26 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 54 | 72% |
| shrub.Vapour v159 | 40 | 75% |
| Krabb.sliNk.Garm 0.9u | 32 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 27 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| m3thos.Eva00 1.1 | 8 | 88% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 28% | 68 |
| shrub.Vapour v159 | 16 | 21% | 46 |
| Krabb.sliNk.Garm 0.9u | 16 | 21% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 13% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 15 |
| m3thos.Eva00 1.1 | 3 | 4% | 12 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 153574 melee ticks, 44375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 74 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 74 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 49911 sent, 44913 reached their opponent, 8288 virtual hits (18.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 441 over 6 battles (73.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 76.6 | 60 / 210 | 3.10 | 15.4% | 21548 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.4% | 99 |
| hadur117.Hadur 3.20aa | 1.8 | 15.4% | 60 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 20 |
| pedersen.Grishnakh 1.0 | 4.3 | 11.0% | 17 |
| yagami.Tidus 0.11 | 5.0 | 10.0% | 1 |
| mc2.enemy.Original 0.9 | 6.0 | 9.0% | 10 |
| dft.Calliope 5.6 | 6.7 | 8.2% | 3 |
| step.nanoPri 1.0 | 8.7 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 78.7 | 11 / 35 | 3682 |
| 2 | 2 | 62.4 | 72.7 | 7 / 35 | 3604 |
| 3 | 2 | 61.3 | 71.4 | 7 / 35 | 3266 |
| 4 | 1 | 66.0 | 83.5 | 15 / 35 | 3960 |
| 5 | 2 | 65.2 | 78.4 | 15 / 35 | 3782 |
| 6 | 2 | 62.2 | 74.9 | 5 / 35 | 3254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 24% |
| kc.micro.Figment 1.0 | 37 | 78% |
| pedersen.Grishnakh 1.0 | 10 | 20% |
| yagami.Tidus 0.11 | 10 | 100% |
| mc2.enemy.Original 0.9 | 6 | 83% |
| dft.Calliope 5.6 | 4 | 50% |

Hadur died in 153 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 67 | 44% | 78 |
| kc.micro.Figment 1.0 | 26 | 17% | 55 |
| pedersen.Grishnakh 1.0 | 23 | 15% | 27 |
| mc2.enemy.Original 0.9 | 12 | 8% | 19 |
| yagami.Tidus 0.11 | 10 | 7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 3 | 2% | 8 |
| step.nanoPri 1.0 | 2 | 1% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 146333 melee ticks, 40222 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 64 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 48281 sent, 43534 reached their opponent, 6101 virtual hits (14.0% of those reached).

## Melee bench: F10

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 259 over 6 battles (43.2 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.0 | 161 / 210 | 1.54 | 20.4% | 33580 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.4% | 161 |
| DTF.Kludgy 1.2b | 2.2 | 14.5% | 23 |
| ejb.Polaris 1.0.1 | 3.5 | 12.7% | 16 |
| ne.Chimera 1.2 | 3.5 | 12.7% | 6 |
| tvv.micro.Antares 1.1.1 | 4.8 | 10.2% | 2 |
| vStar.RAFzilla 2.15 | 6.0 | 9.3% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 4.7% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.3 | 29 / 35 | 6074 |
| 2 | 1 | 71.0 | 93.7 | 27 / 35 | 5560 |
| 3 | 1 | 68.9 | 91.4 | 20 / 35 | 4908 |
| 4 | 1 | 70.5 | 90.8 | 25 / 35 | 5915 |
| 5 | 1 | 72.5 | 100.0 | 35 / 35 | 5719 |
| 6 | 1 | 70.7 | 94.0 | 25 / 35 | 5404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 69 | 86% |
| ne.Chimera 1.2 | 39 | 92% |
| ejb.Polaris 1.0.1 | 39 | 85% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| vStar.RAFzilla 2.15 | 10 | 90% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 35% | 71 |
| ne.Chimera 1.2 | 13 | 25% | 39 |
| ejb.Polaris 1.0.1 | 11 | 22% | 54 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 13 |
| kurios.DOSexe .9b | 2 | 4% | 10 |
| vStar.RAFzilla 2.15 | 1 | 2% | 12 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 142230 melee ticks, 51766 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 105 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 105 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 46869 sent, 42125 reached their opponent, 7989 virtual hits (19.0% of those reached).

## Melee bench: F11

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 348 over 6 battles (58.0 per battle, most in one battle 143). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.1 | 82 / 210 | 2.52 | 16.8% | 23298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.3 | 16.8% | 82 |
| rz.Aleph 0.34 | 1.8 | 16.1% | 63 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 19 |
| djc.DynaBot 0.1.1 | 4.0 | 10.9% | 12 |
| uji.YellohFellah 1.0 | 5.8 | 8.8% | 11 |
| rdt199.Warlord 0.73 | 6.0 | 8.8% | 12 |
| br2.MobyDickBot 1.6 | 6.2 | 9.0% | 10 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 85.7 | 15 / 35 | 4014 |
| 2 | 2 | 64.7 | 80.3 | 14 / 35 | 3780 |
| 3 | 1 | 65.2 | 81.3 | 14 / 35 | 3809 |
| 4 | 1 | 65.7 | 82.9 | 13 / 35 | 3934 |
| 5 | 2 | 64.7 | 82.2 | 13 / 35 | 3502 |
| 6 | 1 | 67.1 | 86.3 | 13 / 35 | 4259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 47% |
| cx.mini.Nimrod 0.55 | 21 | 71% |
| djc.DynaBot 0.1.1 | 16 | 81% |
| uji.YellohFellah 1.0 | 15 | 73% |
| br2.MobyDickBot 1.6 | 11 | 55% |
| rdt199.Warlord 0.73 | 11 | 64% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 52 | 40% | 85 |
| cx.mini.Nimrod 0.55 | 33 | 25% | 46 |
| djc.DynaBot 0.1.1 | 13 | 10% | 20 |
| rdt199.Warlord 0.73 | 12 | 9% | 22 |
| uji.YellohFellah 1.0 | 7 | 5% | 14 |
| br2.MobyDickBot 1.6 | 7 | 5% | 12 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 5 |
| stelo.MirrorNano 1.3 | 2 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 162144 melee ticks, 38247 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 48 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 52105 sent, 47197 reached their opponent, 6482 virtual hits (13.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 6 battles (19.7 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.8 | 129 / 210 | 2.19 | 18.2% | 23572 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.2% | 129 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.4% | 24 |
| nat.PallasHawk 1.0 | 3.0 | 12.8% | 26 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 16 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 9 |
| jrm.Test0 1.0 | 6.7 | 8.3% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.1% | 2 |
| jp.Perpy 16.0 | 7.5 | 6.7% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 92.1 | 22 / 35 | 3778 |
| 2 | 1 | 66.1 | 81.6 | 19 / 35 | 3745 |
| 3 | 1 | 68.5 | 89.2 | 23 / 35 | 4150 |
| 4 | 1 | 66.1 | 81.0 | 18 / 35 | 4071 |
| 5 | 1 | 68.3 | 89.2 | 25 / 35 | 3853 |
| 6 | 1 | 67.6 | 87.9 | 22 / 35 | 3975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 50 | 88% |
| bts.wiki.RipCurl 0.9b | 39 | 85% |
| nat.PallasHawk 1.0 | 33 | 76% |
| brainfade.melee.Genghis 0.36 | 18 | 78% |
| jrm.Test0 1.0 | 5 | 100% |
| cs.sheldor.Talon 1.1 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |
| jp.Perpy 16.0 | 1 | 0% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 21 | 25% | 47 |
| bts.wiki.RipCurl 0.9b | 21 | 25% | 42 |
| darkcanuck.Leon 1.01 | 13 | 15% | 64 |
| jrm.Test0 1.0 | 12 | 14% | 16 |
| brainfade.melee.Genghis 0.36 | 8 | 9% | 20 |
| cs.sheldor.Talon 1.1 | 6 | 7% | 13 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 2 |

Posture (Hadur's M records, 198 rounds): 124532 melee ticks, 39380 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 56 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 43160 sent, 38215 reached their opponent, 6357 virtual hits (16.6% of those reached).

## Melee bench: F13

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 91 over 6 battles (15.2 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.1 | 56 / 210 | 2.70 | 15.9% | 24869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 16.6% | 43 |
| mn.Combat 3.25.0 | 2.0 | 16.3% | 78 |
| hadur117.Hadur 3.20aa | 2.5 | 15.9% | 56 |
| shinh.Entangled 0.3 | 4.3 | 11.9% | 18 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 12 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.2% | 3 |
| ayk.WallHugger 1.0 | 8.3 | 4.7% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 81.3 | 10 / 35 | 4164 |
| 2 | 3 | 64.1 | 78.7 | 9 / 35 | 3887 |
| 3 | 2 | 65.2 | 81.9 | 8 / 35 | 4254 |
| 4 | 2 | 67.0 | 85.4 | 13 / 35 | 4434 |
| 5 | 2 | 65.6 | 81.9 | 11 / 35 | 4259 |
| 6 | 3 | 63.4 | 77.5 | 5 / 35 | 3871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 45 | 64% |
| mn.Combat 3.25.0 | 42 | 26% |
| shinh.Entangled 0.3 | 17 | 53% |
| gh.micro.Gruweltje 0.7 | 9 | 78% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 154 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 53 | 34% | 73 |
| mn.Combat 3.25.0 | 48 | 31% | 63 |
| shinh.Entangled 0.3 | 25 | 16% | 33 |
| gh.micro.Gruweltje 0.7 | 11 | 7% | 22 |
| stelo.Wang 1.0 | 9 | 6% | 9 |
| maribo.FollowFire 1 | 4 | 3% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 3 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
| sample.Tracker 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 202 rounds): 145626 melee ticks, 42167 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 64 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 1.

Targeting waves (202 rounds): 42465 sent, 37408 reached their opponent, 5971 virtual hits (16.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 161 over 6 battles (26.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.6 | 156 / 210 | 1.58 | 20.7% | 35002 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.7% | 156 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 16 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.1% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.9% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 9.6% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.1% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.2 | 8.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.5% | 3 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.0 | 29 / 35 | 6075 |
| 2 | 1 | 71.3 | 94.3 | 28 / 35 | 5719 |
| 3 | 1 | 71.9 | 96.2 | 28 / 35 | 5770 |
| 4 | 1 | 70.5 | 91.1 | 22 / 35 | 5889 |
| 5 | 1 | 71.4 | 94.3 | 25 / 35 | 5852 |
| 6 | 1 | 70.7 | 91.7 | 24 / 35 | 5697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 79 | 94% |
| catcat20.shape.Theta 0.018 | 57 | 77% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 75% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| pa.Improved 1.0 | 1 | 0% |

Hadur died in 54 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 19 | 35% | 55 |
| simonton.micro.Sprout 1.1.3 | 17 | 31% | 87 |
| sanyi.mikrobi.Roberto 1.0 | 7 | 13% | 28 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 3 |
| pa.Improved 1.0 | 1 | 2% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 198 rounds): 140575 melee ticks, 49583 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 57 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 44248 sent, 39682 reached their opponent, 9634 virtual hits (24.3% of those reached).

## Melee bench: F15

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 246 over 6 battles (41.0 per battle, most in one battle 126). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.6 | 114 / 210 | 2.30 | 18.6% | 30255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.6% | 114 |
| emp.Yngwie 1.11 | 2.7 | 13.5% | 46 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.5% | 17 |
| mld.DustBunny 3.8 | 3.5 | 12.5% | 6 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.0% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.2% | 19 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.5% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.6 | 17 / 35 | 4676 |
| 2 | 1 | 69.0 | 84.4 | 20 / 35 | 5446 |
| 3 | 1 | 67.2 | 85.4 | 18 / 35 | 4517 |
| 4 | 1 | 66.4 | 82.5 | 15 / 35 | 4574 |
| 5 | 1 | 69.2 | 83.5 | 22 / 35 | 5744 |
| 6 | 1 | 69.9 | 89.2 | 22 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 62 | 63% |
| kawigi.micro.Shiz 1.1 | 36 | 94% |
| kawigi.robot.Girl 1.2 | 21 | 57% |
| mld.DustBunny 3.8 | 14 | 100% |
| cb.nano.Insomnia 1.0 | 9 | 100% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 38% | 78 |
| kawigi.robot.Girl 1.2 | 15 | 15% | 21 |
| mld.DustBunny 3.8 | 13 | 13% | 39 |
| kawigi.micro.Shiz 1.1 | 10 | 10% | 40 |
| cb.nano.Insomnia 1.0 | 9 | 9% | 11 |
| Grystrion.TrackerWO 1.0 | 6 | 6% | 7 |
| divineomega.TrialBot 0.003 | 3 | 3% | 8 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 4 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 163977 melee ticks, 43149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 42 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 53087 sent, 48360 reached their opponent, 7813 virtual hits (16.2% of those reached).

## Melee bench: F16

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 226 over 6 battles (37.7 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.6 | 123 / 210 | 2.03 | 19.6% | 33130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.6% | 123 |
| gh.Griezel 0.5.2 | 2.0 | 15.6% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 8 |
| bvh.fnr.Fenrir 0.36l | 4.7 | 10.0% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 9.9% | 22 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 8 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.8% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 86.7 | 20 / 35 | 5707 |
| 2 | 1 | 71.4 | 92.1 | 23 / 35 | 6064 |
| 3 | 1 | 70.5 | 90.5 | 21 / 35 | 5601 |
| 4 | 1 | 69.5 | 88.6 | 22 / 35 | 5228 |
| 5 | 1 | 69.2 | 86.3 | 20 / 35 | 5323 |
| 6 | 1 | 69.0 | 87.3 | 17 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 90 | 77% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 81% |
| techdude.forest.FlamingForest 1.1 | 26 | 58% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1120. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 30 | 34% | 95 |
| techdude.forest.FlamingForest 1.1 | 16 | 18% | 29 |
| bvh.fnr.Fenrir 0.36l | 16 | 18% | 25 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 16% | 32 |
| stelo.IntrinsicVolatility 1.4 | 5 | 6% | 11 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 7 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 173190 melee ticks, 64844 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 73 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 55454 sent, 50736 reached their opponent, 8630 virtual hits (17.0% of those reached).

## Melee bench: F17

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 360 over 6 battles (60.0 per battle, most in one battle 141). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.3 | 111 / 210 | 1.97 | 19.8% | 35205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.8% | 111 |
| et.Predator 1.8 | 2.2 | 14.0% | 20 |
| cx.BlestPain 1.41 | 3.2 | 12.8% | 39 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.6% | 29 |
| ahf.NanoAndrew .4 | 5.0 | 9.7% | 8 |
| maribo.melee.BMV 0.1 | 6.3 | 8.6% | 1 |
| nic.Nicator 2.4 | 6.7 | 8.5% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 6.0% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.1 | 21 / 35 | 6020 |
| 2 | 1 | 71.2 | 92.4 | 20 / 35 | 6340 |
| 3 | 1 | 71.6 | 93.3 | 22 / 35 | 6072 |
| 4 | 1 | 68.2 | 84.8 | 16 / 35 | 5306 |
| 5 | 1 | 69.2 | 86.7 | 18 / 35 | 5705 |
| 6 | 1 | 69.4 | 87.3 | 14 / 35 | 5762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 59 | 78% |
| oog.melee.Mercutio 1.0 | 49 | 82% |
| cx.BlestPain 1.41 | 36 | 33% |
| ahf.NanoAndrew .4 | 8 | 75% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| edu.otg.spr.TheTeacher 1.2 | 3 | 100% |
| nic.Nicator 2.4 | 1 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1159. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 31 | 31% | 79 |
| cx.BlestPain 1.41 | 31 | 31% | 42 |
| oog.melee.Mercutio 1.0 | 17 | 17% | 52 |
| ahf.NanoAndrew .4 | 11 | 11% | 21 |
| maribo.melee.BMV 0.1 | 6 | 6% | 7 |
| tex.Longbot 0.4 | 2 | 2% | 4 |
| nic.Nicator 2.4 | 1 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 165860 melee ticks, 62158 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 55 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 55 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 54104 sent, 49362 reached their opponent, 10256 virtual hits (20.8% of those reached).

## Melee bench: F18

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 197 over 6 battles (32.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.2 | 128 / 210 | 1.89 | 19.4% | 29084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.4% | 128 |
| morbid.MorbidPriest 1.0 | 2.0 | 14.2% | 34 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.3% | 22 |
| uji.DBH 1.1 | 4.2 | 10.7% | 6 |
| spinnercat.Robovirus 2.718 | 5.3 | 8.7% | 7 |
| sigterm.Sigterm 1.0 | 6.0 | 8.3% | 4 |
| ratosh.Nobo 0.21 | 6.3 | 8.4% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 4 |
| stelo.WangRobot 1.0 | 9.3 | 5.7% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 23 / 35 | 4846 |
| 2 | 1 | 69.0 | 91.1 | 19 / 35 | 4965 |
| 3 | 1 | 70.8 | 95.2 | 28 / 35 | 4860 |
| 4 | 1 | 68.4 | 88.6 | 17 / 35 | 4895 |
| 5 | 1 | 67.7 | 85.4 | 19 / 35 | 4734 |
| 6 | 1 | 69.1 | 89.8 | 22 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 62 | 73% |
| agd.Mooserwirt2 2.7 | 37 | 84% |
| uji.DBH 1.1 | 28 | 89% |
| sigterm.Sigterm 1.0 | 16 | 75% |
| spinnercat.Robovirus 2.718 | 8 | 38% |
| ratosh.Nobo 0.21 | 7 | 71% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 67% |
| stelo.WangRobot 1.0 | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 34% | 74 |
| uji.DBH 1.1 | 11 | 13% | 26 |
| agd.Mooserwirt2 2.7 | 10 | 12% | 44 |
| sigterm.Sigterm 1.0 | 7 | 9% | 16 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 9% | 11 |
| ratosh.Nobo 0.21 | 6 | 7% | 19 |
| spinnercat.Robovirus 2.718 | 6 | 7% | 9 |
| stelo.WangRobot 1.0 | 4 | 5% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 4 |

Posture (Hadur's M records, 200 rounds): 134833 melee ticks, 47687 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 57 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 45543 sent, 40782 reached their opponent, 8834 virtual hits (21.7% of those reached).

## Melee bench: F19

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.4 | 98.2 | 197 / 210 | 1.16 | 22.3% | 36341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 22.3% | 197 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.9% | 6 |
| mld.Infinity 2.2 | 3.0 | 12.2% | 5 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.2% | 1 |
| erdnis.Rover 0.3 | 5.0 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 0 |
| mbh.Mbh 0.1 | 7.5 | 6.8% | 0 |
| pac.ABC 2.1 | 7.8 | 6.4% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.7 | 99.0 | 34 / 35 | 5975 |
| 2 | 1 | 73.5 | 98.1 | 33 / 35 | 6129 |
| 3 | 1 | 73.7 | 98.4 | 34 / 35 | 6318 |
| 4 | 1 | 72.8 | 97.1 | 31 / 35 | 5932 |
| 5 | 1 | 73.5 | 98.1 | 33 / 35 | 6156 |
| 6 | 1 | 73.1 | 98.4 | 32 / 35 | 5831 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 117 | 99% |
| mld.Infinity 2.2 | 28 | 96% |
| krillr.mini.JointStrike 2.0.0 | 25 | 96% |
| erdnis.Rover 0.3 | 14 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 14 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| krillr.mini.JointStrike 2.0.0 | 7 | 50% | 35 |
| davidalves.net.DuelistMiniMelee 1.2 | 4 | 29% | 76 |
| erdnis.Rover 0.3 | 2 | 14% | 22 |
| mld.Infinity 2.2 | 1 | 7% | 32 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 20 |
| mbh.Mbh 0.1 | 0 | 0% | 10 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 3 |

Posture (Hadur's M records, 198 rounds): 126245 melee ticks, 45473 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (198 rounds): longest scan gap while four or more were alive 64 ticks (198 rounds over 8); rounds whose longest gap at any count was over 8: 198; robots dropped as dead without a death event: 0.

Targeting waves (198 rounds): 42845 sent, 38258 reached their opponent, 8859 virtual hits (23.2% of those reached).

## Melee bench: F20

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 419 over 6 battles (69.8 per battle, most in one battle 127). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.6 | 144 / 210 | 1.67 | 21.0% | 36290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.0% | 144 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 26 |
| fwb.Nine 1.0.1 | 3.7 | 11.1% | 8 |
| catcat20.Rabbit 0.001 | 4.0 | 10.9% | 24 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.3% | 4 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.5% | 2 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.2% | 2 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.6 | 27 / 35 | 6270 |
| 2 | 1 | 70.1 | 88.3 | 20 / 35 | 5899 |
| 3 | 1 | 71.7 | 94.0 | 25 / 35 | 5996 |
| 4 | 1 | 70.2 | 88.9 | 22 / 35 | 5975 |
| 5 | 1 | 71.4 | 93.0 | 22 / 35 | 6162 |
| 6 | 1 | 72.3 | 95.9 | 28 / 35 | 5988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 85% |
| fwb.Nine 1.0.1 | 41 | 100% |
| catcat20.Rabbit 0.001 | 36 | 58% |
| nz.jdc.nano.GridFu 1.0 | 10 | 80% |
| m3thos.mini.Eva01 0.5.5 | 8 | 75% |
| bayen.nut.Squirrel 1.615 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1017. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 50% | 98 |
| catcat20.Rabbit 0.001 | 16 | 23% | 46 |
| fwb.Nine 1.0.1 | 5 | 7% | 21 |
| m3thos.mini.Eva01 0.5.5 | 3 | 4% | 14 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 7 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 14 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 166596 melee ticks, 56705 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 47 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51948 sent, 47122 reached their opponent, 10442 virtual hits (22.2% of those reached).

## Melee bench: F21

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 651 over 6 battles (108.5 per battle, most in one battle 115). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.5 | 127 / 210 | 1.68 | 20.3% | 34542 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.3% | 127 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 60 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 7 |
| eld.Hmm 1.0 | 5.2 | 8.6% | 9 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.8% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.7% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.6% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.1 | 23 / 35 | 5721 |
| 2 | 1 | 71.2 | 94.0 | 19 / 35 | 5915 |
| 3 | 1 | 70.1 | 90.8 | 20 / 35 | 5387 |
| 4 | 1 | 71.2 | 92.1 | 20 / 35 | 6207 |
| 5 | 1 | 70.1 | 92.4 | 22 / 35 | 5223 |
| 6 | 1 | 71.8 | 94.6 | 23 / 35 | 6089 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 119 | 66% |
| dummy.mini.Scimitar 1.01 | 28 | 89% |
| cf.RiO.RiOx 4.2.1 | 21 | 81% |
| eld.Hmm 1.0 | 11 | 36% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1331. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 54% | 110 |
| dummy.mini.Scimitar 1.01 | 13 | 14% | 47 |
| eld.Hmm 1.0 | 11 | 12% | 24 |
| cf.RiO.RiOx 4.2.1 | 9 | 10% | 20 |
| PSW.Relentless 0.1 | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 6 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
8 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 179946 melee ticks, 85524 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 96 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 96 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 52709 sent, 47949 reached their opponent, 8153 virtual hits (17.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 207 over 6 battles (34.5 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.5 | 101 / 210 | 2.03 | 18.4% | 29296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.4% | 101 |
| pe.SandboxDT 2.71m | 2.0 | 17.2% | 62 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.9% | 22 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 4 |
| yk.JahRoslav 1.1 | 6.3 | 6.8% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 1 |
| gg.Squaraus 0.6 | 7.8 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 17 / 35 | 5072 |
| 2 | 1 | 69.0 | 87.3 | 18 / 35 | 4850 |
| 3 | 1 | 68.5 | 88.6 | 15 / 35 | 4619 |
| 4 | 1 | 68.2 | 87.3 | 17 / 35 | 4853 |
| 5 | 1 | 69.5 | 90.2 | 18 / 35 | 5069 |
| 6 | 1 | 68.9 | 89.2 | 16 / 35 | 4833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 71 | 55% |
| kvk.HebusLeTroll 0.35 | 42 | 69% |
| jlm.javaDisturbance 0.59 | 34 | 79% |
| bigpete.Stewie 1.0 | 5 | 80% |
| pbg.NinjaX 1.2 | 2 | 50% |
| gg.Squaraus 0.6 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 111 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 47 | 42% | 91 |
| kvk.HebusLeTroll 0.35 | 30 | 27% | 59 |
| jlm.javaDisturbance 0.59 | 19 | 17% | 36 |
| bigpete.Stewie 1.0 | 6 | 5% | 13 |
| tad.Dalek98 0.98 | 3 | 3% | 3 |
| pbg.NinjaX 1.2 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 161660 melee ticks, 51885 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 32 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 2.

Targeting waves (202 rounds): 51464 sent, 46586 reached their opponent, 7343 virtual hits (15.8% of those reached).

## Melee bench: F23

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 281 over 6 battles (46.8 per battle, most in one battle 119). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.3 | 95.8 | 182 / 210 | 1.38 | 22.0% | 36624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 22.0% | 182 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 16 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.2% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.2% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.8% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 1 |
| sample.Walls 1.0 | 7.7 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.6 | 29 / 35 | 5837 |
| 2 | 1 | 73.4 | 98.7 | 32 / 35 | 6120 |
| 3 | 1 | 73.5 | 96.8 | 30 / 35 | 6100 |
| 4 | 1 | 72.7 | 94.6 | 30 / 35 | 5740 |
| 5 | 1 | 73.3 | 93.3 | 29 / 35 | 6159 |
| 6 | 1 | 73.9 | 95.9 | 32 / 35 | 6668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 119 | 95% |
| cre.Karolos 0.32 | 48 | 94% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 89% |
| cw.megas.Blade 0.8 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cre.Karolos 0.32 | 11 | 37% | 46 |
| pe.SandboxLump 1.52 | 10 | 33% | 110 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 10% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 18 |
| stelo.AreaTargetingBot 1.1 | 2 | 7% | 13 |
| sample.Walls 1.0 | 0 | 0% | 8 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 201 rounds): 121785 melee ticks, 47493 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 34 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 38177 sent, 33548 reached their opponent, 10180 virtual hits (30.3% of those reached).

## Melee bench: F24

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 518 over 6 battles (86.3 per battle, most in one battle 125). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.3 | 88 / 210 | 2.41 | 17.1% | 23860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 17.1% | 88 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.3% | 35 |
| florent.XSeries.X2 0.12 | 3.2 | 13.4% | 30 |
| davidalves.Phoenix 0.54 | 3.3 | 12.5% | 36 |
| pedersen.Ugluk 1.1.1 | 5.0 | 10.9% | 15 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 3 |
| lunchie.Lunchbox 0.93 | 7.3 | 6.6% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.8 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.0% | 0 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.5 | 17 / 35 | 4622 |
| 2 | 1 | 66.2 | 85.7 | 14 / 35 | 3756 |
| 3 | 1 | 64.8 | 83.8 | 11 / 35 | 3699 |
| 4 | 1 | 66.9 | 84.1 | 20 / 35 | 4080 |
| 5 | 1 | 65.1 | 81.0 | 10 / 35 | 4066 |
| 6 | 1 | 65.2 | 81.9 | 16 / 35 | 3637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 45 | 71% |
| florent.XSeries.X2 0.12 | 35 | 54% |
| davidalves.Phoenix 0.54 | 23 | 52% |
| pedersen.Ugluk 1.1.1 | 19 | 63% |
| oog.melee.Corsair 1.0 | 10 | 80% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 29% | 53 |
| rz.GlowBlowMelee 1.4 | 29 | 23% | 59 |
| davidalves.Phoenix 0.54 | 29 | 23% | 44 |
| pedersen.Ugluk 1.1.1 | 17 | 13% | 26 |
| oog.melee.Corsair 1.0 | 9 | 7% | 20 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 142355 melee ticks, 37505 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 64 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 46612 sent, 41567 reached their opponent, 7442 virtual hits (17.9% of those reached).

## Melee bench: F25

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 742 over 6 battles (123.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.7 | 141 / 210 | 2.20 | 18.7% | 24933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.7% | 141 |
| voidious.micro.BlitzBat 1.05 | 2.3 | 13.0% | 11 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.0% | 19 |
| jdw.Hurricane 1.4 | 4.0 | 11.6% | 15 |
| ds.Oo 2.2 | 5.3 | 9.5% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.7% | 9 |
| awesomeness.Elite 1.0 | 7.5 | 7.1% | 4 |
| adt.Ar2 1.1 | 7.7 | 6.8% | 1 |
| gjr.Cephalosporin 0.1 | 9.0 | 6.1% | 2 |
| amk.ChumbaMini 0.2 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 23 / 35 | 4100 |
| 2 | 1 | 68.2 | 86.0 | 24 / 35 | 4167 |
| 3 | 1 | 67.5 | 84.4 | 24 / 35 | 4012 |
| 4 | 1 | 68.8 | 88.3 | 24 / 35 | 4173 |
| 5 | 1 | 69.3 | 89.2 | 25 / 35 | 4462 |
| 6 | 1 | 67.3 | 83.8 | 21 / 35 | 4019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 38 | 92% |
| voidious.micro.BlitzBat 1.05 | 37 | 97% |
| jdw.Hurricane 1.4 | 34 | 91% |
| gre.svman4.Morfeas 1.4.1 | 16 | 81% |
| ds.Oo 2.2 | 15 | 87% |
| awesomeness.Elite 1.0 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 17 | 23% | 43 |
| voidious.mini.BrokenSword 2.0.3 | 15 | 20% | 49 |
| voidious.micro.BlitzBat 1.05 | 10 | 13% | 39 |
| gre.svman4.Morfeas 1.4.1 | 9 | 12% | 25 |
| ds.Oo 2.2 | 6 | 8% | 24 |
| awesomeness.Elite 1.0 | 5 | 7% | 14 |
| adt.Ar2 1.1 | 3 | 4% | 7 |
| amk.ChumbaMini 0.2 | 3 | 4% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 6 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 130049 melee ticks, 31111 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 33 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 45303 sent, 40438 reached their opponent, 6790 virtual hits (16.8% of those reached).

## Melee bench: F26

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 6 battles (17.3 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 93.9 | 154 / 210 | 1.55 | 21.1% | 37500 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.1% | 154 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 21 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 20 |
| lrem.Spectre 0.4.4 | 4.0 | 11.7% | 9 |
| js.PinBall 1.6 | 4.7 | 10.8% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 8.9% | 3 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.1% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.5% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.2 | 26 / 35 | 6202 |
| 2 | 1 | 72.5 | 94.3 | 26 / 35 | 6369 |
| 3 | 1 | 72.9 | 94.6 | 27 / 35 | 6695 |
| 4 | 1 | 72.2 | 94.9 | 27 / 35 | 6061 |
| 5 | 1 | 71.5 | 92.7 | 23 / 35 | 6045 |
| 6 | 1 | 71.4 | 91.7 | 25 / 35 | 6128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 80 | 84% |
| shu.nitro.LENIN .T34 | 44 | 82% |
| lrem.Spectre 0.4.4 | 27 | 85% |
| js.PinBall 1.6 | 17 | 94% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 22 | 39% | 73 |
| shu.nitro.LENIN .T34 | 14 | 25% | 51 |
| lrem.Spectre 0.4.4 | 10 | 18% | 37 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 11% | 15 |
| js.PinBall 1.6 | 3 | 5% | 29 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 2% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 201 rounds): 157169 melee ticks, 48196 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 0.

Targeting waves (201 rounds): 51259 sent, 46371 reached their opponent, 11175 virtual hits (24.1% of those reached).

## Melee bench: F27

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 220 over 6 battles (36.7 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.5 | 151 / 210 | 2.30 | 19.7% | 33117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.2 | 19.7% | 151 |
| mk.Alpha 0.2.1 | 2.0 | 13.7% | 37 |
| EH.Eagle 1.0.6 | 3.0 | 11.1% | 6 |
| wee.Gem 1.8.4 | 5.2 | 9.1% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 5.3 | 9.4% | 2 |
| sheldor.melee.nano.TestMelee 0.1 | 5.8 | 8.9% | 5 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 1 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.0% | 1 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.1% | 1 |
| cs.Grudge 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.8 | 31 / 35 | 5142 |
| 2 | 1 | 71.9 | 96.5 | 30 / 35 | 5662 |
| 3 | 1 | 71.9 | 94.0 | 29 / 35 | 6113 |
| 4 | 1 | 66.2 | 70.5 | 20 / 35 | 5410 |
| 5 | 2 | 61.8 | 61.3 | 12 / 35 | 5111 |
| 6 | 1 | 71.3 | 94.0 | 29 / 35 | 5679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 78 | 86% |
| EH.Eagle 1.0.6 | 29 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 21 | 100% |
| throxbot.ThroxBot 0.1 | 12 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 88% |
| wee.Gem 1.8.4 | 7 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 35% | 81 |
| cs.Grudge 1.0 | 12 | 20% | 13 |
| joe.ADinosaur 1.0 | 8 | 13% | 15 |
| EH.Eagle 1.0.6 | 6 | 10% | 41 |
| throxbot.ThroxBot 0.1 | 4 | 7% | 13 |
| wee.Gem 1.8.4 | 4 | 7% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 3% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 15 |
| caimano.Furia_Ceca 0.22 | 1 | 2% | 7 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 125662 melee ticks, 35047 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 48 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 0.

Targeting waves (203 rounds): 41503 sent, 36836 reached their opponent, 9359 virtual hits (25.4% of those reached).

## Melee bench: F28

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 218 over 6 battles (36.3 per battle, most in one battle 49). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.5 | 128 / 210 | 2.03 | 18.3% | 23474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.3% | 128 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 34 |
| uji.Antique 1.0 | 3.5 | 11.8% | 21 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.3% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.4% | 7 |
| ahr.ice.Ice 1.0.2 | 6.2 | 8.8% | 6 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.6% | 4 |
| matt.advanced.Katana 1.0 | 8.3 | 5.9% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 90.8 | 23 / 35 | 3973 |
| 2 | 1 | 68.0 | 89.5 | 20 / 35 | 3884 |
| 3 | 1 | 68.5 | 91.1 | 24 / 35 | 4076 |
| 4 | 1 | 67.7 | 86.0 | 22 / 35 | 4058 |
| 5 | 1 | 68.0 | 89.5 | 21 / 35 | 4027 |
| 6 | 1 | 65.6 | 84.1 | 18 / 35 | 3456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 71 | 77% |
| uji.Antique 1.0 | 45 | 89% |
| ahr.ice.Ice 1.0.2 | 13 | 77% |
| amk.ChumbaWumba 0.3 | 12 | 83% |
| qohnil.blot.BlotBot 3.61 | 8 | 88% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 32% | 51 |
| pfvicm.Sobieski 7.2.3b | 23 | 28% | 39 |
| uji.Antique 1.0 | 13 | 16% | 52 |
| qohnil.blot.BlotBot 3.61 | 6 | 7% | 23 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 20 |
| amk.ChumbaWumba 0.3 | 5 | 6% | 13 |
| stelo.Lifestealer 1.0 | 2 | 2% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 5 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

Posture (Hadur's M records, 201 rounds): 128392 melee ticks, 34119 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (201 rounds): longest scan gap while four or more were alive 40 ticks (201 rounds over 8); rounds whose longest gap at any count was over 8: 201; robots dropped as dead without a death event: 5.

Targeting waves (201 rounds): 43331 sent, 38528 reached their opponent, 5417 virtual hits (14.1% of those reached).

## Melee bench: F29

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 789 over 6 battles (131.5 per battle, most in one battle 142). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.2 | 96 / 210 | 2.33 | 18.2% | 27079 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.2% | 96 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 48 |
| deewiant.Anomaly 0.2 | 2.5 | 15.1% | 50 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.4% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.0 | 6.6% | 0 |
| DBall.Anarchy 0.1 | 8.3 | 5.5% | 3 |
| ap.Frederick 1.1 | 9.0 | 4.9% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.1 | 16 / 35 | 4361 |
| 2 | 1 | 69.6 | 88.6 | 17 / 35 | 5036 |
| 3 | 1 | 66.4 | 81.6 | 11 / 35 | 4202 |
| 4 | 1 | 68.4 | 85.4 | 21 / 35 | 4342 |
| 5 | 1 | 68.6 | 87.6 | 15 / 35 | 4734 |
| 6 | 1 | 67.6 | 82.9 | 16 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 57% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 61% |
| myl.micro.Troodon 1.10 | 20 | 90% |
| jok.PheonixM 0.1.2 | 15 | 87% |
| DBall.Anarchy 0.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 43% | 92 |
| zyx.mega.YersiniaPestis 3.1 | 39 | 32% | 64 |
| myl.micro.Troodon 1.10 | 13 | 11% | 24 |
| jok.PheonixM 0.1.2 | 7 | 6% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 4 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 164905 melee ticks, 51282 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 46 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 1.

Targeting waves (205 rounds): 53530 sent, 48670 reached their opponent, 7423 virtual hits (15.3% of those reached).

## Melee bench: F30

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 431 over 6 battles (71.8 per battle, most in one battle 134). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.9 | 42 / 210 | 3.08 | 15.3% | 23908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.3 | 15.3% | 42 |
| catcat20.Matcha 0.006 | 2.0 | 14.8% | 62 |
| darkcanuck.B26354 1.06 | 3.3 | 13.3% | 44 |
| oog.melee.Capulet 1.2 | 4.2 | 12.3% | 26 |
| stelo.PastFuture 2.3.2 | 4.2 | 11.6% | 15 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.2% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.6% | 8 |
| ntc.Opposite 1.5 | 7.8 | 7.2% | 0 |
| tripphippy.Alice 1.1 | 8.8 | 6.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.7 | 75.6 | 6 / 35 | 3839 |
| 2 | 2 | 62.7 | 75.6 | 5 / 35 | 3893 |
| 3 | 1 | 64.7 | 79.0 | 9 / 35 | 4225 |
| 4 | 1 | 64.2 | 78.7 | 10 / 35 | 3927 |
| 5 | 2 | 61.1 | 71.4 | 4 / 35 | 3652 |
| 6 | 1 | 65.3 | 81.0 | 8 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 35 | 17% |
| darkcanuck.B26354 1.06 | 20 | 45% |
| oog.melee.Capulet 1.2 | 20 | 60% |
| stelo.PastFuture 2.3.2 | 11 | 82% |
| intruder.PrairieWolf 2.61 | 7 | 43% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 17% |
| tripphippy.Alice 1.1 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 45 | 26% | 54 |
| darkcanuck.B26354 1.06 | 43 | 25% | 50 |
| oog.melee.Capulet 1.2 | 27 | 16% | 35 |
| stelo.PastFuture 2.3.2 | 25 | 15% | 35 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 8 |
| tripphippy.Alice 1.1 | 5 | 3% | 8 |
| ntc.Opposite 1.5 | 4 | 2% | 4 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 163653 melee ticks, 29429 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 34 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 1.

Targeting waves (203 rounds): 51923 sent, 46981 reached their opponent, 7846 virtual hits (16.7% of those reached).

## Melee bench: F31

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 438 over 6 battles (73.0 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.5 | 80 / 210 | 2.49 | 16.9% | 23674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.8% | 82 |
| hadur117.Hadur 3.20aa | 1.8 | 16.9% | 80 |
| gh.mini.Griezel 0.2 | 3.2 | 13.0% | 32 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.0% | 12 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.8% | 4 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.3% | 1 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.1% | 1 |
| fm.mammillarias 1.3 | 8.0 | 5.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 75.6 | 11 / 35 | 3865 |
| 2 | 1 | 67.0 | 85.7 | 14 / 35 | 4192 |
| 3 | 2 | 67.1 | 86.7 | 13 / 35 | 3777 |
| 4 | 2 | 68.0 | 89.5 | 16 / 35 | 3871 |
| 5 | 2 | 66.6 | 83.5 | 14 / 35 | 4215 |
| 6 | 2 | 65.1 | 80.0 | 12 / 35 | 3754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 58 | 50% |
| gh.mini.Griezel 0.2 | 39 | 67% |
| d414.nano.Quantum 1.0.0 | 14 | 86% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 62 | 46% | 96 |
| gh.mini.Griezel 0.2 | 30 | 22% | 57 |
| spinnercat.micro.Tyger 0.1 | 18 | 13% | 23 |
| d414.nano.Quantum 1.0.0 | 10 | 7% | 19 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 4 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 7 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 202 rounds): 153818 melee ticks, 44681 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (202 rounds): longest scan gap while four or more were alive 38 ticks (202 rounds over 8); rounds whose longest gap at any count was over 8: 202; robots dropped as dead without a death event: 0.

Targeting waves (202 rounds): 49443 sent, 44562 reached their opponent, 7145 virtual hits (16.0% of those reached).

## Melee bench: F32

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 521 over 6 battles (86.8 per battle, most in one battle 129). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.0 | 124 / 210 | 1.99 | 18.6% | 27628 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.6% | 124 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 46 |
| apc.botM 3.0 | 3.0 | 12.0% | 18 |
| lxx.ConceptA 0.8 | 4.3 | 10.3% | 6 |
| vjik.UnViolation 1.1 | 5.2 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 6.0 | 8.8% | 4 |
| yk.JahMicro 1.0 | 7.2 | 7.3% | 3 |
| panzer.Panzer 0.2 | 7.5 | 7.2% | 2 |
| conscience.Electron 1.3g | 9.2 | 5.9% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 89.2 | 21 / 35 | 4800 |
| 2 | 1 | 68.3 | 91.1 | 19 / 35 | 4673 |
| 3 | 1 | 68.0 | 89.2 | 20 / 35 | 4336 |
| 4 | 1 | 69.0 | 90.5 | 21 / 35 | 4876 |
| 5 | 1 | 68.1 | 89.2 | 21 / 35 | 4495 |
| 6 | 1 | 66.9 | 84.8 | 22 / 35 | 4448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 75 | 69% |
| apc.botM 3.0 | 31 | 81% |
| lxx.ConceptA 0.8 | 14 | 71% |
| vjik.UnViolation 1.1 | 11 | 73% |
| yk.JahMicro 1.0 | 10 | 90% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| donjezza.Jezza 1.0 | 8 | 100% |
| panzer.Panzer 0.2 | 4 | 75% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 31 | 34% | 81 |
| lxx.ConceptA 0.8 | 17 | 19% | 25 |
| apc.botM 3.0 | 13 | 14% | 38 |
| bayen.UbaMicro 1.4 | 10 | 11% | 19 |
| vjik.UnViolation 1.1 | 9 | 10% | 25 |
| yk.JahMicro 1.0 | 3 | 3% | 12 |
| panzer.Panzer 0.2 | 3 | 3% | 6 |
| conscience.Electron 1.3g | 0 | 0% | 4 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 128077 melee ticks, 45530 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 67 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 43456 sent, 38604 reached their opponent, 6971 virtual hits (18.1% of those reached).

## Melee bench: F33

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 439 over 6 battles (73.2 per battle, most in one battle 133). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.0 | 125 / 210 | 1.99 | 19.6% | 30261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.6% | 125 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.6% | 18 |
| labg.Cataclysm 2.05 | 5.7 | 9.3% | 7 |
| baal.nano.N 1.42 | 5.8 | 9.0% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 3 |
| sanja.First 0.1 | 8.5 | 4.8% | 0 |
| zyx.micro.Ant 1.1 | 8.7 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.8 | 20 / 35 | 5115 |
| 2 | 1 | 67.5 | 81.9 | 17 / 35 | 4608 |
| 3 | 1 | 69.6 | 89.5 | 21 / 35 | 4728 |
| 4 | 1 | 72.1 | 94.3 | 27 / 35 | 5724 |
| 5 | 1 | 70.2 | 89.2 | 23 / 35 | 5270 |
| 6 | 1 | 69.3 | 88.6 | 17 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 66 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 73% |
| gre.svman4.Leonidas 1.3.2 | 35 | 83% |
| labg.Cataclysm 2.05 | 15 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 67% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 32 | 36% | 81 |
| gre.svman4.Leonidas 1.3.2 | 22 | 24% | 47 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 16% | 36 |
| labg.Cataclysm 2.05 | 9 | 10% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 8% | 12 |
| baal.nano.N 1.42 | 2 | 2% | 10 |
| zyx.micro.Ant 1.1 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 172344 melee ticks, 52023 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 49 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 55043 sent, 50230 reached their opponent, 7356 virtual hits (14.6% of those reached).

## Melee bench: F34

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 293 over 6 battles (48.8 per battle, most in one battle 116). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.2 | 94 / 210 | 2.06 | 18.7% | 31627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.7% | 94 |
| kid.Gladiator .7.2 | 2.2 | 16.3% | 42 |
| stelo.Spread 0.9 | 2.8 | 15.3% | 51 |
| jcs.Seth 1.8 | 4.3 | 11.3% | 18 |
| tcf.Reach 3 | 4.7 | 11.2% | 6 |
| cli.Dancer 1.1 | 6.0 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.0% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.3 | 15 / 35 | 5289 |
| 2 | 1 | 69.9 | 92.1 | 17 / 35 | 5065 |
| 3 | 1 | 70.2 | 88.3 | 16 / 35 | 5697 |
| 4 | 1 | 69.2 | 87.0 | 13 / 35 | 5328 |
| 5 | 1 | 69.5 | 89.2 | 19 / 35 | 5077 |
| 6 | 1 | 68.3 | 84.4 | 14 / 35 | 5171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 68 | 63% |
| stelo.Spread 0.9 | 58 | 55% |
| tcf.Reach 3 | 12 | 83% |
| jcs.Seth 1.8 | 11 | 64% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 47 | 39% | 82 |
| kid.Gladiator .7.2 | 44 | 36% | 72 |
| tcf.Reach 3 | 11 | 9% | 25 |
| jcs.Seth 1.8 | 11 | 9% | 23 |
| cli.Dancer 1.1 | 3 | 2% | 5 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 167089 melee ticks, 63240 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 35 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 35 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 1.

Targeting waves (204 rounds): 51674 sent, 46864 reached their opponent, 7657 virtual hits (16.3% of those reached).

## Melee bench: F35

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 157 over 6 battles (26.2 per battle, most in one battle 92). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.4 | 57 / 210 | 2.50 | 16.4% | 23314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.2 | 18.7% | 121 |
| hadur117.Hadur 3.20aa | 1.8 | 16.4% | 57 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.5% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 12.1% | 10 |
| rz.HawkOnFire 0.1 | 4.7 | 11.6% | 4 |
| wit.Chuliath 1.0 | 6.0 | 7.4% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.8% | 1 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.7% | 0 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.3 | 13 / 35 | 4391 |
| 2 | 2 | 66.5 | 86.0 | 12 / 35 | 3896 |
| 3 | 2 | 65.0 | 83.2 | 8 / 35 | 3565 |
| 4 | 2 | 66.0 | 82.2 | 11 / 35 | 4097 |
| 5 | 2 | 63.5 | 78.1 | 4 / 35 | 3643 |
| 6 | 2 | 65.3 | 82.5 | 9 / 35 | 3722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 88 | 24% |
| gh.mini.Gruwel 0.9 | 19 | 53% |
| rz.HawkOnFire 0.1 | 16 | 88% |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 83% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 56% | 110 |
| gh.mini.Gruwel 0.9 | 21 | 14% | 31 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 13% | 29 |
| rz.HawkOnFire 0.1 | 14 | 9% | 26 |
| wit.Chuliath 1.0 | 4 | 3% | 6 |
| dans.Cinnamon 1.2 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 145981 melee ticks, 52363 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 26 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (207 rounds): 45610 sent, 40529 reached their opponent, 6285 virtual hits (15.5% of those reached).

## Melee bench: F36

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 6 battles (21.8 per battle, most in one battle 26). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.8 | 166 / 210 | 1.47 | 21.2% | 32287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.2% | 166 |
| alpha.RainingFire 1.0 | 2.8 | 12.1% | 11 |
| bzdp.Pansy 2.1 | 3.2 | 11.7% | 11 |
| bvh.micro.Freya 0.3 | 4.2 | 11.0% | 9 |
| mz.Cork 0.1 | 4.8 | 10.5% | 4 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.6% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 10.0% | 5 |
| dl.BetterWalls 1.0 | 8.7 | 4.8% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.5 | 29 / 35 | 5622 |
| 2 | 1 | 71.4 | 93.0 | 28 / 35 | 5447 |
| 3 | 1 | 71.6 | 94.0 | 29 / 35 | 5419 |
| 4 | 1 | 71.2 | 94.3 | 26 / 35 | 5306 |
| 5 | 1 | 70.6 | 93.3 | 26 / 35 | 4824 |
| 6 | 1 | 72.3 | 97.5 | 28 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 90% |
| bvh.micro.Freya 0.3 | 43 | 86% |
| alpha.RainingFire 1.0 | 31 | 87% |
| mz.Cork 0.1 | 28 | 96% |
| m3thos.Eva02 0.7.1 | 16 | 88% |
| bvh.mini.Fenrir 0.39 | 16 | 94% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 11 | 25% | 40 |
| bvh.micro.Freya 0.3 | 11 | 25% | 35 |
| bzdp.Pansy 2.1 | 10 | 23% | 45 |
| m3thos.Eva02 0.7.1 | 5 | 11% | 25 |
| bvh.mini.Fenrir 0.39 | 4 | 9% | 18 |
| mz.Cork 0.1 | 3 | 7% | 32 |
| dl.BetterWalls 1.0 | 0 | 0% | 10 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

Posture (Hadur's M records, 200 rounds): 142588 melee ticks, 47073 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 41 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 41 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 0.

Targeting waves (200 rounds): 49310 sent, 44648 reached their opponent, 9312 virtual hits (20.9% of those reached).

## Melee bench: F37

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 143 over 6 battles (23.8 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.1 | 156 / 210 | 2.07 | 19.4% | 34635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 19.4% | 156 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.3% | 5 |
| germ.TheMind .2 | 4.3 | 9.7% | 7 |
| lmk.ACPFinal 0.1 | 4.7 | 9.3% | 7 |
| EBBU.Sim2 1.02 | 4.8 | 9.6% | 3 |
| agrach.Dalek 1.0 | 5.7 | 9.1% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 7.0 | 8.6% | 3 |
| stelo.UntouchableNano 1.3 | 7.2 | 8.4% | 11 |
| mb.Beast 0.1 | 7.7 | 8.2% | 10 |
| skm.Ryubot 1.0 | 9.2 | 7.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 27 / 35 | 5922 |
| 2 | 1 | 68.8 | 88.9 | 25 / 35 | 5987 |
| 3 | 1 | 68.1 | 86.3 | 26 / 35 | 5584 |
| 4 | 1 | 68.9 | 91.1 | 28 / 35 | 5583 |
| 5 | 1 | 69.4 | 91.1 | 27 / 35 | 5892 |
| 6 | 1 | 66.9 | 82.9 | 23 / 35 | 5667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 100% |
| EBBU.Sim2 1.02 | 21 | 100% |
| lmk.ACPFinal 0.1 | 21 | 95% |
| skm.Ryubot 1.0 | 21 | 100% |
| agrach.Dalek 1.0 | 21 | 90% |
| stelo.UntouchableNano 1.3 | 20 | 75% |
| germ.TheMind .2 | 19 | 100% |
| mb.Beast 0.1 | 18 | 94% |

Hadur died in 59 of 210 rounds, at a mean tick of 454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.nano.perceptual.Impact 1.3.0 | 22 | 37% | 26 |
| lmk.ACPFinal 0.1 | 11 | 19% | 35 |
| agrach.Dalek 1.0 | 7 | 12% | 32 |
| stelo.UntouchableNano 1.3 | 6 | 10% | 22 |
| EBBU.Sim2 1.02 | 4 | 7% | 24 |
| skm.Ryubot 1.0 | 4 | 7% | 12 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 3% | 32 |
| mb.Beast 0.1 | 2 | 3% | 10 |
| germ.TheMind .2 | 1 | 2% | 13 |

Posture (Hadur's M records, 200 rounds): 95709 melee ticks, 26460 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (200 rounds): longest scan gap while four or more were alive 39 ticks (200 rounds over 8); rounds whose longest gap at any count was over 8: 200; robots dropped as dead without a death event: 1.

Targeting waves (200 rounds): 32096 sent, 27701 reached their opponent, 8537 virtual hits (30.8% of those reached).

## Melee bench: F38

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 328 over 6 battles (54.7 per battle, most in one battle 131). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.3 | 112 / 210 | 2.14 | 18.4% | 28056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.4% | 112 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 51 |
| bvh.mini.Freya 0.55 | 3.3 | 12.6% | 15 |
| bts.mega.Gnarly 1.4 | 3.8 | 11.8% | 25 |
| cs.Wren 1.0 | 4.8 | 10.3% | 3 |
| kdf.KoulDestroyer 1.0 | 6.2 | 8.8% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.8 | 8.1% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 7.1% | 3 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.7 | 20 / 35 | 4393 |
| 2 | 1 | 67.3 | 83.5 | 17 / 35 | 4782 |
| 3 | 1 | 68.7 | 87.6 | 21 / 35 | 4669 |
| 4 | 1 | 68.1 | 88.3 | 15 / 35 | 4835 |
| 5 | 1 | 68.8 | 88.6 | 21 / 35 | 4626 |
| 6 | 1 | 68.7 | 89.2 | 18 / 35 | 4751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 70 | 66% |
| bts.mega.Gnarly 1.4 | 32 | 63% |
| bvh.mini.Freya 0.55 | 22 | 77% |
| cs.Wren 1.0 | 18 | 100% |
| kdf.KoulDestroyer 1.0 | 7 | 86% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 37 | 37% | 84 |
| bts.mega.Gnarly 1.4 | 20 | 20% | 47 |
| bvh.mini.Freya 0.55 | 18 | 18% | 25 |
| cs.Wren 1.0 | 10 | 10% | 26 |
| kdf.KoulDestroyer 1.0 | 5 | 5% | 10 |
| davidalves.net.DuelistNanoMelee 1.01 | 5 | 5% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 7 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 203 rounds): 141046 melee ticks, 41358 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 79 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (203 rounds): longest scan gap while four or more were alive 79 ticks (203 rounds over 8); rounds whose longest gap at any count was over 8: 203; robots dropped as dead without a death event: 3.

Targeting waves (203 rounds): 46241 sent, 41132 reached their opponent, 8445 virtual hits (20.5% of those reached).

## Melee bench: F39

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 751 over 6 battles (125.2 per battle, most in one battle 139). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 105 / 210 | 2.17 | 18.5% | 30311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 18.5% | 105 |
| bvh.fry.Freya 0.82 | 2.2 | 15.3% | 28 |
| az.Ololobot 0.2.4 | 3.0 | 12.9% | 51 |
| catcat20.Lambda 0.024 | 3.8 | 11.8% | 21 |
| winamp32.micro.MicroMacro 1.0 | 5.7 | 8.5% | 0 |
| gimp.GimpBot 0.1 | 6.3 | 8.1% | 0 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 7.8% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 7.3 | 7.1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.4% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 94.0 | 24 / 35 | 5137 |
| 2 | 1 | 68.3 | 87.0 | 17 / 35 | 5191 |
| 3 | 1 | 69.1 | 91.1 | 17 / 35 | 5371 |
| 4 | 1 | 67.4 | 84.8 | 18 / 35 | 4943 |
| 5 | 1 | 65.6 | 81.0 | 14 / 35 | 4593 |
| 6 | 1 | 67.4 | 84.4 | 15 / 35 | 5076 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 58 | 79% |
| az.Ololobot 0.2.4 | 55 | 44% |
| catcat20.Lambda 0.024 | 36 | 67% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1078. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 37 | 33% | 67 |
| bvh.fry.Freya 0.82 | 36 | 32% | 67 |
| catcat20.Lambda 0.024 | 25 | 22% | 46 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 3% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 2% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 9 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 5 |
6 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 167726 melee ticks, 58459 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 42 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 1.

Targeting waves (208 rounds): 53167 sent, 48156 reached their opponent, 8323 virtual hits (17.3% of those reached).

## Melee bench: F40

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 331 over 6 battles (55.2 per battle, most in one battle 128). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.3 | 139 / 210 | 1.78 | 20.3% | 31631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.3% | 139 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.2% | 27 |
| kano.gamma.KanoGamma 1.8 | 2.7 | 12.7% | 17 |
| mz.AntiGrav 1.0 | 4.2 | 11.0% | 4 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.7% | 5 |
| stelo.Randomness 1.0 | 6.0 | 9.1% | 13 |
| alpha.BlackIce 1.0 | 6.8 | 8.6% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.8% | 0 |
| sample.Corners 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 24 / 35 | 5394 |
| 2 | 1 | 72.6 | 97.1 | 28 / 35 | 5698 |
| 3 | 1 | 71.1 | 91.4 | 25 / 35 | 5426 |
| 4 | 1 | 70.8 | 90.5 | 23 / 35 | 5192 |
| 5 | 1 | 70.9 | 92.4 | 25 / 35 | 5146 |
| 6 | 1 | 67.7 | 85.1 | 14 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 62 | 82% |
| kano.gamma.KanoGamma 1.8 | 50 | 80% |
| mz.AntiGrav 1.0 | 19 | 100% |
| Polkwane.SmashMelee 1.0 | 13 | 85% |
| stelo.Randomness 1.0 | 12 | 50% |
| alpha.BlackIce 1.0 | 9 | 78% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 21 | 28% | 65 |
| kano.gamma.KanoGamma 1.8 | 16 | 22% | 50 |
| stelo.Randomness 1.0 | 12 | 16% | 23 |
| Polkwane.SmashMelee 1.0 | 10 | 14% | 20 |
| mz.AntiGrav 1.0 | 5 | 7% | 25 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 8 |
| alpha.BlackIce 1.0 | 3 | 4% | 13 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 153996 melee ticks, 44645 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 62 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 0.

Targeting waves (205 rounds): 50982 sent, 45859 reached their opponent, 9532 virtual hits (20.8% of those reached).

## Melee bench: F41

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 288 over 6 battles (48.0 per battle, most in one battle 120). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.4 | 95 / 210 | 2.31 | 17.6% | 25597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.2 | 17.6% | 95 |
| eem.EvBotNG v12.8 | 1.8 | 16.3% | 82 |
| ary.Swarm 1.1 | 3.5 | 13.1% | 7 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.6% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.7% | 8 |
| shrub.Silver v048 | 6.2 | 8.3% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.5% | 0 |
| jsal.Jsalbot 1.0 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 80.6 | 14 / 35 | 4035 |
| 2 | 1 | 68.7 | 87.6 | 16 / 35 | 4603 |
| 3 | 1 | 69.3 | 90.2 | 21 / 35 | 4383 |
| 4 | 1 | 67.0 | 84.4 | 13 / 35 | 4184 |
| 5 | 1 | 67.5 | 85.1 | 14 / 35 | 4197 |
| 6 | 1 | 67.3 | 84.8 | 17 / 35 | 4195 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 38% |
| lessonz.robocode.Oz 0.5.0 | 31 | 81% |
| ary.Swarm 1.1 | 21 | 90% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| shrub.Silver v048 | 3 | 100% |
| zyx.nano.Ant 1.1 | 3 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 61 | 52% | 92 |
| lessonz.robocode.Oz 0.5.0 | 19 | 16% | 38 |
| ary.Swarm 1.1 | 14 | 12% | 35 |
| simonton.nano.MeleeSeed 1.8 | 11 | 9% | 24 |
| shrub.Silver v048 | 4 | 3% | 10 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| stelo.Mirror 1.1 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |
3 death(s) with no robot to name.

Posture (Hadur's M records, 204 rounds): 149051 melee ticks, 50451 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 80 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (204 rounds): longest scan gap while four or more were alive 80 ticks (204 rounds over 8); rounds whose longest gap at any count was over 8: 204; robots dropped as dead without a death event: 0.

Targeting waves (204 rounds): 49593 sent, 44590 reached their opponent, 6790 virtual hits (15.2% of those reached).

## Melee bench: F42

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 309 over 6 battles (51.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.3 | 139 / 210 | 1.69 | 20.3% | 34710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.3% | 139 |
| wompi.Wallaby 5.1 | 2.0 | 15.5% | 38 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 12 |
| ara.Shera 0.88 | 3.7 | 12.5% | 18 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 2 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 1 |
| maribo.IotaCT 1.1 | 6.8 | 6.8% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.7 | 24 / 35 | 5942 |
| 2 | 1 | 70.7 | 92.1 | 22 / 35 | 5709 |
| 3 | 1 | 70.7 | 93.0 | 24 / 35 | 5696 |
| 4 | 1 | 70.0 | 91.1 | 20 / 35 | 5579 |
| 5 | 1 | 71.6 | 94.0 | 25 / 35 | 6179 |
| 6 | 1 | 70.4 | 90.2 | 24 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 89 | 82% |
| maribo.mini.MiniQuester 0.1 | 47 | 87% |
| ara.Shera 0.88 | 23 | 65% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 4 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 29 | 40% | 99 |
| ara.Shera 0.88 | 22 | 30% | 38 |
| maribo.mini.MiniQuester 0.1 | 14 | 19% | 52 |
| amz.NanoClone 1.41 | 5 | 7% | 8 |
| dsw.StaticD 1.0 | 1 | 1% | 8 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 172644 melee ticks, 49042 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 40 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 53337 sent, 48563 reached their opponent, 9635 virtual hits (19.8% of those reached).

## Melee bench: F43

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 507 over 6 battles (84.5 per battle, most in one battle 132). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.6 | 31 / 210 | 2.92 | 15.4% | 22978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 144 |
| hadur117.Hadur 3.20aa | 2.0 | 15.4% | 31 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.0% | 4 |
| brainfade.melee.Dusk 0.44 | 3.7 | 13.0% | 26 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.6% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.3% | 4 |
| jab.DiamondStealer 5 | 7.0 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 79.0 | 6 / 35 | 3802 |
| 2 | 2 | 65.2 | 78.4 | 5 / 35 | 3821 |
| 3 | 2 | 65.1 | 78.7 | 5 / 35 | 3860 |
| 4 | 2 | 66.2 | 79.4 | 6 / 35 | 4204 |
| 5 | 2 | 64.7 | 77.5 | 4 / 35 | 3629 |
| 6 | 2 | 64.9 | 78.7 | 5 / 35 | 3662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 70 | 14% |
| brainfade.melee.Dusk 0.44 | 21 | 33% |
| dummy.micro.Sparrow 2.5 | 8 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |
| mz.NanoGod 2.02 | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 105 | 57% | 121 |
| brainfade.melee.Dusk 0.44 | 30 | 16% | 35 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 8% | 19 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 3 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 207 rounds): 156247 melee ticks, 43327 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 97 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (207 rounds): longest scan gap while four or more were alive 97 ticks (207 rounds over 8); rounds whose longest gap at any count was over 8: 207; robots dropped as dead without a death event: 1.

Targeting waves (207 rounds): 49731 sent, 44644 reached their opponent, 7215 virtual hits (16.2% of those reached).

## Melee bench: F44

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 318 over 6 battles (53.0 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.1 | 148 / 210 | 1.53 | 21.0% | 34530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 21.0% | 148 |
| stelo.Liblix 0.3.1 | 2.0 | 15.5% | 44 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 12 |
| jwirde.Gort 2.0 | 4.7 | 9.5% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 8.8% | 0 |
| wompi.Quokka 1.6 | 6.5 | 7.6% | 0 |
| disan.Chair 2.2.0 | 6.8 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.1% | 2 |
| sample.Crazy 1.0 | 9.5 | 4.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.3 | 24 / 35 | 5665 |
| 2 | 1 | 70.5 | 93.0 | 21 / 35 | 5448 |
| 3 | 1 | 72.1 | 95.2 | 26 / 35 | 5984 |
| 4 | 1 | 71.7 | 94.6 | 26 / 35 | 5702 |
| 5 | 1 | 72.2 | 94.9 | 28 / 35 | 6128 |
| 6 | 1 | 71.1 | 92.4 | 23 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 90 | 69% |
| tzu.TheArtOfWar 1.2 | 60 | 87% |
| jwirde.Gort 2.0 | 12 | 92% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| stf.PanzerGeneral 0.1 | 5 | 80% |
| wompi.Quokka 1.6 | 4 | 100% |
| sample.Crazy 1.0 | 4 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 64% | 113 |
| tzu.TheArtOfWar 1.2 | 12 | 19% | 50 |
| jwirde.Gort 2.0 | 3 | 5% | 20 |
| wompi.Quokka 1.6 | 2 | 3% | 6 |
| stf.PanzerGeneral 0.1 | 2 | 3% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 4 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 205 rounds): 157923 melee ticks, 51086 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (205 rounds): longest scan gap while four or more were alive 32 ticks (205 rounds over 8); rounds whose longest gap at any count was over 8: 205; robots dropped as dead without a death event: 2.

Targeting waves (205 rounds): 53468 sent, 48807 reached their opponent, 10193 virtual hits (20.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 585 over 6 battles (97.5 per battle, most in one battle 130). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.8 | 124 / 210 | 2.00 | 20.1% | 32912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.20aa | 1.0 | 20.1% | 124 |
| jje.BagPuss 1.2 | 2.7 | 12.1% | 6 |
| eem.IWillFireNoBullet v2.8 | 3.5 | 10.6% | 56 |
| myl.nano.Graviton 1.10 | 4.5 | 10.1% | 2 |
| sul.Lunar 1.1 | 4.8 | 10.5% | 10 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.6% | 4 |
| fm.claire 1.7 | 6.5 | 9.2% | 2 |
| hvilela.HVilela 0.9 | 6.8 | 8.8% | 2 |
| wit.Deep7 2.0 | 8.8 | 5.7% | 4 |
| abud.ThirdRobo 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 24 / 35 | 5791 |
| 2 | 1 | 68.5 | 85.1 | 15 / 35 | 5373 |
| 3 | 1 | 69.5 | 86.7 | 17 / 35 | 5685 |
| 4 | 1 | 71.6 | 91.7 | 26 / 35 | 4782 |
| 5 | 1 | 71.5 | 92.4 | 25 / 35 | 5937 |
| 6 | 1 | 68.7 | 85.1 | 17 / 35 | 5344 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 77 | 64% |
| jje.BagPuss 1.2 | 32 | 88% |
| myl.nano.Graviton 1.10 | 15 | 100% |
| sul.Lunar 1.1 | 12 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 64% |
| fm.claire 1.7 | 10 | 80% |
| hvilela.HVilela 0.9 | 7 | 71% |
| wit.Deep7 2.0 | 2 | 50% |

Hadur died in 94 of 210 rounds, at a mean tick of 1384. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 29 | 31% | 0 |
| jje.BagPuss 1.2 | 15 | 16% | 64 |
| myl.nano.Graviton 1.10 | 14 | 15% | 36 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 9% | 25 |
| hvilela.HVilela 0.9 | 8 | 9% | 17 |
| sul.Lunar 1.1 | 7 | 7% | 38 |
| wit.Deep7 2.0 | 4 | 4% | 8 |
| fm.claire 1.7 | 3 | 3% | 19 |
| abud.ThirdRobo 1.0 | 1 | 1% | 2 |
5 death(s) with no robot to name.

Posture (Hadur's M records, 206 rounds): 185945 melee ticks, 86355 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (206 rounds): longest scan gap while four or more were alive 51 ticks (206 rounds over 8); rounds whose longest gap at any count was over 8: 206; robots dropped as dead without a death event: 0.

Targeting waves (206 rounds): 58175 sent, 53404 reached their opponent, 8275 virtual hits (15.5% of those reached).

## Melee bench: F46

hadur117.Hadur 3.20aa against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 488 over 6 battles (81.3 per battle, most in one battle 121). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 6 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.4 | 62 / 210 | 2.40 | 16.7% | 25066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.1% | 88 |
| hadur117.Hadur 3.20aa | 2.0 | 16.7% | 62 |
| kc.mini.Mirage 0.2 | 2.2 | 16.4% | 48 |
| mz.MicroSheep 1.0 | 4.2 | 10.8% | 2 |
| sadoner.killer 0.2 | 5.5 | 8.8% | 0 |
| cx.Princess 1.0 | 5.5 | 8.8% | 7 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.6% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.8 | 81.9 | 11 / 35 | 4035 |
| 2 | 2 | 66.1 | 81.3 | 12 / 35 | 4386 |
| 3 | 1 | 67.3 | 87.6 | 9 / 35 | 4549 |
| 4 | 3 | 64.7 | 81.3 | 6 / 35 | 3916 |
| 5 | 2 | 66.6 | 87.6 | 10 / 35 | 3949 |
| 6 | 1 | 67.2 | 87.0 | 14 / 35 | 4231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 56 | 23% |
| kc.mini.Mirage 0.2 | 52 | 65% |
| mz.MicroSheep 1.0 | 7 | 100% |
| cx.Princess 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 3 | 67% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 67 | 44% | 80 |
| kc.mini.Mirage 0.2 | 62 | 41% | 99 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 8 |
| cx.Princess 1.0 | 5 | 3% | 5 |
| sadoner.killer 0.2 | 4 | 3% | 6 |
| mz.MicroSheep 1.0 | 3 | 2% | 10 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |
4 death(s) with no robot to name.

Posture (Hadur's M records, 208 rounds): 159224 melee ticks, 51166 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (208 rounds): longest scan gap while four or more were alive 40 ticks (208 rounds over 8); rounds whose longest gap at any count was over 8: 208; robots dropped as dead without a death event: 0.

Targeting waves (208 rounds): 46136 sent, 41002 reached their opponent, 6205 virtual hits (15.1% of those reached).

