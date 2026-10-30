# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.6 | 54 / 210 | 2.30 | 16.9% | 29387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 147 |
| hadur117.mini.DeiseSCAL 0.4 | 2.0 | 16.9% | 54 |
| sgp.JollyNinja 3.53 | 3.8 | 11.7% | 8 |
| mz.MicroGodMelee 1 | 4.2 | 10.4% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.3% | 2 |
| lorneswork.Predator 1.0 | 5.3 | 9.8% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 85.4 | 8 / 35 | 4814 |
| 2 | 2 | 66.3 | 83.8 | 8 / 35 | 4964 |
| 3 | 2 | 67.3 | 85.7 | 12 / 35 | 4909 |
| 4 | 2 | 67.6 | 86.7 | 11 / 35 | 5128 |
| 5 | 2 | 65.9 | 85.1 | 6 / 35 | 4554 |
| 6 | 2 | 67.0 | 86.7 | 9 / 35 | 5018 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 17% |
| sgp.JollyNinja 3.53 | 13 | 100% |
| lorneswork.Predator 1.0 | 10 | 100% |
| mz.MicroGodMelee 1 | 6 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 67% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1245. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 83% | 154 |
| sgp.JollyNinja 3.53 | 8 | 5% | 17 |
| mz.MicroGodMelee 1 | 6 | 4% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 5 |
| adt.Ar2 1.0 | 4 | 3% | 5 |
| lorneswork.Predator 1.0 | 3 | 2% | 11 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.0 | 99 / 210 | 2.62 | 17.3% | 27334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.2 | 17.3% | 99 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.7% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.5% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.2% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 8.9% | 7 |
| Noran.BitchingElk 0.054 | 6.8 | 7.8% | 7 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.6% | 2 |
| stelo.PatternRobot 1.0 | 7.8 | 7.3% | 4 |
| sch.Simone 0.3d | 8.3 | 7.2% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 85.4 | 18 / 35 | 5022 |
| 2 | 1 | 66.1 | 81.9 | 16 / 35 | 4373 |
| 3 | 2 | 63.9 | 75.9 | 11 / 35 | 4338 |
| 4 | 1 | 65.8 | 81.3 | 17 / 35 | 4534 |
| 5 | 1 | 65.7 | 81.3 | 17 / 35 | 4501 |
| 6 | 1 | 68.1 | 86.3 | 20 / 35 | 4566 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 47 | 70% |
| pulsar.PulsarMax 0.8.9 | 47 | 66% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 90% |
| sch.Simone 0.3d | 9 | 78% |
| Noran.BitchingElk 0.054 | 8 | 75% |
| stelo.PatternRobot 1.0 | 7 | 86% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 39 | 35% | 71 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 22% | 62 |
| stelo.PatternRobot 1.0 | 13 | 12% | 15 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 9% | 14 |
| sch.Simone 0.3d | 8 | 7% | 12 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 6% | 17 |
| Noran.BitchingElk 0.054 | 4 | 4% | 12 |
| fnc.bandit.Bandit 5.2.0 | 4 | 4% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 95.3 | 161 / 210 | 1.42 | 20.7% | 36608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 20.7% | 161 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.1% | 9 |
| radnor.DoctorBob 1.42 | 3.0 | 13.1% | 10 |
| vuen.Cake 2.51 | 3.2 | 12.9% | 29 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.9 | 24 / 35 | 6221 |
| 2 | 1 | 72.1 | 94.9 | 28 / 35 | 6566 |
| 3 | 1 | 70.8 | 95.9 | 28 / 35 | 5805 |
| 4 | 1 | 71.5 | 97.1 | 29 / 35 | 6076 |
| 5 | 1 | 70.8 | 94.3 | 27 / 35 | 6088 |
| 6 | 1 | 70.3 | 94.6 | 25 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 77 | 71% |
| kawigi.nano.Lib 1.0 | 55 | 93% |
| radnor.DoctorBob 1.42 | 44 | 93% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| urdos.URDOS 1.3 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 1031. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 25 | 51% | 80 |
| radnor.DoctorBob 1.42 | 10 | 20% | 43 |
| kawigi.nano.Lib 1.0 | 9 | 18% | 63 |
| urdos.URDOS 1.3 | 3 | 6% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 4% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 5 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.0 | 37 / 210 | 2.17 | 17.5% | 32724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 168 |
| hadur117.mini.DeiseSCAL 0.4 | 2.0 | 17.5% | 37 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.0% | 1 |
| josago.Jorgito 0.16 | 5.2 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 7.1% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.3% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.5% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 89.2 | 8 / 35 | 5372 |
| 2 | 2 | 68.1 | 87.3 | 6 / 35 | 5471 |
| 3 | 2 | 66.7 | 83.2 | 5 / 35 | 5109 |
| 4 | 2 | 69.4 | 87.9 | 7 / 35 | 6079 |
| 5 | 2 | 67.7 | 86.7 | 6 / 35 | 5209 |
| 6 | 2 | 67.8 | 87.6 | 5 / 35 | 5484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 168 | 18% |
| apc.LeeroyJenkins2 1.0 | 6 | 83% |
| TNT.TNT 0.99.1 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 1513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 89% | 183 |
| apc.LeeroyJenkins2 1.0 | 9 | 5% | 15 |
| josago.Jorgito 0.16 | 3 | 2% | 4 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 73.6 | 27 / 210 | 3.38 | 13.7% | 19680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.8% | 107 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 56 |
| hadur117.mini.DeiseSCAL 0.4 | 3.0 | 13.7% | 27 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 14 |
| ms.Ares 0.19 | 5.0 | 9.6% | 2 |
| axeBots.HataMoto 3.09 | 6.0 | 8.3% | 4 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 72.7 | 6 / 35 | 3644 |
| 2 | 3 | 60.4 | 72.1 | 1 / 35 | 3263 |
| 3 | 3 | 61.4 | 73.3 | 6 / 35 | 3162 |
| 4 | 3 | 60.3 | 71.7 | 4 / 35 | 3068 |
| 5 | 3 | 60.9 | 70.8 | 3 / 35 | 3323 |
| 6 | 3 | 63.3 | 81.0 | 7 / 35 | 3220 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 19% |
| justin.DemonicRage 3.4 | 35 | 31% |
| wompi.Numbat 2.1 | 8 | 88% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 70 | 38% | 79 |
| justin.DemonicRage 3.4 | 63 | 34% | 73 |
| wompi.Numbat 2.1 | 20 | 11% | 25 |
| ms.Ares 0.19 | 11 | 6% | 11 |
| axeBots.HataMoto 3.09 | 10 | 5% | 12 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.0 | 99 / 210 | 2.44 | 17.4% | 27018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 17.4% | 99 |
| jekl.StoneGhost 0.7 | 2.2 | 14.4% | 23 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 13.5% | 34 |
| origin.SleepSiphon 1.7b | 3.5 | 13.7% | 46 |
| mld.Wisdom 1.0 | 5.0 | 9.7% | 1 |
| gg.Wolverine 2.0 | 6.5 | 8.1% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.8% | 4 |
| spinnercat.Omen 1.0 | 7.8 | 6.9% | 0 |
| DBall.NUKE 0.1 | 8.3 | 6.2% | 2 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.6 | 18 / 35 | 4580 |
| 2 | 1 | 66.3 | 82.2 | 14 / 35 | 4736 |
| 3 | 1 | 66.6 | 82.9 | 12 / 35 | 4796 |
| 4 | 1 | 67.1 | 85.1 | 17 / 35 | 4359 |
| 5 | 1 | 66.5 | 82.5 | 19 / 35 | 4450 |
| 6 | 1 | 66.4 | 83.5 | 19 / 35 | 4097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 37 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 54% |
| jekl.StoneGhost 0.7 | 34 | 88% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| mld.Wisdom 1.0 | 5 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 839. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 32% | 57 |
| jekl.StoneGhost 0.7 | 35 | 31% | 60 |
| origin.SleepSiphon 1.7b | 29 | 25% | 59 |
| mld.Wisdom 1.0 | 4 | 4% | 9 |
| spinnercat.Omen 1.0 | 4 | 4% | 5 |
| gg.Wolverine 2.0 | 3 | 3% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 8 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 93.7 | 131 / 210 | 1.57 | 19.9% | 33224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.2 | 19.9% | 131 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 46 |
| rtk.Tachikoma 1.0 | 2.7 | 16.8% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.4% | 3 |
| franzor.Lizt 1.3.1 | 4.7 | 10.2% | 7 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.7% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.7 | 23 / 35 | 5534 |
| 2 | 1 | 71.6 | 94.9 | 25 / 35 | 5442 |
| 3 | 1 | 71.8 | 94.0 | 25 / 35 | 5863 |
| 4 | 1 | 71.5 | 94.3 | 22 / 35 | 5601 |
| 5 | 2 | 69.7 | 90.2 | 12 / 35 | 5284 |
| 6 | 1 | 71.7 | 95.2 | 24 / 35 | 5500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 103 | 84% |
| rsalesc.melee.Monk 0.3.6c | 54 | 30% |
| oog.melee.CapuletDroid 1.1 | 23 | 91% |
| franzor.Lizt 1.3.1 | 7 | 71% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 1522. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 46 | 58% | 70 |
| rtk.Tachikoma 1.0 | 26 | 33% | 111 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 24 |
| franzor.Lizt 1.3.1 | 2 | 3% | 0 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.7 | 143 / 210 | 1.84 | 19.5% | 29148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.5% | 143 |
| shrub.Vapour v159 | 2.3 | 12.8% | 24 |
| tm.Yuugao 1.0 | 2.7 | 13.2% | 25 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.1% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.8 | 8.7% | 4 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.4% | 2 |
| m3thos.Eva00 1.1 | 6.3 | 8.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 6.9% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.2% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 92.4 | 23 / 35 | 4858 |
| 2 | 1 | 70.3 | 93.7 | 26 / 35 | 5268 |
| 3 | 1 | 67.6 | 84.8 | 20 / 35 | 4760 |
| 4 | 1 | 68.7 | 90.2 | 24 / 35 | 4560 |
| 5 | 1 | 69.1 | 89.5 | 26 / 35 | 4863 |
| 6 | 1 | 69.7 | 93.7 | 24 / 35 | 4839 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 63 | 79% |
| shrub.Vapour v159 | 44 | 82% |
| Krabb.sliNk.Garm 0.9u | 22 | 82% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 94% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 91% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 42% | 82 |
| shrub.Vapour v159 | 14 | 21% | 49 |
| Krabb.sliNk.Garm 0.9u | 9 | 13% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 10% | 26 |
| m3thos.Eva00 1.1 | 5 | 7% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 2 | 3% | 16 |
| zyx.nano.BacillusComma 1.0 | 2 | 3% | 3 |
| SHAM.WOW 1.4 | 0 | 0% | 2 |

## Melee bench: F09

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.0 | 70 / 210 | 2.98 | 15.9% | 24013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 98 |
| hadur117.mini.DeiseSCAL 0.4 | 2.0 | 15.9% | 70 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 18 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 9.8% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.3% | 8 |
| dft.Calliope 5.6 | 7.2 | 7.3% | 3 |
| step.nanoPri 1.0 | 7.8 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 73.0 | 10 / 35 | 3798 |
| 2 | 2 | 65.2 | 79.7 | 13 / 35 | 4106 |
| 3 | 2 | 63.3 | 75.2 | 11 / 35 | 3705 |
| 4 | 2 | 65.4 | 80.3 | 12 / 35 | 4024 |
| 5 | 2 | 65.7 | 81.3 | 12 / 35 | 4096 |
| 6 | 2 | 65.4 | 78.4 | 12 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 52 | 44% |
| kc.micro.Figment 1.0 | 28 | 79% |
| mc2.enemy.Original 0.9 | 15 | 93% |
| yagami.Tidus 0.11 | 8 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| step.nanoPri 1.0 | 2 | 100% |
| dft.Calliope 5.6 | 2 | 0% |

Hadur died in 141 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 40% | 79 |
| kc.micro.Figment 1.0 | 32 | 23% | 55 |
| yagami.Tidus 0.11 | 16 | 11% | 26 |
| mc2.enemy.Original 0.9 | 10 | 7% | 23 |
| pedersen.Grishnakh 1.0 | 10 | 7% | 10 |
| robar.nano.Assertive_Melee 0.2 | 9 | 6% | 10 |
| dft.Calliope 5.6 | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 95.2 | 170 / 210 | 1.43 | 20.4% | 32647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 20.4% | 170 |
| DTF.Kludgy 1.2b | 2.7 | 13.8% | 15 |
| ejb.Polaris 1.0.1 | 3.0 | 12.4% | 9 |
| ne.Chimera 1.2 | 3.3 | 12.0% | 9 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 1 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.3% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.3 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.0 | 27 / 35 | 5194 |
| 2 | 1 | 70.1 | 93.0 | 27 / 35 | 5471 |
| 3 | 1 | 70.4 | 93.7 | 26 / 35 | 5290 |
| 4 | 1 | 71.5 | 95.6 | 29 / 35 | 5842 |
| 5 | 1 | 71.1 | 97.8 | 29 / 35 | 5220 |
| 6 | 1 | 71.8 | 98.1 | 32 / 35 | 5630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 62 | 92% |
| DTF.Kludgy 1.2b | 57 | 82% |
| ne.Chimera 1.2 | 20 | 80% |
| tvv.micro.Antares 1.1.1 | 20 | 90% |
| vStar.RAFzilla 2.15 | 18 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 945. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 22 | 54% | 65 |
| ne.Chimera 1.2 | 9 | 22% | 27 |
| ejb.Polaris 1.0.1 | 6 | 15% | 62 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 13 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| vStar.RAFzilla 2.15 | 0 | 0% | 16 |
| kurios.DOSexe .9b | 0 | 0% | 13 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 5 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 82.7 | 95 / 210 | 2.56 | 17.3% | 26791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 17.3% | 95 |
| rz.Aleph 0.34 | 2.0 | 15.5% | 52 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.0% | 10 |
| djc.DynaBot 0.1.1 | 3.8 | 11.2% | 18 |
| br2.MobyDickBot 1.6 | 5.8 | 9.1% | 9 |
| rdt199.Warlord 0.73 | 5.8 | 9.4% | 21 |
| uji.YellohFellah 1.0 | 6.3 | 8.9% | 6 |
| KiraNL.Chupacabra 0.4 | 8.3 | 6.7% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 4.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.3 | 16 / 35 | 4497 |
| 2 | 1 | 65.9 | 82.2 | 14 / 35 | 4398 |
| 3 | 1 | 65.5 | 81.6 | 15 / 35 | 4256 |
| 4 | 1 | 66.1 | 81.6 | 18 / 35 | 4356 |
| 5 | 1 | 66.0 | 81.3 | 15 / 35 | 4410 |
| 6 | 1 | 68.4 | 89.2 | 17 / 35 | 4874 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 65% |
| djc.DynaBot 0.1.1 | 26 | 77% |
| br2.MobyDickBot 1.6 | 14 | 64% |
| cx.mini.Nimrod 0.55 | 14 | 86% |
| uji.YellohFellah 1.0 | 12 | 83% |
| rdt199.Warlord 0.73 | 7 | 57% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 45 | 39% | 83 |
| djc.DynaBot 0.1.1 | 21 | 18% | 34 |
| cx.mini.Nimrod 0.55 | 18 | 16% | 29 |
| rdt199.Warlord 0.73 | 11 | 10% | 19 |
| br2.MobyDickBot 1.6 | 8 | 7% | 17 |
| uji.YellohFellah 1.0 | 4 | 3% | 18 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.4 | 142 / 210 | 1.96 | 18.5% | 23225 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.5% | 142 |
| bts.wiki.RipCurl 0.9b | 2.7 | 12.9% | 16 |
| nat.PallasHawk 1.0 | 3.3 | 12.3% | 18 |
| darkcanuck.Leon 1.01 | 3.3 | 12.3% | 16 |
| brainfade.melee.Genghis 0.36 | 4.7 | 10.4% | 11 |
| jrm.Test0 1.0 | 6.3 | 8.0% | 1 |
| jp.Perpy 16.0 | 7.5 | 6.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 8.7 | 6.4% | 5 |
| stuff.Vlad 0.1 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.3 | 23 / 35 | 3691 |
| 2 | 1 | 66.9 | 86.7 | 23 / 35 | 3734 |
| 3 | 1 | 67.7 | 90.2 | 22 / 35 | 3755 |
| 4 | 1 | 69.3 | 91.7 | 26 / 35 | 4278 |
| 5 | 1 | 66.4 | 84.4 | 21 / 35 | 3739 |
| 6 | 1 | 69.7 | 95.9 | 27 / 35 | 4028 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 88% |
| darkcanuck.Leon 1.01 | 45 | 93% |
| nat.PallasHawk 1.0 | 39 | 90% |
| brainfade.melee.Genghis 0.36 | 16 | 81% |
| jaybot.bots.Oddball 4.0 | 9 | 56% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 69 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 14 | 20% | 52 |
| darkcanuck.Leon 1.01 | 11 | 16% | 58 |
| brainfade.melee.Genghis 0.36 | 11 | 16% | 17 |
| bts.wiki.RipCurl 0.9b | 10 | 14% | 46 |
| jp.Perpy 16.0 | 7 | 10% | 9 |
| jaybot.bots.Oddball 4.0 | 6 | 9% | 9 |
| jrm.Test0 1.0 | 5 | 7% | 10 |
| cs.sheldor.Talon 1.1 | 4 | 6% | 8 |
| stuff.Vlad 0.1 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 86.3 | 89 / 210 | 2.23 | 16.9% | 25262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.7 | 16.9% | 89 |
| mn.Combat 3.25.0 | 2.0 | 16.0% | 67 |
| ags.Glacier 0.2.11 | 2.3 | 16.4% | 37 |
| shinh.Entangled 0.3 | 4.2 | 11.8% | 12 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.4% | 5 |
| apc.Colossus2 0.17 | 6.5 | 7.1% | 0 |
| stelo.Wang 1.0 | 6.5 | 7.1% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 88.3 | 15 / 35 | 4410 |
| 2 | 2 | 66.6 | 85.7 | 15 / 35 | 4262 |
| 3 | 2 | 67.4 | 86.7 | 19 / 35 | 4171 |
| 4 | 1 | 66.6 | 87.3 | 16 / 35 | 4179 |
| 5 | 1 | 65.7 | 84.8 | 12 / 35 | 4054 |
| 6 | 3 | 66.0 | 85.1 | 12 / 35 | 4186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 66 | 45% |
| ags.Glacier 0.2.11 | 56 | 73% |
| shinh.Entangled 0.3 | 16 | 88% |
| gh.micro.Gruweltje 0.7 | 6 | 67% |

Hadur died in 122 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 58 | 48% | 87 |
| ags.Glacier 0.2.11 | 29 | 24% | 72 |
| shinh.Entangled 0.3 | 20 | 16% | 33 |
| gh.micro.Gruweltje 0.7 | 6 | 5% | 9 |
| stelo.Wang 1.0 | 5 | 4% | 5 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.9 | 154 / 210 | 1.55 | 20.1% | 31857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 20.1% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 29 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.9% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.3 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.4% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.3% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.3% | 3 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 95.2 | 26 / 35 | 5492 |
| 2 | 1 | 70.9 | 95.2 | 28 / 35 | 5439 |
| 3 | 1 | 70.2 | 93.3 | 25 / 35 | 5337 |
| 4 | 1 | 70.3 | 93.7 | 26 / 35 | 5232 |
| 5 | 1 | 69.7 | 93.3 | 22 / 35 | 5141 |
| 6 | 1 | 70.5 | 92.4 | 27 / 35 | 5216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 86 | 87% |
| catcat20.shape.Theta 0.018 | 56 | 73% |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 92% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 23 | 41% | 99 |
| catcat20.shape.Theta 0.018 | 20 | 36% | 60 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 4 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 115 / 210 | 2.38 | 18.4% | 30870 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.4% | 115 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.1% | 17 |
| emp.Yngwie 1.11 | 3.3 | 12.6% | 39 |
| mld.DustBunny 3.8 | 4.2 | 11.9% | 7 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.0% | 12 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.2% | 21 |
| lambdaxy.TBot 0.1 | 7.2 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.2 | 22 / 35 | 5590 |
| 2 | 1 | 68.4 | 85.1 | 20 / 35 | 5219 |
| 3 | 1 | 67.8 | 84.4 | 20 / 35 | 5023 |
| 4 | 1 | 68.1 | 84.4 | 17 / 35 | 5160 |
| 5 | 1 | 66.4 | 79.0 | 17 / 35 | 4741 |
| 6 | 1 | 67.9 | 85.1 | 19 / 35 | 5137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 48 | 67% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| kawigi.robot.Girl 1.2 | 19 | 74% |
| cb.nano.Insomnia 1.0 | 18 | 94% |
| mld.DustBunny 3.8 | 16 | 94% |
| divineomega.TrialBot 0.003 | 7 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 25 | 26% | 71 |
| cb.nano.Insomnia 1.0 | 20 | 21% | 23 |
| mld.DustBunny 3.8 | 17 | 18% | 30 |
| kawigi.micro.Shiz 1.1 | 15 | 16% | 43 |
| kawigi.robot.Girl 1.2 | 14 | 15% | 24 |
| divineomega.TrialBot 0.003 | 2 | 2% | 10 |
| lambdaxy.TBot 0.1 | 2 | 2% | 5 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |

## Melee bench: F16

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 101 / 210 | 2.22 | 18.8% | 32954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.8% | 101 |
| gh.Griezel 0.5.2 | 2.0 | 16.5% | 68 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 27 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.4% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.0% | 1 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.1% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 18 / 35 | 5663 |
| 2 | 1 | 67.6 | 82.5 | 15 / 35 | 5275 |
| 3 | 1 | 69.6 | 89.2 | 20 / 35 | 5494 |
| 4 | 1 | 67.6 | 83.2 | 12 / 35 | 5365 |
| 5 | 1 | 70.2 | 90.2 | 21 / 35 | 5681 |
| 6 | 1 | 68.6 | 85.4 | 15 / 35 | 5476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 85 | 52% |
| techdude.forest.FlamingForest 1.1 | 29 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 90% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |
| tvv.nano.Polaris 1.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 62 | 56% | 111 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 17% | 40 |
| techdude.forest.FlamingForest 1.1 | 15 | 14% | 30 |
| bvh.fnr.Fenrir 0.36l | 4 | 4% | 7 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 10 |
| asd.Cthulhu 1.3 | 3 | 3% | 3 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| stelo.IntrinsicVolatility 1.4 | 1 | 1% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.0 | 111 / 210 | 2.44 | 17.9% | 29212 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 17.9% | 111 |
| et.Predator 1.8 | 2.5 | 13.6% | 27 |
| cx.BlestPain 1.41 | 3.3 | 12.5% | 29 |
| oog.melee.Mercutio 1.0 | 4.0 | 12.4% | 26 |
| nic.Nicator 2.4 | 4.7 | 10.9% | 10 |
| ahf.NanoAndrew .4 | 5.7 | 10.3% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 8.4% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 19 / 35 | 4993 |
| 2 | 1 | 66.9 | 83.2 | 19 / 35 | 4568 |
| 3 | 1 | 67.7 | 82.9 | 17 / 35 | 5159 |
| 4 | 1 | 66.1 | 79.7 | 17 / 35 | 4679 |
| 5 | 1 | 69.6 | 91.4 | 24 / 35 | 4846 |
| 6 | 1 | 66.4 | 81.0 | 15 / 35 | 4967 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 51 | 86% |
| cx.BlestPain 1.41 | 29 | 55% |
| oog.melee.Mercutio 1.0 | 27 | 74% |
| nic.Nicator 2.4 | 21 | 90% |
| ahf.NanoAndrew .4 | 13 | 85% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 955. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 25 | 25% | 64 |
| cx.BlestPain 1.41 | 25 | 25% | 47 |
| oog.melee.Mercutio 1.0 | 18 | 18% | 37 |
| nic.Nicator 2.4 | 14 | 14% | 30 |
| ahf.NanoAndrew .4 | 8 | 8% | 17 |
| maribo.melee.BMV 0.1 | 4 | 4% | 6 |
| tex.Longbot 0.4 | 4 | 4% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 89.4 | 135 / 210 | 1.96 | 18.7% | 26448 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.7% | 135 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.0% | 20 |
| agd.Mooserwirt2 2.7 | 2.8 | 11.8% | 19 |
| uji.DBH 1.1 | 4.2 | 11.1% | 7 |
| ratosh.Nobo 0.21 | 5.3 | 9.6% | 6 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.2% | 5 |
| sigterm.Sigterm 1.0 | 7.0 | 8.2% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.1% | 5 |
| stelo.WangRobot 1.0 | 9.3 | 5.7% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 85.4 | 18 / 35 | 3682 |
| 2 | 1 | 68.7 | 92.7 | 20 / 35 | 4469 |
| 3 | 1 | 69.3 | 93.0 | 27 / 35 | 4546 |
| 4 | 1 | 68.2 | 88.3 | 23 / 35 | 4372 |
| 5 | 1 | 68.6 | 87.6 | 26 / 35 | 4711 |
| 6 | 1 | 68.1 | 89.2 | 21 / 35 | 4668 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 83% |
| agd.Mooserwirt2 2.7 | 34 | 65% |
| uji.DBH 1.1 | 27 | 85% |
| spinnercat.Robovirus 2.718 | 16 | 88% |
| sigterm.Sigterm 1.0 | 10 | 80% |
| stelo.WangRobot 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 83% |
| ratosh.Nobo 0.21 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 22 | 29% | 73 |
| agd.Mooserwirt2 2.7 | 18 | 24% | 47 |
| ratosh.Nobo 0.21 | 10 | 13% | 19 |
| uji.DBH 1.1 | 9 | 12% | 24 |
| sigterm.Sigterm 1.0 | 5 | 7% | 11 |
| stelo.WangRobot 1.0 | 4 | 5% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 8 |
| spinnercat.Robovirus 2.718 | 2 | 3% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 6 |

## Melee bench: F19

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.6 | 166 / 210 | 1.49 | 20.8% | 33586 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 20.8% | 166 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.9% | 16 |
| mld.Infinity 2.2 | 2.5 | 14.3% | 26 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.4% | 1 |
| erdnis.Rover 0.3 | 4.7 | 10.3% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.1% | 1 |
| pac.ABC 2.1 | 7.3 | 6.9% | 0 |
| mbh.Mbh 0.1 | 7.7 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.4 | 28 / 35 | 5673 |
| 2 | 1 | 72.3 | 96.8 | 30 / 35 | 5788 |
| 3 | 1 | 71.0 | 93.7 | 26 / 35 | 5310 |
| 4 | 1 | 72.8 | 96.5 | 28 / 35 | 6440 |
| 5 | 1 | 71.7 | 95.9 | 28 / 35 | 5141 |
| 6 | 1 | 71.1 | 93.3 | 26 / 35 | 5234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 82 | 95% |
| mld.Infinity 2.2 | 68 | 85% |
| krillr.mini.JointStrike 2.0.0 | 13 | 100% |
| erdnis.Rover 0.3 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 1146. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 16 | 36% | 29 |
| davidalves.net.DuelistMiniMelee 1.2 | 14 | 31% | 109 |
| krillr.mini.JointStrike 2.0.0 | 7 | 16% | 28 |
| patson.PatsonTestBot 1.0 | 4 | 9% | 14 |
| erdnis.Rover 0.3 | 3 | 7% | 16 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 4 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.1 | 139 / 210 | 1.80 | 19.8% | 31833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.8% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 31 |
| fwb.Nine 1.0.1 | 3.7 | 11.1% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 10.9% | 4 |
| catcat20.Rabbit 0.001 | 4.3 | 10.4% | 13 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.8% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.7% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.0 | 26 / 35 | 5211 |
| 2 | 1 | 69.4 | 88.6 | 21 / 35 | 5272 |
| 3 | 1 | 70.6 | 94.3 | 25 / 35 | 5297 |
| 4 | 1 | 68.7 | 87.0 | 21 / 35 | 5241 |
| 5 | 1 | 70.4 | 92.7 | 23 / 35 | 5547 |
| 6 | 1 | 69.6 | 90.2 | 23 / 35 | 5265 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 85% |
| fwb.Nine 1.0.1 | 38 | 79% |
| catcat20.Rabbit 0.001 | 28 | 79% |
| nz.jdc.nano.GridFu 1.0 | 14 | 86% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 0% |

Hadur died in 72 of 210 rounds, at a mean tick of 1091. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 33 | 46% | 94 |
| fwb.Nine 1.0.1 | 11 | 15% | 23 |
| catcat20.Rabbit 0.001 | 10 | 14% | 35 |
| nz.jdc.nano.GridFu 1.0 | 9 | 13% | 31 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 12 |
| ntc.ControlledChaos 1.1.4 | 3 | 4% | 3 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.3 | 132 / 210 | 1.60 | 20.0% | 32763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 20.0% | 132 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 62 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.6% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 10.8% | 2 |
| eld.Hmm 1.0 | 5.5 | 7.9% | 6 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.3% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.6% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.3 | 20 / 35 | 5842 |
| 2 | 1 | 70.2 | 92.4 | 21 / 35 | 5491 |
| 3 | 1 | 70.5 | 93.0 | 23 / 35 | 5444 |
| 4 | 1 | 70.9 | 95.9 | 27 / 35 | 5059 |
| 5 | 1 | 69.7 | 91.7 | 21 / 35 | 5419 |
| 6 | 1 | 70.5 | 93.3 | 20 / 35 | 5508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 60% |
| dummy.mini.Scimitar 1.01 | 43 | 91% |
| eld.Hmm 1.0 | 12 | 75% |
| cf.RiO.RiOx 4.2.1 | 6 | 100% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 55 | 68% | 102 |
| dummy.mini.Scimitar 1.01 | 13 | 16% | 64 |
| cf.RiO.RiOx 4.2.1 | 6 | 7% | 20 |
| eld.Hmm 1.0 | 4 | 5% | 16 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.6 | 93 / 210 | 2.02 | 18.2% | 29590 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.2 | 18.2% | 93 |
| pe.SandboxDT 2.71m | 1.8 | 17.2% | 70 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.8% | 31 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.5% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.7% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 16 / 35 | 5031 |
| 2 | 2 | 68.6 | 88.9 | 13 / 35 | 5015 |
| 3 | 1 | 68.0 | 87.9 | 16 / 35 | 4737 |
| 4 | 1 | 67.6 | 86.7 | 13 / 35 | 4620 |
| 5 | 1 | 68.7 | 88.6 | 16 / 35 | 4906 |
| 6 | 1 | 69.8 | 91.1 | 19 / 35 | 5281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 72 | 39% |
| jlm.javaDisturbance 0.59 | 36 | 81% |
| kvk.HebusLeTroll 0.35 | 34 | 65% |
| bigpete.Stewie 1.0 | 12 | 83% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1162. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 59 | 50% | 86 |
| kvk.HebusLeTroll 0.35 | 34 | 29% | 59 |
| jlm.javaDisturbance 0.59 | 20 | 17% | 49 |
| bigpete.Stewie 1.0 | 2 | 2% | 9 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.0 | 150 / 210 | 1.63 | 20.0% | 30293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 20.0% | 150 |
| pe.SandboxLump 1.52 | 2.0 | 16.5% | 42 |
| cre.Karolos 0.32 | 3.0 | 13.8% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.5% | 3 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.2% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.1% | 0 |
| sample.Walls 1.0 | 7.3 | 8.0% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 7.9% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.3 | 24 / 35 | 5199 |
| 2 | 1 | 70.0 | 91.7 | 24 / 35 | 4668 |
| 3 | 1 | 72.9 | 98.4 | 31 / 35 | 5419 |
| 4 | 1 | 70.2 | 89.8 | 26 / 35 | 4883 |
| 5 | 1 | 71.3 | 93.3 | 24 / 35 | 5463 |
| 6 | 1 | 69.4 | 90.5 | 21 / 35 | 4661 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 91 | 79% |
| cre.Karolos 0.32 | 43 | 86% |
| stelo.AreaTargetingBot 1.1 | 22 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 88% |
| cw.megas.Blade 0.8 | 2 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 840. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 36 | 59% | 99 |
| cre.Karolos 0.32 | 12 | 20% | 48 |
| stelo.AreaTargetingBot 1.1 | 7 | 11% | 30 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 13 |
| cw.megas.Blade 0.8 | 2 | 3% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 9 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.2 | 87 / 210 | 2.88 | 15.7% | 21136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 15.7% | 87 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.3% | 39 |
| davidalves.Phoenix 0.54 | 3.5 | 12.6% | 32 |
| pedersen.Ugluk 1.1.1 | 3.8 | 12.9% | 22 |
| florent.XSeries.X2 0.12 | 4.2 | 12.2% | 23 |
| oog.melee.Corsair 1.0 | 6.3 | 8.7% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.6% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.0% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 1 |
| evd.X1 0.01 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 78.7 | 14 / 35 | 3443 |
| 2 | 1 | 63.8 | 77.8 | 13 / 35 | 3517 |
| 3 | 1 | 64.3 | 79.7 | 16 / 35 | 3487 |
| 4 | 1 | 65.4 | 82.5 | 17 / 35 | 3745 |
| 5 | 1 | 64.8 | 82.5 | 16 / 35 | 3543 |
| 6 | 1 | 62.0 | 73.7 | 11 / 35 | 3401 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 73% |
| davidalves.Phoenix 0.54 | 27 | 70% |
| pedersen.Ugluk 1.1.1 | 22 | 82% |
| florent.XSeries.X2 0.12 | 15 | 67% |
| stelo.SoJNanoMelee 1.1 | 12 | 92% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 25% | 59 |
| davidalves.Phoenix 0.54 | 26 | 21% | 40 |
| pedersen.Ugluk 1.1.1 | 26 | 21% | 36 |
| florent.XSeries.X2 0.12 | 23 | 18% | 38 |
| oog.melee.Corsair 1.0 | 7 | 6% | 15 |
| stelo.SoJNanoMelee 1.1 | 6 | 5% | 13 |
| evd.X1 0.01 | 2 | 2% | 4 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 3 |
3 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 89.9 | 155 / 210 | 1.90 | 19.4% | 26037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.4% | 155 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.0% | 11 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.6% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.1% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.0% | 6 |
| ds.Oo 2.2 | 5.7 | 8.2% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.0 | 6.8% | 0 |
| awesomeness.Elite 1.0 | 8.0 | 7.0% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.1 | 27 / 35 | 4761 |
| 2 | 1 | 68.5 | 88.3 | 25 / 35 | 4234 |
| 3 | 1 | 70.2 | 92.7 | 29 / 35 | 4391 |
| 4 | 1 | 68.4 | 88.6 | 24 / 35 | 4088 |
| 5 | 1 | 68.8 | 88.9 | 23 / 35 | 4308 |
| 6 | 1 | 69.2 | 90.2 | 27 / 35 | 4255 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 56 | 91% |
| voidious.micro.BlitzBat 1.05 | 52 | 98% |
| jdw.Hurricane 1.4 | 28 | 96% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| ds.Oo 2.2 | 7 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 5 | 60% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 14 | 25% | 63 |
| jdw.Hurricane 1.4 | 12 | 22% | 34 |
| voidious.micro.BlitzBat 1.05 | 11 | 20% | 57 |
| gre.svman4.Morfeas 1.4.1 | 6 | 11% | 18 |
| ds.Oo 2.2 | 4 | 7% | 14 |
| adt.Ar2 1.1 | 4 | 7% | 6 |
| amk.ChumbaMini 0.2 | 2 | 4% | 4 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 7 |
| awesomeness.Elite 1.0 | 1 | 2% | 6 |

## Melee bench: F26

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.1 | 137 / 210 | 1.80 | 19.5% | 32990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.5% | 137 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 34 |
| lrem.Spectre 0.4.4 | 3.3 | 12.2% | 13 |
| shu.nitro.LENIN .T34 | 3.7 | 11.8% | 21 |
| js.PinBall 1.6 | 5.2 | 10.3% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.3% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.5% | 0 |
| sample.SpinBot 1.0 | 8.8 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.1 | 26 / 35 | 5902 |
| 2 | 1 | 71.0 | 95.6 | 26 / 35 | 5709 |
| 3 | 1 | 69.2 | 88.9 | 20 / 35 | 5537 |
| 4 | 1 | 68.9 | 89.2 | 22 / 35 | 5137 |
| 5 | 1 | 69.8 | 91.1 | 21 / 35 | 5451 |
| 6 | 1 | 69.2 | 89.8 | 22 / 35 | 5254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 74% |
| shu.nitro.LENIN .T34 | 49 | 84% |
| lrem.Spectre 0.4.4 | 38 | 84% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| js.PinBall 1.6 | 7 | 86% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 29 | 40% | 66 |
| shu.nitro.LENIN .T34 | 20 | 27% | 71 |
| lrem.Spectre 0.4.4 | 11 | 15% | 33 |
| jaybot.adv.bots.JayBot 2.0 | 8 | 11% | 14 |
| js.PinBall 1.6 | 3 | 4% | 10 |
| gh.mini.GrubbmOne 1.0 | 2 | 3% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 6 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |

## Melee bench: F27

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 89.4 | 144 / 210 | 1.95 | 18.9% | 26962 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.9% | 144 |
| mk.Alpha 0.2.1 | 2.3 | 13.5% | 32 |
| EH.Eagle 1.0.6 | 3.8 | 11.1% | 3 |
| wee.Gem 1.8.4 | 3.8 | 11.1% | 19 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 10.3% | 7 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.3% | 1 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.6% | 2 |
| joe.ADinosaur 1.0 | 7.7 | 7.4% | 1 |
| cs.Grudge 1.0 | 9.0 | 5.4% | 0 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.2 | 24 / 35 | 4642 |
| 2 | 1 | 67.0 | 85.7 | 19 / 35 | 4345 |
| 3 | 1 | 68.7 | 89.8 | 24 / 35 | 4559 |
| 4 | 1 | 69.4 | 91.7 | 29 / 35 | 4493 |
| 5 | 1 | 67.0 | 85.7 | 22 / 35 | 4228 |
| 6 | 1 | 69.8 | 93.3 | 26 / 35 | 4695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 82% |
| wee.Gem 1.8.4 | 32 | 84% |
| EH.Eagle 1.0.6 | 27 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 7 | 86% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 35% | 77 |
| sheldor.melee.nano.TestMelee 0.1 | 10 | 15% | 29 |
| wee.Gem 1.8.4 | 7 | 11% | 35 |
| EH.Eagle 1.0.6 | 7 | 11% | 28 |
| joe.ADinosaur 1.0 | 7 | 11% | 10 |
| throxbot.ThroxBot 0.1 | 5 | 8% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 6% | 14 |
| caimano.Furia_Ceca 0.22 | 3 | 5% | 4 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.6 | 147 / 210 | 1.75 | 19.3% | 26096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.3% | 147 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 29 |
| uji.Antique 1.0 | 3.5 | 11.1% | 9 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.7% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.8% | 5 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.7% | 3 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.9% | 3 |
| stelo.PianistNano 1.2 | 8.7 | 5.9% | 1 |
| matt.advanced.Katana 1.0 | 9.0 | 6.0% | 1 |
| stelo.Lifestealer 1.0 | 9.3 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.3 | 21 / 35 | 4152 |
| 2 | 1 | 68.3 | 89.5 | 25 / 35 | 4168 |
| 3 | 1 | 68.8 | 90.2 | 24 / 35 | 4430 |
| 4 | 1 | 70.2 | 94.3 | 28 / 35 | 4538 |
| 5 | 1 | 70.1 | 94.6 | 26 / 35 | 4617 |
| 6 | 1 | 69.2 | 93.0 | 23 / 35 | 4191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 95 | 82% |
| uji.Antique 1.0 | 40 | 88% |
| qohnil.blot.BlotBot 3.61 | 19 | 74% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 45% | 91 |
| qohnil.blot.BlotBot 3.61 | 10 | 16% | 26 |
| uji.Antique 1.0 | 8 | 13% | 43 |
| pfvicm.Sobieski 7.2.3b | 8 | 13% | 17 |
| amk.ChumbaWumba 0.3 | 4 | 6% | 14 |
| ahr.ice.Ice 1.0.2 | 3 | 5% | 11 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.0 | 114 / 210 | 2.17 | 18.8% | 28659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.8% | 114 |
| deewiant.Anomaly 0.2 | 2.3 | 14.9% | 36 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.6% | 44 |
| myl.micro.Troodon 1.10 | 4.3 | 11.8% | 6 |
| jok.PheonixM 0.1.2 | 4.7 | 10.4% | 7 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.9% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.8% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.7 | 20 / 35 | 5008 |
| 2 | 1 | 69.1 | 88.3 | 20 / 35 | 4698 |
| 3 | 1 | 69.1 | 87.6 | 21 / 35 | 4768 |
| 4 | 1 | 68.3 | 84.8 | 17 / 35 | 4743 |
| 5 | 1 | 69.0 | 88.9 | 18 / 35 | 4828 |
| 6 | 1 | 67.3 | 81.0 | 18 / 35 | 4614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 62 | 71% |
| zyx.mega.YersiniaPestis 3.1 | 51 | 65% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 6 | 100% |
| DBall.Anarchy 0.1 | 6 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 44 | 45% | 92 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 29% | 58 |
| myl.micro.Troodon 1.10 | 13 | 13% | 30 |
| jok.PheonixM 0.1.2 | 9 | 9% | 18 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 5 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 75.8 | 63 / 210 | 3.18 | 14.9% | 22041 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 14.9% | 63 |
| catcat20.Matcha 0.006 | 2.5 | 14.2% | 45 |
| darkcanuck.B26354 1.06 | 3.7 | 13.0% | 43 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.9% | 29 |
| oog.melee.Capulet 1.2 | 4.0 | 12.9% | 21 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.4% | 5 |
| ntc.Opposite 1.5 | 6.8 | 7.9% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 6.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 6.5% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 77.5 | 10 / 35 | 3546 |
| 2 | 1 | 63.0 | 76.2 | 12 / 35 | 3649 |
| 3 | 1 | 62.5 | 74.0 | 9 / 35 | 3819 |
| 4 | 1 | 62.7 | 74.6 | 9 / 35 | 3886 |
| 5 | 1 | 63.0 | 75.2 | 12 / 35 | 3532 |
| 6 | 1 | 63.2 | 77.5 | 11 / 35 | 3609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 29 | 55% |
| darkcanuck.B26354 1.06 | 25 | 56% |
| oog.melee.Capulet 1.2 | 24 | 83% |
| stelo.PastFuture 2.3.2 | 19 | 58% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 36 | 24% | 47 |
| darkcanuck.B26354 1.06 | 34 | 23% | 47 |
| catcat20.Matcha 0.006 | 27 | 18% | 43 |
| oog.melee.Capulet 1.2 | 20 | 14% | 38 |
| tripphippy.Alice 1.1 | 9 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 9 | 6% | 10 |
| ntc.Opposite 1.5 | 7 | 5% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 7 |

## Melee bench: F31

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 75.1 | 61 / 210 | 3.24 | 14.8% | 20232 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.5% | 88 |
| hadur117.mini.DeiseSCAL 0.4 | 2.0 | 14.8% | 61 |
| gh.mini.Griezel 0.2 | 3.2 | 12.9% | 35 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 12.3% | 15 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.6% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.5% | 1 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 2 |
| fm.mammillarias 1.3 | 8.2 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 77.5 | 10 / 35 | 3449 |
| 2 | 2 | 63.5 | 78.4 | 10 / 35 | 3450 |
| 3 | 2 | 63.0 | 79.0 | 8 / 35 | 3425 |
| 4 | 2 | 61.4 | 71.7 | 11 / 35 | 3124 |
| 5 | 2 | 60.6 | 69.5 | 9 / 35 | 3176 |
| 6 | 2 | 63.0 | 74.3 | 13 / 35 | 3608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 55% |
| gh.mini.Griezel 0.2 | 21 | 48% |
| spinnercat.micro.Tyger 0.1 | 12 | 92% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| timmit.nano.TimDog 0.33 | 4 | 75% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 36% | 77 |
| gh.mini.Griezel 0.2 | 38 | 26% | 52 |
| spinnercat.micro.Tyger 0.1 | 27 | 18% | 37 |
| d414.nano.Quantum 1.0.0 | 11 | 7% | 20 |
| timmit.nano.TimDog 0.33 | 9 | 6% | 11 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 6 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 4 |

## Melee bench: F32

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 89.1 | 127 / 210 | 1.98 | 18.5% | 27585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.5% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 45 |
| apc.botM 3.0 | 3.2 | 12.7% | 23 |
| lxx.ConceptA 0.8 | 3.8 | 10.8% | 3 |
| vjik.UnViolation 1.1 | 5.7 | 8.6% | 5 |
| bayen.UbaMicro 1.4 | 6.5 | 8.4% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.4% | 0 |
| yk.JahMicro 1.0 | 7.5 | 6.7% | 2 |
| conscience.Electron 1.3g | 8.5 | 6.6% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 86.7 | 17 / 35 | 4316 |
| 2 | 1 | 68.8 | 89.8 | 25 / 35 | 4959 |
| 3 | 1 | 68.4 | 91.7 | 22 / 35 | 4416 |
| 4 | 1 | 66.3 | 83.2 | 18 / 35 | 4602 |
| 5 | 1 | 69.2 | 93.0 | 22 / 35 | 4811 |
| 6 | 1 | 68.1 | 90.2 | 23 / 35 | 4481 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 78 | 64% |
| apc.botM 3.0 | 42 | 76% |
| lxx.ConceptA 0.8 | 19 | 95% |
| vjik.UnViolation 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 5 | 100% |
| yk.JahMicro 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 67% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 46% | 85 |
| apc.botM 3.0 | 18 | 22% | 55 |
| lxx.ConceptA 0.8 | 13 | 16% | 24 |
| bayen.UbaMicro 1.4 | 5 | 6% | 13 |
| panzer.Panzer 0.2 | 3 | 4% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
| conscience.Electron 1.3g | 2 | 2% | 3 |
| vjik.UnViolation 1.1 | 1 | 1% | 13 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |

## Melee bench: F33

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.3 | 146 / 210 | 1.88 | 19.7% | 29802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.7% | 146 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.3% | 14 |
| labg.Cataclysm 2.05 | 3.8 | 11.2% | 11 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.6% | 6 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.7% | 1 |
| baal.nano.N 1.42 | 6.7 | 8.2% | 1 |
| zyx.micro.Ant 1.1 | 8.5 | 4.8% | 1 |
| sanja.First 0.1 | 8.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 24 / 35 | 5117 |
| 2 | 1 | 71.5 | 93.7 | 29 / 35 | 5129 |
| 3 | 1 | 69.3 | 89.2 | 23 / 35 | 4681 |
| 4 | 1 | 71.8 | 94.0 | 27 / 35 | 5478 |
| 5 | 1 | 68.2 | 85.1 | 19 / 35 | 4652 |
| 6 | 1 | 69.6 | 89.5 | 24 / 35 | 4745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 45 | 87% |
| gre.svman4.Leonidas 1.3.2 | 29 | 93% |
| labg.Cataclysm 2.05 | 22 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 100% |
| baal.nano.N 1.42 | 3 | 67% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 25 | 38% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 25% | 52 |
| labg.Cataclysm 2.05 | 10 | 15% | 28 |
| gre.svman4.Leonidas 1.3.2 | 7 | 11% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 6% | 12 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 3% | 3 |
| baal.nano.N 1.42 | 1 | 2% | 7 |
| sanja.First 0.1 | 0 | 0% | 4 |
| zyx.micro.Ant 1.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.4 | 86 / 210 | 2.14 | 17.7% | 27893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.3 | 17.7% | 86 |
| stelo.Spread 0.9 | 1.7 | 17.2% | 78 |
| kid.Gladiator .7.2 | 3.0 | 15.7% | 30 |
| tcf.Reach 3 | 4.5 | 11.1% | 5 |
| jcs.Seth 1.8 | 4.7 | 10.9% | 11 |
| cli.Dancer 1.1 | 5.8 | 9.3% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 0 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.5% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.4 | 12 / 35 | 4406 |
| 2 | 2 | 66.5 | 82.2 | 12 / 35 | 4350 |
| 3 | 2 | 67.2 | 86.0 | 11 / 35 | 4495 |
| 4 | 1 | 69.1 | 89.8 | 17 / 35 | 4778 |
| 5 | 1 | 69.0 | 89.2 | 17 / 35 | 4821 |
| 6 | 1 | 69.8 | 91.4 | 17 / 35 | 5043 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 84 | 49% |
| kid.Gladiator .7.2 | 39 | 64% |
| jcs.Seth 1.8 | 16 | 75% |
| tcf.Reach 3 | 7 | 71% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 44% | 94 |
| kid.Gladiator .7.2 | 47 | 38% | 68 |
| jcs.Seth 1.8 | 13 | 10% | 25 |
| tcf.Reach 3 | 8 | 6% | 18 |
| ratosh.Wesco 1.4 | 1 | 1% | 4 |
| cli.Dancer 1.1 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 79.3 | 45 / 210 | 2.86 | 15.1% | 21028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 133 |
| hadur117.mini.DeiseSCAL 0.4 | 2.0 | 15.1% | 45 |
| gh.mini.Gruwel 0.9 | 3.5 | 13.0% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.7% | 9 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 5 |
| wit.Chuliath 1.0 | 6.5 | 7.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 78.1 | 5 / 35 | 3587 |
| 2 | 2 | 64.1 | 80.3 | 7 / 35 | 3650 |
| 3 | 2 | 64.8 | 81.6 | 12 / 35 | 3541 |
| 4 | 2 | 62.7 | 77.1 | 7 / 35 | 3201 |
| 5 | 2 | 63.3 | 77.8 | 7 / 35 | 3584 |
| 6 | 2 | 64.0 | 81.0 | 7 / 35 | 3465 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 74 | 20% |
| gh.mini.Gruwel 0.9 | 20 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 89% |
| rz.HawkOnFire 0.1 | 8 | 63% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 86 | 52% | 100 |
| gh.mini.Gruwel 0.9 | 35 | 21% | 51 |
| dmh.robocode.robot.BlackDeath 9.2 | 20 | 12% | 29 |
| rz.HawkOnFire 0.1 | 17 | 10% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 95.1 | 174 / 210 | 1.44 | 21.2% | 32437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 21.2% | 174 |
| alpha.RainingFire 1.0 | 2.3 | 12.2% | 12 |
| bzdp.Pansy 2.1 | 3.3 | 11.4% | 9 |
| mz.Cork 0.1 | 4.3 | 10.5% | 3 |
| bvh.micro.Freya 0.3 | 5.0 | 10.3% | 5 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.3% | 3 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.9% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.2 | 28 / 35 | 5561 |
| 2 | 1 | 70.9 | 93.3 | 28 / 35 | 5200 |
| 3 | 1 | 72.5 | 97.8 | 33 / 35 | 5633 |
| 4 | 1 | 71.4 | 96.5 | 27 / 35 | 5564 |
| 5 | 1 | 70.4 | 92.1 | 28 / 35 | 5169 |
| 6 | 1 | 71.5 | 95.9 | 30 / 35 | 5310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 88% |
| bvh.micro.Freya 0.3 | 37 | 95% |
| mz.Cork 0.1 | 33 | 97% |
| alpha.RainingFire 1.0 | 28 | 82% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 13 | 85% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| dl.BetterWalls 1.0 | 9 | 89% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 36 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 36% | 33 |
| bzdp.Pansy 2.1 | 6 | 17% | 52 |
| bvh.micro.Freya 0.3 | 6 | 17% | 37 |
| bvh.mini.Fenrir 0.39 | 4 | 11% | 12 |
| m3thos.Eva02 0.7.1 | 3 | 8% | 19 |
| mz.Cork 0.1 | 2 | 6% | 33 |
| dl.BetterWalls 1.0 | 2 | 6% | 16 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 91.8 | 172 / 210 | 1.74 | 19.9% | 33834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.9% | 172 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 11.0% | 7 |
| germ.TheMind .2 | 3.0 | 10.4% | 6 |
| EBBU.Sim2 1.02 | 4.3 | 9.8% | 4 |
| agrach.Dalek 1.0 | 6.0 | 8.7% | 10 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.8% | 6 |
| lmk.ACPFinal 0.1 | 7.2 | 8.3% | 1 |
| mb.Beast 0.1 | 7.8 | 8.0% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.9% | 0 |
| skm.Ryubot 1.0 | 9.2 | 7.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 96.2 | 30 / 35 | 5659 |
| 2 | 1 | 69.9 | 94.6 | 31 / 35 | 5486 |
| 3 | 1 | 69.6 | 91.1 | 29 / 35 | 5931 |
| 4 | 1 | 69.8 | 94.6 | 28 / 35 | 5697 |
| 5 | 1 | 68.5 | 88.3 | 28 / 35 | 5602 |
| 6 | 1 | 67.7 | 86.0 | 26 / 35 | 5459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 35 | 97% |
| EBBU.Sim2 1.02 | 24 | 92% |
| stelo.UntouchableNano 1.3 | 23 | 96% |
| skm.Ryubot 1.0 | 23 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 100% |
| agrach.Dalek 1.0 | 22 | 91% |
| mb.Beast 0.1 | 17 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 6 | 16% | 37 |
| agrach.Dalek 1.0 | 6 | 16% | 29 |
| stelo.UntouchableNano 1.3 | 6 | 16% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 11% | 34 |
| EBBU.Sim2 1.02 | 4 | 11% | 25 |
| mb.Beast 0.1 | 4 | 11% | 25 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 11% | 7 |
| lmk.ACPFinal 0.1 | 3 | 8% | 19 |
| skm.Ryubot 1.0 | 1 | 3% | 4 |

## Melee bench: F38

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.3 | 88 / 210 | 2.59 | 16.8% | 25515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.9% | 82 |
| hadur117.mini.DeiseSCAL 0.4 | 1.7 | 16.8% | 88 |
| bvh.mini.Freya 0.55 | 3.0 | 12.5% | 10 |
| cs.Wren 1.0 | 4.5 | 11.3% | 10 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.4% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 9.9% | 3 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.6% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.5 | 5.4% | 1 |
| matt.UnderDark3 2.4.34 | 8.7 | 4.6% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 80.6 | 8 / 35 | 4416 |
| 2 | 2 | 66.9 | 82.9 | 17 / 35 | 4277 |
| 3 | 1 | 65.7 | 78.7 | 14 / 35 | 4522 |
| 4 | 1 | 67.1 | 85.4 | 17 / 35 | 4454 |
| 5 | 2 | 64.8 | 80.0 | 17 / 35 | 3639 |
| 6 | 2 | 66.7 | 86.3 | 15 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 50% |
| bts.mega.Gnarly 1.4 | 21 | 86% |
| bvh.mini.Freya 0.55 | 16 | 81% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 100% |
| cs.Wren 1.0 | 11 | 73% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 48 | 39% | 86 |
| bvh.mini.Freya 0.55 | 21 | 17% | 27 |
| cs.Wren 1.0 | 20 | 16% | 27 |
| bts.mega.Gnarly 1.4 | 15 | 12% | 33 |
| kdf.KoulDestroyer 1.0 | 10 | 8% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 6% | 21 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.8 | 104 / 210 | 2.37 | 17.7% | 28775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 17.7% | 104 |
| bvh.fry.Freya 0.82 | 2.0 | 15.2% | 25 |
| az.Ololobot 0.2.4 | 3.0 | 13.3% | 52 |
| catcat20.Lambda 0.024 | 4.3 | 10.8% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.0% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.1% | 0 |
| gimp.GimpBot 0.1 | 7.0 | 7.5% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.2 | 17 / 35 | 4754 |
| 2 | 1 | 66.2 | 83.2 | 17 / 35 | 4488 |
| 3 | 1 | 67.4 | 86.7 | 17 / 35 | 4877 |
| 4 | 1 | 69.0 | 91.7 | 22 / 35 | 4924 |
| 5 | 1 | 67.2 | 85.4 | 18 / 35 | 4956 |
| 6 | 1 | 65.0 | 78.4 | 13 / 35 | 4776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 47 | 64% |
| bvh.fry.Freya 0.82 | 40 | 75% |
| catcat20.Lambda 0.024 | 20 | 80% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 100% |
| apollokidd.ApolloKidd 0.9 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 39 | 37% | 70 |
| az.Ololobot 0.2.4 | 29 | 27% | 62 |
| stelo.SoRobotNanoMelee 1.2 | 16 | 15% | 22 |
| catcat20.Lambda 0.024 | 10 | 9% | 23 |
| apollokidd.ApolloKidd 0.9 | 5 | 5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 7 |
| gimp.GimpBot 0.1 | 2 | 2% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.9 | 125 / 210 | 2.18 | 18.6% | 27693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.6% | 125 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 12.1% | 20 |
| mz.AntiGrav 1.0 | 4.2 | 10.9% | 8 |
| Polkwane.SmashMelee 1.0 | 4.2 | 11.1% | 12 |
| alpha.BlackIce 1.0 | 6.3 | 8.9% | 3 |
| stelo.Randomness 1.0 | 6.7 | 8.1% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 0 |
| sample.Corners 1.0 | 9.7 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.6 | 19 / 35 | 4785 |
| 2 | 1 | 68.9 | 88.9 | 22 / 35 | 4646 |
| 3 | 1 | 66.8 | 82.5 | 20 / 35 | 4495 |
| 4 | 1 | 69.6 | 90.5 | 24 / 35 | 4779 |
| 5 | 1 | 68.6 | 87.0 | 21 / 35 | 4636 |
| 6 | 1 | 67.4 | 85.1 | 19 / 35 | 4352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 78% |
| kano.gamma.KanoGamma 1.8 | 29 | 69% |
| mz.AntiGrav 1.0 | 24 | 96% |
| Polkwane.SmashMelee 1.0 | 21 | 90% |
| stelo.Randomness 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 7 | 86% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 40% | 70 |
| kano.gamma.KanoGamma 1.8 | 17 | 20% | 53 |
| mz.AntiGrav 1.0 | 16 | 19% | 37 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 15 |
| stelo.Randomness 1.0 | 3 | 4% | 15 |
| alpha.BlackIce 1.0 | 2 | 2% | 9 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 7 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 2 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.0 | 101 / 210 | 2.26 | 17.4% | 24428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.2 | 17.4% | 101 |
| eem.EvBotNG v12.8 | 2.0 | 16.2% | 66 |
| ary.Swarm 1.1 | 3.5 | 13.5% | 17 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.6% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.1% | 14 |
| shrub.Silver v048 | 6.3 | 8.4% | 0 |
| zyx.nano.Ant 1.1 | 6.7 | 7.2% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 5.5% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 79.0 | 10 / 35 | 3827 |
| 2 | 1 | 68.3 | 88.9 | 21 / 35 | 3993 |
| 3 | 1 | 68.5 | 90.2 | 19 / 35 | 4432 |
| 4 | 1 | 67.5 | 86.7 | 16 / 35 | 4134 |
| 5 | 1 | 65.9 | 82.2 | 16 / 35 | 3880 |
| 6 | 1 | 67.9 | 89.2 | 19 / 35 | 4162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 73 | 55% |
| ary.Swarm 1.1 | 32 | 75% |
| lessonz.robocode.Oz 0.5.0 | 23 | 87% |
| simonton.nano.MeleeSeed 1.8 | 17 | 88% |
| shrub.Silver v048 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 44 | 40% | 82 |
| ary.Swarm 1.1 | 34 | 31% | 62 |
| lessonz.robocode.Oz 0.5.0 | 15 | 14% | 29 |
| simonton.nano.MeleeSeed 1.8 | 13 | 12% | 26 |
| zyx.nano.Ant 1.1 | 2 | 2% | 2 |
| shrub.Silver v048 | 1 | 1% | 5 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 1 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.4 | 102 / 210 | 2.13 | 18.5% | 31281 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.5% | 102 |
| wompi.Wallaby 5.1 | 2.2 | 15.6% | 53 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 13.7% | 20 |
| ara.Shera 0.88 | 3.7 | 13.3% | 30 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 2 |
| dsw.StaticD 1.0 | 6.5 | 7.1% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.1% | 0 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.7% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.3 | 14 / 35 | 5096 |
| 2 | 1 | 69.1 | 89.8 | 17 / 35 | 5388 |
| 3 | 1 | 68.2 | 85.4 | 18 / 35 | 5145 |
| 4 | 1 | 67.8 | 87.3 | 14 / 35 | 5216 |
| 5 | 1 | 67.5 | 83.8 | 18 / 35 | 5003 |
| 6 | 1 | 69.9 | 91.7 | 21 / 35 | 5433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 56 | 66% |
| maribo.mini.MiniQuester 0.1 | 33 | 85% |
| ara.Shera 0.88 | 32 | 72% |
| dsw.StaticD 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 0% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 41% | 86 |
| ara.Shera 0.88 | 33 | 30% | 54 |
| maribo.mini.MiniQuester 0.1 | 24 | 22% | 51 |
| amz.NanoClone 1.41 | 3 | 3% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 9 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.8 | 46 / 210 | 3.00 | 15.3% | 23014 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 135 |
| hadur117.mini.DeiseSCAL 0.4 | 2.0 | 15.3% | 46 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.4% | 8 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.6% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 5.3 | 10.5% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.3% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.3% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 84.4 | 8 / 35 | 3927 |
| 2 | 2 | 62.3 | 71.1 | 5 / 35 | 3575 |
| 3 | 2 | 64.9 | 77.5 | 9 / 35 | 3860 |
| 4 | 2 | 63.9 | 76.2 | 6 / 35 | 3665 |
| 5 | 2 | 65.3 | 76.5 | 8 / 35 | 4084 |
| 6 | 2 | 66.0 | 81.3 | 10 / 35 | 3903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 25% |
| brainfade.melee.Dusk 0.44 | 18 | 72% |
| dummy.micro.Sparrow 2.5 | 10 | 70% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 60% |
| cvt.Firsty 1.0 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 52% | 108 |
| dummy.micro.Sparrow 2.5 | 25 | 15% | 33 |
| brainfade.melee.Dusk 0.44 | 22 | 13% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 9% | 19 |
| Krabb.akim2.Akim2 1.1b | 8 | 5% | 8 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.6 | 112 / 210 | 2.30 | 18.3% | 28900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 18.3% | 112 |
| stelo.Liblix 0.3.1 | 2.2 | 16.0% | 61 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.4% | 26 |
| wompi.Quokka 1.6 | 4.3 | 10.0% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.3% | 1 |
| jwirde.Gort 2.0 | 5.5 | 9.0% | 1 |
| stf.PanzerGeneral 0.1 | 7.3 | 6.7% | 1 |
| disan.Chair 2.2.0 | 7.7 | 7.3% | 1 |
| sample.Crazy 1.0 | 9.3 | 4.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 19 / 35 | 4774 |
| 2 | 1 | 69.2 | 89.8 | 22 / 35 | 4775 |
| 3 | 1 | 66.6 | 81.3 | 17 / 35 | 4649 |
| 4 | 1 | 68.0 | 84.4 | 18 / 35 | 4942 |
| 5 | 1 | 70.1 | 92.4 | 20 / 35 | 5221 |
| 6 | 1 | 65.9 | 78.7 | 16 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 70% |
| tzu.TheArtOfWar 1.2 | 40 | 80% |
| wompi.Quokka 1.6 | 7 | 71% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| jwirde.Gort 2.0 | 6 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 843. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 46% | 101 |
| tzu.TheArtOfWar 1.2 | 27 | 28% | 53 |
| wompi.Quokka 1.6 | 12 | 12% | 18 |
| disan.Chair 2.2.0 | 7 | 7% | 11 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 5% | 9 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 5 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| jwirde.Gort 2.0 | 0 | 0% | 9 |
| sample.Crazy 1.0 | 0 | 0% | 2 |

## Melee bench: F45

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.3 | 78 / 210 | 2.06 | 19.6% | 35875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSCAL 0.4 | 1.0 | 19.6% | 78 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.5% | 117 |
| jje.BagPuss 1.2 | 3.0 | 12.1% | 7 |
| sul.Lunar 1.1 | 4.3 | 10.3% | 5 |
| myl.nano.Graviton 1.10 | 5.0 | 9.8% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.4% | 0 |
| fm.claire 1.7 | 6.8 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 7.8% | 2 |
| wit.Deep7 2.0 | 8.8 | 6.2% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.6 | 14 / 35 | 5513 |
| 2 | 1 | 70.5 | 91.4 | 14 / 35 | 6273 |
| 3 | 1 | 68.4 | 85.4 | 10 / 35 | 5820 |
| 4 | 1 | 70.4 | 90.2 | 11 / 35 | 6600 |
| 5 | 1 | 69.2 | 87.3 | 17 / 35 | 5954 |
| 6 | 1 | 68.8 | 87.6 | 12 / 35 | 5715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 125 | 25% |
| jje.BagPuss 1.2 | 14 | 86% |
| sul.Lunar 1.1 | 12 | 100% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| wit.Deep7 2.0 | 6 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 2380. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 98 | 74% | 0 |
| jje.BagPuss 1.2 | 9 | 7% | 53 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 20 |
| fm.claire 1.7 | 6 | 5% | 16 |
| myl.nano.Graviton 1.10 | 5 | 4% | 34 |
| hvilela.HVilela 0.9 | 4 | 3% | 11 |
| sul.Lunar 1.1 | 3 | 2% | 62 |
| wit.Deep7 2.0 | 0 | 0% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseSCAL 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.0 | 62 / 210 | 2.62 | 16.0% | 24297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.2% | 91 |
| kc.mini.Mirage 0.2 | 2.0 | 16.5% | 46 |
| hadur117.mini.DeiseSCAL 0.4 | 2.7 | 16.0% | 62 |
| mz.MicroSheep 1.0 | 4.3 | 10.3% | 1 |
| cx.Princess 1.0 | 5.0 | 9.6% | 10 |
| sadoner.killer 0.2 | 5.8 | 9.1% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 86.3 | 14 / 35 | 4030 |
| 2 | 3 | 64.7 | 78.7 | 10 / 35 | 4258 |
| 3 | 3 | 64.8 | 81.9 | 10 / 35 | 3670 |
| 4 | 3 | 65.0 | 81.6 | 9 / 35 | 3967 |
| 5 | 3 | 65.8 | 81.6 | 10 / 35 | 4490 |
| 6 | 3 | 64.8 | 81.6 | 9 / 35 | 3882 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 54 | 26% |
| kc.mini.Mirage 0.2 | 50 | 58% |
| cx.Princess 1.0 | 15 | 67% |
| mz.MicroSheep 1.0 | 5 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 65 | 44% | 79 |
| kc.mini.Mirage 0.2 | 48 | 32% | 79 |
| mz.MicroSheep 1.0 | 11 | 7% | 19 |
| cx.Princess 1.0 | 8 | 5% | 14 |
| arthord.NanoSatanMelee Beta | 7 | 5% | 8 |
| sadoner.killer 0.2 | 6 | 4% | 6 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| kurios.DOSexe .9a | 1 | 1% | 1 |

