# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.2 | 46 / 210 | 2.51 | 16.7% | 30734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 143 |
| hadur117.mini.DeiseW50 0.3 | 2.0 | 16.7% | 46 |
| sgp.JollyNinja 3.53 | 3.2 | 11.4% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 0 |
| mz.MicroGodMelee 1 | 4.8 | 10.4% | 7 |
| lorneswork.Predator 1.0 | 5.7 | 9.6% | 1 |
| adt.Ar2 1.0 | 6.8 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 82.2 | 6 / 35 | 5224 |
| 2 | 2 | 65.6 | 81.9 | 5 / 35 | 4974 |
| 3 | 2 | 67.3 | 84.8 | 10 / 35 | 5378 |
| 4 | 2 | 67.1 | 84.1 | 12 / 35 | 5207 |
| 5 | 2 | 66.4 | 83.8 | 6 / 35 | 4995 |
| 6 | 2 | 65.5 | 82.2 | 7 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 124 | 16% |
| sgp.JollyNinja 3.53 | 13 | 69% |
| mz.MicroGodMelee 1 | 8 | 50% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 1099. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 71% | 136 |
| sgp.JollyNinja 3.53 | 17 | 10% | 23 |
| mz.MicroGodMelee 1 | 12 | 7% | 18 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 17 |
| lorneswork.Predator 1.0 | 4 | 2% | 9 |
| adt.Ar2 1.0 | 2 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.9 | 82 / 210 | 2.99 | 17.1% | 31290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.1% | 82 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.3% | 34 |
| pulsar.PulsarMax 0.8.9 | 2.8 | 13.9% | 57 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.4% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.0% | 17 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 7.7% | 1 |
| sch.Simone 0.3d | 7.0 | 7.9% | 8 |
| Noran.BitchingElk 0.054 | 7.8 | 7.2% | 10 |
| stelo.PatternRobot 1.0 | 8.7 | 6.3% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 74.9 | 15 / 35 | 5344 |
| 2 | 1 | 65.9 | 78.4 | 13 / 35 | 4993 |
| 3 | 1 | 67.2 | 81.9 | 15 / 35 | 5628 |
| 4 | 1 | 63.1 | 73.0 | 8 / 35 | 4649 |
| 5 | 1 | 66.7 | 79.0 | 16 / 35 | 5375 |
| 6 | 1 | 67.0 | 80.0 | 15 / 35 | 5301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 81% |
| pulsar.PulsarMax 0.8.9 | 38 | 50% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| stelo.PatternRobot 1.0 | 6 | 100% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| com.cohesiva.robocode.ManOwaR 1.0 | 4 | 75% |
| sch.Simone 0.3d | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 41% | 73 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 23 | 18% | 54 |
| lrem.micro.SpikeSoldier 0.4 | 21 | 16% | 30 |
| Noran.BitchingElk 0.054 | 7 | 5% | 12 |
| fnc.bandit.Bandit 5.2.0 | 7 | 5% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 5% | 11 |
| stelo.PatternRobot 1.0 | 5 | 4% | 8 |
| sch.Simone 0.3d | 4 | 3% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 4 |

## Melee bench: F03

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.5 | 147 / 210 | 1.77 | 20.2% | 38624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 20.2% | 147 |
| radnor.DoctorBob 1.42 | 2.7 | 13.6% | 13 |
| vuen.Cake 2.51 | 3.2 | 12.8% | 28 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.1% | 20 |
| urdos.URDOS 1.3 | 5.2 | 8.8% | 2 |
| adt.Ar1 2.1 | 6.7 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 6.8 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 93.7 | 23 / 35 | 6821 |
| 2 | 1 | 69.7 | 90.8 | 23 / 35 | 5928 |
| 3 | 1 | 69.5 | 89.8 | 21 / 35 | 6336 |
| 4 | 1 | 70.6 | 90.2 | 24 / 35 | 6666 |
| 5 | 1 | 70.9 | 91.7 | 28 / 35 | 6421 |
| 6 | 1 | 70.7 | 92.7 | 28 / 35 | 6452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 61 | 77% |
| kawigi.nano.Lib 1.0 | 60 | 88% |
| radnor.DoctorBob 1.42 | 35 | 97% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 100% |
| urdos.URDOS 1.3 | 2 | 50% |
| adt.Ar1 2.1 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 22 | 35% | 73 |
| kawigi.nano.Lib 1.0 | 20 | 32% | 71 |
| radnor.DoctorBob 1.42 | 14 | 22% | 44 |
| urdos.URDOS 1.3 | 4 | 6% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 10 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.4 | 25 / 210 | 2.76 | 16.5% | 33981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.3% | 178 |
| hadur117.mini.DeiseW50 0.3 | 2.0 | 16.5% | 25 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 1 |
| josago.Jorgito 0.16 | 5.2 | 9.0% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 7.4% | 0 |
| css.Delitioner 0.11 | 6.8 | 7.1% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.2% | 1 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 81.6 | 4 / 35 | 5625 |
| 2 | 2 | 68.6 | 85.4 | 7 / 35 | 6084 |
| 3 | 2 | 65.9 | 80.3 | 1 / 35 | 5284 |
| 4 | 2 | 65.1 | 75.2 | 3 / 35 | 5526 |
| 5 | 2 | 67.1 | 81.3 | 6 / 35 | 5791 |
| 6 | 2 | 66.2 | 78.7 | 4 / 35 | 5671 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 13% |
| apc.LeeroyJenkins2 1.0 | 6 | 83% |
| TNT.TNT 0.99.1 | 2 | 50% |
| css.Delitioner 0.11 | 2 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 1209. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 73% | 152 |
| apc.LeeroyJenkins2 1.0 | 19 | 10% | 24 |
| TNT.TNT 0.99.1 | 11 | 6% | 12 |
| josago.Jorgito 0.16 | 8 | 4% | 8 |
| tj.zombie1n 1.0.1 | 7 | 4% | 7 |
| css.Delitioner 0.11 | 4 | 2% | 6 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.2 | 65.4 | 16 / 210 | 4.11 | 12.6% | 21385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.2% | 123 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 57 |
| wompi.Numbat 2.1 | 3.3 | 12.8% | 9 |
| hadur117.mini.DeiseW50 0.3 | 3.7 | 12.6% | 16 |
| ms.Ares 0.19 | 5.3 | 9.1% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 8.5% | 3 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 6.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 67.9 | 7 / 35 | 3887 |
| 2 | 4 | 57.2 | 62.9 | 2 / 35 | 3149 |
| 3 | 4 | 60.5 | 69.2 | 3 / 35 | 3634 |
| 4 | 4 | 60.9 | 68.9 | 2 / 35 | 3764 |
| 5 | 4 | 56.9 | 59.7 | 1 / 35 | 3355 |
| 6 | 3 | 58.8 | 64.1 | 1 / 35 | 3596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 26 | 12% |
| justin.DemonicRage 3.4 | 24 | 38% |
| wompi.Numbat 2.1 | 4 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 194 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 77 | 40% | 81 |
| justin.DemonicRage 3.4 | 44 | 23% | 51 |
| wompi.Numbat 2.1 | 33 | 17% | 37 |
| ms.Ares 0.19 | 18 | 9% | 18 |
| davidalves.net.DuelistMicroMelee 1.4 | 9 | 5% | 9 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.3 | 74 / 210 | 2.96 | 16.4% | 28557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.2 | 16.4% | 74 |
| jekl.StoneGhost 0.7 | 2.0 | 14.7% | 40 |
| origin.SleepSiphon 1.7b | 2.8 | 14.2% | 48 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 11.8% | 31 |
| mld.Wisdom 1.0 | 4.8 | 10.3% | 6 |
| gg.Wolverine 2.0 | 6.0 | 9.4% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 6.9% | 1 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.6% | 5 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 73.0 | 14 / 35 | 4858 |
| 2 | 1 | 68.1 | 87.0 | 18 / 35 | 5142 |
| 3 | 1 | 64.5 | 76.2 | 8 / 35 | 4785 |
| 4 | 1 | 64.5 | 77.5 | 9 / 35 | 4515 |
| 5 | 1 | 64.5 | 77.5 | 11 / 35 | 4419 |
| 6 | 1 | 65.5 | 78.4 | 14 / 35 | 4838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 34 | 88% |
| origin.SleepSiphon 1.7b | 28 | 54% |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 47% |
| gg.Wolverine 2.0 | 11 | 82% |
| mld.Wisdom 1.0 | 7 | 71% |
| DBall.NUKE 0.1 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |

Hadur died in 138 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 34 | 25% | 58 |
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 25% | 45 |
| jekl.StoneGhost 0.7 | 32 | 23% | 49 |
| mld.Wisdom 1.0 | 21 | 15% | 29 |
| gg.Wolverine 2.0 | 8 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 90.1 | 103 / 210 | 1.90 | 19.5% | 37080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 19.5% | 103 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.7% | 53 |
| rtk.Tachikoma 1.0 | 2.8 | 16.7% | 35 |
| franzor.Lizt 1.3.1 | 4.3 | 10.4% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.7% | 6 |
| exauge.GateKeeper 1.1.121g | 6.3 | 8.0% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.3 | 2.2% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 88.6 | 15 / 35 | 6490 |
| 2 | 1 | 71.8 | 93.0 | 20 / 35 | 6210 |
| 3 | 1 | 71.1 | 90.2 | 15 / 35 | 6324 |
| 4 | 1 | 71.2 | 90.8 | 22 / 35 | 5980 |
| 5 | 1 | 69.6 | 87.3 | 13 / 35 | 5982 |
| 6 | 1 | 71.0 | 90.5 | 18 / 35 | 6094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 73% |
| rsalesc.melee.Monk 0.3.6c | 47 | 28% |
| oog.melee.CapuletDroid 1.1 | 17 | 88% |
| franzor.Lizt 1.3.1 | 12 | 50% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 1396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 51 | 47% | 74 |
| rtk.Tachikoma 1.0 | 40 | 37% | 110 |
| franzor.Lizt 1.3.1 | 10 | 9% | 4 |
| oog.melee.CapuletDroid 1.1 | 5 | 5% | 18 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.9 | 110 / 210 | 2.54 | 17.9% | 29943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.9% | 110 |
| tm.Yuugao 1.0 | 2.5 | 12.6% | 37 |
| shrub.Vapour v159 | 2.7 | 12.8% | 33 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.5% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 9.7% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.1% | 6 |
| m3thos.Eva00 1.1 | 6.8 | 8.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.8% | 2 |
| SHAM.WOW 1.4 | 8.8 | 6.8% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.3 | 18 / 35 | 4678 |
| 2 | 1 | 66.9 | 82.2 | 18 / 35 | 5132 |
| 3 | 1 | 65.0 | 79.7 | 18 / 35 | 4507 |
| 4 | 1 | 68.4 | 88.6 | 21 / 35 | 5354 |
| 5 | 1 | 67.0 | 83.5 | 17 / 35 | 5134 |
| 6 | 1 | 67.1 | 83.2 | 18 / 35 | 5138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 47 | 70% |
| shrub.Vapour v159 | 38 | 71% |
| Krabb.sliNk.Garm 0.9u | 18 | 94% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 73% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 100% |
| m3thos.Eva00 1.1 | 5 | 80% |
| zyx.nano.BacillusComma 1.0 | 5 | 80% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 763. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 33 | 32% | 64 |
| shrub.Vapour v159 | 20 | 19% | 46 |
| Krabb.sliNk.Garm 0.9u | 18 | 17% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 9% | 24 |
| zyx.nano.BacillusComma 1.0 | 9 | 9% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 20 |
| m3thos.Eva00 1.1 | 2 | 2% | 10 |
| SHAM.WOW 1.4 | 2 | 2% | 8 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 71.3 | 60 / 210 | 3.58 | 15.1% | 26574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.4% | 99 |
| kc.micro.Figment 1.0 | 2.5 | 14.2% | 26 |
| hadur117.mini.DeiseW50 0.3 | 2.5 | 15.1% | 60 |
| yagami.Tidus 0.11 | 4.2 | 10.8% | 2 |
| pedersen.Grishnakh 1.0 | 5.3 | 10.0% | 11 |
| mc2.enemy.Original 0.9 | 5.7 | 9.2% | 12 |
| dft.Calliope 5.6 | 6.8 | 7.4% | 0 |
| step.nanoPri 1.0 | 8.0 | 6.3% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.6% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 67.0 | 8 / 35 | 4103 |
| 2 | 2 | 64.8 | 74.3 | 13 / 35 | 4608 |
| 3 | 2 | 63.7 | 73.7 | 9 / 35 | 4307 |
| 4 | 3 | 62.9 | 70.8 | 9 / 35 | 4377 |
| 5 | 3 | 62.8 | 68.6 | 8 / 35 | 4692 |
| 6 | 2 | 63.9 | 73.7 | 13 / 35 | 4487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 44% |
| kc.micro.Figment 1.0 | 25 | 80% |
| mc2.enemy.Original 0.9 | 12 | 83% |
| yagami.Tidus 0.11 | 7 | 100% |
| pedersen.Grishnakh 1.0 | 4 | 50% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 49 | 32% | 73 |
| kc.micro.Figment 1.0 | 35 | 23% | 53 |
| mc2.enemy.Original 0.9 | 18 | 12% | 25 |
| yagami.Tidus 0.11 | 15 | 10% | 21 |
| pedersen.Grishnakh 1.0 | 15 | 10% | 17 |
| step.nanoPri 1.0 | 11 | 7% | 11 |
| dft.Calliope 5.6 | 4 | 3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.7 | 146 / 210 | 1.84 | 19.9% | 35781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 19.9% | 146 |
| DTF.Kludgy 1.2b | 2.2 | 13.9% | 23 |
| ne.Chimera 1.2 | 3.3 | 12.3% | 11 |
| ejb.Polaris 1.0.1 | 3.5 | 12.6% | 12 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.5% | 8 |
| vStar.RAFzilla 2.15 | 5.8 | 9.4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.5% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.1 | 23 / 35 | 5514 |
| 2 | 1 | 70.6 | 92.1 | 23 / 35 | 6123 |
| 3 | 1 | 71.9 | 96.8 | 30 / 35 | 6122 |
| 4 | 1 | 70.5 | 91.4 | 25 / 35 | 6032 |
| 5 | 1 | 69.1 | 86.3 | 21 / 35 | 5824 |
| 6 | 1 | 70.6 | 92.4 | 24 / 35 | 6166 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 82% |
| ejb.Polaris 1.0.1 | 46 | 93% |
| ne.Chimera 1.2 | 27 | 85% |
| vStar.RAFzilla 2.15 | 16 | 88% |
| tvv.micro.Antares 1.1.1 | 12 | 83% |
| sam.Samspin 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 35% | 66 |
| ne.Chimera 1.2 | 15 | 23% | 39 |
| ejb.Polaris 1.0.1 | 8 | 12% | 53 |
| tvv.micro.Antares 1.1.1 | 8 | 12% | 16 |
| vStar.RAFzilla 2.15 | 6 | 9% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 3 |
| kurios.DOSexe .9b | 1 | 2% | 9 |
| donjezza.Muncho 1.0 | 1 | 2% | 4 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.3 | 86 / 210 | 2.86 | 16.9% | 28545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.2 | 16.9% | 86 |
| rz.Aleph 0.34 | 1.8 | 16.0% | 61 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 24 |
| djc.DynaBot 0.1.1 | 4.0 | 10.8% | 11 |
| rdt199.Warlord 0.73 | 5.7 | 9.3% | 12 |
| br2.MobyDickBot 1.6 | 6.0 | 8.8% | 9 |
| uji.YellohFellah 1.0 | 6.7 | 8.1% | 6 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.5% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 76.2 | 14 / 35 | 4722 |
| 2 | 1 | 68.1 | 84.8 | 18 / 35 | 5286 |
| 3 | 1 | 64.5 | 76.5 | 13 / 35 | 4514 |
| 4 | 2 | 63.7 | 75.2 | 9 / 35 | 4267 |
| 5 | 1 | 66.9 | 84.1 | 16 / 35 | 4857 |
| 6 | 1 | 66.2 | 79.0 | 16 / 35 | 4899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 50 | 60% |
| cx.mini.Nimrod 0.55 | 21 | 90% |
| djc.DynaBot 0.1.1 | 15 | 80% |
| uji.YellohFellah 1.0 | 12 | 100% |
| rdt199.Warlord 0.73 | 8 | 75% |
| br2.MobyDickBot 1.6 | 7 | 86% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 44% | 90 |
| cx.mini.Nimrod 0.55 | 27 | 22% | 41 |
| rdt199.Warlord 0.73 | 19 | 15% | 25 |
| djc.DynaBot 0.1.1 | 9 | 7% | 20 |
| br2.MobyDickBot 1.6 | 6 | 5% | 11 |
| uji.YellohFellah 1.0 | 3 | 2% | 16 |
| stelo.MirrorNano 1.3 | 2 | 2% | 3 |
| KiraNL.Chupacabra 0.4 | 2 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.8 | 110 / 210 | 2.73 | 17.3% | 26462 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.3% | 110 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.6% | 29 |
| nat.PallasHawk 1.0 | 2.8 | 13.5% | 38 |
| darkcanuck.Leon 1.01 | 3.7 | 12.6% | 15 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.2% | 12 |
| jrm.Test0 1.0 | 5.8 | 8.4% | 2 |
| jp.Perpy 16.0 | 7.7 | 6.6% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.4% | 1 |
| jaybot.bots.Oddball 4.0 | 8.5 | 6.1% | 1 |
| stuff.Vlad 0.1 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.6 | 18 / 35 | 4656 |
| 2 | 1 | 65.7 | 79.7 | 20 / 35 | 4115 |
| 3 | 1 | 67.2 | 85.4 | 18 / 35 | 4486 |
| 4 | 1 | 65.2 | 76.5 | 17 / 35 | 4343 |
| 5 | 1 | 69.1 | 87.9 | 23 / 35 | 4947 |
| 6 | 1 | 63.0 | 73.7 | 14 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 40 | 90% |
| bts.wiki.RipCurl 0.9b | 39 | 82% |
| nat.PallasHawk 1.0 | 33 | 79% |
| brainfade.melee.Genghis 0.36 | 8 | 100% |
| jrm.Test0 1.0 | 5 | 80% |
| jp.Perpy 16.0 | 2 | 50% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| stuff.Vlad 0.1 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 28% | 59 |
| nat.PallasHawk 1.0 | 19 | 19% | 44 |
| darkcanuck.Leon 1.01 | 17 | 17% | 57 |
| brainfade.melee.Genghis 0.36 | 13 | 13% | 17 |
| jrm.Test0 1.0 | 6 | 6% | 11 |
| jp.Perpy 16.0 | 6 | 6% | 7 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 3 | 3% | 3 |

## Melee bench: F13

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.9 | 48 / 210 | 2.99 | 15.3% | 26581 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.2% | 100 |
| ags.Glacier 0.2.11 | 2.0 | 16.1% | 37 |
| hadur117.mini.DeiseW50 0.3 | 2.8 | 15.3% | 48 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 16 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.5% | 11 |
| apc.Colossus2 0.17 | 6.5 | 7.5% | 0 |
| stelo.Wang 1.0 | 6.5 | 7.5% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 76.2 | 6 / 35 | 4343 |
| 2 | 3 | 64.5 | 77.5 | 12 / 35 | 4105 |
| 3 | 3 | 65.6 | 79.4 | 10 / 35 | 4611 |
| 4 | 2 | 65.1 | 79.4 | 8 / 35 | 4743 |
| 5 | 3 | 62.6 | 74.6 | 7 / 35 | 4478 |
| 6 | 3 | 64.3 | 80.6 | 5 / 35 | 4301 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 53 | 36% |
| ags.Glacier 0.2.11 | 34 | 59% |
| shinh.Entangled 0.3 | 7 | 43% |
| stelo.Wang 1.0 | 5 | 100% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |

Hadur died in 164 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 65 | 40% | 83 |
| ags.Glacier 0.2.11 | 44 | 27% | 66 |
| shinh.Entangled 0.3 | 21 | 13% | 23 |
| gh.micro.Gruweltje 0.7 | 17 | 10% | 19 |
| stelo.Wang 1.0 | 9 | 5% | 13 |
| maribo.FollowFire 1 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.0 | 144 / 210 | 1.72 | 20.2% | 35766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 20.2% | 144 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 32 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 23 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.2% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.0% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 6.2 | 8.8% | 4 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.2% | 3 |
| pa.Improved 1.0 | 9.0 | 5.6% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.4 | 27 / 35 | 5924 |
| 2 | 1 | 69.8 | 90.2 | 21 / 35 | 5680 |
| 3 | 1 | 70.2 | 90.5 | 24 / 35 | 5929 |
| 4 | 1 | 71.7 | 96.8 | 27 / 35 | 6067 |
| 5 | 1 | 70.1 | 90.2 | 20 / 35 | 6078 |
| 6 | 1 | 70.9 | 92.1 | 25 / 35 | 6088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 81 | 81% |
| catcat20.shape.Theta 0.018 | 50 | 76% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 86% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 2 | 50% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 32 | 48% | 99 |
| catcat20.shape.Theta 0.018 | 18 | 27% | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 8% | 17 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 5% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 5% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 5% | 8 |
| pa.Improved 1.0 | 1 | 2% | 8 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |

## Melee bench: F15

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 80.9 | 104 / 210 | 2.72 | 18.0% | 32867 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 18.0% | 104 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 25 |
| mld.DustBunny 3.8 | 3.2 | 13.0% | 10 |
| emp.Yngwie 1.11 | 3.5 | 12.6% | 41 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.3% | 14 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 13 |
| lambdaxy.TBot 0.1 | 7.5 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.5% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.9 | 14 / 35 | 4859 |
| 2 | 1 | 68.9 | 85.7 | 19 / 35 | 5617 |
| 3 | 1 | 65.6 | 74.9 | 14 / 35 | 5352 |
| 4 | 1 | 68.6 | 83.8 | 21 / 35 | 5701 |
| 5 | 1 | 67.7 | 81.9 | 18 / 35 | 5534 |
| 6 | 1 | 69.1 | 84.1 | 18 / 35 | 5804 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 34 | 97% |
| cb.nano.Insomnia 1.0 | 27 | 67% |
| emp.Yngwie 1.11 | 25 | 60% |
| kawigi.robot.Girl 1.2 | 20 | 100% |
| mld.DustBunny 3.8 | 17 | 88% |
| divineomega.TrialBot 0.003 | 3 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 25% | 55 |
| emp.Yngwie 1.11 | 21 | 20% | 52 |
| cb.nano.Insomnia 1.0 | 21 | 20% | 16 |
| kawigi.micro.Shiz 1.1 | 16 | 15% | 39 |
| kawigi.robot.Girl 1.2 | 13 | 12% | 31 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 8 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 4 |

## Melee bench: F16

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 78.9 | 79 / 210 | 2.90 | 17.4% | 33304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.4% | 79 |
| gh.Griezel 0.5.2 | 2.0 | 16.0% | 57 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.2 | 14.0% | 11 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 11.4% | 46 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.4% | 1 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.7% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.3% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.3% | 6 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 77.5 | 10 / 35 | 5492 |
| 2 | 1 | 67.4 | 78.7 | 15 / 35 | 5929 |
| 3 | 1 | 67.1 | 80.0 | 12 / 35 | 5522 |
| 4 | 1 | 67.8 | 81.9 | 14 / 35 | 5635 |
| 5 | 1 | 66.1 | 75.9 | 13 / 35 | 5485 |
| 6 | 1 | 66.7 | 79.7 | 15 / 35 | 5241 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 55 | 56% |
| techdude.forest.FlamingForest 1.1 | 27 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 81% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 56 | 43% | 90 |
| techdude.forest.FlamingForest 1.1 | 23 | 18% | 37 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 18% | 36 |
| bvh.fnr.Fenrir 0.36l | 14 | 11% | 16 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 12 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 5 |
| asd.Cthulhu 1.3 | 2 | 2% | 4 |

## Melee bench: F17

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.7 | 87 / 210 | 2.83 | 17.5% | 33577 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.5% | 87 |
| cx.BlestPain 1.41 | 2.5 | 13.5% | 48 |
| et.Predator 1.8 | 3.0 | 13.0% | 20 |
| oog.melee.Mercutio 1.0 | 3.7 | 11.9% | 24 |
| ahf.NanoAndrew .4 | 5.2 | 10.7% | 10 |
| nic.Nicator 2.4 | 5.7 | 10.6% | 14 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.3 | 12 / 35 | 5578 |
| 2 | 1 | 67.4 | 77.5 | 19 / 35 | 5864 |
| 3 | 1 | 67.0 | 82.9 | 14 / 35 | 5397 |
| 4 | 1 | 67.0 | 78.1 | 15 / 35 | 5679 |
| 5 | 1 | 66.0 | 76.8 | 13 / 35 | 5498 |
| 6 | 1 | 67.3 | 81.6 | 14 / 35 | 5561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 41 | 83% |
| cx.BlestPain 1.41 | 30 | 30% |
| oog.melee.Mercutio 1.0 | 25 | 68% |
| nic.Nicator 2.4 | 21 | 62% |
| ahf.NanoAndrew .4 | 13 | 85% |
| maribo.melee.BMV 0.1 | 3 | 67% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 40 | 32% | 54 |
| et.Predator 1.8 | 23 | 19% | 51 |
| nic.Nicator 2.4 | 21 | 17% | 31 |
| oog.melee.Mercutio 1.0 | 18 | 15% | 36 |
| ahf.NanoAndrew .4 | 13 | 10% | 22 |
| maribo.melee.BMV 0.1 | 6 | 5% | 10 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
| goblin.Bender 2.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 84.8 | 113 / 210 | 2.37 | 18.3% | 30259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 18.3% | 113 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.3% | 32 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.1% | 31 |
| ratosh.Nobo 0.21 | 4.8 | 9.8% | 3 |
| uji.DBH 1.1 | 4.8 | 10.3% | 9 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.3% | 8 |
| sigterm.Sigterm 1.0 | 6.7 | 8.4% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.9% | 3 |
| stelo.WangRobot 1.0 | 9.0 | 6.2% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.9 | 13 / 35 | 4888 |
| 2 | 1 | 68.0 | 86.3 | 22 / 35 | 5056 |
| 3 | 1 | 67.8 | 86.3 | 20 / 35 | 5030 |
| 4 | 1 | 67.3 | 82.9 | 21 / 35 | 4998 |
| 5 | 1 | 69.3 | 91.7 | 22 / 35 | 5296 |
| 6 | 1 | 65.7 | 79.4 | 15 / 35 | 4991 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 79% |
| agd.Mooserwirt2 2.7 | 34 | 59% |
| uji.DBH 1.1 | 17 | 94% |
| sigterm.Sigterm 1.0 | 12 | 92% |
| stelo.WangRobot 1.0 | 11 | 82% |
| ratosh.Nobo 0.21 | 10 | 80% |
| spinnercat.Robovirus 2.718 | 10 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 86% |

Hadur died in 97 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 27 | 28% | 63 |
| agd.Mooserwirt2 2.7 | 21 | 22% | 51 |
| ratosh.Nobo 0.21 | 11 | 11% | 20 |
| uji.DBH 1.1 | 10 | 10% | 19 |
| sigterm.Sigterm 1.0 | 10 | 10% | 17 |
| spinnercat.Robovirus 2.718 | 7 | 7% | 14 |
| stelo.WangRobot 1.0 | 4 | 4% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 4% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 3% | 4 |

## Melee bench: F19

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 90.4 | 146 / 210 | 1.87 | 20.6% | 37655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 20.6% | 146 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.9% | 20 |
| mld.Infinity 2.2 | 2.7 | 13.9% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 8 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 6 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.3% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.5% | 0 |
| pac.ABC 2.1 | 7.7 | 7.1% | 3 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 94.9 | 26 / 35 | 6682 |
| 2 | 1 | 71.3 | 90.8 | 25 / 35 | 5954 |
| 3 | 1 | 72.1 | 92.1 | 26 / 35 | 6319 |
| 4 | 1 | 69.9 | 85.7 | 22 / 35 | 5918 |
| 5 | 1 | 71.7 | 90.5 | 23 / 35 | 6534 |
| 6 | 1 | 70.7 | 88.3 | 24 / 35 | 6248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 92% |
| mld.Infinity 2.2 | 50 | 74% |
| krillr.mini.JointStrike 2.0.0 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| erdnis.Rover 0.3 | 4 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 20 | 31% | 115 |
| mld.Infinity 2.2 | 17 | 27% | 24 |
| krillr.mini.JointStrike 2.0.0 | 11 | 17% | 29 |
| erdnis.Rover 0.3 | 9 | 14% | 13 |
| patson.PatsonTestBot 1.0 | 5 | 8% | 15 |
| mbh.Mbh 0.1 | 1 | 2% | 7 |
| pac.ABC 2.1 | 1 | 2% | 2 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.1 | 103 / 210 | 2.43 | 18.8% | 35522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.2 | 18.8% | 103 |
| trm.Wrekt 1.1.6.f | 1.8 | 15.9% | 47 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.0% | 6 |
| fwb.Nine 1.0.1 | 4.0 | 11.3% | 22 |
| catcat20.Rabbit 0.001 | 4.3 | 10.8% | 23 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.0% | 1 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.9% | 7 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.8% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 87.0 | 23 / 35 | 6081 |
| 2 | 1 | 67.8 | 80.3 | 15 / 35 | 6087 |
| 3 | 1 | 69.1 | 84.4 | 21 / 35 | 5981 |
| 4 | 1 | 68.3 | 86.3 | 16 / 35 | 5677 |
| 5 | 2 | 66.2 | 77.8 | 9 / 35 | 5679 |
| 6 | 1 | 69.8 | 88.6 | 19 / 35 | 6017 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 67 | 72% |
| catcat20.Rabbit 0.001 | 28 | 75% |
| fwb.Nine 1.0.1 | 15 | 87% |
| nz.jdc.nano.GridFu 1.0 | 12 | 83% |
| bayen.nut.Squirrel 1.615 | 7 | 71% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 50 | 47% | 85 |
| catcat20.Rabbit 0.001 | 20 | 19% | 41 |
| fwb.Nine 1.0.1 | 14 | 13% | 17 |
| nz.jdc.nano.GridFu 1.0 | 12 | 11% | 34 |
| bayen.nut.Squirrel 1.615 | 8 | 7% | 19 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 92.9 | 140 / 210 | 1.64 | 21.0% | 38247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 21.0% | 140 |
| eem.EvBot v4.6.16 | 2.2 | 15.9% | 60 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.7% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 2 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 5 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 0 |
| fire219.CatBot 1.0 | 7.3 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.0% | 0 |
| PSW.Relentless 0.1 | 9.2 | 5.0% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.8 | 21 / 35 | 6039 |
| 2 | 1 | 71.5 | 93.7 | 23 / 35 | 6131 |
| 3 | 1 | 72.1 | 93.0 | 23 / 35 | 6666 |
| 4 | 1 | 72.4 | 94.0 | 25 / 35 | 6822 |
| 5 | 1 | 71.9 | 93.0 | 24 / 35 | 6579 |
| 6 | 1 | 71.3 | 94.0 | 24 / 35 | 6010 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 66% |
| dummy.mini.Scimitar 1.01 | 39 | 90% |
| cf.RiO.RiOx 4.2.1 | 23 | 100% |
| oa.weak.BotherBot 0.1 | 6 | 100% |
| eld.Hmm 1.0 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 1323. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 62% | 90 |
| dummy.mini.Scimitar 1.01 | 17 | 23% | 66 |
| cf.RiO.RiOx 4.2.1 | 6 | 8% | 26 |
| eld.Hmm 1.0 | 3 | 4% | 18 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 8 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.0 | 76 / 210 | 2.71 | 17.3% | 31793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.3 | 17.3% | 76 |
| kvk.HebusLeTroll 0.35 | 2.2 | 15.7% | 42 |
| pe.SandboxDT 2.71m | 2.5 | 15.4% | 48 |
| jlm.javaDisturbance 0.59 | 4.2 | 13.5% | 31 |
| bigpete.Stewie 1.0 | 4.8 | 11.0% | 13 |
| yk.JahRoslav 1.1 | 6.7 | 6.7% | 0 |
| tad.Dalek98 0.98 | 6.7 | 6.2% | 0 |
| gg.Squaraus 0.6 | 7.8 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.1 | 13 / 35 | 5518 |
| 2 | 3 | 65.8 | 75.6 | 9 / 35 | 5182 |
| 3 | 1 | 67.2 | 82.5 | 14 / 35 | 5096 |
| 4 | 1 | 67.4 | 80.6 | 12 / 35 | 5539 |
| 5 | 1 | 67.8 | 84.1 | 17 / 35 | 5111 |
| 6 | 1 | 66.1 | 78.7 | 11 / 35 | 5347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 43 | 74% |
| pe.SandboxDT 2.71m | 26 | 73% |
| jlm.javaDisturbance 0.59 | 21 | 76% |
| bigpete.Stewie 1.0 | 11 | 73% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 48 | 36% | 77 |
| pe.SandboxDT 2.71m | 35 | 26% | 57 |
| jlm.javaDisturbance 0.59 | 35 | 26% | 48 |
| bigpete.Stewie 1.0 | 15 | 11% | 26 |
| tad.Dalek98 0.98 | 2 | 1% | 2 |

## Melee bench: F23

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 91.0 | 123 / 210 | 1.81 | 19.8% | 33163 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 19.8% | 123 |
| pe.SandboxLump 1.52 | 2.2 | 17.4% | 63 |
| cre.Karolos 0.32 | 2.8 | 14.0% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 8.8% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.8% | 3 |
| sample.Walls 1.0 | 7.2 | 7.9% | 2 |
| cw.megas.Blade 0.8 | 7.3 | 8.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.9 | 19 / 35 | 5478 |
| 2 | 1 | 70.4 | 89.2 | 16 / 35 | 5619 |
| 3 | 1 | 71.8 | 94.6 | 21 / 35 | 5617 |
| 4 | 1 | 69.6 | 88.9 | 19 / 35 | 5234 |
| 5 | 1 | 71.3 | 91.4 | 23 / 35 | 5400 |
| 6 | 1 | 71.9 | 94.0 | 25 / 35 | 5815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 62% |
| cre.Karolos 0.32 | 41 | 88% |
| stelo.AreaTargetingBot 1.1 | 12 | 100% |
| sample.Walls 1.0 | 9 | 89% |
| stelo.RamTrackSurfer 1.2 | 5 | 60% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 841. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 57 | 66% | 111 |
| cre.Karolos 0.32 | 12 | 14% | 51 |
| stelo.AreaTargetingBot 1.1 | 7 | 8% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 5% | 7 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 12 |
| sample.Walls 1.0 | 3 | 3% | 8 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |

## Melee bench: F24

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 68.5 | 51 / 210 | 3.83 | 14.2% | 24496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 2.5 | 13.6% | 38 |
| davidalves.Phoenix 0.54 | 2.5 | 13.4% | 51 |
| hadur117.mini.DeiseW50 0.3 | 2.7 | 14.2% | 51 |
| rz.GlowBlowMelee 1.4 | 2.8 | 13.8% | 33 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.3% | 30 |
| oog.melee.Corsair 1.0 | 6.2 | 9.3% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 4.9% | 1 |
| evd.X1 0.01 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 71.1 | 11 / 35 | 4074 |
| 2 | 5 | 59.4 | 65.4 | 7 / 35 | 3699 |
| 3 | 3 | 60.3 | 67.3 | 5 / 35 | 3929 |
| 4 | 1 | 64.6 | 76.5 | 13 / 35 | 4612 |
| 5 | 4 | 59.8 | 63.2 | 6 / 35 | 4050 |
| 6 | 1 | 61.4 | 67.6 | 9 / 35 | 4132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 19 | 68% |
| davidalves.Phoenix 0.54 | 18 | 67% |
| florent.XSeries.X2 0.12 | 17 | 53% |
| stelo.SoJNanoMelee 1.1 | 10 | 90% |
| pedersen.Ugluk 1.1.1 | 6 | 67% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 42 | 26% | 57 |
| florent.XSeries.X2 0.12 | 41 | 26% | 53 |
| davidalves.Phoenix 0.54 | 33 | 21% | 46 |
| pedersen.Ugluk 1.1.1 | 24 | 15% | 26 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 9 |
| oog.melee.Corsair 1.0 | 5 | 3% | 10 |
| lunchie.Lunchbox 0.93 | 5 | 3% | 6 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.5 | 113 / 210 | 2.85 | 17.5% | 27695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.5% | 113 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.1% | 27 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.3% | 18 |
| jdw.Hurricane 1.4 | 4.0 | 11.4% | 24 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.2% | 6 |
| ds.Oo 2.2 | 5.7 | 8.9% | 12 |
| awesomeness.Elite 1.0 | 7.5 | 7.3% | 3 |
| gjr.Cephalosporin 0.1 | 8.2 | 7.3% | 5 |
| adt.Ar2 1.1 | 8.3 | 6.8% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.9 | 19 / 35 | 4432 |
| 2 | 1 | 66.9 | 81.3 | 20 / 35 | 4531 |
| 3 | 1 | 65.0 | 76.8 | 16 / 35 | 4439 |
| 4 | 1 | 66.1 | 78.4 | 17 / 35 | 4656 |
| 5 | 1 | 67.3 | 82.2 | 19 / 35 | 4912 |
| 6 | 1 | 67.9 | 82.2 | 22 / 35 | 4725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 46 | 85% |
| voidious.micro.BlitzBat 1.05 | 38 | 97% |
| jdw.Hurricane 1.4 | 22 | 91% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| ds.Oo 2.2 | 7 | 43% |
| gre.svman4.Morfeas 1.4.1 | 4 | 50% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 34 | 35% | 65 |
| voidious.micro.BlitzBat 1.05 | 17 | 18% | 51 |
| jdw.Hurricane 1.4 | 16 | 16% | 39 |
| ds.Oo 2.2 | 10 | 10% | 17 |
| gre.svman4.Morfeas 1.4.1 | 7 | 7% | 13 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 10 |
| awesomeness.Elite 1.0 | 4 | 4% | 7 |
| adt.Ar2 1.1 | 3 | 3% | 6 |
| amk.ChumbaMini 0.2 | 2 | 2% | 2 |

## Melee bench: F26

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.6 | 94 / 210 | 2.65 | 17.6% | 34126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.6% | 94 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 48 |
| shu.nitro.LENIN .T34 | 3.3 | 13.1% | 36 |
| lrem.Spectre 0.4.4 | 3.7 | 12.5% | 20 |
| js.PinBall 1.6 | 5.3 | 10.2% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.2% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.1% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 5.0% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.9 | 14 / 35 | 5501 |
| 2 | 1 | 66.3 | 78.4 | 12 / 35 | 5702 |
| 3 | 1 | 67.1 | 79.0 | 17 / 35 | 5644 |
| 4 | 1 | 68.3 | 83.2 | 16 / 35 | 5885 |
| 5 | 1 | 67.5 | 81.9 | 17 / 35 | 5870 |
| 6 | 1 | 68.1 | 84.4 | 18 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 35 | 63% |
| ak.Fermat 2.0 | 33 | 61% |
| lrem.Spectre 0.4.4 | 29 | 86% |
| js.PinBall 1.6 | 10 | 90% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 40 | 34% | 58 |
| shu.nitro.LENIN .T34 | 37 | 32% | 61 |
| lrem.Spectre 0.4.4 | 23 | 20% | 45 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 4% | 12 |
| js.PinBall 1.6 | 4 | 3% | 16 |
| gh.mini.GrubbmOne 1.0 | 4 | 3% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 9 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.2 | 123 / 210 | 2.24 | 18.5% | 29804 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 18.5% | 123 |
| mk.Alpha 0.2.1 | 2.0 | 14.4% | 47 |
| EH.Eagle 1.0.6 | 3.0 | 11.6% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.9% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 9.2% | 2 |
| wee.Gem 1.8.4 | 6.3 | 8.9% | 8 |
| joe.ADinosaur 1.0 | 6.8 | 8.1% | 1 |
| throxbot.ThroxBot 0.1 | 7.2 | 7.5% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.5% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 18 / 35 | 5227 |
| 2 | 1 | 67.2 | 83.8 | 18 / 35 | 4859 |
| 3 | 1 | 68.5 | 88.3 | 24 / 35 | 4845 |
| 4 | 1 | 69.3 | 89.5 | 22 / 35 | 5263 |
| 5 | 1 | 67.0 | 83.8 | 20 / 35 | 4735 |
| 6 | 1 | 68.3 | 87.6 | 21 / 35 | 4875 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 74 | 81% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 65% |
| wee.Gem 1.8.4 | 20 | 80% |
| EH.Eagle 1.0.6 | 19 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 67% |

Hadur died in 87 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 31% | 84 |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 24% | 34 |
| EH.Eagle 1.0.6 | 9 | 10% | 32 |
| wee.Gem 1.8.4 | 9 | 10% | 30 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 7% | 9 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 8 |
| joe.ADinosaur 1.0 | 5 | 6% | 7 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 6 |

## Melee bench: F28

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.7 | 127 / 210 | 2.29 | 18.5% | 29269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 18.5% | 127 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 36 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.9% | 18 |
| uji.Antique 1.0 | 4.0 | 11.1% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.2 | 10.5% | 6 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.2% | 2 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.7% | 4 |
| stelo.PianistNano 1.2 | 8.7 | 6.4% | 0 |
| matt.advanced.Katana 1.0 | 8.8 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.3 | 25 / 35 | 4797 |
| 2 | 1 | 67.8 | 84.4 | 20 / 35 | 4997 |
| 3 | 1 | 67.0 | 81.6 | 19 / 35 | 4848 |
| 4 | 1 | 67.2 | 85.7 | 22 / 35 | 4345 |
| 5 | 1 | 70.0 | 91.1 | 23 / 35 | 5570 |
| 6 | 1 | 66.9 | 82.9 | 18 / 35 | 4712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 77 | 84% |
| uji.Antique 1.0 | 37 | 97% |
| qohnil.blot.BlotBot 3.61 | 22 | 59% |
| pfvicm.Sobieski 7.2.3b | 5 | 80% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 67% |
| stelo.PianistNano 1.2 | 2 | 100% |
| amk.ChumbaWumba 0.3 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 39% | 99 |
| qohnil.blot.BlotBot 3.61 | 17 | 20% | 32 |
| pfvicm.Sobieski 7.2.3b | 15 | 18% | 23 |
| uji.Antique 1.0 | 9 | 11% | 30 |
| amk.ChumbaWumba 0.3 | 4 | 5% | 10 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 5 |
| matt.advanced.Katana 1.0 | 2 | 2% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |
| stelo.PianistNano 1.2 | 1 | 1% | 1 |

## Melee bench: F29

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 78.9 | 96 / 210 | 2.90 | 17.8% | 31541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.2 | 17.8% | 96 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.4% | 54 |
| deewiant.Anomaly 0.2 | 2.8 | 14.8% | 38 |
| myl.micro.Troodon 1.10 | 3.8 | 11.8% | 7 |
| jok.PheonixM 0.1.2 | 5.0 | 10.1% | 6 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.2% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 7.2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.8% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 2 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.1 | 17 / 35 | 5508 |
| 2 | 1 | 67.1 | 77.5 | 17 / 35 | 5261 |
| 3 | 1 | 66.8 | 75.2 | 17 / 35 | 5090 |
| 4 | 1 | 66.4 | 76.2 | 15 / 35 | 5205 |
| 5 | 2 | 65.3 | 73.7 | 11 / 35 | 4894 |
| 6 | 1 | 69.9 | 86.7 | 19 / 35 | 5583 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 83% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 62% |
| myl.micro.Troodon 1.10 | 15 | 93% |
| DBall.Anarchy 0.1 | 8 | 100% |
| jok.PheonixM 0.1.2 | 7 | 86% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 47 | 41% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 31 | 27% | 61 |
| jok.PheonixM 0.1.2 | 15 | 13% | 22 |
| myl.micro.Troodon 1.10 | 13 | 11% | 26 |
| ph.melee.ArcherME 0.3 | 5 | 4% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 67.2 | 35 / 210 | 3.95 | 13.6% | 24017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 14.3% | 51 |
| oog.melee.Capulet 1.2 | 2.3 | 13.8% | 43 |
| darkcanuck.B26354 1.06 | 3.3 | 13.4% | 47 |
| hadur117.mini.DeiseW50 0.3 | 3.5 | 13.6% | 35 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.9% | 24 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.2% | 4 |
| ntc.Opposite 1.5 | 7.7 | 7.6% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.2% | 3 |
| tripphippy.Alice 1.1 | 8.2 | 6.6% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 75.6 | 9 / 35 | 4733 |
| 2 | 1 | 63.2 | 74.9 | 7 / 35 | 4277 |
| 3 | 5 | 59.3 | 63.2 | 4 / 35 | 4019 |
| 4 | 4 | 59.4 | 64.4 | 6 / 35 | 3507 |
| 5 | 5 | 58.1 | 62.5 | 5 / 35 | 3532 |
| 6 | 5 | 59.1 | 62.9 | 4 / 35 | 3949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 17 | 47% |
| darkcanuck.B26354 1.06 | 16 | 38% |
| oog.melee.Capulet 1.2 | 14 | 43% |
| stelo.PastFuture 2.3.2 | 13 | 69% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 721. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 25% | 53 |
| catcat20.Matcha 0.006 | 39 | 22% | 45 |
| stelo.PastFuture 2.3.2 | 31 | 18% | 38 |
| darkcanuck.B26354 1.06 | 31 | 18% | 38 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 9 |
| ntc.Opposite 1.5 | 7 | 4% | 8 |
| tripphippy.Alice 1.1 | 6 | 3% | 8 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 66.4 | 38 / 210 | 4.02 | 13.4% | 22126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 109 |
| hadur117.mini.DeiseW50 0.3 | 2.5 | 13.4% | 38 |
| gh.mini.Griezel 0.2 | 2.7 | 13.2% | 42 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.9% | 7 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.0% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 8 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 1 |
| fm.mammillarias 1.3 | 7.7 | 6.1% | 2 |
| tlp.ThreeLeggedPig 1 | 9.2 | 5.3% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 67.9 | 8 / 35 | 3742 |
| 2 | 2 | 61.8 | 70.2 | 6 / 35 | 3797 |
| 3 | 4 | 57.9 | 62.2 | 4 / 35 | 3448 |
| 4 | 2 | 59.0 | 63.8 | 7 / 35 | 3534 |
| 5 | 2 | 62.9 | 71.7 | 9 / 35 | 4295 |
| 6 | 3 | 57.9 | 62.5 | 4 / 35 | 3310 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 51% |
| gh.mini.Griezel 0.2 | 14 | 64% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| d414.nano.Quantum 1.0.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 33% | 73 |
| gh.mini.Griezel 0.2 | 41 | 24% | 51 |
| spinnercat.micro.Tyger 0.1 | 26 | 15% | 32 |
| d414.nano.Quantum 1.0.0 | 21 | 12% | 25 |
| gh.nano.Grofvuil 0.2 | 13 | 8% | 14 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |

## Melee bench: F32

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.9 | 126 / 210 | 2.27 | 18.6% | 31063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 18.6% | 126 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 53 |
| apc.botM 3.0 | 3.3 | 11.6% | 13 |
| lxx.ConceptA 0.8 | 4.2 | 10.8% | 3 |
| vjik.UnViolation 1.1 | 5.0 | 9.9% | 6 |
| bayen.UbaMicro 1.4 | 5.7 | 9.4% | 4 |
| panzer.Panzer 0.2 | 7.0 | 7.7% | 2 |
| yk.JahMicro 1.0 | 8.5 | 6.3% | 2 |
| conscience.Electron 1.3g | 8.7 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 16 / 35 | 5037 |
| 2 | 1 | 68.9 | 88.6 | 22 / 35 | 5303 |
| 3 | 1 | 68.1 | 84.8 | 21 / 35 | 5393 |
| 4 | 1 | 69.1 | 90.2 | 23 / 35 | 5247 |
| 5 | 1 | 66.0 | 79.4 | 19 / 35 | 4846 |
| 6 | 1 | 69.3 | 90.8 | 25 / 35 | 5237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 62 | 63% |
| apc.botM 3.0 | 27 | 85% |
| lxx.ConceptA 0.8 | 22 | 95% |
| vjik.UnViolation 1.1 | 20 | 90% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| yk.JahMicro 1.0 | 7 | 100% |
| donjezza.Jezza 1.0 | 7 | 86% |
| panzer.Panzer 0.2 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 43 | 51% | 86 |
| apc.botM 3.0 | 10 | 12% | 44 |
| vjik.UnViolation 1.1 | 8 | 10% | 30 |
| lxx.ConceptA 0.8 | 8 | 10% | 16 |
| panzer.Panzer 0.2 | 5 | 6% | 6 |
| bayen.UbaMicro 1.4 | 4 | 5% | 13 |
| conscience.Electron 1.3g | 3 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 2 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |

## Melee bench: F33

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 81.1 | 106 / 210 | 2.70 | 18.0% | 31562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.2 | 18.0% | 106 |
| maribo.Quester 0.3 | 1.8 | 16.5% | 46 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.3% | 22 |
| labg.Cataclysm 2.05 | 4.5 | 10.7% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.7 | 10.8% | 10 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.1% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 5.7% | 0 |
| sanja.First 0.1 | 9.2 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.4 | 22 / 35 | 5374 |
| 2 | 1 | 67.1 | 79.0 | 16 / 35 | 5325 |
| 3 | 1 | 67.9 | 83.2 | 17 / 35 | 5078 |
| 4 | 2 | 65.9 | 74.9 | 16 / 35 | 5054 |
| 5 | 1 | 66.8 | 79.4 | 14 / 35 | 5295 |
| 6 | 1 | 69.1 | 85.7 | 21 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 28 | 86% |
| gre.svman4.Leonidas 1.3.2 | 20 | 90% |
| labg.Cataclysm 2.05 | 15 | 67% |
| baal.nano.N 1.42 | 3 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 32% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 26% | 56 |
| gre.svman4.Leonidas 1.3.2 | 11 | 10% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 10% | 12 |
| labg.Cataclysm 2.05 | 9 | 9% | 19 |
| baal.nano.N 1.42 | 9 | 9% | 14 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 1 | 1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 79.9 | 61 / 210 | 2.80 | 16.9% | 31543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.5 | 16.9% | 61 |
| stelo.Spread 0.9 | 2.0 | 16.7% | 73 |
| kid.Gladiator .7.2 | 2.5 | 16.5% | 52 |
| tcf.Reach 3 | 4.5 | 11.0% | 9 |
| cli.Dancer 1.1 | 5.2 | 10.2% | 1 |
| jcs.Seth 1.8 | 5.3 | 10.2% | 11 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 1 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.9 | 9 / 35 | 5365 |
| 2 | 2 | 67.4 | 81.9 | 10 / 35 | 5254 |
| 3 | 3 | 64.0 | 72.1 | 7 / 35 | 4930 |
| 4 | 1 | 66.9 | 81.0 | 11 / 35 | 5193 |
| 5 | 1 | 66.8 | 78.7 | 10 / 35 | 5445 |
| 6 | 1 | 68.6 | 84.1 | 14 / 35 | 5356 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 59 | 56% |
| kid.Gladiator .7.2 | 42 | 43% |
| jcs.Seth 1.8 | 8 | 38% |
| tcf.Reach 3 | 5 | 80% |
| cli.Dancer 1.1 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 150 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 61 | 41% | 94 |
| kid.Gladiator .7.2 | 58 | 39% | 69 |
| jcs.Seth 1.8 | 10 | 7% | 17 |
| tcf.Reach 3 | 10 | 7% | 16 |
| ratosh.Wesco 1.4 | 5 | 3% | 5 |
| cli.Dancer 1.1 | 4 | 3% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.7 | 25 / 210 | 3.37 | 14.3% | 23187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 162 |
| hadur117.mini.DeiseW50 0.3 | 2.2 | 14.3% | 25 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.0% | 11 |
| rz.HawkOnFire 0.1 | 4.3 | 11.6% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 8 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.1% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 69.8 | 4 / 35 | 3758 |
| 2 | 2 | 61.4 | 72.7 | 1 / 35 | 3818 |
| 3 | 2 | 63.2 | 76.8 | 4 / 35 | 3888 |
| 4 | 2 | 63.6 | 77.5 | 6 / 35 | 3956 |
| 5 | 2 | 61.8 | 71.4 | 3 / 35 | 4026 |
| 6 | 2 | 62.7 | 73.7 | 7 / 35 | 3741 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 62 | 8% |
| gh.mini.Gruwel 0.9 | 10 | 70% |
| rz.HawkOnFire 0.1 | 6 | 83% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 83% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 105 | 56% | 110 |
| gh.mini.Gruwel 0.9 | 32 | 17% | 40 |
| rz.HawkOnFire 0.1 | 20 | 11% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 10% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 2 | 1% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 88.8 | 150 / 210 | 2.01 | 20.1% | 34174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 20.1% | 150 |
| alpha.RainingFire 1.0 | 2.5 | 12.9% | 19 |
| bzdp.Pansy 2.1 | 3.0 | 12.0% | 15 |
| bvh.micro.Freya 0.3 | 4.0 | 11.1% | 13 |
| mz.Cork 0.1 | 5.0 | 10.2% | 6 |
| m3thos.Eva02 0.7.1 | 6.2 | 8.8% | 3 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.3% | 4 |
| dl.BetterWalls 1.0 | 8.2 | 6.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 86.0 | 27 / 35 | 5469 |
| 2 | 1 | 70.9 | 93.3 | 27 / 35 | 5414 |
| 3 | 1 | 69.1 | 85.7 | 20 / 35 | 5603 |
| 4 | 1 | 71.4 | 91.7 | 25 / 35 | 6297 |
| 5 | 1 | 71.4 | 91.4 | 27 / 35 | 5925 |
| 6 | 1 | 68.8 | 84.4 | 24 / 35 | 5466 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 44 | 93% |
| bvh.micro.Freya 0.3 | 42 | 93% |
| alpha.RainingFire 1.0 | 29 | 83% |
| mz.Cork 0.1 | 18 | 94% |
| bvh.mini.Fenrir 0.39 | 15 | 93% |
| m3thos.Eva02 0.7.1 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 651. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 30% | 46 |
| bzdp.Pansy 2.1 | 13 | 22% | 59 |
| bvh.micro.Freya 0.3 | 8 | 13% | 34 |
| bvh.mini.Fenrir 0.39 | 8 | 13% | 11 |
| mz.Cork 0.1 | 6 | 10% | 31 |
| m3thos.Eva02 0.7.1 | 3 | 5% | 16 |
| squidM.TentalceMeleeNano 1.1 | 3 | 5% | 4 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
| dl.BetterWalls 1.0 | 0 | 0% | 4 |

## Melee bench: F37

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.0 | 176 / 210 | 1.63 | 20.7% | 37407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 20.7% | 176 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.0 | 11.5% | 10 |
| germ.TheMind .2 | 3.0 | 10.5% | 6 |
| EBBU.Sim2 1.02 | 4.5 | 9.4% | 2 |
| agrach.Dalek 1.0 | 5.2 | 9.0% | 7 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.3% | 5 |
| lmk.ACPFinal 0.1 | 7.5 | 7.9% | 1 |
| mb.Beast 0.1 | 8.3 | 7.7% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.6% | 0 |
| skm.Ryubot 1.0 | 8.7 | 7.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 92.7 | 30 / 35 | 6293 |
| 2 | 1 | 72.2 | 96.5 | 32 / 35 | 6974 |
| 3 | 1 | 68.0 | 87.0 | 25 / 35 | 5626 |
| 4 | 1 | 69.8 | 90.2 | 28 / 35 | 6220 |
| 5 | 1 | 70.2 | 95.2 | 30 / 35 | 5707 |
| 6 | 1 | 71.4 | 96.2 | 31 / 35 | 6587 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 36 | 97% |
| EBBU.Sim2 1.02 | 29 | 93% |
| agrach.Dalek 1.0 | 28 | 100% |
| stelo.UntouchableNano 1.3 | 27 | 93% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 100% |
| mb.Beast 0.1 | 14 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| skm.Ryubot 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 7 | 21% | 35 |
| lmk.ACPFinal 0.1 | 6 | 18% | 16 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 15% | 47 |
| EBBU.Sim2 1.02 | 5 | 15% | 30 |
| stelo.UntouchableNano 1.3 | 4 | 12% | 25 |
| agrach.Dalek 1.0 | 3 | 9% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 9% | 7 |
| mb.Beast 0.1 | 1 | 3% | 13 |
| skm.Ryubot 1.0 | 0 | 0% | 4 |

## Melee bench: F38

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.8 | 76 / 210 | 3.18 | 15.6% | 25245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.2% | 73 |
| hadur117.mini.DeiseW50 0.3 | 1.8 | 15.6% | 76 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 18 |
| cs.Wren 1.0 | 4.2 | 11.7% | 11 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.7% | 17 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.7 | 10.4% | 8 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.1% | 3 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.4 | 16 / 35 | 4355 |
| 2 | 2 | 65.0 | 77.1 | 15 / 35 | 4351 |
| 3 | 1 | 64.9 | 78.4 | 13 / 35 | 4399 |
| 4 | 2 | 64.4 | 77.5 | 12 / 35 | 4137 |
| 5 | 3 | 60.5 | 66.0 | 8 / 35 | 3820 |
| 6 | 2 | 64.0 | 77.1 | 12 / 35 | 4183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 33 | 64% |
| cs.Wren 1.0 | 16 | 81% |
| bvh.mini.Freya 0.55 | 16 | 88% |
| bts.mega.Gnarly 1.4 | 16 | 81% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 100% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 33% | 72 |
| bts.mega.Gnarly 1.4 | 23 | 17% | 36 |
| bvh.mini.Freya 0.55 | 22 | 16% | 28 |
| cs.Wren 1.0 | 21 | 16% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 7% | 22 |
| kdf.KoulDestroyer 1.0 | 9 | 7% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.1 | 88 / 210 | 2.88 | 17.0% | 30728 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.0% | 88 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 30 |
| az.Ololobot 0.2.4 | 3.3 | 12.7% | 57 |
| catcat20.Lambda 0.024 | 3.8 | 11.7% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 5.2 | 9.4% | 7 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.3% | 3 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 78.7 | 17 / 35 | 5093 |
| 2 | 1 | 65.9 | 80.0 | 15 / 35 | 5055 |
| 3 | 1 | 66.5 | 83.5 | 14 / 35 | 5159 |
| 4 | 1 | 66.5 | 79.7 | 15 / 35 | 5478 |
| 5 | 1 | 66.0 | 78.7 | 14 / 35 | 5049 |
| 6 | 1 | 63.9 | 74.0 | 13 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 34 | 50% |
| bvh.fry.Freya 0.82 | 27 | 89% |
| catcat20.Lambda 0.024 | 26 | 81% |
| stelo.SoRobotNanoMelee 1.2 | 11 | 100% |
| winamp32.micro.MicroMacro 1.0 | 7 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 43 | 35% | 67 |
| az.Ololobot 0.2.4 | 31 | 25% | 50 |
| catcat20.Lambda 0.024 | 18 | 15% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 12% | 20 |
| gimp.GimpBot 0.1 | 6 | 5% | 15 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 12 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 2 |

## Melee bench: F40

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.1 | 95 / 210 | 2.70 | 17.7% | 30791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 17.7% | 95 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 49 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.2% | 22 |
| mz.AntiGrav 1.0 | 4.0 | 11.1% | 10 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.4% | 13 |
| stelo.Randomness 1.0 | 5.8 | 9.3% | 13 |
| alpha.BlackIce 1.0 | 6.8 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.6% | 5 |
| sample.Corners 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.7 | 20 / 35 | 5705 |
| 2 | 1 | 65.9 | 78.7 | 14 / 35 | 4814 |
| 3 | 1 | 69.3 | 85.4 | 22 / 35 | 5697 |
| 4 | 1 | 66.8 | 80.0 | 15 / 35 | 5144 |
| 5 | 1 | 65.4 | 77.8 | 11 / 35 | 4934 |
| 6 | 1 | 65.3 | 78.1 | 13 / 35 | 4497 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 49 | 63% |
| kano.gamma.KanoGamma 1.8 | 27 | 70% |
| mz.AntiGrav 1.0 | 20 | 90% |
| Polkwane.SmashMelee 1.0 | 14 | 79% |
| stelo.Randomness 1.0 | 7 | 57% |
| alpha.BlackIce 1.0 | 5 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 40 | 34% | 63 |
| kano.gamma.KanoGamma 1.8 | 22 | 19% | 53 |
| stelo.Randomness 1.0 | 18 | 16% | 26 |
| mz.AntiGrav 1.0 | 17 | 15% | 32 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 19 |
| amk.superstrike.SuperStrike 0.3 | 5 | 4% | 9 |
| alpha.BlackIce 1.0 | 3 | 3% | 5 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.6 | 81 / 210 | 2.84 | 16.8% | 28461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.3 | 16.8% | 81 |
| eem.EvBotNG v12.8 | 1.8 | 16.2% | 84 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.5% | 20 |
| ary.Swarm 1.1 | 3.5 | 13.3% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.0% | 11 |
| shrub.Silver v048 | 6.0 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.4% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 83.8 | 17 / 35 | 4822 |
| 2 | 1 | 67.5 | 82.5 | 18 / 35 | 4749 |
| 3 | 1 | 67.4 | 82.5 | 16 / 35 | 4899 |
| 4 | 1 | 64.9 | 76.2 | 11 / 35 | 4615 |
| 5 | 2 | 65.1 | 75.6 | 9 / 35 | 4826 |
| 6 | 2 | 64.7 | 76.8 | 10 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 41% |
| ary.Swarm 1.1 | 23 | 87% |
| simonton.nano.MeleeSeed 1.8 | 19 | 89% |
| lessonz.robocode.Oz 0.5.0 | 13 | 92% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| zyx.nano.Ant 1.1 | 2 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 43% | 81 |
| ary.Swarm 1.1 | 23 | 18% | 50 |
| lessonz.robocode.Oz 0.5.0 | 18 | 14% | 25 |
| simonton.nano.MeleeSeed 1.8 | 17 | 13% | 31 |
| shrub.Silver v048 | 7 | 5% | 10 |
| zyx.nano.Ant 1.1 | 6 | 5% | 6 |
| stelo.Mirror 1.1 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 1 | 1% | 3 |

## Melee bench: F42

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 81.1 | 90 / 210 | 2.70 | 17.4% | 32585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.3 | 17.4% | 90 |
| wompi.Wallaby 5.1 | 2.2 | 15.2% | 57 |
| ara.Shera 0.88 | 3.0 | 13.9% | 32 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.2% | 19 |
| amz.NanoClone 1.41 | 5.0 | 9.9% | 4 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.2% | 5 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.8% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 85.4 | 22 / 35 | 5959 |
| 2 | 2 | 63.5 | 73.7 | 10 / 35 | 4906 |
| 3 | 1 | 68.4 | 85.1 | 18 / 35 | 5526 |
| 4 | 1 | 67.7 | 82.9 | 17 / 35 | 5694 |
| 5 | 2 | 66.1 | 80.0 | 10 / 35 | 5382 |
| 6 | 1 | 65.9 | 79.4 | 13 / 35 | 5118 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 47 | 68% |
| wompi.Wallaby 5.1 | 36 | 83% |
| maribo.mini.MiniQuester 0.1 | 23 | 91% |
| dsw.StaticD 1.0 | 6 | 67% |
| amz.NanoClone 1.41 | 3 | 67% |
| stelo.MirrorMicro 1.0 | 2 | 50% |

Hadur died in 120 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 43 | 36% | 72 |
| ara.Shera 0.88 | 37 | 31% | 67 |
| maribo.mini.MiniQuester 0.1 | 21 | 18% | 41 |
| amz.NanoClone 1.41 | 9 | 8% | 11 |
| dsw.StaticD 1.0 | 5 | 4% | 8 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 7 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 68.2 | 18 / 210 | 3.86 | 13.4% | 22526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 151 |
| brainfade.melee.Dusk 0.44 | 2.7 | 13.2% | 28 |
| hadur117.mini.DeiseW50 0.3 | 2.7 | 13.4% | 18 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.2% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.6% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.5% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.7 | 66.3 | 4 / 35 | 3927 |
| 2 | 2 | 62.2 | 67.9 | 3 / 35 | 4028 |
| 3 | 4 | 60.2 | 65.1 | 3 / 35 | 3477 |
| 4 | 3 | 60.8 | 66.0 | 1 / 35 | 3461 |
| 5 | 2 | 63.5 | 71.1 | 4 / 35 | 4058 |
| 6 | 2 | 62.5 | 72.7 | 3 / 35 | 3575 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 48 | 13% |
| dummy.micro.Sparrow 2.5 | 7 | 57% |
| brainfade.melee.Dusk 0.44 | 7 | 86% |
| cvt.Firsty 1.0 | 1 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 85 | 44% | 91 |
| brainfade.melee.Dusk 0.44 | 38 | 20% | 45 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 25 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 11% | 23 |
| Krabb.akim2.Akim2 1.1b | 13 | 7% | 13 |
| jab.DiamondStealer 5 | 7 | 4% | 7 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.7 | 109 / 210 | 2.29 | 19.0% | 34511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 19.0% | 109 |
| stelo.Liblix 0.3.1 | 2.3 | 15.4% | 49 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.2% | 36 |
| wompi.Quokka 1.6 | 4.5 | 9.8% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.8% | 0 |
| jwirde.Gort 2.0 | 5.5 | 9.2% | 9 |
| disan.Chair 2.2.0 | 7.2 | 7.5% | 2 |
| stf.PanzerGeneral 0.1 | 8.2 | 6.4% | 1 |
| sample.Crazy 1.0 | 8.8 | 4.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.6 | 18 / 35 | 6213 |
| 2 | 1 | 70.4 | 90.5 | 23 / 35 | 5633 |
| 3 | 1 | 69.1 | 87.0 | 18 / 35 | 5529 |
| 4 | 1 | 70.4 | 89.2 | 19 / 35 | 6118 |
| 5 | 1 | 67.8 | 80.6 | 17 / 35 | 5779 |
| 6 | 1 | 66.6 | 79.4 | 14 / 35 | 5239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 76 | 74% |
| tzu.TheArtOfWar 1.2 | 37 | 65% |
| wompi.Quokka 1.6 | 10 | 90% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| jwirde.Gort 2.0 | 5 | 80% |
| disan.Chair 2.2.0 | 4 | 75% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tzu.TheArtOfWar 1.2 | 37 | 36% | 61 |
| stelo.Liblix 0.3.1 | 34 | 33% | 97 |
| jwirde.Gort 2.0 | 9 | 9% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 8% | 16 |
| wompi.Quokka 1.6 | 8 | 8% | 11 |
| disan.Chair 2.2.0 | 4 | 4% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.6 | 78 / 210 | 2.48 | 19.0% | 36715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW50 0.3 | 1.0 | 19.0% | 78 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.2% | 112 |
| jje.BagPuss 1.2 | 3.2 | 12.2% | 4 |
| myl.nano.Graviton 1.10 | 4.3 | 10.8% | 8 |
| sul.Lunar 1.1 | 4.7 | 10.4% | 6 |
| hvilela.HVilela 0.9 | 6.5 | 8.1% | 1 |
| fm.claire 1.7 | 7.0 | 7.8% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.7% | 2 |
| wit.Deep7 2.0 | 8.8 | 6.2% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 85.4 | 13 / 35 | 6493 |
| 2 | 1 | 67.9 | 80.6 | 13 / 35 | 6233 |
| 3 | 1 | 69.6 | 86.0 | 17 / 35 | 6158 |
| 4 | 1 | 67.7 | 82.9 | 11 / 35 | 5740 |
| 5 | 1 | 69.0 | 86.3 | 13 / 35 | 6078 |
| 6 | 1 | 67.6 | 80.3 | 11 / 35 | 6013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 98 | 21% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| sul.Lunar 1.1 | 16 | 100% |
| jje.BagPuss 1.2 | 13 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 88% |
| hvilela.HVilela 0.9 | 3 | 100% |
| wit.Deep7 2.0 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 2043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 77 | 57% | 0 |
| jje.BagPuss 1.2 | 16 | 12% | 62 |
| myl.nano.Graviton 1.10 | 10 | 7% | 36 |
| sul.Lunar 1.1 | 8 | 6% | 49 |
| fm.claire 1.7 | 8 | 6% | 14 |
| hvilela.HVilela 0.9 | 6 | 4% | 11 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 18 |
| wit.Deep7 2.0 | 3 | 2% | 16 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseW50 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 76.2 | 46 / 210 | 3.14 | 15.1% | 25768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.2% | 67 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.4% | 84 |
| hadur117.mini.DeiseW50 0.3 | 2.7 | 15.1% | 46 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 4 |
| cx.Princess 1.0 | 4.8 | 10.4% | 8 |
| sadoner.killer 0.2 | 5.7 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 78.1 | 9 / 35 | 4522 |
| 2 | 3 | 63.2 | 76.5 | 8 / 35 | 3981 |
| 3 | 3 | 64.2 | 77.8 | 8 / 35 | 4345 |
| 4 | 2 | 64.7 | 79.7 | 7 / 35 | 4442 |
| 5 | 3 | 62.9 | 73.3 | 8 / 35 | 3917 |
| 6 | 3 | 62.6 | 72.1 | 6 / 35 | 4561 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 39 | 51% |
| rsalesc.melee.Medina 0.4.5 | 36 | 36% |
| cx.Princess 1.0 | 10 | 80% |
| mz.MicroSheep 1.0 | 5 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 66 | 40% | 87 |
| rsalesc.melee.Medina 0.4.5 | 64 | 39% | 76 |
| mz.MicroSheep 1.0 | 10 | 6% | 15 |
| sadoner.killer 0.2 | 8 | 5% | 8 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 9 |
| cx.Princess 1.0 | 6 | 4% | 12 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
1 death(s) with no robot to name.

