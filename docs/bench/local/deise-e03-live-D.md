# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 80.7 | 35 / 210 | 2.74 | 15.8% | 27791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 137 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 15.8% | 35 |
| sgp.JollyNinja 3.53 | 3.8 | 12.0% | 25 |
| mz.MicroGodMelee 1 | 4.2 | 11.1% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 9.4% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.5 | 5.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 79.7 | 7 / 35 | 5016 |
| 2 | 2 | 64.4 | 79.4 | 5 / 35 | 4768 |
| 3 | 2 | 64.3 | 80.3 | 1 / 35 | 4521 |
| 4 | 2 | 64.2 | 79.7 | 5 / 35 | 4331 |
| 5 | 2 | 66.1 | 83.5 | 6 / 35 | 4832 |
| 6 | 2 | 65.1 | 81.6 | 11 / 35 | 4323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 91 | 13% |
| mz.MicroGodMelee 1 | 13 | 46% |
| sgp.JollyNinja 3.53 | 11 | 55% |
| lorneswork.Predator 1.0 | 8 | 88% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 63% | 126 |
| sgp.JollyNinja 3.53 | 22 | 13% | 25 |
| mz.MicroGodMelee 1 | 14 | 8% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 7% | 14 |
| lorneswork.Predator 1.0 | 9 | 5% | 16 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 2 | 1% | 3 |

## Melee bench: F02

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 76.0 | 74 / 210 | 3.16 | 16.5% | 29555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.3 | 16.5% | 74 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 13.6% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.1% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 10.1% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.6% | 5 |
| sch.Simone 0.3d | 7.3 | 7.9% | 13 |
| Noran.BitchingElk 0.054 | 7.7 | 7.8% | 11 |
| stelo.PatternRobot 1.0 | 8.3 | 7.0% | 7 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 76.5 | 17 / 35 | 4641 |
| 2 | 3 | 63.0 | 72.4 | 8 / 35 | 4460 |
| 3 | 1 | 63.7 | 72.1 | 11 / 35 | 4883 |
| 4 | 1 | 66.4 | 80.3 | 12 / 35 | 5177 |
| 5 | 1 | 64.8 | 74.9 | 14 / 35 | 5164 |
| 6 | 1 | 65.8 | 79.7 | 12 / 35 | 5230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 48% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 31 | 74% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 73% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 89% |
| sch.Simone 0.3d | 7 | 57% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 3 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 31% | 71 |
| pulsar.PulsarMax 0.8.9 | 33 | 24% | 45 |
| stelo.PatternRobot 1.0 | 19 | 14% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 11% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 5% | 13 |
| Noran.BitchingElk 0.054 | 7 | 5% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 8 |
| sch.Simone 0.3d | 5 | 4% | 12 |
| fullsail.SweetTea 1.1 | 2 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.0 | 131 / 210 | 1.90 | 19.1% | 33936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.1% | 131 |
| radnor.DoctorBob 1.42 | 2.0 | 14.5% | 23 |
| vuen.Cake 2.51 | 3.3 | 12.6% | 29 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.8% | 23 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 1 |
| adt.Ar1 2.1 | 6.8 | 7.2% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.9% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.8% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 92.7 | 23 / 35 | 5810 |
| 2 | 1 | 68.8 | 90.8 | 20 / 35 | 5493 |
| 3 | 1 | 69.6 | 91.1 | 24 / 35 | 5748 |
| 4 | 1 | 68.7 | 86.7 | 20 / 35 | 5759 |
| 5 | 1 | 69.6 | 92.4 | 25 / 35 | 5476 |
| 6 | 1 | 68.0 | 86.3 | 19 / 35 | 5650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 57 | 86% |
| vuen.Cake 2.51 | 53 | 75% |
| kawigi.nano.Lib 1.0 | 38 | 82% |
| oa.weak.FlyMk1 0.1 | 7 | 71% |
| urdos.URDOS 1.3 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 26 | 33% | 61 |
| radnor.DoctorBob 1.42 | 22 | 28% | 62 |
| vuen.Cake 2.51 | 17 | 22% | 58 |
| urdos.URDOS 1.3 | 7 | 9% | 9 |
| adt.Ar1 2.1 | 3 | 4% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 70.0 | 8 / 210 | 3.70 | 14.2% | 29046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.5% | 196 |
| hadur117.mini.DeiseD 0.2 | 2.3 | 14.2% | 8 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.2% | 2 |
| TNT.TNT 0.99.1 | 4.2 | 11.2% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.5% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.9% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 71.4 | 1 / 35 | 5211 |
| 2 | 2 | 65.0 | 75.2 | 4 / 35 | 5113 |
| 3 | 2 | 62.5 | 68.3 | 0 / 35 | 4708 |
| 4 | 3 | 60.9 | 66.7 | 1 / 35 | 4373 |
| 5 | 2 | 63.9 | 72.7 | 1 / 35 | 5112 |
| 6 | 3 | 61.3 | 65.7 | 1 / 35 | 4529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 53 | 4% |
| TNT.TNT 0.99.1 | 7 | 71% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 172 | 85% | 174 |
| apc.LeeroyJenkins2 1.0 | 13 | 6% | 14 |
| TNT.TNT 0.99.1 | 5 | 2% | 10 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| josago.Jorgito 0.16 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.5 | 65.7 | 10 / 210 | 4.09 | 12.3% | 19750 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.0% | 113 |
| justin.DemonicRage 3.4 | 1.8 | 17.6% | 66 |
| wompi.Numbat 2.1 | 3.2 | 12.8% | 15 |
| hadur117.mini.DeiseD 0.2 | 3.8 | 12.3% | 10 |
| ms.Ares 0.19 | 5.5 | 9.1% | 2 |
| axeBots.HataMoto 3.09 | 5.5 | 9.3% | 3 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.7 | 66.3 | 3 / 35 | 3689 |
| 2 | 4 | 58.8 | 66.7 | 1 / 35 | 3370 |
| 3 | 4 | 58.6 | 65.1 | 1 / 35 | 3498 |
| 4 | 4 | 59.4 | 68.6 | 2 / 35 | 3240 |
| 5 | 4 | 58.6 | 66.3 | 2 / 35 | 3057 |
| 6 | 4 | 55.9 | 61.3 | 1 / 35 | 2896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 19 | 5% |
| justin.DemonicRage 3.4 | 15 | 13% |
| wompi.Numbat 2.1 | 5 | 40% |
| axeBots.HataMoto 3.09 | 4 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 0% |

Hadur died in 200 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 79 | 40% | 80 |
| justin.DemonicRage 3.4 | 62 | 31% | 64 |
| wompi.Numbat 2.1 | 31 | 16% | 33 |
| axeBots.HataMoto 3.09 | 10 | 5% | 14 |
| ms.Ares 0.19 | 6 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.0 | 128 / 210 | 2.08 | 18.7% | 28495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.7% | 128 |
| jekl.StoneGhost 0.7 | 2.0 | 15.5% | 32 |
| origin.SleepSiphon 1.7b | 3.8 | 11.5% | 28 |
| mld.Wisdom 1.0 | 4.2 | 10.8% | 5 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 10.6% | 13 |
| gg.Wolverine 2.0 | 6.2 | 8.3% | 3 |
| DBall.NUKE 0.1 | 7.5 | 7.0% | 1 |
| spinnercat.Omen 1.0 | 7.8 | 7.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.7% | 2 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.7 | 24 / 35 | 5381 |
| 2 | 1 | 69.7 | 91.7 | 25 / 35 | 4688 |
| 3 | 1 | 70.4 | 94.3 | 26 / 35 | 4981 |
| 4 | 1 | 67.7 | 84.4 | 21 / 35 | 4793 |
| 5 | 1 | 65.8 | 81.6 | 14 / 35 | 4320 |
| 6 | 1 | 66.6 | 84.4 | 18 / 35 | 4332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 74 | 89% |
| origin.SleepSiphon 1.7b | 32 | 72% |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 83% |
| mld.Wisdom 1.0 | 13 | 85% |
| gg.Wolverine 2.0 | 7 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 30 | 36% | 80 |
| origin.SleepSiphon 1.7b | 17 | 20% | 45 |
| pe.minimelee.SandboxMiniMelee 1.1 | 17 | 20% | 33 |
| mld.Wisdom 1.0 | 9 | 11% | 29 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 7% | 6 |
| gg.Wolverine 2.0 | 2 | 2% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 6 |
| spinnercat.Omen 1.0 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 82.4 | 59 / 210 | 2.58 | 17.4% | 33430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.1% | 68 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 17.4% | 59 |
| rtk.Tachikoma 1.0 | 2.7 | 16.1% | 51 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.1% | 10 |
| franzor.Lizt 1.3.1 | 4.5 | 11.6% | 23 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 82.9 | 9 / 35 | 5569 |
| 2 | 3 | 67.4 | 81.6 | 9 / 35 | 5247 |
| 3 | 1 | 69.4 | 86.7 | 15 / 35 | 5757 |
| 4 | 2 | 65.9 | 78.7 | 3 / 35 | 5306 |
| 5 | 1 | 70.3 | 87.0 | 13 / 35 | 6316 |
| 6 | 3 | 66.9 | 77.8 | 10 / 35 | 5235 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 48 | 58% |
| rsalesc.melee.Monk 0.3.6c | 30 | 13% |
| oog.melee.CapuletDroid 1.1 | 20 | 90% |
| franzor.Lizt 1.3.1 | 13 | 54% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 1076. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 72 | 48% | 79 |
| rtk.Tachikoma 1.0 | 55 | 36% | 86 |
| oog.melee.CapuletDroid 1.1 | 9 | 6% | 29 |
| franzor.Lizt 1.3.1 | 9 | 6% | 5 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 6 |
| skm.PateranBotlock2 1.0 | 2 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.1 | 110 / 210 | 2.25 | 18.8% | 31678 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.8% | 110 |
| shrub.Vapour v159 | 2.5 | 12.9% | 35 |
| tm.Yuugao 1.0 | 2.5 | 13.1% | 40 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.5% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 9.8% | 9 |
| m3thos.Eva00 1.1 | 6.3 | 8.6% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 7.7% | 2 |
| qualidafial.MajorDick 1.0.1 | 7.7 | 7.0% | 2 |
| SHAM.WOW 1.4 | 9.3 | 5.8% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 19 / 35 | 5711 |
| 2 | 1 | 68.8 | 88.9 | 20 / 35 | 5292 |
| 3 | 1 | 67.7 | 84.1 | 17 / 35 | 5391 |
| 4 | 1 | 68.4 | 87.9 | 18 / 35 | 5044 |
| 5 | 1 | 67.3 | 85.4 | 19 / 35 | 4841 |
| 6 | 1 | 68.0 | 85.1 | 17 / 35 | 5399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 50 | 62% |
| shrub.Vapour v159 | 45 | 53% |
| Krabb.sliNk.Garm 0.9u | 26 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 83% |
| m3thos.Eva00 1.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 40 | 40% | 72 |
| shrub.Vapour v159 | 29 | 29% | 54 |
| Krabb.sliNk.Garm 0.9u | 9 | 9% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 7% | 20 |
| m3thos.Eva00 1.1 | 5 | 5% | 9 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 5 |
| SHAM.WOW 1.4 | 3 | 3% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 2% | 20 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 73.0 | 42 / 210 | 3.43 | 14.5% | 21710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 107 |
| hadur117.mini.DeiseD 0.2 | 2.3 | 14.5% | 42 |
| kc.micro.Figment 1.0 | 2.7 | 14.0% | 29 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.4% | 15 |
| yagami.Tidus 0.11 | 5.2 | 9.6% | 1 |
| mc2.enemy.Original 0.9 | 5.2 | 9.8% | 12 |
| dft.Calliope 5.6 | 7.3 | 7.3% | 3 |
| step.nanoPri 1.0 | 7.8 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.4% | 0 |
| rdm.Dueler 0.4x | 9.7 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 72.7 | 8 / 35 | 3880 |
| 2 | 2 | 60.0 | 68.3 | 3 / 35 | 3565 |
| 3 | 2 | 61.1 | 70.8 | 8 / 35 | 3490 |
| 4 | 3 | 61.5 | 71.4 | 8 / 35 | 3530 |
| 5 | 2 | 63.2 | 77.1 | 9 / 35 | 3663 |
| 6 | 2 | 63.4 | 77.8 | 6 / 35 | 3582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 36 | 19% |
| kc.micro.Figment 1.0 | 25 | 56% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| mc2.enemy.Original 0.9 | 10 | 90% |
| yagami.Tidus 0.11 | 5 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 168 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 72 | 43% | 80 |
| kc.micro.Figment 1.0 | 25 | 15% | 40 |
| yagami.Tidus 0.11 | 22 | 13% | 25 |
| pedersen.Grishnakh 1.0 | 15 | 9% | 17 |
| mc2.enemy.Original 0.9 | 14 | 8% | 24 |
| robar.nano.Assertive_Melee 0.2 | 9 | 5% | 9 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F10

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 93.3 | 155 / 210 | 1.60 | 19.6% | 30523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.6% | 155 |
| DTF.Kludgy 1.2b | 2.2 | 14.0% | 23 |
| ne.Chimera 1.2 | 3.2 | 12.8% | 11 |
| ejb.Polaris 1.0.1 | 4.0 | 11.6% | 11 |
| vStar.RAFzilla 2.15 | 5.2 | 10.2% | 3 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 6 |
| kurios.DOSexe .9b | 8.0 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.8% | 1 |
| donjezza.Muncho 1.0 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.4 | 25 / 35 | 5208 |
| 2 | 1 | 70.5 | 96.2 | 27 / 35 | 5098 |
| 3 | 1 | 69.7 | 92.4 | 25 / 35 | 5012 |
| 4 | 1 | 68.7 | 88.9 | 22 / 35 | 5141 |
| 5 | 1 | 71.1 | 97.8 | 30 / 35 | 5138 |
| 6 | 1 | 69.5 | 93.0 | 26 / 35 | 4926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 53 | 77% |
| ne.Chimera 1.2 | 44 | 86% |
| ejb.Polaris 1.0.1 | 41 | 85% |
| vStar.RAFzilla 2.15 | 16 | 100% |
| tvv.micro.Antares 1.1.1 | 16 | 81% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 4 | 100% |
| sam.Samspin 1.0 | 1 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 42% | 61 |
| ne.Chimera 1.2 | 16 | 29% | 45 |
| ejb.Polaris 1.0.1 | 7 | 13% | 44 |
| tvv.micro.Antares 1.1.1 | 4 | 7% | 22 |
| donjezza.Muncho 1.0 | 2 | 4% | 7 |
| kurios.DOSexe .9b | 1 | 2% | 11 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 2 |
| vStar.RAFzilla 2.15 | 0 | 0% | 15 |

## Melee bench: F11

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.4 | 77 / 210 | 2.85 | 16.5% | 26058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.1% | 81 |
| hadur117.mini.DeiseD 0.2 | 1.7 | 16.5% | 77 |
| cx.mini.Nimrod 0.55 | 3.2 | 11.9% | 15 |
| djc.DynaBot 0.1.1 | 4.0 | 10.5% | 7 |
| br2.MobyDickBot 1.6 | 5.5 | 9.1% | 12 |
| rdt199.Warlord 0.73 | 6.0 | 8.8% | 12 |
| uji.YellohFellah 1.0 | 6.8 | 8.3% | 6 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.7% | 0 |
| stelo.MirrorNano 1.3 | 9.2 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 73.0 | 12 / 35 | 4284 |
| 2 | 1 | 67.7 | 88.9 | 17 / 35 | 4431 |
| 3 | 1 | 66.0 | 81.3 | 16 / 35 | 4360 |
| 4 | 2 | 63.5 | 75.2 | 8 / 35 | 4268 |
| 5 | 2 | 65.0 | 77.5 | 16 / 35 | 4249 |
| 6 | 2 | 65.2 | 80.6 | 8 / 35 | 4466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 53 | 51% |
| cx.mini.Nimrod 0.55 | 20 | 85% |
| uji.YellohFellah 1.0 | 13 | 92% |
| br2.MobyDickBot 1.6 | 11 | 82% |
| djc.DynaBot 0.1.1 | 10 | 70% |
| rdt199.Warlord 0.73 | 7 | 71% |

Hadur died in 133 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 56 | 42% | 84 |
| cx.mini.Nimrod 0.55 | 23 | 17% | 33 |
| rdt199.Warlord 0.73 | 15 | 11% | 23 |
| br2.MobyDickBot 1.6 | 12 | 9% | 22 |
| djc.DynaBot 0.1.1 | 11 | 8% | 17 |
| KiraNL.Chupacabra 0.4 | 10 | 8% | 11 |
| uji.YellohFellah 1.0 | 3 | 2% | 17 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.7 | 88 / 210 | 2.56 | 16.7% | 22643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 16.7% | 88 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.4% | 49 |
| nat.PallasHawk 1.0 | 3.3 | 12.3% | 25 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 28 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 15 |
| jrm.Test0 1.0 | 6.5 | 8.2% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.3% | 3 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 78.7 | 13 / 35 | 3807 |
| 2 | 1 | 64.6 | 81.3 | 14 / 35 | 3472 |
| 3 | 1 | 65.5 | 83.2 | 14 / 35 | 3883 |
| 4 | 1 | 67.3 | 87.6 | 20 / 35 | 4024 |
| 5 | 1 | 64.9 | 82.5 | 13 / 35 | 3628 |
| 6 | 1 | 65.5 | 82.9 | 14 / 35 | 3829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 44 | 70% |
| nat.PallasHawk 1.0 | 29 | 72% |
| darkcanuck.Leon 1.01 | 24 | 54% |
| brainfade.melee.Genghis 0.36 | 9 | 67% |
| jrm.Test0 1.0 | 6 | 100% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jp.Perpy 16.0 | 3 | 33% |
| stuff.Vlad 0.1 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 41% | 74 |
| nat.PallasHawk 1.0 | 24 | 20% | 46 |
| darkcanuck.Leon 1.01 | 19 | 15% | 40 |
| brainfade.melee.Genghis 0.36 | 16 | 13% | 20 |
| cs.sheldor.Talon 1.1 | 6 | 5% | 11 |
| jp.Perpy 16.0 | 5 | 4% | 6 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 7 |
| jrm.Test0 1.0 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.1 | 22 / 210 | 3.60 | 13.7% | 23467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.8% | 65 |
| mn.Combat 3.25.0 | 1.7 | 16.7% | 88 |
| hadur117.mini.DeiseD 0.2 | 3.2 | 13.7% | 22 |
| shinh.Entangled 0.3 | 4.2 | 12.7% | 24 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.9% | 11 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.4% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.8% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 76.2 | 3 / 35 | 4132 |
| 2 | 3 | 60.4 | 67.0 | 2 / 35 | 3846 |
| 3 | 3 | 60.5 | 66.3 | 2 / 35 | 4161 |
| 4 | 4 | 60.7 | 70.5 | 3 / 35 | 3578 |
| 5 | 3 | 61.0 | 70.8 | 5 / 35 | 3601 |
| 6 | 3 | 63.3 | 75.9 | 7 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 27 | 37% |
| ags.Glacier 0.2.11 | 19 | 47% |
| shinh.Entangled 0.3 | 7 | 14% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 685. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 80 | 43% | 88 |
| mn.Combat 3.25.0 | 61 | 32% | 71 |
| shinh.Entangled 0.3 | 35 | 19% | 36 |
| gh.micro.Gruweltje 0.7 | 5 | 3% | 6 |
| apc.Colossus2 0.17 | 3 | 2% | 4 |
| stelo.Wang 1.0 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.8 | 135 / 210 | 1.91 | 18.9% | 29637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.9% | 135 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 28 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 26 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.8% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.8% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.5% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.3% | 10 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.4 | 24 / 35 | 5174 |
| 2 | 1 | 68.0 | 86.0 | 21 / 35 | 4851 |
| 3 | 1 | 69.2 | 90.8 | 27 / 35 | 4652 |
| 4 | 1 | 68.9 | 90.2 | 20 / 35 | 4829 |
| 5 | 1 | 68.4 | 86.7 | 20 / 35 | 5143 |
| 6 | 1 | 69.5 | 93.0 | 23 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 89% |
| catcat20.shape.Theta 0.018 | 38 | 68% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 63% |
| pa.Improved 1.0 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 27 | 36% | 93 |
| catcat20.shape.Theta 0.018 | 26 | 35% | 52 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 11% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 7% | 19 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 7% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 4% | 10 |
| pa.Improved 1.0 | 1 | 1% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 4 |

## Melee bench: F15

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.4 | 91 / 210 | 2.58 | 17.8% | 31048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 17.8% | 91 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.4% | 29 |
| emp.Yngwie 1.11 | 3.5 | 12.8% | 50 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 13 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.3% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.1% | 21 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.7% | 0 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.6% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.4 | 18 / 35 | 5269 |
| 2 | 1 | 67.3 | 83.5 | 17 / 35 | 4856 |
| 3 | 1 | 68.1 | 84.4 | 16 / 35 | 5412 |
| 4 | 1 | 68.0 | 83.2 | 14 / 35 | 5659 |
| 5 | 1 | 67.9 | 84.1 | 16 / 35 | 5187 |
| 6 | 2 | 64.2 | 74.9 | 10 / 35 | 4665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 55% |
| kawigi.micro.Shiz 1.1 | 32 | 94% |
| kawigi.robot.Girl 1.2 | 18 | 89% |
| cb.nano.Insomnia 1.0 | 15 | 100% |
| mld.DustBunny 3.8 | 13 | 77% |
| divineomega.TrialBot 0.003 | 2 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 33% | 63 |
| mld.DustBunny 3.8 | 32 | 27% | 51 |
| kawigi.micro.Shiz 1.1 | 23 | 19% | 49 |
| cb.nano.Insomnia 1.0 | 14 | 12% | 16 |
| kawigi.robot.Girl 1.2 | 8 | 7% | 22 |
| lambdaxy.TBot 0.1 | 2 | 2% | 3 |
| divineomega.TrialBot 0.003 | 1 | 1% | 6 |

## Melee bench: F16

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.4 | 112 / 210 | 2.04 | 19.5% | 34188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.5% | 112 |
| gh.Griezel 0.5.2 | 2.0 | 16.9% | 66 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.2% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.1% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 5 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 2 |
| repositorio.NanoStep 1.0 | 8.7 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.2% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 89.8 | 18 / 35 | 5893 |
| 2 | 1 | 70.1 | 88.3 | 21 / 35 | 5868 |
| 3 | 1 | 70.8 | 92.1 | 21 / 35 | 5986 |
| 4 | 1 | 69.3 | 87.3 | 18 / 35 | 5456 |
| 5 | 1 | 68.1 | 84.1 | 16 / 35 | 5365 |
| 6 | 1 | 69.6 | 88.9 | 18 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 105 | 59% |
| techdude.forest.FlamingForest 1.1 | 18 | 50% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 100% |
| stelo.IntrinsicVolatility 1.4 | 10 | 80% |
| bvh.fnr.Fenrir 0.36l | 7 | 86% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1366. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 46 | 46% | 107 |
| bvh.fnr.Fenrir 0.36l | 16 | 16% | 21 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 13% | 29 |
| techdude.forest.FlamingForest 1.1 | 9 | 9% | 19 |
| stelo.IntrinsicVolatility 1.4 | 7 | 7% | 16 |
| asd.Cthulhu 1.3 | 4 | 4% | 4 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 7 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.7 | 108 / 210 | 2.20 | 18.5% | 29649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.5% | 108 |
| cx.BlestPain 1.41 | 2.7 | 12.9% | 39 |
| et.Predator 1.8 | 3.2 | 12.5% | 21 |
| oog.melee.Mercutio 1.0 | 4.3 | 11.7% | 21 |
| nic.Nicator 2.4 | 5.0 | 10.8% | 13 |
| ahf.NanoAndrew .4 | 5.5 | 10.5% | 5 |
| maribo.melee.BMV 0.1 | 6.3 | 9.5% | 2 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.5 | 15 / 35 | 4594 |
| 2 | 1 | 68.3 | 85.4 | 19 / 35 | 5114 |
| 3 | 1 | 66.7 | 82.9 | 14 / 35 | 4524 |
| 4 | 1 | 69.8 | 92.1 | 20 / 35 | 5267 |
| 5 | 1 | 69.4 | 90.8 | 23 / 35 | 4906 |
| 6 | 1 | 68.4 | 85.4 | 17 / 35 | 5244 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cx.BlestPain 1.41 | 38 | 55% |
| oog.melee.Mercutio 1.0 | 35 | 71% |
| nic.Nicator 2.4 | 32 | 84% |
| et.Predator 1.8 | 30 | 67% |
| ahf.NanoAndrew .4 | 10 | 80% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1027. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 28% | 52 |
| et.Predator 1.8 | 27 | 26% | 49 |
| oog.melee.Mercutio 1.0 | 19 | 18% | 42 |
| nic.Nicator 2.4 | 12 | 12% | 33 |
| ahf.NanoAndrew .4 | 10 | 10% | 20 |
| maribo.melee.BMV 0.1 | 3 | 3% | 8 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 86.0 | 119 / 210 | 2.26 | 18.0% | 25523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.0% | 119 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.2% | 29 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.1% | 25 |
| uji.DBH 1.1 | 3.8 | 10.8% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 10.1% | 6 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.5% | 3 |
| sigterm.Sigterm 1.0 | 7.3 | 7.7% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.4% | 4 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 84.1 | 18 / 35 | 4246 |
| 2 | 1 | 68.4 | 90.2 | 25 / 35 | 4165 |
| 3 | 1 | 68.6 | 87.3 | 26 / 35 | 4546 |
| 4 | 1 | 67.6 | 88.6 | 19 / 35 | 4334 |
| 5 | 1 | 67.5 | 88.3 | 19 / 35 | 4283 |
| 6 | 1 | 63.7 | 77.8 | 12 / 35 | 3949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 73% |
| agd.Mooserwirt2 2.7 | 27 | 63% |
| uji.DBH 1.1 | 26 | 88% |
| sigterm.Sigterm 1.0 | 12 | 92% |
| ratosh.Nobo 0.21 | 12 | 92% |
| spinnercat.Robovirus 2.718 | 12 | 83% |
| stelo.WangRobot 1.0 | 10 | 70% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 29% | 65 |
| agd.Mooserwirt2 2.7 | 20 | 22% | 41 |
| ratosh.Nobo 0.21 | 14 | 15% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 11% | 20 |
| uji.DBH 1.1 | 7 | 8% | 17 |
| stelo.WangRobot 1.0 | 5 | 5% | 11 |
| spinnercat.Robovirus 2.718 | 5 | 5% | 11 |
| sigterm.Sigterm 1.0 | 3 | 3% | 16 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 4 |

## Melee bench: F19

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.1 | 140 / 210 | 1.62 | 19.8% | 30452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.8% | 140 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.4% | 28 |
| mld.Infinity 2.2 | 2.7 | 14.3% | 30 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 10.7% | 6 |
| erdnis.Rover 0.3 | 5.2 | 10.2% | 2 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.0% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 1 |
| pac.ABC 2.1 | 8.2 | 6.7% | 2 |
| pbg.R2D2 1.0 | 8.5 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 95.2 | 26 / 35 | 5282 |
| 2 | 1 | 69.2 | 90.5 | 18 / 35 | 4775 |
| 3 | 1 | 69.2 | 89.2 | 21 / 35 | 4829 |
| 4 | 1 | 71.3 | 94.0 | 25 / 35 | 5229 |
| 5 | 1 | 70.9 | 94.3 | 24 / 35 | 5131 |
| 6 | 1 | 71.2 | 95.2 | 26 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 74 | 72% |
| mld.Infinity 2.2 | 64 | 88% |
| erdnis.Rover 0.3 | 11 | 91% |
| krillr.mini.JointStrike 2.0.0 | 10 | 60% |
| patson.PatsonTestBot 1.0 | 9 | 89% |
| pac.ABC 2.1 | 6 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 36 | 51% | 96 |
| mld.Infinity 2.2 | 14 | 20% | 49 |
| krillr.mini.JointStrike 2.0.0 | 10 | 14% | 19 |
| pbg.R2D2 1.0 | 4 | 6% | 9 |
| patson.PatsonTestBot 1.0 | 3 | 4% | 12 |
| erdnis.Rover 0.3 | 3 | 4% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 2 |

## Melee bench: F20

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.6 | 121 / 210 | 1.94 | 19.2% | 30901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.2% | 121 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.3% | 60 |
| fwb.Nine 1.0.1 | 3.3 | 11.1% | 12 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 10.7% | 0 |
| catcat20.Rabbit 0.001 | 5.5 | 9.5% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.4% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 86.0 | 21 / 35 | 4997 |
| 2 | 1 | 70.7 | 94.6 | 23 / 35 | 5226 |
| 3 | 1 | 68.5 | 89.2 | 17 / 35 | 4953 |
| 4 | 1 | 69.3 | 89.8 | 20 / 35 | 5551 |
| 5 | 1 | 69.5 | 90.2 | 22 / 35 | 5183 |
| 6 | 1 | 68.4 | 87.6 | 18 / 35 | 4991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 59% |
| fwb.Nine 1.0.1 | 36 | 92% |
| nz.jdc.nano.GridFu 1.0 | 17 | 100% |
| catcat20.Rabbit 0.001 | 9 | 56% |
| bayen.nut.Squirrel 1.615 | 7 | 71% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 59 | 66% | 101 |
| fwb.Nine 1.0.1 | 10 | 11% | 20 |
| catcat20.Rabbit 0.001 | 8 | 9% | 22 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 9 |
| nz.jdc.nano.GridFu 1.0 | 3 | 3% | 30 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 6 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 11 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |

## Melee bench: F21

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.7 | 133 / 210 | 1.57 | 20.3% | 33437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.3% | 133 |
| eem.EvBot v4.6.16 | 2.2 | 15.7% | 56 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.0% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.0% | 5 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 3 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.9% | 2 |
| fire219.CatBot 1.0 | 7.7 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 1 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 96.8 | 26 / 35 | 5202 |
| 2 | 1 | 69.4 | 89.5 | 18 / 35 | 5471 |
| 3 | 1 | 71.0 | 93.7 | 21 / 35 | 5583 |
| 4 | 1 | 71.2 | 92.7 | 21 / 35 | 5887 |
| 5 | 1 | 71.2 | 95.2 | 26 / 35 | 5511 |
| 6 | 1 | 71.0 | 94.0 | 21 / 35 | 5783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 95 | 57% |
| dummy.mini.Scimitar 1.01 | 44 | 91% |
| cf.RiO.RiOx 4.2.1 | 23 | 87% |
| eld.Hmm 1.0 | 14 | 93% |
| oa.weak.BotherBot 0.1 | 6 | 83% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1361. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 49 | 64% | 94 |
| dummy.mini.Scimitar 1.01 | 12 | 16% | 54 |
| cf.RiO.RiOx 4.2.1 | 10 | 13% | 25 |
| eld.Hmm 1.0 | 3 | 4% | 22 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 8 |
| el.JumpShoot 0.2 | 1 | 1% | 4 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.1 | 95 / 210 | 2.16 | 17.8% | 27891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.8% | 95 |
| pe.SandboxDT 2.71m | 2.0 | 16.8% | 64 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.3% | 35 |
| jlm.javaDisturbance 0.59 | 4.3 | 11.8% | 7 |
| bigpete.Stewie 1.0 | 4.7 | 10.5% | 6 |
| tad.Dalek98 0.98 | 6.7 | 7.0% | 2 |
| yk.JahRoslav 1.1 | 7.0 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.6% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 14 / 35 | 4641 |
| 2 | 1 | 66.9 | 87.0 | 11 / 35 | 4463 |
| 3 | 1 | 68.5 | 86.7 | 17 / 35 | 4882 |
| 4 | 1 | 68.6 | 89.2 | 19 / 35 | 4681 |
| 5 | 1 | 69.2 | 92.1 | 21 / 35 | 4755 |
| 6 | 1 | 65.9 | 82.9 | 13 / 35 | 4469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 65 | 52% |
| kvk.HebusLeTroll 0.35 | 49 | 67% |
| jlm.javaDisturbance 0.59 | 17 | 94% |
| bigpete.Stewie 1.0 | 7 | 71% |
| pbg.NinjaX 1.2 | 6 | 83% |
| tad.Dalek98 0.98 | 2 | 0% |
| yk.JahRoslav 1.1 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 43 | 37% | 72 |
| kvk.HebusLeTroll 0.35 | 32 | 28% | 57 |
| jlm.javaDisturbance 0.59 | 23 | 20% | 42 |
| tad.Dalek98 0.98 | 9 | 8% | 10 |
| bigpete.Stewie 1.0 | 5 | 4% | 11 |
| pbg.NinjaX 1.2 | 1 | 1% | 10 |
| gg.Squaraus 0.6 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.1 | 89 / 210 | 2.25 | 18.1% | 29731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.3 | 18.1% | 89 |
| pe.SandboxLump 1.52 | 1.7 | 17.6% | 78 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.2 | 9.5% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.9% | 7 |
| cw.megas.Blade 0.8 | 7.2 | 8.0% | 1 |
| sample.Walls 1.0 | 7.7 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.8% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.5 | 20 / 35 | 5039 |
| 2 | 1 | 68.0 | 83.8 | 12 / 35 | 5103 |
| 3 | 1 | 70.5 | 92.1 | 21 / 35 | 5462 |
| 4 | 1 | 69.4 | 89.8 | 15 / 35 | 4992 |
| 5 | 2 | 66.6 | 81.0 | 7 / 35 | 4585 |
| 6 | 2 | 67.1 | 80.3 | 14 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 81 | 42% |
| stelo.AreaTargetingBot 1.1 | 25 | 80% |
| cre.Karolos 0.32 | 25 | 72% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |
| cw.megas.Blade 0.8 | 3 | 67% |

Hadur died in 122 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 70 | 57% | 103 |
| cre.Karolos 0.32 | 18 | 15% | 40 |
| stelo.AreaTargetingBot 1.1 | 14 | 11% | 30 |
| sample.Walls 1.0 | 7 | 6% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 5% | 11 |
| cw.megas.Blade 0.8 | 5 | 4% | 6 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 10 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 73.3 | 48 / 210 | 3.40 | 14.2% | 20511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.8 | 14.2% | 48 |
| rz.GlowBlowMelee 1.4 | 1.8 | 15.0% | 50 |
| florent.XSeries.X2 0.12 | 3.0 | 13.2% | 39 |
| davidalves.Phoenix 0.54 | 4.0 | 12.5% | 43 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.9% | 22 |
| oog.melee.Corsair 1.0 | 6.3 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.8% | 9 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.5% | 0 |
| evd.X1 0.01 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 74.0 | 7 / 35 | 3788 |
| 2 | 1 | 61.5 | 73.3 | 10 / 35 | 3294 |
| 3 | 2 | 61.0 | 72.4 | 7 / 35 | 3343 |
| 4 | 3 | 61.0 | 72.1 | 6 / 35 | 3369 |
| 5 | 2 | 59.1 | 68.6 | 7 / 35 | 3081 |
| 6 | 2 | 63.5 | 79.7 | 11 / 35 | 3636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 25 | 64% |
| davidalves.Phoenix 0.54 | 20 | 20% |
| pedersen.Ugluk 1.1.1 | 17 | 82% |
| florent.XSeries.X2 0.12 | 16 | 38% |
| stelo.SoJNanoMelee 1.1 | 8 | 75% |
| oog.melee.Corsair 1.0 | 2 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 49 | 30% | 58 |
| rz.GlowBlowMelee 1.4 | 32 | 20% | 50 |
| davidalves.Phoenix 0.54 | 30 | 18% | 34 |
| pedersen.Ugluk 1.1.1 | 26 | 16% | 34 |
| stelo.SoJNanoMelee 1.1 | 11 | 7% | 14 |
| evd.X1 0.01 | 6 | 4% | 6 |
| oog.melee.Corsair 1.0 | 4 | 2% | 7 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.1 | 103 / 210 | 2.34 | 17.8% | 24488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.8% | 103 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.8% | 26 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.4% | 24 |
| jdw.Hurricane 1.4 | 4.0 | 12.0% | 38 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 7 |
| ds.Oo 2.2 | 5.7 | 8.6% | 7 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.4% | 3 |
| adt.Ar2 1.1 | 8.2 | 6.7% | 0 |
| awesomeness.Elite 1.0 | 8.3 | 6.8% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.8 | 15 / 35 | 4280 |
| 2 | 1 | 65.9 | 83.5 | 14 / 35 | 3953 |
| 3 | 1 | 67.9 | 87.3 | 21 / 35 | 4091 |
| 4 | 1 | 65.8 | 81.3 | 14 / 35 | 3872 |
| 5 | 1 | 66.9 | 85.7 | 17 / 35 | 4083 |
| 6 | 1 | 68.3 | 87.9 | 22 / 35 | 4209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 75% |
| voidious.micro.BlitzBat 1.05 | 38 | 84% |
| jdw.Hurricane 1.4 | 18 | 67% |
| ds.Oo 2.2 | 9 | 89% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 662. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 36 | 34% | 48 |
| voidious.mini.BrokenSword 2.0.3 | 28 | 26% | 56 |
| voidious.micro.BlitzBat 1.05 | 26 | 24% | 59 |
| ds.Oo 2.2 | 5 | 5% | 14 |
| gre.svman4.Morfeas 1.4.1 | 5 | 5% | 12 |
| awesomeness.Elite 1.0 | 3 | 3% | 6 |
| adt.Ar2 1.1 | 3 | 3% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 8 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |

## Melee bench: F26

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.2 | 102 / 210 | 2.24 | 18.0% | 30326 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.0% | 102 |
| ak.Fermat 2.0 | 2.0 | 15.5% | 53 |
| shu.nitro.LENIN .T34 | 3.3 | 12.4% | 37 |
| lrem.Spectre 0.4.4 | 3.7 | 12.0% | 12 |
| js.PinBall 1.6 | 5.2 | 10.7% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.8% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.2% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.7 | 18 / 35 | 5011 |
| 2 | 1 | 68.5 | 85.7 | 20 / 35 | 5219 |
| 3 | 1 | 68.0 | 87.6 | 15 / 35 | 4943 |
| 4 | 1 | 67.0 | 84.1 | 15 / 35 | 4743 |
| 5 | 1 | 69.3 | 91.1 | 18 / 35 | 5259 |
| 6 | 1 | 67.0 | 82.9 | 16 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 46 | 50% |
| shu.nitro.LENIN .T34 | 35 | 57% |
| lrem.Spectre 0.4.4 | 34 | 85% |
| js.PinBall 1.6 | 16 | 88% |
| gh.mini.GrubbmOne 1.0 | 8 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 80% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 42 | 38% | 65 |
| shu.nitro.LENIN .T34 | 29 | 26% | 61 |
| lrem.Spectre 0.4.4 | 21 | 19% | 42 |
| js.PinBall 1.6 | 6 | 5% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 5% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 5 |
| sample.SpinBot 1.0 | 2 | 2% | 3 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.4 | 112 / 210 | 2.86 | 17.1% | 25804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 17.1% | 112 |
| mk.Alpha 0.2.1 | 2.8 | 13.1% | 42 |
| wee.Gem 1.8.4 | 3.0 | 11.8% | 25 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 11.7% | 14 |
| EH.Eagle 1.0.6 | 4.7 | 10.5% | 9 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.6% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 8.7% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 7.2 | 8.4% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.2% | 1 |
| cs.Grudge 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 92.1 | 23 / 35 | 3888 |
| 2 | 1 | 66.8 | 85.4 | 21 / 35 | 4204 |
| 3 | 1 | 64.2 | 66.0 | 15 / 35 | 5051 |
| 4 | 1 | 67.2 | 86.7 | 22 / 35 | 3963 |
| 5 | 2 | 62.8 | 62.9 | 12 / 35 | 4936 |
| 6 | 1 | 65.5 | 83.2 | 19 / 35 | 3762 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 54 | 74% |
| wee.Gem 1.8.4 | 34 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 96% |
| EH.Eagle 1.0.6 | 7 | 86% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 99 of 210 rounds, at a mean tick of 624. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 24% | 63 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 14% | 34 |
| wee.Gem 1.8.4 | 12 | 12% | 41 |
| throxbot.ThroxBot 0.1 | 11 | 11% | 15 |
| joe.ADinosaur 1.0 | 10 | 10% | 11 |
| EH.Eagle 1.0.6 | 9 | 9% | 23 |
| caimano.Furia_Ceca 0.22 | 9 | 9% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 5% | 7 |
| cs.Grudge 1.0 | 5 | 5% | 5 |

## Melee bench: F28

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.5 | 132 / 210 | 1.94 | 18.7% | 25586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.7% | 132 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 38 |
| uji.Antique 1.0 | 3.5 | 11.7% | 19 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.9% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 9.9% | 4 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.2% | 2 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.0% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.3% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.3 | 19 / 35 | 4456 |
| 2 | 1 | 67.2 | 86.7 | 19 / 35 | 3990 |
| 3 | 1 | 68.0 | 87.0 | 22 / 35 | 4312 |
| 4 | 1 | 69.9 | 95.2 | 26 / 35 | 4442 |
| 5 | 1 | 67.9 | 89.5 | 23 / 35 | 4057 |
| 6 | 1 | 68.4 | 90.5 | 23 / 35 | 4329 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 93 | 83% |
| uji.Antique 1.0 | 34 | 88% |
| qohnil.blot.BlotBot 3.61 | 17 | 71% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 35% | 96 |
| pfvicm.Sobieski 7.2.3b | 15 | 19% | 18 |
| amk.ChumbaWumba 0.3 | 13 | 17% | 21 |
| uji.Antique 1.0 | 12 | 15% | 39 |
| qohnil.blot.BlotBot 3.61 | 8 | 10% | 18 |
| ahr.ice.Ice 1.0.2 | 1 | 1% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 6 |

## Melee bench: F29

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.0 | 83 / 210 | 2.62 | 17.3% | 26271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 17.3% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.8% | 62 |
| deewiant.Anomaly 0.2 | 2.8 | 14.0% | 38 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.2% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.5% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.5 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.1% | 3 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.9 | 11 / 35 | 4441 |
| 2 | 1 | 69.5 | 88.3 | 20 / 35 | 4808 |
| 3 | 1 | 64.8 | 77.8 | 11 / 35 | 4146 |
| 4 | 1 | 65.7 | 80.0 | 13 / 35 | 4270 |
| 5 | 2 | 64.0 | 76.2 | 10 / 35 | 3954 |
| 6 | 1 | 68.9 | 87.0 | 18 / 35 | 4652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 53 | 49% |
| deewiant.Anomaly 0.2 | 36 | 53% |
| myl.micro.Troodon 1.10 | 21 | 81% |
| jok.PheonixM 0.1.2 | 12 | 67% |
| DBall.Anarchy 0.1 | 8 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 45 | 35% | 71 |
| deewiant.Anomaly 0.2 | 45 | 35% | 64 |
| jok.PheonixM 0.1.2 | 16 | 13% | 25 |
| myl.micro.Troodon 1.10 | 12 | 9% | 26 |
| jangs.ns51 1.0 | 4 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 2% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 6 |
| DBall.Anarchy 0.1 | 0 | 0% | 9 |

## Melee bench: F30

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 74.3 | 46 / 210 | 3.31 | 14.7% | 23231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.5 | 14.7% | 46 |
| catcat20.Matcha 0.006 | 1.7 | 14.3% | 62 |
| darkcanuck.B26354 1.06 | 3.2 | 12.9% | 43 |
| oog.melee.Capulet 1.2 | 4.2 | 12.4% | 24 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.0% | 17 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.5% | 5 |
| tripphippy.Alice 1.1 | 7.2 | 8.0% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.4% | 7 |
| ntc.Opposite 1.5 | 8.5 | 7.1% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.7 | 72.1 | 4 / 35 | 3608 |
| 2 | 2 | 60.3 | 70.8 | 6 / 35 | 3551 |
| 3 | 1 | 63.3 | 76.8 | 11 / 35 | 3823 |
| 4 | 2 | 62.0 | 72.4 | 8 / 35 | 3976 |
| 5 | 1 | 63.1 | 75.2 | 8 / 35 | 4076 |
| 6 | 1 | 64.0 | 78.4 | 9 / 35 | 4197 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 36% |
| darkcanuck.B26354 1.06 | 18 | 28% |
| oog.melee.Capulet 1.2 | 17 | 71% |
| stelo.PastFuture 2.3.2 | 13 | 77% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| ntc.Opposite 1.5 | 1 | 0% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 52 | 32% | 63 |
| darkcanuck.B26354 1.06 | 33 | 20% | 40 |
| stelo.PastFuture 2.3.2 | 31 | 19% | 39 |
| oog.melee.Capulet 1.2 | 18 | 11% | 29 |
| tripphippy.Alice 1.1 | 13 | 8% | 15 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 6 |
| ntc.Opposite 1.5 | 4 | 2% | 4 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 75.4 | 41 / 210 | 3.21 | 14.6% | 20681 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 118 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 14.6% | 41 |
| gh.mini.Griezel 0.2 | 3.2 | 12.3% | 33 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.6% | 5 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.0% | 6 |
| gh.nano.Grofvuil 0.2 | 6.3 | 8.8% | 5 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.7% | 3 |
| fm.mammillarias 1.3 | 8.2 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.7 | 5.4% | 1 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 70.2 | 5 / 35 | 3280 |
| 2 | 2 | 63.1 | 77.5 | 9 / 35 | 3410 |
| 3 | 2 | 63.9 | 81.3 | 10 / 35 | 3322 |
| 4 | 2 | 61.2 | 71.7 | 5 / 35 | 3284 |
| 5 | 2 | 62.8 | 77.1 | 6 / 35 | 3667 |
| 6 | 2 | 62.5 | 74.9 | 6 / 35 | 3718 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 45 | 20% |
| gh.mini.Griezel 0.2 | 23 | 65% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| d414.nano.Quantum 1.0.0 | 5 | 60% |
| gh.nano.Grofvuil 0.2 | 4 | 50% |
| tlp.ThreeLeggedPig 1 | 2 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 88 | 52% | 98 |
| spinnercat.micro.Tyger 0.1 | 27 | 16% | 34 |
| gh.mini.Griezel 0.2 | 26 | 15% | 41 |
| d414.nano.Quantum 1.0.0 | 10 | 6% | 14 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 9 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 0 | 0% | 1 |

## Melee bench: F32

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.1 | 120 / 210 | 2.25 | 18.1% | 27635 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.1% | 120 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 47 |
| apc.botM 3.0 | 3.0 | 12.3% | 19 |
| lxx.ConceptA 0.8 | 4.0 | 10.5% | 6 |
| vjik.UnViolation 1.1 | 5.2 | 9.4% | 10 |
| bayen.UbaMicro 1.4 | 6.0 | 8.8% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.5% | 2 |
| panzer.Panzer 0.2 | 7.7 | 7.2% | 0 |
| donjezza.Jezza 1.0 | 9.3 | 5.7% | 4 |
| conscience.Electron 1.3g | 9.3 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.0 | 17 / 35 | 4854 |
| 2 | 1 | 67.6 | 89.2 | 19 / 35 | 4373 |
| 3 | 1 | 66.4 | 83.8 | 21 / 35 | 4278 |
| 4 | 1 | 69.6 | 91.7 | 26 / 35 | 5044 |
| 5 | 1 | 66.9 | 86.0 | 17 / 35 | 4630 |
| 6 | 1 | 66.8 | 85.1 | 20 / 35 | 4456 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 70 | 63% |
| apc.botM 3.0 | 27 | 70% |
| lxx.ConceptA 0.8 | 24 | 96% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| vjik.UnViolation 1.1 | 7 | 71% |
| yk.JahMicro 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 6 | 83% |
| panzer.Panzer 0.2 | 6 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 52% | 88 |
| apc.botM 3.0 | 14 | 16% | 34 |
| lxx.ConceptA 0.8 | 9 | 10% | 25 |
| bayen.UbaMicro 1.4 | 7 | 8% | 11 |
| conscience.Electron 1.3g | 4 | 4% | 6 |
| yk.JahMicro 1.0 | 3 | 3% | 12 |
| panzer.Panzer 0.2 | 3 | 3% | 11 |
| vjik.UnViolation 1.1 | 2 | 2% | 14 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |

## Melee bench: F33

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.2 | 115 / 210 | 2.33 | 18.5% | 29402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.5% | 115 |
| maribo.Quester 0.3 | 2.0 | 16.1% | 44 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 10.6% | 14 |
| labg.Cataclysm 2.05 | 4.5 | 10.2% | 9 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.9% | 3 |
| zyx.micro.Ant 1.1 | 8.0 | 6.1% | 0 |
| sanja.First 0.1 | 9.2 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.1 | 19 / 35 | 4864 |
| 2 | 1 | 68.6 | 86.0 | 19 / 35 | 4953 |
| 3 | 1 | 68.6 | 85.7 | 18 / 35 | 5223 |
| 4 | 1 | 67.9 | 82.9 | 21 / 35 | 4749 |
| 5 | 1 | 68.7 | 86.7 | 21 / 35 | 4781 |
| 6 | 1 | 68.1 | 84.8 | 17 / 35 | 4832 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 76% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 72% |
| gre.svman4.Leonidas 1.3.2 | 29 | 90% |
| labg.Cataclysm 2.05 | 11 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| sanja.First 0.1 | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 34% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 22% | 51 |
| gre.svman4.Leonidas 1.3.2 | 12 | 12% | 28 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 12% | 18 |
| labg.Cataclysm 2.05 | 7 | 7% | 16 |
| zyx.micro.Ant 1.1 | 7 | 7% | 10 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 4% | 5 |
| baal.nano.N 1.42 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 3 |

## Melee bench: F34

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.3 | 69 / 210 | 2.41 | 17.3% | 29483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.7 | 17.3% | 69 |
| kid.Gladiator .7.2 | 2.0 | 16.7% | 56 |
| stelo.Spread 0.9 | 2.3 | 16.2% | 69 |
| tcf.Reach 3 | 4.3 | 11.4% | 7 |
| jcs.Seth 1.8 | 5.0 | 10.4% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 2 |
| ratosh.Wesco 1.4 | 7.2 | 6.8% | 2 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.9 | 14 / 35 | 4630 |
| 2 | 2 | 65.8 | 79.4 | 10 / 35 | 4452 |
| 3 | 3 | 66.2 | 81.0 | 9 / 35 | 4555 |
| 4 | 1 | 69.3 | 88.3 | 13 / 35 | 5654 |
| 5 | 1 | 68.6 | 85.4 | 13 / 35 | 5369 |
| 6 | 2 | 67.1 | 84.1 | 10 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 56 | 52% |
| stelo.Spread 0.9 | 52 | 40% |
| jcs.Seth 1.8 | 12 | 83% |
| tcf.Reach 3 | 9 | 56% |
| cli.Dancer 1.1 | 2 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |
| sample.RamFire 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 39% | 76 |
| kid.Gladiator .7.2 | 49 | 35% | 72 |
| tcf.Reach 3 | 14 | 10% | 23 |
| jcs.Seth 1.8 | 10 | 7% | 20 |
| ratosh.Wesco 1.4 | 10 | 7% | 11 |
| cli.Dancer 1.1 | 2 | 1% | 6 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 73.2 | 20 / 210 | 3.41 | 13.7% | 19162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.6% | 163 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 13.7% | 20 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 12 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 12.1% | 9 |
| rz.HawkOnFire 0.1 | 4.3 | 12.1% | 6 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.0% | 0 |
| wit.Chuliath 1.0 | 6.7 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 68.6 | 2 / 35 | 3130 |
| 2 | 2 | 61.6 | 72.4 | 5 / 35 | 3241 |
| 3 | 2 | 61.3 | 74.0 | 4 / 35 | 3015 |
| 4 | 2 | 62.4 | 78.1 | 2 / 35 | 3334 |
| 5 | 2 | 61.0 | 74.0 | 6 / 35 | 2875 |
| 6 | 2 | 61.3 | 72.4 | 1 / 35 | 3567 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 39 | 10% |
| gh.mini.Gruwel 0.9 | 9 | 33% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 78% |
| rz.HawkOnFire 0.1 | 8 | 63% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 124 | 65% | 130 |
| rz.HawkOnFire 0.1 | 23 | 12% | 27 |
| gh.mini.Gruwel 0.9 | 20 | 11% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 6% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 4 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.2 | 158 / 210 | 1.70 | 20.4% | 30777 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.4% | 158 |
| alpha.RainingFire 1.0 | 2.5 | 12.3% | 19 |
| bzdp.Pansy 2.1 | 2.8 | 12.0% | 11 |
| mz.Cork 0.1 | 3.8 | 10.6% | 6 |
| m3thos.Eva02 0.7.1 | 5.3 | 9.8% | 5 |
| bvh.micro.Freya 0.3 | 5.7 | 9.7% | 8 |
| bvh.mini.Fenrir 0.39 | 6.8 | 8.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.3% | 1 |
| dl.BetterWalls 1.0 | 8.8 | 5.4% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 27 / 35 | 5038 |
| 2 | 1 | 71.4 | 96.5 | 30 / 35 | 5176 |
| 3 | 1 | 70.6 | 91.4 | 26 / 35 | 5426 |
| 4 | 1 | 70.7 | 92.4 | 27 / 35 | 5226 |
| 5 | 1 | 70.1 | 91.7 | 25 / 35 | 5177 |
| 6 | 1 | 69.2 | 90.8 | 23 / 35 | 4734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 96% |
| bvh.mini.Fenrir 0.39 | 26 | 100% |
| mz.Cork 0.1 | 23 | 87% |
| alpha.RainingFire 1.0 | 23 | 78% |
| m3thos.Eva02 0.7.1 | 20 | 85% |
| bvh.micro.Freya 0.3 | 19 | 89% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 39% | 38 |
| bzdp.Pansy 2.1 | 9 | 17% | 65 |
| mz.Cork 0.1 | 6 | 11% | 27 |
| bvh.mini.Fenrir 0.39 | 6 | 11% | 19 |
| bvh.micro.Freya 0.3 | 5 | 9% | 18 |
| m3thos.Eva02 0.7.1 | 3 | 6% | 22 |
| sample.MyFirstRobot 1.0 | 3 | 6% | 10 |
| dl.BetterWalls 1.0 | 1 | 2% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 82.7 | 123 / 210 | 2.56 | 17.4% | 30199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.4% | 123 |
| germ.TheMind .2 | 2.2 | 11.3% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.3% | 6 |
| EBBU.Sim2 1.02 | 4.3 | 10.0% | 9 |
| stelo.UntouchableNano 1.3 | 5.3 | 9.5% | 16 |
| lmk.ACPFinal 0.1 | 6.7 | 8.9% | 10 |
| agrach.Dalek 1.0 | 6.7 | 8.8% | 10 |
| mb.Beast 0.1 | 8.0 | 8.3% | 12 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.7% | 1 |
| skm.Ryubot 1.0 | 9.0 | 7.9% | 8 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.3 | 22 / 35 | 5087 |
| 2 | 1 | 65.0 | 81.6 | 20 / 35 | 4906 |
| 3 | 1 | 66.2 | 85.1 | 20 / 35 | 5002 |
| 4 | 1 | 65.4 | 80.0 | 20 / 35 | 5316 |
| 5 | 1 | 65.7 | 84.4 | 20 / 35 | 4847 |
| 6 | 1 | 65.7 | 83.8 | 21 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 76% |
| stelo.UntouchableNano 1.3 | 24 | 67% |
| skm.Ryubot 1.0 | 19 | 89% |
| EBBU.Sim2 1.02 | 18 | 78% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 100% |
| mb.Beast 0.1 | 13 | 100% |
| lmk.ACPFinal 0.1 | 12 | 92% |
| agrach.Dalek 1.0 | 6 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 27 | 31% | 55 |
| stelo.UntouchableNano 1.3 | 12 | 14% | 27 |
| lmk.ACPFinal 0.1 | 9 | 10% | 26 |
| EBBU.Sim2 1.02 | 9 | 10% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 9 | 10% | 23 |
| agrach.Dalek 1.0 | 8 | 9% | 21 |
| mb.Beast 0.1 | 5 | 6% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 6% | 8 |
| skm.Ryubot 1.0 | 4 | 5% | 11 |

## Melee bench: F38

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.2 | 57 / 210 | 3.05 | 15.4% | 24088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.0% | 91 |
| hadur117.mini.DeiseD 0.2 | 2.0 | 15.4% | 57 |
| bvh.mini.Freya 0.55 | 3.0 | 12.5% | 16 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 27 |
| cs.Wren 1.0 | 5.3 | 10.5% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.3% | 7 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.6% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.6% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.6% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.2 | 65.7 | 5 / 35 | 3972 |
| 2 | 2 | 64.5 | 78.4 | 10 / 35 | 4262 |
| 3 | 2 | 64.7 | 79.0 | 12 / 35 | 4034 |
| 4 | 2 | 63.6 | 79.4 | 7 / 35 | 4074 |
| 5 | 2 | 65.4 | 81.3 | 14 / 35 | 4088 |
| 6 | 2 | 63.6 | 79.4 | 9 / 35 | 3658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 41% |
| cs.Wren 1.0 | 13 | 85% |
| bvh.mini.Freya 0.55 | 13 | 92% |
| bts.mega.Gnarly 1.4 | 13 | 23% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 50% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |
| bzdp.BoxCar 2.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 712. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 56 | 37% | 75 |
| bts.mega.Gnarly 1.4 | 30 | 20% | 36 |
| bvh.mini.Freya 0.55 | 29 | 19% | 38 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 10% | 19 |
| cs.Wren 1.0 | 10 | 7% | 21 |
| kdf.KoulDestroyer 1.0 | 9 | 6% | 14 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.5 | 97 / 210 | 2.49 | 17.2% | 27247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 17.2% | 97 |
| bvh.fry.Freya 0.82 | 1.8 | 15.6% | 36 |
| az.Ololobot 0.2.4 | 3.5 | 11.7% | 39 |
| catcat20.Lambda 0.024 | 3.5 | 10.7% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.1% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.3% | 2 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.2% | 1 |
| gimp.GimpBot 0.1 | 7.2 | 7.8% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.2 | 18 / 35 | 4717 |
| 2 | 1 | 66.2 | 84.4 | 15 / 35 | 4655 |
| 3 | 1 | 66.9 | 85.7 | 17 / 35 | 4783 |
| 4 | 1 | 66.0 | 82.9 | 16 / 35 | 4576 |
| 5 | 1 | 67.3 | 87.6 | 19 / 35 | 4477 |
| 6 | 2 | 63.3 | 77.1 | 12 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 46 | 74% |
| catcat20.Lambda 0.024 | 32 | 78% |
| az.Ololobot 0.2.4 | 23 | 57% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 82% |
| gimp.GimpBot 0.1 | 6 | 67% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |

Hadur died in 114 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 48 | 42% | 78 |
| catcat20.Lambda 0.024 | 19 | 17% | 42 |
| az.Ololobot 0.2.4 | 17 | 15% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 13% | 27 |
| gimp.GimpBot 0.1 | 4 | 4% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 4 | 4% | 4 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 4 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 3 |

## Melee bench: F40

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.1 | 90 / 210 | 2.52 | 17.4% | 26974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.2 | 17.4% | 90 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.6% | 56 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.3% | 25 |
| mz.AntiGrav 1.0 | 4.3 | 11.0% | 15 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.8% | 9 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 6 |
| stelo.Randomness 1.0 | 6.5 | 8.7% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.5% | 1 |
| sample.Corners 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.9 | 20 / 35 | 4836 |
| 2 | 1 | 65.8 | 81.0 | 13 / 35 | 4292 |
| 3 | 1 | 68.7 | 87.9 | 21 / 35 | 4782 |
| 4 | 1 | 66.9 | 84.1 | 13 / 35 | 4650 |
| 5 | 1 | 65.6 | 81.3 | 14 / 35 | 4307 |
| 6 | 2 | 64.0 | 76.2 | 9 / 35 | 4107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 63% |
| kano.gamma.KanoGamma 1.8 | 22 | 68% |
| Polkwane.SmashMelee 1.0 | 12 | 92% |
| mz.AntiGrav 1.0 | 12 | 83% |
| stelo.Randomness 1.0 | 10 | 90% |
| alpha.BlackIce 1.0 | 3 | 67% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 38% | 72 |
| kano.gamma.KanoGamma 1.8 | 24 | 20% | 44 |
| mz.AntiGrav 1.0 | 17 | 14% | 28 |
| alpha.BlackIce 1.0 | 11 | 9% | 17 |
| stelo.Randomness 1.0 | 10 | 8% | 21 |
| Polkwane.SmashMelee 1.0 | 8 | 7% | 13 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| sample.Corners 1.0 | 1 | 1% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |

## Melee bench: F41

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.4 | 109 / 210 | 2.40 | 17.3% | 23831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 17.3% | 109 |
| eem.EvBotNG v12.8 | 2.2 | 15.2% | 54 |
| ary.Swarm 1.1 | 3.0 | 13.4% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.9% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.0% | 19 |
| shrub.Silver v048 | 6.2 | 9.2% | 2 |
| zyx.nano.Ant 1.1 | 7.0 | 7.1% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 84.4 | 16 / 35 | 3766 |
| 2 | 1 | 65.9 | 81.3 | 14 / 35 | 3973 |
| 3 | 1 | 67.9 | 87.6 | 21 / 35 | 4060 |
| 4 | 1 | 66.3 | 80.3 | 18 / 35 | 4129 |
| 5 | 1 | 68.0 | 88.9 | 19 / 35 | 3886 |
| 6 | 1 | 67.3 | 83.8 | 21 / 35 | 4017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 59 | 64% |
| lessonz.robocode.Oz 0.5.0 | 33 | 85% |
| ary.Swarm 1.1 | 27 | 89% |
| simonton.nano.MeleeSeed 1.8 | 22 | 73% |
| shrub.Silver v048 | 2 | 50% |
| jsal.Jsalbot 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 36 | 35% | 74 |
| simonton.nano.MeleeSeed 1.8 | 22 | 22% | 36 |
| ary.Swarm 1.1 | 18 | 18% | 49 |
| lessonz.robocode.Oz 0.5.0 | 12 | 12% | 28 |
| shrub.Silver v048 | 5 | 5% | 6 |
| acogdev.alpha 0.2 | 4 | 4% | 5 |
| zyx.nano.Ant 1.1 | 3 | 3% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.0 | 90 / 210 | 2.17 | 18.1% | 30419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 18.1% | 90 |
| wompi.Wallaby 5.1 | 2.2 | 15.6% | 58 |
| maribo.mini.MiniQuester 0.1 | 3.0 | 13.4% | 30 |
| ara.Shera 0.88 | 3.8 | 12.0% | 28 |
| amz.NanoClone 1.41 | 5.0 | 9.6% | 1 |
| maribo.IotaCT 1.1 | 6.5 | 7.8% | 1 |
| dsw.StaticD 1.0 | 6.8 | 6.8% | 2 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.3 | 15 / 35 | 5476 |
| 2 | 1 | 67.2 | 86.7 | 13 / 35 | 4861 |
| 3 | 1 | 67.1 | 85.7 | 15 / 35 | 4810 |
| 4 | 1 | 67.0 | 84.4 | 12 / 35 | 5224 |
| 5 | 1 | 67.4 | 86.0 | 16 / 35 | 4842 |
| 6 | 1 | 69.1 | 92.1 | 19 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 62 | 56% |
| maribo.mini.MiniQuester 0.1 | 37 | 65% |
| ara.Shera 0.88 | 34 | 53% |
| dsw.StaticD 1.0 | 8 | 75% |
| amz.NanoClone 1.41 | 4 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 39% | 91 |
| ara.Shera 0.88 | 34 | 28% | 50 |
| maribo.mini.MiniQuester 0.1 | 23 | 19% | 43 |
| amz.NanoClone 1.41 | 11 | 9% | 15 |
| dsw.StaticD 1.0 | 4 | 3% | 8 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.7 | 30 / 210 | 3.28 | 14.4% | 21757 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 156 |
| hadur117.mini.DeiseD 0.2 | 2.2 | 14.4% | 30 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.7% | 6 |
| brainfade.melee.Dusk 0.44 | 3.8 | 11.8% | 12 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.1% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.4% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 75.2 | 5 / 35 | 3774 |
| 2 | 3 | 60.6 | 67.3 | 2 / 35 | 3263 |
| 3 | 2 | 62.5 | 72.7 | 2 / 35 | 3607 |
| 4 | 2 | 64.9 | 77.1 | 9 / 35 | 3717 |
| 5 | 2 | 64.4 | 77.5 | 6 / 35 | 3848 |
| 6 | 2 | 64.2 | 78.1 | 6 / 35 | 3548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 50 | 16% |
| brainfade.melee.Dusk 0.44 | 15 | 67% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 2 | 50% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 126 | 70% | 136 |
| dummy.micro.Sparrow 2.5 | 17 | 9% | 23 |
| brainfade.melee.Dusk 0.44 | 12 | 7% | 19 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 7 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| mz.NanoGod 2.02 | 2 | 1% | 4 |
| cvt.Firsty 1.0 | 1 | 1% | 3 |

## Melee bench: F44

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.8 | 119 / 210 | 1.91 | 19.2% | 30045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 19.2% | 119 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.4% | 22 |
| stelo.Liblix 0.3.1 | 2.5 | 15.3% | 57 |
| wompi.Quokka 1.6 | 4.0 | 10.6% | 6 |
| jwirde.Gort 2.0 | 5.5 | 9.0% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 8.6% | 1 |
| disan.Chair 2.2.0 | 7.0 | 7.4% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 19 / 35 | 4895 |
| 2 | 1 | 69.2 | 87.6 | 21 / 35 | 5191 |
| 3 | 1 | 67.0 | 85.4 | 14 / 35 | 4485 |
| 4 | 1 | 70.1 | 92.7 | 19 / 35 | 5254 |
| 5 | 1 | 71.6 | 95.6 | 25 / 35 | 5275 |
| 6 | 1 | 69.2 | 89.8 | 21 / 35 | 4945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 62% |
| tzu.TheArtOfWar 1.2 | 54 | 78% |
| disan.Chair 2.2.0 | 12 | 92% |
| wompi.Quokka 1.6 | 12 | 67% |
| jwirde.Gort 2.0 | 7 | 57% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 75% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 43 | 47% | 92 |
| tzu.TheArtOfWar 1.2 | 25 | 27% | 66 |
| wompi.Quokka 1.6 | 6 | 7% | 14 |
| jwirde.Gort 2.0 | 6 | 7% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 7% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 4 |
| disan.Chair 2.2.0 | 1 | 1% | 6 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.4 | 109 / 210 | 1.78 | 20.5% | 35462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.2 | 1.0 | 20.5% | 109 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.6% | 83 |
| jje.BagPuss 1.2 | 3.7 | 10.9% | 2 |
| sul.Lunar 1.1 | 4.0 | 10.8% | 6 |
| myl.nano.Graviton 1.10 | 4.2 | 10.3% | 5 |
| fm.claire 1.7 | 6.5 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 6.7 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.8% | 3 |
| wit.Deep7 2.0 | 9.0 | 5.6% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.9 | 16 / 35 | 5825 |
| 2 | 1 | 71.4 | 94.0 | 23 / 35 | 5811 |
| 3 | 1 | 71.2 | 94.0 | 21 / 35 | 5778 |
| 4 | 1 | 70.7 | 92.7 | 19 / 35 | 5937 |
| 5 | 1 | 70.1 | 88.9 | 18 / 35 | 6017 |
| 6 | 1 | 69.8 | 89.8 | 12 / 35 | 6094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 120 | 47% |
| sul.Lunar 1.1 | 21 | 95% |
| myl.nano.Graviton 1.10 | 13 | 77% |
| jje.BagPuss 1.2 | 9 | 89% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 100% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 2242. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 67 | 66% | 0 |
| myl.nano.Graviton 1.10 | 9 | 9% | 42 |
| sul.Lunar 1.1 | 7 | 7% | 73 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 24 |
| jje.BagPuss 1.2 | 5 | 5% | 33 |
| fm.claire 1.7 | 5 | 5% | 12 |
| wit.Deep7 2.0 | 2 | 2% | 8 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |
| hvilela.HVilela 0.9 | 0 | 0% | 9 |

## Melee bench: F46

hadur117.mini.DeiseD 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.0 | 17 / 210 | 3.52 | 14.2% | 25443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 83 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.1% | 95 |
| hadur117.mini.DeiseD 0.2 | 3.0 | 14.2% | 17 |
| cx.Princess 1.0 | 4.7 | 10.2% | 10 |
| mz.MicroSheep 1.0 | 5.0 | 10.2% | 2 |
| sadoner.killer 0.2 | 5.3 | 9.5% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 75.2 | 4 / 35 | 4307 |
| 2 | 3 | 61.1 | 70.5 | 3 / 35 | 3985 |
| 3 | 3 | 59.9 | 67.0 | 1 / 35 | 3884 |
| 4 | 3 | 62.8 | 72.1 | 4 / 35 | 4524 |
| 5 | 3 | 62.8 | 74.0 | 2 / 35 | 4571 |
| 6 | 3 | 62.5 | 73.3 | 3 / 35 | 4172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 29 | 17% |
| rsalesc.melee.Medina 0.4.5 | 23 | 0% |
| mz.MicroSheep 1.0 | 5 | 80% |
| cx.Princess 1.0 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 77 | 40% | 77 |
| kc.mini.Mirage 0.2 | 71 | 37% | 78 |
| cx.Princess 1.0 | 19 | 10% | 22 |
| arthord.NanoSatanMelee Beta | 10 | 5% | 10 |
| mz.MicroSheep 1.0 | 9 | 5% | 12 |
| sadoner.killer 0.2 | 7 | 4% | 8 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 2 |
| jeremyreeder.collective.Prophet 5 | 0 | 0% | 1 |

