# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.0 | 63 / 210 | 2.35 | 17.0% | 29808 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.2% | 128 |
| hadur117.mini.DeiseR72 0.3 | 2.0 | 17.0% | 63 |
| sgp.JollyNinja 3.53 | 3.7 | 11.7% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.0 | 10.9% | 2 |
| mz.MicroGodMelee 1 | 4.5 | 10.6% | 7 |
| lorneswork.Predator 1.0 | 6.0 | 9.3% | 1 |
| adt.Ar2 1.0 | 6.8 | 7.6% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 1 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.7 | 83.2 | 10 / 35 | 5150 |
| 2 | 2 | 65.0 | 83.2 | 7 / 35 | 4341 |
| 3 | 2 | 66.6 | 85.7 | 11 / 35 | 4541 |
| 4 | 2 | 67.2 | 85.4 | 10 / 35 | 5236 |
| 5 | 2 | 67.8 | 87.0 | 12 / 35 | 5564 |
| 6 | 2 | 66.9 | 85.4 | 13 / 35 | 4976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 106 | 18% |
| sgp.JollyNinja 3.53 | 21 | 90% |
| mz.MicroGodMelee 1 | 9 | 89% |
| simonton.nano.WeekendObsession_Melee 1.0 | 9 | 78% |
| lorneswork.Predator 1.0 | 7 | 86% |
| adt.Ar2 1.0 | 3 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 50% |

Hadur died in 148 of 210 rounds, at a mean tick of 1085. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 99 | 67% | 124 |
| sgp.JollyNinja 3.53 | 20 | 14% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 19 |
| mz.MicroGodMelee 1 | 8 | 5% | 19 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| lorneswork.Predator 1.0 | 2 | 1% | 4 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 4 |
| skm.butterfly 1.0 | 2 | 1% | 3 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 81.3 | 92 / 210 | 2.68 | 17.5% | 30126 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.5% | 92 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 14.5% | 36 |
| pulsar.PulsarMax 0.8.9 | 3.0 | 13.2% | 41 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 11.0% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 4.5 | 10.2% | 15 |
| Noran.BitchingElk 0.054 | 6.8 | 7.8% | 11 |
| sch.Simone 0.3d | 7.0 | 7.9% | 9 |
| stelo.PatternRobot 1.0 | 7.8 | 6.8% | 5 |
| fnc.bandit.Bandit 5.2.0 | 8.3 | 7.0% | 1 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 74.3 | 14 / 35 | 4667 |
| 2 | 1 | 66.0 | 80.6 | 12 / 35 | 5145 |
| 3 | 1 | 66.6 | 81.0 | 14 / 35 | 5186 |
| 4 | 1 | 67.6 | 85.4 | 17 / 35 | 5134 |
| 5 | 1 | 66.9 | 82.5 | 17 / 35 | 4795 |
| 6 | 1 | 67.9 | 84.1 | 18 / 35 | 5199 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 55 | 76% |
| pulsar.PulsarMax 0.8.9 | 30 | 60% |
| lrem.micro.SpikeSoldier 0.4 | 10 | 100% |
| sch.Simone 0.3d | 9 | 78% |
| stelo.PatternRobot 1.0 | 8 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 63% |
| Noran.BitchingElk 0.054 | 6 | 50% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 855. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 30 | 25% | 47 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 24% | 73 |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 11% | 23 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 11% | 18 |
| sch.Simone 0.3d | 10 | 8% | 18 |
| stelo.PatternRobot 1.0 | 10 | 8% | 12 |
| Noran.BitchingElk 0.054 | 6 | 5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 5 |
| fullsail.SweetTea 1.1 | 3 | 3% | 3 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.4 | 155 / 210 | 1.60 | 20.7% | 38817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 20.7% | 155 |
| radnor.DoctorBob 1.42 | 2.5 | 13.3% | 10 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.1% | 14 |
| vuen.Cake 2.51 | 3.5 | 12.6% | 29 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.6% | 0 |
| oa.weak.FlyMk1 0.1 | 7.2 | 6.9% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.7 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.4 | 23 / 35 | 6210 |
| 2 | 1 | 70.0 | 90.8 | 22 / 35 | 6338 |
| 3 | 1 | 72.2 | 95.9 | 29 / 35 | 6733 |
| 4 | 1 | 72.7 | 97.8 | 32 / 35 | 6905 |
| 5 | 1 | 70.7 | 92.1 | 25 / 35 | 6562 |
| 6 | 1 | 69.9 | 92.4 | 24 / 35 | 6069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 68 | 69% |
| kawigi.nano.Lib 1.0 | 63 | 97% |
| radnor.DoctorBob 1.42 | 39 | 97% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| urdos.URDOS 1.3 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 55 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 25 | 45% | 74 |
| radnor.DoctorBob 1.42 | 13 | 24% | 45 |
| kawigi.nano.Lib 1.0 | 11 | 20% | 70 |
| urdos.URDOS 1.3 | 5 | 9% | 9 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| adt.Ar1 2.1 | 0 | 0% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.9 | 29 / 210 | 2.27 | 17.6% | 34981 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 172 |
| hadur117.mini.DeiseR72 0.3 | 2.0 | 17.6% | 29 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.3% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.4% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.1% | 1 |
| css.Delitioner 0.11 | 6.3 | 7.2% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.7 | 3.7% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.3 | 88.9 | 10 / 35 | 6023 |
| 2 | 2 | 68.5 | 86.7 | 4 / 35 | 5794 |
| 3 | 2 | 67.9 | 86.0 | 3 / 35 | 5810 |
| 4 | 2 | 68.7 | 86.7 | 7 / 35 | 6165 |
| 5 | 2 | 66.9 | 81.9 | 1 / 35 | 5825 |
| 6 | 2 | 67.4 | 85.4 | 4 / 35 | 5364 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 158 | 15% |
| apc.LeeroyJenkins2 1.0 | 3 | 33% |
| TNT.TNT 0.99.1 | 3 | 33% |
| spin.Bugstard 0.012b | 2 | 0% |
| sp.Nanos.Ember 1.1 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |

Hadur died in 181 of 210 rounds, at a mean tick of 1367. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 146 | 81% | 171 |
| apc.LeeroyJenkins2 1.0 | 15 | 8% | 16 |
| josago.Jorgito 0.16 | 7 | 4% | 8 |
| TNT.TNT 0.99.1 | 5 | 3% | 7 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| css.Delitioner 0.11 | 2 | 1% | 3 |
| spin.Bugstard 0.012b | 2 | 1% | 0 |
| rampancy.Durandal 2.1d | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.0 | 68.4 | 12 / 210 | 3.85 | 12.8% | 20213 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.1% | 122 |
| justin.DemonicRage 3.4 | 1.8 | 17.5% | 61 |
| wompi.Numbat 2.1 | 3.3 | 12.5% | 6 |
| hadur117.mini.DeiseR72 0.3 | 3.7 | 12.8% | 12 |
| ms.Ares 0.19 | 5.2 | 10.1% | 3 |
| axeBots.HataMoto 3.09 | 5.8 | 8.6% | 6 |
| supersample.SuperBoxBot 1.0 | 7.3 | 5.9% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.8% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 3.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 59.0 | 65.4 | 2 / 35 | 3376 |
| 2 | 4 | 60.2 | 68.3 | 3 / 35 | 3410 |
| 3 | 3 | 61.7 | 73.0 | 2 / 35 | 3684 |
| 4 | 4 | 58.6 | 65.4 | 1 / 35 | 3187 |
| 5 | 4 | 59.0 | 67.0 | 1 / 35 | 3057 |
| 6 | 3 | 61.1 | 71.1 | 3 / 35 | 3499 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 23 | 26% |
| cb.fire.Firestarter 2.0f | 18 | 6% |
| wompi.Numbat 2.1 | 4 | 50% |
| ms.Ares 0.19 | 3 | 67% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 198 of 210 rounds, at a mean tick of 725. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 67 | 34% | 69 |
| justin.DemonicRage 3.4 | 59 | 30% | 65 |
| wompi.Numbat 2.1 | 33 | 17% | 34 |
| ms.Ares 0.19 | 24 | 12% | 26 |
| axeBots.HataMoto 3.09 | 6 | 3% | 7 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| supersample.SuperBoxBot 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 82.8 | 82 / 210 | 2.55 | 17.3% | 28796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.3% | 82 |
| jekl.StoneGhost 0.7 | 2.2 | 14.8% | 33 |
| origin.SleepSiphon 1.7b | 3.0 | 13.7% | 53 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.9% | 25 |
| mld.Wisdom 1.0 | 5.2 | 9.8% | 7 |
| gg.Wolverine 2.0 | 5.7 | 8.8% | 2 |
| spinnercat.Omen 1.0 | 7.5 | 7.1% | 2 |
| DBall.NUKE 0.1 | 8.2 | 6.6% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.3 | 6.6% | 5 |
| sample.Fire 1.0 | 10.0 | 3.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 83.2 | 14 / 35 | 4954 |
| 2 | 1 | 65.9 | 80.6 | 11 / 35 | 4868 |
| 3 | 1 | 66.3 | 82.2 | 16 / 35 | 4638 |
| 4 | 1 | 65.9 | 82.2 | 14 / 35 | 4445 |
| 5 | 1 | 67.3 | 85.4 | 13 / 35 | 5102 |
| 6 | 1 | 66.7 | 83.2 | 14 / 35 | 4789 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 37 | 78% |
| origin.SleepSiphon 1.7b | 36 | 47% |
| pe.minimelee.SandboxMiniMelee 1.1 | 29 | 69% |
| gg.Wolverine 2.0 | 10 | 90% |
| mld.Wisdom 1.0 | 4 | 50% |
| ers.nano.hawk.HawkLA 3.0m | 3 | 67% |
| DBall.NUKE 0.1 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 800. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 38 | 30% | 66 |
| jekl.StoneGhost 0.7 | 38 | 30% | 57 |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 27% | 51 |
| mld.Wisdom 1.0 | 10 | 8% | 16 |
| gg.Wolverine 2.0 | 2 | 2% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 2% | 7 |
| sample.Fire 1.0 | 1 | 1% | 2 |
| spinnercat.Omen 1.0 | 1 | 1% | 1 |
| DBall.NUKE 0.1 | 1 | 1% | 1 |

## Melee bench: F07

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.7 | 114 / 210 | 1.75 | 19.8% | 35861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 19.8% | 114 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.6% | 54 |
| rtk.Tachikoma 1.0 | 2.8 | 16.1% | 27 |
| franzor.Lizt 1.3.1 | 4.5 | 10.7% | 5 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 11.0% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.1% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.8 | 17 / 35 | 6040 |
| 2 | 1 | 72.1 | 92.7 | 20 / 35 | 6326 |
| 3 | 1 | 70.3 | 87.6 | 15 / 35 | 5951 |
| 4 | 1 | 71.7 | 94.6 | 21 / 35 | 5819 |
| 5 | 1 | 70.5 | 90.8 | 16 / 35 | 5755 |
| 6 | 1 | 72.0 | 94.6 | 25 / 35 | 5970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 92 | 80% |
| rsalesc.melee.Monk 0.3.6c | 52 | 19% |
| oog.melee.CapuletDroid 1.1 | 22 | 82% |
| franzor.Lizt 1.3.1 | 11 | 91% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |
| lrem.micro.MoggFanatic 0.2 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1403. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 61 | 63% | 78 |
| rtk.Tachikoma 1.0 | 26 | 27% | 107 |
| oog.melee.CapuletDroid 1.1 | 7 | 7% | 19 |
| lrem.micro.MoggFanatic 0.2 | 1 | 1% | 2 |
| franzor.Lizt 1.3.1 | 1 | 1% | 1 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.5 | 122 / 210 | 2.12 | 18.7% | 29272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.7% | 122 |
| tm.Yuugao 1.0 | 2.3 | 13.4% | 33 |
| shrub.Vapour v159 | 2.7 | 12.8% | 26 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.6% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 5.3 | 9.5% | 5 |
| m3thos.Eva00 1.1 | 6.2 | 8.2% | 2 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 7.9% | 3 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.4% | 1 |
| SHAM.WOW 1.4 | 8.7 | 6.5% | 2 |
| zyx.nano.BacillusComma 1.0 | 9.5 | 5.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.3 | 19 / 35 | 4936 |
| 2 | 1 | 67.9 | 88.6 | 19 / 35 | 4818 |
| 3 | 1 | 67.4 | 84.1 | 21 / 35 | 4813 |
| 4 | 1 | 69.1 | 90.2 | 23 / 35 | 5038 |
| 5 | 1 | 66.6 | 85.1 | 17 / 35 | 4546 |
| 6 | 1 | 68.9 | 89.8 | 23 / 35 | 5121 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 52 | 79% |
| shrub.Vapour v159 | 37 | 73% |
| Krabb.sliNk.Garm 0.9u | 25 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 14 | 86% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 67% |
| SHAM.WOW 1.4 | 6 | 83% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 807. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 25 | 28% | 48 |
| tm.Yuugao 1.0 | 22 | 25% | 77 |
| Krabb.sliNk.Garm 0.9u | 14 | 16% | 24 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 10% | 22 |
| m3thos.Eva00 1.1 | 8 | 9% | 13 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 11 |
| zyx.nano.BacillusComma 1.0 | 4 | 4% | 4 |
| SHAM.WOW 1.4 | 2 | 2% | 10 |

## Melee bench: F09

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 74.9 | 69 / 210 | 3.26 | 15.7% | 25732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.9% | 80 |
| hadur117.mini.DeiseR72 0.3 | 1.7 | 15.7% | 69 |
| kc.micro.Figment 1.0 | 2.8 | 13.2% | 24 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.8% | 20 |
| yagami.Tidus 0.11 | 4.8 | 11.0% | 3 |
| mc2.enemy.Original 0.9 | 5.5 | 9.5% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.3% | 3 |
| step.nanoPri 1.0 | 7.8 | 6.3% | 0 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.7 | 75.9 | 12 / 35 | 3995 |
| 2 | 2 | 64.3 | 74.9 | 11 / 35 | 4528 |
| 3 | 1 | 66.9 | 81.9 | 17 / 35 | 4596 |
| 4 | 2 | 62.1 | 68.9 | 7 / 35 | 4171 |
| 5 | 3 | 61.6 | 67.3 | 9 / 35 | 3797 |
| 6 | 1 | 66.2 | 80.6 | 13 / 35 | 4645 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 52% |
| kc.micro.Figment 1.0 | 20 | 95% |
| mc2.enemy.Original 0.9 | 11 | 64% |
| pedersen.Grishnakh 1.0 | 9 | 67% |
| yagami.Tidus 0.11 | 7 | 100% |
| dft.Calliope 5.6 | 1 | 0% |

Hadur died in 142 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 54 | 38% | 83 |
| yagami.Tidus 0.11 | 27 | 19% | 34 |
| kc.micro.Figment 1.0 | 26 | 18% | 50 |
| mc2.enemy.Original 0.9 | 15 | 11% | 21 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 15 |
| dft.Calliope 5.6 | 3 | 2% | 3 |
| robar.nano.Assertive_Melee 0.2 | 2 | 1% | 2 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.8 | 167 / 210 | 1.56 | 20.2% | 33557 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 20.2% | 167 |
| DTF.Kludgy 1.2b | 2.0 | 13.9% | 18 |
| ne.Chimera 1.2 | 3.5 | 12.1% | 7 |
| ejb.Polaris 1.0.1 | 3.7 | 11.7% | 7 |
| tvv.micro.Antares 1.1.1 | 4.8 | 10.6% | 5 |
| vStar.RAFzilla 2.15 | 6.0 | 9.7% | 3 |
| sam.Samspin 1.0 | 7.7 | 6.0% | 0 |
| kurios.DOSexe .9b | 8.3 | 5.9% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.3 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.2 | 29 / 35 | 5811 |
| 2 | 1 | 70.7 | 93.7 | 28 / 35 | 5577 |
| 3 | 1 | 70.8 | 95.9 | 27 / 35 | 5652 |
| 4 | 1 | 70.7 | 93.3 | 30 / 35 | 5869 |
| 5 | 1 | 69.9 | 92.4 | 26 / 35 | 5420 |
| 6 | 1 | 69.7 | 92.4 | 27 / 35 | 5228 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 58 | 86% |
| ejb.Polaris 1.0.1 | 47 | 94% |
| ne.Chimera 1.2 | 36 | 97% |
| vStar.RAFzilla 2.15 | 16 | 88% |
| tvv.micro.Antares 1.1.1 | 13 | 92% |
| donjezza.Muncho 1.0 | 7 | 86% |
| kurios.DOSexe .9b | 3 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 43 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 20 | 47% | 68 |
| ejb.Polaris 1.0.1 | 9 | 21% | 57 |
| ne.Chimera 1.2 | 7 | 16% | 40 |
| vStar.RAFzilla 2.15 | 2 | 5% | 18 |
| tvv.micro.Antares 1.1.1 | 2 | 5% | 10 |
| donjezza.Muncho 1.0 | 1 | 2% | 6 |
| kurios.DOSexe .9b | 1 | 2% | 6 |
| sam.Samspin 1.0 | 1 | 2% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.2 | 83 / 210 | 2.78 | 16.9% | 28150 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.2% | 68 |
| hadur117.mini.DeiseR72 0.3 | 1.5 | 16.9% | 83 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.1% | 27 |
| djc.DynaBot 0.1.1 | 4.2 | 10.3% | 12 |
| br2.MobyDickBot 1.6 | 5.7 | 9.1% | 8 |
| rdt199.Warlord 0.73 | 6.0 | 8.9% | 4 |
| uji.YellohFellah 1.0 | 6.5 | 8.0% | 7 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.0 | 5.8% | 0 |
| stelo.MirrorNano 1.3 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.2 | 77.8 | 12 / 35 | 4234 |
| 2 | 1 | 68.1 | 87.0 | 17 / 35 | 5081 |
| 3 | 2 | 66.0 | 81.0 | 12 / 35 | 4633 |
| 4 | 2 | 63.4 | 74.0 | 9 / 35 | 4592 |
| 5 | 1 | 66.9 | 83.2 | 17 / 35 | 4697 |
| 6 | 1 | 65.8 | 78.4 | 16 / 35 | 4913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 51 | 61% |
| cx.mini.Nimrod 0.55 | 25 | 80% |
| djc.DynaBot 0.1.1 | 20 | 70% |
| br2.MobyDickBot 1.6 | 9 | 89% |
| uji.YellohFellah 1.0 | 5 | 100% |
| rdt199.Warlord 0.73 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 0% |

Hadur died in 127 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 46% | 93 |
| cx.mini.Nimrod 0.55 | 27 | 21% | 40 |
| djc.DynaBot 0.1.1 | 14 | 11% | 25 |
| rdt199.Warlord 0.73 | 9 | 7% | 15 |
| KiraNL.Chupacabra 0.4 | 6 | 5% | 9 |
| uji.YellohFellah 1.0 | 5 | 4% | 10 |
| br2.MobyDickBot 1.6 | 4 | 3% | 12 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 2 |

## Melee bench: F12

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 83.2 | 114 / 210 | 2.51 | 17.4% | 24812 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.4% | 114 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.4% | 21 |
| nat.PallasHawk 1.0 | 3.0 | 13.2% | 33 |
| darkcanuck.Leon 1.01 | 3.8 | 12.9% | 22 |
| brainfade.melee.Genghis 0.36 | 4.8 | 10.5% | 13 |
| jrm.Test0 1.0 | 6.5 | 7.5% | 1 |
| jp.Perpy 16.0 | 7.2 | 7.0% | 5 |
| cs.sheldor.Talon 1.1 | 7.3 | 7.1% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.6% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 86.3 | 22 / 35 | 4000 |
| 2 | 1 | 65.9 | 82.5 | 16 / 35 | 4069 |
| 3 | 1 | 65.4 | 81.0 | 15 / 35 | 4058 |
| 4 | 1 | 67.8 | 85.1 | 24 / 35 | 4519 |
| 5 | 1 | 66.1 | 80.0 | 19 / 35 | 4132 |
| 6 | 1 | 66.6 | 84.1 | 18 / 35 | 4034 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 41 | 73% |
| bts.wiki.RipCurl 0.9b | 39 | 87% |
| darkcanuck.Leon 1.01 | 37 | 86% |
| brainfade.melee.Genghis 0.36 | 15 | 87% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jp.Perpy 16.0 | 3 | 67% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 96 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 26 | 27% | 55 |
| bts.wiki.RipCurl 0.9b | 22 | 23% | 44 |
| brainfade.melee.Genghis 0.36 | 19 | 20% | 26 |
| darkcanuck.Leon 1.01 | 14 | 15% | 58 |
| jrm.Test0 1.0 | 6 | 6% | 8 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 6 |
| jp.Perpy 16.0 | 3 | 3% | 6 |
| jaybot.bots.Oddball 4.0 | 2 | 2% | 4 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.4 | 52 / 210 | 2.86 | 15.5% | 25929 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.3 | 17.8% | 110 |
| ags.Glacier 0.2.11 | 2.2 | 16.0% | 33 |
| hadur117.mini.DeiseR72 0.3 | 2.5 | 15.5% | 52 |
| shinh.Entangled 0.3 | 4.5 | 11.7% | 11 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.3% | 7 |
| apc.Colossus2 0.17 | 6.0 | 8.0% | 0 |
| stelo.Wang 1.0 | 7.3 | 6.5% | 0 |
| ayk.WallHugger 1.0 | 7.8 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.9 | 82.9 | 11 / 35 | 4171 |
| 2 | 3 | 65.3 | 80.6 | 8 / 35 | 4612 |
| 3 | 3 | 62.3 | 72.7 | 7 / 35 | 3860 |
| 4 | 2 | 65.9 | 82.5 | 11 / 35 | 4723 |
| 5 | 2 | 64.9 | 81.3 | 8 / 35 | 4231 |
| 6 | 3 | 64.1 | 76.2 | 7 / 35 | 4332 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 33% |
| ags.Glacier 0.2.11 | 38 | 63% |
| shinh.Entangled 0.3 | 8 | 63% |
| gh.micro.Gruweltje 0.7 | 3 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 77 | 48% | 100 |
| ags.Glacier 0.2.11 | 43 | 27% | 64 |
| gh.micro.Gruweltje 0.7 | 16 | 10% | 20 |
| shinh.Entangled 0.3 | 16 | 10% | 19 |
| stelo.Wang 1.0 | 4 | 2% | 4 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 92.1 | 149 / 210 | 1.71 | 20.1% | 34181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 20.1% | 149 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.1% | 37 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.8% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 5.2 | 9.6% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.5% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.6% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.9% | 8 |
| pa.Improved 1.0 | 9.0 | 5.3% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 91.7 | 25 / 35 | 5802 |
| 2 | 1 | 70.7 | 92.7 | 26 / 35 | 5460 |
| 3 | 1 | 71.1 | 92.7 | 26 / 35 | 5913 |
| 4 | 1 | 70.3 | 91.4 | 27 / 35 | 5603 |
| 5 | 1 | 69.8 | 91.1 | 22 / 35 | 5556 |
| 6 | 1 | 70.5 | 92.7 | 23 / 35 | 5847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 80 | 85% |
| catcat20.shape.Theta 0.018 | 54 | 89% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 72% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 837. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 32 | 52% | 97 |
| catcat20.shape.Theta 0.018 | 14 | 23% | 54 |
| sheldor.micro.PointInLineRRAL 1.0 | 6 | 10% | 25 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 8% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 6 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 15 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |

## Melee bench: F15

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 82.0 | 100 / 210 | 2.62 | 17.9% | 31992 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.9% | 100 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 29 |
| emp.Yngwie 1.11 | 3.0 | 13.3% | 44 |
| mld.DustBunny 3.8 | 4.0 | 11.9% | 4 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.6% | 12 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.8% | 20 |
| lambdaxy.TBot 0.1 | 7.2 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 7.8 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 77.8 | 11 / 35 | 5209 |
| 2 | 1 | 67.6 | 81.3 | 17 / 35 | 5196 |
| 3 | 1 | 68.8 | 86.0 | 21 / 35 | 5510 |
| 4 | 1 | 68.2 | 84.1 | 18 / 35 | 5534 |
| 5 | 1 | 65.3 | 76.5 | 14 / 35 | 5071 |
| 6 | 1 | 68.5 | 86.0 | 19 / 35 | 5472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 46 | 65% |
| mld.DustBunny 3.8 | 22 | 100% |
| kawigi.micro.Shiz 1.1 | 22 | 100% |
| cb.nano.Insomnia 1.0 | 15 | 73% |
| kawigi.robot.Girl 1.2 | 15 | 87% |
| divineomega.TrialBot 0.003 | 1 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 35 | 32% | 76 |
| kawigi.micro.Shiz 1.1 | 22 | 20% | 42 |
| cb.nano.Insomnia 1.0 | 16 | 14% | 13 |
| mld.DustBunny 3.8 | 15 | 14% | 43 |
| kawigi.robot.Girl 1.2 | 14 | 13% | 22 |
| divineomega.TrialBot 0.003 | 5 | 5% | 7 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 4 |
| lambdaxy.TBot 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F16

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 83.5 | 100 / 210 | 2.48 | 18.5% | 33821 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.2 | 18.5% | 100 |
| gh.Griezel 0.5.2 | 1.8 | 16.6% | 68 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 14.0% | 5 |
| techdude.forest.FlamingForest 1.1 | 4.5 | 10.6% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.4% | 3 |
| tvv.nano.Polaris 1.2 | 5.7 | 8.9% | 6 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.3% | 3 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.4% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 76.5 | 14 / 35 | 5660 |
| 2 | 1 | 66.5 | 79.0 | 15 / 35 | 5040 |
| 3 | 1 | 69.2 | 84.8 | 17 / 35 | 5832 |
| 4 | 1 | 68.6 | 85.7 | 17 / 35 | 5321 |
| 5 | 1 | 70.2 | 88.9 | 20 / 35 | 6098 |
| 6 | 1 | 69.2 | 86.3 | 17 / 35 | 5870 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 75 | 63% |
| techdude.forest.FlamingForest 1.1 | 28 | 68% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 92% |
| bvh.fnr.Fenrir 0.36l | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 7 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1045. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 50 | 45% | 99 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 21 | 19% | 33 |
| bvh.fnr.Fenrir 0.36l | 15 | 14% | 17 |
| techdude.forest.FlamingForest 1.1 | 14 | 13% | 35 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 13 |
| stelo.IntrinsicVolatility 1.4 | 2 | 2% | 8 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 3 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |

## Melee bench: F17

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.9 | 80.7 | 90 / 210 | 2.74 | 17.4% | 31422 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.4% | 90 |
| cx.BlestPain 1.41 | 2.3 | 13.7% | 46 |
| et.Predator 1.8 | 3.3 | 12.7% | 22 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.3% | 25 |
| nic.Nicator 2.4 | 4.5 | 11.5% | 14 |
| ahf.NanoAndrew .4 | 6.0 | 10.5% | 12 |
| maribo.melee.BMV 0.1 | 7.0 | 8.7% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.3% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 79.0 | 18 / 35 | 5126 |
| 2 | 1 | 67.2 | 81.9 | 14 / 35 | 5344 |
| 3 | 1 | 67.7 | 83.5 | 15 / 35 | 5352 |
| 4 | 1 | 67.3 | 82.2 | 18 / 35 | 5076 |
| 5 | 1 | 66.5 | 80.0 | 12 / 35 | 5451 |
| 6 | 1 | 65.7 | 77.5 | 13 / 35 | 5073 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 37 | 84% |
| cx.BlestPain 1.41 | 30 | 40% |
| oog.melee.Mercutio 1.0 | 25 | 68% |
| nic.Nicator 2.4 | 21 | 81% |
| ahf.NanoAndrew .4 | 13 | 92% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 977. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 42 | 35% | 56 |
| oog.melee.Mercutio 1.0 | 22 | 18% | 39 |
| et.Predator 1.8 | 14 | 12% | 46 |
| nic.Nicator 2.4 | 14 | 12% | 27 |
| ahf.NanoAndrew .4 | 11 | 9% | 23 |
| maribo.melee.BMV 0.1 | 11 | 9% | 12 |
| tex.Longbot 0.4 | 5 | 4% | 5 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 89.2 | 134 / 210 | 1.98 | 19.0% | 28578 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 19.0% | 134 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.6% | 28 |
| agd.Mooserwirt2 2.7 | 2.8 | 12.6% | 22 |
| uji.DBH 1.1 | 4.7 | 10.2% | 10 |
| ratosh.Nobo 0.21 | 5.0 | 9.7% | 2 |
| spinnercat.Robovirus 2.718 | 5.7 | 8.9% | 5 |
| sigterm.Sigterm 1.0 | 6.8 | 8.1% | 5 |
| kawigi.mini.Fhqwhgads 1.1 | 8.2 | 6.7% | 1 |
| stelo.WangRobot 1.0 | 9.0 | 6.0% | 4 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.1 | 24 / 35 | 4957 |
| 2 | 1 | 69.1 | 91.4 | 26 / 35 | 4699 |
| 3 | 1 | 69.2 | 92.7 | 24 / 35 | 4681 |
| 4 | 1 | 68.8 | 90.5 | 23 / 35 | 4874 |
| 5 | 1 | 68.4 | 89.2 | 19 / 35 | 4956 |
| 6 | 1 | 65.6 | 80.0 | 18 / 35 | 4411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 65 | 86% |
| agd.Mooserwirt2 2.7 | 33 | 73% |
| ratosh.Nobo 0.21 | 14 | 100% |
| uji.DBH 1.1 | 14 | 71% |
| spinnercat.Robovirus 2.718 | 12 | 83% |
| stelo.WangRobot 1.0 | 9 | 89% |
| sigterm.Sigterm 1.0 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 32 | 42% | 80 |
| agd.Mooserwirt2 2.7 | 14 | 18% | 47 |
| ratosh.Nobo 0.21 | 8 | 10% | 19 |
| uji.DBH 1.1 | 8 | 10% | 15 |
| sigterm.Sigterm 1.0 | 7 | 9% | 15 |
| spinnercat.Robovirus 2.718 | 4 | 5% | 17 |
| stelo.WangRobot 1.0 | 2 | 3% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 1 | 1% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.0 | 175 / 210 | 1.36 | 21.4% | 35541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 21.4% | 175 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.5% | 17 |
| mld.Infinity 2.2 | 2.8 | 13.3% | 14 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.2% | 2 |
| erdnis.Rover 0.3 | 5.0 | 10.2% | 1 |
| patson.PatsonTestBot 1.0 | 6.2 | 8.2% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.1% | 0 |
| pac.ABC 2.1 | 7.5 | 7.0% | 1 |
| pbg.R2D2 1.0 | 9.0 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.5 | 98.7 | 32 / 35 | 6228 |
| 2 | 1 | 73.2 | 98.4 | 32 / 35 | 6186 |
| 3 | 1 | 72.9 | 97.8 | 30 / 35 | 6022 |
| 4 | 1 | 71.3 | 94.3 | 27 / 35 | 5419 |
| 5 | 1 | 71.9 | 94.6 | 28 / 35 | 5768 |
| 6 | 1 | 71.2 | 92.1 | 26 / 35 | 5918 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 90 | 91% |
| mld.Infinity 2.2 | 61 | 90% |
| erdnis.Rover 0.3 | 11 | 100% |
| krillr.mini.JointStrike 2.0.0 | 10 | 100% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 43% | 115 |
| mld.Infinity 2.2 | 12 | 34% | 35 |
| erdnis.Rover 0.3 | 3 | 9% | 17 |
| krillr.mini.JointStrike 2.0.0 | 2 | 6% | 15 |
| patson.PatsonTestBot 1.0 | 2 | 6% | 9 |
| pbg.R2D2 1.0 | 1 | 3% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pac.ABC 2.1 | 0 | 0% | 2 |

## Melee bench: F20

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.1 | 120 / 210 | 2.07 | 19.7% | 36056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 19.7% | 120 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 41 |
| catcat20.Rabbit 0.001 | 3.8 | 11.0% | 20 |
| nz.jdc.nano.GridFu 1.0 | 3.8 | 11.3% | 9 |
| fwb.Nine 1.0.1 | 4.3 | 11.1% | 19 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.1% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.3% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.0% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 20 / 35 | 5953 |
| 2 | 1 | 69.0 | 85.7 | 16 / 35 | 6119 |
| 3 | 1 | 68.8 | 84.1 | 19 / 35 | 5913 |
| 4 | 1 | 69.5 | 88.3 | 19 / 35 | 5821 |
| 5 | 1 | 70.2 | 89.8 | 22 / 35 | 5929 |
| 6 | 1 | 71.2 | 91.7 | 24 / 35 | 6321 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 59 | 63% |
| fwb.Nine 1.0.1 | 36 | 78% |
| catcat20.Rabbit 0.001 | 30 | 77% |
| nz.jdc.nano.GridFu 1.0 | 22 | 82% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1070. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 38 | 42% | 69 |
| fwb.Nine 1.0.1 | 18 | 20% | 20 |
| catcat20.Rabbit 0.001 | 17 | 19% | 49 |
| nz.jdc.nano.GridFu 1.0 | 7 | 8% | 42 |
| bayen.nut.Squirrel 1.615 | 6 | 7% | 14 |
| m3thos.mini.Eva01 0.5.5 | 3 | 3% | 8 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.8 | 134 / 210 | 1.65 | 20.5% | 35817 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 20.5% | 134 |
| eem.EvBot v4.6.16 | 2.2 | 16.1% | 55 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.0% | 12 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 3 |
| oa.weak.BotherBot 0.1 | 5.2 | 8.4% | 3 |
| eld.Hmm 1.0 | 6.0 | 8.0% | 2 |
| fire219.CatBot 1.0 | 7.0 | 6.5% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.7% | 1 |
| PSW.Relentless 0.1 | 8.7 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.0 | 23 / 35 | 6238 |
| 2 | 1 | 70.2 | 88.6 | 21 / 35 | 5846 |
| 3 | 1 | 71.2 | 94.0 | 23 / 35 | 5992 |
| 4 | 1 | 71.4 | 94.6 | 26 / 35 | 6025 |
| 5 | 1 | 70.1 | 92.1 | 19 / 35 | 5649 |
| 6 | 1 | 71.3 | 93.3 | 22 / 35 | 6067 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 107 | 68% |
| dummy.mini.Scimitar 1.01 | 37 | 86% |
| cf.RiO.RiOx 4.2.1 | 17 | 100% |
| eld.Hmm 1.0 | 8 | 88% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| el.JumpShoot 0.2 | 2 | 50% |

Hadur died in 76 of 210 rounds, at a mean tick of 1246. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 40 | 53% | 89 |
| dummy.mini.Scimitar 1.01 | 15 | 20% | 60 |
| cf.RiO.RiOx 4.2.1 | 13 | 17% | 29 |
| oa.weak.BotherBot 0.1 | 4 | 5% | 10 |
| el.JumpShoot 0.2 | 2 | 3% | 2 |
| eld.Hmm 1.0 | 1 | 1% | 18 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |

## Melee bench: F22

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.8 | 92 / 210 | 2.37 | 18.0% | 31831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.0% | 92 |
| pe.SandboxDT 2.71m | 2.2 | 15.8% | 45 |
| kvk.HebusLeTroll 0.35 | 3.0 | 15.1% | 47 |
| jlm.javaDisturbance 0.59 | 3.8 | 13.1% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.2% | 5 |
| tad.Dalek98 0.98 | 6.5 | 6.5% | 1 |
| yk.JahRoslav 1.1 | 6.8 | 6.8% | 0 |
| gg.Squaraus 0.6 | 7.7 | 5.9% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 88.9 | 16 / 35 | 5453 |
| 2 | 1 | 67.2 | 81.0 | 14 / 35 | 5252 |
| 3 | 1 | 68.7 | 87.0 | 17 / 35 | 5135 |
| 4 | 1 | 68.6 | 87.9 | 17 / 35 | 5228 |
| 5 | 1 | 67.6 | 83.8 | 14 / 35 | 5136 |
| 6 | 1 | 67.2 | 80.3 | 14 / 35 | 5627 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 54 | 69% |
| pe.SandboxDT 2.71m | 37 | 51% |
| jlm.javaDisturbance 0.59 | 33 | 73% |
| bigpete.Stewie 1.0 | 8 | 75% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 40 | 34% | 69 |
| kvk.HebusLeTroll 0.35 | 40 | 34% | 67 |
| jlm.javaDisturbance 0.59 | 27 | 23% | 47 |
| bigpete.Stewie 1.0 | 7 | 6% | 12 |
| tad.Dalek98 0.98 | 3 | 3% | 4 |
| pbg.NinjaX 1.2 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 0 | 0% | 5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 90.5 | 124 / 210 | 1.86 | 19.2% | 30509 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.2 | 19.2% | 124 |
| pe.SandboxLump 1.52 | 1.8 | 18.2% | 63 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 10 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.8% | 8 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.2% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.0 | 8.5% | 0 |
| sample.Walls 1.0 | 7.2 | 7.8% | 0 |
| cw.megas.Blade 0.8 | 7.3 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 2.9% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 90.2 | 22 / 35 | 4642 |
| 2 | 1 | 70.1 | 88.9 | 20 / 35 | 5422 |
| 3 | 1 | 71.6 | 94.6 | 24 / 35 | 5466 |
| 4 | 1 | 70.3 | 90.8 | 20 / 35 | 5245 |
| 5 | 1 | 70.0 | 91.1 | 20 / 35 | 5012 |
| 6 | 2 | 68.7 | 87.3 | 18 / 35 | 4722 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 115 | 69% |
| cre.Karolos 0.32 | 24 | 88% |
| stelo.AreaTargetingBot 1.1 | 15 | 87% |
| sample.Walls 1.0 | 6 | 100% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 814. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 60 | 70% | 131 |
| cre.Karolos 0.32 | 13 | 15% | 39 |
| stelo.AreaTargetingBot 1.1 | 7 | 8% | 17 |
| stelo.RamTrackSurfer 1.2 | 3 | 3% | 9 |
| cw.megas.Blade 0.8 | 3 | 3% | 3 |
| sample.Walls 1.0 | 0 | 0% | 5 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |
| cli.WasteOfAmmo 1.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 72.9 | 59 / 210 | 3.44 | 14.8% | 23816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.3 | 14.8% | 59 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.6% | 38 |
| florent.XSeries.X2 0.12 | 3.0 | 13.6% | 31 |
| davidalves.Phoenix 0.54 | 3.3 | 13.1% | 48 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.2% | 25 |
| oog.melee.Corsair 1.0 | 6.3 | 9.1% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.5% | 5 |
| lunchie.Lunchbox 0.93 | 8.5 | 6.0% | 1 |
| as.FrankTheTank 1.3 | 8.8 | 5.1% | 0 |
| evd.X1 0.01 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 68.3 | 10 / 35 | 3982 |
| 2 | 1 | 62.6 | 71.1 | 14 / 35 | 3749 |
| 3 | 1 | 62.7 | 74.3 | 7 / 35 | 4043 |
| 4 | 1 | 63.0 | 75.6 | 8 / 35 | 3910 |
| 5 | 1 | 64.1 | 77.1 | 13 / 35 | 4102 |
| 6 | 1 | 61.7 | 71.1 | 7 / 35 | 4030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 26 | 50% |
| florent.XSeries.X2 0.12 | 22 | 55% |
| rz.GlowBlowMelee 1.4 | 17 | 65% |
| pedersen.Ugluk 1.1.1 | 13 | 62% |
| stelo.SoJNanoMelee 1.1 | 11 | 100% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 36 | 23% | 43 |
| florent.XSeries.X2 0.12 | 35 | 23% | 51 |
| davidalves.Phoenix 0.54 | 34 | 22% | 47 |
| pedersen.Ugluk 1.1.1 | 31 | 20% | 40 |
| oog.melee.Corsair 1.0 | 7 | 5% | 13 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 8 |
| as.FrankTheTank 1.3 | 4 | 3% | 4 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 3 |
| evd.X1 0.01 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 81.9 | 125 / 210 | 2.63 | 17.9% | 26932 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.9% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.8% | 32 |
| jdw.Hurricane 1.4 | 3.2 | 11.9% | 16 |
| voidious.micro.BlitzBat 1.05 | 3.5 | 12.8% | 17 |
| gre.svman4.Morfeas 1.4.1 | 4.8 | 10.1% | 10 |
| ds.Oo 2.2 | 6.2 | 8.3% | 4 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.8% | 5 |
| adt.Ar2 1.1 | 7.8 | 7.2% | 1 |
| awesomeness.Elite 1.0 | 8.2 | 7.0% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.9 | 19 / 35 | 4284 |
| 2 | 1 | 66.8 | 81.6 | 20 / 35 | 4476 |
| 3 | 1 | 66.4 | 79.0 | 23 / 35 | 4288 |
| 4 | 1 | 69.8 | 89.8 | 23 / 35 | 4869 |
| 5 | 1 | 66.5 | 79.0 | 20 / 35 | 4487 |
| 6 | 1 | 66.5 | 80.0 | 20 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 47 | 87% |
| voidious.micro.BlitzBat 1.05 | 41 | 90% |
| jdw.Hurricane 1.4 | 25 | 100% |
| awesomeness.Elite 1.0 | 7 | 100% |
| gre.svman4.Morfeas 1.4.1 | 7 | 43% |
| adt.Ar2 1.1 | 5 | 100% |
| ds.Oo 2.2 | 4 | 100% |
| gjr.Cephalosporin 0.1 | 2 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 543. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 24 | 28% | 53 |
| voidious.mini.BrokenSword 2.0.3 | 22 | 26% | 61 |
| jdw.Hurricane 1.4 | 10 | 12% | 31 |
| gre.svman4.Morfeas 1.4.1 | 10 | 12% | 15 |
| ds.Oo 2.2 | 7 | 8% | 21 |
| adt.Ar2 1.1 | 4 | 5% | 8 |
| amk.ChumbaMini 0.2 | 4 | 5% | 7 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 9 |
| awesomeness.Elite 1.0 | 1 | 1% | 5 |

## Melee bench: F26

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.2 | 104 / 210 | 2.42 | 18.2% | 33654 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.2% | 104 |
| ak.Fermat 2.0 | 2.5 | 13.6% | 30 |
| shu.nitro.LENIN .T34 | 3.2 | 13.1% | 37 |
| lrem.Spectre 0.4.4 | 3.5 | 12.3% | 19 |
| js.PinBall 1.6 | 5.7 | 10.5% | 8 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 9.5% | 3 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.5% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 7.1% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.5% | 1 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.5 | 21 / 35 | 6076 |
| 2 | 1 | 67.0 | 79.4 | 16 / 35 | 5534 |
| 3 | 1 | 69.2 | 87.0 | 20 / 35 | 5820 |
| 4 | 1 | 66.0 | 80.0 | 14 / 35 | 5210 |
| 5 | 1 | 67.0 | 79.0 | 14 / 35 | 5529 |
| 6 | 1 | 69.2 | 89.2 | 19 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| lrem.Spectre 0.4.4 | 44 | 80% |
| shu.nitro.LENIN .T34 | 39 | 69% |
| ak.Fermat 2.0 | 32 | 78% |
| js.PinBall 1.6 | 7 | 71% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 67% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 106 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 30 | 28% | 64 |
| lrem.Spectre 0.4.4 | 25 | 24% | 45 |
| ak.Fermat 2.0 | 21 | 20% | 46 |
| jaybot.adv.bots.JayBot 2.0 | 11 | 10% | 21 |
| js.PinBall 1.6 | 9 | 8% | 16 |
| gh.mini.GrubbmOne 1.0 | 5 | 5% | 9 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 1 |

## Melee bench: F27

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.8 | 140 / 210 | 2.00 | 19.0% | 28886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 19.0% | 140 |
| mk.Alpha 0.2.1 | 2.2 | 13.6% | 34 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 10.7% | 7 |
| EH.Eagle 1.0.6 | 4.2 | 10.5% | 4 |
| wee.Gem 1.8.4 | 4.3 | 10.8% | 20 |
| techdude.kombat.FlamingKombat 1.5 | 5.8 | 9.3% | 1 |
| throxbot.ThroxBot 0.1 | 7.7 | 7.6% | 2 |
| joe.ADinosaur 1.0 | 7.8 | 7.4% | 2 |
| caimano.Furia_Ceca 0.22 | 9.0 | 5.8% | 0 |
| cs.Grudge 1.0 | 9.0 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 90.2 | 23 / 35 | 4909 |
| 2 | 1 | 68.1 | 87.9 | 23 / 35 | 4575 |
| 3 | 1 | 68.2 | 87.6 | 24 / 35 | 4595 |
| 4 | 1 | 69.5 | 91.1 | 23 / 35 | 5177 |
| 5 | 1 | 69.5 | 91.4 | 27 / 35 | 4921 |
| 6 | 1 | 67.4 | 84.8 | 20 / 35 | 4709 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 66 | 83% |
| wee.Gem 1.8.4 | 29 | 69% |
| sheldor.melee.nano.TestMelee 0.1 | 27 | 93% |
| techdude.kombat.FlamingKombat 1.5 | 18 | 100% |
| EH.Eagle 1.0.6 | 14 | 93% |
| throxbot.ThroxBot 0.1 | 8 | 88% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 831. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 26 | 37% | 83 |
| wee.Gem 1.8.4 | 16 | 23% | 43 |
| throxbot.ThroxBot 0.1 | 11 | 16% | 16 |
| sheldor.melee.nano.TestMelee 0.1 | 8 | 11% | 34 |
| EH.Eagle 1.0.6 | 4 | 6% | 13 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 14 |
| joe.ADinosaur 1.0 | 2 | 3% | 4 |
| caimano.Furia_Ceca 0.22 | 0 | 0% | 1 |
| cs.Grudge 1.0 | 0 | 0% | 1 |

## Melee bench: F28

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 93.4 | 148 / 210 | 1.60 | 19.9% | 28760 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 19.9% | 148 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 32 |
| uji.Antique 1.0 | 3.2 | 12.0% | 17 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.9% | 9 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.2% | 2 |
| amk.ChumbaWumba 0.3 | 6.7 | 7.7% | 1 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.4% | 1 |
| matt.advanced.Katana 1.0 | 7.8 | 6.2% | 0 |
| stelo.PianistNano 1.2 | 9.2 | 5.8% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 94.3 | 24 / 35 | 4724 |
| 2 | 1 | 69.7 | 93.0 | 25 / 35 | 4780 |
| 3 | 1 | 70.6 | 95.9 | 28 / 35 | 4801 |
| 4 | 1 | 69.0 | 89.5 | 21 / 35 | 5049 |
| 5 | 1 | 70.2 | 95.6 | 26 / 35 | 4597 |
| 6 | 1 | 69.5 | 92.1 | 24 / 35 | 4809 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 93 | 78% |
| uji.Antique 1.0 | 41 | 85% |
| qohnil.blot.BlotBot 3.61 | 20 | 80% |
| pfvicm.Sobieski 7.2.3b | 7 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| matt.advanced.Katana 1.0 | 5 | 100% |
| amk.ChumbaWumba 0.3 | 4 | 100% |
| stelo.PianistNano 1.2 | 2 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 36 | 58% | 104 |
| uji.Antique 1.0 | 13 | 21% | 49 |
| qohnil.blot.BlotBot 3.61 | 6 | 10% | 25 |
| pfvicm.Sobieski 7.2.3b | 4 | 6% | 9 |
| ahr.ice.Ice 1.0.2 | 2 | 3% | 10 |
| stelo.PianistNano 1.2 | 1 | 2% | 2 |
| matt.advanced.Katana 1.0 | 0 | 0% | 8 |
| amk.ChumbaWumba 0.3 | 0 | 0% | 3 |

## Melee bench: F29

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 84.9 | 106 / 210 | 2.36 | 18.6% | 30718 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.6% | 106 |
| zyx.mega.YersiniaPestis 3.1 | 2.3 | 14.8% | 53 |
| deewiant.Anomaly 0.2 | 2.7 | 14.4% | 32 |
| myl.micro.Troodon 1.10 | 4.2 | 11.9% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.8% | 7 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.1% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.3 | 6.2% | 0 |
| DBall.Anarchy 0.1 | 7.8 | 5.8% | 3 |
| jangs.ns51 1.0 | 9.2 | 4.7% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 86.3 | 17 / 35 | 5122 |
| 2 | 1 | 69.6 | 86.3 | 22 / 35 | 5217 |
| 3 | 1 | 68.1 | 86.0 | 18 / 35 | 4687 |
| 4 | 1 | 67.7 | 81.6 | 16 / 35 | 4943 |
| 5 | 1 | 69.1 | 85.7 | 18 / 35 | 5453 |
| 6 | 1 | 68.2 | 83.5 | 15 / 35 | 5296 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 57 | 79% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 61% |
| myl.micro.Troodon 1.10 | 20 | 95% |
| jok.PheonixM 0.1.2 | 7 | 86% |
| ap.Frederick 1.1 | 2 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| ph.melee.ArcherME 0.3 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 34 | 33% | 82 |
| zyx.mega.YersiniaPestis 3.1 | 32 | 31% | 56 |
| myl.micro.Troodon 1.10 | 20 | 19% | 38 |
| jok.PheonixM 0.1.2 | 13 | 13% | 21 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 3 |

## Melee bench: F30

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.4 | 70.4 | 47 / 210 | 3.66 | 14.1% | 23181 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| catcat20.Matcha 0.006 | 1.8 | 14.0% | 52 |
| hadur117.mini.DeiseR72 0.3 | 2.2 | 14.1% | 47 |
| darkcanuck.B26354 1.06 | 3.2 | 13.3% | 38 |
| oog.melee.Capulet 1.2 | 3.7 | 13.3% | 29 |
| stelo.PastFuture 2.3.2 | 4.2 | 12.4% | 30 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.7% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.2 | 7.8% | 5 |
| ntc.Opposite 1.5 | 7.3 | 7.7% | 2 |
| tripphippy.Alice 1.1 | 9.0 | 5.9% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.0 | 71.7 | 7 / 35 | 3913 |
| 2 | 2 | 62.4 | 73.0 | 9 / 35 | 4015 |
| 3 | 4 | 59.3 | 66.7 | 4 / 35 | 3556 |
| 4 | 1 | 62.3 | 72.4 | 10 / 35 | 3920 |
| 5 | 1 | 61.6 | 70.5 | 9 / 35 | 4020 |
| 6 | 3 | 60.6 | 68.3 | 8 / 35 | 3757 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 25 | 40% |
| oog.melee.Capulet 1.2 | 16 | 75% |
| darkcanuck.B26354 1.06 | 16 | 56% |
| stelo.PastFuture 2.3.2 | 9 | 67% |
| fowl3628800.LightningBolt 2.6.0 | 6 | 83% |
| intruder.PrairieWolf 2.61 | 4 | 75% |
| tripphippy.Alice 1.1 | 2 | 100% |
| ntc.Opposite 1.5 | 1 | 0% |

Hadur died in 163 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 25% | 51 |
| catcat20.Matcha 0.006 | 32 | 20% | 45 |
| stelo.PastFuture 2.3.2 | 32 | 20% | 37 |
| oog.melee.Capulet 1.2 | 31 | 19% | 45 |
| intruder.PrairieWolf 2.61 | 11 | 7% | 14 |
| fowl3628800.LightningBolt 2.6.0 | 6 | 4% | 7 |
| ntc.Opposite 1.5 | 5 | 3% | 6 |
| tripphippy.Alice 1.1 | 5 | 3% | 5 |

## Melee bench: F31

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 72.2 | 44 / 210 | 3.50 | 14.3% | 22092 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.2% | 112 |
| hadur117.mini.DeiseR72 0.3 | 2.0 | 14.3% | 44 |
| gh.mini.Griezel 0.2 | 3.5 | 13.2% | 36 |
| spinnercat.micro.Tyger 0.1 | 3.8 | 11.7% | 7 |
| d414.nano.Quantum 1.0.0 | 4.7 | 10.8% | 9 |
| gh.nano.Grofvuil 0.2 | 6.2 | 9.0% | 2 |
| timmit.nano.TimDog 0.33 | 7.0 | 7.1% | 1 |
| fm.mammillarias 1.3 | 7.8 | 5.7% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 5.1% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.2 | 74.9 | 11 / 35 | 3871 |
| 2 | 2 | 61.7 | 70.5 | 6 / 35 | 3814 |
| 3 | 2 | 59.8 | 66.7 | 6 / 35 | 3408 |
| 4 | 2 | 63.2 | 75.2 | 7 / 35 | 3824 |
| 5 | 2 | 61.4 | 71.7 | 6 / 35 | 3605 |
| 6 | 2 | 62.1 | 74.0 | 8 / 35 | 3570 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 40 | 43% |
| gh.mini.Griezel 0.2 | 22 | 50% |
| spinnercat.micro.Tyger 0.1 | 11 | 82% |
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| timmit.nano.TimDog 0.33 | 1 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 167 of 210 rounds, at a mean tick of 727. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 32% | 74 |
| gh.mini.Griezel 0.2 | 50 | 30% | 63 |
| d414.nano.Quantum 1.0.0 | 22 | 13% | 26 |
| spinnercat.micro.Tyger 0.1 | 22 | 13% | 25 |
| timmit.nano.TimDog 0.33 | 6 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 7 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 2 | 1% | 3 |
| fm.mammillarias 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.9 | 124 / 210 | 2.00 | 18.9% | 30528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.9% | 124 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.5% | 47 |
| apc.botM 3.0 | 3.7 | 11.0% | 22 |
| lxx.ConceptA 0.8 | 3.7 | 10.7% | 2 |
| vjik.UnViolation 1.1 | 4.8 | 9.7% | 6 |
| bayen.UbaMicro 1.4 | 6.0 | 8.7% | 2 |
| panzer.Panzer 0.2 | 6.8 | 7.7% | 1 |
| yk.JahMicro 1.0 | 8.2 | 6.8% | 4 |
| conscience.Electron 1.3g | 9.0 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 82.9 | 14 / 35 | 4775 |
| 2 | 1 | 69.2 | 92.4 | 23 / 35 | 4962 |
| 3 | 1 | 68.3 | 86.7 | 21 / 35 | 5398 |
| 4 | 1 | 69.6 | 92.4 | 24 / 35 | 5422 |
| 5 | 1 | 68.1 | 87.6 | 21 / 35 | 4971 |
| 6 | 1 | 68.8 | 91.7 | 21 / 35 | 5000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 83 | 61% |
| lxx.ConceptA 0.8 | 24 | 96% |
| apc.botM 3.0 | 22 | 59% |
| vjik.UnViolation 1.1 | 13 | 100% |
| panzer.Panzer 0.2 | 9 | 100% |
| bayen.UbaMicro 1.4 | 7 | 100% |
| yk.JahMicro 1.0 | 4 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 53% | 102 |
| apc.botM 3.0 | 17 | 20% | 34 |
| lxx.ConceptA 0.8 | 12 | 14% | 25 |
| vjik.UnViolation 1.1 | 3 | 3% | 26 |
| bayen.UbaMicro 1.4 | 3 | 3% | 9 |
| panzer.Panzer 0.2 | 2 | 2% | 7 |
| donjezza.Jezza 1.0 | 2 | 2% | 5 |
| yk.JahMicro 1.0 | 1 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.1 | 117 / 210 | 2.34 | 18.7% | 31345 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.7% | 117 |
| maribo.Quester 0.3 | 2.0 | 15.5% | 40 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.1% | 15 |
| gre.svman4.Leonidas 1.3.2 | 3.8 | 11.4% | 11 |
| labg.Cataclysm 2.05 | 5.0 | 10.6% | 19 |
| baal.nano.N 1.42 | 6.3 | 8.4% | 1 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 7 |
| zyx.micro.Ant 1.1 | 8.3 | 5.5% | 0 |
| sanja.First 0.1 | 9.2 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 86.3 | 19 / 35 | 5122 |
| 2 | 1 | 69.9 | 89.5 | 21 / 35 | 5516 |
| 3 | 1 | 66.4 | 78.7 | 17 / 35 | 4920 |
| 4 | 1 | 67.2 | 80.3 | 17 / 35 | 5150 |
| 5 | 1 | 68.9 | 86.3 | 19 / 35 | 5342 |
| 6 | 1 | 69.9 | 89.2 | 24 / 35 | 5295 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 46 | 85% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 85% |
| gre.svman4.Leonidas 1.3.2 | 32 | 91% |
| labg.Cataclysm 2.05 | 12 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 88% |
| baal.nano.N 1.42 | 4 | 100% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 851. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 36 | 38% | 78 |
| labg.Cataclysm 2.05 | 18 | 19% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 15 | 16% | 43 |
| gre.svman4.Leonidas 1.3.2 | 13 | 14% | 36 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 8% | 12 |
| zyx.micro.Ant 1.1 | 3 | 3% | 4 |
| baal.nano.N 1.42 | 1 | 1% | 6 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |
| sanja.First 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F34

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 84.0 | 82 / 210 | 2.44 | 17.5% | 30272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.3 | 17.5% | 82 |
| stelo.Spread 0.9 | 2.2 | 16.5% | 63 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 41 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 15 |
| tcf.Reach 3 | 4.5 | 11.1% | 6 |
| cli.Dancer 1.1 | 6.0 | 9.5% | 2 |
| ratosh.Wesco 1.4 | 7.0 | 6.9% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.0% | 0 |
| sample.VelociRobot 1.0 | 9.5 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.5 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 79.7 | 9 / 35 | 4985 |
| 2 | 1 | 68.1 | 84.8 | 15 / 35 | 5200 |
| 3 | 1 | 67.6 | 83.5 | 16 / 35 | 4776 |
| 4 | 1 | 68.2 | 86.7 | 15 / 35 | 4907 |
| 5 | 2 | 66.9 | 82.5 | 10 / 35 | 5120 |
| 6 | 1 | 69.2 | 87.0 | 17 / 35 | 5284 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 60 | 58% |
| kid.Gladiator .7.2 | 44 | 61% |
| jcs.Seth 1.8 | 10 | 60% |
| tcf.Reach 3 | 7 | 100% |
| cli.Dancer 1.1 | 6 | 83% |
| ratosh.Wesco 1.4 | 3 | 67% |

Hadur died in 128 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 50 | 39% | 90 |
| kid.Gladiator .7.2 | 50 | 39% | 65 |
| jcs.Seth 1.8 | 10 | 8% | 22 |
| cli.Dancer 1.1 | 7 | 5% | 12 |
| tcf.Reach 3 | 6 | 5% | 14 |
| ratosh.Wesco 1.4 | 5 | 4% | 7 |

## Melee bench: F35

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 79.4 | 39 / 210 | 2.85 | 15.4% | 23470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.9% | 144 |
| hadur117.mini.DeiseR72 0.3 | 2.0 | 15.4% | 39 |
| gh.mini.Gruwel 0.9 | 3.0 | 13.1% | 17 |
| rz.HawkOnFire 0.1 | 4.2 | 11.9% | 0 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.8 | 11.2% | 10 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.9% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 5.7% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.4% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 78.4 | 9 / 35 | 3740 |
| 2 | 2 | 65.3 | 81.3 | 7 / 35 | 4033 |
| 3 | 2 | 63.4 | 76.5 | 4 / 35 | 4028 |
| 4 | 2 | 63.7 | 79.4 | 5 / 35 | 3691 |
| 5 | 2 | 63.5 | 78.4 | 5 / 35 | 3805 |
| 6 | 2 | 65.9 | 82.5 | 9 / 35 | 4173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 86 | 21% |
| gh.mini.Gruwel 0.9 | 13 | 54% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 88% |
| rz.HawkOnFire 0.1 | 6 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 171 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 99 | 58% | 118 |
| gh.mini.Gruwel 0.9 | 38 | 22% | 47 |
| rz.HawkOnFire 0.1 | 14 | 8% | 17 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 6% | 19 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 93.2 | 169 / 210 | 1.61 | 21.3% | 35130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 21.3% | 169 |
| bzdp.Pansy 2.1 | 2.7 | 11.5% | 13 |
| alpha.RainingFire 1.0 | 3.3 | 11.1% | 7 |
| bvh.micro.Freya 0.3 | 4.0 | 10.9% | 8 |
| mz.Cork 0.1 | 4.8 | 10.2% | 5 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.3% | 4 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.5% | 2 |
| dl.BetterWalls 1.0 | 8.0 | 6.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.7% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 97.5 | 31 / 35 | 5796 |
| 2 | 1 | 71.9 | 93.3 | 31 / 35 | 6010 |
| 3 | 1 | 70.9 | 92.1 | 26 / 35 | 5770 |
| 4 | 1 | 72.7 | 95.2 | 30 / 35 | 6484 |
| 5 | 1 | 70.5 | 90.5 | 26 / 35 | 5623 |
| 6 | 1 | 70.1 | 90.5 | 25 / 35 | 5447 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 48 | 96% |
| bvh.micro.Freya 0.3 | 39 | 97% |
| mz.Cork 0.1 | 32 | 94% |
| alpha.RainingFire 1.0 | 24 | 88% |
| m3thos.Eva02 0.7.1 | 13 | 100% |
| bvh.mini.Fenrir 0.39 | 11 | 91% |
| dl.BetterWalls 1.0 | 6 | 100% |
| sample.MyFirstRobot 1.0 | 4 | 75% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 776. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 9 | 22% | 26 |
| bvh.micro.Freya 0.3 | 7 | 17% | 31 |
| bvh.mini.Fenrir 0.39 | 7 | 17% | 15 |
| bzdp.Pansy 2.1 | 6 | 15% | 53 |
| mz.Cork 0.1 | 6 | 15% | 39 |
| m3thos.Eva02 0.7.1 | 3 | 7% | 25 |
| dl.BetterWalls 1.0 | 1 | 2% | 11 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 6 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 4 |

## Melee bench: F37

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 92.3 | 177 / 210 | 1.69 | 20.4% | 35430 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 20.4% | 177 |
| germ.TheMind .2 | 2.8 | 10.4% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.2% | 5 |
| EBBU.Sim2 1.02 | 3.8 | 9.9% | 3 |
| stelo.UntouchableNano 1.3 | 5.7 | 8.8% | 7 |
| lmk.ACPFinal 0.1 | 6.7 | 8.4% | 1 |
| agrach.Dalek 1.0 | 6.8 | 8.7% | 9 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.8% | 0 |
| mb.Beast 0.1 | 8.2 | 7.8% | 3 |
| skm.Ryubot 1.0 | 8.5 | 7.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.9 | 30 / 35 | 6243 |
| 2 | 1 | 69.3 | 92.4 | 29 / 35 | 5464 |
| 3 | 1 | 70.0 | 93.0 | 31 / 35 | 5789 |
| 4 | 1 | 68.2 | 86.3 | 25 / 35 | 6006 |
| 5 | 1 | 71.1 | 96.8 | 33 / 35 | 5928 |
| 6 | 1 | 69.4 | 89.5 | 29 / 35 | 6000 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 100% |
| EBBU.Sim2 1.02 | 25 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 95% |
| stelo.UntouchableNano 1.3 | 21 | 86% |
| skm.Ryubot 1.0 | 20 | 100% |
| agrach.Dalek 1.0 | 19 | 100% |
| lmk.ACPFinal 0.1 | 18 | 100% |
| mb.Beast 0.1 | 13 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 432. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 18% | 38 |
| stelo.UntouchableNano 1.3 | 6 | 18% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 6 | 18% | 9 |
| agrach.Dalek 1.0 | 5 | 15% | 29 |
| germ.TheMind .2 | 3 | 9% | 34 |
| EBBU.Sim2 1.02 | 3 | 9% | 33 |
| lmk.ACPFinal 0.1 | 3 | 9% | 27 |
| mb.Beast 0.1 | 1 | 3% | 21 |
| skm.Ryubot 1.0 | 0 | 0% | 2 |

## Melee bench: F38

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.3 | 66 / 210 | 3.22 | 15.3% | 24596 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| justin.Mallais 14.0 | 1.3 | 16.2% | 83 |
| hadur117.mini.DeiseR72 0.3 | 1.7 | 15.3% | 66 |
| bvh.mini.Freya 0.55 | 3.3 | 12.7% | 18 |
| davidalves.net.DuelistNanoMelee 1.01 | 4.7 | 11.0% | 9 |
| bts.mega.Gnarly 1.4 | 4.8 | 11.1% | 20 |
| cs.Wren 1.0 | 5.2 | 10.9% | 9 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.7% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 6.1% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.1% | 1 |
| bzdp.BoxCar 2.0 | 9.5 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.8 | 74.9 | 9 / 35 | 3891 |
| 2 | 2 | 62.9 | 73.3 | 10 / 35 | 4131 |
| 3 | 2 | 63.1 | 73.3 | 11 / 35 | 3943 |
| 4 | 2 | 64.7 | 79.0 | 11 / 35 | 4108 |
| 5 | 1 | 64.2 | 75.9 | 16 / 35 | 4108 |
| 6 | 1 | 63.8 | 75.6 | 9 / 35 | 4415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 41 | 56% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 100% |
| bts.mega.Gnarly 1.4 | 13 | 77% |
| cs.Wren 1.0 | 11 | 100% |
| bvh.mini.Freya 0.55 | 8 | 50% |
| kdf.KoulDestroyer 1.0 | 2 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 47 | 32% | 71 |
| bvh.mini.Freya 0.55 | 26 | 18% | 31 |
| cs.Wren 1.0 | 24 | 17% | 28 |
| bts.mega.Gnarly 1.4 | 17 | 12% | 29 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 8% | 28 |
| kdf.KoulDestroyer 1.0 | 9 | 6% | 11 |
| bzdp.BoxCar 2.0 | 5 | 3% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F39

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.7 | 89 / 210 | 2.74 | 17.1% | 29801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.1% | 89 |
| bvh.fry.Freya 0.82 | 2.0 | 15.0% | 22 |
| catcat20.Lambda 0.024 | 3.5 | 11.9% | 31 |
| az.Ololobot 0.2.4 | 3.7 | 12.5% | 54 |
| stelo.SoRobotNanoMelee 1.2 | 4.8 | 9.4% | 11 |
| winamp32.micro.MicroMacro 1.0 | 6.7 | 8.0% | 2 |
| gimp.GimpBot 0.1 | 7.0 | 7.9% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.3 | 7.5% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 77.1 | 14 / 35 | 4846 |
| 2 | 1 | 66.3 | 84.4 | 16 / 35 | 4778 |
| 3 | 1 | 65.9 | 80.3 | 13 / 35 | 5002 |
| 4 | 1 | 67.3 | 82.2 | 17 / 35 | 5262 |
| 5 | 1 | 65.3 | 78.7 | 14 / 35 | 4877 |
| 6 | 1 | 65.8 | 81.3 | 15 / 35 | 5036 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 44 | 84% |
| az.Ololobot 0.2.4 | 37 | 46% |
| catcat20.Lambda 0.024 | 30 | 63% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 92% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 48 | 39% | 83 |
| az.Ololobot 0.2.4 | 29 | 24% | 45 |
| catcat20.Lambda 0.024 | 17 | 14% | 35 |
| apollokidd.ApolloKidd 0.9 | 12 | 10% | 15 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 8% | 17 |
| gimp.GimpBot 0.1 | 2 | 2% | 6 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 3 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 5 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.2 | 103 / 210 | 2.51 | 17.9% | 28990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.9% | 103 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.2% | 41 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.8% | 19 |
| Polkwane.SmashMelee 1.0 | 4.5 | 11.0% | 17 |
| mz.AntiGrav 1.0 | 4.7 | 10.8% | 9 |
| stelo.Randomness 1.0 | 6.2 | 9.4% | 13 |
| alpha.BlackIce 1.0 | 6.3 | 9.0% | 6 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 5.7% | 1 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.2% | 1 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 19 / 35 | 4771 |
| 2 | 1 | 67.3 | 81.0 | 18 / 35 | 5159 |
| 3 | 1 | 67.1 | 82.9 | 15 / 35 | 4943 |
| 4 | 1 | 67.2 | 83.8 | 20 / 35 | 4531 |
| 5 | 1 | 68.5 | 84.8 | 19 / 35 | 5239 |
| 6 | 1 | 65.4 | 81.3 | 12 / 35 | 4347 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 56 | 66% |
| kano.gamma.KanoGamma 1.8 | 25 | 68% |
| mz.AntiGrav 1.0 | 19 | 100% |
| Polkwane.SmashMelee 1.0 | 17 | 82% |
| stelo.Randomness 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 8 | 88% |
| sample.Corners 1.0 | 2 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 0% |

Hadur died in 108 of 210 rounds, at a mean tick of 737. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 42 | 39% | 72 |
| kano.gamma.KanoGamma 1.8 | 22 | 20% | 45 |
| mz.AntiGrav 1.0 | 14 | 13% | 29 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 24 |
| alpha.BlackIce 1.0 | 9 | 8% | 16 |
| stelo.Randomness 1.0 | 5 | 5% | 15 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |
| sample.Corners 1.0 | 1 | 1% | 2 |

## Melee bench: F41

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 82.1 | 92 / 210 | 2.61 | 17.0% | 27035 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.3 | 17.0% | 92 |
| eem.EvBotNG v12.8 | 1.7 | 16.1% | 76 |
| ary.Swarm 1.1 | 3.5 | 12.8% | 19 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.4% | 10 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 11.1% | 9 |
| shrub.Silver v048 | 6.0 | 8.5% | 1 |
| zyx.nano.Ant 1.1 | 7.3 | 7.0% | 0 |
| jsal.Jsalbot 1.0 | 8.0 | 6.2% | 5 |
| stelo.Mirror 1.1 | 8.7 | 6.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.9 | 17 / 35 | 4436 |
| 2 | 2 | 65.9 | 81.0 | 15 / 35 | 4429 |
| 3 | 1 | 66.8 | 84.1 | 15 / 35 | 4548 |
| 4 | 2 | 65.4 | 78.1 | 14 / 35 | 4452 |
| 5 | 1 | 67.7 | 86.0 | 19 / 35 | 4611 |
| 6 | 1 | 66.0 | 80.6 | 12 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 55 | 62% |
| ary.Swarm 1.1 | 21 | 67% |
| lessonz.robocode.Oz 0.5.0 | 19 | 100% |
| simonton.nano.MeleeSeed 1.8 | 15 | 87% |
| jsal.Jsalbot 1.0 | 8 | 88% |
| shrub.Silver v048 | 3 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 120 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 42 | 35% | 74 |
| ary.Swarm 1.1 | 33 | 28% | 53 |
| simonton.nano.MeleeSeed 1.8 | 17 | 14% | 29 |
| lessonz.robocode.Oz 0.5.0 | 15 | 13% | 28 |
| shrub.Silver v048 | 4 | 3% | 10 |
| stelo.Mirror 1.1 | 3 | 3% | 7 |
| jsal.Jsalbot 1.0 | 3 | 3% | 6 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.2 | 97 / 210 | 2.51 | 17.9% | 32644 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 17.9% | 97 |
| wompi.Wallaby 5.1 | 2.0 | 16.2% | 63 |
| ara.Shera 0.88 | 3.2 | 14.0% | 33 |
| maribo.mini.MiniQuester 0.1 | 3.8 | 12.9% | 17 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| maribo.IotaCT 1.1 | 6.3 | 7.1% | 0 |
| dsw.StaticD 1.0 | 7.2 | 6.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.7 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.2 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 79.7 | 15 / 35 | 5385 |
| 2 | 1 | 69.5 | 88.6 | 18 / 35 | 5878 |
| 3 | 1 | 67.6 | 82.9 | 16 / 35 | 5405 |
| 4 | 1 | 67.8 | 83.5 | 17 / 35 | 5565 |
| 5 | 1 | 66.5 | 81.3 | 14 / 35 | 4958 |
| 6 | 1 | 67.9 | 83.2 | 17 / 35 | 5453 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 40 | 83% |
| wompi.Wallaby 5.1 | 39 | 67% |
| maribo.mini.MiniQuester 0.1 | 34 | 85% |
| dsw.StaticD 1.0 | 4 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 36 | 32% | 66 |
| wompi.Wallaby 5.1 | 35 | 31% | 64 |
| maribo.mini.MiniQuester 0.1 | 30 | 26% | 61 |
| amz.NanoClone 1.41 | 7 | 6% | 7 |
| dsw.StaticD 1.0 | 2 | 2% | 5 |
| maribo.IotaCT 1.1 | 2 | 2% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 70.0 | 20 / 210 | 3.70 | 13.7% | 22831 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.1% | 155 |
| hadur117.mini.DeiseR72 0.3 | 2.3 | 13.7% | 20 |
| brainfade.melee.Dusk 0.44 | 3.0 | 12.6% | 23 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.6% | 7 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.8% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.9% | 2 |
| jab.DiamondStealer 5 | 7.5 | 7.8% | 0 |
| mz.NanoGod 2.02 | 7.5 | 8.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.9% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.9 | 67.9 | 5 / 35 | 3603 |
| 2 | 2 | 63.5 | 74.0 | 4 / 35 | 3981 |
| 3 | 3 | 60.3 | 65.1 | 4 / 35 | 3360 |
| 4 | 2 | 63.0 | 70.5 | 3 / 35 | 4052 |
| 5 | 2 | 63.0 | 74.0 | 2 / 35 | 3796 |
| 6 | 3 | 61.9 | 68.6 | 2 / 35 | 4039 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 20% |
| brainfade.melee.Dusk 0.44 | 11 | 36% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 67% |
| dummy.micro.Sparrow 2.5 | 3 | 67% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 90 | 47% | 103 |
| brainfade.melee.Dusk 0.44 | 28 | 15% | 30 |
| wcsv.melee.EngineerMelee 0.1 | 23 | 12% | 25 |
| dummy.micro.Sparrow 2.5 | 23 | 12% | 25 |
| Krabb.akim2.Akim2 1.1b | 11 | 6% | 12 |
| mz.NanoGod 2.02 | 10 | 5% | 10 |
| jab.DiamondStealer 5 | 5 | 3% | 5 |
2 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.5 | 114 / 210 | 2.21 | 18.9% | 32442 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 18.9% | 114 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 58 |
| tzu.TheArtOfWar 1.2 | 2.8 | 13.7% | 28 |
| wompi.Quokka 1.6 | 4.7 | 9.8% | 2 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.5% | 4 |
| jwirde.Gort 2.0 | 5.5 | 9.3% | 6 |
| disan.Chair 2.2.0 | 7.0 | 8.0% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.6% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.8% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 84.8 | 21 / 35 | 5109 |
| 2 | 1 | 69.5 | 88.6 | 22 / 35 | 5541 |
| 3 | 1 | 69.2 | 86.7 | 20 / 35 | 5516 |
| 4 | 1 | 68.1 | 86.3 | 18 / 35 | 5257 |
| 5 | 1 | 69.0 | 87.0 | 17 / 35 | 5720 |
| 6 | 1 | 68.4 | 85.7 | 16 / 35 | 5299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 82 | 65% |
| tzu.TheArtOfWar 1.2 | 48 | 73% |
| jwirde.Gort 2.0 | 9 | 100% |
| wompi.Quokka 1.6 | 8 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 7 | 86% |
| disan.Chair 2.2.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 874. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 43% | 95 |
| tzu.TheArtOfWar 1.2 | 31 | 32% | 65 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 8% | 13 |
| jwirde.Gort 2.0 | 4 | 4% | 17 |
| wompi.Quokka 1.6 | 3 | 3% | 7 |
| disan.Chair 2.2.0 | 3 | 3% | 6 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 3 |
| sample.Crazy 1.0 | 2 | 2% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.4 | 82 / 210 | 2.04 | 19.8% | 36610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseR72 0.3 | 1.0 | 19.8% | 82 |
| eem.IWillFireNoBullet v2.8 | 2.5 | 12.4% | 103 |
| jje.BagPuss 1.2 | 3.0 | 11.4% | 6 |
| myl.nano.Graviton 1.10 | 3.8 | 10.6% | 3 |
| sul.Lunar 1.1 | 4.7 | 10.2% | 4 |
| fm.claire 1.7 | 6.5 | 9.0% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.3% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 8.2% | 8 |
| wit.Deep7 2.0 | 9.2 | 5.6% | 3 |
| abud.ThirdRobo 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 87.0 | 14 / 35 | 6369 |
| 2 | 1 | 70.8 | 93.3 | 20 / 35 | 5989 |
| 3 | 1 | 68.5 | 84.1 | 13 / 35 | 5971 |
| 4 | 1 | 69.3 | 86.7 | 11 / 35 | 6220 |
| 5 | 1 | 69.9 | 91.1 | 11 / 35 | 6225 |
| 6 | 1 | 68.9 | 88.3 | 13 / 35 | 5836 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 103 | 17% |
| jje.BagPuss 1.2 | 19 | 84% |
| myl.nano.Graviton 1.10 | 18 | 94% |
| sul.Lunar 1.1 | 14 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 13 | 85% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 2193. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 88 | 69% | 0 |
| myl.nano.Graviton 1.10 | 9 | 7% | 48 |
| sul.Lunar 1.1 | 8 | 6% | 54 |
| jje.BagPuss 1.2 | 7 | 5% | 48 |
| pez.mini.ChironexFleckeri 0.5 | 7 | 5% | 21 |
| fm.claire 1.7 | 7 | 5% | 18 |
| hvilela.HVilela 0.9 | 1 | 1% | 9 |
| wit.Deep7 2.0 | 1 | 1% | 8 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

hadur117.mini.DeiseR72 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.4 | 64 / 210 | 2.58 | 16.4% | 26220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.6% | 52 |
| hadur117.mini.DeiseR72 0.3 | 2.2 | 16.4% | 64 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.7% | 86 |
| mz.MicroSheep 1.0 | 4.0 | 10.7% | 6 |
| cx.Princess 1.0 | 5.2 | 9.3% | 2 |
| sadoner.killer 0.2 | 5.8 | 9.0% | 0 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.4% | 0 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 6.1% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.0 | 12 / 35 | 3961 |
| 2 | 3 | 65.4 | 82.2 | 8 / 35 | 4369 |
| 3 | 2 | 65.8 | 82.5 | 8 / 35 | 4422 |
| 4 | 3 | 64.4 | 77.5 | 7 / 35 | 4481 |
| 5 | 1 | 68.0 | 87.9 | 16 / 35 | 4667 |
| 6 | 2 | 66.1 | 83.5 | 13 / 35 | 4320 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 58 | 64% |
| rsalesc.melee.Medina 0.4.5 | 44 | 32% |
| mz.MicroSheep 1.0 | 11 | 82% |
| cx.Princess 1.0 | 4 | 75% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 146 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 59 | 40% | 72 |
| kc.mini.Mirage 0.2 | 55 | 38% | 92 |
| mz.MicroSheep 1.0 | 16 | 11% | 21 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 8 |
| cx.Princess 1.0 | 5 | 3% | 8 |
| sadoner.killer 0.2 | 4 | 3% | 4 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 3 |
| kurios.DOSexe .9a | 0 | 0% | 2 |

