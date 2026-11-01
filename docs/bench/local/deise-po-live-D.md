# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.7 | 13 / 70 | 2.47 | 16.4% | 9670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 47 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 16.4% | 13 |
| sgp.JollyNinja 3.53 | 3.0 | 12.1% | 6 |
| mz.MicroGodMelee 1 | 4.0 | 10.7% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.3% | 1 |
| lorneswork.Predator 1.0 | 6.0 | 9.4% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 1 |
| skm.butterfly 1.0 | 8.5 | 5.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 86.3 | 6 / 35 | 5102 |
| 2 | 2 | 64.5 | 81.0 | 7 / 35 | 4568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 41 | 10% |
| sgp.JollyNinja 3.53 | 7 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |

Hadur died in 57 of 70 rounds, at a mean tick of 1284. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 45 | 79% | 51 |
| sgp.JollyNinja 3.53 | 6 | 11% | 10 |
| mz.MicroGodMelee 1 | 3 | 5% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 2% | 3 |
| adt.Ar2 1.0 | 1 | 2% | 2 |
| lorneswork.Predator 1.0 | 1 | 2% | 1 |

## Melee bench: F02

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.3 | 43 / 70 | 2.23 | 18.2% | 8917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 43 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 14.7% | 12 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.4% | 6 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 2 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 7.9% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 7.2% | 1 |
| sch.Simone 0.3d | 7.5 | 7.4% | 3 |
| stelo.PatternRobot 1.0 | 9.0 | 6.0% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 84.1 | 21 / 35 | 4186 |
| 2 | 1 | 68.5 | 88.6 | 22 / 35 | 4731 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 17 | 82% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 14 | 86% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 4 | 100% |
| sch.Simone 0.3d | 4 | 75% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| Noran.BitchingElk 0.054 | 2 | 100% |

Hadur died in 27 of 70 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 6 | 22% | 21 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 6 | 22% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 19% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 4 | 15% | 5 |
| stelo.PatternRobot 1.0 | 2 | 7% | 5 |
| Noran.BitchingElk 0.054 | 1 | 4% | 3 |
| sch.Simone 0.3d | 1 | 4% | 3 |
| fnc.bandit.Bandit 5.2.0 | 1 | 4% | 1 |
| fullsail.SweetTea 1.1 | 1 | 4% | 1 |

## Melee bench: F03

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 18 over 2 battles (9.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.8 | 53 / 70 | 1.56 | 20.6% | 12419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.6% | 53 |
| radnor.DoctorBob 1.42 | 2.0 | 13.6% | 5 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.2% | 1 |
| vuen.Cake 2.51 | 4.0 | 12.6% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.5 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 95.6 | 27 / 35 | 6209 |
| 2 | 1 | 70.6 | 92.1 | 26 / 35 | 6210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 24 | 67% |
| kawigi.nano.Lib 1.0 | 22 | 100% |
| radnor.DoctorBob 1.42 | 14 | 100% |
| urdos.URDOS 1.3 | 1 | 0% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 8 | 42% | 22 |
| kawigi.nano.Lib 1.0 | 3 | 16% | 26 |
| urdos.URDOS 1.3 | 3 | 16% | 3 |
| radnor.DoctorBob 1.42 | 1 | 5% | 12 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 5% | 2 |
| adt.Ar1 2.1 | 1 | 5% | 2 |
| oa.weak.FlyMk1 0.1 | 1 | 5% | 1 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.1 | 16 / 70 | 2.16 | 17.5% | 10729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 54 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.5% | 16 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.5% | 1 |
| TNT.TNT 0.99.1 | 4.0 | 10.2% | 0 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.2% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.3% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 84.4 | 8 / 35 | 5182 |
| 2 | 2 | 68.6 | 89.8 | 8 / 35 | 5547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 54 | 26% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 55 of 70 rounds, at a mean tick of 1468. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 48 | 87% | 62 |
| apc.LeeroyJenkins2 1.0 | 3 | 5% | 4 |
| josago.Jorgito 0.16 | 1 | 2% | 1 |
| css.Delitioner 0.11 | 1 | 2% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 2% | 1 |
| TNT.TNT 0.99.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 79.4 | 11 / 70 | 2.86 | 14.8% | 7227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.6% | 37 |
| justin.DemonicRage 3.4 | 2.0 | 15.4% | 18 |
| hadur117.mini.DeiseD 0.4 | 3.0 | 14.8% | 11 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 2 |
| ms.Ares 0.19 | 5.0 | 9.8% | 2 |
| axeBots.HataMoto 3.09 | 6.0 | 8.7% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 6.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.2 | 80.6 | 7 / 35 | 3901 |
| 2 | 3 | 62.5 | 78.1 | 4 / 35 | 3326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 15 | 13% |
| justin.DemonicRage 3.4 | 11 | 27% |
| wompi.Numbat 2.1 | 4 | 75% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 60 of 70 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 22 | 37% | 25 |
| justin.DemonicRage 3.4 | 21 | 35% | 23 |
| wompi.Numbat 2.1 | 9 | 15% | 11 |
| ms.Ares 0.19 | 4 | 7% | 5 |
| axeBots.HataMoto 3.09 | 1 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 2% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.2 | 33 / 70 | 2.33 | 17.7% | 9278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.7% | 33 |
| jekl.StoneGhost 0.7 | 2.0 | 15.0% | 10 |
| origin.SleepSiphon 1.7b | 3.0 | 13.4% | 12 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.1% | 10 |
| mld.Wisdom 1.0 | 5.0 | 11.3% | 4 |
| gg.Wolverine 2.0 | 6.5 | 8.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.5% | 2 |
| DBall.NUKE 0.1 | 8.0 | 6.2% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.8 | 17 / 35 | 4677 |
| 2 | 1 | 67.6 | 86.7 | 16 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 18 | 72% |
| jekl.StoneGhost 0.7 | 11 | 82% |
| pe.minimelee.SandboxMiniMelee 1.1 | 6 | 67% |
| gg.Wolverine 2.0 | 4 | 75% |
| mld.Wisdom 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 0% |

Hadur died in 39 of 70 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 13 | 33% | 21 |
| origin.SleepSiphon 1.7b | 9 | 23% | 22 |
| jekl.StoneGhost 0.7 | 8 | 21% | 13 |
| mld.Wisdom 1.0 | 4 | 10% | 5 |
| gg.Wolverine 2.0 | 2 | 5% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 3% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 33 over 2 battles (16.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.2 | 42 / 70 | 1.61 | 19.9% | 11268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.9% | 42 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.4% | 18 |
| rtk.Tachikoma 1.0 | 3.0 | 16.4% | 5 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.4% | 2 |
| franzor.Lizt 1.3.1 | 5.0 | 10.1% | 3 |
| exauge.GateKeeper 1.1.121g | 6.0 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 7.0 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 21 / 35 | 5561 |
| 2 | 1 | 71.4 | 94.0 | 21 / 35 | 5707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 33 | 88% |
| rsalesc.melee.Monk 0.3.6c | 21 | 24% |
| franzor.Lizt 1.3.1 | 6 | 67% |
| oog.melee.CapuletDroid 1.1 | 4 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 1474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 17 | 61% | 27 |
| rtk.Tachikoma 1.0 | 6 | 21% | 35 |
| franzor.Lizt 1.3.1 | 3 | 11% | 1 |
| oog.melee.CapuletDroid 1.1 | 1 | 4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 1 | 4% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 36 over 2 battles (18.0 per battle, most in one battle 21). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.1 | 42 / 70 | 2.16 | 18.7% | 9733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 42 |
| tm.Yuugao 1.0 | 2.0 | 12.6% | 12 |
| shrub.Vapour v159 | 3.0 | 12.4% | 9 |
| Krabb.sliNk.Garm 0.9u | 5.0 | 9.8% | 3 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.4% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 5.0 | 8.8% | 2 |
| m3thos.Eva00 1.1 | 7.5 | 7.9% | 1 |
| SHAM.WOW 1.4 | 8.5 | 7.0% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 7.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 6.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.1 | 20 / 35 | 4850 |
| 2 | 1 | 68.2 | 90.2 | 22 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 14 | 71% |
| shrub.Vapour v159 | 11 | 73% |
| com.spp.robocode.MostlyHarmless 010 | 8 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 86% |
| Krabb.sliNk.Garm 0.9u | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 29 of 70 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 9 | 31% | 21 |
| shrub.Vapour v159 | 6 | 21% | 13 |
| Krabb.sliNk.Garm 0.9u | 5 | 17% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 14% | 8 |
| m3thos.Eva00 1.1 | 3 | 10% | 6 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 7% | 10 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.9 | 27 / 70 | 2.63 | 17.0% | 8742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 17.2% | 28 |
| hadur117.mini.DeiseD 0.4 | 1.5 | 17.0% | 27 |
| kc.micro.Figment 1.0 | 3.0 | 13.7% | 10 |
| yagami.Tidus 0.11 | 4.0 | 10.8% | 1 |
| pedersen.Grishnakh 1.0 | 5.5 | 9.4% | 2 |
| mc2.enemy.Original 0.9 | 5.5 | 9.3% | 2 |
| dft.Calliope 5.6 | 7.0 | 6.9% | 0 |
| step.nanoPri 1.0 | 8.5 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 79.0 | 11 / 35 | 4502 |
| 2 | 1 | 67.1 | 84.8 | 16 / 35 | 4240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 24 | 46% |
| kc.micro.Figment 1.0 | 13 | 77% |
| yagami.Tidus 0.11 | 2 | 100% |
| pedersen.Grishnakh 1.0 | 2 | 100% |
| mc2.enemy.Original 0.9 | 2 | 100% |

Hadur died in 43 of 70 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 20 | 47% | 30 |
| kc.micro.Figment 1.0 | 9 | 21% | 21 |
| pedersen.Grishnakh 1.0 | 4 | 9% | 5 |
| yagami.Tidus 0.11 | 3 | 7% | 6 |
| mc2.enemy.Original 0.9 | 3 | 7% | 4 |
| step.nanoPri 1.0 | 2 | 5% | 2 |
| robar.nano.Assertive_Melee 0.2 | 2 | 5% | 2 |

## Melee bench: F10

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.6 | 51 / 70 | 1.84 | 19.2% | 10270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.2% | 51 |
| DTF.Kludgy 1.2b | 2.0 | 15.2% | 9 |
| ejb.Polaris 1.0.1 | 3.5 | 11.6% | 5 |
| ne.Chimera 1.2 | 3.5 | 11.7% | 4 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 0 |
| vStar.RAFzilla 2.15 | 5.5 | 10.6% | 0 |
| kurios.DOSexe .9b | 8.0 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.8 | 23 / 35 | 5009 |
| 2 | 1 | 69.4 | 90.5 | 28 / 35 | 5261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 18 | 83% |
| ejb.Polaris 1.0.1 | 16 | 94% |
| ne.Chimera 1.2 | 11 | 82% |
| vStar.RAFzilla 2.15 | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| tvv.micro.Antares 1.1.1 | 4 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 10 | 53% | 29 |
| ne.Chimera 1.2 | 4 | 21% | 12 |
| ejb.Polaris 1.0.1 | 3 | 16% | 15 |
| vStar.RAFzilla 2.15 | 1 | 5% | 4 |
| sam.Samspin 1.0 | 1 | 5% | 1 |
| tvv.micro.Antares 1.1.1 | 0 | 0% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.3 | 37 / 70 | 2.14 | 18.2% | 8859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 37 |
| rz.Aleph 0.34 | 2.0 | 15.6% | 15 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 6 |
| djc.DynaBot 0.1.1 | 4.5 | 10.2% | 3 |
| rdt199.Warlord 0.73 | 4.5 | 10.2% | 4 |
| uji.YellohFellah 1.0 | 6.5 | 7.9% | 2 |
| br2.MobyDickBot 1.6 | 6.5 | 8.6% | 3 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 82.9 | 18 / 35 | 4443 |
| 2 | 1 | 68.6 | 91.7 | 19 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 21 | 76% |
| cx.mini.Nimrod 0.55 | 11 | 64% |
| uji.YellohFellah 1.0 | 6 | 100% |
| djc.DynaBot 0.1.1 | 6 | 83% |
| rdt199.Warlord 0.73 | 4 | 50% |
| br2.MobyDickBot 1.6 | 3 | 33% |

Hadur died in 33 of 70 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 11 | 33% | 26 |
| cx.mini.Nimrod 0.55 | 11 | 33% | 17 |
| djc.DynaBot 0.1.1 | 4 | 12% | 9 |
| rdt199.Warlord 0.73 | 4 | 12% | 8 |
| br2.MobyDickBot 1.6 | 2 | 6% | 1 |
| uji.YellohFellah 1.0 | 1 | 3% | 9 |

## Melee bench: F12

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.4 | 48 / 70 | 2.31 | 18.1% | 7864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.1% | 48 |
| nat.PallasHawk 1.0 | 3.0 | 12.8% | 8 |
| darkcanuck.Leon 1.01 | 3.0 | 13.0% | 6 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.2% | 6 |
| brainfade.melee.Genghis 0.36 | 5.5 | 9.0% | 2 |
| jrm.Test0 1.0 | 6.0 | 8.3% | 0 |
| cs.sheldor.Talon 1.1 | 6.5 | 7.7% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.5% | 0 |
| stuff.Vlad 0.1 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 88.3 | 24 / 35 | 3833 |
| 2 | 1 | 66.7 | 82.5 | 24 / 35 | 4031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 18 | 89% |
| nat.PallasHawk 1.0 | 15 | 93% |
| bts.wiki.RipCurl 0.9b | 12 | 83% |
| jrm.Test0 1.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| brainfade.melee.Genghis 0.36 | 1 | 100% |

Hadur died in 23 of 70 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 9 | 39% | 20 |
| darkcanuck.Leon 1.01 | 6 | 26% | 23 |
| nat.PallasHawk 1.0 | 4 | 17% | 18 |
| brainfade.melee.Genghis 0.36 | 2 | 9% | 2 |
| jrm.Test0 1.0 | 1 | 4% | 2 |
| cs.sheldor.Talon 1.1 | 1 | 4% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.6 | 29 / 70 | 2.39 | 16.9% | 8862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.5 | 16.9% | 29 |
| mn.Combat 3.25.0 | 2.0 | 16.6% | 24 |
| ags.Glacier 0.2.11 | 2.5 | 15.9% | 10 |
| shinh.Entangled 0.3 | 4.5 | 11.5% | 5 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.2% | 2 |
| apc.Colossus2 0.17 | 6.0 | 8.7% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.3% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.6% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.3 | 15 / 35 | 4490 |
| 2 | 2 | 66.3 | 82.9 | 14 / 35 | 4372 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 24 | 54% |
| ags.Glacier 0.2.11 | 17 | 65% |
| shinh.Entangled 0.3 | 5 | 40% |
| stelo.Wang 1.0 | 2 | 100% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |

Hadur died in 41 of 70 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 17 | 41% | 29 |
| ags.Glacier 0.2.11 | 14 | 34% | 26 |
| shinh.Entangled 0.3 | 6 | 15% | 8 |
| gh.micro.Gruweltje 0.7 | 3 | 7% | 5 |
| stelo.Wang 1.0 | 1 | 2% | 2 |

## Melee bench: F14

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 4 over 2 battles (2.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.7 | 49 / 70 | 2.01 | 19.0% | 10418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.0% | 49 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 10 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 10.2% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 4.5 | 9.8% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 7.0 | 8.4% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 8.3% | 1 |
| pa.Improved 1.0 | 9.0 | 5.8% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.3 | 24 / 35 | 5069 |
| 2 | 1 | 69.3 | 89.2 | 25 / 35 | 5349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 25 | 92% |
| catcat20.shape.Theta 0.018 | 13 | 85% |
| sanyi.mikrobi.Roberto 1.0 | 6 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 8 | 38% | 29 |
| catcat20.shape.Theta 0.018 | 7 | 33% | 13 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 10% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 5% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 1 | 5% | 5 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 5% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 5% | 1 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 20 over 2 battles (10.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.8 | 35 / 70 | 2.46 | 18.2% | 10585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 35 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.3% | 5 |
| emp.Yngwie 1.11 | 3.0 | 13.1% | 13 |
| mld.DustBunny 3.8 | 4.0 | 12.1% | 4 |
| kawigi.robot.Girl 1.2 | 5.0 | 10.8% | 10 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.2% | 4 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.1% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 8.5 | 5.4% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.5 | 18 / 35 | 5014 |
| 2 | 1 | 68.1 | 85.1 | 17 / 35 | 5571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 15 | 87% |
| kawigi.robot.Girl 1.2 | 9 | 89% |
| kawigi.micro.Shiz 1.1 | 7 | 86% |
| cb.nano.Insomnia 1.0 | 6 | 67% |
| mld.DustBunny 3.8 | 4 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.micro.Shiz 1.1 | 8 | 22% | 14 |
| mld.DustBunny 3.8 | 7 | 19% | 13 |
| emp.Yngwie 1.11 | 6 | 17% | 21 |
| cb.nano.Insomnia 1.0 | 6 | 17% | 5 |
| kawigi.robot.Girl 1.2 | 4 | 11% | 9 |
| lambdaxy.TBot 0.1 | 2 | 6% | 2 |
| divineomega.TrialBot 0.003 | 1 | 3% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 3% | 1 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 12). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.6 | 34 / 70 | 2.11 | 18.7% | 10598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 34 |
| gh.Griezel 0.5.2 | 2.0 | 16.9% | 26 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 15.0% | 2 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.2% | 2 |
| techdude.forest.FlamingForest 1.1 | 5.0 | 9.2% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.1% | 0 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.0 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.5% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.0 | 18 / 35 | 5142 |
| 2 | 1 | 69.3 | 89.2 | 16 / 35 | 5456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 35 | 49% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 100% |
| techdude.forest.FlamingForest 1.1 | 5 | 60% |
| tvv.nano.Polaris 1.2 | 2 | 100% |
| divineomega.DivineBot 1.9.4.5 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 1430. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 20 | 56% | 36 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 6 | 17% | 16 |
| techdude.forest.FlamingForest 1.1 | 3 | 8% | 6 |
| divineomega.DivineBot 1.9.4.5 | 3 | 8% | 4 |
| bvh.fnr.Fenrir 0.36l | 3 | 8% | 4 |
| asd.Cthulhu 1.3 | 1 | 3% | 1 |
| stelo.IntrinsicVolatility 1.4 | 0 | 0% | 3 |

## Melee bench: F17

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.6 | 35 / 70 | 2.39 | 18.1% | 10117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.1% | 35 |
| et.Predator 1.8 | 2.0 | 13.9% | 11 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.1% | 12 |
| cx.BlestPain 1.41 | 4.5 | 11.9% | 6 |
| nic.Nicator 2.4 | 4.5 | 11.9% | 3 |
| ahf.NanoAndrew .4 | 6.0 | 8.9% | 3 |
| maribo.melee.BMV 0.1 | 7.0 | 8.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.0 | 5.9% | 0 |
| tex.Longbot 0.4 | 9.0 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 20 / 35 | 5178 |
| 2 | 1 | 66.6 | 81.3 | 15 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 18 | 72% |
| et.Predator 1.8 | 14 | 71% |
| nic.Nicator 2.4 | 9 | 89% |
| cx.BlestPain 1.41 | 5 | 40% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 9 | 26% | 20 |
| oog.melee.Mercutio 1.0 | 9 | 26% | 19 |
| nic.Nicator 2.4 | 6 | 17% | 14 |
| cx.BlestPain 1.41 | 6 | 17% | 9 |
| ahf.NanoAndrew .4 | 3 | 9% | 5 |
| tex.Longbot 0.4 | 1 | 3% | 1 |
| maribo.melee.BMV 0.1 | 1 | 3% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 89.4 | 39 / 70 | 1.96 | 18.5% | 8639 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.5% | 39 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.5% | 9 |
| agd.Mooserwirt2 2.7 | 3.0 | 13.0% | 12 |
| uji.DBH 1.1 | 4.5 | 10.4% | 2 |
| ratosh.Nobo 0.21 | 5.0 | 10.5% | 0 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.1% | 3 |
| sigterm.Sigterm 1.0 | 7.5 | 7.5% | 3 |
| stelo.WangRobot 1.0 | 8.0 | 6.4% | 1 |
| kawigi.mini.Fhqwhgads 1.1 | 8.5 | 6.2% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.8 | 20 / 35 | 4336 |
| 2 | 1 | 67.7 | 88.9 | 19 / 35 | 4303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 19 | 74% |
| agd.Mooserwirt2 2.7 | 16 | 56% |
| uji.DBH 1.1 | 6 | 83% |
| ratosh.Nobo 0.21 | 4 | 100% |
| stelo.WangRobot 1.0 | 4 | 75% |
| spinnercat.Robovirus 2.718 | 3 | 67% |
| sigterm.Sigterm 1.0 | 1 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 100% |

Hadur died in 31 of 70 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 11 | 35% | 24 |
| agd.Mooserwirt2 2.7 | 11 | 35% | 20 |
| ratosh.Nobo 0.21 | 4 | 13% | 10 |
| uji.DBH 1.1 | 2 | 6% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 3% | 5 |
| spinnercat.Robovirus 2.718 | 1 | 3% | 2 |
| stelo.WangRobot 1.0 | 1 | 3% | 1 |
| sigterm.Sigterm 1.0 | 0 | 0% | 1 |

## Melee bench: F19

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 94.3 | 54 / 70 | 1.51 | 20.8% | 11508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.8% | 54 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.5% | 5 |
| mld.Infinity 2.2 | 2.5 | 14.0% | 8 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 12.2% | 2 |
| erdnis.Rover 0.3 | 5.0 | 9.7% | 0 |
| patson.PatsonTestBot 1.0 | 6.5 | 8.3% | 0 |
| pac.ABC 2.1 | 7.0 | 6.9% | 0 |
| mbh.Mbh 0.1 | 7.5 | 6.8% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.7 | 26 / 35 | 5771 |
| 2 | 1 | 71.8 | 94.9 | 28 / 35 | 5737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 25 | 96% |
| mld.Infinity 2.2 | 17 | 94% |
| krillr.mini.JointStrike 2.0.0 | 11 | 91% |
| patson.PatsonTestBot 1.0 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 16 of 70 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 6 | 38% | 31 |
| krillr.mini.JointStrike 2.0.0 | 5 | 31% | 15 |
| mld.Infinity 2.2 | 3 | 19% | 9 |
| erdnis.Rover 0.3 | 2 | 13% | 5 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |
| pac.ABC 2.1 | 0 | 0% | 1 |
| pbg.R2D2 1.0 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 33 over 2 battles (16.5 per battle, most in one battle 23). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 96.0 | 56 / 70 | 1.36 | 21.3% | 11333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.3% | 56 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 6 |
| nz.jdc.nano.GridFu 1.0 | 3.0 | 11.5% | 2 |
| fwb.Nine 1.0.1 | 4.0 | 10.3% | 3 |
| catcat20.Rabbit 0.001 | 5.0 | 9.7% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.4% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.0 | 6.4% | 0 |
| djdjdj.NanoSkunk10 1.0 | 9.0 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.6 | 25 / 35 | 5700 |
| 2 | 1 | 72.3 | 97.5 | 31 / 35 | 5633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 94% |
| fwb.Nine 1.0.1 | 11 | 82% |
| catcat20.Rabbit 0.001 | 7 | 71% |
| nz.jdc.nano.GridFu 1.0 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| bayen.nut.Squirrel 1.615 | 2 | 50% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 15 of 70 rounds, at a mean tick of 1327. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 6 | 40% | 23 |
| fwb.Nine 1.0.1 | 3 | 20% | 8 |
| catcat20.Rabbit 0.001 | 3 | 20% | 7 |
| nz.jdc.nano.GridFu 1.0 | 2 | 13% | 17 |
| bayen.nut.Squirrel 1.615 | 1 | 7% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 5 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |

## Melee bench: F21

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.8 | 51 / 70 | 1.47 | 20.6% | 11116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.6% | 51 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 20 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 1 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 0 |
| eld.Hmm 1.0 | 5.5 | 7.8% | 0 |
| oa.weak.BotherBot 0.1 | 5.5 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.0 | 6.7% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.3% | 0 |
| fire219.CatBot 1.0 | 8.5 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 24 / 35 | 5480 |
| 2 | 1 | 71.6 | 94.9 | 27 / 35 | 5636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 42 | 76% |
| dummy.mini.Scimitar 1.01 | 10 | 100% |
| eld.Hmm 1.0 | 4 | 100% |
| cf.RiO.RiOx 4.2.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 21 of 70 rounds, at a mean tick of 1595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 12 | 57% | 32 |
| dummy.mini.Scimitar 1.01 | 3 | 14% | 22 |
| cf.RiO.RiOx 4.2.1 | 3 | 14% | 7 |
| eld.Hmm 1.0 | 1 | 5% | 7 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.0 | 30 / 70 | 1.99 | 18.5% | 10286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.5% | 30 |
| kvk.HebusLeTroll 0.35 | 2.5 | 14.6% | 13 |
| pe.SandboxDT 2.71m | 2.5 | 16.4% | 20 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 7 |
| bigpete.Stewie 1.0 | 5.0 | 10.0% | 0 |
| tad.Dalek98 0.98 | 6.0 | 7.4% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.6% | 0 |
| gg.Squaraus 0.6 | 8.0 | 5.4% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 14 / 35 | 5339 |
| 2 | 1 | 68.7 | 89.2 | 16 / 35 | 4947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 24 | 46% |
| jlm.javaDisturbance 0.59 | 17 | 65% |
| kvk.HebusLeTroll 0.35 | 14 | 50% |
| bigpete.Stewie 1.0 | 1 | 100% |

Hadur died in 40 of 70 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 18 | 45% | 29 |
| kvk.HebusLeTroll 0.35 | 12 | 30% | 19 |
| jlm.javaDisturbance 0.59 | 9 | 23% | 19 |
| bigpete.Stewie 1.0 | 1 | 3% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.6 | 40 / 70 | 1.84 | 19.1% | 9695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 40 |
| pe.SandboxLump 1.52 | 2.0 | 17.4% | 19 |
| cre.Karolos 0.32 | 3.0 | 14.6% | 7 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.0% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 2 |
| cw.megas.Blade 0.8 | 6.5 | 8.0% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7.0 | 8.2% | 0 |
| sample.Walls 1.0 | 7.0 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.7 | 21 / 35 | 4990 |
| 2 | 1 | 69.4 | 88.6 | 19 / 35 | 4705 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 29 | 72% |
| cre.Karolos 0.32 | 14 | 71% |
| stelo.AreaTargetingBot 1.1 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| stelo.RamTrackSurfer 1.2 | 2 | 100% |
| sample.Walls 1.0 | 1 | 100% |

Hadur died in 30 of 70 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 16 | 53% | 37 |
| cre.Karolos 0.32 | 8 | 27% | 17 |
| stelo.AreaTargetingBot 1.1 | 3 | 10% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 7% | 4 |
| cw.megas.Blade 0.8 | 1 | 3% | 1 |
| sample.Walls 1.0 | 0 | 0% | 3 |

## Melee bench: F24

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 3 over 2 battles (1.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 75.7 | 25 / 70 | 3.19 | 15.3% | 7393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 15.3% | 25 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.8% | 9 |
| pedersen.Ugluk 1.1.1 | 3.5 | 13.4% | 8 |
| davidalves.Phoenix 0.54 | 3.5 | 12.7% | 11 |
| florent.XSeries.X2 0.12 | 4.0 | 12.8% | 13 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.5% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.4% | 0 |
| evd.X1 0.01 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 80.3 | 14 / 35 | 3812 |
| 2 | 1 | 61.8 | 71.1 | 11 / 35 | 3581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 12 | 83% |
| davidalves.Phoenix 0.54 | 8 | 75% |
| stelo.SoJNanoMelee 1.1 | 5 | 80% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| pedersen.Ugluk 1.1.1 | 3 | 67% |
| florent.XSeries.X2 0.12 | 2 | 0% |

Hadur died in 45 of 70 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 12 | 27% | 12 |
| davidalves.Phoenix 0.54 | 11 | 24% | 18 |
| rz.GlowBlowMelee 1.4 | 7 | 16% | 18 |
| pedersen.Ugluk 1.1.1 | 7 | 16% | 9 |
| stelo.SoJNanoMelee 1.1 | 3 | 7% | 4 |
| oog.melee.Corsair 1.0 | 2 | 4% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 4% | 3 |
| as.FrankTheTank 1.3 | 1 | 2% | 1 |

## Melee bench: F25

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 9 over 2 battles (4.5 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.4 | 51 / 70 | 2.04 | 19.1% | 8654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 51 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.4% | 4 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 14.1% | 9 |
| jdw.Hurricane 1.4 | 4.0 | 10.8% | 3 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.4% | 1 |
| ds.Oo 2.2 | 6.5 | 7.8% | 1 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.2% | 0 |
| adt.Ar2 1.1 | 8.0 | 7.6% | 1 |
| awesomeness.Elite 1.0 | 8.5 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 27 / 35 | 4337 |
| 2 | 1 | 68.8 | 89.8 | 24 / 35 | 4317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 22 | 91% |
| voidious.micro.BlitzBat 1.05 | 14 | 93% |
| jdw.Hurricane 1.4 | 9 | 89% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| gre.svman4.Morfeas 1.4.1 | 2 | 100% |
| ds.Oo 2.2 | 2 | 50% |
| awesomeness.Elite 1.0 | 1 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 7 | 37% | 23 |
| voidious.micro.BlitzBat 1.05 | 4 | 21% | 15 |
| ds.Oo 2.2 | 3 | 16% | 4 |
| jdw.Hurricane 1.4 | 2 | 11% | 9 |
| adt.Ar2 1.1 | 2 | 11% | 6 |
| awesomeness.Elite 1.0 | 1 | 5% | 3 |
| gre.svman4.Morfeas 1.4.1 | 0 | 0% | 5 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 3 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |

## Melee bench: F26

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 7 over 2 battles (3.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.6 | 44 / 70 | 2.30 | 18.7% | 11035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 44 |
| ak.Fermat 2.0 | 2.0 | 15.6% | 13 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 4 |
| shu.nitro.LENIN .T34 | 4.0 | 11.7% | 7 |
| js.PinBall 1.6 | 4.5 | 10.7% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.1% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.3% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.2% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 26 / 35 | 6028 |
| 2 | 1 | 66.3 | 78.4 | 18 / 35 | 5007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 19 | 89% |
| shu.nitro.LENIN .T34 | 14 | 71% |
| lrem.Spectre 0.4.4 | 13 | 92% |
| js.PinBall 1.6 | 4 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 26 of 70 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 6 | 23% | 18 |
| lrem.Spectre 0.4.4 | 5 | 19% | 12 |
| ak.Fermat 2.0 | 4 | 15% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 15% | 6 |
| js.PinBall 1.6 | 3 | 12% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 8% | 3 |
| gh.mini.GrubbmOne 1.0 | 1 | 4% | 3 |
| sample.SpinBot 1.0 | 1 | 4% | 1 |

## Melee bench: F27

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 12 over 2 battles (6.0 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.1 | 42 / 70 | 2.07 | 18.7% | 9154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 42 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 3.5 | 11.7% | 5 |
| EH.Eagle 1.0.6 | 4.0 | 10.9% | 2 |
| wee.Gem 1.8.4 | 4.5 | 10.5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.8% | 1 |
| throxbot.ThroxBot 0.1 | 6.5 | 8.7% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 4.7% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.5% | 0 |
| joe.ADinosaur 1.0 | 9.0 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.4 | 18 / 35 | 4653 |
| 2 | 1 | 69.2 | 91.7 | 24 / 35 | 4501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 29 | 79% |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 78% |
| wee.Gem 1.8.4 | 8 | 75% |
| throxbot.ThroxBot 0.1 | 4 | 50% |
| EH.Eagle 1.0.6 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 1 | 100% |

Hadur died in 28 of 70 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 10 | 36% | 31 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 14% | 11 |
| wee.Gem 1.8.4 | 3 | 11% | 9 |
| EH.Eagle 1.0.6 | 3 | 11% | 6 |
| throxbot.ThroxBot 0.1 | 2 | 7% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 7% | 3 |
| joe.ADinosaur 1.0 | 2 | 7% | 2 |
| caimano.Furia_Ceca 0.22 | 1 | 4% | 2 |
| cs.Grudge 1.0 | 1 | 4% | 1 |

## Melee bench: F28

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 91.3 | 53 / 70 | 1.79 | 19.7% | 9114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.7% | 53 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 7 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.6% | 2 |
| uji.Antique 1.0 | 4.0 | 10.7% | 4 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.9% | 3 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.9% | 1 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.0% | 0 |
| stelo.PianistNano 1.2 | 8.0 | 6.0% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 10.0 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.4 | 26 / 35 | 4839 |
| 2 | 1 | 69.4 | 91.1 | 27 / 35 | 4275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 34 | 88% |
| uji.Antique 1.0 | 9 | 89% |
| qohnil.blot.BlotBot 3.61 | 9 | 89% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| amk.ChumbaWumba 0.3 | 2 | 100% |

Hadur died in 17 of 70 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 7 | 41% | 32 |
| pfvicm.Sobieski 7.2.3b | 5 | 29% | 10 |
| uji.Antique 1.0 | 2 | 12% | 9 |
| qohnil.blot.BlotBot 3.61 | 1 | 6% | 11 |
| amk.ChumbaWumba 0.3 | 1 | 6% | 5 |
| matt.advanced.Katana 1.0 | 1 | 6% | 1 |
| ahr.ice.Ice 1.0.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.2 | 40 / 70 | 2.24 | 18.5% | 8988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.5% | 40 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 16.0% | 20 |
| deewiant.Anomaly 0.2 | 3.0 | 14.5% | 9 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 2 |
| jok.PheonixM 0.1.2 | 5.0 | 11.0% | 0 |
| ph.melee.ArcherME 0.3 | 6.5 | 7.4% | 0 |
| DBall.Anarchy 0.1 | 6.5 | 6.6% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.4% | 0 |
| jangs.ns51 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.1 | 19 / 35 | 4312 |
| 2 | 1 | 69.6 | 88.3 | 21 / 35 | 4676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 20 | 65% |
| deewiant.Anomaly 0.2 | 17 | 82% |
| myl.micro.Troodon 1.10 | 7 | 86% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jok.PheonixM 0.1.2 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 31 of 70 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 13 | 42% | 27 |
| deewiant.Anomaly 0.2 | 7 | 23% | 22 |
| myl.micro.Troodon 1.10 | 7 | 23% | 12 |
| jok.PheonixM 0.1.2 | 1 | 3% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 3% | 1 |
| ph.melee.ArcherME 0.3 | 1 | 3% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 17 over 2 battles (8.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.3 | 21 / 70 | 3.31 | 14.6% | 7007 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.5 | 14.6% | 21 |
| catcat20.Matcha 0.006 | 2.5 | 13.4% | 10 |
| oog.melee.Capulet 1.2 | 2.5 | 13.7% | 11 |
| darkcanuck.B26354 1.06 | 4.0 | 12.8% | 13 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.4% | 10 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.3% | 3 |
| ntc.Opposite 1.5 | 7.0 | 7.9% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 7.1% | 2 |
| tripphippy.Alice 1.1 | 8.5 | 7.4% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 77.8 | 12 / 35 | 3615 |
| 2 | 2 | 61.0 | 70.8 | 9 / 35 | 3392 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 10 | 80% |
| oog.melee.Capulet 1.2 | 10 | 40% |
| darkcanuck.B26354 1.06 | 8 | 75% |
| stelo.PastFuture 2.3.2 | 6 | 17% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 49 of 70 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 12 | 24% | 17 |
| stelo.PastFuture 2.3.2 | 12 | 24% | 16 |
| catcat20.Matcha 0.006 | 10 | 20% | 16 |
| oog.melee.Capulet 1.2 | 9 | 18% | 13 |
| ntc.Opposite 1.5 | 4 | 8% | 4 |
| intruder.PrairieWolf 2.61 | 1 | 2% | 2 |
| tripphippy.Alice 1.1 | 1 | 2% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 0 | 0% | 1 |

## Melee bench: F31

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 77.1 | 22 / 70 | 3.06 | 15.0% | 6497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.1% | 27 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.0% | 22 |
| gh.mini.Griezel 0.2 | 3.0 | 12.7% | 13 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 11.6% | 1 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.1% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.0% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.7% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 76.8 | 11 / 35 | 3076 |
| 2 | 2 | 63.0 | 77.5 | 11 / 35 | 3421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 23 | 61% |
| gh.mini.Griezel 0.2 | 9 | 22% |
| spinnercat.micro.Tyger 0.1 | 4 | 100% |
| d414.nano.Quantum 1.0.0 | 2 | 100% |

Hadur died in 48 of 70 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 15 | 31% | 27 |
| gh.mini.Griezel 0.2 | 13 | 27% | 17 |
| spinnercat.micro.Tyger 0.1 | 8 | 17% | 12 |
| d414.nano.Quantum 1.0.0 | 5 | 10% | 7 |
| fm.mammillarias 1.3 | 3 | 6% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 2% | 1 |
| timmit.nano.TimDog 0.33 | 1 | 2% | 1 |
| gh.nano.Grofvuil 0.2 | 1 | 2% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 2% | 1 |

## Melee bench: F32

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 87.6 | 40 / 70 | 2.11 | 18.2% | 9097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 40 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 19 |
| lxx.ConceptA 0.8 | 3.5 | 10.4% | 0 |
| apc.botM 3.0 | 4.0 | 11.0% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 9.3% | 2 |
| bayen.UbaMicro 1.4 | 5.5 | 9.3% | 2 |
| panzer.Panzer 0.2 | 7.5 | 7.7% | 0 |
| conscience.Electron 1.3g | 7.5 | 6.8% | 1 |
| yk.JahMicro 1.0 | 9.0 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 10.0 | 6.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 91.1 | 22 / 35 | 4388 |
| 2 | 1 | 66.4 | 84.1 | 18 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 25 | 56% |
| apc.botM 3.0 | 10 | 90% |
| lxx.ConceptA 0.8 | 8 | 100% |
| vjik.UnViolation 1.1 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| yk.JahMicro 1.0 | 2 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |

Hadur died in 30 of 70 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 17 | 57% | 33 |
| lxx.ConceptA 0.8 | 3 | 10% | 8 |
| apc.botM 3.0 | 2 | 7% | 14 |
| vjik.UnViolation 1.1 | 2 | 7% | 5 |
| bayen.UbaMicro 1.4 | 2 | 7% | 4 |
| yk.JahMicro 1.0 | 2 | 7% | 3 |
| donjezza.Jezza 1.0 | 1 | 3% | 2 |
| conscience.Electron 1.3g | 1 | 3% | 1 |

## Melee bench: F33

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 16 over 2 battles (8.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.9 | 51 / 70 | 1.73 | 20.1% | 10061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.1% | 51 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 7 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.2% | 5 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.2% | 6 |
| labg.Cataclysm 2.05 | 5.0 | 10.4% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 8.9% | 1 |
| baal.nano.N 1.42 | 7.0 | 7.5% | 0 |
| sanja.First 0.1 | 8.5 | 5.0% | 0 |
| zyx.micro.Ant 1.1 | 9.0 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 23 / 35 | 5123 |
| 2 | 1 | 70.8 | 93.7 | 28 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 18 | 94% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 94% |
| gre.svman4.Leonidas 1.3.2 | 11 | 82% |
| labg.Cataclysm 2.05 | 7 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 50% |
| baal.nano.N 1.42 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 19 of 70 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 9 | 47% | 26 |
| gre.svman4.Leonidas 1.3.2 | 6 | 32% | 13 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 2 | 11% | 21 |
| kinsen.melee.Angsaichmophobia 1.8c | 1 | 5% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 5% | 1 |
| labg.Cataclysm 2.05 | 0 | 0% | 5 |
| sanja.First 0.1 | 0 | 0% | 1 |
| zyx.micro.Ant 1.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 14 over 2 battles (7.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.3 | 34 / 70 | 2.23 | 18.2% | 10092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.2% | 34 |
| stelo.Spread 0.9 | 2.0 | 16.8% | 18 |
| kid.Gladiator .7.2 | 3.0 | 15.8% | 15 |
| tcf.Reach 3 | 4.5 | 10.6% | 2 |
| jcs.Seth 1.8 | 5.0 | 10.3% | 2 |
| cli.Dancer 1.1 | 5.5 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.7% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.1% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.4 | 16 / 35 | 5279 |
| 2 | 1 | 68.5 | 87.3 | 18 / 35 | 4813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 27 | 63% |
| kid.Gladiator .7.2 | 11 | 73% |
| jcs.Seth 1.8 | 6 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| tcf.Reach 3 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 37 of 70 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 18 | 49% | 25 |
| stelo.Spread 0.9 | 16 | 43% | 35 |
| tcf.Reach 3 | 2 | 5% | 5 |
| jcs.Seth 1.8 | 0 | 0% | 3 |
| ratosh.Wesco 1.4 | 0 | 0% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 24 over 2 battles (12.0 per battle, most in one battle 14). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 81.9 | 15 / 70 | 2.63 | 15.5% | 6879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 48 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.5% | 15 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.4% | 6 |
| rz.HawkOnFire 0.1 | 4.5 | 11.9% | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.0% | 1 |
| wit.Chuliath 1.0 | 6.0 | 7.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.5 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.3% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 84.4 | 11 / 35 | 3444 |
| 2 | 2 | 63.5 | 79.4 | 4 / 35 | 3435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 38 | 18% |
| gh.mini.Gruwel 0.9 | 4 | 75% |
| rz.HawkOnFire 0.1 | 4 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 1 | 100% |

Hadur died in 55 of 70 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 38 | 69% | 44 |
| gh.mini.Gruwel 0.9 | 8 | 15% | 12 |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 7% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 4% | 2 |
| rz.HawkOnFire 0.1 | 1 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 2% | 1 |
| dans.Cinnamon 1.2 | 1 | 2% | 1 |

## Melee bench: F36

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 19 over 2 battles (9.5 per battle, most in one battle 10). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.3 | 55 / 70 | 1.51 | 21.1% | 11138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.1% | 55 |
| bzdp.Pansy 2.1 | 2.0 | 12.2% | 6 |
| alpha.RainingFire 1.0 | 3.0 | 11.4% | 3 |
| mz.Cork 0.1 | 5.0 | 10.3% | 3 |
| bvh.micro.Freya 0.3 | 5.0 | 9.7% | 2 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.7% | 0 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.1% | 0 |
| dl.BetterWalls 1.0 | 8.0 | 6.7% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.6 | 28 / 35 | 5594 |
| 2 | 1 | 70.8 | 93.0 | 27 / 35 | 5544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 15 | 93% |
| alpha.RainingFire 1.0 | 11 | 82% |
| bvh.micro.Freya 0.3 | 10 | 90% |
| mz.Cork 0.1 | 9 | 67% |
| bvh.mini.Fenrir 0.39 | 7 | 100% |
| m3thos.Eva02 0.7.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| sample.MyFirstRobot 1.0 | 2 | 100% |

Hadur died in 15 of 70 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 4 | 27% | 24 |
| bvh.micro.Freya 0.3 | 4 | 27% | 11 |
| mz.Cork 0.1 | 3 | 20% | 11 |
| alpha.RainingFire 1.0 | 3 | 20% | 10 |
| dl.BetterWalls 1.0 | 1 | 7% | 4 |
| m3thos.Eva02 0.7.1 | 0 | 0% | 5 |
| bvh.mini.Fenrir 0.39 | 0 | 0% | 4 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.5 | 56 / 70 | 1.59 | 20.5% | 12195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 56 |
| germ.TheMind .2 | 2.5 | 10.6% | 4 |
| EBBU.Sim2 1.02 | 3.5 | 10.2% | 2 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 9.5% | 1 |
| agrach.Dalek 1.0 | 5.5 | 9.1% | 4 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.9% | 1 |
| lmk.ACPFinal 0.1 | 7.0 | 8.0% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.2% | 0 |
| mb.Beast 0.1 | 8.5 | 7.5% | 1 |
| skm.Ryubot 1.0 | 9.0 | 7.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 95.6 | 29 / 35 | 6169 |
| 2 | 1 | 69.4 | 91.4 | 27 / 35 | 6026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 18 | 94% |
| EBBU.Sim2 1.02 | 10 | 90% |
| stelo.UntouchableNano 1.3 | 9 | 100% |
| lmk.ACPFinal 0.1 | 6 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 100% |
| skm.Ryubot 1.0 | 4 | 100% |
| agrach.Dalek 1.0 | 3 | 100% |
| mb.Beast 0.1 | 2 | 100% |

Hadur died in 14 of 70 rounds, at a mean tick of 551. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 4 | 29% | 10 |
| agrach.Dalek 1.0 | 3 | 21% | 14 |
| EBBU.Sim2 1.02 | 3 | 21% | 10 |
| germ.TheMind .2 | 1 | 7% | 12 |
| lmk.ACPFinal 0.1 | 1 | 7% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 7% | 8 |
| mb.Beast 0.1 | 1 | 7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 0 | 0% | 3 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

## Melee bench: F38

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 7). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.9 | 38 / 70 | 2.36 | 17.5% | 8539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.5% | 38 |
| justin.Mallais 14.0 | 2.0 | 15.0% | 17 |
| bvh.mini.Freya 0.55 | 3.5 | 12.9% | 6 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.6% | 3 |
| cs.Wren 1.0 | 5.0 | 11.2% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.9% | 2 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.3% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.6% | 0 |
| matt.UnderDark3 2.4.34 | 9.0 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.3 | 22 / 35 | 4375 |
| 2 | 1 | 66.3 | 82.5 | 16 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 15 | 67% |
| bvh.mini.Freya 0.55 | 12 | 83% |
| bts.mega.Gnarly 1.4 | 6 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 6 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| cs.Wren 1.0 | 2 | 100% |

Hadur died in 33 of 70 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 10 | 30% | 21 |
| bvh.mini.Freya 0.55 | 7 | 21% | 13 |
| cs.Wren 1.0 | 5 | 15% | 9 |
| bts.mega.Gnarly 1.4 | 4 | 12% | 11 |
| kdf.KoulDestroyer 1.0 | 4 | 12% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 9% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 34 over 2 battles (17.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.3 | 35 / 70 | 2.50 | 17.5% | 9457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.5% | 35 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 6 |
| az.Ololobot 0.2.4 | 3.0 | 11.5% | 12 |
| catcat20.Lambda 0.024 | 4.5 | 10.4% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.8% | 8 |
| apollokidd.ApolloKidd 0.9 | 6.0 | 8.5% | 1 |
| gimp.GimpBot 0.1 | 6.5 | 8.5% | 4 |
| winamp32.micro.MicroMacro 1.0 | 8.5 | 7.2% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.5 | 6.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.4 | 19 / 35 | 4848 |
| 2 | 1 | 65.9 | 82.2 | 16 / 35 | 4609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 14 | 50% |
| bvh.fry.Freya 0.82 | 13 | 92% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 100% |
| catcat20.Lambda 0.024 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 50% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 10 | 29% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 29% | 12 |
| az.Ololobot 0.2.4 | 8 | 23% | 17 |
| catcat20.Lambda 0.024 | 3 | 9% | 7 |
| apollokidd.ApolloKidd 0.9 | 2 | 6% | 5 |
| gimp.GimpBot 0.1 | 1 | 3% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 3% | 1 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 8 over 2 battles (4.0 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.4 | 35 / 70 | 2.40 | 17.7% | 8945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.7% | 35 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 13 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.7% | 14 |
| mz.AntiGrav 1.0 | 4.0 | 11.5% | 3 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.3% | 2 |
| alpha.BlackIce 1.0 | 6.5 | 8.2% | 0 |
| stelo.Randomness 1.0 | 6.5 | 8.5% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 5.8% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.3% | 0 |
| sample.Corners 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.8 | 16 / 35 | 4565 |
| 2 | 1 | 67.4 | 85.1 | 19 / 35 | 4380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 15 | 73% |
| kano.gamma.KanoGamma 1.8 | 12 | 42% |
| Polkwane.SmashMelee 1.0 | 8 | 100% |
| mz.AntiGrav 1.0 | 6 | 100% |
| stelo.Randomness 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 2 | 100% |

Hadur died in 35 of 70 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 16 | 46% | 24 |
| kano.gamma.KanoGamma 1.8 | 11 | 31% | 20 |
| mz.AntiGrav 1.0 | 4 | 11% | 12 |
| Polkwane.SmashMelee 1.0 | 2 | 6% | 5 |
| stelo.Randomness 1.0 | 1 | 3% | 6 |
| amk.superstrike.SuperStrike 0.3 | 1 | 3% | 1 |
| alpha.BlackIce 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 30 over 2 battles (15.0 per battle, most in one battle 25). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.1 | 35 / 70 | 2.61 | 16.9% | 8149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 16.9% | 35 |
| eem.EvBotNG v12.8 | 2.5 | 14.9% | 17 |
| simonton.nano.MeleeSeed 1.8 | 3.5 | 12.7% | 7 |
| ary.Swarm 1.1 | 3.5 | 13.9% | 9 |
| lessonz.robocode.Oz 0.5.0 | 4.5 | 11.8% | 3 |
| shrub.Silver v048 | 6.0 | 8.7% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.2% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.6% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.7 | 19 / 35 | 3880 |
| 2 | 1 | 67.3 | 85.4 | 16 / 35 | 4269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 19 | 68% |
| simonton.nano.MeleeSeed 1.8 | 10 | 90% |
| ary.Swarm 1.1 | 8 | 75% |
| lessonz.robocode.Oz 0.5.0 | 6 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 36 of 70 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 10 | 28% | 23 |
| ary.Swarm 1.1 | 9 | 25% | 13 |
| simonton.nano.MeleeSeed 1.8 | 7 | 19% | 16 |
| lessonz.robocode.Oz 0.5.0 | 6 | 17% | 10 |
| zyx.nano.Ant 1.1 | 2 | 6% | 3 |
| acogdev.alpha 0.2 | 1 | 3% | 1 |
| shrub.Silver v048 | 0 | 0% | 3 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 10 over 2 battles (5.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.7 | 44 / 70 | 1.74 | 19.3% | 10211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.3% | 44 |
| wompi.Wallaby 5.1 | 2.5 | 14.6% | 9 |
| ara.Shera 0.88 | 3.0 | 14.2% | 10 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.0% | 6 |
| amz.NanoClone 1.41 | 5.0 | 9.7% | 1 |
| maribo.IotaCT 1.1 | 6.0 | 7.2% | 0 |
| dsw.StaticD 1.0 | 7.5 | 6.2% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.1 | 20 / 35 | 4992 |
| 2 | 1 | 70.0 | 92.4 | 24 / 35 | 5219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 25 | 80% |
| maribo.mini.MiniQuester 0.1 | 14 | 86% |
| wompi.Wallaby 5.1 | 9 | 89% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |

Hadur died in 26 of 70 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 10 | 38% | 28 |
| wompi.Wallaby 5.1 | 8 | 31% | 21 |
| maribo.mini.MiniQuester 0.1 | 7 | 27% | 16 |
| amz.NanoClone 1.41 | 1 | 4% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 6 over 2 battles (3.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.9 | 13 / 70 | 3.17 | 14.8% | 7490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.6% | 45 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 14.8% | 13 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.2% | 8 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.5% | 1 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.8% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.3% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 74.0 | 6 / 35 | 3575 |
| 2 | 2 | 64.7 | 77.8 | 7 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 23 | 26% |
| brainfade.melee.Dusk 0.44 | 5 | 40% |
| dummy.micro.Sparrow 2.5 | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 57 of 70 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 28 | 49% | 34 |
| brainfade.melee.Dusk 0.44 | 11 | 19% | 13 |
| dummy.micro.Sparrow 2.5 | 6 | 11% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 6 | 11% | 7 |
| Krabb.akim2.Akim2 1.1b | 3 | 5% | 5 |
| jab.DiamondStealer 5 | 2 | 4% | 2 |
| mz.NanoGod 2.02 | 1 | 2% | 1 |

## Melee bench: F44

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 13 over 2 battles (6.5 per battle, most in one battle 11). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.5 | 38 / 70 | 2.13 | 18.9% | 10349 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.9% | 38 |
| stelo.Liblix 0.3.1 | 2.5 | 15.7% | 17 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.7% | 11 |
| wompi.Quokka 1.6 | 4.0 | 10.5% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.4% | 0 |
| jwirde.Gort 2.0 | 6.0 | 9.0% | 3 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.3% | 0 |
| sample.Crazy 1.0 | 9.5 | 3.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.9 | 21 / 35 | 5098 |
| 2 | 1 | 68.6 | 86.0 | 17 / 35 | 5251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 24 | 71% |
| tzu.TheArtOfWar 1.2 | 17 | 65% |
| wompi.Quokka 1.6 | 8 | 75% |
| disan.Chair 2.2.0 | 1 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| jwirde.Gort 2.0 | 1 | 100% |

Hadur died in 34 of 70 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 15 | 44% | 32 |
| tzu.TheArtOfWar 1.2 | 8 | 24% | 22 |
| wompi.Quokka 1.6 | 4 | 12% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 9% | 4 |
| disan.Chair 2.2.0 | 1 | 3% | 3 |
| jwirde.Gort 2.0 | 1 | 3% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 3% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 57 over 2 battles (28.5 per battle, most in one battle 30). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 28 / 70 | 2.17 | 19.6% | 12059 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.6% | 28 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.2% | 34 |
| jje.BagPuss 1.2 | 3.0 | 11.1% | 4 |
| sul.Lunar 1.1 | 4.0 | 10.4% | 2 |
| myl.nano.Graviton 1.10 | 5.0 | 9.3% | 0 |
| hvilela.HVilela 0.9 | 6.0 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.4% | 0 |
| fm.claire 1.7 | 7.5 | 8.4% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.8% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.3 | 15 / 35 | 5975 |
| 2 | 1 | 69.2 | 86.7 | 13 / 35 | 6084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 41 | 29% |
| myl.nano.Graviton 1.10 | 4 | 100% |
| sul.Lunar 1.1 | 4 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 3 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| jje.BagPuss 1.2 | 2 | 50% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 42 of 70 rounds, at a mean tick of 2392. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 31 | 74% | 0 |
| jje.BagPuss 1.2 | 5 | 12% | 17 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 5% | 9 |
| myl.nano.Graviton 1.10 | 1 | 2% | 8 |
| fm.claire 1.7 | 1 | 2% | 5 |
| hvilela.HVilela 0.9 | 1 | 2% | 5 |
| abud.ThirdRobo 1.0 | 1 | 2% | 3 |
| sul.Lunar 1.1 | 0 | 0% | 20 |
| wit.Deep7 2.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 2 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: Intel(R) Xeon(R) Processor @ 2.80GHz, 4 logical cores, Linux 6.18.44-fc-v185, no other Robocode JVMs running, parallel 2. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx1G.

Skipped turns: 15 over 2 battles (7.5 per battle, most in one battle 8). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 84.3 | 24 / 70 | 2.41 | 16.4% | 8021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 17.5% | 25 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 16.4% | 24 |
| rsalesc.melee.Medina 0.4.5 | 3.0 | 14.9% | 15 |
| mz.MicroSheep 1.0 | 4.0 | 10.9% | 1 |
| cx.Princess 1.0 | 5.0 | 10.0% | 3 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.5 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.5 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 85.7 | 13 / 35 | 4097 |
| 2 | 2 | 64.8 | 82.9 | 11 / 35 | 3924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 26 | 46% |
| rsalesc.melee.Medina 0.4.5 | 12 | 58% |
| mz.MicroSheep 1.0 | 3 | 100% |
| cx.Princess 1.0 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 46 of 70 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 21 | 46% | 36 |
| rsalesc.melee.Medina 0.4.5 | 10 | 22% | 15 |
| mz.MicroSheep 1.0 | 6 | 13% | 10 |
| sadoner.killer 0.2 | 5 | 11% | 5 |
| cx.Princess 1.0 | 2 | 4% | 2 |
| arthord.NanoSatanMelee Beta | 2 | 4% | 2 |

