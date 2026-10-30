# Bench suite: gun-smoke-suite.txt

## Melee bench: F01

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3712296. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 1 battles (5.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.5 | 8 / 35 | 2.49 | 16.7% | 4824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.5% | 22 |
| hadur117.Hadur 3.19gv | 2.0 | 16.7% | 8 |
| sgp.JollyNinja 3.53 | 3.0 | 12.4% | 4 |
| mz.MicroGodMelee 1 | 4.0 | 10.8% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.7% | 0 |
| lorneswork.Predator 1.0 | 6.0 | 9.5% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 83.5 | 8 / 35 | 4824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 18 | 6% |
| sgp.JollyNinja 3.53 | 3 | 100% |
| mz.MicroGodMelee 1 | 3 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 27 of 35 rounds, at a mean tick of 1037. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 17 | 63% | 21 |
| sgp.JollyNinja 3.53 | 4 | 15% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 15% | 4 |
| mz.MicroGodMelee 1 | 1 | 4% | 2 |
| lorneswork.Predator 1.0 | 1 | 4% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 24167 melee ticks, 11616 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 65 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 65 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 7794 sent, 6926 reached their opponent, 1309 virtual hits (18.9% of those reached).

## Melee bench: F02

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3644291. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 1 battles (19.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.9 | 12 / 35 | 2.54 | 17.7% | 5024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gv | 1.0 | 17.7% | 12 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 16.7% | 13 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 12.6% | 9 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 0 |
| Noran.BitchingElk 0.054 | 6.0 | 8.5% | 0 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 0 |
| sch.Simone 0.3d | 8.0 | 6.4% | 0 |
| stelo.PatternRobot 1.0 | 9.0 | 5.8% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 12 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 12 | 42% |
| pulsar.PulsarMax 0.8.9 | 5 | 20% |
| lrem.micro.SpikeSoldier 0.4 | 3 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 2 | 100% |
| stelo.PatternRobot 1.0 | 1 | 0% |
| Noran.BitchingElk 0.054 | 1 | 100% |

Hadur died in 23 of 35 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 11 | 48% | 15 |
| pulsar.PulsarMax 0.8.9 | 6 | 26% | 8 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 13% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 1 | 4% | 4 |
| sch.Simone 0.3d | 1 | 4% | 1 |
| stelo.PatternRobot 1.0 | 1 | 4% | 0 |
| Noran.BitchingElk 0.054 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 27393 melee ticks, 5988 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 56 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 56 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 9887 sent, 9092 reached their opponent, 1678 virtual hits (18.5% of those reached).

## Melee bench: F03

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3681331. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 1 battles (10.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.9 | 25 / 35 | 2.00 | 19.7% | 6005 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gv | 1.0 | 19.7% | 25 |
| kawigi.nano.Lib 1.0 | 2.0 | 13.6% | 2 |
| radnor.DoctorBob 1.42 | 3.0 | 12.7% | 4 |
| vuen.Cake 2.51 | 4.0 | 12.4% | 4 |
| urdos.URDOS 1.3 | 5.0 | 9.9% | 0 |
| adt.Ar1 2.1 | 6.0 | 8.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 7.0 | 6.4% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 9.0 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.9 | 25 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 9 | 78% |
| radnor.DoctorBob 1.42 | 9 | 89% |
| kawigi.nano.Lib 1.0 | 8 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 10 of 35 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 4 | 40% | 10 |
| vuen.Cake 2.51 | 2 | 20% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 20% | 2 |
| urdos.URDOS 1.3 | 2 | 20% | 2 |
| kawigi.nano.Lib 1.0 | 0 | 0% | 8 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 21187 melee ticks, 5301 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 32 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 32 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 6505 sent, 5703 reached their opponent, 1444 virtual hits (25.3% of those reached).

## Melee bench: F04

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3562089. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 1 battles (19.0 per battle, most in one battle 19). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.0 | 8 / 35 | 2.17 | 18.0% | 5587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 21.5% | 23 |
| hadur117.Hadur 3.19gv | 2.0 | 18.0% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 14.3% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.1% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.5% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.6% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.9% | 0 |
| spin.Bugstard 0.012b | 9.0 | 3.4% | 0 |
| sp.Nanos.Ember 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 87.0 | 8 / 35 | 5587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 17 | 18% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| tj.zombie1n 1.0.1 | 1 | 100% |
| TNT.TNT 0.99.1 | 1 | 0% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 27 of 35 rounds, at a mean tick of 1338. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 20 | 74% | 24 |
| apc.LeeroyJenkins2 1.0 | 4 | 15% | 6 |
| TNT.TNT 0.99.1 | 2 | 7% | 2 |
| css.Delitioner 0.11 | 1 | 4% | 2 |
| tj.zombie1n 1.0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 34565 melee ticks, 11789 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 29 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 29 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 10306 sent, 9468 reached their opponent, 1314 virtual hits (13.9% of those reached).

## Melee bench: F05

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3439963. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 1 battles (6.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.9 | 7 / 35 | 3.17 | 15.0% | 3957 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 17.6% | 17 |
| justin.DemonicRage 3.4 | 2.0 | 17.4% | 10 |
| hadur117.Hadur 3.19gv | 3.0 | 15.0% | 7 |
| wompi.Numbat 2.1 | 4.0 | 11.2% | 0 |
| ms.Ares 0.19 | 5.0 | 10.6% | 0 |
| axeBots.HataMoto 3.09 | 6.0 | 8.2% | 1 |
| supersample.SuperBoxBot 1.0 | 7.0 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 8.0 | 5.2% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 4.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.6 | 75.9 | 7 / 35 | 3957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 10 | 40% |
| cb.fire.Firestarter 2.0f | 3 | 0% |
| ms.Ares 0.19 | 2 | 100% |
| wompi.Numbat 2.1 | 1 | 100% |

Hadur died in 28 of 35 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 10 | 36% | 15 |
| cb.fire.Firestarter 2.0f | 7 | 25% | 7 |
| wompi.Numbat 2.1 | 5 | 18% | 6 |
| axeBots.HataMoto 3.09 | 2 | 7% | 2 |
| supersample.SuperBoxBot 1.0 | 2 | 7% | 2 |
| ms.Ares 0.19 | 2 | 7% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 25210 melee ticks, 6252 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 33 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 1.

Targeting waves (35 rounds): 7889 sent, 7062 reached their opponent, 1197 virtual hits (16.9% of those reached).

## Melee bench: F06

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3575766. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 20 over 1 battles (20.0 per battle, most in one battle 20). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.5 | 20 / 35 | 1.94 | 19.5% | 5417 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gv | 1.0 | 19.5% | 20 |
| jekl.StoneGhost 0.7 | 2.0 | 14.8% | 5 |
| origin.SleepSiphon 1.7b | 3.0 | 13.7% | 5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.1% | 3 |
| mld.Wisdom 1.0 | 5.0 | 10.8% | 1 |
| gg.Wolverine 2.0 | 6.0 | 7.9% | 0 |
| DBall.NUKE 0.1 | 7.0 | 6.8% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 6.3% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 9.0 | 6.0% | 1 |
| sample.Fire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 20 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 8 | 75% |
| jekl.StoneGhost 0.7 | 7 | 86% |
| pe.minimelee.SandboxMiniMelee 1.1 | 5 | 60% |
| gg.Wolverine 2.0 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 15 of 35 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 7 | 47% | 10 |
| jekl.StoneGhost 0.7 | 4 | 27% | 10 |
| origin.SleepSiphon 1.7b | 2 | 13% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 7% | 3 |
| mld.Wisdom 1.0 | 1 | 7% | 2 |
| gg.Wolverine 2.0 | 0 | 0% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 24671 melee ticks, 8785 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 25 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 25 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 1.

Targeting waves (35 rounds): 7782 sent, 6944 reached their opponent, 1564 virtual hits (22.5% of those reached).

## Melee bench: F07

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3711479. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 14 over 1 battles (14.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.8 | 94.6 | 21 / 35 | 1.49 | 21.1% | 6491 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gv | 1.0 | 21.1% | 21 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.9% | 9 |
| rtk.Tachikoma 1.0 | 3.0 | 13.8% | 2 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.3% | 0 |
| franzor.Lizt 1.3.1 | 5.0 | 11.2% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 9.2% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 6.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| drd.Dreadknoght 0.9 | 9.0 | 2.0% | 0 |
| sample.Target 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.6 | 21 / 35 | 6491 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 15 | 47% |
| rtk.Tachikoma 1.0 | 9 | 78% |
| franzor.Lizt 1.3.1 | 6 | 67% |
| oog.melee.CapuletDroid 1.1 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 14 of 35 rounds, at a mean tick of 1600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 7 | 50% | 15 |
| franzor.Lizt 1.3.1 | 3 | 21% | 0 |
| rtk.Tachikoma 1.0 | 2 | 14% | 13 |
| oog.melee.CapuletDroid 1.1 | 2 | 14% | 4 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 33769 melee ticks, 17786 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 48 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 48 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 9818 sent, 9005 reached their opponent, 1778 virtual hits (19.7% of those reached).

## Melee bench: F08

hadur117.Hadur 3.19gv against 9 opponents at once, 35 rounds per battle, 1 battles, 1000x1000.

robocode.cpu.constant=3712494. Host: Intel(R) Xeon(R) Processor @ 2.10GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 1. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 21 over 1 battles (21.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

Duress ticks: 0 over 1 battles (0.0 per battle, most in one battle 0).

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.9 | 22 / 35 | 2.00 | 19.7% | 5411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.Hadur 3.19gv | 1.0 | 19.7% | 22 |
| tm.Yuugao 1.0 | 2.0 | 13.4% | 9 |
| shrub.Vapour v159 | 3.0 | 11.8% | 3 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.9% | 0 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.5% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.0 | 8.6% | 0 |
| m3thos.Eva00 1.1 | 7.0 | 8.6% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.1% | 0 |
| SHAM.WOW 1.4 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 22 / 35 | 5411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 8 | 75% |
| shrub.Vapour v159 | 8 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 100% |
| Krabb.sliNk.Garm 0.9u | 4 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 2 | 100% |

Hadur died in 13 of 35 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 5 | 38% | 9 |
| shrub.Vapour v159 | 5 | 38% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 15% | 6 |
| com.spp.robocode.MostlyHarmless 010 | 1 | 8% | 5 |
| Krabb.sliNk.Garm 0.9u | 0 | 0% | 5 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |

Posture (Hadur's M records, 35 rounds): 24401 melee ticks, 7954 duel ticks, 0 focused-duel ticks; 0 rounds vetoed; 0 melee faults; longest scan gap 33 ticks; 0 ticks aimed at a dead robot; 0 shots at a sentry.

Sensing (35 rounds): longest scan gap while four or more were alive 33 ticks (35 rounds over 8); rounds whose longest gap at any count was over 8: 35; robots dropped as dead without a death event: 0.

Targeting waves (35 rounds): 8051 sent, 7248 reached their opponent, 1322 virtual hits (18.2% of those reached).

