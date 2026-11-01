# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.9 | 21 / 70 | 2.27 | 16.8% | 9355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 47 |
| hadur117.mini.DeiseLEARNH 0.4 | 2.0 | 16.8% | 21 |
| sgp.JollyNinja 3.53 | 3.5 | 11.0% | 4 |
| mz.MicroGodMelee 1 | 3.5 | 11.6% | 0 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.8% | 0 |
| lorneswork.Predator 1.0 | 6.0 | 9.9% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| skm.butterfly 1.0 | 8.5 | 4.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 88.3 | 13 / 35 | 4560 |
| 2 | 2 | 66.0 | 83.5 | 8 / 35 | 4795 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 44 | 23% |
| sgp.JollyNinja 3.53 | 4 | 75% |
| mz.MicroGodMelee 1 | 3 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |

Hadur died in 51 of 70 rounds, at a mean tick of 1281. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 36 | 71% | 47 |
| sgp.JollyNinja 3.53 | 5 | 10% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 8% | 5 |
| mz.MicroGodMelee 1 | 2 | 4% | 6 |
| lorneswork.Predator 1.0 | 2 | 4% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.6 | 41 / 70 | 2.30 | 18.5% | 9587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.5% | 41 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.8% | 13 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 4 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 3 |
| sch.Simone 0.3d | 7.0 | 7.4% | 4 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 8.1% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 7.8% | 4 |
| stelo.PatternRobot 1.0 | 9.0 | 5.6% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.4 | 20 / 35 | 4796 |
| 2 | 1 | 68.3 | 85.7 | 21 / 35 | 4791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 19 | 79% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 18 | 89% |
| sch.Simone 0.3d | 4 | 75% |
| Noran.BitchingElk 0.054 | 3 | 33% |
| lrem.micro.SpikeSoldier 0.4 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 1 | 100% |

Hadur died in 29 of 70 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 10 | 34% | 21 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 8 | 28% | 25 |
| Noran.BitchingElk 0.054 | 4 | 14% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 3 | 10% | 6 |
| sch.Simone 0.3d | 1 | 3% | 4 |
| fnc.bandit.Bandit 5.2.0 | 1 | 3% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 1 | 3% | 3 |
| stelo.PatternRobot 1.0 | 1 | 3% | 1 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

## Melee bench: F03

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.3 | 44 / 70 | 1.79 | 19.8% | 12098 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.8% | 44 |
| vuen.Cake 2.51 | 3.0 | 14.0% | 17 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 5 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.8% | 4 |
| urdos.URDOS 1.3 | 5.0 | 8.5% | 0 |
| adt.Ar1 2.1 | 6.0 | 7.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.2% | 0 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 21 / 35 | 6330 |
| 2 | 1 | 69.9 | 92.7 | 23 / 35 | 5768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 28 | 64% |
| kawigi.nano.Lib 1.0 | 18 | 100% |
| radnor.DoctorBob 1.42 | 9 | 89% |

Hadur died in 26 of 70 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 12 | 46% | 29 |
| kawigi.nano.Lib 1.0 | 6 | 23% | 22 |
| radnor.DoctorBob 1.42 | 6 | 23% | 11 |
| oa.weak.FlyMk1 0.1 | 1 | 4% | 2 |
| urdos.URDOS 1.3 | 1 | 4% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.4 | 16 / 70 | 2.04 | 18.2% | 11413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 53 |
| hadur117.mini.DeiseLEARNH 0.4 | 2.0 | 18.2% | 16 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.3% | 1 |
| josago.Jorgito 0.16 | 4.5 | 9.6% | 0 |
| TNT.TNT 0.99.1 | 4.5 | 10.0% | 0 |
| css.Delitioner 0.11 | 6.0 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.0% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 87.9 | 6 / 35 | 5552 |
| 2 | 2 | 69.5 | 88.9 | 10 / 35 | 5861 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 57 | 23% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 54 of 70 rounds, at a mean tick of 1572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 48 | 89% | 61 |
| apc.LeeroyJenkins2 1.0 | 4 | 7% | 6 |
| TNT.TNT 0.99.1 | 1 | 2% | 1 |
| josago.Jorgito 0.16 | 1 | 2% | 1 |
| tj.zombie1n 1.0.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 2 battles (2.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.4 | 5 / 70 | 3.30 | 13.8% | 6801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 20.5% | 46 |
| justin.DemonicRage 3.4 | 2.0 | 17.3% | 16 |
| hadur117.mini.DeiseLEARNH 0.4 | 3.0 | 13.8% | 5 |
| wompi.Numbat 2.1 | 4.0 | 12.0% | 3 |
| ms.Ares 0.19 | 5.0 | 8.9% | 0 |
| axeBots.HataMoto 3.09 | 6.0 | 8.1% | 0 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 77.8 | 3 / 35 | 3472 |
| 2 | 3 | 61.1 | 71.1 | 2 / 35 | 3329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 9 | 22% |
| justin.DemonicRage 3.4 | 9 | 11% |
| wompi.Numbat 2.1 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 65 of 70 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 28 | 43% | 29 |
| cb.fire.Firestarter 2.0f | 25 | 38% | 27 |
| wompi.Numbat 2.1 | 6 | 9% | 7 |
| supersample.SuperBoxBot 1.0 | 2 | 3% | 2 |
| axeBots.HataMoto 3.09 | 1 | 2% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 2% | 1 |
| ms.Ares 0.19 | 1 | 2% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 2% | 1 |

## Melee bench: F06

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.1 | 34 / 70 | 2.34 | 17.7% | 8943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 17.7% | 34 |
| origin.SleepSiphon 1.7b | 2.0 | 15.3% | 17 |
| jekl.StoneGhost 0.7 | 3.5 | 14.3% | 7 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.1% | 8 |
| mld.Wisdom 1.0 | 4.5 | 10.0% | 1 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 7.1% | 2 |
| DBall.NUKE 0.1 | 8.0 | 5.7% | 0 |
| spinnercat.Omen 1.0 | 8.5 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 21 / 35 | 4567 |
| 2 | 1 | 65.5 | 79.0 | 13 / 35 | 4376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 23 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 64% |
| jekl.StoneGhost 0.7 | 11 | 82% |
| DBall.NUKE 0.1 | 1 | 100% |
| gg.Wolverine 2.0 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 31% | 18 |
| origin.SleepSiphon 1.7b | 10 | 28% | 29 |
| jekl.StoneGhost 0.7 | 10 | 28% | 17 |
| mld.Wisdom 1.0 | 4 | 11% | 4 |
| spinnercat.Omen 1.0 | 1 | 3% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.2 | 42 / 70 | 1.61 | 19.9% | 11177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.9% | 42 |
| rtk.Tachikoma 1.0 | 2.0 | 18.0% | 12 |
| rsalesc.melee.Monk 0.3.6c | 3.0 | 16.3% | 15 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 1 |
| franzor.Lizt 1.3.1 | 5.0 | 9.9% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.1% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| drd.Dreadknoght 0.9 | 9.0 | 2.6% | 0 |
| sample.Target 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 94.6 | 26 / 35 | 5814 |
| 2 | 1 | 70.4 | 91.7 | 16 / 35 | 5363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 39 | 82% |
| rsalesc.melee.Monk 0.3.6c | 15 | 20% |
| oog.melee.CapuletDroid 1.1 | 7 | 86% |
| franzor.Lizt 1.3.1 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 1447. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 17 | 61% | 21 |
| rtk.Tachikoma 1.0 | 10 | 36% | 42 |
| oog.melee.CapuletDroid 1.1 | 1 | 4% | 7 |

## Melee bench: F08

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 34 over 2 battles (17.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 92.2 | 47 / 70 | 1.70 | 19.5% | 9504 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.5% | 47 |
| shrub.Vapour v159 | 2.5 | 12.7% | 5 |
| tm.Yuugao 1.0 | 2.5 | 12.4% | 9 |
| m3thos.Eva00 1.1 | 4.5 | 9.4% | 0 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.5% | 1 |
| Krabb.sliNk.Garm 0.9u | 6.0 | 8.8% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.0% | 2 |
| SHAM.WOW 1.4 | 8.5 | 7.2% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.5% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.5 | 6.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 92.7 | 25 / 35 | 4719 |
| 2 | 1 | 68.9 | 91.7 | 22 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 20 | 65% |
| shrub.Vapour v159 | 9 | 89% |
| com.spp.robocode.MostlyHarmless 010 | 8 | 100% |
| SHAM.WOW 1.4 | 8 | 88% |
| Krabb.sliNk.Garm 0.9u | 6 | 67% |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 60% |
| m3thos.Eva00 1.1 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 9 | 39% | 22 |
| Krabb.sliNk.Garm 0.9u | 5 | 22% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 13% | 6 |
| shrub.Vapour v159 | 2 | 9% | 10 |
| SHAM.WOW 1.4 | 2 | 9% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 9% | 7 |
| m3thos.Eva00 1.1 | 0 | 0% | 7 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.8 | 24 / 70 | 3.09 | 15.8% | 7952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 34 |
| hadur117.mini.DeiseLEARNH 0.4 | 2.0 | 15.8% | 24 |
| kc.micro.Figment 1.0 | 3.5 | 13.3% | 4 |
| yagami.Tidus 0.11 | 4.0 | 11.9% | 0 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.3% | 2 |
| mc2.enemy.Original 0.9 | 5.5 | 10.1% | 5 |
| dft.Calliope 5.6 | 7.0 | 6.6% | 0 |
| step.nanoPri 1.0 | 8.0 | 5.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.8% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 74.9 | 10 / 35 | 4034 |
| 2 | 2 | 64.8 | 78.7 | 14 / 35 | 3918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 20 | 50% |
| kc.micro.Figment 1.0 | 8 | 88% |
| yagami.Tidus 0.11 | 3 | 100% |
| mc2.enemy.Original 0.9 | 3 | 67% |
| pedersen.Grishnakh 1.0 | 2 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 16 | 35% | 27 |
| yagami.Tidus 0.11 | 10 | 22% | 12 |
| kc.micro.Figment 1.0 | 7 | 15% | 14 |
| mc2.enemy.Original 0.9 | 6 | 13% | 8 |
| pedersen.Grishnakh 1.0 | 3 | 7% | 4 |
| robar.nano.Assertive_Melee 0.2 | 2 | 4% | 2 |
| dft.Calliope 5.6 | 1 | 2% | 2 |
| step.nanoPri 1.0 | 1 | 2% | 1 |

## Melee bench: F10

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 95.4 | 56 / 70 | 1.41 | 20.3% | 10643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.3% | 56 |
| DTF.Kludgy 1.2b | 2.5 | 13.2% | 8 |
| ne.Chimera 1.2 | 3.0 | 12.7% | 2 |
| ejb.Polaris 1.0.1 | 3.5 | 12.4% | 3 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.3% | 1 |
| vStar.RAFzilla 2.15 | 6.0 | 9.5% | 0 |
| sam.Samspin 1.0 | 7.5 | 6.5% | 0 |
| kurios.DOSexe .9b | 8.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 95.6 | 29 / 35 | 5465 |
| 2 | 1 | 70.0 | 95.2 | 27 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 23 | 100% |
| ne.Chimera 1.2 | 17 | 88% |
| DTF.Kludgy 1.2b | 15 | 60% |
| tvv.micro.Antares 1.1.1 | 6 | 100% |
| vStar.RAFzilla 2.15 | 3 | 100% |

Hadur died in 14 of 70 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 6 | 43% | 16 |
| ne.Chimera 1.2 | 5 | 36% | 21 |
| ejb.Polaris 1.0.1 | 1 | 7% | 22 |
| vStar.RAFzilla 2.15 | 1 | 7% | 2 |
| donjezza.Muncho 1.0 | 1 | 7% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.6 | 31 / 70 | 2.30 | 17.4% | 8347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.5 | 17.4% | 31 |
| rz.Aleph 0.34 | 1.5 | 17.3% | 29 |
| cx.mini.Nimrod 0.55 | 3.5 | 12.0% | 2 |
| djc.DynaBot 0.1.1 | 3.5 | 11.4% | 2 |
| br2.MobyDickBot 1.6 | 5.0 | 8.9% | 5 |
| rdt199.Warlord 0.73 | 6.0 | 8.4% | 2 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 0 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.7% | 0 |
| stelo.MirrorNano 1.3 | 9.0 | 5.6% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 86.7 | 17 / 35 | 4123 |
| 2 | 2 | 66.5 | 84.4 | 14 / 35 | 4224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 31 | 48% |
| cx.mini.Nimrod 0.55 | 7 | 86% |
| djc.DynaBot 0.1.1 | 6 | 100% |
| br2.MobyDickBot 1.6 | 3 | 33% |
| rdt199.Warlord 0.73 | 2 | 100% |
| uji.YellohFellah 1.0 | 1 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 23 | 59% | 36 |
| cx.mini.Nimrod 0.55 | 6 | 15% | 9 |
| br2.MobyDickBot 1.6 | 3 | 8% | 4 |
| djc.DynaBot 0.1.1 | 2 | 5% | 9 |
| rdt199.Warlord 0.73 | 2 | 5% | 5 |
| uji.YellohFellah 1.0 | 1 | 3% | 4 |
| stelo.MirrorNano 1.3 | 1 | 3% | 1 |
| KiraNL.Chupacabra 0.4 | 1 | 3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.6 | 47 / 70 | 2.03 | 18.5% | 7949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.5% | 47 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.1% | 6 |
| darkcanuck.Leon 1.01 | 3.5 | 12.9% | 7 |
| nat.PallasHawk 1.0 | 3.5 | 12.1% | 7 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.6% | 1 |
| jrm.Test0 1.0 | 6.5 | 7.7% | 0 |
| jp.Perpy 16.0 | 6.5 | 7.7% | 1 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.1% | 1 |
| stuff.Vlad 0.1 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.9 | 24 / 35 | 4062 |
| 2 | 1 | 67.7 | 88.3 | 23 / 35 | 3887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 17 | 94% |
| nat.PallasHawk 1.0 | 15 | 93% |
| darkcanuck.Leon 1.01 | 13 | 85% |
| brainfade.melee.Genghis 0.36 | 4 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 7 | 30% | 19 |
| darkcanuck.Leon 1.01 | 4 | 17% | 22 |
| jrm.Test0 1.0 | 4 | 17% | 4 |
| nat.PallasHawk 1.0 | 3 | 13% | 14 |
| brainfade.melee.Genghis 0.36 | 2 | 9% | 4 |
| jp.Perpy 16.0 | 1 | 4% | 3 |
| cs.sheldor.Talon 1.1 | 1 | 4% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 4% | 1 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.6 | 25 / 70 | 2.11 | 16.9% | 8355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.5 | 16.9% | 25 |
| mn.Combat 3.25.0 | 1.5 | 17.7% | 33 |
| ags.Glacier 0.2.11 | 3.0 | 15.9% | 8 |
| shinh.Entangled 0.3 | 4.0 | 12.1% | 3 |
| gh.micro.Gruweltje 0.7 | 5.0 | 10.5% | 1 |
| stelo.Wang 1.0 | 6.5 | 6.7% | 0 |
| apc.Colossus2 0.17 | 6.5 | 7.5% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.1% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 89.2 | 12 / 35 | 4293 |
| 2 | 2 | 66.5 | 86.0 | 13 / 35 | 4062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 31 | 32% |
| ags.Glacier 0.2.11 | 18 | 67% |
| shinh.Entangled 0.3 | 5 | 60% |
| gh.micro.Gruweltje 0.7 | 1 | 0% |

Hadur died in 45 of 70 rounds, at a mean tick of 1187. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 27 | 60% | 35 |
| ags.Glacier 0.2.11 | 12 | 27% | 25 |
| shinh.Entangled 0.3 | 4 | 9% | 7 |
| gh.micro.Gruweltje 0.7 | 1 | 2% | 2 |
| stelo.Wang 1.0 | 1 | 2% | 1 |

## Melee bench: F14

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.8 | 56 / 70 | 1.47 | 20.6% | 10979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.6% | 56 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.2% | 7 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 5 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 9.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 5.5 | 9.0% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 7.0 | 7.6% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 8.2% | 0 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 98.4 | 31 / 35 | 5789 |
| 2 | 1 | 69.9 | 91.1 | 25 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 30 | 90% |
| catcat20.shape.Theta 0.018 | 21 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 14 of 70 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 8 | 57% | 37 |
| catcat20.shape.Theta 0.018 | 5 | 36% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 7% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.5 | 41 / 70 | 1.86 | 19.7% | 10716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.7% | 41 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.5% | 3 |
| emp.Yngwie 1.11 | 2.5 | 13.6% | 17 |
| mld.DustBunny 3.8 | 4.0 | 11.5% | 0 |
| cb.nano.Insomnia 1.0 | 5.5 | 11.1% | 2 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.4% | 7 |
| lambdaxy.TBot 0.1 | 7.5 | 6.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.3% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.0 | 19 / 35 | 5083 |
| 2 | 1 | 71.0 | 94.0 | 22 / 35 | 5633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 22 | 64% |
| kawigi.micro.Shiz 1.1 | 14 | 86% |
| mld.DustBunny 3.8 | 7 | 100% |
| cb.nano.Insomnia 1.0 | 6 | 67% |
| kawigi.robot.Girl 1.2 | 6 | 50% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 29 of 70 rounds, at a mean tick of 1251. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 15 | 52% | 32 |
| kawigi.robot.Girl 1.2 | 7 | 24% | 11 |
| cb.nano.Insomnia 1.0 | 3 | 10% | 2 |
| kawigi.micro.Shiz 1.1 | 2 | 7% | 12 |
| mld.DustBunny 3.8 | 1 | 3% | 9 |
| lambdaxy.TBot 0.1 | 1 | 3% | 1 |
| divineomega.TrialBot 0.003 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 86.3 | 31 / 70 | 2.23 | 18.9% | 11439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.5 | 18.9% | 31 |
| gh.Griezel 0.5.2 | 1.5 | 18.3% | 30 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.0% | 0 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 9.9% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 8.9% | 0 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.2% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 8.1% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 4.9% | 2 |
| asd.Cthulhu 1.3 | 8.5 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 90.8 | 22 / 35 | 5973 |
| 2 | 2 | 67.3 | 81.9 | 9 / 35 | 5466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 37 | 49% |
| techdude.forest.FlamingForest 1.1 | 5 | 40% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 1 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 40 of 70 rounds, at a mean tick of 1417. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 28 | 70% | 48 |
| techdude.forest.FlamingForest 1.1 | 3 | 8% | 5 |
| divineomega.DivineBot 1.9.4.5 | 3 | 8% | 4 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2 | 5% | 5 |
| stelo.IntrinsicVolatility 1.4 | 2 | 5% | 3 |
| bvh.fnr.Fenrir 0.36l | 1 | 3% | 3 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.9 | 37 / 70 | 2.54 | 18.1% | 10328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.1% | 37 |
| oog.melee.Mercutio 1.0 | 2.5 | 13.2% | 9 |
| et.Predator 1.8 | 3.0 | 13.5% | 8 |
| cx.BlestPain 1.41 | 4.0 | 12.4% | 10 |
| nic.Nicator 2.4 | 5.0 | 11.3% | 3 |
| ahf.NanoAndrew .4 | 5.5 | 10.6% | 2 |
| maribo.melee.BMV 0.1 | 7.0 | 8.4% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.3% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 82.5 | 18 / 35 | 4957 |
| 2 | 1 | 68.7 | 83.2 | 19 / 35 | 5371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 12 | 92% |
| et.Predator 1.8 | 12 | 83% |
| cx.BlestPain 1.41 | 8 | 63% |
| nic.Nicator 2.4 | 6 | 83% |
| ahf.NanoAndrew .4 | 5 | 100% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 33 of 70 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 9 | 27% | 17 |
| et.Predator 1.8 | 7 | 21% | 17 |
| nic.Nicator 2.4 | 5 | 15% | 10 |
| ahf.NanoAndrew .4 | 5 | 15% | 7 |
| oog.melee.Mercutio 1.0 | 4 | 12% | 14 |
| maribo.melee.BMV 0.1 | 1 | 3% | 3 |
| tex.Longbot 0.4 | 1 | 3% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 3% | 1 |

## Melee bench: F18

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 23 over 2 battles (11.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.7 | 43 / 70 | 1.93 | 19.0% | 9302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.0% | 43 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.6% | 11 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.8% | 9 |
| ratosh.Nobo 0.21 | 4.0 | 10.4% | 2 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.3% | 1 |
| uji.DBH 1.1 | 5.5 | 9.7% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.5% | 0 |
| sigterm.Sigterm 1.0 | 7.5 | 8.1% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 5.2% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.7 | 25 / 35 | 4714 |
| 2 | 1 | 67.8 | 87.6 | 18 / 35 | 4588 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 22 | 73% |
| agd.Mooserwirt2 2.7 | 20 | 75% |
| sigterm.Sigterm 1.0 | 6 | 83% |
| ratosh.Nobo 0.21 | 4 | 75% |
| spinnercat.Robovirus 2.718 | 1 | 100% |
| uji.DBH 1.1 | 1 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |
| stelo.WangRobot 1.0 | 1 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 9 | 33% | 26 |
| agd.Mooserwirt2 2.7 | 8 | 30% | 21 |
| ratosh.Nobo 0.21 | 4 | 15% | 7 |
| spinnercat.Robovirus 2.718 | 2 | 7% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 7% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 4% | 3 |
| sigterm.Sigterm 1.0 | 1 | 4% | 3 |
| stelo.WangRobot 1.0 | 0 | 0% | 2 |
| uji.DBH 1.1 | 0 | 0% | 2 |

## Melee bench: F19

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 26 over 2 battles (13.0 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 96.3 | 63 / 70 | 1.33 | 21.4% | 11321 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 21.4% | 63 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.8% | 5 |
| mld.Infinity 2.2 | 3.0 | 13.8% | 3 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.2% | 0 |
| erdnis.Rover 0.3 | 5.5 | 9.1% | 0 |
| patson.PatsonTestBot 1.0 | 5.5 | 8.9% | 0 |
| pbg.R2D2 1.0 | 7.5 | 6.9% | 0 |
| mbh.Mbh 0.1 | 8.0 | 6.5% | 0 |
| pac.ABC 2.1 | 8.5 | 6.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.1 | 32 / 35 | 5775 |
| 2 | 1 | 72.0 | 95.6 | 31 / 35 | 5546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 37 | 97% |
| mld.Infinity 2.2 | 17 | 94% |
| krillr.mini.JointStrike 2.0.0 | 6 | 100% |
| erdnis.Rover 0.3 | 2 | 100% |
| pac.ABC 2.1 | 1 | 100% |
| patson.PatsonTestBot 1.0 | 1 | 100% |

Hadur died in 8 of 70 rounds, at a mean tick of 1815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 3 | 38% | 33 |
| mld.Infinity 2.2 | 2 | 25% | 13 |
| pbg.R2D2 1.0 | 2 | 25% | 5 |
| krillr.mini.JointStrike 2.0.0 | 0 | 0% | 7 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 5 |
| erdnis.Rover 0.3 | 0 | 0% | 4 |
| pac.ABC 2.1 | 0 | 0% | 2 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.4 | 51 / 70 | 1.77 | 20.3% | 10834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.3% | 51 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.2% | 10 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 12.2% | 2 |
| fwb.Nine 1.0.1 | 4.0 | 10.5% | 6 |
| catcat20.Rabbit 0.001 | 5.0 | 9.0% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 7.9% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.5% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.8% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 23 / 35 | 5215 |
| 2 | 1 | 71.9 | 95.6 | 28 / 35 | 5619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 30 | 93% |
| fwb.Nine 1.0.1 | 13 | 85% |
| nz.jdc.nano.GridFu 1.0 | 5 | 100% |
| catcat20.Rabbit 0.001 | 4 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 9 | 47% | 28 |
| fwb.Nine 1.0.1 | 4 | 21% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3 | 16% | 11 |
| bayen.nut.Squirrel 1.615 | 2 | 11% | 3 |
| catcat20.Rabbit 0.001 | 1 | 5% | 7 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 24 over 2 battles (12.0 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 94.3 | 49 / 70 | 1.51 | 20.4% | 10646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.4% | 49 |
| dummy.mini.Scimitar 1.01 | 2.5 | 14.8% | 4 |
| eem.EvBot v4.6.16 | 2.5 | 16.0% | 18 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 0 |
| eld.Hmm 1.0 | 5.0 | 8.3% | 0 |
| oa.weak.BotherBot 0.1 | 6.5 | 7.5% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 92.7 | 23 / 35 | 4854 |
| 2 | 1 | 72.0 | 95.9 | 26 / 35 | 5792 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 40 | 70% |
| dummy.mini.Scimitar 1.01 | 12 | 92% |
| cf.RiO.RiOx 4.2.1 | 8 | 100% |
| eld.Hmm 1.0 | 2 | 100% |

Hadur died in 22 of 70 rounds, at a mean tick of 1375. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 13 | 59% | 33 |
| cf.RiO.RiOx 4.2.1 | 4 | 18% | 11 |
| dummy.mini.Scimitar 1.01 | 2 | 9% | 19 |
| el.JumpShoot 0.2 | 2 | 9% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| eld.Hmm 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.7 | 35 / 70 | 2.20 | 18.3% | 10270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.3% | 35 |
| pe.SandboxDT 2.71m | 2.5 | 16.5% | 17 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.6% | 11 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.7% | 7 |
| bigpete.Stewie 1.0 | 5.0 | 9.4% | 1 |
| yk.JahRoslav 1.1 | 6.5 | 7.1% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.4% | 0 |
| gg.Squaraus 0.6 | 7.5 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.9 | 19 / 35 | 5261 |
| 2 | 1 | 67.8 | 85.4 | 16 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 19 | 84% |
| pe.SandboxDT 2.71m | 15 | 47% |
| jlm.javaDisturbance 0.59 | 12 | 92% |
| bigpete.Stewie 1.0 | 1 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 17 | 49% | 28 |
| kvk.HebusLeTroll 0.35 | 9 | 26% | 20 |
| jlm.javaDisturbance 0.59 | 7 | 20% | 19 |
| gg.Squaraus 0.6 | 2 | 6% | 2 |
| bigpete.Stewie 1.0 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.9 | 51 / 70 | 1.46 | 20.4% | 10157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.4% | 51 |
| pe.SandboxLump 1.52 | 2.0 | 18.2% | 17 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 1 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.4% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.6% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.0% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.0% | 0 |
| sample.Walls 1.0 | 8.0 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.8 | 29 / 35 | 5235 |
| 2 | 1 | 71.1 | 93.0 | 22 / 35 | 4922 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 40 | 73% |
| cre.Karolos 0.32 | 14 | 93% |
| stelo.AreaTargetingBot 1.1 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 3 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 17 | 89% | 46 |
| cre.Karolos 0.32 | 1 | 5% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 5% | 1 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 4 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 3 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.9 | 31 / 70 | 2.90 | 16.1% | 7561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 16.1% | 31 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.3% | 10 |
| davidalves.Phoenix 0.54 | 3.0 | 14.0% | 18 |
| florent.XSeries.X2 0.12 | 4.5 | 12.3% | 6 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.9% | 3 |
| oog.melee.Corsair 1.0 | 6.0 | 9.1% | 2 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.6% | 0 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.7% | 0 |
| evd.X1 0.01 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 76.2 | 12 / 35 | 3591 |
| 2 | 1 | 66.0 | 81.6 | 19 / 35 | 3970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 15 | 60% |
| rz.GlowBlowMelee 1.4 | 13 | 92% |
| pedersen.Ugluk 1.1.1 | 4 | 100% |
| florent.XSeries.X2 0.12 | 4 | 75% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 13 | 33% | 23 |
| florent.XSeries.X2 0.12 | 9 | 23% | 13 |
| rz.GlowBlowMelee 1.4 | 7 | 18% | 18 |
| pedersen.Ugluk 1.1.1 | 5 | 13% | 9 |
| stelo.SoJNanoMelee 1.1 | 2 | 5% | 3 |
| oog.melee.Corsair 1.0 | 2 | 5% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 3% | 2 |

## Melee bench: F25

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.0 | 54 / 70 | 1.81 | 19.8% | 8610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.8% | 54 |
| voidious.micro.BlitzBat 1.05 | 2.0 | 13.8% | 1 |
| voidious.mini.BrokenSword 2.0.3 | 3.5 | 12.6% | 2 |
| jdw.Hurricane 1.4 | 3.5 | 12.5% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 8.7% | 2 |
| gjr.Cephalosporin 0.1 | 6.5 | 7.6% | 2 |
| ds.Oo 2.2 | 7.0 | 7.8% | 0 |
| awesomeness.Elite 1.0 | 7.5 | 6.7% | 0 |
| adt.Ar2 1.1 | 9.0 | 6.2% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 92.1 | 27 / 35 | 4460 |
| 2 | 1 | 69.3 | 89.8 | 27 / 35 | 4150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 23 | 96% |
| voidious.mini.BrokenSword 2.0.3 | 15 | 93% |
| jdw.Hurricane 1.4 | 11 | 91% |
| ds.Oo 2.2 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 16 of 70 rounds, at a mean tick of 585. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 5 | 31% | 20 |
| jdw.Hurricane 1.4 | 5 | 31% | 13 |
| voidious.micro.BlitzBat 1.05 | 3 | 19% | 20 |
| gjr.Cephalosporin 0.1 | 1 | 6% | 6 |
| gre.svman4.Morfeas 1.4.1 | 1 | 6% | 4 |
| awesomeness.Elite 1.0 | 1 | 6% | 2 |
| adt.Ar2 1.1 | 0 | 0% | 2 |
| ds.Oo 2.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.5 | 44 / 70 | 1.67 | 20.0% | 11663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.0% | 44 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 10 |
| lrem.Spectre 0.4.4 | 3.5 | 12.0% | 5 |
| shu.nitro.LENIN .T34 | 4.0 | 12.4% | 8 |
| js.PinBall 1.6 | 5.0 | 10.1% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 5.5 | 9.2% | 2 |
| gh.mini.GrubbmOne 1.0 | 7.5 | 7.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 7.5 | 7.3% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 20 / 35 | 5622 |
| 2 | 1 | 71.2 | 93.0 | 24 / 35 | 6041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 24 | 75% |
| shu.nitro.LENIN .T34 | 15 | 67% |
| lrem.Spectre 0.4.4 | 14 | 79% |
| js.PinBall 1.6 | 2 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 26 of 70 rounds, at a mean tick of 1101. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 9 | 35% | 24 |
| lrem.Spectre 0.4.4 | 7 | 27% | 16 |
| shu.nitro.LENIN .T34 | 6 | 23% | 17 |
| js.PinBall 1.6 | 3 | 12% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 4% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 2 |

## Melee bench: F27

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.7 | 42 / 70 | 2.01 | 18.3% | 8388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.3% | 42 |
| mk.Alpha 0.2.1 | 2.0 | 14.6% | 14 |
| wee.Gem 1.8.4 | 4.0 | 12.0% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.3% | 3 |
| EH.Eagle 1.0.6 | 4.0 | 11.0% | 3 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.0% | 0 |
| joe.ADinosaur 1.0 | 7.0 | 7.9% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 7.5 | 6.8% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 4.7% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.9 | 19 / 35 | 4058 |
| 2 | 1 | 68.4 | 89.5 | 23 / 35 | 4330 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 26 | 69% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 92% |
| wee.Gem 1.8.4 | 10 | 70% |
| EH.Eagle 1.0.6 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 1 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 15 | 54% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 14% | 15 |
| wee.Gem 1.8.4 | 4 | 14% | 10 |
| throxbot.ThroxBot 0.1 | 3 | 11% | 4 |
| EH.Eagle 1.0.6 | 1 | 4% | 7 |
| joe.ADinosaur 1.0 | 1 | 4% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.8 | 46 / 70 | 1.91 | 18.9% | 8557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.9% | 46 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 10 |
| uji.Antique 1.0 | 3.0 | 12.9% | 5 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 5 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 1 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.5% | 1 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.1% | 2 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.4% | 0 |
| stelo.PianistNano 1.2 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.5 | 24 / 35 | 4221 |
| 2 | 1 | 68.5 | 90.2 | 22 / 35 | 4336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 29 | 86% |
| uji.Antique 1.0 | 13 | 92% |
| qohnil.blot.BlotBot 3.61 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 67% |
| ahr.ice.Ice 1.0.2 | 1 | 100% |

Hadur died in 24 of 70 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 9 | 38% | 26 |
| uji.Antique 1.0 | 5 | 21% | 19 |
| pfvicm.Sobieski 7.2.3b | 3 | 13% | 6 |
| amk.ChumbaWumba 0.3 | 3 | 13% | 3 |
| qohnil.blot.BlotBot 3.61 | 2 | 8% | 8 |
| ahr.ice.Ice 1.0.2 | 1 | 4% | 2 |
| stelo.PianistNano 1.2 | 1 | 4% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.6 | 31 / 70 | 2.66 | 17.4% | 8826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 17.4% | 31 |
| deewiant.Anomaly 0.2 | 2.5 | 15.8% | 15 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.9% | 18 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 1 |
| jok.PheonixM 0.1.2 | 5.0 | 10.6% | 3 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.8% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 5.5% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.1 | 14 / 35 | 4208 |
| 2 | 1 | 68.7 | 86.0 | 17 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 19 | 79% |
| zyx.mega.YersiniaPestis 3.1 | 14 | 64% |
| myl.micro.Troodon 1.10 | 6 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 17 | 44% | 33 |
| zyx.mega.YersiniaPestis 3.1 | 9 | 23% | 17 |
| myl.micro.Troodon 1.10 | 6 | 15% | 11 |
| jok.PheonixM 0.1.2 | 4 | 10% | 4 |
| ph.melee.ArcherME 0.3 | 2 | 5% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 3% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 2 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.7 | 18 / 70 | 3.46 | 14.4% | 7149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 2.0 | 14.4% | 18 |
| catcat20.Matcha 0.006 | 2.0 | 14.6% | 18 |
| oog.melee.Capulet 1.2 | 2.0 | 14.0% | 13 |
| darkcanuck.B26354 1.06 | 4.0 | 12.9% | 15 |
| stelo.PastFuture 2.3.2 | 5.0 | 12.0% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 6.0 | 8.4% | 1 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.7% | 1 |
| ntc.Opposite 1.5 | 8.5 | 6.4% | 0 |
| tripphippy.Alice 1.1 | 8.5 | 7.0% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 76.5 | 13 / 35 | 3792 |
| 2 | 3 | 59.7 | 68.9 | 5 / 35 | 3357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 12 | 67% |
| darkcanuck.B26354 1.06 | 12 | 50% |
| oog.melee.Capulet 1.2 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 52 of 70 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 16 | 31% | 25 |
| stelo.PastFuture 2.3.2 | 11 | 21% | 11 |
| darkcanuck.B26354 1.06 | 10 | 19% | 14 |
| oog.melee.Capulet 1.2 | 10 | 19% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 2 | 4% | 4 |
| tripphippy.Alice 1.1 | 1 | 2% | 2 |
| ntc.Opposite 1.5 | 1 | 2% | 1 |
| intruder.PrairieWolf 2.61 | 1 | 2% | 1 |

## Melee bench: F31

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 69.2 | 20 / 70 | 3.77 | 13.7% | 6169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 33 |
| hadur117.mini.DeiseLEARNH 0.4 | 2.5 | 13.7% | 20 |
| gh.mini.Griezel 0.2 | 2.5 | 13.7% | 14 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.7% | 4 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.7% | 1 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 0 |
| fm.mammillarias 1.3 | 7.5 | 6.7% | 0 |
| timmit.nano.TimDog 0.33 | 7.5 | 5.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 72.7 | 10 / 35 | 3104 |
| 2 | 3 | 59.5 | 65.7 | 10 / 35 | 3065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 12 | 58% |
| gh.mini.Griezel 0.2 | 9 | 89% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| spinnercat.micro.Tyger 0.1 | 2 | 100% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |

Hadur died in 51 of 70 rounds, at a mean tick of 655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 15 | 29% | 23 |
| spinnercat.micro.Tyger 0.1 | 9 | 18% | 10 |
| d414.nano.Quantum 1.0.0 | 9 | 18% | 9 |
| gh.mini.Griezel 0.2 | 8 | 16% | 15 |
| fm.mammillarias 1.3 | 5 | 10% | 5 |
| gh.nano.Grofvuil 0.2 | 3 | 6% | 7 |
| timmit.nano.TimDog 0.33 | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 95.1 | 51 / 70 | 1.44 | 20.2% | 10233 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.2% | 51 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.7% | 18 |
| lxx.ConceptA 0.8 | 3.5 | 11.5% | 0 |
| apc.botM 3.0 | 3.5 | 11.7% | 1 |
| bayen.UbaMicro 1.4 | 6.0 | 8.3% | 0 |
| panzer.Panzer 0.2 | 6.0 | 7.6% | 0 |
| vjik.UnViolation 1.1 | 6.0 | 7.9% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.0 | 5.8% | 0 |
| conscience.Electron 1.3g | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.9 | 24 / 35 | 5058 |
| 2 | 1 | 70.5 | 95.2 | 27 / 35 | 5175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 34 | 62% |
| lxx.ConceptA 0.8 | 11 | 100% |
| apc.botM 3.0 | 9 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| vjik.UnViolation 1.1 | 2 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 20 of 70 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 15 | 75% | 37 |
| lxx.ConceptA 0.8 | 3 | 15% | 7 |
| apc.botM 3.0 | 2 | 10% | 14 |
| bayen.UbaMicro 1.4 | 0 | 0% | 4 |
| vjik.UnViolation 1.1 | 0 | 0% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |
| panzer.Panzer 0.2 | 0 | 0% | 1 |
| yk.JahMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.0 | 48 / 70 | 1.99 | 19.4% | 9702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.4% | 48 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 10 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.2% | 4 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.5% | 2 |
| labg.Cataclysm 2.05 | 4.5 | 10.9% | 5 |
| baal.nano.N 1.42 | 6.0 | 7.9% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 7.7% | 1 |
| zyx.micro.Ant 1.1 | 8.0 | 5.4% | 0 |
| sanja.First 0.1 | 9.0 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.0 | 25 / 35 | 4988 |
| 2 | 1 | 68.7 | 85.1 | 23 / 35 | 4714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 20 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 88% |
| gre.svman4.Leonidas 1.3.2 | 10 | 100% |
| labg.Cataclysm 2.05 | 9 | 78% |

Hadur died in 22 of 70 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 7 | 32% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 6 | 27% | 20 |
| labg.Cataclysm 2.05 | 3 | 14% | 9 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 14% | 3 |
| gre.svman4.Leonidas 1.3.2 | 1 | 5% | 10 |
| baal.nano.N 1.42 | 1 | 5% | 1 |
| zyx.micro.Ant 1.1 | 1 | 5% | 1 |

## Melee bench: F34

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.2 | 28 / 70 | 2.33 | 17.8% | 9839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.5 | 17.8% | 28 |
| stelo.Spread 0.9 | 1.5 | 17.9% | 26 |
| kid.Gladiator .7.2 | 3.0 | 16.3% | 11 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 4 |
| tcf.Reach 3 | 4.5 | 10.2% | 0 |
| cli.Dancer 1.1 | 6.0 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.6% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 1 |
| sample.RamFire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 14 / 35 | 4873 |
| 2 | 2 | 68.8 | 86.7 | 14 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 28 | 61% |
| kid.Gladiator .7.2 | 13 | 62% |
| jcs.Seth 1.8 | 3 | 33% |
| ratosh.Wesco 1.4 | 1 | 100% |
| tcf.Reach 3 | 1 | 100% |

Hadur died in 42 of 70 rounds, at a mean tick of 1128. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 22 | 52% | 37 |
| kid.Gladiator .7.2 | 14 | 33% | 23 |
| jcs.Seth 1.8 | 4 | 10% | 6 |
| tcf.Reach 3 | 1 | 2% | 2 |
| ratosh.Wesco 1.4 | 1 | 2% | 2 |

## Melee bench: F35

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.5 | 10 / 70 | 2.84 | 15.0% | 6799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 49 |
| hadur117.mini.DeiseLEARNH 0.4 | 2.0 | 15.0% | 10 |
| gh.mini.Gruwel 0.9 | 3.0 | 14.1% | 10 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.4% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.0 | 6.9% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.5 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 8.5 | 5.2% | 0 |
| stelo.MyAgileRobot 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 78.7 | 4 / 35 | 3372 |
| 2 | 2 | 64.0 | 80.3 | 6 / 35 | 3427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 34 | 21% |
| gh.mini.Gruwel 0.9 | 5 | 20% |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 100% |

Hadur died in 60 of 70 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 38 | 63% | 43 |
| gh.mini.Gruwel 0.9 | 15 | 25% | 16 |
| rz.HawkOnFire 0.1 | 4 | 7% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 3% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 2% | 1 |

## Melee bench: F36

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 2 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.2 | 54 / 70 | 1.61 | 21.2% | 11663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 21.2% | 54 |
| bzdp.Pansy 2.1 | 2.5 | 11.9% | 1 |
| alpha.RainingFire 1.0 | 3.0 | 12.4% | 6 |
| bvh.micro.Freya 0.3 | 3.5 | 11.0% | 5 |
| bvh.mini.Fenrir 0.39 | 5.5 | 9.8% | 0 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.2% | 1 |
| mz.Cork 0.1 | 6.5 | 8.6% | 0 |
| dl.BetterWalls 1.0 | 8.0 | 6.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.0% | 2 |
| squidM.TentalceMeleeNano 1.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.2 | 28 / 35 | 5671 |
| 2 | 1 | 71.2 | 91.1 | 26 / 35 | 5992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 16 | 69% |
| bzdp.Pansy 2.1 | 12 | 100% |
| bvh.micro.Freya 0.3 | 10 | 80% |
| bvh.mini.Fenrir 0.39 | 9 | 100% |
| mz.Cork 0.1 | 5 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| dl.BetterWalls 1.0 | 3 | 100% |
| m3thos.Eva02 0.7.1 | 3 | 100% |

Hadur died in 16 of 70 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 6 | 38% | 15 |
| bvh.micro.Freya 0.3 | 4 | 25% | 4 |
| bzdp.Pansy 2.1 | 2 | 13% | 18 |
| bvh.mini.Fenrir 0.39 | 1 | 6% | 8 |
| m3thos.Eva02 0.7.1 | 1 | 6% | 7 |
| sample.MyFirstRobot 1.0 | 1 | 6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 6% | 1 |
| mz.Cork 0.1 | 0 | 0% | 11 |
| dl.BetterWalls 1.0 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.6 | 53 / 70 | 1.84 | 19.4% | 10858 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.4% | 53 |
| germ.TheMind .2 | 2.5 | 10.4% | 4 |
| EBBU.Sim2 1.02 | 3.5 | 10.2% | 2 |
| agrach.Dalek 1.0 | 5.0 | 9.7% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5.0 | 10.0% | 4 |
| lmk.ACPFinal 0.1 | 5.5 | 8.9% | 2 |
| stelo.UntouchableNano 1.3 | 6.0 | 9.2% | 0 |
| skm.Ryubot 1.0 | 7.5 | 7.7% | 0 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 7.1% | 0 |
| mb.Beast 0.1 | 9.5 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 91.4 | 26 / 35 | 5157 |
| 2 | 1 | 69.1 | 89.8 | 27 / 35 | 5701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 11 | 100% |
| stelo.UntouchableNano 1.3 | 10 | 100% |
| EBBU.Sim2 1.02 | 8 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 75% |
| lmk.ACPFinal 0.1 | 7 | 86% |
| agrach.Dalek 1.0 | 6 | 83% |
| mb.Beast 0.1 | 4 | 100% |
| skm.Ryubot 1.0 | 3 | 100% |

Hadur died in 17 of 70 rounds, at a mean tick of 462. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 5 | 29% | 10 |
| germ.TheMind .2 | 3 | 18% | 10 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 18% | 10 |
| stelo.UntouchableNano 1.3 | 2 | 12% | 10 |
| EBBU.Sim2 1.02 | 2 | 12% | 10 |
| agrach.Dalek 1.0 | 1 | 6% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 6% | 1 |
| mb.Beast 0.1 | 0 | 0% | 4 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |

## Melee bench: F38

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.3 | 35 / 70 | 2.23 | 17.5% | 8454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 17.5% | 35 |
| justin.Mallais 14.0 | 2.0 | 17.2% | 25 |
| bvh.mini.Freya 0.55 | 3.5 | 12.3% | 2 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.6% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.4% | 1 |
| cs.Wren 1.0 | 5.5 | 10.1% | 2 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.2% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.4% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.0 | 17 / 35 | 4347 |
| 2 | 1 | 67.2 | 86.7 | 18 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 21 | 67% |
| bts.mega.Gnarly 1.4 | 8 | 75% |
| cs.Wren 1.0 | 5 | 100% |
| bvh.mini.Freya 0.55 | 5 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 14 | 40% | 28 |
| bts.mega.Gnarly 1.4 | 9 | 26% | 13 |
| bvh.mini.Freya 0.55 | 4 | 11% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 11% | 9 |
| cs.Wren 1.0 | 4 | 11% | 8 |
| kdf.KoulDestroyer 1.0 | 0 | 0% | 2 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.3 | 39 / 70 | 2.14 | 18.3% | 9431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.3% | 39 |
| az.Ololobot 0.2.4 | 2.5 | 13.5% | 17 |
| bvh.fry.Freya 0.82 | 2.5 | 15.1% | 10 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 2 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 8.6% | 1 |
| gimp.GimpBot 0.1 | 6.0 | 8.2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.5 | 7.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.5 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.3 | 23 / 35 | 4562 |
| 2 | 1 | 67.4 | 86.3 | 16 / 35 | 4869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 20 | 70% |
| az.Ololobot 0.2.4 | 13 | 69% |
| catcat20.Lambda 0.024 | 9 | 100% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 31 of 70 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 17 | 55% | 32 |
| az.Ololobot 0.2.4 | 5 | 16% | 15 |
| gimp.GimpBot 0.1 | 3 | 10% | 7 |
| catcat20.Lambda 0.024 | 3 | 10% | 6 |
| stelo.SoRobotNanoMelee 1.2 | 1 | 3% | 4 |
| apollokidd.ApolloKidd 0.9 | 1 | 3% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 3% | 1 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.9 | 46 / 70 | 1.73 | 20.0% | 10358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 20.0% | 46 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 10 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.0% | 4 |
| Polkwane.SmashMelee 1.0 | 4.0 | 11.7% | 5 |
| mz.AntiGrav 1.0 | 5.5 | 9.5% | 0 |
| stelo.Randomness 1.0 | 5.5 | 9.6% | 5 |
| alpha.BlackIce 1.0 | 7.0 | 8.1% | 0 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.0% | 0 |
| sample.Corners 1.0 | 9.5 | 3.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 22 / 35 | 5343 |
| 2 | 1 | 70.7 | 94.0 | 24 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 24 | 71% |
| kano.gamma.KanoGamma 1.8 | 15 | 87% |
| Polkwane.SmashMelee 1.0 | 13 | 77% |
| stelo.Randomness 1.0 | 5 | 60% |
| mz.AntiGrav 1.0 | 2 | 100% |
| alpha.BlackIce 1.0 | 1 | 100% |

Hadur died in 25 of 70 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 9 | 36% | 21 |
| Polkwane.SmashMelee 1.0 | 7 | 28% | 11 |
| kano.gamma.KanoGamma 1.8 | 5 | 20% | 23 |
| stelo.Randomness 1.0 | 2 | 8% | 8 |
| mz.AntiGrav 1.0 | 1 | 4% | 4 |
| amk.superstrike.SuperStrike 0.3 | 1 | 4% | 2 |
| alpha.BlackIce 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.9 | 40 / 70 | 2.27 | 17.7% | 8149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 17.7% | 40 |
| eem.EvBotNG v12.8 | 2.0 | 14.7% | 16 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 2 |
| simonton.nano.MeleeSeed 1.8 | 4.0 | 12.2% | 7 |
| lessonz.robocode.Oz 0.5.0 | 4.5 | 12.5% | 4 |
| shrub.Silver v048 | 6.0 | 8.6% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 88.3 | 23 / 35 | 4103 |
| 2 | 1 | 66.4 | 83.5 | 17 / 35 | 4046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 22 | 68% |
| lessonz.robocode.Oz 0.5.0 | 12 | 100% |
| ary.Swarm 1.1 | 10 | 100% |
| simonton.nano.MeleeSeed 1.8 | 3 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |

Hadur died in 30 of 70 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 14 | 47% | 32 |
| ary.Swarm 1.1 | 10 | 33% | 18 |
| lessonz.robocode.Oz 0.5.0 | 2 | 7% | 7 |
| simonton.nano.MeleeSeed 1.8 | 1 | 3% | 7 |
| shrub.Silver v048 | 1 | 3% | 2 |
| stelo.Mirror 1.1 | 1 | 3% | 2 |
| jsal.Jsalbot 1.0 | 1 | 3% | 1 |

## Melee bench: F42

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 91.3 | 40 / 70 | 1.79 | 19.1% | 10047 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.1% | 40 |
| wompi.Wallaby 5.1 | 2.0 | 16.0% | 21 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.7% | 3 |
| ara.Shera 0.88 | 4.0 | 12.5% | 6 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 0 |
| maribo.IotaCT 1.1 | 6.5 | 7.2% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.5% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.2 | 18 / 35 | 4711 |
| 2 | 1 | 69.8 | 92.4 | 22 / 35 | 5336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 25 | 60% |
| ara.Shera 0.88 | 15 | 80% |
| maribo.mini.MiniQuester 0.1 | 14 | 86% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 31 of 70 rounds, at a mean tick of 1066. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 15 | 48% | 35 |
| maribo.mini.MiniQuester 0.1 | 8 | 26% | 17 |
| ara.Shera 0.88 | 8 | 26% | 17 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.2 | 12 / 70 | 2.87 | 15.4% | 7998 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 51 |
| hadur117.mini.DeiseLEARNH 0.4 | 2.0 | 15.4% | 12 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 5 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 1 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.6% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.5 | 8.7% | 0 |
| jab.DiamondStealer 5 | 7.0 | 8.4% | 0 |
| mz.NanoGod 2.02 | 7.5 | 6.7% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 80.3 | 6 / 35 | 3838 |
| 2 | 2 | 65.2 | 78.1 | 6 / 35 | 4160 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 35 | 23% |
| brainfade.melee.Dusk 0.44 | 6 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 58 of 70 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 37 | 64% | 44 |
| brainfade.melee.Dusk 0.44 | 9 | 16% | 12 |
| dummy.micro.Sparrow 2.5 | 7 | 12% | 7 |
| Krabb.akim2.Akim2 1.1b | 2 | 3% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 2 | 3% | 3 |
| mz.NanoGod 2.02 | 1 | 2% | 1 |

## Melee bench: F44

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.2 | 35 / 70 | 2.24 | 18.6% | 10163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 18.6% | 35 |
| stelo.Liblix 0.3.1 | 2.5 | 16.4% | 19 |
| tzu.TheArtOfWar 1.2 | 2.5 | 15.5% | 16 |
| wompi.Quokka 1.6 | 4.0 | 10.2% | 0 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.1% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.6% | 0 |
| jwirde.Gort 2.0 | 6.5 | 7.8% | 0 |
| stf.PanzerGeneral 0.1 | 8.5 | 5.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 8.5 | 5.2% | 0 |
| sample.Crazy 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.0 | 19 / 35 | 5170 |
| 2 | 1 | 68.3 | 86.3 | 16 / 35 | 4993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 32 | 78% |
| tzu.TheArtOfWar 1.2 | 11 | 64% |
| wompi.Quokka 1.6 | 3 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 13 | 37% | 39 |
| tzu.TheArtOfWar 1.2 | 12 | 34% | 19 |
| wompi.Quokka 1.6 | 4 | 11% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 9% | 4 |
| disan.Chair 2.2.0 | 1 | 3% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 3% | 1 |
| amk.jointstrike.JointStrike 0.2 | 1 | 3% | 1 |

## Melee bench: F45

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 65 over 2 battles (32.5 per battle, most in one battle 40). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.8 | 18 / 70 | 2.19 | 19.6% | 12600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.0 | 19.6% | 18 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 14.5% | 48 |
| jje.BagPuss 1.2 | 3.0 | 11.6% | 2 |
| myl.nano.Graviton 1.10 | 5.0 | 9.8% | 2 |
| sul.Lunar 1.1 | 5.0 | 9.9% | 0 |
| hvilela.HVilela 0.9 | 5.5 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.6% | 0 |
| fm.claire 1.7 | 8.0 | 7.8% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.1% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.0 | 11 / 35 | 6338 |
| 2 | 1 | 69.7 | 87.6 | 7 / 35 | 6262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 51 | 16% |
| sul.Lunar 1.1 | 3 | 100% |
| jje.BagPuss 1.2 | 3 | 100% |
| myl.nano.Graviton 1.10 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 1 | 100% |

Hadur died in 52 of 70 rounds, at a mean tick of 2655. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 43 | 83% | 0 |
| jje.BagPuss 1.2 | 4 | 8% | 25 |
| fm.claire 1.7 | 2 | 4% | 5 |
| hvilela.HVilela 0.9 | 2 | 4% | 5 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 2% | 7 |
| sul.Lunar 1.1 | 0 | 0% | 15 |
| myl.nano.Graviton 1.10 | 0 | 0% | 8 |
| wit.Deep7 2.0 | 0 | 0% | 3 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

## Melee bench: F46

hadur117.mini.DeiseLEARNH 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 87.0 | 29 / 70 | 2.17 | 17.2% | 8314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARNH 0.4 | 1.5 | 17.2% | 29 |
| kc.mini.Mirage 0.2 | 1.5 | 17.5% | 23 |
| rsalesc.melee.Medina 0.4.5 | 3.0 | 14.9% | 15 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 1 |
| cx.Princess 1.0 | 5.0 | 9.2% | 2 |
| sadoner.killer 0.2 | 5.5 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.9% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.9 | 17 / 35 | 4118 |
| 2 | 2 | 66.4 | 86.0 | 12 / 35 | 4196 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 23 | 48% |
| rsalesc.melee.Medina 0.4.5 | 19 | 74% |
| cx.Princess 1.0 | 3 | 33% |
| mz.MicroSheep 1.0 | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 41 of 70 rounds, at a mean tick of 1000. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 24 | 59% | 34 |
| rsalesc.melee.Medina 0.4.5 | 11 | 27% | 26 |
| mz.MicroSheep 1.0 | 2 | 5% | 4 |
| cx.Princess 1.0 | 2 | 5% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 2% | 2 |
| sadoner.killer 0.2 | 1 | 2% | 1 |
| arthord.NanoSatanMelee Beta | 0 | 0% | 1 |

