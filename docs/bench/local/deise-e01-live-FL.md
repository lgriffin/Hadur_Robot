# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 81.1 | 36 / 210 | 2.70 | 15.9% | 28312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 137 |
| hadur117.mini.DeiseFL 0.2 | 2.0 | 15.9% | 36 |
| sgp.JollyNinja 3.53 | 3.2 | 12.2% | 19 |
| mz.MicroGodMelee 1 | 4.3 | 10.9% | 10 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 11.3% | 5 |
| lorneswork.Predator 1.0 | 6.2 | 9.5% | 2 |
| adt.Ar2 1.0 | 6.8 | 7.5% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.2% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 81.6 | 1 / 35 | 4378 |
| 2 | 2 | 64.6 | 79.0 | 6 / 35 | 4508 |
| 3 | 2 | 65.1 | 79.7 | 5 / 35 | 4897 |
| 4 | 2 | 65.0 | 81.0 | 9 / 35 | 4607 |
| 5 | 2 | 66.0 | 84.4 | 8 / 35 | 4666 |
| 6 | 2 | 66.1 | 81.0 | 7 / 35 | 5256 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 88 | 13% |
| mz.MicroGodMelee 1 | 12 | 50% |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 82% |
| sgp.JollyNinja 3.53 | 11 | 55% |
| lorneswork.Predator 1.0 | 3 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 66% | 127 |
| sgp.JollyNinja 3.53 | 28 | 16% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 6% | 17 |
| mz.MicroGodMelee 1 | 9 | 5% | 14 |
| kawigi.sbf.FloodSonnet 0.9 | 6 | 3% | 7 |
| lorneswork.Predator 1.0 | 2 | 1% | 7 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.5 | 69 / 210 | 3.02 | 16.5% | 28934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 16.5% | 69 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.7% | 53 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.3% | 39 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.4% | 0 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.9% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.2 | 8.7% | 3 |
| Noran.BitchingElk 0.054 | 7.0 | 8.2% | 15 |
| sch.Simone 0.3d | 7.8 | 7.5% | 10 |
| stelo.PatternRobot 1.0 | 8.2 | 7.0% | 8 |
| fullsail.SweetTea 1.1 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 78.7 | 10 / 35 | 4803 |
| 2 | 1 | 66.8 | 82.2 | 15 / 35 | 4958 |
| 3 | 1 | 64.3 | 74.0 | 11 / 35 | 4928 |
| 4 | 1 | 64.5 | 76.8 | 10 / 35 | 4749 |
| 5 | 1 | 63.6 | 72.7 | 10 / 35 | 4780 |
| 6 | 1 | 65.5 | 80.6 | 13 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 40 | 48% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 26 | 69% |
| Noran.BitchingElk 0.054 | 8 | 38% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| fnc.bandit.Bandit 5.2.0 | 6 | 100% |
| fullsail.SweetTea 1.1 | 6 | 100% |
| sch.Simone 0.3d | 6 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 100% |
| lrem.micro.SpikeSoldier 0.4 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 48 | 34% | 70 |
| pulsar.PulsarMax 0.8.9 | 42 | 30% | 54 |
| stelo.PatternRobot 1.0 | 17 | 12% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 8% | 14 |
| Noran.BitchingElk 0.054 | 8 | 6% | 13 |
| sch.Simone 0.3d | 6 | 4% | 11 |
| fnc.bandit.Bandit 5.2.0 | 4 | 3% | 12 |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 2% | 6 |
| fullsail.SweetTea 1.1 | 2 | 1% | 8 |

## Melee bench: F03

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.6 | 146 / 210 | 1.93 | 19.3% | 34046 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.3% | 146 |
| radnor.DoctorBob 1.42 | 2.7 | 13.7% | 16 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.3% | 23 |
| vuen.Cake 2.51 | 3.5 | 12.4% | 21 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 3 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.0 | 6.4% | 0 |
| oa.weak.FlyMk1 0.1 | 8.5 | 6.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 24 / 35 | 5898 |
| 2 | 1 | 66.4 | 83.5 | 18 / 35 | 5070 |
| 3 | 1 | 69.7 | 91.1 | 25 / 35 | 5813 |
| 4 | 1 | 70.1 | 92.4 | 28 / 35 | 6001 |
| 5 | 1 | 69.9 | 92.4 | 25 / 35 | 5615 |
| 6 | 1 | 69.8 | 93.0 | 26 / 35 | 5649 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 55 | 84% |
| kawigi.nano.Lib 1.0 | 53 | 91% |
| radnor.DoctorBob 1.42 | 47 | 85% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 19 | 30% | 57 |
| kawigi.nano.Lib 1.0 | 16 | 25% | 68 |
| vuen.Cake 2.51 | 11 | 17% | 54 |
| urdos.URDOS 1.3 | 5 | 8% | 9 |
| adt.Ar1 2.1 | 5 | 8% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 5% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 5% | 2 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 68.9 | 1 / 210 | 3.80 | 13.9% | 28936 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.6% | 199 |
| hadur117.mini.DeiseFL 0.2 | 2.2 | 13.9% | 1 |
| apc.LeeroyJenkins2 1.0 | 2.8 | 13.3% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 11.0% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.0% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.3% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.5% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.3 | 67.9 | 0 / 35 | 4973 |
| 2 | 3 | 58.0 | 58.7 | 0 / 35 | 4159 |
| 3 | 2 | 63.6 | 74.0 | 0 / 35 | 4693 |
| 4 | 2 | 63.6 | 68.9 | 0 / 35 | 5352 |
| 5 | 2 | 63.8 | 74.3 | 1 / 35 | 4914 |
| 6 | 2 | 62.4 | 69.5 | 0 / 35 | 4845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 52 | 2% |
| apc.LeeroyJenkins2 1.0 | 1 | 0% |

Hadur died in 209 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 175 | 84% | 176 |
| apc.LeeroyJenkins2 1.0 | 12 | 6% | 12 |
| josago.Jorgito 0.16 | 10 | 5% | 10 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| TNT.TNT 0.99.1 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 0% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.3 | 64.2 | 16 / 210 | 4.22 | 12.2% | 19673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.8% | 125 |
| justin.DemonicRage 3.4 | 1.8 | 17.3% | 51 |
| wompi.Numbat 2.1 | 3.0 | 12.8% | 14 |
| hadur117.mini.DeiseFL 0.2 | 4.0 | 12.2% | 16 |
| ms.Ares 0.19 | 5.3 | 8.9% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 8.9% | 2 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.2 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 57.3 | 60.6 | 1 / 35 | 3467 |
| 2 | 4 | 58.4 | 65.4 | 1 / 35 | 3335 |
| 3 | 4 | 59.0 | 65.1 | 4 / 35 | 3301 |
| 4 | 4 | 59.6 | 67.9 | 4 / 35 | 3304 |
| 5 | 4 | 56.2 | 61.0 | 2 / 35 | 2890 |
| 6 | 4 | 59.3 | 65.4 | 4 / 35 | 3376 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 20 | 60% |
| cb.fire.Firestarter 2.0f | 13 | 8% |
| wompi.Numbat 2.1 | 5 | 40% |
| ms.Ares 0.19 | 2 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 633. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 37% | 72 |
| justin.DemonicRage 3.4 | 58 | 30% | 68 |
| wompi.Numbat 2.1 | 28 | 14% | 30 |
| ms.Ares 0.19 | 15 | 8% | 15 |
| supersample.SuperBoxBot 1.0 | 10 | 5% | 11 |
| axeBots.HataMoto 3.09 | 8 | 4% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.4 | 126 / 210 | 1.78 | 19.1% | 28715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.1% | 126 |
| origin.SleepSiphon 1.7b | 2.5 | 13.1% | 34 |
| jekl.StoneGhost 0.7 | 2.7 | 13.8% | 24 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.4% | 17 |
| mld.Wisdom 1.0 | 5.2 | 10.4% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 6 |
| spinnercat.Omen 1.0 | 7.5 | 6.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.8% | 3 |
| DBall.NUKE 0.1 | 8.2 | 6.7% | 0 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.4 | 21 / 35 | 4497 |
| 2 | 1 | 68.5 | 90.2 | 20 / 35 | 4637 |
| 3 | 1 | 68.4 | 89.8 | 21 / 35 | 4628 |
| 4 | 1 | 68.3 | 89.2 | 17 / 35 | 4829 |
| 5 | 1 | 70.4 | 94.3 | 23 / 35 | 5184 |
| 6 | 1 | 69.6 | 93.3 | 24 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 52 | 85% |
| origin.SleepSiphon 1.7b | 45 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 77% |
| gg.Wolverine 2.0 | 15 | 67% |
| mld.Wisdom 1.0 | 8 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 67% |
| DBall.NUKE 0.1 | 5 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 28 | 32% | 70 |
| jekl.StoneGhost 0.7 | 26 | 30% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 18% | 36 |
| gg.Wolverine 2.0 | 6 | 7% | 16 |
| mld.Wisdom 1.0 | 4 | 5% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 3% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| DBall.NUKE 0.1 | 0 | 0% | 6 |
| sample.Fire 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.0 | 69 / 210 | 2.44 | 17.4% | 31752 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.3 | 18.1% | 70 |
| hadur117.mini.DeiseFL 0.2 | 2.2 | 17.4% | 69 |
| rtk.Tachikoma 1.0 | 2.5 | 16.6% | 47 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.4% | 11 |
| franzor.Lizt 1.3.1 | 4.8 | 10.6% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.8% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.3% | 2 |
| sample.Target 1.0 | 9.2 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 84.4 | 11 / 35 | 5764 |
| 2 | 1 | 69.7 | 89.8 | 16 / 35 | 5395 |
| 3 | 3 | 67.9 | 82.2 | 13 / 35 | 4993 |
| 4 | 2 | 66.7 | 83.2 | 8 / 35 | 5012 |
| 5 | 3 | 66.8 | 80.0 | 8 / 35 | 5112 |
| 6 | 2 | 68.6 | 84.4 | 13 / 35 | 5476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 54 | 59% |
| rsalesc.melee.Monk 0.3.6c | 30 | 17% |
| oog.melee.CapuletDroid 1.1 | 22 | 91% |
| franzor.Lizt 1.3.1 | 11 | 82% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 77 | 55% | 86 |
| rtk.Tachikoma 1.0 | 50 | 35% | 88 |
| oog.melee.CapuletDroid 1.1 | 6 | 4% | 21 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 8 |
| skm.PateranBotlock2 1.0 | 3 | 2% | 3 |
| franzor.Lizt 1.3.1 | 2 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.5 | 117 / 210 | 2.21 | 18.8% | 31469 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.8% | 117 |
| tm.Yuugao 1.0 | 2.2 | 13.7% | 42 |
| shrub.Vapour v159 | 3.2 | 12.0% | 25 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.4% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.7% | 9 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.8% | 5 |
| m3thos.Eva00 1.1 | 6.8 | 8.1% | 1 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.1% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 5.9% | 0 |
| SHAM.WOW 1.4 | 9.5 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.3 | 23 / 35 | 5302 |
| 2 | 1 | 68.4 | 85.4 | 17 / 35 | 5614 |
| 3 | 1 | 69.5 | 90.8 | 22 / 35 | 5341 |
| 4 | 1 | 66.2 | 80.6 | 17 / 35 | 4869 |
| 5 | 1 | 68.8 | 88.9 | 21 / 35 | 5286 |
| 6 | 1 | 67.8 | 87.0 | 17 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 67% |
| shrub.Vapour v159 | 39 | 67% |
| Krabb.sliNk.Garm 0.9u | 24 | 88% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 87% |
| com.spp.robocode.MostlyHarmless 010 | 13 | 85% |
| qualidafial.MajorDick 1.0.1 | 7 | 100% |
| m3thos.Eva00 1.1 | 6 | 100% |
| SHAM.WOW 1.4 | 2 | 50% |

Hadur died in 94 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 33 | 35% | 70 |
| shrub.Vapour v159 | 23 | 24% | 48 |
| Krabb.sliNk.Garm 0.9u | 12 | 13% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 9% | 24 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 21 |
| m3thos.Eva00 1.1 | 4 | 4% | 11 |
| SHAM.WOW 1.4 | 3 | 3% | 6 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 4 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 3 |

## Melee bench: F09

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.1 | 55 / 210 | 3.24 | 14.9% | 21946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.5% | 90 |
| hadur117.mini.DeiseFL 0.2 | 2.0 | 14.9% | 55 |
| kc.micro.Figment 1.0 | 2.7 | 14.4% | 38 |
| yagami.Tidus 0.11 | 4.7 | 10.7% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 15 |
| mc2.enemy.Original 0.9 | 5.5 | 9.9% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.8 | 5.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 71.1 | 7 / 35 | 3596 |
| 2 | 2 | 63.5 | 78.4 | 10 / 35 | 3568 |
| 3 | 1 | 64.1 | 77.1 | 13 / 35 | 3770 |
| 4 | 3 | 61.6 | 70.5 | 9 / 35 | 3690 |
| 5 | 2 | 64.6 | 80.3 | 9 / 35 | 3890 |
| 6 | 2 | 61.6 | 73.3 | 7 / 35 | 3432 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 40 | 23% |
| kc.micro.Figment 1.0 | 34 | 74% |
| pedersen.Grishnakh 1.0 | 10 | 70% |
| yagami.Tidus 0.11 | 7 | 100% |
| mc2.enemy.Original 0.9 | 5 | 80% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 37% | 69 |
| kc.micro.Figment 1.0 | 26 | 17% | 52 |
| yagami.Tidus 0.11 | 21 | 14% | 26 |
| mc2.enemy.Original 0.9 | 17 | 11% | 22 |
| pedersen.Grishnakh 1.0 | 16 | 10% | 19 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 8 |
| rdm.Dueler 0.4x | 5 | 3% | 5 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| dft.Calliope 5.6 | 0 | 0% | 4 |

## Melee bench: F10

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 92.4 | 140 / 210 | 1.69 | 19.2% | 30296 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.2% | 140 |
| DTF.Kludgy 1.2b | 2.2 | 14.7% | 36 |
| ne.Chimera 1.2 | 2.8 | 13.1% | 13 |
| ejb.Polaris 1.0.1 | 4.2 | 12.1% | 12 |
| vStar.RAFzilla 2.15 | 5.2 | 10.1% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.5% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.5% | 1 |
| sam.Samspin 1.0 | 8.7 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.7 | 23 / 35 | 5136 |
| 2 | 1 | 69.7 | 94.9 | 25 / 35 | 4603 |
| 3 | 1 | 69.3 | 90.5 | 25 / 35 | 5079 |
| 4 | 1 | 70.0 | 94.9 | 24 / 35 | 5237 |
| 5 | 1 | 68.2 | 88.9 | 21 / 35 | 4944 |
| 6 | 1 | 69.1 | 91.4 | 22 / 35 | 5297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 55 | 87% |
| DTF.Kludgy 1.2b | 55 | 62% |
| ne.Chimera 1.2 | 30 | 77% |
| vStar.RAFzilla 2.15 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 8 | 88% |
| kurios.DOSexe .9b | 4 | 100% |
| donjezza.Muncho 1.0 | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 39 | 56% | 64 |
| ne.Chimera 1.2 | 14 | 20% | 41 |
| ejb.Polaris 1.0.1 | 10 | 14% | 60 |
| tvv.micro.Antares 1.1.1 | 3 | 4% | 8 |
| vStar.RAFzilla 2.15 | 2 | 3% | 15 |
| kurios.DOSexe .9b | 1 | 1% | 12 |
| sam.Samspin 1.0 | 1 | 1% | 4 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 80.7 | 78 / 210 | 2.74 | 16.5% | 25166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.1% | 83 |
| hadur117.mini.DeiseFL 0.2 | 1.7 | 16.5% | 78 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.1% | 15 |
| djc.DynaBot 0.1.1 | 4.0 | 10.4% | 10 |
| br2.MobyDickBot 1.6 | 5.7 | 9.1% | 7 |
| rdt199.Warlord 0.73 | 5.7 | 8.9% | 11 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.6% | 3 |
| uji.YellohFellah 1.0 | 7.3 | 7.6% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 81.3 | 15 / 35 | 4138 |
| 2 | 2 | 65.3 | 82.2 | 11 / 35 | 4350 |
| 3 | 1 | 65.2 | 80.6 | 14 / 35 | 4077 |
| 4 | 1 | 65.9 | 84.8 | 14 / 35 | 4065 |
| 5 | 2 | 65.5 | 80.6 | 12 / 35 | 4475 |
| 6 | 2 | 63.5 | 74.6 | 12 / 35 | 4061 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 64 | 48% |
| djc.DynaBot 0.1.1 | 16 | 88% |
| uji.YellohFellah 1.0 | 12 | 83% |
| cx.mini.Nimrod 0.55 | 12 | 92% |
| br2.MobyDickBot 1.6 | 7 | 86% |
| rdt199.Warlord 0.73 | 7 | 86% |

Hadur died in 132 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 63 | 48% | 92 |
| cx.mini.Nimrod 0.55 | 27 | 20% | 37 |
| rdt199.Warlord 0.73 | 11 | 8% | 18 |
| djc.DynaBot 0.1.1 | 8 | 6% | 20 |
| br2.MobyDickBot 1.6 | 8 | 6% | 15 |
| KiraNL.Chupacabra 0.4 | 8 | 6% | 8 |
| uji.YellohFellah 1.0 | 4 | 3% | 16 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.2 | 86 / 210 | 2.87 | 16.3% | 23366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.3 | 16.3% | 86 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.6% | 50 |
| nat.PallasHawk 1.0 | 3.0 | 13.5% | 40 |
| darkcanuck.Leon 1.01 | 3.7 | 13.1% | 23 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 10 |
| jrm.Test0 1.0 | 6.2 | 8.4% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.6% | 0 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.5% | 0 |
| stuff.Vlad 0.1 | 9.2 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 84.4 | 17 / 35 | 4052 |
| 2 | 2 | 61.9 | 70.8 | 10 / 35 | 3814 |
| 3 | 1 | 65.8 | 82.5 | 14 / 35 | 4052 |
| 4 | 1 | 65.6 | 83.2 | 15 / 35 | 3745 |
| 5 | 2 | 61.9 | 70.8 | 10 / 35 | 3798 |
| 6 | 1 | 66.7 | 83.5 | 20 / 35 | 3905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 37 | 65% |
| darkcanuck.Leon 1.01 | 34 | 79% |
| nat.PallasHawk 1.0 | 32 | 72% |
| brainfade.melee.Genghis 0.36 | 9 | 78% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 0% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 41 | 32% | 70 |
| bts.wiki.RipCurl 0.9b | 41 | 32% | 56 |
| brainfade.melee.Genghis 0.36 | 15 | 12% | 19 |
| darkcanuck.Leon 1.01 | 13 | 10% | 45 |
| jrm.Test0 1.0 | 11 | 9% | 11 |
| cs.sheldor.Talon 1.1 | 3 | 2% | 5 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |
| jp.Perpy 16.0 | 1 | 1% | 1 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.5 | 71.3 | 24 / 210 | 3.58 | 13.8% | 24156 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.5% | 109 |
| ags.Glacier 0.2.11 | 1.7 | 16.8% | 49 |
| hadur117.mini.DeiseFL 0.2 | 3.0 | 13.8% | 24 |
| shinh.Entangled 0.3 | 4.0 | 12.4% | 25 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.3% | 3 |
| apc.Colossus2 0.17 | 6.0 | 8.1% | 0 |
| stelo.Wang 1.0 | 7.2 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 5.0% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.2 | 70.2 | 1 / 35 | 3719 |
| 2 | 3 | 63.0 | 75.2 | 7 / 35 | 4076 |
| 3 | 3 | 60.4 | 67.6 | 3 / 35 | 4125 |
| 4 | 3 | 61.8 | 69.2 | 3 / 35 | 4489 |
| 5 | 3 | 60.4 | 68.9 | 5 / 35 | 3442 |
| 6 | 3 | 63.2 | 76.8 | 5 / 35 | 4305 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 24 | 46% |
| mn.Combat 3.25.0 | 23 | 30% |
| shinh.Entangled 0.3 | 7 | 43% |
| gh.micro.Gruweltje 0.7 | 3 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 71 | 38% | 82 |
| mn.Combat 3.25.0 | 67 | 36% | 74 |
| shinh.Entangled 0.3 | 25 | 13% | 28 |
| stelo.Wang 1.0 | 10 | 5% | 10 |
| gh.micro.Gruweltje 0.7 | 5 | 3% | 9 |
| maribo.FollowFire 1 | 4 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| apc.Colossus2 0.17 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.4 | 150 / 210 | 1.78 | 19.6% | 30601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.6% | 150 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.5% | 24 |
| catcat20.shape.Theta 0.018 | 3.5 | 12.1% | 26 |
| Lo_Ian.Gandalf_V4 4.0 | 4.7 | 9.8% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.4% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.3% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.2% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.7% | 4 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 96.5 | 27 / 35 | 5380 |
| 2 | 1 | 69.8 | 90.5 | 24 / 35 | 5296 |
| 3 | 1 | 68.4 | 87.0 | 21 / 35 | 4621 |
| 4 | 1 | 70.5 | 93.3 | 28 / 35 | 5094 |
| 5 | 1 | 70.1 | 91.7 | 25 / 35 | 5186 |
| 6 | 1 | 69.3 | 89.2 | 25 / 35 | 5024 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 90 | 91% |
| catcat20.shape.Theta 0.018 | 36 | 75% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 12 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 67% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 25 | 42% | 48 |
| simonton.micro.Sprout 1.1.3 | 21 | 35% | 99 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 7% | 16 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 12 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 3% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 3 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 5 |
| sample.TrackFire 1.0 | 1 | 2% | 2 |
| pa.Improved 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.3 | 94 / 210 | 2.60 | 17.8% | 31100 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 17.8% | 94 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.5% | 28 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 50 |
| mld.DustBunny 3.8 | 3.7 | 12.2% | 17 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.5% | 7 |
| kawigi.robot.Girl 1.2 | 6.2 | 9.6% | 12 |
| Grystrion.TrackerWO 1.0 | 7.0 | 7.0% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 6.6% | 1 |
| divineomega.TrialBot 0.003 | 9.0 | 5.4% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 80.6 | 15 / 35 | 5271 |
| 2 | 1 | 67.8 | 83.5 | 20 / 35 | 5013 |
| 3 | 1 | 67.8 | 85.4 | 16 / 35 | 5404 |
| 4 | 1 | 68.0 | 85.1 | 16 / 35 | 5534 |
| 5 | 1 | 68.5 | 88.3 | 19 / 35 | 5230 |
| 6 | 1 | 62.5 | 70.8 | 8 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 40 | 93% |
| emp.Yngwie 1.11 | 27 | 44% |
| mld.DustBunny 3.8 | 21 | 81% |
| kawigi.robot.Girl 1.2 | 12 | 92% |
| cb.nano.Insomnia 1.0 | 11 | 100% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 46 | 40% | 65 |
| mld.DustBunny 3.8 | 23 | 20% | 43 |
| cb.nano.Insomnia 1.0 | 15 | 13% | 16 |
| kawigi.micro.Shiz 1.1 | 14 | 12% | 49 |
| kawigi.robot.Girl 1.2 | 9 | 8% | 18 |
| divineomega.TrialBot 0.003 | 4 | 3% | 10 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 6 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |

## Melee bench: F16

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.1 | 97 / 210 | 2.16 | 19.0% | 33727 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.2 | 19.0% | 97 |
| gh.Griezel 0.5.2 | 1.8 | 16.2% | 76 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 9.7% | 22 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.6% | 5 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.3% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.4% | 1 |
| repositorio.NanoStep 1.0 | 9.0 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.0% | 3 |
| asd.Cthulhu 1.3 | 9.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.4 | 19 / 35 | 5786 |
| 2 | 1 | 68.3 | 85.4 | 15 / 35 | 5613 |
| 3 | 2 | 67.5 | 82.5 | 13 / 35 | 5445 |
| 4 | 1 | 67.1 | 81.9 | 12 / 35 | 5461 |
| 5 | 1 | 69.8 | 90.8 | 16 / 35 | 5631 |
| 6 | 1 | 70.3 | 89.8 | 22 / 35 | 5791 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 42% |
| techdude.forest.FlamingForest 1.1 | 21 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 83% |
| tvv.nano.Polaris 1.2 | 12 | 100% |
| bvh.fnr.Fenrir 0.36l | 9 | 89% |
| stelo.IntrinsicVolatility 1.4 | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1358. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 60 | 53% | 99 |
| bvh.fnr.Fenrir 0.36l | 20 | 18% | 26 |
| techdude.forest.FlamingForest 1.1 | 13 | 11% | 23 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 9 | 8% | 22 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 11 |
| asd.Cthulhu 1.3 | 4 | 4% | 5 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 11 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 10 |
| repositorio.NanoStep 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.3 | 102 / 210 | 2.32 | 18.1% | 29932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.1% | 102 |
| et.Predator 1.8 | 2.3 | 13.5% | 26 |
| cx.BlestPain 1.41 | 3.3 | 12.5% | 39 |
| oog.melee.Mercutio 1.0 | 3.8 | 11.8% | 21 |
| nic.Nicator 2.4 | 5.2 | 10.8% | 12 |
| ahf.NanoAndrew .4 | 5.3 | 10.4% | 8 |
| maribo.melee.BMV 0.1 | 7.0 | 9.2% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.8 | 14 / 35 | 5104 |
| 2 | 1 | 67.4 | 86.7 | 13 / 35 | 5038 |
| 3 | 1 | 67.2 | 81.0 | 16 / 35 | 4957 |
| 4 | 1 | 67.7 | 83.8 | 17 / 35 | 4985 |
| 5 | 1 | 70.2 | 92.1 | 22 / 35 | 5243 |
| 6 | 1 | 67.1 | 83.5 | 20 / 35 | 4605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 45 | 76% |
| oog.melee.Mercutio 1.0 | 29 | 90% |
| cx.BlestPain 1.41 | 29 | 41% |
| nic.Nicator 2.4 | 23 | 78% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| ahf.NanoAndrew .4 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 39 | 36% | 72 |
| cx.BlestPain 1.41 | 30 | 28% | 44 |
| nic.Nicator 2.4 | 12 | 11% | 30 |
| ahf.NanoAndrew .4 | 10 | 9% | 23 |
| maribo.melee.BMV 0.1 | 8 | 7% | 9 |
| oog.melee.Mercutio 1.0 | 7 | 6% | 28 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 85.9 | 118 / 210 | 2.27 | 17.9% | 24989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 17.9% | 118 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.5% | 31 |
| agd.Mooserwirt2 2.7 | 3.2 | 12.1% | 26 |
| uji.DBH 1.1 | 4.0 | 11.2% | 11 |
| ratosh.Nobo 0.21 | 5.0 | 10.1% | 4 |
| spinnercat.Robovirus 2.718 | 6.5 | 8.6% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 7.0 | 8.1% | 9 |
| sigterm.Sigterm 1.0 | 7.3 | 7.7% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.6% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.2% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 89.5 | 19 / 35 | 4252 |
| 2 | 1 | 66.1 | 84.1 | 20 / 35 | 3879 |
| 3 | 1 | 67.0 | 86.7 | 19 / 35 | 4181 |
| 4 | 1 | 67.9 | 88.6 | 23 / 35 | 4318 |
| 5 | 1 | 65.7 | 82.5 | 18 / 35 | 3997 |
| 6 | 1 | 66.7 | 84.1 | 19 / 35 | 4362 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 70% |
| agd.Mooserwirt2 2.7 | 33 | 73% |
| uji.DBH 1.1 | 27 | 81% |
| sigterm.Sigterm 1.0 | 12 | 100% |
| ratosh.Nobo 0.21 | 12 | 92% |
| spinnercat.Robovirus 2.718 | 11 | 91% |
| stelo.WangRobot 1.0 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 34% | 63 |
| agd.Mooserwirt2 2.7 | 21 | 23% | 49 |
| kawigi.mini.Fhqwhgads 1.1 | 16 | 17% | 20 |
| uji.DBH 1.1 | 10 | 11% | 18 |
| ratosh.Nobo 0.21 | 6 | 6% | 17 |
| stelo.WangRobot 1.0 | 3 | 3% | 11 |
| sigterm.Sigterm 1.0 | 2 | 2% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 8 |
| spinnercat.Robovirus 2.718 | 1 | 1% | 9 |

## Melee bench: F19

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.3 | 145 / 210 | 1.69 | 19.8% | 31045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.8% | 145 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.4% | 27 |
| mld.Infinity 2.2 | 2.8 | 14.2% | 28 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.2% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.3% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 3 |
| mbh.Mbh 0.1 | 7.2 | 7.2% | 0 |
| pac.ABC 2.1 | 8.0 | 6.7% | 2 |
| pbg.R2D2 1.0 | 8.7 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.3 | 24 / 35 | 5411 |
| 2 | 1 | 70.2 | 92.7 | 22 / 35 | 5320 |
| 3 | 1 | 70.9 | 92.4 | 26 / 35 | 5115 |
| 4 | 1 | 70.4 | 93.0 | 24 / 35 | 4953 |
| 5 | 1 | 70.4 | 91.4 | 23 / 35 | 4942 |
| 6 | 1 | 70.9 | 91.1 | 26 / 35 | 5304 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 71 | 92% |
| mld.Infinity 2.2 | 54 | 87% |
| krillr.mini.JointStrike 2.0.0 | 12 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pac.ABC 2.1 | 3 | 67% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 29 | 45% | 101 |
| krillr.mini.JointStrike 2.0.0 | 12 | 18% | 26 |
| mld.Infinity 2.2 | 11 | 17% | 34 |
| patson.PatsonTestBot 1.0 | 9 | 14% | 23 |
| erdnis.Rover 0.3 | 3 | 5% | 13 |
| pac.ABC 2.1 | 1 | 2% | 5 |
| pbg.R2D2 1.0 | 0 | 0% | 4 |
| mbh.Mbh 0.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 93.4 | 145 / 210 | 1.59 | 20.4% | 32625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 20.4% | 145 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 36 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 10.9% | 3 |
| fwb.Nine 1.0.1 | 3.7 | 11.0% | 14 |
| catcat20.Rabbit 0.001 | 5.2 | 9.4% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.4% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.6% | 0 |
| bayen.nut.Squirrel 1.615 | 7.7 | 6.8% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 23 / 35 | 5608 |
| 2 | 1 | 70.2 | 92.4 | 21 / 35 | 5335 |
| 3 | 1 | 71.3 | 95.6 | 26 / 35 | 5716 |
| 4 | 1 | 70.7 | 94.0 | 25 / 35 | 5436 |
| 5 | 1 | 70.3 | 93.3 | 23 / 35 | 5181 |
| 6 | 1 | 70.9 | 96.5 | 27 / 35 | 5349 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 83 | 72% |
| fwb.Nine 1.0.1 | 41 | 83% |
| catcat20.Rabbit 0.001 | 18 | 72% |
| nz.jdc.nano.GridFu 1.0 | 16 | 94% |
| bayen.nut.Squirrel 1.615 | 13 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 1117. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 52% | 81 |
| catcat20.Rabbit 0.001 | 14 | 22% | 37 |
| fwb.Nine 1.0.1 | 10 | 15% | 15 |
| nz.jdc.nano.GridFu 1.0 | 6 | 9% | 42 |
| ntc.ControlledChaos 1.1.4 | 1 | 2% | 4 |
| bayen.nut.Squirrel 1.615 | 0 | 0% | 9 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 8 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 5 |

## Melee bench: F21

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.6 | 117 / 210 | 1.84 | 19.4% | 32080 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.4% | 117 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 70 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.8% | 13 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 12.0% | 4 |
| eld.Hmm 1.0 | 5.0 | 8.5% | 6 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.2% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.4% | 1 |
| fire219.CatBot 1.0 | 7.7 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 20 / 35 | 5340 |
| 2 | 1 | 70.5 | 93.0 | 21 / 35 | 5658 |
| 3 | 1 | 69.1 | 89.5 | 17 / 35 | 5072 |
| 4 | 1 | 69.2 | 89.5 | 19 / 35 | 5087 |
| 5 | 1 | 70.1 | 92.7 | 17 / 35 | 5605 |
| 6 | 1 | 70.0 | 90.5 | 23 / 35 | 5318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 89 | 53% |
| dummy.mini.Scimitar 1.01 | 40 | 85% |
| cf.RiO.RiOx 4.2.1 | 22 | 100% |
| eld.Hmm 1.0 | 11 | 64% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1233. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 51 | 55% | 88 |
| dummy.mini.Scimitar 1.01 | 22 | 24% | 60 |
| cf.RiO.RiOx 4.2.1 | 8 | 9% | 19 |
| eld.Hmm 1.0 | 5 | 5% | 21 |
| el.JumpShoot 0.2 | 5 | 5% | 10 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.5 | 87 / 210 | 2.12 | 17.7% | 27620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.2 | 17.7% | 87 |
| pe.SandboxDT 2.71m | 1.8 | 17.1% | 79 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.0% | 24 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.8% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 3 |
| tad.Dalek98 0.98 | 6.7 | 6.8% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.3 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.1 | 11 / 35 | 4835 |
| 2 | 1 | 67.3 | 85.4 | 15 / 35 | 4561 |
| 3 | 1 | 68.0 | 89.8 | 14 / 35 | 4614 |
| 4 | 2 | 67.1 | 86.3 | 12 / 35 | 4351 |
| 5 | 1 | 69.3 | 93.7 | 21 / 35 | 4601 |
| 6 | 1 | 67.2 | 84.8 | 14 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 70 | 30% |
| kvk.HebusLeTroll 0.35 | 41 | 73% |
| jlm.javaDisturbance 0.59 | 26 | 85% |
| bigpete.Stewie 1.0 | 11 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 60 | 48% | 86 |
| kvk.HebusLeTroll 0.35 | 29 | 23% | 53 |
| jlm.javaDisturbance 0.59 | 23 | 19% | 43 |
| tad.Dalek98 0.98 | 5 | 4% | 5 |
| bigpete.Stewie 1.0 | 4 | 3% | 17 |
| pbg.NinjaX 1.2 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.2 | 87 / 210 | 2.33 | 18.0% | 30946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.3 | 18.0% | 87 |
| pe.SandboxLump 1.52 | 1.7 | 17.3% | 77 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 25 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.5% | 13 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 2 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 9.0% | 6 |
| cw.megas.Blade 0.8 | 6.7 | 8.3% | 0 |
| sample.Walls 1.0 | 7.5 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.0 | 16 / 35 | 5166 |
| 2 | 1 | 69.2 | 85.7 | 16 / 35 | 5569 |
| 3 | 1 | 69.1 | 89.5 | 17 / 35 | 5009 |
| 4 | 1 | 69.2 | 88.3 | 13 / 35 | 5166 |
| 5 | 2 | 67.4 | 83.2 | 13 / 35 | 4879 |
| 6 | 2 | 66.6 | 77.8 | 12 / 35 | 5157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 75 | 49% |
| cre.Karolos 0.32 | 27 | 52% |
| stelo.AreaTargetingBot 1.1 | 27 | 70% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| stelo.RamTrackSurfer 1.2 | 5 | 80% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 68 | 55% | 102 |
| cre.Karolos 0.32 | 25 | 20% | 42 |
| stelo.AreaTargetingBot 1.1 | 18 | 15% | 38 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 5% | 10 |
| sample.Walls 1.0 | 5 | 4% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 6 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 3 |

## Melee bench: F24

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 73.4 | 45 / 210 | 3.39 | 14.4% | 21278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.8 | 14.4% | 45 |
| rz.GlowBlowMelee 1.4 | 2.5 | 14.0% | 41 |
| florent.XSeries.X2 0.12 | 2.7 | 14.2% | 54 |
| davidalves.Phoenix 0.54 | 3.3 | 13.0% | 39 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.2% | 17 |
| oog.melee.Corsair 1.0 | 5.8 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 7.5% | 8 |
| lunchie.Lunchbox 0.93 | 7.7 | 6.9% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 72.1 | 4 / 35 | 3243 |
| 2 | 2 | 63.5 | 76.5 | 9 / 35 | 3735 |
| 3 | 2 | 60.9 | 71.1 | 9 / 35 | 3459 |
| 4 | 1 | 62.3 | 74.0 | 8 / 35 | 3735 |
| 5 | 3 | 59.6 | 67.0 | 6 / 35 | 3642 |
| 6 | 1 | 63.3 | 80.0 | 9 / 35 | 3464 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 26 | 54% |
| florent.XSeries.X2 0.12 | 20 | 15% |
| davidalves.Phoenix 0.54 | 18 | 56% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| stelo.SoJNanoMelee 1.1 | 6 | 67% |
| pedersen.Ugluk 1.1.1 | 6 | 50% |
| lunchie.Lunchbox 0.93 | 5 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 59 | 36% | 61 |
| rz.GlowBlowMelee 1.4 | 38 | 23% | 48 |
| pedersen.Ugluk 1.1.1 | 22 | 13% | 28 |
| davidalves.Phoenix 0.54 | 19 | 11% | 31 |
| stelo.SoJNanoMelee 1.1 | 12 | 7% | 15 |
| oog.melee.Corsair 1.0 | 7 | 4% | 10 |
| evd.X1 0.01 | 5 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 4 | 2% | 10 |

## Melee bench: F25

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.7 | 126 / 210 | 2.29 | 18.1% | 24320 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.1% | 126 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.6% | 28 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.4% | 18 |
| jdw.Hurricane 1.4 | 3.7 | 11.3% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.2% | 4 |
| ds.Oo 2.2 | 5.8 | 8.9% | 7 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.6% | 3 |
| awesomeness.Elite 1.0 | 7.8 | 6.9% | 1 |
| adt.Ar2 1.1 | 9.0 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.6 | 19 / 35 | 4262 |
| 2 | 1 | 66.7 | 84.8 | 20 / 35 | 3811 |
| 3 | 1 | 62.6 | 72.1 | 15 / 35 | 3668 |
| 4 | 1 | 69.0 | 92.7 | 23 / 35 | 4069 |
| 5 | 1 | 67.5 | 87.0 | 21 / 35 | 4058 |
| 6 | 1 | 71.2 | 95.9 | 28 / 35 | 4452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 53 | 87% |
| voidious.mini.BrokenSword 2.0.3 | 47 | 77% |
| jdw.Hurricane 1.4 | 17 | 76% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| ds.Oo 2.2 | 7 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 631. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 25 | 29% | 66 |
| jdw.Hurricane 1.4 | 20 | 24% | 31 |
| voidious.micro.BlitzBat 1.05 | 17 | 20% | 54 |
| adt.Ar2 1.1 | 6 | 7% | 9 |
| ds.Oo 2.2 | 5 | 6% | 16 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 16 |
| gre.svman4.Morfeas 1.4.1 | 3 | 4% | 8 |
| awesomeness.Elite 1.0 | 3 | 4% | 6 |
| amk.ChumbaMini 0.2 | 2 | 2% | 3 |

## Melee bench: F26

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.6 | 112 / 210 | 2.12 | 18.3% | 30488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.3% | 112 |
| ak.Fermat 2.0 | 2.0 | 15.0% | 38 |
| shu.nitro.LENIN .T34 | 3.2 | 12.9% | 30 |
| lrem.Spectre 0.4.4 | 4.3 | 11.3% | 17 |
| js.PinBall 1.6 | 5.2 | 10.8% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.2% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.2% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.4% | 3 |
| sample.SpinBot 1.0 | 8.8 | 5.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.1 | 15 / 35 | 4608 |
| 2 | 1 | 69.9 | 91.4 | 24 / 35 | 5253 |
| 3 | 1 | 68.8 | 87.3 | 18 / 35 | 5522 |
| 4 | 1 | 68.4 | 86.3 | 18 / 35 | 5008 |
| 5 | 1 | 67.6 | 85.7 | 16 / 35 | 4915 |
| 6 | 1 | 69.3 | 89.5 | 21 / 35 | 5182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 55 | 62% |
| shu.nitro.LENIN .T34 | 39 | 85% |
| lrem.Spectre 0.4.4 | 24 | 71% |
| js.PinBall 1.6 | 14 | 79% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 38 | 39% | 71 |
| shu.nitro.LENIN .T34 | 26 | 27% | 65 |
| lrem.Spectre 0.4.4 | 15 | 15% | 34 |
| js.PinBall 1.6 | 7 | 7% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 5% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 10 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.5 | 128 / 210 | 2.30 | 18.0% | 25535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.2 | 18.0% | 128 |
| mk.Alpha 0.2.1 | 1.8 | 14.7% | 52 |
| wee.Gem 1.8.4 | 4.0 | 10.8% | 20 |
| EH.Eagle 1.0.6 | 4.7 | 9.5% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 5.7 | 9.9% | 5 |
| joe.ADinosaur 1.0 | 5.8 | 8.8% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.3% | 0 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.9% | 0 |
| caimano.Furia_Ceca 0.22 | 7.8 | 7.6% | 1 |
| cs.Grudge 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 89.5 | 22 / 35 | 4221 |
| 2 | 1 | 67.9 | 87.9 | 27 / 35 | 4169 |
| 3 | 1 | 65.6 | 82.9 | 19 / 35 | 3593 |
| 4 | 1 | 69.6 | 94.3 | 26 / 35 | 4388 |
| 5 | 1 | 66.8 | 87.0 | 22 / 35 | 3956 |
| 6 | 2 | 65.3 | 71.4 | 12 / 35 | 5208 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 75 | 73% |
| wee.Gem 1.8.4 | 26 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 89% |
| EH.Eagle 1.0.6 | 12 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 10 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 40 | 49% | 86 |
| joe.ADinosaur 1.0 | 12 | 15% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 9% | 24 |
| wee.Gem 1.8.4 | 6 | 7% | 33 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 10 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 14 |
| EH.Eagle 1.0.6 | 3 | 4% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 9 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F28

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 89.0 | 134 / 210 | 1.99 | 18.4% | 24235 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.4% | 134 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 38 |
| uji.Antique 1.0 | 3.2 | 11.6% | 13 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.1% | 13 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.3% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.2% | 3 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.9% | 5 |
| matt.advanced.Katana 1.0 | 8.0 | 6.5% | 1 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 95.9 | 28 / 35 | 3787 |
| 2 | 1 | 67.4 | 85.7 | 19 / 35 | 4374 |
| 3 | 1 | 67.4 | 88.6 | 22 / 35 | 3917 |
| 4 | 1 | 65.2 | 81.0 | 15 / 35 | 3933 |
| 5 | 1 | 68.6 | 90.8 | 23 / 35 | 4249 |
| 6 | 1 | 69.1 | 92.4 | 27 / 35 | 3975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 88 | 74% |
| uji.Antique 1.0 | 34 | 91% |
| qohnil.blot.BlotBot 3.61 | 16 | 81% |
| pfvicm.Sobieski 7.2.3b | 16 | 88% |
| ahr.ice.Ice 1.0.2 | 7 | 86% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| amk.ChumbaWumba 0.3 | 2 | 50% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 42% | 92 |
| pfvicm.Sobieski 7.2.3b | 11 | 14% | 21 |
| uji.Antique 1.0 | 9 | 12% | 38 |
| qohnil.blot.BlotBot 3.61 | 8 | 11% | 23 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 7 |
| ahr.ice.Ice 1.0.2 | 5 | 7% | 13 |
| stelo.PianistNano 1.2 | 3 | 4% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 9 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |

## Melee bench: F29

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.9 | 92 / 210 | 2.54 | 17.4% | 25671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 17.4% | 92 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.4% | 58 |
| deewiant.Anomaly 0.2 | 3.2 | 13.6% | 35 |
| myl.micro.Troodon 1.10 | 3.8 | 12.0% | 9 |
| jok.PheonixM 0.1.2 | 5.0 | 10.3% | 8 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.6% | 1 |
| DBall.Anarchy 0.1 | 7.0 | 6.8% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 6.0% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.1% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 81.0 | 14 / 35 | 4070 |
| 2 | 1 | 68.6 | 88.3 | 17 / 35 | 4575 |
| 3 | 1 | 68.1 | 85.1 | 17 / 35 | 4866 |
| 4 | 1 | 67.2 | 85.4 | 17 / 35 | 4180 |
| 5 | 1 | 65.9 | 81.0 | 14 / 35 | 3951 |
| 6 | 1 | 64.8 | 76.5 | 13 / 35 | 4029 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 46 | 54% |
| deewiant.Anomaly 0.2 | 45 | 62% |
| myl.micro.Troodon 1.10 | 25 | 88% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| DBall.Anarchy 0.1 | 6 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 50% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 44 | 37% | 68 |
| deewiant.Anomaly 0.2 | 32 | 27% | 65 |
| jok.PheonixM 0.1.2 | 16 | 13% | 21 |
| myl.micro.Troodon 1.10 | 10 | 8% | 28 |
| ph.melee.ArcherME 0.3 | 7 | 6% | 10 |
| jangs.ns51 1.0 | 4 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 8 |

## Melee bench: F30

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 71.3 | 43 / 210 | 3.59 | 14.3% | 23228 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.8 | 14.3% | 43 |
| darkcanuck.B26354 1.06 | 2.2 | 13.8% | 52 |
| catcat20.Matcha 0.006 | 2.5 | 14.0% | 57 |
| oog.melee.Capulet 1.2 | 4.2 | 12.4% | 21 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.0% | 19 |
| intruder.PrairieWolf 2.61 | 6.2 | 9.0% | 7 |
| ntc.Opposite 1.5 | 7.7 | 7.6% | 1 |
| tripphippy.Alice 1.1 | 8.0 | 6.9% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 7.5% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.9 | 6 / 35 | 4047 |
| 2 | 1 | 62.7 | 72.7 | 12 / 35 | 3822 |
| 3 | 3 | 60.3 | 68.3 | 4 / 35 | 3756 |
| 4 | 2 | 62.5 | 73.3 | 7 / 35 | 3981 |
| 5 | 2 | 60.0 | 67.0 | 7 / 35 | 3583 |
| 6 | 1 | 61.9 | 71.4 | 7 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 19 | 32% |
| oog.melee.Capulet 1.2 | 15 | 67% |
| catcat20.Matcha 0.006 | 14 | 29% |
| stelo.PastFuture 2.3.2 | 13 | 77% |
| fowl3628800.LightningBolt 2.6.0 | 10 | 90% |
| intruder.PrairieWolf 2.61 | 4 | 100% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 167 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 57 | 34% | 64 |
| darkcanuck.B26354 1.06 | 40 | 24% | 48 |
| oog.melee.Capulet 1.2 | 23 | 14% | 35 |
| stelo.PastFuture 2.3.2 | 21 | 13% | 30 |
| tripphippy.Alice 1.1 | 11 | 7% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 13 |
| fowl3628800.LightningBolt 2.6.0 | 3 | 2% | 5 |
| ntc.Opposite 1.5 | 3 | 2% | 3 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 77.7 | 41 / 210 | 3.01 | 15.0% | 20623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 104 |
| hadur117.mini.DeiseFL 0.2 | 2.2 | 15.0% | 41 |
| gh.mini.Griezel 0.2 | 3.5 | 12.8% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 12.0% | 15 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.9% | 12 |
| gh.nano.Grofvuil 0.2 | 5.8 | 8.8% | 1 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.9% | 1 |
| fm.mammillarias 1.3 | 8.2 | 6.0% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 74.9 | 5 / 35 | 3337 |
| 2 | 2 | 63.1 | 79.0 | 6 / 35 | 3295 |
| 3 | 2 | 62.3 | 73.3 | 9 / 35 | 3593 |
| 4 | 3 | 62.5 | 74.3 | 4 / 35 | 3619 |
| 5 | 2 | 64.1 | 81.9 | 11 / 35 | 3295 |
| 6 | 2 | 64.2 | 82.5 | 6 / 35 | 3484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 55 | 29% |
| gh.mini.Griezel 0.2 | 20 | 40% |
| spinnercat.micro.Tyger 0.1 | 19 | 58% |
| d414.nano.Quantum 1.0.0 | 7 | 29% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 86 | 51% | 104 |
| spinnercat.micro.Tyger 0.1 | 25 | 15% | 36 |
| gh.mini.Griezel 0.2 | 23 | 14% | 30 |
| d414.nano.Quantum 1.0.0 | 19 | 11% | 21 |
| fm.mammillarias 1.3 | 8 | 5% | 8 |
| timmit.nano.TimDog 0.33 | 4 | 2% | 4 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.2 | 121 / 210 | 2.33 | 18.0% | 28143 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.0% | 121 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.7% | 51 |
| apc.botM 3.0 | 3.2 | 12.0% | 18 |
| lxx.ConceptA 0.8 | 3.7 | 11.3% | 6 |
| vjik.UnViolation 1.1 | 5.0 | 9.6% | 9 |
| bayen.UbaMicro 1.4 | 6.5 | 8.0% | 1 |
| panzer.Panzer 0.2 | 6.8 | 7.5% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.7% | 2 |
| conscience.Electron 1.3g | 8.5 | 6.5% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 90.5 | 22 / 35 | 4772 |
| 2 | 1 | 67.2 | 86.0 | 21 / 35 | 4687 |
| 3 | 1 | 66.8 | 83.8 | 17 / 35 | 4834 |
| 4 | 1 | 66.2 | 81.6 | 22 / 35 | 4568 |
| 5 | 1 | 66.1 | 81.9 | 20 / 35 | 4461 |
| 6 | 1 | 67.7 | 87.6 | 19 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 75 | 63% |
| lxx.ConceptA 0.8 | 30 | 100% |
| apc.botM 3.0 | 25 | 72% |
| yk.JahMicro 1.0 | 9 | 100% |
| vjik.UnViolation 1.1 | 8 | 88% |
| donjezza.Jezza 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| bayen.UbaMicro 1.4 | 1 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 688. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 36 | 40% | 82 |
| lxx.ConceptA 0.8 | 17 | 19% | 35 |
| apc.botM 3.0 | 14 | 16% | 31 |
| bayen.UbaMicro 1.4 | 8 | 9% | 12 |
| vjik.UnViolation 1.1 | 6 | 7% | 19 |
| panzer.Panzer 0.2 | 4 | 4% | 9 |
| conscience.Electron 1.3g | 3 | 3% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 8 |
| donjezza.Jezza 1.0 | 1 | 1% | 7 |

## Melee bench: F33

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.3 | 123 / 210 | 2.23 | 18.7% | 28660 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.7% | 123 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.0% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.6% | 10 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 9 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.3% | 7 |
| zyx.micro.Ant 1.1 | 8.3 | 5.6% | 0 |
| sanja.First 0.1 | 9.2 | 5.1% | 2 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.8 | 21 / 35 | 4883 |
| 2 | 1 | 68.1 | 84.8 | 19 / 35 | 4671 |
| 3 | 1 | 69.1 | 88.3 | 20 / 35 | 4735 |
| 4 | 1 | 68.9 | 87.6 | 21 / 35 | 4579 |
| 5 | 1 | 68.9 | 86.7 | 22 / 35 | 4941 |
| 6 | 1 | 68.7 | 86.7 | 20 / 35 | 4851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 70 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 39 | 72% |
| gre.svman4.Leonidas 1.3.2 | 24 | 83% |
| kinsen.melee.Angsaichmophobia 1.8c | 14 | 64% |
| labg.Cataclysm 2.05 | 8 | 88% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 997. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 34% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 17% | 48 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 13% | 15 |
| gre.svman4.Leonidas 1.3.2 | 9 | 10% | 19 |
| zyx.micro.Ant 1.1 | 8 | 9% | 10 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 8% | 10 |
| labg.Cataclysm 2.05 | 5 | 6% | 19 |
| baal.nano.N 1.42 | 2 | 2% | 5 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.7 | 66 / 210 | 2.64 | 16.8% | 28335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.8 | 16.8% | 66 |
| stelo.Spread 0.9 | 1.8 | 16.7% | 76 |
| kid.Gladiator .7.2 | 2.3 | 15.8% | 49 |
| tcf.Reach 3 | 4.7 | 10.6% | 3 |
| jcs.Seth 1.8 | 4.8 | 10.6% | 14 |
| cli.Dancer 1.1 | 5.5 | 10.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.5% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 4.0% | 2 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.8 | 82.2 | 10 / 35 | 4836 |
| 2 | 3 | 64.6 | 76.8 | 9 / 35 | 4195 |
| 3 | 1 | 65.2 | 76.5 | 12 / 35 | 4477 |
| 4 | 2 | 66.9 | 84.1 | 10 / 35 | 4634 |
| 5 | 1 | 69.3 | 88.6 | 18 / 35 | 5244 |
| 6 | 2 | 66.3 | 82.2 | 7 / 35 | 4949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 58 | 50% |
| kid.Gladiator .7.2 | 36 | 53% |
| jcs.Seth 1.8 | 9 | 44% |
| tcf.Reach 3 | 7 | 71% |
| cli.Dancer 1.1 | 5 | 100% |
| ratosh.Wesco 1.4 | 3 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 145 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 64 | 44% | 95 |
| kid.Gladiator .7.2 | 46 | 32% | 56 |
| tcf.Reach 3 | 11 | 8% | 20 |
| jcs.Seth 1.8 | 11 | 8% | 16 |
| ratosh.Wesco 1.4 | 8 | 6% | 11 |
| cli.Dancer 1.1 | 4 | 3% | 8 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 74.1 | 29 / 210 | 3.33 | 13.9% | 19135 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 158 |
| hadur117.mini.DeiseFL 0.2 | 2.0 | 13.9% | 29 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.6% | 12 |
| rz.HawkOnFire 0.1 | 4.0 | 11.6% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 11.9% | 7 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.2% | 0 |
| wit.Chuliath 1.0 | 6.7 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 79.0 | 7 / 35 | 3146 |
| 2 | 2 | 61.2 | 74.3 | 4 / 35 | 3312 |
| 3 | 2 | 60.3 | 70.8 | 2 / 35 | 3280 |
| 4 | 2 | 61.1 | 72.7 | 6 / 35 | 3204 |
| 5 | 2 | 61.1 | 73.3 | 3 / 35 | 3105 |
| 6 | 2 | 61.6 | 74.3 | 7 / 35 | 3088 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 34 | 9% |
| rz.HawkOnFire 0.1 | 15 | 87% |
| gh.mini.Gruwel 0.9 | 11 | 64% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 67% |

Hadur died in 181 of 210 rounds, at a mean tick of 711. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 111 | 61% | 114 |
| rz.HawkOnFire 0.1 | 21 | 12% | 33 |
| dmh.robocode.robot.BlackDeath 9.2 | 21 | 12% | 27 |
| gh.mini.Gruwel 0.9 | 15 | 8% | 23 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| wit.Chuliath 1.0 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.8 | 156 / 210 | 1.65 | 20.8% | 33242 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 20.8% | 156 |
| alpha.RainingFire 1.0 | 2.3 | 12.6% | 24 |
| bzdp.Pansy 2.1 | 3.0 | 11.5% | 7 |
| mz.Cork 0.1 | 4.7 | 10.2% | 4 |
| bvh.micro.Freya 0.3 | 5.0 | 10.1% | 8 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.5% | 4 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.3% | 5 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.0% | 0 |
| dl.BetterWalls 1.0 | 9.3 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.6 | 27 / 35 | 6072 |
| 2 | 1 | 70.9 | 93.3 | 27 / 35 | 5303 |
| 3 | 1 | 71.1 | 93.3 | 26 / 35 | 5724 |
| 4 | 1 | 71.3 | 94.3 | 28 / 35 | 5615 |
| 5 | 1 | 71.2 | 94.0 | 30 / 35 | 5283 |
| 6 | 1 | 68.4 | 86.0 | 18 / 35 | 5245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 42 | 93% |
| bvh.micro.Freya 0.3 | 26 | 92% |
| alpha.RainingFire 1.0 | 25 | 68% |
| mz.Cork 0.1 | 24 | 92% |
| bvh.mini.Fenrir 0.39 | 22 | 91% |
| m3thos.Eva02 0.7.1 | 18 | 94% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 782. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 27 | 50% | 53 |
| bzdp.Pansy 2.1 | 11 | 20% | 56 |
| bvh.mini.Fenrir 0.39 | 6 | 11% | 12 |
| bvh.micro.Freya 0.3 | 5 | 9% | 21 |
| mz.Cork 0.1 | 3 | 6% | 30 |
| m3thos.Eva02 0.7.1 | 1 | 2% | 16 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 3 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 12 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 83.8 | 127 / 210 | 2.46 | 17.7% | 30494 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 17.7% | 127 |
| germ.TheMind .2 | 2.3 | 11.7% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.8% | 15 |
| EBBU.Sim2 1.02 | 4.5 | 9.7% | 8 |
| mb.Beast 0.1 | 6.0 | 9.1% | 12 |
| agrach.Dalek 1.0 | 6.7 | 8.4% | 7 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.6% | 5 |
| skm.Ryubot 1.0 | 8.0 | 7.9% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.7% | 0 |
| lmk.ACPFinal 0.1 | 8.3 | 8.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.5 | 22 / 35 | 5127 |
| 2 | 1 | 66.2 | 81.3 | 23 / 35 | 5046 |
| 3 | 1 | 65.1 | 83.2 | 19 / 35 | 4768 |
| 4 | 1 | 67.5 | 87.9 | 24 / 35 | 5197 |
| 5 | 1 | 65.6 | 82.5 | 18 / 35 | 5258 |
| 6 | 1 | 66.2 | 84.1 | 21 / 35 | 5098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 34 | 85% |
| EBBU.Sim2 1.02 | 20 | 90% |
| mb.Beast 0.1 | 17 | 100% |
| stelo.UntouchableNano 1.3 | 16 | 94% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 92% |
| skm.Ryubot 1.0 | 13 | 85% |
| lmk.ACPFinal 0.1 | 13 | 100% |
| agrach.Dalek 1.0 | 12 | 92% |

Hadur died in 86 of 210 rounds, at a mean tick of 448. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 23 | 27% | 45 |
| EBBU.Sim2 1.02 | 14 | 16% | 28 |
| stelo.UntouchableNano 1.3 | 9 | 10% | 25 |
| agrach.Dalek 1.0 | 9 | 10% | 23 |
| mb.Beast 0.1 | 8 | 9% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 8% | 25 |
| skm.Ryubot 1.0 | 7 | 8% | 13 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 6% | 8 |
| lmk.ACPFinal 0.1 | 4 | 5% | 17 |

## Melee bench: F38

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.7 | 69 / 210 | 3.00 | 15.8% | 24729 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 17.1% | 89 |
| hadur117.mini.DeiseFL 0.2 | 1.8 | 15.8% | 69 |
| bvh.mini.Freya 0.55 | 3.2 | 12.7% | 16 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.2% | 15 |
| cs.Wren 1.0 | 5.2 | 9.9% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 9.8% | 4 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.5% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.8% | 2 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 76.5 | 12 / 35 | 3995 |
| 2 | 1 | 65.8 | 82.5 | 14 / 35 | 4395 |
| 3 | 2 | 65.4 | 79.7 | 11 / 35 | 4377 |
| 4 | 2 | 64.1 | 77.1 | 14 / 35 | 3931 |
| 5 | 2 | 63.3 | 75.2 | 9 / 35 | 4050 |
| 6 | 2 | 63.1 | 75.2 | 9 / 35 | 3981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 41 | 51% |
| bvh.mini.Freya 0.55 | 19 | 84% |
| cs.Wren 1.0 | 11 | 64% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 91% |
| bts.mega.Gnarly 1.4 | 9 | 67% |
| kdf.KoulDestroyer 1.0 | 8 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 57 | 40% | 83 |
| bvh.mini.Freya 0.55 | 26 | 18% | 34 |
| bts.mega.Gnarly 1.4 | 20 | 14% | 27 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 11% | 30 |
| cs.Wren 1.0 | 13 | 9% | 19 |
| kdf.KoulDestroyer 1.0 | 7 | 5% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.9 | 96 / 210 | 2.36 | 17.5% | 27737 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 17.5% | 96 |
| bvh.fry.Freya 0.82 | 2.2 | 14.6% | 23 |
| az.Ololobot 0.2.4 | 3.2 | 13.0% | 59 |
| catcat20.Lambda 0.024 | 3.7 | 11.5% | 23 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.0% | 8 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 7.9% | 0 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.7% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 85.7 | 17 / 35 | 4629 |
| 2 | 1 | 64.9 | 82.9 | 13 / 35 | 4106 |
| 3 | 1 | 66.8 | 85.7 | 15 / 35 | 4591 |
| 4 | 1 | 67.4 | 86.7 | 18 / 35 | 4810 |
| 5 | 1 | 66.4 | 85.4 | 15 / 35 | 4613 |
| 6 | 1 | 66.7 | 83.2 | 18 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 42% |
| bvh.fry.Freya 0.82 | 38 | 89% |
| catcat20.Lambda 0.024 | 27 | 74% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 87% |
| winamp32.micro.MicroMacro 1.0 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 0% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1068. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 35 | 30% | 52 |
| bvh.fry.Freya 0.82 | 33 | 28% | 70 |
| catcat20.Lambda 0.024 | 24 | 21% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 12% | 22 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 3% | 4 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 7 |
| gimp.GimpBot 0.1 | 1 | 1% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.7 | 109 / 210 | 2.38 | 18.2% | 28829 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 18.2% | 109 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 44 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.7% | 26 |
| mz.AntiGrav 1.0 | 4.2 | 10.7% | 7 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.0% | 6 |
| alpha.BlackIce 1.0 | 6.3 | 8.8% | 4 |
| stelo.Randomness 1.0 | 6.7 | 8.7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.5% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.8% | 4 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 85.1 | 19 / 35 | 4808 |
| 2 | 1 | 67.7 | 84.4 | 17 / 35 | 4853 |
| 3 | 1 | 69.6 | 88.9 | 23 / 35 | 5113 |
| 4 | 1 | 67.1 | 84.1 | 19 / 35 | 4438 |
| 5 | 1 | 67.4 | 84.1 | 17 / 35 | 4639 |
| 6 | 1 | 66.5 | 81.6 | 14 / 35 | 4978 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 50 | 70% |
| kano.gamma.KanoGamma 1.8 | 29 | 69% |
| mz.AntiGrav 1.0 | 28 | 96% |
| Polkwane.SmashMelee 1.0 | 15 | 87% |
| stelo.Randomness 1.0 | 14 | 64% |
| alpha.BlackIce 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 33 | 33% | 63 |
| kano.gamma.KanoGamma 1.8 | 16 | 16% | 42 |
| mz.AntiGrav 1.0 | 13 | 13% | 40 |
| alpha.BlackIce 1.0 | 11 | 11% | 17 |
| stelo.Randomness 1.0 | 10 | 10% | 18 |
| Polkwane.SmashMelee 1.0 | 9 | 9% | 19 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 6 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 4 |
| sample.Corners 1.0 | 1 | 1% | 1 |

## Melee bench: F41

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.4 | 113 / 210 | 2.13 | 17.9% | 24323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 17.9% | 113 |
| eem.EvBotNG v12.8 | 2.0 | 15.5% | 52 |
| ary.Swarm 1.1 | 3.3 | 12.6% | 16 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 12 |
| shrub.Silver v048 | 6.2 | 9.0% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.8% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 19 / 35 | 4018 |
| 2 | 1 | 67.6 | 86.3 | 16 / 35 | 4218 |
| 3 | 1 | 69.7 | 94.0 | 25 / 35 | 4227 |
| 4 | 1 | 67.0 | 86.7 | 14 / 35 | 4049 |
| 5 | 1 | 67.5 | 88.9 | 18 / 35 | 4015 |
| 6 | 1 | 67.6 | 87.0 | 21 / 35 | 3796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 66 | 55% |
| ary.Swarm 1.1 | 41 | 83% |
| lessonz.robocode.Oz 0.5.0 | 26 | 77% |
| simonton.nano.MeleeSeed 1.8 | 21 | 81% |
| shrub.Silver v048 | 3 | 67% |
| zyx.nano.Ant 1.1 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 49% | 89 |
| ary.Swarm 1.1 | 16 | 16% | 48 |
| simonton.nano.MeleeSeed 1.8 | 12 | 12% | 30 |
| lessonz.robocode.Oz 0.5.0 | 12 | 12% | 25 |
| shrub.Silver v048 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| stelo.Mirror 1.1 | 0 | 0% | 4 |

## Melee bench: F42

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.1 | 100 / 210 | 2.16 | 18.1% | 29278 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.2 | 18.1% | 100 |
| wompi.Wallaby 5.1 | 1.8 | 15.9% | 58 |
| ara.Shera 0.88 | 3.3 | 13.0% | 33 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.0% | 14 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 1 |
| maribo.IotaCT 1.1 | 6.7 | 7.2% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.1% | 2 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 85.4 | 17 / 35 | 4849 |
| 2 | 1 | 69.0 | 91.4 | 19 / 35 | 5189 |
| 3 | 2 | 67.1 | 84.4 | 10 / 35 | 4994 |
| 4 | 1 | 68.5 | 88.3 | 20 / 35 | 5092 |
| 5 | 1 | 67.2 | 85.4 | 17 / 35 | 4496 |
| 6 | 1 | 67.4 | 87.6 | 17 / 35 | 4658 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 58 | 60% |
| ara.Shera 0.88 | 40 | 68% |
| maribo.mini.MiniQuester 0.1 | 37 | 84% |
| dsw.StaticD 1.0 | 4 | 75% |
| amz.NanoClone 1.41 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 54 | 48% | 91 |
| ara.Shera 0.88 | 27 | 24% | 49 |
| maribo.mini.MiniQuester 0.1 | 21 | 19% | 45 |
| amz.NanoClone 1.41 | 8 | 7% | 10 |
| dsw.StaticD 1.0 | 1 | 1% | 7 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 4 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.2 | 22 / 210 | 3.50 | 13.8% | 21038 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.2% | 167 |
| hadur117.mini.DeiseFL 0.2 | 2.2 | 13.8% | 22 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.4% | 15 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.2% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.7% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.7% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.4% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 73.7 | 4 / 35 | 3266 |
| 2 | 2 | 63.5 | 74.6 | 3 / 35 | 3732 |
| 3 | 2 | 63.1 | 74.6 | 4 / 35 | 3408 |
| 4 | 2 | 60.8 | 67.6 | 3 / 35 | 3399 |
| 5 | 3 | 61.1 | 66.7 | 4 / 35 | 3469 |
| 6 | 2 | 63.8 | 75.9 | 4 / 35 | 3764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 59 | 10% |
| brainfade.melee.Dusk 0.44 | 10 | 70% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |
| dummy.micro.Sparrow 2.5 | 2 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 134 | 71% | 141 |
| brainfade.melee.Dusk 0.44 | 21 | 11% | 27 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 8% | 18 |
| dummy.micro.Sparrow 2.5 | 10 | 5% | 13 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 2 | 1% | 3 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |

## Melee bench: F44

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.6 | 108 / 210 | 1.93 | 19.0% | 29684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 19.0% | 108 |
| tzu.TheArtOfWar 1.2 | 2.3 | 14.7% | 40 |
| stelo.Liblix 0.3.1 | 2.7 | 14.5% | 52 |
| wompi.Quokka 1.6 | 4.3 | 10.2% | 3 |
| jwirde.Gort 2.0 | 5.2 | 9.4% | 6 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 8.8% | 1 |
| disan.Chair 2.2.0 | 6.8 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 8.2 | 6.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 19 / 35 | 4821 |
| 2 | 1 | 69.3 | 90.8 | 20 / 35 | 4931 |
| 3 | 1 | 68.3 | 88.3 | 15 / 35 | 5038 |
| 4 | 1 | 70.1 | 93.0 | 22 / 35 | 5011 |
| 5 | 1 | 68.5 | 89.5 | 13 / 35 | 4911 |
| 6 | 1 | 68.9 | 89.2 | 19 / 35 | 4972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 79 | 63% |
| tzu.TheArtOfWar 1.2 | 65 | 57% |
| wompi.Quokka 1.6 | 9 | 100% |
| jwirde.Gort 2.0 | 8 | 63% |
| disan.Chair 2.2.0 | 3 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| sample.Crazy 1.0 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1015. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 44 | 43% | 95 |
| tzu.TheArtOfWar 1.2 | 38 | 37% | 74 |
| jwirde.Gort 2.0 | 6 | 6% | 12 |
| disan.Chair 2.2.0 | 4 | 4% | 5 |
| wompi.Quokka 1.6 | 3 | 3% | 8 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 3% | 6 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 6 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F45

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.7 | 95 / 210 | 1.84 | 20.1% | 34931 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFL 0.2 | 1.0 | 20.1% | 95 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.4% | 93 |
| jje.BagPuss 1.2 | 3.5 | 11.4% | 7 |
| sul.Lunar 1.1 | 4.2 | 10.1% | 6 |
| myl.nano.Graviton 1.10 | 4.2 | 10.0% | 4 |
| hvilela.HVilela 0.9 | 6.3 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.1% | 4 |
| fm.claire 1.7 | 7.3 | 8.0% | 1 |
| wit.Deep7 2.0 | 9.0 | 6.1% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 93.3 | 21 / 35 | 6318 |
| 2 | 1 | 69.0 | 88.6 | 12 / 35 | 5729 |
| 3 | 1 | 70.1 | 93.0 | 18 / 35 | 5454 |
| 4 | 1 | 67.5 | 83.8 | 9 / 35 | 5452 |
| 5 | 1 | 70.0 | 92.1 | 17 / 35 | 5717 |
| 6 | 1 | 71.0 | 93.3 | 18 / 35 | 6261 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 101 | 29% |
| jje.BagPuss 1.2 | 20 | 80% |
| sul.Lunar 1.1 | 15 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| wit.Deep7 2.0 | 10 | 90% |
| myl.nano.Graviton 1.10 | 9 | 100% |
| fm.claire 1.7 | 5 | 80% |
| hvilela.HVilela 0.9 | 4 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 2211. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 73 | 63% | 0 |
| myl.nano.Graviton 1.10 | 13 | 11% | 42 |
| sul.Lunar 1.1 | 9 | 8% | 57 |
| jje.BagPuss 1.2 | 9 | 8% | 44 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 19 |
| fm.claire 1.7 | 4 | 3% | 15 |
| hvilela.HVilela 0.9 | 2 | 2% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

## Melee bench: F46

hadur117.mini.DeiseFL 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 72.8 | 26 / 210 | 3.45 | 14.2% | 24006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.2 | 17.8% | 95 |
| kc.mini.Mirage 0.2 | 1.8 | 17.5% | 76 |
| hadur117.mini.DeiseFL 0.2 | 3.0 | 14.2% | 26 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 0 |
| cx.Princess 1.0 | 5.0 | 9.7% | 12 |
| sadoner.killer 0.2 | 5.5 | 9.3% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.8% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.4% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.0 | 70.8 | 3 / 35 | 4237 |
| 2 | 3 | 63.7 | 76.2 | 5 / 35 | 4268 |
| 3 | 3 | 61.8 | 73.0 | 7 / 35 | 3762 |
| 4 | 3 | 62.3 | 72.1 | 6 / 35 | 3872 |
| 5 | 3 | 62.1 | 74.9 | 2 / 35 | 3903 |
| 6 | 3 | 61.4 | 69.5 | 3 / 35 | 3964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 34 | 35% |
| rsalesc.melee.Medina 0.4.5 | 25 | 24% |
| cx.Princess 1.0 | 5 | 60% |
| mz.MicroSheep 1.0 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 71 | 39% | 80 |
| kc.mini.Mirage 0.2 | 67 | 36% | 79 |
| arthord.NanoSatanMelee Beta | 14 | 8% | 14 |
| cx.Princess 1.0 | 12 | 7% | 14 |
| mz.MicroSheep 1.0 | 10 | 5% | 12 |
| sadoner.killer 0.2 | 5 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 3 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

