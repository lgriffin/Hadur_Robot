# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.9 | 61 / 210 | 2.27 | 17.1% | 29364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 140 |
| hadur117.mini.DeiseAIM2 0.3 | 2.0 | 17.1% | 61 |
| sgp.JollyNinja 3.53 | 3.5 | 11.4% | 6 |
| mz.MicroGodMelee 1 | 4.0 | 10.9% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.3% | 3 |
| lorneswork.Predator 1.0 | 5.8 | 9.2% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 86.7 | 10 / 35 | 4665 |
| 2 | 2 | 67.7 | 87.3 | 12 / 35 | 4986 |
| 3 | 2 | 66.5 | 84.1 | 10 / 35 | 4782 |
| 4 | 2 | 67.4 | 88.3 | 9 / 35 | 4870 |
| 5 | 2 | 67.1 | 86.0 | 10 / 35 | 5004 |
| 6 | 2 | 66.5 | 82.9 | 10 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 15% |
| sgp.JollyNinja 3.53 | 22 | 86% |
| mz.MicroGodMelee 1 | 13 | 92% |
| lorneswork.Predator 1.0 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 1248. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 81% | 144 |
| sgp.JollyNinja 3.53 | 12 | 8% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 5% | 9 |
| mz.MicroGodMelee 1 | 6 | 4% | 18 |
| lorneswork.Predator 1.0 | 1 | 1% | 12 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.0 | 109 / 210 | 2.44 | 18.1% | 29980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.1% | 109 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.5% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.4% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.6% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.8% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.7% | 0 |
| Noran.BitchingElk 0.054 | 7.0 | 7.7% | 9 |
| sch.Simone 0.3d | 7.2 | 7.3% | 5 |
| stelo.PatternRobot 1.0 | 8.7 | 6.4% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 80.6 | 16 / 35 | 4676 |
| 2 | 1 | 68.8 | 87.0 | 23 / 35 | 5269 |
| 3 | 1 | 68.3 | 85.4 | 21 / 35 | 5122 |
| 4 | 1 | 68.2 | 86.3 | 17 / 35 | 5188 |
| 5 | 1 | 66.9 | 81.9 | 18 / 35 | 4909 |
| 6 | 1 | 66.4 | 82.5 | 14 / 35 | 4816 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 79% |
| pulsar.PulsarMax 0.8.9 | 42 | 60% |
| sch.Simone 0.3d | 13 | 85% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 82% |
| Noran.BitchingElk 0.054 | 9 | 56% |
| stelo.PatternRobot 1.0 | 7 | 100% |
| fnc.bandit.Bandit 5.2.0 | 5 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 35% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 23% | 55 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 15% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 11% | 17 |
| Noran.BitchingElk 0.054 | 6 | 6% | 14 |
| sch.Simone 0.3d | 3 | 3% | 11 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 8 |
| stelo.PatternRobot 1.0 | 3 | 3% | 5 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.9 | 153 / 210 | 1.55 | 20.5% | 36874 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 20.5% | 153 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.6% | 15 |
| radnor.DoctorBob 1.42 | 2.8 | 13.4% | 11 |
| vuen.Cake 2.51 | 3.7 | 12.8% | 29 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.0 | 21 / 35 | 6082 |
| 2 | 1 | 70.7 | 93.0 | 25 / 35 | 6294 |
| 3 | 1 | 71.3 | 95.2 | 27 / 35 | 6242 |
| 4 | 1 | 70.9 | 93.3 | 25 / 35 | 6378 |
| 5 | 1 | 70.7 | 94.3 | 26 / 35 | 5857 |
| 6 | 1 | 70.9 | 94.3 | 29 / 35 | 6021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 69 | 87% |
| vuen.Cake 2.51 | 67 | 73% |
| radnor.DoctorBob 1.42 | 37 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 27 | 47% | 76 |
| kawigi.nano.Lib 1.0 | 13 | 23% | 69 |
| radnor.DoctorBob 1.42 | 11 | 19% | 41 |
| adt.Ar1 2.1 | 4 | 7% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 4 |
| urdos.URDOS 1.3 | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.2 | 30 / 210 | 2.33 | 17.3% | 33708 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.5% | 173 |
| hadur117.mini.DeiseAIM2 0.3 | 2.0 | 17.3% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.4% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.6% | 4 |
| josago.Jorgito 0.16 | 4.8 | 9.3% | 0 |
| css.Delitioner 0.11 | 6.3 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 86.0 | 4 / 35 | 5518 |
| 2 | 2 | 67.4 | 84.1 | 4 / 35 | 5516 |
| 3 | 2 | 68.0 | 84.8 | 7 / 35 | 5768 |
| 4 | 2 | 66.2 | 80.0 | 1 / 35 | 5233 |
| 5 | 2 | 69.5 | 89.8 | 10 / 35 | 5916 |
| 6 | 2 | 68.1 | 86.7 | 4 / 35 | 5757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 162 | 16% |
| TNT.TNT 0.99.1 | 3 | 0% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1454. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 84% | 179 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 14 |
| TNT.TNT 0.99.1 | 7 | 4% | 8 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 70.3 | 18 / 210 | 3.67 | 13.2% | 20695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 125 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 51 |
| hadur117.mini.DeiseAIM2 0.3 | 3.3 | 13.2% | 18 |
| wompi.Numbat 2.1 | 3.7 | 12.6% | 11 |
| axeBots.HataMoto 3.09 | 5.5 | 8.8% | 7 |
| ms.Ares 0.19 | 5.5 | 9.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 5.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 74.0 | 5 / 35 | 3760 |
| 2 | 3 | 59.8 | 70.8 | 1 / 35 | 3275 |
| 3 | 4 | 59.1 | 66.7 | 5 / 35 | 3203 |
| 4 | 3 | 61.2 | 71.4 | 3 / 35 | 3617 |
| 5 | 4 | 60.8 | 70.2 | 2 / 35 | 3517 |
| 6 | 3 | 59.5 | 68.9 | 2 / 35 | 3323 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 37 | 16% |
| justin.DemonicRage 3.4 | 20 | 25% |
| wompi.Numbat 2.1 | 5 | 80% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 816. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 81 | 42% | 87 |
| justin.DemonicRage 3.4 | 60 | 31% | 65 |
| wompi.Numbat 2.1 | 18 | 9% | 22 |
| ms.Ares 0.19 | 14 | 7% | 15 |
| axeBots.HataMoto 3.09 | 10 | 5% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.2 | 102 / 210 | 2.51 | 17.6% | 28441 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 17.6% | 102 |
| jekl.StoneGhost 0.7 | 2.3 | 14.7% | 35 |
| origin.SleepSiphon 1.7b | 3.0 | 13.6% | 41 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.6% | 25 |
| mld.Wisdom 1.0 | 4.8 | 10.2% | 4 |
| gg.Wolverine 2.0 | 6.2 | 8.5% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 6.7% | 0 |
| DBall.NUKE 0.1 | 7.8 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.2% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.6 | 19 / 35 | 4894 |
| 2 | 1 | 67.9 | 86.0 | 19 / 35 | 4928 |
| 3 | 1 | 66.9 | 81.0 | 18 / 35 | 4689 |
| 4 | 1 | 66.5 | 82.5 | 13 / 35 | 4661 |
| 5 | 1 | 66.7 | 82.5 | 16 / 35 | 4624 |
| 6 | 1 | 66.3 | 79.7 | 17 / 35 | 4645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 42 | 71% |
| origin.SleepSiphon 1.7b | 36 | 69% |
| pe.minimelee.SandboxMiniMelee 1.1 | 36 | 83% |
| gg.Wolverine 2.0 | 7 | 86% |
| mld.Wisdom 1.0 | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 768. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 37 | 34% | 62 |
| origin.SleepSiphon 1.7b | 33 | 31% | 61 |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 22% | 54 |
| mld.Wisdom 1.0 | 8 | 7% | 12 |
| gg.Wolverine 2.0 | 2 | 2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 6 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.7 | 133 / 210 | 1.66 | 19.9% | 34310 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.9% | 133 |
| rtk.Tachikoma 1.0 | 2.3 | 17.1% | 27 |
| rsalesc.melee.Monk 0.3.6c | 2.7 | 16.6% | 40 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.4% | 8 |
| franzor.Lizt 1.3.1 | 4.7 | 10.3% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 20 / 35 | 5622 |
| 2 | 1 | 71.7 | 93.7 | 25 / 35 | 5666 |
| 3 | 1 | 71.8 | 95.2 | 25 / 35 | 5551 |
| 4 | 1 | 71.0 | 90.8 | 20 / 35 | 5627 |
| 5 | 1 | 71.8 | 92.7 | 20 / 35 | 6094 |
| 6 | 1 | 71.2 | 92.4 | 23 / 35 | 5750 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 85% |
| rsalesc.melee.Monk 0.3.6c | 35 | 29% |
| oog.melee.CapuletDroid 1.1 | 28 | 82% |
| franzor.Lizt 1.3.1 | 16 | 81% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 50% | 55 |
| rtk.Tachikoma 1.0 | 27 | 35% | 116 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 29 |
| franzor.Lizt 1.3.1 | 3 | 4% | 0 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.4 | 114 / 210 | 2.22 | 18.4% | 29497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.4% | 114 |
| tm.Yuugao 1.0 | 2.5 | 13.0% | 38 |
| shrub.Vapour v159 | 2.7 | 13.0% | 39 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 9.9% | 7 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.2% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 5.7 | 8.9% | 2 |
| m3thos.Eva00 1.1 | 7.0 | 7.7% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.5% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.6% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 21 / 35 | 5340 |
| 2 | 1 | 66.8 | 84.4 | 16 / 35 | 4729 |
| 3 | 1 | 67.1 | 85.7 | 20 / 35 | 4799 |
| 4 | 1 | 66.9 | 84.8 | 18 / 35 | 4616 |
| 5 | 1 | 68.5 | 87.3 | 20 / 35 | 5320 |
| 6 | 1 | 67.5 | 86.3 | 19 / 35 | 4693 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 64% |
| shrub.Vapour v159 | 32 | 53% |
| Krabb.sliNk.Garm 0.9u | 23 | 83% |
| jwst.DAD.DarkAndDarker 1.1 | 22 | 95% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 95% |
| m3thos.Eva00 1.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 34 | 35% | 50 |
| tm.Yuugao 1.0 | 33 | 34% | 74 |
| Krabb.sliNk.Garm 0.9u | 11 | 11% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 4% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 4% | 13 |
| m3thos.Eva00 1.1 | 4 | 4% | 6 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 7 |
| SHAM.WOW 1.4 | 2 | 2% | 13 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 76.0 | 59 / 210 | 3.16 | 15.6% | 25001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.8% | 103 |
| hadur117.mini.DeiseAIM2 0.3 | 2.3 | 15.6% | 59 |
| kc.micro.Figment 1.0 | 2.7 | 14.1% | 23 |
| yagami.Tidus 0.11 | 4.2 | 10.8% | 1 |
| mc2.enemy.Original 0.9 | 5.2 | 9.6% | 13 |
| pedersen.Grishnakh 1.0 | 5.8 | 9.1% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.8% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 77.1 | 8 / 35 | 4423 |
| 2 | 2 | 64.2 | 75.2 | 12 / 35 | 4032 |
| 3 | 2 | 63.2 | 73.7 | 9 / 35 | 4062 |
| 4 | 3 | 63.2 | 73.0 | 8 / 35 | 4050 |
| 5 | 3 | 63.4 | 73.0 | 10 / 35 | 3947 |
| 6 | 2 | 66.8 | 83.8 | 12 / 35 | 4487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 34% |
| kc.micro.Figment 1.0 | 24 | 88% |
| mc2.enemy.Original 0.9 | 11 | 45% |
| yagami.Tidus 0.11 | 7 | 86% |
| pedersen.Grishnakh 1.0 | 5 | 80% |
| dft.Calliope 5.6 | 2 | 50% |
| step.nanoPri 1.0 | 2 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 65 | 43% | 89 |
| kc.micro.Figment 1.0 | 30 | 20% | 51 |
| yagami.Tidus 0.11 | 16 | 11% | 20 |
| mc2.enemy.Original 0.9 | 13 | 9% | 18 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 14 |
| dft.Calliope 5.6 | 7 | 5% | 9 |
| step.nanoPri 1.0 | 4 | 3% | 5 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 95.1 | 168 / 210 | 1.44 | 20.5% | 33306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 20.5% | 168 |
| DTF.Kludgy 1.2b | 2.2 | 14.0% | 20 |
| ejb.Polaris 1.0.1 | 3.3 | 12.4% | 10 |
| ne.Chimera 1.2 | 3.5 | 12.5% | 8 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.8% | 2 |
| vStar.RAFzilla 2.15 | 5.7 | 9.6% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9b | 8.0 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.9 | 30 / 35 | 5638 |
| 2 | 1 | 70.9 | 94.6 | 27 / 35 | 5715 |
| 3 | 1 | 71.2 | 95.6 | 28 / 35 | 5613 |
| 4 | 1 | 69.8 | 93.7 | 25 / 35 | 5217 |
| 5 | 1 | 72.0 | 98.7 | 32 / 35 | 5805 |
| 6 | 1 | 70.0 | 93.3 | 26 / 35 | 5318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 82% |
| ejb.Polaris 1.0.1 | 53 | 91% |
| ne.Chimera 1.2 | 37 | 86% |
| vStar.RAFzilla 2.15 | 16 | 94% |
| tvv.micro.Antares 1.1.1 | 12 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 42% | 60 |
| ne.Chimera 1.2 | 9 | 21% | 39 |
| ejb.Polaris 1.0.1 | 7 | 16% | 54 |
| vStar.RAFzilla 2.15 | 3 | 7% | 18 |
| tvv.micro.Antares 1.1.1 | 3 | 7% | 16 |
| donjezza.Muncho 1.0 | 1 | 2% | 7 |
| sam.Samspin 1.0 | 1 | 2% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.4 | 93 / 210 | 2.40 | 17.6% | 27959 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.2 | 17.6% | 93 |
| rz.Aleph 0.34 | 1.8 | 16.0% | 57 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.9% | 25 |
| djc.DynaBot 0.1.1 | 4.3 | 10.5% | 10 |
| rdt199.Warlord 0.73 | 4.8 | 9.5% | 16 |
| br2.MobyDickBot 1.6 | 6.2 | 8.1% | 5 |
| uji.YellohFellah 1.0 | 7.0 | 7.6% | 5 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.8 | 13 / 35 | 4934 |
| 2 | 1 | 66.8 | 84.4 | 17 / 35 | 4599 |
| 3 | 1 | 65.8 | 84.1 | 15 / 35 | 4174 |
| 4 | 1 | 66.7 | 84.1 | 16 / 35 | 4653 |
| 5 | 2 | 65.9 | 83.2 | 11 / 35 | 4552 |
| 6 | 1 | 68.6 | 86.7 | 21 / 35 | 5047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 60% |
| cx.mini.Nimrod 0.55 | 24 | 75% |
| djc.DynaBot 0.1.1 | 20 | 85% |
| rdt199.Warlord 0.73 | 13 | 62% |
| uji.YellohFellah 1.0 | 9 | 78% |
| br2.MobyDickBot 1.6 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 45% | 88 |
| cx.mini.Nimrod 0.55 | 25 | 21% | 36 |
| rdt199.Warlord 0.73 | 14 | 12% | 24 |
| djc.DynaBot 0.1.1 | 10 | 8% | 25 |
| br2.MobyDickBot 1.6 | 5 | 4% | 15 |
| uji.YellohFellah 1.0 | 3 | 3% | 10 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 6 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |

## Melee bench: F12

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.2 | 124 / 210 | 2.42 | 17.8% | 24824 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 17.8% | 124 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.5% | 23 |
| nat.PallasHawk 1.0 | 2.8 | 13.4% | 33 |
| darkcanuck.Leon 1.01 | 3.5 | 12.5% | 20 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.4% | 8 |
| jrm.Test0 1.0 | 6.2 | 7.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.8% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 0 |
| jaybot.bots.Oddball 4.0 | 8.5 | 6.0% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 79.7 | 20 / 35 | 4214 |
| 2 | 1 | 66.0 | 82.2 | 18 / 35 | 3948 |
| 3 | 1 | 66.6 | 84.4 | 20 / 35 | 3837 |
| 4 | 1 | 69.3 | 88.9 | 26 / 35 | 4570 |
| 5 | 1 | 67.1 | 85.1 | 22 / 35 | 3970 |
| 6 | 1 | 66.8 | 84.8 | 18 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 46 | 78% |
| bts.wiki.RipCurl 0.9b | 44 | 86% |
| darkcanuck.Leon 1.01 | 39 | 82% |
| brainfade.melee.Genghis 0.36 | 11 | 82% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 692. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 21 | 24% | 59 |
| nat.PallasHawk 1.0 | 21 | 24% | 48 |
| brainfade.melee.Genghis 0.36 | 15 | 17% | 23 |
| bts.wiki.RipCurl 0.9b | 10 | 12% | 42 |
| jrm.Test0 1.0 | 6 | 7% | 9 |
| jp.Perpy 16.0 | 6 | 7% | 7 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 8 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 8 |

## Melee bench: F13

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 87.1 | 86 / 210 | 2.16 | 17.3% | 27033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.3 | 17.3% | 86 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 36 |
| mn.Combat 3.25.0 | 2.5 | 16.2% | 70 |
| shinh.Entangled 0.3 | 4.0 | 12.1% | 11 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.0% | 9 |
| apc.Colossus2 0.17 | 6.0 | 7.9% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.0% | 0 |
| maribo.FollowFire 1 | 8.0 | 4.9% | 0 |
| ayk.WallHugger 1.0 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.2 | 17 / 35 | 4653 |
| 2 | 2 | 67.3 | 86.0 | 12 / 35 | 4772 |
| 3 | 1 | 68.3 | 89.5 | 18 / 35 | 4616 |
| 4 | 1 | 66.3 | 87.3 | 14 / 35 | 4083 |
| 5 | 2 | 65.8 | 83.5 | 11 / 35 | 4293 |
| 6 | 1 | 67.4 | 87.3 | 14 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 38% |
| ags.Glacier 0.2.11 | 54 | 69% |
| shinh.Entangled 0.3 | 23 | 78% |
| gh.micro.Gruweltje 0.7 | 10 | 70% |
| stelo.Wang 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 58 | 46% | 82 |
| ags.Glacier 0.2.11 | 39 | 31% | 72 |
| shinh.Entangled 0.3 | 17 | 13% | 35 |
| gh.micro.Gruweltje 0.7 | 8 | 6% | 14 |
| stelo.Wang 1.0 | 2 | 2% | 3 |
| apc.Colossus2 0.17 | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.6 | 152 / 210 | 1.85 | 19.7% | 32538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.7% | 152 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.9% | 27 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.9% | 24 |
| co.edu.usb.rc.LidisTron 1.0 | 4.5 | 10.1% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.6% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.1% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.6% | 5 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.7 | 27 / 35 | 5903 |
| 2 | 1 | 69.7 | 90.8 | 24 / 35 | 5186 |
| 3 | 1 | 71.2 | 95.6 | 29 / 35 | 5491 |
| 4 | 1 | 68.1 | 85.7 | 21 / 35 | 5030 |
| 5 | 1 | 69.7 | 89.8 | 25 / 35 | 5430 |
| 6 | 1 | 70.4 | 89.8 | 26 / 35 | 5498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 94% |
| catcat20.shape.Theta 0.018 | 52 | 83% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 41% | 107 |
| catcat20.shape.Theta 0.018 | 13 | 22% | 43 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 10% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 9% | 18 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |
| sample.TrackFire 1.0 | 1 | 2% | 1 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.6 | 98 / 210 | 2.56 | 18.0% | 32275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.0% | 98 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 19 |
| emp.Yngwie 1.11 | 3.2 | 13.2% | 50 |
| mld.DustBunny 3.8 | 4.0 | 12.1% | 16 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.4% | 13 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.0% | 15 |
| lambdaxy.TBot 0.1 | 7.2 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 4.8% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.9 | 22 / 35 | 5664 |
| 2 | 1 | 66.3 | 77.5 | 14 / 35 | 5412 |
| 3 | 1 | 67.2 | 82.2 | 13 / 35 | 5187 |
| 4 | 1 | 68.0 | 83.5 | 17 / 35 | 5500 |
| 5 | 1 | 67.3 | 84.4 | 16 / 35 | 5075 |
| 6 | 1 | 67.2 | 80.3 | 16 / 35 | 5437 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 59% |
| kawigi.micro.Shiz 1.1 | 27 | 100% |
| cb.nano.Insomnia 1.0 | 23 | 87% |
| mld.DustBunny 3.8 | 19 | 74% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| divineomega.TrialBot 0.003 | 7 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 34 | 30% | 66 |
| mld.DustBunny 3.8 | 22 | 19% | 39 |
| cb.nano.Insomnia 1.0 | 21 | 19% | 23 |
| kawigi.micro.Shiz 1.1 | 18 | 16% | 48 |
| kawigi.robot.Girl 1.2 | 12 | 11% | 20 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 1 | 1% | 9 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.4 | 87 / 210 | 2.59 | 17.9% | 32677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.2 | 17.9% | 87 |
| gh.Griezel 0.5.2 | 1.8 | 16.2% | 60 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 39 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.2% | 4 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 8.8% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.2% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.1% | 5 |
| asd.Cthulhu 1.3 | 9.0 | 4.8% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.4 | 13 / 35 | 5538 |
| 2 | 2 | 65.8 | 78.1 | 12 / 35 | 5003 |
| 3 | 1 | 67.5 | 82.5 | 14 / 35 | 5421 |
| 4 | 1 | 68.7 | 85.1 | 16 / 35 | 5585 |
| 5 | 1 | 65.6 | 76.2 | 13 / 35 | 5081 |
| 6 | 1 | 70.0 | 87.9 | 19 / 35 | 6049 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 66 | 58% |
| techdude.forest.FlamingForest 1.1 | 29 | 45% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 75% |
| divineomega.DivineBot 1.9.4.5 | 10 | 100% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1163. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 39% | 95 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 23% | 42 |
| techdude.forest.FlamingForest 1.1 | 21 | 17% | 33 |
| bvh.fnr.Fenrir 0.36l | 11 | 9% | 12 |
| asd.Cthulhu 1.3 | 5 | 4% | 7 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 6 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 4 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.6 | 93 / 210 | 2.56 | 17.7% | 30878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 17.7% | 93 |
| oog.melee.Mercutio 1.0 | 2.7 | 12.7% | 39 |
| et.Predator 1.8 | 2.8 | 13.4% | 24 |
| nic.Nicator 2.4 | 4.3 | 11.9% | 22 |
| cx.BlestPain 1.41 | 4.5 | 11.9% | 29 |
| ahf.NanoAndrew .4 | 5.8 | 10.4% | 2 |
| maribo.melee.BMV 0.1 | 6.8 | 8.5% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.5 | 18 / 35 | 5520 |
| 2 | 1 | 65.6 | 77.1 | 13 / 35 | 4903 |
| 3 | 1 | 66.7 | 81.6 | 13 / 35 | 5130 |
| 4 | 1 | 67.7 | 85.4 | 16 / 35 | 5123 |
| 5 | 1 | 68.6 | 86.7 | 20 / 35 | 5379 |
| 6 | 1 | 64.9 | 75.6 | 13 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 43 | 77% |
| nic.Nicator 2.4 | 33 | 67% |
| oog.melee.Mercutio 1.0 | 29 | 66% |
| cx.BlestPain 1.41 | 20 | 55% |
| ahf.NanoAndrew .4 | 8 | 100% |
| maribo.melee.BMV 0.1 | 1 | 0% |

Hadur died in 119 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 27 | 23% | 51 |
| oog.melee.Mercutio 1.0 | 26 | 22% | 49 |
| cx.BlestPain 1.41 | 25 | 21% | 38 |
| nic.Nicator 2.4 | 21 | 18% | 40 |
| ahf.NanoAndrew .4 | 10 | 8% | 20 |
| maribo.melee.BMV 0.1 | 7 | 6% | 9 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.4 | 131 / 210 | 2.13 | 18.7% | 28138 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.7% | 131 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.3% | 27 |
| agd.Mooserwirt2 2.7 | 3.5 | 11.6% | 15 |
| uji.DBH 1.1 | 3.8 | 11.3% | 11 |
| ratosh.Nobo 0.21 | 5.0 | 10.1% | 3 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.2% | 10 |
| sigterm.Sigterm 1.0 | 7.3 | 7.9% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 6.9% | 3 |
| stelo.WangRobot 1.0 | 9.2 | 5.8% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 90.5 | 24 / 35 | 5039 |
| 2 | 1 | 69.4 | 91.1 | 26 / 35 | 4853 |
| 3 | 1 | 67.9 | 86.3 | 18 / 35 | 4887 |
| 4 | 1 | 66.7 | 84.1 | 20 / 35 | 4423 |
| 5 | 1 | 67.9 | 87.9 | 20 / 35 | 4528 |
| 6 | 1 | 66.9 | 84.4 | 23 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 45 | 87% |
| agd.Mooserwirt2 2.7 | 30 | 77% |
| uji.DBH 1.1 | 22 | 91% |
| sigterm.Sigterm 1.0 | 14 | 93% |
| spinnercat.Robovirus 2.718 | 13 | 77% |
| stelo.WangRobot 1.0 | 12 | 92% |
| ratosh.Nobo 0.21 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 29% | 61 |
| agd.Mooserwirt2 2.7 | 16 | 20% | 50 |
| uji.DBH 1.1 | 11 | 14% | 19 |
| ratosh.Nobo 0.21 | 10 | 13% | 23 |
| spinnercat.Robovirus 2.718 | 6 | 8% | 17 |
| sigterm.Sigterm 1.0 | 4 | 5% | 15 |
| stelo.WangRobot 1.0 | 4 | 5% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 6 |

## Melee bench: F19

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.1 | 168 / 210 | 1.44 | 21.3% | 36197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 21.3% | 168 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.6% | 18 |
| mld.Infinity 2.2 | 3.0 | 13.2% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 10.9% | 1 |
| erdnis.Rover 0.3 | 5.2 | 10.2% | 3 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.2% | 0 |
| pac.ABC 2.1 | 8.2 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.8 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.8 | 29 / 35 | 5880 |
| 2 | 1 | 73.3 | 98.4 | 32 / 35 | 6190 |
| 3 | 1 | 72.2 | 94.6 | 27 / 35 | 5993 |
| 4 | 1 | 70.9 | 89.5 | 26 / 35 | 5742 |
| 5 | 1 | 71.6 | 94.6 | 26 / 35 | 6008 |
| 6 | 1 | 72.8 | 96.8 | 28 / 35 | 6384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 80 | 90% |
| mld.Infinity 2.2 | 58 | 86% |
| erdnis.Rover 0.3 | 11 | 91% |
| patson.PatsonTestBot 1.0 | 11 | 100% |
| krillr.mini.JointStrike 2.0.0 | 11 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 1161. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 21 | 50% | 106 |
| mld.Infinity 2.2 | 12 | 29% | 31 |
| erdnis.Rover 0.3 | 5 | 12% | 17 |
| krillr.mini.JointStrike 2.0.0 | 2 | 5% | 20 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 13 |
| mbh.Mbh 0.1 | 1 | 2% | 8 |
| pbg.R2D2 1.0 | 0 | 0% | 8 |
| pac.ABC 2.1 | 0 | 0% | 7 |

## Melee bench: F20

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.4 | 126 / 210 | 1.86 | 19.9% | 34103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.9% | 126 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 41 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.7% | 8 |
| catcat20.Rabbit 0.001 | 4.3 | 10.4% | 20 |
| fwb.Nine 1.0.1 | 4.3 | 10.6% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 7.6% | 0 |
| bayen.nut.Squirrel 1.615 | 7.3 | 7.1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 8.0 | 6.7% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.5 | 6.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 88.6 | 18 / 35 | 5873 |
| 2 | 1 | 70.4 | 92.1 | 24 / 35 | 5537 |
| 3 | 1 | 70.9 | 93.3 | 23 / 35 | 5789 |
| 4 | 1 | 69.5 | 88.9 | 19 / 35 | 5718 |
| 5 | 1 | 69.7 | 89.8 | 22 / 35 | 5602 |
| 6 | 1 | 69.6 | 89.8 | 20 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 77% |
| fwb.Nine 1.0.1 | 32 | 91% |
| catcat20.Rabbit 0.001 | 29 | 62% |
| nz.jdc.nano.GridFu 1.0 | 13 | 85% |
| bayen.nut.Squirrel 1.615 | 7 | 86% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1096. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 51% | 87 |
| catcat20.Rabbit 0.001 | 17 | 20% | 44 |
| fwb.Nine 1.0.1 | 10 | 12% | 23 |
| nz.jdc.nano.GridFu 1.0 | 7 | 8% | 24 |
| bayen.nut.Squirrel 1.615 | 6 | 7% | 12 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 7 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 7 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 92.9 | 136 / 210 | 1.64 | 20.6% | 35360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 20.6% | 136 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 56 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 9 |
| oa.weak.BotherBot 0.1 | 5.0 | 8.9% | 1 |
| eld.Hmm 1.0 | 6.0 | 7.9% | 2 |
| el.JumpShoot 0.2 | 7.0 | 6.6% | 0 |
| fire219.CatBot 1.0 | 8.2 | 6.1% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.4 | 20 / 35 | 5775 |
| 2 | 1 | 70.0 | 89.8 | 22 / 35 | 5615 |
| 3 | 1 | 70.7 | 90.5 | 19 / 35 | 6105 |
| 4 | 1 | 71.6 | 93.3 | 23 / 35 | 6103 |
| 5 | 1 | 72.1 | 97.1 | 29 / 35 | 5772 |
| 6 | 1 | 71.7 | 94.0 | 23 / 35 | 5990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 104 | 65% |
| dummy.mini.Scimitar 1.01 | 32 | 91% |
| cf.RiO.RiOx 4.2.1 | 25 | 88% |
| eld.Hmm 1.0 | 9 | 89% |
| oa.weak.BotherBot 0.1 | 7 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 41 | 55% | 91 |
| dummy.mini.Scimitar 1.01 | 16 | 22% | 59 |
| cf.RiO.RiOx 4.2.1 | 14 | 19% | 34 |
| eld.Hmm 1.0 | 2 | 3% | 17 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.3 | 94 / 210 | 2.41 | 17.9% | 31337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 17.9% | 94 |
| pe.SandboxDT 2.71m | 2.3 | 16.0% | 56 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.9% | 38 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 17 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 5 |
| yk.JahRoslav 1.1 | 7.2 | 6.5% | 1 |
| gg.Squaraus 0.6 | 7.3 | 6.1% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.4% | 1 |
| pbg.NinjaX 1.2 | 8.2 | 5.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 19 / 35 | 5330 |
| 2 | 1 | 67.2 | 80.6 | 14 / 35 | 5351 |
| 3 | 1 | 67.1 | 81.3 | 14 / 35 | 5109 |
| 4 | 1 | 69.0 | 87.3 | 18 / 35 | 5330 |
| 5 | 1 | 67.8 | 85.1 | 14 / 35 | 5149 |
| 6 | 1 | 68.2 | 86.7 | 15 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 44 | 80% |
| pe.SandboxDT 2.71m | 43 | 58% |
| jlm.javaDisturbance 0.59 | 31 | 74% |
| bigpete.Stewie 1.0 | 7 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 38% | 77 |
| kvk.HebusLeTroll 0.35 | 29 | 25% | 57 |
| jlm.javaDisturbance 0.59 | 28 | 24% | 48 |
| bigpete.Stewie 1.0 | 6 | 5% | 13 |
| tad.Dalek98 0.98 | 3 | 3% | 4 |
| gg.Squaraus 0.6 | 3 | 3% | 3 |
| yk.JahRoslav 1.1 | 3 | 3% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.9 | 146 / 210 | 1.64 | 20.0% | 30682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 20.0% | 146 |
| pe.SandboxLump 1.52 | 2.0 | 16.7% | 45 |
| cre.Karolos 0.32 | 3.0 | 12.7% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.3% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.3 | 9.0% | 3 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 1 |
| sample.Walls 1.0 | 7.3 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.0 | 25 / 35 | 5539 |
| 2 | 1 | 71.7 | 96.2 | 28 / 35 | 5291 |
| 3 | 1 | 70.9 | 93.7 | 24 / 35 | 4898 |
| 4 | 1 | 70.6 | 91.4 | 23 / 35 | 5037 |
| 5 | 1 | 69.0 | 88.3 | 19 / 35 | 4804 |
| 6 | 1 | 71.2 | 93.7 | 27 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 74% |
| cre.Karolos 0.32 | 28 | 93% |
| stelo.AreaTargetingBot 1.1 | 22 | 95% |
| sample.Walls 1.0 | 10 | 100% |
| stelo.RamTrackSurfer 1.2 | 9 | 78% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 88% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 40 | 63% | 110 |
| cre.Karolos 0.32 | 8 | 13% | 35 |
| stelo.AreaTargetingBot 1.1 | 7 | 11% | 24 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 8% | 11 |
| stelo.RamTrackSurfer 1.2 | 3 | 5% | 19 |
| cw.megas.Blade 0.8 | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 6 |

## Melee bench: F24

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.9 | 69 / 210 | 3.17 | 15.3% | 22809 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.2 | 15.3% | 69 |
| davidalves.Phoenix 0.54 | 3.0 | 13.2% | 45 |
| rz.GlowBlowMelee 1.4 | 3.2 | 13.8% | 35 |
| florent.XSeries.X2 0.12 | 3.2 | 13.1% | 31 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.0% | 21 |
| oog.melee.Corsair 1.0 | 6.0 | 9.3% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.6% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 76.2 | 11 / 35 | 3856 |
| 2 | 1 | 62.5 | 74.0 | 10 / 35 | 3715 |
| 3 | 1 | 64.2 | 79.0 | 12 / 35 | 3921 |
| 4 | 1 | 64.5 | 78.7 | 12 / 35 | 3937 |
| 5 | 1 | 61.7 | 70.5 | 10 / 35 | 3778 |
| 6 | 1 | 63.3 | 77.1 | 14 / 35 | 3602 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 27 | 67% |
| rz.GlowBlowMelee 1.4 | 26 | 65% |
| florent.XSeries.X2 0.12 | 17 | 59% |
| pedersen.Ugluk 1.1.1 | 16 | 63% |
| stelo.SoJNanoMelee 1.1 | 10 | 100% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 27% | 52 |
| davidalves.Phoenix 0.54 | 33 | 23% | 53 |
| pedersen.Ugluk 1.1.1 | 29 | 20% | 37 |
| florent.XSeries.X2 0.12 | 28 | 20% | 40 |
| oog.melee.Corsair 1.0 | 7 | 5% | 15 |
| stelo.SoJNanoMelee 1.1 | 3 | 2% | 5 |
| evd.X1 0.01 | 2 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.3 | 137 / 210 | 2.23 | 18.6% | 26372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.6% | 137 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.6% | 22 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.6% | 24 |
| jdw.Hurricane 1.4 | 4.0 | 10.6% | 10 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.1% | 6 |
| ds.Oo 2.2 | 5.8 | 8.9% | 7 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.5% | 1 |
| awesomeness.Elite 1.0 | 7.8 | 7.3% | 4 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 19 / 35 | 4320 |
| 2 | 1 | 70.6 | 92.4 | 29 / 35 | 4941 |
| 3 | 1 | 67.5 | 85.4 | 22 / 35 | 4190 |
| 4 | 1 | 66.4 | 81.9 | 19 / 35 | 4165 |
| 5 | 1 | 67.9 | 84.8 | 23 / 35 | 4450 |
| 6 | 1 | 68.8 | 90.2 | 25 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 57 | 91% |
| voidious.mini.BrokenSword 2.0.3 | 47 | 85% |
| jdw.Hurricane 1.4 | 23 | 83% |
| awesomeness.Elite 1.0 | 8 | 75% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 4 | 75% |
| ds.Oo 2.2 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 34% | 58 |
| voidious.micro.BlitzBat 1.05 | 12 | 16% | 59 |
| jdw.Hurricane 1.4 | 10 | 14% | 25 |
| gre.svman4.Morfeas 1.4.1 | 8 | 11% | 20 |
| ds.Oo 2.2 | 7 | 9% | 13 |
| awesomeness.Elite 1.0 | 6 | 8% | 12 |
| adt.Ar2 1.1 | 4 | 5% | 11 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 10 |
| amk.ChumbaMini 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.6 | 112 / 210 | 2.11 | 18.7% | 33372 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.7% | 112 |
| ak.Fermat 2.0 | 2.0 | 15.1% | 41 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 9 |
| shu.nitro.LENIN .T34 | 3.7 | 12.6% | 36 |
| js.PinBall 1.6 | 5.2 | 10.5% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 5 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.8% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.1% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 18 / 35 | 6026 |
| 2 | 1 | 67.4 | 84.1 | 18 / 35 | 5099 |
| 3 | 1 | 70.4 | 92.7 | 24 / 35 | 5533 |
| 4 | 1 | 68.4 | 85.4 | 15 / 35 | 5689 |
| 5 | 1 | 69.2 | 88.6 | 16 / 35 | 5607 |
| 6 | 1 | 68.9 | 86.7 | 21 / 35 | 5418 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 46 | 74% |
| shu.nitro.LENIN .T34 | 42 | 52% |
| lrem.Spectre 0.4.4 | 36 | 94% |
| js.PinBall 1.6 | 8 | 88% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 33 | 33% | 62 |
| ak.Fermat 2.0 | 32 | 32% | 60 |
| lrem.Spectre 0.4.4 | 12 | 12% | 41 |
| jaybot.adv.bots.JayBot 2.0 | 10 | 10% | 17 |
| js.PinBall 1.6 | 8 | 8% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 10 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.7 | 136 / 210 | 2.20 | 18.3% | 26536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.3% | 136 |
| mk.Alpha 0.2.1 | 2.0 | 14.2% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.2% | 11 |
| EH.Eagle 1.0.6 | 4.0 | 10.8% | 6 |
| wee.Gem 1.8.4 | 4.7 | 10.2% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.6% | 4 |
| joe.ADinosaur 1.0 | 7.0 | 8.3% | 2 |
| throxbot.ThroxBot 0.1 | 8.2 | 6.9% | 2 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 86.3 | 21 / 35 | 4546 |
| 2 | 1 | 65.4 | 81.0 | 18 / 35 | 4098 |
| 3 | 1 | 67.8 | 86.3 | 24 / 35 | 4502 |
| 4 | 1 | 67.1 | 86.7 | 21 / 35 | 4329 |
| 5 | 1 | 68.8 | 88.9 | 24 / 35 | 4653 |
| 6 | 1 | 69.3 | 91.1 | 28 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 72 | 89% |
| sheldor.melee.nano.TestMelee 0.1 | 26 | 96% |
| EH.Eagle 1.0.6 | 23 | 87% |
| wee.Gem 1.8.4 | 18 | 78% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 26 | 35% | 81 |
| wee.Gem 1.8.4 | 10 | 14% | 33 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 12% | 40 |
| EH.Eagle 1.0.6 | 9 | 12% | 24 |
| caimano.Furia_Ceca 0.22 | 6 | 8% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 7% | 10 |
| joe.ADinosaur 1.0 | 4 | 5% | 4 |
| throxbot.ThroxBot 0.1 | 3 | 4% | 7 |
| cs.Grudge 1.0 | 2 | 3% | 2 |

## Melee bench: F28

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.6 | 153 / 210 | 1.67 | 19.9% | 28731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.9% | 153 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 29 |
| uji.Antique 1.0 | 3.2 | 11.9% | 12 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.8% | 11 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.3% | 3 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 0 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.1% | 2 |
| stelo.Lifestealer 1.0 | 8.8 | 5.6% | 0 |
| stelo.PianistNano 1.2 | 9.0 | 5.9% | 0 |
| matt.advanced.Katana 1.0 | 9.2 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 93.3 | 28 / 35 | 4757 |
| 2 | 1 | 69.9 | 92.4 | 24 / 35 | 4857 |
| 3 | 1 | 71.0 | 96.2 | 29 / 35 | 5011 |
| 4 | 1 | 69.0 | 90.2 | 25 / 35 | 4577 |
| 5 | 1 | 70.8 | 94.9 | 27 / 35 | 5002 |
| 6 | 1 | 67.9 | 88.6 | 20 / 35 | 4527 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 86 | 83% |
| uji.Antique 1.0 | 45 | 96% |
| qohnil.blot.BlotBot 3.61 | 28 | 82% |
| pfvicm.Sobieski 7.2.3b | 9 | 78% |
| ahr.ice.Ice 1.0.2 | 5 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |

Hadur died in 57 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 24 | 42% | 94 |
| uji.Antique 1.0 | 10 | 18% | 44 |
| pfvicm.Sobieski 7.2.3b | 9 | 16% | 16 |
| qohnil.blot.BlotBot 3.61 | 6 | 11% | 36 |
| amk.ChumbaWumba 0.3 | 6 | 11% | 8 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 6 |
| matt.advanced.Katana 1.0 | 1 | 2% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.3 | 123 / 210 | 2.23 | 19.0% | 29995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.0% | 123 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 14.8% | 49 |
| deewiant.Anomaly 0.2 | 3.0 | 14.2% | 23 |
| myl.micro.Troodon 1.10 | 3.8 | 12.4% | 4 |
| jok.PheonixM 0.1.2 | 5.0 | 9.6% | 5 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.0% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.5 | 5.1% | 0 |
| jangs.ns51 1.0 | 9.0 | 4.9% | 1 |
| ap.Frederick 1.1 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.1 | 22 / 35 | 4959 |
| 2 | 1 | 70.3 | 88.6 | 24 / 35 | 5147 |
| 3 | 1 | 68.7 | 86.7 | 19 / 35 | 4916 |
| 4 | 1 | 69.7 | 86.7 | 21 / 35 | 5030 |
| 5 | 1 | 68.5 | 84.8 | 17 / 35 | 5047 |
| 6 | 1 | 69.2 | 87.0 | 20 / 35 | 4896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 84% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 71% |
| myl.micro.Troodon 1.10 | 26 | 96% |
| jok.PheonixM 0.1.2 | 12 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |
| jangs.ns51 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 34 | 39% | 71 |
| deewiant.Anomaly 0.2 | 28 | 32% | 68 |
| myl.micro.Troodon 1.10 | 13 | 15% | 35 |
| jok.PheonixM 0.1.2 | 9 | 10% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 5 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.4 | 62 / 210 | 3.21 | 15.2% | 24083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.3 | 15.2% | 62 |
| catcat20.Matcha 0.006 | 2.5 | 14.1% | 49 |
| darkcanuck.B26354 1.06 | 3.5 | 13.2% | 39 |
| oog.melee.Capulet 1.2 | 3.7 | 13.1% | 29 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.9% | 23 |
| intruder.PrairieWolf 2.61 | 6.5 | 7.9% | 4 |
| ntc.Opposite 1.5 | 7.2 | 7.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.8% | 2 |
| tripphippy.Alice 1.1 | 8.2 | 6.7% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 77.5 | 10 / 35 | 3998 |
| 2 | 1 | 62.5 | 75.9 | 8 / 35 | 3948 |
| 3 | 2 | 62.2 | 72.4 | 10 / 35 | 3774 |
| 4 | 1 | 65.1 | 78.4 | 10 / 35 | 4476 |
| 5 | 2 | 62.7 | 73.0 | 13 / 35 | 3680 |
| 6 | 1 | 63.9 | 75.6 | 11 / 35 | 4207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 33 | 58% |
| stelo.PastFuture 2.3.2 | 20 | 85% |
| oog.melee.Capulet 1.2 | 19 | 79% |
| darkcanuck.B26354 1.06 | 13 | 54% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 40 | 27% | 51 |
| catcat20.Matcha 0.006 | 31 | 21% | 50 |
| stelo.PastFuture 2.3.2 | 31 | 21% | 47 |
| oog.melee.Capulet 1.2 | 24 | 16% | 38 |
| ntc.Opposite 1.5 | 9 | 6% | 9 |
| intruder.PrairieWolf 2.61 | 7 | 5% | 8 |
| tripphippy.Alice 1.1 | 5 | 3% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 75.3 | 58 / 210 | 3.22 | 15.1% | 22381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.4% | 88 |
| hadur117.mini.DeiseAIM2 0.3 | 2.0 | 15.1% | 58 |
| gh.mini.Griezel 0.2 | 3.2 | 13.3% | 43 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 12 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.1% | 6 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.0% | 0 |
| fm.mammillarias 1.3 | 8.2 | 6.0% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 69.5 | 5 / 35 | 3383 |
| 2 | 2 | 64.4 | 78.7 | 14 / 35 | 3708 |
| 3 | 2 | 63.5 | 74.3 | 11 / 35 | 3885 |
| 4 | 2 | 64.3 | 79.0 | 10 / 35 | 3745 |
| 5 | 2 | 61.0 | 71.4 | 6 / 35 | 3550 |
| 6 | 2 | 65.0 | 79.0 | 12 / 35 | 4110 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 49% |
| gh.mini.Griezel 0.2 | 28 | 43% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| spinnercat.micro.Tyger 0.1 | 9 | 78% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 0% |

Hadur died in 152 of 210 rounds, at a mean tick of 799. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 50 | 33% | 72 |
| gh.mini.Griezel 0.2 | 48 | 32% | 60 |
| d414.nano.Quantum 1.0.0 | 18 | 12% | 27 |
| spinnercat.micro.Tyger 0.1 | 12 | 8% | 18 |
| timmit.nano.TimDog 0.33 | 8 | 5% | 11 |
| gh.nano.Grofvuil 0.2 | 7 | 5% | 13 |
| fm.mammillarias 1.3 | 6 | 4% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.8 | 135 / 210 | 2.01 | 19.0% | 30566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.0% | 135 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 40 |
| apc.botM 3.0 | 3.2 | 11.8% | 19 |
| lxx.ConceptA 0.8 | 3.8 | 10.9% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 9.4% | 4 |
| bayen.UbaMicro 1.4 | 6.2 | 8.3% | 3 |
| panzer.Panzer 0.2 | 6.8 | 7.6% | 1 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 1 |
| yk.JahMicro 1.0 | 8.8 | 6.2% | 1 |
| donjezza.Jezza 1.0 | 9.5 | 6.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.8 | 19 / 35 | 4820 |
| 2 | 1 | 69.4 | 89.8 | 27 / 35 | 5159 |
| 3 | 1 | 68.1 | 87.9 | 22 / 35 | 4810 |
| 4 | 1 | 70.0 | 94.0 | 23 / 35 | 5494 |
| 5 | 1 | 69.2 | 90.5 | 24 / 35 | 5215 |
| 6 | 1 | 67.6 | 85.7 | 20 / 35 | 5068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 69% |
| apc.botM 3.0 | 28 | 89% |
| lxx.ConceptA 0.8 | 24 | 88% |
| vjik.UnViolation 1.1 | 12 | 100% |
| donjezza.Jezza 1.0 | 7 | 86% |
| yk.JahMicro 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| bayen.UbaMicro 1.4 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 32 | 43% | 91 |
| apc.botM 3.0 | 12 | 16% | 40 |
| lxx.ConceptA 0.8 | 12 | 16% | 26 |
| panzer.Panzer 0.2 | 6 | 8% | 8 |
| vjik.UnViolation 1.1 | 3 | 4% | 23 |
| donjezza.Jezza 1.0 | 3 | 4% | 8 |
| bayen.UbaMicro 1.4 | 3 | 4% | 7 |
| conscience.Electron 1.3g | 3 | 4% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.1 | 140 / 210 | 2.07 | 19.5% | 31089 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.5% | 140 |
| maribo.Quester 0.3 | 2.2 | 14.9% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.1% | 12 |
| labg.Cataclysm 2.05 | 4.5 | 10.9% | 18 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.0% | 4 |
| baal.nano.N 1.42 | 6.3 | 8.1% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.4% | 3 |
| zyx.micro.Ant 1.1 | 8.5 | 5.5% | 1 |
| sanja.First 0.1 | 8.8 | 5.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 86.0 | 25 / 35 | 5293 |
| 2 | 1 | 69.5 | 86.7 | 22 / 35 | 5343 |
| 3 | 1 | 67.8 | 84.4 | 19 / 35 | 4855 |
| 4 | 1 | 69.6 | 89.2 | 25 / 35 | 4938 |
| 5 | 1 | 69.3 | 89.2 | 21 / 35 | 5015 |
| 6 | 1 | 71.5 | 93.3 | 28 / 35 | 5645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 91% |
| gre.svman4.Leonidas 1.3.2 | 43 | 98% |
| maribo.Quester 0.3 | 37 | 86% |
| labg.Cataclysm 2.05 | 19 | 74% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 89% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 24 | 34% | 64 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 17 | 24% | 58 |
| labg.Cataclysm 2.05 | 10 | 14% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 10% | 14 |
| gre.svman4.Leonidas 1.3.2 | 6 | 8% | 32 |
| sanja.First 0.1 | 2 | 3% | 6 |
| zyx.micro.Ant 1.1 | 2 | 3% | 4 |
| baal.nano.N 1.42 | 1 | 1% | 4 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.2 | 80 / 210 | 2.51 | 17.2% | 29023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.5 | 17.2% | 80 |
| stelo.Spread 0.9 | 1.8 | 16.8% | 71 |
| kid.Gladiator .7.2 | 2.7 | 16.3% | 44 |
| tcf.Reach 3 | 4.2 | 11.1% | 5 |
| jcs.Seth 1.8 | 4.8 | 10.6% | 8 |
| cli.Dancer 1.1 | 6.0 | 9.6% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 16 / 35 | 4960 |
| 2 | 3 | 66.2 | 81.0 | 8 / 35 | 4678 |
| 3 | 1 | 67.1 | 81.3 | 13 / 35 | 4960 |
| 4 | 1 | 68.1 | 83.5 | 17 / 35 | 4973 |
| 5 | 2 | 65.4 | 78.7 | 9 / 35 | 4678 |
| 6 | 1 | 68.5 | 87.6 | 17 / 35 | 4774 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 72 | 51% |
| kid.Gladiator .7.2 | 36 | 53% |
| jcs.Seth 1.8 | 11 | 91% |
| tcf.Reach 3 | 9 | 89% |
| cli.Dancer 1.1 | 4 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 57 | 44% | 73 |
| stelo.Spread 0.9 | 52 | 40% | 90 |
| jcs.Seth 1.8 | 9 | 7% | 19 |
| tcf.Reach 3 | 7 | 5% | 19 |
| cli.Dancer 1.1 | 2 | 2% | 6 |
| ratosh.Wesco 1.4 | 2 | 2% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 78.7 | 39 / 210 | 2.91 | 15.1% | 22366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.0% | 144 |
| hadur117.mini.DeiseAIM2 0.3 | 2.0 | 15.1% | 39 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.3% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.4% | 7 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 3 |
| wit.Chuliath 1.0 | 6.3 | 7.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.4% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.9% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 75.9 | 4 / 35 | 3563 |
| 2 | 2 | 64.5 | 79.7 | 9 / 35 | 3848 |
| 3 | 2 | 64.8 | 81.3 | 9 / 35 | 3773 |
| 4 | 2 | 62.7 | 76.8 | 4 / 35 | 3552 |
| 5 | 2 | 63.4 | 78.7 | 4 / 35 | 3615 |
| 6 | 2 | 64.8 | 80.0 | 9 / 35 | 4015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 80 | 16% |
| gh.mini.Gruwel 0.9 | 13 | 46% |
| rz.HawkOnFire 0.1 | 11 | 82% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 171 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 95 | 56% | 108 |
| gh.mini.Gruwel 0.9 | 39 | 23% | 46 |
| rz.HawkOnFire 0.1 | 16 | 9% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 6% | 17 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |
| dans.Cinnamon 1.2 | 1 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 94.9 | 173 / 210 | 1.46 | 21.4% | 33955 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 21.4% | 173 |
| alpha.RainingFire 1.0 | 2.7 | 11.8% | 12 |
| bzdp.Pansy 2.1 | 2.7 | 11.6% | 6 |
| bvh.micro.Freya 0.3 | 4.2 | 10.5% | 6 |
| mz.Cork 0.1 | 4.8 | 10.3% | 6 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.1% | 2 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.0% | 2 |
| dl.BetterWalls 1.0 | 8.7 | 6.4% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 4.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.0 | 30 / 35 | 5303 |
| 2 | 1 | 71.2 | 93.0 | 28 / 35 | 5686 |
| 3 | 1 | 70.9 | 94.6 | 27 / 35 | 5271 |
| 4 | 1 | 72.3 | 97.1 | 31 / 35 | 5951 |
| 5 | 1 | 70.2 | 91.4 | 23 / 35 | 5445 |
| 6 | 1 | 73.7 | 99.4 | 34 / 35 | 6299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 50 | 92% |
| alpha.RainingFire 1.0 | 30 | 83% |
| bvh.micro.Freya 0.3 | 29 | 97% |
| mz.Cork 0.1 | 25 | 96% |
| bvh.mini.Fenrir 0.39 | 22 | 91% |
| m3thos.Eva02 0.7.1 | 16 | 94% |
| dl.BetterWalls 1.0 | 8 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 41% | 42 |
| bzdp.Pansy 2.1 | 7 | 19% | 60 |
| bvh.mini.Fenrir 0.39 | 5 | 14% | 12 |
| bvh.micro.Freya 0.3 | 4 | 11% | 25 |
| mz.Cork 0.1 | 2 | 5% | 31 |
| m3thos.Eva02 0.7.1 | 2 | 5% | 18 |
| sample.MyFirstRobot 1.0 | 2 | 5% | 8 |
| dl.BetterWalls 1.0 | 0 | 0% | 12 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.6 | 178 / 210 | 1.58 | 20.8% | 36405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 20.8% | 178 |
| germ.TheMind .2 | 2.0 | 10.9% | 5 |
| EBBU.Sim2 1.02 | 3.8 | 9.5% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.0 | 9.7% | 3 |
| agrach.Dalek 1.0 | 5.8 | 8.8% | 4 |
| mb.Beast 0.1 | 6.2 | 8.8% | 3 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.8% | 4 |
| lmk.ACPFinal 0.1 | 7.7 | 8.4% | 4 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.5% | 2 |
| skm.Ryubot 1.0 | 9.5 | 6.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.5 | 29 / 35 | 6173 |
| 2 | 1 | 69.6 | 93.3 | 30 / 35 | 5632 |
| 3 | 1 | 70.7 | 93.7 | 30 / 35 | 6308 |
| 4 | 1 | 71.3 | 96.8 | 32 / 35 | 6063 |
| 5 | 1 | 70.2 | 93.0 | 30 / 35 | 5957 |
| 6 | 1 | 70.3 | 94.3 | 27 / 35 | 6272 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 43 | 98% |
| stelo.UntouchableNano 1.3 | 28 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 96% |
| agrach.Dalek 1.0 | 22 | 95% |
| EBBU.Sim2 1.02 | 20 | 100% |
| mb.Beast 0.1 | 19 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| skm.Ryubot 1.0 | 12 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 483. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 19% | 37 |
| lmk.ACPFinal 0.1 | 6 | 19% | 21 |
| germ.TheMind .2 | 5 | 16% | 36 |
| mb.Beast 0.1 | 4 | 13% | 30 |
| agrach.Dalek 1.0 | 3 | 9% | 28 |
| stelo.UntouchableNano 1.3 | 3 | 9% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 9% | 9 |
| EBBU.Sim2 1.02 | 2 | 6% | 22 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.6 | 79 / 210 | 2.83 | 16.2% | 25452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.2% | 83 |
| hadur117.mini.DeiseAIM2 0.3 | 1.7 | 16.2% | 79 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.1% | 9 |
| bts.mega.Gnarly 1.4 | 5.0 | 11.0% | 16 |
| cs.Wren 1.0 | 5.3 | 10.6% | 4 |
| kdf.KoulDestroyer 1.0 | 7.2 | 8.3% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.9% | 3 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.3 | 13 / 35 | 4445 |
| 2 | 2 | 65.2 | 79.0 | 14 / 35 | 4160 |
| 3 | 2 | 63.4 | 74.9 | 10 / 35 | 4168 |
| 4 | 2 | 64.8 | 79.7 | 12 / 35 | 4054 |
| 5 | 1 | 65.5 | 81.6 | 13 / 35 | 4231 |
| 6 | 2 | 66.3 | 81.3 | 17 / 35 | 4394 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 56% |
| bts.mega.Gnarly 1.4 | 20 | 80% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 76% |
| bvh.mini.Freya 0.55 | 16 | 75% |
| cs.Wren 1.0 | 8 | 88% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 718. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 52 | 40% | 78 |
| bts.mega.Gnarly 1.4 | 24 | 18% | 41 |
| bvh.mini.Freya 0.55 | 24 | 18% | 32 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 11% | 26 |
| cs.Wren 1.0 | 8 | 6% | 18 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 9 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 3 |

## Melee bench: F39

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.1 | 89 / 210 | 2.43 | 17.5% | 29156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 17.5% | 89 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 21 |
| az.Ololobot 0.2.4 | 3.0 | 13.2% | 56 |
| catcat20.Lambda 0.024 | 4.2 | 11.4% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 5.3 | 9.8% | 16 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 7.7% | 1 |
| gimp.GimpBot 0.1 | 7.0 | 7.4% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 7.6% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.7 | 17 / 35 | 4853 |
| 2 | 1 | 68.5 | 89.2 | 20 / 35 | 5487 |
| 3 | 1 | 64.8 | 79.4 | 11 / 35 | 4760 |
| 4 | 1 | 65.2 | 81.0 | 14 / 35 | 4570 |
| 5 | 1 | 65.3 | 81.9 | 12 / 35 | 4743 |
| 6 | 1 | 67.2 | 86.7 | 15 / 35 | 4743 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 43% |
| bvh.fry.Freya 0.82 | 36 | 86% |
| catcat20.Lambda 0.024 | 24 | 63% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 93% |
| winamp32.micro.MicroMacro 1.0 | 5 | 80% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 45 | 37% | 72 |
| az.Ololobot 0.2.4 | 32 | 26% | 59 |
| catcat20.Lambda 0.024 | 18 | 15% | 29 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 10% | 17 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 12 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 6 |
| gimp.GimpBot 0.1 | 3 | 2% | 11 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.7 | 122 / 210 | 2.20 | 18.8% | 29969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.8% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 44 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.2% | 19 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 7 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.3% | 9 |
| stelo.Randomness 1.0 | 6.2 | 8.8% | 6 |
| alpha.BlackIce 1.0 | 6.7 | 8.5% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.3% | 0 |
| sample.Corners 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.3 | 16 / 35 | 4770 |
| 2 | 1 | 68.1 | 85.4 | 19 / 35 | 4853 |
| 3 | 1 | 67.7 | 85.1 | 21 / 35 | 4613 |
| 4 | 1 | 68.3 | 85.1 | 19 / 35 | 5031 |
| 5 | 1 | 70.2 | 92.7 | 24 / 35 | 5368 |
| 6 | 1 | 69.8 | 90.5 | 23 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 51 | 76% |
| kano.gamma.KanoGamma 1.8 | 34 | 74% |
| Polkwane.SmashMelee 1.0 | 21 | 90% |
| mz.AntiGrav 1.0 | 18 | 94% |
| stelo.Randomness 1.0 | 13 | 69% |
| alpha.BlackIce 1.0 | 7 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 45% | 71 |
| kano.gamma.KanoGamma 1.8 | 16 | 18% | 47 |
| Polkwane.SmashMelee 1.0 | 12 | 13% | 21 |
| mz.AntiGrav 1.0 | 6 | 7% | 24 |
| stelo.Randomness 1.0 | 6 | 7% | 22 |
| alpha.BlackIce 1.0 | 5 | 6% | 11 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 7 |
| amk.superstrike.SuperStrike 0.3 | 2 | 2% | 4 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 85.6 | 104 / 210 | 2.30 | 17.6% | 26444 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 17.6% | 104 |
| eem.EvBotNG v12.8 | 2.2 | 15.5% | 63 |
| ary.Swarm 1.1 | 3.2 | 13.1% | 19 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.5% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.2% | 11 |
| shrub.Silver v048 | 6.3 | 8.5% | 1 |
| zyx.nano.Ant 1.1 | 6.7 | 7.9% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 1 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.6 | 16 / 35 | 4301 |
| 2 | 1 | 67.6 | 87.9 | 17 / 35 | 4286 |
| 3 | 1 | 67.5 | 85.4 | 19 / 35 | 4158 |
| 4 | 1 | 68.2 | 86.7 | 16 / 35 | 4739 |
| 5 | 1 | 68.9 | 89.8 | 22 / 35 | 4557 |
| 6 | 1 | 66.1 | 82.9 | 14 / 35 | 4403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 58% |
| ary.Swarm 1.1 | 28 | 71% |
| lessonz.robocode.Oz 0.5.0 | 26 | 96% |
| simonton.nano.MeleeSeed 1.8 | 17 | 82% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| stelo.Mirror 1.1 | 2 | 50% |
| shrub.Silver v048 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 890. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 46 | 43% | 79 |
| ary.Swarm 1.1 | 30 | 28% | 53 |
| simonton.nano.MeleeSeed 1.8 | 14 | 13% | 32 |
| lessonz.robocode.Oz 0.5.0 | 10 | 9% | 26 |
| stelo.Mirror 1.1 | 3 | 3% | 8 |
| zyx.nano.Ant 1.1 | 2 | 2% | 3 |
| shrub.Silver v048 | 1 | 1% | 5 |
| jsal.Jsalbot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.3 | 101 / 210 | 2.32 | 18.4% | 33052 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 18.4% | 101 |
| wompi.Wallaby 5.1 | 2.3 | 15.3% | 51 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 22 |
| ara.Shera 0.88 | 3.3 | 13.8% | 32 |
| amz.NanoClone 1.41 | 5.0 | 9.0% | 2 |
| maribo.IotaCT 1.1 | 6.7 | 6.9% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.9% | 1 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 1 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.9 | 19 / 35 | 5457 |
| 2 | 1 | 67.3 | 82.9 | 13 / 35 | 5468 |
| 3 | 1 | 66.1 | 80.0 | 10 / 35 | 5347 |
| 4 | 1 | 68.2 | 84.1 | 20 / 35 | 5546 |
| 5 | 1 | 69.7 | 89.5 | 22 / 35 | 5698 |
| 6 | 1 | 68.7 | 87.6 | 17 / 35 | 5536 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 48 | 77% |
| maribo.mini.MiniQuester 0.1 | 44 | 73% |
| ara.Shera 0.88 | 39 | 67% |
| dsw.StaticD 1.0 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 42 | 39% | 85 |
| ara.Shera 0.88 | 32 | 29% | 56 |
| maribo.mini.MiniQuester 0.1 | 29 | 27% | 55 |
| amz.NanoClone 1.41 | 4 | 4% | 7 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 73.3 | 26 / 210 | 3.40 | 14.2% | 22188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 158 |
| hadur117.mini.DeiseAIM2 0.3 | 2.0 | 14.2% | 26 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.5% | 14 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.3% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.1% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.1% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.2% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 75.9 | 5 / 35 | 3644 |
| 2 | 2 | 62.8 | 72.4 | 7 / 35 | 3625 |
| 3 | 2 | 62.8 | 73.3 | 2 / 35 | 3646 |
| 4 | 2 | 62.7 | 72.4 | 1 / 35 | 3848 |
| 5 | 2 | 61.8 | 67.9 | 5 / 35 | 3618 |
| 6 | 2 | 64.8 | 78.1 | 6 / 35 | 3807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 14% |
| brainfade.melee.Dusk 0.44 | 9 | 78% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 55% | 116 |
| brainfade.melee.Dusk 0.44 | 26 | 14% | 31 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 6% | 15 |
| mz.NanoGod 2.02 | 11 | 6% | 11 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 7 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.1 | 124 / 210 | 1.98 | 19.5% | 32776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 19.5% | 124 |
| stelo.Liblix 0.3.1 | 2.0 | 16.1% | 55 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.4% | 28 |
| wompi.Quokka 1.6 | 4.5 | 9.6% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.3% | 0 |
| jwirde.Gort 2.0 | 5.8 | 8.2% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.6% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 20 / 35 | 5386 |
| 2 | 1 | 70.0 | 90.5 | 23 / 35 | 5360 |
| 3 | 1 | 70.3 | 91.1 | 25 / 35 | 5543 |
| 4 | 1 | 69.4 | 87.9 | 16 / 35 | 5350 |
| 5 | 1 | 69.7 | 87.6 | 21 / 35 | 5701 |
| 6 | 1 | 69.1 | 86.7 | 19 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 77% |
| tzu.TheArtOfWar 1.2 | 44 | 77% |
| wompi.Quokka 1.6 | 10 | 90% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 67% |
| jwirde.Gort 2.0 | 3 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 46% | 108 |
| tzu.TheArtOfWar 1.2 | 20 | 22% | 54 |
| wompi.Quokka 1.6 | 10 | 11% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 9% | 14 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 4 |
| jwirde.Gort 2.0 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 2 | 2% | 4 |
| disan.Chair 2.2.0 | 0 | 0% | 4 |
4 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.5 | 93 / 210 | 2.04 | 20.3% | 38620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseAIM2 0.3 | 1.0 | 20.3% | 93 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 12.8% | 105 |
| jje.BagPuss 1.2 | 3.0 | 11.3% | 5 |
| sul.Lunar 1.1 | 4.5 | 10.2% | 4 |
| myl.nano.Graviton 1.10 | 5.5 | 9.8% | 1 |
| fm.claire 1.7 | 6.3 | 8.5% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.3 | 8.1% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.2% | 4 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.9 | 18 / 35 | 6421 |
| 2 | 1 | 69.6 | 86.3 | 14 / 35 | 6424 |
| 3 | 1 | 70.8 | 89.8 | 14 / 35 | 6620 |
| 4 | 1 | 69.8 | 88.9 | 15 / 35 | 6117 |
| 5 | 1 | 71.2 | 91.1 | 20 / 35 | 6676 |
| 6 | 1 | 69.2 | 85.7 | 12 / 35 | 6362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 114 | 29% |
| myl.nano.Graviton 1.10 | 16 | 94% |
| pez.mini.ChironexFleckeri 0.5 | 16 | 100% |
| sul.Lunar 1.1 | 13 | 100% |
| jje.BagPuss 1.2 | 12 | 92% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 3 | 67% |

Hadur died in 118 of 210 rounds, at a mean tick of 2474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 81 | 69% | 0 |
| jje.BagPuss 1.2 | 14 | 12% | 56 |
| myl.nano.Graviton 1.10 | 7 | 6% | 42 |
| sul.Lunar 1.1 | 4 | 3% | 55 |
| fm.claire 1.7 | 4 | 3% | 12 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 28 |
| hvilela.HVilela 0.9 | 2 | 2% | 7 |
| wit.Deep7 2.0 | 2 | 2% | 5 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseAIM2 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 83.6 | 75 / 210 | 2.48 | 16.6% | 25489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.7% | 56 |
| hadur117.mini.DeiseAIM2 0.3 | 2.0 | 16.6% | 75 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.2% | 65 |
| cx.Princess 1.0 | 4.5 | 10.4% | 11 |
| mz.MicroSheep 1.0 | 4.7 | 10.2% | 2 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.1% | 0 |
| kurios.DOSexe .9a | 8.3 | 5.0% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.7 | 5.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.0 | 15 / 35 | 4452 |
| 2 | 2 | 65.9 | 81.6 | 11 / 35 | 4498 |
| 3 | 1 | 66.9 | 83.8 | 13 / 35 | 4620 |
| 4 | 3 | 65.6 | 83.5 | 12 / 35 | 3993 |
| 5 | 2 | 65.4 | 85.1 | 14 / 35 | 3630 |
| 6 | 3 | 65.3 | 81.6 | 10 / 35 | 4296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 57 | 61% |
| rsalesc.melee.Medina 0.4.5 | 38 | 34% |
| cx.Princess 1.0 | 16 | 75% |
| arthord.NanoSatanMelee Beta | 7 | 100% |
| mz.MicroSheep 1.0 | 6 | 100% |
| sadoner.killer 0.2 | 3 | 67% |

Hadur died in 136 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 56 | 41% | 96 |
| rsalesc.melee.Medina 0.4.5 | 49 | 36% | 62 |
| cx.Princess 1.0 | 10 | 7% | 17 |
| sadoner.killer 0.2 | 9 | 7% | 14 |
| mz.MicroSheep 1.0 | 7 | 5% | 13 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 2 |

