# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3793111. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 22 over 1 battles (22.0 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.0 | 7 / 35 | 2.26 | 17.1% | 4998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.6% | 22 |
| hadur117.Hadur 3.19gd | 2.0 | 17.1% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.0 | 11.5% | 0 |
| mz.MicroGodMelee 1 | 4.0 | 11.2% | 3 |
| sgp.JollyNinja 3.53 | 5.0 | 10.9% | 2 |
| lorneswork.Predator 1.0 | 6.0 | 9.7% | 0 |
| adt.Ar2 1.0 | 7.0 | 6.7% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.9% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 86.0 | 7 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 16 | 0% |
| mz.MicroGodMelee 1 | 6 | 50% |
| sgp.JollyNinja 3.53 | 2 | 50% |
| lorneswork.Predator 1.0 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 28 of 35 rounds, at a mean tick of 1194. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 19 | 68% | 19 |
| mz.MicroGodMelee 1 | 3 | 11% | 6 |
| sgp.JollyNinja 3.53 | 3 | 11% | 5 |
| lorneswork.Predator 1.0 | 1 | 4% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 4% | 2 |
| adt.Ar2 1.0 | 1 | 4% | 1 |

Posture (Hadur's M records, 35 rounds): 25050 melee ticks, 14747 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 25 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8034 sent, 7208 reached their opponent, 1410 virtual hits (19.6% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3752315. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 20 over 1 battles (20.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.1 | 16 / 35 | 2.43 | 18.2% | 4993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gd | 1.0 | 18.2% | 16 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 13.4% | 6 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 13.4% | 5 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 12.8% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 11.4% | 5 |
| Noran.BitchingElk 0.054 | 6.0 | 8.6% | 3 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.1% | 0 |
| sch.Simone 0.3d | 8.0 | 5.6% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 4.9% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 16 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 71% |
| pulsar.PulsarMax 0.8.9 | 7 | 71% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 4 | 75% |
| Noran.BitchingElk 0.054 | 3 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 1 | 100% |

Hadur died in 19 of 35 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 5 | 26% | 10 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 5 | 26% | 7 |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 16% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 16% | 4 |
| Noran.BitchingElk 0.054 | 2 | 11% | 3 |
| fnc.bandit.Bandit 5.2.0 | 1 | 5% | 1 |
| sch.Simone 0.3d | 0 | 0% | 1 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 27593 melee ticks, 7449 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 859 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 559 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10080 sent, 9256 reached their opponent, 1573 virtual hits (17.0% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3943366. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 16 over 1 battles (16.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 85.7 | 24 / 35 | 2.29 | 19.1% | 6066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gd | 1.0 | 19.1% | 24 |
| radnor.DoctorBob 1.42 | 2.0 | 14.5% | 5 |
| vuen.Cake 2.51 | 3.0 | 13.5% | 4 |
| kawigi.nano.Lib 1.0 | 4.0 | 10.7% | 2 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.0 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.0 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 24 / 35 | 6066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 14 | 86% |
| radnor.DoctorBob 1.42 | 10 | 90% |
| kawigi.nano.Lib 1.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 11 of 35 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| urdos.URDOS 1.3 | 3 | 27% | 4 |
| vuen.Cake 2.51 | 2 | 18% | 14 |
| radnor.DoctorBob 1.42 | 2 | 18% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 18% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 9% | 3 |
| adt.Ar1 2.1 | 1 | 9% | 1 |
| kawigi.nano.Lib 1.0 | 0 | 0% | 2 |

Posture (Hadur's M records, 35 rounds): 20321 melee ticks, 9297 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 38 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 38 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 6317 sent, 5486 reached their opponent, 1383 virtual hits (25.2% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3632921. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 17 over 1 battles (17.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.4 | 7 / 35 | 2.31 | 17.2% | 5024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.5% | 23 |
| hadur117.Hadur 3.19gd | 2.0 | 17.2% | 7 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 14.6% | 2 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.0 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.0 | 3.7% | 0 |
| sp.Nanos.Ember 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.7 | 85.4 | 7 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 15 | 7% |
| apc.LeeroyJenkins2 1.0 | 4 | 100% |
| TNT.TNT 0.99.1 | 3 | 33% |
| josago.Jorgito 0.16 | 2 | 50% |

Hadur died in 28 of 35 rounds, at a mean tick of 1224. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 19 | 68% | 20 |
| TNT.TNT 0.99.1 | 3 | 11% | 4 |
| josago.Jorgito 0.16 | 3 | 11% | 4 |
| apc.LeeroyJenkins2 1.0 | 2 | 7% | 6 |
| css.Delitioner 0.11 | 1 | 4% | 1 |

Posture (Hadur's M records, 35 rounds): 34183 melee ticks, 9176 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 33 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10416 sent, 9534 reached their opponent, 1400 virtual hits (14.7% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3726792. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 14 over 1 battles (14.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 78.1 | 5 / 35 | 2.97 | 15.2% | 3994 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.4% | 19 |
| justin.DemonicRage 3.4 | 2.0 | 15.9% | 6 |
| hadur117.Hadur 3.19gd | 3.0 | 15.2% | 5 |
| wompi.Numbat 2.1 | 4.0 | 12.8% | 3 |
| ms.Ares 0.19 | 5.0 | 9.2% | 0 |
| axeBots.HataMoto 3.09 | 6.0 | 8.7% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.0 | 6.3% | 0 |
| supersample.SuperBoxBot 1.0 | 8.0 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.1 | 78.1 | 5 / 35 | 3994 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 5 | 20% |
| justin.DemonicRage 3.4 | 5 | 20% |
| wompi.Numbat 2.1 | 3 | 67% |
| axeBots.HataMoto 3.09 | 2 | 0% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 30 of 35 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 12 | 40% | 13 |
| cb.fire.Firestarter 2.0f | 8 | 27% | 10 |
| wompi.Numbat 2.1 | 5 | 17% | 6 |
| axeBots.HataMoto 3.09 | 3 | 10% | 3 |
| ms.Ares 0.19 | 2 | 7% | 3 |

Posture (Hadur's M records, 35 rounds): 26755 melee ticks, 4863 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 37 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 37 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8184 sent, 7379 reached their opponent, 1222 virtual hits (16.6% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3395916. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 15 over 1 battles (15.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.2 | 21 / 35 | 1.89 | 19.8% | 5524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gd | 1.0 | 19.8% | 21 |
| jekl.StoneGhost 0.7 | 2.0 | 14.3% | 5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.0 | 12.9% | 3 |
| origin.SleepSiphon 1.7b | 4.0 | 12.5% | 5 |
| mld.Wisdom 1.0 | 5.0 | 10.9% | 0 |
| gg.Wolverine 2.0 | 6.0 | 9.5% | 0 |
| DBall.NUKE 0.1 | 7.0 | 6.5% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 5.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 5.6% | 1 |
| sample.Fire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 21 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 7 | 71% |
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 100% |
| origin.SleepSiphon 1.7b | 6 | 83% |
| gg.Wolverine 2.0 | 3 | 100% |
| mld.Wisdom 1.0 | 1 | 100% |

Hadur died in 14 of 35 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 5 | 36% | 12 |
| jekl.StoneGhost 0.7 | 5 | 36% | 8 |
| pe.minimelee.SandboxMiniMelee 1.1 | 2 | 14% | 7 |
| mld.Wisdom 1.0 | 2 | 14% | 4 |
| gg.Wolverine 2.0 | 0 | 0% | 4 |

Posture (Hadur's M records, 35 rounds): 27947 melee ticks, 5876 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 24 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 24 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8190 sent, 7394 reached their opponent, 1719 virtual hits (23.2% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3742611. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 11 over 1 battles (11.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 94.0 | 21 / 35 | 1.54 | 20.8% | 6263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gd | 1.0 | 20.8% | 21 |
| rtk.Tachikoma 1.0 | 2.0 | 17.0% | 5 |
| rsalesc.melee.Monk 0.3.6c | 3.0 | 15.1% | 6 |
| franzor.Lizt 1.3.1 | 4.0 | 10.7% | 1 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 10.3% | 2 |
| exauge.GateKeeper 1.1.121g | 6.0 | 8.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 8.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.0 | 21 / 35 | 6263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 16 | 81% |
| franzor.Lizt 1.3.1 | 6 | 83% |
| rsalesc.melee.Monk 0.3.6c | 5 | 0% |
| oog.melee.CapuletDroid 1.1 | 5 | 60% |

Hadur died in 14 of 35 rounds, at a mean tick of 1436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 6 | 43% | 22 |
| rsalesc.melee.Monk 0.3.6c | 5 | 36% | 6 |
| oog.melee.CapuletDroid 1.1 | 2 | 14% | 5 |
| franzor.Lizt 1.3.1 | 1 | 7% | 0 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |

Posture (Hadur's M records, 35 rounds): 31383 melee ticks, 15375 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 39 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 39 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 9627 sent, 8777 reached their opponent, 1808 virtual hits (20.6% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gd against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3639725. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 1 battles (21.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 92.1 | 22 / 35 | 1.71 | 19.7% | 4987 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gd | 1.0 | 19.7% | 22 |
| tm.Yuugao 1.0 | 2.0 | 12.7% | 4 |
| shrub.Vapour v159 | 3.0 | 12.2% | 2 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 11.9% | 4 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.9% | 2 |
| m3thos.Eva00 1.1 | 6.0 | 8.8% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.0% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.6% | 0 |
| SHAM.WOW 1.4 | 9.0 | 5.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.1 | 22 / 35 | 4987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 10 | 80% |
| Krabb.sliNk.Garm 0.9u | 8 | 75% |
| com.spp.robocode.MostlyHarmless 010 | 4 | 75% |
| shrub.Vapour v159 | 4 | 75% |
| m3thos.Eva00 1.1 | 1 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 100% |

Hadur died in 13 of 35 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| Krabb.sliNk.Garm 0.9u | 4 | 31% | 9 |
| shrub.Vapour v159 | 4 | 31% | 6 |
| tm.Yuugao 1.0 | 3 | 23% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 15% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 0 | 0% | 2 |
| m3thos.Eva00 1.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 24862 melee ticks, 8499 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 32 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8162 sent, 7354 reached their opponent, 1386 virtual hits (18.8% of those reached).

