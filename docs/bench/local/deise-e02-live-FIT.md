# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 70.3 | 11 / 210 | 3.68 | 14.0% | 29058 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 151 |
| hadur117.mini.DeiseFIT 0.2 | 2.2 | 14.0% | 11 |
| sgp.JollyNinja 3.53 | 3.8 | 12.2% | 22 |
| mz.MicroGodMelee 1 | 4.2 | 11.7% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.4% | 8 |
| lorneswork.Predator 1.0 | 5.5 | 9.9% | 5 |
| adt.Ar2 1.0 | 7.0 | 6.8% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 70.5 | 5 / 35 | 4592 |
| 2 | 2 | 61.2 | 67.6 | 3 / 35 | 4795 |
| 3 | 2 | 60.3 | 65.4 | 1 / 35 | 4575 |
| 4 | 2 | 60.7 | 67.0 | 0 / 35 | 4829 |
| 5 | 2 | 64.7 | 78.4 | 1 / 35 | 5201 |
| 6 | 2 | 62.8 | 72.7 | 1 / 35 | 5066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 50 | 0% |
| sgp.JollyNinja 3.53 | 11 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 40% |
| mz.MicroGodMelee 1 | 4 | 0% |
| lorneswork.Predator 1.0 | 2 | 50% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 98 | 49% | 101 |
| sgp.JollyNinja 3.53 | 36 | 18% | 38 |
| mz.MicroGodMelee 1 | 26 | 13% | 26 |
| simonton.nano.WeekendObsession_Melee 1.0 | 18 | 9% | 20 |
| lorneswork.Predator 1.0 | 16 | 8% | 19 |
| adt.Ar2 1.0 | 3 | 2% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 64.5 | 29 / 210 | 4.20 | 14.3% | 30596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 1.5 | 15.1% | 73 |
| hadur117.mini.DeiseFIT 0.2 | 2.2 | 14.3% | 29 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 14.1% | 44 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.3 | 11.1% | 29 |
| lrem.micro.SpikeSoldier 0.4 | 4.7 | 10.5% | 3 |
| Noran.BitchingElk 0.054 | 6.8 | 8.3% | 15 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.2% | 4 |
| sch.Simone 0.3d | 7.3 | 8.0% | 10 |
| stelo.PatternRobot 1.0 | 8.8 | 6.0% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 71.1 | 5 / 35 | 4989 |
| 2 | 1 | 62.8 | 67.6 | 6 / 35 | 5467 |
| 3 | 1 | 61.4 | 65.4 | 5 / 35 | 5211 |
| 4 | 3 | 61.3 | 65.4 | 3 / 35 | 5068 |
| 5 | 4 | 57.0 | 53.7 | 3 / 35 | 4456 |
| 6 | 2 | 61.6 | 63.8 | 7 / 35 | 5405 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 26 | 35% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 18% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 18% |
| Noran.BitchingElk 0.054 | 8 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 5 | 100% |
| sch.Simone 0.3d | 4 | 0% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 27% | 55 |
| pulsar.PulsarMax 0.8.9 | 43 | 24% | 49 |
| com.cohesiva.robocode.ManOwaR 1.0 | 33 | 18% | 37 |
| sch.Simone 0.3d | 17 | 9% | 19 |
| fnc.bandit.Bandit 5.2.0 | 13 | 7% | 14 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 6% | 13 |
| stelo.PatternRobot 1.0 | 8 | 4% | 11 |
| Noran.BitchingElk 0.054 | 6 | 3% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.9 | 73 / 210 | 2.36 | 17.8% | 36066 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 17.8% | 73 |
| radnor.DoctorBob 1.42 | 2.0 | 16.2% | 88 |
| kawigi.nano.Lib 1.0 | 3.5 | 12.6% | 21 |
| vuen.Cake 2.51 | 3.5 | 12.4% | 24 |
| urdos.URDOS 1.3 | 5.0 | 9.9% | 4 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.0% | 0 |
| oa.weak.FlyMk1 0.1 | 8.2 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 13 / 35 | 6083 |
| 2 | 1 | 66.9 | 84.4 | 12 / 35 | 5855 |
| 3 | 1 | 66.9 | 83.5 | 11 / 35 | 6225 |
| 4 | 1 | 67.5 | 87.3 | 9 / 35 | 5811 |
| 5 | 1 | 66.6 | 83.2 | 15 / 35 | 5699 |
| 6 | 1 | 68.2 | 86.3 | 13 / 35 | 6393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 11% |
| kawigi.nano.Lib 1.0 | 41 | 90% |
| vuen.Cake 2.51 | 26 | 58% |
| urdos.URDOS 1.3 | 7 | 57% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 3 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 85 | 62% | 92 |
| vuen.Cake 2.51 | 28 | 20% | 48 |
| urdos.URDOS 1.3 | 10 | 7% | 14 |
| kawigi.nano.Lib 1.0 | 9 | 7% | 36 |
| adt.Ar1 2.1 | 2 | 1% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.3 | 65.0 | 4 / 210 | 4.15 | 13.3% | 28739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.8% | 189 |
| apc.LeeroyJenkins2 1.0 | 2.2 | 14.5% | 10 |
| hadur117.mini.DeiseFIT 0.2 | 2.8 | 13.3% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 11.1% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.6% | 1 |
| css.Delitioner 0.11 | 6.5 | 7.5% | 1 |
| tj.zombie1n 1.0.1 | 6.8 | 6.3% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 65.1 | 0 / 35 | 4661 |
| 2 | 2 | 63.5 | 72.7 | 1 / 35 | 4955 |
| 3 | 3 | 60.6 | 61.9 | 0 / 35 | 4833 |
| 4 | 3 | 60.3 | 64.1 | 0 / 35 | 4360 |
| 5 | 3 | 61.4 | 63.8 | 2 / 35 | 5062 |
| 6 | 3 | 60.8 | 62.5 | 1 / 35 | 4868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 35 | 0% |
| apc.LeeroyJenkins2 1.0 | 3 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 206 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 124 | 60% | 124 |
| apc.LeeroyJenkins2 1.0 | 32 | 16% | 35 |
| TNT.TNT 0.99.1 | 20 | 10% | 21 |
| josago.Jorgito 0.16 | 20 | 10% | 20 |
| css.Delitioner 0.11 | 5 | 2% | 5 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 53.4 | 51.2 | 0 / 210 | 5.40 | 10.0% | 19083 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 19.0% | 121 |
| justin.DemonicRage 3.4 | 1.7 | 18.1% | 65 |
| wompi.Numbat 2.1 | 3.0 | 13.6% | 15 |
| hadur117.mini.DeiseFIT 0.2 | 4.7 | 10.0% | 0 |
| ms.Ares 0.19 | 5.0 | 9.9% | 1 |
| axeBots.HataMoto 3.09 | 5.3 | 9.4% | 8 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.4% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 6 | 50.3 | 44.8 | 0 / 35 | 2949 |
| 2 | 4 | 54.9 | 54.3 | 0 / 35 | 3312 |
| 3 | 5 | 54.2 | 51.7 | 0 / 35 | 3285 |
| 4 | 4 | 53.5 | 51.7 | 0 / 35 | 3021 |
| 5 | 5 | 53.4 | 51.7 | 0 / 35 | 2997 |
| 6 | 4 | 54.1 | 52.7 | 0 / 35 | 3519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 3 | 0% |
| justin.DemonicRage 3.4 | 3 | 0% |
| wompi.Numbat 2.1 | 1 | 0% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 461. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 66 | 31% | 66 |
| cb.fire.Firestarter 2.0f | 63 | 30% | 63 |
| wompi.Numbat 2.1 | 42 | 20% | 42 |
| ms.Ares 0.19 | 14 | 7% | 14 |
| axeBots.HataMoto 3.09 | 9 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 5 |
| GarmBox.Oranges 1.0 | 4 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 70.1 | 41 / 210 | 3.70 | 14.9% | 29245 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.8 | 14.6% | 44 |
| hadur117.mini.DeiseFIT 0.2 | 1.8 | 14.9% | 41 |
| origin.SleepSiphon 1.7b | 2.3 | 14.6% | 81 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.5% | 21 |
| mld.Wisdom 1.0 | 5.2 | 10.3% | 0 |
| gg.Wolverine 2.0 | 6.0 | 9.2% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.2 | 7.6% | 15 |
| spinnercat.Omen 1.0 | 8.0 | 7.0% | 4 |
| DBall.NUKE 0.1 | 8.7 | 6.1% | 0 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 64.1 | 5 / 35 | 4386 |
| 2 | 1 | 65.0 | 76.8 | 7 / 35 | 5447 |
| 3 | 1 | 64.3 | 73.7 | 8 / 35 | 5118 |
| 4 | 1 | 62.5 | 68.6 | 7 / 35 | 4934 |
| 5 | 2 | 62.0 | 69.2 | 8 / 35 | 4466 |
| 6 | 3 | 61.9 | 67.9 | 6 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 19 | 11% |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 89% |
| jekl.StoneGhost 0.7 | 17 | 53% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 14% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 645. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 67 | 39% | 70 |
| jekl.StoneGhost 0.7 | 39 | 23% | 50 |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 16% | 35 |
| gg.Wolverine 2.0 | 13 | 8% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 11 | 6% | 16 |
| mld.Wisdom 1.0 | 9 | 5% | 16 |
| spinnercat.Omen 1.0 | 4 | 2% | 5 |
| DBall.NUKE 0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.4 | 41 / 210 | 2.68 | 17.3% | 36909 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.7% | 68 |
| rtk.Tachikoma 1.0 | 2.0 | 17.6% | 65 |
| hadur117.mini.DeiseFIT 0.2 | 2.2 | 17.3% | 41 |
| franzor.Lizt 1.3.1 | 4.3 | 11.6% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.7% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.1% | 1 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.3% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 85.7 | 10 / 35 | 5910 |
| 2 | 2 | 67.5 | 78.4 | 5 / 35 | 5992 |
| 3 | 2 | 68.5 | 83.5 | 5 / 35 | 6427 |
| 4 | 3 | 68.3 | 81.3 | 9 / 35 | 6010 |
| 5 | 2 | 68.0 | 79.7 | 5 / 35 | 6520 |
| 6 | 2 | 67.9 | 79.7 | 7 / 35 | 6050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 65 | 34% |
| rsalesc.melee.Monk 0.3.6c | 33 | 12% |
| franzor.Lizt 1.3.1 | 14 | 36% |
| oog.melee.CapuletDroid 1.1 | 9 | 78% |
| skm.PateranBotlock2 1.0 | 2 | 100% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 0% |

Hadur died in 169 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 73 | 43% | 107 |
| rsalesc.melee.Monk 0.3.6c | 64 | 38% | 72 |
| franzor.Lizt 1.3.1 | 24 | 14% | 18 |
| oog.melee.CapuletDroid 1.1 | 4 | 2% | 8 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 4 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 1 |

## Melee bench: F08

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 74.8 | 47 / 210 | 3.27 | 15.8% | 30289 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 15.8% | 47 |
| tm.Yuugao 1.0 | 2.3 | 13.2% | 47 |
| shrub.Vapour v159 | 3.0 | 12.7% | 42 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.8% | 21 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 11.3% | 38 |
| jwst.DAD.DarkAndDarker 1.1 | 6.8 | 8.0% | 8 |
| m3thos.Eva00 1.1 | 7.0 | 8.2% | 4 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.3% | 2 |
| SHAM.WOW 1.4 | 8.7 | 6.6% | 3 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.6 | 71.4 | 9 / 35 | 4927 |
| 2 | 1 | 61.9 | 71.1 | 5 / 35 | 4888 |
| 3 | 1 | 63.6 | 75.6 | 5 / 35 | 5279 |
| 4 | 1 | 64.5 | 79.4 | 10 / 35 | 4747 |
| 5 | 1 | 64.3 | 75.2 | 9 / 35 | 5299 |
| 6 | 1 | 64.3 | 76.2 | 9 / 35 | 5149 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 26 | 31% |
| shrub.Vapour v159 | 21 | 38% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 21% |
| Krabb.sliNk.Garm 0.9u | 15 | 60% |
| m3thos.Eva00 1.1 | 8 | 75% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 83% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 45 | 28% | 55 |
| com.spp.robocode.MostlyHarmless 010 | 45 | 28% | 52 |
| shrub.Vapour v159 | 34 | 21% | 42 |
| Krabb.sliNk.Garm 0.9u | 22 | 13% | 34 |
| m3thos.Eva00 1.1 | 5 | 3% | 8 |
| zyx.nano.BacillusComma 1.0 | 5 | 3% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 2% | 8 |
| SHAM.WOW 1.4 | 3 | 2% | 5 |

## Melee bench: F09

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.5 | 54.6 | 6 / 210 | 5.09 | 11.2% | 21930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 19.2% | 138 |
| kc.micro.Figment 1.0 | 2.0 | 15.0% | 37 |
| hadur117.mini.DeiseFIT 0.2 | 3.5 | 11.2% | 6 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 2 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 13 |
| mc2.enemy.Original 0.9 | 5.2 | 9.7% | 10 |
| dft.Calliope 5.6 | 7.0 | 8.0% | 4 |
| step.nanoPri 1.0 | 8.2 | 6.2% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 52.8 | 47.0 | 2 / 35 | 3546 |
| 2 | 3 | 56.0 | 54.0 | 0 / 35 | 4028 |
| 3 | 3 | 57.7 | 61.6 | 1 / 35 | 3356 |
| 4 | 4 | 52.8 | 50.2 | 1 / 35 | 3304 |
| 5 | 3 | 57.2 | 60.0 | 1 / 35 | 3783 |
| 6 | 3 | 56.6 | 54.9 | 1 / 35 | 3913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 15 | 7% |
| kc.micro.Figment 1.0 | 6 | 17% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| mc2.enemy.Original 0.9 | 2 | 50% |
| yagami.Tidus 0.11 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 204 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 81 | 40% | 82 |
| kc.micro.Figment 1.0 | 53 | 26% | 53 |
| mc2.enemy.Original 0.9 | 24 | 12% | 25 |
| pedersen.Grishnakh 1.0 | 23 | 11% | 23 |
| yagami.Tidus 0.11 | 7 | 3% | 9 |
| step.nanoPri 1.0 | 7 | 3% | 8 |
| dft.Calliope 5.6 | 6 | 3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 3 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 75.7 | 42 / 210 | 3.19 | 15.8% | 33494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.3 | 15.8% | 42 |
| DTF.Kludgy 1.2b | 2.2 | 14.6% | 59 |
| ne.Chimera 1.2 | 3.0 | 13.5% | 31 |
| ejb.Polaris 1.0.1 | 3.5 | 13.0% | 31 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.9% | 21 |
| vStar.RAFzilla 2.15 | 5.7 | 10.6% | 17 |
| kurios.DOSexe .9b | 7.3 | 6.2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 0 |
| sam.Samspin 1.0 | 8.8 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.0 | 11 / 35 | 6077 |
| 2 | 1 | 65.1 | 79.7 | 7 / 35 | 5534 |
| 3 | 2 | 61.6 | 65.4 | 5 / 35 | 5508 |
| 4 | 1 | 63.5 | 73.3 | 6 / 35 | 5309 |
| 5 | 1 | 65.3 | 77.8 | 7 / 35 | 5959 |
| 6 | 2 | 63.6 | 76.8 | 6 / 35 | 5107 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ne.Chimera 1.2 | 29 | 38% |
| DTF.Kludgy 1.2b | 29 | 24% |
| ejb.Polaris 1.0.1 | 20 | 50% |
| vStar.RAFzilla 2.15 | 15 | 40% |
| tvv.micro.Antares 1.1.1 | 11 | 64% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 48 | 29% | 53 |
| ne.Chimera 1.2 | 43 | 26% | 54 |
| ejb.Polaris 1.0.1 | 37 | 22% | 52 |
| vStar.RAFzilla 2.15 | 16 | 10% | 21 |
| tvv.micro.Antares 1.1.1 | 14 | 8% | 17 |
| kurios.DOSexe .9b | 4 | 2% | 7 |
| donjezza.Muncho 1.0 | 3 | 2% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 1% | 2 |
| sam.Samspin 1.0 | 1 | 1% | 1 |

## Melee bench: F11

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 65.7 | 18 / 210 | 4.09 | 13.6% | 26355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 18.1% | 109 |
| hadur117.mini.DeiseFIT 0.2 | 2.2 | 13.6% | 18 |
| djc.DynaBot 0.1.1 | 3.5 | 11.1% | 20 |
| cx.mini.Nimrod 0.55 | 3.5 | 11.8% | 31 |
| rdt199.Warlord 0.73 | 5.5 | 9.3% | 16 |
| uji.YellohFellah 1.0 | 6.0 | 8.8% | 7 |
| br2.MobyDickBot 1.6 | 6.7 | 8.7% | 8 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.5 | 65.1 | 3 / 35 | 4192 |
| 2 | 2 | 59.7 | 66.0 | 1 / 35 | 4329 |
| 3 | 2 | 60.6 | 68.3 | 2 / 35 | 4311 |
| 4 | 2 | 59.9 | 62.5 | 5 / 35 | 4841 |
| 5 | 3 | 59.5 | 64.8 | 3 / 35 | 4172 |
| 6 | 2 | 60.7 | 67.3 | 4 / 35 | 4510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 30 | 7% |
| djc.DynaBot 0.1.1 | 10 | 40% |
| cx.mini.Nimrod 0.55 | 9 | 44% |
| rdt199.Warlord 0.73 | 6 | 50% |
| br2.MobyDickBot 1.6 | 5 | 60% |
| uji.YellohFellah 1.0 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 105 | 55% | 109 |
| cx.mini.Nimrod 0.55 | 38 | 20% | 42 |
| djc.DynaBot 0.1.1 | 15 | 8% | 19 |
| rdt199.Warlord 0.73 | 11 | 6% | 13 |
| KiraNL.Chupacabra 0.4 | 6 | 3% | 8 |
| uji.YellohFellah 1.0 | 6 | 3% | 7 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |
| jeremyreeder.Vincent 2011.12.09 | 4 | 2% | 4 |
| br2.MobyDickBot 1.6 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 61.9 | 27 / 210 | 4.43 | 12.8% | 23114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.8 | 14.7% | 63 |
| darkcanuck.Leon 1.01 | 2.2 | 14.0% | 46 |
| nat.PallasHawk 1.0 | 2.5 | 14.0% | 54 |
| hadur117.mini.DeiseFIT 0.2 | 3.5 | 12.8% | 27 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.8% | 15 |
| jrm.Test0 1.0 | 6.0 | 8.9% | 2 |
| jp.Perpy 16.0 | 7.2 | 7.5% | 0 |
| cs.sheldor.Talon 1.1 | 8.0 | 6.8% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.9% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.5% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.2 | 60.0 | 2 / 35 | 3686 |
| 2 | 4 | 55.4 | 56.8 | 4 / 35 | 3411 |
| 3 | 4 | 57.5 | 58.7 | 5 / 35 | 3831 |
| 4 | 3 | 59.8 | 65.1 | 6 / 35 | 3994 |
| 5 | 3 | 60.0 | 65.7 | 4 / 35 | 4062 |
| 6 | 3 | 60.0 | 65.1 | 6 / 35 | 4130 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 21 | 48% |
| nat.PallasHawk 1.0 | 17 | 65% |
| darkcanuck.Leon 1.01 | 13 | 15% |
| brainfade.melee.Genghis 0.36 | 6 | 50% |
| jaybot.bots.Oddball 4.0 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 55 | 30% | 57 |
| bts.wiki.RipCurl 0.9b | 36 | 20% | 44 |
| nat.PallasHawk 1.0 | 31 | 17% | 42 |
| brainfade.melee.Genghis 0.36 | 23 | 13% | 23 |
| jrm.Test0 1.0 | 13 | 7% | 14 |
| jp.Perpy 16.0 | 9 | 5% | 9 |
| cs.sheldor.Talon 1.1 | 8 | 4% | 9 |
| jaybot.bots.Oddball 4.0 | 5 | 3% | 6 |
| stuff.Vlad 0.1 | 4 | 2% | 6 |

## Melee bench: F13

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.9 | 58.0 | 2 / 210 | 4.78 | 11.5% | 23183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.0 | 18.2% | 113 |
| ags.Glacier 0.2.11 | 2.0 | 17.0% | 54 |
| shinh.Entangled 0.3 | 3.3 | 12.6% | 24 |
| gh.micro.Gruweltje 0.7 | 4.0 | 12.2% | 15 |
| hadur117.mini.DeiseFIT 0.2 | 4.7 | 11.5% | 2 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.3% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 57.3 | 58.4 | 0 / 35 | 3946 |
| 2 | 5 | 55.5 | 54.3 | 0 / 35 | 3638 |
| 3 | 5 | 56.6 | 58.1 | 0 / 35 | 3711 |
| 4 | 3 | 59.5 | 62.9 | 1 / 35 | 4416 |
| 5 | 5 | 54.2 | 50.8 | 0 / 35 | 3777 |
| 6 | 5 | 58.4 | 63.5 | 1 / 35 | 3695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 6 | 0% |
| ags.Glacier 0.2.11 | 5 | 0% |
| stelo.Wang 1.0 | 3 | 67% |
| shinh.Entangled 0.3 | 1 | 0% |
| gh.micro.Gruweltje 0.7 | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 75 | 36% | 76 |
| mn.Combat 3.25.0 | 55 | 26% | 56 |
| shinh.Entangled 0.3 | 31 | 15% | 31 |
| gh.micro.Gruweltje 0.7 | 26 | 13% | 26 |
| stelo.Wang 1.0 | 8 | 4% | 8 |
| apc.Colossus2 0.17 | 7 | 3% | 7 |
| maribo.FollowFire 1 | 6 | 3% | 6 |

## Melee bench: F14

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 83.5 | 81 / 210 | 2.48 | 18.0% | 34950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 18.0% | 81 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.1% | 67 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.1% | 39 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 10.1% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.2 | 10.0% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.4% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 6.0 | 9.1% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 8.3% | 4 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.7 | 13 / 35 | 5970 |
| 2 | 1 | 68.5 | 84.1 | 14 / 35 | 6257 |
| 3 | 1 | 65.8 | 81.6 | 11 / 35 | 5211 |
| 4 | 1 | 66.7 | 81.3 | 13 / 35 | 5496 |
| 5 | 1 | 69.5 | 87.9 | 15 / 35 | 6227 |
| 6 | 1 | 67.9 | 80.6 | 15 / 35 | 5789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 67 | 54% |
| catcat20.shape.Theta 0.018 | 32 | 63% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| Lo_Ian.Gandalf_V4 4.0 | 8 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 5 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 62 | 48% | 99 |
| catcat20.shape.Theta 0.018 | 29 | 22% | 45 |
| Lo_Ian.Gandalf_V4 4.0 | 10 | 8% | 15 |
| sanyi.mikrobi.Roberto 1.0 | 9 | 7% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 6% | 12 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 5% | 15 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 3% | 7 |
| pa.Improved 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 74.3 | 74 / 210 | 3.31 | 16.7% | 32836 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 16.7% | 74 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.7% | 24 |
| emp.Yngwie 1.11 | 2.8 | 13.6% | 65 |
| mld.DustBunny 3.8 | 4.3 | 11.8% | 7 |
| cb.nano.Insomnia 1.0 | 4.3 | 11.8% | 16 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.6% | 20 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.8% | 0 |
| lambdaxy.TBot 0.1 | 8.2 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.3 | 5.4% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 74.6 | 11 / 35 | 5165 |
| 2 | 1 | 64.3 | 72.7 | 9 / 35 | 5109 |
| 3 | 1 | 68.7 | 82.9 | 14 / 35 | 6235 |
| 4 | 1 | 65.5 | 75.2 | 14 / 35 | 5347 |
| 5 | 1 | 66.5 | 77.1 | 14 / 35 | 5595 |
| 6 | 1 | 62.6 | 63.2 | 12 / 35 | 5385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 67% |
| kawigi.micro.Shiz 1.1 | 20 | 100% |
| mld.DustBunny 3.8 | 14 | 93% |
| cb.nano.Insomnia 1.0 | 14 | 57% |
| kawigi.robot.Girl 1.2 | 11 | 64% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 62 | 45% | 96 |
| cb.nano.Insomnia 1.0 | 21 | 15% | 19 |
| mld.DustBunny 3.8 | 14 | 10% | 30 |
| kawigi.micro.Shiz 1.1 | 13 | 9% | 21 |
| kawigi.robot.Girl 1.2 | 12 | 9% | 19 |
| divineomega.TrialBot 0.003 | 6 | 4% | 13 |
| lambdaxy.TBot 0.1 | 5 | 4% | 7 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.3 | 30 / 210 | 3.85 | 14.8% | 30539 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 18.1% | 94 |
| hadur117.mini.DeiseFIT 0.2 | 2.0 | 14.8% | 30 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.8% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 12.1% | 57 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.2% | 7 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 9.0% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 5 |
| asd.Cthulhu 1.3 | 8.7 | 5.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.2% | 4 |
| repositorio.NanoStep 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 65.7 | 6 / 35 | 4875 |
| 2 | 3 | 59.2 | 60.3 | 3 / 35 | 4559 |
| 3 | 2 | 60.2 | 64.8 | 3 / 35 | 4519 |
| 4 | 2 | 63.5 | 69.2 | 6 / 35 | 5415 |
| 5 | 1 | 67.7 | 80.6 | 8 / 35 | 6080 |
| 6 | 2 | 62.9 | 69.2 | 4 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 38 | 24% |
| techdude.forest.FlamingForest 1.1 | 17 | 35% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |
| tvv.nano.Polaris 1.2 | 2 | 50% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 89 | 49% | 100 |
| techdude.forest.FlamingForest 1.1 | 35 | 19% | 42 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 13% | 27 |
| divineomega.DivineBot 1.9.4.5 | 8 | 4% | 12 |
| bvh.fnr.Fenrir 0.36l | 8 | 4% | 9 |
| tvv.nano.Polaris 1.2 | 7 | 4% | 7 |
| stelo.IntrinsicVolatility 1.4 | 6 | 3% | 9 |
| asd.Cthulhu 1.3 | 3 | 2% | 4 |

## Melee bench: F17

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 56.2 | 17 / 210 | 4.94 | 12.2% | 28008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 1.7 | 14.0% | 35 |
| cx.BlestPain 1.41 | 2.7 | 13.4% | 62 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.0% | 46 |
| hadur117.mini.DeiseFIT 0.2 | 3.8 | 12.2% | 17 |
| ahf.NanoAndrew .4 | 4.5 | 11.9% | 27 |
| nic.Nicator 2.4 | 5.5 | 11.3% | 19 |
| maribo.melee.BMV 0.1 | 6.8 | 9.6% | 4 |
| tex.Longbot 0.4 | 8.3 | 6.0% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.6 | 53.7 | 1 / 35 | 4303 |
| 2 | 5 | 56.2 | 53.0 | 3 / 35 | 4473 |
| 3 | 2 | 60.2 | 61.6 | 4 / 35 | 5176 |
| 4 | 5 | 55.5 | 52.1 | 2 / 35 | 4658 |
| 5 | 3 | 58.9 | 59.0 | 3 / 35 | 4779 |
| 6 | 4 | 58.5 | 57.8 | 4 / 35 | 4619 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 15 | 60% |
| ahf.NanoAndrew .4 | 7 | 14% |
| oog.melee.Mercutio 1.0 | 6 | 50% |
| cx.BlestPain 1.41 | 3 | 33% |
| maribo.melee.BMV 0.1 | 3 | 0% |
| nic.Nicator 2.4 | 2 | 50% |
| goblin.Bender 2.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 584. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 39 | 20% | 40 |
| ahf.NanoAndrew .4 | 38 | 19% | 40 |
| et.Predator 1.8 | 35 | 18% | 44 |
| oog.melee.Mercutio 1.0 | 30 | 15% | 33 |
| maribo.melee.BMV 0.1 | 24 | 12% | 24 |
| nic.Nicator 2.4 | 16 | 8% | 17 |
| tex.Longbot 0.4 | 8 | 4% | 8 |
| goblin.Bender 2.4 | 2 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 61.8 | 37 / 210 | 4.44 | 13.5% | 27770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.5 | 13.5% | 37 |
| morbid.MorbidPriest 1.0 | 2.7 | 13.6% | 59 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.8% | 50 |
| uji.DBH 1.1 | 3.5 | 12.0% | 23 |
| ratosh.Nobo 0.21 | 4.7 | 11.0% | 4 |
| spinnercat.Robovirus 2.718 | 6.3 | 9.1% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 8.0% | 7 |
| sigterm.Sigterm 1.0 | 7.3 | 8.1% | 9 |
| stelo.WangRobot 1.0 | 9.0 | 6.3% | 14 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 58.8 | 61.6 | 5 / 35 | 4674 |
| 2 | 2 | 59.7 | 62.9 | 6 / 35 | 4437 |
| 3 | 3 | 56.6 | 55.6 | 6 / 35 | 4251 |
| 4 | 1 | 59.9 | 63.8 | 5 / 35 | 4600 |
| 5 | 1 | 60.5 | 64.8 | 6 / 35 | 4786 |
| 6 | 1 | 60.7 | 62.2 | 9 / 35 | 5022 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 54% |
| agd.Mooserwirt2 2.7 | 18 | 6% |
| uji.DBH 1.1 | 8 | 63% |
| sigterm.Sigterm 1.0 | 7 | 86% |
| spinnercat.Robovirus 2.718 | 6 | 100% |
| ratosh.Nobo 0.21 | 4 | 100% |
| stelo.WangRobot 1.0 | 3 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 0% |

Hadur died in 173 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agd.Mooserwirt2 2.7 | 48 | 28% | 53 |
| uji.DBH 1.1 | 44 | 25% | 45 |
| morbid.MorbidPriest 1.0 | 34 | 20% | 48 |
| ratosh.Nobo 0.21 | 12 | 7% | 17 |
| spinnercat.Robovirus 2.718 | 9 | 5% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9 | 5% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 5% | 8 |
| sigterm.Sigterm 1.0 | 7 | 4% | 12 |
| stelo.WangRobot 1.0 | 2 | 1% | 7 |

## Melee bench: F19

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.5 | 152 / 210 | 1.68 | 20.7% | 36438 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 20.7% | 152 |
| mld.Infinity 2.2 | 2.5 | 13.3% | 25 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 13.5% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 11.3% | 5 |
| erdnis.Rover 0.3 | 4.7 | 10.6% | 2 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.6% | 3 |
| pac.ABC 2.1 | 7.5 | 7.3% | 2 |
| mbh.Mbh 0.1 | 8.2 | 7.0% | 1 |
| pbg.R2D2 1.0 | 8.3 | 6.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.4 | 23 / 35 | 5737 |
| 2 | 1 | 71.6 | 94.6 | 24 / 35 | 6196 |
| 3 | 1 | 71.9 | 92.7 | 27 / 35 | 6308 |
| 4 | 1 | 71.2 | 91.4 | 27 / 35 | 5925 |
| 5 | 1 | 71.0 | 90.5 | 25 / 35 | 6117 |
| 6 | 1 | 72.1 | 94.3 | 26 / 35 | 6155 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 87 | 90% |
| mld.Infinity 2.2 | 35 | 69% |
| krillr.mini.JointStrike 2.0.0 | 19 | 95% |
| erdnis.Rover 0.3 | 13 | 85% |
| patson.PatsonTestBot 1.0 | 9 | 78% |
| pbg.R2D2 1.0 | 7 | 100% |
| pac.ABC 2.1 | 4 | 75% |
| mbh.Mbh 0.1 | 4 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 19 | 33% | 46 |
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 28% | 60 |
| patson.PatsonTestBot 1.0 | 8 | 14% | 18 |
| erdnis.Rover 0.3 | 6 | 10% | 36 |
| krillr.mini.JointStrike 2.0.0 | 6 | 10% | 23 |
| pac.ABC 2.1 | 2 | 3% | 11 |
| pbg.R2D2 1.0 | 1 | 2% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 73.6 | 50 / 210 | 3.38 | 16.3% | 34197 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.3 | 16.3% | 50 |
| trm.Wrekt 1.1.6.f | 1.7 | 16.8% | 81 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.2% | 7 |
| catcat20.Rabbit 0.001 | 4.0 | 10.6% | 26 |
| fwb.Nine 1.0.1 | 4.2 | 10.8% | 24 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.8% | 5 |
| bayen.nut.Squirrel 1.615 | 7.0 | 8.0% | 11 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.9% | 4 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.5% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 68.6 | 6 / 35 | 5400 |
| 2 | 1 | 65.5 | 75.9 | 10 / 35 | 5776 |
| 3 | 1 | 67.0 | 78.4 | 10 / 35 | 6152 |
| 4 | 2 | 63.1 | 67.6 | 7 / 35 | 5399 |
| 5 | 1 | 65.2 | 75.9 | 9 / 35 | 5789 |
| 6 | 1 | 65.0 | 75.2 | 8 / 35 | 5681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 48 | 44% |
| catcat20.Rabbit 0.001 | 18 | 67% |
| fwb.Nine 1.0.1 | 14 | 29% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| nz.jdc.nano.GridFu 1.0 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 4 | 50% |
| m3thos.mini.Eva01 0.5.5 | 3 | 67% |
| ntc.ControlledChaos 1.1.4 | 1 | 0% |

Hadur died in 160 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 73 | 46% | 86 |
| fwb.Nine 1.0.1 | 21 | 13% | 22 |
| bayen.nut.Squirrel 1.615 | 18 | 11% | 22 |
| catcat20.Rabbit 0.001 | 17 | 11% | 33 |
| nz.jdc.nano.GridFu 1.0 | 16 | 10% | 22 |
| m3thos.mini.Eva01 0.5.5 | 6 | 4% | 9 |
| ntc.ControlledChaos 1.1.4 | 5 | 3% | 7 |
| djdjdj.NanoSkunk10 1.0 | 4 | 3% | 9 |

## Melee bench: F21

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.9 | 87 / 210 | 2.18 | 19.2% | 37532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.2 | 19.2% | 87 |
| eem.EvBot v4.6.16 | 1.8 | 17.3% | 104 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.3% | 7 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.4% | 6 |
| eld.Hmm 1.0 | 5.3 | 8.7% | 8 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.3% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.7% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.3 | 16 / 35 | 6523 |
| 2 | 1 | 71.7 | 92.7 | 18 / 35 | 6935 |
| 3 | 1 | 68.9 | 86.7 | 15 / 35 | 6117 |
| 4 | 1 | 69.9 | 87.3 | 13 / 35 | 6400 |
| 5 | 2 | 68.0 | 81.9 | 14 / 35 | 5638 |
| 6 | 1 | 68.1 | 84.4 | 11 / 35 | 5919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 97 | 38% |
| dummy.mini.Scimitar 1.01 | 22 | 100% |
| cf.RiO.RiOx 4.2.1 | 20 | 80% |
| eld.Hmm 1.0 | 9 | 67% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1181. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 91 | 73% | 113 |
| cf.RiO.RiOx 4.2.1 | 13 | 10% | 28 |
| dummy.mini.Scimitar 1.01 | 10 | 8% | 32 |
| eld.Hmm 1.0 | 7 | 6% | 23 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 10 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 68.6 | 19 / 210 | 3.82 | 14.4% | 30187 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 18.8% | 108 |
| hadur117.mini.DeiseFIT 0.2 | 2.5 | 14.4% | 19 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.2% | 39 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.0% | 27 |
| bigpete.Stewie 1.0 | 4.7 | 11.5% | 16 |
| yk.JahRoslav 1.1 | 6.2 | 7.5% | 1 |
| tad.Dalek98 0.98 | 7.2 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.8 | 5.7% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 71.7 | 2 / 35 | 5142 |
| 2 | 3 | 62.2 | 67.0 | 4 / 35 | 4887 |
| 3 | 2 | 62.7 | 68.3 | 3 / 35 | 5169 |
| 4 | 2 | 63.7 | 71.1 | 5 / 35 | 5234 |
| 5 | 3 | 60.9 | 63.8 | 1 / 35 | 4971 |
| 6 | 3 | 62.5 | 69.8 | 4 / 35 | 4784 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 26 | 12% |
| jlm.javaDisturbance 0.59 | 14 | 43% |
| kvk.HebusLeTroll 0.35 | 9 | 44% |
| bigpete.Stewie 1.0 | 8 | 38% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 100 | 52% | 106 |
| kvk.HebusLeTroll 0.35 | 37 | 19% | 41 |
| bigpete.Stewie 1.0 | 25 | 13% | 29 |
| jlm.javaDisturbance 0.59 | 24 | 13% | 27 |
| tad.Dalek98 0.98 | 3 | 2% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.1 | 51 / 210 | 2.88 | 16.7% | 31602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.7% | 110 |
| hadur117.mini.DeiseFIT 0.2 | 2.0 | 16.7% | 51 |
| cre.Karolos 0.32 | 2.8 | 14.4% | 33 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.7% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.4% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 9.0% | 1 |
| sample.Walls 1.0 | 6.8 | 8.3% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 8.1% | 2 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 80.3 | 9 / 35 | 5727 |
| 2 | 3 | 64.4 | 73.7 | 6 / 35 | 4640 |
| 3 | 2 | 65.1 | 76.5 | 9 / 35 | 4876 |
| 4 | 2 | 67.7 | 81.6 | 6 / 35 | 5528 |
| 5 | 1 | 67.7 | 80.6 | 12 / 35 | 5284 |
| 6 | 2 | 68.0 | 81.9 | 9 / 35 | 5547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 53 | 15% |
| cre.Karolos 0.32 | 29 | 41% |
| stelo.AreaTargetingBot 1.1 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| sample.Walls 1.0 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 1 | 0% |

Hadur died in 159 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 97 | 61% | 115 |
| cre.Karolos 0.32 | 40 | 25% | 53 |
| stelo.RamTrackSurfer 1.2 | 9 | 6% | 17 |
| stelo.AreaTargetingBot 1.1 | 4 | 3% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 3% | 7 |
| cw.megas.Blade 0.8 | 3 | 2% | 3 |
| sample.Walls 1.0 | 2 | 1% | 6 |

## Melee bench: F24

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.3 | 57.4 | 15 / 210 | 4.84 | 11.8% | 22935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 1.7 | 14.4% | 50 |
| florent.XSeries.X2 0.12 | 2.0 | 13.9% | 56 |
| davidalves.Phoenix 0.54 | 2.5 | 13.3% | 48 |
| hadur117.mini.DeiseFIT 0.2 | 4.0 | 11.8% | 15 |
| pedersen.Ugluk 1.1.1 | 5.3 | 11.0% | 20 |
| oog.melee.Corsair 1.0 | 5.8 | 10.4% | 12 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.9% | 9 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.4% | 0 |
| evd.X1 0.01 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 56.9 | 57.8 | 4 / 35 | 3813 |
| 2 | 4 | 55.8 | 55.9 | 1 / 35 | 3752 |
| 3 | 4 | 57.2 | 58.4 | 2 / 35 | 3943 |
| 4 | 4 | 56.7 | 58.4 | 2 / 35 | 3942 |
| 5 | 3 | 57.3 | 61.3 | 3 / 35 | 3853 |
| 6 | 4 | 53.9 | 52.4 | 3 / 35 | 3632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 9 | 11% |
| rz.GlowBlowMelee 1.4 | 8 | 38% |
| stelo.SoJNanoMelee 1.1 | 7 | 71% |
| florent.XSeries.X2 0.12 | 6 | 17% |
| pedersen.Ugluk 1.1.1 | 4 | 50% |
| oog.melee.Corsair 1.0 | 3 | 67% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 48 | 25% | 49 |
| davidalves.Phoenix 0.54 | 44 | 23% | 46 |
| rz.GlowBlowMelee 1.4 | 41 | 21% | 44 |
| oog.melee.Corsair 1.0 | 27 | 14% | 30 |
| pedersen.Ugluk 1.1.1 | 16 | 8% | 18 |
| stelo.SoJNanoMelee 1.1 | 10 | 5% | 11 |
| as.FrankTheTank 1.3 | 4 | 2% | 5 |
| evd.X1 0.01 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |

## Melee bench: F25

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 76.7 | 84 / 210 | 3.10 | 16.4% | 26556 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 16.4% | 84 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.8% | 36 |
| jdw.Hurricane 1.4 | 3.3 | 11.9% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.6% | 23 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 10.1% | 19 |
| ds.Oo 2.2 | 6.0 | 8.8% | 14 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.9% | 8 |
| awesomeness.Elite 1.0 | 8.2 | 7.2% | 4 |
| adt.Ar2 1.1 | 8.3 | 6.9% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 76.2 | 12 / 35 | 4647 |
| 2 | 1 | 64.6 | 74.6 | 16 / 35 | 4467 |
| 3 | 1 | 65.7 | 80.0 | 16 / 35 | 4562 |
| 4 | 1 | 64.5 | 76.8 | 11 / 35 | 4360 |
| 5 | 1 | 63.6 | 74.0 | 15 / 35 | 4261 |
| 6 | 1 | 65.0 | 78.4 | 14 / 35 | 4259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 37 | 65% |
| voidious.micro.BlitzBat 1.05 | 34 | 85% |
| jdw.Hurricane 1.4 | 18 | 89% |
| gre.svman4.Morfeas 1.4.1 | 12 | 25% |
| ds.Oo 2.2 | 8 | 38% |
| awesomeness.Elite 1.0 | 3 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| adt.Ar2 1.1 | 3 | 67% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 26 | 20% | 55 |
| jdw.Hurricane 1.4 | 19 | 15% | 30 |
| gre.svman4.Morfeas 1.4.1 | 19 | 15% | 21 |
| voidious.micro.BlitzBat 1.05 | 18 | 14% | 35 |
| ds.Oo 2.2 | 14 | 11% | 19 |
| gjr.Cephalosporin 0.1 | 11 | 9% | 24 |
| awesomeness.Elite 1.0 | 9 | 7% | 13 |
| adt.Ar2 1.1 | 7 | 5% | 10 |
| amk.ChumbaMini 0.2 | 3 | 2% | 3 |
3 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 70.7 | 33 / 210 | 3.64 | 15.1% | 33363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ak.Fermat 2.0 | 1.2 | 17.2% | 102 |
| hadur117.mini.DeiseFIT 0.2 | 1.8 | 15.1% | 33 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 18 |
| shu.nitro.LENIN .T34 | 3.8 | 11.8% | 28 |
| js.PinBall 1.6 | 4.8 | 11.2% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.5% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.6% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 68.3 | 5 / 35 | 5251 |
| 2 | 2 | 64.1 | 72.1 | 4 / 35 | 5669 |
| 3 | 2 | 62.7 | 69.2 | 4 / 35 | 5404 |
| 4 | 2 | 62.4 | 67.0 | 6 / 35 | 5326 |
| 5 | 2 | 65.0 | 73.3 | 6 / 35 | 5877 |
| 6 | 1 | 65.4 | 74.3 | 8 / 35 | 5836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 29 | 14% |
| shu.nitro.LENIN .T34 | 10 | 90% |
| lrem.Spectre 0.4.4 | 9 | 89% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 43% |
| js.PinBall 1.6 | 7 | 43% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 91 | 51% | 93 |
| js.PinBall 1.6 | 24 | 13% | 26 |
| shu.nitro.LENIN .T34 | 17 | 9% | 26 |
| jaybot.adv.bots.JayBot 2.0 | 14 | 8% | 18 |
| lrem.Spectre 0.4.4 | 12 | 7% | 20 |
| gh.mini.GrubbmOne 1.0 | 12 | 7% | 15 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 2% | 8 |
| sample.SpinBot 1.0 | 4 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 75.8 | 75 / 210 | 3.18 | 16.3% | 29485 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.3 | 16.3% | 75 |
| mk.Alpha 0.2.1 | 1.7 | 15.0% | 85 |
| EH.Eagle 1.0.6 | 3.7 | 11.2% | 5 |
| wee.Gem 1.8.4 | 4.5 | 10.9% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.8% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.5% | 2 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.5% | 6 |
| joe.ADinosaur 1.0 | 7.2 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 72.4 | 9 / 35 | 4352 |
| 2 | 1 | 65.7 | 80.3 | 12 / 35 | 4965 |
| 3 | 1 | 68.0 | 75.9 | 15 / 35 | 6204 |
| 4 | 1 | 63.1 | 75.2 | 12 / 35 | 4378 |
| 5 | 2 | 63.2 | 71.7 | 13 / 35 | 4500 |
| 6 | 1 | 66.0 | 79.0 | 14 / 35 | 5086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 46 | 28% |
| EH.Eagle 1.0.6 | 22 | 100% |
| wee.Gem 1.8.4 | 13 | 69% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 82% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |
| cs.Grudge 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 75 | 55% | 97 |
| joe.ADinosaur 1.0 | 17 | 13% | 20 |
| wee.Gem 1.8.4 | 13 | 10% | 24 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 6% | 16 |
| throxbot.ThroxBot 0.1 | 7 | 5% | 9 |
| EH.Eagle 1.0.6 | 6 | 4% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 4% | 12 |
| caimano.Furia_Ceca 0.22 | 3 | 2% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.1 | 75 / 210 | 2.97 | 16.6% | 28811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.2 | 16.6% | 75 |
| kid.test.NightFox .2 | 2.2 | 14.2% | 36 |
| uji.Antique 1.0 | 2.7 | 13.5% | 52 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.5% | 26 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.7% | 7 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.4% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.3% | 9 |
| matt.advanced.Katana 1.0 | 8.0 | 6.6% | 4 |
| stelo.PianistNano 1.2 | 9.3 | 5.3% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.2 | 15 / 35 | 4889 |
| 2 | 2 | 62.7 | 70.8 | 10 / 35 | 4515 |
| 3 | 1 | 65.6 | 79.0 | 12 / 35 | 5065 |
| 4 | 1 | 65.4 | 76.5 | 14 / 35 | 4762 |
| 5 | 1 | 66.8 | 82.2 | 16 / 35 | 4865 |
| 6 | 1 | 64.2 | 78.1 | 8 / 35 | 4715 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 51 | 86% |
| uji.Antique 1.0 | 28 | 25% |
| qohnil.blot.BlotBot 3.61 | 13 | 54% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| pfvicm.Sobieski 7.2.3b | 6 | 83% |
| ahr.ice.Ice 1.0.2 | 6 | 50% |
| matt.advanced.Katana 1.0 | 3 | 67% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 49 | 36% | 65 |
| pfvicm.Sobieski 7.2.3b | 25 | 18% | 30 |
| qohnil.blot.BlotBot 3.61 | 21 | 15% | 36 |
| kid.test.NightFox .2 | 16 | 12% | 37 |
| amk.ChumbaWumba 0.3 | 13 | 10% | 16 |
| ahr.ice.Ice 1.0.2 | 7 | 5% | 12 |
| matt.advanced.Katana 1.0 | 3 | 2% | 11 |
| stelo.PianistNano 1.2 | 2 | 1% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 70.3 | 30 / 210 | 3.68 | 15.3% | 30162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 16.7% | 89 |
| deewiant.Anomaly 0.2 | 2.0 | 16.1% | 69 |
| hadur117.mini.DeiseFIT 0.2 | 2.3 | 15.3% | 30 |
| myl.micro.Troodon 1.10 | 4.3 | 11.7% | 13 |
| jok.PheonixM 0.1.2 | 4.7 | 9.8% | 2 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.1% | 0 |
| DBall.Anarchy 0.1 | 8.2 | 6.0% | 3 |
| ap.Frederick 1.1 | 8.3 | 5.4% | 3 |
| jangs.ns51 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 67.3 | 5 / 35 | 4829 |
| 2 | 2 | 62.5 | 67.0 | 4 / 35 | 4854 |
| 3 | 3 | 64.4 | 71.7 | 4 / 35 | 5160 |
| 4 | 3 | 64.7 | 72.7 | 4 / 35 | 5379 |
| 5 | 1 | 66.0 | 76.8 | 7 / 35 | 5525 |
| 6 | 3 | 61.7 | 66.0 | 6 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 38 | 21% |
| zyx.mega.YersiniaPestis 3.1 | 27 | 15% |
| myl.micro.Troodon 1.10 | 8 | 75% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| ph.melee.ArcherME 0.3 | 4 | 75% |
| ap.Frederick 1.1 | 1 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 76 | 42% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 69 | 38% | 74 |
| myl.micro.Troodon 1.10 | 19 | 10% | 21 |
| ph.melee.ArcherME 0.3 | 7 | 4% | 10 |
| jok.PheonixM 0.1.2 | 5 | 3% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 2% | 5 |
| DBall.Anarchy 0.1 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 1 | 1% | 2 |

## Melee bench: F30

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 49.9 | 42.5 | 3 / 210 | 6.18 | 9.1% | 20651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.4% | 56 |
| darkcanuck.B26354 1.06 | 2.0 | 14.6% | 57 |
| oog.melee.Capulet 1.2 | 3.0 | 13.5% | 30 |
| stelo.PastFuture 2.3.2 | 3.2 | 13.4% | 36 |
| hadur117.mini.DeiseFIT 0.2 | 5.3 | 9.1% | 3 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.9% | 12 |
| tripphippy.Alice 1.1 | 7.2 | 8.0% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 7.3 | 8.1% | 8 |
| ntc.Opposite 1.5 | 8.7 | 7.5% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 50.1 | 43.2 | 0 / 35 | 3529 |
| 2 | 5 | 52.2 | 47.0 | 1 / 35 | 3593 |
| 3 | 6 | 47.5 | 39.0 | 0 / 35 | 3128 |
| 4 | 6 | 49.5 | 42.2 | 1 / 35 | 3280 |
| 5 | 5 | 49.8 | 39.4 | 1 / 35 | 3666 |
| 6 | 5 | 50.3 | 44.1 | 0 / 35 | 3455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 8 | 13% |
| tripphippy.Alice 1.1 | 1 | 0% |
| intruder.PrairieWolf 2.61 | 1 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 444. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 43 | 21% | 43 |
| darkcanuck.B26354 1.06 | 40 | 19% | 40 |
| catcat20.Matcha 0.006 | 35 | 17% | 37 |
| stelo.PastFuture 2.3.2 | 35 | 17% | 36 |
| ntc.Opposite 1.5 | 15 | 7% | 15 |
| tripphippy.Alice 1.1 | 15 | 7% | 15 |
| intruder.PrairieWolf 2.61 | 14 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 3% | 7 |
| GarmBox.Anger 1.0 | 3 | 1% | 3 |

## Melee bench: F31

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.1 | 51.9 | 4 / 210 | 5.33 | 10.6% | 20567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 19.4% | 145 |
| gh.mini.Griezel 0.2 | 2.0 | 13.9% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.3 | 11.7% | 6 |
| d414.nano.Quantum 1.0.0 | 3.7 | 11.6% | 13 |
| hadur117.mini.DeiseFIT 0.2 | 5.0 | 10.6% | 4 |
| gh.nano.Grofvuil 0.2 | 6.5 | 9.1% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 7.3% | 3 |
| fm.mammillarias 1.3 | 7.3 | 6.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 53.4 | 51.7 | 1 / 35 | 3123 |
| 2 | 5 | 51.3 | 45.7 | 0 / 35 | 3154 |
| 3 | 5 | 55.1 | 54.0 | 2 / 35 | 3426 |
| 4 | 5 | 54.3 | 53.7 | 0 / 35 | 3476 |
| 5 | 5 | 55.3 | 52.7 | 1 / 35 | 3702 |
| 6 | 5 | 54.9 | 53.7 | 0 / 35 | 3686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 11 | 9% |
| gh.mini.Griezel 0.2 | 7 | 0% |
| d414.nano.Quantum 1.0.0 | 2 | 100% |
| spinnercat.micro.Tyger 0.1 | 2 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 206 of 210 rounds, at a mean tick of 521. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 62 | 30% | 63 |
| gh.mini.Griezel 0.2 | 60 | 29% | 60 |
| gh.nano.Grofvuil 0.2 | 26 | 13% | 27 |
| spinnercat.micro.Tyger 0.1 | 25 | 12% | 25 |
| d414.nano.Quantum 1.0.0 | 14 | 7% | 16 |
| Gecko.ultimateGeckoBot 1.0 | 9 | 4% | 9 |
| timmit.nano.TimDog 0.33 | 7 | 3% | 7 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 0% | 1 |

## Melee bench: F32

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 73.7 | 47 / 210 | 3.37 | 15.2% | 27735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 1.3 | 15.1% | 77 |
| hadur117.mini.DeiseFIT 0.2 | 1.7 | 15.2% | 47 |
| apc.botM 3.0 | 3.2 | 13.0% | 36 |
| lxx.ConceptA 0.8 | 4.0 | 11.2% | 13 |
| vjik.UnViolation 1.1 | 5.2 | 10.2% | 17 |
| bayen.UbaMicro 1.4 | 5.7 | 9.3% | 8 |
| yk.JahMicro 1.0 | 7.8 | 6.9% | 4 |
| panzer.Panzer 0.2 | 8.0 | 7.2% | 2 |
| conscience.Electron 1.3g | 8.5 | 6.6% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.3% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 69.8 | 3 / 35 | 4339 |
| 2 | 1 | 66.2 | 83.8 | 12 / 35 | 5012 |
| 3 | 1 | 64.1 | 77.5 | 10 / 35 | 4942 |
| 4 | 2 | 61.0 | 67.9 | 5 / 35 | 4695 |
| 5 | 2 | 61.6 | 71.1 | 10 / 35 | 4216 |
| 6 | 2 | 62.2 | 72.1 | 7 / 35 | 4531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 26% |
| lxx.ConceptA 0.8 | 20 | 80% |
| apc.botM 3.0 | 17 | 29% |
| vjik.UnViolation 1.1 | 6 | 67% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| donjezza.Jezza 1.0 | 3 | 33% |
| yk.JahMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 618. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 61 | 37% | 70 |
| apc.botM 3.0 | 46 | 28% | 58 |
| lxx.ConceptA 0.8 | 21 | 13% | 29 |
| vjik.UnViolation 1.1 | 15 | 9% | 22 |
| bayen.UbaMicro 1.4 | 12 | 7% | 15 |
| conscience.Electron 1.3g | 5 | 3% | 8 |
| donjezza.Jezza 1.0 | 2 | 1% | 3 |
| yk.JahMicro 1.0 | 2 | 1% | 3 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F33

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 63.2 | 22 / 210 | 4.31 | 13.6% | 27095 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.8% | 96 |
| hadur117.mini.DeiseFIT 0.2 | 2.5 | 13.6% | 22 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 26 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.6% | 29 |
| labg.Cataclysm 2.05 | 5.0 | 10.4% | 23 |
| baal.nano.N 1.42 | 5.8 | 9.8% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.7% | 8 |
| sanja.First 0.1 | 8.7 | 5.3% | 0 |
| zyx.micro.Ant 1.1 | 8.7 | 5.2% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.7 | 61.6 | 2 / 35 | 4356 |
| 2 | 3 | 60.7 | 63.2 | 1 / 35 | 4644 |
| 3 | 4 | 55.0 | 51.4 | 3 / 35 | 3723 |
| 4 | 2 | 63.6 | 72.1 | 7 / 35 | 5070 |
| 5 | 2 | 61.7 | 66.3 | 6 / 35 | 4526 |
| 6 | 2 | 60.8 | 64.4 | 3 / 35 | 4776 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 35 | 29% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 29% |
| gre.svman4.Leonidas 1.3.2 | 12 | 25% |
| labg.Cataclysm 2.05 | 4 | 0% |
| kinsen.melee.Angsaichmophobia 1.8c | 2 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 76 | 40% | 86 |
| gre.svman4.Leonidas 1.3.2 | 29 | 15% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 24 | 13% | 26 |
| labg.Cataclysm 2.05 | 19 | 10% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 7% | 14 |
| baal.nano.N 1.42 | 11 | 6% | 12 |
| zyx.micro.Ant 1.1 | 7 | 4% | 8 |
| sanja.First 0.1 | 4 | 2% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 2% | 4 |

## Melee bench: F34

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 62.1 | 11 / 210 | 4.41 | 12.7% | 26540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.0 | 17.9% | 102 |
| kid.Gladiator .7.2 | 2.0 | 17.0% | 55 |
| hadur117.mini.DeiseFIT 0.2 | 3.3 | 12.7% | 11 |
| tcf.Reach 3 | 4.0 | 12.3% | 15 |
| jcs.Seth 1.8 | 4.8 | 11.1% | 19 |
| cli.Dancer 1.1 | 5.8 | 10.0% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.5 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 60.0 | 0 / 35 | 4075 |
| 2 | 4 | 58.3 | 59.0 | 1 / 35 | 4287 |
| 3 | 3 | 61.2 | 64.1 | 4 / 35 | 4911 |
| 4 | 3 | 61.1 | 62.9 | 3 / 35 | 4738 |
| 5 | 3 | 58.8 | 60.3 | 1 / 35 | 4125 |
| 6 | 3 | 61.2 | 66.3 | 2 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 17 | 24% |
| kid.Gladiator .7.2 | 10 | 30% |
| tcf.Reach 3 | 7 | 14% |
| cli.Dancer 1.1 | 4 | 25% |
| jcs.Seth 1.8 | 3 | 33% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 606. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 62 | 31% | 66 |
| kid.Gladiator .7.2 | 57 | 29% | 60 |
| tcf.Reach 3 | 39 | 20% | 40 |
| cli.Dancer 1.1 | 21 | 11% | 23 |
| jcs.Seth 1.8 | 13 | 7% | 15 |
| ratosh.Wesco 1.4 | 4 | 2% | 3 |
| sample.VelociRobot 1.0 | 2 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.5 | 61.0 | 3 / 210 | 4.51 | 12.0% | 21833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.4% | 170 |
| gh.mini.Gruwel 0.9 | 2.2 | 13.6% | 23 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.0% | 7 |
| hadur117.mini.DeiseFIT 0.2 | 3.8 | 12.0% | 3 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 4 |
| wit.Chuliath 1.0 | 6.5 | 7.6% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.2% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.7 | 55.2 | 0 / 35 | 3289 |
| 2 | 3 | 58.9 | 64.4 | 1 / 35 | 3850 |
| 3 | 4 | 58.2 | 63.5 | 2 / 35 | 3459 |
| 4 | 3 | 59.2 | 65.4 | 0 / 35 | 3945 |
| 5 | 4 | 56.7 | 59.0 | 0 / 35 | 3531 |
| 6 | 4 | 57.1 | 58.1 | 0 / 35 | 3759 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 24 | 4% |
| gh.mini.Gruwel 0.9 | 6 | 17% |
| rz.HawkOnFire 0.1 | 2 | 50% |
| wit.Chuliath 1.0 | 1 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 525. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 74 | 36% | 74 |
| dmh.robocode.robot.BlackDeath 9.2 | 44 | 21% | 44 |
| gh.mini.Gruwel 0.9 | 42 | 20% | 44 |
| rz.HawkOnFire 0.1 | 16 | 8% | 16 |
| myl.nano.KomoriNinja 1.1 | 12 | 6% | 12 |
| wit.Chuliath 1.0 | 11 | 5% | 11 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 2% | 5 |
| dans.Cinnamon 1.2 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 0% | 1 |

## Melee bench: F36

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 76.7 | 75 / 210 | 3.10 | 17.1% | 32661 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 17.1% | 75 |
| alpha.RainingFire 1.0 | 3.0 | 12.9% | 37 |
| bzdp.Pansy 2.1 | 3.5 | 11.9% | 23 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 22 |
| mz.Cork 0.1 | 3.8 | 11.5% | 23 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.2% | 13 |
| bvh.mini.Fenrir 0.39 | 6.7 | 8.5% | 6 |
| dl.BetterWalls 1.0 | 7.8 | 7.8% | 9 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 6.2% | 3 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.6 | 69.5 | 11 / 35 | 5312 |
| 2 | 1 | 65.7 | 76.8 | 12 / 35 | 5297 |
| 3 | 1 | 68.0 | 82.5 | 18 / 35 | 5745 |
| 4 | 1 | 64.2 | 73.7 | 11 / 35 | 5050 |
| 5 | 1 | 66.5 | 80.3 | 14 / 35 | 5157 |
| 6 | 1 | 66.3 | 77.1 | 9 / 35 | 6100 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 30 | 80% |
| alpha.RainingFire 1.0 | 23 | 48% |
| bvh.micro.Freya 0.3 | 19 | 58% |
| mz.Cork 0.1 | 18 | 78% |
| dl.BetterWalls 1.0 | 13 | 46% |
| m3thos.Eva02 0.7.1 | 7 | 43% |
| bvh.mini.Fenrir 0.39 | 7 | 86% |
| squidM.TentalceMeleeNano 1.1 | 1 | 0% |

Hadur died in 139 of 210 rounds, at a mean tick of 732. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 37 | 27% | 52 |
| bvh.micro.Freya 0.3 | 24 | 17% | 31 |
| mz.Cork 0.1 | 20 | 14% | 35 |
| bzdp.Pansy 2.1 | 19 | 14% | 33 |
| dl.BetterWalls 1.0 | 13 | 9% | 26 |
| m3thos.Eva02 0.7.1 | 9 | 6% | 17 |
| bvh.mini.Fenrir 0.39 | 9 | 6% | 10 |
| squidM.TentalceMeleeNano 1.1 | 6 | 4% | 6 |
2 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.9 | 124 / 210 | 2.45 | 18.2% | 35097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 18.2% | 124 |
| germ.TheMind .2 | 2.5 | 10.5% | 11 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.2% | 12 |
| EBBU.Sim2 1.02 | 4.5 | 9.7% | 4 |
| agrach.Dalek 1.0 | 6.0 | 9.2% | 21 |
| mb.Beast 0.1 | 6.2 | 9.2% | 12 |
| lmk.ACPFinal 0.1 | 6.7 | 8.8% | 11 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.2% | 2 |
| stelo.UntouchableNano 1.3 | 7.7 | 8.4% | 10 |
| skm.Ryubot 1.0 | 9.3 | 7.6% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.7 | 19 / 35 | 6072 |
| 2 | 1 | 67.7 | 86.0 | 19 / 35 | 6153 |
| 3 | 1 | 67.9 | 87.9 | 22 / 35 | 5908 |
| 4 | 1 | 67.3 | 86.3 | 20 / 35 | 5834 |
| 5 | 1 | 67.3 | 84.8 | 25 / 35 | 5750 |
| 6 | 1 | 64.9 | 78.4 | 19 / 35 | 5380 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 34 | 91% |
| agrach.Dalek 1.0 | 22 | 55% |
| EBBU.Sim2 1.02 | 20 | 90% |
| stelo.UntouchableNano 1.3 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 80% |
| lmk.ACPFinal 0.1 | 13 | 100% |
| mb.Beast 0.1 | 12 | 83% |
| skm.Ryubot 1.0 | 10 | 90% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 75% |

Hadur died in 87 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 23 | 26% | 42 |
| mb.Beast 0.1 | 15 | 17% | 31 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 14% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 11 | 13% | 40 |
| EBBU.Sim2 1.02 | 7 | 8% | 21 |
| lmk.ACPFinal 0.1 | 7 | 8% | 20 |
| stelo.UntouchableNano 1.3 | 6 | 7% | 18 |
| germ.TheMind .2 | 3 | 3% | 11 |
| skm.Ryubot 1.0 | 2 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F38

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 64.9 | 25 / 210 | 4.16 | 13.3% | 24659 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.9% | 107 |
| hadur117.mini.DeiseFIT 0.2 | 2.3 | 13.3% | 25 |
| bvh.mini.Freya 0.55 | 3.2 | 12.6% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.4% | 7 |
| cs.Wren 1.0 | 4.5 | 11.6% | 12 |
| bts.mega.Gnarly 1.4 | 5.5 | 11.1% | 31 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.6% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.0% | 2 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.5% | 1 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 60.6 | 4 / 35 | 4137 |
| 2 | 3 | 58.9 | 64.8 | 2 / 35 | 3887 |
| 3 | 2 | 61.7 | 68.6 | 6 / 35 | 4365 |
| 4 | 2 | 60.0 | 67.3 | 6 / 35 | 3752 |
| 5 | 2 | 58.8 | 61.3 | 2 / 35 | 4288 |
| 6 | 2 | 60.9 | 67.0 | 5 / 35 | 4230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 23 | 17% |
| cs.Wren 1.0 | 9 | 89% |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 100% |
| bts.mega.Gnarly 1.4 | 3 | 67% |
| bvh.mini.Freya 0.55 | 3 | 67% |
| matt.UnderDark3 2.4.34 | 2 | 50% |
| kdf.KoulDestroyer 1.0 | 2 | 50% |

Hadur died in 185 of 210 rounds, at a mean tick of 572. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 82 | 44% | 88 |
| bts.mega.Gnarly 1.4 | 31 | 17% | 34 |
| kdf.KoulDestroyer 1.0 | 18 | 10% | 19 |
| cs.Wren 1.0 | 17 | 9% | 19 |
| bvh.mini.Freya 0.55 | 14 | 8% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 6% | 21 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 2% | 6 |
| matt.UnderDark3 2.4.34 | 4 | 2% | 5 |
| bzdp.BoxCar 2.0 | 3 | 2% | 3 |

## Melee bench: F39

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 59.9 | 29 / 210 | 4.60 | 12.7% | 25355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.2 | 15.4% | 38 |
| az.Ololobot 0.2.4 | 2.2 | 14.3% | 84 |
| hadur117.mini.DeiseFIT 0.2 | 3.2 | 12.7% | 29 |
| catcat20.Lambda 0.024 | 3.5 | 12.2% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.0% | 11 |
| winamp32.micro.MicroMacro 1.0 | 6.8 | 8.1% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 8.1% | 1 |
| gimp.GimpBot 0.1 | 7.2 | 8.1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.7% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.8 | 57.8 | 4 / 35 | 4211 |
| 2 | 4 | 56.5 | 57.5 | 3 / 35 | 3985 |
| 3 | 4 | 55.6 | 55.2 | 6 / 35 | 3807 |
| 4 | 1 | 61.9 | 67.6 | 10 / 35 | 4913 |
| 5 | 3 | 58.1 | 61.6 | 4 / 35 | 4282 |
| 6 | 4 | 57.6 | 60.0 | 2 / 35 | 4157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 12 | 8% |
| bvh.fry.Freya 0.82 | 12 | 92% |
| catcat20.Lambda 0.024 | 11 | 64% |
| stelo.SoRobotNanoMelee 1.2 | 9 | 89% |
| winamp32.micro.MicroMacro 1.0 | 2 | 0% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 612. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 49 | 27% | 51 |
| bvh.fry.Freya 0.82 | 48 | 26% | 54 |
| catcat20.Lambda 0.024 | 34 | 19% | 44 |
| apollokidd.ApolloKidd 0.9 | 13 | 7% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 7% | 14 |
| winamp32.micro.MicroMacro 1.0 | 10 | 5% | 10 |
| gimp.GimpBot 0.1 | 9 | 5% | 13 |
| whitesquare.robots.SkynetAdvanced 1.1 | 5 | 3% | 7 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 69.0 | 55 / 210 | 3.79 | 15.2% | 30150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 1.3 | 16.4% | 79 |
| hadur117.mini.DeiseFIT 0.2 | 1.8 | 15.2% | 55 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.4% | 22 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 12 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.6% | 14 |
| alpha.BlackIce 1.0 | 6.3 | 9.4% | 8 |
| stelo.Randomness 1.0 | 6.3 | 9.3% | 18 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.4% | 0 |
| sample.Corners 1.0 | 10.0 | 3.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 67.6 | 9 / 35 | 4565 |
| 2 | 2 | 61.8 | 65.7 | 8 / 35 | 4781 |
| 3 | 1 | 68.1 | 82.9 | 15 / 35 | 5715 |
| 4 | 3 | 58.1 | 55.6 | 2 / 35 | 4724 |
| 5 | 2 | 62.4 | 66.7 | 8 / 35 | 5052 |
| 6 | 1 | 65.7 | 75.9 | 13 / 35 | 5313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 58% |
| kano.gamma.KanoGamma 1.8 | 11 | 73% |
| mz.AntiGrav 1.0 | 7 | 86% |
| Polkwane.SmashMelee 1.0 | 7 | 86% |
| stelo.Randomness 1.0 | 6 | 67% |
| alpha.BlackIce 1.0 | 5 | 80% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 72 | 46% | 84 |
| kano.gamma.KanoGamma 1.8 | 25 | 16% | 41 |
| alpha.BlackIce 1.0 | 13 | 8% | 19 |
| stelo.Randomness 1.0 | 11 | 7% | 17 |
| mz.AntiGrav 1.0 | 11 | 7% | 13 |
| Polkwane.SmashMelee 1.0 | 10 | 6% | 13 |
| amk.superstrike.SuperStrike 0.3 | 9 | 6% | 13 |
| sample.Corners 1.0 | 3 | 2% | 7 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.9 | 60.6 | 12 / 210 | 4.55 | 12.6% | 25842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 17.5% | 111 |
| ary.Swarm 1.1 | 2.3 | 14.0% | 24 |
| lessonz.robocode.Oz 0.5.0 | 2.8 | 13.3% | 32 |
| hadur117.mini.DeiseFIT 0.2 | 3.8 | 12.6% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.8% | 18 |
| shrub.Silver v048 | 5.8 | 10.3% | 7 |
| zyx.nano.Ant 1.1 | 7.0 | 7.5% | 1 |
| jsal.Jsalbot 1.0 | 8.3 | 5.9% | 5 |
| stelo.Mirror 1.1 | 8.7 | 5.3% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.0 | 59.7 | 6 / 35 | 4316 |
| 2 | 4 | 58.3 | 59.0 | 2 / 35 | 4098 |
| 3 | 4 | 58.5 | 61.0 | 1 / 35 | 4143 |
| 4 | 4 | 59.7 | 62.2 | 0 / 35 | 4608 |
| 5 | 4 | 59.4 | 62.9 | 2 / 35 | 4300 |
| 6 | 4 | 58.7 | 58.7 | 1 / 35 | 4377 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 14 | 7% |
| ary.Swarm 1.1 | 7 | 57% |
| lessonz.robocode.Oz 0.5.0 | 7 | 29% |
| simonton.nano.MeleeSeed 1.8 | 4 | 100% |
| shrub.Silver v048 | 2 | 0% |
| jsal.Jsalbot 1.0 | 1 | 0% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 85 | 43% | 86 |
| lessonz.robocode.Oz 0.5.0 | 36 | 18% | 38 |
| ary.Swarm 1.1 | 36 | 18% | 38 |
| shrub.Silver v048 | 17 | 9% | 20 |
| simonton.nano.MeleeSeed 1.8 | 11 | 6% | 14 |
| acogdev.alpha 0.2 | 4 | 2% | 4 |
| jsal.Jsalbot 1.0 | 4 | 2% | 4 |
| zyx.nano.Ant 1.1 | 3 | 2% | 3 |
| stelo.Mirror 1.1 | 2 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.4 | 62.5 | 22 / 210 | 4.38 | 13.1% | 27893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.9% | 119 |
| maribo.mini.MiniQuester 0.1 | 2.7 | 13.6% | 20 |
| ara.Shera 0.88 | 2.8 | 13.7% | 33 |
| hadur117.mini.DeiseFIT 0.2 | 3.5 | 13.1% | 22 |
| amz.NanoClone 1.41 | 5.2 | 9.5% | 5 |
| maribo.IotaCT 1.1 | 6.2 | 8.0% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.4% | 11 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.4% | 1 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.1 | 62.9 | 3 / 35 | 4874 |
| 2 | 4 | 58.1 | 58.7 | 5 / 35 | 4467 |
| 3 | 4 | 57.5 | 58.1 | 0 / 35 | 4485 |
| 4 | 2 | 62.2 | 68.9 | 9 / 35 | 4940 |
| 5 | 4 | 58.1 | 60.0 | 2 / 35 | 4318 |
| 6 | 3 | 60.5 | 66.3 | 3 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 34 | 26% |
| ara.Shera 0.88 | 10 | 60% |
| maribo.mini.MiniQuester 0.1 | 7 | 71% |
| dsw.StaticD 1.0 | 2 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 596. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 69 | 37% | 76 |
| ara.Shera 0.88 | 41 | 22% | 48 |
| maribo.mini.MiniQuester 0.1 | 35 | 19% | 40 |
| amz.NanoClone 1.41 | 18 | 10% | 18 |
| dsw.StaticD 1.0 | 12 | 6% | 13 |
| stelo.MirrorMicro 1.0 | 6 | 3% | 6 |
| mme.NikeEnhanced 2.0 | 3 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 2% | 3 |
| maribo.IotaCT 1.1 | 2 | 1% | 3 |

## Melee bench: F43

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.1 | 52.1 | 4 / 210 | 5.31 | 10.6% | 20841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 176 |
| brainfade.melee.Dusk 0.44 | 2.3 | 12.7% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 3.7 | 11.9% | 4 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.6% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.0 | 10.5% | 2 |
| hadur117.mini.DeiseFIT 0.2 | 5.0 | 10.6% | 4 |
| mz.NanoGod 2.02 | 7.3 | 8.1% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.9% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.5 | 53.7 | 0 / 35 | 3754 |
| 2 | 6 | 54.7 | 49.2 | 0 / 35 | 3239 |
| 3 | 6 | 56.2 | 52.7 | 2 / 35 | 3383 |
| 4 | 4 | 57.9 | 56.2 | 1 / 35 | 3678 |
| 5 | 5 | 55.4 | 50.2 | 0 / 35 | 3449 |
| 6 | 5 | 55.0 | 50.8 | 1 / 35 | 3338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 17 | 0% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 206 of 210 rounds, at a mean tick of 481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 108 | 52% | 108 |
| brainfade.melee.Dusk 0.44 | 30 | 15% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 10% | 23 |
| mz.NanoGod 2.02 | 14 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 12 | 6% | 12 |
| jab.DiamondStealer 5 | 12 | 6% | 12 |
| dummy.micro.Sparrow 2.5 | 10 | 5% | 11 |

## Melee bench: F44

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 65.6 | 26 / 210 | 4.10 | 14.5% | 32085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.2 | 17.2% | 109 |
| tzu.TheArtOfWar 1.2 | 2.3 | 14.4% | 46 |
| hadur117.mini.DeiseFIT 0.2 | 2.5 | 14.5% | 26 |
| wompi.Quokka 1.6 | 4.3 | 10.8% | 13 |
| jwirde.Gort 2.0 | 5.2 | 10.3% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.8 | 9.5% | 3 |
| disan.Chair 2.2.0 | 6.8 | 8.1% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.4% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 65.7 | 3 / 35 | 5445 |
| 2 | 1 | 64.6 | 72.1 | 10 / 35 | 5697 |
| 3 | 3 | 62.2 | 64.8 | 1 / 35 | 5832 |
| 4 | 3 | 59.4 | 56.8 | 5 / 35 | 4919 |
| 5 | 3 | 62.3 | 68.6 | 5 / 35 | 5034 |
| 6 | 3 | 61.4 | 65.7 | 2 / 35 | 5158 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 19% |
| tzu.TheArtOfWar 1.2 | 14 | 43% |
| wompi.Quokka 1.6 | 7 | 57% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 50% |
| disan.Chair 2.2.0 | 4 | 100% |
| jwirde.Gort 2.0 | 3 | 33% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 39% | 81 |
| tzu.TheArtOfWar 1.2 | 33 | 18% | 39 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 23 | 12% | 23 |
| wompi.Quokka 1.6 | 22 | 12% | 25 |
| jwirde.Gort 2.0 | 15 | 8% | 18 |
| disan.Chair 2.2.0 | 10 | 5% | 12 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 7 |
| amk.jointstrike.JointStrike 0.2 | 4 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 79.3 | 41 / 210 | 2.87 | 17.8% | 36296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFIT 0.2 | 1.0 | 17.8% | 41 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 13.0% | 121 |
| jje.BagPuss 1.2 | 2.5 | 12.8% | 16 |
| sul.Lunar 1.1 | 4.7 | 10.6% | 21 |
| myl.nano.Graviton 1.10 | 5.0 | 10.1% | 4 |
| hvilela.HVilela 0.9 | 6.5 | 8.8% | 0 |
| fm.claire 1.7 | 6.7 | 8.3% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 7.9% | 4 |
| wit.Deep7 2.0 | 9.3 | 5.7% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 83.8 | 6 / 35 | 6256 |
| 2 | 1 | 64.5 | 72.7 | 5 / 35 | 5801 |
| 3 | 1 | 65.5 | 74.3 | 7 / 35 | 5805 |
| 4 | 1 | 65.8 | 76.2 | 4 / 35 | 6001 |
| 5 | 1 | 69.6 | 87.3 | 13 / 35 | 6491 |
| 6 | 1 | 67.0 | 81.3 | 6 / 35 | 5942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 76 | 8% |
| sul.Lunar 1.1 | 19 | 21% |
| jje.BagPuss 1.2 | 18 | 33% |
| myl.nano.Graviton 1.10 | 11 | 91% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 78% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1463. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 75 | 44% | 0 |
| jje.BagPuss 1.2 | 34 | 20% | 73 |
| sul.Lunar 1.1 | 28 | 16% | 47 |
| myl.nano.Graviton 1.10 | 9 | 5% | 29 |
| hvilela.HVilela 0.9 | 7 | 4% | 18 |
| fm.claire 1.7 | 7 | 4% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 4% | 16 |
| wit.Deep7 2.0 | 3 | 2% | 7 |
| abud.ThirdRobo 1.0 | 1 | 1% | 4 |

## Melee bench: F46

hadur117.mini.DeiseFIT 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 65.7 | 4 / 210 | 4.09 | 13.0% | 25010 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 102 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.9% | 95 |
| hadur117.mini.DeiseFIT 0.2 | 3.3 | 13.0% | 4 |
| cx.Princess 1.0 | 4.3 | 10.1% | 8 |
| mz.MicroSheep 1.0 | 4.3 | 10.7% | 1 |
| sadoner.killer 0.2 | 6.0 | 9.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 6.0% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.3 | 70.5 | 1 / 35 | 4828 |
| 2 | 5 | 55.3 | 54.3 | 0 / 35 | 3682 |
| 3 | 3 | 61.1 | 71.4 | 1 / 35 | 4038 |
| 4 | 3 | 60.5 | 66.7 | 0 / 35 | 4232 |
| 5 | 3 | 59.9 | 63.2 | 2 / 35 | 4095 |
| 6 | 3 | 60.7 | 68.3 | 0 / 35 | 4135 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 30 | 0% |
| rsalesc.melee.Medina 0.4.5 | 8 | 0% |
| cx.Princess 1.0 | 5 | 40% |
| mz.MicroSheep 1.0 | 2 | 100% |

Hadur died in 206 of 210 rounds, at a mean tick of 573. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 98 | 48% | 99 |
| rsalesc.melee.Medina 0.4.5 | 56 | 27% | 57 |
| cx.Princess 1.0 | 13 | 6% | 14 |
| sadoner.killer 0.2 | 13 | 6% | 13 |
| arthord.NanoSatanMelee Beta | 10 | 5% | 10 |
| mz.MicroSheep 1.0 | 8 | 4% | 8 |
| jeremyreeder.collective.Prophet 5 | 7 | 3% | 7 |
| kurios.DOSexe .9a | 1 | 0% | 2 |

