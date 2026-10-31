# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.4 | 85.3 | 53 / 210 | 2.32 | 16.7% | 28256 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.2% | 141 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 16.7% | 53 |
| sgp.JollyNinja 3.53 | 3.7 | 11.2% | 12 |
| mz.MicroGodMelee 1 | 4.5 | 10.9% | 2 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 5.3 | 10.0% | 1 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.2 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.4% | 0 |
| mym.EdgeStalker 1.0 | 9.8 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.4 | 84.8 | 11 / 35 | 4577 |
| 2 | 2 | 67.6 | 87.9 | 13 / 35 | 4872 |
| 3 | 2 | 67.5 | 88.9 | 10 / 35 | 4907 |
| 4 | 2 | 67.2 | 87.3 | 8 / 35 | 4816 |
| 5 | 2 | 63.9 | 79.0 | 4 / 35 | 4408 |
| 6 | 2 | 66.1 | 83.8 | 7 / 35 | 4676 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 14% |
| mz.MicroGodMelee 1 | 17 | 100% |
| sgp.JollyNinja 3.53 | 14 | 64% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |
| adt.Ar2 1.0 | 1 | 100% |
| lorneswork.Predator 1.0 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 1240. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 122 | 77% | 142 |
| sgp.JollyNinja 3.53 | 12 | 8% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 11 |
| lorneswork.Predator 1.0 | 7 | 4% | 9 |
| mz.MicroGodMelee 1 | 6 | 4% | 22 |
| adt.Ar2 1.0 | 4 | 3% | 7 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 85.0 | 116 / 210 | 2.35 | 17.9% | 26742 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 116 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.1% | 43 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.6% | 21 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.1% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.9% | 7 |
| sch.Simone 0.3d | 6.8 | 7.9% | 8 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.4% | 0 |
| Noran.BitchingElk 0.054 | 7.7 | 7.2% | 8 |
| stelo.PatternRobot 1.0 | 8.3 | 6.7% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.6 | 18 / 35 | 4476 |
| 2 | 1 | 66.9 | 82.5 | 21 / 35 | 4433 |
| 3 | 1 | 67.1 | 86.0 | 16 / 35 | 4688 |
| 4 | 1 | 67.7 | 89.2 | 22 / 35 | 4201 |
| 5 | 1 | 67.7 | 87.6 | 20 / 35 | 4468 |
| 6 | 1 | 67.2 | 83.2 | 19 / 35 | 4476 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 72% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 83% |
| lrem.micro.SpikeSoldier 0.4 | 15 | 100% |
| Noran.BitchingElk 0.054 | 12 | 67% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 100% |
| sch.Simone 0.3d | 9 | 89% |
| stelo.PatternRobot 1.0 | 4 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 889. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 33 | 35% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 30% | 59 |
| stelo.PatternRobot 1.0 | 10 | 11% | 13 |
| lrem.micro.SpikeSoldier 0.4 | 9 | 10% | 19 |
| Noran.BitchingElk 0.054 | 6 | 6% | 19 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 8 |
| sch.Simone 0.3d | 2 | 2% | 11 |
| com.cohesiva.robocode.ManOwaR 1.0 | 1 | 1% | 12 |
| fullsail.SweetTea 1.1 | 0 | 0% | 2 |

## Melee bench: F03

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 93.5 | 152 / 210 | 1.58 | 20.5% | 37664 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 152 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.5% | 14 |
| radnor.DoctorBob 1.42 | 2.8 | 13.7% | 13 |
| vuen.Cake 2.51 | 3.7 | 12.7% | 30 |
| urdos.URDOS 1.3 | 5.0 | 9.1% | 0 |
| adt.Ar1 2.1 | 6.7 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 6.9% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.5% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.2 | 5.2% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 91.4 | 24 / 35 | 6358 |
| 2 | 1 | 70.0 | 90.2 | 23 / 35 | 6290 |
| 3 | 1 | 71.2 | 95.9 | 27 / 35 | 6337 |
| 4 | 1 | 70.9 | 94.0 | 26 / 35 | 6289 |
| 5 | 1 | 70.9 | 94.3 | 25 / 35 | 6333 |
| 6 | 1 | 71.2 | 95.6 | 27 / 35 | 6057 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 94% |
| vuen.Cake 2.51 | 62 | 71% |
| radnor.DoctorBob 1.42 | 39 | 95% |
| oa.weak.FlyMk1 0.1 | 5 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 24 | 41% | 76 |
| radnor.DoctorBob 1.42 | 16 | 28% | 46 |
| kawigi.nano.Lib 1.0 | 14 | 24% | 64 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 3 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 9 |
| urdos.URDOS 1.3 | 1 | 2% | 4 |
| adt.Ar1 2.1 | 0 | 0% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 87.2 | 41 / 210 | 2.15 | 17.6% | 32785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 166 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 17.6% | 41 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.5% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.7% | 1 |
| josago.Jorgito 0.16 | 5.0 | 8.8% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.0% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.8% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.2% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.5 | 84.8 | 6 / 35 | 5263 |
| 2 | 2 | 69.0 | 88.6 | 9 / 35 | 5650 |
| 3 | 2 | 68.4 | 87.9 | 8 / 35 | 5497 |
| 4 | 2 | 68.1 | 87.6 | 5 / 35 | 5556 |
| 5 | 2 | 67.5 | 86.0 | 3 / 35 | 5256 |
| 6 | 2 | 68.9 | 88.6 | 10 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 175 | 19% |
| TNT.TNT 0.99.1 | 3 | 67% |
| apc.LeeroyJenkins2 1.0 | 2 | 100% |
| spin.Bugstard 0.012b | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 1535. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 150 | 88% | 186 |
| apc.LeeroyJenkins2 1.0 | 6 | 4% | 9 |
| TNT.TNT 0.99.1 | 5 | 3% | 6 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 3 | 2% | 3 |
| sp.Nanos.Ember 1.1 | 1 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 60.9 | 72.0 | 18 / 210 | 3.52 | 13.3% | 19355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 19.1% | 120 |
| justin.DemonicRage 3.4 | 1.8 | 17.4% | 50 |
| hadur117.mini.DeiseD 0.4 | 3.2 | 13.3% | 18 |
| wompi.Numbat 2.1 | 3.8 | 12.7% | 16 |
| ms.Ares 0.19 | 5.5 | 9.1% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 8.8% | 5 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 8.0 | 5.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.0 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 58.5 | 65.7 | 3 / 35 | 2910 |
| 2 | 3 | 62.4 | 75.6 | 2 / 35 | 3559 |
| 3 | 3 | 61.5 | 72.7 | 3 / 35 | 3309 |
| 4 | 3 | 59.8 | 70.2 | 1 / 35 | 3049 |
| 5 | 3 | 60.7 | 71.7 | 5 / 35 | 3079 |
| 6 | 3 | 62.5 | 76.2 | 4 / 35 | 3449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 31 | 39% |
| cb.fire.Firestarter 2.0f | 31 | 3% |
| wompi.Numbat 2.1 | 6 | 67% |
| axeBots.HataMoto 3.09 | 2 | 50% |

Hadur died in 192 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 75 | 39% | 85 |
| cb.fire.Firestarter 2.0f | 69 | 36% | 72 |
| wompi.Numbat 2.1 | 27 | 14% | 31 |
| ms.Ares 0.19 | 7 | 4% | 7 |
| axeBots.HataMoto 3.09 | 6 | 3% | 7 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.6 | 118 / 210 | 2.20 | 18.3% | 27882 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 118 |
| jekl.StoneGhost 0.7 | 2.3 | 14.9% | 27 |
| origin.SleepSiphon 1.7b | 2.7 | 13.8% | 43 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.0 | 11.8% | 16 |
| mld.Wisdom 1.0 | 5.2 | 10.3% | 3 |
| gg.Wolverine 2.0 | 6.3 | 7.9% | 1 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.7% | 0 |
| DBall.NUKE 0.1 | 7.7 | 6.8% | 2 |
| spinnercat.Omen 1.0 | 8.3 | 6.6% | 1 |
| sample.Fire 1.0 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.1 | 15 / 35 | 4387 |
| 2 | 1 | 68.7 | 87.3 | 19 / 35 | 5085 |
| 3 | 1 | 67.9 | 87.0 | 20 / 35 | 4550 |
| 4 | 1 | 68.2 | 86.0 | 21 / 35 | 4596 |
| 5 | 1 | 69.0 | 89.8 | 22 / 35 | 4781 |
| 6 | 1 | 67.6 | 85.4 | 21 / 35 | 4483 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 54 | 87% |
| origin.SleepSiphon 1.7b | 42 | 69% |
| pe.minimelee.SandboxMiniMelee 1.1 | 27 | 78% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 100% |
| DBall.NUKE 0.1 | 3 | 100% |
| mld.Wisdom 1.0 | 3 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 875. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 33 | 34% | 67 |
| jekl.StoneGhost 0.7 | 29 | 30% | 68 |
| pe.minimelee.SandboxMiniMelee 1.1 | 20 | 21% | 43 |
| mld.Wisdom 1.0 | 10 | 10% | 15 |
| gg.Wolverine 2.0 | 2 | 2% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 7 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.7 | 140 / 210 | 1.48 | 20.1% | 32747 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 20.1% | 140 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.4% | 37 |
| rtk.Tachikoma 1.0 | 2.7 | 16.3% | 22 |
| oog.melee.CapuletDroid 1.1 | 4.0 | 11.2% | 4 |
| franzor.Lizt 1.3.1 | 5.0 | 10.0% | 7 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.6% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.9% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.9% | 0 |
| sample.Target 1.0 | 9.2 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 71.1 | 93.7 | 20 / 35 | 5333 |
| 2 | 1 | 72.1 | 96.2 | 26 / 35 | 5919 |
| 3 | 1 | 71.3 | 95.2 | 23 / 35 | 5154 |
| 4 | 1 | 70.7 | 92.1 | 22 / 35 | 5206 |
| 5 | 1 | 72.0 | 94.9 | 25 / 35 | 5593 |
| 6 | 1 | 72.1 | 96.2 | 24 / 35 | 5542 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 106 | 84% |
| rsalesc.melee.Monk 0.3.6c | 49 | 41% |
| oog.melee.CapuletDroid 1.1 | 30 | 90% |
| franzor.Lizt 1.3.1 | 9 | 44% |

Hadur died in 70 of 210 rounds, at a mean tick of 1544. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 36 | 51% | 62 |
| rtk.Tachikoma 1.0 | 25 | 36% | 108 |
| franzor.Lizt 1.3.1 | 5 | 7% | 0 |
| oog.melee.CapuletDroid 1.1 | 4 | 6% | 35 |
| exauge.GateKeeper 1.1.121g | 0 | 0% | 4 |

## Melee bench: F08

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.5 | 123 / 210 | 1.95 | 19.1% | 29652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 123 |
| tm.Yuugao 1.0 | 2.2 | 13.1% | 43 |
| shrub.Vapour v159 | 3.0 | 12.8% | 24 |
| Krabb.sliNk.Garm 0.9u | 3.8 | 11.4% | 12 |
| com.spp.robocode.MostlyHarmless 010 | 5.5 | 9.0% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.1% | 0 |
| m3thos.Eva00 1.1 | 6.7 | 7.8% | 1 |
| SHAM.WOW 1.4 | 8.5 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.0% | 1 |
| qualidafial.MajorDick 1.0.1 | 9.0 | 6.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 88.3 | 18 / 35 | 4933 |
| 2 | 1 | 70.2 | 94.9 | 25 / 35 | 5099 |
| 3 | 1 | 67.5 | 86.3 | 20 / 35 | 4766 |
| 4 | 1 | 68.5 | 90.8 | 19 / 35 | 4742 |
| 5 | 1 | 67.9 | 85.7 | 19 / 35 | 5041 |
| 6 | 1 | 69.4 | 90.8 | 22 / 35 | 5071 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 49 | 63% |
| shrub.Vapour v159 | 40 | 70% |
| Krabb.sliNk.Garm 0.9u | 27 | 78% |
| com.spp.robocode.MostlyHarmless 010 | 16 | 81% |
| jwst.DAD.DarkAndDarker 1.1 | 14 | 100% |
| m3thos.Eva00 1.1 | 7 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 32% | 67 |
| shrub.Vapour v159 | 23 | 26% | 51 |
| Krabb.sliNk.Garm 0.9u | 19 | 22% | 35 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 9% | 19 |
| jwst.DAD.DarkAndDarker 1.1 | 4 | 5% | 17 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 8 |
| m3thos.Eva00 1.1 | 2 | 2% | 9 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |

## Melee bench: F09

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.6 | 75.3 | 66 / 210 | 3.22 | 15.4% | 22941 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.2% | 93 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.4% | 66 |
| kc.micro.Figment 1.0 | 3.0 | 14.0% | 19 |
| yagami.Tidus 0.11 | 4.3 | 11.1% | 1 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.4% | 13 |
| mc2.enemy.Original 0.9 | 5.7 | 9.2% | 14 |
| dft.Calliope 5.6 | 7.2 | 7.4% | 3 |
| step.nanoPri 1.0 | 8.0 | 6.3% | 1 |
| rdm.Dueler 0.4x | 9.3 | 4.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.5 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 72.4 | 9 / 35 | 3748 |
| 2 | 2 | 62.7 | 73.0 | 12 / 35 | 3511 |
| 3 | 2 | 64.1 | 74.9 | 12 / 35 | 4009 |
| 4 | 2 | 63.8 | 76.2 | 11 / 35 | 3757 |
| 5 | 2 | 63.1 | 73.7 | 10 / 35 | 4083 |
| 6 | 2 | 65.3 | 81.9 | 12 / 35 | 3833 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 50 | 32% |
| kc.micro.Figment 1.0 | 30 | 83% |
| mc2.enemy.Original 0.9 | 11 | 64% |
| yagami.Tidus 0.11 | 9 | 100% |
| dft.Calliope 5.6 | 6 | 83% |
| pedersen.Grishnakh 1.0 | 5 | 80% |

Hadur died in 144 of 210 rounds, at a mean tick of 833. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 61 | 42% | 83 |
| kc.micro.Figment 1.0 | 25 | 17% | 52 |
| yagami.Tidus 0.11 | 16 | 11% | 22 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 16 |
| mc2.enemy.Original 0.9 | 10 | 7% | 15 |
| robar.nano.Assertive_Melee 0.2 | 8 | 6% | 8 |
| step.nanoPri 1.0 | 7 | 5% | 7 |
| dft.Calliope 5.6 | 5 | 3% | 7 |

## Melee bench: F10

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 96.0 | 178 / 210 | 1.36 | 20.5% | 31911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 178 |
| DTF.Kludgy 1.2b | 2.3 | 13.8% | 11 |
| ne.Chimera 1.2 | 2.8 | 13.3% | 8 |
| ejb.Polaris 1.0.1 | 4.0 | 11.7% | 5 |
| vStar.RAFzilla 2.15 | 5.3 | 9.8% | 3 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.5% | 4 |
| kurios.DOSexe .9b | 7.3 | 6.3% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.2 | 5.5% | 0 |
| sam.Samspin 1.0 | 8.7 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 97.5 | 31 / 35 | 5130 |
| 2 | 1 | 69.9 | 91.7 | 27 / 35 | 5469 |
| 3 | 1 | 70.6 | 95.6 | 29 / 35 | 5257 |
| 4 | 1 | 71.7 | 98.4 | 33 / 35 | 5318 |
| 5 | 1 | 70.5 | 94.9 | 28 / 35 | 5294 |
| 6 | 1 | 71.3 | 97.8 | 30 / 35 | 5443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 55 | 89% |
| ejb.Polaris 1.0.1 | 44 | 98% |
| ne.Chimera 1.2 | 44 | 89% |
| vStar.RAFzilla 2.15 | 21 | 95% |
| tvv.micro.Antares 1.1.1 | 14 | 93% |
| donjezza.Muncho 1.0 | 7 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 3 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 880. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 14 | 41% | 63 |
| ne.Chimera 1.2 | 7 | 21% | 42 |
| ejb.Polaris 1.0.1 | 5 | 15% | 48 |
| vStar.RAFzilla 2.15 | 3 | 9% | 26 |
| tvv.micro.Antares 1.1.1 | 2 | 6% | 10 |
| donjezza.Muncho 1.0 | 2 | 6% | 6 |
| kurios.DOSexe .9b | 1 | 3% | 10 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |

## Melee bench: F11

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.8 | 112 / 210 | 2.19 | 18.0% | 26019 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.0% | 112 |
| rz.Aleph 0.34 | 2.0 | 16.0% | 54 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.3% | 15 |
| djc.DynaBot 0.1.1 | 4.0 | 11.0% | 11 |
| br2.MobyDickBot 1.6 | 5.5 | 8.7% | 5 |
| rdt199.Warlord 0.73 | 6.0 | 8.6% | 12 |
| uji.YellohFellah 1.0 | 7.0 | 7.8% | 3 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.0% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.3 | 23 / 35 | 4558 |
| 2 | 1 | 66.6 | 84.8 | 16 / 35 | 4209 |
| 3 | 1 | 67.8 | 86.7 | 20 / 35 | 4562 |
| 4 | 1 | 66.0 | 86.3 | 14 / 35 | 4102 |
| 5 | 1 | 69.3 | 92.1 | 21 / 35 | 4725 |
| 6 | 1 | 65.9 | 83.5 | 18 / 35 | 3863 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 56 | 68% |
| cx.mini.Nimrod 0.55 | 30 | 83% |
| djc.DynaBot 0.1.1 | 24 | 83% |
| rdt199.Warlord 0.73 | 17 | 65% |
| uji.YellohFellah 1.0 | 14 | 86% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 43 | 43% | 79 |
| cx.mini.Nimrod 0.55 | 23 | 23% | 44 |
| rdt199.Warlord 0.73 | 12 | 12% | 27 |
| djc.DynaBot 0.1.1 | 7 | 7% | 23 |
| uji.YellohFellah 1.0 | 4 | 4% | 18 |
| br2.MobyDickBot 1.6 | 3 | 3% | 9 |
| stelo.MirrorNano 1.3 | 3 | 3% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 2 | 2% | 3 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 4 |
2 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.8 | 126 / 210 | 2.28 | 17.9% | 23724 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 126 |
| bts.wiki.RipCurl 0.9b | 2.3 | 13.7% | 20 |
| nat.PallasHawk 1.0 | 3.0 | 13.0% | 29 |
| darkcanuck.Leon 1.01 | 3.7 | 13.1% | 22 |
| brainfade.melee.Genghis 0.36 | 5.0 | 9.6% | 7 |
| jrm.Test0 1.0 | 6.2 | 8.1% | 1 |
| cs.sheldor.Talon 1.1 | 7.3 | 6.7% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.6% | 0 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.9% | 3 |
| stuff.Vlad 0.1 | 9.5 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.7 | 81.3 | 16 / 35 | 3757 |
| 2 | 1 | 66.2 | 81.6 | 23 / 35 | 3795 |
| 3 | 1 | 67.6 | 88.9 | 22 / 35 | 3877 |
| 4 | 1 | 69.0 | 92.4 | 24 / 35 | 4104 |
| 5 | 1 | 67.6 | 86.7 | 21 / 35 | 4027 |
| 6 | 1 | 66.8 | 83.8 | 20 / 35 | 4164 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| darkcanuck.Leon 1.01 | 49 | 86% |
| bts.wiki.RipCurl 0.9b | 48 | 90% |
| nat.PallasHawk 1.0 | 44 | 73% |
| brainfade.melee.Genghis 0.36 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 33% |
| jp.Perpy 16.0 | 2 | 100% |
| cs.sheldor.Talon 1.1 | 1 | 100% |
| stuff.Vlad 0.1 | 1 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 741. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 22 | 26% | 47 |
| bts.wiki.RipCurl 0.9b | 21 | 24% | 53 |
| darkcanuck.Leon 1.01 | 12 | 14% | 67 |
| brainfade.melee.Genghis 0.36 | 12 | 14% | 16 |
| jrm.Test0 1.0 | 11 | 13% | 14 |
| jaybot.bots.Oddball 4.0 | 4 | 5% | 4 |
| cs.sheldor.Talon 1.1 | 2 | 2% | 3 |
| jp.Perpy 16.0 | 2 | 2% | 2 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |

## Melee bench: F13

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 83.9 | 72 / 210 | 2.45 | 16.3% | 24702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.6% | 86 |
| ags.Glacier 0.2.11 | 1.8 | 16.8% | 37 |
| hadur117.mini.DeiseD 0.4 | 2.5 | 16.3% | 72 |
| shinh.Entangled 0.3 | 4.2 | 11.6% | 10 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.2% | 6 |
| apc.Colossus2 0.17 | 6.3 | 7.6% | 0 |
| stelo.Wang 1.0 | 6.7 | 7.1% | 0 |
| ayk.WallHugger 1.0 | 8.2 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.7 | 84.8 | 11 / 35 | 3917 |
| 2 | 1 | 66.3 | 86.3 | 15 / 35 | 3946 |
| 3 | 2 | 66.5 | 86.0 | 11 / 35 | 4287 |
| 4 | 3 | 64.9 | 80.6 | 10 / 35 | 4105 |
| 5 | 3 | 65.9 | 84.1 | 12 / 35 | 4218 |
| 6 | 3 | 65.6 | 81.3 | 13 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 61 | 34% |
| ags.Glacier 0.2.11 | 53 | 75% |
| shinh.Entangled 0.3 | 11 | 55% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| stelo.Wang 1.0 | 2 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 979. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 59 | 42% | 81 |
| ags.Glacier 0.2.11 | 46 | 33% | 83 |
| shinh.Entangled 0.3 | 20 | 14% | 24 |
| gh.micro.Gruweltje 0.7 | 6 | 4% | 11 |
| stelo.Wang 1.0 | 4 | 3% | 6 |
| apc.Colossus2 0.17 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 93.7 | 157 / 210 | 1.57 | 20.1% | 31623 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.1% | 157 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.7% | 29 |
| catcat20.shape.Theta 0.018 | 3.0 | 11.5% | 15 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.0 | 9.5% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.1% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 5.8 | 9.6% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.5 | 8.9% | 2 |
| sheldor.micro.PointInLineRRAL 1.0 | 6.8 | 8.4% | 7 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 93.3 | 24 / 35 | 5345 |
| 2 | 1 | 69.3 | 91.1 | 26 / 35 | 4978 |
| 3 | 1 | 70.5 | 93.7 | 25 / 35 | 5403 |
| 4 | 1 | 70.2 | 94.3 | 27 / 35 | 4851 |
| 5 | 1 | 72.3 | 98.1 | 31 / 35 | 5718 |
| 6 | 1 | 70.0 | 91.4 | 24 / 35 | 5328 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 101 | 85% |
| catcat20.shape.Theta 0.018 | 38 | 84% |
| sheldor.micro.PointInLineRRAL 1.0 | 26 | 81% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 7 | 86% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 25 | 46% | 104 |
| catcat20.shape.Theta 0.018 | 14 | 26% | 45 |
| sheldor.micro.PointInLineRRAL 1.0 | 5 | 9% | 22 |
| dmh.robocode.robot.RedDwarf 0.4 | 4 | 7% | 9 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 6% | 9 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 14 |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 2% | 2 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 82.4 | 100 / 210 | 2.58 | 17.7% | 29979 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.7% | 100 |
| emp.Yngwie 1.11 | 2.8 | 13.1% | 45 |
| kawigi.micro.Shiz 1.1 | 2.8 | 13.3% | 14 |
| mld.DustBunny 3.8 | 3.3 | 12.4% | 12 |
| cb.nano.Insomnia 1.0 | 5.2 | 11.2% | 12 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.9% | 24 |
| lambdaxy.TBot 0.1 | 7.3 | 6.8% | 0 |
| Grystrion.TrackerWO 1.0 | 8.3 | 6.0% | 0 |
| divineomega.TrialBot 0.003 | 8.5 | 5.5% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.5 | 81.6 | 19 / 35 | 4590 |
| 2 | 1 | 67.8 | 83.2 | 18 / 35 | 5185 |
| 3 | 1 | 69.4 | 88.6 | 21 / 35 | 5484 |
| 4 | 1 | 66.9 | 82.9 | 16 / 35 | 4928 |
| 5 | 1 | 65.5 | 79.0 | 13 / 35 | 4808 |
| 6 | 1 | 65.9 | 79.4 | 13 / 35 | 4984 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 40 | 58% |
| cb.nano.Insomnia 1.0 | 29 | 79% |
| kawigi.micro.Shiz 1.1 | 26 | 88% |
| mld.DustBunny 3.8 | 15 | 93% |
| kawigi.robot.Girl 1.2 | 14 | 71% |
| divineomega.TrialBot 0.003 | 7 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 951. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 29% | 71 |
| cb.nano.Insomnia 1.0 | 22 | 20% | 19 |
| kawigi.micro.Shiz 1.1 | 19 | 17% | 44 |
| mld.DustBunny 3.8 | 15 | 14% | 35 |
| kawigi.robot.Girl 1.2 | 15 | 14% | 26 |
| divineomega.TrialBot 0.003 | 4 | 4% | 10 |
| lambdaxy.TBot 0.1 | 1 | 1% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 85.2 | 101 / 210 | 2.33 | 18.6% | 32676 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.6% | 101 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 62 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 6 |
| techdude.forest.FlamingForest 1.1 | 5.0 | 9.9% | 26 |
| tvv.nano.Polaris 1.2 | 5.0 | 9.5% | 6 |
| bvh.fnr.Fenrir 0.36l | 5.3 | 9.1% | 5 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.8% | 2 |
| asd.Cthulhu 1.3 | 8.5 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 9.2 | 4.5% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 5.0% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 85.4 | 17 / 35 | 5637 |
| 2 | 1 | 68.6 | 85.7 | 15 / 35 | 5587 |
| 3 | 1 | 68.2 | 82.5 | 17 / 35 | 5478 |
| 4 | 1 | 68.7 | 86.3 | 17 / 35 | 5633 |
| 5 | 1 | 68.3 | 85.7 | 19 / 35 | 5007 |
| 6 | 1 | 68.2 | 85.7 | 16 / 35 | 5334 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 86 | 57% |
| techdude.forest.FlamingForest 1.1 | 18 | 61% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 100% |
| bvh.fnr.Fenrir 0.36l | 10 | 100% |
| tvv.nano.Polaris 1.2 | 10 | 80% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| asd.Cthulhu 1.3 | 1 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1302. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 61 | 55% | 115 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 17% | 35 |
| techdude.forest.FlamingForest 1.1 | 9 | 8% | 21 |
| bvh.fnr.Fenrir 0.36l | 8 | 7% | 12 |
| divineomega.DivineBot 1.9.4.5 | 5 | 5% | 10 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 7 |
| tvv.nano.Polaris 1.2 | 3 | 3% | 5 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 84.1 | 98 / 210 | 2.43 | 17.9% | 30437 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.9% | 98 |
| et.Predator 1.8 | 3.2 | 12.6% | 20 |
| oog.melee.Mercutio 1.0 | 3.5 | 12.1% | 24 |
| cx.BlestPain 1.41 | 3.5 | 12.3% | 37 |
| nic.Nicator 2.4 | 4.0 | 11.8% | 17 |
| ahf.NanoAndrew .4 | 6.0 | 10.5% | 13 |
| maribo.melee.BMV 0.1 | 6.8 | 9.2% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.6% | 1 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.5 | 82.5 | 17 / 35 | 5060 |
| 2 | 1 | 69.1 | 91.4 | 20 / 35 | 5190 |
| 3 | 1 | 66.7 | 81.3 | 17 / 35 | 4814 |
| 4 | 1 | 68.9 | 88.3 | 14 / 35 | 5633 |
| 5 | 1 | 67.7 | 85.4 | 15 / 35 | 5149 |
| 6 | 1 | 65.3 | 75.6 | 15 / 35 | 4591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 36 | 81% |
| oog.melee.Mercutio 1.0 | 32 | 69% |
| nic.Nicator 2.4 | 31 | 77% |
| cx.BlestPain 1.41 | 29 | 38% |
| ahf.NanoAndrew .4 | 9 | 67% |
| maribo.melee.BMV 0.1 | 6 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1082. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 29 | 26% | 45 |
| nic.Nicator 2.4 | 24 | 21% | 49 |
| et.Predator 1.8 | 21 | 19% | 47 |
| oog.melee.Mercutio 1.0 | 19 | 17% | 38 |
| ahf.NanoAndrew .4 | 10 | 9% | 16 |
| maribo.melee.BMV 0.1 | 8 | 7% | 12 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
| tex.Longbot 0.4 | 1 | 1% | 1 |

## Melee bench: F18

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 90.5 | 138 / 210 | 1.86 | 19.1% | 26945 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 138 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.4% | 29 |
| agd.Mooserwirt2 2.7 | 3.2 | 11.0% | 10 |
| uji.DBH 1.1 | 4.3 | 10.4% | 6 |
| ratosh.Nobo 0.21 | 5.3 | 9.7% | 5 |
| spinnercat.Robovirus 2.718 | 5.8 | 8.9% | 2 |
| sigterm.Sigterm 1.0 | 6.7 | 8.6% | 10 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.3% | 9 |
| stelo.WangRobot 1.0 | 9.0 | 6.2% | 2 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.5 | 26 / 35 | 5149 |
| 2 | 1 | 68.3 | 91.4 | 24 / 35 | 4272 |
| 3 | 1 | 69.9 | 94.3 | 22 / 35 | 4821 |
| 4 | 1 | 66.7 | 86.7 | 21 / 35 | 4010 |
| 5 | 1 | 68.1 | 90.2 | 21 / 35 | 4254 |
| 6 | 1 | 68.4 | 90.8 | 24 / 35 | 4439 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 58 | 74% |
| agd.Mooserwirt2 2.7 | 31 | 90% |
| sigterm.Sigterm 1.0 | 20 | 80% |
| uji.DBH 1.1 | 19 | 84% |
| spinnercat.Robovirus 2.718 | 15 | 87% |
| ratosh.Nobo 0.21 | 13 | 92% |
| stelo.WangRobot 1.0 | 10 | 90% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 0% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 905. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 28 | 38% | 78 |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 12% | 12 |
| agd.Mooserwirt2 2.7 | 8 | 11% | 39 |
| ratosh.Nobo 0.21 | 8 | 11% | 18 |
| sigterm.Sigterm 1.0 | 7 | 10% | 17 |
| spinnercat.Robovirus 2.718 | 5 | 7% | 17 |
| uji.DBH 1.1 | 5 | 7% | 17 |
| stelo.WangRobot 1.0 | 1 | 1% | 8 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.2 | 95.9 | 172 / 210 | 1.37 | 21.2% | 33787 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.2% | 172 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.0% | 10 |
| mld.Infinity 2.2 | 2.8 | 14.1% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.1% | 1 |
| erdnis.Rover 0.3 | 5.0 | 10.0% | 2 |
| patson.PatsonTestBot 1.0 | 6.3 | 7.9% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.4% | 0 |
| pac.ABC 2.1 | 7.3 | 6.8% | 1 |
| pbg.R2D2 1.0 | 9.0 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.4 | 99.4 | 33 / 35 | 5564 |
| 2 | 1 | 71.9 | 95.9 | 26 / 35 | 5657 |
| 3 | 1 | 71.9 | 96.8 | 30 / 35 | 5343 |
| 4 | 1 | 72.1 | 94.0 | 26 / 35 | 5660 |
| 5 | 1 | 72.1 | 93.7 | 28 / 35 | 5952 |
| 6 | 1 | 72.0 | 95.6 | 29 / 35 | 5611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 91 | 99% |
| mld.Infinity 2.2 | 61 | 80% |
| krillr.mini.JointStrike 2.0.0 | 14 | 93% |
| erdnis.Rover 0.3 | 10 | 80% |
| patson.PatsonTestBot 1.0 | 5 | 100% |
| pac.ABC 2.1 | 4 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |
| pbg.R2D2 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 1429. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mld.Infinity 2.2 | 17 | 45% | 18 |
| davidalves.net.DuelistMiniMelee 1.2 | 16 | 42% | 117 |
| erdnis.Rover 0.3 | 3 | 8% | 16 |
| krillr.mini.JointStrike 2.0.0 | 2 | 5% | 20 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 12 |
| pbg.R2D2 1.0 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.6 | 131 / 210 | 1.84 | 19.9% | 33458 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.9% | 131 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 31 |
| fwb.Nine 1.0.1 | 3.2 | 11.8% | 24 |
| nz.jdc.nano.GridFu 1.0 | 4.0 | 11.6% | 7 |
| catcat20.Rabbit 0.001 | 4.8 | 10.1% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 7.6% | 1 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.3% | 3 |
| djdjdj.NanoSkunk10 1.0 | 7.8 | 6.6% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.1% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 93.0 | 22 / 35 | 5937 |
| 2 | 1 | 68.1 | 83.5 | 18 / 35 | 5351 |
| 3 | 1 | 69.5 | 89.8 | 22 / 35 | 5399 |
| 4 | 1 | 70.3 | 92.1 | 21 / 35 | 5704 |
| 5 | 1 | 71.0 | 94.6 | 25 / 35 | 5595 |
| 6 | 1 | 70.2 | 90.8 | 23 / 35 | 5472 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 70 | 84% |
| fwb.Nine 1.0.1 | 44 | 68% |
| catcat20.Rabbit 0.001 | 28 | 68% |
| nz.jdc.nano.GridFu 1.0 | 14 | 79% |
| bayen.nut.Squirrel 1.615 | 9 | 89% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 1256. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 35 | 44% | 89 |
| fwb.Nine 1.0.1 | 17 | 21% | 19 |
| catcat20.Rabbit 0.001 | 11 | 14% | 39 |
| nz.jdc.nano.GridFu 1.0 | 10 | 13% | 34 |
| bayen.nut.Squirrel 1.615 | 4 | 5% | 12 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 8 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 4 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F21

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.5 | 94.8 | 149 / 210 | 1.47 | 20.9% | 34470 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.9% | 149 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 54 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.1% | 4 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 0 |
| eld.Hmm 1.0 | 5.3 | 8.0% | 4 |
| oa.weak.BotherBot 0.1 | 5.8 | 7.2% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.1% | 0 |
| fire219.CatBot 1.0 | 8.2 | 6.0% | 0 |
| PSW.Relentless 0.1 | 8.5 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.6 | 28 / 35 | 5401 |
| 2 | 1 | 70.3 | 92.4 | 20 / 35 | 5717 |
| 3 | 1 | 72.0 | 94.6 | 25 / 35 | 6006 |
| 4 | 1 | 72.2 | 96.5 | 28 / 35 | 5760 |
| 5 | 1 | 71.9 | 95.6 | 24 / 35 | 5946 |
| 6 | 1 | 71.4 | 95.2 | 24 / 35 | 5640 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 118 | 69% |
| dummy.mini.Scimitar 1.01 | 41 | 93% |
| cf.RiO.RiOx 4.2.1 | 16 | 100% |
| eld.Hmm 1.0 | 14 | 86% |
| oa.weak.BotherBot 0.1 | 2 | 100% |

Hadur died in 62 of 210 rounds, at a mean tick of 1561. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 39 | 63% | 92 |
| dummy.mini.Scimitar 1.01 | 10 | 16% | 58 |
| cf.RiO.RiOx 4.2.1 | 7 | 11% | 29 |
| eld.Hmm 1.0 | 4 | 6% | 24 |
| oa.weak.BotherBot 0.1 | 1 | 2% | 5 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.4 | 117 / 210 | 1.95 | 18.8% | 29933 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.8% | 117 |
| pe.SandboxDT 2.71m | 2.3 | 15.8% | 49 |
| kvk.HebusLeTroll 0.35 | 2.8 | 14.8% | 21 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.7% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 8 |
| yk.JahRoslav 1.1 | 6.7 | 6.7% | 0 |
| tad.Dalek98 0.98 | 7.2 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.2 | 6.2% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 18 / 35 | 4780 |
| 2 | 1 | 68.6 | 89.2 | 17 / 35 | 4924 |
| 3 | 1 | 70.0 | 93.0 | 23 / 35 | 5107 |
| 4 | 1 | 69.4 | 89.8 | 20 / 35 | 5125 |
| 5 | 1 | 69.1 | 89.2 | 19 / 35 | 4976 |
| 6 | 1 | 69.1 | 88.9 | 20 / 35 | 5021 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 52 | 77% |
| pe.SandboxDT 2.71m | 48 | 60% |
| jlm.javaDisturbance 0.59 | 43 | 84% |
| bigpete.Stewie 1.0 | 10 | 70% |
| pbg.NinjaX 1.2 | 2 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| gg.Squaraus 0.6 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 1013. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 34 | 36% | 69 |
| jlm.javaDisturbance 0.59 | 28 | 30% | 58 |
| kvk.HebusLeTroll 0.35 | 21 | 22% | 51 |
| bigpete.Stewie 1.0 | 7 | 7% | 13 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 4 |
| yk.JahRoslav 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| tad.Dalek98 0.98 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F23

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 91.5 | 140 / 210 | 1.76 | 19.7% | 30544 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.7% | 140 |
| pe.SandboxLump 1.52 | 2.0 | 16.6% | 48 |
| cre.Karolos 0.32 | 3.0 | 13.5% | 14 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.3% | 5 |
| stelo.RamTrackSurfer 1.2 | 5.7 | 9.1% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.5 | 8.6% | 0 |
| sample.Walls 1.0 | 6.7 | 8.0% | 0 |
| cw.megas.Blade 0.8 | 7.2 | 8.3% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.7 | 23 / 35 | 5004 |
| 2 | 1 | 70.9 | 91.7 | 26 / 35 | 5169 |
| 3 | 1 | 70.5 | 92.4 | 25 / 35 | 5038 |
| 4 | 1 | 70.8 | 90.8 | 23 / 35 | 4967 |
| 5 | 1 | 71.0 | 92.4 | 21 / 35 | 5416 |
| 6 | 1 | 70.2 | 90.2 | 22 / 35 | 4950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 81 | 77% |
| cre.Karolos 0.32 | 34 | 88% |
| stelo.AreaTargetingBot 1.1 | 18 | 94% |
| sample.Walls 1.0 | 13 | 100% |
| stelo.RamTrackSurfer 1.2 | 11 | 91% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 3 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 825. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 40 | 57% | 107 |
| cre.Karolos 0.32 | 14 | 20% | 44 |
| stelo.AreaTargetingBot 1.1 | 9 | 13% | 21 |
| stelo.RamTrackSurfer 1.2 | 4 | 6% | 15 |
| sample.Walls 1.0 | 1 | 1% | 9 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 1 | 1% | 9 |
| cw.megas.Blade 0.8 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 79.9 | 80 / 210 | 2.80 | 16.0% | 22619 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 16.0% | 80 |
| florent.XSeries.X2 0.12 | 2.8 | 13.9% | 41 |
| rz.GlowBlowMelee 1.4 | 3.0 | 13.9% | 27 |
| davidalves.Phoenix 0.54 | 3.2 | 13.0% | 42 |
| pedersen.Ugluk 1.1.1 | 5.0 | 11.2% | 11 |
| oog.melee.Corsair 1.0 | 6.3 | 8.4% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.3% | 6 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.3 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 81.3 | 13 / 35 | 3697 |
| 2 | 1 | 66.1 | 81.6 | 18 / 35 | 4137 |
| 3 | 1 | 65.8 | 83.2 | 15 / 35 | 3778 |
| 4 | 1 | 63.2 | 78.1 | 11 / 35 | 3461 |
| 5 | 1 | 63.4 | 76.8 | 10 / 35 | 3736 |
| 6 | 1 | 64.2 | 78.7 | 13 / 35 | 3810 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 31 | 45% |
| florent.XSeries.X2 0.12 | 29 | 62% |
| rz.GlowBlowMelee 1.4 | 23 | 74% |
| pedersen.Ugluk 1.1.1 | 19 | 74% |
| stelo.SoJNanoMelee 1.1 | 17 | 94% |
| oog.melee.Corsair 1.0 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 752. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 34 | 26% | 43 |
| rz.GlowBlowMelee 1.4 | 32 | 25% | 54 |
| florent.XSeries.X2 0.12 | 26 | 20% | 47 |
| pedersen.Ugluk 1.1.1 | 20 | 15% | 31 |
| stelo.SoJNanoMelee 1.1 | 9 | 7% | 15 |
| oog.melee.Corsair 1.0 | 3 | 2% | 12 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |
| evd.X1 0.01 | 2 | 2% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |

## Melee bench: F25

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.2 | 127 / 210 | 2.24 | 18.3% | 25617 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 127 |
| voidious.mini.BrokenSword 2.0.3 | 2.5 | 13.7% | 22 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 15 |
| jdw.Hurricane 1.4 | 3.8 | 11.3% | 18 |
| ds.Oo 2.2 | 5.3 | 9.3% | 14 |
| gre.svman4.Morfeas 1.4.1 | 6.7 | 8.2% | 5 |
| awesomeness.Elite 1.0 | 7.3 | 7.4% | 2 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.5% | 4 |
| adt.Ar2 1.1 | 8.0 | 7.0% | 3 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 87.3 | 21 / 35 | 4436 |
| 2 | 1 | 67.4 | 83.8 | 22 / 35 | 4327 |
| 3 | 1 | 65.6 | 81.3 | 17 / 35 | 3936 |
| 4 | 1 | 66.6 | 84.1 | 18 / 35 | 4050 |
| 5 | 1 | 69.1 | 89.8 | 25 / 35 | 4408 |
| 6 | 1 | 69.4 | 90.8 | 24 / 35 | 4460 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 50 | 82% |
| voidious.micro.BlitzBat 1.05 | 41 | 93% |
| jdw.Hurricane 1.4 | 26 | 77% |
| ds.Oo 2.2 | 11 | 73% |
| awesomeness.Elite 1.0 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 4 | 100% |
| adt.Ar2 1.1 | 4 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 641. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 22 | 26% | 61 |
| jdw.Hurricane 1.4 | 20 | 24% | 40 |
| voidious.micro.BlitzBat 1.05 | 17 | 20% | 54 |
| ds.Oo 2.2 | 12 | 14% | 20 |
| adt.Ar2 1.1 | 5 | 6% | 8 |
| gre.svman4.Morfeas 1.4.1 | 3 | 4% | 7 |
| awesomeness.Elite 1.0 | 2 | 2% | 10 |
| amk.ChumbaMini 0.2 | 2 | 2% | 2 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 5 |

## Melee bench: F26

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.2 | 129 / 210 | 1.79 | 19.4% | 32601 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.4% | 129 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 35 |
| lrem.Spectre 0.4.4 | 3.5 | 12.6% | 16 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 24 |
| js.PinBall 1.6 | 5.2 | 10.4% | 6 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 8.7% | 0 |
| gh.mini.GrubbmOne 1.0 | 6.5 | 8.6% | 0 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.4% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.6% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.2 | 20 / 35 | 5206 |
| 2 | 1 | 70.8 | 92.4 | 22 / 35 | 5904 |
| 3 | 1 | 70.3 | 92.1 | 21 / 35 | 5646 |
| 4 | 1 | 69.7 | 92.7 | 22 / 35 | 5113 |
| 5 | 1 | 69.5 | 89.2 | 23 / 35 | 5284 |
| 6 | 1 | 69.6 | 91.7 | 21 / 35 | 5448 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 56 | 63% |
| shu.nitro.LENIN .T34 | 48 | 77% |
| lrem.Spectre 0.4.4 | 41 | 85% |
| js.PinBall 1.6 | 11 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 5 | 100% |
| gh.mini.GrubbmOne 1.0 | 4 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 1006. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 37 | 45% | 67 |
| shu.nitro.LENIN .T34 | 21 | 25% | 65 |
| lrem.Spectre 0.4.4 | 14 | 17% | 38 |
| js.PinBall 1.6 | 8 | 10% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 1 | 1% | 11 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 1% | 5 |
| sample.SpinBot 1.0 | 0 | 0% | 1 |

## Melee bench: F27

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.6 | 143 / 210 | 1.94 | 19.6% | 30481 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.6% | 143 |
| mk.Alpha 0.2.1 | 2.7 | 12.5% | 26 |
| wee.Gem 1.8.4 | 3.5 | 11.1% | 21 |
| sheldor.melee.nano.TestMelee 0.1 | 3.8 | 11.2% | 10 |
| EH.Eagle 1.0.6 | 4.5 | 10.5% | 6 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 9.0% | 2 |
| joe.ADinosaur 1.0 | 6.7 | 8.7% | 1 |
| throxbot.ThroxBot 0.1 | 7.5 | 7.9% | 1 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.4% | 0 |
| cs.Grudge 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 91.4 | 25 / 35 | 4446 |
| 2 | 1 | 70.9 | 97.5 | 30 / 35 | 4773 |
| 3 | 1 | 68.3 | 76.8 | 18 / 35 | 5997 |
| 4 | 1 | 70.4 | 86.7 | 21 / 35 | 6077 |
| 5 | 1 | 68.8 | 91.7 | 24 / 35 | 4526 |
| 6 | 1 | 69.5 | 93.3 | 25 / 35 | 4662 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 58 | 79% |
| wee.Gem 1.8.4 | 38 | 79% |
| sheldor.melee.nano.TestMelee 0.1 | 28 | 82% |
| EH.Eagle 1.0.6 | 24 | 96% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 100% |
| throxbot.ThroxBot 0.1 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 3 | 100% |

Hadur died in 67 of 210 rounds, at a mean tick of 928. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 24 | 36% | 66 |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 22% | 39 |
| wee.Gem 1.8.4 | 8 | 12% | 46 |
| throxbot.ThroxBot 0.1 | 7 | 10% | 12 |
| joe.ADinosaur 1.0 | 6 | 9% | 13 |
| EH.Eagle 1.0.6 | 2 | 3% | 22 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 3% | 8 |
| caimano.Furia_Ceca 0.22 | 2 | 3% | 3 |
| cs.Grudge 1.0 | 1 | 1% | 1 |

## Melee bench: F28

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 91.5 | 141 / 210 | 1.77 | 19.1% | 25923 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 141 |
| kid.test.NightFox .2 | 2.0 | 15.2% | 43 |
| uji.Antique 1.0 | 3.3 | 11.6% | 12 |
| qohnil.blot.BlotBot 3.61 | 4.3 | 10.8% | 11 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.3% | 1 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 1 |
| ahr.ice.Ice 1.0.2 | 6.7 | 7.8% | 1 |
| matt.advanced.Katana 1.0 | 8.5 | 6.0% | 0 |
| stelo.PianistNano 1.2 | 8.7 | 6.0% | 0 |
| stelo.Lifestealer 1.0 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 93.0 | 26 / 35 | 4305 |
| 2 | 1 | 67.8 | 89.2 | 20 / 35 | 4082 |
| 3 | 1 | 67.7 | 89.2 | 20 / 35 | 4167 |
| 4 | 1 | 68.9 | 91.1 | 25 / 35 | 4481 |
| 5 | 1 | 69.8 | 95.9 | 26 / 35 | 4369 |
| 6 | 1 | 69.0 | 90.5 | 24 / 35 | 4519 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 96 | 71% |
| uji.Antique 1.0 | 44 | 95% |
| qohnil.blot.BlotBot 3.61 | 17 | 76% |
| amk.ChumbaWumba 0.3 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 6 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |
| ahr.ice.Ice 1.0.2 | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 783. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 38 | 55% | 92 |
| uji.Antique 1.0 | 9 | 13% | 45 |
| qohnil.blot.BlotBot 3.61 | 8 | 12% | 30 |
| pfvicm.Sobieski 7.2.3b | 8 | 12% | 14 |
| amk.ChumbaWumba 0.3 | 3 | 4% | 11 |
| ahr.ice.Ice 1.0.2 | 1 | 1% | 7 |
| matt.advanced.Katana 1.0 | 1 | 1% | 6 |
| stelo.Lifestealer 1.0 | 1 | 1% | 1 |
| stelo.PianistNano 1.2 | 0 | 0% | 2 |

## Melee bench: F29

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 84.5 | 112 / 210 | 2.40 | 18.3% | 28157 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 112 |
| deewiant.Anomaly 0.2 | 2.5 | 14.8% | 37 |
| zyx.mega.YersiniaPestis 3.1 | 2.7 | 14.9% | 44 |
| myl.micro.Troodon 1.10 | 4.0 | 11.7% | 4 |
| jok.PheonixM 0.1.2 | 4.8 | 10.3% | 3 |
| ph.melee.ArcherME 0.3 | 6.3 | 7.9% | 1 |
| DBall.Anarchy 0.1 | 6.7 | 7.4% | 8 |
| fullsail.TimbotNoPrediction 1.0 | 8.3 | 5.8% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.5% | 2 |
| ap.Frederick 1.1 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.8 | 77.1 | 17 / 35 | 4379 |
| 2 | 1 | 67.6 | 82.5 | 18 / 35 | 4638 |
| 3 | 1 | 68.9 | 86.0 | 15 / 35 | 4751 |
| 4 | 1 | 67.9 | 83.5 | 19 / 35 | 4748 |
| 5 | 1 | 69.7 | 89.8 | 21 / 35 | 4920 |
| 6 | 1 | 69.4 | 87.9 | 22 / 35 | 4721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 72% |
| zyx.mega.YersiniaPestis 3.1 | 45 | 71% |
| myl.micro.Troodon 1.10 | 22 | 95% |
| jok.PheonixM 0.1.2 | 9 | 100% |
| DBall.Anarchy 0.1 | 6 | 83% |
| ph.melee.ArcherME 0.3 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 0% |

Hadur died in 98 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 44 | 45% | 84 |
| zyx.mega.YersiniaPestis 3.1 | 24 | 24% | 59 |
| myl.micro.Troodon 1.10 | 14 | 14% | 31 |
| jok.PheonixM 0.1.2 | 11 | 11% | 21 |
| DBall.Anarchy 0.1 | 3 | 3% | 9 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 1 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 2 |

## Melee bench: F30

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.6 | 75.4 | 59 / 210 | 3.21 | 14.8% | 21967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.3 | 14.8% | 59 |
| catcat20.Matcha 0.006 | 3.0 | 13.6% | 40 |
| oog.melee.Capulet 1.2 | 3.3 | 13.0% | 37 |
| darkcanuck.B26354 1.06 | 3.5 | 12.8% | 39 |
| stelo.PastFuture 2.3.2 | 3.8 | 12.6% | 21 |
| intruder.PrairieWolf 2.61 | 6.5 | 8.3% | 8 |
| ntc.Opposite 1.5 | 7.3 | 7.6% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 7.8 | 7.3% | 3 |
| tripphippy.Alice 1.1 | 8.3 | 7.5% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.1 | 79.4 | 8 / 35 | 3608 |
| 2 | 1 | 61.7 | 74.6 | 10 / 35 | 3467 |
| 3 | 1 | 63.4 | 76.5 | 11 / 35 | 3768 |
| 4 | 1 | 62.7 | 72.4 | 13 / 35 | 3833 |
| 5 | 2 | 62.6 | 74.6 | 7 / 35 | 3799 |
| 6 | 2 | 62.2 | 75.2 | 10 / 35 | 3492 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 28 | 71% |
| darkcanuck.B26354 1.06 | 21 | 43% |
| oog.melee.Capulet 1.2 | 18 | 67% |
| stelo.PastFuture 2.3.2 | 13 | 77% |
| intruder.PrairieWolf 2.61 | 8 | 50% |
| tripphippy.Alice 1.1 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 100% |

Hadur died in 151 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 39 | 26% | 49 |
| oog.melee.Capulet 1.2 | 28 | 19% | 43 |
| stelo.PastFuture 2.3.2 | 27 | 18% | 38 |
| catcat20.Matcha 0.006 | 24 | 16% | 41 |
| ntc.Opposite 1.5 | 11 | 7% | 11 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 8 |
| tripphippy.Alice 1.1 | 6 | 4% | 9 |

## Melee bench: F31

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.7 | 75.5 | 54 / 210 | 3.20 | 14.8% | 20668 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.8% | 95 |
| hadur117.mini.DeiseD 0.4 | 2.2 | 14.8% | 54 |
| gh.mini.Griezel 0.2 | 3.2 | 13.4% | 45 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.5% | 8 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.1% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 6 |
| timmit.nano.TimDog 0.33 | 7.2 | 6.7% | 0 |
| fm.mammillarias 1.3 | 8.0 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 8.8 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.4 | 77.1 | 10 / 35 | 3532 |
| 2 | 3 | 60.6 | 69.5 | 6 / 35 | 3501 |
| 3 | 2 | 63.2 | 75.2 | 11 / 35 | 3701 |
| 4 | 2 | 62.7 | 75.9 | 9 / 35 | 3268 |
| 5 | 2 | 63.3 | 77.8 | 12 / 35 | 3283 |
| 6 | 2 | 62.7 | 77.5 | 6 / 35 | 3383 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 55 | 45% |
| gh.mini.Griezel 0.2 | 25 | 56% |
| d414.nano.Quantum 1.0.0 | 7 | 100% |
| spinnercat.micro.Tyger 0.1 | 6 | 83% |
| fm.mammillarias 1.3 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 56 | 35% | 80 |
| gh.mini.Griezel 0.2 | 46 | 29% | 63 |
| spinnercat.micro.Tyger 0.1 | 19 | 12% | 25 |
| d414.nano.Quantum 1.0.0 | 16 | 10% | 20 |
| gh.nano.Grofvuil 0.2 | 7 | 4% | 10 |
| Gecko.ultimateGeckoBot 1.0 | 4 | 3% | 4 |
| timmit.nano.TimDog 0.33 | 4 | 3% | 4 |
| fm.mammillarias 1.3 | 4 | 3% | 4 |
2 death(s) with no robot to name.

## Melee bench: F32

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 87.9 | 119 / 210 | 2.09 | 18.3% | 28017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 18.3% | 119 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.3% | 55 |
| apc.botM 3.0 | 3.5 | 11.7% | 19 |
| lxx.ConceptA 0.8 | 3.8 | 11.0% | 7 |
| vjik.UnViolation 1.1 | 5.5 | 8.7% | 2 |
| bayen.UbaMicro 1.4 | 5.5 | 8.7% | 4 |
| panzer.Panzer 0.2 | 7.3 | 7.4% | 0 |
| yk.JahMicro 1.0 | 7.7 | 7.1% | 3 |
| conscience.Electron 1.3g | 8.8 | 6.5% | 1 |
| donjezza.Jezza 1.0 | 9.8 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 91.4 | 19 / 35 | 4474 |
| 2 | 1 | 66.9 | 84.4 | 24 / 35 | 4340 |
| 3 | 1 | 68.1 | 89.5 | 20 / 35 | 4838 |
| 4 | 1 | 67.5 | 87.0 | 18 / 35 | 4883 |
| 5 | 1 | 67.5 | 88.6 | 21 / 35 | 4635 |
| 6 | 1 | 67.5 | 86.7 | 17 / 35 | 4847 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 65% |
| lxx.ConceptA 0.8 | 25 | 88% |
| apc.botM 3.0 | 21 | 62% |
| panzer.Panzer 0.2 | 7 | 100% |
| vjik.UnViolation 1.1 | 7 | 86% |
| donjezza.Jezza 1.0 | 6 | 100% |
| yk.JahMicro 1.0 | 6 | 100% |
| bayen.UbaMicro 1.4 | 5 | 80% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 45 | 49% | 100 |
| lxx.ConceptA 0.8 | 19 | 21% | 27 |
| apc.botM 3.0 | 14 | 15% | 38 |
| vjik.UnViolation 1.1 | 4 | 4% | 20 |
| bayen.UbaMicro 1.4 | 4 | 4% | 9 |
| conscience.Electron 1.3g | 3 | 3% | 8 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| yk.JahMicro 1.0 | 1 | 1% | 1 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F33

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.1 | 129 / 210 | 2.07 | 19.1% | 29851 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 129 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.6% | 20 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.2% | 7 |
| labg.Cataclysm 2.05 | 4.7 | 10.7% | 9 |
| baal.nano.N 1.42 | 6.3 | 8.4% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.3% | 6 |
| zyx.micro.Ant 1.1 | 8.2 | 5.4% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.3 | 20 / 35 | 4973 |
| 2 | 1 | 68.3 | 86.3 | 21 / 35 | 4810 |
| 3 | 1 | 69.0 | 88.9 | 19 / 35 | 4879 |
| 4 | 1 | 70.2 | 91.4 | 24 / 35 | 5249 |
| 5 | 1 | 69.5 | 88.3 | 24 / 35 | 4874 |
| 6 | 1 | 69.2 | 86.3 | 21 / 35 | 5066 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 58 | 86% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 36 | 81% |
| gre.svman4.Leonidas 1.3.2 | 30 | 97% |
| labg.Cataclysm 2.05 | 19 | 79% |
| kinsen.melee.Angsaichmophobia 1.8c | 5 | 80% |
| sanja.First 0.1 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 954. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 28 | 35% | 85 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 21 | 26% | 51 |
| labg.Cataclysm 2.05 | 12 | 15% | 30 |
| gre.svman4.Leonidas 1.3.2 | 9 | 11% | 22 |
| kinsen.melee.Angsaichmophobia 1.8c | 7 | 9% | 12 |
| sanja.First 0.1 | 2 | 2% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 4 |
| zyx.micro.Ant 1.1 | 1 | 1% | 2 |

## Melee bench: F34

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.1 | 83 / 210 | 2.25 | 17.6% | 28771 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.3 | 17.6% | 83 |
| stelo.Spread 0.9 | 2.2 | 16.8% | 73 |
| kid.Gladiator .7.2 | 2.5 | 16.0% | 42 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 7 |
| tcf.Reach 3 | 4.8 | 10.3% | 3 |
| cli.Dancer 1.1 | 5.7 | 9.5% | 1 |
| ratosh.Wesco 1.4 | 7.2 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.4 | 85.4 | 15 / 35 | 4587 |
| 2 | 1 | 67.5 | 86.0 | 13 / 35 | 4771 |
| 3 | 1 | 68.1 | 85.4 | 15 / 35 | 4822 |
| 4 | 1 | 67.7 | 85.1 | 15 / 35 | 4590 |
| 5 | 2 | 67.5 | 86.0 | 12 / 35 | 4718 |
| 6 | 1 | 69.1 | 88.9 | 13 / 35 | 5283 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 74 | 59% |
| kid.Gladiator .7.2 | 39 | 56% |
| tcf.Reach 3 | 9 | 78% |
| jcs.Seth 1.8 | 8 | 75% |
| ratosh.Wesco 1.4 | 4 | 25% |
| cli.Dancer 1.1 | 2 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 1098. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 57 | 44% | 101 |
| kid.Gladiator .7.2 | 42 | 33% | 55 |
| tcf.Reach 3 | 10 | 8% | 17 |
| jcs.Seth 1.8 | 8 | 6% | 20 |
| ratosh.Wesco 1.4 | 5 | 4% | 7 |
| cli.Dancer 1.1 | 4 | 3% | 9 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 82.5 | 50 / 210 | 2.57 | 15.7% | 21354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.0% | 133 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.7% | 50 |
| gh.mini.Gruwel 0.9 | 3.8 | 12.4% | 13 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.9% | 10 |
| rz.HawkOnFire 0.1 | 4.2 | 11.8% | 3 |
| wit.Chuliath 1.0 | 6.5 | 6.7% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.6% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.9% | 0 |
| dans.Cinnamon 1.2 | 9.0 | 5.0% | 1 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.7 | 81.3 | 7 / 35 | 3804 |
| 2 | 2 | 64.2 | 83.5 | 7 / 35 | 3367 |
| 3 | 2 | 64.7 | 81.3 | 9 / 35 | 3676 |
| 4 | 2 | 65.1 | 84.4 | 9 / 35 | 3597 |
| 5 | 2 | 65.3 | 85.1 | 11 / 35 | 3558 |
| 6 | 2 | 63.2 | 79.7 | 7 / 35 | 3352 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 84 | 18% |
| gh.mini.Gruwel 0.9 | 23 | 57% |
| dmh.robocode.robot.BlackDeath 9.2 | 19 | 79% |
| rz.HawkOnFire 0.1 | 7 | 86% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 948. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 89 | 55% | 103 |
| gh.mini.Gruwel 0.9 | 31 | 19% | 46 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 11% | 27 |
| rz.HawkOnFire 0.1 | 17 | 11% | 23 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 3 | 2% | 5 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 4 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| wit.Chuliath 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.4 | 177 / 210 | 1.50 | 21.3% | 33017 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 21.3% | 177 |
| alpha.RainingFire 1.0 | 2.5 | 11.9% | 15 |
| bzdp.Pansy 2.1 | 2.7 | 11.8% | 7 |
| bvh.micro.Freya 0.3 | 4.7 | 10.0% | 2 |
| mz.Cork 0.1 | 5.0 | 10.1% | 3 |
| bvh.mini.Fenrir 0.39 | 5.5 | 9.5% | 2 |
| m3thos.Eva02 0.7.1 | 6.7 | 9.0% | 3 |
| dl.BetterWalls 1.0 | 8.7 | 5.8% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.5% | 0 |
| sample.MyFirstRobot 1.0 | 9.5 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.8 | 27 / 35 | 5361 |
| 2 | 1 | 71.6 | 95.2 | 30 / 35 | 5569 |
| 3 | 1 | 72.7 | 98.1 | 34 / 35 | 5556 |
| 4 | 1 | 71.4 | 94.6 | 29 / 35 | 5687 |
| 5 | 1 | 71.6 | 94.6 | 30 / 35 | 5499 |
| 6 | 1 | 70.9 | 93.3 | 27 / 35 | 5345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 45 | 100% |
| bvh.micro.Freya 0.3 | 30 | 100% |
| alpha.RainingFire 1.0 | 27 | 81% |
| mz.Cork 0.1 | 25 | 96% |
| bvh.mini.Fenrir 0.39 | 22 | 95% |
| sample.MyFirstRobot 1.0 | 17 | 100% |
| m3thos.Eva02 0.7.1 | 15 | 87% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 33 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 15 | 45% | 41 |
| mz.Cork 0.1 | 5 | 15% | 28 |
| bvh.mini.Fenrir 0.39 | 5 | 15% | 18 |
| bzdp.Pansy 2.1 | 4 | 12% | 59 |
| m3thos.Eva02 0.7.1 | 3 | 9% | 19 |
| bvh.micro.Freya 0.3 | 1 | 3% | 20 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 11 |
| dl.BetterWalls 1.0 | 0 | 0% | 10 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F37

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.8 | 177 / 210 | 1.56 | 20.5% | 34269 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 20.5% | 177 |
| germ.TheMind .2 | 2.3 | 11.3% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.0 | 10.4% | 2 |
| EBBU.Sim2 1.02 | 4.0 | 9.9% | 7 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.6% | 6 |
| lmk.ACPFinal 0.1 | 6.5 | 8.4% | 1 |
| agrach.Dalek 1.0 | 7.3 | 8.1% | 7 |
| mn.nano.perceptual.Impact 1.3.0 | 8.0 | 7.6% | 1 |
| skm.Ryubot 1.0 | 8.2 | 7.6% | 0 |
| mb.Beast 0.1 | 8.5 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 98.4 | 33 / 35 | 5740 |
| 2 | 1 | 69.1 | 90.8 | 28 / 35 | 5486 |
| 3 | 1 | 70.3 | 94.9 | 31 / 35 | 5900 |
| 4 | 1 | 69.4 | 93.0 | 28 / 35 | 5369 |
| 5 | 1 | 70.4 | 92.7 | 30 / 35 | 6131 |
| 6 | 1 | 69.6 | 92.7 | 27 / 35 | 5643 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 51 | 96% |
| EBBU.Sim2 1.02 | 34 | 94% |
| stelo.UntouchableNano 1.3 | 25 | 84% |
| com.syncleus.robocode.Dreadnaught 0.1 | 22 | 100% |
| agrach.Dalek 1.0 | 14 | 100% |
| skm.Ryubot 1.0 | 13 | 100% |
| mb.Beast 0.1 | 12 | 100% |
| lmk.ACPFinal 0.1 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 75% |

Hadur died in 34 of 210 rounds, at a mean tick of 486. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 7 | 21% | 38 |
| EBBU.Sim2 1.02 | 6 | 18% | 33 |
| stelo.UntouchableNano 1.3 | 5 | 15% | 28 |
| lmk.ACPFinal 0.1 | 5 | 15% | 20 |
| agrach.Dalek 1.0 | 4 | 12% | 21 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 9% | 6 |
| mb.Beast 0.1 | 2 | 6% | 19 |
| com.syncleus.robocode.Dreadnaught 0.1 | 1 | 3% | 36 |
| skm.Ryubot 1.0 | 1 | 3% | 7 |

## Melee bench: F38

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 81.1 | 86 / 210 | 2.70 | 16.4% | 24503 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.3 | 16.4% | 86 |
| justin.Mallais 14.0 | 1.7 | 16.0% | 72 |
| bvh.mini.Freya 0.55 | 3.2 | 12.5% | 15 |
| bts.mega.Gnarly 1.4 | 4.7 | 11.2% | 17 |
| cs.Wren 1.0 | 4.7 | 11.4% | 11 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 11.0% | 5 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.3% | 3 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.0% | 0 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 81.6 | 14 / 35 | 4251 |
| 2 | 2 | 65.1 | 78.7 | 13 / 35 | 4267 |
| 3 | 1 | 65.0 | 81.3 | 15 / 35 | 3783 |
| 4 | 2 | 66.1 | 85.1 | 14 / 35 | 4009 |
| 5 | 1 | 64.1 | 77.5 | 14 / 35 | 3800 |
| 6 | 1 | 66.3 | 82.2 | 16 / 35 | 4393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 56 | 54% |
| bvh.mini.Freya 0.55 | 21 | 86% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 100% |
| bts.mega.Gnarly 1.4 | 14 | 79% |
| cs.Wren 1.0 | 13 | 85% |
| matt.UnderDark3 2.4.34 | 1 | 100% |
| kdf.KoulDestroyer 1.0 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 761. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 48 | 39% | 81 |
| bts.mega.Gnarly 1.4 | 22 | 18% | 36 |
| bvh.mini.Freya 0.55 | 17 | 14% | 22 |
| cs.Wren 1.0 | 15 | 12% | 24 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 9% | 32 |
| kdf.KoulDestroyer 1.0 | 7 | 6% | 8 |
| bzdp.BoxCar 2.0 | 3 | 2% | 5 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |

## Melee bench: F39

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 85.7 | 100 / 210 | 2.29 | 17.7% | 28125 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 17.7% | 100 |
| bvh.fry.Freya 0.82 | 2.2 | 14.5% | 29 |
| az.Ololobot 0.2.4 | 2.8 | 13.0% | 51 |
| catcat20.Lambda 0.024 | 4.0 | 11.6% | 22 |
| stelo.SoRobotNanoMelee 1.2 | 6.0 | 8.6% | 8 |
| apollokidd.ApolloKidd 0.9 | 6.5 | 8.1% | 0 |
| gimp.GimpBot 0.1 | 6.5 | 7.9% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.0 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.2 | 81.6 | 11 / 35 | 4526 |
| 2 | 1 | 66.3 | 82.5 | 17 / 35 | 4901 |
| 3 | 1 | 67.8 | 87.0 | 20 / 35 | 5044 |
| 4 | 1 | 66.7 | 86.0 | 17 / 35 | 4609 |
| 5 | 1 | 67.5 | 89.5 | 17 / 35 | 4524 |
| 6 | 1 | 67.1 | 87.6 | 18 / 35 | 4521 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 55 | 45% |
| bvh.fry.Freya 0.82 | 36 | 75% |
| catcat20.Lambda 0.024 | 33 | 70% |
| stelo.SoRobotNanoMelee 1.2 | 15 | 93% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 1146. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 42 | 38% | 63 |
| az.Ololobot 0.2.4 | 36 | 32% | 67 |
| catcat20.Lambda 0.024 | 19 | 17% | 38 |
| stelo.SoRobotNanoMelee 1.2 | 7 | 6% | 10 |
| apollokidd.ApolloKidd 0.9 | 4 | 4% | 11 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 7 |
| gimp.GimpBot 0.1 | 1 | 1% | 10 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

## Melee bench: F40

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.8 | 131 / 210 | 2.10 | 19.1% | 29877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.1% | 131 |
| kawigi.mini.Coriantumr 1.1 | 2.2 | 14.7% | 37 |
| kano.gamma.KanoGamma 1.8 | 3.5 | 12.1% | 17 |
| mz.AntiGrav 1.0 | 4.0 | 11.0% | 5 |
| Polkwane.SmashMelee 1.0 | 4.5 | 10.8% | 11 |
| stelo.Randomness 1.0 | 6.2 | 9.0% | 4 |
| alpha.BlackIce 1.0 | 6.7 | 8.5% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.0% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 4.8% | 0 |
| sample.Corners 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 89.5 | 23 / 35 | 5061 |
| 2 | 1 | 70.2 | 91.7 | 22 / 35 | 5220 |
| 3 | 1 | 68.1 | 86.0 | 21 / 35 | 4440 |
| 4 | 1 | 68.6 | 87.3 | 21 / 35 | 4878 |
| 5 | 1 | 69.3 | 87.6 | 23 / 35 | 5236 |
| 6 | 1 | 68.5 | 84.8 | 21 / 35 | 5042 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 59 | 75% |
| kano.gamma.KanoGamma 1.8 | 32 | 84% |
| mz.AntiGrav 1.0 | 29 | 100% |
| Polkwane.SmashMelee 1.0 | 20 | 85% |
| stelo.Randomness 1.0 | 10 | 90% |
| alpha.BlackIce 1.0 | 3 | 67% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 79 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 34 | 43% | 65 |
| mz.AntiGrav 1.0 | 10 | 13% | 31 |
| Polkwane.SmashMelee 1.0 | 10 | 13% | 23 |
| kano.gamma.KanoGamma 1.8 | 8 | 10% | 44 |
| alpha.BlackIce 1.0 | 8 | 10% | 11 |
| stelo.Randomness 1.0 | 7 | 9% | 23 |
| amk.superstrike.SuperStrike 0.3 | 2 | 3% | 8 |
| sample.Corners 1.0 | 0 | 0% | 4 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 1 |

## Melee bench: F41

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.8 | 87.2 | 113 / 210 | 2.15 | 17.9% | 25196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 17.9% | 113 |
| eem.EvBotNG v12.8 | 1.8 | 15.5% | 58 |
| ary.Swarm 1.1 | 3.3 | 13.1% | 14 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 12.5% | 9 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.0% | 14 |
| shrub.Silver v048 | 6.2 | 8.6% | 3 |
| zyx.nano.Ant 1.1 | 6.8 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 6.0% | 1 |
| stelo.Mirror 1.1 | 8.8 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 88.3 | 21 / 35 | 4007 |
| 2 | 2 | 67.3 | 88.6 | 16 / 35 | 3772 |
| 3 | 1 | 68.1 | 87.3 | 21 / 35 | 4582 |
| 4 | 1 | 67.9 | 85.4 | 20 / 35 | 4340 |
| 5 | 1 | 66.7 | 82.5 | 14 / 35 | 4266 |
| 6 | 1 | 68.7 | 91.1 | 21 / 35 | 4229 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 72 | 58% |
| lessonz.robocode.Oz 0.5.0 | 33 | 100% |
| ary.Swarm 1.1 | 22 | 77% |
| simonton.nano.MeleeSeed 1.8 | 15 | 87% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| shrub.Silver v048 | 3 | 100% |
| stelo.Mirror 1.1 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 49 | 51% | 93 |
| ary.Swarm 1.1 | 23 | 24% | 53 |
| simonton.nano.MeleeSeed 1.8 | 10 | 10% | 22 |
| lessonz.robocode.Oz 0.5.0 | 7 | 7% | 24 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| shrub.Silver v048 | 3 | 3% | 4 |
| jsal.Jsalbot 1.0 | 2 | 2% | 7 |
| stelo.Mirror 1.1 | 0 | 0% | 2 |

## Melee bench: F42

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 86.6 | 108 / 210 | 2.21 | 18.2% | 30351 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.2 | 18.2% | 108 |
| wompi.Wallaby 5.1 | 1.8 | 15.8% | 58 |
| ara.Shera 0.88 | 3.5 | 13.1% | 26 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.3% | 16 |
| amz.NanoClone 1.41 | 5.0 | 9.1% | 1 |
| dsw.StaticD 1.0 | 6.2 | 7.6% | 2 |
| maribo.IotaCT 1.1 | 6.8 | 7.0% | 0 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.3% | 0 |
| stelo.MirrorMicro 1.0 | 8.8 | 5.5% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.5 | 19 / 35 | 5265 |
| 2 | 1 | 67.5 | 86.3 | 18 / 35 | 4839 |
| 3 | 1 | 68.4 | 88.9 | 17 / 35 | 5024 |
| 4 | 2 | 64.0 | 75.6 | 12 / 35 | 4678 |
| 5 | 1 | 71.2 | 94.0 | 25 / 35 | 5891 |
| 6 | 1 | 67.0 | 84.1 | 17 / 35 | 4654 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 64 | 72% |
| ara.Shera 0.88 | 41 | 66% |
| maribo.mini.MiniQuester 0.1 | 28 | 96% |
| dsw.StaticD 1.0 | 4 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 103 of 210 rounds, at a mean tick of 933. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 36 | 35% | 91 |
| ara.Shera 0.88 | 34 | 33% | 57 |
| maribo.mini.MiniQuester 0.1 | 19 | 18% | 44 |
| amz.NanoClone 1.41 | 9 | 9% | 9 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| dsw.StaticD 1.0 | 1 | 1% | 3 |
| maribo.IotaCT 1.1 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.4 | 77.8 | 45 / 210 | 3.00 | 15.1% | 22090 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.1% | 132 |
| hadur117.mini.DeiseD 0.4 | 2.0 | 15.1% | 45 |
| brainfade.melee.Dusk 0.44 | 3.3 | 12.6% | 21 |
| dummy.micro.Sparrow 2.5 | 4.5 | 11.1% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.8% | 3 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 10.0% | 2 |
| jab.DiamondStealer 5 | 7.3 | 7.7% | 1 |
| mz.NanoGod 2.02 | 7.7 | 7.5% | 1 |
| cvt.Firsty 1.0 | 9.0 | 4.4% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.2 | 81.6 | 13 / 35 | 3867 |
| 2 | 2 | 64.4 | 78.7 | 8 / 35 | 3502 |
| 3 | 2 | 63.4 | 75.6 | 8 / 35 | 3671 |
| 4 | 2 | 64.7 | 77.5 | 6 / 35 | 3911 |
| 5 | 2 | 63.8 | 76.5 | 5 / 35 | 3587 |
| 6 | 2 | 64.1 | 77.1 | 5 / 35 | 3552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 79 | 22% |
| brainfade.melee.Dusk 0.44 | 19 | 63% |
| dummy.micro.Sparrow 2.5 | 8 | 88% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 967. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 101 | 61% | 118 |
| brainfade.melee.Dusk 0.44 | 25 | 15% | 35 |
| dummy.micro.Sparrow 2.5 | 13 | 8% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 7% | 16 |
| Krabb.akim2.Akim2 1.1b | 9 | 5% | 10 |
| mz.NanoGod 2.02 | 4 | 2% | 5 |
| jab.DiamondStealer 5 | 1 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.2 | 126 / 210 | 1.97 | 19.3% | 31056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.3% | 126 |
| tzu.TheArtOfWar 1.2 | 2.5 | 13.8% | 26 |
| stelo.Liblix 0.3.1 | 2.5 | 15.0% | 49 |
| wompi.Quokka 1.6 | 4.3 | 10.6% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.2 | 9.6% | 2 |
| jwirde.Gort 2.0 | 5.7 | 8.8% | 2 |
| disan.Chair 2.2.0 | 7.2 | 7.7% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.7% | 2 |
| sample.Crazy 1.0 | 9.2 | 4.4% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.8 | 18 / 35 | 5304 |
| 2 | 1 | 67.4 | 81.6 | 15 / 35 | 5055 |
| 3 | 1 | 70.0 | 91.1 | 25 / 35 | 5202 |
| 4 | 1 | 70.7 | 94.0 | 25 / 35 | 5142 |
| 5 | 1 | 68.7 | 87.6 | 21 / 35 | 5022 |
| 6 | 1 | 69.8 | 90.2 | 22 / 35 | 5331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 66 | 79% |
| tzu.TheArtOfWar 1.2 | 53 | 75% |
| wompi.Quokka 1.6 | 13 | 85% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 88% |
| jwirde.Gort 2.0 | 8 | 100% |
| disan.Chair 2.2.0 | 3 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |
| sample.Crazy 1.0 | 1 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 38 | 43% | 89 |
| tzu.TheArtOfWar 1.2 | 25 | 28% | 63 |
| wompi.Quokka 1.6 | 10 | 11% | 17 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 6% | 11 |
| jwirde.Gort 2.0 | 3 | 3% | 14 |
| stf.PanzerGeneral 0.1 | 3 | 3% | 5 |
| disan.Chair 2.2.0 | 1 | 1% | 6 |
| sample.Crazy 1.0 | 1 | 1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.2 | 77 / 210 | 2.06 | 19.7% | 36382 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseD 0.4 | 1.0 | 19.7% | 77 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 13.4% | 118 |
| jje.BagPuss 1.2 | 2.8 | 12.3% | 4 |
| myl.nano.Graviton 1.10 | 4.7 | 9.8% | 3 |
| sul.Lunar 1.1 | 4.8 | 9.6% | 4 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.1% | 2 |
| hvilela.HVilela 0.9 | 6.7 | 8.4% | 0 |
| fm.claire 1.7 | 7.3 | 7.8% | 0 |
| wit.Deep7 2.0 | 9.2 | 6.2% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.5 | 13 / 35 | 6286 |
| 2 | 1 | 69.3 | 86.7 | 14 / 35 | 6189 |
| 3 | 1 | 70.9 | 91.4 | 17 / 35 | 6308 |
| 4 | 1 | 67.9 | 85.1 | 10 / 35 | 5467 |
| 5 | 1 | 69.1 | 86.0 | 9 / 35 | 6579 |
| 6 | 1 | 69.4 | 90.5 | 14 / 35 | 5553 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 121 | 21% |
| jje.BagPuss 1.2 | 15 | 93% |
| sul.Lunar 1.1 | 15 | 100% |
| myl.nano.Graviton 1.10 | 11 | 82% |
| pez.mini.ChironexFleckeri 0.5 | 7 | 100% |
| wit.Deep7 2.0 | 5 | 80% |
| fm.claire 1.7 | 2 | 100% |
| hvilela.HVilela 0.9 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 2481. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 95 | 71% | 0 |
| jje.BagPuss 1.2 | 13 | 10% | 77 |
| myl.nano.Graviton 1.10 | 8 | 6% | 28 |
| sul.Lunar 1.1 | 4 | 3% | 47 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 3% | 20 |
| fm.claire 1.7 | 4 | 3% | 12 |
| wit.Deep7 2.0 | 3 | 2% | 10 |
| hvilela.HVilela 0.9 | 3 | 2% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 5 |

## Melee bench: F46

hadur117.mini.DeiseD 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 83.0 | 58 / 210 | 2.53 | 16.2% | 24563 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 17.0% | 72 |
| hadur117.mini.DeiseD 0.4 | 1.8 | 16.2% | 58 |
| rsalesc.melee.Medina 0.4.5 | 2.5 | 16.4% | 71 |
| mz.MicroSheep 1.0 | 4.2 | 10.7% | 4 |
| cx.Princess 1.0 | 5.3 | 9.5% | 4 |
| sadoner.killer 0.2 | 6.0 | 8.8% | 0 |
| arthord.NanoSatanMelee Beta | 6.5 | 8.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.2 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 84.8 | 14 / 35 | 4049 |
| 2 | 1 | 65.5 | 83.5 | 12 / 35 | 4078 |
| 3 | 2 | 65.1 | 82.5 | 9 / 35 | 4179 |
| 4 | 3 | 64.8 | 82.9 | 6 / 35 | 3686 |
| 5 | 1 | 66.5 | 84.8 | 11 / 35 | 4318 |
| 6 | 3 | 64.8 | 79.7 | 6 / 35 | 4253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 62 | 48% |
| rsalesc.melee.Medina 0.4.5 | 41 | 24% |
| cx.Princess 1.0 | 8 | 88% |
| mz.MicroSheep 1.0 | 7 | 86% |
| arthord.NanoSatanMelee Beta | 4 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 152 of 210 rounds, at a mean tick of 1032. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 61 | 40% | 73 |
| kc.mini.Mirage 0.2 | 57 | 38% | 91 |
| sadoner.killer 0.2 | 12 | 8% | 13 |
| mz.MicroSheep 1.0 | 11 | 7% | 16 |
| arthord.NanoSatanMelee Beta | 6 | 4% | 7 |
| cx.Princess 1.0 | 5 | 3% | 10 |

