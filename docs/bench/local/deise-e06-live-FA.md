# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 86.9 | 52 / 210 | 2.18 | 17.2% | 30223 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 148 |
| hadur117.mini.DeiseFA 0.3 | 2.0 | 17.2% | 52 |
| sgp.JollyNinja 3.53 | 3.7 | 10.9% | 5 |
| mz.MicroGodMelee 1 | 4.0 | 10.7% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.1% | 1 |
| lorneswork.Predator 1.0 | 5.5 | 9.6% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.7% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.9 | 88.6 | 10 / 35 | 5371 |
| 2 | 2 | 67.7 | 87.3 | 12 / 35 | 5063 |
| 3 | 2 | 67.2 | 87.3 | 10 / 35 | 4770 |
| 4 | 2 | 66.7 | 85.1 | 6 / 35 | 5082 |
| 5 | 2 | 66.2 | 84.1 | 7 / 35 | 5054 |
| 6 | 2 | 67.0 | 88.9 | 7 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 16% |
| mz.MicroGodMelee 1 | 14 | 100% |
| sgp.JollyNinja 3.53 | 14 | 93% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 75% |
| lorneswork.Predator 1.0 | 1 | 0% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 1247. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 129 | 82% | 155 |
| sgp.JollyNinja 3.53 | 8 | 5% | 15 |
| lorneswork.Predator 1.0 | 8 | 5% | 10 |
| mz.MicroGodMelee 1 | 6 | 4% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 3% | 7 |
| adt.Ar2 1.0 | 1 | 1% | 3 |
| mym.EdgeStalker 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 0 | 0% | 2 |

## Melee bench: F02

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.9 | 109 / 210 | 2.54 | 18.2% | 31183 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.2% | 109 |
| pulsar.PulsarMax 0.8.9 | 2.5 | 13.5% | 40 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 30 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.4% | 6 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 9.2% | 8 |
| sch.Simone 0.3d | 6.7 | 8.0% | 7 |
| Noran.BitchingElk 0.054 | 6.8 | 7.6% | 5 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.9% | 0 |
| stelo.PatternRobot 1.0 | 8.7 | 6.5% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 85.7 | 22 / 35 | 5794 |
| 2 | 1 | 64.3 | 74.6 | 12 / 35 | 4559 |
| 3 | 1 | 66.6 | 81.3 | 17 / 35 | 4878 |
| 4 | 1 | 66.6 | 81.9 | 15 / 35 | 5098 |
| 5 | 1 | 68.9 | 87.3 | 22 / 35 | 5313 |
| 6 | 1 | 69.0 | 86.3 | 21 / 35 | 5541 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 76% |
| pulsar.PulsarMax 0.8.9 | 36 | 75% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| sch.Simone 0.3d | 10 | 90% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 80% |
| Noran.BitchingElk 0.054 | 10 | 90% |
| stelo.PatternRobot 1.0 | 4 | 75% |
| fnc.bandit.Bandit 5.2.0 | 4 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 29 | 29% | 52 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 25% | 61 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 16% | 21 |
| stelo.PatternRobot 1.0 | 14 | 14% | 14 |
| fnc.bandit.Bandit 5.2.0 | 6 | 6% | 11 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5 | 5% | 14 |
| fullsail.SweetTea 1.1 | 3 | 3% | 4 |
| sch.Simone 0.3d | 2 | 2% | 13 |
| Noran.BitchingElk 0.054 | 1 | 1% | 19 |

## Melee bench: F03

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.9 | 158 / 210 | 1.55 | 20.7% | 38127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 20.7% | 158 |
| radnor.DoctorBob 1.42 | 2.3 | 13.4% | 13 |
| kawigi.nano.Lib 1.0 | 3.3 | 13.1% | 18 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 21 |
| urdos.URDOS 1.3 | 5.0 | 8.6% | 0 |
| adt.Ar1 2.1 | 6.7 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.3% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.7% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 92.4 | 25 / 35 | 6554 |
| 2 | 1 | 71.0 | 94.3 | 26 / 35 | 6208 |
| 3 | 1 | 70.9 | 93.7 | 26 / 35 | 6266 |
| 4 | 1 | 71.2 | 95.6 | 28 / 35 | 6379 |
| 5 | 1 | 70.8 | 93.7 | 27 / 35 | 6191 |
| 6 | 1 | 71.2 | 94.0 | 26 / 35 | 6529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 65 | 77% |
| kawigi.nano.Lib 1.0 | 65 | 89% |
| radnor.DoctorBob 1.42 | 42 | 95% |
| oa.weak.FlyMk1 0.1 | 4 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| urdos.URDOS 1.3 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 52 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 20 | 38% | 77 |
| radnor.DoctorBob 1.42 | 15 | 29% | 48 |
| kawigi.nano.Lib 1.0 | 14 | 27% | 65 |
| urdos.URDOS 1.3 | 2 | 4% | 2 |
| adt.Ar1 2.1 | 1 | 2% | 4 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 0 | 0% | 4 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.0 | 30 / 210 | 2.35 | 17.2% | 33169 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.4% | 173 |
| hadur117.mini.DeiseFA 0.3 | 2.0 | 17.2% | 30 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.2% | 7 |
| TNT.TNT 0.99.1 | 4.3 | 9.8% | 0 |
| josago.Jorgito 0.16 | 4.7 | 9.2% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 7.8 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.9 | 82.5 | 4 / 35 | 5501 |
| 2 | 2 | 68.6 | 87.3 | 5 / 35 | 5638 |
| 3 | 2 | 67.9 | 86.0 | 6 / 35 | 5649 |
| 4 | 2 | 68.2 | 86.7 | 6 / 35 | 5658 |
| 5 | 2 | 66.2 | 81.9 | 5 / 35 | 5082 |
| 6 | 2 | 67.8 | 85.7 | 4 / 35 | 5641 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 152 | 14% |
| apc.LeeroyJenkins2 1.0 | 8 | 63% |
| TNT.TNT 0.99.1 | 3 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 1366. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 143 | 79% | 164 |
| apc.LeeroyJenkins2 1.0 | 22 | 12% | 28 |
| josago.Jorgito 0.16 | 8 | 4% | 8 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| TNT.TNT 0.99.1 | 0 | 0% | 2 |

## Melee bench: F05

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 72.3 | 21 / 210 | 3.49 | 13.5% | 20386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 116 |
| justin.DemonicRage 3.4 | 2.0 | 16.7% | 58 |
| hadur117.mini.DeiseFA 0.3 | 3.0 | 13.5% | 21 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 13 |
| axeBots.HataMoto 3.09 | 5.5 | 8.9% | 1 |
| ms.Ares 0.19 | 5.5 | 8.9% | 1 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.2 | 70.8 | 5 / 35 | 3577 |
| 2 | 3 | 59.9 | 71.1 | 4 / 35 | 3057 |
| 3 | 3 | 62.3 | 76.8 | 4 / 35 | 3474 |
| 4 | 3 | 60.9 | 71.4 | 3 / 35 | 3421 |
| 5 | 3 | 61.8 | 75.9 | 2 / 35 | 3345 |
| 6 | 3 | 59.9 | 67.9 | 3 / 35 | 3512 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 36 | 19% |
| justin.DemonicRage 3.4 | 31 | 35% |
| wompi.Numbat 2.1 | 6 | 33% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 846. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 68 | 36% | 77 |
| justin.DemonicRage 3.4 | 55 | 29% | 64 |
| wompi.Numbat 2.1 | 33 | 17% | 35 |
| axeBots.HataMoto 3.09 | 12 | 6% | 13 |
| ms.Ares 0.19 | 11 | 6% | 11 |
| davidalves.net.DuelistMicroMelee 1.4 | 4 | 2% | 4 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| GarmBox.Oranges 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.0 | 96 / 210 | 2.44 | 17.3% | 27300 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 17.3% | 96 |
| origin.SleepSiphon 1.7b | 2.3 | 14.3% | 57 |
| jekl.StoneGhost 0.7 | 2.7 | 14.2% | 25 |
| mld.Wisdom 1.0 | 4.3 | 11.6% | 6 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.7 | 11.6% | 14 |
| gg.Wolverine 2.0 | 6.2 | 8.3% | 7 |
| ers.nano.hawk.HawkLA 3.0m | 7.7 | 6.7% | 8 |
| spinnercat.Omen 1.0 | 8.0 | 6.4% | 0 |
| DBall.NUKE 0.1 | 8.2 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 81.6 | 16 / 35 | 4676 |
| 2 | 1 | 66.5 | 84.4 | 14 / 35 | 4428 |
| 3 | 1 | 66.9 | 85.1 | 17 / 35 | 4478 |
| 4 | 1 | 66.8 | 84.1 | 17 / 35 | 4373 |
| 5 | 1 | 67.4 | 85.7 | 16 / 35 | 4835 |
| 6 | 1 | 66.4 | 82.9 | 16 / 35 | 4510 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| origin.SleepSiphon 1.7b | 49 | 69% |
| jekl.StoneGhost 0.7 | 30 | 77% |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 94% |
| gg.Wolverine 2.0 | 10 | 80% |
| ers.nano.hawk.HawkLA 3.0m | 9 | 56% |
| mld.Wisdom 1.0 | 5 | 60% |
| DBall.NUKE 0.1 | 3 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 33 | 28% | 71 |
| jekl.StoneGhost 0.7 | 32 | 27% | 49 |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 17% | 36 |
| mld.Wisdom 1.0 | 19 | 16% | 24 |
| gg.Wolverine 2.0 | 6 | 5% | 12 |
| ers.nano.hawk.HawkLA 3.0m | 5 | 4% | 12 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |
3 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 91.5 | 123 / 210 | 1.76 | 19.8% | 35431 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.2 | 19.8% | 123 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.2% | 48 |
| rtk.Tachikoma 1.0 | 2.7 | 16.2% | 25 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.6% | 5 |
| franzor.Lizt 1.3.1 | 5.0 | 10.5% | 9 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.7% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.6% | 0 |
| sample.Target 1.0 | 9.0 | 2.8% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 91.4 | 20 / 35 | 6211 |
| 2 | 1 | 72.4 | 94.9 | 25 / 35 | 6008 |
| 3 | 1 | 71.5 | 91.7 | 20 / 35 | 6019 |
| 4 | 2 | 69.2 | 86.3 | 16 / 35 | 5312 |
| 5 | 1 | 71.7 | 93.7 | 24 / 35 | 5724 |
| 6 | 1 | 71.2 | 91.1 | 18 / 35 | 6157 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 82 | 85% |
| rsalesc.melee.Monk 0.3.6c | 48 | 25% |
| oog.melee.CapuletDroid 1.1 | 29 | 93% |
| franzor.Lizt 1.3.1 | 16 | 81% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1327. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 49 | 56% | 73 |
| rtk.Tachikoma 1.0 | 26 | 30% | 102 |
| oog.melee.CapuletDroid 1.1 | 6 | 7% | 26 |
| franzor.Lizt 1.3.1 | 3 | 3% | 0 |
| exauge.GateKeeper 1.1.121g | 2 | 2% | 3 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 3 |

## Melee bench: F08

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.1 | 121 / 210 | 2.16 | 18.6% | 29022 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.6% | 121 |
| tm.Yuugao 1.0 | 2.5 | 13.2% | 32 |
| shrub.Vapour v159 | 2.7 | 13.2% | 37 |
| Krabb.sliNk.Garm 0.9u | 4.2 | 10.6% | 5 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.5% | 9 |
| m3thos.Eva00 1.1 | 6.2 | 7.7% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 7.5% | 4 |
| SHAM.WOW 1.4 | 8.7 | 6.9% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 78.7 | 15 / 35 | 4844 |
| 2 | 1 | 67.3 | 86.3 | 18 / 35 | 4730 |
| 3 | 1 | 67.5 | 87.0 | 20 / 35 | 4770 |
| 4 | 1 | 67.4 | 87.9 | 19 / 35 | 4572 |
| 5 | 1 | 68.9 | 91.4 | 23 / 35 | 4866 |
| 6 | 1 | 70.0 | 91.1 | 26 / 35 | 5240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 53 | 75% |
| shrub.Vapour v159 | 37 | 65% |
| Krabb.sliNk.Garm 0.9u | 27 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 73% |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 100% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| m3thos.Eva00 1.1 | 2 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 30 | 34% | 80 |
| shrub.Vapour v159 | 28 | 31% | 55 |
| Krabb.sliNk.Garm 0.9u | 11 | 12% | 25 |
| com.spp.robocode.MostlyHarmless 010 | 9 | 10% | 18 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 15 |
| m3thos.Eva00 1.1 | 2 | 2% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 2% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 7 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 2 |

## Melee bench: F09

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 78.6 | 67 / 210 | 2.93 | 16.1% | 24799 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.5 | 16.1% | 67 |
| positive.Portia 1.26e | 1.5 | 16.9% | 91 |
| kc.micro.Figment 1.0 | 3.0 | 13.8% | 23 |
| yagami.Tidus 0.11 | 4.3 | 10.8% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.0% | 17 |
| mc2.enemy.Original 0.9 | 5.8 | 9.2% | 10 |
| dft.Calliope 5.6 | 7.0 | 7.5% | 2 |
| step.nanoPri 1.0 | 8.3 | 5.9% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 80.3 | 13 / 35 | 4203 |
| 2 | 2 | 62.8 | 73.3 | 8 / 35 | 3843 |
| 3 | 1 | 64.8 | 77.8 | 13 / 35 | 4098 |
| 4 | 2 | 65.2 | 82.2 | 9 / 35 | 4062 |
| 5 | 2 | 63.6 | 75.2 | 10 / 35 | 4118 |
| 6 | 1 | 66.5 | 82.5 | 14 / 35 | 4475 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 39% |
| kc.micro.Figment 1.0 | 26 | 88% |
| yagami.Tidus 0.11 | 15 | 100% |
| pedersen.Grishnakh 1.0 | 8 | 13% |
| mc2.enemy.Original 0.9 | 5 | 60% |
| dft.Calliope 5.6 | 2 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 42% | 87 |
| kc.micro.Figment 1.0 | 25 | 17% | 48 |
| pedersen.Grishnakh 1.0 | 22 | 15% | 22 |
| yagami.Tidus 0.11 | 15 | 10% | 25 |
| mc2.enemy.Original 0.9 | 9 | 6% | 15 |
| dft.Calliope 5.6 | 4 | 3% | 6 |
| rdm.Dueler 0.4x | 4 | 3% | 4 |
| step.nanoPri 1.0 | 2 | 1% | 2 |
| robar.nano.Assertive_Melee 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F10

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 97.1 | 183 / 210 | 1.26 | 21.0% | 34101 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 21.0% | 183 |
| DTF.Kludgy 1.2b | 2.0 | 13.9% | 9 |
| ne.Chimera 1.2 | 3.2 | 12.7% | 5 |
| ejb.Polaris 1.0.1 | 3.8 | 11.9% | 7 |
| vStar.RAFzilla 2.15 | 5.5 | 9.7% | 3 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.5% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.5% | 1 |
| kurios.DOSexe .9b | 8.2 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.6% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.9% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 94.3 | 30 / 35 | 5425 |
| 2 | 1 | 71.1 | 97.1 | 29 / 35 | 5578 |
| 3 | 1 | 72.8 | 100.0 | 35 / 35 | 6055 |
| 4 | 1 | 70.8 | 95.6 | 27 / 35 | 5796 |
| 5 | 1 | 71.2 | 97.5 | 30 / 35 | 5521 |
| 6 | 1 | 71.9 | 98.4 | 32 / 35 | 5726 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 68 | 94% |
| ejb.Polaris 1.0.1 | 53 | 89% |
| ne.Chimera 1.2 | 31 | 90% |
| tvv.micro.Antares 1.1.1 | 17 | 100% |
| vStar.RAFzilla 2.15 | 16 | 88% |
| kurios.DOSexe .9b | 6 | 100% |
| donjezza.Muncho 1.0 | 5 | 60% |
| sam.Samspin 1.0 | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 29 of 210 rounds, at a mean tick of 1090. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 11 | 38% | 73 |
| ejb.Polaris 1.0.1 | 6 | 21% | 53 |
| ne.Chimera 1.2 | 4 | 14% | 35 |
| vStar.RAFzilla 2.15 | 2 | 7% | 10 |
| donjezza.Muncho 1.0 | 2 | 7% | 5 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 7% | 3 |
| tvv.micro.Antares 1.1.1 | 1 | 3% | 12 |
| kurios.DOSexe .9b | 0 | 0% | 17 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F11

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 81.0 | 91 / 210 | 2.71 | 17.0% | 26657 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.5 | 16.6% | 65 |
| hadur117.mini.DeiseFA 0.3 | 1.5 | 17.0% | 91 |
| cx.mini.Nimrod 0.55 | 3.3 | 12.6% | 25 |
| djc.DynaBot 0.1.1 | 3.8 | 11.1% | 8 |
| rdt199.Warlord 0.73 | 5.3 | 9.5% | 14 |
| br2.MobyDickBot 1.6 | 6.0 | 8.2% | 4 |
| uji.YellohFellah 1.0 | 7.0 | 7.5% | 5 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 9.2 | 5.5% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.7 | 72.1 | 10 / 35 | 3848 |
| 2 | 2 | 66.4 | 82.5 | 13 / 35 | 4526 |
| 3 | 1 | 66.6 | 82.9 | 16 / 35 | 4680 |
| 4 | 1 | 68.4 | 86.7 | 22 / 35 | 4759 |
| 5 | 1 | 66.9 | 83.5 | 17 / 35 | 4506 |
| 6 | 2 | 64.9 | 78.4 | 13 / 35 | 4338 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 58 | 64% |
| djc.DynaBot 0.1.1 | 22 | 91% |
| cx.mini.Nimrod 0.55 | 19 | 79% |
| rdt199.Warlord 0.73 | 9 | 89% |
| uji.YellohFellah 1.0 | 8 | 100% |
| br2.MobyDickBot 1.6 | 3 | 100% |

Hadur died in 119 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 50 | 42% | 88 |
| cx.mini.Nimrod 0.55 | 28 | 24% | 38 |
| rdt199.Warlord 0.73 | 12 | 10% | 22 |
| djc.DynaBot 0.1.1 | 8 | 7% | 28 |
| stelo.MirrorNano 1.3 | 7 | 6% | 7 |
| KiraNL.Chupacabra 0.4 | 5 | 4% | 7 |
| uji.YellohFellah 1.0 | 4 | 3% | 11 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 3% | 3 |
| br2.MobyDickBot 1.6 | 2 | 2% | 6 |

## Melee bench: F12

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 80.9 | 108 / 210 | 2.72 | 16.9% | 23492 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 16.9% | 108 |
| nat.PallasHawk 1.0 | 2.7 | 13.3% | 33 |
| bts.wiki.RipCurl 0.9b | 3.2 | 13.3% | 23 |
| darkcanuck.Leon 1.01 | 3.3 | 12.8% | 26 |
| brainfade.melee.Genghis 0.36 | 4.8 | 9.9% | 14 |
| jrm.Test0 1.0 | 6.7 | 7.8% | 2 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.5% | 0 |
| jp.Perpy 16.0 | 7.3 | 7.4% | 2 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.5% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.1 | 77.5 | 15 / 35 | 3684 |
| 2 | 1 | 65.0 | 78.7 | 20 / 35 | 3740 |
| 3 | 1 | 67.0 | 84.4 | 19 / 35 | 4274 |
| 4 | 1 | 66.5 | 85.1 | 20 / 35 | 3752 |
| 5 | 1 | 66.2 | 82.5 | 18 / 35 | 4129 |
| 6 | 1 | 64.3 | 77.1 | 16 / 35 | 3913 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 41 | 80% |
| nat.PallasHawk 1.0 | 39 | 74% |
| bts.wiki.RipCurl 0.9b | 33 | 91% |
| brainfade.melee.Genghis 0.36 | 7 | 71% |
| jp.Perpy 16.0 | 3 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 666. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 26 | 25% | 58 |
| darkcanuck.Leon 1.01 | 19 | 18% | 54 |
| bts.wiki.RipCurl 0.9b | 19 | 18% | 38 |
| brainfade.melee.Genghis 0.36 | 16 | 16% | 22 |
| cs.sheldor.Talon 1.1 | 10 | 10% | 13 |
| jrm.Test0 1.0 | 5 | 5% | 9 |
| stuff.Vlad 0.1 | 4 | 4% | 5 |
| jp.Perpy 16.0 | 3 | 3% | 8 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

## Melee bench: F13

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 84.0 | 75 / 210 | 2.44 | 16.6% | 26347 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.6% | 80 |
| hadur117.mini.DeiseFA 0.3 | 1.8 | 16.6% | 75 |
| ags.Glacier 0.2.11 | 2.5 | 15.8% | 25 |
| shinh.Entangled 0.3 | 4.2 | 12.2% | 22 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.0% | 7 |
| apc.Colossus2 0.17 | 6.3 | 8.0% | 1 |
| stelo.Wang 1.0 | 6.7 | 7.3% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.4% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.8% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 87.0 | 17 / 35 | 4639 |
| 2 | 2 | 65.4 | 83.5 | 10 / 35 | 4139 |
| 3 | 3 | 64.8 | 81.0 | 9 / 35 | 4165 |
| 4 | 1 | 67.1 | 86.0 | 16 / 35 | 4462 |
| 5 | 2 | 66.0 | 83.8 | 11 / 35 | 4393 |
| 6 | 2 | 66.2 | 82.9 | 12 / 35 | 4549 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 34% |
| ags.Glacier 0.2.11 | 45 | 82% |
| shinh.Entangled 0.3 | 20 | 55% |
| stelo.Wang 1.0 | 3 | 100% |
| apc.Colossus2 0.17 | 2 | 100% |
| gh.micro.Gruweltje 0.7 | 2 | 50% |

Hadur died in 135 of 210 rounds, at a mean tick of 946. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 40% | 78 |
| ags.Glacier 0.2.11 | 32 | 24% | 64 |
| shinh.Entangled 0.3 | 29 | 21% | 42 |
| gh.micro.Gruweltje 0.7 | 14 | 10% | 19 |
| apc.Colossus2 0.17 | 2 | 1% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
| stelo.Wang 1.0 | 2 | 1% | 2 |

## Melee bench: F14

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.2 | 155 / 210 | 1.61 | 20.4% | 34456 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 20.4% | 155 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 26 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 24 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.5% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.6% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 7.0 | 8.3% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.2 | 8.1% | 5 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 99.0 | 32 / 35 | 6124 |
| 2 | 1 | 70.5 | 94.0 | 26 / 35 | 5600 |
| 3 | 1 | 70.1 | 89.5 | 22 / 35 | 5707 |
| 4 | 1 | 71.1 | 94.6 | 26 / 35 | 5869 |
| 5 | 1 | 69.8 | 93.0 | 23 / 35 | 5383 |
| 6 | 1 | 70.4 | 89.2 | 26 / 35 | 5773 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 78 | 85% |
| catcat20.shape.Theta 0.018 | 53 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 89% |
| sanyi.mikrobi.Roberto 1.0 | 13 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 12 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 100% |
| sample.TrackFire 1.0 | 2 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 872. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 26 | 46% | 93 |
| catcat20.shape.Theta 0.018 | 14 | 25% | 53 |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 11% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 5 | 9% | 13 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 21 |
| sanyi.mikrobi.Roberto 1.0 | 0 | 0% | 14 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 3 |
| sample.TrackFire 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 80.1 | 92 / 210 | 2.80 | 17.5% | 31435 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 17.5% | 92 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.8% | 27 |
| emp.Yngwie 1.11 | 2.7 | 13.4% | 52 |
| mld.DustBunny 3.8 | 4.3 | 11.9% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 10.7% | 7 |
| kawigi.robot.Girl 1.2 | 5.5 | 10.2% | 18 |
| lambdaxy.TBot 0.1 | 7.0 | 7.2% | 0 |
| Grystrion.TrackerWO 1.0 | 8.0 | 6.2% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.9% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 83.2 | 18 / 35 | 5666 |
| 2 | 1 | 65.0 | 74.6 | 13 / 35 | 5012 |
| 3 | 1 | 66.9 | 81.9 | 18 / 35 | 4754 |
| 4 | 1 | 68.0 | 83.8 | 18 / 35 | 5443 |
| 5 | 1 | 67.0 | 81.0 | 13 / 35 | 5489 |
| 6 | 1 | 65.5 | 75.9 | 12 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 42 | 64% |
| kawigi.micro.Shiz 1.1 | 23 | 91% |
| kawigi.robot.Girl 1.2 | 19 | 84% |
| mld.DustBunny 3.8 | 17 | 94% |
| cb.nano.Insomnia 1.0 | 13 | 77% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |
| divineomega.TrialBot 0.003 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 31% | 74 |
| kawigi.micro.Shiz 1.1 | 23 | 19% | 42 |
| mld.DustBunny 3.8 | 21 | 18% | 44 |
| kawigi.robot.Girl 1.2 | 15 | 13% | 23 |
| cb.nano.Insomnia 1.0 | 14 | 12% | 12 |
| divineomega.TrialBot 0.003 | 3 | 3% | 7 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 3 |

## Melee bench: F16

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.4 | 101 / 210 | 2.49 | 18.3% | 32734 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.3% | 101 |
| gh.Griezel 0.5.2 | 2.2 | 16.6% | 64 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.6% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.6% | 22 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.2% | 1 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.8% | 3 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.2% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.2 | 5.8% | 9 |
| asd.Cthulhu 1.3 | 9.3 | 4.6% | 0 |
| repositorio.NanoStep 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.0 | 16 / 35 | 4918 |
| 2 | 1 | 66.7 | 78.4 | 14 / 35 | 5380 |
| 3 | 1 | 69.3 | 86.7 | 17 / 35 | 5746 |
| 4 | 1 | 69.0 | 85.4 | 19 / 35 | 5592 |
| 5 | 1 | 69.5 | 86.7 | 21 / 35 | 5504 |
| 6 | 1 | 67.6 | 82.5 | 14 / 35 | 5594 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 87% |
| techdude.forest.FlamingForest 1.1 | 11 | 73% |
| stelo.IntrinsicVolatility 1.4 | 8 | 88% |
| divineomega.DivineBot 1.9.4.5 | 7 | 86% |
| bvh.fnr.Fenrir 0.36l | 6 | 83% |
| tvv.nano.Polaris 1.2 | 4 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1092. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 54 | 49% | 111 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 24 | 22% | 38 |
| bvh.fnr.Fenrir 0.36l | 8 | 7% | 10 |
| techdude.forest.FlamingForest 1.1 | 6 | 5% | 16 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 12 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 13 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 7 |
| asd.Cthulhu 1.3 | 3 | 3% | 3 |

## Melee bench: F17

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 80.1 | 94 / 210 | 2.80 | 17.3% | 30966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 17.3% | 94 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.6% | 25 |
| et.Predator 1.8 | 3.0 | 13.0% | 22 |
| cx.BlestPain 1.41 | 3.7 | 12.2% | 41 |
| nic.Nicator 2.4 | 4.3 | 11.7% | 15 |
| ahf.NanoAndrew .4 | 6.2 | 10.1% | 9 |
| maribo.melee.BMV 0.1 | 6.8 | 8.9% | 3 |
| tex.Longbot 0.4 | 8.0 | 6.1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 9.0 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 77.8 | 16 / 35 | 4843 |
| 2 | 1 | 67.3 | 81.3 | 15 / 35 | 5546 |
| 3 | 1 | 65.2 | 76.5 | 14 / 35 | 4845 |
| 4 | 1 | 66.4 | 79.7 | 16 / 35 | 5079 |
| 5 | 1 | 68.5 | 86.7 | 17 / 35 | 5394 |
| 6 | 1 | 66.5 | 78.4 | 16 / 35 | 5259 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 37 | 89% |
| oog.melee.Mercutio 1.0 | 29 | 79% |
| cx.BlestPain 1.41 | 28 | 36% |
| nic.Nicator 2.4 | 26 | 77% |
| ahf.NanoAndrew .4 | 7 | 86% |
| maribo.melee.BMV 0.1 | 4 | 50% |

Hadur died in 116 of 210 rounds, at a mean tick of 939. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 30% | 49 |
| et.Predator 1.8 | 20 | 17% | 49 |
| oog.melee.Mercutio 1.0 | 20 | 17% | 44 |
| ahf.NanoAndrew .4 | 16 | 14% | 19 |
| nic.Nicator 2.4 | 12 | 10% | 34 |
| maribo.melee.BMV 0.1 | 11 | 9% | 11 |
| tex.Longbot 0.4 | 2 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 1 |

## Melee bench: F18

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 86.2 | 125 / 210 | 2.24 | 18.3% | 27356 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.3% | 125 |
| morbid.MorbidPriest 1.0 | 2.2 | 13.0% | 26 |
| agd.Mooserwirt2 2.7 | 3.7 | 11.9% | 22 |
| uji.DBH 1.1 | 4.3 | 10.8% | 15 |
| spinnercat.Robovirus 2.718 | 4.8 | 10.4% | 9 |
| ratosh.Nobo 0.21 | 5.0 | 10.3% | 4 |
| sigterm.Sigterm 1.0 | 7.2 | 7.4% | 4 |
| kawigi.mini.Fhqwhgads 1.1 | 8.0 | 7.0% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 5.7% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 83.5 | 17 / 35 | 4468 |
| 2 | 1 | 67.4 | 84.4 | 21 / 35 | 4669 |
| 3 | 1 | 68.0 | 87.6 | 21 / 35 | 4593 |
| 4 | 1 | 67.8 | 87.6 | 21 / 35 | 4752 |
| 5 | 1 | 67.1 | 84.8 | 22 / 35 | 4457 |
| 6 | 1 | 68.3 | 89.2 | 23 / 35 | 4417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 47 | 87% |
| agd.Mooserwirt2 2.7 | 31 | 71% |
| uji.DBH 1.1 | 18 | 78% |
| spinnercat.Robovirus 2.718 | 14 | 86% |
| sigterm.Sigterm 1.0 | 12 | 83% |
| ratosh.Nobo 0.21 | 12 | 92% |
| stelo.WangRobot 1.0 | 12 | 92% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 80% |

Hadur died in 86 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 30 | 35% | 72 |
| agd.Mooserwirt2 2.7 | 13 | 15% | 40 |
| spinnercat.Robovirus 2.718 | 12 | 14% | 20 |
| ratosh.Nobo 0.21 | 10 | 12% | 21 |
| uji.DBH 1.1 | 9 | 10% | 21 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 5% | 6 |
| stelo.WangRobot 1.0 | 3 | 3% | 13 |
| sigterm.Sigterm 1.0 | 2 | 2% | 12 |
| kawigi.mini.Fhqwhgads 1.1 | 2 | 2% | 5 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 95.6 | 169 / 210 | 1.40 | 21.4% | 36158 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 21.4% | 169 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.1% | 16 |
| mld.Infinity 2.2 | 2.8 | 13.7% | 22 |
| erdnis.Rover 0.3 | 4.5 | 10.4% | 0 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.5% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 1 |
| mbh.Mbh 0.1 | 7.5 | 6.9% | 0 |
| pac.ABC 2.1 | 7.8 | 6.5% | 1 |
| pbg.R2D2 1.0 | 8.7 | 5.9% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 96.2 | 30 / 35 | 5655 |
| 2 | 1 | 73.3 | 98.1 | 31 / 35 | 6252 |
| 3 | 1 | 72.9 | 96.2 | 28 / 35 | 6439 |
| 4 | 1 | 71.7 | 94.0 | 27 / 35 | 5740 |
| 5 | 1 | 72.6 | 94.0 | 28 / 35 | 6273 |
| 6 | 1 | 71.8 | 95.2 | 25 / 35 | 5799 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 93% |
| mld.Infinity 2.2 | 52 | 81% |
| erdnis.Rover 0.3 | 13 | 100% |
| krillr.mini.JointStrike 2.0.0 | 12 | 92% |
| patson.PatsonTestBot 1.0 | 7 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| mbh.Mbh 0.1 | 3 | 100% |

Hadur died in 41 of 210 rounds, at a mean tick of 1372. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 18 | 44% | 108 |
| mld.Infinity 2.2 | 17 | 41% | 33 |
| erdnis.Rover 0.3 | 3 | 7% | 16 |
| krillr.mini.JointStrike 2.0.0 | 2 | 5% | 23 |
| pbg.R2D2 1.0 | 1 | 2% | 8 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 6 |

## Melee bench: F20

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 124 / 210 | 1.83 | 19.9% | 34196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.9% | 124 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.2% | 39 |
| fwb.Nine 1.0.1 | 3.8 | 10.8% | 20 |
| catcat20.Rabbit 0.001 | 4.0 | 10.8% | 18 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 10.7% | 4 |
| m3thos.mini.Eva01 0.5.5 | 6.2 | 7.9% | 0 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.7% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.3% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.5 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 89.8 | 18 / 35 | 5609 |
| 2 | 1 | 70.2 | 89.8 | 21 / 35 | 5905 |
| 3 | 1 | 69.7 | 91.4 | 20 / 35 | 5345 |
| 4 | 1 | 69.5 | 89.2 | 19 / 35 | 5613 |
| 5 | 1 | 69.8 | 89.5 | 21 / 35 | 5655 |
| 6 | 1 | 71.6 | 94.6 | 25 / 35 | 6069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 80 | 80% |
| catcat20.Rabbit 0.001 | 34 | 68% |
| fwb.Nine 1.0.1 | 25 | 72% |
| nz.jdc.nano.GridFu 1.0 | 12 | 83% |
| bayen.nut.Squirrel 1.615 | 4 | 100% |
| djdjdj.NanoSkunk10 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 1097. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 42 | 48% | 104 |
| fwb.Nine 1.0.1 | 18 | 21% | 19 |
| catcat20.Rabbit 0.001 | 14 | 16% | 36 |
| nz.jdc.nano.GridFu 1.0 | 11 | 13% | 33 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 8 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 2 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 91.6 | 132 / 210 | 1.76 | 20.5% | 35930 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 20.5% | 132 |
| eem.EvBot v4.6.16 | 2.0 | 16.0% | 54 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.4% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 3 |
| oa.weak.BotherBot 0.1 | 5.5 | 8.4% | 0 |
| eld.Hmm 1.0 | 5.5 | 8.3% | 10 |
| el.JumpShoot 0.2 | 7.5 | 6.0% | 0 |
| fire219.CatBot 1.0 | 7.7 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.4 | 22 / 35 | 5972 |
| 2 | 1 | 71.9 | 95.2 | 27 / 35 | 5873 |
| 3 | 1 | 71.3 | 94.0 | 25 / 35 | 5739 |
| 4 | 1 | 71.2 | 92.7 | 21 / 35 | 6153 |
| 5 | 1 | 70.4 | 87.0 | 17 / 35 | 6322 |
| 6 | 1 | 70.4 | 89.2 | 20 / 35 | 5871 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 73% |
| dummy.mini.Scimitar 1.01 | 36 | 89% |
| cf.RiO.RiOx 4.2.1 | 13 | 92% |
| eld.Hmm 1.0 | 13 | 62% |
| el.JumpShoot 0.2 | 3 | 100% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1320. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 44 | 56% | 97 |
| dummy.mini.Scimitar 1.01 | 20 | 26% | 68 |
| cf.RiO.RiOx 4.2.1 | 7 | 9% | 15 |
| eld.Hmm 1.0 | 6 | 8% | 23 |
| el.JumpShoot 0.2 | 1 | 1% | 3 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 4 |

## Melee bench: F22

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.9 | 88 / 210 | 2.27 | 18.1% | 31373 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.2 | 18.1% | 88 |
| pe.SandboxDT 2.71m | 2.2 | 16.3% | 61 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.1% | 38 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 16 |
| bigpete.Stewie 1.0 | 5.0 | 10.3% | 4 |
| yk.JahRoslav 1.1 | 6.5 | 6.6% | 1 |
| tad.Dalek98 0.98 | 7.0 | 6.7% | 2 |
| gg.Squaraus 0.6 | 7.8 | 5.7% | 0 |
| pbg.NinjaX 1.2 | 8.7 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 87.3 | 14 / 35 | 4923 |
| 2 | 1 | 68.3 | 85.1 | 15 / 35 | 5255 |
| 3 | 1 | 68.4 | 87.6 | 15 / 35 | 4920 |
| 4 | 1 | 69.3 | 87.3 | 16 / 35 | 5652 |
| 5 | 2 | 67.3 | 81.0 | 10 / 35 | 5432 |
| 6 | 1 | 68.7 | 87.0 | 18 / 35 | 5191 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 46 | 48% |
| kvk.HebusLeTroll 0.35 | 46 | 72% |
| jlm.javaDisturbance 0.59 | 33 | 70% |
| bigpete.Stewie 1.0 | 6 | 83% |
| yk.JahRoslav 1.1 | 3 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 122 of 210 rounds, at a mean tick of 971. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 44 | 36% | 71 |
| kvk.HebusLeTroll 0.35 | 40 | 33% | 65 |
| jlm.javaDisturbance 0.59 | 24 | 20% | 48 |
| tad.Dalek98 0.98 | 6 | 5% | 7 |
| bigpete.Stewie 1.0 | 5 | 4% | 13 |
| gg.Squaraus 0.6 | 2 | 2% | 2 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.3 | 133 / 210 | 1.87 | 19.4% | 30646 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.4% | 133 |
| pe.SandboxLump 1.52 | 2.0 | 17.1% | 52 |
| cre.Karolos 0.32 | 3.2 | 13.9% | 15 |
| stelo.AreaTargetingBot 1.1 | 3.8 | 11.9% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.0% | 1 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 8.9% | 2 |
| cw.megas.Blade 0.8 | 7.2 | 7.8% | 0 |
| sample.Walls 1.0 | 7.5 | 7.1% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 88.9 | 24 / 35 | 5176 |
| 2 | 1 | 70.0 | 89.5 | 20 / 35 | 5032 |
| 3 | 1 | 70.9 | 92.1 | 23 / 35 | 4971 |
| 4 | 1 | 70.3 | 91.1 | 21 / 35 | 4970 |
| 5 | 1 | 70.0 | 87.9 | 21 / 35 | 5128 |
| 6 | 1 | 70.8 | 92.4 | 24 / 35 | 5369 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 89 | 73% |
| cre.Karolos 0.32 | 36 | 89% |
| stelo.AreaTargetingBot 1.1 | 23 | 96% |
| stelo.RamTrackSurfer 1.2 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 47 | 60% | 115 |
| cre.Karolos 0.32 | 15 | 19% | 47 |
| stelo.AreaTargetingBot 1.1 | 10 | 13% | 21 |
| stelo.RamTrackSurfer 1.2 | 3 | 4% | 14 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 4% | 6 |
| sample.Walls 1.0 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 2 |
| cw.megas.Blade 0.8 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.4 | 72 / 210 | 3.21 | 15.2% | 22165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.3 | 15.2% | 72 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.6% | 31 |
| florent.XSeries.X2 0.12 | 2.8 | 13.7% | 38 |
| davidalves.Phoenix 0.54 | 3.7 | 12.6% | 39 |
| pedersen.Ugluk 1.1.1 | 4.5 | 12.0% | 20 |
| stelo.SoJNanoMelee 1.1 | 6.5 | 8.6% | 5 |
| oog.melee.Corsair 1.0 | 6.5 | 8.8% | 4 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.0 | 4.9% | 0 |
| evd.X1 0.01 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 83.2 | 21 / 35 | 4149 |
| 2 | 1 | 63.4 | 78.1 | 10 / 35 | 3742 |
| 3 | 3 | 61.0 | 69.5 | 8 / 35 | 3675 |
| 4 | 1 | 63.7 | 76.5 | 12 / 35 | 3847 |
| 5 | 1 | 61.9 | 72.4 | 10 / 35 | 3461 |
| 6 | 1 | 61.3 | 72.7 | 11 / 35 | 3291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 28 | 71% |
| stelo.SoJNanoMelee 1.1 | 20 | 100% |
| davidalves.Phoenix 0.54 | 17 | 59% |
| florent.XSeries.X2 0.12 | 16 | 44% |
| pedersen.Ugluk 1.1.1 | 15 | 73% |
| oog.melee.Corsair 1.0 | 4 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 684. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 25% | 57 |
| florent.XSeries.X2 0.12 | 33 | 24% | 47 |
| pedersen.Ugluk 1.1.1 | 30 | 22% | 42 |
| davidalves.Phoenix 0.54 | 25 | 18% | 37 |
| oog.melee.Corsair 1.0 | 7 | 5% | 11 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 10 |
| evd.X1 0.01 | 1 | 1% | 2 |
| lunchie.Lunchbox 0.93 | 1 | 1% | 2 |
| as.FrankTheTank 1.3 | 0 | 0% | 2 |

## Melee bench: F25

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.8 | 125 / 210 | 2.28 | 18.5% | 26370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.5% | 125 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.8% | 21 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 13.0% | 19 |
| jdw.Hurricane 1.4 | 4.0 | 11.7% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 9 |
| ds.Oo 2.2 | 5.8 | 9.0% | 10 |
| gjr.Cephalosporin 0.1 | 7.2 | 7.2% | 2 |
| awesomeness.Elite 1.0 | 8.0 | 6.9% | 0 |
| adt.Ar2 1.1 | 8.3 | 6.2% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.7 | 21 / 35 | 4304 |
| 2 | 1 | 67.1 | 85.7 | 21 / 35 | 3780 |
| 3 | 1 | 69.0 | 88.3 | 22 / 35 | 4709 |
| 4 | 1 | 67.0 | 81.9 | 20 / 35 | 4350 |
| 5 | 1 | 67.7 | 85.7 | 19 / 35 | 4475 |
| 6 | 1 | 68.7 | 87.6 | 22 / 35 | 4752 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 54 | 85% |
| voidious.micro.BlitzBat 1.05 | 40 | 85% |
| jdw.Hurricane 1.4 | 22 | 86% |
| ds.Oo 2.2 | 9 | 89% |
| gre.svman4.Morfeas 1.4.1 | 8 | 38% |
| awesomeness.Elite 1.0 | 8 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| adt.Ar2 1.1 | 1 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 671. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 22 | 26% | 54 |
| voidious.mini.BrokenSword 2.0.3 | 21 | 25% | 62 |
| jdw.Hurricane 1.4 | 14 | 16% | 26 |
| ds.Oo 2.2 | 12 | 14% | 29 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 9 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 16 |
| awesomeness.Elite 1.0 | 3 | 4% | 6 |
| amk.ChumbaMini 0.2 | 3 | 4% | 4 |
| adt.Ar2 1.1 | 2 | 2% | 3 |

## Melee bench: F26

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.2 | 130 / 210 | 1.89 | 19.6% | 35128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.6% | 130 |
| ak.Fermat 2.0 | 2.0 | 14.4% | 32 |
| lrem.Spectre 0.4.4 | 3.2 | 12.6% | 20 |
| shu.nitro.LENIN .T34 | 4.0 | 11.8% | 23 |
| js.PinBall 1.6 | 5.5 | 9.9% | 4 |
| jaybot.adv.bots.JayBot 2.0 | 5.8 | 9.4% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 9.4% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 84.1 | 18 / 35 | 5716 |
| 2 | 1 | 71.1 | 94.3 | 26 / 35 | 5722 |
| 3 | 1 | 71.8 | 95.2 | 28 / 35 | 6171 |
| 4 | 1 | 69.9 | 89.2 | 20 / 35 | 5823 |
| 5 | 1 | 69.8 | 90.5 | 19 / 35 | 6091 |
| 6 | 1 | 68.9 | 87.6 | 19 / 35 | 5605 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 47 | 81% |
| ak.Fermat 2.0 | 46 | 78% |
| lrem.Spectre 0.4.4 | 39 | 74% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 100% |
| js.PinBall 1.6 | 9 | 78% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 898. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 25 | 31% | 62 |
| lrem.Spectre 0.4.4 | 23 | 29% | 53 |
| shu.nitro.LENIN .T34 | 22 | 28% | 62 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 9 |
| js.PinBall 1.6 | 3 | 4% | 11 |
| gh.mini.GrubbmOne 1.0 | 3 | 4% | 7 |
| fullsail.LaxativeTeaTwo 1.0 | 0 | 0% | 4 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.9 | 122 / 210 | 2.36 | 18.5% | 29935 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.5% | 122 |
| mk.Alpha 0.2.1 | 2.2 | 14.4% | 49 |
| EH.Eagle 1.0.6 | 3.7 | 11.3% | 5 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.4% | 10 |
| wee.Gem 1.8.4 | 5.2 | 10.3% | 16 |
| techdude.kombat.FlamingKombat 1.5 | 5.5 | 9.2% | 3 |
| joe.ADinosaur 1.0 | 7.2 | 7.7% | 0 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.2% | 4 |
| caimano.Furia_Ceca 0.22 | 8.8 | 6.7% | 2 |
| cs.Grudge 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 84.1 | 22 / 35 | 4683 |
| 2 | 1 | 69.0 | 81.0 | 18 / 35 | 5775 |
| 3 | 1 | 69.5 | 92.1 | 26 / 35 | 4744 |
| 4 | 1 | 68.5 | 79.4 | 17 / 35 | 5947 |
| 5 | 1 | 66.8 | 85.4 | 18 / 35 | 4378 |
| 6 | 1 | 67.4 | 87.6 | 21 / 35 | 4408 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 57 | 82% |
| wee.Gem 1.8.4 | 25 | 80% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 95% |
| EH.Eagle 1.0.6 | 19 | 95% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| throxbot.ThroxBot 0.1 | 6 | 83% |
| joe.ADinosaur 1.0 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 693. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 36 | 41% | 76 |
| sheldor.melee.nano.TestMelee 0.1 | 14 | 16% | 38 |
| EH.Eagle 1.0.6 | 11 | 13% | 25 |
| wee.Gem 1.8.4 | 8 | 9% | 30 |
| joe.ADinosaur 1.0 | 6 | 7% | 8 |
| throxbot.ThroxBot 0.1 | 5 | 6% | 16 |
| caimano.Furia_Ceca 0.22 | 4 | 5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 3% | 10 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 89.8 | 142 / 210 | 1.92 | 19.1% | 27246 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.1% | 142 |
| kid.test.NightFox .2 | 2.0 | 15.3% | 34 |
| uji.Antique 1.0 | 3.2 | 11.4% | 18 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.5% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.1% | 5 |
| amk.ChumbaWumba 0.3 | 6.2 | 8.3% | 0 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.9% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.9% | 0 |
| stelo.Lifestealer 1.0 | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 26 / 35 | 4574 |
| 2 | 1 | 68.4 | 88.3 | 24 / 35 | 4661 |
| 3 | 1 | 68.4 | 88.9 | 22 / 35 | 4580 |
| 4 | 1 | 67.6 | 87.0 | 22 / 35 | 4250 |
| 5 | 1 | 69.6 | 93.7 | 23 / 35 | 4549 |
| 6 | 1 | 69.1 | 90.5 | 25 / 35 | 4632 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 83 | 81% |
| uji.Antique 1.0 | 35 | 91% |
| qohnil.blot.BlotBot 3.61 | 18 | 83% |
| amk.ChumbaWumba 0.3 | 13 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 67% |
| stelo.PianistNano 1.2 | 3 | 100% |
| ahr.ice.Ice 1.0.2 | 3 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 2 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 690. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 37% | 83 |
| pfvicm.Sobieski 7.2.3b | 14 | 21% | 24 |
| uji.Antique 1.0 | 10 | 15% | 48 |
| qohnil.blot.BlotBot 3.61 | 7 | 10% | 20 |
| amk.ChumbaWumba 0.3 | 6 | 9% | 15 |
| ahr.ice.Ice 1.0.2 | 3 | 4% | 11 |
| matt.advanced.Katana 1.0 | 2 | 3% | 4 |
| stelo.Lifestealer 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 84.2 | 108 / 210 | 2.42 | 18.5% | 29908 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.5% | 108 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.2% | 45 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 40 |
| myl.micro.Troodon 1.10 | 4.3 | 11.6% | 8 |
| jok.PheonixM 0.1.2 | 4.7 | 10.6% | 5 |
| ph.melee.ArcherME 0.3 | 6.3 | 8.0% | 0 |
| DBall.Anarchy 0.1 | 7.0 | 7.0% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.2 | 4.3% | 0 |
| jangs.ns51 1.0 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 84.4 | 18 / 35 | 5233 |
| 2 | 1 | 69.4 | 87.3 | 19 / 35 | 5036 |
| 3 | 1 | 69.5 | 87.6 | 18 / 35 | 5316 |
| 4 | 1 | 66.9 | 80.6 | 15 / 35 | 4336 |
| 5 | 1 | 68.0 | 81.3 | 19 / 35 | 5064 |
| 6 | 1 | 68.4 | 84.1 | 19 / 35 | 4923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 55 | 78% |
| zyx.mega.YersiniaPestis 3.1 | 52 | 63% |
| myl.micro.Troodon 1.10 | 16 | 94% |
| jok.PheonixM 0.1.2 | 10 | 90% |
| DBall.Anarchy 0.1 | 7 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 36 | 35% | 79 |
| zyx.mega.YersiniaPestis 3.1 | 35 | 34% | 69 |
| myl.micro.Troodon 1.10 | 15 | 15% | 29 |
| jok.PheonixM 0.1.2 | 7 | 7% | 16 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 4% | 4 |
| DBall.Anarchy 0.1 | 3 | 3% | 10 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 3 |

## Melee bench: F30

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 73.9 | 54 / 210 | 3.35 | 14.7% | 23179 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.5 | 14.7% | 54 |
| catcat20.Matcha 0.006 | 2.7 | 13.8% | 48 |
| oog.melee.Capulet 1.2 | 3.3 | 13.8% | 30 |
| darkcanuck.B26354 1.06 | 3.7 | 13.4% | 43 |
| stelo.PastFuture 2.3.2 | 3.8 | 13.1% | 27 |
| intruder.PrairieWolf 2.61 | 6.8 | 7.4% | 2 |
| fowl3628800.LightningBolt 2.6.0 | 7.0 | 7.3% | 3 |
| ntc.Opposite 1.5 | 7.2 | 7.5% | 1 |
| tripphippy.Alice 1.1 | 9.0 | 6.4% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.4 | 74.0 | 10 / 35 | 3657 |
| 2 | 1 | 63.0 | 77.1 | 7 / 35 | 3750 |
| 3 | 1 | 64.9 | 78.4 | 10 / 35 | 4363 |
| 4 | 2 | 61.6 | 71.1 | 8 / 35 | 3773 |
| 5 | 3 | 60.6 | 67.9 | 9 / 35 | 3628 |
| 6 | 1 | 62.9 | 74.6 | 10 / 35 | 4008 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 31 | 42% |
| oog.melee.Capulet 1.2 | 20 | 60% |
| darkcanuck.B26354 1.06 | 19 | 42% |
| stelo.PastFuture 2.3.2 | 18 | 78% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| intruder.PrairieWolf 2.61 | 2 | 100% |
| tripphippy.Alice 1.1 | 2 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 38 | 24% | 50 |
| darkcanuck.B26354 1.06 | 37 | 24% | 48 |
| stelo.PastFuture 2.3.2 | 33 | 21% | 44 |
| oog.melee.Capulet 1.2 | 27 | 17% | 40 |
| ntc.Opposite 1.5 | 8 | 5% | 10 |
| intruder.PrairieWolf 2.61 | 5 | 3% | 8 |
| fowl3628800.LightningBolt 2.6.0 | 4 | 3% | 6 |
| tripphippy.Alice 1.1 | 4 | 3% | 4 |

## Melee bench: F31

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 73.9 | 57 / 210 | 3.35 | 14.8% | 22122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.7% | 87 |
| hadur117.mini.DeiseFA 0.3 | 2.2 | 14.8% | 57 |
| gh.mini.Griezel 0.2 | 2.8 | 13.7% | 44 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 12.2% | 11 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.9% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.7% | 4 |
| timmit.nano.TimDog 0.33 | 7.0 | 6.9% | 1 |
| fm.mammillarias 1.3 | 8.2 | 6.2% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 74.3 | 8 / 35 | 3629 |
| 2 | 2 | 65.2 | 78.7 | 14 / 35 | 4129 |
| 3 | 2 | 62.8 | 73.7 | 7 / 35 | 3631 |
| 4 | 3 | 59.9 | 67.9 | 9 / 35 | 3378 |
| 5 | 2 | 63.8 | 76.5 | 10 / 35 | 3678 |
| 6 | 2 | 62.3 | 72.4 | 9 / 35 | 3677 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 46 | 63% |
| gh.mini.Griezel 0.2 | 31 | 42% |
| spinnercat.micro.Tyger 0.1 | 12 | 83% |
| d414.nano.Quantum 1.0.0 | 5 | 100% |

Hadur died in 154 of 210 rounds, at a mean tick of 755. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.mini.Griezel 0.2 | 54 | 35% | 71 |
| abc.Shadow 3.84i | 43 | 28% | 69 |
| spinnercat.micro.Tyger 0.1 | 25 | 16% | 32 |
| d414.nano.Quantum 1.0.0 | 13 | 8% | 17 |
| timmit.nano.TimDog 0.33 | 7 | 5% | 7 |
| gh.nano.Grofvuil 0.2 | 5 | 3% | 8 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 90.0 | 130 / 210 | 1.90 | 19.0% | 29528 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.0% | 130 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.7% | 54 |
| apc.botM 3.0 | 3.5 | 11.4% | 12 |
| lxx.ConceptA 0.8 | 3.7 | 10.9% | 2 |
| vjik.UnViolation 1.1 | 5.3 | 9.2% | 5 |
| bayen.UbaMicro 1.4 | 5.7 | 9.0% | 1 |
| panzer.Panzer 0.2 | 7.2 | 7.3% | 0 |
| conscience.Electron 1.3g | 8.3 | 6.4% | 0 |
| yk.JahMicro 1.0 | 8.3 | 6.4% | 3 |
| donjezza.Jezza 1.0 | 10.0 | 4.9% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 88.3 | 21 / 35 | 4709 |
| 2 | 1 | 70.1 | 94.6 | 25 / 35 | 5099 |
| 3 | 1 | 68.0 | 90.5 | 19 / 35 | 4726 |
| 4 | 1 | 68.5 | 86.7 | 20 / 35 | 5269 |
| 5 | 1 | 67.4 | 85.1 | 21 / 35 | 4642 |
| 6 | 1 | 69.9 | 94.9 | 24 / 35 | 5083 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 94 | 66% |
| apc.botM 3.0 | 26 | 88% |
| lxx.ConceptA 0.8 | 24 | 92% |
| vjik.UnViolation 1.1 | 9 | 100% |
| donjezza.Jezza 1.0 | 5 | 100% |
| panzer.Panzer 0.2 | 5 | 100% |
| yk.JahMicro 1.0 | 3 | 67% |
| bayen.UbaMicro 1.4 | 3 | 67% |

Hadur died in 80 of 210 rounds, at a mean tick of 784. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 46 | 58% | 111 |
| lxx.ConceptA 0.8 | 12 | 15% | 24 |
| apc.botM 3.0 | 11 | 14% | 38 |
| vjik.UnViolation 1.1 | 4 | 5% | 17 |
| bayen.UbaMicro 1.4 | 3 | 4% | 7 |
| panzer.Panzer 0.2 | 2 | 3% | 7 |
| yk.JahMicro 1.0 | 1 | 1% | 3 |
| donjezza.Jezza 1.0 | 1 | 1% | 2 |

## Melee bench: F33

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.0 | 133 / 210 | 2.08 | 19.3% | 30598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.3% | 133 |
| maribo.Quester 0.3 | 2.0 | 15.0% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.7% | 14 |
| labg.Cataclysm 2.05 | 4.5 | 10.6% | 15 |
| gre.svman4.Leonidas 1.3.2 | 4.8 | 10.5% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 5.7 | 9.3% | 11 |
| baal.nano.N 1.42 | 6.8 | 8.3% | 2 |
| zyx.micro.Ant 1.1 | 8.7 | 4.9% | 0 |
| sanja.First 0.1 | 8.7 | 5.0% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 85.7 | 19 / 35 | 5100 |
| 2 | 1 | 68.5 | 85.7 | 20 / 35 | 4974 |
| 3 | 1 | 68.4 | 85.1 | 21 / 35 | 4785 |
| 4 | 1 | 69.5 | 86.7 | 22 / 35 | 5578 |
| 5 | 1 | 70.6 | 92.7 | 26 / 35 | 5241 |
| 6 | 1 | 70.4 | 92.4 | 25 / 35 | 4920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 50 | 80% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 92% |
| gre.svman4.Leonidas 1.3.2 | 30 | 100% |
| labg.Cataclysm 2.05 | 15 | 80% |
| kinsen.melee.Angsaichmophobia 1.8c | 13 | 85% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 100% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 882. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 43% | 78 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 20 | 25% | 62 |
| labg.Cataclysm 2.05 | 8 | 10% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 8 | 10% | 14 |
| gre.svman4.Leonidas 1.3.2 | 6 | 8% | 20 |
| baal.nano.N 1.42 | 1 | 1% | 6 |
| zyx.micro.Ant 1.1 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 85.1 | 74 / 210 | 2.34 | 17.5% | 29537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.3 | 17.5% | 74 |
| stelo.Spread 0.9 | 2.0 | 16.7% | 68 |
| kid.Gladiator .7.2 | 2.7 | 16.0% | 45 |
| jcs.Seth 1.8 | 4.5 | 11.1% | 16 |
| tcf.Reach 3 | 4.7 | 10.8% | 5 |
| cli.Dancer 1.1 | 5.8 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.9% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.4% | 0 |
| sample.RamFire 1.0 | 9.8 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 88.3 | 14 / 35 | 5369 |
| 2 | 2 | 66.6 | 82.5 | 10 / 35 | 4785 |
| 3 | 1 | 69.0 | 87.3 | 13 / 35 | 5230 |
| 4 | 1 | 69.2 | 87.6 | 16 / 35 | 5134 |
| 5 | 1 | 66.6 | 82.2 | 13 / 35 | 4537 |
| 6 | 2 | 66.1 | 82.5 | 8 / 35 | 4482 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 73 | 48% |
| kid.Gladiator .7.2 | 39 | 51% |
| jcs.Seth 1.8 | 18 | 61% |
| tcf.Reach 3 | 6 | 83% |
| ratosh.Wesco 1.4 | 2 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 1069. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 69 | 51% | 104 |
| kid.Gladiator .7.2 | 42 | 31% | 58 |
| jcs.Seth 1.8 | 15 | 11% | 26 |
| tcf.Reach 3 | 7 | 5% | 13 |
| ratosh.Wesco 1.4 | 2 | 1% | 6 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
| cli.Dancer 1.1 | 0 | 0% | 1 |
| amk.Punbot.Punbot 0.01 | 0 | 0% | 1 |

## Melee bench: F35

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 78.3 | 40 / 210 | 2.95 | 15.1% | 22370 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 143 |
| hadur117.mini.DeiseFA 0.3 | 2.0 | 15.1% | 40 |
| gh.mini.Gruwel 0.9 | 3.0 | 12.9% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.7% | 6 |
| rz.HawkOnFire 0.1 | 4.7 | 11.5% | 1 |
| wit.Chuliath 1.0 | 6.2 | 7.3% | 0 |
| myl.nano.KomoriNinja 1.1 | 7.0 | 6.9% | 2 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.0% | 0 |
| stelo.MyAgileRobot 0.2 | 9.2 | 4.6% | 0 |
| dans.Cinnamon 1.2 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 85.1 | 7 / 35 | 4034 |
| 2 | 2 | 64.3 | 79.4 | 9 / 35 | 3764 |
| 3 | 2 | 64.0 | 79.0 | 7 / 35 | 3693 |
| 4 | 2 | 64.5 | 81.0 | 7 / 35 | 3868 |
| 5 | 2 | 60.8 | 71.4 | 4 / 35 | 3439 |
| 6 | 2 | 62.5 | 74.0 | 6 / 35 | 3572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 70 | 17% |
| gh.mini.Gruwel 0.9 | 18 | 56% |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 100% |
| rz.HawkOnFire 0.1 | 7 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 0% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 90 | 53% | 100 |
| gh.mini.Gruwel 0.9 | 30 | 18% | 41 |
| dmh.robocode.robot.BlackDeath 9.2 | 22 | 13% | 32 |
| rz.HawkOnFire 0.1 | 18 | 11% | 26 |
| wit.Chuliath 1.0 | 4 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 3 | 2% | 3 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |

## Melee bench: F36

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.9 | 171 / 210 | 1.64 | 20.9% | 33363 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 20.9% | 171 |
| alpha.RainingFire 1.0 | 2.7 | 12.3% | 9 |
| bzdp.Pansy 2.1 | 3.5 | 11.8% | 9 |
| mz.Cork 0.1 | 3.8 | 10.6% | 8 |
| bvh.micro.Freya 0.3 | 4.8 | 10.1% | 6 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.6% | 0 |
| m3thos.Eva02 0.7.1 | 6.3 | 9.3% | 4 |
| dl.BetterWalls 1.0 | 8.2 | 5.7% | 0 |
| squidM.TentalceMeleeNano 1.1 | 9.0 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 89.8 | 27 / 35 | 5452 |
| 2 | 1 | 72.2 | 95.6 | 31 / 35 | 6081 |
| 3 | 1 | 71.9 | 96.2 | 29 / 35 | 5596 |
| 4 | 1 | 68.1 | 83.8 | 23 / 35 | 5117 |
| 5 | 1 | 72.7 | 97.5 | 33 / 35 | 5702 |
| 6 | 1 | 71.0 | 94.3 | 28 / 35 | 5415 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 96% |
| alpha.RainingFire 1.0 | 31 | 94% |
| bvh.micro.Freya 0.3 | 25 | 96% |
| mz.Cork 0.1 | 25 | 88% |
| bvh.mini.Fenrir 0.39 | 25 | 100% |
| m3thos.Eva02 0.7.1 | 16 | 100% |
| sample.MyFirstRobot 1.0 | 11 | 91% |
| dl.BetterWalls 1.0 | 2 | 100% |

Hadur died in 39 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 31% | 38 |
| bzdp.Pansy 2.1 | 9 | 23% | 58 |
| mz.Cork 0.1 | 7 | 18% | 39 |
| bvh.micro.Freya 0.3 | 5 | 13% | 26 |
| bvh.mini.Fenrir 0.39 | 2 | 5% | 14 |
| sample.MyFirstRobot 1.0 | 2 | 5% | 6 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 20 |
| dl.BetterWalls 1.0 | 1 | 3% | 6 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 95.1 | 184 / 210 | 1.44 | 20.8% | 35018 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 20.8% | 184 |
| germ.TheMind .2 | 2.5 | 10.6% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.1% | 2 |
| EBBU.Sim2 1.02 | 3.7 | 9.7% | 4 |
| stelo.UntouchableNano 1.3 | 5.8 | 8.8% | 1 |
| lmk.ACPFinal 0.1 | 6.2 | 8.6% | 1 |
| agrach.Dalek 1.0 | 6.5 | 8.4% | 4 |
| mb.Beast 0.1 | 8.3 | 7.8% | 6 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.2 | 7.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.7 | 31 / 35 | 5771 |
| 2 | 1 | 69.3 | 92.1 | 27 / 35 | 5715 |
| 3 | 1 | 70.2 | 95.6 | 32 / 35 | 5536 |
| 4 | 1 | 71.2 | 97.1 | 32 / 35 | 6169 |
| 5 | 1 | 70.7 | 96.2 | 30 / 35 | 6243 |
| 6 | 1 | 70.5 | 96.2 | 32 / 35 | 5584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 47 | 98% |
| EBBU.Sim2 1.02 | 31 | 94% |
| stelo.UntouchableNano 1.3 | 28 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 100% |
| skm.Ryubot 1.0 | 17 | 94% |
| mb.Beast 0.1 | 16 | 94% |
| agrach.Dalek 1.0 | 16 | 100% |
| lmk.ACPFinal 0.1 | 12 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 2 | 100% |

Hadur died in 27 of 210 rounds, at a mean tick of 475. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 4 | 15% | 38 |
| EBBU.Sim2 1.02 | 4 | 15% | 28 |
| lmk.ACPFinal 0.1 | 4 | 15% | 20 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 11% | 37 |
| agrach.Dalek 1.0 | 3 | 11% | 28 |
| mb.Beast 0.1 | 3 | 11% | 23 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 11% | 7 |
| stelo.UntouchableNano 1.3 | 2 | 7% | 21 |
| skm.Ryubot 1.0 | 1 | 4% | 6 |

## Melee bench: F38

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 79.9 | 81 / 210 | 2.80 | 16.4% | 25704 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.2 | 16.4% | 81 |
| justin.Mallais 14.0 | 1.8 | 15.8% | 69 |
| bvh.mini.Freya 0.55 | 3.0 | 13.0% | 17 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.4% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.3 | 10.4% | 8 |
| cs.Wren 1.0 | 5.3 | 10.7% | 9 |
| kdf.KoulDestroyer 1.0 | 7.0 | 7.8% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 2 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.4% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 73.7 | 8 / 35 | 4151 |
| 2 | 1 | 67.2 | 86.7 | 16 / 35 | 4334 |
| 3 | 2 | 64.7 | 79.4 | 15 / 35 | 4008 |
| 4 | 1 | 64.7 | 79.0 | 14 / 35 | 4044 |
| 5 | 1 | 65.0 | 77.5 | 12 / 35 | 4419 |
| 6 | 1 | 67.1 | 83.5 | 16 / 35 | 4748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 47 | 64% |
| bts.mega.Gnarly 1.4 | 18 | 56% |
| davidalves.net.DuelistNanoMelee 1.01 | 15 | 87% |
| cs.Wren 1.0 | 13 | 77% |
| bvh.mini.Freya 0.55 | 10 | 90% |
| kdf.KoulDestroyer 1.0 | 5 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 60% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 51 | 39% | 84 |
| bvh.mini.Freya 0.55 | 24 | 18% | 33 |
| bts.mega.Gnarly 1.4 | 21 | 16% | 34 |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 9% | 25 |
| cs.Wren 1.0 | 9 | 7% | 15 |
| kdf.KoulDestroyer 1.0 | 5 | 4% | 9 |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 4% | 7 |
| matt.UnderDark3 2.4.34 | 3 | 2% | 3 |

## Melee bench: F39

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 84.0 | 96 / 210 | 2.44 | 17.6% | 29216 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 17.6% | 96 |
| bvh.fry.Freya 0.82 | 2.3 | 14.4% | 23 |
| az.Ololobot 0.2.4 | 3.0 | 13.0% | 55 |
| catcat20.Lambda 0.024 | 3.7 | 11.6% | 26 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.5% | 9 |
| gimp.GimpBot 0.1 | 6.5 | 8.2% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.2% | 1 |
| apollokidd.ApolloKidd 0.9 | 7.2 | 7.3% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 5.6% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 82.9 | 17 / 35 | 4919 |
| 2 | 1 | 67.7 | 86.3 | 20 / 35 | 4912 |
| 3 | 1 | 66.5 | 83.2 | 15 / 35 | 4990 |
| 4 | 1 | 67.3 | 86.3 | 17 / 35 | 4904 |
| 5 | 1 | 65.5 | 81.6 | 12 / 35 | 4676 |
| 6 | 1 | 66.6 | 83.8 | 15 / 35 | 4815 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bvh.fry.Freya 0.82 | 42 | 76% |
| az.Ololobot 0.2.4 | 37 | 65% |
| catcat20.Lambda 0.024 | 34 | 65% |
| stelo.SoRobotNanoMelee 1.2 | 14 | 93% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 34 | 29% | 63 |
| catcat20.Lambda 0.024 | 28 | 24% | 48 |
| az.Ololobot 0.2.4 | 24 | 21% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 20 | 17% | 25 |
| gimp.GimpBot 0.1 | 5 | 4% | 10 |
| whitesquare.robots.SkynetAdvanced 1.1 | 2 | 2% | 2 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 7 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 4 |
1 death(s) with no robot to name.

## Melee bench: F40

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 85.7 | 114 / 210 | 2.29 | 18.3% | 28873 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.3% | 114 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.1% | 44 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 13.0% | 25 |
| mz.AntiGrav 1.0 | 4.5 | 10.7% | 5 |
| Polkwane.SmashMelee 1.0 | 4.5 | 11.0% | 8 |
| stelo.Randomness 1.0 | 6.2 | 8.8% | 12 |
| alpha.BlackIce 1.0 | 6.8 | 7.9% | 1 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.4% | 1 |
| sample.Corners 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.5 | 18 / 35 | 4615 |
| 2 | 1 | 68.8 | 87.6 | 20 / 35 | 4892 |
| 3 | 1 | 68.2 | 86.0 | 20 / 35 | 4731 |
| 4 | 1 | 68.4 | 86.0 | 20 / 35 | 5003 |
| 5 | 1 | 68.4 | 86.0 | 20 / 35 | 5104 |
| 6 | 1 | 67.6 | 84.8 | 16 / 35 | 4528 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 60 | 77% |
| kano.gamma.KanoGamma 1.8 | 31 | 81% |
| Polkwane.SmashMelee 1.0 | 23 | 78% |
| stelo.Randomness 1.0 | 10 | 70% |
| mz.AntiGrav 1.0 | 9 | 100% |
| alpha.BlackIce 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| sample.Corners 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 96 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 40% | 74 |
| kano.gamma.KanoGamma 1.8 | 14 | 15% | 48 |
| Polkwane.SmashMelee 1.0 | 12 | 13% | 27 |
| stelo.Randomness 1.0 | 12 | 13% | 22 |
| mz.AntiGrav 1.0 | 8 | 8% | 13 |
| alpha.BlackIce 1.0 | 5 | 5% | 12 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 5 |
| sample.Corners 1.0 | 2 | 2% | 5 |
| testantiswapgun.AntiSwap 1.0 | 2 | 2% | 4 |

## Melee bench: F41

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 85.6 | 107 / 210 | 2.30 | 17.7% | 26458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 17.7% | 107 |
| eem.EvBotNG v12.8 | 2.0 | 15.5% | 63 |
| ary.Swarm 1.1 | 3.3 | 13.4% | 10 |
| lessonz.robocode.Oz 0.5.0 | 3.8 | 12.9% | 15 |
| simonton.nano.MeleeSeed 1.8 | 4.8 | 10.8% | 10 |
| shrub.Silver v048 | 6.2 | 8.1% | 1 |
| zyx.nano.Ant 1.1 | 7.2 | 7.4% | 0 |
| jsal.Jsalbot 1.0 | 8.3 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.3 | 6.0% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 84.1 | 17 / 35 | 4658 |
| 2 | 1 | 66.0 | 81.9 | 17 / 35 | 4007 |
| 3 | 1 | 67.9 | 87.3 | 21 / 35 | 4201 |
| 4 | 1 | 67.5 | 87.3 | 15 / 35 | 4429 |
| 5 | 1 | 67.9 | 86.0 | 19 / 35 | 4403 |
| 6 | 1 | 68.1 | 86.7 | 18 / 35 | 4760 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 64 | 56% |
| ary.Swarm 1.1 | 30 | 80% |
| lessonz.robocode.Oz 0.5.0 | 24 | 88% |
| simonton.nano.MeleeSeed 1.8 | 19 | 95% |
| stelo.Mirror 1.1 | 4 | 100% |
| jsal.Jsalbot 1.0 | 3 | 100% |
| shrub.Silver v048 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 42 | 40% | 82 |
| ary.Swarm 1.1 | 29 | 28% | 48 |
| lessonz.robocode.Oz 0.5.0 | 14 | 13% | 29 |
| simonton.nano.MeleeSeed 1.8 | 12 | 12% | 33 |
| jsal.Jsalbot 1.0 | 2 | 2% | 9 |
| stelo.Mirror 1.1 | 2 | 2% | 7 |
| shrub.Silver v048 | 1 | 1% | 1 |
| zyx.nano.Ant 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 85.0 | 99 / 210 | 2.35 | 18.0% | 30958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 18.0% | 99 |
| wompi.Wallaby 5.1 | 2.3 | 15.1% | 46 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.8% | 23 |
| ara.Shera 0.88 | 3.3 | 13.6% | 34 |
| amz.NanoClone 1.41 | 5.0 | 9.4% | 3 |
| maribo.IotaCT 1.1 | 6.7 | 6.9% | 1 |
| dsw.StaticD 1.0 | 6.7 | 7.2% | 4 |
| stelo.MirrorMicro 1.0 | 7.8 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 81.3 | 13 / 35 | 5069 |
| 2 | 1 | 68.2 | 87.9 | 19 / 35 | 5109 |
| 3 | 1 | 67.9 | 84.1 | 21 / 35 | 5173 |
| 4 | 1 | 67.3 | 82.5 | 13 / 35 | 5246 |
| 5 | 1 | 68.5 | 87.9 | 17 / 35 | 5397 |
| 6 | 1 | 67.5 | 86.0 | 16 / 35 | 4964 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 48 | 60% |
| maribo.mini.MiniQuester 0.1 | 39 | 85% |
| wompi.Wallaby 5.1 | 34 | 82% |
| dsw.StaticD 1.0 | 5 | 100% |
| amz.NanoClone 1.41 | 3 | 67% |
| maribo.IotaCT 1.1 | 2 | 50% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 38 | 34% | 64 |
| wompi.Wallaby 5.1 | 31 | 28% | 68 |
| maribo.mini.MiniQuester 0.1 | 25 | 23% | 51 |
| amz.NanoClone 1.41 | 12 | 11% | 15 |
| dsw.StaticD 1.0 | 2 | 2% | 7 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 72.0 | 28 / 210 | 3.52 | 13.9% | 22074 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.3% | 155 |
| hadur117.mini.DeiseFA 0.3 | 2.3 | 13.9% | 28 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.5% | 17 |
| dummy.micro.Sparrow 2.5 | 3.7 | 12.2% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 4.8 | 10.9% | 5 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.9% | 3 |
| mz.NanoGod 2.02 | 7.3 | 7.4% | 0 |
| jab.DiamondStealer 5 | 7.7 | 7.2% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.6 | 72.7 | 5 / 35 | 3591 |
| 2 | 2 | 61.0 | 68.3 | 1 / 35 | 3515 |
| 3 | 4 | 62.4 | 69.2 | 4 / 35 | 3695 |
| 4 | 2 | 61.9 | 69.8 | 5 / 35 | 3581 |
| 5 | 2 | 63.9 | 75.2 | 6 / 35 | 3768 |
| 6 | 2 | 64.7 | 76.8 | 7 / 35 | 3924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 15% |
| brainfade.melee.Dusk 0.44 | 13 | 77% |
| dummy.micro.Sparrow 2.5 | 6 | 83% |
| wcsv.melee.EngineerMelee 0.1 | 4 | 75% |

Hadur died in 185 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 52% | 106 |
| dummy.micro.Sparrow 2.5 | 33 | 18% | 40 |
| brainfade.melee.Dusk 0.44 | 23 | 12% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 13 | 7% | 14 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 11 |
| mz.NanoGod 2.02 | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |
3 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 86.7 | 112 / 210 | 2.20 | 19.0% | 32519 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 19.0% | 112 |
| stelo.Liblix 0.3.1 | 2.0 | 15.7% | 59 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.3% | 23 |
| wompi.Quokka 1.6 | 4.7 | 10.0% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.4% | 4 |
| jwirde.Gort 2.0 | 6.2 | 8.8% | 3 |
| disan.Chair 2.2.0 | 6.3 | 8.0% | 1 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.8% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 4.9% | 0 |
| sample.Crazy 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.1 | 15 / 35 | 5458 |
| 2 | 1 | 69.4 | 89.2 | 18 / 35 | 5476 |
| 3 | 1 | 67.9 | 84.4 | 16 / 35 | 5419 |
| 4 | 1 | 70.1 | 90.5 | 24 / 35 | 5224 |
| 5 | 1 | 68.1 | 82.9 | 17 / 35 | 5370 |
| 6 | 1 | 69.9 | 88.9 | 22 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 80 | 66% |
| tzu.TheArtOfWar 1.2 | 44 | 77% |
| wompi.Quokka 1.6 | 9 | 89% |
| disan.Chair 2.2.0 | 8 | 100% |
| jwirde.Gort 2.0 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 42 | 43% | 100 |
| tzu.TheArtOfWar 1.2 | 21 | 21% | 48 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 12 | 12% | 17 |
| wompi.Quokka 1.6 | 9 | 9% | 16 |
| disan.Chair 2.2.0 | 6 | 6% | 10 |
| amk.jointstrike.JointStrike 0.2 | 3 | 3% | 4 |
| jwirde.Gort 2.0 | 2 | 2% | 9 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 5 |
| sample.Crazy 1.0 | 1 | 1% | 1 |

## Melee bench: F45

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.0 | 89 / 210 | 1.81 | 20.6% | 38139 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.0 | 20.6% | 89 |
| eem.IWillFireNoBullet v2.8 | 2.0 | 13.0% | 108 |
| jje.BagPuss 1.2 | 3.5 | 11.3% | 5 |
| sul.Lunar 1.1 | 4.0 | 10.4% | 4 |
| myl.nano.Graviton 1.10 | 4.7 | 9.7% | 1 |
| hvilela.HVilela 0.9 | 7.0 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 8.2% | 2 |
| fm.claire 1.7 | 7.2 | 7.7% | 0 |
| wit.Deep7 2.0 | 8.7 | 6.4% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 87.6 | 15 / 35 | 6251 |
| 2 | 1 | 69.3 | 89.8 | 14 / 35 | 5914 |
| 3 | 1 | 71.1 | 92.7 | 16 / 35 | 6335 |
| 4 | 1 | 70.6 | 92.1 | 16 / 35 | 6054 |
| 5 | 1 | 71.3 | 92.1 | 16 / 35 | 6941 |
| 6 | 1 | 70.9 | 91.7 | 12 / 35 | 6644 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 123 | 22% |
| jje.BagPuss 1.2 | 15 | 93% |
| sul.Lunar 1.1 | 15 | 87% |
| pez.mini.ChironexFleckeri 0.5 | 14 | 100% |
| myl.nano.Graviton 1.10 | 12 | 100% |
| wit.Deep7 2.0 | 4 | 75% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 2694. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 97 | 80% | 0 |
| sul.Lunar 1.1 | 5 | 4% | 58 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 4% | 30 |
| jje.BagPuss 1.2 | 4 | 3% | 49 |
| fm.claire 1.7 | 4 | 3% | 14 |
| myl.nano.Graviton 1.10 | 3 | 2% | 30 |
| hvilela.HVilela 0.9 | 2 | 2% | 12 |
| wit.Deep7 2.0 | 1 | 1% | 11 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |

## Melee bench: F46

hadur117.mini.DeiseFA 0.3 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 83.9 | 75 / 210 | 2.45 | 16.9% | 26811 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseFA 0.3 | 1.5 | 16.9% | 75 |
| rsalesc.melee.Medina 0.4.5 | 2.0 | 16.3% | 73 |
| kc.mini.Mirage 0.2 | 2.5 | 16.2% | 54 |
| cx.Princess 1.0 | 4.5 | 10.2% | 4 |
| mz.MicroSheep 1.0 | 4.7 | 10.1% | 2 |
| sadoner.killer 0.2 | 6.2 | 8.7% | 0 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.3 | 12 / 35 | 4518 |
| 2 | 1 | 66.0 | 84.8 | 11 / 35 | 4501 |
| 3 | 1 | 67.4 | 86.3 | 14 / 35 | 4798 |
| 4 | 3 | 64.2 | 77.1 | 10 / 35 | 4234 |
| 5 | 2 | 67.1 | 83.5 | 16 / 35 | 4496 |
| 6 | 1 | 66.4 | 85.4 | 12 / 35 | 4264 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 60 | 57% |
| rsalesc.melee.Medina 0.4.5 | 53 | 34% |
| cx.Princess 1.0 | 14 | 86% |
| arthord.NanoSatanMelee Beta | 7 | 86% |
| mz.MicroSheep 1.0 | 4 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 983. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 51 | 38% | 91 |
| rsalesc.melee.Medina 0.4.5 | 48 | 35% | 64 |
| mz.MicroSheep 1.0 | 13 | 10% | 17 |
| cx.Princess 1.0 | 10 | 7% | 17 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 10 |
| sadoner.killer 0.2 | 6 | 4% | 8 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |
| kurios.DOSexe .9a | 1 | 1% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

