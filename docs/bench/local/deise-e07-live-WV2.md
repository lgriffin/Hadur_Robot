# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.9 | 52 / 210 | 2.27 | 17.0% | 29604 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 136 |
| hadur117.mini.DeiseWV2 0.4 | 2.0 | 17.0% | 52 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 14 |
| mz.MicroGodMelee 1 | 4.0 | 11.0% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 5.8 | 9.5% | 2 |
| adt.Ar2 1.0 | 7.3 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.0% | 0 |
| skm.butterfly 1.0 | 8.5 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 83.5 | 6 / 35 | 4990 |
| 2 | 2 | 66.9 | 86.7 | 9 / 35 | 4718 |
| 3 | 2 | 67.7 | 89.8 | 14 / 35 | 4601 |
| 4 | 2 | 64.5 | 79.7 | 7 / 35 | 4572 |
| 5 | 2 | 67.9 | 88.3 | 7 / 35 | 5271 |
| 6 | 2 | 67.7 | 87.6 | 9 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 15% |
| sgp.JollyNinja 3.53 | 13 | 85% |
| mz.MicroGodMelee 1 | 10 | 70% |
| lorneswork.Predator 1.0 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1161. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 77% | 140 |
| sgp.JollyNinja 3.53 | 16 | 10% | 25 |
| mz.MicroGodMelee 1 | 10 | 6% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 12 |
| lorneswork.Predator 1.0 | 3 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |
| adt.Ar2 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.3 | 115 / 210 | 2.32 | 18.5% | 30135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.5% | 115 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.4% | 43 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.7% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.2% | 7 |
| Noran.BitchingElk 0.054 | 6.8 | 8.0% | 4 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.8% | 2 |
| sch.Simone 0.3d | 7.7 | 7.6% | 6 |
| stelo.PatternRobot 1.0 | 8.7 | 6.1% | 0 |
| fullsail.SweetTea 1.1 | 9.8 | 4.1% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.5 | 20 / 35 | 4625 |
| 2 | 1 | 68.7 | 85.7 | 19 / 35 | 5270 |
| 3 | 1 | 66.6 | 80.6 | 15 / 35 | 5114 |
| 4 | 1 | 69.0 | 88.9 | 20 / 35 | 5235 |
| 5 | 1 | 67.8 | 84.1 | 20 / 35 | 4769 |
| 6 | 1 | 68.9 | 88.9 | 21 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 73% |
| pulsar.PulsarMax 0.8.9 | 52 | 67% |
| sch.Simone 0.3d | 12 | 67% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 78% |
| Noran.BitchingElk 0.054 | 6 | 83% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 38 | 40% | 74 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 26% | 64 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 10 |
| sch.Simone 0.3d | 6 | 6% | 12 |
| stelo.PatternRobot 1.0 | 5 | 5% | 7 |
| Noran.BitchingElk 0.054 | 4 | 4% | 19 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 7 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.4 | 149 / 210 | 1.68 | 20.2% | 37159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 20.2% | 149 |
| radnor.DoctorBob 1.42 | 2.8 | 13.1% | 12 |
| vuen.Cake 2.51 | 3.0 | 13.2% | 36 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.0% | 11 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 2 |
| adt.Ar1 2.1 | 6.3 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.9 | 28 / 35 | 6432 |
| 2 | 1 | 69.5 | 89.8 | 24 / 35 | 5855 |
| 3 | 1 | 69.7 | 89.2 | 22 / 35 | 6273 |
| 4 | 1 | 70.8 | 93.3 | 27 / 35 | 6424 |
| 5 | 1 | 69.9 | 92.1 | 23 / 35 | 5827 |
| 6 | 1 | 71.1 | 95.2 | 25 / 35 | 6348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 77 | 68% |
| kawigi.nano.Lib 1.0 | 60 | 97% |
| radnor.DoctorBob 1.42 | 23 | 100% |
| oa.weak.FlyMk1 0.1 | 6 | 83% |
| urdos.URDOS 1.3 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1011. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 31 | 48% | 79 |
| kawigi.nano.Lib 1.0 | 12 | 18% | 69 |
| radnor.DoctorBob 1.42 | 9 | 14% | 34 |
| adt.Ar1 2.1 | 5 | 8% | 7 |
| urdos.URDOS 1.3 | 3 | 5% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.7 | 31 / 210 | 2.47 | 16.9% | 32576 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 171 |
| hadur117.mini.DeiseWV2 0.4 | 2.0 | 16.9% | 31 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 7 |
| TNT.TNT 0.99.1 | 4.2 | 10.5% | 2 |
| josago.Jorgito 0.16 | 4.8 | 8.9% | 0 |
| css.Delitioner 0.11 | 6.2 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.6% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 84.4 | 7 / 35 | 5448 |
| 2 | 2 | 67.4 | 84.1 | 3 / 35 | 5511 |
| 3 | 2 | 68.6 | 88.6 | 10 / 35 | 5578 |
| 4 | 2 | 67.7 | 84.4 | 5 / 35 | 5685 |
| 5 | 2 | 65.9 | 81.3 | 4 / 35 | 5015 |
| 6 | 2 | 65.6 | 79.0 | 2 / 35 | 5339 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 17% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| TNT.TNT 0.99.1 | 3 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 181 of 210 rounds, at a mean tick of 1353. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 77% | 162 |
| apc.LeeroyJenkins2 1.0 | 21 | 12% | 24 |
| josago.Jorgito 0.16 | 8 | 4% | 9 |
| TNT.TNT 0.99.1 | 4 | 2% | 7 |
| css.Delitioner 0.11 | 4 | 2% | 5 |
| tj.zombie1n 1.0.1 | 3 | 2% | 2 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 71.2 | 21 / 210 | 3.59 | 13.4% | 20646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.0% | 117 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 50 |
| hadur117.mini.DeiseWV2 0.4 | 3.2 | 13.4% | 21 |
| wompi.Numbat 2.1 | 3.8 | 12.4% | 12 |
| ms.Ares 0.19 | 5.3 | 9.3% | 3 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 7 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 74.6 | 6 / 35 | 3787 |
| 2 | 3 | 59.1 | 67.6 | 2 / 35 | 3301 |
| 3 | 3 | 61.0 | 72.1 | 4 / 35 | 3391 |
| 4 | 3 | 61.2 | 72.4 | 1 / 35 | 3522 |
| 5 | 3 | 60.6 | 70.2 | 5 / 35 | 3239 |
| 6 | 4 | 60.3 | 70.5 | 3 / 35 | 3406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 30 | 47% |
| cb.fire.Firestarter 2.0f | 26 | 4% |
| axeBots.HataMoto 3.09 | 6 | 50% |
| wompi.Numbat 2.1 | 5 | 60% |

Hadur died in 189 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 65 | 34% | 68 |
| justin.DemonicRage 3.4 | 59 | 31% | 71 |
| wompi.Numbat 2.1 | 23 | 12% | 26 |
| ms.Ares 0.19 | 18 | 10% | 18 |
| axeBots.HataMoto 3.09 | 13 | 7% | 16 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.1 | 99 / 210 | 2.61 | 17.4% | 28522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 17.4% | 99 |
| jekl.StoneGhost 0.7 | 2.3 | 15.0% | 27 |
| origin.SleepSiphon 1.7b | 2.8 | 14.4% | 54 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 24 |
| mld.Wisdom 1.0 | 5.0 | 10.3% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 4 |
| spinnercat.Omen 1.0 | 7.7 | 6.6% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.3% | 0 |
| DBall.NUKE 0.1 | 8.3 | 5.9% | 1 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 79.7 | 16 / 35 | 4521 |
| 2 | 1 | 66.2 | 80.3 | 13 / 35 | 4837 |
| 3 | 1 | 67.3 | 82.9 | 17 / 35 | 4703 |
| 4 | 1 | 68.6 | 86.3 | 21 / 35 | 5051 |
| 5 | 1 | 67.0 | 82.5 | 15 / 35 | 4779 |
| 6 | 1 | 66.3 | 80.6 | 17 / 35 | 4631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 70% |
| jekl.StoneGhost 0.7 | 36 | 94% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 76% |
| gg.Wolverine 2.0 | 9 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 37 | 33% | 64 |
| origin.SleepSiphon 1.7b | 30 | 27% | 69 |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 22% | 46 |
| mld.Wisdom 1.0 | 8 | 7% | 13 |
| gg.Wolverine 2.0 | 7 | 6% | 7 |
| spinnercat.Omen 1.0 | 2 | 2% | 2 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.2 | 131 / 210 | 1.61 | 20.3% | 36265 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 20.3% | 131 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.3% | 42 |
| rtk.Tachikoma 1.0 | 2.7 | 16.6% | 27 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.7% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 10.4% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| drd.Dreadknoght 0.9 | 9.3 | 2.4% | 0 |
| sample.Target 1.0 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 94.0 | 23 / 35 | 6089 |
| 2 | 1 | 71.7 | 92.4 | 19 / 35 | 5971 |
| 3 | 1 | 71.5 | 92.4 | 20 / 35 | 5910 |
| 4 | 1 | 71.1 | 91.7 | 24 / 35 | 5792 |
| 5 | 1 | 72.6 | 95.6 | 23 / 35 | 6488 |
| 6 | 1 | 71.9 | 93.3 | 22 / 35 | 6015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 84% |
| rsalesc.melee.Monk 0.3.6c | 43 | 26% |
| oog.melee.CapuletDroid 1.1 | 33 | 88% |
| franzor.Lizt 1.3.1 | 11 | 82% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1419. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 48% | 63 |
| rtk.Tachikoma 1.0 | 29 | 36% | 107 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 31 |
| franzor.Lizt 1.3.1 | 4 | 5% | 4 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.5 | 138 / 210 | 1.95 | 19.4% | 30434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.4% | 138 |
| shrub.Vapour v159 | 2.3 | 12.8% | 31 |
| tm.Yuugao 1.0 | 2.7 | 12.3% | 23 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.5% | 7 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.0% | 7 |
| m3thos.Eva00 1.1 | 6.2 | 8.5% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.1% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.5 | 6.9% | 0 |
| SHAM.WOW 1.4 | 9.0 | 6.3% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.2 | 21 / 35 | 4944 |
| 2 | 1 | 67.1 | 83.8 | 20 / 35 | 4896 |
| 3 | 1 | 69.8 | 94.0 | 27 / 35 | 4950 |
| 4 | 1 | 69.2 | 92.1 | 24 / 35 | 4842 |
| 5 | 1 | 68.5 | 86.3 | 22 / 35 | 5246 |
| 6 | 1 | 69.9 | 91.4 | 24 / 35 | 5556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 82% |
| shrub.Vapour v159 | 36 | 69% |
| Krabb.sliNk.Garm 0.9u | 35 | 91% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 93% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 100% |
| m3thos.Eva00 1.1 | 8 | 100% |
| SHAM.WOW 1.4 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 25 | 34% | 53 |
| tm.Yuugao 1.0 | 16 | 22% | 58 |
| Krabb.sliNk.Garm 0.9u | 13 | 18% | 34 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 7% | 18 |
| m3thos.Eva00 1.1 | 4 | 5% | 9 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 2 |
| SHAM.WOW 1.4 | 1 | 1% | 9 |

## Melee bench: F09

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.1 | 66 / 210 | 3.33 | 15.4% | 24754 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.3% | 94 |
| hadur117.mini.DeiseWV2 0.4 | 2.0 | 15.4% | 66 |
| kc.micro.Figment 1.0 | 2.8 | 14.6% | 25 |
| yagami.Tidus 0.11 | 4.7 | 10.4% | 3 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.8% | 7 |
| mc2.enemy.Original 0.9 | 5.5 | 9.9% | 15 |
| dft.Calliope 5.6 | 6.8 | 7.5% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 75.6 | 15 / 35 | 4449 |
| 2 | 3 | 61.8 | 69.8 | 7 / 35 | 3741 |
| 3 | 2 | 64.5 | 76.8 | 11 / 35 | 4272 |
| 4 | 2 | 62.4 | 70.5 | 11 / 35 | 4174 |
| 5 | 1 | 65.4 | 79.7 | 14 / 35 | 4190 |
| 6 | 2 | 63.0 | 72.4 | 8 / 35 | 3928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 44 | 52% |
| kc.micro.Figment 1.0 | 30 | 93% |
| yagami.Tidus 0.11 | 8 | 100% |
| mc2.enemy.Original 0.9 | 6 | 67% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| dft.Calliope 5.6 | 1 | 100% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 53 | 37% | 75 |
| kc.micro.Figment 1.0 | 32 | 22% | 60 |
| yagami.Tidus 0.11 | 22 | 15% | 30 |
| mc2.enemy.Original 0.9 | 18 | 13% | 22 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 10 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 96.0 | 177 / 210 | 1.36 | 20.8% | 33439 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 20.8% | 177 |
| ejb.Polaris 1.0.1 | 2.7 | 12.9% | 9 |
| DTF.Kludgy 1.2b | 2.8 | 12.9% | 16 |
| ne.Chimera 1.2 | 3.7 | 12.0% | 2 |
| vStar.RAFzilla 2.15 | 5.2 | 9.8% | 2 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.9% | 2 |
| sam.Samspin 1.0 | 7.7 | 6.0% | 1 |
| kurios.DOSexe .9b | 8.2 | 5.7% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 99.0 | 32 / 35 | 5702 |
| 2 | 1 | 70.2 | 93.7 | 26 / 35 | 5421 |
| 3 | 1 | 70.8 | 95.2 | 29 / 35 | 5694 |
| 4 | 1 | 70.4 | 94.0 | 30 / 35 | 5380 |
| 5 | 1 | 71.5 | 97.8 | 30 / 35 | 5469 |
| 6 | 1 | 71.9 | 96.5 | 30 / 35 | 5773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 58 | 95% |
| DTF.Kludgy 1.2b | 57 | 84% |
| ne.Chimera 1.2 | 33 | 97% |
| tvv.micro.Antares 1.1.1 | 18 | 94% |
| vStar.RAFzilla 2.15 | 13 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 966. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 47% | 56 |
| ejb.Polaris 1.0.1 | 6 | 18% | 65 |
| ne.Chimera 1.2 | 6 | 18% | 39 |
| tvv.micro.Antares 1.1.1 | 2 | 6% | 12 |
| vStar.RAFzilla 2.15 | 1 | 3% | 14 |
| donjezza.Muncho 1.0 | 1 | 3% | 7 |
| sam.Samspin 1.0 | 1 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.2 | 84 / 210 | 2.51 | 17.2% | 26482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.1% | 67 |
| hadur117.mini.DeiseWV2 0.4 | 1.5 | 17.2% | 84 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.3% | 14 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 12 |
| rdt199.Warlord 0.73 | 5.2 | 9.3% | 12 |
| br2.MobyDickBot 1.6 | 6.3 | 8.5% | 10 |
| uji.YellohFellah 1.0 | 6.7 | 8.4% | 11 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 80.0 | 12 / 35 | 4140 |
| 2 | 2 | 64.7 | 78.7 | 10 / 35 | 4412 |
| 3 | 2 | 65.9 | 80.6 | 14 / 35 | 4609 |
| 4 | 1 | 67.2 | 86.3 | 17 / 35 | 4566 |
| 5 | 1 | 66.5 | 84.8 | 14 / 35 | 4468 |
| 6 | 1 | 67.4 | 88.9 | 17 / 35 | 4287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 63 | 56% |
| cx.mini.Nimrod 0.55 | 16 | 88% |
| br2.MobyDickBot 1.6 | 15 | 47% |
| djc.DynaBot 0.1.1 | 14 | 79% |
| rdt199.Warlord 0.73 | 11 | 82% |
| uji.YellohFellah 1.0 | 9 | 78% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 46% | 96 |
| rdt199.Warlord 0.73 | 18 | 14% | 27 |
| cx.mini.Nimrod 0.55 | 18 | 14% | 26 |
| br2.MobyDickBot 1.6 | 11 | 9% | 17 |
| uji.YellohFellah 1.0 | 10 | 8% | 16 |
| djc.DynaBot 0.1.1 | 7 | 6% | 22 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 2 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 87.7 | 128 / 210 | 2.10 | 18.4% | 25330 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.4% | 128 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.5% | 22 |
| darkcanuck.Leon 1.01 | 3.0 | 13.1% | 20 |
| nat.PallasHawk 1.0 | 3.3 | 12.7% | 23 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 14 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 2 |
| jp.Perpy 16.0 | 8.0 | 6.1% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.3% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 92.1 | 25 / 35 | 4382 |
| 2 | 1 | 68.3 | 87.0 | 22 / 35 | 4365 |
| 3 | 1 | 68.6 | 89.5 | 22 / 35 | 4356 |
| 4 | 1 | 67.3 | 86.3 | 20 / 35 | 4053 |
| 5 | 1 | 66.1 | 81.9 | 18 / 35 | 4056 |
| 6 | 1 | 68.0 | 89.5 | 21 / 35 | 4118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 84% |
| darkcanuck.Leon 1.01 | 48 | 75% |
| nat.PallasHawk 1.0 | 40 | 85% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| cs.sheldor.Talon 1.1 | 3 | 67% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 22 | 27% | 72 |
| bts.wiki.RipCurl 0.9b | 16 | 20% | 42 |
| nat.PallasHawk 1.0 | 15 | 18% | 49 |
| brainfade.melee.Genghis 0.36 | 14 | 17% | 22 |
| jrm.Test0 1.0 | 6 | 7% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 6 |
| jp.Perpy 16.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 84.5 | 66 / 210 | 2.40 | 16.4% | 25659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.8% | 88 |
| hadur117.mini.DeiseWV2 0.4 | 2.2 | 16.4% | 66 |
| ags.Glacier 0.2.11 | 2.3 | 16.2% | 37 |
| shinh.Entangled 0.3 | 4.2 | 11.6% | 12 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.2% | 7 |
| apc.Colossus2 0.17 | 6.2 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 84.4 | 7 / 35 | 4489 |
| 2 | 2 | 66.5 | 83.8 | 13 / 35 | 4401 |
| 3 | 2 | 66.9 | 87.3 | 12 / 35 | 4454 |
| 4 | 2 | 66.2 | 85.1 | 13 / 35 | 4035 |
| 5 | 2 | 64.8 | 81.0 | 12 / 35 | 4131 |
| 6 | 3 | 65.3 | 85.4 | 9 / 35 | 4149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 57 | 37% |
| ags.Glacier 0.2.11 | 49 | 63% |
| shinh.Entangled 0.3 | 15 | 67% |
| gh.micro.Gruweltje 0.7 | 6 | 50% |
| apc.Colossus2 0.17 | 1 | 100% |
| stelo.Wang 1.0 | 1 | 0% |

Hadur died in 145 of 210 rounds, at a mean tick of 957. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 39% | 78 |
| ags.Glacier 0.2.11 | 44 | 30% | 71 |
| gh.micro.Gruweltje 0.7 | 18 | 12% | 23 |
| shinh.Entangled 0.3 | 17 | 12% | 27 |
| stelo.Wang 1.0 | 6 | 4% | 7 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 91.3 | 146 / 210 | 1.78 | 19.8% | 33413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.8% | 146 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 34 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.9% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 10.0% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.8% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 7.0 | 8.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.4% | 5 |
| pa.Improved 1.0 | 9.0 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.4 | 24 / 35 | 5293 |
| 2 | 1 | 68.7 | 87.3 | 21 / 35 | 5441 |
| 3 | 1 | 69.6 | 91.4 | 22 / 35 | 5431 |
| 4 | 1 | 70.8 | 93.0 | 25 / 35 | 5614 |
| 5 | 1 | 70.4 | 89.8 | 26 / 35 | 5694 |
| 6 | 1 | 71.5 | 94.9 | 28 / 35 | 5940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 83% |
| catcat20.shape.Theta 0.018 | 44 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 81% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 28 | 44% | 90 |
| catcat20.shape.Theta 0.018 | 21 | 33% | 48 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 8% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 3% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 4 |
| sample.TrackFire 1.0 | 1 | 2% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 3 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.4 | 110 / 210 | 2.50 | 18.2% | 31474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.2% | 110 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.0% | 9 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 47 |
| mld.DustBunny 3.8 | 3.3 | 12.5% | 10 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.7% | 14 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.6% | 18 |
| lambdaxy.TBot 0.1 | 7.3 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.6% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 24 / 35 | 5390 |
| 2 | 1 | 67.4 | 81.6 | 17 / 35 | 5227 |
| 3 | 1 | 68.1 | 82.5 | 17 / 35 | 5581 |
| 4 | 1 | 67.5 | 82.2 | 20 / 35 | 5088 |
| 5 | 1 | 68.4 | 86.7 | 20 / 35 | 5247 |
| 6 | 1 | 65.7 | 77.1 | 12 / 35 | 4941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 68% |
| kawigi.micro.Shiz 1.1 | 30 | 100% |
| cb.nano.Insomnia 1.0 | 22 | 73% |
| mld.DustBunny 3.8 | 17 | 100% |
| kawigi.robot.Girl 1.2 | 16 | 88% |
| divineomega.TrialBot 0.003 | 9 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 36% | 79 |
| cb.nano.Insomnia 1.0 | 21 | 21% | 21 |
| mld.DustBunny 3.8 | 18 | 18% | 41 |
| kawigi.micro.Shiz 1.1 | 10 | 10% | 42 |
| kawigi.robot.Girl 1.2 | 6 | 6% | 9 |
| divineomega.TrialBot 0.003 | 4 | 4% | 12 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 3 |
| lambdaxy.TBot 0.1 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.2 | 84 / 210 | 2.69 | 17.7% | 32473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.2 | 17.7% | 84 |
| gh.Griezel 0.5.2 | 1.8 | 16.9% | 63 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.1% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.9% | 40 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.0% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.5% | 3 |
| asd.Cthulhu 1.3 | 9.2 | 4.6% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.1 | 12 / 35 | 5669 |
| 2 | 2 | 66.3 | 78.1 | 13 / 35 | 5055 |
| 3 | 1 | 68.6 | 83.2 | 17 / 35 | 5770 |
| 4 | 1 | 67.3 | 81.0 | 13 / 35 | 5369 |
| 5 | 1 | 68.2 | 82.9 | 16 / 35 | 5459 |
| 6 | 1 | 66.1 | 78.1 | 13 / 35 | 5151 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 62% |
| techdude.forest.FlamingForest 1.1 | 20 | 30% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 87% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |

Hadur died in 127 of 210 rounds, at a mean tick of 1131. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 53 | 42% | 103 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 26 | 20% | 41 |
| techdude.forest.FlamingForest 1.1 | 19 | 15% | 26 |
| bvh.fnr.Fenrir 0.36l | 12 | 9% | 13 |
| divineomega.DivineBot 1.9.4.5 | 9 | 7% | 14 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 6 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 4 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.4 | 95 / 210 | 2.77 | 17.3% | 30290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 17.3% | 95 |
| et.Predator 1.8 | 2.8 | 13.4% | 18 |
| cx.BlestPain 1.41 | 3.3 | 12.9% | 49 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.4% | 23 |
| nic.Nicator 2.4 | 4.7 | 11.5% | 13 |
| ahf.NanoAndrew .4 | 5.8 | 10.2% | 8 |
| maribo.melee.BMV 0.1 | 6.7 | 8.7% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.5% | 2 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.4 | 17 / 35 | 5384 |
| 2 | 1 | 65.3 | 77.1 | 13 / 35 | 4640 |
| 3 | 1 | 67.4 | 81.9 | 15 / 35 | 5329 |
| 4 | 1 | 67.7 | 81.9 | 21 / 35 | 5086 |
| 5 | 1 | 65.8 | 77.5 | 11 / 35 | 5046 |
| 6 | 1 | 67.4 | 85.4 | 18 / 35 | 4805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 40 | 78% |
| oog.melee.Mercutio 1.0 | 30 | 73% |
| nic.Nicator 2.4 | 24 | 83% |
| cx.BlestPain 1.41 | 23 | 48% |
| ahf.NanoAndrew .4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 2 | 50% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 25 | 22% | 41 |
| nic.Nicator 2.4 | 23 | 20% | 42 |
| et.Predator 1.8 | 22 | 19% | 50 |
| oog.melee.Mercutio 1.0 | 18 | 16% | 37 |
| ahf.NanoAndrew .4 | 12 | 10% | 21 |
| maribo.melee.BMV 0.1 | 7 | 6% | 8 |
| tex.Longbot 0.4 | 5 | 4% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 4 |

## Melee bench: F18

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.9 | 124 / 210 | 2.27 | 18.3% | 27839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.3% | 124 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.1% | 19 |
| agd.Mooserwirt2 2.7 | 2.7 | 12.6% | 28 |
| uji.DBH 1.1 | 4.0 | 10.8% | 14 |
| spinnercat.Robovirus 2.718 | 5.3 | 9.6% | 8 |
| ratosh.Nobo 0.21 | 5.8 | 9.6% | 6 |
| sigterm.Sigterm 1.0 | 6.8 | 8.3% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.8% | 3 |
| stelo.WangRobot 1.0 | 9.3 | 5.8% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.6 | 24 / 35 | 4878 |
| 2 | 1 | 67.1 | 85.7 | 18 / 35 | 4237 |
| 3 | 1 | 67.5 | 87.3 | 21 / 35 | 4442 |
| 4 | 1 | 65.3 | 79.0 | 16 / 35 | 4519 |
| 5 | 1 | 68.8 | 88.3 | 22 / 35 | 4996 |
| 6 | 1 | 68.1 | 87.3 | 23 / 35 | 4767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 90% |
| agd.Mooserwirt2 2.7 | 27 | 56% |
| sigterm.Sigterm 1.0 | 18 | 94% |
| uji.DBH 1.1 | 16 | 88% |
| spinnercat.Robovirus 2.718 | 12 | 75% |
| stelo.WangRobot 1.0 | 11 | 100% |
| ratosh.Nobo 0.21 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 27% | 71 |
| agd.Mooserwirt2 2.7 | 20 | 23% | 40 |
| ratosh.Nobo 0.21 | 14 | 16% | 25 |
| spinnercat.Robovirus 2.718 | 9 | 10% | 16 |
| uji.DBH 1.1 | 8 | 9% | 21 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 7 |
| sigterm.Sigterm 1.0 | 4 | 5% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 7 |
| stelo.WangRobot 1.0 | 0 | 0% | 11 |

## Melee bench: F19

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 95.3 | 169 / 210 | 1.42 | 21.3% | 35688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 21.3% | 169 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.0% | 12 |
| mld.Infinity 2.2 | 2.8 | 14.1% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 3 |
| erdnis.Rover 0.3 | 5.0 | 9.8% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.3% | 0 |
| pac.ABC 2.1 | 7.5 | 7.0% | 0 |
| mbh.Mbh 0.1 | 7.8 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 95.9 | 31 / 35 | 5911 |
| 2 | 1 | 72.5 | 95.9 | 29 / 35 | 6050 |
| 3 | 1 | 72.6 | 96.2 | 29 / 35 | 6037 |
| 4 | 1 | 71.2 | 93.7 | 26 / 35 | 5476 |
| 5 | 1 | 72.8 | 97.1 | 29 / 35 | 6268 |
| 6 | 1 | 71.8 | 93.0 | 25 / 35 | 5946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 94 | 94% |
| mld.Infinity 2.2 | 59 | 81% |
| krillr.mini.JointStrike 2.0.0 | 14 | 86% |
| erdnis.Rover 0.3 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 1202. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 38% | 123 |
| mld.Infinity 2.2 | 15 | 36% | 28 |
| krillr.mini.JointStrike 2.0.0 | 6 | 14% | 21 |
| erdnis.Rover 0.3 | 5 | 12% | 11 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 4 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.9 | 125 / 210 | 2.00 | 19.6% | 34401 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.6% | 125 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 39 |
| fwb.Nine 1.0.1 | 3.5 | 11.3% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 11.3% | 6 |
| catcat20.Rabbit 0.001 | 4.5 | 10.7% | 20 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.7% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.8 | 7.8% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 6.8% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.0 | 22 / 35 | 6090 |
| 2 | 1 | 69.9 | 90.8 | 21 / 35 | 5429 |
| 3 | 1 | 69.6 | 88.3 | 20 / 35 | 5842 |
| 4 | 1 | 69.0 | 84.8 | 22 / 35 | 5586 |
| 5 | 1 | 70.6 | 91.1 | 22 / 35 | 6051 |
| 6 | 1 | 67.7 | 84.4 | 18 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 70 | 73% |
| catcat20.Rabbit 0.001 | 28 | 64% |
| fwb.Nine 1.0.1 | 28 | 71% |
| nz.jdc.nano.GridFu 1.0 | 21 | 86% |
| bayen.nut.Squirrel 1.615 | 10 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 40 | 47% | 87 |
| catcat20.Rabbit 0.001 | 17 | 20% | 39 |
| fwb.Nine 1.0.1 | 13 | 15% | 12 |
| nz.jdc.nano.GridFu 1.0 | 12 | 14% | 41 |
| bayen.nut.Squirrel 1.615 | 1 | 1% | 15 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.8 | 136 / 210 | 1.65 | 20.3% | 34361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 20.3% | 136 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 63 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 3 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 10.6% | 2 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 8 |
| el.JumpShoot 0.2 | 7.0 | 6.4% | 0 |
| fire219.CatBot 1.0 | 8.0 | 5.9% | 0 |
| PSW.Relentless 0.1 | 9.3 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.4 | 20 / 35 | 5789 |
| 2 | 1 | 70.4 | 91.7 | 24 / 35 | 5753 |
| 3 | 1 | 69.5 | 90.2 | 22 / 35 | 5218 |
| 4 | 1 | 71.8 | 94.3 | 24 / 35 | 6255 |
| 5 | 1 | 70.6 | 92.4 | 21 / 35 | 5702 |
| 6 | 1 | 71.4 | 95.9 | 25 / 35 | 5644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 66% |
| dummy.mini.Scimitar 1.01 | 44 | 95% |
| cf.RiO.RiOx 4.2.1 | 9 | 100% |
| eld.Hmm 1.0 | 8 | 50% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 1418. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 44 | 58% | 97 |
| dummy.mini.Scimitar 1.01 | 17 | 22% | 69 |
| eld.Hmm 1.0 | 6 | 8% | 19 |
| cf.RiO.RiOx 4.2.1 | 5 | 7% | 20 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.0 | 96 / 210 | 2.35 | 18.0% | 30979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.3 | 18.0% | 96 |
| pe.SandboxDT 2.71m | 1.7 | 16.7% | 62 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.6% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 8 |
| yk.JahRoslav 1.1 | 6.8 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.1% | 1 |
| tad.Dalek98 0.98 | 7.3 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.5 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 82.2 | 13 / 35 | 5285 |
| 2 | 1 | 69.5 | 88.6 | 18 / 35 | 5591 |
| 3 | 1 | 69.5 | 87.9 | 16 / 35 | 5426 |
| 4 | 1 | 67.8 | 83.8 | 17 / 35 | 4924 |
| 5 | 1 | 67.4 | 84.8 | 17 / 35 | 4822 |
| 6 | 2 | 67.3 | 82.5 | 15 / 35 | 4931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 50 | 54% |
| kvk.HebusLeTroll 0.35 | 41 | 73% |
| jlm.javaDisturbance 0.59 | 33 | 91% |
| bigpete.Stewie 1.0 | 5 | 80% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 42 | 37% | 72 |
| kvk.HebusLeTroll 0.35 | 34 | 30% | 55 |
| jlm.javaDisturbance 0.59 | 28 | 25% | 62 |
| bigpete.Stewie 1.0 | 5 | 4% | 8 |
| tad.Dalek98 0.98 | 5 | 4% | 7 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.8 | 113 / 210 | 2.00 | 18.8% | 30040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.3 | 18.8% | 113 |
| pe.SandboxLump 1.52 | 1.8 | 17.5% | 59 |
| cre.Karolos 0.32 | 2.8 | 14.5% | 24 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.1% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.2% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.5% | 4 |
| cw.megas.Blade 0.8 | 7.2 | 7.9% | 0 |
| sample.Walls 1.0 | 7.5 | 7.7% | 3 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.9 | 27 / 35 | 5249 |
| 2 | 1 | 70.5 | 91.4 | 20 / 35 | 5059 |
| 3 | 1 | 71.2 | 93.0 | 23 / 35 | 5156 |
| 4 | 3 | 66.3 | 77.8 | 7 / 35 | 4812 |
| 5 | 1 | 67.9 | 83.5 | 16 / 35 | 4802 |
| 6 | 1 | 70.1 | 92.4 | 20 / 35 | 4962 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 84 | 64% |
| cre.Karolos 0.32 | 35 | 71% |
| stelo.AreaTargetingBot 1.1 | 21 | 90% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 56 | 58% | 107 |
| cre.Karolos 0.32 | 21 | 22% | 50 |
| stelo.AreaTargetingBot 1.1 | 13 | 13% | 23 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 3% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 13 |
| sample.Walls 1.0 | 1 | 1% | 3 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.6 | 64 / 210 | 3.10 | 15.3% | 23041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.7 | 15.3% | 64 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.5% | 45 |
| davidalves.Phoenix 0.54 | 3.2 | 13.1% | 39 |
| florent.XSeries.X2 0.12 | 3.8 | 12.6% | 31 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.4% | 26 |
| oog.melee.Corsair 1.0 | 6.2 | 9.1% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.4% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.6% | 0 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 69.8 | 8 / 35 | 3609 |
| 2 | 1 | 64.8 | 79.7 | 12 / 35 | 4029 |
| 3 | 1 | 65.2 | 81.6 | 14 / 35 | 4017 |
| 4 | 1 | 63.1 | 75.6 | 9 / 35 | 3912 |
| 5 | 1 | 65.6 | 82.2 | 15 / 35 | 3982 |
| 6 | 3 | 60.4 | 70.8 | 6 / 35 | 3492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 26 | 58% |
| rz.GlowBlowMelee 1.4 | 26 | 65% |
| florent.XSeries.X2 0.12 | 16 | 44% |
| pedersen.Ugluk 1.1.1 | 14 | 64% |
| stelo.SoJNanoMelee 1.1 | 10 | 90% |
| oog.melee.Corsair 1.0 | 5 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 43 | 29% | 57 |
| pedersen.Ugluk 1.1.1 | 33 | 22% | 43 |
| florent.XSeries.X2 0.12 | 29 | 20% | 42 |
| davidalves.Phoenix 0.54 | 24 | 16% | 34 |
| stelo.SoJNanoMelee 1.1 | 9 | 6% | 13 |
| oog.melee.Corsair 1.0 | 5 | 3% | 13 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.7 | 128 / 210 | 2.38 | 18.2% | 25637 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.2% | 128 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.9% | 31 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.9% | 12 |
| jdw.Hurricane 1.4 | 3.7 | 12.3% | 26 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.2% | 3 |
| ds.Oo 2.2 | 6.2 | 8.1% | 4 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.2% | 3 |
| awesomeness.Elite 1.0 | 7.7 | 7.0% | 2 |
| adt.Ar2 1.1 | 8.2 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.0 | 18 / 35 | 4622 |
| 2 | 1 | 67.8 | 83.8 | 24 / 35 | 4517 |
| 3 | 1 | 66.0 | 80.3 | 20 / 35 | 4022 |
| 4 | 1 | 67.6 | 86.0 | 22 / 35 | 3998 |
| 5 | 1 | 68.3 | 87.3 | 25 / 35 | 4138 |
| 6 | 1 | 67.6 | 84.8 | 19 / 35 | 4340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 80% |
| voidious.micro.BlitzBat 1.05 | 41 | 95% |
| jdw.Hurricane 1.4 | 35 | 86% |
| gre.svman4.Morfeas 1.4.1 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| ds.Oo 2.2 | 3 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 582. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 30% | 64 |
| jdw.Hurricane 1.4 | 20 | 24% | 48 |
| voidious.micro.BlitzBat 1.05 | 14 | 17% | 50 |
| ds.Oo 2.2 | 7 | 9% | 8 |
| adt.Ar2 1.1 | 6 | 7% | 7 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 14 |
| awesomeness.Elite 1.0 | 3 | 4% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 4 |

## Melee bench: F26

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.6 | 128 / 210 | 1.85 | 19.5% | 34325 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.5% | 128 |
| ak.Fermat 2.0 | 2.2 | 14.9% | 33 |
| lrem.Spectre 0.4.4 | 3.2 | 12.5% | 12 |
| shu.nitro.LENIN .T34 | 3.8 | 12.0% | 24 |
| js.PinBall 1.6 | 5.3 | 10.1% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.0% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.8% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 3 |
| sample.SpinBot 1.0 | 8.8 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 92.4 | 23 / 35 | 5804 |
| 2 | 1 | 71.9 | 94.6 | 26 / 35 | 6252 |
| 3 | 1 | 68.4 | 88.6 | 18 / 35 | 5238 |
| 4 | 1 | 70.6 | 91.1 | 22 / 35 | 5956 |
| 5 | 1 | 69.0 | 88.6 | 20 / 35 | 5372 |
| 6 | 1 | 69.3 | 88.3 | 19 / 35 | 5703 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 51 | 88% |
| ak.Fermat 2.0 | 43 | 77% |
| shu.nitro.LENIN .T34 | 33 | 73% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 80% |
| js.PinBall 1.6 | 9 | 89% |
| gh.mini.GrubbmOne 1.0 | 7 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 0% |

Hadur died in 83 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 30 | 36% | 66 |
| shu.nitro.LENIN .T34 | 18 | 22% | 52 |
| lrem.Spectre 0.4.4 | 15 | 18% | 43 |
| js.PinBall 1.6 | 8 | 10% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 5% | 6 |
| gh.mini.GrubbmOne 1.0 | 3 | 4% | 9 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.6 | 140 / 210 | 1.93 | 19.0% | 28144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.0% | 140 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 44 |
| EH.Eagle 1.0.6 | 3.8 | 10.9% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.6% | 5 |
| wee.Gem 1.8.4 | 4.8 | 10.1% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 8.9% | 0 |
| joe.ADinosaur 1.0 | 7.5 | 7.3% | 0 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.8 | 5.5% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.7 | 20 / 35 | 4360 |
| 2 | 1 | 68.2 | 88.9 | 22 / 35 | 4474 |
| 3 | 1 | 70.6 | 92.7 | 26 / 35 | 5272 |
| 4 | 1 | 68.9 | 90.8 | 28 / 35 | 4446 |
| 5 | 1 | 68.7 | 90.5 | 23 / 35 | 4618 |
| 6 | 1 | 68.5 | 88.3 | 21 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 79 | 81% |
| wee.Gem 1.8.4 | 27 | 67% |
| EH.Eagle 1.0.6 | 18 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 12 | 100% |
| throxbot.ThroxBot 0.1 | 9 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 28 | 39% | 88 |
| wee.Gem 1.8.4 | 12 | 17% | 37 |
| EH.Eagle 1.0.6 | 9 | 13% | 21 |
| throxbot.ThroxBot 0.1 | 8 | 11% | 13 |
| sheldor.melee.nano.TestMelee 0.1 | 6 | 8% | 27 |
| joe.ADinosaur 1.0 | 4 | 6% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 14 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 4 |

## Melee bench: F28

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.1 | 137 / 210 | 1.80 | 19.1% | 27143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.1% | 137 |
| kid.test.NightFox .2 | 2.0 | 15.6% | 42 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 10.9% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.0 | 10.7% | 3 |
| uji.Antique 1.0 | 4.3 | 10.7% | 11 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.5% | 2 |
| ahr.ice.Ice 1.0.2 | 7.2 | 7.2% | 3 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 93.0 | 24 / 35 | 4624 |
| 2 | 1 | 68.0 | 87.6 | 22 / 35 | 4474 |
| 3 | 1 | 69.3 | 91.7 | 25 / 35 | 4686 |
| 4 | 1 | 68.4 | 89.5 | 20 / 35 | 4407 |
| 5 | 1 | 69.1 | 93.3 | 21 / 35 | 4491 |
| 6 | 1 | 69.1 | 91.4 | 25 / 35 | 4461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 97 | 70% |
| uji.Antique 1.0 | 33 | 88% |
| qohnil.blot.BlotBot 3.61 | 25 | 80% |
| pfvicm.Sobieski 7.2.3b | 9 | 100% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 0% |

Hadur died in 74 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 39 | 53% | 101 |
| uji.Antique 1.0 | 12 | 16% | 37 |
| qohnil.blot.BlotBot 3.61 | 9 | 12% | 26 |
| pfvicm.Sobieski 7.2.3b | 6 | 8% | 16 |
| amk.ChumbaWumba 0.3 | 3 | 4% | 10 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 8 |
| matt.advanced.Katana 1.0 | 2 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.5 | 113 / 210 | 2.30 | 18.7% | 29795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.7% | 113 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 48 |
| deewiant.Anomaly 0.2 | 2.5 | 15.1% | 33 |
| myl.micro.Troodon 1.10 | 4.2 | 12.1% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 1 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.5% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.3 | 4.3% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.3 | 18 / 35 | 4919 |
| 2 | 1 | 71.2 | 92.1 | 21 / 35 | 5728 |
| 3 | 1 | 69.6 | 86.7 | 19 / 35 | 5202 |
| 4 | 1 | 66.2 | 78.7 | 19 / 35 | 4278 |
| 5 | 1 | 69.6 | 87.6 | 19 / 35 | 5077 |
| 6 | 1 | 67.1 | 79.7 | 17 / 35 | 4591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 82% |
| zyx.mega.YersiniaPestis 3.1 | 43 | 56% |
| myl.micro.Troodon 1.10 | 23 | 96% |
| jok.PheonixM 0.1.2 | 9 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 37 | 38% | 96 |
| zyx.mega.YersiniaPestis 3.1 | 30 | 31% | 55 |
| myl.micro.Troodon 1.10 | 14 | 14% | 28 |
| jok.PheonixM 0.1.2 | 8 | 8% | 17 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |

## Melee bench: F30

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 73.0 | 56 / 210 | 3.43 | 14.4% | 21814 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 14.2% | 44 |
| hadur117.mini.DeiseWV2 0.4 | 2.3 | 14.4% | 56 |
| darkcanuck.B26354 1.06 | 3.2 | 13.3% | 39 |
| oog.melee.Capulet 1.2 | 3.5 | 13.2% | 34 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.4% | 24 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.7% | 4 |
| intruder.PrairieWolf 2.61 | 7.2 | 7.8% | 5 |
| ntc.Opposite 1.5 | 7.5 | 7.9% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 7.0% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 75.6 | 10 / 35 | 3726 |
| 2 | 1 | 62.8 | 75.9 | 12 / 35 | 3786 |
| 3 | 3 | 60.7 | 71.1 | 7 / 35 | 3359 |
| 4 | 1 | 62.5 | 74.0 | 10 / 35 | 3791 |
| 5 | 1 | 63.7 | 75.6 | 12 / 35 | 3886 |
| 6 | 5 | 58.9 | 65.7 | 5 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 27 | 56% |
| darkcanuck.B26354 1.06 | 21 | 48% |
| oog.melee.Capulet 1.2 | 15 | 67% |
| stelo.PastFuture 2.3.2 | 14 | 86% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 3 | 33% |
| tripphippy.Alice 1.1 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 40 | 26% | 48 |
| catcat20.Matcha 0.006 | 33 | 21% | 49 |
| oog.melee.Capulet 1.2 | 27 | 18% | 41 |
| stelo.PastFuture 2.3.2 | 23 | 15% | 32 |
| ntc.Opposite 1.5 | 10 | 6% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 11 |
| tripphippy.Alice 1.1 | 8 | 5% | 11 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 7 |

## Melee bench: F31

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 72.8 | 43 / 210 | 3.45 | 14.3% | 21459 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 85 |
| hadur117.mini.DeiseWV2 0.4 | 2.3 | 14.3% | 43 |
| gh.mini.Griezel 0.2 | 2.7 | 14.0% | 52 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.9% | 11 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.0% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 7 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.4% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.9 | 72.7 | 5 / 35 | 3731 |
| 2 | 2 | 61.4 | 71.7 | 7 / 35 | 3400 |
| 3 | 3 | 59.0 | 66.3 | 3 / 35 | 3539 |
| 4 | 2 | 62.4 | 74.3 | 9 / 35 | 3351 |
| 5 | 2 | 62.9 | 74.3 | 10 / 35 | 3800 |
| 6 | 2 | 63.5 | 77.1 | 9 / 35 | 3638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 46 | 52% |
| gh.mini.Griezel 0.2 | 17 | 41% |
| spinnercat.micro.Tyger 0.1 | 13 | 62% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 51 | 31% | 74 |
| gh.mini.Griezel 0.2 | 43 | 26% | 52 |
| d414.nano.Quantum 1.0.0 | 28 | 17% | 31 |
| spinnercat.micro.Tyger 0.1 | 23 | 14% | 29 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 12 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |

## Melee bench: F32

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 88.7 | 131 / 210 | 2.02 | 18.9% | 29582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.9% | 131 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.4% | 42 |
| apc.botM 3.0 | 2.8 | 12.4% | 14 |
| lxx.ConceptA 0.8 | 4.0 | 11.1% | 8 |
| vjik.UnViolation 1.1 | 5.7 | 8.8% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 4 |
| panzer.Panzer 0.2 | 6.8 | 7.7% | 1 |
| conscience.Electron 1.3g | 8.0 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.2 | 5.8% | 4 |
| yk.JahMicro 1.0 | 9.3 | 5.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 86.0 | 17 / 35 | 4697 |
| 2 | 1 | 66.7 | 82.9 | 20 / 35 | 4913 |
| 3 | 1 | 69.2 | 90.8 | 22 / 35 | 5228 |
| 4 | 1 | 69.8 | 92.1 | 24 / 35 | 5177 |
| 5 | 1 | 68.6 | 89.8 | 23 / 35 | 4743 |
| 6 | 1 | 68.9 | 90.5 | 25 / 35 | 4824 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 67% |
| apc.botM 3.0 | 32 | 88% |
| lxx.ConceptA 0.8 | 27 | 96% |
| donjezza.Jezza 1.0 | 9 | 78% |
| yk.JahMicro 1.0 | 5 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |
| vjik.UnViolation 1.1 | 4 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 51% | 99 |
| lxx.ConceptA 0.8 | 12 | 15% | 27 |
| apc.botM 3.0 | 11 | 14% | 41 |
| panzer.Panzer 0.2 | 6 | 8% | 8 |
| bayen.UbaMicro 1.4 | 4 | 5% | 7 |
| donjezza.Jezza 1.0 | 2 | 3% | 7 |
| conscience.Electron 1.3g | 2 | 3% | 5 |
| vjik.UnViolation 1.1 | 1 | 1% | 12 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |

## Melee bench: F33

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 145 / 210 | 1.98 | 19.8% | 31545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.8% | 145 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.1% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 10.9% | 5 |
| labg.Cataclysm 2.05 | 4.8 | 10.0% | 8 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 2 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 0 |
| sanja.First 0.1 | 9.2 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 95.2 | 29 / 35 | 5614 |
| 2 | 1 | 69.6 | 89.5 | 21 / 35 | 5258 |
| 3 | 1 | 67.8 | 81.9 | 18 / 35 | 5279 |
| 4 | 1 | 69.8 | 88.3 | 25 / 35 | 5227 |
| 5 | 1 | 70.5 | 91.1 | 29 / 35 | 4977 |
| 6 | 1 | 69.7 | 88.9 | 23 / 35 | 5190 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 66 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 89% |
| gre.svman4.Leonidas 1.3.2 | 29 | 100% |
| labg.Cataclysm 2.05 | 20 | 90% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 28 | 42% | 93 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 21% | 48 |
| gre.svman4.Leonidas 1.3.2 | 9 | 13% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 10% | 9 |
| labg.Cataclysm 2.05 | 5 | 7% | 19 |
| baal.nano.N 1.42 | 2 | 3% | 8 |
| zyx.micro.Ant 1.1 | 1 | 1% | 6 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.1 | 77 / 210 | 2.52 | 17.1% | 28514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.3 | 17.1% | 77 |
| stelo.Spread 0.9 | 1.8 | 16.8% | 75 |
| kid.Gladiator .7.2 | 2.8 | 15.9% | 35 |
| jcs.Seth 1.8 | 4.3 | 11.6% | 18 |
| tcf.Reach 3 | 4.7 | 10.5% | 4 |
| cli.Dancer 1.1 | 6.0 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.1 | 14 / 35 | 4724 |
| 2 | 1 | 67.5 | 82.5 | 13 / 35 | 5086 |
| 3 | 1 | 68.3 | 86.3 | 15 / 35 | 5017 |
| 4 | 2 | 66.4 | 81.9 | 12 / 35 | 4446 |
| 5 | 1 | 67.7 | 84.1 | 14 / 35 | 4837 |
| 6 | 2 | 65.1 | 78.7 | 9 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 59 | 51% |
| kid.Gladiator .7.2 | 39 | 64% |
| jcs.Seth 1.8 | 20 | 70% |
| tcf.Reach 3 | 4 | 100% |
| cli.Dancer 1.1 | 4 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 48 | 36% | 79 |
| kid.Gladiator .7.2 | 48 | 36% | 70 |
| jcs.Seth 1.8 | 21 | 16% | 37 |
| tcf.Reach 3 | 10 | 7% | 16 |
| amk.Punbot.Punbot 0.01 | 4 | 3% | 4 |
| ratosh.Wesco 1.4 | 2 | 1% | 2 |
| cli.Dancer 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 78.4 | 32 / 210 | 2.95 | 14.8% | 21436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 149 |
| hadur117.mini.DeiseWV2 0.4 | 2.0 | 14.8% | 32 |
| gh.mini.Gruwel 0.9 | 3.3 | 13.1% | 21 |
| rz.HawkOnFire 0.1 | 3.8 | 12.0% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.1% | 3 |
| wit.Chuliath 1.0 | 6.7 | 7.1% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.0 | 77.1 | 6 / 35 | 3406 |
| 2 | 2 | 63.9 | 78.4 | 7 / 35 | 3722 |
| 3 | 2 | 64.0 | 80.3 | 4 / 35 | 3904 |
| 4 | 2 | 62.9 | 78.7 | 2 / 35 | 3670 |
| 5 | 2 | 61.4 | 74.3 | 2 / 35 | 3217 |
| 6 | 2 | 64.2 | 81.3 | 11 / 35 | 3517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 82 | 15% |
| gh.mini.Gruwel 0.9 | 13 | 46% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 90% |
| rz.HawkOnFire 0.1 | 9 | 56% |

Hadur died in 179 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 54% | 107 |
| gh.mini.Gruwel 0.9 | 35 | 20% | 44 |
| rz.HawkOnFire 0.1 | 28 | 16% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 7% | 21 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.0 | 172 / 210 | 1.63 | 21.1% | 33816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 21.1% | 172 |
| bzdp.Pansy 2.1 | 2.5 | 11.9% | 11 |
| alpha.RainingFire 1.0 | 2.8 | 11.7% | 8 |
| bvh.micro.Freya 0.3 | 4.3 | 10.5% | 11 |
| mz.Cork 0.1 | 4.7 | 10.1% | 3 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.8% | 2 |
| m3thos.Eva02 0.7.1 | 7.0 | 9.0% | 3 |
| dl.BetterWalls 1.0 | 8.0 | 6.5% | 2 |
| squidM.TentalceMeleeNano 1.1 | 9.3 | 5.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 28 / 35 | 5688 |
| 2 | 1 | 71.0 | 92.7 | 27 / 35 | 5603 |
| 3 | 1 | 70.5 | 88.9 | 29 / 35 | 5534 |
| 4 | 1 | 70.5 | 88.9 | 26 / 35 | 5834 |
| 5 | 1 | 72.1 | 96.8 | 30 / 35 | 5754 |
| 6 | 1 | 72.1 | 96.8 | 32 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 92% |
| bvh.micro.Freya 0.3 | 32 | 91% |
| alpha.RainingFire 1.0 | 26 | 100% |
| mz.Cork 0.1 | 26 | 100% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| dl.BetterWalls 1.0 | 7 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 13 | 33% | 56 |
| alpha.RainingFire 1.0 | 9 | 23% | 35 |
| bvh.micro.Freya 0.3 | 7 | 18% | 27 |
| mz.Cork 0.1 | 5 | 13% | 31 |
| bvh.mini.Fenrir 0.39 | 3 | 8% | 18 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 20 |
| dl.BetterWalls 1.0 | 1 | 3% | 12 |
| squidM.TentalceMeleeNano 1.1 | 1 | 3% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 8 |

## Melee bench: F37

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.9 | 181 / 210 | 1.55 | 20.7% | 35314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 20.7% | 181 |
| EBBU.Sim2 1.02 | 3.0 | 10.4% | 3 |
| germ.TheMind .2 | 3.2 | 10.6% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.7 | 9.7% | 4 |
| agrach.Dalek 1.0 | 6.2 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.8% | 4 |
| lmk.ACPFinal 0.1 | 6.8 | 8.4% | 2 |
| mb.Beast 0.1 | 7.5 | 8.0% | 3 |
| skm.Ryubot 1.0 | 8.0 | 7.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 98.1 | 33 / 35 | 6182 |
| 2 | 1 | 71.0 | 95.2 | 32 / 35 | 6167 |
| 3 | 1 | 68.9 | 88.9 | 27 / 35 | 5724 |
| 4 | 1 | 69.9 | 93.7 | 29 / 35 | 5638 |
| 5 | 1 | 71.2 | 97.1 | 33 / 35 | 6022 |
| 6 | 1 | 69.2 | 90.5 | 27 / 35 | 5581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 98% |
| EBBU.Sim2 1.02 | 37 | 97% |
| stelo.UntouchableNano 1.3 | 28 | 93% |
| skm.Ryubot 1.0 | 19 | 100% |
| agrach.Dalek 1.0 | 18 | 89% |
| mb.Beast 0.1 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 93% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 479. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| EBBU.Sim2 1.02 | 7 | 23% | 34 |
| germ.TheMind .2 | 5 | 16% | 41 |
| agrach.Dalek 1.0 | 5 | 16% | 33 |
| lmk.ACPFinal 0.1 | 5 | 16% | 24 |
| stelo.UntouchableNano 1.3 | 5 | 16% | 22 |
| mb.Beast 0.1 | 3 | 10% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 0 | 0% | 7 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

## Melee bench: F38

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.5 | 83 / 210 | 2.84 | 16.1% | 24292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.1% | 64 |
| hadur117.mini.DeiseWV2 0.4 | 1.5 | 16.1% | 83 |
| bvh.mini.Freya 0.55 | 3.3 | 12.2% | 19 |
| cs.Wren 1.0 | 5.2 | 10.4% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.4% | 5 |
| bts.mega.Gnarly 1.4 | 5.3 | 10.7% | 20 |
| kdf.KoulDestroyer 1.0 | 6.0 | 9.4% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 5 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 79.7 | 14 / 35 | 4069 |
| 2 | 1 | 66.2 | 81.3 | 18 / 35 | 3981 |
| 3 | 2 | 64.4 | 78.7 | 12 / 35 | 3958 |
| 4 | 1 | 64.7 | 80.0 | 13 / 35 | 4144 |
| 5 | 2 | 63.3 | 76.8 | 11 / 35 | 3890 |
| 6 | 1 | 65.4 | 80.6 | 15 / 35 | 4250 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 48 | 67% |
| bts.mega.Gnarly 1.4 | 17 | 76% |
| cs.Wren 1.0 | 13 | 85% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 100% |
| bvh.mini.Freya 0.55 | 8 | 88% |
| kdf.KoulDestroyer 1.0 | 6 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 40 | 31% | 74 |
| bvh.mini.Freya 0.55 | 26 | 20% | 32 |
| bts.mega.Gnarly 1.4 | 18 | 14% | 28 |
| cs.Wren 1.0 | 14 | 11% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 10% | 26 |
| kdf.KoulDestroyer 1.0 | 11 | 9% | 15 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 8 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.0 | 97 / 210 | 2.53 | 17.5% | 29289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 17.5% | 97 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 26 |
| az.Ololobot 0.2.4 | 3.0 | 12.4% | 47 |
| catcat20.Lambda 0.024 | 4.2 | 11.5% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.8% | 14 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.3% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.7% | 0 |
| gimp.GimpBot 0.1 | 7.5 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 80.3 | 17 / 35 | 4918 |
| 2 | 1 | 67.1 | 84.8 | 18 / 35 | 5027 |
| 3 | 1 | 66.9 | 84.8 | 16 / 35 | 5043 |
| 4 | 1 | 67.5 | 84.8 | 20 / 35 | 4959 |
| 5 | 1 | 65.7 | 81.0 | 12 / 35 | 4807 |
| 6 | 1 | 65.7 | 82.5 | 14 / 35 | 4535 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 34 | 50% |
| bvh.fry.Freya 0.82 | 34 | 91% |
| catcat20.Lambda 0.024 | 31 | 74% |
| stelo.SoRobotNanoMelee 1.2 | 23 | 83% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 0% |

Hadur died in 113 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 35% | 68 |
| az.Ololobot 0.2.4 | 25 | 22% | 48 |
| catcat20.Lambda 0.024 | 22 | 19% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 18 | 16% | 23 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 12 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 5 |
| gimp.GimpBot 0.1 | 1 | 1% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 5 |

## Melee bench: F40

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 108 / 210 | 2.34 | 18.2% | 29043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.2% | 108 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.5% | 46 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 11.9% | 20 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.6% | 17 |
| mz.AntiGrav 1.0 | 5.2 | 10.3% | 3 |
| stelo.Randomness 1.0 | 5.7 | 9.4% | 11 |
| alpha.BlackIce 1.0 | 6.3 | 9.0% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 1 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.4 | 18 / 35 | 4757 |
| 2 | 1 | 67.2 | 83.5 | 17 / 35 | 4886 |
| 3 | 1 | 67.5 | 84.1 | 18 / 35 | 4684 |
| 4 | 1 | 68.2 | 86.7 | 18 / 35 | 4710 |
| 5 | 1 | 68.0 | 85.4 | 18 / 35 | 5129 |
| 6 | 1 | 68.0 | 85.4 | 19 / 35 | 4877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 62 | 73% |
| kano.gamma.KanoGamma 1.8 | 29 | 62% |
| Polkwane.SmashMelee 1.0 | 20 | 65% |
| stelo.Randomness 1.0 | 13 | 85% |
| mz.AntiGrav 1.0 | 13 | 100% |
| alpha.BlackIce 1.0 | 4 | 75% |
| amk.superstrike.SuperStrike 0.3 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 39 | 38% | 72 |
| kano.gamma.KanoGamma 1.8 | 20 | 20% | 48 |
| Polkwane.SmashMelee 1.0 | 13 | 13% | 17 |
| mz.AntiGrav 1.0 | 9 | 9% | 28 |
| stelo.Randomness 1.0 | 9 | 9% | 24 |
| alpha.BlackIce 1.0 | 9 | 9% | 12 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 3 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 4 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.9 | 89 / 210 | 2.54 | 17.1% | 25949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.2 | 17.1% | 89 |
| eem.EvBotNG v12.8 | 1.8 | 16.4% | 70 |
| ary.Swarm 1.1 | 3.2 | 13.0% | 13 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 18 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.5% | 14 |
| shrub.Silver v048 | 6.2 | 8.3% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.2 | 5.6% | 2 |
| jsal.Jsalbot 1.0 | 8.5 | 5.8% | 4 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 82.5 | 14 / 35 | 4310 |
| 2 | 1 | 67.2 | 84.4 | 16 / 35 | 4337 |
| 3 | 1 | 66.8 | 84.1 | 16 / 35 | 4291 |
| 4 | 1 | 66.2 | 80.0 | 16 / 35 | 4155 |
| 5 | 1 | 67.4 | 85.1 | 15 / 35 | 4569 |
| 6 | 2 | 65.9 | 81.0 | 12 / 35 | 4287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 50% |
| ary.Swarm 1.1 | 26 | 81% |
| lessonz.robocode.Oz 0.5.0 | 24 | 88% |
| simonton.nano.MeleeSeed 1.8 | 12 | 92% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| stelo.Mirror 1.1 | 1 | 0% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 52 | 43% | 83 |
| ary.Swarm 1.1 | 22 | 18% | 44 |
| simonton.nano.MeleeSeed 1.8 | 20 | 16% | 32 |
| lessonz.robocode.Oz 0.5.0 | 17 | 14% | 34 |
| stelo.Mirror 1.1 | 4 | 3% | 4 |
| shrub.Silver v048 | 4 | 3% | 4 |
| zyx.nano.Ant 1.1 | 1 | 1% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.2 | 105 / 210 | 2.24 | 18.3% | 31136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 18.3% | 105 |
| wompi.Wallaby 5.1 | 2.0 | 15.8% | 56 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.7% | 19 |
| ara.Shera 0.88 | 3.8 | 13.0% | 25 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 1 |
| dsw.StaticD 1.0 | 6.2 | 7.4% | 2 |
| maribo.IotaCT 1.1 | 7.3 | 7.0% | 1 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.8 | 22 / 35 | 5183 |
| 2 | 1 | 68.7 | 88.3 | 18 / 35 | 5511 |
| 3 | 1 | 66.9 | 83.5 | 14 / 35 | 4935 |
| 4 | 1 | 68.7 | 88.3 | 18 / 35 | 5217 |
| 5 | 1 | 67.6 | 83.8 | 19 / 35 | 5037 |
| 6 | 1 | 67.5 | 83.8 | 14 / 35 | 5253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 58 | 79% |
| maribo.mini.MiniQuester 0.1 | 35 | 89% |
| ara.Shera 0.88 | 32 | 66% |
| dsw.StaticD 1.0 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 39 | 37% | 86 |
| ara.Shera 0.88 | 31 | 29% | 54 |
| maribo.mini.MiniQuester 0.1 | 23 | 22% | 47 |
| amz.NanoClone 1.41 | 5 | 5% | 6 |
| maribo.IotaCT 1.1 | 3 | 3% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| dsw.StaticD 1.0 | 1 | 1% | 7 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |

## Melee bench: F43

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 75.1 | 29 / 210 | 3.24 | 14.8% | 23839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 153 |
| hadur117.mini.DeiseWV2 0.4 | 2.0 | 14.8% | 29 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.9% | 18 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.2% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.2% | 2 |
| mz.NanoGod 2.02 | 7.0 | 8.1% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.6% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.7 | 6 / 35 | 3725 |
| 2 | 2 | 64.1 | 75.6 | 3 / 35 | 4073 |
| 3 | 2 | 64.5 | 76.2 | 6 / 35 | 3995 |
| 4 | 2 | 64.9 | 75.9 | 4 / 35 | 4219 |
| 5 | 2 | 65.1 | 78.1 | 3 / 35 | 4043 |
| 6 | 2 | 63.4 | 71.4 | 7 / 35 | 3784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 74 | 20% |
| brainfade.melee.Dusk 0.44 | 13 | 69% |
| dummy.micro.Sparrow 2.5 | 8 | 38% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 33% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 85 | 47% | 99 |
| brainfade.melee.Dusk 0.44 | 29 | 16% | 37 |
| dummy.micro.Sparrow 2.5 | 28 | 15% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 23 | 13% | 23 |
| mz.NanoGod 2.02 | 8 | 4% | 10 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 8 |
| jab.DiamondStealer 5 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.5 | 111 / 210 | 2.12 | 19.2% | 33544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.2% | 111 |
| stelo.Liblix 0.3.1 | 2.5 | 15.5% | 50 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.6% | 40 |
| wompi.Quokka 1.6 | 4.3 | 10.2% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.9% | 0 |
| jwirde.Gort 2.0 | 5.5 | 8.8% | 3 |
| disan.Chair 2.2.0 | 7.2 | 7.3% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.9% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.0 | 16 / 35 | 5546 |
| 2 | 1 | 70.5 | 90.5 | 21 / 35 | 5865 |
| 3 | 1 | 67.9 | 82.9 | 15 / 35 | 5272 |
| 4 | 1 | 69.1 | 87.3 | 17 / 35 | 5366 |
| 5 | 1 | 70.1 | 90.2 | 20 / 35 | 5857 |
| 6 | 1 | 69.7 | 88.3 | 22 / 35 | 5638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 71 | 75% |
| tzu.TheArtOfWar 1.2 | 52 | 69% |
| wompi.Quokka 1.6 | 9 | 89% |
| jwirde.Gort 2.0 | 7 | 100% |
| disan.Chair 2.2.0 | 6 | 67% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 42% | 97 |
| tzu.TheArtOfWar 1.2 | 34 | 34% | 69 |
| stf.PanzerGeneral 0.1 | 7 | 7% | 7 |
| wompi.Quokka 1.6 | 5 | 5% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 5% | 6 |
| disan.Chair 2.2.0 | 4 | 4% | 4 |
| jwirde.Gort 2.0 | 3 | 3% | 12 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.7 | 74 / 210 | 2.20 | 19.5% | 36675 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWV2 0.4 | 1.0 | 19.5% | 74 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.4% | 122 |
| jje.BagPuss 1.2 | 3.2 | 11.7% | 2 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 6 |
| myl.nano.Graviton 1.10 | 4.7 | 10.2% | 1 |
| fm.claire 1.7 | 6.7 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.8 | 8.3% | 4 |
| hvilela.HVilela 0.9 | 7.5 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.1% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.9 | 9 / 35 | 5642 |
| 2 | 1 | 70.1 | 87.0 | 15 / 35 | 6411 |
| 3 | 1 | 69.6 | 87.9 | 11 / 35 | 6343 |
| 4 | 1 | 69.6 | 88.6 | 10 / 35 | 6237 |
| 5 | 1 | 69.6 | 89.8 | 13 / 35 | 5813 |
| 6 | 1 | 69.4 | 85.1 | 16 / 35 | 6229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 116 | 22% |
| sul.Lunar 1.1 | 16 | 94% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 89% |
| jje.BagPuss 1.2 | 8 | 100% |
| wit.Deep7 2.0 | 5 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 2163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 91 | 67% | 0 |
| jje.BagPuss 1.2 | 12 | 9% | 72 |
| myl.nano.Graviton 1.10 | 11 | 8% | 31 |
| sul.Lunar 1.1 | 10 | 7% | 55 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 23 |
| fm.claire 1.7 | 4 | 3% | 10 |
| hvilela.HVilela 0.9 | 2 | 1% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseWV2 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.7 | 62 / 210 | 2.47 | 16.4% | 25561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 17.0% | 57 |
| hadur117.mini.DeiseWV2 0.4 | 1.8 | 16.4% | 62 |
| rsalesc.melee.Medina 0.4.5 | 2.5 | 16.4% | 70 |
| mz.MicroSheep 1.0 | 4.2 | 10.5% | 8 |
| cx.Princess 1.0 | 5.2 | 9.9% | 12 |
| sadoner.killer 0.2 | 5.7 | 9.1% | 2 |
| arthord.NanoSatanMelee Beta | 7.0 | 6.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 83.2 | 13 / 35 | 4225 |
| 2 | 2 | 66.5 | 83.5 | 11 / 35 | 4632 |
| 3 | 1 | 66.2 | 85.4 | 9 / 35 | 4406 |
| 4 | 3 | 64.4 | 81.6 | 9 / 35 | 3907 |
| 5 | 1 | 66.6 | 85.1 | 12 / 35 | 4379 |
| 6 | 2 | 64.8 | 83.5 | 8 / 35 | 4012 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 50% |
| rsalesc.melee.Medina 0.4.5 | 47 | 43% |
| mz.MicroSheep 1.0 | 6 | 83% |
| cx.Princess 1.0 | 6 | 67% |
| arthord.NanoSatanMelee Beta | 2 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 71 | 48% | 105 |
| rsalesc.melee.Medina 0.4.5 | 50 | 34% | 71 |
| cx.Princess 1.0 | 10 | 7% | 14 |
| mz.MicroSheep 1.0 | 9 | 6% | 12 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 4 |
| sadoner.killer 0.2 | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

