# Bench suite: suite.txt

## Melee bench: F01

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 81.7 | 31 / 210 | 2.64 | 16.2% | 29762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.8% | 137 |
| hadur117.mini.DeiseP200 0.2 | 2.0 | 16.2% | 31 |
| sgp.JollyNinja 3.53 | 3.0 | 12.5% | 29 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.5 | 10.8% | 0 |
| mz.MicroGodMelee 1 | 4.7 | 10.7% | 9 |
| lorneswork.Predator 1.0 | 6.0 | 9.7% | 2 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.2% | 1 |
| skm.butterfly 1.0 | 8.8 | 4.7% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.1 | 81.6 | 1 / 35 | 4844 |
| 2 | 2 | 66.5 | 82.5 | 6 / 35 | 5370 |
| 3 | 2 | 66.7 | 83.8 | 8 / 35 | 5247 |
| 4 | 2 | 65.4 | 79.7 | 4 / 35 | 4992 |
| 5 | 2 | 64.6 | 79.4 | 5 / 35 | 4702 |
| 6 | 2 | 65.7 | 83.5 | 7 / 35 | 4607 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 95 | 12% |
| sgp.JollyNinja 3.53 | 11 | 27% |
| mz.MicroGodMelee 1 | 10 | 50% |
| lorneswork.Predator 1.0 | 9 | 78% |
| simonton.nano.WeekendObsession_Melee 1.0 | 3 | 100% |
| adt.Ar2 1.0 | 2 | 50% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 179 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 117 | 65% | 128 |
| sgp.JollyNinja 3.53 | 29 | 16% | 32 |
| mz.MicroGodMelee 1 | 13 | 7% | 17 |
| simonton.nano.WeekendObsession_Melee 1.0 | 10 | 6% | 12 |
| lorneswork.Predator 1.0 | 4 | 2% | 10 |
| adt.Ar2 1.0 | 3 | 2% | 6 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 2 |
| skm.butterfly 1.0 | 0 | 0% | 1 |

## Melee bench: F02

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.3 | 81.7 | 84 / 210 | 2.65 | 17.4% | 29501 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.2 | 17.4% | 84 |
| pulsar.PulsarMax 0.8.9 | 2.3 | 13.8% | 50 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.5 | 13.5% | 34 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.5% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.5 | 9.5% | 11 |
| sch.Simone 0.3d | 6.8 | 8.0% | 12 |
| fnc.bandit.Bandit 5.2.0 | 6.8 | 8.5% | 3 |
| Noran.BitchingElk 0.054 | 7.0 | 8.0% | 7 |
| stelo.PatternRobot 1.0 | 9.0 | 6.0% | 6 |
| fullsail.SweetTea 1.1 | 9.8 | 4.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 87.3 | 19 / 35 | 5145 |
| 2 | 1 | 66.4 | 84.1 | 12 / 35 | 4827 |
| 3 | 2 | 62.5 | 71.4 | 7 / 35 | 4641 |
| 4 | 1 | 66.7 | 81.6 | 14 / 35 | 4918 |
| 5 | 1 | 66.8 | 81.3 | 16 / 35 | 4914 |
| 6 | 1 | 67.2 | 84.4 | 16 / 35 | 5056 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.roborio.RoborioPorradeiro 1.1b | 40 | 70% |
| pulsar.PulsarMax 0.8.9 | 35 | 49% |
| sch.Simone 0.3d | 10 | 60% |
| Noran.BitchingElk 0.054 | 10 | 80% |
| lrem.micro.SpikeSoldier 0.4 | 9 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 63% |
| fullsail.SweetTea 1.1 | 5 | 80% |
| stelo.PatternRobot 1.0 | 5 | 80% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |

Hadur died in 127 of 210 rounds, at a mean tick of 936. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 37 | 29% | 51 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 36 | 28% | 67 |
| stelo.PatternRobot 1.0 | 13 | 10% | 18 |
| sch.Simone 0.3d | 9 | 7% | 17 |
| com.cohesiva.robocode.ManOwaR 1.0 | 9 | 7% | 16 |
| lrem.micro.SpikeSoldier 0.4 | 7 | 6% | 10 |
| fullsail.SweetTea 1.1 | 6 | 5% | 9 |
| Noran.BitchingElk 0.054 | 5 | 4% | 15 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 7 |

## Melee bench: F03

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.6 | 139 / 210 | 1.75 | 19.7% | 35543 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 19.7% | 139 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.2% | 20 |
| radnor.DoctorBob 1.42 | 2.8 | 13.8% | 19 |
| vuen.Cake 2.51 | 3.3 | 12.8% | 26 |
| urdos.URDOS 1.3 | 5.0 | 10.0% | 6 |
| adt.Ar1 2.1 | 6.8 | 7.1% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 6.8 | 7.0% | 1 |
| oa.weak.FlyMk1 0.1 | 7.8 | 6.1% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.8 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.6 | 22 / 35 | 5848 |
| 2 | 1 | 69.8 | 92.1 | 27 / 35 | 5666 |
| 3 | 1 | 69.5 | 90.5 | 20 / 35 | 5934 |
| 4 | 1 | 70.4 | 94.9 | 24 / 35 | 5892 |
| 5 | 1 | 70.2 | 91.1 | 24 / 35 | 6106 |
| 6 | 1 | 70.1 | 92.7 | 22 / 35 | 6097 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 61 | 77% |
| kawigi.nano.Lib 1.0 | 58 | 88% |
| radnor.DoctorBob 1.42 | 43 | 84% |
| urdos.URDOS 1.3 | 5 | 40% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 861. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| radnor.DoctorBob 1.42 | 21 | 29% | 52 |
| vuen.Cake 2.51 | 19 | 26% | 63 |
| kawigi.nano.Lib 1.0 | 18 | 25% | 71 |
| urdos.URDOS 1.3 | 9 | 13% | 12 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 3% | 3 |
| oa.weak.FlyMk1 0.1 | 2 | 3% | 2 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 1 |
| adt.Ar1 2.1 | 0 | 0% | 1 |

## Melee bench: F04

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.2 | 73.2 | 8 / 210 | 3.41 | 14.9% | 30977 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 24.4% | 194 |
| hadur117.mini.DeiseP200 0.2 | 2.0 | 14.9% | 8 |
| apc.LeeroyJenkins2 1.0 | 3.2 | 12.7% | 3 |
| josago.Jorgito 0.16 | 4.3 | 10.3% | 1 |
| TNT.TNT 0.99.1 | 4.5 | 10.5% | 3 |
| css.Delitioner 0.11 | 6.2 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.8 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.1% | 0 |
| sp.Nanos.Ember 1.1 | 9.2 | 4.3% | 0 |
| spin.Bugstard 0.012b | 9.7 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.3 | 76.5 | 1 / 35 | 5278 |
| 2 | 2 | 63.3 | 72.1 | 1 / 35 | 4750 |
| 3 | 2 | 64.3 | 73.7 | 1 / 35 | 5443 |
| 4 | 2 | 63.6 | 70.2 | 1 / 35 | 5320 |
| 5 | 2 | 65.7 | 76.2 | 3 / 35 | 5527 |
| 6 | 2 | 62.6 | 70.8 | 1 / 35 | 4659 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 59 | 10% |
| TNT.TNT 0.99.1 | 2 | 50% |
| apc.LeeroyJenkins2 1.0 | 2 | 50% |

Hadur died in 202 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 167 | 83% | 173 |
| apc.LeeroyJenkins2 1.0 | 11 | 5% | 12 |
| tj.zombie1n 1.0.1 | 8 | 4% | 8 |
| TNT.TNT 0.99.1 | 5 | 2% | 6 |
| josago.Jorgito 0.16 | 5 | 2% | 5 |
| rampancy.Durandal 2.1d | 4 | 2% | 4 |
| sp.Nanos.Ember 1.1 | 1 | 0% | 1 |
| css.Delitioner 0.11 | 1 | 0% | 1 |

## Melee bench: F05

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 57.6 | 62.5 | 10 / 210 | 4.38 | 11.8% | 19419 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.3 | 18.6% | 114 |
| justin.DemonicRage 3.4 | 1.7 | 18.1% | 70 |
| wompi.Numbat 2.1 | 3.0 | 12.8% | 12 |
| hadur117.mini.DeiseP200 0.2 | 4.0 | 11.8% | 10 |
| axeBots.HataMoto 3.09 | 5.3 | 9.2% | 2 |
| ms.Ares 0.19 | 5.7 | 9.0% | 2 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.2 | 4.7% | 0 |
| GarmBox.Oranges 1.0 | 9.8 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 4 | 56.9 | 61.6 | 1 / 35 | 3008 |
| 2 | 4 | 57.4 | 61.9 | 2 / 35 | 3233 |
| 3 | 4 | 57.9 | 62.2 | 1 / 35 | 3334 |
| 4 | 4 | 59.5 | 67.3 | 2 / 35 | 3434 |
| 5 | 4 | 58.2 | 63.8 | 3 / 35 | 3455 |
| 6 | 4 | 55.4 | 58.1 | 1 / 35 | 2955 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 19 | 16% |
| justin.DemonicRage 3.4 | 18 | 22% |
| wompi.Numbat 2.1 | 4 | 50% |
| axeBots.HataMoto 3.09 | 1 | 100% |

Hadur died in 200 of 210 rounds, at a mean tick of 619. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 76 | 38% | 80 |
| justin.DemonicRage 3.4 | 65 | 33% | 69 |
| wompi.Numbat 2.1 | 30 | 15% | 32 |
| axeBots.HataMoto 3.09 | 9 | 5% | 9 |
| ms.Ares 0.19 | 9 | 5% | 9 |
| supersample.SuperBoxBot 1.0 | 6 | 3% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 3 | 2% | 3 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |

## Melee bench: F06

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.7 | 127 / 210 | 1.92 | 19.0% | 28379 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 19.0% | 127 |
| jekl.StoneGhost 0.7 | 2.3 | 14.3% | 25 |
| origin.SleepSiphon 1.7b | 3.3 | 12.9% | 33 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.5 | 12.0% | 18 |
| mld.Wisdom 1.0 | 4.8 | 9.8% | 4 |
| gg.Wolverine 2.0 | 6.5 | 8.2% | 1 |
| spinnercat.Omen 1.0 | 7.7 | 6.9% | 0 |
| DBall.NUKE 0.1 | 7.8 | 6.8% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.5% | 2 |
| sample.Fire 1.0 | 10.0 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 86.3 | 21 / 35 | 4657 |
| 2 | 1 | 69.5 | 91.7 | 25 / 35 | 4706 |
| 3 | 1 | 69.2 | 91.4 | 20 / 35 | 4868 |
| 4 | 1 | 69.7 | 92.4 | 22 / 35 | 4998 |
| 5 | 1 | 66.7 | 85.1 | 15 / 35 | 4417 |
| 6 | 1 | 69.3 | 91.4 | 24 / 35 | 4733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 52 | 90% |
| origin.SleepSiphon 1.7b | 45 | 64% |
| pe.minimelee.SandboxMiniMelee 1.1 | 33 | 76% |
| gg.Wolverine 2.0 | 9 | 100% |
| mld.Wisdom 1.0 | 6 | 83% |
| ers.nano.hawk.HawkLA 3.0m | 5 | 80% |
| DBall.NUKE 0.1 | 4 | 100% |
| sample.Fire 1.0 | 2 | 100% |
| spinnercat.Omen 1.0 | 2 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 893. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 29 | 35% | 61 |
| jekl.StoneGhost 0.7 | 28 | 33% | 62 |
| pe.minimelee.SandboxMiniMelee 1.1 | 18 | 21% | 50 |
| mld.Wisdom 1.0 | 6 | 7% | 11 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 8 |
| gg.Wolverine 2.0 | 1 | 1% | 8 |
| DBall.NUKE 0.1 | 1 | 1% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |
| sample.Fire 1.0 | 0 | 0% | 1 |

## Melee bench: F07

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 81.1 | 62 / 210 | 2.70 | 17.0% | 32149 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 1.2 | 18.1% | 72 |
| hadur117.mini.DeiseP200 0.2 | 2.0 | 17.0% | 62 |
| rtk.Tachikoma 1.0 | 2.8 | 16.6% | 48 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.6% | 12 |
| franzor.Lizt 1.3.1 | 4.8 | 10.6% | 18 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.4% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.2% | 0 |
| sample.Target 1.0 | 9.2 | 2.9% | 0 |
| drd.Dreadknoght 0.9 | 9.8 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 81.6 | 10 / 35 | 5059 |
| 2 | 2 | 68.9 | 84.8 | 15 / 35 | 5483 |
| 3 | 2 | 68.1 | 81.6 | 9 / 35 | 5763 |
| 4 | 2 | 67.9 | 81.0 | 11 / 35 | 5543 |
| 5 | 2 | 67.0 | 81.0 | 7 / 35 | 5250 |
| 6 | 3 | 66.0 | 76.8 | 10 / 35 | 5051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 51 | 65% |
| rsalesc.melee.Monk 0.3.6c | 29 | 10% |
| oog.melee.CapuletDroid 1.1 | 24 | 92% |
| franzor.Lizt 1.3.1 | 10 | 40% |

Hadur died in 149 of 210 rounds, at a mean tick of 1054. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 71 | 48% | 77 |
| rtk.Tachikoma 1.0 | 52 | 35% | 89 |
| oog.melee.CapuletDroid 1.1 | 15 | 10% | 36 |
| franzor.Lizt 1.3.1 | 7 | 5% | 1 |
| exauge.GateKeeper 1.1.121g | 3 | 2% | 5 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F08

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.0 | 110 / 210 | 2.08 | 19.2% | 32275 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 19.2% | 110 |
| tm.Yuugao 1.0 | 2.3 | 13.1% | 44 |
| shrub.Vapour v159 | 2.7 | 12.4% | 30 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.3% | 11 |
| com.spp.robocode.MostlyHarmless 010 | 5.2 | 9.4% | 3 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.5% | 9 |
| m3thos.Eva00 1.1 | 6.7 | 8.5% | 3 |
| qualidafial.MajorDick 1.0.1 | 7.8 | 7.1% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.5% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.8 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 87.9 | 17 / 35 | 5550 |
| 2 | 1 | 68.9 | 87.9 | 20 / 35 | 5265 |
| 3 | 1 | 69.5 | 90.5 | 21 / 35 | 5581 |
| 4 | 1 | 69.1 | 90.2 | 20 / 35 | 5388 |
| 5 | 1 | 68.4 | 87.0 | 17 / 35 | 5456 |
| 6 | 1 | 67.0 | 84.4 | 15 / 35 | 5035 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 45 | 58% |
| shrub.Vapour v159 | 35 | 66% |
| Krabb.sliNk.Garm 0.9u | 28 | 79% |
| jwst.DAD.DarkAndDarker 1.1 | 20 | 85% |
| com.spp.robocode.MostlyHarmless 010 | 15 | 93% |
| m3thos.Eva00 1.1 | 4 | 100% |
| qualidafial.MajorDick 1.0.1 | 2 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 41 | 41% | 73 |
| shrub.Vapour v159 | 23 | 23% | 43 |
| Krabb.sliNk.Garm 0.9u | 17 | 17% | 28 |
| jwst.DAD.DarkAndDarker 1.1 | 10 | 10% | 30 |
| m3thos.Eva00 1.1 | 4 | 4% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 3 | 3% | 16 |
| zyx.nano.BacillusComma 1.0 | 2 | 2% | 3 |
| SHAM.WOW 1.4 | 1 | 1% | 6 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.5 | 73.6 | 48 / 210 | 3.38 | 14.8% | 22612 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.0 | 17.3% | 98 |
| hadur117.mini.DeiseP200 0.2 | 2.3 | 14.8% | 48 |
| kc.micro.Figment 1.0 | 2.7 | 14.0% | 33 |
| yagami.Tidus 0.11 | 4.8 | 10.4% | 2 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 16 |
| mc2.enemy.Original 0.9 | 5.2 | 9.7% | 12 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.5 | 5.6% | 0 |
| robar.nano.Assertive_Melee 0.2 | 8.8 | 5.5% | 0 |
| rdm.Dueler 0.4x | 9.7 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.4 | 74.0 | 9 / 35 | 3835 |
| 2 | 2 | 63.5 | 75.9 | 9 / 35 | 3964 |
| 3 | 2 | 65.1 | 81.9 | 8 / 35 | 4054 |
| 4 | 2 | 61.5 | 69.2 | 7 / 35 | 3739 |
| 5 | 3 | 61.8 | 71.1 | 7 / 35 | 3587 |
| 6 | 3 | 60.6 | 69.5 | 8 / 35 | 3433 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 38 | 21% |
| kc.micro.Figment 1.0 | 29 | 66% |
| pedersen.Grishnakh 1.0 | 11 | 55% |
| yagami.Tidus 0.11 | 8 | 100% |
| mc2.enemy.Original 0.9 | 7 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 772. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 73 | 45% | 83 |
| mc2.enemy.Original 0.9 | 24 | 15% | 34 |
| kc.micro.Figment 1.0 | 23 | 14% | 42 |
| yagami.Tidus 0.11 | 20 | 12% | 26 |
| pedersen.Grishnakh 1.0 | 10 | 6% | 12 |
| robar.nano.Assertive_Melee 0.2 | 8 | 5% | 8 |
| rdm.Dueler 0.4x | 3 | 2% | 4 |
| dft.Calliope 5.6 | 1 | 1% | 1 |

## Melee bench: F10

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.1 | 137 / 210 | 1.90 | 19.1% | 31652 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 19.1% | 137 |
| DTF.Kludgy 1.2b | 2.0 | 14.7% | 33 |
| ne.Chimera 1.2 | 3.5 | 12.8% | 11 |
| ejb.Polaris 1.0.1 | 3.8 | 11.8% | 20 |
| vStar.RAFzilla 2.15 | 5.3 | 10.2% | 4 |
| tvv.micro.Antares 1.1.1 | 5.3 | 10.0% | 1 |
| sam.Samspin 1.0 | 7.5 | 6.0% | 1 |
| kurios.DOSexe .9b | 8.5 | 5.6% | 1 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.4% | 0 |
| donjezza.Muncho 1.0 | 9.5 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 90.5 | 23 / 35 | 5488 |
| 2 | 1 | 69.0 | 90.8 | 24 / 35 | 5108 |
| 3 | 1 | 69.7 | 92.1 | 27 / 35 | 5108 |
| 4 | 1 | 67.6 | 83.8 | 19 / 35 | 5163 |
| 5 | 1 | 68.8 | 88.9 | 22 / 35 | 5188 |
| 6 | 1 | 70.1 | 94.3 | 22 / 35 | 5597 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 53 | 62% |
| ne.Chimera 1.2 | 44 | 86% |
| ejb.Polaris 1.0.1 | 32 | 78% |
| vStar.RAFzilla 2.15 | 18 | 94% |
| tvv.micro.Antares 1.1.1 | 15 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| donjezza.Muncho 1.0 | 4 | 75% |
| sam.Samspin 1.0 | 2 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 832. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 33 | 45% | 65 |
| ne.Chimera 1.2 | 15 | 20% | 52 |
| ejb.Polaris 1.0.1 | 12 | 16% | 38 |
| vStar.RAFzilla 2.15 | 6 | 8% | 23 |
| donjezza.Muncho 1.0 | 4 | 5% | 7 |
| sam.Samspin 1.0 | 2 | 3% | 5 |
| tvv.micro.Antares 1.1.1 | 1 | 1% | 15 |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 1% | 1 |
| kurios.DOSexe .9b | 0 | 0% | 4 |

## Melee bench: F11

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 80.5 | 68 / 210 | 2.76 | 16.6% | 26105 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rz.Aleph 0.34 | 1.2 | 17.7% | 89 |
| hadur117.mini.DeiseP200 0.2 | 1.8 | 16.6% | 68 |
| cx.mini.Nimrod 0.55 | 3.0 | 12.4% | 20 |
| djc.DynaBot 0.1.1 | 4.2 | 10.9% | 15 |
| rdt199.Warlord 0.73 | 6.0 | 8.5% | 7 |
| br2.MobyDickBot 1.6 | 6.2 | 8.5% | 5 |
| uji.YellohFellah 1.0 | 6.5 | 8.1% | 8 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.8% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.0% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.9 | 83.8 | 12 / 35 | 4059 |
| 2 | 2 | 65.0 | 79.4 | 9 / 35 | 4366 |
| 3 | 2 | 64.2 | 78.1 | 9 / 35 | 4219 |
| 4 | 2 | 66.7 | 82.9 | 15 / 35 | 4552 |
| 5 | 2 | 65.3 | 79.7 | 12 / 35 | 4377 |
| 6 | 1 | 65.4 | 79.0 | 11 / 35 | 4532 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 63 | 41% |
| cx.mini.Nimrod 0.55 | 19 | 68% |
| djc.DynaBot 0.1.1 | 17 | 71% |
| uji.YellohFellah 1.0 | 8 | 100% |
| rdt199.Warlord 0.73 | 7 | 43% |
| br2.MobyDickBot 1.6 | 4 | 100% |
| KiraNL.Chupacabra 0.4 | 2 | 100% |

Hadur died in 142 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 76 | 54% | 97 |
| cx.mini.Nimrod 0.55 | 29 | 20% | 43 |
| djc.DynaBot 0.1.1 | 10 | 7% | 19 |
| rdt199.Warlord 0.73 | 9 | 6% | 12 |
| KiraNL.Chupacabra 0.4 | 8 | 6% | 10 |
| br2.MobyDickBot 1.6 | 4 | 3% | 14 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 2% | 3 |
| uji.YellohFellah 1.0 | 2 | 1% | 11 |
| stelo.MirrorNano 1.3 | 1 | 1% | 1 |

## Melee bench: F12

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.6 | 97 / 210 | 2.57 | 16.8% | 22924 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 16.8% | 97 |
| bts.wiki.RipCurl 0.9b | 2.0 | 14.4% | 43 |
| darkcanuck.Leon 1.01 | 3.3 | 12.7% | 22 |
| nat.PallasHawk 1.0 | 3.7 | 12.4% | 29 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.3% | 13 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 3 |
| cs.sheldor.Talon 1.1 | 7.2 | 7.1% | 0 |
| jp.Perpy 16.0 | 7.7 | 7.0% | 1 |
| stuff.Vlad 0.1 | 9.3 | 5.7% | 0 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 61.7 | 72.4 | 11 / 35 | 3534 |
| 2 | 1 | 64.0 | 80.0 | 15 / 35 | 3512 |
| 3 | 1 | 67.8 | 87.9 | 20 / 35 | 4271 |
| 4 | 1 | 65.9 | 84.1 | 18 / 35 | 3767 |
| 5 | 1 | 67.3 | 88.3 | 19 / 35 | 3886 |
| 6 | 1 | 65.6 | 82.9 | 14 / 35 | 3954 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 44 | 73% |
| darkcanuck.Leon 1.01 | 34 | 74% |
| nat.PallasHawk 1.0 | 26 | 73% |
| jaybot.bots.Oddball 4.0 | 7 | 86% |
| cs.sheldor.Talon 1.1 | 5 | 100% |
| brainfade.melee.Genghis 0.36 | 4 | 100% |
| jp.Perpy 16.0 | 4 | 100% |
| jrm.Test0 1.0 | 3 | 67% |

Hadur died in 114 of 210 rounds, at a mean tick of 670. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 43 | 38% | 70 |
| nat.PallasHawk 1.0 | 29 | 25% | 53 |
| darkcanuck.Leon 1.01 | 20 | 18% | 52 |
| brainfade.melee.Genghis 0.36 | 12 | 11% | 14 |
| jrm.Test0 1.0 | 5 | 4% | 7 |
| cs.sheldor.Talon 1.1 | 3 | 3% | 5 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 5 |
| jp.Perpy 16.0 | 1 | 1% | 4 |

## Melee bench: F13

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 72.1 | 29 / 210 | 3.51 | 14.0% | 24515 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| ags.Glacier 0.2.11 | 1.3 | 17.6% | 55 |
| mn.Combat 3.25.0 | 1.8 | 16.8% | 96 |
| hadur117.mini.DeiseP200 0.2 | 2.8 | 14.0% | 29 |
| shinh.Entangled 0.3 | 4.5 | 11.8% | 18 |
| gh.micro.Gruweltje 0.7 | 4.5 | 11.6% | 9 |
| apc.Colossus2 0.17 | 6.2 | 8.1% | 1 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 2 |
| ayk.WallHugger 1.0 | 8.2 | 5.4% | 0 |
| maribo.FollowFire 1 | 8.8 | 4.5% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.3 | 70.5 | 3 / 35 | 3988 |
| 2 | 3 | 62.9 | 75.2 | 4 / 35 | 4213 |
| 3 | 3 | 61.7 | 69.5 | 5 / 35 | 4219 |
| 4 | 3 | 61.0 | 67.6 | 4 / 35 | 4086 |
| 5 | 3 | 62.7 | 75.6 | 3 / 35 | 4029 |
| 6 | 2 | 63.0 | 74.0 | 10 / 35 | 3980 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 20 | 35% |
| ags.Glacier 0.2.11 | 20 | 60% |
| shinh.Entangled 0.3 | 7 | 57% |
| stelo.Wang 1.0 | 4 | 100% |
| apc.Colossus2 0.17 | 3 | 67% |
| gh.micro.Gruweltje 0.7 | 2 | 0% |

Hadur died in 181 of 210 rounds, at a mean tick of 682. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ags.Glacier 0.2.11 | 73 | 40% | 87 |
| mn.Combat 3.25.0 | 62 | 34% | 72 |
| shinh.Entangled 0.3 | 18 | 10% | 21 |
| gh.micro.Gruweltje 0.7 | 13 | 7% | 13 |
| stelo.Wang 1.0 | 12 | 7% | 14 |
| maribo.FollowFire 1 | 1 | 1% | 1 |
| apc.Colossus2 0.17 | 1 | 1% | 1 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |

## Melee bench: F14

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.3 | 130 / 210 | 1.88 | 18.9% | 29838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.9% | 130 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.9% | 35 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 33 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.3 | 9.4% | 2 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.4% | 2 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 9.2% | 0 |
| sanyi.mikrobi.Roberto 1.0 | 5.8 | 9.3% | 1 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 8.0% | 9 |
| pa.Improved 1.0 | 9.0 | 5.9% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.7 | 89.2 | 17 / 35 | 4632 |
| 2 | 1 | 68.3 | 89.5 | 18 / 35 | 4858 |
| 3 | 1 | 69.9 | 93.0 | 23 / 35 | 5320 |
| 4 | 1 | 69.0 | 88.6 | 24 / 35 | 5119 |
| 5 | 1 | 69.7 | 93.7 | 25 / 35 | 4924 |
| 6 | 1 | 68.8 | 87.6 | 23 / 35 | 4985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 83 | 86% |
| catcat20.shape.Theta 0.018 | 35 | 71% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 58% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| co.edu.usb.rc.LidisTron 1.0 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 4 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| simonton.micro.Sprout 1.1.3 | 35 | 43% | 106 |
| catcat20.shape.Theta 0.018 | 22 | 27% | 43 |
| sheldor.micro.PointInLineRRAL 1.0 | 13 | 16% | 21 |
| co.edu.usb.rc.LidisTron 1.0 | 6 | 7% | 11 |
| dmh.robocode.robot.RedDwarf 0.4 | 3 | 4% | 4 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 1% | 16 |
| pa.Improved 1.0 | 0 | 0% | 3 |
| Lo_Ian.Gandalf_V4 4.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |
2 death(s) with no robot to name.

## Melee bench: F15

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 81.9 | 94 / 210 | 2.63 | 17.9% | 31862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 17.9% | 94 |
| kawigi.micro.Shiz 1.1 | 2.2 | 14.2% | 31 |
| mld.DustBunny 3.8 | 3.5 | 12.7% | 14 |
| emp.Yngwie 1.11 | 3.5 | 13.0% | 48 |
| cb.nano.Insomnia 1.0 | 5.3 | 9.8% | 6 |
| kawigi.robot.Girl 1.2 | 5.7 | 9.6% | 16 |
| Grystrion.TrackerWO 1.0 | 7.2 | 7.1% | 0 |
| lambdaxy.TBot 0.1 | 7.8 | 6.4% | 0 |
| divineomega.TrialBot 0.003 | 9.2 | 4.8% | 1 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 84.8 | 18 / 35 | 5588 |
| 2 | 1 | 66.3 | 80.0 | 12 / 35 | 5228 |
| 3 | 1 | 66.9 | 80.0 | 14 / 35 | 5262 |
| 4 | 1 | 65.3 | 76.2 | 15 / 35 | 4819 |
| 5 | 1 | 68.4 | 86.7 | 17 / 35 | 5284 |
| 6 | 1 | 68.2 | 83.8 | 18 / 35 | 5681 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| emp.Yngwie 1.11 | 33 | 70% |
| kawigi.micro.Shiz 1.1 | 28 | 89% |
| mld.DustBunny 3.8 | 27 | 85% |
| kawigi.robot.Girl 1.2 | 13 | 77% |
| cb.nano.Insomnia 1.0 | 9 | 100% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 116 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 38 | 33% | 70 |
| mld.DustBunny 3.8 | 21 | 18% | 47 |
| kawigi.micro.Shiz 1.1 | 18 | 16% | 38 |
| kawigi.robot.Girl 1.2 | 14 | 12% | 21 |
| cb.nano.Insomnia 1.0 | 12 | 10% | 13 |
| Grystrion.TrackerWO 1.0 | 7 | 6% | 10 |
| lambdaxy.TBot 0.1 | 5 | 4% | 5 |
| divineomega.TrialBot 0.003 | 1 | 1% | 5 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 87.0 | 100 / 210 | 2.17 | 18.8% | 32685 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.8% | 100 |
| gh.Griezel 0.5.2 | 2.0 | 16.8% | 74 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.6% | 4 |
| bvh.fnr.Fenrir 0.36l | 4.3 | 9.6% | 10 |
| techdude.forest.FlamingForest 1.1 | 5.3 | 9.2% | 15 |
| tvv.nano.Polaris 1.2 | 5.5 | 8.7% | 1 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 7 |
| asd.Cthulhu 1.3 | 8.8 | 5.3% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 83.8 | 16 / 35 | 5142 |
| 2 | 1 | 67.2 | 82.9 | 17 / 35 | 4929 |
| 3 | 1 | 68.1 | 87.6 | 16 / 35 | 5074 |
| 4 | 1 | 69.8 | 88.3 | 18 / 35 | 6007 |
| 5 | 1 | 68.8 | 88.3 | 15 / 35 | 5507 |
| 6 | 1 | 70.7 | 91.1 | 18 / 35 | 6026 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 91 | 47% |
| techdude.forest.FlamingForest 1.1 | 18 | 67% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 18 | 100% |
| bvh.fnr.Fenrir 0.36l | 13 | 85% |
| tvv.nano.Polaris 1.2 | 6 | 100% |
| stelo.IntrinsicVolatility 1.4 | 6 | 83% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 1387. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 53 | 48% | 100 |
| bvh.fnr.Fenrir 0.36l | 19 | 17% | 24 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 12% | 28 |
| stelo.IntrinsicVolatility 1.4 | 12 | 11% | 18 |
| techdude.forest.FlamingForest 1.1 | 8 | 7% | 23 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 3 |
| repositorio.NanoStep 1.0 | 1 | 1% | 2 |
| tvv.nano.Polaris 1.2 | 0 | 0% | 6 |
1 death(s) with no robot to name.

## Melee bench: F17

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 87.7 | 110 / 210 | 2.11 | 18.5% | 29407 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.5% | 110 |
| et.Predator 1.8 | 2.8 | 12.8% | 20 |
| oog.melee.Mercutio 1.0 | 3.7 | 11.9% | 19 |
| cx.BlestPain 1.41 | 3.8 | 12.0% | 36 |
| nic.Nicator 2.4 | 4.5 | 11.2% | 14 |
| ahf.NanoAndrew .4 | 5.2 | 10.4% | 9 |
| maribo.melee.BMV 0.1 | 7.0 | 9.3% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.3 | 5.8% | 0 |
| tex.Longbot 0.4 | 8.7 | 5.4% | 1 |
| goblin.Bender 2.4 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 90.2 | 20 / 35 | 5044 |
| 2 | 1 | 67.6 | 86.7 | 16 / 35 | 4793 |
| 3 | 1 | 68.2 | 87.6 | 20 / 35 | 4827 |
| 4 | 1 | 68.5 | 87.3 | 17 / 35 | 5146 |
| 5 | 1 | 66.5 | 83.5 | 15 / 35 | 4320 |
| 6 | 1 | 69.8 | 90.8 | 22 / 35 | 5277 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 40 | 75% |
| cx.BlestPain 1.41 | 35 | 54% |
| oog.melee.Mercutio 1.0 | 31 | 77% |
| nic.Nicator 2.4 | 26 | 73% |
| ahf.NanoAndrew .4 | 12 | 92% |
| maribo.melee.BMV 0.1 | 5 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1056. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 28 | 27% | 63 |
| cx.BlestPain 1.41 | 27 | 26% | 49 |
| oog.melee.Mercutio 1.0 | 18 | 18% | 39 |
| ahf.NanoAndrew .4 | 12 | 12% | 20 |
| nic.Nicator 2.4 | 11 | 11% | 28 |
| edu.otg.spr.TheTeacher 1.2 | 2 | 2% | 5 |
| maribo.melee.BMV 0.1 | 2 | 2% | 4 |
| tex.Longbot 0.4 | 2 | 2% | 2 |

## Melee bench: F18

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 86.5 | 121 / 210 | 2.22 | 18.2% | 25895 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.2% | 121 |
| morbid.MorbidPriest 1.0 | 2.3 | 12.6% | 21 |
| agd.Mooserwirt2 2.7 | 3.0 | 12.4% | 29 |
| uji.DBH 1.1 | 4.0 | 10.9% | 10 |
| ratosh.Nobo 0.21 | 5.2 | 10.4% | 7 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.6% | 5 |
| sigterm.Sigterm 1.0 | 7.2 | 8.1% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.1% | 4 |
| stelo.WangRobot 1.0 | 9.3 | 5.6% | 3 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.7 | 5.2% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 86.0 | 18 / 35 | 4335 |
| 2 | 1 | 65.5 | 83.2 | 15 / 35 | 4029 |
| 3 | 1 | 68.3 | 88.6 | 24 / 35 | 4291 |
| 4 | 1 | 66.7 | 83.5 | 20 / 35 | 4310 |
| 5 | 1 | 69.0 | 90.5 | 23 / 35 | 4679 |
| 6 | 1 | 67.4 | 87.0 | 21 / 35 | 4251 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 38 | 76% |
| agd.Mooserwirt2 2.7 | 34 | 71% |
| uji.DBH 1.1 | 27 | 89% |
| spinnercat.Robovirus 2.718 | 14 | 93% |
| ratosh.Nobo 0.21 | 13 | 92% |
| sigterm.Sigterm 1.0 | 13 | 69% |
| stelo.WangRobot 1.0 | 8 | 88% |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 67% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 754. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 24 | 27% | 61 |
| agd.Mooserwirt2 2.7 | 15 | 17% | 42 |
| kawigi.mini.Fhqwhgads 1.1 | 12 | 13% | 17 |
| ratosh.Nobo 0.21 | 11 | 12% | 24 |
| sigterm.Sigterm 1.0 | 11 | 12% | 17 |
| uji.DBH 1.1 | 9 | 10% | 19 |
| spinnercat.Robovirus 2.718 | 4 | 4% | 15 |
| stelo.WangRobot 1.0 | 3 | 3% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 4 |

## Melee bench: F19

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 94.0 | 151 / 210 | 1.54 | 20.4% | 32615 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 20.4% | 151 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 15.1% | 30 |
| mld.Infinity 2.2 | 3.0 | 14.0% | 19 |
| erdnis.Rover 0.3 | 4.3 | 10.7% | 2 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.8% | 3 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.7% | 3 |
| pac.ABC 2.1 | 7.3 | 6.8% | 1 |
| mbh.Mbh 0.1 | 7.7 | 6.7% | 0 |
| pbg.R2D2 1.0 | 9.0 | 5.9% | 1 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.0 | 94.3 | 28 / 35 | 5818 |
| 2 | 1 | 71.5 | 95.6 | 27 / 35 | 5269 |
| 3 | 1 | 71.3 | 95.9 | 26 / 35 | 5280 |
| 4 | 1 | 70.2 | 90.8 | 21 / 35 | 5376 |
| 5 | 1 | 71.4 | 94.3 | 26 / 35 | 5342 |
| 6 | 1 | 71.1 | 93.3 | 23 / 35 | 5530 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mld.Infinity 2.2 | 72 | 92% |
| davidalves.net.DuelistMiniMelee 1.2 | 71 | 75% |
| erdnis.Rover 0.3 | 11 | 91% |
| krillr.mini.JointStrike 2.0.0 | 9 | 89% |
| pac.ABC 2.1 | 6 | 100% |
| patson.PatsonTestBot 1.0 | 4 | 75% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 2 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 27 | 46% | 82 |
| krillr.mini.JointStrike 2.0.0 | 11 | 19% | 21 |
| mld.Infinity 2.2 | 10 | 17% | 53 |
| patson.PatsonTestBot 1.0 | 7 | 12% | 17 |
| pbg.R2D2 1.0 | 3 | 5% | 8 |
| erdnis.Rover 0.3 | 1 | 2% | 15 |
| mbh.Mbh 0.1 | 0 | 0% | 6 |
| pac.ABC 2.1 | 0 | 0% | 3 |

## Melee bench: F20

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.6 | 90.8 | 119 / 210 | 1.82 | 19.5% | 31912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 19.5% | 119 |
| trm.Wrekt 1.1.6.f | 2.0 | 16.2% | 53 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 12.2% | 9 |
| fwb.Nine 1.0.1 | 3.8 | 10.7% | 14 |
| catcat20.Rabbit 0.001 | 5.0 | 9.8% | 11 |
| m3thos.mini.Eva01 0.5.5 | 6.0 | 8.1% | 0 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 6.8% | 0 |
| bayen.nut.Squirrel 1.615 | 7.8 | 6.6% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.2 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 89.8 | 19 / 35 | 5188 |
| 2 | 1 | 69.9 | 92.1 | 21 / 35 | 5178 |
| 3 | 1 | 69.5 | 89.8 | 18 / 35 | 5477 |
| 4 | 1 | 70.1 | 90.8 | 19 / 35 | 5732 |
| 5 | 1 | 69.8 | 91.7 | 20 / 35 | 5191 |
| 6 | 1 | 69.4 | 90.8 | 22 / 35 | 5146 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 81 | 58% |
| fwb.Nine 1.0.1 | 32 | 84% |
| catcat20.Rabbit 0.001 | 22 | 82% |
| nz.jdc.nano.GridFu 1.0 | 15 | 93% |
| bayen.nut.Squirrel 1.615 | 7 | 71% |
| m3thos.mini.Eva01 0.5.5 | 6 | 100% |
| sample.MyFirstJuniorRobot 1.0 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 1104. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 57 | 62% | 89 |
| fwb.Nine 1.0.1 | 15 | 16% | 29 |
| catcat20.Rabbit 0.001 | 10 | 11% | 35 |
| bayen.nut.Squirrel 1.615 | 5 | 5% | 11 |
| nz.jdc.nano.GridFu 1.0 | 4 | 4% | 29 |
| sample.MyFirstJuniorRobot 1.0 | 1 | 1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 8 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 1 |
| ntc.ControlledChaos 1.1.4 | 0 | 0% | 1 |

## Melee bench: F21

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 92.5 | 128 / 210 | 1.67 | 20.0% | 33227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 20.0% | 128 |
| eem.EvBot v4.6.16 | 2.0 | 15.9% | 64 |
| dummy.mini.Scimitar 1.01 | 3.2 | 13.8% | 10 |
| cf.RiO.RiOx 4.2.1 | 3.8 | 11.4% | 3 |
| eld.Hmm 1.0 | 5.3 | 8.2% | 4 |
| oa.weak.BotherBot 0.1 | 5.7 | 8.2% | 1 |
| fire219.CatBot 1.0 | 7.5 | 6.8% | 0 |
| el.JumpShoot 0.2 | 8.2 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 9.7 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.0 | 19 / 35 | 5396 |
| 2 | 1 | 70.4 | 92.4 | 19 / 35 | 5552 |
| 3 | 1 | 69.8 | 89.8 | 22 / 35 | 5363 |
| 4 | 1 | 71.4 | 95.6 | 25 / 35 | 5591 |
| 5 | 1 | 70.7 | 93.0 | 25 / 35 | 5571 |
| 6 | 1 | 70.1 | 91.4 | 18 / 35 | 5754 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 98 | 58% |
| dummy.mini.Scimitar 1.01 | 32 | 94% |
| cf.RiO.RiOx 4.2.1 | 22 | 95% |
| eld.Hmm 1.0 | 14 | 86% |
| el.JumpShoot 0.2 | 4 | 100% |
| oa.weak.BotherBot 0.1 | 4 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1239. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 47 | 57% | 95 |
| dummy.mini.Scimitar 1.01 | 22 | 27% | 55 |
| cf.RiO.RiOx 4.2.1 | 8 | 10% | 20 |
| eld.Hmm 1.0 | 2 | 2% | 22 |
| arthord.MannyPacquiao Beta | 1 | 1% | 3 |
| PSW.Relentless 0.1 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 0 |
| oa.weak.BotherBot 0.1 | 0 | 0% | 7 |
| el.JumpShoot 0.2 | 0 | 0% | 4 |

## Melee bench: F22

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.1 | 83 / 210 | 2.34 | 17.2% | 27271 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.3 | 17.2% | 83 |
| pe.SandboxDT 2.71m | 1.8 | 16.7% | 71 |
| kvk.HebusLeTroll 0.35 | 2.8 | 15.1% | 39 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.2% | 14 |
| bigpete.Stewie 1.0 | 5.0 | 10.6% | 3 |
| yk.JahRoslav 1.1 | 6.7 | 6.8% | 0 |
| tad.Dalek98 0.98 | 6.8 | 7.0% | 1 |
| gg.Squaraus 0.6 | 7.5 | 6.7% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.6% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.3 | 19 / 35 | 4767 |
| 2 | 1 | 67.5 | 86.7 | 13 / 35 | 4681 |
| 3 | 2 | 65.7 | 82.2 | 9 / 35 | 4442 |
| 4 | 1 | 67.3 | 86.7 | 12 / 35 | 4662 |
| 5 | 1 | 67.9 | 87.6 | 17 / 35 | 4525 |
| 6 | 2 | 65.9 | 81.3 | 13 / 35 | 4194 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxDT 2.71m | 54 | 30% |
| kvk.HebusLeTroll 0.35 | 42 | 69% |
| jlm.javaDisturbance 0.59 | 29 | 79% |
| bigpete.Stewie 1.0 | 11 | 100% |
| yk.JahRoslav 1.1 | 2 | 100% |
| tad.Dalek98 0.98 | 1 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 129 of 210 rounds, at a mean tick of 969. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 50 | 39% | 70 |
| kvk.HebusLeTroll 0.35 | 40 | 31% | 64 |
| jlm.javaDisturbance 0.59 | 16 | 12% | 38 |
| tad.Dalek98 0.98 | 13 | 10% | 14 |
| bigpete.Stewie 1.0 | 6 | 5% | 14 |
| gg.Squaraus 0.6 | 1 | 1% | 4 |
| pbg.NinjaX 1.2 | 1 | 1% | 4 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 1 |
| yk.JahRoslav 1.1 | 1 | 1% | 1 |

## Melee bench: F23

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.0 | 97 / 210 | 2.17 | 18.6% | 30847 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.2 | 18.6% | 97 |
| pe.SandboxLump 1.52 | 1.8 | 17.2% | 76 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 24 |
| stelo.AreaTargetingBot 1.1 | 4.0 | 11.4% | 7 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.4% | 3 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.4% | 1 |
| sample.Walls 1.0 | 8.0 | 7.4% | 1 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.6 | 83.5 | 13 / 35 | 4942 |
| 2 | 1 | 69.5 | 86.7 | 19 / 35 | 4986 |
| 3 | 1 | 69.1 | 84.8 | 12 / 35 | 5639 |
| 4 | 1 | 70.4 | 93.7 | 19 / 35 | 5335 |
| 5 | 2 | 69.0 | 84.1 | 15 / 35 | 5097 |
| 6 | 1 | 69.7 | 89.2 | 19 / 35 | 4848 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 84 | 46% |
| cre.Karolos 0.32 | 28 | 68% |
| stelo.AreaTargetingBot 1.1 | 20 | 95% |
| stelo.RamTrackSurfer 1.2 | 11 | 100% |
| sample.Walls 1.0 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 72 | 64% | 107 |
| cre.Karolos 0.32 | 16 | 14% | 34 |
| stelo.AreaTargetingBot 1.1 | 12 | 11% | 27 |
| stelo.RamTrackSurfer 1.2 | 8 | 7% | 26 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 3 | 3% | 9 |
| sample.Walls 1.0 | 1 | 1% | 5 |
| cw.megas.Blade 0.8 | 1 | 1% | 2 |

## Melee bench: F24

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 75.4 | 59 / 210 | 3.21 | 14.8% | 21122 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 2.0 | 14.8% | 59 |
| rz.GlowBlowMelee 1.4 | 2.0 | 14.5% | 42 |
| florent.XSeries.X2 0.12 | 2.2 | 14.3% | 43 |
| davidalves.Phoenix 0.54 | 4.0 | 12.5% | 30 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.2% | 22 |
| oog.melee.Corsair 1.0 | 6.2 | 9.0% | 7 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.6% | 4 |
| lunchie.Lunchbox 0.93 | 7.8 | 6.9% | 3 |
| as.FrankTheTank 1.3 | 9.2 | 4.9% | 0 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 77.8 | 15 / 35 | 3466 |
| 2 | 1 | 65.4 | 81.9 | 12 / 35 | 4078 |
| 3 | 3 | 59.4 | 67.9 | 6 / 35 | 3272 |
| 4 | 3 | 61.7 | 73.3 | 9 / 35 | 3404 |
| 5 | 3 | 59.7 | 68.9 | 6 / 35 | 3190 |
| 6 | 1 | 64.7 | 82.5 | 11 / 35 | 3712 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 29 | 66% |
| florent.XSeries.X2 0.12 | 24 | 46% |
| davidalves.Phoenix 0.54 | 17 | 47% |
| pedersen.Ugluk 1.1.1 | 13 | 69% |
| stelo.SoJNanoMelee 1.1 | 8 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 67% |
| oog.melee.Corsair 1.0 | 3 | 67% |

Hadur died in 152 of 210 rounds, at a mean tick of 720. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 46 | 30% | 57 |
| rz.GlowBlowMelee 1.4 | 33 | 22% | 52 |
| pedersen.Ugluk 1.1.1 | 28 | 18% | 35 |
| davidalves.Phoenix 0.54 | 25 | 16% | 32 |
| lunchie.Lunchbox 0.93 | 6 | 4% | 11 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 9 |
| oog.melee.Corsair 1.0 | 4 | 3% | 7 |
| evd.X1 0.01 | 4 | 3% | 4 |

## Melee bench: F25

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.9 | 124 / 210 | 2.18 | 18.4% | 24990 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.4% | 124 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.8% | 29 |
| voidious.micro.BlitzBat 1.05 | 3.3 | 12.5% | 12 |
| jdw.Hurricane 1.4 | 3.5 | 11.8% | 25 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 9.1% | 9 |
| ds.Oo 2.2 | 6.2 | 8.8% | 5 |
| adt.Ar2 1.1 | 7.3 | 7.1% | 3 |
| awesomeness.Elite 1.0 | 7.7 | 7.1% | 3 |
| gjr.Cephalosporin 0.1 | 8.3 | 6.9% | 0 |
| amk.ChumbaMini 0.2 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 87.6 | 24 / 35 | 4114 |
| 2 | 1 | 68.6 | 90.2 | 21 / 35 | 4326 |
| 3 | 1 | 67.5 | 86.3 | 23 / 35 | 4069 |
| 4 | 1 | 66.4 | 82.9 | 17 / 35 | 4032 |
| 5 | 1 | 68.8 | 88.9 | 21 / 35 | 4358 |
| 6 | 1 | 66.9 | 85.4 | 18 / 35 | 4091 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.micro.BlitzBat 1.05 | 42 | 93% |
| voidious.mini.BrokenSword 2.0.3 | 41 | 78% |
| jdw.Hurricane 1.4 | 26 | 85% |
| ds.Oo 2.2 | 12 | 75% |
| gjr.Cephalosporin 0.1 | 9 | 100% |
| awesomeness.Elite 1.0 | 8 | 75% |
| gre.svman4.Morfeas 1.4.1 | 5 | 60% |
| adt.Ar2 1.1 | 4 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 660. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 28 | 33% | 59 |
| jdw.Hurricane 1.4 | 27 | 31% | 42 |
| voidious.micro.BlitzBat 1.05 | 12 | 14% | 47 |
| adt.Ar2 1.1 | 7 | 8% | 11 |
| awesomeness.Elite 1.0 | 5 | 6% | 12 |
| ds.Oo 2.2 | 4 | 5% | 14 |
| gre.svman4.Morfeas 1.4.1 | 3 | 3% | 14 |
| gjr.Cephalosporin 0.1 | 0 | 0% | 10 |

## Melee bench: F26

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 88.4 | 118 / 210 | 2.04 | 18.7% | 31877 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.7% | 118 |
| ak.Fermat 2.0 | 2.2 | 15.1% | 47 |
| shu.nitro.LENIN .T34 | 2.8 | 12.3% | 27 |
| lrem.Spectre 0.4.4 | 4.3 | 11.1% | 8 |
| js.PinBall 1.6 | 5.2 | 10.6% | 4 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 10.1% | 1 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.6% | 5 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.1% | 0 |
| sample.SpinBot 1.0 | 9.0 | 4.9% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.5 | 17 / 35 | 5070 |
| 2 | 1 | 69.3 | 87.6 | 19 / 35 | 5582 |
| 3 | 1 | 69.6 | 89.2 | 23 / 35 | 5414 |
| 4 | 1 | 68.3 | 85.7 | 18 / 35 | 5363 |
| 5 | 1 | 68.9 | 87.3 | 18 / 35 | 5446 |
| 6 | 1 | 69.6 | 91.1 | 23 / 35 | 5002 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 53 | 68% |
| shu.nitro.LENIN .T34 | 40 | 85% |
| lrem.Spectre 0.4.4 | 24 | 79% |
| js.PinBall 1.6 | 14 | 86% |
| gh.mini.GrubbmOne 1.0 | 10 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 6 | 83% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 906. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 43 | 47% | 78 |
| shu.nitro.LENIN .T34 | 20 | 22% | 57 |
| js.PinBall 1.6 | 9 | 10% | 18 |
| lrem.Spectre 0.4.4 | 8 | 9% | 27 |
| jaybot.adv.bots.JayBot 2.0 | 5 | 5% | 9 |
| gh.mini.GrubbmOne 1.0 | 3 | 3% | 12 |
| fullsail.LaxativeTeaTwo 1.0 | 3 | 3% | 5 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |

## Melee bench: F27

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.0 | 116 / 210 | 2.53 | 17.7% | 26756 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 17.7% | 116 |
| mk.Alpha 0.2.1 | 2.3 | 14.2% | 51 |
| wee.Gem 1.8.4 | 3.5 | 11.2% | 12 |
| EH.Eagle 1.0.6 | 4.3 | 10.2% | 7 |
| sheldor.melee.nano.TestMelee 0.1 | 4.8 | 10.1% | 12 |
| joe.ADinosaur 1.0 | 6.0 | 9.2% | 3 |
| techdude.kombat.FlamingKombat 1.5 | 7.0 | 8.4% | 3 |
| throxbot.ThroxBot 0.1 | 7.5 | 8.1% | 3 |
| caimano.Furia_Ceca 0.22 | 8.5 | 7.2% | 3 |
| cs.Grudge 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.4 | 84.1 | 20 / 35 | 4156 |
| 2 | 1 | 68.6 | 89.5 | 23 / 35 | 4474 |
| 3 | 1 | 65.9 | 82.9 | 19 / 35 | 4089 |
| 4 | 1 | 68.0 | 88.6 | 22 / 35 | 4444 |
| 5 | 1 | 67.4 | 87.0 | 20 / 35 | 4445 |
| 6 | 1 | 63.8 | 66.0 | 12 / 35 | 5148 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 68 | 78% |
| wee.Gem 1.8.4 | 25 | 96% |
| sheldor.melee.nano.TestMelee 0.1 | 15 | 67% |
| EH.Eagle 1.0.6 | 10 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 9 | 89% |
| joe.ADinosaur 1.0 | 6 | 83% |
| throxbot.ThroxBot 0.1 | 4 | 100% |
| caimano.Furia_Ceca 0.22 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 697. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 36 | 37% | 78 |
| joe.ADinosaur 1.0 | 13 | 13% | 17 |
| sheldor.melee.nano.TestMelee 0.1 | 11 | 11% | 21 |
| throxbot.ThroxBot 0.1 | 10 | 10% | 13 |
| caimano.Furia_Ceca 0.22 | 8 | 8% | 12 |
| wee.Gem 1.8.4 | 7 | 7% | 35 |
| EH.Eagle 1.0.6 | 5 | 5% | 18 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 5% | 14 |
| cs.Grudge 1.0 | 2 | 2% | 2 |

## Melee bench: F28

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.3 | 87.2 | 122 / 210 | 2.15 | 18.1% | 24779 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.1% | 122 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 52 |
| uji.Antique 1.0 | 3.7 | 11.1% | 11 |
| qohnil.blot.BlotBot 3.61 | 3.8 | 10.8% | 15 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 4 |
| amk.ChumbaWumba 0.3 | 6.5 | 7.8% | 0 |
| ahr.ice.Ice 1.0.2 | 6.7 | 8.1% | 3 |
| stelo.PianistNano 1.2 | 8.5 | 6.4% | 1 |
| matt.advanced.Katana 1.0 | 9.0 | 6.3% | 2 |
| stelo.Lifestealer 1.0 | 9.3 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 90.5 | 24 / 35 | 4099 |
| 2 | 1 | 67.1 | 86.0 | 22 / 35 | 4097 |
| 3 | 1 | 67.6 | 87.3 | 20 / 35 | 4476 |
| 4 | 1 | 65.5 | 83.5 | 18 / 35 | 3929 |
| 5 | 1 | 68.0 | 88.9 | 19 / 35 | 4333 |
| 6 | 1 | 66.8 | 87.3 | 19 / 35 | 3845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 84 | 62% |
| uji.Antique 1.0 | 33 | 97% |
| qohnil.blot.BlotBot 3.61 | 16 | 56% |
| amk.ChumbaWumba 0.3 | 12 | 100% |
| pfvicm.Sobieski 7.2.3b | 8 | 88% |
| stelo.PianistNano 1.2 | 5 | 80% |
| ahr.ice.Ice 1.0.2 | 4 | 50% |
| matt.advanced.Katana 1.0 | 3 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 41 | 46% | 90 |
| pfvicm.Sobieski 7.2.3b | 15 | 17% | 28 |
| qohnil.blot.BlotBot 3.61 | 11 | 12% | 25 |
| amk.ChumbaWumba 0.3 | 8 | 9% | 15 |
| uji.Antique 1.0 | 6 | 7% | 29 |
| ahr.ice.Ice 1.0.2 | 4 | 4% | 9 |
| matt.advanced.Katana 1.0 | 2 | 2% | 7 |
| stelo.PianistNano 1.2 | 1 | 1% | 3 |
| stelo.Lifestealer 1.0 | 1 | 1% | 3 |

## Melee bench: F29

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 80.2 | 94 / 210 | 2.79 | 17.1% | 26184 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.2 | 17.1% | 94 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.0% | 62 |
| deewiant.Anomaly 0.2 | 2.8 | 13.7% | 30 |
| myl.micro.Troodon 1.10 | 4.0 | 12.3% | 12 |
| jok.PheonixM 0.1.2 | 4.8 | 10.3% | 8 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.4% | 0 |
| DBall.Anarchy 0.1 | 7.3 | 7.2% | 5 |
| fullsail.TimbotNoPrediction 1.0 | 8.2 | 6.0% | 0 |
| ap.Frederick 1.1 | 8.3 | 5.4% | 1 |
| jangs.ns51 1.0 | 10.0 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 20 / 35 | 4943 |
| 2 | 2 | 61.4 | 67.6 | 9 / 35 | 3929 |
| 3 | 1 | 68.2 | 86.7 | 18 / 35 | 4531 |
| 4 | 1 | 66.3 | 81.0 | 16 / 35 | 4225 |
| 5 | 1 | 66.0 | 78.4 | 15 / 35 | 4303 |
| 6 | 1 | 65.6 | 78.7 | 16 / 35 | 4253 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 46 | 74% |
| zyx.mega.YersiniaPestis 3.1 | 35 | 57% |
| myl.micro.Troodon 1.10 | 16 | 100% |
| jok.PheonixM 0.1.2 | 13 | 69% |
| DBall.Anarchy 0.1 | 11 | 100% |
| ap.Frederick 1.1 | 3 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 118 of 210 rounds, at a mean tick of 808. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 33 | 28% | 50 |
| deewiant.Anomaly 0.2 | 28 | 24% | 62 |
| jok.PheonixM 0.1.2 | 18 | 15% | 22 |
| ph.melee.ArcherME 0.3 | 16 | 14% | 19 |
| myl.micro.Troodon 1.10 | 13 | 11% | 31 |
| jangs.ns51 1.0 | 4 | 3% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 4 | 3% | 4 |
| DBall.Anarchy 0.1 | 1 | 1% | 15 |
1 death(s) with no robot to name.

## Melee bench: F30

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.3 | 73.3 | 44 / 210 | 3.40 | 14.7% | 23610 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.5 | 14.7% | 44 |
| oog.melee.Capulet 1.2 | 2.7 | 13.6% | 36 |
| catcat20.Matcha 0.006 | 3.0 | 13.5% | 50 |
| darkcanuck.B26354 1.06 | 3.3 | 13.4% | 46 |
| stelo.PastFuture 2.3.2 | 4.5 | 12.5% | 19 |
| intruder.PrairieWolf 2.61 | 6.0 | 8.3% | 7 |
| fowl3628800.LightningBolt 2.6.0 | 7.7 | 7.5% | 3 |
| tripphippy.Alice 1.1 | 8.2 | 7.1% | 5 |
| ntc.Opposite 1.5 | 8.2 | 6.9% | 0 |
| GarmBox.Anger 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 61.6 | 70.5 | 5 / 35 | 4193 |
| 2 | 2 | 61.4 | 71.7 | 5 / 35 | 3785 |
| 3 | 1 | 64.8 | 80.3 | 13 / 35 | 3956 |
| 4 | 2 | 60.6 | 68.9 | 6 / 35 | 3789 |
| 5 | 1 | 63.4 | 75.9 | 9 / 35 | 3966 |
| 6 | 1 | 61.8 | 72.4 | 6 / 35 | 3921 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| oog.melee.Capulet 1.2 | 27 | 63% |
| darkcanuck.B26354 1.06 | 22 | 27% |
| catcat20.Matcha 0.006 | 16 | 38% |
| stelo.PastFuture 2.3.2 | 9 | 56% |
| tripphippy.Alice 1.1 | 5 | 40% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| fowl3628800.LightningBolt 2.6.0 | 4 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 827. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 42 | 25% | 49 |
| darkcanuck.B26354 1.06 | 36 | 22% | 42 |
| stelo.PastFuture 2.3.2 | 29 | 17% | 32 |
| oog.melee.Capulet 1.2 | 25 | 15% | 47 |
| tripphippy.Alice 1.1 | 13 | 8% | 15 |
| fowl3628800.LightningBolt 2.6.0 | 8 | 5% | 9 |
| intruder.PrairieWolf 2.61 | 7 | 4% | 10 |
| ntc.Opposite 1.5 | 6 | 4% | 6 |

## Melee bench: F31

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.1 | 74.9 | 40 / 210 | 3.26 | 14.4% | 20001 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.0 | 18.3% | 112 |
| hadur117.mini.DeiseP200 0.2 | 2.2 | 14.4% | 40 |
| gh.mini.Griezel 0.2 | 3.3 | 12.7% | 28 |
| spinnercat.micro.Tyger 0.1 | 4.0 | 11.9% | 13 |
| d414.nano.Quantum 1.0.0 | 4.7 | 11.3% | 13 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.4% | 5 |
| fm.mammillarias 1.3 | 7.5 | 6.3% | 0 |
| timmit.nano.TimDog 0.33 | 7.8 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.3 | 4.8% | 0 |
| tlp.ThreeLeggedPig 1 | 9.3 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 68.6 | 4 / 35 | 3237 |
| 2 | 2 | 62.7 | 75.6 | 8 / 35 | 3399 |
| 3 | 2 | 63.9 | 79.7 | 8 / 35 | 3642 |
| 4 | 2 | 61.8 | 72.7 | 8 / 35 | 3189 |
| 5 | 2 | 61.9 | 74.6 | 8 / 35 | 3236 |
| 6 | 2 | 62.5 | 78.4 | 4 / 35 | 3298 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 49 | 22% |
| gh.mini.Griezel 0.2 | 16 | 63% |
| spinnercat.micro.Tyger 0.1 | 11 | 91% |
| d414.nano.Quantum 1.0.0 | 7 | 57% |
| gh.nano.Grofvuil 0.2 | 3 | 67% |
| fm.mammillarias 1.3 | 2 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 170 of 210 rounds, at a mean tick of 771. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 85 | 50% | 95 |
| spinnercat.micro.Tyger 0.1 | 32 | 19% | 41 |
| gh.mini.Griezel 0.2 | 17 | 10% | 28 |
| d414.nano.Quantum 1.0.0 | 16 | 9% | 20 |
| fm.mammillarias 1.3 | 7 | 4% | 8 |
| gh.nano.Grofvuil 0.2 | 6 | 4% | 10 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 3 | 2% | 2 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 2 |

## Melee bench: F32

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 87.7 | 124 / 210 | 2.10 | 18.3% | 27403 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.3% | 124 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 50 |
| apc.botM 3.0 | 3.5 | 11.3% | 16 |
| lxx.ConceptA 0.8 | 4.0 | 10.8% | 2 |
| vjik.UnViolation 1.1 | 5.0 | 9.8% | 8 |
| bayen.UbaMicro 1.4 | 5.5 | 9.1% | 3 |
| panzer.Panzer 0.2 | 7.5 | 7.3% | 1 |
| yk.JahMicro 1.0 | 7.8 | 7.1% | 5 |
| conscience.Electron 1.3g | 9.0 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.7 | 5.6% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 87.6 | 20 / 35 | 4856 |
| 2 | 1 | 67.0 | 88.3 | 21 / 35 | 4359 |
| 3 | 1 | 65.2 | 81.0 | 18 / 35 | 4271 |
| 4 | 1 | 68.8 | 91.1 | 23 / 35 | 4666 |
| 5 | 1 | 69.1 | 92.4 | 23 / 35 | 4894 |
| 6 | 1 | 66.8 | 86.0 | 19 / 35 | 4357 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 69 | 62% |
| apc.botM 3.0 | 24 | 75% |
| lxx.ConceptA 0.8 | 24 | 100% |
| vjik.UnViolation 1.1 | 14 | 100% |
| bayen.UbaMicro 1.4 | 13 | 85% |
| yk.JahMicro 1.0 | 7 | 71% |
| panzer.Panzer 0.2 | 5 | 80% |
| donjezza.Jezza 1.0 | 4 | 100% |
| conscience.Electron 1.3g | 1 | 100% |

Hadur died in 87 of 210 rounds, at a mean tick of 730. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 41 | 47% | 90 |
| lxx.ConceptA 0.8 | 18 | 21% | 26 |
| apc.botM 3.0 | 9 | 10% | 31 |
| bayen.UbaMicro 1.4 | 6 | 7% | 16 |
| vjik.UnViolation 1.1 | 4 | 5% | 24 |
| conscience.Electron 1.3g | 3 | 3% | 5 |
| panzer.Panzer 0.2 | 3 | 3% | 3 |
| yk.JahMicro 1.0 | 2 | 2% | 10 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |

## Melee bench: F33

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 86.1 | 118 / 210 | 2.25 | 18.8% | 29770 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.8% | 118 |
| maribo.Quester 0.3 | 2.0 | 15.6% | 37 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.4% | 25 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.3% | 12 |
| labg.Cataclysm 2.05 | 4.5 | 10.8% | 10 |
| baal.nano.N 1.42 | 6.0 | 8.9% | 4 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 7.8% | 4 |
| sanja.First 0.1 | 8.5 | 5.0% | 0 |
| zyx.micro.Ant 1.1 | 8.5 | 5.6% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.7 | 16 / 35 | 5109 |
| 2 | 1 | 67.7 | 83.2 | 18 / 35 | 4652 |
| 3 | 1 | 67.4 | 80.0 | 19 / 35 | 4744 |
| 4 | 1 | 69.9 | 88.6 | 23 / 35 | 5137 |
| 5 | 1 | 68.4 | 87.0 | 17 / 35 | 4876 |
| 6 | 1 | 71.3 | 92.1 | 25 / 35 | 5252 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 64 | 72% |
| gre.svman4.Leonidas 1.3.2 | 38 | 97% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 30 | 60% |
| labg.Cataclysm 2.05 | 16 | 75% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| sanja.First 0.1 | 1 | 100% |

Hadur died in 94 of 210 rounds, at a mean tick of 941. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 34 | 36% | 76 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 17% | 43 |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 10% | 13 |
| gre.svman4.Leonidas 1.3.2 | 8 | 9% | 32 |
| labg.Cataclysm 2.05 | 8 | 9% | 22 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 7 | 7% | 9 |
| zyx.micro.Ant 1.1 | 7 | 7% | 7 |
| baal.nano.N 1.42 | 5 | 5% | 7 |
| sanja.First 0.1 | 0 | 0% | 1 |

## Melee bench: F34

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.2 | 66 / 210 | 2.51 | 16.9% | 27585 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 2.0 | 16.9% | 66 |
| stelo.Spread 0.9 | 2.0 | 16.4% | 73 |
| kid.Gladiator .7.2 | 2.0 | 16.4% | 49 |
| tcf.Reach 3 | 4.5 | 11.1% | 5 |
| jcs.Seth 1.8 | 4.8 | 10.8% | 15 |
| cli.Dancer 1.1 | 5.7 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.3% | 1 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.4% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 87.6 | 10 / 35 | 4720 |
| 2 | 2 | 66.9 | 84.8 | 8 / 35 | 4658 |
| 3 | 2 | 68.0 | 85.7 | 12 / 35 | 4809 |
| 4 | 1 | 66.6 | 80.0 | 13 / 35 | 4742 |
| 5 | 3 | 65.4 | 80.0 | 11 / 35 | 4419 |
| 6 | 3 | 66.0 | 81.3 | 12 / 35 | 4237 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 59 | 44% |
| kid.Gladiator .7.2 | 41 | 56% |
| jcs.Seth 1.8 | 12 | 67% |
| tcf.Reach 3 | 9 | 89% |
| sample.VelociRobot 1.0 | 1 | 100% |

Hadur died in 144 of 210 rounds, at a mean tick of 973. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.Gladiator .7.2 | 56 | 39% | 78 |
| stelo.Spread 0.9 | 56 | 39% | 77 |
| tcf.Reach 3 | 9 | 6% | 20 |
| jcs.Seth 1.8 | 9 | 6% | 19 |
| cli.Dancer 1.1 | 6 | 4% | 7 |
| ratosh.Wesco 1.4 | 5 | 3% | 5 |
| amk.Punbot.Punbot 0.01 | 2 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |

## Melee bench: F35

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 75.6 | 22 / 210 | 3.20 | 14.1% | 19982 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 148 |
| hadur117.mini.DeiseP200 0.2 | 2.2 | 14.1% | 22 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.8% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 11.9% | 11 |
| rz.HawkOnFire 0.1 | 4.5 | 12.1% | 9 |
| myl.nano.KomoriNinja 1.1 | 6.0 | 7.6% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.4% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.3 | 5.6% | 0 |
| stelo.MyAgileRobot 0.2 | 9.3 | 4.8% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 64.6 | 81.6 | 10 / 35 | 3635 |
| 2 | 2 | 61.0 | 73.7 | 0 / 35 | 3382 |
| 3 | 2 | 63.4 | 79.7 | 3 / 35 | 3521 |
| 4 | 2 | 60.7 | 74.3 | 2 / 35 | 3016 |
| 5 | 2 | 61.7 | 73.3 | 7 / 35 | 3377 |
| 6 | 3 | 59.0 | 70.8 | 0 / 35 | 3051 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 32 | 3% |
| rz.HawkOnFire 0.1 | 15 | 67% |
| gh.mini.Gruwel 0.9 | 11 | 45% |
| dmh.robocode.robot.BlackDeath 9.2 | 9 | 44% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |
| wit.Chuliath 1.0 | 1 | 100% |

Hadur died in 188 of 210 rounds, at a mean tick of 743. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 108 | 57% | 109 |
| rz.HawkOnFire 0.1 | 29 | 15% | 36 |
| gh.mini.Gruwel 0.9 | 24 | 13% | 30 |
| dmh.robocode.robot.BlackDeath 9.2 | 18 | 10% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 4 | 2% | 5 |
| stelo.MyAgileRobot 0.2 | 3 | 2% | 3 |
| wit.Chuliath 1.0 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 2 |

## Melee bench: F36

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 95.4 | 176 / 210 | 1.41 | 21.4% | 32695 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 21.4% | 176 |
| alpha.RainingFire 1.0 | 2.8 | 11.8% | 11 |
| bzdp.Pansy 2.1 | 3.2 | 11.8% | 3 |
| bvh.micro.Freya 0.3 | 4.8 | 10.3% | 5 |
| bvh.mini.Fenrir 0.39 | 5.2 | 9.8% | 6 |
| mz.Cork 0.1 | 5.3 | 9.8% | 3 |
| m3thos.Eva02 0.7.1 | 5.7 | 9.5% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.5 | 5.9% | 0 |
| dl.BetterWalls 1.0 | 8.7 | 5.6% | 2 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 94.9 | 30 / 35 | 5735 |
| 2 | 1 | 71.8 | 97.5 | 32 / 35 | 5075 |
| 3 | 1 | 72.2 | 97.5 | 31 / 35 | 5548 |
| 4 | 1 | 71.6 | 95.9 | 29 / 35 | 5210 |
| 5 | 1 | 71.0 | 93.7 | 26 / 35 | 5467 |
| 6 | 1 | 71.5 | 93.0 | 28 / 35 | 5660 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 54 | 98% |
| bvh.micro.Freya 0.3 | 36 | 92% |
| mz.Cork 0.1 | 29 | 93% |
| alpha.RainingFire 1.0 | 24 | 83% |
| bvh.mini.Fenrir 0.39 | 24 | 92% |
| m3thos.Eva02 0.7.1 | 11 | 82% |
| sample.MyFirstRobot 1.0 | 8 | 100% |
| dl.BetterWalls 1.0 | 2 | 100% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |

Hadur died in 34 of 210 rounds, at a mean tick of 804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 12 | 35% | 38 |
| bzdp.Pansy 2.1 | 7 | 21% | 64 |
| m3thos.Eva02 0.7.1 | 5 | 15% | 19 |
| bvh.micro.Freya 0.3 | 3 | 9% | 22 |
| dl.BetterWalls 1.0 | 3 | 9% | 14 |
| mz.Cork 0.1 | 2 | 6% | 22 |
| bvh.mini.Fenrir 0.39 | 2 | 6% | 17 |
| sample.MyFirstRobot 1.0 | 0 | 0% | 11 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 86.1 | 137 / 210 | 2.25 | 18.2% | 30420 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.2% | 137 |
| germ.TheMind .2 | 2.0 | 11.9% | 24 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.5 | 10.3% | 9 |
| EBBU.Sim2 1.02 | 4.2 | 10.1% | 9 |
| skm.Ryubot 1.0 | 6.3 | 8.4% | 6 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.7% | 7 |
| agrach.Dalek 1.0 | 7.5 | 8.2% | 5 |
| mb.Beast 0.1 | 7.7 | 8.1% | 9 |
| lmk.ACPFinal 0.1 | 7.8 | 8.2% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 8.7 | 7.9% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.2 | 82.5 | 21 / 35 | 5522 |
| 2 | 1 | 66.6 | 85.7 | 21 / 35 | 5079 |
| 3 | 1 | 67.1 | 88.9 | 24 / 35 | 4822 |
| 4 | 1 | 67.8 | 91.1 | 26 / 35 | 4732 |
| 5 | 1 | 66.4 | 84.1 | 22 / 35 | 5082 |
| 6 | 1 | 66.8 | 84.1 | 23 / 35 | 5183 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 45 | 91% |
| com.syncleus.robocode.Dreadnaught 0.1 | 23 | 96% |
| EBBU.Sim2 1.02 | 17 | 82% |
| skm.Ryubot 1.0 | 15 | 87% |
| mb.Beast 0.1 | 15 | 100% |
| stelo.UntouchableNano 1.3 | 12 | 92% |
| agrach.Dalek 1.0 | 11 | 100% |
| lmk.ACPFinal 0.1 | 7 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 467. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 27 | 36% | 58 |
| EBBU.Sim2 1.02 | 11 | 15% | 23 |
| stelo.UntouchableNano 1.3 | 8 | 11% | 21 |
| com.syncleus.robocode.Dreadnaught 0.1 | 6 | 8% | 31 |
| mb.Beast 0.1 | 6 | 8% | 27 |
| lmk.ACPFinal 0.1 | 6 | 8% | 17 |
| skm.Ryubot 1.0 | 4 | 5% | 15 |
| mn.nano.perceptual.Impact 1.3.0 | 4 | 5% | 3 |
| agrach.Dalek 1.0 | 3 | 4% | 13 |

## Melee bench: F38

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.9 | 81.3 | 68 / 210 | 2.69 | 16.2% | 24968 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.5 | 16.2% | 68 |
| justin.Mallais 14.0 | 1.5 | 16.0% | 75 |
| bvh.mini.Freya 0.55 | 3.0 | 13.1% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.0 | 10.1% | 6 |
| cs.Wren 1.0 | 5.2 | 10.5% | 13 |
| kdf.KoulDestroyer 1.0 | 5.8 | 9.4% | 4 |
| bts.mega.Gnarly 1.4 | 6.0 | 9.7% | 17 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.8% | 4 |
| bzdp.BoxCar 2.0 | 9.5 | 4.1% | 0 |
| matt.UnderDark3 2.4.34 | 9.5 | 4.1% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.7 | 85.7 | 14 / 35 | 4192 |
| 2 | 2 | 63.3 | 77.1 | 7 / 35 | 4195 |
| 3 | 2 | 63.3 | 77.1 | 8 / 35 | 3893 |
| 4 | 1 | 65.6 | 85.4 | 14 / 35 | 4267 |
| 5 | 2 | 64.3 | 78.1 | 12 / 35 | 4133 |
| 6 | 1 | 66.5 | 84.1 | 13 / 35 | 4288 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 46 | 43% |
| bvh.mini.Freya 0.55 | 23 | 65% |
| cs.Wren 1.0 | 20 | 65% |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 77% |
| bts.mega.Gnarly 1.4 | 9 | 44% |
| kawigi.spare.SpareParts 0.7.6nosnd | 5 | 60% |
| kdf.KoulDestroyer 1.0 | 3 | 100% |

Hadur died in 143 of 210 rounds, at a mean tick of 746. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 50 | 35% | 77 |
| bvh.mini.Freya 0.55 | 27 | 19% | 34 |
| cs.Wren 1.0 | 20 | 14% | 31 |
| bts.mega.Gnarly 1.4 | 16 | 11% | 23 |
| davidalves.net.DuelistNanoMelee 1.01 | 13 | 9% | 23 |
| kdf.KoulDestroyer 1.0 | 8 | 6% | 11 |
| kawigi.spare.SpareParts 0.7.6nosnd | 7 | 5% | 8 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 1 |
| bzdp.BoxCar 2.0 | 1 | 1% | 1 |

## Melee bench: F39

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.6 | 82.1 | 81 / 210 | 2.61 | 17.0% | 27991 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.2 | 17.0% | 81 |
| bvh.fry.Freya 0.82 | 2.0 | 15.1% | 33 |
| az.Ololobot 0.2.4 | 2.8 | 13.2% | 62 |
| catcat20.Lambda 0.024 | 4.2 | 10.5% | 14 |
| stelo.SoRobotNanoMelee 1.2 | 5.0 | 9.2% | 14 |
| gimp.GimpBot 0.1 | 6.8 | 8.0% | 4 |
| apollokidd.ApolloKidd 0.9 | 7.0 | 7.9% | 2 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.8% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.7% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.5 | 5.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.3 | 78.1 | 9 / 35 | 4143 |
| 2 | 1 | 62.0 | 72.1 | 11 / 35 | 4142 |
| 3 | 1 | 66.6 | 84.4 | 15 / 35 | 4784 |
| 4 | 1 | 67.4 | 86.7 | 15 / 35 | 4933 |
| 5 | 1 | 66.7 | 85.1 | 14 / 35 | 4907 |
| 6 | 1 | 67.4 | 86.3 | 17 / 35 | 5082 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 43 | 37% |
| bvh.fry.Freya 0.82 | 40 | 65% |
| catcat20.Lambda 0.024 | 22 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 17 | 88% |
| winamp32.micro.MicroMacro 1.0 | 3 | 100% |
| apollokidd.ApolloKidd 0.9 | 2 | 100% |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 1014. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bvh.fry.Freya 0.82 | 45 | 34% | 65 |
| az.Ololobot 0.2.4 | 34 | 26% | 51 |
| stelo.SoRobotNanoMelee 1.2 | 21 | 16% | 34 |
| catcat20.Lambda 0.024 | 15 | 11% | 31 |
| apollokidd.ApolloKidd 0.9 | 6 | 5% | 9 |
| gimp.GimpBot 0.1 | 6 | 5% | 7 |
| winamp32.micro.MicroMacro 1.0 | 2 | 2% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 4 |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 1% | 2 |

## Melee bench: F40

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.2 | 113 / 210 | 2.15 | 18.7% | 28773 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.7% | 113 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 15.0% | 51 |
| kano.gamma.KanoGamma 1.8 | 3.2 | 12.2% | 15 |
| mz.AntiGrav 1.0 | 4.5 | 10.4% | 7 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.5% | 11 |
| alpha.BlackIce 1.0 | 5.3 | 9.9% | 7 |
| stelo.Randomness 1.0 | 7.0 | 7.8% | 5 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.4% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.2 | 5.4% | 0 |
| sample.Corners 1.0 | 9.8 | 3.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.9 | 84.8 | 18 / 35 | 4735 |
| 2 | 1 | 66.9 | 85.4 | 16 / 35 | 4468 |
| 3 | 1 | 68.0 | 84.1 | 18 / 35 | 4996 |
| 4 | 1 | 69.8 | 91.1 | 22 / 35 | 4833 |
| 5 | 1 | 69.5 | 89.5 | 22 / 35 | 4977 |
| 6 | 1 | 68.3 | 88.3 | 17 / 35 | 4764 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 50 | 78% |
| kano.gamma.KanoGamma 1.8 | 25 | 88% |
| Polkwane.SmashMelee 1.0 | 22 | 91% |
| mz.AntiGrav 1.0 | 22 | 86% |
| alpha.BlackIce 1.0 | 8 | 75% |
| stelo.Randomness 1.0 | 7 | 57% |
| sample.Corners 1.0 | 2 | 50% |
| testantiswapgun.AntiSwap 1.0 | 2 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 828. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 35 | 36% | 66 |
| kano.gamma.KanoGamma 1.8 | 15 | 15% | 46 |
| mz.AntiGrav 1.0 | 12 | 12% | 31 |
| alpha.BlackIce 1.0 | 12 | 12% | 20 |
| Polkwane.SmashMelee 1.0 | 9 | 9% | 21 |
| stelo.Randomness 1.0 | 8 | 8% | 14 |
| amk.superstrike.SuperStrike 0.3 | 4 | 4% | 4 |
| sample.Corners 1.0 | 1 | 1% | 4 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 3 |

## Melee bench: F41

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.0 | 111 / 210 | 2.35 | 17.4% | 24086 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.2 | 17.4% | 111 |
| eem.EvBotNG v12.8 | 1.8 | 15.4% | 60 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.7% | 15 |
| ary.Swarm 1.1 | 3.5 | 13.0% | 12 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.5% | 5 |
| shrub.Silver v048 | 6.0 | 9.2% | 1 |
| zyx.nano.Ant 1.1 | 7.0 | 7.7% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.8% | 5 |
| jsal.Jsalbot 1.0 | 8.7 | 5.6% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.6 | 81.3 | 17 / 35 | 4242 |
| 2 | 1 | 68.5 | 88.9 | 22 / 35 | 4082 |
| 3 | 1 | 65.4 | 81.9 | 13 / 35 | 3879 |
| 4 | 1 | 69.2 | 91.7 | 24 / 35 | 4150 |
| 5 | 1 | 67.2 | 85.4 | 19 / 35 | 4185 |
| 6 | 2 | 65.0 | 81.0 | 16 / 35 | 3548 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 60 | 53% |
| lessonz.robocode.Oz 0.5.0 | 39 | 85% |
| ary.Swarm 1.1 | 23 | 87% |
| simonton.nano.MeleeSeed 1.8 | 22 | 91% |
| stelo.Mirror 1.1 | 5 | 60% |
| shrub.Silver v048 | 2 | 100% |
| jsal.Jsalbot 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 857. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 46 | 46% | 77 |
| ary.Swarm 1.1 | 15 | 15% | 42 |
| lessonz.robocode.Oz 0.5.0 | 15 | 15% | 36 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 29 |
| stelo.Mirror 1.1 | 7 | 7% | 12 |
| acogdev.alpha 0.2 | 5 | 5% | 5 |
| zyx.nano.Ant 1.1 | 3 | 3% | 5 |
| shrub.Silver v048 | 0 | 0% | 4 |

## Melee bench: F42

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 86.6 | 108 / 210 | 2.21 | 18.3% | 30764 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 18.3% | 108 |
| wompi.Wallaby 5.1 | 2.2 | 15.5% | 45 |
| ara.Shera 0.88 | 3.3 | 13.5% | 30 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.1% | 22 |
| amz.NanoClone 1.41 | 5.2 | 9.1% | 2 |
| maribo.IotaCT 1.1 | 6.2 | 7.9% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.8% | 3 |
| stelo.MirrorMicro 1.0 | 8.0 | 5.9% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 10.0 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 94.0 | 27 / 35 | 5931 |
| 2 | 1 | 66.4 | 83.2 | 14 / 35 | 4876 |
| 3 | 1 | 67.6 | 85.4 | 14 / 35 | 5272 |
| 4 | 1 | 69.6 | 89.5 | 24 / 35 | 5296 |
| 5 | 1 | 67.4 | 85.1 | 14 / 35 | 5104 |
| 6 | 1 | 65.8 | 82.2 | 15 / 35 | 4285 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| wompi.Wallaby 5.1 | 66 | 80% |
| ara.Shera 0.88 | 32 | 78% |
| maribo.mini.MiniQuester 0.1 | 32 | 69% |
| dsw.StaticD 1.0 | 5 | 60% |
| amz.NanoClone 1.41 | 2 | 50% |
| maribo.IotaCT 1.1 | 2 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 888. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| wompi.Wallaby 5.1 | 31 | 30% | 84 |
| maribo.mini.MiniQuester 0.1 | 27 | 26% | 52 |
| ara.Shera 0.88 | 26 | 25% | 46 |
| amz.NanoClone 1.41 | 12 | 12% | 12 |
| dsw.StaticD 1.0 | 4 | 4% | 7 |
| maribo.IotaCT 1.1 | 1 | 1% | 4 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 3 |
| mme.NikeEnhanced 2.0 | 0 | 0% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 0 | 0% | 1 |

## Melee bench: F43

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 62.4 | 71.5 | 21 / 210 | 3.56 | 13.8% | 21286 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 22.0% | 168 |
| hadur117.mini.DeiseP200 0.2 | 2.2 | 13.8% | 21 |
| brainfade.melee.Dusk 0.44 | 2.8 | 12.5% | 12 |
| dummy.micro.Sparrow 2.5 | 4.2 | 11.3% | 4 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.5% | 4 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.7% | 1 |
| mz.NanoGod 2.02 | 7.5 | 7.7% | 0 |
| jab.DiamondStealer 5 | 7.5 | 7.8% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 59.5 | 63.2 | 1 / 35 | 3294 |
| 2 | 2 | 63.0 | 72.1 | 4 / 35 | 3767 |
| 3 | 2 | 64.1 | 76.2 | 6 / 35 | 3656 |
| 4 | 2 | 61.4 | 69.5 | 2 / 35 | 3388 |
| 5 | 2 | 62.8 | 72.4 | 3 / 35 | 3624 |
| 6 | 2 | 63.7 | 75.9 | 5 / 35 | 3557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 56 | 13% |
| brainfade.melee.Dusk 0.44 | 10 | 90% |
| dummy.micro.Sparrow 2.5 | 3 | 100% |
| wcsv.melee.EngineerMelee 0.1 | 2 | 50% |
| jab.DiamondStealer 5 | 1 | 100% |

Hadur died in 189 of 210 rounds, at a mean tick of 790. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 141 | 75% | 148 |
| brainfade.melee.Dusk 0.44 | 15 | 8% | 23 |
| dummy.micro.Sparrow 2.5 | 13 | 7% | 17 |
| wcsv.melee.EngineerMelee 0.1 | 12 | 6% | 13 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 3 | 2% | 3 |
| cvt.Firsty 1.0 | 2 | 1% | 2 |
| Krabb.akim2.Akim2 1.1b | 0 | 0% | 1 |

## Melee bench: F44

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 90.8 | 109 / 210 | 1.82 | 19.1% | 29106 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 19.1% | 109 |
| stelo.Liblix 0.3.1 | 2.2 | 15.7% | 66 |
| tzu.TheArtOfWar 1.2 | 2.8 | 14.0% | 30 |
| wompi.Quokka 1.6 | 4.3 | 10.5% | 2 |
| jwirde.Gort 2.0 | 5.3 | 9.0% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.9% | 0 |
| disan.Chair 2.2.0 | 7.3 | 6.9% | 1 |
| stf.PanzerGeneral 0.1 | 7.5 | 7.1% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.5 | 92.7 | 23 / 35 | 4990 |
| 2 | 1 | 69.4 | 91.4 | 19 / 35 | 4865 |
| 3 | 1 | 67.9 | 88.6 | 12 / 35 | 4677 |
| 4 | 1 | 69.7 | 92.1 | 19 / 35 | 5110 |
| 5 | 1 | 69.5 | 92.7 | 20 / 35 | 4997 |
| 6 | 1 | 67.7 | 87.6 | 16 / 35 | 4467 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 89 | 51% |
| tzu.TheArtOfWar 1.2 | 55 | 64% |
| wompi.Quokka 1.6 | 12 | 100% |
| jwirde.Gort 2.0 | 7 | 71% |
| disan.Chair 2.2.0 | 6 | 100% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 4 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 57 | 56% | 107 |
| tzu.TheArtOfWar 1.2 | 31 | 30% | 63 |
| wompi.Quokka 1.6 | 5 | 5% | 12 |
| disan.Chair 2.2.0 | 2 | 2% | 7 |
| jwirde.Gort 2.0 | 2 | 2% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 2% | 2 |
| stf.PanzerGeneral 0.1 | 1 | 1% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 2 |
| sample.Crazy 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F45

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.7 | 108 / 210 | 1.83 | 20.2% | 34663 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| hadur117.mini.DeiseP200 0.2 | 1.0 | 20.2% | 108 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.5% | 88 |
| jje.BagPuss 1.2 | 3.2 | 11.2% | 4 |
| sul.Lunar 1.1 | 4.2 | 10.7% | 5 |
| myl.nano.Graviton 1.10 | 5.2 | 9.4% | 1 |
| fm.claire 1.7 | 6.5 | 8.5% | 1 |
| hvilela.HVilela 0.9 | 6.8 | 8.2% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.3 | 8.0% | 0 |
| wit.Deep7 2.0 | 8.5 | 6.4% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.1 | 91.1 | 16 / 35 | 5780 |
| 2 | 1 | 68.7 | 88.6 | 17 / 35 | 5263 |
| 3 | 1 | 69.7 | 88.6 | 15 / 35 | 6070 |
| 4 | 1 | 70.9 | 94.3 | 21 / 35 | 5604 |
| 5 | 1 | 70.3 | 90.2 | 20 / 35 | 6052 |
| 6 | 1 | 70.4 | 91.7 | 19 / 35 | 5894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 115 | 43% |
| sul.Lunar 1.1 | 19 | 100% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| jje.BagPuss 1.2 | 11 | 73% |
| pez.mini.ChironexFleckeri 0.5 | 10 | 100% |
| wit.Deep7 2.0 | 6 | 83% |
| hvilela.HVilela 0.9 | 2 | 100% |
| fm.claire 1.7 | 2 | 100% |

Hadur died in 102 of 210 rounds, at a mean tick of 2137. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 65 | 64% | 0 |
| myl.nano.Graviton 1.10 | 11 | 11% | 40 |
| jje.BagPuss 1.2 | 9 | 9% | 41 |
| fm.claire 1.7 | 5 | 5% | 15 |
| sul.Lunar 1.1 | 4 | 4% | 71 |
| hvilela.HVilela 0.9 | 3 | 3% | 12 |
| pez.mini.ChironexFleckeri 0.5 | 3 | 3% | 12 |
| wit.Deep7 2.0 | 2 | 2% | 12 |
| abud.ThirdRobo 1.0 | 0 | 0% | 1 |

## Melee bench: F46

hadur117.mini.DeiseP200 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.2 | 75.5 | 32 / 210 | 3.20 | 14.8% | 24830 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.1% | 69 |
| rsalesc.melee.Medina 0.4.5 | 1.5 | 17.1% | 97 |
| hadur117.mini.DeiseP200 0.2 | 3.0 | 14.8% | 32 |
| mz.MicroSheep 1.0 | 4.2 | 10.8% | 3 |
| sadoner.killer 0.2 | 5.3 | 9.6% | 1 |
| cx.Princess 1.0 | 5.7 | 9.1% | 8 |
| arthord.NanoSatanMelee Beta | 7.2 | 6.8% | 0 |
| jeremyreeder.collective.Prophet 5 | 7.7 | 6.2% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 63.3 | 76.2 | 3 / 35 | 4390 |
| 2 | 3 | 61.9 | 73.3 | 2 / 35 | 4060 |
| 3 | 3 | 63.8 | 78.4 | 8 / 35 | 3974 |
| 4 | 3 | 62.9 | 72.4 | 7 / 35 | 4100 |
| 5 | 3 | 64.6 | 78.7 | 7 / 35 | 4357 |
| 6 | 3 | 62.5 | 74.0 | 5 / 35 | 3949 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kc.mini.Mirage 0.2 | 37 | 30% |
| rsalesc.melee.Medina 0.4.5 | 29 | 31% |
| mz.MicroSheep 1.0 | 8 | 88% |
| cx.Princess 1.0 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 178 of 210 rounds, at a mean tick of 753. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 72 | 40% | 81 |
| kc.mini.Mirage 0.2 | 61 | 34% | 73 |
| cx.Princess 1.0 | 15 | 8% | 18 |
| mz.MicroSheep 1.0 | 13 | 7% | 19 |
| arthord.NanoSatanMelee Beta | 8 | 4% | 8 |
| sadoner.killer 0.2 | 7 | 4% | 9 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

