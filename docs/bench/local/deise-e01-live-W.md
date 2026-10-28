# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 84.1 | 53 / 210 | 2.43 | 16.7% | 28670 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 138 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 16.7% | 53 |
| sgp.JollyNinja 3.53 | 3.7 | 11.1% | 12 |
| mz.MicroGodMelee 1 | 4.2 | 10.8% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.3 | 10.6% | 2 |
| lorneswork.Predator 1.0 | 5.8 | 9.8% | 2 |
| adt.Ar2 1.0 | 7.2 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 83.8 | 11 / 35 | 4343 |
| 2 | 2 | 66.0 | 82.5 | 8 / 35 | 4949 |
| 3 | 2 | 67.2 | 84.1 | 8 / 35 | 5384 |
| 4 | 2 | 66.1 | 83.8 | 9 / 35 | 4634 |
| 5 | 2 | 67.2 | 89.5 | 9 / 35 | 4706 |
| 6 | 2 | 65.4 | 81.0 | 8 / 35 | 4654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 113 | 15% |
| sgp.JollyNinja 3.53 | 18 | 89% |
| mz.MicroGodMelee 1 | 8 | 88% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 100% |
| adt.Ar2 1.0 | 2 | 100% |
| skm.butterfly 1.0 | 2 | 100% |

Hadur died in 157 of 210 rounds, at a mean tick of 1043. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 116 | 74% | 136 |
| simonton.nano.WeekendObsession_Melee 1.0 | 13 | 8% | 18 |
| sgp.JollyNinja 3.53 | 11 | 7% | 21 |
| mz.MicroGodMelee 1 | 8 | 5% | 16 |
| lorneswork.Predator 1.0 | 5 | 3% | 11 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 3 |

## Melee bench: F02

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 79.8 | 83 / 210 | 2.81 | 17.5% | 31183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.5% | 83 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.7% | 38 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.3% | 38 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.8% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.5% | 17 |
| Noran.BitchingElk 0.054 | 6.7 | 8.1% | 12 |
| sch.Simone 0.3d | 7.2 | 8.1% | 17 |
| fnc.bandit.Bandit 5.2.0 | 7.7 | 7.4% | 4 |
| stelo.PatternRobot 1.0 | 8.5 | 6.6% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.6 | 10 / 35 | 4881 |
| 2 | 1 | 65.1 | 74.6 | 12 / 35 | 5236 |
| 3 | 1 | 65.9 | 78.1 | 15 / 35 | 4834 |
| 4 | 1 | 67.8 | 84.8 | 15 / 35 | 5493 |
| 5 | 1 | 67.0 | 82.9 | 13 / 35 | 5082 |
| 6 | 1 | 68.5 | 84.1 | 18 / 35 | 5657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 43 | 65% |
| pulsar.PulsarMax 0.8.9 | 24 | 54% |
| Noran.BitchingElk 0.054 | 15 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 13 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 73% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| sch.Simone 0.3d | 7 | 43% |
| fnc.bandit.Bandit 5.2.0 | 2 | 50% |

Hadur died in 127 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 28% | 65 |
| pulsar.PulsarMax 0.8.9 | 32 | 25% | 50 |
| com.cohesiva.robocode.ManOwaR 1.0 | 16 | 13% | 27 |
| Noran.BitchingElk 0.054 | 10 | 8% | 22 |
| sch.Simone 0.3d | 9 | 7% | 10 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 6% | 13 |
| stelo.PatternRobot 1.0 | 7 | 6% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 7 |
| fullsail.SweetTea 1.1 | 3 | 2% | 3 |

## Melee bench: F03

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 91.3 | 141 / 210 | 1.78 | 20.0% | 36915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.0% | 141 |
| radnor.DoctorBob 1.42 | 2.3 | 14.0% | 21 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.9% | 19 |
| vuen.Cake 2.51 | 4.0 | 11.6% | 25 |
| urdos.URDOS 1.3 | 5.3 | 8.9% | 1 |
| adt.Ar1 2.1 | 6.0 | 7.6% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.0% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.3 | 17 / 35 | 5609 |
| 2 | 1 | 70.5 | 93.0 | 25 / 35 | 6302 |
| 3 | 1 | 71.4 | 94.3 | 25 / 35 | 6397 |
| 4 | 1 | 70.6 | 91.4 | 27 / 35 | 6164 |
| 5 | 1 | 70.3 | 93.3 | 23 / 35 | 6209 |
| 6 | 1 | 70.8 | 94.6 | 24 / 35 | 6234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 66 | 86% |
| radnor.DoctorBob 1.42 | 49 | 90% |
| vuen.Cake 2.51 | 44 | 66% |
| adt.Ar1 2.1 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 26 | 38% | 53 |
| radnor.DoctorBob 1.42 | 19 | 28% | 58 |
| kawigi.nano.Lib 1.0 | 15 | 22% | 71 |
| urdos.URDOS 1.3 | 5 | 7% | 10 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 5 |
| adt.Ar1 2.1 | 1 | 1% | 3 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.6 | 22 / 210 | 2.56 | 16.9% | 33618 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 183 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 16.9% | 22 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.0% | 3 |
| TNT.TNT 0.99.1 | 4.2 | 10.1% | 1 |
| josago.Jorgito 0.16 | 4.8 | 9.2% | 1 |
| css.Delitioner 0.11 | 6.2 | 7.3% | 0 |
| tj.zombie1n 1.0.1 | 7.0 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 78.7 | 4 / 35 | 5519 |
| 2 | 2 | 69.2 | 89.2 | 4 / 35 | 6135 |
| 3 | 2 | 67.1 | 81.9 | 5 / 35 | 5560 |
| 4 | 2 | 65.9 | 78.7 | 0 / 35 | 5349 |
| 5 | 2 | 66.8 | 82.2 | 5 / 35 | 5328 |
| 6 | 2 | 68.2 | 85.1 | 4 / 35 | 5727 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 145 | 12% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| spin.Bugstard 0.012b | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 1175. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 155 | 82% | 174 |
| apc.LeeroyJenkins2 1.0 | 12 | 6% | 14 |
| josago.Jorgito 0.16 | 12 | 6% | 13 |
| TNT.TNT 0.99.1 | 6 | 3% | 6 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| css.Delitioner 0.11 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.8 | 66.7 | 18 / 210 | 4.00 | 12.8% | 21292 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.1% | 117 |
| justin.DemonicRage 3.4 | 1.8 | 17.0% | 54 |
| wompi.Numbat 2.1 | 3.3 | 12.8% | 14 |
| hadur117.mini.DeiseW 0.2 | 3.7 | 12.8% | 18 |
| ms.Ares 0.19 | 5.2 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.7% | 5 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.7% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.7 | 67.9 | 6 / 35 | 3536 |
| 2 | 4 | 60.5 | 67.6 | 4 / 35 | 3640 |
| 3 | 4 | 59.3 | 64.4 | 3 / 35 | 3511 |
| 4 | 4 | 58.7 | 64.4 | 1 / 35 | 3604 |
| 5 | 3 | 60.4 | 69.5 | 3 / 35 | 3428 |
| 6 | 4 | 59.2 | 66.3 | 1 / 35 | 3573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 30 | 13% |
| justin.DemonicRage 3.4 | 15 | 40% |
| wompi.Numbat 2.1 | 10 | 80% |
| axeBots.HataMoto 3.09 | 1 | 0% |

Hadur died in 192 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 37% | 75 |
| justin.DemonicRage 3.4 | 55 | 29% | 60 |
| wompi.Numbat 2.1 | 30 | 16% | 37 |
| ms.Ares 0.19 | 17 | 9% | 17 |
| axeBots.HataMoto 3.09 | 11 | 6% | 11 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 0 | 0% | 1 |

## Melee bench: F06

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 78.4 | 79 / 210 | 2.94 | 16.6% | 28434 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 16.6% | 79 |
| jekl.StoneGhost 0.7 | 2.0 | 15.3% | 46 |
| origin.SleepSiphon 1.7b | 2.8 | 13.9% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.2 | 12.2% | 23 |
| mld.Wisdom 1.0 | 4.8 | 10.5% | 4 |
| gg.Wolverine 2.0 | 6.5 | 8.4% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.3 | 6.7% | 5 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 75.2 | 11 / 35 | 4613 |
| 2 | 1 | 67.3 | 83.8 | 17 / 35 | 5012 |
| 3 | 2 | 62.6 | 71.1 | 8 / 35 | 4301 |
| 4 | 1 | 65.6 | 79.7 | 13 / 35 | 4845 |
| 5 | 1 | 66.4 | 78.4 | 16 / 35 | 4837 |
| 6 | 1 | 66.6 | 82.2 | 14 / 35 | 4826 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 38 | 84% |
| origin.SleepSiphon 1.7b | 26 | 73% |
| pe.minimelee.SandboxMiniMelee 1.1 | 19 | 63% |
| gg.Wolverine 2.0 | 8 | 88% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 41 | 31% | 63 |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 23% | 42 |
| origin.SleepSiphon 1.7b | 29 | 22% | 56 |
| mld.Wisdom 1.0 | 17 | 13% | 19 |
| gg.Wolverine 2.0 | 5 | 4% | 10 |
| spinnercat.Omen 1.0 | 4 | 3% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 3 | 2% | 9 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 91.2 | 111 / 210 | 1.79 | 20.0% | 37532 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.0% | 111 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.4% | 53 |
| rtk.Tachikoma 1.0 | 2.7 | 16.4% | 34 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.1% | 6 |
| franzor.Lizt 1.3.1 | 5.0 | 10.3% | 6 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.0 | 2.7% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 89.8 | 17 / 35 | 6054 |
| 2 | 1 | 72.7 | 94.3 | 22 / 35 | 6682 |
| 3 | 1 | 71.3 | 90.5 | 19 / 35 | 6055 |
| 4 | 1 | 72.0 | 91.7 | 19 / 35 | 6488 |
| 5 | 1 | 71.9 | 93.0 | 18 / 35 | 6418 |
| 6 | 1 | 70.1 | 87.9 | 16 / 35 | 5835 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 87 | 75% |
| rsalesc.melee.Monk 0.3.6c | 42 | 21% |
| oog.melee.CapuletDroid 1.1 | 22 | 91% |
| franzor.Lizt 1.3.1 | 19 | 84% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1182. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 53 | 54% | 73 |
| rtk.Tachikoma 1.0 | 36 | 36% | 101 |
| oog.melee.CapuletDroid 1.1 | 6 | 6% | 29 |
| franzor.Lizt 1.3.1 | 3 | 3% | 0 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 2 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |

## Melee bench: F08

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.8 | 115 / 210 | 2.10 | 18.9% | 30807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.9% | 115 |
| tm.Yuugao 1.0 | 2.2 | 13.2% | 47 |
| shrub.Vapour v159 | 2.8 | 11.9% | 18 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.3% | 15 |
| com.spp.robocode.MostlyHarmless 010 | 4.5 | 9.9% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.4% | 4 |
| m3thos.Eva00 1.1 | 6.8 | 7.6% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 7.0% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.5% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.5 | 21 / 35 | 5045 |
| 2 | 1 | 67.5 | 86.7 | 16 / 35 | 5179 |
| 3 | 1 | 66.6 | 82.9 | 17 / 35 | 4814 |
| 4 | 1 | 69.5 | 90.2 | 23 / 35 | 5379 |
| 5 | 1 | 68.1 | 86.7 | 17 / 35 | 5180 |
| 6 | 1 | 68.7 | 89.8 | 21 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 56% |
| shrub.Vapour v159 | 34 | 74% |
| Krabb.sliNk.Garm 0.9u | 27 | 67% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 100% |
| SHAM.WOW 1.4 | 7 | 86% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| m3thos.Eva00 1.1 | 3 | 67% |

Hadur died in 95 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 39 | 41% | 67 |
| shrub.Vapour v159 | 15 | 16% | 41 |
| Krabb.sliNk.Garm 0.9u | 14 | 15% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 11 | 12% | 30 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 17 |
| SHAM.WOW 1.4 | 3 | 3% | 8 |
| m3thos.Eva00 1.1 | 3 | 3% | 4 |
| qualidafial.MajorDick 1.0.1 | 3 | 3% | 3 |

## Melee bench: F09

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 73.3 | 56 / 210 | 3.40 | 15.4% | 25826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.1% | 93 |
| hadur117.mini.DeiseW 0.2 | 2.2 | 15.4% | 56 |
| kc.micro.Figment 1.0 | 2.7 | 13.8% | 23 |
| yagami.Tidus 0.11 | 4.3 | 10.9% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.5% | 12 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 23 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.7% | 0 |
| rdm.Dueler 0.4x | 8.8 | 5.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 72.4 | 10 / 35 | 4309 |
| 2 | 2 | 66.0 | 78.7 | 10 / 35 | 4894 |
| 3 | 3 | 60.6 | 65.7 | 5 / 35 | 4001 |
| 4 | 3 | 60.5 | 65.4 | 7 / 35 | 3907 |
| 5 | 1 | 67.1 | 82.9 | 16 / 35 | 4536 |
| 6 | 2 | 63.6 | 74.6 | 8 / 35 | 4179 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 41 | 44% |
| kc.micro.Figment 1.0 | 29 | 76% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| pedersen.Grishnakh 1.0 | 7 | 57% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 2 | 50% |

Hadur died in 154 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 40% | 82 |
| kc.micro.Figment 1.0 | 34 | 22% | 55 |
| yagami.Tidus 0.11 | 19 | 12% | 23 |
| mc2.enemy.Original 0.9 | 13 | 8% | 16 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 15 |
| dft.Calliope 5.6 | 5 | 3% | 9 |
| step.nanoPri 1.0 | 5 | 3% | 5 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.4 | 161 / 210 | 1.50 | 20.5% | 34280 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.5% | 161 |
| DTF.Kludgy 1.2b | 2.0 | 14.3% | 26 |
| ne.Chimera 1.2 | 3.3 | 12.5% | 7 |
| ejb.Polaris 1.0.1 | 3.7 | 11.9% | 9 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.1% | 4 |
| vStar.RAFzilla 2.15 | 5.7 | 9.6% | 1 |
| kurios.DOSexe .9b | 7.3 | 5.7% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.8 | 5.8% | 0 |
| sam.Samspin 1.0 | 9.0 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 91.1 | 25 / 35 | 5468 |
| 2 | 1 | 70.2 | 93.7 | 24 / 35 | 5665 |
| 3 | 1 | 72.2 | 97.5 | 30 / 35 | 6237 |
| 4 | 1 | 71.7 | 96.8 | 29 / 35 | 5849 |
| 5 | 1 | 70.8 | 94.6 | 28 / 35 | 5625 |
| 6 | 1 | 70.1 | 93.0 | 25 / 35 | 5436 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 62 | 74% |
| ejb.Polaris 1.0.1 | 42 | 90% |
| ne.Chimera 1.2 | 35 | 91% |
| vStar.RAFzilla 2.15 | 19 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 100% |
| kurios.DOSexe .9b | 7 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 28 | 57% | 73 |
| ejb.Polaris 1.0.1 | 8 | 16% | 51 |
| ne.Chimera 1.2 | 8 | 16% | 37 |
| vStar.RAFzilla 2.15 | 3 | 6% | 14 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 16 |
| donjezza.Muncho 1.0 | 1 | 2% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 12 |
| sam.Samspin 1.0 | 0 | 0% | 3 |

## Melee bench: F11

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 79.2 | 73 / 210 | 2.88 | 16.8% | 28063 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 16.8% | 73 |
| rz.Aleph 0.34 | 1.7 | 16.1% | 68 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.5% | 19 |
| djc.DynaBot 0.1.1 | 4.0 | 11.1% | 12 |
| rdt199.Warlord 0.73 | 5.7 | 8.6% | 14 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 11 |
| uji.YellohFellah 1.0 | 6.7 | 8.1% | 12 |
| KiraNL.Chupacabra 0.4 | 7.8 | 7.1% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.9% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 15 / 35 | 4632 |
| 2 | 2 | 64.7 | 78.1 | 7 / 35 | 4624 |
| 3 | 2 | 63.6 | 73.0 | 10 / 35 | 4563 |
| 4 | 1 | 66.1 | 81.3 | 14 / 35 | 4601 |
| 5 | 1 | 65.6 | 80.6 | 13 / 35 | 4677 |
| 6 | 1 | 66.4 | 80.3 | 14 / 35 | 4966 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 52 | 62% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| cx.mini.Nimrod 0.55 | 16 | 75% |
| rdt199.Warlord 0.73 | 13 | 62% |
| uji.YellohFellah 1.0 | 10 | 70% |
| br2.MobyDickBot 1.6 | 4 | 50% |
| KiraNL.Chupacabra 0.4 | 2 | 0% |

Hadur died in 137 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 53 | 39% | 82 |
| cx.mini.Nimrod 0.55 | 25 | 18% | 31 |
| rdt199.Warlord 0.73 | 18 | 13% | 27 |
| djc.DynaBot 0.1.1 | 15 | 11% | 32 |
| br2.MobyDickBot 1.6 | 8 | 6% | 12 |
| uji.YellohFellah 1.0 | 7 | 5% | 12 |
| KiraNL.Chupacabra 0.4 | 6 | 4% | 9 |
| jeremyreeder.Vincent 2011.12.09 | 5 | 4% | 5 |

## Melee bench: F12

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.7 | 104 / 210 | 2.65 | 17.2% | 24837 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.2% | 104 |
| nat.PallasHawk 1.0 | 2.8 | 13.6% | 36 |
| darkcanuck.Leon 1.01 | 3.0 | 13.0% | 25 |
| bts.wiki.RipCurl 0.9b | 3.3 | 13.2% | 31 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.2% | 10 |
| jrm.Test0 1.0 | 6.0 | 8.0% | 0 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.8% | 0 |
| jp.Perpy 16.0 | 7.7 | 6.8% | 2 |
| stuff.Vlad 0.1 | 9.0 | 5.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.7 | 5.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.2 | 18 / 35 | 4263 |
| 2 | 1 | 67.6 | 86.3 | 21 / 35 | 4295 |
| 3 | 1 | 64.1 | 76.8 | 13 / 35 | 3949 |
| 4 | 1 | 67.3 | 83.5 | 21 / 35 | 4188 |
| 5 | 1 | 66.9 | 84.8 | 16 / 35 | 4394 |
| 6 | 1 | 63.5 | 75.6 | 15 / 35 | 3748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 44 | 66% |
| darkcanuck.Leon 1.01 | 40 | 80% |
| bts.wiki.RipCurl 0.9b | 36 | 75% |
| brainfade.melee.Genghis 0.36 | 8 | 88% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 2 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 34 | 32% | 54 |
| darkcanuck.Leon 1.01 | 23 | 21% | 61 |
| bts.wiki.RipCurl 0.9b | 22 | 21% | 47 |
| brainfade.melee.Genghis 0.36 | 9 | 8% | 16 |
| jrm.Test0 1.0 | 7 | 7% | 11 |
| cs.sheldor.Talon 1.1 | 5 | 5% | 8 |
| stuff.Vlad 0.1 | 4 | 4% | 7 |
| jp.Perpy 16.0 | 2 | 2% | 3 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.9 | 58 / 210 | 2.81 | 15.7% | 25663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.4% | 87 |
| ags.Glacier 0.2.11 | 1.7 | 16.5% | 43 |
| hadur117.mini.DeiseW 0.2 | 2.7 | 15.7% | 58 |
| shinh.Entangled 0.3 | 4.0 | 12.1% | 14 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.1% | 6 |
| apc.Colossus2 0.17 | 6.2 | 8.0% | 1 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.7% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 83.8 | 13 / 35 | 4205 |
| 2 | 2 | 66.7 | 83.8 | 13 / 35 | 4634 |
| 3 | 3 | 64.9 | 80.3 | 7 / 35 | 4363 |
| 4 | 3 | 62.8 | 75.9 | 6 / 35 | 4050 |
| 5 | 3 | 64.8 | 80.3 | 12 / 35 | 4121 |
| 6 | 3 | 63.4 | 75.2 | 7 / 35 | 4290 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 52 | 37% |
| ags.Glacier 0.2.11 | 42 | 67% |
| shinh.Entangled 0.3 | 7 | 57% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| stelo.Wang 1.0 | 2 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 56 | 37% | 84 |
| mn.Combat 3.25.0 | 45 | 30% | 63 |
| shinh.Entangled 0.3 | 25 | 16% | 30 |
| gh.micro.Gruweltje 0.7 | 16 | 11% | 20 |
| stelo.Wang 1.0 | 5 | 3% | 6 |
| apc.Colossus2 0.17 | 4 | 3% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.5 | 146 / 210 | 1.85 | 20.0% | 34484 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.0% | 146 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.6% | 31 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.5% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.4% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.8% | 4 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.7 | 30 / 35 | 5855 |
| 2 | 1 | 70.2 | 90.2 | 25 / 35 | 5784 |
| 3 | 1 | 70.0 | 88.9 | 25 / 35 | 5636 |
| 4 | 1 | 69.4 | 88.9 | 23 / 35 | 5473 |
| 5 | 1 | 68.6 | 87.0 | 18 / 35 | 5422 |
| 6 | 1 | 71.9 | 95.6 | 25 / 35 | 6314 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 70 | 89% |
| catcat20.shape.Theta 0.018 | 49 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 83% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 93% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 24 | 38% | 87 |
| catcat20.shape.Theta 0.018 | 20 | 31% | 51 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 9% | 26 |
| sanyi.mikrobi.Roberto 1.0 | 5 | 8% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 6% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 9 |
| pa.Improved 1.0 | 2 | 3% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 7 |

## Melee bench: F15

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.6 | 105 / 210 | 2.65 | 18.4% | 33813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.4% | 105 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.4% | 20 |
| emp.Yngwie 1.11 | 2.8 | 13.0% | 50 |
| mld.DustBunny 3.8 | 4.0 | 12.0% | 12 |
| cb.nano.Insomnia 1.0 | 5.0 | 11.0% | 5 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.0% | 18 |
| lambdaxy.TBot 0.1 | 7.3 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.7% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 4.7% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 84.1 | 21 / 35 | 5834 |
| 2 | 1 | 68.2 | 81.0 | 17 / 35 | 5803 |
| 3 | 1 | 66.4 | 77.8 | 14 / 35 | 5303 |
| 4 | 1 | 69.5 | 88.9 | 19 / 35 | 5790 |
| 5 | 1 | 66.2 | 73.3 | 15 / 35 | 5685 |
| 6 | 1 | 68.4 | 84.8 | 19 / 35 | 5398 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 34 | 50% |
| kawigi.micro.Shiz 1.1 | 34 | 91% |
| mld.DustBunny 3.8 | 24 | 88% |
| cb.nano.Insomnia 1.0 | 24 | 96% |
| kawigi.robot.Girl 1.2 | 10 | 90% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 39% | 75 |
| cb.nano.Insomnia 1.0 | 20 | 19% | 25 |
| mld.DustBunny 3.8 | 14 | 13% | 31 |
| kawigi.micro.Shiz 1.1 | 12 | 11% | 42 |
| kawigi.robot.Girl 1.2 | 8 | 8% | 20 |
| Grystrion.TrackerWO 1.0 | 5 | 5% | 5 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 1 | 1% | 6 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 82.8 | 94 / 210 | 2.55 | 18.2% | 33343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 18.2% | 94 |
| gh.Griezel 0.5.2 | 1.8 | 16.6% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.5% | 11 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.7% | 28 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.9% | 4 |
| bvh.fnr.Fenrir 0.36l | 5.8 | 8.6% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.5% | 3 |
| asd.Cthulhu 1.3 | 8.5 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.0 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 17 / 35 | 5963 |
| 2 | 1 | 68.6 | 84.4 | 17 / 35 | 5573 |
| 3 | 1 | 68.8 | 85.1 | 16 / 35 | 5640 |
| 4 | 3 | 63.9 | 69.5 | 11 / 35 | 4828 |
| 5 | 1 | 70.3 | 88.3 | 20 / 35 | 5996 |
| 6 | 1 | 67.0 | 81.0 | 13 / 35 | 5343 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 55% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 95% |
| techdude.forest.FlamingForest 1.1 | 15 | 67% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| bvh.fnr.Fenrir 0.36l | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1028. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 65 | 55% | 109 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 14% | 35 |
| bvh.fnr.Fenrir 0.36l | 11 | 9% | 13 |
| techdude.forest.FlamingForest 1.1 | 10 | 8% | 21 |
| tvv.nano.Polaris 1.2 | 7 | 6% | 14 |
| stelo.IntrinsicVolatility 1.4 | 4 | 3% | 8 |
| asd.Cthulhu 1.3 | 3 | 3% | 3 |
| divineomega.DivineBot 1.9.4.5 | 0 | 0% | 7 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 77.8 | 84 / 210 | 3.00 | 17.0% | 30843 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.0% | 84 |
| et.Predator 1.8 | 3.0 | 13.2% | 24 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.8% | 37 |
| cx.BlestPain 1.41 | 3.8 | 12.3% | 35 |
| nic.Nicator 2.4 | 4.3 | 11.6% | 18 |
| ahf.NanoAndrew .4 | 5.8 | 10.6% | 12 |
| maribo.melee.BMV 0.1 | 6.8 | 8.7% | 0 |
| tex.Longbot 0.4 | 8.2 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 14 / 35 | 5180 |
| 2 | 1 | 66.7 | 79.7 | 13 / 35 | 5404 |
| 3 | 1 | 64.9 | 72.1 | 13 / 35 | 5117 |
| 4 | 1 | 66.3 | 76.5 | 16 / 35 | 5214 |
| 5 | 1 | 64.9 | 75.6 | 14 / 35 | 4745 |
| 6 | 1 | 66.5 | 79.7 | 14 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 32 | 78% |
| cx.BlestPain 1.41 | 27 | 56% |
| oog.melee.Mercutio 1.0 | 25 | 64% |
| nic.Nicator 2.4 | 20 | 75% |
| ahf.NanoAndrew .4 | 10 | 90% |
| maribo.melee.BMV 0.1 | 2 | 100% |
| tex.Longbot 0.4 | 1 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 29 | 23% | 44 |
| cx.BlestPain 1.41 | 26 | 21% | 47 |
| oog.melee.Mercutio 1.0 | 23 | 18% | 38 |
| nic.Nicator 2.4 | 16 | 13% | 35 |
| ahf.NanoAndrew .4 | 15 | 12% | 22 |
| maribo.melee.BMV 0.1 | 9 | 7% | 11 |
| tex.Longbot 0.4 | 7 | 6% | 10 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |

## Melee bench: F18

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.0 | 127 / 210 | 2.17 | 19.0% | 30223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.0% | 127 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.0% | 31 |
| agd.Mooserwirt2 2.7 | 2.8 | 11.5% | 22 |
| uji.DBH 1.1 | 4.0 | 11.0% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 9.8% | 1 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.2% | 10 |
| sigterm.Sigterm 1.0 | 7.0 | 8.1% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 6.9% | 1 |
| stelo.WangRobot 1.0 | 8.8 | 6.3% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.3 | 21 / 35 | 5189 |
| 2 | 1 | 68.7 | 86.3 | 24 / 35 | 5035 |
| 3 | 1 | 66.9 | 83.2 | 17 / 35 | 4820 |
| 4 | 1 | 68.1 | 86.7 | 21 / 35 | 4845 |
| 5 | 1 | 69.4 | 89.5 | 23 / 35 | 5344 |
| 6 | 1 | 68.7 | 90.2 | 21 / 35 | 4990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 77% |
| agd.Mooserwirt2 2.7 | 31 | 71% |
| uji.DBH 1.1 | 18 | 94% |
| sigterm.Sigterm 1.0 | 16 | 94% |
| spinnercat.Robovirus 2.718 | 15 | 73% |
| ratosh.Nobo 0.21 | 12 | 92% |
| stelo.WangRobot 1.0 | 11 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 37% | 68 |
| agd.Mooserwirt2 2.7 | 15 | 18% | 46 |
| uji.DBH 1.1 | 10 | 12% | 24 |
| ratosh.Nobo 0.21 | 10 | 12% | 20 |
| spinnercat.Robovirus 2.718 | 10 | 12% | 19 |
| sigterm.Sigterm 1.0 | 3 | 4% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 2 |
| stelo.WangRobot 1.0 | 1 | 1% | 13 |

## Melee bench: F19

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.7 | 159 / 210 | 1.57 | 20.7% | 33805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.7% | 159 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.0% | 28 |
| mld.Infinity 2.2 | 2.8 | 13.6% | 20 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.7% | 2 |
| erdnis.Rover 0.3 | 4.7 | 10.4% | 2 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.2 | 7.5% | 0 |
| pac.ABC 2.1 | 8.0 | 6.6% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 30 / 35 | 5660 |
| 2 | 1 | 72.1 | 95.9 | 29 / 35 | 5778 |
| 3 | 1 | 72.1 | 95.6 | 27 / 35 | 5779 |
| 4 | 1 | 70.6 | 89.2 | 24 / 35 | 5496 |
| 5 | 1 | 70.6 | 90.8 | 23 / 35 | 5585 |
| 6 | 1 | 71.3 | 94.3 | 26 / 35 | 5507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 88 | 84% |
| mld.Infinity 2.2 | 54 | 85% |
| krillr.mini.JointStrike 2.0.0 | 17 | 94% |
| erdnis.Rover 0.3 | 11 | 91% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 36% | 87 |
| mld.Infinity 2.2 | 17 | 32% | 70 |
| erdnis.Rover 0.3 | 6 | 11% | 18 |
| krillr.mini.JointStrike 2.0.0 | 6 | 11% | 17 |
| patson.PatsonTestBot 1.0 | 3 | 6% | 12 |
| mbh.Mbh 0.1 | 1 | 2% | 5 |
| pbg.R2D2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F20

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.6 | 126 / 210 | 2.20 | 19.6% | 34917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.6% | 126 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.8% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.9% | 9 |
| fwb.Nine 1.0.1 | 4.0 | 11.0% | 18 |
| catcat20.Rabbit 0.001 | 4.3 | 10.2% | 12 |
| m3thos.mini.Eva01 0.5.5 | 5.8 | 8.6% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.3% | 0 |
| bayen.nut.Squirrel 1.615 | 7.5 | 7.1% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 1 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 86.3 | 20 / 35 | 5718 |
| 2 | 1 | 70.4 | 88.6 | 21 / 35 | 6171 |
| 3 | 1 | 69.8 | 86.0 | 20 / 35 | 6217 |
| 4 | 1 | 69.9 | 90.2 | 21 / 35 | 5628 |
| 5 | 1 | 68.1 | 83.8 | 21 / 35 | 5242 |
| 6 | 1 | 69.8 | 84.8 | 23 / 35 | 5941 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 75 | 73% |
| fwb.Nine 1.0.1 | 39 | 90% |
| catcat20.Rabbit 0.001 | 24 | 79% |
| nz.jdc.nano.GridFu 1.0 | 7 | 86% |
| bayen.nut.Squirrel 1.615 | 5 | 100% |
| m3thos.mini.Eva01 0.5.5 | 5 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 815. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 51% | 97 |
| fwb.Nine 1.0.1 | 15 | 18% | 22 |
| catcat20.Rabbit 0.001 | 11 | 13% | 33 |
| nz.jdc.nano.GridFu 1.0 | 8 | 9% | 26 |
| m3thos.mini.Eva01 0.5.5 | 4 | 5% | 11 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 13 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 2 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.7 | 139 / 210 | 1.74 | 20.6% | 36248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.6% | 139 |
| eem.EvBot v4.6.16 | 2.2 | 15.4% | 48 |
| dummy.mini.Scimitar 1.01 | 2.8 | 13.8% | 15 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 6 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.5% | 1 |
| eld.Hmm 1.0 | 5.8 | 8.1% | 4 |
| fire219.CatBot 1.0 | 7.3 | 6.6% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.8% | 2 |
| PSW.Relentless 0.1 | 8.8 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 93.0 | 26 / 35 | 6404 |
| 2 | 1 | 70.2 | 88.9 | 19 / 35 | 5860 |
| 3 | 1 | 71.7 | 92.7 | 26 / 35 | 6188 |
| 4 | 1 | 70.8 | 91.4 | 24 / 35 | 5878 |
| 5 | 1 | 70.7 | 91.4 | 21 / 35 | 5966 |
| 6 | 1 | 71.2 | 93.0 | 23 / 35 | 5952 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 90 | 77% |
| dummy.mini.Scimitar 1.01 | 37 | 95% |
| cf.RiO.RiOx 4.2.1 | 27 | 93% |
| eld.Hmm 1.0 | 5 | 100% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 1122. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 40 | 56% | 99 |
| dummy.mini.Scimitar 1.01 | 16 | 22% | 62 |
| cf.RiO.RiOx 4.2.1 | 10 | 14% | 24 |
| eld.Hmm 1.0 | 2 | 3% | 15 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 81.9 | 71 / 210 | 2.63 | 17.2% | 31107 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.2% | 71 |
| pe.SandboxDT 2.71m | 2.0 | 16.2% | 63 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.5% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 28 |
| bigpete.Stewie 1.0 | 5.0 | 11.0% | 9 |
| gg.Squaraus 0.6 | 6.7 | 6.9% | 0 |
| yk.JahRoslav 1.1 | 6.8 | 6.9% | 1 |
| tad.Dalek98 0.98 | 7.7 | 5.8% | 1 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.2 | 15 / 35 | 5379 |
| 2 | 2 | 66.3 | 80.6 | 9 / 35 | 4959 |
| 3 | 1 | 65.8 | 78.7 | 10 / 35 | 5016 |
| 4 | 1 | 66.3 | 79.0 | 11 / 35 | 5170 |
| 5 | 1 | 67.9 | 85.4 | 13 / 35 | 5187 |
| 6 | 1 | 67.8 | 85.1 | 13 / 35 | 5396 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 40 | 65% |
| pe.SandboxDT 2.71m | 36 | 39% |
| jlm.javaDisturbance 0.59 | 34 | 68% |
| bigpete.Stewie 1.0 | 8 | 63% |
| pbg.NinjaX 1.2 | 2 | 50% |
| yk.JahRoslav 1.1 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 53 | 38% | 70 |
| kvk.HebusLeTroll 0.35 | 42 | 30% | 64 |
| jlm.javaDisturbance 0.59 | 29 | 21% | 50 |
| bigpete.Stewie 1.0 | 8 | 6% | 13 |
| tad.Dalek98 0.98 | 3 | 2% | 3 |
| yk.JahRoslav 1.1 | 2 | 1% | 4 |
| pbg.NinjaX 1.2 | 2 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.1 | 118 / 210 | 2.07 | 19.1% | 31496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.1% | 118 |
| pe.SandboxLump 1.52 | 2.0 | 16.2% | 53 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 24 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.9% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.1% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 3 |
| sample.Walls 1.0 | 7.2 | 8.2% | 2 |
| cw.megas.Blade 0.8 | 7.3 | 8.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.3 | 18 / 35 | 5059 |
| 2 | 1 | 70.3 | 91.7 | 20 / 35 | 5334 |
| 3 | 1 | 70.4 | 88.6 | 21 / 35 | 5606 |
| 4 | 1 | 68.6 | 83.2 | 18 / 35 | 5451 |
| 5 | 1 | 69.6 | 87.9 | 20 / 35 | 4847 |
| 6 | 1 | 70.4 | 90.8 | 21 / 35 | 5199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 72 | 65% |
| cre.Karolos 0.32 | 40 | 85% |
| stelo.AreaTargetingBot 1.1 | 15 | 93% |
| stelo.RamTrackSurfer 1.2 | 13 | 69% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 80% |
| cw.megas.Blade 0.8 | 3 | 100% |
| cli.WasteOfAmmo 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 50 | 54% | 103 |
| cre.Karolos 0.32 | 21 | 23% | 51 |
| stelo.AreaTargetingBot 1.1 | 8 | 9% | 16 |
| stelo.RamTrackSurfer 1.2 | 4 | 4% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 4% | 8 |
| cw.megas.Blade 0.8 | 3 | 3% | 8 |
| sample.Walls 1.0 | 2 | 2% | 5 |

## Melee bench: F24

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 72.3 | 61 / 210 | 3.50 | 14.8% | 23157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.7 | 14.8% | 61 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 41 |
| florent.XSeries.X2 0.12 | 2.7 | 13.6% | 36 |
| davidalves.Phoenix 0.54 | 3.7 | 13.2% | 42 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.5% | 13 |
| oog.melee.Corsair 1.0 | 6.3 | 9.3% | 6 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.3% | 12 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.2% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 72.1 | 12 / 35 | 4004 |
| 2 | 1 | 62.3 | 72.4 | 10 / 35 | 3764 |
| 3 | 1 | 63.2 | 73.0 | 8 / 35 | 4459 |
| 4 | 1 | 64.3 | 77.1 | 16 / 35 | 3901 |
| 5 | 2 | 62.5 | 74.3 | 9 / 35 | 3575 |
| 6 | 4 | 58.9 | 64.8 | 6 / 35 | 3454 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 23 | 87% |
| florent.XSeries.X2 0.12 | 19 | 47% |
| davidalves.Phoenix 0.54 | 19 | 63% |
| oog.melee.Corsair 1.0 | 6 | 100% |
| pedersen.Ugluk 1.1.1 | 6 | 83% |
| stelo.SoJNanoMelee 1.1 | 6 | 83% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 639. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 38 | 26% | 57 |
| florent.XSeries.X2 0.12 | 36 | 24% | 50 |
| davidalves.Phoenix 0.54 | 27 | 18% | 37 |
| pedersen.Ugluk 1.1.1 | 16 | 11% | 21 |
| oog.melee.Corsair 1.0 | 14 | 9% | 21 |
| stelo.SoJNanoMelee 1.1 | 10 | 7% | 11 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 8 |
| evd.X1 0.01 | 4 | 3% | 4 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |

## Melee bench: F25

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.2 | 121 / 210 | 2.60 | 17.9% | 26512 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.9% | 121 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.7% | 24 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.5% | 16 |
| jdw.Hurricane 1.4 | 3.8 | 12.0% | 22 |
| gre.svman4.Morfeas 1.4.1 | 5.3 | 9.5% | 11 |
| ds.Oo 2.2 | 6.3 | 8.5% | 6 |
| gjr.Cephalosporin 0.1 | 7.3 | 7.3% | 6 |
| awesomeness.Elite 1.0 | 7.5 | 7.2% | 0 |
| adt.Ar2 1.1 | 8.5 | 6.8% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.1 | 23 / 35 | 4472 |
| 2 | 1 | 65.7 | 76.5 | 20 / 35 | 4510 |
| 3 | 1 | 68.7 | 87.6 | 23 / 35 | 4664 |
| 4 | 1 | 67.3 | 84.1 | 18 / 35 | 4542 |
| 5 | 1 | 67.6 | 83.8 | 20 / 35 | 4404 |
| 6 | 1 | 64.9 | 77.1 | 17 / 35 | 3920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 84% |
| voidious.micro.BlitzBat 1.05 | 38 | 92% |
| jdw.Hurricane 1.4 | 21 | 90% |
| gre.svman4.Morfeas 1.4.1 | 8 | 63% |
| ds.Oo 2.2 | 6 | 83% |
| adt.Ar2 1.1 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 557. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 22 | 25% | 63 |
| jdw.Hurricane 1.4 | 19 | 21% | 36 |
| voidious.micro.BlitzBat 1.05 | 13 | 15% | 43 |
| ds.Oo 2.2 | 11 | 12% | 20 |
| gre.svman4.Morfeas 1.4.1 | 8 | 9% | 17 |
| adt.Ar2 1.1 | 6 | 7% | 12 |
| awesomeness.Elite 1.0 | 5 | 6% | 10 |
| amk.ChumbaMini 0.2 | 4 | 4% | 4 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 5 |

## Melee bench: F26

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 84.4 | 104 / 210 | 2.40 | 18.2% | 33436 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.2% | 104 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 45 |
| shu.nitro.LENIN .T34 | 3.2 | 12.5% | 29 |
| lrem.Spectre 0.4.4 | 3.8 | 12.2% | 16 |
| js.PinBall 1.6 | 5.0 | 10.8% | 12 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.5% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 9.0% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 87.6 | 22 / 35 | 5812 |
| 2 | 1 | 67.8 | 81.6 | 16 / 35 | 5775 |
| 3 | 1 | 67.1 | 80.3 | 16 / 35 | 5269 |
| 4 | 1 | 68.2 | 86.0 | 16 / 35 | 5584 |
| 5 | 1 | 69.4 | 88.6 | 19 / 35 | 5596 |
| 6 | 1 | 67.4 | 82.2 | 15 / 35 | 5400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 40 | 65% |
| shu.nitro.LENIN .T34 | 38 | 76% |
| lrem.Spectre 0.4.4 | 32 | 75% |
| js.PinBall 1.6 | 13 | 69% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 36 | 34% | 63 |
| lrem.Spectre 0.4.4 | 26 | 25% | 45 |
| shu.nitro.LENIN .T34 | 24 | 23% | 59 |
| js.PinBall 1.6 | 10 | 9% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 5 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 10 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.3 | 108 / 210 | 2.69 | 17.9% | 30255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.9% | 108 |
| mk.Alpha 0.2.1 | 2.0 | 14.9% | 59 |
| wee.Gem 1.8.4 | 3.7 | 11.2% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 10.0% | 9 |
| EH.Eagle 1.0.6 | 5.0 | 9.7% | 5 |
| joe.ADinosaur 1.0 | 6.5 | 8.6% | 1 |
| techdude.kombat.FlamingKombat 1.5 | 6.5 | 8.6% | 3 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.0% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 7.3% | 3 |
| cs.Grudge 1.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.3 | 21 / 35 | 4769 |
| 2 | 1 | 68.2 | 87.0 | 20 / 35 | 4902 |
| 3 | 1 | 64.5 | 68.3 | 13 / 35 | 5289 |
| 4 | 1 | 67.2 | 83.8 | 19 / 35 | 4752 |
| 5 | 1 | 68.4 | 88.6 | 21 / 35 | 4795 |
| 6 | 1 | 66.2 | 71.7 | 14 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 72 | 68% |
| wee.Gem 1.8.4 | 23 | 78% |
| EH.Eagle 1.0.6 | 16 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 92% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| joe.ADinosaur 1.0 | 4 | 75% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 45 | 44% | 92 |
| wee.Gem 1.8.4 | 14 | 14% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 11% | 22 |
| joe.ADinosaur 1.0 | 9 | 9% | 15 |
| throxbot.ThroxBot 0.1 | 9 | 9% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 5% | 9 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 7 |
| EH.Eagle 1.0.6 | 3 | 3% | 19 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.5 | 132 / 210 | 1.95 | 19.0% | 27602 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.0% | 132 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 38 |
| uji.Antique 1.0 | 3.5 | 11.4% | 20 |
| qohnil.blot.BlotBot 3.61 | 4.0 | 10.7% | 13 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 2 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.0% | 3 |
| amk.ChumbaWumba 0.3 | 6.8 | 7.6% | 1 |
| matt.advanced.Katana 1.0 | 8.8 | 6.0% | 1 |
| stelo.PianistNano 1.2 | 8.8 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.2 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 90.8 | 21 / 35 | 4505 |
| 2 | 1 | 66.4 | 83.2 | 17 / 35 | 4369 |
| 3 | 1 | 69.3 | 91.4 | 22 / 35 | 4674 |
| 4 | 1 | 69.1 | 91.1 | 24 / 35 | 4798 |
| 5 | 1 | 68.2 | 87.3 | 21 / 35 | 4493 |
| 6 | 1 | 69.8 | 93.0 | 27 / 35 | 4763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 92 | 78% |
| uji.Antique 1.0 | 36 | 72% |
| qohnil.blot.BlotBot 3.61 | 16 | 81% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| amk.ChumbaWumba 0.3 | 6 | 83% |
| matt.advanced.Katana 1.0 | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 37% | 95 |
| uji.Antique 1.0 | 21 | 27% | 45 |
| pfvicm.Sobieski 7.2.3b | 11 | 14% | 19 |
| qohnil.blot.BlotBot 3.61 | 9 | 12% | 21 |
| amk.ChumbaWumba 0.3 | 3 | 4% | 6 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 9 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| matt.advanced.Katana 1.0 | 1 | 1% | 9 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 78.5 | 81 / 210 | 2.94 | 17.3% | 29672 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 17.3% | 81 |
| zyx.mega.YersiniaPestis 3.1 | 2.0 | 16.0% | 66 |
| deewiant.Anomaly 0.2 | 2.7 | 14.7% | 45 |
| myl.micro.Troodon 1.10 | 4.3 | 11.7% | 7 |
| jok.PheonixM 0.1.2 | 4.7 | 10.7% | 5 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.1% | 1 |
| DBall.Anarchy 0.1 | 7.0 | 6.7% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.6% | 0 |
| ap.Frederick 1.1 | 8.8 | 5.4% | 1 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 79.7 | 16 / 35 | 4776 |
| 2 | 2 | 65.0 | 74.6 | 9 / 35 | 4548 |
| 3 | 2 | 65.6 | 74.9 | 12 / 35 | 4881 |
| 4 | 1 | 69.1 | 84.8 | 15 / 35 | 5472 |
| 5 | 1 | 68.4 | 83.2 | 16 / 35 | 5255 |
| 6 | 1 | 65.3 | 73.7 | 13 / 35 | 4740 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 48 | 60% |
| deewiant.Anomaly 0.2 | 45 | 56% |
| myl.micro.Troodon 1.10 | 14 | 100% |
| jok.PheonixM 0.1.2 | 9 | 78% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 51 | 40% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 43 | 33% | 71 |
| myl.micro.Troodon 1.10 | 16 | 12% | 27 |
| jok.PheonixM 0.1.2 | 14 | 11% | 19 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 2 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |

## Melee bench: F30

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 68.8 | 41 / 210 | 3.81 | 13.9% | 23620 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 2.3 | 13.9% | 41 |
| catcat20.Matcha 0.006 | 2.5 | 13.7% | 47 |
| oog.melee.Capulet 1.2 | 3.0 | 13.4% | 37 |
| stelo.PastFuture 2.3.2 | 3.5 | 13.0% | 25 |
| darkcanuck.B26354 1.06 | 3.7 | 12.8% | 43 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.5% | 8 |
| tripphippy.Alice 1.1 | 6.7 | 8.0% | 5 |
| ntc.Opposite 1.5 | 8.3 | 7.6% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 6.9% | 4 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.9 | 76.5 | 12 / 35 | 4056 |
| 2 | 3 | 59.1 | 63.2 | 5 / 35 | 4074 |
| 3 | 1 | 62.4 | 72.1 | 9 / 35 | 4012 |
| 4 | 1 | 62.6 | 74.3 | 8 / 35 | 4006 |
| 5 | 4 | 59.1 | 65.1 | 3 / 35 | 3744 |
| 6 | 4 | 58.5 | 61.6 | 4 / 35 | 3728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 22 | 41% |
| darkcanuck.B26354 1.06 | 17 | 59% |
| oog.melee.Capulet 1.2 | 15 | 60% |
| stelo.PastFuture 2.3.2 | 13 | 62% |
| tripphippy.Alice 1.1 | 3 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| oog.melee.Capulet 1.2 | 40 | 24% | 48 |
| catcat20.Matcha 0.006 | 38 | 22% | 46 |
| darkcanuck.B26354 1.06 | 32 | 19% | 42 |
| stelo.PastFuture 2.3.2 | 30 | 18% | 39 |
| intruder.PrairieWolf 2.61 | 9 | 5% | 10 |
| tripphippy.Alice 1.1 | 8 | 5% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 9 |
| ntc.Opposite 1.5 | 5 | 3% | 5 |

## Melee bench: F31

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 69.6 | 39 / 210 | 3.73 | 14.0% | 21679 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.8% | 118 |
| hadur117.mini.DeiseW 0.2 | 2.2 | 14.0% | 39 |
| gh.mini.Griezel 0.2 | 3.0 | 12.9% | 31 |
| d414.nano.Quantum 1.0.0 | 4.2 | 11.7% | 5 |
| spinnercat.micro.Tyger 0.1 | 4.7 | 11.3% | 10 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.7% | 5 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.0% | 2 |
| fm.mammillarias 1.3 | 8.0 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.4 | 62.5 | 4 / 35 | 3478 |
| 2 | 2 | 63.6 | 75.9 | 10 / 35 | 3744 |
| 3 | 2 | 60.7 | 68.3 | 6 / 35 | 3643 |
| 4 | 2 | 62.4 | 70.8 | 9 / 35 | 3714 |
| 5 | 2 | 60.7 | 69.2 | 2 / 35 | 3774 |
| 6 | 2 | 61.3 | 71.1 | 8 / 35 | 3326 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 42 | 36% |
| gh.mini.Griezel 0.2 | 16 | 63% |
| d414.nano.Quantum 1.0.0 | 8 | 88% |
| spinnercat.micro.Tyger 0.1 | 5 | 80% |
| gh.nano.Grofvuil 0.2 | 3 | 33% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 686. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 38% | 81 |
| gh.mini.Griezel 0.2 | 39 | 23% | 50 |
| d414.nano.Quantum 1.0.0 | 21 | 12% | 26 |
| spinnercat.micro.Tyger 0.1 | 19 | 11% | 22 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 11 |
| Gecko.ultimateGeckoBot 1.0 | 7 | 4% | 8 |
| timmit.nano.TimDog 0.33 | 7 | 4% | 7 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.4 | 120 / 210 | 2.13 | 18.6% | 29749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.6% | 120 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 50 |
| lxx.ConceptA 0.8 | 3.5 | 11.1% | 11 |
| apc.botM 3.0 | 3.5 | 11.4% | 12 |
| bayen.UbaMicro 1.4 | 5.3 | 9.4% | 6 |
| vjik.UnViolation 1.1 | 5.7 | 9.3% | 7 |
| panzer.Panzer 0.2 | 7.5 | 7.7% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.9% | 1 |
| conscience.Electron 1.3g | 8.5 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.9 | 19 / 35 | 5333 |
| 2 | 1 | 69.1 | 89.5 | 20 / 35 | 5339 |
| 3 | 1 | 68.1 | 88.9 | 21 / 35 | 4724 |
| 4 | 1 | 68.1 | 87.3 | 21 / 35 | 5061 |
| 5 | 1 | 65.9 | 81.9 | 19 / 35 | 4504 |
| 6 | 1 | 67.7 | 87.9 | 20 / 35 | 4788 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 63 | 62% |
| apc.botM 3.0 | 30 | 83% |
| lxx.ConceptA 0.8 | 23 | 78% |
| vjik.UnViolation 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 11 | 91% |
| donjezza.Jezza 1.0 | 9 | 78% |
| yk.JahMicro 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 38 | 42% | 81 |
| lxx.ConceptA 0.8 | 17 | 19% | 24 |
| apc.botM 3.0 | 12 | 13% | 44 |
| bayen.UbaMicro 1.4 | 11 | 12% | 17 |
| vjik.UnViolation 1.1 | 4 | 4% | 21 |
| panzer.Panzer 0.2 | 4 | 4% | 6 |
| donjezza.Jezza 1.0 | 2 | 2% | 7 |
| conscience.Electron 1.3g | 2 | 2% | 3 |
| yk.JahMicro 1.0 | 1 | 1% | 7 |

## Melee bench: F33

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 81.0 | 95 / 210 | 2.71 | 17.8% | 30328 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 17.8% | 95 |
| maribo.Quester 0.3 | 1.8 | 16.3% | 45 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.4% | 25 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.3% | 17 |
| labg.Cataclysm 2.05 | 4.8 | 10.9% | 18 |
| baal.nano.N 1.42 | 6.0 | 9.0% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.8 | 8.0% | 7 |
| zyx.micro.Ant 1.1 | 8.3 | 5.6% | 0 |
| sanja.First 0.1 | 8.8 | 4.7% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 73.3 | 14 / 35 | 4950 |
| 2 | 1 | 66.4 | 79.4 | 14 / 35 | 4940 |
| 3 | 1 | 68.8 | 82.5 | 19 / 35 | 5485 |
| 4 | 1 | 67.7 | 83.5 | 17 / 35 | 4798 |
| 5 | 1 | 68.4 | 83.8 | 17 / 35 | 5267 |
| 6 | 1 | 67.6 | 83.5 | 14 / 35 | 4888 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 41 | 71% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 32 | 78% |
| labg.Cataclysm 2.05 | 24 | 63% |
| gre.svman4.Leonidas 1.3.2 | 19 | 84% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| baal.nano.N 1.42 | 4 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 810. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 51 | 43% | 81 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 19% | 52 |
| labg.Cataclysm 2.05 | 14 | 12% | 30 |
| gre.svman4.Leonidas 1.3.2 | 9 | 8% | 20 |
| zyx.micro.Ant 1.1 | 7 | 6% | 8 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 5% | 8 |
| baal.nano.N 1.42 | 5 | 4% | 7 |
| sanja.First 0.1 | 2 | 2% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.0 | 69 / 210 | 2.62 | 17.1% | 30023 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.3 | 17.1% | 69 |
| stelo.Spread 0.9 | 2.0 | 16.4% | 74 |
| kid.Gladiator .7.2 | 2.7 | 16.0% | 42 |
| tcf.Reach 3 | 4.2 | 11.6% | 5 |
| jcs.Seth 1.8 | 5.0 | 10.6% | 18 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.5% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 78.7 | 14 / 35 | 4747 |
| 2 | 1 | 66.4 | 83.2 | 5 / 35 | 4926 |
| 3 | 2 | 66.1 | 78.1 | 10 / 35 | 4958 |
| 4 | 1 | 66.6 | 80.6 | 12 / 35 | 4863 |
| 5 | 1 | 68.2 | 84.4 | 12 / 35 | 5368 |
| 6 | 1 | 68.4 | 86.7 | 16 / 35 | 5161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 57 | 42% |
| kid.Gladiator .7.2 | 42 | 67% |
| jcs.Seth 1.8 | 8 | 50% |
| tcf.Reach 3 | 6 | 83% |
| cli.Dancer 1.1 | 5 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |

Hadur died in 142 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 68 | 48% | 94 |
| kid.Gladiator .7.2 | 41 | 29% | 62 |
| jcs.Seth 1.8 | 13 | 9% | 18 |
| tcf.Reach 3 | 11 | 8% | 17 |
| cli.Dancer 1.1 | 6 | 4% | 15 |
| ratosh.Wesco 1.4 | 2 | 1% | 3 |
| sample.RamFire 1.0 | 1 | 1% | 0 |

## Melee bench: F35

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 75.4 | 32 / 210 | 3.21 | 14.6% | 22403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 150 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 14.6% | 32 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.3% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.8% | 8 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 1 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 7.1% | 3 |
| wit.Chuliath 1.0 | 7.2 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 5.8% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.6 | 6 / 35 | 3571 |
| 2 | 2 | 61.4 | 70.8 | 8 / 35 | 3479 |
| 3 | 2 | 65.4 | 82.2 | 6 / 35 | 4212 |
| 4 | 2 | 63.1 | 74.9 | 4 / 35 | 4046 |
| 5 | 2 | 63.3 | 77.5 | 5 / 35 | 3710 |
| 6 | 2 | 60.9 | 72.4 | 3 / 35 | 3385 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 63 | 14% |
| gh.mini.Gruwel 0.9 | 14 | 57% |
| rz.HawkOnFire 0.1 | 7 | 86% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 100% |
| myl.nano.KomoriNinja 1.1 | 2 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 82 | 46% | 89 |
| gh.mini.Gruwel 0.9 | 37 | 21% | 47 |
| dmh.robocode.robot.BlackDeath 9.2 | 23 | 13% | 31 |
| rz.HawkOnFire 0.1 | 23 | 13% | 26 |
| wit.Chuliath 1.0 | 4 | 2% | 5 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| dans.Cinnamon 1.2 | 1 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 90.8 | 147 / 210 | 1.83 | 20.2% | 32650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.2% | 147 |
| alpha.RainingFire 1.0 | 2.3 | 12.3% | 20 |
| bzdp.Pansy 2.1 | 2.8 | 11.9% | 11 |
| bvh.micro.Freya 0.3 | 5.2 | 10.3% | 8 |
| mz.Cork 0.1 | 5.3 | 9.9% | 8 |
| bvh.mini.Fenrir 0.39 | 5.7 | 9.9% | 6 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.2% | 7 |
| squidM.TentalceMeleeNano 1.1 | 8.3 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 5.9% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.7 | 27 / 35 | 5847 |
| 2 | 1 | 70.1 | 91.4 | 24 / 35 | 5270 |
| 3 | 1 | 70.3 | 90.2 | 24 / 35 | 5655 |
| 4 | 1 | 69.1 | 88.3 | 21 / 35 | 5389 |
| 5 | 1 | 69.6 | 90.8 | 24 / 35 | 4926 |
| 6 | 1 | 70.7 | 91.4 | 27 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 37 | 95% |
| bvh.micro.Freya 0.3 | 33 | 94% |
| mz.Cork 0.1 | 33 | 88% |
| alpha.RainingFire 1.0 | 24 | 71% |
| bvh.mini.Fenrir 0.39 | 23 | 87% |
| m3thos.Eva02 0.7.1 | 10 | 70% |
| sample.MyFirstRobot 1.0 | 5 | 80% |
| dl.BetterWalls 1.0 | 3 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 63 of 210 rounds, at a mean tick of 775. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 18 | 29% | 44 |
| bvh.mini.Fenrir 0.39 | 11 | 17% | 23 |
| bvh.micro.Freya 0.3 | 10 | 16% | 38 |
| m3thos.Eva02 0.7.1 | 9 | 14% | 22 |
| mz.Cork 0.1 | 8 | 13% | 31 |
| bzdp.Pansy 2.1 | 5 | 8% | 38 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 5 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 6 |

## Melee bench: F37

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 92.1 | 165 / 210 | 1.71 | 20.0% | 34160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.0% | 165 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2.5 | 10.7% | 8 |
| germ.TheMind .2 | 3.5 | 10.4% | 11 |
| EBBU.Sim2 1.02 | 4.0 | 9.6% | 6 |
| agrach.Dalek 1.0 | 5.7 | 8.8% | 5 |
| lmk.ACPFinal 0.1 | 6.5 | 8.5% | 5 |
| stelo.UntouchableNano 1.3 | 6.8 | 8.4% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.3 | 7.9% | 1 |
| mb.Beast 0.1 | 8.3 | 8.0% | 3 |
| skm.Ryubot 1.0 | 8.3 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.6 | 22 / 35 | 5706 |
| 2 | 1 | 69.7 | 93.0 | 28 / 35 | 5768 |
| 3 | 1 | 70.4 | 94.6 | 29 / 35 | 5935 |
| 4 | 1 | 70.5 | 94.6 | 30 / 35 | 6072 |
| 5 | 1 | 67.9 | 88.9 | 27 / 35 | 5171 |
| 6 | 1 | 69.3 | 92.7 | 29 / 35 | 5508 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 36 | 94% |
| EBBU.Sim2 1.02 | 26 | 100% |
| agrach.Dalek 1.0 | 24 | 92% |
| stelo.UntouchableNano 1.3 | 22 | 95% |
| skm.Ryubot 1.0 | 18 | 94% |
| com.syncleus.robocode.Dreadnaught 0.1 | 17 | 100% |
| lmk.ACPFinal 0.1 | 16 | 75% |
| mb.Beast 0.1 | 16 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 471. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 10 | 22% | 34 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 16% | 33 |
| agrach.Dalek 1.0 | 6 | 13% | 31 |
| lmk.ACPFinal 0.1 | 6 | 13% | 24 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 11% | 10 |
| EBBU.Sim2 1.02 | 4 | 9% | 24 |
| mb.Beast 0.1 | 3 | 7% | 21 |
| stelo.UntouchableNano 1.3 | 2 | 4% | 20 |
| skm.Ryubot 1.0 | 2 | 4% | 13 |

## Melee bench: F38

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 77.7 | 73 / 210 | 3.01 | 15.9% | 25150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.8% | 81 |
| hadur117.mini.DeiseW 0.2 | 1.5 | 15.9% | 73 |
| bvh.mini.Freya 0.55 | 3.2 | 12.8% | 10 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.0% | 23 |
| cs.Wren 1.0 | 4.8 | 10.8% | 8 |
| davidalves.net.DuelistNanoMelee 1.01 | 6.0 | 9.5% | 3 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.7% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7.7 | 6.7% | 8 |
| bzdp.BoxCar 2.0 | 9.5 | 3.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 71.4 | 4 / 35 | 3970 |
| 2 | 1 | 65.7 | 80.3 | 16 / 35 | 4299 |
| 3 | 2 | 63.7 | 76.2 | 11 / 35 | 3953 |
| 4 | 1 | 67.2 | 84.8 | 17 / 35 | 4589 |
| 5 | 1 | 66.0 | 81.3 | 16 / 35 | 4199 |
| 6 | 2 | 62.6 | 72.1 | 9 / 35 | 4140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 42 | 48% |
| bts.mega.Gnarly 1.4 | 17 | 59% |
| cs.Wren 1.0 | 15 | 80% |
| bvh.mini.Freya 0.55 | 11 | 91% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 8 | 50% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 677. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 43 | 31% | 66 |
| bvh.mini.Freya 0.55 | 27 | 20% | 34 |
| bts.mega.Gnarly 1.4 | 26 | 19% | 39 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 9% | 20 |
| cs.Wren 1.0 | 12 | 9% | 24 |
| kdf.KoulDestroyer 1.0 | 8 | 6% | 14 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 5% | 9 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 3 |

## Melee bench: F39

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.6 | 78 / 210 | 2.75 | 16.9% | 29935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 16.9% | 78 |
| bvh.fry.Freya 0.82 | 2.0 | 15.5% | 41 |
| az.Ololobot 0.2.4 | 3.5 | 12.0% | 50 |
| catcat20.Lambda 0.024 | 3.5 | 11.8% | 27 |
| gimp.GimpBot 0.1 | 6.3 | 8.4% | 3 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.0% | 0 |
| stelo.SoRobotNanoMelee 1.2 | 6.5 | 8.5% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.5% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.1 | 17 / 35 | 5192 |
| 2 | 1 | 66.3 | 83.2 | 13 / 35 | 4864 |
| 3 | 1 | 66.0 | 83.2 | 11 / 35 | 5103 |
| 4 | 1 | 64.8 | 76.2 | 13 / 35 | 5118 |
| 5 | 1 | 65.2 | 80.0 | 12 / 35 | 4836 |
| 6 | 1 | 64.7 | 76.8 | 12 / 35 | 4822 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 39 | 69% |
| catcat20.Lambda 0.024 | 31 | 74% |
| az.Ololobot 0.2.4 | 20 | 30% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 83% |
| apollokidd.ApolloKidd 0.9 | 5 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 853. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 62 | 47% | 85 |
| az.Ololobot 0.2.4 | 30 | 23% | 40 |
| catcat20.Lambda 0.024 | 27 | 20% | 44 |
| stelo.SoRobotNanoMelee 1.2 | 6 | 5% | 11 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 13 |
| gimp.GimpBot 0.1 | 2 | 2% | 10 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.7 | 97 / 210 | 2.47 | 18.1% | 30387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 18.1% | 97 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.6% | 53 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.5% | 28 |
| mz.AntiGrav 1.0 | 4.5 | 10.6% | 8 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.6% | 12 |
| stelo.Randomness 1.0 | 6.3 | 8.7% | 8 |
| alpha.BlackIce 1.0 | 6.5 | 8.8% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 5.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.4% | 0 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 14 / 35 | 4610 |
| 2 | 1 | 67.6 | 82.5 | 15 / 35 | 5218 |
| 3 | 1 | 69.1 | 88.3 | 19 / 35 | 5220 |
| 4 | 1 | 68.7 | 85.7 | 19 / 35 | 5449 |
| 5 | 1 | 68.0 | 83.8 | 18 / 35 | 5011 |
| 6 | 1 | 66.0 | 80.0 | 12 / 35 | 4879 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 54 | 57% |
| kano.gamma.KanoGamma 1.8 | 33 | 52% |
| Polkwane.SmashMelee 1.0 | 17 | 88% |
| mz.AntiGrav 1.0 | 15 | 100% |
| stelo.Randomness 1.0 | 12 | 92% |
| alpha.BlackIce 1.0 | 7 | 71% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 44 | 39% | 67 |
| kano.gamma.KanoGamma 1.8 | 30 | 27% | 54 |
| Polkwane.SmashMelee 1.0 | 12 | 11% | 19 |
| stelo.Randomness 1.0 | 9 | 8% | 24 |
| mz.AntiGrav 1.0 | 9 | 8% | 24 |
| alpha.BlackIce 1.0 | 5 | 4% | 9 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.8 | 100 / 210 | 2.37 | 17.8% | 27710 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 17.8% | 100 |
| eem.EvBotNG v12.8 | 2.0 | 15.5% | 63 |
| ary.Swarm 1.1 | 3.7 | 12.7% | 14 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.4% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.4% | 12 |
| shrub.Silver v048 | 6.0 | 8.7% | 3 |
| zyx.nano.Ant 1.1 | 6.8 | 7.9% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.8% | 1 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 87.0 | 19 / 35 | 4739 |
| 2 | 1 | 68.0 | 85.7 | 17 / 35 | 4891 |
| 3 | 1 | 67.5 | 86.3 | 13 / 35 | 4706 |
| 4 | 1 | 66.9 | 84.4 | 16 / 35 | 4304 |
| 5 | 1 | 67.2 | 83.8 | 17 / 35 | 4462 |
| 6 | 1 | 67.1 | 81.3 | 18 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 58 | 52% |
| lessonz.robocode.Oz 0.5.0 | 33 | 94% |
| ary.Swarm 1.1 | 24 | 83% |
| simonton.nano.MeleeSeed 1.8 | 17 | 94% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 48 | 44% | 77 |
| ary.Swarm 1.1 | 19 | 17% | 37 |
| lessonz.robocode.Oz 0.5.0 | 17 | 15% | 43 |
| simonton.nano.MeleeSeed 1.8 | 9 | 8% | 29 |
| zyx.nano.Ant 1.1 | 9 | 8% | 9 |
| shrub.Silver v048 | 4 | 4% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 77.6 | 75 / 210 | 3.01 | 16.7% | 30986 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.2 | 16.7% | 75 |
| wompi.Wallaby 5.1 | 2.0 | 15.6% | 54 |
| ara.Shera 0.88 | 3.2 | 13.8% | 45 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.5% | 28 |
| amz.NanoClone 1.41 | 5.2 | 9.7% | 2 |
| maribo.IotaCT 1.1 | 6.7 | 7.2% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.0% | 5 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.9% | 1 |
| mme.NikeEnhanced 2.0 | 8.5 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 14 / 35 | 5676 |
| 2 | 1 | 66.5 | 81.3 | 13 / 35 | 5159 |
| 3 | 2 | 63.5 | 72.4 | 8 / 35 | 4798 |
| 4 | 1 | 65.3 | 77.8 | 14 / 35 | 4865 |
| 5 | 1 | 65.5 | 75.9 | 10 / 35 | 5064 |
| 6 | 1 | 67.0 | 78.1 | 16 / 35 | 5424 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 36 | 53% |
| wompi.Wallaby 5.1 | 36 | 86% |
| maribo.mini.MiniQuester 0.1 | 22 | 82% |
| dsw.StaticD 1.0 | 8 | 88% |

Hadur died in 135 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 44 | 33% | 57 |
| wompi.Wallaby 5.1 | 38 | 28% | 70 |
| maribo.mini.MiniQuester 0.1 | 35 | 26% | 55 |
| amz.NanoClone 1.41 | 8 | 6% | 9 |
| dsw.StaticD 1.0 | 3 | 2% | 8 |
| maribo.IotaCT 1.1 | 3 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 2 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.5 | 73.4 | 27 / 210 | 3.39 | 14.5% | 23338 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.5% | 143 |
| hadur117.mini.DeiseW 0.2 | 2.0 | 14.5% | 27 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.4% | 15 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.6% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 11.0% | 10 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 10.1% | 6 |
| mz.NanoGod 2.02 | 7.0 | 8.0% | 1 |
| jab.DiamondStealer 5 | 8.0 | 7.5% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 71.1 | 5 / 35 | 3886 |
| 2 | 2 | 63.0 | 72.4 | 1 / 35 | 3764 |
| 3 | 2 | 63.9 | 74.3 | 4 / 35 | 3834 |
| 4 | 2 | 63.1 | 73.7 | 5 / 35 | 3791 |
| 5 | 2 | 64.0 | 74.0 | 5 / 35 | 3965 |
| 6 | 2 | 64.5 | 75.2 | 7 / 35 | 4098 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 64 | 19% |
| brainfade.melee.Dusk 0.44 | 11 | 55% |
| wcsv.melee.EngineerMelee 0.1 | 5 | 80% |
| dummy.micro.Sparrow 2.5 | 5 | 60% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 81 | 44% | 93 |
| brainfade.melee.Dusk 0.44 | 28 | 15% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 24 | 13% | 26 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 21 |
| Krabb.akim2.Akim2 1.1b | 15 | 8% | 18 |
| mz.NanoGod 2.02 | 11 | 6% | 11 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.5 | 106 / 210 | 2.13 | 19.2% | 33863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 19.2% | 106 |
| stelo.Liblix 0.3.1 | 2.3 | 15.4% | 58 |
| tzu.TheArtOfWar 1.2 | 2.7 | 14.7% | 32 |
| wompi.Quokka 1.6 | 4.0 | 10.4% | 4 |
| jwirde.Gort 2.0 | 5.5 | 8.9% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 9.0% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 6.8% | 0 |
| disan.Chair 2.2.0 | 7.5 | 6.9% | 3 |
| sample.Crazy 1.0 | 9.5 | 4.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.6 | 19 / 35 | 5463 |
| 2 | 1 | 68.8 | 84.1 | 20 / 35 | 5766 |
| 3 | 1 | 69.4 | 87.6 | 16 / 35 | 5765 |
| 4 | 1 | 68.8 | 87.6 | 13 / 35 | 5530 |
| 5 | 1 | 70.1 | 89.8 | 18 / 35 | 5845 |
| 6 | 1 | 69.7 | 87.0 | 20 / 35 | 5494 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 70 | 67% |
| tzu.TheArtOfWar 1.2 | 54 | 67% |
| wompi.Quokka 1.6 | 18 | 83% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 100% |
| disan.Chair 2.2.0 | 4 | 25% |
| jwirde.Gort 2.0 | 2 | 50% |

Hadur died in 105 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 40% | 96 |
| tzu.TheArtOfWar 1.2 | 31 | 30% | 63 |
| wompi.Quokka 1.6 | 8 | 8% | 19 |
| jwirde.Gort 2.0 | 8 | 8% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 6% | 8 |
| disan.Chair 2.2.0 | 5 | 5% | 6 |
| amk.jointstrike.JointStrike 0.2 | 3 | 3% | 3 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 87.3 | 99 / 210 | 2.14 | 20.0% | 37160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseW 0.2 | 1.0 | 20.0% | 99 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.6% | 93 |
| jje.BagPuss 1.2 | 2.8 | 11.8% | 4 |
| myl.nano.Graviton 1.10 | 4.5 | 10.2% | 3 |
| sul.Lunar 1.1 | 4.7 | 10.0% | 3 |
| fm.claire 1.7 | 6.3 | 8.5% | 2 |
| hvilela.HVilela 0.9 | 7.2 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.2% | 3 |
| wit.Deep7 2.0 | 9.2 | 5.8% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.8 | 17 / 35 | 6563 |
| 2 | 1 | 68.4 | 84.8 | 16 / 35 | 5614 |
| 3 | 1 | 69.7 | 87.3 | 17 / 35 | 6238 |
| 4 | 1 | 68.0 | 82.9 | 11 / 35 | 5971 |
| 5 | 1 | 71.1 | 90.8 | 18 / 35 | 6732 |
| 6 | 1 | 69.9 | 87.3 | 20 / 35 | 6042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 102 | 38% |
| sul.Lunar 1.1 | 17 | 100% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| jje.BagPuss 1.2 | 12 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 82% |
| fm.claire 1.7 | 4 | 100% |
| wit.Deep7 2.0 | 3 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 66 | 59% | 0 |
| jje.BagPuss 1.2 | 15 | 13% | 63 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 27 |
| myl.nano.Graviton 1.10 | 6 | 5% | 25 |
| fm.claire 1.7 | 6 | 5% | 14 |
| sul.Lunar 1.1 | 5 | 4% | 52 |
| hvilela.HVilela 0.9 | 4 | 4% | 9 |
| wit.Deep7 2.0 | 2 | 2% | 14 |
| abud.ThirdRobo 1.0 | 2 | 2% | 4 |

## Melee bench: F46

hadur117.mini.DeiseW 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 76.5 | 46 / 210 | 3.12 | 15.1% | 25106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.1% | 90 |
| kc.mini.Mirage 0.2 | 1.7 | 16.5% | 57 |
| hadur117.mini.DeiseW 0.2 | 2.8 | 15.1% | 46 |
| mz.MicroSheep 1.0 | 4.2 | 10.6% | 2 |
| cx.Princess 1.0 | 5.0 | 9.9% | 11 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 2 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 5.0% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 75.2 | 6 / 35 | 4191 |
| 2 | 3 | 63.2 | 75.9 | 5 / 35 | 4151 |
| 3 | 3 | 64.3 | 76.8 | 9 / 35 | 4358 |
| 4 | 2 | 64.7 | 79.4 | 10 / 35 | 4364 |
| 5 | 3 | 62.8 | 74.3 | 8 / 35 | 4057 |
| 6 | 3 | 63.6 | 77.1 | 8 / 35 | 3985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 37 | 41% |
| kc.mini.Mirage 0.2 | 28 | 64% |
| cx.Princess 1.0 | 7 | 71% |
| mz.MicroSheep 1.0 | 4 | 75% |
| sadoner.killer 0.2 | 3 | 100% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 164 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 73 | 45% | 91 |
| rsalesc.melee.Medina 0.4.5 | 60 | 37% | 76 |
| mz.MicroSheep 1.0 | 9 | 5% | 12 |
| cx.Princess 1.0 | 8 | 5% | 12 |
| sadoner.killer 0.2 | 7 | 4% | 10 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 5 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

