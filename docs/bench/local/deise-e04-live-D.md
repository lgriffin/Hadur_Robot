# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.0 | 49 / 210 | 2.44 | 16.9% | 30537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.0% | 142 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 16.9% | 49 |
| sgp.JollyNinja 3.53 | 4.0 | 11.3% | 14 |
| mz.MicroGodMelee 1 | 4.0 | 10.9% | 1 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.5% | 2 |
| lorneswork.Predator 1.0 | 5.8 | 9.3% | 2 |
| adt.Ar2 1.0 | 6.8 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.4% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 79.4 | 9 / 35 | 4415 |
| 2 | 2 | 66.8 | 83.8 | 7 / 35 | 5455 |
| 3 | 2 | 66.6 | 82.2 | 11 / 35 | 5240 |
| 4 | 2 | 66.5 | 84.4 | 7 / 35 | 5135 |
| 5 | 2 | 67.6 | 88.9 | 7 / 35 | 5006 |
| 6 | 2 | 67.1 | 85.1 | 8 / 35 | 5286 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 10% |
| mz.MicroGodMelee 1 | 17 | 94% |
| sgp.JollyNinja 3.53 | 14 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 80% |
| lorneswork.Predator 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 1164. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 74% | 136 |
| sgp.JollyNinja 3.53 | 17 | 11% | 23 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 15 |
| mz.MicroGodMelee 1 | 6 | 4% | 19 |
| lorneswork.Predator 1.0 | 3 | 2% | 6 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 4 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.0 | 94 / 210 | 2.62 | 17.8% | 30927 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.8% | 94 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.5% | 48 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.8 | 13.3% | 35 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.5% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.5% | 7 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 7.7% | 3 |
| Noran.BitchingElk 0.054 | 7.2 | 7.8% | 9 |
| sch.Simone 0.3d | 7.5 | 7.5% | 8 |
| stelo.PatternRobot 1.0 | 8.7 | 6.1% | 4 |
| fullsail.SweetTea 1.1 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.0 | 14 / 35 | 5096 |
| 2 | 1 | 65.9 | 78.4 | 14 / 35 | 5258 |
| 3 | 1 | 66.4 | 80.6 | 15 / 35 | 4840 |
| 4 | 1 | 68.3 | 86.0 | 20 / 35 | 4919 |
| 5 | 1 | 68.2 | 83.5 | 18 / 35 | 5255 |
| 6 | 1 | 67.2 | 82.2 | 13 / 35 | 5559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 70% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 82% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| sch.Simone 0.3d | 7 | 71% |
| Noran.BitchingElk 0.054 | 7 | 86% |
| stelo.PatternRobot 1.0 | 5 | 40% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 45 | 38% | 69 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 24% | 57 |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 8% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 8% | 13 |
| sch.Simone 0.3d | 8 | 7% | 13 |
| fnc.bandit.Bandit 5.2.0 | 7 | 6% | 10 |
| stelo.PatternRobot 1.0 | 5 | 4% | 6 |
| Noran.BitchingElk 0.054 | 3 | 3% | 19 |
| fullsail.SweetTea 1.1 | 2 | 2% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.9 | 154 / 210 | 1.55 | 20.8% | 39306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.8% | 154 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.3% | 12 |
| radnor.DoctorBob 1.42 | 2.8 | 13.2% | 11 |
| vuen.Cake 2.51 | 3.7 | 12.7% | 27 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 6 |
| adt.Ar1 2.1 | 6.5 | 7.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 95.2 | 27 / 35 | 6712 |
| 2 | 1 | 72.1 | 96.8 | 29 / 35 | 6768 |
| 3 | 1 | 71.8 | 94.9 | 28 / 35 | 6606 |
| 4 | 1 | 70.9 | 92.4 | 23 / 35 | 6937 |
| 5 | 1 | 70.7 | 92.7 | 25 / 35 | 6287 |
| 6 | 1 | 69.7 | 91.1 | 22 / 35 | 5996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 76% |
| kawigi.nano.Lib 1.0 | 58 | 91% |
| radnor.DoctorBob 1.42 | 39 | 95% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 22 | 39% | 73 |
| kawigi.nano.Lib 1.0 | 17 | 30% | 76 |
| radnor.DoctorBob 1.42 | 9 | 16% | 37 |
| urdos.URDOS 1.3 | 5 | 9% | 9 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 7 |
| adt.Ar1 2.1 | 1 | 2% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 0 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.1 | 25 / 210 | 2.43 | 17.1% | 33944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 172 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 17.1% | 25 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 8 |
| TNT.TNT 0.99.1 | 4.2 | 10.0% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.0% | 1 |
| tj.zombie1n 1.0.1 | 6.2 | 7.4% | 1 |
| css.Delitioner 0.11 | 6.8 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.3 | 5.1% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 81.3 | 5 / 35 | 6009 |
| 2 | 2 | 67.5 | 83.5 | 6 / 35 | 5661 |
| 3 | 2 | 69.5 | 90.2 | 10 / 35 | 5924 |
| 4 | 2 | 67.0 | 83.2 | 2 / 35 | 5542 |
| 5 | 2 | 66.3 | 83.2 | 0 / 35 | 5341 |
| 6 | 2 | 67.1 | 83.5 | 2 / 35 | 5467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 13% |
| TNT.TNT 0.99.1 | 3 | 100% |
| tj.zombie1n 1.0.1 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| apc.LeeroyJenkins2 1.0 | 1 | 100% |

Hadur died in 185 of 210 rounds, at a mean tick of 1296. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 82% | 171 |
| apc.LeeroyJenkins2 1.0 | 17 | 9% | 19 |
| josago.Jorgito 0.16 | 7 | 4% | 7 |
| TNT.TNT 0.99.1 | 3 | 2% | 6 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.2 | 72.9 | 26 / 210 | 3.44 | 14.0% | 22687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.8% | 108 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 55 |
| hadur117.mini.DeiseD 0.3 | 3.0 | 14.0% | 26 |
| wompi.Numbat 2.1 | 4.0 | 12.5% | 14 |
| axeBots.HataMoto 3.09 | 5.5 | 9.0% | 5 |
| ms.Ares 0.19 | 5.5 | 9.2% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.5% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.2% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 77.5 | 8 / 35 | 4335 |
| 2 | 3 | 62.2 | 74.9 | 5 / 35 | 3477 |
| 3 | 3 | 61.4 | 72.4 | 4 / 35 | 3326 |
| 4 | 3 | 60.5 | 69.8 | 1 / 35 | 3685 |
| 5 | 3 | 62.0 | 71.4 | 5 / 35 | 3922 |
| 6 | 3 | 62.0 | 71.1 | 3 / 35 | 3942 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 30 | 13% |
| justin.DemonicRage 3.4 | 22 | 59% |
| wompi.Numbat 2.1 | 10 | 60% |
| axeBots.HataMoto 3.09 | 2 | 100% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 184 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 78 | 42% | 83 |
| justin.DemonicRage 3.4 | 61 | 33% | 73 |
| wompi.Numbat 2.1 | 25 | 14% | 31 |
| ms.Ares 0.19 | 12 | 7% | 13 |
| axeBots.HataMoto 3.09 | 5 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| davidalves.net.DuelistMicroMelee 1.4 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 80.2 | 90 / 210 | 2.78 | 17.0% | 28449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.0% | 90 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 38 |
| origin.SleepSiphon 1.7b | 3.2 | 13.7% | 49 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.3% | 17 |
| mld.Wisdom 1.0 | 4.8 | 10.3% | 7 |
| gg.Wolverine 2.0 | 5.8 | 9.2% | 3 |
| DBall.NUKE 0.1 | 7.7 | 6.9% | 3 |
| spinnercat.Omen 1.0 | 7.7 | 6.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.7 | 5.9% | 4 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 76.8 | 13 / 35 | 4618 |
| 2 | 1 | 66.0 | 79.4 | 16 / 35 | 4612 |
| 3 | 1 | 68.1 | 86.0 | 16 / 35 | 5081 |
| 4 | 1 | 66.7 | 81.6 | 17 / 35 | 4951 |
| 5 | 1 | 66.2 | 81.3 | 14 / 35 | 4756 |
| 6 | 1 | 64.4 | 76.2 | 14 / 35 | 4431 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 36 | 81% |
| origin.SleepSiphon 1.7b | 31 | 81% |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 80% |
| gg.Wolverine 2.0 | 11 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 83% |
| spinnercat.Omen 1.0 | 3 | 100% |
| mld.Wisdom 1.0 | 2 | 0% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 38 | 31% | 57 |
| origin.SleepSiphon 1.7b | 25 | 20% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 19% | 41 |
| mld.Wisdom 1.0 | 19 | 16% | 25 |
| gg.Wolverine 2.0 | 6 | 5% | 12 |
| spinnercat.Omen 1.0 | 4 | 3% | 6 |
| DBall.NUKE 0.1 | 4 | 3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 7 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.4 | 123 / 210 | 1.78 | 19.9% | 36085 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.9% | 123 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.2% | 47 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 27 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.2% | 7 |
| franzor.Lizt 1.3.1 | 4.7 | 10.7% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.5% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.1% | 0 |
| sample.Target 1.0 | 9.0 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.3 | 17 / 35 | 5512 |
| 2 | 1 | 70.8 | 89.8 | 19 / 35 | 5905 |
| 3 | 1 | 72.7 | 94.3 | 25 / 35 | 6604 |
| 4 | 1 | 71.7 | 92.7 | 24 / 35 | 5824 |
| 5 | 1 | 70.9 | 90.5 | 16 / 35 | 5934 |
| 6 | 1 | 71.9 | 93.7 | 22 / 35 | 6306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 80 | 81% |
| rsalesc.melee.Monk 0.3.6c | 50 | 36% |
| oog.melee.CapuletDroid 1.1 | 26 | 92% |
| franzor.Lizt 1.3.1 | 17 | 82% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1316. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 46 | 53% | 78 |
| rtk.Tachikoma 1.0 | 33 | 38% | 92 |
| oog.melee.CapuletDroid 1.1 | 5 | 6% | 33 |
| franzor.Lizt 1.3.1 | 3 | 3% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.5 | 119 / 210 | 2.12 | 18.8% | 30624 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.8% | 119 |
| tm.Yuugao 1.0 | 2.3 | 12.7% | 30 |
| shrub.Vapour v159 | 2.7 | 12.9% | 31 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.1% | 9 |
| Krabb.sliNk.Garm 0.9u | 4.7 | 10.5% | 14 |
| m3thos.Eva00 1.1 | 6.5 | 8.2% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.3% | 6 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.3% | 1 |
| SHAM.WOW 1.4 | 9.0 | 6.3% | 0 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 21 / 35 | 5502 |
| 2 | 1 | 69.3 | 91.4 | 24 / 35 | 5131 |
| 3 | 1 | 68.0 | 87.9 | 18 / 35 | 5213 |
| 4 | 1 | 68.8 | 90.5 | 19 / 35 | 4947 |
| 5 | 1 | 64.7 | 77.8 | 15 / 35 | 4564 |
| 6 | 1 | 68.8 | 88.9 | 22 / 35 | 5267 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shrub.Vapour v159 | 45 | 71% |
| tm.Yuugao 1.0 | 41 | 66% |
| Krabb.sliNk.Garm 0.9u | 31 | 84% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 78% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 79% |
| SHAM.WOW 1.4 | 4 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 32 | 35% | 70 |
| shrub.Vapour v159 | 22 | 24% | 54 |
| Krabb.sliNk.Garm 0.9u | 15 | 16% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 8 | 9% | 23 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 7% | 16 |
| m3thos.Eva00 1.1 | 6 | 7% | 8 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.7 | 64 / 210 | 3.28 | 15.8% | 26617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.2% | 96 |
| hadur117.mini.DeiseD 0.3 | 1.8 | 15.8% | 64 |
| kc.micro.Figment 1.0 | 3.0 | 13.7% | 20 |
| yagami.Tidus 0.11 | 4.3 | 11.0% | 5 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.3% | 11 |
| mc2.enemy.Original 0.9 | 6.0 | 9.1% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.7% | 5 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.8% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 73.0 | 10 / 35 | 4305 |
| 2 | 2 | 64.3 | 74.3 | 12 / 35 | 4435 |
| 3 | 1 | 67.1 | 84.1 | 16 / 35 | 4553 |
| 4 | 2 | 62.5 | 71.4 | 8 / 35 | 3954 |
| 5 | 2 | 65.1 | 74.9 | 10 / 35 | 4946 |
| 6 | 2 | 63.0 | 70.2 | 8 / 35 | 4424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 50% |
| kc.micro.Figment 1.0 | 31 | 84% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 4 | 75% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 747. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 66 | 45% | 88 |
| kc.micro.Figment 1.0 | 27 | 18% | 50 |
| yagami.Tidus 0.11 | 13 | 9% | 23 |
| mc2.enemy.Original 0.9 | 13 | 9% | 20 |
| pedersen.Grishnakh 1.0 | 10 | 7% | 11 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 7 |
| dft.Calliope 5.6 | 6 | 4% | 7 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| step.nanoPri 1.0 | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.0 | 160 / 210 | 1.54 | 20.3% | 33665 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.3% | 160 |
| DTF.Kludgy 1.2b | 2.5 | 14.2% | 30 |
| ne.Chimera 1.2 | 2.8 | 13.1% | 6 |
| ejb.Polaris 1.0.1 | 3.8 | 12.1% | 8 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 1 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.1% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.3% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.3% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.2% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 89.2 | 23 / 35 | 5058 |
| 2 | 1 | 72.2 | 96.2 | 29 / 35 | 6031 |
| 3 | 1 | 70.6 | 93.0 | 27 / 35 | 5650 |
| 4 | 1 | 71.3 | 95.9 | 29 / 35 | 5836 |
| 5 | 1 | 70.5 | 94.0 | 25 / 35 | 5704 |
| 6 | 1 | 71.0 | 95.9 | 27 / 35 | 5386 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 58 | 74% |
| ejb.Polaris 1.0.1 | 45 | 93% |
| ne.Chimera 1.2 | 34 | 91% |
| vStar.RAFzilla 2.15 | 25 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| kurios.DOSexe .9b | 3 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 918. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 27 | 54% | 71 |
| ne.Chimera 1.2 | 9 | 18% | 36 |
| ejb.Polaris 1.0.1 | 6 | 12% | 52 |
| vStar.RAFzilla 2.15 | 2 | 4% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 4 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 10 |
| kurios.DOSexe .9b | 1 | 2% | 8 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| donjezza.Muncho 1.0 | 1 | 2% | 2 |

## Melee bench: F11

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.8 | 86 / 210 | 2.82 | 16.7% | 26721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.3 | 16.7% | 86 |
| rz.Aleph 0.34 | 1.8 | 15.5% | 56 |
| cx.mini.Nimrod 0.55 | 2.8 | 13.0% | 28 |
| djc.DynaBot 0.1.1 | 4.2 | 10.9% | 14 |
| rdt199.Warlord 0.73 | 5.3 | 9.5% | 8 |
| br2.MobyDickBot 1.6 | 6.0 | 8.8% | 7 |
| uji.YellohFellah 1.0 | 6.8 | 8.1% | 10 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.2% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.1 | 74.9 | 9 / 35 | 4069 |
| 2 | 2 | 62.8 | 73.3 | 12 / 35 | 3911 |
| 3 | 1 | 67.5 | 83.2 | 16 / 35 | 5137 |
| 4 | 1 | 65.1 | 79.4 | 14 / 35 | 4224 |
| 5 | 1 | 66.4 | 83.2 | 18 / 35 | 4442 |
| 6 | 1 | 67.5 | 84.8 | 17 / 35 | 4938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 57% |
| djc.DynaBot 0.1.1 | 22 | 82% |
| cx.mini.Nimrod 0.55 | 17 | 65% |
| uji.YellohFellah 1.0 | 13 | 77% |
| rdt199.Warlord 0.73 | 10 | 90% |
| br2.MobyDickBot 1.6 | 8 | 75% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 52 | 42% | 84 |
| cx.mini.Nimrod 0.55 | 25 | 20% | 35 |
| djc.DynaBot 0.1.1 | 13 | 10% | 26 |
| KiraNL.Chupacabra 0.4 | 10 | 8% | 12 |
| uji.YellohFellah 1.0 | 9 | 7% | 15 |
| rdt199.Warlord 0.73 | 7 | 6% | 20 |
| br2.MobyDickBot 1.6 | 6 | 5% | 15 |
| stelo.MirrorNano 1.3 | 1 | 1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.1 | 100 / 210 | 2.79 | 16.8% | 24451 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 16.8% | 100 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.9% | 33 |
| nat.PallasHawk 1.0 | 2.7 | 13.5% | 33 |
| darkcanuck.Leon 1.01 | 3.7 | 12.7% | 26 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 13 |
| jrm.Test0 1.0 | 6.3 | 7.9% | 0 |
| jp.Perpy 16.0 | 7.2 | 7.0% | 1 |
| cs.sheldor.Talon 1.1 | 7.8 | 6.6% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.9% | 4 |
| stuff.Vlad 0.1 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 77.5 | 9 / 35 | 4221 |
| 2 | 1 | 67.9 | 87.9 | 22 / 35 | 4193 |
| 3 | 1 | 64.9 | 78.1 | 16 / 35 | 3959 |
| 4 | 1 | 65.8 | 80.3 | 18 / 35 | 4279 |
| 5 | 1 | 64.3 | 74.6 | 18 / 35 | 4082 |
| 6 | 1 | 65.6 | 82.2 | 17 / 35 | 3717 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 38 | 74% |
| nat.PallasHawk 1.0 | 36 | 78% |
| bts.wiki.RipCurl 0.9b | 31 | 81% |
| brainfade.melee.Genghis 0.36 | 13 | 77% |
| jp.Perpy 16.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 4 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 656. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 25% | 42 |
| darkcanuck.Leon 1.01 | 23 | 21% | 57 |
| nat.PallasHawk 1.0 | 21 | 19% | 49 |
| brainfade.melee.Genghis 0.36 | 16 | 15% | 25 |
| cs.sheldor.Talon 1.1 | 10 | 9% | 13 |
| jrm.Test0 1.0 | 6 | 5% | 9 |
| jp.Perpy 16.0 | 3 | 3% | 6 |
| stuff.Vlad 0.1 | 3 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 82.3 | 59 / 210 | 2.60 | 16.0% | 26106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 16.9% | 91 |
| ags.Glacier 0.2.11 | 2.3 | 16.0% | 28 |
| hadur117.mini.DeiseD 0.3 | 2.5 | 16.0% | 59 |
| shinh.Entangled 0.3 | 4.3 | 12.1% | 18 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.4% | 11 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.4% | 5 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 84.1 | 9 / 35 | 4271 |
| 2 | 1 | 67.7 | 87.6 | 15 / 35 | 4736 |
| 3 | 3 | 65.4 | 81.3 | 11 / 35 | 4407 |
| 4 | 3 | 63.3 | 76.8 | 7 / 35 | 4011 |
| 5 | 3 | 63.5 | 80.3 | 6 / 35 | 3860 |
| 6 | 2 | 66.5 | 83.5 | 11 / 35 | 4821 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 38% |
| ags.Glacier 0.2.11 | 38 | 68% |
| shinh.Entangled 0.3 | 12 | 50% |
| gh.micro.Gruweltje 0.7 | 7 | 57% |
| stelo.Wang 1.0 | 2 | 0% |

Hadur died in 153 of 210 rounds, at a mean tick of 899. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 61 | 40% | 84 |
| ags.Glacier 0.2.11 | 47 | 31% | 70 |
| shinh.Entangled 0.3 | 15 | 10% | 23 |
| gh.micro.Gruweltje 0.7 | 13 | 8% | 18 |
| stelo.Wang 1.0 | 11 | 7% | 11 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.4 | 139 / 210 | 1.86 | 19.7% | 34335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.7% | 139 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 35 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.9% | 21 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.1% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.8% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.6% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.7% | 5 |
| pa.Improved 1.0 | 9.0 | 5.8% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 19 / 35 | 5350 |
| 2 | 1 | 70.4 | 91.1 | 25 / 35 | 5796 |
| 3 | 1 | 70.1 | 88.9 | 25 / 35 | 5642 |
| 4 | 1 | 70.1 | 92.4 | 23 / 35 | 5582 |
| 5 | 1 | 69.6 | 89.2 | 21 / 35 | 6125 |
| 6 | 1 | 71.2 | 94.0 | 26 / 35 | 5840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 90 | 81% |
| catcat20.shape.Theta 0.018 | 47 | 74% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 90% |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 89% |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 809. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 33 | 46% | 107 |
| catcat20.shape.Theta 0.018 | 18 | 25% | 46 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 8% | 17 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 8% | 11 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 6% | 16 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 4 |
| pa.Improved 1.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 79.8 | 93 / 210 | 2.81 | 17.5% | 32092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.5% | 93 |
| kawigi.micro.Shiz 1.1 | 2.3 | 14.2% | 25 |
| mld.DustBunny 3.8 | 3.3 | 12.5% | 18 |
| emp.Yngwie 1.11 | 3.5 | 12.7% | 48 |
| cb.nano.Insomnia 1.0 | 4.8 | 11.1% | 6 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.8% | 17 |
| lambdaxy.TBot 0.1 | 7.0 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 8.7 | 5.8% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.0 | 16 / 35 | 5336 |
| 2 | 1 | 65.9 | 78.4 | 12 / 35 | 5287 |
| 3 | 1 | 66.1 | 77.1 | 14 / 35 | 5174 |
| 4 | 1 | 66.7 | 80.6 | 14 / 35 | 5279 |
| 5 | 1 | 68.4 | 84.8 | 20 / 35 | 5389 |
| 6 | 1 | 67.5 | 79.0 | 17 / 35 | 5627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 37 | 89% |
| emp.Yngwie 1.11 | 24 | 38% |
| cb.nano.Insomnia 1.0 | 20 | 80% |
| mld.DustBunny 3.8 | 20 | 80% |
| kawigi.robot.Girl 1.2 | 17 | 88% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 30% | 59 |
| cb.nano.Insomnia 1.0 | 22 | 19% | 27 |
| mld.DustBunny 3.8 | 21 | 18% | 45 |
| kawigi.micro.Shiz 1.1 | 17 | 15% | 41 |
| kawigi.robot.Girl 1.2 | 11 | 9% | 18 |
| divineomega.TrialBot 0.003 | 6 | 5% | 12 |
| Grystrion.TrackerWO 1.0 | 4 | 3% | 4 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 78.4 | 75 / 210 | 2.95 | 17.1% | 32398 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| gh.Griezel 0.5.2 | 1.5 | 17.2% | 71 |
| hadur117.mini.DeiseD 0.3 | 1.5 | 17.1% | 75 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 11.2% | 40 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.0 | 7.1% | 2 |
| divineomega.DivineBot 1.9.4.5 | 8.8 | 5.1% | 5 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 1 |
| repositorio.NanoStep 1.0 | 9.2 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 75.6 | 8 / 35 | 5270 |
| 2 | 1 | 67.6 | 80.0 | 15 / 35 | 5392 |
| 3 | 2 | 66.2 | 77.5 | 10 / 35 | 5438 |
| 4 | 2 | 65.3 | 75.2 | 12 / 35 | 5033 |
| 5 | 1 | 66.8 | 78.1 | 14 / 35 | 5649 |
| 6 | 1 | 68.4 | 83.8 | 16 / 35 | 5616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 73 | 60% |
| techdude.forest.FlamingForest 1.1 | 22 | 32% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| bvh.fnr.Fenrir 0.36l | 3 | 100% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 66 | 49% | 109 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 17% | 31 |
| techdude.forest.FlamingForest 1.1 | 19 | 14% | 27 |
| bvh.fnr.Fenrir 0.36l | 11 | 8% | 12 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 5 | 4% | 6 |
| stelo.IntrinsicVolatility 1.4 | 3 | 2% | 9 |
| asd.Cthulhu 1.3 | 3 | 2% | 5 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.7 | 98 / 210 | 2.56 | 17.9% | 32128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.9% | 98 |
| et.Predator 1.8 | 2.7 | 13.3% | 22 |
| cx.BlestPain 1.41 | 3.2 | 12.5% | 37 |
| oog.melee.Mercutio 1.0 | 3.7 | 12.3% | 36 |
| nic.Nicator 2.4 | 4.8 | 11.2% | 11 |
| ahf.NanoAndrew .4 | 6.0 | 10.1% | 6 |
| maribo.melee.BMV 0.1 | 6.7 | 8.9% | 0 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 81.3 | 17 / 35 | 5491 |
| 2 | 1 | 67.0 | 80.6 | 16 / 35 | 5438 |
| 3 | 1 | 69.1 | 88.9 | 19 / 35 | 5393 |
| 4 | 1 | 68.8 | 87.3 | 18 / 35 | 5518 |
| 5 | 1 | 66.2 | 80.3 | 13 / 35 | 5105 |
| 6 | 1 | 66.2 | 77.8 | 15 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 49 | 80% |
| oog.melee.Mercutio 1.0 | 29 | 62% |
| cx.BlestPain 1.41 | 22 | 32% |
| ahf.NanoAndrew .4 | 18 | 94% |
| nic.Nicator 2.4 | 17 | 82% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| goblin.Bender 2.4 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 29 | 26% | 65 |
| cx.BlestPain 1.41 | 25 | 22% | 35 |
| oog.melee.Mercutio 1.0 | 21 | 19% | 39 |
| nic.Nicator 2.4 | 18 | 16% | 33 |
| ahf.NanoAndrew .4 | 11 | 10% | 23 |
| maribo.melee.BMV 0.1 | 3 | 3% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 3 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.1 | 125 / 210 | 2.25 | 18.5% | 29093 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.5% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 12.8% | 26 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.0% | 26 |
| uji.DBH 1.1 | 4.5 | 10.8% | 16 |
| ratosh.Nobo 0.21 | 5.0 | 10.0% | 4 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.9% | 7 |
| sigterm.Sigterm 1.0 | 7.0 | 7.9% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 0 |
| stelo.WangRobot 1.0 | 9.2 | 5.7% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.9 | 18 / 35 | 4904 |
| 2 | 1 | 68.5 | 90.5 | 18 / 35 | 4776 |
| 3 | 1 | 68.8 | 87.9 | 23 / 35 | 5079 |
| 4 | 1 | 68.7 | 88.3 | 24 / 35 | 4875 |
| 5 | 1 | 66.9 | 82.5 | 20 / 35 | 4816 |
| 6 | 1 | 67.3 | 85.4 | 22 / 35 | 4643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 80% |
| agd.Mooserwirt2 2.7 | 37 | 70% |
| uji.DBH 1.1 | 17 | 76% |
| spinnercat.Robovirus 2.718 | 14 | 86% |
| sigterm.Sigterm 1.0 | 11 | 100% |
| ratosh.Nobo 0.21 | 10 | 100% |
| stelo.WangRobot 1.0 | 8 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 27% | 66 |
| agd.Mooserwirt2 2.7 | 19 | 22% | 49 |
| uji.DBH 1.1 | 16 | 19% | 25 |
| ratosh.Nobo 0.21 | 12 | 14% | 28 |
| spinnercat.Robovirus 2.718 | 7 | 8% | 16 |
| stelo.WangRobot 1.0 | 4 | 5% | 9 |
| sigterm.Sigterm 1.0 | 2 | 2% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 6 |

## Melee bench: F19

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 92.9 | 155 / 210 | 1.64 | 20.8% | 36247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.8% | 155 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.5 | 14.2% | 17 |
| mld.Infinity 2.2 | 2.5 | 14.4% | 27 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.1% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.2% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 4 |
| mbh.Mbh 0.1 | 7.2 | 7.3% | 0 |
| pac.ABC 2.1 | 7.8 | 6.7% | 3 |
| pbg.R2D2 1.0 | 9.0 | 5.6% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.4 | 26 / 35 | 5753 |
| 2 | 1 | 71.7 | 93.7 | 25 / 35 | 6111 |
| 3 | 1 | 71.3 | 89.8 | 23 / 35 | 6233 |
| 4 | 1 | 71.8 | 95.2 | 28 / 35 | 5557 |
| 5 | 1 | 72.6 | 94.9 | 27 / 35 | 6478 |
| 6 | 1 | 71.6 | 92.4 | 26 / 35 | 6115 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 74 | 93% |
| mld.Infinity 2.2 | 53 | 83% |
| krillr.mini.JointStrike 2.0.0 | 15 | 100% |
| erdnis.Rover 0.3 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| pbg.R2D2 1.0 | 5 | 80% |
| mbh.Mbh 0.1 | 2 | 100% |
| pac.ABC 2.1 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 23 | 42% | 110 |
| mld.Infinity 2.2 | 14 | 25% | 28 |
| krillr.mini.JointStrike 2.0.0 | 7 | 13% | 27 |
| erdnis.Rover 0.3 | 6 | 11% | 14 |
| patson.PatsonTestBot 1.0 | 3 | 5% | 14 |
| pbg.R2D2 1.0 | 2 | 4% | 6 |
| pac.ABC 2.1 | 0 | 0% | 4 |
| mbh.Mbh 0.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 85.9 | 116 / 210 | 2.27 | 19.2% | 34840 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.2% | 116 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 35 |
| fwb.Nine 1.0.1 | 3.8 | 11.4% | 22 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.4% | 10 |
| catcat20.Rabbit 0.001 | 4.3 | 10.8% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.9% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.5% | 1 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.4% | 4 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.5 | 19 / 35 | 5433 |
| 2 | 1 | 69.2 | 83.5 | 19 / 35 | 6082 |
| 3 | 1 | 68.1 | 84.1 | 18 / 35 | 5503 |
| 4 | 1 | 68.8 | 85.4 | 17 / 35 | 5803 |
| 5 | 1 | 69.7 | 88.3 | 18 / 35 | 5887 |
| 6 | 1 | 71.2 | 91.7 | 25 / 35 | 6132 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 74 | 80% |
| catcat20.Rabbit 0.001 | 31 | 68% |
| fwb.Nine 1.0.1 | 26 | 62% |
| nz.jdc.nano.GridFu 1.0 | 11 | 73% |
| djdjdj.NanoSkunk10 1.0 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 37 | 39% | 86 |
| fwb.Nine 1.0.1 | 17 | 18% | 23 |
| nz.jdc.nano.GridFu 1.0 | 15 | 16% | 32 |
| catcat20.Rabbit 0.001 | 14 | 15% | 39 |
| bayen.nut.Squirrel 1.615 | 5 | 5% | 9 |
| ntc.ControlledChaos 1.1.4 | 3 | 3% | 5 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F21

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.6 | 122 / 210 | 1.93 | 19.8% | 35067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.8% | 122 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 60 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.8% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 8 |
| eld.Hmm 1.0 | 5.3 | 9.0% | 10 |
| oa.weak.BotherBot 0.1 | 5.8 | 8.2% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.3% | 0 |
| el.JumpShoot 0.2 | 7.8 | 5.8% | 0 |
| arthord.MannyPacquiao Beta | 9.3 | 4.8% | 0 |
| PSW.Relentless 0.1 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.0 | 17 / 35 | 5635 |
| 2 | 1 | 69.7 | 87.9 | 19 / 35 | 5808 |
| 3 | 1 | 71.1 | 91.7 | 22 / 35 | 6133 |
| 4 | 1 | 70.2 | 89.8 | 18 / 35 | 5986 |
| 5 | 1 | 70.4 | 88.6 | 22 / 35 | 5823 |
| 6 | 1 | 70.6 | 93.7 | 24 / 35 | 5682 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 87 | 63% |
| dummy.mini.Scimitar 1.01 | 29 | 93% |
| cf.RiO.RiOx 4.2.1 | 19 | 100% |
| eld.Hmm 1.0 | 18 | 83% |
| oa.weak.BotherBot 0.1 | 6 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 1227. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 44 | 49% | 81 |
| dummy.mini.Scimitar 1.01 | 26 | 29% | 67 |
| cf.RiO.RiOx 4.2.1 | 12 | 13% | 30 |
| eld.Hmm 1.0 | 3 | 3% | 20 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 9 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.0 | 91 / 210 | 2.26 | 18.3% | 32328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.3% | 91 |
| pe.SandboxDT 2.71m | 2.2 | 15.7% | 53 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.8% | 32 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.3% | 29 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 3 |
| yk.JahRoslav 1.1 | 7.0 | 6.4% | 1 |
| gg.Squaraus 0.6 | 7.0 | 6.0% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 4.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.4 | 18 / 35 | 5283 |
| 2 | 1 | 68.9 | 89.5 | 14 / 35 | 5501 |
| 3 | 1 | 67.2 | 81.3 | 12 / 35 | 5202 |
| 4 | 1 | 69.7 | 89.5 | 18 / 35 | 5505 |
| 5 | 1 | 67.6 | 83.2 | 13 / 35 | 5215 |
| 6 | 1 | 69.3 | 87.0 | 16 / 35 | 5622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 44 | 52% |
| kvk.HebusLeTroll 0.35 | 40 | 73% |
| jlm.javaDisturbance 0.59 | 38 | 68% |
| bigpete.Stewie 1.0 | 8 | 100% |
| pbg.NinjaX 1.2 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 50% |

Hadur died in 119 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 41 | 34% | 66 |
| kvk.HebusLeTroll 0.35 | 37 | 31% | 64 |
| jlm.javaDisturbance 0.59 | 32 | 27% | 58 |
| bigpete.Stewie 1.0 | 5 | 4% | 14 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| gg.Squaraus 0.6 | 1 | 1% | 1 |
| tad.Dalek98 0.98 | 1 | 1% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |

## Melee bench: F23

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.8 | 130 / 210 | 1.92 | 19.3% | 30739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.3% | 130 |
| pe.SandboxLump 1.52 | 2.0 | 17.5% | 54 |
| cre.Karolos 0.32 | 3.0 | 14.2% | 17 |
| stelo.AreaTargetingBot 1.1 | 4.8 | 9.9% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.0% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.2% | 1 |
| sample.Walls 1.0 | 6.8 | 8.0% | 0 |
| cw.megas.Blade 0.8 | 7.3 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 91.4 | 24 / 35 | 5108 |
| 2 | 1 | 70.1 | 88.9 | 23 / 35 | 5439 |
| 3 | 1 | 70.6 | 89.8 | 22 / 35 | 5103 |
| 4 | 1 | 69.5 | 88.6 | 17 / 35 | 5163 |
| 5 | 1 | 69.7 | 87.9 | 20 / 35 | 5029 |
| 6 | 1 | 70.5 | 92.1 | 24 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 88 | 73% |
| cre.Karolos 0.32 | 36 | 86% |
| stelo.AreaTargetingBot 1.1 | 16 | 88% |
| sample.Walls 1.0 | 11 | 100% |
| stelo.RamTrackSurfer 1.2 | 8 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 47 | 58% | 105 |
| cre.Karolos 0.32 | 22 | 27% | 58 |
| stelo.AreaTargetingBot 1.1 | 6 | 7% | 17 |
| cw.megas.Blade 0.8 | 2 | 2% | 4 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 4 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 1 |
| sample.Walls 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 74.3 | 68 / 210 | 3.31 | 15.2% | 23763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.5 | 15.2% | 68 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.8% | 37 |
| florent.XSeries.X2 0.12 | 2.7 | 13.5% | 38 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.9% | 15 |
| davidalves.Phoenix 0.54 | 4.3 | 12.1% | 40 |
| oog.melee.Corsair 1.0 | 6.0 | 9.5% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.3% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.2 | 5.4% | 1 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 81.6 | 15 / 35 | 3980 |
| 2 | 1 | 62.5 | 72.7 | 11 / 35 | 3958 |
| 3 | 4 | 58.8 | 64.4 | 7 / 35 | 3420 |
| 4 | 1 | 62.6 | 74.0 | 11 / 35 | 3912 |
| 5 | 1 | 63.1 | 74.3 | 11 / 35 | 4077 |
| 6 | 1 | 65.2 | 79.0 | 13 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 27 | 63% |
| davidalves.Phoenix 0.54 | 23 | 43% |
| florent.XSeries.X2 0.12 | 13 | 62% |
| pedersen.Ugluk 1.1.1 | 13 | 85% |
| stelo.SoJNanoMelee 1.1 | 12 | 100% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| as.FrankTheTank 1.3 | 4 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 38 | 27% | 48 |
| florent.XSeries.X2 0.12 | 35 | 24% | 48 |
| rz.GlowBlowMelee 1.4 | 31 | 22% | 54 |
| pedersen.Ugluk 1.1.1 | 20 | 14% | 30 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 10 |
| oog.melee.Corsair 1.0 | 5 | 3% | 7 |
| as.FrankTheTank 1.3 | 4 | 3% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 5 |
| evd.X1 0.01 | 2 | 1% | 3 |

## Melee bench: F25

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.5 | 123 / 210 | 2.57 | 18.0% | 27445 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.0% | 123 |
| voidious.mini.BrokenSword 2.0.3 | 2.7 | 13.3% | 24 |
| voidious.micro.BlitzBat 1.05 | 2.8 | 13.0% | 15 |
| jdw.Hurricane 1.4 | 3.5 | 12.2% | 29 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.0% | 8 |
| ds.Oo 2.2 | 5.7 | 8.8% | 6 |
| awesomeness.Elite 1.0 | 7.5 | 7.5% | 2 |
| gjr.Cephalosporin 0.1 | 7.8 | 7.2% | 2 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.5 | 22 / 35 | 4488 |
| 2 | 1 | 68.2 | 85.7 | 24 / 35 | 4542 |
| 3 | 1 | 68.8 | 88.9 | 23 / 35 | 4602 |
| 4 | 1 | 66.1 | 77.5 | 19 / 35 | 4759 |
| 5 | 1 | 67.5 | 82.9 | 18 / 35 | 4770 |
| 6 | 1 | 65.4 | 77.8 | 17 / 35 | 4284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 44 | 93% |
| voidious.mini.BrokenSword 2.0.3 | 41 | 90% |
| jdw.Hurricane 1.4 | 21 | 81% |
| ds.Oo 2.2 | 9 | 100% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 5 | 80% |
| gre.svman4.Morfeas 1.4.1 | 5 | 60% |

Hadur died in 87 of 210 rounds, at a mean tick of 544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 24 | 28% | 46 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 22% | 50 |
| voidious.micro.BlitzBat 1.05 | 17 | 20% | 49 |
| adt.Ar2 1.1 | 8 | 9% | 12 |
| ds.Oo 2.2 | 7 | 8% | 21 |
| gjr.Cephalosporin 0.1 | 4 | 5% | 16 |
| gre.svman4.Morfeas 1.4.1 | 4 | 5% | 9 |
| amk.ChumbaMini 0.2 | 3 | 3% | 4 |
| awesomeness.Elite 1.0 | 1 | 1% | 3 |

## Melee bench: F26

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.0 | 108 / 210 | 2.35 | 18.3% | 33497 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.3% | 108 |
| ak.Fermat 2.0 | 2.0 | 15.3% | 44 |
| shu.nitro.LENIN .T34 | 3.5 | 12.2% | 25 |
| lrem.Spectre 0.4.4 | 3.7 | 12.3% | 24 |
| js.PinBall 1.6 | 4.8 | 10.7% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.6% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.4% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 4 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 85.1 | 17 / 35 | 5652 |
| 2 | 1 | 68.4 | 85.4 | 19 / 35 | 5277 |
| 3 | 1 | 68.2 | 83.5 | 17 / 35 | 5608 |
| 4 | 1 | 67.7 | 83.5 | 16 / 35 | 5640 |
| 5 | 1 | 68.6 | 85.4 | 19 / 35 | 5527 |
| 6 | 1 | 69.2 | 87.3 | 20 / 35 | 5793 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 74% |
| shu.nitro.LENIN .T34 | 37 | 76% |
| lrem.Spectre 0.4.4 | 29 | 79% |
| js.PinBall 1.6 | 8 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 31 | 30% | 64 |
| shu.nitro.LENIN .T34 | 29 | 28% | 58 |
| lrem.Spectre 0.4.4 | 23 | 22% | 42 |
| js.PinBall 1.6 | 8 | 8% | 21 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 4% | 9 |
| gh.mini.GrubbmOne 1.0 | 4 | 4% | 8 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 6 |
| sample.SpinBot 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.7 | 127 / 210 | 2.47 | 18.2% | 29380 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.2% | 127 |
| mk.Alpha 0.2.1 | 2.2 | 13.9% | 42 |
| EH.Eagle 1.0.6 | 3.3 | 11.2% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.8% | 16 |
| wee.Gem 1.8.4 | 4.5 | 10.8% | 15 |
| throxbot.ThroxBot 0.1 | 7.0 | 8.2% | 2 |
| joe.ADinosaur 1.0 | 7.2 | 8.0% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 7.2 | 8.6% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.4% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.4 | 18 / 35 | 4488 |
| 2 | 1 | 69.2 | 90.2 | 26 / 35 | 4793 |
| 3 | 1 | 67.9 | 73.0 | 22 / 35 | 5857 |
| 4 | 1 | 67.8 | 86.0 | 23 / 35 | 4761 |
| 5 | 1 | 67.0 | 82.9 | 21 / 35 | 4802 |
| 6 | 1 | 66.9 | 84.4 | 17 / 35 | 4679 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 62 | 79% |
| wee.Gem 1.8.4 | 27 | 81% |
| EH.Eagle 1.0.6 | 24 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 22 | 82% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |

Hadur died in 84 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 27 | 32% | 74 |
| wee.Gem 1.8.4 | 15 | 18% | 36 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 14% | 34 |
| joe.ADinosaur 1.0 | 8 | 10% | 12 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 13 |
| EH.Eagle 1.0.6 | 5 | 6% | 29 |
| caimano.Furia_Ceca 0.22 | 5 | 6% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 6 |
| cs.Grudge 1.0 | 2 | 2% | 1 |
1 death(s) with no robot to name.

## Melee bench: F28

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.4 | 144 / 210 | 1.96 | 19.3% | 28813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.3% | 144 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 34 |
| uji.Antique 1.0 | 3.2 | 11.7% | 17 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.6% | 5 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 4 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 0 |
| ahr.ice.Ice 1.0.2 | 7.3 | 7.4% | 2 |
| stelo.PianistNano 1.2 | 8.3 | 6.3% | 1 |
| matt.advanced.Katana 1.0 | 8.5 | 6.1% | 2 |
| stelo.Lifestealer 1.0 | 9.3 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 90.8 | 24 / 35 | 5202 |
| 2 | 1 | 66.8 | 82.5 | 20 / 35 | 4664 |
| 3 | 1 | 69.0 | 90.5 | 26 / 35 | 4546 |
| 4 | 1 | 70.7 | 95.2 | 26 / 35 | 4873 |
| 5 | 1 | 68.5 | 86.0 | 23 / 35 | 4743 |
| 6 | 1 | 69.6 | 91.1 | 25 / 35 | 4785 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 83 | 81% |
| uji.Antique 1.0 | 41 | 85% |
| qohnil.blot.BlotBot 3.61 | 18 | 94% |
| pfvicm.Sobieski 7.2.3b | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 38% | 85 |
| amk.ChumbaWumba 0.3 | 12 | 18% | 16 |
| uji.Antique 1.0 | 10 | 15% | 45 |
| pfvicm.Sobieski 7.2.3b | 7 | 11% | 15 |
| qohnil.blot.BlotBot 3.61 | 5 | 8% | 26 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 12 |
| matt.advanced.Katana 1.0 | 2 | 3% | 7 |
| stelo.PianistNano 1.2 | 1 | 2% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 81.7 | 98 / 210 | 2.64 | 18.0% | 30270 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.0% | 98 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.2% | 56 |
| deewiant.Anomaly 0.2 | 2.8 | 14.6% | 35 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 6 |
| jok.PheonixM 0.1.2 | 4.8 | 11.1% | 8 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.4% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.6% | 7 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.2% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.8% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 78.4 | 15 / 35 | 4975 |
| 2 | 1 | 67.8 | 83.2 | 15 / 35 | 5059 |
| 3 | 1 | 67.5 | 81.6 | 16 / 35 | 4942 |
| 4 | 1 | 67.8 | 81.3 | 17 / 35 | 5036 |
| 5 | 1 | 68.0 | 84.1 | 15 / 35 | 4932 |
| 6 | 1 | 68.9 | 81.9 | 20 / 35 | 5326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 48 | 58% |
| deewiant.Anomaly 0.2 | 46 | 80% |
| myl.micro.Troodon 1.10 | 14 | 93% |
| jok.PheonixM 0.1.2 | 13 | 92% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 43 | 38% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 25% | 59 |
| myl.micro.Troodon 1.10 | 17 | 15% | 29 |
| jok.PheonixM 0.1.2 | 13 | 12% | 23 |
| jangs.ns51 1.0 | 5 | 4% | 6 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 4 |
| DBall.Anarchy 0.1 | 2 | 2% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.6 | 44 / 210 | 3.47 | 14.8% | 25545 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.5 | 14.8% | 44 |
| oog.melee.Capulet 1.2 | 2.7 | 13.5% | 41 |
| darkcanuck.B26354 1.06 | 3.3 | 12.8% | 37 |
| catcat20.Matcha 0.006 | 3.7 | 12.8% | 45 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.6% | 24 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.7% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.6% | 6 |
| ntc.Opposite 1.5 | 8.0 | 7.6% | 0 |
| tripphippy.Alice 1.1 | 8.0 | 7.1% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.9 | 72.4 | 10 / 35 | 4410 |
| 2 | 1 | 63.9 | 76.5 | 8 / 35 | 4578 |
| 3 | 3 | 61.6 | 70.2 | 8 / 35 | 3987 |
| 4 | 2 | 62.6 | 71.4 | 6 / 35 | 4290 |
| 5 | 1 | 61.5 | 72.7 | 6 / 35 | 3938 |
| 6 | 1 | 62.5 | 72.4 | 6 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 27 | 48% |
| darkcanuck.B26354 1.06 | 20 | 60% |
| oog.melee.Capulet 1.2 | 15 | 47% |
| stelo.PastFuture 2.3.2 | 11 | 55% |
| fowl3628800.LightningBolt 2.6.0 | 5 | 80% |
| tripphippy.Alice 1.1 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 0% |

Hadur died in 166 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 24% | 47 |
| stelo.PastFuture 2.3.2 | 37 | 22% | 43 |
| darkcanuck.B26354 1.06 | 32 | 19% | 46 |
| catcat20.Matcha 0.006 | 29 | 17% | 44 |
| fowl3628800.LightningBolt 2.6.0 | 9 | 5% | 10 |
| ntc.Opposite 1.5 | 8 | 5% | 8 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 8 |
| tripphippy.Alice 1.1 | 4 | 2% | 4 |

## Melee bench: F31

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 70.3 | 45 / 210 | 3.67 | 14.1% | 22057 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.2% | 93 |
| hadur117.mini.DeiseD 0.3 | 2.2 | 14.1% | 45 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 43 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.8% | 11 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.3% | 14 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.8% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 7.0% | 3 |
| fm.mammillarias 1.3 | 8.2 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 56.5 | 59.7 | 1 / 35 | 3403 |
| 2 | 2 | 60.5 | 68.6 | 8 / 35 | 3480 |
| 3 | 1 | 64.2 | 77.8 | 8 / 35 | 4139 |
| 4 | 3 | 60.6 | 67.3 | 8 / 35 | 3824 |
| 5 | 2 | 62.8 | 75.2 | 11 / 35 | 3573 |
| 6 | 2 | 62.7 | 73.3 | 9 / 35 | 3638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 37 | 49% |
| gh.mini.Griezel 0.2 | 14 | 57% |
| spinnercat.micro.Tyger 0.1 | 11 | 91% |
| d414.nano.Quantum 1.0.0 | 6 | 50% |
| gh.nano.Grofvuil 0.2 | 3 | 100% |
| fm.mammillarias 1.3 | 3 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |

Hadur died in 166 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 57 | 34% | 72 |
| gh.mini.Griezel 0.2 | 39 | 23% | 51 |
| spinnercat.micro.Tyger 0.1 | 24 | 14% | 33 |
| d414.nano.Quantum 1.0.0 | 14 | 8% | 19 |
| timmit.nano.TimDog 0.33 | 11 | 7% | 12 |
| gh.nano.Grofvuil 0.2 | 9 | 5% | 12 |
| fm.mammillarias 1.3 | 8 | 5% | 9 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 2 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.0 | 121 / 210 | 2.26 | 18.3% | 29763 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.3% | 121 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.4% | 53 |
| apc.botM 3.0 | 3.3 | 11.8% | 18 |
| lxx.ConceptA 0.8 | 4.2 | 10.3% | 2 |
| vjik.UnViolation 1.1 | 5.2 | 9.1% | 9 |
| bayen.UbaMicro 1.4 | 5.3 | 9.0% | 1 |
| yk.JahMicro 1.0 | 7.8 | 6.9% | 3 |
| panzer.Panzer 0.2 | 7.8 | 7.0% | 0 |
| conscience.Electron 1.3g | 8.5 | 6.7% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 85.7 | 21 / 35 | 4760 |
| 2 | 1 | 65.1 | 79.0 | 17 / 35 | 4558 |
| 3 | 1 | 68.8 | 89.8 | 23 / 35 | 5243 |
| 4 | 1 | 67.8 | 85.4 | 18 / 35 | 5181 |
| 5 | 1 | 69.2 | 90.2 | 24 / 35 | 5221 |
| 6 | 1 | 67.2 | 85.7 | 18 / 35 | 4800 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 76 | 63% |
| apc.botM 3.0 | 25 | 92% |
| lxx.ConceptA 0.8 | 20 | 90% |
| vjik.UnViolation 1.1 | 10 | 90% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| panzer.Panzer 0.2 | 7 | 100% |
| donjezza.Jezza 1.0 | 5 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 47% | 95 |
| lxx.ConceptA 0.8 | 18 | 20% | 28 |
| apc.botM 3.0 | 15 | 17% | 39 |
| bayen.UbaMicro 1.4 | 5 | 6% | 13 |
| vjik.UnViolation 1.1 | 3 | 3% | 18 |
| conscience.Electron 1.3g | 3 | 3% | 2 |
| panzer.Panzer 0.2 | 1 | 1% | 7 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |

## Melee bench: F33

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.8 | 125 / 210 | 2.46 | 18.6% | 30893 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.6% | 125 |
| maribo.Quester 0.3 | 2.0 | 15.0% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.6% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 11.2% | 17 |
| labg.Cataclysm 2.05 | 4.7 | 10.7% | 19 |
| baal.nano.N 1.42 | 6.3 | 8.7% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.0% | 4 |
| zyx.micro.Ant 1.1 | 8.5 | 5.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.2 | 4.7% | 0 |
| sanja.First 0.1 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.5 | 17 / 35 | 5045 |
| 2 | 1 | 68.4 | 84.8 | 21 / 35 | 5044 |
| 3 | 1 | 68.6 | 84.8 | 23 / 35 | 5109 |
| 4 | 1 | 66.6 | 77.1 | 21 / 35 | 4900 |
| 5 | 1 | 69.7 | 86.7 | 23 / 35 | 5435 |
| 6 | 1 | 69.3 | 86.7 | 20 / 35 | 5360 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 42 | 93% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 95% |
| gre.svman4.Leonidas 1.3.2 | 31 | 94% |
| labg.Cataclysm 2.05 | 14 | 64% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 39% | 81 |
| gre.svman4.Leonidas 1.3.2 | 17 | 20% | 30 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 18% | 57 |
| labg.Cataclysm 2.05 | 9 | 11% | 19 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 7% | 8 |
| zyx.micro.Ant 1.1 | 3 | 4% | 5 |
| baal.nano.N 1.42 | 1 | 1% | 6 |
| sanja.First 0.1 | 1 | 1% | 4 |

## Melee bench: F34

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.4 | 80 / 210 | 2.58 | 17.3% | 30358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.7 | 17.3% | 80 |
| stelo.Spread 0.9 | 1.8 | 17.2% | 74 |
| kid.Gladiator .7.2 | 2.5 | 15.9% | 41 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 13 |
| tcf.Reach 3 | 4.8 | 10.6% | 2 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 15 / 35 | 5034 |
| 2 | 2 | 67.4 | 81.6 | 14 / 35 | 5167 |
| 3 | 2 | 67.8 | 82.9 | 12 / 35 | 5205 |
| 4 | 1 | 69.0 | 85.7 | 15 / 35 | 5475 |
| 5 | 3 | 64.9 | 75.9 | 10 / 35 | 4533 |
| 6 | 1 | 68.0 | 84.8 | 14 / 35 | 4944 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 66 | 64% |
| kid.Gladiator .7.2 | 30 | 63% |
| jcs.Seth 1.8 | 12 | 67% |
| cli.Dancer 1.1 | 5 | 100% |
| tcf.Reach 3 | 3 | 100% |
| sample.VelociRobot 1.0 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 902. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 63 | 48% | 100 |
| kid.Gladiator .7.2 | 45 | 35% | 61 |
| jcs.Seth 1.8 | 12 | 9% | 22 |
| tcf.Reach 3 | 5 | 4% | 12 |
| cli.Dancer 1.1 | 3 | 2% | 7 |
| ratosh.Wesco 1.4 | 1 | 1% | 5 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F35

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.0 | 32 / 210 | 3.07 | 14.8% | 22797 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 147 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 14.8% | 32 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.9% | 23 |
| rz.HawkOnFire 0.1 | 4.0 | 11.9% | 5 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.0% | 3 |
| wit.Chuliath 1.0 | 6.3 | 7.2% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 7.0% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.5 | 5.7% | 1 |
| dans.Cinnamon 1.2 | 9.0 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 75.9 | 6 / 35 | 3591 |
| 2 | 2 | 66.3 | 84.8 | 9 / 35 | 4183 |
| 3 | 2 | 62.0 | 75.2 | 6 / 35 | 3567 |
| 4 | 2 | 62.3 | 74.0 | 4 / 35 | 3759 |
| 5 | 2 | 63.2 | 77.1 | 3 / 35 | 4067 |
| 6 | 2 | 61.8 | 75.2 | 4 / 35 | 3630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 73 | 18% |
| gh.mini.Gruwel 0.9 | 15 | 47% |
| rz.HawkOnFire 0.1 | 8 | 75% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 91 | 51% | 102 |
| gh.mini.Gruwel 0.9 | 29 | 16% | 39 |
| rz.HawkOnFire 0.1 | 25 | 14% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 9% | 24 |
| wit.Chuliath 1.0 | 5 | 3% | 5 |
| myl.nano.KomoriNinja 1.1 | 5 | 3% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.5 | 144 / 210 | 2.04 | 19.8% | 32782 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.8% | 144 |
| alpha.RainingFire 1.0 | 2.3 | 12.2% | 18 |
| bzdp.Pansy 2.1 | 3.2 | 12.0% | 15 |
| mz.Cork 0.1 | 4.7 | 10.4% | 11 |
| bvh.micro.Freya 0.3 | 5.2 | 10.0% | 5 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.8% | 9 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.3% | 1 |
| dl.BetterWalls 1.0 | 7.8 | 6.7% | 3 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.6% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 93.7 | 29 / 35 | 5525 |
| 2 | 1 | 67.8 | 84.4 | 20 / 35 | 5120 |
| 3 | 1 | 67.2 | 81.3 | 20 / 35 | 5139 |
| 4 | 1 | 70.0 | 89.5 | 24 / 35 | 5661 |
| 5 | 1 | 69.8 | 87.3 | 24 / 35 | 5717 |
| 6 | 1 | 71.5 | 94.6 | 27 / 35 | 5620 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 35 | 97% |
| alpha.RainingFire 1.0 | 28 | 68% |
| bvh.micro.Freya 0.3 | 27 | 93% |
| bvh.mini.Fenrir 0.39 | 24 | 100% |
| mz.Cork 0.1 | 20 | 100% |
| m3thos.Eva02 0.7.1 | 11 | 82% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 726. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 21 | 31% | 42 |
| bvh.mini.Fenrir 0.39 | 13 | 19% | 24 |
| bzdp.Pansy 2.1 | 9 | 13% | 48 |
| bvh.micro.Freya 0.3 | 8 | 12% | 25 |
| m3thos.Eva02 0.7.1 | 8 | 12% | 22 |
| mz.Cork 0.1 | 4 | 6% | 27 |
| dl.BetterWalls 1.0 | 2 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 1 | 1% | 8 |
| squidM.TentalceMeleeNano 1.1 | 1 | 1% | 4 |

## Melee bench: F37

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.6 | 170 / 210 | 1.75 | 20.1% | 34845 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 20.1% | 170 |
| germ.TheMind .2 | 2.5 | 10.7% | 13 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.1% | 3 |
| stelo.UntouchableNano 1.3 | 4.8 | 9.5% | 9 |
| EBBU.Sim2 1.02 | 5.0 | 9.5% | 2 |
| mb.Beast 0.1 | 6.8 | 8.3% | 2 |
| agrach.Dalek 1.0 | 6.8 | 8.5% | 5 |
| skm.Ryubot 1.0 | 7.8 | 7.7% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 7.8 | 7.8% | 0 |
| lmk.ACPFinal 0.1 | 8.8 | 7.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 94.0 | 29 / 35 | 6211 |
| 2 | 1 | 68.6 | 89.8 | 26 / 35 | 5593 |
| 3 | 1 | 68.4 | 86.7 | 25 / 35 | 5891 |
| 4 | 1 | 67.7 | 86.7 | 27 / 35 | 5336 |
| 5 | 1 | 70.8 | 97.8 | 32 / 35 | 5776 |
| 6 | 1 | 70.7 | 94.9 | 31 / 35 | 6038 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.UntouchableNano 1.3 | 33 | 94% |
| germ.TheMind .2 | 32 | 84% |
| agrach.Dalek 1.0 | 25 | 96% |
| EBBU.Sim2 1.02 | 25 | 100% |
| mb.Beast 0.1 | 20 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 100% |
| skm.Ryubot 1.0 | 14 | 93% |
| lmk.ACPFinal 0.1 | 9 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 10 | 24% | 43 |
| stelo.UntouchableNano 1.3 | 10 | 24% | 25 |
| lmk.ACPFinal 0.1 | 5 | 12% | 17 |
| mb.Beast 0.1 | 4 | 10% | 28 |
| EBBU.Sim2 1.02 | 3 | 7% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 7% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 5% | 30 |
| agrach.Dalek 1.0 | 2 | 5% | 28 |
| skm.Ryubot 1.0 | 2 | 5% | 3 |

## Melee bench: F38

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 75.0 | 62 / 210 | 3.25 | 15.3% | 25117 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.0% | 77 |
| hadur117.mini.DeiseD 0.3 | 1.8 | 15.3% | 62 |
| bvh.mini.Freya 0.55 | 3.3 | 12.7% | 16 |
| bts.mega.Gnarly 1.4 | 4.0 | 11.8% | 28 |
| cs.Wren 1.0 | 4.8 | 11.3% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 10.0% | 14 |
| kdf.KoulDestroyer 1.0 | 6.8 | 9.1% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 5.8% | 3 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.2% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 78.4 | 15 / 35 | 4152 |
| 2 | 2 | 60.9 | 69.8 | 8 / 35 | 3662 |
| 3 | 3 | 61.2 | 68.9 | 4 / 35 | 3994 |
| 4 | 2 | 64.7 | 80.0 | 9 / 35 | 4423 |
| 5 | 2 | 62.5 | 70.5 | 12 / 35 | 4123 |
| 6 | 1 | 66.5 | 82.2 | 14 / 35 | 4763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 39 | 49% |
| bts.mega.Gnarly 1.4 | 15 | 60% |
| cs.Wren 1.0 | 13 | 100% |
| bvh.mini.Freya 0.55 | 11 | 91% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 70% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 683. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 30% | 64 |
| bvh.mini.Freya 0.55 | 28 | 19% | 35 |
| bts.mega.Gnarly 1.4 | 25 | 17% | 36 |
| davidalves.net.DuelistNanoMelee 1.01 | 22 | 15% | 31 |
| cs.Wren 1.0 | 16 | 11% | 27 |
| kdf.KoulDestroyer 1.0 | 10 | 7% | 12 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 5 |

## Melee bench: F39

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 82.8 | 92 / 210 | 2.55 | 17.3% | 29267 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 17.3% | 92 |
| bvh.fry.Freya 0.82 | 2.0 | 14.8% | 24 |
| az.Ololobot 0.2.4 | 3.2 | 12.6% | 51 |
| catcat20.Lambda 0.024 | 3.8 | 11.8% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.5% | 15 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.0% | 1 |
| gimp.GimpBot 0.1 | 6.8 | 7.9% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 81.3 | 15 / 35 | 4463 |
| 2 | 1 | 68.9 | 89.5 | 21 / 35 | 5551 |
| 3 | 1 | 67.7 | 86.7 | 18 / 35 | 5150 |
| 4 | 1 | 65.9 | 81.9 | 15 / 35 | 4742 |
| 5 | 1 | 65.4 | 80.6 | 13 / 35 | 4782 |
| 6 | 1 | 63.6 | 76.8 | 10 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 44 | 57% |
| bvh.fry.Freya 0.82 | 30 | 83% |
| catcat20.Lambda 0.024 | 27 | 81% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 77% |
| gimp.GimpBot 0.1 | 4 | 75% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 45 | 38% | 70 |
| az.Ololobot 0.2.4 | 29 | 25% | 56 |
| catcat20.Lambda 0.024 | 15 | 13% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 12% | 18 |
| gimp.GimpBot 0.1 | 5 | 4% | 12 |
| whitesquare.robots.SkynetAdvanced 1.1 | 3 | 3% | 5 |
| apollokidd.ApolloKidd 0.9 | 3 | 3% | 5 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 9 |
| dcs.Eater_of_Worlds 1.1.3-A | 2 | 2% | 4 |

## Melee bench: F40

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.3 | 108 / 210 | 2.68 | 17.9% | 30425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.2 | 17.9% | 108 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 14.6% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 12.2% | 17 |
| Polkwane.SmashMelee 1.0 | 4.2 | 11.0% | 17 |
| mz.AntiGrav 1.0 | 4.2 | 10.9% | 8 |
| alpha.BlackIce 1.0 | 6.5 | 8.9% | 6 |
| stelo.Randomness 1.0 | 6.5 | 9.1% | 12 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.1% | 0 |
| sample.Corners 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.4 | 19 / 35 | 5575 |
| 2 | 1 | 67.8 | 83.2 | 19 / 35 | 4962 |
| 3 | 1 | 70.6 | 90.5 | 25 / 35 | 5762 |
| 4 | 1 | 67.2 | 83.2 | 18 / 35 | 4934 |
| 5 | 1 | 65.0 | 74.6 | 15 / 35 | 4677 |
| 6 | 2 | 63.1 | 71.1 | 12 / 35 | 4515 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 45 | 80% |
| kano.gamma.KanoGamma 1.8 | 29 | 76% |
| mz.AntiGrav 1.0 | 19 | 95% |
| Polkwane.SmashMelee 1.0 | 15 | 100% |
| alpha.BlackIce 1.0 | 7 | 86% |
| stelo.Randomness 1.0 | 7 | 71% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 35% | 58 |
| kano.gamma.KanoGamma 1.8 | 22 | 21% | 51 |
| Polkwane.SmashMelee 1.0 | 16 | 15% | 30 |
| mz.AntiGrav 1.0 | 11 | 10% | 32 |
| stelo.Randomness 1.0 | 6 | 6% | 14 |
| alpha.BlackIce 1.0 | 6 | 6% | 11 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 8 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 4 |
| sample.Corners 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.6 | 89 / 210 | 2.57 | 17.2% | 27291 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.3 | 17.2% | 89 |
| eem.EvBotNG v12.8 | 1.8 | 15.6% | 65 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 23 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.5% | 20 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.7% | 10 |
| shrub.Silver v048 | 6.2 | 8.3% | 1 |
| zyx.nano.Ant 1.1 | 6.8 | 7.4% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.7% | 0 |
| jsal.Jsalbot 1.0 | 8.5 | 5.9% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.3 | 18 / 35 | 4721 |
| 2 | 1 | 65.9 | 78.7 | 15 / 35 | 4646 |
| 3 | 2 | 65.9 | 80.6 | 10 / 35 | 4607 |
| 4 | 2 | 64.7 | 78.7 | 12 / 35 | 4045 |
| 5 | 1 | 66.9 | 84.4 | 14 / 35 | 4524 |
| 6 | 1 | 68.3 | 86.7 | 20 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 63 | 43% |
| ary.Swarm 1.1 | 27 | 74% |
| simonton.nano.MeleeSeed 1.8 | 20 | 95% |
| lessonz.robocode.Oz 0.5.0 | 20 | 85% |
| zyx.nano.Ant 1.1 | 3 | 100% |
| jsal.Jsalbot 1.0 | 3 | 67% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 50 | 41% | 79 |
| ary.Swarm 1.1 | 24 | 20% | 47 |
| lessonz.robocode.Oz 0.5.0 | 19 | 16% | 29 |
| simonton.nano.MeleeSeed 1.8 | 14 | 12% | 35 |
| shrub.Silver v048 | 7 | 6% | 7 |
| zyx.nano.Ant 1.1 | 3 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| stelo.Mirror 1.1 | 2 | 2% | 3 |

## Melee bench: F42

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 84.1 | 95 / 210 | 2.43 | 18.1% | 33075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.1% | 95 |
| wompi.Wallaby 5.1 | 2.2 | 15.8% | 58 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.4% | 22 |
| ara.Shera 0.88 | 3.5 | 13.4% | 32 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 2 |
| maribo.IotaCT 1.1 | 6.5 | 7.2% | 0 |
| dsw.StaticD 1.0 | 7.3 | 6.6% | 1 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.6% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 85.7 | 17 / 35 | 5779 |
| 2 | 1 | 67.7 | 85.4 | 15 / 35 | 5395 |
| 3 | 1 | 67.2 | 84.8 | 13 / 35 | 5045 |
| 4 | 1 | 67.2 | 82.2 | 16 / 35 | 5348 |
| 5 | 1 | 67.4 | 81.0 | 16 / 35 | 5562 |
| 6 | 1 | 68.7 | 85.4 | 18 / 35 | 5946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 54 | 81% |
| maribo.mini.MiniQuester 0.1 | 30 | 70% |
| ara.Shera 0.88 | 29 | 72% |
| dsw.StaticD 1.0 | 4 | 100% |
| amz.NanoClone 1.41 | 3 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 32% | 81 |
| maribo.mini.MiniQuester 0.1 | 36 | 31% | 58 |
| ara.Shera 0.88 | 31 | 27% | 50 |
| mme.NikeEnhanced 2.0 | 4 | 3% | 4 |
| amz.NanoClone 1.41 | 3 | 3% | 7 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| maribo.IotaCT 1.1 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 2 |

## Melee bench: F43

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 71.4 | 22 / 210 | 3.58 | 14.0% | 23044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.7% | 161 |
| hadur117.mini.DeiseD 0.3 | 2.0 | 14.0% | 22 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.0% | 14 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.6% | 6 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.0% | 5 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 8.9% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 69.2 | 2 / 35 | 3792 |
| 2 | 2 | 63.5 | 72.4 | 6 / 35 | 3778 |
| 3 | 2 | 63.1 | 72.4 | 2 / 35 | 4057 |
| 4 | 2 | 63.2 | 70.8 | 5 / 35 | 3869 |
| 5 | 2 | 63.2 | 72.4 | 4 / 35 | 3752 |
| 6 | 2 | 62.7 | 71.1 | 3 / 35 | 3796 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 17% |
| brainfade.melee.Dusk 0.44 | 7 | 71% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| dummy.micro.Sparrow 2.5 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 188 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 102 | 54% | 112 |
| brainfade.melee.Dusk 0.44 | 30 | 16% | 33 |
| wcsv.melee.EngineerMelee 0.1 | 21 | 11% | 24 |
| dummy.micro.Sparrow 2.5 | 14 | 7% | 19 |
| Krabb.akim2.Akim2 1.1b | 8 | 4% | 8 |
| mz.NanoGod 2.02 | 7 | 4% | 8 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 86.0 | 100 / 210 | 2.26 | 18.7% | 32910 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 18.7% | 100 |
| stelo.Liblix 0.3.1 | 2.0 | 16.3% | 65 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.8% | 35 |
| wompi.Quokka 1.6 | 4.3 | 9.9% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.5% | 1 |
| jwirde.Gort 2.0 | 5.8 | 8.9% | 5 |
| disan.Chair 2.2.0 | 6.7 | 7.8% | 1 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.3% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.6 | 18 / 35 | 5616 |
| 2 | 1 | 67.2 | 82.2 | 15 / 35 | 5314 |
| 3 | 1 | 67.7 | 83.2 | 15 / 35 | 5378 |
| 4 | 1 | 68.9 | 87.6 | 17 / 35 | 5507 |
| 5 | 1 | 70.0 | 89.5 | 19 / 35 | 5578 |
| 6 | 1 | 68.8 | 86.0 | 16 / 35 | 5517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 66% |
| tzu.TheArtOfWar 1.2 | 45 | 53% |
| wompi.Quokka 1.6 | 9 | 100% |
| jwirde.Gort 2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 45 | 41% | 102 |
| tzu.TheArtOfWar 1.2 | 34 | 31% | 55 |
| wompi.Quokka 1.6 | 12 | 11% | 19 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 7% | 11 |
| stf.PanzerGeneral 0.1 | 5 | 5% | 7 |
| jwirde.Gort 2.0 | 3 | 3% | 7 |
| disan.Chair 2.2.0 | 3 | 3% | 6 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 86.5 | 79 / 210 | 2.21 | 19.5% | 37031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.3 | 1.0 | 19.5% | 79 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.3% | 111 |
| jje.BagPuss 1.2 | 3.2 | 11.9% | 4 |
| sul.Lunar 1.1 | 4.5 | 10.4% | 6 |
| myl.nano.Graviton 1.10 | 5.7 | 9.3% | 2 |
| pez.mini.ChironexFleckeri 0.5 | 6.0 | 8.5% | 4 |
| fm.claire 1.7 | 6.7 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.5% | 1 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 91.7 | 16 / 35 | 6489 |
| 2 | 1 | 68.9 | 85.1 | 15 / 35 | 6169 |
| 3 | 1 | 68.5 | 84.8 | 12 / 35 | 6044 |
| 4 | 1 | 68.9 | 85.7 | 10 / 35 | 6247 |
| 5 | 1 | 68.2 | 83.8 | 11 / 35 | 6071 |
| 6 | 1 | 69.5 | 87.9 | 15 / 35 | 6011 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 105 | 23% |
| jje.BagPuss 1.2 | 16 | 88% |
| sul.Lunar 1.1 | 16 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| myl.nano.Graviton 1.10 | 9 | 78% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 2 | 50% |

Hadur died in 131 of 210 rounds, at a mean tick of 2171. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 64% | 0 |
| jje.BagPuss 1.2 | 12 | 9% | 55 |
| myl.nano.Graviton 1.10 | 9 | 7% | 32 |
| sul.Lunar 1.1 | 8 | 6% | 60 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 27 |
| fm.claire 1.7 | 6 | 5% | 10 |
| hvilela.HVilela 0.9 | 4 | 3% | 8 |
| wit.Deep7 2.0 | 0 | 0% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |

## Melee bench: F46

hadur117.mini.DeiseD 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.7 | 59 / 210 | 2.73 | 16.2% | 26547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.2% | 82 |
| kc.mini.Mirage 0.2 | 2.2 | 16.7% | 59 |
| hadur117.mini.DeiseD 0.3 | 2.3 | 16.2% | 59 |
| mz.MicroSheep 1.0 | 4.3 | 10.6% | 2 |
| cx.Princess 1.0 | 4.7 | 10.2% | 7 |
| sadoner.killer 0.2 | 6.0 | 8.6% | 0 |
| arthord.NanoSatanMelee Beta | 7.3 | 6.6% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.8 | 79.4 | 9 / 35 | 4903 |
| 2 | 2 | 65.1 | 80.3 | 12 / 35 | 4200 |
| 3 | 2 | 66.6 | 83.2 | 12 / 35 | 4393 |
| 4 | 2 | 66.7 | 84.8 | 10 / 35 | 4586 |
| 5 | 3 | 64.9 | 80.0 | 8 / 35 | 4217 |
| 6 | 3 | 63.8 | 76.8 | 8 / 35 | 4248 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 46 | 59% |
| rsalesc.melee.Medina 0.4.5 | 45 | 42% |
| cx.Princess 1.0 | 10 | 80% |
| mz.MicroSheep 1.0 | 6 | 83% |

Hadur died in 151 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 44% | 102 |
| rsalesc.melee.Medina 0.4.5 | 56 | 37% | 75 |
| mz.MicroSheep 1.0 | 12 | 8% | 12 |
| cx.Princess 1.0 | 6 | 4% | 10 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 5 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 3 |
| sadoner.killer 0.2 | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

