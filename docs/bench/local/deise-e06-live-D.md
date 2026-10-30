# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.7 | 52 / 210 | 2.20 | 17.5% | 31717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 147 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 17.5% | 52 |
| mz.MicroGodMelee 1 | 3.8 | 10.7% | 4 |
| sgp.JollyNinja 3.53 | 4.2 | 10.7% | 5 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.5% | 2 |
| lorneswork.Predator 1.0 | 5.8 | 9.2% | 0 |
| adt.Ar2 1.0 | 6.8 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 83.8 | 5 / 35 | 5655 |
| 2 | 2 | 68.7 | 90.2 | 14 / 35 | 5525 |
| 3 | 2 | 67.2 | 86.7 | 11 / 35 | 5058 |
| 4 | 2 | 68.1 | 88.6 | 11 / 35 | 5059 |
| 5 | 2 | 67.1 | 84.8 | 6 / 35 | 5327 |
| 6 | 2 | 67.0 | 86.3 | 5 / 35 | 5093 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 142 | 18% |
| sgp.JollyNinja 3.53 | 11 | 82% |
| mz.MicroGodMelee 1 | 10 | 80% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 4 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1222. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 78% | 153 |
| sgp.JollyNinja 3.53 | 16 | 10% | 22 |
| mz.MicroGodMelee 1 | 6 | 4% | 13 |
| lorneswork.Predator 1.0 | 6 | 4% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 7 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |

## Melee bench: F02

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.6 | 105 / 210 | 2.57 | 18.1% | 30974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.1% | 105 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 47 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.5% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.0% | 5 |
| Noran.BitchingElk 0.054 | 7.0 | 8.1% | 11 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.7% | 7 |
| sch.Simone 0.3d | 7.2 | 8.0% | 4 |
| stelo.PatternRobot 1.0 | 8.5 | 6.7% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.4 | 19 / 35 | 5363 |
| 2 | 1 | 68.1 | 84.8 | 21 / 35 | 5289 |
| 3 | 1 | 65.3 | 77.8 | 14 / 35 | 4794 |
| 4 | 1 | 67.3 | 83.2 | 16 / 35 | 5162 |
| 5 | 1 | 66.9 | 81.0 | 17 / 35 | 5087 |
| 6 | 1 | 67.9 | 83.5 | 18 / 35 | 5279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 73% |
| pulsar.PulsarMax 0.8.9 | 38 | 74% |
| Noran.BitchingElk 0.054 | 15 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 100% |
| stelo.PatternRobot 1.0 | 9 | 89% |
| sch.Simone 0.3d | 7 | 71% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 34% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 29% | 57 |
| fnc.bandit.Bandit 5.2.0 | 8 | 8% | 10 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 7% | 15 |
| sch.Simone 0.3d | 6 | 6% | 14 |
| Noran.BitchingElk 0.054 | 5 | 5% | 21 |
| stelo.PatternRobot 1.0 | 5 | 5% | 10 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 92.2 | 150 / 210 | 1.70 | 20.2% | 37152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.2% | 150 |
| radnor.DoctorBob 1.42 | 2.2 | 13.7% | 19 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.9% | 12 |
| vuen.Cake 2.51 | 3.8 | 12.5% | 25 |
| urdos.URDOS 1.3 | 5.2 | 8.9% | 3 |
| adt.Ar1 2.1 | 6.0 | 7.9% | 1 |
| oa.weak.FlyMk1 0.1 | 6.8 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 8.3 | 6.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 23 / 35 | 5641 |
| 2 | 1 | 70.0 | 89.8 | 22 / 35 | 6477 |
| 3 | 1 | 71.5 | 96.8 | 28 / 35 | 6344 |
| 4 | 1 | 69.5 | 91.1 | 24 / 35 | 5703 |
| 5 | 1 | 71.9 | 95.6 | 28 / 35 | 6765 |
| 6 | 1 | 69.8 | 90.2 | 25 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 59 | 69% |
| kawigi.nano.Lib 1.0 | 57 | 91% |
| radnor.DoctorBob 1.42 | 48 | 98% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 22 | 37% | 67 |
| kawigi.nano.Lib 1.0 | 14 | 23% | 65 |
| radnor.DoctorBob 1.42 | 11 | 18% | 43 |
| urdos.URDOS 1.3 | 7 | 12% | 9 |
| adt.Ar1 2.1 | 3 | 5% | 8 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.2 | 32 / 210 | 2.42 | 17.4% | 35135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 174 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 17.4% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.5% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.7% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.3% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 79.7 | 5 / 35 | 5794 |
| 2 | 2 | 69.2 | 88.6 | 8 / 35 | 5903 |
| 3 | 2 | 68.0 | 84.8 | 4 / 35 | 5965 |
| 4 | 2 | 67.3 | 80.0 | 8 / 35 | 5647 |
| 5 | 2 | 67.3 | 84.8 | 2 / 35 | 5516 |
| 6 | 2 | 69.2 | 87.3 | 5 / 35 | 6310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 148 | 16% |
| apc.LeeroyJenkins2 1.0 | 4 | 100% |
| TNT.TNT 0.99.1 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 1328. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 84% | 174 |
| apc.LeeroyJenkins2 1.0 | 11 | 6% | 15 |
| josago.Jorgito 0.16 | 8 | 4% | 9 |
| css.Delitioner 0.11 | 5 | 3% | 5 |
| TNT.TNT 0.99.1 | 2 | 1% | 5 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 69.7 | 10 / 210 | 3.73 | 13.0% | 20403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.0% | 119 |
| justin.DemonicRage 3.4 | 1.8 | 17.2% | 69 |
| hadur117.mini.DeiseD 0.3 | 3.0 | 13.0% | 10 |
| wompi.Numbat 2.1 | 4.0 | 12.2% | 6 |
| ms.Ares 0.19 | 5.3 | 9.6% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 8.9% | 5 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.8% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.8 | 68.3 | 2 / 35 | 3528 |
| 2 | 3 | 59.9 | 67.9 | 2 / 35 | 3471 |
| 3 | 3 | 60.6 | 72.7 | 2 / 35 | 3261 |
| 4 | 3 | 61.1 | 73.0 | 3 / 35 | 3220 |
| 5 | 3 | 58.9 | 66.7 | 0 / 35 | 3265 |
| 6 | 3 | 60.5 | 69.5 | 1 / 35 | 3658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 34 | 9% |
| justin.DemonicRage 3.4 | 19 | 16% |
| ms.Ares 0.19 | 3 | 100% |
| wompi.Numbat 2.1 | 2 | 50% |

Hadur died in 200 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 75 | 38% | 78 |
| justin.DemonicRage 3.4 | 68 | 34% | 71 |
| wompi.Numbat 2.1 | 22 | 11% | 23 |
| ms.Ares 0.19 | 14 | 7% | 16 |
| supersample.SuperBoxBot 1.0 | 9 | 5% | 9 |
| axeBots.HataMoto 3.09 | 7 | 4% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.8 | 78 / 210 | 2.73 | 16.8% | 28300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 16.8% | 78 |
| jekl.StoneGhost 0.7 | 2.5 | 14.7% | 39 |
| origin.SleepSiphon 1.7b | 2.8 | 14.4% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.5% | 25 |
| mld.Wisdom 1.0 | 4.8 | 10.7% | 3 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.6% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 6.6% | 0 |
| DBall.NUKE 0.1 | 8.3 | 6.4% | 1 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.8 | 13 / 35 | 4779 |
| 2 | 1 | 64.1 | 76.8 | 11 / 35 | 4360 |
| 3 | 1 | 65.4 | 77.1 | 13 / 35 | 4675 |
| 4 | 1 | 66.1 | 82.5 | 11 / 35 | 4560 |
| 5 | 1 | 67.4 | 83.2 | 17 / 35 | 5171 |
| 6 | 1 | 66.5 | 81.3 | 13 / 35 | 4755 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 58% |
| jekl.StoneGhost 0.7 | 30 | 80% |
| pe.minimelee.SandboxMiniMelee 1.1 | 25 | 72% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| gg.Wolverine 2.0 | 5 | 60% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 3 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 40 | 30% | 70 |
| jekl.StoneGhost 0.7 | 34 | 26% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 26% | 48 |
| mld.Wisdom 1.0 | 16 | 12% | 21 |
| spinnercat.Omen 1.0 | 3 | 2% | 5 |
| gg.Wolverine 2.0 | 3 | 2% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |

## Melee bench: F07

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 91.7 | 110 / 210 | 1.74 | 19.7% | 35960 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.7% | 110 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.2% | 50 |
| rtk.Tachikoma 1.0 | 2.7 | 16.4% | 30 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 9 |
| franzor.Lizt 1.3.1 | 4.7 | 10.6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 13 / 35 | 5881 |
| 2 | 1 | 71.4 | 92.4 | 19 / 35 | 6256 |
| 3 | 1 | 71.4 | 91.4 | 19 / 35 | 6368 |
| 4 | 1 | 71.7 | 93.7 | 22 / 35 | 5954 |
| 5 | 1 | 70.7 | 92.7 | 19 / 35 | 5606 |
| 6 | 1 | 71.1 | 92.1 | 18 / 35 | 5895 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 93 | 80% |
| rsalesc.melee.Monk 0.3.6c | 50 | 28% |
| oog.melee.CapuletDroid 1.1 | 22 | 68% |
| franzor.Lizt 1.3.1 | 10 | 40% |
| lrem.micro.MoggFanatic 0.2 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 56 | 55% | 72 |
| rtk.Tachikoma 1.0 | 31 | 31% | 109 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 24 |
| franzor.Lizt 1.3.1 | 6 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.6 | 124 / 210 | 2.12 | 18.9% | 30365 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.9% | 124 |
| shrub.Vapour v159 | 2.5 | 13.1% | 32 |
| tm.Yuugao 1.0 | 2.7 | 13.0% | 38 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.2% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.2% | 1 |
| m3thos.Eva00 1.1 | 5.8 | 8.4% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 7.2 | 7.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.3 | 6.8% | 0 |
| SHAM.WOW 1.4 | 8.7 | 6.7% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.5 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.0 | 16 / 35 | 4982 |
| 2 | 1 | 66.1 | 81.6 | 18 / 35 | 4635 |
| 3 | 1 | 69.4 | 90.5 | 24 / 35 | 5339 |
| 4 | 1 | 68.4 | 88.6 | 21 / 35 | 4979 |
| 5 | 1 | 68.2 | 86.7 | 22 / 35 | 5027 |
| 6 | 1 | 69.5 | 91.1 | 23 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 69% |
| shrub.Vapour v159 | 41 | 76% |
| Krabb.sliNk.Garm 0.9u | 21 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 11 | 100% |
| m3thos.Eva00 1.1 | 6 | 100% |
| SHAM.WOW 1.4 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 30 | 35% | 59 |
| tm.Yuugao 1.0 | 27 | 31% | 66 |
| Krabb.sliNk.Garm 0.9u | 16 | 19% | 29 |
| zyx.nano.BacillusComma 1.0 | 4 | 5% | 8 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 3% | 20 |
| m3thos.Eva00 1.1 | 3 | 3% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 2 | 2% | 12 |
| SHAM.WOW 1.4 | 1 | 1% | 7 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.3 | 64 / 210 | 3.22 | 15.6% | 25039 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.3% | 93 |
| hadur117.mini.DeiseD 0.3 | 1.8 | 15.6% | 64 |
| kc.micro.Figment 1.0 | 2.8 | 13.5% | 23 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.9% | 16 |
| yagami.Tidus 0.11 | 4.8 | 10.1% | 1 |
| mc2.enemy.Original 0.9 | 5.7 | 9.1% | 11 |
| dft.Calliope 5.6 | 7.2 | 7.4% | 1 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 1 |
| rdm.Dueler 0.4x | 9.2 | 5.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.0 | 12 / 35 | 4376 |
| 2 | 2 | 64.2 | 75.9 | 12 / 35 | 4203 |
| 3 | 3 | 62.8 | 71.7 | 10 / 35 | 3981 |
| 4 | 2 | 63.7 | 75.9 | 7 / 35 | 4236 |
| 5 | 2 | 63.2 | 74.6 | 8 / 35 | 3865 |
| 6 | 1 | 64.3 | 74.6 | 15 / 35 | 4378 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 44% |
| kc.micro.Figment 1.0 | 26 | 88% |
| mc2.enemy.Original 0.9 | 9 | 67% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 3 | 67% |
| robar.nano.Assertive_Melee 0.2 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 41% | 86 |
| kc.micro.Figment 1.0 | 28 | 19% | 50 |
| yagami.Tidus 0.11 | 18 | 12% | 24 |
| pedersen.Grishnakh 1.0 | 13 | 9% | 14 |
| mc2.enemy.Original 0.9 | 11 | 7% | 18 |
| dft.Calliope 5.6 | 6 | 4% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 7 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.0 | 143 / 210 | 1.90 | 19.4% | 33527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.4% | 143 |
| DTF.Kludgy 1.2b | 2.2 | 14.6% | 27 |
| ne.Chimera 1.2 | 3.0 | 12.9% | 17 |
| ejb.Polaris 1.0.1 | 4.2 | 11.3% | 9 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.2% | 7 |
| vStar.RAFzilla 2.15 | 5.5 | 9.5% | 5 |
| sam.Samspin 1.0 | 7.7 | 6.1% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.8 | 5.5% | 1 |
| donjezza.Muncho 1.0 | 9.2 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.7 | 27 / 35 | 5744 |
| 2 | 1 | 69.4 | 91.1 | 21 / 35 | 5522 |
| 3 | 1 | 70.5 | 93.0 | 27 / 35 | 5774 |
| 4 | 1 | 69.1 | 88.6 | 23 / 35 | 5697 |
| 5 | 1 | 68.9 | 88.6 | 23 / 35 | 5262 |
| 6 | 1 | 68.8 | 87.0 | 22 / 35 | 5528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 80% |
| ne.Chimera 1.2 | 35 | 80% |
| ejb.Polaris 1.0.1 | 29 | 93% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| vStar.RAFzilla 2.15 | 12 | 92% |
| donjezza.Muncho 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 27 | 40% | 69 |
| ne.Chimera 1.2 | 15 | 22% | 44 |
| ejb.Polaris 1.0.1 | 9 | 13% | 40 |
| vStar.RAFzilla 2.15 | 6 | 9% | 20 |
| tvv.micro.Antares 1.1.1 | 4 | 6% | 16 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 4% | 6 |
| sam.Samspin 1.0 | 2 | 3% | 5 |
| donjezza.Muncho 1.0 | 1 | 1% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 7 |

## Melee bench: F11

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.1 | 88 / 210 | 2.79 | 17.0% | 28085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 17.0% | 88 |
| rz.Aleph 0.34 | 1.8 | 15.7% | 59 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 28 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 11 |
| rdt199.Warlord 0.73 | 5.7 | 9.1% | 9 |
| br2.MobyDickBot 1.6 | 5.7 | 8.9% | 6 |
| uji.YellohFellah 1.0 | 7.0 | 8.1% | 6 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.4% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 75.2 | 13 / 35 | 4602 |
| 2 | 2 | 64.7 | 75.2 | 15 / 35 | 4612 |
| 3 | 1 | 66.3 | 80.3 | 15 / 35 | 4768 |
| 4 | 1 | 65.7 | 81.9 | 13 / 35 | 4479 |
| 5 | 1 | 68.1 | 87.9 | 18 / 35 | 4909 |
| 6 | 1 | 66.0 | 80.0 | 14 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 47 | 64% |
| cx.mini.Nimrod 0.55 | 19 | 63% |
| djc.DynaBot 0.1.1 | 19 | 84% |
| uji.YellohFellah 1.0 | 16 | 63% |
| rdt199.Warlord 0.73 | 13 | 69% |
| br2.MobyDickBot 1.6 | 9 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 47 | 39% | 79 |
| cx.mini.Nimrod 0.55 | 33 | 27% | 41 |
| rdt199.Warlord 0.73 | 12 | 10% | 22 |
| uji.YellohFellah 1.0 | 11 | 9% | 20 |
| djc.DynaBot 0.1.1 | 7 | 6% | 22 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| br2.MobyDickBot 1.6 | 3 | 2% | 14 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.4 | 128 / 210 | 2.31 | 18.1% | 25508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.1% | 128 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.8% | 27 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 22 |
| nat.PallasHawk 1.0 | 3.5 | 12.5% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.4% | 9 |
| jrm.Test0 1.0 | 6.3 | 7.4% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.3% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 0 |
| stuff.Vlad 0.1 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 80.0 | 18 / 35 | 4114 |
| 2 | 1 | 68.7 | 90.2 | 22 / 35 | 4294 |
| 3 | 1 | 66.2 | 81.6 | 20 / 35 | 4133 |
| 4 | 1 | 69.0 | 89.5 | 23 / 35 | 4354 |
| 5 | 1 | 67.6 | 84.4 | 22 / 35 | 4412 |
| 6 | 1 | 67.9 | 87.0 | 23 / 35 | 4201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 52 | 88% |
| darkcanuck.Leon 1.01 | 47 | 85% |
| nat.PallasHawk 1.0 | 30 | 83% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 21 | 25% | 58 |
| nat.PallasHawk 1.0 | 19 | 23% | 44 |
| darkcanuck.Leon 1.01 | 17 | 20% | 62 |
| brainfade.melee.Genghis 0.36 | 14 | 17% | 19 |
| jrm.Test0 1.0 | 7 | 8% | 9 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 5 |
| jp.Perpy 16.0 | 2 | 2% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 1 |

## Melee bench: F13

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.5 | 66 / 210 | 2.66 | 16.0% | 25753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.0% | 84 |
| ags.Glacier 0.2.11 | 1.7 | 16.7% | 42 |
| hadur117.mini.DeiseD 0.3 | 3.0 | 16.0% | 66 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.4% | 5 |
| shinh.Entangled 0.3 | 4.7 | 11.5% | 12 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.3% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.7 | 81.3 | 9 / 35 | 4197 |
| 2 | 3 | 64.9 | 78.7 | 10 / 35 | 4343 |
| 3 | 3 | 65.8 | 83.8 | 12 / 35 | 4001 |
| 4 | 3 | 66.8 | 83.8 | 13 / 35 | 4621 |
| 5 | 3 | 65.5 | 82.9 | 11 / 35 | 4035 |
| 6 | 3 | 65.2 | 78.7 | 11 / 35 | 4556 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 57 | 42% |
| ags.Glacier 0.2.11 | 49 | 69% |
| shinh.Entangled 0.3 | 7 | 71% |
| apc.Colossus2 0.17 | 1 | 100% |
| gh.micro.Gruweltje 0.7 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 53 | 37% | 76 |
| ags.Glacier 0.2.11 | 45 | 31% | 75 |
| shinh.Entangled 0.3 | 18 | 12% | 21 |
| gh.micro.Gruweltje 0.7 | 16 | 11% | 22 |
| stelo.Wang 1.0 | 10 | 7% | 10 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| apc.Colossus2 0.17 | 1 | 1% | 4 |

## Melee bench: F14

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.6 | 148 / 210 | 1.75 | 20.0% | 34451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.0% | 148 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.4% | 33 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.8% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.0% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.5% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.1% | 5 |
| pa.Improved 1.0 | 9.0 | 5.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.3 | 27 / 35 | 6104 |
| 2 | 1 | 69.0 | 88.9 | 21 / 35 | 5214 |
| 3 | 1 | 71.3 | 95.9 | 25 / 35 | 5794 |
| 4 | 1 | 69.9 | 88.9 | 26 / 35 | 5784 |
| 5 | 1 | 69.9 | 89.5 | 23 / 35 | 5568 |
| 6 | 1 | 71.2 | 93.3 | 26 / 35 | 5987 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 81% |
| catcat20.shape.Theta 0.018 | 51 | 86% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 75% |
| co.edu.usb.rc.LidisTron 1.0 | 14 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 28 | 44% | 95 |
| catcat20.shape.Theta 0.018 | 16 | 25% | 55 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 14% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 6% | 14 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 12 |
| pa.Improved 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 80.8 | 96 / 210 | 2.72 | 17.8% | 32646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.8% | 96 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.1% | 26 |
| mld.DustBunny 3.8 | 3.7 | 12.2% | 10 |
| emp.Yngwie 1.11 | 3.7 | 12.2% | 36 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.2% | 18 |
| kawigi.robot.Girl 1.2 | 5.8 | 10.1% | 19 |
| lambdaxy.TBot 0.1 | 7.3 | 6.3% | 0 |
| Grystrion.TrackerWO 1.0 | 8.3 | 5.8% | 0 |
| divineomega.TrialBot 0.003 | 8.3 | 5.8% | 4 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 78.4 | 14 / 35 | 5446 |
| 2 | 1 | 64.8 | 75.2 | 12 / 35 | 5067 |
| 3 | 1 | 68.5 | 85.7 | 17 / 35 | 5644 |
| 4 | 1 | 67.3 | 81.6 | 17 / 35 | 5287 |
| 5 | 1 | 68.4 | 84.1 | 18 / 35 | 5533 |
| 6 | 1 | 67.6 | 80.0 | 18 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 32 | 50% |
| kawigi.micro.Shiz 1.1 | 24 | 92% |
| mld.DustBunny 3.8 | 22 | 95% |
| kawigi.robot.Girl 1.2 | 19 | 84% |
| cb.nano.Insomnia 1.0 | 17 | 71% |
| divineomega.TrialBot 0.003 | 6 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 34% | 67 |
| kawigi.micro.Shiz 1.1 | 23 | 20% | 55 |
| cb.nano.Insomnia 1.0 | 20 | 18% | 18 |
| kawigi.robot.Girl 1.2 | 14 | 12% | 18 |
| mld.DustBunny 3.8 | 9 | 8% | 32 |
| lambdaxy.TBot 0.1 | 4 | 4% | 6 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |

## Melee bench: F16

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 83.5 | 97 / 210 | 2.48 | 18.6% | 34474 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.6% | 97 |
| gh.Griezel 0.5.2 | 2.0 | 16.9% | 71 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.4% | 22 |
| tvv.nano.Polaris 1.2 | 5.2 | 8.9% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.6% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.3% | 1 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 1 |
| repositorio.NanoStep 1.0 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.1 | 18 / 35 | 5723 |
| 2 | 1 | 68.2 | 83.2 | 17 / 35 | 5412 |
| 3 | 1 | 68.1 | 81.9 | 15 / 35 | 5767 |
| 4 | 1 | 70.1 | 87.6 | 15 / 35 | 6182 |
| 5 | 1 | 69.2 | 85.4 | 19 / 35 | 5786 |
| 6 | 1 | 67.1 | 79.0 | 13 / 35 | 5604 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 91% |
| techdude.forest.FlamingForest 1.1 | 21 | 62% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 83% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 3 | 67% |
| repositorio.NanoStep 1.0 | 2 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1138. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 59 | 52% | 103 |
| techdude.forest.FlamingForest 1.1 | 17 | 15% | 32 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 14% | 38 |
| bvh.fnr.Fenrir 0.36l | 7 | 6% | 12 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 9 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 6 |
| divineomega.DivineBot 1.9.4.5 | 4 | 4% | 5 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.2 | 84 / 210 | 2.79 | 17.3% | 32142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.3% | 84 |
| et.Predator 1.8 | 2.3 | 13.3% | 24 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.4% | 36 |
| cx.BlestPain 1.41 | 4.2 | 11.7% | 38 |
| nic.Nicator 2.4 | 4.7 | 11.4% | 17 |
| ahf.NanoAndrew .4 | 5.7 | 10.6% | 8 |
| maribo.melee.BMV 0.1 | 6.5 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.7% | 2 |
| tex.Longbot 0.4 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.1 | 16 / 35 | 5405 |
| 2 | 1 | 66.9 | 78.7 | 17 / 35 | 5549 |
| 3 | 1 | 64.3 | 74.6 | 9 / 35 | 5007 |
| 4 | 1 | 65.9 | 76.8 | 13 / 35 | 5323 |
| 5 | 1 | 67.1 | 81.6 | 14 / 35 | 5558 |
| 6 | 1 | 67.5 | 84.1 | 15 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 86% |
| oog.melee.Mercutio 1.0 | 27 | 67% |
| nic.Nicator 2.4 | 23 | 61% |
| cx.BlestPain 1.41 | 21 | 24% |
| ahf.NanoAndrew .4 | 8 | 100% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 28 | 22% | 35 |
| et.Predator 1.8 | 26 | 20% | 55 |
| nic.Nicator 2.4 | 24 | 19% | 37 |
| oog.melee.Mercutio 1.0 | 19 | 15% | 40 |
| ahf.NanoAndrew .4 | 14 | 11% | 22 |
| maribo.melee.BMV 0.1 | 11 | 9% | 14 |
| tex.Longbot 0.4 | 3 | 2% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.8 | 112 / 210 | 2.37 | 18.2% | 28971 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.2% | 112 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.7% | 35 |
| agd.Mooserwirt2 2.7 | 3.0 | 11.6% | 25 |
| uji.DBH 1.1 | 4.3 | 10.9% | 12 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.4% | 5 |
| ratosh.Nobo 0.21 | 5.8 | 9.6% | 6 |
| sigterm.Sigterm 1.0 | 6.8 | 8.2% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.1% | 1 |
| stelo.WangRobot 1.0 | 8.8 | 6.0% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.9 | 18 / 35 | 5049 |
| 2 | 1 | 66.4 | 81.9 | 16 / 35 | 4847 |
| 3 | 1 | 66.8 | 84.8 | 18 / 35 | 4476 |
| 4 | 1 | 69.7 | 90.8 | 25 / 35 | 5235 |
| 5 | 1 | 65.0 | 79.4 | 13 / 35 | 4409 |
| 6 | 1 | 68.7 | 89.8 | 22 / 35 | 4955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 82% |
| agd.Mooserwirt2 2.7 | 33 | 67% |
| uji.DBH 1.1 | 18 | 72% |
| sigterm.Sigterm 1.0 | 13 | 85% |
| stelo.WangRobot 1.0 | 12 | 83% |
| ratosh.Nobo 0.21 | 11 | 82% |
| spinnercat.Robovirus 2.718 | 8 | 75% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 31% | 73 |
| agd.Mooserwirt2 2.7 | 20 | 20% | 42 |
| ratosh.Nobo 0.21 | 11 | 11% | 26 |
| uji.DBH 1.1 | 11 | 11% | 18 |
| spinnercat.Robovirus 2.718 | 9 | 9% | 15 |
| sigterm.Sigterm 1.0 | 8 | 8% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 4% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 7 |
| stelo.WangRobot 1.0 | 2 | 2% | 9 |

## Melee bench: F19

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 93.2 | 160 / 210 | 1.61 | 20.9% | 36492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.9% | 160 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.6% | 21 |
| mld.Infinity 2.2 | 3.0 | 13.5% | 16 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.4% | 7 |
| erdnis.Rover 0.3 | 4.8 | 10.7% | 4 |
| patson.PatsonTestBot 1.0 | 6.3 | 8.2% | 0 |
| pac.ABC 2.1 | 7.3 | 7.1% | 1 |
| mbh.Mbh 0.1 | 7.5 | 6.8% | 1 |
| pbg.R2D2 1.0 | 8.8 | 5.7% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.7 | 95.9 | 28 / 35 | 6385 |
| 2 | 1 | 70.0 | 87.6 | 21 / 35 | 5783 |
| 3 | 1 | 72.0 | 95.2 | 27 / 35 | 5883 |
| 4 | 1 | 72.2 | 94.9 | 29 / 35 | 5881 |
| 5 | 1 | 72.2 | 94.3 | 30 / 35 | 5967 |
| 6 | 1 | 72.0 | 91.4 | 25 / 35 | 6593 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 80 | 90% |
| mld.Infinity 2.2 | 51 | 90% |
| krillr.mini.JointStrike 2.0.0 | 21 | 90% |
| erdnis.Rover 0.3 | 9 | 89% |
| pac.ABC 2.1 | 5 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 30% | 92 |
| krillr.mini.JointStrike 2.0.0 | 11 | 22% | 29 |
| mld.Infinity 2.2 | 10 | 20% | 36 |
| erdnis.Rover 0.3 | 10 | 20% | 23 |
| patson.PatsonTestBot 1.0 | 2 | 4% | 12 |
| pbg.R2D2 1.0 | 2 | 4% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 117 / 210 | 2.17 | 19.3% | 34536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.3% | 117 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 32 |
| fwb.Nine 1.0.1 | 3.7 | 11.5% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.1% | 9 |
| catcat20.Rabbit 0.001 | 4.5 | 10.4% | 20 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.2% | 3 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.6% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.5% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.7 | 18 / 35 | 5883 |
| 2 | 1 | 67.8 | 83.8 | 19 / 35 | 5443 |
| 3 | 1 | 70.0 | 88.3 | 20 / 35 | 6208 |
| 4 | 1 | 70.1 | 87.0 | 24 / 35 | 6039 |
| 5 | 1 | 69.8 | 90.2 | 20 / 35 | 5561 |
| 6 | 1 | 68.2 | 86.0 | 16 / 35 | 5402 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 53 | 77% |
| fwb.Nine 1.0.1 | 35 | 71% |
| catcat20.Rabbit 0.001 | 32 | 78% |
| nz.jdc.nano.GridFu 1.0 | 11 | 91% |
| bayen.nut.Squirrel 1.615 | 10 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 959. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 35% | 72 |
| catcat20.Rabbit 0.001 | 17 | 18% | 44 |
| fwb.Nine 1.0.1 | 17 | 18% | 19 |
| nz.jdc.nano.GridFu 1.0 | 12 | 13% | 33 |
| m3thos.mini.Eva01 0.5.5 | 6 | 6% | 12 |
| djdjdj.NanoSkunk10 1.0 | 3 | 3% | 9 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 5 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.4 | 131 / 210 | 1.69 | 20.6% | 36809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.6% | 131 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 59 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.5% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 5 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.1% | 1 |
| eld.Hmm 1.0 | 5.7 | 8.0% | 6 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 22 / 35 | 6026 |
| 2 | 1 | 70.7 | 91.7 | 22 / 35 | 6031 |
| 3 | 1 | 71.7 | 94.3 | 23 / 35 | 6346 |
| 4 | 1 | 70.6 | 91.1 | 21 / 35 | 5895 |
| 5 | 1 | 72.3 | 94.0 | 23 / 35 | 6626 |
| 6 | 1 | 70.8 | 92.4 | 20 / 35 | 5885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 65% |
| dummy.mini.Scimitar 1.01 | 36 | 92% |
| cf.RiO.RiOx 4.2.1 | 16 | 94% |
| eld.Hmm 1.0 | 12 | 92% |
| el.JumpShoot 0.2 | 1 | 100% |
| fire219.CatBot 1.0 | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 51 | 65% | 102 |
| dummy.mini.Scimitar 1.01 | 13 | 16% | 60 |
| cf.RiO.RiOx 4.2.1 | 11 | 14% | 24 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 4 |
| eld.Hmm 1.0 | 1 | 1% | 15 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.9 | 93 / 210 | 2.36 | 18.1% | 32009 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.1% | 93 |
| pe.SandboxDT 2.71m | 2.5 | 16.2% | 55 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.7% | 36 |
| jlm.javaDisturbance 0.59 | 3.5 | 13.4% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.4% | 4 |
| tad.Dalek98 0.98 | 6.7 | 6.6% | 0 |
| yk.JahRoslav 1.1 | 7.2 | 6.4% | 1 |
| gg.Squaraus 0.6 | 7.2 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.1 | 17 / 35 | 5481 |
| 2 | 1 | 67.8 | 84.1 | 18 / 35 | 5023 |
| 3 | 1 | 68.5 | 86.0 | 16 / 35 | 5378 |
| 4 | 1 | 68.7 | 83.5 | 14 / 35 | 5837 |
| 5 | 1 | 69.0 | 88.6 | 14 / 35 | 5274 |
| 6 | 1 | 67.4 | 82.2 | 14 / 35 | 5016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jlm.javaDisturbance 0.59 | 42 | 83% |
| kvk.HebusLeTroll 0.35 | 41 | 68% |
| pe.SandboxDT 2.71m | 35 | 46% |
| bigpete.Stewie 1.0 | 13 | 92% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 45 | 38% | 73 |
| kvk.HebusLeTroll 0.35 | 32 | 27% | 54 |
| jlm.javaDisturbance 0.59 | 29 | 25% | 60 |
| bigpete.Stewie 1.0 | 7 | 6% | 14 |
| pbg.NinjaX 1.2 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.3 | 124 / 210 | 1.97 | 19.0% | 30525 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.0% | 124 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 54 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 18 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.9% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.3% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 9.0% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 0 |
| sample.Walls 1.0 | 7.2 | 7.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 91.7 | 20 / 35 | 5604 |
| 2 | 1 | 70.0 | 90.5 | 23 / 35 | 5102 |
| 3 | 1 | 68.6 | 87.3 | 19 / 35 | 4676 |
| 4 | 1 | 69.7 | 87.9 | 20 / 35 | 5306 |
| 5 | 1 | 69.9 | 89.5 | 22 / 35 | 4972 |
| 6 | 1 | 69.6 | 88.6 | 20 / 35 | 4865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 80 | 76% |
| cre.Karolos 0.32 | 32 | 84% |
| stelo.AreaTargetingBot 1.1 | 17 | 88% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 41 | 48% | 107 |
| cre.Karolos 0.32 | 21 | 24% | 47 |
| stelo.AreaTargetingBot 1.1 | 15 | 17% | 24 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 5% | 7 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 12 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| cw.megas.Blade 0.8 | 1 | 1% | 5 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 71.2 | 57 / 210 | 3.59 | 14.5% | 23313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.8 | 14.5% | 57 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.3% | 46 |
| davidalves.Phoenix 0.54 | 3.2 | 13.3% | 42 |
| florent.XSeries.X2 0.12 | 3.3 | 13.2% | 34 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.8% | 17 |
| oog.melee.Corsair 1.0 | 6.2 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.4% | 8 |
| lunchie.Lunchbox 0.93 | 8.0 | 5.9% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 67.9 | 7 / 35 | 3748 |
| 2 | 1 | 64.6 | 76.2 | 15 / 35 | 4191 |
| 3 | 3 | 58.4 | 64.1 | 6 / 35 | 3314 |
| 4 | 1 | 63.7 | 74.6 | 11 / 35 | 4140 |
| 5 | 2 | 62.5 | 72.7 | 11 / 35 | 3849 |
| 6 | 2 | 62.2 | 71.7 | 7 / 35 | 4071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 25 | 52% |
| rz.GlowBlowMelee 1.4 | 23 | 52% |
| pedersen.Ugluk 1.1.1 | 14 | 71% |
| stelo.SoJNanoMelee 1.1 | 14 | 79% |
| florent.XSeries.X2 0.12 | 11 | 64% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 26% | 56 |
| davidalves.Phoenix 0.54 | 35 | 23% | 46 |
| florent.XSeries.X2 0.12 | 29 | 19% | 44 |
| pedersen.Ugluk 1.1.1 | 21 | 14% | 24 |
| oog.melee.Corsair 1.0 | 12 | 8% | 21 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 8 |
| evd.X1 0.01 | 6 | 4% | 5 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 6 |

## Melee bench: F25

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.1 | 120 / 210 | 2.52 | 17.8% | 25863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.8% | 120 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.8% | 20 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 13.0% | 20 |
| jdw.Hurricane 1.4 | 3.3 | 11.9% | 30 |
| ds.Oo 2.2 | 5.5 | 8.8% | 4 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.3% | 11 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.3% | 2 |
| adt.Ar2 1.1 | 7.8 | 7.0% | 2 |
| awesomeness.Elite 1.0 | 8.3 | 6.8% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 22 / 35 | 4362 |
| 2 | 1 | 67.5 | 86.3 | 21 / 35 | 4285 |
| 3 | 1 | 67.3 | 83.8 | 20 / 35 | 4275 |
| 4 | 1 | 67.2 | 84.1 | 21 / 35 | 4400 |
| 5 | 1 | 65.1 | 77.5 | 18 / 35 | 4061 |
| 6 | 1 | 66.8 | 82.2 | 18 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 89% |
| jdw.Hurricane 1.4 | 34 | 74% |
| voidious.micro.BlitzBat 1.05 | 34 | 85% |
| ds.Oo 2.2 | 8 | 88% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 3 | 67% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 577. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 20 | 22% | 54 |
| jdw.Hurricane 1.4 | 18 | 20% | 43 |
| voidious.micro.BlitzBat 1.05 | 18 | 20% | 40 |
| ds.Oo 2.2 | 7 | 8% | 20 |
| gre.svman4.Morfeas 1.4.1 | 7 | 8% | 14 |
| adt.Ar2 1.1 | 7 | 8% | 10 |
| gjr.Cephalosporin 0.1 | 5 | 5% | 16 |
| awesomeness.Elite 1.0 | 5 | 5% | 9 |
| amk.ChumbaMini 0.2 | 4 | 4% | 4 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.5 | 116 / 210 | 2.12 | 18.9% | 34795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.9% | 116 |
| ak.Fermat 2.0 | 2.0 | 15.5% | 44 |
| shu.nitro.LENIN .T34 | 3.3 | 12.2% | 19 |
| lrem.Spectre 0.4.4 | 3.7 | 12.3% | 17 |
| js.PinBall 1.6 | 5.2 | 10.2% | 6 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.5% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.0% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.3% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.0 | 20 / 35 | 5523 |
| 2 | 1 | 68.6 | 84.1 | 19 / 35 | 5663 |
| 3 | 1 | 70.1 | 90.5 | 22 / 35 | 5908 |
| 4 | 1 | 69.3 | 86.7 | 18 / 35 | 5976 |
| 5 | 1 | 69.5 | 87.0 | 15 / 35 | 6291 |
| 6 | 1 | 69.7 | 89.8 | 22 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 47 | 85% |
| ak.Fermat 2.0 | 44 | 66% |
| lrem.Spectre 0.4.4 | 39 | 77% |
| js.PinBall 1.6 | 8 | 75% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 75% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 45 | 47% | 72 |
| lrem.Spectre 0.4.4 | 24 | 25% | 45 |
| shu.nitro.LENIN .T34 | 13 | 14% | 57 |
| js.PinBall 1.6 | 5 | 5% | 13 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 2 | 2% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 7 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.2 | 121 / 210 | 2.15 | 18.7% | 29848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.7% | 121 |
| mk.Alpha 0.2.1 | 2.0 | 13.4% | 37 |
| wee.Gem 1.8.4 | 3.5 | 11.3% | 31 |
| EH.Eagle 1.0.6 | 4.3 | 10.8% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 10.1% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.9% | 1 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.9% | 3 |
| joe.ADinosaur 1.0 | 7.5 | 7.7% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.1% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.8 | 21 / 35 | 5067 |
| 2 | 1 | 68.6 | 78.4 | 18 / 35 | 6029 |
| 3 | 1 | 68.4 | 91.4 | 20 / 35 | 4722 |
| 4 | 1 | 67.7 | 86.7 | 19 / 35 | 4784 |
| 5 | 1 | 68.2 | 87.9 | 21 / 35 | 4678 |
| 6 | 1 | 67.8 | 88.9 | 22 / 35 | 4568 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 79% |
| wee.Gem 1.8.4 | 35 | 57% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 95% |
| EH.Eagle 1.0.6 | 15 | 100% |
| throxbot.ThroxBot 0.1 | 10 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 37 | 41% | 77 |
| wee.Gem 1.8.4 | 21 | 23% | 44 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 14% | 37 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 13 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| joe.ADinosaur 1.0 | 4 | 4% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 9 |
| EH.Eagle 1.0.6 | 2 | 2% | 19 |
| cs.Grudge 1.0 | 1 | 1% | 0 |

## Melee bench: F28

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.1 | 126 / 210 | 2.07 | 18.7% | 27939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.7% | 126 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 36 |
| uji.Antique 1.0 | 3.2 | 12.1% | 20 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.2% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 3 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.1% | 5 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.7% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 2 |
| stelo.PianistNano 1.2 | 9.0 | 5.6% | 2 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.9 | 17 / 35 | 4569 |
| 2 | 1 | 69.7 | 91.7 | 23 / 35 | 4849 |
| 3 | 1 | 68.2 | 88.9 | 19 / 35 | 4675 |
| 4 | 1 | 68.2 | 87.0 | 24 / 35 | 4670 |
| 5 | 1 | 69.3 | 91.4 | 26 / 35 | 4658 |
| 6 | 1 | 67.3 | 86.7 | 17 / 35 | 4518 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 78 | 76% |
| uji.Antique 1.0 | 45 | 87% |
| qohnil.blot.BlotBot 3.61 | 17 | 76% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 4 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 50% |

Hadur died in 85 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 38% | 81 |
| pfvicm.Sobieski 7.2.3b | 15 | 18% | 20 |
| uji.Antique 1.0 | 13 | 15% | 43 |
| qohnil.blot.BlotBot 3.61 | 9 | 11% | 24 |
| ahr.ice.Ice 1.0.2 | 6 | 7% | 15 |
| amk.ChumbaWumba 0.3 | 6 | 7% | 13 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.4 | 98 / 210 | 2.68 | 17.9% | 29884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 17.9% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.1% | 51 |
| deewiant.Anomaly 0.2 | 2.8 | 14.1% | 35 |
| myl.micro.Troodon 1.10 | 4.0 | 12.4% | 12 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 8 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.7% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.8% | 1 |
| jangs.ns51 1.0 | 9.2 | 4.8% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 77.5 | 11 / 35 | 5044 |
| 2 | 1 | 68.4 | 83.8 | 19 / 35 | 4918 |
| 3 | 2 | 66.7 | 79.4 | 13 / 35 | 4803 |
| 4 | 1 | 68.6 | 85.4 | 18 / 35 | 5160 |
| 5 | 1 | 69.9 | 88.3 | 22 / 35 | 5306 |
| 6 | 1 | 65.3 | 74.0 | 15 / 35 | 4653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 51 | 69% |
| deewiant.Anomaly 0.2 | 42 | 69% |
| myl.micro.Troodon 1.10 | 17 | 94% |
| jok.PheonixM 0.1.2 | 8 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 2 | 50% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 42 | 38% | 71 |
| zyx.mega.YersiniaPestis 3.1 | 34 | 30% | 69 |
| jok.PheonixM 0.1.2 | 14 | 13% | 25 |
| myl.micro.Troodon 1.10 | 12 | 11% | 27 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 3 | 3% | 3 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 5 |

## Melee bench: F30

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 69.3 | 41 / 210 | 3.77 | 13.9% | 23053 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 2.2 | 13.9% | 41 |
| darkcanuck.B26354 1.06 | 2.7 | 13.8% | 46 |
| catcat20.Matcha 0.006 | 2.8 | 13.9% | 49 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.2% | 31 |
| oog.melee.Capulet 1.2 | 4.0 | 13.0% | 31 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.3% | 7 |
| ntc.Opposite 1.5 | 7.5 | 7.5% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.2% | 3 |
| tripphippy.Alice 1.1 | 8.3 | 7.0% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.5 | 67.6 | 7 / 35 | 3674 |
| 2 | 1 | 62.2 | 73.0 | 9 / 35 | 3809 |
| 3 | 1 | 62.9 | 72.1 | 12 / 35 | 4138 |
| 4 | 4 | 59.6 | 65.7 | 3 / 35 | 3951 |
| 5 | 1 | 61.2 | 71.1 | 8 / 35 | 3658 |
| 6 | 4 | 59.3 | 66.0 | 2 / 35 | 3823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 21 | 43% |
| catcat20.Matcha 0.006 | 19 | 47% |
| oog.melee.Capulet 1.2 | 18 | 56% |
| stelo.PastFuture 2.3.2 | 8 | 75% |
| tripphippy.Alice 1.1 | 3 | 100% |
| intruder.PrairieWolf 2.61 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 38 | 22% | 46 |
| stelo.PastFuture 2.3.2 | 37 | 22% | 41 |
| catcat20.Matcha 0.006 | 33 | 19% | 47 |
| oog.melee.Capulet 1.2 | 26 | 15% | 34 |
| intruder.PrairieWolf 2.61 | 11 | 6% | 13 |
| ntc.Opposite 1.5 | 11 | 6% | 12 |
| tripphippy.Alice 1.1 | 8 | 5% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 70.9 | 56 / 210 | 3.62 | 14.2% | 21462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.2% | 90 |
| hadur117.mini.DeiseD 0.3 | 2.2 | 14.2% | 56 |
| gh.mini.Griezel 0.2 | 2.8 | 13.1% | 37 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.8% | 15 |
| spinnercat.micro.Tyger 0.1 | 4.8 | 10.9% | 7 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.2% | 4 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.4% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.4% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 70.5 | 10 / 35 | 3476 |
| 2 | 2 | 61.5 | 68.6 | 11 / 35 | 3643 |
| 3 | 2 | 62.4 | 74.0 | 8 / 35 | 3723 |
| 4 | 3 | 60.6 | 67.6 | 9 / 35 | 3510 |
| 5 | 2 | 62.5 | 75.6 | 9 / 35 | 3474 |
| 6 | 2 | 60.8 | 69.2 | 9 / 35 | 3636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 46 | 48% |
| gh.mini.Griezel 0.2 | 22 | 59% |
| d414.nano.Quantum 1.0.0 | 19 | 63% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 45 | 29% | 66 |
| gh.mini.Griezel 0.2 | 35 | 23% | 49 |
| spinnercat.micro.Tyger 0.1 | 22 | 14% | 28 |
| d414.nano.Quantum 1.0.0 | 20 | 13% | 33 |
| fm.mammillarias 1.3 | 9 | 6% | 9 |
| timmit.nano.TimDog 0.33 | 8 | 5% | 9 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 4% | 7 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.0 | 132 / 210 | 2.08 | 18.9% | 30368 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.9% | 132 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 39 |
| apc.botM 3.0 | 3.0 | 11.9% | 20 |
| lxx.ConceptA 0.8 | 4.0 | 10.5% | 2 |
| bayen.UbaMicro 1.4 | 5.5 | 9.1% | 4 |
| vjik.UnViolation 1.1 | 5.5 | 9.1% | 7 |
| panzer.Panzer 0.2 | 7.2 | 7.8% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.6% | 3 |
| conscience.Electron 1.3g | 8.8 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.7 | 25 / 35 | 5377 |
| 2 | 1 | 66.7 | 83.2 | 20 / 35 | 4899 |
| 3 | 1 | 66.4 | 82.2 | 20 / 35 | 4822 |
| 4 | 1 | 69.1 | 89.8 | 23 / 35 | 5169 |
| 5 | 1 | 68.8 | 89.5 | 23 / 35 | 5252 |
| 6 | 1 | 68.3 | 89.5 | 21 / 35 | 4849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 71 | 70% |
| apc.botM 3.0 | 26 | 92% |
| lxx.ConceptA 0.8 | 23 | 100% |
| yk.JahMicro 1.0 | 10 | 100% |
| bayen.UbaMicro 1.4 | 10 | 80% |
| vjik.UnViolation 1.1 | 7 | 100% |
| donjezza.Jezza 1.0 | 6 | 83% |
| conscience.Electron 1.3g | 3 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 672. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 33 | 42% | 92 |
| apc.botM 3.0 | 15 | 19% | 40 |
| lxx.ConceptA 0.8 | 13 | 17% | 23 |
| bayen.UbaMicro 1.4 | 7 | 9% | 18 |
| panzer.Panzer 0.2 | 4 | 5% | 6 |
| vjik.UnViolation 1.1 | 3 | 4% | 16 |
| conscience.Electron 1.3g | 3 | 4% | 7 |
| yk.JahMicro 1.0 | 0 | 0% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.8 | 110 / 210 | 2.46 | 18.3% | 30370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.3 | 18.3% | 110 |
| maribo.Quester 0.3 | 1.7 | 16.3% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 20 |
| labg.Cataclysm 2.05 | 4.0 | 11.2% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.4% | 9 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.2% | 3 |
| zyx.micro.Ant 1.1 | 8.2 | 5.5% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.3% | 0 |
| sanja.First 0.1 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.7 | 20 / 35 | 4853 |
| 2 | 1 | 68.2 | 83.8 | 18 / 35 | 5185 |
| 3 | 1 | 69.4 | 89.2 | 21 / 35 | 5084 |
| 4 | 2 | 66.6 | 80.0 | 14 / 35 | 4979 |
| 5 | 2 | 66.4 | 78.4 | 16 / 35 | 4668 |
| 6 | 1 | 69.6 | 85.7 | 21 / 35 | 5601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 54 | 74% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 76% |
| gre.svman4.Leonidas 1.3.2 | 27 | 100% |
| labg.Cataclysm 2.05 | 16 | 56% |
| baal.nano.N 1.42 | 3 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 50% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 38 | 38% | 84 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 18% | 48 |
| labg.Cataclysm 2.05 | 13 | 13% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 10% | 11 |
| gre.svman4.Leonidas 1.3.2 | 8 | 8% | 24 |
| zyx.micro.Ant 1.1 | 8 | 8% | 9 |
| baal.nano.N 1.42 | 3 | 3% | 8 |
| sanja.First 0.1 | 2 | 2% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.1 | 74 / 210 | 2.52 | 17.3% | 30234 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.8 | 17.3% | 74 |
| stelo.Spread 0.9 | 2.0 | 16.7% | 74 |
| kid.Gladiator .7.2 | 2.2 | 16.0% | 48 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 8 |
| tcf.Reach 3 | 4.7 | 10.7% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 1 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 79.4 | 11 / 35 | 4741 |
| 2 | 2 | 66.5 | 81.6 | 10 / 35 | 4845 |
| 3 | 3 | 66.1 | 80.6 | 11 / 35 | 4476 |
| 4 | 1 | 68.8 | 87.6 | 17 / 35 | 5028 |
| 5 | 2 | 66.4 | 79.7 | 6 / 35 | 5247 |
| 6 | 1 | 70.7 | 89.8 | 19 / 35 | 5897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 70 | 47% |
| kid.Gladiator .7.2 | 33 | 48% |
| jcs.Seth 1.8 | 17 | 94% |
| tcf.Reach 3 | 4 | 100% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 65 | 48% | 94 |
| kid.Gladiator .7.2 | 50 | 37% | 63 |
| jcs.Seth 1.8 | 10 | 7% | 30 |
| tcf.Reach 3 | 6 | 4% | 13 |
| ratosh.Wesco 1.4 | 2 | 1% | 6 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| cli.Dancer 1.1 | 1 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 77.3 | 35 / 210 | 3.04 | 15.0% | 22929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 150 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 15.0% | 35 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.1% | 16 |
| rz.HawkOnFire 0.1 | 4.2 | 11.5% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.4% | 4 |
| wit.Chuliath 1.0 | 6.3 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.1% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 76.5 | 5 / 35 | 3856 |
| 2 | 2 | 63.9 | 78.1 | 8 / 35 | 3921 |
| 3 | 2 | 63.2 | 77.1 | 5 / 35 | 3891 |
| 4 | 2 | 63.6 | 78.4 | 5 / 35 | 3711 |
| 5 | 2 | 63.6 | 78.1 | 5 / 35 | 3842 |
| 6 | 2 | 63.0 | 75.6 | 7 / 35 | 3708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 78 | 18% |
| gh.mini.Gruwel 0.9 | 17 | 71% |
| rz.HawkOnFire 0.1 | 6 | 67% |
| dmh.robocode.robot.BlackDeath 9.2 | 4 | 75% |
| wit.Chuliath 1.0 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 90 | 51% | 102 |
| gh.mini.Gruwel 0.9 | 34 | 19% | 46 |
| rz.HawkOnFire 0.1 | 20 | 11% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 11% | 24 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 5% | 8 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 90.6 | 156 / 210 | 1.84 | 20.5% | 33517 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.5% | 156 |
| alpha.RainingFire 1.0 | 2.7 | 12.5% | 16 |
| bzdp.Pansy 2.1 | 2.8 | 12.4% | 13 |
| bvh.micro.Freya 0.3 | 3.8 | 10.9% | 13 |
| mz.Cork 0.1 | 5.3 | 9.8% | 3 |
| m3thos.Eva02 0.7.1 | 6.2 | 8.8% | 4 |
| bvh.mini.Fenrir 0.39 | 6.2 | 9.1% | 1 |
| dl.BetterWalls 1.0 | 8.0 | 6.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 25 / 35 | 5473 |
| 2 | 1 | 68.4 | 85.4 | 22 / 35 | 5046 |
| 3 | 1 | 71.2 | 92.7 | 28 / 35 | 5629 |
| 4 | 1 | 70.3 | 88.9 | 26 / 35 | 5630 |
| 5 | 1 | 71.9 | 95.9 | 27 / 35 | 5837 |
| 6 | 1 | 71.3 | 91.7 | 28 / 35 | 5902 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 41 | 88% |
| bzdp.Pansy 2.1 | 40 | 93% |
| alpha.RainingFire 1.0 | 32 | 84% |
| bvh.mini.Fenrir 0.39 | 23 | 100% |
| mz.Cork 0.1 | 21 | 100% |
| m3thos.Eva02 0.7.1 | 6 | 83% |
| dl.BetterWalls 1.0 | 5 | 80% |
| sample.MyFirstRobot 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 33% | 45 |
| bvh.micro.Freya 0.3 | 12 | 22% | 36 |
| bzdp.Pansy 2.1 | 10 | 19% | 58 |
| mz.Cork 0.1 | 4 | 7% | 22 |
| bvh.mini.Fenrir 0.39 | 4 | 7% | 22 |
| m3thos.Eva02 0.7.1 | 4 | 7% | 15 |
| dl.BetterWalls 1.0 | 1 | 2% | 6 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 93.7 | 172 / 210 | 1.57 | 20.1% | 33816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.1% | 172 |
| germ.TheMind .2 | 2.8 | 10.7% | 9 |
| stelo.UntouchableNano 1.3 | 4.2 | 9.7% | 11 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.3 | 9.5% | 2 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 2 |
| agrach.Dalek 1.0 | 6.0 | 8.9% | 4 |
| lmk.ACPFinal 0.1 | 7.7 | 8.2% | 3 |
| mb.Beast 0.1 | 8.0 | 7.8% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.8% | 0 |
| skm.Ryubot 1.0 | 8.5 | 7.9% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 90.8 | 28 / 35 | 5874 |
| 2 | 1 | 70.3 | 95.2 | 30 / 35 | 5838 |
| 3 | 1 | 69.2 | 94.9 | 29 / 35 | 5219 |
| 4 | 1 | 69.6 | 95.6 | 29 / 35 | 5387 |
| 5 | 1 | 69.8 | 95.2 | 30 / 35 | 5649 |
| 6 | 1 | 69.0 | 90.5 | 26 / 35 | 5849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 37 | 92% |
| stelo.UntouchableNano 1.3 | 33 | 85% |
| EBBU.Sim2 1.02 | 25 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 100% |
| agrach.Dalek 1.0 | 19 | 100% |
| lmk.ACPFinal 0.1 | 17 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| skm.Ryubot 1.0 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 509. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 21% | 38 |
| germ.TheMind .2 | 6 | 16% | 29 |
| EBBU.Sim2 1.02 | 6 | 16% | 26 |
| lmk.ACPFinal 0.1 | 6 | 16% | 25 |
| agrach.Dalek 1.0 | 5 | 13% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 8 |
| mb.Beast 0.1 | 2 | 5% | 18 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 28 |
| skm.Ryubot 1.0 | 1 | 3% | 4 |

## Melee bench: F38

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.1 | 85 / 210 | 2.79 | 16.5% | 25986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.3 | 16.5% | 85 |
| justin.Mallais 14.0 | 1.7 | 15.2% | 59 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 12 |
| bts.mega.Gnarly 1.4 | 3.8 | 12.3% | 29 |
| cs.Wren 1.0 | 5.7 | 10.7% | 6 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 10.3% | 13 |
| kdf.KoulDestroyer 1.0 | 6.5 | 8.9% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.5% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.9 | 15 / 35 | 4051 |
| 2 | 1 | 65.8 | 81.0 | 14 / 35 | 4471 |
| 3 | 1 | 67.2 | 85.1 | 17 / 35 | 4497 |
| 4 | 2 | 63.0 | 72.7 | 11 / 35 | 3982 |
| 5 | 2 | 64.9 | 77.5 | 12 / 35 | 4517 |
| 6 | 1 | 66.6 | 82.5 | 16 / 35 | 4468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 35 | 66% |
| bts.mega.Gnarly 1.4 | 25 | 72% |
| bvh.mini.Freya 0.55 | 16 | 88% |
| cs.Wren 1.0 | 14 | 93% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 667. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 35 | 28% | 61 |
| bts.mega.Gnarly 1.4 | 30 | 24% | 46 |
| bvh.mini.Freya 0.55 | 23 | 18% | 31 |
| cs.Wren 1.0 | 15 | 12% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 10% | 34 |
| kdf.KoulDestroyer 1.0 | 9 | 7% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 4 |

## Melee bench: F39

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.0 | 93 / 210 | 2.53 | 17.5% | 30566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.5% | 93 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 29 |
| az.Ololobot 0.2.4 | 3.3 | 12.5% | 50 |
| catcat20.Lambda 0.024 | 3.7 | 11.6% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 8.4% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.0% | 0 |
| gimp.GimpBot 0.1 | 6.5 | 8.1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.3 | 7.6% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.1% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.3 | 16 / 35 | 4981 |
| 2 | 1 | 67.2 | 84.1 | 15 / 35 | 5377 |
| 3 | 1 | 65.2 | 81.0 | 14 / 35 | 4801 |
| 4 | 1 | 67.5 | 87.0 | 18 / 35 | 5262 |
| 5 | 1 | 65.4 | 78.4 | 14 / 35 | 5003 |
| 6 | 1 | 67.3 | 86.0 | 16 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 34 | 59% |
| bvh.fry.Freya 0.82 | 34 | 82% |
| catcat20.Lambda 0.024 | 33 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 50 | 43% | 79 |
| az.Ololobot 0.2.4 | 27 | 23% | 53 |
| catcat20.Lambda 0.024 | 17 | 15% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 8% | 12 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 7 |
| gimp.GimpBot 0.1 | 5 | 4% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 3 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.2 | 112 / 210 | 2.51 | 18.2% | 30210 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.2% | 112 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 44 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.4% | 17 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.9% | 11 |
| mz.AntiGrav 1.0 | 4.7 | 10.8% | 7 |
| alpha.BlackIce 1.0 | 6.0 | 9.4% | 6 |
| stelo.Randomness 1.0 | 6.3 | 9.2% | 12 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 5.2% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 5.5% | 0 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 78.1 | 18 / 35 | 4929 |
| 2 | 1 | 66.3 | 81.3 | 16 / 35 | 4455 |
| 3 | 1 | 69.3 | 87.9 | 23 / 35 | 4960 |
| 4 | 1 | 70.0 | 89.2 | 19 / 35 | 5806 |
| 5 | 1 | 68.9 | 84.8 | 22 / 35 | 5287 |
| 6 | 1 | 65.5 | 78.1 | 14 / 35 | 4773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 76% |
| kano.gamma.KanoGamma 1.8 | 33 | 85% |
| Polkwane.SmashMelee 1.0 | 18 | 89% |
| mz.AntiGrav 1.0 | 17 | 100% |
| stelo.Randomness 1.0 | 12 | 75% |
| alpha.BlackIce 1.0 | 6 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 33% | 62 |
| kano.gamma.KanoGamma 1.8 | 18 | 18% | 43 |
| stelo.Randomness 1.0 | 14 | 14% | 26 |
| mz.AntiGrav 1.0 | 11 | 11% | 27 |
| Polkwane.SmashMelee 1.0 | 11 | 11% | 23 |
| alpha.BlackIce 1.0 | 6 | 6% | 16 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.0 | 85 / 210 | 2.62 | 16.8% | 26163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.5 | 16.8% | 85 |
| eem.EvBotNG v12.8 | 1.7 | 16.5% | 84 |
| ary.Swarm 1.1 | 3.2 | 13.6% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.8% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.2% | 9 |
| shrub.Silver v048 | 6.2 | 8.3% | 0 |
| zyx.nano.Ant 1.1 | 6.8 | 7.3% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 76.2 | 11 / 35 | 4269 |
| 2 | 1 | 66.2 | 82.2 | 15 / 35 | 4346 |
| 3 | 1 | 67.0 | 84.8 | 16 / 35 | 4421 |
| 4 | 2 | 65.6 | 80.0 | 12 / 35 | 4061 |
| 5 | 1 | 68.8 | 88.9 | 17 / 35 | 5021 |
| 6 | 2 | 65.9 | 79.7 | 14 / 35 | 4045 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 41% |
| ary.Swarm 1.1 | 28 | 79% |
| lessonz.robocode.Oz 0.5.0 | 19 | 79% |
| simonton.nano.MeleeSeed 1.8 | 18 | 89% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| shrub.Silver v048 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 57 | 45% | 84 |
| ary.Swarm 1.1 | 21 | 17% | 42 |
| lessonz.robocode.Oz 0.5.0 | 18 | 14% | 33 |
| simonton.nano.MeleeSeed 1.8 | 15 | 12% | 31 |
| zyx.nano.Ant 1.1 | 5 | 4% | 5 |
| shrub.Silver v048 | 4 | 3% | 7 |
| jsal.Jsalbot 1.0 | 3 | 2% | 5 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.0 | 106 / 210 | 2.35 | 18.5% | 33792 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.5% | 106 |
| wompi.Wallaby 5.1 | 2.0 | 15.8% | 50 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.4% | 24 |
| ara.Shera 0.88 | 3.5 | 13.1% | 26 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 1 |
| dsw.StaticD 1.0 | 6.3 | 7.1% | 2 |
| maribo.IotaCT 1.1 | 7.2 | 6.9% | 0 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.5 | 22 / 35 | 5747 |
| 2 | 1 | 67.7 | 82.9 | 14 / 35 | 5730 |
| 3 | 1 | 68.9 | 87.3 | 19 / 35 | 5649 |
| 4 | 1 | 67.9 | 84.8 | 17 / 35 | 5358 |
| 5 | 1 | 67.4 | 81.3 | 16 / 35 | 5526 |
| 6 | 1 | 68.2 | 83.5 | 18 / 35 | 5782 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 50 | 86% |
| maribo.mini.MiniQuester 0.1 | 44 | 77% |
| ara.Shera 0.88 | 32 | 66% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 38 | 36% | 56 |
| wompi.Wallaby 5.1 | 30 | 29% | 78 |
| maribo.mini.MiniQuester 0.1 | 25 | 24% | 57 |
| amz.NanoClone 1.41 | 6 | 6% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 2 |
| dsw.StaticD 1.0 | 1 | 1% | 5 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 67.7 | 18 / 210 | 3.90 | 13.3% | 22345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 153 |
| brainfade.melee.Dusk 0.44 | 2.7 | 13.1% | 22 |
| hadur117.mini.DeiseD 0.3 | 2.8 | 13.3% | 18 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.2% | 9 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.4% | 6 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 1 |
| mz.NanoGod 2.02 | 7.2 | 7.8% | 1 |
| jab.DiamondStealer 5 | 7.8 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.6 | 70.2 | 3 / 35 | 3875 |
| 2 | 3 | 59.1 | 62.5 | 1 / 35 | 3447 |
| 3 | 3 | 61.7 | 66.7 | 6 / 35 | 3706 |
| 4 | 2 | 61.9 | 68.3 | 3 / 35 | 3962 |
| 5 | 4 | 61.1 | 67.0 | 1 / 35 | 3640 |
| 6 | 2 | 62.7 | 71.7 | 4 / 35 | 3715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 53 | 19% |
| brainfade.melee.Dusk 0.44 | 7 | 71% |
| dummy.micro.Sparrow 2.5 | 2 | 50% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 0% |

Hadur died in 192 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 42% | 92 |
| brainfade.melee.Dusk 0.44 | 28 | 15% | 31 |
| dummy.micro.Sparrow 2.5 | 28 | 15% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 26 | 14% | 27 |
| Krabb.akim2.Akim2 1.1b | 14 | 7% | 16 |
| jab.DiamondStealer 5 | 8 | 4% | 8 |
| mz.NanoGod 2.02 | 7 | 4% | 7 |

## Melee bench: F44

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 85.4 | 114 / 210 | 2.31 | 18.9% | 33356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.9% | 114 |
| stelo.Liblix 0.3.1 | 2.0 | 15.6% | 57 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 28 |
| wompi.Quokka 1.6 | 4.2 | 9.9% | 5 |
| jwirde.Gort 2.0 | 5.3 | 9.1% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.1% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.2% | 1 |
| disan.Chair 2.2.0 | 7.5 | 7.2% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.6 | 18 / 35 | 5633 |
| 2 | 1 | 65.8 | 77.1 | 16 / 35 | 4918 |
| 3 | 1 | 69.5 | 88.6 | 19 / 35 | 5799 |
| 4 | 1 | 69.2 | 87.6 | 19 / 35 | 5526 |
| 5 | 1 | 69.9 | 87.9 | 21 / 35 | 5824 |
| 6 | 1 | 70.1 | 89.5 | 21 / 35 | 5656 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 62 | 73% |
| tzu.TheArtOfWar 1.2 | 45 | 76% |
| wompi.Quokka 1.6 | 11 | 91% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 46% | 97 |
| tzu.TheArtOfWar 1.2 | 29 | 30% | 60 |
| jwirde.Gort 2.0 | 6 | 6% | 11 |
| wompi.Quokka 1.6 | 5 | 5% | 10 |
| stf.PanzerGeneral 0.1 | 5 | 5% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 4% | 11 |
| disan.Chair 2.2.0 | 3 | 3% | 10 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |

## Melee bench: F45

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 87.6 | 85 / 210 | 2.12 | 20.0% | 38653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.0% | 85 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.1% | 105 |
| jje.BagPuss 1.2 | 3.0 | 11.7% | 5 |
| sul.Lunar 1.1 | 4.5 | 10.1% | 8 |
| myl.nano.Graviton 1.10 | 5.2 | 9.5% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 6.0 | 8.8% | 4 |
| fm.claire 1.7 | 6.8 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.7 | 7.5% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.4 | 6 / 35 | 6412 |
| 2 | 1 | 69.3 | 86.3 | 13 / 35 | 6405 |
| 3 | 1 | 70.3 | 89.2 | 18 / 35 | 6360 |
| 4 | 1 | 70.8 | 92.1 | 18 / 35 | 6357 |
| 5 | 1 | 69.2 | 85.4 | 16 / 35 | 6195 |
| 6 | 1 | 70.5 | 87.9 | 14 / 35 | 6924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 111 | 29% |
| sul.Lunar 1.1 | 16 | 100% |
| jje.BagPuss 1.2 | 15 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 100% |
| myl.nano.Graviton 1.10 | 5 | 100% |
| fm.claire 1.7 | 2 | 100% |
| wit.Deep7 2.0 | 2 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 2176. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 78 | 62% | 0 |
| jje.BagPuss 1.2 | 12 | 10% | 55 |
| myl.nano.Graviton 1.10 | 10 | 8% | 34 |
| fm.claire 1.7 | 8 | 6% | 9 |
| sul.Lunar 1.1 | 7 | 6% | 60 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 29 |
| hvilela.HVilela 0.9 | 4 | 3% | 8 |
| wit.Deep7 2.0 | 2 | 2% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

## Melee bench: F46

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.9 | 57 / 210 | 2.63 | 16.3% | 27174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 80 |
| kc.mini.Mirage 0.2 | 2.0 | 16.5% | 60 |
| hadur117.mini.DeiseD 0.3 | 2.2 | 16.3% | 57 |
| cx.Princess 1.0 | 4.5 | 10.3% | 12 |
| mz.MicroSheep 1.0 | 4.7 | 10.4% | 4 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.4% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 82.2 | 12 / 35 | 4441 |
| 2 | 2 | 66.4 | 85.1 | 9 / 35 | 4725 |
| 3 | 1 | 66.4 | 81.6 | 11 / 35 | 4930 |
| 4 | 3 | 64.2 | 77.8 | 5 / 35 | 4395 |
| 5 | 2 | 66.5 | 85.1 | 9 / 35 | 4404 |
| 6 | 3 | 65.1 | 79.7 | 11 / 35 | 4279 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 48% |
| rsalesc.melee.Medina 0.4.5 | 45 | 29% |
| mz.MicroSheep 1.0 | 13 | 92% |
| cx.Princess 1.0 | 12 | 50% |
| mbro.Detektor3 0.1.1 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 39% | 90 |
| rsalesc.melee.Medina 0.4.5 | 59 | 38% | 70 |
| cx.Princess 1.0 | 12 | 8% | 17 |
| sadoner.killer 0.2 | 8 | 5% | 9 |
| mz.MicroSheep 1.0 | 7 | 4% | 17 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
4 death(s) with no robot to name.

