# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 74.4 | 24 / 210 | 3.30 | 15.1% | 31199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 147 |
| hadur117.mini.DeiseWHPF 0.2 | 2.0 | 15.1% | 24 |
| sgp.JollyNinja 3.53 | 4.0 | 11.6% | 17 |
| mz.MicroGodMelee 1 | 4.0 | 11.5% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 11.3% | 3 |
| lorneswork.Predator 1.0 | 5.7 | 10.1% | 6 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 72.7 | 4 / 35 | 5230 |
| 2 | 2 | 63.3 | 71.7 | 5 / 35 | 5115 |
| 3 | 2 | 64.5 | 77.8 | 5 / 35 | 4999 |
| 4 | 2 | 64.2 | 77.1 | 5 / 35 | 5104 |
| 5 | 2 | 64.0 | 72.7 | 0 / 35 | 5709 |
| 6 | 2 | 63.5 | 74.3 | 5 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 63 | 3% |
| sgp.JollyNinja 3.53 | 8 | 75% |
| mz.MicroGodMelee 1 | 8 | 25% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| adt.Ar2 1.0 | 4 | 100% |
| lorneswork.Predator 1.0 | 4 | 75% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 97 | 52% | 100 |
| mz.MicroGodMelee 1 | 28 | 15% | 32 |
| sgp.JollyNinja 3.53 | 26 | 14% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 21 | 11% | 23 |
| lorneswork.Predator 1.0 | 11 | 6% | 18 |
| adt.Ar2 1.0 | 1 | 1% | 3 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.7 | 43 / 210 | 3.28 | 16.5% | 34831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.2 | 16.5% | 43 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.6% | 57 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.0% | 48 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.2 | 10.8% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 5.2 | 9.7% | 1 |
| sch.Simone 0.3d | 6.8 | 8.2% | 18 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.1% | 4 |
| Noran.BitchingElk 0.054 | 7.0 | 7.9% | 14 |
| stelo.PatternRobot 1.0 | 9.2 | 5.8% | 2 |
| fullsail.SweetTea 1.1 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 76.8 | 10 / 35 | 5972 |
| 2 | 1 | 65.6 | 77.5 | 7 / 35 | 5567 |
| 3 | 1 | 65.0 | 75.2 | 5 / 35 | 5972 |
| 4 | 1 | 64.6 | 74.3 | 4 / 35 | 5986 |
| 5 | 1 | 65.2 | 74.9 | 9 / 35 | 5688 |
| 6 | 2 | 63.6 | 69.2 | 8 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 30 | 23% |
| pulsar.PulsarMax 0.8.9 | 25 | 28% |
| com.cohesiva.robocode.ManOwaR 1.0 | 14 | 64% |
| Noran.BitchingElk 0.054 | 14 | 43% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| sch.Simone 0.3d | 7 | 29% |
| fnc.bandit.Bandit 5.2.0 | 3 | 33% |
| stelo.PatternRobot 1.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 51 | 31% | 60 |
| pulsar.PulsarMax 0.8.9 | 50 | 30% | 59 |
| com.cohesiva.robocode.ManOwaR 1.0 | 21 | 13% | 32 |
| sch.Simone 0.3d | 18 | 11% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 5% | 13 |
| Noran.BitchingElk 0.054 | 8 | 5% | 10 |
| fnc.bandit.Bandit 5.2.0 | 8 | 5% | 9 |
| stelo.PatternRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.7 | 73 / 210 | 2.38 | 18.0% | 38025 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 18.0% | 73 |
| radnor.DoctorBob 1.42 | 2.2 | 15.7% | 71 |
| vuen.Cake 2.51 | 3.2 | 13.3% | 46 |
| kawigi.nano.Lib 1.0 | 3.7 | 13.0% | 13 |
| urdos.URDOS 1.3 | 5.0 | 9.7% | 7 |
| adt.Ar1 2.1 | 7.0 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 81.3 | 7 / 35 | 5942 |
| 2 | 1 | 68.8 | 89.5 | 14 / 35 | 6547 |
| 3 | 1 | 67.6 | 82.9 | 11 / 35 | 6542 |
| 4 | 1 | 67.3 | 83.2 | 9 / 35 | 6633 |
| 5 | 1 | 67.0 | 84.1 | 14 / 35 | 5862 |
| 6 | 1 | 69.3 | 87.0 | 18 / 35 | 6499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 43 | 40% |
| kawigi.nano.Lib 1.0 | 39 | 90% |
| radnor.DoctorBob 1.42 | 37 | 27% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 5 | 60% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 77 | 56% | 91 |
| vuen.Cake 2.51 | 34 | 25% | 60 |
| kawigi.nano.Lib 1.0 | 10 | 7% | 26 |
| urdos.URDOS 1.3 | 6 | 4% | 8 |
| oa.weak.FlyMk1 0.1 | 4 | 3% | 12 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 1% | 5 |
| adt.Ar1 2.1 | 2 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 1% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 65.8 | 3 / 210 | 4.08 | 13.6% | 30113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 192 |
| apc.LeeroyJenkins2 1.0 | 2.3 | 13.9% | 7 |
| hadur117.mini.DeiseWHPF 0.2 | 2.7 | 13.6% | 3 |
| TNT.TNT 0.99.1 | 4.2 | 11.0% | 5 |
| josago.Jorgito 0.16 | 4.8 | 9.9% | 2 |
| tj.zombie1n 1.0.1 | 6.5 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.8% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.6% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 65.1 | 0 / 35 | 4844 |
| 2 | 3 | 62.3 | 66.7 | 1 / 35 | 5200 |
| 3 | 3 | 59.6 | 60.0 | 0 / 35 | 4812 |
| 4 | 3 | 60.3 | 61.6 | 0 / 35 | 4880 |
| 5 | 2 | 63.9 | 74.6 | 1 / 35 | 5079 |
| 6 | 2 | 62.3 | 66.7 | 1 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 35 | 0% |
| TNT.TNT 0.99.1 | 2 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 207 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 117 | 57% | 117 |
| apc.LeeroyJenkins2 1.0 | 38 | 18% | 39 |
| josago.Jorgito 0.16 | 26 | 13% | 26 |
| TNT.TNT 0.99.1 | 14 | 7% | 16 |
| rampancy.Durandal 2.1d | 4 | 2% | 4 |
| tj.zombie1n 1.0.1 | 4 | 2% | 4 |
| css.Delitioner 0.11 | 3 | 1% | 3 |
| spin.Bugstard 0.012b | 1 | 0% | 0 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 54.4 | 51.9 | 3 / 210 | 5.33 | 10.4% | 20473 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.6% | 131 |
| justin.DemonicRage 3.4 | 2.0 | 17.9% | 61 |
| wompi.Numbat 2.1 | 3.0 | 12.7% | 8 |
| hadur117.mini.DeiseWHPF 0.2 | 4.5 | 10.4% | 3 |
| ms.Ares 0.19 | 5.2 | 9.5% | 1 |
| axeBots.HataMoto 3.09 | 5.3 | 9.4% | 6 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 55.4 | 55.9 | 1 / 35 | 3389 |
| 2 | 6 | 52.9 | 48.3 | 1 / 35 | 3255 |
| 3 | 5 | 53.7 | 51.7 | 0 / 35 | 3130 |
| 4 | 4 | 54.1 | 49.5 | 0 / 35 | 3585 |
| 5 | 4 | 54.2 | 51.7 | 0 / 35 | 3428 |
| 6 | 4 | 56.2 | 54.3 | 1 / 35 | 3686 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 5 | 0% |
| justin.DemonicRage 3.4 | 5 | 40% |
| wompi.Numbat 2.1 | 1 | 100% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 207 of 210 rounds, at a mean tick of 472. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 35% | 73 |
| justin.DemonicRage 3.4 | 58 | 28% | 59 |
| wompi.Numbat 2.1 | 34 | 16% | 35 |
| ms.Ares 0.19 | 16 | 8% | 16 |
| axeBots.HataMoto 3.09 | 15 | 7% | 15 |
| Queens_teamrobot.UltraRazor 1.0 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 1% | 4 |
| GarmBox.Oranges 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 69.1 | 45 / 210 | 3.78 | 14.8% | 29382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 1.5 | 15.1% | 50 |
| hadur117.mini.DeiseWHPF 0.2 | 1.8 | 14.8% | 45 |
| origin.SleepSiphon 1.7b | 2.7 | 14.3% | 75 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.4% | 24 |
| mld.Wisdom 1.0 | 5.3 | 10.5% | 3 |
| gg.Wolverine 2.0 | 5.5 | 10.0% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.9% | 7 |
| spinnercat.Omen 1.0 | 7.8 | 6.7% | 2 |
| DBall.NUKE 0.1 | 8.5 | 6.2% | 0 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 67.0 | 3 / 35 | 4599 |
| 2 | 1 | 64.5 | 71.7 | 11 / 35 | 5172 |
| 3 | 1 | 63.2 | 70.2 | 7 / 35 | 5137 |
| 4 | 2 | 62.8 | 69.5 | 10 / 35 | 4872 |
| 5 | 2 | 62.3 | 67.9 | 8 / 35 | 4799 |
| 6 | 2 | 62.2 | 68.3 | 6 / 35 | 4803 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 23 | 78% |
| origin.SleepSiphon 1.7b | 19 | 0% |
| gg.Wolverine 2.0 | 12 | 83% |
| pe.minimelee.SandboxMiniMelee 1.1 | 9 | 100% |
| DBall.NUKE 0.1 | 4 | 100% |
| mld.Wisdom 1.0 | 4 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 33% |

Hadur died in 165 of 210 rounds, at a mean tick of 583. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 62 | 38% | 68 |
| jekl.StoneGhost 0.7 | 50 | 30% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 11% | 23 |
| gg.Wolverine 2.0 | 11 | 7% | 18 |
| mld.Wisdom 1.0 | 10 | 6% | 15 |
| ers.nano.hawk.HawkLA 3.0m | 9 | 5% | 13 |
| spinnercat.Omen 1.0 | 4 | 2% | 6 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |

## Melee bench: F07

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 79.7 | 39 / 210 | 2.83 | 17.0% | 36776 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.2% | 80 |
| hadur117.mini.DeiseWHPF 0.2 | 2.2 | 17.0% | 39 |
| rtk.Tachikoma 1.0 | 2.3 | 17.3% | 61 |
| franzor.Lizt 1.3.1 | 4.3 | 11.6% | 23 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 11.1% | 10 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.8% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 84.8 | 8 / 35 | 6551 |
| 2 | 3 | 68.4 | 82.5 | 7 / 35 | 6239 |
| 3 | 2 | 67.2 | 77.5 | 6 / 35 | 5879 |
| 4 | 3 | 67.2 | 79.0 | 6 / 35 | 5909 |
| 5 | 1 | 69.0 | 81.6 | 7 / 35 | 6651 |
| 6 | 3 | 65.6 | 72.7 | 5 / 35 | 5547 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 48 | 38% |
| rsalesc.melee.Monk 0.3.6c | 34 | 6% |
| oog.melee.CapuletDroid 1.1 | 16 | 81% |
| franzor.Lizt 1.3.1 | 8 | 25% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 70 | 41% | 75 |
| rtk.Tachikoma 1.0 | 68 | 40% | 93 |
| franzor.Lizt 1.3.1 | 24 | 14% | 17 |
| oog.melee.CapuletDroid 1.1 | 6 | 4% | 20 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 3 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 74.3 | 51 / 210 | 3.31 | 16.0% | 31256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 16.0% | 51 |
| tm.Yuugao 1.0 | 2.5 | 13.4% | 58 |
| shrub.Vapour v159 | 2.7 | 13.1% | 47 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 10.6% | 21 |
| Krabb.sliNk.Garm 0.9u | 4.8 | 10.2% | 15 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.7% | 9 |
| m3thos.Eva00 1.1 | 6.7 | 8.4% | 3 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 6.8% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.6% | 1 |
| SHAM.WOW 1.4 | 9.3 | 6.2% | 6 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 75.2 | 9 / 35 | 4995 |
| 2 | 1 | 63.4 | 71.4 | 5 / 35 | 5356 |
| 3 | 1 | 64.4 | 77.5 | 10 / 35 | 5048 |
| 4 | 1 | 63.5 | 71.7 | 12 / 35 | 5067 |
| 5 | 1 | 65.2 | 76.2 | 9 / 35 | 5801 |
| 6 | 1 | 63.2 | 74.0 | 6 / 35 | 4989 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 30 | 30% |
| tm.Yuugao 1.0 | 21 | 24% |
| jwst.DAD.DarkAndDarker 1.1 | 16 | 75% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 25% |
| Krabb.sliNk.Garm 0.9u | 11 | 73% |
| m3thos.Eva00 1.1 | 8 | 100% |
| SHAM.WOW 1.4 | 6 | 50% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 44 | 28% | 49 |
| shrub.Vapour v159 | 35 | 22% | 47 |
| com.spp.robocode.MostlyHarmless 010 | 31 | 19% | 42 |
| Krabb.sliNk.Garm 0.9u | 27 | 17% | 34 |
| m3thos.Eva00 1.1 | 9 | 6% | 11 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 3% | 13 |
| SHAM.WOW 1.4 | 4 | 3% | 8 |
| zyx.nano.BacillusComma 1.0 | 4 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 57.5 | 10 / 210 | 4.83 | 12.2% | 25249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.8% | 125 |
| kc.micro.Figment 1.0 | 2.2 | 14.4% | 44 |
| hadur117.mini.DeiseWHPF 0.2 | 3.3 | 12.2% | 10 |
| pedersen.Grishnakh 1.0 | 4.5 | 10.5% | 14 |
| yagami.Tidus 0.11 | 4.7 | 10.4% | 1 |
| mc2.enemy.Original 0.9 | 5.3 | 9.6% | 14 |
| dft.Calliope 5.6 | 7.0 | 8.2% | 2 |
| step.nanoPri 1.0 | 8.2 | 6.2% | 0 |
| rdm.Dueler 0.4x | 9.2 | 5.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 54.9 | 1 / 35 | 4148 |
| 2 | 3 | 58.3 | 60.3 | 1 / 35 | 4424 |
| 3 | 2 | 61.0 | 64.8 | 5 / 35 | 4554 |
| 4 | 3 | 55.4 | 53.0 | 0 / 35 | 3887 |
| 5 | 6 | 53.5 | 48.6 | 0 / 35 | 3802 |
| 6 | 3 | 59.9 | 63.2 | 3 / 35 | 4434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 20 | 20% |
| kc.micro.Figment 1.0 | 10 | 30% |
| yagami.Tidus 0.11 | 2 | 100% |
| dft.Calliope 5.6 | 2 | 50% |
| pedersen.Grishnakh 1.0 | 2 | 0% |

Hadur died in 200 of 210 rounds, at a mean tick of 563. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 76 | 38% | 78 |
| kc.micro.Figment 1.0 | 54 | 27% | 57 |
| mc2.enemy.Original 0.9 | 17 | 9% | 18 |
| pedersen.Grishnakh 1.0 | 16 | 8% | 17 |
| yagami.Tidus 0.11 | 16 | 8% | 15 |
| step.nanoPri 1.0 | 8 | 4% | 9 |
| dft.Calliope 5.6 | 6 | 3% | 8 |
| robar.nano.Assertive_Melee 0.2 | 6 | 3% | 7 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 79.5 | 63 / 210 | 2.85 | 16.8% | 34284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 16.8% | 63 |
| DTF.Kludgy 1.2b | 2.2 | 14.5% | 61 |
| ne.Chimera 1.2 | 3.0 | 13.3% | 26 |
| ejb.Polaris 1.0.1 | 4.3 | 12.6% | 33 |
| vStar.RAFzilla 2.15 | 5.2 | 11.2% | 16 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.7% | 10 |
| kurios.DOSexe .9b | 7.0 | 6.5% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.4% | 0 |
| sam.Samspin 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 75.6 | 8 / 35 | 5710 |
| 2 | 1 | 65.0 | 78.4 | 9 / 35 | 5508 |
| 3 | 1 | 68.4 | 87.0 | 11 / 35 | 6429 |
| 4 | 1 | 64.0 | 75.6 | 9 / 35 | 5296 |
| 5 | 1 | 67.5 | 83.2 | 16 / 35 | 5882 |
| 6 | 1 | 65.0 | 77.1 | 10 / 35 | 5459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 30 | 30% |
| vStar.RAFzilla 2.15 | 29 | 62% |
| ne.Chimera 1.2 | 27 | 59% |
| ejb.Polaris 1.0.1 | 25 | 36% |
| tvv.micro.Antares 1.1.1 | 13 | 77% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 48 | 33% | 57 |
| ejb.Polaris 1.0.1 | 39 | 27% | 53 |
| ne.Chimera 1.2 | 25 | 17% | 40 |
| vStar.RAFzilla 2.15 | 17 | 12% | 35 |
| tvv.micro.Antares 1.1.1 | 12 | 8% | 19 |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 2% | 3 |
| sam.Samspin 1.0 | 2 | 1% | 1 |
| kurios.DOSexe .9b | 1 | 1% | 2 |

## Melee bench: F11

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 71.5 | 38 / 210 | 3.56 | 15.4% | 30290 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.9% | 108 |
| hadur117.mini.DeiseWHPF 0.2 | 1.8 | 15.4% | 38 |
| cx.mini.Nimrod 0.55 | 3.0 | 11.9% | 17 |
| djc.DynaBot 0.1.1 | 4.2 | 10.6% | 15 |
| rdt199.Warlord 0.73 | 5.3 | 9.5% | 14 |
| br2.MobyDickBot 1.6 | 6.3 | 8.5% | 13 |
| uji.YellohFellah 1.0 | 6.7 | 8.0% | 3 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.6% | 1 |
| stelo.MirrorNano 1.3 | 9.5 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.2 | 67.0 | 4 / 35 | 4645 |
| 2 | 1 | 68.2 | 85.7 | 15 / 35 | 5642 |
| 3 | 2 | 61.4 | 66.7 | 4 / 35 | 4968 |
| 4 | 2 | 62.7 | 70.2 | 4 / 35 | 4970 |
| 5 | 2 | 61.7 | 65.4 | 5 / 35 | 4923 |
| 6 | 2 | 63.7 | 74.3 | 6 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 37 | 27% |
| djc.DynaBot 0.1.1 | 12 | 67% |
| cx.mini.Nimrod 0.55 | 10 | 80% |
| br2.MobyDickBot 1.6 | 8 | 38% |
| rdt199.Warlord 0.73 | 7 | 43% |
| uji.YellohFellah 1.0 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 3 | 67% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 95 | 55% | 110 |
| cx.mini.Nimrod 0.55 | 23 | 13% | 27 |
| djc.DynaBot 0.1.1 | 17 | 10% | 27 |
| rdt199.Warlord 0.73 | 12 | 7% | 16 |
| KiraNL.Chupacabra 0.4 | 8 | 5% | 10 |
| br2.MobyDickBot 1.6 | 6 | 3% | 6 |
| stelo.MirrorNano 1.3 | 5 | 3% | 5 |
| uji.YellohFellah 1.0 | 4 | 2% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 1% | 3 |

## Melee bench: F12

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.3 | 66.1 | 40 / 210 | 4.05 | 13.8% | 24669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 1.7 | 14.6% | 54 |
| nat.PallasHawk 1.0 | 2.3 | 13.8% | 46 |
| darkcanuck.Leon 1.01 | 2.8 | 13.8% | 45 |
| hadur117.mini.DeiseWHPF 0.2 | 3.2 | 13.8% | 40 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.6% | 17 |
| jrm.Test0 1.0 | 6.0 | 8.4% | 4 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.8% | 0 |
| stuff.Vlad 0.1 | 9.0 | 5.9% | 1 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.3 | 66.3 | 7 / 35 | 4118 |
| 2 | 4 | 59.9 | 64.8 | 8 / 35 | 3814 |
| 3 | 3 | 59.3 | 63.8 | 7 / 35 | 4046 |
| 4 | 4 | 59.3 | 63.8 | 4 / 35 | 3873 |
| 5 | 1 | 63.0 | 74.0 | 7 / 35 | 4682 |
| 6 | 3 | 60.1 | 64.1 | 7 / 35 | 4136 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 24 | 17% |
| bts.wiki.RipCurl 0.9b | 22 | 77% |
| nat.PallasHawk 1.0 | 17 | 71% |
| brainfade.melee.Genghis 0.36 | 4 | 75% |
| stuff.Vlad 0.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 174 of 210 rounds, at a mean tick of 616. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 57 | 33% | 65 |
| bts.wiki.RipCurl 0.9b | 29 | 17% | 44 |
| nat.PallasHawk 1.0 | 27 | 16% | 38 |
| brainfade.melee.Genghis 0.36 | 21 | 12% | 24 |
| jrm.Test0 1.0 | 20 | 11% | 20 |
| cs.sheldor.Talon 1.1 | 6 | 3% | 7 |
| jaybot.bots.Oddball 4.0 | 6 | 3% | 6 |
| jp.Perpy 16.0 | 4 | 2% | 4 |
| stuff.Vlad 0.1 | 2 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.8 | 60.7 | 0 / 210 | 4.54 | 11.8% | 23702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 18.4% | 126 |
| ags.Glacier 0.2.11 | 1.8 | 16.9% | 45 |
| gh.micro.Gruweltje 0.7 | 3.7 | 12.3% | 17 |
| shinh.Entangled 0.3 | 3.7 | 12.3% | 20 |
| hadur117.mini.DeiseWHPF 0.2 | 4.7 | 11.8% | 0 |
| apc.Colossus2 0.17 | 6.2 | 8.2% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 2 |
| ayk.WallHugger 1.0 | 8.3 | 5.3% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 58.1 | 61.0 | 0 / 35 | 4032 |
| 2 | 5 | 57.8 | 61.3 | 0 / 35 | 3760 |
| 3 | 5 | 55.5 | 57.1 | 0 / 35 | 3584 |
| 4 | 4 | 57.9 | 61.9 | 0 / 35 | 3874 |
| 5 | 4 | 60.3 | 65.1 | 0 / 35 | 4543 |
| 6 | 5 | 57.2 | 57.8 | 0 / 35 | 3909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 8 | 0% |
| ags.Glacier 0.2.11 | 7 | 0% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |
| shinh.Entangled 0.3 | 1 | 0% |

Hadur died in 210 of 210 rounds, at a mean tick of 513. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 77 | 37% | 77 |
| mn.Combat 3.25.0 | 61 | 29% | 61 |
| shinh.Entangled 0.3 | 33 | 16% | 33 |
| gh.micro.Gruweltje 0.7 | 18 | 9% | 19 |
| stelo.Wang 1.0 | 11 | 5% | 11 |
| apc.Colossus2 0.17 | 6 | 3% | 5 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| maribo.FollowFire 1 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 84.8 | 109 / 210 | 2.37 | 18.5% | 34733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 18.5% | 109 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.0% | 47 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.2% | 33 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.8% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 5.5 | 9.5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.3% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 6.3 | 8.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.0% | 9 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 80.0 | 14 / 35 | 5358 |
| 2 | 1 | 69.4 | 87.9 | 19 / 35 | 5987 |
| 3 | 1 | 68.2 | 81.6 | 19 / 35 | 5865 |
| 4 | 1 | 70.1 | 89.5 | 22 / 35 | 6247 |
| 5 | 1 | 67.7 | 83.8 | 16 / 35 | 5677 |
| 6 | 1 | 68.7 | 85.7 | 19 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 72 | 85% |
| catcat20.shape.Theta 0.018 | 34 | 62% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 67% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 80% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| pa.Improved 1.0 | 3 | 67% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 34 | 34% | 58 |
| simonton.micro.Sprout 1.1.3 | 30 | 30% | 84 |
| sanyi.mikrobi.Roberto 1.0 | 11 | 11% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 8% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 5% | 9 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 4% | 10 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 4% | 9 |
| sample.TrackFire 1.0 | 3 | 3% | 3 |
| pa.Improved 1.0 | 2 | 2% | 1 |

## Melee bench: F15

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 79.8 | 91 / 210 | 2.81 | 18.3% | 36826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 18.3% | 91 |
| emp.Yngwie 1.11 | 2.5 | 13.7% | 58 |
| kawigi.micro.Shiz 1.1 | 2.7 | 13.3% | 20 |
| mld.DustBunny 3.8 | 3.8 | 11.9% | 7 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.8% | 11 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.7% | 20 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.4% | 0 |
| lambdaxy.TBot 0.1 | 8.0 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 8.3 | 5.5% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 83.5 | 18 / 35 | 6430 |
| 2 | 1 | 64.1 | 65.7 | 11 / 35 | 5808 |
| 3 | 1 | 68.5 | 82.9 | 18 / 35 | 5856 |
| 4 | 1 | 68.8 | 81.9 | 14 / 35 | 6454 |
| 5 | 1 | 67.4 | 78.7 | 14 / 35 | 6044 |
| 6 | 1 | 69.4 | 86.3 | 16 / 35 | 6234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 41 | 44% |
| kawigi.micro.Shiz 1.1 | 31 | 100% |
| cb.nano.Insomnia 1.0 | 16 | 63% |
| kawigi.robot.Girl 1.2 | 16 | 75% |
| mld.DustBunny 3.8 | 13 | 100% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 50 | 42% | 89 |
| cb.nano.Insomnia 1.0 | 16 | 13% | 15 |
| mld.DustBunny 3.8 | 13 | 11% | 32 |
| kawigi.micro.Shiz 1.1 | 10 | 8% | 26 |
| divineomega.TrialBot 0.003 | 10 | 8% | 18 |
| kawigi.robot.Girl 1.2 | 10 | 8% | 18 |
| Grystrion.TrackerWO 1.0 | 5 | 4% | 7 |
| lambdaxy.TBot 0.1 | 5 | 4% | 5 |

## Melee bench: F16

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 71.7 | 37 / 210 | 3.54 | 15.9% | 33968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.2 | 17.4% | 91 |
| hadur117.mini.DeiseWHPF 0.2 | 1.8 | 15.9% | 37 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 12.3% | 59 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.4% | 2 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.3% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 2 |
| asd.Cthulhu 1.3 | 8.5 | 5.1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 4.9% | 2 |
| repositorio.NanoStep 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 76.8 | 7 / 35 | 6199 |
| 2 | 1 | 65.3 | 74.6 | 8 / 35 | 5566 |
| 3 | 2 | 64.3 | 67.9 | 6 / 35 | 5812 |
| 4 | 2 | 65.6 | 74.9 | 3 / 35 | 5934 |
| 5 | 2 | 62.8 | 67.3 | 7 / 35 | 5076 |
| 6 | 2 | 63.7 | 68.9 | 6 / 35 | 5381 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 45 | 22% |
| techdude.forest.FlamingForest 1.1 | 20 | 20% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 67% |
| bvh.fnr.Fenrir 0.36l | 3 | 67% |
| divineomega.DivineBot 1.9.4.5 | 2 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 79 | 46% | 95 |
| techdude.forest.FlamingForest 1.1 | 46 | 27% | 50 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 8% | 17 |
| bvh.fnr.Fenrir 0.36l | 11 | 6% | 14 |
| divineomega.DivineBot 1.9.4.5 | 9 | 5% | 10 |
| asd.Cthulhu 1.3 | 7 | 4% | 8 |
| tvv.nano.Polaris 1.2 | 5 | 3% | 9 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 7 |

## Melee bench: F17

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.9 | 61.0 | 25 / 210 | 4.51 | 13.4% | 30259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| et.Predator 1.8 | 2.2 | 13.9% | 34 |
| hadur117.mini.DeiseWHPF 0.2 | 2.5 | 13.4% | 25 |
| cx.BlestPain 1.41 | 2.7 | 13.8% | 66 |
| oog.melee.Mercutio 1.0 | 3.0 | 13.2% | 45 |
| ahf.NanoAndrew .4 | 4.8 | 11.6% | 28 |
| nic.Nicator 2.4 | 6.2 | 9.9% | 8 |
| maribo.melee.BMV 0.1 | 6.7 | 9.1% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 6.1% | 1 |
| tex.Longbot 0.4 | 8.5 | 6.1% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 63.2 | 6 / 35 | 5223 |
| 2 | 3 | 56.5 | 53.7 | 1 / 35 | 4897 |
| 3 | 1 | 61.8 | 66.7 | 5 / 35 | 5302 |
| 4 | 4 | 56.7 | 54.3 | 4 / 35 | 4280 |
| 5 | 4 | 59.5 | 57.8 | 4 / 35 | 4978 |
| 6 | 1 | 63.3 | 70.5 | 5 / 35 | 5579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 22 | 59% |
| cx.BlestPain 1.41 | 14 | 14% |
| ahf.NanoAndrew .4 | 12 | 0% |
| nic.Nicator 2.4 | 6 | 83% |
| oog.melee.Mercutio 1.0 | 4 | 75% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 50% |
| maribo.melee.BMV 0.1 | 2 | 0% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 46 | 25% | 50 |
| ahf.NanoAndrew .4 | 36 | 19% | 36 |
| oog.melee.Mercutio 1.0 | 29 | 16% | 33 |
| et.Predator 1.8 | 28 | 15% | 40 |
| maribo.melee.BMV 0.1 | 22 | 12% | 22 |
| nic.Nicator 2.4 | 14 | 8% | 16 |
| tex.Longbot 0.4 | 6 | 3% | 7 |
| goblin.Bender 2.4 | 3 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 68.6 | 35 / 210 | 3.82 | 14.9% | 30995 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.5 | 14.9% | 35 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.4% | 42 |
| uji.DBH 1.1 | 2.8 | 13.5% | 54 |
| agd.Mooserwirt2 2.7 | 3.3 | 12.5% | 42 |
| ratosh.Nobo 0.21 | 5.5 | 10.0% | 9 |
| spinnercat.Robovirus 2.718 | 6.2 | 9.2% | 8 |
| sigterm.Sigterm 1.0 | 6.5 | 8.8% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.2% | 5 |
| stelo.WangRobot 1.0 | 9.2 | 5.3% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 71.4 | 7 / 35 | 5277 |
| 2 | 3 | 59.7 | 62.2 | 4 / 35 | 4863 |
| 3 | 1 | 62.6 | 69.2 | 9 / 35 | 4966 |
| 4 | 1 | 62.3 | 68.9 | 4 / 35 | 5288 |
| 5 | 1 | 63.8 | 73.3 | 5 / 35 | 5661 |
| 6 | 2 | 61.8 | 66.7 | 6 / 35 | 4940 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 25 | 52% |
| uji.DBH 1.1 | 21 | 10% |
| agd.Mooserwirt2 2.7 | 14 | 21% |
| spinnercat.Robovirus 2.718 | 8 | 63% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| ratosh.Nobo 0.21 | 3 | 100% |
| sigterm.Sigterm 1.0 | 3 | 67% |
| stelo.WangRobot 1.0 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.DBH 1.1 | 54 | 31% | 58 |
| morbid.MorbidPriest 1.0 | 39 | 22% | 52 |
| agd.Mooserwirt2 2.7 | 37 | 21% | 42 |
| spinnercat.Robovirus 2.718 | 12 | 7% | 15 |
| ratosh.Nobo 0.21 | 11 | 6% | 16 |
| sigterm.Sigterm 1.0 | 8 | 5% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 3% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 6 | 3% | 6 |
| stelo.WangRobot 1.0 | 2 | 1% | 3 |

## Melee bench: F19

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 94.6 | 165 / 210 | 1.49 | 21.7% | 38724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 21.7% | 165 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 14.4% | 15 |
| mld.Infinity 2.2 | 3.2 | 12.3% | 16 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.3% | 1 |
| erdnis.Rover 0.3 | 5.0 | 10.2% | 5 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.6% | 6 |
| mbh.Mbh 0.1 | 7.7 | 7.1% | 0 |
| pac.ABC 2.1 | 8.0 | 7.2% | 2 |
| pbg.R2D2 1.0 | 8.3 | 6.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 93.7 | 27 / 35 | 6175 |
| 2 | 1 | 72.8 | 95.6 | 28 / 35 | 6781 |
| 3 | 1 | 71.2 | 89.5 | 25 / 35 | 6042 |
| 4 | 1 | 73.4 | 96.5 | 31 / 35 | 6695 |
| 5 | 1 | 72.9 | 96.5 | 28 / 35 | 6292 |
| 6 | 1 | 72.9 | 95.6 | 26 / 35 | 6739 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 93% |
| mld.Infinity 2.2 | 28 | 71% |
| krillr.mini.JointStrike 2.0.0 | 22 | 100% |
| erdnis.Rover 0.3 | 14 | 86% |
| patson.PatsonTestBot 1.0 | 11 | 55% |
| pbg.R2D2 1.0 | 8 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 35% | 64 |
| mld.Infinity 2.2 | 13 | 28% | 49 |
| patson.PatsonTestBot 1.0 | 9 | 20% | 28 |
| erdnis.Rover 0.3 | 5 | 11% | 21 |
| krillr.mini.JointStrike 2.0.0 | 2 | 4% | 13 |
| pbg.R2D2 1.0 | 1 | 2% | 5 |
| pac.ABC 2.1 | 0 | 0% | 19 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |

## Melee bench: F20

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 78.9 | 73 / 210 | 2.90 | 17.9% | 37631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 17.9% | 73 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 72 |
| fwb.Nine 1.0.1 | 3.7 | 11.2% | 17 |
| catcat20.Rabbit 0.001 | 4.2 | 11.0% | 32 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.5% | 6 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.4% | 4 |
| djdjdj.NanoSkunk10 1.0 | 6.8 | 7.6% | 3 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.3% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.9% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 83.2 | 13 / 35 | 6220 |
| 2 | 1 | 69.1 | 81.9 | 18 / 35 | 6637 |
| 3 | 1 | 66.6 | 76.5 | 10 / 35 | 6186 |
| 4 | 1 | 65.7 | 75.9 | 9 / 35 | 6102 |
| 5 | 1 | 66.8 | 77.1 | 12 / 35 | 6113 |
| 6 | 1 | 67.1 | 79.0 | 11 / 35 | 6373 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 56 | 48% |
| catcat20.Rabbit 0.001 | 27 | 59% |
| fwb.Nine 1.0.1 | 15 | 60% |
| nz.jdc.nano.GridFu 1.0 | 7 | 86% |
| m3thos.mini.Eva01 0.5.5 | 5 | 80% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 4 | 75% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 52% | 92 |
| catcat20.Rabbit 0.001 | 23 | 17% | 46 |
| nz.jdc.nano.GridFu 1.0 | 13 | 9% | 23 |
| fwb.Nine 1.0.1 | 10 | 7% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6 | 4% | 12 |
| djdjdj.NanoSkunk10 1.0 | 6 | 4% | 10 |
| bayen.nut.Squirrel 1.615 | 4 | 3% | 10 |
| ntc.ControlledChaos 1.1.4 | 4 | 3% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 86.9 | 90 / 210 | 2.18 | 19.5% | 38387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 19.5% | 90 |
| eem.EvBot v4.6.16 | 2.0 | 17.1% | 91 |
| dummy.mini.Scimitar 1.01 | 3.0 | 12.8% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 9 |
| eld.Hmm 1.0 | 5.3 | 9.2% | 11 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.9% | 2 |
| fire219.CatBot 1.0 | 7.3 | 6.6% | 0 |
| el.JumpShoot 0.2 | 7.8 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.3 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 87.6 | 16 / 35 | 6366 |
| 2 | 1 | 68.3 | 81.6 | 11 / 35 | 6223 |
| 3 | 1 | 71.1 | 88.9 | 19 / 35 | 6673 |
| 4 | 1 | 70.6 | 89.5 | 14 / 35 | 6539 |
| 5 | 1 | 69.7 | 86.7 | 15 / 35 | 6211 |
| 6 | 1 | 69.7 | 87.0 | 15 / 35 | 6375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 92 | 42% |
| dummy.mini.Scimitar 1.01 | 23 | 87% |
| cf.RiO.RiOx 4.2.1 | 20 | 90% |
| eld.Hmm 1.0 | 12 | 92% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 1093. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 82 | 67% | 113 |
| dummy.mini.Scimitar 1.01 | 17 | 14% | 32 |
| cf.RiO.RiOx 4.2.1 | 11 | 9% | 23 |
| eld.Hmm 1.0 | 8 | 7% | 31 |
| oa.weak.BotherBot 0.1 | 4 | 3% | 10 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 70.1 | 23 / 210 | 3.70 | 14.9% | 32301 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxDT 2.71m | 1.0 | 17.7% | 98 |
| hadur117.mini.DeiseWHPF 0.2 | 2.3 | 14.9% | 23 |
| kvk.HebusLeTroll 0.35 | 2.7 | 14.8% | 41 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.2% | 26 |
| bigpete.Stewie 1.0 | 4.8 | 11.6% | 18 |
| yk.JahRoslav 1.1 | 6.2 | 7.3% | 2 |
| tad.Dalek98 0.98 | 7.3 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.7% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.7 | 72.1 | 5 / 35 | 5102 |
| 2 | 2 | 63.3 | 68.9 | 3 / 35 | 5338 |
| 3 | 2 | 62.9 | 68.9 | 5 / 35 | 5245 |
| 4 | 2 | 63.2 | 69.2 | 4 / 35 | 5784 |
| 5 | 3 | 63.7 | 70.2 | 4 / 35 | 5524 |
| 6 | 2 | 63.2 | 71.1 | 2 / 35 | 5308 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 21 | 0% |
| kvk.HebusLeTroll 0.35 | 21 | 62% |
| jlm.javaDisturbance 0.59 | 15 | 13% |
| bigpete.Stewie 1.0 | 9 | 78% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 699. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 87 | 47% | 88 |
| kvk.HebusLeTroll 0.35 | 43 | 23% | 51 |
| jlm.javaDisturbance 0.59 | 34 | 18% | 38 |
| bigpete.Stewie 1.0 | 18 | 10% | 28 |
| yk.JahRoslav 1.1 | 3 | 2% | 3 |
| gg.Squaraus 0.6 | 2 | 1% | 2 |

## Melee bench: F23

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 79.2 | 58 / 210 | 2.87 | 17.0% | 32884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| pe.SandboxLump 1.52 | 1.2 | 18.4% | 100 |
| hadur117.mini.DeiseWHPF 0.2 | 1.8 | 17.0% | 58 |
| cre.Karolos 0.32 | 3.0 | 13.6% | 37 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.1% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.3 | 9.6% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.2 | 8.7% | 0 |
| cw.megas.Blade 0.8 | 7.0 | 8.3% | 0 |
| sample.Walls 1.0 | 7.3 | 8.0% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 82.9 | 11 / 35 | 5703 |
| 2 | 2 | 66.5 | 78.1 | 9 / 35 | 5393 |
| 3 | 2 | 67.6 | 81.9 | 11 / 35 | 5532 |
| 4 | 2 | 66.2 | 76.2 | 11 / 35 | 5182 |
| 5 | 2 | 65.6 | 75.2 | 6 / 35 | 5475 |
| 6 | 2 | 67.6 | 81.0 | 10 / 35 | 5599 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 61 | 30% |
| cre.Karolos 0.32 | 25 | 28% |
| stelo.AreaTargetingBot 1.1 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 13 | 54% |
| sample.Walls 1.0 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 84 | 55% | 102 |
| cre.Karolos 0.32 | 43 | 28% | 54 |
| stelo.RamTrackSurfer 1.2 | 12 | 8% | 23 |
| stelo.AreaTargetingBot 1.1 | 8 | 5% | 17 |
| cw.megas.Blade 0.8 | 3 | 2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 2% | 4 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.2 | 56.8 | 16 / 210 | 4.89 | 11.8% | 23288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 1.8 | 14.6% | 58 |
| rz.GlowBlowMelee 1.4 | 1.8 | 13.8% | 42 |
| davidalves.Phoenix 0.54 | 2.8 | 13.2% | 54 |
| hadur117.mini.DeiseWHPF 0.2 | 4.2 | 11.8% | 16 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.4% | 18 |
| oog.melee.Corsair 1.0 | 6.0 | 10.2% | 11 |
| stelo.SoJNanoMelee 1.1 | 7.3 | 8.1% | 10 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.7% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.7% | 2 |
| evd.X1 0.01 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.6 | 54.0 | 2 / 35 | 3728 |
| 2 | 5 | 53.8 | 52.7 | 1 / 35 | 3506 |
| 3 | 4 | 58.2 | 61.0 | 4 / 35 | 4169 |
| 4 | 3 | 56.8 | 56.8 | 5 / 35 | 4106 |
| 5 | 4 | 56.6 | 56.5 | 3 / 35 | 3870 |
| 6 | 4 | 57.1 | 60.0 | 1 / 35 | 3909 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 9 | 11% |
| davidalves.Phoenix 0.54 | 9 | 22% |
| rz.GlowBlowMelee 1.4 | 8 | 63% |
| pedersen.Ugluk 1.1.1 | 7 | 29% |
| stelo.SoJNanoMelee 1.1 | 5 | 100% |
| oog.melee.Corsair 1.0 | 2 | 0% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 528. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 52 | 27% | 55 |
| rz.GlowBlowMelee 1.4 | 38 | 19% | 44 |
| davidalves.Phoenix 0.54 | 37 | 19% | 40 |
| oog.melee.Corsair 1.0 | 28 | 14% | 29 |
| pedersen.Ugluk 1.1.1 | 15 | 8% | 17 |
| stelo.SoJNanoMelee 1.1 | 9 | 5% | 10 |
| as.FrankTheTank 1.3 | 6 | 3% | 6 |
| evd.X1 0.01 | 6 | 3% | 6 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.3 | 108 / 210 | 2.69 | 18.0% | 29641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 18.0% | 108 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.2% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.4% | 19 |
| jdw.Hurricane 1.4 | 4.0 | 11.0% | 18 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 10.3% | 23 |
| ds.Oo 2.2 | 5.8 | 9.1% | 10 |
| awesomeness.Elite 1.0 | 6.8 | 7.5% | 4 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 3 |
| gjr.Cephalosporin 0.1 | 8.7 | 6.8% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 78.7 | 20 / 35 | 5067 |
| 2 | 1 | 65.7 | 77.1 | 14 / 35 | 4701 |
| 3 | 1 | 68.4 | 86.0 | 19 / 35 | 5221 |
| 4 | 1 | 66.6 | 80.3 | 17 / 35 | 4783 |
| 5 | 1 | 68.0 | 82.9 | 20 / 35 | 5046 |
| 6 | 1 | 67.2 | 82.5 | 18 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 48 | 94% |
| voidious.micro.BlitzBat 1.05 | 32 | 94% |
| gre.svman4.Morfeas 1.4.1 | 21 | 43% |
| jdw.Hurricane 1.4 | 13 | 85% |
| ds.Oo 2.2 | 11 | 45% |
| adt.Ar2 1.1 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 3 | 67% |
| awesomeness.Elite 1.0 | 1 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 611. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gre.svman4.Morfeas 1.4.1 | 21 | 20% | 25 |
| voidious.micro.BlitzBat 1.05 | 19 | 18% | 44 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 16% | 57 |
| jdw.Hurricane 1.4 | 14 | 14% | 28 |
| awesomeness.Elite 1.0 | 12 | 12% | 18 |
| ds.Oo 2.2 | 10 | 10% | 19 |
| gjr.Cephalosporin 0.1 | 7 | 7% | 9 |
| adt.Ar2 1.1 | 3 | 3% | 7 |
| amk.ChumbaMini 0.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F26

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 74.2 | 37 / 210 | 3.32 | 16.3% | 36837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.5 | 16.3% | 37 |
| ak.Fermat 2.0 | 1.5 | 16.4% | 87 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 24 |
| shu.nitro.LENIN .T34 | 3.8 | 12.1% | 35 |
| js.PinBall 1.6 | 5.0 | 11.0% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.4% | 9 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.7% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.4% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 75.2 | 10 / 35 | 6518 |
| 2 | 2 | 65.1 | 74.0 | 6 / 35 | 6123 |
| 3 | 2 | 64.0 | 70.8 | 6 / 35 | 5563 |
| 4 | 2 | 65.3 | 74.0 | 3 / 35 | 6050 |
| 5 | 1 | 65.2 | 74.0 | 3 / 35 | 6231 |
| 6 | 1 | 67.1 | 77.1 | 9 / 35 | 6352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 43 | 16% |
| shu.nitro.LENIN .T34 | 19 | 47% |
| lrem.Spectre 0.4.4 | 19 | 79% |
| js.PinBall 1.6 | 7 | 43% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 40% |
| gh.mini.GrubbmOne 1.0 | 1 | 100% |

Hadur died in 173 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 86 | 50% | 96 |
| shu.nitro.LENIN .T34 | 22 | 13% | 31 |
| js.PinBall 1.6 | 18 | 10% | 22 |
| jaybot.adv.bots.JayBot 2.0 | 16 | 9% | 19 |
| lrem.Spectre 0.4.4 | 13 | 8% | 21 |
| gh.mini.GrubbmOne 1.0 | 12 | 7% | 14 |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 3% | 6 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 78.5 | 76 / 210 | 2.93 | 17.1% | 31501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 17.1% | 76 |
| mk.Alpha 0.2.1 | 2.0 | 15.5% | 87 |
| wee.Gem 1.8.4 | 3.8 | 11.3% | 26 |
| EH.Eagle 1.0.6 | 3.8 | 11.0% | 3 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.1% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.6% | 2 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.6% | 2 |
| joe.ADinosaur 1.0 | 7.3 | 7.6% | 1 |
| caimano.Furia_Ceca 0.22 | 8.8 | 5.7% | 1 |
| cs.Grudge 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 82.2 | 14 / 35 | 4948 |
| 2 | 1 | 63.1 | 72.1 | 10 / 35 | 4585 |
| 3 | 1 | 66.3 | 72.4 | 9 / 35 | 6220 |
| 4 | 1 | 68.3 | 84.4 | 21 / 35 | 5327 |
| 5 | 1 | 64.3 | 74.0 | 11 / 35 | 4869 |
| 6 | 1 | 67.8 | 86.0 | 11 / 35 | 5552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 53 | 25% |
| EH.Eagle 1.0.6 | 26 | 96% |
| wee.Gem 1.8.4 | 20 | 70% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 75% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 72 | 53% | 88 |
| wee.Gem 1.8.4 | 16 | 12% | 29 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 11% | 24 |
| EH.Eagle 1.0.6 | 8 | 6% | 27 |
| throxbot.ThroxBot 0.1 | 7 | 5% | 15 |
| joe.ADinosaur 1.0 | 7 | 5% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 4% | 13 |
| caimano.Furia_Ceca 0.22 | 3 | 2% | 4 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 79.5 | 76 / 210 | 2.84 | 16.9% | 29155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 16.9% | 76 |
| kid.test.NightFox .2 | 2.3 | 14.0% | 33 |
| uji.Antique 1.0 | 3.2 | 13.2% | 57 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 11.4% | 27 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 11.1% | 8 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.0% | 3 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.6% | 5 |
| stelo.PianistNano 1.2 | 8.0 | 6.2% | 0 |
| matt.advanced.Katana 1.0 | 9.0 | 6.2% | 1 |
| stelo.Lifestealer 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 79.7 | 14 / 35 | 4921 |
| 2 | 1 | 66.0 | 79.7 | 12 / 35 | 5047 |
| 3 | 1 | 65.2 | 77.8 | 14 / 35 | 4855 |
| 4 | 1 | 66.3 | 82.9 | 15 / 35 | 4795 |
| 5 | 1 | 63.1 | 74.0 | 8 / 35 | 4722 |
| 6 | 1 | 66.4 | 83.2 | 13 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 49 | 86% |
| uji.Antique 1.0 | 35 | 31% |
| qohnil.blot.BlotBot 3.61 | 19 | 42% |
| pfvicm.Sobieski 7.2.3b | 8 | 75% |
| amk.ChumbaWumba 0.3 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 4 | 50% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 135 of 210 rounds, at a mean tick of 628. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| uji.Antique 1.0 | 53 | 39% | 76 |
| qohnil.blot.BlotBot 3.61 | 25 | 19% | 36 |
| kid.test.NightFox .2 | 19 | 14% | 35 |
| pfvicm.Sobieski 7.2.3b | 19 | 14% | 29 |
| amk.ChumbaWumba 0.3 | 8 | 6% | 12 |
| ahr.ice.Ice 1.0.2 | 7 | 5% | 10 |
| stelo.Lifestealer 1.0 | 2 | 1% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F29

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 70.1 | 31 / 210 | 3.69 | 15.5% | 31425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 1.7 | 16.7% | 94 |
| deewiant.Anomaly 0.2 | 2.0 | 16.0% | 61 |
| hadur117.mini.DeiseWHPF 0.2 | 2.3 | 15.5% | 31 |
| myl.micro.Troodon 1.10 | 4.3 | 11.2% | 10 |
| jok.PheonixM 0.1.2 | 5.0 | 9.9% | 7 |
| ph.melee.ArcherME 0.3 | 5.7 | 8.7% | 3 |
| DBall.Anarchy 0.1 | 7.5 | 6.4% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.3% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.1% | 0 |
| jangs.ns51 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 74.9 | 8 / 35 | 5456 |
| 2 | 2 | 65.1 | 73.3 | 6 / 35 | 5372 |
| 3 | 3 | 63.7 | 68.9 | 5 / 35 | 4965 |
| 4 | 2 | 62.3 | 65.7 | 4 / 35 | 5087 |
| 5 | 3 | 63.7 | 66.0 | 7 / 35 | 5302 |
| 6 | 3 | 63.8 | 71.7 | 1 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 39 | 23% |
| zyx.mega.YersiniaPestis 3.1 | 31 | 16% |
| myl.micro.Troodon 1.10 | 12 | 83% |
| ph.melee.ArcherME 0.3 | 4 | 50% |
| ap.Frederick 1.1 | 2 | 100% |
| jok.PheonixM 0.1.2 | 2 | 100% |
| DBall.Anarchy 0.1 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 74 | 41% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 64 | 36% | 71 |
| myl.micro.Troodon 1.10 | 13 | 7% | 15 |
| jok.PheonixM 0.1.2 | 12 | 7% | 16 |
| ph.melee.ArcherME 0.3 | 5 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 3% | 5 |
| jangs.ns51 1.0 | 3 | 2% | 3 |
| DBall.Anarchy 0.1 | 3 | 2% | 3 |

## Melee bench: F30

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 52.8 | 47.9 | 4 / 210 | 5.69 | 10.3% | 23112 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 2.3 | 14.1% | 59 |
| stelo.PastFuture 2.3.2 | 2.3 | 13.9% | 35 |
| catcat20.Matcha 0.006 | 2.5 | 13.5% | 47 |
| oog.melee.Capulet 1.2 | 2.8 | 13.4% | 42 |
| hadur117.mini.DeiseWHPF 0.2 | 5.2 | 10.3% | 4 |
| intruder.PrairieWolf 2.61 | 6.5 | 9.0% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 8.0% | 6 |
| ntc.Opposite 1.5 | 7.7 | 7.4% | 0 |
| tripphippy.Alice 1.1 | 8.2 | 7.4% | 7 |
| GarmBox.Anger 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 54.0 | 49.8 | 1 / 35 | 3966 |
| 2 | 6 | 51.8 | 47.9 | 0 / 35 | 3637 |
| 3 | 5 | 50.5 | 41.6 | 1 / 35 | 3642 |
| 4 | 5 | 52.9 | 46.3 | 0 / 35 | 3954 |
| 5 | 5 | 52.5 | 48.6 | 1 / 35 | 3734 |
| 6 | 5 | 55.4 | 53.3 | 1 / 35 | 4179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.PastFuture 2.3.2 | 4 | 50% |
| darkcanuck.B26354 1.06 | 3 | 33% |
| oog.melee.Capulet 1.2 | 3 | 33% |
| catcat20.Matcha 0.006 | 2 | 0% |

Hadur died in 206 of 210 rounds, at a mean tick of 491. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 45 | 22% | 46 |
| stelo.PastFuture 2.3.2 | 44 | 21% | 46 |
| oog.melee.Capulet 1.2 | 31 | 15% | 32 |
| catcat20.Matcha 0.006 | 24 | 12% | 24 |
| intruder.PrairieWolf 2.61 | 17 | 8% | 17 |
| fowl3628800.LightningBolt 2.6.0 | 17 | 8% | 17 |
| ntc.Opposite 1.5 | 15 | 7% | 15 |
| tripphippy.Alice 1.1 | 13 | 6% | 13 |

## Melee bench: F31

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 55.4 | 54.9 | 8 / 210 | 5.06 | 11.3% | 21993 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.4% | 121 |
| gh.mini.Griezel 0.2 | 2.0 | 14.1% | 46 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.1% | 10 |
| hadur117.mini.DeiseWHPF 0.2 | 4.3 | 11.3% | 8 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 17 |
| gh.nano.Grofvuil 0.2 | 5.2 | 9.9% | 4 |
| fm.mammillarias 1.3 | 7.5 | 6.7% | 1 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.9% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.5% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.2 | 60.6 | 1 / 35 | 4243 |
| 2 | 4 | 58.5 | 62.2 | 3 / 35 | 3925 |
| 3 | 6 | 51.4 | 46.7 | 0 / 35 | 3084 |
| 4 | 4 | 56.4 | 55.9 | 2 / 35 | 3814 |
| 5 | 5 | 54.3 | 52.7 | 1 / 35 | 3560 |
| 6 | 4 | 53.5 | 51.1 | 1 / 35 | 3367 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 15 | 7% |
| gh.mini.Griezel 0.2 | 12 | 17% |
| spinnercat.micro.Tyger 0.1 | 4 | 50% |
| fm.mammillarias 1.3 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| d414.nano.Quantum 1.0.0 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 562. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 69 | 34% | 72 |
| gh.mini.Griezel 0.2 | 51 | 25% | 53 |
| spinnercat.micro.Tyger 0.1 | 30 | 15% | 30 |
| gh.nano.Grofvuil 0.2 | 17 | 8% | 17 |
| d414.nano.Quantum 1.0.0 | 16 | 8% | 18 |
| timmit.nano.TimDog 0.33 | 8 | 4% | 8 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 2% | 6 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 75.6 | 59 / 210 | 3.20 | 15.9% | 29632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.3 | 15.9% | 59 |
| kawigi.sbf.FloodHT 0.9.2 | 1.7 | 15.1% | 74 |
| apc.botM 3.0 | 3.7 | 11.8% | 39 |
| vjik.UnViolation 1.1 | 4.5 | 10.6% | 16 |
| lxx.ConceptA 0.8 | 4.5 | 10.5% | 8 |
| bayen.UbaMicro 1.4 | 5.5 | 9.2% | 6 |
| panzer.Panzer 0.2 | 7.2 | 7.8% | 0 |
| conscience.Electron 1.3g | 8.2 | 7.1% | 1 |
| yk.JahMicro 1.0 | 8.5 | 6.9% | 7 |
| donjezza.Jezza 1.0 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 79.0 | 12 / 35 | 4963 |
| 2 | 1 | 65.5 | 79.0 | 13 / 35 | 5253 |
| 3 | 2 | 63.3 | 73.7 | 9 / 35 | 4859 |
| 4 | 1 | 64.6 | 79.4 | 11 / 35 | 4949 |
| 5 | 1 | 61.6 | 71.4 | 6 / 35 | 4620 |
| 6 | 2 | 62.8 | 71.1 | 8 / 35 | 4988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 53 | 32% |
| lxx.ConceptA 0.8 | 17 | 82% |
| vjik.UnViolation 1.1 | 15 | 73% |
| apc.botM 3.0 | 13 | 0% |
| yk.JahMicro 1.0 | 6 | 67% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 635. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 58 | 38% | 75 |
| apc.botM 3.0 | 33 | 21% | 37 |
| lxx.ConceptA 0.8 | 20 | 13% | 27 |
| vjik.UnViolation 1.1 | 12 | 8% | 25 |
| bayen.UbaMicro 1.4 | 12 | 8% | 17 |
| conscience.Electron 1.3g | 8 | 5% | 11 |
| yk.JahMicro 1.0 | 6 | 4% | 9 |
| panzer.Panzer 0.2 | 5 | 3% | 7 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 66.6 | 36 / 210 | 4.01 | 14.6% | 29616 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| maribo.Quester 0.3 | 1.0 | 17.2% | 77 |
| hadur117.mini.DeiseWHPF 0.2 | 2.2 | 14.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.7% | 27 |
| labg.Cataclysm 2.05 | 3.8 | 11.9% | 38 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 11.1% | 19 |
| baal.nano.N 1.42 | 6.3 | 9.3% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.9% | 7 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.0 | 4.8% | 2 |
| zyx.micro.Ant 1.1 | 9.0 | 5.0% | 0 |
| sanja.First 0.1 | 9.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 70.2 | 6 / 35 | 5189 |
| 2 | 3 | 60.6 | 60.3 | 8 / 35 | 4505 |
| 3 | 2 | 64.1 | 72.4 | 5 / 35 | 5016 |
| 4 | 2 | 61.2 | 64.1 | 4 / 35 | 4822 |
| 5 | 2 | 61.3 | 63.8 | 4 / 35 | 4824 |
| 6 | 2 | 63.4 | 68.6 | 9 / 35 | 5260 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 26 | 46% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 19 | 58% |
| gre.svman4.Leonidas 1.3.2 | 13 | 38% |
| labg.Cataclysm 2.05 | 11 | 27% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 67% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |
| sanja.First 0.1 | 1 | 100% |
| baal.nano.N 1.42 | 1 | 100% |

Hadur died in 174 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 66 | 38% | 79 |
| gre.svman4.Leonidas 1.3.2 | 28 | 16% | 30 |
| labg.Cataclysm 2.05 | 27 | 16% | 32 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 13% | 34 |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 7% | 14 |
| baal.nano.N 1.42 | 12 | 7% | 12 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 2% | 4 |
| zyx.micro.Ant 1.1 | 2 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 66.3 | 11 / 210 | 4.03 | 13.7% | 28817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.2 | 17.9% | 102 |
| kid.Gladiator .7.2 | 1.8 | 16.3% | 62 |
| hadur117.mini.DeiseWHPF 0.2 | 3.0 | 13.7% | 11 |
| tcf.Reach 3 | 4.2 | 11.9% | 18 |
| jcs.Seth 1.8 | 5.2 | 10.9% | 11 |
| cli.Dancer 1.1 | 5.7 | 10.0% | 5 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.RamFire 1.0 | 9.5 | 3.3% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 61.6 | 2 / 35 | 4248 |
| 2 | 3 | 62.3 | 69.8 | 3 / 35 | 4692 |
| 3 | 3 | 61.0 | 64.4 | 1 / 35 | 4867 |
| 4 | 3 | 61.9 | 66.0 | 1 / 35 | 4611 |
| 5 | 3 | 62.0 | 66.3 | 3 / 35 | 5276 |
| 6 | 3 | 63.1 | 69.8 | 1 / 35 | 5123 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.Gladiator .7.2 | 21 | 24% |
| stelo.Spread 0.9 | 19 | 11% |
| cli.Dancer 1.1 | 4 | 50% |
| jcs.Seth 1.8 | 2 | 100% |
| tcf.Reach 3 | 2 | 0% |

Hadur died in 199 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 59 | 30% | 61 |
| kid.Gladiator .7.2 | 57 | 29% | 60 |
| tcf.Reach 3 | 33 | 17% | 34 |
| cli.Dancer 1.1 | 22 | 11% | 24 |
| jcs.Seth 1.8 | 20 | 10% | 23 |
| amk.Punbot.Punbot 0.01 | 4 | 2% | 4 |
| ratosh.Wesco 1.4 | 3 | 2% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.6 | 65.2 | 6 / 210 | 4.13 | 13.0% | 24013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 168 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.2% | 19 |
| hadur117.mini.DeiseWHPF 0.2 | 2.8 | 13.0% | 6 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.5 | 12.2% | 10 |
| rz.HawkOnFire 0.1 | 4.8 | 11.5% | 7 |
| wit.Chuliath 1.0 | 6.5 | 7.4% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.7% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.6 | 66.0 | 1 / 35 | 4077 |
| 2 | 3 | 60.5 | 66.0 | 1 / 35 | 4418 |
| 3 | 3 | 59.1 | 65.4 | 0 / 35 | 3774 |
| 4 | 3 | 57.8 | 61.3 | 0 / 35 | 3816 |
| 5 | 2 | 61.0 | 68.9 | 1 / 35 | 4043 |
| 6 | 3 | 59.3 | 63.8 | 3 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 28 | 4% |
| gh.mini.Gruwel 0.9 | 9 | 11% |
| rz.HawkOnFire 0.1 | 4 | 50% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 1 | 0% |

Hadur died in 204 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 46% | 94 |
| gh.mini.Gruwel 0.9 | 36 | 18% | 38 |
| dmh.robocode.robot.BlackDeath 9.2 | 31 | 15% | 32 |
| rz.HawkOnFire 0.1 | 21 | 10% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 10 | 5% | 10 |
| myl.nano.KomoriNinja 1.1 | 6 | 3% | 6 |
| wit.Chuliath 1.0 | 3 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 2 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 85.4 | 108 / 210 | 2.31 | 19.1% | 35021 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 19.1% | 108 |
| alpha.RainingFire 1.0 | 2.3 | 12.7% | 32 |
| bzdp.Pansy 2.1 | 3.3 | 11.4% | 18 |
| mz.Cork 0.1 | 4.2 | 10.8% | 18 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 16 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.9% | 14 |
| bvh.mini.Fenrir 0.39 | 7.3 | 8.0% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 7.1% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 6.6% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.7 | 18 / 35 | 6283 |
| 2 | 1 | 69.7 | 89.5 | 19 / 35 | 5832 |
| 3 | 1 | 68.1 | 84.4 | 17 / 35 | 5505 |
| 4 | 1 | 67.0 | 79.4 | 18 / 35 | 5553 |
| 5 | 1 | 70.1 | 89.8 | 23 / 35 | 6080 |
| 6 | 1 | 67.7 | 83.8 | 13 / 35 | 5768 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 38 | 82% |
| alpha.RainingFire 1.0 | 31 | 55% |
| mz.Cork 0.1 | 25 | 76% |
| bvh.micro.Freya 0.3 | 24 | 71% |
| m3thos.Eva02 0.7.1 | 15 | 67% |
| dl.BetterWalls 1.0 | 7 | 86% |
| bvh.mini.Fenrir 0.39 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |
| sample.MyFirstRobot 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 26 | 25% | 46 |
| bvh.micro.Freya 0.3 | 22 | 21% | 37 |
| bzdp.Pansy 2.1 | 15 | 14% | 35 |
| mz.Cork 0.1 | 14 | 13% | 36 |
| m3thos.Eva02 0.7.1 | 8 | 8% | 16 |
| squidM.TentalceMeleeNano 1.1 | 7 | 7% | 11 |
| dl.BetterWalls 1.0 | 6 | 6% | 19 |
| bvh.mini.Fenrir 0.39 | 5 | 5% | 7 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 81.9 | 114 / 210 | 2.63 | 17.7% | 33835 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 17.7% | 114 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.9% | 8 |
| agrach.Dalek 1.0 | 3.5 | 10.6% | 31 |
| germ.TheMind .2 | 3.5 | 10.3% | 10 |
| EBBU.Sim2 1.02 | 4.5 | 9.9% | 8 |
| stelo.UntouchableNano 1.3 | 6.7 | 8.8% | 17 |
| lmk.ACPFinal 0.1 | 7.3 | 8.3% | 8 |
| mb.Beast 0.1 | 7.7 | 8.4% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.8% | 2 |
| skm.Ryubot 1.0 | 9.3 | 7.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.0 | 18 / 35 | 5950 |
| 2 | 1 | 65.2 | 78.7 | 18 / 35 | 5608 |
| 3 | 1 | 65.9 | 81.9 | 19 / 35 | 5419 |
| 4 | 1 | 67.6 | 85.7 | 23 / 35 | 5998 |
| 5 | 1 | 65.4 | 79.7 | 20 / 35 | 5255 |
| 6 | 1 | 65.0 | 78.1 | 16 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| agrach.Dalek 1.0 | 26 | 42% |
| germ.TheMind .2 | 24 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 87% |
| stelo.UntouchableNano 1.3 | 22 | 77% |
| EBBU.Sim2 1.02 | 16 | 81% |
| mb.Beast 0.1 | 14 | 100% |
| skm.Ryubot 1.0 | 10 | 90% |
| lmk.ACPFinal 0.1 | 5 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 50% |

Hadur died in 97 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 27 | 28% | 47 |
| stelo.UntouchableNano 1.3 | 14 | 14% | 28 |
| EBBU.Sim2 1.02 | 13 | 13% | 26 |
| lmk.ACPFinal 0.1 | 12 | 12% | 20 |
| mn.nano.perceptual.Impact 1.3.0 | 9 | 9% | 13 |
| mb.Beast 0.1 | 8 | 8% | 22 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 7% | 34 |
| germ.TheMind .2 | 4 | 4% | 13 |
| skm.Ryubot 1.0 | 3 | 3% | 5 |

## Melee bench: F38

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.8 | 61.3 | 28 / 210 | 4.49 | 12.8% | 24588 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.0 | 16.7% | 95 |
| hadur117.mini.DeiseWHPF 0.2 | 2.7 | 12.8% | 28 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 17 |
| cs.Wren 1.0 | 4.2 | 11.8% | 19 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.8% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.2 | 10.3% | 10 |
| kdf.KoulDestroyer 1.0 | 6.5 | 9.5% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 4 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 57.7 | 59.7 | 4 / 35 | 3976 |
| 2 | 3 | 59.0 | 63.2 | 5 / 35 | 3809 |
| 3 | 3 | 56.2 | 55.9 | 1 / 35 | 3925 |
| 4 | 3 | 61.0 | 64.1 | 8 / 35 | 4245 |
| 5 | 3 | 58.1 | 57.5 | 5 / 35 | 4181 |
| 6 | 2 | 61.1 | 67.3 | 5 / 35 | 4452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 15 | 20% |
| cs.Wren 1.0 | 13 | 77% |
| bvh.mini.Freya 0.55 | 9 | 89% |
| bts.mega.Gnarly 1.4 | 8 | 75% |
| kdf.KoulDestroyer 1.0 | 3 | 0% |
| davidalves.net.DuelistNanoMelee 1.01 | 2 | 50% |

Hadur died in 182 of 210 rounds, at a mean tick of 535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 79 | 43% | 83 |
| bts.mega.Gnarly 1.4 | 23 | 13% | 32 |
| kdf.KoulDestroyer 1.0 | 23 | 13% | 24 |
| cs.Wren 1.0 | 20 | 11% | 26 |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 8% | 16 |
| bvh.mini.Freya 0.55 | 13 | 7% | 19 |
| kawigi.spare.SpareParts 0.7.6nosnd | 6 | 3% | 6 |
| bzdp.BoxCar 2.0 | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 69.4 | 33 / 210 | 3.75 | 14.8% | 30527 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 1.5 | 15.3% | 43 |
| hadur117.mini.DeiseWHPF 0.2 | 1.8 | 14.8% | 33 |
| az.Ololobot 0.2.4 | 2.7 | 13.2% | 80 |
| catcat20.Lambda 0.024 | 4.2 | 11.4% | 33 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 6.2 | 8.8% | 5 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 8.5% | 4 |
| gimp.GimpBot 0.1 | 7.5 | 8.3% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.4 | 66.0 | 4 / 35 | 4758 |
| 2 | 2 | 62.1 | 72.1 | 4 / 35 | 4829 |
| 3 | 3 | 59.7 | 62.2 | 4 / 35 | 4947 |
| 4 | 1 | 64.0 | 74.3 | 7 / 35 | 5501 |
| 5 | 1 | 63.7 | 73.0 | 9 / 35 | 5370 |
| 6 | 2 | 62.3 | 68.9 | 5 / 35 | 5122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 27 | 44% |
| az.Ololobot 0.2.4 | 21 | 10% |
| catcat20.Lambda 0.024 | 16 | 44% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 55 | 31% | 67 |
| az.Ololobot 0.2.4 | 51 | 29% | 54 |
| catcat20.Lambda 0.024 | 27 | 15% | 36 |
| gimp.GimpBot 0.1 | 15 | 8% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 6% | 14 |
| apollokidd.ApolloKidd 0.9 | 9 | 5% | 10 |
| winamp32.micro.MicroMacro 1.0 | 4 | 2% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 2% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 74.7 | 60 / 210 | 3.28 | 16.6% | 33011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.3 | 16.6% | 60 |
| kawigi.mini.Coriantumr 1.1 | 1.7 | 16.0% | 79 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.2% | 25 |
| mz.AntiGrav 1.0 | 4.5 | 10.4% | 8 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.1% | 8 |
| stelo.Randomness 1.0 | 6.0 | 9.2% | 15 |
| alpha.BlackIce 1.0 | 6.3 | 8.7% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.9% | 3 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.6% | 3 |
| sample.Corners 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 78.1 | 16 / 35 | 5473 |
| 2 | 1 | 67.3 | 79.4 | 12 / 35 | 5830 |
| 3 | 1 | 65.5 | 78.1 | 6 / 35 | 5554 |
| 4 | 1 | 68.3 | 83.5 | 16 / 35 | 5757 |
| 5 | 2 | 61.2 | 62.9 | 5 / 35 | 5332 |
| 6 | 2 | 61.9 | 66.3 | 5 / 35 | 5065 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 23% |
| kano.gamma.KanoGamma 1.8 | 19 | 58% |
| mz.AntiGrav 1.0 | 15 | 100% |
| Polkwane.SmashMelee 1.0 | 13 | 100% |
| stelo.Randomness 1.0 | 8 | 63% |
| alpha.BlackIce 1.0 | 4 | 50% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 80 | 53% | 89 |
| kano.gamma.KanoGamma 1.8 | 18 | 12% | 44 |
| stelo.Randomness 1.0 | 12 | 8% | 22 |
| Polkwane.SmashMelee 1.0 | 12 | 8% | 17 |
| amk.superstrike.SuperStrike 0.3 | 9 | 6% | 9 |
| mz.AntiGrav 1.0 | 8 | 5% | 15 |
| alpha.BlackIce 1.0 | 8 | 5% | 9 |
| testantiswapgun.AntiSwap 1.0 | 2 | 1% | 3 |
| sample.Corners 1.0 | 2 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.8 | 65.4 | 14 / 210 | 4.11 | 13.6% | 27470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.0 | 18.1% | 125 |
| hadur117.mini.DeiseWHPF 0.2 | 2.3 | 13.6% | 14 |
| lessonz.robocode.Oz 0.5.0 | 2.8 | 13.5% | 30 |
| ary.Swarm 1.1 | 4.0 | 12.3% | 18 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.2% | 12 |
| shrub.Silver v048 | 6.0 | 9.6% | 5 |
| zyx.nano.Ant 1.1 | 6.7 | 8.1% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.1% | 5 |
| stelo.Mirror 1.1 | 8.7 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 59.3 | 60.3 | 4 / 35 | 4577 |
| 2 | 2 | 61.2 | 64.4 | 0 / 35 | 4720 |
| 3 | 2 | 60.8 | 67.9 | 1 / 35 | 4392 |
| 4 | 3 | 61.3 | 67.6 | 2 / 35 | 4429 |
| 5 | 3 | 60.6 | 65.7 | 2 / 35 | 4575 |
| 6 | 2 | 61.6 | 66.7 | 5 / 35 | 4777 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 25 | 8% |
| ary.Swarm 1.1 | 10 | 80% |
| lessonz.robocode.Oz 0.5.0 | 5 | 20% |
| shrub.Silver v048 | 3 | 33% |
| simonton.nano.MeleeSeed 1.8 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 636. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 96 | 49% | 98 |
| lessonz.robocode.Oz 0.5.0 | 41 | 21% | 44 |
| ary.Swarm 1.1 | 27 | 14% | 32 |
| shrub.Silver v048 | 14 | 7% | 16 |
| simonton.nano.MeleeSeed 1.8 | 5 | 3% | 6 |
| stelo.Mirror 1.1 | 5 | 3% | 5 |
| jsal.Jsalbot 1.0 | 5 | 3% | 5 |
| zyx.nano.Ant 1.1 | 3 | 2% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.7 | 64.8 | 17 / 210 | 4.17 | 13.8% | 30759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.0 | 17.6% | 108 |
| hadur117.mini.DeiseWHPF 0.2 | 2.7 | 13.8% | 17 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.2% | 31 |
| ara.Shera 0.88 | 3.5 | 13.3% | 42 |
| amz.NanoClone 1.41 | 5.2 | 8.9% | 2 |
| maribo.IotaCT 1.1 | 6.0 | 7.7% | 0 |
| dsw.StaticD 1.0 | 6.8 | 7.3% | 9 |
| stelo.MirrorMicro 1.0 | 8.5 | 6.3% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.1 | 68.3 | 6 / 35 | 5222 |
| 2 | 2 | 63.8 | 73.0 | 3 / 35 | 5816 |
| 3 | 2 | 61.4 | 66.7 | 2 / 35 | 5180 |
| 4 | 4 | 59.9 | 61.6 | 0 / 35 | 5148 |
| 5 | 4 | 56.1 | 53.7 | 2 / 35 | 4378 |
| 6 | 2 | 60.9 | 65.7 | 4 / 35 | 5015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 30 | 23% |
| maribo.mini.MiniQuester 0.1 | 13 | 31% |
| ara.Shera 0.88 | 9 | 44% |
| dsw.StaticD 1.0 | 2 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 193 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 83 | 43% | 92 |
| ara.Shera 0.88 | 46 | 24% | 50 |
| maribo.mini.MiniQuester 0.1 | 36 | 19% | 38 |
| amz.NanoClone 1.41 | 10 | 5% | 10 |
| dsw.StaticD 1.0 | 8 | 4% | 9 |
| stelo.MirrorMicro 1.0 | 6 | 3% | 7 |
| maribo.IotaCT 1.1 | 4 | 2% | 4 |

## Melee bench: F43

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 56.4 | 53.1 | 2 / 210 | 5.22 | 10.9% | 21933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.6% | 170 |
| brainfade.melee.Dusk 0.44 | 2.3 | 12.9% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 3.8 | 11.4% | 5 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.2% | 9 |
| hadur117.mini.DeiseWHPF 0.2 | 4.7 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.3 | 10.3% | 1 |
| jab.DiamondStealer 5 | 7.3 | 8.7% | 3 |
| mz.NanoGod 2.02 | 7.7 | 8.2% | 3 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.6 | 57.5 | 0 / 35 | 4021 |
| 2 | 4 | 56.8 | 54.9 | 1 / 35 | 3533 |
| 3 | 6 | 55.7 | 52.4 | 1 / 35 | 3335 |
| 4 | 3 | 58.5 | 58.1 | 0 / 35 | 3967 |
| 5 | 6 | 52.6 | 43.8 | 0 / 35 | 3337 |
| 6 | 6 | 56.4 | 52.1 | 0 / 35 | 3740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 20 | 0% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| mz.NanoGod 2.02 | 1 | 0% |
| brainfade.melee.Dusk 0.44 | 1 | 0% |

Hadur died in 208 of 210 rounds, at a mean tick of 497. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 103 | 50% | 103 |
| brainfade.melee.Dusk 0.44 | 25 | 12% | 25 |
| dummy.micro.Sparrow 2.5 | 20 | 10% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 20 | 10% | 20 |
| jab.DiamondStealer 5 | 19 | 9% | 19 |
| mz.NanoGod 2.02 | 11 | 5% | 11 |
| Krabb.akim2.Akim2 1.1b | 9 | 4% | 9 |
| cvt.Firsty 1.0 | 1 | 0% | 1 |

## Melee bench: F44

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 67.1 | 36 / 210 | 3.96 | 14.9% | 32543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 1.5 | 16.1% | 89 |
| hadur117.mini.DeiseWHPF 0.2 | 2.0 | 14.9% | 36 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.2% | 44 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 10.5% | 10 |
| wompi.Quokka 1.6 | 4.8 | 10.7% | 12 |
| jwirde.Gort 2.0 | 5.3 | 10.2% | 15 |
| disan.Chair 2.2.0 | 7.2 | 8.0% | 4 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.2 | 69.2 | 10 / 35 | 5284 |
| 2 | 3 | 61.7 | 63.8 | 6 / 35 | 5334 |
| 3 | 2 | 63.1 | 68.3 | 6 / 35 | 5439 |
| 4 | 2 | 64.3 | 67.9 | 6 / 35 | 5727 |
| 5 | 2 | 62.4 | 66.3 | 5 / 35 | 5292 |
| 6 | 2 | 61.9 | 67.0 | 3 / 35 | 5467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 39% |
| tzu.TheArtOfWar 1.2 | 21 | 62% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 25% |
| disan.Chair 2.2.0 | 5 | 80% |
| wompi.Quokka 1.6 | 4 | 75% |
| jwirde.Gort 2.0 | 3 | 0% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 175 of 210 rounds, at a mean tick of 643. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 50 | 29% | 64 |
| wompi.Quokka 1.6 | 27 | 15% | 31 |
| jwirde.Gort 2.0 | 26 | 15% | 33 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 26 | 15% | 27 |
| tzu.TheArtOfWar 1.2 | 25 | 14% | 31 |
| disan.Chair 2.2.0 | 12 | 7% | 15 |
| stf.PanzerGeneral 0.1 | 5 | 3% | 6 |
| amk.jointstrike.JointStrike 0.2 | 3 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.8 | 53 / 210 | 2.64 | 18.6% | 37679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWHPF 0.2 | 1.0 | 18.6% | 53 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.7% | 107 |
| jje.BagPuss 1.2 | 2.7 | 12.7% | 15 |
| sul.Lunar 1.1 | 4.2 | 11.0% | 23 |
| myl.nano.Graviton 1.10 | 5.0 | 10.2% | 4 |
| fm.claire 1.7 | 6.5 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.0% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 7.9% | 4 |
| wit.Deep7 2.0 | 9.3 | 5.6% | 3 |
| abud.ThirdRobo 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 82.5 | 8 / 35 | 5938 |
| 2 | 1 | 68.6 | 83.5 | 12 / 35 | 6267 |
| 3 | 1 | 66.9 | 78.7 | 9 / 35 | 6027 |
| 4 | 1 | 69.9 | 87.3 | 10 / 35 | 6754 |
| 5 | 1 | 66.2 | 76.8 | 6 / 35 | 6117 |
| 6 | 1 | 68.3 | 81.9 | 8 / 35 | 6576 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 74 | 16% |
| sul.Lunar 1.1 | 33 | 48% |
| jje.BagPuss 1.2 | 13 | 38% |
| wit.Deep7 2.0 | 8 | 75% |
| myl.nano.Graviton 1.10 | 7 | 86% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| fm.claire 1.7 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 64 | 41% | 0 |
| jje.BagPuss 1.2 | 40 | 25% | 75 |
| sul.Lunar 1.1 | 24 | 15% | 50 |
| myl.nano.Graviton 1.10 | 12 | 8% | 22 |
| fm.claire 1.7 | 5 | 3% | 12 |
| hvilela.HVilela 0.9 | 4 | 3% | 9 |
| wit.Deep7 2.0 | 3 | 2% | 19 |
| abud.ThirdRobo 1.0 | 3 | 2% | 7 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 1% | 14 |

## Melee bench: F46

hadur117.mini.DeiseWHPF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 67.5 | 11 / 210 | 3.93 | 13.5% | 26405 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 18.3% | 96 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.2% | 95 |
| hadur117.mini.DeiseWHPF 0.2 | 3.0 | 13.5% | 11 |
| mz.MicroSheep 1.0 | 4.5 | 10.3% | 3 |
| sadoner.killer 0.2 | 5.2 | 9.6% | 1 |
| cx.Princess 1.0 | 5.3 | 9.7% | 3 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.3% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.8 | 73.0 | 3 / 35 | 4555 |
| 2 | 3 | 61.5 | 67.3 | 0 / 35 | 4819 |
| 3 | 3 | 61.1 | 68.9 | 3 / 35 | 4162 |
| 4 | 3 | 62.7 | 72.4 | 3 / 35 | 4554 |
| 5 | 3 | 58.5 | 59.7 | 2 / 35 | 4301 |
| 6 | 3 | 59.4 | 63.5 | 0 / 35 | 4014 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 21 | 5% |
| rsalesc.melee.Medina 0.4.5 | 12 | 8% |
| cx.Princess 1.0 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 2 | 100% |
| mz.MicroSheep 1.0 | 2 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 587. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 93 | 47% | 98 |
| rsalesc.melee.Medina 0.4.5 | 68 | 34% | 69 |
| sadoner.killer 0.2 | 11 | 6% | 12 |
| mz.MicroSheep 1.0 | 9 | 5% | 9 |
| cx.Princess 1.0 | 6 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 6 | 3% | 7 |
| jeremyreeder.collective.Prophet 5 | 5 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

