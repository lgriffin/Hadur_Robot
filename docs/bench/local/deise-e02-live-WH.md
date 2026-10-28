# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 69.7 | 15 / 210 | 3.72 | 14.3% | 30395 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 163 |
| hadur117.mini.DeiseWH 0.2 | 2.0 | 14.3% | 15 |
| sgp.JollyNinja 3.53 | 3.8 | 11.5% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.4% | 6 |
| mz.MicroGodMelee 1 | 4.3 | 10.8% | 11 |
| lorneswork.Predator 1.0 | 6.0 | 9.2% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 6.0% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 67.3 | 4 / 35 | 5037 |
| 2 | 2 | 62.1 | 71.4 | 2 / 35 | 4722 |
| 3 | 2 | 62.5 | 68.6 | 2 / 35 | 5447 |
| 4 | 2 | 62.1 | 70.2 | 3 / 35 | 4652 |
| 5 | 2 | 61.9 | 69.5 | 2 / 35 | 5172 |
| 6 | 2 | 63.1 | 71.4 | 2 / 35 | 5365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 57 | 2% |
| sgp.JollyNinja 3.53 | 9 | 67% |
| mz.MicroGodMelee 1 | 5 | 0% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| lorneswork.Predator 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 642. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 110 | 56% | 112 |
| mz.MicroGodMelee 1 | 28 | 14% | 28 |
| simonton.nano.WeekendObsession_Melee 1.0 | 23 | 12% | 27 |
| sgp.JollyNinja 3.53 | 11 | 6% | 18 |
| adt.Ar2 1.0 | 9 | 5% | 10 |
| lorneswork.Predator 1.0 | 7 | 4% | 9 |
| kawigi.sbf.FloodSonnet 0.9 | 5 | 3% | 4 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 68.0 | 20 / 210 | 3.88 | 14.8% | 32006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.2 | 15.9% | 82 |
| hadur117.mini.DeiseWH 0.2 | 2.0 | 14.8% | 20 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.9% | 51 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.2 | 10.6% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 9.8% | 0 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 8.4% | 5 |
| Noran.BitchingElk 0.054 | 6.8 | 8.0% | 13 |
| sch.Simone 0.3d | 7.5 | 7.8% | 12 |
| stelo.PatternRobot 1.0 | 8.7 | 6.3% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 65.4 | 4 / 35 | 5070 |
| 2 | 2 | 61.7 | 67.0 | 2 / 35 | 5451 |
| 3 | 2 | 62.5 | 68.9 | 5 / 35 | 5232 |
| 4 | 2 | 62.2 | 66.3 | 4 / 35 | 5416 |
| 5 | 2 | 62.2 | 68.6 | 2 / 35 | 5225 |
| 6 | 1 | 63.6 | 71.7 | 3 / 35 | 5612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 16% |
| pulsar.PulsarMax 0.8.9 | 20 | 15% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 36% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| Noran.BitchingElk 0.054 | 5 | 20% |
| lrem.micro.SpikeSoldier 0.4 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 764. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 58 | 31% | 64 |
| pulsar.PulsarMax 0.8.9 | 52 | 27% | 59 |
| com.cohesiva.robocode.ManOwaR 1.0 | 29 | 15% | 33 |
| fnc.bandit.Bandit 5.2.0 | 12 | 6% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 6% | 12 |
| sch.Simone 0.3d | 11 | 6% | 11 |
| Noran.BitchingElk 0.054 | 9 | 5% | 6 |
| stelo.PatternRobot 1.0 | 7 | 4% | 9 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.0 | 82 / 210 | 2.44 | 18.1% | 37659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.2 | 18.1% | 82 |
| radnor.DoctorBob 1.42 | 1.8 | 15.5% | 76 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.1% | 19 |
| vuen.Cake 2.51 | 3.8 | 11.9% | 25 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 5 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.3% | 1 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.0% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 75.9 | 8 / 35 | 5518 |
| 2 | 1 | 68.5 | 87.6 | 14 / 35 | 6422 |
| 3 | 1 | 68.5 | 84.8 | 15 / 35 | 6542 |
| 4 | 1 | 68.6 | 86.0 | 18 / 35 | 6366 |
| 5 | 1 | 66.6 | 82.2 | 12 / 35 | 6055 |
| 6 | 1 | 68.6 | 87.6 | 15 / 35 | 6756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 42 | 31% |
| kawigi.nano.Lib 1.0 | 36 | 94% |
| vuen.Cake 2.51 | 28 | 54% |
| adt.Ar1 2.1 | 6 | 100% |
| urdos.URDOS 1.3 | 6 | 33% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 675. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 78 | 61% | 93 |
| vuen.Cake 2.51 | 22 | 17% | 42 |
| urdos.URDOS 1.3 | 14 | 11% | 18 |
| kawigi.nano.Lib 1.0 | 9 | 7% | 34 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 6 |
| adt.Ar1 2.1 | 1 | 1% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 1% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 65.6 | 1 / 210 | 4.10 | 13.7% | 30876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 196 |
| hadur117.mini.DeiseWH 0.2 | 2.3 | 13.7% | 1 |
| apc.LeeroyJenkins2 1.0 | 2.7 | 13.4% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 11.7% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.9% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.8% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 1 |
| rampancy.Durandal 2.1d | 8.2 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.0% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.6 | 66.0 | 0 / 35 | 4761 |
| 2 | 2 | 61.6 | 66.3 | 0 / 35 | 4863 |
| 3 | 3 | 60.3 | 61.9 | 0 / 35 | 4800 |
| 4 | 2 | 62.7 | 64.4 | 0 / 35 | 5667 |
| 5 | 2 | 62.9 | 67.0 | 0 / 35 | 5279 |
| 6 | 2 | 63.0 | 67.6 | 1 / 35 | 5506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 33 | 0% |
| TNT.TNT 0.99.1 | 2 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 209 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 59% | 124 |
| josago.Jorgito 0.16 | 26 | 12% | 26 |
| apc.LeeroyJenkins2 1.0 | 26 | 12% | 26 |
| TNT.TNT 0.99.1 | 23 | 11% | 23 |
| css.Delitioner 0.11 | 8 | 4% | 8 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.8 | 52.6 | 1 / 210 | 5.26 | 10.5% | 21209 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.8% | 136 |
| justin.DemonicRage 3.4 | 2.0 | 17.2% | 44 |
| wompi.Numbat 2.1 | 3.0 | 13.5% | 19 |
| hadur117.mini.DeiseWH 0.2 | 4.3 | 10.5% | 1 |
| ms.Ares 0.19 | 5.0 | 9.5% | 0 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 10 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.5 | 54.3 | 0 / 35 | 3779 |
| 2 | 4 | 54.6 | 52.1 | 0 / 35 | 3455 |
| 3 | 4 | 56.5 | 55.9 | 1 / 35 | 3839 |
| 4 | 5 | 53.5 | 50.5 | 0 / 35 | 3160 |
| 5 | 4 | 55.7 | 54.6 | 0 / 35 | 3708 |
| 6 | 5 | 53.1 | 48.6 | 0 / 35 | 3268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 4 | 0% |
| cb.fire.Firestarter 2.0f | 2 | 0% |
| wompi.Numbat 2.1 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 209 of 210 rounds, at a mean tick of 474. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 65 | 31% | 65 |
| justin.DemonicRage 3.4 | 61 | 29% | 61 |
| wompi.Numbat 2.1 | 37 | 18% | 37 |
| ms.Ares 0.19 | 14 | 7% | 14 |
| axeBots.HataMoto 3.09 | 12 | 6% | 13 |
| supersample.SuperBoxBot 1.0 | 12 | 6% | 12 |
| GarmBox.Oranges 1.0 | 3 | 1% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 67.7 | 29 / 210 | 3.90 | 14.3% | 28385 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 1.7 | 15.3% | 92 |
| jekl.StoneGhost 0.7 | 2.0 | 15.1% | 41 |
| hadur117.mini.DeiseWH 0.2 | 2.5 | 14.3% | 29 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.8% | 15 |
| mld.Wisdom 1.0 | 5.3 | 10.9% | 8 |
| gg.Wolverine 2.0 | 5.5 | 9.6% | 10 |
| DBall.NUKE 0.1 | 7.7 | 6.8% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.9% | 15 |
| spinnercat.Omen 1.0 | 8.5 | 6.5% | 0 |
| sample.Fire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 68.9 | 5 / 35 | 4989 |
| 2 | 3 | 59.6 | 64.4 | 1 / 35 | 4409 |
| 3 | 2 | 64.3 | 74.3 | 5 / 35 | 5077 |
| 4 | 2 | 63.2 | 68.9 | 8 / 35 | 5297 |
| 5 | 4 | 57.8 | 59.4 | 4 / 35 | 4168 |
| 6 | 2 | 62.6 | 70.5 | 6 / 35 | 4445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 26 | 54% |
| origin.SleepSiphon 1.7b | 21 | 0% |
| pe.minimelee.SandboxMiniMelee 1.1 | 10 | 80% |
| mld.Wisdom 1.0 | 4 | 75% |
| gg.Wolverine 2.0 | 3 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 0% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 600. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 70 | 39% | 72 |
| jekl.StoneGhost 0.7 | 44 | 24% | 57 |
| mld.Wisdom 1.0 | 17 | 9% | 21 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 8% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 14 | 8% | 14 |
| gg.Wolverine 2.0 | 9 | 5% | 12 |
| spinnercat.Omen 1.0 | 8 | 4% | 10 |
| DBall.NUKE 0.1 | 5 | 3% | 5 |

## Melee bench: F07

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.3 | 42 / 210 | 2.86 | 17.2% | 37601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.0 | 18.9% | 83 |
| hadur117.mini.DeiseWH 0.2 | 2.3 | 17.2% | 42 |
| rtk.Tachikoma 1.0 | 2.7 | 16.6% | 59 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.0% | 4 |
| franzor.Lizt 1.3.1 | 4.5 | 11.3% | 23 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.5 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 67.0 | 76.5 | 4 / 35 | 6068 |
| 2 | 2 | 67.1 | 75.2 | 6 / 35 | 6361 |
| 3 | 3 | 67.8 | 77.8 | 6 / 35 | 6399 |
| 4 | 2 | 67.9 | 80.6 | 4 / 35 | 6258 |
| 5 | 2 | 69.8 | 85.1 | 13 / 35 | 6414 |
| 6 | 2 | 68.1 | 80.6 | 9 / 35 | 6101 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 46 | 46% |
| rsalesc.melee.Monk 0.3.6c | 30 | 17% |
| oog.melee.CapuletDroid 1.1 | 12 | 92% |
| franzor.Lizt 1.3.1 | 8 | 50% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 79 | 47% | 87 |
| rtk.Tachikoma 1.0 | 54 | 32% | 73 |
| franzor.Lizt 1.3.1 | 25 | 15% | 27 |
| exauge.GateKeeper 1.1.121g | 5 | 3% | 6 |
| oog.melee.CapuletDroid 1.1 | 4 | 2% | 15 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 75.1 | 40 / 210 | 3.24 | 16.0% | 31410 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 16.0% | 40 |
| tm.Yuugao 1.0 | 2.7 | 13.3% | 52 |
| shrub.Vapour v159 | 2.7 | 13.0% | 47 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 11.4% | 26 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.8% | 27 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 8.4% | 12 |
| m3thos.Eva00 1.1 | 6.7 | 8.0% | 2 |
| SHAM.WOW 1.4 | 7.8 | 7.1% | 4 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.0 | 7 / 35 | 5635 |
| 2 | 1 | 62.0 | 71.1 | 5 / 35 | 4977 |
| 3 | 1 | 63.7 | 76.2 | 8 / 35 | 4999 |
| 4 | 1 | 63.1 | 70.5 | 5 / 35 | 5429 |
| 5 | 1 | 64.5 | 76.5 | 8 / 35 | 5262 |
| 6 | 1 | 64.2 | 76.5 | 7 / 35 | 5108 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 28 | 29% |
| tm.Yuugao 1.0 | 28 | 29% |
| Krabb.sliNk.Garm 0.9u | 19 | 42% |
| com.spp.robocode.MostlyHarmless 010 | 12 | 33% |
| jwst.DAD.DarkAndDarker 1.1 | 7 | 43% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 4 | 75% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 49 | 29% | 62 |
| tm.Yuugao 1.0 | 44 | 26% | 52 |
| Krabb.sliNk.Garm 0.9u | 30 | 18% | 36 |
| com.spp.robocode.MostlyHarmless 010 | 28 | 16% | 36 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 4% | 7 |
| m3thos.Eva00 1.1 | 4 | 2% | 5 |
| zyx.nano.BacillusComma 1.0 | 4 | 2% | 4 |
| SHAM.WOW 1.4 | 3 | 2% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 1% | 2 |

## Melee bench: F09

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 56.0 | 3 / 210 | 4.96 | 11.6% | 23473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.3% | 123 |
| kc.micro.Figment 1.0 | 2.0 | 14.8% | 39 |
| hadur117.mini.DeiseWH 0.2 | 3.7 | 11.6% | 3 |
| pedersen.Grishnakh 1.0 | 4.0 | 11.4% | 20 |
| mc2.enemy.Original 0.9 | 5.2 | 9.8% | 20 |
| yagami.Tidus 0.11 | 5.3 | 10.3% | 1 |
| dft.Calliope 5.6 | 6.8 | 7.5% | 3 |
| step.nanoPri 1.0 | 8.3 | 6.0% | 1 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.6 | 55.9 | 1 / 35 | 4198 |
| 2 | 4 | 55.6 | 55.6 | 1 / 35 | 3658 |
| 3 | 4 | 56.3 | 56.8 | 0 / 35 | 3764 |
| 4 | 4 | 56.3 | 55.2 | 0 / 35 | 4177 |
| 5 | 3 | 56.5 | 56.8 | 0 / 35 | 3905 |
| 6 | 3 | 56.4 | 55.9 | 1 / 35 | 3771 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 8 | 0% |
| kc.micro.Figment 1.0 | 7 | 0% |
| mc2.enemy.Original 0.9 | 4 | 0% |
| pedersen.Grishnakh 1.0 | 3 | 0% |
| dft.Calliope 5.6 | 1 | 100% |
| yagami.Tidus 0.11 | 1 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 67 | 32% | 67 |
| kc.micro.Figment 1.0 | 66 | 32% | 66 |
| pedersen.Grishnakh 1.0 | 26 | 13% | 26 |
| mc2.enemy.Original 0.9 | 18 | 9% | 19 |
| yagami.Tidus 0.11 | 18 | 9% | 18 |
| robar.nano.Assertive_Melee 0.2 | 4 | 2% | 4 |
| dft.Calliope 5.6 | 3 | 1% | 5 |
| step.nanoPri 1.0 | 3 | 1% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.4 | 58 / 210 | 2.94 | 16.5% | 33894 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.2 | 16.5% | 58 |
| DTF.Kludgy 1.2b | 1.8 | 15.9% | 66 |
| ne.Chimera 1.2 | 3.5 | 13.3% | 24 |
| ejb.Polaris 1.0.1 | 3.7 | 13.3% | 41 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.2% | 13 |
| vStar.RAFzilla 2.15 | 5.7 | 10.1% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.6% | 0 |
| kurios.DOSexe .9b | 7.8 | 5.6% | 2 |
| sam.Samspin 1.0 | 9.0 | 4.9% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 78.1 | 10 / 35 | 5749 |
| 2 | 1 | 65.6 | 79.0 | 9 / 35 | 5496 |
| 3 | 1 | 64.6 | 75.2 | 9 / 35 | 5518 |
| 4 | 1 | 66.8 | 83.8 | 13 / 35 | 5453 |
| 5 | 2 | 64.1 | 73.7 | 6 / 35 | 5601 |
| 6 | 1 | 66.8 | 80.6 | 11 / 35 | 6077 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 34 | 32% |
| ne.Chimera 1.2 | 26 | 54% |
| ejb.Polaris 1.0.1 | 21 | 29% |
| vStar.RAFzilla 2.15 | 12 | 100% |
| tvv.micro.Antares 1.1.1 | 10 | 80% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 3 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 59 | 39% | 72 |
| ejb.Polaris 1.0.1 | 38 | 25% | 47 |
| ne.Chimera 1.2 | 33 | 22% | 47 |
| tvv.micro.Antares 1.1.1 | 10 | 7% | 15 |
| vStar.RAFzilla 2.15 | 4 | 3% | 15 |
| kurios.DOSexe .9b | 4 | 3% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |
| sam.Samspin 1.0 | 2 | 1% | 2 |
| donjezza.Muncho 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 66.3 | 29 / 210 | 4.03 | 14.1% | 27771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.9% | 104 |
| hadur117.mini.DeiseWH 0.2 | 2.2 | 14.1% | 29 |
| cx.mini.Nimrod 0.55 | 2.8 | 13.5% | 33 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 17 |
| rdt199.Warlord 0.73 | 5.7 | 9.0% | 12 |
| br2.MobyDickBot 1.6 | 6.0 | 8.8% | 9 |
| uji.YellohFellah 1.0 | 6.8 | 8.2% | 7 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.2% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.0% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 67.3 | 4 / 35 | 4787 |
| 2 | 2 | 62.8 | 70.2 | 7 / 35 | 4751 |
| 3 | 3 | 58.3 | 60.0 | 2 / 35 | 4171 |
| 4 | 2 | 62.2 | 69.2 | 7 / 35 | 4630 |
| 5 | 2 | 62.9 | 69.5 | 5 / 35 | 5045 |
| 6 | 2 | 59.1 | 61.6 | 4 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 31 | 29% |
| djc.DynaBot 0.1.1 | 10 | 80% |
| cx.mini.Nimrod 0.55 | 6 | 33% |
| rdt199.Warlord 0.73 | 5 | 80% |
| uji.YellohFellah 1.0 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |
| br2.MobyDickBot 1.6 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 92 | 51% | 101 |
| cx.mini.Nimrod 0.55 | 38 | 21% | 41 |
| djc.DynaBot 0.1.1 | 16 | 9% | 26 |
| rdt199.Warlord 0.73 | 15 | 8% | 18 |
| KiraNL.Chupacabra 0.4 | 6 | 3% | 7 |
| uji.YellohFellah 1.0 | 5 | 3% | 6 |
| br2.MobyDickBot 1.6 | 4 | 2% | 6 |
| stelo.MirrorNano 1.3 | 3 | 2% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 2 |

## Melee bench: F12

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 63.7 | 21 / 210 | 4.27 | 13.2% | 24530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.4% | 54 |
| darkcanuck.Leon 1.01 | 2.0 | 14.5% | 58 |
| nat.PallasHawk 1.0 | 2.8 | 13.8% | 59 |
| hadur117.mini.DeiseWH 0.2 | 3.3 | 13.2% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 14 |
| jrm.Test0 1.0 | 6.2 | 8.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.1% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.5% | 1 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 3 |
| stuff.Vlad 0.1 | 9.0 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.9 | 61.9 | 2 / 35 | 3832 |
| 2 | 3 | 60.7 | 69.8 | 4 / 35 | 3958 |
| 3 | 3 | 59.2 | 63.2 | 3 / 35 | 4095 |
| 4 | 2 | 61.5 | 66.7 | 5 / 35 | 4569 |
| 5 | 4 | 57.7 | 59.0 | 3 / 35 | 3965 |
| 6 | 4 | 58.6 | 61.3 | 4 / 35 | 4111 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 22 | 14% |
| bts.wiki.RipCurl 0.9b | 16 | 50% |
| nat.PallasHawk 1.0 | 14 | 29% |
| jrm.Test0 1.0 | 3 | 100% |
| brainfade.melee.Genghis 0.36 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 190 of 210 rounds, at a mean tick of 547. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 62 | 33% | 66 |
| nat.PallasHawk 1.0 | 38 | 20% | 43 |
| bts.wiki.RipCurl 0.9b | 28 | 15% | 35 |
| brainfade.melee.Genghis 0.36 | 21 | 11% | 21 |
| jrm.Test0 1.0 | 17 | 9% | 19 |
| cs.sheldor.Talon 1.1 | 9 | 5% | 8 |
| stuff.Vlad 0.1 | 7 | 4% | 7 |
| jaybot.bots.Oddball 4.0 | 4 | 2% | 7 |
| jp.Perpy 16.0 | 4 | 2% | 4 |

## Melee bench: F13

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.5 | 56.7 | 2 / 210 | 4.90 | 11.2% | 22668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 18.9% | 124 |
| ags.Glacier 0.2.11 | 1.8 | 17.1% | 46 |
| shinh.Entangled 0.3 | 3.2 | 12.6% | 25 |
| gh.micro.Gruweltje 0.7 | 3.8 | 12.2% | 11 |
| hadur117.mini.DeiseWH 0.2 | 5.0 | 11.2% | 2 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 2 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.4 | 57.1 | 1 / 35 | 4060 |
| 2 | 5 | 55.9 | 53.3 | 0 / 35 | 3842 |
| 3 | 5 | 54.9 | 53.7 | 1 / 35 | 3415 |
| 4 | 5 | 58.0 | 59.0 | 0 / 35 | 4118 |
| 5 | 5 | 55.9 | 58.4 | 0 / 35 | 3472 |
| 6 | 5 | 56.7 | 58.4 | 0 / 35 | 3761 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 8 | 13% |
| mn.Combat 3.25.0 | 7 | 14% |

Hadur died in 208 of 210 rounds, at a mean tick of 449. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 71 | 34% | 71 |
| ags.Glacier 0.2.11 | 61 | 29% | 63 |
| shinh.Entangled 0.3 | 32 | 15% | 32 |
| gh.micro.Gruweltje 0.7 | 24 | 12% | 24 |
| stelo.Wang 1.0 | 9 | 4% | 9 |
| apc.Colossus2 0.17 | 5 | 2% | 5 |
| maribo.FollowFire 1 | 5 | 2% | 5 |
| ayk.WallHugger 1.0 | 1 | 0% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 80.1 | 69 / 210 | 2.80 | 17.2% | 34339 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.3 | 17.2% | 69 |
| simonton.micro.Sprout 1.1.3 | 1.7 | 16.1% | 66 |
| catcat20.shape.Theta 0.018 | 3.0 | 13.1% | 54 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 10.4% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.6% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.1% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.2 | 9.0% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.5% | 5 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.1 | 15 / 35 | 5999 |
| 2 | 1 | 67.0 | 80.6 | 13 / 35 | 5753 |
| 3 | 2 | 64.7 | 73.3 | 9 / 35 | 5538 |
| 4 | 1 | 67.8 | 84.4 | 10 / 35 | 5926 |
| 5 | 2 | 65.4 | 77.1 | 9 / 35 | 5525 |
| 6 | 1 | 65.9 | 79.7 | 13 / 35 | 5598 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 54 | 41% |
| catcat20.shape.Theta 0.018 | 31 | 48% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 60% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 82% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 66 | 47% | 90 |
| catcat20.shape.Theta 0.018 | 39 | 28% | 53 |
| sanyi.mikrobi.Roberto 1.0 | 11 | 8% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 9 | 6% | 17 |
| Lo_Ian.Gandalf_V4 4.0 | 6 | 4% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 4% | 7 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 3% | 11 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 75.4 | 73 / 210 | 3.21 | 17.0% | 34561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 17.0% | 73 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.6% | 27 |
| emp.Yngwie 1.11 | 3.0 | 13.6% | 66 |
| mld.DustBunny 3.8 | 3.5 | 13.0% | 18 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.5% | 17 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.7% | 4 |
| lambdaxy.TBot 0.1 | 7.7 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.6% | 0 |
| divineomega.TrialBot 0.003 | 8.5 | 5.7% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 74.3 | 11 / 35 | 5507 |
| 2 | 1 | 66.5 | 79.4 | 8 / 35 | 5811 |
| 3 | 1 | 65.2 | 74.0 | 12 / 35 | 5545 |
| 4 | 1 | 63.7 | 68.9 | 12 / 35 | 5342 |
| 5 | 1 | 68.9 | 82.5 | 14 / 35 | 6737 |
| 6 | 1 | 65.9 | 73.3 | 16 / 35 | 5619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 31 | 35% |
| kawigi.micro.Shiz 1.1 | 22 | 95% |
| mld.DustBunny 3.8 | 19 | 84% |
| cb.nano.Insomnia 1.0 | 13 | 100% |
| kawigi.robot.Girl 1.2 | 13 | 69% |
| divineomega.TrialBot 0.003 | 3 | 67% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 55 | 40% | 76 |
| kawigi.robot.Girl 1.2 | 18 | 13% | 25 |
| kawigi.micro.Shiz 1.1 | 17 | 12% | 38 |
| mld.DustBunny 3.8 | 16 | 12% | 26 |
| divineomega.TrialBot 0.003 | 11 | 8% | 21 |
| Grystrion.TrackerWO 1.0 | 8 | 6% | 10 |
| cb.nano.Insomnia 1.0 | 8 | 6% | 10 |
| lambdaxy.TBot 0.1 | 3 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 66.7 | 26 / 210 | 4.00 | 14.7% | 31523 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.0 | 18.2% | 100 |
| hadur117.mini.DeiseWH 0.2 | 2.5 | 14.7% | 26 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.7 | 14.0% | 12 |
| techdude.forest.FlamingForest 1.1 | 3.8 | 12.0% | 55 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.1% | 2 |
| tvv.nano.Polaris 1.2 | 5.7 | 9.3% | 9 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.5% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 4.6% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 63.5 | 3 / 35 | 5165 |
| 2 | 2 | 62.1 | 68.3 | 4 / 35 | 4844 |
| 3 | 2 | 66.1 | 76.2 | 7 / 35 | 5649 |
| 4 | 2 | 64.5 | 70.8 | 6 / 35 | 5604 |
| 5 | 2 | 63.1 | 67.3 | 3 / 35 | 5649 |
| 6 | 4 | 58.1 | 54.3 | 3 / 35 | 4612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 43 | 21% |
| techdude.forest.FlamingForest 1.1 | 15 | 27% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 89% |
| tvv.nano.Polaris 1.2 | 4 | 50% |
| bvh.fnr.Fenrir 0.36l | 2 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 93 | 51% | 105 |
| techdude.forest.FlamingForest 1.1 | 37 | 20% | 40 |
| tvv.nano.Polaris 1.2 | 12 | 7% | 16 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 11 | 6% | 13 |
| bvh.fnr.Fenrir 0.36l | 10 | 5% | 13 |
| stelo.IntrinsicVolatility 1.4 | 8 | 4% | 11 |
| divineomega.DivineBot 1.9.4.5 | 8 | 4% | 8 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 2 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.1 | 54.8 | 23 / 210 | 5.07 | 12.3% | 28345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.5 | 14.0% | 37 |
| cx.BlestPain 1.41 | 2.7 | 13.2% | 62 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.9% | 42 |
| hadur117.mini.DeiseWH 0.2 | 3.5 | 12.3% | 23 |
| nic.Nicator 2.4 | 5.0 | 11.3% | 13 |
| ahf.NanoAndrew .4 | 5.3 | 11.3% | 24 |
| maribo.melee.BMV 0.1 | 6.8 | 9.2% | 4 |
| tex.Longbot 0.4 | 8.2 | 6.7% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 6.1% | 1 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.1 | 55.6 | 5 / 35 | 5052 |
| 2 | 1 | 61.4 | 66.7 | 5 / 35 | 4911 |
| 3 | 4 | 56.3 | 51.4 | 2 / 35 | 4960 |
| 4 | 4 | 56.2 | 53.3 | 4 / 35 | 4478 |
| 5 | 1 | 60.3 | 62.2 | 6 / 35 | 4980 |
| 6 | 7 | 49.5 | 39.4 | 1 / 35 | 3964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 17 | 59% |
| ahf.NanoAndrew .4 | 10 | 50% |
| oog.melee.Mercutio 1.0 | 8 | 75% |
| cx.BlestPain 1.41 | 7 | 0% |
| nic.Nicator 2.4 | 3 | 0% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 0% |

Hadur died in 187 of 210 rounds, at a mean tick of 545. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 35 | 19% | 44 |
| ahf.NanoAndrew .4 | 35 | 19% | 41 |
| cx.BlestPain 1.41 | 31 | 17% | 32 |
| oog.melee.Mercutio 1.0 | 28 | 15% | 34 |
| nic.Nicator 2.4 | 21 | 11% | 21 |
| maribo.melee.BMV 0.1 | 19 | 10% | 21 |
| tex.Longbot 0.4 | 12 | 6% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 2% | 3 |
| goblin.Bender 2.4 | 3 | 2% | 2 |

## Melee bench: F18

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 65.9 | 28 / 210 | 4.07 | 14.2% | 29859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.5 | 14.2% | 28 |
| morbid.MorbidPriest 1.0 | 1.5 | 14.3% | 60 |
| uji.DBH 1.1 | 3.5 | 12.6% | 31 |
| agd.Mooserwirt2 2.7 | 3.5 | 12.9% | 50 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.9% | 13 |
| ratosh.Nobo 0.21 | 5.8 | 9.6% | 9 |
| sigterm.Sigterm 1.0 | 7.0 | 8.0% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.5 | 7.5% | 4 |
| stelo.WangRobot 1.0 | 9.0 | 5.9% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 69.8 | 4 / 35 | 4892 |
| 2 | 1 | 58.9 | 60.0 | 6 / 35 | 4805 |
| 3 | 2 | 60.7 | 65.1 | 3 / 35 | 5168 |
| 4 | 2 | 59.7 | 62.5 | 2 / 35 | 5002 |
| 5 | 2 | 60.4 | 65.4 | 5 / 35 | 4805 |
| 6 | 1 | 63.6 | 72.4 | 8 / 35 | 5187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 26 | 35% |
| agd.Mooserwirt2 2.7 | 12 | 42% |
| uji.DBH 1.1 | 12 | 17% |
| spinnercat.Robovirus 2.718 | 7 | 29% |
| stelo.WangRobot 1.0 | 6 | 83% |
| ratosh.Nobo 0.21 | 4 | 50% |
| sigterm.Sigterm 1.0 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 0% |

Hadur died in 182 of 210 rounds, at a mean tick of 579. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 54 | 30% | 56 |
| morbid.MorbidPriest 1.0 | 41 | 23% | 50 |
| agd.Mooserwirt2 2.7 | 37 | 20% | 45 |
| spinnercat.Robovirus 2.718 | 17 | 9% | 20 |
| ratosh.Nobo 0.21 | 11 | 6% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 5% | 9 |
| stelo.WangRobot 1.0 | 5 | 3% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 2% | 5 |
| sigterm.Sigterm 1.0 | 4 | 2% | 5 |

## Melee bench: F19

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 92.4 | 162 / 210 | 1.68 | 21.0% | 37230 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 21.0% | 162 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.7% | 19 |
| mld.Infinity 2.2 | 3.0 | 12.6% | 14 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.8% | 5 |
| erdnis.Rover 0.3 | 4.8 | 10.3% | 4 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.3% | 3 |
| mbh.Mbh 0.1 | 7.7 | 7.2% | 0 |
| pac.ABC 2.1 | 7.7 | 7.0% | 2 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 2 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.4 | 25 / 35 | 6176 |
| 2 | 1 | 70.8 | 91.1 | 24 / 35 | 5894 |
| 3 | 1 | 72.0 | 90.2 | 27 / 35 | 6325 |
| 4 | 1 | 71.6 | 92.1 | 27 / 35 | 6206 |
| 5 | 1 | 73.0 | 97.8 | 31 / 35 | 6256 |
| 6 | 1 | 72.2 | 92.1 | 28 / 35 | 6373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 89 | 91% |
| mld.Infinity 2.2 | 39 | 92% |
| krillr.mini.JointStrike 2.0.0 | 17 | 94% |
| patson.PatsonTestBot 1.0 | 11 | 82% |
| erdnis.Rover 0.3 | 11 | 91% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 17 | 34% | 75 |
| mld.Infinity 2.2 | 7 | 14% | 60 |
| patson.PatsonTestBot 1.0 | 7 | 14% | 19 |
| erdnis.Rover 0.3 | 7 | 14% | 16 |
| krillr.mini.JointStrike 2.0.0 | 6 | 12% | 18 |
| pac.ABC 2.1 | 2 | 4% | 9 |
| mbh.Mbh 0.1 | 2 | 4% | 6 |
| pbg.R2D2 1.0 | 1 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 79.7 | 64 / 210 | 2.82 | 18.0% | 38276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.3 | 18.0% | 64 |
| trm.Wrekt 1.1.6.f | 1.7 | 16.7% | 79 |
| catcat20.Rabbit 0.001 | 3.5 | 11.3% | 28 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.7% | 10 |
| fwb.Nine 1.0.1 | 4.3 | 10.8% | 17 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.4% | 4 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.9% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 7.1% | 2 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.2% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 75.9 | 10 / 35 | 6151 |
| 2 | 1 | 68.5 | 82.2 | 13 / 35 | 6710 |
| 3 | 1 | 68.3 | 81.0 | 11 / 35 | 6530 |
| 4 | 1 | 69.1 | 83.8 | 14 / 35 | 6777 |
| 5 | 2 | 66.8 | 77.1 | 8 / 35 | 6105 |
| 6 | 2 | 66.7 | 78.4 | 8 / 35 | 6003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 59 | 36% |
| fwb.Nine 1.0.1 | 20 | 75% |
| catcat20.Rabbit 0.001 | 19 | 58% |
| nz.jdc.nano.GridFu 1.0 | 9 | 67% |
| bayen.nut.Squirrel 1.615 | 6 | 67% |
| m3thos.mini.Eva01 0.5.5 | 4 | 75% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 55% | 97 |
| catcat20.Rabbit 0.001 | 25 | 17% | 46 |
| nz.jdc.nano.GridFu 1.0 | 13 | 9% | 19 |
| fwb.Nine 1.0.1 | 8 | 5% | 14 |
| m3thos.mini.Eva01 0.5.5 | 7 | 5% | 13 |
| djdjdj.NanoSkunk10 1.0 | 5 | 3% | 7 |
| bayen.nut.Squirrel 1.615 | 5 | 3% | 7 |
| ntc.ControlledChaos 1.1.4 | 2 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |

## Melee bench: F21

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.8 | 60 / 210 | 2.46 | 18.4% | 37432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.2 | 18.4% | 60 |
| eem.EvBot v4.6.16 | 1.8 | 17.6% | 113 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.3% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 12.2% | 14 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 9 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.7% | 5 |
| fire219.CatBot 1.0 | 7.7 | 5.8% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.9% | 1 |
| PSW.Relentless 0.1 | 9.2 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 81.3 | 10 / 35 | 6048 |
| 2 | 2 | 68.0 | 84.1 | 10 / 35 | 5822 |
| 3 | 1 | 69.0 | 84.8 | 12 / 35 | 6296 |
| 4 | 1 | 68.9 | 82.5 | 9 / 35 | 6896 |
| 5 | 1 | 67.8 | 84.1 | 8 / 35 | 6162 |
| 6 | 1 | 68.9 | 85.7 | 11 / 35 | 6208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 75 | 28% |
| dummy.mini.Scimitar 1.01 | 18 | 83% |
| cf.RiO.RiOx 4.2.1 | 17 | 88% |
| oa.weak.BotherBot 0.1 | 7 | 43% |
| eld.Hmm 1.0 | 5 | 80% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 97 | 64% | 124 |
| cf.RiO.RiOx 4.2.1 | 21 | 14% | 29 |
| dummy.mini.Scimitar 1.01 | 19 | 13% | 28 |
| oa.weak.BotherBot 0.1 | 8 | 5% | 12 |
| eld.Hmm 1.0 | 5 | 3% | 15 |
| arthord.MannyPacquiao Beta | 1 | 1% | 2 |

## Melee bench: F22

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.7 | 19 / 210 | 3.82 | 14.4% | 30521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.2 | 17.9% | 105 |
| hadur117.mini.DeiseWH 0.2 | 2.5 | 14.4% | 19 |
| kvk.HebusLeTroll 0.35 | 2.5 | 15.1% | 38 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 28 |
| bigpete.Stewie 1.0 | 4.8 | 11.5% | 15 |
| tad.Dalek98 0.98 | 6.8 | 7.2% | 2 |
| gg.Squaraus 0.6 | 7.2 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.7% | 2 |
| pbg.NinjaX 1.2 | 8.7 | 5.2% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 68.3 | 2 / 35 | 4998 |
| 2 | 3 | 61.7 | 63.8 | 3 / 35 | 5002 |
| 3 | 3 | 63.9 | 72.1 | 4 / 35 | 5182 |
| 4 | 2 | 61.6 | 68.6 | 1 / 35 | 4841 |
| 5 | 3 | 62.3 | 67.0 | 4 / 35 | 5148 |
| 6 | 2 | 63.9 | 72.4 | 5 / 35 | 5350 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 18 | 67% |
| pe.SandboxDT 2.71m | 16 | 6% |
| jlm.javaDisturbance 0.59 | 11 | 36% |
| bigpete.Stewie 1.0 | 7 | 29% |

Hadur died in 191 of 210 rounds, at a mean tick of 637. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 92 | 48% | 95 |
| kvk.HebusLeTroll 0.35 | 44 | 23% | 54 |
| jlm.javaDisturbance 0.59 | 25 | 13% | 28 |
| bigpete.Stewie 1.0 | 20 | 10% | 21 |
| yk.JahRoslav 1.1 | 5 | 3% | 5 |
| tad.Dalek98 0.98 | 3 | 2% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 77.2 | 48 / 210 | 3.05 | 16.5% | 32785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.4% | 99 |
| hadur117.mini.DeiseWH 0.2 | 2.0 | 16.5% | 48 |
| cre.Karolos 0.32 | 2.8 | 15.1% | 45 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 11.0% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.3% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.6% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 8.4% | 1 |
| sample.Walls 1.0 | 7.3 | 8.2% | 5 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 79.0 | 9 / 35 | 5747 |
| 2 | 2 | 64.7 | 74.0 | 4 / 35 | 4976 |
| 3 | 2 | 67.2 | 79.0 | 9 / 35 | 5562 |
| 4 | 3 | 65.7 | 74.3 | 6 / 35 | 5353 |
| 5 | 2 | 66.3 | 76.2 | 9 / 35 | 5299 |
| 6 | 1 | 68.2 | 80.6 | 11 / 35 | 5848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 36 | 28% |
| cre.Karolos 0.32 | 31 | 32% |
| stelo.AreaTargetingBot 1.1 | 15 | 100% |
| sample.Walls 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 57% |
| cw.megas.Blade 0.8 | 3 | 67% |

Hadur died in 162 of 210 rounds, at a mean tick of 595. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 78 | 48% | 92 |
| cre.Karolos 0.32 | 57 | 35% | 70 |
| stelo.RamTrackSurfer 1.2 | 8 | 5% | 16 |
| stelo.AreaTargetingBot 1.1 | 8 | 5% | 14 |
| cw.megas.Blade 0.8 | 5 | 3% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 2% | 4 |
| sample.Walls 1.0 | 2 | 1% | 5 |

## Melee bench: F24

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.0 | 57.8 | 11 / 210 | 4.80 | 12.1% | 24185 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.5 | 14.3% | 50 |
| florent.XSeries.X2 0.12 | 2.3 | 13.9% | 52 |
| davidalves.Phoenix 0.54 | 2.8 | 13.5% | 56 |
| hadur117.mini.DeiseWH 0.2 | 4.2 | 12.1% | 11 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.4% | 20 |
| oog.melee.Corsair 1.0 | 5.2 | 10.9% | 16 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.4% | 5 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 0 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 61.6 | 1 / 35 | 4027 |
| 2 | 4 | 56.5 | 55.6 | 2 / 35 | 4051 |
| 3 | 5 | 56.6 | 56.5 | 0 / 35 | 4054 |
| 4 | 4 | 57.7 | 59.4 | 4 / 35 | 4025 |
| 5 | 4 | 55.7 | 53.7 | 1 / 35 | 3995 |
| 6 | 4 | 57.5 | 60.3 | 3 / 35 | 4033 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 7 | 14% |
| pedersen.Ugluk 1.1.1 | 6 | 50% |
| rz.GlowBlowMelee 1.4 | 6 | 33% |
| florent.XSeries.X2 0.12 | 5 | 0% |
| oog.melee.Corsair 1.0 | 5 | 40% |
| stelo.SoJNanoMelee 1.1 | 3 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 60 | 30% | 61 |
| davidalves.Phoenix 0.54 | 50 | 25% | 51 |
| rz.GlowBlowMelee 1.4 | 28 | 14% | 30 |
| oog.melee.Corsair 1.0 | 24 | 12% | 26 |
| pedersen.Ugluk 1.1.1 | 22 | 11% | 25 |
| lunchie.Lunchbox 0.93 | 6 | 3% | 7 |
| stelo.SoJNanoMelee 1.1 | 5 | 3% | 6 |
| as.FrankTheTank 1.3 | 3 | 2% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.9 | 91 / 210 | 2.99 | 17.0% | 28414 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 17.0% | 91 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.1% | 32 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.0% | 22 |
| jdw.Hurricane 1.4 | 3.7 | 11.9% | 29 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.0% | 19 |
| ds.Oo 2.2 | 5.8 | 9.1% | 10 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.6% | 3 |
| awesomeness.Elite 1.0 | 8.2 | 7.5% | 5 |
| adt.Ar2 1.1 | 8.3 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 70.2 | 12 / 35 | 4421 |
| 2 | 1 | 67.6 | 84.8 | 17 / 35 | 5004 |
| 3 | 1 | 64.6 | 75.6 | 13 / 35 | 4319 |
| 4 | 1 | 67.7 | 81.9 | 18 / 35 | 5175 |
| 5 | 1 | 64.1 | 72.7 | 12 / 35 | 4776 |
| 6 | 1 | 67.2 | 82.5 | 19 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 39 | 64% |
| voidious.micro.BlitzBat 1.05 | 31 | 90% |
| jdw.Hurricane 1.4 | 20 | 100% |
| gre.svman4.Morfeas 1.4.1 | 19 | 42% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 3 | 33% |
| ds.Oo 2.2 | 3 | 67% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 31 | 26% | 57 |
| jdw.Hurricane 1.4 | 19 | 16% | 38 |
| gre.svman4.Morfeas 1.4.1 | 19 | 16% | 26 |
| voidious.micro.BlitzBat 1.05 | 17 | 14% | 37 |
| ds.Oo 2.2 | 13 | 11% | 17 |
| awesomeness.Elite 1.0 | 12 | 10% | 14 |
| adt.Ar2 1.1 | 6 | 5% | 10 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 73.6 | 29 / 210 | 3.38 | 15.7% | 35131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.0 | 17.1% | 97 |
| hadur117.mini.DeiseWH 0.2 | 2.0 | 15.7% | 29 |
| lrem.Spectre 0.4.4 | 3.5 | 11.9% | 18 |
| shu.nitro.LENIN .T34 | 4.0 | 11.5% | 27 |
| js.PinBall 1.6 | 4.5 | 11.2% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.8% | 16 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 9.2% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 7.2% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.3% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 70.8 | 5 / 35 | 5904 |
| 2 | 2 | 65.4 | 73.7 | 9 / 35 | 5935 |
| 3 | 2 | 65.8 | 77.8 | 6 / 35 | 5938 |
| 4 | 2 | 63.8 | 72.4 | 3 / 35 | 5777 |
| 5 | 2 | 63.2 | 72.1 | 3 / 35 | 5330 |
| 6 | 2 | 65.4 | 74.9 | 3 / 35 | 6247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 29 | 14% |
| lrem.Spectre 0.4.4 | 19 | 63% |
| shu.nitro.LENIN .T34 | 8 | 50% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 38% |
| js.PinBall 1.6 | 7 | 14% |
| gh.mini.GrubbmOne 1.0 | 4 | 75% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 67% |

Hadur died in 181 of 210 rounds, at a mean tick of 668. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 93 | 51% | 100 |
| lrem.Spectre 0.4.4 | 21 | 12% | 32 |
| js.PinBall 1.6 | 20 | 11% | 21 |
| shu.nitro.LENIN .T34 | 16 | 9% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 9% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 7 | 4% | 8 |
| gh.mini.GrubbmOne 1.0 | 6 | 3% | 10 |
| sample.SpinBot 1.0 | 2 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 73.7 | 52 / 210 | 3.37 | 15.6% | 28830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mk.Alpha 0.2.1 | 1.2 | 16.5% | 109 |
| hadur117.mini.DeiseWH 0.2 | 1.8 | 15.6% | 52 |
| EH.Eagle 1.0.6 | 3.5 | 11.5% | 11 |
| wee.Gem 1.8.4 | 3.8 | 11.4% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.6% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.6% | 3 |
| joe.ADinosaur 1.0 | 6.7 | 8.7% | 4 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.0% | 2 |
| caimano.Furia_Ceca 0.22 | 9.2 | 5.9% | 2 |
| cs.Grudge 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 72.7 | 9 / 35 | 4631 |
| 2 | 2 | 64.6 | 77.1 | 7 / 35 | 5028 |
| 3 | 2 | 62.8 | 72.4 | 7 / 35 | 4753 |
| 4 | 2 | 61.8 | 68.3 | 9 / 35 | 4370 |
| 5 | 2 | 62.1 | 69.5 | 6 / 35 | 4786 |
| 6 | 1 | 66.8 | 81.9 | 14 / 35 | 5262 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 51 | 16% |
| EH.Eagle 1.0.6 | 22 | 86% |
| wee.Gem 1.8.4 | 16 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 75% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 50% |
| joe.ADinosaur 1.0 | 1 | 0% |

Hadur died in 158 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 93 | 59% | 105 |
| wee.Gem 1.8.4 | 16 | 10% | 32 |
| joe.ADinosaur 1.0 | 13 | 8% | 14 |
| EH.Eagle 1.0.6 | 10 | 6% | 23 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 9 | 6% | 9 |
| throxbot.ThroxBot 0.1 | 5 | 3% | 7 |
| cs.Grudge 1.0 | 2 | 1% | 2 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.8 | 79 / 210 | 2.91 | 16.7% | 28600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.2 | 16.7% | 79 |
| kid.test.NightFox .2 | 2.0 | 14.1% | 33 |
| uji.Antique 1.0 | 3.5 | 12.4% | 45 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.8% | 28 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.7% | 10 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 4 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.9% | 4 |
| stelo.PianistNano 1.2 | 8.7 | 6.4% | 2 |
| stelo.Lifestealer 1.0 | 9.2 | 6.0% | 0 |
| matt.advanced.Katana 1.0 | 9.2 | 6.1% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 78.4 | 11 / 35 | 4517 |
| 2 | 1 | 64.7 | 77.5 | 12 / 35 | 4589 |
| 3 | 1 | 66.9 | 82.2 | 16 / 35 | 5169 |
| 4 | 1 | 64.5 | 78.1 | 14 / 35 | 4481 |
| 5 | 1 | 65.3 | 79.0 | 15 / 35 | 4700 |
| 6 | 1 | 65.3 | 77.5 | 11 / 35 | 5144 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 48 | 90% |
| uji.Antique 1.0 | 35 | 40% |
| qohnil.blot.BlotBot 3.61 | 19 | 47% |
| pfvicm.Sobieski 7.2.3b | 7 | 71% |
| ahr.ice.Ice 1.0.2 | 4 | 50% |
| amk.ChumbaWumba 0.3 | 2 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 568. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 55 | 42% | 74 |
| qohnil.blot.BlotBot 3.61 | 28 | 21% | 41 |
| pfvicm.Sobieski 7.2.3b | 19 | 14% | 27 |
| kid.test.NightFox .2 | 14 | 11% | 36 |
| amk.ChumbaWumba 0.3 | 7 | 5% | 11 |
| stelo.PianistNano 1.2 | 6 | 5% | 8 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 9 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 71.4 | 30 / 210 | 3.57 | 15.8% | 32057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.8 | 17.0% | 96 |
| deewiant.Anomaly 0.2 | 1.8 | 16.0% | 67 |
| hadur117.mini.DeiseWH 0.2 | 2.3 | 15.8% | 30 |
| myl.micro.Troodon 1.10 | 4.2 | 11.1% | 4 |
| jok.PheonixM 0.1.2 | 5.0 | 9.6% | 5 |
| ph.melee.ArcherME 0.3 | 5.8 | 9.0% | 2 |
| DBall.Anarchy 0.1 | 7.5 | 6.3% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.6% | 0 |
| jangs.ns51 1.0 | 8.8 | 4.7% | 1 |
| ap.Frederick 1.1 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 73.0 | 3 / 35 | 4916 |
| 2 | 1 | 65.5 | 72.4 | 6 / 35 | 5604 |
| 3 | 3 | 63.5 | 65.1 | 6 / 35 | 5444 |
| 4 | 2 | 65.3 | 73.3 | 6 / 35 | 5392 |
| 5 | 3 | 64.6 | 71.7 | 3 / 35 | 5512 |
| 6 | 3 | 64.9 | 73.0 | 6 / 35 | 5189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 45 | 16% |
| zyx.mega.YersiniaPestis 3.1 | 26 | 4% |
| myl.micro.Troodon 1.10 | 10 | 90% |
| DBall.Anarchy 0.1 | 6 | 100% |
| jok.PheonixM 0.1.2 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| ap.Frederick 1.1 | 2 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 87 | 48% | 97 |
| zyx.mega.YersiniaPestis 3.1 | 62 | 34% | 66 |
| jok.PheonixM 0.1.2 | 9 | 5% | 13 |
| myl.micro.Troodon 1.10 | 7 | 4% | 15 |
| ph.melee.ArcherME 0.3 | 7 | 4% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 5 |
| jangs.ns51 1.0 | 4 | 2% | 4 |
| DBall.Anarchy 0.1 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 50.2 | 42.2 | 1 / 210 | 6.20 | 9.2% | 21719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.0 | 14.3% | 56 |
| catcat20.Matcha 0.006 | 2.2 | 14.3% | 64 |
| oog.melee.Capulet 1.2 | 2.8 | 13.7% | 37 |
| stelo.PastFuture 2.3.2 | 3.0 | 13.1% | 30 |
| hadur117.mini.DeiseWH 0.2 | 5.8 | 9.2% | 1 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.6% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 6.8 | 8.5% | 10 |
| tripphippy.Alice 1.1 | 7.8 | 7.8% | 8 |
| ntc.Opposite 1.5 | 7.8 | 7.9% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 7 | 46.8 | 36.5 | 0 / 35 | 3182 |
| 2 | 5 | 50.8 | 41.6 | 0 / 35 | 3772 |
| 3 | 7 | 50.7 | 44.4 | 0 / 35 | 3768 |
| 4 | 5 | 51.2 | 43.2 | 0 / 35 | 3851 |
| 5 | 6 | 49.7 | 42.9 | 0 / 35 | 3516 |
| 6 | 5 | 51.9 | 44.8 | 1 / 35 | 3630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 3 | 0% |
| stelo.PastFuture 2.3.2 | 2 | 0% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |
| catcat20.Matcha 0.006 | 1 | 0% |

Hadur died in 209 of 210 rounds, at a mean tick of 443. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 41 | 20% | 41 |
| darkcanuck.B26354 1.06 | 39 | 19% | 39 |
| catcat20.Matcha 0.006 | 36 | 17% | 36 |
| oog.melee.Capulet 1.2 | 33 | 16% | 33 |
| intruder.PrairieWolf 2.61 | 20 | 10% | 21 |
| ntc.Opposite 1.5 | 14 | 7% | 14 |
| tripphippy.Alice 1.1 | 13 | 6% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 5% | 11 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.9 | 55.4 | 3 / 210 | 5.01 | 11.4% | 22709 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.2% | 133 |
| gh.mini.Griezel 0.2 | 2.0 | 14.4% | 48 |
| hadur117.mini.DeiseWH 0.2 | 3.5 | 11.4% | 3 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.6% | 11 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 10.7% | 9 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.2% | 4 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.2% | 2 |
| fm.mammillarias 1.3 | 8.2 | 6.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 55.6 | 54.0 | 1 / 35 | 3701 |
| 2 | 4 | 54.7 | 53.0 | 0 / 35 | 3495 |
| 3 | 4 | 54.3 | 52.7 | 0 / 35 | 3499 |
| 4 | 3 | 57.8 | 59.7 | 1 / 35 | 4112 |
| 5 | 3 | 58.2 | 61.0 | 1 / 35 | 4082 |
| 6 | 4 | 55.0 | 52.1 | 0 / 35 | 3820 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 15 | 0% |
| d414.nano.Quantum 1.0.0 | 3 | 33% |
| gh.mini.Griezel 0.2 | 2 | 0% |
| spinnercat.micro.Tyger 0.1 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 540. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 73 | 35% | 74 |
| gh.mini.Griezel 0.2 | 60 | 29% | 60 |
| gh.nano.Grofvuil 0.2 | 23 | 11% | 24 |
| d414.nano.Quantum 1.0.0 | 13 | 6% | 14 |
| timmit.nano.TimDog 0.33 | 11 | 5% | 11 |
| spinnercat.micro.Tyger 0.1 | 11 | 5% | 11 |
| fm.mammillarias 1.3 | 8 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 72.6 | 48 / 210 | 3.46 | 15.2% | 28952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.6% | 82 |
| hadur117.mini.DeiseWH 0.2 | 1.7 | 15.2% | 48 |
| apc.botM 3.0 | 3.3 | 12.5% | 36 |
| vjik.UnViolation 1.1 | 4.2 | 11.0% | 21 |
| lxx.ConceptA 0.8 | 4.5 | 10.3% | 8 |
| bayen.UbaMicro 1.4 | 6.8 | 8.4% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.6% | 3 |
| conscience.Electron 1.3g | 8.0 | 6.8% | 1 |
| yk.JahMicro 1.0 | 8.5 | 6.8% | 5 |
| donjezza.Jezza 1.0 | 9.5 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 75.6 | 5 / 35 | 4992 |
| 2 | 2 | 63.6 | 75.9 | 7 / 35 | 5047 |
| 3 | 2 | 63.8 | 74.6 | 7 / 35 | 5208 |
| 4 | 2 | 61.8 | 67.9 | 16 / 35 | 4276 |
| 5 | 1 | 62.1 | 71.4 | 6 / 35 | 4865 |
| 6 | 2 | 61.6 | 70.5 | 7 / 35 | 4564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 29% |
| apc.botM 3.0 | 15 | 13% |
| vjik.UnViolation 1.1 | 15 | 93% |
| lxx.ConceptA 0.8 | 12 | 75% |
| donjezza.Jezza 1.0 | 3 | 100% |
| yk.JahMicro 1.0 | 2 | 100% |
| bayen.UbaMicro 1.4 | 2 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 566. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 57 | 35% | 70 |
| apc.botM 3.0 | 48 | 30% | 51 |
| lxx.ConceptA 0.8 | 15 | 9% | 20 |
| vjik.UnViolation 1.1 | 14 | 9% | 28 |
| bayen.UbaMicro 1.4 | 10 | 6% | 13 |
| conscience.Electron 1.3g | 10 | 6% | 13 |
| yk.JahMicro 1.0 | 4 | 2% | 8 |
| panzer.Panzer 0.2 | 4 | 2% | 5 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 62.9 | 25 / 210 | 4.34 | 13.7% | 28508 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.8% | 92 |
| hadur117.mini.DeiseWH 0.2 | 2.0 | 13.7% | 25 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 11.9% | 23 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.8% | 25 |
| labg.Cataclysm 2.05 | 4.3 | 11.3% | 28 |
| baal.nano.N 1.42 | 6.0 | 9.9% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 8.9% | 6 |
| zyx.micro.Ant 1.1 | 8.2 | 5.8% | 1 |
| sanja.First 0.1 | 9.3 | 4.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 63.5 | 2 / 35 | 4553 |
| 2 | 2 | 59.7 | 62.5 | 5 / 35 | 4409 |
| 3 | 2 | 60.0 | 61.0 | 5 / 35 | 4780 |
| 4 | 2 | 62.6 | 66.0 | 6 / 35 | 4978 |
| 5 | 2 | 61.1 | 63.8 | 3 / 35 | 4948 |
| 6 | 2 | 60.7 | 60.3 | 4 / 35 | 4840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 28 | 25% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 11 | 64% |
| gre.svman4.Leonidas 1.3.2 | 9 | 44% |
| labg.Cataclysm 2.05 | 4 | 0% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 50% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 66 | 36% | 78 |
| gre.svman4.Leonidas 1.3.2 | 37 | 20% | 39 |
| labg.Cataclysm 2.05 | 25 | 14% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 11% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 17 | 9% | 17 |
| baal.nano.N 1.42 | 14 | 8% | 16 |
| zyx.micro.Ant 1.1 | 4 | 2% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 63.4 | 10 / 210 | 4.30 | 13.3% | 28627 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.2 | 17.6% | 96 |
| kid.Gladiator .7.2 | 1.8 | 17.0% | 68 |
| hadur117.mini.DeiseWH 0.2 | 3.0 | 13.3% | 10 |
| tcf.Reach 3 | 4.2 | 11.7% | 12 |
| jcs.Seth 1.8 | 5.0 | 11.1% | 18 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.6% | 4 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.8% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 65.7 | 2 / 35 | 5102 |
| 2 | 3 | 59.8 | 61.9 | 1 / 35 | 4451 |
| 3 | 3 | 61.9 | 66.0 | 0 / 35 | 4808 |
| 4 | 3 | 59.6 | 58.7 | 1 / 35 | 4819 |
| 5 | 3 | 60.2 | 60.6 | 3 / 35 | 4388 |
| 6 | 3 | 62.6 | 67.3 | 3 / 35 | 5059 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 16 | 31% |
| stelo.Spread 0.9 | 14 | 0% |
| tcf.Reach 3 | 4 | 50% |
| cli.Dancer 1.1 | 3 | 67% |
| jcs.Seth 1.8 | 3 | 33% |
| ratosh.Wesco 1.4 | 1 | 0% |

Hadur died in 200 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 62 | 31% | 63 |
| kid.Gladiator .7.2 | 61 | 31% | 63 |
| tcf.Reach 3 | 35 | 18% | 37 |
| jcs.Seth 1.8 | 16 | 8% | 19 |
| cli.Dancer 1.1 | 15 | 8% | 17 |
| ratosh.Wesco 1.4 | 6 | 3% | 6 |
| amk.Punbot.Punbot 0.01 | 3 | 2% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 57.7 | 5 / 210 | 4.81 | 11.6% | 22170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 164 |
| gh.mini.Gruwel 0.9 | 2.2 | 14.2% | 24 |
| dmh.robocode.robot.BlackDeath 9.2 | 2.8 | 12.8% | 14 |
| hadur117.mini.DeiseWH 0.2 | 4.2 | 11.6% | 5 |
| rz.HawkOnFire 0.1 | 4.8 | 10.8% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.1% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6.8 | 6.8% | 0 |
| wit.Chuliath 1.0 | 7.5 | 6.5% | 1 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.1 | 57.8 | 0 / 35 | 3772 |
| 2 | 4 | 59.0 | 62.5 | 1 / 35 | 4096 |
| 3 | 5 | 55.7 | 54.6 | 0 / 35 | 3754 |
| 4 | 4 | 58.3 | 61.9 | 1 / 35 | 3536 |
| 5 | 4 | 54.8 | 52.7 | 1 / 35 | 3339 |
| 6 | 4 | 56.4 | 56.5 | 2 / 35 | 3673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 14 | 14% |
| gh.mini.Gruwel 0.9 | 5 | 0% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 33% |
| rz.HawkOnFire 0.1 | 3 | 67% |

Hadur died in 205 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 71 | 35% | 71 |
| gh.mini.Gruwel 0.9 | 49 | 24% | 49 |
| dmh.robocode.robot.BlackDeath 9.2 | 40 | 20% | 43 |
| rz.HawkOnFire 0.1 | 17 | 8% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 17 | 8% | 18 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 3 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 79.8 | 89 / 210 | 2.81 | 18.1% | 34847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 18.1% | 89 |
| alpha.RainingFire 1.0 | 2.3 | 13.1% | 38 |
| mz.Cork 0.1 | 3.7 | 11.5% | 16 |
| bzdp.Pansy 2.1 | 3.8 | 11.7% | 23 |
| bvh.micro.Freya 0.3 | 4.5 | 11.2% | 20 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.3% | 12 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.4% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.6% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 6.0% | 4 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 17 / 35 | 5688 |
| 2 | 1 | 65.8 | 73.7 | 11 / 35 | 6000 |
| 3 | 1 | 68.0 | 80.6 | 17 / 35 | 5966 |
| 4 | 1 | 65.6 | 76.5 | 12 / 35 | 5375 |
| 5 | 1 | 68.2 | 82.5 | 17 / 35 | 5711 |
| 6 | 1 | 68.2 | 81.0 | 15 / 35 | 6107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| alpha.RainingFire 1.0 | 30 | 37% |
| bzdp.Pansy 2.1 | 26 | 85% |
| mz.Cork 0.1 | 22 | 73% |
| bvh.micro.Freya 0.3 | 21 | 62% |
| m3thos.Eva02 0.7.1 | 13 | 77% |
| bvh.mini.Fenrir 0.39 | 8 | 100% |
| dl.BetterWalls 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 33 | 27% | 45 |
| bvh.micro.Freya 0.3 | 24 | 20% | 35 |
| bzdp.Pansy 2.1 | 19 | 16% | 28 |
| mz.Cork 0.1 | 17 | 14% | 39 |
| m3thos.Eva02 0.7.1 | 11 | 9% | 25 |
| squidM.TentalceMeleeNano 1.1 | 7 | 6% | 9 |
| dl.BetterWalls 1.0 | 6 | 5% | 14 |
| bvh.mini.Fenrir 0.39 | 5 | 4% | 12 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.5 | 122 / 210 | 2.66 | 18.0% | 35023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 18.0% | 122 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.4% | 10 |
| agrach.Dalek 1.0 | 3.5 | 10.4% | 23 |
| EBBU.Sim2 1.02 | 3.7 | 10.1% | 6 |
| germ.TheMind .2 | 3.8 | 10.4% | 10 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.9% | 19 |
| lmk.ACPFinal 0.1 | 7.7 | 8.3% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 7.9% | 1 |
| mb.Beast 0.1 | 8.3 | 8.2% | 10 |
| skm.Ryubot 1.0 | 9.3 | 7.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 83.5 | 21 / 35 | 5912 |
| 2 | 1 | 66.7 | 81.6 | 19 / 35 | 5940 |
| 3 | 1 | 64.6 | 75.9 | 18 / 35 | 5573 |
| 4 | 1 | 67.0 | 81.9 | 22 / 35 | 6071 |
| 5 | 1 | 66.8 | 81.9 | 23 / 35 | 5743 |
| 6 | 1 | 66.8 | 84.4 | 19 / 35 | 5784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 29 | 97% |
| germ.TheMind .2 | 22 | 95% |
| EBBU.Sim2 1.02 | 18 | 94% |
| com.syncleus.robocode.Dreadnaught 0.1 | 18 | 89% |
| mb.Beast 0.1 | 16 | 100% |
| stelo.UntouchableNano 1.3 | 11 | 55% |
| skm.Ryubot 1.0 | 10 | 100% |
| lmk.ACPFinal 0.1 | 9 | 78% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 88 of 210 rounds, at a mean tick of 411. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 13 | 15% | 46 |
| EBBU.Sim2 1.02 | 13 | 15% | 28 |
| lmk.ACPFinal 0.1 | 13 | 15% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 13 | 15% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 12 | 14% | 33 |
| stelo.UntouchableNano 1.3 | 12 | 14% | 18 |
| mb.Beast 0.1 | 7 | 8% | 20 |
| germ.TheMind .2 | 4 | 5% | 21 |
| skm.Ryubot 1.0 | 1 | 1% | 3 |

## Melee bench: F38

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.8 | 57.2 | 18 / 210 | 4.85 | 11.8% | 23067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 17.2% | 106 |
| bvh.mini.Freya 0.55 | 2.5 | 12.8% | 23 |
| bts.mega.Gnarly 1.4 | 3.3 | 12.7% | 33 |
| cs.Wren 1.0 | 4.0 | 11.7% | 12 |
| hadur117.mini.DeiseWH 0.2 | 4.2 | 11.8% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.2 | 9.8% | 8 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.4% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.9% | 2 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.9% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 57.5 | 4 / 35 | 4039 |
| 2 | 3 | 58.3 | 61.0 | 2 / 35 | 4031 |
| 3 | 5 | 55.6 | 56.5 | 4 / 35 | 3400 |
| 4 | 5 | 56.3 | 57.5 | 1 / 35 | 3632 |
| 5 | 5 | 55.7 | 52.7 | 3 / 35 | 3856 |
| 6 | 3 | 57.7 | 58.4 | 4 / 35 | 4109 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cs.Wren 1.0 | 8 | 75% |
| bvh.mini.Freya 0.55 | 5 | 80% |
| bts.mega.Gnarly 1.4 | 4 | 25% |
| davidalves.net.DuelistNanoMelee 1.01 | 3 | 100% |
| justin.Mallais 14.0 | 3 | 33% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 505. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 42% | 85 |
| bts.mega.Gnarly 1.4 | 31 | 16% | 35 |
| bvh.mini.Freya 0.55 | 25 | 13% | 28 |
| kdf.KoulDestroyer 1.0 | 18 | 9% | 19 |
| cs.Wren 1.0 | 15 | 8% | 16 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 6% | 16 |
| matt.UnderDark3 2.4.34 | 5 | 3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 3 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 61.9 | 18 / 210 | 4.43 | 13.0% | 27763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.0 | 16.1% | 61 |
| az.Ololobot 0.2.4 | 2.3 | 13.2% | 65 |
| hadur117.mini.DeiseWH 0.2 | 2.7 | 13.0% | 18 |
| catcat20.Lambda 0.024 | 4.0 | 11.6% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 9.0% | 16 |
| gimp.GimpBot 0.1 | 6.2 | 8.8% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.6% | 5 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.4% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.1 | 59.4 | 5 / 35 | 4584 |
| 2 | 2 | 57.7 | 61.0 | 1 / 35 | 4549 |
| 3 | 3 | 57.5 | 59.7 | 1 / 35 | 4391 |
| 4 | 3 | 60.0 | 62.5 | 3 / 35 | 5162 |
| 5 | 3 | 58.4 | 63.2 | 2 / 35 | 4279 |
| 6 | 2 | 60.3 | 65.4 | 6 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 20 | 45% |
| az.Ololobot 0.2.4 | 11 | 27% |
| catcat20.Lambda 0.024 | 7 | 43% |
| stelo.SoRobotNanoMelee 1.2 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 0% |

Hadur died in 192 of 210 rounds, at a mean tick of 605. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 59 | 31% | 66 |
| az.Ololobot 0.2.4 | 37 | 19% | 40 |
| catcat20.Lambda 0.024 | 36 | 19% | 39 |
| winamp32.micro.MicroMacro 1.0 | 18 | 9% | 18 |
| apollokidd.ApolloKidd 0.9 | 14 | 7% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 7% | 15 |
| gimp.GimpBot 0.1 | 13 | 7% | 14 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 69.2 | 43 / 210 | 3.78 | 15.2% | 30738 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 1.2 | 16.8% | 94 |
| hadur117.mini.DeiseWH 0.2 | 1.8 | 15.2% | 43 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.4% | 30 |
| mz.AntiGrav 1.0 | 3.7 | 12.0% | 14 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.0% | 10 |
| stelo.Randomness 1.0 | 6.3 | 9.2% | 11 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.5% | 1 |
| sample.Corners 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 68.9 | 6 / 35 | 4951 |
| 2 | 2 | 63.9 | 71.1 | 7 / 35 | 5411 |
| 3 | 1 | 66.2 | 76.5 | 9 / 35 | 5812 |
| 4 | 2 | 59.8 | 61.3 | 7 / 35 | 4346 |
| 5 | 2 | 63.4 | 69.5 | 8 / 35 | 5178 |
| 6 | 2 | 62.6 | 67.6 | 6 / 35 | 5040 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 26% |
| kano.gamma.KanoGamma 1.8 | 14 | 50% |
| mz.AntiGrav 1.0 | 12 | 100% |
| stelo.Randomness 1.0 | 6 | 50% |
| alpha.BlackIce 1.0 | 6 | 83% |
| Polkwane.SmashMelee 1.0 | 5 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 74 | 44% | 82 |
| kano.gamma.KanoGamma 1.8 | 44 | 26% | 54 |
| stelo.Randomness 1.0 | 13 | 8% | 20 |
| alpha.BlackIce 1.0 | 11 | 7% | 16 |
| mz.AntiGrav 1.0 | 9 | 5% | 13 |
| amk.superstrike.SuperStrike 0.3 | 8 | 5% | 12 |
| Polkwane.SmashMelee 1.0 | 8 | 5% | 10 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 2 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.5 | 64.2 | 14 / 210 | 4.22 | 13.4% | 27413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.9% | 121 |
| lessonz.robocode.Oz 0.5.0 | 2.5 | 13.7% | 28 |
| hadur117.mini.DeiseWH 0.2 | 2.7 | 13.4% | 14 |
| ary.Swarm 1.1 | 3.8 | 12.7% | 18 |
| simonton.nano.MeleeSeed 1.8 | 5.3 | 10.3% | 15 |
| shrub.Silver v048 | 5.7 | 10.1% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 5 |
| stelo.Mirror 1.1 | 8.8 | 5.6% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.2 | 58.4 | 1 / 35 | 4440 |
| 2 | 2 | 62.5 | 67.6 | 4 / 35 | 5058 |
| 3 | 2 | 59.3 | 62.2 | 1 / 35 | 4394 |
| 4 | 3 | 60.9 | 66.7 | 3 / 35 | 4219 |
| 5 | 3 | 62.3 | 67.9 | 4 / 35 | 4758 |
| 6 | 2 | 59.6 | 62.5 | 1 / 35 | 4544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 19 | 11% |
| lessonz.robocode.Oz 0.5.0 | 10 | 30% |
| ary.Swarm 1.1 | 6 | 67% |
| simonton.nano.MeleeSeed 1.8 | 4 | 100% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 588. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 91 | 46% | 94 |
| lessonz.robocode.Oz 0.5.0 | 42 | 21% | 45 |
| shrub.Silver v048 | 26 | 13% | 26 |
| ary.Swarm 1.1 | 20 | 10% | 24 |
| simonton.nano.MeleeSeed 1.8 | 8 | 4% | 11 |
| jsal.Jsalbot 1.0 | 5 | 3% | 5 |
| zyx.nano.Ant 1.1 | 2 | 1% | 2 |
| stelo.Mirror 1.1 | 2 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.4 | 64.0 | 13 / 210 | 4.24 | 13.6% | 30589 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.3% | 110 |
| maribo.mini.MiniQuester 0.1 | 2.2 | 14.2% | 36 |
| hadur117.mini.DeiseWH 0.2 | 3.2 | 13.6% | 13 |
| ara.Shera 0.88 | 3.7 | 13.3% | 38 |
| amz.NanoClone 1.41 | 5.3 | 9.1% | 2 |
| dsw.StaticD 1.0 | 6.2 | 8.2% | 10 |
| maribo.IotaCT 1.1 | 6.8 | 7.3% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.7 | 5.7% | 0 |
| stelo.MirrorMicro 1.0 | 9.0 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.6 | 64.8 | 1 / 35 | 5248 |
| 2 | 2 | 62.4 | 71.1 | 3 / 35 | 5214 |
| 3 | 3 | 59.7 | 61.9 | 4 / 35 | 4788 |
| 4 | 3 | 60.0 | 62.5 | 3 / 35 | 5053 |
| 5 | 4 | 60.4 | 63.5 | 2 / 35 | 5088 |
| 6 | 3 | 59.3 | 60.3 | 0 / 35 | 5198 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 24 | 25% |
| maribo.mini.MiniQuester 0.1 | 11 | 9% |
| ara.Shera 0.88 | 8 | 25% |
| dsw.StaticD 1.0 | 2 | 0% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 620. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 70 | 36% | 77 |
| ara.Shera 0.88 | 46 | 23% | 47 |
| maribo.mini.MiniQuester 0.1 | 44 | 22% | 45 |
| dsw.StaticD 1.0 | 14 | 7% | 16 |
| amz.NanoClone 1.41 | 9 | 5% | 9 |
| maribo.IotaCT 1.1 | 6 | 3% | 7 |
| stelo.MirrorMicro 1.0 | 4 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 2 | 1% | 2 |

## Melee bench: F43

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 55.2 | 3 / 210 | 5.03 | 11.3% | 22619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.2% | 166 |
| brainfade.melee.Dusk 0.44 | 2.7 | 12.7% | 25 |
| dummy.micro.Sparrow 2.5 | 3.3 | 12.1% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 3.8 | 11.6% | 6 |
| hadur117.mini.DeiseWH 0.2 | 4.2 | 11.3% | 3 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 10.3% | 3 |
| jab.DiamondStealer 5 | 7.3 | 8.3% | 1 |
| mz.NanoGod 2.02 | 7.7 | 8.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.5 | 51.4 | 0 / 35 | 3713 |
| 2 | 4 | 57.5 | 55.2 | 0 / 35 | 3911 |
| 3 | 3 | 59.4 | 58.7 | 1 / 35 | 4095 |
| 4 | 3 | 58.9 | 59.7 | 0 / 35 | 3731 |
| 5 | 5 | 56.3 | 52.4 | 2 / 35 | 3674 |
| 6 | 5 | 56.5 | 53.7 | 0 / 35 | 3495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 12 | 0% |
| brainfade.melee.Dusk 0.44 | 4 | 25% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 501. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 44% | 91 |
| wcsv.melee.EngineerMelee 0.1 | 32 | 15% | 33 |
| brainfade.melee.Dusk 0.44 | 27 | 13% | 29 |
| jab.DiamondStealer 5 | 22 | 11% | 22 |
| dummy.micro.Sparrow 2.5 | 13 | 6% | 13 |
| mz.NanoGod 2.02 | 11 | 5% | 11 |
| Krabb.akim2.Akim2 1.1b | 10 | 5% | 10 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 65.7 | 30 / 210 | 4.09 | 14.7% | 32920 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.3 | 16.4% | 91 |
| hadur117.mini.DeiseWH 0.2 | 2.2 | 14.7% | 30 |
| tzu.TheArtOfWar 1.2 | 2.5 | 13.8% | 41 |
| jwirde.Gort 2.0 | 4.5 | 11.3% | 28 |
| wompi.Quokka 1.6 | 4.7 | 10.8% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.8% | 7 |
| disan.Chair 2.2.0 | 7.3 | 7.8% | 4 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.9% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.2% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 61.9 | 5 / 35 | 5511 |
| 2 | 1 | 63.5 | 69.5 | 4 / 35 | 5863 |
| 3 | 3 | 61.1 | 59.4 | 6 / 35 | 5347 |
| 4 | 2 | 63.5 | 68.6 | 5 / 35 | 5726 |
| 5 | 2 | 62.4 | 66.0 | 6 / 35 | 5281 |
| 6 | 2 | 62.4 | 68.6 | 4 / 35 | 5192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 32% |
| tzu.TheArtOfWar 1.2 | 11 | 45% |
| wompi.Quokka 1.6 | 8 | 50% |
| jwirde.Gort 2.0 | 7 | 29% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 83% |
| disan.Chair 2.2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 617. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 60 | 33% | 75 |
| jwirde.Gort 2.0 | 30 | 17% | 32 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 27 | 15% | 30 |
| tzu.TheArtOfWar 1.2 | 21 | 12% | 27 |
| wompi.Quokka 1.6 | 18 | 10% | 21 |
| disan.Chair 2.2.0 | 15 | 8% | 16 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 5 |
| amk.jointstrike.JointStrike 0.2 | 3 | 2% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 81.6 | 78 / 210 | 2.66 | 18.9% | 37563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWH 0.2 | 1.0 | 18.9% | 78 |
| jje.BagPuss 1.2 | 2.3 | 12.8% | 27 |
| eem.IWillFireNoBullet v2.8 | 2.8 | 12.0% | 85 |
| myl.nano.Graviton 1.10 | 4.3 | 10.5% | 1 |
| sul.Lunar 1.1 | 4.8 | 10.2% | 11 |
| hvilela.HVilela 0.9 | 5.7 | 9.4% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.0% | 5 |
| fm.claire 1.7 | 7.7 | 7.9% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 79.0 | 10 / 35 | 6264 |
| 2 | 1 | 67.0 | 80.3 | 11 / 35 | 5838 |
| 3 | 1 | 69.9 | 87.0 | 17 / 35 | 6423 |
| 4 | 1 | 69.1 | 83.2 | 15 / 35 | 6558 |
| 5 | 1 | 68.5 | 82.9 | 10 / 35 | 6337 |
| 6 | 1 | 67.4 | 77.1 | 15 / 35 | 6143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 68 | 32% |
| jje.BagPuss 1.2 | 21 | 52% |
| sul.Lunar 1.1 | 21 | 71% |
| myl.nano.Graviton 1.10 | 13 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| wit.Deep7 2.0 | 5 | 100% |
| hvilela.HVilela 0.9 | 4 | 75% |
| fm.claire 1.7 | 4 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1368. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 47 | 36% | 0 |
| jje.BagPuss 1.2 | 44 | 33% | 84 |
| sul.Lunar 1.1 | 11 | 8% | 40 |
| hvilela.HVilela 0.9 | 11 | 8% | 22 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 12 |
| myl.nano.Graviton 1.10 | 4 | 3% | 20 |
| wit.Deep7 2.0 | 4 | 3% | 18 |
| fm.claire 1.7 | 3 | 2% | 11 |
| abud.ThirdRobo 1.0 | 1 | 1% | 1 |

## Melee bench: F46

hadur117.mini.DeiseWH 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 65.3 | 3 / 210 | 4.12 | 13.1% | 25746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.0% | 84 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 17.5% | 106 |
| hadur117.mini.DeiseWH 0.2 | 3.0 | 13.1% | 3 |
| mz.MicroSheep 1.0 | 4.5 | 10.1% | 4 |
| cx.Princess 1.0 | 5.0 | 9.8% | 8 |
| sadoner.killer 0.2 | 5.5 | 9.4% | 4 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.5% | 1 |
| kurios.DOSexe .9a | 9.0 | 5.1% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 66.0 | 1 / 35 | 4075 |
| 2 | 3 | 59.5 | 62.9 | 0 / 35 | 4307 |
| 3 | 3 | 62.1 | 69.8 | 2 / 35 | 4680 |
| 4 | 3 | 58.4 | 61.6 | 0 / 35 | 4167 |
| 5 | 3 | 60.6 | 67.9 | 0 / 35 | 4382 |
| 6 | 3 | 59.5 | 63.5 | 0 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 21 | 0% |
| rsalesc.melee.Medina 0.4.5 | 7 | 0% |
| cx.Princess 1.0 | 2 | 0% |
| mz.MicroSheep 1.0 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 554. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 98 | 47% | 98 |
| rsalesc.melee.Medina 0.4.5 | 64 | 31% | 64 |
| mz.MicroSheep 1.0 | 14 | 7% | 14 |
| sadoner.killer 0.2 | 11 | 5% | 12 |
| arthord.NanoSatanMelee Beta | 8 | 4% | 9 |
| cx.Princess 1.0 | 7 | 3% | 8 |
| jeremyreeder.collective.Prophet 5 | 4 | 2% | 4 |
| mbro.Detektor3 0.1.1 | 1 | 0% | 1 |

