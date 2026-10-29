# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.5 | 46 / 210 | 2.49 | 16.6% | 29697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 147 |
| hadur117.mini.DeiseW10 0.3 | 2.0 | 16.6% | 46 |
| sgp.JollyNinja 3.53 | 3.8 | 11.4% | 11 |
| mz.MicroGodMelee 1 | 4.0 | 11.0% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.2 | 11.1% | 3 |
| lorneswork.Predator 1.0 | 6.0 | 8.8% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.1% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 84.1 | 8 / 35 | 5043 |
| 2 | 2 | 64.9 | 79.4 | 4 / 35 | 5012 |
| 3 | 2 | 67.0 | 86.7 | 10 / 35 | 4918 |
| 4 | 2 | 66.4 | 82.9 | 8 / 35 | 5057 |
| 5 | 2 | 65.9 | 83.8 | 7 / 35 | 4819 |
| 6 | 2 | 66.3 | 84.1 | 9 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 10% |
| mz.MicroGodMelee 1 | 14 | 100% |
| sgp.JollyNinja 3.53 | 13 | 85% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 1181. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 75% | 142 |
| sgp.JollyNinja 3.53 | 19 | 12% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 13 |
| mz.MicroGodMelee 1 | 5 | 3% | 17 |
| lorneswork.Predator 1.0 | 3 | 2% | 5 |
| mym.EdgeStalker 1.0 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 78.9 | 91 / 210 | 2.90 | 17.0% | 29442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 17.0% | 91 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.7% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.8% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.2% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.8 | 8.8% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.1% | 2 |
| sch.Simone 0.3d | 6.8 | 8.3% | 11 |
| Noran.BitchingElk 0.054 | 7.2 | 7.6% | 8 |
| stelo.PatternRobot 1.0 | 8.2 | 6.9% | 7 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 74.6 | 11 / 35 | 4595 |
| 2 | 1 | 65.1 | 77.8 | 15 / 35 | 4722 |
| 3 | 1 | 62.9 | 72.1 | 15 / 35 | 4348 |
| 4 | 1 | 67.3 | 83.2 | 18 / 35 | 4967 |
| 5 | 1 | 67.4 | 82.9 | 16 / 35 | 5549 |
| 6 | 1 | 67.3 | 82.9 | 16 / 35 | 5261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 73% |
| pulsar.PulsarMax 0.8.9 | 33 | 52% |
| sch.Simone 0.3d | 10 | 80% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 89% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 86% |
| Noran.BitchingElk 0.054 | 4 | 25% |
| fullsail.SweetTea 1.1 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 28% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 23% | 66 |
| lrem.micro.SpikeSoldier 0.4 | 20 | 17% | 24 |
| stelo.PatternRobot 1.0 | 10 | 8% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 6% | 14 |
| Noran.BitchingElk 0.054 | 7 | 6% | 13 |
| sch.Simone 0.3d | 7 | 6% | 13 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 7 |
| fullsail.SweetTea 1.1 | 3 | 2% | 8 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 92.3 | 146 / 210 | 1.70 | 20.1% | 36496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 20.1% | 146 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.1% | 12 |
| vuen.Cake 2.51 | 3.0 | 13.4% | 38 |
| radnor.DoctorBob 1.42 | 3.5 | 13.1% | 10 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 2 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.6% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.4 | 21 / 35 | 6240 |
| 2 | 1 | 70.4 | 91.7 | 25 / 35 | 6261 |
| 3 | 1 | 69.4 | 90.8 | 24 / 35 | 5474 |
| 4 | 1 | 69.3 | 89.2 | 22 / 35 | 6014 |
| 5 | 1 | 70.6 | 92.7 | 25 / 35 | 6198 |
| 6 | 1 | 71.6 | 97.8 | 29 / 35 | 6309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 72 | 61% |
| kawigi.nano.Lib 1.0 | 55 | 93% |
| radnor.DoctorBob 1.42 | 42 | 98% |
| urdos.URDOS 1.3 | 4 | 75% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 33 | 52% | 77 |
| kawigi.nano.Lib 1.0 | 13 | 20% | 69 |
| radnor.DoctorBob 1.42 | 9 | 14% | 38 |
| urdos.URDOS 1.3 | 3 | 5% | 6 |
| adt.Ar1 2.1 | 2 | 3% | 5 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 43 / 210 | 2.08 | 18.0% | 34308 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 168 |
| hadur117.mini.DeiseW10 0.3 | 2.0 | 18.0% | 43 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.3% | 1 |
| TNT.TNT 0.99.1 | 4.2 | 10.2% | 0 |
| josago.Jorgito 0.16 | 4.8 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.5 | 87.0 | 7 / 35 | 5787 |
| 2 | 2 | 68.1 | 87.3 | 8 / 35 | 5293 |
| 3 | 2 | 68.7 | 87.6 | 6 / 35 | 5820 |
| 4 | 2 | 70.1 | 90.8 | 8 / 35 | 6152 |
| 5 | 2 | 69.0 | 89.5 | 9 / 35 | 5677 |
| 6 | 2 | 67.8 | 86.0 | 5 / 35 | 5579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 173 | 17% |
| apc.LeeroyJenkins2 1.0 | 7 | 100% |
| TNT.TNT 0.99.1 | 3 | 100% |
| spin.Bugstard 0.012b | 2 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 1505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 91% | 187 |
| apc.LeeroyJenkins2 1.0 | 8 | 5% | 14 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 1 | 1% | 5 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.3 | 23 / 210 | 3.49 | 13.5% | 19775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 119 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 54 |
| hadur117.mini.DeiseW10 0.3 | 3.0 | 13.5% | 23 |
| wompi.Numbat 2.1 | 4.0 | 12.4% | 10 |
| ms.Ares 0.19 | 5.3 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.7% | 0 |
| supersample.SuperBoxBot 1.0 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 71.4 | 3 / 35 | 3316 |
| 2 | 3 | 62.7 | 75.6 | 5 / 35 | 3503 |
| 3 | 3 | 60.8 | 71.7 | 4 / 35 | 3218 |
| 4 | 3 | 58.5 | 65.7 | 2 / 35 | 3035 |
| 5 | 3 | 62.3 | 76.8 | 5 / 35 | 3389 |
| 6 | 3 | 61.2 | 72.7 | 4 / 35 | 3314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 39 | 15% |
| justin.DemonicRage 3.4 | 24 | 38% |
| wompi.Numbat 2.1 | 8 | 75% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 67 | 36% | 76 |
| justin.DemonicRage 3.4 | 49 | 26% | 56 |
| wompi.Numbat 2.1 | 33 | 18% | 39 |
| ms.Ares 0.19 | 15 | 8% | 16 |
| axeBots.HataMoto 3.09 | 11 | 6% | 11 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.8 | 90 / 210 | 2.72 | 17.0% | 27915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 17.0% | 90 |
| jekl.StoneGhost 0.7 | 2.3 | 14.5% | 29 |
| origin.SleepSiphon 1.7b | 3.0 | 13.3% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.5% | 32 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 4 |
| gg.Wolverine 2.0 | 6.5 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.5 | 6.9% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.9% | 4 |
| DBall.NUKE 0.1 | 8.3 | 6.4% | 0 |
| sample.Fire 1.0 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.4 | 20 / 35 | 4737 |
| 2 | 1 | 66.2 | 81.6 | 14 / 35 | 4526 |
| 3 | 1 | 67.1 | 83.8 | 14 / 35 | 4846 |
| 4 | 1 | 65.4 | 78.1 | 14 / 35 | 4760 |
| 5 | 1 | 63.9 | 75.9 | 12 / 35 | 4332 |
| 6 | 1 | 66.4 | 81.3 | 16 / 35 | 4714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 42 | 83% |
| origin.SleepSiphon 1.7b | 29 | 59% |
| pe.minimelee.SandboxMiniMelee 1.1 | 22 | 64% |
| gg.Wolverine 2.0 | 8 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| spinnercat.Omen 1.0 | 5 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 38 | 31% | 50 |
| origin.SleepSiphon 1.7b | 33 | 27% | 58 |
| jekl.StoneGhost 0.7 | 26 | 21% | 59 |
| mld.Wisdom 1.0 | 14 | 12% | 23 |
| gg.Wolverine 2.0 | 7 | 6% | 10 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |

## Melee bench: F07

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.1 | 112 / 210 | 1.71 | 19.6% | 34578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 19.6% | 112 |
| rsalesc.melee.Monk 0.3.6c | 2.5 | 17.5% | 49 |
| rtk.Tachikoma 1.0 | 2.5 | 16.7% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.0% | 12 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.4 | 14 / 35 | 5717 |
| 2 | 1 | 70.3 | 91.1 | 15 / 35 | 5609 |
| 3 | 1 | 70.8 | 91.1 | 19 / 35 | 5716 |
| 4 | 1 | 72.1 | 93.3 | 23 / 35 | 5930 |
| 5 | 1 | 71.3 | 92.4 | 19 / 35 | 5719 |
| 6 | 1 | 71.5 | 93.3 | 22 / 35 | 5887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 86 | 73% |
| rsalesc.melee.Monk 0.3.6c | 54 | 31% |
| oog.melee.CapuletDroid 1.1 | 28 | 79% |
| franzor.Lizt 1.3.1 | 15 | 60% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 1487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 46 | 47% | 70 |
| rtk.Tachikoma 1.0 | 35 | 36% | 107 |
| oog.melee.CapuletDroid 1.1 | 8 | 8% | 26 |
| franzor.Lizt 1.3.1 | 7 | 7% | 0 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 5 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.9 | 132 / 210 | 2.00 | 19.0% | 29378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 19.0% | 132 |
| shrub.Vapour v159 | 2.5 | 12.9% | 28 |
| tm.Yuugao 1.0 | 2.5 | 13.0% | 33 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.5% | 14 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.2% | 1 |
| m3thos.Eva00 1.1 | 6.3 | 8.1% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 7.8% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.9% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.5 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.1 | 19 / 35 | 5076 |
| 2 | 1 | 69.2 | 92.1 | 23 / 35 | 4918 |
| 3 | 1 | 67.5 | 87.3 | 19 / 35 | 4697 |
| 4 | 1 | 69.1 | 90.5 | 25 / 35 | 4973 |
| 5 | 1 | 68.4 | 87.6 | 24 / 35 | 4845 |
| 6 | 1 | 68.8 | 91.7 | 22 / 35 | 4869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 58 | 76% |
| tm.Yuugao 1.0 | 39 | 74% |
| Krabb.sliNk.Garm 0.9u | 18 | 72% |
| jwst.DAD.DarkAndDarker 1.1 | 18 | 89% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 100% |
| m3thos.Eva00 1.1 | 8 | 100% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 37% | 61 |
| shrub.Vapour v159 | 19 | 24% | 55 |
| Krabb.sliNk.Garm 0.9u | 16 | 20% | 31 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 4% | 23 |
| m3thos.Eva00 1.1 | 3 | 4% | 9 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 76.8 | 67 / 210 | 3.09 | 15.9% | 25384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.4% | 94 |
| hadur117.mini.DeiseW10 0.3 | 1.8 | 15.9% | 67 |
| kc.micro.Figment 1.0 | 2.8 | 13.8% | 28 |
| yagami.Tidus 0.11 | 4.3 | 10.7% | 3 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.0% | 8 |
| mc2.enemy.Original 0.9 | 5.7 | 9.5% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.5% | 1 |
| step.nanoPri 1.0 | 8.3 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 71.7 | 9 / 35 | 4460 |
| 2 | 2 | 63.6 | 75.6 | 9 / 35 | 4077 |
| 3 | 2 | 63.9 | 74.9 | 11 / 35 | 4051 |
| 4 | 2 | 65.7 | 81.0 | 12 / 35 | 4210 |
| 5 | 1 | 65.0 | 77.5 | 13 / 35 | 4350 |
| 6 | 2 | 65.7 | 80.3 | 13 / 35 | 4236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 51 | 33% |
| kc.micro.Figment 1.0 | 30 | 77% |
| mc2.enemy.Original 0.9 | 13 | 69% |
| pedersen.Grishnakh 1.0 | 10 | 90% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 72 | 50% | 90 |
| kc.micro.Figment 1.0 | 26 | 18% | 50 |
| yagami.Tidus 0.11 | 13 | 9% | 25 |
| mc2.enemy.Original 0.9 | 10 | 7% | 18 |
| pedersen.Grishnakh 1.0 | 7 | 5% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 6 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |

## Melee bench: F10

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 94.2 | 162 / 210 | 1.52 | 20.0% | 31971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 20.0% | 162 |
| DTF.Kludgy 1.2b | 2.2 | 14.0% | 26 |
| ne.Chimera 1.2 | 2.8 | 13.0% | 10 |
| ejb.Polaris 1.0.1 | 4.2 | 11.7% | 6 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.2% | 3 |
| vStar.RAFzilla 2.15 | 5.7 | 9.6% | 4 |
| kurios.DOSexe .9b | 7.7 | 5.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.3 | 25 / 35 | 5280 |
| 2 | 1 | 70.1 | 95.9 | 30 / 35 | 4902 |
| 3 | 1 | 69.7 | 92.7 | 23 / 35 | 5577 |
| 4 | 1 | 69.1 | 90.8 | 26 / 35 | 5236 |
| 5 | 1 | 70.8 | 95.2 | 29 / 35 | 5370 |
| 6 | 1 | 71.5 | 96.2 | 29 / 35 | 5606 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 72% |
| ejb.Polaris 1.0.1 | 45 | 98% |
| ne.Chimera 1.2 | 28 | 79% |
| tvv.micro.Antares 1.1.1 | 19 | 95% |
| vStar.RAFzilla 2.15 | 17 | 100% |
| donjezza.Muncho 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 26 | 53% | 67 |
| ne.Chimera 1.2 | 8 | 16% | 36 |
| ejb.Polaris 1.0.1 | 6 | 12% | 46 |
| tvv.micro.Antares 1.1.1 | 4 | 8% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 5 |
| kurios.DOSexe .9b | 1 | 2% | 10 |
| sam.Samspin 1.0 | 1 | 2% | 5 |
| vStar.RAFzilla 2.15 | 0 | 0% | 18 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.2 | 93 / 210 | 2.69 | 17.0% | 26384 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.3 | 17.0% | 93 |
| rz.Aleph 0.34 | 1.7 | 15.8% | 59 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.5% | 19 |
| djc.DynaBot 0.1.1 | 3.7 | 11.0% | 12 |
| br2.MobyDickBot 1.6 | 5.7 | 9.0% | 10 |
| rdt199.Warlord 0.73 | 5.8 | 9.2% | 16 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 3 |
| KiraNL.Chupacabra 0.4 | 8.2 | 7.4% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 77.8 | 14 / 35 | 4274 |
| 2 | 2 | 63.8 | 75.6 | 13 / 35 | 4103 |
| 3 | 1 | 68.4 | 88.6 | 17 / 35 | 5217 |
| 4 | 1 | 67.1 | 84.4 | 20 / 35 | 4493 |
| 5 | 2 | 65.0 | 81.0 | 13 / 35 | 4209 |
| 6 | 1 | 65.1 | 80.0 | 16 / 35 | 4088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 65% |
| djc.DynaBot 0.1.1 | 29 | 79% |
| cx.mini.Nimrod 0.55 | 20 | 85% |
| rdt199.Warlord 0.73 | 12 | 58% |
| uji.YellohFellah 1.0 | 6 | 100% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 56 | 47% | 90 |
| cx.mini.Nimrod 0.55 | 18 | 15% | 31 |
| djc.DynaBot 0.1.1 | 16 | 14% | 35 |
| rdt199.Warlord 0.73 | 16 | 14% | 24 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 5 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| uji.YellohFellah 1.0 | 2 | 2% | 11 |
| br2.MobyDickBot 1.6 | 2 | 2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.3 | 110 / 210 | 2.41 | 17.3% | 23181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 17.3% | 110 |
| bts.wiki.RipCurl 0.9b | 3.0 | 13.3% | 31 |
| nat.PallasHawk 1.0 | 3.0 | 13.1% | 29 |
| darkcanuck.Leon 1.01 | 3.2 | 13.0% | 23 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 11 |
| jrm.Test0 1.0 | 6.2 | 8.1% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.9% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 5 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.8 | 22 / 35 | 3971 |
| 2 | 1 | 66.0 | 84.1 | 17 / 35 | 3809 |
| 3 | 1 | 63.6 | 77.5 | 15 / 35 | 3476 |
| 4 | 1 | 65.8 | 85.4 | 17 / 35 | 3492 |
| 5 | 1 | 67.1 | 85.1 | 18 / 35 | 4018 |
| 6 | 1 | 68.2 | 90.2 | 21 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 77% |
| bts.wiki.RipCurl 0.9b | 43 | 70% |
| darkcanuck.Leon 1.01 | 39 | 77% |
| brainfade.melee.Genghis 0.36 | 12 | 75% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 0% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 29 | 29% | 51 |
| nat.PallasHawk 1.0 | 24 | 24% | 60 |
| darkcanuck.Leon 1.01 | 19 | 19% | 56 |
| brainfade.melee.Genghis 0.36 | 15 | 15% | 19 |
| jaybot.bots.Oddball 4.0 | 5 | 5% | 5 |
| jp.Perpy 16.0 | 4 | 4% | 6 |
| jrm.Test0 1.0 | 3 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 4 |

## Melee bench: F13

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.4 | 74 / 210 | 2.49 | 16.5% | 25946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.8 | 16.5% | 83 |
| hadur117.mini.DeiseW10 0.3 | 2.0 | 16.5% | 74 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 32 |
| shinh.Entangled 0.3 | 4.3 | 11.8% | 13 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.1% | 6 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.7% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 1 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 80.0 | 12 / 35 | 3937 |
| 2 | 1 | 66.4 | 84.4 | 13 / 35 | 4424 |
| 3 | 2 | 65.4 | 82.9 | 10 / 35 | 4230 |
| 4 | 2 | 67.1 | 86.0 | 13 / 35 | 4461 |
| 5 | 1 | 67.0 | 85.1 | 14 / 35 | 4547 |
| 6 | 3 | 65.6 | 82.2 | 12 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 34% |
| ags.Glacier 0.2.11 | 47 | 83% |
| shinh.Entangled 0.3 | 9 | 78% |
| gh.micro.Gruweltje 0.7 | 6 | 67% |
| apc.Colossus2 0.17 | 2 | 100% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 66 | 49% | 91 |
| ags.Glacier 0.2.11 | 39 | 29% | 72 |
| shinh.Entangled 0.3 | 15 | 11% | 25 |
| gh.micro.Gruweltje 0.7 | 10 | 7% | 14 |
| stelo.Wang 1.0 | 3 | 2% | 4 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| apc.Colossus2 0.17 | 0 | 0% | 1 |

## Melee bench: F14

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.0 | 153 / 210 | 1.63 | 20.1% | 33329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 20.1% | 153 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 27 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.5% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.0% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.1% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.0% | 3 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.0% | 4 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 24 / 35 | 5649 |
| 2 | 1 | 70.3 | 90.5 | 24 / 35 | 5708 |
| 3 | 1 | 70.3 | 93.0 | 24 / 35 | 5486 |
| 4 | 1 | 71.3 | 94.9 | 27 / 35 | 5800 |
| 5 | 1 | 69.6 | 91.1 | 24 / 35 | 5042 |
| 6 | 1 | 71.4 | 95.6 | 30 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 88% |
| catcat20.shape.Theta 0.018 | 51 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 85% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 90% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 46% | 105 |
| catcat20.shape.Theta 0.018 | 17 | 30% | 49 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 15 |
| pa.Improved 1.0 | 1 | 2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 3 |

## Melee bench: F15

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.9 | 104 / 210 | 2.63 | 17.9% | 31642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 17.9% | 104 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.8% | 20 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 42 |
| mld.DustBunny 3.8 | 4.0 | 12.1% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.0% | 13 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.5% | 16 |
| lambdaxy.TBot 0.1 | 7.3 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 21 / 35 | 5624 |
| 2 | 1 | 69.2 | 84.4 | 21 / 35 | 5991 |
| 3 | 1 | 65.9 | 77.1 | 15 / 35 | 5158 |
| 4 | 1 | 67.2 | 80.6 | 20 / 35 | 5092 |
| 5 | 1 | 66.1 | 81.0 | 14 / 35 | 4710 |
| 6 | 1 | 66.7 | 82.5 | 13 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 43 | 65% |
| kawigi.micro.Shiz 1.1 | 34 | 94% |
| mld.DustBunny 3.8 | 22 | 82% |
| cb.nano.Insomnia 1.0 | 14 | 93% |
| kawigi.robot.Girl 1.2 | 13 | 77% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 32% | 77 |
| cb.nano.Insomnia 1.0 | 24 | 23% | 24 |
| mld.DustBunny 3.8 | 19 | 18% | 39 |
| kawigi.micro.Shiz 1.1 | 11 | 10% | 40 |
| kawigi.robot.Girl 1.2 | 6 | 6% | 8 |
| divineomega.TrialBot 0.003 | 5 | 5% | 10 |
| lambdaxy.TBot 0.1 | 5 | 5% | 8 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.7 | 104 / 210 | 2.38 | 18.6% | 33702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.6% | 104 |
| gh.Griezel 0.5.2 | 2.0 | 16.4% | 65 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 12 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.6% | 1 |
| techdude.forest.FlamingForest 1.1 | 5.0 | 9.6% | 22 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.8% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.5 | 7.7% | 3 |
| asd.Cthulhu 1.3 | 8.8 | 5.1% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.2% | 1 |
| repositorio.NanoStep 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.3 | 21 / 35 | 5604 |
| 2 | 1 | 68.2 | 83.8 | 19 / 35 | 5358 |
| 3 | 1 | 67.2 | 81.6 | 14 / 35 | 5360 |
| 4 | 1 | 68.6 | 85.4 | 17 / 35 | 5595 |
| 5 | 1 | 70.8 | 90.5 | 20 / 35 | 6170 |
| 6 | 1 | 67.1 | 79.7 | 13 / 35 | 5615 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 58% |
| techdude.forest.FlamingForest 1.1 | 22 | 55% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 94% |
| tvv.nano.Polaris 1.2 | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1196. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 58 | 54% | 107 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 22% | 48 |
| techdude.forest.FlamingForest 1.1 | 12 | 11% | 22 |
| bvh.fnr.Fenrir 0.36l | 4 | 4% | 4 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 12 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 8 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

## Melee bench: F17

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.8 | 109 / 210 | 2.19 | 18.5% | 31299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.5% | 109 |
| et.Predator 1.8 | 2.8 | 13.0% | 22 |
| oog.melee.Mercutio 1.0 | 2.8 | 13.0% | 30 |
| nic.Nicator 2.4 | 4.3 | 11.3% | 11 |
| cx.BlestPain 1.41 | 4.5 | 11.6% | 31 |
| ahf.NanoAndrew .4 | 5.5 | 10.4% | 8 |
| maribo.melee.BMV 0.1 | 7.0 | 8.2% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.7% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.4 | 16 / 35 | 4909 |
| 2 | 1 | 68.5 | 87.6 | 17 / 35 | 5394 |
| 3 | 1 | 68.8 | 88.6 | 18 / 35 | 5449 |
| 4 | 1 | 68.3 | 85.1 | 17 / 35 | 5399 |
| 5 | 1 | 68.7 | 88.6 | 21 / 35 | 5149 |
| 6 | 1 | 68.4 | 86.3 | 20 / 35 | 4999 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Mercutio 1.0 | 39 | 69% |
| et.Predator 1.8 | 39 | 85% |
| cx.BlestPain 1.41 | 22 | 41% |
| nic.Nicator 2.4 | 21 | 81% |
| ahf.NanoAndrew .4 | 15 | 100% |
| maribo.melee.BMV 0.1 | 6 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 28 | 27% | 42 |
| oog.melee.Mercutio 1.0 | 23 | 22% | 55 |
| et.Predator 1.8 | 21 | 20% | 51 |
| nic.Nicator 2.4 | 13 | 13% | 26 |
| ahf.NanoAndrew .4 | 12 | 12% | 24 |
| maribo.melee.BMV 0.1 | 2 | 2% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 5 |
| tex.Longbot 0.4 | 1 | 1% | 2 |
3 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.4 | 128 / 210 | 2.13 | 18.6% | 27849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.6% | 128 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 32 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.3% | 25 |
| uji.DBH 1.1 | 4.2 | 10.6% | 9 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 1 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.0% | 3 |
| sigterm.Sigterm 1.0 | 7.0 | 8.0% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.0% | 3 |
| stelo.WangRobot 1.0 | 8.7 | 6.0% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 86.3 | 21 / 35 | 4892 |
| 2 | 1 | 67.5 | 86.7 | 22 / 35 | 4431 |
| 3 | 1 | 66.6 | 85.4 | 20 / 35 | 4230 |
| 4 | 1 | 69.1 | 88.6 | 24 / 35 | 4817 |
| 5 | 1 | 69.7 | 93.3 | 24 / 35 | 4907 |
| 6 | 1 | 66.6 | 84.1 | 17 / 35 | 4572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 82% |
| agd.Mooserwirt2 2.7 | 29 | 62% |
| uji.DBH 1.1 | 22 | 82% |
| ratosh.Nobo 0.21 | 18 | 100% |
| sigterm.Sigterm 1.0 | 15 | 73% |
| spinnercat.Robovirus 2.718 | 12 | 92% |
| stelo.WangRobot 1.0 | 7 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 36% | 74 |
| agd.Mooserwirt2 2.7 | 16 | 19% | 42 |
| sigterm.Sigterm 1.0 | 9 | 11% | 13 |
| uji.DBH 1.1 | 6 | 7% | 21 |
| ratosh.Nobo 0.21 | 5 | 6% | 19 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 15 |
| stelo.WangRobot 1.0 | 5 | 6% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 8 |

## Melee bench: F19

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 93.9 | 161 / 210 | 1.55 | 21.0% | 35422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 21.0% | 161 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.6% | 16 |
| mld.Infinity 2.2 | 2.5 | 14.3% | 25 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.3% | 6 |
| erdnis.Rover 0.3 | 4.7 | 9.9% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 1 |
| mbh.Mbh 0.1 | 7.5 | 6.8% | 0 |
| pac.ABC 2.1 | 7.5 | 6.9% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.6 | 26 / 35 | 5741 |
| 2 | 1 | 70.9 | 91.4 | 25 / 35 | 5479 |
| 3 | 1 | 71.5 | 92.1 | 25 / 35 | 5814 |
| 4 | 1 | 72.4 | 95.9 | 29 / 35 | 6068 |
| 5 | 1 | 71.9 | 93.3 | 26 / 35 | 6030 |
| 6 | 1 | 73.1 | 96.2 | 30 / 35 | 6290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 89 | 92% |
| mld.Infinity 2.2 | 57 | 84% |
| krillr.mini.JointStrike 2.0.0 | 18 | 89% |
| patson.PatsonTestBot 1.0 | 6 | 83% |
| pac.ABC 2.1 | 3 | 100% |
| erdnis.Rover 0.3 | 3 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 1087. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 16 | 33% | 26 |
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 29% | 98 |
| krillr.mini.JointStrike 2.0.0 | 12 | 24% | 31 |
| patson.PatsonTestBot 1.0 | 3 | 6% | 17 |
| erdnis.Rover 0.3 | 3 | 6% | 14 |
| pac.ABC 2.1 | 1 | 2% | 1 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| mbh.Mbh 0.1 | 0 | 0% | 8 |

## Melee bench: F20

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.2 | 131 / 210 | 1.80 | 20.1% | 33959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 20.1% | 131 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 32 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.4% | 8 |
| fwb.Nine 1.0.1 | 4.2 | 10.9% | 16 |
| catcat20.Rabbit 0.001 | 4.2 | 10.9% | 21 |
| bayen.nut.Squirrel 1.615 | 6.5 | 7.7% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.7% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 7.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 16 / 35 | 5475 |
| 2 | 1 | 72.8 | 97.8 | 30 / 35 | 6170 |
| 3 | 1 | 70.0 | 89.5 | 22 / 35 | 5602 |
| 4 | 1 | 70.3 | 92.1 | 23 / 35 | 5632 |
| 5 | 1 | 70.0 | 91.4 | 20 / 35 | 5584 |
| 6 | 1 | 69.3 | 89.2 | 20 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 75% |
| fwb.Nine 1.0.1 | 34 | 74% |
| catcat20.Rabbit 0.001 | 33 | 73% |
| nz.jdc.nano.GridFu 1.0 | 11 | 82% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1169. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 39 | 48% | 94 |
| catcat20.Rabbit 0.001 | 13 | 16% | 39 |
| fwb.Nine 1.0.1 | 13 | 16% | 12 |
| nz.jdc.nano.GridFu 1.0 | 10 | 12% | 34 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 15 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |

## Melee bench: F21

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.6 | 135 / 210 | 1.75 | 20.1% | 33885 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 20.1% | 135 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 3 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.3% | 2 |
| eld.Hmm 1.0 | 5.7 | 8.0% | 5 |
| fire219.CatBot 1.0 | 7.0 | 6.8% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 21 / 35 | 5684 |
| 2 | 1 | 70.8 | 92.7 | 23 / 35 | 5535 |
| 3 | 1 | 71.0 | 93.7 | 26 / 35 | 5647 |
| 4 | 1 | 70.7 | 92.1 | 23 / 35 | 5622 |
| 5 | 1 | 69.7 | 89.5 | 20 / 35 | 5366 |
| 6 | 1 | 70.5 | 89.2 | 22 / 35 | 6031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 107 | 69% |
| dummy.mini.Scimitar 1.01 | 38 | 84% |
| cf.RiO.RiOx 4.2.1 | 16 | 100% |
| eld.Hmm 1.0 | 9 | 89% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 42 | 55% | 100 |
| dummy.mini.Scimitar 1.01 | 17 | 22% | 63 |
| cf.RiO.RiOx 4.2.1 | 6 | 8% | 18 |
| eld.Hmm 1.0 | 4 | 5% | 18 |
| oa.weak.BotherBot 0.1 | 4 | 5% | 7 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.0 | 97 / 210 | 2.26 | 18.0% | 30026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.0% | 97 |
| pe.SandboxDT 2.71m | 2.3 | 16.3% | 52 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.2% | 39 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.8% | 18 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 5 |
| tad.Dalek98 0.98 | 6.8 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 18 / 35 | 5147 |
| 2 | 1 | 68.1 | 85.7 | 13 / 35 | 5265 |
| 3 | 1 | 68.1 | 84.1 | 18 / 35 | 4918 |
| 4 | 1 | 69.0 | 87.3 | 18 / 35 | 5338 |
| 5 | 1 | 67.3 | 85.4 | 16 / 35 | 4711 |
| 6 | 1 | 67.2 | 84.8 | 14 / 35 | 4647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 52 | 63% |
| kvk.HebusLeTroll 0.35 | 44 | 73% |
| jlm.javaDisturbance 0.59 | 22 | 77% |
| bigpete.Stewie 1.0 | 10 | 80% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 5 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 46 | 40% | 82 |
| kvk.HebusLeTroll 0.35 | 39 | 34% | 61 |
| jlm.javaDisturbance 0.59 | 20 | 18% | 41 |
| bigpete.Stewie 1.0 | 6 | 5% | 17 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.9 | 123 / 210 | 2.00 | 18.9% | 29980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.2 | 18.9% | 123 |
| pe.SandboxLump 1.52 | 1.8 | 17.8% | 60 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 17 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 8.9% | 6 |
| cw.megas.Blade 0.8 | 7.3 | 7.5% | 0 |
| sample.Walls 1.0 | 7.5 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 20 / 35 | 5208 |
| 2 | 1 | 68.3 | 84.8 | 18 / 35 | 5035 |
| 3 | 2 | 68.6 | 87.0 | 18 / 35 | 4793 |
| 4 | 1 | 71.1 | 93.7 | 25 / 35 | 4933 |
| 5 | 1 | 70.6 | 91.7 | 21 / 35 | 5025 |
| 6 | 1 | 69.6 | 89.2 | 21 / 35 | 4986 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 93 | 70% |
| cre.Karolos 0.32 | 27 | 89% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |

Hadur died in 87 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 50 | 57% | 120 |
| cre.Karolos 0.32 | 14 | 16% | 34 |
| stelo.AreaTargetingBot 1.1 | 7 | 8% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 7% | 10 |
| sample.Walls 1.0 | 4 | 5% | 10 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 10 |
| rrh.Iwillfindyou 2.0 | 2 | 2% | 4 |
| cw.megas.Blade 0.8 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 78.3 | 68 / 210 | 2.96 | 15.5% | 22503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 15.5% | 68 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 43 |
| davidalves.Phoenix 0.54 | 3.5 | 12.9% | 41 |
| florent.XSeries.X2 0.12 | 3.7 | 12.6% | 33 |
| pedersen.Ugluk 1.1.1 | 4.7 | 12.1% | 17 |
| oog.melee.Corsair 1.0 | 6.3 | 8.8% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.2% | 3 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.9% | 2 |
| as.FrankTheTank 1.3 | 9.0 | 5.0% | 1 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 77.5 | 13 / 35 | 3695 |
| 2 | 1 | 63.7 | 78.7 | 12 / 35 | 3660 |
| 3 | 1 | 62.5 | 76.8 | 7 / 35 | 3732 |
| 4 | 1 | 64.3 | 80.6 | 12 / 35 | 3736 |
| 5 | 1 | 63.9 | 77.8 | 12 / 35 | 3682 |
| 6 | 1 | 63.9 | 78.1 | 12 / 35 | 3998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 62% |
| davidalves.Phoenix 0.54 | 20 | 40% |
| pedersen.Ugluk 1.1.1 | 20 | 85% |
| florent.XSeries.X2 0.12 | 19 | 53% |
| stelo.SoJNanoMelee 1.1 | 12 | 100% |
| oog.melee.Corsair 1.0 | 2 | 50% |
| as.FrankTheTank 1.3 | 2 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 43 | 30% | 57 |
| rz.GlowBlowMelee 1.4 | 29 | 20% | 47 |
| florent.XSeries.X2 0.12 | 29 | 20% | 36 |
| pedersen.Ugluk 1.1.1 | 26 | 18% | 36 |
| oog.melee.Corsair 1.0 | 5 | 3% | 13 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 8 |
| lunchie.Lunchbox 0.93 | 5 | 3% | 7 |
| as.FrankTheTank 1.3 | 1 | 1% | 4 |
| evd.X1 0.01 | 0 | 0% | 1 |

## Melee bench: F25

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.2 | 134 / 210 | 2.24 | 18.5% | 25755 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.5% | 134 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.4% | 14 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.1% | 17 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 22 |
| ds.Oo 2.2 | 5.5 | 8.7% | 11 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.4% | 4 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.6% | 7 |
| awesomeness.Elite 1.0 | 8.0 | 7.1% | 1 |
| adt.Ar2 1.1 | 8.8 | 6.3% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 85.4 | 22 / 35 | 4140 |
| 2 | 1 | 67.5 | 84.8 | 22 / 35 | 4111 |
| 3 | 1 | 68.4 | 87.3 | 24 / 35 | 4308 |
| 4 | 1 | 67.4 | 85.7 | 21 / 35 | 4097 |
| 5 | 1 | 68.0 | 85.1 | 22 / 35 | 4503 |
| 6 | 1 | 69.4 | 89.2 | 23 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 90% |
| voidious.micro.BlitzBat 1.05 | 38 | 95% |
| jdw.Hurricane 1.4 | 25 | 84% |
| gjr.Cephalosporin 0.1 | 8 | 75% |
| ds.Oo 2.2 | 7 | 86% |
| gre.svman4.Morfeas 1.4.1 | 7 | 86% |
| awesomeness.Elite 1.0 | 7 | 100% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 21 | 28% | 38 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 22% | 63 |
| voidious.micro.BlitzBat 1.05 | 12 | 16% | 44 |
| ds.Oo 2.2 | 8 | 11% | 16 |
| gre.svman4.Morfeas 1.4.1 | 6 | 8% | 20 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 10 |
| adt.Ar2 1.1 | 3 | 4% | 9 |
| awesomeness.Elite 1.0 | 3 | 4% | 7 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |

## Melee bench: F26

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.5 | 120 / 210 | 2.04 | 18.9% | 32890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.9% | 120 |
| ak.Fermat 2.0 | 2.2 | 14.8% | 40 |
| lrem.Spectre 0.4.4 | 2.8 | 13.0% | 22 |
| shu.nitro.LENIN .T34 | 4.0 | 11.9% | 19 |
| js.PinBall 1.6 | 5.3 | 10.5% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.1% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.2% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.1% | 1 |
| sample.SpinBot 1.0 | 8.8 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 22 / 35 | 5734 |
| 2 | 1 | 67.5 | 84.4 | 16 / 35 | 5124 |
| 3 | 1 | 68.6 | 88.3 | 16 / 35 | 5409 |
| 4 | 1 | 70.3 | 88.3 | 25 / 35 | 5865 |
| 5 | 1 | 68.8 | 88.6 | 20 / 35 | 5032 |
| 6 | 1 | 69.5 | 88.9 | 21 / 35 | 5726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 48 | 65% |
| lrem.Spectre 0.4.4 | 44 | 82% |
| shu.nitro.LENIN .T34 | 32 | 84% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| js.PinBall 1.6 | 9 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 35 | 38% | 67 |
| shu.nitro.LENIN .T34 | 22 | 24% | 51 |
| lrem.Spectre 0.4.4 | 21 | 23% | 49 |
| js.PinBall 1.6 | 5 | 5% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 13 |
| sample.SpinBot 1.0 | 2 | 2% | 3 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 5 |

## Melee bench: F27

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.1 | 139 / 210 | 2.07 | 18.5% | 26561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.5% | 139 |
| mk.Alpha 0.2.1 | 2.3 | 13.6% | 26 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.5% | 17 |
| EH.Eagle 1.0.6 | 3.8 | 11.0% | 8 |
| wee.Gem 1.8.4 | 4.7 | 10.4% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.1% | 1 |
| joe.ADinosaur 1.0 | 7.0 | 8.2% | 0 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.2% | 0 |
| throxbot.ThroxBot 0.1 | 8.8 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.3 | 21 / 35 | 4068 |
| 2 | 1 | 68.9 | 90.2 | 25 / 35 | 4713 |
| 3 | 1 | 67.9 | 88.6 | 20 / 35 | 4654 |
| 4 | 1 | 67.6 | 85.4 | 23 / 35 | 4416 |
| 5 | 1 | 68.2 | 88.9 | 26 / 35 | 4393 |
| 6 | 1 | 68.2 | 89.2 | 24 / 35 | 4317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 89% |
| wee.Gem 1.8.4 | 27 | 74% |
| EH.Eagle 1.0.6 | 25 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 25 | 84% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 22 | 31% | 83 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 22% | 33 |
| wee.Gem 1.8.4 | 11 | 15% | 32 |
| EH.Eagle 1.0.6 | 9 | 13% | 31 |
| joe.ADinosaur 1.0 | 6 | 8% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 13 |
| throxbot.ThroxBot 0.1 | 2 | 3% | 7 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.0 | 136 / 210 | 1.99 | 18.8% | 27224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.8% | 136 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 40 |
| uji.Antique 1.0 | 3.8 | 11.4% | 12 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.2% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.1% | 5 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.0% | 3 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.5% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.0 | 5.6% | 0 |
| matt.advanced.Katana 1.0 | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 92.4 | 24 / 35 | 4667 |
| 2 | 1 | 68.3 | 88.3 | 23 / 35 | 4409 |
| 3 | 1 | 69.0 | 90.8 | 24 / 35 | 4634 |
| 4 | 1 | 68.6 | 88.9 | 25 / 35 | 4550 |
| 5 | 1 | 67.2 | 83.5 | 19 / 35 | 4471 |
| 6 | 1 | 68.5 | 90.2 | 21 / 35 | 4493 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 79 | 80% |
| uji.Antique 1.0 | 43 | 86% |
| qohnil.blot.BlotBot 3.61 | 13 | 77% |
| amk.ChumbaWumba 0.3 | 10 | 90% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 36 | 47% | 97 |
| uji.Antique 1.0 | 11 | 14% | 42 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 19 |
| amk.ChumbaWumba 0.3 | 10 | 13% | 14 |
| qohnil.blot.BlotBot 3.61 | 6 | 8% | 21 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 9 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.1 | 124 / 210 | 2.34 | 18.8% | 29720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.8% | 124 |
| deewiant.Anomaly 0.2 | 2.3 | 14.8% | 31 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.8% | 39 |
| myl.micro.Troodon 1.10 | 4.0 | 12.2% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 10.0% | 4 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 7.2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.9% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.2% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 90.2 | 23 / 35 | 5193 |
| 2 | 1 | 69.3 | 86.0 | 22 / 35 | 4990 |
| 3 | 1 | 68.6 | 85.4 | 20 / 35 | 4778 |
| 4 | 1 | 67.8 | 80.6 | 19 / 35 | 4911 |
| 5 | 1 | 68.9 | 83.5 | 21 / 35 | 4885 |
| 6 | 1 | 68.6 | 84.8 | 19 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 64 | 86% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 86% |
| myl.micro.Troodon 1.10 | 28 | 96% |
| DBall.Anarchy 0.1 | 7 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| jok.PheonixM 0.1.2 | 2 | 50% |

Hadur died in 87 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 44% | 95 |
| zyx.mega.YersiniaPestis 3.1 | 17 | 20% | 54 |
| jok.PheonixM 0.1.2 | 15 | 17% | 20 |
| myl.micro.Troodon 1.10 | 12 | 14% | 25 |
| DBall.Anarchy 0.1 | 2 | 2% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 73.5 | 52 / 210 | 3.39 | 14.8% | 23933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.8 | 14.8% | 52 |
| catcat20.Matcha 0.006 | 2.0 | 14.2% | 53 |
| oog.melee.Capulet 1.2 | 3.0 | 13.7% | 35 |
| darkcanuck.B26354 1.06 | 3.5 | 13.1% | 40 |
| stelo.PastFuture 2.3.2 | 4.7 | 11.9% | 14 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.7% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.8% | 4 |
| ntc.Opposite 1.5 | 7.8 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.0% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 70.8 | 5 / 35 | 3975 |
| 2 | 1 | 62.7 | 73.7 | 10 / 35 | 4152 |
| 3 | 2 | 62.6 | 72.7 | 10 / 35 | 4029 |
| 4 | 1 | 64.6 | 79.0 | 12 / 35 | 4183 |
| 5 | 3 | 60.7 | 69.5 | 5 / 35 | 3745 |
| 6 | 1 | 63.5 | 75.2 | 10 / 35 | 3849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 26 | 54% |
| catcat20.Matcha 0.006 | 24 | 33% |
| darkcanuck.B26354 1.06 | 20 | 45% |
| stelo.PastFuture 2.3.2 | 16 | 88% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |
| tripphippy.Alice 1.1 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 39 | 25% | 47 |
| oog.melee.Capulet 1.2 | 36 | 23% | 50 |
| darkcanuck.B26354 1.06 | 35 | 22% | 48 |
| stelo.PastFuture 2.3.2 | 21 | 13% | 33 |
| ntc.Opposite 1.5 | 9 | 6% | 10 |
| tripphippy.Alice 1.1 | 7 | 4% | 8 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.9 | 61 / 210 | 3.17 | 15.1% | 21696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 96 |
| hadur117.mini.DeiseW10 0.3 | 2.0 | 15.1% | 61 |
| gh.mini.Griezel 0.2 | 3.0 | 12.9% | 35 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.5% | 5 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.8% | 8 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.5% | 2 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 4 |
| fm.mammillarias 1.3 | 7.7 | 6.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 77.5 | 13 / 35 | 3742 |
| 2 | 2 | 63.8 | 77.5 | 10 / 35 | 3759 |
| 3 | 2 | 61.1 | 70.8 | 8 / 35 | 3537 |
| 4 | 2 | 65.5 | 81.6 | 12 / 35 | 3782 |
| 5 | 2 | 63.1 | 74.6 | 10 / 35 | 3562 |
| 6 | 2 | 61.7 | 73.7 | 8 / 35 | 3314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 52 | 56% |
| gh.mini.Griezel 0.2 | 23 | 52% |
| spinnercat.micro.Tyger 0.1 | 9 | 89% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| fm.mammillarias 1.3 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 0% |

Hadur died in 150 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 37% | 87 |
| gh.mini.Griezel 0.2 | 38 | 25% | 49 |
| spinnercat.micro.Tyger 0.1 | 22 | 15% | 30 |
| d414.nano.Quantum 1.0.0 | 14 | 9% | 21 |
| fm.mammillarias 1.3 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 5 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.7 | 132 / 210 | 1.92 | 18.9% | 29202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.9% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 55 |
| apc.botM 3.0 | 3.3 | 11.8% | 7 |
| lxx.ConceptA 0.8 | 3.8 | 10.6% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 9.2% | 3 |
| bayen.UbaMicro 1.4 | 6.2 | 8.7% | 3 |
| panzer.Panzer 0.2 | 6.7 | 8.0% | 1 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 0 |
| yk.JahMicro 1.0 | 8.8 | 6.3% | 2 |
| donjezza.Jezza 1.0 | 9.5 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.7 | 20 / 35 | 4985 |
| 2 | 1 | 66.6 | 84.8 | 20 / 35 | 4444 |
| 3 | 1 | 68.8 | 90.8 | 23 / 35 | 4732 |
| 4 | 1 | 69.5 | 91.7 | 24 / 35 | 5086 |
| 5 | 1 | 68.4 | 91.1 | 21 / 35 | 4680 |
| 6 | 1 | 69.9 | 94.3 | 24 / 35 | 5275 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 60% |
| lxx.ConceptA 0.8 | 31 | 84% |
| apc.botM 3.0 | 24 | 96% |
| bayen.UbaMicro 1.4 | 13 | 92% |
| vjik.UnViolation 1.1 | 9 | 100% |
| panzer.Panzer 0.2 | 8 | 100% |
| donjezza.Jezza 1.0 | 7 | 86% |
| yk.JahMicro 1.0 | 2 | 50% |

Hadur died in 79 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 53% | 103 |
| lxx.ConceptA 0.8 | 17 | 22% | 26 |
| apc.botM 3.0 | 5 | 6% | 32 |
| bayen.UbaMicro 1.4 | 4 | 5% | 10 |
| panzer.Panzer 0.2 | 4 | 5% | 7 |
| vjik.UnViolation 1.1 | 3 | 4% | 22 |
| donjezza.Jezza 1.0 | 1 | 1% | 6 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
| yk.JahMicro 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.5 | 140 / 210 | 1.94 | 19.7% | 30857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 19.7% | 140 |
| maribo.Quester 0.3 | 2.0 | 15.1% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.2% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.4% | 16 |
| labg.Cataclysm 2.05 | 5.0 | 10.3% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 9.2% | 5 |
| baal.nano.N 1.42 | 6.5 | 9.0% | 1 |
| zyx.micro.Ant 1.1 | 8.5 | 5.2% | 0 |
| sanja.First 0.1 | 9.2 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 19 / 35 | 5040 |
| 2 | 1 | 71.4 | 93.0 | 27 / 35 | 5652 |
| 3 | 1 | 70.1 | 92.1 | 27 / 35 | 4735 |
| 4 | 1 | 70.9 | 92.4 | 26 / 35 | 5329 |
| 5 | 1 | 68.4 | 84.8 | 18 / 35 | 5066 |
| 6 | 1 | 69.6 | 88.6 | 23 / 35 | 5035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 84% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 95% |
| gre.svman4.Leonidas 1.3.2 | 30 | 90% |
| labg.Cataclysm 2.05 | 17 | 76% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 89% |
| baal.nano.N 1.42 | 5 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 28 | 39% | 82 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 17% | 58 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 15% | 12 |
| labg.Cataclysm 2.05 | 9 | 13% | 26 |
| gre.svman4.Leonidas 1.3.2 | 6 | 8% | 22 |
| baal.nano.N 1.42 | 3 | 4% | 5 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.6 | 89 / 210 | 2.56 | 17.2% | 28729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.2 | 17.2% | 89 |
| kid.Gladiator .7.2 | 2.3 | 15.5% | 36 |
| stelo.Spread 0.9 | 2.5 | 15.8% | 67 |
| tcf.Reach 3 | 4.3 | 11.3% | 5 |
| jcs.Seth 1.8 | 4.7 | 10.9% | 12 |
| cli.Dancer 1.1 | 6.0 | 9.7% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.9 | 13 / 35 | 5030 |
| 2 | 2 | 64.9 | 77.1 | 10 / 35 | 4385 |
| 3 | 1 | 66.1 | 79.0 | 13 / 35 | 4694 |
| 4 | 1 | 67.1 | 81.9 | 19 / 35 | 4731 |
| 5 | 1 | 66.7 | 82.5 | 14 / 35 | 4612 |
| 6 | 1 | 69.9 | 92.4 | 20 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 62 | 56% |
| kid.Gladiator .7.2 | 47 | 66% |
| jcs.Seth 1.8 | 13 | 69% |
| tcf.Reach 3 | 7 | 100% |
| cli.Dancer 1.1 | 5 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 50 | 41% | 83 |
| kid.Gladiator .7.2 | 34 | 28% | 58 |
| tcf.Reach 3 | 21 | 17% | 30 |
| jcs.Seth 1.8 | 9 | 7% | 24 |
| ratosh.Wesco 1.4 | 4 | 3% | 6 |
| cli.Dancer 1.1 | 2 | 2% | 8 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.4 | 37 / 210 | 2.86 | 15.1% | 21149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 143 |
| hadur117.mini.DeiseW10 0.3 | 2.2 | 15.1% | 37 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.8% | 21 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.6% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 1 |
| wit.Chuliath 1.0 | 6.5 | 7.1% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.6% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 75.2 | 5 / 35 | 3810 |
| 2 | 2 | 63.3 | 79.0 | 5 / 35 | 3498 |
| 3 | 2 | 63.9 | 78.7 | 9 / 35 | 3450 |
| 4 | 2 | 64.3 | 82.2 | 4 / 35 | 3679 |
| 5 | 2 | 64.7 | 83.5 | 8 / 35 | 3465 |
| 6 | 3 | 62.9 | 77.5 | 6 / 35 | 3247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 79 | 20% |
| gh.mini.Gruwel 0.9 | 15 | 40% |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 77% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| wit.Chuliath 1.0 | 2 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 50% | 103 |
| gh.mini.Gruwel 0.9 | 41 | 24% | 47 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 11% | 29 |
| rz.HawkOnFire 0.1 | 14 | 8% | 18 |
| wit.Chuliath 1.0 | 5 | 3% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.0 | 175 / 210 | 1.54 | 21.1% | 32810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 21.1% | 175 |
| bzdp.Pansy 2.1 | 2.7 | 11.7% | 8 |
| alpha.RainingFire 1.0 | 3.2 | 11.3% | 9 |
| bvh.micro.Freya 0.3 | 3.5 | 11.0% | 6 |
| mz.Cork 0.1 | 5.3 | 10.2% | 4 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.4% | 2 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.8% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 92.7 | 27 / 35 | 5279 |
| 2 | 1 | 71.7 | 94.0 | 31 / 35 | 5484 |
| 3 | 1 | 71.0 | 94.3 | 29 / 35 | 5250 |
| 4 | 1 | 71.6 | 94.9 | 30 / 35 | 5718 |
| 5 | 1 | 72.5 | 96.8 | 31 / 35 | 5747 |
| 6 | 1 | 70.3 | 91.1 | 27 / 35 | 5332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 53 | 100% |
| bvh.micro.Freya 0.3 | 39 | 92% |
| mz.Cork 0.1 | 28 | 100% |
| alpha.RainingFire 1.0 | 23 | 83% |
| bvh.mini.Fenrir 0.39 | 20 | 100% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 11 | 31% | 63 |
| alpha.RainingFire 1.0 | 10 | 29% | 35 |
| bvh.micro.Freya 0.3 | 4 | 11% | 28 |
| mz.Cork 0.1 | 3 | 9% | 37 |
| m3thos.Eva02 0.7.1 | 3 | 9% | 21 |
| bvh.mini.Fenrir 0.39 | 2 | 6% | 10 |
| dl.BetterWalls 1.0 | 1 | 3% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 4 |

## Melee bench: F37

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.8 | 179 / 210 | 1.56 | 20.5% | 34826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 20.5% | 179 |
| germ.TheMind .2 | 2.2 | 11.4% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.1% | 4 |
| EBBU.Sim2 1.02 | 4.8 | 9.4% | 5 |
| agrach.Dalek 1.0 | 5.7 | 8.7% | 1 |
| mb.Beast 0.1 | 6.8 | 8.1% | 4 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.5% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 7.9% | 1 |
| lmk.ACPFinal 0.1 | 7.8 | 7.9% | 2 |
| skm.Ryubot 1.0 | 8.8 | 7.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.3 | 31 / 35 | 6328 |
| 2 | 1 | 70.7 | 95.9 | 32 / 35 | 5888 |
| 3 | 1 | 68.6 | 90.5 | 29 / 35 | 5158 |
| 4 | 1 | 69.5 | 92.7 | 27 / 35 | 5952 |
| 5 | 1 | 70.8 | 95.2 | 31 / 35 | 6075 |
| 6 | 1 | 69.8 | 94.9 | 29 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 57 | 95% |
| stelo.UntouchableNano 1.3 | 27 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 95% |
| agrach.Dalek 1.0 | 20 | 100% |
| EBBU.Sim2 1.02 | 19 | 100% |
| mb.Beast 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| skm.Ryubot 1.0 | 11 | 91% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 6 | 19% | 34 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 16% | 33 |
| stelo.UntouchableNano 1.3 | 5 | 16% | 19 |
| germ.TheMind .2 | 4 | 13% | 41 |
| lmk.ACPFinal 0.1 | 4 | 13% | 19 |
| EBBU.Sim2 1.02 | 2 | 6% | 26 |
| mb.Beast 0.1 | 2 | 6% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 6% | 9 |
| skm.Ryubot 1.0 | 1 | 3% | 5 |

## Melee bench: F38

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.8 | 75 / 210 | 2.90 | 16.0% | 24973 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.5 | 16.0% | 75 |
| justin.Mallais 14.0 | 1.5 | 16.2% | 72 |
| bvh.mini.Freya 0.55 | 3.2 | 13.0% | 19 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.4% | 20 |
| cs.Wren 1.0 | 4.8 | 10.9% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.4% | 7 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.4% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.6% | 2 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 82.9 | 15 / 35 | 4433 |
| 2 | 2 | 65.1 | 79.7 | 14 / 35 | 3949 |
| 3 | 1 | 66.9 | 84.1 | 14 / 35 | 4361 |
| 4 | 1 | 65.0 | 80.3 | 13 / 35 | 4274 |
| 5 | 2 | 62.5 | 72.1 | 9 / 35 | 3994 |
| 6 | 2 | 62.6 | 74.0 | 10 / 35 | 3962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 48% |
| bts.mega.Gnarly 1.4 | 19 | 74% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 67% |
| bvh.mini.Freya 0.55 | 15 | 80% |
| cs.Wren 1.0 | 14 | 93% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 57 | 42% | 82 |
| bts.mega.Gnarly 1.4 | 23 | 17% | 41 |
| davidalves.net.DuelistNanoMelee 1.01 | 16 | 12% | 26 |
| bvh.mini.Freya 0.55 | 15 | 11% | 24 |
| cs.Wren 1.0 | 12 | 9% | 20 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 3 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.2 | 98 / 210 | 2.42 | 17.7% | 29647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.2 | 17.7% | 98 |
| bvh.fry.Freya 0.82 | 2.0 | 14.5% | 34 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 48 |
| catcat20.Lambda 0.024 | 3.8 | 11.0% | 21 |
| gimp.GimpBot 0.1 | 5.7 | 8.7% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 9.2% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.5 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.0 | 20 / 35 | 5047 |
| 2 | 1 | 67.0 | 84.1 | 15 / 35 | 4983 |
| 3 | 2 | 64.2 | 78.1 | 10 / 35 | 4559 |
| 4 | 1 | 67.7 | 85.1 | 16 / 35 | 5350 |
| 5 | 1 | 66.9 | 84.4 | 17 / 35 | 4942 |
| 6 | 1 | 67.7 | 87.3 | 20 / 35 | 4766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 44 | 50% |
| bvh.fry.Freya 0.82 | 33 | 82% |
| catcat20.Lambda 0.024 | 29 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 19 | 95% |
| gimp.GimpBot 0.1 | 7 | 86% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1001. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 49 | 44% | 74 |
| az.Ololobot 0.2.4 | 31 | 28% | 53 |
| catcat20.Lambda 0.024 | 13 | 12% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 8% | 19 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 11 |
| gimp.GimpBot 0.1 | 3 | 3% | 12 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.1 | 114 / 210 | 2.34 | 18.2% | 28763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.2% | 114 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 45 |
| kano.gamma.KanoGamma 1.8 | 3.8 | 12.1% | 21 |
| Polkwane.SmashMelee 1.0 | 4.2 | 11.1% | 5 |
| mz.AntiGrav 1.0 | 4.7 | 10.4% | 8 |
| stelo.Randomness 1.0 | 5.3 | 9.3% | 11 |
| alpha.BlackIce 1.0 | 7.0 | 8.5% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.9% | 1 |
| sample.Corners 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 78.1 | 15 / 35 | 4414 |
| 2 | 1 | 66.7 | 80.0 | 19 / 35 | 4676 |
| 3 | 1 | 68.9 | 89.5 | 21 / 35 | 4880 |
| 4 | 1 | 69.1 | 87.9 | 19 / 35 | 5173 |
| 5 | 1 | 69.1 | 90.5 | 20 / 35 | 4761 |
| 6 | 1 | 67.8 | 84.4 | 20 / 35 | 4859 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 50 | 70% |
| kano.gamma.KanoGamma 1.8 | 28 | 75% |
| Polkwane.SmashMelee 1.0 | 23 | 96% |
| stelo.Randomness 1.0 | 14 | 79% |
| mz.AntiGrav 1.0 | 14 | 100% |
| alpha.BlackIce 1.0 | 6 | 83% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 42% | 68 |
| kano.gamma.KanoGamma 1.8 | 19 | 20% | 43 |
| stelo.Randomness 1.0 | 12 | 13% | 28 |
| mz.AntiGrav 1.0 | 9 | 9% | 32 |
| Polkwane.SmashMelee 1.0 | 9 | 9% | 25 |
| alpha.BlackIce 1.0 | 5 | 5% | 8 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.9 | 104 / 210 | 2.36 | 17.5% | 25376 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.2 | 17.5% | 104 |
| eem.EvBotNG v12.8 | 1.8 | 15.7% | 67 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 17 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.0% | 7 |
| shrub.Silver v048 | 6.2 | 8.3% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.9% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.8 | 18 / 35 | 4212 |
| 2 | 2 | 65.6 | 78.7 | 13 / 35 | 4456 |
| 3 | 1 | 66.5 | 83.8 | 18 / 35 | 3961 |
| 4 | 1 | 69.0 | 91.7 | 22 / 35 | 4303 |
| 5 | 1 | 67.9 | 87.0 | 17 / 35 | 4513 |
| 6 | 1 | 66.4 | 83.2 | 16 / 35 | 3931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 60 | 55% |
| lessonz.robocode.Oz 0.5.0 | 27 | 81% |
| ary.Swarm 1.1 | 24 | 79% |
| simonton.nano.MeleeSeed 1.8 | 23 | 96% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| stelo.Mirror 1.1 | 2 | 100% |
| shrub.Silver v048 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 43 | 41% | 80 |
| ary.Swarm 1.1 | 22 | 21% | 44 |
| lessonz.robocode.Oz 0.5.0 | 19 | 18% | 31 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 28 |
| stelo.Mirror 1.1 | 4 | 4% | 6 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| shrub.Silver v048 | 2 | 2% | 8 |
| acogdev.alpha 0.2 | 2 | 2% | 3 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F42

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.8 | 108 / 210 | 2.28 | 18.3% | 31413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 18.3% | 108 |
| wompi.Wallaby 5.1 | 2.2 | 15.2% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.7% | 23 |
| ara.Shera 0.88 | 3.5 | 13.6% | 29 |
| amz.NanoClone 1.41 | 5.0 | 8.5% | 1 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 7.5% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 19 / 35 | 5442 |
| 2 | 1 | 70.2 | 93.7 | 23 / 35 | 5394 |
| 3 | 1 | 67.1 | 84.1 | 16 / 35 | 4995 |
| 4 | 1 | 66.4 | 82.9 | 14 / 35 | 4828 |
| 5 | 1 | 69.9 | 89.2 | 20 / 35 | 5778 |
| 6 | 1 | 66.6 | 81.3 | 16 / 35 | 4976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 51 | 76% |
| maribo.mini.MiniQuester 0.1 | 40 | 88% |
| ara.Shera 0.88 | 34 | 76% |
| dsw.StaticD 1.0 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 0% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 32 | 31% | 54 |
| maribo.mini.MiniQuester 0.1 | 30 | 29% | 57 |
| wompi.Wallaby 5.1 | 29 | 28% | 79 |
| amz.NanoClone 1.41 | 10 | 10% | 10 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| maribo.IotaCT 1.1 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 74.0 | 30 / 210 | 3.34 | 14.3% | 21949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 151 |
| hadur117.mini.DeiseW10 0.3 | 2.0 | 14.3% | 30 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.8% | 21 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.5% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.5% | 0 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.6% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 76.8 | 6 / 35 | 3658 |
| 2 | 2 | 62.8 | 74.0 | 3 / 35 | 3351 |
| 3 | 2 | 61.4 | 69.8 | 4 / 35 | 3635 |
| 4 | 2 | 62.9 | 71.1 | 6 / 35 | 3708 |
| 5 | 2 | 64.5 | 77.8 | 7 / 35 | 3759 |
| 6 | 2 | 63.8 | 74.3 | 4 / 35 | 3838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 71 | 20% |
| brainfade.melee.Dusk 0.44 | 15 | 80% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 95 | 52% | 108 |
| brainfade.melee.Dusk 0.44 | 34 | 19% | 46 |
| dummy.micro.Sparrow 2.5 | 19 | 10% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 12 | 7% | 13 |
| mz.NanoGod 2.02 | 4 | 2% | 4 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 89.0 | 126 / 210 | 1.99 | 19.4% | 31727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 19.4% | 126 |
| stelo.Liblix 0.3.1 | 2.2 | 15.8% | 51 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.3% | 26 |
| wompi.Quokka 1.6 | 4.0 | 10.4% | 6 |
| jwirde.Gort 2.0 | 5.5 | 8.7% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 8.6% | 1 |
| disan.Chair 2.2.0 | 6.8 | 7.5% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.9 | 20 / 35 | 5404 |
| 2 | 1 | 70.2 | 90.8 | 23 / 35 | 5325 |
| 3 | 1 | 68.6 | 85.1 | 18 / 35 | 5233 |
| 4 | 1 | 69.7 | 89.2 | 22 / 35 | 5202 |
| 5 | 1 | 69.8 | 90.8 | 21 / 35 | 5324 |
| 6 | 1 | 69.8 | 90.2 | 22 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 84 | 73% |
| tzu.TheArtOfWar 1.2 | 50 | 70% |
| wompi.Quokka 1.6 | 15 | 93% |
| disan.Chair 2.2.0 | 6 | 100% |
| jwirde.Gort 2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 46% | 99 |
| tzu.TheArtOfWar 1.2 | 32 | 38% | 70 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 7% | 12 |
| wompi.Quokka 1.6 | 5 | 6% | 10 |
| disan.Chair 2.2.0 | 2 | 2% | 8 |
| jwirde.Gort 2.0 | 0 | 0% | 7 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.5 | 86 / 210 | 2.04 | 19.8% | 36050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW10 0.3 | 1.0 | 19.8% | 86 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.9% | 108 |
| jje.BagPuss 1.2 | 2.8 | 11.7% | 3 |
| sul.Lunar 1.1 | 4.5 | 10.2% | 5 |
| myl.nano.Graviton 1.10 | 4.7 | 10.3% | 4 |
| fm.claire 1.7 | 6.5 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.0% | 2 |
| hvilela.HVilela 0.9 | 7.2 | 8.0% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.0% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.8 | 15 / 35 | 6236 |
| 2 | 1 | 68.7 | 86.3 | 13 / 35 | 5749 |
| 3 | 1 | 69.1 | 88.6 | 11 / 35 | 5889 |
| 4 | 1 | 70.5 | 89.5 | 20 / 35 | 6309 |
| 5 | 1 | 68.9 | 86.0 | 15 / 35 | 5768 |
| 6 | 1 | 69.6 | 89.5 | 12 / 35 | 6099 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 115 | 21% |
| sul.Lunar 1.1 | 17 | 100% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| wit.Deep7 2.0 | 10 | 100% |
| jje.BagPuss 1.2 | 8 | 88% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 2350. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 90 | 73% | 0 |
| myl.nano.Graviton 1.10 | 7 | 6% | 35 |
| sul.Lunar 1.1 | 6 | 5% | 54 |
| jje.BagPuss 1.2 | 6 | 5% | 47 |
| fm.claire 1.7 | 6 | 5% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 24 |
| hvilela.HVilela 0.9 | 3 | 2% | 10 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 9 |

## Melee bench: F46

hadur117.mini.DeiseW10 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.6 | 53 / 210 | 2.66 | 15.9% | 24329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.9% | 58 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.9% | 86 |
| hadur117.mini.DeiseW10 0.3 | 2.8 | 15.9% | 53 |
| mz.MicroSheep 1.0 | 4.2 | 10.4% | 1 |
| cx.Princess 1.0 | 4.8 | 9.9% | 9 |
| sadoner.killer 0.2 | 6.2 | 8.5% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.8% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.5% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 80.3 | 9 / 35 | 3833 |
| 2 | 2 | 65.0 | 81.3 | 11 / 35 | 4003 |
| 3 | 3 | 65.0 | 82.5 | 7 / 35 | 4263 |
| 4 | 3 | 65.7 | 82.2 | 9 / 35 | 4382 |
| 5 | 3 | 64.3 | 81.9 | 6 / 35 | 3894 |
| 6 | 3 | 65.0 | 81.3 | 11 / 35 | 3954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 45 | 38% |
| kc.mini.Mirage 0.2 | 44 | 45% |
| cx.Princess 1.0 | 10 | 60% |
| mz.MicroSheep 1.0 | 6 | 83% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 64 | 41% | 87 |
| rsalesc.melee.Medina 0.4.5 | 52 | 33% | 68 |
| cx.Princess 1.0 | 16 | 10% | 20 |
| mz.MicroSheep 1.0 | 14 | 9% | 21 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 9 |
| sadoner.killer 0.2 | 3 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

