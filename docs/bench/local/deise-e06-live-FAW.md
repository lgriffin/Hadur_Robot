# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 86.9 | 57 / 210 | 2.18 | 17.1% | 28716 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 141 |
| hadur117.mini.DeiseFAW 0.3 | 2.0 | 17.1% | 57 |
| sgp.JollyNinja 3.53 | 3.7 | 11.0% | 7 |
| mz.MicroGodMelee 1 | 3.7 | 11.3% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.1% | 2 |
| lorneswork.Predator 1.0 | 5.8 | 9.1% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 87.6 | 13 / 35 | 4935 |
| 2 | 2 | 66.4 | 86.3 | 7 / 35 | 4687 |
| 3 | 2 | 68.2 | 88.9 | 10 / 35 | 5201 |
| 4 | 2 | 66.5 | 87.6 | 8 / 35 | 4588 |
| 5 | 2 | 65.3 | 84.1 | 7 / 35 | 4522 |
| 6 | 2 | 67.2 | 87.0 | 12 / 35 | 4783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 16% |
| mz.MicroGodMelee 1 | 15 | 80% |
| sgp.JollyNinja 3.53 | 13 | 92% |
| lorneswork.Predator 1.0 | 4 | 100% |
| skm.butterfly 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 3 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 79% | 143 |
| sgp.JollyNinja 3.53 | 13 | 8% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 5% | 11 |
| mz.MicroGodMelee 1 | 6 | 4% | 17 |
| lorneswork.Predator 1.0 | 3 | 2% | 8 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.2 | 105 / 210 | 2.51 | 17.8% | 28834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.8% | 105 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.5% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.7% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.3 | 10.9% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.7 | 10.0% | 7 |
| Noran.BitchingElk 0.054 | 6.5 | 8.1% | 8 |
| sch.Simone 0.3d | 7.3 | 7.5% | 9 |
| fnc.bandit.Bandit 5.2.0 | 7.7 | 7.4% | 0 |
| stelo.PatternRobot 1.0 | 8.5 | 6.1% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 85.7 | 17 / 35 | 4773 |
| 2 | 1 | 64.7 | 75.9 | 14 / 35 | 4569 |
| 3 | 1 | 67.6 | 83.8 | 21 / 35 | 4924 |
| 4 | 1 | 67.6 | 84.8 | 16 / 35 | 4991 |
| 5 | 1 | 67.3 | 82.5 | 17 / 35 | 4819 |
| 6 | 1 | 67.9 | 86.7 | 20 / 35 | 4758 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 49 | 69% |
| pulsar.PulsarMax 0.8.9 | 41 | 68% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 87% |
| Noran.BitchingElk 0.054 | 12 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 91% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| sch.Simone 0.3d | 4 | 50% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 881. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 34 | 32% | 55 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 26% | 57 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 12% | 19 |
| stelo.PatternRobot 1.0 | 8 | 8% | 11 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 6% | 24 |
| sch.Simone 0.3d | 6 | 6% | 10 |
| fnc.bandit.Bandit 5.2.0 | 6 | 6% | 8 |
| Noran.BitchingElk 0.054 | 4 | 4% | 21 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |

## Melee bench: F03

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.5 | 155 / 210 | 1.59 | 20.1% | 34742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 20.1% | 155 |
| radnor.DoctorBob 1.42 | 2.5 | 13.8% | 9 |
| kawigi.nano.Lib 1.0 | 3.2 | 13.3% | 16 |
| vuen.Cake 2.51 | 3.3 | 13.1% | 30 |
| urdos.URDOS 1.3 | 5.2 | 9.0% | 0 |
| adt.Ar1 2.1 | 5.8 | 7.6% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.8 | 25 / 35 | 5276 |
| 2 | 1 | 69.8 | 90.5 | 24 / 35 | 6049 |
| 3 | 1 | 71.3 | 95.9 | 27 / 35 | 6299 |
| 4 | 1 | 70.3 | 93.0 | 25 / 35 | 5859 |
| 5 | 1 | 70.9 | 97.1 | 29 / 35 | 5602 |
| 6 | 1 | 70.4 | 94.6 | 25 / 35 | 5657 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 76 | 70% |
| kawigi.nano.Lib 1.0 | 53 | 94% |
| radnor.DoctorBob 1.42 | 41 | 98% |
| urdos.URDOS 1.3 | 4 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 974. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 27 | 49% | 80 |
| kawigi.nano.Lib 1.0 | 14 | 25% | 64 |
| radnor.DoctorBob 1.42 | 7 | 13% | 34 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 5% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 7 |
| urdos.URDOS 1.3 | 1 | 2% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 3 |
| adt.Ar1 2.1 | 0 | 0% | 4 |

## Melee bench: F04

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 87.4 | 45 / 210 | 2.14 | 17.9% | 34011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.0% | 160 |
| hadur117.mini.DeiseFAW 0.3 | 2.0 | 17.9% | 45 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.0% | 0 |
| josago.Jorgito 0.16 | 4.8 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.7% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.5% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.9 | 87.6 | 9 / 35 | 5617 |
| 2 | 2 | 69.3 | 88.3 | 11 / 35 | 5783 |
| 3 | 2 | 68.9 | 87.6 | 9 / 35 | 5821 |
| 4 | 2 | 67.7 | 85.4 | 4 / 35 | 5578 |
| 5 | 2 | 68.8 | 88.3 | 8 / 35 | 5654 |
| 6 | 2 | 67.9 | 87.0 | 4 / 35 | 5558 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 159 | 22% |
| TNT.TNT 0.99.1 | 6 | 100% |
| apc.LeeroyJenkins2 1.0 | 3 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 1441. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 142 | 86% | 178 |
| apc.LeeroyJenkins2 1.0 | 12 | 7% | 14 |
| josago.Jorgito 0.16 | 8 | 5% | 8 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| TNT.TNT 0.99.1 | 1 | 1% | 7 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 73.4 | 24 / 210 | 3.39 | 13.8% | 20567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 120 |
| justin.DemonicRage 3.4 | 2.0 | 17.0% | 48 |
| hadur117.mini.DeiseFAW 0.3 | 3.2 | 13.8% | 24 |
| wompi.Numbat 2.1 | 3.8 | 12.5% | 11 |
| ms.Ares 0.19 | 5.3 | 9.1% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 9.0% | 5 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.1% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.5% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.5 | 74.9 | 3 / 35 | 3610 |
| 2 | 3 | 62.3 | 74.3 | 6 / 35 | 3221 |
| 3 | 3 | 60.3 | 70.8 | 2 / 35 | 3304 |
| 4 | 3 | 61.0 | 73.0 | 4 / 35 | 3254 |
| 5 | 4 | 60.2 | 69.5 | 1 / 35 | 3456 |
| 6 | 3 | 63.5 | 78.1 | 8 / 35 | 3722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 40 | 8% |
| justin.DemonicRage 3.4 | 25 | 48% |
| wompi.Numbat 2.1 | 6 | 100% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 186 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 73 | 39% | 78 |
| justin.DemonicRage 3.4 | 67 | 36% | 78 |
| wompi.Numbat 2.1 | 22 | 12% | 26 |
| ms.Ares 0.19 | 9 | 5% | 10 |
| axeBots.HataMoto 3.09 | 7 | 4% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 84.9 | 110 / 210 | 2.36 | 17.8% | 27343 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.8% | 110 |
| jekl.StoneGhost 0.7 | 2.7 | 13.9% | 19 |
| origin.SleepSiphon 1.7b | 2.8 | 14.0% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.4% | 22 |
| mld.Wisdom 1.0 | 5.2 | 10.3% | 4 |
| gg.Wolverine 2.0 | 5.7 | 8.9% | 4 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.5% | 3 |
| spinnercat.Omen 1.0 | 8.0 | 6.3% | 0 |
| DBall.NUKE 0.1 | 8.2 | 6.4% | 1 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 19 / 35 | 4879 |
| 2 | 1 | 65.4 | 81.0 | 13 / 35 | 4323 |
| 3 | 1 | 66.4 | 82.2 | 17 / 35 | 4458 |
| 4 | 1 | 67.9 | 85.4 | 21 / 35 | 4582 |
| 5 | 1 | 68.0 | 86.0 | 21 / 35 | 4451 |
| 6 | 1 | 67.6 | 86.0 | 19 / 35 | 4650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 46 | 70% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 82% |
| jekl.StoneGhost 0.7 | 32 | 94% |
| gg.Wolverine 2.0 | 11 | 82% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| mld.Wisdom 1.0 | 2 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 35 | 35% | 69 |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 24% | 53 |
| jekl.StoneGhost 0.7 | 20 | 20% | 43 |
| mld.Wisdom 1.0 | 8 | 8% | 12 |
| gg.Wolverine 2.0 | 7 | 7% | 14 |
| ers.nano.hawk.HawkLA 3.0m | 4 | 4% | 10 |
| DBall.NUKE 0.1 | 1 | 1% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |

## Melee bench: F07

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 91.5 | 118 / 210 | 1.76 | 19.4% | 33011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.2 | 19.4% | 118 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.1% | 44 |
| rtk.Tachikoma 1.0 | 2.5 | 16.7% | 27 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.1% | 7 |
| franzor.Lizt 1.3.1 | 4.8 | 10.7% | 14 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 90.5 | 20 / 35 | 5922 |
| 2 | 1 | 71.7 | 95.2 | 21 / 35 | 5617 |
| 3 | 2 | 69.5 | 89.5 | 15 / 35 | 5251 |
| 4 | 1 | 70.5 | 90.2 | 20 / 35 | 5500 |
| 5 | 1 | 69.6 | 89.2 | 18 / 35 | 4904 |
| 6 | 1 | 72.0 | 94.6 | 24 / 35 | 5817 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 79% |
| rsalesc.melee.Monk 0.3.6c | 40 | 23% |
| oog.melee.CapuletDroid 1.1 | 21 | 86% |
| franzor.Lizt 1.3.1 | 17 | 82% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 45 | 49% | 59 |
| rtk.Tachikoma 1.0 | 34 | 37% | 109 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 30 |
| franzor.Lizt 1.3.1 | 5 | 5% | 0 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 7 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.1 | 126 / 210 | 1.80 | 19.4% | 29966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.4% | 126 |
| tm.Yuugao 1.0 | 2.3 | 13.0% | 36 |
| shrub.Vapour v159 | 2.8 | 12.7% | 23 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.9% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 4.7 | 10.0% | 10 |
| m3thos.Eva00 1.1 | 6.5 | 7.7% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 7.6% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.7 | 6.3% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.5% | 2 |
| SHAM.WOW 1.4 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 93.0 | 22 / 35 | 4456 |
| 2 | 1 | 70.9 | 94.9 | 26 / 35 | 5489 |
| 3 | 1 | 67.9 | 88.6 | 19 / 35 | 4961 |
| 4 | 1 | 68.5 | 89.2 | 18 / 35 | 5171 |
| 5 | 1 | 69.7 | 93.0 | 23 / 35 | 4876 |
| 6 | 1 | 68.1 | 87.6 | 18 / 35 | 5013 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 57 | 63% |
| shrub.Vapour v159 | 43 | 77% |
| Krabb.sliNk.Garm 0.9u | 28 | 79% |
| com.spp.robocode.MostlyHarmless 010 | 21 | 81% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 100% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 1010. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 33% | 69 |
| shrub.Vapour v159 | 23 | 27% | 60 |
| Krabb.sliNk.Garm 0.9u | 18 | 21% | 30 |
| com.spp.robocode.MostlyHarmless 010 | 10 | 12% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 9 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 6 |
| m3thos.Eva00 1.1 | 1 | 1% | 6 |
| SHAM.WOW 1.4 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 75.6 | 60 / 210 | 3.20 | 15.4% | 23918 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.5% | 96 |
| hadur117.mini.DeiseFAW 0.3 | 2.0 | 15.4% | 60 |
| kc.micro.Figment 1.0 | 3.0 | 13.7% | 27 |
| yagami.Tidus 0.11 | 4.3 | 10.9% | 4 |
| pedersen.Grishnakh 1.0 | 5.2 | 10.1% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.0% | 9 |
| dft.Calliope 5.6 | 6.8 | 7.8% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 4.7% | 0 |
| rdm.Dueler 0.4x | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 60.0 | 67.9 | 5 / 35 | 3422 |
| 2 | 2 | 64.0 | 75.9 | 11 / 35 | 4175 |
| 3 | 2 | 64.8 | 78.4 | 11 / 35 | 4059 |
| 4 | 2 | 65.0 | 80.0 | 11 / 35 | 4112 |
| 5 | 2 | 64.1 | 74.9 | 13 / 35 | 4082 |
| 6 | 2 | 64.0 | 76.5 | 9 / 35 | 4068 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 55 | 35% |
| kc.micro.Figment 1.0 | 31 | 77% |
| yagami.Tidus 0.11 | 8 | 100% |
| pedersen.Grishnakh 1.0 | 6 | 83% |
| mc2.enemy.Original 0.9 | 4 | 100% |

Hadur died in 150 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 42% | 82 |
| kc.micro.Figment 1.0 | 23 | 15% | 49 |
| yagami.Tidus 0.11 | 20 | 13% | 24 |
| pedersen.Grishnakh 1.0 | 16 | 11% | 20 |
| mc2.enemy.Original 0.9 | 12 | 8% | 16 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
| robar.nano.Assertive_Melee 0.2 | 5 | 3% | 6 |
| step.nanoPri 1.0 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |

## Melee bench: F10

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.8 | 171 / 210 | 1.47 | 20.3% | 32166 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 20.3% | 171 |
| DTF.Kludgy 1.2b | 2.7 | 13.7% | 19 |
| ne.Chimera 1.2 | 3.3 | 12.2% | 8 |
| ejb.Polaris 1.0.1 | 3.5 | 12.3% | 5 |
| vStar.RAFzilla 2.15 | 4.8 | 10.6% | 4 |
| tvv.micro.Antares 1.1.1 | 5.7 | 10.1% | 4 |
| sam.Samspin 1.0 | 7.7 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 98.4 | 30 / 35 | 5645 |
| 2 | 1 | 70.5 | 95.6 | 30 / 35 | 5019 |
| 3 | 1 | 69.5 | 91.1 | 26 / 35 | 5158 |
| 4 | 1 | 71.3 | 97.5 | 29 / 35 | 5561 |
| 5 | 1 | 70.3 | 94.0 | 28 / 35 | 5370 |
| 6 | 1 | 70.4 | 92.4 | 28 / 35 | 5413 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 51 | 78% |
| ejb.Polaris 1.0.1 | 45 | 100% |
| ne.Chimera 1.2 | 31 | 84% |
| vStar.RAFzilla 2.15 | 25 | 92% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |
| sam.Samspin 1.0 | 5 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 3 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 48% | 54 |
| ne.Chimera 1.2 | 7 | 17% | 33 |
| vStar.RAFzilla 2.15 | 6 | 14% | 25 |
| ejb.Polaris 1.0.1 | 4 | 10% | 51 |
| sam.Samspin 1.0 | 3 | 7% | 4 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 18 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 2% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 14 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.4 | 96 / 210 | 2.67 | 16.8% | 24886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.3 | 16.8% | 96 |
| rz.Aleph 0.34 | 1.7 | 16.4% | 57 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.6% | 21 |
| djc.DynaBot 0.1.1 | 4.3 | 10.1% | 9 |
| rdt199.Warlord 0.73 | 5.0 | 9.4% | 10 |
| br2.MobyDickBot 1.6 | 5.8 | 8.8% | 13 |
| uji.YellohFellah 1.0 | 6.7 | 8.1% | 7 |
| KiraNL.Chupacabra 0.4 | 8.0 | 6.9% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.7% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 83.8 | 19 / 35 | 4331 |
| 2 | 1 | 66.3 | 82.9 | 18 / 35 | 4338 |
| 3 | 1 | 66.1 | 85.4 | 16 / 35 | 3990 |
| 4 | 2 | 64.2 | 75.9 | 16 / 35 | 4073 |
| 5 | 1 | 66.0 | 84.4 | 15 / 35 | 4159 |
| 6 | 2 | 63.6 | 76.2 | 12 / 35 | 3995 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 54 | 74% |
| uji.YellohFellah 1.0 | 15 | 87% |
| cx.mini.Nimrod 0.55 | 14 | 86% |
| rdt199.Warlord 0.73 | 13 | 92% |
| djc.DynaBot 0.1.1 | 13 | 85% |
| br2.MobyDickBot 1.6 | 11 | 64% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 48 | 41% | 90 |
| cx.mini.Nimrod 0.55 | 22 | 19% | 30 |
| rdt199.Warlord 0.73 | 14 | 12% | 27 |
| djc.DynaBot 0.1.1 | 11 | 9% | 23 |
| br2.MobyDickBot 1.6 | 9 | 8% | 19 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| uji.YellohFellah 1.0 | 3 | 3% | 13 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.7 | 123 / 210 | 2.20 | 17.9% | 23131 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.9% | 123 |
| bts.wiki.RipCurl 0.9b | 2.2 | 14.2% | 31 |
| nat.PallasHawk 1.0 | 3.0 | 13.2% | 24 |
| darkcanuck.Leon 1.01 | 3.8 | 12.7% | 19 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 8 |
| jrm.Test0 1.0 | 6.2 | 7.7% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.9% | 1 |
| jp.Perpy 16.0 | 8.3 | 6.2% | 0 |
| stuff.Vlad 0.1 | 9.2 | 5.6% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.6% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 93.0 | 25 / 35 | 4106 |
| 2 | 1 | 67.9 | 87.9 | 23 / 35 | 4040 |
| 3 | 1 | 67.1 | 86.0 | 20 / 35 | 3896 |
| 4 | 1 | 63.7 | 77.8 | 15 / 35 | 3352 |
| 5 | 1 | 66.8 | 86.3 | 19 / 35 | 3776 |
| 6 | 1 | 67.7 | 88.9 | 21 / 35 | 3961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 45 | 87% |
| nat.PallasHawk 1.0 | 43 | 81% |
| darkcanuck.Leon 1.01 | 39 | 79% |
| brainfade.melee.Genghis 0.36 | 14 | 86% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| jp.Perpy 16.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 0% |

Hadur died in 89 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 31% | 59 |
| nat.PallasHawk 1.0 | 20 | 22% | 51 |
| darkcanuck.Leon 1.01 | 17 | 19% | 57 |
| brainfade.melee.Genghis 0.36 | 8 | 9% | 18 |
| jrm.Test0 1.0 | 7 | 8% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 4% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 3 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.2 | 78 / 210 | 2.42 | 16.7% | 26452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.5 | 16.7% | 78 |
| mn.Combat 3.25.0 | 2.2 | 16.6% | 79 |
| ags.Glacier 0.2.11 | 2.3 | 16.2% | 32 |
| shinh.Entangled 0.3 | 4.5 | 11.9% | 15 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.4% | 7 |
| apc.Colossus2 0.17 | 6.3 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 1 |
| ayk.WallHugger 1.0 | 8.0 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.4 | 76.8 | 6 / 35 | 3921 |
| 2 | 1 | 68.6 | 90.2 | 19 / 35 | 4433 |
| 3 | 1 | 66.8 | 85.1 | 13 / 35 | 4565 |
| 4 | 1 | 68.5 | 88.9 | 14 / 35 | 4902 |
| 5 | 1 | 66.1 | 84.8 | 16 / 35 | 4285 |
| 6 | 2 | 65.3 | 79.7 | 10 / 35 | 4346 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 44% |
| ags.Glacier 0.2.11 | 49 | 67% |
| shinh.Entangled 0.3 | 15 | 67% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |
| ayk.WallHugger 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 41% | 81 |
| ags.Glacier 0.2.11 | 39 | 29% | 74 |
| gh.micro.Gruweltje 0.7 | 15 | 11% | 17 |
| shinh.Entangled 0.3 | 14 | 10% | 27 |
| stelo.Wang 1.0 | 5 | 4% | 5 |
| apc.Colossus2 0.17 | 2 | 1% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.8 | 163 / 210 | 1.56 | 20.3% | 32471 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 20.3% | 163 |
| simonton.micro.Sprout 1.1.3 | 2.2 | 14.9% | 19 |
| catcat20.shape.Theta 0.018 | 2.8 | 12.6% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 9.7% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.4% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 7.0 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 7.8% | 3 |
| pa.Improved 1.0 | 9.0 | 5.5% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 95.9 | 27 / 35 | 5634 |
| 2 | 1 | 70.0 | 92.4 | 25 / 35 | 5473 |
| 3 | 1 | 68.2 | 86.3 | 25 / 35 | 4566 |
| 4 | 1 | 71.6 | 96.2 | 29 / 35 | 5592 |
| 5 | 1 | 71.4 | 95.2 | 28 / 35 | 5651 |
| 6 | 1 | 71.6 | 96.5 | 29 / 35 | 5555 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 82 | 95% |
| catcat20.shape.Theta 0.018 | 57 | 84% |
| sanyi.mikrobi.Roberto 1.0 | 15 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 15 | 87% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 88% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 17 | 35% | 96 |
| catcat20.shape.Theta 0.018 | 14 | 29% | 48 |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 14% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 8% | 19 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 6% | 20 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 5 |
| pa.Improved 1.0 | 0 | 0% | 4 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.5 | 96 / 210 | 2.76 | 17.2% | 29082 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.2% | 96 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 24 |
| emp.Yngwie 1.11 | 3.2 | 12.9% | 45 |
| mld.DustBunny 3.8 | 4.3 | 12.0% | 9 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.4% | 14 |
| kawigi.robot.Girl 1.2 | 5.7 | 10.4% | 22 |
| lambdaxy.TBot 0.1 | 7.2 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.9% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 75.2 | 15 / 35 | 4503 |
| 2 | 1 | 67.0 | 81.9 | 17 / 35 | 4951 |
| 3 | 1 | 66.4 | 82.9 | 13 / 35 | 4828 |
| 4 | 1 | 65.0 | 77.8 | 12 / 35 | 4592 |
| 5 | 1 | 67.3 | 80.0 | 17 / 35 | 5365 |
| 6 | 1 | 67.7 | 85.1 | 22 / 35 | 4843 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 55% |
| kawigi.micro.Shiz 1.1 | 24 | 92% |
| kawigi.robot.Girl 1.2 | 19 | 84% |
| cb.nano.Insomnia 1.0 | 19 | 74% |
| mld.DustBunny 3.8 | 17 | 100% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 32% | 72 |
| kawigi.micro.Shiz 1.1 | 23 | 20% | 39 |
| mld.DustBunny 3.8 | 13 | 11% | 34 |
| kawigi.robot.Girl 1.2 | 13 | 11% | 24 |
| cb.nano.Insomnia 1.0 | 13 | 11% | 13 |
| divineomega.TrialBot 0.003 | 9 | 8% | 18 |
| lambdaxy.TBot 0.1 | 4 | 3% | 8 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 2 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 86.0 | 97 / 210 | 2.26 | 18.5% | 31941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.5% | 97 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 57 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.7 | 10.1% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 4 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.0% | 8 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 5 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.3% | 6 |
| asd.Cthulhu 1.3 | 8.8 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.9 | 16 / 35 | 5510 |
| 2 | 1 | 67.5 | 82.2 | 13 / 35 | 5061 |
| 3 | 1 | 65.7 | 79.7 | 12 / 35 | 4968 |
| 4 | 1 | 70.5 | 90.2 | 20 / 35 | 5705 |
| 5 | 1 | 68.1 | 87.3 | 16 / 35 | 5060 |
| 6 | 1 | 69.6 | 87.9 | 20 / 35 | 5637 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 80 | 56% |
| techdude.forest.FlamingForest 1.1 | 26 | 54% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 93% |
| bvh.fnr.Fenrir 0.36l | 11 | 82% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 7 | 86% |
| stelo.IntrinsicVolatility 1.4 | 5 | 60% |

Hadur died in 113 of 210 rounds, at a mean tick of 1268. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 58 | 51% | 107 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 16 | 14% | 27 |
| techdude.forest.FlamingForest 1.1 | 13 | 12% | 27 |
| bvh.fnr.Fenrir 0.36l | 9 | 8% | 15 |
| divineomega.DivineBot 1.9.4.5 | 8 | 7% | 16 |
| stelo.IntrinsicVolatility 1.4 | 5 | 4% | 8 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 5 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

## Melee bench: F17

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.4 | 100 / 210 | 2.50 | 17.7% | 29888 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.7% | 100 |
| cx.BlestPain 1.41 | 2.7 | 13.0% | 46 |
| et.Predator 1.8 | 3.0 | 13.4% | 24 |
| oog.melee.Mercutio 1.0 | 3.8 | 11.9% | 22 |
| nic.Nicator 2.4 | 4.8 | 11.3% | 8 |
| ahf.NanoAndrew .4 | 5.7 | 10.4% | 7 |
| maribo.melee.BMV 0.1 | 7.0 | 8.5% | 1 |
| tex.Longbot 0.4 | 8.2 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.1% | 2 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 87.3 | 22 / 35 | 5487 |
| 2 | 1 | 68.1 | 87.3 | 16 / 35 | 4845 |
| 3 | 1 | 67.6 | 84.4 | 19 / 35 | 4904 |
| 4 | 1 | 67.4 | 83.2 | 15 / 35 | 5236 |
| 5 | 1 | 65.8 | 80.0 | 16 / 35 | 4506 |
| 6 | 1 | 65.4 | 78.1 | 12 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 81% |
| cx.BlestPain 1.41 | 33 | 30% |
| oog.melee.Mercutio 1.0 | 26 | 77% |
| nic.Nicator 2.4 | 20 | 95% |
| ahf.NanoAndrew .4 | 8 | 88% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1084. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 33% | 49 |
| et.Predator 1.8 | 23 | 21% | 56 |
| oog.melee.Mercutio 1.0 | 16 | 15% | 35 |
| nic.Nicator 2.4 | 11 | 10% | 32 |
| ahf.NanoAndrew .4 | 11 | 10% | 22 |
| tex.Longbot 0.4 | 6 | 5% | 6 |
| maribo.melee.BMV 0.1 | 3 | 3% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 3 | 3% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.2 | 130 / 210 | 1.98 | 18.9% | 27725 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.9% | 130 |
| morbid.MorbidPriest 1.0 | 2.2 | 12.9% | 27 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.2% | 26 |
| uji.DBH 1.1 | 4.0 | 10.9% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 9.7% | 4 |
| spinnercat.Robovirus 2.718 | 5.8 | 9.1% | 2 |
| sigterm.Sigterm 1.0 | 7.2 | 7.8% | 6 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.3% | 2 |
| stelo.WangRobot 1.0 | 9.3 | 5.9% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 89.2 | 21 / 35 | 4584 |
| 2 | 1 | 67.7 | 88.3 | 20 / 35 | 4410 |
| 3 | 1 | 69.1 | 90.5 | 23 / 35 | 4859 |
| 4 | 1 | 68.7 | 89.2 | 24 / 35 | 4794 |
| 5 | 1 | 68.0 | 88.3 | 22 / 35 | 4486 |
| 6 | 1 | 68.0 | 89.5 | 20 / 35 | 4592 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 51 | 80% |
| agd.Mooserwirt2 2.7 | 35 | 71% |
| uji.DBH 1.1 | 28 | 75% |
| sigterm.Sigterm 1.0 | 13 | 92% |
| stelo.WangRobot 1.0 | 12 | 83% |
| ratosh.Nobo 0.21 | 9 | 100% |
| spinnercat.Robovirus 2.718 | 7 | 86% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 22 | 27% | 62 |
| agd.Mooserwirt2 2.7 | 18 | 22% | 49 |
| uji.DBH 1.1 | 12 | 15% | 21 |
| sigterm.Sigterm 1.0 | 8 | 10% | 14 |
| ratosh.Nobo 0.21 | 7 | 9% | 17 |
| spinnercat.Robovirus 2.718 | 5 | 6% | 14 |
| stelo.WangRobot 1.0 | 4 | 5% | 12 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 14 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 94.0 | 165 / 210 | 1.54 | 20.9% | 34284 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 20.9% | 165 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 15.0% | 20 |
| mld.Infinity 2.2 | 2.7 | 14.4% | 19 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 10.8% | 1 |
| erdnis.Rover 0.3 | 5.3 | 9.7% | 2 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.7% | 2 |
| pac.ABC 2.1 | 7.0 | 7.3% | 1 |
| mbh.Mbh 0.1 | 7.7 | 6.8% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 95.2 | 30 / 35 | 5549 |
| 2 | 1 | 72.1 | 94.0 | 26 / 35 | 6104 |
| 3 | 1 | 71.2 | 91.4 | 25 / 35 | 5784 |
| 4 | 1 | 72.8 | 96.8 | 30 / 35 | 5835 |
| 5 | 1 | 72.1 | 94.3 | 29 / 35 | 5790 |
| 6 | 1 | 70.8 | 92.4 | 25 / 35 | 5222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 82 | 88% |
| mld.Infinity 2.2 | 67 | 90% |
| krillr.mini.JointStrike 2.0.0 | 13 | 100% |
| patson.PatsonTestBot 1.0 | 10 | 100% |
| erdnis.Rover 0.3 | 5 | 80% |
| pbg.R2D2 1.0 | 2 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 1176. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 19 | 42% | 107 |
| mld.Infinity 2.2 | 13 | 29% | 30 |
| krillr.mini.JointStrike 2.0.0 | 5 | 11% | 26 |
| erdnis.Rover 0.3 | 4 | 9% | 12 |
| patson.PatsonTestBot 1.0 | 3 | 7% | 13 |
| pbg.R2D2 1.0 | 1 | 2% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.2 | 127 / 210 | 1.88 | 19.6% | 32263 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.6% | 127 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.0% | 41 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 10.8% | 5 |
| catcat20.Rabbit 0.001 | 4.2 | 10.5% | 17 |
| fwb.Nine 1.0.1 | 4.2 | 10.5% | 17 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.2% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.5% | 0 |
| bayen.nut.Squirrel 1.615 | 7.7 | 7.2% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.7 | 24 / 35 | 5445 |
| 2 | 1 | 69.8 | 93.0 | 22 / 35 | 5134 |
| 3 | 1 | 68.6 | 86.7 | 18 / 35 | 5182 |
| 4 | 1 | 69.5 | 90.2 | 20 / 35 | 5354 |
| 5 | 1 | 70.4 | 92.4 | 24 / 35 | 5506 |
| 6 | 1 | 68.8 | 87.3 | 19 / 35 | 5642 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 89 | 75% |
| catcat20.Rabbit 0.001 | 25 | 72% |
| fwb.Nine 1.0.1 | 24 | 75% |
| nz.jdc.nano.GridFu 1.0 | 13 | 92% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1071. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 52% | 99 |
| fwb.Nine 1.0.1 | 18 | 22% | 25 |
| catcat20.Rabbit 0.001 | 9 | 11% | 32 |
| nz.jdc.nano.GridFu 1.0 | 8 | 10% | 21 |
| bayen.nut.Squirrel 1.615 | 3 | 4% | 10 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 10 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 3 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 8 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.1 | 144 / 210 | 1.62 | 20.2% | 32519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 20.2% | 144 |
| eem.EvBot v4.6.16 | 2.0 | 15.7% | 50 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.5% | 6 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.2% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.4% | 3 |
| fire219.CatBot 1.0 | 7.7 | 6.1% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.6 | 28 / 35 | 5612 |
| 2 | 1 | 70.8 | 92.7 | 22 / 35 | 5653 |
| 3 | 1 | 71.4 | 95.2 | 28 / 35 | 5407 |
| 4 | 1 | 70.1 | 91.4 | 20 / 35 | 5424 |
| 5 | 1 | 71.1 | 95.2 | 26 / 35 | 5277 |
| 6 | 1 | 68.8 | 88.3 | 20 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 106 | 69% |
| dummy.mini.Scimitar 1.01 | 42 | 93% |
| cf.RiO.RiOx 4.2.1 | 18 | 100% |
| eld.Hmm 1.0 | 10 | 90% |
| oa.weak.BotherBot 0.1 | 3 | 100% |
| el.JumpShoot 0.2 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 1363. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 35 | 51% | 88 |
| dummy.mini.Scimitar 1.01 | 17 | 25% | 69 |
| cf.RiO.RiOx 4.2.1 | 11 | 16% | 29 |
| eld.Hmm 1.0 | 1 | 1% | 15 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 6 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.5 | 90 / 210 | 2.21 | 18.0% | 30124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.0% | 90 |
| pe.SandboxDT 2.71m | 2.2 | 15.6% | 60 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.0% | 38 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.4% | 20 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 1 |
| yk.JahRoslav 1.1 | 6.7 | 6.6% | 2 |
| tad.Dalek98 0.98 | 6.7 | 6.6% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.0% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.0% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 15 / 35 | 4698 |
| 2 | 1 | 68.3 | 87.0 | 14 / 35 | 5039 |
| 3 | 1 | 69.4 | 89.2 | 18 / 35 | 5418 |
| 4 | 1 | 67.9 | 85.7 | 14 / 35 | 4958 |
| 5 | 1 | 68.7 | 87.3 | 15 / 35 | 5295 |
| 6 | 1 | 67.4 | 87.0 | 14 / 35 | 4716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 51 | 45% |
| kvk.HebusLeTroll 0.35 | 51 | 67% |
| jlm.javaDisturbance 0.59 | 29 | 72% |
| bigpete.Stewie 1.0 | 5 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| yk.JahRoslav 1.1 | 2 | 50% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 998. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 49 | 41% | 74 |
| kvk.HebusLeTroll 0.35 | 39 | 33% | 65 |
| jlm.javaDisturbance 0.59 | 23 | 19% | 44 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| bigpete.Stewie 1.0 | 3 | 3% | 10 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 4 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 91.8 | 151 / 210 | 1.74 | 19.8% | 29826 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.8% | 151 |
| pe.SandboxLump 1.52 | 2.0 | 17.0% | 38 |
| cre.Karolos 0.32 | 3.0 | 14.0% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.6% | 4 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.3 | 9.2% | 2 |
| stelo.RamTrackSurfer 1.2 | 6.2 | 8.8% | 3 |
| cw.megas.Blade 0.8 | 6.3 | 8.6% | 1 |
| sample.Walls 1.0 | 7.8 | 7.3% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.3% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.7 | 26 / 35 | 5152 |
| 2 | 1 | 70.7 | 91.1 | 26 / 35 | 4910 |
| 3 | 1 | 70.2 | 89.5 | 24 / 35 | 4885 |
| 4 | 1 | 72.1 | 94.6 | 29 / 35 | 5376 |
| 5 | 1 | 70.7 | 93.7 | 24 / 35 | 4807 |
| 6 | 1 | 70.1 | 90.2 | 22 / 35 | 4696 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 87 | 80% |
| cre.Karolos 0.32 | 44 | 95% |
| stelo.AreaTargetingBot 1.1 | 19 | 100% |
| sample.Walls 1.0 | 10 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 34 | 58% | 107 |
| cre.Karolos 0.32 | 9 | 15% | 49 |
| stelo.AreaTargetingBot 1.1 | 7 | 12% | 22 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 10% | 9 |
| stelo.RamTrackSurfer 1.2 | 2 | 3% | 12 |
| cw.megas.Blade 0.8 | 1 | 2% | 3 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.0 | 76 / 210 | 2.98 | 15.5% | 21524 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.3 | 15.5% | 76 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.7% | 50 |
| florent.XSeries.X2 0.12 | 3.7 | 12.8% | 28 |
| davidalves.Phoenix 0.54 | 3.7 | 12.4% | 37 |
| pedersen.Ugluk 1.1.1 | 4.3 | 11.9% | 14 |
| oog.melee.Corsair 1.0 | 6.3 | 9.1% | 3 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.1% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 5.3% | 0 |
| evd.X1 0.01 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 79.7 | 13 / 35 | 3579 |
| 2 | 1 | 64.7 | 77.5 | 15 / 35 | 3940 |
| 3 | 3 | 60.7 | 69.8 | 8 / 35 | 3387 |
| 4 | 1 | 64.1 | 80.0 | 15 / 35 | 3500 |
| 5 | 1 | 63.4 | 80.3 | 10 / 35 | 3490 |
| 6 | 1 | 64.4 | 81.0 | 15 / 35 | 3628 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 61% |
| davidalves.Phoenix 0.54 | 27 | 52% |
| florent.XSeries.X2 0.12 | 18 | 72% |
| pedersen.Ugluk 1.1.1 | 14 | 71% |
| stelo.SoJNanoMelee 1.1 | 13 | 100% |
| oog.melee.Corsair 1.0 | 6 | 83% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 25% | 53 |
| florent.XSeries.X2 0.12 | 29 | 21% | 45 |
| pedersen.Ugluk 1.1.1 | 26 | 19% | 38 |
| davidalves.Phoenix 0.54 | 26 | 19% | 38 |
| stelo.SoJNanoMelee 1.1 | 10 | 7% | 15 |
| oog.melee.Corsair 1.0 | 6 | 4% | 11 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 8 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |
3 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 83.9 | 130 / 210 | 2.45 | 17.9% | 24694 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.9% | 130 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.8% | 21 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.8% | 21 |
| jdw.Hurricane 1.4 | 4.0 | 10.9% | 19 |
| ds.Oo 2.2 | 5.5 | 8.6% | 3 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 8.9% | 10 |
| awesomeness.Elite 1.0 | 7.5 | 7.4% | 0 |
| adt.Ar2 1.1 | 8.2 | 7.1% | 2 |
| gjr.Cephalosporin 0.1 | 8.3 | 7.2% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.6 | 22 / 35 | 4000 |
| 2 | 1 | 67.6 | 85.4 | 22 / 35 | 4181 |
| 3 | 1 | 68.8 | 89.8 | 24 / 35 | 4311 |
| 4 | 1 | 67.1 | 83.2 | 21 / 35 | 4197 |
| 5 | 1 | 66.2 | 80.6 | 21 / 35 | 3974 |
| 6 | 1 | 66.5 | 82.9 | 20 / 35 | 4031 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 52 | 92% |
| voidious.micro.BlitzBat 1.05 | 45 | 93% |
| jdw.Hurricane 1.4 | 15 | 87% |
| gre.svman4.Morfeas 1.4.1 | 10 | 70% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 100% |
| ds.Oo 2.2 | 2 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 565. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 20 | 25% | 50 |
| voidious.mini.BrokenSword 2.0.3 | 17 | 21% | 53 |
| gre.svman4.Morfeas 1.4.1 | 13 | 16% | 26 |
| jdw.Hurricane 1.4 | 12 | 15% | 27 |
| ds.Oo 2.2 | 7 | 9% | 19 |
| adt.Ar2 1.1 | 5 | 6% | 6 |
| amk.ChumbaMini 0.2 | 4 | 5% | 7 |
| gjr.Cephalosporin 0.1 | 2 | 2% | 10 |
| awesomeness.Elite 1.0 | 1 | 1% | 12 |

## Melee bench: F26

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 122 / 210 | 1.94 | 19.1% | 32863 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.1% | 122 |
| ak.Fermat 2.0 | 2.2 | 14.2% | 32 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 34 |
| lrem.Spectre 0.4.4 | 3.8 | 12.1% | 11 |
| js.PinBall 1.6 | 4.8 | 10.6% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.1% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.8% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.8% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 21 / 35 | 5278 |
| 2 | 1 | 68.0 | 84.4 | 18 / 35 | 5368 |
| 3 | 1 | 71.4 | 94.0 | 24 / 35 | 6291 |
| 4 | 1 | 68.4 | 87.3 | 18 / 35 | 5019 |
| 5 | 1 | 70.0 | 91.1 | 24 / 35 | 5508 |
| 6 | 1 | 68.7 | 89.2 | 17 / 35 | 5399 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 52 | 63% |
| ak.Fermat 2.0 | 49 | 73% |
| lrem.Spectre 0.4.4 | 29 | 79% |
| js.PinBall 1.6 | 14 | 86% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 980. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 32 | 36% | 63 |
| shu.nitro.LENIN .T34 | 28 | 31% | 70 |
| lrem.Spectre 0.4.4 | 16 | 18% | 36 |
| js.PinBall 1.6 | 7 | 8% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 6% | 13 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 8 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.2 | 125 / 210 | 2.33 | 18.7% | 29817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.7% | 125 |
| mk.Alpha 0.2.1 | 2.5 | 13.2% | 34 |
| wee.Gem 1.8.4 | 3.7 | 11.2% | 21 |
| EH.Eagle 1.0.6 | 4.0 | 11.1% | 8 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.4% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.4% | 3 |
| joe.ADinosaur 1.0 | 7.2 | 8.0% | 2 |
| throxbot.ThroxBot 0.1 | 7.3 | 7.9% | 1 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.0% | 1 |
| cs.Grudge 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 21 / 35 | 4330 |
| 2 | 1 | 68.9 | 81.3 | 20 / 35 | 5695 |
| 3 | 1 | 67.8 | 88.6 | 21 / 35 | 4277 |
| 4 | 1 | 68.5 | 80.0 | 16 / 35 | 5940 |
| 5 | 1 | 68.5 | 84.4 | 23 / 35 | 5169 |
| 6 | 1 | 68.6 | 92.4 | 24 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 60 | 82% |
| wee.Gem 1.8.4 | 36 | 75% |
| EH.Eagle 1.0.6 | 24 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 71% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 67% |
| throxbot.ThroxBot 0.1 | 3 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 29 | 34% | 76 |
| wee.Gem 1.8.4 | 17 | 20% | 50 |
| sheldor.melee.nano.TestMelee 0.1 | 17 | 20% | 28 |
| EH.Eagle 1.0.6 | 7 | 8% | 24 |
| joe.ADinosaur 1.0 | 4 | 5% | 8 |
| throxbot.ThroxBot 0.1 | 4 | 5% | 8 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 2% | 9 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.4 | 136 / 210 | 1.87 | 18.9% | 25680 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.9% | 136 |
| kid.test.NightFox .2 | 2.0 | 15.7% | 44 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.4% | 8 |
| uji.Antique 1.0 | 3.5 | 11.5% | 18 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.0% | 3 |
| ahr.ice.Ice 1.0.2 | 6.0 | 8.0% | 0 |
| amk.ChumbaWumba 0.3 | 7.0 | 7.5% | 1 |
| stelo.PianistNano 1.2 | 8.3 | 6.2% | 0 |
| matt.advanced.Katana 1.0 | 9.3 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 94.9 | 26 / 35 | 4507 |
| 2 | 1 | 67.8 | 88.6 | 20 / 35 | 4421 |
| 3 | 1 | 69.0 | 90.8 | 24 / 35 | 4241 |
| 4 | 1 | 68.5 | 89.5 | 23 / 35 | 4292 |
| 5 | 1 | 66.8 | 86.0 | 19 / 35 | 3878 |
| 6 | 1 | 69.3 | 92.4 | 24 / 35 | 4341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 98 | 73% |
| uji.Antique 1.0 | 30 | 90% |
| qohnil.blot.BlotBot 3.61 | 20 | 85% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| pfvicm.Sobieski 7.2.3b | 4 | 75% |
| amk.ChumbaWumba 0.3 | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 34 | 46% | 90 |
| uji.Antique 1.0 | 16 | 22% | 48 |
| qohnil.blot.BlotBot 3.61 | 6 | 8% | 21 |
| amk.ChumbaWumba 0.3 | 6 | 8% | 14 |
| pfvicm.Sobieski 7.2.3b | 6 | 8% | 13 |
| stelo.PianistNano 1.2 | 4 | 5% | 6 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 11 |
| matt.advanced.Katana 1.0 | 0 | 0% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.3 | 115 / 210 | 2.32 | 18.6% | 28605 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.6% | 115 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 47 |
| deewiant.Anomaly 0.2 | 2.5 | 15.1% | 35 |
| myl.micro.Troodon 1.10 | 4.3 | 11.3% | 4 |
| jok.PheonixM 0.1.2 | 4.7 | 10.5% | 6 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.6% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.6% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 88.9 | 20 / 35 | 5236 |
| 2 | 1 | 65.7 | 79.7 | 13 / 35 | 4233 |
| 3 | 1 | 69.3 | 87.3 | 20 / 35 | 4817 |
| 4 | 1 | 67.9 | 84.4 | 21 / 35 | 4309 |
| 5 | 1 | 69.8 | 88.9 | 24 / 35 | 4838 |
| 6 | 1 | 68.5 | 82.9 | 17 / 35 | 5172 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 87% |
| zyx.mega.YersiniaPestis 3.1 | 44 | 66% |
| myl.micro.Troodon 1.10 | 17 | 100% |
| jok.PheonixM 0.1.2 | 13 | 92% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 33 | 35% | 87 |
| zyx.mega.YersiniaPestis 3.1 | 30 | 32% | 55 |
| jok.PheonixM 0.1.2 | 11 | 12% | 20 |
| myl.micro.Troodon 1.10 | 9 | 9% | 23 |
| ph.melee.ArcherME 0.3 | 6 | 6% | 10 |
| fullsail.TimbotNoPrediction 1.0 | 3 | 3% | 3 |
| DBall.Anarchy 0.1 | 2 | 2% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 5 |

## Melee bench: F30

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.1 | 52 / 210 | 3.33 | 14.6% | 22587 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.7% | 60 |
| hadur117.mini.DeiseFAW 0.3 | 2.2 | 14.6% | 52 |
| darkcanuck.B26354 1.06 | 3.2 | 13.8% | 54 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.8% | 18 |
| oog.melee.Capulet 1.2 | 4.0 | 13.0% | 16 |
| intruder.PrairieWolf 2.61 | 7.0 | 7.3% | 2 |
| tripphippy.Alice 1.1 | 7.0 | 7.6% | 5 |
| ntc.Opposite 1.5 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.6% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.9 | 12 / 35 | 4067 |
| 2 | 4 | 60.0 | 68.3 | 5 / 35 | 3465 |
| 3 | 3 | 61.7 | 69.8 | 8 / 35 | 3959 |
| 4 | 3 | 60.0 | 67.6 | 7 / 35 | 3601 |
| 5 | 1 | 65.3 | 81.6 | 12 / 35 | 4011 |
| 6 | 1 | 62.1 | 75.2 | 8 / 35 | 3484 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 55% |
| darkcanuck.B26354 1.06 | 22 | 55% |
| oog.melee.Capulet 1.2 | 15 | 80% |
| stelo.PastFuture 2.3.2 | 14 | 71% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 43 | 27% | 61 |
| darkcanuck.B26354 1.06 | 36 | 23% | 45 |
| stelo.PastFuture 2.3.2 | 32 | 20% | 43 |
| oog.melee.Capulet 1.2 | 21 | 13% | 30 |
| tripphippy.Alice 1.1 | 9 | 6% | 11 |
| ntc.Opposite 1.5 | 8 | 5% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 2 | 1% | 4 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 74.9 | 55 / 210 | 3.26 | 14.6% | 20317 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 18.1% | 91 |
| hadur117.mini.DeiseFAW 0.3 | 2.3 | 14.6% | 55 |
| gh.mini.Griezel 0.2 | 2.8 | 13.3% | 41 |
| spinnercat.micro.Tyger 0.1 | 3.7 | 12.4% | 12 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.4% | 8 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 3 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.8% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.2 | 72.7 | 7 / 35 | 3492 |
| 2 | 4 | 58.7 | 66.3 | 7 / 35 | 2968 |
| 3 | 2 | 63.5 | 78.4 | 9 / 35 | 3478 |
| 4 | 2 | 61.8 | 71.7 | 9 / 35 | 3235 |
| 5 | 1 | 66.1 | 85.1 | 15 / 35 | 3803 |
| 6 | 2 | 61.9 | 75.2 | 8 / 35 | 3341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 58 | 45% |
| gh.mini.Griezel 0.2 | 20 | 55% |
| spinnercat.micro.Tyger 0.1 | 11 | 82% |
| d414.nano.Quantum 1.0.0 | 7 | 86% |
| timmit.nano.TimDog 0.33 | 3 | 67% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |

Hadur died in 155 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 43% | 90 |
| gh.mini.Griezel 0.2 | 38 | 25% | 52 |
| spinnercat.micro.Tyger 0.1 | 20 | 13% | 29 |
| d414.nano.Quantum 1.0.0 | 19 | 12% | 24 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 6 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 89.8 | 129 / 210 | 1.92 | 18.7% | 28306 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.7% | 129 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.9% | 53 |
| apc.botM 3.0 | 3.3 | 11.9% | 17 |
| lxx.ConceptA 0.8 | 3.7 | 10.9% | 1 |
| vjik.UnViolation 1.1 | 5.5 | 9.5% | 4 |
| bayen.UbaMicro 1.4 | 5.5 | 9.1% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.4% | 3 |
| yk.JahMicro 1.0 | 8.2 | 6.2% | 0 |
| conscience.Electron 1.3g | 8.7 | 6.1% | 0 |
| donjezza.Jezza 1.0 | 10.0 | 5.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.6 | 19 / 35 | 4686 |
| 2 | 1 | 67.9 | 89.2 | 21 / 35 | 4806 |
| 3 | 1 | 69.3 | 93.0 | 24 / 35 | 4736 |
| 4 | 1 | 67.4 | 87.3 | 19 / 35 | 4586 |
| 5 | 1 | 68.6 | 88.6 | 23 / 35 | 5092 |
| 6 | 1 | 68.8 | 93.0 | 23 / 35 | 4400 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 90 | 59% |
| apc.botM 3.0 | 25 | 88% |
| lxx.ConceptA 0.8 | 21 | 95% |
| bayen.UbaMicro 1.4 | 14 | 86% |
| donjezza.Jezza 1.0 | 8 | 100% |
| vjik.UnViolation 1.1 | 6 | 83% |
| panzer.Panzer 0.2 | 5 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 817. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 42 | 52% | 99 |
| apc.botM 3.0 | 18 | 22% | 42 |
| lxx.ConceptA 0.8 | 9 | 11% | 23 |
| panzer.Panzer 0.2 | 6 | 7% | 9 |
| bayen.UbaMicro 1.4 | 3 | 4% | 11 |
| conscience.Electron 1.3g | 2 | 2% | 6 |
| vjik.UnViolation 1.1 | 1 | 1% | 15 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |

## Melee bench: F33

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.6 | 134 / 210 | 2.03 | 19.4% | 30567 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.4% | 134 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.8% | 12 |
| labg.Cataclysm 2.05 | 4.3 | 10.6% | 13 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.5% | 10 |
| baal.nano.N 1.42 | 6.0 | 8.4% | 3 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 7.8% | 3 |
| zyx.micro.Ant 1.1 | 8.3 | 5.8% | 1 |
| sanja.First 0.1 | 8.8 | 5.1% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 84.8 | 18 / 35 | 4842 |
| 2 | 1 | 71.1 | 94.3 | 24 / 35 | 5209 |
| 3 | 1 | 69.5 | 87.0 | 23 / 35 | 5544 |
| 4 | 1 | 69.8 | 90.2 | 23 / 35 | 5139 |
| 5 | 1 | 69.3 | 88.6 | 24 / 35 | 4912 |
| 6 | 1 | 69.0 | 86.7 | 22 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 60 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 92% |
| gre.svman4.Leonidas 1.3.2 | 18 | 94% |
| labg.Cataclysm 2.05 | 17 | 82% |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 67% |
| baal.nano.N 1.42 | 3 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 33 | 42% | 87 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 18% | 58 |
| gre.svman4.Leonidas 1.3.2 | 11 | 14% | 22 |
| labg.Cataclysm 2.05 | 10 | 13% | 26 |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 8% | 9 |
| baal.nano.N 1.42 | 3 | 4% | 5 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.5 | 93 / 210 | 2.30 | 17.9% | 29671 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.2 | 17.9% | 93 |
| stelo.Spread 0.9 | 2.3 | 16.3% | 62 |
| kid.Gladiator .7.2 | 2.5 | 16.1% | 38 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 12 |
| tcf.Reach 3 | 4.8 | 10.9% | 3 |
| cli.Dancer 1.1 | 6.0 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 6.7 | 7.0% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.5% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.2% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 86.0 | 17 / 35 | 5130 |
| 2 | 1 | 67.3 | 82.9 | 13 / 35 | 4765 |
| 3 | 2 | 66.5 | 81.3 | 12 / 35 | 4627 |
| 4 | 1 | 67.3 | 81.9 | 15 / 35 | 4560 |
| 5 | 1 | 70.6 | 90.5 | 20 / 35 | 5476 |
| 6 | 1 | 69.5 | 90.5 | 16 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 63 | 63% |
| kid.Gladiator .7.2 | 53 | 60% |
| jcs.Seth 1.8 | 16 | 81% |
| tcf.Reach 3 | 4 | 75% |
| ratosh.Wesco 1.4 | 3 | 67% |
| cli.Dancer 1.1 | 3 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 50 | 43% | 82 |
| kid.Gladiator .7.2 | 46 | 39% | 76 |
| tcf.Reach 3 | 6 | 5% | 10 |
| jcs.Seth 1.8 | 5 | 4% | 25 |
| cli.Dancer 1.1 | 5 | 4% | 9 |
| ratosh.Wesco 1.4 | 3 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 2% | 2 |

## Melee bench: F35

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.4 | 42 / 210 | 2.86 | 15.1% | 21070 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.0% | 135 |
| hadur117.mini.DeiseFAW 0.3 | 2.0 | 15.1% | 42 |
| gh.mini.Gruwel 0.9 | 3.2 | 13.4% | 21 |
| rz.HawkOnFire 0.1 | 3.8 | 12.4% | 4 |
| dmh.robocode.robot.BlackDeath 9.2 | 5.0 | 10.9% | 6 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.1% | 1 |
| wit.Chuliath 1.0 | 7.0 | 6.8% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.3 | 6.3% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.6% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 78.7 | 7 / 35 | 3533 |
| 2 | 2 | 63.8 | 80.6 | 8 / 35 | 3456 |
| 3 | 2 | 64.3 | 80.6 | 7 / 35 | 3676 |
| 4 | 2 | 63.7 | 78.7 | 10 / 35 | 3537 |
| 5 | 2 | 63.0 | 77.5 | 4 / 35 | 3391 |
| 6 | 2 | 63.4 | 80.0 | 6 / 35 | 3477 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 76 | 21% |
| gh.mini.Gruwel 0.9 | 16 | 63% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 78% |
| rz.HawkOnFire 0.1 | 8 | 75% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 0% |

Hadur died in 168 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 77 | 46% | 93 |
| gh.mini.Gruwel 0.9 | 40 | 24% | 50 |
| rz.HawkOnFire 0.1 | 26 | 15% | 34 |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 9% | 23 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.6 | 178 / 210 | 1.49 | 21.2% | 32490 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 21.2% | 178 |
| bzdp.Pansy 2.1 | 2.8 | 11.8% | 6 |
| alpha.RainingFire 1.0 | 3.2 | 11.8% | 10 |
| mz.Cork 0.1 | 4.7 | 10.3% | 6 |
| bvh.mini.Fenrir 0.39 | 5.0 | 10.0% | 2 |
| bvh.micro.Freya 0.3 | 5.5 | 9.5% | 3 |
| m3thos.Eva02 0.7.1 | 5.8 | 9.0% | 1 |
| dl.BetterWalls 1.0 | 8.7 | 5.9% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.7% | 2 |
| sample.MyFirstRobot 1.0 | 9.5 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.9 | 31 / 35 | 5354 |
| 2 | 1 | 71.9 | 95.6 | 30 / 35 | 5766 |
| 3 | 1 | 70.8 | 91.7 | 28 / 35 | 5363 |
| 4 | 1 | 73.0 | 100.0 | 35 / 35 | 5681 |
| 5 | 1 | 70.0 | 91.1 | 25 / 35 | 5232 |
| 6 | 1 | 70.6 | 93.0 | 29 / 35 | 5094 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 55 | 95% |
| mz.Cork 0.1 | 35 | 94% |
| bvh.micro.Freya 0.3 | 31 | 94% |
| alpha.RainingFire 1.0 | 28 | 93% |
| bvh.mini.Fenrir 0.39 | 23 | 96% |
| sample.MyFirstRobot 1.0 | 9 | 100% |
| m3thos.Eva02 0.7.1 | 4 | 100% |
| dl.BetterWalls 1.0 | 3 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 7 | 22% | 63 |
| alpha.RainingFire 1.0 | 7 | 22% | 32 |
| bvh.mini.Fenrir 0.39 | 6 | 19% | 14 |
| mz.Cork 0.1 | 4 | 13% | 36 |
| bvh.micro.Freya 0.3 | 4 | 13% | 30 |
| squidM.TentalceMeleeNano 1.1 | 2 | 6% | 8 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 13 |
| dl.BetterWalls 1.0 | 1 | 3% | 9 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F37

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.7 | 177 / 210 | 1.57 | 20.3% | 34140 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 20.3% | 177 |
| germ.TheMind .2 | 2.3 | 11.4% | 11 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 10.0% | 2 |
| EBBU.Sim2 1.02 | 4.5 | 9.6% | 1 |
| agrach.Dalek 1.0 | 6.2 | 8.6% | 4 |
| stelo.UntouchableNano 1.3 | 6.5 | 8.9% | 8 |
| lmk.ACPFinal 0.1 | 7.3 | 7.7% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 7.3 | 8.1% | 1 |
| mb.Beast 0.1 | 7.5 | 7.7% | 3 |
| skm.Ryubot 1.0 | 8.2 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 88.9 | 26 / 35 | 5499 |
| 2 | 1 | 66.9 | 85.4 | 24 / 35 | 5131 |
| 3 | 1 | 71.5 | 98.7 | 34 / 35 | 5925 |
| 4 | 1 | 70.5 | 96.2 | 31 / 35 | 5787 |
| 5 | 1 | 70.3 | 94.6 | 29 / 35 | 5969 |
| 6 | 1 | 71.2 | 98.1 | 33 / 35 | 5829 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 57 | 89% |
| stelo.UntouchableNano 1.3 | 29 | 83% |
| EBBU.Sim2 1.02 | 24 | 100% |
| agrach.Dalek 1.0 | 17 | 100% |
| skm.Ryubot 1.0 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 100% |
| mb.Beast 0.1 | 14 | 100% |
| lmk.ACPFinal 0.1 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 477. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 11 | 33% | 59 |
| stelo.UntouchableNano 1.3 | 8 | 24% | 27 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 15% | 23 |
| mb.Beast 0.1 | 3 | 9% | 19 |
| lmk.ACPFinal 0.1 | 3 | 9% | 15 |
| agrach.Dalek 1.0 | 2 | 6% | 34 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 9 |
| EBBU.Sim2 1.02 | 0 | 0% | 17 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

## Melee bench: F38

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.3 | 98 / 210 | 2.50 | 16.9% | 24457 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 16.9% | 98 |
| justin.Mallais 14.0 | 2.0 | 15.1% | 64 |
| bvh.mini.Freya 0.55 | 3.2 | 13.0% | 15 |
| cs.Wren 1.0 | 4.7 | 11.1% | 6 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.1% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.7% | 4 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.3% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 2 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.8 | 18 / 35 | 4273 |
| 2 | 1 | 67.3 | 87.3 | 19 / 35 | 4120 |
| 3 | 1 | 65.8 | 81.9 | 15 / 35 | 4124 |
| 4 | 1 | 64.0 | 78.4 | 11 / 35 | 3779 |
| 5 | 1 | 65.6 | 81.3 | 17 / 35 | 3947 |
| 6 | 1 | 66.9 | 86.0 | 18 / 35 | 4214 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 44 | 64% |
| cs.Wren 1.0 | 23 | 87% |
| bvh.mini.Freya 0.55 | 22 | 77% |
| davidalves.net.DuelistNanoMelee 1.01 | 18 | 89% |
| bts.mega.Gnarly 1.4 | 18 | 67% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 33% |

Hadur died in 113 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 39 | 35% | 71 |
| bvh.mini.Freya 0.55 | 25 | 22% | 34 |
| bts.mega.Gnarly 1.4 | 18 | 16% | 38 |
| cs.Wren 1.0 | 14 | 12% | 28 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 7% | 24 |
| kdf.KoulDestroyer 1.0 | 6 | 5% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.3 | 96 / 210 | 2.68 | 16.9% | 27076 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 16.9% | 96 |
| bvh.fry.Freya 0.82 | 2.3 | 14.6% | 23 |
| az.Ololobot 0.2.4 | 2.7 | 13.7% | 62 |
| catcat20.Lambda 0.024 | 4.0 | 11.4% | 19 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.0% | 10 |
| gimp.GimpBot 0.1 | 6.3 | 8.1% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.0% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 80.3 | 18 / 35 | 4601 |
| 2 | 1 | 65.7 | 80.6 | 15 / 35 | 4733 |
| 3 | 1 | 66.3 | 83.2 | 19 / 35 | 4431 |
| 4 | 1 | 63.8 | 79.0 | 10 / 35 | 4289 |
| 5 | 1 | 64.9 | 80.3 | 16 / 35 | 4235 |
| 6 | 1 | 66.8 | 84.4 | 18 / 35 | 4787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 45 | 44% |
| bvh.fry.Freya 0.82 | 38 | 87% |
| catcat20.Lambda 0.024 | 33 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 38 | 33% | 71 |
| az.Ololobot 0.2.4 | 33 | 29% | 57 |
| catcat20.Lambda 0.024 | 13 | 11% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 10% | 16 |
| gimp.GimpBot 0.1 | 7 | 6% | 10 |
| winamp32.micro.MicroMacro 1.0 | 5 | 4% | 7 |
| apollokidd.ApolloKidd 0.9 | 4 | 3% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 3 | 3% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 122 / 210 | 2.25 | 18.4% | 27790 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.4% | 122 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 33 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 22 |
| mz.AntiGrav 1.0 | 4.2 | 11.1% | 8 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.8% | 13 |
| alpha.BlackIce 1.0 | 6.5 | 8.2% | 1 |
| stelo.Randomness 1.0 | 6.5 | 8.4% | 9 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.4% | 2 |
| sample.Corners 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 21 / 35 | 4581 |
| 2 | 1 | 66.4 | 81.6 | 22 / 35 | 4275 |
| 3 | 1 | 69.8 | 90.2 | 23 / 35 | 5263 |
| 4 | 1 | 69.5 | 90.8 | 19 / 35 | 4886 |
| 5 | 1 | 67.8 | 84.4 | 21 / 35 | 4749 |
| 6 | 1 | 66.8 | 85.7 | 16 / 35 | 4036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 57 | 72% |
| kano.gamma.KanoGamma 1.8 | 33 | 70% |
| Polkwane.SmashMelee 1.0 | 22 | 82% |
| mz.AntiGrav 1.0 | 19 | 100% |
| stelo.Randomness 1.0 | 12 | 67% |
| alpha.BlackIce 1.0 | 8 | 100% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 32 | 36% | 57 |
| kano.gamma.KanoGamma 1.8 | 23 | 26% | 51 |
| Polkwane.SmashMelee 1.0 | 12 | 14% | 29 |
| stelo.Randomness 1.0 | 6 | 7% | 17 |
| alpha.BlackIce 1.0 | 6 | 7% | 14 |
| mz.AntiGrav 1.0 | 5 | 6% | 22 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 10 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 84.1 | 98 / 210 | 2.43 | 17.0% | 23932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 17.0% | 98 |
| eem.EvBotNG v12.8 | 2.0 | 15.9% | 72 |
| ary.Swarm 1.1 | 3.5 | 13.0% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.9% | 14 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.2% | 12 |
| shrub.Silver v048 | 6.2 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 6.8 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 2 |
| stelo.Mirror 1.1 | 8.8 | 5.4% | 1 |
| acogdev.alpha 0.2 | 9.8 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.4 | 16 / 35 | 3723 |
| 2 | 1 | 67.3 | 86.7 | 15 / 35 | 4040 |
| 3 | 1 | 66.3 | 83.5 | 16 / 35 | 3919 |
| 4 | 1 | 65.6 | 79.7 | 16 / 35 | 3969 |
| 5 | 1 | 67.3 | 86.0 | 19 / 35 | 4201 |
| 6 | 1 | 66.7 | 84.4 | 16 / 35 | 4080 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 62 | 47% |
| lessonz.robocode.Oz 0.5.0 | 31 | 81% |
| ary.Swarm 1.1 | 26 | 81% |
| simonton.nano.MeleeSeed 1.8 | 20 | 95% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 907. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 43% | 79 |
| ary.Swarm 1.1 | 27 | 24% | 52 |
| lessonz.robocode.Oz 0.5.0 | 15 | 13% | 31 |
| simonton.nano.MeleeSeed 1.8 | 10 | 9% | 25 |
| shrub.Silver v048 | 3 | 3% | 9 |
| stelo.Mirror 1.1 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 2 | 2% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 87.4 | 120 / 210 | 2.13 | 18.6% | 30821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 18.6% | 120 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 46 |
| ara.Shera 0.88 | 3.3 | 13.3% | 22 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.3% | 16 |
| amz.NanoClone 1.41 | 5.2 | 8.4% | 2 |
| dsw.StaticD 1.0 | 6.5 | 7.0% | 3 |
| maribo.IotaCT 1.1 | 6.5 | 7.3% | 1 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 4.9% | 0 |
| mme.NikeEnhanced 2.0 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.7 | 16 / 35 | 4870 |
| 2 | 1 | 68.8 | 86.7 | 19 / 35 | 5311 |
| 3 | 1 | 70.3 | 91.1 | 27 / 35 | 5573 |
| 4 | 1 | 67.3 | 84.8 | 18 / 35 | 4736 |
| 5 | 1 | 69.1 | 89.8 | 20 / 35 | 5410 |
| 6 | 1 | 68.3 | 85.4 | 20 / 35 | 4921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 61 | 79% |
| ara.Shera 0.88 | 37 | 81% |
| maribo.mini.MiniQuester 0.1 | 37 | 92% |
| dsw.StaticD 1.0 | 7 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 0% |

Hadur died in 91 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 40% | 88 |
| maribo.mini.MiniQuester 0.1 | 22 | 24% | 54 |
| ara.Shera 0.88 | 20 | 22% | 45 |
| amz.NanoClone 1.41 | 8 | 9% | 11 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 3 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| dsw.StaticD 1.0 | 0 | 0% | 5 |

## Melee bench: F43

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 75.6 | 30 / 210 | 3.20 | 14.5% | 21850 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 146 |
| hadur117.mini.DeiseFAW 0.3 | 2.2 | 14.5% | 30 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.8% | 26 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.7% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.4% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.7 | 6.7% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 73.7 | 4 / 35 | 3527 |
| 2 | 3 | 61.4 | 69.2 | 4 / 35 | 3307 |
| 3 | 2 | 65.1 | 78.7 | 9 / 35 | 3685 |
| 4 | 2 | 65.2 | 80.6 | 6 / 35 | 3800 |
| 5 | 2 | 63.9 | 75.6 | 5 / 35 | 3880 |
| 6 | 2 | 63.3 | 75.6 | 2 / 35 | 3651 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 72 | 18% |
| brainfade.melee.Dusk 0.44 | 13 | 46% |
| dummy.micro.Sparrow 2.5 | 4 | 75% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 100% |
| mz.NanoGod 2.02 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| jab.DiamondStealer 5 | 1 | 0% |

Hadur died in 180 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 49% | 103 |
| brainfade.melee.Dusk 0.44 | 45 | 25% | 50 |
| dummy.micro.Sparrow 2.5 | 17 | 9% | 21 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 6 | 3% | 9 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.4 | 131 / 210 | 1.87 | 19.7% | 31762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.7% | 131 |
| tzu.TheArtOfWar 1.2 | 2.5 | 14.9% | 26 |
| stelo.Liblix 0.3.1 | 2.5 | 14.8% | 46 |
| wompi.Quokka 1.6 | 4.3 | 10.1% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.2% | 1 |
| jwirde.Gort 2.0 | 5.7 | 8.7% | 3 |
| disan.Chair 2.2.0 | 6.8 | 7.9% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.3% | 0 |
| sample.Crazy 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.7 | 24 / 35 | 4941 |
| 2 | 1 | 70.2 | 88.6 | 22 / 35 | 5536 |
| 3 | 1 | 70.0 | 90.2 | 23 / 35 | 5319 |
| 4 | 1 | 69.5 | 89.8 | 21 / 35 | 5340 |
| 5 | 1 | 69.8 | 88.6 | 19 / 35 | 5360 |
| 6 | 1 | 70.1 | 92.4 | 22 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 77 | 74% |
| tzu.TheArtOfWar 1.2 | 55 | 84% |
| wompi.Quokka 1.6 | 9 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| jwirde.Gort 2.0 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 4 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 38 | 47% | 99 |
| tzu.TheArtOfWar 1.2 | 27 | 33% | 72 |
| wompi.Quokka 1.6 | 7 | 9% | 12 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 4% | 8 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 1 |
| jwirde.Gort 2.0 | 0 | 0% | 10 |
| disan.Chair 2.2.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.0 | 86 / 210 | 2.08 | 19.6% | 35335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAW 0.3 | 1.0 | 19.6% | 86 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.1% | 107 |
| jje.BagPuss 1.2 | 2.8 | 11.9% | 6 |
| sul.Lunar 1.1 | 4.3 | 10.4% | 3 |
| myl.nano.Graviton 1.10 | 5.0 | 9.8% | 3 |
| pez.mini.ChironexFleckeri 0.5 | 6.0 | 8.9% | 3 |
| hvilela.HVilela 0.9 | 7.0 | 8.3% | 1 |
| fm.claire 1.7 | 7.7 | 7.8% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.6% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.0 | 10 / 35 | 5723 |
| 2 | 1 | 70.3 | 90.5 | 17 / 35 | 6070 |
| 3 | 1 | 68.4 | 83.5 | 12 / 35 | 6029 |
| 4 | 1 | 68.9 | 88.3 | 15 / 35 | 5480 |
| 5 | 1 | 70.7 | 93.0 | 18 / 35 | 6128 |
| 6 | 1 | 68.9 | 85.7 | 14 / 35 | 5905 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 109 | 25% |
| sul.Lunar 1.1 | 21 | 100% |
| jje.BagPuss 1.2 | 14 | 86% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 78% |
| wit.Deep7 2.0 | 4 | 75% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 2298. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 86 | 69% | 0 |
| jje.BagPuss 1.2 | 17 | 14% | 64 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 5% | 27 |
| sul.Lunar 1.1 | 5 | 4% | 55 |
| myl.nano.Graviton 1.10 | 5 | 4% | 35 |
| fm.claire 1.7 | 3 | 2% | 11 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| hvilela.HVilela 0.9 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 4 |

## Melee bench: F46

hadur117.mini.DeiseFAW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.4 | 63 / 210 | 2.49 | 16.3% | 24547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.5 | 16.9% | 86 |
| hadur117.mini.DeiseFAW 0.3 | 2.2 | 16.3% | 63 |
| kc.mini.Mirage 0.2 | 2.3 | 16.3% | 53 |
| mz.MicroSheep 1.0 | 4.2 | 10.6% | 2 |
| cx.Princess 1.0 | 5.2 | 9.7% | 5 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 6.7 | 7.8% | 3 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.5% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.7% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.5 | 85.7 | 12 / 35 | 4123 |
| 2 | 2 | 65.2 | 82.9 | 10 / 35 | 4193 |
| 3 | 2 | 65.8 | 84.4 | 10 / 35 | 4223 |
| 4 | 3 | 64.5 | 79.4 | 11 / 35 | 3891 |
| 5 | 3 | 64.7 | 81.6 | 9 / 35 | 3817 |
| 6 | 1 | 66.5 | 86.7 | 11 / 35 | 4300 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 50 | 56% |
| rsalesc.melee.Medina 0.4.5 | 47 | 30% |
| mz.MicroSheep 1.0 | 10 | 80% |
| cx.Princess 1.0 | 10 | 70% |
| arthord.NanoSatanMelee Beta | 6 | 83% |

Hadur died in 148 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 42% | 95 |
| rsalesc.melee.Medina 0.4.5 | 52 | 35% | 63 |
| mz.MicroSheep 1.0 | 12 | 8% | 19 |
| cx.Princess 1.0 | 8 | 5% | 14 |
| sadoner.killer 0.2 | 8 | 5% | 11 |
| arthord.NanoSatanMelee Beta | 5 | 3% | 7 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

