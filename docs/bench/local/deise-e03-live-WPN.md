# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 83.9 | 50 / 210 | 2.45 | 16.7% | 29642 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 141 |
| hadur117.mini.DeiseWPN 0.2 | 2.0 | 16.7% | 50 |
| sgp.JollyNinja 3.53 | 3.8 | 11.4% | 9 |
| mz.MicroGodMelee 1 | 4.0 | 10.7% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.7% | 4 |
| lorneswork.Predator 1.0 | 5.5 | 9.3% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.1% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 81.9 | 8 / 35 | 4565 |
| 2 | 2 | 66.4 | 82.5 | 7 / 35 | 5209 |
| 3 | 2 | 67.0 | 84.4 | 10 / 35 | 5375 |
| 4 | 2 | 67.8 | 88.9 | 12 / 35 | 4912 |
| 5 | 2 | 65.8 | 83.8 | 5 / 35 | 4851 |
| 6 | 2 | 65.6 | 81.9 | 8 / 35 | 4730 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 114 | 14% |
| sgp.JollyNinja 3.53 | 20 | 80% |
| mz.MicroGodMelee 1 | 9 | 89% |
| lorneswork.Predator 1.0 | 5 | 60% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 100% |
| skm.butterfly 1.0 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| mym.EdgeStalker 1.0 | 1 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 1067. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 73% | 138 |
| sgp.JollyNinja 3.53 | 18 | 11% | 23 |
| lorneswork.Predator 1.0 | 10 | 6% | 15 |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 6% | 15 |
| mz.MicroGodMelee 1 | 4 | 3% | 10 |
| skm.butterfly 1.0 | 2 | 1% | 4 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 4 |

## Melee bench: F02

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 79.4 | 96 / 210 | 2.86 | 17.2% | 28650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.2 | 17.2% | 96 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.7% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.3% | 28 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.2% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.5% | 8 |
| Noran.BitchingElk 0.054 | 6.7 | 8.2% | 16 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.1% | 1 |
| sch.Simone 0.3d | 7.3 | 7.6% | 11 |
| stelo.PatternRobot 1.0 | 8.8 | 5.9% | 3 |
| fullsail.SweetTea 1.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 81.0 | 9 / 35 | 4641 |
| 2 | 1 | 66.2 | 79.0 | 17 / 35 | 4745 |
| 3 | 1 | 68.9 | 86.3 | 21 / 35 | 5236 |
| 4 | 1 | 65.5 | 78.7 | 16 / 35 | 4742 |
| 5 | 1 | 64.8 | 73.3 | 17 / 35 | 4567 |
| 6 | 1 | 65.5 | 77.8 | 16 / 35 | 4719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 48 | 63% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 46 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| Noran.BitchingElk 0.054 | 7 | 29% |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 83% |
| stelo.PatternRobot 1.0 | 5 | 100% |
| sch.Simone 0.3d | 5 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 36% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 22 | 19% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 11% | 20 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 9% | 17 |
| Noran.BitchingElk 0.054 | 10 | 9% | 13 |
| stelo.PatternRobot 1.0 | 8 | 7% | 10 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 9 |
| fullsail.SweetTea 1.1 | 4 | 4% | 6 |
| sch.Simone 0.3d | 1 | 1% | 9 |

## Melee bench: F03

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.5 | 150 / 210 | 1.68 | 20.4% | 38276 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.4% | 150 |
| radnor.DoctorBob 1.42 | 2.5 | 13.4% | 16 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.9% | 13 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 28 |
| urdos.URDOS 1.3 | 5.2 | 9.1% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 6.0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.0 | 24 / 35 | 6320 |
| 2 | 1 | 70.4 | 93.0 | 25 / 35 | 6222 |
| 3 | 1 | 71.7 | 94.6 | 27 / 35 | 6742 |
| 4 | 1 | 70.6 | 94.6 | 27 / 35 | 6088 |
| 5 | 1 | 70.7 | 92.7 | 23 / 35 | 6584 |
| 6 | 1 | 70.5 | 93.0 | 24 / 35 | 6320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 62 | 95% |
| vuen.Cake 2.51 | 59 | 64% |
| radnor.DoctorBob 1.42 | 40 | 98% |
| oa.weak.FlyMk1 0.1 | 5 | 80% |
| ghent.ArthurPanzergon 1.0.0 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 3 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 28 | 47% | 71 |
| radnor.DoctorBob 1.42 | 12 | 20% | 40 |
| kawigi.nano.Lib 1.0 | 10 | 17% | 65 |
| adt.Ar1 2.1 | 3 | 5% | 6 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 5% | 4 |
| urdos.URDOS 1.3 | 2 | 3% | 5 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 9 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.6 | 35 / 210 | 2.39 | 17.3% | 34201 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 164 |
| hadur117.mini.DeiseWPN 0.2 | 2.0 | 17.3% | 35 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 7 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 4 |
| josago.Jorgito 0.16 | 5.3 | 8.8% | 0 |
| tj.zombie1n 1.0.1 | 5.8 | 7.5% | 1 |
| css.Delitioner 0.11 | 6.8 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.4% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 86.3 | 6 / 35 | 5806 |
| 2 | 2 | 69.8 | 89.2 | 11 / 35 | 6328 |
| 3 | 2 | 65.8 | 80.0 | 2 / 35 | 5310 |
| 4 | 2 | 67.2 | 82.9 | 5 / 35 | 5502 |
| 5 | 2 | 67.7 | 83.8 | 3 / 35 | 5792 |
| 6 | 2 | 67.9 | 85.4 | 8 / 35 | 5463 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 139 | 19% |
| apc.LeeroyJenkins2 1.0 | 7 | 57% |
| TNT.TNT 0.99.1 | 5 | 60% |
| tj.zombie1n 1.0.1 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1405. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 138 | 78% | 164 |
| apc.LeeroyJenkins2 1.0 | 17 | 10% | 21 |
| TNT.TNT 0.99.1 | 8 | 5% | 11 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.1 | 68.9 | 17 / 210 | 3.80 | 12.9% | 20030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.8% | 123 |
| justin.DemonicRage 3.4 | 1.7 | 17.3% | 52 |
| hadur117.mini.DeiseWPN 0.2 | 3.5 | 12.9% | 17 |
| wompi.Numbat 2.1 | 3.5 | 12.8% | 13 |
| ms.Ares 0.19 | 5.3 | 9.4% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.3 | 5.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.7 | 5.8% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 71.1 | 4 / 35 | 3043 |
| 2 | 3 | 61.5 | 70.8 | 4 / 35 | 3709 |
| 3 | 4 | 58.1 | 64.8 | 3 / 35 | 2945 |
| 4 | 3 | 58.4 | 64.4 | 2 / 35 | 3176 |
| 5 | 4 | 60.7 | 70.2 | 0 / 35 | 3513 |
| 6 | 4 | 61.3 | 72.1 | 4 / 35 | 3644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 28 | 7% |
| justin.DemonicRage 3.4 | 18 | 33% |
| wompi.Numbat 2.1 | 7 | 100% |
| supersample.SuperBoxBot 1.0 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 61 | 31% | 63 |
| justin.DemonicRage 3.4 | 58 | 30% | 66 |
| wompi.Numbat 2.1 | 36 | 19% | 42 |
| ms.Ares 0.19 | 20 | 10% | 20 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 6 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.8 | 97 / 210 | 2.72 | 16.9% | 27040 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 16.9% | 97 |
| jekl.StoneGhost 0.7 | 2.3 | 14.5% | 36 |
| origin.SleepSiphon 1.7b | 3.3 | 13.4% | 43 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 13.0% | 24 |
| mld.Wisdom 1.0 | 5.0 | 10.1% | 1 |
| gg.Wolverine 2.0 | 6.5 | 8.2% | 5 |
| spinnercat.Omen 1.0 | 7.3 | 7.2% | 2 |
| DBall.NUKE 0.1 | 8.0 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.6% | 3 |
| sample.Fire 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.0 | 18 / 35 | 4481 |
| 2 | 1 | 63.8 | 74.9 | 16 / 35 | 3897 |
| 3 | 1 | 65.9 | 80.6 | 16 / 35 | 4482 |
| 4 | 1 | 67.1 | 84.4 | 17 / 35 | 4878 |
| 5 | 1 | 66.6 | 83.2 | 15 / 35 | 4577 |
| 6 | 1 | 66.3 | 81.0 | 15 / 35 | 4725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 43 | 93% |
| origin.SleepSiphon 1.7b | 30 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 73% |
| gg.Wolverine 2.0 | 8 | 88% |
| spinnercat.Omen 1.0 | 5 | 100% |
| mld.Wisdom 1.0 | 3 | 100% |
| DBall.NUKE 0.1 | 2 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 31 | 27% | 62 |
| origin.SleepSiphon 1.7b | 28 | 25% | 51 |
| pe.minimelee.SandboxMiniMelee 1.1 | 26 | 23% | 50 |
| mld.Wisdom 1.0 | 10 | 9% | 18 |
| gg.Wolverine 2.0 | 8 | 7% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 9 |
| spinnercat.Omen 1.0 | 5 | 4% | 8 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 92.6 | 124 / 210 | 1.66 | 20.0% | 35745 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.0% | 124 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 16.7% | 33 |
| rtk.Tachikoma 1.0 | 2.7 | 16.1% | 32 |
| franzor.Lizt 1.3.1 | 4.5 | 10.6% | 10 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.0% | 11 |
| exauge.GateKeeper 1.1.121g | 6.3 | 7.9% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.7 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 19 / 35 | 6159 |
| 2 | 1 | 70.8 | 92.1 | 21 / 35 | 5532 |
| 3 | 1 | 70.4 | 89.8 | 18 / 35 | 5508 |
| 4 | 1 | 72.6 | 94.9 | 23 / 35 | 6438 |
| 5 | 1 | 71.1 | 91.7 | 20 / 35 | 5986 |
| 6 | 1 | 72.1 | 94.6 | 23 / 35 | 6122 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 74% |
| rsalesc.melee.Monk 0.3.6c | 37 | 35% |
| oog.melee.CapuletDroid 1.1 | 29 | 79% |
| franzor.Lizt 1.3.1 | 12 | 100% |
| exauge.GateKeeper 1.1.121g | 5 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1290. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rtk.Tachikoma 1.0 | 42 | 49% | 114 |
| rsalesc.melee.Monk 0.3.6c | 34 | 40% | 59 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 28 |
| franzor.Lizt 1.3.1 | 2 | 2% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 4 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.4 | 123 / 210 | 2.04 | 18.9% | 30121 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.9% | 123 |
| tm.Yuugao 1.0 | 2.7 | 12.9% | 36 |
| shrub.Vapour v159 | 2.8 | 12.4% | 17 |
| Krabb.sliNk.Garm 0.9u | 3.5 | 11.1% | 19 |
| com.spp.robocode.MostlyHarmless 010 | 5.8 | 8.8% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.2% | 6 |
| m3thos.Eva00 1.1 | 6.7 | 8.0% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.4% | 1 |
| SHAM.WOW 1.4 | 8.8 | 6.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 85.4 | 18 / 35 | 4503 |
| 2 | 1 | 69.2 | 90.8 | 21 / 35 | 5390 |
| 3 | 1 | 69.6 | 92.4 | 25 / 35 | 5088 |
| 4 | 1 | 66.5 | 83.2 | 19 / 35 | 4648 |
| 5 | 1 | 69.0 | 88.6 | 19 / 35 | 5387 |
| 6 | 1 | 68.9 | 90.2 | 21 / 35 | 5105 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 46 | 65% |
| shrub.Vapour v159 | 39 | 82% |
| Krabb.sliNk.Garm 0.9u | 29 | 83% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 87% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 4 | 75% |
| m3thos.Eva00 1.1 | 4 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 32 | 36% | 73 |
| shrub.Vapour v159 | 20 | 23% | 53 |
| Krabb.sliNk.Garm 0.9u | 12 | 14% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 10% | 17 |
| com.spp.robocode.MostlyHarmless 010 | 7 | 8% | 20 |
| m3thos.Eva00 1.1 | 2 | 2% | 7 |
| SHAM.WOW 1.4 | 2 | 2% | 3 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 2 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 74.1 | 61 / 210 | 3.33 | 15.5% | 25821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 99 |
| hadur117.mini.DeiseWPN 0.2 | 2.2 | 15.5% | 61 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 23 |
| yagami.Tidus 0.11 | 4.3 | 11.1% | 3 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.2% | 9 |
| mc2.enemy.Original 0.9 | 5.5 | 9.6% | 13 |
| dft.Calliope 5.6 | 7.0 | 7.4% | 3 |
| step.nanoPri 1.0 | 8.3 | 5.5% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.5 | 68.9 | 5 / 35 | 3962 |
| 2 | 2 | 64.7 | 77.8 | 11 / 35 | 4288 |
| 3 | 2 | 64.6 | 74.9 | 13 / 35 | 4288 |
| 4 | 2 | 64.8 | 75.6 | 12 / 35 | 4272 |
| 5 | 2 | 63.1 | 69.8 | 8 / 35 | 4521 |
| 6 | 2 | 65.3 | 77.8 | 12 / 35 | 4490 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 38% |
| kc.micro.Figment 1.0 | 33 | 73% |
| yagami.Tidus 0.11 | 11 | 100% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| mc2.enemy.Original 0.9 | 5 | 60% |
| dft.Calliope 5.6 | 3 | 33% |

Hadur died in 150 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 62 | 41% | 80 |
| kc.micro.Figment 1.0 | 39 | 26% | 63 |
| yagami.Tidus 0.11 | 19 | 13% | 30 |
| pedersen.Grishnakh 1.0 | 11 | 7% | 14 |
| mc2.enemy.Original 0.9 | 7 | 5% | 11 |
| dft.Calliope 5.6 | 5 | 3% | 6 |
| robar.nano.Assertive_Melee 0.2 | 3 | 2% | 3 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.4 | 157 / 210 | 1.59 | 20.2% | 33721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.2% | 157 |
| DTF.Kludgy 1.2b | 2.3 | 14.0% | 30 |
| ejb.Polaris 1.0.1 | 3.3 | 12.2% | 9 |
| ne.Chimera 1.2 | 3.7 | 12.0% | 3 |
| tvv.micro.Antares 1.1.1 | 5.2 | 10.7% | 5 |
| vStar.RAFzilla 2.15 | 5.5 | 9.8% | 4 |
| sam.Samspin 1.0 | 7.8 | 5.8% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.8% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.3 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.8 | 23 / 35 | 5840 |
| 2 | 1 | 69.7 | 91.1 | 24 / 35 | 5387 |
| 3 | 1 | 71.3 | 97.1 | 28 / 35 | 5652 |
| 4 | 1 | 69.6 | 91.7 | 26 / 35 | 5214 |
| 5 | 1 | 71.3 | 95.2 | 28 / 35 | 5933 |
| 6 | 1 | 70.9 | 95.6 | 28 / 35 | 5695 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 65 | 75% |
| ejb.Polaris 1.0.1 | 39 | 97% |
| ne.Chimera 1.2 | 28 | 93% |
| vStar.RAFzilla 2.15 | 20 | 90% |
| tvv.micro.Antares 1.1.1 | 18 | 89% |
| donjezza.Muncho 1.0 | 6 | 67% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 29 | 55% | 74 |
| ne.Chimera 1.2 | 7 | 13% | 42 |
| ejb.Polaris 1.0.1 | 6 | 11% | 47 |
| vStar.RAFzilla 2.15 | 3 | 6% | 16 |
| tvv.micro.Antares 1.1.1 | 3 | 6% | 12 |
| donjezza.Muncho 1.0 | 3 | 6% | 6 |
| kurios.DOSexe .9b | 2 | 4% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.3 | 80 / 210 | 2.78 | 16.8% | 27418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.3 | 16.8% | 80 |
| rz.Aleph 0.34 | 1.7 | 16.6% | 71 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.0% | 23 |
| djc.DynaBot 0.1.1 | 4.0 | 11.2% | 16 |
| br2.MobyDickBot 1.6 | 5.5 | 8.8% | 7 |
| rdt199.Warlord 0.73 | 5.8 | 8.6% | 12 |
| uji.YellohFellah 1.0 | 6.7 | 7.8% | 3 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 80.0 | 13 / 35 | 4762 |
| 2 | 1 | 65.6 | 80.3 | 14 / 35 | 4620 |
| 3 | 2 | 65.7 | 80.0 | 12 / 35 | 4658 |
| 4 | 1 | 66.5 | 82.2 | 13 / 35 | 4734 |
| 5 | 1 | 64.9 | 79.7 | 13 / 35 | 4279 |
| 6 | 1 | 65.5 | 79.4 | 15 / 35 | 4365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 59 | 56% |
| cx.mini.Nimrod 0.55 | 20 | 75% |
| djc.DynaBot 0.1.1 | 14 | 71% |
| uji.YellohFellah 1.0 | 11 | 100% |
| rdt199.Warlord 0.73 | 8 | 88% |
| br2.MobyDickBot 1.6 | 6 | 67% |

Hadur died in 132 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 64 | 48% | 96 |
| cx.mini.Nimrod 0.55 | 25 | 19% | 37 |
| djc.DynaBot 0.1.1 | 14 | 11% | 24 |
| rdt199.Warlord 0.73 | 12 | 9% | 21 |
| uji.YellohFellah 1.0 | 5 | 4% | 15 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| br2.MobyDickBot 1.6 | 2 | 2% | 7 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.9 | 118 / 210 | 2.36 | 17.8% | 24983 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 17.8% | 118 |
| bts.wiki.RipCurl 0.9b | 2.5 | 14.0% | 30 |
| nat.PallasHawk 1.0 | 3.2 | 13.1% | 30 |
| darkcanuck.Leon 1.01 | 3.3 | 12.3% | 19 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.2% | 10 |
| cs.sheldor.Talon 1.1 | 6.7 | 7.9% | 0 |
| jrm.Test0 1.0 | 6.7 | 7.9% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.8% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.2% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 91.7 | 22 / 35 | 4601 |
| 2 | 1 | 65.6 | 81.3 | 17 / 35 | 3976 |
| 3 | 1 | 67.8 | 87.9 | 21 / 35 | 4146 |
| 4 | 1 | 68.5 | 88.9 | 23 / 35 | 4312 |
| 5 | 1 | 64.7 | 79.7 | 14 / 35 | 3880 |
| 6 | 1 | 66.3 | 80.0 | 21 / 35 | 4068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 45 | 78% |
| bts.wiki.RipCurl 0.9b | 41 | 76% |
| darkcanuck.Leon 1.01 | 30 | 87% |
| brainfade.melee.Genghis 0.36 | 18 | 83% |
| jp.Perpy 16.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 681. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 25 | 27% | 58 |
| bts.wiki.RipCurl 0.9b | 24 | 26% | 50 |
| darkcanuck.Leon 1.01 | 20 | 22% | 56 |
| brainfade.melee.Genghis 0.36 | 10 | 11% | 20 |
| jrm.Test0 1.0 | 4 | 4% | 8 |
| stuff.Vlad 0.1 | 3 | 3% | 5 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 4 |
| jp.Perpy 16.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 80.9 | 55 / 210 | 2.72 | 15.7% | 25551 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.5 | 16.6% | 83 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 44 |
| hadur117.mini.DeiseWPN 0.2 | 2.3 | 15.7% | 55 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 19 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.3% | 8 |
| apc.Colossus2 0.17 | 6.3 | 7.8% | 1 |
| stelo.Wang 1.0 | 6.7 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.2% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.5 | 78.1 | 10 / 35 | 4404 |
| 2 | 2 | 65.5 | 83.2 | 10 / 35 | 4214 |
| 3 | 2 | 65.9 | 84.4 | 9 / 35 | 4369 |
| 4 | 3 | 62.9 | 75.6 | 4 / 35 | 4033 |
| 5 | 3 | 64.1 | 77.8 | 9 / 35 | 4292 |
| 6 | 2 | 66.3 | 86.3 | 13 / 35 | 4239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 50 | 56% |
| mn.Combat 3.25.0 | 47 | 34% |
| shinh.Entangled 0.3 | 16 | 44% |
| gh.micro.Gruweltje 0.7 | 5 | 60% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 37% | 73 |
| ags.Glacier 0.2.11 | 53 | 34% | 78 |
| shinh.Entangled 0.3 | 20 | 13% | 25 |
| gh.micro.Gruweltje 0.7 | 14 | 9% | 21 |
| stelo.Wang 1.0 | 6 | 4% | 7 |
| apc.Colossus2 0.17 | 3 | 2% | 4 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.2 | 154 / 210 | 1.70 | 20.2% | 34297 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.2% | 154 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 26 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.7% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 4.7 | 9.9% | 4 |
| co.edu.usb.rc.LidisTron 1.0 | 5.5 | 9.4% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.3% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.2% | 10 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.8 | 23 / 35 | 5965 |
| 2 | 1 | 70.4 | 92.4 | 27 / 35 | 5675 |
| 3 | 1 | 70.6 | 91.4 | 27 / 35 | 5775 |
| 4 | 1 | 70.3 | 92.4 | 24 / 35 | 5453 |
| 5 | 1 | 71.1 | 92.7 | 26 / 35 | 5904 |
| 6 | 1 | 70.9 | 94.3 | 27 / 35 | 5525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 87% |
| catcat20.shape.Theta 0.018 | 48 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 93% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 46% | 102 |
| catcat20.shape.Theta 0.018 | 16 | 29% | 50 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 7% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 2 | 4% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 7 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 7 |
| sample.TrackFire 1.0 | 1 | 2% | 1 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.4 | 91 / 210 | 2.77 | 17.5% | 31631 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 17.5% | 91 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.7% | 20 |
| emp.Yngwie 1.11 | 3.0 | 12.5% | 47 |
| mld.DustBunny 3.8 | 3.7 | 12.6% | 12 |
| cb.nano.Insomnia 1.0 | 5.3 | 10.8% | 10 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.4% | 28 |
| lambdaxy.TBot 0.1 | 7.5 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 84.4 | 18 / 35 | 5312 |
| 2 | 1 | 67.1 | 81.0 | 16 / 35 | 5284 |
| 3 | 1 | 65.7 | 77.1 | 14 / 35 | 5170 |
| 4 | 1 | 64.8 | 75.6 | 11 / 35 | 5020 |
| 5 | 1 | 68.4 | 85.4 | 19 / 35 | 5474 |
| 6 | 1 | 66.2 | 78.7 | 13 / 35 | 5371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 31 | 87% |
| emp.Yngwie 1.11 | 30 | 67% |
| mld.DustBunny 3.8 | 21 | 90% |
| cb.nano.Insomnia 1.0 | 14 | 64% |
| kawigi.robot.Girl 1.2 | 13 | 77% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.DustBunny 3.8 | 27 | 23% | 49 |
| emp.Yngwie 1.11 | 22 | 18% | 50 |
| cb.nano.Insomnia 1.0 | 21 | 18% | 20 |
| kawigi.micro.Shiz 1.1 | 20 | 17% | 44 |
| kawigi.robot.Girl 1.2 | 18 | 15% | 28 |
| divineomega.TrialBot 0.003 | 5 | 4% | 9 |
| lambdaxy.TBot 0.1 | 4 | 3% | 6 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 79.4 | 78 / 210 | 2.86 | 17.3% | 31766 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.3 | 17.3% | 78 |
| gh.Griezel 0.5.2 | 2.0 | 16.3% | 67 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.7 | 14.7% | 14 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.2% | 33 |
| bvh.fnr.Fenrir 0.36l | 5.2 | 9.4% | 5 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.2% | 7 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.7% | 3 |
| asd.Cthulhu 1.3 | 8.5 | 5.4% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.1% | 4 |
| repositorio.NanoStep 1.0 | 9.3 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 67.0 | 10 / 35 | 4878 |
| 2 | 1 | 67.7 | 80.6 | 12 / 35 | 5736 |
| 3 | 1 | 65.9 | 77.8 | 16 / 35 | 4828 |
| 4 | 1 | 67.9 | 85.4 | 14 / 35 | 5394 |
| 5 | 1 | 66.4 | 78.7 | 12 / 35 | 5265 |
| 6 | 1 | 68.8 | 86.7 | 14 / 35 | 5665 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 66 | 52% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 95% |
| techdude.forest.FlamingForest 1.1 | 13 | 31% |
| divineomega.DivineBot 1.9.4.5 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 3 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 36% | 86 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 29 | 22% | 48 |
| techdude.forest.FlamingForest 1.1 | 16 | 12% | 23 |
| bvh.fnr.Fenrir 0.36l | 14 | 11% | 16 |
| stelo.IntrinsicVolatility 1.4 | 9 | 7% | 12 |
| asd.Cthulhu 1.3 | 6 | 5% | 7 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 8 |

## Melee bench: F17

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 77.9 | 85 / 210 | 2.99 | 16.8% | 30555 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 16.8% | 85 |
| et.Predator 1.8 | 2.2 | 14.1% | 34 |
| cx.BlestPain 1.41 | 3.3 | 12.8% | 46 |
| oog.melee.Mercutio 1.0 | 4.8 | 11.4% | 18 |
| ahf.NanoAndrew .4 | 5.0 | 11.0% | 12 |
| nic.Nicator 2.4 | 5.0 | 11.3% | 11 |
| maribo.melee.BMV 0.1 | 6.7 | 9.7% | 3 |
| tex.Longbot 0.4 | 8.3 | 5.1% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.0% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.9 | 72.4 | 13 / 35 | 5097 |
| 2 | 1 | 68.9 | 86.0 | 19 / 35 | 5613 |
| 3 | 1 | 66.2 | 79.0 | 15 / 35 | 4844 |
| 4 | 1 | 65.7 | 76.8 | 13 / 35 | 5208 |
| 5 | 1 | 65.1 | 76.8 | 11 / 35 | 4936 |
| 6 | 1 | 65.1 | 76.2 | 14 / 35 | 4857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 41 | 76% |
| cx.BlestPain 1.41 | 22 | 45% |
| nic.Nicator 2.4 | 22 | 82% |
| oog.melee.Mercutio 1.0 | 16 | 69% |
| ahf.NanoAndrew .4 | 10 | 100% |
| maribo.melee.BMV 0.1 | 6 | 83% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 0% |

Hadur died in 125 of 210 rounds, at a mean tick of 883. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 31 | 25% | 47 |
| et.Predator 1.8 | 28 | 22% | 59 |
| oog.melee.Mercutio 1.0 | 18 | 14% | 27 |
| maribo.melee.BMV 0.1 | 16 | 13% | 20 |
| nic.Nicator 2.4 | 15 | 12% | 31 |
| ahf.NanoAndrew .4 | 9 | 7% | 16 |
| edu.otg.spr.TheTeacher 1.2 | 4 | 3% | 4 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| goblin.Bender 2.4 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.7 | 117 / 210 | 2.38 | 18.3% | 29202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.3% | 117 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.5% | 30 |
| agd.Mooserwirt2 2.7 | 2.8 | 11.9% | 23 |
| uji.DBH 1.1 | 4.5 | 10.3% | 9 |
| ratosh.Nobo 0.21 | 4.7 | 9.9% | 3 |
| spinnercat.Robovirus 2.718 | 6.2 | 8.9% | 9 |
| sigterm.Sigterm 1.0 | 6.8 | 8.1% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.4% | 4 |
| stelo.WangRobot 1.0 | 9.2 | 6.0% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.5 | 16 / 35 | 4835 |
| 2 | 1 | 68.3 | 86.7 | 21 / 35 | 4998 |
| 3 | 1 | 66.5 | 82.2 | 18 / 35 | 4897 |
| 4 | 1 | 67.3 | 84.4 | 20 / 35 | 4718 |
| 5 | 1 | 67.8 | 85.1 | 20 / 35 | 4894 |
| 6 | 1 | 67.9 | 86.3 | 22 / 35 | 4860 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 53 | 81% |
| agd.Mooserwirt2 2.7 | 21 | 86% |
| spinnercat.Robovirus 2.718 | 18 | 67% |
| stelo.WangRobot 1.0 | 13 | 77% |
| sigterm.Sigterm 1.0 | 11 | 91% |
| ratosh.Nobo 0.21 | 10 | 100% |
| uji.DBH 1.1 | 10 | 80% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 36 | 39% | 82 |
| agd.Mooserwirt2 2.7 | 13 | 14% | 37 |
| uji.DBH 1.1 | 10 | 11% | 17 |
| spinnercat.Robovirus 2.718 | 9 | 10% | 17 |
| ratosh.Nobo 0.21 | 8 | 9% | 18 |
| sigterm.Sigterm 1.0 | 7 | 8% | 15 |
| stelo.WangRobot 1.0 | 5 | 5% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 4 |

## Melee bench: F19

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.8 | 151 / 210 | 1.56 | 20.6% | 34496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.6% | 151 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.4% | 25 |
| mld.Infinity 2.2 | 2.8 | 14.4% | 29 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.1% | 2 |
| erdnis.Rover 0.3 | 5.2 | 10.1% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.7% | 2 |
| mbh.Mbh 0.1 | 7.2 | 6.8% | 0 |
| pac.ABC 2.1 | 8.0 | 6.5% | 0 |
| pbg.R2D2 1.0 | 8.7 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 89.8 | 24 / 35 | 5671 |
| 2 | 1 | 70.9 | 92.1 | 20 / 35 | 5485 |
| 3 | 1 | 72.5 | 95.6 | 26 / 35 | 6070 |
| 4 | 1 | 71.3 | 93.0 | 25 / 35 | 5702 |
| 5 | 1 | 72.3 | 96.8 | 30 / 35 | 5635 |
| 6 | 1 | 72.0 | 95.2 | 26 / 35 | 5933 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 98 | 88% |
| mld.Infinity 2.2 | 50 | 70% |
| krillr.mini.JointStrike 2.0.0 | 17 | 94% |
| erdnis.Rover 0.3 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 3 | 67% |
| pac.ABC 2.1 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 1266. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 23 | 38% | 124 |
| mld.Infinity 2.2 | 21 | 35% | 27 |
| krillr.mini.JointStrike 2.0.0 | 9 | 15% | 27 |
| erdnis.Rover 0.3 | 5 | 8% | 14 |
| patson.PatsonTestBot 1.0 | 2 | 3% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 2 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.7 | 117 / 210 | 1.92 | 19.7% | 34426 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 19.7% | 117 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.2% | 37 |
| fwb.Nine 1.0.1 | 3.3 | 11.3% | 24 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.8% | 7 |
| catcat20.Rabbit 0.001 | 4.5 | 10.3% | 20 |
| bayen.nut.Squirrel 1.615 | 6.7 | 7.9% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.6% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 18 / 35 | 5715 |
| 2 | 1 | 68.4 | 88.6 | 16 / 35 | 5278 |
| 3 | 1 | 70.1 | 91.4 | 20 / 35 | 5670 |
| 4 | 1 | 68.6 | 84.4 | 17 / 35 | 5780 |
| 5 | 1 | 72.1 | 95.6 | 28 / 35 | 6314 |
| 6 | 1 | 68.9 | 87.3 | 18 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 72 | 81% |
| fwb.Nine 1.0.1 | 35 | 40% |
| catcat20.Rabbit 0.001 | 29 | 66% |
| bayen.nut.Squirrel 1.615 | 13 | 100% |
| nz.jdc.nano.GridFu 1.0 | 12 | 75% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 1378. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 39% | 89 |
| fwb.Nine 1.0.1 | 26 | 28% | 19 |
| catcat20.Rabbit 0.001 | 18 | 19% | 40 |
| nz.jdc.nano.GridFu 1.0 | 9 | 10% | 28 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 13 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 5 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 8 |

## Melee bench: F21

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.3 | 140 / 210 | 1.60 | 20.8% | 36501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.8% | 140 |
| eem.EvBot v4.6.16 | 2.0 | 16.3% | 55 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.9% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 3 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 5 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.8% | 2 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.0 | 6.1% | 1 |
| PSW.Relentless 0.1 | 8.3 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.2 | 22 / 35 | 5630 |
| 2 | 1 | 70.8 | 92.1 | 21 / 35 | 5984 |
| 3 | 1 | 72.3 | 94.3 | 24 / 35 | 6257 |
| 4 | 1 | 72.5 | 95.9 | 27 / 35 | 6396 |
| 5 | 1 | 71.3 | 94.3 | 22 / 35 | 5789 |
| 6 | 1 | 72.0 | 93.3 | 24 / 35 | 6445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 114 | 73% |
| dummy.mini.Scimitar 1.01 | 35 | 97% |
| cf.RiO.RiOx 4.2.1 | 17 | 94% |
| eld.Hmm 1.0 | 7 | 71% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| el.JumpShoot 0.2 | 1 | 0% |

Hadur died in 72 of 210 rounds, at a mean tick of 1395. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 64% | 103 |
| dummy.mini.Scimitar 1.01 | 11 | 15% | 69 |
| cf.RiO.RiOx 4.2.1 | 8 | 11% | 19 |
| eld.Hmm 1.0 | 2 | 3% | 14 |
| oa.weak.BotherBot 0.1 | 2 | 3% | 3 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.1 | 85 / 210 | 2.43 | 17.7% | 30886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.2 | 17.7% | 85 |
| pe.SandboxDT 2.71m | 2.2 | 16.1% | 58 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.2% | 37 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.9% | 24 |
| bigpete.Stewie 1.0 | 5.0 | 10.9% | 7 |
| tad.Dalek98 0.98 | 6.7 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 7.0 | 6.6% | 1 |
| gg.Squaraus 0.6 | 7.7 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.4 | 16 / 35 | 5124 |
| 2 | 1 | 68.9 | 88.9 | 16 / 35 | 5187 |
| 3 | 1 | 68.0 | 84.8 | 14 / 35 | 5358 |
| 4 | 1 | 68.2 | 85.4 | 16 / 35 | 5326 |
| 5 | 1 | 67.8 | 84.1 | 13 / 35 | 5054 |
| 6 | 2 | 65.2 | 76.8 | 10 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 50 | 66% |
| pe.SandboxDT 2.71m | 31 | 55% |
| jlm.javaDisturbance 0.59 | 29 | 76% |
| bigpete.Stewie 1.0 | 12 | 83% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 892. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 47 | 37% | 71 |
| kvk.HebusLeTroll 0.35 | 39 | 31% | 63 |
| jlm.javaDisturbance 0.59 | 25 | 20% | 44 |
| bigpete.Stewie 1.0 | 9 | 7% | 20 |
| tad.Dalek98 0.98 | 2 | 2% | 4 |
| gg.Squaraus 0.6 | 2 | 2% | 3 |
| yk.JahRoslav 1.1 | 1 | 1% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.5 | 128 / 210 | 1.77 | 19.7% | 31775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 19.7% | 128 |
| pe.SandboxLump 1.52 | 2.0 | 17.0% | 53 |
| cre.Karolos 0.32 | 3.0 | 14.3% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.3% | 3 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.1% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 2 |
| cw.megas.Blade 0.8 | 7.0 | 7.9% | 0 |
| sample.Walls 1.0 | 7.8 | 7.5% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 93.7 | 26 / 35 | 5307 |
| 2 | 1 | 70.6 | 89.8 | 22 / 35 | 5246 |
| 3 | 1 | 68.7 | 87.0 | 13 / 35 | 5222 |
| 4 | 1 | 70.6 | 92.4 | 20 / 35 | 5307 |
| 5 | 1 | 70.8 | 91.1 | 22 / 35 | 5238 |
| 6 | 1 | 71.6 | 94.9 | 25 / 35 | 5455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 96 | 65% |
| cre.Karolos 0.32 | 37 | 84% |
| stelo.AreaTargetingBot 1.1 | 14 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 88% |
| stelo.RamTrackSurfer 1.2 | 8 | 63% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 49 | 60% | 106 |
| cre.Karolos 0.32 | 18 | 22% | 57 |
| stelo.RamTrackSurfer 1.2 | 7 | 9% | 16 |
| stelo.AreaTargetingBot 1.1 | 4 | 5% | 11 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 4% | 8 |
| sample.Walls 1.0 | 1 | 1% | 8 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.1 | 61 / 210 | 3.42 | 14.7% | 22088 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.7 | 14.7% | 61 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.7% | 50 |
| florent.XSeries.X2 0.12 | 2.7 | 13.9% | 36 |
| davidalves.Phoenix 0.54 | 3.5 | 13.0% | 39 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.9% | 14 |
| oog.melee.Corsair 1.0 | 6.2 | 8.8% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 7.8% | 6 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.0% | 2 |
| as.FrankTheTank 1.3 | 9.2 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 71.4 | 8 / 35 | 4086 |
| 2 | 3 | 59.4 | 66.3 | 8 / 35 | 3263 |
| 3 | 1 | 65.6 | 82.9 | 11 / 35 | 4220 |
| 4 | 1 | 63.6 | 77.1 | 10 / 35 | 3702 |
| 5 | 3 | 60.5 | 67.3 | 11 / 35 | 3295 |
| 6 | 1 | 62.6 | 73.3 | 13 / 35 | 3522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 27 | 56% |
| florent.XSeries.X2 0.12 | 20 | 65% |
| davidalves.Phoenix 0.54 | 17 | 53% |
| pedersen.Ugluk 1.1.1 | 14 | 79% |
| stelo.SoJNanoMelee 1.1 | 13 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 673. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 45 | 30% | 63 |
| rz.GlowBlowMelee 1.4 | 31 | 21% | 49 |
| davidalves.Phoenix 0.54 | 26 | 17% | 34 |
| pedersen.Ugluk 1.1.1 | 23 | 15% | 32 |
| stelo.SoJNanoMelee 1.1 | 10 | 7% | 13 |
| oog.melee.Corsair 1.0 | 8 | 5% | 11 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 4 |
| evd.X1 0.01 | 2 | 1% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |

## Melee bench: F25

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 85.3 | 129 / 210 | 2.32 | 18.4% | 26574 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.4% | 129 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.3% | 18 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.0% | 18 |
| jdw.Hurricane 1.4 | 4.0 | 11.6% | 25 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 9.3% | 12 |
| ds.Oo 2.2 | 6.0 | 9.1% | 3 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.4% | 3 |
| awesomeness.Elite 1.0 | 7.7 | 7.2% | 1 |
| adt.Ar2 1.1 | 9.0 | 5.9% | 1 |
| amk.ChumbaMini 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 82.9 | 20 / 35 | 4023 |
| 2 | 1 | 67.3 | 83.2 | 19 / 35 | 4541 |
| 3 | 1 | 68.3 | 86.7 | 23 / 35 | 4506 |
| 4 | 1 | 67.0 | 81.9 | 21 / 35 | 4323 |
| 5 | 1 | 67.9 | 85.4 | 22 / 35 | 4432 |
| 6 | 1 | 69.9 | 92.1 | 24 / 35 | 4749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 46 | 93% |
| voidious.micro.BlitzBat 1.05 | 45 | 96% |
| jdw.Hurricane 1.4 | 18 | 83% |
| ds.Oo 2.2 | 8 | 75% |
| gre.svman4.Morfeas 1.4.1 | 7 | 71% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| adt.Ar2 1.1 | 4 | 75% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 569. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 26% | 64 |
| jdw.Hurricane 1.4 | 19 | 23% | 29 |
| voidious.micro.BlitzBat 1.05 | 15 | 19% | 58 |
| ds.Oo 2.2 | 10 | 12% | 19 |
| gre.svman4.Morfeas 1.4.1 | 10 | 12% | 18 |
| awesomeness.Elite 1.0 | 3 | 4% | 7 |
| amk.ChumbaMini 0.2 | 2 | 2% | 4 |
| adt.Ar2 1.1 | 1 | 1% | 3 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 8 |

## Melee bench: F26

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.8 | 115 / 210 | 2.10 | 18.9% | 33890 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.9% | 115 |
| ak.Fermat 2.0 | 2.3 | 14.5% | 34 |
| lrem.Spectre 0.4.4 | 3.0 | 12.9% | 21 |
| shu.nitro.LENIN .T34 | 3.7 | 12.4% | 33 |
| js.PinBall 1.6 | 5.8 | 9.8% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.6% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.3 | 9.2% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.2 | 19 / 35 | 5879 |
| 2 | 1 | 68.6 | 86.7 | 16 / 35 | 5453 |
| 3 | 1 | 69.4 | 88.3 | 22 / 35 | 5614 |
| 4 | 1 | 69.7 | 87.3 | 20 / 35 | 5961 |
| 5 | 1 | 70.1 | 88.9 | 21 / 35 | 5869 |
| 6 | 1 | 67.9 | 85.7 | 17 / 35 | 5114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 48 | 63% |
| lrem.Spectre 0.4.4 | 40 | 78% |
| ak.Fermat 2.0 | 39 | 67% |
| js.PinBall 1.6 | 9 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 9 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 86% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 34 | 36% | 67 |
| shu.nitro.LENIN .T34 | 28 | 29% | 59 |
| lrem.Spectre 0.4.4 | 19 | 20% | 42 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 6% | 11 |
| js.PinBall 1.6 | 5 | 5% | 17 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 11 |
| sample.SpinBot 1.0 | 0 | 0% | 2 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.5 | 115 / 210 | 2.48 | 18.3% | 30257 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.3% | 115 |
| mk.Alpha 0.2.1 | 2.3 | 13.5% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 3.0 | 11.9% | 21 |
| wee.Gem 1.8.4 | 4.0 | 11.2% | 30 |
| EH.Eagle 1.0.6 | 4.7 | 10.4% | 4 |
| joe.ADinosaur 1.0 | 6.8 | 8.6% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.8% | 5 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.2% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.1% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.0 | 21 / 35 | 4476 |
| 2 | 1 | 69.9 | 93.3 | 25 / 35 | 5058 |
| 3 | 1 | 71.0 | 87.6 | 21 / 35 | 6343 |
| 4 | 1 | 66.0 | 80.3 | 15 / 35 | 4419 |
| 5 | 1 | 67.4 | 76.2 | 15 / 35 | 5646 |
| 6 | 1 | 66.1 | 82.9 | 18 / 35 | 4315 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 53 | 70% |
| sheldor.melee.nano.TestMelee 0.1 | 33 | 82% |
| wee.Gem 1.8.4 | 22 | 73% |
| EH.Eagle 1.0.6 | 15 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 38 | 40% | 74 |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 19% | 43 |
| joe.ADinosaur 1.0 | 15 | 16% | 17 |
| wee.Gem 1.8.4 | 14 | 15% | 35 |
| EH.Eagle 1.0.6 | 3 | 3% | 21 |
| throxbot.ThroxBot 0.1 | 3 | 3% | 9 |
| caimano.Furia_Ceca 0.22 | 3 | 3% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 7 |

## Melee bench: F28

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 91.9 | 143 / 210 | 1.73 | 19.5% | 27821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 19.5% | 143 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 32 |
| uji.Antique 1.0 | 3.7 | 11.4% | 14 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 11.0% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 0 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 5 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 4 |
| matt.advanced.Katana 1.0 | 8.3 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 8.8 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 23 / 35 | 4341 |
| 2 | 1 | 69.4 | 92.4 | 23 / 35 | 4723 |
| 3 | 1 | 68.7 | 90.8 | 21 / 35 | 4605 |
| 4 | 1 | 70.9 | 95.9 | 27 / 35 | 4992 |
| 5 | 1 | 69.1 | 90.8 | 24 / 35 | 4578 |
| 6 | 1 | 69.3 | 91.1 | 25 / 35 | 4582 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 92 | 80% |
| uji.Antique 1.0 | 37 | 92% |
| qohnil.blot.BlotBot 3.61 | 19 | 63% |
| amk.ChumbaWumba 0.3 | 7 | 71% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| stelo.PianistNano 1.2 | 4 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 26 | 38% | 90 |
| qohnil.blot.BlotBot 3.61 | 14 | 21% | 31 |
| uji.Antique 1.0 | 13 | 19% | 44 |
| pfvicm.Sobieski 7.2.3b | 6 | 9% | 16 |
| amk.ChumbaWumba 0.3 | 6 | 9% | 10 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 7 |
| matt.advanced.Katana 1.0 | 0 | 0% | 7 |
| stelo.PianistNano 1.2 | 0 | 0% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 82.2 | 110 / 210 | 2.60 | 18.4% | 30691 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.4% | 110 |
| deewiant.Anomaly 0.2 | 2.3 | 15.2% | 51 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.1% | 36 |
| myl.micro.Troodon 1.10 | 4.2 | 12.1% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 11.1% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.5 | 6.0% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 6.0% | 0 |
| ap.Frederick 1.1 | 8.7 | 5.0% | 3 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.4 | 20 / 35 | 5268 |
| 2 | 1 | 65.9 | 74.3 | 15 / 35 | 4876 |
| 3 | 1 | 67.1 | 80.6 | 16 / 35 | 4782 |
| 4 | 1 | 69.1 | 83.5 | 18 / 35 | 5369 |
| 5 | 1 | 68.5 | 81.9 | 18 / 35 | 5179 |
| 6 | 1 | 70.1 | 88.6 | 23 / 35 | 5217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 75% |
| zyx.mega.YersiniaPestis 3.1 | 37 | 76% |
| myl.micro.Troodon 1.10 | 21 | 100% |
| jok.PheonixM 0.1.2 | 11 | 100% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ap.Frederick 1.1 | 4 | 75% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 48 | 48% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 22 | 22% | 55 |
| jok.PheonixM 0.1.2 | 15 | 15% | 25 |
| myl.micro.Troodon 1.10 | 11 | 11% | 29 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| ap.Frederick 1.1 | 1 | 1% | 0 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 68.7 | 42 / 210 | 3.81 | 14.0% | 23769 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.2 | 13.7% | 53 |
| hadur117.mini.DeiseWPN 0.2 | 2.3 | 14.0% | 42 |
| darkcanuck.B26354 1.06 | 3.5 | 13.0% | 40 |
| stelo.PastFuture 2.3.2 | 3.5 | 12.7% | 25 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 33 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.9% | 13 |
| ntc.Opposite 1.5 | 7.3 | 7.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 3 |
| tripphippy.Alice 1.1 | 8.5 | 7.3% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 74.0 | 8 / 35 | 4228 |
| 2 | 3 | 59.9 | 66.3 | 5 / 35 | 3821 |
| 3 | 2 | 60.2 | 66.0 | 9 / 35 | 3708 |
| 4 | 3 | 60.6 | 65.7 | 8 / 35 | 4123 |
| 5 | 4 | 58.8 | 66.3 | 4 / 35 | 3501 |
| 6 | 1 | 63.2 | 74.0 | 8 / 35 | 4388 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 20 | 60% |
| darkcanuck.B26354 1.06 | 19 | 42% |
| catcat20.Matcha 0.006 | 19 | 58% |
| stelo.PastFuture 2.3.2 | 13 | 62% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 100% |

Hadur died in 168 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 35 | 21% | 46 |
| catcat20.Matcha 0.006 | 33 | 20% | 46 |
| oog.melee.Capulet 1.2 | 29 | 17% | 38 |
| stelo.PastFuture 2.3.2 | 27 | 16% | 35 |
| ntc.Opposite 1.5 | 14 | 8% | 15 |
| tripphippy.Alice 1.1 | 14 | 8% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 6% | 8 |
| intruder.PrairieWolf 2.61 | 6 | 4% | 7 |

## Melee bench: F31

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.3 | 46 / 210 | 3.59 | 14.3% | 22202 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.1% | 99 |
| hadur117.mini.DeiseWPN 0.2 | 2.5 | 14.3% | 46 |
| gh.mini.Griezel 0.2 | 3.2 | 13.7% | 39 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.7% | 8 |
| d414.nano.Quantum 1.0.0 | 4.3 | 11.2% | 11 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.8% | 7 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.7% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.8% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 72.7 | 8 / 35 | 3844 |
| 2 | 2 | 64.5 | 78.7 | 11 / 35 | 3850 |
| 3 | 3 | 61.2 | 67.6 | 6 / 35 | 3760 |
| 4 | 3 | 58.7 | 62.9 | 5 / 35 | 3553 |
| 5 | 3 | 61.9 | 70.8 | 8 / 35 | 3643 |
| 6 | 2 | 62.3 | 74.9 | 8 / 35 | 3552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 36 | 53% |
| gh.mini.Griezel 0.2 | 23 | 43% |
| spinnercat.micro.Tyger 0.1 | 10 | 80% |
| d414.nano.Quantum 1.0.0 | 10 | 80% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 164 of 210 rounds, at a mean tick of 729. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 52 | 32% | 73 |
| gh.mini.Griezel 0.2 | 50 | 30% | 62 |
| spinnercat.micro.Tyger 0.1 | 23 | 14% | 25 |
| d414.nano.Quantum 1.0.0 | 17 | 10% | 26 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 7 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 1 |

## Melee bench: F32

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.5 | 119 / 210 | 2.22 | 18.2% | 29162 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.2% | 119 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.2% | 51 |
| apc.botM 3.0 | 3.2 | 11.4% | 20 |
| vjik.UnViolation 1.1 | 4.3 | 10.1% | 9 |
| lxx.ConceptA 0.8 | 4.5 | 10.1% | 3 |
| bayen.UbaMicro 1.4 | 6.3 | 8.6% | 2 |
| panzer.Panzer 0.2 | 6.8 | 7.9% | 1 |
| conscience.Electron 1.3g | 8.3 | 6.7% | 0 |
| yk.JahMicro 1.0 | 8.8 | 6.3% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.5 | 25 / 35 | 4791 |
| 2 | 1 | 67.3 | 86.3 | 21 / 35 | 4685 |
| 3 | 1 | 69.5 | 92.4 | 24 / 35 | 5201 |
| 4 | 1 | 66.9 | 84.8 | 16 / 35 | 4933 |
| 5 | 1 | 66.4 | 84.1 | 14 / 35 | 4827 |
| 6 | 1 | 66.2 | 81.6 | 19 / 35 | 4725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 74 | 61% |
| lxx.ConceptA 0.8 | 22 | 91% |
| apc.botM 3.0 | 21 | 76% |
| vjik.UnViolation 1.1 | 12 | 92% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| donjezza.Jezza 1.0 | 8 | 88% |
| panzer.Panzer 0.2 | 3 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 49% | 105 |
| apc.botM 3.0 | 15 | 16% | 38 |
| vjik.UnViolation 1.1 | 8 | 9% | 20 |
| bayen.UbaMicro 1.4 | 7 | 8% | 13 |
| lxx.ConceptA 0.8 | 6 | 7% | 14 |
| conscience.Electron 1.3g | 4 | 4% | 4 |
| panzer.Panzer 0.2 | 3 | 3% | 4 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |

## Melee bench: F33

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.3 | 116 / 210 | 2.32 | 18.6% | 30409 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.6% | 116 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.1% | 13 |
| labg.Cataclysm 2.05 | 4.5 | 11.0% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.7% | 3 |
| baal.nano.N 1.42 | 6.5 | 8.3% | 0 |
| zyx.micro.Ant 1.1 | 8.0 | 5.4% | 1 |
| sanja.First 0.1 | 9.3 | 4.5% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.3% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.3 | 20 / 35 | 4921 |
| 2 | 1 | 68.3 | 84.1 | 18 / 35 | 5036 |
| 3 | 1 | 66.4 | 79.4 | 17 / 35 | 4727 |
| 4 | 1 | 68.4 | 85.4 | 17 / 35 | 5066 |
| 5 | 1 | 69.6 | 89.5 | 22 / 35 | 5234 |
| 6 | 1 | 69.9 | 87.0 | 22 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 70% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 88% |
| gre.svman4.Leonidas 1.3.2 | 26 | 96% |
| labg.Cataclysm 2.05 | 20 | 70% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 100% |
| baal.nano.N 1.42 | 5 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 39 | 40% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 19% | 45 |
| gre.svman4.Leonidas 1.3.2 | 13 | 13% | 33 |
| labg.Cataclysm 2.05 | 13 | 13% | 27 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 7% | 14 |
| zyx.micro.Ant 1.1 | 3 | 3% | 4 |
| baal.nano.N 1.42 | 2 | 2% | 7 |
| sanja.First 0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.4 | 74 / 210 | 2.50 | 17.3% | 29883 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.7 | 17.3% | 74 |
| stelo.Spread 0.9 | 1.7 | 16.7% | 76 |
| kid.Gladiator .7.2 | 2.7 | 15.8% | 41 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 16 |
| tcf.Reach 3 | 5.0 | 10.3% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.5% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.5% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.7% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 15 / 35 | 5021 |
| 2 | 1 | 68.4 | 86.7 | 14 / 35 | 5330 |
| 3 | 1 | 68.5 | 86.0 | 13 / 35 | 5234 |
| 4 | 2 | 66.5 | 80.3 | 11 / 35 | 4938 |
| 5 | 2 | 66.4 | 80.0 | 15 / 35 | 4574 |
| 6 | 3 | 66.8 | 83.5 | 6 / 35 | 4786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 67 | 49% |
| kid.Gladiator .7.2 | 34 | 62% |
| jcs.Seth 1.8 | 17 | 65% |
| tcf.Reach 3 | 4 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 985. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 65 | 48% | 93 |
| kid.Gladiator .7.2 | 42 | 31% | 57 |
| jcs.Seth 1.8 | 16 | 12% | 28 |
| tcf.Reach 3 | 6 | 4% | 15 |
| ratosh.Wesco 1.4 | 5 | 4% | 7 |
| cli.Dancer 1.1 | 2 | 1% | 9 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 79.8 | 49 / 210 | 2.81 | 15.4% | 22256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 135 |
| hadur117.mini.DeiseWPN 0.2 | 2.0 | 15.4% | 49 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.5% | 19 |
| rz.HawkOnFire 0.1 | 4.2 | 11.3% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.0% | 4 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 7.3% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.7% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 78.4 | 4 / 35 | 3859 |
| 2 | 2 | 65.3 | 83.8 | 10 / 35 | 3778 |
| 3 | 2 | 62.9 | 76.5 | 8 / 35 | 3548 |
| 4 | 2 | 64.9 | 81.6 | 9 / 35 | 3835 |
| 5 | 2 | 63.2 | 77.8 | 7 / 35 | 3600 |
| 6 | 2 | 64.6 | 81.0 | 11 / 35 | 3636 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 64 | 27% |
| gh.mini.Gruwel 0.9 | 25 | 60% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 100% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 76 | 47% | 93 |
| gh.mini.Gruwel 0.9 | 34 | 21% | 50 |
| rz.HawkOnFire 0.1 | 19 | 12% | 26 |
| dmh.robocode.robot.BlackDeath 9.2 | 16 | 10% | 22 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 6 | 4% | 6 |
| wit.Chuliath 1.0 | 4 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.2 | 163 / 210 | 1.70 | 20.8% | 33653 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.8% | 163 |
| alpha.RainingFire 1.0 | 2.7 | 11.5% | 10 |
| mz.Cork 0.1 | 3.8 | 11.0% | 10 |
| bvh.micro.Freya 0.3 | 4.0 | 11.0% | 5 |
| bzdp.Pansy 2.1 | 4.0 | 11.2% | 8 |
| m3thos.Eva02 0.7.1 | 6.2 | 9.7% | 9 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.5% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 6.1% | 2 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.7 | 29 / 35 | 5588 |
| 2 | 1 | 71.2 | 92.1 | 29 / 35 | 5716 |
| 3 | 1 | 70.7 | 90.8 | 27 / 35 | 5556 |
| 4 | 1 | 70.9 | 94.3 | 25 / 35 | 5388 |
| 5 | 1 | 70.6 | 91.7 | 27 / 35 | 5511 |
| 6 | 1 | 71.1 | 91.4 | 26 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.micro.Freya 0.3 | 37 | 95% |
| bzdp.Pansy 2.1 | 36 | 94% |
| mz.Cork 0.1 | 28 | 93% |
| alpha.RainingFire 1.0 | 25 | 88% |
| bvh.mini.Fenrir 0.39 | 17 | 100% |
| m3thos.Eva02 0.7.1 | 17 | 88% |
| dl.BetterWalls 1.0 | 9 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 713. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 10 | 21% | 31 |
| bzdp.Pansy 2.1 | 9 | 19% | 45 |
| m3thos.Eva02 0.7.1 | 8 | 17% | 29 |
| bvh.mini.Fenrir 0.39 | 8 | 17% | 22 |
| mz.Cork 0.1 | 5 | 11% | 35 |
| bvh.micro.Freya 0.3 | 4 | 9% | 29 |
| dl.BetterWalls 1.0 | 1 | 2% | 13 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 2 |

## Melee bench: F37

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 94.8 | 179 / 210 | 1.47 | 20.6% | 35211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 20.6% | 179 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.2 | 10.2% | 5 |
| germ.TheMind .2 | 3.2 | 10.2% | 9 |
| EBBU.Sim2 1.02 | 3.5 | 9.9% | 6 |
| agrach.Dalek 1.0 | 5.8 | 8.8% | 2 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.8% | 7 |
| lmk.ACPFinal 0.1 | 6.3 | 8.5% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 8.2 | 8.0% | 0 |
| mb.Beast 0.1 | 8.2 | 7.7% | 1 |
| skm.Ryubot 1.0 | 9.5 | 7.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.7 | 28 / 35 | 5955 |
| 2 | 1 | 68.9 | 93.7 | 27 / 35 | 5322 |
| 3 | 1 | 70.2 | 95.9 | 32 / 35 | 5667 |
| 4 | 1 | 69.3 | 91.4 | 28 / 35 | 6013 |
| 5 | 1 | 70.7 | 97.8 | 32 / 35 | 5695 |
| 6 | 1 | 72.1 | 98.4 | 32 / 35 | 6559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 37 | 97% |
| EBBU.Sim2 1.02 | 30 | 97% |
| stelo.UntouchableNano 1.3 | 30 | 87% |
| agrach.Dalek 1.0 | 24 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| lmk.ACPFinal 0.1 | 15 | 93% |
| skm.Ryubot 1.0 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 502. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 7 | 22% | 28 |
| EBBU.Sim2 1.02 | 6 | 19% | 32 |
| lmk.ACPFinal 0.1 | 6 | 19% | 28 |
| stelo.UntouchableNano 1.3 | 6 | 19% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 9% | 35 |
| mb.Beast 0.1 | 2 | 6% | 19 |
| agrach.Dalek 1.0 | 1 | 3% | 30 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 7 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |

## Melee bench: F38

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.8 | 70 / 210 | 3.00 | 15.8% | 25402 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.5 | 15.8% | 70 |
| justin.Mallais 14.0 | 1.5 | 16.3% | 79 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 16 |
| bts.mega.Gnarly 1.4 | 4.5 | 11.0% | 19 |
| cs.Wren 1.0 | 5.2 | 10.8% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.6% | 7 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.5% | 4 |
| bzdp.BoxCar 2.0 | 9.3 | 4.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.8 | 12 / 35 | 4607 |
| 2 | 2 | 62.7 | 72.7 | 8 / 35 | 4135 |
| 3 | 1 | 65.3 | 80.3 | 13 / 35 | 4380 |
| 4 | 1 | 64.2 | 75.6 | 15 / 35 | 4075 |
| 5 | 2 | 63.8 | 77.5 | 9 / 35 | 4093 |
| 6 | 2 | 64.1 | 76.8 | 13 / 35 | 4112 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 41 | 63% |
| bvh.mini.Freya 0.55 | 22 | 64% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 92% |
| bts.mega.Gnarly 1.4 | 12 | 67% |
| cs.Wren 1.0 | 9 | 78% |
| kdf.KoulDestroyer 1.0 | 5 | 80% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 0% |

Hadur died in 140 of 210 rounds, at a mean tick of 701. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 41 | 29% | 71 |
| bvh.mini.Freya 0.55 | 34 | 24% | 41 |
| bts.mega.Gnarly 1.4 | 20 | 14% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 12% | 28 |
| cs.Wren 1.0 | 17 | 12% | 25 |
| kdf.KoulDestroyer 1.0 | 5 | 4% | 10 |
| bzdp.BoxCar 2.0 | 2 | 1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 2 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.9 | 78 / 210 | 2.72 | 17.0% | 29602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.2 | 17.0% | 78 |
| bvh.fry.Freya 0.82 | 2.0 | 15.3% | 41 |
| az.Ololobot 0.2.4 | 3.2 | 12.9% | 51 |
| catcat20.Lambda 0.024 | 3.8 | 11.3% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.3% | 10 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.0% | 1 |
| gimp.GimpBot 0.1 | 7.2 | 7.6% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.8% | 3 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.9 | 15 / 35 | 4967 |
| 2 | 1 | 66.0 | 83.2 | 14 / 35 | 4790 |
| 3 | 1 | 67.4 | 85.4 | 15 / 35 | 5210 |
| 4 | 1 | 65.2 | 80.3 | 12 / 35 | 4901 |
| 5 | 1 | 65.5 | 81.0 | 11 / 35 | 4981 |
| 6 | 2 | 63.8 | 72.7 | 11 / 35 | 4753 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 41 | 41% |
| catcat20.Lambda 0.024 | 37 | 78% |
| bvh.fry.Freya 0.82 | 29 | 69% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 50% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |

Hadur died in 132 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 47 | 36% | 66 |
| az.Ololobot 0.2.4 | 37 | 28% | 57 |
| catcat20.Lambda 0.024 | 19 | 14% | 42 |
| stelo.SoRobotNanoMelee 1.2 | 13 | 10% | 16 |
| apollokidd.ApolloKidd 0.9 | 7 | 5% | 9 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 9 |
| gimp.GimpBot 0.1 | 3 | 2% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 3 |

## Melee bench: F40

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.7 | 112 / 210 | 2.29 | 18.6% | 30524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.6% | 112 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 44 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.5% | 18 |
| mz.AntiGrav 1.0 | 4.2 | 10.9% | 8 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.7% | 13 |
| alpha.BlackIce 1.0 | 6.5 | 8.7% | 5 |
| stelo.Randomness 1.0 | 6.7 | 8.9% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.7% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.1% | 1 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.8 | 21 / 35 | 5278 |
| 2 | 1 | 66.7 | 80.3 | 15 / 35 | 5077 |
| 3 | 1 | 68.5 | 86.7 | 19 / 35 | 5139 |
| 4 | 1 | 68.5 | 85.7 | 20 / 35 | 4979 |
| 5 | 1 | 67.7 | 85.1 | 19 / 35 | 4787 |
| 6 | 1 | 68.6 | 86.7 | 18 / 35 | 5264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 67% |
| kano.gamma.KanoGamma 1.8 | 34 | 74% |
| mz.AntiGrav 1.0 | 26 | 100% |
| Polkwane.SmashMelee 1.0 | 20 | 80% |
| stelo.Randomness 1.0 | 12 | 58% |
| alpha.BlackIce 1.0 | 4 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 0% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 39% | 65 |
| kano.gamma.KanoGamma 1.8 | 15 | 15% | 40 |
| Polkwane.SmashMelee 1.0 | 14 | 14% | 26 |
| alpha.BlackIce 1.0 | 11 | 11% | 14 |
| mz.AntiGrav 1.0 | 8 | 8% | 31 |
| stelo.Randomness 1.0 | 8 | 8% | 20 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 5 |
| sample.Corners 1.0 | 1 | 1% | 5 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 4 |

## Melee bench: F41

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.2 | 88 / 210 | 2.60 | 17.0% | 26347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.3 | 17.0% | 88 |
| eem.EvBotNG v12.8 | 1.7 | 16.1% | 75 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 13.0% | 17 |
| ary.Swarm 1.1 | 4.2 | 12.6% | 11 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 11.5% | 10 |
| shrub.Silver v048 | 6.3 | 8.4% | 4 |
| zyx.nano.Ant 1.1 | 6.7 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 3 |
| stelo.Mirror 1.1 | 8.5 | 5.3% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 81.9 | 14 / 35 | 4566 |
| 2 | 1 | 68.0 | 85.4 | 16 / 35 | 4744 |
| 3 | 2 | 65.7 | 80.0 | 16 / 35 | 4008 |
| 4 | 1 | 66.0 | 82.5 | 11 / 35 | 4286 |
| 5 | 1 | 67.8 | 85.1 | 19 / 35 | 4407 |
| 6 | 2 | 65.0 | 78.1 | 12 / 35 | 4336 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 59 | 44% |
| lessonz.robocode.Oz 0.5.0 | 24 | 79% |
| ary.Swarm 1.1 | 21 | 90% |
| simonton.nano.MeleeSeed 1.8 | 13 | 100% |
| jsal.Jsalbot 1.0 | 5 | 80% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 55 | 45% | 78 |
| ary.Swarm 1.1 | 23 | 19% | 46 |
| lessonz.robocode.Oz 0.5.0 | 18 | 15% | 34 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 26 |
| stelo.Mirror 1.1 | 4 | 3% | 7 |
| acogdev.alpha 0.2 | 4 | 3% | 4 |
| shrub.Silver v048 | 3 | 2% | 6 |
| jsal.Jsalbot 1.0 | 2 | 2% | 6 |
| zyx.nano.Ant 1.1 | 0 | 0% | 3 |

## Melee bench: F42

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.8 | 88 / 210 | 2.37 | 18.0% | 32016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 18.0% | 88 |
| wompi.Wallaby 5.1 | 2.2 | 15.8% | 60 |
| ara.Shera 0.88 | 3.3 | 13.8% | 27 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.7% | 30 |
| amz.NanoClone 1.41 | 5.2 | 8.7% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 7.0% | 1 |
| dsw.StaticD 1.0 | 6.5 | 6.8% | 1 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.5 | 12 / 35 | 5266 |
| 2 | 1 | 69.5 | 88.9 | 18 / 35 | 5858 |
| 3 | 1 | 66.6 | 82.9 | 14 / 35 | 4931 |
| 4 | 1 | 67.5 | 82.5 | 15 / 35 | 5414 |
| 5 | 1 | 66.9 | 83.8 | 14 / 35 | 4850 |
| 6 | 1 | 69.0 | 87.9 | 15 / 35 | 5697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 59 | 59% |
| maribo.mini.MiniQuester 0.1 | 37 | 70% |
| ara.Shera 0.88 | 34 | 68% |
| dsw.StaticD 1.0 | 4 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 47 | 39% | 78 |
| maribo.mini.MiniQuester 0.1 | 33 | 27% | 55 |
| ara.Shera 0.88 | 31 | 25% | 59 |
| stelo.MirrorMicro 1.0 | 3 | 2% | 3 |
| maribo.IotaCT 1.1 | 3 | 2% | 3 |
| amz.NanoClone 1.41 | 3 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 4 |

## Melee bench: F43

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 70.2 | 21 / 210 | 3.68 | 13.8% | 22640 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.4% | 159 |
| hadur117.mini.DeiseWPN 0.2 | 2.2 | 13.8% | 21 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.7% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.3% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.2% | 1 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.6% | 0 |
| mz.NanoGod 2.02 | 7.5 | 7.4% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.5 | 67.9 | 3 / 35 | 3717 |
| 2 | 2 | 64.0 | 74.6 | 6 / 35 | 3975 |
| 3 | 3 | 61.7 | 67.9 | 1 / 35 | 3835 |
| 4 | 2 | 62.8 | 70.8 | 4 / 35 | 3614 |
| 5 | 2 | 61.0 | 67.6 | 2 / 35 | 3496 |
| 6 | 2 | 63.4 | 72.4 | 5 / 35 | 4003 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 62 | 15% |
| brainfade.melee.Dusk 0.44 | 8 | 38% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 86 | 46% | 96 |
| brainfade.melee.Dusk 0.44 | 34 | 18% | 37 |
| wcsv.melee.EngineerMelee 0.1 | 24 | 13% | 28 |
| dummy.micro.Sparrow 2.5 | 20 | 11% | 23 |
| mz.NanoGod 2.02 | 11 | 6% | 11 |
| jab.DiamondStealer 5 | 7 | 4% | 7 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 6 |
| cvt.Firsty 1.0 | 1 | 1% | 2 |

## Melee bench: F44

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.3 | 120 / 210 | 2.14 | 19.3% | 33149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 19.3% | 120 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 61 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.9% | 25 |
| wompi.Quokka 1.6 | 4.5 | 10.2% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.1% | 3 |
| jwirde.Gort 2.0 | 5.7 | 8.6% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.6% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.3% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 88.3 | 20 / 35 | 5251 |
| 2 | 1 | 70.6 | 93.0 | 25 / 35 | 5568 |
| 3 | 1 | 68.4 | 82.5 | 22 / 35 | 5583 |
| 4 | 1 | 69.0 | 86.0 | 16 / 35 | 5654 |
| 5 | 1 | 69.4 | 87.3 | 19 / 35 | 5344 |
| 6 | 1 | 69.4 | 86.7 | 18 / 35 | 5749 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 81 | 73% |
| tzu.TheArtOfWar 1.2 | 47 | 81% |
| wompi.Quokka 1.6 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| disan.Chair 2.2.0 | 5 | 100% |
| jwirde.Gort 2.0 | 4 | 75% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 45% | 100 |
| tzu.TheArtOfWar 1.2 | 27 | 29% | 62 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 8% | 11 |
| wompi.Quokka 1.6 | 6 | 6% | 16 |
| disan.Chair 2.2.0 | 3 | 3% | 6 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 4 |
| jwirde.Gort 2.0 | 2 | 2% | 9 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.5 | 93 / 210 | 2.03 | 19.9% | 36489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWPN 0.2 | 1.0 | 19.9% | 93 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.9% | 101 |
| jje.BagPuss 1.2 | 3.2 | 11.6% | 6 |
| myl.nano.Graviton 1.10 | 4.0 | 10.6% | 4 |
| sul.Lunar 1.1 | 5.3 | 9.7% | 2 |
| fm.claire 1.7 | 6.3 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 6.7 | 8.7% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 7.7% | 2 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.0 | 10 / 35 | 5830 |
| 2 | 1 | 70.3 | 90.5 | 16 / 35 | 6321 |
| 3 | 1 | 70.0 | 89.2 | 14 / 35 | 6189 |
| 4 | 1 | 70.1 | 89.2 | 12 / 35 | 6501 |
| 5 | 1 | 70.4 | 89.5 | 21 / 35 | 6031 |
| 6 | 1 | 70.1 | 91.7 | 20 / 35 | 5617 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 103 | 27% |
| sul.Lunar 1.1 | 20 | 95% |
| jje.BagPuss 1.2 | 19 | 89% |
| myl.nano.Graviton 1.10 | 12 | 83% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 100% |
| hvilela.HVilela 0.9 | 5 | 100% |
| fm.claire 1.7 | 3 | 100% |
| wit.Deep7 2.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 2225. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 76 | 65% | 0 |
| jje.BagPuss 1.2 | 11 | 9% | 58 |
| myl.nano.Graviton 1.10 | 10 | 9% | 39 |
| hvilela.HVilela 0.9 | 5 | 4% | 16 |
| sul.Lunar 1.1 | 4 | 3% | 49 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 19 |
| fm.claire 1.7 | 4 | 3% | 12 |
| wit.Deep7 2.0 | 3 | 3% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseWPN 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 81.0 | 60 / 210 | 2.71 | 16.2% | 26388 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.6% | 64 |
| hadur117.mini.DeiseWPN 0.2 | 2.2 | 16.2% | 60 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.0% | 75 |
| mz.MicroSheep 1.0 | 4.5 | 11.0% | 4 |
| cx.Princess 1.0 | 4.7 | 10.3% | 5 |
| sadoner.killer 0.2 | 5.8 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 80.6 | 10 / 35 | 4471 |
| 2 | 3 | 63.8 | 77.8 | 7 / 35 | 4079 |
| 3 | 3 | 65.4 | 80.3 | 10 / 35 | 4365 |
| 4 | 2 | 65.5 | 80.3 | 10 / 35 | 4465 |
| 5 | 2 | 66.3 | 84.1 | 10 / 35 | 4476 |
| 6 | 1 | 66.2 | 82.5 | 13 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 51 | 49% |
| rsalesc.melee.Medina 0.4.5 | 35 | 40% |
| mz.MicroSheep 1.0 | 10 | 90% |
| cx.Princess 1.0 | 9 | 89% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| sadoner.killer 0.2 | 2 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 65 | 43% | 93 |
| rsalesc.melee.Medina 0.4.5 | 48 | 32% | 61 |
| mz.MicroSheep 1.0 | 15 | 10% | 23 |
| arthord.NanoSatanMelee Beta | 9 | 6% | 9 |
| sadoner.killer 0.2 | 7 | 5% | 7 |
| cx.Princess 1.0 | 5 | 3% | 14 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

