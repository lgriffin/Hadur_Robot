# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 85.9 | 14 / 70 | 2.27 | 16.8% | 9703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 50 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 16.8% | 14 |
| mz.MicroGodMelee 1 | 3.5 | 11.0% | 0 |
| sgp.JollyNinja 3.53 | 4.0 | 11.4% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 1 |
| lorneswork.Predator 1.0 | 6.0 | 9.1% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.5 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 86.3 | 6 / 35 | 4930 |
| 2 | 2 | 66.4 | 85.4 | 8 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 48 | 15% |
| sgp.JollyNinja 3.53 | 4 | 50% |
| mz.MicroGodMelee 1 | 3 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |

Hadur died in 56 of 70 rounds, at a mean tick of 1365. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 44 | 79% | 52 |
| sgp.JollyNinja 3.53 | 6 | 11% | 8 |
| mz.MicroGodMelee 1 | 3 | 5% | 6 |
| lorneswork.Predator 1.0 | 2 | 4% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 88.7 | 44 / 70 | 2.01 | 19.2% | 9983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.2% | 44 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.0 | 14.4% | 7 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 13.9% | 11 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.4% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 9.5% | 1 |
| Noran.BitchingElk 0.054 | 6.0 | 8.6% | 4 |
| sch.Simone 0.3d | 7.0 | 7.5% | 1 |
| fnc.bandit.Bandit 5.2.0 | 8.0 | 5.7% | 0 |
| stelo.PatternRobot 1.0 | 8.5 | 5.3% | 0 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 21 / 35 | 5273 |
| 2 | 1 | 68.6 | 86.7 | 23 / 35 | 4710 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 86% |
| pulsar.PulsarMax 0.8.9 | 13 | 62% |
| Noran.BitchingElk 0.054 | 6 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 100% |
| sch.Simone 0.3d | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| stelo.PatternRobot 1.0 | 1 | 100% |

Hadur died in 26 of 70 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 11 | 42% | 21 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 5 | 19% | 22 |
| com.cohesiva.robocode.ManOwaR 1.0 | 2 | 8% | 7 |
| lrem.micro.SpikeSoldier 0.4 | 2 | 8% | 4 |
| sch.Simone 0.3d | 2 | 8% | 3 |
| fullsail.SweetTea 1.1 | 2 | 8% | 2 |
| fnc.bandit.Bandit 5.2.0 | 1 | 4% | 2 |
| stelo.PatternRobot 1.0 | 1 | 4% | 1 |
| Noran.BitchingElk 0.054 | 0 | 0% | 8 |

## Melee bench: F03

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 2 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.5 | 51 / 70 | 1.67 | 20.4% | 12440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 20.4% | 51 |
| vuen.Cake 2.51 | 2.5 | 13.4% | 9 |
| radnor.DoctorBob 1.42 | 3.0 | 13.9% | 7 |
| kawigi.nano.Lib 1.0 | 3.5 | 13.2% | 3 |
| urdos.URDOS 1.3 | 5.0 | 8.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.5 | 6.9% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 8.5 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.3 | 27 / 35 | 6263 |
| 2 | 1 | 70.2 | 90.8 | 24 / 35 | 6177 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 23 | 83% |
| kawigi.nano.Lib 1.0 | 18 | 100% |
| radnor.DoctorBob 1.42 | 14 | 86% |
| urdos.URDOS 1.3 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 20 of 70 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 10 | 50% | 28 |
| radnor.DoctorBob 1.42 | 5 | 25% | 16 |
| kawigi.nano.Lib 1.0 | 3 | 15% | 20 |
| adt.Ar1 2.1 | 2 | 10% | 2 |
| urdos.URDOS 1.3 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.7 | 10 / 70 | 2.20 | 17.2% | 10631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 60 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 17.2% | 10 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.4% | 0 |
| TNT.TNT 0.99.1 | 4.0 | 10.0% | 0 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 3.7% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 89.5 | 6 / 35 | 5461 |
| 2 | 2 | 66.9 | 83.8 | 4 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 59 | 15% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |

Hadur died in 60 of 70 rounds, at a mean tick of 1601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 56 | 93% | 65 |
| josago.Jorgito 0.16 | 2 | 3% | 2 |
| css.Delitioner 0.11 | 1 | 2% | 1 |
| tj.zombie1n 1.0.1 | 1 | 2% | 1 |
| apc.LeeroyJenkins2 1.0 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 76.7 | 7 / 70 | 3.10 | 14.4% | 7112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.3% | 39 |
| justin.DemonicRage 3.4 | 2.0 | 16.3% | 14 |
| hadur117.mini.DeiseLEARN 0.4 | 3.0 | 14.4% | 7 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 6 |
| ms.Ares 0.19 | 5.5 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.5% | 2 |
| supersample.SuperBoxBot 1.0 | 7.0 | 7.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.0% | 0 |
| GarmBox.Oranges 1.0 | 9.0 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 80.3 | 5 / 35 | 3672 |
| 2 | 3 | 61.5 | 73.0 | 2 / 35 | 3440 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 22 | 0% |
| justin.DemonicRage 3.4 | 8 | 88% |
| ms.Ares 0.19 | 2 | 0% |
| wompi.Numbat 2.1 | 1 | 0% |

Hadur died in 64 of 70 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 35 | 55% | 36 |
| justin.DemonicRage 3.4 | 14 | 22% | 18 |
| wompi.Numbat 2.1 | 7 | 11% | 7 |
| ms.Ares 0.19 | 4 | 6% | 4 |
| GarmBox.Oranges 1.0 | 2 | 3% | 2 |
| axeBots.HataMoto 3.09 | 1 | 2% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 2% | 1 |

## Melee bench: F06

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.0 | 36 / 70 | 2.26 | 18.2% | 9550 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.2% | 36 |
| origin.SleepSiphon 1.7b | 2.0 | 15.1% | 14 |
| jekl.StoneGhost 0.7 | 3.0 | 14.6% | 8 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.8% | 9 |
| mld.Wisdom 1.0 | 5.0 | 9.8% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 5.9% | 0 |
| DBall.NUKE 0.1 | 8.0 | 6.1% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 6.3% | 1 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.1 | 18 / 35 | 4739 |
| 2 | 1 | 68.3 | 87.0 | 18 / 35 | 4811 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 71% |
| pe.minimelee.SandboxMiniMelee 1.1 | 10 | 60% |
| jekl.StoneGhost 0.7 | 10 | 90% |
| gg.Wolverine 2.0 | 1 | 100% |

Hadur died in 34 of 70 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 12 | 35% | 32 |
| pe.minimelee.SandboxMiniMelee 1.1 | 11 | 32% | 17 |
| jekl.StoneGhost 0.7 | 6 | 18% | 14 |
| gg.Wolverine 2.0 | 2 | 6% | 3 |
| mld.Wisdom 1.0 | 2 | 6% | 2 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 3% | 1 |

## Melee bench: F07

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.5 | 43 / 70 | 1.67 | 19.5% | 10400 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.5% | 43 |
| rtk.Tachikoma 1.0 | 2.0 | 17.8% | 11 |
| rsalesc.melee.Monk 0.3.6c | 3.0 | 15.3% | 7 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.3% | 0 |
| franzor.Lizt 1.3.1 | 4.5 | 11.4% | 9 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.0% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.3% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 21 / 35 | 5133 |
| 2 | 1 | 70.8 | 92.4 | 22 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 40 | 90% |
| franzor.Lizt 1.3.1 | 11 | 36% |
| rsalesc.melee.Monk 0.3.6c | 5 | 0% |
| oog.melee.CapuletDroid 1.1 | 3 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 1580. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 10 | 37% | 44 |
| rsalesc.melee.Monk 0.3.6c | 9 | 33% | 15 |
| franzor.Lizt 1.3.1 | 7 | 26% | 0 |
| exauge.GateKeeper 1.1.121g | 1 | 4% | 3 |
| oog.melee.CapuletDroid 1.1 | 0 | 0% | 8 |

## Melee bench: F08

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 29 over 2 battles (14.5 per battle, most in one battle 18). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.7 | 45 / 70 | 1.66 | 19.6% | 9678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.6% | 45 |
| shrub.Vapour v159 | 2.0 | 13.7% | 13 |
| tm.Yuugao 1.0 | 3.5 | 12.8% | 9 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.6% | 3 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 9.7% | 1 |
| m3thos.Eva00 1.1 | 6.0 | 8.0% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.1% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.3% | 0 |
| SHAM.WOW 1.4 | 8.5 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 10.0 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 92.1 | 22 / 35 | 4747 |
| 2 | 1 | 69.9 | 93.3 | 23 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 23 | 83% |
| shrub.Vapour v159 | 17 | 47% |
| Krabb.sliNk.Garm 0.9u | 8 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 6 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 1072. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 13 | 48% | 20 |
| tm.Yuugao 1.0 | 5 | 19% | 28 |
| Krabb.sliNk.Garm 0.9u | 2 | 7% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 7% | 4 |
| com.spp.robocode.MostlyHarmless 010 | 1 | 4% | 7 |
| m3thos.Eva00 1.1 | 1 | 4% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 4% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.2 | 24 / 70 | 2.87 | 16.1% | 7908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 29 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 16.1% | 24 |
| kc.micro.Figment 1.0 | 3.0 | 13.9% | 7 |
| yagami.Tidus 0.11 | 4.0 | 11.2% | 1 |
| mc2.enemy.Original 0.9 | 5.0 | 9.5% | 5 |
| dft.Calliope 5.6 | 6.5 | 8.3% | 1 |
| pedersen.Grishnakh 1.0 | 6.5 | 8.6% | 3 |
| step.nanoPri 1.0 | 8.0 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 4.6% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 81.6 | 13 / 35 | 3888 |
| 2 | 2 | 64.5 | 76.8 | 11 / 35 | 4020 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 24 | 54% |
| kc.micro.Figment 1.0 | 9 | 78% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 1 | 100% |
| mc2.enemy.Original 0.9 | 1 | 100% |
| yagami.Tidus 0.11 | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 849. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 23 | 50% | 37 |
| yagami.Tidus 0.11 | 7 | 15% | 9 |
| kc.micro.Figment 1.0 | 6 | 13% | 12 |
| pedersen.Grishnakh 1.0 | 4 | 9% | 4 |
| mc2.enemy.Original 0.9 | 3 | 7% | 4 |
| robar.nano.Assertive_Melee 0.2 | 2 | 4% | 2 |
| dft.Calliope 5.6 | 1 | 2% | 1 |
| step.nanoPri 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 96.3 | 56 / 70 | 1.33 | 20.7% | 11035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 20.7% | 56 |
| DTF.Kludgy 1.2b | 2.0 | 15.4% | 7 |
| ejb.Polaris 1.0.1 | 3.5 | 12.1% | 2 |
| ne.Chimera 1.2 | 3.5 | 12.6% | 2 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.0% | 2 |
| vStar.RAFzilla 2.15 | 6.0 | 9.7% | 0 |
| kurios.DOSexe .9b | 7.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.1% | 1 |
| sam.Samspin 1.0 | 9.0 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 96.5 | 28 / 35 | 5479 |
| 2 | 1 | 71.3 | 96.2 | 28 / 35 | 5556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 28 | 86% |
| ejb.Polaris 1.0.1 | 14 | 100% |
| ne.Chimera 1.2 | 9 | 78% |
| tvv.micro.Antares 1.1.1 | 7 | 71% |
| vStar.RAFzilla 2.15 | 5 | 100% |
| kurios.DOSexe .9b | 1 | 100% |

Hadur died in 14 of 70 rounds, at a mean tick of 1077. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 7 | 50% | 27 |
| ne.Chimera 1.2 | 4 | 29% | 15 |
| tvv.micro.Antares 1.1.1 | 2 | 14% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 7% | 1 |
| ejb.Polaris 1.0.1 | 0 | 0% | 12 |
| kurios.DOSexe .9b | 0 | 0% | 4 |
| vStar.RAFzilla 2.15 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 78.3 | 24 / 70 | 2.96 | 16.0% | 8170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 16.6% | 20 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 16.0% | 24 |
| cx.mini.Nimrod 0.55 | 3.0 | 14.2% | 13 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 6 |
| br2.MobyDickBot 1.6 | 5.5 | 8.8% | 2 |
| rdt199.Warlord 0.73 | 6.0 | 8.7% | 4 |
| uji.YellohFellah 1.0 | 7.0 | 7.2% | 1 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.3% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 82.2 | 13 / 35 | 4293 |
| 2 | 2 | 63.0 | 74.3 | 11 / 35 | 3877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 19 | 58% |
| djc.DynaBot 0.1.1 | 7 | 71% |
| rdt199.Warlord 0.73 | 5 | 80% |
| cx.mini.Nimrod 0.55 | 3 | 67% |
| br2.MobyDickBot 1.6 | 2 | 50% |
| uji.YellohFellah 1.0 | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 20 | 43% | 31 |
| cx.mini.Nimrod 0.55 | 12 | 26% | 15 |
| rdt199.Warlord 0.73 | 4 | 9% | 7 |
| djc.DynaBot 0.1.1 | 3 | 7% | 6 |
| br2.MobyDickBot 1.6 | 2 | 4% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 4% | 3 |
| uji.YellohFellah 1.0 | 1 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 2% | 1 |
| KiraNL.Chupacabra 0.4 | 1 | 2% | 1 |

## Melee bench: F12

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.0 | 42 / 70 | 2.26 | 17.8% | 7541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 17.8% | 42 |
| nat.PallasHawk 1.0 | 2.5 | 14.8% | 14 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.3% | 10 |
| darkcanuck.Leon 1.01 | 4.5 | 11.9% | 1 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.5% | 2 |
| jrm.Test0 1.0 | 5.5 | 8.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.2% | 0 |
| stuff.Vlad 0.1 | 8.5 | 5.5% | 1 |
| jp.Perpy 16.0 | 8.5 | 6.1% | 0 |
| jaybot.bots.Oddball 4.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.8 | 22 / 35 | 4069 |
| 2 | 1 | 65.7 | 81.3 | 20 / 35 | 3472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 26 | 85% |
| nat.PallasHawk 1.0 | 19 | 74% |
| darkcanuck.Leon 1.01 | 4 | 75% |
| brainfade.melee.Genghis 0.36 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 638. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 8 | 29% | 26 |
| darkcanuck.Leon 1.01 | 5 | 18% | 17 |
| nat.PallasHawk 1.0 | 5 | 18% | 13 |
| brainfade.melee.Genghis 0.36 | 4 | 14% | 6 |
| jrm.Test0 1.0 | 2 | 7% | 3 |
| cs.sheldor.Talon 1.1 | 2 | 7% | 2 |
| stuff.Vlad 0.1 | 1 | 4% | 1 |
| jp.Perpy 16.0 | 1 | 4% | 1 |

## Melee bench: F13

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.6 | 26 / 70 | 2.39 | 16.7% | 8399 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 18.1% | 33 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 16.7% | 26 |
| ags.Glacier 0.2.11 | 3.0 | 15.6% | 9 |
| shinh.Entangled 0.3 | 4.0 | 11.7% | 2 |
| gh.micro.Gruweltje 0.7 | 5.0 | 10.5% | 0 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.0 | 7.0% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 83.5 | 11 / 35 | 4038 |
| 2 | 2 | 67.1 | 85.7 | 15 / 35 | 4361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 34 | 44% |
| ags.Glacier 0.2.11 | 9 | 89% |
| shinh.Entangled 0.3 | 2 | 50% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |

Hadur died in 44 of 70 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 24 | 55% | 39 |
| ags.Glacier 0.2.11 | 9 | 20% | 15 |
| shinh.Entangled 0.3 | 6 | 14% | 8 |
| gh.micro.Gruweltje 0.7 | 2 | 5% | 5 |
| stelo.Wang 1.0 | 2 | 5% | 2 |
| apc.Colossus2 0.17 | 1 | 2% | 1 |

## Melee bench: F14

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.4 | 47 / 70 | 1.69 | 19.7% | 10448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.7% | 47 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.8% | 13 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.9% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 9.6% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.5 | 8.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 7.5 | 7.7% | 0 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 92.1 | 23 / 35 | 4973 |
| 2 | 1 | 70.5 | 92.7 | 24 / 35 | 5475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 29 | 83% |
| catcat20.shape.Theta 0.018 | 23 | 74% |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 1 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 11 | 48% | 34 |
| catcat20.shape.Theta 0.018 | 6 | 26% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 9% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 9% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 4% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.4 | 28 / 70 | 2.67 | 17.1% | 9357 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 17.1% | 28 |
| kawigi.micro.Shiz 1.1 | 2.0 | 15.1% | 10 |
| emp.Yngwie 1.11 | 3.0 | 13.5% | 19 |
| cb.nano.Insomnia 1.0 | 4.5 | 12.3% | 4 |
| mld.DustBunny 3.8 | 5.0 | 11.9% | 3 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.6% | 6 |
| lambdaxy.TBot 0.1 | 7.0 | 6.6% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 4.8% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 17 / 35 | 4748 |
| 2 | 1 | 64.9 | 75.9 | 11 / 35 | 4609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 15 | 67% |
| kawigi.micro.Shiz 1.1 | 7 | 86% |
| kawigi.robot.Girl 1.2 | 6 | 83% |
| cb.nano.Insomnia 1.0 | 5 | 100% |
| mld.DustBunny 3.8 | 3 | 67% |

Hadur died in 42 of 70 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 12 | 29% | 23 |
| kawigi.micro.Shiz 1.1 | 9 | 21% | 16 |
| cb.nano.Insomnia 1.0 | 8 | 19% | 10 |
| mld.DustBunny 3.8 | 7 | 17% | 12 |
| kawigi.robot.Girl 1.2 | 6 | 14% | 9 |

## Melee bench: F16

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.4 | 32 / 70 | 2.31 | 18.5% | 10653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.5% | 32 |
| gh.Griezel 0.5.2 | 2.0 | 16.8% | 20 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.9% | 5 |
| tvv.nano.Polaris 1.2 | 4.5 | 9.9% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.6% | 11 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 8.7% | 0 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.2% | 0 |
| asd.Cthulhu 1.3 | 8.0 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.3% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.5 | 12 / 35 | 5199 |
| 2 | 1 | 69.8 | 87.3 | 20 / 35 | 5454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 29 | 69% |
| techdude.forest.FlamingForest 1.1 | 11 | 55% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 4 | 75% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 0% |
| bvh.fnr.Fenrir 0.36l | 1 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 1311. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 20 | 51% | 40 |
| techdude.forest.FlamingForest 1.1 | 7 | 18% | 13 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 6 | 15% | 10 |
| tvv.nano.Polaris 1.2 | 2 | 5% | 2 |
| stelo.IntrinsicVolatility 1.4 | 1 | 3% | 3 |
| bvh.fnr.Fenrir 0.36l | 1 | 3% | 1 |
| divineomega.DivineBot 1.9.4.5 | 1 | 3% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.8 | 29 / 70 | 2.37 | 17.3% | 9056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 17.3% | 29 |
| et.Predator 1.8 | 3.0 | 12.9% | 6 |
| oog.melee.Mercutio 1.0 | 3.0 | 14.0% | 18 |
| cx.BlestPain 1.41 | 3.0 | 14.1% | 14 |
| ahf.NanoAndrew .4 | 5.0 | 11.3% | 2 |
| maribo.melee.BMV 0.1 | 6.5 | 8.9% | 0 |
| nic.Nicator 2.4 | 6.5 | 9.1% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.2% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.4 | 15 / 35 | 4424 |
| 2 | 1 | 67.4 | 85.1 | 14 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 17 | 47% |
| et.Predator 1.8 | 14 | 79% |
| cx.BlestPain 1.41 | 13 | 62% |
| nic.Nicator 2.4 | 1 | 100% |
| ahf.NanoAndrew .4 | 1 | 100% |

Hadur died in 41 of 70 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Mercutio 1.0 | 13 | 32% | 21 |
| cx.BlestPain 1.41 | 12 | 29% | 22 |
| et.Predator 1.8 | 10 | 24% | 17 |
| ahf.NanoAndrew .4 | 4 | 10% | 5 |
| nic.Nicator 2.4 | 1 | 2% | 2 |
| tex.Longbot 0.4 | 1 | 2% | 2 |

## Melee bench: F18

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.5 | 52 / 70 | 1.86 | 19.2% | 8714 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.2% | 52 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.3% | 6 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.5% | 5 |
| uji.DBH 1.1 | 4.0 | 11.7% | 4 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.5% | 1 |
| ratosh.Nobo 0.21 | 6.0 | 9.0% | 1 |
| sigterm.Sigterm 1.0 | 6.5 | 8.5% | 0 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.6% | 0 |
| stelo.WangRobot 1.0 | 9.0 | 5.4% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.0 | 29 / 35 | 4281 |
| 2 | 1 | 68.1 | 87.0 | 23 / 35 | 4433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 93% |
| agd.Mooserwirt2 2.7 | 12 | 92% |
| uji.DBH 1.1 | 5 | 100% |
| sigterm.Sigterm 1.0 | 4 | 100% |
| spinnercat.Robovirus 2.718 | 3 | 100% |
| stelo.WangRobot 1.0 | 2 | 50% |
| ratosh.Nobo 0.21 | 1 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 18 of 70 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 5 | 28% | 19 |
| morbid.MorbidPriest 1.0 | 4 | 22% | 29 |
| sigterm.Sigterm 1.0 | 3 | 17% | 9 |
| ratosh.Nobo 0.21 | 2 | 11% | 3 |
| uji.DBH 1.1 | 2 | 11% | 3 |
| spinnercat.Robovirus 2.718 | 1 | 6% | 4 |
| stelo.WangRobot 1.0 | 1 | 6% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 0 | 0% | 1 |

## Melee bench: F19

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.5 | 53 / 70 | 1.59 | 20.4% | 10734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 20.4% | 53 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.8% | 4 |
| mld.Infinity 2.2 | 2.5 | 15.0% | 13 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 12.0% | 0 |
| erdnis.Rover 0.3 | 5.0 | 10.4% | 0 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.6% | 0 |
| pac.ABC 2.1 | 7.5 | 5.6% | 0 |
| mbh.Mbh 0.1 | 7.5 | 6.5% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 27 / 35 | 5196 |
| 2 | 1 | 71.5 | 93.3 | 26 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 31 | 97% |
| mld.Infinity 2.2 | 17 | 76% |
| krillr.mini.JointStrike 2.0.0 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 1 | 100% |
| erdnis.Rover 0.3 | 1 | 100% |

Hadur died in 17 of 70 rounds, at a mean tick of 1261. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 41% | 42 |
| mld.Infinity 2.2 | 6 | 35% | 12 |
| krillr.mini.JointStrike 2.0.0 | 2 | 12% | 7 |
| patson.PatsonTestBot 1.0 | 1 | 6% | 4 |
| erdnis.Rover 0.3 | 1 | 6% | 2 |
| pbg.R2D2 1.0 | 0 | 0% | 2 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.2 | 39 / 70 | 1.97 | 19.4% | 10825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.4% | 39 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.4% | 15 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 12.2% | 3 |
| fwb.Nine 1.0.1 | 3.5 | 12.6% | 12 |
| catcat20.Rabbit 0.001 | 5.0 | 9.3% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 6.8% | 0 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.8 | 20 / 35 | 5680 |
| 2 | 1 | 68.8 | 87.6 | 19 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 24 | 71% |
| fwb.Nine 1.0.1 | 16 | 63% |
| catcat20.Rabbit 0.001 | 9 | 89% |
| nz.jdc.nano.GridFu 1.0 | 5 | 60% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 33 of 70 rounds, at a mean tick of 1458. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 15 | 45% | 33 |
| fwb.Nine 1.0.1 | 10 | 30% | 12 |
| nz.jdc.nano.GridFu 1.0 | 5 | 15% | 10 |
| catcat20.Rabbit 0.001 | 1 | 3% | 12 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.3 | 50 / 70 | 1.60 | 20.4% | 10788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 20.4% | 50 |
| eem.EvBot v4.6.16 | 2.0 | 15.7% | 16 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.5% | 2 |
| eld.Hmm 1.0 | 5.0 | 8.1% | 0 |
| oa.weak.BotherBot 0.1 | 6.0 | 7.6% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.2% | 0 |
| fire219.CatBot 1.0 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 96.2 | 27 / 35 | 5343 |
| 2 | 1 | 70.5 | 90.5 | 23 / 35 | 5445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 42 | 79% |
| dummy.mini.Scimitar 1.01 | 10 | 90% |
| cf.RiO.RiOx 4.2.1 | 4 | 100% |
| eld.Hmm 1.0 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 1229. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 11 | 52% | 32 |
| dummy.mini.Scimitar 1.01 | 5 | 24% | 21 |
| cf.RiO.RiOx 4.2.1 | 3 | 14% | 11 |
| arthord.MannyPacquiao Beta | 1 | 5% | 1 |
| eld.Hmm 1.0 | 0 | 0% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.0 | 38 / 70 | 1.90 | 18.7% | 9802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.7% | 38 |
| pe.SandboxDT 2.71m | 2.0 | 16.0% | 15 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.9% | 11 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.8% | 6 |
| bigpete.Stewie 1.0 | 5.0 | 11.0% | 0 |
| tad.Dalek98 0.98 | 6.0 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.0% | 0 |
| yk.JahRoslav 1.1 | 7.5 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 17 / 35 | 5116 |
| 2 | 1 | 69.5 | 91.4 | 21 / 35 | 4686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jlm.javaDisturbance 0.59 | 20 | 80% |
| pe.SandboxDT 2.71m | 18 | 61% |
| kvk.HebusLeTroll 0.35 | 14 | 71% |
| bigpete.Stewie 1.0 | 1 | 100% |

Hadur died in 32 of 70 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 13 | 41% | 23 |
| pe.SandboxDT 2.71m | 11 | 34% | 23 |
| jlm.javaDisturbance 0.59 | 6 | 19% | 20 |
| bigpete.Stewie 1.0 | 1 | 3% | 3 |
| tad.Dalek98 0.98 | 1 | 3% | 1 |

## Melee bench: F23

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.7 | 97.3 | 57 / 70 | 1.24 | 21.4% | 10905 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 21.4% | 57 |
| pe.SandboxLump 1.52 | 2.0 | 16.8% | 10 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 3 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.9% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 8.6% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.5 | 8.3% | 0 |
| cw.megas.Blade 0.8 | 6.5 | 7.9% | 0 |
| sample.Walls 1.0 | 7.5 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 97.1 | 28 / 35 | 5478 |
| 2 | 1 | 72.7 | 97.5 | 29 / 35 | 5427 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 43 | 79% |
| cre.Karolos 0.32 | 15 | 93% |
| stelo.AreaTargetingBot 1.1 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |
| sample.Walls 1.0 | 1 | 100% |
| stelo.RamTrackSurfer 1.2 | 1 | 100% |

Hadur died in 13 of 70 rounds, at a mean tick of 1062. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 11 | 85% | 41 |
| cre.Karolos 0.32 | 2 | 15% | 15 |
| stelo.AreaTargetingBot 1.1 | 0 | 0% | 5 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 3 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.5 | 34 / 70 | 2.49 | 16.9% | 7573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 16.9% | 34 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.5% | 13 |
| florent.XSeries.X2 0.12 | 3.0 | 12.7% | 9 |
| davidalves.Phoenix 0.54 | 4.0 | 12.4% | 9 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.7% | 4 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 0 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.0% | 2 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.5% | 0 |
| evd.X1 0.01 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 79.7 | 14 / 35 | 3476 |
| 2 | 1 | 67.5 | 87.3 | 20 / 35 | 4097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 12 | 75% |
| rz.GlowBlowMelee 1.4 | 10 | 70% |
| florent.XSeries.X2 0.12 | 9 | 78% |
| pedersen.Ugluk 1.1.1 | 7 | 86% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |
| oog.melee.Corsair 1.0 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 37 of 70 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 12 | 32% | 17 |
| pedersen.Ugluk 1.1.1 | 8 | 22% | 9 |
| rz.GlowBlowMelee 1.4 | 7 | 19% | 16 |
| florent.XSeries.X2 0.12 | 6 | 16% | 14 |
| oog.melee.Corsair 1.0 | 3 | 8% | 9 |
| stelo.SoJNanoMelee 1.1 | 1 | 3% | 2 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 3 |

## Melee bench: F25

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 1 over 2 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.2 | 37 / 70 | 2.51 | 17.3% | 7884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 17.3% | 37 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.2% | 12 |
| voidious.mini.BrokenSword 2.0.3 | 3.0 | 13.0% | 6 |
| jdw.Hurricane 1.4 | 3.5 | 12.8% | 11 |
| ds.Oo 2.2 | 5.0 | 10.7% | 2 |
| awesomeness.Elite 1.0 | 6.5 | 7.9% | 1 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.0% | 0 |
| gre.svman4.Morfeas 1.4.1 | 8.0 | 7.4% | 1 |
| adt.Ar2 1.1 | 8.0 | 7.2% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 19 / 35 | 3967 |
| 2 | 1 | 66.4 | 84.8 | 18 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 16 | 81% |
| voidious.mini.BrokenSword 2.0.3 | 12 | 92% |
| jdw.Hurricane 1.4 | 10 | 60% |
| ds.Oo 2.2 | 5 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 0% |

Hadur died in 34 of 70 rounds, at a mean tick of 622. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 10 | 29% | 14 |
| voidious.micro.BlitzBat 1.05 | 9 | 26% | 20 |
| ds.Oo 2.2 | 5 | 15% | 12 |
| voidious.mini.BrokenSword 2.0.3 | 3 | 9% | 12 |
| gre.svman4.Morfeas 1.4.1 | 2 | 6% | 3 |
| awesomeness.Elite 1.0 | 2 | 6% | 2 |
| gjr.Cephalosporin 0.1 | 1 | 3% | 4 |
| adt.Ar2 1.1 | 1 | 3% | 2 |
| amk.ChumbaMini 0.2 | 1 | 3% | 1 |

## Melee bench: F26

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.4 | 52 / 70 | 1.41 | 21.0% | 11996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 21.0% | 52 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 8 |
| shu.nitro.LENIN .T34 | 3.0 | 13.0% | 7 |
| lrem.Spectre 0.4.4 | 4.0 | 12.3% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.0 | 9.4% | 0 |
| js.PinBall 1.6 | 6.0 | 9.1% | 1 |
| gh.mini.GrubbmOne 1.0 | 7.0 | 8.2% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.0% | 0 |
| sample.SpinBot 1.0 | 9.0 | 3.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 24 / 35 | 5622 |
| 2 | 1 | 72.8 | 97.5 | 28 / 35 | 6374 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 26 | 81% |
| lrem.Spectre 0.4.4 | 18 | 89% |
| shu.nitro.LENIN .T34 | 15 | 67% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |
| js.PinBall 1.6 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 18 of 70 rounds, at a mean tick of 1096. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 7 | 39% | 27 |
| shu.nitro.LENIN .T34 | 5 | 28% | 27 |
| lrem.Spectre 0.4.4 | 4 | 22% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 6% | 1 |
| sample.SpinBot 1.0 | 1 | 6% | 1 |
| js.PinBall 1.6 | 0 | 0% | 2 |

## Melee bench: F27

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 2 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 90.5 | 47 / 70 | 1.86 | 18.7% | 8314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.7% | 47 |
| mk.Alpha 0.2.1 | 2.0 | 15.1% | 15 |
| wee.Gem 1.8.4 | 3.5 | 11.0% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.0% | 4 |
| EH.Eagle 1.0.6 | 5.0 | 10.0% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 9.1% | 1 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.7% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 4.9% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.5% | 0 |
| joe.ADinosaur 1.0 | 9.0 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 93.0 | 24 / 35 | 4506 |
| 2 | 1 | 67.2 | 87.9 | 23 / 35 | 3808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 31 | 81% |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 86% |
| wee.Gem 1.8.4 | 7 | 71% |
| EH.Eagle 1.0.6 | 6 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 1 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 13 | 57% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 3 | 13% | 8 |
| wee.Gem 1.8.4 | 3 | 13% | 7 |
| throxbot.ThroxBot 0.1 | 2 | 9% | 4 |
| joe.ADinosaur 1.0 | 1 | 4% | 1 |
| caimano.Furia_Ceca 0.22 | 1 | 4% | 1 |
| EH.Eagle 1.0.6 | 0 | 0% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 88.3 | 44 / 70 | 2.06 | 18.2% | 8012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.2% | 44 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 12 |
| uji.Antique 1.0 | 3.0 | 12.6% | 7 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.1% | 2 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.5% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.3% | 2 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 1 |
| matt.advanced.Katana 1.0 | 8.0 | 6.2% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.6 | 20 / 35 | 4019 |
| 2 | 1 | 68.0 | 88.9 | 24 / 35 | 3993 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 27 | 81% |
| uji.Antique 1.0 | 16 | 88% |
| qohnil.blot.BlotBot 3.61 | 5 | 80% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |

Hadur died in 26 of 70 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 11 | 42% | 29 |
| uji.Antique 1.0 | 8 | 31% | 20 |
| pfvicm.Sobieski 7.2.3b | 2 | 8% | 4 |
| amk.ChumbaWumba 0.3 | 2 | 8% | 4 |
| qohnil.blot.BlotBot 3.61 | 1 | 4% | 5 |
| ahr.ice.Ice 1.0.2 | 1 | 4% | 3 |
| stelo.Lifestealer 1.0 | 1 | 4% | 1 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 81.9 | 27 / 70 | 2.63 | 17.1% | 8665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.5 | 17.1% | 27 |
| deewiant.Anomaly 0.2 | 2.0 | 15.7% | 19 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 16.0% | 21 |
| myl.micro.Troodon 1.10 | 4.0 | 12.5% | 1 |
| jok.PheonixM 0.1.2 | 5.0 | 9.4% | 1 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.4% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.9% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.8 | 16 / 35 | 4327 |
| 2 | 2 | 66.0 | 80.0 | 11 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 22 | 55% |
| zyx.mega.YersiniaPestis 3.1 | 17 | 59% |
| myl.micro.Troodon 1.10 | 5 | 80% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 43 of 70 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 19 | 44% | 32 |
| zyx.mega.YersiniaPestis 3.1 | 15 | 35% | 24 |
| myl.micro.Troodon 1.10 | 6 | 14% | 9 |
| jok.PheonixM 0.1.2 | 1 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 2% | 1 |
| jangs.ns51 1.0 | 1 | 2% | 1 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 2 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 73.0 | 14 / 70 | 3.43 | 14.4% | 7450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 14.4% | 14 |
| catcat20.Matcha 0.006 | 2.5 | 14.4% | 19 |
| darkcanuck.B26354 1.06 | 3.0 | 13.8% | 15 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.4% | 11 |
| oog.melee.Capulet 1.2 | 4.5 | 13.0% | 8 |
| ntc.Opposite 1.5 | 6.0 | 8.2% | 0 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 6.9% | 2 |
| tripphippy.Alice 1.1 | 9.0 | 5.9% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 75.9 | 5 / 35 | 3690 |
| 2 | 2 | 61.8 | 70.2 | 9 / 35 | 3760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 12 | 42% |
| catcat20.Matcha 0.006 | 8 | 25% |
| stelo.PastFuture 2.3.2 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |
| oog.melee.Capulet 1.2 | 1 | 100% |

Hadur died in 56 of 70 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 16 | 29% | 17 |
| darkcanuck.B26354 1.06 | 15 | 27% | 21 |
| stelo.PastFuture 2.3.2 | 10 | 18% | 14 |
| oog.melee.Capulet 1.2 | 6 | 11% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 5% | 3 |
| tripphippy.Alice 1.1 | 2 | 4% | 3 |
| ntc.Opposite 1.5 | 2 | 4% | 3 |
| intruder.PrairieWolf 2.61 | 2 | 4% | 2 |

## Melee bench: F31

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 77.0 | 17 / 70 | 3.07 | 14.7% | 6329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.7% | 33 |
| gh.mini.Griezel 0.2 | 2.5 | 14.5% | 13 |
| hadur117.mini.DeiseLEARN 0.4 | 2.5 | 14.7% | 17 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.4% | 3 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.2% | 3 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.2% | 0 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.2% | 1 |
| fm.mammillarias 1.3 | 8.0 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.5% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.1 | 78.4 | 7 / 35 | 3096 |
| 2 | 2 | 63.0 | 75.6 | 10 / 35 | 3233 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 15 | 60% |
| gh.mini.Griezel 0.2 | 9 | 44% |
| d414.nano.Quantum 1.0.0 | 4 | 75% |
| spinnercat.micro.Tyger 0.1 | 1 | 100% |

Hadur died in 54 of 70 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 18 | 33% | 26 |
| gh.mini.Griezel 0.2 | 18 | 33% | 21 |
| d414.nano.Quantum 1.0.0 | 6 | 11% | 9 |
| spinnercat.micro.Tyger 0.1 | 5 | 9% | 7 |
| gh.nano.Grofvuil 0.2 | 3 | 6% | 3 |
| timmit.nano.TimDog 0.33 | 2 | 4% | 2 |
| fm.mammillarias 1.3 | 1 | 2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 2% | 1 |

## Melee bench: F32

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.6 | 49 / 70 | 1.76 | 19.2% | 9183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.2% | 49 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.8% | 16 |
| apc.botM 3.0 | 3.0 | 13.0% | 5 |
| lxx.ConceptA 0.8 | 4.0 | 10.2% | 0 |
| bayen.UbaMicro 1.4 | 5.0 | 9.2% | 0 |
| vjik.UnViolation 1.1 | 6.0 | 8.4% | 0 |
| yk.JahMicro 1.0 | 7.5 | 6.8% | 0 |
| panzer.Panzer 0.2 | 7.5 | 6.9% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.2% | 0 |
| conscience.Electron 1.3g | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.8 | 22 / 35 | 4307 |
| 2 | 1 | 70.0 | 93.3 | 27 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 30 | 73% |
| apc.botM 3.0 | 17 | 88% |
| lxx.ConceptA 0.8 | 5 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |
| vjik.UnViolation 1.1 | 1 | 100% |
| yk.JahMicro 1.0 | 1 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 14 | 67% | 37 |
| apc.botM 3.0 | 2 | 10% | 19 |
| lxx.ConceptA 0.8 | 2 | 10% | 2 |
| vjik.UnViolation 1.1 | 1 | 5% | 5 |
| yk.JahMicro 1.0 | 1 | 5% | 2 |
| bayen.UbaMicro 1.4 | 1 | 5% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.5 | 53 / 70 | 1.67 | 20.5% | 10223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 20.5% | 53 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 6 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.9% | 3 |
| labg.Cataclysm 2.05 | 4.0 | 11.6% | 7 |
| gre.svman4.Leonidas 1.3.2 | 5.5 | 10.3% | 1 |
| baal.nano.N 1.42 | 5.5 | 9.1% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 7.1% | 0 |
| sanja.First 0.1 | 8.0 | 5.1% | 0 |
| zyx.micro.Ant 1.1 | 9.0 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.9 | 29 / 35 | 5312 |
| 2 | 1 | 70.2 | 90.2 | 24 / 35 | 4911 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 24 | 96% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 95% |
| labg.Cataclysm 2.05 | 7 | 86% |
| gre.svman4.Leonidas 1.3.2 | 6 | 83% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 17 of 70 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 9 | 53% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3 | 18% | 18 |
| labg.Cataclysm 2.05 | 2 | 12% | 10 |
| gre.svman4.Leonidas 1.3.2 | 2 | 12% | 5 |
| baal.nano.N 1.42 | 1 | 6% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.4 | 21 / 70 | 2.40 | 16.7% | 8733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 17.9% | 31 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 16.7% | 21 |
| kid.Gladiator .7.2 | 2.5 | 16.3% | 15 |
| jcs.Seth 1.8 | 4.0 | 11.1% | 4 |
| tcf.Reach 3 | 5.0 | 10.6% | 0 |
| cli.Dancer 1.1 | 6.0 | 9.7% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.7% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.RamFire 1.0 | 9.0 | 3.3% | 0 |
| sample.VelociRobot 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.3 | 11 / 35 | 4548 |
| 2 | 3 | 66.2 | 82.5 | 10 / 35 | 4185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 33 | 42% |
| kid.Gladiator .7.2 | 6 | 50% |
| jcs.Seth 1.8 | 4 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 50 of 70 rounds, at a mean tick of 1137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 30 | 60% | 42 |
| kid.Gladiator .7.2 | 15 | 30% | 22 |
| jcs.Seth 1.8 | 2 | 4% | 3 |
| tcf.Reach 3 | 1 | 2% | 1 |
| cli.Dancer 1.1 | 1 | 2% | 1 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 81.0 | 11 / 70 | 2.71 | 15.1% | 6679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 51 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 15.1% | 11 |
| rz.HawkOnFire 0.1 | 3.5 | 12.2% | 2 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.4% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.0 | 11.3% | 0 |
| wit.Chuliath 1.0 | 6.0 | 7.8% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.5 | 6.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.3% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 81.6 | 7 / 35 | 3227 |
| 2 | 2 | 63.8 | 80.3 | 4 / 35 | 3452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 32 | 13% |
| rz.HawkOnFire 0.1 | 3 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 100% |
| gh.mini.Gruwel 0.9 | 2 | 100% |

Hadur died in 59 of 70 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 38 | 64% | 41 |
| rz.HawkOnFire 0.1 | 9 | 15% | 12 |
| gh.mini.Gruwel 0.9 | 7 | 12% | 10 |
| dmh.robocode.robot.BlackDeath 9.2 | 2 | 3% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 2% | 1 |
| wit.Chuliath 1.0 | 1 | 2% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 2% | 1 |

## Melee bench: F36

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.8 | 62 / 70 | 1.29 | 21.8% | 10836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 21.8% | 62 |
| bzdp.Pansy 2.1 | 3.0 | 12.1% | 4 |
| alpha.RainingFire 1.0 | 3.0 | 11.8% | 3 |
| mz.Cork 0.1 | 4.0 | 11.6% | 0 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 0 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.5% | 0 |
| m3thos.Eva02 0.7.1 | 7.0 | 8.7% | 0 |
| dl.BetterWalls 1.0 | 8.0 | 5.5% | 1 |
| sample.MyFirstRobot 1.0 | 9.0 | 4.7% | 0 |
| squidM.TentalceMeleeNano 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 97.5 | 32 / 35 | 5547 |
| 2 | 1 | 71.9 | 96.2 | 30 / 35 | 5289 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 15 | 100% |
| bzdp.Pansy 2.1 | 14 | 93% |
| mz.Cork 0.1 | 14 | 100% |
| alpha.RainingFire 1.0 | 13 | 85% |
| m3thos.Eva02 0.7.1 | 3 | 100% |
| bvh.mini.Fenrir 0.39 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 8 of 70 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 3 | 38% | 16 |
| alpha.RainingFire 1.0 | 3 | 38% | 15 |
| bvh.mini.Fenrir 0.39 | 2 | 25% | 3 |
| mz.Cork 0.1 | 0 | 0% | 13 |
| bvh.micro.Freya 0.3 | 0 | 0% | 10 |
| m3thos.Eva02 0.7.1 | 0 | 0% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 5 over 2 battles (2.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.7 | 58 / 70 | 1.74 | 19.7% | 10237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.7% | 58 |
| EBBU.Sim2 1.02 | 2.5 | 11.1% | 0 |
| germ.TheMind .2 | 2.5 | 11.0% | 4 |
| skm.Ryubot 1.0 | 5.5 | 8.6% | 1 |
| stelo.UntouchableNano 1.3 | 5.5 | 8.9% | 1 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6.0 | 9.4% | 1 |
| agrach.Dalek 1.0 | 6.5 | 8.4% | 2 |
| lmk.ACPFinal 0.1 | 6.5 | 8.6% | 0 |
| mb.Beast 0.1 | 9.5 | 7.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 7.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.5 | 28 / 35 | 5245 |
| 2 | 1 | 69.3 | 93.0 | 30 / 35 | 4992 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 17 | 100% |
| germ.TheMind .2 | 14 | 93% |
| skm.Ryubot 1.0 | 9 | 89% |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 100% |
| mb.Beast 0.1 | 4 | 100% |
| agrach.Dalek 1.0 | 3 | 100% |
| stelo.UntouchableNano 1.3 | 3 | 100% |
| lmk.ACPFinal 0.1 | 2 | 100% |

Hadur died in 12 of 70 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 4 | 33% | 14 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 17% | 8 |
| mb.Beast 0.1 | 2 | 17% | 6 |
| agrach.Dalek 1.0 | 1 | 8% | 11 |
| lmk.ACPFinal 0.1 | 1 | 8% | 6 |
| stelo.UntouchableNano 1.3 | 1 | 8% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 8% | 1 |
| EBBU.Sim2 1.02 | 0 | 0% | 15 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 11 over 2 battles (5.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.3 | 30 / 70 | 2.50 | 16.6% | 7873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 17.4% | 26 |
| hadur117.mini.DeiseLEARN 0.4 | 1.5 | 16.6% | 30 |
| bvh.mini.Freya 0.55 | 3.0 | 13.2% | 4 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.7% | 6 |
| cs.Wren 1.0 | 5.5 | 9.7% | 1 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.0% | 1 |
| kdf.KoulDestroyer 1.0 | 7.0 | 7.7% | 0 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 2 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 81.6 | 12 / 35 | 4143 |
| 2 | 1 | 66.4 | 85.1 | 18 / 35 | 3730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 26 | 69% |
| bts.mega.Gnarly 1.4 | 9 | 44% |
| bvh.mini.Freya 0.55 | 7 | 71% |
| davidalves.net.DuelistNanoMelee 1.01 | 1 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |
| cs.Wren 1.0 | 1 | 100% |

Hadur died in 40 of 70 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 17 | 43% | 32 |
| bts.mega.Gnarly 1.4 | 8 | 20% | 14 |
| bvh.mini.Freya 0.55 | 8 | 20% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 4 | 10% | 6 |
| cs.Wren 1.0 | 2 | 5% | 5 |
| bzdp.BoxCar 2.0 | 1 | 3% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.4 | 33 / 70 | 2.31 | 18.0% | 9908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.0% | 33 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 9 |
| az.Ololobot 0.2.4 | 3.0 | 13.9% | 17 |
| catcat20.Lambda 0.024 | 4.0 | 10.8% | 8 |
| apollokidd.ApolloKidd 0.9 | 5.5 | 8.6% | 0 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.0% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.0% | 1 |
| gimp.GimpBot 0.1 | 7.5 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 17 / 35 | 4780 |
| 2 | 1 | 67.7 | 86.0 | 16 / 35 | 5128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 19 | 53% |
| bvh.fry.Freya 0.82 | 14 | 79% |
| catcat20.Lambda 0.024 | 10 | 60% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 37 of 70 rounds, at a mean tick of 1158. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 16 | 43% | 24 |
| az.Ololobot 0.2.4 | 10 | 27% | 22 |
| catcat20.Lambda 0.024 | 9 | 24% | 14 |
| winamp32.micro.MicroMacro 1.0 | 1 | 3% | 4 |
| gimp.GimpBot 0.1 | 1 | 3% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |
| apollokidd.ApolloKidd 0.9 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 21 over 2 battles (10.5 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.3 | 47 / 70 | 1.87 | 19.6% | 9750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.6% | 47 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.6% | 9 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.8% | 7 |
| Polkwane.SmashMelee 1.0 | 4.0 | 10.8% | 5 |
| mz.AntiGrav 1.0 | 5.0 | 10.1% | 1 |
| stelo.Randomness 1.0 | 6.5 | 9.0% | 1 |
| alpha.BlackIce 1.0 | 6.5 | 8.3% | 0 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 7.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 0 |
| sample.Corners 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 21 / 35 | 4820 |
| 2 | 1 | 70.1 | 91.1 | 26 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 25 | 80% |
| kano.gamma.KanoGamma 1.8 | 13 | 77% |
| mz.AntiGrav 1.0 | 8 | 100% |
| Polkwane.SmashMelee 1.0 | 7 | 86% |
| stelo.Randomness 1.0 | 3 | 67% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 7 | 30% | 18 |
| kano.gamma.KanoGamma 1.8 | 5 | 22% | 20 |
| Polkwane.SmashMelee 1.0 | 4 | 17% | 12 |
| alpha.BlackIce 1.0 | 3 | 13% | 5 |
| mz.AntiGrav 1.0 | 1 | 4% | 7 |
| stelo.Randomness 1.0 | 1 | 4% | 5 |
| testantiswapgun.AntiSwap 1.0 | 1 | 4% | 1 |
| amk.superstrike.SuperStrike 0.3 | 1 | 4% | 1 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.5 | 32 / 70 | 2.57 | 16.6% | 7633 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 16.6% | 32 |
| eem.EvBotNG v12.8 | 2.0 | 15.8% | 20 |
| ary.Swarm 1.1 | 3.0 | 14.7% | 9 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.3% | 6 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.2% | 2 |
| shrub.Silver v048 | 6.0 | 8.6% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 5.7% | 1 |
| stelo.Mirror 1.1 | 9.0 | 4.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.5 | 14 / 35 | 3791 |
| 2 | 1 | 65.9 | 81.6 | 18 / 35 | 3842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 24 | 58% |
| ary.Swarm 1.1 | 10 | 90% |
| simonton.nano.MeleeSeed 1.8 | 6 | 100% |
| lessonz.robocode.Oz 0.5.0 | 3 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 15 | 38% | 26 |
| simonton.nano.MeleeSeed 1.8 | 8 | 21% | 15 |
| ary.Swarm 1.1 | 5 | 13% | 15 |
| lessonz.robocode.Oz 0.5.0 | 4 | 10% | 6 |
| shrub.Silver v048 | 2 | 5% | 3 |
| jsal.Jsalbot 1.0 | 2 | 5% | 2 |
| zyx.nano.Ant 1.1 | 1 | 3% | 1 |
| acogdev.alpha 0.2 | 1 | 3% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.8 | 31 / 70 | 2.46 | 17.4% | 9510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 17.4% | 31 |
| wompi.Wallaby 5.1 | 2.0 | 15.9% | 18 |
| ara.Shera 0.88 | 3.5 | 13.9% | 7 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 14.6% | 10 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 4 |
| maribo.IotaCT 1.1 | 6.0 | 7.2% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.0 | 5.5% | 0 |
| stelo.MirrorMicro 1.0 | 9.5 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.5 | 13 / 35 | 4563 |
| 2 | 1 | 67.9 | 85.1 | 18 / 35 | 4947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 15 | 87% |
| ara.Shera 0.88 | 11 | 73% |
| maribo.mini.MiniQuester 0.1 | 10 | 90% |
| amz.NanoClone 1.41 | 1 | 0% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 39 of 70 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 12 | 31% | 26 |
| ara.Shera 0.88 | 12 | 31% | 20 |
| maribo.mini.MiniQuester 0.1 | 9 | 23% | 16 |
| dsw.StaticD 1.0 | 3 | 8% | 4 |
| amz.NanoClone 1.41 | 3 | 8% | 3 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 78.4 | 13 / 70 | 2.94 | 15.2% | 7593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 47 |
| hadur117.mini.DeiseLEARN 0.4 | 2.0 | 15.2% | 13 |
| dummy.micro.Sparrow 2.5 | 3.0 | 12.9% | 2 |
| brainfade.melee.Dusk 0.44 | 4.0 | 12.1% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 11.1% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 0 |
| jab.DiamondStealer 5 | 7.0 | 7.3% | 0 |
| mz.NanoGod 2.02 | 8.0 | 6.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 77.1 | 6 / 35 | 3806 |
| 2 | 2 | 65.5 | 79.7 | 7 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 30 | 23% |
| dummy.micro.Sparrow 2.5 | 4 | 100% |
| brainfade.melee.Dusk 0.44 | 3 | 67% |

Hadur died in 57 of 70 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 37 | 65% | 43 |
| brainfade.melee.Dusk 0.44 | 7 | 12% | 11 |
| dummy.micro.Sparrow 2.5 | 7 | 12% | 10 |
| Krabb.akim2.Akim2 1.1b | 2 | 4% | 2 |
| mz.NanoGod 2.02 | 2 | 4% | 2 |
| wcsv.melee.EngineerMelee 0.1 | 2 | 4% | 2 |

## Melee bench: F44

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.0 | 37 / 70 | 1.99 | 18.9% | 9921 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 18.9% | 37 |
| stelo.Liblix 0.3.1 | 2.0 | 15.9% | 19 |
| tzu.TheArtOfWar 1.2 | 3.0 | 15.2% | 12 |
| wompi.Quokka 1.6 | 4.0 | 10.1% | 0 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.2% | 0 |
| disan.Chair 2.2.0 | 6.5 | 8.4% | 1 |
| jwirde.Gort 2.0 | 7.0 | 6.7% | 1 |
| stf.PanzerGeneral 0.1 | 7.0 | 7.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 5.0% | 0 |
| sample.Crazy 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 19 / 35 | 4776 |
| 2 | 1 | 69.0 | 87.3 | 18 / 35 | 5145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 31 | 77% |
| tzu.TheArtOfWar 1.2 | 18 | 56% |
| disan.Chair 2.2.0 | 1 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 33 of 70 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 13 | 39% | 34 |
| tzu.TheArtOfWar 1.2 | 12 | 36% | 23 |
| wompi.Quokka 1.6 | 3 | 9% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 3% | 3 |
| disan.Chair 2.2.0 | 1 | 3% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 3% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 3% | 1 |
| jwirde.Gort 2.0 | 1 | 3% | 1 |

## Melee bench: F45

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 47 over 2 battles (23.5 per battle, most in one battle 38). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.6 | 23 / 70 | 2.11 | 19.1% | 11223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 19.1% | 23 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.9% | 44 |
| jje.BagPuss 1.2 | 3.5 | 11.8% | 3 |
| myl.nano.Graviton 1.10 | 3.5 | 11.3% | 0 |
| sul.Lunar 1.1 | 5.0 | 9.7% | 0 |
| fm.claire 1.7 | 6.0 | 9.1% | 0 |
| hvilela.HVilela 0.9 | 7.5 | 7.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 8.0 | 7.2% | 0 |
| wit.Deep7 2.0 | 8.5 | 6.3% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.6 | 12 / 35 | 5884 |
| 2 | 1 | 68.2 | 86.7 | 11 / 35 | 5339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 15% |
| jje.BagPuss 1.2 | 6 | 83% |
| myl.nano.Graviton 1.10 | 5 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| sul.Lunar 1.1 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 47 of 70 rounds, at a mean tick of 2346. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 35 | 74% | 0 |
| jje.BagPuss 1.2 | 7 | 15% | 23 |
| fm.claire 1.7 | 4 | 9% | 6 |
| myl.nano.Graviton 1.10 | 1 | 2% | 14 |
| sul.Lunar 1.1 | 0 | 0% | 15 |
| pez.mini.ChironexFleckeri 0.5 | 0 | 0% | 5 |
| hvilela.HVilela 0.9 | 0 | 0% | 4 |
| wit.Deep7 2.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseLEARN 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 22 over 2 battles (11.0 per battle, most in one battle 16). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.3 | 31 / 70 | 2.23 | 17.7% | 9183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseLEARN 0.4 | 1.0 | 17.7% | 31 |
| kc.mini.Mirage 0.2 | 2.0 | 17.2% | 20 |
| rsalesc.melee.Medina 0.4.5 | 3.0 | 15.4% | 16 |
| cx.Princess 1.0 | 4.0 | 10.3% | 1 |
| sadoner.killer 0.2 | 5.5 | 9.7% | 1 |
| mz.MicroSheep 1.0 | 5.5 | 9.9% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 5.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.4% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.0 | 15 / 35 | 4448 |
| 2 | 1 | 68.2 | 86.7 | 16 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 28 | 61% |
| rsalesc.melee.Medina 0.4.5 | 19 | 68% |
| cx.Princess 1.0 | 2 | 50% |

Hadur died in 39 of 70 rounds, at a mean tick of 1065. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 21 | 54% | 44 |
| rsalesc.melee.Medina 0.4.5 | 13 | 33% | 21 |
| sadoner.killer 0.2 | 2 | 5% | 2 |
| arthord.NanoSatanMelee Beta | 1 | 3% | 1 |
| mz.MicroSheep 1.0 | 1 | 3% | 1 |
| cx.Princess 1.0 | 1 | 3% | 1 |

