# Bench suite: suite.txt

## Melee bench: F01

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.7 | 33 / 210 | 3.28 | 15.3% | 28883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.6% | 150 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.3% | 33 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.3 | 11.8% | 7 |
| sgp.JollyNinja 3.53 | 4.2 | 10.9% | 8 |
| mz.MicroGodMelee 1 | 4.7 | 10.0% | 9 |
| lorneswork.Predator 1.0 | 6.0 | 9.5% | 2 |
| adt.Ar2 1.0 | 6.8 | 8.3% | 1 |
| skm.butterfly 1.0 | 8.3 | 4.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.7 | 5.4% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 69.8 | 2 / 35 | 4911 |
| 2 | 2 | 63.0 | 72.1 | 4 / 35 | 4544 |
| 3 | 2 | 65.7 | 81.0 | 5 / 35 | 5041 |
| 4 | 2 | 65.2 | 77.1 | 9 / 35 | 4679 |
| 5 | 2 | 63.8 | 71.4 | 8 / 35 | 4864 |
| 6 | 2 | 64.4 | 76.8 | 5 / 35 | 4844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 91 | 11% |
| mz.MicroGodMelee 1 | 11 | 36% |
| sgp.JollyNinja 3.53 | 9 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 86% |
| lorneswork.Predator 1.0 | 3 | 100% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 66% | 129 |
| mz.MicroGodMelee 1 | 18 | 10% | 25 |
| simonton.nano.WeekendObsession_Melee 1.0 | 17 | 10% | 20 |
| sgp.JollyNinja 3.53 | 9 | 5% | 14 |
| lorneswork.Predator 1.0 | 7 | 4% | 12 |
| skm.butterfly 1.0 | 6 | 3% | 8 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 1 | 1% | 0 |

## Melee bench: F02

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.7 | 90 / 210 | 2.73 | 17.8% | 31013 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 90 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.0% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 12.5% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.5% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 9.9% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.7% | 1 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 12 |
| sch.Simone 0.3d | 7.0 | 7.8% | 9 |
| stelo.PatternRobot 1.0 | 8.7 | 6.7% | 3 |
| fullsail.SweetTea 1.1 | 10.0 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 84.1 | 20 / 35 | 5128 |
| 2 | 1 | 68.5 | 85.1 | 20 / 35 | 5261 |
| 3 | 1 | 64.2 | 74.0 | 8 / 35 | 4967 |
| 4 | 1 | 68.2 | 87.3 | 14 / 35 | 5555 |
| 5 | 1 | 66.6 | 79.7 | 16 / 35 | 5237 |
| 6 | 1 | 64.3 | 74.3 | 12 / 35 | 4865 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 62% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 31 | 45% |
| Noran.BitchingElk 0.054 | 15 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 70% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| sch.Simone 0.3d | 7 | 86% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 39 | 33% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 38 | 32% | 58 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 9% | 15 |
| stelo.PatternRobot 1.0 | 10 | 8% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 8% | 24 |
| Noran.BitchingElk 0.054 | 5 | 4% | 18 |
| sch.Simone 0.3d | 4 | 3% | 9 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 6 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 77.1 | 120 / 210 | 3.06 | 17.5% | 33425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.5% | 120 |
| radnor.DoctorBob 1.42 | 2.0 | 14.5% | 40 |
| vuen.Cake 2.51 | 3.5 | 12.8% | 19 |
| kawigi.nano.Lib 1.0 | 3.7 | 12.2% | 20 |
| urdos.URDOS 1.3 | 4.8 | 10.0% | 8 |
| adt.Ar1 2.1 | 6.3 | 8.0% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 7.0% | 1 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 77.5 | 21 / 35 | 5281 |
| 2 | 1 | 64.1 | 67.6 | 18 / 35 | 5348 |
| 3 | 1 | 68.9 | 82.5 | 25 / 35 | 6179 |
| 4 | 1 | 67.4 | 80.0 | 20 / 35 | 5868 |
| 5 | 1 | 67.9 | 83.8 | 19 / 35 | 5653 |
| 6 | 1 | 64.5 | 71.4 | 17 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 50 | 88% |
| kawigi.nano.Lib 1.0 | 38 | 92% |
| radnor.DoctorBob 1.42 | 38 | 84% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 507. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 20 | 22% | 59 |
| kawigi.nano.Lib 1.0 | 18 | 20% | 52 |
| vuen.Cake 2.51 | 14 | 16% | 50 |
| bwbaugh.nano.Tirunculus 0.0.0a | 12 | 13% | 12 |
| urdos.URDOS 1.3 | 9 | 10% | 11 |
| adt.Ar1 2.1 | 8 | 9% | 9 |
| oa.weak.FlyMk1 0.1 | 4 | 4% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 3% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 2% | 5 |

## Melee bench: F04

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 74.6 | 9 / 210 | 3.29 | 15.6% | 32486 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 187 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.6% | 9 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 9 |
| josago.Jorgito 0.16 | 4.5 | 9.5% | 2 |
| TNT.TNT 0.99.1 | 4.5 | 10.5% | 2 |
| tj.zombie1n 1.0.1 | 6.5 | 6.6% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.7% | 0 |
| spin.Bugstard 0.012b | 9.3 | 4.2% | 1 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 72.1 | 1 / 35 | 5288 |
| 2 | 2 | 64.3 | 73.3 | 0 / 35 | 5300 |
| 3 | 2 | 66.4 | 79.0 | 2 / 35 | 5679 |
| 4 | 2 | 64.1 | 69.2 | 2 / 35 | 5228 |
| 5 | 2 | 65.5 | 77.1 | 1 / 35 | 5249 |
| 6 | 2 | 66.3 | 76.5 | 3 / 35 | 5742 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 72 | 1% |
| apc.LeeroyJenkins2 1.0 | 7 | 57% |
| TNT.TNT 0.99.1 | 3 | 67% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 201 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 71% | 144 |
| apc.LeeroyJenkins2 1.0 | 25 | 12% | 29 |
| josago.Jorgito 0.16 | 15 | 7% | 15 |
| TNT.TNT 0.99.1 | 8 | 4% | 10 |
| css.Delitioner 0.11 | 5 | 2% | 6 |
| tj.zombie1n 1.0.1 | 3 | 1% | 2 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.5 | 62.1 | 16 / 210 | 4.41 | 12.9% | 25054 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 17.4% | 99 |
| justin.DemonicRage 3.4 | 1.7 | 16.7% | 66 |
| wompi.Numbat 2.1 | 3.3 | 13.3% | 23 |
| hadur117.micro.Saor 0.2 | 3.7 | 12.9% | 16 |
| axeBots.HataMoto 3.09 | 5.3 | 9.4% | 5 |
| ms.Ares 0.19 | 5.7 | 9.0% | 1 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 5.1% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.9 | 61.6 | 1 / 35 | 4155 |
| 2 | 3 | 63.1 | 69.8 | 4 / 35 | 4859 |
| 3 | 4 | 58.4 | 57.8 | 1 / 35 | 4245 |
| 4 | 3 | 59.0 | 61.6 | 3 / 35 | 3911 |
| 5 | 4 | 57.1 | 56.5 | 3 / 35 | 3769 |
| 6 | 4 | 60.6 | 65.1 | 4 / 35 | 4115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Numbat 2.1 | 19 | 53% |
| justin.DemonicRage 3.4 | 17 | 0% |
| cb.fire.Firestarter 2.0f | 14 | 7% |
| axeBots.HataMoto 3.09 | 5 | 80% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 649. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 57 | 29% | 57 |
| cb.fire.Firestarter 2.0f | 52 | 27% | 54 |
| wompi.Numbat 2.1 | 38 | 20% | 47 |
| axeBots.HataMoto 3.09 | 14 | 7% | 17 |
| ms.Ares 0.19 | 12 | 6% | 14 |
| davidalves.net.DuelistMicroMelee 1.4 | 8 | 4% | 8 |
| supersample.SuperBoxBot 1.0 | 7 | 4% | 7 |
| GarmBox.Oranges 1.0 | 5 | 3% | 5 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.0 | 100 / 210 | 2.89 | 17.3% | 28685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.3% | 100 |
| jekl.StoneGhost 0.7 | 2.2 | 14.7% | 25 |
| origin.SleepSiphon 1.7b | 3.0 | 13.1% | 54 |
| mld.Wisdom 1.0 | 4.3 | 11.4% | 6 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.4% | 14 |
| gg.Wolverine 2.0 | 6.3 | 8.1% | 5 |
| spinnercat.Omen 1.0 | 7.5 | 7.1% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.8% | 7 |
| DBall.NUKE 0.1 | 8.5 | 6.4% | 0 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.4 | 13 / 35 | 5061 |
| 2 | 1 | 68.0 | 86.0 | 18 / 35 | 4851 |
| 3 | 1 | 64.4 | 70.8 | 17 / 35 | 4390 |
| 4 | 1 | 68.9 | 86.7 | 20 / 35 | 5241 |
| 5 | 1 | 65.3 | 76.5 | 13 / 35 | 4587 |
| 6 | 1 | 65.6 | 74.6 | 19 / 35 | 4555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 48 | 88% |
| origin.SleepSiphon 1.7b | 37 | 43% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 84% |
| gg.Wolverine 2.0 | 9 | 67% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 40% |
| mld.Wisdom 1.0 | 4 | 50% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 33 | 30% | 54 |
| jekl.StoneGhost 0.7 | 25 | 23% | 58 |
| mld.Wisdom 1.0 | 21 | 19% | 27 |
| pe.minimelee.SandboxMiniMelee 1.1 | 12 | 11% | 36 |
| ers.nano.hawk.HawkLA 3.0m | 7 | 6% | 12 |
| gg.Wolverine 2.0 | 6 | 5% | 11 |
| sample.Fire 1.0 | 4 | 4% | 4 |
| DBall.NUKE 0.1 | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 3 |

## Melee bench: F07

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 80.8 | 64 / 210 | 2.72 | 17.9% | 35522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.7 | 17.9% | 64 |
| rsalesc.melee.Monk 0.3.6c | 1.7 | 17.7% | 68 |
| rtk.Tachikoma 1.0 | 2.7 | 16.0% | 50 |
| franzor.Lizt 1.3.1 | 4.2 | 11.2% | 18 |
| oog.melee.CapuletDroid 1.1 | 5.0 | 10.0% | 10 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.9% | 1 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.8% | 1 |
| sample.Target 1.0 | 9.2 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 85.7 | 13 / 35 | 6587 |
| 2 | 2 | 68.1 | 79.0 | 10 / 35 | 5998 |
| 3 | 2 | 67.8 | 79.4 | 9 / 35 | 5751 |
| 4 | 1 | 69.1 | 83.5 | 10 / 35 | 6069 |
| 5 | 2 | 66.7 | 73.7 | 11 / 35 | 5433 |
| 6 | 2 | 69.1 | 83.8 | 11 / 35 | 5684 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 57 | 49% |
| rsalesc.melee.Monk 0.3.6c | 48 | 13% |
| franzor.Lizt 1.3.1 | 21 | 62% |
| oog.melee.CapuletDroid 1.1 | 19 | 74% |
| exauge.GateKeeper 1.1.121g | 2 | 50% |
| skm.PateranBotlock2 1.0 | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 1211. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 74 | 50% | 97 |
| rtk.Tachikoma 1.0 | 43 | 29% | 83 |
| oog.melee.CapuletDroid 1.1 | 12 | 8% | 12 |
| franzor.Lizt 1.3.1 | 10 | 7% | 1 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 6 |
| lrem.micro.MoggFanatic 0.2 | 3 | 2% | 4 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F08

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 77.1 | 88 / 210 | 3.06 | 17.6% | 33293 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.6% | 88 |
| tm.Yuugao 1.0 | 2.2 | 14.2% | 55 |
| shrub.Vapour v159 | 3.2 | 11.6% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.2% | 17 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.3% | 19 |
| m3thos.Eva00 1.1 | 6.2 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.4% | 5 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.2% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.2% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 77.5 | 13 / 35 | 5915 |
| 2 | 1 | 65.0 | 72.7 | 11 / 35 | 5439 |
| 3 | 1 | 66.8 | 75.9 | 14 / 35 | 5945 |
| 4 | 1 | 69.8 | 89.2 | 20 / 35 | 5905 |
| 5 | 1 | 66.6 | 79.0 | 17 / 35 | 4943 |
| 6 | 1 | 63.7 | 68.6 | 13 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 51 | 47% |
| shrub.Vapour v159 | 34 | 76% |
| Krabb.sliNk.Garm 0.9u | 24 | 63% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 71% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 78% |
| m3thos.Eva00 1.1 | 5 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 44 | 36% | 78 |
| shrub.Vapour v159 | 18 | 15% | 37 |
| Krabb.sliNk.Garm 0.9u | 15 | 12% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 14 | 11% | 26 |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 8% | 13 |
| SHAM.WOW 1.4 | 10 | 8% | 12 |
| zyx.nano.BacillusComma 1.0 | 6 | 5% | 6 |
| qualidafial.MajorDick 1.0.1 | 4 | 3% | 3 |
| m3thos.Eva00 1.1 | 2 | 2% | 6 |

## Melee bench: F09

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 58.7 | 60.9 | 24 / 210 | 4.52 | 12.9% | 23693 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.9% | 122 |
| hadur117.micro.Saor 0.2 | 2.5 | 12.9% | 24 |
| kc.micro.Figment 1.0 | 2.7 | 13.0% | 28 |
| yagami.Tidus 0.11 | 4.7 | 10.8% | 2 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.8% | 18 |
| mc2.enemy.Original 0.9 | 5.5 | 9.8% | 16 |
| dft.Calliope 5.6 | 7.3 | 7.9% | 0 |
| step.nanoPri 1.0 | 7.7 | 6.4% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 5.6% | 0 |
| rdm.Dueler 0.4x | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 57.5 | 60.6 | 2 / 35 | 3444 |
| 2 | 3 | 58.7 | 60.6 | 5 / 35 | 4204 |
| 3 | 2 | 60.9 | 67.6 | 4 / 35 | 3941 |
| 4 | 3 | 58.2 | 60.3 | 4 / 35 | 3651 |
| 5 | 2 | 58.1 | 60.0 | 2 / 35 | 3974 |
| 6 | 2 | 58.7 | 56.2 | 7 / 35 | 4479 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 33 | 6% |
| kc.micro.Figment 1.0 | 20 | 40% |
| mc2.enemy.Original 0.9 | 10 | 40% |
| yagami.Tidus 0.11 | 5 | 100% |
| pedersen.Grishnakh 1.0 | 3 | 67% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 186 of 210 rounds, at a mean tick of 733. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 77 | 41% | 81 |
| kc.micro.Figment 1.0 | 55 | 30% | 65 |
| mc2.enemy.Original 0.9 | 15 | 8% | 19 |
| yagami.Tidus 0.11 | 10 | 5% | 12 |
| robar.nano.Assertive_Melee 0.2 | 10 | 5% | 10 |
| pedersen.Grishnakh 1.0 | 9 | 5% | 9 |
| step.nanoPri 1.0 | 7 | 4% | 7 |
| rdm.Dueler 0.4x | 2 | 1% | 3 |
| dft.Calliope 5.6 | 1 | 1% | 4 |

## Melee bench: F10

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.8 | 93 / 210 | 2.46 | 17.9% | 32606 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 93 |
| DTF.Kludgy 1.2b | 2.2 | 15.3% | 60 |
| ne.Chimera 1.2 | 3.7 | 12.3% | 18 |
| ejb.Polaris 1.0.1 | 4.3 | 11.5% | 18 |
| tvv.micro.Antares 1.1.1 | 4.8 | 11.0% | 9 |
| vStar.RAFzilla 2.15 | 5.0 | 10.8% | 8 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.5 | 5.7% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.8% | 1 |
| kurios.DOSexe .9b | 8.7 | 5.5% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.1 | 81.6 | 10 / 35 | 5000 |
| 2 | 1 | 67.2 | 84.4 | 17 / 35 | 5135 |
| 3 | 1 | 69.0 | 87.6 | 19 / 35 | 5572 |
| 4 | 1 | 68.0 | 85.7 | 15 / 35 | 5480 |
| 5 | 1 | 68.2 | 87.9 | 17 / 35 | 5419 |
| 6 | 1 | 66.4 | 75.2 | 15 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 52 | 31% |
| ejb.Polaris 1.0.1 | 30 | 63% |
| ne.Chimera 1.2 | 22 | 73% |
| vStar.RAFzilla 2.15 | 21 | 100% |
| tvv.micro.Antares 1.1.1 | 13 | 77% |
| kurios.DOSexe .9b | 8 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 56 | 47% | 72 |
| ne.Chimera 1.2 | 25 | 21% | 39 |
| ejb.Polaris 1.0.1 | 16 | 14% | 35 |
| tvv.micro.Antares 1.1.1 | 8 | 7% | 17 |
| Grystrion.RandomTrackerNOREV 1.0 | 5 | 4% | 7 |
| sam.Samspin 1.0 | 4 | 3% | 5 |
| vStar.RAFzilla 2.15 | 3 | 3% | 22 |
| donjezza.Muncho 1.0 | 1 | 1% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 12 |

## Melee bench: F11

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 73.7 | 53 / 210 | 3.37 | 15.6% | 27117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.0 | 17.3% | 93 |
| hadur117.micro.Saor 0.2 | 2.0 | 15.6% | 53 |
| cx.mini.Nimrod 0.55 | 3.5 | 11.9% | 21 |
| djc.DynaBot 0.1.1 | 3.8 | 10.7% | 13 |
| br2.MobyDickBot 1.6 | 5.7 | 8.8% | 9 |
| rdt199.Warlord 0.73 | 5.8 | 8.7% | 14 |
| uji.YellohFellah 1.0 | 6.5 | 8.3% | 6 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 6.2% | 1 |
| stelo.MirrorNano 1.3 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.2 | 69.5 | 9 / 35 | 4413 |
| 2 | 2 | 63.6 | 74.3 | 10 / 35 | 4203 |
| 3 | 2 | 65.3 | 77.5 | 12 / 35 | 4738 |
| 4 | 2 | 64.0 | 75.9 | 8 / 35 | 4679 |
| 5 | 2 | 63.4 | 75.2 | 4 / 35 | 4589 |
| 6 | 2 | 62.7 | 69.5 | 10 / 35 | 4495 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 16% |
| cx.mini.Nimrod 0.55 | 16 | 50% |
| djc.DynaBot 0.1.1 | 15 | 93% |
| rdt199.Warlord 0.73 | 10 | 80% |
| uji.YellohFellah 1.0 | 10 | 90% |
| br2.MobyDickBot 1.6 | 8 | 50% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 82 | 52% | 94 |
| cx.mini.Nimrod 0.55 | 29 | 18% | 38 |
| KiraNL.Chupacabra 0.4 | 10 | 6% | 12 |
| rdt199.Warlord 0.73 | 8 | 5% | 15 |
| djc.DynaBot 0.1.1 | 8 | 5% | 15 |
| jeremyreeder.Vincent 2011.12.09 | 8 | 5% | 8 |
| br2.MobyDickBot 1.6 | 7 | 4% | 14 |
| uji.YellohFellah 1.0 | 3 | 2% | 10 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |

## Melee bench: F12

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 76.6 | 93 / 210 | 3.10 | 16.1% | 23084 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.1% | 93 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.9% | 35 |
| nat.PallasHawk 1.0 | 3.0 | 13.0% | 44 |
| darkcanuck.Leon 1.01 | 3.3 | 13.0% | 24 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 9 |
| jrm.Test0 1.0 | 6.7 | 7.8% | 1 |
| jp.Perpy 16.0 | 7.0 | 7.7% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.9% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.7 | 18 / 35 | 3943 |
| 2 | 1 | 63.8 | 75.6 | 13 / 35 | 3842 |
| 3 | 1 | 64.8 | 79.4 | 15 / 35 | 3885 |
| 4 | 1 | 62.4 | 70.2 | 15 / 35 | 3628 |
| 5 | 1 | 64.2 | 77.8 | 16 / 35 | 3754 |
| 6 | 1 | 65.0 | 77.1 | 16 / 35 | 4032 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 40 | 53% |
| nat.PallasHawk 1.0 | 32 | 69% |
| darkcanuck.Leon 1.01 | 31 | 84% |
| brainfade.melee.Genghis 0.36 | 15 | 93% |
| jaybot.bots.Oddball 4.0 | 5 | 80% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 621. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 39 | 33% | 60 |
| nat.PallasHawk 1.0 | 25 | 21% | 49 |
| darkcanuck.Leon 1.01 | 22 | 19% | 50 |
| brainfade.melee.Genghis 0.36 | 14 | 12% | 19 |
| jrm.Test0 1.0 | 8 | 7% | 13 |
| jp.Perpy 16.0 | 4 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |

## Melee bench: F13

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 68.5 | 13 / 210 | 3.84 | 13.5% | 24241 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.1% | 101 |
| ags.Glacier 0.2.11 | 1.7 | 17.2% | 62 |
| hadur117.micro.Saor 0.2 | 3.3 | 13.5% | 13 |
| gh.micro.Gruweltje 0.7 | 4.2 | 12.2% | 19 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 13 |
| apc.Colossus2 0.17 | 6.2 | 7.8% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 2 |
| ayk.WallHugger 1.0 | 8.3 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.4 | 70.2 | 1 / 35 | 4081 |
| 2 | 3 | 63.3 | 74.6 | 2 / 35 | 4278 |
| 3 | 4 | 60.0 | 66.3 | 5 / 35 | 3809 |
| 4 | 3 | 61.0 | 67.0 | 3 / 35 | 4132 |
| 5 | 4 | 59.1 | 64.1 | 1 / 35 | 3711 |
| 6 | 3 | 60.8 | 68.6 | 1 / 35 | 4230 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 28 | 11% |
| mn.Combat 3.25.0 | 19 | 16% |
| gh.micro.Gruweltje 0.7 | 11 | 27% |
| shinh.Entangled 0.3 | 7 | 57% |

Hadur died in 197 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 77 | 39% | 81 |
| mn.Combat 3.25.0 | 64 | 32% | 67 |
| shinh.Entangled 0.3 | 19 | 10% | 23 |
| gh.micro.Gruweltje 0.7 | 18 | 9% | 21 |
| maribo.FollowFire 1 | 5 | 3% | 4 |
| ayk.WallHugger 1.0 | 5 | 3% | 4 |
| stelo.Wang 1.0 | 4 | 2% | 4 |
| apc.Colossus2 0.17 | 4 | 2% | 4 |
| sample.Tracker 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 71.4 | 109 / 210 | 3.58 | 16.4% | 30667 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 16.4% | 109 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 19 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.7% | 44 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.9% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.7% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.7% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.6% | 6 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.9% | 15 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.2 | 69.5 | 17 / 35 | 4911 |
| 2 | 1 | 66.4 | 73.7 | 22 / 35 | 5299 |
| 3 | 1 | 64.6 | 70.2 | 18 / 35 | 4930 |
| 4 | 1 | 65.7 | 73.0 | 19 / 35 | 5588 |
| 5 | 2 | 62.8 | 67.6 | 15 / 35 | 4513 |
| 6 | 1 | 66.2 | 74.3 | 18 / 35 | 5426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 65 | 92% |
| catcat20.shape.Theta 0.018 | 30 | 47% |
| co.edu.usb.rc.LidisTron 1.0 | 16 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 80% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 89% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 529. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 44 | 44% | 104 |
| catcat20.shape.Theta 0.018 | 27 | 27% | 46 |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 8% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 5% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 5 | 5% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 4% | 7 |
| pa.Improved 1.0 | 4 | 4% | 6 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 3% | 7 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |

## Melee bench: F15

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 83.3 | 123 / 210 | 2.50 | 19.3% | 35434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 123 |
| emp.Yngwie 1.11 | 2.7 | 12.7% | 37 |
| kawigi.micro.Shiz 1.1 | 2.8 | 12.8% | 19 |
| mld.DustBunny 3.8 | 3.5 | 12.3% | 9 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.4% | 17 |
| cb.nano.Insomnia 1.0 | 5.7 | 9.2% | 4 |
| Grystrion.TrackerWO 1.0 | 7.3 | 7.2% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 7.0% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.6% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 85.4 | 21 / 35 | 5854 |
| 2 | 1 | 68.9 | 81.9 | 18 / 35 | 6205 |
| 3 | 1 | 68.9 | 83.2 | 21 / 35 | 5793 |
| 4 | 1 | 70.1 | 86.3 | 22 / 35 | 6135 |
| 5 | 1 | 67.2 | 78.7 | 19 / 35 | 5470 |
| 6 | 1 | 69.3 | 84.4 | 22 / 35 | 5977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 52 | 65% |
| kawigi.micro.Shiz 1.1 | 38 | 95% |
| kawigi.robot.Girl 1.2 | 23 | 70% |
| mld.DustBunny 3.8 | 18 | 100% |
| cb.nano.Insomnia 1.0 | 14 | 100% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 33 | 38% | 73 |
| kawigi.micro.Shiz 1.1 | 12 | 14% | 41 |
| kawigi.robot.Girl 1.2 | 10 | 11% | 20 |
| cb.nano.Insomnia 1.0 | 10 | 11% | 10 |
| mld.DustBunny 3.8 | 7 | 8% | 34 |
| Grystrion.TrackerWO 1.0 | 6 | 7% | 12 |
| lambdaxy.TBot 0.1 | 4 | 5% | 5 |
| divineomega.TrialBot 0.003 | 3 | 3% | 12 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 2% | 3 |

## Melee bench: F16

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.5 | 67 / 210 | 2.58 | 18.3% | 34721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.5 | 18.3% | 67 |
| gh.Griezel 0.5.2 | 1.5 | 17.3% | 102 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 9 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.2% | 28 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.0% | 1 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.8% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.4% | 2 |
| repositorio.NanoStep 1.0 | 8.5 | 5.3% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 81.3 | 11 / 35 | 5994 |
| 2 | 2 | 67.1 | 79.7 | 12 / 35 | 5415 |
| 3 | 1 | 69.4 | 85.1 | 13 / 35 | 6157 |
| 4 | 1 | 69.0 | 85.4 | 14 / 35 | 5834 |
| 5 | 2 | 66.2 | 74.9 | 8 / 35 | 5496 |
| 6 | 2 | 69.1 | 88.6 | 9 / 35 | 5825 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 89 | 18% |
| techdude.forest.FlamingForest 1.1 | 24 | 46% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 89% |
| divineomega.DivineBot 1.9.4.5 | 9 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| bvh.fnr.Fenrir 0.36l | 4 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 1465. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 86 | 60% | 106 |
| techdude.forest.FlamingForest 1.1 | 17 | 12% | 25 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 10% | 32 |
| bvh.fnr.Fenrir 0.36l | 11 | 8% | 12 |
| tvv.nano.Polaris 1.2 | 6 | 4% | 11 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 7 |
| divineomega.DivineBot 1.9.4.5 | 2 | 1% | 11 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |

## Melee bench: F17

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.5 | 97 / 210 | 2.94 | 17.4% | 29735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.4% | 97 |
| et.Predator 1.8 | 2.5 | 14.1% | 30 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.4% | 30 |
| cx.BlestPain 1.41 | 3.3 | 12.6% | 41 |
| ahf.NanoAndrew .4 | 5.5 | 10.2% | 5 |
| nic.Nicator 2.4 | 5.7 | 10.2% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 1 |
| tex.Longbot 0.4 | 8.2 | 6.0% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 81.6 | 19 / 35 | 5206 |
| 2 | 1 | 67.3 | 80.0 | 13 / 35 | 5566 |
| 3 | 1 | 65.5 | 77.5 | 14 / 35 | 4522 |
| 4 | 1 | 63.7 | 69.5 | 13 / 35 | 4695 |
| 5 | 1 | 68.1 | 82.5 | 22 / 35 | 4664 |
| 6 | 1 | 67.4 | 79.7 | 16 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 81% |
| oog.melee.Mercutio 1.0 | 34 | 65% |
| cx.BlestPain 1.41 | 33 | 42% |
| nic.Nicator 2.4 | 12 | 75% |
| ahf.NanoAndrew .4 | 10 | 80% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 970. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 29% | 46 |
| et.Predator 1.8 | 23 | 20% | 59 |
| oog.melee.Mercutio 1.0 | 22 | 19% | 42 |
| nic.Nicator 2.4 | 14 | 12% | 26 |
| ahf.NanoAndrew .4 | 11 | 10% | 23 |
| maribo.melee.BMV 0.1 | 5 | 4% | 8 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 2 |
| goblin.Bender 2.4 | 2 | 2% | 2 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 82.2 | 124 / 210 | 2.60 | 17.9% | 26786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.9% | 124 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.9% | 26 |
| uji.DBH 1.1 | 3.8 | 10.9% | 12 |
| agd.Mooserwirt2 2.7 | 4.0 | 11.5% | 23 |
| ratosh.Nobo 0.21 | 4.7 | 10.2% | 7 |
| spinnercat.Robovirus 2.718 | 5.3 | 10.1% | 6 |
| sigterm.Sigterm 1.0 | 7.0 | 8.2% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.6% | 1 |
| stelo.WangRobot 1.0 | 9.2 | 5.5% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.7 | 24 / 35 | 4636 |
| 2 | 1 | 63.1 | 70.5 | 16 / 35 | 4265 |
| 3 | 1 | 69.6 | 91.4 | 24 / 35 | 4835 |
| 4 | 1 | 64.8 | 77.8 | 19 / 35 | 3884 |
| 5 | 1 | 69.5 | 91.1 | 24 / 35 | 4791 |
| 6 | 1 | 65.2 | 76.8 | 17 / 35 | 4375 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 72% |
| agd.Mooserwirt2 2.7 | 28 | 82% |
| uji.DBH 1.1 | 23 | 83% |
| sigterm.Sigterm 1.0 | 20 | 90% |
| spinnercat.Robovirus 2.718 | 14 | 100% |
| ratosh.Nobo 0.21 | 13 | 92% |
| stelo.WangRobot 1.0 | 6 | 83% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 658. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 33% | 66 |
| uji.DBH 1.1 | 13 | 15% | 28 |
| kawigi.mini.Fhqwhgads 1.1 | 11 | 13% | 17 |
| agd.Mooserwirt2 2.7 | 9 | 10% | 39 |
| sigterm.Sigterm 1.0 | 7 | 8% | 20 |
| ratosh.Nobo 0.21 | 5 | 6% | 14 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 7 |
| stelo.WangRobot 1.0 | 4 | 5% | 6 |

## Melee bench: F19

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 88.9 | 156 / 210 | 2.00 | 20.2% | 34524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 20.2% | 156 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.8% | 27 |
| mld.Infinity 2.2 | 2.7 | 14.3% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 10.9% | 1 |
| erdnis.Rover 0.3 | 5.0 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.9% | 1 |
| pac.ABC 2.1 | 7.5 | 6.8% | 2 |
| mbh.Mbh 0.1 | 7.8 | 6.8% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 91.1 | 30 / 35 | 6268 |
| 2 | 1 | 71.2 | 90.2 | 26 / 35 | 5629 |
| 3 | 1 | 70.9 | 90.2 | 26 / 35 | 5336 |
| 4 | 1 | 69.7 | 82.2 | 25 / 35 | 5852 |
| 5 | 1 | 70.5 | 86.7 | 23 / 35 | 5683 |
| 6 | 1 | 71.7 | 93.0 | 26 / 35 | 5756 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 77 | 90% |
| davidalves.net.DuelistMiniMelee 1.2 | 73 | 86% |
| erdnis.Rover 0.3 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| krillr.mini.JointStrike 2.0.0 | 6 | 100% |
| pac.ABC 2.1 | 5 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 28% | 101 |
| mld.Infinity 2.2 | 15 | 28% | 18 |
| erdnis.Rover 0.3 | 7 | 13% | 20 |
| mbh.Mbh 0.1 | 6 | 11% | 11 |
| pac.ABC 2.1 | 5 | 9% | 11 |
| krillr.mini.JointStrike 2.0.0 | 3 | 6% | 18 |
| patson.PatsonTestBot 1.0 | 3 | 6% | 13 |
| pbg.R2D2 1.0 | 0 | 0% | 14 |

## Melee bench: F20

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.1 | 107 / 210 | 2.25 | 19.1% | 33266 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.1% | 107 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.2% | 55 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.7% | 2 |
| catcat20.Rabbit 0.001 | 4.0 | 10.3% | 18 |
| fwb.Nine 1.0.1 | 4.3 | 10.3% | 25 |
| djdjdj.NanoSkunk10 1.0 | 6.5 | 8.1% | 1 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 7.8 | 6.7% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 6.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 19 / 35 | 5419 |
| 2 | 1 | 70.0 | 88.6 | 22 / 35 | 5772 |
| 3 | 1 | 68.6 | 83.8 | 17 / 35 | 5522 |
| 4 | 1 | 68.6 | 88.3 | 17 / 35 | 5308 |
| 5 | 1 | 69.1 | 86.0 | 17 / 35 | 5852 |
| 6 | 1 | 68.4 | 86.7 | 15 / 35 | 5393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 92 | 62% |
| fwb.Nine 1.0.1 | 29 | 48% |
| catcat20.Rabbit 0.001 | 15 | 60% |
| nz.jdc.nano.GridFu 1.0 | 14 | 100% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 1150. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 56 | 54% | 100 |
| fwb.Nine 1.0.1 | 19 | 18% | 18 |
| catcat20.Rabbit 0.001 | 13 | 13% | 25 |
| nz.jdc.nano.GridFu 1.0 | 7 | 7% | 29 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 8 |
| ntc.ControlledChaos 1.1.4 | 2 | 2% | 5 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F21

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.8 | 108 / 210 | 2.19 | 19.3% | 33651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.3% | 108 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 71 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.4% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 11 |
| eld.Hmm 1.0 | 5.3 | 8.6% | 8 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.0% | 2 |
| fire219.CatBot 1.0 | 7.8 | 6.6% | 0 |
| el.JumpShoot 0.2 | 8.2 | 6.0% | 1 |
| PSW.Relentless 0.1 | 8.3 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 81.6 | 17 / 35 | 5353 |
| 2 | 1 | 70.8 | 92.1 | 22 / 35 | 5638 |
| 3 | 1 | 68.9 | 86.7 | 19 / 35 | 5648 |
| 4 | 1 | 68.9 | 86.3 | 18 / 35 | 5468 |
| 5 | 1 | 70.3 | 90.5 | 17 / 35 | 5939 |
| 6 | 1 | 68.6 | 83.8 | 15 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 98 | 49% |
| cf.RiO.RiOx 4.2.1 | 28 | 86% |
| dummy.mini.Scimitar 1.01 | 27 | 96% |
| eld.Hmm 1.0 | 8 | 75% |
| oa.weak.BotherBot 0.1 | 4 | 75% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1180. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 64 | 63% | 94 |
| dummy.mini.Scimitar 1.01 | 12 | 12% | 46 |
| cf.RiO.RiOx 4.2.1 | 12 | 12% | 30 |
| eld.Hmm 1.0 | 6 | 6% | 22 |
| fire219.CatBot 1.0 | 4 | 4% | 3 |
| PSW.Relentless 0.1 | 3 | 3% | 4 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 10 |

## Melee bench: F22

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.8 | 73 / 210 | 2.46 | 17.7% | 30674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.7% | 73 |
| pe.SandboxDT 2.71m | 1.8 | 16.4% | 67 |
| kvk.HebusLeTroll 0.35 | 3.0 | 13.8% | 39 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.6% | 21 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 9 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 1 |
| tad.Dalek98 0.98 | 6.8 | 7.0% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.3 | 4.7% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 17 / 35 | 5379 |
| 2 | 1 | 68.2 | 83.8 | 14 / 35 | 5295 |
| 3 | 1 | 68.4 | 89.2 | 12 / 35 | 5131 |
| 4 | 1 | 68.3 | 86.7 | 11 / 35 | 5371 |
| 5 | 1 | 66.0 | 81.9 | 11 / 35 | 4601 |
| 6 | 2 | 64.4 | 72.7 | 8 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 56 | 30% |
| kvk.HebusLeTroll 0.35 | 48 | 56% |
| jlm.javaDisturbance 0.59 | 33 | 55% |
| bigpete.Stewie 1.0 | 10 | 80% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 1040. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 54 | 39% | 78 |
| kvk.HebusLeTroll 0.35 | 37 | 27% | 56 |
| jlm.javaDisturbance 0.59 | 33 | 24% | 49 |
| tad.Dalek98 0.98 | 4 | 3% | 5 |
| gg.Squaraus 0.6 | 4 | 3% | 4 |
| bigpete.Stewie 1.0 | 3 | 2% | 11 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |

## Melee bench: F23

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 81.2 | 87 / 210 | 2.69 | 18.4% | 34654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 18.4% | 87 |
| pe.SandboxLump 1.52 | 1.8 | 17.5% | 76 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 27 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.2 | 9.6% | 3 |
| stelo.AreaTargetingBot 1.1 | 5.3 | 9.4% | 8 |
| cw.megas.Blade 0.8 | 5.7 | 8.9% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.0 | 8.9% | 4 |
| sample.Walls 1.0 | 7.8 | 7.6% | 4 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 75.6 | 15 / 35 | 5422 |
| 2 | 1 | 69.2 | 83.2 | 15 / 35 | 6164 |
| 3 | 2 | 66.6 | 74.9 | 11 / 35 | 5471 |
| 4 | 1 | 70.7 | 86.3 | 20 / 35 | 6081 |
| 5 | 1 | 69.0 | 84.4 | 14 / 35 | 5595 |
| 6 | 1 | 69.8 | 82.9 | 12 / 35 | 5921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 84 | 49% |
| cre.Karolos 0.32 | 28 | 57% |
| stelo.AreaTargetingBot 1.1 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 75% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 67 | 54% | 106 |
| cre.Karolos 0.32 | 33 | 27% | 49 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 7% | 13 |
| stelo.AreaTargetingBot 1.1 | 6 | 5% | 18 |
| cw.megas.Blade 0.8 | 6 | 5% | 12 |
| stelo.RamTrackSurfer 1.2 | 3 | 2% | 10 |
| sample.Walls 1.0 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 68.4 | 47 / 210 | 3.85 | 14.2% | 23509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.7 | 14.2% | 47 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.9% | 42 |
| florent.XSeries.X2 0.12 | 3.2 | 13.5% | 44 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 38 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.9% | 25 |
| oog.melee.Corsair 1.0 | 6.0 | 9.4% | 8 |
| stelo.SoJNanoMelee 1.1 | 7.5 | 7.0% | 7 |
| lunchie.Lunchbox 0.93 | 7.5 | 6.9% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 5.5% | 0 |
| evd.X1 0.01 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.3 | 67.6 | 4 / 35 | 3794 |
| 2 | 2 | 60.8 | 69.5 | 7 / 35 | 3630 |
| 3 | 3 | 59.3 | 62.5 | 7 / 35 | 3842 |
| 4 | 1 | 63.8 | 74.3 | 11 / 35 | 4084 |
| 5 | 1 | 62.5 | 71.7 | 6 / 35 | 4317 |
| 6 | 1 | 60.6 | 64.4 | 12 / 35 | 3842 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 26 | 27% |
| rz.GlowBlowMelee 1.4 | 25 | 48% |
| davidalves.Phoenix 0.54 | 23 | 43% |
| pedersen.Ugluk 1.1.1 | 17 | 53% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| oog.melee.Corsair 1.0 | 4 | 25% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 691. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 50 | 30% | 59 |
| davidalves.Phoenix 0.54 | 34 | 21% | 44 |
| rz.GlowBlowMelee 1.4 | 28 | 17% | 43 |
| pedersen.Ugluk 1.1.1 | 22 | 13% | 26 |
| oog.melee.Corsair 1.0 | 14 | 9% | 14 |
| lunchie.Lunchbox 0.93 | 8 | 5% | 12 |
| evd.X1 0.01 | 5 | 3% | 5 |
| stelo.SoJNanoMelee 1.1 | 1 | 1% | 5 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.6 | 120 / 210 | 2.74 | 17.8% | 25810 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 17.8% | 120 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.1% | 23 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 12.4% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.4% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.0 | 9.9% | 11 |
| ds.Oo 2.2 | 5.7 | 9.1% | 10 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.8% | 4 |
| adt.Ar2 1.1 | 8.2 | 7.0% | 3 |
| awesomeness.Elite 1.0 | 8.5 | 6.9% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.1 | 23 / 35 | 4561 |
| 2 | 1 | 67.5 | 81.6 | 20 / 35 | 4517 |
| 3 | 1 | 66.6 | 81.6 | 19 / 35 | 4106 |
| 4 | 1 | 64.7 | 74.9 | 17 / 35 | 3900 |
| 5 | 1 | 66.9 | 79.7 | 22 / 35 | 4436 |
| 6 | 1 | 66.8 | 81.0 | 19 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 38 | 89% |
| jdw.Hurricane 1.4 | 34 | 79% |
| voidious.mini.BrokenSword 2.0.3 | 34 | 88% |
| ds.Oo 2.2 | 16 | 81% |
| gre.svman4.Morfeas 1.4.1 | 6 | 67% |
| awesomeness.Elite 1.0 | 5 | 80% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 534. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 19 | 21% | 42 |
| voidious.mini.BrokenSword 2.0.3 | 16 | 18% | 49 |
| voidious.micro.BlitzBat 1.05 | 13 | 14% | 42 |
| ds.Oo 2.2 | 12 | 13% | 26 |
| gre.svman4.Morfeas 1.4.1 | 11 | 12% | 17 |
| gjr.Cephalosporin 0.1 | 6 | 7% | 10 |
| amk.ChumbaMini 0.2 | 6 | 7% | 6 |
| awesomeness.Elite 1.0 | 4 | 4% | 9 |
| adt.Ar2 1.1 | 4 | 4% | 8 |

## Melee bench: F26

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.5 | 92 / 210 | 2.48 | 18.0% | 32946 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.0% | 92 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 55 |
| lrem.Spectre 0.4.4 | 3.7 | 12.0% | 27 |
| shu.nitro.LENIN .T34 | 3.7 | 12.5% | 26 |
| js.PinBall 1.6 | 5.7 | 10.0% | 1 |
| gh.mini.GrubbmOne 1.0 | 5.7 | 9.9% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 16 / 35 | 5571 |
| 2 | 1 | 68.4 | 84.1 | 15 / 35 | 5716 |
| 3 | 1 | 69.3 | 85.1 | 18 / 35 | 5847 |
| 4 | 1 | 67.5 | 82.2 | 15 / 35 | 5253 |
| 5 | 1 | 67.3 | 82.5 | 15 / 35 | 5201 |
| 6 | 1 | 67.2 | 82.2 | 13 / 35 | 5358 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 52 | 42% |
| shu.nitro.LENIN .T34 | 47 | 70% |
| lrem.Spectre 0.4.4 | 27 | 67% |
| js.PinBall 1.6 | 9 | 100% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 55 | 47% | 76 |
| lrem.Spectre 0.4.4 | 20 | 17% | 32 |
| shu.nitro.LENIN .T34 | 19 | 16% | 51 |
| js.PinBall 1.6 | 7 | 6% | 19 |
| fullsail.LaxativeTeaTwo 1.0 | 6 | 5% | 8 |
| gh.mini.GrubbmOne 1.0 | 5 | 4% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 4% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 4 |

## Melee bench: F27

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.2 | 123 / 210 | 2.51 | 18.2% | 28375 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.2% | 123 |
| mk.Alpha 0.2.1 | 2.0 | 13.6% | 42 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.5% | 9 |
| EH.Eagle 1.0.6 | 5.2 | 9.8% | 9 |
| joe.ADinosaur 1.0 | 6.7 | 8.5% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.8% | 3 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.8% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.2% | 0 |
| cs.Grudge 1.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.3 | 80.3 | 15 / 35 | 4431 |
| 2 | 1 | 67.4 | 84.1 | 21 / 35 | 4556 |
| 3 | 1 | 65.8 | 76.8 | 14 / 35 | 4914 |
| 4 | 1 | 69.7 | 90.2 | 24 / 35 | 5120 |
| 5 | 1 | 68.9 | 87.0 | 28 / 35 | 4928 |
| 6 | 1 | 66.5 | 81.0 | 21 / 35 | 4426 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 64 | 70% |
| wee.Gem 1.8.4 | 28 | 86% |
| EH.Eagle 1.0.6 | 22 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 21 | 86% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 706. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 36 | 41% | 84 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 14% | 33 |
| wee.Gem 1.8.4 | 10 | 11% | 34 |
| throxbot.ThroxBot 0.1 | 8 | 9% | 15 |
| joe.ADinosaur 1.0 | 8 | 9% | 11 |
| EH.Eagle 1.0.6 | 5 | 6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 6% | 10 |
| cs.Grudge 1.0 | 2 | 2% | 2 |
| caimano.Furia_Ceca 0.22 | 1 | 1% | 4 |

## Melee bench: F28

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.8 | 130 / 210 | 2.28 | 18.5% | 26716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.5% | 130 |
| kid.test.NightFox .2 | 2.0 | 14.5% | 32 |
| uji.Antique 1.0 | 3.3 | 11.9% | 17 |
| pfvicm.Sobieski 7.2.3b | 4.3 | 10.6% | 7 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.9% | 16 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 6 |
| ahr.ice.Ice 1.0.2 | 7.2 | 7.6% | 3 |
| matt.advanced.Katana 1.0 | 8.0 | 7.0% | 2 |
| stelo.PianistNano 1.2 | 8.5 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 85.4 | 20 / 35 | 4381 |
| 2 | 1 | 70.5 | 94.3 | 28 / 35 | 4642 |
| 3 | 1 | 68.1 | 85.4 | 22 / 35 | 4403 |
| 4 | 1 | 65.6 | 77.1 | 19 / 35 | 4490 |
| 5 | 1 | 68.9 | 90.2 | 22 / 35 | 4608 |
| 6 | 1 | 66.7 | 82.5 | 19 / 35 | 4192 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 76 | 76% |
| uji.Antique 1.0 | 40 | 90% |
| qohnil.blot.BlotBot 3.61 | 12 | 50% |
| pfvicm.Sobieski 7.2.3b | 11 | 100% |
| amk.ChumbaWumba 0.3 | 7 | 86% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| stelo.PianistNano 1.2 | 6 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 23 | 28% | 75 |
| uji.Antique 1.0 | 13 | 16% | 50 |
| pfvicm.Sobieski 7.2.3b | 13 | 16% | 20 |
| qohnil.blot.BlotBot 3.61 | 11 | 13% | 25 |
| amk.ChumbaWumba 0.3 | 11 | 13% | 15 |
| matt.advanced.Katana 1.0 | 4 | 5% | 7 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 10 |
| stelo.Lifestealer 1.0 | 3 | 4% | 3 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 79.1 | 69 / 210 | 2.88 | 17.0% | 27882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.0% | 69 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.4% | 68 |
| deewiant.Anomaly 0.2 | 2.7 | 14.6% | 55 |
| myl.micro.Troodon 1.10 | 4.3 | 11.1% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.2% | 4 |
| ph.melee.ArcherME 0.3 | 5.8 | 8.2% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.5% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.3% | 0 |
| ap.Frederick 1.1 | 9.3 | 5.0% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 75.9 | 12 / 35 | 4761 |
| 2 | 2 | 66.5 | 81.6 | 12 / 35 | 4387 |
| 3 | 1 | 65.6 | 76.5 | 12 / 35 | 4675 |
| 4 | 1 | 67.1 | 80.3 | 11 / 35 | 5103 |
| 5 | 1 | 66.4 | 81.0 | 13 / 35 | 4659 |
| 6 | 1 | 65.4 | 79.4 | 9 / 35 | 4297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 44% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 34% |
| myl.micro.Troodon 1.10 | 14 | 93% |
| DBall.Anarchy 0.1 | 9 | 100% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 40% | 83 |
| zyx.mega.YersiniaPestis 3.1 | 54 | 38% | 66 |
| jok.PheonixM 0.1.2 | 9 | 6% | 18 |
| ph.melee.ArcherME 0.3 | 7 | 5% | 8 |
| myl.micro.Troodon 1.10 | 6 | 4% | 15 |
| fullsail.TimbotNoPrediction 1.0 | 6 | 4% | 7 |
| DBall.Anarchy 0.1 | 2 | 1% | 13 |

## Melee bench: F30

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.4 | 59.4 | 24 / 210 | 4.65 | 12.3% | 22940 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.0 | 13.7% | 56 |
| darkcanuck.B26354 1.06 | 2.7 | 13.3% | 50 |
| oog.melee.Capulet 1.2 | 2.7 | 13.1% | 33 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.5% | 24 |
| hadur117.micro.Saor 0.2 | 4.2 | 12.3% | 24 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.8% | 9 |
| tripphippy.Alice 1.1 | 7.3 | 8.3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 8.0 | 7.5% | 7 |
| ntc.Opposite 1.5 | 8.0 | 7.8% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 5 | 55.9 | 54.9 | 4 / 35 | 3753 |
| 2 | 5 | 58.2 | 61.6 | 3 / 35 | 3706 |
| 3 | 4 | 58.4 | 62.9 | 3 / 35 | 4020 |
| 4 | 3 | 58.9 | 60.6 | 5 / 35 | 4115 |
| 5 | 3 | 59.1 | 64.1 | 5 / 35 | 3962 |
| 6 | 5 | 54.1 | 52.4 | 4 / 35 | 3384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 20 | 50% |
| catcat20.Matcha 0.006 | 13 | 15% |
| stelo.PastFuture 2.3.2 | 12 | 42% |
| darkcanuck.B26354 1.06 | 12 | 25% |
| tripphippy.Alice 1.1 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 2 | 50% |

Hadur died in 187 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 49 | 26% | 51 |
| oog.melee.Capulet 1.2 | 47 | 25% | 59 |
| stelo.PastFuture 2.3.2 | 29 | 16% | 34 |
| darkcanuck.B26354 1.06 | 25 | 13% | 28 |
| tripphippy.Alice 1.1 | 13 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 11 | 6% | 11 |
| intruder.PrairieWolf 2.61 | 6 | 3% | 6 |
| ntc.Opposite 1.5 | 4 | 2% | 4 |
| GarmBox.Anger 1.0 | 3 | 2% | 3 |

## Melee bench: F31

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.7 | 65.8 | 22 / 210 | 4.08 | 13.3% | 22008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 112 |
| gh.mini.Griezel 0.2 | 2.3 | 13.2% | 46 |
| hadur117.micro.Saor 0.2 | 2.7 | 13.3% | 22 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.3% | 18 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.1% | 5 |
| gh.nano.Grofvuil 0.2 | 6.2 | 9.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.4% | 2 |
| fm.mammillarias 1.3 | 8.7 | 5.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.3% | 1 |
| tlp.ThreeLeggedPig 1 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.3 | 68.9 | 4 / 35 | 3865 |
| 2 | 3 | 59.7 | 67.6 | 5 / 35 | 3627 |
| 3 | 2 | 60.1 | 66.7 | 2 / 35 | 3657 |
| 4 | 3 | 59.1 | 64.8 | 5 / 35 | 3532 |
| 5 | 3 | 58.8 | 61.0 | 4 / 35 | 3715 |
| 6 | 3 | 59.6 | 65.7 | 2 / 35 | 3612 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 3% |
| gh.mini.Griezel 0.2 | 22 | 14% |
| d414.nano.Quantum 1.0.0 | 9 | 89% |
| spinnercat.micro.Tyger 0.1 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 5 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 86 | 46% | 87 |
| gh.mini.Griezel 0.2 | 34 | 18% | 39 |
| spinnercat.micro.Tyger 0.1 | 22 | 12% | 27 |
| gh.nano.Grofvuil 0.2 | 14 | 7% | 17 |
| timmit.nano.TimDog 0.33 | 11 | 6% | 11 |
| d414.nano.Quantum 1.0.0 | 8 | 4% | 16 |
| fm.mammillarias 1.3 | 6 | 3% | 6 |
| tlp.ThreeLeggedPig 1 | 4 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 4 |

## Melee bench: F32

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.6 | 100 / 210 | 2.84 | 17.1% | 28397 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.2 | 17.1% | 100 |
| kawigi.sbf.FloodHT 0.9.2 | 1.8 | 15.0% | 67 |
| apc.botM 3.0 | 3.2 | 11.9% | 16 |
| lxx.ConceptA 0.8 | 4.3 | 10.4% | 1 |
| vjik.UnViolation 1.1 | 4.5 | 10.1% | 11 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 4 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.7% | 0 |
| yk.JahMicro 1.0 | 8.5 | 6.7% | 7 |
| donjezza.Jezza 1.0 | 9.8 | 5.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 82.2 | 21 / 35 | 4754 |
| 2 | 1 | 64.8 | 77.5 | 18 / 35 | 4555 |
| 3 | 1 | 63.7 | 74.0 | 14 / 35 | 4521 |
| 4 | 2 | 64.9 | 77.5 | 12 / 35 | 4676 |
| 5 | 1 | 66.3 | 81.0 | 18 / 35 | 4766 |
| 6 | 1 | 67.6 | 85.4 | 17 / 35 | 5125 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 63 | 40% |
| apc.botM 3.0 | 31 | 77% |
| lxx.ConceptA 0.8 | 16 | 100% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| vjik.UnViolation 1.1 | 10 | 90% |
| yk.JahMicro 1.0 | 9 | 67% |
| donjezza.Jezza 1.0 | 6 | 67% |
| panzer.Panzer 0.2 | 6 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 51 | 46% | 78 |
| lxx.ConceptA 0.8 | 14 | 13% | 22 |
| apc.botM 3.0 | 11 | 10% | 34 |
| conscience.Electron 1.3g | 9 | 8% | 11 |
| bayen.UbaMicro 1.4 | 7 | 6% | 15 |
| panzer.Panzer 0.2 | 7 | 6% | 9 |
| vjik.UnViolation 1.1 | 6 | 5% | 26 |
| donjezza.Jezza 1.0 | 3 | 3% | 9 |
| yk.JahMicro 1.0 | 3 | 3% | 6 |

## Melee bench: F33

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 83.4 | 117 / 210 | 2.50 | 18.7% | 30725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.7% | 117 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 39 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 11.9% | 13 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.3% | 23 |
| labg.Cataclysm 2.05 | 5.3 | 9.9% | 12 |
| baal.nano.N 1.42 | 6.2 | 8.8% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.5% | 4 |
| zyx.micro.Ant 1.1 | 8.2 | 6.1% | 0 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.1 | 21 / 35 | 5163 |
| 2 | 1 | 68.5 | 84.1 | 17 / 35 | 4870 |
| 3 | 1 | 66.2 | 74.0 | 16 / 35 | 4849 |
| 4 | 1 | 69.9 | 88.6 | 22 / 35 | 5354 |
| 5 | 1 | 67.7 | 81.9 | 21 / 35 | 4811 |
| 6 | 1 | 70.0 | 87.6 | 20 / 35 | 5678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 65 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 91% |
| gre.svman4.Leonidas 1.3.2 | 32 | 78% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 78% |
| labg.Cataclysm 2.05 | 8 | 63% |
| baal.nano.N 1.42 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 43% | 85 |
| gre.svman4.Leonidas 1.3.2 | 18 | 19% | 35 |
| labg.Cataclysm 2.05 | 14 | 15% | 20 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 7 | 7% | 40 |
| baal.nano.N 1.42 | 4 | 4% | 9 |
| zyx.micro.Ant 1.1 | 4 | 4% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 4 | 4% | 5 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 3% | 7 |
| sanja.First 0.1 | 1 | 1% | 4 |

## Melee bench: F34

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 73.8 | 39 / 210 | 3.36 | 15.7% | 29719 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| stelo.Spread 0.9 | 1.7 | 17.1% | 89 |
| kid.Gladiator .7.2 | 1.8 | 16.4% | 54 |
| hadur117.micro.Saor 0.2 | 2.5 | 15.7% | 39 |
| tcf.Reach 3 | 4.3 | 10.9% | 8 |
| jcs.Seth 1.8 | 4.8 | 11.1% | 18 |
| cli.Dancer 1.1 | 5.8 | 9.8% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.8% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 73.0 | 5 / 35 | 4998 |
| 2 | 3 | 63.5 | 69.5 | 7 / 35 | 4815 |
| 3 | 3 | 63.1 | 71.7 | 4 / 35 | 4388 |
| 4 | 2 | 64.9 | 74.0 | 8 / 35 | 4747 |
| 5 | 3 | 64.7 | 71.7 | 4 / 35 | 5118 |
| 6 | 1 | 68.2 | 82.5 | 11 / 35 | 5653 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 44 | 23% |
| kid.Gladiator .7.2 | 32 | 41% |
| jcs.Seth 1.8 | 12 | 67% |
| tcf.Reach 3 | 7 | 29% |
| cli.Dancer 1.1 | 3 | 67% |
| ratosh.Wesco 1.4 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 66 | 39% | 76 |
| kid.Gladiator .7.2 | 60 | 35% | 68 |
| jcs.Seth 1.8 | 16 | 9% | 27 |
| tcf.Reach 3 | 10 | 6% | 14 |
| ratosh.Wesco 1.4 | 7 | 4% | 10 |
| sample.RamFire 1.0 | 5 | 3% | 5 |
| cli.Dancer 1.1 | 4 | 2% | 6 |
| sample.VelociRobot 1.0 | 2 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.6 | 68.9 | 18 / 210 | 3.80 | 13.5% | 20629 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 167 |
| hadur117.micro.Saor 0.2 | 2.2 | 13.5% | 18 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.8% | 12 |
| rz.HawkOnFire 0.1 | 4.2 | 11.8% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.2% | 9 |
| wit.Chuliath 1.0 | 6.7 | 7.2% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 7.0% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 5.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 69.2 | 2 / 35 | 3556 |
| 2 | 3 | 58.3 | 62.2 | 3 / 35 | 3252 |
| 3 | 2 | 60.6 | 69.8 | 2 / 35 | 3630 |
| 4 | 2 | 60.8 | 71.7 | 3 / 35 | 3261 |
| 5 | 2 | 61.7 | 72.4 | 6 / 35 | 3166 |
| 6 | 2 | 61.0 | 67.9 | 2 / 35 | 3764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 49 | 6% |
| gh.mini.Gruwel 0.9 | 8 | 38% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 80% |
| wit.Chuliath 1.0 | 3 | 67% |

Hadur died in 192 of 210 rounds, at a mean tick of 669. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 114 | 59% | 117 |
| gh.mini.Gruwel 0.9 | 31 | 16% | 36 |
| rz.HawkOnFire 0.1 | 16 | 8% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 5% | 13 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8 | 4% | 8 |
| wit.Chuliath 1.0 | 4 | 2% | 6 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |

## Melee bench: F36

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 85.8 | 144 / 210 | 2.28 | 19.8% | 33236 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.8% | 144 |
| alpha.RainingFire 1.0 | 2.7 | 12.3% | 24 |
| bzdp.Pansy 2.1 | 3.2 | 11.6% | 11 |
| mz.Cork 0.1 | 4.5 | 10.3% | 8 |
| bvh.micro.Freya 0.3 | 4.7 | 10.6% | 7 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.3% | 6 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.1% | 4 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.7% | 1 |
| dl.BetterWalls 1.0 | 9.2 | 5.8% | 3 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.8 | 27 / 35 | 5834 |
| 2 | 1 | 67.8 | 79.0 | 21 / 35 | 5280 |
| 3 | 1 | 69.7 | 85.4 | 25 / 35 | 5529 |
| 4 | 1 | 69.0 | 83.8 | 23 / 35 | 5570 |
| 5 | 1 | 70.6 | 89.8 | 26 / 35 | 5677 |
| 6 | 1 | 69.2 | 86.0 | 22 / 35 | 5346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 41 | 95% |
| bvh.micro.Freya 0.3 | 32 | 100% |
| mz.Cork 0.1 | 26 | 88% |
| alpha.RainingFire 1.0 | 25 | 60% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| m3thos.Eva02 0.7.1 | 5 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 22% | 28 |
| dl.BetterWalls 1.0 | 11 | 16% | 23 |
| bvh.mini.Fenrir 0.39 | 10 | 15% | 14 |
| mz.Cork 0.1 | 9 | 13% | 35 |
| bzdp.Pansy 2.1 | 8 | 12% | 45 |
| m3thos.Eva02 0.7.1 | 8 | 12% | 21 |
| bvh.micro.Freya 0.3 | 6 | 9% | 29 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 9 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.0 | 136 / 210 | 2.71 | 18.4% | 33591 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.4% | 136 |
| germ.TheMind .2 | 3.3 | 10.5% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 10.8% | 8 |
| EBBU.Sim2 1.02 | 3.8 | 10.3% | 10 |
| agrach.Dalek 1.0 | 5.3 | 9.6% | 16 |
| mb.Beast 0.1 | 6.8 | 8.2% | 6 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.5% | 11 |
| lmk.ACPFinal 0.1 | 7.3 | 8.0% | 4 |
| skm.Ryubot 1.0 | 8.0 | 8.0% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.5 | 7.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 77.8 | 24 / 35 | 5157 |
| 2 | 1 | 67.8 | 83.2 | 22 / 35 | 5965 |
| 3 | 1 | 68.6 | 85.4 | 24 / 35 | 5616 |
| 4 | 1 | 67.2 | 81.9 | 22 / 35 | 5693 |
| 5 | 1 | 65.0 | 73.0 | 19 / 35 | 5500 |
| 6 | 1 | 68.2 | 84.8 | 25 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 32 | 88% |
| EBBU.Sim2 1.02 | 24 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 100% |
| stelo.UntouchableNano 1.3 | 17 | 100% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 14 | 100% |
| agrach.Dalek 1.0 | 9 | 78% |
| lmk.ACPFinal 0.1 | 8 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 324. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 18 | 24% | 33 |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 19% | 40 |
| mn.nano.perceptual.Impact 1.3.0 | 12 | 16% | 15 |
| EBBU.Sim2 1.02 | 9 | 12% | 33 |
| germ.TheMind .2 | 9 | 12% | 32 |
| stelo.UntouchableNano 1.3 | 4 | 5% | 15 |
| mb.Beast 0.1 | 3 | 4% | 22 |
| lmk.ACPFinal 0.1 | 3 | 4% | 9 |
| skm.Ryubot 1.0 | 2 | 3% | 11 |

## Melee bench: F38

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 73.0 | 59 / 210 | 3.43 | 15.1% | 24743 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.2 | 16.0% | 90 |
| hadur117.micro.Saor 0.2 | 1.8 | 15.1% | 59 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 17 |
| cs.Wren 1.0 | 4.5 | 10.8% | 12 |
| bts.mega.Gnarly 1.4 | 4.7 | 10.7% | 21 |
| kdf.KoulDestroyer 1.0 | 6.2 | 9.5% | 4 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.7 | 9.0% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.5% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.7% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 75.6 | 9 / 35 | 3923 |
| 2 | 2 | 62.5 | 71.4 | 12 / 35 | 4015 |
| 3 | 2 | 62.0 | 71.1 | 8 / 35 | 3910 |
| 4 | 1 | 64.3 | 76.2 | 13 / 35 | 4287 |
| 5 | 2 | 62.4 | 72.1 | 8 / 35 | 4134 |
| 6 | 2 | 63.1 | 71.4 | 9 / 35 | 4474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 60 | 20% |
| bvh.mini.Freya 0.55 | 14 | 86% |
| bts.mega.Gnarly 1.4 | 13 | 62% |
| cs.Wren 1.0 | 11 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 90% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 76 | 50% | 90 |
| bvh.mini.Freya 0.55 | 28 | 19% | 36 |
| bts.mega.Gnarly 1.4 | 13 | 9% | 25 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 7% | 19 |
| cs.Wren 1.0 | 8 | 5% | 18 |
| kdf.KoulDestroyer 1.0 | 8 | 5% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 4 | 3% | 8 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 3 |

## Melee bench: F39

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 78.0 | 58 / 210 | 2.98 | 16.8% | 31335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 16.8% | 58 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 32 |
| az.Ololobot 0.2.4 | 3.0 | 12.6% | 71 |
| catcat20.Lambda 0.024 | 4.0 | 11.2% | 32 |
| gimp.GimpBot 0.1 | 5.5 | 8.9% | 1 |
| winamp32.micro.MicroMacro 1.0 | 5.8 | 8.8% | 6 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.1% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 7.8 | 7.5% | 9 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.9% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 74.3 | 8 / 35 | 4905 |
| 2 | 1 | 67.2 | 83.8 | 14 / 35 | 5498 |
| 3 | 1 | 64.6 | 74.9 | 7 / 35 | 5275 |
| 4 | 1 | 63.6 | 74.6 | 8 / 35 | 4971 |
| 5 | 1 | 65.9 | 80.3 | 9 / 35 | 5412 |
| 6 | 1 | 66.2 | 80.3 | 12 / 35 | 5274 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 40 | 65% |
| az.Ololobot 0.2.4 | 36 | 6% |
| catcat20.Lambda 0.024 | 30 | 53% |
| winamp32.micro.MicroMacro 1.0 | 6 | 50% |
| stelo.SoRobotNanoMelee 1.2 | 6 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 50% |

Hadur died in 153 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 46 | 30% | 55 |
| bvh.fry.Freya 0.82 | 42 | 27% | 60 |
| catcat20.Lambda 0.024 | 30 | 20% | 40 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 9% | 16 |
| apollokidd.ApolloKidd 0.9 | 8 | 5% | 12 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 4 | 3% | 5 |
| gimp.GimpBot 0.1 | 3 | 2% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 1% | 5 |

## Melee bench: F40

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.5 | 121 / 210 | 2.49 | 18.6% | 29717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.6% | 121 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 50 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 11.3% | 13 |
| mz.AntiGrav 1.0 | 4.0 | 10.8% | 9 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.5% | 7 |
| alpha.BlackIce 1.0 | 6.3 | 9.1% | 1 |
| stelo.Randomness 1.0 | 6.7 | 8.5% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.6% | 1 |
| sample.Corners 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 78.7 | 22 / 35 | 5059 |
| 2 | 1 | 67.0 | 79.7 | 18 / 35 | 4805 |
| 3 | 1 | 69.4 | 89.5 | 22 / 35 | 4803 |
| 4 | 1 | 67.7 | 84.8 | 17 / 35 | 4714 |
| 5 | 1 | 67.9 | 84.1 | 19 / 35 | 4779 |
| 6 | 1 | 69.7 | 84.1 | 23 / 35 | 5557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 71 | 63% |
| mz.AntiGrav 1.0 | 26 | 96% |
| Polkwane.SmashMelee 1.0 | 23 | 91% |
| kano.gamma.KanoGamma 1.8 | 17 | 82% |
| stelo.Randomness 1.0 | 9 | 78% |
| sample.Corners 1.0 | 4 | 75% |
| alpha.BlackIce 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 39 | 43% | 66 |
| Polkwane.SmashMelee 1.0 | 11 | 12% | 23 |
| mz.AntiGrav 1.0 | 9 | 10% | 35 |
| stelo.Randomness 1.0 | 8 | 9% | 18 |
| alpha.BlackIce 1.0 | 8 | 9% | 12 |
| kano.gamma.KanoGamma 1.8 | 7 | 8% | 36 |
| amk.superstrike.SuperStrike 0.3 | 5 | 6% | 11 |
| sample.Corners 1.0 | 2 | 2% | 5 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 72.7 | 81 / 210 | 3.46 | 15.9% | 27028 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| eem.EvBotNG v12.8 | 1.3 | 16.1% | 78 |
| hadur117.micro.Saor 0.2 | 1.7 | 15.9% | 81 |
| ary.Swarm 1.1 | 3.5 | 12.6% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.8% | 25 |
| shrub.Silver v048 | 5.5 | 9.5% | 3 |
| simonton.nano.MeleeSeed 1.8 | 5.7 | 9.6% | 7 |
| zyx.nano.Ant 1.1 | 6.8 | 8.0% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.3% | 5 |
| stelo.Mirror 1.1 | 8.7 | 6.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 77.8 | 13 / 35 | 4814 |
| 2 | 2 | 63.7 | 69.2 | 15 / 35 | 4406 |
| 3 | 2 | 63.6 | 69.8 | 9 / 35 | 4733 |
| 4 | 2 | 63.2 | 71.7 | 12 / 35 | 4185 |
| 5 | 2 | 62.5 | 67.6 | 13 / 35 | 4115 |
| 6 | 1 | 67.3 | 80.0 | 19 / 35 | 4775 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 45 | 31% |
| lessonz.robocode.Oz 0.5.0 | 30 | 83% |
| ary.Swarm 1.1 | 25 | 100% |
| simonton.nano.MeleeSeed 1.8 | 13 | 92% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 59 | 45% | 79 |
| lessonz.robocode.Oz 0.5.0 | 18 | 14% | 33 |
| ary.Swarm 1.1 | 16 | 12% | 40 |
| simonton.nano.MeleeSeed 1.8 | 14 | 11% | 26 |
| zyx.nano.Ant 1.1 | 13 | 10% | 13 |
| acogdev.alpha 0.2 | 4 | 3% | 5 |
| shrub.Silver v048 | 2 | 2% | 6 |
| stelo.Mirror 1.1 | 2 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 2 |

## Melee bench: F42

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 77.4 | 52 / 210 | 3.04 | 16.6% | 31280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| wompi.Wallaby 5.1 | 1.5 | 17.0% | 96 |
| hadur117.micro.Saor 0.2 | 1.5 | 16.6% | 52 |
| ara.Shera 0.88 | 3.5 | 13.2% | 33 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 26 |
| amz.NanoClone 1.41 | 5.5 | 9.2% | 3 |
| maribo.IotaCT 1.1 | 5.8 | 7.9% | 0 |
| dsw.StaticD 1.0 | 6.7 | 7.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.5% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 75.2 | 10 / 35 | 4928 |
| 2 | 1 | 68.0 | 81.6 | 12 / 35 | 5794 |
| 3 | 2 | 65.7 | 77.1 | 10 / 35 | 5331 |
| 4 | 1 | 67.7 | 85.4 | 7 / 35 | 5591 |
| 5 | 2 | 62.3 | 69.2 | 5 / 35 | 4759 |
| 6 | 1 | 64.9 | 75.6 | 8 / 35 | 4877 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 48 | 23% |
| maribo.mini.MiniQuester 0.1 | 30 | 70% |
| ara.Shera 0.88 | 26 | 54% |
| amz.NanoClone 1.41 | 3 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 84 | 53% | 100 |
| ara.Shera 0.88 | 31 | 20% | 45 |
| maribo.mini.MiniQuester 0.1 | 20 | 13% | 36 |
| amz.NanoClone 1.41 | 7 | 4% | 8 |
| maribo.IotaCT 1.1 | 6 | 4% | 8 |
| dsw.StaticD 1.0 | 6 | 4% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 3 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 68.0 | 11 / 210 | 3.88 | 13.4% | 22582 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 167 |
| hadur117.micro.Saor 0.2 | 2.3 | 13.4% | 11 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.3% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 4.0 | 11.2% | 4 |
| dummy.micro.Sparrow 2.5 | 4.7 | 11.1% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.9% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.8 | 64.4 | 1 / 35 | 3810 |
| 2 | 2 | 62.2 | 71.4 | 3 / 35 | 3640 |
| 3 | 2 | 61.2 | 67.0 | 2 / 35 | 3621 |
| 4 | 2 | 63.1 | 71.1 | 2 / 35 | 3819 |
| 5 | 2 | 63.5 | 74.6 | 2 / 35 | 3966 |
| 6 | 4 | 58.5 | 59.4 | 1 / 35 | 3726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 60 | 2% |
| brainfade.melee.Dusk 0.44 | 7 | 43% |
| dummy.micro.Sparrow 2.5 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 199 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 123 | 62% | 125 |
| brainfade.melee.Dusk 0.44 | 25 | 13% | 28 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 11% | 22 |
| dummy.micro.Sparrow 2.5 | 15 | 8% | 20 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |

## Melee bench: F44

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.1 | 102 / 210 | 2.34 | 19.1% | 34151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 19.1% | 102 |
| stelo.Liblix 0.3.1 | 2.0 | 15.1% | 80 |
| tzu.TheArtOfWar 1.2 | 3.2 | 12.3% | 16 |
| wompi.Quokka 1.6 | 4.5 | 9.9% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4.8 | 9.7% | 3 |
| jwirde.Gort 2.0 | 6.0 | 8.9% | 4 |
| disan.Chair 2.2.0 | 7.0 | 8.0% | 2 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.4% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.9% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 87.9 | 19 / 35 | 6320 |
| 2 | 1 | 69.3 | 86.7 | 18 / 35 | 5680 |
| 3 | 1 | 69.2 | 87.3 | 17 / 35 | 5662 |
| 4 | 1 | 69.4 | 87.3 | 19 / 35 | 5647 |
| 5 | 1 | 66.7 | 80.6 | 11 / 35 | 5388 |
| 6 | 1 | 67.8 | 80.6 | 18 / 35 | 5454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 64 | 28% |
| tzu.TheArtOfWar 1.2 | 55 | 84% |
| wompi.Quokka 1.6 | 14 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 11 | 91% |
| disan.Chair 2.2.0 | 7 | 100% |
| jwirde.Gort 2.0 | 7 | 86% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 65 | 60% | 93 |
| tzu.TheArtOfWar 1.2 | 20 | 19% | 60 |
| wompi.Quokka 1.6 | 8 | 7% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 5% | 9 |
| stf.PanzerGeneral 0.1 | 4 | 4% | 7 |
| jwirde.Gort 2.0 | 3 | 3% | 14 |
| disan.Chair 2.2.0 | 2 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| sample.Crazy 1.0 | 0 | 0% | 1 |

## Melee bench: F45

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 81.4 | 98 / 210 | 2.68 | 18.9% | 33890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.micro.Saor 0.2 | 1.0 | 18.9% | 98 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.4% | 92 |
| jje.BagPuss 1.2 | 2.7 | 12.2% | 10 |
| myl.nano.Graviton 1.10 | 4.8 | 10.1% | 4 |
| sul.Lunar 1.1 | 5.0 | 10.0% | 3 |
| fm.claire 1.7 | 6.0 | 9.0% | 1 |
| hvilela.HVilela 0.9 | 6.3 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.8 | 7.7% | 1 |
| wit.Deep7 2.0 | 9.3 | 6.0% | 0 |
| abud.ThirdRobo 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 87.6 | 21 / 35 | 5938 |
| 2 | 1 | 70.3 | 88.9 | 19 / 35 | 6146 |
| 3 | 1 | 66.8 | 78.1 | 13 / 35 | 5386 |
| 4 | 1 | 66.9 | 78.1 | 13 / 35 | 5548 |
| 5 | 1 | 66.8 | 75.6 | 16 / 35 | 5313 |
| 6 | 1 | 67.8 | 80.0 | 16 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 95 | 43% |
| jje.BagPuss 1.2 | 22 | 77% |
| myl.nano.Graviton 1.10 | 13 | 100% |
| sul.Lunar 1.1 | 9 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 6 | 83% |
| fm.claire 1.7 | 3 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 58 | 52% | 0 |
| jje.BagPuss 1.2 | 15 | 13% | 56 |
| hvilela.HVilela 0.9 | 10 | 9% | 19 |
| sul.Lunar 1.1 | 9 | 8% | 52 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 19 |
| myl.nano.Graviton 1.10 | 4 | 4% | 27 |
| fm.claire 1.7 | 4 | 4% | 13 |
| abud.ThirdRobo 1.0 | 3 | 3% | 12 |
| wit.Deep7 2.0 | 3 | 3% | 9 |

## Melee bench: F46

hadur117.micro.Saor 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 69.7 | 13 / 210 | 3.73 | 14.1% | 26120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.6% | 87 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 16.8% | 89 |
| hadur117.micro.Saor 0.2 | 3.0 | 14.1% | 13 |
| cx.Princess 1.0 | 4.5 | 10.4% | 16 |
| mz.MicroSheep 1.0 | 4.7 | 10.4% | 3 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.3 | 6.2% | 0 |
| arthord.NanoSatanMelee Beta | 7.8 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 71.7 | 4 / 35 | 4397 |
| 2 | 3 | 60.1 | 65.1 | 2 / 35 | 4137 |
| 3 | 3 | 62.2 | 73.0 | 0 / 35 | 4281 |
| 4 | 3 | 61.2 | 67.9 | 4 / 35 | 4033 |
| 5 | 3 | 63.2 | 72.1 | 2 / 35 | 4680 |
| 6 | 3 | 61.8 | 68.3 | 1 / 35 | 4592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 41 | 10% |
| rsalesc.melee.Medina 0.4.5 | 22 | 5% |
| mz.MicroSheep 1.0 | 5 | 80% |
| cx.Princess 1.0 | 5 | 40% |
| sadoner.killer 0.2 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 740. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 88 | 45% | 92 |
| rsalesc.melee.Medina 0.4.5 | 70 | 36% | 72 |
| cx.Princess 1.0 | 18 | 9% | 20 |
| mz.MicroSheep 1.0 | 7 | 4% | 11 |
| sadoner.killer 0.2 | 5 | 3% | 6 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |

