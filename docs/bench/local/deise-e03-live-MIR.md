# Bench suite: suite.txt

## Melee bench: F01

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 83.6 | 45 / 210 | 2.48 | 17.0% | 31818 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.9% | 131 |
| kc.mini.Mirage 0.2 | 2.0 | 17.0% | 45 |
| sgp.JollyNinja 3.53 | 3.0 | 12.1% | 19 |
| mz.MicroGodMelee 1 | 4.3 | 10.7% | 9 |
| simonton.nano.WeekendObsession_Melee 1.0 | 4.7 | 10.7% | 1 |
| lorneswork.Predator 1.0 | 6.0 | 9.0% | 4 |
| adt.Ar2 1.0 | 7.0 | 7.2% | 0 |
| skm.butterfly 1.0 | 8.5 | 4.7% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.5 | 5.3% | 1 |
| mym.EdgeStalker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.3 | 82.9 | 8 / 35 | 5199 |
| 2 | 2 | 66.1 | 83.2 | 5 / 35 | 5054 |
| 3 | 2 | 67.9 | 85.4 | 11 / 35 | 5529 |
| 4 | 2 | 67.2 | 84.8 | 7 / 35 | 5217 |
| 5 | 2 | 65.9 | 80.3 | 8 / 35 | 5256 |
| 6 | 2 | 67.4 | 85.1 | 6 / 35 | 5563 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 111 | 12% |
| sgp.JollyNinja 3.53 | 15 | 67% |
| mz.MicroGodMelee 1 | 12 | 92% |
| simonton.nano.WeekendObsession_Melee 1.0 | 5 | 100% |
| lorneswork.Predator 1.0 | 4 | 75% |
| adt.Ar2 1.0 | 2 | 100% |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 100% |

Hadur died in 165 of 210 rounds, at a mean tick of 982. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 118 | 72% | 134 |
| sgp.JollyNinja 3.53 | 23 | 14% | 30 |
| simonton.nano.WeekendObsession_Melee 1.0 | 11 | 7% | 17 |
| mz.MicroGodMelee 1 | 6 | 4% | 18 |
| lorneswork.Predator 1.0 | 4 | 2% | 7 |
| adt.Ar2 1.0 | 2 | 1% | 2 |
| kawigi.sbf.FloodSonnet 0.9 | 1 | 1% | 2 |

## Melee bench: F02

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.5 | 86.4 | 102 / 210 | 2.22 | 18.9% | 32429 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.9% | 102 |
| pulsar.PulsarMax 0.8.9 | 2.2 | 14.2% | 59 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 3.0 | 12.4% | 22 |
| lrem.micro.SpikeSoldier 0.4 | 4.0 | 11.0% | 1 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.3 | 9.0% | 6 |
| fnc.bandit.Bandit 5.2.0 | 6.0 | 8.3% | 1 |
| stelo.PatternRobot 1.0 | 7.3 | 7.5% | 7 |
| sch.Simone 0.3d | 7.7 | 7.5% | 6 |
| Noran.BitchingElk 0.054 | 8.5 | 6.7% | 5 |
| fullsail.SweetTea 1.1 | 10.0 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 84.4 | 16 / 35 | 5572 |
| 2 | 1 | 68.6 | 88.3 | 17 / 35 | 5218 |
| 3 | 1 | 67.3 | 83.8 | 17 / 35 | 5030 |
| 4 | 1 | 70.2 | 91.7 | 21 / 35 | 5710 |
| 5 | 1 | 68.1 | 84.4 | 14 / 35 | 5642 |
| 6 | 1 | 68.3 | 85.7 | 17 / 35 | 5257 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 55 | 33% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 42 | 74% |
| lrem.micro.SpikeSoldier 0.4 | 16 | 100% |
| sch.Simone 0.3d | 12 | 92% |
| stelo.PatternRobot 1.0 | 11 | 91% |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 86% |
| Noran.BitchingElk 0.054 | 6 | 83% |
| fnc.bandit.Bandit 5.2.0 | 4 | 75% |
| fullsail.SweetTea 1.1 | 3 | 67% |

Hadur died in 109 of 210 rounds, at a mean tick of 919. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 54 | 50% | 77 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 25 | 23% | 52 |
| stelo.PatternRobot 1.0 | 9 | 8% | 17 |
| lrem.micro.SpikeSoldier 0.4 | 5 | 5% | 14 |
| fnc.bandit.Bandit 5.2.0 | 5 | 5% | 9 |
| sch.Simone 0.3d | 4 | 4% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 3 | 3% | 13 |
| fullsail.SweetTea 1.1 | 3 | 3% | 9 |
| Noran.BitchingElk 0.054 | 1 | 1% | 4 |

## Melee bench: F03

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 3 other Robocode JVMs running (hadur.bench.MeleeRunner x3), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.1 | 93.8 | 166 / 210 | 1.56 | 20.8% | 38133 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 166 |
| radnor.DoctorBob 1.42 | 2.5 | 13.7% | 17 |
| kawigi.nano.Lib 1.0 | 3.0 | 12.9% | 11 |
| vuen.Cake 2.51 | 3.5 | 12.5% | 15 |
| urdos.URDOS 1.3 | 5.0 | 9.4% | 0 |
| adt.Ar1 2.1 | 6.7 | 7.4% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.3 | 6.8% | 0 |
| oa.weak.FlyMk1 0.1 | 7.7 | 6.2% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.3 | 5.9% | 1 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.9 | 94.9 | 30 / 35 | 5914 |
| 2 | 1 | 70.8 | 92.4 | 27 / 35 | 6336 |
| 3 | 1 | 70.9 | 93.0 | 28 / 35 | 6323 |
| 4 | 1 | 71.0 | 93.3 | 24 / 35 | 6368 |
| 5 | 1 | 71.4 | 94.9 | 30 / 35 | 6486 |
| 6 | 1 | 71.6 | 94.0 | 27 / 35 | 6706 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 67 | 87% |
| kawigi.nano.Lib 1.0 | 66 | 95% |
| radnor.DoctorBob 1.42 | 38 | 95% |
| oa.weak.FlyMk1 0.1 | 6 | 100% |
| de.simpleworks.robocode.bots.swiBot 1.0 | 2 | 50% |
| ghent.ArthurPanzergon 1.0.0 | 1 | 100% |
| adt.Ar1 2.1 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 659. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.nano.Lib 1.0 | 15 | 34% | 73 |
| vuen.Cake 2.51 | 11 | 25% | 72 |
| radnor.DoctorBob 1.42 | 9 | 20% | 42 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 7% | 6 |
| oa.weak.FlyMk1 0.1 | 2 | 5% | 7 |
| urdos.URDOS 1.3 | 2 | 5% | 3 |
| adt.Ar1 2.1 | 1 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 1 | 2% | 2 |

## Melee bench: F04

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 86.1 | 18 / 210 | 2.25 | 17.4% | 34062 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 186 |
| kc.mini.Mirage 0.2 | 2.0 | 17.4% | 18 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.7% | 4 |
| TNT.TNT 0.99.1 | 4.0 | 10.4% | 2 |
| josago.Jorgito 0.16 | 5.0 | 8.4% | 0 |
| css.Delitioner 0.11 | 6.3 | 7.1% | 0 |
| tj.zombie1n 1.0.1 | 6.7 | 6.7% | 0 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| sp.Nanos.Ember 1.1 | 9.3 | 4.2% | 0 |
| spin.Bugstard 0.012b | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.2 | 85.4 | 3 / 35 | 5855 |
| 2 | 2 | 68.3 | 85.4 | 5 / 35 | 5826 |
| 3 | 2 | 67.9 | 86.3 | 3 / 35 | 5600 |
| 4 | 2 | 68.5 | 88.3 | 2 / 35 | 5665 |
| 5 | 2 | 67.3 | 85.4 | 2 / 35 | 5408 |
| 6 | 2 | 67.6 | 86.0 | 3 / 35 | 5708 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 159 | 8% |
| apc.LeeroyJenkins2 1.0 | 4 | 50% |
| spin.Bugstard 0.012b | 2 | 100% |
| josago.Jorgito 0.16 | 1 | 100% |
| css.Delitioner 0.11 | 1 | 100% |

Hadur died in 192 of 210 rounds, at a mean tick of 1169. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 167 | 87% | 179 |
| apc.LeeroyJenkins2 1.0 | 9 | 5% | 12 |
| TNT.TNT 0.99.1 | 8 | 4% | 8 |
| josago.Jorgito 0.16 | 5 | 3% | 6 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 1 | 1% | 3 |

## Melee bench: F05

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.1 | 76.2 | 26 / 210 | 3.14 | 14.6% | 22949 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.4% | 111 |
| justin.DemonicRage 3.4 | 1.8 | 16.8% | 53 |
| kc.mini.Mirage 0.2 | 3.0 | 14.6% | 26 |
| wompi.Numbat 2.1 | 4.0 | 12.1% | 11 |
| ms.Ares 0.19 | 5.2 | 9.2% | 4 |
| axeBots.HataMoto 3.09 | 5.8 | 8.5% | 5 |
| supersample.SuperBoxBot 1.0 | 7.3 | 6.3% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.5% | 0 |
| GarmBox.Oranges 1.0 | 9.2 | 4.4% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 74.3 | 5 / 35 | 3687 |
| 2 | 3 | 63.5 | 78.7 | 4 / 35 | 3751 |
| 3 | 3 | 62.5 | 75.2 | 3 / 35 | 3705 |
| 4 | 3 | 63.3 | 76.8 | 4 / 35 | 3643 |
| 5 | 3 | 62.9 | 74.0 | 5 / 35 | 4229 |
| 6 | 3 | 63.8 | 78.4 | 5 / 35 | 3934 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 43 | 9% |
| justin.DemonicRage 3.4 | 41 | 34% |
| wompi.Numbat 2.1 | 5 | 100% |
| ms.Ares 0.19 | 2 | 50% |
| axeBots.HataMoto 3.09 | 2 | 100% |

Hadur died in 184 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 78 | 42% | 84 |
| justin.DemonicRage 3.4 | 63 | 34% | 75 |
| wompi.Numbat 2.1 | 20 | 11% | 21 |
| axeBots.HataMoto 3.09 | 11 | 6% | 14 |
| supersample.SuperBoxBot 1.0 | 7 | 4% | 7 |
| ms.Ares 0.19 | 3 | 2% | 6 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.6 | 138 / 210 | 1.84 | 19.4% | 29262 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.4% | 138 |
| jekl.StoneGhost 0.7 | 2.3 | 14.4% | 28 |
| origin.SleepSiphon 1.7b | 2.7 | 13.3% | 29 |
| mld.Wisdom 1.0 | 4.2 | 11.6% | 3 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.8 | 10.8% | 11 |
| gg.Wolverine 2.0 | 6.0 | 7.8% | 0 |
| spinnercat.Omen 1.0 | 7.5 | 6.7% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.0 | 6.6% | 0 |
| DBall.NUKE 0.1 | 8.5 | 6.1% | 1 |
| sample.Fire 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 91.7 | 24 / 35 | 5194 |
| 2 | 1 | 68.2 | 85.7 | 19 / 35 | 4890 |
| 3 | 1 | 68.2 | 86.3 | 20 / 35 | 4535 |
| 4 | 1 | 70.7 | 94.6 | 27 / 35 | 4880 |
| 5 | 1 | 69.9 | 92.4 | 23 / 35 | 4869 |
| 6 | 1 | 69.9 | 93.0 | 25 / 35 | 4894 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 56 | 77% |
| origin.SleepSiphon 1.7b | 55 | 71% |
| pe.minimelee.SandboxMiniMelee 1.1 | 31 | 90% |
| mld.Wisdom 1.0 | 11 | 91% |
| gg.Wolverine 2.0 | 9 | 100% |
| ers.nano.hawk.HawkLA 3.0m | 6 | 100% |
| DBall.NUKE 0.1 | 2 | 50% |
| spinnercat.Omen 1.0 | 1 | 100% |
| sample.Fire 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 22 | 31% | 71 |
| jekl.StoneGhost 0.7 | 22 | 31% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 14 | 19% | 39 |
| mld.Wisdom 1.0 | 7 | 10% | 16 |
| DBall.NUKE 0.1 | 3 | 4% | 3 |
| ers.nano.hawk.HawkLA 3.0m | 2 | 3% | 11 |
| gg.Wolverine 2.0 | 2 | 3% | 5 |
| sample.Fire 1.0 | 0 | 0% | 5 |
| spinnercat.Omen 1.0 | 0 | 0% | 1 |

## Melee bench: F07

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 92.6 | 128 / 210 | 1.67 | 20.6% | 38231 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.6% | 128 |
| rsalesc.melee.Monk 0.3.6c | 2.2 | 17.0% | 47 |
| rtk.Tachikoma 1.0 | 2.8 | 16.0% | 21 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 10.7% | 3 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 11 |
| lrem.micro.MoggFanatic 0.2 | 6.0 | 8.3% | 0 |
| exauge.GateKeeper 1.1.121g | 7.0 | 7.6% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 4.8% | 0 |
| sample.Target 1.0 | 9.5 | 2.3% | 0 |
| drd.Dreadknoght 0.9 | 9.5 | 2.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 91.1 | 18 / 35 | 6310 |
| 2 | 1 | 71.9 | 91.1 | 21 / 35 | 6529 |
| 3 | 1 | 71.4 | 92.1 | 19 / 35 | 6095 |
| 4 | 1 | 71.6 | 91.7 | 19 / 35 | 6047 |
| 5 | 1 | 73.1 | 94.9 | 24 / 35 | 6690 |
| 6 | 1 | 73.2 | 94.6 | 27 / 35 | 6560 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 91 | 82% |
| rsalesc.melee.Monk 0.3.6c | 44 | 30% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| franzor.Lizt 1.3.1 | 12 | 75% |
| exauge.GateKeeper 1.1.121g | 3 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 1156. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 41 | 50% | 62 |
| rtk.Tachikoma 1.0 | 28 | 34% | 104 |
| oog.melee.CapuletDroid 1.1 | 8 | 10% | 32 |
| franzor.Lizt 1.3.1 | 3 | 4% | 1 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 6 |
| skm.PateranBotlock2 1.0 | 1 | 1% | 1 |
| drd.Dreadknoght 0.9 | 0 | 0% | 1 |

## Melee bench: F08

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 90.5 | 144 / 210 | 1.86 | 20.2% | 33912 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 144 |
| tm.Yuugao 1.0 | 2.2 | 12.7% | 20 |
| shrub.Vapour v159 | 3.2 | 11.6% | 18 |
| Krabb.sliNk.Garm 0.9u | 4.0 | 10.7% | 13 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.8% | 7 |
| jwst.DAD.DarkAndDarker 1.1 | 6.3 | 8.2% | 5 |
| m3thos.Eva00 1.1 | 6.5 | 8.6% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.3 | 6.4% | 1 |
| zyx.nano.BacillusComma 1.0 | 9.0 | 5.9% | 0 |
| SHAM.WOW 1.4 | 9.7 | 5.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.0 | 27 / 35 | 5477 |
| 2 | 1 | 70.1 | 91.1 | 24 / 35 | 5519 |
| 3 | 1 | 69.9 | 89.2 | 23 / 35 | 5593 |
| 4 | 1 | 69.4 | 87.6 | 21 / 35 | 5916 |
| 5 | 1 | 69.7 | 90.2 | 24 / 35 | 5715 |
| 6 | 1 | 69.9 | 90.8 | 25 / 35 | 5692 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 63 | 78% |
| shrub.Vapour v159 | 34 | 79% |
| Krabb.sliNk.Garm 0.9u | 30 | 80% |
| com.spp.robocode.MostlyHarmless 010 | 22 | 91% |
| jwst.DAD.DarkAndDarker 1.1 | 15 | 93% |
| m3thos.Eva00 1.1 | 6 | 100% |
| qualidafial.MajorDick 1.0.1 | 4 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 835. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 22 | 32% | 76 |
| Krabb.sliNk.Garm 0.9u | 14 | 21% | 27 |
| shrub.Vapour v159 | 13 | 19% | 42 |
| com.spp.robocode.MostlyHarmless 010 | 5 | 7% | 23 |
| zyx.nano.BacillusComma 1.0 | 5 | 7% | 8 |
| jwst.DAD.DarkAndDarker 1.1 | 3 | 4% | 19 |
| m3thos.Eva00 1.1 | 3 | 4% | 11 |
| SHAM.WOW 1.4 | 3 | 4% | 3 |

## Melee bench: F09

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 79.1 | 70 / 210 | 2.88 | 16.4% | 25381 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| positive.Portia 1.26e | 1.3 | 17.0% | 90 |
| kc.mini.Mirage 0.2 | 1.7 | 16.4% | 70 |
| kc.micro.Figment 1.0 | 3.0 | 13.9% | 27 |
| yagami.Tidus 0.11 | 4.5 | 10.6% | 1 |
| pedersen.Grishnakh 1.0 | 4.8 | 10.6% | 13 |
| mc2.enemy.Original 0.9 | 5.7 | 9.4% | 7 |
| dft.Calliope 5.6 | 7.3 | 7.3% | 2 |
| robar.nano.Assertive_Melee 0.2 | 8.3 | 5.3% | 0 |
| step.nanoPri 1.0 | 8.7 | 5.1% | 0 |
| rdm.Dueler 0.4x | 9.7 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.7 | 79.7 | 13 / 35 | 4245 |
| 2 | 2 | 66.3 | 80.3 | 12 / 35 | 4645 |
| 3 | 1 | 65.6 | 81.0 | 13 / 35 | 4185 |
| 4 | 1 | 66.3 | 82.5 | 10 / 35 | 4401 |
| 5 | 2 | 65.1 | 77.5 | 13 / 35 | 4309 |
| 6 | 2 | 62.6 | 73.7 | 9 / 35 | 3596 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 56 | 38% |
| kc.micro.Figment 1.0 | 36 | 81% |
| pedersen.Grishnakh 1.0 | 10 | 60% |
| mc2.enemy.Original 0.9 | 8 | 75% |
| yagami.Tidus 0.11 | 6 | 100% |
| dft.Calliope 5.6 | 3 | 67% |

Hadur died in 140 of 210 rounds, at a mean tick of 812. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 63 | 45% | 86 |
| kc.micro.Figment 1.0 | 28 | 20% | 54 |
| mc2.enemy.Original 0.9 | 14 | 10% | 19 |
| yagami.Tidus 0.11 | 12 | 9% | 23 |
| pedersen.Grishnakh 1.0 | 8 | 6% | 10 |
| robar.nano.Assertive_Melee 0.2 | 5 | 4% | 6 |
| rdm.Dueler 0.4x | 4 | 3% | 4 |
| dft.Calliope 5.6 | 3 | 2% | 5 |
| step.nanoPri 1.0 | 3 | 2% | 3 |

## Melee bench: F10

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.8 | 94.4 | 167 / 210 | 1.50 | 20.5% | 33746 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 167 |
| DTF.Kludgy 1.2b | 2.2 | 13.8% | 23 |
| ne.Chimera 1.2 | 3.2 | 12.9% | 7 |
| ejb.Polaris 1.0.1 | 3.8 | 11.8% | 7 |
| vStar.RAFzilla 2.15 | 5.3 | 10.1% | 1 |
| tvv.micro.Antares 1.1.1 | 5.5 | 9.9% | 4 |
| sam.Samspin 1.0 | 7.7 | 5.9% | 2 |
| kurios.DOSexe .9b | 8.0 | 5.6% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.5 | 5.3% | 0 |
| donjezza.Muncho 1.0 | 9.8 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 90.5 | 26 / 35 | 5183 |
| 2 | 1 | 72.2 | 98.4 | 32 / 35 | 5602 |
| 3 | 1 | 71.8 | 96.5 | 29 / 35 | 6166 |
| 4 | 1 | 70.0 | 90.2 | 26 / 35 | 5740 |
| 5 | 1 | 71.3 | 96.5 | 28 / 35 | 5617 |
| 6 | 1 | 70.3 | 94.6 | 26 / 35 | 5438 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| DTF.Kludgy 1.2b | 60 | 77% |
| ejb.Polaris 1.0.1 | 42 | 100% |
| ne.Chimera 1.2 | 36 | 86% |
| vStar.RAFzilla 2.15 | 28 | 100% |
| tvv.micro.Antares 1.1.1 | 12 | 92% |
| donjezza.Muncho 1.0 | 4 | 100% |
| kurios.DOSexe .9b | 4 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 44 of 210 rounds, at a mean tick of 845. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 23 | 52% | 62 |
| ne.Chimera 1.2 | 10 | 23% | 38 |
| tvv.micro.Antares 1.1.1 | 5 | 11% | 13 |
| ejb.Polaris 1.0.1 | 2 | 5% | 47 |
| vStar.RAFzilla 2.15 | 2 | 5% | 29 |
| kurios.DOSexe .9b | 1 | 2% | 13 |
| donjezza.Muncho 1.0 | 0 | 0% | 5 |
| sam.Samspin 1.0 | 0 | 0% | 2 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F11

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.6 | 86.0 | 103 / 210 | 2.26 | 18.2% | 27966 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.2% | 103 |
| rz.Aleph 0.34 | 1.8 | 16.2% | 66 |
| cx.mini.Nimrod 0.55 | 3.2 | 12.1% | 15 |
| djc.DynaBot 0.1.1 | 3.8 | 10.8% | 8 |
| rdt199.Warlord 0.73 | 5.7 | 8.8% | 6 |
| uji.YellohFellah 1.0 | 6.3 | 7.8% | 9 |
| br2.MobyDickBot 1.6 | 6.5 | 8.1% | 5 |
| KiraNL.Chupacabra 0.4 | 7.5 | 7.3% | 0 |
| jeremyreeder.Vincent 2011.12.09 | 9.3 | 5.5% | 0 |
| stelo.MirrorNano 1.3 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 87.0 | 21 / 35 | 4852 |
| 2 | 1 | 68.1 | 87.6 | 19 / 35 | 4802 |
| 3 | 1 | 66.6 | 81.6 | 14 / 35 | 4753 |
| 4 | 1 | 66.3 | 84.4 | 15 / 35 | 4159 |
| 5 | 2 | 68.2 | 88.6 | 16 / 35 | 4486 |
| 6 | 1 | 68.1 | 86.7 | 18 / 35 | 4914 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 70 | 51% |
| cx.mini.Nimrod 0.55 | 26 | 85% |
| djc.DynaBot 0.1.1 | 19 | 79% |
| rdt199.Warlord 0.73 | 13 | 92% |
| uji.YellohFellah 1.0 | 11 | 91% |
| br2.MobyDickBot 1.6 | 8 | 88% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 848. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 51 | 47% | 83 |
| cx.mini.Nimrod 0.55 | 21 | 19% | 45 |
| djc.DynaBot 0.1.1 | 13 | 12% | 22 |
| rdt199.Warlord 0.73 | 8 | 7% | 21 |
| br2.MobyDickBot 1.6 | 5 | 5% | 17 |
| uji.YellohFellah 1.0 | 5 | 5% | 14 |
| KiraNL.Chupacabra 0.4 | 3 | 3% | 6 |
| stelo.MirrorNano 1.3 | 2 | 2% | 2 |

## Melee bench: F12

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 89.6 | 134 / 210 | 1.93 | 18.8% | 24598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.8% | 134 |
| bts.wiki.RipCurl 0.9b | 2.8 | 13.0% | 24 |
| nat.PallasHawk 1.0 | 3.0 | 12.7% | 23 |
| darkcanuck.Leon 1.01 | 3.2 | 12.7% | 19 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.5% | 9 |
| jrm.Test0 1.0 | 6.7 | 7.5% | 0 |
| cs.sheldor.Talon 1.1 | 7.2 | 6.8% | 1 |
| jp.Perpy 16.0 | 7.5 | 6.8% | 0 |
| jaybot.bots.Oddball 4.0 | 9.0 | 5.8% | 0 |
| stuff.Vlad 0.1 | 9.7 | 5.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.7 | 88.9 | 22 / 35 | 4401 |
| 2 | 1 | 69.1 | 91.4 | 24 / 35 | 4317 |
| 3 | 1 | 70.1 | 94.0 | 26 / 35 | 4273 |
| 4 | 1 | 65.8 | 83.2 | 18 / 35 | 3925 |
| 5 | 1 | 66.9 | 87.0 | 21 / 35 | 3636 |
| 6 | 1 | 69.1 | 93.3 | 23 / 35 | 4046 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 75% |
| darkcanuck.Leon 1.01 | 45 | 78% |
| bts.wiki.RipCurl 0.9b | 38 | 82% |
| brainfade.melee.Genghis 0.36 | 19 | 89% |
| jaybot.bots.Oddball 4.0 | 5 | 100% |
| jrm.Test0 1.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jp.Perpy 16.0 | 2 | 100% |

Hadur died in 76 of 210 rounds, at a mean tick of 717. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 23 | 30% | 55 |
| nat.PallasHawk 1.0 | 20 | 26% | 54 |
| darkcanuck.Leon 1.01 | 15 | 20% | 60 |
| brainfade.melee.Genghis 0.36 | 8 | 11% | 16 |
| cs.sheldor.Talon 1.1 | 5 | 7% | 5 |
| jaybot.bots.Oddball 4.0 | 2 | 3% | 11 |
| jrm.Test0 1.0 | 2 | 3% | 6 |
| stuff.Vlad 0.1 | 1 | 1% | 2 |
| jp.Perpy 16.0 | 0 | 0% | 1 |

## Melee bench: F13

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 84.7 | 82 / 210 | 2.38 | 17.1% | 27884 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.1% | 82 |
| mn.Combat 3.25.0 | 2.2 | 16.2% | 75 |
| ags.Glacier 0.2.11 | 2.5 | 15.7% | 29 |
| shinh.Entangled 0.3 | 4.2 | 12.3% | 17 |
| gh.micro.Gruweltje 0.7 | 4.8 | 11.2% | 5 |
| stelo.Wang 1.0 | 6.5 | 7.2% | 0 |
| apc.Colossus2 0.17 | 6.5 | 7.7% | 2 |
| maribo.FollowFire 1 | 8.5 | 4.5% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.9% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 81.6 | 13 / 35 | 4398 |
| 2 | 1 | 66.9 | 87.0 | 11 / 35 | 4517 |
| 3 | 1 | 67.8 | 84.1 | 16 / 35 | 5286 |
| 4 | 2 | 66.3 | 82.5 | 15 / 35 | 4324 |
| 5 | 1 | 67.6 | 86.7 | 14 / 35 | 4540 |
| 6 | 1 | 67.2 | 86.0 | 13 / 35 | 4819 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 41% |
| ags.Glacier 0.2.11 | 52 | 67% |
| shinh.Entangled 0.3 | 25 | 72% |
| gh.micro.Gruweltje 0.7 | 4 | 75% |
| stelo.Wang 1.0 | 2 | 100% |
| apc.Colossus2 0.17 | 1 | 0% |

Hadur died in 128 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 52 | 41% | 80 |
| ags.Glacier 0.2.11 | 39 | 30% | 70 |
| shinh.Entangled 0.3 | 19 | 15% | 40 |
| gh.micro.Gruweltje 0.7 | 7 | 5% | 8 |
| stelo.Wang 1.0 | 6 | 5% | 8 |
| apc.Colossus2 0.17 | 4 | 3% | 4 |
| maribo.FollowFire 1 | 1 | 1% | 0 |

## Melee bench: F14

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 94.8 | 159 / 210 | 1.47 | 20.5% | 32846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 159 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 14.9% | 14 |
| catcat20.shape.Theta 0.018 | 3.0 | 12.0% | 24 |
| dmh.robocode.robot.RedDwarf 0.4 | 4.2 | 10.0% | 1 |
| sanyi.mikrobi.Roberto 1.0 | 5.5 | 9.4% | 5 |
| Lo_Ian.Gandalf_V4 4.0 | 6.3 | 8.9% | 0 |
| co.edu.usb.rc.LidisTron 1.0 | 6.5 | 8.7% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.5 | 8.3% | 7 |
| pa.Improved 1.0 | 9.0 | 5.4% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.2 | 24 / 35 | 5665 |
| 2 | 1 | 70.9 | 94.6 | 27 / 35 | 5440 |
| 3 | 1 | 70.5 | 92.7 | 28 / 35 | 5266 |
| 4 | 1 | 69.5 | 92.7 | 21 / 35 | 5318 |
| 5 | 1 | 72.3 | 98.4 | 31 / 35 | 5727 |
| 6 | 1 | 71.2 | 95.2 | 28 / 35 | 5430 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 99 | 91% |
| catcat20.shape.Theta 0.018 | 51 | 65% |
| co.edu.usb.rc.LidisTron 1.0 | 11 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 82% |
| sheldor.micro.PointInLineRRAL 1.0 | 10 | 70% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 923. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 22 | 43% | 52 |
| simonton.micro.Sprout 1.1.3 | 17 | 33% | 98 |
| sheldor.micro.PointInLineRRAL 1.0 | 4 | 8% | 14 |
| sanyi.mikrobi.Roberto 1.0 | 3 | 6% | 20 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 6 |
| co.edu.usb.rc.LidisTron 1.0 | 1 | 2% | 10 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 7 |
| pa.Improved 1.0 | 1 | 2% | 3 |

## Melee bench: F15

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 88.4 | 128 / 210 | 2.05 | 19.7% | 34285 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 128 |
| kawigi.micro.Shiz 1.1 | 2.2 | 13.1% | 14 |
| mld.DustBunny 3.8 | 3.5 | 11.5% | 11 |
| emp.Yngwie 1.11 | 3.8 | 11.7% | 35 |
| cb.nano.Insomnia 1.0 | 5.0 | 10.5% | 7 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.7% | 13 |
| lambdaxy.TBot 0.1 | 7.0 | 7.4% | 0 |
| Grystrion.TrackerWO 1.0 | 8.3 | 6.1% | 0 |
| divineomega.TrialBot 0.003 | 8.8 | 5.4% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.6 | 22 / 35 | 5374 |
| 2 | 1 | 68.9 | 88.6 | 20 / 35 | 5279 |
| 3 | 1 | 70.4 | 89.8 | 24 / 35 | 5970 |
| 4 | 1 | 68.7 | 86.3 | 18 / 35 | 5750 |
| 5 | 1 | 70.4 | 89.8 | 21 / 35 | 6340 |
| 6 | 1 | 69.3 | 87.0 | 23 / 35 | 5572 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.micro.Shiz 1.1 | 45 | 98% |
| emp.Yngwie 1.11 | 27 | 56% |
| mld.DustBunny 3.8 | 24 | 92% |
| cb.nano.Insomnia 1.0 | 22 | 95% |
| kawigi.robot.Girl 1.2 | 21 | 86% |
| divineomega.TrialBot 0.003 | 6 | 83% |
| lambdaxy.TBot 0.1 | 2 | 100% |
| Grystrion.TrackerWO 1.0 | 1 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 879. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 32 | 39% | 72 |
| kawigi.micro.Shiz 1.1 | 15 | 18% | 43 |
| cb.nano.Insomnia 1.0 | 12 | 15% | 13 |
| mld.DustBunny 3.8 | 10 | 12% | 39 |
| kawigi.robot.Girl 1.2 | 6 | 7% | 23 |
| lambdaxy.TBot 0.1 | 4 | 5% | 7 |
| divineomega.TrialBot 0.003 | 2 | 2% | 11 |
| Grystrion.TrackerWO 1.0 | 1 | 1% | 2 |

## Melee bench: F16

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.0 | 103 / 210 | 2.17 | 19.3% | 35151 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 103 |
| gh.Griezel 0.5.2 | 2.0 | 16.1% | 69 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.9% | 7 |
| techdude.forest.FlamingForest 1.1 | 4.8 | 9.5% | 18 |
| bvh.fnr.Fenrir 0.36l | 5.0 | 9.1% | 3 |
| tvv.nano.Polaris 1.2 | 5.3 | 8.8% | 4 |
| stelo.IntrinsicVolatility 1.4 | 6.8 | 7.9% | 5 |
| asd.Cthulhu 1.3 | 8.5 | 5.3% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.2 | 5.0% | 1 |
| repositorio.NanoStep 1.0 | 9.3 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 89.2 | 22 / 35 | 6120 |
| 2 | 1 | 69.0 | 85.1 | 18 / 35 | 5783 |
| 3 | 1 | 69.4 | 88.3 | 13 / 35 | 5737 |
| 4 | 1 | 68.4 | 83.8 | 14 / 35 | 5837 |
| 5 | 1 | 69.1 | 86.3 | 17 / 35 | 5748 |
| 6 | 1 | 70.0 | 89.2 | 19 / 35 | 5926 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 87 | 41% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 27 | 93% |
| techdude.forest.FlamingForest 1.1 | 16 | 75% |
| bvh.fnr.Fenrir 0.36l | 11 | 91% |
| stelo.IntrinsicVolatility 1.4 | 9 | 78% |
| tvv.nano.Polaris 1.2 | 8 | 100% |
| divineomega.DivineBot 1.9.4.5 | 5 | 100% |

Hadur died in 107 of 210 rounds, at a mean tick of 1339. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 62 | 58% | 101 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 19 | 18% | 39 |
| stelo.IntrinsicVolatility 1.4 | 9 | 8% | 19 |
| techdude.forest.FlamingForest 1.1 | 7 | 7% | 20 |
| bvh.fnr.Fenrir 0.36l | 6 | 6% | 13 |
| tvv.nano.Polaris 1.2 | 2 | 2% | 8 |
| divineomega.DivineBot 1.9.4.5 | 1 | 1% | 6 |
| asd.Cthulhu 1.3 | 1 | 1% | 2 |
| repositorio.NanoStep 1.0 | 0 | 0% | 2 |

## Melee bench: F17

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.4 | 121 / 210 | 2.14 | 19.0% | 31418 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 121 |
| et.Predator 1.8 | 2.3 | 13.2% | 19 |
| oog.melee.Mercutio 1.0 | 3.8 | 11.8% | 20 |
| cx.BlestPain 1.41 | 3.8 | 11.8% | 28 |
| nic.Nicator 2.4 | 5.2 | 10.8% | 14 |
| ahf.NanoAndrew .4 | 5.7 | 10.0% | 5 |
| maribo.melee.BMV 0.1 | 6.2 | 9.4% | 2 |
| tex.Longbot 0.4 | 8.2 | 5.9% | 0 |
| edu.otg.spr.TheTeacher 1.2 | 8.8 | 5.5% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.7% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.5 | 87.6 | 19 / 35 | 5198 |
| 2 | 1 | 68.5 | 84.8 | 22 / 35 | 5059 |
| 3 | 1 | 67.4 | 81.6 | 17 / 35 | 5049 |
| 4 | 1 | 70.3 | 92.1 | 21 / 35 | 5588 |
| 5 | 1 | 69.0 | 88.9 | 21 / 35 | 5072 |
| 6 | 1 | 69.6 | 89.2 | 21 / 35 | 5452 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 47 | 85% |
| cx.BlestPain 1.41 | 36 | 53% |
| oog.melee.Mercutio 1.0 | 34 | 71% |
| nic.Nicator 2.4 | 27 | 70% |
| ahf.NanoAndrew .4 | 14 | 100% |
| maribo.melee.BMV 0.1 | 5 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 964. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 25 | 28% | 49 |
| et.Predator 1.8 | 21 | 23% | 58 |
| oog.melee.Mercutio 1.0 | 14 | 16% | 36 |
| nic.Nicator 2.4 | 12 | 13% | 31 |
| maribo.melee.BMV 0.1 | 7 | 8% | 11 |
| ahf.NanoAndrew .4 | 6 | 7% | 15 |
| tex.Longbot 0.4 | 4 | 4% | 6 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 3 |
| goblin.Bender 2.4 | 0 | 0% | 1 |

## Melee bench: F18

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 90.6 | 140 / 210 | 1.84 | 19.5% | 29113 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 140 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.1% | 18 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.5% | 13 |
| ratosh.Nobo 0.21 | 4.3 | 10.6% | 7 |
| uji.DBH 1.1 | 4.8 | 10.1% | 16 |
| spinnercat.Robovirus 2.718 | 6.0 | 9.1% | 2 |
| kawigi.mini.Fhqwhgads 1.1 | 7.0 | 7.8% | 5 |
| sigterm.Sigterm 1.0 | 7.7 | 7.7% | 5 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.0 | 5.5% | 0 |
| stelo.WangRobot 1.0 | 9.8 | 5.1% | 4 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.7 | 93.3 | 23 / 35 | 5018 |
| 2 | 1 | 69.4 | 90.8 | 26 / 35 | 4641 |
| 3 | 1 | 69.1 | 89.5 | 23 / 35 | 4959 |
| 4 | 1 | 70.0 | 95.2 | 24 / 35 | 4719 |
| 5 | 1 | 69.2 | 88.9 | 21 / 35 | 5146 |
| 6 | 1 | 67.6 | 86.0 | 23 / 35 | 4630 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 50 | 84% |
| agd.Mooserwirt2 2.7 | 32 | 91% |
| uji.DBH 1.1 | 24 | 67% |
| spinnercat.Robovirus 2.718 | 16 | 100% |
| sigterm.Sigterm 1.0 | 15 | 67% |
| ratosh.Nobo 0.21 | 13 | 92% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 88% |
| stelo.WangRobot 1.0 | 7 | 86% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 2 | 100% |

Hadur died in 70 of 210 rounds, at a mean tick of 756. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 16 | 23% | 61 |
| uji.DBH 1.1 | 16 | 23% | 29 |
| agd.Mooserwirt2 2.7 | 9 | 13% | 45 |
| ratosh.Nobo 0.21 | 7 | 10% | 16 |
| spinnercat.Robovirus 2.718 | 6 | 9% | 19 |
| sigterm.Sigterm 1.0 | 6 | 9% | 13 |
| kawigi.mini.Fhqwhgads 1.1 | 5 | 7% | 10 |
| stelo.WangRobot 1.0 | 4 | 6% | 10 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 5 |

## Melee bench: F19

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 73.2 | 97.4 | 191 / 210 | 1.23 | 22.1% | 36355 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.1% | 191 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.0 | 15.1% | 12 |
| mld.Infinity 2.2 | 3.0 | 13.3% | 5 |
| krillr.mini.JointStrike 2.0.0 | 4.5 | 10.1% | 1 |
| erdnis.Rover 0.3 | 4.8 | 9.8% | 1 |
| patson.PatsonTestBot 1.0 | 5.8 | 8.5% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.5% | 0 |
| pac.ABC 2.1 | 8.3 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.5 | 6.1% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.9 | 97.5 | 32 / 35 | 6464 |
| 2 | 1 | 72.8 | 96.8 | 30 / 35 | 6150 |
| 3 | 1 | 72.9 | 98.7 | 33 / 35 | 5809 |
| 4 | 1 | 73.5 | 99.4 | 34 / 35 | 6052 |
| 5 | 1 | 73.1 | 98.1 | 32 / 35 | 5664 |
| 6 | 1 | 72.7 | 94.0 | 30 / 35 | 6216 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 108 | 96% |
| mld.Infinity 2.2 | 60 | 98% |
| krillr.mini.JointStrike 2.0.0 | 9 | 100% |
| patson.PatsonTestBot 1.0 | 6 | 100% |
| pbg.R2D2 1.0 | 5 | 100% |
| erdnis.Rover 0.3 | 5 | 100% |
| pac.ABC 2.1 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 19 of 210 rounds, at a mean tick of 723. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 7 | 37% | 107 |
| krillr.mini.JointStrike 2.0.0 | 6 | 32% | 23 |
| mld.Infinity 2.2 | 3 | 16% | 37 |
| erdnis.Rover 0.3 | 2 | 11% | 15 |
| patson.PatsonTestBot 1.0 | 1 | 5% | 9 |
| pbg.R2D2 1.0 | 0 | 0% | 9 |
| mbh.Mbh 0.1 | 0 | 0% | 7 |
| pac.ABC 2.1 | 0 | 0% | 2 |

## Melee bench: F20

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 93.0 | 139 / 210 | 1.63 | 20.8% | 35974 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 139 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.7% | 46 |
| nz.jdc.nano.GridFu 1.0 | 3.5 | 10.5% | 5 |
| fwb.Nine 1.0.1 | 3.7 | 10.7% | 8 |
| catcat20.Rabbit 0.001 | 5.0 | 9.4% | 8 |
| m3thos.mini.Eva01 0.5.5 | 6.5 | 8.1% | 2 |
| bayen.nut.Squirrel 1.615 | 7.2 | 7.5% | 2 |
| djdjdj.NanoSkunk10 1.0 | 7.2 | 7.1% | 0 |
| ntc.ControlledChaos 1.1.4 | 9.3 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 94.6 | 23 / 35 | 5941 |
| 2 | 1 | 70.9 | 93.3 | 23 / 35 | 5938 |
| 3 | 1 | 70.1 | 89.2 | 23 / 35 | 5745 |
| 4 | 1 | 71.1 | 92.4 | 23 / 35 | 5995 |
| 5 | 1 | 70.2 | 92.1 | 19 / 35 | 5771 |
| 6 | 1 | 72.7 | 96.2 | 28 / 35 | 6584 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 88 | 66% |
| fwb.Nine 1.0.1 | 30 | 97% |
| catcat20.Rabbit 0.001 | 21 | 81% |
| nz.jdc.nano.GridFu 1.0 | 17 | 94% |
| bayen.nut.Squirrel 1.615 | 13 | 85% |
| sample.MyFirstJuniorRobot 1.0 | 5 | 100% |
| ntc.ControlledChaos 1.1.4 | 1 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |
| djdjdj.NanoSkunk10 1.0 | 1 | 100% |

Hadur died in 71 of 210 rounds, at a mean tick of 1034. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 44 | 62% | 83 |
| fwb.Nine 1.0.1 | 9 | 13% | 29 |
| catcat20.Rabbit 0.001 | 8 | 11% | 35 |
| bayen.nut.Squirrel 1.615 | 6 | 8% | 16 |
| nz.jdc.nano.GridFu 1.0 | 3 | 4% | 32 |
| ntc.ControlledChaos 1.1.4 | 1 | 1% | 2 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 6 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 5 |
| m3thos.mini.Eva01 0.5.5 | 0 | 0% | 2 |

## Melee bench: F21

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.3 | 92.9 | 141 / 210 | 1.64 | 20.8% | 36404 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.8% | 141 |
| eem.EvBot v4.6.16 | 2.0 | 15.2% | 51 |
| dummy.mini.Scimitar 1.01 | 3.0 | 14.2% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.8% | 4 |
| eld.Hmm 1.0 | 5.3 | 7.9% | 6 |
| oa.weak.BotherBot 0.1 | 6.2 | 7.4% | 0 |
| el.JumpShoot 0.2 | 7.3 | 6.6% | 0 |
| fire219.CatBot 1.0 | 7.5 | 6.3% | 0 |
| PSW.Relentless 0.1 | 8.8 | 5.5% | 0 |
| arthord.MannyPacquiao Beta | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.4 | 94.3 | 26 / 35 | 6567 |
| 2 | 1 | 69.8 | 89.2 | 16 / 35 | 5998 |
| 3 | 1 | 72.8 | 97.1 | 28 / 35 | 6250 |
| 4 | 1 | 70.9 | 91.4 | 24 / 35 | 5993 |
| 5 | 1 | 70.5 | 91.1 | 23 / 35 | 5600 |
| 6 | 1 | 71.5 | 94.0 | 24 / 35 | 5996 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 94 | 64% |
| dummy.mini.Scimitar 1.01 | 48 | 90% |
| cf.RiO.RiOx 4.2.1 | 26 | 96% |
| eld.Hmm 1.0 | 7 | 100% |
| oa.weak.BotherBot 0.1 | 4 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |
| el.JumpShoot 0.2 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1162. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 41 | 59% | 93 |
| dummy.mini.Scimitar 1.01 | 16 | 23% | 63 |
| cf.RiO.RiOx 4.2.1 | 7 | 10% | 28 |
| eld.Hmm 1.0 | 2 | 3% | 14 |
| el.JumpShoot 0.2 | 2 | 3% | 3 |
| oa.weak.BotherBot 0.1 | 1 | 1% | 4 |
| arthord.MannyPacquiao Beta | 0 | 0% | 4 |

## Melee bench: F22

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.7 | 94 / 210 | 2.11 | 18.6% | 31915 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.6% | 94 |
| pe.SandboxDT 2.71m | 2.0 | 16.3% | 57 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.4% | 28 |
| jlm.javaDisturbance 0.59 | 4.0 | 12.5% | 22 |
| bigpete.Stewie 1.0 | 5.0 | 10.5% | 6 |
| tad.Dalek98 0.98 | 7.2 | 6.4% | 2 |
| gg.Squaraus 0.6 | 7.2 | 6.4% | 0 |
| yk.JahRoslav 1.1 | 7.3 | 6.3% | 1 |
| pbg.NinjaX 1.2 | 8.3 | 5.4% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 3.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.9 | 86.3 | 16 / 35 | 5590 |
| 2 | 1 | 69.3 | 88.6 | 16 / 35 | 5369 |
| 3 | 1 | 68.7 | 87.0 | 14 / 35 | 5526 |
| 4 | 1 | 69.5 | 89.8 | 19 / 35 | 5234 |
| 5 | 1 | 69.3 | 89.8 | 17 / 35 | 5166 |
| 6 | 1 | 67.3 | 84.4 | 12 / 35 | 5030 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 55 | 78% |
| jlm.javaDisturbance 0.59 | 37 | 62% |
| pe.SandboxDT 2.71m | 35 | 46% |
| bigpete.Stewie 1.0 | 12 | 75% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 100% |
| tad.Dalek98 0.98 | 1 | 0% |

Hadur died in 117 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 38 | 32% | 65 |
| kvk.HebusLeTroll 0.35 | 35 | 30% | 61 |
| jlm.javaDisturbance 0.59 | 24 | 21% | 47 |
| bigpete.Stewie 1.0 | 10 | 9% | 20 |
| tad.Dalek98 0.98 | 8 | 7% | 10 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 1 | 1% | 3 |
| pbg.NinjaX 1.2 | 1 | 1% | 3 |
| gg.Squaraus 0.6 | 0 | 0% | 1 |

## Melee bench: F23

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.1 | 106 / 210 | 2.07 | 19.0% | 32427 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 106 |
| pe.SandboxLump 1.52 | 2.0 | 17.5% | 66 |
| cre.Karolos 0.32 | 3.0 | 13.7% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.3 | 10.5% | 7 |
| stelo.RamTrackSurfer 1.2 | 5.2 | 9.7% | 6 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.1% | 2 |
| cw.megas.Blade 0.8 | 7.0 | 7.8% | 1 |
| sample.Walls 1.0 | 8.0 | 7.4% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.4% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.3 | 14 / 35 | 5493 |
| 2 | 1 | 69.5 | 87.9 | 17 / 35 | 5138 |
| 3 | 1 | 69.8 | 87.3 | 17 / 35 | 5629 |
| 4 | 1 | 70.5 | 89.5 | 22 / 35 | 5637 |
| 5 | 1 | 70.8 | 92.7 | 23 / 35 | 5213 |
| 6 | 1 | 68.7 | 84.1 | 13 / 35 | 5317 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 98 | 60% |
| cre.Karolos 0.32 | 34 | 76% |
| stelo.AreaTargetingBot 1.1 | 11 | 73% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 7 | 86% |
| stelo.RamTrackSurfer 1.2 | 4 | 75% |
| sample.Walls 1.0 | 3 | 100% |
| cw.megas.Blade 0.8 | 2 | 50% |

Hadur died in 104 of 210 rounds, at a mean tick of 748. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 59 | 57% | 121 |
| cre.Karolos 0.32 | 22 | 21% | 44 |
| stelo.AreaTargetingBot 1.1 | 14 | 13% | 22 |
| stelo.RamTrackSurfer 1.2 | 4 | 4% | 10 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 2 | 2% | 6 |
| cw.megas.Blade 0.8 | 2 | 2% | 2 |
| sample.Walls 1.0 | 1 | 1% | 5 |

## Melee bench: F24

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 81.6 | 82 / 210 | 2.65 | 16.6% | 24452 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 16.6% | 82 |
| rz.GlowBlowMelee 1.4 | 2.3 | 14.0% | 35 |
| florent.XSeries.X2 0.12 | 3.5 | 12.6% | 29 |
| davidalves.Phoenix 0.54 | 3.8 | 12.6% | 33 |
| pedersen.Ugluk 1.1.1 | 4.3 | 12.0% | 22 |
| oog.melee.Corsair 1.0 | 6.3 | 8.4% | 2 |
| stelo.SoJNanoMelee 1.1 | 6.7 | 8.0% | 5 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.3% | 1 |
| as.FrankTheTank 1.3 | 9.5 | 4.8% | 1 |
| evd.X1 0.01 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.2 | 86.3 | 15 / 35 | 4442 |
| 2 | 1 | 64.4 | 78.7 | 16 / 35 | 3941 |
| 3 | 1 | 65.2 | 80.6 | 14 / 35 | 4007 |
| 4 | 1 | 64.3 | 79.4 | 12 / 35 | 3960 |
| 5 | 1 | 64.7 | 81.0 | 10 / 35 | 3937 |
| 6 | 1 | 66.2 | 83.8 | 15 / 35 | 4165 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 35 | 74% |
| davidalves.Phoenix 0.54 | 30 | 53% |
| pedersen.Ugluk 1.1.1 | 23 | 57% |
| florent.XSeries.X2 0.12 | 22 | 45% |
| stelo.SoJNanoMelee 1.1 | 12 | 92% |
| oog.melee.Corsair 1.0 | 4 | 100% |
| as.FrankTheTank 1.3 | 1 | 100% |
| lunchie.Lunchbox 0.93 | 1 | 100% |

Hadur died in 128 of 210 rounds, at a mean tick of 773. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.Phoenix 0.54 | 32 | 25% | 53 |
| florent.XSeries.X2 0.12 | 31 | 24% | 41 |
| rz.GlowBlowMelee 1.4 | 27 | 21% | 48 |
| pedersen.Ugluk 1.1.1 | 26 | 20% | 36 |
| stelo.SoJNanoMelee 1.1 | 4 | 3% | 12 |
| lunchie.Lunchbox 0.93 | 4 | 3% | 4 |
| oog.melee.Corsair 1.0 | 2 | 2% | 12 |
| evd.X1 0.01 | 1 | 1% | 2 |
| as.FrankTheTank 1.3 | 1 | 1% | 1 |

## Melee bench: F25

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 90.4 | 151 / 210 | 1.87 | 19.7% | 27412 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 151 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 13.5% | 14 |
| voidious.micro.BlitzBat 1.05 | 3.2 | 11.9% | 9 |
| jdw.Hurricane 1.4 | 3.7 | 11.3% | 16 |
| gre.svman4.Morfeas 1.4.1 | 5.5 | 8.8% | 7 |
| ds.Oo 2.2 | 6.5 | 8.4% | 2 |
| gjr.Cephalosporin 0.1 | 7.0 | 7.6% | 8 |
| awesomeness.Elite 1.0 | 7.3 | 7.5% | 4 |
| adt.Ar2 1.1 | 8.7 | 6.5% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.9 | 29 / 35 | 4718 |
| 2 | 1 | 68.8 | 88.3 | 22 / 35 | 4758 |
| 3 | 1 | 67.8 | 84.8 | 24 / 35 | 4244 |
| 4 | 1 | 70.0 | 90.5 | 26 / 35 | 4765 |
| 5 | 1 | 69.4 | 91.1 | 26 / 35 | 4305 |
| 6 | 1 | 69.7 | 91.7 | 24 / 35 | 4622 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 58 | 90% |
| voidious.micro.BlitzBat 1.05 | 45 | 93% |
| jdw.Hurricane 1.4 | 30 | 80% |
| gre.svman4.Morfeas 1.4.1 | 9 | 67% |
| awesomeness.Elite 1.0 | 8 | 88% |
| gjr.Cephalosporin 0.1 | 8 | 88% |
| ds.Oo 2.2 | 8 | 100% |
| adt.Ar2 1.1 | 4 | 100% |
| amk.ChumbaMini 0.2 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 630. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jdw.Hurricane 1.4 | 18 | 31% | 38 |
| voidious.mini.BrokenSword 2.0.3 | 15 | 25% | 61 |
| voidious.micro.BlitzBat 1.05 | 10 | 17% | 52 |
| gre.svman4.Morfeas 1.4.1 | 6 | 10% | 13 |
| awesomeness.Elite 1.0 | 4 | 7% | 12 |
| amk.ChumbaMini 0.2 | 3 | 5% | 5 |
| ds.Oo 2.2 | 1 | 2% | 14 |
| adt.Ar2 1.1 | 1 | 2% | 8 |
| gjr.Cephalosporin 0.1 | 1 | 2% | 7 |

## Melee bench: F26

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 89.2 | 121 / 210 | 1.97 | 19.1% | 32833 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 121 |
| ak.Fermat 2.0 | 2.0 | 14.8% | 38 |
| shu.nitro.LENIN .T34 | 3.5 | 11.8% | 16 |
| lrem.Spectre 0.4.4 | 4.0 | 12.1% | 20 |
| js.PinBall 1.6 | 4.7 | 11.0% | 10 |
| jaybot.adv.bots.JayBot 2.0 | 6.2 | 9.3% | 3 |
| gh.mini.GrubbmOne 1.0 | 6.7 | 9.1% | 1 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.7% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.3 | 87.9 | 19 / 35 | 5541 |
| 2 | 1 | 68.3 | 84.4 | 19 / 35 | 5299 |
| 3 | 1 | 69.1 | 87.3 | 20 / 35 | 5397 |
| 4 | 1 | 69.1 | 89.5 | 19 / 35 | 5198 |
| 5 | 1 | 68.9 | 90.2 | 18 / 35 | 5167 |
| 6 | 1 | 71.9 | 95.9 | 26 / 35 | 6231 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 51 | 59% |
| lrem.Spectre 0.4.4 | 45 | 78% |
| shu.nitro.LENIN .T34 | 37 | 78% |
| js.PinBall 1.6 | 15 | 93% |
| jaybot.adv.bots.JayBot 2.0 | 11 | 91% |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 100% |
| sample.SpinBot 1.0 | 1 | 100% |

Hadur died in 92 of 210 rounds, at a mean tick of 911. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 40 | 43% | 69 |
| shu.nitro.LENIN .T34 | 18 | 20% | 60 |
| lrem.Spectre 0.4.4 | 15 | 16% | 40 |
| js.PinBall 1.6 | 9 | 10% | 17 |
| jaybot.adv.bots.JayBot 2.0 | 6 | 7% | 13 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 2% | 4 |
| sample.SpinBot 1.0 | 1 | 1% | 3 |
| gh.mini.GrubbmOne 1.0 | 1 | 1% | 3 |

## Melee bench: F27

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 91.4 | 159 / 210 | 1.77 | 20.2% | 30796 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 159 |
| mk.Alpha 0.2.1 | 2.7 | 12.7% | 27 |
| sheldor.melee.nano.TestMelee 0.1 | 3.3 | 11.1% | 8 |
| EH.Eagle 1.0.6 | 4.0 | 10.8% | 4 |
| wee.Gem 1.8.4 | 4.2 | 10.7% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.5% | 0 |
| joe.ADinosaur 1.0 | 6.7 | 8.3% | 1 |
| throxbot.ThroxBot 0.1 | 8.0 | 7.5% | 0 |
| caimano.Furia_Ceca 0.22 | 9.0 | 6.4% | 0 |
| cs.Grudge 1.0 | 9.8 | 3.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 96.2 | 31 / 35 | 5244 |
| 2 | 1 | 70.1 | 94.9 | 27 / 35 | 4605 |
| 3 | 1 | 68.8 | 88.6 | 24 / 35 | 4801 |
| 4 | 1 | 71.3 | 95.6 | 29 / 35 | 5347 |
| 5 | 1 | 67.9 | 75.9 | 16 / 35 | 5672 |
| 6 | 1 | 71.6 | 97.5 | 32 / 35 | 5127 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 64 | 73% |
| wee.Gem 1.8.4 | 40 | 95% |
| sheldor.melee.nano.TestMelee 0.1 | 34 | 91% |
| EH.Eagle 1.0.6 | 21 | 100% |
| throxbot.ThroxBot 0.1 | 8 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 8 | 100% |
| joe.ADinosaur 1.0 | 5 | 100% |
| caimano.Furia_Ceca 0.22 | 1 | 100% |

Hadur died in 51 of 210 rounds, at a mean tick of 704. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 21 | 41% | 55 |
| wee.Gem 1.8.4 | 8 | 16% | 43 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 14% | 33 |
| throxbot.ThroxBot 0.1 | 4 | 8% | 10 |
| caimano.Furia_Ceca 0.22 | 4 | 8% | 9 |
| EH.Eagle 1.0.6 | 3 | 6% | 33 |
| techdude.kombat.FlamingKombat 1.5 | 2 | 4% | 15 |
| cs.Grudge 1.0 | 2 | 4% | 3 |
| joe.ADinosaur 1.0 | 0 | 0% | 8 |

## Melee bench: F28

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 90.3 | 143 / 210 | 1.88 | 19.1% | 26251 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 143 |
| kid.test.NightFox .2 | 2.2 | 14.6% | 28 |
| uji.Antique 1.0 | 2.8 | 12.7% | 22 |
| qohnil.blot.BlotBot 3.61 | 4.5 | 10.8% | 9 |
| pfvicm.Sobieski 7.2.3b | 4.5 | 10.2% | 3 |
| ahr.ice.Ice 1.0.2 | 6.3 | 7.9% | 4 |
| amk.ChumbaWumba 0.3 | 7.0 | 7.2% | 0 |
| stelo.PianistNano 1.2 | 8.3 | 6.3% | 0 |
| matt.advanced.Katana 1.0 | 8.5 | 6.1% | 0 |
| stelo.Lifestealer 1.0 | 9.8 | 5.0% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.8 | 89.2 | 18 / 35 | 4188 |
| 2 | 1 | 68.9 | 90.2 | 26 / 35 | 4393 |
| 3 | 1 | 69.3 | 91.1 | 27 / 35 | 4276 |
| 4 | 1 | 68.4 | 88.9 | 23 / 35 | 4375 |
| 5 | 1 | 68.9 | 89.8 | 23 / 35 | 4371 |
| 6 | 1 | 69.7 | 92.4 | 26 / 35 | 4648 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 74 | 84% |
| uji.Antique 1.0 | 55 | 93% |
| qohnil.blot.BlotBot 3.61 | 15 | 67% |
| pfvicm.Sobieski 7.2.3b | 9 | 89% |
| ahr.ice.Ice 1.0.2 | 7 | 71% |
| amk.ChumbaWumba 0.3 | 5 | 100% |
| stelo.Lifestealer 1.0 | 1 | 100% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 68 of 210 rounds, at a mean tick of 708. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 25 | 37% | 77 |
| pfvicm.Sobieski 7.2.3b | 12 | 18% | 24 |
| uji.Antique 1.0 | 11 | 16% | 56 |
| qohnil.blot.BlotBot 3.61 | 8 | 12% | 21 |
| amk.ChumbaWumba 0.3 | 6 | 9% | 11 |
| ahr.ice.Ice 1.0.2 | 4 | 6% | 11 |
| matt.advanced.Katana 1.0 | 1 | 1% | 4 |
| stelo.PianistNano 1.2 | 1 | 1% | 2 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.9 | 120 / 210 | 2.00 | 19.5% | 30334 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 120 |
| zyx.mega.YersiniaPestis 3.1 | 2.2 | 15.2% | 50 |
| deewiant.Anomaly 0.2 | 2.8 | 13.9% | 31 |
| myl.micro.Troodon 1.10 | 4.3 | 11.3% | 3 |
| jok.PheonixM 0.1.2 | 4.7 | 10.3% | 1 |
| ph.melee.ArcherME 0.3 | 6.0 | 8.3% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.8% | 4 |
| fullsail.TimbotNoPrediction 1.0 | 8.0 | 5.9% | 0 |
| jangs.ns51 1.0 | 9.2 | 4.6% | 0 |
| ap.Frederick 1.1 | 9.7 | 4.3% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 86.7 | 19 / 35 | 4880 |
| 2 | 1 | 70.4 | 91.4 | 24 / 35 | 4947 |
| 3 | 1 | 71.0 | 91.4 | 24 / 35 | 5261 |
| 4 | 1 | 69.0 | 86.7 | 17 / 35 | 5091 |
| 5 | 1 | 69.8 | 89.8 | 19 / 35 | 5186 |
| 6 | 1 | 69.3 | 87.3 | 17 / 35 | 4969 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 61 | 72% |
| zyx.mega.YersiniaPestis 3.1 | 55 | 47% |
| myl.micro.Troodon 1.10 | 27 | 100% |
| jok.PheonixM 0.1.2 | 15 | 100% |
| DBall.Anarchy 0.1 | 4 | 100% |
| jangs.ns51 1.0 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| ap.Frederick 1.1 | 1 | 100% |

Hadur died in 90 of 210 rounds, at a mean tick of 986. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 43 | 48% | 70 |
| deewiant.Anomaly 0.2 | 35 | 39% | 79 |
| myl.micro.Troodon 1.10 | 7 | 8% | 24 |
| jok.PheonixM 0.1.2 | 4 | 4% | 19 |
| fullsail.TimbotNoPrediction 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 10 |
| ph.melee.ArcherME 0.3 | 0 | 0% | 4 |
| jangs.ns51 1.0 | 0 | 0% | 1 |

## Melee bench: F30

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.8 | 66 / 210 | 2.81 | 16.0% | 24313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 16.0% | 66 |
| darkcanuck.B26354 1.06 | 2.8 | 13.7% | 46 |
| catcat20.Matcha 0.006 | 3.0 | 13.8% | 44 |
| stelo.PastFuture 2.3.2 | 3.2 | 12.9% | 23 |
| oog.melee.Capulet 1.2 | 4.8 | 11.9% | 21 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.3% | 4 |
| tripphippy.Alice 1.1 | 7.5 | 7.1% | 5 |
| ntc.Opposite 1.5 | 7.7 | 7.1% | 0 |
| fowl3628800.LightningBolt 2.6.0 | 8.2 | 6.8% | 2 |
| GarmBox.Anger 1.0 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 64.4 | 78.1 | 13 / 35 | 3915 |
| 2 | 1 | 65.2 | 83.5 | 12 / 35 | 4114 |
| 3 | 2 | 62.8 | 75.6 | 8 / 35 | 3889 |
| 4 | 1 | 65.0 | 79.7 | 10 / 35 | 4297 |
| 5 | 1 | 65.8 | 81.9 | 13 / 35 | 4122 |
| 6 | 1 | 64.5 | 80.3 | 10 / 35 | 3976 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 35 | 40% |
| darkcanuck.B26354 1.06 | 30 | 53% |
| stelo.PastFuture 2.3.2 | 26 | 58% |
| oog.melee.Capulet 1.2 | 20 | 60% |
| tripphippy.Alice 1.1 | 5 | 100% |
| intruder.PrairieWolf 2.61 | 4 | 50% |
| fowl3628800.LightningBolt 2.6.0 | 2 | 100% |

Hadur died in 145 of 210 rounds, at a mean tick of 877. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| darkcanuck.B26354 1.06 | 41 | 28% | 59 |
| catcat20.Matcha 0.006 | 37 | 26% | 54 |
| stelo.PastFuture 2.3.2 | 29 | 20% | 42 |
| oog.melee.Capulet 1.2 | 21 | 14% | 34 |
| tripphippy.Alice 1.1 | 7 | 5% | 11 |
| intruder.PrairieWolf 2.61 | 4 | 3% | 5 |
| ntc.Opposite 1.5 | 4 | 3% | 4 |
| fowl3628800.LightningBolt 2.6.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F31

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 82.6 | 70 / 210 | 2.57 | 16.5% | 23449 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.2% | 80 |
| kc.mini.Mirage 0.2 | 1.7 | 16.5% | 70 |
| gh.mini.Griezel 0.2 | 3.0 | 12.7% | 48 |
| spinnercat.micro.Tyger 0.1 | 4.5 | 10.9% | 4 |
| d414.nano.Quantum 1.0.0 | 4.5 | 10.9% | 7 |
| gh.nano.Grofvuil 0.2 | 6.0 | 8.8% | 1 |
| fm.mammillarias 1.3 | 7.0 | 7.0% | 0 |
| timmit.nano.TimDog 0.33 | 8.2 | 5.9% | 1 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.4% | 0 |
| tlp.ThreeLeggedPig 1 | 9.8 | 4.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 78.4 | 11 / 35 | 3591 |
| 2 | 1 | 65.8 | 82.2 | 12 / 35 | 3995 |
| 3 | 1 | 66.2 | 85.4 | 13 / 35 | 4133 |
| 4 | 2 | 66.6 | 86.3 | 15 / 35 | 3932 |
| 5 | 2 | 65.5 | 82.9 | 10 / 35 | 3881 |
| 6 | 2 | 64.7 | 80.3 | 9 / 35 | 3917 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 59 | 47% |
| gh.mini.Griezel 0.2 | 42 | 26% |
| spinnercat.micro.Tyger 0.1 | 12 | 100% |
| d414.nano.Quantum 1.0.0 | 10 | 100% |
| gh.nano.Grofvuil 0.2 | 4 | 75% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| fm.mammillarias 1.3 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 141 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 59 | 42% | 84 |
| gh.mini.Griezel 0.2 | 46 | 33% | 62 |
| d414.nano.Quantum 1.0.0 | 11 | 8% | 22 |
| spinnercat.micro.Tyger 0.1 | 10 | 7% | 20 |
| fm.mammillarias 1.3 | 6 | 4% | 6 |
| gh.nano.Grofvuil 0.2 | 4 | 3% | 7 |
| timmit.nano.TimDog 0.33 | 3 | 2% | 7 |
| Gecko.ultimateGeckoBot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F32

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 4 other Robocode JVMs running (hadur.bench.MeleeRunner x4), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.0 | 90.8 | 135 / 210 | 1.82 | 19.3% | 30127 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 135 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.7% | 52 |
| apc.botM 3.0 | 3.3 | 11.4% | 8 |
| lxx.ConceptA 0.8 | 3.7 | 11.1% | 2 |
| vjik.UnViolation 1.1 | 5.3 | 9.0% | 6 |
| bayen.UbaMicro 1.4 | 5.7 | 8.6% | 2 |
| panzer.Panzer 0.2 | 7.3 | 7.6% | 0 |
| yk.JahMicro 1.0 | 8.0 | 7.0% | 2 |
| conscience.Electron 1.3g | 9.2 | 6.0% | 0 |
| donjezza.Jezza 1.0 | 9.5 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.1 | 91.1 | 22 / 35 | 5051 |
| 2 | 1 | 69.1 | 90.8 | 23 / 35 | 4830 |
| 3 | 1 | 69.2 | 90.8 | 24 / 35 | 5002 |
| 4 | 1 | 68.3 | 88.9 | 16 / 35 | 5368 |
| 5 | 1 | 69.7 | 93.7 | 26 / 35 | 4918 |
| 6 | 1 | 68.7 | 89.8 | 24 / 35 | 4958 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 93 | 55% |
| lxx.ConceptA 0.8 | 29 | 93% |
| apc.botM 3.0 | 26 | 92% |
| vjik.UnViolation 1.1 | 12 | 100% |
| bayen.UbaMicro 1.4 | 9 | 100% |
| yk.JahMicro 1.0 | 9 | 89% |
| donjezza.Jezza 1.0 | 3 | 67% |
| panzer.Panzer 0.2 | 2 | 100% |

Hadur died in 75 of 210 rounds, at a mean tick of 852. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 50 | 67% | 103 |
| lxx.ConceptA 0.8 | 8 | 11% | 22 |
| apc.botM 3.0 | 7 | 9% | 33 |
| conscience.Electron 1.3g | 4 | 5% | 5 |
| vjik.UnViolation 1.1 | 2 | 3% | 17 |
| bayen.UbaMicro 1.4 | 2 | 3% | 13 |
| yk.JahMicro 1.0 | 1 | 1% | 5 |
| donjezza.Jezza 1.0 | 1 | 1% | 5 |
| panzer.Panzer 0.2 | 0 | 0% | 5 |

## Melee bench: F33

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.2 | 89.9 | 134 / 210 | 1.91 | 19.9% | 31249 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.9% | 134 |
| maribo.Quester 0.3 | 2.0 | 15.7% | 36 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.2 | 12.2% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.2 | 11.1% | 11 |
| labg.Cataclysm 2.05 | 4.8 | 10.4% | 11 |
| baal.nano.N 1.42 | 6.2 | 8.7% | 0 |
| kinsen.melee.Angsaichmophobia 1.8c | 6.7 | 8.1% | 1 |
| zyx.micro.Ant 1.1 | 8.3 | 5.2% | 1 |
| sanja.First 0.1 | 9.0 | 4.8% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.7 | 4.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 87.9 | 18 / 35 | 4767 |
| 2 | 1 | 70.5 | 90.5 | 24 / 35 | 5284 |
| 3 | 1 | 70.6 | 91.1 | 22 / 35 | 5202 |
| 4 | 1 | 70.1 | 90.2 | 22 / 35 | 5212 |
| 5 | 1 | 70.6 | 91.4 | 24 / 35 | 5381 |
| 6 | 1 | 70.6 | 88.3 | 24 / 35 | 5403 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 54 | 78% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 42 | 79% |
| gre.svman4.Leonidas 1.3.2 | 34 | 88% |
| labg.Cataclysm 2.05 | 20 | 70% |
| kinsen.melee.Angsaichmophobia 1.8c | 9 | 100% |
| sanja.First 0.1 | 3 | 100% |
| baal.nano.N 1.42 | 1 | 100% |
| zyx.micro.Ant 1.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 972. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 29 | 38% | 73 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 16 | 21% | 53 |
| gre.svman4.Leonidas 1.3.2 | 10 | 13% | 33 |
| labg.Cataclysm 2.05 | 10 | 13% | 25 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 7 |
| zyx.micro.Ant 1.1 | 4 | 5% | 4 |
| baal.nano.N 1.42 | 2 | 3% | 6 |
| sanja.First 0.1 | 1 | 1% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 1 | 1% | 4 |

## Melee bench: F34

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.3 | 88.2 | 99 / 210 | 2.06 | 18.7% | 31165 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.7% | 99 |
| stelo.Spread 0.9 | 2.5 | 16.3% | 61 |
| kid.Gladiator .7.2 | 2.5 | 15.8% | 38 |
| tcf.Reach 3 | 4.5 | 10.5% | 4 |
| jcs.Seth 1.8 | 4.7 | 10.8% | 8 |
| cli.Dancer 1.1 | 5.8 | 9.4% | 0 |
| ratosh.Wesco 1.4 | 7.2 | 7.3% | 0 |
| amk.Punbot.Punbot 0.01 | 7.8 | 5.3% | 0 |
| sample.VelociRobot 1.0 | 9.3 | 3.3% | 0 |
| sample.RamFire 1.0 | 9.7 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 86.3 | 14 / 35 | 4838 |
| 2 | 1 | 69.7 | 89.2 | 15 / 35 | 5310 |
| 3 | 1 | 69.8 | 87.0 | 19 / 35 | 5424 |
| 4 | 1 | 69.0 | 88.9 | 13 / 35 | 5355 |
| 5 | 1 | 69.1 | 87.0 | 18 / 35 | 5052 |
| 6 | 1 | 70.2 | 90.8 | 20 / 35 | 5186 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 96 | 60% |
| kid.Gladiator .7.2 | 44 | 55% |
| tcf.Reach 3 | 10 | 60% |
| jcs.Seth 1.8 | 6 | 67% |
| ratosh.Wesco 1.4 | 5 | 100% |
| sample.VelociRobot 1.0 | 1 | 100% |
| cli.Dancer 1.1 | 1 | 100% |

Hadur died in 111 of 210 rounds, at a mean tick of 994. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 50% | 112 |
| kid.Gladiator .7.2 | 34 | 31% | 52 |
| jcs.Seth 1.8 | 6 | 5% | 16 |
| tcf.Reach 3 | 5 | 5% | 11 |
| ratosh.Wesco 1.4 | 5 | 5% | 11 |
| cli.Dancer 1.1 | 4 | 4% | 5 |
| sample.VelociRobot 1.0 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 1 |

## Melee bench: F35

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.4 | 84.2 | 49 / 210 | 2.42 | 16.2% | 22952 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.4% | 138 |
| kc.mini.Mirage 0.2 | 2.0 | 16.2% | 49 |
| gh.mini.Gruwel 0.9 | 3.2 | 12.7% | 16 |
| dmh.robocode.robot.BlackDeath 9.2 | 4.2 | 11.4% | 6 |
| rz.HawkOnFire 0.1 | 4.7 | 10.8% | 0 |
| wit.Chuliath 1.0 | 6.7 | 6.9% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 7.5 | 6.4% | 1 |
| dans.Cinnamon 1.2 | 9.3 | 4.8% | 0 |
| stelo.MyAgileRobot 0.2 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.0 | 84.1 | 10 / 35 | 3588 |
| 2 | 2 | 65.2 | 85.7 | 7 / 35 | 3455 |
| 3 | 2 | 64.3 | 79.7 | 8 / 35 | 3854 |
| 4 | 2 | 66.2 | 85.1 | 10 / 35 | 3935 |
| 5 | 2 | 65.7 | 84.1 | 6 / 35 | 4147 |
| 6 | 2 | 65.8 | 86.3 | 8 / 35 | 3973 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 96 | 15% |
| gh.mini.Gruwel 0.9 | 18 | 50% |
| dmh.robocode.robot.BlackDeath 9.2 | 14 | 86% |
| rz.HawkOnFire 0.1 | 8 | 100% |
| stelo.MyAgileRobot 0.2 | 3 | 100% |
| wit.Chuliath 1.0 | 2 | 100% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 0% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 836. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 102 | 63% | 115 |
| gh.mini.Gruwel 0.9 | 28 | 17% | 38 |
| dmh.robocode.robot.BlackDeath 9.2 | 10 | 6% | 22 |
| rz.HawkOnFire 0.1 | 9 | 6% | 18 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 5 |
| wit.Chuliath 1.0 | 3 | 2% | 6 |
| myl.nano.KomoriNinja 1.1 | 2 | 1% | 3 |
| stelo.MyAgileRobot 0.2 | 1 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |

## Melee bench: F36

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.0 | 95.7 | 175 / 210 | 1.39 | 21.7% | 33948 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.7% | 175 |
| bzdp.Pansy 2.1 | 2.7 | 11.8% | 7 |
| alpha.RainingFire 1.0 | 3.2 | 11.2% | 11 |
| mz.Cork 0.1 | 3.8 | 10.7% | 7 |
| bvh.micro.Freya 0.3 | 4.3 | 10.7% | 7 |
| bvh.mini.Fenrir 0.39 | 6.5 | 9.4% | 1 |
| m3thos.Eva02 0.7.1 | 6.5 | 9.3% | 1 |
| squidM.TentalceMeleeNano 1.1 | 8.2 | 6.2% | 0 |
| dl.BetterWalls 1.0 | 8.8 | 5.3% | 0 |
| sample.MyFirstRobot 1.0 | 10.0 | 3.8% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 73.2 | 98.7 | 33 / 35 | 5850 |
| 2 | 1 | 71.7 | 95.2 | 27 / 35 | 5736 |
| 3 | 1 | 72.1 | 96.2 | 31 / 35 | 5470 |
| 4 | 1 | 72.2 | 98.4 | 30 / 35 | 5567 |
| 5 | 1 | 71.8 | 93.7 | 28 / 35 | 5782 |
| 6 | 1 | 70.9 | 92.1 | 26 / 35 | 5543 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 47 | 98% |
| bvh.micro.Freya 0.3 | 44 | 93% |
| mz.Cork 0.1 | 27 | 89% |
| bvh.mini.Fenrir 0.39 | 26 | 96% |
| alpha.RainingFire 1.0 | 22 | 82% |
| m3thos.Eva02 0.7.1 | 12 | 100% |
| sample.MyFirstRobot 1.0 | 9 | 78% |
| dl.BetterWalls 1.0 | 1 | 100% |
| squidM.TentalceMeleeNano 1.1 | 1 | 100% |

Hadur died in 35 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| alpha.RainingFire 1.0 | 13 | 37% | 32 |
| mz.Cork 0.1 | 6 | 17% | 22 |
| bzdp.Pansy 2.1 | 5 | 14% | 54 |
| bvh.micro.Freya 0.3 | 4 | 11% | 38 |
| bvh.mini.Fenrir 0.39 | 3 | 9% | 24 |
| sample.MyFirstRobot 1.0 | 2 | 6% | 7 |
| dl.BetterWalls 1.0 | 1 | 3% | 15 |
| m3thos.Eva02 0.7.1 | 1 | 3% | 14 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 1 |

## Melee bench: F37

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.5 | 91.6 | 172 / 210 | 1.75 | 20.1% | 34562 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.1% | 172 |
| germ.TheMind .2 | 2.5 | 11.2% | 10 |
| EBBU.Sim2 1.02 | 2.8 | 10.7% | 4 |
| com.syncleus.robocode.Dreadnaught 0.1 | 4.2 | 9.6% | 1 |
| stelo.UntouchableNano 1.3 | 6.3 | 8.5% | 8 |
| agrach.Dalek 1.0 | 7.0 | 8.1% | 6 |
| lmk.ACPFinal 0.1 | 7.2 | 8.1% | 2 |
| mn.nano.perceptual.Impact 1.3.0 | 7.7 | 7.9% | 0 |
| mb.Beast 0.1 | 7.8 | 8.0% | 5 |
| skm.Ryubot 1.0 | 8.5 | 7.6% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 94.6 | 30 / 35 | 5788 |
| 2 | 1 | 69.1 | 89.8 | 28 / 35 | 5718 |
| 3 | 1 | 70.8 | 95.6 | 31 / 35 | 5855 |
| 4 | 1 | 68.6 | 89.2 | 27 / 35 | 5512 |
| 5 | 1 | 71.1 | 96.5 | 32 / 35 | 6202 |
| 6 | 1 | 67.4 | 84.1 | 24 / 35 | 5487 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 42 | 95% |
| EBBU.Sim2 1.02 | 36 | 94% |
| stelo.UntouchableNano 1.3 | 24 | 83% |
| com.syncleus.robocode.Dreadnaught 0.1 | 20 | 100% |
| skm.Ryubot 1.0 | 17 | 100% |
| mb.Beast 0.1 | 16 | 100% |
| lmk.ACPFinal 0.1 | 12 | 100% |
| agrach.Dalek 1.0 | 10 | 100% |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 100% |

Hadur died in 38 of 210 rounds, at a mean tick of 451. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| germ.TheMind .2 | 10 | 26% | 44 |
| stelo.UntouchableNano 1.3 | 6 | 16% | 21 |
| EBBU.Sim2 1.02 | 5 | 13% | 36 |
| agrach.Dalek 1.0 | 5 | 13% | 19 |
| mn.nano.perceptual.Impact 1.3.0 | 5 | 13% | 11 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 8% | 32 |
| lmk.ACPFinal 0.1 | 3 | 8% | 17 |
| skm.Ryubot 1.0 | 1 | 3% | 6 |
| mb.Beast 0.1 | 0 | 0% | 18 |

## Melee bench: F38

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.1 | 115 / 210 | 2.16 | 18.3% | 27789 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.3% | 115 |
| justin.Mallais 14.0 | 2.0 | 15.1% | 49 |
| bvh.mini.Freya 0.55 | 3.0 | 12.9% | 15 |
| cs.Wren 1.0 | 4.5 | 11.0% | 12 |
| bts.mega.Gnarly 1.4 | 5.0 | 10.3% | 9 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.8 | 9.7% | 5 |
| kdf.KoulDestroyer 1.0 | 6.7 | 9.0% | 6 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.2 | 5.7% | 0 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.0% | 0 |
| bzdp.BoxCar 2.0 | 9.5 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 67.0 | 84.8 | 15 / 35 | 4482 |
| 2 | 1 | 67.5 | 84.8 | 17 / 35 | 4734 |
| 3 | 1 | 68.5 | 88.3 | 22 / 35 | 4510 |
| 4 | 1 | 69.3 | 91.4 | 21 / 35 | 4804 |
| 5 | 1 | 69.6 | 91.1 | 21 / 35 | 5025 |
| 6 | 1 | 66.6 | 82.2 | 19 / 35 | 4234 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 60 | 70% |
| bvh.mini.Freya 0.55 | 28 | 82% |
| bts.mega.Gnarly 1.4 | 21 | 90% |
| cs.Wren 1.0 | 17 | 76% |
| davidalves.net.DuelistNanoMelee 1.01 | 12 | 100% |
| kdf.KoulDestroyer 1.0 | 6 | 67% |
| kawigi.spare.SpareParts 0.7.6nosnd | 2 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 742. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 35 | 37% | 75 |
| bvh.mini.Freya 0.55 | 23 | 24% | 36 |
| cs.Wren 1.0 | 15 | 16% | 25 |
| bts.mega.Gnarly 1.4 | 7 | 7% | 30 |
| davidalves.net.DuelistNanoMelee 1.01 | 7 | 7% | 24 |
| kdf.KoulDestroyer 1.0 | 5 | 5% | 10 |
| matt.UnderDark3 2.4.34 | 2 | 2% | 5 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |

## Melee bench: F39

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.7 | 88.9 | 107 / 210 | 2.00 | 19.1% | 32516 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 107 |
| bvh.fry.Freya 0.82 | 2.2 | 14.4% | 28 |
| az.Ololobot 0.2.4 | 2.8 | 13.2% | 43 |
| catcat20.Lambda 0.024 | 4.0 | 10.9% | 25 |
| stelo.SoRobotNanoMelee 1.2 | 5.8 | 8.6% | 8 |
| apollokidd.ApolloKidd 0.9 | 6.2 | 8.0% | 0 |
| gimp.GimpBot 0.1 | 6.8 | 7.7% | 0 |
| winamp32.micro.MicroMacro 1.0 | 7.2 | 7.6% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 9.3 | 5.5% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.7 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.3 | 88.6 | 18 / 35 | 5246 |
| 2 | 1 | 66.8 | 81.9 | 13 / 35 | 5389 |
| 3 | 1 | 69.4 | 92.4 | 17 / 35 | 5606 |
| 4 | 1 | 68.7 | 90.2 | 17 / 35 | 5222 |
| 5 | 1 | 68.0 | 86.0 | 18 / 35 | 5352 |
| 6 | 1 | 71.2 | 94.6 | 24 / 35 | 5701 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 54 | 59% |
| bvh.fry.Freya 0.82 | 53 | 62% |
| catcat20.Lambda 0.024 | 29 | 62% |
| stelo.SoRobotNanoMelee 1.2 | 16 | 94% |
| gimp.GimpBot 0.1 | 5 | 100% |
| winamp32.micro.MicroMacro 1.0 | 2 | 100% |
| apollokidd.ApolloKidd 0.9 | 1 | 100% |

Hadur died in 105 of 210 rounds, at a mean tick of 1113. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 34 | 32% | 71 |
| bvh.fry.Freya 0.82 | 31 | 30% | 65 |
| catcat20.Lambda 0.024 | 20 | 19% | 34 |
| stelo.SoRobotNanoMelee 1.2 | 12 | 11% | 18 |
| gimp.GimpBot 0.1 | 4 | 4% | 10 |
| winamp32.micro.MicroMacro 1.0 | 1 | 1% | 5 |
| apollokidd.ApolloKidd 0.9 | 1 | 1% | 4 |
| dcs.Eater_of_Worlds 1.1.3-A | 1 | 1% | 2 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F40

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 88.1 | 124 / 210 | 2.07 | 19.3% | 30795 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 124 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.8% | 39 |
| kano.gamma.KanoGamma 1.8 | 3.0 | 12.6% | 20 |
| mz.AntiGrav 1.0 | 4.3 | 10.9% | 4 |
| Polkwane.SmashMelee 1.0 | 5.0 | 10.1% | 14 |
| alpha.BlackIce 1.0 | 6.2 | 8.9% | 1 |
| stelo.Randomness 1.0 | 6.5 | 8.1% | 8 |
| amk.superstrike.SuperStrike 0.3 | 8.0 | 6.2% | 0 |
| testantiswapgun.AntiSwap 1.0 | 9.0 | 5.2% | 0 |
| sample.Corners 1.0 | 10.0 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.5 | 21 / 35 | 4960 |
| 2 | 1 | 68.0 | 85.1 | 17 / 35 | 5138 |
| 3 | 1 | 70.7 | 90.8 | 25 / 35 | 5455 |
| 4 | 1 | 69.7 | 88.9 | 20 / 35 | 5282 |
| 5 | 1 | 67.5 | 84.1 | 18 / 35 | 4864 |
| 6 | 1 | 70.1 | 90.2 | 23 / 35 | 5096 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 65 | 58% |
| kano.gamma.KanoGamma 1.8 | 40 | 78% |
| mz.AntiGrav 1.0 | 23 | 100% |
| Polkwane.SmashMelee 1.0 | 16 | 94% |
| stelo.Randomness 1.0 | 11 | 73% |
| alpha.BlackIce 1.0 | 5 | 100% |
| testantiswapgun.AntiSwap 1.0 | 3 | 100% |
| amk.superstrike.SuperStrike 0.3 | 1 | 100% |

Hadur died in 88 of 210 rounds, at a mean tick of 813. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 41 | 47% | 75 |
| kano.gamma.KanoGamma 1.8 | 16 | 18% | 44 |
| stelo.Randomness 1.0 | 8 | 9% | 22 |
| mz.AntiGrav 1.0 | 6 | 7% | 29 |
| Polkwane.SmashMelee 1.0 | 6 | 7% | 15 |
| alpha.BlackIce 1.0 | 6 | 7% | 11 |
| amk.superstrike.SuperStrike 0.3 | 4 | 5% | 8 |
| testantiswapgun.AntiSwap 1.0 | 1 | 1% | 5 |
| sample.Corners 1.0 | 0 | 0% | 1 |

## Melee bench: F41

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 90.8 | 132 / 210 | 1.82 | 19.2% | 27702 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 132 |
| eem.EvBotNG v12.8 | 2.0 | 15.2% | 47 |
| ary.Swarm 1.1 | 3.3 | 12.6% | 7 |
| lessonz.robocode.Oz 0.5.0 | 4.0 | 11.9% | 12 |
| simonton.nano.MeleeSeed 1.8 | 4.7 | 11.2% | 6 |
| shrub.Silver v048 | 6.0 | 8.5% | 2 |
| zyx.nano.Ant 1.1 | 7.3 | 7.1% | 0 |
| jsal.Jsalbot 1.0 | 8.2 | 5.9% | 3 |
| stelo.Mirror 1.1 | 8.5 | 5.8% | 1 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.7 | 25 / 35 | 4527 |
| 2 | 1 | 69.7 | 90.8 | 23 / 35 | 4554 |
| 3 | 1 | 68.9 | 89.8 | 22 / 35 | 4499 |
| 4 | 1 | 69.4 | 89.2 | 22 / 35 | 4721 |
| 5 | 1 | 68.1 | 88.6 | 17 / 35 | 4288 |
| 6 | 1 | 70.5 | 93.0 | 23 / 35 | 5113 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 73 | 63% |
| ary.Swarm 1.1 | 30 | 93% |
| simonton.nano.MeleeSeed 1.8 | 28 | 100% |
| lessonz.robocode.Oz 0.5.0 | 27 | 93% |
| jsal.Jsalbot 1.0 | 4 | 75% |
| shrub.Silver v048 | 2 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 45 | 58% | 99 |
| simonton.nano.MeleeSeed 1.8 | 9 | 12% | 34 |
| lessonz.robocode.Oz 0.5.0 | 9 | 12% | 32 |
| ary.Swarm 1.1 | 8 | 10% | 26 |
| jsal.Jsalbot 1.0 | 3 | 4% | 6 |
| shrub.Silver v048 | 3 | 4% | 6 |
| stelo.Mirror 1.1 | 1 | 1% | 4 |
| zyx.nano.Ant 1.1 | 0 | 0% | 2 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

## Melee bench: F42

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 90.8 | 122 / 210 | 1.82 | 19.6% | 32775 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 122 |
| wompi.Wallaby 5.1 | 2.2 | 14.5% | 33 |
| ara.Shera 0.88 | 3.3 | 13.6% | 34 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.6% | 21 |
| amz.NanoClone 1.41 | 5.0 | 8.8% | 0 |
| maribo.IotaCT 1.1 | 6.2 | 7.5% | 0 |
| dsw.StaticD 1.0 | 7.0 | 7.0% | 1 |
| stelo.MirrorMicro 1.0 | 8.3 | 5.8% | 0 |
| mme.NikeEnhanced 2.0 | 8.7 | 5.3% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.2 | 92.4 | 22 / 35 | 5600 |
| 2 | 1 | 70.1 | 91.7 | 22 / 35 | 5415 |
| 3 | 1 | 70.3 | 91.1 | 22 / 35 | 5449 |
| 4 | 1 | 67.9 | 86.0 | 13 / 35 | 5184 |
| 5 | 1 | 70.9 | 93.7 | 25 / 35 | 5642 |
| 6 | 1 | 69.3 | 90.2 | 18 / 35 | 5485 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.mini.MiniQuester 0.1 | 50 | 86% |
| ara.Shera 0.88 | 50 | 58% |
| wompi.Wallaby 5.1 | 48 | 77% |
| dsw.StaticD 1.0 | 9 | 100% |
| amz.NanoClone 1.41 | 1 | 100% |
| mme.NikeEnhanced 2.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 89 of 210 rounds, at a mean tick of 976. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 33 | 37% | 59 |
| wompi.Wallaby 5.1 | 31 | 35% | 66 |
| maribo.mini.MiniQuester 0.1 | 21 | 24% | 66 |
| dsw.StaticD 1.0 | 1 | 1% | 12 |
| amz.NanoClone 1.41 | 1 | 1% | 2 |
| stelo.MirrorMicro 1.0 | 1 | 1% | 2 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 1 |
| maribo.IotaCT 1.1 | 0 | 0% | 2 |

## Melee bench: F43

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.0 | 82.3 | 41 / 210 | 2.60 | 16.0% | 23514 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 20.7% | 145 |
| kc.mini.Mirage 0.2 | 2.0 | 16.0% | 41 |
| brainfade.melee.Dusk 0.44 | 3.5 | 12.1% | 14 |
| dummy.micro.Sparrow 2.5 | 4.3 | 11.0% | 6 |
| wcsv.melee.EngineerMelee 0.1 | 4.3 | 11.0% | 2 |
| Krabb.akim2.Akim2 1.1b | 6.2 | 9.7% | 1 |
| jab.DiamondStealer 5 | 7.0 | 8.0% | 0 |
| mz.NanoGod 2.02 | 7.7 | 6.9% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.2% | 1 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 68.0 | 86.0 | 12 / 35 | 4351 |
| 2 | 2 | 64.5 | 78.4 | 4 / 35 | 3747 |
| 3 | 2 | 67.4 | 87.6 | 8 / 35 | 3997 |
| 4 | 2 | 64.3 | 79.7 | 3 / 35 | 3563 |
| 5 | 2 | 64.1 | 75.2 | 6 / 35 | 3620 |
| 6 | 2 | 67.5 | 86.7 | 8 / 35 | 4236 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 104 | 15% |
| brainfade.melee.Dusk 0.44 | 16 | 63% |
| wcsv.melee.EngineerMelee 0.1 | 8 | 100% |
| dummy.micro.Sparrow 2.5 | 5 | 80% |
| cvt.Firsty 1.0 | 3 | 67% |
| mz.NanoGod 2.02 | 1 | 100% |

Hadur died in 169 of 210 rounds, at a mean tick of 950. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 114 | 67% | 130 |
| brainfade.melee.Dusk 0.44 | 25 | 15% | 34 |
| dummy.micro.Sparrow 2.5 | 12 | 7% | 18 |
| wcsv.melee.EngineerMelee 0.1 | 9 | 5% | 17 |
| Krabb.akim2.Akim2 1.1b | 5 | 3% | 5 |
| cvt.Firsty 1.0 | 2 | 1% | 3 |
| mz.NanoGod 2.02 | 2 | 1% | 2 |
| jab.DiamondStealer 5 | 0 | 0% | 1 |

## Melee bench: F44

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.0 | 92.3 | 151 / 210 | 1.69 | 20.7% | 34227 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 151 |
| stelo.Liblix 0.3.1 | 2.3 | 14.4% | 38 |
| tzu.TheArtOfWar 1.2 | 2.7 | 13.3% | 15 |
| wompi.Quokka 1.6 | 4.5 | 9.9% | 0 |
| jwirde.Gort 2.0 | 5.0 | 9.2% | 5 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.7 | 9.0% | 1 |
| disan.Chair 2.2.0 | 7.2 | 7.4% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.0% | 0 |
| amk.jointstrike.JointStrike 0.2 | 9.3 | 4.5% | 0 |
| sample.Crazy 1.0 | 9.7 | 4.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 92.1 | 25 / 35 | 5921 |
| 2 | 1 | 71.9 | 95.6 | 26 / 35 | 5646 |
| 3 | 1 | 71.5 | 92.4 | 28 / 35 | 5744 |
| 4 | 1 | 68.9 | 86.0 | 21 / 35 | 5364 |
| 5 | 1 | 72.2 | 95.6 | 29 / 35 | 6023 |
| 6 | 1 | 70.6 | 92.4 | 22 / 35 | 5529 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 83 | 78% |
| tzu.TheArtOfWar 1.2 | 59 | 85% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 10 | 100% |
| wompi.Quokka 1.6 | 9 | 100% |
| jwirde.Gort 2.0 | 8 | 88% |
| disan.Chair 2.2.0 | 6 | 100% |
| stf.PanzerGeneral 0.1 | 2 | 100% |
| amk.jointstrike.JointStrike 0.2 | 1 | 100% |
| sample.Crazy 1.0 | 1 | 100% |

Hadur died in 59 of 210 rounds, at a mean tick of 860. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 27 | 46% | 99 |
| tzu.TheArtOfWar 1.2 | 19 | 32% | 60 |
| disan.Chair 2.2.0 | 4 | 7% | 9 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 3 | 5% | 14 |
| jwirde.Gort 2.0 | 2 | 3% | 11 |
| wompi.Quokka 1.6 | 2 | 3% | 7 |
| stf.PanzerGeneral 0.1 | 1 | 2% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 2% | 3 |
| sample.Crazy 1.0 | 0 | 0% | 3 |

## Melee bench: F45

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 91.6 | 96 / 210 | 1.76 | 20.5% | 36253 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 96 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.3% | 95 |
| jje.BagPuss 1.2 | 3.0 | 11.4% | 9 |
| myl.nano.Graviton 1.10 | 4.3 | 10.3% | 1 |
| sul.Lunar 1.1 | 4.8 | 10.1% | 5 |
| fm.claire 1.7 | 6.3 | 8.8% | 1 |
| hvilela.HVilela 0.9 | 6.7 | 8.7% | 1 |
| pez.mini.ChironexFleckeri 0.5 | 7.7 | 7.3% | 2 |
| wit.Deep7 2.0 | 9.0 | 5.8% | 0 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.7 | 92.1 | 18 / 35 | 6114 |
| 2 | 1 | 70.9 | 91.7 | 17 / 35 | 6266 |
| 3 | 1 | 69.9 | 91.1 | 11 / 35 | 6017 |
| 4 | 1 | 69.5 | 91.1 | 17 / 35 | 5654 |
| 5 | 1 | 70.8 | 93.3 | 19 / 35 | 5911 |
| 6 | 1 | 70.4 | 90.2 | 14 / 35 | 6291 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 111 | 29% |
| jje.BagPuss 1.2 | 23 | 74% |
| sul.Lunar 1.1 | 21 | 100% |
| myl.nano.Graviton 1.10 | 13 | 100% |
| pez.mini.ChironexFleckeri 0.5 | 5 | 80% |
| fm.claire 1.7 | 5 | 80% |
| wit.Deep7 2.0 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 50% |

Hadur died in 114 of 210 rounds, at a mean tick of 1993. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 84 | 74% | 0 |
| jje.BagPuss 1.2 | 10 | 9% | 54 |
| sul.Lunar 1.1 | 8 | 7% | 64 |
| myl.nano.Graviton 1.10 | 4 | 4% | 36 |
| pez.mini.ChironexFleckeri 0.5 | 4 | 4% | 23 |
| fm.claire 1.7 | 3 | 3% | 12 |
| hvilela.HVilela 0.9 | 1 | 1% | 7 |
| wit.Deep7 2.0 | 0 | 0% | 9 |
| abud.ThirdRobo 1.0 | 0 | 0% | 2 |

## Melee bench: F46

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 85.9 | 80 / 210 | 2.27 | 17.5% | 28721 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.5% | 80 |
| rsalesc.melee.Medina 0.4.5 | 1.7 | 17.0% | 87 |
| hadur117.mini.Deise 0.2 | 3.0 | 14.6% | 22 |
| mz.MicroSheep 1.0 | 4.7 | 10.8% | 5 |
| cx.Princess 1.0 | 4.7 | 10.1% | 14 |
| sadoner.killer 0.2 | 5.7 | 8.8% | 1 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.2% | 1 |
| jeremyreeder.collective.Prophet 5 | 7.8 | 5.9% | 0 |
| kurios.DOSexe .9a | 9.0 | 4.6% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 91.7 | 16 / 35 | 5284 |
| 2 | 1 | 68.8 | 90.2 | 18 / 35 | 5049 |
| 3 | 2 | 67.0 | 86.7 | 11 / 35 | 4605 |
| 4 | 2 | 66.5 | 83.8 | 10 / 35 | 4847 |
| 5 | 1 | 65.5 | 81.3 | 11 / 35 | 4386 |
| 6 | 1 | 65.9 | 81.6 | 14 / 35 | 4550 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 83 | 35% |
| hadur117.mini.Deise 0.2 | 34 | 79% |
| cx.Princess 1.0 | 19 | 63% |
| mz.MicroSheep 1.0 | 11 | 73% |
| sadoner.killer 0.2 | 2 | 100% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 131 of 210 rounds, at a mean tick of 935. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 70 | 53% | 101 |
| hadur117.mini.Deise 0.2 | 25 | 19% | 52 |
| mz.MicroSheep 1.0 | 11 | 8% | 20 |
| cx.Princess 1.0 | 11 | 8% | 17 |
| arthord.NanoSatanMelee Beta | 11 | 8% | 13 |
| sadoner.killer 0.2 | 3 | 2% | 5 |
| kurios.DOSexe .9a | 0 | 0% | 1 |
| mbro.Detektor3 0.1.1 | 0 | 0% | 1 |

