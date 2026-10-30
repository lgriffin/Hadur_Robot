# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3769366. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 69 over 2 battles (34.5 per battle, most in one battle 35). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.8 | 17 / 70 | 2.19 | 17.6% | 10684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 18.7% | 46 |
| hadur117.Hadur 3.19bb | 2.0 | 17.6% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.5 | 11.4% | 3 |
| sgp.JollyNinja 3.53 | 4.5 | 10.9% | 2 |
| lorneswork.Predator 1.0 | 4.5 | 10.7% | 0 |
| mz.MicroGodMelee 1 | 5.5 | 9.6% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.3% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 87.9 | 9 / 35 | 5409 |
| 2 | 2 | 67.1 | 85.7 | 8 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 38 | 8% |
| sgp.JollyNinja 3.53 | 6 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| lorneswork.Predator 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| mz.MicroGodMelee 1 | 2 | 50% |
| skm.butterfly 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 53 of 70 rounds, at a mean tick of 1166. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 38 | 72% | 43 |
| lorneswork.Predator 1.0 | 5 | 9% | 8 |
| sgp.JollyNinja 3.53 | 3 | 6% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 6% | 5 |
| mz.MicroGodMelee 1 | 2 | 4% | 5 |
| adt.Ar2 1.0 | 1 | 2% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 47505 melee ticks, 30603 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 37 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 15396 sent, 13753 reached their opponent, 2787 virtual hits (20.3% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3812340. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 49 over 2 battles (24.5 per battle, most in one battle 29). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.5 | 35 / 70 | 2.13 | 18.7% | 10121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 18.7% | 35 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.6% | 14 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.3% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.4% | 6 |
| Noran.BitchingElk 0.054 | 6.5 | 8.4% | 5 |
| sch.Simone 0.3d | 6.5 | 8.1% | 3 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 6.9% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 5.5% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.3 | 18 / 35 | 5189 |
| 2 | 1 | 67.7 | 86.7 | 17 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 16 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 9 | 89% |
| sch.Simone 0.3d | 7 | 86% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 15 | 43% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 14% | 8 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 4 | 11% | 15 |
| Noran.BitchingElk 0.054 | 4 | 11% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 11% | 8 |
| sch.Simone 0.3d | 2 | 6% | 5 |
| fnc.bandit.Bandit 5.2.0 | 1 | 3% | 1 |
| stelo.PatternRobot 1.0 | 0 | 0% | 2 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 59044 melee ticks, 17045 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 32 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20339 sent, 18698 reached their opponent, 3292 virtual hits (17.6% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3958250. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 44 over 2 battles (22.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.3 | 53 / 70 | 1.79 | 20.5% | 12774 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.5% | 53 |
| radnor.DoctorBob 1.42 | 2.5 | 14.0% | 9 |
| vuen.Cake 2.51 | 3.0 | 12.7% | 3 |
| kawigi.nano.Lib 1.0 | 3.5 | 13.0% | 5 |
| urdos.URDOS 1.3 | 5.0 | 8.9% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 29 / 35 | 6854 |
| 2 | 1 | 69.4 | 88.3 | 24 / 35 | 5920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 22 | 95% |
| radnor.DoctorBob 1.42 | 15 | 100% |
| kawigi.nano.Lib 1.0 | 14 | 79% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 17 of 70 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 6 | 35% | 18 |
| radnor.DoctorBob 1.42 | 3 | 18% | 13 |
| vuen.Cake 2.51 | 2 | 12% | 24 |
| urdos.URDOS 1.3 | 2 | 12% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 12% | 3 |
| adt.Ar1 2.1 | 1 | 6% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 6% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 2 |

Posture (Hadur's M records, 70 rounds): 44162 melee ticks, 15776 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 40 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 40 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 13444 sent, 11776 reached their opponent, 3034 virtual hits (25.8% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3913623. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 29 over 2 battles (14.5 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.4 | 13 / 70 | 2.40 | 17.5% | 11020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.6% | 50 |
| hadur117.Hadur 3.19bb | 2.0 | 17.5% | 13 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.6% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 11.2% | 2 |
| josago.Jorgito 0.16 | 5.0 | 8.7% | 1 |
| tj.zombie1n 1.0.1 | 6.0 | 7.0% | 0 |
| css.Delitioner 0.11 | 7.0 | 6.9% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.6% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.1 | 85.1 | 7 / 35 | 5602 |
| 2 | 2 | 67.6 | 83.8 | 6 / 35 | 5418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 34 | 12% |
| TNT.TNT 0.99.1 | 5 | 100% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| josago.Jorgito 0.16 | 2 | 50% |
| css.Delitioner 0.11 | 1 | 0% |

Hadur died in 57 of 70 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 38 | 67% | 43 |
| TNT.TNT 0.99.1 | 6 | 11% | 11 |
| apc.LeeroyJenkins2 1.0 | 6 | 11% | 8 |
| josago.Jorgito 0.16 | 4 | 7% | 5 |
| css.Delitioner 0.11 | 2 | 4% | 2 |
| rampancy.Durandal 2.1d | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 69312 melee ticks, 23473 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 50 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 50 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 20790 sent, 19109 reached their opponent, 2784 virtual hits (14.6% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3910339. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.3 | 4 / 70 | 3.40 | 13.8% | 6989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.DemonicRage 3.4 | 1.5 | 17.0% | 21 |
| cb.fire.Firestarter 2.0f | 1.5 | 17.8% | 36 |
| wompi.Numbat 2.1 | 3.5 | 13.5% | 4 |
| hadur117.Hadur 3.19bb | 3.5 | 13.8% | 4 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 4 |
| ms.Ares 0.19 | 5.5 | 9.5% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.3% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 3.9% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.9 | 69.8 | 0 / 35 | 3224 |
| 2 | 3 | 63.5 | 76.8 | 4 / 35 | 3765 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 13 | 0% |
| justin.DemonicRage 3.4 | 8 | 25% |
| wompi.Numbat 2.1 | 3 | 67% |

Hadur died in 66 of 70 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 23 | 35% | 25 |
| cb.fire.Firestarter 2.0f | 23 | 35% | 23 |
| wompi.Numbat 2.1 | 11 | 17% | 12 |
| axeBots.HataMoto 3.09 | 4 | 6% | 4 |
| ms.Ares 0.19 | 3 | 5% | 3 |
| supersample.SuperBoxBot 1.0 | 1 | 2% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 2% | 1 |

Posture (Hadur's M records, 70 rounds): 50430 melee ticks, 7732 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 48 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 1.

Targeting waves (70 rounds): 16132 sent, 14419 reached their opponent, 2440 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4020402. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 27 over 2 battles (13.5 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.3 | 45 / 70 | 1.79 | 19.9% | 10853 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.9% | 45 |
| jekl.StoneGhost 0.7 | 2.5 | 14.0% | 6 |
| origin.SleepSiphon 1.7b | 2.5 | 13.8% | 14 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.2% | 1 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 0 |
| gg.Wolverine 2.0 | 6.0 | 9.4% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.2% | 2 |
| spinnercat.Omen 1.0 | 8.0 | 6.1% | 0 |
| DBall.NUKE 0.1 | 8.0 | 5.8% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.8 | 22 / 35 | 5457 |
| 2 | 1 | 70.3 | 91.7 | 23 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 21 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 100% |
| jekl.StoneGhost 0.7 | 15 | 80% |
| gg.Wolverine 2.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 25 of 70 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 9 | 36% | 22 |
| jekl.StoneGhost 0.7 | 9 | 36% | 21 |
| mld.Wisdom 1.0 | 2 | 8% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 8% | 3 |
| pe.minimelee.SandboxMiniMelee 1.1 | 1 | 4% | 12 |
| gg.Wolverine 2.0 | 1 | 4% | 3 |
| DBall.NUKE 0.1 | 1 | 4% | 2 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 51648 melee ticks, 17315 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 39 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 15944 sent, 14346 reached their opponent, 3359 virtual hits (23.4% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=3589154. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 27 over 2 battles (13.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 92.9 | 38 / 70 | 1.64 | 20.7% | 13096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 20.7% | 38 |
| rtk.Tachikoma 1.0 | 2.5 | 16.5% | 13 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 16.5% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.2% | 5 |
| franzor.Lizt 1.3.1 | 4.5 | 11.1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 6.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.5 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 93.7 | 17 / 35 | 6504 |
| 2 | 1 | 72.3 | 92.1 | 21 / 35 | 6592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 29 | 62% |
| franzor.Lizt 1.3.1 | 16 | 63% |
| rsalesc.melee.Monk 0.3.6c | 12 | 50% |
| oog.melee.CapuletDroid 1.1 | 6 | 67% |

Hadur died in 32 of 70 rounds, at a mean tick of 1454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 14 | 44% | 37 |
| rsalesc.melee.Monk 0.3.6c | 9 | 28% | 21 |
| franzor.Lizt 1.3.1 | 6 | 19% | 2 |
| oog.melee.CapuletDroid 1.1 | 3 | 9% | 9 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 62730 melee ticks, 35934 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 24 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 19056 sent, 17393 reached their opponent, 3475 virtual hits (20.0% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19bb against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=4033026. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 26 over 2 battles (13.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 2 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 91.1 | 46 / 70 | 1.80 | 19.6% | 9733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19bb | 1.0 | 19.6% | 46 |
| Krabb.sliNk.Garm 0.9u | 2.0 | 12.9% | 9 |
| tm.Yuugao 1.0 | 3.5 | 12.0% | 8 |
| shrub.Vapour v159 | 3.5 | 11.6% | 5 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.3% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 5.5 | 9.2% | 0 |
| m3thos.Eva00 1.1 | 7.0 | 8.5% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.7% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.4% | 0 |
| SHAM.WOW 1.4 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.8 | 24 / 35 | 4998 |
| 2 | 1 | 69.2 | 91.4 | 22 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| Krabb.sliNk.Garm 0.9u | 17 | 76% |
| tm.Yuugao 1.0 | 12 | 67% |
| shrub.Vapour v159 | 11 | 64% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 100% |
| m3thos.Eva00 1.1 | 4 | 100% |

Hadur died in 24 of 70 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 9 | 38% | 18 |
| tm.Yuugao 1.0 | 8 | 33% | 16 |
| shrub.Vapour v159 | 4 | 17% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 13% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 0 | 0% | 5 |
| m3thos.Eva00 1.1 | 0 | 0% | 3 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 70 rounds): 50192 melee ticks, 16207 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 64 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (70 rounds): longest scan gap while four or more were alive 64 ticks (70 rounds over 8); rounds whose longest gap at any count was over 8: 70; robots dropped as dead without a death event: 0.

Targeting waves (70 rounds): 16371 sent, 14667 reached their opponent, 2648 virtual hits (18.1% of those reached).

