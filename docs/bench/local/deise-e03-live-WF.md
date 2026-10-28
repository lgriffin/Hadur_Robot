# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.7 | 48 / 210 | 2.38 | 16.8% | 29406 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.7% | 150 |
| hadur117.mini.DeiseWF 0.2 | 2.0 | 16.8% | 48 |
| simonton.nano.WeekendObsession_Melee 1.0 | 3.8 | 11.1% | 3 |
| mz.MicroGodMelee 1 | 4.2 | 10.6% | 4 |
| sgp.JollyNinja 3.53 | 4.2 | 10.8% | 3 |
| lorneswork.Predator 1.0 | 5.8 | 9.2% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.6% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.8% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.6 | 3 / 35 | 4785 |
| 2 | 2 | 66.1 | 83.8 | 7 / 35 | 5176 |
| 3 | 2 | 66.7 | 87.0 | 5 / 35 | 4924 |
| 4 | 2 | 67.7 | 85.1 | 10 / 35 | 5385 |
| 5 | 2 | 67.5 | 87.0 | 13 / 35 | 4725 |
| 6 | 2 | 65.8 | 83.5 | 10 / 35 | 4411 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 132 | 17% |
| sgp.JollyNinja 3.53 | 8 | 100% |
| mz.MicroGodMelee 1 | 8 | 75% |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 88% |
| lorneswork.Predator 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 1036. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 123 | 76% | 146 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 18 |
| lorneswork.Predator 1.0 | 9 | 6% | 14 |
| sgp.JollyNinja 3.53 | 8 | 5% | 12 |
| mz.MicroGodMelee 1 | 6 | 4% | 12 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| skm.butterfly 1.0 | 1 | 1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 1 |
| mym.EdgeStalker 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 82.2 | 103 / 210 | 2.60 | 18.1% | 31786 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.1% | 103 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.2% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 13.0% | 26 |
| lrem.micro.SpikeSoldier 0.4 | 3.8 | 11.7% | 3 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.0 | 9.7% | 13 |
| fnc.bandit.Bandit 5.2.0 | 6.7 | 7.9% | 2 |
| sch.Simone 0.3d | 6.7 | 7.7% | 6 |
| Noran.BitchingElk 0.054 | 7.7 | 7.3% | 6 |
| stelo.PatternRobot 1.0 | 9.0 | 6.0% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.0 | 18 / 35 | 5726 |
| 2 | 1 | 67.4 | 81.3 | 17 / 35 | 5417 |
| 3 | 1 | 64.7 | 75.2 | 12 / 35 | 4767 |
| 4 | 1 | 66.8 | 79.4 | 18 / 35 | 5158 |
| 5 | 1 | 68.1 | 84.8 | 18 / 35 | 5564 |
| 6 | 1 | 68.5 | 86.7 | 20 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 41 | 66% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 41 | 73% |
| lrem.micro.SpikeSoldier 0.4 | 18 | 94% |
| com.cohesiva.robocode.ManOwaR 1.0 | 11 | 82% |
| Noran.BitchingElk 0.054 | 8 | 63% |
| stelo.PatternRobot 1.0 | 5 | 80% |
| fnc.bandit.Bandit 5.2.0 | 5 | 80% |
| sch.Simone 0.3d | 4 | 75% |
| fullsail.SweetTea 1.1 | 4 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 36 | 33% | 66 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 20 | 18% | 54 |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 11% | 24 |
| lrem.micro.SpikeSoldier 0.4 | 11 | 10% | 16 |
| stelo.PatternRobot 1.0 | 8 | 7% | 11 |
| Noran.BitchingElk 0.054 | 7 | 6% | 14 |
| sch.Simone 0.3d | 6 | 6% | 11 |
| fnc.bandit.Bandit 5.2.0 | 6 | 6% | 9 |
| fullsail.SweetTea 1.1 | 1 | 1% | 5 |
2 death(s) with no robot to name.

## Melee bench: F03

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 92.2 | 147 / 210 | 1.70 | 20.5% | 39133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.5% | 147 |
| radnor.DoctorBob 1.42 | 2.3 | 13.9% | 15 |
| kawigi.nano.Lib 1.0 | 3.2 | 12.5% | 16 |
| vuen.Cake 2.51 | 3.5 | 12.3% | 31 |
| urdos.URDOS 1.3 | 5.0 | 9.2% | 0 |
| adt.Ar1 2.1 | 6.8 | 7.2% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.2 | 6.7% | 0 |
| oa.weak.FlyMk1 0.1 | 7.5 | 6.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.5 | 6.2% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 91.4 | 24 / 35 | 5899 |
| 2 | 1 | 69.9 | 89.8 | 22 / 35 | 6283 |
| 3 | 1 | 71.3 | 92.4 | 26 / 35 | 6951 |
| 4 | 1 | 71.5 | 94.6 | 23 / 35 | 6904 |
| 5 | 1 | 71.1 | 94.0 | 26 / 35 | 6512 |
| 6 | 1 | 70.9 | 91.1 | 26 / 35 | 6584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 63% |
| kawigi.nano.Lib 1.0 | 49 | 88% |
| radnor.DoctorBob 1.42 | 47 | 98% |
| oa.weak.FlyMk1 0.1 | 7 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 2 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 856. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 28 | 44% | 68 |
| radnor.DoctorBob 1.42 | 16 | 25% | 54 |
| kawigi.nano.Lib 1.0 | 14 | 22% | 55 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 3% | 7 |
| ghent.ArthurPanzergon 1.0.0 | 2 | 3% | 6 |
| urdos.URDOS 1.3 | 2 | 3% | 5 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 83.0 | 32 / 210 | 2.53 | 17.3% | 34980 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 22.9% | 166 |
| hadur117.mini.DeiseWF 0.2 | 2.0 | 17.3% | 32 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 6 |
| TNT.TNT 0.99.1 | 4.0 | 10.6% | 3 |
| josago.Jorgito 0.16 | 5.0 | 9.4% | 3 |
| css.Delitioner 0.11 | 6.5 | 6.9% | 0 |
| tj.zombie1n 1.0.1 | 6.5 | 7.0% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.3% | 0 |
| spin.Bugstard 0.012b | 9.3 | 3.9% | 0 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 83.5 | 7 / 35 | 5619 |
| 2 | 2 | 68.7 | 85.4 | 5 / 35 | 6003 |
| 3 | 2 | 67.6 | 83.8 | 2 / 35 | 5810 |
| 4 | 2 | 67.3 | 81.3 | 6 / 35 | 5791 |
| 5 | 2 | 66.9 | 81.3 | 5 / 35 | 5595 |
| 6 | 2 | 68.2 | 82.9 | 7 / 35 | 6162 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 135 | 16% |
| apc.LeeroyJenkins2 1.0 | 7 | 71% |
| TNT.TNT 0.99.1 | 3 | 67% |
| josago.Jorgito 0.16 | 2 | 50% |
| spin.Bugstard 0.012b | 1 | 100% |
| tj.zombie1n 1.0.1 | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 1203. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 137 | 77% | 160 |
| apc.LeeroyJenkins2 1.0 | 14 | 8% | 17 |
| josago.Jorgito 0.16 | 12 | 7% | 14 |
| TNT.TNT 0.99.1 | 9 | 5% | 12 |
| css.Delitioner 0.11 | 4 | 2% | 5 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |

## Melee bench: F05

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 59.3 | 66.2 | 13 / 210 | 4.04 | 12.7% | 21386 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 18.9% | 113 |
| justin.DemonicRage 3.4 | 2.0 | 17.1% | 59 |
| hadur117.mini.DeiseWF 0.2 | 3.3 | 12.7% | 13 |
| wompi.Numbat 2.1 | 3.7 | 12.2% | 14 |
| ms.Ares 0.19 | 5.0 | 9.8% | 3 |
| axeBots.HataMoto 3.09 | 6.0 | 8.8% | 8 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.5 | 6.0% | 0 |
| supersample.SuperBoxBot 1.0 | 7.5 | 6.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.3% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 60.6 | 68.6 | 3 / 35 | 3757 |
| 2 | 4 | 56.2 | 61.0 | 0 / 35 | 2974 |
| 3 | 3 | 61.1 | 69.8 | 4 / 35 | 3813 |
| 4 | 3 | 61.5 | 72.7 | 2 / 35 | 3818 |
| 5 | 3 | 59.0 | 63.8 | 3 / 35 | 3563 |
| 6 | 4 | 57.3 | 61.3 | 1 / 35 | 3461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.DemonicRage 3.4 | 26 | 27% |
| cb.fire.Firestarter 2.0f | 21 | 19% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| wompi.Numbat 2.1 | 1 | 0% |
| ms.Ares 0.19 | 1 | 100% |

Hadur died in 197 of 210 rounds, at a mean tick of 714. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.DemonicRage 3.4 | 67 | 34% | 74 |
| cb.fire.Firestarter 2.0f | 56 | 28% | 60 |
| wompi.Numbat 2.1 | 38 | 19% | 38 |
| axeBots.HataMoto 3.09 | 14 | 7% | 15 |
| ms.Ares 0.19 | 11 | 6% | 12 |
| davidalves.net.DuelistMicroMelee 1.4 | 5 | 3% | 5 |
| supersample.SuperBoxBot 1.0 | 4 | 2% | 4 |
| Queens_teamrobot.UltraRazor 1.0 | 2 | 1% | 2 |

## Melee bench: F06

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.3 | 88 / 210 | 2.87 | 16.7% | 27854 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 16.7% | 88 |
| jekl.StoneGhost 0.7 | 1.8 | 15.0% | 40 |
| origin.SleepSiphon 1.7b | 3.2 | 13.3% | 47 |
| mld.Wisdom 1.0 | 4.3 | 11.6% | 9 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.5 | 11.5% | 14 |
| gg.Wolverine 2.0 | 6.0 | 9.1% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 7.8 | 6.6% | 0 |
| DBall.NUKE 0.1 | 8.0 | 6.5% | 3 |
| spinnercat.Omen 1.0 | 8.2 | 6.3% | 1 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 82.9 | 17 / 35 | 4913 |
| 2 | 1 | 65.8 | 82.2 | 16 / 35 | 4417 |
| 3 | 2 | 63.2 | 71.1 | 12 / 35 | 4482 |
| 4 | 1 | 67.2 | 84.4 | 15 / 35 | 4824 |
| 5 | 1 | 64.8 | 77.1 | 12 / 35 | 4701 |
| 6 | 1 | 66.0 | 77.8 | 16 / 35 | 4517 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 40 | 85% |
| origin.SleepSiphon 1.7b | 36 | 67% |
| pe.minimelee.SandboxMiniMelee 1.1 | 24 | 75% |
| gg.Wolverine 2.0 | 8 | 63% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 100% |
| DBall.NUKE 0.1 | 1 | 0% |

Hadur died in 123 of 210 rounds, at a mean tick of 705. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jekl.StoneGhost 0.7 | 36 | 29% | 59 |
| origin.SleepSiphon 1.7b | 25 | 20% | 55 |
| mld.Wisdom 1.0 | 24 | 20% | 32 |
| pe.minimelee.SandboxMiniMelee 1.1 | 21 | 17% | 37 |
| gg.Wolverine 2.0 | 9 | 7% | 14 |
| DBall.NUKE 0.1 | 4 | 3% | 6 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 4 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 91.2 | 100 / 210 | 1.79 | 20.0% | 37861 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 20.0% | 100 |
| rsalesc.melee.Monk 0.3.6c | 1.8 | 17.3% | 55 |
| rtk.Tachikoma 1.0 | 3.0 | 15.9% | 38 |
| franzor.Lizt 1.3.1 | 4.3 | 10.9% | 14 |
| oog.melee.CapuletDroid 1.1 | 4.7 | 10.6% | 3 |
| lrem.micro.MoggFanatic 0.2 | 6.3 | 7.9% | 0 |
| exauge.GateKeeper 1.1.121g | 6.7 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| sample.Target 1.0 | 9.2 | 2.6% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 93.7 | 20 / 35 | 6897 |
| 2 | 2 | 68.7 | 86.3 | 13 / 35 | 4990 |
| 3 | 1 | 72.2 | 92.1 | 17 / 35 | 6957 |
| 4 | 1 | 71.0 | 89.5 | 13 / 35 | 6567 |
| 5 | 1 | 70.7 | 91.4 | 15 / 35 | 5820 |
| 6 | 1 | 72.4 | 94.3 | 22 / 35 | 6630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 83 | 65% |
| rsalesc.melee.Monk 0.3.6c | 54 | 24% |
| franzor.Lizt 1.3.1 | 19 | 63% |
| oog.melee.CapuletDroid 1.1 | 17 | 94% |
| exauge.GateKeeper 1.1.121g | 4 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 1304. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 56 | 51% | 76 |
| rtk.Tachikoma 1.0 | 41 | 37% | 100 |
| franzor.Lizt 1.3.1 | 9 | 8% | 2 |
| oog.melee.CapuletDroid 1.1 | 3 | 3% | 25 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 3 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 85.9 | 114 / 210 | 2.27 | 18.6% | 30493 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.6% | 114 |
| tm.Yuugao 1.0 | 2.8 | 12.9% | 38 |
| shrub.Vapour v159 | 2.8 | 12.8% | 34 |
| Krabb.sliNk.Garm 0.9u | 3.7 | 10.9% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.0 | 9.7% | 6 |
| m3thos.Eva00 1.1 | 6.2 | 8.4% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 7.0 | 8.1% | 6 |
| SHAM.WOW 1.4 | 8.7 | 6.4% | 1 |
| qualidafial.MajorDick 1.0.1 | 8.8 | 6.4% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 81.9 | 22 / 35 | 5097 |
| 2 | 1 | 65.9 | 81.3 | 15 / 35 | 4796 |
| 3 | 1 | 67.7 | 85.4 | 20 / 35 | 4871 |
| 4 | 1 | 68.1 | 87.6 | 18 / 35 | 5137 |
| 5 | 1 | 68.2 | 87.6 | 18 / 35 | 5131 |
| 6 | 1 | 69.8 | 91.7 | 21 / 35 | 5461 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 44 | 59% |
| shrub.Vapour v159 | 39 | 69% |
| Krabb.sliNk.Garm 0.9u | 32 | 84% |
| jwst.DAD.DarkAndDarker 1.1 | 13 | 85% |
| com.spp.robocode.MostlyHarmless 010 | 11 | 100% |
| m3thos.Eva00 1.1 | 5 | 100% |
| SHAM.WOW 1.4 | 3 | 100% |
| zyx.nano.BacillusComma 1.0 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 792. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 31 | 32% | 61 |
| shrub.Vapour v159 | 29 | 30% | 60 |
| Krabb.sliNk.Garm 0.9u | 14 | 14% | 29 |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 9% | 18 |
| com.spp.robocode.MostlyHarmless 010 | 4 | 4% | 17 |
| m3thos.Eva00 1.1 | 3 | 3% | 10 |
| zyx.nano.BacillusComma 1.0 | 3 | 3% | 7 |
| SHAM.WOW 1.4 | 2 | 2% | 6 |
| qualidafial.MajorDick 1.0.1 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F09

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 73.2 | 57 / 210 | 3.41 | 15.3% | 25522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.7% | 106 |
| hadur117.mini.DeiseWF 0.2 | 2.0 | 15.3% | 57 |
| kc.micro.Figment 1.0 | 3.2 | 13.4% | 19 |
| yagami.Tidus 0.11 | 4.7 | 10.2% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.1% | 12 |
| mc2.enemy.Original 0.9 | 5.3 | 9.6% | 11 |
| dft.Calliope 5.6 | 7.0 | 7.9% | 4 |
| step.nanoPri 1.0 | 8.0 | 6.2% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.1% | 0 |
| rdm.Dueler 0.4x | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.1 | 73.3 | 11 / 35 | 4201 |
| 2 | 2 | 62.5 | 71.1 | 10 / 35 | 4160 |
| 3 | 2 | 62.5 | 68.9 | 11 / 35 | 4240 |
| 4 | 2 | 61.5 | 72.1 | 4 / 35 | 3815 |
| 5 | 2 | 65.1 | 76.5 | 10 / 35 | 4690 |
| 6 | 2 | 64.9 | 77.1 | 11 / 35 | 4416 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 42 | 29% |
| kc.micro.Figment 1.0 | 24 | 88% |
| yagami.Tidus 0.11 | 10 | 100% |
| mc2.enemy.Original 0.9 | 9 | 78% |
| pedersen.Grishnakh 1.0 | 7 | 43% |
| step.nanoPri 1.0 | 2 | 100% |
| dft.Calliope 5.6 | 2 | 100% |

Hadur died in 153 of 210 rounds, at a mean tick of 722. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 70 | 46% | 83 |
| kc.micro.Figment 1.0 | 28 | 18% | 50 |
| yagami.Tidus 0.11 | 24 | 16% | 34 |
| mc2.enemy.Original 0.9 | 11 | 7% | 20 |
| pedersen.Grishnakh 1.0 | 9 | 6% | 11 |
| robar.nano.Assertive_Melee 0.2 | 6 | 4% | 6 |
| step.nanoPri 1.0 | 3 | 2% | 3 |
| dft.Calliope 5.6 | 1 | 1% | 2 |
| rdm.Dueler 0.4x | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 94.4 | 161 / 210 | 1.50 | 20.8% | 35944 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.8% | 161 |
| DTF.Kludgy 1.2b | 2.3 | 13.3% | 23 |
| ne.Chimera 1.2 | 2.7 | 13.1% | 9 |
| ejb.Polaris 1.0.1 | 4.0 | 11.3% | 8 |
| vStar.RAFzilla 2.15 | 5.2 | 10.6% | 5 |
| tvv.micro.Antares 1.1.1 | 5.8 | 9.9% | 2 |
| sam.Samspin 1.0 | 7.5 | 5.7% | 0 |
| kurios.DOSexe .9b | 8.2 | 5.5% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.7 | 5.3% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.7 | 96.2 | 27 / 35 | 6099 |
| 2 | 1 | 71.5 | 96.5 | 27 / 35 | 5998 |
| 3 | 1 | 72.1 | 97.1 | 28 / 35 | 6322 |
| 4 | 1 | 71.3 | 94.3 | 27 / 35 | 6257 |
| 5 | 1 | 70.4 | 92.4 | 26 / 35 | 5728 |
| 6 | 1 | 69.6 | 89.8 | 26 / 35 | 5540 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 56 | 70% |
| ejb.Polaris 1.0.1 | 43 | 95% |
| ne.Chimera 1.2 | 35 | 86% |
| vStar.RAFzilla 2.15 | 22 | 95% |
| tvv.micro.Antares 1.1.1 | 16 | 100% |
| kurios.DOSexe .9b | 8 | 100% |
| donjezza.Muncho 1.0 | 6 | 100% |

Hadur died in 49 of 210 rounds, at a mean tick of 803. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 47% | 62 |
| ne.Chimera 1.2 | 11 | 22% | 40 |
| ejb.Polaris 1.0.1 | 5 | 10% | 49 |
| vStar.RAFzilla 2.15 | 5 | 10% | 20 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 4% | 3 |
| tvv.micro.Antares 1.1.1 | 1 | 2% | 15 |
| kurios.DOSexe .9b | 1 | 2% | 13 |
| sam.Samspin 1.0 | 1 | 2% | 3 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |

## Melee bench: F11

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 80.0 | 86 / 210 | 2.80 | 17.0% | 28467 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.3 | 17.0% | 86 |
| rz.Aleph 0.34 | 1.7 | 16.9% | 79 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.2% | 14 |
| djc.DynaBot 0.1.1 | 4.3 | 10.5% | 12 |
| rdt199.Warlord 0.73 | 5.5 | 8.8% | 10 |
| br2.MobyDickBot 1.6 | 6.3 | 8.3% | 4 |
| uji.YellohFellah 1.0 | 6.5 | 8.3% | 6 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.4% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.3% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 84.8 | 15 / 35 | 4663 |
| 2 | 1 | 65.8 | 78.1 | 12 / 35 | 5128 |
| 3 | 1 | 67.3 | 85.1 | 17 / 35 | 4745 |
| 4 | 1 | 65.9 | 80.3 | 14 / 35 | 4659 |
| 5 | 2 | 64.9 | 75.9 | 14 / 35 | 4656 |
| 6 | 2 | 64.8 | 75.9 | 14 / 35 | 4616 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 65 | 49% |
| djc.DynaBot 0.1.1 | 18 | 78% |
| cx.mini.Nimrod 0.55 | 18 | 100% |
| rdt199.Warlord 0.73 | 11 | 82% |
| uji.YellohFellah 1.0 | 9 | 78% |
| br2.MobyDickBot 1.6 | 4 | 75% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |
| stelo.MirrorNano 1.3 | 1 | 100% |

Hadur died in 125 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 61 | 49% | 96 |
| cx.mini.Nimrod 0.55 | 21 | 17% | 33 |
| rdt199.Warlord 0.73 | 14 | 11% | 23 |
| djc.DynaBot 0.1.1 | 11 | 9% | 22 |
| uji.YellohFellah 1.0 | 8 | 6% | 14 |
| br2.MobyDickBot 1.6 | 3 | 2% | 12 |
| stelo.MirrorNano 1.3 | 3 | 2% | 4 |
| KiraNL.Chupacabra 0.4 | 3 | 2% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F12

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.9 | 80.5 | 97 / 210 | 2.75 | 17.1% | 25496 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 17.1% | 97 |
| bts.wiki.RipCurl 0.9b | 2.7 | 13.6% | 34 |
| nat.PallasHawk 1.0 | 3.2 | 12.9% | 34 |
| darkcanuck.Leon 1.01 | 3.2 | 13.0% | 31 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 8 |
| jrm.Test0 1.0 | 6.7 | 7.8% | 1 |
| jp.Perpy 16.0 | 7.0 | 7.2% | 1 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.7% | 1 |
| jaybot.bots.Oddball 4.0 | 9.2 | 5.6% | 4 |
| stuff.Vlad 0.1 | 9.7 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.4 | 86.7 | 17 / 35 | 4317 |
| 2 | 1 | 64.4 | 76.8 | 15 / 35 | 4105 |
| 3 | 1 | 67.7 | 87.3 | 20 / 35 | 4479 |
| 4 | 1 | 65.7 | 79.7 | 15 / 35 | 4208 |
| 5 | 1 | 64.3 | 72.1 | 16 / 35 | 4237 |
| 6 | 1 | 65.8 | 80.6 | 14 / 35 | 4150 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 42 | 64% |
| nat.PallasHawk 1.0 | 41 | 78% |
| darkcanuck.Leon 1.01 | 35 | 57% |
| brainfade.melee.Genghis 0.36 | 13 | 85% |
| jp.Perpy 16.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 50% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.Leon 1.01 | 30 | 27% | 61 |
| bts.wiki.RipCurl 0.9b | 26 | 23% | 46 |
| nat.PallasHawk 1.0 | 25 | 22% | 52 |
| brainfade.melee.Genghis 0.36 | 13 | 12% | 21 |
| jrm.Test0 1.0 | 7 | 6% | 11 |
| jp.Perpy 16.0 | 4 | 4% | 5 |
| jaybot.bots.Oddball 4.0 | 3 | 3% | 6 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |
| stuff.Vlad 0.1 | 2 | 2% | 2 |

## Melee bench: F13

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 77.8 | 51 / 210 | 3.00 | 15.6% | 27950 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| mn.Combat 3.25.0 | 1.2 | 17.6% | 102 |
| ags.Glacier 0.2.11 | 2.2 | 16.4% | 36 |
| hadur117.mini.DeiseWF 0.2 | 2.7 | 15.6% | 51 |
| shinh.Entangled 0.3 | 4.0 | 12.1% | 17 |
| gh.micro.Gruweltje 0.7 | 5.0 | 11.3% | 5 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 7.3 | 6.4% | 0 |
| ayk.WallHugger 1.0 | 7.8 | 5.1% | 0 |
| maribo.FollowFire 1 | 8.7 | 4.4% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 64.2 | 78.4 | 9 / 35 | 4175 |
| 2 | 2 | 65.6 | 78.1 | 8 / 35 | 5177 |
| 3 | 3 | 65.0 | 76.8 | 11 / 35 | 4701 |
| 4 | 2 | 66.1 | 81.3 | 10 / 35 | 4788 |
| 5 | 3 | 64.4 | 76.5 | 6 / 35 | 4725 |
| 6 | 3 | 63.7 | 75.6 | 7 / 35 | 4384 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 59 | 39% |
| ags.Glacier 0.2.11 | 34 | 65% |
| shinh.Entangled 0.3 | 7 | 57% |
| gh.micro.Gruweltje 0.7 | 2 | 100% |

Hadur died in 160 of 210 rounds, at a mean tick of 787. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 68 | 43% | 88 |
| ags.Glacier 0.2.11 | 46 | 29% | 68 |
| shinh.Entangled 0.3 | 22 | 14% | 26 |
| gh.micro.Gruweltje 0.7 | 9 | 6% | 11 |
| apc.Colossus2 0.17 | 5 | 3% | 6 |
| stelo.Wang 1.0 | 4 | 3% | 6 |
| ayk.WallHugger 1.0 | 3 | 2% | 3 |
| maribo.FollowFire 1 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F14

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 87.7 | 131 / 210 | 2.10 | 19.2% | 33807 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 19.2% | 131 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 33 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.2% | 30 |
| sanyi.mikrobi.Roberto 1.0 | 4.8 | 9.8% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.3 | 9.7% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.5 | 9.5% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 6.7 | 9.0% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.7 | 7.9% | 11 |
| pa.Improved 1.0 | 9.0 | 6.0% | 1 |
| sample.TrackFire 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.0 | 19 / 35 | 5080 |
| 2 | 1 | 68.6 | 85.7 | 21 / 35 | 5639 |
| 3 | 1 | 70.3 | 89.2 | 25 / 35 | 5957 |
| 4 | 1 | 70.6 | 90.8 | 25 / 35 | 5905 |
| 5 | 1 | 68.8 | 84.8 | 18 / 35 | 5752 |
| 6 | 1 | 69.3 | 88.9 | 23 / 35 | 5474 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 60 | 90% |
| catcat20.shape.Theta 0.018 | 53 | 72% |
| sanyi.mikrobi.Roberto 1.0 | 14 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 11 | 82% |
| co.edu.usb.rc.LidisTron 1.0 | 9 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 2 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 734. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 34 | 43% | 82 |
| catcat20.shape.Theta 0.018 | 20 | 25% | 53 |
| sheldor.micro.PointInLineRRAL 1.0 | 9 | 11% | 18 |
| sanyi.mikrobi.Roberto 1.0 | 6 | 8% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 5 | 6% | 11 |
| co.edu.usb.rc.LidisTron 1.0 | 3 | 4% | 10 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 3% | 6 |
| pa.Improved 1.0 | 0 | 0% | 3 |
1 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 83.7 | 103 / 210 | 2.47 | 18.5% | 33288 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.5% | 103 |
| kawigi.micro.Shiz 1.1 | 2.5 | 13.4% | 22 |
| mld.DustBunny 3.8 | 3.2 | 13.1% | 12 |
| emp.Yngwie 1.11 | 3.7 | 12.5% | 40 |
| cb.nano.Insomnia 1.0 | 4.8 | 10.7% | 7 |
| kawigi.robot.Girl 1.2 | 5.8 | 9.5% | 20 |
| Grystrion.TrackerWO 1.0 | 7.5 | 6.5% | 1 |
| lambdaxy.TBot 0.1 | 7.5 | 6.7% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.5 | 4.4% | 0 |
| divineomega.TrialBot 0.003 | 9.5 | 4.8% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 86.0 | 21 / 35 | 5602 |
| 2 | 1 | 67.2 | 78.4 | 15 / 35 | 5600 |
| 3 | 1 | 68.1 | 84.8 | 14 / 35 | 5546 |
| 4 | 1 | 67.8 | 84.1 | 16 / 35 | 5431 |
| 5 | 1 | 67.5 | 83.2 | 16 / 35 | 5518 |
| 6 | 1 | 69.3 | 85.7 | 21 / 35 | 5591 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 39 | 51% |
| kawigi.micro.Shiz 1.1 | 27 | 93% |
| cb.nano.Insomnia 1.0 | 23 | 96% |
| mld.DustBunny 3.8 | 22 | 82% |
| kawigi.robot.Girl 1.2 | 19 | 68% |
| divineomega.TrialBot 0.003 | 4 | 75% |
| lambdaxy.TBot 0.1 | 1 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 36 | 34% | 68 |
| mld.DustBunny 3.8 | 18 | 17% | 45 |
| kawigi.robot.Girl 1.2 | 16 | 15% | 23 |
| kawigi.micro.Shiz 1.1 | 14 | 13% | 39 |
| cb.nano.Insomnia 1.0 | 9 | 8% | 15 |
| divineomega.TrialBot 0.003 | 6 | 6% | 10 |
| lambdaxy.TBot 0.1 | 4 | 4% | 5 |
| Grystrion.TrackerWO 1.0 | 3 | 3% | 3 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 1% | 1 |

## Melee bench: F16

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 81.7 | 93 / 210 | 2.64 | 18.2% | 33731 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.2% | 93 |
| gh.Griezel 0.5.2 | 2.0 | 16.2% | 61 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.7% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.9% | 31 |
| tvv.nano.Polaris 1.2 | 5.3 | 9.2% | 11 |
| bvh.fnr.Fenrir 0.36l | 5.5 | 9.0% | 2 |
| stelo.IntrinsicVolatility 1.4 | 7.2 | 7.8% | 1 |
| repositorio.NanoStep 1.0 | 8.8 | 4.8% | 0 |
| asd.Cthulhu 1.3 | 8.8 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 76.5 | 14 / 35 | 5100 |
| 2 | 1 | 67.2 | 77.8 | 14 / 35 | 5750 |
| 3 | 1 | 67.7 | 81.0 | 15 / 35 | 5471 |
| 4 | 1 | 69.3 | 85.1 | 17 / 35 | 6014 |
| 5 | 1 | 68.5 | 84.1 | 15 / 35 | 5594 |
| 6 | 1 | 69.4 | 86.0 | 18 / 35 | 5802 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 60 | 55% |
| techdude.forest.FlamingForest 1.1 | 26 | 73% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 14 | 93% |
| divineomega.DivineBot 1.9.4.5 | 9 | 89% |
| tvv.nano.Polaris 1.2 | 8 | 88% |
| bvh.fnr.Fenrir 0.36l | 8 | 100% |
| stelo.IntrinsicVolatility 1.4 | 4 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 117 of 210 rounds, at a mean tick of 1016. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 58 | 50% | 93 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 17 | 15% | 37 |
| bvh.fnr.Fenrir 0.36l | 14 | 12% | 19 |
| techdude.forest.FlamingForest 1.1 | 11 | 9% | 26 |
| tvv.nano.Polaris 1.2 | 6 | 5% | 12 |
| divineomega.DivineBot 1.9.4.5 | 5 | 4% | 12 |
| stelo.IntrinsicVolatility 1.4 | 3 | 3% | 7 |
| asd.Cthulhu 1.3 | 3 | 3% | 3 |
| repositorio.NanoStep 1.0 | 0 | 0% | 1 |

## Melee bench: F17

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.6 | 89 / 210 | 2.66 | 17.8% | 32911 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 17.8% | 89 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.7% | 29 |
| et.Predator 1.8 | 3.2 | 12.7% | 19 |
| cx.BlestPain 1.41 | 3.7 | 12.0% | 42 |
| nic.Nicator 2.4 | 4.8 | 10.7% | 18 |
| ahf.NanoAndrew .4 | 5.5 | 10.8% | 10 |
| maribo.melee.BMV 0.1 | 6.7 | 9.2% | 3 |
| tex.Longbot 0.4 | 8.5 | 5.5% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 83.8 | 18 / 35 | 5911 |
| 2 | 1 | 67.0 | 81.6 | 16 / 35 | 5255 |
| 3 | 1 | 66.6 | 77.1 | 14 / 35 | 5554 |
| 4 | 1 | 65.9 | 79.0 | 8 / 35 | 5233 |
| 5 | 1 | 67.6 | 82.9 | 16 / 35 | 5537 |
| 6 | 1 | 68.1 | 85.1 | 17 / 35 | 5421 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 36 | 75% |
| oog.melee.Mercutio 1.0 | 33 | 73% |
| cx.BlestPain 1.41 | 29 | 38% |
| ahf.NanoAndrew .4 | 16 | 81% |
| nic.Nicator 2.4 | 15 | 67% |
| maribo.melee.BMV 0.1 | 5 | 80% |

Hadur died in 121 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 36 | 30% | 48 |
| et.Predator 1.8 | 30 | 25% | 56 |
| nic.Nicator 2.4 | 15 | 12% | 26 |
| oog.melee.Mercutio 1.0 | 13 | 11% | 37 |
| ahf.NanoAndrew .4 | 12 | 10% | 24 |
| maribo.melee.BMV 0.1 | 9 | 7% | 11 |
| tex.Longbot 0.4 | 4 | 3% | 4 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 4 |

## Melee bench: F18

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.4 | 121 / 210 | 2.13 | 19.0% | 30231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 19.0% | 121 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.2% | 33 |
| agd.Mooserwirt2 2.7 | 3.2 | 11.0% | 15 |
| uji.DBH 1.1 | 4.7 | 10.7% | 12 |
| spinnercat.Robovirus 2.718 | 5.0 | 9.9% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 9.8% | 3 |
| sigterm.Sigterm 1.0 | 7.3 | 7.9% | 7 |
| kawigi.mini.Fhqwhgads 1.1 | 8.3 | 6.8% | 4 |
| stelo.WangRobot 1.0 | 8.8 | 6.3% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.5 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 89.5 | 21 / 35 | 5468 |
| 2 | 1 | 68.4 | 89.2 | 18 / 35 | 5202 |
| 3 | 1 | 67.9 | 87.0 | 20 / 35 | 4750 |
| 4 | 1 | 68.1 | 84.8 | 20 / 35 | 5259 |
| 5 | 1 | 68.7 | 88.6 | 22 / 35 | 4879 |
| 6 | 1 | 67.6 | 85.4 | 20 / 35 | 4673 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 60 | 73% |
| agd.Mooserwirt2 2.7 | 31 | 77% |
| uji.DBH 1.1 | 20 | 70% |
| spinnercat.Robovirus 2.718 | 15 | 60% |
| stelo.WangRobot 1.0 | 13 | 92% |
| ratosh.Nobo 0.21 | 9 | 89% |
| sigterm.Sigterm 1.0 | 9 | 89% |
| kawigi.mini.Fhqwhgads 1.1 | 6 | 33% |

Hadur died in 90 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 29 | 32% | 69 |
| agd.Mooserwirt2 2.7 | 17 | 19% | 45 |
| uji.DBH 1.1 | 11 | 12% | 25 |
| spinnercat.Robovirus 2.718 | 11 | 12% | 23 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 8% | 11 |
| ratosh.Nobo 0.21 | 6 | 7% | 14 |
| stelo.WangRobot 1.0 | 4 | 4% | 11 |
| sigterm.Sigterm 1.0 | 4 | 4% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 1 |

## Melee bench: F19

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 93.8 | 160 / 210 | 1.56 | 20.8% | 34715 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.8% | 160 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.0% | 18 |
| mld.Infinity 2.2 | 3.0 | 13.4% | 24 |
| krillr.mini.JointStrike 2.0.0 | 4.3 | 11.0% | 3 |
| erdnis.Rover 0.3 | 4.7 | 10.7% | 4 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 1 |
| pac.ABC 2.1 | 7.3 | 7.0% | 0 |
| mbh.Mbh 0.1 | 8.0 | 6.7% | 0 |
| pbg.R2D2 1.0 | 8.7 | 6.0% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.7 | 23 / 35 | 6234 |
| 2 | 1 | 72.3 | 97.1 | 28 / 35 | 5714 |
| 3 | 1 | 72.1 | 94.3 | 29 / 35 | 5850 |
| 4 | 1 | 71.3 | 93.0 | 27 / 35 | 5484 |
| 5 | 1 | 71.8 | 94.0 | 27 / 35 | 5712 |
| 6 | 1 | 71.3 | 91.4 | 26 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 98 | 88% |
| mld.Infinity 2.2 | 48 | 81% |
| patson.PatsonTestBot 1.0 | 12 | 92% |
| erdnis.Rover 0.3 | 11 | 82% |
| krillr.mini.JointStrike 2.0.0 | 9 | 78% |
| pac.ABC 2.1 | 7 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 50 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 23 | 46% | 88 |
| mld.Infinity 2.2 | 16 | 32% | 63 |
| krillr.mini.JointStrike 2.0.0 | 5 | 10% | 15 |
| erdnis.Rover 0.3 | 3 | 6% | 10 |
| patson.PatsonTestBot 1.0 | 2 | 4% | 14 |
| pac.ABC 2.1 | 1 | 2% | 7 |
| mbh.Mbh 0.1 | 0 | 0% | 5 |
| pbg.R2D2 1.0 | 0 | 0% | 5 |

## Melee bench: F20

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 89.0 | 122 / 210 | 1.99 | 20.0% | 36287 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.0% | 122 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 56 |
| fwb.Nine 1.0.1 | 3.7 | 10.4% | 11 |
| catcat20.Rabbit 0.001 | 3.8 | 10.6% | 15 |
| nz.jdc.nano.GridFu 1.0 | 4.5 | 10.1% | 2 |
| m3thos.mini.Eva01 0.5.5 | 6.3 | 8.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.8% | 1 |
| djdjdj.NanoSkunk10 1.0 | 7.7 | 7.2% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 88.3 | 15 / 35 | 5730 |
| 2 | 1 | 68.3 | 84.1 | 14 / 35 | 5684 |
| 3 | 1 | 70.4 | 89.2 | 21 / 35 | 6151 |
| 4 | 1 | 72.7 | 97.1 | 30 / 35 | 6599 |
| 5 | 1 | 68.6 | 85.1 | 19 / 35 | 5730 |
| 6 | 1 | 71.0 | 90.5 | 23 / 35 | 6393 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 76 | 51% |
| fwb.Nine 1.0.1 | 27 | 96% |
| catcat20.Rabbit 0.001 | 25 | 84% |
| nz.jdc.nano.GridFu 1.0 | 14 | 93% |
| bayen.nut.Squirrel 1.615 | 8 | 100% |
| djdjdj.NanoSkunk10 1.0 | 7 | 100% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 2 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 58 | 66% | 92 |
| catcat20.Rabbit 0.001 | 11 | 13% | 33 |
| nz.jdc.nano.GridFu 1.0 | 6 | 7% | 29 |
| fwb.Nine 1.0.1 | 6 | 7% | 19 |
| bayen.nut.Squirrel 1.615 | 2 | 2% | 14 |
| m3thos.mini.Eva01 0.5.5 | 2 | 2% | 12 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 4 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 3 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 3 |

## Melee bench: F21

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 89.7 | 125 / 210 | 1.93 | 20.0% | 36124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.0% | 125 |
| eem.EvBot v4.6.16 | 2.0 | 16.2% | 67 |
| dummy.mini.Scimitar 1.01 | 3.0 | 13.3% | 8 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.4% | 5 |
| eld.Hmm 1.0 | 5.3 | 8.3% | 3 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.0% | 1 |
| el.JumpShoot 0.2 | 7.5 | 6.5% | 2 |
| fire219.CatBot 1.0 | 7.7 | 6.4% | 0 |
| PSW.Relentless 0.1 | 9.0 | 5.4% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.7 | 22 / 35 | 6051 |
| 2 | 1 | 68.5 | 84.4 | 17 / 35 | 5786 |
| 3 | 1 | 71.5 | 92.4 | 25 / 35 | 6100 |
| 4 | 1 | 71.8 | 93.7 | 25 / 35 | 6227 |
| 5 | 1 | 69.8 | 86.7 | 19 / 35 | 6110 |
| 6 | 1 | 69.4 | 88.3 | 17 / 35 | 5850 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 96 | 64% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 25 | 92% |
| eld.Hmm 1.0 | 9 | 78% |
| oa.weak.BotherBot 0.1 | 3 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 1139. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 46 | 53% | 90 |
| dummy.mini.Scimitar 1.01 | 14 | 16% | 56 |
| cf.RiO.RiOx 4.2.1 | 10 | 12% | 28 |
| eld.Hmm 1.0 | 5 | 6% | 20 |
| oa.weak.BotherBot 0.1 | 3 | 3% | 6 |
| arthord.MannyPacquiao Beta | 2 | 2% | 3 |
| PSW.Relentless 0.1 | 2 | 2% | 2 |
| fire219.CatBot 1.0 | 2 | 2% | 2 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F22

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.8 | 93 / 210 | 2.46 | 18.2% | 32886 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.2% | 93 |
| pe.SandboxDT 2.71m | 2.3 | 15.7% | 48 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.0% | 43 |
| jlm.javaDisturbance 0.59 | 3.8 | 12.6% | 15 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 10 |
| yk.JahRoslav 1.1 | 6.5 | 6.9% | 1 |
| tad.Dalek98 0.98 | 6.8 | 6.6% | 0 |
| pbg.NinjaX 1.2 | 8.3 | 5.4% | 0 |
| gg.Squaraus 0.6 | 8.3 | 5.9% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 82.9 | 16 / 35 | 5255 |
| 2 | 1 | 68.6 | 83.8 | 16 / 35 | 5485 |
| 3 | 1 | 69.3 | 86.3 | 18 / 35 | 5981 |
| 4 | 1 | 68.5 | 86.0 | 15 / 35 | 5441 |
| 5 | 1 | 66.3 | 79.0 | 12 / 35 | 4945 |
| 6 | 1 | 69.0 | 84.8 | 16 / 35 | 5779 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 54 | 67% |
| pe.SandboxDT 2.71m | 37 | 57% |
| jlm.javaDisturbance 0.59 | 26 | 85% |
| bigpete.Stewie 1.0 | 10 | 70% |
| tad.Dalek98 0.98 | 3 | 100% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |
| yk.JahRoslav 1.1 | 1 | 0% |

Hadur died in 117 of 210 rounds, at a mean tick of 818. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kvk.HebusLeTroll 0.35 | 41 | 35% | 72 |
| pe.SandboxDT 2.71m | 40 | 34% | 70 |
| jlm.javaDisturbance 0.59 | 20 | 17% | 40 |
| bigpete.Stewie 1.0 | 8 | 7% | 15 |
| tad.Dalek98 0.98 | 4 | 3% | 5 |
| yk.JahRoslav 1.1 | 2 | 2% | 4 |
| gg.Squaraus 0.6 | 2 | 2% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 2 |

## Melee bench: F23

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 88.1 | 117 / 210 | 2.07 | 19.1% | 32262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 19.1% | 117 |
| pe.SandboxLump 1.52 | 1.8 | 17.4% | 56 |
| cre.Karolos 0.32 | 3.0 | 13.9% | 20 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.4% | 6 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.5% | 8 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.7 | 9.1% | 2 |
| sample.Walls 1.0 | 7.3 | 7.8% | 1 |
| cw.megas.Blade 0.8 | 7.7 | 8.0% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.1% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 88.9 | 20 / 35 | 4988 |
| 2 | 1 | 71.7 | 93.7 | 27 / 35 | 5858 |
| 3 | 1 | 70.4 | 89.2 | 17 / 35 | 5941 |
| 4 | 1 | 70.0 | 87.6 | 19 / 35 | 5607 |
| 5 | 1 | 68.4 | 86.0 | 19 / 35 | 4870 |
| 6 | 2 | 68.6 | 83.2 | 15 / 35 | 4998 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 85 | 62% |
| cre.Karolos 0.32 | 31 | 87% |
| stelo.AreaTargetingBot 1.1 | 18 | 100% |
| sample.Walls 1.0 | 8 | 100% |
| stelo.RamTrackSurfer 1.2 | 7 | 86% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 93 of 210 rounds, at a mean tick of 744. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 54 | 58% | 107 |
| cre.Karolos 0.32 | 18 | 19% | 50 |
| stelo.AreaTargetingBot 1.1 | 7 | 8% | 14 |
| stelo.RamTrackSurfer 1.2 | 6 | 6% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5 | 5% | 10 |
| sample.Walls 1.0 | 1 | 1% | 3 |
| rrh.Iwillfindyou 2.0 | 1 | 1% | 2 |
| cw.megas.Blade 0.8 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.4 | 74.7 | 65 / 210 | 3.28 | 15.4% | 24649 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 15.4% | 65 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.2% | 42 |
| davidalves.Phoenix 0.54 | 3.7 | 12.5% | 39 |
| florent.XSeries.X2 0.12 | 3.7 | 12.8% | 30 |
| pedersen.Ugluk 1.1.1 | 4.5 | 11.4% | 23 |
| oog.melee.Corsair 1.0 | 6.2 | 9.7% | 7 |
| stelo.SoJNanoMelee 1.1 | 6.8 | 8.6% | 5 |
| lunchie.Lunchbox 0.93 | 8.3 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 8.7 | 5.3% | 1 |
| evd.X1 0.01 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.5 | 79.7 | 13 / 35 | 4008 |
| 2 | 1 | 64.9 | 78.1 | 11 / 35 | 4321 |
| 3 | 1 | 62.5 | 70.8 | 11 / 35 | 4072 |
| 4 | 2 | 61.0 | 68.6 | 7 / 35 | 3841 |
| 5 | 1 | 63.4 | 73.7 | 14 / 35 | 4131 |
| 6 | 1 | 64.0 | 77.5 | 9 / 35 | 4276 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 69% |
| davidalves.Phoenix 0.54 | 18 | 72% |
| florent.XSeries.X2 0.12 | 16 | 63% |
| stelo.SoJNanoMelee 1.1 | 13 | 85% |
| pedersen.Ugluk 1.1.1 | 9 | 67% |
| oog.melee.Corsair 1.0 | 6 | 50% |
| lunchie.Lunchbox 0.93 | 1 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |

Hadur died in 147 of 210 rounds, at a mean tick of 696. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 24% | 47 |
| rz.GlowBlowMelee 1.4 | 35 | 24% | 57 |
| davidalves.Phoenix 0.54 | 25 | 17% | 41 |
| pedersen.Ugluk 1.1.1 | 24 | 16% | 31 |
| oog.melee.Corsair 1.0 | 12 | 8% | 16 |
| stelo.SoJNanoMelee 1.1 | 7 | 5% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 4 |
| as.FrankTheTank 1.3 | 2 | 1% | 2 |
| evd.X1 0.01 | 2 | 1% | 2 |
1 death(s) with no robot to name.

## Melee bench: F25

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.3 | 110 / 210 | 2.78 | 17.4% | 26196 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 17.4% | 110 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 14.0% | 28 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.3% | 12 |
| jdw.Hurricane 1.4 | 3.7 | 11.7% | 29 |
| ds.Oo 2.2 | 5.2 | 9.0% | 8 |
| gre.svman4.Morfeas 1.4.1 | 6.3 | 8.6% | 7 |
| gjr.Cephalosporin 0.1 | 7.5 | 7.9% | 8 |
| awesomeness.Elite 1.0 | 7.7 | 7.5% | 3 |
| adt.Ar2 1.1 | 8.3 | 7.0% | 4 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.1 | 81.6 | 20 / 35 | 4345 |
| 2 | 1 | 66.3 | 81.3 | 18 / 35 | 4347 |
| 3 | 1 | 66.2 | 79.4 | 18 / 35 | 4564 |
| 4 | 1 | 64.0 | 74.6 | 13 / 35 | 4209 |
| 5 | 1 | 67.0 | 82.9 | 20 / 35 | 4282 |
| 6 | 1 | 66.9 | 81.9 | 21 / 35 | 4449 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 49 | 86% |
| voidious.micro.BlitzBat 1.05 | 27 | 96% |
| jdw.Hurricane 1.4 | 25 | 72% |
| awesomeness.Elite 1.0 | 7 | 86% |
| adt.Ar2 1.1 | 6 | 100% |
| gre.svman4.Morfeas 1.4.1 | 6 | 83% |
| ds.Oo 2.2 | 5 | 40% |
| gjr.Cephalosporin 0.1 | 3 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 586. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 24 | 24% | 55 |
| jdw.Hurricane 1.4 | 22 | 22% | 33 |
| ds.Oo 2.2 | 17 | 17% | 23 |
| voidious.micro.BlitzBat 1.05 | 14 | 14% | 44 |
| adt.Ar2 1.1 | 7 | 7% | 15 |
| gre.svman4.Morfeas 1.4.1 | 7 | 7% | 14 |
| gjr.Cephalosporin 0.1 | 3 | 3% | 11 |
| awesomeness.Elite 1.0 | 3 | 3% | 8 |
| amk.ChumbaMini 0.2 | 3 | 3% | 6 |

## Melee bench: F26

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 87.5 | 116 / 210 | 2.13 | 18.9% | 33822 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.9% | 116 |
| ak.Fermat 2.0 | 2.2 | 14.5% | 41 |
| lrem.Spectre 0.4.4 | 3.2 | 12.7% | 21 |
| shu.nitro.LENIN .T34 | 3.8 | 11.7% | 23 |
| js.PinBall 1.6 | 5.0 | 10.4% | 1 |
| gh.mini.GrubbmOne 1.0 | 5.8 | 10.0% | 5 |
| jaybot.adv.bots.JayBot 2.0 | 7.0 | 8.9% | 4 |
| fullsail.LaxativeTeaTwo 1.0 | 8.2 | 6.2% | 0 |
| sample.SpinBot 1.0 | 8.8 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 91.4 | 21 / 35 | 6391 |
| 2 | 1 | 64.6 | 76.8 | 11 / 35 | 4817 |
| 3 | 1 | 71.0 | 92.4 | 25 / 35 | 5916 |
| 4 | 1 | 68.3 | 86.3 | 16 / 35 | 5612 |
| 5 | 1 | 69.4 | 88.3 | 22 / 35 | 5455 |
| 6 | 1 | 69.8 | 89.5 | 21 / 35 | 5631 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 47 | 72% |
| lrem.Spectre 0.4.4 | 42 | 81% |
| shu.nitro.LENIN .T34 | 37 | 76% |
| js.PinBall 1.6 | 11 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 3 | 67% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 34 | 36% | 68 |
| shu.nitro.LENIN .T34 | 22 | 23% | 58 |
| lrem.Spectre 0.4.4 | 18 | 19% | 36 |
| js.PinBall 1.6 | 9 | 10% | 25 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 6% | 8 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 6 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 9 |

## Melee bench: F27

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 83.4 | 130 / 210 | 2.49 | 18.5% | 30253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.5% | 130 |
| mk.Alpha 0.2.1 | 2.7 | 12.9% | 30 |
| wee.Gem 1.8.4 | 3.7 | 11.3% | 21 |
| EH.Eagle 1.0.6 | 3.8 | 11.1% | 6 |
| sheldor.melee.nano.TestMelee 0.1 | 4.2 | 10.6% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.0 | 9.7% | 8 |
| joe.ADinosaur 1.0 | 7.2 | 8.5% | 2 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.0% | 3 |
| caimano.Furia_Ceca 0.22 | 9.2 | 6.0% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 80.6 | 22 / 35 | 4447 |
| 2 | 1 | 68.9 | 89.5 | 24 / 35 | 4882 |
| 3 | 1 | 69.7 | 82.9 | 20 / 35 | 6159 |
| 4 | 1 | 67.2 | 84.4 | 21 / 35 | 4318 |
| 5 | 1 | 66.3 | 70.8 | 16 / 35 | 5610 |
| 6 | 1 | 69.8 | 92.4 | 27 / 35 | 4837 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 56 | 80% |
| wee.Gem 1.8.4 | 28 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 20 | 85% |
| EH.Eagle 1.0.6 | 20 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 13 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 75% |
| joe.ADinosaur 1.0 | 1 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 81 of 210 rounds, at a mean tick of 589. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 26% | 60 |
| sheldor.melee.nano.TestMelee 0.1 | 12 | 15% | 28 |
| wee.Gem 1.8.4 | 11 | 14% | 45 |
| joe.ADinosaur 1.0 | 11 | 14% | 14 |
| throxbot.ThroxBot 0.1 | 8 | 10% | 14 |
| caimano.Furia_Ceca 0.22 | 6 | 7% | 6 |
| EH.Eagle 1.0.6 | 5 | 6% | 24 |
| cs.Grudge 1.0 | 4 | 5% | 4 |
| techdude.kombat.FlamingKombat 1.5 | 3 | 4% | 15 |

## Melee bench: F28

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.2 | 88.0 | 123 / 210 | 2.08 | 18.7% | 27852 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.7% | 123 |
| kid.test.NightFox .2 | 2.0 | 15.1% | 48 |
| uji.Antique 1.0 | 3.0 | 11.9% | 26 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 7 |
| pfvicm.Sobieski 7.2.3b | 5.0 | 9.9% | 2 |
| amk.ChumbaWumba 0.3 | 6.3 | 8.1% | 3 |
| ahr.ice.Ice 1.0.2 | 6.5 | 7.7% | 1 |
| stelo.PianistNano 1.2 | 8.3 | 6.2% | 0 |
| matt.advanced.Katana 1.0 | 8.8 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 89.2 | 21 / 35 | 4504 |
| 2 | 1 | 68.5 | 88.3 | 20 / 35 | 4845 |
| 3 | 1 | 67.6 | 86.0 | 19 / 35 | 4656 |
| 4 | 1 | 67.8 | 86.0 | 20 / 35 | 4733 |
| 5 | 1 | 68.5 | 89.2 | 22 / 35 | 4525 |
| 6 | 1 | 68.2 | 89.5 | 21 / 35 | 4589 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 69% |
| uji.Antique 1.0 | 37 | 78% |
| qohnil.blot.BlotBot 3.61 | 17 | 88% |
| amk.ChumbaWumba 0.3 | 15 | 93% |
| ahr.ice.Ice 1.0.2 | 8 | 100% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| pfvicm.Sobieski 7.2.3b | 2 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 695. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 39 | 44% | 81 |
| uji.Antique 1.0 | 14 | 16% | 44 |
| pfvicm.Sobieski 7.2.3b | 11 | 13% | 15 |
| qohnil.blot.BlotBot 3.61 | 10 | 11% | 24 |
| amk.ChumbaWumba 0.3 | 9 | 10% | 16 |
| ahr.ice.Ice 1.0.2 | 2 | 2% | 14 |
| matt.advanced.Katana 1.0 | 1 | 1% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 5 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |

## Melee bench: F29

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 81.9 | 89 / 210 | 2.63 | 18.2% | 31801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.2% | 89 |
| deewiant.Anomaly 0.2 | 2.5 | 15.1% | 45 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.1% | 54 |
| myl.micro.Troodon 1.10 | 4.2 | 11.5% | 12 |
| jok.PheonixM 0.1.2 | 4.8 | 10.4% | 7 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.0% | 1 |
| DBall.Anarchy 0.1 | 7.3 | 6.5% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.5 | 6.5% | 0 |
| ap.Frederick 1.1 | 9.5 | 4.5% | 1 |
| jangs.ns51 1.0 | 9.5 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 81.9 | 16 / 35 | 5180 |
| 2 | 1 | 68.4 | 84.4 | 18 / 35 | 5272 |
| 3 | 1 | 68.4 | 80.6 | 15 / 35 | 5740 |
| 4 | 1 | 66.5 | 77.8 | 9 / 35 | 5171 |
| 5 | 1 | 69.1 | 85.4 | 17 / 35 | 5519 |
| 6 | 1 | 67.7 | 81.3 | 14 / 35 | 4919 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 60 | 60% |
| zyx.mega.YersiniaPestis 3.1 | 42 | 52% |
| myl.micro.Troodon 1.10 | 20 | 90% |
| DBall.Anarchy 0.1 | 7 | 100% |
| jok.PheonixM 0.1.2 | 7 | 71% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 49 | 40% | 85 |
| zyx.mega.YersiniaPestis 3.1 | 36 | 30% | 60 |
| jok.PheonixM 0.1.2 | 16 | 13% | 24 |
| myl.micro.Troodon 1.10 | 15 | 12% | 27 |
| DBall.Anarchy 0.1 | 2 | 2% | 9 |
| ph.melee.ArcherME 0.3 | 2 | 2% | 2 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.9 | 70.8 | 47 / 210 | 3.62 | 14.4% | 24487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.8 | 14.4% | 47 |
| darkcanuck.B26354 1.06 | 3.0 | 13.1% | 47 |
| catcat20.Matcha 0.006 | 3.0 | 13.5% | 50 |
| oog.melee.Capulet 1.2 | 3.5 | 12.9% | 26 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.6% | 28 |
| intruder.PrairieWolf 2.61 | 6.3 | 8.5% | 5 |
| ntc.Opposite 1.5 | 6.7 | 8.4% | 0 |
| tripphippy.Alice 1.1 | 8.3 | 7.1% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 8.7 | 6.9% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.8 | 70.2 | 7 / 35 | 4299 |
| 2 | 2 | 61.5 | 71.1 | 6 / 35 | 4016 |
| 3 | 1 | 61.8 | 72.1 | 8 / 35 | 3855 |
| 4 | 2 | 60.9 | 68.9 | 9 / 35 | 3842 |
| 5 | 2 | 63.3 | 73.0 | 11 / 35 | 4256 |
| 6 | 3 | 61.8 | 69.8 | 6 / 35 | 4219 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 26 | 54% |
| darkcanuck.B26354 1.06 | 24 | 25% |
| stelo.PastFuture 2.3.2 | 16 | 69% |
| oog.melee.Capulet 1.2 | 12 | 75% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |
| ntc.Opposite 1.5 | 2 | 100% |
| intruder.PrairieWolf 2.61 | 2 | 50% |

Hadur died in 163 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 43 | 26% | 49 |
| catcat20.Matcha 0.006 | 31 | 19% | 47 |
| oog.melee.Capulet 1.2 | 27 | 17% | 38 |
| stelo.PastFuture 2.3.2 | 25 | 15% | 33 |
| intruder.PrairieWolf 2.61 | 12 | 7% | 14 |
| ntc.Opposite 1.5 | 9 | 6% | 11 |
| tripphippy.Alice 1.1 | 9 | 6% | 11 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 4% | 7 |

## Melee bench: F31

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.4 | 49 / 210 | 3.48 | 14.6% | 22283 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 17.7% | 100 |
| hadur117.mini.DeiseWF 0.2 | 2.3 | 14.6% | 49 |
| gh.mini.Griezel 0.2 | 2.7 | 13.2% | 38 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.9% | 10 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.4% | 5 |
| gh.nano.Grofvuil 0.2 | 6.0 | 9.3% | 8 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.5% | 1 |
| fm.mammillarias 1.3 | 8.0 | 6.3% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.2% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.4 | 79.0 | 10 / 35 | 3879 |
| 2 | 2 | 60.9 | 68.9 | 6 / 35 | 3892 |
| 3 | 3 | 60.1 | 67.6 | 5 / 35 | 3489 |
| 4 | 2 | 65.3 | 79.0 | 16 / 35 | 3903 |
| 5 | 2 | 63.3 | 73.7 | 9 / 35 | 3989 |
| 6 | 3 | 58.5 | 66.3 | 3 / 35 | 3131 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 45 | 40% |
| gh.mini.Griezel 0.2 | 23 | 57% |
| spinnercat.micro.Tyger 0.1 | 16 | 81% |
| d414.nano.Quantum 1.0.0 | 4 | 50% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |
| gh.nano.Grofvuil 0.2 | 1 | 100% |
| tlp.ThreeLeggedPig 1 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 709. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 60 | 37% | 77 |
| gh.mini.Griezel 0.2 | 39 | 24% | 53 |
| d414.nano.Quantum 1.0.0 | 21 | 13% | 25 |
| spinnercat.micro.Tyger 0.1 | 14 | 9% | 23 |
| Gecko.ultimateGeckoBot 1.0 | 8 | 5% | 9 |
| timmit.nano.TimDog 0.33 | 8 | 5% | 8 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 10 |
| fm.mammillarias 1.3 | 5 | 3% | 5 |

## Melee bench: F32

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 87.1 | 120 / 210 | 2.16 | 18.7% | 30917 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.7% | 120 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.6% | 53 |
| apc.botM 3.0 | 3.0 | 11.6% | 14 |
| lxx.ConceptA 0.8 | 4.2 | 10.6% | 4 |
| vjik.UnViolation 1.1 | 5.2 | 9.7% | 7 |
| bayen.UbaMicro 1.4 | 6.0 | 8.6% | 3 |
| panzer.Panzer 0.2 | 7.3 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 4 |
| conscience.Electron 1.3g | 8.8 | 6.3% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.5% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 79.7 | 15 / 35 | 5015 |
| 2 | 1 | 69.2 | 90.5 | 24 / 35 | 5182 |
| 3 | 1 | 67.6 | 86.0 | 20 / 35 | 4892 |
| 4 | 1 | 69.0 | 89.8 | 21 / 35 | 5369 |
| 5 | 1 | 68.3 | 88.3 | 20 / 35 | 5322 |
| 6 | 1 | 68.2 | 88.6 | 20 / 35 | 5137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 72 | 54% |
| apc.botM 3.0 | 31 | 77% |
| lxx.ConceptA 0.8 | 26 | 92% |
| bayen.UbaMicro 1.4 | 10 | 90% |
| vjik.UnViolation 1.1 | 10 | 100% |
| yk.JahMicro 1.0 | 7 | 86% |
| panzer.Panzer 0.2 | 5 | 100% |
| donjezza.Jezza 1.0 | 3 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 715. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 52% | 98 |
| apc.botM 3.0 | 12 | 13% | 37 |
| lxx.ConceptA 0.8 | 10 | 11% | 20 |
| vjik.UnViolation 1.1 | 7 | 8% | 25 |
| bayen.UbaMicro 1.4 | 6 | 7% | 14 |
| panzer.Panzer 0.2 | 5 | 6% | 6 |
| yk.JahMicro 1.0 | 2 | 2% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 4 |
| conscience.Electron 1.3g | 0 | 0% | 1 |

## Melee bench: F33

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 83.1 | 112 / 210 | 2.52 | 18.3% | 30688 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.3% | 112 |
| maribo.Quester 0.3 | 2.0 | 16.2% | 53 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.8% | 19 |
| gre.svman4.Leonidas 1.3.2 | 4.3 | 10.8% | 12 |
| labg.Cataclysm 2.05 | 5.5 | 9.9% | 12 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.0 | 8.5% | 2 |
| baal.nano.N 1.42 | 6.2 | 8.9% | 1 |
| zyx.micro.Ant 1.1 | 8.5 | 5.2% | 0 |
| sanja.First 0.1 | 9.0 | 4.9% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 86.0 | 21 / 35 | 5259 |
| 2 | 1 | 66.7 | 81.0 | 17 / 35 | 4468 |
| 3 | 1 | 68.5 | 84.1 | 19 / 35 | 5253 |
| 4 | 1 | 69.0 | 86.7 | 19 / 35 | 5279 |
| 5 | 1 | 67.9 | 79.7 | 19 / 35 | 5220 |
| 6 | 1 | 67.5 | 81.0 | 17 / 35 | 5209 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 49 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 31 | 81% |
| gre.svman4.Leonidas 1.3.2 | 27 | 100% |
| labg.Cataclysm 2.05 | 12 | 83% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 100% |
| baal.nano.N 1.42 | 3 | 100% |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 100% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 41 | 42% | 86 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 22 | 22% | 52 |
| labg.Cataclysm 2.05 | 14 | 14% | 27 |
| gre.svman4.Leonidas 1.3.2 | 8 | 8% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 4% | 7 |
| zyx.micro.Ant 1.1 | 4 | 4% | 6 |
| baal.nano.N 1.42 | 3 | 3% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 2 |

## Melee bench: F34

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 83.0 | 70 / 210 | 2.53 | 17.2% | 29989 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.7 | 17.2% | 70 |
| kid.Gladiator .7.2 | 2.2 | 16.5% | 52 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 69 |
| tcf.Reach 3 | 4.2 | 11.1% | 6 |
| jcs.Seth 1.8 | 5.0 | 10.2% | 9 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.7% | 2 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.1% | 1 |
| sample.VelociRobot 1.0 | 9.0 | 3.5% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 78.1 | 10 / 35 | 4702 |
| 2 | 2 | 66.1 | 80.6 | 9 / 35 | 4826 |
| 3 | 1 | 68.9 | 85.7 | 17 / 35 | 5190 |
| 4 | 2 | 67.7 | 85.1 | 11 / 35 | 4972 |
| 5 | 1 | 68.7 | 87.3 | 15 / 35 | 5389 |
| 6 | 2 | 66.6 | 81.3 | 8 / 35 | 4910 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 57 | 51% |
| kid.Gladiator .7.2 | 53 | 45% |
| jcs.Seth 1.8 | 10 | 60% |
| tcf.Reach 3 | 6 | 83% |
| ratosh.Wesco 1.4 | 4 | 100% |
| cli.Dancer 1.1 | 3 | 67% |

Hadur died in 140 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 55 | 39% | 70 |
| stelo.Spread 0.9 | 53 | 38% | 83 |
| tcf.Reach 3 | 12 | 9% | 21 |
| jcs.Seth 1.8 | 10 | 7% | 19 |
| ratosh.Wesco 1.4 | 4 | 3% | 9 |
| cli.Dancer 1.1 | 4 | 3% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.7 | 78.4 | 30 / 210 | 2.94 | 15.1% | 23067 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 20.1% | 159 |
| hadur117.mini.DeiseWF 0.2 | 2.2 | 15.1% | 30 |
| gh.mini.Gruwel 0.9 | 3.3 | 12.9% | 15 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 11.7% | 3 |
| rz.HawkOnFire 0.1 | 4.5 | 11.5% | 2 |
| myl.nano.KomoriNinja 1.1 | 6.7 | 6.7% | 0 |
| wit.Chuliath 1.0 | 6.8 | 6.5% | 1 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.1% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.6% | 0 |
| dans.Cinnamon 1.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 82.5 | 7 / 35 | 3898 |
| 2 | 2 | 63.4 | 78.4 | 5 / 35 | 3935 |
| 3 | 3 | 61.4 | 73.3 | 4 / 35 | 3278 |
| 4 | 2 | 64.7 | 80.3 | 7 / 35 | 4261 |
| 5 | 2 | 63.4 | 78.1 | 3 / 35 | 3765 |
| 6 | 2 | 64.0 | 77.8 | 4 / 35 | 3930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 69 | 9% |
| gh.mini.Gruwel 0.9 | 15 | 60% |
| dmh.robocode.robot.BlackDeath 9.2 | 7 | 86% |
| rz.HawkOnFire 0.1 | 7 | 100% |
| wit.Chuliath 1.0 | 2 | 100% |

Hadur died in 180 of 210 rounds, at a mean tick of 779. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 93 | 52% | 99 |
| gh.mini.Gruwel 0.9 | 38 | 21% | 48 |
| dmh.robocode.robot.BlackDeath 9.2 | 25 | 14% | 28 |
| rz.HawkOnFire 0.1 | 16 | 9% | 25 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 89.8 | 150 / 210 | 1.92 | 20.3% | 33511 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.3% | 150 |
| alpha.RainingFire 1.0 | 2.5 | 12.4% | 16 |
| bzdp.Pansy 2.1 | 3.5 | 11.3% | 9 |
| bvh.micro.Freya 0.3 | 4.7 | 10.9% | 14 |
| mz.Cork 0.1 | 4.8 | 10.6% | 9 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.6% | 8 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.3% | 1 |
| dl.BetterWalls 1.0 | 8.3 | 6.1% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.8 | 5.1% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 85.7 | 23 / 35 | 5242 |
| 2 | 1 | 68.5 | 83.8 | 21 / 35 | 5317 |
| 3 | 1 | 69.8 | 89.8 | 23 / 35 | 5376 |
| 4 | 1 | 72.3 | 94.6 | 29 / 35 | 6168 |
| 5 | 1 | 70.5 | 91.4 | 27 / 35 | 5521 |
| 6 | 1 | 71.6 | 93.3 | 27 / 35 | 5887 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 46 | 96% |
| alpha.RainingFire 1.0 | 28 | 75% |
| bvh.micro.Freya 0.3 | 24 | 88% |
| bvh.mini.Fenrir 0.39 | 23 | 100% |
| mz.Cork 0.1 | 19 | 95% |
| m3thos.Eva02 0.7.1 | 12 | 92% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| dl.BetterWalls 1.0 | 4 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 60 of 210 rounds, at a mean tick of 679. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 19 | 32% | 40 |
| bvh.micro.Freya 0.3 | 12 | 20% | 36 |
| bzdp.Pansy 2.1 | 9 | 15% | 50 |
| bvh.mini.Fenrir 0.39 | 9 | 15% | 20 |
| m3thos.Eva02 0.7.1 | 6 | 10% | 20 |
| mz.Cork 0.1 | 4 | 7% | 24 |
| sample.MyFirstRobot 1.0 | 1 | 2% | 10 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 90.6 | 169 / 210 | 1.85 | 20.0% | 34875 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.0% | 169 |
| germ.TheMind .2 | 2.5 | 10.7% | 9 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.0% | 3 |
| EBBU.Sim2 1.02 | 4.0 | 9.9% | 3 |
| lmk.ACPFinal 0.1 | 5.8 | 8.9% | 2 |
| stelo.UntouchableNano 1.3 | 6.2 | 8.7% | 8 |
| agrach.Dalek 1.0 | 7.0 | 8.4% | 8 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 8.0% | 0 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 3 |
| mb.Beast 0.1 | 8.7 | 7.7% | 5 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 93.7 | 32 / 35 | 5681 |
| 2 | 1 | 69.1 | 91.7 | 26 / 35 | 5715 |
| 3 | 1 | 67.4 | 84.8 | 26 / 35 | 5246 |
| 4 | 1 | 70.6 | 92.7 | 28 / 35 | 6541 |
| 5 | 1 | 69.6 | 91.4 | 30 / 35 | 5823 |
| 6 | 1 | 68.9 | 89.2 | 27 / 35 | 5869 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 98% |
| EBBU.Sim2 1.02 | 22 | 100% |
| agrach.Dalek 1.0 | 20 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 19 | 95% |
| skm.Ryubot 1.0 | 19 | 100% |
| lmk.ACPFinal 0.1 | 18 | 89% |
| stelo.UntouchableNano 1.3 | 16 | 88% |
| mb.Beast 0.1 | 15 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 396. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| lmk.ACPFinal 0.1 | 9 | 21% | 25 |
| germ.TheMind .2 | 6 | 14% | 42 |
| agrach.Dalek 1.0 | 6 | 14% | 32 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 14% | 28 |
| EBBU.Sim2 1.02 | 4 | 10% | 27 |
| stelo.UntouchableNano 1.3 | 4 | 10% | 16 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 10% | 8 |
| mb.Beast 0.1 | 3 | 7% | 18 |
| skm.Ryubot 1.0 | 0 | 0% | 8 |

## Melee bench: F38

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 81.2 | 89 / 210 | 2.70 | 16.9% | 27461 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 16.9% | 89 |
| justin.Mallais 14.0 | 1.8 | 15.4% | 66 |
| bvh.mini.Freya 0.55 | 3.3 | 12.4% | 20 |
| cs.Wren 1.0 | 4.5 | 10.8% | 7 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.6% | 7 |
| bts.mega.Gnarly 1.4 | 5.2 | 10.8% | 16 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.8% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.4% | 2 |
| bzdp.BoxCar 2.0 | 9.5 | 3.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 83.2 | 17 / 35 | 4731 |
| 2 | 1 | 64.5 | 77.8 | 12 / 35 | 4373 |
| 3 | 1 | 66.2 | 82.5 | 15 / 35 | 4578 |
| 4 | 1 | 66.9 | 83.8 | 17 / 35 | 4657 |
| 5 | 1 | 67.8 | 85.4 | 17 / 35 | 4905 |
| 6 | 2 | 63.8 | 74.3 | 11 / 35 | 4217 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 45 | 62% |
| bvh.mini.Freya 0.55 | 18 | 67% |
| cs.Wren 1.0 | 18 | 94% |
| bts.mega.Gnarly 1.4 | 18 | 83% |
| davidalves.net.DuelistNanoMelee 1.01 | 14 | 79% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |
| matt.UnderDark3 2.4.34 | 1 | 100% |

Hadur died in 121 of 210 rounds, at a mean tick of 698. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 40 | 33% | 73 |
| bvh.mini.Freya 0.55 | 29 | 24% | 38 |
| bts.mega.Gnarly 1.4 | 23 | 19% | 42 |
| cs.Wren 1.0 | 11 | 9% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 8% | 21 |
| kdf.KoulDestroyer 1.0 | 4 | 3% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 7 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 2 |
| bzdp.BoxCar 2.0 | 0 | 0% | 1 |

## Melee bench: F39

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 80.0 | 88 / 210 | 2.80 | 17.1% | 30147 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 17.1% | 88 |
| bvh.fry.Freya 0.82 | 1.8 | 14.7% | 30 |
| az.Ololobot 0.2.4 | 3.0 | 13.1% | 59 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 17 |
| stelo.SoRobotNanoMelee 1.2 | 5.5 | 9.1% | 11 |
| apollokidd.ApolloKidd 0.9 | 6.7 | 8.1% | 1 |
| gimp.GimpBot 0.1 | 7.0 | 7.9% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.5 | 7.7% | 1 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.5 | 6.3% | 1 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.0 | 80.3 | 14 / 35 | 5199 |
| 2 | 1 | 64.3 | 76.8 | 11 / 35 | 4805 |
| 3 | 1 | 67.3 | 83.5 | 18 / 35 | 5350 |
| 4 | 1 | 64.7 | 77.1 | 12 / 35 | 4984 |
| 5 | 2 | 63.9 | 75.6 | 14 / 35 | 4458 |
| 6 | 1 | 68.0 | 86.7 | 19 / 35 | 5351 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 38 | 47% |
| bvh.fry.Freya 0.82 | 34 | 82% |
| catcat20.Lambda 0.024 | 21 | 76% |
| stelo.SoRobotNanoMelee 1.2 | 18 | 100% |
| gimp.GimpBot 0.1 | 4 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |
| winamp32.micro.MicroMacro 1.0 | 1 | 100% |

Hadur died in 123 of 210 rounds, at a mean tick of 865. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 41 | 33% | 64 |
| az.Ololobot 0.2.4 | 39 | 32% | 64 |
| catcat20.Lambda 0.024 | 15 | 12% | 27 |
| stelo.SoRobotNanoMelee 1.2 | 14 | 11% | 24 |
| apollokidd.ApolloKidd 0.9 | 7 | 6% | 11 |
| winamp32.micro.MicroMacro 1.0 | 4 | 3% | 10 |
| gimp.GimpBot 0.1 | 2 | 2% | 8 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 1 |

## Melee bench: F40

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.9 | 84.7 | 101 / 210 | 2.38 | 18.3% | 30561 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 18.3% | 101 |
| kawigi.mini.Coriantumr 1.1 | 1.8 | 15.8% | 60 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 11.5% | 18 |
| mz.AntiGrav 1.0 | 4.5 | 10.9% | 9 |
| Polkwane.SmashMelee 1.0 | 4.8 | 10.4% | 10 |
| stelo.Randomness 1.0 | 6.0 | 9.3% | 9 |
| alpha.BlackIce 1.0 | 6.3 | 8.9% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.0% | 0 |
| sample.Corners 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 19 / 35 | 4983 |
| 2 | 1 | 67.5 | 84.1 | 15 / 35 | 4997 |
| 3 | 1 | 70.6 | 92.1 | 20 / 35 | 5674 |
| 4 | 1 | 68.4 | 85.1 | 17 / 35 | 5355 |
| 5 | 2 | 66.1 | 81.0 | 15 / 35 | 4618 |
| 6 | 1 | 66.8 | 79.7 | 15 / 35 | 4934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 67 | 55% |
| kano.gamma.KanoGamma 1.8 | 21 | 62% |
| mz.AntiGrav 1.0 | 19 | 95% |
| Polkwane.SmashMelee 1.0 | 17 | 82% |
| stelo.Randomness 1.0 | 12 | 75% |
| alpha.BlackIce 1.0 | 7 | 100% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 109 of 210 rounds, at a mean tick of 791. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 50 | 46% | 79 |
| kano.gamma.KanoGamma 1.8 | 18 | 17% | 39 |
| stelo.Randomness 1.0 | 10 | 9% | 22 |
| Polkwane.SmashMelee 1.0 | 10 | 9% | 17 |
| mz.AntiGrav 1.0 | 8 | 7% | 25 |
| alpha.BlackIce 1.0 | 7 | 6% | 15 |
| testantiswapgun.AntiSwap 1.0 | 3 | 3% | 7 |
| amk.superstrike.SuperStrike 0.3 | 3 | 3% | 3 |
| sample.Corners 1.0 | 0 | 0% | 3 |

## Melee bench: F41

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 82.1 | 101 / 210 | 2.61 | 17.3% | 27316 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.2 | 17.3% | 101 |
| eem.EvBotNG v12.8 | 1.8 | 15.6% | 61 |
| ary.Swarm 1.1 | 3.3 | 13.0% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.5% | 17 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.3% | 13 |
| shrub.Silver v048 | 6.0 | 9.2% | 3 |
| zyx.nano.Ant 1.1 | 7.0 | 7.8% | 2 |
| jsal.Jsalbot 1.0 | 8.3 | 6.0% | 3 |
| stelo.Mirror 1.1 | 8.7 | 5.5% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 80.3 | 17 / 35 | 4865 |
| 2 | 1 | 67.3 | 84.8 | 18 / 35 | 4342 |
| 3 | 1 | 67.0 | 82.9 | 17 / 35 | 4471 |
| 4 | 1 | 67.3 | 84.1 | 19 / 35 | 4596 |
| 5 | 1 | 67.5 | 85.4 | 18 / 35 | 4599 |
| 6 | 2 | 64.7 | 75.2 | 12 / 35 | 4443 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 51 | 75% |
| ary.Swarm 1.1 | 30 | 97% |
| lessonz.robocode.Oz 0.5.0 | 18 | 67% |
| simonton.nano.MeleeSeed 1.8 | 13 | 77% |
| jsal.Jsalbot 1.0 | 7 | 71% |
| zyx.nano.Ant 1.1 | 4 | 100% |
| shrub.Silver v048 | 3 | 67% |
| stelo.Mirror 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 703. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 38 | 34% | 74 |
| ary.Swarm 1.1 | 23 | 21% | 50 |
| lessonz.robocode.Oz 0.5.0 | 19 | 17% | 37 |
| simonton.nano.MeleeSeed 1.8 | 14 | 13% | 24 |
| shrub.Silver v048 | 7 | 6% | 9 |
| zyx.nano.Ant 1.1 | 4 | 4% | 7 |
| jsal.Jsalbot 1.0 | 2 | 2% | 5 |
| stelo.Mirror 1.1 | 2 | 2% | 3 |
| acogdev.alpha 0.2 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F42

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 84.7 | 102 / 210 | 2.38 | 18.3% | 32866 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.3% | 102 |
| wompi.Wallaby 5.1 | 2.2 | 15.2% | 46 |
| ara.Shera 0.88 | 3.3 | 13.6% | 35 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.6% | 23 |
| amz.NanoClone 1.41 | 5.2 | 8.5% | 2 |
| maribo.IotaCT 1.1 | 6.3 | 7.6% | 0 |
| dsw.StaticD 1.0 | 6.7 | 6.9% | 3 |
| stelo.MirrorMicro 1.0 | 8.0 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.3 | 5.0% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.3 | 18 / 35 | 5743 |
| 2 | 1 | 68.3 | 86.7 | 17 / 35 | 5590 |
| 3 | 1 | 67.9 | 83.2 | 16 / 35 | 5637 |
| 4 | 1 | 68.3 | 85.1 | 19 / 35 | 5387 |
| 5 | 1 | 66.9 | 80.3 | 14 / 35 | 5425 |
| 6 | 1 | 68.1 | 85.7 | 18 / 35 | 5084 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 44 | 89% |
| maribo.mini.MiniQuester 0.1 | 41 | 78% |
| ara.Shera 0.88 | 32 | 59% |
| dsw.StaticD 1.0 | 7 | 86% |
| amz.NanoClone 1.41 | 3 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 801. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 37 | 34% | 78 |
| ara.Shera 0.88 | 30 | 27% | 45 |
| maribo.mini.MiniQuester 0.1 | 27 | 25% | 64 |
| amz.NanoClone 1.41 | 5 | 5% | 7 |
| dsw.StaticD 1.0 | 3 | 3% | 7 |
| maribo.IotaCT 1.1 | 3 | 3% | 4 |
| mme.NikeEnhanced 2.0 | 2 | 2% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F43

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.8 | 71.4 | 16 / 210 | 3.57 | 14.0% | 23540 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.5% | 166 |
| hadur117.mini.DeiseWF 0.2 | 2.0 | 14.0% | 16 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.4% | 13 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.2% | 5 |
| wcsv.melee.EngineerMelee 0.1 | 4.2 | 11.2% | 7 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.6% | 3 |
| jab.DiamondStealer 5 | 7.2 | 7.9% | 0 |
| mz.NanoGod 2.02 | 7.7 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 3.7% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.5 | 70.5 | 0 / 35 | 4078 |
| 2 | 2 | 63.9 | 74.0 | 3 / 35 | 4053 |
| 3 | 2 | 63.0 | 71.4 | 4 / 35 | 3866 |
| 4 | 2 | 62.4 | 70.5 | 3 / 35 | 3836 |
| 5 | 2 | 63.0 | 72.1 | 4 / 35 | 3771 |
| 6 | 2 | 62.3 | 70.2 | 2 / 35 | 3936 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 16% |
| brainfade.melee.Dusk 0.44 | 7 | 57% |
| dummy.micro.Sparrow 2.5 | 2 | 50% |
| wcsv.melee.EngineerMelee 0.1 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 194 of 210 rounds, at a mean tick of 788. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 99 | 51% | 109 |
| brainfade.melee.Dusk 0.44 | 32 | 16% | 35 |
| wcsv.melee.EngineerMelee 0.1 | 23 | 12% | 23 |
| dummy.micro.Sparrow 2.5 | 21 | 11% | 22 |
| mz.NanoGod 2.02 | 10 | 5% | 10 |
| Krabb.akim2.Akim2 1.1b | 7 | 4% | 9 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
| jab.DiamondStealer 5 | 1 | 1% | 1 |

## Melee bench: F44

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 83.3 | 106 / 210 | 2.50 | 18.5% | 33314 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 18.5% | 106 |
| stelo.Liblix 0.3.1 | 2.2 | 15.4% | 61 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.3% | 29 |
| wompi.Quokka 1.6 | 4.0 | 10.7% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.0% | 1 |
| jwirde.Gort 2.0 | 5.8 | 8.5% | 3 |
| disan.Chair 2.2.0 | 7.2 | 7.3% | 1 |
| stf.PanzerGeneral 0.1 | 7.7 | 6.8% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.0 | 5.1% | 0 |
| sample.Crazy 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 79.7 | 15 / 35 | 5418 |
| 2 | 1 | 69.1 | 85.7 | 20 / 35 | 5491 |
| 3 | 1 | 68.7 | 85.4 | 20 / 35 | 5360 |
| 4 | 1 | 67.5 | 80.3 | 15 / 35 | 5419 |
| 5 | 1 | 69.2 | 87.0 | 19 / 35 | 5769 |
| 6 | 1 | 68.3 | 81.9 | 17 / 35 | 5857 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 68 | 66% |
| tzu.TheArtOfWar 1.2 | 43 | 77% |
| wompi.Quokka 1.6 | 11 | 73% |
| jwirde.Gort 2.0 | 7 | 86% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 80% |
| sample.Crazy 1.0 | 2 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 758. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 41 | 39% | 91 |
| tzu.TheArtOfWar 1.2 | 29 | 28% | 62 |
| wompi.Quokka 1.6 | 15 | 14% | 18 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 8 | 8% | 11 |
| disan.Chair 2.2.0 | 4 | 4% | 6 |
| jwirde.Gort 2.0 | 3 | 3% | 11 |
| stf.PanzerGeneral 0.1 | 2 | 2% | 7 |
| amk.jointstrike.JointStrike 0.2 | 2 | 2% | 4 |

## Melee bench: F45

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 89.7 | 109 / 210 | 1.92 | 20.8% | 38732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseWF 0.2 | 1.0 | 20.8% | 109 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.5% | 92 |
| jje.BagPuss 1.2 | 3.0 | 11.5% | 4 |
| myl.nano.Graviton 1.10 | 4.0 | 10.5% | 1 |
| sul.Lunar 1.1 | 5.8 | 9.4% | 2 |
| hvilela.HVilela 0.9 | 6.0 | 9.1% | 0 |
| fm.claire 1.7 | 7.0 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.0 | 7.9% | 1 |
| wit.Deep7 2.0 | 9.0 | 6.0% | 1 |
| abud.ThirdRobo 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 90.5 | 19 / 35 | 6649 |
| 2 | 1 | 71.2 | 92.1 | 18 / 35 | 6533 |
| 3 | 1 | 70.8 | 89.2 | 19 / 35 | 6456 |
| 4 | 1 | 71.0 | 90.8 | 19 / 35 | 6391 |
| 5 | 1 | 70.1 | 87.0 | 18 / 35 | 6422 |
| 6 | 1 | 70.3 | 88.9 | 16 / 35 | 6281 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 101 | 36% |
| myl.nano.Graviton 1.10 | 19 | 95% |
| jje.BagPuss 1.2 | 18 | 100% |
| sul.Lunar 1.1 | 10 | 100% |
| wit.Deep7 2.0 | 9 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 100% |
| fm.claire 1.7 | 7 | 100% |
| hvilela.HVilela 0.9 | 3 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 2098. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 69 | 68% | 0 |
| myl.nano.Graviton 1.10 | 12 | 12% | 37 |
| jje.BagPuss 1.2 | 6 | 6% | 55 |
| pez.mini.ChironexFleckeri 0.5 | 6 | 6% | 22 |
| fm.claire 1.7 | 4 | 4% | 12 |
| sul.Lunar 1.1 | 3 | 3% | 54 |
| hvilela.HVilela 0.9 | 1 | 1% | 17 |
| wit.Deep7 2.0 | 1 | 1% | 7 |
| abud.ThirdRobo 1.0 | 0 | 0% | 3 |

## Melee bench: F46

hadur117.mini.DeiseWF 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.3 | 77.5 | 52 / 210 | 3.03 | 15.5% | 25978 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 16.9% | 81 |
| kc.mini.Mirage 0.2 | 1.8 | 16.9% | 59 |
| hadur117.mini.DeiseWF 0.2 | 2.8 | 15.5% | 52 |
| cx.Princess 1.0 | 4.5 | 10.6% | 12 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 4 |
| sadoner.killer 0.2 | 6.0 | 9.0% | 1 |
| arthord.NanoSatanMelee Beta | 7.3 | 7.0% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.1% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.5 | 76.2 | 6 / 35 | 4083 |
| 2 | 3 | 64.8 | 79.7 | 10 / 35 | 4278 |
| 3 | 3 | 64.7 | 78.7 | 8 / 35 | 4397 |
| 4 | 2 | 64.9 | 76.8 | 14 / 35 | 4229 |
| 5 | 3 | 63.4 | 75.2 | 4 / 35 | 4491 |
| 6 | 3 | 64.8 | 78.1 | 10 / 35 | 4500 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 42 | 38% |
| kc.mini.Mirage 0.2 | 41 | 61% |
| cx.Princess 1.0 | 9 | 56% |
| mz.MicroSheep 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 1 | 100% |
| mbro.Detektor3 0.1.1 | 1 | 100% |

Hadur died in 158 of 210 rounds, at a mean tick of 745. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 63 | 40% | 93 |
| rsalesc.melee.Medina 0.4.5 | 59 | 37% | 70 |
| mz.MicroSheep 1.0 | 14 | 9% | 20 |
| cx.Princess 1.0 | 10 | 6% | 12 |
| sadoner.killer 0.2 | 6 | 4% | 7 |
| arthord.NanoSatanMelee Beta | 4 | 3% | 5 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 2 |
| jeremyreeder.collective.Prophet 5 | 1 | 1% | 1 |

