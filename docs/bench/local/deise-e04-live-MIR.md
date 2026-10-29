# Bench suite: suite.txt

## Melee bench: F01

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.8 | 84.9 | 49 / 210 | 2.36 | 17.0% | 30689 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 1.0 | 19.7% | 135 |
| kc.mini.Mirage 0.2 | 2.0 | 17.0% | 49 |
| sgp.JollyNinja 3.53 | 3.8 | 11.4% | 15 |
| mz.MicroGodMelee 1 | 3.8 | 10.7% | 7 |
| simonton.nano.WeekendObsession_Melee 1.0 | 5.2 | 10.4% | 2 |
| lorneswork.Predator 1.0 | 5.2 | 10.0% | 2 |
| adt.Ar2 1.0 | 7.2 | 7.4% | 0 |
| kawigi.sbf.FloodSonnet 0.9 | 8.0 | 5.5% | 0 |
| skm.butterfly 1.0 | 8.8 | 5.0% | 0 |
| mym.EdgeStalker 1.0 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.6 | 83.2 | 8 / 35 | 5378 |
| 2 | 2 | 66.7 | 86.3 | 7 / 35 | 4681 |
| 3 | 2 | 67.6 | 87.6 | 6 / 35 | 5410 |
| 4 | 2 | 66.2 | 84.4 | 6 / 35 | 4943 |
| 5 | 2 | 67.3 | 85.4 | 12 / 35 | 5030 |
| 6 | 2 | 66.6 | 82.5 | 10 / 35 | 5247 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.Diamond 1.8.28 | 127 | 19% |
| mz.MicroGodMelee 1 | 15 | 73% |
| sgp.JollyNinja 3.53 | 14 | 71% |
| simonton.nano.WeekendObsession_Melee 1.0 | 4 | 75% |
| lorneswork.Predator 1.0 | 1 | 0% |
| skm.butterfly 1.0 | 1 | 100% |

Hadur died in 161 of 210 rounds, at a mean tick of 984. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.Diamond 1.8.28 | 112 | 70% | 135 |
| sgp.JollyNinja 3.53 | 21 | 13% | 29 |
| mz.MicroGodMelee 1 | 11 | 7% | 22 |
| simonton.nano.WeekendObsession_Melee 1.0 | 7 | 4% | 9 |
| lorneswork.Predator 1.0 | 4 | 2% | 6 |
| skm.butterfly 1.0 | 3 | 2% | 5 |
| kawigi.sbf.FloodSonnet 0.9 | 2 | 1% | 3 |
| adt.Ar2 1.0 | 1 | 1% | 1 |

## Melee bench: F02

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.4 | 83.5 | 96 / 210 | 2.49 | 18.2% | 31176 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.2% | 96 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 2.7 | 13.3% | 32 |
| pulsar.PulsarMax 0.8.9 | 2.7 | 13.5% | 47 |
| lrem.micro.SpikeSoldier 0.4 | 3.7 | 11.1% | 2 |
| com.cohesiva.robocode.ManOwaR 1.0 | 5.7 | 8.9% | 9 |
| fnc.bandit.Bandit 5.2.0 | 6.5 | 8.0% | 1 |
| sch.Simone 0.3d | 7.0 | 7.9% | 12 |
| Noran.BitchingElk 0.054 | 7.8 | 7.4% | 8 |
| stelo.PatternRobot 1.0 | 8.3 | 6.6% | 4 |
| fullsail.SweetTea 1.1 | 9.7 | 5.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 86.0 | 19 / 35 | 5371 |
| 2 | 1 | 68.3 | 87.6 | 17 / 35 | 5035 |
| 3 | 1 | 66.1 | 78.4 | 12 / 35 | 5132 |
| 4 | 1 | 68.5 | 87.6 | 17 / 35 | 5116 |
| 5 | 1 | 66.8 | 80.6 | 16 / 35 | 5318 |
| 6 | 1 | 66.6 | 80.6 | 15 / 35 | 5204 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pulsar.PulsarMax 0.8.9 | 51 | 47% |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 45 | 69% |
| sch.Simone 0.3d | 14 | 71% |
| lrem.micro.SpikeSoldier 0.4 | 14 | 100% |
| com.cohesiva.robocode.ManOwaR 1.0 | 12 | 58% |
| Noran.BitchingElk 0.054 | 5 | 60% |
| stelo.PatternRobot 1.0 | 3 | 100% |
| fullsail.SweetTea 1.1 | 2 | 100% |
| fnc.bandit.Bandit 5.2.0 | 2 | 100% |

Hadur died in 115 of 210 rounds, at a mean tick of 871. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pulsar.PulsarMax 0.8.9 | 43 | 37% | 61 |
| rsalesc.roborio.RoborioPorradeiro 1.1b | 24 | 21% | 56 |
| lrem.micro.SpikeSoldier 0.4 | 13 | 11% | 20 |
| sch.Simone 0.3d | 7 | 6% | 19 |
| Noran.BitchingElk 0.054 | 7 | 6% | 15 |
| com.cohesiva.robocode.ManOwaR 1.0 | 7 | 6% | 13 |
| stelo.PatternRobot 1.0 | 7 | 6% | 11 |
| fnc.bandit.Bandit 5.2.0 | 5 | 4% | 9 |
| fullsail.SweetTea 1.1 | 2 | 2% | 6 |

## Melee bench: F03

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 2 other Robocode JVMs running (hadur.bench.MeleeRunner x2), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 94.1 | 164 / 210 | 1.53 | 20.9% | 37907 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.9% | 164 |
| kawigi.nano.Lib 1.0 | 2.8 | 13.3% | 20 |
| vuen.Cake 2.51 | 3.0 | 12.9% | 21 |
| radnor.DoctorBob 1.42 | 3.2 | 12.8% | 4 |
| urdos.URDOS 1.3 | 5.0 | 9.3% | 0 |
| adt.Ar1 2.1 | 6.2 | 7.7% | 0 |
| ghent.ArthurPanzergon 1.0.0 | 7.0 | 6.9% | 1 |
| oa.weak.FlyMk1 0.1 | 8.2 | 5.9% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 8.7 | 5.6% | 0 |
| bwbaugh.nano.Tirunculus 0.0.0a | 10.0 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.2 | 94.3 | 26 / 35 | 6510 |
| 2 | 1 | 71.1 | 93.3 | 28 / 35 | 6399 |
| 3 | 1 | 71.3 | 95.6 | 26 / 35 | 6211 |
| 4 | 1 | 72.2 | 97.8 | 29 / 35 | 6527 |
| 5 | 1 | 70.6 | 91.7 | 29 / 35 | 6154 |
| 6 | 1 | 70.7 | 92.1 | 26 / 35 | 6106 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| vuen.Cake 2.51 | 74 | 78% |
| kawigi.nano.Lib 1.0 | 69 | 88% |
| radnor.DoctorBob 1.42 | 35 | 100% |
| ghent.ArthurPanzergon 1.0.0 | 3 | 100% |
| urdos.URDOS 1.3 | 3 | 100% |
| adt.Ar1 2.1 | 2 | 100% |
| oa.weak.FlyMk1 0.1 | 2 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 834. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| vuen.Cake 2.51 | 21 | 46% | 82 |
| kawigi.nano.Lib 1.0 | 12 | 26% | 63 |
| ghent.ArthurPanzergon 1.0.0 | 3 | 7% | 5 |
| bwbaugh.nano.Tirunculus 0.0.0a | 3 | 7% | 3 |
| radnor.DoctorBob 1.42 | 2 | 4% | 37 |
| urdos.URDOS 1.3 | 2 | 4% | 6 |
| adt.Ar1 2.1 | 2 | 4% | 4 |
| oa.weak.FlyMk1 0.1 | 1 | 2% | 5 |
| de.simpleworks.robocode.bots.swiBot 1.0 | 0 | 0% | 4 |

## Melee bench: F04

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.0 | 85.9 | 17 / 210 | 2.27 | 17.4% | 34478 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 1.0 | 23.7% | 186 |
| kc.mini.Mirage 0.2 | 2.0 | 17.4% | 17 |
| apc.LeeroyJenkins2 1.0 | 3.0 | 12.8% | 2 |
| TNT.TNT 0.99.1 | 4.2 | 9.8% | 1 |
| josago.Jorgito 0.16 | 4.8 | 8.9% | 1 |
| tj.zombie1n 1.0.1 | 6.5 | 6.7% | 1 |
| css.Delitioner 0.11 | 6.5 | 6.8% | 1 |
| rampancy.Durandal 2.1d | 8.2 | 5.4% | 0 |
| spin.Bugstard 0.012b | 9.2 | 4.3% | 1 |
| sp.Nanos.Ember 1.1 | 9.7 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 86.0 | 4 / 35 | 5558 |
| 2 | 2 | 67.2 | 85.4 | 4 / 35 | 5320 |
| 3 | 2 | 67.3 | 83.5 | 1 / 35 | 5616 |
| 4 | 2 | 68.2 | 85.7 | 2 / 35 | 6040 |
| 5 | 2 | 68.6 | 88.6 | 4 / 35 | 5720 |
| 6 | 2 | 68.7 | 86.0 | 2 / 35 | 6224 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 158 | 6% |
| apc.LeeroyJenkins2 1.0 | 5 | 80% |
| TNT.TNT 0.99.1 | 3 | 100% |
| spin.Bugstard 0.012b | 2 | 50% |
| css.Delitioner 0.11 | 1 | 0% |
| josago.Jorgito 0.16 | 1 | 0% |

Hadur died in 193 of 210 rounds, at a mean tick of 1188. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| aaa.r.ScalarR 0.005g.047 | 170 | 88% | 179 |
| apc.LeeroyJenkins2 1.0 | 11 | 6% | 17 |
| TNT.TNT 0.99.1 | 4 | 2% | 7 |
| josago.Jorgito 0.16 | 3 | 2% | 3 |
| tj.zombie1n 1.0.1 | 2 | 1% | 2 |
| css.Delitioner 0.11 | 2 | 1% | 2 |
| spin.Bugstard 0.012b | 1 | 1% | 0 |

## Melee bench: F05

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 63.0 | 75.7 | 33 / 210 | 3.19 | 14.6% | 22900 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 1.2 | 18.0% | 107 |
| justin.DemonicRage 3.4 | 1.8 | 16.7% | 49 |
| kc.mini.Mirage 0.2 | 3.0 | 14.6% | 33 |
| wompi.Numbat 2.1 | 4.0 | 12.3% | 15 |
| ms.Ares 0.19 | 5.2 | 9.2% | 2 |
| axeBots.HataMoto 3.09 | 5.8 | 8.6% | 4 |
| supersample.SuperBoxBot 1.0 | 7.2 | 6.5% | 0 |
| davidalves.net.DuelistMicroMelee 1.4 | 7.8 | 5.6% | 0 |
| GarmBox.Oranges 1.0 | 9.5 | 4.1% | 0 |
| Queens_teamrobot.UltraRazor 1.0 | 9.5 | 4.4% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 3 | 62.4 | 72.4 | 5 / 35 | 3923 |
| 2 | 3 | 63.7 | 77.5 | 9 / 35 | 3811 |
| 3 | 3 | 64.2 | 78.1 | 8 / 35 | 3785 |
| 4 | 3 | 63.7 | 78.1 | 5 / 35 | 3984 |
| 5 | 3 | 61.1 | 71.4 | 2 / 35 | 3695 |
| 6 | 3 | 62.7 | 76.5 | 4 / 35 | 3702 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.fire.Firestarter 2.0f | 43 | 21% |
| justin.DemonicRage 3.4 | 33 | 36% |
| wompi.Numbat 2.1 | 15 | 53% |
| axeBots.HataMoto 3.09 | 4 | 75% |
| ms.Ares 0.19 | 2 | 50% |

Hadur died in 177 of 210 rounds, at a mean tick of 822. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cb.fire.Firestarter 2.0f | 66 | 37% | 75 |
| justin.DemonicRage 3.4 | 55 | 31% | 66 |
| wompi.Numbat 2.1 | 37 | 21% | 44 |
| ms.Ares 0.19 | 10 | 6% | 12 |
| axeBots.HataMoto 3.09 | 4 | 2% | 7 |
| supersample.SuperBoxBot 1.0 | 2 | 1% | 2 |
| davidalves.net.DuelistMicroMelee 1.4 | 1 | 1% | 2 |
| GarmBox.Oranges 1.0 | 1 | 1% | 1 |
| Queens_teamrobot.UltraRazor 1.0 | 1 | 1% | 1 |

## Melee bench: F06

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.1 | 87.0 | 115 / 210 | 2.17 | 18.4% | 28332 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.4% | 115 |
| jekl.StoneGhost 0.7 | 2.0 | 14.6% | 29 |
| origin.SleepSiphon 1.7b | 3.2 | 13.0% | 40 |
| pe.minimelee.SandboxMiniMelee 1.1 | 4.3 | 11.7% | 19 |
| mld.Wisdom 1.0 | 4.5 | 11.2% | 4 |
| gg.Wolverine 2.0 | 6.0 | 8.4% | 3 |
| spinnercat.Omen 1.0 | 7.3 | 7.1% | 0 |
| DBall.NUKE 0.1 | 8.2 | 6.4% | 0 |
| ers.nano.hawk.HawkLA 3.0m | 8.5 | 6.2% | 1 |
| sample.Fire 1.0 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.9 | 82.5 | 13 / 35 | 4778 |
| 2 | 1 | 68.9 | 88.9 | 20 / 35 | 4853 |
| 3 | 1 | 67.8 | 86.3 | 23 / 35 | 4590 |
| 4 | 1 | 68.2 | 86.0 | 19 / 35 | 4931 |
| 5 | 1 | 69.7 | 91.4 | 23 / 35 | 4868 |
| 6 | 1 | 67.1 | 86.7 | 17 / 35 | 4312 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jekl.StoneGhost 0.7 | 45 | 82% |
| origin.SleepSiphon 1.7b | 44 | 61% |
| pe.minimelee.SandboxMiniMelee 1.1 | 35 | 83% |
| gg.Wolverine 2.0 | 10 | 90% |
| ers.nano.hawk.HawkLA 3.0m | 7 | 86% |
| mld.Wisdom 1.0 | 5 | 80% |
| DBall.NUKE 0.1 | 3 | 100% |

Hadur died in 98 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| origin.SleepSiphon 1.7b | 36 | 37% | 67 |
| jekl.StoneGhost 0.7 | 29 | 30% | 59 |
| pe.minimelee.SandboxMiniMelee 1.1 | 15 | 15% | 44 |
| mld.Wisdom 1.0 | 10 | 10% | 19 |
| gg.Wolverine 2.0 | 4 | 4% | 7 |
| DBall.NUKE 0.1 | 1 | 1% | 8 |
| ers.nano.hawk.HawkLA 3.0m | 1 | 1% | 3 |
| spinnercat.Omen 1.0 | 1 | 1% | 2 |
| sample.Fire 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F07

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 1 other Robocode JVM running (hadur.bench.MeleeRunner x1), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.2 | 90.5 | 119 / 210 | 1.86 | 19.8% | 36243 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.8% | 119 |
| rsalesc.melee.Monk 0.3.6c | 2.0 | 17.6% | 54 |
| rtk.Tachikoma 1.0 | 3.0 | 15.3% | 24 |
| oog.melee.CapuletDroid 1.1 | 4.2 | 11.6% | 6 |
| franzor.Lizt 1.3.1 | 4.8 | 10.4% | 6 |
| exauge.GateKeeper 1.1.121g | 6.5 | 7.9% | 0 |
| lrem.micro.MoggFanatic 0.2 | 6.5 | 7.8% | 0 |
| skm.PateranBotlock2 1.0 | 8.0 | 5.0% | 1 |
| sample.Target 1.0 | 9.3 | 2.5% | 0 |
| drd.Dreadknoght 0.9 | 9.7 | 2.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 92.1 | 20 / 35 | 5930 |
| 2 | 1 | 71.4 | 91.1 | 20 / 35 | 6137 |
| 3 | 1 | 70.4 | 88.6 | 17 / 35 | 5831 |
| 4 | 1 | 71.8 | 91.1 | 22 / 35 | 6149 |
| 5 | 1 | 72.1 | 94.3 | 23 / 35 | 6306 |
| 6 | 1 | 69.9 | 85.7 | 17 / 35 | 5890 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rtk.Tachikoma 1.0 | 77 | 86% |
| rsalesc.melee.Monk 0.3.6c | 50 | 22% |
| oog.melee.CapuletDroid 1.1 | 29 | 97% |
| franzor.Lizt 1.3.1 | 14 | 79% |
| exauge.GateKeeper 1.1.121g | 2 | 100% |
| skm.PateranBotlock2 1.0 | 1 | 100% |

Hadur died in 91 of 210 rounds, at a mean tick of 1107. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Monk 0.3.6c | 50 | 55% | 74 |
| rtk.Tachikoma 1.0 | 29 | 32% | 94 |
| oog.melee.CapuletDroid 1.1 | 7 | 8% | 31 |
| franzor.Lizt 1.3.1 | 4 | 4% | 3 |
| exauge.GateKeeper 1.1.121g | 1 | 1% | 6 |
| skm.PateranBotlock2 1.0 | 0 | 0% | 1 |
| lrem.micro.MoggFanatic 0.2 | 0 | 0% | 1 |

## Melee bench: F08

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 6 over 6 battles (1.0 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.1 | 92.1 | 138 / 210 | 1.71 | 20.2% | 32791 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 138 |
| tm.Yuugao 1.0 | 2.2 | 12.9% | 36 |
| shrub.Vapour v159 | 3.0 | 11.9% | 16 |
| Krabb.sliNk.Garm 0.9u | 4.3 | 10.3% | 10 |
| com.spp.robocode.MostlyHarmless 010 | 4.8 | 9.7% | 5 |
| jwst.DAD.DarkAndDarker 1.1 | 6.2 | 8.5% | 4 |
| m3thos.Eva00 1.1 | 6.5 | 8.3% | 2 |
| qualidafial.MajorDick 1.0.1 | 8.5 | 6.5% | 0 |
| SHAM.WOW 1.4 | 9.2 | 5.7% | 0 |
| zyx.nano.BacillusComma 1.0 | 9.3 | 5.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.0 | 93.7 | 24 / 35 | 5250 |
| 2 | 1 | 70.3 | 92.7 | 23 / 35 | 5550 |
| 3 | 1 | 69.8 | 91.1 | 21 / 35 | 5383 |
| 4 | 1 | 70.3 | 91.4 | 25 / 35 | 5403 |
| 5 | 1 | 69.1 | 90.8 | 19 / 35 | 5255 |
| 6 | 1 | 71.0 | 93.0 | 26 / 35 | 5950 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| tm.Yuugao 1.0 | 51 | 57% |
| shrub.Vapour v159 | 47 | 79% |
| jwst.DAD.DarkAndDarker 1.1 | 25 | 100% |
| com.spp.robocode.MostlyHarmless 010 | 23 | 83% |
| Krabb.sliNk.Garm 0.9u | 22 | 73% |
| m3thos.Eva00 1.1 | 6 | 100% |
| zyx.nano.BacillusComma 1.0 | 3 | 100% |
| SHAM.WOW 1.4 | 2 | 100% |
| qualidafial.MajorDick 1.0.1 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 913. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| tm.Yuugao 1.0 | 28 | 39% | 65 |
| shrub.Vapour v159 | 14 | 19% | 49 |
| Krabb.sliNk.Garm 0.9u | 12 | 17% | 28 |
| com.spp.robocode.MostlyHarmless 010 | 8 | 11% | 30 |
| jwst.DAD.DarkAndDarker 1.1 | 5 | 7% | 23 |
| m3thos.Eva00 1.1 | 2 | 3% | 5 |
| qualidafial.MajorDick 1.0.1 | 2 | 3% | 3 |
| zyx.nano.BacillusComma 1.0 | 1 | 1% | 1 |
| SHAM.WOW 1.4 | 0 | 0% | 5 |

## Melee bench: F09

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.7 | 79.7 | 84 / 210 | 2.83 | 16.7% | 25683 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.5 | 16.7% | 84 |
| positive.Portia 1.26e | 1.7 | 16.9% | 84 |
| kc.micro.Figment 1.0 | 2.8 | 13.9% | 23 |
| yagami.Tidus 0.11 | 4.5 | 10.5% | 1 |
| mc2.enemy.Original 0.9 | 5.2 | 9.6% | 10 |
| pedersen.Grishnakh 1.0 | 5.3 | 9.4% | 6 |
| dft.Calliope 5.6 | 7.2 | 6.9% | 2 |
| step.nanoPri 1.0 | 8.0 | 6.1% | 0 |
| robar.nano.Assertive_Melee 0.2 | 9.3 | 5.2% | 0 |
| rdm.Dueler 0.4x | 9.5 | 4.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.6 | 79.4 | 19 / 35 | 4043 |
| 2 | 1 | 65.7 | 79.7 | 14 / 35 | 4308 |
| 3 | 2 | 67.2 | 84.4 | 12 / 35 | 4435 |
| 4 | 1 | 66.1 | 82.5 | 13 / 35 | 4268 |
| 5 | 2 | 64.1 | 74.0 | 11 / 35 | 4311 |
| 6 | 2 | 65.6 | 78.1 | 15 / 35 | 4318 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| positive.Portia 1.26e | 53 | 43% |
| kc.micro.Figment 1.0 | 41 | 83% |
| pedersen.Grishnakh 1.0 | 11 | 91% |
| mc2.enemy.Original 0.9 | 9 | 67% |
| yagami.Tidus 0.11 | 9 | 100% |
| step.nanoPri 1.0 | 1 | 100% |

Hadur died in 126 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| positive.Portia 1.26e | 56 | 44% | 81 |
| kc.micro.Figment 1.0 | 29 | 23% | 68 |
| mc2.enemy.Original 0.9 | 12 | 10% | 18 |
| yagami.Tidus 0.11 | 9 | 7% | 16 |
| robar.nano.Assertive_Melee 0.2 | 9 | 7% | 9 |
| pedersen.Grishnakh 1.0 | 4 | 3% | 10 |
| step.nanoPri 1.0 | 3 | 2% | 4 |
| rdm.Dueler 0.4x | 3 | 2% | 3 |
| dft.Calliope 5.6 | 1 | 1% | 1 |

## Melee bench: F10

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 93.4 | 154 / 210 | 1.60 | 20.2% | 33872 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.2% | 154 |
| DTF.Kludgy 1.2b | 2.8 | 13.6% | 28 |
| ne.Chimera 1.2 | 2.8 | 12.9% | 9 |
| ejb.Polaris 1.0.1 | 3.3 | 12.6% | 11 |
| vStar.RAFzilla 2.15 | 5.0 | 10.3% | 5 |
| tvv.micro.Antares 1.1.1 | 6.0 | 9.7% | 2 |
| sam.Samspin 1.0 | 7.8 | 5.7% | 0 |
| Grystrion.RandomTrackerNOREV 1.0 | 8.0 | 5.5% | 0 |
| kurios.DOSexe .9b | 8.5 | 5.3% | 1 |
| donjezza.Muncho 1.0 | 9.7 | 4.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.8 | 95.9 | 28 / 35 | 5648 |
| 2 | 1 | 71.3 | 95.2 | 25 / 35 | 5954 |
| 3 | 1 | 68.7 | 89.2 | 23 / 35 | 5039 |
| 4 | 1 | 71.8 | 95.6 | 31 / 35 | 5819 |
| 5 | 1 | 71.0 | 96.2 | 26 / 35 | 5743 |
| 6 | 1 | 69.4 | 88.3 | 21 / 35 | 5669 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ejb.Polaris 1.0.1 | 51 | 90% |
| DTF.Kludgy 1.2b | 47 | 70% |
| ne.Chimera 1.2 | 42 | 88% |
| tvv.micro.Antares 1.1.1 | 16 | 94% |
| vStar.RAFzilla 2.15 | 16 | 94% |
| donjezza.Muncho 1.0 | 4 | 75% |
| kurios.DOSexe .9b | 3 | 100% |
| Grystrion.RandomTrackerNOREV 1.0 | 1 | 100% |
| sam.Samspin 1.0 | 1 | 100% |

Hadur died in 56 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| DTF.Kludgy 1.2b | 21 | 38% | 49 |
| ne.Chimera 1.2 | 13 | 23% | 50 |
| ejb.Polaris 1.0.1 | 12 | 21% | 54 |
| vStar.RAFzilla 2.15 | 3 | 5% | 20 |
| tvv.micro.Antares 1.1.1 | 2 | 4% | 14 |
| donjezza.Muncho 1.0 | 2 | 4% | 6 |
| sam.Samspin 1.0 | 2 | 4% | 4 |
| kurios.DOSexe .9b | 1 | 2% | 7 |
| Grystrion.RandomTrackerNOREV 1.0 | 0 | 0% | 3 |

## Melee bench: F11

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.2 | 84.8 | 96 / 210 | 2.37 | 17.9% | 28170 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 17.9% | 96 |
| rz.Aleph 0.34 | 1.7 | 16.5% | 64 |
| cx.mini.Nimrod 0.55 | 3.5 | 11.6% | 21 |
| djc.DynaBot 0.1.1 | 3.8 | 10.2% | 11 |
| rdt199.Warlord 0.73 | 5.3 | 9.1% | 7 |
| br2.MobyDickBot 1.6 | 6.3 | 8.2% | 7 |
| uji.YellohFellah 1.0 | 6.7 | 8.3% | 4 |
| KiraNL.Chupacabra 0.4 | 7.3 | 7.5% | 0 |
| stelo.MirrorNano 1.3 | 9.5 | 5.5% | 1 |
| jeremyreeder.Vincent 2011.12.09 | 9.5 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.8 | 84.8 | 14 / 35 | 5031 |
| 2 | 1 | 67.0 | 85.7 | 15 / 35 | 4509 |
| 3 | 1 | 69.3 | 92.4 | 23 / 35 | 4614 |
| 4 | 1 | 66.8 | 82.5 | 14 / 35 | 5033 |
| 5 | 2 | 66.3 | 82.5 | 14 / 35 | 4424 |
| 6 | 1 | 66.0 | 81.0 | 16 / 35 | 4559 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.Aleph 0.34 | 60 | 62% |
| cx.mini.Nimrod 0.55 | 26 | 73% |
| djc.DynaBot 0.1.1 | 19 | 74% |
| rdt199.Warlord 0.73 | 18 | 72% |
| uji.YellohFellah 1.0 | 11 | 73% |
| br2.MobyDickBot 1.6 | 5 | 60% |
| stelo.MirrorNano 1.3 | 1 | 100% |
| KiraNL.Chupacabra 0.4 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 887. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rz.Aleph 0.34 | 49 | 43% | 84 |
| cx.mini.Nimrod 0.55 | 22 | 19% | 32 |
| rdt199.Warlord 0.73 | 14 | 12% | 35 |
| djc.DynaBot 0.1.1 | 8 | 7% | 23 |
| uji.YellohFellah 1.0 | 8 | 7% | 17 |
| br2.MobyDickBot 1.6 | 7 | 6% | 9 |
| stelo.MirrorNano 1.3 | 4 | 4% | 5 |
| KiraNL.Chupacabra 0.4 | 1 | 1% | 3 |
| jeremyreeder.Vincent 2011.12.09 | 1 | 1% | 1 |

## Melee bench: F12

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.7 | 86.9 | 126 / 210 | 2.18 | 18.3% | 24805 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.3% | 126 |
| bts.wiki.RipCurl 0.9b | 2.5 | 13.4% | 28 |
| nat.PallasHawk 1.0 | 2.8 | 13.1% | 32 |
| darkcanuck.Leon 1.01 | 3.7 | 12.4% | 13 |
| brainfade.melee.Genghis 0.36 | 5.0 | 10.1% | 8 |
| jrm.Test0 1.0 | 6.2 | 8.0% | 0 |
| jp.Perpy 16.0 | 7.5 | 6.9% | 0 |
| cs.sheldor.Talon 1.1 | 7.7 | 6.9% | 1 |
| stuff.Vlad 0.1 | 9.2 | 5.4% | 1 |
| jaybot.bots.Oddball 4.0 | 9.5 | 5.4% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 89.8 | 23 / 35 | 4395 |
| 2 | 1 | 67.9 | 86.7 | 20 / 35 | 4412 |
| 3 | 1 | 66.7 | 83.5 | 19 / 35 | 4214 |
| 4 | 1 | 69.2 | 90.5 | 24 / 35 | 4355 |
| 5 | 1 | 67.4 | 88.3 | 19 / 35 | 3877 |
| 6 | 1 | 65.6 | 82.5 | 21 / 35 | 3552 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| nat.PallasHawk 1.0 | 52 | 79% |
| bts.wiki.RipCurl 0.9b | 45 | 76% |
| darkcanuck.Leon 1.01 | 36 | 81% |
| brainfade.melee.Genghis 0.36 | 12 | 100% |
| jp.Perpy 16.0 | 3 | 100% |
| jaybot.bots.Oddball 4.0 | 3 | 100% |
| cs.sheldor.Talon 1.1 | 2 | 100% |
| jrm.Test0 1.0 | 2 | 100% |

Hadur died in 85 of 210 rounds, at a mean tick of 716. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bts.wiki.RipCurl 0.9b | 28 | 33% | 48 |
| nat.PallasHawk 1.0 | 25 | 29% | 61 |
| darkcanuck.Leon 1.01 | 14 | 16% | 61 |
| jrm.Test0 1.0 | 6 | 7% | 6 |
| brainfade.melee.Genghis 0.36 | 4 | 5% | 9 |
| cs.sheldor.Talon 1.1 | 4 | 5% | 6 |
| jp.Perpy 16.0 | 2 | 2% | 11 |
| jaybot.bots.Oddball 4.0 | 1 | 1% | 3 |
| stuff.Vlad 0.1 | 1 | 1% | 3 |

## Melee bench: F13

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 66.2 | 82.8 | 71 / 210 | 2.55 | 16.6% | 27299 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.6% | 71 |
| ags.Glacier 0.2.11 | 2.2 | 16.3% | 39 |
| mn.Combat 3.25.0 | 2.5 | 16.1% | 72 |
| shinh.Entangled 0.3 | 4.3 | 12.0% | 18 |
| gh.micro.Gruweltje 0.7 | 4.7 | 11.4% | 9 |
| apc.Colossus2 0.17 | 6.0 | 8.3% | 1 |
| stelo.Wang 1.0 | 7.0 | 6.8% | 0 |
| ayk.WallHugger 1.0 | 8.5 | 4.7% | 0 |
| maribo.FollowFire 1 | 8.5 | 4.6% | 0 |
| sample.Tracker 1.0 | 10.0 | 3.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 66.1 | 82.5 | 11 / 35 | 4476 |
| 2 | 1 | 67.0 | 83.8 | 14 / 35 | 4762 |
| 3 | 1 | 64.8 | 80.0 | 12 / 35 | 3997 |
| 4 | 1 | 67.1 | 84.4 | 13 / 35 | 4804 |
| 5 | 1 | 66.9 | 85.1 | 11 / 35 | 4856 |
| 6 | 2 | 65.3 | 80.6 | 10 / 35 | 4404 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mn.Combat 3.25.0 | 58 | 47% |
| ags.Glacier 0.2.11 | 42 | 62% |
| shinh.Entangled 0.3 | 17 | 71% |
| gh.micro.Gruweltje 0.7 | 7 | 29% |
| apc.Colossus2 0.17 | 3 | 100% |
| stelo.Wang 1.0 | 1 | 100% |

Hadur died in 140 of 210 rounds, at a mean tick of 821. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mn.Combat 3.25.0 | 49 | 35% | 76 |
| ags.Glacier 0.2.11 | 49 | 35% | 74 |
| shinh.Entangled 0.3 | 18 | 13% | 28 |
| gh.micro.Gruweltje 0.7 | 11 | 8% | 18 |
| stelo.Wang 1.0 | 6 | 4% | 8 |
| apc.Colossus2 0.17 | 5 | 4% | 5 |
| ayk.WallHugger 1.0 | 1 | 1% | 1 |
| maribo.FollowFire 1 | 1 | 1% | 0 |

## Melee bench: F14

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.9 | 165 / 210 | 1.55 | 20.5% | 32871 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 165 |
| simonton.micro.Sprout 1.1.3 | 2.0 | 15.0% | 15 |
| catcat20.shape.Theta 0.018 | 3.2 | 12.2% | 22 |
| sanyi.mikrobi.Roberto 1.0 | 5.0 | 9.5% | 3 |
| co.edu.usb.rc.LidisTron 1.0 | 5.7 | 9.1% | 0 |
| Lo_Ian.Gandalf_V4 4.0 | 5.8 | 8.9% | 0 |
| dmh.robocode.robot.RedDwarf 0.4 | 6.0 | 8.9% | 0 |
| sheldor.micro.PointInLineRRAL 1.0 | 7.3 | 7.8% | 6 |
| pa.Improved 1.0 | 9.0 | 6.0% | 0 |
| sample.TrackFire 1.0 | 10.0 | 2.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.0 | 93.7 | 28 / 35 | 5497 |
| 2 | 1 | 71.4 | 97.5 | 31 / 35 | 5132 |
| 3 | 1 | 70.1 | 90.8 | 24 / 35 | 5515 |
| 4 | 1 | 71.5 | 96.2 | 30 / 35 | 5631 |
| 5 | 1 | 70.4 | 93.3 | 23 / 35 | 5571 |
| 6 | 1 | 70.8 | 92.1 | 29 / 35 | 5525 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| simonton.micro.Sprout 1.1.3 | 93 | 94% |
| catcat20.shape.Theta 0.018 | 45 | 71% |
| co.edu.usb.rc.LidisTron 1.0 | 18 | 100% |
| sanyi.mikrobi.Roberto 1.0 | 11 | 100% |
| sheldor.micro.PointInLineRRAL 1.0 | 8 | 75% |
| dmh.robocode.robot.RedDwarf 0.4 | 8 | 100% |
| Lo_Ian.Gandalf_V4 4.0 | 3 | 100% |

Hadur died in 46 of 210 rounds, at a mean tick of 820. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.shape.Theta 0.018 | 20 | 43% | 51 |
| simonton.micro.Sprout 1.1.3 | 12 | 26% | 96 |
| sheldor.micro.PointInLineRRAL 1.0 | 7 | 15% | 17 |
| Lo_Ian.Gandalf_V4 4.0 | 2 | 4% | 10 |
| co.edu.usb.rc.LidisTron 1.0 | 2 | 4% | 5 |
| sanyi.mikrobi.Roberto 1.0 | 1 | 2% | 18 |
| dmh.robocode.robot.RedDwarf 0.4 | 1 | 2% | 6 |
| pa.Improved 1.0 | 0 | 0% | 4 |
1 death(s) with no robot to name.

## Melee bench: F15

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.5 | 89.2 | 138 / 210 | 1.97 | 20.3% | 36529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.3% | 138 |
| kawigi.micro.Shiz 1.1 | 2.3 | 13.4% | 15 |
| cb.nano.Insomnia 1.0 | 3.8 | 11.5% | 7 |
| mld.DustBunny 3.8 | 4.0 | 11.5% | 11 |
| emp.Yngwie 1.11 | 4.3 | 11.3% | 25 |
| kawigi.robot.Girl 1.2 | 5.5 | 9.7% | 12 |
| Grystrion.TrackerWO 1.0 | 7.3 | 6.6% | 0 |
| lambdaxy.TBot 0.1 | 7.7 | 6.5% | 0 |
| divineomega.TrialBot 0.003 | 9.0 | 5.0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.3 | 92.1 | 25 / 35 | 6179 |
| 2 | 1 | 70.0 | 86.7 | 21 / 35 | 6112 |
| 3 | 1 | 70.4 | 89.5 | 21 / 35 | 6052 |
| 4 | 1 | 70.2 | 89.2 | 23 / 35 | 5866 |
| 5 | 1 | 70.1 | 86.7 | 22 / 35 | 6081 |
| 6 | 1 | 71.1 | 91.1 | 26 / 35 | 6239 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cb.nano.Insomnia 1.0 | 45 | 91% |
| kawigi.micro.Shiz 1.1 | 38 | 97% |
| mld.DustBunny 3.8 | 23 | 96% |
| emp.Yngwie 1.11 | 23 | 65% |
| kawigi.robot.Girl 1.2 | 22 | 77% |
| divineomega.TrialBot 0.003 | 3 | 100% |
| Grystrion.TrackerWO 1.0 | 2 | 100% |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 1 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 932. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| emp.Yngwie 1.11 | 31 | 43% | 70 |
| kawigi.micro.Shiz 1.1 | 11 | 15% | 50 |
| kawigi.robot.Girl 1.2 | 11 | 15% | 26 |
| cb.nano.Insomnia 1.0 | 10 | 14% | 11 |
| mld.DustBunny 3.8 | 7 | 10% | 38 |
| divineomega.TrialBot 0.003 | 1 | 1% | 10 |
| lambdaxy.TBot 0.1 | 1 | 1% | 2 |
| Grystrion.TrackerWO 1.0 | 0 | 0% | 2 |
| com.cgarias.rc.AdvancedTrackerII 1.0 | 0 | 0% | 1 |

## Melee bench: F16

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 87.2 | 96 / 210 | 2.15 | 19.2% | 35045 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 96 |
| gh.Griezel 0.5.2 | 2.0 | 16.7% | 78 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 3.0 | 13.5% | 10 |
| techdude.forest.FlamingForest 1.1 | 4.2 | 10.1% | 20 |
| tvv.nano.Polaris 1.2 | 5.2 | 9.4% | 3 |
| bvh.fnr.Fenrir 0.36l | 6.0 | 8.8% | 0 |
| stelo.IntrinsicVolatility 1.4 | 6.7 | 7.5% | 2 |
| asd.Cthulhu 1.3 | 8.5 | 5.4% | 0 |
| repositorio.NanoStep 1.0 | 8.8 | 5.0% | 0 |
| divineomega.DivineBot 1.9.4.5 | 9.7 | 4.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.6 | 88.6 | 15 / 35 | 5696 |
| 2 | 1 | 70.2 | 89.5 | 17 / 35 | 6059 |
| 3 | 1 | 68.9 | 85.1 | 16 / 35 | 5749 |
| 4 | 1 | 68.0 | 84.1 | 15 / 35 | 5311 |
| 5 | 1 | 68.9 | 85.7 | 16 / 35 | 5875 |
| 6 | 1 | 70.9 | 90.5 | 17 / 35 | 6355 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| gh.Griezel 0.5.2 | 90 | 36% |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 22 | 95% |
| techdude.forest.FlamingForest 1.1 | 21 | 71% |
| bvh.fnr.Fenrir 0.36l | 11 | 100% |
| stelo.IntrinsicVolatility 1.4 | 5 | 100% |
| tvv.nano.Polaris 1.2 | 5 | 100% |
| divineomega.DivineBot 1.9.4.5 | 4 | 100% |
| asd.Cthulhu 1.3 | 2 | 100% |
| repositorio.NanoStep 1.0 | 1 | 100% |

Hadur died in 114 of 210 rounds, at a mean tick of 1388. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| gh.Griezel 0.5.2 | 65 | 57% | 100 |
| ags.surreptitious.MiniSurreptitious 0.0.1 | 13 | 11% | 31 |
| techdude.forest.FlamingForest 1.1 | 12 | 11% | 22 |
| bvh.fnr.Fenrir 0.36l | 9 | 8% | 18 |
| stelo.IntrinsicVolatility 1.4 | 6 | 5% | 13 |
| tvv.nano.Polaris 1.2 | 4 | 4% | 10 |
| divineomega.DivineBot 1.9.4.5 | 2 | 2% | 6 |
| asd.Cthulhu 1.3 | 2 | 2% | 4 |
| repositorio.NanoStep 1.0 | 1 | 1% | 5 |

## Melee bench: F17

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.8 | 89.8 | 128 / 210 | 1.91 | 19.6% | 32842 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.6% | 128 |
| et.Predator 1.8 | 2.5 | 12.9% | 26 |
| oog.melee.Mercutio 1.0 | 3.2 | 12.5% | 21 |
| cx.BlestPain 1.41 | 4.2 | 11.6% | 25 |
| nic.Nicator 2.4 | 4.7 | 10.9% | 5 |
| ahf.NanoAndrew .4 | 5.7 | 10.1% | 6 |
| maribo.melee.BMV 0.1 | 6.8 | 8.1% | 0 |
| tex.Longbot 0.4 | 8.3 | 6.1% | 1 |
| edu.otg.spr.TheTeacher 1.2 | 8.7 | 5.7% | 0 |
| goblin.Bender 2.4 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.4 | 85.4 | 16 / 35 | 5427 |
| 2 | 1 | 69.5 | 89.5 | 18 / 35 | 5544 |
| 3 | 1 | 70.8 | 94.3 | 24 / 35 | 5470 |
| 4 | 1 | 70.4 | 91.7 | 25 / 35 | 5580 |
| 5 | 1 | 70.9 | 91.4 | 23 / 35 | 5817 |
| 6 | 1 | 68.6 | 86.7 | 22 / 35 | 5004 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| et.Predator 1.8 | 49 | 78% |
| nic.Nicator 2.4 | 36 | 94% |
| cx.BlestPain 1.41 | 34 | 59% |
| oog.melee.Mercutio 1.0 | 34 | 65% |
| ahf.NanoAndrew .4 | 11 | 91% |
| maribo.melee.BMV 0.1 | 3 | 100% |
| tex.Longbot 0.4 | 1 | 100% |

Hadur died in 84 of 210 rounds, at a mean tick of 995. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cx.BlestPain 1.41 | 20 | 24% | 48 |
| et.Predator 1.8 | 19 | 23% | 45 |
| oog.melee.Mercutio 1.0 | 18 | 21% | 48 |
| nic.Nicator 2.4 | 7 | 8% | 37 |
| tex.Longbot 0.4 | 7 | 8% | 8 |
| ahf.NanoAndrew .4 | 6 | 7% | 15 |
| maribo.melee.BMV 0.1 | 4 | 5% | 7 |
| edu.otg.spr.TheTeacher 1.2 | 1 | 1% | 2 |
2 death(s) with no robot to name.

## Melee bench: F18

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.0 | 139 / 210 | 1.99 | 19.3% | 29016 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 139 |
| morbid.MorbidPriest 1.0 | 2.0 | 13.5% | 28 |
| agd.Mooserwirt2 2.7 | 3.3 | 11.3% | 12 |
| uji.DBH 1.1 | 4.5 | 10.3% | 14 |
| ratosh.Nobo 0.21 | 5.0 | 9.7% | 1 |
| spinnercat.Robovirus 2.718 | 5.5 | 9.4% | 3 |
| sigterm.Sigterm 1.0 | 7.0 | 8.3% | 9 |
| kawigi.mini.Fhqwhgads 1.1 | 7.7 | 7.4% | 1 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 9.3 | 5.5% | 1 |
| stelo.WangRobot 1.0 | 9.7 | 5.3% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.4 | 93.3 | 25 / 35 | 4579 |
| 2 | 1 | 68.1 | 86.0 | 23 / 35 | 4828 |
| 3 | 1 | 70.1 | 92.1 | 24 / 35 | 5201 |
| 4 | 1 | 70.0 | 93.0 | 27 / 35 | 4882 |
| 5 | 1 | 68.4 | 88.3 | 19 / 35 | 5020 |
| 6 | 1 | 66.6 | 81.3 | 21 / 35 | 4506 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| morbid.MorbidPriest 1.0 | 49 | 78% |
| agd.Mooserwirt2 2.7 | 26 | 85% |
| sigterm.Sigterm 1.0 | 22 | 91% |
| spinnercat.Robovirus 2.718 | 20 | 90% |
| uji.DBH 1.1 | 19 | 58% |
| ratosh.Nobo 0.21 | 13 | 100% |
| kawigi.mini.Fhqwhgads 1.1 | 8 | 100% |
| stelo.WangRobot 1.0 | 6 | 83% |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 4 | 100% |

Hadur died in 72 of 210 rounds, at a mean tick of 731. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| morbid.MorbidPriest 1.0 | 25 | 35% | 58 |
| agd.Mooserwirt2 2.7 | 9 | 13% | 42 |
| uji.DBH 1.1 | 8 | 11% | 20 |
| kawigi.mini.Fhqwhgads 1.1 | 7 | 10% | 18 |
| spinnercat.Robovirus 2.718 | 7 | 10% | 15 |
| sigterm.Sigterm 1.0 | 6 | 8% | 27 |
| ratosh.Nobo 0.21 | 6 | 8% | 19 |
| stelo.WangRobot 1.0 | 3 | 4% | 6 |
| WarfaJibril.Jibril_Warfa_Andromeda 1.11 | 1 | 1% | 5 |

## Melee bench: F19

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 96.0 | 186 / 210 | 1.36 | 21.5% | 34037 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.5% | 186 |
| davidalves.net.DuelistMiniMelee 1.2 | 2.3 | 14.2% | 13 |
| mld.Infinity 2.2 | 2.8 | 13.0% | 6 |
| krillr.mini.JointStrike 2.0.0 | 4.0 | 11.4% | 3 |
| erdnis.Rover 0.3 | 5.0 | 10.5% | 2 |
| patson.PatsonTestBot 1.0 | 6.0 | 8.8% | 0 |
| mbh.Mbh 0.1 | 7.0 | 7.6% | 1 |
| pac.ABC 2.1 | 8.0 | 6.3% | 0 |
| pbg.R2D2 1.0 | 8.8 | 5.4% | 0 |
| pedersen.Moron 2.0 | 10.0 | 1.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.1 | 95.2 | 30 / 35 | 5516 |
| 2 | 1 | 71.9 | 95.6 | 30 / 35 | 5383 |
| 3 | 1 | 73.5 | 100.0 | 35 / 35 | 5870 |
| 4 | 1 | 73.0 | 97.1 | 31 / 35 | 5807 |
| 5 | 1 | 71.7 | 92.7 | 28 / 35 | 5973 |
| 6 | 1 | 72.0 | 95.6 | 32 / 35 | 5488 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 96 | 95% |
| mld.Infinity 2.2 | 58 | 97% |
| krillr.mini.JointStrike 2.0.0 | 15 | 93% |
| patson.PatsonTestBot 1.0 | 11 | 100% |
| pac.ABC 2.1 | 6 | 100% |
| erdnis.Rover 0.3 | 5 | 100% |
| pbg.R2D2 1.0 | 2 | 100% |
| mbh.Mbh 0.1 | 1 | 100% |

Hadur died in 25 of 210 rounds, at a mean tick of 796. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| davidalves.net.DuelistMiniMelee 1.2 | 9 | 36% | 89 |
| krillr.mini.JointStrike 2.0.0 | 6 | 24% | 27 |
| mld.Infinity 2.2 | 3 | 12% | 45 |
| patson.PatsonTestBot 1.0 | 2 | 8% | 17 |
| mbh.Mbh 0.1 | 2 | 8% | 4 |
| erdnis.Rover 0.3 | 1 | 4% | 15 |
| pbg.R2D2 1.0 | 1 | 4% | 6 |
| pac.ABC 2.1 | 0 | 0% | 5 |
1 death(s) with no robot to name.

## Melee bench: F20

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.9 | 93.3 | 141 / 210 | 1.60 | 20.7% | 34732 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.7% | 141 |
| trm.Wrekt 1.1.6.f | 2.0 | 15.3% | 40 |
| nz.jdc.nano.GridFu 1.0 | 3.3 | 11.3% | 5 |
| fwb.Nine 1.0.1 | 3.8 | 10.8% | 11 |
| catcat20.Rabbit 0.001 | 4.8 | 9.5% | 9 |
| djdjdj.NanoSkunk10 1.0 | 7.0 | 7.5% | 0 |
| m3thos.mini.Eva01 0.5.5 | 7.0 | 7.6% | 1 |
| bayen.nut.Squirrel 1.615 | 7.0 | 7.5% | 3 |
| ntc.ControlledChaos 1.1.4 | 9.0 | 5.5% | 0 |
| sample.MyFirstJuniorRobot 1.0 | 10.0 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.8 | 94.3 | 26 / 35 | 6133 |
| 2 | 1 | 70.9 | 93.7 | 25 / 35 | 5704 |
| 3 | 1 | 71.7 | 94.3 | 26 / 35 | 5949 |
| 4 | 1 | 71.2 | 95.6 | 23 / 35 | 5681 |
| 5 | 1 | 70.1 | 91.7 | 23 / 35 | 5327 |
| 6 | 1 | 70.0 | 90.5 | 18 / 35 | 5938 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| trm.Wrekt 1.1.6.f | 78 | 67% |
| fwb.Nine 1.0.1 | 42 | 88% |
| catcat20.Rabbit 0.001 | 24 | 79% |
| nz.jdc.nano.GridFu 1.0 | 17 | 82% |
| bayen.nut.Squirrel 1.615 | 11 | 82% |
| djdjdj.NanoSkunk10 1.0 | 9 | 100% |
| m3thos.mini.Eva01 0.5.5 | 1 | 100% |

Hadur died in 69 of 210 rounds, at a mean tick of 1081. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| trm.Wrekt 1.1.6.f | 39 | 57% | 78 |
| fwb.Nine 1.0.1 | 11 | 16% | 38 |
| catcat20.Rabbit 0.001 | 8 | 12% | 27 |
| nz.jdc.nano.GridFu 1.0 | 6 | 9% | 32 |
| bayen.nut.Squirrel 1.615 | 4 | 6% | 15 |
| m3thos.mini.Eva01 0.5.5 | 1 | 1% | 5 |
| djdjdj.NanoSkunk10 1.0 | 0 | 0% | 8 |
| sample.MyFirstJuniorRobot 1.0 | 0 | 0% | 4 |

## Melee bench: F21

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 71.7 | 94.4 | 150 / 210 | 1.50 | 21.1% | 36200 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 21.1% | 150 |
| eem.EvBot v4.6.16 | 2.2 | 15.4% | 45 |
| dummy.mini.Scimitar 1.01 | 2.8 | 14.3% | 9 |
| cf.RiO.RiOx 4.2.1 | 4.0 | 11.1% | 3 |
| eld.Hmm 1.0 | 5.5 | 7.9% | 2 |
| oa.weak.BotherBot 0.1 | 5.7 | 7.6% | 2 |
| el.JumpShoot 0.2 | 7.2 | 6.6% | 0 |
| PSW.Relentless 0.1 | 8.2 | 6.0% | 0 |
| fire219.CatBot 1.0 | 8.5 | 6.1% | 0 |
| arthord.MannyPacquiao Beta | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.4 | 92.1 | 24 / 35 | 6163 |
| 2 | 1 | 72.4 | 97.1 | 27 / 35 | 6075 |
| 3 | 1 | 71.2 | 94.3 | 22 / 35 | 5835 |
| 4 | 1 | 70.9 | 92.1 | 22 / 35 | 5954 |
| 5 | 1 | 73.0 | 97.1 | 31 / 35 | 6321 |
| 6 | 1 | 71.4 | 94.0 | 24 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBot v4.6.16 | 103 | 69% |
| dummy.mini.Scimitar 1.01 | 51 | 90% |
| cf.RiO.RiOx 4.2.1 | 20 | 100% |
| eld.Hmm 1.0 | 6 | 100% |
| oa.weak.BotherBot 0.1 | 5 | 80% |
| el.JumpShoot 0.2 | 2 | 100% |
| arthord.MannyPacquiao Beta | 1 | 100% |

Hadur died in 61 of 210 rounds, at a mean tick of 1279. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBot v4.6.16 | 39 | 64% | 91 |
| dummy.mini.Scimitar 1.01 | 13 | 21% | 62 |
| cf.RiO.RiOx 4.2.1 | 3 | 5% | 19 |
| oa.weak.BotherBot 0.1 | 3 | 5% | 13 |
| eld.Hmm 1.0 | 1 | 2% | 17 |
| PSW.Relentless 0.1 | 1 | 2% | 1 |
| arthord.MannyPacquiao Beta | 0 | 0% | 2 |
| el.JumpShoot 0.2 | 0 | 0% | 2 |
| fire219.CatBot 1.0 | 0 | 0% | 1 |
1 death(s) with no robot to name.

## Melee bench: F22

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 3). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 87.5 | 98 / 210 | 2.13 | 18.5% | 31415 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 18.5% | 98 |
| pe.SandboxDT 2.71m | 2.0 | 16.6% | 60 |
| kvk.HebusLeTroll 0.35 | 3.0 | 14.1% | 27 |
| jlm.javaDisturbance 0.59 | 4.2 | 12.6% | 19 |
| bigpete.Stewie 1.0 | 4.8 | 10.6% | 4 |
| tad.Dalek98 0.98 | 6.7 | 6.8% | 0 |
| yk.JahRoslav 1.1 | 6.7 | 6.9% | 2 |
| gg.Squaraus 0.6 | 7.7 | 6.3% | 0 |
| pbg.NinjaX 1.2 | 9.0 | 4.8% | 0 |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 10.0 | 2.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.4 | 90.5 | 18 / 35 | 5624 |
| 2 | 1 | 69.1 | 89.2 | 16 / 35 | 5216 |
| 3 | 1 | 69.1 | 87.3 | 19 / 35 | 5280 |
| 4 | 1 | 68.2 | 86.7 | 14 / 35 | 5077 |
| 5 | 1 | 68.4 | 86.0 | 16 / 35 | 5288 |
| 6 | 1 | 67.5 | 85.1 | 15 / 35 | 4930 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kvk.HebusLeTroll 0.35 | 52 | 79% |
| pe.SandboxDT 2.71m | 47 | 28% |
| jlm.javaDisturbance 0.59 | 41 | 78% |
| bigpete.Stewie 1.0 | 6 | 100% |
| yk.JahRoslav 1.1 | 3 | 67% |
| pbg.NinjaX 1.2 | 2 | 100% |
| inonit.robocode.javascript.MyFirstRobot 1.1 | 2 | 100% |

Hadur died in 112 of 210 rounds, at a mean tick of 929. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxDT 2.71m | 54 | 48% | 81 |
| kvk.HebusLeTroll 0.35 | 27 | 24% | 53 |
| jlm.javaDisturbance 0.59 | 20 | 18% | 52 |
| bigpete.Stewie 1.0 | 6 | 5% | 12 |
| tad.Dalek98 0.98 | 3 | 3% | 4 |
| yk.JahRoslav 1.1 | 2 | 2% | 3 |
| pbg.NinjaX 1.2 | 0 | 0% | 3 |

## Melee bench: F23

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 88.6 | 102 / 210 | 2.03 | 19.1% | 32598 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 19.1% | 102 |
| pe.SandboxLump 1.52 | 1.8 | 18.2% | 75 |
| cre.Karolos 0.32 | 3.0 | 13.3% | 22 |
| stelo.AreaTargetingBot 1.1 | 4.2 | 10.5% | 7 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 5.5 | 9.2% | 2 |
| stelo.RamTrackSurfer 1.2 | 5.5 | 8.8% | 2 |
| cw.megas.Blade 0.8 | 7.3 | 7.8% | 0 |
| sample.Walls 1.0 | 7.5 | 7.8% | 0 |
| cli.WasteOfAmmo 1.0 | 9.0 | 3.7% | 0 |
| rrh.Iwillfindyou 2.0 | 10.0 | 1.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 69.8 | 88.9 | 16 / 35 | 5383 |
| 2 | 1 | 69.3 | 86.3 | 15 / 35 | 5373 |
| 3 | 1 | 69.4 | 87.6 | 16 / 35 | 5291 |
| 4 | 1 | 70.3 | 87.6 | 19 / 35 | 5623 |
| 5 | 1 | 70.7 | 91.4 | 17 / 35 | 5786 |
| 6 | 1 | 70.1 | 89.5 | 19 / 35 | 5142 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| pe.SandboxLump 1.52 | 102 | 52% |
| cre.Karolos 0.32 | 25 | 72% |
| stelo.AreaTargetingBot 1.1 | 24 | 79% |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 6 | 83% |
| sample.Walls 1.0 | 4 | 100% |
| cw.megas.Blade 0.8 | 2 | 100% |
| rrh.Iwillfindyou 2.0 | 1 | 100% |

Hadur died in 108 of 210 rounds, at a mean tick of 781. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| pe.SandboxLump 1.52 | 67 | 62% | 116 |
| cre.Karolos 0.32 | 19 | 18% | 40 |
| stelo.AreaTargetingBot 1.1 | 12 | 11% | 21 |
| darwinsnightmare.DNGEN474UI85390C20S0R528 1.0 | 4 | 4% | 9 |
| sample.Walls 1.0 | 2 | 2% | 9 |
| stelo.RamTrackSurfer 1.2 | 2 | 2% | 7 |
| cw.megas.Blade 0.8 | 2 | 2% | 7 |
| rrh.Iwillfindyou 2.0 | 0 | 0% | 1 |

## Melee bench: F24

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.8 | 79.4 | 81 / 210 | 2.85 | 16.2% | 23975 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 16.2% | 81 |
| rz.GlowBlowMelee 1.4 | 2.7 | 13.8% | 31 |
| florent.XSeries.X2 0.12 | 3.2 | 13.6% | 37 |
| davidalves.Phoenix 0.54 | 3.3 | 12.9% | 37 |
| pedersen.Ugluk 1.1.1 | 4.8 | 11.4% | 17 |
| oog.melee.Corsair 1.0 | 6.2 | 9.3% | 5 |
| stelo.SoJNanoMelee 1.1 | 7.0 | 7.7% | 2 |
| lunchie.Lunchbox 0.93 | 8.0 | 6.1% | 0 |
| as.FrankTheTank 1.3 | 9.0 | 4.8% | 1 |
| evd.X1 0.01 | 9.8 | 4.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 65.0 | 79.0 | 16 / 35 | 3909 |
| 2 | 1 | 67.4 | 85.4 | 17 / 35 | 4497 |
| 3 | 1 | 62.7 | 73.0 | 11 / 35 | 3844 |
| 4 | 1 | 64.5 | 77.5 | 14 / 35 | 3998 |
| 5 | 1 | 64.5 | 79.4 | 11 / 35 | 4181 |
| 6 | 1 | 64.5 | 82.2 | 12 / 35 | 3546 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rz.GlowBlowMelee 1.4 | 33 | 70% |
| florent.XSeries.X2 0.12 | 31 | 65% |
| davidalves.Phoenix 0.54 | 26 | 50% |
| pedersen.Ugluk 1.1.1 | 15 | 67% |
| stelo.SoJNanoMelee 1.1 | 11 | 100% |
| lunchie.Lunchbox 0.93 | 3 | 100% |
| oog.melee.Corsair 1.0 | 2 | 50% |

Hadur died in 130 of 210 rounds, at a mean tick of 700. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| florent.XSeries.X2 0.12 | 36 | 28% | 53 |
| davidalves.Phoenix 0.54 | 30 | 23% | 42 |
| rz.GlowBlowMelee 1.4 | 27 | 21% | 49 |
| pedersen.Ugluk 1.1.1 | 17 | 13% | 28 |
| oog.melee.Corsair 1.0 | 7 | 5% | 16 |
| stelo.SoJNanoMelee 1.1 | 5 | 4% | 10 |
| lunchie.Lunchbox 0.93 | 3 | 2% | 6 |
| evd.X1 0.01 | 3 | 2% | 3 |
| as.FrankTheTank 1.3 | 1 | 1% | 3 |
1 death(s) with no robot to name.

## Melee bench: F25

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.6 | 88.3 | 136 / 210 | 2.05 | 19.0% | 26482 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 136 |
| voidious.mini.BrokenSword 2.0.3 | 2.2 | 14.2% | 24 |
| voidious.micro.BlitzBat 1.05 | 3.0 | 12.9% | 17 |
| jdw.Hurricane 1.4 | 3.8 | 11.0% | 17 |
| ds.Oo 2.2 | 5.5 | 9.1% | 9 |
| gre.svman4.Morfeas 1.4.1 | 5.8 | 8.7% | 4 |
| awesomeness.Elite 1.0 | 7.8 | 7.1% | 1 |
| gjr.Cephalosporin 0.1 | 7.8 | 6.8% | 2 |
| adt.Ar2 1.1 | 8.0 | 6.9% | 1 |
| amk.ChumbaMini 0.2 | 10.0 | 4.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 95.2 | 28 / 35 | 4802 |
| 2 | 1 | 65.9 | 80.0 | 20 / 35 | 3977 |
| 3 | 1 | 67.8 | 84.8 | 22 / 35 | 4412 |
| 4 | 1 | 68.6 | 89.5 | 21 / 35 | 4438 |
| 5 | 1 | 69.3 | 90.8 | 23 / 35 | 4466 |
| 6 | 1 | 69.1 | 89.5 | 22 / 35 | 4387 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 62 | 87% |
| voidious.micro.BlitzBat 1.05 | 38 | 95% |
| jdw.Hurricane 1.4 | 30 | 73% |
| gre.svman4.Morfeas 1.4.1 | 7 | 86% |
| ds.Oo 2.2 | 6 | 100% |
| gjr.Cephalosporin 0.1 | 5 | 100% |
| awesomeness.Elite 1.0 | 4 | 100% |
| adt.Ar2 1.1 | 3 | 100% |

Hadur died in 74 of 210 rounds, at a mean tick of 632. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| voidious.mini.BrokenSword 2.0.3 | 21 | 28% | 60 |
| jdw.Hurricane 1.4 | 16 | 22% | 41 |
| voidious.micro.BlitzBat 1.05 | 12 | 16% | 49 |
| ds.Oo 2.2 | 8 | 11% | 17 |
| gre.svman4.Morfeas 1.4.1 | 6 | 8% | 14 |
| awesomeness.Elite 1.0 | 5 | 7% | 11 |
| gjr.Cephalosporin 0.1 | 3 | 4% | 9 |
| adt.Ar2 1.1 | 2 | 3% | 5 |
| amk.ChumbaMini 0.2 | 1 | 1% | 2 |

## Melee bench: F26

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.5 | 131 / 210 | 1.85 | 19.5% | 33198 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 131 |
| ak.Fermat 2.0 | 2.0 | 15.2% | 42 |
| shu.nitro.LENIN .T34 | 3.3 | 12.0% | 21 |
| lrem.Spectre 0.4.4 | 3.7 | 12.0% | 10 |
| js.PinBall 1.6 | 5.3 | 10.0% | 2 |
| gh.mini.GrubbmOne 1.0 | 6.2 | 9.0% | 0 |
| jaybot.adv.bots.JayBot 2.0 | 6.5 | 9.2% | 3 |
| fullsail.LaxativeTeaTwo 1.0 | 8.0 | 6.5% | 1 |
| sample.SpinBot 1.0 | 9.0 | 4.8% | 0 |
| logiblocs.SittingDroid 1.0 | 10.0 | 1.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.5 | 88.3 | 22 / 35 | 5516 |
| 2 | 1 | 70.0 | 88.9 | 23 / 35 | 5582 |
| 3 | 1 | 70.2 | 92.7 | 21 / 35 | 5692 |
| 4 | 1 | 69.6 | 88.9 | 20 / 35 | 5691 |
| 5 | 1 | 70.0 | 92.4 | 25 / 35 | 5108 |
| 6 | 1 | 70.0 | 92.1 | 20 / 35 | 5609 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ak.Fermat 2.0 | 71 | 66% |
| shu.nitro.LENIN .T34 | 43 | 81% |
| lrem.Spectre 0.4.4 | 36 | 83% |
| jaybot.adv.bots.JayBot 2.0 | 7 | 100% |
| js.PinBall 1.6 | 7 | 100% |
| gh.mini.GrubbmOne 1.0 | 3 | 100% |
| sample.SpinBot 1.0 | 2 | 100% |
| fullsail.LaxativeTeaTwo 1.0 | 1 | 0% |

Hadur died in 80 of 210 rounds, at a mean tick of 925. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ak.Fermat 2.0 | 35 | 44% | 76 |
| shu.nitro.LENIN .T34 | 21 | 26% | 65 |
| lrem.Spectre 0.4.4 | 10 | 13% | 34 |
| js.PinBall 1.6 | 4 | 5% | 11 |
| gh.mini.GrubbmOne 1.0 | 4 | 5% | 11 |
| jaybot.adv.bots.JayBot 2.0 | 4 | 5% | 11 |
| fullsail.LaxativeTeaTwo 1.0 | 2 | 3% | 2 |

## Melee bench: F27

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 90.7 | 162 / 210 | 1.83 | 20.1% | 30600 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.1% | 162 |
| mk.Alpha 0.2.1 | 2.3 | 13.4% | 25 |
| wee.Gem 1.8.4 | 4.0 | 10.5% | 10 |
| EH.Eagle 1.0.6 | 4.3 | 10.1% | 0 |
| sheldor.melee.nano.TestMelee 0.1 | 4.7 | 10.3% | 11 |
| throxbot.ThroxBot 0.1 | 6.3 | 8.3% | 0 |
| techdude.kombat.FlamingKombat 1.5 | 6.3 | 8.4% | 0 |
| joe.ADinosaur 1.0 | 7.8 | 7.4% | 1 |
| caimano.Furia_Ceca 0.22 | 8.7 | 6.5% | 1 |
| cs.Grudge 1.0 | 9.5 | 5.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 94.6 | 30 / 35 | 4239 |
| 2 | 1 | 69.7 | 91.1 | 29 / 35 | 4827 |
| 3 | 1 | 68.2 | 77.5 | 20 / 35 | 5877 |
| 4 | 1 | 71.6 | 93.7 | 30 / 35 | 5836 |
| 5 | 1 | 69.7 | 94.6 | 26 / 35 | 4667 |
| 6 | 1 | 70.5 | 93.0 | 27 / 35 | 5154 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| mk.Alpha 0.2.1 | 90 | 89% |
| wee.Gem 1.8.4 | 27 | 100% |
| EH.Eagle 1.0.6 | 19 | 100% |
| sheldor.melee.nano.TestMelee 0.1 | 18 | 89% |
| throxbot.ThroxBot 0.1 | 7 | 100% |
| techdude.kombat.FlamingKombat 1.5 | 6 | 100% |
| caimano.Furia_Ceca 0.22 | 5 | 100% |
| joe.ADinosaur 1.0 | 2 | 100% |

Hadur died in 48 of 210 rounds, at a mean tick of 625. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| mk.Alpha 0.2.1 | 19 | 40% | 87 |
| sheldor.melee.nano.TestMelee 0.1 | 7 | 15% | 20 |
| throxbot.ThroxBot 0.1 | 6 | 13% | 15 |
| joe.ADinosaur 1.0 | 6 | 13% | 10 |
| wee.Gem 1.8.4 | 4 | 8% | 36 |
| EH.Eagle 1.0.6 | 2 | 4% | 18 |
| caimano.Furia_Ceca 0.22 | 2 | 4% | 11 |
| techdude.kombat.FlamingKombat 1.5 | 1 | 2% | 7 |
| cs.Grudge 1.0 | 1 | 2% | 4 |

## Melee bench: F28

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.4 | 92.3 | 148 / 210 | 1.70 | 19.5% | 26502 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 148 |
| kid.test.NightFox .2 | 2.0 | 14.8% | 31 |
| uji.Antique 1.0 | 3.2 | 11.6% | 14 |
| qohnil.blot.BlotBot 3.61 | 4.2 | 10.7% | 10 |
| pfvicm.Sobieski 7.2.3b | 4.8 | 9.8% | 1 |
| amk.ChumbaWumba 0.3 | 6.0 | 8.5% | 1 |
| ahr.ice.Ice 1.0.2 | 6.8 | 8.1% | 1 |
| matt.advanced.Katana 1.0 | 8.3 | 6.1% | 2 |
| stelo.PianistNano 1.2 | 9.0 | 5.8% | 2 |
| stelo.Lifestealer 1.0 | 9.7 | 5.2% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.8 | 89.8 | 25 / 35 | 4141 |
| 2 | 1 | 70.2 | 94.9 | 28 / 35 | 4394 |
| 3 | 1 | 69.4 | 93.3 | 25 / 35 | 4278 |
| 4 | 1 | 68.8 | 90.8 | 24 / 35 | 4588 |
| 5 | 1 | 70.2 | 94.3 | 24 / 35 | 4490 |
| 6 | 1 | 68.9 | 90.5 | 22 / 35 | 4611 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kid.test.NightFox .2 | 87 | 78% |
| uji.Antique 1.0 | 42 | 90% |
| qohnil.blot.BlotBot 3.61 | 26 | 77% |
| amk.ChumbaWumba 0.3 | 8 | 100% |
| ahr.ice.Ice 1.0.2 | 6 | 100% |
| pfvicm.Sobieski 7.2.3b | 5 | 100% |
| stelo.PianistNano 1.2 | 3 | 67% |
| matt.advanced.Katana 1.0 | 1 | 100% |

Hadur died in 64 of 210 rounds, at a mean tick of 707. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kid.test.NightFox .2 | 29 | 45% | 86 |
| qohnil.blot.BlotBot 3.61 | 8 | 13% | 27 |
| pfvicm.Sobieski 7.2.3b | 8 | 13% | 18 |
| uji.Antique 1.0 | 7 | 11% | 48 |
| amk.ChumbaWumba 0.3 | 7 | 11% | 13 |
| ahr.ice.Ice 1.0.2 | 3 | 5% | 8 |
| matt.advanced.Katana 1.0 | 1 | 2% | 5 |
| stelo.PianistNano 1.2 | 1 | 2% | 4 |
| stelo.Lifestealer 1.0 | 0 | 0% | 1 |

## Melee bench: F29

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 5 other Robocode JVMs running (hadur.bench.MeleeRunner x5), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.2 | 87.1 | 110 / 210 | 2.16 | 19.1% | 29869 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.1% | 110 |
| zyx.mega.YersiniaPestis 3.1 | 2.5 | 15.0% | 54 |
| deewiant.Anomaly 0.2 | 2.5 | 14.3% | 33 |
| myl.micro.Troodon 1.10 | 4.0 | 11.4% | 6 |
| jok.PheonixM 0.1.2 | 5.0 | 10.6% | 8 |
| ph.melee.ArcherME 0.3 | 6.2 | 8.1% | 0 |
| DBall.Anarchy 0.1 | 7.2 | 6.8% | 0 |
| fullsail.TimbotNoPrediction 1.0 | 7.8 | 6.1% | 0 |
| ap.Frederick 1.1 | 9.0 | 4.7% | 0 |
| jangs.ns51 1.0 | 9.8 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.2 | 85.7 | 17 / 35 | 4536 |
| 2 | 1 | 70.8 | 90.5 | 23 / 35 | 5281 |
| 3 | 1 | 68.4 | 84.4 | 15 / 35 | 4820 |
| 4 | 1 | 70.0 | 90.8 | 19 / 35 | 5069 |
| 5 | 1 | 68.8 | 86.3 | 18 / 35 | 5002 |
| 6 | 1 | 69.2 | 84.8 | 18 / 35 | 5161 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| deewiant.Anomaly 0.2 | 65 | 77% |
| zyx.mega.YersiniaPestis 3.1 | 46 | 46% |
| myl.micro.Troodon 1.10 | 17 | 94% |
| jok.PheonixM 0.1.2 | 15 | 87% |
| DBall.Anarchy 0.1 | 5 | 100% |
| ap.Frederick 1.1 | 2 | 100% |
| fullsail.TimbotNoPrediction 1.0 | 1 | 100% |
| jangs.ns51 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 921. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| zyx.mega.YersiniaPestis 3.1 | 38 | 38% | 58 |
| deewiant.Anomaly 0.2 | 31 | 31% | 81 |
| jok.PheonixM 0.1.2 | 13 | 13% | 24 |
| myl.micro.Troodon 1.10 | 10 | 10% | 21 |
| fullsail.TimbotNoPrediction 1.0 | 5 | 5% | 5 |
| ph.melee.ArcherME 0.3 | 3 | 3% | 7 |
| jangs.ns51 1.0 | 1 | 1% | 2 |
| DBall.Anarchy 0.1 | 0 | 0% | 11 |

## Melee bench: F30

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 64.6 | 79.2 | 56 / 210 | 2.87 | 16.0% | 25636 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.3 | 16.0% | 56 |
| catcat20.Matcha 0.006 | 2.3 | 14.4% | 56 |
| darkcanuck.B26354 1.06 | 3.0 | 13.4% | 49 |
| stelo.PastFuture 2.3.2 | 3.7 | 12.3% | 22 |
| oog.melee.Capulet 1.2 | 4.7 | 11.7% | 22 |
| intruder.PrairieWolf 2.61 | 6.7 | 8.1% | 1 |
| ntc.Opposite 1.5 | 7.3 | 7.7% | 0 |
| tripphippy.Alice 1.1 | 7.5 | 6.8% | 1 |
| fowl3628800.LightningBolt 2.6.0 | 8.5 | 6.7% | 3 |
| GarmBox.Anger 1.0 | 10.0 | 2.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 63.5 | 75.2 | 7 / 35 | 4345 |
| 2 | 1 | 66.1 | 81.3 | 13 / 35 | 4452 |
| 3 | 1 | 63.8 | 79.7 | 8 / 35 | 3986 |
| 4 | 1 | 65.5 | 82.5 | 11 / 35 | 4328 |
| 5 | 2 | 64.8 | 81.0 | 8 / 35 | 4226 |
| 6 | 2 | 63.9 | 75.6 | 9 / 35 | 4299 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| catcat20.Matcha 0.006 | 41 | 37% |
| darkcanuck.B26354 1.06 | 23 | 30% |
| oog.melee.Capulet 1.2 | 21 | 62% |
| stelo.PastFuture 2.3.2 | 18 | 83% |
| intruder.PrairieWolf 2.61 | 5 | 80% |
| tripphippy.Alice 1.1 | 2 | 100% |
| fowl3628800.LightningBolt 2.6.0 | 1 | 0% |

Hadur died in 154 of 210 rounds, at a mean tick of 864. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| catcat20.Matcha 0.006 | 45 | 29% | 61 |
| darkcanuck.B26354 1.06 | 37 | 24% | 42 |
| stelo.PastFuture 2.3.2 | 32 | 21% | 47 |
| oog.melee.Capulet 1.2 | 21 | 14% | 32 |
| fowl3628800.LightningBolt 2.6.0 | 7 | 5% | 8 |
| ntc.Opposite 1.5 | 6 | 4% | 6 |
| tripphippy.Alice 1.1 | 4 | 3% | 7 |
| intruder.PrairieWolf 2.61 | 2 | 1% | 7 |

## Melee bench: F31

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.5 | 82.6 | 74 / 210 | 2.57 | 16.5% | 22529 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| abc.Shadow 3.84i | 1.3 | 17.3% | 78 |
| kc.mini.Mirage 0.2 | 1.7 | 16.5% | 74 |
| gh.mini.Griezel 0.2 | 3.0 | 12.8% | 40 |
| spinnercat.micro.Tyger 0.1 | 4.2 | 11.4% | 6 |
| d414.nano.Quantum 1.0.0 | 5.0 | 10.4% | 9 |
| gh.nano.Grofvuil 0.2 | 5.8 | 9.2% | 3 |
| fm.mammillarias 1.3 | 7.3 | 6.7% | 0 |
| timmit.nano.TimDog 0.33 | 7.7 | 6.6% | 0 |
| Gecko.ultimateGeckoBot 1.0 | 9.0 | 5.1% | 1 |
| tlp.ThreeLeggedPig 1 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 83.2 | 12 / 35 | 3598 |
| 2 | 2 | 65.4 | 83.2 | 10 / 35 | 3682 |
| 3 | 2 | 65.1 | 80.0 | 11 / 35 | 3992 |
| 4 | 1 | 66.2 | 85.7 | 14 / 35 | 3711 |
| 5 | 1 | 64.7 | 81.9 | 12 / 35 | 3657 |
| 6 | 2 | 65.9 | 81.6 | 15 / 35 | 3889 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| abc.Shadow 3.84i | 65 | 42% |
| gh.mini.Griezel 0.2 | 36 | 36% |
| spinnercat.micro.Tyger 0.1 | 22 | 86% |
| d414.nano.Quantum 1.0.0 | 10 | 90% |
| timmit.nano.TimDog 0.33 | 3 | 100% |
| gh.nano.Grofvuil 0.2 | 2 | 100% |
| Gecko.ultimateGeckoBot 1.0 | 1 | 100% |

Hadur died in 136 of 210 rounds, at a mean tick of 922. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| abc.Shadow 3.84i | 54 | 40% | 82 |
| gh.mini.Griezel 0.2 | 44 | 32% | 58 |
| spinnercat.micro.Tyger 0.1 | 13 | 10% | 28 |
| d414.nano.Quantum 1.0.0 | 12 | 9% | 21 |
| Gecko.ultimateGeckoBot 1.0 | 6 | 4% | 6 |
| fm.mammillarias 1.3 | 4 | 3% | 5 |
| gh.nano.Grofvuil 0.2 | 3 | 2% | 7 |
| timmit.nano.TimDog 0.33 | 0 | 0% | 3 |

## Melee bench: F32

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 91.3 | 130 / 210 | 1.78 | 19.3% | 30177 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.3% | 130 |
| kawigi.sbf.FloodHT 0.9.2 | 2.0 | 14.2% | 53 |
| apc.botM 3.0 | 3.8 | 11.5% | 13 |
| lxx.ConceptA 0.8 | 4.0 | 10.6% | 4 |
| vjik.UnViolation 1.1 | 4.7 | 9.3% | 4 |
| bayen.UbaMicro 1.4 | 5.7 | 8.7% | 2 |
| panzer.Panzer 0.2 | 7.0 | 7.8% | 0 |
| yk.JahMicro 1.0 | 8.0 | 6.8% | 1 |
| conscience.Electron 1.3g | 9.0 | 6.4% | 0 |
| donjezza.Jezza 1.0 | 9.8 | 5.4% | 3 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.2 | 93.0 | 23 / 35 | 4899 |
| 2 | 1 | 67.4 | 88.3 | 20 / 35 | 4621 |
| 3 | 1 | 67.9 | 86.7 | 21 / 35 | 4788 |
| 4 | 1 | 69.7 | 94.6 | 23 / 35 | 5024 |
| 5 | 1 | 69.9 | 92.4 | 22 / 35 | 5645 |
| 6 | 1 | 69.3 | 93.0 | 21 / 35 | 5200 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 81 | 52% |
| apc.botM 3.0 | 36 | 92% |
| lxx.ConceptA 0.8 | 27 | 93% |
| bayen.UbaMicro 1.4 | 13 | 85% |
| yk.JahMicro 1.0 | 8 | 100% |
| vjik.UnViolation 1.1 | 5 | 100% |
| panzer.Panzer 0.2 | 4 | 100% |
| donjezza.Jezza 1.0 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 759. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.sbf.FloodHT 0.9.2 | 44 | 54% | 93 |
| apc.botM 3.0 | 12 | 15% | 37 |
| lxx.ConceptA 0.8 | 11 | 13% | 24 |
| bayen.UbaMicro 1.4 | 6 | 7% | 17 |
| conscience.Electron 1.3g | 4 | 5% | 6 |
| panzer.Panzer 0.2 | 3 | 4% | 7 |
| vjik.UnViolation 1.1 | 1 | 1% | 17 |
| yk.JahMicro 1.0 | 1 | 1% | 6 |
| donjezza.Jezza 1.0 | 0 | 0% | 3 |

## Melee bench: F33

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 3 over 6 battles (0.5 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.7 | 88.0 | 129 / 210 | 2.08 | 19.5% | 31313 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.5% | 129 |
| maribo.Quester 0.3 | 2.0 | 15.4% | 28 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 3.3 | 12.1% | 16 |
| gre.svman4.Leonidas 1.3.2 | 4.0 | 11.3% | 14 |
| labg.Cataclysm 2.05 | 4.7 | 10.7% | 18 |
| baal.nano.N 1.42 | 6.0 | 8.8% | 2 |
| kinsen.melee.Angsaichmophobia 1.8c | 7.0 | 8.0% | 2 |
| zyx.micro.Ant 1.1 | 8.0 | 6.4% | 1 |
| sanja.First 0.1 | 9.2 | 4.4% | 0 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 9.8 | 3.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.3 | 88.3 | 23 / 35 | 5382 |
| 2 | 1 | 69.8 | 87.9 | 20 / 35 | 5376 |
| 3 | 1 | 68.7 | 86.3 | 21 / 35 | 4769 |
| 4 | 1 | 67.6 | 82.5 | 18 / 35 | 4849 |
| 5 | 1 | 69.2 | 86.7 | 21 / 35 | 5189 |
| 6 | 1 | 72.3 | 96.2 | 26 / 35 | 5748 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| maribo.Quester 0.3 | 59 | 83% |
| sheldor.melee.nano.NaturalScience 1.2.1 | 40 | 85% |
| gre.svman4.Leonidas 1.3.2 | 29 | 86% |
| labg.Cataclysm 2.05 | 18 | 67% |
| kinsen.melee.Angsaichmophobia 1.8c | 6 | 83% |
| baal.nano.N 1.42 | 2 | 100% |
| zyx.micro.Ant 1.1 | 2 | 100% |

Hadur died in 82 of 210 rounds, at a mean tick of 867. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| maribo.Quester 0.3 | 27 | 33% | 75 |
| gre.svman4.Leonidas 1.3.2 | 15 | 18% | 35 |
| sheldor.melee.nano.NaturalScience 1.2.1 | 12 | 15% | 43 |
| labg.Cataclysm 2.05 | 11 | 13% | 23 |
| zyx.micro.Ant 1.1 | 6 | 7% | 9 |
| kinsen.melee.Angsaichmophobia 1.8c | 4 | 5% | 12 |
| baal.nano.N 1.42 | 3 | 4% | 5 |
| com.blogspot.malinkody.DestrobotMalin 1.0 | 3 | 4% | 3 |
| sanja.First 0.1 | 1 | 1% | 3 |

## Melee bench: F34

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.1 | 87.7 | 101 / 210 | 2.11 | 18.5% | 30641 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.5% | 101 |
| stelo.Spread 0.9 | 2.2 | 16.6% | 60 |
| kid.Gladiator .7.2 | 2.7 | 15.9% | 33 |
| tcf.Reach 3 | 4.5 | 10.8% | 2 |
| jcs.Seth 1.8 | 4.5 | 10.9% | 15 |
| cli.Dancer 1.1 | 6.0 | 9.2% | 0 |
| ratosh.Wesco 1.4 | 7.0 | 7.1% | 0 |
| amk.Punbot.Punbot 0.01 | 8.0 | 4.8% | 0 |
| sample.VelociRobot 1.0 | 9.0 | 3.6% | 0 |
| sample.RamFire 1.0 | 10.0 | 2.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 67.6 | 83.5 | 13 / 35 | 4844 |
| 2 | 1 | 70.1 | 89.8 | 17 / 35 | 5467 |
| 3 | 1 | 68.9 | 87.3 | 18 / 35 | 4870 |
| 4 | 1 | 69.6 | 89.5 | 18 / 35 | 5003 |
| 5 | 1 | 71.6 | 94.6 | 24 / 35 | 5599 |
| 6 | 1 | 66.6 | 81.3 | 11 / 35 | 4858 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Spread 0.9 | 97 | 61% |
| kid.Gladiator .7.2 | 36 | 67% |
| jcs.Seth 1.8 | 10 | 80% |
| tcf.Reach 3 | 7 | 86% |
| cli.Dancer 1.1 | 2 | 100% |
| ratosh.Wesco 1.4 | 1 | 100% |
| amk.Punbot.Punbot 0.01 | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 990. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Spread 0.9 | 55 | 50% | 110 |
| kid.Gladiator .7.2 | 31 | 28% | 55 |
| tcf.Reach 3 | 10 | 9% | 18 |
| jcs.Seth 1.8 | 8 | 7% | 18 |
| ratosh.Wesco 1.4 | 2 | 2% | 3 |
| cli.Dancer 1.1 | 1 | 1% | 2 |
| amk.Punbot.Punbot 0.01 | 1 | 1% | 2 |
| sample.VelociRobot 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F35

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.3 | 83.4 | 51 / 210 | 2.49 | 16.2% | 22768 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| cz.libors.Ogi v1 | 1.0 | 19.5% | 131 |
| kc.mini.Mirage 0.2 | 2.0 | 16.2% | 51 |
| gh.mini.Gruwel 0.9 | 3.8 | 12.5% | 18 |
| dmh.robocode.robot.BlackDeath 9.2 | 3.8 | 11.8% | 9 |
| rz.HawkOnFire 0.1 | 4.3 | 11.4% | 2 |
| wit.Chuliath 1.0 | 6.5 | 6.6% | 0 |
| myl.nano.KomoriNinja 1.1 | 6.8 | 6.4% | 0 |
| dans.Cinnamon 1.2 | 8.2 | 5.5% | 0 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 8.7 | 5.4% | 0 |
| stelo.MyAgileRobot 0.2 | 9.8 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 78.1 | 3 / 35 | 4038 |
| 2 | 2 | 67.6 | 89.5 | 12 / 35 | 3982 |
| 3 | 2 | 65.8 | 84.4 | 12 / 35 | 3709 |
| 4 | 2 | 64.7 | 82.9 | 6 / 35 | 3725 |
| 5 | 2 | 63.5 | 78.1 | 7 / 35 | 3446 |
| 6 | 2 | 66.7 | 87.6 | 11 / 35 | 3868 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| cz.libors.Ogi v1 | 97 | 15% |
| gh.mini.Gruwel 0.9 | 23 | 61% |
| rz.HawkOnFire 0.1 | 15 | 93% |
| dmh.robocode.robot.BlackDeath 9.2 | 8 | 75% |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 1 | 100% |
| myl.nano.KomoriNinja 1.1 | 1 | 100% |

Hadur died in 159 of 210 rounds, at a mean tick of 869. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| cz.libors.Ogi v1 | 106 | 67% | 118 |
| gh.mini.Gruwel 0.9 | 26 | 16% | 40 |
| dmh.robocode.robot.BlackDeath 9.2 | 11 | 7% | 19 |
| rz.HawkOnFire 0.1 | 8 | 5% | 20 |
| amk.ShizzleStiX.ShizzleStiX 0.6 | 5 | 3% | 7 |
| wit.Chuliath 1.0 | 2 | 1% | 2 |
| dans.Cinnamon 1.2 | 1 | 1% | 1 |
| stelo.MyAgileRobot 0.2 | 0 | 0% | 1 |
| myl.nano.KomoriNinja 1.1 | 0 | 0% | 1 |

## Melee bench: F36

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 1 over 6 battles (0.2 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 72.4 | 96.5 | 183 / 210 | 1.32 | 22.1% | 35220 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 22.1% | 183 |
| bzdp.Pansy 2.1 | 2.0 | 12.6% | 9 |
| alpha.RainingFire 1.0 | 4.0 | 10.5% | 2 |
| bvh.micro.Freya 0.3 | 4.5 | 10.1% | 4 |
| mz.Cork 0.1 | 5.0 | 9.9% | 4 |
| m3thos.Eva02 0.7.1 | 5.5 | 9.5% | 2 |
| bvh.mini.Fenrir 0.39 | 6.0 | 9.2% | 3 |
| squidM.TentalceMeleeNano 1.1 | 8.0 | 6.4% | 0 |
| dl.BetterWalls 1.0 | 9.2 | 5.2% | 1 |
| sample.MyFirstRobot 1.0 | 9.8 | 4.4% | 2 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 72.8 | 97.5 | 30 / 35 | 5894 |
| 2 | 1 | 72.2 | 95.9 | 29 / 35 | 6064 |
| 3 | 1 | 71.9 | 95.6 | 31 / 35 | 5524 |
| 4 | 1 | 72.3 | 96.2 | 30 / 35 | 5978 |
| 5 | 1 | 72.4 | 95.9 | 32 / 35 | 5745 |
| 6 | 1 | 72.8 | 97.8 | 31 / 35 | 6015 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| bzdp.Pansy 2.1 | 68 | 90% |
| bvh.micro.Freya 0.3 | 36 | 100% |
| mz.Cork 0.1 | 27 | 96% |
| bvh.mini.Fenrir 0.39 | 20 | 95% |
| alpha.RainingFire 1.0 | 20 | 95% |
| m3thos.Eva02 0.7.1 | 15 | 93% |
| sample.MyFirstRobot 1.0 | 8 | 75% |
| squidM.TentalceMeleeNano 1.1 | 2 | 100% |
| dl.BetterWalls 1.0 | 1 | 0% |

Hadur died in 27 of 210 rounds, at a mean tick of 916. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| bzdp.Pansy 2.1 | 9 | 33% | 75 |
| alpha.RainingFire 1.0 | 4 | 15% | 28 |
| bvh.micro.Freya 0.3 | 3 | 11% | 22 |
| m3thos.Eva02 0.7.1 | 3 | 11% | 20 |
| bvh.mini.Fenrir 0.39 | 3 | 11% | 17 |
| mz.Cork 0.1 | 2 | 7% | 26 |
| sample.MyFirstRobot 1.0 | 2 | 7% | 8 |
| dl.BetterWalls 1.0 | 1 | 4% | 10 |
| squidM.TentalceMeleeNano 1.1 | 0 | 0% | 3 |

## Melee bench: F37

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.0 | 93.7 | 178 / 210 | 1.57 | 20.5% | 34647 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 178 |
| germ.TheMind .2 | 3.0 | 10.6% | 6 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3.7 | 10.1% | 4 |
| EBBU.Sim2 1.02 | 3.8 | 10.0% | 4 |
| stelo.UntouchableNano 1.3 | 5.5 | 9.0% | 9 |
| agrach.Dalek 1.0 | 6.2 | 8.9% | 5 |
| mb.Beast 0.1 | 6.3 | 8.4% | 2 |
| lmk.ACPFinal 0.1 | 7.7 | 8.1% | 1 |
| skm.Ryubot 1.0 | 8.8 | 7.2% | 1 |
| mn.nano.perceptual.Impact 1.3.0 | 9.0 | 7.3% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.9 | 30 / 35 | 6064 |
| 2 | 1 | 71.8 | 99.0 | 32 / 35 | 6116 |
| 3 | 1 | 69.8 | 92.1 | 31 / 35 | 5767 |
| 4 | 1 | 69.7 | 94.0 | 29 / 35 | 5711 |
| 5 | 1 | 67.6 | 87.6 | 26 / 35 | 5069 |
| 6 | 1 | 70.5 | 94.6 | 30 / 35 | 5920 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| germ.TheMind .2 | 38 | 95% |
| EBBU.Sim2 1.02 | 34 | 91% |
| stelo.UntouchableNano 1.3 | 32 | 88% |
| com.syncleus.robocode.Dreadnaught 0.1 | 21 | 95% |
| mb.Beast 0.1 | 20 | 100% |
| lmk.ACPFinal 0.1 | 16 | 100% |
| skm.Ryubot 1.0 | 14 | 100% |
| agrach.Dalek 1.0 | 13 | 92% |
| mn.nano.perceptual.Impact 1.3.0 | 1 | 100% |

Hadur died in 32 of 210 rounds, at a mean tick of 446. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.UntouchableNano 1.3 | 6 | 19% | 26 |
| germ.TheMind .2 | 5 | 16% | 32 |
| agrach.Dalek 1.0 | 5 | 16% | 25 |
| mb.Beast 0.1 | 4 | 13% | 25 |
| com.syncleus.robocode.Dreadnaught 0.1 | 3 | 9% | 36 |
| EBBU.Sim2 1.02 | 3 | 9% | 29 |
| mn.nano.perceptual.Impact 1.3.0 | 3 | 9% | 6 |
| skm.Ryubot 1.0 | 2 | 6% | 6 |
| lmk.ACPFinal 0.1 | 1 | 3% | 23 |

## Melee bench: F38

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 67.0 | 85.2 | 100 / 210 | 2.33 | 17.6% | 26838 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 17.6% | 100 |
| justin.Mallais 14.0 | 2.0 | 15.4% | 54 |
| bvh.mini.Freya 0.55 | 3.0 | 13.3% | 21 |
| bts.mega.Gnarly 1.4 | 4.3 | 11.2% | 20 |
| davidalves.net.DuelistNanoMelee 1.01 | 5.2 | 9.8% | 4 |
| cs.Wren 1.0 | 5.5 | 9.7% | 7 |
| kdf.KoulDestroyer 1.0 | 7.0 | 8.3% | 2 |
| kawigi.spare.SpareParts 0.7.6nosnd | 8.0 | 6.6% | 1 |
| matt.UnderDark3 2.4.34 | 9.3 | 4.3% | 1 |
| bzdp.BoxCar 2.0 | 9.7 | 3.9% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 66.8 | 83.8 | 17 / 35 | 4475 |
| 2 | 1 | 66.2 | 82.2 | 16 / 35 | 4127 |
| 3 | 1 | 67.5 | 86.7 | 17 / 35 | 4677 |
| 4 | 1 | 67.7 | 87.6 | 17 / 35 | 4710 |
| 5 | 1 | 66.5 | 84.1 | 16 / 35 | 4305 |
| 6 | 1 | 67.5 | 86.7 | 17 / 35 | 4544 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| justin.Mallais 14.0 | 59 | 63% |
| bvh.mini.Freya 0.55 | 27 | 74% |
| bts.mega.Gnarly 1.4 | 25 | 76% |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 91% |
| cs.Wren 1.0 | 10 | 90% |
| kdf.KoulDestroyer 1.0 | 4 | 75% |
| matt.UnderDark3 2.4.34 | 2 | 50% |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 100% |

Hadur died in 110 of 210 rounds, at a mean tick of 767. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| justin.Mallais 14.0 | 44 | 40% | 82 |
| bts.mega.Gnarly 1.4 | 20 | 18% | 43 |
| bvh.mini.Freya 0.55 | 20 | 18% | 32 |
| cs.Wren 1.0 | 11 | 10% | 22 |
| davidalves.net.DuelistNanoMelee 1.01 | 11 | 10% | 20 |
| kdf.KoulDestroyer 1.0 | 1 | 1% | 4 |
| kawigi.spare.SpareParts 0.7.6nosnd | 1 | 1% | 3 |
| bzdp.BoxCar 2.0 | 1 | 1% | 2 |
| matt.UnderDark3 2.4.34 | 1 | 1% | 2 |

## Melee bench: F39

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 4 over 6 battles (0.7 per battle, most in one battle 2). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.8 | 89.9 | 116 / 210 | 1.91 | 19.2% | 31846 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.2% | 116 |
| bvh.fry.Freya 0.82 | 2.0 | 14.1% | 19 |
| az.Ololobot 0.2.4 | 3.2 | 12.6% | 45 |
| catcat20.Lambda 0.024 | 3.8 | 11.2% | 23 |
| gimp.GimpBot 0.1 | 6.0 | 7.8% | 1 |
| stelo.SoRobotNanoMelee 1.2 | 6.3 | 8.1% | 4 |
| apollokidd.ApolloKidd 0.9 | 6.8 | 7.8% | 1 |
| winamp32.micro.MicroMacro 1.0 | 7.3 | 7.4% | 0 |
| whitesquare.robots.SkynetAdvanced 1.1 | 8.7 | 6.3% | 0 |
| dcs.Eater_of_Worlds 1.1.3-A | 9.8 | 5.5% | 1 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.1 | 88.3 | 18 / 35 | 5032 |
| 2 | 1 | 70.0 | 92.7 | 22 / 35 | 5647 |
| 3 | 1 | 70.4 | 93.7 | 22 / 35 | 5893 |
| 4 | 1 | 68.3 | 87.3 | 19 / 35 | 5205 |
| 5 | 1 | 68.2 | 90.2 | 20 / 35 | 4896 |
| 6 | 1 | 67.7 | 87.3 | 15 / 35 | 5173 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| az.Ololobot 0.2.4 | 58 | 52% |
| catcat20.Lambda 0.024 | 41 | 73% |
| bvh.fry.Freya 0.82 | 38 | 82% |
| stelo.SoRobotNanoMelee 1.2 | 13 | 92% |
| gimp.GimpBot 0.1 | 5 | 100% |
| apollokidd.ApolloKidd 0.9 | 4 | 100% |
| winamp32.micro.MicroMacro 1.0 | 4 | 100% |

Hadur died in 95 of 210 rounds, at a mean tick of 1149. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| az.Ololobot 0.2.4 | 36 | 38% | 73 |
| bvh.fry.Freya 0.82 | 27 | 28% | 62 |
| catcat20.Lambda 0.024 | 20 | 21% | 43 |
| stelo.SoRobotNanoMelee 1.2 | 9 | 9% | 14 |
| apollokidd.ApolloKidd 0.9 | 2 | 2% | 6 |
| gimp.GimpBot 0.1 | 1 | 1% | 5 |
| whitesquare.robots.SkynetAdvanced 1.1 | 0 | 0% | 3 |
| winamp32.micro.MicroMacro 1.0 | 0 | 0% | 3 |
| dcs.Eater_of_Worlds 1.1.3-A | 0 | 0% | 1 |

## Melee bench: F40

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.9 | 87.5 | 130 / 210 | 2.13 | 19.0% | 29075 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.0% | 130 |
| kawigi.mini.Coriantumr 1.1 | 2.0 | 14.7% | 42 |
| kano.gamma.KanoGamma 1.8 | 3.7 | 11.8% | 13 |
| Polkwane.SmashMelee 1.0 | 4.0 | 11.1% | 11 |
| mz.AntiGrav 1.0 | 4.8 | 10.2% | 7 |
| alpha.BlackIce 1.0 | 5.8 | 9.3% | 5 |
| stelo.Randomness 1.0 | 6.7 | 8.6% | 2 |
| amk.superstrike.SuperStrike 0.3 | 8.2 | 6.3% | 0 |
| testantiswapgun.AntiSwap 1.0 | 8.8 | 5.1% | 0 |
| sample.Corners 1.0 | 10.0 | 4.0% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 68.6 | 86.7 | 22 / 35 | 4556 |
| 2 | 1 | 68.2 | 86.7 | 20 / 35 | 4783 |
| 3 | 1 | 69.2 | 87.6 | 22 / 35 | 5024 |
| 4 | 1 | 70.0 | 91.4 | 25 / 35 | 4789 |
| 5 | 1 | 68.5 | 86.7 | 21 / 35 | 4831 |
| 6 | 1 | 68.6 | 85.7 | 20 / 35 | 5092 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 71 | 70% |
| kano.gamma.KanoGamma 1.8 | 30 | 87% |
| Polkwane.SmashMelee 1.0 | 20 | 85% |
| mz.AntiGrav 1.0 | 20 | 100% |
| stelo.Randomness 1.0 | 10 | 80% |
| alpha.BlackIce 1.0 | 5 | 80% |
| amk.superstrike.SuperStrike 0.3 | 4 | 100% |
| testantiswapgun.AntiSwap 1.0 | 1 | 100% |

Hadur died in 80 of 210 rounds, at a mean tick of 760. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| kawigi.mini.Coriantumr 1.1 | 36 | 45% | 65 |
| Polkwane.SmashMelee 1.0 | 13 | 16% | 28 |
| kano.gamma.KanoGamma 1.8 | 10 | 13% | 43 |
| alpha.BlackIce 1.0 | 9 | 11% | 11 |
| mz.AntiGrav 1.0 | 5 | 6% | 22 |
| stelo.Randomness 1.0 | 4 | 5% | 23 |
| amk.superstrike.SuperStrike 0.3 | 3 | 4% | 9 |
| testantiswapgun.AntiSwap 1.0 | 0 | 0% | 5 |
| sample.Corners 1.0 | 0 | 0% | 4 |

## Melee bench: F41

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 68.3 | 88.0 | 109 / 210 | 2.08 | 18.3% | 26801 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.2 | 18.3% | 109 |
| eem.EvBotNG v12.8 | 1.8 | 16.1% | 71 |
| ary.Swarm 1.1 | 3.5 | 12.7% | 11 |
| lessonz.robocode.Oz 0.5.0 | 3.5 | 12.3% | 10 |
| simonton.nano.MeleeSeed 1.8 | 5.2 | 10.3% | 5 |
| shrub.Silver v048 | 5.8 | 9.1% | 0 |
| zyx.nano.Ant 1.1 | 7.0 | 7.3% | 0 |
| stelo.Mirror 1.1 | 8.3 | 5.7% | 1 |
| jsal.Jsalbot 1.0 | 8.7 | 5.5% | 3 |
| acogdev.alpha 0.2 | 10.0 | 2.5% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 69.8 | 93.3 | 21 / 35 | 4611 |
| 2 | 2 | 66.7 | 82.9 | 16 / 35 | 4178 |
| 3 | 1 | 70.4 | 94.9 | 22 / 35 | 4825 |
| 4 | 1 | 67.4 | 85.1 | 14 / 35 | 4283 |
| 5 | 1 | 68.7 | 88.6 | 19 / 35 | 4659 |
| 6 | 1 | 66.9 | 83.5 | 17 / 35 | 4245 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.EvBotNG v12.8 | 71 | 45% |
| ary.Swarm 1.1 | 32 | 91% |
| lessonz.robocode.Oz 0.5.0 | 28 | 86% |
| simonton.nano.MeleeSeed 1.8 | 19 | 84% |
| jsal.Jsalbot 1.0 | 6 | 83% |
| stelo.Mirror 1.1 | 2 | 50% |
| shrub.Silver v048 | 2 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 920. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.EvBotNG v12.8 | 60 | 59% | 90 |
| lessonz.robocode.Oz 0.5.0 | 12 | 12% | 29 |
| ary.Swarm 1.1 | 9 | 9% | 35 |
| simonton.nano.MeleeSeed 1.8 | 8 | 8% | 29 |
| shrub.Silver v048 | 6 | 6% | 9 |
| jsal.Jsalbot 1.0 | 3 | 3% | 8 |
| stelo.Mirror 1.1 | 3 | 3% | 6 |
| zyx.nano.Ant 1.1 | 0 | 0% | 3 |
| acogdev.alpha 0.2 | 0 | 0% | 1 |

## Melee bench: F42

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 69.9 | 91.0 | 132 / 210 | 1.81 | 19.7% | 32723 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 19.7% | 132 |
| wompi.Wallaby 5.1 | 2.5 | 14.3% | 21 |
| ara.Shera 0.88 | 3.0 | 13.6% | 35 |
| maribo.mini.MiniQuester 0.1 | 3.5 | 13.1% | 19 |
| amz.NanoClone 1.41 | 5.3 | 8.8% | 2 |
| maribo.IotaCT 1.1 | 6.0 | 8.0% | 1 |
| dsw.StaticD 1.0 | 7.2 | 6.8% | 0 |
| stelo.MirrorMicro 1.0 | 7.7 | 6.2% | 0 |
| mme.NikeEnhanced 2.0 | 9.2 | 4.8% | 0 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 9.7 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 70.6 | 94.3 | 23 / 35 | 5560 |
| 2 | 1 | 70.7 | 93.0 | 23 / 35 | 5639 |
| 3 | 1 | 70.5 | 92.4 | 24 / 35 | 5575 |
| 4 | 1 | 67.9 | 86.7 | 18 / 35 | 4910 |
| 5 | 1 | 70.3 | 91.7 | 25 / 35 | 5306 |
| 6 | 1 | 69.6 | 87.9 | 19 / 35 | 5733 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| ara.Shera 0.88 | 59 | 68% |
| maribo.mini.MiniQuester 0.1 | 52 | 85% |
| wompi.Wallaby 5.1 | 48 | 85% |
| dsw.StaticD 1.0 | 5 | 100% |
| stelo.MirrorMicro 1.0 | 1 | 100% |
| maribo.IotaCT 1.1 | 1 | 100% |

Hadur died in 78 of 210 rounds, at a mean tick of 901. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| ara.Shera 0.88 | 28 | 36% | 62 |
| wompi.Wallaby 5.1 | 26 | 33% | 70 |
| maribo.mini.MiniQuester 0.1 | 15 | 19% | 54 |
| amz.NanoClone 1.41 | 4 | 5% | 5 |
| stelo.MirrorMicro 1.0 | 2 | 3% | 2 |
| dsw.StaticD 1.0 | 1 | 1% | 9 |
| mme.NikeEnhanced 2.0 | 1 | 1% | 3 |
| de.simpleworks.robocode.bots.swiBot 1.1 | 1 | 1% | 2 |
| maribo.IotaCT 1.1 | 0 | 0% | 3 |

## Melee bench: F43

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.0 | 79.0 | 35 / 210 | 2.89 | 15.3% | 22541 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 1.0 | 21.0% | 148 |
| kc.mini.Mirage 0.2 | 2.0 | 15.3% | 35 |
| brainfade.melee.Dusk 0.44 | 3.7 | 12.3% | 17 |
| dummy.micro.Sparrow 2.5 | 3.8 | 11.8% | 3 |
| wcsv.melee.EngineerMelee 0.1 | 4.7 | 10.8% | 7 |
| Krabb.akim2.Akim2 1.1b | 5.8 | 9.3% | 1 |
| jab.DiamondStealer 5 | 7.2 | 7.7% | 0 |
| mz.NanoGod 2.02 | 7.8 | 7.0% | 0 |
| cvt.Firsty 1.0 | 9.0 | 4.1% | 0 |
| sample.SittingDuck 1.0 | 10.0 | 0.6% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 63.7 | 76.2 | 3 / 35 | 3633 |
| 2 | 2 | 65.3 | 79.0 | 7 / 35 | 3756 |
| 3 | 2 | 65.1 | 79.0 | 7 / 35 | 3678 |
| 4 | 2 | 64.6 | 77.8 | 5 / 35 | 3776 |
| 5 | 2 | 64.9 | 77.8 | 8 / 35 | 3813 |
| 6 | 2 | 66.5 | 84.4 | 5 / 35 | 3885 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| jk.melee.Neuromancer 7.12 | 95 | 16% |
| brainfade.melee.Dusk 0.44 | 15 | 60% |
| dummy.micro.Sparrow 2.5 | 7 | 100% |
| jab.DiamondStealer 5 | 2 | 100% |
| cvt.Firsty 1.0 | 1 | 100% |
| Krabb.akim2.Akim2 1.1b | 1 | 100% |

Hadur died in 177 of 210 rounds, at a mean tick of 947. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| jk.melee.Neuromancer 7.12 | 110 | 62% | 127 |
| brainfade.melee.Dusk 0.44 | 29 | 16% | 36 |
| dummy.micro.Sparrow 2.5 | 18 | 10% | 22 |
| wcsv.melee.EngineerMelee 0.1 | 11 | 6% | 13 |
| Krabb.akim2.Akim2 1.1b | 3 | 2% | 5 |
| mz.NanoGod 2.02 | 3 | 2% | 3 |
| jab.DiamondStealer 5 | 1 | 1% | 3 |
| cvt.Firsty 1.0 | 1 | 1% | 1 |
1 death(s) with no robot to name.

## Melee bench: F44

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.3 | 90.7 | 133 / 210 | 1.84 | 20.1% | 33468 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.1% | 133 |
| stelo.Liblix 0.3.1 | 2.0 | 15.2% | 44 |
| tzu.TheArtOfWar 1.2 | 3.0 | 13.8% | 22 |
| wompi.Quokka 1.6 | 4.5 | 9.7% | 4 |
| jwirde.Gort 2.0 | 5.0 | 9.0% | 3 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 5.5 | 8.5% | 2 |
| disan.Chair 2.2.0 | 7.3 | 7.2% | 0 |
| stf.PanzerGeneral 0.1 | 7.7 | 7.1% | 2 |
| amk.jointstrike.JointStrike 0.2 | 9.5 | 4.6% | 0 |
| sample.Crazy 1.0 | 9.5 | 4.7% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.5 | 94.3 | 26 / 35 | 5731 |
| 2 | 1 | 68.6 | 86.3 | 19 / 35 | 5254 |
| 3 | 1 | 69.4 | 86.7 | 22 / 35 | 5396 |
| 4 | 1 | 72.0 | 95.2 | 25 / 35 | 5855 |
| 5 | 1 | 70.2 | 90.2 | 18 / 35 | 5815 |
| 6 | 1 | 70.2 | 91.4 | 23 / 35 | 5417 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| stelo.Liblix 0.3.1 | 95 | 74% |
| tzu.TheArtOfWar 1.2 | 52 | 75% |
| jwirde.Gort 2.0 | 8 | 75% |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 83% |
| wompi.Quokka 1.6 | 5 | 100% |
| disan.Chair 2.2.0 | 4 | 100% |
| sample.Crazy 1.0 | 3 | 100% |
| stf.PanzerGeneral 0.1 | 1 | 100% |

Hadur died in 77 of 210 rounds, at a mean tick of 862. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| stelo.Liblix 0.3.1 | 36 | 47% | 105 |
| tzu.TheArtOfWar 1.2 | 20 | 26% | 59 |
| wompi.Quokka 1.6 | 6 | 8% | 13 |
| ICS4U1.Patrick_White_Schrodinger 1.1 | 6 | 8% | 9 |
| jwirde.Gort 2.0 | 3 | 4% | 12 |
| stf.PanzerGeneral 0.1 | 3 | 4% | 4 |
| amk.jointstrike.JointStrike 0.2 | 1 | 1% | 3 |
| sample.Crazy 1.0 | 1 | 1% | 3 |
| disan.Chair 2.2.0 | 1 | 1% | 2 |

## Melee bench: F45

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, 6 other Robocode JVMs running (hadur.bench.MeleeRunner x6), parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 0 over 6 battles (0.0 per battle, most in one battle 0). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 70.4 | 90.1 | 110 / 210 | 1.89 | 20.5% | 36593 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| kc.mini.Mirage 0.2 | 1.0 | 20.5% | 110 |
| eem.IWillFireNoBullet v2.8 | 2.2 | 12.5% | 80 |
| jje.BagPuss 1.2 | 3.0 | 11.4% | 3 |
| myl.nano.Graviton 1.10 | 4.5 | 10.0% | 4 |
| sul.Lunar 1.1 | 4.7 | 10.1% | 7 |
| fm.claire 1.7 | 6.3 | 8.7% | 0 |
| hvilela.HVilela 0.9 | 7.2 | 8.0% | 0 |
| pez.mini.ChironexFleckeri 0.5 | 7.5 | 7.7% | 4 |
| wit.Deep7 2.0 | 8.7 | 6.2% | 3 |
| abud.ThirdRobo 1.0 | 10.0 | 4.8% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 1 | 71.1 | 92.1 | 21 / 35 | 6060 |
| 2 | 1 | 69.0 | 88.6 | 17 / 35 | 5570 |
| 3 | 1 | 71.3 | 91.4 | 21 / 35 | 6414 |
| 4 | 1 | 71.0 | 92.4 | 21 / 35 | 6130 |
| 5 | 1 | 70.9 | 90.5 | 16 / 35 | 6567 |
| 6 | 1 | 69.0 | 85.7 | 14 / 35 | 5852 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| eem.IWillFireNoBullet v2.8 | 101 | 46% |
| sul.Lunar 1.1 | 15 | 93% |
| pez.mini.ChironexFleckeri 0.5 | 15 | 80% |
| jje.BagPuss 1.2 | 14 | 93% |
| myl.nano.Graviton 1.10 | 14 | 86% |
| wit.Deep7 2.0 | 6 | 100% |
| fm.claire 1.7 | 4 | 100% |
| hvilela.HVilela 0.9 | 2 | 100% |
| abud.ThirdRobo 1.0 | 1 | 100% |

Hadur died in 101 of 210 rounds, at a mean tick of 1804. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| eem.IWillFireNoBullet v2.8 | 58 | 57% | 0 |
| jje.BagPuss 1.2 | 11 | 11% | 61 |
| pez.mini.ChironexFleckeri 0.5 | 8 | 8% | 29 |
| sul.Lunar 1.1 | 6 | 6% | 51 |
| myl.nano.Graviton 1.10 | 5 | 5% | 21 |
| wit.Deep7 2.0 | 5 | 5% | 14 |
| fm.claire 1.7 | 4 | 4% | 14 |
| hvilela.HVilela 0.9 | 2 | 2% | 10 |
| abud.ThirdRobo 1.0 | 1 | 1% | 7 |
1 death(s) with no robot to name.

## Melee bench: F46

kc.mini.Mirage 0.2 against 9 opponents at once, 35 rounds per battle, 6 battles, 1000x1000.

robocode.cpu.constant=1488498 (pinned with --cpu-constant). Host: AMD Ryzen Threadripper PRO 9965WX 24-Cores, 48 logical cores, Windows 11 10.0, no other Robocode JVMs running, parallel 6. Battle JVM flags: -XX:ActiveProcessorCount=2 -Xmx2G.

Skipped turns: 2 over 6 battles (0.3 per battle, most in one battle 1). Issue #102 trusts a parallel run when the mean stays near the sequential run's.

| APS | Survival | Rounds won | Mean round place | Score share | Bullet damage |
|---|---|---|---|---|---|
| 65.8 | 82.6 | 48 / 210 | 2.56 | 16.4% | 27044 |

| Robot | Mean place | Mean score share | Firsts |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 1.3 | 17.4% | 96 |
| kc.mini.Mirage 0.2 | 2.2 | 16.4% | 48 |
| hadur117.mini.Deise 0.3 | 2.5 | 15.9% | 54 |
| mz.MicroSheep 1.0 | 4.5 | 10.5% | 2 |
| cx.Princess 1.0 | 5.0 | 10.1% | 9 |
| sadoner.killer 0.2 | 5.5 | 8.9% | 0 |
| arthord.NanoSatanMelee Beta | 7.2 | 7.1% | 1 |
| jeremyreeder.collective.Prophet 5 | 8.0 | 5.8% | 0 |
| kurios.DOSexe .9a | 8.8 | 4.8% | 0 |
| mbro.Detektor3 0.1.1 | 10.0 | 3.1% | 0 |

Hadur per battle:

| Battle | Place | APS | Survival | Rounds won | Bullet damage |
|---|---|---|---|---|---|
| 1 | 2 | 65.5 | 82.2 | 8 / 35 | 4383 |
| 2 | 2 | 65.6 | 81.9 | 9 / 35 | 4342 |
| 3 | 3 | 64.5 | 79.4 | 5 / 35 | 4388 |
| 4 | 2 | 66.3 | 83.2 | 8 / 35 | 4624 |
| 5 | 3 | 66.0 | 82.9 | 10 / 35 | 4494 |
| 6 | 1 | 67.1 | 86.3 | 8 / 35 | 4813 |

Rounds that ended as a duel (Hadur and one other left):

| Last opponent | Rounds | Hadur won |
|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 69 | 22% |
| hadur117.mini.Deise 0.3 | 44 | 39% |
| mz.MicroSheep 1.0 | 13 | 85% |
| cx.Princess 1.0 | 10 | 40% |
| arthord.NanoSatanMelee Beta | 1 | 100% |

Hadur died in 162 of 210 rounds, at a mean tick of 953. Killer: the owner of the bullet that last hit Hadur if it landed on the death turn or the one before, else the nearest fighter still alive (a rammer).

| Robot | Killed Hadur | Share of deaths | Last to hit Hadur (any round) |
|---|---|---|---|
| rsalesc.melee.Medina 0.4.5 | 78 | 48% | 95 |
| hadur117.mini.Deise 0.3 | 53 | 33% | 71 |
| cx.Princess 1.0 | 11 | 7% | 13 |
| mz.MicroSheep 1.0 | 10 | 6% | 17 |
| arthord.NanoSatanMelee Beta | 4 | 2% | 6 |
| sadoner.killer 0.2 | 4 | 2% | 5 |
| jeremyreeder.collective.Prophet 5 | 2 | 1% | 2 |

