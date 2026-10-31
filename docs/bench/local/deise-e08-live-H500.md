# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.0 | 43 / 210 | 2.26 | 17.3% | 31717 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.8% | 151 |
| hadur117.mini.DeiseH500 0.4 | 2.0 | 17.3% | 43 |
| sgp.JollyNinja 3.53 | 3.2 | 11.6% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.3% | 2 |
| mz.MicroGodMelee 1 | 4.5 | 10.6% | 5 |
| lorneswork.Predator 1.0 | 6.0 | 9.3% | 1 |
| adt.Ar2 1.0 | 6.8 | 7.0% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.3 | 5.1% | 0 |
| skm.butterfly 1.0 | 8.7 | 4.9% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.0 | 83.8 | 8 / 35 | 5252 |
| 2 | 2 | 68.0 | 88.9 | 7 / 35 | 5476 |
| 3 | 2 | 66.5 | 85.7 | 6 / 35 | 4887 |
| 4 | 2 | 67.6 | 85.7 | 9 / 35 | 5324 |
| 5 | 2 | 66.4 | 84.1 | 3 / 35 | 5355 |
| 6 | 2 | 68.1 | 87.6 | 10 / 35 | 5423 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 135 | 13% |
| sgp.JollyNinja 3.53 | 17 | 65% |
| lorneswork.Predator 1.0 | 7 | 86% |
| mz.MicroGodMelee 1 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 1089. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 78% | 152 |
| sgp.JollyNinja 3.53 | 12 | 7% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 14 |
| mz.MicroGodMelee 1 | 7 | 4% | 15 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| lorneswork.Predator 1.0 | 1 | 1% | 4 |
| adt.Ar2 1.0 | 1 | 1% | 1 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F02

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.5 | 90 / 210 | 2.57 | 18.3% | 33530 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.3% | 90 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 14.3% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.3% | 25 |
| lrem.micro.SpikeSoldier 0.4 | 4.2 | 10.9% | 5 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.8% | 12 |
| Noran.BitchingElk 0.054 | 6.8 | 8.2% | 13 |
| sch.Simone 0.3d | 7.0 | 7.5% | 11 |
| fnc.bandit.Bandit 5.2.0 | 7.2 | 7.3% | 2 |
| stelo.PatternRobot 1.0 | 8.8 | 6.1% | 4 |
| fullsail.SweetTea 1.1 | 10.0 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 83.5 | 16 / 35 | 5515 |
| 2 | 1 | 67.9 | 84.1 | 16 / 35 | 5462 |
| 3 | 1 | 66.8 | 80.6 | 12 / 35 | 5612 |
| 4 | 1 | 68.5 | 84.4 | 18 / 35 | 5867 |
| 5 | 1 | 69.3 | 85.4 | 17 / 35 | 5737 |
| 6 | 1 | 65.7 | 77.1 | 11 / 35 | 5337 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 71% |
| pulsar.PulsarMax 0.8.9 | 43 | 58% |
| com.cohesiva.robocode.ManOwaR 1.0 | 13 | 54% |
| sch.Simone 0.3d | 12 | 58% |
| lrem.micro.SpikeSoldier 0.4 | 8 | 100% |
| stelo.PatternRobot 1.0 | 6 | 83% |
| Noran.BitchingElk 0.054 | 5 | 40% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 34% | 62 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 21 | 17% | 55 |
| lrem.micro.SpikeSoldier 0.4 | 16 | 13% | 21 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 10% | 22 |
| Noran.BitchingElk 0.054 | 10 | 8% | 19 |
| stelo.PatternRobot 1.0 | 7 | 6% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6 | 5% | 9 |
| sch.Simone 0.3d | 6 | 5% | 8 |
| fullsail.SweetTea 1.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 92.0 | 145 / 210 | 1.72 | 20.4% | 38816 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 20.4% | 145 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 22 |
| kawigi.nano.Lib 1.0 | 3.0 | 13.5% | 23 |
| vuen.Cake 2.51 | 3.5 | 12.3% | 19 |
| urdos.URDOS 1.3 | 5.2 | 9.0% | 1 |
| adt.Ar1 2.1 | 6.3 | 7.5% | 0 |
| oa.weak.FlyMk1 0.1 | 7.3 | 6.8% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.7% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 90.8 | 24 / 35 | 6345 |
| 2 | 1 | 72.0 | 97.5 | 30 / 35 | 6477 |
| 3 | 1 | 69.6 | 88.6 | 22 / 35 | 6544 |
| 4 | 1 | 69.9 | 90.2 | 20 / 35 | 6415 |
| 5 | 1 | 71.1 | 91.4 | 22 / 35 | 6907 |
| 6 | 1 | 70.8 | 93.7 | 27 / 35 | 6128 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 63 | 89% |
| vuen.Cake 2.51 | 56 | 82% |
| radnor.DoctorBob 1.42 | 33 | 88% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 3 | 67% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 65 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 23 | 35% | 72 |
| radnor.DoctorBob 1.42 | 22 | 34% | 45 |
| vuen.Cake 2.51 | 12 | 18% | 61 |
| urdos.URDOS 1.3 | 4 | 6% | 6 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 11 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 6 |
| adt.Ar1 2.1 | 1 | 2% | 2 |
| bwbaugh.nano.Tirunculus 0.0.0a | 1 | 2% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |

## Melee bench: F04

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.1 | 82.4 | 17 / 210 | 2.59 | 16.8% | 34120 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.2% | 185 |
| hadur117.mini.DeiseH500 0.4 | 2.0 | 16.8% | 17 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 13.1% | 7 |
| TNT.TNT 0.99.1 | 4.3 | 10.1% | 1 |
| josago.Jorgito 0.16 | 4.7 | 9.7% | 0 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 1 |
| tj.zombie1n 1.0.1 | 6.7 | 6.9% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 8.8 | 4.5% | 0 |
| spin.Bugstard 0.012b | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.2 | 83.2 | 5 / 35 | 5365 |
| 2 | 2 | 67.6 | 83.8 | 2 / 35 | 5764 |
| 3 | 2 | 64.6 | 75.9 | 1 / 35 | 5133 |
| 4 | 2 | 68.0 | 84.8 | 4 / 35 | 5909 |
| 5 | 2 | 67.5 | 83.5 | 1 / 35 | 6018 |
| 6 | 2 | 68.0 | 83.2 | 4 / 35 | 5931 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 129 | 8% |
| TNT.TNT 0.99.1 | 3 | 100% |
| css.Delitioner 0.11 | 2 | 50% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |
| josago.Jorgito 0.16 | 1 | 100% |
| spin.Bugstard 0.012b | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 1173. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 148 | 76% | 159 |
| apc.LeeroyJenkins2 1.0 | 21 | 11% | 22 |
| josago.Jorgito 0.16 | 10 | 5% | 12 |
| css.Delitioner 0.11 | 6 | 3% | 6 |
| TNT.TNT 0.99.1 | 4 | 2% | 7 |
| rampancy.Durandal 2.1d | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F05

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.0 | 70.1 | 26 / 210 | 3.69 | 13.6% | 22114 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.5 | 17.3% | 99 |
| justin.DemonicRage 3.4 | 1.5 | 17.5% | 63 |
| hadur117.mini.DeiseH500 0.4 | 3.3 | 13.6% | 26 |
| wompi.Numbat 2.1 | 3.7 | 12.7% | 15 |
| ms.Ares 0.19 | 5.3 | 9.2% | 4 |
| axeBots.HataMoto 3.09 | 5.7 | 8.8% | 3 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.4% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.7 | 5.9% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.5% | 0 |
| GarmBox.Oranges 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 60.4 | 69.5 | 2 / 35 | 3501 |
| 2 | 3 | 61.1 | 71.1 | 5 / 35 | 3610 |
| 3 | 3 | 62.7 | 73.0 | 4 / 35 | 4037 |
| 4 | 3 | 61.2 | 70.5 | 5 / 35 | 3694 |
| 5 | 3 | 59.6 | 67.0 | 4 / 35 | 3445 |
| 6 | 4 | 61.3 | 69.5 | 6 / 35 | 3827 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 35 | 46% |
| cb.fire.Firestarter 2.0f | 20 | 15% |
| wompi.Numbat 2.1 | 11 | 45% |
| ms.Ares 0.19 | 2 | 50% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 728. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 59 | 32% | 66 |
| justin.DemonicRage 3.4 | 54 | 29% | 65 |
| wompi.Numbat 2.1 | 36 | 20% | 41 |
| ms.Ares 0.19 | 14 | 8% | 14 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| davidalves.net.DuelistMicroMelee 1.4 | 7 | 4% | 7 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 3 |

## Melee bench: F06

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.8 | 101 / 210 | 2.55 | 18.0% | 31130 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.0% | 101 |
| jekl.StoneGhost 0.7 | 2.3 | 14.6% | 25 |
| origin.SleepSiphon 1.7b | 2.8 | 13.4% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 12.1% | 23 |
| mld.Wisdom 1.0 | 5.0 | 9.7% | 0 |
| gg.Wolverine 2.0 | 6.2 | 8.7% | 2 |
| spinnercat.Omen 1.0 | 7.2 | 7.0% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.2 | 6.8% | 4 |
| DBall.NUKE 0.1 | 8.5 | 6.3% | 0 |
| sample.Fire 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.6 | 16 / 35 | 5094 |
| 2 | 1 | 67.3 | 83.2 | 18 / 35 | 5083 |
| 3 | 1 | 68.5 | 84.4 | 16 / 35 | 5558 |
| 4 | 1 | 67.8 | 82.9 | 19 / 35 | 5298 |
| 5 | 1 | 66.5 | 81.6 | 15 / 35 | 4891 |
| 6 | 1 | 67.8 | 83.2 | 17 / 35 | 5206 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 46 | 93% |
| pe.minimelee.SandboxMiniMelee 1.1 | 30 | 73% |
| origin.SleepSiphon 1.7b | 29 | 48% |
| gg.Wolverine 2.0 | 7 | 100% |
| mld.Wisdom 1.0 | 7 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 50% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 795. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.minimelee.SandboxMiniMelee 1.1 | 34 | 30% | 61 |
| origin.SleepSiphon 1.7b | 28 | 25% | 40 |
| jekl.StoneGhost 0.7 | 27 | 24% | 65 |
| mld.Wisdom 1.0 | 11 | 10% | 20 |
| ers.nano.hawk.HawkLA 3.0m | 6 | 5% | 10 |
| gg.Wolverine 2.0 | 2 | 2% | 8 |
| spinnercat.Omen 1.0 | 1 | 1% | 4 |
| DBall.NUKE 0.1 | 0 | 0% | 2 |
4 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 91.2 | 106 / 210 | 1.79 | 19.9% | 36898 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.9% | 106 |
| rsalesc.melee.Monk 0.3.6c | 2.3 | 17.2% | 46 |
| rtk.Tachikoma 1.0 | 2.7 | 16.5% | 35 |
| oog.melee.CapuletDroid 1.1 | 4.3 | 11.3% | 11 |
| franzor.Lizt 1.3.1 | 4.7 | 10.6% | 13 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.5% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.7% | 0 |
| sample.Target 1.0 | 9.0 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 92.4 | 20 / 35 | 6014 |
| 2 | 1 | 71.9 | 93.0 | 19 / 35 | 6336 |
| 3 | 1 | 71.7 | 91.1 | 19 / 35 | 6340 |
| 4 | 1 | 70.6 | 89.8 | 15 / 35 | 6123 |
| 5 | 1 | 71.4 | 91.7 | 18 / 35 | 6280 |
| 6 | 1 | 70.3 | 89.2 | 15 / 35 | 5805 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 77% |
| rsalesc.melee.Monk 0.3.6c | 44 | 27% |
| oog.melee.CapuletDroid 1.1 | 22 | 77% |
| franzor.Lizt 1.3.1 | 14 | 43% |
| exauge.GateKeeper 1.1.121g | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 1300. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 44 | 42% | 67 |
| rtk.Tachikoma 1.0 | 40 | 38% | 112 |
| franzor.Lizt 1.3.1 | 10 | 10% | 0 |
| oog.melee.CapuletDroid 1.1 | 9 | 9% | 22 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.6 | 111 / 210 | 2.21 | 18.8% | 31144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.8% | 111 |
| tm.Yuugao 1.0 | 2.3 | 13.0% | 37 |
| shrub.Vapour v159 | 3.0 | 12.7% | 37 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.9% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 10.0% | 10 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.3% | 4 |
| m3thos.Eva00 1.1 | 6.7 | 7.7% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 6.2% | 0 |
| SHAM.WOW 1.4 | 9.3 | 6.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 84.8 | 18 / 35 | 5441 |
| 2 | 1 | 69.2 | 89.5 | 21 / 35 | 5528 |
| 3 | 1 | 65.5 | 81.6 | 12 / 35 | 4481 |
| 4 | 1 | 69.1 | 88.3 | 20 / 35 | 5335 |
| 5 | 1 | 69.6 | 90.5 | 22 / 35 | 5436 |
| 6 | 1 | 67.1 | 84.8 | 18 / 35 | 4923 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 41 | 59% |
| shrub.Vapour v159 | 36 | 47% |
| Krabb.sliNk.Garm 0.9u | 25 | 88% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 87% |
| jwst.DAD.DarkAndDarker 1.1 | 17 | 88% |
| qualidafial.MajorDick 1.0.1 | 6 | 100% |
| m3thos.Eva00 1.1 | 4 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 868. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shrub.Vapour v159 | 31 | 31% | 53 |
| tm.Yuugao 1.0 | 29 | 29% | 58 |
| Krabb.sliNk.Garm 0.9u | 14 | 14% | 27 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 13% | 32 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 5% | 19 |
| m3thos.Eva00 1.1 | 4 | 4% | 7 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 10 |
| SHAM.WOW 1.4 | 0 | 0% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.1 | 75.0 | 55 / 210 | 3.25 | 15.7% | 25988 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.9% | 92 |
| hadur117.mini.DeiseH500 0.4 | 2.0 | 15.7% | 55 |
| kc.micro.Figment 1.0 | 2.5 | 14.0% | 29 |
| pedersen.Grishnakh 1.0 | 4.3 | 10.5% | 14 |
| yagami.Tidus 0.11 | 4.8 | 10.4% | 4 |
| mc2.enemy.Original 0.9 | 5.8 | 9.6% | 14 |
| dft.Calliope 5.6 | 7.2 | 7.7% | 2 |
| step.nanoPri 1.0 | 8.2 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.4 | 78.4 | 9 / 35 | 4569 |
| 2 | 1 | 66.1 | 80.0 | 11 / 35 | 4661 |
| 3 | 3 | 61.1 | 68.6 | 5 / 35 | 3980 |
| 4 | 1 | 64.4 | 76.5 | 9 / 35 | 4322 |
| 5 | 3 | 62.8 | 70.8 | 10 / 35 | 3871 |
| 6 | 2 | 64.8 | 75.6 | 11 / 35 | 4585 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 47 | 30% |
| kc.micro.Figment 1.0 | 29 | 76% |
| yagami.Tidus 0.11 | 10 | 80% |
| mc2.enemy.Original 0.9 | 8 | 63% |
| pedersen.Grishnakh 1.0 | 5 | 40% |
| dft.Calliope 5.6 | 4 | 100% |

Hadur died in 155 of 210 rounds, at a mean tick of 786. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 64 | 41% | 83 |
| kc.micro.Figment 1.0 | 28 | 18% | 51 |
| yagami.Tidus 0.11 | 21 | 14% | 27 |
| mc2.enemy.Original 0.9 | 15 | 10% | 19 |
| pedersen.Grishnakh 1.0 | 12 | 8% | 14 |
| step.nanoPri 1.0 | 6 | 4% | 6 |
| dft.Calliope 5.6 | 4 | 3% | 5 |
| robar.nano.Assertive_Melee 0.2 | 4 | 3% | 4 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 93.9 | 153 / 210 | 1.55 | 20.4% | 34928 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 20.4% | 153 |
| DTF.Kludgy 1.2b | 2.2 | 13.9% | 28 |
| ne.Chimera 1.2 | 3.3 | 12.7% | 10 |
| ejb.Polaris 1.0.1 | 3.5 | 12.5% | 9 |
| tvv.micro.Antares 1.1.1 | 5.3 | 9.8% | 6 |
| vStar.RAFzilla 2.15 | 5.7 | 9.6% | 1 |
| kurios.DOSexe .9b | 7.7 | 6.1% | 1 |
| sam.Samspin 1.0 | 8.2 | 5.4% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.2% | 0 |
| donjezza.Muncho 1.0 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 94.0 | 27 / 35 | 5912 |
| 2 | 1 | 72.4 | 98.1 | 30 / 35 | 6381 |
| 3 | 1 | 70.1 | 94.3 | 22 / 35 | 5601 |
| 4 | 1 | 70.0 | 92.1 | 23 / 35 | 5405 |
| 5 | 1 | 72.2 | 97.1 | 30 / 35 | 6320 |
| 6 | 1 | 68.5 | 87.9 | 21 / 35 | 5309 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 61 | 92% |
| DTF.Kludgy 1.2b | 54 | 70% |
| ne.Chimera 1.2 | 26 | 77% |
| vStar.RAFzilla 2.15 | 21 | 95% |
| tvv.micro.Antares 1.1.1 | 11 | 82% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 2 | 50% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 927. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 29 | 50% | 62 |
| ejb.Polaris 1.0.1 | 11 | 19% | 64 |
| ne.Chimera 1.2 | 7 | 12% | 31 |
| tvv.micro.Antares 1.1.1 | 5 | 9% | 14 |
| vStar.RAFzilla 2.15 | 2 | 3% | 18 |
| sam.Samspin 1.0 | 2 | 3% | 5 |
| donjezza.Muncho 1.0 | 2 | 3% | 4 |
| kurios.DOSexe .9b | 0 | 0% | 10 |

## Melee bench: F11

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 80.1 | 77 / 210 | 2.80 | 17.0% | 28087 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.5 | 17.0% | 77 |
| rz.Aleph 0.34 | 1.5 | 16.0% | 68 |
| cx.mini.Nimrod 0.55 | 3.0 | 13.0% | 25 |
| djc.DynaBot 0.1.1 | 4.2 | 11.3% | 16 |
| br2.MobyDickBot 1.6 | 5.7 | 8.5% | 7 |
| rdt199.Warlord 0.73 | 5.8 | 8.9% | 13 |
| uji.YellohFellah 1.0 | 6.7 | 7.8% | 7 |
| KiraNL.Chupacabra 0.4 | 7.7 | 7.2% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.2 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.8 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 85.7 | 17 / 35 | 4839 |
| 2 | 2 | 64.1 | 76.5 | 8 / 35 | 4508 |
| 3 | 2 | 64.0 | 75.2 | 13 / 35 | 4257 |
| 4 | 2 | 64.9 | 78.1 | 9 / 35 | 4612 |
| 5 | 1 | 67.5 | 82.9 | 16 / 35 | 4988 |
| 6 | 1 | 66.6 | 81.9 | 14 / 35 | 4883 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 47 | 45% |
| djc.DynaBot 0.1.1 | 26 | 85% |
| cx.mini.Nimrod 0.55 | 19 | 74% |
| rdt199.Warlord 0.73 | 10 | 90% |
| uji.YellohFellah 1.0 | 9 | 56% |
| br2.MobyDickBot 1.6 | 4 | 100% |
| jeremyreeder.Vincent 2011.12.09 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 134 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 58 | 43% | 80 |
| cx.mini.Nimrod 0.55 | 32 | 24% | 44 |
| rdt199.Warlord 0.73 | 17 | 13% | 28 |
| djc.DynaBot 0.1.1 | 13 | 10% | 30 |
| uji.YellohFellah 1.0 | 4 | 3% | 8 |
| KiraNL.Chupacabra 0.4 | 4 | 3% | 5 |
| br2.MobyDickBot 1.6 | 3 | 2% | 11 |
| stelo.MirrorNano 1.3 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.8 | 112 / 210 | 2.72 | 17.2% | 24703 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 17.2% | 112 |
| nat.PallasHawk 1.0 | 2.8 | 13.0% | 31 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.2% | 26 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 21 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.0% | 12 |
| cs.sheldor.Talon 1.1 | 6.8 | 7.7% | 1 |
| jp.Perpy 16.0 | 7.0 | 7.5% | 5 |
| jrm.Test0 1.0 | 7.3 | 7.3% | 0 |
| jaybot.bots.Oddball 4.0 | 9.3 | 5.8% | 2 |
| stuff.Vlad 0.1 | 9.5 | 5.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.6 | 22 / 35 | 4364 |
| 2 | 1 | 67.4 | 84.1 | 22 / 35 | 4238 |
| 3 | 1 | 65.4 | 79.7 | 17 / 35 | 4161 |
| 4 | 1 | 63.9 | 76.5 | 18 / 35 | 3719 |
| 5 | 1 | 65.6 | 79.7 | 18 / 35 | 4134 |
| 6 | 1 | 64.7 | 77.5 | 15 / 35 | 4087 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 45 | 87% |
| bts.wiki.RipCurl 0.9b | 38 | 82% |
| darkcanuck.Leon 1.01 | 30 | 77% |
| brainfade.melee.Genghis 0.36 | 8 | 88% |
| jp.Perpy 16.0 | 6 | 83% |
| jrm.Test0 1.0 | 4 | 100% |
| cs.sheldor.Talon 1.1 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 1 | 0% |

Hadur died in 99 of 210 rounds, at a mean tick of 653. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| nat.PallasHawk 1.0 | 21 | 21% | 56 |
| bts.wiki.RipCurl 0.9b | 21 | 21% | 44 |
| darkcanuck.Leon 1.01 | 14 | 14% | 48 |
| brainfade.melee.Genghis 0.36 | 14 | 14% | 21 |
| jrm.Test0 1.0 | 11 | 11% | 15 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 9 |
| jp.Perpy 16.0 | 6 | 6% | 8 |
| jaybot.bots.Oddball 4.0 | 5 | 5% | 6 |
| stuff.Vlad 0.1 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F13

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.2 | 62 / 210 | 2.60 | 16.2% | 26461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.7 | 16.6% | 89 |
| hadur117.mini.DeiseH500 0.4 | 2.0 | 16.2% | 62 |
| ags.Glacier 0.2.11 | 2.3 | 16.3% | 41 |
| shinh.Entangled 0.3 | 4.2 | 11.8% | 12 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.4% | 6 |
| apc.Colossus2 0.17 | 6.3 | 8.1% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.9% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 84.8 | 11 / 35 | 4855 |
| 2 | 1 | 66.0 | 81.3 | 11 / 35 | 4831 |
| 3 | 3 | 66.1 | 84.8 | 10 / 35 | 4251 |
| 4 | 3 | 64.0 | 77.5 | 8 / 35 | 4108 |
| 5 | 1 | 66.7 | 85.7 | 12 / 35 | 4419 |
| 6 | 3 | 64.3 | 79.0 | 10 / 35 | 3997 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 55 | 33% |
| ags.Glacier 0.2.11 | 44 | 66% |
| shinh.Entangled 0.3 | 13 | 46% |
| gh.micro.Gruweltje 0.7 | 11 | 55% |
| stelo.Wang 1.0 | 3 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 884. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 56 | 38% | 73 |
| ags.Glacier 0.2.11 | 50 | 34% | 73 |
| shinh.Entangled 0.3 | 19 | 13% | 29 |
| gh.micro.Gruweltje 0.7 | 16 | 11% | 25 |
| stelo.Wang 1.0 | 5 | 3% | 7 |
| maribo.FollowFire 1 | 1 | 1% | 2 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.5 | 152 / 210 | 1.58 | 20.6% | 35756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 20.6% | 152 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.3% | 29 |
| catcat20.shape.Theta 0.018 | 3.2 | 11.6% | 23 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.4% | 1 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.3% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.7 | 9.2% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 8.6% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 8.3% | 7 |
| pa.Improved 1.0 | 9.0 | 5.5% | 1 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.0 | 23 / 35 | 5591 |
| 2 | 1 | 72.0 | 95.2 | 26 / 35 | 6260 |
| 3 | 1 | 71.6 | 94.3 | 28 / 35 | 6146 |
| 4 | 1 | 69.1 | 88.3 | 20 / 35 | 5590 |
| 5 | 1 | 71.8 | 95.9 | 27 / 35 | 5982 |
| 6 | 1 | 71.8 | 94.6 | 28 / 35 | 6187 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 94 | 84% |
| catcat20.shape.Theta 0.018 | 51 | 75% |
| sheldor.micro.PointInLineRRAL 1.0 | 18 | 78% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 7 | 86% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| sample.TrackFire 1.0 | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 27 | 44% | 99 |
| catcat20.shape.Theta 0.018 | 15 | 25% | 47 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 7% | 19 |
| sanyi.mikrobi.Roberto 1.0 | 4 | 7% | 17 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 3% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 2 | 3% | 6 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 6 |
| pa.Improved 1.0 | 2 | 3% | 3 |
3 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.6 | 96 / 210 | 2.65 | 18.2% | 33656 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.2% | 96 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.1% | 34 |
| emp.Yngwie 1.11 | 3.3 | 12.8% | 43 |
| mld.DustBunny 3.8 | 3.7 | 12.2% | 7 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.6% | 13 |
| kawigi.robot.Girl 1.2 | 6.0 | 9.1% | 15 |
| lambdaxy.TBot 0.1 | 7.3 | 6.7% | 0 |
| Grystrion.TrackerWO 1.0 | 8.3 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.5 | 5.7% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 81.0 | 14 / 35 | 5241 |
| 2 | 1 | 69.8 | 86.7 | 21 / 35 | 5933 |
| 3 | 1 | 65.6 | 76.2 | 10 / 35 | 5460 |
| 4 | 1 | 67.0 | 80.0 | 16 / 35 | 5343 |
| 5 | 1 | 69.6 | 85.7 | 20 / 35 | 5988 |
| 6 | 1 | 67.4 | 80.3 | 15 / 35 | 5691 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 47 | 60% |
| kawigi.micro.Shiz 1.1 | 31 | 94% |
| mld.DustBunny 3.8 | 16 | 94% |
| cb.nano.Insomnia 1.0 | 14 | 71% |
| kawigi.robot.Girl 1.2 | 9 | 67% |
| divineomega.TrialBot 0.003 | 4 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 2 | 100% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 904. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 37 | 32% | 74 |
| cb.nano.Insomnia 1.0 | 26 | 23% | 25 |
| mld.DustBunny 3.8 | 19 | 17% | 44 |
| kawigi.micro.Shiz 1.1 | 17 | 15% | 42 |
| kawigi.robot.Girl 1.2 | 11 | 10% | 16 |
| divineomega.TrialBot 0.003 | 2 | 2% | 5 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 2 |

## Melee bench: F16

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 84.2 | 94 / 210 | 2.42 | 19.1% | 37247 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.1% | 94 |
| gh.Griezel 0.5.2 | 2.2 | 16.2% | 68 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 2.8 | 14.1% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.0 | 10.8% | 35 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.2% | 0 |
| tvv.nano.Polaris 1.2 | 5.5 | 9.1% | 4 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.6% | 1 |
| divineomega.DivineBot 1.9.4.5 | 8.3 | 5.0% | 3 |
| repositorio.NanoStep 1.0 | 9.2 | 4.4% | 0 |
| asd.Cthulhu 1.3 | 9.3 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 85.1 | 16 / 35 | 6088 |
| 2 | 1 | 69.5 | 83.8 | 19 / 35 | 6215 |
| 3 | 1 | 68.6 | 82.9 | 11 / 35 | 5983 |
| 4 | 1 | 68.8 | 82.5 | 17 / 35 | 6114 |
| 5 | 1 | 69.7 | 85.4 | 16 / 35 | 6236 |
| 6 | 1 | 70.2 | 85.7 | 15 / 35 | 6611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 77 | 49% |
| techdude.forest.FlamingForest 1.1 | 26 | 62% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 23 | 91% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 60% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1134. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 65 | 56% | 106 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 11% | 35 |
| techdude.forest.FlamingForest 1.1 | 13 | 11% | 28 |
| bvh.fnr.Fenrir 0.36l | 8 | 7% | 13 |
| tvv.nano.Polaris 1.2 | 8 | 7% | 12 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 9 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 5 |
| asd.Cthulhu 1.3 | 1 | 1% | 1 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 77.8 | 75 / 210 | 3.00 | 16.9% | 31506 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 16.9% | 75 |
| et.Predator 1.8 | 2.3 | 13.3% | 39 |
| cx.BlestPain 1.41 | 3.3 | 12.7% | 43 |
| oog.melee.Mercutio 1.0 | 3.8 | 12.1% | 29 |
| nic.Nicator 2.4 | 5.0 | 11.1% | 12 |
| ahf.NanoAndrew .4 | 5.5 | 11.0% | 13 |
| maribo.melee.BMV 0.1 | 7.0 | 9.1% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.5% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 85.7 | 15 / 35 | 5777 |
| 2 | 1 | 67.4 | 82.5 | 17 / 35 | 5329 |
| 3 | 1 | 66.4 | 78.7 | 14 / 35 | 5308 |
| 4 | 1 | 64.0 | 73.3 | 9 / 35 | 4916 |
| 5 | 1 | 65.1 | 73.7 | 10 / 35 | 5603 |
| 6 | 1 | 63.7 | 73.0 | 10 / 35 | 4573 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 42 | 67% |
| cx.BlestPain 1.41 | 24 | 25% |
| nic.Nicator 2.4 | 22 | 86% |
| oog.melee.Mercutio 1.0 | 18 | 72% |
| ahf.NanoAndrew .4 | 11 | 73% |
| maribo.melee.BMV 0.1 | 1 | 100% |

Hadur died in 137 of 210 rounds, at a mean tick of 909. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 35 | 26% | 43 |
| et.Predator 1.8 | 31 | 23% | 55 |
| nic.Nicator 2.4 | 22 | 16% | 39 |
| ahf.NanoAndrew .4 | 20 | 15% | 27 |
| oog.melee.Mercutio 1.0 | 15 | 11% | 30 |
| maribo.melee.BMV 0.1 | 9 | 7% | 11 |
| tex.Longbot 0.4 | 3 | 2% | 3 |
| edu.otg.spr.TheTeacher 1.2 | 0 | 0% | 2 |
2 death(s) with no robot to name.

## Melee bench: F18

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 86.0 | 109 / 210 | 2.26 | 18.3% | 28856 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.3% | 109 |
| morbid.MorbidPriest 1.0 | 2.5 | 13.3% | 42 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.6% | 28 |
| uji.DBH 1.1 | 3.5 | 11.2% | 10 |
| ratosh.Nobo 0.21 | 5.0 | 9.9% | 1 |
| spinnercat.Robovirus 2.718 | 6.0 | 8.9% | 8 |
| sigterm.Sigterm 1.0 | 7.3 | 7.6% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 7.3 | 7.3% | 2 |
| stelo.WangRobot 1.0 | 9.0 | 6.3% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 10.0 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 86.3 | 18 / 35 | 4912 |
| 2 | 1 | 67.7 | 87.6 | 18 / 35 | 4956 |
| 3 | 1 | 66.9 | 83.8 | 14 / 35 | 4925 |
| 4 | 1 | 67.8 | 88.3 | 20 / 35 | 4689 |
| 5 | 1 | 66.1 | 81.0 | 18 / 35 | 4462 |
| 6 | 1 | 68.4 | 88.9 | 21 / 35 | 4912 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 43 | 56% |
| uji.DBH 1.1 | 28 | 93% |
| agd.Mooserwirt2 2.7 | 27 | 52% |
| sigterm.Sigterm 1.0 | 17 | 76% |
| ratosh.Nobo 0.21 | 10 | 90% |
| stelo.WangRobot 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 9 | 89% |
| spinnercat.Robovirus 2.718 | 7 | 71% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 40 | 39% | 62 |
| agd.Mooserwirt2 2.7 | 27 | 26% | 43 |
| uji.DBH 1.1 | 7 | 7% | 25 |
| ratosh.Nobo 0.21 | 7 | 7% | 20 |
| sigterm.Sigterm 1.0 | 7 | 7% | 18 |
| spinnercat.Robovirus 2.718 | 5 | 5% | 13 |
| stelo.WangRobot 1.0 | 4 | 4% | 8 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 3% | 19 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F19

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.1 | 94.1 | 142 / 210 | 1.53 | 21.1% | 37599 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 21.1% | 142 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.8% | 24 |
| mld.Infinity 2.2 | 2.7 | 14.4% | 37 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.2% | 5 |
| erdnis.Rover 0.3 | 5.2 | 10.1% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.5% | 0 |
| pac.ABC 2.1 | 7.5 | 6.9% | 1 |
| mbh.Mbh 0.1 | 8.0 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.5 | 5.6% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.1 | 28 / 35 | 6169 |
| 2 | 1 | 72.2 | 94.3 | 24 / 35 | 6169 |
| 3 | 1 | 71.6 | 93.3 | 21 / 35 | 6192 |
| 4 | 1 | 72.5 | 94.3 | 23 / 35 | 6575 |
| 5 | 1 | 71.4 | 90.8 | 23 / 35 | 6354 |
| 6 | 1 | 72.0 | 94.6 | 23 / 35 | 6140 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 83 | 80% |
| mld.Infinity 2.2 | 63 | 63% |
| krillr.mini.JointStrike 2.0.0 | 13 | 92% |
| erdnis.Rover 0.3 | 8 | 88% |
| pac.ABC 2.1 | 7 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 1402. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 29 | 41% | 114 |
| mld.Infinity 2.2 | 25 | 36% | 14 |
| krillr.mini.JointStrike 2.0.0 | 10 | 14% | 27 |
| erdnis.Rover 0.3 | 6 | 9% | 15 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| patson.PatsonTestBot 1.0 | 0 | 0% | 11 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 7 |

## Melee bench: F20

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 89.8 | 112 / 210 | 1.92 | 19.9% | 35773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.9% | 112 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.1% | 33 |
| fwb.Nine 1.0.1 | 3.2 | 12.2% | 33 |
| nz.jdc.nano.GridFu 1.0 | 4.2 | 11.0% | 9 |
| catcat20.Rabbit 0.001 | 4.7 | 10.3% | 17 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 7.6% | 0 |
| bayen.nut.Squirrel 1.615 | 6.8 | 7.5% | 4 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 6.8% | 2 |
| ntc.ControlledChaos 1.1.4 | 8.8 | 5.4% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 89.2 | 17 / 35 | 5863 |
| 2 | 1 | 71.2 | 91.4 | 22 / 35 | 6284 |
| 3 | 1 | 71.3 | 90.8 | 24 / 35 | 6268 |
| 4 | 1 | 68.3 | 86.0 | 14 / 35 | 5419 |
| 5 | 1 | 70.7 | 92.1 | 18 / 35 | 6211 |
| 6 | 1 | 69.6 | 89.2 | 17 / 35 | 5728 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 71 | 77% |
| fwb.Nine 1.0.1 | 38 | 50% |
| catcat20.Rabbit 0.001 | 30 | 60% |
| nz.jdc.nano.GridFu 1.0 | 13 | 69% |
| bayen.nut.Squirrel 1.615 | 6 | 83% |
| djdjdj.NanoSkunk10 1.0 | 2 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |
| ntc.ControlledChaos 1.1.4 | 2 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 1231. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 36 | 36% | 86 |
| fwb.Nine 1.0.1 | 29 | 29% | 23 |
| catcat20.Rabbit 0.001 | 19 | 19% | 38 |
| nz.jdc.nano.GridFu 1.0 | 11 | 11% | 29 |
| bayen.nut.Squirrel 1.615 | 3 | 3% | 17 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 4 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 4 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 91.1 | 117 / 210 | 1.80 | 20.0% | 35344 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 20.0% | 117 |
| eem.EvBot v4.6.16 | 2.0 | 16.4% | 73 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.5% | 11 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.2% | 3 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.2% | 0 |
| eld.Hmm 1.0 | 5.7 | 8.1% | 8 |
| el.JumpShoot 0.2 | 7.8 | 5.7% | 1 |
| fire219.CatBot 1.0 | 7.8 | 6.4% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 89.5 | 18 / 35 | 5830 |
| 2 | 1 | 71.1 | 90.2 | 18 / 35 | 6254 |
| 3 | 1 | 72.2 | 96.2 | 25 / 35 | 6208 |
| 4 | 1 | 69.9 | 90.5 | 19 / 35 | 5632 |
| 5 | 1 | 70.0 | 91.4 | 18 / 35 | 5517 |
| 6 | 1 | 69.9 | 88.9 | 19 / 35 | 5903 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 91 | 53% |
| dummy.mini.Scimitar 1.01 | 45 | 91% |
| cf.RiO.RiOx 4.2.1 | 16 | 100% |
| eld.Hmm 1.0 | 9 | 67% |
| oa.weak.BotherBot 0.1 | 5 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1215. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 55 | 58% | 92 |
| dummy.mini.Scimitar 1.01 | 22 | 23% | 63 |
| cf.RiO.RiOx 4.2.1 | 7 | 7% | 22 |
| eld.Hmm 1.0 | 5 | 5% | 19 |
| oa.weak.BotherBot 0.1 | 2 | 2% | 10 |
| arthord.MannyPacquiao Beta | 1 | 1% | 1 |
| el.JumpShoot 0.2 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 82.0 | 86 / 210 | 2.62 | 17.7% | 31881 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.3 | 17.7% | 86 |
| pe.SandboxDT 2.71m | 2.0 | 15.9% | 56 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.0% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 13.1% | 23 |
| bigpete.Stewie 1.0 | 5.0 | 10.7% | 7 |
| yk.JahRoslav 1.1 | 6.7 | 7.0% | 2 |
| tad.Dalek98 0.98 | 7.2 | 6.7% | 1 |
| gg.Squaraus 0.6 | 7.2 | 6.1% | 0 |
| pbg.NinjaX 1.2 | 9.2 | 4.6% | 1 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 9.8 | 3.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 81.6 | 15 / 35 | 5316 |
| 2 | 2 | 66.6 | 80.0 | 11 / 35 | 4949 |
| 3 | 1 | 67.7 | 81.0 | 14 / 35 | 5565 |
| 4 | 2 | 66.2 | 76.5 | 10 / 35 | 5526 |
| 5 | 1 | 68.7 | 86.3 | 18 / 35 | 5100 |
| 6 | 1 | 69.5 | 86.7 | 18 / 35 | 5425 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jlm.javaDisturbance 0.59 | 40 | 80% |
| pe.SandboxDT 2.71m | 39 | 46% |
| kvk.HebusLeTroll 0.35 | 35 | 74% |
| bigpete.Stewie 1.0 | 6 | 83% |
| yk.JahRoslav 1.1 | 3 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |

Hadur died in 124 of 210 rounds, at a mean tick of 838. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 43 | 35% | 73 |
| kvk.HebusLeTroll 0.35 | 36 | 29% | 58 |
| jlm.javaDisturbance 0.59 | 32 | 26% | 53 |
| bigpete.Stewie 1.0 | 8 | 6% | 17 |
| tad.Dalek98 0.98 | 4 | 3% | 4 |
| gg.Squaraus 0.6 | 1 | 1% | 2 |
| yk.JahRoslav 1.1 | 0 | 0% | 1 |
| pbg.NinjaX 1.2 | 0 | 0% | 1 |

## Melee bench: F23

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.6 | 121 / 210 | 1.85 | 19.7% | 32522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.7% | 121 |
| pe.SandboxLump 1.52 | 2.0 | 17.8% | 68 |
| cre.Karolos 0.32 | 3.0 | 13.2% | 11 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.0% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.0% | 2 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6.3 | 8.8% | 2 |
| cw.megas.Blade 0.8 | 7.0 | 8.2% | 0 |
| sample.Walls 1.0 | 7.5 | 7.6% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.2% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 91.4 | 22 / 35 | 5320 |
| 2 | 1 | 70.2 | 88.3 | 19 / 35 | 5699 |
| 3 | 1 | 70.2 | 89.2 | 20 / 35 | 5151 |
| 4 | 1 | 71.2 | 93.0 | 19 / 35 | 5576 |
| 5 | 1 | 70.2 | 89.5 | 20 / 35 | 5276 |
| 6 | 1 | 71.1 | 92.1 | 21 / 35 | 5500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 97 | 66% |
| cre.Karolos 0.32 | 28 | 82% |
| stelo.AreaTargetingBot 1.1 | 13 | 85% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 8 | 88% |
| sample.Walls 1.0 | 7 | 100% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 58 | 65% | 127 |
| cre.Karolos 0.32 | 18 | 20% | 35 |
| stelo.AreaTargetingBot 1.1 | 8 | 9% | 18 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 3% | 7 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 12 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| cw.megas.Blade 0.8 | 0 | 0% | 3 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 74.4 | 53 / 210 | 3.30 | 15.3% | 25367 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.3 | 15.3% | 53 |
| florent.XSeries.X2 0.12 | 2.7 | 13.2% | 47 |
| rz.GlowBlowMelee 1.4 | 2.7 | 14.0% | 37 |
| davidalves.Phoenix 0.54 | 3.5 | 13.2% | 46 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.1% | 12 |
| oog.melee.Corsair 1.0 | 6.2 | 9.1% | 4 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.7% | 12 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.2% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 5.1% | 0 |
| evd.X1 0.01 | 9.5 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.4 | 75.2 | 11 / 35 | 4248 |
| 2 | 2 | 62.6 | 70.8 | 10 / 35 | 4166 |
| 3 | 1 | 64.3 | 76.8 | 7 / 35 | 4476 |
| 4 | 1 | 63.4 | 75.6 | 9 / 35 | 4231 |
| 5 | 2 | 61.3 | 70.8 | 6 / 35 | 3875 |
| 6 | 1 | 64.3 | 77.1 | 10 / 35 | 4371 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 23 | 74% |
| davidalves.Phoenix 0.54 | 21 | 62% |
| florent.XSeries.X2 0.12 | 18 | 17% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| stelo.SoJNanoMelee 1.1 | 8 | 88% |
| oog.melee.Corsair 1.0 | 3 | 100% |
| lunchie.Lunchbox 0.93 | 2 | 50% |

Hadur died in 159 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.GlowBlowMelee 1.4 | 39 | 25% | 56 |
| davidalves.Phoenix 0.54 | 37 | 23% | 52 |
| florent.XSeries.X2 0.12 | 36 | 23% | 41 |
| pedersen.Ugluk 1.1.1 | 25 | 16% | 29 |
| stelo.SoJNanoMelee 1.1 | 7 | 4% | 9 |
| oog.melee.Corsair 1.0 | 6 | 4% | 13 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 7 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| evd.X1 0.01 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 83.2 | 133 / 210 | 2.51 | 18.4% | 27876 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.4% | 133 |
| voidious.mini.BrokenSword 2.0.3 | 2.3 | 13.7% | 26 |
| voidious.micro.BlitzBat 1.05 | 2.7 | 13.1% | 22 |
| jdw.Hurricane 1.4 | 4.0 | 10.8% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.7 | 9.2% | 9 |
| ds.Oo 2.2 | 5.8 | 8.9% | 7 |
| awesomeness.Elite 1.0 | 7.0 | 7.5% | 1 |
| gjr.Cephalosporin 0.1 | 7.7 | 7.4% | 2 |
| adt.Ar2 1.1 | 8.8 | 6.4% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 23 / 35 | 4546 |
| 2 | 1 | 68.3 | 86.0 | 22 / 35 | 4552 |
| 3 | 1 | 63.0 | 69.8 | 15 / 35 | 4187 |
| 4 | 1 | 67.1 | 80.3 | 22 / 35 | 4684 |
| 5 | 1 | 71.1 | 93.0 | 28 / 35 | 5269 |
| 6 | 1 | 67.8 | 83.2 | 23 / 35 | 4638 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 56 | 93% |
| voidious.micro.BlitzBat 1.05 | 37 | 95% |
| jdw.Hurricane 1.4 | 25 | 96% |
| gjr.Cephalosporin 0.1 | 9 | 100% |
| ds.Oo 2.2 | 6 | 67% |
| gre.svman4.Morfeas 1.4.1 | 4 | 75% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 2 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 519. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.micro.BlitzBat 1.05 | 25 | 32% | 53 |
| voidious.mini.BrokenSword 2.0.3 | 19 | 25% | 65 |
| jdw.Hurricane 1.4 | 11 | 14% | 38 |
| adt.Ar2 1.1 | 7 | 9% | 8 |
| ds.Oo 2.2 | 5 | 6% | 15 |
| gre.svman4.Morfeas 1.4.1 | 5 | 6% | 10 |
| gjr.Cephalosporin 0.1 | 2 | 3% | 9 |
| amk.ChumbaMini 0.2 | 2 | 3% | 4 |
| awesomeness.Elite 1.0 | 1 | 1% | 7 |

## Melee bench: F26

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 87.2 | 118 / 210 | 2.15 | 19.3% | 36128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.3% | 118 |
| ak.Fermat 2.0 | 2.0 | 14.4% | 40 |
| shu.nitro.LENIN .T34 | 3.3 | 12.6% | 22 |
| lrem.Spectre 0.4.4 | 3.8 | 12.3% | 15 |
| js.PinBall 1.6 | 4.8 | 10.6% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 6.3 | 9.0% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 8.9% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 2 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 90.8 | 22 / 35 | 6220 |
| 2 | 1 | 70.3 | 88.6 | 21 / 35 | 6080 |
| 3 | 1 | 72.0 | 93.7 | 24 / 35 | 6645 |
| 4 | 1 | 66.1 | 77.1 | 14 / 35 | 5294 |
| 5 | 1 | 68.8 | 86.3 | 19 / 35 | 5748 |
| 6 | 1 | 69.4 | 86.7 | 18 / 35 | 6141 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 46 | 80% |
| ak.Fermat 2.0 | 44 | 73% |
| lrem.Spectre 0.4.4 | 34 | 82% |
| jaybot.adv.bots.JayBot 2.0 | 10 | 90% |
| js.PinBall 1.6 | 7 | 71% |
| gh.mini.GrubbmOne 1.0 | 5 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 0% |

Hadur died in 93 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 30 | 32% | 56 |
| shu.nitro.LENIN .T34 | 25 | 27% | 71 |
| lrem.Spectre 0.4.4 | 19 | 20% | 41 |
| js.PinBall 1.6 | 7 | 8% | 16 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 10 |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 4% | 6 |
| gh.mini.GrubbmOne 1.0 | 2 | 2% | 8 |
| sample.SpinBot 1.0 | 1 | 1% | 2 |

## Melee bench: F27

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 81.5 | 99 / 210 | 2.67 | 17.9% | 31132 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 17.9% | 99 |
| mk.Alpha 0.2.1 | 2.5 | 13.7% | 49 |
| EH.Eagle 1.0.6 | 3.7 | 11.0% | 12 |
| sheldor.melee.nano.TestMelee 0.1 | 4.0 | 11.0% | 18 |
| wee.Gem 1.8.4 | 4.2 | 10.9% | 27 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.5% | 4 |
| throxbot.ThroxBot 0.1 | 7.3 | 8.2% | 1 |
| caimano.Furia_Ceca 0.22 | 8.2 | 7.0% | 0 |
| joe.ADinosaur 1.0 | 8.3 | 7.3% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.7 | 19 / 35 | 4923 |
| 2 | 1 | 64.4 | 77.1 | 13 / 35 | 4372 |
| 3 | 1 | 67.8 | 77.1 | 16 / 35 | 5785 |
| 4 | 1 | 70.3 | 82.9 | 20 / 35 | 6436 |
| 5 | 1 | 68.5 | 90.2 | 17 / 35 | 5037 |
| 6 | 1 | 63.8 | 74.9 | 14 / 35 | 4579 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 49 | 63% |
| wee.Gem 1.8.4 | 27 | 67% |
| sheldor.melee.nano.TestMelee 0.1 | 27 | 70% |
| EH.Eagle 1.0.6 | 18 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| throxbot.ThroxBot 0.1 | 3 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |
| joe.ADinosaur 1.0 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 41 | 37% | 72 |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 17% | 35 |
| wee.Gem 1.8.4 | 15 | 14% | 33 |
| EH.Eagle 1.0.6 | 9 | 8% | 27 |
| throxbot.ThroxBot 0.1 | 8 | 7% | 12 |
| joe.ADinosaur 1.0 | 8 | 7% | 8 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 5% | 12 |
| caimano.Furia_Ceca 0.22 | 5 | 5% | 8 |
| cs.Grudge 1.0 | 1 | 1% | 2 |

## Melee bench: F28

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 89.9 | 137 / 210 | 1.91 | 19.4% | 29033 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.4% | 137 |
| kid.test.NightFox .2 | 2.0 | 15.0% | 44 |
| uji.Antique 1.0 | 3.7 | 11.1% | 16 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 11.0% | 7 |
| pfvicm.Sobieski 7.2.3b | 4.7 | 10.3% | 1 |
| amk.ChumbaWumba 0.3 | 6.5 | 8.0% | 2 |
| ahr.ice.Ice 1.0.2 | 6.8 | 7.7% | 1 |
| matt.advanced.Katana 1.0 | 8.2 | 6.2% | 2 |
| stelo.Lifestealer 1.0 | 9.0 | 5.8% | 0 |
| stelo.PianistNano 1.2 | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.2 | 22 / 35 | 4500 |
| 2 | 1 | 69.6 | 90.5 | 23 / 35 | 4919 |
| 3 | 1 | 68.2 | 87.6 | 23 / 35 | 4615 |
| 4 | 1 | 70.3 | 93.0 | 26 / 35 | 5102 |
| 5 | 1 | 68.4 | 87.3 | 20 / 35 | 5078 |
| 6 | 1 | 69.7 | 91.7 | 23 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 89 | 73% |
| uji.Antique 1.0 | 41 | 88% |
| qohnil.blot.BlotBot 3.61 | 22 | 86% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| ahr.ice.Ice 1.0.2 | 5 | 80% |
| stelo.PianistNano 1.2 | 3 | 100% |
| pfvicm.Sobieski 7.2.3b | 3 | 100% |
| matt.advanced.Katana 1.0 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 38 | 52% | 101 |
| uji.Antique 1.0 | 10 | 14% | 42 |
| qohnil.blot.BlotBot 3.61 | 8 | 11% | 27 |
| pfvicm.Sobieski 7.2.3b | 8 | 11% | 13 |
| amk.ChumbaWumba 0.3 | 7 | 10% | 12 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |
| ahr.ice.Ice 1.0.2 | 1 | 1% | 7 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 81.3 | 97 / 210 | 2.69 | 18.0% | 29648 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.2 | 18.0% | 97 |
| deewiant.Anomaly 0.2 | 2.3 | 15.5% | 53 |
| zyx.mega.YersiniaPestis 3.1 | 2.8 | 14.1% | 46 |
| myl.micro.Troodon 1.10 | 3.8 | 12.3% | 8 |
| jok.PheonixM 0.1.2 | 4.8 | 10.1% | 4 |
| ph.melee.ArcherME 0.3 | 6.0 | 7.9% | 1 |
| DBall.Anarchy 0.1 | 7.0 | 6.5% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 5.9% | 0 |
| ap.Frederick 1.1 | 9.0 | 5.1% | 1 |
| jangs.ns51 1.0 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.6 | 76.5 | 13 / 35 | 4660 |
| 2 | 1 | 69.3 | 85.7 | 20 / 35 | 5141 |
| 3 | 1 | 66.5 | 76.8 | 15 / 35 | 4837 |
| 4 | 1 | 68.2 | 82.9 | 13 / 35 | 5136 |
| 5 | 1 | 68.3 | 83.2 | 18 / 35 | 4805 |
| 6 | 1 | 68.2 | 82.5 | 18 / 35 | 5069 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 66 | 65% |
| zyx.mega.YersiniaPestis 3.1 | 32 | 69% |
| myl.micro.Troodon 1.10 | 19 | 100% |
| jok.PheonixM 0.1.2 | 5 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 3 | 100% |
| DBall.Anarchy 0.1 | 2 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 798. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 50 | 44% | 90 |
| zyx.mega.YersiniaPestis 3.1 | 28 | 25% | 48 |
| myl.micro.Troodon 1.10 | 17 | 15% | 35 |
| jok.PheonixM 0.1.2 | 10 | 9% | 19 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 6 |
| jangs.ns51 1.0 | 2 | 2% | 3 |
| fullsail.TimbotNoPrediction 1.0 | 2 | 2% | 3 |
| DBall.Anarchy 0.1 | 1 | 1% | 5 |

## Melee bench: F30

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.0 | 71.7 | 38 / 210 | 3.55 | 14.5% | 24394 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.5 | 14.5% | 38 |
| catcat20.Matcha 0.006 | 1.7 | 14.8% | 62 |
| darkcanuck.B26354 1.06 | 3.3 | 13.4% | 41 |
| oog.melee.Capulet 1.2 | 3.8 | 13.1% | 37 |
| stelo.PastFuture 2.3.2 | 4.7 | 11.8% | 19 |
| intruder.PrairieWolf 2.61 | 7.2 | 7.9% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 7.5 | 7.4% | 2 |
| tripphippy.Alice 1.1 | 7.7 | 7.3% | 5 |
| ntc.Opposite 1.5 | 7.7 | 7.2% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 62.8 | 72.1 | 9 / 35 | 4079 |
| 2 | 1 | 62.5 | 72.4 | 4 / 35 | 4437 |
| 3 | 1 | 61.9 | 72.4 | 8 / 35 | 4027 |
| 4 | 2 | 62.0 | 70.5 | 7 / 35 | 3952 |
| 5 | 2 | 60.9 | 70.2 | 4 / 35 | 3785 |
| 6 | 2 | 62.2 | 72.7 | 6 / 35 | 4114 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 32 | 41% |
| oog.melee.Capulet 1.2 | 18 | 56% |
| darkcanuck.B26354 1.06 | 17 | 29% |
| stelo.PastFuture 2.3.2 | 11 | 45% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 75% |
| tripphippy.Alice 1.1 | 2 | 50% |
| intruder.PrairieWolf 2.61 | 2 | 0% |
| ntc.Opposite 1.5 | 1 | 100% |

Hadur died in 172 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 36 | 21% | 49 |
| darkcanuck.B26354 1.06 | 36 | 21% | 44 |
| oog.melee.Capulet 1.2 | 32 | 19% | 39 |
| stelo.PastFuture 2.3.2 | 30 | 17% | 36 |
| tripphippy.Alice 1.1 | 13 | 8% | 15 |
| ntc.Opposite 1.5 | 10 | 6% | 10 |
| intruder.PrairieWolf 2.61 | 8 | 5% | 9 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 8 |

## Melee bench: F31

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.8 | 71.4 | 31 / 210 | 3.57 | 14.2% | 22739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.5% | 119 |
| hadur117.mini.DeiseH500 0.4 | 2.2 | 14.2% | 31 |
| gh.mini.Griezel 0.2 | 3.2 | 12.8% | 33 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 12.0% | 12 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.3% | 12 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.6% | 4 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.4% | 0 |
| fm.mammillarias 1.3 | 7.7 | 6.5% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.0% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.9 | 74.6 | 6 / 35 | 4004 |
| 2 | 3 | 59.7 | 66.3 | 2 / 35 | 3572 |
| 3 | 2 | 60.3 | 68.6 | 3 / 35 | 3513 |
| 4 | 2 | 64.4 | 76.5 | 9 / 35 | 4278 |
| 5 | 2 | 61.9 | 70.8 | 7 / 35 | 3582 |
| 6 | 2 | 61.4 | 71.7 | 4 / 35 | 3790 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 43 | 33% |
| gh.mini.Griezel 0.2 | 18 | 11% |
| spinnercat.micro.Tyger 0.1 | 8 | 88% |
| d414.nano.Quantum 1.0.0 | 6 | 67% |
| gh.nano.Grofvuil 0.2 | 4 | 50% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |
| fm.mammillarias 1.3 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 735. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 58 | 32% | 74 |
| gh.mini.Griezel 0.2 | 48 | 27% | 51 |
| spinnercat.micro.Tyger 0.1 | 29 | 16% | 34 |
| d414.nano.Quantum 1.0.0 | 21 | 12% | 22 |
| gh.nano.Grofvuil 0.2 | 10 | 6% | 12 |
| timmit.nano.TimDog 0.33 | 6 | 3% | 8 |
| fm.mammillarias 1.3 | 4 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 2 | 1% | 3 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.3 | 126 / 210 | 1.97 | 19.3% | 32386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.3% | 126 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.4% | 50 |
| apc.botM 3.0 | 3.2 | 11.9% | 23 |
| lxx.ConceptA 0.8 | 3.8 | 10.5% | 3 |
| vjik.UnViolation 1.1 | 5.2 | 9.8% | 4 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 2 |
| panzer.Panzer 0.2 | 7.5 | 6.8% | 0 |
| conscience.Electron 1.3g | 8.0 | 6.5% | 1 |
| yk.JahMicro 1.0 | 8.7 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.8% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.0 | 18 / 35 | 5498 |
| 2 | 1 | 70.3 | 92.7 | 25 / 35 | 5574 |
| 3 | 1 | 68.2 | 87.6 | 20 / 35 | 5128 |
| 4 | 1 | 68.6 | 87.6 | 20 / 35 | 5260 |
| 5 | 1 | 68.3 | 87.6 | 21 / 35 | 5302 |
| 6 | 1 | 70.0 | 93.0 | 22 / 35 | 5624 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 67 | 63% |
| apc.botM 3.0 | 33 | 70% |
| lxx.ConceptA 0.8 | 21 | 95% |
| vjik.UnViolation 1.1 | 16 | 100% |
| donjezza.Jezza 1.0 | 10 | 100% |
| bayen.UbaMicro 1.4 | 8 | 88% |
| panzer.Panzer 0.2 | 3 | 100% |
| yk.JahMicro 1.0 | 3 | 100% |
| conscience.Electron 1.3g | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 39 | 46% | 89 |
| apc.botM 3.0 | 21 | 25% | 47 |
| lxx.ConceptA 0.8 | 11 | 13% | 17 |
| bayen.UbaMicro 1.4 | 7 | 8% | 13 |
| conscience.Electron 1.3g | 3 | 4% | 5 |
| panzer.Panzer 0.2 | 2 | 2% | 4 |
| vjik.UnViolation 1.1 | 1 | 1% | 25 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| donjezza.Jezza 1.0 | 0 | 0% | 5 |

## Melee bench: F33

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.6 | 107 / 210 | 2.48 | 18.5% | 31739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.5% | 107 |
| maribo.Quester 0.3 | 2.0 | 15.9% | 48 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.3% | 21 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 10.6% | 10 |
| labg.Cataclysm 2.05 | 4.5 | 10.5% | 15 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.3 | 8.5% | 8 |
| baal.nano.N 1.42 | 6.7 | 8.2% | 1 |
| zyx.micro.Ant 1.1 | 8.2 | 6.0% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 82.9 | 17 / 35 | 5161 |
| 2 | 1 | 68.9 | 84.4 | 22 / 35 | 5462 |
| 3 | 1 | 67.5 | 81.0 | 14 / 35 | 5381 |
| 4 | 1 | 69.0 | 85.1 | 21 / 35 | 5402 |
| 5 | 1 | 67.7 | 83.5 | 15 / 35 | 5126 |
| 6 | 1 | 68.4 | 84.8 | 18 / 35 | 5207 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 49 | 63% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 33 | 85% |
| gre.svman4.Leonidas 1.3.2 | 20 | 95% |
| labg.Cataclysm 2.05 | 17 | 76% |
| kinsen.melee.Angsaichmophobia 1.8c | 12 | 67% |
| baal.nano.N 1.42 | 5 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 45 | 43% | 79 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 18 | 17% | 56 |
| gre.svman4.Leonidas 1.3.2 | 13 | 13% | 23 |
| kinsen.melee.Angsaichmophobia 1.8c | 10 | 10% | 9 |
| labg.Cataclysm 2.05 | 8 | 8% | 22 |
| baal.nano.N 1.42 | 3 | 3% | 10 |
| zyx.micro.Ant 1.1 | 3 | 3% | 6 |
| sanja.First 0.1 | 3 | 3% | 3 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 1 |

## Melee bench: F34

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 82.4 | 55 / 210 | 2.58 | 17.3% | 32144 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.8 | 17.3% | 55 |
| stelo.Spread 0.9 | 2.0 | 16.9% | 78 |
| kid.Gladiator .7.2 | 2.2 | 16.5% | 58 |
| jcs.Seth 1.8 | 4.0 | 11.4% | 17 |
| tcf.Reach 3 | 5.3 | 10.1% | 4 |
| cli.Dancer 1.1 | 5.7 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 6.8% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.5% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 83.2 | 6 / 35 | 5507 |
| 2 | 2 | 67.3 | 81.9 | 12 / 35 | 4972 |
| 3 | 2 | 67.8 | 84.8 | 10 / 35 | 5261 |
| 4 | 2 | 68.3 | 83.5 | 10 / 35 | 5554 |
| 5 | 2 | 67.5 | 81.6 | 9 / 35 | 5607 |
| 6 | 2 | 66.6 | 79.7 | 8 / 35 | 5243 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 68 | 40% |
| kid.Gladiator .7.2 | 38 | 39% |
| jcs.Seth 1.8 | 14 | 64% |
| cli.Dancer 1.1 | 2 | 50% |
| ratosh.Wesco 1.4 | 1 | 100% |
| tcf.Reach 3 | 1 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 156 of 210 rounds, at a mean tick of 1018. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 76 | 49% | 103 |
| kid.Gladiator .7.2 | 60 | 38% | 71 |
| jcs.Seth 1.8 | 9 | 6% | 16 |
| tcf.Reach 3 | 8 | 5% | 12 |
| cli.Dancer 1.1 | 1 | 1% | 3 |
| sample.VelociRobot 1.0 | 1 | 1% | 3 |
| ratosh.Wesco 1.4 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F35

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.9 | 78.3 | 39 / 210 | 2.96 | 15.3% | 23305 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.8% | 146 |
| hadur117.mini.DeiseH500 0.4 | 2.0 | 15.3% | 39 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.6% | 15 |
| rz.HawkOnFire 0.1 | 4.2 | 11.8% | 2 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.3 | 11.5% | 7 |
| wit.Chuliath 1.0 | 6.5 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.7% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.0 | 5.6% | 1 |
| stelo.MyAgileRobot 0.2 | 9.2 | 5.0% | 0 |
| dans.Cinnamon 1.2 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.6 | 77.8 | 10 / 35 | 3736 |
| 2 | 2 | 63.5 | 78.4 | 6 / 35 | 3622 |
| 3 | 2 | 62.7 | 73.7 | 4 / 35 | 4051 |
| 4 | 2 | 64.5 | 81.9 | 4 / 35 | 3858 |
| 5 | 2 | 63.5 | 77.8 | 5 / 35 | 3879 |
| 6 | 2 | 65.3 | 80.0 | 10 / 35 | 4159 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 71 | 25% |
| gh.mini.Gruwel 0.9 | 13 | 62% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 78% |
| rz.HawkOnFire 0.1 | 7 | 86% |

Hadur died in 172 of 210 rounds, at a mean tick of 793. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 77 | 45% | 90 |
| gh.mini.Gruwel 0.9 | 32 | 19% | 43 |
| rz.HawkOnFire 0.1 | 27 | 16% | 31 |
| dmh.robocode.robot.BlackDeath 9.2 | 24 | 14% | 33 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| wit.Chuliath 1.0 | 3 | 2% | 4 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 2 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F36

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 90.9 | 153 / 210 | 1.82 | 20.9% | 35785 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 20.9% | 153 |
| bzdp.Pansy 2.1 | 3.0 | 11.9% | 13 |
| alpha.RainingFire 1.0 | 3.2 | 11.7% | 13 |
| bvh.micro.Freya 0.3 | 4.3 | 10.4% | 13 |
| m3thos.Eva02 0.7.1 | 5.3 | 9.5% | 10 |
| mz.Cork 0.1 | 5.3 | 10.0% | 3 |
| bvh.mini.Fenrir 0.39 | 5.8 | 9.2% | 3 |
| dl.BetterWalls 1.0 | 8.2 | 6.4% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.7% | 1 |
| sample.MyFirstRobot 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 92.7 | 27 / 35 | 6266 |
| 2 | 1 | 69.7 | 86.7 | 24 / 35 | 5672 |
| 3 | 1 | 70.6 | 89.2 | 25 / 35 | 5860 |
| 4 | 1 | 71.5 | 91.7 | 27 / 35 | 6334 |
| 5 | 1 | 69.9 | 90.2 | 22 / 35 | 5491 |
| 6 | 1 | 72.3 | 94.9 | 28 / 35 | 6162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 91% |
| bvh.micro.Freya 0.3 | 31 | 90% |
| mz.Cork 0.1 | 25 | 100% |
| alpha.RainingFire 1.0 | 22 | 64% |
| bvh.mini.Fenrir 0.39 | 20 | 95% |
| m3thos.Eva02 0.7.1 | 13 | 85% |
| sample.MyFirstRobot 1.0 | 9 | 89% |
| dl.BetterWalls 1.0 | 6 | 100% |

Hadur died in 58 of 210 rounds, at a mean tick of 806. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 16 | 28% | 33 |
| m3thos.Eva02 0.7.1 | 10 | 17% | 22 |
| bzdp.Pansy 2.1 | 9 | 16% | 54 |
| bvh.micro.Freya 0.3 | 8 | 14% | 39 |
| bvh.mini.Fenrir 0.39 | 8 | 14% | 13 |
| mz.Cork 0.1 | 4 | 7% | 25 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 5 |
| squidM.TentalceMeleeNano 1.1 | 1 | 2% | 3 |
| dl.BetterWalls 1.0 | 0 | 0% | 15 |
1 death(s) with no robot to name.

## Melee bench: F37

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 92.2 | 171 / 210 | 1.70 | 20.5% | 36848 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 20.5% | 171 |
| germ.TheMind .2 | 3.2 | 10.4% | 7 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.3 | 10.2% | 4 |
| EBBU.Sim2 1.02 | 4.2 | 9.4% | 2 |
| agrach.Dalek 1.0 | 5.0 | 9.2% | 8 |
| stelo.UntouchableNano 1.3 | 6.0 | 8.9% | 9 |
| lmk.ACPFinal 0.1 | 6.8 | 8.3% | 1 |
| mb.Beast 0.1 | 8.0 | 8.0% | 4 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 93.3 | 29 / 35 | 5225 |
| 2 | 1 | 69.5 | 89.2 | 28 / 35 | 6233 |
| 3 | 1 | 70.8 | 93.0 | 29 / 35 | 6651 |
| 4 | 1 | 69.7 | 91.4 | 28 / 35 | 6113 |
| 5 | 1 | 70.2 | 92.1 | 27 / 35 | 6386 |
| 6 | 1 | 70.6 | 94.0 | 30 / 35 | 6240 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 97% |
| stelo.UntouchableNano 1.3 | 32 | 94% |
| mb.Beast 0.1 | 22 | 100% |
| EBBU.Sim2 1.02 | 21 | 100% |
| agrach.Dalek 1.0 | 20 | 95% |
| skm.Ryubot 1.0 | 19 | 95% |
| com.syncleus.robocode.Dreadnaught 0.1 | 14 | 100% |
| lmk.ACPFinal 0.1 | 10 | 100% |

Hadur died in 40 of 210 rounds, at a mean tick of 410. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 8 | 20% | 29 |
| com.syncleus.robocode.Dreadnaught 0.1 | 7 | 18% | 31 |
| agrach.Dalek 1.0 | 6 | 15% | 30 |
| EBBU.Sim2 1.02 | 5 | 13% | 24 |
| germ.TheMind .2 | 4 | 10% | 32 |
| mb.Beast 0.1 | 3 | 8% | 23 |
| lmk.ACPFinal 0.1 | 3 | 8% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 8% | 8 |
| skm.Ryubot 1.0 | 1 | 3% | 9 |

## Melee bench: F38

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 79.5 | 81 / 210 | 2.84 | 16.7% | 27791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.5 | 16.7% | 81 |
| justin.Mallais 14.0 | 1.5 | 16.4% | 79 |
| bvh.mini.Freya 0.55 | 3.0 | 12.8% | 16 |
| cs.Wren 1.0 | 4.7 | 11.2% | 9 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.7% | 14 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 10.2% | 3 |
| kdf.KoulDestroyer 1.0 | 6.8 | 8.6% | 7 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.5% | 0 |
| matt.UnderDark3 2.4.34 | 8.8 | 4.4% | 1 |
| bzdp.BoxCar 2.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 81.6 | 16 / 35 | 4783 |
| 2 | 1 | 66.5 | 81.6 | 15 / 35 | 4804 |
| 3 | 2 | 65.1 | 77.8 | 14 / 35 | 4180 |
| 4 | 2 | 65.7 | 79.4 | 12 / 35 | 4632 |
| 5 | 2 | 64.1 | 75.9 | 10 / 35 | 4301 |
| 6 | 1 | 67.3 | 81.0 | 14 / 35 | 5091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 50 | 46% |
| bts.mega.Gnarly 1.4 | 17 | 82% |
| cs.Wren 1.0 | 15 | 100% |
| bvh.mini.Freya 0.55 | 13 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 100% |
| kdf.KoulDestroyer 1.0 | 4 | 100% |
| matt.UnderDark3 2.4.34 | 2 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 702. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 52 | 40% | 76 |
| bvh.mini.Freya 0.55 | 25 | 19% | 38 |
| cs.Wren 1.0 | 19 | 15% | 35 |
| bts.mega.Gnarly 1.4 | 13 | 10% | 25 |
| kdf.KoulDestroyer 1.0 | 10 | 8% | 12 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 6% | 17 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 0 | 0% | 2 |

## Melee bench: F39

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 81.0 | 81 / 210 | 2.71 | 17.2% | 30392 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 17.2% | 81 |
| bvh.fry.Freya 0.82 | 2.2 | 14.4% | 34 |
| az.Ololobot 0.2.4 | 3.0 | 13.4% | 61 |
| catcat20.Lambda 0.024 | 3.8 | 11.7% | 24 |
| stelo.SoRobotNanoMelee 1.2 | 5.7 | 9.2% | 5 |
| gimp.GimpBot 0.1 | 6.3 | 8.3% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 8.0% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.0 | 8.2% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.2 | 5.2% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.3 | 14 / 35 | 4876 |
| 2 | 1 | 67.9 | 87.0 | 16 / 35 | 5221 |
| 3 | 1 | 65.3 | 78.4 | 15 / 35 | 4904 |
| 4 | 1 | 65.7 | 79.7 | 10 / 35 | 5064 |
| 5 | 1 | 66.2 | 79.0 | 14 / 35 | 5403 |
| 6 | 1 | 66.1 | 81.3 | 12 / 35 | 4924 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 40 | 28% |
| bvh.fry.Freya 0.82 | 40 | 75% |
| catcat20.Lambda 0.024 | 26 | 73% |
| stelo.SoRobotNanoMelee 1.2 | 12 | 92% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 3 | 100% |
| gimp.GimpBot 0.1 | 3 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 44 | 34% | 61 |
| bvh.fry.Freya 0.82 | 43 | 33% | 69 |
| catcat20.Lambda 0.024 | 21 | 16% | 37 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 11% | 19 |
| apollokidd.ApolloKidd 0.9 | 5 | 4% | 8 |
| gimp.GimpBot 0.1 | 2 | 2% | 5 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 10 |

## Melee bench: F40

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.7 | 106 / 210 | 2.47 | 18.4% | 31315 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.4% | 106 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.9% | 45 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.5% | 27 |
| Polkwane.SmashMelee 1.0 | 4.3 | 10.9% | 9 |
| mz.AntiGrav 1.0 | 4.8 | 10.4% | 9 |
| stelo.Randomness 1.0 | 5.7 | 9.4% | 11 |
| alpha.BlackIce 1.0 | 7.0 | 8.1% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.3% | 1 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 4.9% | 0 |
| sample.Corners 1.0 | 10.0 | 4.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 86.3 | 18 / 35 | 5133 |
| 2 | 1 | 68.6 | 85.1 | 17 / 35 | 5442 |
| 3 | 1 | 68.9 | 85.7 | 19 / 35 | 5251 |
| 4 | 1 | 66.7 | 80.6 | 16 / 35 | 4766 |
| 5 | 1 | 68.0 | 82.2 | 20 / 35 | 5530 |
| 6 | 1 | 67.6 | 82.2 | 16 / 35 | 5193 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 47 | 55% |
| kano.gamma.KanoGamma 1.8 | 35 | 71% |
| Polkwane.SmashMelee 1.0 | 25 | 88% |
| mz.AntiGrav 1.0 | 16 | 100% |
| stelo.Randomness 1.0 | 8 | 88% |
| alpha.BlackIce 1.0 | 7 | 86% |
| amk.superstrike.SuperStrike 0.3 | 3 | 100% |
| sample.Corners 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 38 | 36% | 67 |
| kano.gamma.KanoGamma 1.8 | 24 | 22% | 51 |
| stelo.Randomness 1.0 | 17 | 16% | 26 |
| mz.AntiGrav 1.0 | 10 | 9% | 22 |
| Polkwane.SmashMelee 1.0 | 6 | 6% | 16 |
| amk.superstrike.SuperStrike 0.3 | 5 | 5% | 8 |
| alpha.BlackIce 1.0 | 3 | 3% | 10 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 3 |
| sample.Corners 1.0 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F41

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.4 | 72 / 210 | 2.68 | 16.7% | 26051 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.2 | 16.7% | 72 |
| eem.EvBotNG v12.8 | 1.8 | 15.9% | 80 |
| ary.Swarm 1.1 | 3.3 | 12.9% | 16 |
| lessonz.robocode.Oz 0.5.0 | 4.3 | 12.1% | 19 |
| simonton.nano.MeleeSeed 1.8 | 4.3 | 12.0% | 19 |
| shrub.Silver v048 | 6.0 | 8.6% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.6% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.7% | 2 |
| jsal.Jsalbot 1.0 | 8.7 | 5.9% | 2 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.3 | 87.0 | 13 / 35 | 4350 |
| 2 | 1 | 66.3 | 83.2 | 11 / 35 | 4212 |
| 3 | 2 | 65.2 | 80.3 | 10 / 35 | 4201 |
| 4 | 1 | 67.0 | 83.2 | 14 / 35 | 4443 |
| 5 | 1 | 65.9 | 79.7 | 11 / 35 | 4760 |
| 6 | 1 | 64.3 | 74.9 | 13 / 35 | 4085 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 55 | 33% |
| ary.Swarm 1.1 | 31 | 87% |
| simonton.nano.MeleeSeed 1.8 | 20 | 65% |
| lessonz.robocode.Oz 0.5.0 | 16 | 56% |
| shrub.Silver v048 | 2 | 100% |
| stelo.Mirror 1.1 | 2 | 50% |
| jsal.Jsalbot 1.0 | 1 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 139 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 52 | 37% | 68 |
| ary.Swarm 1.1 | 30 | 22% | 57 |
| simonton.nano.MeleeSeed 1.8 | 21 | 15% | 31 |
| lessonz.robocode.Oz 0.5.0 | 21 | 15% | 29 |
| shrub.Silver v048 | 5 | 4% | 9 |
| zyx.nano.Ant 1.1 | 3 | 2% | 5 |
| stelo.Mirror 1.1 | 3 | 2% | 3 |
| jsal.Jsalbot 1.0 | 2 | 1% | 5 |
| acogdev.alpha 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.7 | 84 / 210 | 2.47 | 17.9% | 32224 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 17.9% | 84 |
| wompi.Wallaby 5.1 | 2.0 | 15.7% | 63 |
| ara.Shera 0.88 | 3.3 | 13.5% | 32 |
| maribo.mini.MiniQuester 0.1 | 3.7 | 13.2% | 24 |
| amz.NanoClone 1.41 | 5.0 | 9.3% | 3 |
| maribo.IotaCT 1.1 | 6.7 | 7.0% | 1 |
| dsw.StaticD 1.0 | 6.8 | 7.0% | 3 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.0% | 1 |
| mme.NikeEnhanced 2.0 | 8.8 | 5.6% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 83.2 | 16 / 35 | 5173 |
| 2 | 1 | 66.9 | 82.2 | 11 / 35 | 5489 |
| 3 | 1 | 66.6 | 80.6 | 11 / 35 | 5304 |
| 4 | 1 | 68.7 | 87.3 | 21 / 35 | 5384 |
| 5 | 1 | 67.8 | 83.8 | 12 / 35 | 5576 |
| 6 | 1 | 67.8 | 85.1 | 13 / 35 | 5298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 47 | 68% |
| wompi.Wallaby 5.1 | 46 | 63% |
| maribo.mini.MiniQuester 0.1 | 28 | 71% |
| stelo.MirrorMicro 1.0 | 2 | 50% |
| amz.NanoClone 1.41 | 1 | 0% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| dsw.StaticD 1.0 | 1 | 0% |

Hadur died in 126 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 49 | 39% | 80 |
| maribo.mini.MiniQuester 0.1 | 32 | 25% | 53 |
| ara.Shera 0.88 | 30 | 24% | 57 |
| amz.NanoClone 1.41 | 5 | 4% | 5 |
| mme.NikeEnhanced 2.0 | 3 | 2% | 3 |
| dsw.StaticD 1.0 | 3 | 2% | 3 |
| stelo.MirrorMicro 1.0 | 2 | 2% | 5 |
| maribo.IotaCT 1.1 | 2 | 2% | 4 |

## Melee bench: F43

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 72.5 | 25 / 210 | 3.47 | 14.6% | 25006 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.8% | 149 |
| hadur117.mini.DeiseH500 0.4 | 2.0 | 14.6% | 25 |
| brainfade.melee.Dusk 0.44 | 3.2 | 13.3% | 25 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.3% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.0 | 10.5% | 1 |
| Krabb.akim2.Akim2 1.1b | 5.5 | 9.8% | 1 |
| mz.NanoGod 2.02 | 7.3 | 7.5% | 2 |
| jab.DiamondStealer 5 | 7.7 | 7.4% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.9 | 73.3 | 4 / 35 | 4072 |
| 2 | 2 | 63.1 | 69.8 | 4 / 35 | 4242 |
| 3 | 2 | 62.9 | 70.2 | 4 / 35 | 4012 |
| 4 | 2 | 64.7 | 75.6 | 4 / 35 | 4162 |
| 5 | 2 | 63.2 | 70.2 | 5 / 35 | 4096 |
| 6 | 2 | 64.7 | 76.2 | 4 / 35 | 4422 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 66 | 17% |
| dummy.micro.Sparrow 2.5 | 9 | 78% |
| brainfade.melee.Dusk 0.44 | 8 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 3 | 100% |
| cvt.Firsty 1.0 | 1 | 0% |

Hadur died in 185 of 210 rounds, at a mean tick of 823. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 97 | 52% | 107 |
| brainfade.melee.Dusk 0.44 | 33 | 18% | 41 |
| wcsv.melee.EngineerMelee 0.1 | 19 | 10% | 19 |
| dummy.micro.Sparrow 2.5 | 11 | 6% | 17 |
| mz.NanoGod 2.02 | 11 | 6% | 11 |
| Krabb.akim2.Akim2 1.1b | 10 | 5% | 11 |
| jab.DiamondStealer 5 | 4 | 2% | 4 |

## Melee bench: F44

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 85.7 | 97 / 210 | 2.29 | 18.8% | 33299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 18.8% | 97 |
| stelo.Liblix 0.3.1 | 2.2 | 16.0% | 71 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.6% | 34 |
| wompi.Quokka 1.6 | 4.5 | 10.0% | 4 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.0 | 9.3% | 2 |
| disan.Chair 2.2.0 | 6.2 | 7.9% | 3 |
| jwirde.Gort 2.0 | 6.5 | 8.1% | 2 |
| stf.PanzerGeneral 0.1 | 7.8 | 6.6% | 1 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 4.4% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 85.4 | 13 / 35 | 5640 |
| 2 | 1 | 68.4 | 85.4 | 14 / 35 | 5346 |
| 3 | 1 | 68.3 | 84.1 | 18 / 35 | 5262 |
| 4 | 1 | 70.7 | 90.2 | 21 / 35 | 5833 |
| 5 | 1 | 68.7 | 86.3 | 13 / 35 | 5571 |
| 6 | 1 | 68.4 | 82.9 | 18 / 35 | 5647 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 72 | 58% |
| tzu.TheArtOfWar 1.2 | 48 | 63% |
| wompi.Quokka 1.6 | 10 | 90% |
| disan.Chair 2.2.0 | 10 | 90% |
| jwirde.Gort 2.0 | 4 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 52 | 45% | 101 |
| tzu.TheArtOfWar 1.2 | 39 | 34% | 71 |
| wompi.Quokka 1.6 | 9 | 8% | 14 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 4% | 8 |
| disan.Chair 2.2.0 | 2 | 2% | 6 |
| jwirde.Gort 2.0 | 2 | 2% | 4 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 2 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 85.6 | 82 / 210 | 2.30 | 19.7% | 38632 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseH500 0.4 | 1.0 | 19.7% | 82 |
| jje.BagPuss 1.2 | 2.7 | 12.1% | 8 |
| eem.IWillFireNoBullet v2.8 | 2.7 | 12.3% | 99 |
| myl.nano.Graviton 1.10 | 4.5 | 10.0% | 6 |
| sul.Lunar 1.1 | 4.5 | 10.1% | 8 |
| pez.mini.ChironexFleckeri 0.5 | 6.5 | 8.7% | 3 |
| hvilela.HVilela 0.9 | 7.0 | 8.2% | 0 |
| fm.claire 1.7 | 7.2 | 8.2% | 1 |
| wit.Deep7 2.0 | 9.0 | 6.2% | 4 |
| abud.ThirdRobo 1.0 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 84.8 | 12 / 35 | 6428 |
| 2 | 1 | 68.6 | 82.2 | 10 / 35 | 6489 |
| 3 | 1 | 70.9 | 91.7 | 17 / 35 | 6477 |
| 4 | 1 | 69.5 | 86.0 | 14 / 35 | 6430 |
| 5 | 1 | 70.3 | 87.6 | 16 / 35 | 6554 |
| 6 | 1 | 68.2 | 81.0 | 13 / 35 | 6254 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 85 | 18% |
| sul.Lunar 1.1 | 20 | 90% |
| jje.BagPuss 1.2 | 17 | 88% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 100% |
| myl.nano.Graviton 1.10 | 10 | 70% |
| wit.Deep7 2.0 | 7 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 130 of 210 rounds, at a mean tick of 1665. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 55% | 0 |
| myl.nano.Graviton 1.10 | 20 | 15% | 34 |
| jje.BagPuss 1.2 | 17 | 13% | 60 |
| sul.Lunar 1.1 | 7 | 5% | 50 |
| fm.claire 1.7 | 5 | 4% | 19 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 2% | 18 |
| hvilela.HVilela 0.9 | 3 | 2% | 13 |
| wit.Deep7 2.0 | 2 | 2% | 14 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F46

hadur117.mini.DeiseH500 0.4 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 79.5 | 40 / 210 | 2.84 | 15.9% | 26677 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.8 | 16.5% | 78 |
| kc.mini.Mirage 0.2 | 2.0 | 16.8% | 73 |
| hadur117.mini.DeiseH500 0.4 | 2.2 | 15.9% | 40 |
| cx.Princess 1.0 | 4.3 | 10.6% | 15 |
| mz.MicroSheep 1.0 | 4.7 | 10.3% | 1 |
| sadoner.killer 0.2 | 6.2 | 9.0% | 3 |
| arthord.NanoSatanMelee Beta | 7.0 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 85.1 | 7 / 35 | 4653 |
| 2 | 2 | 66.6 | 83.8 | 7 / 35 | 4768 |
| 3 | 2 | 64.6 | 77.8 | 7 / 35 | 4432 |
| 4 | 2 | 66.1 | 81.6 | 11 / 35 | 4446 |
| 5 | 3 | 61.4 | 71.4 | 3 / 35 | 3919 |
| 6 | 2 | 64.2 | 77.5 | 5 / 35 | 4459 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 47 | 34% |
| rsalesc.melee.Medina 0.4.5 | 44 | 25% |
| cx.Princess 1.0 | 12 | 58% |
| arthord.NanoSatanMelee Beta | 3 | 100% |
| mz.MicroSheep 1.0 | 2 | 100% |
| sadoner.killer 0.2 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 67 | 39% | 85 |
| rsalesc.melee.Medina 0.4.5 | 63 | 37% | 74 |
| mz.MicroSheep 1.0 | 12 | 7% | 14 |
| cx.Princess 1.0 | 11 | 6% | 13 |
| sadoner.killer 0.2 | 7 | 4% | 8 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 7 |
| jeremyreeder.collective.Prophet 5 | 3 | 2% | 4 |
| kurios.DOSexe .9a | 2 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 3 |

