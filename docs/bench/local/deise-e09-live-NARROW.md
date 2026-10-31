# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 87.2 | 59 / 210 | 2.15 | 17.1% | 28369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.4% | 144 |
| hadur117.mini.DeiseNARROW 0.4 | 2.0 | 17.1% | 59 |
| sgp.JollyNinja 3.53 | 3.8 | 10.9% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.8% | 0 |
| mz.MicroGodMelee 1 | 4.3 | 10.6% | 1 |
| lorneswork.Predator 1.0 | 5.8 | 9.1% | 1 |
| adt.Ar2 1.0 | 7.2 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 7.8 | 6.2% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.5% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 86.0 | 8 / 35 | 4586 |
| 2 | 2 | 66.8 | 86.7 | 8 / 35 | 4824 |
| 3 | 2 | 66.9 | 86.3 | 9 / 35 | 4758 |
| 4 | 2 | 66.9 | 88.6 | 11 / 35 | 4674 |
| 5 | 2 | 67.6 | 88.3 | 13 / 35 | 4836 |
| 6 | 2 | 67.0 | 87.6 | 10 / 35 | 4691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 12% |
| mz.MicroGodMelee 1 | 16 | 100% |
| sgp.JollyNinja 3.53 | 12 | 92% |
| lorneswork.Predator 1.0 | 7 | 86% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| adt.Ar2 1.0 | 3 | 100% |
| skm.butterfly 1.0 | 3 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1273. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 126 | 83% | 145 |
| sgp.JollyNinja 3.53 | 8 | 5% | 16 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 11 |
| mz.MicroGodMelee 1 | 5 | 3% | 20 |
| lorneswork.Predator 1.0 | 4 | 3% | 11 |
| adt.Ar2 1.0 | 2 | 1% | 5 |
| skm.butterfly 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.0 | 112 / 210 | 2.26 | 18.3% | 28450 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.3% | 112 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.2% | 45 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 14.1% | 27 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.8 | 9.6% | 8 |
| sch.Simone 0.3d | 7.0 | 7.7% | 7 |
| fnc.bandit.Bandit 5.2.0 | 7.0 | 7.7% | 0 |
| Noran.BitchingElk 0.054 | 7.8 | 6.8% | 7 |
| stelo.PatternRobot 1.0 | 8.2 | 6.7% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.5 | 19 / 35 | 4809 |
| 2 | 1 | 67.9 | 87.3 | 17 / 35 | 4789 |
| 3 | 1 | 68.6 | 89.2 | 20 / 35 | 4817 |
| 4 | 1 | 67.6 | 85.1 | 19 / 35 | 4656 |
| 5 | 1 | 70.1 | 92.4 | 25 / 35 | 5092 |
| 6 | 1 | 65.2 | 79.7 | 12 / 35 | 4287 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 53 | 57% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 52 | 81% |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 87% |
| lrem.micro.SpikeSoldier 0.4 | 11 | 100% |
| Noran.BitchingElk 0.054 | 7 | 100% |
| stelo.PatternRobot 1.0 | 5 | 80% |
| sch.Simone 0.3d | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 924. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 42% | 68 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 24% | 68 |
| stelo.PatternRobot 1.0 | 9 | 9% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 8 | 8% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 7% | 19 |
| sch.Simone 0.3d | 3 | 3% | 8 |
| fnc.bandit.Bandit 5.2.0 | 3 | 3% | 7 |
| Noran.BitchingElk 0.054 | 2 | 2% | 9 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |

## Melee bench: F03

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 94.2 | 157 / 210 | 1.52 | 20.5% | 36322 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 20.5% | 157 |
| kawigi.nano.Lib 1.0 | 2.2 | 13.9% | 11 |
| radnor.DoctorBob 1.42 | 3.0 | 13.4% | 10 |
| vuen.Cake 2.51 | 3.8 | 12.4% | 30 |
| urdos.URDOS 1.3 | 5.0 | 8.6% | 0 |
| oa.weak.FlyMk1 0.1 | 6.8 | 7.1% | 0 |
| adt.Ar1 2.1 | 7.0 | 7.1% | 1 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.9% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 91.4 | 22 / 35 | 5693 |
| 2 | 1 | 70.6 | 94.0 | 25 / 35 | 6249 |
| 3 | 1 | 71.7 | 95.9 | 32 / 35 | 6143 |
| 4 | 1 | 70.0 | 92.1 | 23 / 35 | 5927 |
| 5 | 1 | 72.0 | 97.8 | 30 / 35 | 6402 |
| 6 | 1 | 70.5 | 94.0 | 25 / 35 | 5908 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 73 | 95% |
| vuen.Cake 2.51 | 63 | 65% |
| radnor.DoctorBob 1.42 | 40 | 100% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| adt.Ar1 2.1 | 2 | 50% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 29 | 54% | 78 |
| kawigi.nano.Lib 1.0 | 10 | 19% | 74 |
| radnor.DoctorBob 1.42 | 7 | 13% | 37 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 6% | 4 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 6% | 3 |
| urdos.URDOS 1.3 | 2 | 4% | 3 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 5 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.8 | 44 / 210 | 2.19 | 17.7% | 33815 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.8% | 159 |
| hadur117.mini.DeiseNARROW 0.4 | 2.0 | 17.7% | 44 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 5 |
| TNT.TNT 0.99.1 | 4.2 | 10.5% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.6% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 6.7% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 1 |
| rampancy.Durandal 2.1d | 8.0 | 5.0% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.9 | 90.5 | 11 / 35 | 5977 |
| 2 | 2 | 68.5 | 86.0 | 8 / 35 | 5598 |
| 3 | 2 | 68.6 | 87.6 | 9 / 35 | 5797 |
| 4 | 2 | 67.7 | 85.4 | 5 / 35 | 5326 |
| 5 | 2 | 67.4 | 85.4 | 6 / 35 | 5372 |
| 6 | 2 | 67.9 | 85.7 | 5 / 35 | 5745 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 160 | 21% |
| apc.LeeroyJenkins2 1.0 | 8 | 75% |
| TNT.TNT 0.99.1 | 4 | 75% |
| css.Delitioner 0.11 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 1532. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 86% | 178 |
| apc.LeeroyJenkins2 1.0 | 9 | 5% | 16 |
| josago.Jorgito 0.16 | 4 | 2% | 6 |
| css.Delitioner 0.11 | 4 | 2% | 4 |
| TNT.TNT 0.99.1 | 1 | 1% | 4 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.6 | 74.4 | 25 / 210 | 3.30 | 13.7% | 19736 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 110 |
| justin.DemonicRage 3.4 | 2.0 | 17.4% | 61 |
| hadur117.mini.DeiseNARROW 0.4 | 3.2 | 13.7% | 25 |
| wompi.Numbat 2.1 | 3.8 | 12.5% | 15 |
| ms.Ares 0.19 | 5.3 | 9.1% | 1 |
| axeBots.HataMoto 3.09 | 5.7 | 8.6% | 0 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.4% | 0 |
| GarmBox.Oranges 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.2 | 76.8 | 7 / 35 | 3589 |
| 2 | 3 | 62.1 | 75.2 | 5 / 35 | 3476 |
| 3 | 3 | 63.3 | 79.0 | 6 / 35 | 3576 |
| 4 | 4 | 59.5 | 69.8 | 2 / 35 | 2892 |
| 5 | 3 | 61.4 | 74.9 | 3 / 35 | 3120 |
| 6 | 3 | 60.2 | 70.5 | 2 / 35 | 3083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 41 | 24% |
| justin.DemonicRage 3.4 | 32 | 31% |
| wompi.Numbat 2.1 | 6 | 33% |
| axeBots.HataMoto 3.09 | 3 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 72 | 39% | 82 |
| justin.DemonicRage 3.4 | 66 | 35% | 78 |
| wompi.Numbat 2.1 | 20 | 11% | 22 |
| ms.Ares 0.19 | 12 | 6% | 12 |
| axeBots.HataMoto 3.09 | 8 | 4% | 9 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F06

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.7 | 112 / 210 | 2.38 | 17.9% | 27787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 17.9% | 112 |
| jekl.StoneGhost 0.7 | 2.3 | 14.5% | 27 |
| origin.SleepSiphon 1.7b | 3.0 | 14.1% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.7 | 12.3% | 16 |
| mld.Wisdom 1.0 | 5.0 | 10.2% | 2 |
| gg.Wolverine 2.0 | 6.3 | 8.5% | 5 |
| DBall.NUKE 0.1 | 7.2 | 7.2% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.3% | 0 |
| spinnercat.Omen 1.0 | 8.3 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.9 | 19 / 35 | 4432 |
| 2 | 1 | 66.3 | 81.9 | 13 / 35 | 4429 |
| 3 | 1 | 67.1 | 81.9 | 17 / 35 | 4876 |
| 4 | 1 | 70.3 | 90.8 | 24 / 35 | 5309 |
| 5 | 1 | 66.5 | 84.1 | 18 / 35 | 4037 |
| 6 | 1 | 68.6 | 87.6 | 21 / 35 | 4704 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 46 | 67% |
| jekl.StoneGhost 0.7 | 44 | 89% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 75% |
| gg.Wolverine 2.0 | 11 | 82% |
| mld.Wisdom 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 4 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 39 | 39% | 87 |
| jekl.StoneGhost 0.7 | 24 | 24% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 21% | 39 |
| mld.Wisdom 1.0 | 7 | 7% | 14 |
| gg.Wolverine 2.0 | 6 | 6% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 6 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 3 |

## Melee bench: F07

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 93.8 | 141 / 210 | 1.56 | 20.2% | 34155 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 20.2% | 141 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 16.8% | 34 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 10.9% | 9 |
| franzor.Lizt 1.3.1 | 4.7 | 10.7% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.3 | 2.4% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.2 | 25 / 35 | 5830 |
| 2 | 1 | 71.9 | 94.9 | 26 / 35 | 5907 |
| 3 | 1 | 70.2 | 88.6 | 16 / 35 | 5644 |
| 4 | 1 | 72.0 | 93.7 | 24 / 35 | 6078 |
| 5 | 1 | 71.8 | 95.6 | 27 / 35 | 5428 |
| 6 | 1 | 71.1 | 93.7 | 23 / 35 | 5268 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 88 | 92% |
| rsalesc.melee.Monk 0.3.6c | 48 | 44% |
| oog.melee.CapuletDroid 1.1 | 36 | 86% |
| franzor.Lizt 1.3.1 | 12 | 50% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |
| drd.Dreadknoght 0.9 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1500. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 35 | 50% | 67 |
| rtk.Tachikoma 1.0 | 17 | 24% | 99 |
| franzor.Lizt 1.3.1 | 9 | 13% | 0 |
| oog.melee.CapuletDroid 1.1 | 8 | 11% | 38 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.1 | 129 / 210 | 1.89 | 19.1% | 29435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.1% | 129 |
| tm.Yuugao 1.0 | 2.3 | 13.0% | 27 |
| shrub.Vapour v159 | 2.8 | 12.5% | 33 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.1% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.3% | 6 |
| m3thos.Eva00 1.1 | 6.5 | 8.0% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.7 | 7.9% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.7 | 6.6% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.1% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.2 | 6.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 87.3 | 20 / 35 | 4773 |
| 2 | 1 | 69.3 | 89.8 | 22 / 35 | 5331 |
| 3 | 1 | 68.8 | 93.0 | 22 / 35 | 4733 |
| 4 | 1 | 67.9 | 88.6 | 19 / 35 | 4804 |
| 5 | 1 | 70.1 | 94.6 | 26 / 35 | 5059 |
| 6 | 1 | 67.6 | 87.3 | 20 / 35 | 4735 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 76% |
| shrub.Vapour v159 | 44 | 66% |
| Krabb.sliNk.Garm 0.9u | 27 | 81% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 95% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 92% |
| qualidafial.MajorDick 1.0.1 | 5 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 31 | 38% | 55 |
| tm.Yuugao 1.0 | 24 | 30% | 70 |
| Krabb.sliNk.Garm 0.9u | 13 | 16% | 30 |
| com.spp.robocode.MostlyHarmless 010 | 6 | 7% | 22 |
| m3thos.Eva00 1.1 | 4 | 5% | 9 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 1 | 1% | 9 |
| SHAM.WOW 1.4 | 0 | 0% | 4 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.9 | 64 / 210 | 2.99 | 15.8% | 23841 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.1% | 91 |
| hadur117.mini.DeiseNARROW 0.4 | 2.0 | 15.8% | 64 |
| kc.micro.Figment 1.0 | 2.7 | 14.3% | 27 |
| yagami.Tidus 0.11 | 4.2 | 11.1% | 5 |
| pedersen.Grishnakh 1.0 | 5.2 | 9.8% | 12 |
| mc2.enemy.Original 0.9 | 5.7 | 9.3% | 9 |
| dft.Calliope 5.6 | 7.2 | 7.3% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.7% | 0 |
| rdm.Dueler 0.4x | 9.0 | 5.0% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.8 | 77.1 | 13 / 35 | 4085 |
| 2 | 1 | 66.1 | 84.1 | 13 / 35 | 4055 |
| 3 | 2 | 64.2 | 77.8 | 9 / 35 | 3988 |
| 4 | 3 | 63.4 | 75.6 | 8 / 35 | 3785 |
| 5 | 1 | 66.5 | 83.5 | 15 / 35 | 4141 |
| 6 | 3 | 61.3 | 69.2 | 6 / 35 | 3787 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 74 | 34% |
| kc.micro.Figment 1.0 | 25 | 64% |
| mc2.enemy.Original 0.9 | 12 | 83% |
| yagami.Tidus 0.11 | 10 | 90% |
| pedersen.Grishnakh 1.0 | 4 | 75% |
| dft.Calliope 5.6 | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 69 | 47% | 95 |
| kc.micro.Figment 1.0 | 33 | 23% | 49 |
| yagami.Tidus 0.11 | 15 | 10% | 24 |
| mc2.enemy.Original 0.9 | 13 | 9% | 24 |
| pedersen.Grishnakh 1.0 | 10 | 7% | 11 |
| rdm.Dueler 0.4x | 2 | 1% | 2 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
| dft.Calliope 5.6 | 1 | 1% | 2 |
| step.nanoPri 1.0 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 94.9 | 157 / 210 | 1.46 | 20.2% | 33149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 20.2% | 157 |
| DTF.Kludgy 1.2b | 2.2 | 14.4% | 28 |
| ejb.Polaris 1.0.1 | 3.3 | 12.7% | 14 |
| ne.Chimera 1.2 | 3.5 | 12.5% | 9 |
| vStar.RAFzilla 2.15 | 5.3 | 9.9% | 1 |
| tvv.micro.Antares 1.1.1 | 5.7 | 9.6% | 1 |
| kurios.DOSexe .9b | 7.3 | 6.2% | 0 |
| sam.Samspin 1.0 | 8.0 | 5.4% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 4.8% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 94.6 | 26 / 35 | 5650 |
| 2 | 1 | 70.4 | 94.6 | 24 / 35 | 5407 |
| 3 | 1 | 70.9 | 95.9 | 27 / 35 | 5466 |
| 4 | 1 | 69.9 | 93.0 | 22 / 35 | 5621 |
| 5 | 1 | 69.6 | 92.4 | 26 / 35 | 5192 |
| 6 | 1 | 71.9 | 99.0 | 32 / 35 | 5813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 64% |
| ejb.Polaris 1.0.1 | 50 | 90% |
| ne.Chimera 1.2 | 32 | 88% |
| vStar.RAFzilla 2.15 | 19 | 95% |
| tvv.micro.Antares 1.1.1 | 11 | 91% |
| kurios.DOSexe .9b | 10 | 100% |
| donjezza.Muncho 1.0 | 5 | 100% |

Hadur died in 53 of 210 rounds, at a mean tick of 999. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 30 | 57% | 64 |
| ne.Chimera 1.2 | 10 | 19% | 42 |
| ejb.Polaris 1.0.1 | 8 | 15% | 55 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 10 |
| sam.Samspin 1.0 | 2 | 4% | 2 |
| vStar.RAFzilla 2.15 | 1 | 2% | 15 |
| kurios.DOSexe .9b | 0 | 0% | 14 |
| donjezza.Muncho 1.0 | 0 | 0% | 3 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 2 |

## Melee bench: F11

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.8 | 97 / 210 | 2.46 | 17.2% | 25153 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.3 | 17.2% | 97 |
| rz.Aleph 0.34 | 1.7 | 16.1% | 58 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.3% | 18 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 10 |
| rdt199.Warlord 0.73 | 5.2 | 9.6% | 13 |
| br2.MobyDickBot 1.6 | 5.8 | 8.7% | 8 |
| uji.YellohFellah 1.0 | 7.2 | 7.3% | 6 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.4% | 1 |
| stelo.MirrorNano 1.3 | 9.3 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 88.3 | 16 / 35 | 4281 |
| 2 | 2 | 63.5 | 75.9 | 11 / 35 | 3838 |
| 3 | 1 | 67.1 | 86.0 | 19 / 35 | 4372 |
| 4 | 2 | 64.8 | 78.7 | 14 / 35 | 4251 |
| 5 | 1 | 67.4 | 87.6 | 20 / 35 | 4105 |
| 6 | 1 | 66.9 | 86.3 | 17 / 35 | 4306 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 66 | 62% |
| djc.DynaBot 0.1.1 | 22 | 86% |
| cx.mini.Nimrod 0.55 | 18 | 72% |
| uji.YellohFellah 1.0 | 12 | 83% |
| rdt199.Warlord 0.73 | 11 | 82% |
| br2.MobyDickBot 1.6 | 7 | 43% |
| KiraNL.Chupacabra 0.4 | 2 | 50% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 52 | 46% | 96 |
| cx.mini.Nimrod 0.55 | 17 | 15% | 29 |
| djc.DynaBot 0.1.1 | 12 | 11% | 28 |
| rdt199.Warlord 0.73 | 12 | 11% | 21 |
| br2.MobyDickBot 1.6 | 7 | 6% | 13 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 6 |
| stelo.MirrorNano 1.3 | 5 | 4% | 5 |
| uji.YellohFellah 1.0 | 3 | 3% | 12 |

## Melee bench: F12

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 85.6 | 134 / 210 | 2.30 | 18.1% | 24036 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.1% | 134 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.4% | 22 |
| nat.PallasHawk 1.0 | 2.8 | 13.2% | 23 |
| darkcanuck.Leon 1.01 | 3.5 | 12.7% | 21 |
| brainfade.melee.Genghis 0.36 | 5.2 | 9.5% | 5 |
| jrm.Test0 1.0 | 6.2 | 8.1% | 0 |
| cs.sheldor.Talon 1.1 | 7.0 | 7.1% | 1 |
| jp.Perpy 16.0 | 8.0 | 6.6% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.5% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.8% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 85.7 | 21 / 35 | 3989 |
| 2 | 1 | 68.3 | 88.3 | 24 / 35 | 4216 |
| 3 | 1 | 68.4 | 88.9 | 24 / 35 | 4023 |
| 4 | 1 | 65.5 | 78.4 | 18 / 35 | 3971 |
| 5 | 1 | 68.1 | 88.9 | 24 / 35 | 3920 |
| 6 | 1 | 66.9 | 83.5 | 23 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 47 | 85% |
| bts.wiki.RipCurl 0.9b | 42 | 83% |
| darkcanuck.Leon 1.01 | 41 | 90% |
| brainfade.melee.Genghis 0.36 | 15 | 87% |
| jaybot.bots.Oddball 4.0 | 7 | 71% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |
| jp.Perpy 16.0 | 1 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 687. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 19 | 25% | 40 |
| nat.PallasHawk 1.0 | 18 | 24% | 51 |
| darkcanuck.Leon 1.01 | 12 | 16% | 58 |
| brainfade.melee.Genghis 0.36 | 9 | 12% | 21 |
| jaybot.bots.Oddball 4.0 | 6 | 8% | 12 |
| jrm.Test0 1.0 | 5 | 7% | 10 |
| stuff.Vlad 0.1 | 3 | 4% | 5 |
| jp.Perpy 16.0 | 3 | 4% | 4 |
| cs.sheldor.Talon 1.1 | 1 | 1% | 7 |

## Melee bench: F13

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.8 | 84 / 210 | 2.28 | 16.8% | 25096 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.7 | 16.8% | 84 |
| mn.Combat 3.25.0 | 1.8 | 16.7% | 73 |
| ags.Glacier 0.2.11 | 2.5 | 16.1% | 32 |
| shinh.Entangled 0.3 | 4.0 | 12.3% | 13 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.4% | 8 |
| apc.Colossus2 0.17 | 6.2 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.3 | 4.7% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.3% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.3 | 15 / 35 | 4736 |
| 2 | 2 | 66.7 | 86.7 | 14 / 35 | 4164 |
| 3 | 1 | 66.8 | 86.3 | 15 / 35 | 4233 |
| 4 | 2 | 66.0 | 85.1 | 11 / 35 | 4083 |
| 5 | 2 | 65.8 | 82.5 | 15 / 35 | 3864 |
| 6 | 2 | 67.0 | 87.6 | 14 / 35 | 4016 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 65 | 43% |
| ags.Glacier 0.2.11 | 48 | 81% |
| shinh.Entangled 0.3 | 16 | 69% |
| stelo.Wang 1.0 | 3 | 100% |
| gh.micro.Gruweltje 0.7 | 3 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 949. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 55 | 44% | 86 |
| ags.Glacier 0.2.11 | 33 | 26% | 67 |
| shinh.Entangled 0.3 | 17 | 13% | 30 |
| gh.micro.Gruweltje 0.7 | 14 | 11% | 19 |
| stelo.Wang 1.0 | 3 | 2% | 4 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.7 | 164 / 210 | 1.48 | 20.6% | 33535 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 20.6% | 164 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.8% | 21 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 14 |
| co.edu.usb.rc.LidisTron 1.0 | 4.7 | 9.9% | 3 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 8.9% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 8.9% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.8 | 8.1% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.7% | 5 |
| pa.Improved 1.0 | 9.0 | 5.7% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 96.8 | 29 / 35 | 5665 |
| 2 | 1 | 70.7 | 94.9 | 26 / 35 | 5177 |
| 3 | 1 | 72.3 | 97.1 | 30 / 35 | 5859 |
| 4 | 1 | 70.6 | 94.3 | 27 / 35 | 5359 |
| 5 | 1 | 71.9 | 95.2 | 29 / 35 | 6020 |
| 6 | 1 | 69.4 | 89.5 | 23 / 35 | 5455 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 95 | 93% |
| catcat20.shape.Theta 0.018 | 55 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 75% |
| sanyi.mikrobi.Roberto 1.0 | 9 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 19 | 41% | 101 |
| catcat20.shape.Theta 0.018 | 14 | 30% | 51 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 9% | 19 |
| co.edu.usb.rc.LidisTron 1.0 | 4 | 9% | 7 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 7% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 4% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 3 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 84.2 | 102 / 210 | 2.42 | 18.0% | 30026 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.0% | 102 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.0% | 20 |
| emp.Yngwie 1.11 | 3.3 | 12.7% | 48 |
| mld.DustBunny 3.8 | 3.8 | 12.2% | 9 |
| cb.nano.Insomnia 1.0 | 4.7 | 11.7% | 16 |
| kawigi.robot.Girl 1.2 | 6.2 | 9.6% | 14 |
| lambdaxy.TBot 0.1 | 7.2 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 5.9% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 80.3 | 18 / 35 | 4874 |
| 2 | 1 | 68.3 | 85.7 | 17 / 35 | 5345 |
| 3 | 1 | 67.1 | 83.5 | 15 / 35 | 4901 |
| 4 | 1 | 68.2 | 86.3 | 20 / 35 | 4923 |
| 5 | 1 | 69.4 | 88.9 | 21 / 35 | 5292 |
| 6 | 1 | 65.8 | 80.6 | 11 / 35 | 4691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 42 | 57% |
| kawigi.micro.Shiz 1.1 | 26 | 96% |
| kawigi.robot.Girl 1.2 | 23 | 74% |
| mld.DustBunny 3.8 | 21 | 90% |
| cb.nano.Insomnia 1.0 | 18 | 72% |
| divineomega.TrialBot 0.003 | 4 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 1044. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 36% | 72 |
| cb.nano.Insomnia 1.0 | 21 | 19% | 18 |
| mld.DustBunny 3.8 | 18 | 17% | 47 |
| kawigi.robot.Girl 1.2 | 13 | 12% | 19 |
| kawigi.micro.Shiz 1.1 | 12 | 11% | 38 |
| divineomega.TrialBot 0.003 | 2 | 2% | 9 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.1 | 99 / 210 | 2.34 | 18.5% | 32422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.2 | 18.5% | 99 |
| gh.Griezel 0.5.2 | 1.8 | 16.8% | 70 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.7% | 27 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 9.0% | 1 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.7% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.7% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.5 | 5.2% | 3 |
| asd.Cthulhu 1.3 | 9.0 | 4.9% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 83.8 | 16 / 35 | 5473 |
| 2 | 2 | 66.0 | 79.4 | 11 / 35 | 5038 |
| 3 | 1 | 68.8 | 85.7 | 19 / 35 | 5329 |
| 4 | 1 | 70.2 | 88.3 | 21 / 35 | 5800 |
| 5 | 1 | 68.7 | 87.6 | 15 / 35 | 5559 |
| 6 | 1 | 68.3 | 86.0 | 17 / 35 | 5223 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 84 | 56% |
| techdude.forest.FlamingForest 1.1 | 30 | 53% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 95% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| bvh.fnr.Fenrir 0.36l | 6 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 80% |
| stelo.IntrinsicVolatility 1.4 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1308. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 62 | 55% | 114 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 16% | 38 |
| techdude.forest.FlamingForest 1.1 | 18 | 16% | 32 |
| bvh.fnr.Fenrir 0.36l | 4 | 4% | 5 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 5 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 9 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 5 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 83.6 | 99 / 210 | 2.48 | 17.8% | 29458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 17.8% | 99 |
| et.Predator 1.8 | 2.5 | 13.3% | 22 |
| oog.melee.Mercutio 1.0 | 2.8 | 12.7% | 30 |
| cx.BlestPain 1.41 | 4.2 | 12.1% | 42 |
| nic.Nicator 2.4 | 4.7 | 11.2% | 10 |
| ahf.NanoAndrew .4 | 5.8 | 10.3% | 6 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.8% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.6% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.6 | 11 / 35 | 4789 |
| 2 | 1 | 65.6 | 81.6 | 12 / 35 | 4467 |
| 3 | 1 | 68.5 | 86.7 | 21 / 35 | 5032 |
| 4 | 1 | 65.9 | 77.1 | 16 / 35 | 4999 |
| 5 | 1 | 68.4 | 86.3 | 20 / 35 | 5015 |
| 6 | 1 | 69.1 | 88.3 | 19 / 35 | 5156 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 83% |
| oog.melee.Mercutio 1.0 | 32 | 78% |
| cx.BlestPain 1.41 | 32 | 25% |
| nic.Nicator 2.4 | 21 | 86% |
| ahf.NanoAndrew .4 | 6 | 100% |
| maribo.melee.BMV 0.1 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1122. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 39 | 35% | 51 |
| et.Predator 1.8 | 24 | 21% | 57 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 44 |
| nic.Nicator 2.4 | 14 | 13% | 31 |
| ahf.NanoAndrew .4 | 9 | 8% | 18 |
| maribo.melee.BMV 0.1 | 4 | 4% | 6 |
| tex.Longbot 0.4 | 1 | 1% | 1 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 87.1 | 127 / 210 | 2.16 | 18.3% | 26103 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.3% | 127 |
| morbid.MorbidPriest 1.0 | 2.3 | 13.3% | 26 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.3% | 24 |
| uji.DBH 1.1 | 4.2 | 11.1% | 14 |
| ratosh.Nobo 0.21 | 5.0 | 9.6% | 2 |
| spinnercat.Robovirus 2.718 | 6.3 | 9.0% | 4 |
| sigterm.Sigterm 1.0 | 6.5 | 8.2% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 6.7% | 2 |
| stelo.WangRobot 1.0 | 8.8 | 6.2% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 88.9 | 21 / 35 | 4186 |
| 2 | 1 | 67.8 | 87.3 | 21 / 35 | 4387 |
| 3 | 1 | 68.4 | 89.2 | 23 / 35 | 4575 |
| 4 | 1 | 67.1 | 85.7 | 19 / 35 | 4498 |
| 5 | 1 | 67.8 | 88.3 | 21 / 35 | 4370 |
| 6 | 1 | 66.1 | 83.2 | 22 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 48 | 81% |
| agd.Mooserwirt2 2.7 | 36 | 64% |
| sigterm.Sigterm 1.0 | 17 | 88% |
| uji.DBH 1.1 | 17 | 76% |
| spinnercat.Robovirus 2.718 | 16 | 100% |
| stelo.WangRobot 1.0 | 9 | 100% |
| ratosh.Nobo 0.21 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 4 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 31 | 37% | 69 |
| agd.Mooserwirt2 2.7 | 24 | 29% | 52 |
| uji.DBH 1.1 | 11 | 13% | 22 |
| ratosh.Nobo 0.21 | 6 | 7% | 16 |
| sigterm.Sigterm 1.0 | 4 | 5% | 16 |
| spinnercat.Robovirus 2.718 | 3 | 4% | 18 |
| stelo.WangRobot 1.0 | 3 | 4% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 1 |

## Melee bench: F19

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 96.0 | 172 / 210 | 1.36 | 21.2% | 34408 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 21.2% | 172 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.1% | 13 |
| mld.Infinity 2.2 | 3.0 | 13.5% | 22 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 10.7% | 2 |
| erdnis.Rover 0.3 | 4.8 | 10.0% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 9.1% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 6.8% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 0.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.9 | 30 / 35 | 5454 |
| 2 | 1 | 71.9 | 94.6 | 29 / 35 | 5913 |
| 3 | 1 | 72.8 | 97.8 | 29 / 35 | 6194 |
| 4 | 1 | 72.6 | 96.5 | 29 / 35 | 5931 |
| 5 | 1 | 72.5 | 97.8 | 31 / 35 | 5316 |
| 6 | 1 | 71.4 | 93.7 | 24 / 35 | 5600 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 95 | 93% |
| mld.Infinity 2.2 | 66 | 80% |
| krillr.mini.JointStrike 2.0.0 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 8 | 100% |
| pac.ABC 2.1 | 7 | 100% |
| erdnis.Rover 0.3 | 6 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1538. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 45% | 22 |
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 39% | 118 |
| krillr.mini.JointStrike 2.0.0 | 3 | 8% | 17 |
| erdnis.Rover 0.3 | 2 | 5% | 14 |
| mbh.Mbh 0.1 | 1 | 3% | 6 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 16 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |

## Melee bench: F20

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 88.3 | 120 / 210 | 2.06 | 19.4% | 33237 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.4% | 120 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.5% | 38 |
| catcat20.Rabbit 0.001 | 4.0 | 11.1% | 20 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 11.4% | 9 |
| fwb.Nine 1.0.1 | 4.0 | 11.2% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 7.8% | 0 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.5% | 1 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.3 | 19 / 35 | 5693 |
| 2 | 1 | 67.8 | 85.1 | 16 / 35 | 5149 |
| 3 | 1 | 70.2 | 90.5 | 22 / 35 | 5439 |
| 4 | 1 | 68.7 | 84.4 | 20 / 35 | 5741 |
| 5 | 1 | 69.6 | 89.8 | 20 / 35 | 5567 |
| 6 | 1 | 70.5 | 91.4 | 23 / 35 | 5648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 74% |
| fwb.Nine 1.0.1 | 36 | 67% |
| catcat20.Rabbit 0.001 | 27 | 70% |
| nz.jdc.nano.GridFu 1.0 | 17 | 71% |
| bayen.nut.Squirrel 1.615 | 6 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 1187. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 40% | 70 |
| fwb.Nine 1.0.1 | 25 | 28% | 43 |
| catcat20.Rabbit 0.001 | 14 | 16% | 37 |
| nz.jdc.nano.GridFu 1.0 | 8 | 9% | 28 |
| bayen.nut.Squirrel 1.615 | 5 | 6% | 12 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 9 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.9 | 95.1 | 148 / 210 | 1.44 | 21.1% | 34949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 21.1% | 148 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 49 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.3% | 7 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.6% | 3 |
| eld.Hmm 1.0 | 5.5 | 8.0% | 4 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.9% | 0 |
| fire219.CatBot 1.0 | 7.2 | 6.4% | 0 |
| el.JumpShoot 0.2 | 7.7 | 6.4% | 0 |
| PSW.Relentless 0.1 | 9.2 | 4.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.3 | 96.2 | 24 / 35 | 6049 |
| 2 | 1 | 71.8 | 95.2 | 23 / 35 | 5856 |
| 3 | 1 | 71.3 | 94.3 | 27 / 35 | 5454 |
| 4 | 1 | 72.5 | 96.8 | 27 / 35 | 5766 |
| 5 | 1 | 71.5 | 94.9 | 22 / 35 | 5975 |
| 6 | 1 | 71.8 | 93.3 | 25 / 35 | 5849 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 122 | 68% |
| dummy.mini.Scimitar 1.01 | 40 | 93% |
| eld.Hmm 1.0 | 17 | 82% |
| cf.RiO.RiOx 4.2.1 | 13 | 85% |
| el.JumpShoot 0.2 | 3 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1591. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 74% | 107 |
| dummy.mini.Scimitar 1.01 | 10 | 16% | 62 |
| cf.RiO.RiOx 4.2.1 | 3 | 5% | 19 |
| eld.Hmm 1.0 | 3 | 5% | 15 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 5 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |

## Melee bench: F22

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.2 | 112 / 210 | 1.89 | 18.9% | 30651 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.9% | 112 |
| pe.SandboxDT 2.71m | 2.3 | 15.7% | 56 |
| kvk.HebusLeTroll 0.35 | 3.2 | 14.5% | 26 |
| jlm.javaDisturbance 0.59 | 3.5 | 13.2% | 12 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 4 |
| tad.Dalek98 0.98 | 6.7 | 6.9% | 0 |
| yk.JahRoslav 1.1 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.5 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 4.8% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.5 | 21 / 35 | 5303 |
| 2 | 1 | 68.5 | 90.2 | 15 / 35 | 4819 |
| 3 | 1 | 69.2 | 90.5 | 17 / 35 | 4803 |
| 4 | 1 | 69.8 | 91.4 | 20 / 35 | 5352 |
| 5 | 1 | 69.5 | 89.2 | 21 / 35 | 5193 |
| 6 | 1 | 69.1 | 89.2 | 18 / 35 | 5181 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 56 | 41% |
| kvk.HebusLeTroll 0.35 | 50 | 74% |
| jlm.javaDisturbance 0.59 | 45 | 89% |
| bigpete.Stewie 1.0 | 12 | 92% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1125. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 42 | 42% | 73 |
| kvk.HebusLeTroll 0.35 | 32 | 32% | 70 |
| jlm.javaDisturbance 0.59 | 20 | 20% | 52 |
| bigpete.Stewie 1.0 | 3 | 3% | 9 |
| tad.Dalek98 0.98 | 1 | 1% | 3 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 92.2 | 143 / 210 | 1.70 | 19.9% | 30873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.9% | 143 |
| pe.SandboxLump 1.52 | 2.0 | 17.2% | 47 |
| cre.Karolos 0.32 | 3.0 | 14.1% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.2% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.8 | 8.7% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 8.6% | 1 |
| sample.Walls 1.0 | 7.0 | 7.9% | 1 |
| cw.megas.Blade 0.8 | 7.3 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 93.0 | 25 / 35 | 5610 |
| 2 | 1 | 69.6 | 89.8 | 17 / 35 | 4696 |
| 3 | 1 | 71.4 | 92.7 | 26 / 35 | 5103 |
| 4 | 1 | 70.5 | 92.4 | 24 / 35 | 4963 |
| 5 | 1 | 70.5 | 91.7 | 24 / 35 | 4960 |
| 6 | 1 | 71.7 | 93.7 | 27 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 94 | 77% |
| cre.Karolos 0.32 | 39 | 95% |
| stelo.AreaTargetingBot 1.1 | 16 | 100% |
| stelo.RamTrackSurfer 1.2 | 10 | 90% |
| sample.Walls 1.0 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 0% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 36 | 54% | 107 |
| cre.Karolos 0.32 | 14 | 21% | 49 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 20 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 6% | 5 |
| stelo.RamTrackSurfer 1.2 | 3 | 4% | 22 |
| cw.megas.Blade 0.8 | 1 | 1% | 3 |
| sample.Walls 1.0 | 0 | 0% | 2 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 79.9 | 80 / 210 | 2.81 | 16.0% | 22793 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.2 | 16.0% | 80 |
| rz.GlowBlowMelee 1.4 | 2.2 | 14.0% | 43 |
| davidalves.Phoenix 0.54 | 3.7 | 12.7% | 36 |
| florent.XSeries.X2 0.12 | 3.8 | 12.3% | 27 |
| pedersen.Ugluk 1.1.1 | 4.2 | 12.2% | 21 |
| oog.melee.Corsair 1.0 | 6.2 | 9.2% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.1% | 4 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.5% | 0 |
| as.FrankTheTank 1.3 | 8.8 | 5.3% | 0 |
| evd.X1 0.01 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.4 | 81.3 | 16 / 35 | 3991 |
| 2 | 1 | 63.3 | 77.5 | 13 / 35 | 3507 |
| 3 | 2 | 62.9 | 76.2 | 8 / 35 | 3820 |
| 4 | 1 | 63.9 | 80.6 | 11 / 35 | 3627 |
| 5 | 1 | 67.3 | 86.7 | 22 / 35 | 3949 |
| 6 | 1 | 63.1 | 77.1 | 10 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 68% |
| florent.XSeries.X2 0.12 | 24 | 67% |
| davidalves.Phoenix 0.54 | 23 | 43% |
| pedersen.Ugluk 1.1.1 | 20 | 90% |
| stelo.SoJNanoMelee 1.1 | 14 | 93% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 133 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 36 | 27% | 46 |
| rz.GlowBlowMelee 1.4 | 28 | 21% | 51 |
| florent.XSeries.X2 0.12 | 27 | 20% | 40 |
| pedersen.Ugluk 1.1.1 | 24 | 18% | 36 |
| oog.melee.Corsair 1.0 | 5 | 4% | 18 |
| stelo.SoJNanoMelee 1.1 | 5 | 4% | 12 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 5 |
| evd.X1 0.01 | 1 | 1% | 1 |
| as.FrankTheTank 1.3 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.3 | 148 / 210 | 1.88 | 19.4% | 26536 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.4% | 148 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.7% | 13 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.2% | 18 |
| jdw.Hurricane 1.4 | 3.8 | 11.2% | 17 |
| ds.Oo 2.2 | 5.2 | 9.0% | 9 |
| gre.svman4.Morfeas 1.4.1 | 6.0 | 8.3% | 1 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.5% | 3 |
| awesomeness.Elite 1.0 | 7.8 | 7.0% | 0 |
| adt.Ar2 1.1 | 8.8 | 6.3% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 91.1 | 27 / 35 | 4406 |
| 2 | 1 | 69.6 | 92.1 | 23 / 35 | 4611 |
| 3 | 1 | 70.1 | 93.3 | 27 / 35 | 4288 |
| 4 | 1 | 67.0 | 82.2 | 20 / 35 | 4295 |
| 5 | 1 | 69.2 | 90.5 | 24 / 35 | 4411 |
| 6 | 1 | 69.8 | 92.4 | 27 / 35 | 4525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 61 | 93% |
| voidious.micro.BlitzBat 1.05 | 53 | 87% |
| jdw.Hurricane 1.4 | 23 | 83% |
| gjr.Cephalosporin 0.1 | 7 | 100% |
| awesomeness.Elite 1.0 | 7 | 100% |
| ds.Oo 2.2 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 5 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 39% | 65 |
| jdw.Hurricane 1.4 | 15 | 24% | 30 |
| voidious.mini.BrokenSword 2.0.3 | 12 | 19% | 64 |
| ds.Oo 2.2 | 3 | 5% | 14 |
| awesomeness.Elite 1.0 | 3 | 5% | 9 |
| gre.svman4.Morfeas 1.4.1 | 2 | 3% | 12 |
| amk.ChumbaMini 0.2 | 2 | 3% | 3 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 9 |
| adt.Ar2 1.1 | 0 | 0% | 3 |

## Melee bench: F26

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.0 | 137 / 210 | 1.90 | 19.2% | 32043 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.2% | 137 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 33 |
| lrem.Spectre 0.4.4 | 3.3 | 12.3% | 11 |
| shu.nitro.LENIN .T34 | 3.7 | 12.1% | 22 |
| js.PinBall 1.6 | 5.0 | 10.6% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.3% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.9% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.2% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.7 | 26 / 35 | 5514 |
| 2 | 1 | 68.8 | 88.3 | 20 / 35 | 5001 |
| 3 | 1 | 70.6 | 92.4 | 24 / 35 | 5556 |
| 4 | 1 | 70.3 | 93.3 | 25 / 35 | 5379 |
| 5 | 1 | 67.1 | 83.8 | 17 / 35 | 4962 |
| 6 | 1 | 70.5 | 90.5 | 25 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 51 | 94% |
| ak.Fermat 2.0 | 50 | 82% |
| shu.nitro.LENIN .T34 | 41 | 73% |
| js.PinBall 1.6 | 13 | 77% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 25 | 34% | 69 |
| shu.nitro.LENIN .T34 | 22 | 30% | 58 |
| lrem.Spectre 0.4.4 | 14 | 19% | 49 |
| js.PinBall 1.6 | 6 | 8% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 7% | 12 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F27

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 85.9 | 134 / 210 | 2.27 | 18.8% | 29366 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.8% | 134 |
| mk.Alpha 0.2.1 | 2.0 | 14.1% | 35 |
| wee.Gem 1.8.4 | 3.5 | 11.1% | 29 |
| EH.Eagle 1.0.6 | 4.3 | 10.9% | 4 |
| sheldor.melee.nano.TestMelee 0.1 | 5.0 | 10.1% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.9% | 2 |
| throxbot.ThroxBot 0.1 | 6.8 | 8.4% | 1 |
| joe.ADinosaur 1.0 | 7.5 | 7.7% | 0 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.6% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 87.9 | 21 / 35 | 4260 |
| 2 | 1 | 69.3 | 90.5 | 27 / 35 | 4717 |
| 3 | 1 | 69.9 | 92.1 | 27 / 35 | 4969 |
| 4 | 1 | 68.1 | 79.4 | 18 / 35 | 5355 |
| 5 | 1 | 67.8 | 78.4 | 18 / 35 | 5537 |
| 6 | 1 | 67.9 | 87.0 | 23 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 67 | 88% |
| wee.Gem 1.8.4 | 31 | 74% |
| EH.Eagle 1.0.6 | 21 | 90% |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 802. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 23 | 30% | 76 |
| wee.Gem 1.8.4 | 15 | 20% | 39 |
| EH.Eagle 1.0.6 | 9 | 12% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 11% | 20 |
| throxbot.ThroxBot 0.1 | 8 | 11% | 15 |
| joe.ADinosaur 1.0 | 5 | 7% | 10 |
| cs.Grudge 1.0 | 5 | 7% | 5 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 14 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 2 |

## Melee bench: F28

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.6 | 141 / 210 | 1.84 | 19.2% | 26917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.2% | 141 |
| kid.test.NightFox .2 | 2.0 | 15.6% | 44 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.6% | 9 |
| uji.Antique 1.0 | 3.7 | 11.6% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.6% | 5 |
| amk.ChumbaWumba 0.3 | 6.3 | 7.8% | 0 |
| ahr.ice.Ice 1.0.2 | 7.0 | 7.4% | 0 |
| stelo.PianistNano 1.2 | 8.3 | 6.1% | 0 |
| matt.advanced.Katana 1.0 | 8.5 | 6.2% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 86.0 | 21 / 35 | 4291 |
| 2 | 1 | 68.8 | 90.8 | 21 / 35 | 4278 |
| 3 | 1 | 69.1 | 91.7 | 26 / 35 | 4260 |
| 4 | 1 | 68.9 | 89.2 | 25 / 35 | 4413 |
| 5 | 1 | 70.0 | 94.9 | 25 / 35 | 4729 |
| 6 | 1 | 69.8 | 91.1 | 23 / 35 | 4946 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 99 | 73% |
| uji.Antique 1.0 | 41 | 95% |
| qohnil.blot.BlotBot 3.61 | 17 | 82% |
| amk.ChumbaWumba 0.3 | 10 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 33% |
| ahr.ice.Ice 1.0.2 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 37 | 53% | 102 |
| uji.Antique 1.0 | 10 | 14% | 42 |
| pfvicm.Sobieski 7.2.3b | 9 | 13% | 13 |
| amk.ChumbaWumba 0.3 | 5 | 7% | 12 |
| qohnil.blot.BlotBot 3.61 | 4 | 6% | 23 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 7 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| matt.advanced.Katana 1.0 | 0 | 0% | 3 |
| stelo.Lifestealer 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F29

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 84.4 | 113 / 210 | 2.40 | 18.2% | 27510 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.2% | 113 |
| deewiant.Anomaly 0.2 | 2.3 | 15.1% | 43 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.8% | 38 |
| myl.micro.Troodon 1.10 | 4.0 | 12.0% | 8 |
| jok.PheonixM 0.1.2 | 5.0 | 10.2% | 5 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.8% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 6.6% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.0% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.5% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.5 | 21 / 35 | 4396 |
| 2 | 1 | 69.1 | 87.0 | 20 / 35 | 4780 |
| 3 | 1 | 69.2 | 88.9 | 20 / 35 | 4726 |
| 4 | 1 | 65.4 | 75.9 | 16 / 35 | 4218 |
| 5 | 1 | 68.2 | 83.8 | 20 / 35 | 4740 |
| 6 | 1 | 67.3 | 81.3 | 16 / 35 | 4650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 59 | 73% |
| zyx.mega.YersiniaPestis 3.1 | 50 | 68% |
| myl.micro.Troodon 1.10 | 22 | 91% |
| jok.PheonixM 0.1.2 | 8 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 915. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 41 | 42% | 88 |
| zyx.mega.YersiniaPestis 3.1 | 29 | 30% | 58 |
| myl.micro.Troodon 1.10 | 14 | 14% | 37 |
| jok.PheonixM 0.1.2 | 9 | 9% | 14 |
| jangs.ns51 1.0 | 2 | 2% | 4 |
| ph.melee.ArcherME 0.3 | 1 | 1% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

## Melee bench: F30

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 76.0 | 62 / 210 | 3.16 | 15.0% | 21849 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.5 | 15.0% | 62 |
| catcat20.Matcha 0.006 | 3.2 | 13.5% | 43 |
| darkcanuck.B26354 1.06 | 3.3 | 13.2% | 38 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.3% | 21 |
| oog.melee.Capulet 1.2 | 3.7 | 13.0% | 36 |
| ntc.Opposite 1.5 | 7.2 | 7.4% | 0 |
| intruder.PrairieWolf 2.61 | 7.2 | 7.8% | 5 |
| tripphippy.Alice 1.1 | 7.8 | 7.0% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 5 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.3 | 74.3 | 9 / 35 | 3671 |
| 2 | 4 | 61.3 | 71.1 | 6 / 35 | 3446 |
| 3 | 1 | 63.8 | 78.4 | 13 / 35 | 3457 |
| 4 | 1 | 63.4 | 77.8 | 10 / 35 | 3720 |
| 5 | 1 | 62.0 | 74.0 | 9 / 35 | 3711 |
| 6 | 1 | 64.5 | 80.3 | 15 / 35 | 3844 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.B26354 1.06 | 27 | 52% |
| catcat20.Matcha 0.006 | 22 | 55% |
| oog.melee.Capulet 1.2 | 21 | 67% |
| stelo.PastFuture 2.3.2 | 18 | 72% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| tripphippy.Alice 1.1 | 3 | 100% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 39 | 26% | 53 |
| stelo.PastFuture 2.3.2 | 34 | 23% | 49 |
| oog.melee.Capulet 1.2 | 32 | 22% | 46 |
| catcat20.Matcha 0.006 | 22 | 15% | 33 |
| tripphippy.Alice 1.1 | 6 | 4% | 6 |
| ntc.Opposite 1.5 | 5 | 3% | 9 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 6 |
| GarmBox.Anger 1.0 | 1 | 1% | 1 |

## Melee bench: F31

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 75.3 | 64 / 210 | 3.22 | 14.9% | 20673 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 16.5% | 74 |
| hadur117.mini.DeiseNARROW 0.4 | 2.0 | 14.9% | 64 |
| gh.mini.Griezel 0.2 | 3.0 | 14.0% | 51 |
| spinnercat.micro.Tyger 0.1 | 4.3 | 11.4% | 10 |
| d414.nano.Quantum 1.0.0 | 4.5 | 11.7% | 11 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.1% | 2 |
| timmit.nano.TimDog 0.33 | 7.3 | 6.6% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.4% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.9% | 0 |
| tlp.ThreeLeggedPig 1 | 9.7 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 80.0 | 12 / 35 | 3274 |
| 2 | 1 | 63.7 | 77.1 | 14 / 35 | 3682 |
| 3 | 2 | 64.2 | 77.1 | 13 / 35 | 3628 |
| 4 | 2 | 61.4 | 72.4 | 8 / 35 | 3307 |
| 5 | 2 | 63.2 | 76.2 | 12 / 35 | 3607 |
| 6 | 3 | 59.9 | 68.9 | 5 / 35 | 3175 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 61% |
| gh.mini.Griezel 0.2 | 29 | 55% |
| spinnercat.micro.Tyger 0.1 | 15 | 87% |
| d414.nano.Quantum 1.0.0 | 3 | 67% |
| tlp.ThreeLeggedPig 1 | 1 | 0% |
| fm.mammillarias 1.3 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 46 | 31% | 75 |
| gh.mini.Griezel 0.2 | 42 | 28% | 62 |
| spinnercat.micro.Tyger 0.1 | 20 | 13% | 31 |
| d414.nano.Quantum 1.0.0 | 13 | 9% | 15 |
| gh.nano.Grofvuil 0.2 | 12 | 8% | 13 |
| Gecko.ultimateGeckoBot 1.0 | 5 | 3% | 5 |
| fm.mammillarias 1.3 | 4 | 3% | 5 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 0 |
3 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.1 | 133 / 210 | 1.80 | 19.1% | 28934 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.1% | 133 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 45 |
| apc.botM 3.0 | 3.3 | 12.1% | 20 |
| lxx.ConceptA 0.8 | 4.0 | 11.1% | 5 |
| vjik.UnViolation 1.1 | 5.3 | 9.3% | 2 |
| bayen.UbaMicro 1.4 | 5.8 | 8.8% | 4 |
| panzer.Panzer 0.2 | 6.7 | 7.4% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.4% | 0 |
| conscience.Electron 1.3g | 9.0 | 5.9% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.7 | 23 / 35 | 5059 |
| 2 | 1 | 68.2 | 90.5 | 22 / 35 | 4659 |
| 3 | 1 | 70.4 | 97.1 | 28 / 35 | 4708 |
| 4 | 1 | 68.7 | 87.0 | 21 / 35 | 5191 |
| 5 | 1 | 67.9 | 89.2 | 20 / 35 | 4677 |
| 6 | 1 | 68.0 | 89.8 | 19 / 35 | 4640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 79 | 62% |
| apc.botM 3.0 | 40 | 78% |
| lxx.ConceptA 0.8 | 28 | 86% |
| bayen.UbaMicro 1.4 | 13 | 77% |
| vjik.UnViolation 1.1 | 8 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 4 | 100% |
| panzer.Panzer 0.2 | 2 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 37 | 47% | 95 |
| apc.botM 3.0 | 16 | 21% | 46 |
| lxx.ConceptA 0.8 | 14 | 18% | 27 |
| bayen.UbaMicro 1.4 | 5 | 6% | 11 |
| panzer.Panzer 0.2 | 3 | 4% | 5 |
| vjik.UnViolation 1.1 | 2 | 3% | 16 |
| conscience.Electron 1.3g | 1 | 1% | 2 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |
| yk.JahMicro 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 89.8 | 140 / 210 | 1.92 | 19.7% | 30287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.7% | 140 |
| maribo.Quester 0.3 | 2.0 | 15.3% | 23 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.9% | 22 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 10.6% | 8 |
| labg.Cataclysm 2.05 | 4.7 | 10.2% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.2 | 8.7% | 4 |
| baal.nano.N 1.42 | 6.7 | 8.5% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 5.6% | 0 |
| sanja.First 0.1 | 8.8 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 87.9 | 21 / 35 | 4915 |
| 2 | 1 | 70.7 | 92.4 | 24 / 35 | 5029 |
| 3 | 1 | 68.9 | 85.7 | 20 / 35 | 5043 |
| 4 | 1 | 69.7 | 91.1 | 23 / 35 | 4906 |
| 5 | 1 | 71.9 | 96.8 | 28 / 35 | 5327 |
| 6 | 1 | 69.1 | 84.8 | 24 / 35 | 5067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 61 | 87% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 44 | 82% |
| gre.svman4.Leonidas 1.3.2 | 26 | 96% |
| labg.Cataclysm 2.05 | 16 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 15 | 80% |
| baal.nano.N 1.42 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| sheldor.melee.nano.NaturalScience 1.2.1 | 23 | 33% | 61 |
| maribo.Quester 0.3 | 21 | 30% | 78 |
| gre.svman4.Leonidas 1.3.2 | 9 | 13% | 26 |
| labg.Cataclysm 2.05 | 5 | 7% | 16 |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 7% | 10 |
| zyx.micro.Ant 1.1 | 4 | 6% | 5 |
| baal.nano.N 1.42 | 2 | 3% | 9 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 2 |
| sanja.First 0.1 | 0 | 0% | 2 |

## Melee bench: F34

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 86.2 | 96 / 210 | 2.24 | 17.9% | 29214 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 17.9% | 96 |
| stelo.Spread 0.9 | 2.2 | 16.8% | 65 |
| kid.Gladiator .7.2 | 2.8 | 16.0% | 38 |
| jcs.Seth 1.8 | 4.3 | 11.1% | 7 |
| tcf.Reach 3 | 5.0 | 10.3% | 5 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 6.8% | 1 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.0 | 16 / 35 | 4982 |
| 2 | 1 | 68.3 | 84.8 | 15 / 35 | 4800 |
| 3 | 1 | 68.4 | 86.7 | 16 / 35 | 4846 |
| 4 | 1 | 68.5 | 86.3 | 18 / 35 | 4774 |
| 5 | 1 | 68.0 | 86.0 | 14 / 35 | 4793 |
| 6 | 1 | 68.1 | 86.3 | 17 / 35 | 5019 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 83 | 64% |
| kid.Gladiator .7.2 | 40 | 68% |
| jcs.Seth 1.8 | 11 | 82% |
| tcf.Reach 3 | 7 | 57% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 1079. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 50 | 42% | 98 |
| kid.Gladiator .7.2 | 42 | 36% | 67 |
| jcs.Seth 1.8 | 11 | 9% | 25 |
| tcf.Reach 3 | 6 | 5% | 10 |
| cli.Dancer 1.1 | 4 | 3% | 7 |
| ratosh.Wesco 1.4 | 1 | 1% | 2 |
| sample.RamFire 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 80.2 | 42 / 210 | 2.78 | 15.2% | 21147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.7% | 144 |
| hadur117.mini.DeiseNARROW 0.4 | 2.2 | 15.2% | 42 |
| gh.mini.Gruwel 0.9 | 2.8 | 13.6% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.5% | 5 |
| rz.HawkOnFire 0.1 | 4.7 | 10.9% | 1 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.7 | 6.3% | 0 |
| dans.Cinnamon 1.2 | 9.2 | 4.5% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 82.5 | 8 / 35 | 3588 |
| 2 | 2 | 63.1 | 77.8 | 8 / 35 | 3312 |
| 3 | 2 | 64.2 | 81.6 | 4 / 35 | 3773 |
| 4 | 2 | 63.9 | 81.3 | 10 / 35 | 3491 |
| 5 | 2 | 64.1 | 81.0 | 5 / 35 | 3622 |
| 6 | 3 | 63.3 | 77.1 | 7 / 35 | 3361 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 90 | 18% |
| gh.mini.Gruwel 0.9 | 17 | 59% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| wit.Chuliath 1.0 | 3 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 96 | 56% | 111 |
| gh.mini.Gruwel 0.9 | 39 | 23% | 49 |
| rz.HawkOnFire 0.1 | 12 | 7% | 19 |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 5% | 14 |
| wit.Chuliath 1.0 | 4 | 2% | 8 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 4 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 93.0 | 171 / 210 | 1.63 | 21.0% | 33421 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 21.0% | 171 |
| bzdp.Pansy 2.1 | 2.2 | 12.4% | 11 |
| alpha.RainingFire 1.0 | 3.3 | 11.7% | 11 |
| bvh.micro.Freya 0.3 | 3.8 | 11.1% | 8 |
| mz.Cork 0.1 | 5.3 | 9.7% | 2 |
| m3thos.Eva02 0.7.1 | 6.0 | 9.6% | 4 |
| bvh.mini.Fenrir 0.39 | 6.3 | 9.2% | 3 |
| dl.BetterWalls 1.0 | 8.3 | 6.2% | 0 |
| squidM.TentalceMeleeNano 1.1 | 8.7 | 5.4% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 94.9 | 29 / 35 | 5449 |
| 2 | 1 | 71.4 | 92.7 | 29 / 35 | 5655 |
| 3 | 1 | 72.4 | 97.5 | 32 / 35 | 5708 |
| 4 | 1 | 70.6 | 90.2 | 26 / 35 | 5559 |
| 5 | 1 | 70.4 | 91.1 | 27 / 35 | 5486 |
| 6 | 1 | 71.0 | 91.7 | 28 / 35 | 5564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 51 | 94% |
| bvh.micro.Freya 0.3 | 39 | 90% |
| mz.Cork 0.1 | 26 | 96% |
| bvh.mini.Fenrir 0.39 | 22 | 100% |
| alpha.RainingFire 1.0 | 19 | 79% |
| m3thos.Eva02 0.7.1 | 14 | 93% |
| dl.BetterWalls 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 6 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 9 | 23% | 25 |
| bzdp.Pansy 2.1 | 8 | 20% | 71 |
| bvh.micro.Freya 0.3 | 7 | 18% | 28 |
| mz.Cork 0.1 | 5 | 13% | 32 |
| m3thos.Eva02 0.7.1 | 4 | 10% | 18 |
| bvh.mini.Fenrir 0.39 | 3 | 8% | 14 |
| sample.MyFirstRobot 1.0 | 3 | 8% | 6 |
| dl.BetterWalls 1.0 | 0 | 0% | 11 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 93.7 | 181 / 210 | 1.57 | 20.4% | 34017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 20.4% | 181 |
| germ.TheMind .2 | 2.2 | 10.8% | 5 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.4% | 2 |
| EBBU.Sim2 1.02 | 4.5 | 9.5% | 2 |
| stelo.UntouchableNano 1.3 | 5.7 | 8.8% | 6 |
| agrach.Dalek 1.0 | 6.3 | 8.6% | 2 |
| lmk.ACPFinal 0.1 | 7.0 | 8.4% | 5 |
| mb.Beast 0.1 | 7.8 | 7.9% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 8.0% | 0 |
| skm.Ryubot 1.0 | 9.2 | 7.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 96.5 | 32 / 35 | 5252 |
| 2 | 1 | 70.4 | 94.3 | 30 / 35 | 6065 |
| 3 | 1 | 69.8 | 93.0 | 30 / 35 | 5619 |
| 4 | 1 | 69.4 | 90.8 | 29 / 35 | 5787 |
| 5 | 1 | 71.1 | 99.7 | 34 / 35 | 5531 |
| 6 | 1 | 68.4 | 87.6 | 26 / 35 | 5763 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 50 | 98% |
| EBBU.Sim2 1.02 | 27 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 24 | 100% |
| stelo.UntouchableNano 1.3 | 21 | 81% |
| lmk.ACPFinal 0.1 | 18 | 89% |
| agrach.Dalek 1.0 | 17 | 100% |
| skm.Ryubot 1.0 | 15 | 100% |
| mb.Beast 0.1 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 7 | 24% | 22 |
| mn.nano.perceptual.Impact 1.3.0 | 7 | 24% | 12 |
| stelo.UntouchableNano 1.3 | 6 | 21% | 22 |
| germ.TheMind .2 | 3 | 10% | 36 |
| EBBU.Sim2 1.02 | 3 | 10% | 22 |
| agrach.Dalek 1.0 | 1 | 3% | 34 |
| mb.Beast 0.1 | 1 | 3% | 18 |
| skm.Ryubot 1.0 | 1 | 3% | 11 |
| com.syncleus.robocode.Dreadnaught 0.1 | 0 | 0% | 30 |

## Melee bench: F38

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.5 | 87 / 210 | 2.66 | 16.5% | 24254 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.3 | 16.5% | 87 |
| justin.Mallais 14.0 | 1.7 | 15.8% | 72 |
| bvh.mini.Freya 0.55 | 3.3 | 12.8% | 11 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.5% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.2% | 6 |
| cs.Wren 1.0 | 5.3 | 10.9% | 8 |
| kdf.KoulDestroyer 1.0 | 6.7 | 8.8% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.6% | 2 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 84.4 | 18 / 35 | 4402 |
| 2 | 1 | 65.1 | 80.0 | 14 / 35 | 3960 |
| 3 | 2 | 63.3 | 78.1 | 10 / 35 | 3793 |
| 4 | 1 | 65.9 | 83.5 | 16 / 35 | 4048 |
| 5 | 1 | 67.9 | 86.0 | 18 / 35 | 4520 |
| 6 | 2 | 63.4 | 77.1 | 11 / 35 | 3531 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 49 | 55% |
| bts.mega.Gnarly 1.4 | 21 | 62% |
| cs.Wren 1.0 | 16 | 88% |
| bvh.mini.Freya 0.55 | 16 | 88% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 92% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 67% |

Hadur died in 124 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 46 | 37% | 75 |
| bvh.mini.Freya 0.55 | 24 | 19% | 35 |
| cs.Wren 1.0 | 16 | 13% | 24 |
| bts.mega.Gnarly 1.4 | 15 | 12% | 31 |
| davidalves.net.DuelistNanoMelee 1.01 | 9 | 7% | 22 |
| kdf.KoulDestroyer 1.0 | 9 | 7% | 12 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 8 |

## Melee bench: F39

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.9 | 105 / 210 | 2.27 | 18.0% | 28857 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.0% | 105 |
| bvh.fry.Freya 0.82 | 2.2 | 14.5% | 21 |
| az.Ololobot 0.2.4 | 2.8 | 12.7% | 50 |
| catcat20.Lambda 0.024 | 4.0 | 11.6% | 23 |
| gimp.GimpBot 0.1 | 5.7 | 8.7% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.7% | 6 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.8% | 3 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 87.9 | 22 / 35 | 5088 |
| 2 | 1 | 67.3 | 87.9 | 17 / 35 | 4672 |
| 3 | 1 | 66.8 | 86.0 | 15 / 35 | 4813 |
| 4 | 1 | 68.2 | 88.6 | 19 / 35 | 4888 |
| 5 | 1 | 67.7 | 88.3 | 17 / 35 | 5003 |
| 6 | 1 | 64.3 | 76.8 | 15 / 35 | 4393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 54 | 54% |
| bvh.fry.Freya 0.82 | 43 | 84% |
| catcat20.Lambda 0.024 | 41 | 66% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 85% |
| gimp.GimpBot 0.1 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 0% |
| winamp32.micro.MicroMacro 1.0 | 1 | 0% |

Hadur died in 106 of 210 rounds, at a mean tick of 1103. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 38 | 36% | 72 |
| az.Ololobot 0.2.4 | 35 | 33% | 66 |
| catcat20.Lambda 0.024 | 18 | 17% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 8 | 8% | 13 |
| winamp32.micro.MicroMacro 1.0 | 3 | 3% | 4 |
| gimp.GimpBot 0.1 | 2 | 2% | 11 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.0 | 112 / 210 | 2.26 | 18.4% | 28378 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.4% | 112 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.1% | 22 |
| Polkwane.SmashMelee 1.0 | 3.7 | 11.4% | 15 |
| mz.AntiGrav 1.0 | 5.2 | 10.3% | 8 |
| stelo.Randomness 1.0 | 6.2 | 9.2% | 8 |
| alpha.BlackIce 1.0 | 6.7 | 8.7% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.0% | 1 |
| sample.Corners 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 81.9 | 15 / 35 | 4673 |
| 2 | 1 | 67.6 | 86.3 | 16 / 35 | 4644 |
| 3 | 1 | 69.9 | 90.5 | 23 / 35 | 5051 |
| 4 | 1 | 67.3 | 82.9 | 19 / 35 | 4602 |
| 5 | 1 | 66.7 | 84.1 | 17 / 35 | 4554 |
| 6 | 1 | 69.4 | 90.5 | 22 / 35 | 4854 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 62 | 73% |
| Polkwane.SmashMelee 1.0 | 24 | 79% |
| kano.gamma.KanoGamma 1.8 | 23 | 65% |
| mz.AntiGrav 1.0 | 14 | 100% |
| stelo.Randomness 1.0 | 13 | 77% |
| sample.Corners 1.0 | 5 | 100% |
| alpha.BlackIce 1.0 | 4 | 50% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 847. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 35% | 67 |
| kano.gamma.KanoGamma 1.8 | 19 | 19% | 45 |
| stelo.Randomness 1.0 | 13 | 13% | 29 |
| Polkwane.SmashMelee 1.0 | 13 | 13% | 27 |
| mz.AntiGrav 1.0 | 10 | 10% | 21 |
| alpha.BlackIce 1.0 | 7 | 7% | 12 |
| amk.superstrike.SuperStrike 0.3 | 1 | 1% | 3 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.3 | 100 / 210 | 2.32 | 17.4% | 25024 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.2 | 17.4% | 100 |
| eem.EvBotNG v12.8 | 2.2 | 15.4% | 63 |
| lessonz.robocode.Oz 0.5.0 | 3.3 | 12.9% | 14 |
| ary.Swarm 1.1 | 3.7 | 13.1% | 17 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.2% | 12 |
| shrub.Silver v048 | 6.2 | 8.5% | 3 |
| zyx.nano.Ant 1.1 | 6.8 | 7.6% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.0% | 1 |
| stelo.Mirror 1.1 | 9.0 | 5.1% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 86.7 | 17 / 35 | 4093 |
| 2 | 1 | 66.0 | 82.9 | 17 / 35 | 4094 |
| 3 | 1 | 67.6 | 84.4 | 17 / 35 | 4425 |
| 4 | 2 | 67.2 | 86.3 | 15 / 35 | 4056 |
| 5 | 1 | 67.7 | 87.0 | 20 / 35 | 4230 |
| 6 | 1 | 66.6 | 84.8 | 14 / 35 | 4126 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 61 | 48% |
| ary.Swarm 1.1 | 25 | 84% |
| lessonz.robocode.Oz 0.5.0 | 24 | 96% |
| simonton.nano.MeleeSeed 1.8 | 19 | 84% |
| jsal.Jsalbot 1.0 | 5 | 100% |
| shrub.Silver v048 | 4 | 100% |
| stelo.Mirror 1.1 | 3 | 67% |

Hadur died in 111 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 51 | 46% | 77 |
| ary.Swarm 1.1 | 28 | 25% | 49 |
| simonton.nano.MeleeSeed 1.8 | 11 | 10% | 24 |
| lessonz.robocode.Oz 0.5.0 | 10 | 9% | 34 |
| shrub.Silver v048 | 6 | 5% | 11 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| jsal.Jsalbot 1.0 | 1 | 1% | 7 |
| stelo.Mirror 1.1 | 1 | 1% | 3 |

## Melee bench: F42

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.0 | 106 / 210 | 2.17 | 18.3% | 30706 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 18.3% | 106 |
| wompi.Wallaby 5.1 | 2.0 | 15.4% | 52 |
| ara.Shera 0.88 | 3.3 | 13.7% | 29 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.2% | 18 |
| amz.NanoClone 1.41 | 5.2 | 8.8% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.4% | 1 |
| dsw.StaticD 1.0 | 6.5 | 7.3% | 3 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.7% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 5.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 88.9 | 21 / 35 | 5495 |
| 2 | 1 | 67.6 | 86.3 | 17 / 35 | 5083 |
| 3 | 1 | 68.3 | 87.3 | 16 / 35 | 5132 |
| 4 | 1 | 67.7 | 86.3 | 18 / 35 | 4893 |
| 5 | 1 | 66.9 | 83.8 | 16 / 35 | 4823 |
| 6 | 1 | 68.7 | 89.2 | 18 / 35 | 5280 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 54 | 78% |
| ara.Shera 0.88 | 42 | 71% |
| maribo.mini.MiniQuester 0.1 | 30 | 87% |
| dsw.StaticD 1.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 2 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 934. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 40 | 38% | 86 |
| ara.Shera 0.88 | 30 | 29% | 57 |
| maribo.mini.MiniQuester 0.1 | 27 | 26% | 50 |
| maribo.IotaCT 1.1 | 2 | 2% | 4 |
| amz.NanoClone 1.41 | 2 | 2% | 3 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 3 |
| dsw.StaticD 1.0 | 1 | 1% | 4 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 76.5 | 29 / 210 | 3.11 | 14.5% | 21020 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 147 |
| hadur117.mini.DeiseNARROW 0.4 | 2.0 | 14.5% | 29 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.7% | 19 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.7% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.5 | 10.9% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.8% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.3% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 73.3 | 4 / 35 | 3427 |
| 2 | 2 | 63.6 | 75.9 | 7 / 35 | 3478 |
| 3 | 2 | 63.7 | 77.5 | 3 / 35 | 3607 |
| 4 | 2 | 63.8 | 78.1 | 4 / 35 | 3432 |
| 5 | 2 | 64.4 | 78.1 | 6 / 35 | 3631 |
| 6 | 2 | 63.8 | 76.2 | 5 / 35 | 3445 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 78 | 13% |
| brainfade.melee.Dusk 0.44 | 11 | 73% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 2 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 101 | 56% | 113 |
| brainfade.melee.Dusk 0.44 | 26 | 14% | 33 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 24 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 18 |
| Krabb.akim2.Akim2 1.1b | 10 | 6% | 11 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| jab.DiamondStealer 5 | 4 | 2% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.2 | 138 / 210 | 1.89 | 19.6% | 30855 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.6% | 138 |
| stelo.Liblix 0.3.1 | 2.2 | 15.2% | 48 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.7% | 17 |
| wompi.Quokka 1.6 | 4.0 | 10.6% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.1% | 1 |
| jwirde.Gort 2.0 | 6.3 | 8.4% | 3 |
| stf.PanzerGeneral 0.1 | 7.2 | 7.1% | 0 |
| disan.Chair 2.2.0 | 7.5 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 5.0% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.0 | 26 / 35 | 5340 |
| 2 | 1 | 68.2 | 88.6 | 18 / 35 | 4702 |
| 3 | 1 | 70.4 | 92.1 | 27 / 35 | 5235 |
| 4 | 1 | 70.0 | 89.8 | 24 / 35 | 5361 |
| 5 | 1 | 68.8 | 88.6 | 20 / 35 | 4880 |
| 6 | 1 | 69.9 | 88.9 | 23 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 78 | 76% |
| tzu.TheArtOfWar 1.2 | 52 | 81% |
| wompi.Quokka 1.6 | 19 | 89% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 100% |
| stf.PanzerGeneral 0.1 | 6 | 100% |
| jwirde.Gort 2.0 | 3 | 100% |
| disan.Chair 2.2.0 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 34 | 47% | 102 |
| tzu.TheArtOfWar 1.2 | 24 | 33% | 62 |
| wompi.Quokka 1.6 | 5 | 7% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 5% | 8 |
| disan.Chair 2.2.0 | 3 | 4% | 7 |
| jwirde.Gort 2.0 | 1 | 1% | 7 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.3 | 81 / 210 | 2.06 | 19.6% | 35759 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseNARROW 0.4 | 1.0 | 19.6% | 81 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.1% | 113 |
| jje.BagPuss 1.2 | 3.0 | 11.6% | 6 |
| sul.Lunar 1.1 | 4.3 | 10.5% | 5 |
| myl.nano.Graviton 1.10 | 4.7 | 10.1% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.2% | 1 |
| fm.claire 1.7 | 7.0 | 8.1% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.1% | 1 |
| wit.Deep7 2.0 | 8.8 | 6.5% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.7 | 20 / 35 | 6121 |
| 2 | 1 | 66.9 | 83.2 | 6 / 35 | 5635 |
| 3 | 1 | 68.8 | 87.0 | 14 / 35 | 5963 |
| 4 | 1 | 68.4 | 86.0 | 11 / 35 | 5771 |
| 5 | 1 | 70.9 | 91.4 | 18 / 35 | 6215 |
| 6 | 1 | 69.7 | 89.2 | 12 / 35 | 6054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 111 | 19% |
| sul.Lunar 1.1 | 19 | 95% |
| myl.nano.Graviton 1.10 | 14 | 93% |
| jje.BagPuss 1.2 | 11 | 91% |
| wit.Deep7 2.0 | 9 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 9 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 2364. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 90 | 69% | 0 |
| jje.BagPuss 1.2 | 10 | 8% | 62 |
| sul.Lunar 1.1 | 8 | 6% | 58 |
| myl.nano.Graviton 1.10 | 7 | 5% | 34 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 17 |
| fm.claire 1.7 | 5 | 4% | 13 |
| hvilela.HVilela 0.9 | 3 | 2% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseNARROW 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.1 | 83.9 | 76 / 210 | 2.45 | 16.6% | 24880 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.9% | 62 |
| hadur117.mini.DeiseNARROW 0.4 | 2.0 | 16.6% | 76 |
| rsalesc.melee.Medina 0.4.5 | 2.7 | 15.6% | 60 |
| mz.MicroSheep 1.0 | 4.3 | 10.8% | 2 |
| cx.Princess 1.0 | 5.0 | 10.1% | 8 |
| sadoner.killer 0.2 | 5.8 | 8.9% | 1 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.3% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.3 | 5.7% | 0 |
| kurios.DOSexe .9a | 8.5 | 4.9% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.8 | 81.3 | 10 / 35 | 4046 |
| 2 | 2 | 66.4 | 87.0 | 14 / 35 | 3969 |
| 3 | 2 | 66.9 | 86.0 | 12 / 35 | 4201 |
| 4 | 3 | 65.0 | 81.0 | 11 / 35 | 4033 |
| 5 | 1 | 66.2 | 82.5 | 14 / 35 | 4318 |
| 6 | 1 | 66.9 | 85.7 | 15 / 35 | 4313 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 61 | 52% |
| rsalesc.melee.Medina 0.4.5 | 40 | 58% |
| cx.Princess 1.0 | 15 | 73% |
| mz.MicroSheep 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 965. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 70 | 52% | 107 |
| rsalesc.melee.Medina 0.4.5 | 32 | 24% | 54 |
| mz.MicroSheep 1.0 | 13 | 10% | 21 |
| cx.Princess 1.0 | 8 | 6% | 11 |
| sadoner.killer 0.2 | 6 | 4% | 8 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 8 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

