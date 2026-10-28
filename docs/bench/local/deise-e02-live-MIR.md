# Bench suite: suite.txt

## Melee bench: F01

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.4 | 36 / 210 | 2.40 | 16.8% | 30457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 150 |
| kc.mini.Mirage 0.2 | 2.0 | 16.8% | 36 |
| sgp.JollyNinja 3.53 | 3.0 | 12.1% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.5% | 2 |
| lorneswork.Predator 1.0 | 5.2 | 9.8% | 1 |
| mz.MicroGodMelee 1 | 5.3 | 9.7% | 2 |
| adt.Ar2 1.0 | 7.0 | 6.9% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 83.8 | 6 / 35 | 4849 |
| 2 | 2 | 66.7 | 86.0 | 4 / 35 | 5169 |
| 3 | 2 | 66.9 | 84.1 | 7 / 35 | 5256 |
| 4 | 2 | 64.8 | 79.4 | 6 / 35 | 4850 |
| 5 | 2 | 67.3 | 87.3 | 10 / 35 | 4990 |
| 6 | 2 | 67.0 | 85.7 | 3 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 9% |
| sgp.JollyNinja 3.53 | 23 | 57% |
| mz.MicroGodMelee 1 | 5 | 100% |
| lorneswork.Predator 1.0 | 4 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| adt.Ar2 1.0 | 2 | 50% |

Hadur died in 174 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 71% | 136 |
| sgp.JollyNinja 3.53 | 31 | 18% | 38 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 3% | 11 |
| lorneswork.Predator 1.0 | 6 | 3% | 10 |
| mz.MicroGodMelee 1 | 5 | 3% | 12 |
| adt.Ar2 1.0 | 2 | 1% | 3 |

## Melee bench: F02

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.6 | 107 / 210 | 2.39 | 18.5% | 31492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.5% | 107 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.0% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 12.4% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.8% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.8% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 7.9% | 0 |
| Noran.BitchingElk 0.054 | 6.8 | 7.9% | 10 |
| sch.Simone 0.3d | 8.0 | 7.5% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 6.7% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.0 | 19 / 35 | 5477 |
| 2 | 1 | 65.2 | 77.8 | 13 / 35 | 4786 |
| 3 | 1 | 68.1 | 85.7 | 19 / 35 | 5046 |
| 4 | 1 | 69.1 | 86.0 | 21 / 35 | 5702 |
| 5 | 1 | 68.6 | 88.9 | 20 / 35 | 5051 |
| 6 | 1 | 67.2 | 81.9 | 15 / 35 | 5430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 53% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 83% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 77% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| stelo.PatternRobot 1.0 | 10 | 100% |
| Noran.BitchingElk 0.054 | 8 | 38% |
| sch.Simone 0.3d | 7 | 86% |
| fullsail.SweetTea 1.1 | 6 | 67% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 36% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 25% | 61 |
| Noran.BitchingElk 0.054 | 10 | 9% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 8% | 22 |
| stelo.PatternRobot 1.0 | 8 | 8% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 10 |
| sch.Simone 0.3d | 5 | 5% | 14 |
| fullsail.SweetTea 1.1 | 2 | 2% | 6 |
| fnc.bandit.Bandit 5.2.0 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.6 | 168 / 210 | 1.49 | 20.8% | 37212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 168 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.3% | 11 |
| radnor.DoctorBob 1.42 | 3.2 | 12.8% | 12 |
| vuen.Cake 2.51 | 3.3 | 12.1% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.8% | 3 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 8.0 | 6.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.3 | 27 / 35 | 5986 |
| 2 | 1 | 71.5 | 95.9 | 30 / 35 | 6033 |
| 3 | 1 | 70.8 | 95.9 | 27 / 35 | 6066 |
| 4 | 1 | 71.6 | 94.9 | 29 / 35 | 6568 |
| 5 | 1 | 71.1 | 92.7 | 28 / 35 | 6201 |
| 6 | 1 | 71.0 | 93.7 | 27 / 35 | 6358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 86% |
| kawigi.nano.Lib 1.0 | 67 | 94% |
| radnor.DoctorBob 1.42 | 36 | 92% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 15 | 35% | 81 |
| kawigi.nano.Lib 1.0 | 10 | 23% | 69 |
| radnor.DoctorBob 1.42 | 9 | 21% | 35 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 7% | 6 |
| urdos.URDOS 1.3 | 3 | 7% | 6 |
| oa.weak.FlyMk1 0.1 | 2 | 5% | 6 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

## Melee bench: F04

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.7 | 26 / 210 | 2.20 | 18.0% | 36356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 171 |
| kc.mini.Mirage 0.2 | 2.0 | 18.0% | 26 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 8 |
| TNT.TNT 0.99.1 | 4.2 | 10.0% | 1 |
| josago.Jorgito 0.16 | 4.8 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.1% | 2 |
| css.Delitioner 0.11 | 7.0 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 7.7 | 5.6% | 1 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 85.1 | 2 / 35 | 6142 |
| 2 | 2 | 69.6 | 88.3 | 7 / 35 | 6399 |
| 3 | 2 | 68.9 | 87.6 | 7 / 35 | 5806 |
| 4 | 2 | 68.2 | 85.7 | 1 / 35 | 6152 |
| 5 | 2 | 68.9 | 87.0 | 6 / 35 | 5920 |
| 6 | 2 | 68.5 | 86.7 | 3 / 35 | 5937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 158 | 11% |
| spin.Bugstard 0.012b | 4 | 75% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| TNT.TNT 0.99.1 | 3 | 67% |
| tj.zombie1n 1.0.1 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 1183. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 155 | 84% | 176 |
| apc.LeeroyJenkins2 1.0 | 11 | 6% | 13 |
| josago.Jorgito 0.16 | 6 | 3% | 7 |
| tj.zombie1n 1.0.1 | 5 | 3% | 5 |
| TNT.TNT 0.99.1 | 3 | 2% | 6 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |

## Melee bench: F05

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 71.0 | 24 / 210 | 3.61 | 13.6% | 21579 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.2% | 109 |
| justin.DemonicRage 3.4 | 1.7 | 17.6% | 56 |
| kc.mini.Mirage 0.2 | 3.2 | 13.6% | 24 |
| wompi.Numbat 2.1 | 3.8 | 12.4% | 14 |
| ms.Ares 0.19 | 5.3 | 9.0% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 6 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 73.7 | 3 / 35 | 3646 |
| 2 | 4 | 59.4 | 64.4 | 3 / 35 | 3709 |
| 3 | 3 | 60.7 | 69.5 | 3 / 35 | 3546 |
| 4 | 3 | 62.7 | 73.7 | 7 / 35 | 3660 |
| 5 | 3 | 60.9 | 71.1 | 3 / 35 | 3290 |
| 6 | 3 | 62.0 | 73.3 | 5 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 36 | 33% |
| cb.fire.Firestarter 2.0f | 34 | 18% |
| wompi.Numbat 2.1 | 5 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 72 | 39% | 85 |
| cb.fire.Firestarter 2.0f | 60 | 32% | 66 |
| wompi.Numbat 2.1 | 25 | 13% | 29 |
| ms.Ares 0.19 | 13 | 7% | 13 |
| axeBots.HataMoto 3.09 | 9 | 5% | 9 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.4 | 132 / 210 | 1.86 | 19.3% | 29626 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 132 |
| jekl.StoneGhost 0.7 | 2.0 | 14.6% | 24 |
| origin.SleepSiphon 1.7b | 3.0 | 12.4% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.4% | 12 |
| mld.Wisdom 1.0 | 4.7 | 10.6% | 3 |
| gg.Wolverine 2.0 | 6.3 | 8.5% | 5 |
| spinnercat.Omen 1.0 | 7.7 | 6.9% | 0 |
| DBall.NUKE 0.1 | 7.8 | 6.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.6% | 3 |
| sample.Fire 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 89.8 | 21 / 35 | 5260 |
| 2 | 1 | 68.1 | 87.6 | 20 / 35 | 4444 |
| 3 | 1 | 67.9 | 87.9 | 20 / 35 | 4679 |
| 4 | 1 | 70.2 | 94.6 | 27 / 35 | 4614 |
| 5 | 1 | 70.1 | 92.1 | 23 / 35 | 5269 |
| 6 | 1 | 69.7 | 90.5 | 21 / 35 | 5360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 68 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 91% |
| origin.SleepSiphon 1.7b | 32 | 69% |
| gg.Wolverine 2.0 | 10 | 80% |
| mld.Wisdom 1.0 | 7 | 86% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 26 | 32% | 73 |
| origin.SleepSiphon 1.7b | 24 | 30% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 15% | 33 |
| mld.Wisdom 1.0 | 10 | 12% | 20 |
| gg.Wolverine 2.0 | 5 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 11 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F07

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.6 | 117 / 210 | 1.66 | 20.3% | 37864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.3% | 117 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.3% | 44 |
| rtk.Tachikoma 1.0 | 3.0 | 15.6% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.4% | 15 |
| franzor.Lizt 1.3.1 | 5.0 | 10.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.2% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.0 | 19 / 35 | 5903 |
| 2 | 1 | 71.1 | 90.8 | 16 / 35 | 6255 |
| 3 | 1 | 71.1 | 91.1 | 15 / 35 | 6332 |
| 4 | 1 | 71.6 | 92.1 | 20 / 35 | 6198 |
| 5 | 1 | 73.0 | 95.2 | 23 / 35 | 6762 |
| 6 | 1 | 72.6 | 93.7 | 24 / 35 | 6414 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 77% |
| rsalesc.melee.Monk 0.3.6c | 45 | 31% |
| oog.melee.CapuletDroid 1.1 | 28 | 75% |
| franzor.Lizt 1.3.1 | 16 | 75% |

Hadur died in 94 of 210 rounds, at a mean tick of 1260. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 50% | 72 |
| rtk.Tachikoma 1.0 | 30 | 32% | 101 |
| oog.melee.CapuletDroid 1.1 | 12 | 13% | 29 |
| franzor.Lizt 1.3.1 | 4 | 4% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 3 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 91.1 | 145 / 210 | 1.80 | 20.4% | 33904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 145 |
| shrub.Vapour v159 | 2.7 | 12.9% | 26 |
| tm.Yuugao 1.0 | 2.8 | 11.9% | 17 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.3% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.5% | 7 |
| m3thos.Eva00 1.1 | 5.8 | 8.8% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.4% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.6% | 1 |
| SHAM.WOW 1.4 | 9.3 | 5.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 23 / 35 | 5462 |
| 2 | 1 | 70.7 | 92.1 | 25 / 35 | 5565 |
| 3 | 1 | 70.1 | 92.1 | 25 / 35 | 5433 |
| 4 | 1 | 70.7 | 92.1 | 22 / 35 | 5962 |
| 5 | 1 | 68.2 | 82.9 | 20 / 35 | 5564 |
| 6 | 1 | 72.0 | 96.2 | 30 / 35 | 5918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 55 | 82% |
| shrub.Vapour v159 | 40 | 85% |
| Krabb.sliNk.Garm 0.9u | 26 | 77% |
| jwst.DAD.DarkAndDarker 1.1 | 24 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 17 | 94% |
| SHAM.WOW 1.4 | 3 | 100% |
| m3thos.Eva00 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 19 | 29% | 66 |
| shrub.Vapour v159 | 16 | 25% | 51 |
| Krabb.sliNk.Garm 0.9u | 9 | 14% | 26 |
| m3thos.Eva00 1.1 | 6 | 9% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 8% | 21 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 6% | 25 |
| zyx.nano.BacillusComma 1.0 | 3 | 5% | 5 |
| SHAM.WOW 1.4 | 2 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 2% | 2 |

## Melee bench: F09

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.0 | 75 / 210 | 2.98 | 16.2% | 24204 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.3% | 92 |
| kc.mini.Mirage 0.2 | 1.8 | 16.2% | 75 |
| kc.micro.Figment 1.0 | 3.0 | 12.9% | 19 |
| yagami.Tidus 0.11 | 4.5 | 10.5% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.1% | 9 |
| mc2.enemy.Original 0.9 | 5.7 | 9.3% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.8% | 3 |
| robar.nano.Assertive_Melee 0.2 | 8.7 | 5.2% | 0 |
| step.nanoPri 1.0 | 8.8 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 78.7 | 11 / 35 | 4032 |
| 2 | 2 | 65.4 | 79.0 | 12 / 35 | 4219 |
| 3 | 1 | 65.0 | 80.0 | 15 / 35 | 3968 |
| 4 | 2 | 64.2 | 76.2 | 11 / 35 | 3951 |
| 5 | 2 | 66.3 | 81.0 | 17 / 35 | 4181 |
| 6 | 2 | 62.4 | 73.0 | 9 / 35 | 3853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 64 | 42% |
| kc.micro.Figment 1.0 | 26 | 81% |
| yagami.Tidus 0.11 | 11 | 100% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| dft.Calliope 5.6 | 5 | 80% |
| pedersen.Grishnakh 1.0 | 5 | 60% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 59 | 44% | 86 |
| kc.micro.Figment 1.0 | 26 | 19% | 48 |
| mc2.enemy.Original 0.9 | 16 | 12% | 22 |
| yagami.Tidus 0.11 | 11 | 8% | 16 |
| pedersen.Grishnakh 1.0 | 9 | 7% | 13 |
| robar.nano.Assertive_Melee 0.2 | 8 | 6% | 8 |
| dft.Calliope 5.6 | 4 | 3% | 11 |
| step.nanoPri 1.0 | 1 | 1% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 2 |

## Melee bench: F10

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 95.6 | 169 / 210 | 1.40 | 20.7% | 33475 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 169 |
| DTF.Kludgy 1.2b | 2.3 | 13.8% | 17 |
| ne.Chimera 1.2 | 3.2 | 12.6% | 6 |
| ejb.Polaris 1.0.1 | 3.7 | 12.3% | 11 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.9% | 2 |
| vStar.RAFzilla 2.15 | 5.5 | 10.0% | 5 |
| kurios.DOSexe .9b | 7.7 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.4% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 97.5 | 30 / 35 | 5020 |
| 2 | 1 | 72.5 | 98.7 | 33 / 35 | 5904 |
| 3 | 1 | 71.1 | 94.0 | 27 / 35 | 5767 |
| 4 | 1 | 71.6 | 95.2 | 26 / 35 | 6109 |
| 5 | 1 | 70.0 | 92.7 | 26 / 35 | 5404 |
| 6 | 1 | 70.7 | 95.2 | 27 / 35 | 5271 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 59 | 85% |
| ejb.Polaris 1.0.1 | 47 | 87% |
| ne.Chimera 1.2 | 43 | 93% |
| vStar.RAFzilla 2.15 | 15 | 87% |
| tvv.micro.Antares 1.1.1 | 11 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 41% | 55 |
| ejb.Polaris 1.0.1 | 10 | 24% | 53 |
| ne.Chimera 1.2 | 6 | 15% | 48 |
| vStar.RAFzilla 2.15 | 5 | 12% | 17 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 13 |
| donjezza.Muncho 1.0 | 1 | 2% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 6 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| sam.Samspin 1.0 | 0 | 0% | 3 |

## Melee bench: F11

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.7 | 98 / 210 | 2.29 | 17.9% | 27577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 17.9% | 98 |
| rz.Aleph 0.34 | 2.0 | 16.1% | 65 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 15 |
| djc.DynaBot 0.1.1 | 4.0 | 10.3% | 9 |
| rdt199.Warlord 0.73 | 5.3 | 9.1% | 13 |
| br2.MobyDickBot 1.6 | 6.2 | 8.4% | 5 |
| uji.YellohFellah 1.0 | 7.2 | 7.8% | 6 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.7% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 83.8 | 14 / 35 | 4570 |
| 2 | 1 | 69.0 | 89.8 | 18 / 35 | 5098 |
| 3 | 1 | 67.9 | 87.9 | 19 / 35 | 4299 |
| 4 | 1 | 67.4 | 88.3 | 14 / 35 | 4486 |
| 5 | 1 | 67.6 | 85.1 | 18 / 35 | 4704 |
| 6 | 1 | 65.2 | 79.4 | 15 / 35 | 4420 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 68 | 49% |
| cx.mini.Nimrod 0.55 | 33 | 79% |
| djc.DynaBot 0.1.1 | 24 | 75% |
| rdt199.Warlord 0.73 | 15 | 67% |
| uji.YellohFellah 1.0 | 9 | 89% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| br2.MobyDickBot 1.6 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 54 | 48% | 89 |
| djc.DynaBot 0.1.1 | 16 | 14% | 32 |
| cx.mini.Nimrod 0.55 | 14 | 13% | 28 |
| rdt199.Warlord 0.73 | 11 | 10% | 25 |
| br2.MobyDickBot 1.6 | 6 | 5% | 11 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 8 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 3% | 4 |
| uji.YellohFellah 1.0 | 1 | 1% | 12 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F12

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.3 | 115 / 210 | 2.23 | 18.0% | 25063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.0% | 115 |
| nat.PallasHawk 1.0 | 3.0 | 12.8% | 36 |
| bts.wiki.RipCurl 0.9b | 3.2 | 13.0% | 23 |
| darkcanuck.Leon 1.01 | 3.3 | 12.2% | 20 |
| brainfade.melee.Genghis 0.36 | 4.5 | 10.9% | 10 |
| jrm.Test0 1.0 | 6.3 | 7.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.2% | 1 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.7% | 3 |
| stuff.Vlad 0.1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 21 / 35 | 4266 |
| 2 | 1 | 68.4 | 90.5 | 22 / 35 | 4050 |
| 3 | 1 | 67.2 | 86.0 | 17 / 35 | 4202 |
| 4 | 1 | 66.8 | 83.5 | 18 / 35 | 4495 |
| 5 | 1 | 66.6 | 85.7 | 17 / 35 | 3984 |
| 6 | 1 | 67.3 | 86.7 | 20 / 35 | 4066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 48 | 71% |
| bts.wiki.RipCurl 0.9b | 41 | 76% |
| darkcanuck.Leon 1.01 | 37 | 81% |
| brainfade.melee.Genghis 0.36 | 17 | 82% |
| jaybot.bots.Oddball 4.0 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 31 | 33% | 63 |
| bts.wiki.RipCurl 0.9b | 20 | 21% | 44 |
| darkcanuck.Leon 1.01 | 19 | 20% | 59 |
| brainfade.melee.Genghis 0.36 | 12 | 13% | 19 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 8 |
| jrm.Test0 1.0 | 4 | 4% | 6 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 3 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |

## Melee bench: F13

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.4 | 76 / 210 | 2.31 | 16.9% | 26698 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.9% | 76 |
| ags.Glacier 0.2.11 | 1.7 | 16.8% | 49 |
| mn.Combat 3.25.0 | 3.0 | 15.1% | 64 |
| shinh.Entangled 0.3 | 4.3 | 11.7% | 13 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.2% | 7 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 84.8 | 13 / 35 | 4411 |
| 2 | 1 | 66.2 | 85.7 | 11 / 35 | 4353 |
| 3 | 2 | 66.8 | 86.3 | 12 / 35 | 4372 |
| 4 | 1 | 65.2 | 82.2 | 10 / 35 | 4184 |
| 5 | 1 | 68.6 | 87.6 | 16 / 35 | 5088 |
| 6 | 1 | 66.4 | 86.0 | 14 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 65 | 49% |
| mn.Combat 3.25.0 | 44 | 43% |
| shinh.Entangled 0.3 | 23 | 65% |
| gh.micro.Gruweltje 0.7 | 7 | 86% |
| stelo.Wang 1.0 | 4 | 75% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 58 | 43% | 89 |
| mn.Combat 3.25.0 | 40 | 30% | 60 |
| shinh.Entangled 0.3 | 18 | 13% | 32 |
| stelo.Wang 1.0 | 10 | 7% | 11 |
| gh.micro.Gruweltje 0.7 | 6 | 4% | 12 |
| apc.Colossus2 0.17 | 1 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.7 | 165 / 210 | 1.48 | 20.8% | 33981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 165 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 16 |
| catcat20.shape.Theta 0.018 | 3.3 | 11.7% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.7% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.4% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.4% | 2 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.4 | 28 / 35 | 5734 |
| 2 | 1 | 71.6 | 96.5 | 27 / 35 | 5883 |
| 3 | 1 | 71.2 | 96.5 | 26 / 35 | 5466 |
| 4 | 1 | 71.3 | 95.9 | 28 / 35 | 5382 |
| 5 | 1 | 71.6 | 93.7 | 30 / 35 | 5782 |
| 6 | 1 | 70.8 | 93.0 | 26 / 35 | 5734 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 90% |
| catcat20.shape.Theta 0.018 | 49 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| sample.TrackFire 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 20 | 44% | 98 |
| catcat20.shape.Theta 0.018 | 19 | 42% | 57 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 7% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 4 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.6 | 121 / 210 | 2.12 | 19.6% | 34996 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 121 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.1% | 23 |
| mld.DustBunny 3.8 | 3.7 | 11.4% | 5 |
| emp.Yngwie 1.11 | 3.8 | 11.5% | 33 |
| cb.nano.Insomnia 1.0 | 4.5 | 11.1% | 13 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.7% | 14 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.2 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.2% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.1 | 22 / 35 | 5902 |
| 2 | 1 | 68.5 | 85.4 | 18 / 35 | 5596 |
| 3 | 1 | 71.7 | 94.9 | 27 / 35 | 5967 |
| 4 | 1 | 68.8 | 84.4 | 15 / 35 | 5917 |
| 5 | 1 | 68.1 | 81.9 | 17 / 35 | 5820 |
| 6 | 1 | 69.8 | 87.6 | 22 / 35 | 5794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 41 | 88% |
| emp.Yngwie 1.11 | 32 | 63% |
| cb.nano.Insomnia 1.0 | 30 | 87% |
| kawigi.robot.Girl 1.2 | 22 | 73% |
| mld.DustBunny 3.8 | 20 | 90% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 3 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 39% | 74 |
| cb.nano.Insomnia 1.0 | 16 | 18% | 16 |
| kawigi.micro.Shiz 1.1 | 13 | 15% | 48 |
| mld.DustBunny 3.8 | 9 | 10% | 31 |
| kawigi.robot.Girl 1.2 | 9 | 10% | 20 |
| divineomega.TrialBot 0.003 | 5 | 6% | 14 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 3 |

## Melee bench: F16

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.4 | 110 / 210 | 2.04 | 19.8% | 36656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 19.8% | 110 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 71 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.1% | 3 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.3% | 20 |
| tvv.nano.Polaris 1.2 | 5.2 | 8.7% | 3 |
| bvh.fnr.Fenrir 0.36l | 6.2 | 8.2% | 0 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.5% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 5.2% | 0 |
| asd.Cthulhu 1.3 | 9.0 | 5.2% | 1 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 78.7 | 12 / 35 | 5270 |
| 2 | 1 | 71.6 | 92.1 | 22 / 35 | 6404 |
| 3 | 1 | 70.2 | 88.6 | 17 / 35 | 6030 |
| 4 | 1 | 71.0 | 89.8 | 19 / 35 | 6503 |
| 5 | 1 | 71.4 | 92.4 | 21 / 35 | 6479 |
| 6 | 1 | 69.9 | 88.9 | 19 / 35 | 5970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 97 | 43% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 31 | 100% |
| techdude.forest.FlamingForest 1.1 | 19 | 74% |
| stelo.IntrinsicVolatility 1.4 | 10 | 90% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 59 | 58% | 102 |
| techdude.forest.FlamingForest 1.1 | 11 | 11% | 26 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 10% | 37 |
| bvh.fnr.Fenrir 0.36l | 10 | 10% | 14 |
| stelo.IntrinsicVolatility 1.4 | 7 | 7% | 17 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 6 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 4 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F17

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.3 | 128 / 210 | 1.78 | 19.8% | 33012 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.8% | 128 |
| et.Predator 1.8 | 2.8 | 12.8% | 19 |
| cx.BlestPain 1.41 | 2.8 | 12.5% | 30 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.3% | 22 |
| nic.Nicator 2.4 | 5.5 | 10.5% | 7 |
| ahf.NanoAndrew .4 | 5.8 | 9.9% | 3 |
| maribo.melee.BMV 0.1 | 6.7 | 8.9% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.3% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 17 / 35 | 5042 |
| 2 | 1 | 71.4 | 95.6 | 26 / 35 | 5717 |
| 3 | 1 | 69.9 | 90.8 | 19 / 35 | 5568 |
| 4 | 1 | 71.0 | 93.0 | 21 / 35 | 5844 |
| 5 | 1 | 70.8 | 93.3 | 25 / 35 | 5410 |
| 6 | 1 | 69.5 | 88.9 | 20 / 35 | 5431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 57 | 81% |
| oog.melee.Mercutio 1.0 | 45 | 78% |
| cx.BlestPain 1.41 | 36 | 42% |
| nic.Nicator 2.4 | 25 | 84% |
| ahf.NanoAndrew .4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1100. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 35% | 49 |
| et.Predator 1.8 | 18 | 22% | 58 |
| oog.melee.Mercutio 1.0 | 18 | 22% | 48 |
| ahf.NanoAndrew .4 | 9 | 11% | 21 |
| nic.Nicator 2.4 | 8 | 10% | 32 |
| maribo.melee.BMV 0.1 | 0 | 0% | 2 |

## Melee bench: F18

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.1 | 139 / 210 | 1.89 | 19.5% | 28941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 139 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.0% | 22 |
| agd.Mooserwirt2 2.7 | 3.2 | 11.4% | 12 |
| uji.DBH 1.1 | 4.0 | 10.6% | 12 |
| ratosh.Nobo 0.21 | 5.3 | 9.5% | 3 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.5% | 8 |
| sigterm.Sigterm 1.0 | 7.2 | 7.5% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.2 | 6.2% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.2 | 19 / 35 | 4853 |
| 2 | 1 | 68.9 | 90.5 | 23 / 35 | 4878 |
| 3 | 1 | 67.8 | 85.7 | 21 / 35 | 4659 |
| 4 | 1 | 70.8 | 93.7 | 29 / 35 | 5153 |
| 5 | 1 | 69.6 | 92.4 | 25 / 35 | 4834 |
| 6 | 1 | 68.5 | 89.2 | 22 / 35 | 4564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 46 | 83% |
| agd.Mooserwirt2 2.7 | 37 | 84% |
| uji.DBH 1.1 | 23 | 70% |
| sigterm.Sigterm 1.0 | 17 | 76% |
| ratosh.Nobo 0.21 | 15 | 87% |
| spinnercat.Robovirus 2.718 | 15 | 80% |
| stelo.WangRobot 1.0 | 11 | 82% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 20 | 28% | 60 |
| uji.DBH 1.1 | 12 | 17% | 16 |
| agd.Mooserwirt2 2.7 | 11 | 15% | 50 |
| ratosh.Nobo 0.21 | 7 | 10% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 8% | 15 |
| sigterm.Sigterm 1.0 | 5 | 7% | 18 |
| spinnercat.Robovirus 2.718 | 5 | 7% | 11 |
| stelo.WangRobot 1.0 | 4 | 6% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 3 |

## Melee bench: F19

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.6 | 96.7 | 187 / 210 | 1.30 | 21.6% | 34642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.6% | 187 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.4% | 11 |
| mld.Infinity 2.2 | 2.7 | 13.8% | 11 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.7% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.3% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.7 | 6.8% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.8% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.8 | 32 / 35 | 5723 |
| 2 | 1 | 73.6 | 99.4 | 34 / 35 | 6401 |
| 3 | 1 | 73.1 | 98.1 | 33 / 35 | 5833 |
| 4 | 1 | 70.5 | 89.8 | 27 / 35 | 5196 |
| 5 | 1 | 73.1 | 97.8 | 31 / 35 | 6036 |
| 6 | 1 | 72.5 | 98.1 | 30 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 92 | 95% |
| mld.Infinity 2.2 | 65 | 97% |
| krillr.mini.JointStrike 2.0.0 | 14 | 100% |
| erdnis.Rover 0.3 | 11 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 23 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 11 | 48% | 91 |
| krillr.mini.JointStrike 2.0.0 | 5 | 22% | 19 |
| mld.Infinity 2.2 | 3 | 13% | 48 |
| erdnis.Rover 0.3 | 1 | 4% | 17 |
| patson.PatsonTestBot 1.0 | 1 | 4% | 14 |
| pbg.R2D2 1.0 | 1 | 4% | 5 |
| pac.ABC 2.1 | 1 | 4% | 1 |
| mbh.Mbh 0.1 | 0 | 0% | 11 |

## Melee bench: F20

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.4 | 134 / 210 | 1.69 | 20.5% | 34850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 134 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 51 |
| fwb.Nine 1.0.1 | 3.5 | 11.1% | 7 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.4% | 3 |
| catcat20.Rabbit 0.001 | 4.3 | 10.3% | 12 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.0% | 2 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.4% | 0 |
| bayen.nut.Squirrel 1.615 | 7.8 | 6.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 25 / 35 | 5586 |
| 2 | 1 | 70.7 | 91.1 | 21 / 35 | 5987 |
| 3 | 1 | 69.3 | 88.6 | 18 / 35 | 5502 |
| 4 | 1 | 71.1 | 93.7 | 24 / 35 | 5804 |
| 5 | 1 | 71.6 | 94.0 | 25 / 35 | 5966 |
| 6 | 1 | 70.6 | 92.4 | 21 / 35 | 6005 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 96 | 59% |
| fwb.Nine 1.0.1 | 36 | 94% |
| catcat20.Rabbit 0.001 | 21 | 71% |
| nz.jdc.nano.GridFu 1.0 | 11 | 100% |
| bayen.nut.Squirrel 1.615 | 11 | 100% |
| djdjdj.NanoSkunk10 1.0 | 6 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 0% |

Hadur died in 76 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 53 | 70% | 100 |
| catcat20.Rabbit 0.001 | 10 | 13% | 29 |
| fwb.Nine 1.0.1 | 6 | 8% | 31 |
| nz.jdc.nano.GridFu 1.0 | 2 | 3% | 21 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 12 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 6 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.4 | 147 / 210 | 1.50 | 21.0% | 35438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.0% | 147 |
| eem.EvBot v4.6.16 | 2.0 | 15.6% | 48 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.0% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 10.8% | 1 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.2% | 1 |
| eld.Hmm 1.0 | 6.2 | 7.7% | 5 |
| el.JumpShoot 0.2 | 7.0 | 6.6% | 0 |
| fire219.CatBot 1.0 | 8.2 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.3 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.7 | 24 / 35 | 5629 |
| 2 | 1 | 70.5 | 93.7 | 22 / 35 | 5516 |
| 3 | 1 | 73.0 | 97.1 | 28 / 35 | 6402 |
| 4 | 1 | 72.0 | 95.2 | 26 / 35 | 5795 |
| 5 | 1 | 71.4 | 93.7 | 21 / 35 | 6114 |
| 6 | 1 | 71.9 | 95.2 | 26 / 35 | 5982 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 105 | 69% |
| dummy.mini.Scimitar 1.01 | 43 | 91% |
| cf.RiO.RiOx 4.2.1 | 27 | 100% |
| eld.Hmm 1.0 | 6 | 67% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 3 | 67% |

Hadur died in 64 of 210 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 39 | 61% | 96 |
| dummy.mini.Scimitar 1.01 | 13 | 20% | 62 |
| cf.RiO.RiOx 4.2.1 | 6 | 9% | 26 |
| eld.Hmm 1.0 | 4 | 6% | 10 |
| el.JumpShoot 0.2 | 2 | 3% | 4 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.7 | 104 / 210 | 2.01 | 18.7% | 30583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 104 |
| pe.SandboxDT 2.71m | 2.0 | 16.6% | 60 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.1% | 25 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.1% | 14 |
| bigpete.Stewie 1.0 | 4.8 | 10.5% | 6 |
| yk.JahRoslav 1.1 | 6.7 | 7.0% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.9% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.2 | 4.7% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.3 | 14 / 35 | 4782 |
| 2 | 1 | 69.3 | 88.3 | 18 / 35 | 5322 |
| 3 | 1 | 68.1 | 86.3 | 12 / 35 | 5208 |
| 4 | 1 | 68.2 | 87.6 | 14 / 35 | 4825 |
| 5 | 1 | 70.8 | 92.7 | 24 / 35 | 5461 |
| 6 | 1 | 69.6 | 90.2 | 22 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 61 | 77% |
| pe.SandboxDT 2.71m | 43 | 28% |
| jlm.javaDisturbance 0.59 | 33 | 91% |
| bigpete.Stewie 1.0 | 14 | 79% |
| gg.Squaraus 0.6 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 56 | 53% | 82 |
| kvk.HebusLeTroll 0.35 | 31 | 29% | 61 |
| jlm.javaDisturbance 0.59 | 10 | 9% | 42 |
| bigpete.Stewie 1.0 | 5 | 5% | 14 |
| tad.Dalek98 0.98 | 4 | 4% | 5 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.3 | 112 / 210 | 1.97 | 19.5% | 34221 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 19.5% | 112 |
| pe.SandboxLump 1.52 | 1.8 | 17.3% | 66 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.3% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.9% | 7 |
| cw.megas.Blade 0.8 | 6.0 | 8.7% | 0 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 1 |
| sample.Walls 1.0 | 8.0 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.6% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 19 / 35 | 5831 |
| 2 | 1 | 70.9 | 89.5 | 20 / 35 | 5926 |
| 3 | 2 | 70.2 | 88.9 | 17 / 35 | 5333 |
| 4 | 1 | 68.4 | 83.8 | 14 / 35 | 5427 |
| 5 | 1 | 70.0 | 90.8 | 19 / 35 | 5953 |
| 6 | 1 | 70.5 | 90.5 | 23 / 35 | 5751 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 104 | 56% |
| cre.Karolos 0.32 | 27 | 70% |
| stelo.AreaTargetingBot 1.1 | 22 | 91% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 40% |
| sample.Walls 1.0 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 54 | 55% | 109 |
| cre.Karolos 0.32 | 29 | 30% | 52 |
| stelo.AreaTargetingBot 1.1 | 9 | 9% | 22 |
| stelo.RamTrackSurfer 1.2 | 5 | 5% | 12 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 6 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F24

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.8 | 88 / 210 | 2.82 | 16.3% | 23583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 16.3% | 88 |
| florent.XSeries.X2 0.12 | 2.7 | 13.5% | 38 |
| davidalves.Phoenix 0.54 | 3.0 | 13.3% | 41 |
| rz.GlowBlowMelee 1.4 | 3.5 | 13.2% | 28 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 12 |
| oog.melee.Corsair 1.0 | 6.0 | 8.8% | 1 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.6% | 3 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 5.1% | 0 |
| evd.X1 0.01 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 81.3 | 15 / 35 | 3972 |
| 2 | 1 | 64.6 | 77.8 | 14 / 35 | 4004 |
| 3 | 1 | 67.6 | 87.3 | 20 / 35 | 4368 |
| 4 | 1 | 63.5 | 77.8 | 13 / 35 | 3575 |
| 5 | 1 | 63.9 | 77.8 | 13 / 35 | 3709 |
| 6 | 1 | 63.7 | 76.8 | 13 / 35 | 3955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 74% |
| davidalves.Phoenix 0.54 | 30 | 53% |
| florent.XSeries.X2 0.12 | 29 | 62% |
| pedersen.Ugluk 1.1.1 | 22 | 77% |
| stelo.SoJNanoMelee 1.1 | 11 | 100% |
| oog.melee.Corsair 1.0 | 3 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 29% | 53 |
| davidalves.Phoenix 0.54 | 31 | 25% | 50 |
| rz.GlowBlowMelee 1.4 | 23 | 19% | 45 |
| pedersen.Ugluk 1.1.1 | 16 | 13% | 30 |
| stelo.SoJNanoMelee 1.1 | 9 | 7% | 14 |
| evd.X1 0.01 | 4 | 3% | 4 |
| oog.melee.Corsair 1.0 | 3 | 2% | 6 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 5 |
| as.FrankTheTank 1.3 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F25

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.9 | 152 / 210 | 1.91 | 19.6% | 26958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 152 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.3% | 13 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 12.8% | 12 |
| jdw.Hurricane 1.4 | 4.0 | 11.0% | 18 |
| ds.Oo 2.2 | 5.5 | 9.0% | 2 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.8% | 5 |
| gjr.Cephalosporin 0.1 | 6.7 | 7.9% | 6 |
| awesomeness.Elite 1.0 | 8.0 | 7.0% | 2 |
| adt.Ar2 1.1 | 8.7 | 6.3% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.1 | 26 / 35 | 4753 |
| 2 | 1 | 68.0 | 84.8 | 26 / 35 | 4253 |
| 3 | 1 | 69.5 | 89.5 | 25 / 35 | 4714 |
| 4 | 1 | 67.8 | 85.7 | 21 / 35 | 4263 |
| 5 | 1 | 70.1 | 93.7 | 26 / 35 | 4256 |
| 6 | 1 | 70.9 | 94.6 | 28 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 60 | 97% |
| voidious.mini.BrokenSword 2.0.3 | 57 | 86% |
| jdw.Hurricane 1.4 | 24 | 83% |
| ds.Oo 2.2 | 12 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| gre.svman4.Morfeas 1.4.1 | 2 | 50% |

Hadur died in 58 of 210 rounds, at a mean tick of 610. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 16 | 28% | 37 |
| voidious.micro.BlitzBat 1.05 | 15 | 26% | 55 |
| voidious.mini.BrokenSword 2.0.3 | 11 | 19% | 54 |
| gre.svman4.Morfeas 1.4.1 | 7 | 12% | 15 |
| ds.Oo 2.2 | 4 | 7% | 27 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 7 |
| adt.Ar2 1.1 | 2 | 3% | 5 |
| amk.ChumbaMini 0.2 | 1 | 2% | 3 |
| awesomeness.Elite 1.0 | 0 | 0% | 6 |

## Melee bench: F26

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.3 | 127 / 210 | 1.97 | 19.2% | 32900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 127 |
| ak.Fermat 2.0 | 2.0 | 14.7% | 41 |
| shu.nitro.LENIN .T34 | 3.3 | 12.1% | 18 |
| lrem.Spectre 0.4.4 | 3.8 | 12.0% | 17 |
| js.PinBall 1.6 | 5.5 | 10.2% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.4% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.1% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 83.5 | 17 / 35 | 4987 |
| 2 | 1 | 67.7 | 84.8 | 16 / 35 | 5031 |
| 3 | 1 | 70.5 | 92.1 | 22 / 35 | 5731 |
| 4 | 1 | 69.4 | 87.9 | 23 / 35 | 5549 |
| 5 | 1 | 70.6 | 92.4 | 24 / 35 | 5647 |
| 6 | 1 | 71.1 | 94.9 | 25 / 35 | 5955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 70% |
| shu.nitro.LENIN .T34 | 44 | 77% |
| lrem.Spectre 0.4.4 | 38 | 76% |
| js.PinBall 1.6 | 12 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 9 | 100% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 33 | 39% | 64 |
| shu.nitro.LENIN .T34 | 21 | 25% | 59 |
| lrem.Spectre 0.4.4 | 14 | 16% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 15 |
| js.PinBall 1.6 | 4 | 5% | 15 |
| gh.mini.GrubbmOne 1.0 | 3 | 4% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 4 |
| sample.SpinBot 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F27

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.2 | 156 / 210 | 1.70 | 19.9% | 29710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.9% | 156 |
| mk.Alpha 0.2.1 | 2.0 | 13.6% | 28 |
| wee.Gem 1.8.4 | 3.7 | 10.9% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 4.3 | 10.5% | 8 |
| EH.Eagle 1.0.6 | 4.5 | 10.3% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.2% | 0 |
| joe.ADinosaur 1.0 | 7.2 | 7.9% | 0 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.7% | 0 |
| caimano.Furia_Ceca 0.22 | 8.7 | 5.4% | 0 |
| cs.Grudge 1.0 | 9.3 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.5 | 22 / 35 | 4585 |
| 2 | 1 | 69.5 | 91.1 | 24 / 35 | 4811 |
| 3 | 1 | 69.6 | 90.5 | 28 / 35 | 5007 |
| 4 | 1 | 70.7 | 95.2 | 28 / 35 | 5023 |
| 5 | 1 | 69.3 | 91.1 | 24 / 35 | 4941 |
| 6 | 1 | 71.2 | 95.9 | 30 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 91 | 79% |
| wee.Gem 1.8.4 | 33 | 94% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 91% |
| EH.Eagle 1.0.6 | 16 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 50% | 94 |
| wee.Gem 1.8.4 | 6 | 11% | 37 |
| throxbot.ThroxBot 0.1 | 5 | 9% | 13 |
| joe.ADinosaur 1.0 | 5 | 9% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4 | 7% | 25 |
| EH.Eagle 1.0.6 | 3 | 6% | 17 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 10 |
| cs.Grudge 1.0 | 1 | 2% | 1 |

## Melee bench: F28

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.6 | 139 / 210 | 1.93 | 18.8% | 25872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 139 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 34 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.7% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.7% | 7 |
| uji.Antique 1.0 | 4.2 | 10.7% | 15 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 4 |
| amk.ChumbaWumba 0.3 | 7.0 | 8.0% | 2 |
| matt.advanced.Katana 1.0 | 7.3 | 6.9% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.3 | 21 / 35 | 4440 |
| 2 | 1 | 68.8 | 92.1 | 23 / 35 | 4429 |
| 3 | 1 | 68.2 | 91.4 | 23 / 35 | 4138 |
| 4 | 1 | 69.4 | 91.4 | 27 / 35 | 4555 |
| 5 | 1 | 68.5 | 91.1 | 23 / 35 | 4098 |
| 6 | 1 | 66.7 | 84.4 | 22 / 35 | 4212 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 75 | 76% |
| uji.Antique 1.0 | 43 | 91% |
| qohnil.blot.BlotBot 3.61 | 21 | 76% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 33% | 70 |
| uji.Antique 1.0 | 10 | 14% | 44 |
| pfvicm.Sobieski 7.2.3b | 10 | 14% | 23 |
| qohnil.blot.BlotBot 3.61 | 9 | 13% | 33 |
| amk.ChumbaWumba 0.3 | 9 | 13% | 18 |
| ahr.ice.Ice 1.0.2 | 5 | 7% | 11 |
| stelo.PianistNano 1.2 | 3 | 4% | 5 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.1 | 109 / 210 | 2.25 | 18.7% | 29001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 109 |
| deewiant.Anomaly 0.2 | 2.5 | 14.5% | 40 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 14.7% | 46 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 5 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 4 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.0% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.6% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.8% | 0 |
| jangs.ns51 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.7 | 24 / 35 | 5232 |
| 2 | 1 | 69.0 | 85.4 | 19 / 35 | 4994 |
| 3 | 1 | 66.1 | 78.4 | 12 / 35 | 4556 |
| 4 | 1 | 69.6 | 89.8 | 20 / 35 | 4819 |
| 5 | 1 | 67.5 | 82.2 | 15 / 35 | 4783 |
| 6 | 1 | 68.8 | 88.3 | 19 / 35 | 4617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 69% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 45% |
| myl.micro.Troodon 1.10 | 27 | 93% |
| jok.PheonixM 0.1.2 | 9 | 89% |
| DBall.Anarchy 0.1 | 6 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 42 | 41% | 62 |
| deewiant.Anomaly 0.2 | 37 | 36% | 86 |
| myl.micro.Troodon 1.10 | 11 | 11% | 32 |
| jok.PheonixM 0.1.2 | 5 | 5% | 13 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 5 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 77.2 | 62 / 210 | 3.05 | 15.8% | 25205 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 15.8% | 62 |
| darkcanuck.B26354 1.06 | 2.3 | 13.9% | 59 |
| catcat20.Matcha 0.006 | 3.3 | 13.5% | 39 |
| oog.melee.Capulet 1.2 | 3.8 | 12.3% | 16 |
| stelo.PastFuture 2.3.2 | 4.5 | 11.6% | 19 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.6% | 7 |
| ntc.Opposite 1.5 | 7.5 | 7.6% | 0 |
| tripphippy.Alice 1.1 | 7.8 | 7.0% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.2% | 6 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 76.5 | 12 / 35 | 4036 |
| 2 | 1 | 63.1 | 73.7 | 8 / 35 | 4175 |
| 3 | 1 | 64.1 | 77.1 | 11 / 35 | 3923 |
| 4 | 1 | 67.0 | 85.4 | 16 / 35 | 4511 |
| 5 | 1 | 63.8 | 76.2 | 8 / 35 | 4304 |
| 6 | 1 | 63.1 | 74.6 | 7 / 35 | 4256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 30 | 63% |
| darkcanuck.B26354 1.06 | 28 | 36% |
| oog.melee.Capulet 1.2 | 23 | 74% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| intruder.PrairieWolf 2.61 | 6 | 67% |
| tripphippy.Alice 1.1 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 39 | 26% | 49 |
| catcat20.Matcha 0.006 | 30 | 20% | 48 |
| stelo.PastFuture 2.3.2 | 28 | 19% | 34 |
| oog.melee.Capulet 1.2 | 26 | 18% | 44 |
| tripphippy.Alice 1.1 | 11 | 7% | 13 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 12 |
| ntc.Opposite 1.5 | 5 | 3% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 4 |

## Melee bench: F31

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.4 | 69 / 210 | 2.67 | 16.3% | 22760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.5% | 84 |
| kc.mini.Mirage 0.2 | 1.8 | 16.3% | 69 |
| gh.mini.Griezel 0.2 | 3.5 | 12.5% | 38 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.1% | 8 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.4% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 5 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.2% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.1% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 82.5 | 13 / 35 | 4130 |
| 2 | 2 | 64.7 | 81.3 | 10 / 35 | 3695 |
| 3 | 2 | 64.1 | 76.8 | 11 / 35 | 3712 |
| 4 | 2 | 66.2 | 85.1 | 14 / 35 | 3681 |
| 5 | 1 | 65.8 | 83.8 | 13 / 35 | 3909 |
| 6 | 2 | 63.9 | 79.0 | 8 / 35 | 3633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 41% |
| gh.mini.Griezel 0.2 | 37 | 49% |
| spinnercat.micro.Tyger 0.1 | 15 | 93% |
| d414.nano.Quantum 1.0.0 | 11 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 914. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 64 | 45% | 85 |
| gh.mini.Griezel 0.2 | 35 | 25% | 61 |
| spinnercat.micro.Tyger 0.1 | 16 | 11% | 25 |
| d414.nano.Quantum 1.0.0 | 10 | 7% | 20 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 4 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| fm.mammillarias 1.3 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F32

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.0 | 125 / 210 | 1.90 | 19.1% | 30123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 125 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 52 |
| apc.botM 3.0 | 3.3 | 11.4% | 10 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 9 |
| vjik.UnViolation 1.1 | 4.8 | 9.6% | 6 |
| bayen.UbaMicro 1.4 | 6.5 | 8.1% | 4 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 0 |
| yk.JahMicro 1.0 | 7.7 | 7.0% | 1 |
| conscience.Electron 1.3g | 9.0 | 6.0% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.5 | 22 / 35 | 4800 |
| 2 | 1 | 70.2 | 94.0 | 23 / 35 | 5254 |
| 3 | 1 | 67.6 | 87.6 | 20 / 35 | 4690 |
| 4 | 1 | 67.4 | 87.3 | 16 / 35 | 4939 |
| 5 | 1 | 69.0 | 90.5 | 23 / 35 | 5097 |
| 6 | 1 | 68.9 | 90.2 | 21 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 89 | 56% |
| lxx.ConceptA 0.8 | 27 | 78% |
| apc.botM 3.0 | 26 | 88% |
| vjik.UnViolation 1.1 | 12 | 100% |
| donjezza.Jezza 1.0 | 7 | 86% |
| yk.JahMicro 1.0 | 7 | 86% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 52 | 61% | 107 |
| lxx.ConceptA 0.8 | 15 | 18% | 24 |
| apc.botM 3.0 | 4 | 5% | 28 |
| panzer.Panzer 0.2 | 4 | 5% | 5 |
| donjezza.Jezza 1.0 | 3 | 4% | 6 |
| vjik.UnViolation 1.1 | 2 | 2% | 20 |
| yk.JahMicro 1.0 | 2 | 2% | 9 |
| bayen.UbaMicro 1.4 | 2 | 2% | 8 |
| conscience.Electron 1.3g | 1 | 1% | 2 |

## Melee bench: F33

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 88.7 | 136 / 210 | 2.01 | 19.8% | 32314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.8% | 136 |
| maribo.Quester 0.3 | 2.0 | 14.5% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.2% | 19 |
| labg.Cataclysm 2.05 | 4.3 | 11.1% | 12 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.9% | 8 |
| baal.nano.N 1.42 | 6.2 | 9.0% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 3 |
| zyx.micro.Ant 1.1 | 8.0 | 6.1% | 0 |
| sanja.First 0.1 | 9.2 | 4.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.2 | 20 / 35 | 5446 |
| 2 | 1 | 69.0 | 83.8 | 22 / 35 | 5379 |
| 3 | 1 | 70.6 | 90.2 | 23 / 35 | 5885 |
| 4 | 1 | 69.0 | 86.3 | 23 / 35 | 4764 |
| 5 | 1 | 70.7 | 91.4 | 24 / 35 | 5358 |
| 6 | 1 | 71.1 | 91.4 | 24 / 35 | 5482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 41 | 80% |
| gre.svman4.Leonidas 1.3.2 | 37 | 95% |
| labg.Cataclysm 2.05 | 23 | 70% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 50% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 30 | 41% | 80 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 28% | 52 |
| gre.svman4.Leonidas 1.3.2 | 8 | 11% | 37 |
| labg.Cataclysm 2.05 | 8 | 11% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 4% | 5 |
| zyx.micro.Ant 1.1 | 2 | 3% | 5 |
| baal.nano.N 1.42 | 1 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 85 / 210 | 2.38 | 17.7% | 29610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.7% | 85 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 63 |
| kid.Gladiator .7.2 | 2.5 | 16.4% | 49 |
| tcf.Reach 3 | 4.5 | 10.5% | 3 |
| jcs.Seth 1.8 | 4.8 | 10.3% | 10 |
| cli.Dancer 1.1 | 5.7 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 80.0 | 10 / 35 | 4659 |
| 2 | 1 | 68.0 | 84.4 | 15 / 35 | 4808 |
| 3 | 1 | 68.0 | 84.8 | 14 / 35 | 4880 |
| 4 | 2 | 67.7 | 83.2 | 13 / 35 | 4869 |
| 5 | 1 | 70.0 | 89.8 | 20 / 35 | 5339 |
| 6 | 1 | 68.6 | 85.7 | 13 / 35 | 5055 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 82 | 66% |
| kid.Gladiator .7.2 | 39 | 46% |
| jcs.Seth 1.8 | 9 | 78% |
| sample.VelociRobot 1.0 | 3 | 100% |
| tcf.Reach 3 | 2 | 50% |
| cli.Dancer 1.1 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 53 | 42% | 74 |
| stelo.Spread 0.9 | 50 | 40% | 95 |
| jcs.Seth 1.8 | 7 | 6% | 16 |
| tcf.Reach 3 | 7 | 6% | 9 |
| cli.Dancer 1.1 | 4 | 3% | 5 |
| ratosh.Wesco 1.4 | 3 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 83.6 | 39 / 210 | 2.48 | 16.1% | 23454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 144 |
| kc.mini.Mirage 0.2 | 2.0 | 16.1% | 39 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.8% | 22 |
| rz.HawkOnFire 0.1 | 4.0 | 11.6% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 10.8% | 2 |
| wit.Chuliath 1.0 | 6.2 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.2 | 6.2% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 83.8 | 5 / 35 | 3901 |
| 2 | 2 | 66.0 | 85.7 | 7 / 35 | 4171 |
| 3 | 2 | 64.7 | 80.6 | 8 / 35 | 3911 |
| 4 | 2 | 65.2 | 83.8 | 6 / 35 | 3846 |
| 5 | 2 | 65.9 | 85.7 | 8 / 35 | 3928 |
| 6 | 2 | 64.6 | 81.9 | 5 / 35 | 3697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 101 | 11% |
| gh.mini.Gruwel 0.9 | 27 | 48% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 90% |
| rz.HawkOnFire 0.1 | 8 | 75% |

Hadur died in 172 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 112 | 65% | 123 |
| gh.mini.Gruwel 0.9 | 29 | 17% | 40 |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 7% | 22 |
| rz.HawkOnFire 0.1 | 10 | 6% | 15 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F36

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.4 | 173 / 210 | 1.41 | 21.6% | 34238 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.6% | 173 |
| bzdp.Pansy 2.1 | 2.3 | 12.0% | 9 |
| alpha.RainingFire 1.0 | 3.0 | 11.8% | 10 |
| mz.Cork 0.1 | 4.3 | 10.4% | 7 |
| bvh.micro.Freya 0.3 | 5.5 | 9.7% | 1 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.6% | 4 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.4% | 6 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.2% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.8 | 29 / 35 | 6068 |
| 2 | 1 | 70.4 | 94.6 | 26 / 35 | 5051 |
| 3 | 1 | 72.5 | 98.4 | 31 / 35 | 5489 |
| 4 | 1 | 71.3 | 91.4 | 29 / 35 | 5768 |
| 5 | 1 | 72.4 | 97.1 | 29 / 35 | 6029 |
| 6 | 1 | 71.9 | 94.0 | 29 / 35 | 5833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 59 | 92% |
| bvh.micro.Freya 0.3 | 30 | 97% |
| mz.Cork 0.1 | 29 | 86% |
| bvh.mini.Fenrir 0.39 | 29 | 90% |
| alpha.RainingFire 1.0 | 23 | 74% |
| m3thos.Eva02 0.7.1 | 11 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 8 | 21% | 65 |
| alpha.RainingFire 1.0 | 8 | 21% | 27 |
| mz.Cork 0.1 | 6 | 16% | 34 |
| bvh.mini.Fenrir 0.39 | 6 | 16% | 23 |
| m3thos.Eva02 0.7.1 | 5 | 13% | 18 |
| bvh.micro.Freya 0.3 | 2 | 5% | 21 |
| dl.BetterWalls 1.0 | 1 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 8 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F37

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 91.6 | 169 / 210 | 1.75 | 20.0% | 33879 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.0% | 169 |
| EBBU.Sim2 1.02 | 2.8 | 10.7% | 6 |
| germ.TheMind .2 | 3.5 | 10.1% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.6% | 3 |
| stelo.UntouchableNano 1.3 | 5.0 | 9.5% | 11 |
| lmk.ACPFinal 0.1 | 6.5 | 8.3% | 0 |
| skm.Ryubot 1.0 | 7.0 | 8.2% | 3 |
| agrach.Dalek 1.0 | 7.5 | 8.2% | 6 |
| mb.Beast 0.1 | 8.2 | 7.7% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 9.3 | 7.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 95.2 | 29 / 35 | 5643 |
| 2 | 1 | 70.0 | 93.7 | 29 / 35 | 5959 |
| 3 | 1 | 69.5 | 91.4 | 27 / 35 | 5832 |
| 4 | 1 | 69.6 | 91.7 | 29 / 35 | 5654 |
| 5 | 1 | 69.5 | 93.3 | 31 / 35 | 5373 |
| 6 | 1 | 67.4 | 84.4 | 24 / 35 | 5418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 35 | 89% |
| germ.TheMind .2 | 33 | 94% |
| EBBU.Sim2 1.02 | 31 | 90% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 100% |
| mb.Beast 0.1 | 16 | 94% |
| lmk.ACPFinal 0.1 | 15 | 100% |
| agrach.Dalek 1.0 | 14 | 100% |
| skm.Ryubot 1.0 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 494. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 8 | 19% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 17% | 11 |
| EBBU.Sim2 1.02 | 6 | 14% | 31 |
| lmk.ACPFinal 0.1 | 6 | 14% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 12% | 28 |
| stelo.UntouchableNano 1.3 | 4 | 10% | 36 |
| mb.Beast 0.1 | 3 | 7% | 22 |
| agrach.Dalek 1.0 | 3 | 7% | 17 |
| skm.Ryubot 1.0 | 0 | 0% | 10 |

## Melee bench: F38

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.2 | 104 / 210 | 2.33 | 17.8% | 27130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 17.8% | 104 |
| justin.Mallais 14.0 | 2.0 | 15.8% | 63 |
| bvh.mini.Freya 0.55 | 3.2 | 12.3% | 14 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.7% | 14 |
| cs.Wren 1.0 | 5.2 | 10.2% | 5 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.4% | 8 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 3.9% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.6 | 14 / 35 | 4327 |
| 2 | 1 | 65.8 | 80.6 | 13 / 35 | 4502 |
| 3 | 1 | 69.1 | 90.2 | 23 / 35 | 4656 |
| 4 | 1 | 64.5 | 77.8 | 11 / 35 | 4251 |
| 5 | 1 | 68.5 | 90.2 | 17 / 35 | 4494 |
| 6 | 1 | 69.9 | 90.8 | 26 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 58% |
| bvh.mini.Freya 0.55 | 25 | 88% |
| bts.mega.Gnarly 1.4 | 19 | 68% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 88% |
| cs.Wren 1.0 | 15 | 93% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |

Hadur died in 106 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 39% | 86 |
| bvh.mini.Freya 0.55 | 20 | 19% | 33 |
| bts.mega.Gnarly 1.4 | 15 | 14% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 14% | 30 |
| cs.Wren 1.0 | 7 | 7% | 15 |
| kdf.KoulDestroyer 1.0 | 7 | 7% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.4 | 121 / 210 | 2.04 | 19.1% | 31975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 121 |
| bvh.fry.Freya 0.82 | 2.0 | 14.5% | 18 |
| az.Ololobot 0.2.4 | 3.2 | 12.4% | 44 |
| catcat20.Lambda 0.024 | 3.8 | 11.3% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 8.4% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 7.9% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 15 / 35 | 5385 |
| 2 | 1 | 69.0 | 90.2 | 18 / 35 | 5511 |
| 3 | 1 | 67.7 | 85.4 | 20 / 35 | 5178 |
| 4 | 1 | 70.5 | 94.6 | 26 / 35 | 5369 |
| 5 | 1 | 68.4 | 86.0 | 19 / 35 | 5521 |
| 6 | 1 | 68.5 | 87.3 | 23 / 35 | 5011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 55 | 56% |
| bvh.fry.Freya 0.82 | 46 | 83% |
| catcat20.Lambda 0.024 | 37 | 73% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 100% |
| gimp.GimpBot 0.1 | 6 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 31 | 35% | 63 |
| bvh.fry.Freya 0.82 | 24 | 27% | 58 |
| catcat20.Lambda 0.024 | 18 | 20% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 8% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 3% | 3 |
| gimp.GimpBot 0.1 | 2 | 2% | 13 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |

## Melee bench: F40

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.9 | 132 / 210 | 2.00 | 19.6% | 31255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 132 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 38 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.0% | 17 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.6% | 10 |
| mz.AntiGrav 1.0 | 5.0 | 10.2% | 2 |
| alpha.BlackIce 1.0 | 6.0 | 9.1% | 6 |
| stelo.Randomness 1.0 | 7.0 | 8.1% | 3 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.6 | 22 / 35 | 5117 |
| 2 | 1 | 69.6 | 90.5 | 22 / 35 | 5068 |
| 3 | 1 | 69.4 | 87.0 | 24 / 35 | 5369 |
| 4 | 1 | 71.0 | 94.6 | 27 / 35 | 5098 |
| 5 | 1 | 68.3 | 84.8 | 17 / 35 | 5174 |
| 6 | 1 | 69.8 | 89.2 | 20 / 35 | 5429 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 56 | 66% |
| kano.gamma.KanoGamma 1.8 | 39 | 79% |
| Polkwane.SmashMelee 1.0 | 25 | 92% |
| mz.AntiGrav 1.0 | 24 | 100% |
| stelo.Randomness 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 6 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 0% |

Hadur died in 78 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 40% | 59 |
| kano.gamma.KanoGamma 1.8 | 13 | 17% | 48 |
| Polkwane.SmashMelee 1.0 | 11 | 14% | 26 |
| mz.AntiGrav 1.0 | 8 | 10% | 28 |
| alpha.BlackIce 1.0 | 7 | 9% | 18 |
| stelo.Randomness 1.0 | 3 | 4% | 13 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 2 | 3% | 6 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.6 | 115 / 210 | 1.93 | 18.8% | 28230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 115 |
| eem.EvBotNG v12.8 | 2.0 | 15.7% | 60 |
| ary.Swarm 1.1 | 3.3 | 12.6% | 10 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.3% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 10.5% | 8 |
| shrub.Silver v048 | 6.3 | 9.1% | 0 |
| zyx.nano.Ant 1.1 | 6.7 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 2 |
| stelo.Mirror 1.1 | 8.5 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.1 | 20 / 35 | 4930 |
| 2 | 1 | 69.0 | 89.5 | 18 / 35 | 4631 |
| 3 | 1 | 69.2 | 88.9 | 17 / 35 | 4998 |
| 4 | 1 | 68.3 | 88.9 | 20 / 35 | 4304 |
| 5 | 1 | 68.8 | 88.3 | 20 / 35 | 4855 |
| 6 | 1 | 69.1 | 90.2 | 20 / 35 | 4512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 54% |
| ary.Swarm 1.1 | 32 | 81% |
| lessonz.robocode.Oz 0.5.0 | 26 | 81% |
| simonton.nano.MeleeSeed 1.8 | 23 | 100% |
| stelo.Mirror 1.1 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 57% | 94 |
| lessonz.robocode.Oz 0.5.0 | 15 | 16% | 32 |
| ary.Swarm 1.1 | 13 | 14% | 34 |
| simonton.nano.MeleeSeed 1.8 | 6 | 6% | 27 |
| shrub.Silver v048 | 4 | 4% | 8 |
| zyx.nano.Ant 1.1 | 2 | 2% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

## Melee bench: F42

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.5 | 124 / 210 | 1.95 | 19.4% | 33016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.4% | 124 |
| wompi.Wallaby 5.1 | 2.7 | 13.9% | 24 |
| ara.Shera 0.88 | 3.0 | 13.5% | 33 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.5% | 21 |
| amz.NanoClone 1.41 | 5.3 | 8.7% | 2 |
| maribo.IotaCT 1.1 | 5.8 | 7.6% | 1 |
| dsw.StaticD 1.0 | 7.0 | 7.2% | 4 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 1 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 19 / 35 | 5205 |
| 2 | 1 | 69.3 | 90.2 | 19 / 35 | 5331 |
| 3 | 1 | 68.2 | 85.1 | 17 / 35 | 5539 |
| 4 | 1 | 71.8 | 94.6 | 27 / 35 | 6029 |
| 5 | 1 | 67.6 | 85.1 | 16 / 35 | 4981 |
| 6 | 1 | 71.2 | 94.3 | 26 / 35 | 5931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 59 | 64% |
| maribo.mini.MiniQuester 0.1 | 49 | 78% |
| wompi.Wallaby 5.1 | 38 | 92% |
| amz.NanoClone 1.41 | 4 | 75% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 100% |
| dsw.StaticD 1.0 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 36 | 42% | 70 |
| maribo.mini.MiniQuester 0.1 | 22 | 26% | 51 |
| wompi.Wallaby 5.1 | 21 | 24% | 70 |
| amz.NanoClone 1.41 | 5 | 6% | 7 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

## Melee bench: F43

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 78.5 | 34 / 210 | 2.94 | 15.2% | 22902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 145 |
| kc.mini.Mirage 0.2 | 2.0 | 15.2% | 34 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.6% | 17 |
| dummy.micro.Sparrow 2.5 | 3.7 | 11.7% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 6 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.1% | 1 |
| jab.DiamondStealer 5 | 7.5 | 7.2% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 79.0 | 9 / 35 | 3799 |
| 2 | 2 | 64.6 | 77.8 | 6 / 35 | 3749 |
| 3 | 2 | 65.2 | 80.3 | 3 / 35 | 4057 |
| 4 | 2 | 64.9 | 77.8 | 7 / 35 | 3657 |
| 5 | 2 | 64.8 | 78.4 | 6 / 35 | 3914 |
| 6 | 2 | 64.4 | 77.5 | 3 / 35 | 3726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 15% |
| brainfade.melee.Dusk 0.44 | 16 | 81% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 100% |
| dummy.micro.Sparrow 2.5 | 3 | 33% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 112 | 63% | 127 |
| dummy.micro.Sparrow 2.5 | 25 | 14% | 27 |
| brainfade.melee.Dusk 0.44 | 17 | 10% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 8 | 4% | 13 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 5 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F44

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.4 | 144 / 210 | 1.68 | 20.4% | 32316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 144 |
| stelo.Liblix 0.3.1 | 2.3 | 14.5% | 36 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.1% | 26 |
| wompi.Quokka 1.6 | 4.5 | 9.7% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.1% | 1 |
| jwirde.Gort 2.0 | 5.5 | 8.8% | 2 |
| disan.Chair 2.2.0 | 7.5 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.3% | 0 |
| sample.Crazy 1.0 | 9.2 | 4.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.9 | 24 / 35 | 5519 |
| 2 | 1 | 69.7 | 88.9 | 22 / 35 | 5244 |
| 3 | 1 | 71.6 | 96.5 | 25 / 35 | 5454 |
| 4 | 1 | 71.9 | 97.1 | 29 / 35 | 5572 |
| 5 | 1 | 69.6 | 90.5 | 23 / 35 | 5058 |
| 6 | 1 | 70.9 | 93.7 | 21 / 35 | 5469 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 87 | 77% |
| tzu.TheArtOfWar 1.2 | 64 | 73% |
| jwirde.Gort 2.0 | 8 | 88% |
| wompi.Quokka 1.6 | 7 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 26 | 39% | 71 |
| stelo.Liblix 0.3.1 | 25 | 38% | 92 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 9% | 13 |
| wompi.Quokka 1.6 | 4 | 6% | 13 |
| jwirde.Gort 2.0 | 2 | 3% | 9 |
| disan.Chair 2.2.0 | 2 | 3% | 5 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 6 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |

## Melee bench: F45

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.9 | 103 / 210 | 1.91 | 20.4% | 36838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.4% | 103 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 11.9% | 80 |
| jje.BagPuss 1.2 | 3.2 | 11.7% | 9 |
| sul.Lunar 1.1 | 3.5 | 11.2% | 10 |
| myl.nano.Graviton 1.10 | 4.8 | 10.1% | 0 |
| fm.claire 1.7 | 6.5 | 8.4% | 1 |
| hvilela.HVilela 0.9 | 7.0 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.9% | 6 |
| wit.Deep7 2.0 | 9.2 | 5.4% | 1 |
| abud.ThirdRobo 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 18 / 35 | 5876 |
| 2 | 1 | 70.6 | 90.2 | 18 / 35 | 6247 |
| 3 | 1 | 71.4 | 92.7 | 18 / 35 | 6552 |
| 4 | 1 | 71.0 | 91.7 | 17 / 35 | 6385 |
| 5 | 1 | 70.8 | 91.7 | 18 / 35 | 6261 |
| 6 | 1 | 68.1 | 84.1 | 14 / 35 | 5517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 35% |
| sul.Lunar 1.1 | 28 | 89% |
| jje.BagPuss 1.2 | 21 | 76% |
| myl.nano.Graviton 1.10 | 14 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 50% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 66 | 62% | 0 |
| sul.Lunar 1.1 | 13 | 12% | 76 |
| jje.BagPuss 1.2 | 10 | 9% | 46 |
| myl.nano.Graviton 1.10 | 10 | 9% | 36 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 19 |
| fm.claire 1.7 | 2 | 2% | 9 |
| hvilela.HVilela 0.9 | 2 | 2% | 8 |
| wit.Deep7 2.0 | 0 | 0% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |

## Melee bench: F46

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.4 | 61 / 210 | 2.40 | 17.0% | 28407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.8% | 105 |
| kc.mini.Mirage 0.2 | 1.7 | 17.0% | 61 |
| hadur117.mini.Deise 0.2 | 3.0 | 14.7% | 25 |
| mz.MicroSheep 1.0 | 4.5 | 10.6% | 2 |
| cx.Princess 1.0 | 4.8 | 10.4% | 13 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 2 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.1% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 79.4 | 11 / 35 | 5055 |
| 2 | 2 | 65.5 | 83.5 | 8 / 35 | 4361 |
| 3 | 2 | 68.1 | 88.3 | 11 / 35 | 4897 |
| 4 | 2 | 66.8 | 85.1 | 9 / 35 | 4713 |
| 5 | 1 | 67.2 | 86.3 | 11 / 35 | 4854 |
| 6 | 2 | 66.5 | 83.8 | 11 / 35 | 4527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 84 | 15% |
| hadur117.mini.Deise 0.2 | 33 | 64% |
| cx.Princess 1.0 | 18 | 56% |
| mz.MicroSheep 1.0 | 10 | 100% |
| arthord.NanoSatanMelee Beta | 5 | 100% |
| jeremyreeder.collective.Prophet 5 | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 86 | 58% | 101 |
| hadur117.mini.Deise 0.2 | 38 | 26% | 63 |
| cx.Princess 1.0 | 12 | 8% | 19 |
| mz.MicroSheep 1.0 | 6 | 4% | 16 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 6 |
| sadoner.killer 0.2 | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

