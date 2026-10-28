# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 81.6 | 38 / 210 | 2.66 | 15.9% | 27358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.4% | 134 |
| hadur117.mini.DeiseCE 0.2 | 2.0 | 15.9% | 38 |
| sgp.JollyNinja 3.53 | 3.3 | 11.8% | 17 |
| mz.MicroGodMelee 1 | 4.2 | 11.4% | 12 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.0 | 10.6% | 2 |
| lorneswork.Predator 1.0 | 5.7 | 10.0% | 5 |
| adt.Ar2 1.0 | 6.8 | 7.7% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.4% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 82.2 | 7 / 35 | 4342 |
| 2 | 2 | 65.9 | 84.1 | 9 / 35 | 4595 |
| 3 | 2 | 65.5 | 82.2 | 6 / 35 | 4530 |
| 4 | 2 | 64.6 | 80.3 | 5 / 35 | 4696 |
| 5 | 2 | 65.3 | 81.6 | 6 / 35 | 4904 |
| 6 | 2 | 64.1 | 79.0 | 5 / 35 | 4291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 87 | 13% |
| mz.MicroGodMelee 1 | 15 | 53% |
| sgp.JollyNinja 3.53 | 14 | 57% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| lorneswork.Predator 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 931. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 102 | 59% | 114 |
| sgp.JollyNinja 3.53 | 32 | 19% | 39 |
| mz.MicroGodMelee 1 | 17 | 10% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 17 |
| lorneswork.Predator 1.0 | 5 | 3% | 8 |
| adt.Ar2 1.0 | 4 | 2% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.2 | 75 / 210 | 3.05 | 16.5% | 28643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.2 | 16.5% | 75 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 12.9% | 36 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.4% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 10.3% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.5% | 6 |
| Noran.BitchingElk 0.054 | 7.3 | 8.2% | 15 |
| stelo.PatternRobot 1.0 | 7.8 | 7.3% | 7 |
| sch.Simone 0.3d | 8.0 | 7.1% | 6 |
| fullsail.SweetTea 1.1 | 9.8 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.0 | 74.0 | 11 / 35 | 4838 |
| 2 | 1 | 67.3 | 81.9 | 13 / 35 | 5454 |
| 3 | 1 | 65.3 | 80.6 | 13 / 35 | 4670 |
| 4 | 1 | 65.6 | 80.3 | 16 / 35 | 4557 |
| 5 | 1 | 63.6 | 74.3 | 13 / 35 | 4506 |
| 6 | 2 | 63.1 | 72.4 | 9 / 35 | 4618 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 78% |
| Noran.BitchingElk 0.054 | 15 | 47% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 90% |
| stelo.PatternRobot 1.0 | 9 | 78% |
| fullsail.SweetTea 1.1 | 4 | 75% |
| sch.Simone 0.3d | 1 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 26% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 35 | 26% | 63 |
| stelo.PatternRobot 1.0 | 23 | 17% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 14 | 10% | 18 |
| Noran.BitchingElk 0.054 | 11 | 8% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 6% | 16 |
| fullsail.SweetTea 1.1 | 4 | 3% | 8 |
| fnc.bandit.Bandit 5.2.0 | 3 | 2% | 5 |
| sch.Simone 0.3d | 2 | 1% | 4 |

## Melee bench: F03

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 91.9 | 154 / 210 | 1.73 | 19.7% | 34470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.7% | 154 |
| radnor.DoctorBob 1.42 | 2.5 | 13.5% | 18 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.8% | 9 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 24 |
| urdos.URDOS 1.3 | 5.0 | 9.6% | 5 |
| adt.Ar1 2.1 | 6.0 | 7.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.7 | 25 / 35 | 6024 |
| 2 | 1 | 69.2 | 88.9 | 24 / 35 | 5729 |
| 3 | 1 | 69.9 | 90.8 | 25 / 35 | 5814 |
| 4 | 1 | 70.0 | 94.0 | 27 / 35 | 6018 |
| 5 | 1 | 69.4 | 92.4 | 26 / 35 | 5395 |
| 6 | 1 | 69.7 | 93.3 | 27 / 35 | 5490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| radnor.DoctorBob 1.42 | 54 | 87% |
| kawigi.nano.Lib 1.0 | 53 | 96% |
| vuen.Cake 2.51 | 52 | 85% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 67% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 1 | 0% |

Hadur died in 57 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 16 | 28% | 74 |
| radnor.DoctorBob 1.42 | 16 | 28% | 54 |
| vuen.Cake 2.51 | 13 | 23% | 55 |
| urdos.URDOS 1.3 | 6 | 11% | 8 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 2 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F04

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 76.9 | 13 / 210 | 3.08 | 15.5% | 30890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.3% | 189 |
| hadur117.mini.DeiseCE 0.2 | 2.0 | 15.5% | 13 |
| apc.LeeroyJenkins2 1.0 | 3.2 | 12.8% | 3 |
| TNT.TNT 0.99.1 | 3.8 | 10.7% | 4 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 1 |
| tj.zombie1n 1.0.1 | 6.3 | 7.0% | 0 |
| css.Delitioner 0.11 | 6.7 | 6.4% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 77.5 | 1 / 35 | 4916 |
| 2 | 2 | 65.3 | 77.1 | 3 / 35 | 5329 |
| 3 | 2 | 62.7 | 70.8 | 2 / 35 | 4625 |
| 4 | 2 | 66.3 | 81.3 | 2 / 35 | 5272 |
| 5 | 2 | 66.8 | 80.3 | 4 / 35 | 5617 |
| 6 | 2 | 64.3 | 74.3 | 1 / 35 | 5131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 79 | 9% |
| TNT.TNT 0.99.1 | 3 | 33% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 0% |
| spin.Bugstard 0.012b | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| rampancy.Durandal 2.1d | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 163 | 83% | 172 |
| apc.LeeroyJenkins2 1.0 | 11 | 6% | 13 |
| josago.Jorgito 0.16 | 7 | 4% | 7 |
| tj.zombie1n 1.0.1 | 7 | 4% | 7 |
| TNT.TNT 0.99.1 | 4 | 2% | 5 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.9 | 63.5 | 9 / 210 | 4.29 | 11.9% | 19333 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.3% | 128 |
| justin.DemonicRage 3.4 | 1.8 | 17.4% | 57 |
| wompi.Numbat 2.1 | 3.2 | 12.8% | 11 |
| hadur117.mini.DeiseCE 0.2 | 3.8 | 11.9% | 9 |
| ms.Ares 0.19 | 5.3 | 9.1% | 3 |
| axeBots.HataMoto 3.09 | 5.7 | 8.4% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.6% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.4 | 66.0 | 1 / 35 | 3085 |
| 2 | 4 | 58.0 | 61.0 | 1 / 35 | 3405 |
| 3 | 4 | 56.2 | 61.3 | 1 / 35 | 2969 |
| 4 | 4 | 59.2 | 65.7 | 2 / 35 | 3464 |
| 5 | 3 | 59.4 | 68.6 | 3 / 35 | 3097 |
| 6 | 4 | 56.3 | 58.4 | 1 / 35 | 3313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 17 | 24% |
| cb.fire.Firestarter 2.0f | 13 | 0% |
| wompi.Numbat 2.1 | 5 | 80% |
| ms.Ares 0.19 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 202 of 210 rounds, at a mean tick of 657. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 87 | 43% | 88 |
| justin.DemonicRage 3.4 | 50 | 25% | 53 |
| wompi.Numbat 2.1 | 31 | 15% | 33 |
| axeBots.HataMoto 3.09 | 10 | 5% | 11 |
| ms.Ares 0.19 | 8 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 5 | 2% | 5 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 92.0 | 130 / 210 | 1.72 | 19.3% | 28483 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.3% | 130 |
| jekl.StoneGhost 0.7 | 2.0 | 14.8% | 34 |
| origin.SleepSiphon 1.7b | 3.7 | 11.6% | 20 |
| mld.Wisdom 1.0 | 4.0 | 11.4% | 7 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.0% | 16 |
| gg.Wolverine 2.0 | 6.0 | 8.3% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 6.9% | 0 |
| DBall.NUKE 0.1 | 7.8 | 6.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.5% | 3 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.7 | 23 / 35 | 4451 |
| 2 | 1 | 69.5 | 90.8 | 23 / 35 | 4961 |
| 3 | 1 | 68.7 | 89.8 | 19 / 35 | 4825 |
| 4 | 1 | 69.3 | 92.4 | 22 / 35 | 4655 |
| 5 | 1 | 69.0 | 91.7 | 21 / 35 | 4738 |
| 6 | 1 | 69.6 | 93.3 | 22 / 35 | 4853 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 63 | 78% |
| origin.SleepSiphon 1.7b | 37 | 78% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 77% |
| gg.Wolverine 2.0 | 14 | 93% |
| mld.Wisdom 1.0 | 13 | 69% |
| ers.nano.hawk.HawkLA 3.0m | 8 | 75% |
| DBall.NUKE 0.1 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 33 | 40% | 75 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 22% | 36 |
| origin.SleepSiphon 1.7b | 15 | 18% | 52 |
| mld.Wisdom 1.0 | 10 | 12% | 19 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 10 |
| gg.Wolverine 2.0 | 2 | 2% | 9 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |
| DBall.NUKE 0.1 | 0 | 0% | 4 |
| sample.Fire 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.4 | 70 / 210 | 2.40 | 17.5% | 31454 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.5 | 18.1% | 68 |
| hadur117.mini.DeiseCE 0.2 | 1.7 | 17.5% | 70 |
| rtk.Tachikoma 1.0 | 2.8 | 16.5% | 48 |
| franzor.Lizt 1.3.1 | 4.5 | 10.9% | 16 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 11.0% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 8.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.7 | 14 / 35 | 5297 |
| 2 | 1 | 69.0 | 86.0 | 12 / 35 | 5670 |
| 3 | 2 | 68.1 | 84.8 | 9 / 35 | 5336 |
| 4 | 2 | 68.4 | 85.1 | 12 / 35 | 5344 |
| 5 | 2 | 68.4 | 83.8 | 13 / 35 | 4998 |
| 6 | 2 | 67.4 | 81.3 | 10 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 66 | 59% |
| rsalesc.melee.Monk 0.3.6c | 24 | 13% |
| oog.melee.CapuletDroid 1.1 | 18 | 94% |
| franzor.Lizt 1.3.1 | 12 | 58% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 1052. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 68 | 48% | 77 |
| rtk.Tachikoma 1.0 | 54 | 38% | 96 |
| oog.melee.CapuletDroid 1.1 | 8 | 6% | 26 |
| franzor.Lizt 1.3.1 | 6 | 4% | 2 |
| exauge.GateKeeper 1.1.121g | 4 | 3% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.5 | 112 / 210 | 2.22 | 18.8% | 31255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 18.8% | 112 |
| tm.Yuugao 1.0 | 2.0 | 13.5% | 37 |
| shrub.Vapour v159 | 3.0 | 11.8% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.8% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.5% | 11 |
| m3thos.Eva00 1.1 | 6.0 | 8.7% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.4% | 6 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.8% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.0% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.2 | 20 / 35 | 4792 |
| 2 | 1 | 67.1 | 82.2 | 17 / 35 | 5189 |
| 3 | 1 | 67.9 | 85.1 | 18 / 35 | 4882 |
| 4 | 1 | 68.1 | 86.3 | 17 / 35 | 5282 |
| 5 | 1 | 68.4 | 87.6 | 20 / 35 | 5231 |
| 6 | 1 | 69.5 | 88.3 | 20 / 35 | 5879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 54 | 65% |
| Krabb.sliNk.Garm 0.9u | 28 | 71% |
| shrub.Vapour v159 | 24 | 67% |
| jwst.DAD.DarkAndDarker 1.1 | 21 | 95% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 93% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 40 | 41% | 73 |
| shrub.Vapour v159 | 19 | 19% | 34 |
| Krabb.sliNk.Garm 0.9u | 16 | 16% | 34 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 6% | 22 |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 6% | 22 |
| m3thos.Eva00 1.1 | 5 | 5% | 11 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 6 |
| SHAM.WOW 1.4 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 73.4 | 42 / 210 | 3.39 | 14.6% | 21942 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 18.0% | 110 |
| hadur117.mini.DeiseCE 0.2 | 2.5 | 14.6% | 42 |
| kc.micro.Figment 1.0 | 2.5 | 14.4% | 30 |
| yagami.Tidus 0.11 | 4.7 | 10.1% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.1% | 13 |
| mc2.enemy.Original 0.9 | 5.7 | 9.3% | 11 |
| dft.Calliope 5.6 | 6.7 | 8.0% | 2 |
| step.nanoPri 1.0 | 8.7 | 5.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 80.3 | 8 / 35 | 4070 |
| 2 | 2 | 62.8 | 73.3 | 7 / 35 | 3780 |
| 3 | 3 | 61.7 | 72.4 | 5 / 35 | 3556 |
| 4 | 2 | 62.7 | 74.6 | 10 / 35 | 3736 |
| 5 | 3 | 61.3 | 72.1 | 6 / 35 | 3351 |
| 6 | 3 | 60.1 | 67.9 | 6 / 35 | 3449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 45 | 20% |
| kc.micro.Figment 1.0 | 28 | 68% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| yagami.Tidus 0.11 | 3 | 67% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 80 | 48% | 91 |
| kc.micro.Figment 1.0 | 23 | 14% | 41 |
| yagami.Tidus 0.11 | 22 | 13% | 24 |
| mc2.enemy.Original 0.9 | 12 | 7% | 19 |
| robar.nano.Assertive_Melee 0.2 | 12 | 7% | 12 |
| pedersen.Grishnakh 1.0 | 10 | 6% | 12 |
| dft.Calliope 5.6 | 4 | 2% | 6 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.2 | 137 / 210 | 1.79 | 19.0% | 30452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.0% | 137 |
| DTF.Kludgy 1.2b | 2.3 | 13.9% | 33 |
| ne.Chimera 1.2 | 3.0 | 12.7% | 12 |
| ejb.Polaris 1.0.1 | 4.0 | 12.0% | 16 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.4% | 9 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 2 |
| sam.Samspin 1.0 | 7.7 | 6.3% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.7% | 1 |
| donjezza.Muncho 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 24 / 35 | 5276 |
| 2 | 1 | 68.8 | 91.4 | 21 / 35 | 5085 |
| 3 | 1 | 70.1 | 95.6 | 25 / 35 | 5200 |
| 4 | 1 | 68.6 | 92.1 | 22 / 35 | 4724 |
| 5 | 1 | 68.4 | 88.9 | 21 / 35 | 4979 |
| 6 | 1 | 69.3 | 90.8 | 24 / 35 | 5188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 62% |
| ejb.Polaris 1.0.1 | 34 | 82% |
| ne.Chimera 1.2 | 30 | 77% |
| tvv.micro.Antares 1.1.1 | 21 | 100% |
| vStar.RAFzilla 2.15 | 15 | 100% |
| kurios.DOSexe .9b | 5 | 80% |
| donjezza.Muncho 1.0 | 5 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 866. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 35 | 48% | 69 |
| ne.Chimera 1.2 | 15 | 21% | 38 |
| ejb.Polaris 1.0.1 | 10 | 14% | 42 |
| tvv.micro.Antares 1.1.1 | 4 | 5% | 20 |
| sam.Samspin 1.0 | 4 | 5% | 9 |
| vStar.RAFzilla 2.15 | 2 | 3% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 3% | 2 |
| kurios.DOSexe .9b | 1 | 1% | 8 |
| donjezza.Muncho 1.0 | 0 | 0% | 4 |

## Melee bench: F11

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.3 | 84 / 210 | 2.68 | 16.7% | 24877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.3 | 17.2% | 73 |
| hadur117.mini.DeiseCE 0.2 | 1.7 | 16.7% | 84 |
| cx.mini.Nimrod 0.55 | 3.0 | 11.9% | 16 |
| djc.DynaBot 0.1.1 | 4.3 | 10.5% | 10 |
| rdt199.Warlord 0.73 | 5.3 | 9.1% | 14 |
| br2.MobyDickBot 1.6 | 6.0 | 8.8% | 7 |
| uji.YellohFellah 1.0 | 6.8 | 7.9% | 4 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.1% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.2% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.9 | 19 / 35 | 4282 |
| 2 | 2 | 65.9 | 81.6 | 15 / 35 | 4248 |
| 3 | 2 | 65.5 | 82.5 | 14 / 35 | 4043 |
| 4 | 2 | 63.6 | 75.9 | 11 / 35 | 4067 |
| 5 | 2 | 64.3 | 78.7 | 13 / 35 | 4037 |
| 6 | 1 | 64.8 | 81.3 | 12 / 35 | 4200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 75 | 57% |
| djc.DynaBot 0.1.1 | 18 | 83% |
| cx.mini.Nimrod 0.55 | 15 | 53% |
| rdt199.Warlord 0.73 | 10 | 60% |
| uji.YellohFellah 1.0 | 8 | 88% |
| br2.MobyDickBot 1.6 | 3 | 67% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 55 | 44% | 97 |
| cx.mini.Nimrod 0.55 | 23 | 18% | 29 |
| rdt199.Warlord 0.73 | 15 | 12% | 23 |
| djc.DynaBot 0.1.1 | 11 | 9% | 23 |
| br2.MobyDickBot 1.6 | 8 | 6% | 13 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 9 |
| stelo.MirrorNano 1.3 | 4 | 3% | 5 |
| uji.YellohFellah 1.0 | 2 | 2% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 80.4 | 89 / 210 | 2.77 | 16.2% | 21982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 16.2% | 89 |
| bts.wiki.RipCurl 0.9b | 2.3 | 14.4% | 50 |
| darkcanuck.Leon 1.01 | 3.0 | 12.7% | 22 |
| nat.PallasHawk 1.0 | 3.8 | 12.6% | 36 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.6% | 11 |
| jp.Perpy 16.0 | 6.7 | 7.6% | 0 |
| jrm.Test0 1.0 | 6.7 | 7.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.8 | 7.1% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.5% | 2 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 78.7 | 13 / 35 | 3398 |
| 2 | 1 | 66.3 | 81.9 | 19 / 35 | 4113 |
| 3 | 1 | 65.2 | 82.9 | 18 / 35 | 3464 |
| 4 | 1 | 65.2 | 81.3 | 16 / 35 | 3880 |
| 5 | 1 | 62.6 | 77.5 | 10 / 35 | 3389 |
| 6 | 1 | 64.5 | 80.0 | 13 / 35 | 3738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 37 | 70% |
| darkcanuck.Leon 1.01 | 32 | 72% |
| nat.PallasHawk 1.0 | 20 | 80% |
| brainfade.melee.Genghis 0.36 | 13 | 100% |
| jp.Perpy 16.0 | 6 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 661. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 50 | 40% | 67 |
| nat.PallasHawk 1.0 | 22 | 18% | 43 |
| darkcanuck.Leon 1.01 | 20 | 16% | 47 |
| brainfade.melee.Genghis 0.36 | 10 | 8% | 17 |
| jp.Perpy 16.0 | 8 | 6% | 12 |
| jrm.Test0 1.0 | 6 | 5% | 7 |
| cs.sheldor.Talon 1.1 | 5 | 4% | 7 |
| jaybot.bots.Oddball 4.0 | 3 | 2% | 7 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |

## Melee bench: F13

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 76.5 | 35 / 210 | 3.12 | 14.7% | 24521 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.0% | 53 |
| mn.Combat 3.25.0 | 1.7 | 16.5% | 86 |
| hadur117.mini.DeiseCE 0.2 | 3.0 | 14.7% | 35 |
| shinh.Entangled 0.3 | 4.2 | 12.7% | 22 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.9% | 13 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 4.8% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 72.7 | 3 / 35 | 4289 |
| 2 | 3 | 64.3 | 78.1 | 6 / 35 | 4459 |
| 3 | 3 | 63.8 | 79.0 | 8 / 35 | 3908 |
| 4 | 3 | 62.8 | 74.6 | 5 / 35 | 3973 |
| 5 | 3 | 63.9 | 76.5 | 8 / 35 | 4260 |
| 6 | 3 | 62.8 | 77.8 | 5 / 35 | 3632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 23 | 30% |
| ags.Glacier 0.2.11 | 21 | 57% |
| gh.micro.Gruweltje 0.7 | 10 | 80% |
| shinh.Entangled 0.3 | 9 | 56% |
| stelo.Wang 1.0 | 3 | 67% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 176 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 68 | 39% | 81 |
| mn.Combat 3.25.0 | 60 | 34% | 68 |
| shinh.Entangled 0.3 | 23 | 13% | 28 |
| gh.micro.Gruweltje 0.7 | 13 | 7% | 20 |
| stelo.Wang 1.0 | 4 | 2% | 5 |
| apc.Colossus2 0.17 | 4 | 2% | 5 |
| ayk.WallHugger 1.0 | 2 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.0 | 140 / 210 | 1.72 | 19.3% | 29772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.3% | 140 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.2% | 26 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.6% | 29 |
| co.edu.usb.rc.LidisTron 1.0 | 4.8 | 9.8% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.5% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.4% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 6.0 | 9.2% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.2% | 9 |
| pa.Improved 1.0 | 9.0 | 5.9% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 21 / 35 | 4924 |
| 2 | 1 | 70.1 | 94.9 | 25 / 35 | 5045 |
| 3 | 1 | 70.2 | 93.0 | 24 / 35 | 5546 |
| 4 | 1 | 68.8 | 92.1 | 21 / 35 | 4856 |
| 5 | 1 | 69.2 | 90.5 | 23 / 35 | 4921 |
| 6 | 1 | 69.3 | 92.4 | 26 / 35 | 4480 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 100 | 86% |
| catcat20.shape.Theta 0.018 | 42 | 67% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 58% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 80% |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 49% | 120 |
| catcat20.shape.Theta 0.018 | 23 | 33% | 42 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 3% | 12 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 1% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 3 |
| pa.Improved 1.0 | 0 | 0% | 3 |

## Melee bench: F15

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.0 | 88 / 210 | 2.62 | 17.8% | 32174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.8% | 88 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 26 |
| emp.Yngwie 1.11 | 3.2 | 13.1% | 50 |
| mld.DustBunny 3.8 | 3.8 | 12.2% | 18 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.4% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.9% | 20 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.9% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.9% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.2 | 4.5% | 0 |
| divineomega.TrialBot 0.003 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 78.4 | 14 / 35 | 4951 |
| 2 | 1 | 65.8 | 78.4 | 12 / 35 | 5029 |
| 3 | 1 | 68.7 | 85.1 | 18 / 35 | 5640 |
| 4 | 1 | 67.6 | 83.2 | 15 / 35 | 5554 |
| 5 | 1 | 69.1 | 87.9 | 17 / 35 | 5614 |
| 6 | 1 | 66.3 | 79.0 | 12 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 48% |
| kawigi.micro.Shiz 1.1 | 28 | 89% |
| mld.DustBunny 3.8 | 21 | 67% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| cb.nano.Insomnia 1.0 | 16 | 94% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 31% | 62 |
| kawigi.micro.Shiz 1.1 | 22 | 18% | 51 |
| mld.DustBunny 3.8 | 20 | 16% | 36 |
| cb.nano.Insomnia 1.0 | 20 | 16% | 21 |
| kawigi.robot.Girl 1.2 | 16 | 13% | 28 |
| Grystrion.TrackerWO 1.0 | 3 | 2% | 5 |
| divineomega.TrialBot 0.003 | 2 | 2% | 6 |
| lambdaxy.TBot 0.1 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.7 | 105 / 210 | 2.02 | 19.3% | 33312 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.3% | 105 |
| gh.Griezel 0.5.2 | 2.2 | 16.0% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 13.9% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.2% | 25 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 3 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 6.8% | 1 |
| repositorio.NanoStep 1.0 | 8.7 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 5.2% | 2 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.3 | 20 / 35 | 5879 |
| 2 | 1 | 68.2 | 86.0 | 19 / 35 | 5143 |
| 3 | 1 | 69.6 | 88.9 | 16 / 35 | 5565 |
| 4 | 1 | 69.3 | 87.6 | 14 / 35 | 5764 |
| 5 | 1 | 69.7 | 89.5 | 18 / 35 | 5573 |
| 6 | 1 | 69.7 | 91.7 | 18 / 35 | 5388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 83 | 54% |
| techdude.forest.FlamingForest 1.1 | 26 | 42% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 85% |
| divineomega.DivineBot 1.9.4.5 | 13 | 92% |
| bvh.fnr.Fenrir 0.36l | 11 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |
| asd.Cthulhu 1.3 | 1 | 0% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 46 | 44% | 96 |
| techdude.forest.FlamingForest 1.1 | 19 | 18% | 30 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 13% | 29 |
| stelo.IntrinsicVolatility 1.4 | 9 | 9% | 13 |
| bvh.fnr.Fenrir 0.36l | 8 | 8% | 16 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 8 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 13 |
| asd.Cthulhu 1.3 | 2 | 2% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

## Melee bench: F17

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.8 | 94 / 210 | 2.37 | 17.7% | 28381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.7% | 94 |
| et.Predator 1.8 | 2.2 | 13.7% | 29 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.1% | 29 |
| cx.BlestPain 1.41 | 3.8 | 12.2% | 33 |
| nic.Nicator 2.4 | 4.8 | 11.1% | 13 |
| ahf.NanoAndrew .4 | 5.7 | 10.5% | 9 |
| maribo.melee.BMV 0.1 | 6.8 | 9.2% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.6% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.4 | 16 / 35 | 4813 |
| 2 | 1 | 68.3 | 88.6 | 19 / 35 | 4542 |
| 3 | 1 | 65.0 | 77.8 | 15 / 35 | 4184 |
| 4 | 1 | 67.0 | 83.8 | 12 / 35 | 5023 |
| 5 | 1 | 67.4 | 84.8 | 13 / 35 | 4930 |
| 6 | 1 | 68.4 | 88.3 | 19 / 35 | 4889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 53 | 77% |
| oog.melee.Mercutio 1.0 | 30 | 63% |
| nic.Nicator 2.4 | 22 | 73% |
| cx.BlestPain 1.41 | 21 | 43% |
| ahf.NanoAndrew .4 | 9 | 56% |
| maribo.melee.BMV 0.1 | 5 | 80% |

Hadur died in 118 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 40 | 34% | 75 |
| cx.BlestPain 1.41 | 27 | 23% | 41 |
| oog.melee.Mercutio 1.0 | 19 | 16% | 38 |
| ahf.NanoAndrew .4 | 13 | 11% | 20 |
| nic.Nicator 2.4 | 11 | 9% | 25 |
| maribo.melee.BMV 0.1 | 3 | 3% | 5 |
| tex.Longbot 0.4 | 3 | 3% | 3 |
| goblin.Bender 2.4 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.9 | 117 / 210 | 2.36 | 17.7% | 24880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.7% | 117 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.1% | 32 |
| agd.Mooserwirt2 2.7 | 3.2 | 11.9% | 20 |
| ratosh.Nobo 0.21 | 4.5 | 10.4% | 3 |
| spinnercat.Robovirus 2.718 | 4.7 | 10.1% | 6 |
| uji.DBH 1.1 | 5.5 | 10.0% | 11 |
| sigterm.Sigterm 1.0 | 7.2 | 8.1% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.3% | 4 |
| stelo.WangRobot 1.0 | 9.0 | 6.2% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 74.9 | 17 / 35 | 3925 |
| 2 | 1 | 67.2 | 88.9 | 21 / 35 | 3842 |
| 3 | 1 | 64.6 | 78.7 | 17 / 35 | 3841 |
| 4 | 1 | 68.2 | 89.8 | 21 / 35 | 4575 |
| 5 | 1 | 68.8 | 91.7 | 22 / 35 | 4559 |
| 6 | 1 | 66.6 | 85.4 | 19 / 35 | 4138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 66% |
| sigterm.Sigterm 1.0 | 26 | 92% |
| agd.Mooserwirt2 2.7 | 25 | 84% |
| spinnercat.Robovirus 2.718 | 19 | 89% |
| uji.DBH 1.1 | 18 | 83% |
| ratosh.Nobo 0.21 | 10 | 90% |
| stelo.WangRobot 1.0 | 6 | 67% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 50% |

Hadur died in 93 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 31% | 60 |
| agd.Mooserwirt2 2.7 | 18 | 19% | 41 |
| stelo.WangRobot 1.0 | 16 | 17% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 10% | 15 |
| uji.DBH 1.1 | 7 | 8% | 19 |
| spinnercat.Robovirus 2.718 | 6 | 6% | 21 |
| sigterm.Sigterm 1.0 | 3 | 3% | 19 |
| ratosh.Nobo 0.21 | 3 | 3% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 3 |

## Melee bench: F19

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.2 | 149 / 210 | 1.70 | 19.9% | 30963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.9% | 149 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.3% | 28 |
| mld.Infinity 2.2 | 2.8 | 14.5% | 28 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.5% | 2 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.6% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.5% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 93.3 | 28 / 35 | 5532 |
| 2 | 1 | 70.7 | 93.3 | 24 / 35 | 5098 |
| 3 | 1 | 71.0 | 93.3 | 26 / 35 | 5178 |
| 4 | 1 | 71.0 | 94.6 | 24 / 35 | 5260 |
| 5 | 1 | 70.1 | 91.1 | 26 / 35 | 4800 |
| 6 | 1 | 69.3 | 87.6 | 21 / 35 | 5095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 74 | 85% |
| mld.Infinity 2.2 | 61 | 85% |
| krillr.mini.JointStrike 2.0.0 | 19 | 95% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| erdnis.Rover 0.3 | 4 | 100% |
| mbh.Mbh 0.1 | 4 | 100% |
| pac.ABC 2.1 | 3 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 24 | 39% | 82 |
| mld.Infinity 2.2 | 17 | 28% | 60 |
| krillr.mini.JointStrike 2.0.0 | 7 | 11% | 31 |
| patson.PatsonTestBot 1.0 | 6 | 10% | 11 |
| erdnis.Rover 0.3 | 4 | 7% | 14 |
| pbg.R2D2 1.0 | 2 | 3% | 3 |
| mbh.Mbh 0.1 | 1 | 2% | 6 |
| pac.ABC 2.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.3 | 107 / 210 | 1.96 | 19.0% | 30943 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.0% | 107 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.8% | 65 |
| nz.jdc.nano.GridFu 1.0 | 3.7 | 11.2% | 5 |
| fwb.Nine 1.0.1 | 3.8 | 11.4% | 18 |
| catcat20.Rabbit 0.001 | 4.7 | 9.5% | 10 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.2% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.2% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.9 | 15 / 35 | 5256 |
| 2 | 1 | 68.4 | 86.3 | 17 / 35 | 5184 |
| 3 | 1 | 67.5 | 87.3 | 14 / 35 | 4860 |
| 4 | 1 | 69.9 | 90.5 | 19 / 35 | 5421 |
| 5 | 1 | 68.1 | 88.3 | 19 / 35 | 4728 |
| 6 | 1 | 71.2 | 95.6 | 23 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 86 | 52% |
| fwb.Nine 1.0.1 | 28 | 79% |
| catcat20.Rabbit 0.001 | 18 | 83% |
| nz.jdc.nano.GridFu 1.0 | 13 | 92% |
| bayen.nut.Squirrel 1.615 | 9 | 78% |
| m3thos.mini.Eva01 0.5.5 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1115. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 60 | 58% | 96 |
| fwb.Nine 1.0.1 | 20 | 19% | 29 |
| nz.jdc.nano.GridFu 1.0 | 8 | 8% | 29 |
| catcat20.Rabbit 0.001 | 7 | 7% | 26 |
| bayen.nut.Squirrel 1.615 | 4 | 4% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 2 | 2% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 5 |

## Melee bench: F21

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 92.1 | 129 / 210 | 1.71 | 19.5% | 30239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.5% | 129 |
| eem.EvBot v4.6.16 | 2.0 | 15.6% | 54 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.5% | 8 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 12.1% | 9 |
| eld.Hmm 1.0 | 5.2 | 8.5% | 10 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.7% | 1 |
| el.JumpShoot 0.2 | 7.7 | 6.7% | 0 |
| fire219.CatBot 1.0 | 7.7 | 6.2% | 0 |
| arthord.MannyPacquiao Beta | 9.2 | 5.0% | 0 |
| PSW.Relentless 0.1 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 26 / 35 | 5451 |
| 2 | 1 | 70.8 | 94.6 | 25 / 35 | 5364 |
| 3 | 1 | 69.5 | 92.1 | 21 / 35 | 5060 |
| 4 | 1 | 70.3 | 93.3 | 21 / 35 | 5233 |
| 5 | 1 | 68.7 | 91.1 | 20 / 35 | 4674 |
| 6 | 1 | 67.4 | 87.3 | 16 / 35 | 4457 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 96 | 63% |
| dummy.mini.Scimitar 1.01 | 33 | 94% |
| cf.RiO.RiOx 4.2.1 | 25 | 92% |
| eld.Hmm 1.0 | 14 | 71% |
| el.JumpShoot 0.2 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1228. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 45 | 56% | 88 |
| dummy.mini.Scimitar 1.01 | 14 | 17% | 56 |
| cf.RiO.RiOx 4.2.1 | 11 | 14% | 24 |
| eld.Hmm 1.0 | 5 | 6% | 24 |
| el.JumpShoot 0.2 | 5 | 6% | 7 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| arthord.MannyPacquiao Beta | 0 | 0% | 3 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.4 | 89 / 210 | 2.13 | 17.7% | 27625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.3 | 17.7% | 89 |
| pe.SandboxDT 2.71m | 1.7 | 17.3% | 81 |
| kvk.HebusLeTroll 0.35 | 3.2 | 13.9% | 22 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.5% | 13 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 4 |
| tad.Dalek98 0.98 | 6.7 | 6.9% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.5% | 0 |
| yk.JahRoslav 1.1 | 7.2 | 6.7% | 1 |
| pbg.NinjaX 1.2 | 9.0 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 86.0 | 10 / 35 | 4608 |
| 2 | 1 | 68.9 | 91.4 | 20 / 35 | 4603 |
| 3 | 1 | 66.6 | 84.1 | 14 / 35 | 4371 |
| 4 | 1 | 67.4 | 85.7 | 14 / 35 | 4676 |
| 5 | 1 | 69.0 | 89.2 | 17 / 35 | 4862 |
| 6 | 2 | 67.3 | 87.9 | 14 / 35 | 4505 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 73 | 40% |
| kvk.HebusLeTroll 0.35 | 37 | 78% |
| jlm.javaDisturbance 0.59 | 27 | 74% |
| bigpete.Stewie 1.0 | 6 | 100% |
| yk.JahRoslav 1.1 | 4 | 75% |
| pbg.NinjaX 1.2 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 50 | 41% | 76 |
| kvk.HebusLeTroll 0.35 | 35 | 29% | 62 |
| jlm.javaDisturbance 0.59 | 23 | 19% | 47 |
| bigpete.Stewie 1.0 | 6 | 5% | 13 |
| tad.Dalek98 0.98 | 5 | 4% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.0 | 86 / 210 | 2.26 | 18.2% | 30956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.5 | 18.2% | 86 |
| pe.SandboxLump 1.52 | 1.5 | 17.7% | 82 |
| cre.Karolos 0.32 | 3.2 | 13.5% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.3% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 6 |
| cw.megas.Blade 0.8 | 7.0 | 8.1% | 1 |
| sample.Walls 1.0 | 7.8 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.0 | 18 / 35 | 5502 |
| 2 | 1 | 67.7 | 84.4 | 13 / 35 | 4692 |
| 3 | 2 | 68.0 | 86.0 | 11 / 35 | 5208 |
| 4 | 2 | 68.5 | 87.3 | 10 / 35 | 5181 |
| 5 | 1 | 69.5 | 87.9 | 17 / 35 | 5635 |
| 6 | 2 | 68.4 | 84.4 | 17 / 35 | 4738 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 87 | 45% |
| cre.Karolos 0.32 | 28 | 54% |
| stelo.AreaTargetingBot 1.1 | 19 | 79% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 83% |
| stelo.RamTrackSurfer 1.2 | 6 | 83% |
| sample.Walls 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 4 | 75% |

Hadur died in 124 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 69 | 56% | 104 |
| cre.Karolos 0.32 | 24 | 19% | 39 |
| stelo.AreaTargetingBot 1.1 | 14 | 11% | 30 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 6% | 11 |
| stelo.RamTrackSurfer 1.2 | 4 | 3% | 12 |
| cw.megas.Blade 0.8 | 3 | 2% | 4 |
| sample.Walls 1.0 | 2 | 2% | 9 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |

## Melee bench: F24

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 74.0 | 63 / 210 | 3.34 | 14.5% | 20191 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.5 | 14.5% | 63 |
| rz.GlowBlowMelee 1.4 | 2.5 | 13.9% | 36 |
| florent.XSeries.X2 0.12 | 2.5 | 13.7% | 43 |
| davidalves.Phoenix 0.54 | 3.8 | 12.5% | 31 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.3% | 19 |
| oog.melee.Corsair 1.0 | 6.3 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.8% | 10 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.5% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.2% | 1 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.9 | 16 / 35 | 3807 |
| 2 | 1 | 60.9 | 71.1 | 10 / 35 | 3068 |
| 3 | 3 | 59.8 | 67.9 | 8 / 35 | 3256 |
| 4 | 2 | 60.9 | 74.6 | 8 / 35 | 3086 |
| 5 | 1 | 62.3 | 73.7 | 11 / 35 | 3731 |
| 6 | 1 | 61.4 | 74.6 | 10 / 35 | 3243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 30 | 70% |
| florent.XSeries.X2 0.12 | 21 | 52% |
| davidalves.Phoenix 0.54 | 18 | 61% |
| stelo.SoJNanoMelee 1.1 | 11 | 82% |
| pedersen.Ugluk 1.1.1 | 8 | 50% |
| oog.melee.Corsair 1.0 | 7 | 86% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 37 | 25% | 60 |
| florent.XSeries.X2 0.12 | 37 | 25% | 48 |
| davidalves.Phoenix 0.54 | 26 | 18% | 34 |
| pedersen.Ugluk 1.1.1 | 19 | 13% | 22 |
| stelo.SoJNanoMelee 1.1 | 16 | 11% | 25 |
| oog.melee.Corsair 1.0 | 5 | 3% | 12 |
| evd.X1 0.01 | 4 | 3% | 4 |
| as.FrankTheTank 1.3 | 2 | 1% | 3 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |

## Melee bench: F25

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.8 | 121 / 210 | 2.46 | 17.7% | 23745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.7% | 121 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.6% | 26 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.0% | 19 |
| jdw.Hurricane 1.4 | 3.7 | 12.1% | 27 |
| gre.svman4.Morfeas 1.4.1 | 5.2 | 9.7% | 10 |
| ds.Oo 2.2 | 5.8 | 8.9% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.3% | 5 |
| awesomeness.Elite 1.0 | 7.7 | 7.3% | 0 |
| adt.Ar2 1.1 | 8.7 | 6.4% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 78.4 | 19 / 35 | 3984 |
| 2 | 1 | 67.2 | 86.3 | 20 / 35 | 3864 |
| 3 | 1 | 64.7 | 77.8 | 16 / 35 | 3711 |
| 4 | 1 | 67.3 | 85.7 | 21 / 35 | 4006 |
| 5 | 1 | 67.2 | 83.5 | 21 / 35 | 4078 |
| 6 | 1 | 68.9 | 90.8 | 24 / 35 | 4102 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 84% |
| voidious.micro.BlitzBat 1.05 | 46 | 85% |
| jdw.Hurricane 1.4 | 20 | 80% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 71% |
| ds.Oo 2.2 | 6 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| adt.Ar2 1.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 607. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 27 | 30% | 42 |
| voidious.mini.BrokenSword 2.0.3 | 22 | 25% | 58 |
| voidious.micro.BlitzBat 1.05 | 18 | 20% | 52 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 15 |
| ds.Oo 2.2 | 5 | 6% | 17 |
| gjr.Cephalosporin 0.1 | 4 | 4% | 11 |
| adt.Ar2 1.1 | 2 | 2% | 5 |
| awesomeness.Elite 1.0 | 2 | 2% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 3 |

## Melee bench: F26

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.8 | 100 / 210 | 2.28 | 17.9% | 30691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.9% | 100 |
| ak.Fermat 2.0 | 2.0 | 16.0% | 59 |
| shu.nitro.LENIN .T34 | 3.7 | 12.3% | 31 |
| lrem.Spectre 0.4.4 | 4.2 | 11.5% | 16 |
| js.PinBall 1.6 | 4.7 | 10.6% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.4% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 16 / 35 | 5299 |
| 2 | 1 | 69.7 | 89.8 | 20 / 35 | 5701 |
| 3 | 1 | 67.6 | 85.4 | 15 / 35 | 5066 |
| 4 | 1 | 68.2 | 85.7 | 18 / 35 | 5228 |
| 5 | 1 | 67.3 | 84.1 | 18 / 35 | 4735 |
| 6 | 1 | 66.1 | 81.9 | 13 / 35 | 4662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 61 | 56% |
| shu.nitro.LENIN .T34 | 34 | 65% |
| lrem.Spectre 0.4.4 | 25 | 80% |
| js.PinBall 1.6 | 13 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 55 | 50% | 91 |
| shu.nitro.LENIN .T34 | 29 | 26% | 54 |
| lrem.Spectre 0.4.4 | 16 | 15% | 28 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 3% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 7 |
| js.PinBall 1.6 | 2 | 2% | 15 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.9 | 130 / 210 | 2.18 | 18.4% | 25935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 18.4% | 130 |
| mk.Alpha 0.2.1 | 2.0 | 15.0% | 45 |
| wee.Gem 1.8.4 | 3.3 | 11.8% | 19 |
| EH.Eagle 1.0.6 | 4.0 | 10.6% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.3 | 9.7% | 9 |
| joe.ADinosaur 1.0 | 6.0 | 8.5% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 7.2 | 8.1% | 2 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.9% | 1 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.7% | 0 |
| cs.Grudge 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 83.8 | 19 / 35 | 3991 |
| 2 | 1 | 69.6 | 94.6 | 26 / 35 | 4204 |
| 3 | 1 | 69.4 | 94.6 | 27 / 35 | 4040 |
| 4 | 1 | 68.3 | 88.6 | 22 / 35 | 4409 |
| 5 | 1 | 66.4 | 85.4 | 19 / 35 | 3880 |
| 6 | 1 | 66.9 | 74.3 | 17 / 35 | 5411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 86 | 80% |
| wee.Gem 1.8.4 | 39 | 92% |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 91% |
| EH.Eagle 1.0.6 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 3 | 100% |
| throxbot.ThroxBot 0.1 | 2 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 44 | 55% | 108 |
| joe.ADinosaur 1.0 | 7 | 9% | 10 |
| wee.Gem 1.8.4 | 6 | 8% | 36 |
| EH.Eagle 1.0.6 | 6 | 8% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 6% | 19 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 6 |
| caimano.Furia_Ceca 0.22 | 3 | 4% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 7 |
| cs.Grudge 1.0 | 2 | 3% | 2 |

## Melee bench: F28

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 87.5 | 120 / 210 | 2.12 | 18.0% | 24226 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 18.0% | 120 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 41 |
| uji.Antique 1.0 | 3.3 | 12.4% | 23 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.8% | 14 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.3% | 7 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.4% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.8% | 1 |
| matt.advanced.Katana 1.0 | 8.0 | 6.5% | 1 |
| stelo.PianistNano 1.2 | 9.5 | 5.3% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 89.5 | 22 / 35 | 4150 |
| 2 | 1 | 68.0 | 89.2 | 21 / 35 | 4162 |
| 3 | 1 | 68.6 | 91.4 | 22 / 35 | 4025 |
| 4 | 1 | 66.5 | 85.1 | 21 / 35 | 3811 |
| 5 | 1 | 66.4 | 85.7 | 17 / 35 | 3736 |
| 6 | 1 | 66.5 | 84.1 | 17 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 82 | 74% |
| uji.Antique 1.0 | 42 | 88% |
| qohnil.blot.BlotBot 3.61 | 16 | 44% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 34 | 37% | 81 |
| amk.ChumbaWumba 0.3 | 15 | 16% | 27 |
| pfvicm.Sobieski 7.2.3b | 14 | 15% | 22 |
| uji.Antique 1.0 | 12 | 13% | 40 |
| qohnil.blot.BlotBot 3.61 | 9 | 10% | 24 |
| ahr.ice.Ice 1.0.2 | 3 | 3% | 7 |
| stelo.Lifestealer 1.0 | 2 | 2% | 3 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |

## Melee bench: F29

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 82.8 | 92 / 210 | 2.55 | 17.5% | 26097 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.5% | 92 |
| deewiant.Anomaly 0.2 | 2.3 | 14.5% | 48 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.9% | 48 |
| myl.micro.Troodon 1.10 | 4.3 | 11.9% | 8 |
| jok.PheonixM 0.1.2 | 4.7 | 11.1% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.6% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.9% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.6% | 0 |
| jangs.ns51 1.0 | 9.5 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.2 | 11 / 35 | 4263 |
| 2 | 1 | 67.3 | 84.8 | 16 / 35 | 4177 |
| 3 | 1 | 67.8 | 86.3 | 17 / 35 | 4219 |
| 4 | 1 | 68.8 | 87.3 | 20 / 35 | 4741 |
| 5 | 1 | 66.6 | 81.3 | 16 / 35 | 4306 |
| 6 | 1 | 65.0 | 74.9 | 12 / 35 | 4391 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 45 | 67% |
| zyx.mega.YersiniaPestis 3.1 | 42 | 62% |
| myl.micro.Troodon 1.10 | 23 | 83% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 39% | 77 |
| zyx.mega.YersiniaPestis 3.1 | 33 | 28% | 56 |
| myl.micro.Troodon 1.10 | 15 | 13% | 33 |
| ph.melee.ArcherME 0.3 | 12 | 10% | 15 |
| jok.PheonixM 0.1.2 | 9 | 8% | 19 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |
| jangs.ns51 1.0 | 1 | 1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.0 | 53 / 210 | 3.34 | 14.8% | 22901 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.5 | 14.8% | 53 |
| catcat20.Matcha 0.006 | 2.7 | 13.6% | 47 |
| darkcanuck.B26354 1.06 | 3.3 | 13.0% | 40 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.6% | 26 |
| oog.melee.Capulet 1.2 | 4.0 | 12.4% | 29 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.9% | 8 |
| ntc.Opposite 1.5 | 7.2 | 7.6% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.4% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 7.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 83.8 | 11 / 35 | 4040 |
| 2 | 2 | 61.9 | 70.8 | 8 / 35 | 3873 |
| 3 | 1 | 62.1 | 73.7 | 9 / 35 | 3807 |
| 4 | 2 | 61.7 | 73.0 | 8 / 35 | 3648 |
| 5 | 2 | 59.5 | 64.8 | 6 / 35 | 3750 |
| 6 | 1 | 63.8 | 77.8 | 11 / 35 | 3783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 26 | 58% |
| darkcanuck.B26354 1.06 | 19 | 53% |
| oog.melee.Capulet 1.2 | 15 | 73% |
| stelo.PastFuture 2.3.2 | 12 | 67% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| tripphippy.Alice 1.1 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 765. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 46 | 29% | 63 |
| darkcanuck.B26354 1.06 | 32 | 20% | 40 |
| stelo.PastFuture 2.3.2 | 28 | 18% | 38 |
| oog.melee.Capulet 1.2 | 20 | 13% | 32 |
| tripphippy.Alice 1.1 | 10 | 6% | 12 |
| ntc.Opposite 1.5 | 8 | 5% | 8 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 5 | 3% | 5 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 76.7 | 33 / 210 | 3.10 | 14.6% | 20415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.9% | 115 |
| hadur117.mini.DeiseCE 0.2 | 2.2 | 14.6% | 33 |
| gh.mini.Griezel 0.2 | 3.0 | 13.7% | 38 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.3% | 8 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.6% | 12 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.0% | 3 |
| fm.mammillarias 1.3 | 7.5 | 6.4% | 1 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.2% | 1 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 84.1 | 8 / 35 | 3522 |
| 2 | 2 | 62.0 | 74.9 | 4 / 35 | 3327 |
| 3 | 3 | 61.7 | 72.4 | 7 / 35 | 3331 |
| 4 | 2 | 63.1 | 79.4 | 4 / 35 | 3365 |
| 5 | 2 | 61.8 | 73.0 | 7 / 35 | 3218 |
| 6 | 2 | 62.3 | 76.5 | 3 / 35 | 3652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 27% |
| gh.mini.Griezel 0.2 | 26 | 35% |
| spinnercat.micro.Tyger 0.1 | 7 | 86% |
| d414.nano.Quantum 1.0.0 | 5 | 20% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| Gecko.ultimateGeckoBot 1.0 | 2 | 50% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 90 | 51% | 97 |
| gh.mini.Griezel 0.2 | 29 | 16% | 42 |
| d414.nano.Quantum 1.0.0 | 20 | 11% | 22 |
| spinnercat.micro.Tyger 0.1 | 15 | 8% | 21 |
| fm.mammillarias 1.3 | 10 | 6% | 10 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 5 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.8 | 122 / 210 | 2.10 | 18.3% | 27872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 18.3% | 122 |
| kawigi.sbf.FloodHT 0.9.2 | 2.2 | 14.5% | 48 |
| apc.botM 3.0 | 3.2 | 12.0% | 16 |
| lxx.ConceptA 0.8 | 4.2 | 10.6% | 4 |
| vjik.UnViolation 1.1 | 5.0 | 9.8% | 6 |
| bayen.UbaMicro 1.4 | 5.5 | 9.0% | 6 |
| panzer.Panzer 0.2 | 7.0 | 7.5% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.6% | 3 |
| donjezza.Jezza 1.0 | 9.0 | 6.0% | 5 |
| conscience.Electron 1.3g | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 79.4 | 18 / 35 | 4388 |
| 2 | 1 | 66.5 | 86.3 | 18 / 35 | 4261 |
| 3 | 1 | 68.8 | 90.8 | 22 / 35 | 4908 |
| 4 | 1 | 68.4 | 90.5 | 22 / 35 | 4683 |
| 5 | 1 | 67.9 | 89.5 | 21 / 35 | 4704 |
| 6 | 1 | 68.6 | 90.5 | 21 / 35 | 4928 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 68 | 71% |
| apc.botM 3.0 | 30 | 73% |
| lxx.ConceptA 0.8 | 20 | 90% |
| donjezza.Jezza 1.0 | 11 | 91% |
| vjik.UnViolation 1.1 | 9 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| yk.JahMicro 1.0 | 7 | 86% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 45% | 90 |
| lxx.ConceptA 0.8 | 21 | 24% | 29 |
| apc.botM 3.0 | 13 | 15% | 37 |
| bayen.UbaMicro 1.4 | 4 | 5% | 12 |
| panzer.Panzer 0.2 | 4 | 5% | 5 |
| yk.JahMicro 1.0 | 3 | 3% | 10 |
| vjik.UnViolation 1.1 | 2 | 2% | 16 |
| donjezza.Jezza 1.0 | 1 | 1% | 8 |
| conscience.Electron 1.3g | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 81.5 | 87 / 210 | 2.67 | 17.2% | 26767 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.5 | 17.2% | 87 |
| maribo.Quester 0.3 | 1.5 | 16.7% | 61 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.5 | 12.1% | 19 |
| labg.Cataclysm 2.05 | 3.7 | 11.5% | 21 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.5% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.5% | 3 |
| baal.nano.N 1.42 | 6.5 | 8.6% | 2 |
| zyx.micro.Ant 1.1 | 8.0 | 6.0% | 1 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.7 | 14 / 35 | 4761 |
| 2 | 2 | 65.9 | 80.6 | 10 / 35 | 4563 |
| 3 | 1 | 67.2 | 81.3 | 16 / 35 | 4821 |
| 4 | 1 | 67.2 | 82.5 | 18 / 35 | 4543 |
| 5 | 2 | 66.1 | 81.3 | 18 / 35 | 3911 |
| 6 | 2 | 64.4 | 77.5 | 11 / 35 | 4168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 57 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 26 | 73% |
| gre.svman4.Leonidas 1.3.2 | 18 | 72% |
| labg.Cataclysm 2.05 | 10 | 70% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 4 | 75% |
| zyx.micro.Ant 1.1 | 2 | 50% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 50 | 40% | 81 |
| gre.svman4.Leonidas 1.3.2 | 16 | 13% | 23 |
| labg.Cataclysm 2.05 | 15 | 12% | 27 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 10% | 36 |
| zyx.micro.Ant 1.1 | 13 | 10% | 17 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 6% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 4% | 7 |
| baal.nano.N 1.42 | 4 | 3% | 8 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 83.2 | 71 / 210 | 2.51 | 17.1% | 28437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.7 | 17.1% | 71 |
| kid.Gladiator .7.2 | 2.2 | 16.2% | 55 |
| stelo.Spread 0.9 | 2.2 | 16.0% | 67 |
| jcs.Seth 1.8 | 4.8 | 10.4% | 7 |
| tcf.Reach 3 | 4.8 | 10.6% | 8 |
| cli.Dancer 1.1 | 5.3 | 10.2% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.4% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 84.1 | 13 / 35 | 4680 |
| 2 | 3 | 64.7 | 76.2 | 7 / 35 | 4566 |
| 3 | 1 | 65.9 | 82.2 | 12 / 35 | 4453 |
| 4 | 1 | 67.7 | 85.1 | 13 / 35 | 4709 |
| 5 | 2 | 67.3 | 83.2 | 7 / 35 | 5337 |
| 6 | 1 | 68.6 | 88.6 | 19 / 35 | 4692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 65 | 42% |
| kid.Gladiator .7.2 | 50 | 46% |
| jcs.Seth 1.8 | 13 | 85% |
| tcf.Reach 3 | 7 | 57% |
| ratosh.Wesco 1.4 | 3 | 67% |
| cli.Dancer 1.1 | 3 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 62 | 45% | 89 |
| kid.Gladiator .7.2 | 50 | 36% | 66 |
| tcf.Reach 3 | 10 | 7% | 15 |
| jcs.Seth 1.8 | 8 | 6% | 21 |
| ratosh.Wesco 1.4 | 5 | 4% | 7 |
| sample.RamFire 1.0 | 2 | 1% | 2 |
| cli.Dancer 1.1 | 1 | 1% | 6 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F35

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 74.8 | 29 / 210 | 3.27 | 14.0% | 19453 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.6% | 145 |
| hadur117.mini.DeiseCE 0.2 | 2.3 | 14.0% | 29 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 16 |
| rz.HawkOnFire 0.1 | 4.0 | 12.0% | 7 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.5% | 12 |
| wit.Chuliath 1.0 | 6.3 | 7.3% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.3% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 79.0 | 9 / 35 | 3814 |
| 2 | 3 | 58.8 | 68.9 | 0 / 35 | 2859 |
| 3 | 2 | 63.2 | 78.4 | 5 / 35 | 3641 |
| 4 | 2 | 61.3 | 73.7 | 4 / 35 | 3078 |
| 5 | 3 | 59.9 | 71.7 | 5 / 35 | 2843 |
| 6 | 2 | 61.9 | 77.1 | 6 / 35 | 3218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 42 | 14% |
| gh.mini.Gruwel 0.9 | 14 | 36% |
| rz.HawkOnFire 0.1 | 11 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 6 | 67% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| dans.Cinnamon 1.2 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 97 | 54% | 104 |
| rz.HawkOnFire 0.1 | 24 | 13% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 12% | 25 |
| gh.mini.Gruwel 0.9 | 21 | 12% | 27 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 4% | 8 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| dans.Cinnamon 1.2 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 3 |

## Melee bench: F36

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.1 | 172 / 210 | 1.53 | 21.1% | 31878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 21.1% | 172 |
| alpha.RainingFire 1.0 | 2.5 | 11.7% | 11 |
| bzdp.Pansy 2.1 | 3.2 | 11.6% | 11 |
| bvh.micro.Freya 0.3 | 4.0 | 10.6% | 4 |
| mz.Cork 0.1 | 5.0 | 10.4% | 5 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.5% | 4 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.2% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.1% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.3% | 2 |
| dl.BetterWalls 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 96.2 | 30 / 35 | 5253 |
| 2 | 1 | 71.1 | 93.0 | 27 / 35 | 5569 |
| 3 | 1 | 72.0 | 95.6 | 30 / 35 | 5707 |
| 4 | 1 | 70.5 | 91.4 | 27 / 35 | 5239 |
| 5 | 1 | 70.9 | 94.3 | 29 / 35 | 4932 |
| 6 | 1 | 71.1 | 94.0 | 29 / 35 | 5178 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 98% |
| bvh.micro.Freya 0.3 | 41 | 98% |
| bvh.mini.Fenrir 0.39 | 24 | 92% |
| mz.Cork 0.1 | 23 | 91% |
| alpha.RainingFire 1.0 | 23 | 87% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| squidM.TentalceMeleeNano 1.1 | 3 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 11 | 29% | 39 |
| bzdp.Pansy 2.1 | 9 | 24% | 46 |
| bvh.mini.Fenrir 0.39 | 5 | 13% | 15 |
| mz.Cork 0.1 | 4 | 11% | 29 |
| m3thos.Eva02 0.7.1 | 4 | 11% | 27 |
| sample.MyFirstRobot 1.0 | 3 | 8% | 12 |
| bvh.micro.Freya 0.3 | 1 | 3% | 25 |
| dl.BetterWalls 1.0 | 1 | 3% | 10 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |

## Melee bench: F37

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 85.2 | 135 / 210 | 2.33 | 18.1% | 30646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 18.1% | 135 |
| germ.TheMind .2 | 2.2 | 11.9% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.3 | 10.0% | 9 |
| EBBU.Sim2 1.02 | 4.5 | 9.9% | 9 |
| stelo.UntouchableNano 1.3 | 5.2 | 9.2% | 13 |
| skm.Ryubot 1.0 | 7.0 | 8.5% | 4 |
| agrach.Dalek 1.0 | 7.2 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.5 | 8.2% | 0 |
| mb.Beast 0.1 | 8.0 | 7.9% | 12 |
| lmk.ACPFinal 0.1 | 8.2 | 7.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 87.6 | 24 / 35 | 4880 |
| 2 | 1 | 67.7 | 88.3 | 25 / 35 | 5122 |
| 3 | 1 | 65.4 | 82.5 | 21 / 35 | 4777 |
| 4 | 1 | 67.9 | 88.6 | 26 / 35 | 5211 |
| 5 | 1 | 67.7 | 87.0 | 22 / 35 | 5683 |
| 6 | 1 | 64.2 | 77.5 | 17 / 35 | 4973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 36 | 94% |
| skm.Ryubot 1.0 | 22 | 100% |
| EBBU.Sim2 1.02 | 19 | 89% |
| mb.Beast 0.1 | 15 | 100% |
| agrach.Dalek 1.0 | 14 | 93% |
| stelo.UntouchableNano 1.3 | 14 | 79% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 92% |
| lmk.ACPFinal 0.1 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 436. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 21 | 27% | 52 |
| EBBU.Sim2 1.02 | 15 | 19% | 28 |
| com.syncleus.robocode.Dreadnaught 0.1 | 8 | 10% | 32 |
| agrach.Dalek 1.0 | 8 | 10% | 24 |
| stelo.UntouchableNano 1.3 | 8 | 10% | 16 |
| mb.Beast 0.1 | 7 | 9% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 5% | 8 |
| skm.Ryubot 1.0 | 3 | 4% | 19 |
| lmk.ACPFinal 0.1 | 3 | 4% | 13 |

## Melee bench: F38

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.4 | 65 / 210 | 3.03 | 15.5% | 23970 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.5% | 82 |
| hadur117.mini.DeiseCE 0.2 | 1.8 | 15.5% | 65 |
| bvh.mini.Freya 0.55 | 3.5 | 12.5% | 15 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.5% | 27 |
| cs.Wren 1.0 | 5.3 | 10.1% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.6% | 7 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.4% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.8 | 6.4% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.5% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 81.0 | 15 / 35 | 4298 |
| 2 | 2 | 64.6 | 79.4 | 12 / 35 | 3941 |
| 3 | 2 | 63.1 | 75.6 | 12 / 35 | 3759 |
| 4 | 2 | 60.8 | 71.1 | 4 / 35 | 3984 |
| 5 | 2 | 62.7 | 74.3 | 9 / 35 | 3845 |
| 6 | 2 | 65.4 | 83.2 | 13 / 35 | 4143 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 48% |
| bvh.mini.Freya 0.55 | 14 | 86% |
| bts.mega.Gnarly 1.4 | 14 | 43% |
| cs.Wren 1.0 | 11 | 82% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |

Hadur died in 145 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 54 | 37% | 79 |
| bvh.mini.Freya 0.55 | 29 | 20% | 39 |
| bts.mega.Gnarly 1.4 | 23 | 16% | 31 |
| cs.Wren 1.0 | 13 | 9% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 8% | 23 |
| kdf.KoulDestroyer 1.0 | 10 | 7% | 13 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 4 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.1 | 96 / 210 | 2.34 | 17.4% | 27174 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.4% | 96 |
| bvh.fry.Freya 0.82 | 2.2 | 14.8% | 27 |
| az.Ololobot 0.2.4 | 2.8 | 12.9% | 55 |
| catcat20.Lambda 0.024 | 4.2 | 11.0% | 19 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.5% | 4 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.4% | 6 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.1% | 1 |
| gimp.GimpBot 0.1 | 7.5 | 7.5% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 86.3 | 19 / 35 | 4333 |
| 2 | 1 | 66.0 | 83.5 | 16 / 35 | 4644 |
| 3 | 1 | 66.1 | 84.8 | 14 / 35 | 4597 |
| 4 | 1 | 65.4 | 82.2 | 17 / 35 | 4515 |
| 5 | 1 | 65.7 | 84.4 | 12 / 35 | 4433 |
| 6 | 1 | 67.6 | 89.2 | 18 / 35 | 4652 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 41% |
| bvh.fry.Freya 0.82 | 39 | 77% |
| catcat20.Lambda 0.024 | 32 | 69% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1064. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 37 | 32% | 61 |
| bvh.fry.Freya 0.82 | 34 | 30% | 58 |
| catcat20.Lambda 0.024 | 19 | 17% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 12% | 21 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 9 |
| gimp.GimpBot 0.1 | 3 | 3% | 10 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 8 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.6 | 113 / 210 | 2.48 | 17.9% | 27190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.9% | 113 |
| kawigi.mini.Coriantumr 1.1 | 2.3 | 14.5% | 45 |
| kano.gamma.KanoGamma 1.8 | 2.7 | 12.8% | 25 |
| mz.AntiGrav 1.0 | 4.2 | 11.4% | 9 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.2% | 9 |
| alpha.BlackIce 1.0 | 6.2 | 9.0% | 2 |
| stelo.Randomness 1.0 | 6.7 | 8.1% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.5% | 2 |
| testantiswapgun.AntiSwap 1.0 | 9.3 | 5.3% | 1 |
| sample.Corners 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.5 | 16 / 35 | 4618 |
| 2 | 1 | 67.3 | 83.5 | 21 / 35 | 4309 |
| 3 | 1 | 67.8 | 85.1 | 22 / 35 | 4652 |
| 4 | 1 | 67.9 | 83.5 | 23 / 35 | 4714 |
| 5 | 1 | 67.5 | 82.9 | 17 / 35 | 4533 |
| 6 | 1 | 66.4 | 83.2 | 14 / 35 | 4364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 69% |
| kano.gamma.KanoGamma 1.8 | 41 | 71% |
| mz.AntiGrav 1.0 | 25 | 100% |
| Polkwane.SmashMelee 1.0 | 15 | 93% |
| stelo.Randomness 1.0 | 6 | 83% |
| alpha.BlackIce 1.0 | 5 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 0% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 31 | 32% | 53 |
| kano.gamma.KanoGamma 1.8 | 26 | 27% | 57 |
| mz.AntiGrav 1.0 | 11 | 11% | 41 |
| Polkwane.SmashMelee 1.0 | 9 | 9% | 14 |
| alpha.BlackIce 1.0 | 8 | 8% | 14 |
| stelo.Randomness 1.0 | 5 | 5% | 15 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 5 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 8 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 87.7 | 118 / 210 | 2.10 | 17.8% | 23488 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.8% | 118 |
| eem.EvBotNG v12.8 | 2.0 | 15.5% | 54 |
| ary.Swarm 1.1 | 3.3 | 12.7% | 12 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 14 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.9% | 9 |
| shrub.Silver v048 | 6.0 | 9.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.8% | 2 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.5 | 23 / 35 | 3989 |
| 2 | 1 | 68.7 | 90.8 | 20 / 35 | 4170 |
| 3 | 1 | 67.6 | 86.7 | 19 / 35 | 4054 |
| 4 | 1 | 66.6 | 85.7 | 17 / 35 | 3461 |
| 5 | 1 | 67.5 | 87.6 | 19 / 35 | 3963 |
| 6 | 1 | 67.1 | 86.0 | 20 / 35 | 3851 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 61% |
| lessonz.robocode.Oz 0.5.0 | 38 | 84% |
| ary.Swarm 1.1 | 30 | 80% |
| simonton.nano.MeleeSeed 1.8 | 24 | 92% |
| shrub.Silver v048 | 3 | 67% |
| jsal.Jsalbot 1.0 | 2 | 50% |

Hadur died in 93 of 210 rounds, at a mean tick of 895. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 41 | 44% | 81 |
| ary.Swarm 1.1 | 19 | 20% | 50 |
| lessonz.robocode.Oz 0.5.0 | 14 | 15% | 32 |
| simonton.nano.MeleeSeed 1.8 | 7 | 8% | 27 |
| shrub.Silver v048 | 6 | 6% | 10 |
| zyx.nano.Ant 1.1 | 4 | 4% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 1 | 1% | 2 |

## Melee bench: F42

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.6 | 88 / 210 | 2.20 | 17.8% | 29206 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 17.8% | 88 |
| wompi.Wallaby 5.1 | 2.0 | 15.9% | 59 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.3% | 26 |
| ara.Shera 0.88 | 3.7 | 13.1% | 29 |
| amz.NanoClone 1.41 | 5.2 | 9.2% | 1 |
| maribo.IotaCT 1.1 | 6.7 | 7.4% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.1% | 5 |
| stelo.MirrorMicro 1.0 | 7.5 | 6.3% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 85.7 | 14 / 35 | 4954 |
| 2 | 1 | 65.7 | 82.5 | 10 / 35 | 4646 |
| 3 | 1 | 69.6 | 93.0 | 22 / 35 | 5113 |
| 4 | 1 | 67.2 | 85.4 | 12 / 35 | 5082 |
| 5 | 1 | 67.5 | 85.7 | 16 / 35 | 4810 |
| 6 | 1 | 66.9 | 87.3 | 14 / 35 | 4601 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 67 | 54% |
| maribo.mini.MiniQuester 0.1 | 39 | 72% |
| ara.Shera 0.88 | 31 | 61% |
| dsw.StaticD 1.0 | 6 | 83% |
| maribo.IotaCT 1.1 | 1 | 0% |
| amz.NanoClone 1.41 | 1 | 0% |
| stelo.MirrorMicro 1.0 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 58 | 48% | 97 |
| maribo.mini.MiniQuester 0.1 | 27 | 22% | 56 |
| ara.Shera 0.88 | 21 | 17% | 37 |
| amz.NanoClone 1.41 | 7 | 6% | 7 |
| maribo.IotaCT 1.1 | 5 | 4% | 5 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |

## Melee bench: F43

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 72.8 | 31 / 210 | 3.45 | 14.0% | 21136 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 156 |
| hadur117.mini.DeiseCE 0.2 | 2.2 | 14.0% | 31 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.4% | 15 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 11.3% | 4 |
| dummy.micro.Sparrow 2.5 | 4.5 | 10.9% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.9% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 78.4 | 8 / 35 | 3582 |
| 2 | 2 | 63.4 | 74.3 | 4 / 35 | 3786 |
| 3 | 2 | 62.1 | 70.2 | 5 / 35 | 3549 |
| 4 | 2 | 62.1 | 70.8 | 6 / 35 | 3340 |
| 5 | 2 | 64.2 | 78.4 | 4 / 35 | 3710 |
| 6 | 3 | 59.8 | 64.4 | 4 / 35 | 3169 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 55 | 18% |
| brainfade.melee.Dusk 0.44 | 12 | 67% |
| dummy.micro.Sparrow 2.5 | 8 | 88% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| jab.DiamondStealer 5 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 127 | 71% | 138 |
| brainfade.melee.Dusk 0.44 | 14 | 8% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 17 |
| dummy.micro.Sparrow 2.5 | 11 | 6% | 15 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 8 |
| mz.NanoGod 2.02 | 3 | 2% | 4 |
| cvt.Firsty 1.0 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 88.7 | 124 / 210 | 2.01 | 19.0% | 29412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.0% | 124 |
| stelo.Liblix 0.3.1 | 2.2 | 14.9% | 52 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 23 |
| wompi.Quokka 1.6 | 4.0 | 10.7% | 3 |
| jwirde.Gort 2.0 | 5.3 | 9.2% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 8.8% | 0 |
| disan.Chair 2.2.0 | 7.0 | 7.1% | 1 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 5.2% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.3 | 19 / 35 | 4970 |
| 2 | 1 | 68.9 | 88.6 | 23 / 35 | 4974 |
| 3 | 1 | 68.4 | 87.6 | 20 / 35 | 4551 |
| 4 | 1 | 68.5 | 87.0 | 19 / 35 | 4999 |
| 5 | 1 | 69.2 | 89.5 | 21 / 35 | 4944 |
| 6 | 1 | 69.8 | 91.4 | 22 / 35 | 4974 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 64% |
| tzu.TheArtOfWar 1.2 | 59 | 85% |
| wompi.Quokka 1.6 | 11 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| jwirde.Gort 2.0 | 7 | 71% |
| disan.Chair 2.2.0 | 7 | 86% |
| stf.PanzerGeneral 0.1 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 885. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 33 | 38% | 81 |
| tzu.TheArtOfWar 1.2 | 29 | 34% | 74 |
| wompi.Quokka 1.6 | 7 | 8% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 10 |
| disan.Chair 2.2.0 | 4 | 5% | 9 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 6 |
| jwirde.Gort 2.0 | 2 | 2% | 7 |
| sample.Crazy 1.0 | 2 | 2% | 3 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 5 |

## Melee bench: F45

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.4 | 85 / 210 | 2.13 | 19.4% | 34116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseCE 0.2 | 1.0 | 19.4% | 85 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 13.3% | 99 |
| jje.BagPuss 1.2 | 3.3 | 11.6% | 12 |
| sul.Lunar 1.1 | 4.2 | 10.6% | 5 |
| myl.nano.Graviton 1.10 | 4.3 | 10.5% | 3 |
| fm.claire 1.7 | 6.8 | 8.0% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 7.6% | 3 |
| wit.Deep7 2.0 | 9.2 | 5.6% | 2 |
| abud.ThirdRobo 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 86.7 | 17 / 35 | 5966 |
| 2 | 1 | 69.3 | 90.5 | 13 / 35 | 5483 |
| 3 | 1 | 70.1 | 90.8 | 12 / 35 | 6049 |
| 4 | 1 | 70.0 | 90.2 | 17 / 35 | 5773 |
| 5 | 1 | 67.1 | 81.9 | 12 / 35 | 5323 |
| 6 | 1 | 68.1 | 84.4 | 14 / 35 | 5522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 123 | 41% |
| sul.Lunar 1.1 | 13 | 85% |
| jje.BagPuss 1.2 | 12 | 42% |
| myl.nano.Graviton 1.10 | 10 | 90% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 1993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 71 | 57% | 0 |
| jje.BagPuss 1.2 | 18 | 14% | 41 |
| myl.nano.Graviton 1.10 | 15 | 12% | 52 |
| sul.Lunar 1.1 | 11 | 9% | 60 |
| hvilela.HVilela 0.9 | 5 | 4% | 14 |
| pez.mini.ChironexFleckeri 0.5 | 2 | 2% | 12 |
| fm.claire 1.7 | 2 | 2% | 10 |
| wit.Deep7 2.0 | 1 | 1% | 16 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseCE 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.0 | 27 / 210 | 3.34 | 14.5% | 24186 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.3% | 96 |
| kc.mini.Mirage 0.2 | 1.7 | 17.1% | 74 |
| hadur117.mini.DeiseCE 0.2 | 3.0 | 14.5% | 27 |
| mz.MicroSheep 1.0 | 4.3 | 10.6% | 1 |
| cx.Princess 1.0 | 5.2 | 9.8% | 8 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 3 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.2% | 1 |
| kurios.DOSexe .9a | 9.2 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 72.7 | 3 / 35 | 4177 |
| 2 | 3 | 63.7 | 78.1 | 7 / 35 | 3791 |
| 3 | 3 | 63.1 | 74.6 | 3 / 35 | 4310 |
| 4 | 3 | 62.2 | 73.7 | 7 / 35 | 3918 |
| 5 | 3 | 60.4 | 68.9 | 2 / 35 | 3650 |
| 6 | 3 | 63.8 | 76.2 | 5 / 35 | 4340 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 35 | 26% |
| rsalesc.melee.Medina 0.4.5 | 21 | 24% |
| mz.MicroSheep 1.0 | 7 | 100% |
| cx.Princess 1.0 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 68 | 37% | 74 |
| kc.mini.Mirage 0.2 | 67 | 37% | 77 |
| cx.Princess 1.0 | 20 | 11% | 23 |
| mz.MicroSheep 1.0 | 11 | 6% | 17 |
| arthord.NanoSatanMelee Beta | 6 | 3% | 7 |
| sadoner.killer 0.2 | 6 | 3% | 6 |
| mbro.Detektor3 0.1.1 | 3 | 2% | 3 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

