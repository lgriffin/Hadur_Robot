# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 86.3 | 43 / 210 | 2.23 | 16.6% | 27110 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.5% | 147 |
| hadur117.mini.DeiseFAPW 0.3 | 2.0 | 16.6% | 43 |
| sgp.JollyNinja 3.53 | 3.8 | 11.2% | 12 |
| mz.MicroGodMelee 1 | 4.2 | 10.9% | 4 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.4% | 3 |
| lorneswork.Predator 1.0 | 5.7 | 9.0% | 0 |
| adt.Ar2 1.0 | 6.8 | 7.9% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.9% | 0 |
| skm.butterfly 1.0 | 8.8 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 85.7 | 9 / 35 | 4579 |
| 2 | 2 | 66.0 | 84.4 | 8 / 35 | 4416 |
| 3 | 2 | 64.7 | 84.8 | 4 / 35 | 4006 |
| 4 | 2 | 66.8 | 87.3 | 7 / 35 | 4764 |
| 5 | 2 | 66.3 | 86.7 | 7 / 35 | 4623 |
| 6 | 2 | 67.3 | 89.2 | 8 / 35 | 4722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 10% |
| sgp.JollyNinja 3.53 | 12 | 92% |
| mz.MicroGodMelee 1 | 10 | 70% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 83% |
| lorneswork.Predator 1.0 | 4 | 100% |
| adt.Ar2 1.0 | 3 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 1298. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 81% | 150 |
| sgp.JollyNinja 3.53 | 14 | 8% | 20 |
| mz.MicroGodMelee 1 | 9 | 5% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 9 |
| lorneswork.Predator 1.0 | 4 | 2% | 8 |
| adt.Ar2 1.0 | 0 | 0% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.5 | 104 / 210 | 2.48 | 17.5% | 26720 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 17.5% | 104 |
| pulsar.PulsarMax 0.8.9 | 2.0 | 15.0% | 49 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.4% | 20 |
| lrem.micro.SpikeSoldier 0.4 | 4.5 | 10.1% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 9.6% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.4% | 6 |
| Noran.BitchingElk 0.054 | 7.3 | 7.3% | 10 |
| sch.Simone 0.3d | 7.7 | 7.3% | 6 |
| stelo.PatternRobot 1.0 | 8.7 | 6.8% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 79.7 | 19 / 35 | 4128 |
| 2 | 1 | 67.2 | 85.1 | 16 / 35 | 4746 |
| 3 | 1 | 67.6 | 84.4 | 19 / 35 | 4552 |
| 4 | 1 | 66.2 | 82.9 | 15 / 35 | 4564 |
| 5 | 1 | 66.7 | 84.4 | 18 / 35 | 4396 |
| 6 | 1 | 66.7 | 84.8 | 17 / 35 | 4334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 46 | 67% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 88% |
| sch.Simone 0.3d | 12 | 92% |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 56% |
| stelo.PatternRobot 1.0 | 8 | 88% |
| lrem.micro.SpikeSoldier 0.4 | 7 | 86% |
| Noran.BitchingElk 0.054 | 7 | 43% |
| fnc.bandit.Bandit 5.2.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 29 | 27% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 27 | 25% | 60 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 12% | 18 |
| stelo.PatternRobot 1.0 | 12 | 11% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 10% | 21 |
| Noran.BitchingElk 0.054 | 8 | 7% | 14 |
| sch.Simone 0.3d | 3 | 3% | 13 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 4 |
| fullsail.SweetTea 1.1 | 1 | 1% | 6 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 93.8 | 160 / 210 | 1.56 | 20.2% | 34190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.2% | 160 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.6% | 9 |
| radnor.DoctorBob 1.42 | 2.8 | 13.3% | 12 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 24 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 2 |
| adt.Ar1 2.1 | 6.7 | 7.3% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 7.2% | 1 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.6% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.8% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 96.2 | 27 / 35 | 5404 |
| 2 | 1 | 70.0 | 92.4 | 26 / 35 | 5513 |
| 3 | 1 | 70.4 | 94.6 | 27 / 35 | 5741 |
| 4 | 1 | 70.7 | 95.2 | 29 / 35 | 5789 |
| 5 | 1 | 69.4 | 91.1 | 25 / 35 | 5514 |
| 6 | 1 | 70.9 | 93.3 | 26 / 35 | 6229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 73 | 73% |
| kawigi.nano.Lib 1.0 | 58 | 100% |
| radnor.DoctorBob 1.42 | 39 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 25 | 50% | 78 |
| radnor.DoctorBob 1.42 | 10 | 20% | 41 |
| kawigi.nano.Lib 1.0 | 9 | 18% | 66 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 6% | 7 |
| urdos.URDOS 1.3 | 2 | 4% | 7 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 4 |
| adt.Ar1 2.1 | 0 | 0% | 3 |

## Melee bench: F04

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.6 | 40 / 210 | 2.20 | 17.4% | 32364 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 165 |
| hadur117.mini.DeiseFAPW 0.3 | 2.0 | 17.4% | 40 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.6% | 5 |
| TNT.TNT 0.99.1 | 4.0 | 10.2% | 1 |
| josago.Jorgito 0.16 | 5.0 | 8.9% | 0 |
| tj.zombie1n 1.0.1 | 6.2 | 7.2% | 0 |
| css.Delitioner 0.11 | 6.8 | 6.5% | 2 |
| rampancy.Durandal 2.1d | 8.3 | 5.5% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.7% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.7 | 87.6 | 10 / 35 | 5756 |
| 2 | 2 | 67.1 | 85.4 | 5 / 35 | 5082 |
| 3 | 2 | 67.1 | 85.7 | 9 / 35 | 5127 |
| 4 | 2 | 66.5 | 84.4 | 3 / 35 | 5063 |
| 5 | 2 | 68.1 | 86.0 | 6 / 35 | 5553 |
| 6 | 2 | 69.2 | 90.5 | 7 / 35 | 5783 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 161 | 18% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| TNT.TNT 0.99.1 | 4 | 75% |
| css.Delitioner 0.11 | 2 | 50% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 1537. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 149 | 87% | 182 |
| apc.LeeroyJenkins2 1.0 | 10 | 6% | 15 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| TNT.TNT 0.99.1 | 2 | 1% | 4 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.2 | 74.3 | 25 / 210 | 3.31 | 13.6% | 19196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.7% | 111 |
| justin.DemonicRage 3.4 | 2.0 | 16.6% | 54 |
| hadur117.mini.DeiseFAPW 0.3 | 3.0 | 13.6% | 25 |
| wompi.Numbat 2.1 | 4.0 | 12.7% | 13 |
| ms.Ares 0.19 | 5.5 | 9.2% | 4 |
| axeBots.HataMoto 3.09 | 5.5 | 8.8% | 4 |
| supersample.SuperBoxBot 1.0 | 7.0 | 6.7% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.2% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.4 | 71.7 | 6 / 35 | 2960 |
| 2 | 3 | 59.2 | 71.1 | 2 / 35 | 2910 |
| 3 | 3 | 61.8 | 75.6 | 4 / 35 | 3290 |
| 4 | 3 | 62.5 | 76.2 | 6 / 35 | 3306 |
| 5 | 3 | 64.4 | 81.6 | 6 / 35 | 3676 |
| 6 | 3 | 59.1 | 69.8 | 1 / 35 | 3054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 42 | 10% |
| justin.DemonicRage 3.4 | 36 | 39% |
| wompi.Numbat 2.1 | 6 | 83% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 2 | 0% |

Hadur died in 186 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 77 | 41% | 81 |
| justin.DemonicRage 3.4 | 50 | 27% | 64 |
| wompi.Numbat 2.1 | 23 | 12% | 26 |
| ms.Ares 0.19 | 13 | 7% | 13 |
| axeBots.HataMoto 3.09 | 7 | 4% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 4% | 7 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.0 | 121 / 210 | 2.17 | 18.1% | 26363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.1% | 121 |
| jekl.StoneGhost 0.7 | 2.2 | 14.5% | 20 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.3 | 12.7% | 30 |
| origin.SleepSiphon 1.7b | 3.5 | 12.9% | 32 |
| mld.Wisdom 1.0 | 5.3 | 9.7% | 2 |
| gg.Wolverine 2.0 | 5.7 | 8.7% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.7% | 4 |
| DBall.NUKE 0.1 | 8.0 | 6.8% | 0 |
| spinnercat.Omen 1.0 | 8.2 | 6.7% | 0 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 84.4 | 22 / 35 | 4168 |
| 2 | 1 | 66.9 | 84.4 | 17 / 35 | 4233 |
| 3 | 1 | 67.0 | 85.7 | 18 / 35 | 4448 |
| 4 | 1 | 67.7 | 87.6 | 19 / 35 | 4553 |
| 5 | 1 | 68.4 | 89.5 | 23 / 35 | 4353 |
| 6 | 1 | 68.7 | 90.5 | 22 / 35 | 4608 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 43 | 86% |
| pe.minimelee.SandboxMiniMelee 1.1 | 39 | 74% |
| origin.SleepSiphon 1.7b | 33 | 85% |
| gg.Wolverine 2.0 | 12 | 100% |
| mld.Wisdom 1.0 | 5 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 75% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 28 | 30% | 57 |
| jekl.StoneGhost 0.7 | 25 | 27% | 58 |
| origin.SleepSiphon 1.7b | 23 | 25% | 60 |
| mld.Wisdom 1.0 | 6 | 6% | 11 |
| gg.Wolverine 2.0 | 5 | 5% | 12 |
| spinnercat.Omen 1.0 | 2 | 2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 5 |
| DBall.NUKE 0.1 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.7 | 139 / 210 | 1.57 | 20.0% | 32838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.0% | 139 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.2% | 42 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.2% | 3 |
| franzor.Lizt 1.3.1 | 4.8 | 10.2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 8.2% | 0 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.6 | 96.8 | 29 / 35 | 5636 |
| 2 | 1 | 72.0 | 95.9 | 24 / 35 | 5652 |
| 3 | 1 | 70.7 | 90.5 | 20 / 35 | 5319 |
| 4 | 1 | 70.6 | 91.7 | 21 / 35 | 5326 |
| 5 | 1 | 71.7 | 93.7 | 24 / 35 | 5673 |
| 6 | 1 | 70.7 | 93.3 | 21 / 35 | 5232 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 96 | 90% |
| rsalesc.melee.Monk 0.3.6c | 49 | 37% |
| oog.melee.CapuletDroid 1.1 | 28 | 93% |
| franzor.Lizt 1.3.1 | 13 | 69% |

Hadur died in 71 of 210 rounds, at a mean tick of 1487. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 41 | 58% | 71 |
| rtk.Tachikoma 1.0 | 21 | 30% | 104 |
| franzor.Lizt 1.3.1 | 4 | 6% | 0 |
| oog.melee.CapuletDroid 1.1 | 3 | 4% | 28 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |

## Melee bench: F08

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.8 | 138 / 210 | 1.83 | 19.5% | 29900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.5% | 138 |
| tm.Yuugao 1.0 | 2.3 | 12.9% | 32 |
| shrub.Vapour v159 | 2.7 | 12.8% | 22 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.5% | 9 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.5% | 3 |
| m3thos.Eva00 1.1 | 6.3 | 8.1% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.3% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.5% | 1 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 6.0% | 0 |
| SHAM.WOW 1.4 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.5 | 26 / 35 | 5022 |
| 2 | 1 | 69.0 | 88.6 | 23 / 35 | 5144 |
| 3 | 1 | 70.3 | 93.3 | 25 / 35 | 5390 |
| 4 | 1 | 69.4 | 93.7 | 22 / 35 | 4938 |
| 5 | 1 | 68.4 | 88.6 | 21 / 35 | 4846 |
| 6 | 1 | 68.3 | 91.1 | 21 / 35 | 4560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 59 | 71% |
| shrub.Vapour v159 | 37 | 70% |
| Krabb.sliNk.Garm 0.9u | 27 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 19 | 89% |
| com.spp.robocode.MostlyHarmless 010 | 18 | 89% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| m3thos.Eva00 1.1 | 3 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 26 | 36% | 56 |
| tm.Yuugao 1.0 | 24 | 33% | 73 |
| Krabb.sliNk.Garm 0.9u | 9 | 13% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 6% | 23 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 17 |
| m3thos.Eva00 1.1 | 3 | 4% | 7 |
| SHAM.WOW 1.4 | 1 | 1% | 5 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 1 |

## Melee bench: F09

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.3 | 75.9 | 58 / 210 | 3.17 | 15.2% | 22283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.2 | 17.5% | 95 |
| hadur117.mini.DeiseFAPW 0.3 | 2.0 | 15.2% | 58 |
| kc.micro.Figment 1.0 | 2.8 | 14.0% | 30 |
| yagami.Tidus 0.11 | 4.0 | 11.2% | 2 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.9% | 11 |
| mc2.enemy.Original 0.9 | 5.8 | 9.0% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 2 |
| step.nanoPri 1.0 | 8.2 | 6.0% | 0 |
| rdm.Dueler 0.4x | 9.2 | 4.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.0 | 76.5 | 12 / 35 | 4062 |
| 2 | 2 | 61.7 | 71.7 | 10 / 35 | 3436 |
| 3 | 3 | 64.6 | 75.6 | 10 / 35 | 4189 |
| 4 | 2 | 61.0 | 70.8 | 7 / 35 | 3285 |
| 5 | 1 | 65.8 | 83.2 | 10 / 35 | 3970 |
| 6 | 2 | 62.9 | 77.5 | 9 / 35 | 3341 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 34% |
| kc.micro.Figment 1.0 | 34 | 68% |
| mc2.enemy.Original 0.9 | 9 | 56% |
| yagami.Tidus 0.11 | 6 | 83% |
| pedersen.Grishnakh 1.0 | 6 | 50% |
| dft.Calliope 5.6 | 3 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 873. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 56 | 37% | 76 |
| kc.micro.Figment 1.0 | 33 | 22% | 55 |
| yagami.Tidus 0.11 | 23 | 15% | 30 |
| mc2.enemy.Original 0.9 | 16 | 11% | 21 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 8 |
| pedersen.Grishnakh 1.0 | 7 | 5% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 7 |
| step.nanoPri 1.0 | 3 | 2% | 5 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 95.8 | 172 / 210 | 1.38 | 20.3% | 31148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.3% | 172 |
| DTF.Kludgy 1.2b | 2.0 | 13.6% | 17 |
| ne.Chimera 1.2 | 3.0 | 12.9% | 6 |
| ejb.Polaris 1.0.1 | 4.0 | 11.8% | 7 |
| vStar.RAFzilla 2.15 | 5.5 | 10.1% | 2 |
| tvv.micro.Antares 1.1.1 | 5.5 | 10.2% | 5 |
| kurios.DOSexe .9b | 7.5 | 5.9% | 1 |
| sam.Samspin 1.0 | 8.0 | 5.8% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 98.7 | 31 / 35 | 5279 |
| 2 | 1 | 70.1 | 93.3 | 27 / 35 | 5139 |
| 3 | 1 | 70.6 | 96.8 | 30 / 35 | 5029 |
| 4 | 1 | 70.1 | 93.3 | 27 / 35 | 5251 |
| 5 | 1 | 70.9 | 96.2 | 28 / 35 | 5250 |
| 6 | 1 | 70.4 | 96.2 | 29 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 84% |
| ejb.Polaris 1.0.1 | 43 | 91% |
| ne.Chimera 1.2 | 38 | 92% |
| vStar.RAFzilla 2.15 | 26 | 96% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| donjezza.Muncho 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 988. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 16 | 42% | 65 |
| ne.Chimera 1.2 | 8 | 21% | 42 |
| ejb.Polaris 1.0.1 | 6 | 16% | 47 |
| tvv.micro.Antares 1.1.1 | 3 | 8% | 15 |
| vStar.RAFzilla 2.15 | 2 | 5% | 21 |
| sam.Samspin 1.0 | 2 | 5% | 2 |
| donjezza.Muncho 1.0 | 1 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.2 | 94 / 210 | 2.51 | 17.1% | 25111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.3 | 17.1% | 94 |
| rz.Aleph 0.34 | 1.7 | 16.5% | 66 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.8% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 10.4% | 5 |
| rdt199.Warlord 0.73 | 5.2 | 9.5% | 15 |
| br2.MobyDickBot 1.6 | 6.2 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 5 |
| KiraNL.Chupacabra 0.4 | 7.8 | 6.9% | 0 |
| stelo.MirrorNano 1.3 | 9.2 | 5.1% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.5 | 15 / 35 | 4234 |
| 2 | 1 | 66.2 | 83.2 | 17 / 35 | 4131 |
| 3 | 2 | 66.4 | 85.4 | 17 / 35 | 4097 |
| 4 | 1 | 65.8 | 80.6 | 15 / 35 | 4424 |
| 5 | 1 | 65.6 | 82.2 | 15 / 35 | 3944 |
| 6 | 2 | 66.7 | 84.4 | 15 / 35 | 4281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 70 | 59% |
| cx.mini.Nimrod 0.55 | 19 | 95% |
| djc.DynaBot 0.1.1 | 14 | 71% |
| uji.YellohFellah 1.0 | 11 | 100% |
| br2.MobyDickBot 1.6 | 10 | 70% |
| rdt199.Warlord 0.73 | 10 | 70% |

Hadur died in 116 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 56 | 48% | 96 |
| cx.mini.Nimrod 0.55 | 24 | 21% | 41 |
| rdt199.Warlord 0.73 | 14 | 12% | 24 |
| djc.DynaBot 0.1.1 | 11 | 9% | 18 |
| br2.MobyDickBot 1.6 | 5 | 4% | 12 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 4 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |
| uji.YellohFellah 1.0 | 1 | 1% | 13 |

## Melee bench: F12

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 88.7 | 144 / 210 | 2.02 | 18.5% | 22954 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.5% | 144 |
| bts.wiki.RipCurl 0.9b | 2.2 | 13.9% | 24 |
| nat.PallasHawk 1.0 | 3.0 | 12.7% | 20 |
| darkcanuck.Leon 1.01 | 3.8 | 12.1% | 13 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 6 |
| jrm.Test0 1.0 | 6.5 | 7.8% | 0 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.4% | 1 |
| jp.Perpy 16.0 | 7.7 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.5% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 81.6 | 20 / 35 | 3512 |
| 2 | 1 | 69.9 | 95.6 | 29 / 35 | 3824 |
| 3 | 1 | 67.5 | 87.9 | 22 / 35 | 3805 |
| 4 | 1 | 68.5 | 90.5 | 22 / 35 | 4029 |
| 5 | 1 | 68.5 | 90.8 | 25 / 35 | 3888 |
| 6 | 1 | 67.8 | 85.7 | 26 / 35 | 3896 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 54 | 89% |
| nat.PallasHawk 1.0 | 46 | 91% |
| darkcanuck.Leon 1.01 | 35 | 94% |
| brainfade.melee.Genghis 0.36 | 15 | 87% |
| jaybot.bots.Oddball 4.0 | 6 | 67% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 19 | 28% | 47 |
| nat.PallasHawk 1.0 | 18 | 26% | 58 |
| darkcanuck.Leon 1.01 | 11 | 16% | 58 |
| jrm.Test0 1.0 | 6 | 9% | 10 |
| brainfade.melee.Genghis 0.36 | 5 | 7% | 12 |
| jaybot.bots.Oddball 4.0 | 4 | 6% | 9 |
| cs.sheldor.Talon 1.1 | 2 | 3% | 9 |
| jp.Perpy 16.0 | 2 | 3% | 2 |
| stuff.Vlad 0.1 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 85.3 | 85 / 210 | 2.32 | 16.6% | 24180 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.7 | 16.6% | 85 |
| mn.Combat 3.25.0 | 2.2 | 16.2% | 72 |
| ags.Glacier 0.2.11 | 2.2 | 16.1% | 31 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 9 |
| shinh.Entangled 0.3 | 4.5 | 12.1% | 12 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 7.0 | 6.6% | 2 |
| ayk.WallHugger 1.0 | 7.8 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.2% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 85.7 | 15 / 35 | 3908 |
| 2 | 2 | 65.6 | 83.8 | 14 / 35 | 3746 |
| 3 | 2 | 66.5 | 86.3 | 13 / 35 | 4252 |
| 4 | 2 | 64.7 | 81.0 | 13 / 35 | 3749 |
| 5 | 1 | 66.9 | 87.0 | 16 / 35 | 4203 |
| 6 | 1 | 67.5 | 88.3 | 14 / 35 | 4322 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 60 | 47% |
| ags.Glacier 0.2.11 | 55 | 76% |
| shinh.Entangled 0.3 | 19 | 47% |
| gh.micro.Gruweltje 0.7 | 4 | 100% |
| stelo.Wang 1.0 | 3 | 33% |
| apc.Colossus2 0.17 | 1 | 100% |

Hadur died in 127 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 52 | 41% | 78 |
| ags.Glacier 0.2.11 | 36 | 28% | 77 |
| shinh.Entangled 0.3 | 18 | 14% | 29 |
| gh.micro.Gruweltje 0.7 | 11 | 9% | 16 |
| stelo.Wang 1.0 | 4 | 3% | 4 |
| apc.Colossus2 0.17 | 2 | 2% | 3 |
| ayk.WallHugger 1.0 | 2 | 2% | 2 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.2 | 170 / 210 | 1.52 | 20.2% | 30520 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.2% | 170 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.6% | 18 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.8% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 4.2 | 10.2% | 2 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 9.0% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.5% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.9% | 7 |
| pa.Improved 1.0 | 9.0 | 5.2% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 98.7 | 31 / 35 | 5340 |
| 2 | 1 | 69.8 | 92.4 | 26 / 35 | 4945 |
| 3 | 1 | 70.5 | 94.3 | 28 / 35 | 5199 |
| 4 | 1 | 71.4 | 97.5 | 31 / 35 | 5156 |
| 5 | 1 | 69.8 | 91.7 | 27 / 35 | 4651 |
| 6 | 1 | 69.9 | 90.8 | 27 / 35 | 5229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 92 | 88% |
| catcat20.shape.Theta 0.018 | 52 | 87% |
| sanyi.mikrobi.Roberto 1.0 | 17 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 92% |
| co.edu.usb.rc.LidisTron 1.0 | 10 | 100% |
| pa.Improved 1.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 829. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 20 | 50% | 101 |
| catcat20.shape.Theta 0.018 | 11 | 28% | 47 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 13% | 16 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 5% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 3% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 3% | 9 |
| pa.Improved 1.0 | 0 | 0% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.5 | 110 / 210 | 2.49 | 17.9% | 29366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 17.9% | 110 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 25 |
| emp.Yngwie 1.11 | 3.5 | 12.8% | 39 |
| mld.DustBunny 3.8 | 4.2 | 12.3% | 9 |
| cb.nano.Insomnia 1.0 | 4.2 | 11.4% | 12 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.7% | 14 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.3% | 1 |
| lambdaxy.TBot 0.1 | 7.7 | 6.3% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.0% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.6 | 17 / 35 | 4946 |
| 2 | 1 | 67.0 | 81.0 | 17 / 35 | 5025 |
| 3 | 1 | 65.5 | 77.8 | 17 / 35 | 4722 |
| 4 | 1 | 67.7 | 85.1 | 18 / 35 | 4896 |
| 5 | 1 | 66.0 | 78.7 | 16 / 35 | 4723 |
| 6 | 1 | 69.9 | 90.8 | 25 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 43 | 98% |
| emp.Yngwie 1.11 | 29 | 55% |
| mld.DustBunny 3.8 | 20 | 90% |
| cb.nano.Insomnia 1.0 | 19 | 74% |
| kawigi.robot.Girl 1.2 | 17 | 76% |
| divineomega.TrialBot 0.003 | 5 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 35% | 61 |
| mld.DustBunny 3.8 | 16 | 16% | 44 |
| cb.nano.Insomnia 1.0 | 15 | 15% | 17 |
| kawigi.robot.Girl 1.2 | 14 | 14% | 26 |
| kawigi.micro.Shiz 1.1 | 13 | 13% | 49 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| Grystrion.TrackerWO 1.0 | 2 | 2% | 3 |
| divineomega.TrialBot 0.003 | 1 | 1% | 5 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 86.9 | 111 / 210 | 2.18 | 19.1% | 33407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.1% | 111 |
| gh.Griezel 0.5.2 | 2.0 | 16.5% | 65 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.2% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 9.8% | 19 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.5% | 3 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.9% | 2 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.6% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.7 | 5.3% | 2 |
| asd.Cthulhu 1.3 | 9.0 | 4.5% | 0 |
| repositorio.NanoStep 1.0 | 9.3 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.1 | 19 / 35 | 5404 |
| 2 | 1 | 70.6 | 90.8 | 20 / 35 | 5785 |
| 3 | 1 | 70.0 | 87.3 | 23 / 35 | 5808 |
| 4 | 1 | 69.1 | 86.3 | 18 / 35 | 5518 |
| 5 | 1 | 68.5 | 84.8 | 18 / 35 | 5289 |
| 6 | 1 | 68.8 | 87.0 | 13 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 89 | 57% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 91% |
| techdude.forest.FlamingForest 1.1 | 21 | 67% |
| bvh.fnr.Fenrir 0.36l | 11 | 91% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1343. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 48 | 48% | 107 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 25 | 25% | 42 |
| techdude.forest.FlamingForest 1.1 | 8 | 8% | 23 |
| bvh.fnr.Fenrir 0.36l | 8 | 8% | 11 |
| stelo.IntrinsicVolatility 1.4 | 4 | 4% | 10 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 6 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 9 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 82.2 | 98 / 210 | 2.60 | 17.3% | 28413 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 17.3% | 98 |
| et.Predator 1.8 | 2.3 | 13.6% | 22 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.5% | 29 |
| cx.BlestPain 1.41 | 4.3 | 11.9% | 41 |
| nic.Nicator 2.4 | 4.7 | 11.3% | 12 |
| ahf.NanoAndrew .4 | 5.3 | 10.6% | 7 |
| maribo.melee.BMV 0.1 | 6.8 | 9.0% | 1 |
| tex.Longbot 0.4 | 8.3 | 5.8% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.5 | 78.7 | 13 / 35 | 4551 |
| 2 | 1 | 68.9 | 89.8 | 16 / 35 | 5088 |
| 3 | 1 | 67.0 | 82.2 | 20 / 35 | 4692 |
| 4 | 1 | 67.7 | 85.4 | 21 / 35 | 4833 |
| 5 | 1 | 65.1 | 77.8 | 14 / 35 | 4580 |
| 6 | 1 | 65.6 | 79.4 | 14 / 35 | 4669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 52 | 81% |
| oog.melee.Mercutio 1.0 | 29 | 72% |
| cx.BlestPain 1.41 | 28 | 39% |
| nic.Nicator 2.4 | 13 | 85% |
| ahf.NanoAndrew .4 | 11 | 82% |
| maribo.melee.BMV 0.1 | 4 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1005. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 30 | 27% | 74 |
| cx.BlestPain 1.41 | 30 | 27% | 43 |
| oog.melee.Mercutio 1.0 | 17 | 15% | 36 |
| nic.Nicator 2.4 | 14 | 12% | 24 |
| ahf.NanoAndrew .4 | 11 | 10% | 18 |
| maribo.melee.BMV 0.1 | 4 | 4% | 6 |
| tex.Longbot 0.4 | 4 | 4% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 88.3 | 131 / 210 | 2.05 | 18.3% | 24839 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.3% | 131 |
| morbid.MorbidPriest 1.0 | 2.5 | 12.9% | 22 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.2% | 24 |
| uji.DBH 1.1 | 4.7 | 10.7% | 12 |
| ratosh.Nobo 0.21 | 5.0 | 10.1% | 6 |
| spinnercat.Robovirus 2.718 | 5.2 | 9.7% | 9 |
| sigterm.Sigterm 1.0 | 6.8 | 8.5% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 7.1% | 0 |
| stelo.WangRobot 1.0 | 9.3 | 5.2% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 88.9 | 20 / 35 | 4040 |
| 2 | 1 | 66.9 | 88.3 | 18 / 35 | 4114 |
| 3 | 1 | 66.1 | 84.4 | 20 / 35 | 3813 |
| 4 | 1 | 68.5 | 89.5 | 24 / 35 | 4552 |
| 5 | 1 | 68.3 | 90.8 | 26 / 35 | 3952 |
| 6 | 1 | 68.1 | 87.9 | 23 / 35 | 4368 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 44 | 86% |
| agd.Mooserwirt2 2.7 | 35 | 80% |
| uji.DBH 1.1 | 27 | 78% |
| spinnercat.Robovirus 2.718 | 19 | 79% |
| sigterm.Sigterm 1.0 | 14 | 86% |
| ratosh.Nobo 0.21 | 8 | 100% |
| stelo.WangRobot 1.0 | 7 | 86% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 50% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 23 | 29% | 62 |
| agd.Mooserwirt2 2.7 | 17 | 21% | 51 |
| uji.DBH 1.1 | 10 | 13% | 20 |
| ratosh.Nobo 0.21 | 8 | 10% | 19 |
| spinnercat.Robovirus 2.718 | 8 | 10% | 18 |
| sigterm.Sigterm 1.0 | 5 | 6% | 15 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 4 |
| stelo.WangRobot 1.0 | 2 | 3% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 3% | 9 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 93.8 | 163 / 210 | 1.56 | 20.5% | 32623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.5% | 163 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.2% | 20 |
| mld.Infinity 2.2 | 2.8 | 14.3% | 23 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 10.6% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.3% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.3 | 7.2% | 0 |
| pac.ABC 2.1 | 7.5 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.5% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 95.6 | 30 / 35 | 5603 |
| 2 | 1 | 71.9 | 95.9 | 28 / 35 | 5485 |
| 3 | 1 | 70.2 | 89.8 | 23 / 35 | 5295 |
| 4 | 1 | 70.5 | 90.8 | 25 / 35 | 5284 |
| 5 | 1 | 72.2 | 95.6 | 28 / 35 | 5816 |
| 6 | 1 | 71.8 | 95.2 | 29 / 35 | 5140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 86 | 90% |
| mld.Infinity 2.2 | 61 | 92% |
| krillr.mini.JointStrike 2.0.0 | 10 | 90% |
| patson.PatsonTestBot 1.0 | 9 | 100% |
| erdnis.Rover 0.3 | 8 | 100% |
| pac.ABC 2.1 | 4 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 989. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 20 | 43% | 107 |
| mld.Infinity 2.2 | 10 | 21% | 25 |
| krillr.mini.JointStrike 2.0.0 | 5 | 11% | 25 |
| patson.PatsonTestBot 1.0 | 5 | 11% | 14 |
| erdnis.Rover 0.3 | 4 | 9% | 20 |
| mbh.Mbh 0.1 | 1 | 2% | 9 |
| pac.ABC 2.1 | 1 | 2% | 2 |
| pbg.R2D2 1.0 | 1 | 2% | 2 |

## Melee bench: F20

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.6 | 132 / 210 | 1.93 | 19.4% | 30914 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.4% | 132 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.9% | 33 |
| fwb.Nine 1.0.1 | 3.2 | 11.5% | 18 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.2% | 5 |
| catcat20.Rabbit 0.001 | 5.0 | 9.8% | 16 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 7.9% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.6% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 7.0% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 88.6 | 22 / 35 | 5181 |
| 2 | 1 | 68.9 | 88.3 | 22 / 35 | 5058 |
| 3 | 1 | 67.2 | 84.1 | 17 / 35 | 4774 |
| 4 | 1 | 70.5 | 93.3 | 25 / 35 | 5425 |
| 5 | 1 | 70.1 | 92.7 | 23 / 35 | 5233 |
| 6 | 1 | 69.9 | 90.8 | 23 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 82 | 79% |
| fwb.Nine 1.0.1 | 43 | 81% |
| catcat20.Rabbit 0.001 | 17 | 71% |
| nz.jdc.nano.GridFu 1.0 | 9 | 78% |
| bayen.nut.Squirrel 1.615 | 8 | 88% |
| djdjdj.NanoSkunk10 1.0 | 4 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 50% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1172. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 44% | 89 |
| fwb.Nine 1.0.1 | 16 | 20% | 22 |
| nz.jdc.nano.GridFu 1.0 | 10 | 13% | 31 |
| catcat20.Rabbit 0.001 | 10 | 13% | 28 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 14 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 8 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 6 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.9 | 134 / 210 | 1.64 | 20.0% | 32118 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.0% | 134 |
| eem.EvBot v4.6.16 | 2.0 | 16.6% | 61 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 10 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.0% | 2 |
| eld.Hmm 1.0 | 5.2 | 8.0% | 4 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.9% | 1 |
| fire219.CatBot 1.0 | 8.0 | 5.8% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| el.JumpShoot 0.2 | 8.7 | 5.7% | 0 |
| arthord.MannyPacquiao Beta | 8.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.4 | 19 / 35 | 5194 |
| 2 | 1 | 70.6 | 91.1 | 23 / 35 | 5553 |
| 3 | 1 | 70.3 | 93.7 | 26 / 35 | 5155 |
| 4 | 1 | 71.5 | 93.7 | 22 / 35 | 5962 |
| 5 | 1 | 69.3 | 91.1 | 19 / 35 | 4988 |
| 6 | 1 | 71.1 | 96.5 | 25 / 35 | 5266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 120 | 67% |
| dummy.mini.Scimitar 1.01 | 32 | 97% |
| cf.RiO.RiOx 4.2.1 | 14 | 86% |
| eld.Hmm 1.0 | 10 | 70% |
| arthord.MannyPacquiao Beta | 2 | 100% |
| oa.weak.BotherBot 0.1 | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 1397. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 47 | 61% | 109 |
| dummy.mini.Scimitar 1.01 | 16 | 21% | 59 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 18 |
| eld.Hmm 1.0 | 5 | 6% | 15 |
| fire219.CatBot 1.0 | 1 | 1% | 2 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 89.2 | 111 / 210 | 1.97 | 18.6% | 28933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.6% | 111 |
| pe.SandboxDT 2.71m | 2.2 | 16.1% | 53 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 31 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 12 |
| bigpete.Stewie 1.0 | 5.0 | 9.8% | 2 |
| tad.Dalek98 0.98 | 6.5 | 6.3% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.5% | 0 |
| gg.Squaraus 0.6 | 7.7 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.5 | 5.5% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 18 / 35 | 4920 |
| 2 | 1 | 68.9 | 90.8 | 16 / 35 | 4766 |
| 3 | 1 | 68.3 | 87.0 | 17 / 35 | 4728 |
| 4 | 1 | 69.4 | 90.5 | 19 / 35 | 4817 |
| 5 | 1 | 69.4 | 91.7 | 21 / 35 | 4819 |
| 6 | 1 | 69.0 | 90.5 | 20 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 56 | 77% |
| pe.SandboxDT 2.71m | 45 | 51% |
| jlm.javaDisturbance 0.59 | 39 | 87% |
| bigpete.Stewie 1.0 | 4 | 100% |
| pbg.NinjaX 1.2 | 4 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 38% | 75 |
| kvk.HebusLeTroll 0.35 | 38 | 38% | 69 |
| jlm.javaDisturbance 0.59 | 19 | 19% | 43 |
| bigpete.Stewie 1.0 | 3 | 3% | 7 |
| tad.Dalek98 0.98 | 2 | 2% | 5 |
| pbg.NinjaX 1.2 | 0 | 0% | 5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 4 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.0 | 133 / 210 | 1.72 | 19.5% | 29608 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.5% | 133 |
| pe.SandboxLump 1.52 | 2.0 | 16.9% | 49 |
| cre.Karolos 0.32 | 3.0 | 14.8% | 19 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 10.8% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 8.7% | 0 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.7% | 3 |
| cw.megas.Blade 0.8 | 7.3 | 7.8% | 0 |
| sample.Walls 1.0 | 7.5 | 7.7% | 0 |
| cli.WasteOfAmmo 1.0 | 9.2 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 9.8 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.9 | 25 / 35 | 5366 |
| 2 | 1 | 70.7 | 92.7 | 22 / 35 | 4943 |
| 3 | 1 | 70.3 | 92.4 | 26 / 35 | 4560 |
| 4 | 1 | 69.0 | 88.6 | 17 / 35 | 4728 |
| 5 | 1 | 71.9 | 94.9 | 24 / 35 | 5188 |
| 6 | 1 | 69.1 | 88.6 | 19 / 35 | 4823 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 89 | 70% |
| cre.Karolos 0.32 | 47 | 85% |
| stelo.AreaTargetingBot 1.1 | 14 | 93% |
| stelo.RamTrackSurfer 1.2 | 8 | 75% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 45 | 58% | 110 |
| cre.Karolos 0.32 | 17 | 22% | 48 |
| stelo.AreaTargetingBot 1.1 | 7 | 9% | 20 |
| stelo.RamTrackSurfer 1.2 | 6 | 8% | 16 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 3% | 6 |
| sample.Walls 1.0 | 0 | 0% | 4 |
| cw.megas.Blade 0.8 | 0 | 0% | 2 |

## Melee bench: F24

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 81.0 | 85 / 210 | 2.71 | 16.0% | 21492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.3 | 16.0% | 85 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.4% | 38 |
| davidalves.Phoenix 0.54 | 3.0 | 13.0% | 34 |
| florent.XSeries.X2 0.12 | 3.3 | 12.7% | 24 |
| pedersen.Ugluk 1.1.1 | 4.7 | 11.7% | 21 |
| oog.melee.Corsair 1.0 | 6.2 | 9.1% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 7 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.4% | 0 |
| as.FrankTheTank 1.3 | 9.3 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 81.0 | 13 / 35 | 3558 |
| 2 | 1 | 65.8 | 84.4 | 16 / 35 | 3628 |
| 3 | 2 | 61.3 | 73.7 | 10 / 35 | 3168 |
| 4 | 1 | 65.9 | 83.2 | 16 / 35 | 4021 |
| 5 | 1 | 65.7 | 86.3 | 17 / 35 | 3579 |
| 6 | 2 | 63.2 | 77.5 | 13 / 35 | 3538 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 31 | 55% |
| florent.XSeries.X2 0.12 | 28 | 68% |
| davidalves.Phoenix 0.54 | 23 | 61% |
| stelo.SoJNanoMelee 1.1 | 20 | 95% |
| pedersen.Ugluk 1.1.1 | 14 | 57% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| evd.X1 0.01 | 2 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 777. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pedersen.Ugluk 1.1.1 | 31 | 25% | 46 |
| rz.GlowBlowMelee 1.4 | 27 | 21% | 46 |
| davidalves.Phoenix 0.54 | 26 | 21% | 44 |
| florent.XSeries.X2 0.12 | 23 | 18% | 40 |
| stelo.SoJNanoMelee 1.1 | 11 | 9% | 13 |
| oog.melee.Corsair 1.0 | 3 | 2% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 7 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
| evd.X1 0.01 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.0 | 139 / 210 | 2.08 | 18.8% | 25503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.8% | 139 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.4% | 11 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.7% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.3% | 17 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 5 |
| ds.Oo 2.2 | 5.7 | 9.2% | 15 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 3 |
| adt.Ar2 1.1 | 8.0 | 6.7% | 1 |
| gjr.Cephalosporin 0.1 | 8.5 | 6.8% | 2 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.9 | 20 / 35 | 4045 |
| 2 | 1 | 67.8 | 86.3 | 20 / 35 | 4255 |
| 3 | 1 | 69.2 | 90.2 | 23 / 35 | 4472 |
| 4 | 1 | 69.1 | 91.1 | 26 / 35 | 4118 |
| 5 | 1 | 69.2 | 90.8 | 26 / 35 | 4364 |
| 6 | 1 | 68.3 | 87.6 | 24 / 35 | 4249 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 51 | 92% |
| voidious.micro.BlitzBat 1.05 | 43 | 98% |
| jdw.Hurricane 1.4 | 28 | 96% |
| ds.Oo 2.2 | 16 | 63% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 4 | 50% |
| adt.Ar2 1.1 | 3 | 100% |
| awesomeness.Elite 1.0 | 2 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 18 | 25% | 54 |
| jdw.Hurricane 1.4 | 13 | 18% | 48 |
| ds.Oo 2.2 | 13 | 18% | 21 |
| voidious.mini.BrokenSword 2.0.3 | 10 | 14% | 47 |
| adt.Ar2 1.1 | 7 | 10% | 12 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 13 |
| awesomeness.Elite 1.0 | 3 | 4% | 8 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 1 |

## Melee bench: F26

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.8 | 116 / 210 | 2.00 | 18.7% | 31269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.7% | 116 |
| ak.Fermat 2.0 | 2.3 | 14.4% | 36 |
| shu.nitro.LENIN .T34 | 3.2 | 13.1% | 30 |
| lrem.Spectre 0.4.4 | 3.7 | 12.2% | 14 |
| js.PinBall 1.6 | 4.8 | 10.9% | 7 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.1% | 2 |
| jaybot.adv.bots.JayBot 2.0 | 6.8 | 8.6% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.9% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.1 | 22 / 35 | 5214 |
| 2 | 1 | 67.4 | 82.9 | 18 / 35 | 4862 |
| 3 | 1 | 68.6 | 87.0 | 21 / 35 | 5177 |
| 4 | 1 | 69.5 | 90.2 | 20 / 35 | 5530 |
| 5 | 1 | 70.6 | 93.3 | 24 / 35 | 5411 |
| 6 | 1 | 68.1 | 88.6 | 11 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 45 | 67% |
| ak.Fermat 2.0 | 42 | 60% |
| lrem.Spectre 0.4.4 | 36 | 86% |
| js.PinBall 1.6 | 15 | 87% |
| gh.mini.GrubbmOne 1.0 | 7 | 86% |
| sample.SpinBot 1.0 | 4 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 978. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 40 | 42% | 61 |
| shu.nitro.LENIN .T34 | 23 | 24% | 59 |
| lrem.Spectre 0.4.4 | 12 | 13% | 41 |
| js.PinBall 1.6 | 9 | 9% | 20 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 10 |
| gh.mini.GrubbmOne 1.0 | 4 | 4% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 88.4 | 121 / 210 | 2.05 | 18.6% | 27323 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.6% | 121 |
| mk.Alpha 0.2.1 | 2.0 | 14.5% | 45 |
| sheldor.melee.nano.TestMelee 0.1 | 3.7 | 11.1% | 12 |
| wee.Gem 1.8.4 | 4.0 | 11.2% | 24 |
| EH.Eagle 1.0.6 | 5.2 | 9.5% | 2 |
| techdude.kombat.FlamingKombat 1.5 | 6.8 | 8.3% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 7.9% | 0 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.5 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 88.6 | 19 / 35 | 3987 |
| 2 | 1 | 69.8 | 86.0 | 18 / 35 | 5922 |
| 3 | 1 | 67.7 | 88.9 | 24 / 35 | 3891 |
| 4 | 1 | 68.5 | 88.3 | 19 / 35 | 4971 |
| 5 | 1 | 67.7 | 88.6 | 21 / 35 | 4197 |
| 6 | 1 | 67.9 | 89.8 | 20 / 35 | 4355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 78 | 76% |
| wee.Gem 1.8.4 | 32 | 53% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 89% |
| EH.Eagle 1.0.6 | 13 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 3 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 2 | 50% |

Hadur died in 89 of 210 rounds, at a mean tick of 960. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 33 | 37% | 95 |
| wee.Gem 1.8.4 | 18 | 20% | 37 |
| sheldor.melee.nano.TestMelee 0.1 | 13 | 15% | 27 |
| joe.ADinosaur 1.0 | 7 | 8% | 8 |
| throxbot.ThroxBot 0.1 | 6 | 7% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 4 | 4% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 4% | 6 |
| EH.Eagle 1.0.6 | 3 | 3% | 17 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F28

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 93.5 | 158 / 210 | 1.58 | 19.7% | 25510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.7% | 158 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 24 |
| uji.Antique 1.0 | 3.2 | 11.5% | 13 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 10.1% | 3 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.3% | 2 |
| ahr.ice.Ice 1.0.2 | 7.3 | 7.3% | 3 |
| stelo.PianistNano 1.2 | 7.8 | 6.4% | 0 |
| matt.advanced.Katana 1.0 | 8.5 | 6.3% | 1 |
| stelo.Lifestealer 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 89.5 | 22 / 35 | 4044 |
| 2 | 1 | 70.2 | 95.2 | 28 / 35 | 4347 |
| 3 | 1 | 69.4 | 92.7 | 28 / 35 | 4217 |
| 4 | 1 | 70.6 | 95.2 | 30 / 35 | 4351 |
| 5 | 1 | 69.7 | 95.2 | 25 / 35 | 4220 |
| 6 | 1 | 69.2 | 93.3 | 25 / 35 | 4331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 88 | 82% |
| uji.Antique 1.0 | 42 | 95% |
| qohnil.blot.BlotBot 3.61 | 23 | 83% |
| amk.ChumbaWumba 0.3 | 11 | 100% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| stelo.PianistNano 1.2 | 4 | 100% |
| ahr.ice.Ice 1.0.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 28 | 53% | 97 |
| uji.Antique 1.0 | 9 | 17% | 40 |
| qohnil.blot.BlotBot 3.61 | 6 | 11% | 26 |
| amk.ChumbaWumba 0.3 | 5 | 9% | 12 |
| pfvicm.Sobieski 7.2.3b | 3 | 6% | 13 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 9 |
| stelo.PianistNano 1.2 | 0 | 0% | 5 |
| matt.advanced.Katana 1.0 | 0 | 0% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.6 | 122 / 210 | 2.30 | 18.4% | 26846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.4% | 122 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.1% | 44 |
| deewiant.Anomaly 0.2 | 2.8 | 14.6% | 30 |
| myl.micro.Troodon 1.10 | 4.0 | 12.6% | 7 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 3 |
| ph.melee.ArcherME 0.3 | 6.3 | 7.7% | 0 |
| DBall.Anarchy 0.1 | 6.8 | 6.9% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.3% | 0 |
| ap.Frederick 1.1 | 8.8 | 4.8% | 1 |
| jangs.ns51 1.0 | 9.7 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.6 | 20 / 35 | 4283 |
| 2 | 1 | 70.3 | 88.9 | 24 / 35 | 4996 |
| 3 | 1 | 68.3 | 82.9 | 23 / 35 | 4477 |
| 4 | 1 | 67.6 | 83.2 | 17 / 35 | 4218 |
| 5 | 1 | 69.6 | 90.5 | 21 / 35 | 4570 |
| 6 | 1 | 66.5 | 80.6 | 17 / 35 | 4302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 58 | 83% |
| zyx.mega.YersiniaPestis 3.1 | 53 | 74% |
| myl.micro.Troodon 1.10 | 20 | 100% |
| jok.PheonixM 0.1.2 | 8 | 88% |
| DBall.Anarchy 0.1 | 6 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 29 | 33% | 69 |
| deewiant.Anomaly 0.2 | 27 | 30% | 77 |
| myl.micro.Troodon 1.10 | 17 | 19% | 32 |
| jok.PheonixM 0.1.2 | 12 | 13% | 20 |
| jangs.ns51 1.0 | 2 | 2% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 74.3 | 60 / 210 | 3.31 | 14.7% | 22001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.7 | 14.7% | 60 |
| darkcanuck.B26354 1.06 | 2.7 | 14.2% | 47 |
| catcat20.Matcha 0.006 | 2.7 | 13.7% | 33 |
| oog.melee.Capulet 1.2 | 4.0 | 13.3% | 31 |
| stelo.PastFuture 2.3.2 | 4.0 | 12.9% | 28 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.1% | 7 |
| ntc.Opposite 1.5 | 7.7 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.8% | 3 |
| tripphippy.Alice 1.1 | 8.2 | 6.7% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 73.3 | 11 / 35 | 3861 |
| 2 | 2 | 61.0 | 73.3 | 6 / 35 | 3481 |
| 3 | 1 | 64.2 | 78.7 | 10 / 35 | 3920 |
| 4 | 2 | 63.3 | 75.6 | 13 / 35 | 3649 |
| 5 | 1 | 63.1 | 74.6 | 10 / 35 | 3824 |
| 6 | 2 | 60.5 | 70.2 | 10 / 35 | 3266 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 31 | 55% |
| oog.melee.Capulet 1.2 | 20 | 80% |
| catcat20.Matcha 0.006 | 19 | 58% |
| stelo.PastFuture 2.3.2 | 14 | 64% |
| intruder.PrairieWolf 2.61 | 5 | 60% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| ntc.Opposite 1.5 | 1 | 100% |
| tripphippy.Alice 1.1 | 1 | 0% |

Hadur died in 150 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.PastFuture 2.3.2 | 37 | 25% | 49 |
| darkcanuck.B26354 1.06 | 35 | 23% | 49 |
| catcat20.Matcha 0.006 | 28 | 19% | 40 |
| oog.melee.Capulet 1.2 | 18 | 12% | 35 |
| intruder.PrairieWolf 2.61 | 10 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 5% | 8 |
| ntc.Opposite 1.5 | 7 | 5% | 7 |
| tripphippy.Alice 1.1 | 6 | 4% | 6 |
| GarmBox.Anger 1.0 | 2 | 1% | 2 |

## Melee bench: F31

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 80.0 | 81 / 210 | 2.80 | 15.8% | 20153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.2% | 72 |
| hadur117.mini.DeiseFAPW 0.3 | 1.8 | 15.8% | 81 |
| gh.mini.Griezel 0.2 | 3.3 | 13.0% | 43 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 12.2% | 9 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.6% | 4 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 2 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.5% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.3% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 84.1 | 16 / 35 | 3359 |
| 2 | 2 | 64.6 | 80.3 | 15 / 35 | 3296 |
| 3 | 2 | 64.1 | 78.1 | 13 / 35 | 3477 |
| 4 | 1 | 64.2 | 80.3 | 13 / 35 | 3360 |
| 5 | 2 | 63.3 | 77.5 | 12 / 35 | 3274 |
| 6 | 2 | 64.4 | 79.7 | 12 / 35 | 3387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 56 | 61% |
| gh.mini.Griezel 0.2 | 30 | 63% |
| spinnercat.micro.Tyger 0.1 | 13 | 92% |
| d414.nano.Quantum 1.0.0 | 11 | 100% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 826. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 51 | 40% | 85 |
| gh.mini.Griezel 0.2 | 26 | 20% | 49 |
| spinnercat.micro.Tyger 0.1 | 23 | 18% | 32 |
| d414.nano.Quantum 1.0.0 | 15 | 12% | 24 |
| gh.nano.Grofvuil 0.2 | 6 | 5% | 9 |
| fm.mammillarias 1.3 | 5 | 4% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 2% | 2 |
| timmit.nano.TimDog 0.33 | 1 | 1% | 3 |

## Melee bench: F32

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 90.1 | 137 / 210 | 1.89 | 18.8% | 27834 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.8% | 137 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.3% | 48 |
| lxx.ConceptA 0.8 | 3.3 | 11.2% | 7 |
| apc.botM 3.0 | 3.7 | 11.5% | 9 |
| vjik.UnViolation 1.1 | 5.0 | 9.3% | 5 |
| bayen.UbaMicro 1.4 | 6.5 | 8.2% | 2 |
| panzer.Panzer 0.2 | 7.0 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.7% | 0 |
| conscience.Electron 1.3g | 8.7 | 5.8% | 1 |
| donjezza.Jezza 1.0 | 9.7 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 94.0 | 25 / 35 | 4790 |
| 2 | 1 | 69.1 | 93.0 | 29 / 35 | 4388 |
| 3 | 1 | 68.4 | 88.6 | 21 / 35 | 4792 |
| 4 | 1 | 69.0 | 92.1 | 22 / 35 | 5026 |
| 5 | 1 | 68.4 | 89.2 | 21 / 35 | 4609 |
| 6 | 1 | 65.8 | 83.8 | 19 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 86 | 65% |
| lxx.ConceptA 0.8 | 25 | 92% |
| vjik.UnViolation 1.1 | 15 | 100% |
| apc.botM 3.0 | 15 | 87% |
| panzer.Panzer 0.2 | 9 | 100% |
| yk.JahMicro 1.0 | 8 | 100% |
| bayen.UbaMicro 1.4 | 8 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 40 | 53% | 98 |
| lxx.ConceptA 0.8 | 15 | 20% | 24 |
| apc.botM 3.0 | 7 | 9% | 29 |
| panzer.Panzer 0.2 | 7 | 9% | 12 |
| vjik.UnViolation 1.1 | 3 | 4% | 28 |
| donjezza.Jezza 1.0 | 2 | 3% | 5 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
| bayen.UbaMicro 1.4 | 0 | 0% | 10 |
| yk.JahMicro 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 89.3 | 133 / 210 | 1.96 | 19.4% | 30148 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.4% | 133 |
| maribo.Quester 0.3 | 2.0 | 15.8% | 38 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.9% | 17 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.2% | 9 |
| labg.Cataclysm 2.05 | 5.0 | 9.9% | 10 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.8% | 3 |
| baal.nano.N 1.42 | 6.7 | 7.7% | 0 |
| sanja.First 0.1 | 8.3 | 5.1% | 0 |
| zyx.micro.Ant 1.1 | 8.7 | 5.3% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.0 | 23 / 35 | 5103 |
| 2 | 1 | 71.0 | 92.7 | 25 / 35 | 5488 |
| 3 | 1 | 69.0 | 88.9 | 22 / 35 | 4788 |
| 4 | 1 | 68.3 | 85.1 | 22 / 35 | 4688 |
| 5 | 1 | 70.1 | 90.2 | 23 / 35 | 5156 |
| 6 | 1 | 68.2 | 86.0 | 18 / 35 | 4925 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 79% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 49 | 86% |
| gre.svman4.Leonidas 1.3.2 | 27 | 89% |
| labg.Cataclysm 2.05 | 11 | 73% |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 90% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 31 | 40% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 13 | 17% | 56 |
| gre.svman4.Leonidas 1.3.2 | 11 | 14% | 30 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 13% | 15 |
| labg.Cataclysm 2.05 | 8 | 10% | 18 |
| baal.nano.N 1.42 | 3 | 4% | 4 |
| sanja.First 0.1 | 1 | 1% | 2 |
| zyx.micro.Ant 1.1 | 0 | 0% | 4 |

## Melee bench: F34

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.0 | 92 / 210 | 2.26 | 17.7% | 28650 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.5 | 17.7% | 92 |
| stelo.Spread 0.9 | 1.8 | 16.8% | 61 |
| kid.Gladiator .7.2 | 2.7 | 16.3% | 43 |
| jcs.Seth 1.8 | 4.2 | 11.1% | 10 |
| tcf.Reach 3 | 5.2 | 10.0% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.7 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.3 | 17 / 35 | 4453 |
| 2 | 1 | 69.6 | 90.2 | 17 / 35 | 5274 |
| 3 | 2 | 67.4 | 85.7 | 10 / 35 | 4804 |
| 4 | 3 | 66.4 | 80.0 | 14 / 35 | 4357 |
| 5 | 1 | 67.7 | 84.1 | 13 / 35 | 4687 |
| 6 | 1 | 69.6 | 88.6 | 21 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 82 | 66% |
| kid.Gladiator .7.2 | 39 | 56% |
| jcs.Seth 1.8 | 11 | 55% |
| tcf.Reach 3 | 7 | 71% |
| cli.Dancer 1.1 | 3 | 100% |
| ratosh.Wesco 1.4 | 2 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 1106. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 46% | 105 |
| kid.Gladiator .7.2 | 46 | 38% | 64 |
| jcs.Seth 1.8 | 9 | 8% | 21 |
| tcf.Reach 3 | 5 | 4% | 11 |
| ratosh.Wesco 1.4 | 2 | 2% | 4 |
| cli.Dancer 1.1 | 1 | 1% | 4 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 82.9 | 38 / 210 | 2.54 | 15.6% | 21316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.2% | 151 |
| hadur117.mini.DeiseFAPW 0.3 | 2.0 | 15.6% | 38 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.9% | 17 |
| rz.HawkOnFire 0.1 | 4.5 | 11.4% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.5 | 10.9% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 7.2% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.8% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.0% | 1 |
| dans.Cinnamon 1.2 | 9.0 | 4.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 84.4 | 5 / 35 | 3684 |
| 2 | 2 | 65.4 | 84.8 | 10 / 35 | 3444 |
| 3 | 2 | 64.1 | 84.1 | 4 / 35 | 3435 |
| 4 | 2 | 63.9 | 80.6 | 9 / 35 | 3394 |
| 5 | 2 | 64.2 | 82.2 | 5 / 35 | 3645 |
| 6 | 2 | 64.4 | 81.0 | 5 / 35 | 3714 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 107 | 16% |
| gh.mini.Gruwel 0.9 | 19 | 58% |
| rz.HawkOnFire 0.1 | 10 | 80% |
| dmh.robocode.robot.BlackDeath 9.2 | 3 | 67% |

Hadur died in 173 of 210 rounds, at a mean tick of 1007. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 61% | 123 |
| gh.mini.Gruwel 0.9 | 27 | 16% | 41 |
| rz.HawkOnFire 0.1 | 20 | 12% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 12 | 7% | 15 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 6 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.9 | 182 / 210 | 1.37 | 21.4% | 31899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 21.4% | 182 |
| bzdp.Pansy 2.1 | 2.7 | 11.9% | 7 |
| alpha.RainingFire 1.0 | 3.0 | 11.6% | 14 |
| mz.Cork 0.1 | 4.5 | 10.5% | 2 |
| bvh.micro.Freya 0.3 | 4.5 | 10.7% | 3 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.3% | 0 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.4% | 2 |
| dl.BetterWalls 1.0 | 8.5 | 5.6% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 97.1 | 31 / 35 | 4893 |
| 2 | 1 | 72.8 | 98.1 | 31 / 35 | 5854 |
| 3 | 1 | 70.9 | 93.7 | 28 / 35 | 5385 |
| 4 | 1 | 71.6 | 94.6 | 30 / 35 | 5397 |
| 5 | 1 | 70.7 | 94.0 | 30 / 35 | 4872 |
| 6 | 1 | 72.3 | 97.8 | 32 / 35 | 5498 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 52 | 94% |
| mz.Cork 0.1 | 31 | 97% |
| alpha.RainingFire 1.0 | 29 | 86% |
| bvh.micro.Freya 0.3 | 26 | 100% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| m3thos.Eva02 0.7.1 | 19 | 100% |
| dl.BetterWalls 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 28 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.micro.Freya 0.3 | 8 | 29% | 32 |
| alpha.RainingFire 1.0 | 8 | 29% | 31 |
| bzdp.Pansy 2.1 | 6 | 21% | 52 |
| bvh.mini.Fenrir 0.39 | 3 | 11% | 16 |
| mz.Cork 0.1 | 1 | 4% | 36 |
| dl.BetterWalls 1.0 | 1 | 4% | 15 |
| squidM.TentalceMeleeNano 1.1 | 1 | 4% | 5 |
| m3thos.Eva02 0.7.1 | 0 | 0% | 13 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 7 |

## Melee bench: F37

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 93.0 | 180 / 210 | 1.63 | 20.1% | 32872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 20.1% | 180 |
| germ.TheMind .2 | 2.5 | 10.8% | 3 |
| EBBU.Sim2 1.02 | 3.8 | 10.2% | 2 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.8% | 3 |
| agrach.Dalek 1.0 | 5.8 | 9.0% | 6 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.7% | 6 |
| lmk.ACPFinal 0.1 | 6.7 | 8.3% | 1 |
| mb.Beast 0.1 | 7.2 | 8.3% | 6 |
| skm.Ryubot 1.0 | 8.7 | 7.4% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 7.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 97.8 | 34 / 35 | 5745 |
| 2 | 1 | 70.6 | 97.5 | 34 / 35 | 5584 |
| 3 | 1 | 68.7 | 91.1 | 28 / 35 | 5254 |
| 4 | 1 | 67.8 | 86.3 | 25 / 35 | 5451 |
| 5 | 1 | 69.3 | 90.5 | 28 / 35 | 5892 |
| 6 | 1 | 69.4 | 94.9 | 31 / 35 | 4946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 100% |
| EBBU.Sim2 1.02 | 32 | 97% |
| mb.Beast 0.1 | 21 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 100% |
| skm.Ryubot 1.0 | 19 | 100% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| agrach.Dalek 1.0 | 17 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 13 | 100% |

Hadur died in 30 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| agrach.Dalek 1.0 | 7 | 23% | 29 |
| EBBU.Sim2 1.02 | 6 | 20% | 25 |
| stelo.UntouchableNano 1.3 | 5 | 17% | 23 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4 | 13% | 30 |
| germ.TheMind .2 | 3 | 10% | 38 |
| lmk.ACPFinal 0.1 | 2 | 7% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 7% | 8 |
| mb.Beast 0.1 | 1 | 3% | 23 |
| skm.Ryubot 1.0 | 0 | 0% | 10 |

## Melee bench: F38

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 84.0 | 105 / 210 | 2.44 | 17.1% | 24159 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.2 | 17.1% | 105 |
| justin.Mallais 14.0 | 1.8 | 15.8% | 67 |
| bvh.mini.Freya 0.55 | 3.0 | 12.3% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.9% | 7 |
| cs.Wren 1.0 | 5.0 | 10.5% | 6 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.9% | 11 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.0% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.1% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 90.5 | 22 / 35 | 4276 |
| 2 | 1 | 66.4 | 86.3 | 15 / 35 | 4041 |
| 3 | 1 | 65.2 | 80.0 | 17 / 35 | 3824 |
| 4 | 1 | 64.9 | 78.4 | 17 / 35 | 3820 |
| 5 | 2 | 65.6 | 81.3 | 16 / 35 | 4053 |
| 6 | 1 | 67.4 | 87.6 | 18 / 35 | 4145 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 57 | 65% |
| bvh.mini.Freya 0.55 | 18 | 89% |
| bts.mega.Gnarly 1.4 | 18 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 93% |
| cs.Wren 1.0 | 12 | 92% |
| kdf.KoulDestroyer 1.0 | 10 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 105 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 50 | 48% | 89 |
| bts.mega.Gnarly 1.4 | 14 | 13% | 33 |
| bvh.mini.Freya 0.55 | 13 | 12% | 23 |
| cs.Wren 1.0 | 12 | 11% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 9% | 30 |
| kdf.KoulDestroyer 1.0 | 5 | 5% | 10 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 84.9 | 101 / 210 | 2.36 | 17.7% | 28387 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 17.7% | 101 |
| bvh.fry.Freya 0.82 | 2.0 | 14.7% | 23 |
| az.Ololobot 0.2.4 | 3.2 | 13.2% | 57 |
| catcat20.Lambda 0.024 | 4.2 | 11.0% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.8% | 9 |
| winamp32.micro.MicroMacro 1.0 | 6.0 | 8.3% | 2 |
| gimp.GimpBot 0.1 | 7.0 | 7.9% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.8 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.6 | 18 / 35 | 4916 |
| 2 | 1 | 67.0 | 85.1 | 18 / 35 | 4850 |
| 3 | 1 | 67.5 | 87.0 | 17 / 35 | 4839 |
| 4 | 1 | 65.4 | 80.0 | 16 / 35 | 4579 |
| 5 | 1 | 66.3 | 84.1 | 16 / 35 | 4422 |
| 6 | 1 | 67.1 | 85.4 | 16 / 35 | 4781 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 46 | 52% |
| bvh.fry.Freya 0.82 | 36 | 81% |
| catcat20.Lambda 0.024 | 32 | 72% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1061. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 46 | 42% | 70 |
| az.Ololobot 0.2.4 | 28 | 26% | 60 |
| catcat20.Lambda 0.024 | 19 | 17% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 11 | 10% | 18 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 3 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 10 |
| gimp.GimpBot 0.1 | 1 | 1% | 7 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.9 | 124 / 210 | 2.36 | 18.1% | 26538 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.2 | 18.1% | 124 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 14.8% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.1% | 20 |
| mz.AntiGrav 1.0 | 4.2 | 11.2% | 7 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.4% | 4 |
| stelo.Randomness 1.0 | 6.3 | 8.9% | 12 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 4 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 5.7% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.2% | 2 |
| sample.Corners 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.3 | 24 / 35 | 4344 |
| 2 | 1 | 68.5 | 87.3 | 20 / 35 | 4850 |
| 3 | 1 | 69.6 | 90.8 | 26 / 35 | 4557 |
| 4 | 1 | 66.9 | 81.9 | 21 / 35 | 4408 |
| 5 | 1 | 69.4 | 89.8 | 23 / 35 | 4720 |
| 6 | 2 | 62.6 | 73.0 | 10 / 35 | 3659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 80% |
| kano.gamma.KanoGamma 1.8 | 33 | 85% |
| Polkwane.SmashMelee 1.0 | 21 | 90% |
| mz.AntiGrav 1.0 | 20 | 100% |
| stelo.Randomness 1.0 | 10 | 90% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| alpha.BlackIce 1.0 | 1 | 0% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 29 | 34% | 58 |
| kano.gamma.KanoGamma 1.8 | 20 | 23% | 55 |
| mz.AntiGrav 1.0 | 8 | 9% | 32 |
| stelo.Randomness 1.0 | 8 | 9% | 22 |
| Polkwane.SmashMelee 1.0 | 8 | 9% | 20 |
| alpha.BlackIce 1.0 | 7 | 8% | 11 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 6 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 4 |
| sample.Corners 1.0 | 0 | 0% | 2 |

## Melee bench: F41

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 86.1 | 101 / 210 | 2.25 | 17.2% | 22648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.3 | 17.2% | 101 |
| eem.EvBotNG v12.8 | 1.7 | 16.1% | 71 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.7% | 16 |
| ary.Swarm 1.1 | 3.5 | 12.7% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 11.2% | 8 |
| shrub.Silver v048 | 6.0 | 8.5% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 1 |
| stelo.Mirror 1.1 | 8.3 | 5.8% | 3 |
| jsal.Jsalbot 1.0 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 87.0 | 17 / 35 | 3707 |
| 2 | 2 | 67.2 | 86.3 | 17 / 35 | 3874 |
| 3 | 1 | 66.3 | 85.4 | 18 / 35 | 3617 |
| 4 | 1 | 67.2 | 88.3 | 16 / 35 | 3690 |
| 5 | 2 | 65.4 | 80.6 | 14 / 35 | 3966 |
| 6 | 1 | 67.7 | 89.2 | 19 / 35 | 3794 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 70 | 53% |
| lessonz.robocode.Oz 0.5.0 | 25 | 80% |
| ary.Swarm 1.1 | 22 | 91% |
| simonton.nano.MeleeSeed 1.8 | 20 | 85% |
| stelo.Mirror 1.1 | 4 | 75% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 50 | 46% | 86 |
| ary.Swarm 1.1 | 18 | 17% | 48 |
| lessonz.robocode.Oz 0.5.0 | 18 | 17% | 30 |
| simonton.nano.MeleeSeed 1.8 | 15 | 14% | 29 |
| stelo.Mirror 1.1 | 3 | 3% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| shrub.Silver v048 | 1 | 1% | 2 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |

## Melee bench: F42

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.8 | 107 / 210 | 2.00 | 18.3% | 28902 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.3% | 107 |
| wompi.Wallaby 5.1 | 2.3 | 15.6% | 47 |
| maribo.mini.MiniQuester 0.1 | 3.2 | 14.1% | 27 |
| ara.Shera 0.88 | 3.5 | 13.4% | 27 |
| amz.NanoClone 1.41 | 5.0 | 8.9% | 1 |
| maribo.IotaCT 1.1 | 6.5 | 7.2% | 0 |
| dsw.StaticD 1.0 | 6.8 | 6.8% | 1 |
| stelo.MirrorMicro 1.0 | 8.5 | 5.4% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 94.0 | 21 / 35 | 4795 |
| 2 | 1 | 68.2 | 88.3 | 16 / 35 | 4782 |
| 3 | 1 | 67.6 | 86.3 | 16 / 35 | 4834 |
| 4 | 1 | 67.2 | 87.3 | 14 / 35 | 4470 |
| 5 | 1 | 68.4 | 89.2 | 19 / 35 | 4971 |
| 6 | 1 | 68.8 | 87.9 | 21 / 35 | 5050 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 51 | 75% |
| wompi.Wallaby 5.1 | 45 | 69% |
| maribo.mini.MiniQuester 0.1 | 38 | 82% |
| dsw.StaticD 1.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1009. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 41 | 39% | 84 |
| ara.Shera 0.88 | 32 | 30% | 64 |
| maribo.mini.MiniQuester 0.1 | 24 | 23% | 44 |
| amz.NanoClone 1.41 | 3 | 3% | 6 |
| maribo.IotaCT 1.1 | 2 | 2% | 5 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 78.9 | 40 / 210 | 2.90 | 15.2% | 22011 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.2% | 135 |
| hadur117.mini.DeiseFAPW 0.3 | 2.0 | 15.2% | 40 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.9% | 21 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.9% | 10 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.9% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.5% | 2 |
| mz.NanoGod 2.02 | 7.2 | 7.5% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.1% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 78.7 | 7 / 35 | 3470 |
| 2 | 2 | 64.6 | 79.4 | 5 / 35 | 3761 |
| 3 | 2 | 65.0 | 79.7 | 12 / 35 | 3392 |
| 4 | 2 | 65.2 | 80.6 | 7 / 35 | 3816 |
| 5 | 2 | 66.7 | 84.4 | 6 / 35 | 4202 |
| 6 | 2 | 61.7 | 70.5 | 3 / 35 | 3370 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 80 | 19% |
| brainfade.melee.Dusk 0.44 | 20 | 70% |
| dummy.micro.Sparrow 2.5 | 9 | 67% |
| wcsv.melee.EngineerMelee 0.1 | 6 | 83% |
| Krabb.akim2.Akim2 1.1b | 1 | 0% |

Hadur died in 170 of 210 rounds, at a mean tick of 1025. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 91 | 54% | 106 |
| dummy.micro.Sparrow 2.5 | 22 | 13% | 27 |
| brainfade.melee.Dusk 0.44 | 20 | 12% | 34 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 20 |
| Krabb.akim2.Akim2 1.1b | 8 | 5% | 8 |
| mz.NanoGod 2.02 | 7 | 4% | 9 |
| jab.DiamondStealer 5 | 6 | 4% | 6 |

## Melee bench: F44

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.4 | 120 / 210 | 2.14 | 18.6% | 29129 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 18.6% | 120 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 53 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 25 |
| wompi.Quokka 1.6 | 4.5 | 10.4% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.2% | 3 |
| jwirde.Gort 2.0 | 6.0 | 8.6% | 4 |
| disan.Chair 2.2.0 | 6.7 | 8.0% | 0 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.5% | 0 |
| sample.Crazy 1.0 | 9.2 | 4.7% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.3 | 19 / 35 | 4718 |
| 2 | 1 | 69.2 | 89.2 | 21 / 35 | 4908 |
| 3 | 1 | 69.6 | 90.2 | 21 / 35 | 5285 |
| 4 | 1 | 68.2 | 88.6 | 18 / 35 | 4880 |
| 5 | 1 | 69.0 | 88.3 | 23 / 35 | 4973 |
| 6 | 1 | 66.1 | 80.6 | 18 / 35 | 4365 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 74 | 76% |
| tzu.TheArtOfWar 1.2 | 48 | 75% |
| wompi.Quokka 1.6 | 11 | 82% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| jwirde.Gort 2.0 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 863. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 41% | 100 |
| tzu.TheArtOfWar 1.2 | 24 | 27% | 56 |
| wompi.Quokka 1.6 | 10 | 11% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 8% | 9 |
| jwirde.Gort 2.0 | 4 | 4% | 8 |
| disan.Chair 2.2.0 | 4 | 4% | 5 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| sample.Crazy 1.0 | 1 | 1% | 3 |

## Melee bench: F45

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.2 | 88 / 210 | 1.97 | 19.7% | 34560 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.0 | 19.7% | 88 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.4% | 105 |
| jje.BagPuss 1.2 | 2.5 | 12.1% | 9 |
| sul.Lunar 1.1 | 4.5 | 9.9% | 3 |
| myl.nano.Graviton 1.10 | 5.5 | 9.6% | 3 |
| fm.claire 1.7 | 6.0 | 8.8% | 0 |
| hvilela.HVilela 0.9 | 6.5 | 8.4% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.6% | 0 |
| wit.Deep7 2.0 | 8.8 | 6.7% | 2 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.9 | 13 / 35 | 5679 |
| 2 | 1 | 69.7 | 89.5 | 17 / 35 | 5731 |
| 3 | 1 | 70.0 | 90.2 | 16 / 35 | 5967 |
| 4 | 1 | 69.7 | 92.1 | 14 / 35 | 5568 |
| 5 | 1 | 68.5 | 85.1 | 13 / 35 | 5775 |
| 6 | 1 | 69.5 | 90.5 | 15 / 35 | 5840 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 113 | 24% |
| jje.BagPuss 1.2 | 16 | 88% |
| sul.Lunar 1.1 | 16 | 94% |
| myl.nano.Graviton 1.10 | 12 | 92% |
| wit.Deep7 2.0 | 8 | 100% |
| fm.claire 1.7 | 6 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 2433. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 89 | 73% | 0 |
| jje.BagPuss 1.2 | 13 | 11% | 65 |
| myl.nano.Graviton 1.10 | 7 | 6% | 34 |
| fm.claire 1.7 | 5 | 4% | 16 |
| sul.Lunar 1.1 | 4 | 3% | 50 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 17 |
| wit.Deep7 2.0 | 1 | 1% | 17 |
| hvilela.HVilela 0.9 | 0 | 0% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseFAPW 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 86.2 | 73 / 210 | 2.24 | 17.0% | 25223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFAPW 0.3 | 1.7 | 17.0% | 73 |
| kc.mini.Mirage 0.2 | 2.0 | 16.8% | 57 |
| rsalesc.melee.Medina 0.4.5 | 2.3 | 16.5% | 73 |
| mz.MicroSheep 1.0 | 4.5 | 10.0% | 1 |
| cx.Princess 1.0 | 5.2 | 9.5% | 7 |
| sadoner.killer 0.2 | 5.3 | 9.3% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.7% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.2% | 0 |
| kurios.DOSexe .9a | 8.7 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 87.6 | 11 / 35 | 4096 |
| 2 | 3 | 66.1 | 84.8 | 11 / 35 | 3864 |
| 3 | 1 | 67.3 | 88.6 | 12 / 35 | 4258 |
| 4 | 3 | 65.6 | 83.5 | 11 / 35 | 3987 |
| 5 | 1 | 67.3 | 87.0 | 15 / 35 | 4515 |
| 6 | 1 | 66.8 | 85.7 | 13 / 35 | 4503 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 55% |
| rsalesc.melee.Medina 0.4.5 | 49 | 27% |
| cx.Princess 1.0 | 10 | 90% |
| mz.MicroSheep 1.0 | 9 | 89% |
| sadoner.killer 0.2 | 3 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 46% | 105 |
| rsalesc.melee.Medina 0.4.5 | 55 | 40% | 68 |
| mz.MicroSheep 1.0 | 8 | 6% | 12 |
| cx.Princess 1.0 | 6 | 4% | 15 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 4 |
| sadoner.killer 0.2 | 2 | 1% | 6 |

