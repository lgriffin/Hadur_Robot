# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 85.2 | 54 / 210 | 2.33 | 16.7% | 27896 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 138 |
| hadur117.mini.DeiseWARM4 0.4 | 2.0 | 16.7% | 54 |
| mz.MicroGodMelee 1 | 3.7 | 11.4% | 5 |
| sgp.JollyNinja 3.53 | 3.8 | 11.3% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.2% | 1 |
| lorneswork.Predator 1.0 | 5.8 | 9.0% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.2 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 85.4 | 8 / 35 | 4302 |
| 2 | 2 | 66.2 | 85.1 | 6 / 35 | 4729 |
| 3 | 2 | 65.8 | 82.5 | 9 / 35 | 4564 |
| 4 | 2 | 67.0 | 89.5 | 11 / 35 | 4554 |
| 5 | 2 | 67.2 | 86.0 | 10 / 35 | 5113 |
| 6 | 2 | 66.1 | 82.9 | 10 / 35 | 4634 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 130 | 14% |
| sgp.JollyNinja 3.53 | 16 | 100% |
| mz.MicroGodMelee 1 | 16 | 88% |
| adt.Ar2 1.0 | 3 | 67% |
| lorneswork.Predator 1.0 | 2 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 1271. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 119 | 76% | 141 |
| sgp.JollyNinja 3.53 | 11 | 7% | 23 |
| mz.MicroGodMelee 1 | 11 | 7% | 19 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 7 |
| lorneswork.Predator 1.0 | 4 | 3% | 9 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 1 | 1% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.6 | 111 / 210 | 2.39 | 17.9% | 27701 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 17.9% | 111 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.3% | 41 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.3% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.2 | 9.5% | 11 |
| Noran.BitchingElk 0.054 | 6.3 | 8.1% | 4 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 7.9% | 2 |
| stelo.PatternRobot 1.0 | 8.3 | 6.6% | 3 |
| sch.Simone 0.3d | 8.3 | 6.6% | 9 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.0 | 18 / 35 | 4553 |
| 2 | 1 | 69.1 | 90.5 | 22 / 35 | 4758 |
| 3 | 1 | 66.5 | 82.9 | 18 / 35 | 4443 |
| 4 | 1 | 67.1 | 85.7 | 16 / 35 | 4629 |
| 5 | 1 | 67.2 | 83.2 | 18 / 35 | 4793 |
| 6 | 1 | 67.2 | 84.1 | 19 / 35 | 4525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 67% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 77% |
| stelo.PatternRobot 1.0 | 12 | 92% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| Noran.BitchingElk 0.054 | 10 | 90% |
| sch.Simone 0.3d | 8 | 50% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 71% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 926. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 37% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 16 | 16% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 13% | 19 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 11% | 18 |
| stelo.PatternRobot 1.0 | 8 | 8% | 12 |
| sch.Simone 0.3d | 6 | 6% | 11 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 10 |
| Noran.BitchingElk 0.054 | 2 | 2% | 14 |
| fullsail.SweetTea 1.1 | 1 | 1% | 3 |

## Melee bench: F03

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.3 | 143 / 210 | 1.79 | 19.9% | 36131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.9% | 143 |
| radnor.DoctorBob 1.42 | 2.7 | 13.3% | 16 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.1% | 16 |
| vuen.Cake 2.51 | 3.2 | 13.0% | 32 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 7.0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 83.8 | 22 / 35 | 5660 |
| 2 | 1 | 70.6 | 93.7 | 24 / 35 | 6136 |
| 3 | 1 | 71.3 | 94.6 | 25 / 35 | 6592 |
| 4 | 1 | 68.5 | 86.3 | 23 / 35 | 5724 |
| 5 | 1 | 70.4 | 93.3 | 23 / 35 | 5924 |
| 6 | 1 | 70.8 | 95.9 | 26 / 35 | 6095 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 63 | 68% |
| kawigi.nano.Lib 1.0 | 60 | 88% |
| radnor.DoctorBob 1.42 | 36 | 94% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 952. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 26 | 39% | 73 |
| kawigi.nano.Lib 1.0 | 16 | 24% | 55 |
| radnor.DoctorBob 1.42 | 12 | 18% | 50 |
| urdos.URDOS 1.3 | 4 | 6% | 10 |
| adt.Ar1 2.1 | 4 | 6% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 3% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 1% | 2 |

## Melee bench: F04

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 33 / 210 | 2.34 | 17.2% | 32968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 168 |
| hadur117.mini.DeiseWARM4 0.4 | 2.0 | 17.2% | 33 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 2 |
| josago.Jorgito 0.16 | 5.2 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.3 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.0% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 88.6 | 12 / 35 | 6088 |
| 2 | 2 | 67.5 | 85.7 | 3 / 35 | 5402 |
| 3 | 2 | 67.1 | 82.9 | 4 / 35 | 5344 |
| 4 | 2 | 66.8 | 81.6 | 7 / 35 | 5231 |
| 5 | 2 | 66.1 | 82.5 | 2 / 35 | 5088 |
| 6 | 2 | 68.7 | 89.5 | 5 / 35 | 5815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 157 | 17% |
| TNT.TNT 0.99.1 | 3 | 67% |
| apc.LeeroyJenkins2 1.0 | 3 | 67% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 1426. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 154 | 87% | 183 |
| apc.LeeroyJenkins2 1.0 | 13 | 7% | 14 |
| josago.Jorgito 0.16 | 4 | 2% | 5 |
| TNT.TNT 0.99.1 | 3 | 2% | 5 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |

## Melee bench: F05

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.1 | 71.9 | 21 / 210 | 3.53 | 13.5% | 20268 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.1% | 119 |
| justin.DemonicRage 3.4 | 2.0 | 16.9% | 55 |
| hadur117.mini.DeiseWARM4 0.4 | 3.3 | 13.5% | 21 |
| wompi.Numbat 2.1 | 3.7 | 13.0% | 10 |
| axeBots.HataMoto 3.09 | 5.5 | 8.7% | 5 |
| ms.Ares 0.19 | 5.5 | 8.9% | 0 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.8 | 71.1 | 7 / 35 | 3200 |
| 2 | 3 | 60.4 | 70.5 | 3 / 35 | 3152 |
| 3 | 3 | 62.8 | 74.0 | 5 / 35 | 3631 |
| 4 | 3 | 61.3 | 72.4 | 2 / 35 | 3514 |
| 5 | 3 | 61.8 | 76.2 | 1 / 35 | 3476 |
| 6 | 4 | 59.6 | 67.3 | 3 / 35 | 3295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 38 | 11% |
| justin.DemonicRage 3.4 | 27 | 30% |
| wompi.Numbat 2.1 | 9 | 78% |
| axeBots.HataMoto 3.09 | 1 | 100% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 842. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 38% | 78 |
| justin.DemonicRage 3.4 | 53 | 28% | 61 |
| wompi.Numbat 2.1 | 32 | 17% | 37 |
| ms.Ares 0.19 | 14 | 7% | 15 |
| axeBots.HataMoto 3.09 | 11 | 6% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 84.9 | 107 / 210 | 2.36 | 17.7% | 27344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 17.7% | 107 |
| jekl.StoneGhost 0.7 | 2.7 | 13.9% | 22 |
| origin.SleepSiphon 1.7b | 3.0 | 13.8% | 46 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 13.1% | 27 |
| mld.Wisdom 1.0 | 5.2 | 9.9% | 2 |
| gg.Wolverine 2.0 | 6.0 | 8.5% | 4 |
| DBall.NUKE 0.1 | 7.5 | 6.9% | 1 |
| spinnercat.Omen 1.0 | 8.2 | 6.3% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.4% | 1 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 89.2 | 21 / 35 | 4965 |
| 2 | 1 | 68.7 | 89.5 | 19 / 35 | 4823 |
| 3 | 1 | 68.1 | 88.3 | 20 / 35 | 4393 |
| 4 | 1 | 66.6 | 83.2 | 19 / 35 | 4572 |
| 5 | 1 | 65.6 | 79.7 | 13 / 35 | 4472 |
| 6 | 1 | 65.1 | 79.4 | 15 / 35 | 4119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 57 | 68% |
| jekl.StoneGhost 0.7 | 35 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 75% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| gg.Wolverine 2.0 | 5 | 80% |
| mld.Wisdom 1.0 | 2 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 878. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 32 | 30% | 74 |
| pe.minimelee.SandboxMiniMelee 1.1 | 23 | 22% | 43 |
| jekl.StoneGhost 0.7 | 22 | 21% | 50 |
| mld.Wisdom 1.0 | 15 | 14% | 17 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 12 |
| gg.Wolverine 2.0 | 3 | 3% | 5 |
| spinnercat.Omen 1.0 | 3 | 3% | 4 |
| DBall.NUKE 0.1 | 2 | 2% | 3 |
| sample.Fire 1.0 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.1 | 135 / 210 | 1.62 | 20.0% | 33907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.0% | 135 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.0% | 37 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 28 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.9% | 6 |
| franzor.Lizt 1.3.1 | 5.0 | 10.2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.4 | 22 / 35 | 5113 |
| 2 | 1 | 71.3 | 93.0 | 22 / 35 | 5643 |
| 3 | 1 | 71.5 | 93.3 | 23 / 35 | 5678 |
| 4 | 1 | 71.4 | 93.0 | 23 / 35 | 5504 |
| 5 | 1 | 71.1 | 93.0 | 24 / 35 | 5432 |
| 6 | 1 | 72.4 | 94.0 | 21 / 35 | 6537 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 89 | 84% |
| rsalesc.melee.Monk 0.3.6c | 46 | 35% |
| oog.melee.CapuletDroid 1.1 | 42 | 95% |
| franzor.Lizt 1.3.1 | 7 | 57% |

Hadur died in 76 of 210 rounds, at a mean tick of 1470. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 38 | 50% | 57 |
| rtk.Tachikoma 1.0 | 27 | 36% | 100 |
| oog.melee.CapuletDroid 1.1 | 7 | 9% | 43 |
| franzor.Lizt 1.3.1 | 3 | 4% | 0 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.8 | 135 / 210 | 1.83 | 19.4% | 29393 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.4% | 135 |
| shrub.Vapour v159 | 2.3 | 13.7% | 33 |
| tm.Yuugao 1.0 | 2.7 | 12.6% | 30 |
| Krabb.sliNk.Garm 0.9u | 5.0 | 9.8% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 8.9% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 5.8 | 8.3% | 3 |
| m3thos.Eva00 1.1 | 7.2 | 7.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 8.2 | 6.6% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.3% | 0 |
| SHAM.WOW 1.4 | 9.2 | 6.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.5 | 22 / 35 | 4840 |
| 2 | 1 | 67.9 | 87.6 | 19 / 35 | 4791 |
| 3 | 1 | 67.8 | 86.3 | 19 / 35 | 4738 |
| 4 | 1 | 69.4 | 91.7 | 22 / 35 | 5013 |
| 5 | 1 | 69.5 | 92.7 | 25 / 35 | 4848 |
| 6 | 1 | 70.4 | 95.9 | 28 / 35 | 5163 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 56 | 71% |
| shrub.Vapour v159 | 53 | 74% |
| Krabb.sliNk.Garm 0.9u | 16 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| SHAM.WOW 1.4 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 5 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 29 | 37% | 73 |
| shrub.Vapour v159 | 27 | 35% | 66 |
| Krabb.sliNk.Garm 0.9u | 7 | 9% | 21 |
| zyx.nano.BacillusComma 1.0 | 5 | 6% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 17 |
| SHAM.WOW 1.4 | 2 | 3% | 4 |
| com.spp.robocode.MostlyHarmless 010 | 1 | 1% | 12 |
| m3thos.Eva00 1.1 | 1 | 1% | 6 |
2 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 78.8 | 65 / 210 | 2.91 | 16.0% | 23925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.6% | 86 |
| hadur117.mini.DeiseWARM4 0.4 | 1.8 | 16.0% | 65 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 24 |
| yagami.Tidus 0.11 | 4.7 | 10.2% | 3 |
| mc2.enemy.Original 0.9 | 5.2 | 10.3% | 16 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.9% | 14 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 3 |
| step.nanoPri 1.0 | 8.2 | 6.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.2 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 75.9 | 12 / 35 | 3962 |
| 2 | 1 | 64.7 | 79.7 | 12 / 35 | 3844 |
| 3 | 2 | 64.5 | 79.7 | 12 / 35 | 3623 |
| 4 | 2 | 64.4 | 77.5 | 8 / 35 | 4261 |
| 5 | 3 | 63.9 | 74.9 | 10 / 35 | 4033 |
| 6 | 1 | 66.4 | 85.1 | 11 / 35 | 4202 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 64 | 39% |
| kc.micro.Figment 1.0 | 23 | 74% |
| yagami.Tidus 0.11 | 12 | 83% |
| mc2.enemy.Original 0.9 | 12 | 75% |
| pedersen.Grishnakh 1.0 | 3 | 33% |
| step.nanoPri 1.0 | 1 | 100% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 956. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 40% | 83 |
| kc.micro.Figment 1.0 | 25 | 17% | 45 |
| mc2.enemy.Original 0.9 | 18 | 12% | 24 |
| pedersen.Grishnakh 1.0 | 15 | 10% | 14 |
| yagami.Tidus 0.11 | 12 | 8% | 23 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| dft.Calliope 5.6 | 5 | 3% | 6 |
| step.nanoPri 1.0 | 5 | 3% | 6 |
| rdm.Dueler 0.4x | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 94.7 | 165 / 210 | 1.48 | 20.1% | 31724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.1% | 165 |
| ne.Chimera 1.2 | 2.5 | 13.3% | 10 |
| DTF.Kludgy 1.2b | 2.5 | 13.9% | 22 |
| ejb.Polaris 1.0.1 | 4.7 | 11.2% | 7 |
| tvv.micro.Antares 1.1.1 | 5.0 | 10.3% | 3 |
| vStar.RAFzilla 2.15 | 5.3 | 9.8% | 2 |
| kurios.DOSexe .9b | 7.5 | 5.9% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 7.7 | 5.8% | 0 |
| sam.Samspin 1.0 | 9.0 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.0 | 29 / 35 | 4932 |
| 2 | 1 | 71.0 | 95.9 | 29 / 35 | 5464 |
| 3 | 1 | 71.1 | 96.5 | 29 / 35 | 5665 |
| 4 | 1 | 70.2 | 94.0 | 26 / 35 | 5496 |
| 5 | 1 | 69.6 | 94.3 | 24 / 35 | 4982 |
| 6 | 1 | 70.0 | 93.7 | 28 / 35 | 5185 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 64 | 83% |
| ne.Chimera 1.2 | 37 | 78% |
| ejb.Polaris 1.0.1 | 34 | 94% |
| vStar.RAFzilla 2.15 | 27 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 43% | 69 |
| ne.Chimera 1.2 | 10 | 22% | 42 |
| ejb.Polaris 1.0.1 | 8 | 17% | 46 |
| vStar.RAFzilla 2.15 | 4 | 9% | 22 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 16 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| kurios.DOSexe .9b | 0 | 0% | 5 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.4 | 99 / 210 | 2.50 | 17.4% | 26260 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.3 | 17.4% | 99 |
| rz.Aleph 0.34 | 1.7 | 16.5% | 67 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.6% | 12 |
| djc.DynaBot 0.1.1 | 4.3 | 10.5% | 9 |
| rdt199.Warlord 0.73 | 5.0 | 9.5% | 11 |
| br2.MobyDickBot 1.6 | 5.7 | 9.1% | 8 |
| uji.YellohFellah 1.0 | 7.0 | 7.6% | 4 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.1% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 4.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 76.8 | 14 / 35 | 4090 |
| 2 | 1 | 66.5 | 84.1 | 14 / 35 | 4496 |
| 3 | 1 | 68.0 | 87.0 | 18 / 35 | 4647 |
| 4 | 1 | 68.3 | 87.9 | 20 / 35 | 4530 |
| 5 | 2 | 65.3 | 79.4 | 14 / 35 | 4186 |
| 6 | 1 | 67.1 | 85.1 | 19 / 35 | 4311 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 72 | 56% |
| cx.mini.Nimrod 0.55 | 32 | 81% |
| rdt199.Warlord 0.73 | 15 | 87% |
| djc.DynaBot 0.1.1 | 14 | 86% |
| uji.YellohFellah 1.0 | 4 | 100% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 62 | 55% | 103 |
| cx.mini.Nimrod 0.55 | 19 | 17% | 36 |
| rdt199.Warlord 0.73 | 7 | 6% | 25 |
| djc.DynaBot 0.1.1 | 6 | 5% | 18 |
| br2.MobyDickBot 1.6 | 6 | 5% | 9 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 7 |
| uji.YellohFellah 1.0 | 2 | 2% | 7 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 2 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F12

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 88.1 | 136 / 210 | 2.07 | 18.4% | 23878 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 18.4% | 136 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.0% | 21 |
| nat.PallasHawk 1.0 | 3.0 | 12.8% | 23 |
| darkcanuck.Leon 1.01 | 3.8 | 12.0% | 16 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.3% | 9 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 0 |
| jp.Perpy 16.0 | 8.0 | 6.4% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 96.2 | 28 / 35 | 4359 |
| 2 | 1 | 67.4 | 85.4 | 23 / 35 | 3949 |
| 3 | 1 | 66.7 | 86.7 | 19 / 35 | 3912 |
| 4 | 1 | 65.3 | 81.6 | 19 / 35 | 3560 |
| 5 | 1 | 69.3 | 91.4 | 24 / 35 | 4183 |
| 6 | 1 | 67.7 | 87.6 | 23 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 51 | 94% |
| nat.PallasHawk 1.0 | 47 | 83% |
| darkcanuck.Leon 1.01 | 32 | 88% |
| brainfade.melee.Genghis 0.36 | 14 | 86% |
| jrm.Test0 1.0 | 5 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 0% |

Hadur died in 74 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 20 | 27% | 60 |
| nat.PallasHawk 1.0 | 16 | 22% | 54 |
| darkcanuck.Leon 1.01 | 12 | 16% | 44 |
| brainfade.melee.Genghis 0.36 | 10 | 14% | 19 |
| jrm.Test0 1.0 | 6 | 8% | 10 |
| cs.sheldor.Talon 1.1 | 3 | 4% | 6 |
| jp.Perpy 16.0 | 3 | 4% | 5 |
| jaybot.bots.Oddball 4.0 | 2 | 3% | 6 |
| stuff.Vlad 0.1 | 2 | 3% | 5 |

## Melee bench: F13

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.4 | 88 / 210 | 2.22 | 17.0% | 25341 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.5 | 17.1% | 43 |
| hadur117.mini.DeiseWARM4 0.4 | 2.0 | 17.0% | 88 |
| mn.Combat 3.25.0 | 2.5 | 16.5% | 71 |
| shinh.Entangled 0.3 | 4.2 | 11.5% | 7 |
| gh.micro.Gruweltje 0.7 | 4.8 | 10.7% | 1 |
| apc.Colossus2 0.17 | 6.0 | 7.6% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.7% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.1% | 0 |
| maribo.FollowFire 1 | 9.3 | 4.2% | 0 |
| sample.Tracker 1.0 | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 85.1 | 14 / 35 | 4370 |
| 2 | 3 | 65.5 | 81.9 | 10 / 35 | 4202 |
| 3 | 1 | 68.9 | 92.4 | 21 / 35 | 4513 |
| 4 | 2 | 66.7 | 86.7 | 14 / 35 | 4149 |
| 5 | 1 | 67.5 | 87.3 | 17 / 35 | 4409 |
| 6 | 3 | 65.8 | 85.1 | 12 / 35 | 3698 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 65 | 65% |
| mn.Combat 3.25.0 | 54 | 50% |
| shinh.Entangled 0.3 | 18 | 78% |
| gh.micro.Gruweltje 0.7 | 3 | 100% |
| apc.Colossus2 0.17 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 45% | 86 |
| ags.Glacier 0.2.11 | 49 | 40% | 84 |
| shinh.Entangled 0.3 | 10 | 8% | 24 |
| gh.micro.Gruweltje 0.7 | 4 | 3% | 11 |
| stelo.Wang 1.0 | 2 | 2% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| apc.Colossus2 0.17 | 0 | 0% | 1 |

## Melee bench: F14

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.4 | 161 / 210 | 1.50 | 20.3% | 32332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.3% | 161 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 21 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.9% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 4.2 | 10.0% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.3% | 1 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 9.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.5% | 3 |
| pa.Improved 1.0 | 9.0 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.0 | 26 / 35 | 5123 |
| 2 | 1 | 71.0 | 95.6 | 26 / 35 | 5529 |
| 3 | 1 | 70.9 | 94.3 | 30 / 35 | 5418 |
| 4 | 1 | 70.0 | 92.4 | 26 / 35 | 5030 |
| 5 | 1 | 71.0 | 94.6 | 26 / 35 | 5599 |
| 6 | 1 | 71.3 | 95.9 | 27 / 35 | 5633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 93% |
| catcat20.shape.Theta 0.018 | 54 | 72% |
| sheldor.micro.PointInLineRRAL 1.0 | 14 | 93% |
| sanyi.mikrobi.Roberto 1.0 | 8 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 19 | 38% | 54 |
| simonton.micro.Sprout 1.1.3 | 17 | 34% | 101 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 12% | 22 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 8% | 10 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 3 |
| pa.Improved 1.0 | 0 | 0% | 1 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 81.0 | 96 / 210 | 2.71 | 17.5% | 29975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 17.5% | 96 |
| emp.Yngwie 1.11 | 2.5 | 13.2% | 48 |
| kawigi.micro.Shiz 1.1 | 3.2 | 13.0% | 14 |
| mld.DustBunny 3.8 | 3.5 | 12.0% | 14 |
| kawigi.robot.Girl 1.2 | 5.3 | 10.5% | 31 |
| cb.nano.Insomnia 1.0 | 5.5 | 10.5% | 6 |
| lambdaxy.TBot 0.1 | 7.2 | 7.4% | 0 |
| Grystrion.TrackerWO 1.0 | 8.2 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.1% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 80.0 | 12 / 35 | 5013 |
| 2 | 1 | 67.8 | 84.8 | 20 / 35 | 5000 |
| 3 | 1 | 63.8 | 72.1 | 13 / 35 | 4603 |
| 4 | 1 | 67.3 | 83.2 | 17 / 35 | 5145 |
| 5 | 1 | 67.1 | 82.5 | 16 / 35 | 5004 |
| 6 | 1 | 67.6 | 83.5 | 18 / 35 | 5210 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 42 | 62% |
| kawigi.robot.Girl 1.2 | 29 | 66% |
| mld.DustBunny 3.8 | 17 | 88% |
| cb.nano.Insomnia 1.0 | 17 | 100% |
| kawigi.micro.Shiz 1.1 | 16 | 75% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 908. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 32% | 73 |
| mld.DustBunny 3.8 | 19 | 17% | 40 |
| kawigi.robot.Girl 1.2 | 18 | 16% | 26 |
| kawigi.micro.Shiz 1.1 | 15 | 13% | 35 |
| cb.nano.Insomnia 1.0 | 14 | 12% | 18 |
| Grystrion.TrackerWO 1.0 | 6 | 5% | 6 |
| lambdaxy.TBot 0.1 | 4 | 3% | 6 |
| divineomega.TrialBot 0.003 | 2 | 2% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.9 | 100 / 210 | 2.45 | 18.3% | 32227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.2 | 18.3% | 100 |
| gh.Griezel 0.5.2 | 1.8 | 16.2% | 56 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.9% | 34 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.5% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.7% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.1% | 6 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 5.3% | 5 |
| repositorio.NanoStep 1.0 | 9.3 | 4.5% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.0 | 12 / 35 | 5469 |
| 2 | 1 | 69.4 | 87.0 | 20 / 35 | 5389 |
| 3 | 2 | 65.4 | 77.1 | 12 / 35 | 4736 |
| 4 | 1 | 68.1 | 81.9 | 17 / 35 | 5601 |
| 5 | 1 | 70.0 | 89.5 | 20 / 35 | 5581 |
| 6 | 1 | 68.9 | 86.7 | 19 / 35 | 5451 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 76 | 57% |
| techdude.forest.FlamingForest 1.1 | 25 | 56% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 100% |
| bvh.fnr.Fenrir 0.36l | 11 | 100% |
| divineomega.DivineBot 1.9.4.5 | 9 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 4 | 75% |

Hadur died in 110 of 210 rounds, at a mean tick of 1243. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 51 | 46% | 95 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 20 | 18% | 41 |
| techdude.forest.FlamingForest 1.1 | 12 | 11% | 24 |
| bvh.fnr.Fenrir 0.36l | 12 | 11% | 17 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 9 |
| divineomega.DivineBot 1.9.4.5 | 4 | 4% | 13 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 5 |
| repositorio.NanoStep 1.0 | 1 | 1% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |

## Melee bench: F17

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.2 | 95 / 210 | 2.60 | 17.4% | 29251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 17.4% | 95 |
| et.Predator 1.8 | 2.3 | 14.1% | 27 |
| oog.melee.Mercutio 1.0 | 3.3 | 12.7% | 33 |
| cx.BlestPain 1.41 | 3.7 | 12.4% | 35 |
| nic.Nicator 2.4 | 4.8 | 11.3% | 9 |
| ahf.NanoAndrew .4 | 5.8 | 10.3% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 8.9% | 2 |
| tex.Longbot 0.4 | 8.3 | 5.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.2% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 79.7 | 13 / 35 | 4646 |
| 2 | 1 | 67.0 | 82.9 | 15 / 35 | 4667 |
| 3 | 1 | 68.0 | 83.2 | 19 / 35 | 5084 |
| 4 | 1 | 64.1 | 76.2 | 11 / 35 | 4333 |
| 5 | 1 | 68.6 | 86.3 | 18 / 35 | 5238 |
| 6 | 1 | 68.6 | 85.1 | 19 / 35 | 5283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 44 | 82% |
| oog.melee.Mercutio 1.0 | 33 | 67% |
| cx.BlestPain 1.41 | 24 | 38% |
| nic.Nicator 2.4 | 16 | 75% |
| ahf.NanoAndrew .4 | 12 | 100% |
| maribo.melee.BMV 0.1 | 4 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 1042. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 33 | 29% | 45 |
| et.Predator 1.8 | 24 | 21% | 59 |
| oog.melee.Mercutio 1.0 | 22 | 19% | 42 |
| ahf.NanoAndrew .4 | 13 | 11% | 26 |
| nic.Nicator 2.4 | 12 | 10% | 24 |
| maribo.melee.BMV 0.1 | 9 | 8% | 12 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 88.2 | 132 / 210 | 2.06 | 18.4% | 25813 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 18.4% | 132 |
| morbid.MorbidPriest 1.0 | 2.2 | 12.4% | 21 |
| agd.Mooserwirt2 2.7 | 2.8 | 11.8% | 25 |
| uji.DBH 1.1 | 4.5 | 10.9% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 10.4% | 4 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.5% | 4 |
| sigterm.Sigterm 1.0 | 7.0 | 8.1% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.4% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 5.9% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 89.8 | 25 / 35 | 4097 |
| 2 | 1 | 66.6 | 87.0 | 19 / 35 | 4017 |
| 3 | 1 | 67.4 | 89.2 | 20 / 35 | 4284 |
| 4 | 1 | 69.5 | 92.1 | 27 / 35 | 4768 |
| 5 | 1 | 68.2 | 88.9 | 23 / 35 | 4650 |
| 6 | 1 | 65.6 | 82.2 | 18 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 48 | 83% |
| agd.Mooserwirt2 2.7 | 34 | 62% |
| uji.DBH 1.1 | 23 | 91% |
| sigterm.Sigterm 1.0 | 15 | 87% |
| spinnercat.Robovirus 2.718 | 13 | 85% |
| ratosh.Nobo 0.21 | 12 | 100% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 30% | 64 |
| agd.Mooserwirt2 2.7 | 20 | 25% | 44 |
| uji.DBH 1.1 | 9 | 11% | 25 |
| ratosh.Nobo 0.21 | 8 | 10% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 6% | 11 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 11 |
| sigterm.Sigterm 1.0 | 3 | 4% | 18 |
| stelo.WangRobot 1.0 | 3 | 4% | 9 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 3 | 4% | 5 |

## Melee bench: F19

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.8 | 95.2 | 163 / 210 | 1.43 | 20.8% | 33042 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.8% | 163 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.8% | 20 |
| mld.Infinity 2.2 | 2.7 | 13.6% | 21 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.0% | 3 |
| erdnis.Rover 0.3 | 4.8 | 10.8% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.8% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 0 |
| pac.ABC 2.1 | 7.7 | 6.9% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 92.1 | 23 / 35 | 5277 |
| 2 | 1 | 72.0 | 96.5 | 28 / 35 | 5569 |
| 3 | 1 | 71.4 | 94.0 | 25 / 35 | 5409 |
| 4 | 1 | 72.3 | 96.2 | 30 / 35 | 5410 |
| 5 | 1 | 71.8 | 94.9 | 27 / 35 | 5658 |
| 6 | 1 | 72.6 | 97.5 | 30 / 35 | 5719 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 89 | 88% |
| mld.Infinity 2.2 | 65 | 83% |
| krillr.mini.JointStrike 2.0.0 | 12 | 92% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| erdnis.Rover 0.3 | 7 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 1305. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 22 | 47% | 109 |
| mld.Infinity 2.2 | 16 | 34% | 28 |
| krillr.mini.JointStrike 2.0.0 | 7 | 15% | 21 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 16 |
| erdnis.Rover 0.3 | 1 | 2% | 15 |
| mbh.Mbh 0.1 | 0 | 0% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 1 |

## Melee bench: F20

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.5 | 137 / 210 | 1.86 | 19.9% | 32452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.9% | 137 |
| trm.Wrekt 1.1.6.f | 2.0 | 14.9% | 26 |
| nz.jdc.nano.GridFu 1.0 | 3.2 | 11.7% | 8 |
| fwb.Nine 1.0.1 | 4.2 | 10.8% | 17 |
| catcat20.Rabbit 0.001 | 4.7 | 10.3% | 16 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.7% | 4 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 7.6% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.0% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.2 | 23 / 35 | 5397 |
| 2 | 1 | 70.1 | 90.8 | 22 / 35 | 5500 |
| 3 | 1 | 67.7 | 84.1 | 18 / 35 | 5045 |
| 4 | 1 | 69.4 | 89.5 | 20 / 35 | 5293 |
| 5 | 1 | 71.2 | 94.3 | 27 / 35 | 5588 |
| 6 | 1 | 71.2 | 94.0 | 27 / 35 | 5629 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 89% |
| fwb.Nine 1.0.1 | 38 | 79% |
| catcat20.Rabbit 0.001 | 25 | 72% |
| nz.jdc.nano.GridFu 1.0 | 15 | 87% |
| bayen.nut.Squirrel 1.615 | 7 | 71% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 67% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 1195. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 23 | 31% | 66 |
| catcat20.Rabbit 0.001 | 16 | 22% | 40 |
| nz.jdc.nano.GridFu 1.0 | 14 | 19% | 47 |
| fwb.Nine 1.0.1 | 13 | 18% | 16 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 12 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 11 |
| djdjdj.NanoSkunk10 1.0 | 2 | 3% | 9 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 7 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 94.4 | 148 / 210 | 1.50 | 20.4% | 32420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.4% | 148 |
| eem.EvBot v4.6.16 | 2.0 | 15.8% | 49 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.7% | 5 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 4 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.2% | 1 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 3 |
| fire219.CatBot 1.0 | 7.5 | 6.0% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.3% | 0 |
| arthord.MannyPacquiao Beta | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 93.7 | 24 / 35 | 5403 |
| 2 | 1 | 70.2 | 92.4 | 25 / 35 | 4973 |
| 3 | 1 | 70.7 | 94.6 | 23 / 35 | 5341 |
| 4 | 1 | 72.0 | 96.2 | 25 / 35 | 5773 |
| 5 | 1 | 71.2 | 94.6 | 25 / 35 | 5444 |
| 6 | 1 | 71.5 | 94.9 | 26 / 35 | 5486 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 112 | 65% |
| dummy.mini.Scimitar 1.01 | 45 | 98% |
| eld.Hmm 1.0 | 15 | 93% |
| cf.RiO.RiOx 4.2.1 | 14 | 93% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 1487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 42 | 66% | 91 |
| dummy.mini.Scimitar 1.01 | 12 | 19% | 67 |
| cf.RiO.RiOx 4.2.1 | 6 | 9% | 19 |
| eld.Hmm 1.0 | 1 | 2% | 25 |
| oa.weak.BotherBot 0.1 | 1 | 2% | 5 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| arthord.MannyPacquiao Beta | 1 | 2% | 1 |
| el.JumpShoot 0.2 | 0 | 0% | 1 |

## Melee bench: F22

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.3 | 112 / 210 | 2.05 | 18.5% | 29733 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 18.5% | 112 |
| pe.SandboxDT 2.71m | 2.2 | 16.3% | 56 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.9% | 24 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.6% | 13 |
| bigpete.Stewie 1.0 | 4.8 | 10.2% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.8% | 1 |
| tad.Dalek98 0.98 | 6.8 | 6.6% | 2 |
| gg.Squaraus 0.6 | 7.5 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 20 / 35 | 4739 |
| 2 | 1 | 69.6 | 90.5 | 20 / 35 | 5033 |
| 3 | 1 | 67.7 | 85.4 | 18 / 35 | 4910 |
| 4 | 1 | 69.0 | 87.3 | 21 / 35 | 5007 |
| 5 | 1 | 69.4 | 90.5 | 18 / 35 | 4953 |
| 6 | 1 | 68.3 | 87.6 | 15 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 53 | 79% |
| pe.SandboxDT 2.71m | 46 | 52% |
| jlm.javaDisturbance 0.59 | 38 | 82% |
| bigpete.Stewie 1.0 | 9 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 41% | 73 |
| kvk.HebusLeTroll 0.35 | 25 | 26% | 60 |
| jlm.javaDisturbance 0.59 | 22 | 22% | 52 |
| tad.Dalek98 0.98 | 5 | 5% | 5 |
| bigpete.Stewie 1.0 | 4 | 4% | 10 |
| pbg.NinjaX 1.2 | 1 | 1% | 5 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.4 | 134 / 210 | 1.87 | 19.2% | 29431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.2 | 19.2% | 134 |
| pe.SandboxLump 1.52 | 1.8 | 17.3% | 53 |
| cre.Karolos 0.32 | 3.0 | 13.4% | 13 |
| stelo.AreaTargetingBot 1.1 | 4.5 | 10.5% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.4% | 1 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.8% | 4 |
| cw.megas.Blade 0.8 | 6.3 | 8.3% | 0 |
| sample.Walls 1.0 | 7.7 | 7.8% | 2 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 21 / 35 | 4927 |
| 2 | 1 | 69.9 | 91.1 | 22 / 35 | 4486 |
| 3 | 2 | 69.1 | 86.0 | 20 / 35 | 4984 |
| 4 | 1 | 70.4 | 94.0 | 24 / 35 | 4632 |
| 5 | 1 | 71.1 | 92.1 | 26 / 35 | 5197 |
| 6 | 1 | 70.1 | 90.2 | 21 / 35 | 5205 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 90 | 72% |
| cre.Karolos 0.32 | 33 | 85% |
| stelo.AreaTargetingBot 1.1 | 16 | 100% |
| sample.Walls 1.0 | 9 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 5 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 46 | 61% | 114 |
| cre.Karolos 0.32 | 14 | 18% | 43 |
| stelo.AreaTargetingBot 1.1 | 8 | 11% | 15 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 5% | 8 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 14 |
| sample.Walls 1.0 | 2 | 3% | 7 |
| cw.megas.Blade 0.8 | 0 | 0% | 6 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 77.1 | 73 / 210 | 3.06 | 15.2% | 20702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.5 | 15.2% | 73 |
| rz.GlowBlowMelee 1.4 | 2.3 | 13.8% | 32 |
| florent.XSeries.X2 0.12 | 2.8 | 13.8% | 39 |
| davidalves.Phoenix 0.54 | 3.7 | 12.8% | 38 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.8% | 21 |
| oog.melee.Corsair 1.0 | 6.2 | 9.0% | 1 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.1% | 7 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.4% | 0 |
| evd.X1 0.01 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.3 | 67.6 | 7 / 35 | 3015 |
| 2 | 1 | 64.7 | 79.7 | 15 / 35 | 3626 |
| 3 | 1 | 64.9 | 82.2 | 12 / 35 | 3742 |
| 4 | 1 | 62.9 | 77.1 | 14 / 35 | 3291 |
| 5 | 1 | 63.6 | 80.3 | 14 / 35 | 3479 |
| 6 | 1 | 62.6 | 75.9 | 11 / 35 | 3549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| florent.XSeries.X2 0.12 | 26 | 62% |
| rz.GlowBlowMelee 1.4 | 24 | 63% |
| davidalves.Phoenix 0.54 | 23 | 52% |
| stelo.SoJNanoMelee 1.1 | 18 | 89% |
| pedersen.Ugluk 1.1.1 | 17 | 53% |
| oog.melee.Corsair 1.0 | 2 | 100% |
| evd.X1 0.01 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 32 | 23% | 47 |
| rz.GlowBlowMelee 1.4 | 29 | 21% | 50 |
| davidalves.Phoenix 0.54 | 29 | 21% | 43 |
| pedersen.Ugluk 1.1.1 | 28 | 20% | 34 |
| stelo.SoJNanoMelee 1.1 | 8 | 6% | 15 |
| oog.melee.Corsair 1.0 | 5 | 4% | 9 |
| as.FrankTheTank 1.3 | 2 | 1% | 5 |
| lunchie.Lunchbox 0.93 | 2 | 1% | 4 |
| evd.X1 0.01 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.5 | 154 / 210 | 1.94 | 19.3% | 25753 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.3% | 154 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.6% | 14 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.0% | 15 |
| jdw.Hurricane 1.4 | 4.0 | 10.9% | 11 |
| ds.Oo 2.2 | 6.0 | 8.2% | 5 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.8% | 5 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.8% | 4 |
| awesomeness.Elite 1.0 | 7.8 | 6.7% | 1 |
| adt.Ar2 1.1 | 8.2 | 6.9% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 88.6 | 25 / 35 | 4389 |
| 2 | 1 | 69.2 | 91.1 | 25 / 35 | 4296 |
| 3 | 1 | 68.7 | 88.3 | 27 / 35 | 3886 |
| 4 | 1 | 68.1 | 85.7 | 25 / 35 | 4543 |
| 5 | 1 | 69.1 | 90.8 | 27 / 35 | 3970 |
| 6 | 1 | 70.0 | 92.7 | 25 / 35 | 4669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 58 | 90% |
| voidious.mini.BrokenSword 2.0.3 | 52 | 94% |
| jdw.Hurricane 1.4 | 30 | 97% |
| gjr.Cephalosporin 0.1 | 8 | 100% |
| ds.Oo 2.2 | 5 | 80% |
| gre.svman4.Morfeas 1.4.1 | 5 | 80% |
| adt.Ar2 1.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 2 | 50% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 598. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 36% | 67 |
| jdw.Hurricane 1.4 | 11 | 20% | 41 |
| voidious.mini.BrokenSword 2.0.3 | 9 | 16% | 56 |
| ds.Oo 2.2 | 6 | 11% | 11 |
| gjr.Cephalosporin 0.1 | 3 | 5% | 12 |
| gre.svman4.Morfeas 1.4.1 | 2 | 4% | 7 |
| amk.ChumbaMini 0.2 | 2 | 4% | 5 |
| awesomeness.Elite 1.0 | 2 | 4% | 4 |
| adt.Ar2 1.1 | 1 | 2% | 7 |

## Melee bench: F26

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.9 | 131 / 210 | 1.82 | 19.3% | 32304 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.3% | 131 |
| ak.Fermat 2.0 | 2.0 | 14.4% | 30 |
| shu.nitro.LENIN .T34 | 3.5 | 12.5% | 27 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 14 |
| js.PinBall 1.6 | 5.3 | 10.4% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.4% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 9.0% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.8 | 6.7% | 1 |
| sample.SpinBot 1.0 | 8.8 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 21 / 35 | 5164 |
| 2 | 1 | 70.7 | 91.4 | 24 / 35 | 5840 |
| 3 | 1 | 70.5 | 94.9 | 26 / 35 | 5244 |
| 4 | 1 | 69.7 | 90.8 | 20 / 35 | 5487 |
| 5 | 1 | 69.4 | 89.8 | 22 / 35 | 5198 |
| 6 | 1 | 69.2 | 88.9 | 18 / 35 | 5371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 54 | 74% |
| shu.nitro.LENIN .T34 | 44 | 70% |
| lrem.Spectre 0.4.4 | 43 | 86% |
| js.PinBall 1.6 | 11 | 91% |
| jaybot.adv.bots.JayBot 2.0 | 8 | 88% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 75% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |
| logiblocs.SittingDroid 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 25 | 31% | 64 |
| shu.nitro.LENIN .T34 | 24 | 30% | 63 |
| lrem.Spectre 0.4.4 | 20 | 25% | 47 |
| js.PinBall 1.6 | 6 | 8% | 18 |
| jaybot.adv.bots.JayBot 2.0 | 3 | 4% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 3 |
| gh.mini.GrubbmOne 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.7 | 135 / 210 | 2.10 | 19.0% | 29408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.2 | 19.0% | 135 |
| mk.Alpha 0.2.1 | 2.5 | 13.3% | 34 |
| wee.Gem 1.8.4 | 3.5 | 11.7% | 22 |
| EH.Eagle 1.0.6 | 3.7 | 11.6% | 9 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.6% | 9 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 8.9% | 0 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.5% | 2 |
| joe.ADinosaur 1.0 | 7.7 | 7.1% | 0 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 94.9 | 24 / 35 | 4523 |
| 2 | 1 | 69.6 | 95.9 | 28 / 35 | 4195 |
| 3 | 1 | 69.0 | 91.7 | 22 / 35 | 4600 |
| 4 | 1 | 68.3 | 76.8 | 21 / 35 | 5730 |
| 5 | 1 | 71.0 | 86.3 | 25 / 35 | 6171 |
| 6 | 2 | 65.1 | 80.6 | 15 / 35 | 4189 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 72 | 81% |
| wee.Gem 1.8.4 | 30 | 77% |
| EH.Eagle 1.0.6 | 22 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 90% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| throxbot.ThroxBot 0.1 | 4 | 75% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 26 | 35% | 75 |
| wee.Gem 1.8.4 | 12 | 16% | 37 |
| EH.Eagle 1.0.6 | 7 | 9% | 30 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 9% | 24 |
| throxbot.ThroxBot 0.1 | 7 | 9% | 14 |
| techdude.kombat.FlamingKombat 1.5 | 6 | 8% | 15 |
| joe.ADinosaur 1.0 | 6 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 3 |
| cs.Grudge 1.0 | 2 | 3% | 2 |

## Melee bench: F28

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 92.9 | 152 / 210 | 1.64 | 19.7% | 27422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.7% | 152 |
| kid.test.NightFox .2 | 2.0 | 15.5% | 31 |
| uji.Antique 1.0 | 3.5 | 11.1% | 12 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.1% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.6% | 4 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.4% | 0 |
| ahr.ice.Ice 1.0.2 | 6.5 | 8.2% | 4 |
| matt.advanced.Katana 1.0 | 8.5 | 5.9% | 0 |
| stelo.PianistNano 1.2 | 8.8 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.2 | 25 / 35 | 4371 |
| 2 | 1 | 70.8 | 94.9 | 28 / 35 | 4860 |
| 3 | 1 | 69.1 | 93.0 | 21 / 35 | 4368 |
| 4 | 1 | 70.0 | 92.7 | 26 / 35 | 4679 |
| 5 | 1 | 69.9 | 93.0 | 27 / 35 | 4601 |
| 6 | 1 | 69.7 | 93.7 | 25 / 35 | 4543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 95 | 84% |
| uji.Antique 1.0 | 37 | 89% |
| qohnil.blot.BlotBot 3.61 | 19 | 84% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 5 | 60% |
| stelo.PianistNano 1.2 | 2 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 774. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 48% | 98 |
| uji.Antique 1.0 | 11 | 19% | 43 |
| pfvicm.Sobieski 7.2.3b | 7 | 12% | 15 |
| qohnil.blot.BlotBot 3.61 | 5 | 9% | 22 |
| ahr.ice.Ice 1.0.2 | 5 | 9% | 14 |
| amk.ChumbaWumba 0.3 | 1 | 2% | 10 |
| matt.advanced.Katana 1.0 | 1 | 2% | 6 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.5 | 120 / 210 | 2.13 | 18.9% | 28141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 18.9% | 120 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.8% | 32 |
| deewiant.Anomaly 0.2 | 2.8 | 14.1% | 31 |
| myl.micro.Troodon 1.10 | 4.0 | 12.4% | 10 |
| jok.PheonixM 0.1.2 | 4.8 | 10.3% | 12 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 1 |
| DBall.Anarchy 0.1 | 7.0 | 6.8% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.6% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.1 | 24 / 35 | 4881 |
| 2 | 1 | 65.9 | 80.0 | 15 / 35 | 4116 |
| 3 | 1 | 69.9 | 88.3 | 22 / 35 | 4983 |
| 4 | 1 | 68.9 | 87.3 | 18 / 35 | 4842 |
| 5 | 1 | 70.0 | 90.8 | 23 / 35 | 4767 |
| 6 | 1 | 68.3 | 87.3 | 18 / 35 | 4552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 61 | 80% |
| deewiant.Anomaly 0.2 | 54 | 74% |
| myl.micro.Troodon 1.10 | 18 | 94% |
| jok.PheonixM 0.1.2 | 9 | 67% |
| jangs.ns51 1.0 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 37 | 41% | 79 |
| zyx.mega.YersiniaPestis 3.1 | 24 | 26% | 66 |
| jok.PheonixM 0.1.2 | 14 | 15% | 23 |
| myl.micro.Troodon 1.10 | 11 | 12% | 27 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 6 |
| DBall.Anarchy 0.1 | 1 | 1% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 3 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.4 | 59 / 210 | 3.12 | 15.1% | 22429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.5 | 15.1% | 59 |
| darkcanuck.B26354 1.06 | 2.5 | 13.8% | 47 |
| catcat20.Matcha 0.006 | 3.5 | 13.5% | 34 |
| oog.melee.Capulet 1.2 | 3.5 | 13.1% | 35 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.9% | 22 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.5% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.6% | 7 |
| tripphippy.Alice 1.1 | 7.8 | 7.0% | 1 |
| ntc.Opposite 1.5 | 8.0 | 7.1% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.8 | 77.5 | 12 / 35 | 3961 |
| 2 | 1 | 62.0 | 73.3 | 11 / 35 | 3464 |
| 3 | 1 | 64.5 | 80.0 | 11 / 35 | 3954 |
| 4 | 1 | 64.7 | 79.7 | 9 / 35 | 4108 |
| 5 | 4 | 59.8 | 67.6 | 7 / 35 | 3245 |
| 6 | 1 | 63.8 | 80.3 | 9 / 35 | 3697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 61% |
| darkcanuck.B26354 1.06 | 28 | 46% |
| stelo.PastFuture 2.3.2 | 19 | 68% |
| oog.melee.Capulet 1.2 | 18 | 56% |
| intruder.PrairieWolf 2.61 | 3 | 67% |
| tripphippy.Alice 1.1 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |

Hadur died in 151 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 37 | 25% | 48 |
| oog.melee.Capulet 1.2 | 30 | 20% | 38 |
| stelo.PastFuture 2.3.2 | 29 | 19% | 43 |
| catcat20.Matcha 0.006 | 28 | 19% | 46 |
| ntc.Opposite 1.5 | 9 | 6% | 10 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 9 |
| tripphippy.Alice 1.1 | 7 | 5% | 10 |
| intruder.PrairieWolf 2.61 | 3 | 2% | 6 |

## Melee bench: F31

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 74.8 | 50 / 210 | 3.27 | 14.7% | 20677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 92 |
| hadur117.mini.DeiseWARM4 0.4 | 2.2 | 14.7% | 50 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 54 |
| d414.nano.Quantum 1.0.0 | 4.0 | 11.9% | 6 |
| spinnercat.micro.Tyger 0.1 | 5.2 | 10.5% | 5 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.2% | 3 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.1% | 1 |
| fm.mammillarias 1.3 | 8.2 | 5.6% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.7% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 77.1 | 6 / 35 | 3361 |
| 2 | 2 | 62.9 | 74.9 | 10 / 35 | 3443 |
| 3 | 3 | 62.4 | 74.3 | 8 / 35 | 3315 |
| 4 | 2 | 63.4 | 75.6 | 9 / 35 | 3868 |
| 5 | 2 | 60.9 | 72.1 | 7 / 35 | 2967 |
| 6 | 2 | 63.1 | 74.9 | 10 / 35 | 3723 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 58 | 50% |
| gh.mini.Griezel 0.2 | 28 | 32% |
| spinnercat.micro.Tyger 0.1 | 7 | 71% |
| d414.nano.Quantum 1.0.0 | 7 | 86% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 55 | 34% | 69 |
| abc.Shadow 3.84i | 49 | 30% | 72 |
| d414.nano.Quantum 1.0.0 | 21 | 13% | 23 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 24 |
| timmit.nano.TimDog 0.33 | 5 | 3% | 7 |
| gh.nano.Grofvuil 0.2 | 4 | 2% | 7 |
| fm.mammillarias 1.3 | 4 | 2% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |

## Melee bench: F32

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.5 | 127 / 210 | 1.85 | 19.0% | 29222 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.0% | 127 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.1% | 50 |
| apc.botM 3.0 | 3.2 | 11.7% | 17 |
| lxx.ConceptA 0.8 | 4.0 | 10.4% | 7 |
| vjik.UnViolation 1.1 | 5.7 | 8.9% | 4 |
| bayen.UbaMicro 1.4 | 5.7 | 8.8% | 0 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 0 |
| yk.JahMicro 1.0 | 7.5 | 7.1% | 3 |
| conscience.Electron 1.3g | 9.0 | 6.0% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.0 | 27 / 35 | 5068 |
| 2 | 1 | 68.8 | 90.5 | 22 / 35 | 4861 |
| 3 | 1 | 67.7 | 86.7 | 20 / 35 | 4704 |
| 4 | 1 | 67.3 | 88.6 | 17 / 35 | 4694 |
| 5 | 1 | 68.9 | 92.4 | 21 / 35 | 4864 |
| 6 | 1 | 68.7 | 92.1 | 20 / 35 | 5031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 60% |
| apc.botM 3.0 | 27 | 74% |
| lxx.ConceptA 0.8 | 19 | 95% |
| vjik.UnViolation 1.1 | 12 | 92% |
| yk.JahMicro 1.0 | 9 | 89% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 5 | 80% |
| conscience.Electron 1.3g | 4 | 100% |
| bayen.UbaMicro 1.4 | 3 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 54% | 99 |
| lxx.ConceptA 0.8 | 13 | 15% | 25 |
| apc.botM 3.0 | 11 | 13% | 34 |
| panzer.Panzer 0.2 | 5 | 6% | 7 |
| bayen.UbaMicro 1.4 | 3 | 4% | 10 |
| yk.JahMicro 1.0 | 3 | 4% | 6 |
| conscience.Electron 1.3g | 2 | 2% | 8 |
| vjik.UnViolation 1.1 | 1 | 1% | 18 |
| donjezza.Jezza 1.0 | 1 | 1% | 3 |

## Melee bench: F33

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.9 | 134 / 210 | 2.09 | 19.2% | 29827 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.2% | 134 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 11.9% | 10 |
| labg.Cataclysm 2.05 | 4.0 | 10.8% | 20 |
| gre.svman4.Leonidas 1.3.2 | 5.0 | 10.2% | 10 |
| baal.nano.N 1.42 | 6.3 | 8.8% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 4 |
| zyx.micro.Ant 1.1 | 8.7 | 5.4% | 0 |
| sanja.First 0.1 | 8.7 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 85.7 | 24 / 35 | 4980 |
| 2 | 1 | 68.0 | 83.8 | 21 / 35 | 4861 |
| 3 | 1 | 68.5 | 87.3 | 20 / 35 | 4796 |
| 4 | 1 | 69.0 | 87.3 | 22 / 35 | 4872 |
| 5 | 1 | 70.5 | 91.7 | 23 / 35 | 5337 |
| 6 | 1 | 70.0 | 91.7 | 24 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 52 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 37 | 89% |
| labg.Cataclysm 2.05 | 27 | 70% |
| gre.svman4.Leonidas 1.3.2 | 25 | 92% |
| kinsen.melee.Angsaichmophobia 1.8c | 11 | 91% |
| baal.nano.N 1.42 | 3 | 100% |
| sanja.First 0.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 26 | 34% | 83 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 17% | 49 |
| labg.Cataclysm 2.05 | 13 | 17% | 28 |
| gre.svman4.Leonidas 1.3.2 | 10 | 13% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 9% | 10 |
| baal.nano.N 1.42 | 5 | 7% | 8 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 4 |

## Melee bench: F34

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.2 | 77 / 210 | 2.42 | 17.1% | 28141 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.5 | 17.1% | 77 |
| stelo.Spread 0.9 | 1.8 | 16.9% | 71 |
| kid.Gladiator .7.2 | 2.7 | 16.2% | 46 |
| jcs.Seth 1.8 | 4.3 | 11.1% | 12 |
| tcf.Reach 3 | 4.8 | 10.6% | 3 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.0% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.8 | 12 / 35 | 4734 |
| 2 | 1 | 68.5 | 88.3 | 17 / 35 | 4571 |
| 3 | 1 | 67.5 | 85.1 | 12 / 35 | 4941 |
| 4 | 1 | 67.3 | 84.4 | 11 / 35 | 4817 |
| 5 | 3 | 66.3 | 81.0 | 11 / 35 | 4559 |
| 6 | 2 | 66.7 | 82.5 | 14 / 35 | 4519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 69 | 49% |
| kid.Gladiator .7.2 | 32 | 56% |
| jcs.Seth 1.8 | 19 | 68% |
| tcf.Reach 3 | 6 | 100% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 135 of 210 rounds, at a mean tick of 1041. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 66 | 49% | 101 |
| kid.Gladiator .7.2 | 48 | 36% | 63 |
| jcs.Seth 1.8 | 9 | 7% | 22 |
| tcf.Reach 3 | 6 | 4% | 14 |
| ratosh.Wesco 1.4 | 3 | 2% | 5 |
| cli.Dancer 1.1 | 1 | 1% | 3 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 81.6 | 50 / 210 | 2.65 | 15.6% | 21006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 126 |
| hadur117.mini.DeiseWARM4 0.4 | 2.0 | 15.6% | 50 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.0% | 24 |
| rz.HawkOnFire 0.1 | 4.3 | 11.5% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.2% | 6 |
| wit.Chuliath 1.0 | 6.8 | 6.6% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.2% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.9% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 84.4 | 10 / 35 | 3504 |
| 2 | 2 | 61.1 | 73.3 | 5 / 35 | 3148 |
| 3 | 2 | 64.9 | 81.9 | 10 / 35 | 3771 |
| 4 | 2 | 65.3 | 84.8 | 9 / 35 | 3522 |
| 5 | 2 | 65.6 | 85.7 | 10 / 35 | 3613 |
| 6 | 2 | 63.2 | 79.7 | 6 / 35 | 3448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 95 | 24% |
| gh.mini.Gruwel 0.9 | 23 | 52% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 82% |
| rz.HawkOnFire 0.1 | 5 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |

Hadur died in 161 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 92 | 57% | 110 |
| gh.mini.Gruwel 0.9 | 32 | 20% | 46 |
| rz.HawkOnFire 0.1 | 14 | 9% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 13 | 8% | 23 |
| myl.nano.KomoriNinja 1.1 | 4 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.4 | 162 / 210 | 1.60 | 20.7% | 31546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.7% | 162 |
| bzdp.Pansy 2.1 | 2.8 | 11.9% | 12 |
| alpha.RainingFire 1.0 | 3.0 | 12.0% | 11 |
| mz.Cork 0.1 | 4.2 | 10.5% | 5 |
| bvh.micro.Freya 0.3 | 4.8 | 10.1% | 9 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.7% | 4 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.4% | 5 |
| dl.BetterWalls 1.0 | 8.3 | 6.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.6 | 25 / 35 | 5033 |
| 2 | 1 | 70.5 | 93.0 | 28 / 35 | 5194 |
| 3 | 1 | 72.0 | 96.8 | 30 / 35 | 5548 |
| 4 | 1 | 71.0 | 93.7 | 26 / 35 | 5367 |
| 5 | 1 | 69.8 | 91.1 | 26 / 35 | 4932 |
| 6 | 1 | 70.8 | 91.1 | 27 / 35 | 5472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 40 | 93% |
| alpha.RainingFire 1.0 | 34 | 88% |
| bvh.mini.Fenrir 0.39 | 27 | 100% |
| mz.Cork 0.1 | 25 | 92% |
| bvh.micro.Freya 0.3 | 25 | 88% |
| sample.MyFirstRobot 1.0 | 8 | 88% |
| m3thos.Eva02 0.7.1 | 8 | 100% |
| dl.BetterWalls 1.0 | 8 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 25% | 37 |
| bvh.micro.Freya 0.3 | 10 | 21% | 31 |
| bvh.mini.Fenrir 0.39 | 10 | 21% | 24 |
| bzdp.Pansy 2.1 | 8 | 17% | 58 |
| mz.Cork 0.1 | 3 | 6% | 28 |
| m3thos.Eva02 0.7.1 | 3 | 6% | 16 |
| dl.BetterWalls 1.0 | 1 | 2% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 4 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.2 | 177 / 210 | 1.70 | 20.0% | 33128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 20.0% | 177 |
| germ.TheMind .2 | 2.5 | 11.1% | 8 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.5% | 7 |
| EBBU.Sim2 1.02 | 4.0 | 9.8% | 4 |
| agrach.Dalek 1.0 | 5.7 | 9.1% | 4 |
| lmk.ACPFinal 0.1 | 7.0 | 8.5% | 3 |
| stelo.UntouchableNano 1.3 | 7.0 | 8.2% | 5 |
| mb.Beast 0.1 | 7.7 | 7.9% | 1 |
| skm.Ryubot 1.0 | 8.3 | 7.6% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 8.8 | 7.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.6 | 31 / 35 | 5495 |
| 2 | 1 | 70.3 | 95.2 | 30 / 35 | 5841 |
| 3 | 1 | 68.8 | 91.1 | 29 / 35 | 5018 |
| 4 | 1 | 66.6 | 85.1 | 24 / 35 | 5000 |
| 5 | 1 | 69.9 | 92.7 | 31 / 35 | 5802 |
| 6 | 1 | 70.6 | 94.3 | 32 / 35 | 5972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 100% |
| EBBU.Sim2 1.02 | 27 | 96% |
| skm.Ryubot 1.0 | 22 | 100% |
| agrach.Dalek 1.0 | 20 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 88% |
| stelo.UntouchableNano 1.3 | 15 | 93% |
| lmk.ACPFinal 0.1 | 14 | 93% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 389. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 7 | 21% | 23 |
| stelo.UntouchableNano 1.3 | 6 | 18% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 12% | 31 |
| EBBU.Sim2 1.02 | 4 | 12% | 22 |
| germ.TheMind .2 | 3 | 9% | 42 |
| agrach.Dalek 1.0 | 3 | 9% | 35 |
| mb.Beast 0.1 | 3 | 9% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 6% | 6 |
| skm.Ryubot 1.0 | 1 | 3% | 7 |

## Melee bench: F38

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.5 | 92 / 210 | 2.48 | 16.9% | 25076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.2 | 16.9% | 92 |
| justin.Mallais 14.0 | 1.8 | 16.4% | 60 |
| bvh.mini.Freya 0.55 | 3.2 | 12.3% | 19 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.6% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 10.2% | 4 |
| cs.Wren 1.0 | 5.3 | 10.1% | 8 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.4% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.3% | 2 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 79.7 | 13 / 35 | 3936 |
| 2 | 1 | 66.4 | 83.5 | 15 / 35 | 4120 |
| 3 | 1 | 66.6 | 84.4 | 16 / 35 | 4411 |
| 4 | 1 | 66.1 | 84.8 | 12 / 35 | 4179 |
| 5 | 1 | 66.6 | 83.2 | 18 / 35 | 4450 |
| 6 | 1 | 66.4 | 85.7 | 18 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 62 | 65% |
| bts.mega.Gnarly 1.4 | 24 | 63% |
| bvh.mini.Freya 0.55 | 19 | 74% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 91% |
| cs.Wren 1.0 | 9 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 0% |

Hadur died in 118 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 46 | 39% | 87 |
| bvh.mini.Freya 0.55 | 22 | 19% | 31 |
| bts.mega.Gnarly 1.4 | 17 | 14% | 33 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 11% | 29 |
| cs.Wren 1.0 | 8 | 7% | 15 |
| kdf.KoulDestroyer 1.0 | 8 | 7% | 8 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 3% | 5 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.7 | 105 / 210 | 2.38 | 17.6% | 27524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.2 | 17.6% | 105 |
| bvh.fry.Freya 0.82 | 1.8 | 14.9% | 22 |
| az.Ololobot 0.2.4 | 3.0 | 12.6% | 51 |
| catcat20.Lambda 0.024 | 4.0 | 11.0% | 20 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.7% | 9 |
| gimp.GimpBot 0.1 | 6.8 | 8.0% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.8% | 2 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 8.1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 90.2 | 17 / 35 | 4586 |
| 2 | 1 | 67.2 | 86.0 | 20 / 35 | 4652 |
| 3 | 1 | 67.6 | 87.3 | 19 / 35 | 4690 |
| 4 | 1 | 67.7 | 87.9 | 20 / 35 | 4721 |
| 5 | 1 | 67.2 | 87.3 | 16 / 35 | 4733 |
| 6 | 2 | 61.9 | 69.5 | 13 / 35 | 4142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 52 | 50% |
| catcat20.Lambda 0.024 | 34 | 82% |
| bvh.fry.Freya 0.82 | 28 | 96% |
| stelo.SoRobotNanoMelee 1.2 | 20 | 85% |
| gimp.GimpBot 0.1 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1073. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 34 | 32% | 58 |
| az.Ololobot 0.2.4 | 29 | 28% | 57 |
| stelo.SoRobotNanoMelee 1.2 | 15 | 14% | 20 |
| catcat20.Lambda 0.024 | 13 | 12% | 39 |
| apollokidd.ApolloKidd 0.9 | 8 | 8% | 11 |
| gimp.GimpBot 0.1 | 3 | 3% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 8 |

## Melee bench: F40

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 86.8 | 119 / 210 | 2.19 | 18.6% | 28674 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 18.6% | 119 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 47 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.8% | 18 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.6% | 9 |
| mz.AntiGrav 1.0 | 4.3 | 10.7% | 5 |
| stelo.Randomness 1.0 | 6.2 | 9.3% | 9 |
| alpha.BlackIce 1.0 | 6.8 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.9% | 0 |
| sample.Corners 1.0 | 9.7 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.0 | 18 / 35 | 4659 |
| 2 | 1 | 68.2 | 86.7 | 19 / 35 | 5006 |
| 3 | 1 | 68.7 | 87.3 | 19 / 35 | 4981 |
| 4 | 1 | 70.5 | 94.0 | 27 / 35 | 4933 |
| 5 | 1 | 67.1 | 85.4 | 17 / 35 | 4506 |
| 6 | 1 | 66.8 | 80.6 | 19 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 69% |
| kano.gamma.KanoGamma 1.8 | 27 | 74% |
| Polkwane.SmashMelee 1.0 | 22 | 82% |
| mz.AntiGrav 1.0 | 21 | 95% |
| stelo.Randomness 1.0 | 13 | 100% |
| alpha.BlackIce 1.0 | 6 | 83% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 858. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 37 | 41% | 76 |
| kano.gamma.KanoGamma 1.8 | 17 | 19% | 43 |
| Polkwane.SmashMelee 1.0 | 12 | 13% | 24 |
| mz.AntiGrav 1.0 | 9 | 10% | 22 |
| stelo.Randomness 1.0 | 8 | 9% | 25 |
| alpha.BlackIce 1.0 | 6 | 7% | 13 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 5 |
| sample.Corners 1.0 | 1 | 1% | 1 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.9 | 107 / 210 | 2.18 | 17.6% | 24489 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.2 | 17.6% | 107 |
| eem.EvBotNG v12.8 | 1.8 | 16.1% | 71 |
| ary.Swarm 1.1 | 3.0 | 13.8% | 17 |
| lessonz.robocode.Oz 0.5.0 | 4.3 | 11.8% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.0% | 8 |
| shrub.Silver v048 | 6.0 | 8.5% | 0 |
| zyx.nano.Ant 1.1 | 7.2 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 0 |
| stelo.Mirror 1.1 | 8.5 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 19 / 35 | 4349 |
| 2 | 2 | 65.3 | 82.2 | 13 / 35 | 3779 |
| 3 | 1 | 68.1 | 86.3 | 19 / 35 | 4500 |
| 4 | 1 | 67.2 | 87.3 | 19 / 35 | 3721 |
| 5 | 1 | 67.4 | 87.0 | 19 / 35 | 4056 |
| 6 | 1 | 67.8 | 89.5 | 18 / 35 | 4084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 76 | 46% |
| lessonz.robocode.Oz 0.5.0 | 29 | 90% |
| ary.Swarm 1.1 | 27 | 81% |
| simonton.nano.MeleeSeed 1.8 | 21 | 95% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| shrub.Silver v048 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1046. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 54 | 51% | 94 |
| ary.Swarm 1.1 | 17 | 16% | 37 |
| simonton.nano.MeleeSeed 1.8 | 12 | 11% | 32 |
| lessonz.robocode.Oz 0.5.0 | 8 | 8% | 22 |
| zyx.nano.Ant 1.1 | 6 | 6% | 6 |
| jsal.Jsalbot 1.0 | 3 | 3% | 7 |
| acogdev.alpha 0.2 | 2 | 2% | 2 |
| stelo.Mirror 1.1 | 1 | 1% | 5 |
| shrub.Silver v048 | 0 | 0% | 5 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.8 | 99 / 210 | 2.28 | 18.0% | 29859 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 18.0% | 99 |
| wompi.Wallaby 5.1 | 2.0 | 16.3% | 67 |
| ara.Shera 0.88 | 3.3 | 13.7% | 26 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.4% | 16 |
| amz.NanoClone 1.41 | 5.5 | 7.9% | 0 |
| maribo.IotaCT 1.1 | 6.2 | 7.3% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 1 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.0% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 91.7 | 22 / 35 | 5103 |
| 2 | 1 | 65.6 | 78.7 | 14 / 35 | 4844 |
| 3 | 1 | 68.0 | 87.3 | 16 / 35 | 4933 |
| 4 | 1 | 66.9 | 83.5 | 14 / 35 | 4958 |
| 5 | 1 | 67.4 | 85.1 | 15 / 35 | 4958 |
| 6 | 1 | 68.3 | 88.3 | 18 / 35 | 5063 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 57 | 65% |
| ara.Shera 0.88 | 42 | 69% |
| maribo.mini.MiniQuester 0.1 | 32 | 84% |
| dsw.StaticD 1.0 | 4 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 52 | 46% | 96 |
| ara.Shera 0.88 | 29 | 26% | 55 |
| maribo.mini.MiniQuester 0.1 | 23 | 21% | 45 |
| maribo.IotaCT 1.1 | 4 | 4% | 4 |
| dsw.StaticD 1.0 | 2 | 2% | 6 |
| amz.NanoClone 1.41 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.0 | 75.8 | 44 / 210 | 3.18 | 14.8% | 21789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 142 |
| hadur117.mini.DeiseWARM4 0.4 | 2.0 | 14.8% | 44 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.3% | 15 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.9% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.6% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 1 |
| jab.DiamondStealer 5 | 7.3 | 7.6% | 2 |
| mz.NanoGod 2.02 | 7.5 | 7.9% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.2 | 77.8 | 6 / 35 | 3887 |
| 2 | 2 | 63.0 | 72.7 | 7 / 35 | 3607 |
| 3 | 2 | 64.5 | 77.5 | 9 / 35 | 3619 |
| 4 | 2 | 61.4 | 68.9 | 5 / 35 | 3258 |
| 5 | 2 | 65.1 | 78.4 | 9 / 35 | 3815 |
| 6 | 2 | 64.9 | 79.7 | 8 / 35 | 3603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 27% |
| brainfade.melee.Dusk 0.44 | 14 | 86% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| Krabb.akim2.Akim2 1.1b | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 58% | 120 |
| brainfade.melee.Dusk 0.44 | 25 | 15% | 35 |
| dummy.micro.Sparrow 2.5 | 18 | 11% | 23 |
| wcsv.melee.EngineerMelee 0.1 | 10 | 6% | 12 |
| Krabb.akim2.Akim2 1.1b | 8 | 5% | 11 |
| mz.NanoGod 2.02 | 6 | 4% | 7 |
| jab.DiamondStealer 5 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.3 | 132 / 210 | 2.05 | 19.2% | 30969 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.2% | 132 |
| stelo.Liblix 0.3.1 | 2.5 | 15.2% | 42 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.4% | 23 |
| wompi.Quokka 1.6 | 4.2 | 10.1% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.4% | 4 |
| jwirde.Gort 2.0 | 5.7 | 8.8% | 5 |
| disan.Chair 2.2.0 | 7.0 | 7.6% | 1 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.5% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.3% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 79.7 | 16 / 35 | 4804 |
| 2 | 1 | 69.1 | 87.0 | 24 / 35 | 5159 |
| 3 | 1 | 70.6 | 93.0 | 23 / 35 | 5217 |
| 4 | 1 | 69.8 | 89.2 | 20 / 35 | 5533 |
| 5 | 1 | 70.3 | 90.8 | 27 / 35 | 5259 |
| 6 | 1 | 69.5 | 90.2 | 22 / 35 | 4997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 73% |
| tzu.TheArtOfWar 1.2 | 56 | 79% |
| wompi.Quokka 1.6 | 13 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| disan.Chair 2.2.0 | 6 | 100% |
| jwirde.Gort 2.0 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 42% | 96 |
| tzu.TheArtOfWar 1.2 | 22 | 27% | 63 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 10% | 14 |
| wompi.Quokka 1.6 | 7 | 9% | 18 |
| stf.PanzerGeneral 0.1 | 4 | 5% | 6 |
| disan.Chair 2.2.0 | 2 | 2% | 4 |
| jwirde.Gort 2.0 | 1 | 1% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 88.1 | 84 / 210 | 2.07 | 19.8% | 36623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWARM4 0.4 | 1.0 | 19.8% | 84 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.8% | 115 |
| jje.BagPuss 1.2 | 3.3 | 11.6% | 3 |
| myl.nano.Graviton 1.10 | 4.2 | 10.3% | 3 |
| sul.Lunar 1.1 | 5.2 | 9.4% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.3 | 8.2% | 1 |
| fm.claire 1.7 | 7.0 | 8.1% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.1% | 0 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 15 / 35 | 5963 |
| 2 | 1 | 69.4 | 88.9 | 16 / 35 | 5835 |
| 3 | 1 | 69.6 | 87.3 | 14 / 35 | 6252 |
| 4 | 1 | 69.4 | 87.6 | 12 / 35 | 6274 |
| 5 | 1 | 68.9 | 84.4 | 14 / 35 | 6096 |
| 6 | 1 | 70.1 | 89.5 | 13 / 35 | 6203 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 129 | 29% |
| sul.Lunar 1.1 | 13 | 100% |
| jje.BagPuss 1.2 | 12 | 92% |
| myl.nano.Graviton 1.10 | 8 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| wit.Deep7 2.0 | 6 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 2415. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 92 | 73% | 0 |
| jje.BagPuss 1.2 | 10 | 8% | 63 |
| myl.nano.Graviton 1.10 | 8 | 6% | 30 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 25 |
| sul.Lunar 1.1 | 4 | 3% | 56 |
| fm.claire 1.7 | 4 | 3% | 13 |
| hvilela.HVilela 0.9 | 1 | 1% | 8 |
| abud.ThirdRobo 1.0 | 1 | 1% | 3 |
| wit.Deep7 2.0 | 0 | 0% | 10 |

## Melee bench: F46

hadur117.mini.DeiseWARM4 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.3 | 59 / 210 | 2.68 | 15.9% | 24171 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.8% | 59 |
| rsalesc.melee.Medina 0.4.5 | 1.8 | 15.9% | 72 |
| hadur117.mini.DeiseWARM4 0.4 | 2.5 | 15.9% | 59 |
| mz.MicroSheep 1.0 | 4.3 | 10.5% | 9 |
| cx.Princess 1.0 | 4.8 | 10.4% | 11 |
| sadoner.killer 0.2 | 5.8 | 9.4% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.3 | 81.9 | 10 / 35 | 4141 |
| 2 | 2 | 65.8 | 81.0 | 13 / 35 | 4179 |
| 3 | 2 | 64.8 | 82.5 | 8 / 35 | 4021 |
| 4 | 3 | 65.1 | 82.9 | 9 / 35 | 4156 |
| 5 | 3 | 63.9 | 77.8 | 10 / 35 | 3965 |
| 6 | 2 | 64.5 | 81.9 | 9 / 35 | 3709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 46% |
| rsalesc.melee.Medina 0.4.5 | 39 | 44% |
| cx.Princess 1.0 | 18 | 61% |
| mz.MicroSheep 1.0 | 10 | 70% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 40% | 87 |
| rsalesc.melee.Medina 0.4.5 | 49 | 32% | 67 |
| cx.Princess 1.0 | 14 | 9% | 21 |
| mz.MicroSheep 1.0 | 13 | 8% | 18 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 6 |
| sadoner.killer 0.2 | 4 | 3% | 6 |
| kurios.DOSexe .9a | 3 | 2% | 3 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

