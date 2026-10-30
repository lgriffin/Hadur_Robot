# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.3 | 50 / 210 | 2.23 | 17.1% | 28796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.9% | 148 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.1% | 50 |
| mz.MicroGodMelee 1 | 4.0 | 10.7% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.6% | 2 |
| lorneswork.Predator 1.0 | 4.8 | 9.3% | 2 |
| sgp.JollyNinja 3.53 | 5.3 | 9.5% | 5 |
| adt.Ar2 1.0 | 7.3 | 6.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.7 | 6.1% | 2 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 88.3 | 10 / 35 | 4947 |
| 2 | 2 | 67.3 | 87.6 | 9 / 35 | 4743 |
| 3 | 2 | 66.9 | 85.1 | 9 / 35 | 5047 |
| 4 | 2 | 66.2 | 84.4 | 8 / 35 | 4516 |
| 5 | 2 | 66.5 | 84.4 | 4 / 35 | 4716 |
| 6 | 2 | 67.0 | 87.9 | 10 / 35 | 4827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 139 | 13% |
| mz.MicroGodMelee 1 | 14 | 93% |
| sgp.JollyNinja 3.53 | 9 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 100% |
| lorneswork.Predator 1.0 | 4 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 0% |

Hadur died in 161 of 210 rounds, at a mean tick of 1322. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 128 | 80% | 148 |
| mz.MicroGodMelee 1 | 11 | 7% | 21 |
| sgp.JollyNinja 3.53 | 7 | 4% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 11 |
| lorneswork.Predator 1.0 | 4 | 2% | 10 |
| adt.Ar2 1.0 | 2 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.2 | 112 / 210 | 2.15 | 18.6% | 29237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.6% | 112 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.9% | 40 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.0% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 9.9% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.1% | 5 |
| Noran.BitchingElk 0.054 | 6.5 | 8.4% | 13 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.8% | 0 |
| sch.Simone 0.3d | 7.5 | 7.0% | 5 |
| stelo.PatternRobot 1.0 | 8.3 | 7.0% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.0 | 16 / 35 | 4650 |
| 2 | 1 | 68.9 | 90.2 | 19 / 35 | 4945 |
| 3 | 1 | 70.3 | 92.7 | 26 / 35 | 5206 |
| 4 | 1 | 68.7 | 88.9 | 20 / 35 | 5028 |
| 5 | 1 | 66.9 | 83.2 | 15 / 35 | 4812 |
| 6 | 1 | 67.1 | 87.3 | 16 / 35 | 4596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 62 | 76% |
| pulsar.PulsarMax 0.8.9 | 36 | 58% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 80% |
| Noran.BitchingElk 0.054 | 14 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| stelo.PatternRobot 1.0 | 7 | 86% |
| sch.Simone 0.3d | 5 | 80% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 32 | 33% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 23% | 71 |
| Noran.BitchingElk 0.054 | 13 | 13% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 10% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 20 |
| stelo.PatternRobot 1.0 | 6 | 6% | 10 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 8 |
| sch.Simone 0.3d | 3 | 3% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.2 | 152 / 210 | 1.61 | 20.2% | 35941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.2% | 152 |
| vuen.Cake 2.51 | 2.8 | 13.3% | 29 |
| radnor.DoctorBob 1.42 | 3.0 | 13.1% | 13 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.2% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 2 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.8 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.3% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 26 / 35 | 6006 |
| 2 | 1 | 69.1 | 90.5 | 20 / 35 | 5745 |
| 3 | 1 | 70.8 | 95.9 | 25 / 35 | 5918 |
| 4 | 1 | 71.5 | 95.2 | 27 / 35 | 6506 |
| 5 | 1 | 70.4 | 94.0 | 29 / 35 | 5805 |
| 6 | 1 | 70.4 | 92.1 | 25 / 35 | 5961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 69 | 71% |
| kawigi.nano.Lib 1.0 | 51 | 96% |
| radnor.DoctorBob 1.42 | 39 | 95% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| adt.Ar1 2.1 | 5 | 80% |
| urdos.URDOS 1.3 | 5 | 80% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 24 | 41% | 75 |
| radnor.DoctorBob 1.42 | 17 | 29% | 43 |
| kawigi.nano.Lib 1.0 | 13 | 22% | 61 |
| urdos.URDOS 1.3 | 2 | 3% | 6 |
| adt.Ar1 2.1 | 2 | 3% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 5 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 10 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.7 | 32 / 210 | 2.29 | 17.1% | 31914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 172 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.1% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.0% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 0 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 87.0 | 3 / 35 | 5045 |
| 2 | 2 | 65.6 | 81.9 | 0 / 35 | 4860 |
| 3 | 2 | 67.6 | 85.7 | 6 / 35 | 5115 |
| 4 | 2 | 69.2 | 89.2 | 9 / 35 | 5802 |
| 5 | 2 | 67.7 | 85.4 | 6 / 35 | 5363 |
| 6 | 2 | 67.9 | 84.8 | 8 / 35 | 5729 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 17% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1473. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 150 | 84% | 177 |
| apc.LeeroyJenkins2 1.0 | 18 | 10% | 20 |
| josago.Jorgito 0.16 | 3 | 2% | 4 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 2 | 1% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 78.5 | 36 / 210 | 2.94 | 14.6% | 20848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.0% | 98 |
| justin.DemonicRage 3.4 | 1.7 | 17.0% | 65 |
| hadur117.mini.DeiseD 0.4 | 3.0 | 14.6% | 36 |
| wompi.Numbat 2.1 | 4.0 | 12.2% | 10 |
| ms.Ares 0.19 | 5.3 | 9.3% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 8.7% | 2 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.0 | 76.5 | 8 / 35 | 3675 |
| 2 | 3 | 63.5 | 78.7 | 9 / 35 | 3437 |
| 3 | 3 | 64.7 | 82.5 | 7 / 35 | 3563 |
| 4 | 3 | 61.6 | 76.8 | 2 / 35 | 3181 |
| 5 | 3 | 64.2 | 81.3 | 5 / 35 | 3836 |
| 6 | 3 | 61.3 | 74.9 | 5 / 35 | 3156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 24% |
| justin.DemonicRage 3.4 | 36 | 36% |
| wompi.Numbat 2.1 | 13 | 69% |
| axeBots.HataMoto 3.09 | 3 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 69 | 39% | 83 |
| justin.DemonicRage 3.4 | 65 | 37% | 76 |
| wompi.Numbat 2.1 | 25 | 14% | 32 |
| axeBots.HataMoto 3.09 | 7 | 4% | 9 |
| ms.Ares 0.19 | 4 | 2% | 6 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.3 | 114 / 210 | 2.23 | 18.1% | 27906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.1% | 114 |
| jekl.StoneGhost 0.7 | 2.3 | 14.6% | 21 |
| origin.SleepSiphon 1.7b | 2.7 | 13.9% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.8% | 21 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.3% | 2 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.5% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.4 | 22 / 35 | 4764 |
| 2 | 1 | 68.6 | 88.9 | 22 / 35 | 4892 |
| 3 | 1 | 69.3 | 89.8 | 25 / 35 | 4689 |
| 4 | 1 | 65.3 | 80.0 | 12 / 35 | 4314 |
| 5 | 1 | 66.6 | 81.3 | 14 / 35 | 4740 |
| 6 | 1 | 67.6 | 86.7 | 19 / 35 | 4507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 53 | 92% |
| origin.SleepSiphon 1.7b | 41 | 56% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 75% |
| gg.Wolverine 2.0 | 10 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 37% | 70 |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 27% | 48 |
| jekl.StoneGhost 0.7 | 19 | 19% | 50 |
| mld.Wisdom 1.0 | 7 | 7% | 15 |
| gg.Wolverine 2.0 | 3 | 3% | 9 |
| spinnercat.Omen 1.0 | 2 | 2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 7 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
| sample.Fire 1.0 | 0 | 0% | 2 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.7 | 125 / 210 | 1.57 | 19.7% | 33034 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 19.7% | 125 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.4% | 46 |
| rtk.Tachikoma 1.0 | 2.8 | 16.3% | 27 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.3% | 3 |
| franzor.Lizt 1.3.1 | 5.0 | 10.2% | 9 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.7 | 18 / 35 | 5516 |
| 2 | 1 | 71.4 | 94.9 | 25 / 35 | 5435 |
| 3 | 1 | 71.6 | 93.7 | 23 / 35 | 5717 |
| 4 | 1 | 71.8 | 94.6 | 21 / 35 | 5781 |
| 5 | 2 | 69.9 | 92.7 | 15 / 35 | 4954 |
| 6 | 1 | 71.7 | 93.3 | 23 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 94 | 81% |
| rsalesc.melee.Monk 0.3.6c | 44 | 18% |
| oog.melee.CapuletDroid 1.1 | 32 | 97% |
| franzor.Lizt 1.3.1 | 13 | 54% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 47 | 55% | 67 |
| rtk.Tachikoma 1.0 | 31 | 36% | 107 |
| franzor.Lizt 1.3.1 | 6 | 7% | 1 |
| oog.melee.CapuletDroid 1.1 | 1 | 1% | 24 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.6 | 125 / 210 | 2.02 | 18.8% | 29298 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 125 |
| shrub.Vapour v159 | 2.5 | 13.0% | 24 |
| tm.Yuugao 1.0 | 2.8 | 12.3% | 31 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.6% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.0% | 12 |
| m3thos.Eva00 1.1 | 6.3 | 8.4% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.0% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.4% | 0 |
| SHAM.WOW 1.4 | 9.3 | 6.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.1 | 20 / 35 | 4857 |
| 2 | 1 | 68.7 | 89.8 | 23 / 35 | 4751 |
| 3 | 1 | 68.9 | 92.7 | 22 / 35 | 4799 |
| 4 | 1 | 67.4 | 85.1 | 22 / 35 | 4897 |
| 5 | 1 | 66.1 | 85.7 | 14 / 35 | 4559 |
| 6 | 1 | 70.0 | 93.3 | 24 / 35 | 5435 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 84% |
| shrub.Vapour v159 | 42 | 64% |
| Krabb.sliNk.Garm 0.9u | 30 | 73% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 89% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 27 | 30% | 57 |
| tm.Yuugao 1.0 | 19 | 21% | 62 |
| Krabb.sliNk.Garm 0.9u | 17 | 19% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 11% | 25 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 8% | 17 |
| m3thos.Eva00 1.1 | 3 | 3% | 6 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 4 |
| SHAM.WOW 1.4 | 1 | 1% | 2 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 75.7 | 57 / 210 | 3.19 | 15.4% | 23930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 18.0% | 106 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.4% | 57 |
| kc.micro.Figment 1.0 | 2.8 | 13.9% | 24 |
| yagami.Tidus 0.11 | 4.2 | 10.9% | 2 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.8% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.6% | 7 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 3 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 74.9 | 9 / 35 | 3962 |
| 2 | 2 | 63.6 | 74.9 | 10 / 35 | 3994 |
| 3 | 2 | 62.7 | 73.7 | 8 / 35 | 3837 |
| 4 | 2 | 62.8 | 72.7 | 8 / 35 | 3759 |
| 5 | 2 | 63.5 | 76.8 | 7 / 35 | 3983 |
| 6 | 1 | 66.6 | 81.3 | 15 / 35 | 4395 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 49 | 27% |
| kc.micro.Figment 1.0 | 31 | 74% |
| mc2.enemy.Original 0.9 | 10 | 90% |
| pedersen.Grishnakh 1.0 | 6 | 83% |
| yagami.Tidus 0.11 | 5 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 67 | 44% | 81 |
| kc.micro.Figment 1.0 | 31 | 20% | 54 |
| yagami.Tidus 0.11 | 22 | 14% | 30 |
| mc2.enemy.Original 0.9 | 13 | 8% | 23 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 13 |
| dft.Calliope 5.6 | 4 | 3% | 5 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
| robar.nano.Assertive_Melee 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.7 | 168 / 210 | 1.48 | 20.3% | 32625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.3% | 168 |
| DTF.Kludgy 1.2b | 2.0 | 14.4% | 20 |
| ne.Chimera 1.2 | 3.5 | 12.3% | 5 |
| ejb.Polaris 1.0.1 | 3.8 | 12.1% | 8 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 6 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.0% | 1 |
| sam.Samspin 1.0 | 7.5 | 5.7% | 1 |
| kurios.DOSexe .9b | 7.8 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 5.0% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 94.6 | 28 / 35 | 5555 |
| 2 | 1 | 68.8 | 88.9 | 22 / 35 | 5317 |
| 3 | 1 | 71.6 | 97.8 | 31 / 35 | 5615 |
| 4 | 1 | 71.3 | 96.8 | 31 / 35 | 5469 |
| 5 | 1 | 71.6 | 97.1 | 29 / 35 | 5602 |
| 6 | 1 | 69.7 | 92.7 | 27 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 63 | 83% |
| ejb.Polaris 1.0.1 | 50 | 94% |
| ne.Chimera 1.2 | 29 | 93% |
| vStar.RAFzilla 2.15 | 17 | 88% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 7 | 86% |
| kurios.DOSexe .9b | 6 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 17 | 40% | 67 |
| ejb.Polaris 1.0.1 | 9 | 21% | 48 |
| vStar.RAFzilla 2.15 | 6 | 14% | 14 |
| ne.Chimera 1.2 | 5 | 12% | 38 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 12 |
| donjezza.Muncho 1.0 | 2 | 5% | 9 |
| sam.Samspin 1.0 | 1 | 2% | 6 |
| kurios.DOSexe .9b | 0 | 0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.1 | 114 / 210 | 2.25 | 18.0% | 26482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.3 | 18.0% | 114 |
| rz.Aleph 0.34 | 1.7 | 16.7% | 52 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.5% | 17 |
| djc.DynaBot 0.1.1 | 3.8 | 10.9% | 10 |
| rdt199.Warlord 0.73 | 5.8 | 8.6% | 6 |
| br2.MobyDickBot 1.6 | 6.0 | 8.5% | 5 |
| uji.YellohFellah 1.0 | 6.7 | 7.9% | 5 |
| KiraNL.Chupacabra 0.4 | 7.5 | 6.8% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.6% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 80.3 | 15 / 35 | 4300 |
| 2 | 2 | 66.4 | 82.2 | 15 / 35 | 4592 |
| 3 | 1 | 67.6 | 86.0 | 20 / 35 | 4259 |
| 4 | 1 | 68.7 | 90.8 | 21 / 35 | 4572 |
| 5 | 1 | 69.0 | 91.1 | 23 / 35 | 4375 |
| 6 | 1 | 67.4 | 86.0 | 20 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 71 | 80% |
| djc.DynaBot 0.1.1 | 21 | 86% |
| cx.mini.Nimrod 0.55 | 21 | 86% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| uji.YellohFellah 1.0 | 10 | 80% |
| rdt199.Warlord 0.73 | 7 | 71% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 42 | 44% | 100 |
| cx.mini.Nimrod 0.55 | 25 | 26% | 37 |
| djc.DynaBot 0.1.1 | 9 | 9% | 21 |
| rdt199.Warlord 0.73 | 8 | 8% | 21 |
| uji.YellohFellah 1.0 | 7 | 7% | 16 |
| br2.MobyDickBot 1.6 | 3 | 3% | 12 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
| KiraNL.Chupacabra 0.4 | 0 | 0% | 1 |

## Melee bench: F12

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.6 | 138 / 210 | 2.03 | 18.4% | 23457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.4% | 138 |
| nat.PallasHawk 1.0 | 2.5 | 13.4% | 32 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.3% | 16 |
| darkcanuck.Leon 1.01 | 3.8 | 12.2% | 11 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 9 |
| jrm.Test0 1.0 | 6.8 | 7.6% | 1 |
| jp.Perpy 16.0 | 7.0 | 7.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.9% | 2 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 84.1 | 20 / 35 | 3522 |
| 2 | 1 | 69.6 | 93.0 | 26 / 35 | 4337 |
| 3 | 1 | 68.0 | 89.2 | 24 / 35 | 3673 |
| 4 | 1 | 68.8 | 92.1 | 24 / 35 | 3996 |
| 5 | 1 | 65.6 | 82.2 | 18 / 35 | 3887 |
| 6 | 1 | 68.9 | 90.8 | 26 / 35 | 4042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 53 | 77% |
| bts.wiki.RipCurl 0.9b | 44 | 93% |
| darkcanuck.Leon 1.01 | 37 | 92% |
| brainfade.melee.Genghis 0.36 | 12 | 92% |
| jrm.Test0 1.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 20 | 28% | 56 |
| nat.PallasHawk 1.0 | 19 | 26% | 55 |
| brainfade.melee.Genghis 0.36 | 9 | 13% | 15 |
| darkcanuck.Leon 1.01 | 7 | 10% | 50 |
| jrm.Test0 1.0 | 5 | 7% | 10 |
| jaybot.bots.Oddball 4.0 | 5 | 7% | 10 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 9 |
| jp.Perpy 16.0 | 1 | 1% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.4 | 81 / 210 | 2.49 | 16.3% | 24701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.8% | 81 |
| ags.Glacier 0.2.11 | 2.0 | 16.3% | 34 |
| hadur117.mini.DeiseD 0.4 | 2.3 | 16.3% | 81 |
| shinh.Entangled 0.3 | 4.3 | 11.7% | 11 |
| gh.micro.Gruweltje 0.7 | 4.7 | 10.9% | 4 |
| apc.Colossus2 0.17 | 6.2 | 7.4% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.3% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 66.5 | 84.8 | 15 / 35 | 4343 |
| 2 | 3 | 63.7 | 78.1 | 13 / 35 | 3754 |
| 3 | 3 | 64.9 | 81.9 | 11 / 35 | 3872 |
| 4 | 2 | 66.4 | 86.0 | 14 / 35 | 4118 |
| 5 | 1 | 66.4 | 85.1 | 14 / 35 | 4363 |
| 6 | 2 | 66.3 | 84.8 | 14 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 42% |
| ags.Glacier 0.2.11 | 48 | 79% |
| shinh.Entangled 0.3 | 15 | 80% |
| gh.micro.Gruweltje 0.7 | 3 | 67% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 61 | 47% | 88 |
| ags.Glacier 0.2.11 | 33 | 25% | 68 |
| shinh.Entangled 0.3 | 13 | 10% | 27 |
| gh.micro.Gruweltje 0.7 | 10 | 8% | 13 |
| stelo.Wang 1.0 | 7 | 5% | 9 |
| ayk.WallHugger 1.0 | 4 | 3% | 3 |
| maribo.FollowFire 1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.8 | 165 / 210 | 1.56 | 20.5% | 33460 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 165 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 20 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.9% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.3% | 4 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 7.3% | 0 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 91.4 | 25 / 35 | 5741 |
| 2 | 1 | 71.3 | 94.3 | 27 / 35 | 5760 |
| 3 | 1 | 71.5 | 95.6 | 29 / 35 | 5431 |
| 4 | 1 | 71.0 | 96.2 | 28 / 35 | 5330 |
| 5 | 1 | 71.3 | 93.7 | 29 / 35 | 5788 |
| 6 | 1 | 70.3 | 91.4 | 27 / 35 | 5410 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 87 | 90% |
| catcat20.shape.Theta 0.018 | 53 | 81% |
| co.edu.usb.rc.LidisTron 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 89% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 22 | 47% | 93 |
| catcat20.shape.Theta 0.018 | 17 | 36% | 51 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 13 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 16 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 16 |
| pa.Improved 1.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.9 | 111 / 210 | 2.54 | 17.9% | 29864 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 111 |
| kawigi.micro.Shiz 1.1 | 2.0 | 14.1% | 21 |
| emp.Yngwie 1.11 | 3.5 | 12.6% | 43 |
| mld.DustBunny 3.8 | 3.8 | 12.0% | 8 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.4% | 7 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.2% | 20 |
| lambdaxy.TBot 0.1 | 7.5 | 6.5% | 1 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.2% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 80.3 | 20 / 35 | 4952 |
| 2 | 1 | 69.1 | 86.7 | 20 / 35 | 5467 |
| 3 | 1 | 65.2 | 78.1 | 14 / 35 | 4483 |
| 4 | 1 | 68.7 | 87.6 | 21 / 35 | 5004 |
| 5 | 1 | 68.3 | 83.2 | 20 / 35 | 5319 |
| 6 | 1 | 66.2 | 81.3 | 16 / 35 | 4639 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 65% |
| kawigi.micro.Shiz 1.1 | 28 | 100% |
| kawigi.robot.Girl 1.2 | 25 | 76% |
| cb.nano.Insomnia 1.0 | 23 | 100% |
| mld.DustBunny 3.8 | 15 | 93% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 36% | 73 |
| cb.nano.Insomnia 1.0 | 18 | 18% | 20 |
| mld.DustBunny 3.8 | 14 | 14% | 39 |
| kawigi.robot.Girl 1.2 | 14 | 14% | 28 |
| kawigi.micro.Shiz 1.1 | 12 | 12% | 35 |
| divineomega.TrialBot 0.003 | 2 | 2% | 8 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.0 | 107 / 210 | 2.17 | 18.9% | 33208 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 18.9% | 107 |
| gh.Griezel 0.5.2 | 1.8 | 16.7% | 60 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.8% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.0% | 24 |
| bvh.fnr.Fenrir 0.36l | 4.8 | 9.4% | 5 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.7% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.7% | 2 |
| asd.Cthulhu 1.3 | 8.2 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.1% | 2 |
| repositorio.NanoStep 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.1 | 20 / 35 | 5562 |
| 2 | 2 | 65.8 | 78.1 | 12 / 35 | 5206 |
| 3 | 1 | 68.9 | 86.3 | 19 / 35 | 5505 |
| 4 | 1 | 69.8 | 89.5 | 20 / 35 | 5490 |
| 5 | 1 | 69.5 | 88.6 | 18 / 35 | 5580 |
| 6 | 1 | 69.5 | 87.6 | 18 / 35 | 5865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 79 | 56% |
| techdude.forest.FlamingForest 1.1 | 25 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 88% |
| bvh.fnr.Fenrir 0.36l | 12 | 100% |
| stelo.IntrinsicVolatility 1.4 | 9 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 55 | 52% | 99 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 15% | 39 |
| techdude.forest.FlamingForest 1.1 | 13 | 12% | 24 |
| bvh.fnr.Fenrir 0.36l | 11 | 10% | 17 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 13 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 12 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.0 | 108 / 210 | 2.44 | 17.9% | 29037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 108 |
| et.Predator 1.8 | 2.5 | 13.4% | 19 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.7% | 30 |
| cx.BlestPain 1.41 | 4.0 | 12.1% | 35 |
| nic.Nicator 2.4 | 4.7 | 11.3% | 11 |
| ahf.NanoAndrew .4 | 5.5 | 10.5% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.2 | 5.9% | 0 |
| tex.Longbot 0.4 | 8.8 | 4.9% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 84.8 | 19 / 35 | 4823 |
| 2 | 1 | 69.6 | 87.9 | 23 / 35 | 5145 |
| 3 | 1 | 68.7 | 90.2 | 21 / 35 | 4695 |
| 4 | 1 | 67.2 | 82.5 | 16 / 35 | 5111 |
| 5 | 1 | 64.7 | 76.5 | 12 / 35 | 4596 |
| 6 | 1 | 66.7 | 82.2 | 17 / 35 | 4667 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 83% |
| oog.melee.Mercutio 1.0 | 36 | 72% |
| cx.BlestPain 1.41 | 24 | 50% |
| nic.Nicator 2.4 | 20 | 80% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1029. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 31 | 30% | 49 |
| et.Predator 1.8 | 19 | 18% | 55 |
| oog.melee.Mercutio 1.0 | 19 | 18% | 42 |
| nic.Nicator 2.4 | 19 | 18% | 33 |
| ahf.NanoAndrew .4 | 6 | 6% | 18 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| maribo.melee.BMV 0.1 | 4 | 4% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 88.0 | 133 / 210 | 2.08 | 18.7% | 27261 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.7% | 133 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.8% | 26 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.3% | 21 |
| uji.DBH 1.1 | 3.7 | 11.0% | 9 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.5% | 6 |
| ratosh.Nobo 0.21 | 5.5 | 9.8% | 2 |
| sigterm.Sigterm 1.0 | 7.3 | 7.9% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.9% | 4 |
| stelo.WangRobot 1.0 | 8.7 | 6.0% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 22 / 35 | 4868 |
| 2 | 1 | 70.0 | 95.2 | 26 / 35 | 4774 |
| 3 | 1 | 66.9 | 84.1 | 20 / 35 | 4383 |
| 4 | 1 | 67.8 | 87.3 | 22 / 35 | 4358 |
| 5 | 1 | 66.7 | 85.1 | 23 / 35 | 4146 |
| 6 | 1 | 68.5 | 89.5 | 20 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 81% |
| agd.Mooserwirt2 2.7 | 38 | 71% |
| uji.DBH 1.1 | 17 | 88% |
| sigterm.Sigterm 1.0 | 17 | 88% |
| spinnercat.Robovirus 2.718 | 16 | 88% |
| stelo.WangRobot 1.0 | 14 | 100% |
| ratosh.Nobo 0.21 | 5 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 20 | 26% | 56 |
| agd.Mooserwirt2 2.7 | 17 | 22% | 53 |
| ratosh.Nobo 0.21 | 8 | 10% | 20 |
| spinnercat.Robovirus 2.718 | 8 | 10% | 16 |
| sigterm.Sigterm 1.0 | 7 | 9% | 14 |
| uji.DBH 1.1 | 6 | 8% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 12 |
| stelo.WangRobot 1.0 | 4 | 5% | 13 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 3 |

## Melee bench: F19

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.6 | 173 / 210 | 1.40 | 21.2% | 34269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.2% | 173 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.4% | 14 |
| mld.Infinity 2.2 | 2.7 | 14.0% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 2 |
| erdnis.Rover 0.3 | 5.2 | 10.1% | 0 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.8% | 1 |
| pac.ABC 2.1 | 7.7 | 6.7% | 1 |
| mbh.Mbh 0.1 | 7.8 | 6.2% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.3 | 28 / 35 | 5359 |
| 2 | 1 | 71.9 | 95.6 | 28 / 35 | 5533 |
| 3 | 1 | 72.8 | 97.5 | 30 / 35 | 5963 |
| 4 | 1 | 71.7 | 92.1 | 28 / 35 | 5640 |
| 5 | 1 | 73.0 | 98.1 | 30 / 35 | 5956 |
| 6 | 1 | 72.6 | 97.1 | 29 / 35 | 5818 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 73 | 93% |
| mld.Infinity 2.2 | 73 | 84% |
| krillr.mini.JointStrike 2.0.0 | 22 | 95% |
| erdnis.Rover 0.3 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1354. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 45% | 25 |
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 37% | 109 |
| krillr.mini.JointStrike 2.0.0 | 3 | 8% | 26 |
| patson.PatsonTestBot 1.0 | 2 | 5% | 18 |
| erdnis.Rover 0.3 | 1 | 3% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 6 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.7 | 139 / 210 | 1.74 | 20.1% | 33489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.1% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 33 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.3% | 6 |
| fwb.Nine 1.0.1 | 3.7 | 11.4% | 17 |
| catcat20.Rabbit 0.001 | 4.7 | 10.0% | 12 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.8% | 2 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.6% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.6% | 0 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.7% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.4 | 25 / 35 | 5535 |
| 2 | 1 | 70.9 | 92.7 | 25 / 35 | 5946 |
| 3 | 1 | 69.9 | 89.5 | 20 / 35 | 5729 |
| 4 | 1 | 68.5 | 88.9 | 18 / 35 | 4934 |
| 5 | 1 | 71.6 | 95.9 | 27 / 35 | 5814 |
| 6 | 1 | 70.1 | 91.1 | 24 / 35 | 5531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 83% |
| fwb.Nine 1.0.1 | 36 | 72% |
| catcat20.Rabbit 0.001 | 28 | 82% |
| nz.jdc.nano.GridFu 1.0 | 16 | 94% |
| bayen.nut.Squirrel 1.615 | 10 | 80% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1203. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 47% | 75 |
| fwb.Nine 1.0.1 | 18 | 25% | 30 |
| catcat20.Rabbit 0.001 | 8 | 11% | 37 |
| nz.jdc.nano.GridFu 1.0 | 7 | 10% | 34 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 13 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 11 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.4 | 146 / 210 | 1.59 | 20.4% | 32955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.4% | 146 |
| eem.EvBot v4.6.16 | 2.3 | 15.0% | 47 |
| dummy.mini.Scimitar 1.01 | 2.7 | 14.3% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.9% | 4 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.6% | 1 |
| eld.Hmm 1.0 | 5.8 | 8.1% | 5 |
| el.JumpShoot 0.2 | 7.3 | 6.2% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.1% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.6 | 23 / 35 | 6084 |
| 2 | 1 | 70.1 | 91.7 | 21 / 35 | 5487 |
| 3 | 1 | 71.4 | 93.7 | 26 / 35 | 5543 |
| 4 | 1 | 70.4 | 92.1 | 24 / 35 | 5144 |
| 5 | 1 | 70.6 | 93.0 | 25 / 35 | 5335 |
| 6 | 1 | 71.2 | 95.6 | 27 / 35 | 5362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 105 | 69% |
| dummy.mini.Scimitar 1.01 | 42 | 93% |
| cf.RiO.RiOx 4.2.1 | 24 | 92% |
| eld.Hmm 1.0 | 10 | 80% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1398. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 42 | 65% | 99 |
| dummy.mini.Scimitar 1.01 | 12 | 18% | 58 |
| cf.RiO.RiOx 4.2.1 | 5 | 8% | 28 |
| eld.Hmm 1.0 | 3 | 5% | 16 |
| arthord.MannyPacquiao Beta | 1 | 2% | 2 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.8 | 108 / 210 | 2.01 | 18.6% | 29815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.6% | 108 |
| pe.SandboxDT 2.71m | 2.3 | 15.8% | 51 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.2% | 31 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.9% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 9.9% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.6% | 0 |
| tad.Dalek98 0.98 | 7.0 | 6.6% | 1 |
| gg.Squaraus 0.6 | 8.2 | 5.7% | 0 |
| pbg.NinjaX 1.2 | 8.2 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.8 | 12 / 35 | 4753 |
| 2 | 1 | 69.0 | 89.8 | 17 / 35 | 5206 |
| 3 | 1 | 68.9 | 89.5 | 22 / 35 | 4713 |
| 4 | 1 | 68.0 | 86.0 | 13 / 35 | 5055 |
| 5 | 1 | 71.0 | 94.9 | 25 / 35 | 5156 |
| 6 | 1 | 68.6 | 87.6 | 19 / 35 | 4932 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 56 | 70% |
| pe.SandboxDT 2.71m | 50 | 56% |
| jlm.javaDisturbance 0.59 | 33 | 88% |
| bigpete.Stewie 1.0 | 7 | 71% |
| pbg.NinjaX 1.2 | 3 | 100% |
| tad.Dalek98 0.98 | 3 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 38 | 37% | 74 |
| pe.SandboxDT 2.71m | 33 | 32% | 61 |
| jlm.javaDisturbance 0.59 | 23 | 23% | 49 |
| bigpete.Stewie 1.0 | 6 | 6% | 12 |
| tad.Dalek98 0.98 | 2 | 2% | 4 |
| yk.JahRoslav 1.1 | 0 | 0% | 5 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.6 | 142 / 210 | 1.75 | 19.5% | 29556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.5% | 142 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 35 |
| cre.Karolos 0.32 | 3.0 | 14.5% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.7% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.1% | 2 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.5% | 2 |
| cw.megas.Blade 0.8 | 6.7 | 8.1% | 0 |
| sample.Walls 1.0 | 8.0 | 7.5% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 2.8% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 20 / 35 | 4917 |
| 2 | 1 | 70.6 | 92.1 | 25 / 35 | 4846 |
| 3 | 1 | 70.8 | 91.7 | 22 / 35 | 4890 |
| 4 | 1 | 70.4 | 90.8 | 23 / 35 | 4950 |
| 5 | 1 | 71.1 | 93.0 | 28 / 35 | 5153 |
| 6 | 1 | 70.2 | 91.7 | 24 / 35 | 4800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 85 | 82% |
| cre.Karolos 0.32 | 39 | 90% |
| stelo.AreaTargetingBot 1.1 | 22 | 82% |
| sample.Walls 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 37 | 54% | 106 |
| cre.Karolos 0.32 | 19 | 28% | 55 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 4% | 6 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 10 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 79.4 | 76 / 210 | 2.85 | 15.8% | 22386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.3 | 15.8% | 76 |
| rz.GlowBlowMelee 1.4 | 1.8 | 14.9% | 41 |
| davidalves.Phoenix 0.54 | 3.5 | 12.8% | 40 |
| florent.XSeries.X2 0.12 | 3.5 | 13.0% | 29 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.3% | 13 |
| oog.melee.Corsair 1.0 | 6.3 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.4% | 11 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 0 |
| evd.X1 0.01 | 9.5 | 4.3% | 0 |
| as.FrankTheTank 1.3 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 82.9 | 12 / 35 | 3791 |
| 2 | 1 | 63.9 | 77.8 | 12 / 35 | 4019 |
| 3 | 1 | 65.3 | 83.5 | 15 / 35 | 3666 |
| 4 | 2 | 62.4 | 73.0 | 9 / 35 | 3739 |
| 5 | 2 | 63.2 | 77.1 | 13 / 35 | 3436 |
| 6 | 1 | 65.4 | 82.2 | 15 / 35 | 3735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 64% |
| davidalves.Phoenix 0.54 | 30 | 67% |
| florent.XSeries.X2 0.12 | 22 | 55% |
| stelo.SoJNanoMelee 1.1 | 12 | 83% |
| pedersen.Ugluk 1.1.1 | 10 | 70% |
| oog.melee.Corsair 1.0 | 2 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 27% | 60 |
| davidalves.Phoenix 0.54 | 27 | 20% | 43 |
| pedersen.Ugluk 1.1.1 | 26 | 19% | 38 |
| florent.XSeries.X2 0.12 | 25 | 19% | 36 |
| stelo.SoJNanoMelee 1.1 | 10 | 7% | 16 |
| oog.melee.Corsair 1.0 | 5 | 4% | 11 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 2 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.7 | 142 / 210 | 2.01 | 19.0% | 25784 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.0% | 142 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.7% | 17 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 12.9% | 18 |
| jdw.Hurricane 1.4 | 3.7 | 11.3% | 17 |
| ds.Oo 2.2 | 5.5 | 9.3% | 4 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 8.9% | 8 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.4% | 2 |
| awesomeness.Elite 1.0 | 7.8 | 6.8% | 0 |
| adt.Ar2 1.1 | 8.5 | 6.3% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.7 | 24 / 35 | 4205 |
| 2 | 1 | 68.3 | 89.5 | 24 / 35 | 3812 |
| 3 | 1 | 70.6 | 95.6 | 29 / 35 | 4357 |
| 4 | 1 | 67.4 | 85.4 | 19 / 35 | 4293 |
| 5 | 1 | 69.2 | 90.2 | 24 / 35 | 4441 |
| 6 | 1 | 68.1 | 85.1 | 22 / 35 | 4676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 54 | 93% |
| voidious.mini.BrokenSword 2.0.3 | 52 | 90% |
| jdw.Hurricane 1.4 | 25 | 92% |
| ds.Oo 2.2 | 9 | 78% |
| gjr.Cephalosporin 0.1 | 9 | 100% |
| adt.Ar2 1.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 0% |
| gre.svman4.Morfeas 1.4.1 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 18 | 26% | 65 |
| jdw.Hurricane 1.4 | 17 | 25% | 41 |
| voidious.micro.BlitzBat 1.05 | 16 | 24% | 57 |
| ds.Oo 2.2 | 8 | 12% | 17 |
| gre.svman4.Morfeas 1.4.1 | 4 | 6% | 8 |
| adt.Ar2 1.1 | 2 | 3% | 7 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |
| awesomeness.Elite 1.0 | 1 | 1% | 2 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 9 |

## Melee bench: F26

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 125 / 210 | 2.00 | 18.8% | 31440 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 125 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 30 |
| lrem.Spectre 0.4.4 | 3.3 | 12.4% | 16 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 27 |
| js.PinBall 1.6 | 5.3 | 10.0% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.3% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 8.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 23 / 35 | 5310 |
| 2 | 1 | 67.9 | 86.7 | 18 / 35 | 4860 |
| 3 | 1 | 70.4 | 92.4 | 27 / 35 | 5252 |
| 4 | 1 | 67.4 | 83.8 | 16 / 35 | 5135 |
| 5 | 1 | 70.0 | 92.1 | 22 / 35 | 5368 |
| 6 | 1 | 68.9 | 86.7 | 19 / 35 | 5515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 80% |
| lrem.Spectre 0.4.4 | 48 | 88% |
| shu.nitro.LENIN .T34 | 35 | 63% |
| js.PinBall 1.6 | 8 | 75% |
| gh.mini.GrubbmOne 1.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 80% |
| jaybot.adv.bots.JayBot 2.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 29 | 34% | 76 |
| shu.nitro.LENIN .T34 | 24 | 28% | 53 |
| lrem.Spectre 0.4.4 | 12 | 14% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 9% | 12 |
| js.PinBall 1.6 | 6 | 7% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 5% | 6 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 7 |

## Melee bench: F27

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 88.8 | 130 / 210 | 2.01 | 18.8% | 27374 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 130 |
| mk.Alpha 0.2.1 | 2.0 | 14.0% | 33 |
| wee.Gem 1.8.4 | 3.5 | 11.5% | 21 |
| EH.Eagle 1.0.6 | 4.7 | 10.4% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.8% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.2% | 4 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.0% | 1 |
| joe.ADinosaur 1.0 | 7.3 | 7.7% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.3% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 86.0 | 23 / 35 | 6102 |
| 2 | 1 | 67.6 | 89.2 | 20 / 35 | 4194 |
| 3 | 1 | 67.8 | 88.6 | 22 / 35 | 4263 |
| 4 | 1 | 67.0 | 84.1 | 20 / 35 | 4344 |
| 5 | 1 | 69.0 | 93.7 | 24 / 35 | 4115 |
| 6 | 1 | 68.4 | 91.1 | 21 / 35 | 4356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 88% |
| wee.Gem 1.8.4 | 34 | 65% |
| EH.Eagle 1.0.6 | 19 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 68% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 88% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 962. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 29% | 73 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 23% | 37 |
| wee.Gem 1.8.4 | 15 | 19% | 40 |
| joe.ADinosaur 1.0 | 7 | 9% | 10 |
| throxbot.ThroxBot 0.1 | 6 | 8% | 12 |
| EH.Eagle 1.0.6 | 4 | 5% | 20 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 12 |

## Melee bench: F28

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.2 | 136 / 210 | 1.98 | 18.8% | 26117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 136 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 29 |
| uji.Antique 1.0 | 3.0 | 12.2% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.5% | 8 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.6% | 4 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.1% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.5% | 4 |
| matt.advanced.Katana 1.0 | 8.7 | 6.1% | 2 |
| stelo.Lifestealer 1.0 | 8.8 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 90.8 | 23 / 35 | 4209 |
| 2 | 1 | 68.4 | 88.6 | 22 / 35 | 4513 |
| 3 | 1 | 69.5 | 92.4 | 24 / 35 | 4632 |
| 4 | 1 | 67.4 | 87.3 | 23 / 35 | 4011 |
| 5 | 1 | 67.7 | 88.3 | 22 / 35 | 4107 |
| 6 | 1 | 68.5 | 87.6 | 22 / 35 | 4645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 82% |
| uji.Antique 1.0 | 39 | 92% |
| pfvicm.Sobieski 7.2.3b | 10 | 90% |
| qohnil.blot.BlotBot 3.61 | 9 | 67% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 36% | 83 |
| uji.Antique 1.0 | 14 | 19% | 46 |
| pfvicm.Sobieski 7.2.3b | 13 | 18% | 21 |
| qohnil.blot.BlotBot 3.61 | 8 | 11% | 20 |
| amk.ChumbaWumba 0.3 | 5 | 7% | 13 |
| ahr.ice.Ice 1.0.2 | 5 | 7% | 11 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 5 |

## Melee bench: F29

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.1 | 114 / 210 | 2.34 | 18.3% | 27240 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 114 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.2% | 42 |
| deewiant.Anomaly 0.2 | 2.5 | 15.4% | 39 |
| myl.micro.Troodon 1.10 | 4.0 | 12.0% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.1% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.2% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 6.3% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.7% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.6% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 81.9 | 18 / 35 | 4398 |
| 2 | 1 | 68.5 | 86.0 | 19 / 35 | 4364 |
| 3 | 1 | 66.9 | 81.6 | 13 / 35 | 4342 |
| 4 | 1 | 69.3 | 86.7 | 21 / 35 | 4821 |
| 5 | 1 | 70.9 | 93.3 | 25 / 35 | 4852 |
| 6 | 1 | 67.1 | 81.0 | 18 / 35 | 4463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 80% |
| zyx.mega.YersiniaPestis 3.1 | 49 | 76% |
| myl.micro.Troodon 1.10 | 21 | 95% |
| jok.PheonixM 0.1.2 | 5 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 37 | 38% | 89 |
| zyx.mega.YersiniaPestis 3.1 | 34 | 35% | 68 |
| myl.micro.Troodon 1.10 | 13 | 13% | 30 |
| jok.PheonixM 0.1.2 | 6 | 6% | 12 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 1 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 72.3 | 47 / 210 | 3.50 | 14.1% | 20956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.5% | 59 |
| hadur117.mini.DeiseD 0.4 | 2.5 | 14.1% | 47 |
| oog.melee.Capulet 1.2 | 3.3 | 13.1% | 35 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.5% | 24 |
| darkcanuck.B26354 1.06 | 3.8 | 12.9% | 41 |
| tripphippy.Alice 1.1 | 7.2 | 7.4% | 1 |
| intruder.PrairieWolf 2.61 | 7.3 | 7.6% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.3% | 2 |
| ntc.Opposite 1.5 | 7.8 | 7.3% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.3 | 75.2 | 9 / 35 | 3857 |
| 2 | 2 | 61.2 | 72.1 | 9 / 35 | 3397 |
| 3 | 4 | 60.4 | 70.2 | 6 / 35 | 3285 |
| 4 | 3 | 60.4 | 70.2 | 7 / 35 | 3381 |
| 5 | 2 | 62.6 | 74.6 | 8 / 35 | 3738 |
| 6 | 3 | 61.1 | 71.4 | 8 / 35 | 3298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 46% |
| oog.melee.Capulet 1.2 | 20 | 65% |
| darkcanuck.B26354 1.06 | 15 | 33% |
| stelo.PastFuture 2.3.2 | 11 | 64% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 80% |
| ntc.Opposite 1.5 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 38 | 23% | 55 |
| stelo.PastFuture 2.3.2 | 31 | 19% | 38 |
| darkcanuck.B26354 1.06 | 31 | 19% | 35 |
| oog.melee.Capulet 1.2 | 27 | 16% | 41 |
| tripphippy.Alice 1.1 | 12 | 7% | 13 |
| ntc.Opposite 1.5 | 10 | 6% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 10 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 7 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 76.3 | 65 / 210 | 3.13 | 15.1% | 21411 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.0% | 85 |
| hadur117.mini.DeiseD 0.4 | 1.8 | 15.1% | 65 |
| gh.mini.Griezel 0.2 | 3.0 | 13.3% | 40 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.8% | 13 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.1% | 6 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.5% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.0% | 1 |
| fm.mammillarias 1.3 | 8.2 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 73.0 | 9 / 35 | 3345 |
| 2 | 1 | 64.0 | 78.1 | 13 / 35 | 3705 |
| 3 | 2 | 64.2 | 78.1 | 14 / 35 | 3576 |
| 4 | 2 | 64.9 | 79.4 | 13 / 35 | 3937 |
| 5 | 2 | 62.5 | 75.2 | 8 / 35 | 3452 |
| 6 | 2 | 61.9 | 74.0 | 8 / 35 | 3396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 45 | 56% |
| gh.mini.Griezel 0.2 | 29 | 55% |
| spinnercat.micro.Tyger 0.1 | 9 | 100% |
| d414.nano.Quantum 1.0.0 | 8 | 100% |
| gh.nano.Grofvuil 0.2 | 4 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 49 | 33% | 74 |
| gh.mini.Griezel 0.2 | 45 | 30% | 61 |
| spinnercat.micro.Tyger 0.1 | 24 | 16% | 33 |
| gh.nano.Grofvuil 0.2 | 9 | 6% | 14 |
| d414.nano.Quantum 1.0.0 | 7 | 5% | 13 |
| fm.mammillarias 1.3 | 4 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.3 | 129 / 210 | 1.87 | 19.0% | 29202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.0% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 45 |
| apc.botM 3.0 | 3.3 | 11.9% | 21 |
| lxx.ConceptA 0.8 | 3.8 | 11.2% | 4 |
| bayen.UbaMicro 1.4 | 5.3 | 9.2% | 2 |
| vjik.UnViolation 1.1 | 5.8 | 9.0% | 5 |
| panzer.Panzer 0.2 | 6.8 | 7.8% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.0% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.0 | 26 / 35 | 5071 |
| 2 | 1 | 69.0 | 93.3 | 23 / 35 | 4664 |
| 3 | 1 | 68.3 | 86.7 | 22 / 35 | 4817 |
| 4 | 1 | 68.6 | 89.8 | 19 / 35 | 4956 |
| 5 | 1 | 68.4 | 91.7 | 19 / 35 | 4731 |
| 6 | 1 | 68.1 | 87.3 | 20 / 35 | 4963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 67% |
| apc.botM 3.0 | 30 | 80% |
| lxx.ConceptA 0.8 | 23 | 87% |
| donjezza.Jezza 1.0 | 10 | 90% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| vjik.UnViolation 1.1 | 7 | 86% |
| panzer.Panzer 0.2 | 5 | 100% |
| conscience.Electron 1.3g | 2 | 100% |
| yk.JahMicro 1.0 | 2 | 50% |

Hadur died in 82 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 46% | 104 |
| lxx.ConceptA 0.8 | 14 | 17% | 20 |
| apc.botM 3.0 | 12 | 15% | 36 |
| bayen.UbaMicro 1.4 | 7 | 9% | 13 |
| vjik.UnViolation 1.1 | 5 | 6% | 19 |
| panzer.Panzer 0.2 | 3 | 4% | 5 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |
| conscience.Electron 1.3g | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.7 | 138 / 210 | 2.01 | 19.5% | 30503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.5% | 138 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 18 |
| labg.Cataclysm 2.05 | 4.3 | 10.5% | 13 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.7% | 6 |
| baal.nano.N 1.42 | 6.3 | 8.2% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.3% | 7 |
| sanja.First 0.1 | 8.5 | 4.7% | 0 |
| zyx.micro.Ant 1.1 | 8.8 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.7 | 22 / 35 | 5304 |
| 2 | 1 | 71.6 | 93.7 | 30 / 35 | 5238 |
| 3 | 1 | 69.2 | 88.3 | 21 / 35 | 4881 |
| 4 | 1 | 69.6 | 88.9 | 22 / 35 | 5023 |
| 5 | 1 | 70.1 | 89.2 | 23 / 35 | 5158 |
| 6 | 1 | 68.3 | 85.7 | 20 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 56 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 95% |
| gre.svman4.Leonidas 1.3.2 | 23 | 100% |
| labg.Cataclysm 2.05 | 18 | 94% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 64% |
| baal.nano.N 1.42 | 4 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 47% | 90 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 18% | 57 |
| gre.svman4.Leonidas 1.3.2 | 10 | 14% | 24 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 14% | 11 |
| labg.Cataclysm 2.05 | 4 | 5% | 19 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| baal.nano.N 1.42 | 0 | 0% | 3 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.2 | 85 / 210 | 2.24 | 17.6% | 28601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.6% | 85 |
| stelo.Spread 0.9 | 2.2 | 16.7% | 67 |
| kid.Gladiator .7.2 | 2.8 | 15.8% | 41 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 12 |
| tcf.Reach 3 | 4.8 | 10.7% | 8 |
| cli.Dancer 1.1 | 5.7 | 9.7% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 82.5 | 13 / 35 | 4538 |
| 2 | 1 | 68.8 | 89.8 | 14 / 35 | 4994 |
| 3 | 1 | 67.9 | 87.6 | 17 / 35 | 4540 |
| 4 | 1 | 66.7 | 82.5 | 11 / 35 | 4809 |
| 5 | 1 | 69.6 | 88.9 | 16 / 35 | 5258 |
| 6 | 1 | 67.4 | 86.0 | 14 / 35 | 4462 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 57% |
| kid.Gladiator .7.2 | 46 | 63% |
| jcs.Seth 1.8 | 19 | 53% |
| tcf.Reach 3 | 5 | 40% |
| ratosh.Wesco 1.4 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 1169. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 56 | 44% | 91 |
| kid.Gladiator .7.2 | 43 | 34% | 69 |
| jcs.Seth 1.8 | 14 | 11% | 29 |
| tcf.Reach 3 | 7 | 5% | 9 |
| ratosh.Wesco 1.4 | 5 | 4% | 9 |
| cli.Dancer 1.1 | 0 | 0% | 3 |
3 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 80.5 | 43 / 210 | 2.76 | 15.2% | 20623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 134 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.2% | 43 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 19 |
| rz.HawkOnFire 0.1 | 4.3 | 11.8% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.9% | 8 |
| wit.Chuliath 1.0 | 6.3 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 79.7 | 7 / 35 | 3262 |
| 2 | 2 | 64.2 | 78.4 | 9 / 35 | 3891 |
| 3 | 2 | 65.3 | 83.8 | 12 / 35 | 3478 |
| 4 | 2 | 61.8 | 76.5 | 3 / 35 | 3107 |
| 5 | 2 | 65.1 | 83.8 | 6 / 35 | 3791 |
| 6 | 2 | 63.0 | 80.6 | 6 / 35 | 3094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 85 | 22% |
| gh.mini.Gruwel 0.9 | 20 | 40% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 60% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| wit.Chuliath 1.0 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 56% | 110 |
| gh.mini.Gruwel 0.9 | 32 | 19% | 40 |
| rz.HawkOnFire 0.1 | 22 | 13% | 32 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 21 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.4 | 171 / 210 | 1.60 | 21.0% | 32472 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.0% | 171 |
| alpha.RainingFire 1.0 | 2.0 | 12.5% | 12 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 9 |
| bvh.micro.Freya 0.3 | 4.7 | 10.3% | 3 |
| mz.Cork 0.1 | 5.5 | 9.7% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.4% | 6 |
| dl.BetterWalls 1.0 | 8.2 | 6.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.2% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 26 / 35 | 5473 |
| 2 | 1 | 71.2 | 94.3 | 30 / 35 | 5091 |
| 3 | 1 | 71.5 | 94.0 | 29 / 35 | 5431 |
| 4 | 1 | 69.2 | 87.0 | 25 / 35 | 5239 |
| 5 | 1 | 72.3 | 98.1 | 31 / 35 | 5646 |
| 6 | 1 | 71.9 | 95.6 | 30 / 35 | 5592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 93% |
| alpha.RainingFire 1.0 | 36 | 83% |
| bvh.micro.Freya 0.3 | 33 | 97% |
| mz.Cork 0.1 | 24 | 100% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 73% |
| sample.MyFirstRobot 1.0 | 10 | 100% |
| dl.BetterWalls 1.0 | 6 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 41% | 50 |
| bzdp.Pansy 2.1 | 10 | 26% | 59 |
| m3thos.Eva02 0.7.1 | 6 | 15% | 18 |
| bvh.micro.Freya 0.3 | 3 | 8% | 25 |
| mz.Cork 0.1 | 2 | 5% | 27 |
| bvh.mini.Fenrir 0.39 | 1 | 3% | 13 |
| dl.BetterWalls 1.0 | 1 | 3% | 10 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |

## Melee bench: F37

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.5 | 178 / 210 | 1.68 | 20.1% | 33970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.1% | 178 |
| germ.TheMind .2 | 2.7 | 11.2% | 3 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.4% | 5 |
| EBBU.Sim2 1.02 | 4.8 | 9.5% | 2 |
| agrach.Dalek 1.0 | 6.0 | 8.8% | 7 |
| lmk.ACPFinal 0.1 | 6.2 | 8.6% | 5 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.6% | 1 |
| mb.Beast 0.1 | 8.3 | 7.7% | 3 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 29 / 35 | 5450 |
| 2 | 1 | 69.7 | 94.6 | 30 / 35 | 5442 |
| 3 | 1 | 70.3 | 96.2 | 32 / 35 | 5428 |
| 4 | 1 | 71.2 | 96.8 | 32 / 35 | 6225 |
| 5 | 1 | 68.8 | 90.2 | 27 / 35 | 5632 |
| 6 | 1 | 68.8 | 89.2 | 28 / 35 | 5793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 61 | 98% |
| EBBU.Sim2 1.02 | 26 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 100% |
| agrach.Dalek 1.0 | 18 | 94% |
| stelo.UntouchableNano 1.3 | 16 | 88% |
| lmk.ACPFinal 0.1 | 16 | 94% |
| mb.Beast 0.1 | 13 | 85% |
| skm.Ryubot 1.0 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 6 | 18% | 20 |
| lmk.ACPFinal 0.1 | 6 | 18% | 20 |
| agrach.Dalek 1.0 | 5 | 15% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 15% | 13 |
| germ.TheMind .2 | 4 | 12% | 44 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 9% | 34 |
| EBBU.Sim2 1.02 | 2 | 6% | 27 |
| mb.Beast 0.1 | 2 | 6% | 16 |
| skm.Ryubot 1.0 | 0 | 0% | 3 |

## Melee bench: F38

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.4 | 96 / 210 | 2.67 | 16.7% | 24939 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 16.7% | 96 |
| justin.Mallais 14.0 | 1.8 | 16.2% | 66 |
| bvh.mini.Freya 0.55 | 3.7 | 12.0% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.1% | 7 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.1% | 13 |
| cs.Wren 1.0 | 5.5 | 10.4% | 7 |
| kdf.KoulDestroyer 1.0 | 6.7 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 3.9% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 24 / 35 | 4579 |
| 2 | 1 | 64.9 | 79.4 | 14 / 35 | 3964 |
| 3 | 1 | 65.3 | 81.6 | 15 / 35 | 4061 |
| 4 | 2 | 63.7 | 74.3 | 13 / 35 | 3919 |
| 5 | 1 | 65.6 | 80.6 | 14 / 35 | 4180 |
| 6 | 1 | 66.5 | 83.2 | 16 / 35 | 4236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 61 | 64% |
| bts.mega.Gnarly 1.4 | 21 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 93% |
| cs.Wren 1.0 | 13 | 92% |
| bvh.mini.Freya 0.55 | 9 | 78% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 39% | 87 |
| bvh.mini.Freya 0.55 | 24 | 21% | 32 |
| bts.mega.Gnarly 1.4 | 17 | 15% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 13% | 28 |
| cs.Wren 1.0 | 8 | 7% | 14 |
| kdf.KoulDestroyer 1.0 | 4 | 4% | 11 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 4 |

## Melee bench: F39

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.0 | 109 / 210 | 2.26 | 18.0% | 28826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.0% | 109 |
| bvh.fry.Freya 0.82 | 2.2 | 14.7% | 21 |
| az.Ololobot 0.2.4 | 3.2 | 13.1% | 48 |
| catcat20.Lambda 0.024 | 4.0 | 11.6% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.3% | 13 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 7.8% | 1 |
| gimp.GimpBot 0.1 | 7.0 | 7.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.5 | 5.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.5 | 15 / 35 | 4992 |
| 2 | 1 | 66.1 | 83.5 | 13 / 35 | 4518 |
| 3 | 1 | 67.7 | 87.0 | 20 / 35 | 4771 |
| 4 | 1 | 68.6 | 88.3 | 23 / 35 | 4959 |
| 5 | 1 | 68.5 | 91.1 | 22 / 35 | 4740 |
| 6 | 1 | 66.5 | 82.5 | 16 / 35 | 4846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 56% |
| bvh.fry.Freya 0.82 | 42 | 83% |
| catcat20.Lambda 0.024 | 38 | 74% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 93% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1065. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 33 | 32% | 65 |
| bvh.fry.Freya 0.82 | 31 | 30% | 62 |
| catcat20.Lambda 0.024 | 21 | 21% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 10% | 15 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 6 |
| gimp.GimpBot 0.1 | 2 | 2% | 6 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.7 | 104 / 210 | 2.38 | 17.8% | 27212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 17.8% | 104 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.7% | 51 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 12.0% | 19 |
| Polkwane.SmashMelee 1.0 | 4.2 | 10.9% | 18 |
| mz.AntiGrav 1.0 | 4.7 | 10.6% | 7 |
| stelo.Randomness 1.0 | 5.7 | 9.8% | 9 |
| alpha.BlackIce 1.0 | 7.0 | 8.1% | 2 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.8% | 0 |
| sample.Corners 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.4 | 18 / 35 | 4455 |
| 2 | 1 | 66.5 | 81.9 | 15 / 35 | 4514 |
| 3 | 1 | 69.4 | 89.8 | 24 / 35 | 4860 |
| 4 | 1 | 68.3 | 88.3 | 20 / 35 | 4516 |
| 5 | 2 | 65.8 | 80.0 | 13 / 35 | 4580 |
| 6 | 1 | 66.3 | 82.9 | 14 / 35 | 4287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 69% |
| kano.gamma.KanoGamma 1.8 | 30 | 67% |
| Polkwane.SmashMelee 1.0 | 17 | 88% |
| mz.AntiGrav 1.0 | 12 | 100% |
| stelo.Randomness 1.0 | 7 | 71% |
| sample.Corners 1.0 | 3 | 100% |
| alpha.BlackIce 1.0 | 3 | 67% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 42% | 77 |
| kano.gamma.KanoGamma 1.8 | 15 | 14% | 40 |
| stelo.Randomness 1.0 | 12 | 11% | 25 |
| Polkwane.SmashMelee 1.0 | 11 | 10% | 22 |
| mz.AntiGrav 1.0 | 9 | 8% | 21 |
| alpha.BlackIce 1.0 | 6 | 6% | 9 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 6 |
| sample.Corners 1.0 | 2 | 2% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |

## Melee bench: F41

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.2 | 116 / 210 | 2.15 | 17.8% | 24026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.8% | 116 |
| eem.EvBotNG v12.8 | 2.2 | 15.0% | 56 |
| ary.Swarm 1.1 | 3.3 | 13.1% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.6% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.5% | 9 |
| shrub.Silver v048 | 6.2 | 8.8% | 3 |
| zyx.nano.Ant 1.1 | 7.2 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.1% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.9 | 17 / 35 | 3859 |
| 2 | 1 | 66.9 | 86.0 | 19 / 35 | 3893 |
| 3 | 1 | 66.9 | 84.8 | 18 / 35 | 4118 |
| 4 | 1 | 68.9 | 88.3 | 22 / 35 | 4373 |
| 5 | 1 | 67.9 | 87.6 | 21 / 35 | 3840 |
| 6 | 1 | 67.7 | 87.6 | 19 / 35 | 3943 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 52% |
| lessonz.robocode.Oz 0.5.0 | 33 | 94% |
| ary.Swarm 1.1 | 26 | 96% |
| simonton.nano.MeleeSeed 1.8 | 25 | 88% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 39 | 41% | 68 |
| ary.Swarm 1.1 | 18 | 19% | 51 |
| lessonz.robocode.Oz 0.5.0 | 16 | 17% | 34 |
| simonton.nano.MeleeSeed 1.8 | 12 | 13% | 38 |
| shrub.Silver v048 | 6 | 6% | 8 |
| jsal.Jsalbot 1.0 | 1 | 1% | 6 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.4 | 102 / 210 | 2.31 | 17.7% | 28536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.7% | 102 |
| wompi.Wallaby 5.1 | 2.2 | 15.3% | 51 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.7% | 23 |
| ara.Shera 0.88 | 3.5 | 13.6% | 27 |
| amz.NanoClone 1.41 | 5.0 | 9.5% | 4 |
| maribo.IotaCT 1.1 | 6.3 | 7.3% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.9% | 3 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.0 | 5.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 20 / 35 | 5140 |
| 2 | 1 | 65.0 | 81.6 | 13 / 35 | 4329 |
| 3 | 1 | 65.8 | 81.0 | 14 / 35 | 4694 |
| 4 | 1 | 68.8 | 88.9 | 18 / 35 | 4996 |
| 5 | 1 | 66.6 | 86.0 | 18 / 35 | 4501 |
| 6 | 1 | 68.1 | 87.3 | 19 / 35 | 4876 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 56 | 77% |
| maribo.mini.MiniQuester 0.1 | 36 | 81% |
| ara.Shera 0.88 | 32 | 72% |
| dsw.StaticD 1.0 | 3 | 100% |
| amz.NanoClone 1.41 | 2 | 50% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 33% | 81 |
| ara.Shera 0.88 | 32 | 29% | 52 |
| maribo.mini.MiniQuester 0.1 | 26 | 24% | 55 |
| amz.NanoClone 1.41 | 10 | 9% | 10 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |

## Melee bench: F43

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 77.4 | 44 / 210 | 3.03 | 14.9% | 21615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.3% | 136 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 14.9% | 44 |
| brainfade.melee.Dusk 0.44 | 3.0 | 13.1% | 22 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.5% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.0% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.2% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.9% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 76.8 | 4 / 35 | 3549 |
| 2 | 2 | 64.5 | 76.5 | 10 / 35 | 3532 |
| 3 | 2 | 64.7 | 79.4 | 7 / 35 | 3642 |
| 4 | 2 | 65.0 | 78.7 | 8 / 35 | 3632 |
| 5 | 2 | 63.2 | 74.6 | 7 / 35 | 3375 |
| 6 | 2 | 64.6 | 78.4 | 8 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 84 | 23% |
| brainfade.melee.Dusk 0.44 | 20 | 75% |
| dummy.micro.Sparrow 2.5 | 6 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 975. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 53% | 110 |
| brainfade.melee.Dusk 0.44 | 29 | 17% | 42 |
| dummy.micro.Sparrow 2.5 | 18 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 14 |
| Krabb.akim2.Akim2 1.1b | 6 | 4% | 8 |
| mz.NanoGod 2.02 | 5 | 3% | 6 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
4 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.7 | 134 / 210 | 1.83 | 19.7% | 31189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.7% | 134 |
| stelo.Liblix 0.3.1 | 2.0 | 15.5% | 45 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.0% | 21 |
| wompi.Quokka 1.6 | 4.2 | 9.8% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.3% | 0 |
| jwirde.Gort 2.0 | 5.8 | 8.7% | 3 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.7% | 1 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.7 | 23 / 35 | 5225 |
| 2 | 1 | 70.1 | 93.7 | 23 / 35 | 5103 |
| 3 | 1 | 70.3 | 92.1 | 22 / 35 | 5310 |
| 4 | 1 | 68.9 | 88.9 | 17 / 35 | 5106 |
| 5 | 1 | 71.0 | 94.0 | 26 / 35 | 5377 |
| 6 | 1 | 69.8 | 89.2 | 23 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 74% |
| tzu.TheArtOfWar 1.2 | 45 | 78% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| wompi.Quokka 1.6 | 9 | 89% |
| disan.Chair 2.2.0 | 8 | 100% |
| jwirde.Gort 2.0 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 39 | 51% | 105 |
| tzu.TheArtOfWar 1.2 | 16 | 21% | 51 |
| wompi.Quokka 1.6 | 11 | 14% | 20 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 7% | 9 |
| jwirde.Gort 2.0 | 3 | 4% | 13 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
| disan.Chair 2.2.0 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.3 | 96 / 210 | 1.96 | 20.0% | 35929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.0% | 96 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.5% | 97 |
| jje.BagPuss 1.2 | 2.8 | 12.2% | 8 |
| myl.nano.Graviton 1.10 | 4.2 | 10.8% | 1 |
| sul.Lunar 1.1 | 5.0 | 10.2% | 2 |
| fm.claire 1.7 | 7.0 | 7.9% | 1 |
| hvilela.HVilela 0.9 | 7.2 | 7.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.5% | 0 |
| wit.Deep7 2.0 | 8.5 | 6.3% | 5 |
| abud.ThirdRobo 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 19 / 35 | 5707 |
| 2 | 1 | 68.8 | 86.7 | 13 / 35 | 5646 |
| 3 | 1 | 69.0 | 84.8 | 12 / 35 | 6183 |
| 4 | 1 | 69.8 | 88.6 | 15 / 35 | 6183 |
| 5 | 1 | 70.4 | 92.4 | 16 / 35 | 5985 |
| 6 | 1 | 71.3 | 93.0 | 21 / 35 | 6225 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 110 | 27% |
| jje.BagPuss 1.2 | 22 | 86% |
| myl.nano.Graviton 1.10 | 16 | 100% |
| sul.Lunar 1.1 | 16 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 2330. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 80 | 70% | 0 |
| jje.BagPuss 1.2 | 15 | 13% | 65 |
| myl.nano.Graviton 1.10 | 6 | 5% | 50 |
| fm.claire 1.7 | 5 | 4% | 9 |
| sul.Lunar 1.1 | 4 | 4% | 49 |
| wit.Deep7 2.0 | 4 | 4% | 9 |
| pez.mini.ChironexFleckeri 0.5 | 0 | 0% | 15 |
| hvilela.HVilela 0.9 | 0 | 0% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |

## Melee bench: F46

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 84.4 | 65 / 210 | 2.40 | 16.6% | 25334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.8 | 16.6% | 65 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 17.0% | 85 |
| kc.mini.Mirage 0.2 | 2.2 | 16.3% | 51 |
| mz.MicroSheep 1.0 | 4.2 | 10.8% | 3 |
| cx.Princess 1.0 | 5.2 | 9.8% | 6 |
| sadoner.killer 0.2 | 5.7 | 8.5% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 82.5 | 11 / 35 | 4452 |
| 2 | 2 | 66.8 | 86.3 | 10 / 35 | 4228 |
| 3 | 3 | 65.6 | 84.1 | 12 / 35 | 3936 |
| 4 | 1 | 68.4 | 89.5 | 17 / 35 | 4375 |
| 5 | 1 | 66.5 | 84.1 | 10 / 35 | 4661 |
| 6 | 2 | 63.3 | 79.7 | 5 / 35 | 3682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 54 | 30% |
| kc.mini.Mirage 0.2 | 53 | 53% |
| mz.MicroSheep 1.0 | 10 | 90% |
| cx.Princess 1.0 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 1057. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 62 | 43% | 78 |
| kc.mini.Mirage 0.2 | 57 | 39% | 91 |
| mz.MicroSheep 1.0 | 11 | 8% | 17 |
| cx.Princess 1.0 | 5 | 3% | 9 |
| sadoner.killer 0.2 | 5 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

