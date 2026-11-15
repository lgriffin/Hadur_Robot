# Bench suite: melee-census-317.txt

## Melee bench: F01

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 128 over 4 battles (32.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.8 | 34 / 140 | 2.10 | 18.1% | 22565 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 89 |
| hadur117.Hadur 3.22bb | 2.0 | 18.1% | 34 |
| sgp.JollyNinja 3.53 | 3.5 | 11.6% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.3% | 1 |
| lorneswork.Predator 1.0 | 5.0 | 10.0% | 1 |
| mz.MicroGodMelee 1 | 5.8 | 9.6% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.2% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 87.3 | 10 / 35 | 5503 |
| 2 | 2 | 68.6 | 87.9 | 8 / 35 | 5603 |
| 3 | 2 | 68.7 | 87.9 | 8 / 35 | 5730 |
| 4 | 2 | 68.5 | 87.9 | 8 / 35 | 5729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 84 | 10% |
| sgp.JollyNinja 3.53 | 16 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 90% |
| lorneswork.Predator 1.0 | 7 | 100% |
| mz.MicroGodMelee 1 | 2 | 100% |

Hadur died in 106 of 140 rounds, at a mean tick of 1238. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 81 | 76% | 92 |
| sgp.JollyNinja 3.53 | 11 | 10% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 5% | 12 |
| lorneswork.Predator 1.0 | 4 | 4% | 10 |
| adt.Ar2 1.0 | 3 | 3% | 3 |
| mz.MicroGodMelee 1 | 2 | 2% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 135 rounds): 95681 melee ticks, 64438 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 49 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 49 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 29353 sent, 25999 reached their opponent, 4791 virtual hits (18.4% of those reached).

## Melee bench: F02

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 195 over 4 battles (48.8 per battle, most in one battle 53). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.5 | 66 / 140 | 2.31 | 19.1% | 22104 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 19.1% | 66 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 33 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 14.1% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.5% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.8% | 9 |
| Noran.BitchingElk 0.054 | 6.3 | 8.6% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.6% | 1 |
| sch.Simone 0.3d | 7.5 | 7.2% | 4 |
| stelo.PatternRobot 1.0 | 9.0 | 4.8% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.3 | 17 / 35 | 5631 |
| 2 | 1 | 69.8 | 88.3 | 16 / 35 | 5694 |
| 3 | 1 | 69.4 | 87.6 | 17 / 35 | 5385 |
| 4 | 1 | 67.9 | 79.7 | 16 / 35 | 5394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 35 | 46% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 31 | 87% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 73% |
| Noran.BitchingElk 0.054 | 10 | 40% |
| sch.Simone 0.3d | 6 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 67% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 74 of 140 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 31 | 42% | 43 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 13 | 18% | 43 |
| Noran.BitchingElk 0.054 | 8 | 11% | 11 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 9% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 7% | 9 |
| stelo.PatternRobot 1.0 | 4 | 5% | 5 |
| sch.Simone 0.3d | 2 | 3% | 5 |
| fullsail.SweetTea 1.1 | 2 | 3% | 4 |
| fnc.bandit.Bandit 5.2.0 | 2 | 3% | 3 |

Posture (Hadur's M records, 134 rounds): 110075 melee ticks, 32490 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 46 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 38237 sent, 35047 reached their opponent, 5645 virtual hits (16.1% of those reached).

## Melee bench: F03

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 141 over 4 battles (35.3 per battle, most in one battle 43). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.2 | 121 / 140 | 1.52 | 21.6% | 27108 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.6% | 121 |
| radnor.DoctorBob 1.42 | 2.3 | 13.2% | 6 |
| kawigi.nano.Lib 1.0 | 3.3 | 12.3% | 5 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 6 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.4% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.1% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.1 | 31 / 35 | 6639 |
| 2 | 1 | 72.8 | 98.1 | 32 / 35 | 6696 |
| 3 | 1 | 72.2 | 94.9 | 30 / 35 | 7016 |
| 4 | 1 | 71.4 | 91.7 | 28 / 35 | 6757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 55 | 95% |
| radnor.DoctorBob 1.42 | 41 | 100% |
| kawigi.nano.Lib 1.0 | 22 | 86% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |

Hadur died in 19 of 140 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 5 | 26% | 25 |
| bwbaugh.nano.Tirunculus 0.0.0a | 4 | 21% | 7 |
| vuen.Cake 2.51 | 3 | 16% | 55 |
| radnor.DoctorBob 1.42 | 3 | 16% | 32 |
| urdos.URDOS 1.3 | 2 | 11% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 5% | 7 |
| adt.Ar1 2.1 | 1 | 5% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 80746 melee ticks, 26821 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 70 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 70 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 24383 sent, 21183 reached their opponent, 5218 virtual hits (24.6% of those reached).

## Melee bench: F04

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 4 battles (27.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 22 / 140 | 2.17 | 18.3% | 24620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.2% | 110 |
| hadur117.Hadur 3.22bb | 2.0 | 18.3% | 22 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 3 |
| TNT.TNT 0.99.1 | 4.3 | 10.6% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.4% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.6% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.7 | 88.3 | 5 / 35 | 6382 |
| 2 | 2 | 69.4 | 87.6 | 6 / 35 | 6166 |
| 3 | 2 | 68.6 | 84.1 | 6 / 35 | 6048 |
| 4 | 2 | 69.3 | 87.9 | 5 / 35 | 6024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 91 | 8% |
| apc.LeeroyJenkins2 1.0 | 7 | 86% |
| TNT.TNT 0.99.1 | 6 | 83% |
| josago.Jorgito 0.16 | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 118 of 140 rounds, at a mean tick of 1319. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 98 | 83% | 106 |
| josago.Jorgito 0.16 | 8 | 7% | 10 |
| apc.LeeroyJenkins2 1.0 | 7 | 6% | 14 |
| TNT.TNT 0.99.1 | 5 | 4% | 9 |
| css.Delitioner 0.11 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 124032 melee ticks, 50822 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 65 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 37255 sent, 34013 reached their opponent, 4885 virtual hits (14.4% of those reached).

## Melee bench: F05

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 110 over 4 battles (27.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.9 | 21 / 140 | 2.72 | 16.0% | 17327 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.8 | 17.8% | 66 |
| justin.DemonicRage 3.4 | 2.0 | 16.3% | 37 |
| hadur117.Hadur 3.22bb | 2.3 | 16.0% | 21 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 11 |
| ms.Ares 0.19 | 5.0 | 10.1% | 1 |
| axeBots.HataMoto 3.09 | 6.0 | 8.8% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 78.7 | 3 / 35 | 4606 |
| 2 | 3 | 65.2 | 82.5 | 4 / 35 | 4075 |
| 3 | 3 | 64.4 | 78.4 | 5 / 35 | 3938 |
| 4 | 1 | 67.0 | 83.8 | 9 / 35 | 4708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 31 | 13% |
| justin.DemonicRage 3.4 | 25 | 24% |
| wompi.Numbat 2.1 | 14 | 64% |
| axeBots.HataMoto 3.09 | 4 | 25% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 100% |

Hadur died in 120 of 140 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 35% | 45 |
| justin.DemonicRage 3.4 | 40 | 33% | 45 |
| wompi.Numbat 2.1 | 20 | 17% | 28 |
| axeBots.HataMoto 3.09 | 8 | 7% | 10 |
| ms.Ares 0.19 | 8 | 7% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 135 rounds): 101249 melee ticks, 28728 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 67 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 67 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 30621 sent, 27251 reached their opponent, 4463 virtual hits (16.4% of those reached).

## Melee bench: F06

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 118 over 4 battles (29.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.4 | 88 / 140 | 1.86 | 20.3% | 23711 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.3% | 88 |
| jekl.StoneGhost 0.7 | 2.3 | 15.0% | 19 |
| origin.SleepSiphon 1.7b | 2.8 | 13.5% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 8 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.5% | 1 |
| spinnercat.Omen 1.0 | 8.3 | 5.7% | 0 |
| DBall.NUKE 0.1 | 8.5 | 5.6% | 0 |
| sample.Fire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 90.8 | 24 / 35 | 5991 |
| 2 | 1 | 70.7 | 90.5 | 21 / 35 | 5776 |
| 3 | 1 | 70.9 | 89.2 | 19 / 35 | 6105 |
| 4 | 1 | 71.1 | 91.1 | 24 / 35 | 5839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 85% |
| origin.SleepSiphon 1.7b | 34 | 74% |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 83% |
| gg.Wolverine 2.0 | 6 | 100% |
| mld.Wisdom 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |

Hadur died in 54 of 140 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 19 | 35% | 43 |
| jekl.StoneGhost 0.7 | 15 | 28% | 43 |
| pe.minimelee.SandboxMiniMelee 1.1 | 8 | 15% | 27 |
| mld.Wisdom 1.0 | 5 | 9% | 12 |
| gg.Wolverine 2.0 | 4 | 7% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 2% | 5 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 94136 melee ticks, 29453 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 26 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 28867 sent, 25669 reached their opponent, 5439 virtual hits (21.2% of those reached).

## Melee bench: F07

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 4 battles (22.5 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 75.4 | 95.9 | 105 / 140 | 1.33 | 26.1% | 31791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 26.1% | 105 |
| rtk.Tachikoma 1.0 | 2.0 | 18.6% | 19 |
| oog.melee.CapuletDroid 1.1 | 3.5 | 12.3% | 10 |
| franzor.Lizt 1.3.1 | 3.5 | 12.9% | 7 |
| lrem.micro.MoggFanatic 0.2 | 5.3 | 9.7% | 0 |
| exauge.GateKeeper 1.1.121g | 5.8 | 8.7% | 0 |
| skm.PateranBotlock2 1.0 | 7.0 | 6.6% | 0 |
| sample.Target 1.0 | 8.3 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 8.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 75.5 | 96.8 | 28 / 35 | 7778 |
| 2 | 1 | 75.6 | 96.8 | 28 / 35 | 8110 |
| 3 | 1 | 74.7 | 94.3 | 23 / 35 | 7589 |
| 4 | 1 | 75.9 | 95.7 | 26 / 35 | 8314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 77 | 78% |
| oog.melee.CapuletDroid 1.1 | 31 | 81% |
| franzor.Lizt 1.3.1 | 23 | 83% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 35 of 140 rounds, at a mean tick of 1514. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 23 | 66% | 93 |
| oog.melee.CapuletDroid 1.1 | 8 | 23% | 36 |
| franzor.Lizt 1.3.1 | 4 | 11% | 4 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 129839 melee ticks, 60950 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 63 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 63 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 35156 sent, 32314 reached their opponent, 6414 virtual hits (19.8% of those reached).

## Melee bench: F08

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 204 over 4 battles (51.0 per battle, most in one battle 56). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.3 | 104 / 140 | 1.46 | 23.5% | 22526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 23.5% | 104 |
| tm.Yuugao 1.0 | 2.3 | 15.2% | 20 |
| shrub.Vapour v159 | 3.0 | 13.4% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 4.0 | 10.9% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 5.0 | 9.8% | 5 |
| m3thos.Eva00 1.1 | 5.8 | 9.6% | 0 |
| qualidafial.MajorDick 1.0.1 | 7.0 | 6.7% | 0 |
| SHAM.WOW 1.4 | 8.5 | 5.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.7 | 23 / 35 | 5268 |
| 2 | 1 | 72.3 | 95.7 | 26 / 35 | 5751 |
| 3 | 1 | 72.3 | 96.1 | 28 / 35 | 5646 |
| 4 | 1 | 72.3 | 94.6 | 27 / 35 | 5861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 78% |
| shrub.Vapour v159 | 31 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 82% |
| m3thos.Eva00 1.1 | 7 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 38 of 140 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 15 | 39% | 56 |
| shrub.Vapour v159 | 12 | 32% | 39 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 11% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 8% | 14 |
| SHAM.WOW 1.4 | 1 | 3% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 3% | 2 |
| m3thos.Eva00 1.1 | 0 | 0% | 7 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 97287 melee ticks, 33251 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 42 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28668 sent, 25763 reached their opponent, 4512 virtual hits (17.5% of those reached).

## Melee bench: F09

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 4 battles (28.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 76.6 | 48 / 140 | 3.11 | 15.8% | 15559 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.4% | 66 |
| hadur117.Hadur 3.22bb | 2.3 | 15.8% | 48 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 13 |
| yagami.Tidus 0.11 | 4.3 | 10.9% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 6 |
| mc2.enemy.Original 0.9 | 5.8 | 9.1% | 5 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 1 |
| step.nanoPri 1.0 | 8.5 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 80.0 | 16 / 35 | 4117 |
| 2 | 3 | 61.4 | 68.3 | 6 / 35 | 3694 |
| 3 | 2 | 65.4 | 81.3 | 11 / 35 | 3867 |
| 4 | 2 | 64.7 | 76.8 | 15 / 35 | 3881 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 31 | 32% |
| kc.micro.Figment 1.0 | 28 | 89% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| yagami.Tidus 0.11 | 4 | 100% |
| mc2.enemy.Original 0.9 | 3 | 67% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 92 of 140 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 41 | 45% | 51 |
| mc2.enemy.Original 0.9 | 13 | 14% | 16 |
| pedersen.Grishnakh 1.0 | 13 | 14% | 15 |
| kc.micro.Figment 1.0 | 10 | 11% | 37 |
| yagami.Tidus 0.11 | 6 | 7% | 9 |
| robar.nano.Assertive_Melee 0.2 | 4 | 4% | 5 |
| dft.Calliope 5.6 | 3 | 3% | 5 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

Posture (Hadur's M records, 135 rounds): 94314 melee ticks, 26824 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 57 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 57 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 1.

Targeting waves (135 rounds): 30607 sent, 27363 reached their opponent, 3731 virtual hits (13.6% of those reached).

## Melee bench: F10

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 155 over 4 battles (38.8 per battle, most in one battle 46). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.9 | 112 / 140 | 1.37 | 21.4% | 24755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.4% | 112 |
| DTF.Kludgy 1.2b | 2.3 | 14.2% | 16 |
| ne.Chimera 1.2 | 3.0 | 12.6% | 5 |
| ejb.Polaris 1.0.1 | 3.8 | 12.1% | 6 |
| vStar.RAFzilla 2.15 | 5.3 | 10.0% | 1 |
| tvv.micro.Antares 1.1.1 | 5.8 | 10.0% | 0 |
| sam.Samspin 1.0 | 7.3 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.1% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.4 | 24 / 35 | 5805 |
| 2 | 1 | 71.5 | 94.3 | 25 / 35 | 6079 |
| 3 | 1 | 72.5 | 97.1 | 29 / 35 | 6451 |
| 4 | 1 | 73.4 | 99.7 | 34 / 35 | 6420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 51 | 78% |
| ne.Chimera 1.2 | 29 | 93% |
| ejb.Polaris 1.0.1 | 28 | 93% |
| vStar.RAFzilla 2.15 | 8 | 100% |
| tvv.micro.Antares 1.1.1 | 7 | 100% |
| kurios.DOSexe .9b | 4 | 100% |

Hadur died in 28 of 140 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 15 | 54% | 49 |
| ne.Chimera 1.2 | 6 | 21% | 25 |
| ejb.Polaris 1.0.1 | 5 | 18% | 36 |
| vStar.RAFzilla 2.15 | 1 | 4% | 12 |
| kurios.DOSexe .9b | 1 | 4% | 10 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |

Posture (Hadur's M records, 132 rounds): 93046 melee ticks, 36965 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 40 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 29681 sent, 26380 reached their opponent, 4666 virtual hits (17.7% of those reached).

## Melee bench: F11

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 153 over 4 battles (38.3 per battle, most in one battle 48). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.7 | 52 / 140 | 2.65 | 16.8% | 16494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 16.8% | 52 |
| rz.Aleph 0.34 | 2.0 | 16.3% | 47 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 11 |
| djc.DynaBot 0.1.1 | 4.0 | 10.6% | 7 |
| br2.MobyDickBot 1.6 | 6.0 | 8.7% | 8 |
| rdt199.Warlord 0.73 | 6.3 | 8.7% | 10 |
| uji.YellohFellah 1.0 | 6.5 | 8.5% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 6.0% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 81.9 | 12 / 35 | 4196 |
| 2 | 1 | 65.3 | 81.3 | 12 / 35 | 3980 |
| 3 | 1 | 65.8 | 82.9 | 13 / 35 | 4165 |
| 4 | 1 | 65.5 | 80.6 | 15 / 35 | 4153 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 39 | 38% |
| cx.mini.Nimrod 0.55 | 13 | 69% |
| uji.YellohFellah 1.0 | 11 | 82% |
| djc.DynaBot 0.1.1 | 10 | 60% |
| rdt199.Warlord 0.73 | 9 | 44% |
| br2.MobyDickBot 1.6 | 9 | 78% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 88 of 140 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 42 | 48% | 55 |
| cx.mini.Nimrod 0.55 | 11 | 13% | 21 |
| djc.DynaBot 0.1.1 | 11 | 13% | 19 |
| rdt199.Warlord 0.73 | 9 | 10% | 17 |
| br2.MobyDickBot 1.6 | 6 | 7% | 10 |
| KiraNL.Chupacabra 0.4 | 5 | 6% | 7 |
| uji.YellohFellah 1.0 | 4 | 5% | 10 |

Posture (Hadur's M records, 135 rounds): 102416 melee ticks, 24856 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 133 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 133 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 3.

Targeting waves (135 rounds): 32939 sent, 29565 reached their opponent, 3756 virtual hits (12.7% of those reached).

## Melee bench: F12

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 124 over 4 battles (31.0 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.8 | 79 / 140 | 2.28 | 18.0% | 16148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 18.0% | 79 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.3% | 24 |
| nat.PallasHawk 1.0 | 2.8 | 13.3% | 23 |
| darkcanuck.Leon 1.01 | 4.0 | 11.8% | 6 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.8% | 6 |
| jrm.Test0 1.0 | 6.3 | 8.3% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.3% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.1% | 1 |
| stuff.Vlad 0.1 | 9.0 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 76.5 | 15 / 35 | 3498 |
| 2 | 1 | 68.1 | 90.5 | 20 / 35 | 4028 |
| 3 | 1 | 66.9 | 84.8 | 19 / 35 | 3982 |
| 4 | 1 | 69.9 | 91.4 | 25 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 38 | 74% |
| nat.PallasHawk 1.0 | 32 | 66% |
| darkcanuck.Leon 1.01 | 23 | 91% |
| brainfade.melee.Genghis 0.36 | 6 | 83% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 62 of 140 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 21 | 34% | 41 |
| bts.wiki.RipCurl 0.9b | 15 | 24% | 35 |
| darkcanuck.Leon 1.01 | 10 | 16% | 33 |
| brainfade.melee.Genghis 0.36 | 6 | 10% | 11 |
| jrm.Test0 1.0 | 6 | 10% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 5% | 7 |
| jaybot.bots.Oddball 4.0 | 1 | 2% | 2 |
| jp.Perpy 16.0 | 0 | 0% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 134 rounds): 85935 melee ticks, 25245 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 42 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 28874 sent, 25572 reached their opponent, 4207 virtual hits (16.5% of those reached).

## Melee bench: F13

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 104 over 4 battles (26.0 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.6 | 48 / 140 | 2.56 | 16.6% | 17879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.3% | 53 |
| hadur117.Hadur 3.22bb | 1.8 | 16.6% | 48 |
| ags.Glacier 0.2.11 | 2.5 | 15.9% | 18 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 15 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.4% | 6 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.2% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.7% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 81.6 | 11 / 35 | 4479 |
| 2 | 3 | 65.0 | 81.0 | 10 / 35 | 4135 |
| 3 | 1 | 66.9 | 84.4 | 13 / 35 | 4502 |
| 4 | 1 | 66.9 | 83.5 | 14 / 35 | 4763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 35 | 23% |
| ags.Glacier 0.2.11 | 34 | 74% |
| shinh.Entangled 0.3 | 14 | 64% |
| gh.micro.Gruweltje 0.7 | 8 | 75% |

Hadur died in 92 of 140 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 37 | 40% | 50 |
| ags.Glacier 0.2.11 | 24 | 26% | 42 |
| shinh.Entangled 0.3 | 13 | 14% | 24 |
| stelo.Wang 1.0 | 9 | 10% | 10 |
| gh.micro.Gruweltje 0.7 | 5 | 5% | 10 |
| maribo.FollowFire 1 | 3 | 3% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

Posture (Hadur's M records, 134 rounds): 94040 melee ticks, 34058 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 42 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 26996 sent, 23508 reached their opponent, 3536 virtual hits (15.0% of those reached).

## Melee bench: F14

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 148 over 4 battles (37.0 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.5 | 96.3 | 122 / 140 | 1.29 | 24.7% | 26856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 24.7% | 122 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 17.4% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 3.8 | 10.5% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 4.0 | 10.6% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 4.8 | 10.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.8 | 9.5% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.8 | 8.8% | 2 |
| pa.Improved 1.0 | 8.0 | 6.7% | 0 |
| sample.TrackFire 1.0 | 9.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 74.4 | 98.9 | 33 / 35 | 6921 |
| 2 | 1 | 72.5 | 94.6 | 29 / 35 | 6319 |
| 3 | 1 | 72.8 | 93.2 | 29 / 35 | 6623 |
| 4 | 1 | 74.1 | 98.6 | 31 / 35 | 6993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 85 | 93% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 81% |
| sanyi.mikrobi.Roberto 1.0 | 16 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 89% |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 18 of 140 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 6 | 33% | 78 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 17% | 26 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 17% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 17% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 11% | 4 |
| pa.Improved 1.0 | 1 | 6% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 7 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 81557 melee ticks, 36796 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 42 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 23663 sent, 20956 reached their opponent, 5252 virtual hits (25.1% of those reached).

## Melee bench: F15

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 169 over 4 battles (42.3 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.7 | 86 / 140 | 2.01 | 19.9% | 22662 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 19.9% | 86 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 10 |
| mld.DustBunny 3.8 | 3.0 | 12.8% | 10 |
| emp.Yngwie 1.11 | 3.5 | 12.5% | 25 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 2 |
| kawigi.robot.Girl 1.2 | 6.0 | 8.9% | 5 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 7.2% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 22 / 35 | 5690 |
| 2 | 1 | 70.3 | 89.8 | 24 / 35 | 5539 |
| 3 | 1 | 70.1 | 87.6 | 20 / 35 | 5703 |
| 4 | 1 | 69.6 | 86.0 | 20 / 35 | 5730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 36 | 64% |
| kawigi.micro.Shiz 1.1 | 27 | 96% |
| mld.DustBunny 3.8 | 19 | 79% |
| kawigi.robot.Girl 1.2 | 12 | 75% |
| cb.nano.Insomnia 1.0 | 9 | 100% |
| Grystrion.TrackerWO 1.0 | 3 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 54 of 140 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 23 | 43% | 52 |
| mld.DustBunny 3.8 | 9 | 17% | 28 |
| cb.nano.Insomnia 1.0 | 8 | 15% | 10 |
| kawigi.robot.Girl 1.2 | 6 | 11% | 9 |
| kawigi.micro.Shiz 1.1 | 4 | 7% | 23 |
| lambdaxy.TBot 0.1 | 3 | 6% | 3 |
| divineomega.TrialBot 0.003 | 1 | 2% | 8 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 132 rounds): 104481 melee ticks, 30580 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 43 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 33564 sent, 30391 reached their opponent, 4779 virtual hits (15.7% of those reached).

## Melee bench: F16

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 4 battles (32.8 per battle, most in one battle 39). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 89.8 | 78 / 140 | 1.92 | 20.1% | 24169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.1% | 78 |
| gh.Griezel 0.5.2 | 2.0 | 16.5% | 38 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 16 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.9% | 2 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 8.7% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 6.8% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 5.1% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.1 | 17 / 35 | 6294 |
| 2 | 1 | 70.5 | 89.2 | 21 / 35 | 6006 |
| 3 | 1 | 69.4 | 87.6 | 18 / 35 | 5683 |
| 4 | 1 | 71.2 | 91.1 | 22 / 35 | 6186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 62 | 68% |
| techdude.forest.FlamingForest 1.1 | 22 | 45% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 100% |
| bvh.fnr.Fenrir 0.36l | 4 | 75% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 63 of 140 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 27 | 43% | 70 |
| techdude.forest.FlamingForest 1.1 | 15 | 24% | 27 |
| bvh.fnr.Fenrir 0.36l | 6 | 10% | 9 |
| tvv.nano.Polaris 1.2 | 5 | 8% | 6 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 4 | 6% | 18 |
| divineomega.DivineBot 1.9.4.5 | 3 | 5% | 5 |
| asd.Cthulhu 1.3 | 1 | 2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 1 | 2% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 113253 melee ticks, 49897 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 51 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 51 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 35900 sent, 32696 reached their opponent, 5297 virtual hits (16.2% of those reached).

## Melee bench: F17

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 144 over 4 battles (36.0 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 90.6 | 85 / 140 | 1.85 | 20.8% | 25814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.8% | 85 |
| et.Predator 1.8 | 2.5 | 13.3% | 10 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.9% | 20 |
| cx.BlestPain 1.41 | 3.5 | 12.4% | 22 |
| ahf.NanoAndrew .4 | 5.0 | 10.3% | 0 |
| nic.Nicator 2.4 | 6.3 | 8.5% | 4 |
| maribo.melee.BMV 0.1 | 6.8 | 8.4% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.7 | 24 / 35 | 6389 |
| 2 | 1 | 71.2 | 89.5 | 22 / 35 | 6376 |
| 3 | 1 | 70.9 | 88.6 | 18 / 35 | 6532 |
| 4 | 1 | 71.3 | 90.5 | 21 / 35 | 6517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 42 | 74% |
| et.Predator 1.8 | 32 | 88% |
| cx.BlestPain 1.41 | 22 | 41% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| tex.Longbot 0.4 | 2 | 100% |
| nic.Nicator 2.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 56 of 140 rounds, at a mean tick of 1135. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 17 | 30% | 31 |
| oog.melee.Mercutio 1.0 | 16 | 29% | 45 |
| et.Predator 1.8 | 15 | 27% | 33 |
| ahf.NanoAndrew .4 | 4 | 7% | 18 |
| maribo.melee.BMV 0.1 | 2 | 4% | 5 |
| nic.Nicator 2.4 | 1 | 2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
| tex.Longbot 0.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 107521 melee ticks, 39207 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 73 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 33439 sent, 30298 reached their opponent, 5965 virtual hits (19.7% of those reached).

## Melee bench: F18

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 202 over 4 battles (50.5 per battle, most in one battle 61). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.5 | 105 / 140 | 1.60 | 22.8% | 20529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 22.8% | 105 |
| agd.Mooserwirt2 2.7 | 2.3 | 14.4% | 14 |
| uji.DBH 1.1 | 2.8 | 13.2% | 8 |
| sigterm.Sigterm 1.0 | 4.0 | 10.8% | 6 |
| spinnercat.Robovirus 2.718 | 5.3 | 10.0% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 6.3 | 9.1% | 4 |
| ratosh.Nobo 0.21 | 7.0 | 8.0% | 0 |
| stelo.WangRobot 1.0 | 8.0 | 6.0% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 8.5 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.7 | 29 / 35 | 5071 |
| 2 | 1 | 70.1 | 88.9 | 25 / 35 | 5193 |
| 3 | 1 | 71.9 | 94.6 | 28 / 35 | 5464 |
| 4 | 1 | 69.8 | 90.7 | 23 / 35 | 4801 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| uji.DBH 1.1 | 37 | 92% |
| agd.Mooserwirt2 2.7 | 32 | 84% |
| sigterm.Sigterm 1.0 | 24 | 83% |
| spinnercat.Robovirus 2.718 | 8 | 88% |
| ratosh.Nobo 0.21 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| stelo.WangRobot 1.0 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 35 of 140 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 10 | 29% | 34 |
| uji.DBH 1.1 | 8 | 23% | 39 |
| sigterm.Sigterm 1.0 | 7 | 20% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 14% | 12 |
| spinnercat.Robovirus 2.718 | 3 | 9% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 6% | 7 |
| ratosh.Nobo 0.21 | 0 | 0% | 11 |
| stelo.WangRobot 1.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 131 rounds): 85177 melee ticks, 31774 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 410 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (131 rounds): longest scan gap while four or more were alive 161 ticks (131 rounds over 8); rounds whose longest gap at any count was over 8: 131; robots dropped as dead without a death event: 2.

Targeting waves (131 rounds): 26000 sent, 23229 reached their opponent, 4885 virtual hits (21.0% of those reached).

## Melee bench: F19

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 4 battles (37.5 per battle, most in one battle 42). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.8 | 97.8 | 127 / 140 | 1.20 | 22.7% | 26128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 22.7% | 127 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 7 |
| mld.Infinity 2.2 | 3.3 | 12.0% | 2 |
| krillr.mini.JointStrike 2.0.0 | 3.8 | 11.8% | 1 |
| erdnis.Rover 0.3 | 5.0 | 10.7% | 1 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.1% | 1 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 1 |
| pac.ABC 2.1 | 7.5 | 6.8% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.2% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 95.9 | 30 / 35 | 6397 |
| 2 | 1 | 73.5 | 97.1 | 31 / 35 | 6281 |
| 3 | 1 | 74.0 | 98.4 | 32 / 35 | 6595 |
| 4 | 1 | 74.6 | 99.7 | 34 / 35 | 6855 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 67 | 96% |
| krillr.mini.JointStrike 2.0.0 | 22 | 95% |
| mld.Infinity 2.2 | 15 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 4 | 75% |

Hadur died in 14 of 140 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 50% | 47 |
| krillr.mini.JointStrike 2.0.0 | 5 | 36% | 28 |
| patson.PatsonTestBot 1.0 | 1 | 7% | 13 |
| mbh.Mbh 0.1 | 1 | 7% | 9 |
| erdnis.Rover 0.3 | 0 | 0% | 17 |
| mld.Infinity 2.2 | 0 | 0% | 16 |
| pbg.R2D2 1.0 | 0 | 0% | 3 |
| pac.ABC 2.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 132 rounds): 82675 melee ticks, 27957 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 66 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 66 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 27167 sent, 23937 reached their opponent, 5256 virtual hits (22.0% of those reached).

## Melee bench: F20

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 132 over 4 battles (33.0 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.2 | 93 / 140 | 1.70 | 21.2% | 25399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.2% | 93 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 22 |
| catcat20.Rabbit 0.001 | 3.5 | 11.3% | 12 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.8% | 1 |
| fwb.Nine 1.0.1 | 4.5 | 10.6% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.5% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 6.7% | 0 |
| bayen.nut.Squirrel 1.615 | 7.8 | 6.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 87.0 | 22 / 35 | 6321 |
| 2 | 1 | 72.3 | 95.6 | 25 / 35 | 6380 |
| 3 | 1 | 72.5 | 94.6 | 25 / 35 | 6539 |
| 4 | 1 | 71.2 | 91.7 | 21 / 35 | 6159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 55 | 75% |
| catcat20.Rabbit 0.001 | 27 | 70% |
| fwb.Nine 1.0.1 | 22 | 86% |
| nz.jdc.nano.GridFu 1.0 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 48 of 140 rounds, at a mean tick of 1124. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 23 | 48% | 58 |
| catcat20.Rabbit 0.001 | 11 | 23% | 32 |
| fwb.Nine 1.0.1 | 9 | 19% | 17 |
| nz.jdc.nano.GridFu 1.0 | 2 | 4% | 13 |
| m3thos.mini.Eva01 0.5.5 | 1 | 2% | 10 |
| bayen.nut.Squirrel 1.615 | 1 | 2% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 1 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 111331 melee ticks, 32995 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 26 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 33739 sent, 30525 reached their opponent, 6504 virtual hits (21.3% of those reached).

## Melee bench: F21

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 107 over 4 battles (26.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.1 | 87 / 140 | 1.62 | 21.3% | 25519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.3% | 87 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 43 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 0 |
| eld.Hmm 1.0 | 5.3 | 8.5% | 4 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.9% | 1 |
| el.JumpShoot 0.2 | 7.0 | 5.9% | 1 |
| fire219.CatBot 1.0 | 8.0 | 5.5% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.4 | 18 / 35 | 6290 |
| 2 | 1 | 71.2 | 89.8 | 22 / 35 | 5958 |
| 3 | 1 | 72.2 | 95.9 | 23 / 35 | 6136 |
| 4 | 1 | 73.5 | 94.3 | 24 / 35 | 7135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 75 | 60% |
| cf.RiO.RiOx 4.2.1 | 21 | 100% |
| dummy.mini.Scimitar 1.01 | 19 | 84% |
| eld.Hmm 1.0 | 4 | 25% |
| el.JumpShoot 0.2 | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 53 of 140 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 34 | 64% | 76 |
| dummy.mini.Scimitar 1.01 | 7 | 13% | 22 |
| eld.Hmm 1.0 | 6 | 11% | 13 |
| cf.RiO.RiOx 4.2.1 | 4 | 8% | 20 |
| oa.weak.BotherBot 0.1 | 1 | 2% | 7 |
| el.JumpShoot 0.2 | 1 | 2% | 2 |

Posture (Hadur's M records, 133 rounds): 115695 melee ticks, 55149 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 73 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 73 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 32936 sent, 29754 reached their opponent, 4766 virtual hits (16.0% of those reached).

## Melee bench: F22

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 4 battles (24.8 per battle, most in one battle 28). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.9 | 70 / 140 | 1.96 | 20.4% | 18215 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.4% | 70 |
| pe.SandboxDT 2.71m | 2.0 | 16.8% | 33 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.5% | 16 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.6% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 11.3% | 4 |
| gg.Squaraus 0.6 | 6.8 | 6.5% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.3% | 0 |
| tad.Dalek98 0.98 | 7.3 | 5.8% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.9 | 14 / 35 | 4529 |
| 2 | 1 | 69.9 | 90.7 | 20 / 35 | 4707 |
| 3 | 1 | 67.6 | 85.0 | 16 / 35 | 4301 |
| 4 | 1 | 70.1 | 92.1 | 20 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 37 | 54% |
| jlm.javaDisturbance 0.59 | 28 | 71% |
| kvk.HebusLeTroll 0.35 | 25 | 76% |
| bigpete.Stewie 1.0 | 10 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 71 of 140 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 26 | 37% | 52 |
| jlm.javaDisturbance 0.59 | 21 | 30% | 37 |
| kvk.HebusLeTroll 0.35 | 19 | 27% | 36 |
| bigpete.Stewie 1.0 | 3 | 4% | 12 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 132 rounds): 101780 melee ticks, 30292 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 48 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 29722 sent, 26872 reached their opponent, 3387 virtual hits (12.6% of those reached).

## Melee bench: F23

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 103 over 4 battles (25.8 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.9 | 96.5 | 118 / 140 | 1.31 | 22.6% | 26811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 22.6% | 118 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 13 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 9 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 9.8% | 0 |
| stelo.RamTrackSurfer 1.2 | 4.8 | 9.3% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.1% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 8.0% | 0 |
| sample.Walls 1.0 | 7.8 | 6.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.3 | 2.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 97.8 | 31 / 35 | 6394 |
| 2 | 1 | 73.9 | 95.6 | 27 / 35 | 7163 |
| 3 | 1 | 74.1 | 95.9 | 30 / 35 | 6765 |
| 4 | 1 | 73.9 | 96.8 | 30 / 35 | 6489 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 73 | 89% |
| cre.Karolos 0.32 | 36 | 89% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 22 of 140 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 11 | 50% | 63 |
| cre.Karolos 0.32 | 8 | 36% | 43 |
| stelo.AreaTargetingBot 1.1 | 2 | 9% | 7 |
| stelo.RamTrackSurfer 1.2 | 1 | 5% | 13 |
| sample.Walls 1.0 | 0 | 0% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 4 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 80115 melee ticks, 35059 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 50 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 24563 sent, 21333 reached their opponent, 5903 virtual hits (27.7% of those reached).

## Melee bench: F24

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 105 over 4 battles (26.3 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.4 | 52 / 140 | 2.59 | 17.2% | 17891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 17.2% | 52 |
| rz.GlowBlowMelee 1.4 | 2.0 | 15.0% | 31 |
| florent.XSeries.X2 0.12 | 3.5 | 12.8% | 18 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.2% | 16 |
| davidalves.Phoenix 0.54 | 4.5 | 11.9% | 20 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 2 |
| lunchie.Lunchbox 0.93 | 7.3 | 5.7% | 0 |
| stelo.SoJNanoMelee 1.1 | 8.0 | 6.1% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.1% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 75.9 | 12 / 35 | 4361 |
| 2 | 1 | 66.2 | 81.9 | 11 / 35 | 4500 |
| 3 | 1 | 69.3 | 91.4 | 19 / 35 | 4842 |
| 4 | 1 | 65.5 | 80.3 | 10 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 32 | 59% |
| pedersen.Ugluk 1.1.1 | 16 | 56% |
| davidalves.Phoenix 0.54 | 14 | 50% |
| florent.XSeries.X2 0.12 | 13 | 69% |
| oog.melee.Corsair 1.0 | 7 | 86% |
| stelo.SoJNanoMelee 1.1 | 2 | 50% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 89 of 140 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 24 | 27% | 37 |
| florent.XSeries.X2 0.12 | 22 | 25% | 38 |
| davidalves.Phoenix 0.54 | 16 | 18% | 21 |
| pedersen.Ugluk 1.1.1 | 14 | 16% | 23 |
| stelo.SoJNanoMelee 1.1 | 6 | 7% | 6 |
| oog.melee.Corsair 1.0 | 4 | 4% | 11 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 91110 melee ticks, 23296 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 56 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 29416 sent, 25964 reached their opponent, 4322 virtual hits (16.6% of those reached).

## Melee bench: F25

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 100 over 4 battles (25.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 98 / 140 | 2.11 | 20.6% | 15497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.6% | 98 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 15.0% | 12 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 14.2% | 8 |
| jdw.Hurricane 1.4 | 4.0 | 12.5% | 11 |
| ds.Oo 2.2 | 5.0 | 9.9% | 7 |
| adt.Ar2 1.1 | 6.3 | 8.3% | 0 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.2% | 2 |
| awesomeness.Elite 1.0 | 7.5 | 7.2% | 2 |
| amk.ChumbaMini 0.2 | 9.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.1 | 21 / 35 | 3851 |
| 2 | 1 | 67.9 | 83.9 | 25 / 35 | 3665 |
| 3 | 1 | 70.2 | 92.5 | 27 / 35 | 4182 |
| 4 | 1 | 68.6 | 86.8 | 25 / 35 | 3799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 39 | 95% |
| voidious.micro.BlitzBat 1.05 | 31 | 97% |
| jdw.Hurricane 1.4 | 21 | 86% |
| ds.Oo 2.2 | 6 | 67% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| gjr.Cephalosporin 0.1 | 3 | 100% |

Hadur died in 42 of 140 rounds, at a mean tick of 575. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 9 | 21% | 36 |
| voidious.micro.BlitzBat 1.05 | 9 | 21% | 32 |
| jdw.Hurricane 1.4 | 9 | 21% | 25 |
| ds.Oo 2.2 | 7 | 17% | 17 |
| adt.Ar2 1.1 | 3 | 7% | 11 |
| amk.ChumbaMini 0.2 | 3 | 7% | 3 |
| awesomeness.Elite 1.0 | 2 | 5% | 6 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 9 |

Posture (Hadur's M records, 135 rounds): 77822 melee ticks, 20341 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 33 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 24855 sent, 21919 reached their opponent, 3527 virtual hits (16.1% of those reached).

## Melee bench: F26

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 4 battles (28.3 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.9 | 94.0 | 103 / 140 | 1.54 | 21.9% | 28179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.9% | 103 |
| ak.Fermat 2.0 | 2.0 | 14.1% | 18 |
| shu.nitro.LENIN .T34 | 3.3 | 12.4% | 8 |
| lrem.Spectre 0.4.4 | 3.8 | 12.1% | 9 |
| js.PinBall 1.6 | 5.3 | 10.1% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.4% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.5 | 7.2% | 0 |
| gh.mini.GrubbmOne 1.0 | 7.5 | 7.8% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 96.8 | 29 / 35 | 7234 |
| 2 | 1 | 73.6 | 95.9 | 27 / 35 | 7129 |
| 3 | 1 | 72.6 | 93.0 | 25 / 35 | 7117 |
| 4 | 1 | 71.7 | 90.5 | 22 / 35 | 6699 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 40 | 75% |
| shu.nitro.LENIN .T34 | 34 | 88% |
| lrem.Spectre 0.4.4 | 32 | 88% |
| js.PinBall 1.6 | 9 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 37 of 140 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 16 | 43% | 47 |
| lrem.Spectre 0.4.4 | 9 | 24% | 26 |
| shu.nitro.LENIN .T34 | 7 | 19% | 39 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 8% | 9 |
| js.PinBall 1.6 | 2 | 5% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 3 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 100824 melee ticks, 30959 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 46 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 46 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 31836 sent, 28565 reached their opponent, 6469 virtual hits (22.6% of those reached).

## Melee bench: F27

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 137 over 4 battles (34.3 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 96.4 | 119 / 140 | 1.32 | 21.7% | 22546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.7% | 119 |
| mk.Alpha 0.2.1 | 2.3 | 13.4% | 13 |
| EH.Eagle 1.0.6 | 2.8 | 11.0% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 5.0 | 9.2% | 0 |
| wee.Gem 1.8.4 | 6.0 | 8.8% | 3 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.0% | 1 |
| joe.ADinosaur 1.0 | 6.3 | 8.5% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 7.0 | 8.0% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.9% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 98.1 | 30 / 35 | 5509 |
| 2 | 1 | 72.6 | 97.8 | 32 / 35 | 5774 |
| 3 | 1 | 70.2 | 92.1 | 25 / 35 | 5176 |
| 4 | 1 | 72.9 | 97.8 | 32 / 35 | 6087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 70 | 89% |
| EH.Eagle 1.0.6 | 28 | 100% |
| throxbot.ThroxBot 0.1 | 10 | 90% |
| joe.ADinosaur 1.0 | 7 | 100% |
| wee.Gem 1.8.4 | 5 | 80% |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 75% |
| caimano.Furia_Ceca 0.22 | 4 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |

Hadur died in 21 of 140 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 11 | 52% | 61 |
| EH.Eagle 1.0.6 | 2 | 10% | 26 |
| throxbot.ThroxBot 0.1 | 2 | 10% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 2 | 10% | 12 |
| joe.ADinosaur 1.0 | 2 | 10% | 4 |
| wee.Gem 1.8.4 | 1 | 5% | 6 |
| caimano.Furia_Ceca 0.22 | 1 | 5% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 12 |

Posture (Hadur's M records, 132 rounds): 83033 melee ticks, 27267 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 39 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 27043 sent, 23714 reached their opponent, 5246 virtual hits (22.1% of those reached).

## Melee bench: F28

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 7 other Robocode JVMs running (hadur.bench.MeleeRunner x7), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 4 battles (27.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.0 | 93 / 140 | 1.81 | 19.3% | 17335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 19.3% | 93 |
| kid.test.NightFox .2 | 2.3 | 14.9% | 16 |
| uji.Antique 1.0 | 3.0 | 12.8% | 16 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 4 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.1% | 6 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.2% | 3 |
| amk.ChumbaWumba 0.3 | 7.3 | 7.3% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 1 |
| stelo.Lifestealer 1.0 | 9.0 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.7 | 20 / 35 | 4451 |
| 2 | 1 | 67.7 | 87.3 | 20 / 35 | 4134 |
| 3 | 1 | 69.7 | 93.7 | 25 / 35 | 4193 |
| 4 | 1 | 70.9 | 96.5 | 28 / 35 | 4557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 56 | 88% |
| uji.Antique 1.0 | 35 | 83% |
| qohnil.blot.BlotBot 3.61 | 8 | 75% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| ahr.ice.Ice 1.0.2 | 1 | 0% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 48 of 140 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 16 | 33% | 45 |
| kid.test.NightFox .2 | 10 | 21% | 33 |
| qohnil.blot.BlotBot 3.61 | 6 | 13% | 17 |
| pfvicm.Sobieski 7.2.3b | 6 | 13% | 13 |
| ahr.ice.Ice 1.0.2 | 4 | 8% | 10 |
| amk.ChumbaWumba 0.3 | 3 | 6% | 10 |
| matt.advanced.Katana 1.0 | 2 | 4% | 4 |
| stelo.Lifestealer 1.0 | 1 | 2% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 4 |

Posture (Hadur's M records, 132 rounds): 88191 melee ticks, 27737 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 82 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 82 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28375 sent, 25078 reached their opponent, 3389 virtual hits (13.5% of those reached).

## Melee bench: F29

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 99 over 4 battles (24.8 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.6 | 88 / 140 | 1.84 | 20.5% | 21470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.5% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.8% | 27 |
| deewiant.Anomaly 0.2 | 2.8 | 14.8% | 21 |
| myl.micro.Troodon 1.10 | 3.8 | 12.5% | 1 |
| jok.PheonixM 0.1.2 | 5.5 | 9.5% | 1 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.0 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.7% | 1 |
| ap.Frederick 1.1 | 9.0 | 4.4% | 1 |
| jangs.ns51 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 91.4 | 23 / 35 | 5708 |
| 2 | 1 | 69.9 | 87.3 | 20 / 35 | 5023 |
| 3 | 1 | 70.7 | 90.5 | 21 / 35 | 5174 |
| 4 | 1 | 72.4 | 93.3 | 24 / 35 | 5565 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 52 | 75% |
| zyx.mega.YersiniaPestis 3.1 | 29 | 66% |
| myl.micro.Troodon 1.10 | 23 | 100% |
| jok.PheonixM 0.1.2 | 5 | 80% |
| ap.Frederick 1.1 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 53 of 140 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 24 | 45% | 63 |
| zyx.mega.YersiniaPestis 3.1 | 19 | 36% | 45 |
| jok.PheonixM 0.1.2 | 5 | 9% | 9 |
| myl.micro.Troodon 1.10 | 3 | 6% | 17 |
| ph.melee.ArcherME 0.3 | 1 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 2% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 108384 melee ticks, 42646 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 26 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 26 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 34204 sent, 31092 reached their opponent, 4386 virtual hits (14.1% of those reached).

## Melee bench: F30

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 97 over 4 battles (24.3 per battle, most in one battle 27). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.3 | 57 / 140 | 2.26 | 19.7% | 18990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 19.7% | 57 |
| darkcanuck.B26354 1.06 | 2.3 | 15.7% | 40 |
| oog.melee.Capulet 1.2 | 3.0 | 14.7% | 25 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.4% | 7 |
| intruder.PrairieWolf 2.61 | 5.3 | 9.9% | 9 |
| tripphippy.Alice 1.1 | 6.3 | 8.6% | 1 |
| ntc.Opposite 1.5 | 7.0 | 8.5% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.1% | 0 |
| GarmBox.Anger 1.0 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.6 | 14 / 35 | 4769 |
| 2 | 1 | 67.9 | 84.3 | 13 / 35 | 4847 |
| 3 | 1 | 66.1 | 79.6 | 11 / 35 | 4780 |
| 4 | 1 | 68.7 | 89.6 | 19 / 35 | 4594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 44% |
| oog.melee.Capulet 1.2 | 32 | 56% |
| intruder.PrairieWolf 2.61 | 11 | 64% |
| stelo.PastFuture 2.3.2 | 9 | 78% |
| tripphippy.Alice 1.1 | 6 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |

Hadur died in 84 of 140 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 35 | 42% | 52 |
| oog.melee.Capulet 1.2 | 21 | 25% | 39 |
| stelo.PastFuture 2.3.2 | 12 | 14% | 19 |
| tripphippy.Alice 1.1 | 6 | 7% | 11 |
| intruder.PrairieWolf 2.61 | 5 | 6% | 12 |
| ntc.Opposite 1.5 | 3 | 4% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 2 | 2% | 3 |

Posture (Hadur's M records, 133 rounds): 106773 melee ticks, 32672 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 34 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 34 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 30067 sent, 27089 reached their opponent, 4492 virtual hits (16.6% of those reached).

## Melee bench: F31

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 4 battles (28.3 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.3 | 52 / 140 | 2.59 | 17.2% | 17649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.6% | 55 |
| hadur117.Hadur 3.22bb | 1.8 | 17.2% | 52 |
| gh.mini.Griezel 0.2 | 3.3 | 13.3% | 24 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.3% | 6 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.7% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.4% | 0 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.7% | 0 |
| fm.mammillarias 1.3 | 8.3 | 5.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 81.6 | 14 / 35 | 4206 |
| 2 | 2 | 66.6 | 82.2 | 10 / 35 | 4682 |
| 3 | 1 | 66.6 | 81.9 | 14 / 35 | 4406 |
| 4 | 2 | 66.9 | 83.5 | 14 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 35 | 51% |
| gh.mini.Griezel 0.2 | 25 | 64% |
| spinnercat.micro.Tyger 0.1 | 11 | 82% |
| d414.nano.Quantum 1.0.0 | 8 | 63% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 90 of 140 rounds, at a mean tick of 876. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 37 | 41% | 54 |
| gh.mini.Griezel 0.2 | 23 | 26% | 39 |
| d414.nano.Quantum 1.0.0 | 10 | 11% | 18 |
| spinnercat.micro.Tyger 0.1 | 6 | 7% | 12 |
| gh.nano.Grofvuil 0.2 | 6 | 7% | 8 |
| timmit.nano.TimDog 0.33 | 3 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
| fm.mammillarias 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

Posture (Hadur's M records, 135 rounds): 100258 melee ticks, 29000 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (135 rounds): longest scan gap while four or more were alive 33 ticks (135 rounds over 8); rounds whose longest gap at any count was over 8: 135; robots dropped as dead without a death event: 0.

Targeting waves (135 rounds): 32147 sent, 28839 reached their opponent, 4539 virtual hits (15.7% of those reached).

## Melee bench: F32

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 147 over 4 battles (36.8 per battle, most in one battle 41). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.2 | 84 / 140 | 1.89 | 18.9% | 19176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 18.9% | 84 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.4% | 32 |
| apc.botM 3.0 | 3.0 | 11.6% | 9 |
| vjik.UnViolation 1.1 | 4.3 | 9.7% | 7 |
| lxx.ConceptA 0.8 | 5.0 | 9.9% | 2 |
| bayen.UbaMicro 1.4 | 6.5 | 8.5% | 3 |
| panzer.Panzer 0.2 | 7.3 | 7.5% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 2 |
| conscience.Electron 1.3g | 8.0 | 7.0% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.8 | 22 / 35 | 4914 |
| 2 | 1 | 67.6 | 89.2 | 18 / 35 | 4390 |
| 3 | 1 | 69.8 | 93.3 | 25 / 35 | 4937 |
| 4 | 1 | 67.9 | 87.3 | 19 / 35 | 4935 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 61 | 62% |
| apc.botM 3.0 | 21 | 67% |
| vjik.UnViolation 1.1 | 9 | 56% |
| bayen.UbaMicro 1.4 | 9 | 78% |
| lxx.ConceptA 0.8 | 7 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 56 of 140 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 23 | 41% | 56 |
| apc.botM 3.0 | 11 | 20% | 25 |
| vjik.UnViolation 1.1 | 8 | 14% | 16 |
| bayen.UbaMicro 1.4 | 6 | 11% | 13 |
| lxx.ConceptA 0.8 | 3 | 5% | 13 |
| panzer.Panzer 0.2 | 2 | 4% | 4 |
| conscience.Electron 1.3g | 2 | 4% | 4 |
| yk.JahMicro 1.0 | 1 | 2% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 81002 melee ticks, 35070 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 48 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 26872 sent, 23589 reached their opponent, 4095 virtual hits (17.4% of those reached).

## Melee bench: F33

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 113 over 4 battles (28.3 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 94.1 | 101 / 140 | 1.47 | 23.6% | 21719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 23.6% | 101 |
| maribo.Quester 0.3 | 2.0 | 17.1% | 19 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.7% | 10 |
| labg.Cataclysm 2.05 | 4.5 | 11.4% | 6 |
| baal.nano.N 1.42 | 4.5 | 10.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 9.5% | 3 |
| zyx.micro.Ant 1.1 | 7.3 | 5.4% | 0 |
| sanja.First 0.1 | 7.8 | 5.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 96.4 | 29 / 35 | 6022 |
| 2 | 1 | 72.7 | 93.6 | 26 / 35 | 5717 |
| 3 | 1 | 70.4 | 91.1 | 20 / 35 | 4569 |
| 4 | 1 | 72.7 | 95.4 | 26 / 35 | 5411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 63 | 89% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 81% |
| labg.Cataclysm 2.05 | 10 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 78% |
| baal.nano.N 1.42 | 7 | 86% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 39 of 140 rounds, at a mean tick of 1106. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 19 | 49% | 67 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 15% | 30 |
| labg.Cataclysm 2.05 | 6 | 15% | 17 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 13% | 12 |
| baal.nano.N 1.42 | 3 | 8% | 10 |
| zyx.micro.Ant 1.1 | 0 | 0% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 136 rounds): 108632 melee ticks, 43017 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (136 rounds): longest scan gap while four or more were alive 33 ticks (136 rounds over 8); rounds whose longest gap at any count was over 8: 136; robots dropped as dead without a death event: 0.

Targeting waves (136 rounds): 31420 sent, 28483 reached their opponent, 3996 virtual hits (14.0% of those reached).

## Melee bench: F34

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 90 over 4 battles (22.5 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.5 | 71 / 140 | 1.94 | 19.5% | 22731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 19.5% | 71 |
| kid.Gladiator .7.2 | 2.0 | 16.4% | 27 |
| stelo.Spread 0.9 | 3.0 | 15.5% | 32 |
| jcs.Seth 1.8 | 4.3 | 11.7% | 6 |
| tcf.Reach 3 | 4.8 | 10.6% | 3 |
| cli.Dancer 1.1 | 6.0 | 9.0% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 2.9% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.1 | 19 / 35 | 5637 |
| 2 | 1 | 70.6 | 89.2 | 17 / 35 | 5535 |
| 3 | 1 | 70.9 | 88.9 | 20 / 35 | 5896 |
| 4 | 1 | 69.9 | 88.9 | 15 / 35 | 5663 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 43 | 70% |
| stelo.Spread 0.9 | 37 | 68% |
| jcs.Seth 1.8 | 15 | 67% |
| tcf.Reach 3 | 6 | 83% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 69 of 140 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 32 | 46% | 52 |
| stelo.Spread 0.9 | 24 | 35% | 54 |
| jcs.Seth 1.8 | 8 | 12% | 22 |
| tcf.Reach 3 | 4 | 6% | 6 |
| cli.Dancer 1.1 | 1 | 1% | 3 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

Posture (Hadur's M records, 133 rounds): 109715 melee ticks, 39954 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 43 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 43 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 33552 sent, 30199 reached their opponent, 4700 virtual hits (15.6% of those reached).

## Melee bench: F35

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 94 over 4 battles (23.5 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.1 | 24 / 140 | 2.61 | 16.1% | 16176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 98 |
| hadur117.Hadur 3.22bb | 2.0 | 16.1% | 24 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.1% | 11 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.9% | 5 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 2 |
| wit.Chuliath 1.0 | 6.3 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.8 | 6.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 8.0 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 79.7 | 4 / 35 | 4299 |
| 2 | 2 | 66.7 | 86.3 | 8 / 35 | 4292 |
| 3 | 2 | 65.3 | 81.3 | 8 / 35 | 3938 |
| 4 | 2 | 64.1 | 81.0 | 4 / 35 | 3647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 65 | 18% |
| gh.mini.Gruwel 0.9 | 15 | 40% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 50% |
| rz.HawkOnFire 0.1 | 4 | 75% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 116 of 140 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 75 | 65% | 89 |
| gh.mini.Gruwel 0.9 | 18 | 16% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 9% | 11 |
| rz.HawkOnFire 0.1 | 7 | 6% | 8 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 3% | 5 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

Posture (Hadur's M records, 134 rounds): 94575 melee ticks, 34216 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 42 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 28863 sent, 25516 reached their opponent, 3791 virtual hits (14.9% of those reached).

## Melee bench: F36

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 150 over 4 battles (37.5 per battle, most in one battle 50). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 94.0 | 106 / 140 | 1.54 | 21.7% | 24280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.7% | 106 |
| alpha.RainingFire 1.0 | 2.3 | 12.4% | 12 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 4 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 7 |
| m3thos.Eva02 0.7.1 | 5.3 | 10.2% | 6 |
| mz.Cork 0.1 | 5.8 | 10.1% | 4 |
| bvh.mini.Fenrir 0.39 | 6.8 | 9.2% | 1 |
| dl.BetterWalls 1.0 | 8.5 | 4.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 25 / 35 | 5913 |
| 2 | 1 | 72.4 | 94.9 | 27 / 35 | 6045 |
| 3 | 1 | 71.7 | 93.7 | 26 / 35 | 5682 |
| 4 | 1 | 72.7 | 93.0 | 28 / 35 | 6640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 33 | 76% |
| bzdp.Pansy 2.1 | 32 | 97% |
| bvh.micro.Freya 0.3 | 22 | 86% |
| mz.Cork 0.1 | 17 | 88% |
| m3thos.Eva02 0.7.1 | 10 | 80% |
| bvh.mini.Fenrir 0.39 | 5 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 34 of 140 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 35% | 31 |
| m3thos.Eva02 0.7.1 | 7 | 21% | 23 |
| bvh.micro.Freya 0.3 | 6 | 18% | 18 |
| bzdp.Pansy 2.1 | 5 | 15% | 33 |
| mz.Cork 0.1 | 3 | 9% | 22 |
| bvh.mini.Fenrir 0.39 | 1 | 3% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 92037 melee ticks, 34806 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 47 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 47 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 31148 sent, 27944 reached their opponent, 5386 virtual hits (19.3% of those reached).

## Melee bench: F37

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 159 over 4 battles (39.8 per battle, most in one battle 44). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.3 | 113 / 140 | 1.79 | 20.1% | 23554 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.1% | 113 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.3 | 10.8% | 4 |
| EBBU.Sim2 1.02 | 3.8 | 9.8% | 2 |
| germ.TheMind .2 | 4.5 | 9.8% | 1 |
| mb.Beast 0.1 | 5.8 | 8.9% | 8 |
| agrach.Dalek 1.0 | 6.0 | 9.1% | 6 |
| lmk.ACPFinal 0.1 | 6.0 | 8.8% | 1 |
| stelo.UntouchableNano 1.3 | 7.8 | 8.1% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.4% | 1 |
| skm.Ryubot 1.0 | 9.0 | 7.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.0 | 30 / 35 | 5655 |
| 2 | 1 | 68.8 | 87.6 | 27 / 35 | 6126 |
| 3 | 1 | 69.1 | 90.2 | 26 / 35 | 5812 |
| 4 | 1 | 70.2 | 94.3 | 30 / 35 | 5961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 21 | 95% |
| EBBU.Sim2 1.02 | 19 | 100% |
| germ.TheMind .2 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 80% |
| agrach.Dalek 1.0 | 15 | 93% |
| lmk.ACPFinal 0.1 | 14 | 100% |
| mb.Beast 0.1 | 11 | 100% |
| skm.Ryubot 1.0 | 7 | 100% |

Hadur died in 27 of 140 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 33% | 24 |
| mb.Beast 0.1 | 4 | 15% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 15% | 9 |
| stelo.UntouchableNano 1.3 | 3 | 11% | 19 |
| germ.TheMind .2 | 3 | 11% | 16 |
| lmk.ACPFinal 0.1 | 2 | 7% | 17 |
| EBBU.Sim2 1.02 | 1 | 4% | 18 |
| agrach.Dalek 1.0 | 1 | 4% | 17 |
| skm.Ryubot 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 134 rounds): 62724 melee ticks, 18253 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 58 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 58 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 20711 sent, 17619 reached their opponent, 4870 virtual hits (27.6% of those reached).

## Melee bench: F38

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 4 battles (32.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.6 | 89 / 140 | 1.85 | 19.7% | 20925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 19.7% | 89 |
| justin.Mallais 14.0 | 2.0 | 14.9% | 26 |
| bvh.mini.Freya 0.55 | 3.0 | 13.1% | 9 |
| cs.Wren 1.0 | 4.5 | 11.4% | 4 |
| bts.mega.Gnarly 1.4 | 4.8 | 10.6% | 8 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.4% | 3 |
| davidalves.net.DuelistNanoMelee 1.01 | 7.3 | 7.2% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 1 |
| bzdp.BoxCar 2.0 | 8.8 | 4.3% | 0 |
| matt.UnderDark3 2.4.34 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.7 | 22 / 35 | 5245 |
| 2 | 1 | 69.3 | 88.3 | 21 / 35 | 5064 |
| 3 | 1 | 70.5 | 93.0 | 24 / 35 | 5170 |
| 4 | 1 | 70.3 | 89.2 | 22 / 35 | 5446 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 51 | 75% |
| bvh.mini.Freya 0.55 | 25 | 68% |
| cs.Wren 1.0 | 16 | 100% |
| bts.mega.Gnarly 1.4 | 13 | 62% |
| kdf.KoulDestroyer 1.0 | 7 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 53 of 140 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 21 | 40% | 63 |
| bvh.mini.Freya 0.55 | 11 | 21% | 17 |
| bts.mega.Gnarly 1.4 | 10 | 19% | 24 |
| cs.Wren 1.0 | 5 | 9% | 20 |
| kdf.KoulDestroyer 1.0 | 5 | 9% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 2% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 2 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 85715 melee ticks, 30643 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 40 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 28284 sent, 24823 reached their opponent, 5058 virtual hits (20.4% of those reached).

## Melee bench: F39

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 121 over 4 battles (30.3 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.2 | 89 / 140 | 1.62 | 22.6% | 23561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 22.6% | 89 |
| bvh.fry.Freya 0.82 | 2.3 | 16.3% | 13 |
| az.Ololobot 0.2.4 | 2.8 | 14.2% | 35 |
| winamp32.micro.MicroMacro 1.0 | 4.5 | 9.5% | 2 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 8.5% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.3% | 1 |
| gimp.GimpBot 0.1 | 6.0 | 8.5% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.3 | 6.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 8.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.4 | 17 / 35 | 6103 |
| 2 | 1 | 70.7 | 92.1 | 25 / 35 | 5748 |
| 3 | 1 | 71.1 | 93.9 | 24 / 35 | 5751 |
| 4 | 1 | 70.7 | 91.4 | 23 / 35 | 5959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 60% |
| bvh.fry.Freya 0.82 | 48 | 83% |
| winamp32.micro.MicroMacro 1.0 | 6 | 67% |
| apollokidd.ApolloKidd 0.9 | 6 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 5 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 52 of 140 rounds, at a mean tick of 1156. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 24 | 46% | 62 |
| bvh.fry.Freya 0.82 | 21 | 40% | 51 |
| winamp32.micro.MicroMacro 1.0 | 3 | 6% | 9 |
| stelo.SoRobotNanoMelee 1.2 | 2 | 4% | 4 |
| gimp.GimpBot 0.1 | 1 | 2% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 2% | 2 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 134 rounds): 103309 melee ticks, 47308 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 64 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 0.

Targeting waves (134 rounds): 29569 sent, 26721 reached their opponent, 4798 virtual hits (18.0% of those reached).

## Melee bench: F40

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 120 over 4 battles (30.0 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.2 | 93 / 140 | 1.79 | 20.5% | 21980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.5% | 93 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.0% | 20 |
| kano.gamma.KanoGamma 1.8 | 2.8 | 12.6% | 11 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 3 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 6 |
| alpha.BlackIce 1.0 | 6.3 | 9.5% | 0 |
| stelo.Randomness 1.0 | 6.5 | 9.0% | 7 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 3.9% | 0 |
| sample.Corners 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 23 / 35 | 5237 |
| 2 | 1 | 71.9 | 93.3 | 25 / 35 | 5818 |
| 3 | 1 | 70.9 | 91.1 | 23 / 35 | 5379 |
| 4 | 1 | 70.8 | 90.8 | 22 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 75% |
| kano.gamma.KanoGamma 1.8 | 28 | 82% |
| Polkwane.SmashMelee 1.0 | 16 | 88% |
| mz.AntiGrav 1.0 | 14 | 93% |
| stelo.Randomness 1.0 | 10 | 60% |
| alpha.BlackIce 1.0 | 6 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 47 of 140 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 18 | 38% | 43 |
| kano.gamma.KanoGamma 1.8 | 8 | 17% | 32 |
| stelo.Randomness 1.0 | 7 | 15% | 16 |
| Polkwane.SmashMelee 1.0 | 5 | 11% | 15 |
| alpha.BlackIce 1.0 | 4 | 9% | 15 |
| mz.AntiGrav 1.0 | 4 | 9% | 12 |
| amk.superstrike.SuperStrike 0.3 | 1 | 2% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 3 |
| sample.Corners 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 95175 melee ticks, 26503 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 65 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 0.

Targeting waves (132 rounds): 30840 sent, 27551 reached their opponent, 5324 virtual hits (19.3% of those reached).

## Melee bench: F41

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 108 over 4 battles (27.0 per battle, most in one battle 31). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.3 | 69 / 140 | 2.05 | 18.6% | 18782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 18.6% | 69 |
| eem.EvBotNG v12.8 | 2.0 | 16.2% | 52 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.0% | 9 |
| ary.Swarm 1.1 | 3.8 | 12.9% | 6 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.7% | 1 |
| shrub.Silver v048 | 6.0 | 9.1% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.0% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 18 / 35 | 4796 |
| 2 | 1 | 70.2 | 91.7 | 20 / 35 | 4979 |
| 3 | 1 | 68.0 | 86.7 | 14 / 35 | 4401 |
| 4 | 1 | 68.6 | 86.3 | 17 / 35 | 4606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 54 | 43% |
| lessonz.robocode.Oz 0.5.0 | 28 | 93% |
| ary.Swarm 1.1 | 14 | 86% |
| simonton.nano.MeleeSeed 1.8 | 5 | 100% |
| shrub.Silver v048 | 3 | 67% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 71 of 140 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 43 | 61% | 70 |
| lessonz.robocode.Oz 0.5.0 | 12 | 17% | 28 |
| ary.Swarm 1.1 | 9 | 13% | 23 |
| simonton.nano.MeleeSeed 1.8 | 5 | 7% | 11 |
| shrub.Silver v048 | 2 | 3% | 4 |
| jsal.Jsalbot 1.0 | 0 | 0% | 2 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 132 rounds): 102055 melee ticks, 30277 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 128 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (132 rounds): longest scan gap while four or more were alive 128 ticks (132 rounds over 8); rounds whose longest gap at any count was over 8: 132; robots dropped as dead without a death event: 1.

Targeting waves (132 rounds): 32165 sent, 28864 reached their opponent, 4162 virtual hits (14.4% of those reached).

## Melee bench: F42

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 119 over 4 battles (29.8 per battle, most in one battle 32). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.6 | 106 / 140 | 1.49 | 21.6% | 25831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.6% | 106 |
| wompi.Wallaby 5.1 | 2.0 | 15.0% | 18 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 5 |
| ara.Shera 0.88 | 3.8 | 12.6% | 11 |
| amz.NanoClone 1.41 | 5.3 | 8.2% | 0 |
| maribo.IotaCT 1.1 | 6.3 | 7.0% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.6% | 1 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.6 | 96.8 | 29 / 35 | 6892 |
| 2 | 1 | 71.6 | 94.9 | 25 / 35 | 5981 |
| 3 | 1 | 71.2 | 91.4 | 22 / 35 | 6384 |
| 4 | 1 | 72.7 | 95.2 | 30 / 35 | 6574 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 62 | 90% |
| maribo.mini.MiniQuester 0.1 | 32 | 94% |
| ara.Shera 0.88 | 19 | 63% |
| amz.NanoClone 1.41 | 4 | 100% |
| dsw.StaticD 1.0 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 36 of 140 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 16 | 44% | 67 |
| ara.Shera 0.88 | 15 | 42% | 32 |
| maribo.mini.MiniQuester 0.1 | 4 | 11% | 30 |
| dsw.StaticD 1.0 | 0 | 0% | 4 |
| amz.NanoClone 1.41 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 106744 melee ticks, 36744 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 23 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 23 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 32841 sent, 29664 reached their opponent, 5468 virtual hits (18.4% of those reached).

## Melee bench: F43

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 109 over 4 battles (27.3 per battle, most in one battle 33). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.8 | 29 / 140 | 2.82 | 16.4% | 18114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 89 |
| hadur117.Hadur 3.22bb | 2.0 | 16.4% | 29 |
| brainfade.melee.Dusk 0.44 | 3.8 | 12.2% | 14 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.5% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.4% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.0% | 0 |
| mz.NanoGod 2.02 | 7.8 | 6.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 81.9 | 9 / 35 | 4647 |
| 2 | 2 | 66.8 | 79.0 | 9 / 35 | 4341 |
| 3 | 2 | 66.9 | 80.6 | 7 / 35 | 4545 |
| 4 | 2 | 66.3 | 77.5 | 4 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 47 | 36% |
| brainfade.melee.Dusk 0.44 | 9 | 22% |
| dummy.micro.Sparrow 2.5 | 8 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 111 of 140 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 50% | 72 |
| dummy.micro.Sparrow 2.5 | 21 | 19% | 24 |
| brainfade.melee.Dusk 0.44 | 14 | 13% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 14 | 13% | 17 |
| Krabb.akim2.Akim2 1.1b | 3 | 3% | 3 |
| mz.NanoGod 2.02 | 2 | 2% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
| jab.DiamondStealer 5 | 0 | 0% | 1 |

Posture (Hadur's M records, 134 rounds): 99562 melee ticks, 28462 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 19 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (134 rounds): longest scan gap while four or more were alive 19 ticks (134 rounds over 8); rounds whose longest gap at any count was over 8: 134; robots dropped as dead without a death event: 1.

Targeting waves (134 rounds): 31393 sent, 27994 reached their opponent, 4630 virtual hits (16.5% of those reached).

## Melee bench: F44

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 8 other Robocode JVMs running (hadur.bench.MeleeRunner x8), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 4 battles (28.5 per battle, most in one battle 34). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 93.7 | 102 / 140 | 1.57 | 21.5% | 25020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 21.5% | 102 |
| stelo.Liblix 0.3.1 | 2.0 | 15.8% | 30 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.2% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.0 | 9.2% | 0 |
| jwirde.Gort 2.0 | 5.3 | 8.6% | 2 |
| disan.Chair 2.2.0 | 6.3 | 7.7% | 1 |
| stf.PanzerGeneral 0.1 | 6.8 | 7.3% | 0 |
| wompi.Quokka 1.6 | 7.8 | 6.3% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.6 | 25 / 35 | 6079 |
| 2 | 1 | 72.6 | 94.9 | 29 / 35 | 6258 |
| 3 | 1 | 72.9 | 94.6 | 27 / 35 | 6374 |
| 4 | 1 | 71.1 | 89.5 | 21 / 35 | 6309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 74% |
| tzu.TheArtOfWar 1.2 | 39 | 95% |
| jwirde.Gort 2.0 | 6 | 67% |
| disan.Chair 2.2.0 | 5 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 39 of 140 rounds, at a mean tick of 963. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 25 | 64% | 84 |
| tzu.TheArtOfWar 1.2 | 6 | 15% | 31 |
| jwirde.Gort 2.0 | 5 | 13% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 3% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 3% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| wompi.Quokka 1.6 | 0 | 0% | 2 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 99972 melee ticks, 31857 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 65 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 33555 sent, 30360 reached their opponent, 5751 virtual hits (18.9% of those reached).

## Melee bench: F45

hadur117.Hadur 3.22bb against 9 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 131 over 4 battles (32.8 per battle, most in one battle 37). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 90.6 | 81 / 140 | 1.84 | 20.7% | 23653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.7% | 81 |
| jje.BagPuss 1.2 | 2.5 | 12.5% | 2 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 11.6% | 41 |
| sul.Lunar 1.1 | 4.0 | 10.9% | 11 |
| myl.nano.Graviton 1.10 | 4.8 | 10.3% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.3% | 0 |
| fm.claire 1.7 | 6.8 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.0% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.3% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.9 | 18 / 35 | 5686 |
| 2 | 1 | 72.0 | 93.0 | 22 / 35 | 6486 |
| 3 | 1 | 71.4 | 92.4 | 23 / 35 | 5924 |
| 4 | 1 | 69.7 | 88.3 | 18 / 35 | 5557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 52 | 52% |
| sul.Lunar 1.1 | 20 | 90% |
| jje.BagPuss 1.2 | 18 | 89% |
| myl.nano.Graviton 1.10 | 11 | 91% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| wit.Deep7 2.0 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 59 of 140 rounds, at a mean tick of 1667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 33 | 56% | 0 |
| jje.BagPuss 1.2 | 7 | 12% | 45 |
| myl.nano.Graviton 1.10 | 6 | 10% | 23 |
| sul.Lunar 1.1 | 4 | 7% | 31 |
| hvilela.HVilela 0.9 | 4 | 7% | 10 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 3% | 13 |
| wit.Deep7 2.0 | 2 | 3% | 10 |
| fm.claire 1.7 | 1 | 2% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 133 rounds): 130518 melee ticks, 62826 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 42 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 42 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 39267 sent, 36026 reached their opponent, 5113 virtual hits (14.2% of those reached).

## Melee bench: F46

hadur117.Hadur 3.22bb against 8 opponents at once, 35 rounds per battle, 4 battles, 1000x1000.

robocode.cpu.constant=1544834 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 4. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 82 over 4 battles (20.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 4 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.0 | 77 / 140 | 1.80 | 20.9% | 19222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.22bb | 1.0 | 20.9% | 77 |
| kc.mini.Mirage 0.2 | 2.0 | 19.2% | 48 |
| mz.MicroSheep 1.0 | 3.3 | 12.1% | 2 |
| cx.Princess 1.0 | 3.8 | 12.3% | 12 |
| sadoner.killer 0.2 | 5.0 | 10.5% | 1 |
| arthord.NanoSatanMelee Beta | 6.0 | 8.5% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.0 | 7.4% | 0 |
| kurios.DOSexe .9a | 8.0 | 5.8% | 0 |
| mbro.Detektor3 0.1.1 | 9.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.4 | 21 / 35 | 4824 |
| 2 | 1 | 69.4 | 90.7 | 21 / 35 | 4661 |
| 3 | 1 | 70.3 | 92.1 | 20 / 35 | 5151 |
| 4 | 1 | 67.9 | 86.8 | 15 / 35 | 4586 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 86 | 70% |
| cx.Princess 1.0 | 14 | 43% |
| mz.MicroSheep 1.0 | 7 | 100% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 64 of 140 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 34 | 53% | 89 |
| cx.Princess 1.0 | 13 | 20% | 18 |
| sadoner.killer 0.2 | 7 | 11% | 9 |
| mz.MicroSheep 1.0 | 4 | 6% | 15 |
| arthord.NanoSatanMelee Beta | 3 | 5% | 5 |
| jeremyreeder.collective.Prophet 5 | 2 | 3% | 3 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
1 death(s) with no robot to name.

Posture (Hadur's M records, 133 rounds): 90280 melee ticks, 34633 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (133 rounds): longest scan gap while four or more were alive 25 ticks (133 rounds over 8); rounds whose longest gap at any count was over 8: 133; robots dropped as dead without a death event: 0.

Targeting waves (133 rounds): 25315 sent, 22360 reached their opponent, 3431 virtual hits (15.3% of those reached).

