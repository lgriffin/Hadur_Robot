# Bench suite: suite.txt

## Melee bench: F01

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.9 | 45 / 210 | 2.36 | 17.1% | 30789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 20.3% | 141 |
| kc.mini.Mirage 0.2 | 2.0 | 17.1% | 45 |
| sgp.JollyNinja 3.53 | 3.5 | 11.3% | 11 |
| mz.MicroGodMelee 1 | 4.7 | 10.7% | 6 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.8 | 10.4% | 1 |
| lorneswork.Predator 1.0 | 5.0 | 9.7% | 5 |
| adt.Ar2 1.0 | 7.0 | 7.1% | 1 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 0 |
| skm.butterfly 1.0 | 9.0 | 4.6% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.1 | 86.3 | 5 / 35 | 5269 |
| 2 | 2 | 67.2 | 84.1 | 9 / 35 | 5257 |
| 3 | 2 | 66.7 | 84.1 | 9 / 35 | 5041 |
| 4 | 2 | 67.8 | 86.7 | 6 / 35 | 5333 |
| 5 | 2 | 65.9 | 81.9 | 4 / 35 | 4989 |
| 6 | 2 | 67.3 | 86.3 | 12 / 35 | 4900 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 120 | 11% |
| sgp.JollyNinja 3.53 | 17 | 76% |
| mz.MicroGodMelee 1 | 12 | 67% |
| lorneswork.Predator 1.0 | 5 | 100% |
| simonton.nano.WeekendObsession_Melee 1.0 | 2 | 100% |
| mym.EdgeStalker 1.0 | 2 | 100% |
| adt.Ar2 1.0 | 2 | 100% |

Hadur died in 166 of 210 rounds, at a mean tick of 1022. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 121 | 73% | 136 |
| sgp.JollyNinja 3.53 | 13 | 8% | 21 |
| mz.MicroGodMelee 1 | 12 | 7% | 20 |
| simonton.nano.WeekendObsession_Melee 1.0 | 8 | 5% | 8 |
| lorneswork.Predator 1.0 | 3 | 2% | 8 |
| kawigi.sbf.FloodSonnet 0.9 | 3 | 2% | 6 |
| adt.Ar2 1.0 | 3 | 2% | 5 |
| skm.butterfly 1.0 | 2 | 1% | 2 |
| mym.EdgeStalker 1.0 | 1 | 1% | 4 |

## Melee bench: F02

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.5 | 83.1 | 88 / 210 | 2.52 | 18.2% | 32359 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.2% | 88 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.3 | 13.3% | 32 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.8% | 52 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 10.7% | 4 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.7 | 9.2% | 5 |
| fnc.bandit.Bandit 5.2.0 | 6.3 | 8.2% | 0 |
| Noran.BitchingElk 0.054 | 6.8 | 8.0% | 13 |
| sch.Simone 0.3d | 7.7 | 7.5% | 12 |
| stelo.PatternRobot 1.0 | 8.5 | 6.7% | 2 |
| fullsail.SweetTea 1.1 | 10.0 | 4.5% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.3 | 78.1 | 16 / 35 | 5059 |
| 2 | 1 | 67.1 | 83.2 | 13 / 35 | 5437 |
| 3 | 1 | 68.8 | 86.7 | 15 / 35 | 5571 |
| 4 | 1 | 68.5 | 86.3 | 15 / 35 | 5643 |
| 5 | 1 | 68.6 | 85.1 | 20 / 35 | 5510 |
| 6 | 1 | 65.7 | 79.4 | 9 / 35 | 5139 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 38% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 44 | 64% |
| Noran.BitchingElk 0.054 | 17 | 53% |
| lrem.micro.SpikeSoldier 0.4 | 12 | 75% |
| com.cohesiva.robocode.ManOwaR 1.0 | 10 | 60% |
| stelo.PatternRobot 1.0 | 9 | 100% |
| sch.Simone 0.3d | 8 | 75% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |
| fullsail.SweetTea 1.1 | 1 | 100% |

Hadur died in 122 of 210 rounds, at a mean tick of 917. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 47 | 39% | 65 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 28 | 23% | 59 |
| stelo.PatternRobot 1.0 | 10 | 8% | 18 |
| Noran.BitchingElk 0.054 | 10 | 8% | 18 |
| lrem.micro.SpikeSoldier 0.4 | 10 | 8% | 16 |
| com.cohesiva.robocode.ManOwaR 1.0 | 8 | 7% | 16 |
| sch.Simone 0.3d | 7 | 6% | 14 |
| fnc.bandit.Bandit 5.2.0 | 2 | 2% | 3 |
| fullsail.SweetTea 1.1 | 0 | 0% | 1 |

## Melee bench: F03

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.5 | 160 / 210 | 1.58 | 20.7% | 38142 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 160 |
| kawigi.nano.Lib 1.0 | 2.5 | 13.5% | 17 |
| radnor.DoctorBob 1.42 | 2.8 | 13.0% | 10 |
| vuen.Cake 2.51 | 3.7 | 12.5% | 22 |
| urdos.URDOS 1.3 | 5.0 | 9.0% | 0 |
| adt.Ar1 2.1 | 6.5 | 7.5% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 7.1% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.6% | 1 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 9.0 | 5.5% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 94.0 | 28 / 35 | 6246 |
| 2 | 1 | 71.6 | 95.9 | 28 / 35 | 6269 |
| 3 | 1 | 70.3 | 91.4 | 25 / 35 | 6282 |
| 4 | 1 | 71.0 | 94.3 | 27 / 35 | 6324 |
| 5 | 1 | 71.0 | 91.1 | 25 / 35 | 6690 |
| 6 | 1 | 71.4 | 94.6 | 27 / 35 | 6331 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.nano.Lib 1.0 | 75 | 93% |
| vuen.Cake 2.51 | 59 | 75% |
| radnor.DoctorBob 1.42 | 34 | 100% |
| urdos.URDOS 1.3 | 5 | 100% |
| oa.weak.FlyMk1 0.1 | 3 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 2 | 100% |
| adt.Ar1 2.1 | 1 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 850. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 22 | 43% | 66 |
| kawigi.nano.Lib 1.0 | 15 | 29% | 77 |
| radnor.DoctorBob 1.42 | 5 | 10% | 36 |
| urdos.URDOS 1.3 | 4 | 8% | 10 |
| adt.Ar1 2.1 | 2 | 4% | 7 |
| bwbaugh.nano.Tirunculus 0.0.0a | 2 | 4% | 3 |
| ghent.ArthurPanzergon 1.0.0 | 1 | 2% | 6 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 2 |
| oa.weak.FlyMk1 0.1 | 0 | 0% | 1 |

## Melee bench: F04

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 85.8 | 20 / 210 | 2.28 | 17.6% | 35369 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.6% | 182 |
| kc.mini.Mirage 0.2 | 2.0 | 17.6% | 20 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.5% | 3 |
| TNT.TNT 0.99.1 | 4.0 | 10.2% | 1 |
| josago.Jorgito 0.16 | 5.0 | 9.3% | 4 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.6% | 0 |
| rampancy.Durandal 2.1d | 8.0 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.0 | 4.1% | 0 |
| spin.Bugstard 0.012b | 9.8 | 3.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.4 | 87.0 | 5 / 35 | 5652 |
| 2 | 2 | 69.1 | 87.0 | 1 / 35 | 6364 |
| 3 | 2 | 68.5 | 85.4 | 3 / 35 | 6024 |
| 4 | 2 | 67.8 | 86.0 | 2 / 35 | 5703 |
| 5 | 2 | 68.9 | 86.3 | 6 / 35 | 6069 |
| 6 | 2 | 67.1 | 82.9 | 3 / 35 | 5557 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 151 | 7% |
| apc.LeeroyJenkins2 1.0 | 6 | 100% |
| TNT.TNT 0.99.1 | 2 | 100% |
| josago.Jorgito 0.16 | 2 | 0% |
| css.Delitioner 0.11 | 1 | 100% |
| sp.Nanos.Ember 1.1 | 1 | 100% |

Hadur died in 190 of 210 rounds, at a mean tick of 1168. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 163 | 86% | 175 |
| josago.Jorgito 0.16 | 9 | 5% | 9 |
| apc.LeeroyJenkins2 1.0 | 7 | 4% | 12 |
| TNT.TNT 0.99.1 | 5 | 3% | 7 |
| css.Delitioner 0.11 | 3 | 2% | 3 |
| rampancy.Durandal 2.1d | 2 | 1% | 2 |
| tj.zombie1n 1.0.1 | 1 | 1% | 1 |
| sp.Nanos.Ember 1.1 | 0 | 0% | 1 |

## Melee bench: F05

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 61.7 | 71.4 | 20 / 210 | 3.57 | 13.8% | 22594 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.0 | 19.0% | 119 |
| justin.DemonicRage 3.4 | 2.0 | 16.8% | 56 |
| kc.mini.Mirage 0.2 | 3.0 | 13.8% | 20 |
| wompi.Numbat 2.1 | 4.0 | 12.6% | 7 |
| ms.Ares 0.19 | 5.5 | 9.2% | 1 |
| axeBots.HataMoto 3.09 | 5.5 | 9.1% | 7 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.0% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.3% | 0 |
| GarmBox.Oranges 1.0 | 9.3 | 4.0% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 61.0 | 68.6 | 3 / 35 | 3818 |
| 2 | 3 | 61.5 | 71.4 | 3 / 35 | 3651 |
| 3 | 3 | 60.7 | 69.8 | 2 / 35 | 3712 |
| 4 | 3 | 61.5 | 70.8 | 2 / 35 | 3757 |
| 5 | 3 | 61.0 | 68.9 | 3 / 35 | 3706 |
| 6 | 3 | 64.5 | 79.0 | 7 / 35 | 3950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 44 | 16% |
| justin.DemonicRage 3.4 | 25 | 28% |
| wompi.Numbat 2.1 | 7 | 57% |
| axeBots.HataMoto 3.09 | 2 | 50% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 190 of 210 rounds, at a mean tick of 789. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 71 | 37% | 77 |
| justin.DemonicRage 3.4 | 54 | 28% | 60 |
| wompi.Numbat 2.1 | 38 | 20% | 41 |
| axeBots.HataMoto 3.09 | 9 | 5% | 10 |
| ms.Ares 0.19 | 7 | 4% | 10 |
| supersample.SuperBoxBot 1.0 | 5 | 3% | 6 |
| GarmBox.Oranges 1.0 | 3 | 2% | 3 |
| davidalves.net.DuelistMicroMelee 1.4 | 2 | 1% | 2 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.4 | 141 / 210 | 1.78 | 19.5% | 29030 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 141 |
| jekl.StoneGhost 0.7 | 2.0 | 14.2% | 19 |
| origin.SleepSiphon 1.7b | 3.3 | 12.1% | 25 |
| pe.minimelee.SandboxMiniMelee 1.1 | 3.8 | 11.5% | 12 |
| mld.Wisdom 1.0 | 4.8 | 10.9% | 3 |
| gg.Wolverine 2.0 | 6.3 | 8.6% | 5 |
| ers.nano.hawk.HawkLA 3.0m | 7.5 | 6.5% | 4 |
| DBall.NUKE 0.1 | 8.0 | 6.6% | 1 |
| spinnercat.Omen 1.0 | 8.2 | 6.7% | 1 |
| sample.Fire 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.9 | 91.1 | 25 / 35 | 5006 |
| 2 | 1 | 69.4 | 90.5 | 23 / 35 | 4931 |
| 3 | 1 | 69.9 | 92.4 | 25 / 35 | 4777 |
| 4 | 1 | 69.6 | 92.7 | 23 / 35 | 4779 |
| 5 | 1 | 68.6 | 88.9 | 22 / 35 | 4560 |
| 6 | 1 | 69.8 | 92.7 | 23 / 35 | 4977 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 91% |
| pe.minimelee.SandboxMiniMelee 1.1 | 42 | 86% |
| origin.SleepSiphon 1.7b | 39 | 64% |
| gg.Wolverine 2.0 | 16 | 75% |
| mld.Wisdom 1.0 | 9 | 89% |
| DBall.NUKE 0.1 | 4 | 100% |
| spinnercat.Omen 1.0 | 3 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 2 | 50% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 21 | 30% | 56 |
| pe.minimelee.SandboxMiniMelee 1.1 | 16 | 23% | 45 |
| jekl.StoneGhost 0.7 | 13 | 19% | 51 |
| mld.Wisdom 1.0 | 11 | 16% | 26 |
| gg.Wolverine 2.0 | 5 | 7% | 15 |
| DBall.NUKE 0.1 | 1 | 1% | 9 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 4 |
| sample.Fire 1.0 | 1 | 1% | 1 |
| spinnercat.Omen 1.0 | 0 | 0% | 3 |

## Melee bench: F07

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.6 | 90.3 | 110 / 210 | 1.87 | 19.3% | 34891 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 110 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.1% | 51 |
| rtk.Tachikoma 1.0 | 2.8 | 16.6% | 37 |
| oog.melee.CapuletDroid 1.1 | 4.5 | 10.7% | 5 |
| franzor.Lizt 1.3.1 | 4.5 | 10.5% | 8 |
| lrem.micro.MoggFanatic 0.2 | 6.2 | 8.4% | 0 |
| exauge.GateKeeper 1.1.121g | 6.8 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.4% | 0 |
| sample.Target 1.0 | 9.5 | 2.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 91.7 | 21 / 35 | 6121 |
| 2 | 1 | 70.4 | 89.2 | 19 / 35 | 5702 |
| 3 | 1 | 69.9 | 89.5 | 19 / 35 | 5393 |
| 4 | 1 | 70.6 | 88.6 | 17 / 35 | 5952 |
| 5 | 1 | 70.8 | 92.4 | 17 / 35 | 5776 |
| 6 | 1 | 70.6 | 90.5 | 17 / 35 | 5947 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 92 | 76% |
| rsalesc.melee.Monk 0.3.6c | 42 | 19% |
| oog.melee.CapuletDroid 1.1 | 20 | 95% |
| franzor.Lizt 1.3.1 | 12 | 83% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 100 of 210 rounds, at a mean tick of 1086. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 50 | 50% | 68 |
| rtk.Tachikoma 1.0 | 40 | 40% | 105 |
| oog.melee.CapuletDroid 1.1 | 5 | 5% | 24 |
| exauge.GateKeeper 1.1.121g | 3 | 3% | 7 |
| franzor.Lizt 1.3.1 | 2 | 2% | 2 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |

## Melee bench: F08

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.9 | 128 / 210 | 1.90 | 19.7% | 32354 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 128 |
| tm.Yuugao 1.0 | 2.7 | 12.4% | 35 |
| shrub.Vapour v159 | 3.0 | 11.8% | 16 |
| com.spp.robocode.MostlyHarmless 010 | 4.3 | 10.8% | 7 |
| Krabb.sliNk.Garm 0.9u | 4.5 | 10.6% | 16 |
| m3thos.Eva00 1.1 | 6.2 | 8.7% | 1 |
| jwst.DAD.DarkAndDarker 1.1 | 6.5 | 8.0% | 5 |
| zyx.nano.BacillusComma 1.0 | 8.8 | 5.6% | 0 |
| SHAM.WOW 1.4 | 8.8 | 6.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 9.2 | 6.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.2 | 20 / 35 | 5245 |
| 2 | 1 | 69.0 | 90.5 | 19 / 35 | 5242 |
| 3 | 1 | 69.0 | 89.5 | 22 / 35 | 5263 |
| 4 | 1 | 69.4 | 88.6 | 23 / 35 | 5295 |
| 5 | 1 | 70.0 | 90.5 | 22 / 35 | 5663 |
| 6 | 1 | 69.9 | 91.4 | 22 / 35 | 5646 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 48 | 58% |
| shrub.Vapour v159 | 35 | 80% |
| Krabb.sliNk.Garm 0.9u | 34 | 74% |
| com.spp.robocode.MostlyHarmless 010 | 25 | 96% |
| m3thos.Eva00 1.1 | 9 | 100% |
| jwst.DAD.DarkAndDarker 1.1 | 9 | 89% |
| qualidafial.MajorDick 1.0.1 | 3 | 100% |
| SHAM.WOW 1.4 | 3 | 67% |
| zyx.nano.BacillusComma 1.0 | 1 | 100% |

Hadur died in 83 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 34 | 41% | 71 |
| Krabb.sliNk.Garm 0.9u | 14 | 17% | 33 |
| com.spp.robocode.MostlyHarmless 010 | 13 | 16% | 33 |
| shrub.Vapour v159 | 11 | 13% | 42 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 6% | 16 |
| m3thos.Eva00 1.1 | 4 | 5% | 7 |
| SHAM.WOW 1.4 | 1 | 1% | 4 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 3 |
| qualidafial.MajorDick 1.0.1 | 0 | 0% | 1 |

## Melee bench: F09

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 78.5 | 77 / 210 | 2.93 | 16.6% | 26109 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.5 | 16.6% | 83 |
| kc.mini.Mirage 0.2 | 1.5 | 16.6% | 77 |
| kc.micro.Figment 1.0 | 3.2 | 13.2% | 28 |
| yagami.Tidus 0.11 | 4.0 | 10.5% | 3 |
| pedersen.Grishnakh 1.0 | 5.0 | 10.2% | 11 |
| mc2.enemy.Original 0.9 | 5.8 | 9.1% | 5 |
| dft.Calliope 5.6 | 7.0 | 7.6% | 1 |
| step.nanoPri 1.0 | 8.5 | 5.8% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.0 | 5.4% | 1 |
| rdm.Dueler 0.4x | 9.5 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.7 | 12 / 35 | 4418 |
| 2 | 1 | 65.8 | 81.6 | 11 / 35 | 4342 |
| 3 | 2 | 65.0 | 77.8 | 10 / 35 | 4361 |
| 4 | 1 | 61.5 | 68.6 | 10 / 35 | 4079 |
| 5 | 1 | 66.5 | 81.6 | 17 / 35 | 4209 |
| 6 | 2 | 67.5 | 81.9 | 17 / 35 | 4700 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 58 | 33% |
| kc.micro.Figment 1.0 | 37 | 76% |
| mc2.enemy.Original 0.9 | 13 | 85% |
| yagami.Tidus 0.11 | 12 | 100% |
| pedersen.Grishnakh 1.0 | 7 | 71% |
| dft.Calliope 5.6 | 2 | 100% |
| rdm.Dueler 0.4x | 1 | 0% |

Hadur died in 133 of 210 rounds, at a mean tick of 778. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 57 | 43% | 78 |
| kc.micro.Figment 1.0 | 28 | 21% | 57 |
| yagami.Tidus 0.11 | 13 | 10% | 25 |
| mc2.enemy.Original 0.9 | 10 | 8% | 22 |
| pedersen.Grishnakh 1.0 | 8 | 6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 7 | 5% | 7 |
| rdm.Dueler 0.4x | 5 | 4% | 4 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| step.nanoPri 1.0 | 2 | 2% | 2 |

## Melee bench: F10

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 96.3 | 173 / 210 | 1.33 | 21.0% | 34899 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.0% | 173 |
| DTF.Kludgy 1.2b | 2.0 | 13.9% | 20 |
| ne.Chimera 1.2 | 3.3 | 12.0% | 1 |
| ejb.Polaris 1.0.1 | 4.0 | 11.6% | 7 |
| vStar.RAFzilla 2.15 | 5.2 | 10.0% | 6 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 4 |
| kurios.DOSexe .9b | 7.5 | 5.9% | 0 |
| sam.Samspin 1.0 | 7.8 | 5.9% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.8 | 5.1% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.2 | 97.8 | 30 / 35 | 6033 |
| 2 | 1 | 71.3 | 96.2 | 28 / 35 | 5686 |
| 3 | 1 | 71.5 | 96.8 | 29 / 35 | 5667 |
| 4 | 1 | 71.2 | 95.2 | 30 / 35 | 5817 |
| 5 | 1 | 71.2 | 94.9 | 26 / 35 | 6132 |
| 6 | 1 | 71.4 | 97.1 | 30 / 35 | 5564 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 61 | 82% |
| ejb.Polaris 1.0.1 | 44 | 95% |
| ne.Chimera 1.2 | 35 | 97% |
| vStar.RAFzilla 2.15 | 22 | 91% |
| tvv.micro.Antares 1.1.1 | 17 | 88% |
| donjezza.Muncho 1.0 | 5 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 2 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 943. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 18 | 47% | 70 |
| ne.Chimera 1.2 | 6 | 16% | 36 |
| tvv.micro.Antares 1.1.1 | 4 | 11% | 17 |
| ejb.Polaris 1.0.1 | 3 | 8% | 47 |
| vStar.RAFzilla 2.15 | 2 | 5% | 21 |
| Grystrion.RandomTrackerNOREV 1.0 | 2 | 5% | 2 |
| donjezza.Muncho 1.0 | 1 | 3% | 6 |
| sam.Samspin 1.0 | 1 | 3% | 5 |
| kurios.DOSexe .9b | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F11

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 83.2 | 97 / 210 | 2.51 | 17.7% | 28248 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.7% | 97 |
| rz.Aleph 0.34 | 1.8 | 15.5% | 45 |
| cx.mini.Nimrod 0.55 | 3.3 | 11.6% | 17 |
| djc.DynaBot 0.1.1 | 4.2 | 10.5% | 12 |
| rdt199.Warlord 0.73 | 4.7 | 9.8% | 17 |
| uji.YellohFellah 1.0 | 6.7 | 8.4% | 14 |
| br2.MobyDickBot 1.6 | 7.0 | 8.3% | 7 |
| KiraNL.Chupacabra 0.4 | 7.2 | 7.6% | 2 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 86.7 | 21 / 35 | 4519 |
| 2 | 1 | 68.3 | 86.7 | 19 / 35 | 5055 |
| 3 | 1 | 66.2 | 83.2 | 14 / 35 | 4534 |
| 4 | 2 | 65.9 | 80.3 | 13 / 35 | 4724 |
| 5 | 1 | 64.6 | 77.8 | 13 / 35 | 4519 |
| 6 | 1 | 67.5 | 84.8 | 17 / 35 | 4897 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 75 | 64% |
| cx.mini.Nimrod 0.55 | 20 | 65% |
| djc.DynaBot 0.1.1 | 15 | 73% |
| rdt199.Warlord 0.73 | 15 | 93% |
| uji.YellohFellah 1.0 | 10 | 50% |
| br2.MobyDickBot 1.6 | 7 | 71% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 45 | 40% | 91 |
| cx.mini.Nimrod 0.55 | 21 | 19% | 32 |
| rdt199.Warlord 0.73 | 13 | 12% | 23 |
| djc.DynaBot 0.1.1 | 12 | 11% | 19 |
| uji.YellohFellah 1.0 | 8 | 7% | 16 |
| br2.MobyDickBot 1.6 | 4 | 4% | 14 |
| KiraNL.Chupacabra 0.4 | 4 | 4% | 8 |
| stelo.MirrorNano 1.3 | 3 | 3% | 4 |
| jeremyreeder.Vincent 2011.12.09 | 3 | 3% | 3 |

## Melee bench: F12

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 86.1 | 111 / 210 | 2.25 | 17.9% | 24781 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 17.9% | 111 |
| bts.wiki.RipCurl 0.9b | 2.0 | 13.9% | 39 |
| darkcanuck.Leon 1.01 | 3.3 | 12.6% | 18 |
| nat.PallasHawk 1.0 | 3.7 | 12.6% | 28 |
| brainfade.melee.Genghis 0.36 | 5.2 | 10.1% | 10 |
| jrm.Test0 1.0 | 6.0 | 8.3% | 2 |
| cs.sheldor.Talon 1.1 | 7.5 | 6.8% | 1 |
| jp.Perpy 16.0 | 7.8 | 6.9% | 0 |
| jaybot.bots.Oddball 4.0 | 8.8 | 5.6% | 1 |
| stuff.Vlad 0.1 | 9.7 | 5.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.7 | 19 / 35 | 4033 |
| 2 | 1 | 69.0 | 91.1 | 22 / 35 | 4263 |
| 3 | 1 | 68.1 | 88.6 | 22 / 35 | 4070 |
| 4 | 1 | 67.0 | 86.0 | 20 / 35 | 3780 |
| 5 | 1 | 66.7 | 85.7 | 16 / 35 | 4134 |
| 6 | 1 | 65.2 | 78.7 | 12 / 35 | 4501 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bts.wiki.RipCurl 0.9b | 48 | 67% |
| darkcanuck.Leon 1.01 | 45 | 76% |
| nat.PallasHawk 1.0 | 37 | 76% |
| brainfade.melee.Genghis 0.36 | 16 | 75% |
| jp.Perpy 16.0 | 2 | 100% |
| jaybot.bots.Oddball 4.0 | 2 | 100% |
| jrm.Test0 1.0 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 32 | 32% | 57 |
| darkcanuck.Leon 1.01 | 22 | 22% | 64 |
| nat.PallasHawk 1.0 | 21 | 21% | 49 |
| brainfade.melee.Genghis 0.36 | 8 | 8% | 13 |
| jrm.Test0 1.0 | 6 | 6% | 10 |
| cs.sheldor.Talon 1.1 | 6 | 6% | 8 |
| jp.Perpy 16.0 | 3 | 3% | 4 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |

## Melee bench: F13

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.7 | 85.1 | 72 / 210 | 2.34 | 17.0% | 27432 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 17.0% | 72 |
| ags.Glacier 0.2.11 | 2.0 | 16.6% | 43 |
| mn.Combat 3.25.0 | 2.5 | 15.8% | 73 |
| shinh.Entangled 0.3 | 4.3 | 11.6% | 14 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.3% | 9 |
| apc.Colossus2 0.17 | 6.2 | 7.7% | 0 |
| stelo.Wang 1.0 | 6.8 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.0 | 5.4% | 0 |
| maribo.FollowFire 1 | 9.2 | 4.4% | 0 |
| sample.Tracker 1.0 | 9.8 | 3.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 91.1 | 15 / 35 | 4520 |
| 2 | 1 | 66.5 | 82.2 | 10 / 35 | 4831 |
| 3 | 1 | 67.6 | 88.6 | 13 / 35 | 4590 |
| 4 | 3 | 64.2 | 77.1 | 7 / 35 | 4249 |
| 5 | 2 | 67.0 | 85.1 | 12 / 35 | 4736 |
| 6 | 1 | 67.2 | 86.3 | 15 / 35 | 4506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 62 | 37% |
| ags.Glacier 0.2.11 | 56 | 54% |
| shinh.Entangled 0.3 | 11 | 73% |
| gh.micro.Gruweltje 0.7 | 8 | 75% |
| stelo.Wang 1.0 | 5 | 100% |

Hadur died in 138 of 210 rounds, at a mean tick of 886. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 54 | 39% | 76 |
| ags.Glacier 0.2.11 | 50 | 36% | 80 |
| shinh.Entangled 0.3 | 18 | 13% | 27 |
| stelo.Wang 1.0 | 9 | 7% | 11 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 14 |
| apc.Colossus2 0.17 | 0 | 0% | 1 |
| ayk.WallHugger 1.0 | 0 | 0% | 1 |

## Melee bench: F14

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.6 | 95.6 | 168 / 210 | 1.40 | 21.1% | 34739 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.1% | 168 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.4% | 14 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 18 |
| co.edu.usb.rc.LidisTron 1.0 | 5.2 | 9.7% | 1 |
| Lo_Ian.Gandalf_V4 4.0 | 5.3 | 9.4% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.7 | 9.3% | 2 |
| dmh.robocode.robot.RedDwarf 0.4 | 5.8 | 9.1% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 8.0 | 7.6% | 6 |
| pa.Improved 1.0 | 9.0 | 5.6% | 0 |
| sample.TrackFire 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 93.0 | 24 / 35 | 5758 |
| 2 | 1 | 71.2 | 94.6 | 27 / 35 | 5477 |
| 3 | 1 | 72.8 | 98.4 | 31 / 35 | 6106 |
| 4 | 1 | 71.7 | 94.6 | 28 / 35 | 5963 |
| 5 | 1 | 72.3 | 97.8 | 30 / 35 | 5733 |
| 6 | 1 | 71.3 | 94.9 | 28 / 35 | 5702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 89 | 94% |
| catcat20.shape.Theta 0.018 | 54 | 72% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 12 | 67% |
| sanyi.mikrobi.Roberto 1.0 | 10 | 100% |
| dmh.robocode.robot.RedDwarf 0.4 | 6 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 100% |
| pa.Improved 1.0 | 1 | 100% |

Hadur died in 42 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 18 | 43% | 49 |
| simonton.micro.Sprout 1.1.3 | 13 | 31% | 96 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 17% | 21 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 5% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 0 | 0% | 8 |
| pa.Improved 1.0 | 0 | 0% | 2 |
| sample.TrackFire 1.0 | 0 | 0% | 1 |

## Melee bench: F15

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.6 | 121 / 210 | 2.12 | 19.5% | 34463 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 121 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.3% | 13 |
| emp.Yngwie 1.11 | 3.0 | 12.5% | 44 |
| mld.DustBunny 3.8 | 3.7 | 12.0% | 10 |
| cb.nano.Insomnia 1.0 | 5.5 | 9.9% | 7 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.6% | 15 |
| lambdaxy.TBot 0.1 | 7.3 | 7.0% | 0 |
| Grystrion.TrackerWO 1.0 | 7.7 | 6.8% | 0 |
| divineomega.TrialBot 0.003 | 9.3 | 4.8% | 0 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 87.0 | 19 / 35 | 5706 |
| 2 | 1 | 70.8 | 90.8 | 21 / 35 | 6324 |
| 3 | 1 | 69.0 | 87.3 | 18 / 35 | 5615 |
| 4 | 1 | 69.0 | 86.0 | 19 / 35 | 5589 |
| 5 | 1 | 71.3 | 93.0 | 27 / 35 | 5927 |
| 6 | 1 | 67.5 | 81.3 | 17 / 35 | 5302 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 41 | 95% |
| emp.Yngwie 1.11 | 37 | 43% |
| mld.DustBunny 3.8 | 28 | 93% |
| cb.nano.Insomnia 1.0 | 25 | 92% |
| kawigi.robot.Girl 1.2 | 20 | 65% |
| divineomega.TrialBot 0.003 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 944. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 39 | 43% | 76 |
| kawigi.robot.Girl 1.2 | 15 | 17% | 24 |
| kawigi.micro.Shiz 1.1 | 12 | 13% | 42 |
| mld.DustBunny 3.8 | 9 | 10% | 41 |
| cb.nano.Insomnia 1.0 | 9 | 10% | 13 |
| lambdaxy.TBot 0.1 | 3 | 3% | 4 |
| divineomega.TrialBot 0.003 | 2 | 2% | 8 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 1 |

## Melee bench: F16

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 87.1 | 97 / 210 | 2.16 | 19.3% | 35566 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 97 |
| gh.Griezel 0.5.2 | 2.0 | 16.6% | 73 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 6 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.1% | 26 |
| bvh.fnr.Fenrir 0.36l | 5.7 | 8.9% | 2 |
| tvv.nano.Polaris 1.2 | 5.8 | 8.6% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.3 | 7.7% | 3 |
| repositorio.NanoStep 1.0 | 8.7 | 5.2% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 4.9% | 0 |
| asd.Cthulhu 1.3 | 9.2 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.6 | 16 / 35 | 5974 |
| 2 | 1 | 71.2 | 92.1 | 19 / 35 | 6434 |
| 3 | 1 | 68.5 | 84.8 | 13 / 35 | 5733 |
| 4 | 1 | 68.8 | 85.1 | 15 / 35 | 5652 |
| 5 | 1 | 69.6 | 86.3 | 19 / 35 | 5798 |
| 6 | 1 | 69.8 | 87.0 | 15 / 35 | 5975 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 103 | 47% |
| techdude.forest.FlamingForest 1.1 | 17 | 59% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 15 | 93% |
| stelo.IntrinsicVolatility 1.4 | 9 | 89% |
| bvh.fnr.Fenrir 0.36l | 7 | 100% |
| divineomega.DivineBot 1.9.4.5 | 6 | 100% |
| tvv.nano.Polaris 1.2 | 4 | 75% |
| asd.Cthulhu 1.3 | 1 | 100% |

Hadur died in 113 of 210 rounds, at a mean tick of 1318. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 66 | 58% | 117 |
| bvh.fnr.Fenrir 0.36l | 14 | 12% | 20 |
| techdude.forest.FlamingForest 1.1 | 12 | 11% | 23 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 10 | 9% | 21 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 10 |
| divineomega.DivineBot 1.9.4.5 | 3 | 3% | 10 |
| tvv.nano.Polaris 1.2 | 1 | 1% | 6 |
| asd.Cthulhu 1.3 | 1 | 1% | 3 |

## Melee bench: F17

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 89.2 | 122 / 210 | 1.98 | 19.3% | 31967 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 122 |
| et.Predator 1.8 | 2.2 | 13.9% | 31 |
| oog.melee.Mercutio 1.0 | 3.0 | 12.5% | 24 |
| cx.BlestPain 1.41 | 4.5 | 11.2% | 21 |
| nic.Nicator 2.4 | 4.8 | 10.4% | 9 |
| ahf.NanoAndrew .4 | 5.7 | 9.6% | 3 |
| maribo.melee.BMV 0.1 | 6.8 | 8.8% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.5 | 5.7% | 0 |
| tex.Longbot 0.4 | 8.5 | 6.0% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 90.8 | 25 / 35 | 5319 |
| 2 | 1 | 69.9 | 90.2 | 21 / 35 | 5452 |
| 3 | 1 | 70.0 | 90.8 | 23 / 35 | 5480 |
| 4 | 1 | 66.7 | 82.2 | 12 / 35 | 5016 |
| 5 | 1 | 69.1 | 88.6 | 20 / 35 | 5204 |
| 6 | 1 | 70.2 | 92.4 | 21 / 35 | 5496 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 62 | 77% |
| oog.melee.Mercutio 1.0 | 34 | 76% |
| cx.BlestPain 1.41 | 28 | 61% |
| nic.Nicator 2.4 | 26 | 73% |
| ahf.NanoAndrew .4 | 7 | 100% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| edu.otg.spr.TheTeacher 1.2 | 2 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 958. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| et.Predator 1.8 | 27 | 30% | 71 |
| cx.BlestPain 1.41 | 20 | 22% | 37 |
| oog.melee.Mercutio 1.0 | 14 | 16% | 40 |
| nic.Nicator 2.4 | 11 | 12% | 30 |
| ahf.NanoAndrew .4 | 9 | 10% | 17 |
| maribo.melee.BMV 0.1 | 3 | 3% | 8 |
| tex.Longbot 0.4 | 2 | 2% | 2 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 4 |
| goblin.Bender 2.4 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F18

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 89.3 | 140 / 210 | 1.97 | 19.2% | 28102 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 140 |
| morbid.MorbidPriest 1.0 | 2.0 | 12.8% | 22 |
| agd.Mooserwirt2 2.7 | 3.7 | 11.4% | 15 |
| uji.DBH 1.1 | 3.7 | 10.8% | 11 |
| ratosh.Nobo 0.21 | 5.3 | 10.0% | 2 |
| spinnercat.Robovirus 2.718 | 5.7 | 9.5% | 7 |
| sigterm.Sigterm 1.0 | 6.8 | 8.1% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.8 | 7.2% | 0 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.9% | 0 |
| stelo.WangRobot 1.0 | 9.7 | 5.2% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.9 | 23 / 35 | 4716 |
| 2 | 1 | 69.2 | 90.8 | 26 / 35 | 4603 |
| 3 | 1 | 69.1 | 91.4 | 24 / 35 | 4649 |
| 4 | 1 | 66.9 | 84.4 | 19 / 35 | 4576 |
| 5 | 1 | 68.4 | 88.3 | 22 / 35 | 4521 |
| 6 | 1 | 69.8 | 92.7 | 26 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 42 | 81% |
| agd.Mooserwirt2 2.7 | 36 | 81% |
| uji.DBH 1.1 | 33 | 79% |
| spinnercat.Robovirus 2.718 | 19 | 95% |
| sigterm.Sigterm 1.0 | 18 | 83% |
| ratosh.Nobo 0.21 | 9 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 100% |
| stelo.WangRobot 1.0 | 3 | 100% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 724. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 19 | 27% | 59 |
| agd.Mooserwirt2 2.7 | 15 | 21% | 50 |
| uji.DBH 1.1 | 14 | 20% | 33 |
| ratosh.Nobo 0.21 | 7 | 10% | 15 |
| sigterm.Sigterm 1.0 | 6 | 9% | 14 |
| spinnercat.Robovirus 2.718 | 4 | 6% | 18 |
| kawigi.mini.Fhqwhgads 1.1 | 3 | 4% | 11 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 3% | 4 |
| stelo.WangRobot 1.0 | 0 | 0% | 6 |

## Melee bench: F19

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.3 | 96.2 | 179 / 210 | 1.34 | 21.4% | 33862 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.4% | 179 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.2 | 14.7% | 14 |
| mld.Infinity 2.2 | 3.0 | 13.2% | 11 |
| krillr.mini.JointStrike 2.0.0 | 4.2 | 11.3% | 5 |
| erdnis.Rover 0.3 | 4.7 | 10.8% | 1 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.3 | 7.0% | 0 |
| pbg.R2D2 1.0 | 8.3 | 5.7% | 0 |
| pac.ABC 2.1 | 8.3 | 6.3% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.9 | 97.5 | 31 / 35 | 5123 |
| 2 | 1 | 73.2 | 97.8 | 32 / 35 | 5819 |
| 3 | 1 | 73.5 | 99.0 | 32 / 35 | 6071 |
| 4 | 1 | 71.6 | 93.7 | 27 / 35 | 5692 |
| 5 | 1 | 72.1 | 95.9 | 29 / 35 | 5554 |
| 6 | 1 | 71.6 | 93.7 | 28 / 35 | 5603 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 99 | 91% |
| mld.Infinity 2.2 | 59 | 98% |
| erdnis.Rover 0.3 | 12 | 92% |
| krillr.mini.JointStrike 2.0.0 | 11 | 82% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 3 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |
| pac.ABC 2.1 | 1 | 100% |

Hadur died in 31 of 210 rounds, at a mean tick of 749. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 15 | 48% | 97 |
| krillr.mini.JointStrike 2.0.0 | 8 | 26% | 20 |
| mld.Infinity 2.2 | 3 | 10% | 45 |
| erdnis.Rover 0.3 | 3 | 10% | 14 |
| patson.PatsonTestBot 1.0 | 2 | 6% | 11 |
| pbg.R2D2 1.0 | 0 | 0% | 12 |
| pac.ABC 2.1 | 0 | 0% | 5 |
| mbh.Mbh 0.1 | 0 | 0% | 1 |

## Melee bench: F20

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 92.4 | 132 / 210 | 1.68 | 20.6% | 36060 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.6% | 132 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.0% | 43 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 11.0% | 3 |
| fwb.Nine 1.0.1 | 3.7 | 10.9% | 11 |
| catcat20.Rabbit 0.001 | 4.8 | 9.6% | 14 |
| m3thos.mini.Eva01 0.5.5 | 6.7 | 8.3% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.9% | 5 |
| djdjdj.NanoSkunk10 1.0 | 7.3 | 7.4% | 1 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.6% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 93.3 | 24 / 35 | 5889 |
| 2 | 1 | 71.5 | 92.7 | 24 / 35 | 6044 |
| 3 | 1 | 71.2 | 92.7 | 24 / 35 | 6011 |
| 4 | 1 | 69.7 | 90.5 | 17 / 35 | 5804 |
| 5 | 1 | 71.3 | 93.0 | 23 / 35 | 6419 |
| 6 | 1 | 70.2 | 92.4 | 20 / 35 | 5893 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 73 | 60% |
| fwb.Nine 1.0.1 | 33 | 94% |
| catcat20.Rabbit 0.001 | 27 | 74% |
| nz.jdc.nano.GridFu 1.0 | 17 | 100% |
| bayen.nut.Squirrel 1.615 | 13 | 85% |
| djdjdj.NanoSkunk10 1.0 | 5 | 80% |
| sample.MyFirstJuniorRobot 1.0 | 3 | 100% |
| m3thos.mini.Eva01 0.5.5 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 1012. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 43 | 55% | 81 |
| fwb.Nine 1.0.1 | 16 | 21% | 34 |
| catcat20.Rabbit 0.001 | 12 | 15% | 36 |
| nz.jdc.nano.GridFu 1.0 | 4 | 5% | 30 |
| bayen.nut.Squirrel 1.615 | 2 | 3% | 13 |
| djdjdj.NanoSkunk10 1.0 | 1 | 1% | 7 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 5 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 2 |

## Melee bench: F21

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.0 | 138 / 210 | 1.63 | 20.6% | 35762 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.6% | 138 |
| eem.EvBot v4.6.16 | 2.5 | 15.5% | 49 |
| dummy.mini.Scimitar 1.01 | 2.5 | 14.4% | 18 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.3% | 2 |
| oa.weak.BotherBot 0.1 | 5.3 | 8.3% | 2 |
| eld.Hmm 1.0 | 5.7 | 8.0% | 3 |
| fire219.CatBot 1.0 | 7.0 | 6.4% | 0 |
| el.JumpShoot 0.2 | 8.3 | 5.9% | 0 |
| PSW.Relentless 0.1 | 8.7 | 5.6% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 90.2 | 20 / 35 | 5336 |
| 2 | 1 | 72.1 | 96.2 | 25 / 35 | 6232 |
| 3 | 1 | 70.6 | 90.5 | 23 / 35 | 5853 |
| 4 | 1 | 71.6 | 93.0 | 25 / 35 | 6457 |
| 5 | 1 | 71.2 | 93.7 | 20 / 35 | 5894 |
| 6 | 1 | 71.7 | 94.6 | 25 / 35 | 5990 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 99 | 69% |
| dummy.mini.Scimitar 1.01 | 49 | 88% |
| cf.RiO.RiOx 4.2.1 | 18 | 100% |
| eld.Hmm 1.0 | 6 | 83% |
| oa.weak.BotherBot 0.1 | 5 | 80% |

Hadur died in 74 of 210 rounds, at a mean tick of 1191. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 43 | 58% | 98 |
| dummy.mini.Scimitar 1.01 | 19 | 26% | 71 |
| cf.RiO.RiOx 4.2.1 | 4 | 5% | 20 |
| eld.Hmm 1.0 | 3 | 4% | 10 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 7 |
| el.JumpShoot 0.2 | 1 | 1% | 2 |
| fire219.CatBot 1.0 | 1 | 1% | 1 |
2 death(s) with no robot to name.

## Melee bench: F22

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 90.2 | 111 / 210 | 1.89 | 19.2% | 31958 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 111 |
| pe.SandboxDT 2.71m | 2.3 | 15.5% | 45 |
| kvk.HebusLeTroll 0.35 | 2.7 | 15.4% | 34 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.3% | 19 |
| bigpete.Stewie 1.0 | 5.0 | 10.1% | 1 |
| yk.JahRoslav 1.1 | 6.3 | 7.0% | 0 |
| tad.Dalek98 0.98 | 7.3 | 6.3% | 0 |
| gg.Squaraus 0.6 | 7.5 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 8.8 | 5.1% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.0 | 88.3 | 14 / 35 | 5270 |
| 2 | 1 | 70.2 | 91.4 | 19 / 35 | 5377 |
| 3 | 1 | 69.4 | 90.5 | 16 / 35 | 5285 |
| 4 | 1 | 67.6 | 84.8 | 17 / 35 | 4697 |
| 5 | 1 | 70.3 | 90.8 | 20 / 35 | 5681 |
| 6 | 1 | 71.4 | 95.2 | 25 / 35 | 5648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 66 | 77% |
| jlm.javaDisturbance 0.59 | 43 | 77% |
| pe.SandboxDT 2.71m | 32 | 34% |
| bigpete.Stewie 1.0 | 10 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 3 | 100% |
| tad.Dalek98 0.98 | 2 | 100% |
| pbg.NinjaX 1.2 | 1 | 100% |

Hadur died in 99 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 43 | 43% | 63 |
| kvk.HebusLeTroll 0.35 | 31 | 31% | 69 |
| jlm.javaDisturbance 0.59 | 18 | 18% | 47 |
| bigpete.Stewie 1.0 | 5 | 5% | 20 |
| tad.Dalek98 0.98 | 1 | 1% | 5 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 2 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.6 | 109 / 210 | 1.94 | 19.6% | 34355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 19.6% | 109 |
| pe.SandboxLump 1.52 | 1.8 | 17.8% | 73 |
| cre.Karolos 0.32 | 3.0 | 13.2% | 21 |
| stelo.AreaTargetingBot 1.1 | 4.7 | 10.0% | 4 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 9.3% | 1 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 1 |
| cw.megas.Blade 0.8 | 7.0 | 8.5% | 1 |
| sample.Walls 1.0 | 7.3 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.5% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 22 / 35 | 5504 |
| 2 | 2 | 69.7 | 85.4 | 14 / 35 | 5695 |
| 3 | 1 | 70.3 | 87.9 | 18 / 35 | 5981 |
| 4 | 1 | 69.2 | 86.3 | 16 / 35 | 5360 |
| 5 | 1 | 71.1 | 93.7 | 17 / 35 | 5467 |
| 6 | 1 | 72.1 | 92.1 | 22 / 35 | 6348 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 103 | 58% |
| cre.Karolos 0.32 | 29 | 66% |
| stelo.AreaTargetingBot 1.1 | 15 | 80% |
| stelo.RamTrackSurfer 1.2 | 6 | 100% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 100% |
| sample.Walls 1.0 | 5 | 100% |
| cw.megas.Blade 0.8 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 811. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 55 | 54% | 110 |
| cre.Karolos 0.32 | 32 | 32% | 54 |
| stelo.AreaTargetingBot 1.1 | 9 | 9% | 17 |
| sample.Walls 1.0 | 2 | 2% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 5 |
| stelo.RamTrackSurfer 1.2 | 1 | 1% | 12 |
| cw.megas.Blade 0.8 | 0 | 0% | 4 |

## Melee bench: F24

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.7 | 80.2 | 76 / 210 | 2.79 | 16.2% | 23272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.2% | 76 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.4% | 26 |
| davidalves.Phoenix 0.54 | 3.2 | 13.3% | 55 |
| florent.XSeries.X2 0.12 | 3.2 | 13.5% | 35 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.3% | 9 |
| oog.melee.Corsair 1.0 | 5.8 | 9.2% | 3 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.7% | 5 |
| lunchie.Lunchbox 0.93 | 8.2 | 6.1% | 1 |
| as.FrankTheTank 1.3 | 9.2 | 4.8% | 0 |
| evd.X1 0.01 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 80.0 | 12 / 35 | 3846 |
| 2 | 1 | 66.3 | 84.1 | 16 / 35 | 4207 |
| 3 | 1 | 64.9 | 80.0 | 15 / 35 | 3570 |
| 4 | 1 | 65.6 | 84.4 | 15 / 35 | 3831 |
| 5 | 1 | 63.9 | 78.1 | 12 / 35 | 3903 |
| 6 | 3 | 62.6 | 74.3 | 6 / 35 | 3915 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.Phoenix 0.54 | 38 | 39% |
| rz.GlowBlowMelee 1.4 | 28 | 64% |
| florent.XSeries.X2 0.12 | 27 | 48% |
| pedersen.Ugluk 1.1.1 | 14 | 79% |
| stelo.SoJNanoMelee 1.1 | 13 | 92% |
| oog.melee.Corsair 1.0 | 5 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 67% |

Hadur died in 134 of 210 rounds, at a mean tick of 766. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 41 | 31% | 54 |
| florent.XSeries.X2 0.12 | 30 | 22% | 45 |
| rz.GlowBlowMelee 1.4 | 26 | 19% | 44 |
| pedersen.Ugluk 1.1.1 | 14 | 10% | 25 |
| oog.melee.Corsair 1.0 | 9 | 7% | 18 |
| stelo.SoJNanoMelee 1.1 | 6 | 4% | 12 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 5 |
| as.FrankTheTank 1.3 | 3 | 2% | 4 |
| evd.X1 0.01 | 2 | 1% | 3 |

## Melee bench: F25

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.4 | 87.6 | 139 / 210 | 2.11 | 18.9% | 25938 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.9% | 139 |
| voidious.mini.BrokenSword 2.0.3 | 2.0 | 13.9% | 24 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.3% | 10 |
| jdw.Hurricane 1.4 | 4.0 | 10.9% | 13 |
| ds.Oo 2.2 | 5.3 | 9.0% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.9% | 7 |
| awesomeness.Elite 1.0 | 7.8 | 7.1% | 4 |
| gjr.Cephalosporin 0.1 | 8.0 | 7.2% | 3 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.0 | 85.7 | 22 / 35 | 4197 |
| 2 | 1 | 68.6 | 87.6 | 23 / 35 | 4488 |
| 3 | 1 | 68.1 | 87.3 | 22 / 35 | 4279 |
| 4 | 1 | 69.8 | 92.1 | 27 / 35 | 4294 |
| 5 | 1 | 68.1 | 86.7 | 22 / 35 | 4335 |
| 6 | 1 | 68.1 | 86.3 | 23 / 35 | 4345 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 64 | 86% |
| voidious.micro.BlitzBat 1.05 | 41 | 98% |
| jdw.Hurricane 1.4 | 21 | 90% |
| ds.Oo 2.2 | 9 | 78% |
| adt.Ar2 1.1 | 6 | 83% |
| awesomeness.Elite 1.0 | 6 | 83% |
| gre.svman4.Morfeas 1.4.1 | 6 | 33% |
| gjr.Cephalosporin 0.1 | 5 | 80% |
| amk.ChumbaMini 0.2 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 602. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 24 | 33% | 75 |
| jdw.Hurricane 1.4 | 14 | 19% | 34 |
| voidious.micro.BlitzBat 1.05 | 8 | 11% | 41 |
| adt.Ar2 1.1 | 8 | 11% | 14 |
| ds.Oo 2.2 | 7 | 10% | 17 |
| gre.svman4.Morfeas 1.4.1 | 5 | 7% | 13 |
| awesomeness.Elite 1.0 | 4 | 6% | 6 |
| gjr.Cephalosporin 0.1 | 1 | 1% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 3 |

## Melee bench: F26

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.4 | 124 / 210 | 2.04 | 18.9% | 32128 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.9% | 124 |
| ak.Fermat 2.0 | 2.0 | 14.6% | 40 |
| lrem.Spectre 0.4.4 | 3.3 | 12.1% | 12 |
| shu.nitro.LENIN .T34 | 3.7 | 12.2% | 31 |
| js.PinBall 1.6 | 5.3 | 10.1% | 1 |
| gh.mini.GrubbmOne 1.0 | 6.0 | 10.0% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.7 | 9.1% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.6% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.7% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.7 | 20 / 35 | 5442 |
| 2 | 1 | 69.3 | 89.8 | 21 / 35 | 5279 |
| 3 | 1 | 69.8 | 89.8 | 23 / 35 | 5469 |
| 4 | 1 | 68.8 | 87.3 | 22 / 35 | 5264 |
| 5 | 1 | 69.7 | 89.5 | 20 / 35 | 5537 |
| 6 | 1 | 68.4 | 87.3 | 18 / 35 | 5137 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| shu.nitro.LENIN .T34 | 44 | 57% |
| ak.Fermat 2.0 | 43 | 67% |
| lrem.Spectre 0.4.4 | 42 | 79% |
| js.PinBall 1.6 | 13 | 100% |
| jaybot.adv.bots.JayBot 2.0 | 13 | 100% |
| gh.mini.GrubbmOne 1.0 | 6 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 4 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 86 of 210 rounds, at a mean tick of 854. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| shu.nitro.LENIN .T34 | 30 | 35% | 58 |
| ak.Fermat 2.0 | 28 | 33% | 59 |
| lrem.Spectre 0.4.4 | 15 | 17% | 46 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 7% | 12 |
| js.PinBall 1.6 | 4 | 5% | 19 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 7 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 8 |

## Melee bench: F27

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.0 | 138 / 210 | 2.17 | 19.3% | 31199 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 138 |
| mk.Alpha 0.2.1 | 2.3 | 13.8% | 40 |
| EH.Eagle 1.0.6 | 3.2 | 11.0% | 7 |
| wee.Gem 1.8.4 | 4.0 | 10.5% | 11 |
| sheldor.melee.nano.TestMelee 0.1 | 5.2 | 9.7% | 10 |
| techdude.kombat.FlamingKombat 1.5 | 6.7 | 8.8% | 2 |
| throxbot.ThroxBot 0.1 | 7.2 | 8.2% | 0 |
| joe.ADinosaur 1.0 | 7.5 | 7.9% | 0 |
| caimano.Furia_Ceca 0.22 | 8.0 | 7.4% | 2 |
| cs.Grudge 1.0 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 91.1 | 22 / 35 | 4610 |
| 2 | 1 | 71.0 | 87.6 | 22 / 35 | 6136 |
| 3 | 1 | 67.1 | 71.4 | 19 / 35 | 5908 |
| 4 | 1 | 69.2 | 91.1 | 24 / 35 | 4762 |
| 5 | 1 | 69.5 | 91.4 | 23 / 35 | 5051 |
| 6 | 1 | 68.8 | 89.2 | 28 / 35 | 4732 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 80 | 76% |
| EH.Eagle 1.0.6 | 27 | 93% |
| sheldor.melee.nano.TestMelee 0.1 | 19 | 95% |
| wee.Gem 1.8.4 | 15 | 87% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 7 | 100% |
| caimano.Furia_Ceca 0.22 | 4 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 648. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 30 | 42% | 81 |
| wee.Gem 1.8.4 | 8 | 11% | 27 |
| EH.Eagle 1.0.6 | 6 | 8% | 34 |
| joe.ADinosaur 1.0 | 6 | 8% | 10 |
| sheldor.melee.nano.TestMelee 0.1 | 5 | 7% | 22 |
| throxbot.ThroxBot 0.1 | 5 | 7% | 13 |
| caimano.Furia_Ceca 0.22 | 5 | 7% | 12 |
| techdude.kombat.FlamingKombat 1.5 | 5 | 7% | 10 |
| cs.Grudge 1.0 | 2 | 3% | 1 |

## Melee bench: F28

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 91.6 | 145 / 210 | 1.75 | 19.4% | 26522 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.4% | 145 |
| kid.test.NightFox .2 | 2.0 | 15.4% | 36 |
| qohnil.blot.BlotBot 3.61 | 3.5 | 11.1% | 12 |
| uji.Antique 1.0 | 3.8 | 11.2% | 12 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 10.1% | 1 |
| amk.ChumbaWumba 0.3 | 5.8 | 8.3% | 0 |
| ahr.ice.Ice 1.0.2 | 7.3 | 7.2% | 2 |
| matt.advanced.Katana 1.0 | 8.2 | 6.3% | 2 |
| stelo.PianistNano 1.2 | 9.2 | 5.7% | 0 |
| stelo.Lifestealer 1.0 | 9.3 | 5.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 22 / 35 | 4637 |
| 2 | 1 | 67.2 | 86.7 | 23 / 35 | 4067 |
| 3 | 1 | 70.1 | 94.3 | 25 / 35 | 4578 |
| 4 | 1 | 69.7 | 94.0 | 26 / 35 | 4449 |
| 5 | 1 | 69.5 | 93.0 | 23 / 35 | 4437 |
| 6 | 1 | 69.8 | 93.0 | 26 / 35 | 4354 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 97 | 79% |
| uji.Antique 1.0 | 43 | 88% |
| qohnil.blot.BlotBot 3.61 | 16 | 56% |
| pfvicm.Sobieski 7.2.3b | 10 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 83% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.PianistNano 1.2 | 1 | 100% |

Hadur died in 66 of 210 rounds, at a mean tick of 751. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 32 | 48% | 97 |
| qohnil.blot.BlotBot 3.61 | 13 | 20% | 27 |
| uji.Antique 1.0 | 11 | 17% | 44 |
| amk.ChumbaWumba 0.3 | 4 | 6% | 8 |
| pfvicm.Sobieski 7.2.3b | 2 | 3% | 12 |
| stelo.PianistNano 1.2 | 2 | 3% | 4 |
| ahr.ice.Ice 1.0.2 | 1 | 2% | 8 |
| stelo.Lifestealer 1.0 | 1 | 2% | 1 |
| matt.advanced.Katana 1.0 | 0 | 0% | 8 |

## Melee bench: F29

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 86.0 | 107 / 210 | 2.26 | 18.6% | 28487 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.6% | 107 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.7% | 55 |
| deewiant.Anomaly 0.2 | 2.8 | 14.4% | 40 |
| myl.micro.Troodon 1.10 | 4.3 | 11.6% | 2 |
| jok.PheonixM 0.1.2 | 4.7 | 10.8% | 4 |
| ph.melee.ArcherME 0.3 | 6.2 | 7.8% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.3% | 1 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 5.7% | 0 |
| jangs.ns51 1.0 | 9.3 | 4.4% | 1 |
| ap.Frederick 1.1 | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 89.5 | 20 / 35 | 4993 |
| 2 | 1 | 67.9 | 83.2 | 15 / 35 | 4505 |
| 3 | 1 | 68.3 | 87.0 | 18 / 35 | 4564 |
| 4 | 1 | 69.5 | 88.6 | 18 / 35 | 4801 |
| 5 | 1 | 67.0 | 81.0 | 16 / 35 | 4663 |
| 6 | 1 | 69.4 | 87.0 | 20 / 35 | 4961 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 60 | 57% |
| deewiant.Anomaly 0.2 | 59 | 69% |
| myl.micro.Troodon 1.10 | 21 | 100% |
| jok.PheonixM 0.1.2 | 6 | 83% |
| DBall.Anarchy 0.1 | 4 | 100% |
| ap.Frederick 1.1 | 1 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |

Hadur died in 104 of 210 rounds, at a mean tick of 938. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| deewiant.Anomaly 0.2 | 47 | 45% | 91 |
| zyx.mega.YersiniaPestis 3.1 | 36 | 35% | 63 |
| myl.micro.Troodon 1.10 | 9 | 9% | 26 |
| jok.PheonixM 0.1.2 | 7 | 7% | 14 |
| ph.melee.ArcherME 0.3 | 5 | 5% | 8 |
| DBall.Anarchy 0.1 | 0 | 0% | 6 |
| fullsail.TimbotNoPrediction 1.0 | 0 | 0% | 1 |

## Melee bench: F30

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.1 | 81.2 | 70 / 210 | 2.69 | 16.4% | 25008 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.4% | 70 |
| catcat20.Matcha 0.006 | 2.5 | 13.8% | 47 |
| darkcanuck.B26354 1.06 | 3.5 | 13.1% | 45 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.7% | 21 |
| oog.melee.Capulet 1.2 | 4.0 | 12.1% | 17 |
| intruder.PrairieWolf 2.61 | 6.8 | 8.0% | 3 |
| ntc.Opposite 1.5 | 7.3 | 7.5% | 0 |
| tripphippy.Alice 1.1 | 7.5 | 7.2% | 6 |
| fowl3628800.LightningBolt 2.6.0 | 8.3 | 6.7% | 1 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 86.0 | 17 / 35 | 4223 |
| 2 | 2 | 62.7 | 76.8 | 7 / 35 | 3846 |
| 3 | 1 | 67.4 | 86.7 | 14 / 35 | 4616 |
| 4 | 2 | 63.8 | 74.9 | 9 / 35 | 4280 |
| 5 | 1 | 62.6 | 74.9 | 6 / 35 | 3855 |
| 6 | 1 | 67.2 | 87.9 | 17 / 35 | 4188 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 41 | 39% |
| stelo.PastFuture 2.3.2 | 29 | 69% |
| darkcanuck.B26354 1.06 | 27 | 26% |
| oog.melee.Capulet 1.2 | 25 | 76% |
| tripphippy.Alice 1.1 | 3 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 3 | 100% |
| intruder.PrairieWolf 2.61 | 3 | 67% |

Hadur died in 140 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 38 | 27% | 55 |
| darkcanuck.B26354 1.06 | 38 | 27% | 44 |
| stelo.PastFuture 2.3.2 | 29 | 21% | 49 |
| oog.melee.Capulet 1.2 | 16 | 11% | 36 |
| tripphippy.Alice 1.1 | 10 | 7% | 14 |
| ntc.Opposite 1.5 | 4 | 3% | 5 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 5 |
| fowl3628800.LightningBolt 2.6.0 | 1 | 1% | 2 |

## Melee bench: F31

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 80.5 | 61 / 210 | 2.75 | 16.1% | 23424 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.2 | 17.6% | 91 |
| kc.mini.Mirage 0.2 | 1.8 | 16.1% | 61 |
| gh.mini.Griezel 0.2 | 3.3 | 13.0% | 49 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.2% | 3 |
| d414.nano.Quantum 1.0.0 | 4.8 | 10.9% | 2 |
| gh.nano.Grofvuil 0.2 | 5.7 | 9.4% | 3 |
| timmit.nano.TimDog 0.33 | 7.5 | 6.6% | 2 |
| fm.mammillarias 1.3 | 7.8 | 6.1% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.2 | 4.7% | 0 |
| tlp.ThreeLeggedPig 1 | 9.5 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 62.7 | 73.3 | 9 / 35 | 3713 |
| 2 | 2 | 65.0 | 80.6 | 9 / 35 | 4065 |
| 3 | 2 | 66.2 | 83.2 | 12 / 35 | 3906 |
| 4 | 1 | 66.4 | 84.1 | 13 / 35 | 3946 |
| 5 | 2 | 64.9 | 82.5 | 9 / 35 | 3895 |
| 6 | 2 | 64.6 | 79.4 | 9 / 35 | 3899 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 51 | 27% |
| gh.mini.Griezel 0.2 | 35 | 29% |
| spinnercat.micro.Tyger 0.1 | 20 | 95% |
| d414.nano.Quantum 1.0.0 | 12 | 83% |
| gh.nano.Grofvuil 0.2 | 7 | 100% |
| timmit.nano.TimDog 0.33 | 1 | 100% |

Hadur died in 149 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 66 | 44% | 80 |
| gh.mini.Griezel 0.2 | 44 | 30% | 52 |
| d414.nano.Quantum 1.0.0 | 14 | 9% | 23 |
| spinnercat.micro.Tyger 0.1 | 8 | 5% | 25 |
| fm.mammillarias 1.3 | 8 | 5% | 8 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 14 |
| Gecko.ultimateGeckoBot 1.0 | 3 | 2% | 4 |
| tlp.ThreeLeggedPig 1 | 1 | 1% | 2 |
| timmit.nano.TimDog 0.33 | 1 | 1% | 1 |

## Melee bench: F32

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 90.1 | 124 / 210 | 1.89 | 19.1% | 30031 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 124 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 15.0% | 55 |
| apc.botM 3.0 | 3.3 | 12.1% | 13 |
| lxx.ConceptA 0.8 | 3.7 | 11.2% | 3 |
| vjik.UnViolation 1.1 | 5.2 | 8.9% | 5 |
| bayen.UbaMicro 1.4 | 6.3 | 8.3% | 4 |
| panzer.Panzer 0.2 | 6.7 | 7.7% | 0 |
| yk.JahMicro 1.0 | 8.2 | 6.5% | 3 |
| donjezza.Jezza 1.0 | 9.3 | 5.4% | 4 |
| conscience.Electron 1.3g | 9.3 | 5.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 92.1 | 21 / 35 | 5288 |
| 2 | 1 | 71.0 | 96.8 | 27 / 35 | 5379 |
| 3 | 1 | 66.0 | 80.3 | 16 / 35 | 4891 |
| 4 | 1 | 67.7 | 89.5 | 20 / 35 | 4420 |
| 5 | 1 | 69.2 | 91.7 | 20 / 35 | 5097 |
| 6 | 1 | 68.9 | 90.2 | 20 / 35 | 4956 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 47% |
| apc.botM 3.0 | 36 | 89% |
| lxx.ConceptA 0.8 | 31 | 94% |
| vjik.UnViolation 1.1 | 10 | 100% |
| donjezza.Jezza 1.0 | 7 | 71% |
| yk.JahMicro 1.0 | 4 | 75% |
| panzer.Panzer 0.2 | 4 | 100% |
| bayen.UbaMicro 1.4 | 4 | 75% |

Hadur died in 86 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 47 | 55% | 93 |
| lxx.ConceptA 0.8 | 15 | 17% | 29 |
| apc.botM 3.0 | 11 | 13% | 44 |
| conscience.Electron 1.3g | 4 | 5% | 5 |
| donjezza.Jezza 1.0 | 3 | 3% | 9 |
| vjik.UnViolation 1.1 | 2 | 2% | 18 |
| bayen.UbaMicro 1.4 | 2 | 2% | 6 |
| yk.JahMicro 1.0 | 1 | 1% | 4 |
| panzer.Panzer 0.2 | 1 | 1% | 2 |

## Melee bench: F33

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.4 | 124 / 210 | 2.14 | 19.3% | 31396 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 124 |
| maribo.Quester 0.3 | 2.2 | 14.9% | 31 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.0 | 12.6% | 20 |
| labg.Cataclysm 2.05 | 4.5 | 10.4% | 14 |
| gre.svman4.Leonidas 1.3.2 | 4.5 | 11.1% | 15 |
| baal.nano.N 1.42 | 6.3 | 9.0% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.5 | 8.4% | 5 |
| zyx.micro.Ant 1.1 | 8.2 | 5.5% | 0 |
| sanja.First 0.1 | 8.8 | 5.0% | 1 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 10.0 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 91.1 | 24 / 35 | 5331 |
| 2 | 1 | 69.6 | 87.3 | 21 / 35 | 5357 |
| 3 | 1 | 69.1 | 87.0 | 19 / 35 | 5146 |
| 4 | 1 | 70.0 | 89.5 | 22 / 35 | 5286 |
| 5 | 1 | 67.8 | 83.5 | 18 / 35 | 4760 |
| 6 | 1 | 69.4 | 85.7 | 20 / 35 | 5516 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 53 | 81% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 50 | 78% |
| gre.svman4.Leonidas 1.3.2 | 33 | 88% |
| labg.Cataclysm 2.05 | 13 | 69% |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 75% |
| baal.nano.N 1.42 | 1 | 100% |
| sanja.First 0.1 | 1 | 0% |

Hadur died in 87 of 210 rounds, at a mean tick of 903. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 35 | 40% | 72 |
| gre.svman4.Leonidas 1.3.2 | 15 | 17% | 33 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 14 | 16% | 58 |
| labg.Cataclysm 2.05 | 12 | 14% | 28 |
| zyx.micro.Ant 1.1 | 4 | 5% | 7 |
| kinsen.melee.Angsaichmophobia 1.8c | 3 | 3% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 2 | 2% | 3 |
| baal.nano.N 1.42 | 1 | 1% | 3 |
| sanja.First 0.1 | 1 | 1% | 1 |

## Melee bench: F34

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.7 | 89 / 210 | 2.10 | 18.6% | 31526 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.6% | 89 |
| stelo.Spread 0.9 | 1.8 | 16.6% | 69 |
| kid.Gladiator .7.2 | 3.0 | 15.2% | 34 |
| jcs.Seth 1.8 | 4.5 | 10.8% | 9 |
| tcf.Reach 3 | 4.7 | 10.3% | 4 |
| cli.Dancer 1.1 | 5.8 | 9.6% | 1 |
| ratosh.Wesco 1.4 | 7.0 | 7.2% | 3 |
| amk.Punbot.Punbot 0.01 | 8.0 | 5.2% | 0 |
| sample.VelociRobot 1.0 | 9.2 | 3.6% | 1 |
| sample.RamFire 1.0 | 9.8 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.5 | 11 / 35 | 4689 |
| 2 | 1 | 70.1 | 89.5 | 17 / 35 | 5623 |
| 3 | 2 | 67.9 | 87.3 | 12 / 35 | 4628 |
| 4 | 1 | 70.0 | 89.2 | 17 / 35 | 5732 |
| 5 | 1 | 70.0 | 89.5 | 16 / 35 | 5383 |
| 6 | 1 | 69.6 | 87.3 | 16 / 35 | 5471 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 92 | 54% |
| kid.Gladiator .7.2 | 35 | 46% |
| jcs.Seth 1.8 | 15 | 80% |
| ratosh.Wesco 1.4 | 4 | 75% |
| tcf.Reach 3 | 4 | 100% |
| amk.Punbot.Punbot 0.01 | 2 | 100% |
| cli.Dancer 1.1 | 2 | 100% |
| sample.VelociRobot 1.0 | 1 | 0% |

Hadur died in 121 of 210 rounds, at a mean tick of 1033. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 62 | 51% | 103 |
| kid.Gladiator .7.2 | 32 | 26% | 51 |
| jcs.Seth 1.8 | 13 | 11% | 28 |
| cli.Dancer 1.1 | 6 | 5% | 6 |
| tcf.Reach 3 | 5 | 4% | 11 |
| ratosh.Wesco 1.4 | 2 | 2% | 7 |
| sample.VelociRobot 1.0 | 1 | 1% | 4 |

## Melee bench: F35

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.5 | 82.1 | 42 / 210 | 2.61 | 15.7% | 22056 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.2% | 135 |
| kc.mini.Mirage 0.2 | 2.0 | 15.7% | 42 |
| gh.mini.Gruwel 0.9 | 3.5 | 12.6% | 20 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.0 | 12.0% | 11 |
| rz.HawkOnFire 0.1 | 4.5 | 11.6% | 3 |
| myl.nano.KomoriNinja 1.1 | 6.3 | 6.8% | 0 |
| wit.Chuliath 1.0 | 7.0 | 6.6% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.8 | 6.0% | 0 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 80.0 | 6 / 35 | 3591 |
| 2 | 2 | 65.2 | 84.8 | 7 / 35 | 3705 |
| 3 | 2 | 64.3 | 81.3 | 8 / 35 | 3585 |
| 4 | 2 | 65.4 | 82.5 | 10 / 35 | 3956 |
| 5 | 2 | 65.8 | 85.1 | 8 / 35 | 3993 |
| 6 | 2 | 62.7 | 78.7 | 3 / 35 | 3226 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 85 | 12% |
| gh.mini.Gruwel 0.9 | 21 | 52% |
| dmh.robocode.robot.BlackDeath 9.2 | 15 | 67% |
| rz.HawkOnFire 0.1 | 13 | 85% |

Hadur died in 168 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 100 | 60% | 109 |
| gh.mini.Gruwel 0.9 | 28 | 17% | 42 |
| dmh.robocode.robot.BlackDeath 9.2 | 17 | 10% | 27 |
| rz.HawkOnFire 0.1 | 14 | 8% | 21 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 6 |
| stelo.MyAgileRobot 0.2 | 2 | 1% | 2 |
| wit.Chuliath 1.0 | 1 | 1% | 1 |
| myl.nano.KomoriNinja 1.1 | 1 | 1% | 1 |
| dans.Cinnamon 1.2 | 0 | 0% | 1 |

## Melee bench: F36

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.5 | 96.6 | 186 / 210 | 1.30 | 22.2% | 35152 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.2% | 186 |
| bzdp.Pansy 2.1 | 2.0 | 12.2% | 9 |
| alpha.RainingFire 1.0 | 3.3 | 11.2% | 10 |
| mz.Cork 0.1 | 4.2 | 10.7% | 1 |
| bvh.micro.Freya 0.3 | 4.5 | 10.3% | 3 |
| bvh.mini.Fenrir 0.39 | 6.5 | 8.7% | 0 |
| m3thos.Eva02 0.7.1 | 6.5 | 8.6% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.4% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 5.0% | 0 |
| sample.MyFirstRobot 1.0 | 9.7 | 4.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.5 | 96.5 | 30 / 35 | 5923 |
| 2 | 1 | 73.0 | 98.1 | 32 / 35 | 5859 |
| 3 | 1 | 73.1 | 99.0 | 33 / 35 | 5939 |
| 4 | 1 | 72.1 | 96.2 | 30 / 35 | 5686 |
| 5 | 1 | 71.9 | 93.7 | 29 / 35 | 5760 |
| 6 | 1 | 72.5 | 96.2 | 32 / 35 | 5985 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 62 | 94% |
| bvh.micro.Freya 0.3 | 42 | 95% |
| alpha.RainingFire 1.0 | 27 | 89% |
| mz.Cork 0.1 | 27 | 100% |
| bvh.mini.Fenrir 0.39 | 20 | 100% |
| sample.MyFirstRobot 1.0 | 7 | 100% |
| m3thos.Eva02 0.7.1 | 7 | 86% |
| dl.BetterWalls 1.0 | 4 | 100% |

Hadur died in 24 of 210 rounds, at a mean tick of 762. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 7 | 29% | 64 |
| alpha.RainingFire 1.0 | 7 | 29% | 31 |
| bvh.mini.Fenrir 0.39 | 3 | 13% | 13 |
| mz.Cork 0.1 | 2 | 8% | 33 |
| bvh.micro.Freya 0.3 | 2 | 8% | 29 |
| m3thos.Eva02 0.7.1 | 2 | 8% | 18 |
| sample.MyFirstRobot 1.0 | 1 | 4% | 11 |
| dl.BetterWalls 1.0 | 0 | 0% | 7 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 2 |

## Melee bench: F37

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 91.5 | 164 / 210 | 1.76 | 20.0% | 35124 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.0% | 164 |
| germ.TheMind .2 | 2.5 | 11.1% | 15 |
| EBBU.Sim2 1.02 | 3.2 | 10.1% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.1% | 4 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.4% | 5 |
| mb.Beast 0.1 | 6.5 | 8.4% | 5 |
| lmk.ACPFinal 0.1 | 6.5 | 8.6% | 3 |
| agrach.Dalek 1.0 | 7.3 | 8.3% | 6 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 3 |
| mn.nano.perceptual.Impact 1.3.0 | 9.5 | 7.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 89.8 | 22 / 35 | 5557 |
| 2 | 1 | 69.4 | 91.4 | 27 / 35 | 5961 |
| 3 | 1 | 69.6 | 92.4 | 29 / 35 | 5696 |
| 4 | 1 | 69.7 | 91.7 | 29 / 35 | 5908 |
| 5 | 1 | 69.3 | 90.5 | 28 / 35 | 5864 |
| 6 | 1 | 70.4 | 93.3 | 29 / 35 | 6138 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 89% |
| EBBU.Sim2 1.02 | 35 | 94% |
| stelo.UntouchableNano 1.3 | 24 | 92% |
| mb.Beast 0.1 | 23 | 96% |
| agrach.Dalek 1.0 | 16 | 100% |
| com.syncleus.robocode.Dreadnaught 0.1 | 16 | 100% |
| lmk.ACPFinal 0.1 | 11 | 82% |
| skm.Ryubot 1.0 | 11 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 47 of 210 rounds, at a mean tick of 453. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 11 | 23% | 29 |
| EBBU.Sim2 1.02 | 7 | 15% | 29 |
| lmk.ACPFinal 0.1 | 7 | 15% | 19 |
| mb.Beast 0.1 | 6 | 13% | 31 |
| germ.TheMind .2 | 6 | 13% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 11% | 8 |
| agrach.Dalek 1.0 | 2 | 4% | 26 |
| com.syncleus.robocode.Dreadnaught 0.1 | 2 | 4% | 24 |
| skm.Ryubot 1.0 | 1 | 2% | 10 |

## Melee bench: F38

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.6 | 83.1 | 100 / 210 | 2.52 | 17.3% | 26788 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 17.3% | 100 |
| justin.Mallais 14.0 | 1.8 | 16.1% | 67 |
| bvh.mini.Freya 0.55 | 3.0 | 13.2% | 20 |
| cs.Wren 1.0 | 4.8 | 10.4% | 3 |
| bts.mega.Gnarly 1.4 | 5.3 | 9.8% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.5 | 9.5% | 5 |
| kdf.KoulDestroyer 1.0 | 6.3 | 9.3% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.0% | 1 |
| matt.UnderDark3 2.4.34 | 9.2 | 4.3% | 0 |
| bzdp.BoxCar 2.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.9 | 81.3 | 14 / 35 | 4409 |
| 2 | 2 | 66.2 | 81.6 | 16 / 35 | 4352 |
| 3 | 1 | 67.4 | 83.2 | 18 / 35 | 4578 |
| 4 | 1 | 65.0 | 79.4 | 14 / 35 | 4178 |
| 5 | 1 | 66.2 | 82.2 | 15 / 35 | 4547 |
| 6 | 1 | 69.1 | 90.8 | 23 / 35 | 4724 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 66 | 62% |
| bvh.mini.Freya 0.55 | 25 | 68% |
| bts.mega.Gnarly 1.4 | 17 | 76% |
| cs.Wren 1.0 | 15 | 100% |
| davidalves.net.DuelistNanoMelee 1.01 | 10 | 80% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| kawigi.spare.SpareParts 0.7.6nosnd | 3 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 710. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 40% | 86 |
| bvh.mini.Freya 0.55 | 26 | 24% | 37 |
| bts.mega.Gnarly 1.4 | 11 | 10% | 27 |
| cs.Wren 1.0 | 9 | 8% | 20 |
| kdf.KoulDestroyer 1.0 | 9 | 8% | 13 |
| davidalves.net.DuelistNanoMelee 1.01 | 8 | 7% | 18 |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 2% | 6 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 0 | 0% | 1 |

## Melee bench: F39

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.6 | 115 / 210 | 2.02 | 18.8% | 30272 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 115 |
| bvh.fry.Freya 0.82 | 2.2 | 14.6% | 19 |
| az.Ololobot 0.2.4 | 3.0 | 12.8% | 48 |
| catcat20.Lambda 0.024 | 3.8 | 11.0% | 16 |
| winamp32.micro.MicroMacro 1.0 | 5.5 | 8.3% | 3 |
| stelo.SoRobotNanoMelee 1.2 | 6.2 | 8.5% | 9 |
| gimp.GimpBot 0.1 | 6.8 | 7.8% | 0 |
| apollokidd.ApolloKidd 0.9 | 7.7 | 7.2% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.8 | 6.1% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 10.0 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 90.8 | 22 / 35 | 4992 |
| 2 | 1 | 69.9 | 92.4 | 21 / 35 | 5427 |
| 3 | 1 | 68.5 | 90.2 | 20 / 35 | 5123 |
| 4 | 1 | 66.0 | 82.9 | 14 / 35 | 4837 |
| 5 | 1 | 67.2 | 84.8 | 17 / 35 | 4884 |
| 6 | 1 | 69.1 | 90.8 | 21 / 35 | 5009 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 54 | 50% |
| bvh.fry.Freya 0.82 | 47 | 83% |
| catcat20.Lambda 0.024 | 36 | 78% |
| stelo.SoRobotNanoMelee 1.2 | 22 | 91% |
| winamp32.micro.MicroMacro 1.0 | 2 | 0% |
| whitesquare.robots.SkynetAdvanced 1.1 | 1 | 100% |

Hadur died in 97 of 210 rounds, at a mean tick of 1142. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 34 | 35% | 67 |
| bvh.fry.Freya 0.82 | 30 | 31% | 59 |
| catcat20.Lambda 0.024 | 16 | 16% | 41 |
| stelo.SoRobotNanoMelee 1.2 | 10 | 10% | 19 |
| winamp32.micro.MicroMacro 1.0 | 4 | 4% | 10 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 3 |
| gimp.GimpBot 0.1 | 1 | 1% | 6 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 2 |

## Melee bench: F40

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.9 | 132 / 210 | 2.09 | 19.2% | 30211 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 132 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.5% | 40 |
| kano.gamma.KanoGamma 1.8 | 3.3 | 12.1% | 19 |
| mz.AntiGrav 1.0 | 3.8 | 11.4% | 6 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.2% | 5 |
| alpha.BlackIce 1.0 | 6.2 | 8.8% | 3 |
| stelo.Randomness 1.0 | 6.7 | 8.3% | 3 |
| amk.superstrike.SuperStrike 0.3 | 8.3 | 6.1% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.7 | 5.3% | 2 |
| sample.Corners 1.0 | 10.0 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 92.7 | 27 / 35 | 5513 |
| 2 | 1 | 68.3 | 85.1 | 20 / 35 | 4962 |
| 3 | 1 | 69.8 | 90.8 | 23 / 35 | 4911 |
| 4 | 1 | 68.5 | 86.0 | 18 / 35 | 5022 |
| 5 | 1 | 68.0 | 85.1 | 20 / 35 | 4831 |
| 6 | 1 | 69.1 | 87.9 | 24 / 35 | 4972 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 61 | 72% |
| kano.gamma.KanoGamma 1.8 | 34 | 82% |
| mz.AntiGrav 1.0 | 29 | 100% |
| Polkwane.SmashMelee 1.0 | 17 | 94% |
| stelo.Randomness 1.0 | 8 | 100% |
| alpha.BlackIce 1.0 | 4 | 75% |
| sample.Corners 1.0 | 3 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 28 | 36% | 59 |
| kano.gamma.KanoGamma 1.8 | 11 | 14% | 40 |
| alpha.BlackIce 1.0 | 11 | 14% | 17 |
| mz.AntiGrav 1.0 | 7 | 9% | 29 |
| Polkwane.SmashMelee 1.0 | 7 | 9% | 28 |
| stelo.Randomness 1.0 | 6 | 8% | 15 |
| amk.superstrike.SuperStrike 0.3 | 6 | 8% | 11 |
| sample.Corners 1.0 | 1 | 1% | 6 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 4 |

## Melee bench: F41

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 89.4 | 120 / 210 | 1.96 | 18.8% | 27537 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 120 |
| eem.EvBotNG v12.8 | 2.3 | 15.4% | 54 |
| ary.Swarm 1.1 | 3.0 | 13.1% | 15 |
| lessonz.robocode.Oz 0.5.0 | 3.7 | 12.4% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.0 | 10.5% | 7 |
| shrub.Silver v048 | 6.5 | 8.9% | 0 |
| zyx.nano.Ant 1.1 | 6.7 | 7.7% | 0 |
| jsal.Jsalbot 1.0 | 7.8 | 5.8% | 4 |
| stelo.Mirror 1.1 | 9.0 | 5.1% | 0 |
| acogdev.alpha 0.2 | 10.0 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 90.8 | 23 / 35 | 4853 |
| 2 | 1 | 68.4 | 88.3 | 17 / 35 | 4351 |
| 3 | 1 | 67.7 | 87.6 | 19 / 35 | 3891 |
| 4 | 1 | 69.2 | 91.7 | 21 / 35 | 4362 |
| 5 | 1 | 69.7 | 89.5 | 21 / 35 | 5043 |
| 6 | 1 | 69.3 | 88.3 | 19 / 35 | 5037 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 74 | 64% |
| ary.Swarm 1.1 | 33 | 85% |
| lessonz.robocode.Oz 0.5.0 | 31 | 87% |
| simonton.nano.MeleeSeed 1.8 | 16 | 94% |
| jsal.Jsalbot 1.0 | 2 | 100% |
| zyx.nano.Ant 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 896. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 45 | 50% | 90 |
| ary.Swarm 1.1 | 16 | 18% | 42 |
| simonton.nano.MeleeSeed 1.8 | 11 | 12% | 27 |
| lessonz.robocode.Oz 0.5.0 | 10 | 11% | 31 |
| zyx.nano.Ant 1.1 | 3 | 3% | 6 |
| shrub.Silver v048 | 2 | 2% | 5 |
| jsal.Jsalbot 1.0 | 2 | 2% | 3 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

## Melee bench: F42

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 91.1 | 138 / 210 | 1.80 | 19.7% | 32219 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 138 |
| wompi.Wallaby 5.1 | 2.3 | 14.0% | 34 |
| ara.Shera 0.88 | 3.3 | 13.8% | 24 |
| maribo.mini.MiniQuester 0.1 | 3.3 | 13.1% | 11 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 1 |
| maribo.IotaCT 1.1 | 6.0 | 7.4% | 0 |
| dsw.StaticD 1.0 | 7.0 | 6.9% | 2 |
| stelo.MirrorMicro 1.0 | 8.2 | 6.1% | 0 |
| mme.NikeEnhanced 2.0 | 9.0 | 5.4% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 95.9 | 30 / 35 | 5817 |
| 2 | 1 | 70.8 | 93.3 | 24 / 35 | 5662 |
| 3 | 1 | 68.1 | 86.7 | 18 / 35 | 4917 |
| 4 | 1 | 70.2 | 92.7 | 23 / 35 | 5545 |
| 5 | 1 | 68.9 | 90.5 | 22 / 35 | 4962 |
| 6 | 1 | 69.0 | 87.3 | 21 / 35 | 5316 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 62 | 79% |
| maribo.mini.MiniQuester 0.1 | 51 | 92% |
| wompi.Wallaby 5.1 | 45 | 80% |
| amz.NanoClone 1.41 | 3 | 67% |
| dsw.StaticD 1.0 | 2 | 100% |
| maribo.IotaCT 1.1 | 2 | 100% |

Hadur died in 73 of 210 rounds, at a mean tick of 891. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 31 | 42% | 71 |
| wompi.Wallaby 5.1 | 19 | 26% | 62 |
| maribo.mini.MiniQuester 0.1 | 15 | 21% | 55 |
| amz.NanoClone 1.41 | 5 | 7% | 12 |
| dsw.StaticD 1.0 | 2 | 3% | 6 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| stelo.MirrorMicro 1.0 | 0 | 0% | 1 |

## Melee bench: F43

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.2 | 80.2 | 27 / 210 | 2.78 | 15.5% | 23772 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.9% | 148 |
| kc.mini.Mirage 0.2 | 2.0 | 15.5% | 27 |
| brainfade.melee.Dusk 0.44 | 3.2 | 12.1% | 19 |
| dummy.micro.Sparrow 2.5 | 4.0 | 11.3% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 5.2 | 10.6% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.7 | 9.9% | 2 |
| mz.NanoGod 2.02 | 7.3 | 7.6% | 1 |
| jab.DiamondStealer 5 | 7.7 | 7.3% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.0% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.0 | 82.5 | 4 / 35 | 4006 |
| 2 | 2 | 64.0 | 74.9 | 4 / 35 | 3978 |
| 3 | 2 | 64.1 | 77.5 | 5 / 35 | 3839 |
| 4 | 2 | 65.7 | 79.7 | 5 / 35 | 4134 |
| 5 | 2 | 66.0 | 82.5 | 4 / 35 | 4078 |
| 6 | 2 | 65.7 | 84.1 | 5 / 35 | 3737 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 95 | 11% |
| brainfade.melee.Dusk 0.44 | 11 | 27% |
| dummy.micro.Sparrow 2.5 | 7 | 71% |
| wcsv.melee.EngineerMelee 0.1 | 7 | 71% |
| jab.DiamondStealer 5 | 2 | 100% |
| mz.NanoGod 2.02 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 183 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 119 | 65% | 130 |
| brainfade.melee.Dusk 0.44 | 26 | 14% | 31 |
| wcsv.melee.EngineerMelee 0.1 | 16 | 9% | 20 |
| dummy.micro.Sparrow 2.5 | 15 | 8% | 18 |
| Krabb.akim2.Akim2 1.1b | 4 | 2% | 4 |
| mz.NanoGod 2.02 | 2 | 1% | 3 |
| jab.DiamondStealer 5 | 1 | 1% | 3 |
| cvt.Firsty 1.0 | 0 | 0% | 1 |

## Melee bench: F44

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 8 over 6 battles (1.3 per battle, most in one battle 4). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.4 | 94.4 | 157 / 210 | 1.50 | 21.1% | 34643 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.1% | 157 |
| stelo.Liblix 0.3.1 | 2.2 | 14.3% | 39 |
| tzu.TheArtOfWar 1.2 | 2.8 | 12.6% | 12 |
| wompi.Quokka 1.6 | 4.7 | 9.8% | 1 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.3 | 9.0% | 0 |
| jwirde.Gort 2.0 | 5.5 | 9.1% | 0 |
| disan.Chair 2.2.0 | 6.5 | 7.9% | 2 |
| stf.PanzerGeneral 0.1 | 8.0 | 6.5% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.2 | 5.3% | 0 |
| sample.Crazy 1.0 | 9.8 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.6 | 95.9 | 25 / 35 | 5933 |
| 2 | 1 | 71.0 | 94.9 | 23 / 35 | 5630 |
| 3 | 1 | 72.0 | 94.6 | 27 / 35 | 6176 |
| 4 | 1 | 71.4 | 94.6 | 28 / 35 | 5578 |
| 5 | 1 | 71.4 | 94.0 | 27 / 35 | 5605 |
| 6 | 1 | 71.2 | 92.4 | 27 / 35 | 5721 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 85 | 71% |
| tzu.TheArtOfWar 1.2 | 67 | 88% |
| wompi.Quokka 1.6 | 14 | 100% |
| jwirde.Gort 2.0 | 8 | 100% |
| disan.Chair 2.2.0 | 7 | 86% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 2 | 100% |

Hadur died in 54 of 210 rounds, at a mean tick of 968. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 37 | 69% | 104 |
| tzu.TheArtOfWar 1.2 | 9 | 17% | 59 |
| wompi.Quokka 1.6 | 2 | 4% | 11 |
| disan.Chair 2.2.0 | 2 | 4% | 7 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 2 | 4% | 7 |
| jwirde.Gort 2.0 | 1 | 2% | 9 |
| stf.PanzerGeneral 0.1 | 0 | 0% | 7 |
| amk.jointstrike.JointStrike 0.2 | 0 | 0% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 2 |
1 death(s) with no robot to name.

## Melee bench: F45

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 7 over 6 battles (1.2 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.7 | 90.8 | 102 / 210 | 1.83 | 20.7% | 37495 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 102 |
| eem.IWillFireNoBullet v2.8 | 2.3 | 12.8% | 92 |
| jje.BagPuss 1.2 | 3.0 | 12.3% | 5 |
| sul.Lunar 1.1 | 4.3 | 10.2% | 4 |
| myl.nano.Graviton 1.10 | 4.5 | 10.1% | 2 |
| fm.claire 1.7 | 6.3 | 8.4% | 0 |
| hvilela.HVilela 0.9 | 7.0 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.3% | 3 |
| wit.Deep7 2.0 | 9.2 | 5.4% | 2 |
| abud.ThirdRobo 1.0 | 9.8 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 89.8 | 15 / 35 | 6027 |
| 2 | 1 | 70.2 | 89.2 | 16 / 35 | 6246 |
| 3 | 1 | 71.3 | 94.3 | 18 / 35 | 6146 |
| 4 | 1 | 71.0 | 90.8 | 18 / 35 | 6356 |
| 5 | 1 | 71.5 | 90.8 | 17 / 35 | 6750 |
| 6 | 1 | 70.4 | 89.8 | 18 / 35 | 5970 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 109 | 36% |
| jje.BagPuss 1.2 | 24 | 100% |
| sul.Lunar 1.1 | 19 | 95% |
| myl.nano.Graviton 1.10 | 13 | 92% |
| pez.mini.ChironexFleckeri 0.5 | 8 | 63% |
| wit.Deep7 2.0 | 5 | 60% |
| fm.claire 1.7 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 2008. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 72 | 67% | 0 |
| jje.BagPuss 1.2 | 8 | 7% | 70 |
| myl.nano.Graviton 1.10 | 8 | 7% | 31 |
| fm.claire 1.7 | 7 | 6% | 13 |
| pez.mini.ChironexFleckeri 0.5 | 5 | 5% | 21 |
| sul.Lunar 1.1 | 4 | 4% | 47 |
| wit.Deep7 2.0 | 3 | 3% | 16 |
| hvilela.HVilela 0.9 | 1 | 1% | 6 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 5 over 6 battles (0.8 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.5 | 84.4 | 63 / 210 | 2.40 | 16.9% | 27332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.7 | 16.9% | 63 |
| rsalesc.melee.Medina 0.4.5 | 2.2 | 16.1% | 68 |
| hadur117.mini.Deise 0.3 | 2.2 | 16.3% | 59 |
| mz.MicroSheep 1.0 | 4.5 | 10.2% | 2 |
| cx.Princess 1.0 | 4.8 | 10.2% | 16 |
| sadoner.killer 0.2 | 5.8 | 9.2% | 1 |
| arthord.NanoSatanMelee Beta | 6.8 | 7.7% | 2 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.5% | 0 |
| kurios.DOSexe .9a | 9.2 | 4.5% | 0 |
| mbro.Detektor3 0.1.1 | 9.8 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 65.6 | 81.3 | 7 / 35 | 4449 |
| 2 | 2 | 66.6 | 85.1 | 9 / 35 | 4575 |
| 3 | 1 | 66.5 | 85.7 | 11 / 35 | 4339 |
| 4 | 2 | 65.9 | 82.5 | 12 / 35 | 4402 |
| 5 | 1 | 67.3 | 87.6 | 10 / 35 | 4722 |
| 6 | 1 | 67.2 | 84.4 | 14 / 35 | 4845 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 60 | 30% |
| hadur117.mini.Deise 0.3 | 49 | 49% |
| cx.Princess 1.0 | 16 | 50% |
| mz.MicroSheep 1.0 | 8 | 88% |
| sadoner.killer 0.2 | 5 | 80% |
| arthord.NanoSatanMelee Beta | 2 | 50% |
| jeremyreeder.collective.Prophet 5 | 1 | 100% |

Hadur died in 148 of 210 rounds, at a mean tick of 940. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 65 | 44% | 80 |
| hadur117.mini.Deise 0.3 | 53 | 36% | 85 |
| cx.Princess 1.0 | 19 | 13% | 22 |
| mz.MicroSheep 1.0 | 4 | 3% | 11 |
| arthord.NanoSatanMelee Beta | 3 | 2% | 3 |
| sadoner.killer 0.2 | 1 | 1% | 6 |
| kurios.DOSexe .9a | 1 | 1% | 2 |
| mbro.Detektor3 0.1.1 | 1 | 1% | 1 |
1 death(s) with no robot to name.

