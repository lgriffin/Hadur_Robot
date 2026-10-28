# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.8 | 39 / 210 | 2.81 | 16.2% | 31236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 144 |
| hadur117.mini.DeiseWA 0.2 | 2.0 | 16.2% | 39 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 10.9% | 5 |
| sgp.JollyNinja 3.53 | 3.8 | 11.3% | 14 |
| lorneswork.Predator 1.0 | 5.2 | 10.1% | 4 |
| mz.MicroGodMelee 1 | 5.2 | 10.5% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 85.7 | 7 / 35 | 5286 |
| 2 | 2 | 66.0 | 84.1 | 8 / 35 | 4916 |
| 3 | 2 | 67.8 | 85.7 | 9 / 35 | 5708 |
| 4 | 2 | 63.7 | 75.6 | 5 / 35 | 4791 |
| 5 | 2 | 65.1 | 77.5 | 4 / 35 | 5388 |
| 6 | 2 | 63.5 | 70.5 | 6 / 35 | 5147 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 99 | 12% |
| sgp.JollyNinja 3.53 | 15 | 73% |
| mz.MicroGodMelee 1 | 10 | 90% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| lorneswork.Predator 1.0 | 3 | 67% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 108 | 63% | 123 |
| sgp.JollyNinja 3.53 | 16 | 9% | 20 |
| mz.MicroGodMelee 1 | 15 | 9% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 14 | 8% | 19 |
| lorneswork.Predator 1.0 | 11 | 6% | 14 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.9 | 78 / 210 | 3.17 | 17.1% | 33243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.1% | 78 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.4% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.9% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.8% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.8% | 14 |
| sch.Simone 0.3d | 6.8 | 8.0% | 10 |
| Noran.BitchingElk 0.054 | 7.0 | 7.4% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.3 | 7.8% | 5 |
| stelo.PatternRobot 1.0 | 8.5 | 6.1% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.5 | 16 / 35 | 5905 |
| 2 | 1 | 65.5 | 75.9 | 12 / 35 | 5339 |
| 3 | 1 | 63.6 | 69.8 | 12 / 35 | 5195 |
| 4 | 1 | 65.1 | 75.9 | 15 / 35 | 5198 |
| 5 | 1 | 67.0 | 77.1 | 15 / 35 | 5799 |
| 6 | 1 | 65.8 | 74.3 | 8 / 35 | 5807 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 37 | 73% |
| pulsar.PulsarMax 0.8.9 | 37 | 57% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 6 | 83% |
| Noran.BitchingElk 0.054 | 5 | 60% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| sch.Simone 0.3d | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 132 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 43 | 33% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 27% | 70 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 11% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 15 | 11% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 9 |
| stelo.PatternRobot 1.0 | 5 | 4% | 8 |
| sch.Simone 0.3d | 5 | 4% | 8 |
| Noran.BitchingElk 0.054 | 5 | 4% | 6 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |

## Melee bench: F03

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.2 | 129 / 210 | 1.97 | 19.9% | 40120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.9% | 129 |
| radnor.DoctorBob 1.42 | 2.3 | 13.8% | 21 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.0% | 21 |
| vuen.Cake 2.51 | 3.8 | 12.1% | 34 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 2 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.9% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.6 | 18 / 35 | 7047 |
| 2 | 1 | 70.9 | 90.8 | 22 / 35 | 7148 |
| 3 | 1 | 68.2 | 83.2 | 22 / 35 | 6252 |
| 4 | 1 | 70.8 | 92.4 | 24 / 35 | 6944 |
| 5 | 1 | 70.1 | 91.4 | 24 / 35 | 6420 |
| 6 | 1 | 69.0 | 88.9 | 19 / 35 | 6309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 59 | 81% |
| vuen.Cake 2.51 | 48 | 52% |
| radnor.DoctorBob 1.42 | 46 | 98% |
| oa.weak.FlyMk1 0.1 | 8 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| urdos.URDOS 1.3 | 1 | 0% |

Hadur died in 83 of 210 rounds, at a mean tick of 738. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 25 | 30% | 51 |
| kawigi.nano.Lib 1.0 | 22 | 27% | 70 |
| radnor.DoctorBob 1.42 | 20 | 24% | 56 |
| urdos.URDOS 1.3 | 10 | 12% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 2 |
| adt.Ar1 2.1 | 1 | 1% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 10 |

## Melee bench: F04

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 77.7 | 20 / 210 | 3.00 | 16.2% | 33696 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 179 |
| hadur117.mini.DeiseWA 0.2 | 2.0 | 16.2% | 20 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.4% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 11.6% | 3 |
| josago.Jorgito 0.16 | 5.0 | 8.6% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 6.7% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.5 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 79.4 | 2 / 35 | 6035 |
| 2 | 2 | 68.3 | 81.9 | 6 / 35 | 6360 |
| 3 | 2 | 64.4 | 74.6 | 4 / 35 | 4998 |
| 4 | 2 | 65.5 | 75.9 | 3 / 35 | 5385 |
| 5 | 2 | 65.6 | 78.1 | 2 / 35 | 5284 |
| 6 | 2 | 66.1 | 76.5 | 3 / 35 | 5634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 107 | 15% |
| apc.LeeroyJenkins2 1.0 | 5 | 60% |
| TNT.TNT 0.99.1 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 126 | 66% | 142 |
| apc.LeeroyJenkins2 1.0 | 24 | 13% | 28 |
| TNT.TNT 0.99.1 | 15 | 8% | 15 |
| josago.Jorgito 0.16 | 15 | 8% | 15 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 63.1 | 16 / 210 | 4.32 | 12.4% | 22040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.6% | 117 |
| justin.DemonicRage 3.4 | 2.0 | 17.3% | 57 |
| wompi.Numbat 2.1 | 3.3 | 12.8% | 16 |
| hadur117.mini.DeiseWA 0.2 | 3.7 | 12.4% | 16 |
| ms.Ares 0.19 | 5.2 | 9.3% | 0 |
| axeBots.HataMoto 3.09 | 5.8 | 8.8% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.5% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 1 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.3 | 62.2 | 3 / 35 | 3649 |
| 2 | 4 | 58.0 | 61.9 | 2 / 35 | 3505 |
| 3 | 4 | 57.9 | 60.0 | 2 / 35 | 3607 |
| 4 | 3 | 60.2 | 66.7 | 2 / 35 | 3980 |
| 5 | 3 | 61.3 | 68.6 | 5 / 35 | 3936 |
| 6 | 4 | 57.3 | 59.4 | 2 / 35 | 3363 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 21 | 48% |
| cb.fire.Firestarter 2.0f | 14 | 14% |
| wompi.Numbat 2.1 | 3 | 67% |
| supersample.SuperBoxBot 1.0 | 2 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 627. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 64 | 33% | 68 |
| justin.DemonicRage 3.4 | 54 | 28% | 64 |
| wompi.Numbat 2.1 | 38 | 20% | 40 |
| ms.Ares 0.19 | 14 | 7% | 14 |
| supersample.SuperBoxBot 1.0 | 11 | 6% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| axeBots.HataMoto 3.09 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 74.4 | 69 / 210 | 3.30 | 15.9% | 28956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.2 | 15.9% | 69 |
| origin.SleepSiphon 1.7b | 2.2 | 14.8% | 64 |
| jekl.StoneGhost 0.7 | 2.8 | 14.0% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.7% | 31 |
| mld.Wisdom 1.0 | 5.0 | 10.6% | 7 |
| gg.Wolverine 2.0 | 5.8 | 8.9% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.8% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.2 | 6.5% | 2 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 77.8 | 11 / 35 | 4860 |
| 2 | 1 | 64.8 | 73.7 | 14 / 35 | 5062 |
| 3 | 1 | 64.3 | 73.7 | 11 / 35 | 4980 |
| 4 | 1 | 66.1 | 77.8 | 14 / 35 | 4882 |
| 5 | 1 | 62.7 | 71.4 | 9 / 35 | 4539 |
| 6 | 2 | 63.6 | 72.4 | 10 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 25 | 56% |
| jekl.StoneGhost 0.7 | 23 | 74% |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 81% |
| gg.Wolverine 2.0 | 12 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| mld.Wisdom 1.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 42 | 29% | 62 |
| jekl.StoneGhost 0.7 | 31 | 22% | 46 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 18% | 44 |
| mld.Wisdom 1.0 | 21 | 15% | 25 |
| gg.Wolverine 2.0 | 12 | 8% | 16 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 4% | 9 |
| spinnercat.Omen 1.0 | 3 | 2% | 3 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 89.3 | 97 / 210 | 1.96 | 19.7% | 38925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.7% | 97 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.7% | 55 |
| rtk.Tachikoma 1.0 | 3.0 | 16.3% | 43 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.1% | 6 |
| franzor.Lizt 1.3.1 | 4.7 | 10.7% | 10 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.3% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 90.5 | 20 / 35 | 6521 |
| 2 | 1 | 71.3 | 89.8 | 18 / 35 | 6408 |
| 3 | 1 | 70.8 | 89.2 | 15 / 35 | 6242 |
| 4 | 1 | 71.5 | 89.5 | 13 / 35 | 7093 |
| 5 | 1 | 70.5 | 87.6 | 14 / 35 | 6496 |
| 6 | 1 | 70.7 | 89.2 | 17 / 35 | 6165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 76 | 71% |
| rsalesc.melee.Monk 0.3.6c | 55 | 29% |
| franzor.Lizt 1.3.1 | 18 | 72% |
| oog.melee.CapuletDroid 1.1 | 15 | 87% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1191. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 54 | 47% | 76 |
| rtk.Tachikoma 1.0 | 42 | 37% | 100 |
| oog.melee.CapuletDroid 1.1 | 5 | 4% | 21 |
| franzor.Lizt 1.3.1 | 5 | 4% | 2 |
| lrem.micro.MoggFanatic 0.2 | 4 | 4% | 6 |
| exauge.GateKeeper 1.1.121g | 3 | 3% | 4 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.8 | 88 / 210 | 2.72 | 17.5% | 30253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.5% | 88 |
| tm.Yuugao 1.0 | 2.5 | 13.5% | 50 |
| shrub.Vapour v159 | 2.8 | 12.5% | 35 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.7% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.6% | 13 |
| m3thos.Eva00 1.1 | 6.2 | 8.8% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.1% | 5 |
| SHAM.WOW 1.4 | 8.0 | 7.2% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 74.9 | 13 / 35 | 4461 |
| 2 | 1 | 65.9 | 80.3 | 14 / 35 | 4891 |
| 3 | 1 | 66.0 | 81.0 | 14 / 35 | 4809 |
| 4 | 1 | 66.7 | 83.5 | 13 / 35 | 5285 |
| 5 | 1 | 68.8 | 85.1 | 19 / 35 | 5732 |
| 6 | 1 | 66.2 | 80.3 | 15 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 38 | 63% |
| shrub.Vapour v159 | 36 | 56% |
| Krabb.sliNk.Garm 0.9u | 19 | 68% |
| com.spp.robocode.MostlyHarmless 010 | 10 | 90% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 100% |
| m3thos.Eva00 1.1 | 8 | 100% |
| SHAM.WOW 1.4 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 41 | 34% | 57 |
| tm.Yuugao 1.0 | 32 | 26% | 63 |
| Krabb.sliNk.Garm 0.9u | 17 | 14% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 8% | 16 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 5% | 18 |
| m3thos.Eva00 1.1 | 6 | 5% | 14 |
| SHAM.WOW 1.4 | 4 | 3% | 7 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 2 |

## Melee bench: F09

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 69.2 | 54 / 210 | 3.78 | 14.9% | 26954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.3% | 97 |
| hadur117.mini.DeiseWA 0.2 | 2.5 | 14.9% | 54 |
| kc.micro.Figment 1.0 | 2.5 | 14.3% | 33 |
| yagami.Tidus 0.11 | 4.5 | 10.7% | 4 |
| pedersen.Grishnakh 1.0 | 5.3 | 10.1% | 12 |
| mc2.enemy.Original 0.9 | 5.3 | 9.4% | 8 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 1 |
| step.nanoPri 1.0 | 8.2 | 6.3% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 74.0 | 12 / 35 | 4808 |
| 2 | 2 | 63.2 | 70.2 | 8 / 35 | 4656 |
| 3 | 2 | 64.4 | 74.3 | 8 / 35 | 4763 |
| 4 | 3 | 60.1 | 62.5 | 7 / 35 | 4198 |
| 5 | 3 | 61.6 | 66.3 | 10 / 35 | 4146 |
| 6 | 3 | 62.6 | 67.6 | 9 / 35 | 4383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 37 | 35% |
| kc.micro.Figment 1.0 | 24 | 75% |
| yagami.Tidus 0.11 | 10 | 90% |
| mc2.enemy.Original 0.9 | 9 | 89% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 156 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 60 | 38% | 76 |
| kc.micro.Figment 1.0 | 29 | 19% | 45 |
| yagami.Tidus 0.11 | 22 | 14% | 29 |
| mc2.enemy.Original 0.9 | 20 | 13% | 30 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 16 |
| dft.Calliope 5.6 | 5 | 3% | 5 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.9 | 135 / 210 | 2.00 | 19.5% | 35981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.5% | 135 |
| DTF.Kludgy 1.2b | 2.7 | 13.5% | 30 |
| ne.Chimera 1.2 | 3.2 | 12.7% | 12 |
| ejb.Polaris 1.0.1 | 3.3 | 12.4% | 16 |
| vStar.RAFzilla 2.15 | 5.0 | 10.7% | 9 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.8% | 6 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.9% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.8% | 1 |
| donjezza.Muncho 1.0 | 9.0 | 4.8% | 1 |
| kurios.DOSexe .9b | 9.3 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 92.1 | 23 / 35 | 5483 |
| 2 | 1 | 70.2 | 89.2 | 26 / 35 | 6265 |
| 3 | 1 | 69.0 | 87.3 | 18 / 35 | 6139 |
| 4 | 1 | 69.4 | 88.6 | 22 / 35 | 5912 |
| 5 | 1 | 68.4 | 83.8 | 23 / 35 | 6079 |
| 6 | 1 | 70.7 | 92.7 | 23 / 35 | 6103 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 52 | 77% |
| ejb.Polaris 1.0.1 | 32 | 91% |
| ne.Chimera 1.2 | 29 | 76% |
| vStar.RAFzilla 2.15 | 26 | 88% |
| donjezza.Muncho 1.0 | 10 | 90% |
| tvv.micro.Antares 1.1.1 | 9 | 100% |
| kurios.DOSexe .9b | 2 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 30 | 39% | 62 |
| ne.Chimera 1.2 | 16 | 21% | 39 |
| ejb.Polaris 1.0.1 | 12 | 16% | 45 |
| vStar.RAFzilla 2.15 | 5 | 7% | 22 |
| tvv.micro.Antares 1.1.1 | 5 | 7% | 17 |
| sam.Samspin 1.0 | 3 | 4% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 4 |
| donjezza.Muncho 1.0 | 1 | 1% | 9 |
| kurios.DOSexe .9b | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 76.8 | 74 / 210 | 3.09 | 16.5% | 28770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.1% | 65 |
| hadur117.mini.DeiseWA 0.2 | 1.5 | 16.5% | 74 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 21 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 17 |
| br2.MobyDickBot 1.6 | 5.5 | 9.3% | 13 |
| rdt199.Warlord 0.73 | 6.0 | 9.0% | 13 |
| uji.YellohFellah 1.0 | 6.7 | 8.4% | 6 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.0% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 1 |
| stelo.MirrorNano 1.3 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 70.2 | 10 / 35 | 4435 |
| 2 | 1 | 67.0 | 82.2 | 15 / 35 | 5231 |
| 3 | 2 | 63.7 | 74.9 | 8 / 35 | 4537 |
| 4 | 1 | 67.0 | 80.0 | 16 / 35 | 5234 |
| 5 | 2 | 63.8 | 74.0 | 11 / 35 | 4537 |
| 6 | 1 | 65.7 | 79.4 | 14 / 35 | 4796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 38 | 71% |
| cx.mini.Nimrod 0.55 | 19 | 79% |
| djc.DynaBot 0.1.1 | 18 | 67% |
| uji.YellohFellah 1.0 | 13 | 85% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| rdt199.Warlord 0.73 | 5 | 40% |

Hadur died in 136 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 50 | 37% | 80 |
| cx.mini.Nimrod 0.55 | 26 | 19% | 35 |
| rdt199.Warlord 0.73 | 19 | 14% | 22 |
| djc.DynaBot 0.1.1 | 14 | 10% | 22 |
| br2.MobyDickBot 1.6 | 9 | 7% | 19 |
| uji.YellohFellah 1.0 | 7 | 5% | 19 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 6 |
| stelo.MirrorNano 1.3 | 4 | 3% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |

## Melee bench: F12

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 71.6 | 74 / 210 | 3.56 | 15.2% | 24428 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.8 | 15.2% | 74 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.2% | 50 |
| darkcanuck.Leon 1.01 | 2.3 | 13.9% | 33 |
| nat.PallasHawk 1.0 | 3.7 | 12.6% | 34 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 13 |
| jrm.Test0 1.0 | 6.7 | 8.1% | 0 |
| jp.Perpy 16.0 | 7.2 | 7.5% | 1 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.4% | 3 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.6 | 76.5 | 16 / 35 | 4032 |
| 2 | 1 | 61.6 | 69.2 | 12 / 35 | 3779 |
| 3 | 4 | 60.3 | 64.4 | 9 / 35 | 3915 |
| 4 | 2 | 61.2 | 66.0 | 10 / 35 | 4279 |
| 5 | 2 | 63.2 | 74.6 | 13 / 35 | 3916 |
| 6 | 1 | 65.5 | 78.7 | 14 / 35 | 4507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 40 | 73% |
| nat.PallasHawk 1.0 | 24 | 75% |
| bts.wiki.RipCurl 0.9b | 23 | 70% |
| brainfade.melee.Genghis 0.36 | 10 | 80% |
| stuff.Vlad 0.1 | 2 | 50% |
| jp.Perpy 16.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 33 | 24% | 68 |
| bts.wiki.RipCurl 0.9b | 28 | 21% | 39 |
| nat.PallasHawk 1.0 | 25 | 18% | 43 |
| jrm.Test0 1.0 | 19 | 14% | 20 |
| brainfade.melee.Genghis 0.36 | 13 | 10% | 19 |
| jp.Perpy 16.0 | 10 | 7% | 12 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 6 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 1 |

## Melee bench: F13

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.6 | 41 / 210 | 3.20 | 15.0% | 26340 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 16.9% | 54 |
| mn.Combat 3.25.0 | 1.8 | 16.6% | 88 |
| hadur117.mini.DeiseWA 0.2 | 2.8 | 15.0% | 41 |
| shinh.Entangled 0.3 | 4.0 | 12.4% | 16 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.0% | 9 |
| apc.Colossus2 0.17 | 6.3 | 7.8% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.0% | 1 |
| ayk.WallHugger 1.0 | 8.3 | 5.6% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.1 | 71.7 | 6 / 35 | 4230 |
| 2 | 2 | 65.3 | 78.7 | 10 / 35 | 4766 |
| 3 | 3 | 64.6 | 77.8 | 9 / 35 | 4518 |
| 4 | 3 | 62.6 | 73.3 | 4 / 35 | 4334 |
| 5 | 3 | 62.9 | 75.6 | 5 / 35 | 4044 |
| 6 | 3 | 64.2 | 76.5 | 7 / 35 | 4448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 39 | 44% |
| ags.Glacier 0.2.11 | 36 | 47% |
| shinh.Entangled 0.3 | 9 | 56% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 63 | 37% | 78 |
| mn.Combat 3.25.0 | 51 | 30% | 68 |
| shinh.Entangled 0.3 | 26 | 15% | 32 |
| gh.micro.Gruweltje 0.7 | 19 | 11% | 22 |
| stelo.Wang 1.0 | 5 | 3% | 5 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.5 | 131 / 210 | 2.13 | 19.3% | 34627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.3% | 131 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 40 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.1% | 27 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.7 | 9.3% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.2% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.3% | 6 |
| pa.Improved 1.0 | 8.8 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 86.3 | 23 / 35 | 5914 |
| 2 | 1 | 68.6 | 86.3 | 19 / 35 | 5640 |
| 3 | 1 | 71.4 | 93.7 | 25 / 35 | 6271 |
| 4 | 1 | 67.7 | 83.5 | 19 / 35 | 5318 |
| 5 | 1 | 69.6 | 87.6 | 22 / 35 | 5887 |
| 6 | 1 | 69.4 | 87.3 | 23 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 81% |
| catcat20.shape.Theta 0.018 | 41 | 85% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 92% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 43% | 91 |
| catcat20.shape.Theta 0.018 | 16 | 20% | 43 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 20 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 8% | 12 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 6% | 9 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 5% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 4% | 18 |
| pa.Improved 1.0 | 1 | 1% | 4 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.8 | 92 / 210 | 3.00 | 17.4% | 32731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.2 | 17.4% | 92 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.9% | 28 |
| emp.Yngwie 1.11 | 3.2 | 13.0% | 54 |
| mld.DustBunny 3.8 | 3.3 | 12.8% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.5% | 11 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 11 |
| lambdaxy.TBot 0.1 | 7.3 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.4% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 74.6 | 11 / 35 | 5040 |
| 2 | 1 | 67.0 | 78.1 | 16 / 35 | 5802 |
| 3 | 1 | 69.9 | 86.3 | 19 / 35 | 6236 |
| 4 | 2 | 64.9 | 74.3 | 11 / 35 | 5032 |
| 5 | 1 | 64.3 | 71.1 | 15 / 35 | 5083 |
| 6 | 1 | 68.4 | 82.5 | 20 / 35 | 5538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 59% |
| kawigi.micro.Shiz 1.1 | 29 | 93% |
| mld.DustBunny 3.8 | 19 | 100% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| kawigi.robot.Girl 1.2 | 12 | 83% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 739. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 48 | 41% | 77 |
| kawigi.micro.Shiz 1.1 | 23 | 19% | 48 |
| mld.DustBunny 3.8 | 15 | 13% | 36 |
| cb.nano.Insomnia 1.0 | 13 | 11% | 17 |
| kawigi.robot.Girl 1.2 | 11 | 9% | 15 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 9 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 70.7 | 65 / 210 | 3.64 | 15.8% | 31315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.3 | 16.3% | 69 |
| hadur117.mini.DeiseWA 0.2 | 1.8 | 15.8% | 65 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.4% | 11 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 11.7% | 44 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 1 |
| tvv.nano.Polaris 1.2 | 6.2 | 8.8% | 9 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.0% | 4 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.9% | 6 |
| asd.Cthulhu 1.3 | 9.2 | 5.0% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 67.9 | 10 / 35 | 5216 |
| 2 | 1 | 64.7 | 73.3 | 12 / 35 | 5053 |
| 3 | 2 | 62.5 | 67.6 | 9 / 35 | 4900 |
| 4 | 1 | 65.9 | 75.6 | 13 / 35 | 5593 |
| 5 | 2 | 63.7 | 68.9 | 11 / 35 | 5196 |
| 6 | 2 | 64.9 | 70.8 | 10 / 35 | 5357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 42 | 55% |
| techdude.forest.FlamingForest 1.1 | 21 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 86% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 56 | 39% | 87 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 34 | 23% | 39 |
| techdude.forest.FlamingForest 1.1 | 18 | 12% | 34 |
| divineomega.DivineBot 1.9.4.5 | 11 | 8% | 15 |
| stelo.IntrinsicVolatility 1.4 | 9 | 6% | 14 |
| bvh.fnr.Fenrir 0.36l | 8 | 6% | 10 |
| tvv.nano.Polaris 1.2 | 7 | 5% | 9 |
| asd.Cthulhu 1.3 | 2 | 1% | 2 |

## Melee bench: F17

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 71.2 | 70 / 210 | 3.59 | 15.9% | 31775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.2 | 15.9% | 70 |
| et.Predator 1.8 | 2.7 | 13.3% | 21 |
| oog.melee.Mercutio 1.0 | 2.7 | 13.4% | 43 |
| cx.BlestPain 1.41 | 4.5 | 12.0% | 39 |
| nic.Nicator 2.4 | 4.8 | 11.5% | 25 |
| ahf.NanoAndrew .4 | 5.2 | 11.3% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 8.1% | 1 |
| tex.Longbot 0.4 | 8.2 | 6.2% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.6% | 2 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 71.1 | 13 / 35 | 5685 |
| 2 | 1 | 66.4 | 75.9 | 14 / 35 | 5739 |
| 3 | 1 | 64.3 | 71.7 | 10 / 35 | 5362 |
| 4 | 1 | 66.6 | 77.8 | 15 / 35 | 5481 |
| 5 | 1 | 62.5 | 65.7 | 9 / 35 | 5129 |
| 6 | 2 | 61.0 | 65.1 | 9 / 35 | 4379 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 26 | 85% |
| oog.melee.Mercutio 1.0 | 25 | 80% |
| cx.BlestPain 1.41 | 15 | 40% |
| nic.Nicator 2.4 | 14 | 64% |
| ahf.NanoAndrew .4 | 11 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 21% | 36 |
| oog.melee.Mercutio 1.0 | 25 | 18% | 44 |
| nic.Nicator 2.4 | 24 | 17% | 33 |
| ahf.NanoAndrew .4 | 20 | 14% | 27 |
| et.Predator 1.8 | 18 | 13% | 40 |
| maribo.melee.BMV 0.1 | 15 | 11% | 19 |
| tex.Longbot 0.4 | 8 | 6% | 9 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |

## Melee bench: F18

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 79.4 | 94 / 210 | 2.85 | 17.4% | 30951 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.4% | 94 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.7% | 45 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.0% | 31 |
| uji.DBH 1.1 | 4.2 | 11.1% | 10 |
| ratosh.Nobo 0.21 | 4.8 | 10.5% | 8 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.3% | 9 |
| sigterm.Sigterm 1.0 | 7.0 | 7.8% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.1% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.7% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 78.7 | 16 / 35 | 5642 |
| 2 | 1 | 66.8 | 80.6 | 17 / 35 | 5058 |
| 3 | 1 | 65.8 | 77.1 | 15 / 35 | 5031 |
| 4 | 1 | 65.3 | 78.7 | 14 / 35 | 5075 |
| 5 | 1 | 66.1 | 79.0 | 18 / 35 | 4959 |
| 6 | 1 | 66.6 | 82.2 | 14 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 35 | 80% |
| uji.DBH 1.1 | 27 | 93% |
| agd.Mooserwirt2 2.7 | 25 | 48% |
| spinnercat.Robovirus 2.718 | 12 | 75% |
| sigterm.Sigterm 1.0 | 10 | 90% |
| ratosh.Nobo 0.21 | 9 | 78% |
| stelo.WangRobot 1.0 | 4 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 33% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 27% | 65 |
| agd.Mooserwirt2 2.7 | 24 | 21% | 42 |
| ratosh.Nobo 0.21 | 19 | 16% | 29 |
| uji.DBH 1.1 | 16 | 14% | 29 |
| kawigi.mini.Fhqwhgads 1.1 | 10 | 9% | 12 |
| spinnercat.Robovirus 2.718 | 7 | 6% | 12 |
| stelo.WangRobot 1.0 | 5 | 4% | 4 |
| sigterm.Sigterm 1.0 | 2 | 2% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 7 |

## Melee bench: F19

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 91.5 | 150 / 210 | 1.76 | 20.8% | 37456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 20.8% | 150 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.3% | 26 |
| mld.Infinity 2.2 | 2.7 | 14.0% | 23 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.5% | 7 |
| erdnis.Rover 0.3 | 5.0 | 10.7% | 3 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 1 |
| pac.ABC 2.1 | 7.8 | 6.5% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 88.3 | 26 / 35 | 5937 |
| 2 | 1 | 72.4 | 93.0 | 25 / 35 | 6807 |
| 3 | 1 | 70.2 | 87.9 | 21 / 35 | 5732 |
| 4 | 1 | 72.1 | 90.5 | 25 / 35 | 6638 |
| 5 | 1 | 72.6 | 95.6 | 28 / 35 | 6289 |
| 6 | 1 | 71.9 | 94.0 | 25 / 35 | 6053 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 68 | 87% |
| mld.Infinity 2.2 | 56 | 84% |
| krillr.mini.JointStrike 2.0.0 | 16 | 88% |
| patson.PatsonTestBot 1.0 | 13 | 100% |
| erdnis.Rover 0.3 | 13 | 92% |
| pac.ABC 2.1 | 5 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 17 | 28% | 76 |
| mld.Infinity 2.2 | 17 | 28% | 70 |
| krillr.mini.JointStrike 2.0.0 | 13 | 22% | 23 |
| erdnis.Rover 0.3 | 9 | 15% | 20 |
| mbh.Mbh 0.1 | 2 | 3% | 4 |
| pbg.R2D2 1.0 | 1 | 2% | 5 |
| pac.ABC 2.1 | 1 | 2% | 4 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 8 |

## Melee bench: F20

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.2 | 93 / 210 | 2.51 | 18.6% | 35457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 18.6% | 93 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.3% | 68 |
| fwb.Nine 1.0.1 | 3.7 | 10.9% | 13 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.5% | 5 |
| catcat20.Rabbit 0.001 | 4.5 | 10.4% | 22 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.9% | 3 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.4% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.4 | 17 / 35 | 5916 |
| 2 | 1 | 68.4 | 80.3 | 20 / 35 | 6114 |
| 3 | 1 | 69.4 | 86.0 | 18 / 35 | 6065 |
| 4 | 1 | 66.6 | 79.0 | 13 / 35 | 5633 |
| 5 | 1 | 68.4 | 86.0 | 13 / 35 | 5954 |
| 6 | 1 | 67.2 | 82.2 | 12 / 35 | 5775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 62 | 58% |
| catcat20.Rabbit 0.001 | 25 | 68% |
| fwb.Nine 1.0.1 | 16 | 100% |
| nz.jdc.nano.GridFu 1.0 | 11 | 91% |
| bayen.nut.Squirrel 1.615 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |

Hadur died in 117 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 60 | 51% | 94 |
| fwb.Nine 1.0.1 | 17 | 15% | 32 |
| catcat20.Rabbit 0.001 | 14 | 12% | 31 |
| nz.jdc.nano.GridFu 1.0 | 12 | 10% | 27 |
| m3thos.mini.Eva01 0.5.5 | 6 | 5% | 11 |
| bayen.nut.Squirrel 1.615 | 5 | 4% | 8 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 4 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.8 | 126 / 210 | 1.92 | 20.3% | 37828 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 20.3% | 126 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 51 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 18 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 7 |
| oa.weak.BotherBot 0.1 | 5.2 | 8.6% | 2 |
| eld.Hmm 1.0 | 6.0 | 7.8% | 4 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| el.JumpShoot 0.2 | 8.7 | 5.5% | 2 |
| arthord.MannyPacquiao Beta | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 24 / 35 | 6499 |
| 2 | 1 | 71.1 | 90.5 | 22 / 35 | 6488 |
| 3 | 1 | 71.9 | 91.4 | 23 / 35 | 6496 |
| 4 | 1 | 69.8 | 85.1 | 22 / 35 | 6134 |
| 5 | 1 | 70.9 | 92.4 | 19 / 35 | 6238 |
| 6 | 1 | 69.1 | 86.7 | 16 / 35 | 5973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 107 | 70% |
| cf.RiO.RiOx 4.2.1 | 22 | 100% |
| dummy.mini.Scimitar 1.01 | 21 | 90% |
| eld.Hmm 1.0 | 5 | 100% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1109. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 41 | 49% | 96 |
| dummy.mini.Scimitar 1.01 | 24 | 29% | 57 |
| cf.RiO.RiOx 4.2.1 | 8 | 10% | 26 |
| eld.Hmm 1.0 | 5 | 6% | 18 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 8 |
| fire219.CatBot 1.0 | 2 | 2% | 3 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |

## Melee bench: F22

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 78.4 | 68 / 210 | 2.94 | 17.1% | 33717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.5 | 17.1% | 68 |
| pe.SandboxDT 2.71m | 1.8 | 16.5% | 73 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.6% | 34 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.1% | 29 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 4 |
| yk.JahRoslav 1.1 | 6.2 | 6.9% | 1 |
| tad.Dalek98 0.98 | 7.0 | 6.6% | 1 |
| pbg.NinjaX 1.2 | 8.3 | 5.4% | 1 |
| gg.Squaraus 0.6 | 8.5 | 5.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 81.3 | 12 / 35 | 5854 |
| 2 | 1 | 67.1 | 79.4 | 12 / 35 | 5584 |
| 3 | 2 | 67.1 | 79.4 | 12 / 35 | 5617 |
| 4 | 3 | 65.0 | 74.0 | 9 / 35 | 5365 |
| 5 | 1 | 66.2 | 76.5 | 10 / 35 | 5489 |
| 6 | 1 | 67.4 | 80.0 | 13 / 35 | 5808 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 36 | 72% |
| pe.SandboxDT 2.71m | 33 | 42% |
| jlm.javaDisturbance 0.59 | 17 | 82% |
| bigpete.Stewie 1.0 | 7 | 100% |
| yk.JahRoslav 1.1 | 4 | 75% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 53 | 37% | 79 |
| kvk.HebusLeTroll 0.35 | 43 | 30% | 57 |
| jlm.javaDisturbance 0.59 | 23 | 16% | 39 |
| bigpete.Stewie 1.0 | 12 | 8% | 20 |
| yk.JahRoslav 1.1 | 5 | 4% | 7 |
| tad.Dalek98 0.98 | 5 | 4% | 6 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |

## Melee bench: F23

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.6 | 107 / 210 | 2.20 | 18.9% | 33050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 18.9% | 107 |
| pe.SandboxLump 1.52 | 2.0 | 17.5% | 66 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 13 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 8.9% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 1 |
| cw.megas.Blade 0.8 | 7.2 | 7.7% | 0 |
| sample.Walls 1.0 | 7.2 | 7.9% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 14 / 35 | 5368 |
| 2 | 1 | 69.0 | 85.1 | 18 / 35 | 5513 |
| 3 | 1 | 70.0 | 90.5 | 18 / 35 | 5369 |
| 4 | 1 | 70.9 | 88.6 | 20 / 35 | 5761 |
| 5 | 1 | 71.4 | 90.5 | 22 / 35 | 5941 |
| 6 | 1 | 66.8 | 78.7 | 15 / 35 | 5098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 77 | 60% |
| stelo.AreaTargetingBot 1.1 | 24 | 92% |
| cre.Karolos 0.32 | 22 | 77% |
| sample.Walls 1.0 | 12 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 58 | 56% | 109 |
| cre.Karolos 0.32 | 25 | 24% | 43 |
| stelo.AreaTargetingBot 1.1 | 12 | 12% | 27 |
| stelo.RamTrackSurfer 1.2 | 4 | 4% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 4 |
| sample.Walls 1.0 | 1 | 1% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 69.6 | 44 / 210 | 3.73 | 14.6% | 26061 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.5 | 14.6% | 44 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.0% | 40 |
| davidalves.Phoenix 0.54 | 3.0 | 13.2% | 38 |
| florent.XSeries.X2 0.12 | 3.2 | 13.2% | 49 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 19 |
| oog.melee.Corsair 1.0 | 6.2 | 9.5% | 9 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.2% | 7 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 3 |
| as.FrankTheTank 1.3 | 9.3 | 5.1% | 1 |
| evd.X1 0.01 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.8 | 65.1 | 6 / 35 | 4025 |
| 2 | 2 | 59.9 | 66.7 | 1 / 35 | 4198 |
| 3 | 1 | 64.4 | 74.3 | 13 / 35 | 4663 |
| 4 | 2 | 60.6 | 65.7 | 8 / 35 | 4193 |
| 5 | 1 | 63.1 | 71.4 | 7 / 35 | 4613 |
| 6 | 1 | 63.6 | 74.6 | 9 / 35 | 4369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 18 | 44% |
| davidalves.Phoenix 0.54 | 15 | 60% |
| pedersen.Ugluk 1.1.1 | 12 | 75% |
| rz.GlowBlowMelee 1.4 | 11 | 73% |
| stelo.SoJNanoMelee 1.1 | 8 | 75% |
| as.FrankTheTank 1.3 | 2 | 100% |
| oog.melee.Corsair 1.0 | 2 | 50% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 40 | 24% | 54 |
| davidalves.Phoenix 0.54 | 38 | 23% | 44 |
| florent.XSeries.X2 0.12 | 36 | 22% | 44 |
| pedersen.Ugluk 1.1.1 | 23 | 14% | 27 |
| oog.melee.Corsair 1.0 | 10 | 6% | 15 |
| stelo.SoJNanoMelee 1.1 | 8 | 5% | 11 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 6 |
| evd.X1 0.01 | 4 | 2% | 4 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |

## Melee bench: F25

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.9 | 106 / 210 | 2.72 | 17.7% | 28597 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.7% | 106 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.3% | 35 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.7% | 17 |
| jdw.Hurricane 1.4 | 4.0 | 11.2% | 23 |
| gre.svman4.Morfeas 1.4.1 | 4.7 | 10.0% | 9 |
| ds.Oo 2.2 | 6.2 | 8.8% | 10 |
| awesomeness.Elite 1.0 | 7.0 | 7.6% | 6 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.3% | 4 |
| adt.Ar2 1.1 | 9.2 | 5.9% | 0 |
| amk.ChumbaMini 0.2 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.4 | 19 / 35 | 4871 |
| 2 | 1 | 66.3 | 81.9 | 15 / 35 | 4622 |
| 3 | 1 | 67.5 | 81.0 | 19 / 35 | 5060 |
| 4 | 1 | 66.6 | 80.3 | 19 / 35 | 4614 |
| 5 | 1 | 64.9 | 74.0 | 17 / 35 | 4451 |
| 6 | 1 | 67.7 | 83.8 | 17 / 35 | 4979 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 44 | 73% |
| voidious.micro.BlitzBat 1.05 | 35 | 89% |
| jdw.Hurricane 1.4 | 24 | 88% |
| gre.svman4.Morfeas 1.4.1 | 7 | 57% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 4 | 100% |
| ds.Oo 2.2 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 29 | 28% | 66 |
| jdw.Hurricane 1.4 | 17 | 16% | 29 |
| ds.Oo 2.2 | 17 | 16% | 21 |
| voidious.micro.BlitzBat 1.05 | 14 | 13% | 46 |
| gre.svman4.Morfeas 1.4.1 | 11 | 11% | 15 |
| gjr.Cephalosporin 0.1 | 8 | 8% | 14 |
| awesomeness.Elite 1.0 | 4 | 4% | 8 |
| amk.ChumbaMini 0.2 | 3 | 3% | 6 |
| adt.Ar2 1.1 | 1 | 1% | 5 |

## Melee bench: F26

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.6 | 81 / 210 | 2.66 | 17.9% | 36218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.9% | 81 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 52 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 22 |
| shu.nitro.LENIN .T34 | 3.8 | 12.2% | 42 |
| js.PinBall 1.6 | 4.8 | 10.6% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.5% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 2 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 78.1 | 10 / 35 | 5490 |
| 2 | 1 | 69.9 | 87.3 | 18 / 35 | 6520 |
| 3 | 1 | 67.2 | 81.0 | 12 / 35 | 5855 |
| 4 | 1 | 67.9 | 82.5 | 15 / 35 | 6011 |
| 5 | 1 | 68.5 | 81.3 | 14 / 35 | 6283 |
| 6 | 1 | 67.4 | 79.4 | 12 / 35 | 6059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 36 | 56% |
| lrem.Spectre 0.4.4 | 35 | 71% |
| shu.nitro.LENIN .T34 | 28 | 54% |
| js.PinBall 1.6 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 71% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 42 | 33% | 65 |
| shu.nitro.LENIN .T34 | 32 | 25% | 52 |
| lrem.Spectre 0.4.4 | 23 | 18% | 41 |
| js.PinBall 1.6 | 13 | 10% | 21 |
| gh.mini.GrubbmOne 1.0 | 10 | 8% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 5% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.0 | 102 / 210 | 2.89 | 17.6% | 31616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.6% | 102 |
| mk.Alpha 0.2.1 | 2.8 | 12.9% | 46 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.2% | 16 |
| wee.Gem 1.8.4 | 3.8 | 11.3% | 26 |
| EH.Eagle 1.0.6 | 4.5 | 10.5% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.5% | 4 |
| joe.ADinosaur 1.0 | 6.3 | 9.2% | 4 |
| throxbot.ThroxBot 0.1 | 7.8 | 7.7% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.0% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 80.6 | 21 / 35 | 5194 |
| 2 | 1 | 66.3 | 80.6 | 16 / 35 | 5014 |
| 3 | 1 | 66.8 | 70.8 | 14 / 35 | 6169 |
| 4 | 1 | 68.0 | 82.5 | 18 / 35 | 5598 |
| 5 | 1 | 67.2 | 81.9 | 17 / 35 | 5255 |
| 6 | 1 | 65.0 | 77.8 | 16 / 35 | 4386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 42 | 69% |
| wee.Gem 1.8.4 | 26 | 81% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 77% |
| EH.Eagle 1.0.6 | 20 | 85% |
| joe.ADinosaur 1.0 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 626. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 33 | 31% | 62 |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 20% | 39 |
| wee.Gem 1.8.4 | 19 | 18% | 44 |
| joe.ADinosaur 1.0 | 10 | 9% | 14 |
| EH.Eagle 1.0.6 | 6 | 6% | 24 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 6% | 10 |
| throxbot.ThroxBot 0.1 | 5 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 5 |
| cs.Grudge 1.0 | 2 | 2% | 3 |

## Melee bench: F28

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.4 | 132 / 210 | 2.04 | 19.2% | 30780 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.2% | 132 |
| kid.test.NightFox .2 | 2.0 | 14.9% | 32 |
| uji.Antique 1.0 | 3.3 | 11.5% | 20 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.7% | 12 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 2 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.2% | 6 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.9% | 4 |
| matt.advanced.Katana 1.0 | 8.3 | 6.3% | 0 |
| stelo.PianistNano 1.2 | 8.7 | 6.0% | 2 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.2 | 22 / 35 | 5239 |
| 2 | 1 | 68.9 | 88.9 | 20 / 35 | 5304 |
| 3 | 1 | 68.2 | 86.3 | 20 / 35 | 4846 |
| 4 | 1 | 67.5 | 83.5 | 18 / 35 | 5167 |
| 5 | 1 | 69.9 | 92.4 | 24 / 35 | 5066 |
| 6 | 1 | 70.1 | 90.2 | 28 / 35 | 5158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 73 | 82% |
| uji.Antique 1.0 | 41 | 90% |
| qohnil.blot.BlotBot 3.61 | 15 | 73% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| stelo.PianistNano 1.2 | 4 | 75% |
| matt.advanced.Katana 1.0 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 27 | 35% | 88 |
| uji.Antique 1.0 | 18 | 23% | 46 |
| pfvicm.Sobieski 7.2.3b | 10 | 13% | 20 |
| amk.ChumbaWumba 0.3 | 9 | 12% | 11 |
| qohnil.blot.BlotBot 3.61 | 8 | 10% | 19 |
| stelo.PianistNano 1.2 | 3 | 4% | 6 |
| stelo.Lifestealer 1.0 | 2 | 3% | 3 |
| ahr.ice.Ice 1.0.2 | 1 | 1% | 9 |
| matt.advanced.Katana 1.0 | 0 | 0% | 5 |

## Melee bench: F29

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 74.0 | 66 / 210 | 3.34 | 16.6% | 30585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.7 | 16.6% | 66 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 16.2% | 77 |
| deewiant.Anomaly 0.2 | 2.5 | 15.0% | 43 |
| myl.micro.Troodon 1.10 | 4.0 | 11.8% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.6% | 11 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.7 | 5.9% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 6.0% | 4 |
| jangs.ns51 1.0 | 8.8 | 4.7% | 1 |
| ap.Frederick 1.1 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 78.4 | 13 / 35 | 5320 |
| 2 | 3 | 62.8 | 65.1 | 9 / 35 | 4827 |
| 3 | 1 | 68.4 | 82.9 | 13 / 35 | 5402 |
| 4 | 1 | 66.4 | 76.2 | 9 / 35 | 5395 |
| 5 | 3 | 62.9 | 65.1 | 9 / 35 | 4579 |
| 6 | 1 | 66.3 | 76.5 | 13 / 35 | 5062 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 38 | 42% |
| deewiant.Anomaly 0.2 | 38 | 61% |
| jok.PheonixM 0.1.2 | 10 | 100% |
| myl.micro.Troodon 1.10 | 9 | 78% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ap.Frederick 1.1 | 4 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 757. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 35% | 75 |
| zyx.mega.YersiniaPestis 3.1 | 47 | 33% | 67 |
| myl.micro.Troodon 1.10 | 25 | 17% | 29 |
| jok.PheonixM 0.1.2 | 9 | 6% | 16 |
| ph.melee.ArcherME 0.3 | 6 | 4% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 3% | 5 |
| jangs.ns51 1.0 | 2 | 1% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 6 |

## Melee bench: F30

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 59.5 | 32 / 210 | 4.64 | 12.4% | 23253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.3 | 14.3% | 58 |
| darkcanuck.B26354 1.06 | 2.0 | 14.0% | 52 |
| oog.melee.Capulet 1.2 | 3.2 | 13.1% | 32 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.9% | 23 |
| hadur117.mini.DeiseWA 0.2 | 4.3 | 12.4% | 32 |
| intruder.PrairieWolf 2.61 | 7.2 | 8.2% | 5 |
| ntc.Opposite 1.5 | 7.3 | 7.8% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.5% | 6 |
| tripphippy.Alice 1.1 | 8.0 | 7.5% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.0 | 64.8 | 7 / 35 | 4014 |
| 2 | 3 | 59.2 | 64.1 | 6 / 35 | 3859 |
| 3 | 5 | 53.4 | 48.6 | 4 / 35 | 3545 |
| 4 | 4 | 59.2 | 61.6 | 8 / 35 | 4048 |
| 5 | 5 | 55.4 | 53.0 | 4 / 35 | 3740 |
| 6 | 5 | 59.8 | 65.1 | 3 / 35 | 4047 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 12 | 67% |
| darkcanuck.B26354 1.06 | 10 | 50% |
| oog.melee.Capulet 1.2 | 9 | 78% |
| stelo.PastFuture 2.3.2 | 5 | 100% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 567. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 42 | 24% | 48 |
| oog.melee.Capulet 1.2 | 35 | 20% | 40 |
| stelo.PastFuture 2.3.2 | 31 | 17% | 35 |
| catcat20.Matcha 0.006 | 28 | 16% | 39 |
| ntc.Opposite 1.5 | 13 | 7% | 13 |
| tripphippy.Alice 1.1 | 10 | 6% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 12 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 11 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.1 | 63.0 | 27 / 210 | 4.33 | 12.9% | 22756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.9% | 102 |
| gh.mini.Griezel 0.2 | 2.5 | 13.4% | 41 |
| hadur117.mini.DeiseWA 0.2 | 2.7 | 12.9% | 27 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.6% | 18 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.2% | 13 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.6% | 7 |
| timmit.nano.TimDog 0.33 | 7.5 | 7.0% | 3 |
| fm.mammillarias 1.3 | 7.7 | 6.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 58.1 | 5 / 35 | 3398 |
| 2 | 2 | 59.9 | 63.2 | 6 / 35 | 4079 |
| 3 | 2 | 59.7 | 63.5 | 5 / 35 | 3799 |
| 4 | 3 | 58.1 | 61.9 | 4 / 35 | 3542 |
| 5 | 3 | 58.9 | 62.2 | 4 / 35 | 3822 |
| 6 | 2 | 60.8 | 69.2 | 3 / 35 | 4116 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 20 | 50% |
| gh.mini.Griezel 0.2 | 15 | 40% |
| spinnercat.micro.Tyger 0.1 | 8 | 75% |
| d414.nano.Quantum 1.0.0 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 614. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 49 | 27% | 59 |
| gh.mini.Griezel 0.2 | 46 | 25% | 53 |
| spinnercat.micro.Tyger 0.1 | 29 | 16% | 35 |
| d414.nano.Quantum 1.0.0 | 20 | 11% | 22 |
| gh.nano.Grofvuil 0.2 | 18 | 10% | 20 |
| timmit.nano.TimDog 0.33 | 8 | 4% | 8 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 5 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 81.6 | 100 / 210 | 2.65 | 17.8% | 32315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 17.8% | 100 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 57 |
| apc.botM 3.0 | 3.0 | 12.6% | 25 |
| vjik.UnViolation 1.1 | 4.5 | 10.8% | 10 |
| lxx.ConceptA 0.8 | 4.8 | 10.5% | 11 |
| bayen.UbaMicro 1.4 | 5.7 | 9.1% | 6 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.3% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.4 | 15 / 35 | 5362 |
| 2 | 1 | 67.4 | 83.5 | 18 / 35 | 5420 |
| 3 | 1 | 66.2 | 78.4 | 16 / 35 | 5212 |
| 4 | 1 | 68.8 | 87.6 | 19 / 35 | 5776 |
| 5 | 1 | 67.2 | 82.5 | 18 / 35 | 5245 |
| 6 | 1 | 64.3 | 73.3 | 14 / 35 | 5300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 61 | 54% |
| apc.botM 3.0 | 27 | 70% |
| lxx.ConceptA 0.8 | 24 | 83% |
| vjik.UnViolation 1.1 | 13 | 100% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 644. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 41% | 82 |
| apc.botM 3.0 | 23 | 21% | 50 |
| lxx.ConceptA 0.8 | 17 | 15% | 26 |
| vjik.UnViolation 1.1 | 7 | 6% | 21 |
| bayen.UbaMicro 1.4 | 7 | 6% | 11 |
| panzer.Panzer 0.2 | 6 | 5% | 7 |
| conscience.Electron 1.3g | 4 | 4% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F33

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 76.3 | 79 / 210 | 3.13 | 16.9% | 31329 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.5 | 16.9% | 79 |
| maribo.Quester 0.3 | 1.5 | 16.9% | 59 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 24 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.4% | 19 |
| labg.Cataclysm 2.05 | 4.7 | 10.4% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.8% | 9 |
| baal.nano.N 1.42 | 6.5 | 8.7% | 3 |
| zyx.micro.Ant 1.1 | 8.5 | 5.1% | 0 |
| sanja.First 0.1 | 9.2 | 4.7% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 80.6 | 15 / 35 | 5367 |
| 2 | 2 | 62.9 | 67.9 | 9 / 35 | 4683 |
| 3 | 2 | 66.4 | 76.8 | 12 / 35 | 5268 |
| 4 | 2 | 66.3 | 76.2 | 14 / 35 | 5265 |
| 5 | 1 | 67.5 | 80.3 | 15 / 35 | 5391 |
| 6 | 1 | 66.1 | 76.2 | 14 / 35 | 5355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 31 | 68% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 27 | 70% |
| gre.svman4.Leonidas 1.3.2 | 27 | 89% |
| labg.Cataclysm 2.05 | 13 | 69% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 33% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 51 | 39% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 17% | 42 |
| gre.svman4.Leonidas 1.3.2 | 22 | 17% | 39 |
| labg.Cataclysm 2.05 | 15 | 11% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 8% | 11 |
| baal.nano.N 1.42 | 5 | 4% | 10 |
| zyx.micro.Ant 1.1 | 2 | 2% | 3 |
| sanja.First 0.1 | 2 | 2% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.8 | 45 / 210 | 3.09 | 16.2% | 31511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.5 | 16.8% | 77 |
| hadur117.mini.DeiseWA 0.2 | 2.2 | 16.2% | 45 |
| kid.Gladiator .7.2 | 2.3 | 16.1% | 61 |
| tcf.Reach 3 | 4.7 | 11.2% | 9 |
| jcs.Seth 1.8 | 5.0 | 10.9% | 15 |
| cli.Dancer 1.1 | 5.3 | 9.9% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 2 |
| amk.Punbot.Punbot 0.01 | 8.2 | 4.7% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.7% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.9 | 75.6 | 6 / 35 | 5451 |
| 2 | 3 | 64.9 | 72.7 | 5 / 35 | 5148 |
| 3 | 2 | 66.8 | 80.6 | 7 / 35 | 5460 |
| 4 | 1 | 67.1 | 80.6 | 10 / 35 | 5447 |
| 5 | 1 | 65.8 | 76.5 | 10 / 35 | 5066 |
| 6 | 3 | 64.7 | 74.6 | 7 / 35 | 4939 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 48 | 33% |
| kid.Gladiator .7.2 | 31 | 42% |
| jcs.Seth 1.8 | 8 | 100% |
| tcf.Reach 3 | 5 | 60% |
| ratosh.Wesco 1.4 | 2 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 64 | 39% | 84 |
| kid.Gladiator .7.2 | 52 | 32% | 57 |
| tcf.Reach 3 | 20 | 12% | 23 |
| jcs.Seth 1.8 | 11 | 7% | 19 |
| cli.Dancer 1.1 | 10 | 6% | 14 |
| ratosh.Wesco 1.4 | 6 | 4% | 9 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F35

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.7 | 30 / 210 | 3.54 | 14.3% | 23785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 152 |
| hadur117.mini.DeiseWA 0.2 | 2.3 | 14.3% | 30 |
| gh.mini.Gruwel 0.9 | 2.7 | 13.2% | 14 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.1% | 8 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.3% | 2 |
| wit.Chuliath 1.0 | 6.8 | 7.1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 5.0% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 78.1 | 5 / 35 | 4052 |
| 2 | 2 | 63.9 | 74.9 | 11 / 35 | 4108 |
| 3 | 3 | 59.2 | 63.5 | 3 / 35 | 3882 |
| 4 | 3 | 62.5 | 73.0 | 3 / 35 | 4129 |
| 5 | 2 | 61.9 | 70.2 | 4 / 35 | 4214 |
| 6 | 2 | 60.7 | 70.8 | 4 / 35 | 3400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 56 | 14% |
| gh.mini.Gruwel 0.9 | 12 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 50% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 652. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 87 | 48% | 97 |
| gh.mini.Gruwel 0.9 | 34 | 19% | 44 |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 11% | 22 |
| rz.HawkOnFire 0.1 | 16 | 9% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 9 | 5% | 10 |
| dans.Cinnamon 1.2 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 4 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 85.2 | 134 / 210 | 2.33 | 19.5% | 34713 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.5% | 134 |
| alpha.RainingFire 1.0 | 2.2 | 12.7% | 31 |
| bzdp.Pansy 2.1 | 2.8 | 11.9% | 14 |
| mz.Cork 0.1 | 4.7 | 10.5% | 8 |
| bvh.micro.Freya 0.3 | 4.7 | 10.4% | 10 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.1% | 4 |
| m3thos.Eva02 0.7.1 | 6.7 | 8.9% | 1 |
| dl.BetterWalls 1.0 | 8.0 | 6.9% | 3 |
| squidM.TentalceMeleeNano 1.1 | 9.2 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.5% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.9 | 24 / 35 | 5946 |
| 2 | 1 | 69.9 | 87.9 | 26 / 35 | 5796 |
| 3 | 1 | 69.5 | 85.7 | 23 / 35 | 5889 |
| 4 | 1 | 70.0 | 88.3 | 23 / 35 | 6030 |
| 5 | 1 | 66.5 | 76.5 | 16 / 35 | 5390 |
| 6 | 1 | 68.8 | 84.1 | 22 / 35 | 5662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 38 | 95% |
| bvh.micro.Freya 0.3 | 25 | 96% |
| mz.Cork 0.1 | 24 | 92% |
| alpha.RainingFire 1.0 | 23 | 61% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| m3thos.Eva02 0.7.1 | 7 | 100% |
| dl.BetterWalls 1.0 | 7 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 24 | 31% | 42 |
| bzdp.Pansy 2.1 | 15 | 19% | 60 |
| mz.Cork 0.1 | 12 | 15% | 33 |
| bvh.micro.Freya 0.3 | 10 | 13% | 31 |
| bvh.mini.Fenrir 0.39 | 9 | 12% | 16 |
| m3thos.Eva02 0.7.1 | 3 | 4% | 13 |
| dl.BetterWalls 1.0 | 2 | 3% | 8 |
| squidM.TentalceMeleeNano 1.1 | 2 | 3% | 2 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.2 | 170 / 210 | 1.80 | 20.3% | 37188 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 20.3% | 170 |
| germ.TheMind .2 | 3.2 | 10.4% | 6 |
| EBBU.Sim2 1.02 | 3.8 | 9.8% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.3 | 9.6% | 1 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.1% | 9 |
| agrach.Dalek 1.0 | 6.0 | 8.9% | 8 |
| lmk.ACPFinal 0.1 | 7.0 | 8.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.9% | 0 |
| mb.Beast 0.1 | 7.8 | 7.9% | 4 |
| skm.Ryubot 1.0 | 8.8 | 7.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.4 | 27 / 35 | 5935 |
| 2 | 1 | 70.2 | 90.2 | 29 / 35 | 6482 |
| 3 | 1 | 68.0 | 87.3 | 26 / 35 | 5657 |
| 4 | 1 | 69.9 | 93.0 | 30 / 35 | 5996 |
| 5 | 1 | 72.1 | 97.5 | 33 / 35 | 6823 |
| 6 | 1 | 68.8 | 86.7 | 25 / 35 | 6295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| EBBU.Sim2 1.02 | 31 | 94% |
| germ.TheMind .2 | 30 | 100% |
| stelo.UntouchableNano 1.3 | 23 | 91% |
| agrach.Dalek 1.0 | 22 | 95% |
| skm.Ryubot 1.0 | 20 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 100% |
| lmk.ACPFinal 0.1 | 15 | 100% |
| mb.Beast 0.1 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 8 | 20% | 25 |
| mb.Beast 0.1 | 7 | 18% | 23 |
| agrach.Dalek 1.0 | 6 | 15% | 34 |
| germ.TheMind .2 | 6 | 15% | 33 |
| stelo.UntouchableNano 1.3 | 5 | 13% | 22 |
| EBBU.Sim2 1.02 | 3 | 8% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 5% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 5% | 8 |
| skm.Ryubot 1.0 | 1 | 3% | 6 |

## Melee bench: F38

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 71.1 | 61 / 210 | 3.60 | 14.9% | 25826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 15.6% | 70 |
| hadur117.mini.DeiseWA 0.2 | 2.0 | 14.9% | 61 |
| bvh.mini.Freya 0.55 | 3.3 | 13.2% | 27 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.7% | 27 |
| cs.Wren 1.0 | 5.0 | 10.9% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.5% | 4 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.1% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.2% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.1 | 8 / 35 | 4272 |
| 2 | 2 | 63.7 | 72.7 | 12 / 35 | 4415 |
| 3 | 3 | 63.0 | 74.0 | 7 / 35 | 4130 |
| 4 | 1 | 65.1 | 74.3 | 13 / 35 | 4869 |
| 5 | 2 | 59.2 | 61.9 | 9 / 35 | 3807 |
| 6 | 2 | 62.7 | 71.4 | 12 / 35 | 4333 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 25 | 68% |
| bts.mega.Gnarly 1.4 | 15 | 80% |
| cs.Wren 1.0 | 12 | 83% |
| bvh.mini.Freya 0.55 | 11 | 45% |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 89% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 40 | 27% | 64 |
| bvh.mini.Freya 0.55 | 34 | 23% | 38 |
| bts.mega.Gnarly 1.4 | 26 | 17% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 10% | 21 |
| cs.Wren 1.0 | 14 | 9% | 18 |
| kdf.KoulDestroyer 1.0 | 13 | 9% | 16 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 7 |
| bzdp.BoxCar 2.0 | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 3 |

## Melee bench: F39

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 77.2 | 64 / 210 | 3.05 | 16.5% | 31686 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.2 | 16.5% | 64 |
| bvh.fry.Freya 0.82 | 2.0 | 15.6% | 49 |
| az.Ololobot 0.2.4 | 2.8 | 13.1% | 56 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 8.9% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.3% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.2% | 1 |
| gimp.GimpBot 0.1 | 7.3 | 7.8% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 79.7 | 15 / 35 | 4870 |
| 2 | 1 | 65.9 | 77.5 | 10 / 35 | 5670 |
| 3 | 1 | 63.8 | 74.6 | 7 / 35 | 5105 |
| 4 | 2 | 64.5 | 76.2 | 9 / 35 | 5247 |
| 5 | 1 | 66.3 | 81.0 | 11 / 35 | 5593 |
| 6 | 1 | 64.4 | 74.3 | 12 / 35 | 5201 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 33 | 48% |
| bvh.fry.Freya 0.82 | 28 | 68% |
| catcat20.Lambda 0.024 | 20 | 70% |
| stelo.SoRobotNanoMelee 1.2 | 10 | 80% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 67 | 46% | 85 |
| az.Ololobot 0.2.4 | 32 | 22% | 48 |
| catcat20.Lambda 0.024 | 17 | 12% | 28 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 6% | 12 |
| apollokidd.ApolloKidd 0.9 | 9 | 6% | 11 |
| gimp.GimpBot 0.1 | 6 | 4% | 9 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 2% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.7 | 76 / 210 | 3.00 | 17.0% | 31120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.3 | 17.0% | 76 |
| kawigi.mini.Coriantumr 1.1 | 1.7 | 15.7% | 62 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 11.8% | 24 |
| mz.AntiGrav 1.0 | 5.0 | 10.4% | 10 |
| Polkwane.SmashMelee 1.0 | 5.3 | 10.0% | 13 |
| alpha.BlackIce 1.0 | 5.8 | 9.6% | 7 |
| stelo.Randomness 1.0 | 5.8 | 9.7% | 15 |
| amk.superstrike.SuperStrike 0.3 | 8.5 | 6.2% | 2 |
| testantiswapgun.AntiSwap 1.0 | 8.5 | 5.8% | 1 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.8 | 15 / 35 | 5620 |
| 2 | 2 | 63.2 | 71.1 | 10 / 35 | 4660 |
| 3 | 1 | 66.9 | 79.7 | 14 / 35 | 5369 |
| 4 | 2 | 61.8 | 67.3 | 7 / 35 | 4459 |
| 5 | 1 | 69.1 | 85.4 | 16 / 35 | 5955 |
| 6 | 1 | 66.0 | 79.0 | 14 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 58% |
| kano.gamma.KanoGamma 1.8 | 16 | 63% |
| mz.AntiGrav 1.0 | 12 | 100% |
| stelo.Randomness 1.0 | 11 | 82% |
| Polkwane.SmashMelee 1.0 | 8 | 75% |
| alpha.BlackIce 1.0 | 5 | 60% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 58 | 43% | 78 |
| kano.gamma.KanoGamma 1.8 | 23 | 17% | 38 |
| alpha.BlackIce 1.0 | 16 | 12% | 19 |
| Polkwane.SmashMelee 1.0 | 10 | 7% | 14 |
| mz.AntiGrav 1.0 | 9 | 7% | 23 |
| stelo.Randomness 1.0 | 9 | 7% | 22 |
| amk.superstrike.SuperStrike 0.3 | 5 | 4% | 6 |
| sample.Corners 1.0 | 3 | 2% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 6 |

## Melee bench: F41

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.6 | 69 / 210 | 3.01 | 16.5% | 29010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.3 | 16.5% | 69 |
| eem.EvBotNG v12.8 | 1.7 | 15.9% | 84 |
| ary.Swarm 1.1 | 3.5 | 13.4% | 21 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.7% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.4% | 13 |
| shrub.Silver v048 | 6.0 | 8.6% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.2% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 6.2% | 0 |
| stelo.Mirror 1.1 | 8.7 | 5.7% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 67.9 | 6 / 35 | 4644 |
| 2 | 1 | 67.3 | 82.2 | 14 / 35 | 5238 |
| 3 | 1 | 66.4 | 79.4 | 13 / 35 | 4824 |
| 4 | 2 | 64.9 | 75.9 | 11 / 35 | 4454 |
| 5 | 1 | 67.4 | 82.5 | 15 / 35 | 4849 |
| 6 | 1 | 65.6 | 77.8 | 10 / 35 | 5001 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 37 | 35% |
| ary.Swarm 1.1 | 26 | 77% |
| lessonz.robocode.Oz 0.5.0 | 19 | 95% |
| simonton.nano.MeleeSeed 1.8 | 18 | 72% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 38% | 72 |
| ary.Swarm 1.1 | 43 | 30% | 59 |
| simonton.nano.MeleeSeed 1.8 | 17 | 12% | 28 |
| lessonz.robocode.Oz 0.5.0 | 16 | 11% | 31 |
| shrub.Silver v048 | 4 | 3% | 7 |
| zyx.nano.Ant 1.1 | 4 | 3% | 6 |
| jsal.Jsalbot 1.0 | 1 | 1% | 4 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.3 | 63 / 210 | 3.40 | 16.1% | 32356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.3 | 16.7% | 73 |
| hadur117.mini.DeiseWA 0.2 | 1.7 | 16.1% | 63 |
| ara.Shera 0.88 | 3.2 | 13.6% | 37 |
| maribo.mini.MiniQuester 0.1 | 3.8 | 13.3% | 24 |
| amz.NanoClone 1.41 | 5.2 | 9.3% | 3 |
| dsw.StaticD 1.0 | 6.3 | 7.5% | 9 |
| maribo.IotaCT 1.1 | 6.7 | 7.0% | 1 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.8 | 5.5% | 0 |
| mme.NikeEnhanced 2.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 73.0 | 12 / 35 | 5635 |
| 2 | 2 | 63.2 | 68.9 | 8 / 35 | 5185 |
| 3 | 1 | 65.8 | 77.8 | 15 / 35 | 5169 |
| 4 | 1 | 65.1 | 74.6 | 10 / 35 | 5671 |
| 5 | 2 | 64.3 | 71.4 | 10 / 35 | 5393 |
| 6 | 2 | 64.7 | 74.3 | 8 / 35 | 5303 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 33 | 85% |
| ara.Shera 0.88 | 27 | 59% |
| maribo.mini.MiniQuester 0.1 | 22 | 77% |
| amz.NanoClone 1.41 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 0% |

Hadur died in 148 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 61 | 41% | 88 |
| ara.Shera 0.88 | 40 | 27% | 60 |
| maribo.mini.MiniQuester 0.1 | 26 | 18% | 37 |
| maribo.IotaCT 1.1 | 8 | 5% | 8 |
| amz.NanoClone 1.41 | 3 | 2% | 4 |
| dsw.StaticD 1.0 | 3 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 63.9 | 9 / 210 | 4.25 | 13.0% | 24183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 157 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.8% | 19 |
| hadur117.mini.DeiseWA 0.2 | 3.0 | 13.0% | 9 |
| dummy.micro.Sparrow 2.5 | 3.8 | 12.0% | 13 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.8% | 10 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.4% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.0 | 58.1 | 1 / 35 | 3743 |
| 2 | 3 | 62.2 | 66.3 | 2 / 35 | 4248 |
| 3 | 3 | 59.8 | 59.4 | 2 / 35 | 4070 |
| 4 | 4 | 60.7 | 64.1 | 1 / 35 | 4053 |
| 5 | 2 | 62.2 | 70.2 | 1 / 35 | 4000 |
| 6 | 2 | 62.0 | 65.4 | 2 / 35 | 4069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 39 | 5% |
| brainfade.melee.Dusk 0.44 | 6 | 17% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 40% | 86 |
| brainfade.melee.Dusk 0.44 | 30 | 15% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 28 | 14% | 29 |
| dummy.micro.Sparrow 2.5 | 27 | 13% | 28 |
| mz.NanoGod 2.02 | 15 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 11 | 5% | 11 |
| jab.DiamondStealer 5 | 6 | 3% | 6 |
| cvt.Firsty 1.0 | 3 | 1% | 3 |

## Melee bench: F44

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.3 | 87 / 210 | 2.68 | 18.1% | 34239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 18.1% | 87 |
| stelo.Liblix 0.3.1 | 2.3 | 15.4% | 64 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.3% | 36 |
| wompi.Quokka 1.6 | 4.7 | 9.9% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.7% | 5 |
| jwirde.Gort 2.0 | 5.8 | 8.8% | 6 |
| disan.Chair 2.2.0 | 6.5 | 8.3% | 6 |
| stf.PanzerGeneral 0.1 | 8.2 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 1 |
| sample.Crazy 1.0 | 9.7 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 80.3 | 15 / 35 | 5721 |
| 2 | 1 | 68.9 | 87.0 | 18 / 35 | 5666 |
| 3 | 1 | 66.4 | 77.1 | 13 / 35 | 5448 |
| 4 | 1 | 67.6 | 79.7 | 14 / 35 | 5753 |
| 5 | 1 | 69.0 | 86.0 | 17 / 35 | 5884 |
| 6 | 1 | 66.5 | 77.8 | 10 / 35 | 5767 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 56% |
| tzu.TheArtOfWar 1.2 | 38 | 71% |
| jwirde.Gort 2.0 | 8 | 88% |
| wompi.Quokka 1.6 | 6 | 100% |
| disan.Chair 2.2.0 | 6 | 67% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 60% |
| sample.Crazy 1.0 | 2 | 50% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 51 | 41% | 88 |
| tzu.TheArtOfWar 1.2 | 31 | 25% | 58 |
| wompi.Quokka 1.6 | 14 | 11% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 7% | 11 |
| disan.Chair 2.2.0 | 7 | 6% | 9 |
| jwirde.Gort 2.0 | 4 | 3% | 14 |
| amk.jointstrike.JointStrike 0.2 | 4 | 3% | 5 |
| stf.PanzerGeneral 0.1 | 3 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 2 |

## Melee bench: F45

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 81.7 | 86 / 210 | 2.65 | 19.1% | 38128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWA 0.2 | 1.0 | 19.1% | 86 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.6% | 100 |
| jje.BagPuss 1.2 | 2.8 | 11.9% | 7 |
| myl.nano.Graviton 1.10 | 4.2 | 10.4% | 3 |
| sul.Lunar 1.1 | 5.2 | 10.1% | 7 |
| hvilela.HVilela 0.9 | 6.5 | 8.7% | 1 |
| fm.claire 1.7 | 6.8 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.0% | 2 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 4 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 75.6 | 8 / 35 | 5639 |
| 2 | 1 | 66.7 | 77.8 | 10 / 35 | 5998 |
| 3 | 1 | 68.9 | 82.2 | 17 / 35 | 6372 |
| 4 | 1 | 69.1 | 82.2 | 18 / 35 | 6334 |
| 5 | 1 | 71.0 | 88.3 | 17 / 35 | 6892 |
| 6 | 1 | 70.2 | 84.1 | 16 / 35 | 6893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 90 | 38% |
| sul.Lunar 1.1 | 17 | 82% |
| myl.nano.Graviton 1.10 | 14 | 100% |
| jje.BagPuss 1.2 | 11 | 73% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1533. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 57 | 46% | 0 |
| jje.BagPuss 1.2 | 18 | 15% | 57 |
| hvilela.HVilela 0.9 | 14 | 11% | 20 |
| myl.nano.Graviton 1.10 | 9 | 7% | 27 |
| fm.claire 1.7 | 8 | 6% | 12 |
| sul.Lunar 1.1 | 7 | 6% | 60 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 6% | 17 |
| wit.Deep7 2.0 | 4 | 3% | 14 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseWA 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 73.3 | 41 / 210 | 3.40 | 15.2% | 28037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.5% | 70 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.8% | 80 |
| hadur117.mini.DeiseWA 0.2 | 3.0 | 15.2% | 41 |
| cx.Princess 1.0 | 4.3 | 10.4% | 16 |
| mz.MicroSheep 1.0 | 4.8 | 10.1% | 3 |
| sadoner.killer 0.2 | 5.8 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.3% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.5 | 73.3 | 4 / 35 | 5183 |
| 2 | 3 | 62.9 | 72.1 | 7 / 35 | 4264 |
| 3 | 3 | 65.0 | 77.8 | 8 / 35 | 4547 |
| 4 | 3 | 62.6 | 69.8 | 10 / 35 | 4395 |
| 5 | 3 | 64.9 | 74.3 | 7 / 35 | 5109 |
| 6 | 3 | 63.2 | 72.4 | 5 / 35 | 4539 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 32 | 69% |
| rsalesc.melee.Medina 0.4.5 | 23 | 39% |
| cx.Princess 1.0 | 6 | 67% |
| mz.MicroSheep 1.0 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 70 | 41% | 89 |
| rsalesc.melee.Medina 0.4.5 | 61 | 36% | 71 |
| mz.MicroSheep 1.0 | 9 | 5% | 13 |
| arthord.NanoSatanMelee Beta | 8 | 5% | 8 |
| cx.Princess 1.0 | 7 | 4% | 13 |
| sadoner.killer 0.2 | 7 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 5 | 3% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |

