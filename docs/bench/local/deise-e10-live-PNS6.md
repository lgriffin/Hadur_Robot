# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 88.0 | 60 / 210 | 2.08 | 17.3% | 29123 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.1% | 140 |
| hadur117.mini.DeisePNS6 0.4 | 2.0 | 17.3% | 60 |
| sgp.JollyNinja 3.53 | 3.7 | 11.4% | 7 |
| mz.MicroGodMelee 1 | 4.3 | 10.9% | 3 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 9.4% | 0 |
| adt.Ar2 1.0 | 7.0 | 7.3% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.3% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.3% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 86.3 | 12 / 35 | 4793 |
| 2 | 2 | 67.6 | 87.0 | 5 / 35 | 5425 |
| 3 | 2 | 67.5 | 91.4 | 13 / 35 | 4297 |
| 4 | 2 | 67.7 | 88.6 | 12 / 35 | 4972 |
| 5 | 2 | 67.2 | 86.3 | 11 / 35 | 4849 |
| 6 | 2 | 66.9 | 88.6 | 7 / 35 | 4787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 133 | 12% |
| mz.MicroGodMelee 1 | 18 | 83% |
| sgp.JollyNinja 3.53 | 12 | 83% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 100% |
| lorneswork.Predator 1.0 | 7 | 100% |
| adt.Ar2 1.0 | 3 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1285. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 81% | 147 |
| sgp.JollyNinja 3.53 | 10 | 7% | 18 |
| mz.MicroGodMelee 1 | 8 | 5% | 21 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 12 |
| lorneswork.Predator 1.0 | 1 | 1% | 6 |
| adt.Ar2 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.4 | 112 / 210 | 2.40 | 18.0% | 28239 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 18.0% | 112 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 14.0% | 35 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.5% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.2% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.9% | 12 |
| Noran.BitchingElk 0.054 | 6.8 | 7.6% | 12 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.7% | 1 |
| sch.Simone 0.3d | 7.3 | 7.4% | 6 |
| stelo.PatternRobot 1.0 | 8.7 | 6.4% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 84.8 | 15 / 35 | 4837 |
| 2 | 1 | 67.5 | 85.1 | 21 / 35 | 4581 |
| 3 | 1 | 66.5 | 83.8 | 18 / 35 | 4269 |
| 4 | 1 | 65.4 | 79.0 | 15 / 35 | 4649 |
| 5 | 1 | 69.4 | 89.2 | 25 / 35 | 5051 |
| 6 | 1 | 67.2 | 84.8 | 18 / 35 | 4852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 81% |
| pulsar.PulsarMax 0.8.9 | 41 | 63% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 83% |
| Noran.BitchingElk 0.054 | 9 | 44% |
| sch.Simone 0.3d | 8 | 88% |
| stelo.PatternRobot 1.0 | 5 | 80% |
| fullsail.SweetTea 1.1 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 37% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 21% | 66 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 9% | 17 |
| stelo.PatternRobot 1.0 | 8 | 8% | 9 |
| Noran.BitchingElk 0.054 | 7 | 7% | 14 |
| fnc.bandit.Bandit 5.2.0 | 7 | 7% | 9 |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 6% | 17 |
| sch.Simone 0.3d | 3 | 3% | 11 |
| fullsail.SweetTea 1.1 | 1 | 1% | 4 |

## Melee bench: F03

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 94.6 | 164 / 210 | 1.49 | 20.7% | 37160 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 20.7% | 164 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.2% | 11 |
| radnor.DoctorBob 1.42 | 3.0 | 13.1% | 12 |
| vuen.Cake 2.51 | 3.3 | 12.7% | 20 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.8 | 7.1% | 1 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.5 | 6.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 5.9% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 95.9 | 29 / 35 | 6232 |
| 2 | 1 | 71.4 | 95.9 | 28 / 35 | 6182 |
| 3 | 1 | 70.7 | 93.0 | 26 / 35 | 6184 |
| 4 | 1 | 70.4 | 93.3 | 26 / 35 | 6032 |
| 5 | 1 | 71.5 | 96.2 | 28 / 35 | 6576 |
| 6 | 1 | 70.4 | 93.0 | 27 / 35 | 5954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 78% |
| kawigi.nano.Lib 1.0 | 63 | 97% |
| radnor.DoctorBob 1.42 | 39 | 95% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| adt.Ar1 2.1 | 4 | 75% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 18 | 39% | 73 |
| radnor.DoctorBob 1.42 | 13 | 28% | 44 |
| kawigi.nano.Lib 1.0 | 9 | 20% | 66 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 7% | 6 |
| adt.Ar1 2.1 | 2 | 4% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 1 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |
| urdos.URDOS 1.3 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.5 | 33 / 210 | 2.13 | 17.5% | 32860 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 170 |
| hadur117.mini.DeisePNS6 0.4 | 2.0 | 17.5% | 33 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.3% | 2 |
| josago.Jorgito 0.16 | 5.0 | 9.2% | 0 |
| css.Delitioner 0.11 | 6.5 | 7.1% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 7.0% | 1 |
| rampancy.Durandal 2.1d | 7.8 | 5.7% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 3.8% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.3 | 86.0 | 3 / 35 | 5237 |
| 2 | 2 | 67.3 | 85.7 | 3 / 35 | 5095 |
| 3 | 2 | 68.8 | 88.3 | 7 / 35 | 5781 |
| 4 | 2 | 68.9 | 88.9 | 8 / 35 | 5617 |
| 5 | 2 | 68.6 | 88.9 | 6 / 35 | 5516 |
| 6 | 2 | 68.1 | 87.0 | 6 / 35 | 5614 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 167 | 17% |
| apc.LeeroyJenkins2 1.0 | 4 | 75% |
| TNT.TNT 0.99.1 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 0% |

Hadur died in 178 of 210 rounds, at a mean tick of 1516. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 85% | 177 |
| apc.LeeroyJenkins2 1.0 | 12 | 7% | 18 |
| josago.Jorgito 0.16 | 4 | 2% | 4 |
| TNT.TNT 0.99.1 | 3 | 2% | 5 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 3 | 2% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 76.9 | 38 / 210 | 3.08 | 14.5% | 20966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.0% | 101 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 50 |
| hadur117.mini.DeisePNS6 0.4 | 3.0 | 14.5% | 38 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 15 |
| ms.Ares 0.19 | 5.0 | 9.5% | 3 |
| axeBots.HataMoto 3.09 | 6.0 | 8.4% | 3 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.3 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.7 | 77.8 | 5 / 35 | 3354 |
| 2 | 3 | 61.9 | 74.0 | 4 / 35 | 3405 |
| 3 | 3 | 64.4 | 79.7 | 9 / 35 | 3762 |
| 4 | 3 | 62.9 | 78.4 | 6 / 35 | 3554 |
| 5 | 3 | 61.0 | 71.7 | 4 / 35 | 3447 |
| 6 | 3 | 63.6 | 79.7 | 10 / 35 | 3444 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 44 | 41% |
| cb.fire.Firestarter 2.0f | 38 | 18% |
| wompi.Numbat 2.1 | 13 | 92% |
| axeBots.HataMoto 3.09 | 1 | 100% |
| ms.Ares 0.19 | 1 | 0% |

Hadur died in 172 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 69 | 40% | 79 |
| justin.DemonicRage 3.4 | 54 | 31% | 68 |
| wompi.Numbat 2.1 | 27 | 16% | 38 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| axeBots.HataMoto 3.09 | 5 | 3% | 6 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 4 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.3 | 111 / 210 | 2.23 | 18.2% | 28789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 18.2% | 111 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 25 |
| origin.SleepSiphon 1.7b | 3.0 | 13.2% | 40 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.4% | 28 |
| mld.Wisdom 1.0 | 5.0 | 10.5% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 1 |
| DBall.NUKE 0.1 | 7.8 | 6.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.4% | 2 |
| spinnercat.Omen 1.0 | 8.2 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 83.2 | 14 / 35 | 4675 |
| 2 | 1 | 67.6 | 85.1 | 18 / 35 | 4620 |
| 3 | 1 | 70.1 | 91.4 | 22 / 35 | 5585 |
| 4 | 1 | 66.3 | 81.6 | 17 / 35 | 4603 |
| 5 | 1 | 68.4 | 88.6 | 19 / 35 | 4665 |
| 6 | 1 | 68.6 | 88.3 | 21 / 35 | 4641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 48 | 69% |
| jekl.StoneGhost 0.7 | 45 | 84% |
| pe.minimelee.SandboxMiniMelee 1.1 | 32 | 75% |
| gg.Wolverine 2.0 | 8 | 88% |
| mld.Wisdom 1.0 | 6 | 67% |
| spinnercat.Omen 1.0 | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 30% | 54 |
| origin.SleepSiphon 1.7b | 26 | 25% | 66 |
| jekl.StoneGhost 0.7 | 24 | 23% | 51 |
| mld.Wisdom 1.0 | 10 | 10% | 14 |
| gg.Wolverine 2.0 | 8 | 8% | 10 |
| spinnercat.Omen 1.0 | 2 | 2% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 7 |
| sample.Fire 1.0 | 0 | 0% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.2 | 128 / 210 | 1.61 | 19.9% | 34253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.9% | 128 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.2% | 37 |
| rtk.Tachikoma 1.0 | 2.7 | 17.0% | 29 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.0% | 10 |
| franzor.Lizt 1.3.1 | 4.8 | 10.5% | 7 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.2% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 94.9 | 22 / 35 | 5622 |
| 2 | 1 | 71.2 | 93.3 | 21 / 35 | 5600 |
| 3 | 1 | 71.1 | 91.7 | 21 / 35 | 5925 |
| 4 | 1 | 71.5 | 92.7 | 22 / 35 | 5634 |
| 5 | 1 | 71.3 | 93.3 | 20 / 35 | 5566 |
| 6 | 1 | 71.6 | 93.0 | 22 / 35 | 5906 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 106 | 83% |
| rsalesc.melee.Monk 0.3.6c | 40 | 28% |
| oog.melee.CapuletDroid 1.1 | 30 | 77% |
| franzor.Lizt 1.3.1 | 9 | 56% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1558. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 39 | 48% | 60 |
| rtk.Tachikoma 1.0 | 30 | 37% | 117 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 26 |
| franzor.Lizt 1.3.1 | 4 | 5% | 1 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 15 over 6 battles (2.5 per battle, most in one battle 5). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.0 | 132 / 210 | 1.72 | 19.7% | 30573 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.7% | 132 |
| tm.Yuugao 1.0 | 2.3 | 13.5% | 39 |
| shrub.Vapour v159 | 2.8 | 12.4% | 24 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.2% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.3% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.1% | 4 |
| m3thos.Eva00 1.1 | 6.5 | 7.7% | 0 |
| qualidafial.MajorDick 1.0.1 | 8.2 | 6.6% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.7% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 89.8 | 19 / 35 | 5249 |
| 2 | 1 | 68.6 | 90.8 | 18 / 35 | 4891 |
| 3 | 1 | 69.6 | 95.2 | 22 / 35 | 4777 |
| 4 | 1 | 69.8 | 91.1 | 23 / 35 | 5511 |
| 5 | 1 | 69.6 | 92.1 | 24 / 35 | 5188 |
| 6 | 1 | 69.9 | 92.7 | 26 / 35 | 4957 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 68 | 68% |
| shrub.Vapour v159 | 36 | 72% |
| Krabb.sliNk.Garm 0.9u | 35 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 6 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 32 | 40% | 76 |
| shrub.Vapour v159 | 23 | 28% | 55 |
| Krabb.sliNk.Garm 0.9u | 15 | 19% | 37 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 5% | 20 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 15 |
| m3thos.Eva00 1.1 | 1 | 1% | 2 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| zyx.nano.BacillusComma 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.5 | 71 / 210 | 2.85 | 16.3% | 24697 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.2% | 93 |
| hadur117.mini.DeisePNS6 0.4 | 1.7 | 16.3% | 71 |
| kc.micro.Figment 1.0 | 3.3 | 13.4% | 17 |
| yagami.Tidus 0.11 | 4.2 | 10.9% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.3% | 15 |
| mc2.enemy.Original 0.9 | 5.5 | 9.6% | 9 |
| dft.Calliope 5.6 | 7.0 | 7.1% | 3 |
| step.nanoPri 1.0 | 8.5 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.0% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 83.5 | 13 / 35 | 4363 |
| 2 | 1 | 66.2 | 80.3 | 15 / 35 | 4488 |
| 3 | 2 | 63.9 | 77.5 | 9 / 35 | 3904 |
| 4 | 2 | 65.6 | 81.3 | 11 / 35 | 4074 |
| 5 | 2 | 63.8 | 75.6 | 11 / 35 | 3716 |
| 6 | 2 | 65.1 | 78.7 | 12 / 35 | 4152 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 67 | 36% |
| kc.micro.Figment 1.0 | 21 | 90% |
| pedersen.Grishnakh 1.0 | 13 | 54% |
| mc2.enemy.Original 0.9 | 13 | 69% |
| yagami.Tidus 0.11 | 8 | 100% |
| dft.Calliope 5.6 | 3 | 67% |
| rdm.Dueler 0.4x | 2 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 987. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 71 | 51% | 97 |
| kc.micro.Figment 1.0 | 20 | 14% | 43 |
| pedersen.Grishnakh 1.0 | 15 | 11% | 16 |
| yagami.Tidus 0.11 | 14 | 10% | 23 |
| mc2.enemy.Original 0.9 | 9 | 6% | 18 |
| dft.Calliope 5.6 | 7 | 5% | 8 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 3 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |
| step.nanoPri 1.0 | 0 | 0% | 1 |

## Melee bench: F10

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.1 | 173 / 210 | 1.53 | 20.3% | 32625 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 20.3% | 173 |
| DTF.Kludgy 1.2b | 2.2 | 13.8% | 15 |
| ne.Chimera 1.2 | 2.8 | 12.8% | 9 |
| ejb.Polaris 1.0.1 | 4.0 | 11.9% | 6 |
| vStar.RAFzilla 2.15 | 5.5 | 9.8% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 5 |
| kurios.DOSexe .9b | 7.7 | 5.8% | 0 |
| sam.Samspin 1.0 | 8.2 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 96.2 | 32 / 35 | 5392 |
| 2 | 1 | 70.1 | 94.3 | 28 / 35 | 5021 |
| 3 | 1 | 69.8 | 89.8 | 26 / 35 | 5335 |
| 4 | 1 | 71.2 | 94.6 | 31 / 35 | 5572 |
| 5 | 1 | 71.1 | 95.9 | 30 / 35 | 5608 |
| 6 | 1 | 70.7 | 94.0 | 26 / 35 | 5697 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 87% |
| ejb.Polaris 1.0.1 | 50 | 98% |
| ne.Chimera 1.2 | 29 | 90% |
| vStar.RAFzilla 2.15 | 18 | 100% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| donjezza.Muncho 1.0 | 8 | 100% |
| kurios.DOSexe .9b | 5 | 100% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 37 of 210 rounds, at a mean tick of 785. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 19 | 51% | 71 |
| ne.Chimera 1.2 | 6 | 16% | 24 |
| ejb.Polaris 1.0.1 | 5 | 14% | 50 |
| vStar.RAFzilla 2.15 | 3 | 8% | 23 |
| tvv.micro.Antares 1.1.1 | 3 | 8% | 14 |
| sam.Samspin 1.0 | 1 | 3% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 14 |
| donjezza.Muncho 1.0 | 0 | 0% | 9 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.3 | 98 / 210 | 2.32 | 17.7% | 26643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.3 | 17.7% | 98 |
| rz.Aleph 0.34 | 1.7 | 16.4% | 61 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.7% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 10.6% | 13 |
| rdt199.Warlord 0.73 | 5.5 | 8.9% | 6 |
| br2.MobyDickBot 1.6 | 5.8 | 8.4% | 9 |
| uji.YellohFellah 1.0 | 6.7 | 7.9% | 5 |
| KiraNL.Chupacabra 0.4 | 8.0 | 7.3% | 0 |
| stelo.MirrorNano 1.3 | 9.3 | 5.3% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 85.7 | 14 / 35 | 4220 |
| 2 | 1 | 66.9 | 82.9 | 16 / 35 | 4683 |
| 3 | 2 | 66.1 | 82.5 | 14 / 35 | 4347 |
| 4 | 1 | 67.8 | 88.6 | 18 / 35 | 4458 |
| 5 | 2 | 65.8 | 81.6 | 15 / 35 | 4325 |
| 6 | 1 | 68.6 | 90.5 | 21 / 35 | 4610 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 73 | 62% |
| djc.DynaBot 0.1.1 | 22 | 82% |
| cx.mini.Nimrod 0.55 | 16 | 69% |
| uji.YellohFellah 1.0 | 10 | 90% |
| br2.MobyDickBot 1.6 | 9 | 78% |
| rdt199.Warlord 0.73 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 930. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 52 | 46% | 95 |
| cx.mini.Nimrod 0.55 | 28 | 25% | 39 |
| djc.DynaBot 0.1.1 | 12 | 11% | 27 |
| rdt199.Warlord 0.73 | 8 | 7% | 16 |
| br2.MobyDickBot 1.6 | 4 | 4% | 11 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 4 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| uji.YellohFellah 1.0 | 2 | 2% | 13 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 2 |

## Melee bench: F12

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.2 | 141 / 210 | 2.24 | 18.3% | 24547 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 18.3% | 141 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.2% | 22 |
| nat.PallasHawk 1.0 | 3.2 | 12.6% | 18 |
| darkcanuck.Leon 1.01 | 3.3 | 12.7% | 20 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.6% | 6 |
| jrm.Test0 1.0 | 6.8 | 8.1% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.2% | 0 |
| jp.Perpy 16.0 | 8.2 | 6.3% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.6% | 3 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.6 | 24 / 35 | 4231 |
| 2 | 1 | 66.6 | 82.9 | 22 / 35 | 3852 |
| 3 | 1 | 68.1 | 87.3 | 26 / 35 | 4125 |
| 4 | 1 | 68.6 | 89.5 | 24 / 35 | 4153 |
| 5 | 1 | 66.6 | 82.2 | 21 / 35 | 4100 |
| 6 | 1 | 68.2 | 87.6 | 24 / 35 | 4086 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 45 | 93% |
| bts.wiki.RipCurl 0.9b | 43 | 91% |
| darkcanuck.Leon 1.01 | 38 | 89% |
| brainfade.melee.Genghis 0.36 | 21 | 86% |
| jaybot.bots.Oddball 4.0 | 4 | 75% |
| jrm.Test0 1.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 16 | 23% | 59 |
| bts.wiki.RipCurl 0.9b | 15 | 22% | 41 |
| brainfade.melee.Genghis 0.36 | 13 | 19% | 22 |
| darkcanuck.Leon 1.01 | 10 | 14% | 54 |
| cs.sheldor.Talon 1.1 | 6 | 9% | 11 |
| jrm.Test0 1.0 | 5 | 7% | 8 |
| jaybot.bots.Oddball 4.0 | 2 | 3% | 7 |
| jp.Perpy 16.0 | 2 | 3% | 4 |
| stuff.Vlad 0.1 | 0 | 0% | 2 |

## Melee bench: F13

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 19 over 6 battles (3.2 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.2 | 91 / 210 | 2.15 | 17.1% | 25403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.2 | 17.1% | 91 |
| ags.Glacier 0.2.11 | 2.3 | 16.0% | 39 |
| mn.Combat 3.25.0 | 2.5 | 15.8% | 62 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.4% | 5 |
| shinh.Entangled 0.3 | 4.5 | 11.7% | 12 |
| apc.Colossus2 0.17 | 6.2 | 7.9% | 0 |
| stelo.Wang 1.0 | 6.8 | 7.0% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.2% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 83.5 | 14 / 35 | 4271 |
| 2 | 1 | 66.7 | 86.7 | 14 / 35 | 4319 |
| 3 | 1 | 67.0 | 87.0 | 14 / 35 | 4357 |
| 4 | 1 | 66.8 | 88.9 | 14 / 35 | 4041 |
| 5 | 1 | 67.1 | 86.7 | 16 / 35 | 4119 |
| 6 | 1 | 68.1 | 90.5 | 19 / 35 | 4296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ags.Glacier 0.2.11 | 71 | 76% |
| mn.Combat 3.25.0 | 53 | 38% |
| shinh.Entangled 0.3 | 15 | 67% |
| gh.micro.Gruweltje 0.7 | 4 | 100% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 53 | 44% | 73 |
| ags.Glacier 0.2.11 | 32 | 27% | 77 |
| shinh.Entangled 0.3 | 21 | 18% | 36 |
| gh.micro.Gruweltje 0.7 | 10 | 8% | 16 |
| stelo.Wang 1.0 | 2 | 2% | 5 |
| apc.Colossus2 0.17 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 26 over 6 battles (4.3 per battle, most in one battle 24). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.9 | 165 / 210 | 1.46 | 20.5% | 32322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 20.5% | 165 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 18 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.5% | 23 |
| co.edu.usb.rc.LidisTron 1.0 | 5.0 | 9.5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 8.8% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.2% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.0 | 8.8% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.8 | 7.7% | 1 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 92.4 | 24 / 35 | 4947 |
| 2 | 1 | 70.8 | 95.6 | 30 / 35 | 5108 |
| 3 | 1 | 72.6 | 99.0 | 32 / 35 | 5771 |
| 4 | 1 | 70.4 | 94.0 | 26 / 35 | 5202 |
| 5 | 1 | 71.9 | 96.5 | 28 / 35 | 5787 |
| 6 | 1 | 70.4 | 91.7 | 25 / 35 | 5507 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 96 | 92% |
| catcat20.shape.Theta 0.018 | 50 | 76% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| pa.Improved 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 45 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 23 | 51% | 54 |
| simonton.micro.Sprout 1.1.3 | 20 | 44% | 106 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 17 |
| sheldor.micro.PointInLineRRAL 1.0 | 0 | 0% | 12 |
| dmh.robocode.robot.RedDwarf 0.4 | 0 | 0% | 6 |
| pa.Improved 1.0 | 0 | 0% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |

## Melee bench: F15

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 85.0 | 121 / 210 | 2.35 | 18.5% | 30825 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 18.5% | 121 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.8% | 17 |
| emp.Yngwie 1.11 | 3.0 | 13.0% | 45 |
| mld.DustBunny 3.8 | 4.3 | 11.7% | 3 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.3% | 10 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.6% | 14 |
| lambdaxy.TBot 0.1 | 7.0 | 6.9% | 0 |
| Grystrion.TrackerWO 1.0 | 8.5 | 5.8% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.2% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.5 | 22 / 35 | 5144 |
| 2 | 1 | 66.8 | 81.0 | 17 / 35 | 5027 |
| 3 | 1 | 68.5 | 85.4 | 23 / 35 | 5012 |
| 4 | 1 | 67.7 | 84.1 | 20 / 35 | 4958 |
| 5 | 1 | 69.3 | 88.6 | 20 / 35 | 5466 |
| 6 | 1 | 67.5 | 81.3 | 19 / 35 | 5218 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 44 | 75% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| cb.nano.Insomnia 1.0 | 22 | 86% |
| mld.DustBunny 3.8 | 21 | 90% |
| kawigi.robot.Girl 1.2 | 16 | 94% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 22 | 24% | 74 |
| cb.nano.Insomnia 1.0 | 19 | 21% | 17 |
| kawigi.micro.Shiz 1.1 | 18 | 20% | 50 |
| mld.DustBunny 3.8 | 12 | 13% | 35 |
| kawigi.robot.Girl 1.2 | 11 | 12% | 15 |
| lambdaxy.TBot 0.1 | 5 | 5% | 6 |
| divineomega.TrialBot 0.003 | 2 | 2% | 13 |
2 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.4 | 110 / 210 | 2.14 | 19.0% | 32937 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.0% | 110 |
| gh.Griezel 0.5.2 | 2.0 | 17.0% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.3% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 9.9% | 18 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 1 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.7% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.5% | 2 |
| asd.Cthulhu 1.3 | 8.7 | 4.9% | 0 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 4.8% | 5 |
| repositorio.NanoStep 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 84.8 | 18 / 35 | 5205 |
| 2 | 1 | 69.1 | 87.6 | 18 / 35 | 5203 |
| 3 | 1 | 70.9 | 90.5 | 22 / 35 | 6113 |
| 4 | 1 | 69.4 | 87.9 | 20 / 35 | 5526 |
| 5 | 1 | 69.1 | 87.3 | 13 / 35 | 5720 |
| 6 | 1 | 68.4 | 86.0 | 19 / 35 | 5170 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 63% |
| techdude.forest.FlamingForest 1.1 | 22 | 68% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 90% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 6 | 83% |
| tvv.nano.Polaris 1.2 | 4 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1277. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 51 | 50% | 108 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 18% | 34 |
| techdude.forest.FlamingForest 1.1 | 13 | 13% | 29 |
| bvh.fnr.Fenrir 0.36l | 7 | 7% | 11 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 12 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 12 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.8 | 98 / 210 | 2.37 | 17.9% | 29566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 17.9% | 98 |
| et.Predator 1.8 | 2.5 | 13.3% | 25 |
| cx.BlestPain 1.41 | 3.3 | 12.6% | 38 |
| oog.melee.Mercutio 1.0 | 4.2 | 12.0% | 25 |
| nic.Nicator 2.4 | 4.5 | 11.3% | 11 |
| ahf.NanoAndrew .4 | 5.5 | 10.8% | 8 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 4 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.5 | 15 / 35 | 4776 |
| 2 | 1 | 68.5 | 86.7 | 17 / 35 | 5133 |
| 3 | 1 | 66.1 | 82.2 | 15 / 35 | 4441 |
| 4 | 1 | 67.2 | 83.8 | 13 / 35 | 5300 |
| 5 | 1 | 67.9 | 86.0 | 17 / 35 | 4979 |
| 6 | 1 | 68.4 | 86.7 | 21 / 35 | 4937 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 51 | 75% |
| oog.melee.Mercutio 1.0 | 34 | 68% |
| cx.BlestPain 1.41 | 27 | 41% |
| nic.Nicator 2.4 | 24 | 83% |
| ahf.NanoAndrew .4 | 8 | 63% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 25 | 22% | 37 |
| oog.melee.Mercutio 1.0 | 24 | 21% | 45 |
| et.Predator 1.8 | 22 | 20% | 56 |
| nic.Nicator 2.4 | 15 | 13% | 36 |
| ahf.NanoAndrew .4 | 14 | 13% | 19 |
| tex.Longbot 0.4 | 6 | 5% | 7 |
| maribo.melee.BMV 0.1 | 4 | 4% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 5 |

## Melee bench: F18

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 11 over 6 battles (1.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.6 | 151 / 210 | 1.94 | 19.2% | 27513 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.2% | 151 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 21 |
| agd.Mooserwirt2 2.7 | 3.2 | 11.9% | 16 |
| uji.DBH 1.1 | 4.0 | 10.8% | 6 |
| ratosh.Nobo 0.21 | 5.5 | 9.7% | 0 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.4% | 7 |
| sigterm.Sigterm 1.0 | 6.8 | 8.3% | 3 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.0% | 1 |
| stelo.WangRobot 1.0 | 8.8 | 5.8% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 4.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 97.5 | 31 / 35 | 4646 |
| 2 | 1 | 68.0 | 87.6 | 22 / 35 | 4604 |
| 3 | 1 | 67.5 | 85.1 | 22 / 35 | 4524 |
| 4 | 1 | 65.7 | 81.0 | 22 / 35 | 4047 |
| 5 | 1 | 71.0 | 96.8 | 27 / 35 | 5060 |
| 6 | 1 | 69.0 | 89.5 | 27 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 59 | 86% |
| agd.Mooserwirt2 2.7 | 36 | 86% |
| uji.DBH 1.1 | 27 | 89% |
| sigterm.Sigterm 1.0 | 19 | 89% |
| ratosh.Nobo 0.21 | 10 | 100% |
| stelo.WangRobot 1.0 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 100% |
| spinnercat.Robovirus 2.718 | 5 | 60% |

Hadur died in 61 of 210 rounds, at a mean tick of 824. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 19 | 31% | 73 |
| agd.Mooserwirt2 2.7 | 12 | 20% | 41 |
| spinnercat.Robovirus 2.718 | 8 | 13% | 17 |
| uji.DBH 1.1 | 7 | 11% | 28 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 7% | 4 |
| sigterm.Sigterm 1.0 | 3 | 5% | 13 |
| ratosh.Nobo 0.21 | 3 | 5% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 11 |
| stelo.WangRobot 1.0 | 2 | 3% | 10 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 9 over 6 battles (1.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 95.6 | 169 / 210 | 1.40 | 21.4% | 35546 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 21.4% | 169 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.9% | 15 |
| mld.Infinity 2.2 | 2.8 | 14.2% | 23 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 10.9% | 2 |
| erdnis.Rover 0.3 | 5.2 | 9.8% | 0 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 0 |
| pac.ABC 2.1 | 7.7 | 6.9% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 98.1 | 32 / 35 | 6165 |
| 2 | 1 | 72.5 | 94.9 | 27 / 35 | 6223 |
| 3 | 1 | 72.1 | 95.6 | 27 / 35 | 5631 |
| 4 | 1 | 71.2 | 92.1 | 25 / 35 | 5538 |
| 5 | 1 | 72.2 | 96.8 | 29 / 35 | 5767 |
| 6 | 1 | 72.9 | 96.2 | 29 / 35 | 6222 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 94% |
| mld.Infinity 2.2 | 66 | 86% |
| krillr.mini.JointStrike 2.0.0 | 12 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 88% |
| erdnis.Rover 0.3 | 6 | 100% |
| pac.ABC 2.1 | 5 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 1349. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 22 | 54% | 119 |
| mld.Infinity 2.2 | 13 | 32% | 28 |
| krillr.mini.JointStrike 2.0.0 | 4 | 10% | 23 |
| erdnis.Rover 0.3 | 1 | 2% | 10 |
| patson.PatsonTestBot 1.0 | 1 | 2% | 8 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 4 |

## Melee bench: F20

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 23 over 6 battles (3.8 per battle, most in one battle 15). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.6 | 138 / 210 | 1.85 | 19.8% | 32467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.8% | 138 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.6% | 31 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.1% | 8 |
| fwb.Nine 1.0.1 | 3.8 | 11.0% | 15 |
| catcat20.Rabbit 0.001 | 5.0 | 9.9% | 15 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.0% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.9% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.2% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 95.9 | 24 / 35 | 5182 |
| 2 | 1 | 68.9 | 88.6 | 21 / 35 | 5285 |
| 3 | 1 | 71.2 | 94.3 | 24 / 35 | 5693 |
| 4 | 1 | 67.5 | 82.9 | 19 / 35 | 5118 |
| 5 | 1 | 68.1 | 84.1 | 19 / 35 | 5201 |
| 6 | 1 | 72.6 | 97.8 | 31 / 35 | 5988 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 79 | 82% |
| fwb.Nine 1.0.1 | 35 | 77% |
| catcat20.Rabbit 0.001 | 30 | 80% |
| nz.jdc.nano.GridFu 1.0 | 14 | 79% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 34 | 45% | 74 |
| fwb.Nine 1.0.1 | 11 | 15% | 20 |
| catcat20.Rabbit 0.001 | 9 | 12% | 39 |
| nz.jdc.nano.GridFu 1.0 | 9 | 12% | 32 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 18 |
| m3thos.mini.Eva01 0.5.5 | 2 | 3% | 12 |
| ntc.ControlledChaos 1.1.4 | 2 | 3% | 2 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 6 |
2 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.8 | 139 / 210 | 1.56 | 20.6% | 34783 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 20.6% | 139 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 58 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.6% | 6 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.7% | 5 |
| eld.Hmm 1.0 | 5.7 | 8.1% | 4 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.8% | 1 |
| fire219.CatBot 1.0 | 7.3 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.5 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 89.5 | 21 / 35 | 5667 |
| 2 | 1 | 71.9 | 96.5 | 27 / 35 | 5743 |
| 3 | 1 | 71.9 | 94.9 | 23 / 35 | 6135 |
| 4 | 1 | 71.6 | 96.2 | 24 / 35 | 5939 |
| 5 | 1 | 70.9 | 93.7 | 21 / 35 | 5831 |
| 6 | 1 | 70.3 | 92.1 | 23 / 35 | 5468 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 121 | 63% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 20 | 100% |
| eld.Hmm 1.0 | 11 | 91% |
| oa.weak.BotherBot 0.1 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 1556. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 48 | 64% | 105 |
| dummy.mini.Scimitar 1.01 | 15 | 20% | 58 |
| cf.RiO.RiOx 4.2.1 | 5 | 7% | 20 |
| eld.Hmm 1.0 | 1 | 1% | 16 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 6 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
| PSW.Relentless 0.1 | 0 | 0% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.6 | 98 / 210 | 2.21 | 18.1% | 29503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.2 | 18.1% | 98 |
| pe.SandboxDT 2.71m | 2.0 | 16.6% | 60 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.2% | 29 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.2% | 24 |
| bigpete.Stewie 1.0 | 5.0 | 9.7% | 1 |
| yk.JahRoslav 1.1 | 6.5 | 6.5% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.1% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.1% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 82.9 | 15 / 35 | 4738 |
| 2 | 1 | 68.4 | 86.7 | 15 / 35 | 4858 |
| 3 | 1 | 68.9 | 89.8 | 15 / 35 | 4890 |
| 4 | 1 | 68.8 | 87.0 | 19 / 35 | 4946 |
| 5 | 1 | 67.8 | 84.4 | 18 / 35 | 4903 |
| 6 | 1 | 68.6 | 88.6 | 16 / 35 | 5168 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 57 | 49% |
| kvk.HebusLeTroll 0.35 | 43 | 63% |
| jlm.javaDisturbance 0.59 | 39 | 82% |
| bigpete.Stewie 1.0 | 4 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 41 | 37% | 77 |
| kvk.HebusLeTroll 0.35 | 39 | 35% | 61 |
| jlm.javaDisturbance 0.59 | 22 | 20% | 48 |
| bigpete.Stewie 1.0 | 4 | 4% | 8 |
| tad.Dalek98 0.98 | 4 | 4% | 6 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.5 | 138 / 210 | 1.67 | 19.9% | 31468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.9% | 138 |
| pe.SandboxLump 1.52 | 2.0 | 17.6% | 50 |
| cre.Karolos 0.32 | 3.0 | 13.2% | 15 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 11.2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.3% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.9% | 0 |
| cw.megas.Blade 0.8 | 6.7 | 7.7% | 0 |
| sample.Walls 1.0 | 7.8 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 26 / 35 | 5117 |
| 2 | 1 | 71.2 | 92.1 | 23 / 35 | 5380 |
| 3 | 1 | 71.0 | 93.0 | 23 / 35 | 5138 |
| 4 | 1 | 71.3 | 93.0 | 23 / 35 | 5420 |
| 5 | 1 | 70.2 | 91.7 | 21 / 35 | 4928 |
| 6 | 1 | 71.1 | 93.3 | 22 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 105 | 72% |
| cre.Karolos 0.32 | 31 | 81% |
| stelo.AreaTargetingBot 1.1 | 23 | 96% |
| stelo.RamTrackSurfer 1.2 | 7 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| sample.Walls 1.0 | 2 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 48 | 67% | 125 |
| cre.Karolos 0.32 | 13 | 18% | 41 |
| stelo.AreaTargetingBot 1.1 | 8 | 11% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 8 |
| sample.Walls 1.0 | 1 | 1% | 2 |
| cw.megas.Blade 0.8 | 1 | 1% | 2 |
| stelo.RamTrackSurfer 1.2 | 0 | 0% | 12 |

## Melee bench: F24

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 77.1 | 82 / 210 | 3.06 | 15.6% | 22742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.2 | 15.6% | 82 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.0% | 33 |
| florent.XSeries.X2 0.12 | 3.7 | 12.6% | 26 |
| davidalves.Phoenix 0.54 | 3.8 | 12.6% | 41 |
| pedersen.Ugluk 1.1.1 | 4.0 | 12.2% | 19 |
| oog.melee.Corsair 1.0 | 6.0 | 9.2% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.9% | 6 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.5% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.2% | 0 |
| evd.X1 0.01 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 76.5 | 14 / 35 | 3817 |
| 2 | 1 | 67.7 | 87.6 | 21 / 35 | 4190 |
| 3 | 1 | 62.9 | 75.2 | 12 / 35 | 3581 |
| 4 | 1 | 63.4 | 77.8 | 12 / 35 | 3725 |
| 5 | 2 | 60.9 | 69.5 | 11 / 35 | 3643 |
| 6 | 1 | 63.4 | 76.2 | 12 / 35 | 3786 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 71% |
| davidalves.Phoenix 0.54 | 23 | 61% |
| stelo.SoJNanoMelee 1.1 | 20 | 95% |
| florent.XSeries.X2 0.12 | 15 | 53% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| as.FrankTheTank 1.3 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 34 | 26% | 70 |
| florent.XSeries.X2 0.12 | 27 | 21% | 35 |
| pedersen.Ugluk 1.1.1 | 27 | 21% | 35 |
| davidalves.Phoenix 0.54 | 25 | 19% | 41 |
| oog.melee.Corsair 1.0 | 6 | 5% | 14 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 4 |
| evd.X1 0.01 | 3 | 2% | 3 |
| lunchie.Lunchbox 0.93 | 2 | 2% | 4 |
| as.FrankTheTank 1.3 | 0 | 0% | 4 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.8 | 155 / 210 | 1.91 | 19.6% | 27335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.6% | 155 |
| voidious.micro.BlitzBat 1.05 | 2.5 | 13.1% | 15 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.1% | 10 |
| jdw.Hurricane 1.4 | 4.2 | 10.9% | 14 |
| ds.Oo 2.2 | 5.5 | 8.8% | 4 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.9% | 4 |
| gjr.Cephalosporin 0.1 | 6.8 | 7.9% | 4 |
| awesomeness.Elite 1.0 | 7.7 | 7.1% | 3 |
| adt.Ar2 1.1 | 9.2 | 5.8% | 1 |
| amk.ChumbaMini 0.2 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.0 | 28 / 35 | 4858 |
| 2 | 1 | 69.7 | 90.2 | 28 / 35 | 4521 |
| 3 | 1 | 69.6 | 89.8 | 25 / 35 | 4796 |
| 4 | 1 | 68.1 | 86.0 | 24 / 35 | 4134 |
| 5 | 1 | 69.1 | 88.6 | 24 / 35 | 4620 |
| 6 | 1 | 69.1 | 90.5 | 26 / 35 | 4406 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 57 | 96% |
| voidious.micro.BlitzBat 1.05 | 49 | 90% |
| jdw.Hurricane 1.4 | 24 | 83% |
| gjr.Cephalosporin 0.1 | 12 | 100% |
| ds.Oo 2.2 | 8 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 601. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 15 | 27% | 61 |
| voidious.mini.BrokenSword 2.0.3 | 15 | 27% | 57 |
| jdw.Hurricane 1.4 | 11 | 20% | 30 |
| gre.svman4.Morfeas 1.4.1 | 5 | 9% | 15 |
| awesomeness.Elite 1.0 | 4 | 7% | 10 |
| ds.Oo 2.2 | 3 | 5% | 15 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 14 |
| amk.ChumbaMini 0.2 | 1 | 2% | 2 |
| adt.Ar2 1.1 | 0 | 0% | 6 |

## Melee bench: F26

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.1 | 138 / 210 | 1.90 | 19.4% | 33144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.4% | 138 |
| ak.Fermat 2.0 | 2.0 | 14.3% | 22 |
| lrem.Spectre 0.4.4 | 3.3 | 12.5% | 18 |
| shu.nitro.LENIN .T34 | 3.7 | 12.3% | 26 |
| js.PinBall 1.6 | 5.0 | 10.3% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.3% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.8 | 8.9% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.1 | 25 / 35 | 5506 |
| 2 | 1 | 69.9 | 89.2 | 21 / 35 | 5961 |
| 3 | 1 | 69.0 | 88.9 | 21 / 35 | 5007 |
| 4 | 1 | 69.1 | 87.3 | 21 / 35 | 5643 |
| 5 | 1 | 70.1 | 92.1 | 24 / 35 | 5593 |
| 6 | 1 | 70.5 | 91.7 | 26 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 83% |
| shu.nitro.LENIN .T34 | 50 | 86% |
| lrem.Spectre 0.4.4 | 38 | 87% |
| js.PinBall 1.6 | 8 | 63% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 897. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 23 | 32% | 73 |
| shu.nitro.LENIN .T34 | 21 | 29% | 64 |
| lrem.Spectre 0.4.4 | 14 | 19% | 32 |
| jaybot.adv.bots.JayBot 2.0 | 7 | 10% | 10 |
| js.PinBall 1.6 | 6 | 8% | 19 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 6 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 114 over 6 battles (19.0 per battle, most in one battle 65). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 91.3 | 145 / 210 | 1.78 | 19.1% | 26358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.1% | 145 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 33 |
| EH.Eagle 1.0.6 | 3.7 | 11.0% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.5% | 7 |
| wee.Gem 1.8.4 | 4.7 | 10.6% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.4% | 3 |
| joe.ADinosaur 1.0 | 7.5 | 7.4% | 1 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.6% | 1 |
| caimano.Furia_Ceca 0.22 | 8.3 | 6.8% | 2 |
| cs.Grudge 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 94.9 | 26 / 35 | 4568 |
| 2 | 1 | 68.1 | 91.7 | 23 / 35 | 4035 |
| 3 | 1 | 68.3 | 90.2 | 25 / 35 | 4147 |
| 4 | 1 | 68.3 | 89.2 | 21 / 35 | 4610 |
| 5 | 1 | 70.4 | 94.3 | 27 / 35 | 5053 |
| 6 | 1 | 67.2 | 87.6 | 23 / 35 | 3945 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 86 | 83% |
| wee.Gem 1.8.4 | 25 | 68% |
| sheldor.melee.nano.TestMelee 0.1 | 23 | 91% |
| EH.Eagle 1.0.6 | 23 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 83% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 33% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 37% | 100 |
| wee.Gem 1.8.4 | 13 | 20% | 32 |
| sheldor.melee.nano.TestMelee 0.1 | 9 | 14% | 29 |
| EH.Eagle 1.0.6 | 4 | 6% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 6% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 6% | 5 |
| joe.ADinosaur 1.0 | 4 | 6% | 5 |
| throxbot.ThroxBot 0.1 | 3 | 5% | 8 |

## Melee bench: F28

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 91.5 | 147 / 210 | 1.76 | 19.2% | 26277 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.2% | 147 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 35 |
| uji.Antique 1.0 | 3.5 | 11.5% | 18 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.7% | 7 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.2% | 1 |
| ahr.ice.Ice 1.0.2 | 6.3 | 8.0% | 0 |
| amk.ChumbaWumba 0.3 | 6.7 | 8.0% | 2 |
| matt.advanced.Katana 1.0 | 8.5 | 5.9% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.6 | 28 / 35 | 4598 |
| 2 | 1 | 68.1 | 88.9 | 24 / 35 | 4057 |
| 3 | 1 | 68.7 | 92.4 | 24 / 35 | 4177 |
| 4 | 1 | 68.7 | 90.2 | 23 / 35 | 4416 |
| 5 | 1 | 69.7 | 92.4 | 25 / 35 | 4744 |
| 6 | 1 | 68.4 | 90.8 | 23 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 89 | 81% |
| uji.Antique 1.0 | 41 | 95% |
| qohnil.blot.BlotBot 3.61 | 21 | 81% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| matt.advanced.Katana 1.0 | 2 | 50% |

Hadur died in 65 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 30 | 46% | 91 |
| pfvicm.Sobieski 7.2.3b | 12 | 18% | 24 |
| uji.Antique 1.0 | 8 | 12% | 39 |
| qohnil.blot.BlotBot 3.61 | 7 | 11% | 25 |
| amk.ChumbaWumba 0.3 | 5 | 8% | 14 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 7 |
| matt.advanced.Katana 1.0 | 1 | 2% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.0 | 120 / 210 | 2.08 | 19.1% | 29337 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.1% | 120 |
| deewiant.Anomaly 0.2 | 2.2 | 15.8% | 37 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.5% | 45 |
| myl.micro.Troodon 1.10 | 4.2 | 11.3% | 3 |
| jok.PheonixM 0.1.2 | 4.8 | 10.1% | 2 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 1 |
| DBall.Anarchy 0.1 | 7.2 | 6.6% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.6% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.5% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.5 | 20 / 35 | 4555 |
| 2 | 1 | 70.0 | 90.2 | 20 / 35 | 5129 |
| 3 | 1 | 71.2 | 92.7 | 27 / 35 | 5207 |
| 4 | 1 | 68.8 | 87.9 | 17 / 35 | 4695 |
| 5 | 1 | 69.4 | 87.0 | 20 / 35 | 5073 |
| 6 | 1 | 68.7 | 87.0 | 16 / 35 | 4678 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 69 | 68% |
| zyx.mega.YersiniaPestis 3.1 | 55 | 69% |
| myl.micro.Troodon 1.10 | 14 | 100% |
| jok.PheonixM 0.1.2 | 14 | 100% |
| DBall.Anarchy 0.1 | 6 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1051. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 53% | 104 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 32% | 60 |
| myl.micro.Troodon 1.10 | 6 | 7% | 20 |
| jok.PheonixM 0.1.2 | 4 | 4% | 14 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 4 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |
| DBall.Anarchy 0.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.6 | 55 / 210 | 3.29 | 14.7% | 22275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.7 | 14.7% | 55 |
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 48 |
| darkcanuck.B26354 1.06 | 2.8 | 13.6% | 47 |
| oog.melee.Capulet 1.2 | 3.8 | 13.1% | 28 |
| stelo.PastFuture 2.3.2 | 4.3 | 12.5% | 21 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.2% | 3 |
| ntc.Opposite 1.5 | 7.3 | 7.3% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.5% | 5 |
| tripphippy.Alice 1.1 | 8.7 | 6.5% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.5 | 74.0 | 10 / 35 | 3784 |
| 2 | 3 | 60.8 | 70.8 | 7 / 35 | 3397 |
| 3 | 2 | 62.3 | 73.7 | 9 / 35 | 3714 |
| 4 | 1 | 62.4 | 74.3 | 8 / 35 | 3871 |
| 5 | 1 | 65.1 | 80.3 | 11 / 35 | 4210 |
| 6 | 2 | 61.9 | 74.3 | 10 / 35 | 3299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 27 | 44% |
| darkcanuck.B26354 1.06 | 24 | 54% |
| oog.melee.Capulet 1.2 | 18 | 72% |
| stelo.PastFuture 2.3.2 | 14 | 79% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 67% |
| tripphippy.Alice 1.1 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 1 | 100% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 156 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 36 | 23% | 50 |
| stelo.PastFuture 2.3.2 | 34 | 22% | 48 |
| catcat20.Matcha 0.006 | 33 | 21% | 44 |
| oog.melee.Capulet 1.2 | 28 | 18% | 38 |
| ntc.Opposite 1.5 | 8 | 5% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 8 |
| tripphippy.Alice 1.1 | 6 | 4% | 7 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 7 |

## Melee bench: F31

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.8 | 77.9 | 66 / 210 | 2.99 | 15.4% | 21144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.3% | 85 |
| hadur117.mini.DeisePNS6 0.4 | 2.0 | 15.4% | 66 |
| gh.mini.Griezel 0.2 | 3.0 | 13.9% | 43 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.9% | 8 |
| d414.nano.Quantum 1.0.0 | 4.8 | 11.2% | 5 |
| gh.nano.Grofvuil 0.2 | 6.2 | 8.5% | 4 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.7% | 2 |
| fm.mammillarias 1.3 | 8.0 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 76.8 | 9 / 35 | 3487 |
| 2 | 2 | 64.0 | 79.7 | 13 / 35 | 3480 |
| 3 | 3 | 61.7 | 71.7 | 5 / 35 | 3509 |
| 4 | 2 | 65.0 | 80.3 | 14 / 35 | 3570 |
| 5 | 2 | 65.0 | 82.5 | 11 / 35 | 3569 |
| 6 | 1 | 63.6 | 76.2 | 14 / 35 | 3529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 53 | 47% |
| gh.mini.Griezel 0.2 | 33 | 52% |
| d414.nano.Quantum 1.0.0 | 12 | 92% |
| spinnercat.micro.Tyger 0.1 | 10 | 100% |
| timmit.nano.TimDog 0.33 | 2 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 53 | 36% | 76 |
| gh.mini.Griezel 0.2 | 40 | 27% | 62 |
| spinnercat.micro.Tyger 0.1 | 21 | 14% | 28 |
| d414.nano.Quantum 1.0.0 | 17 | 12% | 24 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 3 |
| fm.mammillarias 1.3 | 3 | 2% | 3 |
| timmit.nano.TimDog 0.33 | 1 | 1% | 3 |
| tlp.ThreeLeggedPig 1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 90.8 | 138 / 210 | 1.82 | 19.2% | 29390 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.2% | 138 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.1% | 35 |
| apc.botM 3.0 | 3.3 | 11.9% | 20 |
| lxx.ConceptA 0.8 | 4.0 | 10.7% | 4 |
| vjik.UnViolation 1.1 | 5.2 | 9.4% | 2 |
| bayen.UbaMicro 1.4 | 5.5 | 9.2% | 3 |
| conscience.Electron 1.3g | 7.8 | 6.8% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.4% | 2 |
| panzer.Panzer 0.2 | 8.3 | 6.8% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.4% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 91.7 | 23 / 35 | 4838 |
| 2 | 1 | 68.4 | 89.5 | 23 / 35 | 4693 |
| 3 | 1 | 69.6 | 94.6 | 25 / 35 | 5124 |
| 4 | 1 | 68.4 | 89.8 | 22 / 35 | 4741 |
| 5 | 1 | 68.5 | 88.9 | 23 / 35 | 5013 |
| 6 | 1 | 68.7 | 90.5 | 22 / 35 | 4981 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 71% |
| apc.botM 3.0 | 34 | 76% |
| lxx.ConceptA 0.8 | 24 | 100% |
| vjik.UnViolation 1.1 | 11 | 91% |
| bayen.UbaMicro 1.4 | 11 | 82% |
| panzer.Panzer 0.2 | 9 | 100% |
| yk.JahMicro 1.0 | 6 | 83% |
| donjezza.Jezza 1.0 | 5 | 60% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 805. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 26 | 36% | 85 |
| apc.botM 3.0 | 14 | 19% | 42 |
| lxx.ConceptA 0.8 | 14 | 19% | 21 |
| vjik.UnViolation 1.1 | 5 | 7% | 27 |
| bayen.UbaMicro 1.4 | 4 | 5% | 13 |
| donjezza.Jezza 1.0 | 3 | 4% | 6 |
| panzer.Panzer 0.2 | 3 | 4% | 4 |
| yk.JahMicro 1.0 | 2 | 3% | 6 |
| conscience.Electron 1.3g | 2 | 3% | 5 |

## Melee bench: F33

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 10 over 6 battles (1.7 per battle, most in one battle 6). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.2 | 136 / 210 | 1.97 | 19.4% | 30655 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.4% | 136 |
| maribo.Quester 0.3 | 2.0 | 16.0% | 42 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 13.0% | 11 |
| labg.Cataclysm 2.05 | 4.3 | 10.8% | 13 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.7% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.1% | 2 |
| baal.nano.N 1.42 | 6.5 | 7.9% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.4% | 0 |
| sanja.First 0.1 | 8.8 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 90.5 | 24 / 35 | 5278 |
| 2 | 1 | 68.7 | 86.3 | 20 / 35 | 4807 |
| 3 | 1 | 70.2 | 88.9 | 25 / 35 | 5322 |
| 4 | 1 | 69.8 | 89.2 | 23 / 35 | 5244 |
| 5 | 1 | 69.4 | 88.9 | 21 / 35 | 5150 |
| 6 | 1 | 70.0 | 91.4 | 23 / 35 | 4854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 55 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 43 | 95% |
| labg.Cataclysm 2.05 | 24 | 83% |
| gre.svman4.Leonidas 1.3.2 | 23 | 91% |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 86% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 37 | 49% | 88 |
| gre.svman4.Leonidas 1.3.2 | 13 | 17% | 26 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 10 | 13% | 59 |
| labg.Cataclysm 2.05 | 6 | 8% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 5 |
| zyx.micro.Ant 1.1 | 2 | 3% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.1 | 89 / 210 | 2.25 | 17.8% | 29194 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.5 | 17.8% | 89 |
| stelo.Spread 0.9 | 1.5 | 17.3% | 76 |
| kid.Gladiator .7.2 | 3.0 | 15.6% | 31 |
| jcs.Seth 1.8 | 4.0 | 11.7% | 8 |
| tcf.Reach 3 | 5.3 | 9.8% | 1 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 1 |
| sample.RamFire 1.0 | 9.5 | 3.0% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.7 | 17 / 35 | 4938 |
| 2 | 2 | 68.3 | 86.3 | 12 / 35 | 4928 |
| 3 | 1 | 67.6 | 82.5 | 14 / 35 | 4949 |
| 4 | 2 | 67.7 | 84.1 | 15 / 35 | 4805 |
| 5 | 1 | 68.8 | 86.7 | 17 / 35 | 4939 |
| 6 | 2 | 67.6 | 85.1 | 14 / 35 | 4635 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 76 | 54% |
| kid.Gladiator .7.2 | 39 | 56% |
| jcs.Seth 1.8 | 15 | 93% |
| tcf.Reach 3 | 8 | 88% |
| cli.Dancer 1.1 | 4 | 75% |
| ratosh.Wesco 1.4 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 1103. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 67 | 55% | 104 |
| kid.Gladiator .7.2 | 37 | 30% | 51 |
| jcs.Seth 1.8 | 7 | 6% | 31 |
| tcf.Reach 3 | 6 | 5% | 14 |
| cli.Dancer 1.1 | 2 | 2% | 4 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
| sample.VelociRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 38 over 6 battles (6.3 per battle, most in one battle 22). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 79.6 | 41 / 210 | 2.83 | 15.0% | 20583 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 145 |
| hadur117.mini.DeisePNS6 0.4 | 2.0 | 15.0% | 41 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.9% | 16 |
| rz.HawkOnFire 0.1 | 3.8 | 12.3% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.7 | 11.7% | 6 |
| wit.Chuliath 1.0 | 6.5 | 7.0% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.0 | 4.7% | 1 |
| dans.Cinnamon 1.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 77.8 | 6 / 35 | 3369 |
| 2 | 2 | 64.1 | 79.7 | 8 / 35 | 3468 |
| 3 | 2 | 62.9 | 75.6 | 9 / 35 | 3183 |
| 4 | 2 | 65.2 | 85.1 | 7 / 35 | 3521 |
| 5 | 2 | 63.5 | 79.4 | 7 / 35 | 3471 |
| 6 | 2 | 63.4 | 80.3 | 4 / 35 | 3571 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 81 | 22% |
| gh.mini.Gruwel 0.9 | 16 | 69% |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 73% |
| rz.HawkOnFire 0.1 | 5 | 80% |
| stelo.MyAgileRobot 0.2 | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 56% | 112 |
| gh.mini.Gruwel 0.9 | 31 | 18% | 41 |
| rz.HawkOnFire 0.1 | 19 | 11% | 25 |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 5% | 15 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| wit.Chuliath 1.0 | 3 | 2% | 5 |
| dans.Cinnamon 1.2 | 3 | 2% | 3 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.8 | 181 / 210 | 1.47 | 21.6% | 34110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 21.6% | 181 |
| alpha.RainingFire 1.0 | 2.7 | 11.5% | 10 |
| bzdp.Pansy 2.1 | 2.8 | 11.3% | 7 |
| bvh.micro.Freya 0.3 | 4.7 | 10.5% | 1 |
| mz.Cork 0.1 | 5.0 | 10.2% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.2% | 2 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.4% | 2 |
| dl.BetterWalls 1.0 | 8.2 | 6.3% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 5.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.5 | 33 / 35 | 5958 |
| 2 | 1 | 71.4 | 94.6 | 28 / 35 | 5771 |
| 3 | 1 | 70.3 | 90.2 | 29 / 35 | 5314 |
| 4 | 1 | 71.4 | 93.3 | 29 / 35 | 5594 |
| 5 | 1 | 71.8 | 95.9 | 30 / 35 | 5510 |
| 6 | 1 | 72.6 | 97.5 | 32 / 35 | 5963 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 49 | 96% |
| bvh.micro.Freya 0.3 | 42 | 98% |
| alpha.RainingFire 1.0 | 29 | 79% |
| mz.Cork 0.1 | 22 | 86% |
| bvh.mini.Fenrir 0.39 | 16 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 100% |
| sample.MyFirstRobot 1.0 | 11 | 100% |
| dl.BetterWalls 1.0 | 8 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 9 | 31% | 34 |
| bzdp.Pansy 2.1 | 8 | 28% | 58 |
| mz.Cork 0.1 | 4 | 14% | 27 |
| bvh.mini.Fenrir 0.39 | 3 | 10% | 14 |
| bvh.micro.Freya 0.3 | 2 | 7% | 22 |
| sample.MyFirstRobot 1.0 | 2 | 7% | 8 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 30 |
| dl.BetterWalls 1.0 | 0 | 0% | 13 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 94.1 | 180 / 210 | 1.53 | 20.3% | 33687 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 20.3% | 180 |
| germ.TheMind .2 | 2.5 | 10.7% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.1% | 1 |
| EBBU.Sim2 1.02 | 4.3 | 9.7% | 2 |
| stelo.UntouchableNano 1.3 | 5.5 | 8.9% | 6 |
| agrach.Dalek 1.0 | 5.5 | 8.9% | 7 |
| mb.Beast 0.1 | 7.7 | 8.3% | 5 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.9% | 0 |
| lmk.ACPFinal 0.1 | 8.2 | 8.1% | 0 |
| skm.Ryubot 1.0 | 9.3 | 7.1% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 94.6 | 32 / 35 | 5304 |
| 2 | 1 | 70.5 | 96.2 | 31 / 35 | 5891 |
| 3 | 1 | 69.0 | 91.1 | 27 / 35 | 5690 |
| 4 | 1 | 69.7 | 94.0 | 28 / 35 | 5959 |
| 5 | 1 | 70.6 | 97.8 | 33 / 35 | 5319 |
| 6 | 1 | 69.3 | 91.1 | 29 / 35 | 5524 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 53 | 94% |
| EBBU.Sim2 1.02 | 29 | 93% |
| agrach.Dalek 1.0 | 21 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 95% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 17 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 15 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 408. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 6 | 20% | 43 |
| mb.Beast 0.1 | 6 | 20% | 27 |
| stelo.UntouchableNano 1.3 | 5 | 17% | 16 |
| agrach.Dalek 1.0 | 4 | 13% | 36 |
| EBBU.Sim2 1.02 | 4 | 13% | 24 |
| lmk.ACPFinal 0.1 | 3 | 10% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 3% | 8 |
| skm.Ryubot 1.0 | 0 | 0% | 6 |

## Melee bench: F38

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 12 over 6 battles (2.0 per battle, most in one battle 9). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.6 | 89 / 210 | 2.74 | 16.3% | 24302 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 16.2% | 71 |
| hadur117.mini.DeisePNS6 0.4 | 1.5 | 16.3% | 89 |
| bvh.mini.Freya 0.55 | 3.2 | 12.4% | 12 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.0% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.9% | 9 |
| cs.Wren 1.0 | 5.2 | 10.8% | 10 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.4% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.2% | 2 |
| bzdp.BoxCar 2.0 | 9.5 | 3.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 76.5 | 12 / 35 | 3998 |
| 2 | 1 | 64.4 | 77.1 | 15 / 35 | 3929 |
| 3 | 2 | 64.1 | 78.7 | 12 / 35 | 3878 |
| 4 | 1 | 68.2 | 88.9 | 19 / 35 | 4445 |
| 5 | 2 | 65.3 | 78.7 | 15 / 35 | 4286 |
| 6 | 1 | 65.3 | 83.8 | 16 / 35 | 3766 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 53 | 58% |
| davidalves.net.DuelistNanoMelee 1.01 | 17 | 100% |
| bvh.mini.Freya 0.55 | 16 | 88% |
| cs.Wren 1.0 | 14 | 86% |
| bts.mega.Gnarly 1.4 | 13 | 85% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 39 | 32% | 73 |
| bvh.mini.Freya 0.55 | 23 | 19% | 28 |
| bts.mega.Gnarly 1.4 | 17 | 14% | 30 |
| kdf.KoulDestroyer 1.0 | 14 | 12% | 15 |
| cs.Wren 1.0 | 13 | 11% | 21 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 8% | 32 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 24 over 6 battles (4.0 per battle, most in one battle 13). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.8 | 103 / 210 | 2.28 | 17.8% | 28211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 17.8% | 103 |
| bvh.fry.Freya 0.82 | 2.2 | 15.2% | 24 |
| az.Ololobot 0.2.4 | 2.8 | 13.1% | 55 |
| catcat20.Lambda 0.024 | 4.0 | 11.1% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.6% | 6 |
| winamp32.micro.MicroMacro 1.0 | 6.5 | 8.1% | 3 |
| gimp.GimpBot 0.1 | 6.7 | 7.8% | 1 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.8% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 80.0 | 13 / 35 | 4440 |
| 2 | 1 | 67.0 | 85.4 | 17 / 35 | 4651 |
| 3 | 1 | 67.1 | 87.3 | 17 / 35 | 4562 |
| 4 | 1 | 68.5 | 90.5 | 21 / 35 | 4749 |
| 5 | 1 | 68.1 | 87.0 | 19 / 35 | 5176 |
| 6 | 1 | 66.8 | 84.8 | 16 / 35 | 4633 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 60 | 57% |
| catcat20.Lambda 0.024 | 35 | 83% |
| bvh.fry.Freya 0.82 | 32 | 81% |
| stelo.SoRobotNanoMelee 1.2 | 7 | 100% |
| gimp.GimpBot 0.1 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |

Hadur died in 107 of 210 rounds, at a mean tick of 1059. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 43 | 40% | 68 |
| az.Ololobot 0.2.4 | 36 | 34% | 73 |
| catcat20.Lambda 0.024 | 14 | 13% | 35 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 7% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 11 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 6 |
| gimp.GimpBot 0.1 | 1 | 1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.0 | 131 / 210 | 2.08 | 19.0% | 29145 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 19.0% | 131 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.3% | 36 |
| kano.gamma.KanoGamma 1.8 | 3.8 | 12.0% | 15 |
| mz.AntiGrav 1.0 | 4.0 | 11.0% | 5 |
| Polkwane.SmashMelee 1.0 | 4.3 | 11.0% | 11 |
| stelo.Randomness 1.0 | 6.2 | 9.2% | 7 |
| alpha.BlackIce 1.0 | 6.8 | 8.2% | 3 |
| amk.superstrike.SuperStrike 0.3 | 7.8 | 6.3% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 5.0% | 0 |
| sample.Corners 1.0 | 9.8 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.3 | 21 / 35 | 4828 |
| 2 | 1 | 69.7 | 91.1 | 22 / 35 | 4794 |
| 3 | 1 | 67.8 | 86.0 | 20 / 35 | 4629 |
| 4 | 1 | 67.0 | 84.1 | 17 / 35 | 4460 |
| 5 | 1 | 69.8 | 89.5 | 24 / 35 | 5377 |
| 6 | 1 | 69.9 | 90.2 | 27 / 35 | 5057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 52 | 65% |
| kano.gamma.KanoGamma 1.8 | 40 | 78% |
| Polkwane.SmashMelee 1.0 | 24 | 88% |
| mz.AntiGrav 1.0 | 23 | 100% |
| stelo.Randomness 1.0 | 12 | 92% |
| alpha.BlackIce 1.0 | 7 | 71% |
| amk.superstrike.SuperStrike 0.3 | 4 | 75% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 37% | 52 |
| kano.gamma.KanoGamma 1.8 | 19 | 24% | 49 |
| stelo.Randomness 1.0 | 8 | 10% | 24 |
| mz.AntiGrav 1.0 | 7 | 9% | 36 |
| Polkwane.SmashMelee 1.0 | 7 | 9% | 22 |
| alpha.BlackIce 1.0 | 6 | 8% | 8 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 9 |
| sample.Corners 1.0 | 1 | 1% | 5 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.6 | 97 / 210 | 2.30 | 17.4% | 25311 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 17.4% | 97 |
| eem.EvBotNG v12.8 | 2.0 | 16.4% | 77 |
| ary.Swarm 1.1 | 3.3 | 13.1% | 9 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.4% | 13 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.3% | 14 |
| shrub.Silver v048 | 6.5 | 8.1% | 0 |
| zyx.nano.Ant 1.1 | 6.7 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.7% | 1 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.3 | 16 / 35 | 3967 |
| 2 | 1 | 65.9 | 82.5 | 11 / 35 | 4132 |
| 3 | 1 | 69.1 | 90.5 | 19 / 35 | 4613 |
| 4 | 1 | 67.8 | 87.0 | 18 / 35 | 4231 |
| 5 | 1 | 67.3 | 86.0 | 17 / 35 | 4043 |
| 6 | 1 | 67.4 | 86.0 | 16 / 35 | 4325 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 86 | 47% |
| ary.Swarm 1.1 | 24 | 96% |
| simonton.nano.MeleeSeed 1.8 | 16 | 88% |
| lessonz.robocode.Oz 0.5.0 | 14 | 93% |
| jsal.Jsalbot 1.0 | 4 | 100% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1035. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 61 | 54% | 98 |
| ary.Swarm 1.1 | 22 | 19% | 46 |
| simonton.nano.MeleeSeed 1.8 | 13 | 11% | 28 |
| lessonz.robocode.Oz 0.5.0 | 13 | 11% | 26 |
| shrub.Silver v048 | 2 | 2% | 3 |
| zyx.nano.Ant 1.1 | 1 | 1% | 2 |
| stelo.Mirror 1.1 | 1 | 1% | 1 |
| jsal.Jsalbot 1.0 | 0 | 0% | 4 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 88.8 | 122 / 210 | 2.00 | 18.8% | 30802 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 18.8% | 122 |
| wompi.Wallaby 5.1 | 2.0 | 15.3% | 44 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.6% | 13 |
| ara.Shera 0.88 | 3.5 | 13.8% | 31 |
| amz.NanoClone 1.41 | 5.0 | 8.7% | 0 |
| maribo.IotaCT 1.1 | 6.8 | 6.7% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.6% | 0 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.8% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 8.8 | 5.4% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.6 | 19 / 35 | 4963 |
| 2 | 1 | 68.2 | 88.6 | 20 / 35 | 4906 |
| 3 | 1 | 67.5 | 84.8 | 16 / 35 | 5083 |
| 4 | 1 | 69.6 | 91.1 | 22 / 35 | 5232 |
| 5 | 1 | 68.6 | 88.3 | 19 / 35 | 5056 |
| 6 | 1 | 70.4 | 92.7 | 26 / 35 | 5562 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 59 | 81% |
| ara.Shera 0.88 | 52 | 77% |
| maribo.mini.MiniQuester 0.1 | 29 | 97% |
| amz.NanoClone 1.41 | 2 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| dsw.StaticD 1.0 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 34 | 38% | 69 |
| wompi.Wallaby 5.1 | 29 | 33% | 80 |
| maribo.mini.MiniQuester 0.1 | 16 | 18% | 43 |
| amz.NanoClone 1.41 | 3 | 3% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 2% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 3 |
| dsw.StaticD 1.0 | 2 | 2% | 3 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.5 | 40 / 210 | 3.03 | 15.0% | 22159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 140 |
| hadur117.mini.DeisePNS6 0.4 | 2.2 | 15.0% | 40 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.5% | 19 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.9% | 8 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.6% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.7 | 6.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.5% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.5 | 75.6 | 6 / 35 | 3562 |
| 2 | 2 | 63.1 | 74.9 | 6 / 35 | 3493 |
| 3 | 2 | 66.2 | 81.6 | 11 / 35 | 4064 |
| 4 | 2 | 63.6 | 76.5 | 3 / 35 | 3489 |
| 5 | 2 | 66.2 | 82.2 | 8 / 35 | 4021 |
| 6 | 3 | 63.4 | 74.0 | 6 / 35 | 3530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 83 | 24% |
| brainfade.melee.Dusk 0.44 | 11 | 73% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |
| mz.NanoGod 2.02 | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 981. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 52% | 112 |
| brainfade.melee.Dusk 0.44 | 29 | 17% | 35 |
| dummy.micro.Sparrow 2.5 | 21 | 12% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 15 |
| Krabb.akim2.Akim2 1.1b | 10 | 6% | 11 |
| mz.NanoGod 2.02 | 8 | 5% | 8 |
| jab.DiamondStealer 5 | 2 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.8 | 117 / 210 | 2.19 | 18.8% | 31335 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 18.8% | 117 |
| stelo.Liblix 0.3.1 | 2.0 | 16.3% | 60 |
| tzu.TheArtOfWar 1.2 | 3.0 | 14.6% | 28 |
| wompi.Quokka 1.6 | 4.0 | 10.3% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.6% | 0 |
| jwirde.Gort 2.0 | 5.7 | 8.0% | 4 |
| disan.Chair 2.2.0 | 7.2 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 0 |
| sample.Crazy 1.0 | 9.3 | 4.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.4 | 21 / 35 | 4938 |
| 2 | 1 | 69.0 | 87.0 | 21 / 35 | 5566 |
| 3 | 1 | 69.5 | 87.9 | 21 / 35 | 5219 |
| 4 | 1 | 68.2 | 84.8 | 18 / 35 | 5178 |
| 5 | 1 | 68.2 | 86.3 | 19 / 35 | 5000 |
| 6 | 1 | 70.0 | 90.2 | 17 / 35 | 5434 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 92 | 77% |
| tzu.TheArtOfWar 1.2 | 39 | 69% |
| wompi.Quokka 1.6 | 9 | 78% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 900. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 38% | 104 |
| tzu.TheArtOfWar 1.2 | 35 | 36% | 65 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 10% | 14 |
| wompi.Quokka 1.6 | 9 | 9% | 15 |
| jwirde.Gort 2.0 | 1 | 1% | 4 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 32 over 6 battles (5.3 per battle, most in one battle 17). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.7 | 98 / 210 | 1.74 | 20.5% | 36617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeisePNS6 0.4 | 1.0 | 20.5% | 98 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.8% | 103 |
| sul.Lunar 1.1 | 3.5 | 10.6% | 6 |
| jje.BagPuss 1.2 | 3.7 | 11.3% | 1 |
| myl.nano.Graviton 1.10 | 5.2 | 9.6% | 1 |
| fm.claire 1.7 | 6.7 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 6.7 | 8.2% | 1 |
| hvilela.HVilela 0.9 | 7.0 | 8.0% | 0 |
| wit.Deep7 2.0 | 9.0 | 5.9% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.8 | 16 / 35 | 6032 |
| 2 | 1 | 70.4 | 91.7 | 14 / 35 | 6115 |
| 3 | 1 | 69.6 | 88.9 | 14 / 35 | 6018 |
| 4 | 1 | 70.8 | 93.0 | 17 / 35 | 6153 |
| 5 | 1 | 71.0 | 93.3 | 16 / 35 | 6365 |
| 6 | 1 | 70.5 | 92.7 | 21 / 35 | 5934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 124 | 26% |
| jje.BagPuss 1.2 | 17 | 100% |
| myl.nano.Graviton 1.10 | 17 | 94% |
| sul.Lunar 1.1 | 16 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 11 | 91% |
| wit.Deep7 2.0 | 4 | 100% |
| fm.claire 1.7 | 3 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 2623. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 94 | 84% | 0 |
| sul.Lunar 1.1 | 5 | 4% | 57 |
| fm.claire 1.7 | 5 | 4% | 12 |
| myl.nano.Graviton 1.10 | 4 | 4% | 28 |
| jje.BagPuss 1.2 | 2 | 2% | 56 |
| pez.mini.ChironexFleckeri 0.5 | 1 | 1% | 20 |
| wit.Deep7 2.0 | 1 | 1% | 17 |
| hvilela.HVilela 0.9 | 0 | 0% | 15 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeisePNS6 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 83.7 | 67 / 210 | 2.47 | 16.3% | 24259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 59 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.4% | 74 |
| hadur117.mini.DeisePNS6 0.4 | 2.3 | 16.3% | 67 |
| cx.Princess 1.0 | 4.5 | 10.1% | 9 |
| mz.MicroSheep 1.0 | 4.5 | 10.4% | 1 |
| sadoner.killer 0.2 | 6.0 | 8.7% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.1% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.3% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.1 | 83.8 | 8 / 35 | 3931 |
| 2 | 1 | 65.9 | 84.8 | 12 / 35 | 4120 |
| 3 | 2 | 65.6 | 82.2 | 13 / 35 | 3928 |
| 4 | 3 | 65.7 | 82.2 | 10 / 35 | 4393 |
| 5 | 2 | 65.9 | 83.5 | 13 / 35 | 3928 |
| 6 | 3 | 66.1 | 85.7 | 11 / 35 | 3959 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 53% |
| rsalesc.melee.Medina 0.4.5 | 44 | 39% |
| cx.Princess 1.0 | 16 | 81% |
| mz.MicroSheep 1.0 | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 43% | 102 |
| rsalesc.melee.Medina 0.4.5 | 49 | 34% | 63 |
| mz.MicroSheep 1.0 | 16 | 11% | 18 |
| cx.Princess 1.0 | 7 | 5% | 14 |
| sadoner.killer 0.2 | 5 | 3% | 8 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
1 death(s) with no robot to name.

