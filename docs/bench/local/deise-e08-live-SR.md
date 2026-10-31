# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 86.4 | 41 / 210 | 2.22 | 17.7% | 34218 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 148 |
| hadur117.mini.DeiseSR 0.4 | 2.0 | 17.7% | 41 |
| sgp.JollyNinja 3.53 | 3.7 | 11.0% | 14 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.6% | 1 |
| mz.MicroGodMelee 1 | 4.7 | 10.1% | 4 |
| lorneswork.Predator 1.0 | 5.7 | 9.7% | 3 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.0% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 86.7 | 5 / 35 | 5392 |
| 2 | 2 | 68.2 | 86.3 | 8 / 35 | 5957 |
| 3 | 2 | 67.6 | 87.0 | 6 / 35 | 5469 |
| 4 | 2 | 68.8 | 88.6 | 10 / 35 | 6137 |
| 5 | 2 | 67.7 | 85.7 | 7 / 35 | 5824 |
| 6 | 2 | 66.9 | 84.1 | 5 / 35 | 5439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 125 | 8% |
| sgp.JollyNinja 3.53 | 16 | 63% |
| mz.MicroGodMelee 1 | 10 | 80% |
| lorneswork.Predator 1.0 | 7 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 100% |
| skm.butterfly 1.0 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1023. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 79% | 147 |
| sgp.JollyNinja 3.53 | 14 | 8% | 20 |
| lorneswork.Predator 1.0 | 7 | 4% | 13 |
| simonton.nano.WeekendObsession_Melee 1.0 | 6 | 4% | 8 |
| mz.MicroGodMelee 1 | 5 | 3% | 15 |
| adt.Ar2 1.0 | 1 | 1% | 3 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 76.9 | 77 / 210 | 3.08 | 17.1% | 31906 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.1% | 77 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.2 | 14.1% | 38 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 13.0% | 43 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.8% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.6% | 11 |
| sch.Simone 0.3d | 7.0 | 7.8% | 10 |
| fnc.bandit.Bandit 5.2.0 | 7.5 | 7.4% | 3 |
| Noran.BitchingElk 0.054 | 7.5 | 7.9% | 15 |
| stelo.PatternRobot 1.0 | 7.8 | 6.7% | 9 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 78.7 | 12 / 35 | 5208 |
| 2 | 1 | 65.4 | 74.9 | 13 / 35 | 5361 |
| 3 | 1 | 64.6 | 71.7 | 12 / 35 | 5204 |
| 4 | 1 | 65.4 | 76.2 | 13 / 35 | 5177 |
| 5 | 1 | 67.8 | 82.9 | 13 / 35 | 5693 |
| 6 | 1 | 65.9 | 76.8 | 14 / 35 | 5263 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 64% |
| pulsar.PulsarMax 0.8.9 | 31 | 61% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 87% |
| sch.Simone 0.3d | 9 | 56% |
| Noran.BitchingElk 0.054 | 7 | 29% |
| com.cohesiva.robocode.ManOwaR 1.0 | 6 | 83% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 1 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 830. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 39 | 29% | 58 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 21% | 50 |
| lrem.micro.SpikeSoldier 0.4 | 22 | 16% | 27 |
| com.cohesiva.robocode.ManOwaR 1.0 | 15 | 11% | 28 |
| stelo.PatternRobot 1.0 | 8 | 6% | 9 |
| Noran.BitchingElk 0.054 | 7 | 5% | 15 |
| sch.Simone 0.3d | 6 | 4% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6 | 4% | 6 |
| fullsail.SweetTea 1.1 | 3 | 2% | 5 |

## Melee bench: F03

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.7 | 133 / 210 | 1.84 | 20.2% | 39507 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 20.2% | 133 |
| kawigi.nano.Lib 1.0 | 2.7 | 13.4% | 20 |
| vuen.Cake 2.51 | 3.0 | 12.9% | 37 |
| radnor.DoctorBob 1.42 | 3.3 | 12.6% | 15 |
| urdos.URDOS 1.3 | 5.2 | 9.1% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 6.5 | 7.4% | 0 |
| adt.Ar1 2.1 | 6.7 | 7.5% | 2 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.7% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.3 | 5.4% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 23 / 35 | 6688 |
| 2 | 1 | 71.4 | 94.6 | 25 / 35 | 6629 |
| 3 | 1 | 71.7 | 93.7 | 27 / 35 | 6745 |
| 4 | 1 | 70.7 | 91.1 | 25 / 35 | 6728 |
| 5 | 1 | 69.6 | 88.9 | 16 / 35 | 6644 |
| 6 | 1 | 67.1 | 81.9 | 17 / 35 | 6073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 77 | 65% |
| kawigi.nano.Lib 1.0 | 56 | 82% |
| radnor.DoctorBob 1.42 | 31 | 90% |
| adt.Ar1 2.1 | 4 | 75% |
| oa.weak.FlyMk1 0.1 | 3 | 67% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 34 | 43% | 87 |
| kawigi.nano.Lib 1.0 | 20 | 25% | 61 |
| radnor.DoctorBob 1.42 | 13 | 16% | 32 |
| adt.Ar1 2.1 | 4 | 5% | 8 |
| urdos.URDOS 1.3 | 4 | 5% | 5 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 4% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 1% | 6 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 82.6 | 16 / 210 | 2.56 | 17.1% | 35443 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.1% | 184 |
| hadur117.mini.DeiseSR 0.4 | 2.0 | 17.1% | 16 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.9% | 4 |
| TNT.TNT 0.99.1 | 4.2 | 10.5% | 3 |
| josago.Jorgito 0.16 | 4.8 | 9.3% | 2 |
| css.Delitioner 0.11 | 6.2 | 7.2% | 2 |
| tj.zombie1n 1.0.1 | 7.0 | 6.5% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.7% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 82.2 | 4 / 35 | 6172 |
| 2 | 2 | 67.9 | 83.5 | 3 / 35 | 5996 |
| 3 | 2 | 68.7 | 86.0 | 5 / 35 | 5939 |
| 4 | 2 | 67.5 | 83.5 | 1 / 35 | 5810 |
| 5 | 2 | 67.2 | 82.5 | 2 / 35 | 5801 |
| 6 | 2 | 66.4 | 78.1 | 1 / 35 | 5725 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 6% |
| apc.LeeroyJenkins2 1.0 | 6 | 50% |
| josago.Jorgito 0.16 | 2 | 50% |
| spin.Bugstard 0.012b | 2 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| TNT.TNT 0.99.1 | 1 | 100% |

Hadur died in 195 of 210 rounds, at a mean tick of 1157. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 159 | 82% | 169 |
| apc.LeeroyJenkins2 1.0 | 16 | 8% | 20 |
| josago.Jorgito 0.16 | 7 | 4% | 7 |
| css.Delitioner 0.11 | 5 | 3% | 7 |
| TNT.TNT 0.99.1 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 1 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.2 | 68.9 | 12 / 210 | 3.80 | 13.2% | 21695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.4% | 115 |
| justin.DemonicRage 3.4 | 1.7 | 16.9% | 62 |
| hadur117.mini.DeiseSR 0.4 | 3.2 | 13.2% | 12 |
| wompi.Numbat 2.1 | 3.8 | 12.2% | 11 |
| ms.Ares 0.19 | 5.3 | 9.4% | 2 |
| axeBots.HataMoto 3.09 | 5.7 | 9.1% | 7 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.2% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.9% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.4 | 67.3 | 3 / 35 | 3222 |
| 2 | 3 | 62.1 | 72.4 | 4 / 35 | 3934 |
| 3 | 3 | 60.7 | 69.2 | 3 / 35 | 3738 |
| 4 | 3 | 61.0 | 71.4 | 1 / 35 | 3677 |
| 5 | 4 | 56.9 | 61.3 | 0 / 35 | 3319 |
| 6 | 3 | 61.2 | 71.7 | 1 / 35 | 3805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 31 | 3% |
| justin.DemonicRage 3.4 | 18 | 17% |
| wompi.Numbat 2.1 | 5 | 100% |
| axeBots.HataMoto 3.09 | 3 | 67% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 79 | 40% | 84 |
| justin.DemonicRage 3.4 | 53 | 27% | 55 |
| wompi.Numbat 2.1 | 28 | 14% | 31 |
| ms.Ares 0.19 | 17 | 9% | 18 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| GarmBox.Oranges 1.0 | 5 | 3% | 5 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 80.7 | 79 / 210 | 2.74 | 17.1% | 29259 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.1% | 79 |
| jekl.StoneGhost 0.7 | 2.0 | 15.2% | 42 |
| origin.SleepSiphon 1.7b | 3.2 | 13.5% | 47 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 12.6% | 31 |
| mld.Wisdom 1.0 | 5.0 | 10.4% | 3 |
| gg.Wolverine 2.0 | 5.8 | 8.6% | 6 |
| DBall.NUKE 0.1 | 7.8 | 6.7% | 0 |
| spinnercat.Omen 1.0 | 8.0 | 6.5% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.4% | 3 |
| sample.Fire 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.7 | 77.5 | 10 / 35 | 4459 |
| 2 | 1 | 65.0 | 76.2 | 12 / 35 | 4803 |
| 3 | 1 | 68.1 | 85.4 | 16 / 35 | 5315 |
| 4 | 1 | 66.4 | 81.3 | 13 / 35 | 4890 |
| 5 | 1 | 67.2 | 82.5 | 16 / 35 | 4785 |
| 6 | 1 | 66.7 | 81.3 | 12 / 35 | 5007 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 47 | 79% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 62% |
| origin.SleepSiphon 1.7b | 23 | 48% |
| gg.Wolverine 2.0 | 5 | 100% |
| mld.Wisdom 1.0 | 5 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| sample.Fire 1.0 | 1 | 100% |
| DBall.NUKE 0.1 | 1 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 750. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 48 | 36% | 71 |
| pe.minimelee.SandboxMiniMelee 1.1 | 37 | 28% | 55 |
| origin.SleepSiphon 1.7b | 26 | 19% | 45 |
| mld.Wisdom 1.0 | 10 | 7% | 20 |
| gg.Wolverine 2.0 | 5 | 4% | 7 |
| DBall.NUKE 0.1 | 4 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 1% | 5 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 88.0 | 81 / 210 | 2.08 | 19.1% | 37072 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.1% | 81 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.6% | 55 |
| rtk.Tachikoma 1.0 | 2.7 | 16.6% | 44 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 17 |
| franzor.Lizt 1.3.1 | 4.7 | 10.6% | 15 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.6% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| drd.Dreadknoght 0.9 | 9.3 | 2.4% | 0 |
| sample.Target 1.0 | 9.7 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 88.3 | 14 / 35 | 6049 |
| 2 | 1 | 69.9 | 88.9 | 11 / 35 | 5857 |
| 3 | 1 | 71.2 | 89.5 | 14 / 35 | 6659 |
| 4 | 1 | 69.5 | 83.8 | 13 / 35 | 6204 |
| 5 | 1 | 71.6 | 91.1 | 18 / 35 | 6383 |
| 6 | 1 | 69.7 | 86.3 | 11 / 35 | 5920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 82 | 68% |
| rsalesc.melee.Monk 0.3.6c | 43 | 12% |
| oog.melee.CapuletDroid 1.1 | 24 | 58% |
| franzor.Lizt 1.3.1 | 8 | 38% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1214. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 53 | 41% | 69 |
| rtk.Tachikoma 1.0 | 51 | 39% | 101 |
| oog.melee.CapuletDroid 1.1 | 15 | 12% | 29 |
| franzor.Lizt 1.3.1 | 8 | 6% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 5 |
| drd.Dreadknoght 0.9 | 1 | 1% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.2 | 100 / 210 | 2.42 | 18.2% | 30925 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 18.2% | 100 |
| tm.Yuugao 1.0 | 2.2 | 12.7% | 44 |
| shrub.Vapour v159 | 3.2 | 12.3% | 27 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 11.5% | 22 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.7% | 9 |
| m3thos.Eva00 1.1 | 6.5 | 8.1% | 0 |
| jwst.DAD.DarkAndDarker 1.1 | 7.3 | 7.9% | 7 |
| qualidafial.MajorDick 1.0.1 | 8.0 | 7.0% | 2 |
| SHAM.WOW 1.4 | 8.7 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.8 | 20 / 35 | 5195 |
| 2 | 1 | 69.1 | 88.3 | 19 / 35 | 5653 |
| 3 | 1 | 63.7 | 74.0 | 12 / 35 | 4725 |
| 4 | 1 | 66.1 | 80.6 | 16 / 35 | 4932 |
| 5 | 1 | 68.6 | 88.6 | 18 / 35 | 5229 |
| 6 | 1 | 66.7 | 82.9 | 15 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 38 | 58% |
| Krabb.sliNk.Garm 0.9u | 33 | 76% |
| shrub.Vapour v159 | 33 | 64% |
| com.spp.robocode.MostlyHarmless 010 | 19 | 89% |
| jwst.DAD.DarkAndDarker 1.1 | 12 | 75% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| m3thos.Eva00 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 39 | 35% | 66 |
| shrub.Vapour v159 | 24 | 22% | 45 |
| Krabb.sliNk.Garm 0.9u | 22 | 20% | 38 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 7% | 21 |
| zyx.nano.BacillusComma 1.0 | 7 | 6% | 12 |
| m3thos.Eva00 1.1 | 4 | 4% | 6 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 3% | 12 |
| SHAM.WOW 1.4 | 2 | 2% | 6 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 4 |

## Melee bench: F09

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 73.4 | 50 / 210 | 3.40 | 15.6% | 27189 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 16.5% | 91 |
| hadur117.mini.DeiseSR 0.4 | 1.7 | 15.6% | 50 |
| kc.micro.Figment 1.0 | 3.0 | 13.8% | 29 |
| pedersen.Grishnakh 1.0 | 4.7 | 10.8% | 18 |
| yagami.Tidus 0.11 | 5.0 | 10.5% | 2 |
| mc2.enemy.Original 0.9 | 5.3 | 9.8% | 15 |
| dft.Calliope 5.6 | 7.0 | 7.7% | 5 |
| step.nanoPri 1.0 | 8.0 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.9% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 80.0 | 13 / 35 | 4679 |
| 2 | 2 | 61.4 | 67.6 | 5 / 35 | 4088 |
| 3 | 2 | 64.1 | 75.6 | 6 / 35 | 4626 |
| 4 | 1 | 64.0 | 73.7 | 8 / 35 | 4814 |
| 5 | 2 | 64.5 | 72.7 | 10 / 35 | 4567 |
| 6 | 2 | 63.0 | 70.8 | 8 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 38 | 32% |
| kc.micro.Figment 1.0 | 28 | 61% |
| yagami.Tidus 0.11 | 13 | 100% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| mc2.enemy.Original 0.9 | 7 | 14% |
| dft.Calliope 5.6 | 3 | 33% |

Hadur died in 160 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 58 | 36% | 69 |
| kc.micro.Figment 1.0 | 35 | 22% | 54 |
| mc2.enemy.Original 0.9 | 22 | 14% | 25 |
| yagami.Tidus 0.11 | 21 | 13% | 29 |
| pedersen.Grishnakh 1.0 | 13 | 8% | 16 |
| dft.Calliope 5.6 | 4 | 3% | 8 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 3 |
| step.nanoPri 1.0 | 2 | 1% | 3 |

## Melee bench: F10

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 89.4 | 129 / 210 | 1.96 | 19.5% | 35415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.5% | 129 |
| DTF.Kludgy 1.2b | 2.2 | 14.7% | 43 |
| ne.Chimera 1.2 | 3.2 | 12.5% | 11 |
| ejb.Polaris 1.0.1 | 3.8 | 11.9% | 11 |
| vStar.RAFzilla 2.15 | 5.0 | 10.5% | 8 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.8% | 4 |
| sam.Samspin 1.0 | 7.8 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 8.8 | 4.7% | 4 |
| Grystrion.RandomTrackerNOREV 1.0 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 88.3 | 21 / 35 | 6120 |
| 2 | 1 | 70.0 | 89.8 | 22 / 35 | 5859 |
| 3 | 1 | 70.3 | 90.8 | 22 / 35 | 6032 |
| 4 | 1 | 68.6 | 87.0 | 18 / 35 | 5743 |
| 5 | 1 | 70.5 | 93.7 | 24 / 35 | 5907 |
| 6 | 1 | 69.0 | 86.7 | 22 / 35 | 5754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 53 | 62% |
| ejb.Polaris 1.0.1 | 38 | 95% |
| ne.Chimera 1.2 | 25 | 80% |
| vStar.RAFzilla 2.15 | 23 | 91% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| donjezza.Muncho 1.0 | 1 | 0% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 38 | 46% | 65 |
| ne.Chimera 1.2 | 16 | 20% | 40 |
| ejb.Polaris 1.0.1 | 8 | 10% | 49 |
| vStar.RAFzilla 2.15 | 5 | 6% | 18 |
| sam.Samspin 1.0 | 5 | 6% | 7 |
| donjezza.Muncho 1.0 | 4 | 5% | 6 |
| tvv.micro.Antares 1.1.1 | 3 | 4% | 10 |
| kurios.DOSexe .9b | 2 | 2% | 11 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 3 |

## Melee bench: F11

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.1 | 71 / 210 | 2.79 | 17.2% | 29932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.2 | 17.2% | 71 |
| rz.Aleph 0.34 | 2.0 | 16.4% | 73 |
| cx.mini.Nimrod 0.55 | 2.8 | 12.8% | 24 |
| djc.DynaBot 0.1.1 | 4.2 | 10.8% | 14 |
| rdt199.Warlord 0.73 | 5.3 | 9.3% | 13 |
| br2.MobyDickBot 1.6 | 6.0 | 8.5% | 7 |
| uji.YellohFellah 1.0 | 6.5 | 8.0% | 9 |
| KiraNL.Chupacabra 0.4 | 8.2 | 6.7% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.4% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.9 | 14 / 35 | 5017 |
| 2 | 1 | 66.0 | 80.6 | 12 / 35 | 4878 |
| 3 | 2 | 65.1 | 76.5 | 9 / 35 | 5040 |
| 4 | 1 | 65.3 | 78.7 | 11 / 35 | 4807 |
| 5 | 1 | 66.7 | 81.0 | 10 / 35 | 5192 |
| 6 | 1 | 67.1 | 81.9 | 15 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 57 | 51% |
| cx.mini.Nimrod 0.55 | 18 | 72% |
| djc.DynaBot 0.1.1 | 12 | 58% |
| rdt199.Warlord 0.73 | 12 | 92% |
| br2.MobyDickBot 1.6 | 7 | 71% |
| uji.YellohFellah 1.0 | 6 | 67% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 60 | 43% | 87 |
| cx.mini.Nimrod 0.55 | 28 | 20% | 41 |
| djc.DynaBot 0.1.1 | 20 | 14% | 26 |
| rdt199.Warlord 0.73 | 10 | 7% | 20 |
| uji.YellohFellah 1.0 | 6 | 4% | 11 |
| br2.MobyDickBot 1.6 | 6 | 4% | 11 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 6 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 4 |
| stelo.MirrorNano 1.3 | 1 | 1% | 3 |

## Melee bench: F12

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 79.1 | 79 / 210 | 2.88 | 16.6% | 25690 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 16.6% | 79 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.5% | 40 |
| nat.PallasHawk 1.0 | 3.2 | 13.1% | 38 |
| darkcanuck.Leon 1.01 | 3.8 | 12.7% | 29 |
| brainfade.melee.Genghis 0.36 | 4.5 | 10.7% | 17 |
| jrm.Test0 1.0 | 6.7 | 7.7% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.3% | 0 |
| jp.Perpy 16.0 | 7.3 | 7.2% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.4% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.7% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 73.0 | 14 / 35 | 4056 |
| 2 | 1 | 64.1 | 79.0 | 10 / 35 | 4078 |
| 3 | 1 | 64.8 | 77.1 | 12 / 35 | 4223 |
| 4 | 1 | 65.6 | 79.0 | 14 / 35 | 4581 |
| 5 | 1 | 64.9 | 80.0 | 11 / 35 | 4171 |
| 6 | 1 | 67.8 | 86.3 | 18 / 35 | 4581 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 35 | 60% |
| darkcanuck.Leon 1.01 | 34 | 62% |
| bts.wiki.RipCurl 0.9b | 28 | 64% |
| brainfade.melee.Genghis 0.36 | 12 | 67% |
| jrm.Test0 1.0 | 4 | 100% |
| jp.Perpy 16.0 | 4 | 75% |
| jaybot.bots.Oddball 4.0 | 3 | 67% |
| stuff.Vlad 0.1 | 1 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 34 | 26% | 51 |
| nat.PallasHawk 1.0 | 33 | 25% | 51 |
| darkcanuck.Leon 1.01 | 20 | 15% | 45 |
| brainfade.melee.Genghis 0.36 | 17 | 13% | 20 |
| jrm.Test0 1.0 | 12 | 9% | 16 |
| cs.sheldor.Talon 1.1 | 7 | 5% | 10 |
| jp.Perpy 16.0 | 4 | 3% | 7 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 7 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 81.9 | 49 / 210 | 2.63 | 16.4% | 28425 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.7 | 16.4% | 49 |
| mn.Combat 3.25.0 | 2.0 | 16.5% | 90 |
| ags.Glacier 0.2.11 | 2.3 | 16.1% | 43 |
| gh.micro.Gruweltje 0.7 | 4.3 | 11.6% | 8 |
| shinh.Entangled 0.3 | 4.7 | 11.8% | 21 |
| apc.Colossus2 0.17 | 6.5 | 7.5% | 0 |
| stelo.Wang 1.0 | 6.5 | 7.4% | 1 |
| ayk.WallHugger 1.0 | 8.2 | 5.0% | 0 |
| maribo.FollowFire 1 | 9.0 | 4.3% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 87.9 | 10 / 35 | 5117 |
| 2 | 1 | 66.2 | 81.0 | 8 / 35 | 4729 |
| 3 | 1 | 66.7 | 85.1 | 9 / 35 | 4792 |
| 4 | 3 | 63.3 | 74.9 | 7 / 35 | 4114 |
| 5 | 2 | 66.4 | 83.5 | 9 / 35 | 4854 |
| 6 | 2 | 65.1 | 78.7 | 6 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 45 | 27% |
| ags.Glacier 0.2.11 | 41 | 49% |
| shinh.Entangled 0.3 | 18 | 50% |
| gh.micro.Gruweltje 0.7 | 5 | 80% |
| apc.Colossus2 0.17 | 3 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 163 of 210 rounds, at a mean tick of 859. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 57 | 35% | 69 |
| ags.Glacier 0.2.11 | 51 | 31% | 70 |
| shinh.Entangled 0.3 | 27 | 17% | 36 |
| gh.micro.Gruweltje 0.7 | 16 | 10% | 20 |
| stelo.Wang 1.0 | 8 | 5% | 10 |
| apc.Colossus2 0.17 | 2 | 1% | 4 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.0 | 132 / 210 | 1.99 | 19.7% | 35749 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.7% | 132 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 16.0% | 45 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.3% | 25 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.5% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.2 | 9.5% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.4% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 8.4% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.8% | 6 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.1 | 20 / 35 | 5771 |
| 2 | 1 | 70.1 | 91.4 | 19 / 35 | 6027 |
| 3 | 1 | 70.4 | 89.2 | 24 / 35 | 5988 |
| 4 | 1 | 69.4 | 84.4 | 21 / 35 | 5975 |
| 5 | 1 | 70.7 | 92.4 | 23 / 35 | 5861 |
| 6 | 1 | 71.0 | 91.4 | 25 / 35 | 6127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 76 | 76% |
| catcat20.shape.Theta 0.018 | 48 | 73% |
| sanyi.mikrobi.Roberto 1.0 | 18 | 94% |
| sheldor.micro.PointInLineRRAL 1.0 | 16 | 94% |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 794. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 41 | 52% | 98 |
| catcat20.shape.Theta 0.018 | 19 | 24% | 41 |
| dmh.robocode.robot.RedDwarf 0.4 | 7 | 9% | 13 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 4% | 21 |
| sheldor.micro.PointInLineRRAL 1.0 | 3 | 4% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 4% | 13 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 1% | 2 |
| sample.TrackFire 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 77.8 | 65 / 210 | 3.00 | 16.8% | 31116 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 16.8% | 65 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.6% | 34 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 57 |
| mld.DustBunny 3.8 | 3.7 | 12.7% | 10 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.7% | 15 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.8% | 28 |
| lambdaxy.TBot 0.1 | 7.3 | 6.5% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.7 | 5.3% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.3 | 75.6 | 9 / 35 | 4968 |
| 2 | 1 | 66.4 | 79.7 | 12 / 35 | 5195 |
| 3 | 1 | 67.4 | 81.9 | 19 / 35 | 5179 |
| 4 | 1 | 64.2 | 73.3 | 6 / 35 | 5138 |
| 5 | 1 | 66.1 | 78.1 | 10 / 35 | 5338 |
| 6 | 1 | 65.8 | 78.1 | 9 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 28 | 32% |
| kawigi.micro.Shiz 1.1 | 28 | 82% |
| cb.nano.Insomnia 1.0 | 16 | 44% |
| mld.DustBunny 3.8 | 15 | 87% |
| kawigi.robot.Girl 1.2 | 15 | 47% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 910. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 41 | 28% | 59 |
| cb.nano.Insomnia 1.0 | 28 | 19% | 23 |
| mld.DustBunny 3.8 | 26 | 18% | 41 |
| kawigi.micro.Shiz 1.1 | 25 | 17% | 50 |
| kawigi.robot.Girl 1.2 | 15 | 10% | 17 |
| divineomega.TrialBot 0.003 | 4 | 3% | 10 |
| lambdaxy.TBot 0.1 | 4 | 3% | 6 |
| Grystrion.TrackerWO 1.0 | 2 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 80.8 | 81 / 210 | 2.72 | 18.5% | 37963 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 18.5% | 81 |
| gh.Griezel 0.5.2 | 2.0 | 17.0% | 81 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 8 |
| techdude.forest.FlamingForest 1.1 | 4.3 | 10.0% | 28 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.3% | 1 |
| tvv.nano.Polaris 1.2 | 6.0 | 8.6% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 8.0% | 3 |
| asd.Cthulhu 1.3 | 8.8 | 4.7% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.0 | 5.3% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 82.5 | 14 / 35 | 6520 |
| 2 | 1 | 69.2 | 81.3 | 15 / 35 | 6637 |
| 3 | 1 | 68.4 | 80.6 | 14 / 35 | 6363 |
| 4 | 1 | 68.8 | 84.1 | 10 / 35 | 6065 |
| 5 | 1 | 69.2 | 82.9 | 15 / 35 | 6264 |
| 6 | 1 | 66.6 | 73.7 | 13 / 35 | 6114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 69 | 42% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 95% |
| techdude.forest.FlamingForest 1.1 | 11 | 45% |
| bvh.fnr.Fenrir 0.36l | 10 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 80% |
| tvv.nano.Polaris 1.2 | 3 | 100% |
| repositorio.NanoStep 1.0 | 2 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 991. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 67 | 51% | 100 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 14% | 37 |
| bvh.fnr.Fenrir 0.36l | 15 | 11% | 18 |
| techdude.forest.FlamingForest 1.1 | 9 | 7% | 17 |
| stelo.IntrinsicVolatility 1.4 | 9 | 7% | 15 |
| divineomega.DivineBot 1.9.4.5 | 6 | 5% | 12 |
| tvv.nano.Polaris 1.2 | 3 | 2% | 6 |
| asd.Cthulhu 1.3 | 3 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.1 | 73 / 210 | 2.80 | 17.6% | 34361 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.6% | 73 |
| et.Predator 1.8 | 2.2 | 13.7% | 28 |
| cx.BlestPain 1.41 | 3.5 | 12.6% | 53 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.5% | 40 |
| nic.Nicator 2.4 | 5.2 | 11.3% | 7 |
| ahf.NanoAndrew .4 | 5.3 | 10.6% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 8.3% | 0 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 82.2 | 16 / 35 | 5830 |
| 2 | 1 | 67.5 | 81.9 | 13 / 35 | 5665 |
| 3 | 1 | 70.0 | 89.2 | 18 / 35 | 6132 |
| 4 | 1 | 67.7 | 80.6 | 11 / 35 | 5974 |
| 5 | 1 | 67.2 | 81.3 | 10 / 35 | 5589 |
| 6 | 1 | 61.9 | 65.1 | 5 / 35 | 5171 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 48 | 69% |
| cx.BlestPain 1.41 | 30 | 27% |
| oog.melee.Mercutio 1.0 | 18 | 50% |
| nic.Nicator 2.4 | 11 | 91% |
| ahf.NanoAndrew .4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 942. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 41 | 30% | 52 |
| et.Predator 1.8 | 40 | 29% | 63 |
| oog.melee.Mercutio 1.0 | 21 | 15% | 29 |
| nic.Nicator 2.4 | 15 | 11% | 28 |
| ahf.NanoAndrew .4 | 13 | 9% | 25 |
| maribo.melee.BMV 0.1 | 4 | 3% | 6 |
| tex.Longbot 0.4 | 2 | 1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 5 |

## Melee bench: F18

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 83.9 | 98 / 210 | 2.45 | 17.9% | 29099 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.9% | 98 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.7% | 40 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.8% | 34 |
| uji.DBH 1.1 | 4.0 | 10.7% | 16 |
| ratosh.Nobo 0.21 | 5.3 | 9.8% | 2 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.9% | 11 |
| sigterm.Sigterm 1.0 | 6.8 | 8.2% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.9% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 5.7% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.2 | 15 / 35 | 5007 |
| 2 | 1 | 67.1 | 84.4 | 16 / 35 | 4701 |
| 3 | 1 | 66.2 | 82.5 | 16 / 35 | 4588 |
| 4 | 1 | 65.7 | 79.4 | 14 / 35 | 4943 |
| 5 | 1 | 68.0 | 87.0 | 18 / 35 | 5062 |
| 6 | 1 | 67.7 | 87.0 | 19 / 35 | 4798 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 73% |
| uji.DBH 1.1 | 21 | 71% |
| agd.Mooserwirt2 2.7 | 19 | 26% |
| spinnercat.Robovirus 2.718 | 18 | 72% |
| sigterm.Sigterm 1.0 | 13 | 62% |
| ratosh.Nobo 0.21 | 9 | 100% |
| stelo.WangRobot 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 39 | 34% | 65 |
| agd.Mooserwirt2 2.7 | 22 | 19% | 37 |
| spinnercat.Robovirus 2.718 | 15 | 13% | 24 |
| uji.DBH 1.1 | 12 | 10% | 18 |
| sigterm.Sigterm 1.0 | 10 | 9% | 21 |
| ratosh.Nobo 0.21 | 7 | 6% | 19 |
| stelo.WangRobot 1.0 | 3 | 3% | 11 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 7 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 2% | 6 |
2 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.3 | 126 / 210 | 1.79 | 20.4% | 37195 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 20.4% | 126 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.4% | 39 |
| mld.Infinity 2.2 | 2.8 | 14.4% | 38 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.3% | 1 |
| erdnis.Rover 0.3 | 4.8 | 10.1% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.1% | 3 |
| mbh.Mbh 0.1 | 7.2 | 7.1% | 0 |
| pac.ABC 2.1 | 7.7 | 7.0% | 1 |
| pbg.R2D2 1.0 | 8.8 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.3 | 22 / 35 | 6438 |
| 2 | 1 | 71.4 | 91.4 | 21 / 35 | 6190 |
| 3 | 1 | 70.0 | 87.9 | 19 / 35 | 5780 |
| 4 | 1 | 71.8 | 92.4 | 22 / 35 | 6177 |
| 5 | 1 | 71.2 | 92.1 | 23 / 35 | 6143 |
| 6 | 1 | 71.0 | 89.5 | 19 / 35 | 6467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 84 | 68% |
| mld.Infinity 2.2 | 60 | 63% |
| krillr.mini.JointStrike 2.0.0 | 11 | 91% |
| erdnis.Rover 0.3 | 8 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 86% |
| pac.ABC 2.1 | 3 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| pedersen.Moron 2.0 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 1213. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 46 | 55% | 117 |
| mld.Infinity 2.2 | 25 | 30% | 21 |
| erdnis.Rover 0.3 | 5 | 6% | 16 |
| krillr.mini.JointStrike 2.0.0 | 4 | 5% | 21 |
| patson.PatsonTestBot 1.0 | 2 | 2% | 8 |
| mbh.Mbh 0.1 | 1 | 1% | 9 |
| pbg.R2D2 1.0 | 1 | 1% | 5 |
| pac.ABC 2.1 | 0 | 0% | 7 |

## Melee bench: F20

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.1 | 96 / 210 | 2.07 | 19.8% | 37519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.8% | 96 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.4% | 49 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.0% | 9 |
| fwb.Nine 1.0.1 | 4.2 | 10.7% | 27 |
| catcat20.Rabbit 0.001 | 4.3 | 10.5% | 21 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.9% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.8% | 8 |
| djdjdj.NanoSkunk10 1.0 | 7.5 | 7.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 87.9 | 13 / 35 | 6025 |
| 2 | 1 | 66.6 | 79.0 | 9 / 35 | 5932 |
| 3 | 1 | 69.8 | 88.6 | 17 / 35 | 6369 |
| 4 | 1 | 70.9 | 91.4 | 21 / 35 | 6202 |
| 5 | 1 | 70.4 | 91.7 | 16 / 35 | 6284 |
| 6 | 1 | 71.3 | 90.2 | 20 / 35 | 6707 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 69 | 70% |
| catcat20.Rabbit 0.001 | 27 | 67% |
| fwb.Nine 1.0.1 | 22 | 18% |
| nz.jdc.nano.GridFu 1.0 | 13 | 77% |
| bayen.nut.Squirrel 1.615 | 11 | 91% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 45 | 39% | 80 |
| fwb.Nine 1.0.1 | 29 | 25% | 28 |
| catcat20.Rabbit 0.001 | 18 | 16% | 34 |
| nz.jdc.nano.GridFu 1.0 | 11 | 9% | 28 |
| bayen.nut.Squirrel 1.615 | 8 | 7% | 16 |
| djdjdj.NanoSkunk10 1.0 | 2 | 2% | 11 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 6 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 87.9 | 94 / 210 | 2.09 | 19.5% | 36904 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.5% | 94 |
| eem.EvBot v4.6.16 | 2.0 | 16.8% | 87 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 4 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 12 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.1% | 2 |
| el.JumpShoot 0.2 | 7.7 | 5.9% | 0 |
| fire219.CatBot 1.0 | 7.8 | 6.2% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.2% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 88.6 | 16 / 35 | 5998 |
| 2 | 1 | 69.5 | 84.1 | 14 / 35 | 6493 |
| 3 | 1 | 70.4 | 87.9 | 17 / 35 | 6114 |
| 4 | 1 | 71.3 | 92.1 | 18 / 35 | 6521 |
| 5 | 1 | 68.7 | 87.3 | 15 / 35 | 5659 |
| 6 | 1 | 69.7 | 87.3 | 14 / 35 | 6119 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 98 | 49% |
| dummy.mini.Scimitar 1.01 | 30 | 87% |
| cf.RiO.RiOx 4.2.1 | 11 | 100% |
| eld.Hmm 1.0 | 7 | 57% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1169. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 68 | 58% | 95 |
| dummy.mini.Scimitar 1.01 | 27 | 23% | 59 |
| cf.RiO.RiOx 4.2.1 | 10 | 9% | 23 |
| eld.Hmm 1.0 | 5 | 4% | 17 |
| oa.weak.BotherBot 0.1 | 3 | 3% | 10 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.4 | 71 / 210 | 2.40 | 18.1% | 34126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.2 | 18.1% | 71 |
| pe.SandboxDT 2.71m | 1.8 | 16.8% | 83 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.3% | 30 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.2% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 8 |
| yk.JahRoslav 1.1 | 6.5 | 7.0% | 0 |
| tad.Dalek98 0.98 | 6.8 | 6.7% | 0 |
| gg.Squaraus 0.6 | 7.7 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.2% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.2 | 9 / 35 | 5601 |
| 2 | 2 | 68.5 | 83.5 | 11 / 35 | 5906 |
| 3 | 1 | 67.6 | 83.5 | 11 / 35 | 5564 |
| 4 | 1 | 70.3 | 90.8 | 17 / 35 | 5947 |
| 5 | 1 | 67.9 | 82.2 | 14 / 35 | 5585 |
| 6 | 1 | 67.5 | 83.2 | 9 / 35 | 5523 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 45 | 36% |
| kvk.HebusLeTroll 0.35 | 42 | 57% |
| jlm.javaDisturbance 0.59 | 25 | 72% |
| bigpete.Stewie 1.0 | 10 | 60% |
| pbg.NinjaX 1.2 | 4 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| yk.JahRoslav 1.1 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 57 | 41% | 78 |
| kvk.HebusLeTroll 0.35 | 46 | 33% | 61 |
| jlm.javaDisturbance 0.59 | 23 | 17% | 39 |
| bigpete.Stewie 1.0 | 10 | 7% | 15 |
| yk.JahRoslav 1.1 | 2 | 1% | 3 |
| tad.Dalek98 0.98 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 0 | 0% | 5 |
| pbg.NinjaX 1.2 | 0 | 0% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.9 | 113 / 210 | 1.82 | 19.7% | 33669 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.7% | 113 |
| pe.SandboxLump 1.52 | 2.0 | 17.6% | 74 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 16 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.0% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.8 | 9.1% | 0 |
| stelo.RamTrackSurfer 1.2 | 6.5 | 8.3% | 1 |
| cw.megas.Blade 0.8 | 6.7 | 8.2% | 0 |
| sample.Walls 1.0 | 7.0 | 7.8% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.0% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 89.2 | 15 / 35 | 5503 |
| 2 | 1 | 71.1 | 92.4 | 22 / 35 | 5590 |
| 3 | 1 | 70.0 | 89.5 | 19 / 35 | 5346 |
| 4 | 1 | 71.1 | 91.7 | 21 / 35 | 5841 |
| 5 | 1 | 70.3 | 89.8 | 15 / 35 | 5562 |
| 6 | 1 | 71.4 | 92.7 | 21 / 35 | 5827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 86 | 50% |
| cre.Karolos 0.32 | 33 | 76% |
| stelo.AreaTargetingBot 1.1 | 19 | 89% |
| stelo.RamTrackSurfer 1.2 | 11 | 91% |
| sample.Walls 1.0 | 11 | 100% |
| cw.megas.Blade 0.8 | 5 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 67 | 68% | 111 |
| cre.Karolos 0.32 | 17 | 17% | 39 |
| stelo.AreaTargetingBot 1.1 | 9 | 9% | 25 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 17 |
| cw.megas.Blade 0.8 | 1 | 1% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 3 |
| sample.Walls 1.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F24

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.9 | 72.6 | 61 / 210 | 3.47 | 15.1% | 25478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.3 | 15.1% | 61 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.5% | 45 |
| florent.XSeries.X2 0.12 | 3.2 | 13.3% | 35 |
| davidalves.Phoenix 0.54 | 3.7 | 12.4% | 37 |
| pedersen.Ugluk 1.1.1 | 4.2 | 11.9% | 24 |
| oog.melee.Corsair 1.0 | 6.0 | 9.6% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 8.2% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.7% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 0 |
| evd.X1 0.01 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.1 | 78.7 | 17 / 35 | 4180 |
| 2 | 2 | 61.6 | 71.7 | 6 / 35 | 4037 |
| 3 | 1 | 62.6 | 71.4 | 11 / 35 | 4253 |
| 4 | 1 | 64.3 | 74.0 | 12 / 35 | 4585 |
| 5 | 2 | 61.8 | 69.2 | 8 / 35 | 4081 |
| 6 | 1 | 61.9 | 70.5 | 7 / 35 | 4342 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 22 | 59% |
| pedersen.Ugluk 1.1.1 | 20 | 80% |
| florent.XSeries.X2 0.12 | 18 | 44% |
| davidalves.Phoenix 0.54 | 14 | 57% |
| stelo.SoJNanoMelee 1.1 | 12 | 92% |
| oog.melee.Corsair 1.0 | 4 | 75% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 24% | 51 |
| florent.XSeries.X2 0.12 | 34 | 23% | 45 |
| davidalves.Phoenix 0.54 | 33 | 22% | 43 |
| pedersen.Ugluk 1.1.1 | 24 | 16% | 33 |
| lunchie.Lunchbox 0.93 | 7 | 5% | 10 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 10 |
| oog.melee.Corsair 1.0 | 6 | 4% | 12 |
| as.FrankTheTank 1.3 | 2 | 1% | 4 |
| evd.X1 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 78.2 | 108 / 210 | 2.96 | 17.2% | 27190 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.2% | 108 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.5% | 22 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.9% | 23 |
| jdw.Hurricane 1.4 | 3.8 | 12.3% | 29 |
| ds.Oo 2.2 | 5.7 | 9.2% | 8 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.2% | 11 |
| awesomeness.Elite 1.0 | 7.5 | 7.3% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.2% | 4 |
| adt.Ar2 1.1 | 8.5 | 6.7% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.8 | 76.2 | 17 / 35 | 4287 |
| 2 | 1 | 67.9 | 81.6 | 20 / 35 | 4918 |
| 3 | 1 | 62.5 | 69.5 | 15 / 35 | 3828 |
| 4 | 1 | 68.1 | 84.4 | 19 / 35 | 5007 |
| 5 | 1 | 69.0 | 87.0 | 24 / 35 | 4968 |
| 6 | 1 | 63.1 | 70.5 | 13 / 35 | 4182 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 37 | 89% |
| jdw.Hurricane 1.4 | 30 | 83% |
| voidious.micro.BlitzBat 1.05 | 27 | 81% |
| ds.Oo 2.2 | 10 | 70% |
| gjr.Cephalosporin 0.1 | 10 | 100% |
| awesomeness.Elite 1.0 | 5 | 100% |
| adt.Ar2 1.1 | 5 | 100% |
| gre.svman4.Morfeas 1.4.1 | 2 | 50% |

Hadur died in 102 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 34 | 33% | 61 |
| jdw.Hurricane 1.4 | 21 | 21% | 45 |
| voidious.micro.BlitzBat 1.05 | 16 | 16% | 36 |
| ds.Oo 2.2 | 12 | 12% | 22 |
| adt.Ar2 1.1 | 7 | 7% | 14 |
| gre.svman4.Morfeas 1.4.1 | 6 | 6% | 11 |
| awesomeness.Elite 1.0 | 4 | 4% | 9 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 9 |
| amk.ChumbaMini 0.2 | 1 | 1% | 3 |

## Melee bench: F26

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 86.3 | 99 / 210 | 2.23 | 19.2% | 37956 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.2% | 99 |
| ak.Fermat 2.0 | 2.0 | 14.9% | 42 |
| shu.nitro.LENIN .T34 | 3.3 | 12.3% | 37 |
| lrem.Spectre 0.4.4 | 4.2 | 11.6% | 13 |
| js.PinBall 1.6 | 4.7 | 10.8% | 7 |
| jaybot.adv.bots.JayBot 2.0 | 6.0 | 9.5% | 9 |
| gh.mini.GrubbmOne 1.0 | 7.3 | 8.1% | 2 |
| fullsail.LaxativeTeaTwo 1.0 | 7.5 | 7.1% | 3 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.6 | 15 / 35 | 6306 |
| 2 | 1 | 70.2 | 87.6 | 16 / 35 | 6400 |
| 3 | 1 | 67.9 | 82.9 | 15 / 35 | 5947 |
| 4 | 1 | 69.2 | 85.4 | 16 / 35 | 6328 |
| 5 | 1 | 69.2 | 84.8 | 15 / 35 | 6259 |
| 6 | 1 | 70.8 | 88.9 | 22 / 35 | 6716 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 48 | 60% |
| shu.nitro.LENIN .T34 | 35 | 66% |
| lrem.Spectre 0.4.4 | 27 | 78% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 46% |
| js.PinBall 1.6 | 12 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| gh.mini.GrubbmOne 1.0 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 44 | 39% | 68 |
| shu.nitro.LENIN .T34 | 26 | 23% | 55 |
| lrem.Spectre 0.4.4 | 13 | 12% | 28 |
| js.PinBall 1.6 | 13 | 12% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 13 | 12% | 18 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 11 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 4 |

## Melee bench: F27

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 80.9 | 94 / 210 | 2.72 | 17.6% | 29566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.6% | 94 |
| mk.Alpha 0.2.1 | 2.7 | 13.5% | 47 |
| wee.Gem 1.8.4 | 3.7 | 11.4% | 34 |
| EH.Eagle 1.0.6 | 4.0 | 11.3% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.5 | 10.6% | 17 |
| techdude.kombat.FlamingKombat 1.5 | 6.2 | 8.8% | 3 |
| joe.ADinosaur 1.0 | 7.0 | 8.4% | 1 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.2% | 6 |
| caimano.Furia_Ceca 0.22 | 8.7 | 7.2% | 2 |
| cs.Grudge 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 85.4 | 15 / 35 | 4318 |
| 2 | 1 | 66.1 | 86.0 | 13 / 35 | 4194 |
| 3 | 1 | 68.1 | 76.5 | 14 / 35 | 6036 |
| 4 | 1 | 66.7 | 71.4 | 15 / 35 | 5970 |
| 5 | 1 | 64.3 | 77.5 | 14 / 35 | 4163 |
| 6 | 1 | 68.6 | 88.6 | 23 / 35 | 4885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 52 | 65% |
| wee.Gem 1.8.4 | 27 | 44% |
| EH.Eagle 1.0.6 | 22 | 91% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 67% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 5 | 100% |
| joe.ADinosaur 1.0 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 50% |

Hadur died in 116 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 33 | 28% | 63 |
| wee.Gem 1.8.4 | 28 | 24% | 42 |
| sheldor.melee.nano.TestMelee 0.1 | 16 | 14% | 31 |
| EH.Eagle 1.0.6 | 11 | 9% | 34 |
| throxbot.ThroxBot 0.1 | 9 | 8% | 12 |
| joe.ADinosaur 1.0 | 9 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 6 | 5% | 6 |
| cs.Grudge 1.0 | 3 | 3% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 1% | 9 |

## Melee bench: F28

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 112 / 210 | 2.06 | 18.9% | 29578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 18.9% | 112 |
| kid.test.NightFox .2 | 2.0 | 16.0% | 59 |
| uji.Antique 1.0 | 3.3 | 11.7% | 16 |
| qohnil.blot.BlotBot 3.61 | 3.7 | 11.0% | 9 |
| pfvicm.Sobieski 7.2.3b | 5.2 | 9.9% | 4 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 4 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.5% | 5 |
| matt.advanced.Katana 1.0 | 8.3 | 6.1% | 1 |
| stelo.PianistNano 1.2 | 9.0 | 5.6% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.3 | 23 / 35 | 5126 |
| 2 | 1 | 68.6 | 89.2 | 20 / 35 | 4954 |
| 3 | 1 | 67.9 | 86.7 | 17 / 35 | 4812 |
| 4 | 1 | 68.2 | 87.9 | 19 / 35 | 4752 |
| 5 | 1 | 68.0 | 85.4 | 15 / 35 | 5088 |
| 6 | 1 | 68.5 | 87.0 | 18 / 35 | 4846 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 90 | 60% |
| uji.Antique 1.0 | 39 | 85% |
| qohnil.blot.BlotBot 3.61 | 16 | 75% |
| amk.ChumbaWumba 0.3 | 6 | 67% |
| pfvicm.Sobieski 7.2.3b | 5 | 60% |
| ahr.ice.Ice 1.0.2 | 3 | 33% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 58 | 59% | 109 |
| uji.Antique 1.0 | 11 | 11% | 37 |
| pfvicm.Sobieski 7.2.3b | 10 | 10% | 13 |
| qohnil.blot.BlotBot 3.61 | 7 | 7% | 20 |
| amk.ChumbaWumba 0.3 | 5 | 5% | 15 |
| ahr.ice.Ice 1.0.2 | 5 | 5% | 6 |
| matt.advanced.Katana 1.0 | 2 | 2% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 2 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 80.4 | 71 / 210 | 2.77 | 17.4% | 29111 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.2 | 17.4% | 71 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 15.9% | 71 |
| deewiant.Anomaly 0.2 | 2.5 | 15.2% | 42 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 11.1% | 13 |
| ph.melee.ArcherME 0.3 | 6.3 | 7.7% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.9% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.5% | 0 |
| ap.Frederick 1.1 | 8.7 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 83.8 | 11 / 35 | 5237 |
| 2 | 1 | 67.9 | 83.8 | 15 / 35 | 4900 |
| 3 | 1 | 65.5 | 75.6 | 9 / 35 | 4513 |
| 4 | 1 | 67.6 | 82.9 | 12 / 35 | 4830 |
| 5 | 1 | 67.1 | 79.4 | 14 / 35 | 4832 |
| 6 | 2 | 66.0 | 76.8 | 10 / 35 | 4799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 42 | 52% |
| deewiant.Anomaly 0.2 | 41 | 56% |
| myl.micro.Troodon 1.10 | 17 | 88% |
| jok.PheonixM 0.1.2 | 11 | 64% |
| DBall.Anarchy 0.1 | 4 | 75% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 797. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 41% | 79 |
| zyx.mega.YersiniaPestis 3.1 | 40 | 29% | 59 |
| jok.PheonixM 0.1.2 | 19 | 14% | 30 |
| myl.micro.Troodon 1.10 | 17 | 12% | 29 |
| DBall.Anarchy 0.1 | 3 | 2% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 1% | 4 |
| jangs.ns51 1.0 | 1 | 1% | 1 |

## Melee bench: F30

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 67.7 | 29 / 210 | 3.90 | 13.8% | 24358 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 2.3 | 14.0% | 50 |
| hadur117.mini.DeiseSR 0.4 | 2.7 | 13.8% | 29 |
| darkcanuck.B26354 1.06 | 3.2 | 13.6% | 51 |
| stelo.PastFuture 2.3.2 | 3.3 | 13.3% | 30 |
| oog.melee.Capulet 1.2 | 3.5 | 13.2% | 39 |
| intruder.PrairieWolf 2.61 | 6.8 | 7.8% | 5 |
| tripphippy.Alice 1.1 | 7.3 | 7.4% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.4% | 6 |
| ntc.Opposite 1.5 | 8.2 | 7.3% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.8 | 70.2 | 4 / 35 | 4291 |
| 2 | 2 | 60.7 | 65.7 | 7 / 35 | 4043 |
| 3 | 4 | 60.1 | 66.7 | 3 / 35 | 4013 |
| 4 | 3 | 60.8 | 68.9 | 4 / 35 | 3999 |
| 5 | 1 | 62.1 | 71.1 | 7 / 35 | 4174 |
| 6 | 4 | 59.7 | 63.8 | 4 / 35 | 3838 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 20 | 30% |
| oog.melee.Capulet 1.2 | 14 | 57% |
| darkcanuck.B26354 1.06 | 13 | 38% |
| stelo.PastFuture 2.3.2 | 13 | 62% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 1 | 100% |

Hadur died in 182 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 50 | 27% | 53 |
| stelo.PastFuture 2.3.2 | 37 | 20% | 46 |
| catcat20.Matcha 0.006 | 32 | 18% | 34 |
| oog.melee.Capulet 1.2 | 27 | 15% | 38 |
| ntc.Opposite 1.5 | 12 | 7% | 12 |
| fowl3628800.LightningBolt 2.6.0 | 10 | 5% | 12 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 9 |
| tripphippy.Alice 1.1 | 6 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F31

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 70.2 | 40 / 210 | 3.69 | 14.3% | 23379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.3% | 94 |
| hadur117.mini.DeiseSR 0.4 | 2.5 | 14.3% | 40 |
| gh.mini.Griezel 0.2 | 3.0 | 13.7% | 47 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 12.6% | 19 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.2% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.9% | 5 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.2% | 1 |
| fm.mammillarias 1.3 | 7.8 | 6.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.2 | 4.9% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 58.5 | 62.5 | 2 / 35 | 3628 |
| 2 | 3 | 60.5 | 66.0 | 8 / 35 | 3749 |
| 3 | 2 | 62.6 | 72.4 | 6 / 35 | 3941 |
| 4 | 2 | 61.3 | 69.5 | 5 / 35 | 3806 |
| 5 | 3 | 61.5 | 70.5 | 7 / 35 | 3727 |
| 6 | 2 | 66.1 | 80.0 | 12 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 35 | 43% |
| gh.mini.Griezel 0.2 | 26 | 35% |
| spinnercat.micro.Tyger 0.1 | 9 | 67% |
| d414.nano.Quantum 1.0.0 | 9 | 89% |
| gh.nano.Grofvuil 0.2 | 2 | 50% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 689. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 55 | 32% | 69 |
| gh.mini.Griezel 0.2 | 46 | 27% | 56 |
| spinnercat.micro.Tyger 0.1 | 27 | 16% | 33 |
| d414.nano.Quantum 1.0.0 | 19 | 11% | 24 |
| gh.nano.Grofvuil 0.2 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 8 |
| fm.mammillarias 1.3 | 5 | 3% | 6 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.4 | 108 / 210 | 2.13 | 18.7% | 31735 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 18.7% | 108 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.8% | 60 |
| apc.botM 3.0 | 3.0 | 12.1% | 28 |
| lxx.ConceptA 0.8 | 4.2 | 10.5% | 4 |
| vjik.UnViolation 1.1 | 5.2 | 9.2% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.8% | 2 |
| panzer.Panzer 0.2 | 7.2 | 7.5% | 0 |
| yk.JahMicro 1.0 | 8.0 | 7.1% | 3 |
| conscience.Electron 1.3g | 8.7 | 6.2% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.0 | 17 / 35 | 4779 |
| 2 | 1 | 69.5 | 90.8 | 20 / 35 | 5624 |
| 3 | 1 | 68.3 | 88.9 | 15 / 35 | 5395 |
| 4 | 1 | 67.7 | 86.7 | 18 / 35 | 5244 |
| 5 | 1 | 69.1 | 89.8 | 19 / 35 | 5639 |
| 6 | 1 | 68.0 | 87.3 | 19 / 35 | 5054 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 82 | 51% |
| apc.botM 3.0 | 27 | 70% |
| lxx.ConceptA 0.8 | 24 | 96% |
| vjik.UnViolation 1.1 | 11 | 82% |
| bayen.UbaMicro 1.4 | 7 | 86% |
| yk.JahMicro 1.0 | 4 | 25% |
| donjezza.Jezza 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 3 | 100% |
| panzer.Panzer 0.2 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 736. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 49 | 47% | 91 |
| apc.botM 3.0 | 17 | 16% | 33 |
| lxx.ConceptA 0.8 | 16 | 15% | 25 |
| vjik.UnViolation 1.1 | 7 | 7% | 32 |
| bayen.UbaMicro 1.4 | 7 | 7% | 10 |
| yk.JahMicro 1.0 | 4 | 4% | 6 |
| panzer.Panzer 0.2 | 2 | 2% | 6 |
| conscience.Electron 1.3g | 2 | 2% | 3 |
| donjezza.Jezza 1.0 | 0 | 0% | 2 |

## Melee bench: F33

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 82.1 | 91 / 210 | 2.61 | 18.2% | 32255 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 18.2% | 91 |
| maribo.Quester 0.3 | 2.0 | 15.2% | 54 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.7 | 12.6% | 24 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.0% | 14 |
| labg.Cataclysm 2.05 | 4.3 | 10.7% | 21 |
| baal.nano.N 1.42 | 6.3 | 8.6% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.3% | 7 |
| sanja.First 0.1 | 8.7 | 5.5% | 0 |
| zyx.micro.Ant 1.1 | 9.0 | 5.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.3 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 81.6 | 15 / 35 | 5606 |
| 2 | 1 | 66.5 | 79.7 | 13 / 35 | 4798 |
| 3 | 1 | 68.6 | 82.9 | 15 / 35 | 6035 |
| 4 | 1 | 66.7 | 80.0 | 15 / 35 | 5092 |
| 5 | 1 | 67.7 | 82.2 | 15 / 35 | 5202 |
| 6 | 1 | 69.0 | 86.0 | 18 / 35 | 5522 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 45 | 51% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 34 | 65% |
| gre.svman4.Leonidas 1.3.2 | 22 | 82% |
| labg.Cataclysm 2.05 | 18 | 61% |
| baal.nano.N 1.42 | 9 | 100% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 78% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 912. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 49 | 40% | 77 |
| gre.svman4.Leonidas 1.3.2 | 23 | 19% | 34 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 17% | 43 |
| labg.Cataclysm 2.05 | 14 | 12% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 8% | 14 |
| baal.nano.N 1.42 | 2 | 2% | 10 |
| zyx.micro.Ant 1.1 | 1 | 1% | 4 |
| sanja.First 0.1 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.0 | 64 / 210 | 2.71 | 17.4% | 33050 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.2 | 17.4% | 64 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 73 |
| kid.Gladiator .7.2 | 2.7 | 16.3% | 53 |
| jcs.Seth 1.8 | 4.3 | 11.2% | 19 |
| tcf.Reach 3 | 4.8 | 10.8% | 2 |
| cli.Dancer 1.1 | 5.8 | 9.1% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 82.5 | 10 / 35 | 5239 |
| 2 | 2 | 66.5 | 75.9 | 8 / 35 | 5316 |
| 3 | 1 | 68.2 | 81.9 | 11 / 35 | 5684 |
| 4 | 1 | 67.7 | 81.6 | 11 / 35 | 5524 |
| 5 | 1 | 68.2 | 80.3 | 14 / 35 | 5804 |
| 6 | 1 | 68.0 | 83.8 | 10 / 35 | 5483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 61 | 46% |
| kid.Gladiator .7.2 | 37 | 51% |
| jcs.Seth 1.8 | 13 | 77% |
| tcf.Reach 3 | 4 | 100% |
| ratosh.Wesco 1.4 | 2 | 50% |
| sample.VelociRobot 1.0 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 894. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 59 | 40% | 80 |
| kid.Gladiator .7.2 | 54 | 37% | 69 |
| tcf.Reach 3 | 14 | 10% | 23 |
| jcs.Seth 1.8 | 11 | 7% | 24 |
| cli.Dancer 1.1 | 4 | 3% | 8 |
| ratosh.Wesco 1.4 | 4 | 3% | 6 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.5 | 24 / 210 | 3.12 | 14.8% | 22786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.5% | 160 |
| hadur117.mini.DeiseSR 0.4 | 2.0 | 14.8% | 24 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.4% | 17 |
| rz.HawkOnFire 0.1 | 4.0 | 11.9% | 3 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.4% | 5 |
| myl.nano.KomoriNinja 1.1 | 6.5 | 6.9% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.7% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.2 | 5.9% | 1 |
| dans.Cinnamon 1.2 | 8.8 | 5.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.3 | 80.6 | 5 / 35 | 4038 |
| 2 | 2 | 64.5 | 79.7 | 6 / 35 | 3917 |
| 3 | 2 | 61.7 | 74.0 | 1 / 35 | 3543 |
| 4 | 2 | 59.9 | 68.6 | 3 / 35 | 3259 |
| 5 | 2 | 63.6 | 77.1 | 3 / 35 | 4171 |
| 6 | 2 | 64.4 | 78.7 | 6 / 35 | 3858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 73 | 11% |
| gh.mini.Gruwel 0.9 | 16 | 56% |
| dmh.robocode.robot.BlackDeath 9.2 | 5 | 60% |
| rz.HawkOnFire 0.1 | 4 | 75% |
| wit.Chuliath 1.0 | 1 | 0% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 187 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 94 | 50% | 100 |
| gh.mini.Gruwel 0.9 | 38 | 20% | 47 |
| rz.HawkOnFire 0.1 | 27 | 14% | 28 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 9% | 20 |
| wit.Chuliath 1.0 | 6 | 3% | 7 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 88.1 | 134 / 210 | 2.07 | 20.2% | 35360 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 20.2% | 134 |
| alpha.RainingFire 1.0 | 2.8 | 11.7% | 20 |
| bzdp.Pansy 2.1 | 3.5 | 11.7% | 17 |
| m3thos.Eva02 0.7.1 | 4.5 | 10.4% | 14 |
| mz.Cork 0.1 | 5.0 | 10.3% | 9 |
| bvh.micro.Freya 0.3 | 5.2 | 10.3% | 11 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.5% | 0 |
| dl.BetterWalls 1.0 | 8.5 | 6.3% | 3 |
| squidM.TentalceMeleeNano 1.1 | 9.2 | 4.9% | 0 |
| sample.MyFirstRobot 1.0 | 9.3 | 4.7% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 91.4 | 26 / 35 | 5910 |
| 2 | 1 | 68.5 | 82.9 | 18 / 35 | 5742 |
| 3 | 1 | 70.6 | 90.2 | 26 / 35 | 5856 |
| 4 | 1 | 70.5 | 90.8 | 22 / 35 | 5936 |
| 5 | 1 | 70.9 | 90.2 | 23 / 35 | 6188 |
| 6 | 1 | 68.5 | 83.5 | 19 / 35 | 5728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 34 | 85% |
| bvh.micro.Freya 0.3 | 28 | 71% |
| mz.Cork 0.1 | 26 | 88% |
| alpha.RainingFire 1.0 | 25 | 64% |
| bvh.mini.Fenrir 0.39 | 23 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 80% |
| dl.BetterWalls 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 5 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 769. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 17 | 22% | 36 |
| bvh.micro.Freya 0.3 | 15 | 20% | 36 |
| bzdp.Pansy 2.1 | 14 | 18% | 46 |
| m3thos.Eva02 0.7.1 | 9 | 12% | 23 |
| mz.Cork 0.1 | 7 | 9% | 29 |
| dl.BetterWalls 1.0 | 7 | 9% | 19 |
| bvh.mini.Fenrir 0.39 | 7 | 9% | 16 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.0 | 170 / 210 | 1.72 | 20.5% | 37048 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 20.5% | 170 |
| germ.TheMind .2 | 3.0 | 10.5% | 12 |
| EBBU.Sim2 1.02 | 3.7 | 10.0% | 2 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.8 | 10.3% | 4 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.8% | 7 |
| agrach.Dalek 1.0 | 6.2 | 8.5% | 4 |
| lmk.ACPFinal 0.1 | 6.3 | 8.6% | 6 |
| mb.Beast 0.1 | 6.8 | 8.3% | 4 |
| skm.Ryubot 1.0 | 9.0 | 7.3% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 7.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.3 | 25 / 35 | 6233 |
| 2 | 1 | 70.5 | 93.3 | 30 / 35 | 6249 |
| 3 | 1 | 70.5 | 95.2 | 30 / 35 | 6017 |
| 4 | 1 | 69.5 | 90.8 | 27 / 35 | 6160 |
| 5 | 1 | 69.9 | 90.2 | 29 / 35 | 6120 |
| 6 | 1 | 70.8 | 95.9 | 29 / 35 | 6269 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 40 | 100% |
| EBBU.Sim2 1.02 | 27 | 96% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 95% |
| skm.Ryubot 1.0 | 20 | 100% |
| agrach.Dalek 1.0 | 19 | 95% |
| stelo.UntouchableNano 1.3 | 18 | 83% |
| lmk.ACPFinal 0.1 | 16 | 94% |
| mb.Beast 0.1 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 476. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 10 | 24% | 28 |
| lmk.ACPFinal 0.1 | 6 | 15% | 17 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 15% | 15 |
| com.syncleus.robocode.Dreadnaught 0.1 | 5 | 12% | 31 |
| agrach.Dalek 1.0 | 4 | 10% | 28 |
| EBBU.Sim2 1.02 | 4 | 10% | 23 |
| mb.Beast 0.1 | 3 | 7% | 22 |
| skm.Ryubot 1.0 | 2 | 5% | 6 |
| germ.TheMind .2 | 1 | 2% | 38 |

## Melee bench: F38

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 74.8 | 65 / 210 | 3.27 | 15.7% | 27224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.5 | 15.9% | 78 |
| hadur117.mini.DeiseSR 0.4 | 1.5 | 15.7% | 65 |
| bvh.mini.Freya 0.55 | 3.7 | 12.1% | 15 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.5 | 11.5% | 10 |
| cs.Wren 1.0 | 4.5 | 11.2% | 14 |
| bts.mega.Gnarly 1.4 | 5.3 | 10.7% | 22 |
| kdf.KoulDestroyer 1.0 | 7.0 | 9.0% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.3 | 5.8% | 1 |
| matt.UnderDark3 2.4.34 | 9.0 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.7 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 74.3 | 12 / 35 | 4609 |
| 2 | 2 | 61.3 | 66.7 | 7 / 35 | 4386 |
| 3 | 1 | 66.3 | 80.6 | 15 / 35 | 4735 |
| 4 | 1 | 64.8 | 75.2 | 14 / 35 | 4565 |
| 5 | 1 | 64.7 | 77.8 | 11 / 35 | 4501 |
| 6 | 2 | 63.6 | 74.3 | 6 / 35 | 4428 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 41 | 56% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 87% |
| bts.mega.Gnarly 1.4 | 14 | 64% |
| cs.Wren 1.0 | 11 | 91% |
| bvh.mini.Freya 0.55 | 8 | 63% |
| kdf.KoulDestroyer 1.0 | 3 | 67% |
| matt.UnderDark3 2.4.34 | 3 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 634. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 30% | 68 |
| bvh.mini.Freya 0.55 | 25 | 17% | 29 |
| bts.mega.Gnarly 1.4 | 23 | 16% | 34 |
| cs.Wren 1.0 | 20 | 14% | 26 |
| kdf.KoulDestroyer 1.0 | 16 | 11% | 19 |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 10% | 31 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 1% | 3 |

## Melee bench: F39

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 78.6 | 61 / 210 | 2.93 | 16.9% | 31985 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.2 | 16.9% | 61 |
| bvh.fry.Freya 0.82 | 1.8 | 15.0% | 43 |
| az.Ololobot 0.2.4 | 3.0 | 13.4% | 60 |
| catcat20.Lambda 0.024 | 4.0 | 11.5% | 31 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.7% | 7 |
| apollokidd.ApolloKidd 0.9 | 6.3 | 8.1% | 1 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.5% | 5 |
| gimp.GimpBot 0.1 | 7.0 | 7.9% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 5.5% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 80.6 | 7 / 35 | 5531 |
| 2 | 1 | 65.6 | 80.6 | 10 / 35 | 5132 |
| 3 | 2 | 63.6 | 72.4 | 8 / 35 | 5326 |
| 4 | 1 | 66.7 | 81.3 | 10 / 35 | 5590 |
| 5 | 1 | 64.5 | 75.6 | 11 / 35 | 4953 |
| 6 | 1 | 67.1 | 81.0 | 15 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 36 | 28% |
| bvh.fry.Freya 0.82 | 31 | 61% |
| catcat20.Lambda 0.024 | 20 | 55% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 86% |
| winamp32.micro.MicroMacro 1.0 | 4 | 75% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 52 | 35% | 68 |
| az.Ololobot 0.2.4 | 39 | 26% | 56 |
| catcat20.Lambda 0.024 | 31 | 21% | 40 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 7% | 10 |
| apollokidd.ApolloKidd 0.9 | 9 | 6% | 10 |
| gimp.GimpBot 0.1 | 4 | 3% | 11 |
| winamp32.micro.MicroMacro 1.0 | 3 | 2% | 11 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.5 | 86 / 210 | 2.66 | 17.9% | 32154 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.2 | 17.9% | 86 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.8% | 66 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.3% | 23 |
| mz.AntiGrav 1.0 | 4.5 | 10.9% | 10 |
| Polkwane.SmashMelee 1.0 | 4.7 | 10.9% | 14 |
| stelo.Randomness 1.0 | 5.7 | 9.4% | 6 |
| alpha.BlackIce 1.0 | 7.0 | 7.9% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.8% | 2 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.4 | 14 / 35 | 5535 |
| 2 | 1 | 67.0 | 79.0 | 16 / 35 | 5342 |
| 3 | 2 | 65.0 | 76.5 | 11 / 35 | 4799 |
| 4 | 1 | 68.6 | 83.2 | 13 / 35 | 5824 |
| 5 | 1 | 69.5 | 87.6 | 20 / 35 | 5613 |
| 6 | 1 | 66.3 | 78.4 | 12 / 35 | 5041 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 43 | 37% |
| kano.gamma.KanoGamma 1.8 | 28 | 75% |
| Polkwane.SmashMelee 1.0 | 23 | 83% |
| mz.AntiGrav 1.0 | 14 | 93% |
| stelo.Randomness 1.0 | 7 | 100% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| alpha.BlackIce 1.0 | 2 | 50% |

Hadur died in 126 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 55 | 44% | 69 |
| kano.gamma.KanoGamma 1.8 | 26 | 21% | 47 |
| mz.AntiGrav 1.0 | 15 | 12% | 27 |
| Polkwane.SmashMelee 1.0 | 10 | 8% | 25 |
| stelo.Randomness 1.0 | 8 | 6% | 15 |
| amk.superstrike.SuperStrike 0.3 | 5 | 4% | 12 |
| alpha.BlackIce 1.0 | 5 | 4% | 8 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 2 |
| sample.Corners 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.4 | 67 / 210 | 2.76 | 16.7% | 27812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.3 | 16.7% | 67 |
| eem.EvBotNG v12.8 | 1.7 | 16.0% | 81 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.6% | 17 |
| ary.Swarm 1.1 | 3.8 | 12.9% | 19 |
| simonton.nano.MeleeSeed 1.8 | 4.5 | 12.0% | 21 |
| shrub.Silver v048 | 6.2 | 8.4% | 3 |
| zyx.nano.Ant 1.1 | 6.8 | 7.5% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 5.8% | 3 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 85.4 | 13 / 35 | 4986 |
| 2 | 2 | 64.9 | 76.5 | 11 / 35 | 4529 |
| 3 | 1 | 65.4 | 81.0 | 11 / 35 | 4091 |
| 4 | 1 | 67.1 | 81.9 | 14 / 35 | 4748 |
| 5 | 2 | 62.8 | 72.7 | 4 / 35 | 4383 |
| 6 | 1 | 68.1 | 85.1 | 14 / 35 | 5075 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 48 | 25% |
| lessonz.robocode.Oz 0.5.0 | 25 | 84% |
| ary.Swarm 1.1 | 22 | 68% |
| simonton.nano.MeleeSeed 1.8 | 19 | 79% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 58 | 40% | 71 |
| ary.Swarm 1.1 | 34 | 23% | 51 |
| simonton.nano.MeleeSeed 1.8 | 22 | 15% | 30 |
| lessonz.robocode.Oz 0.5.0 | 16 | 11% | 29 |
| shrub.Silver v048 | 6 | 4% | 10 |
| zyx.nano.Ant 1.1 | 4 | 3% | 4 |
| stelo.Mirror 1.1 | 2 | 1% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
| jsal.Jsalbot 1.0 | 0 | 0% | 8 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 82.2 | 73 / 210 | 2.60 | 17.6% | 32778 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 17.6% | 73 |
| wompi.Wallaby 5.1 | 2.3 | 15.5% | 67 |
| maribo.mini.MiniQuester 0.1 | 2.8 | 14.1% | 30 |
| ara.Shera 0.88 | 3.8 | 13.4% | 32 |
| amz.NanoClone 1.41 | 5.2 | 9.0% | 3 |
| maribo.IotaCT 1.1 | 6.0 | 7.7% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.4% | 5 |
| stelo.MirrorMicro 1.0 | 8.2 | 5.4% | 1 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.9 | 11 / 35 | 5714 |
| 2 | 1 | 68.0 | 85.1 | 18 / 35 | 5360 |
| 3 | 1 | 64.6 | 75.9 | 10 / 35 | 4792 |
| 4 | 1 | 67.0 | 81.0 | 9 / 35 | 5687 |
| 5 | 1 | 66.7 | 82.2 | 10 / 35 | 5358 |
| 6 | 1 | 69.4 | 86.3 | 15 / 35 | 5867 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 45 | 44% |
| maribo.mini.MiniQuester 0.1 | 40 | 75% |
| ara.Shera 0.88 | 29 | 55% |
| dsw.StaticD 1.0 | 6 | 83% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 870. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 45 | 33% | 71 |
| ara.Shera 0.88 | 40 | 29% | 56 |
| maribo.mini.MiniQuester 0.1 | 38 | 28% | 59 |
| dsw.StaticD 1.0 | 5 | 4% | 9 |
| amz.NanoClone 1.41 | 5 | 4% | 6 |
| maribo.IotaCT 1.1 | 3 | 2% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 2 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 71.9 | 22 / 210 | 3.53 | 14.5% | 25553 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.4% | 149 |
| hadur117.mini.DeiseSR 0.4 | 2.0 | 14.5% | 22 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.7% | 27 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.7% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 11.2% | 4 |
| Krabb.akim2.Akim2 1.1b | 6.0 | 9.7% | 3 |
| mz.NanoGod 2.02 | 7.0 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.8 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 2 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.8 | 71.7 | 3 / 35 | 4472 |
| 2 | 2 | 63.1 | 70.2 | 4 / 35 | 4270 |
| 3 | 2 | 63.2 | 71.7 | 3 / 35 | 4330 |
| 4 | 2 | 64.4 | 74.0 | 6 / 35 | 4356 |
| 5 | 2 | 62.9 | 71.4 | 5 / 35 | 4042 |
| 6 | 2 | 63.3 | 72.4 | 1 / 35 | 4083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 61 | 11% |
| brainfade.melee.Dusk 0.44 | 12 | 50% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 191 of 210 rounds, at a mean tick of 780. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 89 | 47% | 98 |
| brainfade.melee.Dusk 0.44 | 34 | 18% | 40 |
| dummy.micro.Sparrow 2.5 | 25 | 13% | 29 |
| wcsv.melee.EngineerMelee 0.1 | 15 | 8% | 18 |
| Krabb.akim2.Akim2 1.1b | 11 | 6% | 11 |
| mz.NanoGod 2.02 | 8 | 4% | 8 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 85.3 | 95 / 210 | 2.32 | 19.0% | 34684 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.0% | 95 |
| stelo.Liblix 0.3.1 | 2.2 | 15.9% | 79 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.2% | 31 |
| wompi.Quokka 1.6 | 4.0 | 10.2% | 2 |
| jwirde.Gort 2.0 | 5.7 | 8.5% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6.0 | 8.7% | 2 |
| disan.Chair 2.2.0 | 6.7 | 7.7% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.7% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 81.0 | 13 / 35 | 5803 |
| 2 | 1 | 69.0 | 85.4 | 16 / 35 | 5905 |
| 3 | 1 | 69.0 | 84.8 | 16 / 35 | 5822 |
| 4 | 1 | 68.7 | 86.0 | 15 / 35 | 5627 |
| 5 | 1 | 69.7 | 87.6 | 17 / 35 | 5877 |
| 6 | 1 | 69.6 | 87.3 | 18 / 35 | 5650 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 53% |
| tzu.TheArtOfWar 1.2 | 40 | 60% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 90% |
| wompi.Quokka 1.6 | 8 | 100% |
| jwirde.Gort 2.0 | 8 | 100% |
| disan.Chair 2.2.0 | 6 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 57 | 49% | 105 |
| tzu.TheArtOfWar 1.2 | 37 | 32% | 59 |
| wompi.Quokka 1.6 | 8 | 7% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 5% | 8 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 5 |
| jwirde.Gort 2.0 | 2 | 2% | 11 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
| disan.Chair 2.2.0 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 84.4 | 68 / 210 | 2.40 | 19.3% | 37682 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseSR 0.4 | 1.0 | 19.3% | 68 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.3% | 112 |
| jje.BagPuss 1.2 | 3.7 | 10.8% | 4 |
| sul.Lunar 1.1 | 4.5 | 10.1% | 11 |
| myl.nano.Graviton 1.10 | 4.5 | 10.5% | 6 |
| hvilela.HVilela 0.9 | 6.7 | 8.5% | 1 |
| fm.claire 1.7 | 6.7 | 8.6% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.2 | 8.3% | 4 |
| wit.Deep7 2.0 | 8.8 | 6.5% | 4 |
| abud.ThirdRobo 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 80.6 | 12 / 35 | 6225 |
| 2 | 1 | 67.5 | 82.2 | 10 / 35 | 5779 |
| 3 | 1 | 69.2 | 85.4 | 11 / 35 | 6255 |
| 4 | 1 | 69.3 | 88.6 | 12 / 35 | 6117 |
| 5 | 1 | 71.4 | 91.1 | 15 / 35 | 7009 |
| 6 | 1 | 67.3 | 78.4 | 8 / 35 | 6297 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 96 | 14% |
| myl.nano.Graviton 1.10 | 19 | 84% |
| sul.Lunar 1.1 | 13 | 92% |
| jje.BagPuss 1.2 | 11 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 90% |
| fm.claire 1.7 | 4 | 100% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 1480. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 83 | 58% | 0 |
| jje.BagPuss 1.2 | 17 | 12% | 51 |
| myl.nano.Graviton 1.10 | 16 | 11% | 38 |
| fm.claire 1.7 | 10 | 7% | 19 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 6% | 24 |
| sul.Lunar 1.1 | 6 | 4% | 50 |
| hvilela.HVilela 0.9 | 3 | 2% | 12 |
| wit.Deep7 2.0 | 0 | 0% | 13 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

## Melee bench: F46

hadur117.mini.DeiseSR 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.5 | 44 / 210 | 2.84 | 15.9% | 26383 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.1% | 73 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.3% | 74 |
| hadur117.mini.DeiseSR 0.4 | 2.5 | 15.9% | 44 |
| mz.MicroSheep 1.0 | 4.5 | 10.7% | 4 |
| cx.Princess 1.0 | 4.7 | 10.2% | 13 |
| sadoner.killer 0.2 | 5.8 | 8.6% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.5 | 6.3% | 0 |
| arthord.NanoSatanMelee Beta | 7.5 | 6.7% | 1 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.2 | 78.7 | 8 / 35 | 4428 |
| 2 | 2 | 66.1 | 83.8 | 7 / 35 | 4460 |
| 3 | 3 | 66.3 | 82.9 | 9 / 35 | 4687 |
| 4 | 1 | 66.2 | 83.2 | 11 / 35 | 4497 |
| 5 | 3 | 62.4 | 72.7 | 4 / 35 | 4219 |
| 6 | 3 | 62.9 | 75.9 | 5 / 35 | 4092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 57 | 40% |
| rsalesc.melee.Medina 0.4.5 | 30 | 23% |
| cx.Princess 1.0 | 10 | 60% |
| mz.MicroSheep 1.0 | 5 | 100% |
| arthord.NanoSatanMelee Beta | 3 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 77 | 46% | 102 |
| rsalesc.melee.Medina 0.4.5 | 49 | 30% | 58 |
| mz.MicroSheep 1.0 | 12 | 7% | 17 |
| cx.Princess 1.0 | 11 | 7% | 14 |
| sadoner.killer 0.2 | 8 | 5% | 8 |
| arthord.NanoSatanMelee Beta | 7 | 4% | 8 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

